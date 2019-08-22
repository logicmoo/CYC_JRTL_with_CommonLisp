/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_negative_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PLOT-GENERATION
 * source file: /cyc/top/cycl/plot-generation.lisp
 * created:     2019/07/03 17:37:48
 */
public final class plot_generation extends SubLTranslatedFile implements V12 {
    public static final SubLObject view_nart_counts_of_type_from_0(SubLObject type, SubLObject functor, SubLObject dir) {
        if (functor == UNPROVIDED) {
            functor = $$InstanceNamedFn_Ternary;
        }
        if (dir == UNPROVIDED) {
            dir = $infn_count_data_dir$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.plot_generation.view_nart_counts_of_type(type, functor, T, dir);
    }

    public static final SubLObject view_nart_counts_of_type(SubLObject type, SubLObject functor, SubLObject y_starts_at_0P, SubLObject dir) {
        if (functor == UNPROVIDED) {
            functor = $$InstanceNamedFn_Ternary;
        }
        if (y_starts_at_0P == UNPROVIDED) {
            y_starts_at_0P = NIL;
        }
        if (dir == UNPROVIDED) {
            dir = $infn_count_data_dir$.getGlobalValue();
        }
        {
            SubLObject plot_data = NIL;
            SubLObject plot_properties = list($XLABEL, $$$Cyc_KB, $YLABEL, $$$NART_Count, $PLOT_TITLE, cconcatenate(format_nil.format_nil_a_no_copy(type), new SubLObject[]{ $str_alt70$_, format_nil.format_nil_a_no_copy(kb_paths.fort_name(functor)), $str_alt61$_NART_Counts }), $YORIGIN, NIL != y_starts_at_0P ? ((SubLObject) (ZERO_INTEGER)) : NIL);
            SubLObject cdolist_list_var = Filesys.directory(dir, UNPROVIDED);
            SubLObject short_file_name = NIL;
            for (short_file_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , short_file_name = cdolist_list_var.first()) {
                {
                    SubLObject regexp = cconcatenate($str_alt64$KB__0_9___, new SubLObject[]{ format_nil.format_nil_a_no_copy(constants_high.constant_name(functor)), $str_alt65$_NARTS_txt });
                    if (NIL != regular_expression_utilities.find_all_matches_for_regular_expression(regexp, short_file_name, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject kb_num = read_from_string(string_utilities.substring(short_file_name, THREE_INTEGER, SEVEN_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject filename = cconcatenate(dir, short_file_name);
                            SubLObject nart_count = ZERO_INTEGER;
                            SubLObject set_contents_var = set.do_set_internal(kb_cleanup.functor_narts_in_kb(functor, kb_num, dir));
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject nart = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                                        if (cycl_utilities.nat_arg2(nart, UNPROVIDED).equal(type)) {
                                            nart_count = add(nart_count, ONE_INTEGER);
                                        }
                                    }
                                }
                            }
                            plot_data = cons(list(kb_num, nart_count), plot_data);
                        }
                    }
                }
            }
            plot_data = Sort.sort(plot_data, $sym32$_, FIRST);
            return com.cyc.cycjava.cycl.plot_generation.generate_line_graph(plot_data, plot_properties);
        }
    }

