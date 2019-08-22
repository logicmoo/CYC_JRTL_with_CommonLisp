/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.folification;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.keyhash;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TPTP-PROBLEM-GENERATOR
 *  source file: /cyc/top/cycl/inference/tptp-problem-generator.lisp
 *  created:     2019/07/03 17:38:28
 */
public final class tptp_problem_generator extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tptp_problem_generator() {
    }

    public static final SubLFile me = new tptp_problem_generator();

    public static final String myName = "com.cyc.cycjava.cycl.inference.tptp_problem_generator";

    // // Definitions
    // defparameter
    private static final SubLSymbol $tptp_problem_version_string$ = makeSymbol("*TPTP-PROBLEM-VERSION-STRING*");

    /**
     * How much relevant chaff to include in the problem set.  Adjust this between 0 and
     * a number of assertions that makes up some reasonable percentage of the KB (maybe 2%?).
     */
    // defparameter
    private static final SubLSymbol $tptp_relevant_chaff_count$ = makeSymbol("*TPTP-RELEVANT-CHAFF-COUNT*");

    /**
     * How much of the KB to include in the problem set.  Adjust this between 0 and 1, inclusive,
     * to change the number of unnecessary axioms in the problem set.
     */
    // defparameter
    private static final SubLSymbol $tptp_total_chaff_ratio$ = makeSymbol("*TPTP-TOTAL-CHAFF-RATIO*");

    /**
     * If non-nil, will force all static (non-linchpin) queries to be answerable.
     */
    // defparameter
    private static final SubLSymbol $tptp_force_all_answerableP$ = makeSymbol("*TPTP-FORCE-ALL-ANSWERABLE?*");

    /**
     * The properties to pass down to the FOLification engine.
     */
    // defparameter
    private static final SubLSymbol $tptp_folification_properties$ = makeSymbol("*TPTP-FOLIFICATION-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $tptp_output_base_directory$ = makeSymbol("*TPTP-OUTPUT-BASE-DIRECTORY*");

    /**
     * If non-nil, it will use this directory instead of creating a timestamp subdirectory under *tptp-output-base-directory*.
     */
    // defparameter
    private static final SubLSymbol $tptp_explicit_directory$ = makeSymbol("*TPTP-EXPLICIT-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $tptp_axioms_subdirectory$ = makeSymbol("*TPTP-AXIOMS-SUBDIRECTORY*");

    /**
     * Common Sense Reasoning
     */
    // deflexical
    private static final SubLSymbol $tptp_domain_prefix$ = makeSymbol("*TPTP-DOMAIN-PREFIX*");

    // defparameter
    private static final SubLSymbol $tptp_problem_series_string$ = makeSymbol("*TPTP-PROBLEM-SERIES-STRING*");

    // defparameter
    private static final SubLSymbol $tptp_first_problem_number$ = makeSymbol("*TPTP-FIRST-PROBLEM-NUMBER*");

    // defparameter
    private static final SubLSymbol $tptp_axiom_file_offset_number$ = makeSymbol("*TPTP-AXIOM-FILE-OFFSET-NUMBER*");

    /**
     * This must be bound to a script (see below)
     */
    // defparameter
    private static final SubLSymbol $tptp_module_script$ = makeSymbol("*TPTP-MODULE-SCRIPT*");

    /**
     * The ordered list of static query generation modules to call to generate the TPTP scaling corpus.
     * There are no linchpin modules in the scaling corpus.
     */
    // deflexical
    private static final SubLSymbol $tptp_module_scaling_script$ = makeSymbol("*TPTP-MODULE-SCALING-SCRIPT*");

    /**
     * The ordered list of query generation functions to call to sprinkle non-dynamic
     * queries into the TPTP transcript, followed by
     * the ordered list of linchpin modules to call to generate the elaboration transcript,
     * and the base number of times to call each one.  The base number will be multiplied by 3,
     * one for static, one for to-be-added, and one for to-be-removed, then will be multiplied by 2
     * for answerable and unanswerable.
     */
    // deflexical
    private static final SubLSymbol $tptp_module_elaboration_script$ = makeSymbol("*TPTP-MODULE-ELABORATION-SCRIPT*");

    /**
     * For testing
     */
    // deflexical
    private static final SubLSymbol $tptp_module_testing_script$ = makeSymbol("*TPTP-MODULE-TESTING-SCRIPT*");

    /**
     * How many of the chaff synthetic terms are added and removed during the course of the script?
     * This parameter serves as both the create ratio and the kill ratio, so the total term modification ratio is double this.
     */
    // defparameter
    private static final SubLSymbol $tptp_create_and_kill_ratio$ = makeSymbol("*TPTP-CREATE-AND-KILL-RATIO*");

    /**
     * How many of the chaff synthetic assertions are added and removed during the course of the script?
     * This parameter serves as both the create ratio and the kill ratio, so the total assertion modification ratio is double this.
     * Also, this does not include assertions that mention any of the terms to be created or killed.
     */
    // defparameter
    private static final SubLSymbol $tptp_assert_and_unassert_ratio$ = makeSymbol("*TPTP-ASSERT-AND-UNASSERT-RATIO*");

    // deflexical
    private static final SubLSymbol $tptp_current_release_string$ = makeSymbol("*TPTP-CURRENT-RELEASE-STRING*");

    public static final SubLObject generate_tptp_scaling_problem_set(SubLObject kb_content, SubLObject problem_set) {
        if (kb_content == UNPROVIDED) {
            kb_content = NIL;
        }
        if (problem_set == UNPROVIDED) {
            problem_set = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject directory = NIL;
                if (NIL == kb_content) {
                    kb_content = tptp_kb_content_generator.tptp_generate_synthetic_kb_content();
                }
                if (NIL == problem_set) {
                    {
                        SubLObject _prev_bind_0 = $tptp_create_and_kill_ratio$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $tptp_assert_and_unassert_ratio$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $tptp_module_script$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $tptp_relevant_chaff_count$.currentBinding(thread);
                        SubLObject _prev_bind_4 = $tptp_total_chaff_ratio$.currentBinding(thread);
                        SubLObject _prev_bind_5 = $tptp_force_all_answerableP$.currentBinding(thread);
                        try {
                            $tptp_create_and_kill_ratio$.bind(ZERO_INTEGER, thread);
                            $tptp_assert_and_unassert_ratio$.bind(ZERO_INTEGER, thread);
                            $tptp_module_script$.bind($tptp_module_scaling_script$.getGlobalValue(), thread);
                            $tptp_relevant_chaff_count$.bind(ZERO_INTEGER, thread);
                            $tptp_total_chaff_ratio$.bind(ZERO_INTEGER, thread);
                            $tptp_force_all_answerableP$.bind(T, thread);
                            problem_set = generate_tptp_problem_set_from_kb_content(kb_content, T);
                        } finally {
                            $tptp_force_all_answerableP$.rebind(_prev_bind_5, thread);
                            $tptp_total_chaff_ratio$.rebind(_prev_bind_4, thread);
                            $tptp_relevant_chaff_count$.rebind(_prev_bind_3, thread);
                            $tptp_module_script$.rebind(_prev_bind_2, thread);
                            $tptp_assert_and_unassert_ratio$.rebind(_prev_bind_1, thread);
                            $tptp_create_and_kill_ratio$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                tptp_reset_problem_numbers(problem_set);
                directory = tweak_and_folify_scaling_problem_set_chunk(problem_set, ZERO_INTEGER, ZERO_INTEGER, T, ZERO_INTEGER, ZERO_INTEGER, $str_alt14$cyc_scaling_1);
                {
                    SubLObject _prev_bind_0 = $tptp_explicit_directory$.currentBinding(thread);
                    try {
                        $tptp_explicit_directory$.bind(directory, thread);
                        tweak_and_folify_scaling_problem_set_chunk(problem_set, ZERO_INTEGER, ZERO_INTEGER, NIL, $int$50, ONE_INTEGER, $str_alt16$cyc_scaling_2);
                        tweak_and_folify_scaling_problem_set_chunk(problem_set, $int$3000, ZERO_INTEGER, NIL, $int$50, TWO_INTEGER, $str_alt18$cyc_scaling_3);
                        tweak_and_folify_scaling_problem_set_chunk(problem_set, $int$24000, ZERO_INTEGER, NIL, $int$50, THREE_INTEGER, $str_alt19$cyc_scaling_4);
                        tweak_and_folify_scaling_problem_set_chunk(problem_set, $int$24000, $float$0_1, NIL, $int$50, FOUR_INTEGER, $str_alt20$cyc_scaling_5);
                        tweak_and_folify_scaling_problem_set_chunk(problem_set, $int$24000, ONE_INTEGER, NIL, $int$50, FIVE_INTEGER, $str_alt21$cyc_scaling_6);
                    } finally {
                        $tptp_explicit_directory$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(problem_set, directory);
            }
        }
    }

    public static final SubLObject tweak_and_folify_scaling_problem_set_chunk(SubLObject problem_set, SubLObject relevant_chaff_count, SubLObject total_chaff_ratio, SubLObject proof_checker_modeP, SubLObject problem_num_increment, SubLObject axiom_file_id, SubLObject problem_series_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject directory = NIL;
                format_nil.force_format(T, $str_alt22$____FOLifying_problem_set_with_pa, relevant_chaff_count, total_chaff_ratio, proof_checker_modeP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $tptp_relevant_chaff_count$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tptp_total_chaff_ratio$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $tptp_problem_series_string$.currentBinding(thread);
                    try {
                        $tptp_relevant_chaff_count$.bind(relevant_chaff_count, thread);
                        $tptp_total_chaff_ratio$.bind(total_chaff_ratio, thread);
                        $tptp_problem_series_string$.bind(problem_series_string, thread);
                        tptp_datastructures.set_tptp_problem_set_proof_checker_mode(problem_set, proof_checker_modeP);
                        reset_tptp_problem_set_kb_spec(problem_set);
                        tptp_increment_problem_numbers(problem_set, problem_num_increment);
                        {
                            SubLObject _prev_bind_0_1 = $tptp_axiom_file_offset_number$.currentBinding(thread);
                            try {
                                $tptp_axiom_file_offset_number$.bind(axiom_file_id, thread);
                                directory = folify_tptp_problem_set(problem_set);
                            } finally {
                                $tptp_axiom_file_offset_number$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                    } finally {
                        $tptp_problem_series_string$.rebind(_prev_bind_2, thread);
                        $tptp_total_chaff_ratio$.rebind(_prev_bind_1, thread);
                        $tptp_relevant_chaff_count$.rebind(_prev_bind_0, thread);
                    }
                }
                return directory;
            }
        }
    }

    public static final SubLObject generate_tptp_elaboration_problem_set(SubLObject kb_content, SubLObject proof_checker_modeP, SubLObject problem_set) {
        if (kb_content == UNPROVIDED) {
            kb_content = NIL;
        }
        if (proof_checker_modeP == UNPROVIDED) {
            proof_checker_modeP = NIL;
        }
        if (problem_set == UNPROVIDED) {
            problem_set = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject directory = NIL;
                if (NIL == kb_content) {
                    kb_content = tptp_kb_content_generator.tptp_generate_synthetic_kb_content();
                }
                if (NIL == problem_set) {
                    {
                        SubLObject _prev_bind_0 = $tptp_module_script$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $tptp_problem_series_string$.currentBinding(thread);
                        try {
                            $tptp_module_script$.bind($tptp_module_elaboration_script$.getGlobalValue(), thread);
                            $tptp_problem_series_string$.bind($str_alt23$cyc_elaboration, thread);
                            problem_set = generate_tptp_problem_set_from_kb_content(kb_content, proof_checker_modeP);
                        } finally {
                            $tptp_problem_series_string$.rebind(_prev_bind_1, thread);
                            $tptp_module_script$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                tptp_reset_problem_numbers(problem_set);
                tptp_increment_problem_numbers(problem_set, $int$300);
                {
                    SubLObject _prev_bind_0 = $tptp_axiom_file_offset_number$.currentBinding(thread);
                    try {
                        $tptp_axiom_file_offset_number$.bind(SIX_INTEGER, thread);
                        directory = folify_tptp_problem_set(problem_set);
                    } finally {
                        $tptp_axiom_file_offset_number$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(problem_set, directory);
            }
        }
    }

    /**
     * Generates a TPTP problem set based on KB-CONTENT and the control variables,
     * and exports it to disk in FOL form.
     *
     * @param KB-CONTENT
     * 		nil or tptp-kb-content-p; will be created if not specified.
     */
    public static final SubLObject generate_tptp_problem_set(SubLObject kb_content, SubLObject proof_checker_modeP) {
        if (kb_content == UNPROVIDED) {
            kb_content = NIL;
        }
        if (proof_checker_modeP == UNPROVIDED) {
            proof_checker_modeP = NIL;
        }
        if (NIL == kb_content) {
            kb_content = tptp_kb_content_generator.tptp_generate_synthetic_kb_content();
        }
        {
            SubLObject problem_set = generate_tptp_problem_set_from_kb_content(kb_content, proof_checker_modeP);
            return folify_tptp_problem_set(problem_set);
        }
    }

    /**
     * Generates a tptp-problem-set datastructure based on KB-CONTENT and the control variables.
     * The generated problem set will have an empty kb-spec.
     * This function does not write anything to disk.
     */
    public static final SubLObject generate_tptp_problem_set_from_kb_content(SubLObject kb_content, SubLObject proof_checker_modeP) {
        if (proof_checker_modeP == UNPROVIDED) {
            proof_checker_modeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject tptp_transcript = generate_tptp_transcript(kb_content);
                SubLObject tptp_problems = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject problem_set = generate_tptp_problem_set_from_transcript(kb_content, tptp_transcript, tptp_problems, proof_checker_modeP);
                    reset_tptp_problem_set_kb_spec(problem_set);
                    return problem_set;
                }
            }
        }
    }

    /**
     * Generates a TPTP transcript based on KB-CONTENT and the control variables.
     * A TPTP transcript is an ordered list of TPTP operations, each of which is either a CycL problem
     * (implemented as an integer identifying a CycL problem by id) or an elaboration (implemented as a typed-include-list).
     * First the static TPTP problems (those not affected by elaboration) are generated.
     * Then the linchpins (the loci for elaboration) are selected via the linchpin modules
     * (which call the query generation modules).  Then synthetic-chaff is attached to the linchpins to make the include lists.
     * Then the TPTP transcript is generated from those include lists and the static problems.
     * Lastly, the static problems are sprinkled randomly into the TPTP transcript.
     */
    public static final SubLObject generate_tptp_transcript(SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject static_tptp_problems = generate_static_tptp_problems(kb_content);
                SubLObject justification_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject dynamic_tptp_problems = tptp_determine_linchpins(kb_content, length(static_tptp_problems), justification_index);
                    SubLObject static_linchpins = thread.secondMultipleValue();
                    SubLObject to_be_added_linchpins = thread.thirdMultipleValue();
                    SubLObject to_be_removed_linchpins = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject static_include_lists = tptp_attach_synthetic_chaff_to_linchpins(kb_content, justification_index, static_linchpins, to_be_added_linchpins, to_be_removed_linchpins);
                        SubLObject to_be_added_include_lists = thread.secondMultipleValue();
                        SubLObject to_be_removed_include_lists = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject tptp_transcript = tptp_generate_transcript_from_include_lists(static_include_lists, to_be_added_include_lists, to_be_removed_include_lists, justification_index);
                            tptp_transcript = sprinkle_static_problems_into_tptp_transcript(tptp_transcript, static_tptp_problems);
                            {
                                SubLObject tptp_problems = append(static_tptp_problems, dynamic_tptp_problems);
                                return values(tptp_transcript, tptp_problems);
                            }
                        }
                    }
                }
            }
        }
    }

    // deflexical
    private static final SubLSymbol $force_unanswerable_modules$ = makeSymbol("*FORCE-UNANSWERABLE-MODULES*");

    public static final SubLObject generate_static_tptp_problems(SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject static_tptp_problems = NIL;
                SubLObject problem_num = ZERO_INTEGER;
                SubLObject justification_index = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject remainder = NIL;
                for (remainder = $tptp_module_script$.getDynamicValue(thread); NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject query_generation_module = remainder.first();
                        SubLObject quota = cadr(remainder);
                        if (NIL != tptp_modules.tptp_query_generation_module_name_p(query_generation_module)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL != tptp_modules.tptp_linchpin_module_name_p(query_generation_module)) {
                                    Errors.error($str_alt26$_s_is_already_declared_as_a_linch, query_generation_module);
                                }
                            }
                            {
                                SubLObject count = ZERO_INTEGER;
                                SubLObject answerability_queue = refill_answerability_queue();
                                while (!count.numE(quota)) {
                                    {
                                        SubLObject answerability = (NIL != list_utilities.member_eqP(query_generation_module, $force_unanswerable_modules$.getGlobalValue())) ? ((SubLObject) ($UNANSWERABLE)) : answerability_queue.first();
                                        SubLObject tptp_problem = tptp_modules.generate_static_tptp_problem(query_generation_module, answerability, kb_content, problem_num);
                                        if (NIL != tptp_problem) {
                                            format_nil.force_format(T, $str_alt28$__Generated_static_TPTP_problem__, tptp_datastructures.printable_tptp_problem(tptp_problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            tptp_problem = tptp_datastructures.tptp_problem_nset_property(tptp_problem, $LINCHPIN, $STATIC);
                                            static_tptp_problems = cons(tptp_problem, static_tptp_problems);
                                            add_tptp_problem_to_justification_index(tptp_problem, justification_index);
                                            count = add(count, ONE_INTEGER);
                                            problem_num = add(problem_num, ONE_INTEGER);
                                            answerability_queue = answerability_queue.rest();
                                            if (NIL == answerability_queue) {
                                                answerability_queue = refill_answerability_queue();
                                            }
                                        }
                                    }
                                } 
                            }
                        }
                    }
                }
                return values(nreverse(static_tptp_problems), justification_index);
            }
        }
    }

    public static final SubLObject refill_answerability_queue() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $tptp_force_all_answerableP$.getDynamicValue(thread)) {
                return list($ANSWERABLE, $ANSWERABLE);
            } else {
                return tptp_datastructures.both_answerabilities_in_random_order();
            }
        }
    }

    /**
     * Determines the linchpins (the loci for elaboration) by calling the linchpin modules,
     * which in turn call the query generation modules as helpers.  No linchpin appears
     * in the justification of any other problem.
     * Adds information to JUSTIFICATION-INDEX by side effect.
     */
    public static final SubLObject tptp_determine_linchpins(SubLObject kb_content, SubLObject next_problem_num, SubLObject justification_index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dynamic_tptp_problems = NIL;
                SubLObject linchpin_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                SubLObject static_linchpins = NIL;
                SubLObject to_be_added_linchpins = NIL;
                SubLObject to_be_removed_linchpins = NIL;
                SubLObject remainder = NIL;
                for (remainder = $tptp_module_script$.getDynamicValue(thread); NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject linchpin_module = remainder.first();
                        SubLObject base = cadr(remainder);
                        if (NIL != tptp_modules.tptp_linchpin_module_name_p(linchpin_module)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL != tptp_modules.tptp_query_generation_module_name_p(linchpin_module)) {
                                    Errors.error($str_alt32$_s_is_already_declared_as_a_query, linchpin_module);
                                }
                            }
                            thread.resetMultipleValues();
                            {
                                SubLObject new_linchpins = tptp_determine_linchpins_for_one_module(linchpin_module, next_problem_num, justification_index, kb_content, multiply(THREE_INTEGER, base), linchpin_set);
                                SubLObject new_tptp_problems = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                next_problem_num = add(next_problem_num, length(new_tptp_problems));
                                {
                                    SubLObject items_var = new_tptp_problems;
                                    if (items_var.isVector()) {
                                        {
                                            SubLObject vector_var = new_tptp_problems;
                                            SubLObject backwardP_var = NIL;
                                            SubLObject length = length(vector_var);
                                            SubLObject v_iteration = NIL;
                                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                {
                                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                    SubLObject item = aref(vector_var, element_num);
                                                    dynamic_tptp_problems = cons(item, dynamic_tptp_problems);
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject cdolist_list_var = new_tptp_problems;
                                            SubLObject item = NIL;
                                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                dynamic_tptp_problems = cons(item, dynamic_tptp_problems);
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject datum = list_utilities.partition_list_n_ways(new_linchpins, THREE_INTEGER);
                                    SubLObject current = datum;
                                    SubLObject new_static_linchpins = NIL;
                                    SubLObject new_to_be_added_linchpins = NIL;
                                    SubLObject new_to_be_removed_linchpins = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt33);
                                    new_static_linchpins = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt33);
                                    new_to_be_added_linchpins = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt33);
                                    new_to_be_removed_linchpins = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject items_var = new_static_linchpins;
                                            if (items_var.isVector()) {
                                                {
                                                    SubLObject vector_var = new_static_linchpins;
                                                    SubLObject backwardP_var = NIL;
                                                    SubLObject length = length(vector_var);
                                                    SubLObject v_iteration = NIL;
                                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                        {
                                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                            SubLObject item = aref(vector_var, element_num);
                                                            static_linchpins = cons(item, static_linchpins);
                                                        }
                                                    }
                                                }
                                            } else {
                                                {
                                                    SubLObject cdolist_list_var = new_static_linchpins;
                                                    SubLObject item = NIL;
                                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                        static_linchpins = cons(item, static_linchpins);
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject items_var = new_to_be_added_linchpins;
                                            if (items_var.isVector()) {
                                                {
                                                    SubLObject vector_var = new_to_be_added_linchpins;
                                                    SubLObject backwardP_var = NIL;
                                                    SubLObject length = length(vector_var);
                                                    SubLObject v_iteration = NIL;
                                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                        {
                                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                            SubLObject item = aref(vector_var, element_num);
                                                            to_be_added_linchpins = cons(item, to_be_added_linchpins);
                                                        }
                                                    }
                                                }
                                            } else {
                                                {
                                                    SubLObject cdolist_list_var = new_to_be_added_linchpins;
                                                    SubLObject item = NIL;
                                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                        to_be_added_linchpins = cons(item, to_be_added_linchpins);
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject items_var = new_to_be_removed_linchpins;
                                            if (items_var.isVector()) {
                                                {
                                                    SubLObject vector_var = new_to_be_removed_linchpins;
                                                    SubLObject backwardP_var = NIL;
                                                    SubLObject length = length(vector_var);
                                                    SubLObject v_iteration = NIL;
                                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                        {
                                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                            SubLObject item = aref(vector_var, element_num);
                                                            to_be_removed_linchpins = cons(item, to_be_removed_linchpins);
                                                        }
                                                    }
                                                }
                                            } else {
                                                {
                                                    SubLObject cdolist_list_var = new_to_be_removed_linchpins;
                                                    SubLObject item = NIL;
                                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                        to_be_removed_linchpins = cons(item, to_be_removed_linchpins);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt33);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(dynamic_tptp_problems, static_linchpins, to_be_added_linchpins, to_be_removed_linchpins);
            }
        }
    }

    public static final SubLObject tptp_determine_linchpins_for_one_module(SubLObject linchpin_module, SubLObject next_problem_num, SubLObject justification_index, SubLObject kb_content, SubLObject linchpin_quota, SubLObject preexisting_linchpin_set) {
        {
            SubLObject new_tptp_problems = NIL;
            SubLObject starvation_count = ZERO_INTEGER;
            SubLObject linchpins = NIL;
            while (NIL == list_utilities.lengthE(linchpins, linchpin_quota, UNPROVIDED)) {
                starvation_count = add(starvation_count, ONE_INTEGER);
                if (starvation_count.numG($int$50)) {
                    Errors.error($str_alt34$Linchpin_starvation___s, linchpin_module);
                }
                {
                    SubLObject tptp_problem = tptp_modules.generate_dynamic_tptp_problem(linchpin_module, kb_content, next_problem_num);
                    if (NIL != tptp_problem) {
                        if (NIL == tptp_problem_justification_contains_a_preexisting_linchpinP(tptp_problem, preexisting_linchpin_set)) {
                            {
                                SubLObject linchpin_candidate = tptp_modules.tptp_linchpin_candidate(linchpin_module, tptp_problem, justification_index, kb_content);
                                if (NIL != linchpin_candidate) {
                                    if (!((NIL != forts.fort_p(linchpin_candidate)) && (NIL != list_utilities.tree_find(linchpin_candidate, tptp_datastructures.tptp_problem_query(tptp_problem), UNPROVIDED, UNPROVIDED)))) {
                                        if (NIL == linchpin_already_takenP(linchpin_candidate, preexisting_linchpin_set)) {
                                            if (NIL == tptp_modules.tptp_core_ruleP(linchpin_candidate)) {
                                                if (!((NIL != assertions_high.gaf_assertionP(linchpin_candidate)) && (NIL != gaf_provable_by_other_meansP(linchpin_candidate)))) {
                                                    if (NIL == tptp_problem_open_and_has_more_than_one_answerP(tptp_problem)) {
                                                        format(T, $str_alt35$__Selecting_linchpin___a__, linchpin_candidate);
                                                        starvation_count = ZERO_INTEGER;
                                                        linchpins = cons(linchpin_candidate, linchpins);
                                                        set.set_add(linchpin_candidate, preexisting_linchpin_set);
                                                        new_tptp_problems = cons(tptp_datastructures.tptp_problem_nset_property(tptp_problem, $LINCHPIN, linchpin_candidate), new_tptp_problems);
                                                        add_tptp_problem_to_justification_index(tptp_problem, justification_index);
                                                        next_problem_num = add(next_problem_num, ONE_INTEGER);
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
            return values(linchpins, new_tptp_problems);
        }
    }

    public static final SubLObject add_tptp_problem_to_justification_index(SubLObject tptp_problem, SubLObject justification_index) {
        {
            SubLObject justification = tptp_datastructures.tptp_problem_justification(tptp_problem);
            SubLObject problem_num = tptp_datastructures.tptp_problem_num(tptp_problem);
            SubLObject cdolist_list_var = justification_indexed_terms(justification);
            SubLObject indexed_term = NIL;
            for (indexed_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexed_term = cdolist_list_var.first()) {
                dictionary_utilities.dictionary_pushnew(justification_index, indexed_term, problem_num, UNPROVIDED, UNPROVIDED);
            }
        }
        return justification_index;
    }

    public static final SubLObject justification_indexed_terms(SubLObject justification) {
        {
            SubLObject indexed_terms = NIL;
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL != assertion_handles.assertion_p(support)) {
                    indexed_terms = cons(support, indexed_terms);
                    {
                        SubLObject items_var = assertions_high.assertion_forts(support, NIL, NIL, T, T);
                        if (items_var.isVector()) {
                            {
                                SubLObject vector_var = assertions_high.assertion_forts(support, NIL, NIL, T, T);
                                SubLObject backwardP_var = NIL;
                                SubLObject length = length(vector_var);
                                SubLObject v_iteration = NIL;
                                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    {
                                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                        SubLObject item = aref(vector_var, element_num);
                                        indexed_terms = cons(item, indexed_terms);
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject cdolist_list_var_2 = assertions_high.assertion_forts(support, NIL, NIL, T, T);
                                SubLObject item = NIL;
                                for (item = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , item = cdolist_list_var_2.first()) {
                                    indexed_terms = cons(item, indexed_terms);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(indexed_terms);
        }
    }

    public static final SubLObject tptp_justification_index_lookup(SubLObject v_term, SubLObject justification_index) {
        return dictionary.dictionary_lookup_without_values(justification_index, v_term, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether LINCHPIN-CANDIDATE already exists in PREEXISTING-LINCHPIN-SET,
    either as an exact match or as a constituent of a member of PREEXISTING-LINCHPIN-SET.
     */
    public static final SubLObject linchpin_already_takenP(SubLObject linchpin_candidate, SubLObject preexisting_linchpin_set) {
        {
            SubLObject takenP = NIL;
            if (NIL != set.set_memberP(linchpin_candidate, preexisting_linchpin_set)) {
                takenP = T;
            } else
                if (NIL != forts.fort_p(linchpin_candidate)) {
                    if (NIL != kb_mapping_macros.do_term_index_key_validator(linchpin_candidate, NIL)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(linchpin_candidate, NIL);
                            SubLObject done_var = takenP;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                    if (NIL != valid) {
                                        {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                {
                                                    SubLObject done_var_3 = takenP;
                                                    SubLObject token_var_4 = NIL;
                                                    while (NIL == done_var_3) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                            SubLObject valid_5 = makeBoolean(token_var_4 != ass);
                                                            if (NIL != valid_5) {
                                                                if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                                    if (NIL != set.set_memberP(ass, preexisting_linchpin_set)) {
                                                                        takenP = T;
                                                                    }
                                                                }
                                                            }
                                                            done_var_3 = makeBoolean((NIL == valid_5) || (NIL != takenP));
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != takenP));
                                }
                            } 
                        }
                    }
                }

            if (NIL != takenP) {
                Errors.warn($str_alt36$Linchpin_already_taken___a, linchpin_candidate);
            }
            return takenP;
        }
    }

    public static final SubLObject tptp_problem_justification_contains_a_preexisting_linchpinP(SubLObject tptp_problem, SubLObject preexisting_linchpin_set) {
        {
            SubLObject justification = tptp_datastructures.tptp_problem_justification(tptp_problem);
            SubLObject cdolist_list_var = justification_indexed_terms(justification);
            SubLObject indexed_term = NIL;
            for (indexed_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexed_term = cdolist_list_var.first()) {
                if (NIL != set.set_memberP(indexed_term, preexisting_linchpin_set)) {
                    Errors.warn($str_alt37$Rejecting_problem_due_to_preexist, indexed_term);
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether GAF would be reprovable if it were unasserted.
    This function is more likely to return false positives (T) than false negatives (NIL).
     */
    public static final SubLObject gaf_provable_by_other_meansP(SubLObject gaf) {
        if (NIL != assertions_high.deduced_assertionP(gaf)) {
            return T;
        }
        {
            SubLObject query = assertions_high.gaf_formula(gaf);
            SubLObject mt = assertions_high.assertion_mt(gaf);
            SubLObject supports_list = inference_kernel.new_cyc_query(query, mt, $list_alt38);
            SubLObject cdolist_list_var = supports_list;
            SubLObject supports = NIL;
            for (supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supports = cdolist_list_var.first()) {
                if ((NIL == list_utilities.tree_find(gaf, supports, UNPROVIDED, UNPROVIDED)) && (NIL == list_utilities.tree_find(query, supports, symbol_function(EQUAL), UNPROVIDED))) {
                    print(list(gaf, supports), UNPROVIDED);
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tptp_problem_openP(SubLObject tptp_problem) {
        {
            SubLObject ist_query = tptp_datastructures.tptp_problem_query(tptp_problem);
            return tptp_modules.query_has_opennessP(ist_query, $OPEN);
        }
    }

    public static final SubLObject tptp_problem_open_and_has_more_than_one_answerP(SubLObject tptp_problem) {
        if (NIL != tptp_problem_openP(tptp_problem)) {
            {
                SubLObject ist_query = tptp_datastructures.tptp_problem_query(tptp_problem);
                SubLObject answers = inference_kernel.new_cyc_query(ist_query, NIL, $list_alt40);
                if (NIL != list_utilities.lengthGE(answers, TWO_INTEGER, UNPROVIDED)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     * Now that we have selected and typed the linchpins (STATIC-LINCHPINS, TO-BE-ADDED-LINCHPINS, TO-BE-REMOVED-LINCHPINS),
     * we attach synthetic chaff to them, adding lots of hay to hide the needles.  The synthetic-chaff is guaranteed to not overlap with any
     * problem's justification.  The resulting lists of indexed terms are called include lists, since they are lists of
     * terms that will form a TPTP include file.
     */
    public static final SubLObject tptp_attach_synthetic_chaff_to_linchpins(SubLObject kb_content, SubLObject justification_index, SubLObject static_linchpins, SubLObject to_be_added_linchpins, SubLObject to_be_removed_linchpins) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject chaff_forts = tptp_kb_content_generator.some_synthetic_chaff_forts(kb_content, justification_index, multiply(THREE_INTEGER, $tptp_create_and_kill_ratio$.getDynamicValue(thread)));
                SubLObject datum = list_utilities.randomly_partition_list_n_ways(chaff_forts, THREE_INTEGER);
                SubLObject current = datum;
                SubLObject static_chaff_forts = NIL;
                SubLObject to_be_added_chaff_forts = NIL;
                SubLObject to_be_removed_chaff_forts = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt41);
                static_chaff_forts = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt41);
                to_be_added_chaff_forts = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt41);
                to_be_removed_chaff_forts = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject chaff_assertions = tptp_kb_content_generator.some_synthetic_chaff_gafs_not_mentioning(kb_content, justification_index, multiply(THREE_INTEGER, $tptp_assert_and_unassert_ratio$.getDynamicValue(thread)), chaff_forts);
                        SubLObject datum_6 = list_utilities.randomly_partition_list_n_ways(chaff_assertions, THREE_INTEGER);
                        SubLObject current_7 = datum_6;
                        SubLObject static_chaff_assertions = NIL;
                        SubLObject to_be_added_chaff_assertions = NIL;
                        SubLObject to_be_removed_chaff_assertions = NIL;
                        destructuring_bind_must_consp(current_7, datum_6, $list_alt42);
                        static_chaff_assertions = current_7.first();
                        current_7 = current_7.rest();
                        destructuring_bind_must_consp(current_7, datum_6, $list_alt42);
                        to_be_added_chaff_assertions = current_7.first();
                        current_7 = current_7.rest();
                        destructuring_bind_must_consp(current_7, datum_6, $list_alt42);
                        to_be_removed_chaff_assertions = current_7.first();
                        current_7 = current_7.rest();
                        if (NIL == current_7) {
                            {
                                SubLObject static_chaff = nconc(static_chaff_forts, static_chaff_assertions);
                                SubLObject to_be_added_chaff = nconc(to_be_added_chaff_forts, to_be_added_chaff_assertions);
                                SubLObject to_be_removed_chaff = nconc(to_be_removed_chaff_forts, to_be_removed_chaff_assertions);
                                SubLObject static_include_lists = tptp_generate_include_lists(static_linchpins, static_chaff);
                                SubLObject to_be_added_include_lists = tptp_generate_include_lists(to_be_added_linchpins, to_be_added_chaff);
                                SubLObject to_be_removed_include_lists = tptp_generate_include_lists(to_be_removed_linchpins, to_be_removed_chaff);
                                return values(static_include_lists, to_be_added_include_lists, to_be_removed_include_lists);
                            }
                        } else {
                            cdestructuring_bind_error(datum_6, $list_alt42);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt41);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tptp_generate_include_lists(SubLObject linchpins, SubLObject synthetic_chaff) {
        {
            SubLObject include_lists = NIL;
            if (NIL != linchpins) {
                {
                    SubLObject chaff_partition = list_utilities.randomly_partition_list_n_ways(synthetic_chaff, length(linchpins));
                    SubLObject linchpin = NIL;
                    SubLObject linchpin_8 = NIL;
                    SubLObject chaff_for_this_linchpin = NIL;
                    SubLObject chaff_for_this_linchpin_9 = NIL;
                    for (linchpin = linchpins, linchpin_8 = linchpin.first(), chaff_for_this_linchpin = chaff_partition, chaff_for_this_linchpin_9 = chaff_for_this_linchpin.first(); !((NIL == chaff_for_this_linchpin) && (NIL == linchpin)); linchpin = linchpin.rest() , linchpin_8 = linchpin.first() , chaff_for_this_linchpin = chaff_for_this_linchpin.rest() , chaff_for_this_linchpin_9 = chaff_for_this_linchpin.first()) {
                        {
                            SubLObject include_list = cons(linchpin_8, chaff_for_this_linchpin_9);
                            include_lists = cons(include_list, include_lists);
                        }
                    }
                }
            }
            return nreverse(include_lists);
        }
    }

    /**
     * Builds up a 'TPTP transcript', a list of 'TPTP operations', each of which is either
     * a CycL problem (represented by an integer) or an elaboration (represented by a typed include list).
     * We use the linchpins (not yet buried in the include lists) to make sure each linchpin's problem
     * occurs once before and once after the addition or removal of that linchpin.  In the case of a static
     * linchpin, the problem will still occur twice, but the linchpin will not be added or removed.
     */
    public static final SubLObject tptp_generate_transcript_from_include_lists(SubLObject static_include_lists, SubLObject to_be_added_include_lists, SubLObject to_be_removed_include_lists, SubLObject justification_index) {
        {
            SubLObject typed_include_lists = nnumber_include_lists(list_utilities.randomize_list(assign_types_to_include_lists(static_include_lists, to_be_added_include_lists, to_be_removed_include_lists)));
            SubLObject tptp_transcript = list_utilities.randomize_list(typed_include_lists);
            SubLObject cdolist_list_var = typed_include_lists;
            SubLObject typed_include_list = NIL;
            for (typed_include_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typed_include_list = cdolist_list_var.first()) {
                {
                    SubLObject linchpin = typed_include_list_linchpin(typed_include_list);
                    SubLObject problem_num = problem_num_for_linchpin(linchpin, justification_index);
                    tptp_transcript = list_utilities.ninsert_somewhere_before_and_after(problem_num, tptp_transcript, typed_include_list, symbol_function(EQUAL));
                }
            }
            return tptp_transcript;
        }
    }

    /**
     * Assigns types to the include lists.  In a typed include list, the first element is the type, the second element
     * is the linchpin, and the other elements are synthetic-chaff.
     * The -1s will be fixed by @xref nnumber-include-lists.
     */
    public static final SubLObject assign_types_to_include_lists(SubLObject static_include_lists, SubLObject to_be_added_include_lists, SubLObject to_be_removed_include_lists) {
        {
            SubLObject typed_include_lists = NIL;
            {
                SubLObject cdolist_list_var = static_include_lists;
                SubLObject static_include_list = NIL;
                for (static_include_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , static_include_list = cdolist_list_var.first()) {
                    typed_include_lists = cons(listS($STATIC, MINUS_ONE_INTEGER, static_include_list), typed_include_lists);
                }
            }
            {
                SubLObject cdolist_list_var = to_be_added_include_lists;
                SubLObject to_be_added_include_list = NIL;
                for (to_be_added_include_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , to_be_added_include_list = cdolist_list_var.first()) {
                    typed_include_lists = cons(listS($TO_BE_ADDED, MINUS_ONE_INTEGER, to_be_added_include_list), typed_include_lists);
                }
            }
            {
                SubLObject cdolist_list_var = to_be_removed_include_lists;
                SubLObject to_be_removed_include_list = NIL;
                for (to_be_removed_include_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , to_be_removed_include_list = cdolist_list_var.first()) {
                    typed_include_lists = cons(listS($TO_BE_REMOVED, MINUS_ONE_INTEGER, to_be_removed_include_list), typed_include_lists);
                }
            }
            return nreverse(typed_include_lists);
        }
    }

    public static final SubLObject nnumber_include_lists(SubLObject include_lists) {
        {
            SubLObject list_var = NIL;
            SubLObject include_list = NIL;
            SubLObject i = NIL;
            for (list_var = include_lists, include_list = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , include_list = list_var.first() , i = add(ONE_INTEGER, i)) {
                list_utilities.nreplace_nth(ONE_INTEGER, number_utilities.f_1X(i), include_list);
            }
        }
        return include_lists;
    }

    public static final SubLObject typed_include_list_p(SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.member_eqP(v_object.first(), $list_alt45))) && second(v_object).isInteger()) && ((NIL != forts.fort_p(third(v_object))) || (NIL != assertion_handles.assertion_p(third(v_object)))));
    }

    public static final SubLObject typed_include_list_type(SubLObject typed_include_list) {
        return typed_include_list.first();
    }

    public static final SubLObject typed_include_list_id(SubLObject typed_include_list) {
        return second(typed_include_list);
    }

    public static final SubLObject typed_include_list_linchpin(SubLObject typed_include_list) {
        return third(typed_include_list);
    }

    public static final SubLObject typed_include_list_indexed_terms(SubLObject typed_include_list) {
        return nthcdr(TWO_INTEGER, typed_include_list);
    }

    public static final SubLObject typed_include_list_assertions(SubLObject typed_include_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions = NIL;
                SubLObject cdolist_list_var = typed_include_list_indexed_terms(typed_include_list);
                SubLObject indexed_term = NIL;
                for (indexed_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexed_term = cdolist_list_var.first()) {
                    if (NIL != assertion_handles.assertion_p(indexed_term)) {
                        assertions = cons(indexed_term, assertions);
                    } else {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                if (NIL != kb_mapping_macros.do_term_index_key_validator(indexed_term, NIL)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(indexed_term, NIL);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                            {
                                                                SubLObject done_var_10 = NIL;
                                                                SubLObject token_var_11 = NIL;
                                                                while (NIL == done_var_10) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                        SubLObject valid_12 = makeBoolean(token_var_11 != ass);
                                                                        if (NIL != valid_12) {
                                                                            if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                                                assertions = cons(ass, assertions);
                                                                            }
                                                                        }
                                                                        done_var_10 = makeBoolean(NIL == valid_12);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return nreverse(assertions);
            }
        }
    }

    public static final SubLObject problem_num_for_linchpin(SubLObject linchpin, SubLObject justification_index) {
        {
            SubLObject problem_nums = tptp_justification_index_lookup(linchpin, justification_index);
            SubLObject problem_num = list_utilities.only_one(problem_nums);
            return problem_num;
        }
    }

    public static final SubLObject sprinkle_static_problems_into_tptp_transcript(SubLObject tptp_transcript, SubLObject static_tptp_problems) {
        {
            SubLObject cdolist_list_var = static_tptp_problems;
            SubLObject tptp_problem = NIL;
            for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                {
                    SubLObject problem_num = tptp_datastructures.tptp_problem_num(tptp_problem);
                    tptp_transcript = list_utilities.ninsert_randomly(problem_num, tptp_transcript);
                }
            }
        }
        return tptp_transcript;
    }

    /**
     * Separate out the include lists from the TPTP-TRANSCRIPT and attach them to the
     * appropriate TPTP-PROBLEMS.  Effectively we 'run through' the transcript, keeping track
     * of the 'current state of the KB' as affected by the elaborations, and attach the
     * 'current state of the KB' to the TPTP-PROBLEMS in the form of include lists,
     * except for the static KB.
     */
    public static final SubLObject generate_tptp_problem_set_from_transcript(SubLObject kb_content, SubLObject tptp_transcript, SubLObject tptp_problems, SubLObject proof_checker_modeP) {
        {
            SubLObject new_tptp_problems = NIL;
            SubLObject typed_include_lists = extract_and_sort_include_lists(tptp_transcript);
            SubLObject current_include_list_ids = initial_include_list_ids(typed_include_lists);
            SubLObject cdolist_list_var = tptp_transcript;
            SubLObject tptp_op = NIL;
            for (tptp_op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_op = cdolist_list_var.first()) {
                if (tptp_op.isInteger()) {
                    {
                        SubLObject num = tptp_op;
                        SubLObject tptp_problem = tptp_datastructures.find_tptp_problem_by_num(tptp_problems, num);
                        SubLObject make_unanswerableP = make_tptp_problem_unanswerableP(tptp_problem, typed_include_lists, current_include_list_ids);
                        new_tptp_problems = cons(attach_include_lists_to_tptp_problem(tptp_problem, current_include_list_ids, make_unanswerableP), new_tptp_problems);
                    }
                } else {
                    {
                        SubLObject typed_include_list = tptp_op;
                        SubLObject type = typed_include_list_type(typed_include_list);
                        SubLObject id = typed_include_list_id(typed_include_list);
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($STATIC)) {
                        } else
                            if (pcase_var.eql($TO_BE_ADDED)) {
                                current_include_list_ids = list_utilities.splice_into_sorted_list(id, current_include_list_ids, symbol_function($sym48$_), UNPROVIDED);
                            } else
                                if (pcase_var.eql($TO_BE_REMOVED)) {
                                    current_include_list_ids = delete(id, current_include_list_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    Errors.error($str_alt49$Unexpected_include_list_type__s, type);
                                }


                    }
                }
            }
            new_tptp_problems = finalize_tptp_problems(nreverse(new_tptp_problems));
            {
                SubLObject kb_spec = tptp_datastructures.new_tptp_kb_spec(kb_content, NIL);
                return tptp_datastructures.new_tptp_problem_set(kb_spec, typed_include_lists, new_tptp_problems, proof_checker_modeP);
            }
        }
    }

    /**
     * If the linchpin is not present in the set of current include lists, we note that this problem is expected to beunanswerable.
     */
    public static final SubLObject make_tptp_problem_unanswerableP(SubLObject tptp_problem, SubLObject typed_include_lists, SubLObject current_include_list_ids) {
        if (NIL != tptp_datastructures.tptp_problem_staticP(tptp_problem)) {
            return NIL;
        } else {
            {
                SubLObject linchpin = tptp_datastructures.tptp_problem_linchpin(tptp_problem);
                SubLObject linchpin_id = number_utilities.f_1X(position(linchpin, typed_include_lists, symbol_function(EQ), TYPED_INCLUDE_LIST_LINCHPIN, UNPROVIDED, UNPROVIDED));
                SubLObject linchpin_presentP = subl_promotions.memberP(linchpin_id, current_include_list_ids, UNPROVIDED, UNPROVIDED);
                return makeBoolean(NIL == linchpin_presentP);
            }
        }
    }

    public static final SubLObject extract_and_sort_include_lists(SubLObject tptp_transcript) {
        {
            SubLObject typed_include_lists = list_utilities.remove_if_not(TYPED_INCLUDE_LIST_P, tptp_transcript, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return Sort.sort(typed_include_lists, symbol_function($sym48$_), TYPED_INCLUDE_LIST_ID);
        }
    }

    /**
     * The virtual KB starts with all the :static and :to-be-removed include lists.
     * Returns the list of all :static and :to-be-removed lists, sorted in ascending order.
     */
    public static final SubLObject initial_include_list_ids(SubLObject typed_include_lists) {
        {
            SubLObject ids = NIL;
            SubLObject cdolist_list_var = typed_include_lists;
            SubLObject typed_include_list = NIL;
            for (typed_include_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typed_include_list = cdolist_list_var.first()) {
                {
                    SubLObject type = typed_include_list_type(typed_include_list);
                    SubLObject id = typed_include_list_id(typed_include_list);
                    if (NIL != list_utilities.member_eqP(type, $list_alt53)) {
                        ids = cons(id, ids);
                    }
                }
            }
            return Sort.sort(ids, symbol_function($sym48$_), UNPROVIDED);
        }
    }

    /**
     * This not only attaches the include lists but may adjust the answerability,
     * if the problem's linchpin is not present in the include lists.
     */
    public static final SubLObject attach_include_lists_to_tptp_problem(SubLObject tptp_problem, SubLObject include_list_ids, SubLObject make_unanswerableP) {
        tptp_problem = copy_list(tptp_problem);
        if (NIL != make_unanswerableP) {
            tptp_problem = tptp_datastructures.tptp_problem_nset_property(tptp_problem, $ANSWERABILITY, $UNANSWERABLE);
        }
        tptp_problem = tptp_datastructures.tptp_problem_nset_property(tptp_problem, $INCLUDE_LIST_IDS, cons(ZERO_INTEGER, copy_list(include_list_ids)));
        return tptp_problem;
    }

    /**
     * Renumbers TPTP-PROBLEMS, notes their output filenames,
     * adds the :counterpart-num field, and adds TPTP headers to them.
     */
    public static final SubLObject finalize_tptp_problems(SubLObject tptp_problems) {
        tptp_problems = renumber_tptp_problems(tptp_problems, T);
        tptp_problems = add_counterpart_info_to_tptp_problems(tptp_problems);
        tptp_problems = add_headers_to_tptp_problems(tptp_problems);
        return tptp_problems;
    }

    public static final SubLObject renumber_tptp_problems(SubLObject tptp_problems, SubLObject also_do_pair_numP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_tptp_problems = NIL;
                SubLObject list_var = NIL;
                SubLObject tptp_problem = NIL;
                SubLObject i = NIL;
                for (list_var = tptp_problems, tptp_problem = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tptp_problem = list_var.first() , i = add(ONE_INTEGER, i)) {
                    {
                        SubLObject num = add(i, $tptp_first_problem_number$.getDynamicValue(thread));
                        SubLObject pair_num = (NIL != also_do_pair_numP) ? ((SubLObject) (add(tptp_datastructures.tptp_problem_pair_num(tptp_problem), $tptp_first_problem_number$.getDynamicValue(thread)))) : NIL;
                        tptp_problem = tptp_datastructures.tptp_problem_nset_property(tptp_problem, $NUM, num);
                        if (NIL != also_do_pair_numP) {
                            tptp_problem = tptp_datastructures.tptp_problem_nset_property(tptp_problem, $PAIR_NUM, pair_num);
                        }
                        new_tptp_problems = cons(tptp_problem, new_tptp_problems);
                    }
                }
                return nreverse(new_tptp_problems);
            }
        }
    }

    public static final SubLObject tptp_reset_problem_numbers(SubLObject problem_set) {
        {
            SubLObject tptp_problems = tptp_datastructures.tptp_problem_set_tptp_problems(problem_set);
            tptp_problems = renumber_tptp_problems(tptp_problems, NIL);
            tptp_datastructures.set_tptp_problem_set_tptp_problems(problem_set, tptp_problems);
            return problem_set;
        }
    }

    /**
     * Increments all the problem numbers in PROBLEM-SET by INCREMENT.
     */
    public static final SubLObject tptp_increment_problem_numbers(SubLObject problem_set, SubLObject increment) {
        {
            SubLObject new_tptp_problems = NIL;
            SubLObject tptp_problems = tptp_datastructures.tptp_problem_set_tptp_problems(problem_set);
            SubLObject cdolist_list_var = tptp_problems;
            SubLObject tptp_problem = NIL;
            for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                {
                    SubLObject num = tptp_datastructures.tptp_problem_num(tptp_problem);
                    num = add(num, increment);
                    tptp_problem = tptp_datastructures.tptp_problem_nset_property(tptp_problem, $NUM, num);
                    new_tptp_problems = cons(tptp_problem, new_tptp_problems);
                }
            }
            new_tptp_problems = nreverse(new_tptp_problems);
            new_tptp_problems = add_headers_to_tptp_problems(new_tptp_problems);
            tptp_datastructures.set_tptp_problem_set_tptp_problems(problem_set, new_tptp_problems);
            return problem_set;
        }
    }

    /**
     * Now that the CycL problems have their final :num information, we can use the :pair-num
     * data to construct the :counterpart-num field.  Then we don't need the :pair-num data anymore.
     */
    public static final SubLObject add_counterpart_info_to_tptp_problems(SubLObject tptp_problems) {
        {
            SubLObject new_tptp_problems = NIL;
            SubLObject dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            {
                SubLObject cdolist_list_var = tptp_problems;
                SubLObject tptp_problem = NIL;
                for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                    {
                        SubLObject num = tptp_datastructures.tptp_problem_num(tptp_problem);
                        dictionary_utilities.dictionary_push(dict, tptp_datastructures.tptp_problem_pair_num(tptp_problem), num);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = tptp_problems;
                SubLObject tptp_problem = NIL;
                for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                    {
                        SubLObject counterpart_num = NIL;
                        if (NIL != tptp_datastructures.tptp_problem_dynamicP(tptp_problem)) {
                            {
                                SubLObject num = tptp_datastructures.tptp_problem_num(tptp_problem);
                                counterpart_num = list_utilities.only_one(remove(num, dictionary.dictionary_lookup(dict, tptp_datastructures.tptp_problem_pair_num(tptp_problem), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            }
                        }
                        if (NIL != counterpart_num) {
                            tptp_problem = tptp_datastructures.tptp_problem_nset_property(tptp_problem, $COUNTERPART_NUM, counterpart_num);
                        }
                        tptp_problem = tptp_datastructures.tptp_problem_delete_property(tptp_problem, $PAIR_NUM);
                        new_tptp_problems = cons(tptp_problem, new_tptp_problems);
                    }
                }
            }
            return nreverse(new_tptp_problems);
        }
    }

    public static final SubLObject add_headers_to_tptp_problems(SubLObject tptp_problems) {
        {
            SubLObject new_tptp_problems = NIL;
            SubLObject problem_series_string = tptp_problem_series_pragma_string(tptp_problems);
            SubLObject cdolist_list_var = tptp_problems;
            SubLObject tptp_problem = NIL;
            for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                {
                    SubLObject header = generate_tptp_problem_header(tptp_problem, problem_series_string);
                    new_tptp_problems = cons(tptp_datastructures.tptp_problem_nset_property(tptp_problem, $HEADER, header), new_tptp_problems);
                }
            }
            return nreverse(new_tptp_problems);
        }
    }

    public static final SubLObject reset_tptp_problem_set_kb_spec(SubLObject problem_set) {
        {
            SubLObject new_kb_spec = construct_tptp_kb_spec(problem_set);
            tptp_datastructures.set_tptp_problem_set_kb_spec(problem_set, new_kb_spec);
        }
        return problem_set;
    }

    public static final SubLObject construct_tptp_kb_spec(SubLObject problem_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject possibly_empty_kb_spec = tptp_datastructures.tptp_problem_set_kb_spec(problem_set);
                SubLObject kb_content = tptp_datastructures.tptp_kb_spec_kb_content(possibly_empty_kb_spec);
                SubLObject static_assertions = tptp_datastructures.tptp_kb_spec_static_assertions(possibly_empty_kb_spec);
                SubLObject proof_checker_modeP = tptp_datastructures.tptp_problem_set_proof_checker_modeP(problem_set);
                SubLObject linchpin_assertions = tptp_problem_set_linchpin_assertions(problem_set);
                SubLObject non_linchpin_supports = tptp_problem_set_non_linchpin_supports(problem_set, proof_checker_modeP);
                SubLObject assertion_blacklist_set = (NIL != proof_checker_modeP) ? ((SubLObject) (set.new_set(symbol_function(EQ), UNPROVIDED))) : tptp_problem_set_dynamic_kb_assertion_set(problem_set);
                set_utilities.set_add_all(linchpin_assertions, assertion_blacklist_set);
                set_utilities.set_add_all(non_linchpin_supports, assertion_blacklist_set);
                {
                    SubLObject combined_justification = tptp_problem_set_combined_justification(problem_set);
                    SubLObject chaff_gafs = compute_static_chaff_gafs(static_assertions, assertion_blacklist_set, $tptp_relevant_chaff_count$.getDynamicValue(thread), $tptp_total_chaff_ratio$.getDynamicValue(thread), combined_justification);
                    SubLObject assertions = list_utilities.randomize_list(append(non_linchpin_supports, chaff_gafs));
                    return tptp_datastructures.new_tptp_kb_spec(kb_content, assertions);
                }
            }
        }
    }

    /**
     * All the supports in PROBLEM-SET that are not linchpins.  We must ensure these are
     * added to the static KB, or else nothing will be provable.
     * Unless, that is, PROOF-CHECKER-MODE? is non-nil, in which case the justifications
     * will be in the problems themselves, and so we don't need to worry about the non-linchpin supports.
     */
    public static final SubLObject tptp_problem_set_non_linchpin_supports(SubLObject problem_set, SubLObject proof_checker_modeP) {
        if (NIL != proof_checker_modeP) {
            return NIL;
        } else {
            {
                SubLObject combined_justification = tptp_problem_set_combined_justification(problem_set);
                SubLObject linchpin_assertions = tptp_problem_set_linchpin_assertions(problem_set);
                return list_utilities.fast_set_difference(combined_justification, linchpin_assertions, UNPROVIDED);
            }
        }
    }

    public static final SubLObject tptp_problem_set_combined_justification(SubLObject problem_set) {
        {
            SubLObject combined_justification = NIL;
            SubLObject tptp_problems = tptp_datastructures.tptp_problem_set_tptp_problems(problem_set);
            SubLObject cdolist_list_var = tptp_problems;
            SubLObject tptp_problem = NIL;
            for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                {
                    SubLObject justification = tptp_datastructures.tptp_problem_justification(tptp_problem);
                    combined_justification = append(justification, combined_justification);
                }
            }
            return list_utilities.fast_delete_duplicates(combined_justification, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject tptp_problem_set_linchpin_assertions(SubLObject problem_set) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tptp_datastructures.tptp_problem_set_tptp_problems(problem_set);
            SubLObject tptp_problem = NIL;
            for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                if (NIL != tptp_datastructures.tptp_problem_dynamicP(tptp_problem)) {
                    {
                        SubLObject linchpin = tptp_datastructures.tptp_problem_linchpin(tptp_problem);
                        if (NIL != assertion_handles.assertion_p(linchpin)) {
                            result = cons(linchpin, result);
                        } else {
                            {
                                SubLObject assertions = kb_accessors.all_term_assertions(linchpin, UNPROVIDED);
                                SubLObject items_var = assertions;
                                if (items_var.isVector()) {
                                    {
                                        SubLObject vector_var = assertions;
                                        SubLObject backwardP_var = NIL;
                                        SubLObject length = length(vector_var);
                                        SubLObject v_iteration = NIL;
                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            {
                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                SubLObject item = aref(vector_var, element_num);
                                                result = cons(item, result);
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject cdolist_list_var_14 = assertions;
                                        SubLObject item = NIL;
                                        for (item = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , item = cdolist_list_var_14.first()) {
                                            result = cons(item, result);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static final SubLObject tptp_problem_set_dynamic_kb_assertion_set(SubLObject problem_set) {
        {
            SubLObject dynamic_kb_set = set.new_set(symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = tptp_datastructures.tptp_problem_set_typed_include_lists(problem_set);
            SubLObject typed_include_list = NIL;
            for (typed_include_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typed_include_list = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_15 = typed_include_list_indexed_terms(typed_include_list);
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , v_term = cdolist_list_var_15.first()) {
                        if (NIL != assertion_handles.assertion_p(v_term)) {
                            {
                                SubLObject ass = v_term;
                                set.set_add(ass, dynamic_kb_set);
                            }
                        } else {
                            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                        {
                                                            SubLObject done_var_16 = NIL;
                                                            SubLObject token_var_17 = NIL;
                                                            while (NIL == done_var_16) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                                                    SubLObject valid_18 = makeBoolean(token_var_17 != ass);
                                                                    if (NIL != valid_18) {
                                                                        if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                                            set.set_add(ass, dynamic_kb_set);
                                                                        }
                                                                    }
                                                                    done_var_16 = makeBoolean(NIL == valid_18);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                            try {
                                                                bind($is_thread_performing_cleanupP$, T);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    }
                }
            }
            return dynamic_kb_set;
        }
    }

    /**
     * This function ensures that all of EXISTING-STATIC-ASSERTIONS are included in the returned list of static chaff.
     */
    public static final SubLObject compute_static_chaff_gafs(SubLObject existing_static_assertions, SubLObject assertion_blacklist_set, SubLObject relevant_chaff_count, SubLObject total_chaff_ratio, SubLObject combined_justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (ONE_INTEGER.numE(total_chaff_ratio)) {
                return some_irrelevant_chaff_gafs_not_mentioning_assertion_set(assertion_blacklist_set, total_chaff_ratio);
            } else
                if (NIL != number_utilities.positive_number_p(total_chaff_ratio)) {
                    {
                        SubLObject some_irrelevant_chaff = some_irrelevant_chaff_gafs_not_mentioning_assertion_set(assertion_blacklist_set, total_chaff_ratio);
                        return list_utilities.fast_delete_duplicates(append(existing_static_assertions, some_irrelevant_chaff), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!total_chaff_ratio.isZero()) {
                            Errors.error($str_alt60$Expected_no_irrelevant_chaff__got, total_chaff_ratio);
                        }
                    }
                    {
                        SubLObject relevant_chaff = NIL;
                        if (relevant_chaff_count.isZero()) {
                            relevant_chaff = NIL;
                        } else {
                            {
                                SubLObject existing_relevant_chaff_count = length(existing_static_assertions);
                                SubLObject new_relevant_chaff_count = subtract(relevant_chaff_count, existing_relevant_chaff_count);
                                SubLObject chaff_blacklist_set = set.copy_set(assertion_blacklist_set);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == subl_promotions.non_negative_integer_p(new_relevant_chaff_count)) {
                                        Errors.error(Errors.error($str_alt61$Can_t_decrease_relevant_chaff__go, relevant_chaff_count, existing_relevant_chaff_count, new_relevant_chaff_count));
                                    }
                                }
                                set_utilities.set_add_all(existing_static_assertions, chaff_blacklist_set);
                                {
                                    SubLObject new_relevant_chaff = some_relevant_chaff_gafs_not_mentioning_assertion_set(combined_justification, chaff_blacklist_set, new_relevant_chaff_count);
                                    relevant_chaff = list_utilities.fast_delete_duplicates(append(existing_static_assertions, new_relevant_chaff), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                        return relevant_chaff;
                    }
                }

        }
    }

    public static final SubLObject some_relevant_chaff_gafs_not_mentioning_assertion_set(SubLObject combined_justification, SubLObject assertion_blacklist_set, SubLObject relevant_chaff_count) {
        {
            SubLObject combined_justification_set = set_utilities.construct_set_from_list(list_utilities.remove_if_not($sym62$GAF_ASSERTION_, combined_justification, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQ), UNPROVIDED);
            SubLObject chaff_set = generate_chaff_similar_to_assertions_iterative(combined_justification_set, relevant_chaff_count, assertion_blacklist_set, UNPROVIDED);
            return set.set_element_list(chaff_set);
        }
    }

    /**
     * Includes KB gafs in addition to synthetic gafs
     */
    public static final SubLObject some_irrelevant_chaff_gafs_not_mentioning_assertion_set(SubLObject assertion_blacklist_set, SubLObject total_chaff_ratio) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject chaff = NIL;
                if (NIL != number_utilities.positive_number_p(total_chaff_ratio)) {
                    if (total_chaff_ratio.numL($float$0_1)) {
                        {
                            SubLObject v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                            SubLObject target = round(multiply(assertion_handles.assertion_count(), total_chaff_ratio), UNPROVIDED);
                            while (!set.set_size(v_set).numGE(target)) {
                                set.set_add(assertions_high.random_gaf(), v_set);
                            } 
                            chaff = set.set_element_list(v_set);
                        }
                    } else {
                        {
                            SubLObject idx = assertion_handles.do_assertions_table();
                            SubLObject total = id_index.id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType($$$Gathering_all_gafs, STRINGP);
                            {
                                SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble($$$Gathering_all_gafs);
                                    if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                            SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                            SubLObject gaf = NIL;
                                            while (NIL != id) {
                                                gaf = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != id_index.do_id_index_id_and_object_validP(id, gaf, $SKIP)) {
                                                    utilities_macros.note_percent_progress(sofar, total);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    if (NIL != assertions_high.gaf_assertionP(gaf)) {
                                                        if (NIL == set.set_memberP(gaf, assertion_blacklist_set)) {
                                                            if (NIL != number_utilities.true_with_probability(total_chaff_ratio)) {
                                                                chaff = cons(gaf, chaff);
                                                            }
                                                        }
                                                    }
                                                }
                                                id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                            } 
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                chaff = nreverse(chaff);
                return chaff;
            }
        }
    }

    public static final SubLObject apply_chaff_generator_to_assertion(SubLObject generator_fn, SubLObject assertion, SubLObject blacklist_set, SubLObject chosen_set) {
        {
            SubLObject suggestion = funcall(generator_fn, assertion, blacklist_set, chosen_set);
            if (NIL != suggestion) {
                set.set_add(suggestion, chosen_set);
            }
        }
        return chosen_set;
    }

    public static final SubLObject chaff_generator_transitive_generality_estimate(SubLObject assertion, SubLObject blacklist_set, SubLObject chosen_set) {
        {
            SubLObject pred = assertions_high.gaf_predicate(assertion);
            if (NIL != fort_types_interface.transitive_binary_predicate_p(pred)) {
                {
                    SubLObject max_generality = ZERO_INTEGER;
                    SubLObject best_gaf = NIL;
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL($int$30); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject argnum = (NIL != number_utilities.coin_flip()) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                            SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
                            SubLObject gaf = random_gaf_with_pred_and_arg(pred, arg, argnum, assertion, blacklist_set, chosen_set);
                            if (NIL != gaf) {
                                {
                                    SubLObject generality = add(cardinality_estimates.generality_estimate(assertions_high.gaf_arg1(gaf)), cardinality_estimates.generality_estimate(assertions_high.gaf_arg2(gaf)));
                                    if (generality.numG(max_generality)) {
                                        max_generality = generality;
                                        best_gaf = gaf;
                                    }
                                }
                            }
                        }
                    }
                    return best_gaf;
                }
            }
        }
        return NIL;
    }

    /**
     * Generate chaff by getting a random gaf with the same predicate.
     */
    public static final SubLObject chaff_generator_random_gaf_with_same_predicate(SubLObject assertion, SubLObject blacklist_set, SubLObject chosen_set) {
        {
            SubLObject hl_formula = assertions_high.assertion_formula(assertion);
            SubLObject predicate = cycl_utilities.formula_arg0(hl_formula);
            if (NIL == fort_types_interface.rule_macro_predicate_p(predicate)) {
                {
                    SubLObject max_iterations = kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(max_iterations); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject idea = assertion_utilities.random_gaf_with_pred(predicate);
                            if (!(((idea == assertion) || (NIL != set.set_memberP(idea, blacklist_set))) || (NIL != set.set_memberP(idea, chosen_set)))) {
                                return idea;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Generate chaff by getting a random gaf with some specialization of the predicate.
     */
    public static final SubLObject chaff_generator_random_gaf_with_spec_predicate(SubLObject assertion, SubLObject blacklist_set, SubLObject chosen_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_formula = assertions_high.assertion_formula(assertion);
                SubLObject parent_predicate = cycl_utilities.formula_arg0(hl_formula);
                SubLObject spec_predicates = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        spec_predicates = genl_predicates.spec_predicates(parent_predicate, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = list_utilities.randomize_list(spec_predicates);
                    SubLObject predicate = NIL;
                    for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                        if (NIL == fort_types_interface.rule_macro_predicate_p(predicate)) {
                            {
                                SubLObject max_iterations = kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED);
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL(max_iterations); i = add(i, ONE_INTEGER)) {
                                    {
                                        SubLObject idea = assertion_utilities.random_gaf_with_pred(predicate);
                                        if (!(((idea == assertion) || (NIL != set.set_memberP(idea, blacklist_set))) || (NIL != set.set_memberP(idea, chosen_set)))) {
                                            return idea;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Generate chaff by getting a random gaf that shares a predicate and a term in the arg1 or arg2 position
     * with the passed-in assertion.
     */
    public static final SubLObject chaff_generator_random_gaf_for_term(SubLObject assertion, SubLObject blacklist_set, SubLObject chosen_set) {
        {
            SubLObject hl_formula = assertions_high.assertion_formula(assertion);
            SubLObject parent_predicate = cycl_utilities.formula_arg0(hl_formula);
            SubLObject argnum = (NIL != number_utilities.coin_flip()) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
            SubLObject parent_term = cycl_utilities.formula_arg(hl_formula, argnum, UNPROVIDED);
            return random_gaf_with_pred_and_arg(parent_predicate, parent_term, argnum, assertion, blacklist_set, chosen_set);
        }
    }

    public static final SubLObject random_gaf_with_pred_and_arg(SubLObject pred, SubLObject arg, SubLObject argnum, SubLObject blacklist_assertion, SubLObject blacklist_set_1, SubLObject blacklist_set_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gafs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        gafs = kb_mapping.gather_gaf_arg_index(arg, argnum, pred, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = list_utilities.randomize_list(gafs);
                    SubLObject gaf = NIL;
                    for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                        if (!(((gaf == blacklist_assertion) || (NIL != set.set_memberP(gaf, blacklist_set_1))) || (NIL != set.set_memberP(gaf, blacklist_set_2)))) {
                            return gaf;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * An alist mapping chaff generator module keywords to their functions.
     */
    // deflexical
    private static final SubLSymbol $chaff_generator_modules$ = makeSymbol("*CHAFF-GENERATOR-MODULES*");

    /**
     * The default chaff generator set probability distribution.
     */
    // deflexical
    private static final SubLSymbol $default_chaff_generator_distribution$ = makeSymbol("*DEFAULT-CHAFF-GENERATOR-DISTRIBUTION*");

    /**
     * Generates a set of QUOTA assertions similar to the assertions in ASSERTION-SET.
     * Will not generate assertions in ASSERTION-BLACKLIST-SET.
     * If necessary, will iterate to build chaff off the chaff.
     */
    public static final SubLObject generate_chaff_similar_to_assertions_iterative(SubLObject assertion_set, SubLObject quota, SubLObject assertion_blacklist_set, SubLObject chaff_generation_set) {
        if (assertion_blacklist_set == UNPROVIDED) {
            assertion_blacklist_set = assertion_set;
        }
        if (chaff_generation_set == UNPROVIDED) {
            chaff_generation_set = $default_chaff_generator_distribution$.getGlobalValue();
        }
        {
            SubLObject assertions_to_try = set.copy_set(assertion_set);
            SubLObject blacklist_set = set.copy_set(assertion_blacklist_set);
            SubLObject remaining_quota = quota;
            SubLObject result = set.new_set(symbol_function(EQ), quota);
            while (!set.set_size(result).numGE(quota)) {
                {
                    SubLObject chosen_set = generate_chaff_similar_to_assertions(assertions_to_try, remaining_quota, blacklist_set, chaff_generation_set);
                    SubLObject chosen_assertions = set.set_element_list(chosen_set);
                    set_utilities.set_add_all(chosen_assertions, result);
                    remaining_quota = subtract(quota, set.set_size(chosen_set));
                    set_utilities.set_add_all(chosen_assertions, blacklist_set);
                    assertions_to_try = set.copy_set(chosen_set);
                }
            } 
            return result;
        }
    }

    /**
     * Generates a set of at most QUOTA assertions similar to the assertions in ASSERTION-SET.
     * Will not generate assertions in ASSERTION-BLACKLIST-SET.
     */
    public static final SubLObject generate_chaff_similar_to_assertions(SubLObject assertion_set, SubLObject quota, SubLObject assertion_blacklist_set, SubLObject chaff_generation_set) {
        {
            SubLObject chosen_set = set.new_set(symbol_function(EQ), quota);
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                {
                    SubLObject exhausted = set.new_set(symbol_function(EQ), UNPROVIDED);
                    SubLObject set_contents_var = set.do_set_internal(assertion_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != doneP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject assertion = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, assertion)) {
                                {
                                    SubLObject successP = generate_one_chaff_gaf_similar_to_assertion(assertion, assertion_blacklist_set, chaff_generation_set, chosen_set);
                                    if (NIL == successP) {
                                        set.set_add(assertion, exhausted);
                                    }
                                    if (ZERO_INTEGER.numE(mod(set.set_size(chosen_set), $int$1000))) {
                                        format_nil.force_format(T, $str_alt70$___a_relevant_chaff_gafs_generate, set.set_size(chosen_set), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    doneP = numGE(set.set_size(chosen_set), quota);
                                }
                            }
                        }
                    }
                    set_utilities.set_nprune(assertion_set, exhausted);
                }
                if (NIL != set.empty_set_p(assertion_set)) {
                    doneP = T;
                }
            } 
            return chosen_set;
        }
    }

    /**
     *
     *
     * @return booleanp; whether the generation succeeded.
    Modifies CHOSEN-SET by side effect if the generation succeeded.
     */
    public static final SubLObject generate_one_chaff_gaf_similar_to_assertion(SubLObject assertion, SubLObject assertion_blacklist_set, SubLObject chaff_generation_set, SubLObject chosen_set) {
        {
            SubLObject old_size = set.set_size(chosen_set);
            SubLObject got_oneP = NIL;
            if (NIL == got_oneP) {
                {
                    SubLObject end_var = TEN_INTEGER;
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; !((NIL != got_oneP) || i.numGE(end_var)); i = number_utilities.f_1X(i)) {
                        {
                            SubLObject chaff_generator_name = number_utilities.probability_distribution_sample(chaff_generation_set);
                            SubLObject generator_fn = list_utilities.alist_lookup_without_values($chaff_generator_modules$.getGlobalValue(), chaff_generator_name, UNPROVIDED, UNPROVIDED);
                            chosen_set = apply_chaff_generator_to_assertion(generator_fn, assertion, assertion_blacklist_set, chosen_set);
                        }
                        if (set.set_size(chosen_set).numG(old_size)) {
                            got_oneP = T;
                        }
                    }
                }
            }
            return got_oneP;
        }
    }

    public static final SubLObject estimated_rule_to_gaf_ratio() {
        return divide(subtract(add(ONE_INTEGER, assertion_handles.assertion_count()), keyhash.keyhash_count(assertions_low.kb_rule_set())), add(ONE_INTEGER, assertion_handles.assertion_count()));
    }

    public static final SubLObject generate_tptp_problem_header(SubLObject tptp_problem, SubLObject problem_series_string) {
        {
            SubLObject header = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                print_tptp_problem_header(tptp_problem, problem_series_string, stream);
                header = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return header;
        }
    }

    // deflexical
    private static final SubLSymbol $opencyc_license_as_tptp_comment$ = makeSymbol("*OPENCYC-LICENSE-AS-TPTP-COMMENT*");

    public static final SubLObject print_tptp_problem_header(SubLObject tptp_problem, SubLObject problem_series_string, SubLObject stream) {
        format(stream, $str_alt72$_________________________________);
        format(stream, $str_alt73$__File________a___TPTP_v_a___a___, new SubLObject[]{ tptp_problem_name(tptp_problem), tptp_current_release_string(), tptp_release_or_bugfix_string() });
        format(stream, $str_alt74$__Domain_____Common_Sense_Reasoni);
        format(stream, $str_alt75$__Problem____Autogenerated_Cyc_Pr, tptp_problem_name(tptp_problem));
        format(stream, $str_alt76$__Version_____a__, tptp_problem_version_string());
        format(stream, $str_alt77$__English_____a__, tptp_problem_english_string());
        format(stream, $str_alt78$__);
        format(stream, $str_alt79$__Refs_________);
        format(stream, $str_alt80$__Source_____Cyc__);
        format(stream, $str_alt81$__Names________);
        format(stream, $str_alt78$__);
        format(stream, $str_alt82$__Status______a__, tptp_problem_status_string(tptp_problem));
        format(stream, $str_alt83$__Rating_______);
        format(stream, $str_alt84$__Syntax_______);
        format(stream, $str_alt78$__);
        format(stream, $opencyc_license_as_tptp_comment$.getGlobalValue());
        format(stream, $str_alt72$_________________________________);
        format(stream, problem_series_string);
        return NIL;
    }

    public static final SubLObject generate_tptp_axiom_header(SubLObject filename) {
        {
            SubLObject header = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                print_tptp_axiom_header(filename, stream);
                header = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return header;
        }
    }

    public static final SubLObject print_tptp_axiom_header(SubLObject filename, SubLObject stream) {
        format(stream, $str_alt72$_________________________________);
        format(stream, $str_alt73$__File________a___TPTP_v_a___a___, new SubLObject[]{ filename, tptp_current_release_string(), tptp_release_or_bugfix_string() });
        format(stream, $str_alt74$__Domain_____Common_Sense_Reasoni);
        format(stream, $str_alt85$__Axioms_____some_axioms_from_Cyc);
        format(stream, $str_alt76$__Version_____a__, tptp_problem_version_string());
        format(stream, $str_alt77$__English_____a__, tptp_problem_english_string());
        format(stream, $str_alt78$__);
        format(stream, $str_alt79$__Refs_________);
        format(stream, $str_alt80$__Source_____Cyc__);
        format(stream, $str_alt81$__Names________);
        format(stream, $str_alt78$__);
        format(stream, $str_alt86$__Status_______);
        format(stream, $str_alt83$__Rating_______);
        format(stream, $str_alt84$__Syntax_______);
        format(stream, $str_alt78$__);
        format(stream, $opencyc_license_as_tptp_comment$.getGlobalValue());
        format(stream, $str_alt72$_________________________________);
        format(stream, $str_alt78$__);
        return NIL;
    }

    public static final SubLObject tptp_current_release_string() {
        return $tptp_current_release_string$.getGlobalValue();
    }

    public static final SubLObject tptp_problem_name(SubLObject tptp_problem) {
        {
            SubLObject num = tptp_datastructures.tptp_problem_num(tptp_problem);
            return cconcatenate($tptp_domain_prefix$.getGlobalValue(), format(NIL, $str_alt87$_3__0d_1, num));
        }
    }

    public static final SubLObject tptp_release_or_bugfix_string() {
        return cconcatenate($$$Released_v, tptp_current_release_string());
    }

    public static final SubLObject tptp_problem_parameters_string(SubLObject tptp_problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject additional_plist = append($tptp_folification_properties$.getDynamicValue(thread), list($KB, control_vars.kb_loaded(), $SYSTEM, system_info.cyc_revision_numbers()));
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $print_length$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        $print_length$.bind(NIL, thread);
                        $print_level$.bind(NIL, thread);
                        result = format_nil.format_nil_s(list_utilities.merge_plist(tptp_problem, additional_plist));
                    } finally {
                        $print_level$.rebind(_prev_bind_2, thread);
                        $print_length$.rebind(_prev_bind_1, thread);
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject tptp_problem_series_pragma_string(SubLObject tptp_problems) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    format(stream, $str_alt91$__problem_series__a___a, $tptp_problem_series_string$.getDynamicValue(thread), tptp_problem_name(tptp_problems.first()));
                    {
                        SubLObject cdolist_list_var = tptp_problems.rest();
                        SubLObject tptp_problem = NIL;
                        for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                            format(stream, $str_alt92$__a, tptp_problem_name(tptp_problem));
                        }
                    }
                    format(stream, $str_alt93$____);
                    string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return string;
            }
        }
    }

    public static final SubLObject tptp_kb_spec_string(SubLObject kb_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $print_length$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        $print_length$.bind(NIL, thread);
                        $print_level$.bind(NIL, thread);
                        result = string_utilities.str(kb_spec);
                    } finally {
                        $print_level$.rebind(_prev_bind_2, thread);
                        $print_length$.rebind(_prev_bind_1, thread);
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject tptp_problem_version_string() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $tptp_problem_version_string$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tptp_problem_english_string() {
        return $str_alt94$None__problem_was_autogenerated_;
    }

    public static final SubLObject tptp_problem_status_string(SubLObject tptp_problem) {
        {
            SubLObject answerability = tptp_datastructures.tptp_problem_answerability(tptp_problem);
            SubLObject pcase_var = answerability;
            if (pcase_var.eql($ANSWERABLE)) {
                return $$$Theorem;
            } else
                if (pcase_var.eql($UNANSWERABLE)) {
                    return $$$CounterSatisfiable;
                } else {
                    return Errors.error($str_alt97$Unexpected_answerability__s, answerability);
                }

        }
    }

    /**
     * Converts PROBLEM-SET to first-order TPTP format and writes it to disk.
     */
    public static final SubLObject folify_tptp_problem_set(SubLObject problem_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject explicit_directory_specifiedP = list_utilities.sublisp_boolean($tptp_explicit_directory$.getDynamicValue(thread));
                SubLObject output_directory = (NIL != explicit_directory_specifiedP) ? ((SubLObject) ($tptp_explicit_directory$.getDynamicValue(thread))) : file_utilities.timestamp_subdirectory($tptp_output_base_directory$.getGlobalValue());
                file_utilities.make_directory_or_possibly_error(output_directory, NIL, makeBoolean(NIL == explicit_directory_specifiedP));
                file_utilities.make_directory_or_possibly_error($tptp_axioms_subdirectory$.getGlobalValue(), output_directory, makeBoolean(NIL == explicit_directory_specifiedP));
                nset_tptp_problem_output_filenames(problem_set, output_directory);
                folification.clear_tptp_long_symbol_name_cache();
                folify_static_kb_include_list(problem_set, output_directory);
                {
                    SubLObject proof_checker_modeP = tptp_datastructures.tptp_problem_set_proof_checker_modeP(problem_set);
                    if (NIL == proof_checker_modeP) {
                        {
                            SubLObject typed_include_lists = tptp_datastructures.tptp_problem_set_typed_include_lists(problem_set);
                            folify_dynamic_include_lists(typed_include_lists, output_directory);
                        }
                    }
                    {
                        SubLObject tptp_problems = tptp_datastructures.tptp_problem_set_tptp_problems(problem_set);
                        SubLObject cdolist_list_var = tptp_problems;
                        SubLObject tptp_problem = NIL;
                        for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                            if (NIL != proof_checker_modeP) {
                                folify_tptp_problem_proof_checker_mode(tptp_problem);
                            } else {
                                folify_tptp_problem(tptp_problem);
                            }
                        }
                    }
                }
                return output_directory;
            }
        }
    }

    /**
     * Assumes that the destructivity will work without having to reset any pointers
     */
    public static final SubLObject nset_tptp_problem_output_filenames(SubLObject problem_set, SubLObject output_directory) {
        {
            SubLObject tptp_problems = tptp_datastructures.tptp_problem_set_tptp_problems(problem_set);
            SubLObject cdolist_list_var = tptp_problems;
            SubLObject tptp_problem = NIL;
            for (tptp_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tptp_problem = cdolist_list_var.first()) {
                {
                    SubLObject num = tptp_datastructures.tptp_problem_num(tptp_problem);
                    SubLObject output_filename = construct_tptp_problem_output_filename(output_directory, num);
                    tptp_datastructures.tptp_problem_nset_property(tptp_problem, $OUTPUT_FILENAME, output_filename);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject construct_tptp_problem_output_filename(SubLObject directory, SubLObject i) {
        return construct_tptp_output_filename(directory, i, ONE_INTEGER, $$$p);
    }

    public static final SubLObject construct_tptp_axiom_output_filename(SubLObject directory, SubLObject j) {
        {
            SubLObject subdirectory = cconcatenate(directory, $tptp_axioms_subdirectory$.getGlobalValue());
            return construct_tptp_output_filename(subdirectory, TWO_INTEGER, j, $$$ax);
        }
    }

    public static final SubLObject construct_tptp_output_filename(SubLObject directory, SubLObject i, SubLObject j, SubLObject extension) {
        {
            SubLObject prefix = $tptp_domain_prefix$.getGlobalValue();
            return format(NIL, $str_alt101$_a_a_3__0d__a__a, new SubLObject[]{ directory, prefix, i, j, extension });
        }
    }

    public static final SubLObject folify_static_kb_include_list(SubLObject problem_set, SubLObject output_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kb_spec = tptp_datastructures.tptp_problem_set_kb_spec(problem_set);
                SubLObject assertions = tptp_datastructures.tptp_kb_spec_static_assertions(kb_spec);
                return folify_include_list($tptp_axiom_file_offset_number$.getDynamicValue(thread), assertions, output_directory);
            }
        }
    }

    public static final SubLObject folify_dynamic_include_lists(SubLObject typed_include_lists, SubLObject output_directory) {
        {
            SubLObject cdolist_list_var = typed_include_lists;
            SubLObject typed_include_list = NIL;
            for (typed_include_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typed_include_list = cdolist_list_var.first()) {
                folify_dynamic_include_list(typed_include_list, output_directory);
            }
        }
        return NIL;
    }

    public static final SubLObject folify_dynamic_include_list(SubLObject typed_include_list, SubLObject output_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = typed_include_list_id(typed_include_list);
                SubLObject assertions = list_utilities.randomize_list(typed_include_list_assertions(typed_include_list));
                return folify_include_list(add(id, $tptp_axiom_file_offset_number$.getDynamicValue(thread)), assertions, output_directory);
            }
        }
    }

    public static final SubLObject folify_include_list(SubLObject id, SubLObject assertions, SubLObject output_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_filename = construct_tptp_axiom_output_filename(output_directory, id);
                SubLObject tptp_export_properties = tptp_axiom_file_export_properties(output_filename);
                {
                    SubLObject _prev_bind_0 = folification.$tptp_axiom_prefix$.currentBinding(thread);
                    try {
                        folification.$tptp_axiom_prefix$.bind(cconcatenate($$$ax, new SubLObject[]{ string_utilities.str(id), $str_alt102$_ }), thread);
                        folification.cycl_assertions_to_fol(assertions, tptp_export_properties, UNPROVIDED);
                    } finally {
                        folification.$tptp_axiom_prefix$.rebind(_prev_bind_0, thread);
                    }
                }
                return output_filename;
            }
        }
    }

    /**
     * For testing
     */
    public static final SubLObject tptp_folify_assertion(SubLObject assertion) {
        {
            SubLObject output_filename = cconcatenate(file_utilities.temp_directory(), $str_alt103$temp_p);
            SubLObject tptp_export_properties = tptp_axiom_file_export_properties_int(output_filename, cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[]{ $str_alt104$__TPTP_FOLIFY_ASSERTION_TEST, format_nil.$format_nil_percent$.getGlobalValue(), format_nil.$format_nil_percent$.getGlobalValue() }));
            folification.cycl_assertions_to_fol(list(assertion), tptp_export_properties, UNPROVIDED);
            return file_utilities.slurp_file(output_filename);
        }
    }

    public static final SubLObject tptp_axiom_file_export_properties(SubLObject output_filename) {
        {
            SubLObject relative_filename = tptp_axiom_file_filename(output_filename);
            SubLObject header = generate_tptp_axiom_header(relative_filename);
            return tptp_axiom_file_export_properties_int(output_filename, header);
        }
    }

    public static final SubLObject tptp_axiom_file_export_properties_int(SubLObject output_filename, SubLObject header) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_format = $TPTP;
                return append(list($HEADER, header, $OUTPUT_FILENAME, output_filename, $OUTPUT_FORMAT, output_format), $tptp_folification_properties$.getDynamicValue(thread));
            }
        }
    }

    public static final SubLObject tptp_axiom_file_relative_filename(SubLObject full_pathname) {
        {
            SubLObject target_length = add(length($tptp_axioms_subdirectory$.getGlobalValue()), ELEVEN_INTEGER);
            SubLObject full_length = length(full_pathname);
            return string_utilities.substring(full_pathname, subtract(full_length, target_length), full_length);
        }
    }

    public static final SubLObject tptp_axiom_file_filename(SubLObject full_pathname) {
        {
            SubLObject target_length = EIGHT_INTEGER;
            SubLObject extension_length = THREE_INTEGER;
            SubLObject full_length = length(full_pathname);
            return string_utilities.substring(full_pathname, subtract(full_length, extension_length, target_length), subtract(full_length, extension_length));
        }
    }

    public static final SubLObject folify_tptp_problem(SubLObject tptp_problem) {
        return folify_tptp_problem_int(tptp_problem, NIL, $$$error, NIL);
    }

    public static final SubLObject folify_tptp_problem_proof_checker_mode(SubLObject tptp_problem) {
        {
            SubLObject justification = tptp_problem_possibly_partial_justification(tptp_problem);
            SubLObject axiom_prefix = $$$just;
            return folify_tptp_problem_int(tptp_problem, justification, axiom_prefix, T);
        }
    }

    public static final SubLObject folify_tptp_problem_int(SubLObject tptp_problem, SubLObject assertions, SubLObject axiom_prefix, SubLObject proof_checker_modeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem_num = tptp_datastructures.tptp_problem_num(tptp_problem);
                SubLObject tptp_export_properties = tptp_problem_export_properties(tptp_problem, proof_checker_modeP);
                SubLObject output_filename = tptp_datastructures.tptp_problem_output_filename(tptp_problem);
                {
                    SubLObject _prev_bind_0 = folification.$tptp_axiom_prefix$.currentBinding(thread);
                    try {
                        folification.$tptp_axiom_prefix$.bind(axiom_prefix, thread);
                        {
                            SubLObject fol_sentences_analysis = folification.cycl_assertions_to_fol(assertions, tptp_export_properties, UNPROVIDED);
                            SubLObject cycl_ist_query = tptp_datastructures.tptp_problem_query(tptp_problem);
                            SubLObject fol_query = tptp_problem_query_fol_query(cycl_ist_query, tptp_export_properties);
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_19 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_text(output_filename, $APPEND, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt110$Unable_to_open__S, output_filename);
                                }
                                {
                                    SubLObject stream_20 = stream;
                                    {
                                        SubLObject _prev_bind_0_21 = folification.$tptp_query_name$.currentBinding(thread);
                                        try {
                                            folification.$tptp_query_name$.bind(cconcatenate($$$query, string_utilities.str(problem_num)), thread);
                                            folification.fol_query_to_stream(fol_query, fol_sentences_analysis, $TPTP, stream_20);
                                        } finally {
                                            folification.$tptp_query_name$.rebind(_prev_bind_0_21, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        folification.$tptp_axiom_prefix$.rebind(_prev_bind_0, thread);
                    }
                }
                return output_filename;
            }
        }
    }

    public static final SubLObject cycl_query_folifiableP(SubLObject cycl_ist_query) {
        return folifiableP(tptp_problem_query_fol_query(cycl_ist_query, UNPROVIDED));
    }

    /**
     * If any of these predicates appear in a justification, we deem the justification (and hence its query) unfolifiable.
     */
    // deflexical
    private static final SubLSymbol $unfolifiable_justification_preds$ = makeSymbol("*UNFOLIFIABLE-JUSTIFICATION-PREDS*");

    /**
     * If any of these terms appear in a justification, we deem the justification (and hence its query) unfolifiable.
     */
    // deflexical
    private static final SubLSymbol $unfolifiable_justification_terms$ = makeSymbol("*UNFOLIFIABLE-JUSTIFICATION-TERMS*");

    public static final SubLObject unfolifiable_justification_term_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $unfolifiable_justification_terms$.getGlobalValue());
    }

    public static final SubLObject justification_folifiableP(SubLObject justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject non_assertion_supports = remove_if(ASSERTION_P, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != non_assertion_supports) {
                    Errors.warn($str_alt115$Found_non_assertion_supports__a, non_assertion_supports);
                    return NIL;
                } else {
                    {
                        SubLObject cdolist_list_var = justification;
                        SubLObject assertion = NIL;
                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                            if (NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(assertion, $unfolifiable_justification_preds$.getGlobalValue())) {
                                return NIL;
                            }
                            {
                                SubLObject mt = assertions_high.assertion_mt(assertion);
                                if ((($$EverythingPSC == mt) || ($$InferencePSC == mt)) || (NIL == forts.fort_p(mt))) {
                                    return NIL;
                                }
                            }
                            if (NIL != cycl_utilities.assertion_find_if(UNFOLIFIABLE_JUSTIFICATION_TERM_P, assertion, T, UNPROVIDED)) {
                                return NIL;
                            }
                        }
                    }
                    {
                        SubLObject v_properties = list_utilities.merge_plist($tptp_folification_properties$.getDynamicValue(thread), $list_alt118);
                        SubLObject fol_sentences_data = getf(folification.cycl_assertions_to_fol(justification, v_properties, UNPROVIDED), $FOL_SENTENCES_DATA, UNPROVIDED);
                        SubLObject cdolist_list_var = fol_sentences_data;
                        SubLObject datum = NIL;
                        for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                            {
                                SubLObject datum_23 = datum;
                                SubLObject current = datum_23;
                                SubLObject v_term = NIL;
                                SubLObject fol_sentences = NIL;
                                destructuring_bind_must_consp(current, datum_23, $list_alt120);
                                v_term = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum_23, $list_alt120);
                                fol_sentences = current.first();
                                current = current.rest();
                                {
                                    SubLObject unhandled_fol_sentences = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum_23, $list_alt120);
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL == fol_sentences) {
                                            Errors.warn($str_alt121$Could_not_folify_support___s, v_term);
                                            return NIL;
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_23, $list_alt120);
                                    }
                                }
                            }
                        }
                    }
                    return T;
                }
            }
        }
    }

    public static final SubLObject folifiableP(SubLObject fol_expression) {
        return makeBoolean(NIL == folification.contains_fol_unhandled_expression_p(fol_expression));
    }

    public static final SubLObject tptp_problem_query_fol_query(SubLObject cycl_ist_query, SubLObject tptp_export_properties) {
        if (tptp_export_properties == UNPROVIDED) {
            tptp_export_properties = $tptp_folification_properties$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cycl_query = czer_utilities.unwrap_if_ist_permissive(cycl_ist_query, UNPROVIDED);
                SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject fol_query = folification.query_fol_sentence(cycl_query, mt, tptp_export_properties);
                    return fol_query;
                }
            }
        }
    }

    public static final SubLObject tptp_problem_possibly_partial_justification(SubLObject tptp_problem) {
        {
            SubLObject justification = tptp_datastructures.tptp_problem_justification(tptp_problem);
            if (NIL != tptp_datastructures.tptp_problem_dynamicP(tptp_problem)) {
                if ($UNANSWERABLE == tptp_datastructures.tptp_problem_answerability(tptp_problem)) {
                    {
                        SubLObject linchpin = tptp_datastructures.tptp_problem_linchpin(tptp_problem);
                        justification = excise_linchpin_from_justification(linchpin, justification);
                    }
                }
            }
            return justification;
        }
    }

    public static final SubLObject excise_linchpin_from_justification(SubLObject linchpin, SubLObject justification) {
        if (NIL != assertion_handles.assertion_p(linchpin)) {
            justification = remove(linchpin, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            {
                SubLObject partial_justification = NIL;
                SubLObject cdolist_list_var = justification;
                SubLObject support = NIL;
                for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                    if (NIL == cycl_utilities.expression_find(linchpin, support, T, UNPROVIDED, UNPROVIDED)) {
                        partial_justification = cons(support, partial_justification);
                    }
                }
                justification = nreverse(partial_justification);
            }
        }
        return justification;
    }

    public static final SubLObject tptp_problem_export_properties(SubLObject tptp_problem, SubLObject proof_checker_modeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject header = possibly_append_include_directives_to_tptp_problem_header(tptp_problem, proof_checker_modeP);
                SubLObject output_filename = tptp_datastructures.tptp_problem_output_filename(tptp_problem);
                SubLObject output_format = $TPTP;
                return append(list($HEADER, header, $OUTPUT_FILENAME, output_filename, $OUTPUT_FORMAT, output_format), $tptp_folification_properties$.getDynamicValue(thread));
            }
        }
    }

    /**
     * Update the header to contain the include directives, unless we're in proof-checker mode.
     */
    public static final SubLObject possibly_append_include_directives_to_tptp_problem_header(SubLObject tptp_problem, SubLObject proof_checker_modeP) {
        {
            SubLObject header = tptp_datastructures.tptp_problem_header(tptp_problem);
            SubLObject include_list_ids = (NIL != proof_checker_modeP) ? ((SubLObject) (list(ZERO_INTEGER))) : tptp_datastructures.tptp_problem_include_list_ids(tptp_problem);
            SubLObject include_string = tptp_include_string_from_ids(include_list_ids);
            return cconcatenate(header, include_string);
        }
    }

    public static final SubLObject tptp_include_string_from_ids(SubLObject include_list_ids) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    format(stream, $str_alt122$__static__a_include___a_____, $tptp_problem_series_string$.getDynamicValue(thread), construct_tptp_axiom_output_filename($str_alt123$, $tptp_axiom_file_offset_number$.getDynamicValue(thread)));
                    {
                        SubLObject cdolist_list_var = include_list_ids;
                        SubLObject id = NIL;
                        for (id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , id = cdolist_list_var.first()) {
                            format(stream, $str_alt124$include___a_____, construct_tptp_axiom_output_filename($str_alt123$, add($tptp_axiom_file_offset_number$.getDynamicValue(thread), id)));
                        }
                    }
                    format(stream, $str_alt72$_________________________________);
                    string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return string;
            }
        }
    }



    public static final SubLObject do_tptp_experiment_raw_data(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject directory = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt126);
            directory = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt126);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject theorem_prover = NIL;
                    SubLObject filename = NIL;
                    SubLObject actual_answerability = NIL;
                    SubLObject expected_answerability = NIL;
                    SubLObject time = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    theorem_prover = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    actual_answerability = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    expected_answerability = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    time = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject data_file = $sym127$DATA_FILE;
                            return list(CLET, list(list(data_file, listS(CCONCATENATE, $tptp_experiment_base_directory$, directory, $list_alt131))), list(WOULD_BE_NICE_IF, list($sym133$FILE_EXISTS_, data_file), $str_alt134$Could_not_find__a, data_file), list(PWHEN, list($sym133$FILE_EXISTS_, data_file), listS(CDOLINES_TOKENIZED, bq_cons(data_file, $list_alt137), list(theorem_prover, filename, actual_answerability, expected_answerability, time), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt126);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_tptp_experiment_data(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject directory = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt138);
            directory = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt138);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject theorem_prover = NIL;
                    SubLObject problem_filename = NIL;
                    SubLObject actual_answerability = NIL;
                    SubLObject expected_answerability = NIL;
                    SubLObject total_time = NIL;
                    SubLObject load_time = NIL;
                    SubLObject inference_time = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    theorem_prover = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    problem_filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    actual_answerability = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    expected_answerability = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    total_time = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    load_time = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    inference_time = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject data = $sym139$DATA;
                            return list(CDOLIST, list(data, list(PARSE_TPTP_EXPERIMENT_DATA_FILE, directory)), listS(CDESTRUCTURING_BIND, list(theorem_prover, problem_filename, actual_answerability, expected_answerability, total_time, load_time, inference_time), data, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt138);
                    }
                }
            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $tptp_exploration_1_data$ = makeSymbol("*TPTP-EXPLORATION-1-DATA*");

    public static final SubLObject tptp_exploration_1_total_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_1_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_total_time = spass_median_total_time(directory);
                            data = cons(list(axiom_count, median_total_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_exploration_1_answerable_total_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_1_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_total_time = spass_median_answerable_total_time(directory);
                            data = cons(list(axiom_count, median_total_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_exploration_1_unanswerable_total_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_1_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_total_time = spass_median_unanswerable_total_time(directory);
                            data = cons(list(axiom_count, median_total_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_exploration_1_load_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_1_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_load_time = spass_median_load_time(directory);
                            data = cons(list(axiom_count, median_load_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_exploration_1_inference_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_1_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_inference_time = spass_median_inference_time(directory);
                            data = cons(list(axiom_count, median_inference_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    /**
     * Gathered from the tails of the csr000.ax files
     */
    // deflexical
    private static final SubLSymbol $tptp_exploration_2_data$ = makeSymbol("*TPTP-EXPLORATION-2-DATA*");

    public static final SubLObject tptp_exploration_2_total_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_2_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_total_time = spass_median_total_time(directory);
                            data = cons(list(axiom_count, median_total_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_exploration_2_answerable_total_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_2_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_total_time = spass_median_answerable_total_time(directory);
                            data = cons(list(axiom_count, median_total_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_exploration_2_unanswerable_total_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_2_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_total_time = spass_median_unanswerable_total_time(directory);
                            data = cons(list(axiom_count, median_total_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_exploration_2_load_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_2_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_load_time = spass_median_load_time(directory);
                            data = cons(list(axiom_count, median_load_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_exploration_2_inference_time() {
        {
            SubLObject data = NIL;
            SubLObject cdolist_list_var = $tptp_exploration_2_data$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject directory = NIL;
                    SubLObject axiom_count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    directory = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    axiom_count = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject median_inference_time = spass_median_inference_time(directory);
                            data = cons(list(axiom_count, median_inference_time), data);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
            return nreverse(data);
        }
    }

    public static final SubLObject tptp_analyze_experiments(SubLObject directories) {
        {
            SubLObject cdolist_list_var = directories;
            SubLObject directory = NIL;
            for (directory = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , directory = cdolist_list_var.first()) {
                {
                    SubLObject total_time = spass_median_total_time(directory);
                    SubLObject answerable_total_time = spass_median_answerable_total_time(directory);
                    SubLObject unanswerable_total_time = spass_median_unanswerable_total_time(directory);
                    print(list($MEDIAN_TOTAL_TIME, total_time, answerable_total_time, unanswerable_total_time), UNPROVIDED);
                }
                {
                    SubLObject load_time = spass_median_load_time(directory);
                    SubLObject answerable_load_time = spass_median_answerable_load_time(directory);
                    SubLObject unanswerable_load_time = spass_median_unanswerable_load_time(directory);
                    print(list($MEDIAN_LOAD_TIME, load_time, answerable_load_time, unanswerable_load_time), UNPROVIDED);
                }
                {
                    SubLObject inference_time = spass_median_inference_time(directory);
                    SubLObject answerable_inference_time = spass_median_answerable_inference_time(directory);
                    SubLObject unanswerable_inference_time = spass_median_unanswerable_inference_time(directory);
                    print(list($MEDIAN_INFERENCE_TIME, inference_time, answerable_inference_time, unanswerable_inference_time), UNPROVIDED);
                }
                terpri(UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject print_tptp_experiment_raw_data(SubLObject directory) {
        {
            SubLObject data_file = cconcatenate($tptp_experiment_base_directory$.getGlobalValue(), new SubLObject[]{ directory, $str_alt149$_, $str_alt150$data_csv });
            if (NIL == file_utilities.file_existsP(data_file)) {
                Errors.warn($str_alt134$Could_not_find__a, data_file);
            }
            if (NIL != file_utilities.file_existsP(data_file)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(data_file, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt110$Unable_to_open__S, data_file);
                        }
                        {
                            SubLObject infile = stream;
                            if (infile.isStream()) {
                                {
                                    SubLObject line = NIL;
                                    for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        {
                                            SubLObject datum = Mapping.mapcar(symbol_function(READ_FROM_STRING), string_utilities.string_tokenize(line, $list_alt153, NIL, NIL, T, NIL, UNPROVIDED));
                                            SubLObject current = datum;
                                            SubLObject theorem_prover_string = NIL;
                                            SubLObject filename = NIL;
                                            SubLObject actual_answerability = NIL;
                                            SubLObject expected_answerability = NIL;
                                            SubLObject time = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt154);
                                            theorem_prover_string = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt154);
                                            filename = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt154);
                                            actual_answerability = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt154);
                                            expected_answerability = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt154);
                                            time = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                print(list(theorem_prover_string, filename, actual_answerability, expected_answerability, time), UNPROVIDED);
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt154);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject print_tptp_experiment_data(SubLObject directory) {
        {
            SubLObject cdolist_list_var = parse_tptp_experiment_data_file(directory);
            SubLObject data = NIL;
            for (data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data = cdolist_list_var.first()) {
                {
                    SubLObject datum = data;
                    SubLObject current = datum;
                    SubLObject theorem_prover_string = NIL;
                    SubLObject filename = NIL;
                    SubLObject actual_answerability = NIL;
                    SubLObject expected_answerability = NIL;
                    SubLObject total_time = NIL;
                    SubLObject load_time = NIL;
                    SubLObject inference_time = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt155);
                    theorem_prover_string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt155);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt155);
                    actual_answerability = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt155);
                    expected_answerability = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt155);
                    total_time = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt155);
                    load_time = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt155);
                    inference_time = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        print(list(theorem_prover_string, filename, actual_answerability, expected_answerability, total_time, load_time, inference_time), UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt155);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject parse_tptp_experiment_data_file(SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject data_file = cconcatenate($tptp_experiment_base_directory$.getGlobalValue(), new SubLObject[]{ directory, $str_alt149$_, $str_alt150$data_csv });
                if (NIL == file_utilities.file_existsP(data_file)) {
                    Errors.warn($str_alt134$Could_not_find__a, data_file);
                }
                if (NIL != file_utilities.file_existsP(data_file)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(data_file, $INPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt110$Unable_to_open__S, data_file);
                            }
                            {
                                SubLObject infile = stream;
                                if (infile.isStream()) {
                                    {
                                        SubLObject line = NIL;
                                        for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                            {
                                                SubLObject datum = Mapping.mapcar(symbol_function(READ_FROM_STRING), string_utilities.string_tokenize(line, $list_alt153, NIL, NIL, T, NIL, UNPROVIDED));
                                                SubLObject current = datum;
                                                SubLObject theorem_prover_string = NIL;
                                                SubLObject filename = NIL;
                                                SubLObject actual_answerability = NIL;
                                                SubLObject expected_answerability = NIL;
                                                SubLObject time = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt154);
                                                theorem_prover_string = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt154);
                                                filename = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt154);
                                                actual_answerability = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt154);
                                                expected_answerability = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt154);
                                                time = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (NIL == tptp_load_time_experiment_p(filename)) {
                                                        dictionary.dictionary_enter(dict, filename, list(theorem_prover_string, filename, actual_answerability, expected_answerability, time));
                                                    } else {
                                                        {
                                                            SubLObject corresponding_filename = tptp_load_time_experiment_corresponding_experiment(filename);
                                                            SubLObject data = dictionary.dictionary_lookup(dict, corresponding_filename, UNPROVIDED);
                                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                if (NIL == data) {
                                                                    Errors.error($str_alt156$Could_not_find_a_corresponding_ex, filename, directory);
                                                                }
                                                            }
                                                            {
                                                                SubLObject inference_time = subtract(fifth(data), time);
                                                                SubLObject new_data = list(time, inference_time);
                                                                SubLObject full_data = append(data, new_data);
                                                                result = cons(full_data, result);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt154);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject tptp_load_time_experiment_p(SubLObject filename) {
        return string_utilities.ends_with(filename, $$$LoadTest, UNPROVIDED);
    }

    public static final SubLObject tptp_load_time_experiment_corresponding_experiment(SubLObject load_time_experiment_filename) {
        return string_utilities.substring(load_time_experiment_filename, ZERO_INTEGER, subtract(length(load_time_experiment_filename), EIGHT_INTEGER));
    }

    public static final SubLObject spass_median_total_time(SubLObject directory) {
        return number_utilities.median(total_times_for_theorem_prover(directory, $$$SPASS), UNPROVIDED);
    }

    public static final SubLObject spass_median_answerable_total_time(SubLObject directory) {
        return number_utilities.median(total_times_for_theorem_prover_and_actual_answerability(directory, $$$SPASS, $$$Theorem), UNPROVIDED);
    }

    public static final SubLObject spass_median_unanswerable_total_time(SubLObject directory) {
        return number_utilities.median(total_times_for_theorem_prover_and_actual_answerability(directory, $$$SPASS, $$$CounterSatisfiable), UNPROVIDED);
    }

    public static final SubLObject spass_median_load_time(SubLObject directory) {
        return number_utilities.median(load_times_for_theorem_prover(directory, $$$SPASS), UNPROVIDED);
    }

    public static final SubLObject spass_median_answerable_load_time(SubLObject directory) {
        return number_utilities.median(load_times_for_theorem_prover_and_actual_answerability(directory, $$$SPASS, $$$Theorem), UNPROVIDED);
    }

    public static final SubLObject spass_median_unanswerable_load_time(SubLObject directory) {
        return number_utilities.median(load_times_for_theorem_prover_and_actual_answerability(directory, $$$SPASS, $$$CounterSatisfiable), UNPROVIDED);
    }

    public static final SubLObject spass_median_inference_time(SubLObject directory) {
        return number_utilities.median(inference_times_for_theorem_prover(directory, $$$SPASS), UNPROVIDED);
    }

    public static final SubLObject spass_median_answerable_inference_time(SubLObject directory) {
        return number_utilities.median(inference_times_for_theorem_prover_and_actual_answerability(directory, $$$SPASS, $$$Theorem), UNPROVIDED);
    }

    public static final SubLObject spass_median_unanswerable_inference_time(SubLObject directory) {
        return number_utilities.median(inference_times_for_theorem_prover_and_actual_answerability(directory, $$$SPASS, $$$CounterSatisfiable), UNPROVIDED);
    }

    public static final SubLObject total_times_for_theorem_prover(SubLObject directory, SubLObject theorem_prover) {
        return lookup_tptp_experiment_times(directory, theorem_prover, NIL, NIL, $TOTAL_TIME);
    }

    public static final SubLObject total_times_for_theorem_prover_and_actual_answerability(SubLObject directory, SubLObject theorem_prover, SubLObject actual_answerability) {
        return lookup_tptp_experiment_times(directory, theorem_prover, actual_answerability, NIL, $TOTAL_TIME);
    }

    public static final SubLObject load_times_for_theorem_prover(SubLObject directory, SubLObject theorem_prover) {
        return lookup_tptp_experiment_times(directory, theorem_prover, NIL, NIL, $LOAD_TIME);
    }

    public static final SubLObject load_times_for_theorem_prover_and_actual_answerability(SubLObject directory, SubLObject theorem_prover, SubLObject actual_answerability) {
        return lookup_tptp_experiment_times(directory, theorem_prover, actual_answerability, NIL, $LOAD_TIME);
    }

    public static final SubLObject inference_times_for_theorem_prover(SubLObject directory, SubLObject theorem_prover) {
        return lookup_tptp_experiment_times(directory, theorem_prover, NIL, NIL, $INFERENCE_TIME);
    }

    public static final SubLObject inference_times_for_theorem_prover_and_actual_answerability(SubLObject directory, SubLObject theorem_prover, SubLObject actual_answerability) {
        return lookup_tptp_experiment_times(directory, theorem_prover, actual_answerability, NIL, $INFERENCE_TIME);
    }

    public static final SubLObject lookup_tptp_experiment_times(SubLObject directory, SubLObject theorem_prover_spec, SubLObject actual_answerability_spec, SubLObject expected_answerability_spec, SubLObject time_spec) {
        {
            SubLObject times = NIL;
            SubLObject cdolist_list_var = parse_tptp_experiment_data_file(directory);
            SubLObject data = NIL;
            for (data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data = cdolist_list_var.first()) {
                {
                    SubLObject datum = data;
                    SubLObject current = datum;
                    SubLObject theorem_prover = NIL;
                    SubLObject filename = NIL;
                    SubLObject actual_answerability = NIL;
                    SubLObject expected_answerability = NIL;
                    SubLObject total_time = NIL;
                    SubLObject load_time = NIL;
                    SubLObject inference_time = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt162);
                    theorem_prover = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt162);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt162);
                    actual_answerability = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt162);
                    expected_answerability = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt162);
                    total_time = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt162);
                    load_time = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt162);
                    inference_time = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((((NIL == theorem_prover_spec) || (NIL != string_utilities.substringP(theorem_prover_spec, theorem_prover, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && ((NIL == actual_answerability_spec) || actual_answerability_spec.equalp(actual_answerability))) && ((NIL == expected_answerability_spec) || expected_answerability_spec.equalp(expected_answerability))) {
                            {
                                SubLObject pcase_var = time_spec;
                                if (pcase_var.eql($TOTAL_TIME)) {
                                    times = cons(total_time, times);
                                } else
                                    if (pcase_var.eql($LOAD_TIME)) {
                                        times = cons(load_time, times);
                                    } else
                                        if (pcase_var.eql($INFERENCE_TIME)) {
                                            times = cons(inference_time, times);
                                        }


                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt162);
                    }
                }
            }
            return nreverse(times);
        }
    }

    public static final SubLObject declare_tptp_problem_generator_file() {
        declareFunction("generate_tptp_scaling_problem_set", "GENERATE-TPTP-SCALING-PROBLEM-SET", 0, 2, false);
        declareFunction("tweak_and_folify_scaling_problem_set_chunk", "TWEAK-AND-FOLIFY-SCALING-PROBLEM-SET-CHUNK", 7, 0, false);
        declareFunction("generate_tptp_elaboration_problem_set", "GENERATE-TPTP-ELABORATION-PROBLEM-SET", 0, 3, false);
        declareFunction("generate_tptp_problem_set", "GENERATE-TPTP-PROBLEM-SET", 0, 2, false);
        declareFunction("generate_tptp_problem_set_from_kb_content", "GENERATE-TPTP-PROBLEM-SET-FROM-KB-CONTENT", 1, 1, false);
        declareFunction("generate_tptp_transcript", "GENERATE-TPTP-TRANSCRIPT", 1, 0, false);
        declareFunction("generate_static_tptp_problems", "GENERATE-STATIC-TPTP-PROBLEMS", 1, 0, false);
        declareFunction("refill_answerability_queue", "REFILL-ANSWERABILITY-QUEUE", 0, 0, false);
        declareFunction("tptp_determine_linchpins", "TPTP-DETERMINE-LINCHPINS", 3, 0, false);
        declareFunction("tptp_determine_linchpins_for_one_module", "TPTP-DETERMINE-LINCHPINS-FOR-ONE-MODULE", 6, 0, false);
        declareFunction("add_tptp_problem_to_justification_index", "ADD-TPTP-PROBLEM-TO-JUSTIFICATION-INDEX", 2, 0, false);
        declareFunction("justification_indexed_terms", "JUSTIFICATION-INDEXED-TERMS", 1, 0, false);
        declareFunction("tptp_justification_index_lookup", "TPTP-JUSTIFICATION-INDEX-LOOKUP", 2, 0, false);
        declareFunction("linchpin_already_takenP", "LINCHPIN-ALREADY-TAKEN?", 2, 0, false);
        declareFunction("tptp_problem_justification_contains_a_preexisting_linchpinP", "TPTP-PROBLEM-JUSTIFICATION-CONTAINS-A-PREEXISTING-LINCHPIN?", 2, 0, false);
        declareFunction("gaf_provable_by_other_meansP", "GAF-PROVABLE-BY-OTHER-MEANS?", 1, 0, false);
        declareFunction("tptp_problem_openP", "TPTP-PROBLEM-OPEN?", 1, 0, false);
        declareFunction("tptp_problem_open_and_has_more_than_one_answerP", "TPTP-PROBLEM-OPEN-AND-HAS-MORE-THAN-ONE-ANSWER?", 1, 0, false);
        declareFunction("tptp_attach_synthetic_chaff_to_linchpins", "TPTP-ATTACH-SYNTHETIC-CHAFF-TO-LINCHPINS", 5, 0, false);
        declareFunction("tptp_generate_include_lists", "TPTP-GENERATE-INCLUDE-LISTS", 2, 0, false);
        declareFunction("tptp_generate_transcript_from_include_lists", "TPTP-GENERATE-TRANSCRIPT-FROM-INCLUDE-LISTS", 4, 0, false);
        declareFunction("assign_types_to_include_lists", "ASSIGN-TYPES-TO-INCLUDE-LISTS", 3, 0, false);
        declareFunction("nnumber_include_lists", "NNUMBER-INCLUDE-LISTS", 1, 0, false);
        declareFunction("typed_include_list_p", "TYPED-INCLUDE-LIST-P", 1, 0, false);
        declareFunction("typed_include_list_type", "TYPED-INCLUDE-LIST-TYPE", 1, 0, false);
        declareFunction("typed_include_list_id", "TYPED-INCLUDE-LIST-ID", 1, 0, false);
        declareFunction("typed_include_list_linchpin", "TYPED-INCLUDE-LIST-LINCHPIN", 1, 0, false);
        declareFunction("typed_include_list_indexed_terms", "TYPED-INCLUDE-LIST-INDEXED-TERMS", 1, 0, false);
        declareFunction("typed_include_list_assertions", "TYPED-INCLUDE-LIST-ASSERTIONS", 1, 0, false);
        declareFunction("problem_num_for_linchpin", "PROBLEM-NUM-FOR-LINCHPIN", 2, 0, false);
        declareFunction("sprinkle_static_problems_into_tptp_transcript", "SPRINKLE-STATIC-PROBLEMS-INTO-TPTP-TRANSCRIPT", 2, 0, false);
        declareFunction("generate_tptp_problem_set_from_transcript", "GENERATE-TPTP-PROBLEM-SET-FROM-TRANSCRIPT", 4, 0, false);
        declareFunction("make_tptp_problem_unanswerableP", "MAKE-TPTP-PROBLEM-UNANSWERABLE?", 3, 0, false);
        declareFunction("extract_and_sort_include_lists", "EXTRACT-AND-SORT-INCLUDE-LISTS", 1, 0, false);
        declareFunction("initial_include_list_ids", "INITIAL-INCLUDE-LIST-IDS", 1, 0, false);
        declareFunction("attach_include_lists_to_tptp_problem", "ATTACH-INCLUDE-LISTS-TO-TPTP-PROBLEM", 3, 0, false);
        declareFunction("finalize_tptp_problems", "FINALIZE-TPTP-PROBLEMS", 1, 0, false);
        declareFunction("renumber_tptp_problems", "RENUMBER-TPTP-PROBLEMS", 2, 0, false);
        declareFunction("tptp_reset_problem_numbers", "TPTP-RESET-PROBLEM-NUMBERS", 1, 0, false);
        declareFunction("tptp_increment_problem_numbers", "TPTP-INCREMENT-PROBLEM-NUMBERS", 2, 0, false);
        declareFunction("add_counterpart_info_to_tptp_problems", "ADD-COUNTERPART-INFO-TO-TPTP-PROBLEMS", 1, 0, false);
        declareFunction("add_headers_to_tptp_problems", "ADD-HEADERS-TO-TPTP-PROBLEMS", 1, 0, false);
        declareFunction("reset_tptp_problem_set_kb_spec", "RESET-TPTP-PROBLEM-SET-KB-SPEC", 1, 0, false);
        declareFunction("construct_tptp_kb_spec", "CONSTRUCT-TPTP-KB-SPEC", 1, 0, false);
        declareFunction("tptp_problem_set_non_linchpin_supports", "TPTP-PROBLEM-SET-NON-LINCHPIN-SUPPORTS", 2, 0, false);
        declareFunction("tptp_problem_set_combined_justification", "TPTP-PROBLEM-SET-COMBINED-JUSTIFICATION", 1, 0, false);
        declareFunction("tptp_problem_set_linchpin_assertions", "TPTP-PROBLEM-SET-LINCHPIN-ASSERTIONS", 1, 0, false);
        declareFunction("tptp_problem_set_dynamic_kb_assertion_set", "TPTP-PROBLEM-SET-DYNAMIC-KB-ASSERTION-SET", 1, 0, false);
        declareFunction("compute_static_chaff_gafs", "COMPUTE-STATIC-CHAFF-GAFS", 5, 0, false);
        declareFunction("some_relevant_chaff_gafs_not_mentioning_assertion_set", "SOME-RELEVANT-CHAFF-GAFS-NOT-MENTIONING-ASSERTION-SET", 3, 0, false);
        declareFunction("some_irrelevant_chaff_gafs_not_mentioning_assertion_set", "SOME-IRRELEVANT-CHAFF-GAFS-NOT-MENTIONING-ASSERTION-SET", 2, 0, false);
        declareFunction("apply_chaff_generator_to_assertion", "APPLY-CHAFF-GENERATOR-TO-ASSERTION", 4, 0, false);
        declareFunction("chaff_generator_transitive_generality_estimate", "CHAFF-GENERATOR-TRANSITIVE-GENERALITY-ESTIMATE", 3, 0, false);
        declareFunction("chaff_generator_random_gaf_with_same_predicate", "CHAFF-GENERATOR-RANDOM-GAF-WITH-SAME-PREDICATE", 3, 0, false);
        declareFunction("chaff_generator_random_gaf_with_spec_predicate", "CHAFF-GENERATOR-RANDOM-GAF-WITH-SPEC-PREDICATE", 3, 0, false);
        declareFunction("chaff_generator_random_gaf_for_term", "CHAFF-GENERATOR-RANDOM-GAF-FOR-TERM", 3, 0, false);
        declareFunction("random_gaf_with_pred_and_arg", "RANDOM-GAF-WITH-PRED-AND-ARG", 6, 0, false);
        declareFunction("generate_chaff_similar_to_assertions_iterative", "GENERATE-CHAFF-SIMILAR-TO-ASSERTIONS-ITERATIVE", 2, 2, false);
        declareFunction("generate_chaff_similar_to_assertions", "GENERATE-CHAFF-SIMILAR-TO-ASSERTIONS", 4, 0, false);
        declareFunction("generate_one_chaff_gaf_similar_to_assertion", "GENERATE-ONE-CHAFF-GAF-SIMILAR-TO-ASSERTION", 4, 0, false);
        declareFunction("estimated_rule_to_gaf_ratio", "ESTIMATED-RULE-TO-GAF-RATIO", 0, 0, false);
        declareFunction("generate_tptp_problem_header", "GENERATE-TPTP-PROBLEM-HEADER", 2, 0, false);
        declareFunction("print_tptp_problem_header", "PRINT-TPTP-PROBLEM-HEADER", 3, 0, false);
        declareFunction("generate_tptp_axiom_header", "GENERATE-TPTP-AXIOM-HEADER", 1, 0, false);
        declareFunction("print_tptp_axiom_header", "PRINT-TPTP-AXIOM-HEADER", 2, 0, false);
        declareFunction("tptp_current_release_string", "TPTP-CURRENT-RELEASE-STRING", 0, 0, false);
        declareFunction("tptp_problem_name", "TPTP-PROBLEM-NAME", 1, 0, false);
        declareFunction("tptp_release_or_bugfix_string", "TPTP-RELEASE-OR-BUGFIX-STRING", 0, 0, false);
        declareFunction("tptp_problem_parameters_string", "TPTP-PROBLEM-PARAMETERS-STRING", 1, 0, false);
        declareFunction("tptp_problem_series_pragma_string", "TPTP-PROBLEM-SERIES-PRAGMA-STRING", 1, 0, false);
        declareFunction("tptp_kb_spec_string", "TPTP-KB-SPEC-STRING", 1, 0, false);
        declareFunction("tptp_problem_version_string", "TPTP-PROBLEM-VERSION-STRING", 0, 0, false);
        declareFunction("tptp_problem_english_string", "TPTP-PROBLEM-ENGLISH-STRING", 0, 0, false);
        declareFunction("tptp_problem_status_string", "TPTP-PROBLEM-STATUS-STRING", 1, 0, false);
        declareFunction("folify_tptp_problem_set", "FOLIFY-TPTP-PROBLEM-SET", 1, 0, false);
        declareFunction("nset_tptp_problem_output_filenames", "NSET-TPTP-PROBLEM-OUTPUT-FILENAMES", 2, 0, false);
        declareFunction("construct_tptp_problem_output_filename", "CONSTRUCT-TPTP-PROBLEM-OUTPUT-FILENAME", 2, 0, false);
        declareFunction("construct_tptp_axiom_output_filename", "CONSTRUCT-TPTP-AXIOM-OUTPUT-FILENAME", 2, 0, false);
        declareFunction("construct_tptp_output_filename", "CONSTRUCT-TPTP-OUTPUT-FILENAME", 4, 0, false);
        declareFunction("folify_static_kb_include_list", "FOLIFY-STATIC-KB-INCLUDE-LIST", 2, 0, false);
        declareFunction("folify_dynamic_include_lists", "FOLIFY-DYNAMIC-INCLUDE-LISTS", 2, 0, false);
        declareFunction("folify_dynamic_include_list", "FOLIFY-DYNAMIC-INCLUDE-LIST", 2, 0, false);
        declareFunction("folify_include_list", "FOLIFY-INCLUDE-LIST", 3, 0, false);
        declareFunction("tptp_folify_assertion", "TPTP-FOLIFY-ASSERTION", 1, 0, false);
        declareFunction("tptp_axiom_file_export_properties", "TPTP-AXIOM-FILE-EXPORT-PROPERTIES", 1, 0, false);
        declareFunction("tptp_axiom_file_export_properties_int", "TPTP-AXIOM-FILE-EXPORT-PROPERTIES-INT", 2, 0, false);
        declareFunction("tptp_axiom_file_relative_filename", "TPTP-AXIOM-FILE-RELATIVE-FILENAME", 1, 0, false);
        declareFunction("tptp_axiom_file_filename", "TPTP-AXIOM-FILE-FILENAME", 1, 0, false);
        declareFunction("folify_tptp_problem", "FOLIFY-TPTP-PROBLEM", 1, 0, false);
        declareFunction("folify_tptp_problem_proof_checker_mode", "FOLIFY-TPTP-PROBLEM-PROOF-CHECKER-MODE", 1, 0, false);
        declareFunction("folify_tptp_problem_int", "FOLIFY-TPTP-PROBLEM-INT", 4, 0, false);
        declareFunction("cycl_query_folifiableP", "CYCL-QUERY-FOLIFIABLE?", 1, 0, false);
        declareFunction("unfolifiable_justification_term_p", "UNFOLIFIABLE-JUSTIFICATION-TERM-P", 1, 0, false);
        declareFunction("justification_folifiableP", "JUSTIFICATION-FOLIFIABLE?", 1, 0, false);
        declareFunction("folifiableP", "FOLIFIABLE?", 1, 0, false);
        declareFunction("tptp_problem_query_fol_query", "TPTP-PROBLEM-QUERY-FOL-QUERY", 1, 1, false);
        declareFunction("tptp_problem_possibly_partial_justification", "TPTP-PROBLEM-POSSIBLY-PARTIAL-JUSTIFICATION", 1, 0, false);
        declareFunction("excise_linchpin_from_justification", "EXCISE-LINCHPIN-FROM-JUSTIFICATION", 2, 0, false);
        declareFunction("tptp_problem_export_properties", "TPTP-PROBLEM-EXPORT-PROPERTIES", 2, 0, false);
        declareFunction("possibly_append_include_directives_to_tptp_problem_header", "POSSIBLY-APPEND-INCLUDE-DIRECTIVES-TO-TPTP-PROBLEM-HEADER", 2, 0, false);
        declareFunction("tptp_include_string_from_ids", "TPTP-INCLUDE-STRING-FROM-IDS", 1, 0, false);
        declareMacro("do_tptp_experiment_raw_data", "DO-TPTP-EXPERIMENT-RAW-DATA");
        declareMacro("do_tptp_experiment_data", "DO-TPTP-EXPERIMENT-DATA");
        declareFunction("tptp_exploration_1_total_time", "TPTP-EXPLORATION-1-TOTAL-TIME", 0, 0, false);
        declareFunction("tptp_exploration_1_answerable_total_time", "TPTP-EXPLORATION-1-ANSWERABLE-TOTAL-TIME", 0, 0, false);
        declareFunction("tptp_exploration_1_unanswerable_total_time", "TPTP-EXPLORATION-1-UNANSWERABLE-TOTAL-TIME", 0, 0, false);
        declareFunction("tptp_exploration_1_load_time", "TPTP-EXPLORATION-1-LOAD-TIME", 0, 0, false);
        declareFunction("tptp_exploration_1_inference_time", "TPTP-EXPLORATION-1-INFERENCE-TIME", 0, 0, false);
        declareFunction("tptp_exploration_2_total_time", "TPTP-EXPLORATION-2-TOTAL-TIME", 0, 0, false);
        declareFunction("tptp_exploration_2_answerable_total_time", "TPTP-EXPLORATION-2-ANSWERABLE-TOTAL-TIME", 0, 0, false);
        declareFunction("tptp_exploration_2_unanswerable_total_time", "TPTP-EXPLORATION-2-UNANSWERABLE-TOTAL-TIME", 0, 0, false);
        declareFunction("tptp_exploration_2_load_time", "TPTP-EXPLORATION-2-LOAD-TIME", 0, 0, false);
        declareFunction("tptp_exploration_2_inference_time", "TPTP-EXPLORATION-2-INFERENCE-TIME", 0, 0, false);
        declareFunction("tptp_analyze_experiments", "TPTP-ANALYZE-EXPERIMENTS", 1, 0, false);
        declareFunction("print_tptp_experiment_raw_data", "PRINT-TPTP-EXPERIMENT-RAW-DATA", 1, 0, false);
        declareFunction("print_tptp_experiment_data", "PRINT-TPTP-EXPERIMENT-DATA", 1, 0, false);
        declareFunction("parse_tptp_experiment_data_file", "PARSE-TPTP-EXPERIMENT-DATA-FILE", 1, 0, false);
        declareFunction("tptp_load_time_experiment_p", "TPTP-LOAD-TIME-EXPERIMENT-P", 1, 0, false);
        declareFunction("tptp_load_time_experiment_corresponding_experiment", "TPTP-LOAD-TIME-EXPERIMENT-CORRESPONDING-EXPERIMENT", 1, 0, false);
        declareFunction("spass_median_total_time", "SPASS-MEDIAN-TOTAL-TIME", 1, 0, false);
        declareFunction("spass_median_answerable_total_time", "SPASS-MEDIAN-ANSWERABLE-TOTAL-TIME", 1, 0, false);
        declareFunction("spass_median_unanswerable_total_time", "SPASS-MEDIAN-UNANSWERABLE-TOTAL-TIME", 1, 0, false);
        declareFunction("spass_median_load_time", "SPASS-MEDIAN-LOAD-TIME", 1, 0, false);
        declareFunction("spass_median_answerable_load_time", "SPASS-MEDIAN-ANSWERABLE-LOAD-TIME", 1, 0, false);
        declareFunction("spass_median_unanswerable_load_time", "SPASS-MEDIAN-UNANSWERABLE-LOAD-TIME", 1, 0, false);
        declareFunction("spass_median_inference_time", "SPASS-MEDIAN-INFERENCE-TIME", 1, 0, false);
        declareFunction("spass_median_answerable_inference_time", "SPASS-MEDIAN-ANSWERABLE-INFERENCE-TIME", 1, 0, false);
        declareFunction("spass_median_unanswerable_inference_time", "SPASS-MEDIAN-UNANSWERABLE-INFERENCE-TIME", 1, 0, false);
        declareFunction("total_times_for_theorem_prover", "TOTAL-TIMES-FOR-THEOREM-PROVER", 2, 0, false);
        declareFunction("total_times_for_theorem_prover_and_actual_answerability", "TOTAL-TIMES-FOR-THEOREM-PROVER-AND-ACTUAL-ANSWERABILITY", 3, 0, false);
        declareFunction("load_times_for_theorem_prover", "LOAD-TIMES-FOR-THEOREM-PROVER", 2, 0, false);
        declareFunction("load_times_for_theorem_prover_and_actual_answerability", "LOAD-TIMES-FOR-THEOREM-PROVER-AND-ACTUAL-ANSWERABILITY", 3, 0, false);
        declareFunction("inference_times_for_theorem_prover", "INFERENCE-TIMES-FOR-THEOREM-PROVER", 2, 0, false);
        declareFunction("inference_times_for_theorem_prover_and_actual_answerability", "INFERENCE-TIMES-FOR-THEOREM-PROVER-AND-ACTUAL-ANSWERABILITY", 3, 0, false);
        declareFunction("lookup_tptp_experiment_times", "LOOKUP-TPTP-EXPERIMENT-TIMES", 5, 0, false);
        return NIL;
    }

    public static final SubLObject init_tptp_problem_generator_file() {
        defparameter("*TPTP-PROBLEM-VERSION-STRING*", $str_alt0$Especial_);
        defparameter("*TPTP-RELEVANT-CHAFF-COUNT*", $int$24000);
        defparameter("*TPTP-TOTAL-CHAFF-RATIO*", ONE_INTEGER);
        defparameter("*TPTP-FORCE-ALL-ANSWERABLE?*", NIL);
        defparameter("*TPTP-FOLIFICATION-PROPERTIES*", $list_alt2);
        deflexical("*TPTP-OUTPUT-BASE-DIRECTORY*", $str_alt3$_cyc_projects_EfficientPathfindin);
        defparameter("*TPTP-EXPLICIT-DIRECTORY*", NIL);
        deflexical("*TPTP-AXIOMS-SUBDIRECTORY*", $str_alt4$Axioms_);
        deflexical("*TPTP-DOMAIN-PREFIX*", $$$CSR);
        defparameter("*TPTP-PROBLEM-SERIES-STRING*", $str_alt6$cyc_series);
        defparameter("*TPTP-FIRST-PROBLEM-NUMBER*", $int$25);
        defparameter("*TPTP-AXIOM-FILE-OFFSET-NUMBER*", ZERO_INTEGER);
        defparameter("*TPTP-MODULE-SCRIPT*", misc_utilities.uninitialized());
        deflexical("*TPTP-MODULE-SCALING-SCRIPT*", $list_alt8);
        deflexical("*TPTP-MODULE-ELABORATION-SCRIPT*", $list_alt9);
        deflexical("*TPTP-MODULE-TESTING-SCRIPT*", $list_alt10);
        defparameter("*TPTP-CREATE-AND-KILL-RATIO*", $float$0_05);
        defparameter("*TPTP-ASSERT-AND-UNASSERT-RATIO*", $float$0_1);
        deflexical("*TPTP-CURRENT-RELEASE-STRING*", $str_alt13$3_2_0);
        deflexical("*FORCE-UNANSWERABLE-MODULES*", $list_alt25);
        deflexical("*CHAFF-GENERATOR-MODULES*", $list_alt67);
        deflexical("*DEFAULT-CHAFF-GENERATOR-DISTRIBUTION*", $list_alt68);
        deflexical("*OPENCYC-LICENSE-AS-TPTP-COMMENT*", $str_alt71$__Comments___Autogenerated_with_t);
        deflexical("*UNFOLIFIABLE-JUSTIFICATION-PREDS*", $list_alt112);
        deflexical("*UNFOLIFIABLE-JUSTIFICATION-TERMS*", $list_alt113);
        deflexical("*TPTP-EXPERIMENT-BASE-DIRECTORY*", $str_alt125$_cyc_projects_EfficientPathfindin);
        deflexical("*TPTP-EXPLORATION-1-DATA*", $list_alt143);
        deflexical("*TPTP-EXPLORATION-2-DATA*", $list_alt145);
        return NIL;
    }

    public static final SubLObject setup_tptp_problem_generator_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$Especial_ = makeString("Especial.");

    public static final SubLInteger $int$24000 = makeInteger(24000);

    static private final SubLList $list_alt2 = list(makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), makeKeyword("GAF-AND-EXPANSION"), makeKeyword("STRING-HANDLING"), makeKeyword("DWIM-TO-DISTINCT-CONSTANTS"), makeKeyword("NUMBER-HANDLING"), makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS"), makeKeyword("NEGATE-QUERIES?"), NIL);

    static private final SubLString $str_alt3$_cyc_projects_EfficientPathfindin = makeString("/cyc/projects/EfficientPathfinding/tptp/");

    static private final SubLString $str_alt4$Axioms_ = makeString("Axioms/");

    static private final SubLString $$$CSR = makeString("CSR");

    static private final SubLString $str_alt6$cyc_series = makeString("cyc_series");

    public static final SubLInteger $int$25 = makeInteger(25);

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeKeyword("LOOKUP-POS-KB"), THREE_INTEGER, makeKeyword("LOOKUP-POS-SYNTHETIC"), TWO_INTEGER, makeKeyword("GENLS-KB"), THREE_INTEGER, makeKeyword("GENLS-SYNTHETIC"), TWO_INTEGER, makeKeyword("ISA-KB"), FOUR_INTEGER, makeKeyword("ISA-SYNTHETIC-SINGLETON"), ONE_INTEGER, makeKeyword("NOT-ISA-KB"), ONE_INTEGER, makeKeyword("UNKNOWN-ISA-KB"), ZERO_INTEGER, makeKeyword("DISJOINT-WITH-KB"), TWO_INTEGER, makeKeyword("DISJOINT-WITH-SYNTHETIC"), TWO_INTEGER, makeKeyword("GENL-PREDS-KB"), ZERO_INTEGER, makeKeyword("GENL-PREDS-SYNTHETIC"), ZERO_INTEGER, makeKeyword("GENL-INVERSE-KB"), ZERO_INTEGER, makeKeyword("GENL-INVERSE-SYNTHETIC"), ZERO_INTEGER, makeKeyword("PART-TYPES-GENL-PREDS-LOOKUP"), THREE_INTEGER, makeKeyword("PART-TYPES-GENL-INVERSE-LOOKUP"), TWO_INTEGER, makeKeyword("TPTP-OF-OBJECT-RELATION-ALL-INSTANCE-LOOKUP"), FIVE_INTEGER, makeKeyword("PARTS-VIA-RELATION-ALL-EXISTS"), FIVE_INTEGER, makeKeyword("TRANSITIVE-SYNTHETIC"), TWO_INTEGER, makeKeyword("IN-REGION-SYNTHETIC"), THREE_INTEGER, makeKeyword("SYMMETRIC-KB"), FIVE_INTEGER, makeKeyword("NEGATION-VIA-ARG-TYPE-VIOLATION"), FIVE_INTEGER, makeKeyword("REFLEXIVE-KB"), ZERO_INTEGER });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("LOOKUP-POS-KB"), ELEVEN_INTEGER, makeKeyword("GENLS-KB"), FIVE_INTEGER, makeKeyword("ISA-KB"), FIVE_INTEGER, makeKeyword("NOT-ISA-KB"), FIVE_INTEGER, makeKeyword("UNKNOWN-ISA-KB"), TEN_INTEGER, makeKeyword("DISJOINT-WITH-KB"), FIVE_INTEGER, makeKeyword("GENL-PREDS-KB"), FIVE_INTEGER, makeKeyword("GENL-INVERSE-KB"), FIVE_INTEGER, makeKeyword("PART-TYPES-GENL-PREDS-LOOKUP"), FIVE_INTEGER, makeKeyword("PART-TYPES-GENL-INVERSE-LOOKUP"), FIVE_INTEGER, makeKeyword("TPTP-OF-OBJECT-RELATION-ALL-INSTANCE-LOOKUP"), FIVE_INTEGER, makeKeyword("PARTS-VIA-RELATION-ALL-EXISTS"), FIVE_INTEGER, makeKeyword("TRANSITIVE-SYNTHETIC"), FIVE_INTEGER, makeKeyword("IN-REGION-SYNTHETIC"), FIVE_INTEGER, makeKeyword("SYMMETRIC-KB"), FIVE_INTEGER, makeKeyword("REFLEXIVE-KB"), FIVE_INTEGER, makeKeyword("NEGATION-VIA-ARG-TYPE-VIOLATION"), FIVE_INTEGER, makeKeyword("MT"), ZERO_INTEGER, makeKeyword("GENL-MT-LINK"), ZERO_INTEGER, makeKeyword("GENL-INVERSE-LOOKUP"), ZERO_INTEGER, makeKeyword("RELATION-ALL-EXISTS-LOOKUP"), ZERO_INTEGER, makeKeyword("LOOKUP"), FIVE_INTEGER, makeKeyword("GENLS-GAF"), FOUR_INTEGER, makeKeyword("ANY-INSTANCES"), TWO_INTEGER, makeKeyword("DISJOINT-WITH"), FOUR_INTEGER, makeKeyword("GENL-PREDS"), TWO_INTEGER, makeKeyword("GENL-INVERSE"), ONE_INTEGER, makeKeyword("GENL-PREDS-LOOKUP"), FOUR_INTEGER, makeKeyword("RELATION-ALL-INSTANCE-LOOKUP"), FOUR_INTEGER, makeKeyword("TRANSITIVE-GEOGRAPHICAL-SUB-REGIONS"), FOUR_INTEGER, makeKeyword("TVA-THROUGH-GEOGRAPHICAL-SUB-REGIONS"), FOUR_INTEGER });

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("LOOKUP-POS-KB"), TWO_INTEGER, makeKeyword("LOOKUP-POS-SYNTHETIC"), ZERO_INTEGER, makeKeyword("GENLS-KB"), ZERO_INTEGER, makeKeyword("GENLS-SYNTHETIC"), ZERO_INTEGER, makeKeyword("ISA-KB"), ZERO_INTEGER, makeKeyword("NOT-ISA-KB"), ZERO_INTEGER, makeKeyword("UNKNOWN-ISA-KB"), ZERO_INTEGER, makeKeyword("DISJOINT-WITH-KB"), ZERO_INTEGER, makeKeyword("DISJOINT-WITH-SYNTHETIC"), ZERO_INTEGER, makeKeyword("GENL-PREDS-KB"), ZERO_INTEGER, makeKeyword("GENL-PREDS-SYNTHETIC"), ZERO_INTEGER, makeKeyword("GENL-INVERSE-KB"), ZERO_INTEGER, makeKeyword("GENL-INVERSE-SYNTHETIC"), ZERO_INTEGER, makeKeyword("PART-TYPES-GENL-PREDS-LOOKUP"), ZERO_INTEGER, makeKeyword("PART-TYPES-GENL-INVERSE-LOOKUP"), ZERO_INTEGER, makeKeyword("TPTP-OF-OBJECT-RELATION-ALL-INSTANCE-LOOKUP"), ZERO_INTEGER, makeKeyword("PARTS-VIA-RELATION-ALL-EXISTS"), ZERO_INTEGER, makeKeyword("IN-REGION-SYNTHETIC"), ZERO_INTEGER, makeKeyword("NEGATION-VIA-ARG-TYPE-VIOLATION"), ZERO_INTEGER, makeKeyword("REFLEXIVE-KB"), ZERO_INTEGER, makeKeyword("SYMMETRIC-KB"), ZERO_INTEGER, makeKeyword("TRANSITIVE-SYNTHETIC"), ZERO_INTEGER, makeKeyword("ISA-SYNTHETIC-SINGLETON"), ZERO_INTEGER, makeKeyword("MT"), ZERO_INTEGER, makeKeyword("GENL-MT-LINK"), ZERO_INTEGER, makeKeyword("GENL-INVERSE-LOOKUP"), ZERO_INTEGER, makeKeyword("RELATION-ALL-EXISTS-LOOKUP"), ZERO_INTEGER, makeKeyword("LOOKUP"), ZERO_INTEGER, makeKeyword("GENLS-GAF"), ZERO_INTEGER, makeKeyword("ANY-INSTANCES"), ZERO_INTEGER, makeKeyword("DISJOINT-WITH"), ZERO_INTEGER, makeKeyword("GENL-PREDS"), ZERO_INTEGER, makeKeyword("GENL-INVERSE"), ZERO_INTEGER, makeKeyword("GENL-PREDS-LOOKUP"), ZERO_INTEGER, makeKeyword("RELATION-ALL-INSTANCE-LOOKUP"), ZERO_INTEGER, makeKeyword("TRANSITIVE-GEOGRAPHICAL-SUB-REGIONS"), ZERO_INTEGER, makeKeyword("TVA-THROUGH-GEOGRAPHICAL-SUB-REGIONS"), ZERO_INTEGER });

    public static final SubLFloat $float$0_05 = makeDouble(0.05);

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    static private final SubLString $str_alt13$3_2_0 = makeString("3.2.0");

    static private final SubLString $str_alt14$cyc_scaling_1 = makeString("cyc_scaling_1");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $str_alt16$cyc_scaling_2 = makeString("cyc_scaling_2");

    public static final SubLInteger $int$3000 = makeInteger(3000);

    static private final SubLString $str_alt18$cyc_scaling_3 = makeString("cyc_scaling_3");

    static private final SubLString $str_alt19$cyc_scaling_4 = makeString("cyc_scaling_4");

    static private final SubLString $str_alt20$cyc_scaling_5 = makeString("cyc_scaling_5");

    static private final SubLString $str_alt21$cyc_scaling_6 = makeString("cyc_scaling_6");

    static private final SubLString $str_alt22$____FOLifying_problem_set_with_pa = makeString("~%~%FOLifying problem set with parameters ~a ~a ~a~%");

    static private final SubLString $str_alt23$cyc_elaboration = makeString("cyc_elaboration");

    public static final SubLInteger $int$300 = makeInteger(300);

    static private final SubLList $list_alt25 = list(makeKeyword("UNKNOWN-ISA-KB"));

    static private final SubLString $str_alt26$_s_is_already_declared_as_a_linch = makeString("~s is already declared as a linchpin module");



    static private final SubLString $str_alt28$__Generated_static_TPTP_problem__ = makeString("~&Generated static TPTP problem ~s~%");

    private static final SubLSymbol $LINCHPIN = makeKeyword("LINCHPIN");

    private static final SubLSymbol $STATIC = makeKeyword("STATIC");



    static private final SubLString $str_alt32$_s_is_already_declared_as_a_query = makeString("~s is already declared as a query generation module");

    static private final SubLList $list_alt33 = list(makeSymbol("NEW-STATIC-LINCHPINS"), makeSymbol("NEW-TO-BE-ADDED-LINCHPINS"), makeSymbol("NEW-TO-BE-REMOVED-LINCHPINS"));

    static private final SubLString $str_alt34$Linchpin_starvation___s = makeString("Linchpin starvation: ~s");

    static private final SubLString $str_alt35$__Selecting_linchpin___a__ = makeString("~&Selecting linchpin: ~a~%");

    static private final SubLString $str_alt36$Linchpin_already_taken___a = makeString("Linchpin already taken: ~a");

    static private final SubLString $str_alt37$Rejecting_problem_due_to_preexist = makeString("Rejecting problem due to preexisting linchpin: ~a");

    static private final SubLList $list_alt38 = list(makeKeyword("RETURN"), makeKeyword("SUPPORTS"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"));



    static private final SubLList $list_alt40 = list(makeKeyword("MAX-NUMBER"), TWO_INTEGER, makeKeyword("MAX-TIME"), makeInteger(30));

    static private final SubLList $list_alt41 = list(makeSymbol("STATIC-CHAFF-FORTS"), makeSymbol("TO-BE-ADDED-CHAFF-FORTS"), makeSymbol("TO-BE-REMOVED-CHAFF-FORTS"));

    static private final SubLList $list_alt42 = list(makeSymbol("STATIC-CHAFF-ASSERTIONS"), makeSymbol("TO-BE-ADDED-CHAFF-ASSERTIONS"), makeSymbol("TO-BE-REMOVED-CHAFF-ASSERTIONS"));

    private static final SubLSymbol $TO_BE_ADDED = makeKeyword("TO-BE-ADDED");

    private static final SubLSymbol $TO_BE_REMOVED = makeKeyword("TO-BE-REMOVED");

    static private final SubLList $list_alt45 = list(makeKeyword("STATIC"), makeKeyword("TO-BE-ADDED"), makeKeyword("TO-BE-REMOVED"));



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLSymbol $sym48$_ = makeSymbol("<");

    static private final SubLString $str_alt49$Unexpected_include_list_type__s = makeString("Unexpected include list type ~s");

    private static final SubLSymbol TYPED_INCLUDE_LIST_LINCHPIN = makeSymbol("TYPED-INCLUDE-LIST-LINCHPIN");

    private static final SubLSymbol TYPED_INCLUDE_LIST_P = makeSymbol("TYPED-INCLUDE-LIST-P");

    private static final SubLSymbol TYPED_INCLUDE_LIST_ID = makeSymbol("TYPED-INCLUDE-LIST-ID");

    static private final SubLList $list_alt53 = list(makeKeyword("STATIC"), makeKeyword("TO-BE-REMOVED"));

    private static final SubLSymbol $ANSWERABILITY = makeKeyword("ANSWERABILITY");

    private static final SubLSymbol $INCLUDE_LIST_IDS = makeKeyword("INCLUDE-LIST-IDS");



    private static final SubLSymbol $PAIR_NUM = makeKeyword("PAIR-NUM");

    private static final SubLSymbol $COUNTERPART_NUM = makeKeyword("COUNTERPART-NUM");



    static private final SubLString $str_alt60$Expected_no_irrelevant_chaff__got = makeString("Expected no irrelevant chaff, got ~s");

    static private final SubLString $str_alt61$Can_t_decrease_relevant_chaff__go = makeString("Can't decrease relevant chaff, got ~a - ~a = ~a");

    static private final SubLSymbol $sym62$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    static private final SubLString $$$Gathering_all_gafs = makeString("Gathering all gafs");





    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLList $list_alt67 = list(cons(makeKeyword("CHAFF-GENERATOR-TRANSITIVE-GENERALITY-ESTIMATE"), makeSymbol("CHAFF-GENERATOR-TRANSITIVE-GENERALITY-ESTIMATE")), cons(makeKeyword("CHAFF-GENERATOR-RANDOM-GAF-FOR-TERM"), makeSymbol("CHAFF-GENERATOR-RANDOM-GAF-FOR-TERM")), cons(makeKeyword("CHAFF-GENERATOR-RANDOM-GAF-WITH-SAME-PREDICATE"), makeSymbol("CHAFF-GENERATOR-RANDOM-GAF-WITH-SAME-PREDICATE")), cons(makeKeyword("CHAFF-GENERATOR-RANDOM-GAF-WITH-SPEC-PREDICATE"), makeSymbol("CHAFF-GENERATOR-RANDOM-GAF-WITH-SPEC-PREDICATE")));

    static private final SubLList $list_alt68 = list(makeKeyword("CHAFF-GENERATOR-TRANSITIVE-GENERALITY-ESTIMATE"), makeDouble(0.45), makeKeyword("CHAFF-GENERATOR-RANDOM-GAF-FOR-TERM"), makeDouble(0.4), makeKeyword("CHAFF-GENERATOR-RANDOM-GAF-WITH-SAME-PREDICATE"), makeDouble(0.1), makeKeyword("CHAFF-GENERATOR-RANDOM-GAF-WITH-SPEC-PREDICATE"), makeDouble(0.05));



    static private final SubLString $str_alt70$___a_relevant_chaff_gafs_generate = makeString("~&~a relevant chaff gafs generated~%");

    static private final SubLString $str_alt71$__Comments___Autogenerated_with_t = makeString("% Comments : Autogenerated with the Cyc TPTP problem set generator \n%   from the OpenCyc KB\n% \n% Copyright Information\n% Cyc(R) Knowledge Base Copyright(C) 1995-2007 Cycorp, Inc., Austin, TX, USA.\n% All rights reserved.\n% OpenCyc Knowledge Base Copyright(C) 2001-2007 Cycorp, Inc., Austin, TX, USA.\n% All rights reserved.\n% \n% Other copyrights may be found in various files.\n% \n% The OpenCyc Knowledge Base\n% \n% The OpenCyc Knowledge Base consists of code, written in the\n% declarative language CycL, that represents or supports the\n% representation of facts and rules pertaining to consensus\n% reality. OpenCyc is licensed using the Apache License, Version 2,\n% whose text can be found at\n% http://www.apache.org/licenses/LICENSE-2.0.html.\n% \n% The OpenCyc CycL code base is the \"Work\" referred to in the Apache\n% license. The terms of this license equally apply to renamings and\n% other logically equivalent reformulations of the Knowledge Base (or\n% portions thereof) in any natural or formal language.\n%\n");

    static private final SubLString $str_alt72$_________________________________ = makeString("%--------------------------------------------------------------------------~%");

    static private final SubLString $str_alt73$__File________a___TPTP_v_a___a___ = makeString("% File     : ~a : TPTP v~a. ~a.~%");

    static private final SubLString $str_alt74$__Domain_____Common_Sense_Reasoni = makeString("% Domain   : Common Sense Reasoning (Cyc)~%");

    static private final SubLString $str_alt75$__Problem____Autogenerated_Cyc_Pr = makeString("% Problem  : Autogenerated Cyc Problem ~a~%");

    static private final SubLString $str_alt76$__Version_____a__ = makeString("% Version  : ~a~%");

    static private final SubLString $str_alt77$__English_____a__ = makeString("% English  : ~a~%");

    static private final SubLString $str_alt78$__ = makeString("~%");

    static private final SubLString $str_alt79$__Refs_________ = makeString("% Refs     : ~%");

    static private final SubLString $str_alt80$__Source_____Cyc__ = makeString("% Source   : Cyc~%");

    static private final SubLString $str_alt81$__Names________ = makeString("% Names    : ~%");

    static private final SubLString $str_alt82$__Status______a__ = makeString("% Status   : ~a~%");

    static private final SubLString $str_alt83$__Rating_______ = makeString("% Rating   : ~%");

    static private final SubLString $str_alt84$__Syntax_______ = makeString("% Syntax   : ~%");

    static private final SubLString $str_alt85$__Axioms_____some_axioms_from_Cyc = makeString("% Axioms   : some axioms from Cyc~%");

    static private final SubLString $str_alt86$__Status_______ = makeString("% Status   : ~%");

    static private final SubLString $str_alt87$_3__0d_1 = makeString("~3,'0d+1");

    static private final SubLString $$$Released_v = makeString("Released v");





    static private final SubLString $str_alt91$__problem_series__a___a = makeString("%$problem_series(~a,[~a");

    static private final SubLString $str_alt92$__a = makeString(",~a");

    static private final SubLString $str_alt93$____ = makeString("])~%");

    static private final SubLString $str_alt94$None__problem_was_autogenerated_ = makeString("None (problem was autogenerated)");

    static private final SubLString $$$Theorem = makeString("Theorem");

    static private final SubLString $$$CounterSatisfiable = makeString("CounterSatisfiable");

    static private final SubLString $str_alt97$Unexpected_answerability__s = makeString("Unexpected answerability ~s");



    static private final SubLString $$$p = makeString("p");

    static private final SubLString $$$ax = makeString("ax");

    static private final SubLString $str_alt101$_a_a_3__0d__a__a = makeString("~a~a~3,'0d+~a.~a");

    static private final SubLString $str_alt102$_ = makeString("_");

    static private final SubLString $str_alt103$temp_p = makeString("temp.p");

    static private final SubLString $str_alt104$__TPTP_FOLIFY_ASSERTION_TEST = makeString("% TPTP-FOLIFY-ASSERTION TEST");





    static private final SubLString $$$error = makeString("error");

    static private final SubLString $$$just = makeString("just");



    static private final SubLString $str_alt110$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$query = makeString("query");

    static private final SubLList $list_alt112 = list(constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerable")), constant_handles.reader_make_constant_shell(makeString("completelyEnumerableCollection")), constant_handles.reader_make_constant_shell(makeString("defnNecessary")), constant_handles.reader_make_constant_shell(makeString("defnIff")), constant_handles.reader_make_constant_shell(makeString("defnSufficient")), constant_handles.reader_make_constant_shell(makeString("evaluate")), constant_handles.reader_make_constant_shell(makeString("unknownSentence")));

    static private final SubLList $list_alt113 = list(constant_handles.reader_make_constant_shell(makeString("Quote")), constant_handles.reader_make_constant_shell(makeString("EscapeQuote")), constant_handles.reader_make_constant_shell(makeString("QuasiQuote")), constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn")), constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn")));



    static private final SubLString $str_alt115$Found_non_assertion_supports__a = makeString("Found non-assertion supports ~a");

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol UNFOLIFIABLE_JUSTIFICATION_TERM_P = makeSymbol("UNFOLIFIABLE-JUSTIFICATION-TERM-P");

    static private final SubLList $list_alt118 = list(makeKeyword("RETURN-DATA?"), T, makeKeyword("VERBOSE?"), NIL);

    private static final SubLSymbol $FOL_SENTENCES_DATA = makeKeyword("FOL-SENTENCES-DATA");

    static private final SubLList $list_alt120 = list(makeSymbol("TERM"), makeSymbol("FOL-SENTENCES"), makeSymbol("&OPTIONAL"), makeSymbol("UNHANDLED-FOL-SENTENCES"));

    static private final SubLString $str_alt121$Could_not_folify_support___s = makeString("Could not folify support: ~s");

    static private final SubLString $str_alt122$__static__a_include___a_____ = makeString("%$static(~a,include('~a'))~%");

    static private final SubLString $str_alt123$ = makeString("");

    static private final SubLString $str_alt124$include___a_____ = makeString("include('~a').~%");

    static private final SubLString $str_alt125$_cyc_projects_EfficientPathfindin = makeString("/cyc/projects/EfficientPathfinding/experiments/");

    static private final SubLList $list_alt126 = list(makeSymbol("DIRECTORY"), list(makeSymbol("THEOREM-PROVER"), makeSymbol("FILENAME"), makeSymbol("ACTUAL-ANSWERABILITY"), makeSymbol("EXPECTED-ANSWERABILITY"), makeSymbol("TIME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym127$DATA_FILE = makeUninternedSymbol("DATA-FILE");





    public static final SubLSymbol $tptp_experiment_base_directory$ = makeSymbol("*TPTP-EXPERIMENT-BASE-DIRECTORY*");

    static private final SubLList $list_alt131 = list(makeString("/"), makeString("data.csv"));

    private static final SubLSymbol WOULD_BE_NICE_IF = makeSymbol("WOULD-BE-NICE-IF");

    static private final SubLSymbol $sym133$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");

    static private final SubLString $str_alt134$Could_not_find__a = makeString("Could not find ~a");



    private static final SubLSymbol CDOLINES_TOKENIZED = makeSymbol("CDOLINES-TOKENIZED");

    static private final SubLList $list_alt137 = list(makeKeyword("BREAK-LIST"), list(QUOTE, list(CHAR_comma)));

    static private final SubLList $list_alt138 = list(makeSymbol("DIRECTORY"), list(makeSymbol("THEOREM-PROVER"), makeSymbol("PROBLEM-FILENAME"), makeSymbol("ACTUAL-ANSWERABILITY"), makeSymbol("EXPECTED-ANSWERABILITY"), makeSymbol("TOTAL-TIME"), makeSymbol("LOAD-TIME"), makeSymbol("INFERENCE-TIME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym139$DATA = makeUninternedSymbol("DATA");



    private static final SubLSymbol PARSE_TPTP_EXPERIMENT_DATA_FILE = makeSymbol("PARSE-TPTP-EXPERIMENT-DATA-FILE");



    static private final SubLList $list_alt143 = list(list(makeString("run20070322-112218"), makeInteger(42)), list(makeString("run20070322-112224"), makeInteger(264)), list(makeString("run20070322-112233"), makeInteger(3438)), list(makeString("run20070322-112623"), makeInteger(7684)), list(makeString("run20070322-121429"), makeInteger(11781)), list(makeString("run20070322-132359"), makeInteger(14470)));

    static private final SubLList $list_alt144 = list(makeSymbol("DIRECTORY"), makeSymbol("AXIOM-COUNT"));

    static private final SubLList $list_alt145 = list(new SubLObject[]{ list(makeString("run20070404-131328"), ZERO_INTEGER), list(makeString("run20070404-131334"), makeInteger(224)), list(makeString("run20070404-131344"), makeInteger(344)), list(makeString("run20070404-131357"), makeInteger(619)), list(makeString("run20070404-131417"), makeInteger(729)), list(makeString("run20070404-131441"), makeInteger(920)), list(makeString("run20070404-131512"), makeInteger(1024)), list(makeString("run20070404-131548"), makeInteger(1206)), list(makeString("run20070404-131630"), makeInteger(1479)), list(makeString("run20070404-131725"), makeInteger(1545)), list(makeString("run20070404-131825"), makeInteger(1725)), list(makeString("run20070404-131934"), makeInteger(3388)), list(makeString("run20070404-134858"), makeInteger(7524)), list(makeString("run20070404-132340"), makeInteger(7713)), list(makeString("run20070404-141233"), makeInteger(11681)), list(makeString("run20070404-151730"), makeInteger(13102)), list(makeString("run20070404-164718"), makeInteger(14324)) });

    private static final SubLSymbol $MEDIAN_TOTAL_TIME = makeKeyword("MEDIAN-TOTAL-TIME");

    private static final SubLSymbol $MEDIAN_LOAD_TIME = makeKeyword("MEDIAN-LOAD-TIME");

    private static final SubLSymbol $MEDIAN_INFERENCE_TIME = makeKeyword("MEDIAN-INFERENCE-TIME");

    static private final SubLString $str_alt149$_ = makeString("/");

    static private final SubLString $str_alt150$data_csv = makeString("data.csv");





    static private final SubLList $list_alt153 = list(CHAR_comma);

    static private final SubLList $list_alt154 = list(makeSymbol("THEOREM-PROVER-STRING"), makeSymbol("FILENAME"), makeSymbol("ACTUAL-ANSWERABILITY"), makeSymbol("EXPECTED-ANSWERABILITY"), makeSymbol("TIME"));

    static private final SubLList $list_alt155 = list(makeSymbol("THEOREM-PROVER-STRING"), makeSymbol("FILENAME"), makeSymbol("ACTUAL-ANSWERABILITY"), makeSymbol("EXPECTED-ANSWERABILITY"), makeSymbol("TOTAL-TIME"), makeSymbol("LOAD-TIME"), makeSymbol("INFERENCE-TIME"));

    static private final SubLString $str_alt156$Could_not_find_a_corresponding_ex = makeString("Could not find a corresponding experiment for ~a in ~a");

    static private final SubLString $$$LoadTest = makeString("LoadTest");

    static private final SubLString $$$SPASS = makeString("SPASS");



    private static final SubLSymbol $LOAD_TIME = makeKeyword("LOAD-TIME");



    static private final SubLList $list_alt162 = list(makeSymbol("THEOREM-PROVER"), makeSymbol("FILENAME"), makeSymbol("ACTUAL-ANSWERABILITY"), makeSymbol("EXPECTED-ANSWERABILITY"), makeSymbol("TOTAL-TIME"), makeSymbol("LOAD-TIME"), makeSymbol("INFERENCE-TIME"));

    // // Initializers
    public void declareFunctions() {
        declare_tptp_problem_generator_file();
    }

    public void initializeVariables() {
        init_tptp_problem_generator_file();
    }

    public void runTopLevelForms() {
        setup_tptp_problem_generator_file();
    }
}