    public static final SubLObject view_nart_counts_from_0(SubLObject functor, SubLObject dir) {
        if (functor == UNPROVIDED) {
            functor = $$InstanceNamedFn_Ternary;
        }
        if (dir == UNPROVIDED) {
            dir = $infn_count_data_dir$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.plot_generation.view_nart_counts(functor, T, dir, UNPROVIDED);
    }

    /**
     * If there is an output-filename specified, the graph will be saved instead of shown on the screen
     *
     * @param FUNCTOR;
     * 		one of #$InstanceNamedFn-Ternary or #$ProperSubcollectionNamedFn-Ternary
     * @param OUTPUT-FILENAME
     * 		stringp; a full path to the file you want to save the plot in, but with NO extension (extensions vary depending
     * 		on the platform (it will end up as either png or gif
     * @param Y-STARTS-AT-0?
    		booleanp
     * 		
     */
    @LispMethod(comment = "If there is an output-filename specified, the graph will be saved instead of shown on the screen\r\n\r\n@param FUNCTOR;\r\n\t\tone of #$InstanceNamedFn-Ternary or #$ProperSubcollectionNamedFn-Ternary\r\n@param OUTPUT-FILENAME\r\n\t\tstringp; a full path to the file you want to save the plot in, but with NO extension (extensions vary depending\r\n\t\ton the platform (it will end up as either png or gif\r\n@param Y-STARTS-AT-0?\n\t\tbooleanp")
    public static final SubLObject view_nart_counts(SubLObject functor, SubLObject output_filename, SubLObject y_starts_at_0P, SubLObject data_dir) {
        if (functor == UNPROVIDED) {
            functor = $$InstanceNamedFn_Ternary;
        }
        if (output_filename == UNPROVIDED) {
            output_filename = NIL;
        }
        if (y_starts_at_0P == UNPROVIDED) {
            y_starts_at_0P = NIL;
        }
        if (data_dir == UNPROVIDED) {
            data_dir = $infn_count_data_dir$.getGlobalValue();
        }
        {
            SubLObject plot_data = NIL;
            SubLObject functor_name = kb_paths.fort_name(functor);
            SubLObject plot_properties = list($XLABEL, $$$Cyc_KB, $YLABEL, $$$NART_Count, $PLOT_TITLE, cconcatenate(format_nil.format_nil_a_no_copy(functor_name), $str_alt61$_NART_Counts), $YORIGIN, NIL != y_starts_at_0P ? ((SubLObject) (ZERO_INTEGER)) : NIL);
            if (NIL != output_filename) {
                plot_properties = putf(plot_properties, $OUTPUT_FILE, output_filename);
            }
            {
                SubLObject cdolist_list_var = Filesys.directory(data_dir, UNPROVIDED);
                SubLObject short_file_name = NIL;
                for (short_file_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , short_file_name = cdolist_list_var.first()) {
                    {
                        SubLObject regexp = cconcatenate($str_alt64$KB__0_9___, new SubLObject[]{ format_nil.format_nil_a_no_copy(constants_high.constant_name(functor)), $str_alt65$_NARTS_txt });
                        if (NIL != regular_expression_utilities.find_all_matches_for_regular_expression(regexp, short_file_name, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject kb_num = read_from_string(string_utilities.substring(short_file_name, THREE_INTEGER, SEVEN_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject file_name = cconcatenate(data_dir, short_file_name);
                                SubLObject doneP = NIL;
                                SubLObject nart_count = NIL;
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(file_name, $INPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt67$Unable_to_open__S, file_name);
                                    }
                                    {
                                        SubLObject infile = stream;
                                        if (infile.isStream()) {
                                            {
                                                SubLObject line = NIL;
                                                for (line = read_line(infile, NIL, NIL, UNPROVIDED); !((NIL == line) || (NIL != doneP)); line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                                    doneP = T;
                                                    if (NIL != string_utilities.substringP($$$NART, line, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                        nart_count = read_from_string(regular_expression_utilities.find_all_matches_for_regular_expression($str_alt69$_0_9___, line, UNPROVIDED, UNPROVIDED).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                if (NIL != nart_count) {
                                    plot_data = cons(list(kb_num, nart_count), plot_data);
                                }
                            }
                        }
                    }
                }
            }
            plot_data = Sort.sort(plot_data, $sym32$_, FIRST);
            return com.cyc.cycjava.cycl.plot_generation.generate_line_graph(plot_data, plot_properties);
        }
    }

    public static final SubLObject do_kb_stats_data_files(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt40);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject file = NIL;
                    SubLObject kb_num = NIL;
                    SubLObject functor = NIL;
                    SubLObject dir_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt40);
                    file = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt40);
                    kb_num = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt40);
                    functor = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt40);
                    dir_name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject short_file_name = $sym41$SHORT_FILE_NAME;
                            SubLObject regexp = $sym42$REGEXP;
                            return list(CDOLIST, list(short_file_name, list(DIRECTORY, dir_name)), list(CLET, list(list(regexp, list(FORMAT_NIL, $str_alt47$KB__0_9____A_NARTS_txt, list(CONSTANT_NAME, functor)))), list(PWHEN, list(FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION, regexp, short_file_name), listS(CLET, list(list(kb_num, list(READ_FROM_STRING, listS(SUBSTRING, short_file_name, $list_alt53))), list(file, list(CCONCATENATE, dir_name, short_file_name))), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt40);
                    }
                }
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt1$ = makeString("");

    public static final SubLFile me = new plot_generation();

 public static final String myName = "com.cyc.cycjava.cycl.plot_generation";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $infn_count_data_dir$ = makeSymbol("*INFN-COUNT-DATA-DIR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_plot_name$ = makeSymbol("*DEFAULT-PLOT-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $plot_directory$ = makeSymbol("*PLOT-DIRECTORY*");

    static private final SubLString $str1$ = makeString("");

    private static final SubLSymbol COORDINATIFY = makeSymbol("COORDINATIFY");

    static private final SubLList $list5 = list($BOTH, makeKeyword("BASELINE"), makeKeyword("EXPERIMENT"));

    static private final SubLString $str6$Invalid_sort_by_parameter_ = makeString("Invalid sort-by parameter.");

    static private final SubLList $list8 = list(makeKeyword("ALL"), makeKeyword("FIRST"));

    static private final SubLString $str9$There_should_be_atleast_2_runs_sp = makeString("There should be atleast 2 runs specified");

    static private final SubLSymbol $sym12$SAFE__ = makeSymbol("SAFE-<");

    static private final SubLList $list14 = list(makeSymbol("SCALED-ANSWERABLE-VALUES"), makeSymbol("SCALED-UNANSWERABLE-VALUES"));

    private static final SubLList $list15 = list(makeString("unanswerable"), makeString("answerable"));

    private static final SubLString $$$timed_out = makeString("timed out");

    private static final SubLSymbol $sym17$KBQ_QUERY_RUN_TIMED_OUT_ = makeSymbol("KBQ-QUERY-RUN-TIMED-OUT?");

    private static final SubLString $str18$No_oracularly_answerable_timed_ou = makeString("No oracularly answerable timed-out queries");

    private static final SubLString $str19$_tmp_inference_answer_timeline_da = makeString("/tmp/inference_answer_timeline.data");

    private static final SubLString $str20$_tmp_inference_answer_timeline_pl = makeString("/tmp/inference_answer_timeline.plot");

    private static final SubLString $$$baseline = makeString("baseline");

    private static final SubLString $$$experiment = makeString("experiment");

    private static final SubLString $str26$baseline_____ = makeString("baseline   = ");

    private static final SubLString $str27$experiment___ = makeString("experiment = ");

    private static final SubLString $str28$property_____ = makeString("property   = ");

    private static final SubLString $str29$Cannot_handle_more_than_10_proper = makeString("Cannot handle more than 10 properties, got ~s");

    private static final SubLString $str31$properties___ = makeString("properties = ");

    private static final SubLString $$$classification_0 = makeString("classification 0");

    private static final SubLSymbol $sym33$_ = makeSymbol("<");

    private static final SubLString $$$classification_ = makeString("classification ");

    private static final SubLString $str37$Classification__S_was_empty = makeString("Classification ~S was empty");

    private static final SubLList $list38 = list(makeSymbol("ELEMENT"), makeSymbol("VALUE"));

    private static final SubLString $str40$_cyc_top_data_kb_stats_ = makeString("/cyc/top/data/kb-stats/");

    private static final SubLList $list42 = list(makeSymbol("X"), makeSymbol("Y"));

    private static final SubLFloat $float$0_3 = makeDouble(0.3);

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLList $list45 = list(makeSymbol("WHO-CARES"), makeSymbol("VALUE"));

    private static final SubLString $$$plot = makeString("plot");

    private static final SubLString $str49$_tmp_ = makeString("/tmp/");

    private static final SubLString $str50$_ = makeString(".");

    private static final SubLString $$$dat = makeString("dat");

    private static final SubLString $str52$External_plotting_not_enabled_in_ = makeString("External plotting not enabled in this image");

    private static final SubLSymbol RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES = makeSymbol("RANK-AND-CLASSIFY-PROPERTY-CLASSIFICATION-TUPLES");

    private static final SubLList $list60 = list(list(list(list(list(ONE_INTEGER, makeDouble(0.4)), list(MINUS_ONE_INTEGER, makeDouble(0.7)), list(TWO_INTEGER, makeDouble(0.3)), list(makeInteger(-2), makeDouble(0.1))), list(makeSymbol("PLUSP"), makeSymbol("MINUSP"))), list(list(ONE_INTEGER, makeDouble(0.3)), list(TWO_INTEGER, makeDouble(0.4)), makeString("classification 1"), list(ZERO_INTEGER, makeDouble(0.1)), list(THREE_INTEGER, makeDouble(0.7)))));

    // Definitions
    /**
     * Generates (and optionally displays) a line graph with coordinates COORDINATES.
     * Each point in COORDINATES is graphed, in addition to a line connecting each adjacent point.
     *
     * @param COORDINATES;
     * 		a list of doubletons, each of the form (X-COORD Y-COORD)
     * @see WRITE-PLOT-FILE-HEADER for a list of (most of) the supported plot-properties
     * @unknown if there is an OUTPUT-FILE specification in PLOT-PROPERTIES, the graph will be saved instead
    shown on the screen.
     */
    @LispMethod(comment = "Generates (and optionally displays) a line graph with coordinates COORDINATES.\r\nEach point in COORDINATES is graphed, in addition to a line connecting each adjacent point.\r\n\r\n@param COORDINATES;\r\n\t\ta list of doubletons, each of the form (X-COORD Y-COORD)\r\n@see WRITE-PLOT-FILE-HEADER for a list of (most of) the supported plot-properties\r\n@unknown if there is an OUTPUT-FILE specification in PLOT-PROPERTIES, the graph will be saved instead\r\nshown on the screen.\nGenerates (and optionally displays) a line graph with coordinates COORDINATES.\nEach point in COORDINATES is graphed, in addition to a line connecting each adjacent point.")
    public static final SubLObject generate_line_graph_alt(SubLObject coordinates, SubLObject plot_properties) {
        {
            SubLObject line_label = getf(plot_properties, $LINE_LABEL, $str_alt1$);
            SubLObject new_plot_properties = copy_list(plot_properties);
            new_plot_properties = remf(new_plot_properties, $LINE_LABEL);
            new_plot_properties = putf(new_plot_properties, $LINE_LABELS, list(line_label));
            return com.cyc.cycjava.cycl.plot_generation.generate_lines_graph(list(coordinates), new_plot_properties);
        }
    }

    // Definitions
    /**
     * Generates (and optionally displays) a line graph with coordinates COORDINATES.
     * Each point in COORDINATES is graphed, in addition to a line connecting each adjacent point.
     *
     * @param COORDINATES;
     * 		a list of doubletons, each of the form (X-COORD Y-COORD)
     * @see WRITE-PLOT-FILE-HEADER for a list of (most of) the supported plot-properties
     * @unknown if there is an OUTPUT-FILE specification in PLOT-PROPERTIES, the graph will be saved instead
    shown on the screen.
     */
    @LispMethod(comment = "Generates (and optionally displays) a line graph with coordinates COORDINATES.\r\nEach point in COORDINATES is graphed, in addition to a line connecting each adjacent point.\r\n\r\n@param COORDINATES;\r\n\t\ta list of doubletons, each of the form (X-COORD Y-COORD)\r\n@see WRITE-PLOT-FILE-HEADER for a list of (most of) the supported plot-properties\r\n@unknown if there is an OUTPUT-FILE specification in PLOT-PROPERTIES, the graph will be saved instead\r\nshown on the screen.\nGenerates (and optionally displays) a line graph with coordinates COORDINATES.\nEach point in COORDINATES is graphed, in addition to a line connecting each adjacent point.")
    public static SubLObject generate_line_graph(final SubLObject coordinates, final SubLObject plot_properties) {
        final SubLObject line_label = getf(plot_properties, $LINE_LABEL, $str1$);
        SubLObject new_plot_properties = copy_list(plot_properties);
        new_plot_properties = remf(new_plot_properties, $LINE_LABEL);
        new_plot_properties = putf(new_plot_properties, $LINE_LABELS, list(line_label));
        return generate_lines_graph(list(coordinates), new_plot_properties);
    }

    public static final SubLObject generate_line_graph_from_values_alt(SubLObject values, SubLObject plot_properties) {
        return com.cyc.cycjava.cycl.plot_generation.generate_line_graph(com.cyc.cycjava.cycl.plot_generation.coordinatify(values), plot_properties);
    }

    public static SubLObject generate_line_graph_from_values(final SubLObject values, final SubLObject plot_properties) {
        return generate_line_graph(coordinatify(values), plot_properties);
    }

    /**
     * Generates (and optionally displays) a graph of multiple overlayed lines.
     * Each element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.
     * Assumes that each COORDINATES in COORDINATES-LIST is of equal length.
     */
    @LispMethod(comment = "Generates (and optionally displays) a graph of multiple overlayed lines.\r\nEach element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.\r\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.\nGenerates (and optionally displays) a graph of multiple overlayed lines.\nEach element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.")
    public static final SubLObject generate_lines_graph_alt(SubLObject coordinates_list, SubLObject plot_properties) {
        {
            SubLObject line_count = length(coordinates_list);
            SubLObject tuples = list_utilities.collate(coordinates_list);
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.plot_data_full_filename_from_properties(plot_properties);
            com.cyc.cycjava.cycl.plot_generation.save_plot_datafile(data_filename, tuples, UNPROVIDED);
            {
                SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
                SubLObject display = com.cyc.cycjava.cycl.plot_generation.plot_properties_display(plot_properties);
                com.cyc.cycjava.cycl.plot_generation.save_lines_graph_plot_file(plot_filename, data_filename, plot_properties, line_count);
                return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
            }
        }
    }

    /**
     * Generates (and optionally displays) a graph of multiple overlayed lines.
     * Each element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.
     * Assumes that each COORDINATES in COORDINATES-LIST is of equal length.
     */
    @LispMethod(comment = "Generates (and optionally displays) a graph of multiple overlayed lines.\r\nEach element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.\r\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.\nGenerates (and optionally displays) a graph of multiple overlayed lines.\nEach element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.")
    public static SubLObject generate_lines_graph(final SubLObject coordinates_list, final SubLObject plot_properties) {
        final SubLObject line_count = length(coordinates_list);
        final SubLObject tuples = list_utilities.collate(coordinates_list);
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        save_plot_datafile(data_filename, tuples, UNPROVIDED);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_lines_graph_plot_file(plot_filename, data_filename, plot_properties, line_count);
        return possibly_display_saved_plot(plot_filename, display);
    }

    /**
     * Generates (and optionally displays) a graph of multiple overlayed lines.
     * Each element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.
     * Assumes that each COORDINATES in COORDINATES-LIST is of equal length.
     */
    @LispMethod(comment = "Generates (and optionally displays) a graph of multiple overlayed lines.\r\nEach element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.\r\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.\nGenerates (and optionally displays) a graph of multiple overlayed lines.\nEach element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.")
    public static final SubLObject generate_unconnected_lines_graph_alt(SubLObject coordinates_list, SubLObject plot_properties) {
        {
            SubLObject line_count = length(coordinates_list);
            SubLObject tuples = list_utilities.collate(coordinates_list);
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.plot_data_full_filename_from_properties(plot_properties);
            com.cyc.cycjava.cycl.plot_generation.save_plot_datafile(data_filename, tuples, UNPROVIDED);
            {
                SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
                SubLObject display = com.cyc.cycjava.cycl.plot_generation.plot_properties_display(plot_properties);
                com.cyc.cycjava.cycl.plot_generation.save_property_comparison_plot_file(plot_filename, data_filename, plot_properties, line_count);
                return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
            }
        }
    }

    /**
     * Generates (and optionally displays) a graph of multiple overlayed lines.
     * Each element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.
     * Assumes that each COORDINATES in COORDINATES-LIST is of equal length.
     */
    @LispMethod(comment = "Generates (and optionally displays) a graph of multiple overlayed lines.\r\nEach element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.\r\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.\nGenerates (and optionally displays) a graph of multiple overlayed lines.\nEach element of COORDINATES-LIST specifies the points along one of the lines, a la @xref generate-line-graph.\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.")
    public static SubLObject generate_unconnected_lines_graph(final SubLObject coordinates_list, final SubLObject plot_properties) {
        final SubLObject line_count = length(coordinates_list);
        final SubLObject tuples = list_utilities.collate(coordinates_list);
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        save_plot_datafile(data_filename, tuples, UNPROVIDED);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_property_comparison_plot_file(plot_filename, data_filename, plot_properties, line_count);
        return possibly_display_saved_plot(plot_filename, display);
    }

    /**
     * Generates (and optionally displays) a graph of multiple sets of points.
     * Each element of COORDINATES-LIST specifies the points in one set, a la @xref generate-line-graph.
     * Assumes that each COORDINATES in COORDINATES-LIST is of equal length.
     */
    @LispMethod(comment = "Generates (and optionally displays) a graph of multiple sets of points.\r\nEach element of COORDINATES-LIST specifies the points in one set, a la @xref generate-line-graph.\r\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.\nGenerates (and optionally displays) a graph of multiple sets of points.\nEach element of COORDINATES-LIST specifies the points in one set, a la @xref generate-line-graph.\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.")
    public static final SubLObject generate_points_graph_alt(SubLObject coordinates_list, SubLObject plot_properties) {
        {
            SubLObject point_set_count = length(coordinates_list);
            SubLObject tuples = list_utilities.collate(coordinates_list);
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.plot_data_full_filename_from_properties(plot_properties);
            com.cyc.cycjava.cycl.plot_generation.save_plot_datafile(data_filename, tuples, UNPROVIDED);
            {
                SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
                SubLObject display = com.cyc.cycjava.cycl.plot_generation.plot_properties_display(plot_properties);
                com.cyc.cycjava.cycl.plot_generation.save_points_graph_plot_file(plot_filename, data_filename, plot_properties, point_set_count);
                return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
            }
        }
    }

    /**
     * Generates (and optionally displays) a graph of multiple sets of points.
     * Each element of COORDINATES-LIST specifies the points in one set, a la @xref generate-line-graph.
     * Assumes that each COORDINATES in COORDINATES-LIST is of equal length.
     */
    @LispMethod(comment = "Generates (and optionally displays) a graph of multiple sets of points.\r\nEach element of COORDINATES-LIST specifies the points in one set, a la @xref generate-line-graph.\r\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.\nGenerates (and optionally displays) a graph of multiple sets of points.\nEach element of COORDINATES-LIST specifies the points in one set, a la @xref generate-line-graph.\nAssumes that each COORDINATES in COORDINATES-LIST is of equal length.")
    public static SubLObject generate_points_graph(final SubLObject coordinates_list, final SubLObject plot_properties) {
        final SubLObject point_set_count = length(coordinates_list);
        final SubLObject tuples = list_utilities.collate(coordinates_list);
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        save_plot_datafile(data_filename, tuples, UNPROVIDED);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_points_graph_plot_file(plot_filename, data_filename, plot_properties, point_set_count);
        return possibly_display_saved_plot(plot_filename, display);
    }

    /**
     * Generates (and optionally displays) a correlation plot with coordinates COORDINATES.
     * Each point in COORDINATES is graphed.
     *
     * @param COORDINATES;
     * 		a list of doubletons, each of the form (X-COORD Y-COORD)
     * @see WRITE-PLOT-FILE-HEADER for a list of (most of) the supported plot-properties
     * @unknown if there is an OUTPUT-FILE specification in PLOT-PROPERTIES, the graph will be saved instead
    shown on the screen.
     */
    @LispMethod(comment = "Generates (and optionally displays) a correlation plot with coordinates COORDINATES.\r\nEach point in COORDINATES is graphed.\r\n\r\n@param COORDINATES;\r\n\t\ta list of doubletons, each of the form (X-COORD Y-COORD)\r\n@see WRITE-PLOT-FILE-HEADER for a list of (most of) the supported plot-properties\r\n@unknown if there is an OUTPUT-FILE specification in PLOT-PROPERTIES, the graph will be saved instead\r\nshown on the screen.\nGenerates (and optionally displays) a correlation plot with coordinates COORDINATES.\nEach point in COORDINATES is graphed.")
    public static final SubLObject generate_correlation_plot_alt(SubLObject coordinates, SubLObject plot_properties) {
        {
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.plot_data_full_filename_from_properties(plot_properties);
            SubLObject ranked_coordinates = list_utilities.rank_tuples(coordinates);
            com.cyc.cycjava.cycl.plot_generation.save_plot_datafile(data_filename, ranked_coordinates, UNPROVIDED);
            {
                SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
                SubLObject display = com.cyc.cycjava.cycl.plot_generation.plot_properties_display(plot_properties);
                com.cyc.cycjava.cycl.plot_generation.save_correlation_plot_file(plot_filename, data_filename, plot_properties);
                return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
            }
        }
    }

    /**
     * Generates (and optionally displays) a correlation plot with coordinates COORDINATES.
     * Each point in COORDINATES is graphed.
     *
     * @param COORDINATES;
     * 		a list of doubletons, each of the form (X-COORD Y-COORD)
     * @see WRITE-PLOT-FILE-HEADER for a list of (most of) the supported plot-properties
     * @unknown if there is an OUTPUT-FILE specification in PLOT-PROPERTIES, the graph will be saved instead
    shown on the screen.
     */
    @LispMethod(comment = "Generates (and optionally displays) a correlation plot with coordinates COORDINATES.\r\nEach point in COORDINATES is graphed.\r\n\r\n@param COORDINATES;\r\n\t\ta list of doubletons, each of the form (X-COORD Y-COORD)\r\n@see WRITE-PLOT-FILE-HEADER for a list of (most of) the supported plot-properties\r\n@unknown if there is an OUTPUT-FILE specification in PLOT-PROPERTIES, the graph will be saved instead\r\nshown on the screen.\nGenerates (and optionally displays) a correlation plot with coordinates COORDINATES.\nEach point in COORDINATES is graphed.")
    public static SubLObject generate_correlation_plot(final SubLObject coordinates, final SubLObject plot_properties) {
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        final SubLObject ranked_coordinates = list_utilities.rank_tuples(coordinates);
        save_plot_datafile(data_filename, ranked_coordinates, UNPROVIDED);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_correlation_plot_file(plot_filename, data_filename, plot_properties);
        return possibly_display_saved_plot(plot_filename, display);
    }

    public static final SubLObject generate_lines_graph_from_values_list_alt(SubLObject values_list, SubLObject plot_properties, SubLObject scaleP) {
        if (scaleP == UNPROVIDED) {
            scaleP = T;
        }
        {
            SubLObject scaled_values_list = (NIL != scaleP) ? ((SubLObject) (com.cyc.cycjava.cycl.plot_generation.scale_lengths(values_list))) : values_list;
            SubLObject coordinates_list = com.cyc.cycjava.cycl.plot_generation.equalize_lengths(Mapping.mapcar(COORDINATIFY, scaled_values_list));
            return com.cyc.cycjava.cycl.plot_generation.generate_lines_graph(coordinates_list, plot_properties);
        }
    }

    public static SubLObject generate_lines_graph_from_values_list(final SubLObject values_list, final SubLObject plot_properties, SubLObject scaleP) {
        if (scaleP == UNPROVIDED) {
            scaleP = T;
        }
        final SubLObject scaled_values_list = (NIL != scaleP) ? scale_lengths(values_list) : values_list;
        final SubLObject coordinates_list = equalize_lengths(Mapping.mapcar(COORDINATIFY, scaled_values_list));
        return generate_lines_graph(coordinates_list, plot_properties);
    }

    public static final SubLObject kbq_generate_property_correlation_plot_alt(SubLObject baseline_run, SubLObject experiment_run, SubLObject property, SubLObject plot_properties, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        {
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.kbq_save_property_comparison_datafile(baseline_run, experiment_run, property, plot_properties);
            SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
            com.cyc.cycjava.cycl.plot_generation.save_property_correlation_plot_file(plot_filename, data_filename, plot_properties);
            return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
        }
    }

    public static SubLObject kbq_generate_property_correlation_plot(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        final SubLObject data_filename = kbq_save_property_comparison_datafile(baseline_run, experiment_run, property, plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        save_property_correlation_plot_file(plot_filename, data_filename, plot_properties);
        return possibly_display_saved_plot(plot_filename, display);
    }

    public static final SubLObject kbq_generate_properties_correlation_plot_alt(SubLObject query_set_run, SubLObject x_property, SubLObject y_property, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        {
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.kbq_save_properties_comparison_datafile(query_set_run, list(x_property, y_property), plot_properties);
            SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
            SubLObject display = com.cyc.cycjava.cycl.plot_generation.plot_properties_display(plot_properties);
            com.cyc.cycjava.cycl.plot_generation.save_property_correlation_plot_file(plot_filename, data_filename, plot_properties);
            return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
        }
    }

    public static SubLObject kbq_generate_properties_correlation_plot(final SubLObject query_set_run, final SubLObject x_property, final SubLObject y_property, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        final SubLObject data_filename = kbq_save_properties_comparison_datafile(query_set_run, list(x_property, y_property), plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_property_correlation_plot_file(plot_filename, data_filename, plot_properties);
        return possibly_display_saved_plot(plot_filename, display);
    }

    public static final SubLObject kbq_generate_sorted_property_comparison_alt(SubLObject baseline_run, SubLObject experiment_run, SubLObject property, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $BOTH;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == member(sort_by, $list_alt5, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt6$Invalid_sort_by_parameter_);
                }
            }
            {
                SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.kbq_save_property_comparison_datafile(baseline_run, experiment_run, property, plot_properties);
                SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
                com.cyc.cycjava.cycl.plot_generation.save_sorted_property_comparison_plot_file(plot_filename, data_filename, plot_properties, sort_by);
                return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
            }
        }
    }

    public static SubLObject kbq_generate_sorted_property_comparison(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $BOTH;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(sort_by, $list5, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str6$Invalid_sort_by_parameter_);
        }
        final SubLObject data_filename = kbq_save_property_comparison_datafile(baseline_run, experiment_run, property, plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        save_sorted_property_comparison_plot_file(plot_filename, data_filename, plot_properties, sort_by);
        return possibly_display_saved_plot(plot_filename, display);
    }

    public static final SubLObject kbq_generate_sorted_property_comparison_for_runs_alt(SubLObject runs, SubLObject property, SubLObject plot_properties, SubLObject sort_by) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $FIRST;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == member(sort_by, $list_alt8, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt6$Invalid_sort_by_parameter_);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!length(runs).numG(ONE_INTEGER)) {
                    Errors.error($str_alt9$There_should_be_atleast_2_runs_sp);
                }
            }
            {
                SubLObject tuples = com.cyc.cycjava.cycl.plot_generation.kbq_generate_sorted_tuples_for_property_comparison_for_runs(runs, property, sort_by);
                return com.cyc.cycjava.cycl.plot_generation.generate_unconnected_lines_graph(tuples, plot_properties);
            }
        }
    }

    public static SubLObject kbq_generate_sorted_property_comparison_for_runs(final SubLObject runs, final SubLObject property, SubLObject plot_properties, SubLObject sort_by) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $FIRST;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(sort_by, $list8, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str6$Invalid_sort_by_parameter_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!length(runs).numG(ONE_INTEGER))) {
            Errors.error($str9$There_should_be_atleast_2_runs_sp);
        }
        final SubLObject tuples = kbq_generate_sorted_tuples_for_property_comparison_for_runs(runs, property, sort_by);
        return generate_unconnected_lines_graph(tuples, plot_properties);
    }

    public static final SubLObject kbq_generate_sorted_properties_comparison_alt(SubLObject query_set_run, SubLObject v_properties, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $ALL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((sort_by == $ALL) || (NIL != member(sort_by, v_properties, UNPROVIDED, UNPROVIDED)))) {
                    Errors.error($str_alt6$Invalid_sort_by_parameter_);
                }
            }
            {
                SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.kbq_save_properties_comparison_datafile(query_set_run, v_properties, plot_properties);
                SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
                com.cyc.cycjava.cycl.plot_generation.save_sorted_properties_comparison_plot_file(plot_filename, data_filename, plot_properties, sort_by, v_properties);
                return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
            }
        }
    }

    public static SubLObject kbq_generate_sorted_properties_comparison(final SubLObject query_set_run, final SubLObject v_properties, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_by == UNPROVIDED) {
            sort_by = $ALL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (sort_by != $ALL)) && (NIL == member(sort_by, v_properties, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str6$Invalid_sort_by_parameter_);
        }
        final SubLObject data_filename = kbq_save_properties_comparison_datafile(query_set_run, v_properties, plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        save_sorted_properties_comparison_plot_file(plot_filename, data_filename, plot_properties, sort_by, v_properties);
        return possibly_display_saved_plot(plot_filename, display);
    }

    public static final SubLObject kbq_generate_sorted_property_display_alt(SubLObject query_set_run, SubLObject property, SubLObject classifications, SubLObject plot_properties, SubLObject display) {
        if (classifications == UNPROVIDED) {
            classifications = NIL;
        }
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        if (NIL == classifications) {
            classifications = list(symbol_function(TRUE));
        }
        {
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.kbq_save_property_classification_datafile(query_set_run, property, classifications, plot_properties);
            SubLObject plot_filename = com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename_from_properties(plot_properties);
            com.cyc.cycjava.cycl.plot_generation.save_sorted_property_display_plot_file(plot_filename, data_filename, plot_properties, classifications);
            return com.cyc.cycjava.cycl.plot_generation.possibly_display_saved_plot(plot_filename, display);
        }
    }

    public static SubLObject kbq_generate_sorted_property_display(final SubLObject query_set_run, final SubLObject property, SubLObject classifications, SubLObject plot_properties, SubLObject display) {
        if (classifications == UNPROVIDED) {
            classifications = NIL;
        }
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (display == UNPROVIDED) {
            display = NIL;
        }
        if (NIL == classifications) {
            classifications = list(symbol_function(TRUE));
        }
        final SubLObject data_filename = kbq_save_property_classification_datafile(query_set_run, property, classifications, plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        save_sorted_property_display_plot_file(plot_filename, data_filename, plot_properties, classifications);
        return possibly_display_saved_plot(plot_filename, display);
    }

    public static final SubLObject kbq_generate_answerable_vs_unanswerable_comparison_alt(SubLObject query_set_run, SubLObject property, SubLObject plot_properties, SubLObject sort_pred) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_pred == UNPROVIDED) {
            sort_pred = symbol_function($sym12$SAFE__);
        }
        {
            SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(query_set_run);
            SubLObject unanswerable = kbq_query_run.kbq_unanswerable_query_set_run(query_set_run);
            return com.cyc.cycjava.cycl.plot_generation.kbq_generate_answerable_vs_unanswerable_comparison_int(answerable, unanswerable, property, plot_properties, sort_pred);
        }
    }

    public static SubLObject kbq_generate_answerable_vs_unanswerable_comparison(final SubLObject query_set_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_pred) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_pred == UNPROVIDED) {
            sort_pred = symbol_function($sym12$SAFE__);
        }
        final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(query_set_run);
        final SubLObject unanswerable = kbq_query_run.kbq_unanswerable_query_set_run(query_set_run);
        return kbq_generate_answerable_vs_unanswerable_comparison_int(answerable, unanswerable, property, plot_properties, sort_pred);
    }

    public static final SubLObject kbq_generate_answerable_vs_unanswerable_comparison_int_alt(SubLObject answerable, SubLObject unanswerable, SubLObject property, SubLObject plot_properties, SubLObject sort_pred) {
        {
            SubLObject answerable_values = kbq_query_run.kbq_extract_property_values(answerable, property, UNPROVIDED);
            SubLObject unanswerable_values = kbq_query_run.kbq_extract_property_values(unanswerable, property, UNPROVIDED);
            SubLObject values_list = list(answerable_values, unanswerable_values);
            SubLObject scaled_values_list = com.cyc.cycjava.cycl.plot_generation.scale_lengths(values_list);
            SubLObject datum = scaled_values_list;
            SubLObject current = datum;
            SubLObject scaled_answerable_values = NIL;
            SubLObject scaled_unanswerable_values = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            scaled_answerable_values = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            scaled_unanswerable_values = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject scaled_sorted_answerable_values = Sort.sort(scaled_answerable_values, sort_pred, UNPROVIDED);
                    SubLObject scaled_sorted_unanswerable_values = Sort.sort(scaled_unanswerable_values, sort_pred, UNPROVIDED);
                    SubLObject answerable_coords = com.cyc.cycjava.cycl.plot_generation.coordinatify(scaled_sorted_answerable_values);
                    SubLObject unanswerable_coords = com.cyc.cycjava.cycl.plot_generation.coordinatify(scaled_sorted_unanswerable_values);
                    SubLObject coordinates_list = com.cyc.cycjava.cycl.plot_generation.equalize_lengths(list(unanswerable_coords, answerable_coords));
                    if (NIL == getf(plot_properties, $LINE_LABELS, UNPROVIDED)) {
                        plot_properties = copy_list(plot_properties);
                        plot_properties = putf(plot_properties, $LINE_LABELS, $list_alt14);
                    }
                    return com.cyc.cycjava.cycl.plot_generation.generate_lines_graph(coordinates_list, plot_properties);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt13);
            }
        }
        return NIL;
    }

    public static SubLObject kbq_generate_answerable_vs_unanswerable_comparison_int(final SubLObject answerable, final SubLObject unanswerable, final SubLObject property, SubLObject plot_properties, final SubLObject sort_pred) {
        final SubLObject current;
        final SubLObject datum = current = plot_properties;
        final SubLObject scaleP_tail = property_list_member($SCALE_, current);
        final SubLObject scaleP = (NIL != scaleP_tail) ? cadr(scaleP_tail) : T;
        final SubLObject answerable_values = kbq_query_run.kbq_extract_property_values(answerable, property, UNPROVIDED);
        final SubLObject unanswerable_values = kbq_query_run.kbq_extract_property_values(unanswerable, property, UNPROVIDED);
        final SubLObject values_list = list(answerable_values, unanswerable_values);
        final SubLObject scaled_values_list = (NIL != scaleP) ? scale_lengths(values_list) : values_list;
        SubLObject current_$2;
        final SubLObject datum_$1 = current_$2 = scaled_values_list;
        SubLObject scaled_answerable_values = NIL;
        SubLObject scaled_unanswerable_values = NIL;
        destructuring_bind_must_consp(current_$2, datum_$1, $list14);
        scaled_answerable_values = current_$2.first();
        current_$2 = current_$2.rest();
        destructuring_bind_must_consp(current_$2, datum_$1, $list14);
        scaled_unanswerable_values = current_$2.first();
        current_$2 = current_$2.rest();
        if (NIL == current_$2) {
            final SubLObject scaled_sorted_answerable_values = Sort.sort(scaled_answerable_values, sort_pred, UNPROVIDED);
            final SubLObject scaled_sorted_unanswerable_values = Sort.sort(scaled_unanswerable_values, sort_pred, UNPROVIDED);
            final SubLObject answerable_coords = coordinatify(scaled_sorted_answerable_values);
            final SubLObject unanswerable_coords = coordinatify(scaled_sorted_unanswerable_values);
            final SubLObject coordinates_list = equalize_lengths(list(unanswerable_coords, answerable_coords));
            if (NIL == getf(plot_properties, $LINE_LABELS, UNPROVIDED)) {
                plot_properties = copy_list(plot_properties);
                plot_properties = putf(plot_properties, $LINE_LABELS, $list15);
            }
            return generate_lines_graph(coordinates_list, plot_properties);
        }
        cdestructuring_bind_error(datum_$1, $list14);
        return NIL;
    }

    /**
     * Takes the subset of QUERY-SET-RUN which timed out or outlier-timed out,
     * and graphs the values of PROPERTY for that subset, split between which ones
     * would have yielded an answer if they ran longer, and which wouldn't have.
     *
     * @param ORACLE-QUERY-SET-RUN
     * 		is only used to predict which queries in QUERY-SET-RUN would have answered if given more time.
     */
    @LispMethod(comment = "Takes the subset of QUERY-SET-RUN which timed out or outlier-timed out,\r\nand graphs the values of PROPERTY for that subset, split between which ones\r\nwould have yielded an answer if they ran longer, and which wouldn\'t have.\r\n\r\n@param ORACLE-QUERY-SET-RUN\r\n\t\tis only used to predict which queries in QUERY-SET-RUN would have answered if given more time.\nTakes the subset of QUERY-SET-RUN which timed out or outlier-timed out,\nand graphs the values of PROPERTY for that subset, split between which ones\nwould have yielded an answer if they ran longer, and which wouldn\'t have.")
    public static final SubLObject kbq_generate_answerability_prediction_display_alt(SubLObject query_set_run, SubLObject oracle_query_set_run, SubLObject property, SubLObject plot_properties, SubLObject sort_pred) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_pred == UNPROVIDED) {
            sort_pred = symbol_function($sym12$SAFE__);
        }
        {
            SubLObject oracle_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(oracle_query_set_run));
            SubLObject unanswerable = kbq_query_run.kbq_unanswerable_query_set_run(query_set_run);
            SubLObject timed_out = kbq_query_run.kbq_filter_query_set_run_by_test(unanswerable, $$$timed_out, $sym16$KBQ_QUERY_RUN_TIMED_OUT_, UNPROVIDED);
            SubLObject answerable_timed_out = kbq_query_run.kbq_filter_query_set_run_to_queries(timed_out, oracle_queries, NIL);
            SubLObject unanswerable_timed_out = kbq_query_run.kbq_filter_query_set_run_to_queries(timed_out, oracle_queries, T);
            if (NIL == kbq_query_run.kbq_query_set_run_query_runs(answerable_timed_out)) {
                Errors.warn($str_alt17$No_oracularly_answerable_timed_ou);
                return NIL;
            }
            return com.cyc.cycjava.cycl.plot_generation.kbq_generate_answerable_vs_unanswerable_comparison_int(answerable_timed_out, unanswerable_timed_out, property, plot_properties, sort_pred);
        }
    }

    /**
     * Takes the subset of QUERY-SET-RUN which timed out or outlier-timed out,
     * and graphs the values of PROPERTY for that subset, split between which ones
     * would have yielded an answer if they ran longer, and which wouldn't have.
     *
     * @param ORACLE-QUERY-SET-RUN
     * 		is only used to predict which queries in QUERY-SET-RUN would have answered if given more time.
     */
    @LispMethod(comment = "Takes the subset of QUERY-SET-RUN which timed out or outlier-timed out,\r\nand graphs the values of PROPERTY for that subset, split between which ones\r\nwould have yielded an answer if they ran longer, and which wouldn\'t have.\r\n\r\n@param ORACLE-QUERY-SET-RUN\r\n\t\tis only used to predict which queries in QUERY-SET-RUN would have answered if given more time.\nTakes the subset of QUERY-SET-RUN which timed out or outlier-timed out,\nand graphs the values of PROPERTY for that subset, split between which ones\nwould have yielded an answer if they ran longer, and which wouldn\'t have.")
    public static SubLObject kbq_generate_answerability_prediction_display(final SubLObject query_set_run, final SubLObject oracle_query_set_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_pred) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        if (sort_pred == UNPROVIDED) {
            sort_pred = symbol_function($sym12$SAFE__);
        }
        final SubLObject oracle_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(oracle_query_set_run));
        final SubLObject unanswerable = kbq_query_run.kbq_unanswerable_query_set_run(query_set_run);
        final SubLObject timed_out = kbq_query_run.kbq_filter_query_set_run_by_test(unanswerable, $$$timed_out, $sym17$KBQ_QUERY_RUN_TIMED_OUT_, UNPROVIDED);
        final SubLObject answerable_timed_out = kbq_query_run.kbq_filter_query_set_run_to_queries(timed_out, oracle_queries, NIL);
        final SubLObject unanswerable_timed_out = kbq_query_run.kbq_filter_query_set_run_to_queries(timed_out, oracle_queries, T);
        if (NIL == kbq_query_run.kbq_query_set_run_query_runs(answerable_timed_out)) {
            Errors.warn($str18$No_oracularly_answerable_timed_ou);
            return NIL;
        }
        return kbq_generate_answerable_vs_unanswerable_comparison_int(answerable_timed_out, unanswerable_timed_out, property, plot_properties, sort_pred);
    }

    /**
     * Generate an image file of the inference answer timeline for INFERENCE.
     * The X-axis is answer creation time in seconds, and
     * the Y-axis is answer number.
     * OUTFILE is the filename to write the image to, without an extension.
     *
     * @return stringp; the full resulting filename of the image (with extension).
     */
    @LispMethod(comment = "Generate an image file of the inference answer timeline for INFERENCE.\r\nThe X-axis is answer creation time in seconds, and\r\nthe Y-axis is answer number.\r\nOUTFILE is the filename to write the image to, without an extension.\r\n\r\n@return stringp; the full resulting filename of the image (with extension).\nGenerate an image file of the inference answer timeline for INFERENCE.\nThe X-axis is answer creation time in seconds, and\nthe Y-axis is answer number.\nOUTFILE is the filename to write the image to, without an extension.")
    public static final SubLObject generate_inference_answer_image_alt(SubLObject inference, SubLObject outfile, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        {
            SubLObject data_filename = $str_alt18$_tmp_inference_answer_timeline_da;
            SubLObject plot_filename = $str_alt19$_tmp_inference_answer_timeline_pl;
            com.cyc.cycjava.cycl.plot_generation.inference_save_answer_timeline_datafile(inference, data_filename);
            com.cyc.cycjava.cycl.plot_generation.save_inference_answer_plot_file(plot_filename, data_filename, plot_properties, outfile, inference);
            return com.cyc.cycjava.cycl.plot_generation.save_plot_as_image(plot_filename, outfile);
        }
    }

    /**
     * Generate an image file of the inference answer timeline for INFERENCE.
     * The X-axis is answer creation time in seconds, and
     * the Y-axis is answer number.
     * OUTFILE is the filename to write the image to, without an extension.
     *
     * @return stringp; the full resulting filename of the image (with extension).
     */
    @LispMethod(comment = "Generate an image file of the inference answer timeline for INFERENCE.\r\nThe X-axis is answer creation time in seconds, and\r\nthe Y-axis is answer number.\r\nOUTFILE is the filename to write the image to, without an extension.\r\n\r\n@return stringp; the full resulting filename of the image (with extension).\nGenerate an image file of the inference answer timeline for INFERENCE.\nThe X-axis is answer creation time in seconds, and\nthe Y-axis is answer number.\nOUTFILE is the filename to write the image to, without an extension.")
    public static SubLObject generate_inference_answer_image(final SubLObject inference, final SubLObject outfile, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        final SubLObject data_filename = $str19$_tmp_inference_answer_timeline_da;
        final SubLObject plot_filename = $str20$_tmp_inference_answer_timeline_pl;
        inference_save_answer_timeline_datafile(inference, data_filename);
        save_inference_answer_plot_file(plot_filename, data_filename, plot_properties, outfile, inference);
        return save_plot_as_image(plot_filename, outfile);
    }

    public static final SubLObject kbq_save_property_comparison_datafile_alt(SubLObject baseline_run, SubLObject experiment_run, SubLObject property, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        {
            SubLObject tuples = com.cyc.cycjava.cycl.plot_generation.kbq_generate_tuples_for_property_comparison(baseline_run, experiment_run, property);
            SubLObject comments = com.cyc.cycjava.cycl.plot_generation.comments_for_property_comparison_datafile(plot_properties, property);
            return com.cyc.cycjava.cycl.plot_generation.save_property_comparison_datafile(tuples, plot_properties, comments);
        }
    }

    public static SubLObject kbq_save_property_comparison_datafile(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        final SubLObject tuples = kbq_generate_tuples_for_property_comparison(baseline_run, experiment_run, property);
        final SubLObject comments = comments_for_property_comparison_datafile(plot_properties, property);
        return save_property_comparison_datafile(tuples, plot_properties, comments);
    }

    public static final SubLObject save_property_comparison_datafile_alt(SubLObject tuples, SubLObject plot_properties, SubLObject comments) {
        {
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.plot_data_full_filename_from_properties(plot_properties);
            SubLObject ranked_tuples = list_utilities.rank_tuples(tuples);
            return com.cyc.cycjava.cycl.plot_generation.save_plot_datafile(data_filename, ranked_tuples, comments);
        }
    }

    public static SubLObject save_property_comparison_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments) {
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        final SubLObject ranked_tuples = list_utilities.rank_tuples(tuples);
        return save_plot_datafile(data_filename, ranked_tuples, comments);
    }

    /**
     *
     *
     * @return listp; a list of tuples, each of the form
    (BASELINE-VALUE EXPERIMENT-VALUE)
    where each value is the respective query-run's value for PROPERTY.
     */
    @LispMethod(comment = "@return listp; a list of tuples, each of the form\r\n(BASELINE-VALUE EXPERIMENT-VALUE)\r\nwhere each value is the respective query-run\'s value for PROPERTY.")
    public static final SubLObject kbq_generate_tuples_for_property_comparison_alt(SubLObject baseline_run, SubLObject experiment_run, SubLObject property) {
        {
            SubLObject tuples = NIL;
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(baseline_run);
            SubLObject baseline_query_run = NIL;
            for (baseline_query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , baseline_query_run = cdolist_list_var.first()) {
                {
                    SubLObject query = kbq_query_run.kbq_query_run_query(baseline_query_run);
                    SubLObject experiment_query_run = kbq_query_run.kbq_lookup_query_run(experiment_run, query);
                    SubLObject baseline_value = kbq_query_run.kbq_query_run_property_value(baseline_query_run, property, UNPROVIDED);
                    SubLObject experiment_value = kbq_query_run.kbq_query_run_property_value(experiment_query_run, property, UNPROVIDED);
                    if ((NIL != baseline_value) && (NIL != experiment_value)) {
                        tuples = cons(list(baseline_value, experiment_value), tuples);
                    }
                }
            }
            return nreverse(tuples);
        }
    }

    /**
     *
     *
     * @return listp; a list of tuples, each of the form
    (BASELINE-VALUE EXPERIMENT-VALUE)
    where each value is the respective query-run's value for PROPERTY.
     */
    @LispMethod(comment = "@return listp; a list of tuples, each of the form\r\n(BASELINE-VALUE EXPERIMENT-VALUE)\r\nwhere each value is the respective query-run\'s value for PROPERTY.")
    public static SubLObject kbq_generate_tuples_for_property_comparison(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property) {
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(baseline_run);
        SubLObject baseline_query_run = NIL;
        baseline_query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run.kbq_query_run_query(baseline_query_run);
            final SubLObject experiment_query_run = kbq_query_run.kbq_lookup_query_run(experiment_run, query);
            final SubLObject baseline_value = kbq_query_run.kbq_query_run_property_value(baseline_query_run, property, UNPROVIDED);
            final SubLObject experiment_value = kbq_query_run.kbq_query_run_property_value(experiment_query_run, property, UNPROVIDED);
            if ((NIL != baseline_value) && (NIL != experiment_value)) {
                tuples = cons(list(baseline_value, experiment_value), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            baseline_query_run = cdolist_list_var.first();
        } 
        return nreverse(tuples);
    }

    /**
     *
     *
     * @return listp; a list of tuples, of the form
    ((list of run1 values) (list of run2 values))
    where each value is the respective query-run's value for PROPERTY.
     */
    @LispMethod(comment = "@return listp; a list of tuples, of the form\r\n((list of run1 values) (list of run2 values))\r\nwhere each value is the respective query-run\'s value for PROPERTY.")
    public static final SubLObject kbq_generate_tuples_for_property_comparison_for_runs_alt(SubLObject runs, SubLObject property) {
        {
            SubLObject tuples = NIL;
            SubLObject first_run = runs.first();
            SubLObject queries = kbq_query_run.kbq_extract_property_values(first_run, $QUERY, UNPROVIDED);
            SubLObject count = ZERO_INTEGER;
            SubLObject query_run = NIL;
            SubLObject value = NIL;
            SubLObject tuple = NIL;
            {
                SubLObject cdolist_list_var = queries;
                SubLObject query = NIL;
                for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                    query_run = kbq_query_run.kbq_lookup_query_run(first_run, query);
                    value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                    if (NIL != value) {
                        tuple = cons(list(count, value), tuple);
                    }
                    count = add(count, ONE_INTEGER);
                }
            }
            tuples = cons(tuple, tuples);
            {
                SubLObject cdolist_list_var = runs.rest();
                SubLObject run = NIL;
                for (run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , run = cdolist_list_var.first()) {
                    count = ZERO_INTEGER;
                    {
                        SubLObject cdolist_list_var_1 = queries;
                        SubLObject query = NIL;
                        for (query = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , query = cdolist_list_var_1.first()) {
                            query_run = kbq_query_run.kbq_lookup_query_run(run, query);
                            value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                            if (NIL != value) {
                                tuple = cons(list(count, value), tuple);
                            }
                            count = add(count, ONE_INTEGER);
                        }
                    }
                    tuples = cons(tuple, tuples);
                }
            }
            return nreverse(tuples);
        }
    }

    /**
     *
     *
     * @return listp; a list of tuples, of the form
    ((list of run1 values) (list of run2 values))
    where each value is the respective query-run's value for PROPERTY.
     */
    @LispMethod(comment = "@return listp; a list of tuples, of the form\r\n((list of run1 values) (list of run2 values))\r\nwhere each value is the respective query-run\'s value for PROPERTY.")
    public static SubLObject kbq_generate_tuples_for_property_comparison_for_runs(final SubLObject runs, final SubLObject property) {
        SubLObject tuples = NIL;
        final SubLObject first_run = runs.first();
        final SubLObject queries = kbq_query_run.kbq_extract_property_values(first_run, $QUERY, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject query_run = NIL;
        SubLObject value = NIL;
        SubLObject tuple = NIL;
        SubLObject cdolist_list_var = queries;
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_run = kbq_query_run.kbq_lookup_query_run(first_run, query);
            value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
            if (NIL != value) {
                tuple = cons(list(count, value), tuple);
            }
            count = add(count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        tuples = cons(tuple, tuples);
        cdolist_list_var = runs.rest();
        SubLObject run = NIL;
        run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = ZERO_INTEGER;
            SubLObject cdolist_list_var_$3 = queries;
            SubLObject query2 = NIL;
            query2 = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                query_run = kbq_query_run.kbq_lookup_query_run(run, query2);
                value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                if (NIL != value) {
                    tuple = cons(list(count, value), tuple);
                }
                count = add(count, ONE_INTEGER);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                query2 = cdolist_list_var_$3.first();
            } 
            tuples = cons(tuple, tuples);
            cdolist_list_var = cdolist_list_var.rest();
            run = cdolist_list_var.first();
        } 
        return nreverse(tuples);
    }

    /**
     *
     *
     * @return listp; a list of tuples, of the form
    ((list of run1 values) (list of run2 values))
    where each value is the respective query-run's value for PROPERTY.
     */
    @LispMethod(comment = "@return listp; a list of tuples, of the form\r\n((list of run1 values) (list of run2 values))\r\nwhere each value is the respective query-run\'s value for PROPERTY.")
    public static final SubLObject kbq_generate_sorted_tuples_for_property_comparison_for_runs_alt(SubLObject runs, SubLObject property, SubLObject sort_by) {
        {
            SubLObject tuples = NIL;
            SubLObject first_query_runs = NIL;
            SubLObject query_runs = NIL;
            first_query_runs = kbq_query_run.kbq_sort_query_runs(runs.first(), property);
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject value = NIL;
                SubLObject tuple = NIL;
                {
                    SubLObject cdolist_list_var = first_query_runs;
                    SubLObject query_run = NIL;
                    for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                        value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                        if (NIL != value) {
                            tuple = cons(list(count, value), tuple);
                        }
                        count = add(count, ONE_INTEGER);
                    }
                }
                tuples = cons(tuple, tuples);
                {
                    SubLObject cdolist_list_var = runs.rest();
                    SubLObject run = NIL;
                    for (run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , run = cdolist_list_var.first()) {
                        count = ZERO_INTEGER;
                        {
                            SubLObject pcase_var = sort_by;
                            if (pcase_var.eql($ALL)) {
                                query_runs = kbq_query_run.kbq_sort_query_runs(run, property);
                                {
                                    SubLObject cdolist_list_var_2 = query_runs;
                                    SubLObject query_run = NIL;
                                    for (query_run = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , query_run = cdolist_list_var_2.first()) {
                                        value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                                        if (NIL != value) {
                                            tuple = cons(list(count, value), tuple);
                                        }
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($FIRST)) {
                                    {
                                        SubLObject cdolist_list_var_3 = first_query_runs;
                                        SubLObject query_run = NIL;
                                        for (query_run = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , query_run = cdolist_list_var_3.first()) {
                                            {
                                                SubLObject c_query_run = kbq_query_run.kbq_lookup_query_run(run, kbq_query_run.kbq_query_run_property_value(query_run, $QUERY, UNPROVIDED));
                                                value = kbq_query_run.kbq_query_run_property_value(c_query_run, property, UNPROVIDED);
                                                if (NIL != value) {
                                                    tuple = cons(list(count, value), tuple);
                                                }
                                                count = add(count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        tuples = cons(tuple, tuples);
                    }
                }
            }
            return nreverse(tuples);
        }
    }

    /**
     *
     *
     * @return listp; a list of tuples, of the form
    ((list of run1 values) (list of run2 values))
    where each value is the respective query-run's value for PROPERTY.
     */
    @LispMethod(comment = "@return listp; a list of tuples, of the form\r\n((list of run1 values) (list of run2 values))\r\nwhere each value is the respective query-run\'s value for PROPERTY.")
    public static SubLObject kbq_generate_sorted_tuples_for_property_comparison_for_runs(final SubLObject runs, final SubLObject property, final SubLObject sort_by) {
        SubLObject tuples = NIL;
        SubLObject first_query_runs = NIL;
        SubLObject query_runs = NIL;
        first_query_runs = kbq_query_run.kbq_sort_query_runs(runs.first(), property);
        SubLObject count = ZERO_INTEGER;
        SubLObject value = NIL;
        SubLObject tuple = NIL;
        SubLObject cdolist_list_var = first_query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
            if (NIL != value) {
                tuple = cons(list(count, value), tuple);
            }
            count = add(count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        tuples = cons(tuple, tuples);
        cdolist_list_var = runs.rest();
        SubLObject run = NIL;
        run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = ZERO_INTEGER;
            if (sort_by.eql($ALL)) {
                SubLObject cdolist_list_var_$4;
                query_runs = cdolist_list_var_$4 = kbq_query_run.kbq_sort_query_runs(run, property);
                SubLObject query_run2 = NIL;
                query_run2 = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    value = kbq_query_run.kbq_query_run_property_value(query_run2, property, UNPROVIDED);
                    if (NIL != value) {
                        tuple = cons(list(count, value), tuple);
                    }
                    count = add(count, ONE_INTEGER);
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    query_run2 = cdolist_list_var_$4.first();
                } 
            } else
                if (sort_by.eql($FIRST)) {
                    SubLObject cdolist_list_var_$5 = first_query_runs;
                    SubLObject query_run2 = NIL;
                    query_run2 = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        final SubLObject c_query_run = kbq_query_run.kbq_lookup_query_run(run, kbq_query_run.kbq_query_run_property_value(query_run2, $QUERY, UNPROVIDED));
                        value = kbq_query_run.kbq_query_run_property_value(c_query_run, property, UNPROVIDED);
                        if (NIL != value) {
                            tuple = cons(list(count, value), tuple);
                        }
                        count = add(count, ONE_INTEGER);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        query_run2 = cdolist_list_var_$5.first();
                    } 
                }

            tuples = cons(tuple, tuples);
            cdolist_list_var = cdolist_list_var.rest();
            run = cdolist_list_var.first();
        } 
        return nreverse(tuples);
    }

    public static final SubLObject comments_for_property_comparison_datafile_alt(SubLObject plot_properties, SubLObject property) {
        {
            SubLObject datum = plot_properties;
            SubLObject current = datum;
            SubLObject baseline_name_tail = property_list_member($BASELINE_NAME, current);
            SubLObject baseline_name = (NIL != baseline_name_tail) ? ((SubLObject) (cadr(baseline_name_tail))) : $$$baseline;
            SubLObject experiment_name_tail = property_list_member($EXPERIMENT_NAME, current);
            SubLObject experiment_name = (NIL != experiment_name_tail) ? ((SubLObject) (cadr(experiment_name_tail))) : $$$experiment;
            SubLObject comment1 = cconcatenate($str_alt25$baseline_____, format_nil.format_nil_a_no_copy(baseline_name));
            SubLObject comment2 = cconcatenate($str_alt26$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
            SubLObject comment3 = cconcatenate($str_alt27$property_____, format_nil.format_nil_s_no_copy(property));
            SubLObject comments = list(comment1, comment2, comment3);
            return comments;
        }
    }

    public static SubLObject comments_for_property_comparison_datafile(final SubLObject plot_properties, final SubLObject property) {
        final SubLObject baseline_name_tail = property_list_member($BASELINE_NAME, plot_properties);
        final SubLObject baseline_name = (NIL != baseline_name_tail) ? cadr(baseline_name_tail) : $$$baseline;
        final SubLObject experiment_name_tail = property_list_member($EXPERIMENT_NAME, plot_properties);
        final SubLObject experiment_name = (NIL != experiment_name_tail) ? cadr(experiment_name_tail) : $$$experiment;
        final SubLObject comment1 = cconcatenate($str26$baseline_____, format_nil.format_nil_a_no_copy(baseline_name));
        final SubLObject comment2 = cconcatenate($str27$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
        final SubLObject comment3 = cconcatenate($str28$property_____, format_nil.format_nil_s_no_copy(property));
        final SubLObject comments = list(comment1, comment2, comment3);
        return comments;
    }

    public static final SubLObject kbq_save_properties_comparison_datafile_alt(SubLObject query_set_run, SubLObject v_properties, SubLObject plot_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.lengthLE(v_properties, TEN_INTEGER, UNPROVIDED)) {
                    Errors.error($str_alt28$Cannot_handle_more_than_10_proper, v_properties);
                }
            }
            {
                SubLObject tuples = com.cyc.cycjava.cycl.plot_generation.kbq_generate_tuples_for_properties_comparison(query_set_run, v_properties);
                SubLObject comments = com.cyc.cycjava.cycl.plot_generation.comments_for_properties_comparison_datafile(plot_properties, v_properties);
                return com.cyc.cycjava.cycl.plot_generation.save_properties_comparison_datafile(tuples, plot_properties, comments);
            }
        }
    }

    public static SubLObject kbq_save_properties_comparison_datafile(final SubLObject query_set_run, final SubLObject v_properties, final SubLObject plot_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthLE(v_properties, TEN_INTEGER, UNPROVIDED))) {
            Errors.error($str29$Cannot_handle_more_than_10_proper, v_properties);
        }
        final SubLObject tuples = kbq_generate_tuples_for_properties_comparison(query_set_run, v_properties);
        final SubLObject comments = comments_for_properties_comparison_datafile(plot_properties, v_properties);
        return save_properties_comparison_datafile(tuples, plot_properties, comments);
    }

    public static final SubLObject save_properties_comparison_datafile_alt(SubLObject tuples, SubLObject plot_properties, SubLObject comments) {
        {
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.plot_data_full_filename_from_properties(plot_properties);
            SubLObject ranked_tuples = list_utilities.rank_tuples(tuples);
            return com.cyc.cycjava.cycl.plot_generation.save_plot_datafile(data_filename, ranked_tuples, comments);
        }
    }

    public static SubLObject save_properties_comparison_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments) {
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        final SubLObject ranked_tuples = list_utilities.rank_tuples(tuples);
        return save_plot_datafile(data_filename, ranked_tuples, comments);
    }

    /**
     *
     *
     * @return listp; a list of tuples, each of the form
    (PROPERTY-VALUE-1 PROPERTY-VALUE-2 ...)
    where value n is the value of the nth property in PROPERTIES.
     */
    @LispMethod(comment = "@return listp; a list of tuples, each of the form\r\n(PROPERTY-VALUE-1 PROPERTY-VALUE-2 ...)\r\nwhere value n is the value of the nth property in PROPERTIES.")
    public static final SubLObject kbq_generate_tuples_for_properties_comparison_alt(SubLObject query_set_run, SubLObject v_properties) {
        {
            SubLObject tuples = NIL;
            SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject cdolist_list_var = query_runs;
            SubLObject query_run = NIL;
            for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                {
                    SubLObject tuple = NIL;
                    SubLObject cdolist_list_var_4 = v_properties;
                    SubLObject property = NIL;
                    for (property = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , property = cdolist_list_var_4.first()) {
                        {
                            SubLObject property_value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                            tuple = cons(property_value, tuple);
                        }
                    }
                    if (NIL == list_utilities.member_if_not(symbol_function(NUMBERP), tuple, UNPROVIDED)) {
                        tuples = cons(nreverse(tuple), tuples);
                    }
                }
            }
            return nreverse(tuples);
        }
    }

    /**
     *
     *
     * @return listp; a list of tuples, each of the form
    (PROPERTY-VALUE-1 PROPERTY-VALUE-2 ...)
    where value n is the value of the nth property in PROPERTIES.
     */
    @LispMethod(comment = "@return listp; a list of tuples, each of the form\r\n(PROPERTY-VALUE-1 PROPERTY-VALUE-2 ...)\r\nwhere value n is the value of the nth property in PROPERTIES.")
    public static SubLObject kbq_generate_tuples_for_properties_comparison(final SubLObject query_set_run, final SubLObject v_properties) {
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var;
        final SubLObject query_runs = cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject tuple = NIL;
            SubLObject cdolist_list_var_$6 = v_properties;
            SubLObject property = NIL;
            property = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                final SubLObject property_value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                tuple = cons(property_value, tuple);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                property = cdolist_list_var_$6.first();
            } 
            if (NIL == list_utilities.member_if_not(symbol_function(NUMBERP), tuple, UNPROVIDED)) {
                tuples = cons(nreverse(tuple), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        return nreverse(tuples);
    }

    public static final SubLObject comments_for_properties_comparison_datafile_alt(SubLObject plot_properties, SubLObject v_properties) {
        {
            SubLObject datum = plot_properties;
            SubLObject current = datum;
            SubLObject experiment_name_tail = property_list_member($EXPERIMENT_NAME, current);
            SubLObject experiment_name = (NIL != experiment_name_tail) ? ((SubLObject) (cadr(experiment_name_tail))) : $$$experiment;
            SubLObject comment1 = cconcatenate($str_alt26$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
            SubLObject comment2 = cconcatenate($str_alt30$properties___, format_nil.format_nil_s_no_copy(v_properties));
            SubLObject comments = list(comment1, comment2);
            return comments;
        }
    }

    public static SubLObject comments_for_properties_comparison_datafile(final SubLObject plot_properties, final SubLObject v_properties) {
        final SubLObject experiment_name_tail = property_list_member($EXPERIMENT_NAME, plot_properties);
        final SubLObject experiment_name = (NIL != experiment_name_tail) ? cadr(experiment_name_tail) : $$$experiment;
        final SubLObject comment1 = cconcatenate($str27$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
        final SubLObject comment2 = cconcatenate($str31$properties___, format_nil.format_nil_s_no_copy(v_properties));
        final SubLObject comments = list(comment1, comment2);
        return comments;
    }

    public static final SubLObject kbq_save_property_classification_datafile_alt(SubLObject query_set_run, SubLObject property, SubLObject classifications, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        {
            SubLObject tuples = com.cyc.cycjava.cycl.plot_generation.kbq_generate_tuples_for_property_classification(query_set_run, property);
            SubLObject comments = com.cyc.cycjava.cycl.plot_generation.comments_for_property_classification_datafile(plot_properties, property);
            return com.cyc.cycjava.cycl.plot_generation.save_property_classification_datafile(tuples, plot_properties, comments, classifications);
        }
    }

    public static SubLObject kbq_save_property_classification_datafile(final SubLObject query_set_run, final SubLObject property, final SubLObject classifications, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        final SubLObject tuples = kbq_generate_tuples_for_property_classification(query_set_run, property);
        final SubLObject comments = comments_for_property_classification_datafile(plot_properties, property);
        return save_property_classification_datafile(tuples, plot_properties, comments, classifications);
    }

    public static final SubLObject save_property_classification_datafile_alt(SubLObject tuples, SubLObject plot_properties, SubLObject comments, SubLObject classifications) {
        {
            SubLObject data_filename = com.cyc.cycjava.cycl.plot_generation.plot_data_full_filename_from_properties(plot_properties);
            SubLObject ranked_and_classified_tuples = com.cyc.cycjava.cycl.plot_generation.rank_and_classify_property_classification_tuples(tuples, classifications);
            return com.cyc.cycjava.cycl.plot_generation.save_plot_datafile(data_filename, ranked_and_classified_tuples, comments);
        }
    }

    public static SubLObject save_property_classification_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments, final SubLObject classifications) {
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        final SubLObject ranked_and_classified_tuples = rank_and_classify_property_classification_tuples(tuples, classifications);
        return save_plot_datafile(data_filename, ranked_and_classified_tuples, comments);
    }

    public static final SubLObject comments_for_property_classification_datafile_alt(SubLObject plot_properties, SubLObject property) {
        {
            SubLObject datum = plot_properties;
            SubLObject current = datum;
            SubLObject experiment_name_tail = property_list_member($EXPERIMENT_NAME, current);
            SubLObject experiment_name = (NIL != experiment_name_tail) ? ((SubLObject) (cadr(experiment_name_tail))) : $$$experiment;
            SubLObject comment1 = cconcatenate($str_alt26$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
            SubLObject comment2 = cconcatenate($str_alt27$property_____, format_nil.format_nil_s_no_copy(property));
            SubLObject comment3 = copy_seq($$$classification_0);
            SubLObject comments = list(comment1, comment2, comment3);
            return comments;
        }
    }

    public static SubLObject comments_for_property_classification_datafile(final SubLObject plot_properties, final SubLObject property) {
        final SubLObject experiment_name_tail = property_list_member($EXPERIMENT_NAME, plot_properties);
        final SubLObject experiment_name = (NIL != experiment_name_tail) ? cadr(experiment_name_tail) : $$$experiment;
        final SubLObject comment1 = cconcatenate($str27$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
        final SubLObject comment2 = cconcatenate($str28$property_____, format_nil.format_nil_s_no_copy(property));
        final SubLObject comment3 = copy_seq($$$classification_0);
        final SubLObject comments = list(comment1, comment2, comment3);
        return comments;
    }

    /**
     *
     *
     * @return listp; a list of tuples, each of the form
    (QUERY PROPERTY-VALUE)
     */
    @LispMethod(comment = "@return listp; a list of tuples, each of the form\r\n(QUERY PROPERTY-VALUE)")
    public static final SubLObject kbq_generate_tuples_for_property_classification_alt(SubLObject query_set_run, SubLObject property) {
        {
            SubLObject tuples = NIL;
            SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject cdolist_list_var = query_runs;
            SubLObject query_run = NIL;
            for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                {
                    SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                    SubLObject property_value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                    if (property_value.isNumber()) {
                        tuples = cons(list(query, property_value), tuples);
                    }
                }
            }
            return nreverse(tuples);
        }
    }

    /**
     *
     *
     * @return listp; a list of tuples, each of the form
    (QUERY PROPERTY-VALUE)
     */
    @LispMethod(comment = "@return listp; a list of tuples, each of the form\r\n(QUERY PROPERTY-VALUE)")
    public static SubLObject kbq_generate_tuples_for_property_classification(final SubLObject query_set_run, final SubLObject property) {
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var;
        final SubLObject query_runs = cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
            final SubLObject property_value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
            if (property_value.isNumber()) {
                tuples = cons(list(query, property_value), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        return nreverse(tuples);
    }

    /**
     *
     *
     * @param TUPLES;
     * 		a list of tuples, each of the form
     * 		(ELEMENT VALUE)
     * @return listp; a list of tuples, most of the form
    (RANK VALUE)
    but a few of the form
    STRING
    which indicates a classification break.  All the tuples before the first string
    are in classification 0, all the tuples between the first and second strings
    are in classification 1, etc.  Classifications are determined by applying
    the functions in CLASSIFICATIONS to the ELEMENT elements.
     */
    @LispMethod(comment = "@param TUPLES;\r\n\t\ta list of tuples, each of the form\r\n\t\t(ELEMENT VALUE)\r\n@return listp; a list of tuples, most of the form\r\n(RANK VALUE)\r\nbut a few of the form\r\nSTRING\r\nwhich indicates a classification break.  All the tuples before the first string\r\nare in classification 0, all the tuples between the first and second strings\r\nare in classification 1, etc.  Classifications are determined by applying\r\nthe functions in CLASSIFICATIONS to the ELEMENT elements.")
    public static final SubLObject rank_and_classify_property_classification_tuples_alt(SubLObject tuples, SubLObject classifications) {
        {
            SubLObject classified_tuples = NIL;
            SubLObject sorted_tuples = Sort.stable_sort(copy_list(tuples), symbol_function($sym32$_), symbol_function(SECOND));
            SubLObject rank_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            {
                SubLObject list_var = NIL;
                SubLObject tuple = NIL;
                SubLObject rank = NIL;
                for (list_var = sorted_tuples, tuple = list_var.first(), rank = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple = list_var.first() , rank = add(ONE_INTEGER, rank)) {
                    dictionary.dictionary_enter(rank_dictionary, tuple, rank);
                }
            }
            {
                SubLObject tuple_classes = list_utilities.categorize_list_elements(sorted_tuples, classifications, symbol_function(FIRST));
                SubLObject list_var = NIL;
                SubLObject tuple_class = NIL;
                SubLObject index = NIL;
                for (list_var = tuple_classes, tuple_class = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple_class = list_var.first() , index = add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        {
                            SubLObject classification_break = cconcatenate($str_alt35$classification_, format_nil.format_nil_a_no_copy(index));
                            classified_tuples = cons(classification_break, classified_tuples);
                        }
                    }
                    if (NIL == tuple_class) {
                        Errors.warn($str_alt36$Classification__S_was_empty, index);
                    }
                    {
                        SubLObject cdolist_list_var = tuple_class;
                        SubLObject tuple = NIL;
                        for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                            {
                                SubLObject rank = dictionary.dictionary_lookup(rank_dictionary, tuple, UNPROVIDED);
                                SubLObject datum = tuple;
                                SubLObject current = datum;
                                SubLObject element = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt37);
                                element = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt37);
                                value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    classified_tuples = cons(list(rank, value), classified_tuples);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt37);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(classified_tuples);
        }
    }

    /**
     *
     *
     * @param TUPLES;
     * 		a list of tuples, each of the form
     * 		(ELEMENT VALUE)
     * @return listp; a list of tuples, most of the form
    (RANK VALUE)
    but a few of the form
    STRING
    which indicates a classification break.  All the tuples before the first string
    are in classification 0, all the tuples between the first and second strings
    are in classification 1, etc.  Classifications are determined by applying
    the functions in CLASSIFICATIONS to the ELEMENT elements.
     */
    @LispMethod(comment = "@param TUPLES;\r\n\t\ta list of tuples, each of the form\r\n\t\t(ELEMENT VALUE)\r\n@return listp; a list of tuples, most of the form\r\n(RANK VALUE)\r\nbut a few of the form\r\nSTRING\r\nwhich indicates a classification break.  All the tuples before the first string\r\nare in classification 0, all the tuples between the first and second strings\r\nare in classification 1, etc.  Classifications are determined by applying\r\nthe functions in CLASSIFICATIONS to the ELEMENT elements.")
    public static SubLObject rank_and_classify_property_classification_tuples(final SubLObject tuples, final SubLObject classifications) {
        SubLObject classified_tuples = NIL;
        final SubLObject sorted_tuples = Sort.stable_sort(copy_list(tuples), symbol_function($sym33$_), symbol_function(SECOND));
        final SubLObject rank_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject tuple = NIL;
        SubLObject rank = NIL;
        list_var = sorted_tuples;
        tuple = list_var.first();
        for (rank = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple = list_var.first() , rank = add(ONE_INTEGER, rank)) {
            dictionary.dictionary_enter(rank_dictionary, tuple, rank);
        }
        final SubLObject tuple_classes = list_utilities.categorize_list_elements(sorted_tuples, classifications, symbol_function(FIRST));
        SubLObject list_var2 = NIL;
        SubLObject tuple_class = NIL;
        SubLObject index = NIL;
        list_var2 = tuple_classes;
        tuple_class = list_var2.first();
        for (index = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , tuple_class = list_var2.first() , index = add(ONE_INTEGER, index)) {
            if (!index.isZero()) {
                final SubLObject classification_break = cconcatenate($$$classification_, format_nil.format_nil_a_no_copy(index));
                classified_tuples = cons(classification_break, classified_tuples);
            }
            if (NIL == tuple_class) {
                Errors.warn($str37$Classification__S_was_empty, index);
            }
            SubLObject cdolist_list_var = tuple_class;
            SubLObject tuple2 = NIL;
            tuple2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject rank2 = dictionary.dictionary_lookup(rank_dictionary, tuple2, UNPROVIDED);
                SubLObject current;
                final SubLObject datum = current = tuple2;
                SubLObject element = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list38);
                element = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list38);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    classified_tuples = cons(list(rank2, value), classified_tuples);
                } else {
                    cdestructuring_bind_error(datum, $list38);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tuple2 = cdolist_list_var.first();
            } 
        }
        return nreverse(classified_tuples);
    }

    public static final SubLObject inference_save_answer_timeline_datafile_alt(SubLObject inference, SubLObject data_filename) {
        {
            SubLObject tuples = com.cyc.cycjava.cycl.plot_generation.inference_answer_elapsed_time_tuples(inference);
            return com.cyc.cycjava.cycl.plot_generation.save_plot_datafile(data_filename, tuples, UNPROVIDED);
        }
    }

    public static SubLObject inference_save_answer_timeline_datafile(final SubLObject inference, final SubLObject data_filename) {
        final SubLObject tuples = inference_answer_elapsed_time_tuples(inference);
        return save_plot_datafile(data_filename, tuples, UNPROVIDED);
    }

    public static final SubLObject inference_answer_elapsed_time_tuples_alt(SubLObject inference) {
        {
            SubLObject tuples = NIL;
            SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                    SubLObject v_answer = NIL;
                    while (NIL != id) {
                        v_answer = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, v_answer, $SKIP)) {
                            {
                                SubLObject id_5 = inference_datastructures_inference.inference_answer_suid(v_answer);
                                SubLObject time = inference_datastructures_inference.inference_answer_elapsed_time(v_answer, NIL);
                                tuples = cons(list(time, id_5), tuples);
                            }
                        }
                        id = do_id_index_next_id(idx, T, id, state_var);
                        state_var = do_id_index_next_state(idx, T, id, state_var);
                    } 
                }
            }
            return nreverse(tuples);
        }
    }

    public static SubLObject inference_answer_elapsed_time_tuples(final SubLObject inference) {
        SubLObject tuples = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$7 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$7, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$7);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject id_$8;
                SubLObject time;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        id_$8 = inference_datastructures_inference.inference_answer_suid(v_answer);
                        time = inference_datastructures_inference.inference_answer_elapsed_time(v_answer, NIL);
                        tuples = cons(list(time, id_$8), tuples);
                    }
                }
            }
            final SubLObject idx_$8 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$8)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$8);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$8);
                final SubLObject end_id = id_index_next_id(idx_$8);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject v_answer2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_answer2))) {
                        final SubLObject id_$9 = inference_datastructures_inference.inference_answer_suid(v_answer2);
                        final SubLObject time2 = inference_datastructures_inference.inference_answer_elapsed_time(v_answer2, NIL);
                        tuples = cons(list(time2, id_$9), tuples);
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return nreverse(tuples);
    }

    public static final SubLObject save_plot_datafile_alt(SubLObject data_filename, SubLObject tuples, SubLObject comments) {
        if (comments == UNPROVIDED) {
            comments = NIL;
        }
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_plot_datafile(final SubLObject data_filename, final SubLObject tuples, SubLObject comments) {
        if (comments == UNPROVIDED) {
            comments = NIL;
        }
        return plot_unavailable_warning();
    }

    public static final SubLObject kbq_property_coordinates_alt(SubLObject query_set_run, SubLObject property) {
        {
            SubLObject coords = NIL;
            SubLObject list_var = NIL;
            SubLObject query_run = NIL;
            SubLObject i = NIL;
            for (list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run), query_run = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , query_run = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
                    SubLObject coord = list(i, value);
                    coords = cons(coord, coords);
                }
            }
            return nreverse(coords);
        }
    }

    public static SubLObject kbq_property_coordinates(final SubLObject query_set_run, final SubLObject property) {
        SubLObject coords = NIL;
        SubLObject list_var = NIL;
        SubLObject query_run = NIL;
        SubLObject i = NIL;
        list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        query_run = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , query_run = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject value = kbq_query_run.kbq_query_run_property_value(query_run, property, UNPROVIDED);
            final SubLObject coord = list(i, value);
            coords = cons(coord, coords);
        }
        return nreverse(coords);
    }

    public static final SubLObject coordinatify_alt(SubLObject values) {
        {
            SubLObject coords = NIL;
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject i = NIL;
            for (list_var = values, value = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , i = add(ONE_INTEGER, i)) {
                coords = cons(list(i, value), coords);
            }
            return nreverse(coords);
        }
    }

    public static SubLObject coordinatify(final SubLObject values) {
        SubLObject coords = NIL;
        SubLObject list_var = NIL;
        SubLObject value = NIL;
        SubLObject i = NIL;
        list_var = values;
        value = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , i = add(ONE_INTEGER, i)) {
            coords = cons(list(i, value), coords);
        }
        return nreverse(coords);
    }

    public static final SubLObject equalize_lengths_alt(SubLObject coordinates_list) {
        {
            SubLObject new_coordinates_list = NIL;
            SubLObject max_length = number_utilities.maximum(Mapping.mapcar(symbol_function(LENGTH), coordinates_list), UNPROVIDED);
            SubLObject cdolist_list_var = coordinates_list;
            SubLObject coordinates = NIL;
            for (coordinates = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coordinates = cdolist_list_var.first()) {
                {
                    SubLObject coordinates_vector = list_utilities.list2vector(coordinates);
                    SubLObject length = length(coordinates_vector);
                    SubLObject last_coord = NIL;
                    SubLObject new_coordinates = NIL;
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(max_length); i = add(i, ONE_INTEGER)) {
                        if (i.numL(length)) {
                            {
                                SubLObject coord = aref(coordinates_vector, i);
                                new_coordinates = cons(coord, new_coordinates);
                                last_coord = coord;
                            }
                        } else {
                            new_coordinates = cons(last_coord, new_coordinates);
                        }
                    }
                    new_coordinates_list = cons(nreverse(new_coordinates), new_coordinates_list);
                }
            }
            return nreverse(new_coordinates_list);
        }
    }

    public static SubLObject equalize_lengths(final SubLObject coordinates_list) {
        SubLObject new_coordinates_list = NIL;
        final SubLObject max_length = number_utilities.maximum(Mapping.mapcar(symbol_function(LENGTH), coordinates_list), UNPROVIDED);
        SubLObject cdolist_list_var = coordinates_list;
        SubLObject coordinates = NIL;
        coordinates = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject coordinates_vector = list_utilities.list2vector(coordinates);
            final SubLObject length = length(coordinates_vector);
            SubLObject last_coord = NIL;
            SubLObject new_coordinates = NIL;
            SubLObject i;
            SubLObject coord;
            for (i = NIL, i = ZERO_INTEGER; i.numL(max_length); i = add(i, ONE_INTEGER)) {
                if (i.numL(length)) {
                    coord = aref(coordinates_vector, i);
                    new_coordinates = cons(coord, new_coordinates);
                    last_coord = coord;
                } else {
                    new_coordinates = cons(last_coord, new_coordinates);
                }
            }
            new_coordinates_list = cons(nreverse(new_coordinates), new_coordinates_list);
            cdolist_list_var = cdolist_list_var.rest();
            coordinates = cdolist_list_var.first();
        } 
        return nreverse(new_coordinates_list);
    }

    public static final SubLObject scale_lengths_alt(SubLObject lists) {
        {
            SubLObject new_lists = NIL;
            SubLObject max_length = number_utilities.maximum(Mapping.mapcar(symbol_function(LENGTH), lists), UNPROVIDED);
            SubLObject cdolist_list_var = lists;
            SubLObject list = NIL;
            for (list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , list = cdolist_list_var.first()) {
                {
                    SubLObject scaling_factor = round(divide(max_length, length(list)), UNPROVIDED);
                    if (scaling_factor.numG(ONE_INTEGER)) {
                        {
                            SubLObject new_list = NIL;
                            SubLObject cdolist_list_var_6 = list;
                            SubLObject elem = NIL;
                            for (elem = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , elem = cdolist_list_var_6.first()) {
                                {
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(scaling_factor); i = add(i, ONE_INTEGER)) {
                                        new_list = cons(elem, new_list);
                                    }
                                }
                            }
                            new_lists = cons(nreverse(new_list), new_lists);
                        }
                    } else {
                        new_lists = cons(list, new_lists);
                    }
                }
            }
            return nreverse(new_lists);
        }
    }

    public static SubLObject scale_lengths(final SubLObject lists) {
        SubLObject new_lists = NIL;
        final SubLObject max_length = number_utilities.maximum(Mapping.mapcar(symbol_function(LENGTH), lists), UNPROVIDED);
        SubLObject cdolist_list_var = lists;
        SubLObject list = NIL;
        list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject scaling_factor = round(divide(max_length, length(list)), UNPROVIDED);
            if (scaling_factor.numG(ONE_INTEGER)) {
                SubLObject new_list = NIL;
                SubLObject cdolist_list_var_$11 = list;
                SubLObject elem = NIL;
                elem = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    SubLObject i;
                    for (i = NIL, i = ZERO_INTEGER; i.numL(scaling_factor); i = add(i, ONE_INTEGER)) {
                        new_list = cons(elem, new_list);
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    elem = cdolist_list_var_$11.first();
                } 
                new_lists = cons(nreverse(new_list), new_lists);
            } else {
                new_lists = cons(list, new_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            list = cdolist_list_var.first();
        } 
        return nreverse(new_lists);
    }

    public static final SubLObject save_lines_graph_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties, SubLObject line_count) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_lines_graph_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count) {
        return plot_unavailable_warning();
    }

    public static final SubLObject save_points_graph_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties, SubLObject line_count) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_points_graph_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count) {
        return plot_unavailable_warning();
    }

    public static final SubLObject save_correlation_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_correlation_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties) {
        return plot_unavailable_warning();
    }

    public static final SubLObject save_property_correlation_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_property_correlation_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties) {
        return plot_unavailable_warning();
    }

    public static final SubLObject save_property_comparison_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties, SubLObject line_count) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_property_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count) {
        return plot_unavailable_warning();
    }

    public static final SubLObject save_sorted_property_comparison_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties, SubLObject sort_by) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_sorted_property_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject sort_by) {
        return plot_unavailable_warning();
    }

    public static final SubLObject save_sorted_properties_comparison_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties, SubLObject sort_by, SubLObject v_properties) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_sorted_properties_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject sort_by, final SubLObject v_properties) {
        return plot_unavailable_warning();
    }

    public static final SubLObject save_sorted_property_display_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties, SubLObject classifications) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_sorted_property_display_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject classifications) {
        return plot_unavailable_warning();
    }

    public static final SubLObject save_inference_answer_plot_file_alt(SubLObject plot_filename, SubLObject data_filename, SubLObject plot_properties, SubLObject outfile, SubLObject inference) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_inference_answer_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject outfile, final SubLObject inference) {
        return plot_unavailable_warning();
    }

    public static final SubLObject compute_key_location_alt(SubLObject coordinates) {
        {
            SubLObject min_x = $most_positive_fixnum$.getGlobalValue();
            SubLObject max_x = $most_negative_fixnum$.getGlobalValue();
            SubLObject min_y = $most_positive_fixnum$.getGlobalValue();
            SubLObject max_y = $most_negative_fixnum$.getGlobalValue();
            SubLObject cdolist_list_var = coordinates;
            SubLObject coord = NIL;
            for (coord = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coord = cdolist_list_var.first()) {
                {
                    SubLObject datum = coord;
                    SubLObject current = datum;
                    SubLObject x = NIL;
                    SubLObject y = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    x = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    y = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (x.isNumber() && y.isNumber()) {
                            if (x.numG(max_x)) {
                                max_x = x;
                            }
                            if (y.numG(max_y)) {
                                max_y = y;
                            }
                            if (x.numL(min_x)) {
                                min_x = x;
                            }
                            if (y.numL(min_y)) {
                                min_y = y;
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt72);
                    }
                }
            }
            {
                SubLObject total_x = subtract(max_x, min_x);
                SubLObject x_location = add(min_x, multiply($float$0_3, total_x));
                SubLObject total_y = subtract(max_y, min_y);
                SubLObject y_location = add(max_y, multiply($float$0_0, total_y));
                return list(x_location, y_location);
            }
        }
    }

    public static SubLObject compute_key_location(final SubLObject coordinates) {
        SubLObject min_x = $most_positive_fixnum$.getGlobalValue();
        SubLObject max_x = $most_negative_fixnum$.getGlobalValue();
        SubLObject min_y = $most_positive_fixnum$.getGlobalValue();
        SubLObject max_y = $most_negative_fixnum$.getGlobalValue();
        SubLObject cdolist_list_var = coordinates;
        SubLObject coord = NIL;
        coord = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = coord;
            SubLObject x = NIL;
            SubLObject y = NIL;
            destructuring_bind_must_consp(current, datum, $list42);
            x = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list42);
            y = current.first();
            current = current.rest();
            if (NIL == current) {
                if (x.isNumber() && y.isNumber()) {
                    if (x.numG(max_x)) {
                        max_x = x;
                    }
                    if (y.numG(max_y)) {
                        max_y = y;
                    }
                    if (x.numL(min_x)) {
                        min_x = x;
                    }
                    if (y.numL(min_y)) {
                        min_y = y;
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list42);
            }
            cdolist_list_var = cdolist_list_var.rest();
            coord = cdolist_list_var.first();
        } 
        final SubLObject total_x = subtract(max_x, min_x);
        final SubLObject x_location = add(min_x, multiply($float$0_3, total_x));
        final SubLObject total_y = subtract(max_y, min_y);
        final SubLObject y_location = add(max_y, multiply($float$0_0, total_y));
        return list(x_location, y_location);
    }

    public static final SubLObject compute_key_location_from_tuples_alt(SubLObject tuples) {
        {
            SubLObject coordinates = NIL;
            SubLObject list_var = NIL;
            SubLObject tuple = NIL;
            SubLObject i = NIL;
            for (list_var = tuples, tuple = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject who_cares = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt75);
                    who_cares = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt75);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        coordinates = cons(list(i, value), coordinates);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt75);
                    }
                }
            }
            return com.cyc.cycjava.cycl.plot_generation.compute_key_location(nreverse(coordinates));
        }
    }

    public static SubLObject compute_key_location_from_tuples(final SubLObject tuples) {
        SubLObject coordinates = NIL;
        SubLObject list_var = NIL;
        SubLObject tuple = NIL;
        SubLObject i = NIL;
        list_var = tuples;
        tuple = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple = list_var.first() , i = add(ONE_INTEGER, i)) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject who_cares = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list45);
            who_cares = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list45);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                coordinates = cons(list(i, value), coordinates);
            } else {
                cdestructuring_bind_error(datum, $list45);
            }
        }
        return compute_key_location(nreverse(coordinates));
    }

    public static final SubLObject plot_properties_name_alt(SubLObject plot_properties) {
        return getf(plot_properties, $PLOT_NAME, $default_plot_name$.getGlobalValue());
    }

    public static SubLObject plot_properties_name(final SubLObject plot_properties) {
        return getf(plot_properties, $PLOT_NAME, $default_plot_name$.getGlobalValue());
    }

    public static final SubLObject plot_properties_display_alt(SubLObject plot_properties) {
        return getf(plot_properties, $DISPLAY, NIL);
    }

    public static SubLObject plot_properties_display(final SubLObject plot_properties) {
        return getf(plot_properties, $DISPLAY, NIL);
    }

    public static final SubLObject plot_full_filename_alt(SubLObject filename, SubLObject extension, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $plot_directory$.getGlobalValue();
        }
        return cconcatenate(directory, new SubLObject[]{ filename, $str_alt80$_, extension });
    }

    public static SubLObject plot_full_filename(final SubLObject filename, final SubLObject extension, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $plot_directory$.getGlobalValue();
        }
        return cconcatenate(directory, new SubLObject[]{ filename, $str50$_, extension });
    }

    public static final SubLObject plot_data_full_filename_alt(SubLObject filename) {
        return com.cyc.cycjava.cycl.plot_generation.plot_full_filename(filename, $$$dat, UNPROVIDED);
    }

    public static SubLObject plot_data_full_filename(final SubLObject filename) {
        return plot_full_filename(filename, $$$dat, UNPROVIDED);
    }

    public static final SubLObject plot_data_full_filename_from_properties_alt(SubLObject plot_properties) {
        {
            SubLObject plot_name = com.cyc.cycjava.cycl.plot_generation.plot_properties_name(plot_properties);
            return com.cyc.cycjava.cycl.plot_generation.plot_data_full_filename(plot_name);
        }
    }

    public static SubLObject plot_data_full_filename_from_properties(final SubLObject plot_properties) {
        final SubLObject plot_name = plot_properties_name(plot_properties);
        return plot_data_full_filename(plot_name);
    }

    public static final SubLObject plot_program_full_filename_alt(SubLObject filename) {
        return com.cyc.cycjava.cycl.plot_generation.plot_full_filename(filename, $$$plot, UNPROVIDED);
    }

    public static SubLObject plot_program_full_filename(final SubLObject filename) {
        return plot_full_filename(filename, $$$plot, UNPROVIDED);
    }

    public static final SubLObject plot_program_full_filename_from_properties_alt(SubLObject plot_properties) {
        {
            SubLObject plot_name = com.cyc.cycjava.cycl.plot_generation.plot_properties_name(plot_properties);
            return com.cyc.cycjava.cycl.plot_generation.plot_program_full_filename(plot_name);
        }
    }

    public static SubLObject plot_program_full_filename_from_properties(final SubLObject plot_properties) {
        final SubLObject plot_name = plot_properties_name(plot_properties);
        return plot_program_full_filename(plot_name);
    }

    public static final SubLObject possibly_display_saved_plot_alt(SubLObject plot_filename, SubLObject display) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject possibly_display_saved_plot(final SubLObject plot_filename, final SubLObject display) {
        return plot_unavailable_warning();
    }

    /**
     *
     *
     * @param OUTFILE
     * 		is the filename to write the image to, without an extension.
     */
    @LispMethod(comment = "@param OUTFILE\r\n\t\tis the filename to write the image to, without an extension.")
    public static final SubLObject save_plot_as_image_alt(SubLObject plot_filename, SubLObject outfile) {
        {
            SubLObject full_output_filename = com.cyc.cycjava.cycl.plot_generation.append_proper_plot_image_extension(outfile);
            return NIL != com.cyc.cycjava.cycl.plot_generation.save_plot_as_image_successfulP(plot_filename) ? ((SubLObject) (full_output_filename)) : NIL;
        }
    }

    /**
     *
     *
     * @param OUTFILE
     * 		is the filename to write the image to, without an extension.
     */
    @LispMethod(comment = "@param OUTFILE\r\n\t\tis the filename to write the image to, without an extension.")
    public static SubLObject save_plot_as_image(final SubLObject plot_filename, final SubLObject outfile) {
        final SubLObject full_output_filename = append_proper_plot_image_extension(outfile);
        return NIL != save_plot_as_image_successfulP(plot_filename) ? full_output_filename : NIL;
    }

    public static final SubLObject save_plot_as_image_successfulP_alt(SubLObject plot_filename) {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject save_plot_as_image_successfulP(final SubLObject plot_filename) {
        return plot_unavailable_warning();
    }

    public static final SubLObject plot_image_format_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject image_format = com.cyc.cycjava.cycl.plot_generation.plot_image_format_and_extension();
                SubLObject extension = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return image_format;
            }
        }
    }

    public static SubLObject plot_image_format() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject image_format = plot_image_format_and_extension();
        final SubLObject extension = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return image_format;
    }

    public static final SubLObject append_proper_plot_image_extension_alt(SubLObject outfile) {
        {
            SubLObject extension = com.cyc.cycjava.cycl.plot_generation.plot_image_extension();
            return cconcatenate(outfile, extension);
        }
    }

    public static SubLObject append_proper_plot_image_extension(final SubLObject outfile) {
        final SubLObject extension = plot_image_extension();
        return cconcatenate(outfile, extension);
    }

    public static final SubLObject plot_image_extension_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject image_format = com.cyc.cycjava.cycl.plot_generation.plot_image_format_and_extension();
                SubLObject extension = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return extension;
            }
        }
    }

    public static SubLObject plot_image_extension() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject image_format = plot_image_format_and_extension();
        final SubLObject extension = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return extension;
    }

    public static final SubLObject plot_image_format_and_extension_alt() {
        return com.cyc.cycjava.cycl.plot_generation.plot_unavailable_warning();
    }

    public static SubLObject plot_image_format_and_extension() {
        return plot_unavailable_warning();
    }

    public static final SubLObject plotting_availableP_alt() {
        return NIL;
    }

    public static SubLObject plotting_availableP() {
        return makeBoolean((NIL != Processes.external_processes_supportedP()) && (NIL != gnuplot_availableP()));
    }

    public static SubLObject gnuplot_availableP() {
        return NIL;
    }

    public static final SubLObject plot_unavailable_warning_alt() {
        return Errors.warn($str_alt82$External_plotting_not_enabled_in_);
    }

    public static SubLObject plot_unavailable_warning() {
        return Errors.warn($str52$External_plotting_not_enabled_in_);
    }

    public static final SubLObject declare_plot_generation_file_alt() {
        declareFunction("generate_line_graph", "GENERATE-LINE-GRAPH", 2, 0, false);
        declareFunction("generate_line_graph_from_values", "GENERATE-LINE-GRAPH-FROM-VALUES", 2, 0, false);
        declareFunction("generate_lines_graph", "GENERATE-LINES-GRAPH", 2, 0, false);
        declareFunction("generate_unconnected_lines_graph", "GENERATE-UNCONNECTED-LINES-GRAPH", 2, 0, false);
        declareFunction("generate_points_graph", "GENERATE-POINTS-GRAPH", 2, 0, false);
        declareFunction("generate_correlation_plot", "GENERATE-CORRELATION-PLOT", 2, 0, false);
        declareFunction("generate_lines_graph_from_values_list", "GENERATE-LINES-GRAPH-FROM-VALUES-LIST", 2, 1, false);
        declareFunction("kbq_generate_property_correlation_plot", "KBQ-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false);
        declareFunction("kbq_generate_properties_correlation_plot", "KBQ-GENERATE-PROPERTIES-CORRELATION-PLOT", 3, 1, false);
        declareFunction("kbq_generate_sorted_property_comparison", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false);
        declareFunction("kbq_generate_sorted_property_comparison_for_runs", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON-FOR-RUNS", 2, 2, false);
        declareFunction("kbq_generate_sorted_properties_comparison", "KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false);
        declareFunction("kbq_generate_sorted_property_display", "KBQ-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false);
        declareFunction("kbq_generate_answerable_vs_unanswerable_comparison", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 2, false);
        declareFunction("kbq_generate_answerable_vs_unanswerable_comparison_int", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON-INT", 5, 0, false);
        declareFunction("kbq_generate_answerability_prediction_display", "KBQ-GENERATE-ANSWERABILITY-PREDICTION-DISPLAY", 3, 2, false);
        declareFunction("generate_inference_answer_image", "GENERATE-INFERENCE-ANSWER-IMAGE", 2, 1, false);
        declareFunction("kbq_save_property_comparison_datafile", "KBQ-SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 1, false);
        declareFunction("save_property_comparison_datafile", "SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 0, false);
        declareFunction("kbq_generate_tuples_for_property_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON", 3, 0, false);
        declareFunction("kbq_generate_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 2, 0, false);
        declareFunction("kbq_generate_sorted_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-SORTED-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 3, 0, false);
        declareFunction("comments_for_property_comparison_datafile", "COMMENTS-FOR-PROPERTY-COMPARISON-DATAFILE", 2, 0, false);
        declareFunction("kbq_save_properties_comparison_datafile", "KBQ-SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false);
        declareFunction("save_properties_comparison_datafile", "SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false);
        declareFunction("kbq_generate_tuples_for_properties_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTIES-COMPARISON", 2, 0, false);
        declareFunction("comments_for_properties_comparison_datafile", "COMMENTS-FOR-PROPERTIES-COMPARISON-DATAFILE", 2, 0, false);
        declareFunction("kbq_save_property_classification_datafile", "KBQ-SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 3, 1, false);
        declareFunction("save_property_classification_datafile", "SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 4, 0, false);
        declareFunction("comments_for_property_classification_datafile", "COMMENTS-FOR-PROPERTY-CLASSIFICATION-DATAFILE", 2, 0, false);
        declareFunction("kbq_generate_tuples_for_property_classification", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-CLASSIFICATION", 2, 0, false);
        declareFunction("rank_and_classify_property_classification_tuples", "RANK-AND-CLASSIFY-PROPERTY-CLASSIFICATION-TUPLES", 2, 0, false);
        declareFunction("inference_save_answer_timeline_datafile", "INFERENCE-SAVE-ANSWER-TIMELINE-DATAFILE", 2, 0, false);
        declareFunction("inference_answer_elapsed_time_tuples", "INFERENCE-ANSWER-ELAPSED-TIME-TUPLES", 1, 0, false);
        declareMacro("do_kb_stats_data_files", "DO-KB-STATS-DATA-FILES");
        declareFunction("view_nart_counts_from_0", "VIEW-NART-COUNTS-FROM-0", 0, 2, false);
        declareFunction("view_nart_counts_of_type_from_0", "VIEW-NART-COUNTS-OF-TYPE-FROM-0", 1, 2, false);
        declareFunction("view_nart_counts", "VIEW-NART-COUNTS", 0, 4, false);
        declareFunction("view_nart_counts_of_type", "VIEW-NART-COUNTS-OF-TYPE", 1, 3, false);
        declareFunction("save_plot_datafile", "SAVE-PLOT-DATAFILE", 2, 1, false);
        declareFunction("kbq_property_coordinates", "KBQ-PROPERTY-COORDINATES", 2, 0, false);
        declareFunction("coordinatify", "COORDINATIFY", 1, 0, false);
        declareFunction("equalize_lengths", "EQUALIZE-LENGTHS", 1, 0, false);
        declareFunction("scale_lengths", "SCALE-LENGTHS", 1, 0, false);
        declareFunction("save_lines_graph_plot_file", "SAVE-LINES-GRAPH-PLOT-FILE", 4, 0, false);
        declareFunction("save_points_graph_plot_file", "SAVE-POINTS-GRAPH-PLOT-FILE", 4, 0, false);
        declareFunction("save_correlation_plot_file", "SAVE-CORRELATION-PLOT-FILE", 3, 0, false);
        declareFunction("save_property_correlation_plot_file", "SAVE-PROPERTY-CORRELATION-PLOT-FILE", 3, 0, false);
        declareFunction("save_property_comparison_plot_file", "SAVE-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false);
        declareFunction("save_sorted_property_comparison_plot_file", "SAVE-SORTED-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false);
        declareFunction("save_sorted_properties_comparison_plot_file", "SAVE-SORTED-PROPERTIES-COMPARISON-PLOT-FILE", 5, 0, false);
        declareFunction("save_sorted_property_display_plot_file", "SAVE-SORTED-PROPERTY-DISPLAY-PLOT-FILE", 4, 0, false);
        declareFunction("save_inference_answer_plot_file", "SAVE-INFERENCE-ANSWER-PLOT-FILE", 5, 0, false);
        declareFunction("compute_key_location", "COMPUTE-KEY-LOCATION", 1, 0, false);
        declareFunction("compute_key_location_from_tuples", "COMPUTE-KEY-LOCATION-FROM-TUPLES", 1, 0, false);
        declareFunction("plot_properties_name", "PLOT-PROPERTIES-NAME", 1, 0, false);
        declareFunction("plot_properties_display", "PLOT-PROPERTIES-DISPLAY", 1, 0, false);
        declareFunction("plot_full_filename", "PLOT-FULL-FILENAME", 2, 1, false);
        declareFunction("plot_data_full_filename", "PLOT-DATA-FULL-FILENAME", 1, 0, false);
        declareFunction("plot_data_full_filename_from_properties", "PLOT-DATA-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false);
        declareFunction("plot_program_full_filename", "PLOT-PROGRAM-FULL-FILENAME", 1, 0, false);
        declareFunction("plot_program_full_filename_from_properties", "PLOT-PROGRAM-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false);
        declareFunction("possibly_display_saved_plot", "POSSIBLY-DISPLAY-SAVED-PLOT", 2, 0, false);
        declareFunction("save_plot_as_image", "SAVE-PLOT-AS-IMAGE", 2, 0, false);
        declareFunction("save_plot_as_image_successfulP", "SAVE-PLOT-AS-IMAGE-SUCCESSFUL?", 1, 0, false);
        declareFunction("plot_image_format", "PLOT-IMAGE-FORMAT", 0, 0, false);
        declareFunction("append_proper_plot_image_extension", "APPEND-PROPER-PLOT-IMAGE-EXTENSION", 1, 0, false);
        declareFunction("plot_image_extension", "PLOT-IMAGE-EXTENSION", 0, 0, false);
        declareFunction("plot_image_format_and_extension", "PLOT-IMAGE-FORMAT-AND-EXTENSION", 0, 0, false);
        declareFunction("plotting_availableP", "PLOTTING-AVAILABLE?", 0, 0, false);
        declareFunction("plot_unavailable_warning", "PLOT-UNAVAILABLE-WARNING", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_plot_generation_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("generate_line_graph", "GENERATE-LINE-GRAPH", 2, 0, false);
            declareFunction("generate_line_graph_from_values", "GENERATE-LINE-GRAPH-FROM-VALUES", 2, 0, false);
            declareFunction("generate_lines_graph", "GENERATE-LINES-GRAPH", 2, 0, false);
            declareFunction("generate_unconnected_lines_graph", "GENERATE-UNCONNECTED-LINES-GRAPH", 2, 0, false);
            declareFunction("generate_points_graph", "GENERATE-POINTS-GRAPH", 2, 0, false);
            declareFunction("generate_correlation_plot", "GENERATE-CORRELATION-PLOT", 2, 0, false);
            declareFunction("generate_lines_graph_from_values_list", "GENERATE-LINES-GRAPH-FROM-VALUES-LIST", 2, 1, false);
            declareFunction("kbq_generate_property_correlation_plot", "KBQ-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false);
            declareFunction("kbq_generate_properties_correlation_plot", "KBQ-GENERATE-PROPERTIES-CORRELATION-PLOT", 3, 1, false);
            declareFunction("kbq_generate_sorted_property_comparison", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false);
            declareFunction("kbq_generate_sorted_property_comparison_for_runs", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON-FOR-RUNS", 2, 2, false);
            declareFunction("kbq_generate_sorted_properties_comparison", "KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false);
            declareFunction("kbq_generate_sorted_property_display", "KBQ-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false);
            declareFunction("kbq_generate_answerable_vs_unanswerable_comparison", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 2, false);
            declareFunction("kbq_generate_answerable_vs_unanswerable_comparison_int", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON-INT", 5, 0, false);
            declareFunction("kbq_generate_answerability_prediction_display", "KBQ-GENERATE-ANSWERABILITY-PREDICTION-DISPLAY", 3, 2, false);
            declareFunction("generate_inference_answer_image", "GENERATE-INFERENCE-ANSWER-IMAGE", 2, 1, false);
            declareFunction("kbq_save_property_comparison_datafile", "KBQ-SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 1, false);
            declareFunction("save_property_comparison_datafile", "SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 0, false);
            declareFunction("kbq_generate_tuples_for_property_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON", 3, 0, false);
            declareFunction("kbq_generate_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 2, 0, false);
            declareFunction("kbq_generate_sorted_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-SORTED-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 3, 0, false);
            declareFunction("comments_for_property_comparison_datafile", "COMMENTS-FOR-PROPERTY-COMPARISON-DATAFILE", 2, 0, false);
            declareFunction("kbq_save_properties_comparison_datafile", "KBQ-SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false);
            declareFunction("save_properties_comparison_datafile", "SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false);
            declareFunction("kbq_generate_tuples_for_properties_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTIES-COMPARISON", 2, 0, false);
            declareFunction("comments_for_properties_comparison_datafile", "COMMENTS-FOR-PROPERTIES-COMPARISON-DATAFILE", 2, 0, false);
            declareFunction("kbq_save_property_classification_datafile", "KBQ-SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 3, 1, false);
            declareFunction("save_property_classification_datafile", "SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 4, 0, false);
            declareFunction("comments_for_property_classification_datafile", "COMMENTS-FOR-PROPERTY-CLASSIFICATION-DATAFILE", 2, 0, false);
            declareFunction("kbq_generate_tuples_for_property_classification", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-CLASSIFICATION", 2, 0, false);
            declareFunction("rank_and_classify_property_classification_tuples", "RANK-AND-CLASSIFY-PROPERTY-CLASSIFICATION-TUPLES", 2, 0, false);
            declareFunction("inference_save_answer_timeline_datafile", "INFERENCE-SAVE-ANSWER-TIMELINE-DATAFILE", 2, 0, false);
            declareFunction("inference_answer_elapsed_time_tuples", "INFERENCE-ANSWER-ELAPSED-TIME-TUPLES", 1, 0, false);
            declareFunction("save_plot_datafile", "SAVE-PLOT-DATAFILE", 2, 1, false);
            declareFunction("kbq_property_coordinates", "KBQ-PROPERTY-COORDINATES", 2, 0, false);
            declareFunction("coordinatify", "COORDINATIFY", 1, 0, false);
            declareFunction("equalize_lengths", "EQUALIZE-LENGTHS", 1, 0, false);
            declareFunction("scale_lengths", "SCALE-LENGTHS", 1, 0, false);
            declareFunction("save_lines_graph_plot_file", "SAVE-LINES-GRAPH-PLOT-FILE", 4, 0, false);
            declareFunction("save_points_graph_plot_file", "SAVE-POINTS-GRAPH-PLOT-FILE", 4, 0, false);
            declareFunction("save_correlation_plot_file", "SAVE-CORRELATION-PLOT-FILE", 3, 0, false);
            declareFunction("save_property_correlation_plot_file", "SAVE-PROPERTY-CORRELATION-PLOT-FILE", 3, 0, false);
            declareFunction("save_property_comparison_plot_file", "SAVE-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false);
            declareFunction("save_sorted_property_comparison_plot_file", "SAVE-SORTED-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false);
            declareFunction("save_sorted_properties_comparison_plot_file", "SAVE-SORTED-PROPERTIES-COMPARISON-PLOT-FILE", 5, 0, false);
            declareFunction("save_sorted_property_display_plot_file", "SAVE-SORTED-PROPERTY-DISPLAY-PLOT-FILE", 4, 0, false);
            declareFunction("save_inference_answer_plot_file", "SAVE-INFERENCE-ANSWER-PLOT-FILE", 5, 0, false);
            declareFunction("compute_key_location", "COMPUTE-KEY-LOCATION", 1, 0, false);
            declareFunction("compute_key_location_from_tuples", "COMPUTE-KEY-LOCATION-FROM-TUPLES", 1, 0, false);
            declareFunction("plot_properties_name", "PLOT-PROPERTIES-NAME", 1, 0, false);
            declareFunction("plot_properties_display", "PLOT-PROPERTIES-DISPLAY", 1, 0, false);
            declareFunction("plot_full_filename", "PLOT-FULL-FILENAME", 2, 1, false);
            declareFunction("plot_data_full_filename", "PLOT-DATA-FULL-FILENAME", 1, 0, false);
            declareFunction("plot_data_full_filename_from_properties", "PLOT-DATA-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false);
            declareFunction("plot_program_full_filename", "PLOT-PROGRAM-FULL-FILENAME", 1, 0, false);
            declareFunction("plot_program_full_filename_from_properties", "PLOT-PROGRAM-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false);
            declareFunction("possibly_display_saved_plot", "POSSIBLY-DISPLAY-SAVED-PLOT", 2, 0, false);
            declareFunction("save_plot_as_image", "SAVE-PLOT-AS-IMAGE", 2, 0, false);
            declareFunction("save_plot_as_image_successfulP", "SAVE-PLOT-AS-IMAGE-SUCCESSFUL?", 1, 0, false);
            declareFunction("plot_image_format", "PLOT-IMAGE-FORMAT", 0, 0, false);
            declareFunction("append_proper_plot_image_extension", "APPEND-PROPER-PLOT-IMAGE-EXTENSION", 1, 0, false);
            declareFunction("plot_image_extension", "PLOT-IMAGE-EXTENSION", 0, 0, false);
            declareFunction("plot_image_format_and_extension", "PLOT-IMAGE-FORMAT-AND-EXTENSION", 0, 0, false);
            declareFunction("plotting_availableP", "PLOTTING-AVAILABLE?", 0, 0, false);
            declareFunction("gnuplot_availableP", "GNUPLOT-AVAILABLE?", 0, 0, false);
            declareFunction("plot_unavailable_warning", "PLOT-UNAVAILABLE-WARNING", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareMacro("do_kb_stats_data_files", "DO-KB-STATS-DATA-FILES");
            declareFunction("view_nart_counts_from_0", "VIEW-NART-COUNTS-FROM-0", 0, 2, false);
            declareFunction("view_nart_counts_of_type_from_0", "VIEW-NART-COUNTS-OF-TYPE-FROM-0", 1, 2, false);
            declareFunction("view_nart_counts", "VIEW-NART-COUNTS", 0, 4, false);
            declareFunction("view_nart_counts_of_type", "VIEW-NART-COUNTS-OF-TYPE", 1, 3, false);
        }
        return NIL;
    }

    public static SubLObject declare_plot_generation_file_Previous() {
        declareFunction("generate_line_graph", "GENERATE-LINE-GRAPH", 2, 0, false);
        declareFunction("generate_line_graph_from_values", "GENERATE-LINE-GRAPH-FROM-VALUES", 2, 0, false);
        declareFunction("generate_lines_graph", "GENERATE-LINES-GRAPH", 2, 0, false);
        declareFunction("generate_unconnected_lines_graph", "GENERATE-UNCONNECTED-LINES-GRAPH", 2, 0, false);
        declareFunction("generate_points_graph", "GENERATE-POINTS-GRAPH", 2, 0, false);
        declareFunction("generate_correlation_plot", "GENERATE-CORRELATION-PLOT", 2, 0, false);
        declareFunction("generate_lines_graph_from_values_list", "GENERATE-LINES-GRAPH-FROM-VALUES-LIST", 2, 1, false);
        declareFunction("kbq_generate_property_correlation_plot", "KBQ-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false);
        declareFunction("kbq_generate_properties_correlation_plot", "KBQ-GENERATE-PROPERTIES-CORRELATION-PLOT", 3, 1, false);
        declareFunction("kbq_generate_sorted_property_comparison", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false);
        declareFunction("kbq_generate_sorted_property_comparison_for_runs", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON-FOR-RUNS", 2, 2, false);
        declareFunction("kbq_generate_sorted_properties_comparison", "KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false);
        declareFunction("kbq_generate_sorted_property_display", "KBQ-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false);
        declareFunction("kbq_generate_answerable_vs_unanswerable_comparison", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 2, false);
        declareFunction("kbq_generate_answerable_vs_unanswerable_comparison_int", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON-INT", 5, 0, false);
        declareFunction("kbq_generate_answerability_prediction_display", "KBQ-GENERATE-ANSWERABILITY-PREDICTION-DISPLAY", 3, 2, false);
        declareFunction("generate_inference_answer_image", "GENERATE-INFERENCE-ANSWER-IMAGE", 2, 1, false);
        declareFunction("kbq_save_property_comparison_datafile", "KBQ-SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 1, false);
        declareFunction("save_property_comparison_datafile", "SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 0, false);
        declareFunction("kbq_generate_tuples_for_property_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON", 3, 0, false);
        declareFunction("kbq_generate_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 2, 0, false);
        declareFunction("kbq_generate_sorted_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-SORTED-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 3, 0, false);
        declareFunction("comments_for_property_comparison_datafile", "COMMENTS-FOR-PROPERTY-COMPARISON-DATAFILE", 2, 0, false);
        declareFunction("kbq_save_properties_comparison_datafile", "KBQ-SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false);
        declareFunction("save_properties_comparison_datafile", "SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false);
        declareFunction("kbq_generate_tuples_for_properties_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTIES-COMPARISON", 2, 0, false);
        declareFunction("comments_for_properties_comparison_datafile", "COMMENTS-FOR-PROPERTIES-COMPARISON-DATAFILE", 2, 0, false);
        declareFunction("kbq_save_property_classification_datafile", "KBQ-SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 3, 1, false);
        declareFunction("save_property_classification_datafile", "SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 4, 0, false);
        declareFunction("comments_for_property_classification_datafile", "COMMENTS-FOR-PROPERTY-CLASSIFICATION-DATAFILE", 2, 0, false);
        declareFunction("kbq_generate_tuples_for_property_classification", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-CLASSIFICATION", 2, 0, false);
        declareFunction("rank_and_classify_property_classification_tuples", "RANK-AND-CLASSIFY-PROPERTY-CLASSIFICATION-TUPLES", 2, 0, false);
        declareFunction("inference_save_answer_timeline_datafile", "INFERENCE-SAVE-ANSWER-TIMELINE-DATAFILE", 2, 0, false);
        declareFunction("inference_answer_elapsed_time_tuples", "INFERENCE-ANSWER-ELAPSED-TIME-TUPLES", 1, 0, false);
        declareFunction("save_plot_datafile", "SAVE-PLOT-DATAFILE", 2, 1, false);
        declareFunction("kbq_property_coordinates", "KBQ-PROPERTY-COORDINATES", 2, 0, false);
        declareFunction("coordinatify", "COORDINATIFY", 1, 0, false);
        declareFunction("equalize_lengths", "EQUALIZE-LENGTHS", 1, 0, false);
        declareFunction("scale_lengths", "SCALE-LENGTHS", 1, 0, false);
        declareFunction("save_lines_graph_plot_file", "SAVE-LINES-GRAPH-PLOT-FILE", 4, 0, false);
        declareFunction("save_points_graph_plot_file", "SAVE-POINTS-GRAPH-PLOT-FILE", 4, 0, false);
        declareFunction("save_correlation_plot_file", "SAVE-CORRELATION-PLOT-FILE", 3, 0, false);
        declareFunction("save_property_correlation_plot_file", "SAVE-PROPERTY-CORRELATION-PLOT-FILE", 3, 0, false);
        declareFunction("save_property_comparison_plot_file", "SAVE-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false);
        declareFunction("save_sorted_property_comparison_plot_file", "SAVE-SORTED-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false);
        declareFunction("save_sorted_properties_comparison_plot_file", "SAVE-SORTED-PROPERTIES-COMPARISON-PLOT-FILE", 5, 0, false);
        declareFunction("save_sorted_property_display_plot_file", "SAVE-SORTED-PROPERTY-DISPLAY-PLOT-FILE", 4, 0, false);
        declareFunction("save_inference_answer_plot_file", "SAVE-INFERENCE-ANSWER-PLOT-FILE", 5, 0, false);
        declareFunction("compute_key_location", "COMPUTE-KEY-LOCATION", 1, 0, false);
        declareFunction("compute_key_location_from_tuples", "COMPUTE-KEY-LOCATION-FROM-TUPLES", 1, 0, false);
        declareFunction("plot_properties_name", "PLOT-PROPERTIES-NAME", 1, 0, false);
        declareFunction("plot_properties_display", "PLOT-PROPERTIES-DISPLAY", 1, 0, false);
        declareFunction("plot_full_filename", "PLOT-FULL-FILENAME", 2, 1, false);
        declareFunction("plot_data_full_filename", "PLOT-DATA-FULL-FILENAME", 1, 0, false);
        declareFunction("plot_data_full_filename_from_properties", "PLOT-DATA-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false);
        declareFunction("plot_program_full_filename", "PLOT-PROGRAM-FULL-FILENAME", 1, 0, false);
        declareFunction("plot_program_full_filename_from_properties", "PLOT-PROGRAM-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false);
        declareFunction("possibly_display_saved_plot", "POSSIBLY-DISPLAY-SAVED-PLOT", 2, 0, false);
        declareFunction("save_plot_as_image", "SAVE-PLOT-AS-IMAGE", 2, 0, false);
        declareFunction("save_plot_as_image_successfulP", "SAVE-PLOT-AS-IMAGE-SUCCESSFUL?", 1, 0, false);
        declareFunction("plot_image_format", "PLOT-IMAGE-FORMAT", 0, 0, false);
        declareFunction("append_proper_plot_image_extension", "APPEND-PROPER-PLOT-IMAGE-EXTENSION", 1, 0, false);
        declareFunction("plot_image_extension", "PLOT-IMAGE-EXTENSION", 0, 0, false);
        declareFunction("plot_image_format_and_extension", "PLOT-IMAGE-FORMAT-AND-EXTENSION", 0, 0, false);
        declareFunction("plotting_availableP", "PLOTTING-AVAILABLE?", 0, 0, false);
        declareFunction("gnuplot_availableP", "GNUPLOT-AVAILABLE?", 0, 0, false);
        declareFunction("plot_unavailable_warning", "PLOT-UNAVAILABLE-WARNING", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_plot_generation_file_alt() {
        deflexical("*INFN-COUNT-DATA-DIR*", $str_alt39$_cyc_top_data_kb_stats_);
        deflexical("*DEFAULT-PLOT-NAME*", $$$plot);
        deflexical("*PLOT-DIRECTORY*", $str_alt79$_tmp_);
        return NIL;
    }

    public static SubLObject init_plot_generation_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*INFN-COUNT-DATA-DIR*", $str40$_cyc_top_data_kb_stats_);
            deflexical("*DEFAULT-PLOT-NAME*", $$$plot);
            deflexical("*PLOT-DIRECTORY*", $str49$_tmp_);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*INFN-COUNT-DATA-DIR*", $str_alt39$_cyc_top_data_kb_stats_);
            deflexical("*PLOT-DIRECTORY*", $str_alt79$_tmp_);
        }
        return NIL;
    }

    public static SubLObject init_plot_generation_file_Previous() {
        deflexical("*INFN-COUNT-DATA-DIR*", $str40$_cyc_top_data_kb_stats_);
        deflexical("*DEFAULT-PLOT-NAME*", $$$plot);
        deflexical("*PLOT-DIRECTORY*", $str49$_tmp_);
        return NIL;
    }

    public static final SubLObject setup_plot_generation_file_alt() {
        define_test_case_table_int(RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt91);
        return NIL;
    }

    public static SubLObject setup_plot_generation_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int(RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list60);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt91);
        }
        return NIL;
    }

    public static SubLObject setup_plot_generation_file_Previous() {
        define_test_case_table_int(RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list60);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_plot_generation_file();
    }

    @Override
    public void initializeVariables() {
        init_plot_generation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_plot_generation_file();
    }

    

    static private final SubLList $list_alt5 = list($BOTH, makeKeyword("BASELINE"), makeKeyword("EXPERIMENT"));

    static private final SubLString $str_alt6$Invalid_sort_by_parameter_ = makeString("Invalid sort-by parameter.");

    static private final SubLList $list_alt8 = list(makeKeyword("ALL"), makeKeyword("FIRST"));

    static private final SubLString $str_alt9$There_should_be_atleast_2_runs_sp = makeString("There should be atleast 2 runs specified");

    static private final SubLList $list_alt13 = list(makeSymbol("SCALED-ANSWERABLE-VALUES"), makeSymbol("SCALED-UNANSWERABLE-VALUES"));

    static private final SubLList $list_alt14 = list(makeString("unanswerable"), makeString("answerable"));

    static private final SubLSymbol $sym16$KBQ_QUERY_RUN_TIMED_OUT_ = makeSymbol("KBQ-QUERY-RUN-TIMED-OUT?");

    static private final SubLString $str_alt17$No_oracularly_answerable_timed_ou = makeString("No oracularly answerable timed-out queries");

    static private final SubLString $str_alt18$_tmp_inference_answer_timeline_da = makeString("/tmp/inference_answer_timeline.data");

    static private final SubLString $str_alt19$_tmp_inference_answer_timeline_pl = makeString("/tmp/inference_answer_timeline.plot");

    static private final SubLString $str_alt25$baseline_____ = makeString("baseline   = ");

    static private final SubLString $str_alt26$experiment___ = makeString("experiment = ");

    static private final SubLString $str_alt27$property_____ = makeString("property   = ");

    static private final SubLString $str_alt28$Cannot_handle_more_than_10_proper = makeString("Cannot handle more than 10 properties, got ~s");

    static private final SubLString $str_alt30$properties___ = makeString("properties = ");

    static private final SubLSymbol $sym32$_ = makeSymbol("<");

    static private final SubLString $str_alt35$classification_ = makeString("classification ");

    static private final SubLString $str_alt36$Classification__S_was_empty = makeString("Classification ~S was empty");

    static private final SubLList $list_alt37 = list(makeSymbol("ELEMENT"), makeSymbol("VALUE"));

    static private final SubLString $str_alt39$_cyc_top_data_kb_stats_ = makeString("/cyc/top/data/kb-stats/");

    static private final SubLList $list_alt40 = list(list(makeSymbol("FILE"), makeSymbol("KB-NUM"), makeSymbol("FUNCTOR"), makeSymbol("DIR-NAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym41$SHORT_FILE_NAME = makeUninternedSymbol("SHORT-FILE-NAME");

    static private final SubLSymbol $sym42$REGEXP = makeUninternedSymbol("REGEXP");

    static private final SubLString $str_alt47$KB__0_9____A_NARTS_txt = makeString("KB-[0-9]*-~A-NARTS.txt");

    private static final SubLSymbol FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION = makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION");

    static private final SubLList $list_alt53 = list(THREE_INTEGER, SEVEN_INTEGER);

    public static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell("InstanceNamedFn-Ternary");

    static private final SubLString $$$Cyc_KB = makeString("Cyc KB");

    static private final SubLString $$$NART_Count = makeString("NART Count");

    static private final SubLString $str_alt61$_NART_Counts = makeString(" NART Counts");

    private static final SubLSymbol $YORIGIN = makeKeyword("YORIGIN");

    static private final SubLString $str_alt64$KB__0_9___ = makeString("KB-[0-9]*-");

    static private final SubLString $str_alt65$_NARTS_txt = makeString("-NARTS.txt");

    static private final SubLString $str_alt67$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$NART = makeString("NART");

    static private final SubLString $str_alt69$_0_9___ = makeString("[0-9]+$");

    static private final SubLString $str_alt70$_ = makeString(" ");

    static private final SubLList $list_alt72 = list(makeSymbol("X"), makeSymbol("Y"));

    static private final SubLList $list_alt75 = list(makeSymbol("WHO-CARES"), makeSymbol("VALUE"));

    static private final SubLString $str_alt79$_tmp_ = makeString("/tmp/");

    static private final SubLString $str_alt80$_ = makeString(".");

    static private final SubLString $str_alt82$External_plotting_not_enabled_in_ = makeString("External plotting not enabled in this image");

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt91 = list(list(list(list(list(ONE_INTEGER, makeDouble(0.4)), list(MINUS_ONE_INTEGER, makeDouble(0.7)), list(TWO_INTEGER, makeDouble(0.3)), list(makeInteger(-2), makeDouble(0.1))), list(makeSymbol("PLUSP"), makeSymbol("MINUSP"))), list(list(ONE_INTEGER, makeDouble(0.3)), list(TWO_INTEGER, makeDouble(0.4)), makeString("classification 1"), list(ZERO_INTEGER, makeDouble(0.1)), list(THREE_INTEGER, makeDouble(0.7)))));
}

/**
 * Total time: 229 ms
 */
