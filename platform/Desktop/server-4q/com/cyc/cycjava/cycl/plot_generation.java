package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class plot_generation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.plot_generation";
    public static final String myFingerPrint = "6386048e9850e818b566eabb8a0a5599f893635359d4110b4a8ab4b704ec406a";
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 24951L)
    public static SubLSymbol $infn_count_data_dir$;
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 33731L)
    private static SubLSymbol $default_plot_name$;
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34037L)
    private static SubLSymbol $plot_directory$;
    private static final SubLSymbol $kw0$LINE_LABEL;
    private static final SubLString $str1$;
    private static final SubLSymbol $kw2$LINE_LABELS;
    private static final SubLSymbol $sym3$COORDINATIFY;
    private static final SubLSymbol $kw4$BOTH;
    private static final SubLList $list5;
    private static final SubLString $str6$Invalid_sort_by_parameter_;
    private static final SubLSymbol $kw7$FIRST;
    private static final SubLList $list8;
    private static final SubLString $str9$There_should_be_atleast_2_runs_sp;
    private static final SubLSymbol $kw10$ALL;
    private static final SubLSymbol $sym11$TRUE;
    private static final SubLSymbol $sym12$SAFE__;
    private static final SubLSymbol $kw13$SCALE_;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLString $str16$timed_out;
    private static final SubLSymbol $sym17$KBQ_QUERY_RUN_TIMED_OUT_;
    private static final SubLString $str18$No_oracularly_answerable_timed_ou;
    private static final SubLString $str19$_tmp_inference_answer_timeline_da;
    private static final SubLString $str20$_tmp_inference_answer_timeline_pl;
    private static final SubLSymbol $kw21$QUERY;
    private static final SubLSymbol $kw22$BASELINE_NAME;
    private static final SubLString $str23$baseline;
    private static final SubLSymbol $kw24$EXPERIMENT_NAME;
    private static final SubLString $str25$experiment;
    private static final SubLString $str26$baseline_____;
    private static final SubLString $str27$experiment___;
    private static final SubLString $str28$property_____;
    private static final SubLString $str29$Cannot_handle_more_than_10_proper;
    private static final SubLSymbol $sym30$NUMBERP;
    private static final SubLString $str31$properties___;
    private static final SubLString $str32$classification_0;
    private static final SubLSymbol $sym33$_;
    private static final SubLSymbol $sym34$SECOND;
    private static final SubLSymbol $sym35$FIRST;
    private static final SubLString $str36$classification_;
    private static final SubLString $str37$Classification__S_was_empty;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$SKIP;
    private static final SubLString $str40$_cyc_top_data_kb_stats_;
    private static final SubLSymbol $sym41$LENGTH;
    private static final SubLList $list42;
    private static final SubLFloat $float43$0_3;
    private static final SubLFloat $float44$0_0;
    private static final SubLList $list45;
    private static final SubLString $str46$plot;
    private static final SubLSymbol $kw47$PLOT_NAME;
    private static final SubLSymbol $kw48$DISPLAY;
    private static final SubLString $str49$_tmp_;
    private static final SubLString $str50$_;
    private static final SubLString $str51$dat;
    private static final SubLString $str52$External_plotting_not_enabled_in_;
    private static final SubLSymbol $sym53$RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES;
    private static final SubLSymbol $kw54$TEST;
    private static final SubLSymbol $kw55$OWNER;
    private static final SubLSymbol $kw56$CLASSES;
    private static final SubLSymbol $kw57$KB;
    private static final SubLSymbol $kw58$TINY;
    private static final SubLSymbol $kw59$WORKING_;
    private static final SubLList $list60;
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 1458L)
    public static SubLObject generate_line_graph(final SubLObject coordinates, final SubLObject plot_properties) {
        final SubLObject line_label = conses_high.getf(plot_properties, (SubLObject)plot_generation.$kw0$LINE_LABEL, (SubLObject)plot_generation.$str1$);
        SubLObject new_plot_properties = conses_high.copy_list(plot_properties);
        new_plot_properties = conses_high.remf(new_plot_properties, (SubLObject)plot_generation.$kw0$LINE_LABEL);
        new_plot_properties = conses_high.putf(new_plot_properties, (SubLObject)plot_generation.$kw2$LINE_LABELS, (SubLObject)ConsesLow.list(line_label));
        return generate_lines_graph((SubLObject)ConsesLow.list(coordinates), new_plot_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 2424L)
    public static SubLObject generate_line_graph_from_values(final SubLObject values, final SubLObject plot_properties) {
        return generate_line_graph(coordinatify(values), plot_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 2807L)
    public static SubLObject generate_lines_graph(final SubLObject coordinates_list, final SubLObject plot_properties) {
        final SubLObject line_count = Sequences.length(coordinates_list);
        final SubLObject tuples = list_utilities.collate(coordinates_list);
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        save_plot_datafile(data_filename, tuples, (SubLObject)plot_generation.UNPROVIDED);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_lines_graph_plot_file(plot_filename, data_filename, plot_properties, line_count);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 3685L)
    public static SubLObject generate_unconnected_lines_graph(final SubLObject coordinates_list, final SubLObject plot_properties) {
        final SubLObject line_count = Sequences.length(coordinates_list);
        final SubLObject tuples = list_utilities.collate(coordinates_list);
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        save_plot_datafile(data_filename, tuples, (SubLObject)plot_generation.UNPROVIDED);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_property_comparison_plot_file(plot_filename, data_filename, plot_properties, line_count);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 4957L)
    public static SubLObject generate_points_graph(final SubLObject coordinates_list, final SubLObject plot_properties) {
        final SubLObject point_set_count = Sequences.length(coordinates_list);
        final SubLObject tuples = list_utilities.collate(coordinates_list);
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        save_plot_datafile(data_filename, tuples, (SubLObject)plot_generation.UNPROVIDED);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_points_graph_plot_file(plot_filename, data_filename, plot_properties, point_set_count);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 5836L)
    public static SubLObject generate_correlation_plot(final SubLObject coordinates, final SubLObject plot_properties) {
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        final SubLObject ranked_coordinates = list_utilities.rank_tuples(coordinates);
        save_plot_datafile(data_filename, ranked_coordinates, (SubLObject)plot_generation.UNPROVIDED);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_correlation_plot_file(plot_filename, data_filename, plot_properties);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 6850L)
    public static SubLObject generate_lines_graph_from_values_list(final SubLObject values_list, final SubLObject plot_properties, SubLObject scaleP) {
        if (scaleP == plot_generation.UNPROVIDED) {
            scaleP = (SubLObject)plot_generation.T;
        }
        final SubLObject scaled_values_list = (plot_generation.NIL != scaleP) ? scale_lengths(values_list) : values_list;
        final SubLObject coordinates_list = equalize_lengths(Mapping.mapcar((SubLObject)plot_generation.$sym3$COORDINATIFY, scaled_values_list));
        return generate_lines_graph(coordinates_list, plot_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 7484L)
    public static SubLObject kbq_generate_property_correlation_plot(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject display) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        if (display == plot_generation.UNPROVIDED) {
            display = (SubLObject)plot_generation.NIL;
        }
        final SubLObject data_filename = kbq_save_property_comparison_datafile(baseline_run, experiment_run, property, plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        save_property_correlation_plot_file(plot_filename, data_filename, plot_properties);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 7992L)
    public static SubLObject kbq_generate_properties_correlation_plot(final SubLObject query_set_run, final SubLObject x_property, final SubLObject y_property, SubLObject plot_properties) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        final SubLObject data_filename = kbq_save_properties_comparison_datafile(query_set_run, (SubLObject)ConsesLow.list(x_property, y_property), plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        final SubLObject display = plot_properties_display(plot_properties);
        save_property_correlation_plot_file(plot_filename, data_filename, plot_properties);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 8560L)
    public static SubLObject kbq_generate_sorted_property_comparison(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        if (sort_by == plot_generation.UNPROVIDED) {
            sort_by = (SubLObject)plot_generation.$kw4$BOTH;
        }
        if (display == plot_generation.UNPROVIDED) {
            display = (SubLObject)plot_generation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (plot_generation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && plot_generation.NIL == conses_high.member(sort_by, (SubLObject)plot_generation.$list5, (SubLObject)plot_generation.UNPROVIDED, (SubLObject)plot_generation.UNPROVIDED)) {
            Errors.error((SubLObject)plot_generation.$str6$Invalid_sort_by_parameter_);
        }
        final SubLObject data_filename = kbq_save_property_comparison_datafile(baseline_run, experiment_run, property, plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        save_sorted_property_comparison_plot_file(plot_filename, data_filename, plot_properties, sort_by);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 9192L)
    public static SubLObject kbq_generate_sorted_property_comparison_for_runs(final SubLObject runs, final SubLObject property, SubLObject plot_properties, SubLObject sort_by) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        if (sort_by == plot_generation.UNPROVIDED) {
            sort_by = (SubLObject)plot_generation.$kw7$FIRST;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (plot_generation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && plot_generation.NIL == conses_high.member(sort_by, (SubLObject)plot_generation.$list8, (SubLObject)plot_generation.UNPROVIDED, (SubLObject)plot_generation.UNPROVIDED)) {
            Errors.error((SubLObject)plot_generation.$str6$Invalid_sort_by_parameter_);
        }
        if (plot_generation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !Sequences.length(runs).numG((SubLObject)plot_generation.ONE_INTEGER)) {
            Errors.error((SubLObject)plot_generation.$str9$There_should_be_atleast_2_runs_sp);
        }
        final SubLObject tuples = kbq_generate_sorted_tuples_for_property_comparison_for_runs(runs, property, sort_by);
        return generate_unconnected_lines_graph(tuples, plot_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 9636L)
    public static SubLObject kbq_generate_sorted_properties_comparison(final SubLObject query_set_run, final SubLObject v_properties, SubLObject plot_properties, SubLObject sort_by, SubLObject display) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        if (sort_by == plot_generation.UNPROVIDED) {
            sort_by = (SubLObject)plot_generation.$kw10$ALL;
        }
        if (display == plot_generation.UNPROVIDED) {
            display = (SubLObject)plot_generation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (plot_generation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sort_by != plot_generation.$kw10$ALL && plot_generation.NIL == conses_high.member(sort_by, v_properties, (SubLObject)plot_generation.UNPROVIDED, (SubLObject)plot_generation.UNPROVIDED)) {
            Errors.error((SubLObject)plot_generation.$str6$Invalid_sort_by_parameter_);
        }
        final SubLObject data_filename = kbq_save_properties_comparison_datafile(query_set_run, v_properties, plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        save_sorted_properties_comparison_plot_file(plot_filename, data_filename, plot_properties, sort_by, v_properties);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 10272L)
    public static SubLObject kbq_generate_sorted_property_display(final SubLObject query_set_run, final SubLObject property, SubLObject classifications, SubLObject plot_properties, SubLObject display) {
        if (classifications == plot_generation.UNPROVIDED) {
            classifications = (SubLObject)plot_generation.NIL;
        }
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        if (display == plot_generation.UNPROVIDED) {
            display = (SubLObject)plot_generation.NIL;
        }
        if (plot_generation.NIL == classifications) {
            classifications = (SubLObject)ConsesLow.list(Symbols.symbol_function((SubLObject)plot_generation.$sym11$TRUE));
        }
        final SubLObject data_filename = kbq_save_property_classification_datafile(query_set_run, property, classifications, plot_properties);
        final SubLObject plot_filename = plot_program_full_filename_from_properties(plot_properties);
        save_sorted_property_display_plot_file(plot_filename, data_filename, plot_properties, classifications);
        return possibly_display_saved_plot(plot_filename, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 10875L)
    public static SubLObject kbq_generate_answerable_vs_unanswerable_comparison(final SubLObject query_set_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_pred) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        if (sort_pred == plot_generation.UNPROVIDED) {
            sort_pred = Symbols.symbol_function((SubLObject)plot_generation.$sym12$SAFE__);
        }
        final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(query_set_run);
        final SubLObject unanswerable = kbq_query_run.kbq_unanswerable_query_set_run(query_set_run);
        return kbq_generate_answerable_vs_unanswerable_comparison_int(answerable, unanswerable, property, plot_properties, sort_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 11323L)
    public static SubLObject kbq_generate_answerable_vs_unanswerable_comparison_int(final SubLObject answerable, final SubLObject unanswerable, final SubLObject property, SubLObject plot_properties, final SubLObject sort_pred) {
        final SubLObject current;
        final SubLObject datum = current = plot_properties;
        final SubLObject scaleP_tail = cdestructuring_bind.property_list_member((SubLObject)plot_generation.$kw13$SCALE_, current);
        final SubLObject scaleP = (SubLObject)((plot_generation.NIL != scaleP_tail) ? conses_high.cadr(scaleP_tail) : plot_generation.T);
        final SubLObject answerable_values = kbq_query_run.kbq_extract_property_values(answerable, property, (SubLObject)plot_generation.UNPROVIDED);
        final SubLObject unanswerable_values = kbq_query_run.kbq_extract_property_values(unanswerable, property, (SubLObject)plot_generation.UNPROVIDED);
        final SubLObject values_list = (SubLObject)ConsesLow.list(answerable_values, unanswerable_values);
        final SubLObject scaled_values_list = (plot_generation.NIL != scaleP) ? scale_lengths(values_list) : values_list;
        SubLObject current_$2;
        final SubLObject datum_$1 = current_$2 = scaled_values_list;
        SubLObject scaled_answerable_values = (SubLObject)plot_generation.NIL;
        SubLObject scaled_unanswerable_values = (SubLObject)plot_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)plot_generation.$list14);
        scaled_answerable_values = current_$2.first();
        current_$2 = current_$2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)plot_generation.$list14);
        scaled_unanswerable_values = current_$2.first();
        current_$2 = current_$2.rest();
        if (plot_generation.NIL == current_$2) {
            final SubLObject scaled_sorted_answerable_values = Sort.sort(scaled_answerable_values, sort_pred, (SubLObject)plot_generation.UNPROVIDED);
            final SubLObject scaled_sorted_unanswerable_values = Sort.sort(scaled_unanswerable_values, sort_pred, (SubLObject)plot_generation.UNPROVIDED);
            final SubLObject answerable_coords = coordinatify(scaled_sorted_answerable_values);
            final SubLObject unanswerable_coords = coordinatify(scaled_sorted_unanswerable_values);
            final SubLObject coordinates_list = equalize_lengths((SubLObject)ConsesLow.list(unanswerable_coords, answerable_coords));
            if (plot_generation.NIL == conses_high.getf(plot_properties, (SubLObject)plot_generation.$kw2$LINE_LABELS, (SubLObject)plot_generation.UNPROVIDED)) {
                plot_properties = conses_high.copy_list(plot_properties);
                plot_properties = conses_high.putf(plot_properties, (SubLObject)plot_generation.$kw2$LINE_LABELS, (SubLObject)plot_generation.$list15);
            }
            return generate_lines_graph(coordinates_list, plot_properties);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)plot_generation.$list14);
        return (SubLObject)plot_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 12645L)
    public static SubLObject kbq_generate_answerability_prediction_display(final SubLObject query_set_run, final SubLObject oracle_query_set_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_pred) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        if (sort_pred == plot_generation.UNPROVIDED) {
            sort_pred = Symbols.symbol_function((SubLObject)plot_generation.$sym12$SAFE__);
        }
        final SubLObject oracle_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(oracle_query_set_run));
        final SubLObject unanswerable = kbq_query_run.kbq_unanswerable_query_set_run(query_set_run);
        final SubLObject timed_out = kbq_query_run.kbq_filter_query_set_run_by_test(unanswerable, (SubLObject)plot_generation.$str16$timed_out, (SubLObject)plot_generation.$sym17$KBQ_QUERY_RUN_TIMED_OUT_, (SubLObject)plot_generation.UNPROVIDED);
        final SubLObject answerable_timed_out = kbq_query_run.kbq_filter_query_set_run_to_queries(timed_out, oracle_queries, (SubLObject)plot_generation.NIL);
        final SubLObject unanswerable_timed_out = kbq_query_run.kbq_filter_query_set_run_to_queries(timed_out, oracle_queries, (SubLObject)plot_generation.T);
        if (plot_generation.NIL == kbq_query_run.kbq_query_set_run_query_runs(answerable_timed_out)) {
            Errors.warn((SubLObject)plot_generation.$str18$No_oracularly_answerable_timed_ou);
            return (SubLObject)plot_generation.NIL;
        }
        return kbq_generate_answerable_vs_unanswerable_comparison_int(answerable_timed_out, unanswerable_timed_out, property, plot_properties, sort_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 13971L)
    public static SubLObject generate_inference_answer_image(final SubLObject inference, final SubLObject outfile, SubLObject plot_properties) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        final SubLObject data_filename = (SubLObject)plot_generation.$str19$_tmp_inference_answer_timeline_da;
        final SubLObject plot_filename = (SubLObject)plot_generation.$str20$_tmp_inference_answer_timeline_pl;
        inference_save_answer_timeline_datafile(inference, data_filename);
        save_inference_answer_plot_file(plot_filename, data_filename, plot_properties, outfile, inference);
        return save_plot_as_image(plot_filename, outfile);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 14756L)
    public static SubLObject kbq_save_property_comparison_datafile(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        final SubLObject tuples = kbq_generate_tuples_for_property_comparison(baseline_run, experiment_run, property);
        final SubLObject comments = comments_for_property_comparison_datafile(plot_properties, property);
        return save_property_comparison_datafile(tuples, plot_properties, comments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 15240L)
    public static SubLObject save_property_comparison_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments) {
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        final SubLObject ranked_tuples = list_utilities.rank_tuples(tuples);
        return save_plot_datafile(data_filename, ranked_tuples, comments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 15518L)
    public static SubLObject kbq_generate_tuples_for_property_comparison(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property) {
        SubLObject tuples = (SubLObject)plot_generation.NIL;
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(baseline_run);
        SubLObject baseline_query_run = (SubLObject)plot_generation.NIL;
        baseline_query_run = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run.kbq_query_run_query(baseline_query_run);
            final SubLObject experiment_query_run = kbq_query_run.kbq_lookup_query_run(experiment_run, query);
            final SubLObject baseline_value = kbq_query_run.kbq_query_run_property_value(baseline_query_run, property, (SubLObject)plot_generation.UNPROVIDED);
            final SubLObject experiment_value = kbq_query_run.kbq_query_run_property_value(experiment_query_run, property, (SubLObject)plot_generation.UNPROVIDED);
            if (plot_generation.NIL != baseline_value && plot_generation.NIL != experiment_value) {
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(baseline_value, experiment_value), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            baseline_query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 16347L)
    public static SubLObject kbq_generate_tuples_for_property_comparison_for_runs(final SubLObject runs, final SubLObject property) {
        SubLObject tuples = (SubLObject)plot_generation.NIL;
        final SubLObject first_run = runs.first();
        final SubLObject queries = kbq_query_run.kbq_extract_property_values(first_run, (SubLObject)plot_generation.$kw21$QUERY, (SubLObject)plot_generation.UNPROVIDED);
        SubLObject count = (SubLObject)plot_generation.ZERO_INTEGER;
        SubLObject query_run = (SubLObject)plot_generation.NIL;
        SubLObject value = (SubLObject)plot_generation.NIL;
        SubLObject tuple = (SubLObject)plot_generation.NIL;
        SubLObject cdolist_list_var = queries;
        SubLObject query = (SubLObject)plot_generation.NIL;
        query = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            query_run = kbq_query_run.kbq_lookup_query_run(first_run, query);
            value = kbq_query_run.kbq_query_run_property_value(query_run, property, (SubLObject)plot_generation.UNPROVIDED);
            if (plot_generation.NIL != value) {
                tuple = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(count, value), tuple);
            }
            count = Numbers.add(count, (SubLObject)plot_generation.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        tuples = (SubLObject)ConsesLow.cons(tuple, tuples);
        cdolist_list_var = runs.rest();
        SubLObject run = (SubLObject)plot_generation.NIL;
        run = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            count = (SubLObject)plot_generation.ZERO_INTEGER;
            SubLObject cdolist_list_var_$3 = queries;
            SubLObject query2 = (SubLObject)plot_generation.NIL;
            query2 = cdolist_list_var_$3.first();
            while (plot_generation.NIL != cdolist_list_var_$3) {
                query_run = kbq_query_run.kbq_lookup_query_run(run, query2);
                value = kbq_query_run.kbq_query_run_property_value(query_run, property, (SubLObject)plot_generation.UNPROVIDED);
                if (plot_generation.NIL != value) {
                    tuple = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(count, value), tuple);
                }
                count = Numbers.add(count, (SubLObject)plot_generation.ONE_INTEGER);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                query2 = cdolist_list_var_$3.first();
            }
            tuples = (SubLObject)ConsesLow.cons(tuple, tuples);
            cdolist_list_var = cdolist_list_var.rest();
            run = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 17350L)
    public static SubLObject kbq_generate_sorted_tuples_for_property_comparison_for_runs(final SubLObject runs, final SubLObject property, final SubLObject sort_by) {
        SubLObject tuples = (SubLObject)plot_generation.NIL;
        SubLObject first_query_runs = (SubLObject)plot_generation.NIL;
        SubLObject query_runs = (SubLObject)plot_generation.NIL;
        first_query_runs = kbq_query_run.kbq_sort_query_runs(runs.first(), property);
        SubLObject count = (SubLObject)plot_generation.ZERO_INTEGER;
        SubLObject value = (SubLObject)plot_generation.NIL;
        SubLObject tuple = (SubLObject)plot_generation.NIL;
        SubLObject cdolist_list_var = first_query_runs;
        SubLObject query_run = (SubLObject)plot_generation.NIL;
        query_run = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            value = kbq_query_run.kbq_query_run_property_value(query_run, property, (SubLObject)plot_generation.UNPROVIDED);
            if (plot_generation.NIL != value) {
                tuple = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(count, value), tuple);
            }
            count = Numbers.add(count, (SubLObject)plot_generation.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        tuples = (SubLObject)ConsesLow.cons(tuple, tuples);
        cdolist_list_var = runs.rest();
        SubLObject run = (SubLObject)plot_generation.NIL;
        run = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            count = (SubLObject)plot_generation.ZERO_INTEGER;
            if (sort_by.eql((SubLObject)plot_generation.$kw10$ALL)) {
                SubLObject cdolist_list_var_$4;
                query_runs = (cdolist_list_var_$4 = kbq_query_run.kbq_sort_query_runs(run, property));
                SubLObject query_run2 = (SubLObject)plot_generation.NIL;
                query_run2 = cdolist_list_var_$4.first();
                while (plot_generation.NIL != cdolist_list_var_$4) {
                    value = kbq_query_run.kbq_query_run_property_value(query_run2, property, (SubLObject)plot_generation.UNPROVIDED);
                    if (plot_generation.NIL != value) {
                        tuple = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(count, value), tuple);
                    }
                    count = Numbers.add(count, (SubLObject)plot_generation.ONE_INTEGER);
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    query_run2 = cdolist_list_var_$4.first();
                }
            }
            else if (sort_by.eql((SubLObject)plot_generation.$kw7$FIRST)) {
                SubLObject cdolist_list_var_$5 = first_query_runs;
                SubLObject query_run2 = (SubLObject)plot_generation.NIL;
                query_run2 = cdolist_list_var_$5.first();
                while (plot_generation.NIL != cdolist_list_var_$5) {
                    final SubLObject c_query_run = kbq_query_run.kbq_lookup_query_run(run, kbq_query_run.kbq_query_run_property_value(query_run2, (SubLObject)plot_generation.$kw21$QUERY, (SubLObject)plot_generation.UNPROVIDED));
                    value = kbq_query_run.kbq_query_run_property_value(c_query_run, property, (SubLObject)plot_generation.UNPROVIDED);
                    if (plot_generation.NIL != value) {
                        tuple = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(count, value), tuple);
                    }
                    count = Numbers.add(count, (SubLObject)plot_generation.ONE_INTEGER);
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    query_run2 = cdolist_list_var_$5.first();
                }
            }
            tuples = (SubLObject)ConsesLow.cons(tuple, tuples);
            cdolist_list_var = cdolist_list_var.rest();
            run = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 18700L)
    public static SubLObject comments_for_property_comparison_datafile(final SubLObject plot_properties, final SubLObject property) {
        final SubLObject baseline_name_tail = cdestructuring_bind.property_list_member((SubLObject)plot_generation.$kw22$BASELINE_NAME, plot_properties);
        final SubLObject baseline_name = (SubLObject)((plot_generation.NIL != baseline_name_tail) ? conses_high.cadr(baseline_name_tail) : plot_generation.$str23$baseline);
        final SubLObject experiment_name_tail = cdestructuring_bind.property_list_member((SubLObject)plot_generation.$kw24$EXPERIMENT_NAME, plot_properties);
        final SubLObject experiment_name = (SubLObject)((plot_generation.NIL != experiment_name_tail) ? conses_high.cadr(experiment_name_tail) : plot_generation.$str25$experiment);
        final SubLObject comment1 = Sequences.cconcatenate((SubLObject)plot_generation.$str26$baseline_____, format_nil.format_nil_a_no_copy(baseline_name));
        final SubLObject comment2 = Sequences.cconcatenate((SubLObject)plot_generation.$str27$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
        final SubLObject comment3 = Sequences.cconcatenate((SubLObject)plot_generation.$str28$property_____, format_nil.format_nil_s_no_copy(property));
        final SubLObject comments = (SubLObject)ConsesLow.list(comment1, comment2, comment3);
        return comments;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 19201L)
    public static SubLObject kbq_save_properties_comparison_datafile(final SubLObject query_set_run, final SubLObject v_properties, final SubLObject plot_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (plot_generation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && plot_generation.NIL == list_utilities.lengthLE(v_properties, (SubLObject)plot_generation.TEN_INTEGER, (SubLObject)plot_generation.UNPROVIDED)) {
            Errors.error((SubLObject)plot_generation.$str29$Cannot_handle_more_than_10_proper, v_properties);
        }
        final SubLObject tuples = kbq_generate_tuples_for_properties_comparison(query_set_run, v_properties);
        final SubLObject comments = comments_for_properties_comparison_datafile(plot_properties, v_properties);
        return save_properties_comparison_datafile(tuples, plot_properties, comments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 19680L)
    public static SubLObject save_properties_comparison_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments) {
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        final SubLObject ranked_tuples = list_utilities.rank_tuples(tuples);
        return save_plot_datafile(data_filename, ranked_tuples, comments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 19960L)
    public static SubLObject kbq_generate_tuples_for_properties_comparison(final SubLObject query_set_run, final SubLObject v_properties) {
        SubLObject tuples = (SubLObject)plot_generation.NIL;
        SubLObject cdolist_list_var;
        final SubLObject query_runs = cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)plot_generation.NIL;
        query_run = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            SubLObject tuple = (SubLObject)plot_generation.NIL;
            SubLObject cdolist_list_var_$6 = v_properties;
            SubLObject property = (SubLObject)plot_generation.NIL;
            property = cdolist_list_var_$6.first();
            while (plot_generation.NIL != cdolist_list_var_$6) {
                final SubLObject property_value = kbq_query_run.kbq_query_run_property_value(query_run, property, (SubLObject)plot_generation.UNPROVIDED);
                tuple = (SubLObject)ConsesLow.cons(property_value, tuple);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                property = cdolist_list_var_$6.first();
            }
            if (plot_generation.NIL == list_utilities.member_if_not(Symbols.symbol_function((SubLObject)plot_generation.$sym30$NUMBERP), tuple, (SubLObject)plot_generation.UNPROVIDED)) {
                tuples = (SubLObject)ConsesLow.cons(Sequences.nreverse(tuple), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 20631L)
    public static SubLObject comments_for_properties_comparison_datafile(final SubLObject plot_properties, final SubLObject v_properties) {
        final SubLObject experiment_name_tail = cdestructuring_bind.property_list_member((SubLObject)plot_generation.$kw24$EXPERIMENT_NAME, plot_properties);
        final SubLObject experiment_name = (SubLObject)((plot_generation.NIL != experiment_name_tail) ? conses_high.cadr(experiment_name_tail) : plot_generation.$str25$experiment);
        final SubLObject comment1 = Sequences.cconcatenate((SubLObject)plot_generation.$str27$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
        final SubLObject comment2 = Sequences.cconcatenate((SubLObject)plot_generation.$str31$properties___, format_nil.format_nil_s_no_copy(v_properties));
        final SubLObject comments = (SubLObject)ConsesLow.list(comment1, comment2);
        return comments;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 21033L)
    public static SubLObject kbq_save_property_classification_datafile(final SubLObject query_set_run, final SubLObject property, final SubLObject classifications, SubLObject plot_properties) {
        if (plot_properties == plot_generation.UNPROVIDED) {
            plot_properties = (SubLObject)plot_generation.NIL;
        }
        final SubLObject tuples = kbq_generate_tuples_for_property_classification(query_set_run, property);
        final SubLObject comments = comments_for_property_classification_datafile(plot_properties, property);
        return save_property_classification_datafile(tuples, plot_properties, comments, classifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 21469L)
    public static SubLObject save_property_classification_datafile(final SubLObject tuples, final SubLObject plot_properties, final SubLObject comments, final SubLObject classifications) {
        final SubLObject data_filename = plot_data_full_filename_from_properties(plot_properties);
        final SubLObject ranked_and_classified_tuples = rank_and_classify_property_classification_tuples(tuples, classifications);
        return save_plot_datafile(data_filename, ranked_and_classified_tuples, comments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 21850L)
    public static SubLObject comments_for_property_classification_datafile(final SubLObject plot_properties, final SubLObject property) {
        final SubLObject experiment_name_tail = cdestructuring_bind.property_list_member((SubLObject)plot_generation.$kw24$EXPERIMENT_NAME, plot_properties);
        final SubLObject experiment_name = (SubLObject)((plot_generation.NIL != experiment_name_tail) ? conses_high.cadr(experiment_name_tail) : plot_generation.$str25$experiment);
        final SubLObject comment1 = Sequences.cconcatenate((SubLObject)plot_generation.$str27$experiment___, format_nil.format_nil_a_no_copy(experiment_name));
        final SubLObject comment2 = Sequences.cconcatenate((SubLObject)plot_generation.$str28$property_____, format_nil.format_nil_s_no_copy(property));
        final SubLObject comment3 = Sequences.copy_seq((SubLObject)plot_generation.$str32$classification_0);
        final SubLObject comments = (SubLObject)ConsesLow.list(comment1, comment2, comment3);
        return comments;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 22306L)
    public static SubLObject kbq_generate_tuples_for_property_classification(final SubLObject query_set_run, final SubLObject property) {
        SubLObject tuples = (SubLObject)plot_generation.NIL;
        SubLObject cdolist_list_var;
        final SubLObject query_runs = cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)plot_generation.NIL;
        query_run = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
            final SubLObject property_value = kbq_query_run.kbq_query_run_property_value(query_run, property, (SubLObject)plot_generation.UNPROVIDED);
            if (property_value.isNumber()) {
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query, property_value), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 22850L)
    public static SubLObject rank_and_classify_property_classification_tuples(final SubLObject tuples, final SubLObject classifications) {
        SubLObject classified_tuples = (SubLObject)plot_generation.NIL;
        final SubLObject sorted_tuples = Sort.stable_sort(conses_high.copy_list(tuples), Symbols.symbol_function((SubLObject)plot_generation.$sym33$_), Symbols.symbol_function((SubLObject)plot_generation.$sym34$SECOND));
        final SubLObject rank_dictionary = dictionary.new_dictionary((SubLObject)plot_generation.UNPROVIDED, (SubLObject)plot_generation.UNPROVIDED);
        SubLObject list_var = (SubLObject)plot_generation.NIL;
        SubLObject tuple = (SubLObject)plot_generation.NIL;
        SubLObject rank = (SubLObject)plot_generation.NIL;
        list_var = sorted_tuples;
        tuple = list_var.first();
        for (rank = (SubLObject)plot_generation.ZERO_INTEGER; plot_generation.NIL != list_var; list_var = list_var.rest(), tuple = list_var.first(), rank = Numbers.add((SubLObject)plot_generation.ONE_INTEGER, rank)) {
            dictionary.dictionary_enter(rank_dictionary, tuple, rank);
        }
        final SubLObject tuple_classes = list_utilities.categorize_list_elements(sorted_tuples, classifications, Symbols.symbol_function((SubLObject)plot_generation.$sym35$FIRST));
        SubLObject list_var2 = (SubLObject)plot_generation.NIL;
        SubLObject tuple_class = (SubLObject)plot_generation.NIL;
        SubLObject index = (SubLObject)plot_generation.NIL;
        list_var2 = tuple_classes;
        tuple_class = list_var2.first();
        for (index = (SubLObject)plot_generation.ZERO_INTEGER; plot_generation.NIL != list_var2; list_var2 = list_var2.rest(), tuple_class = list_var2.first(), index = Numbers.add((SubLObject)plot_generation.ONE_INTEGER, index)) {
            if (!index.isZero()) {
                final SubLObject classification_break = Sequences.cconcatenate((SubLObject)plot_generation.$str36$classification_, format_nil.format_nil_a_no_copy(index));
                classified_tuples = (SubLObject)ConsesLow.cons(classification_break, classified_tuples);
            }
            if (plot_generation.NIL == tuple_class) {
                Errors.warn((SubLObject)plot_generation.$str37$Classification__S_was_empty, index);
            }
            SubLObject cdolist_list_var = tuple_class;
            SubLObject tuple2 = (SubLObject)plot_generation.NIL;
            tuple2 = cdolist_list_var.first();
            while (plot_generation.NIL != cdolist_list_var) {
                final SubLObject rank2 = dictionary.dictionary_lookup(rank_dictionary, tuple2, (SubLObject)plot_generation.UNPROVIDED);
                SubLObject current;
                final SubLObject datum = current = tuple2;
                SubLObject element = (SubLObject)plot_generation.NIL;
                SubLObject value = (SubLObject)plot_generation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plot_generation.$list38);
                element = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plot_generation.$list38);
                value = current.first();
                current = current.rest();
                if (plot_generation.NIL == current) {
                    classified_tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rank2, value), classified_tuples);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)plot_generation.$list38);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tuple2 = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(classified_tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 24345L)
    public static SubLObject inference_save_answer_timeline_datafile(final SubLObject inference, final SubLObject data_filename) {
        final SubLObject tuples = inference_answer_elapsed_time_tuples(inference);
        return save_plot_datafile(data_filename, tuples, (SubLObject)plot_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 24580L)
    public static SubLObject inference_answer_elapsed_time_tuples(final SubLObject inference) {
        SubLObject tuples = (SubLObject)plot_generation.NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (plot_generation.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)plot_generation.$kw39$SKIP)) {
            final SubLObject idx_$7 = idx;
            if (plot_generation.NIL == id_index.id_index_dense_objects_empty_p(idx_$7, (SubLObject)plot_generation.$kw39$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$7);
                final SubLObject backwardP_var = (SubLObject)plot_generation.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject id_$8;
                SubLObject time;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)plot_generation.NIL, v_iteration = (SubLObject)plot_generation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)plot_generation.ONE_INTEGER)) {
                    id = ((plot_generation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)plot_generation.ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (plot_generation.NIL == id_index.id_index_tombstone_p(v_answer) || plot_generation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)plot_generation.$kw39$SKIP)) {
                        if (plot_generation.NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = (SubLObject)plot_generation.$kw39$SKIP;
                        }
                        id_$8 = inference_datastructures_inference.inference_answer_suid(v_answer);
                        time = inference_datastructures_inference.inference_answer_elapsed_time(v_answer, (SubLObject)plot_generation.NIL);
                        tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(time, id_$8), tuples);
                    }
                }
            }
            final SubLObject idx_$8 = idx;
            if (plot_generation.NIL == id_index.id_index_sparse_objects_empty_p(idx_$8) || plot_generation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)plot_generation.$kw39$SKIP)) {
                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$8);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$8);
                final SubLObject end_id = id_index.id_index_next_id(idx_$8);
                final SubLObject v_default = (SubLObject)((plot_generation.NIL != id_index.id_index_skip_tombstones_p((SubLObject)plot_generation.$kw39$SKIP)) ? plot_generation.NIL : plot_generation.$kw39$SKIP);
                while (id2.numL(end_id)) {
                    final SubLObject v_answer2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (plot_generation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)plot_generation.$kw39$SKIP) || plot_generation.NIL == id_index.id_index_tombstone_p(v_answer2)) {
                        final SubLObject id_$9 = inference_datastructures_inference.inference_answer_suid(v_answer2);
                        final SubLObject time2 = inference_datastructures_inference.inference_answer_elapsed_time(v_answer2, (SubLObject)plot_generation.NIL);
                        tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(time2, id_$9), tuples);
                    }
                    id2 = Numbers.add(id2, (SubLObject)plot_generation.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 28200L)
    public static SubLObject save_plot_datafile(final SubLObject data_filename, final SubLObject tuples, SubLObject comments) {
        if (comments == plot_generation.UNPROVIDED) {
            comments = (SubLObject)plot_generation.NIL;
        }
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 28439L)
    public static SubLObject kbq_property_coordinates(final SubLObject query_set_run, final SubLObject property) {
        SubLObject coords = (SubLObject)plot_generation.NIL;
        SubLObject list_var = (SubLObject)plot_generation.NIL;
        SubLObject query_run = (SubLObject)plot_generation.NIL;
        SubLObject i = (SubLObject)plot_generation.NIL;
        list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
        query_run = list_var.first();
        for (i = (SubLObject)plot_generation.ZERO_INTEGER; plot_generation.NIL != list_var; list_var = list_var.rest(), query_run = list_var.first(), i = Numbers.add((SubLObject)plot_generation.ONE_INTEGER, i)) {
            final SubLObject value = kbq_query_run.kbq_query_run_property_value(query_run, property, (SubLObject)plot_generation.UNPROVIDED);
            final SubLObject coord = (SubLObject)ConsesLow.list(i, value);
            coords = (SubLObject)ConsesLow.cons(coord, coords);
        }
        return Sequences.nreverse(coords);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 28764L)
    public static SubLObject coordinatify(final SubLObject values) {
        SubLObject coords = (SubLObject)plot_generation.NIL;
        SubLObject list_var = (SubLObject)plot_generation.NIL;
        SubLObject value = (SubLObject)plot_generation.NIL;
        SubLObject i = (SubLObject)plot_generation.NIL;
        list_var = values;
        value = list_var.first();
        for (i = (SubLObject)plot_generation.ZERO_INTEGER; plot_generation.NIL != list_var; list_var = list_var.rest(), value = list_var.first(), i = Numbers.add((SubLObject)plot_generation.ONE_INTEGER, i)) {
            coords = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(i, value), coords);
        }
        return Sequences.nreverse(coords);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 28931L)
    public static SubLObject equalize_lengths(final SubLObject coordinates_list) {
        SubLObject new_coordinates_list = (SubLObject)plot_generation.NIL;
        final SubLObject max_length = number_utilities.maximum(Mapping.mapcar(Symbols.symbol_function((SubLObject)plot_generation.$sym41$LENGTH), coordinates_list), (SubLObject)plot_generation.UNPROVIDED);
        SubLObject cdolist_list_var = coordinates_list;
        SubLObject coordinates = (SubLObject)plot_generation.NIL;
        coordinates = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            final SubLObject coordinates_vector = list_utilities.list2vector(coordinates);
            final SubLObject length = Sequences.length(coordinates_vector);
            SubLObject last_coord = (SubLObject)plot_generation.NIL;
            SubLObject new_coordinates = (SubLObject)plot_generation.NIL;
            SubLObject i;
            SubLObject coord;
            for (i = (SubLObject)plot_generation.NIL, i = (SubLObject)plot_generation.ZERO_INTEGER; i.numL(max_length); i = Numbers.add(i, (SubLObject)plot_generation.ONE_INTEGER)) {
                if (i.numL(length)) {
                    coord = Vectors.aref(coordinates_vector, i);
                    new_coordinates = (SubLObject)ConsesLow.cons(coord, new_coordinates);
                    last_coord = coord;
                }
                else {
                    new_coordinates = (SubLObject)ConsesLow.cons(last_coord, new_coordinates);
                }
            }
            new_coordinates_list = (SubLObject)ConsesLow.cons(Sequences.nreverse(new_coordinates), new_coordinates_list);
            cdolist_list_var = cdolist_list_var.rest();
            coordinates = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_coordinates_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 29600L)
    public static SubLObject scale_lengths(final SubLObject lists) {
        SubLObject new_lists = (SubLObject)plot_generation.NIL;
        final SubLObject max_length = number_utilities.maximum(Mapping.mapcar(Symbols.symbol_function((SubLObject)plot_generation.$sym41$LENGTH), lists), (SubLObject)plot_generation.UNPROVIDED);
        SubLObject cdolist_list_var = lists;
        SubLObject list = (SubLObject)plot_generation.NIL;
        list = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            final SubLObject scaling_factor = Numbers.round(Numbers.divide(max_length, Sequences.length(list)), (SubLObject)plot_generation.UNPROVIDED);
            if (scaling_factor.numG((SubLObject)plot_generation.ONE_INTEGER)) {
                SubLObject new_list = (SubLObject)plot_generation.NIL;
                SubLObject cdolist_list_var_$11 = list;
                SubLObject elem = (SubLObject)plot_generation.NIL;
                elem = cdolist_list_var_$11.first();
                while (plot_generation.NIL != cdolist_list_var_$11) {
                    SubLObject i;
                    for (i = (SubLObject)plot_generation.NIL, i = (SubLObject)plot_generation.ZERO_INTEGER; i.numL(scaling_factor); i = Numbers.add(i, (SubLObject)plot_generation.ONE_INTEGER)) {
                        new_list = (SubLObject)ConsesLow.cons(elem, new_list);
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    elem = cdolist_list_var_$11.first();
                }
                new_lists = (SubLObject)ConsesLow.cons(Sequences.nreverse(new_list), new_lists);
            }
            else {
                new_lists = (SubLObject)ConsesLow.cons(list, new_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            list = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 30090L)
    public static SubLObject save_lines_graph_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 30426L)
    public static SubLObject save_points_graph_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 30691L)
    public static SubLObject save_correlation_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 30932L)
    public static SubLObject save_property_correlation_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 31191L)
    public static SubLObject save_property_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject line_count) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 31470L)
    public static SubLObject save_sorted_property_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject sort_by) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 31757L)
    public static SubLObject save_sorted_properties_comparison_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject sort_by, final SubLObject v_properties) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 32070L)
    public static SubLObject save_sorted_property_display_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject classifications) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 32367L)
    public static SubLObject save_inference_answer_plot_file(final SubLObject plot_filename, final SubLObject data_filename, final SubLObject plot_properties, final SubLObject outfile, final SubLObject inference) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 32654L)
    public static SubLObject compute_key_location(final SubLObject coordinates) {
        SubLObject min_x = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject max_x = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject min_y = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject max_y = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject cdolist_list_var = coordinates;
        SubLObject coord = (SubLObject)plot_generation.NIL;
        coord = cdolist_list_var.first();
        while (plot_generation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = coord;
            SubLObject x = (SubLObject)plot_generation.NIL;
            SubLObject y = (SubLObject)plot_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plot_generation.$list42);
            x = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plot_generation.$list42);
            y = current.first();
            current = current.rest();
            if (plot_generation.NIL == current) {
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
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)plot_generation.$list42);
            }
            cdolist_list_var = cdolist_list_var.rest();
            coord = cdolist_list_var.first();
        }
        final SubLObject total_x = Numbers.subtract(max_x, min_x);
        final SubLObject x_location = Numbers.add(min_x, Numbers.multiply((SubLObject)plot_generation.$float43$0_3, total_x));
        final SubLObject total_y = Numbers.subtract(max_y, min_y);
        final SubLObject y_location = Numbers.add(max_y, Numbers.multiply((SubLObject)plot_generation.$float44$0_0, total_y));
        return (SubLObject)ConsesLow.list(x_location, y_location);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 33437L)
    public static SubLObject compute_key_location_from_tuples(final SubLObject tuples) {
        SubLObject coordinates = (SubLObject)plot_generation.NIL;
        SubLObject list_var = (SubLObject)plot_generation.NIL;
        SubLObject tuple = (SubLObject)plot_generation.NIL;
        SubLObject i = (SubLObject)plot_generation.NIL;
        list_var = tuples;
        tuple = list_var.first();
        for (i = (SubLObject)plot_generation.ZERO_INTEGER; plot_generation.NIL != list_var; list_var = list_var.rest(), tuple = list_var.first(), i = Numbers.add((SubLObject)plot_generation.ONE_INTEGER, i)) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject who_cares = (SubLObject)plot_generation.NIL;
            SubLObject value = (SubLObject)plot_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plot_generation.$list45);
            who_cares = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plot_generation.$list45);
            value = current.first();
            current = current.rest();
            if (plot_generation.NIL == current) {
                coordinates = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(i, value), coordinates);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)plot_generation.$list45);
            }
        }
        return compute_key_location(Sequences.nreverse(coordinates));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 33814L)
    public static SubLObject plot_properties_name(final SubLObject plot_properties) {
        return conses_high.getf(plot_properties, (SubLObject)plot_generation.$kw47$PLOT_NAME, plot_generation.$default_plot_name$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 33933L)
    public static SubLObject plot_properties_display(final SubLObject plot_properties) {
        return conses_high.getf(plot_properties, (SubLObject)plot_generation.$kw48$DISPLAY, (SubLObject)plot_generation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34084L)
    public static SubLObject plot_full_filename(final SubLObject filename, final SubLObject extension, SubLObject directory) {
        if (directory == plot_generation.UNPROVIDED) {
            directory = plot_generation.$plot_directory$.getGlobalValue();
        }
        return Sequences.cconcatenate(directory, new SubLObject[] { filename, plot_generation.$str50$_, extension });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34327L)
    public static SubLObject plot_data_full_filename(final SubLObject filename) {
        return plot_full_filename(filename, (SubLObject)plot_generation.$str51$dat, (SubLObject)plot_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34423L)
    public static SubLObject plot_data_full_filename_from_properties(final SubLObject plot_properties) {
        final SubLObject plot_name = plot_properties_name(plot_properties);
        return plot_data_full_filename(plot_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34606L)
    public static SubLObject plot_program_full_filename(final SubLObject filename) {
        return plot_full_filename(filename, (SubLObject)plot_generation.$str46$plot, (SubLObject)plot_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34706L)
    public static SubLObject plot_program_full_filename_from_properties(final SubLObject plot_properties) {
        final SubLObject plot_name = plot_properties_name(plot_properties);
        return plot_program_full_filename(plot_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 34895L)
    public static SubLObject possibly_display_saved_plot(final SubLObject plot_filename, final SubLObject display) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35094L)
    public static SubLObject save_plot_as_image(final SubLObject plot_filename, final SubLObject outfile) {
        final SubLObject full_output_filename = append_proper_plot_image_extension(outfile);
        return (SubLObject)((plot_generation.NIL != save_plot_as_image_successfulP(plot_filename)) ? full_output_filename : plot_generation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35400L)
    public static SubLObject save_plot_as_image_successfulP(final SubLObject plot_filename) {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35636L)
    public static SubLObject plot_image_format() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject image_format = plot_image_format_and_extension();
        final SubLObject extension = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return image_format;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35811L)
    public static SubLObject append_proper_plot_image_extension(final SubLObject outfile) {
        final SubLObject extension = plot_image_extension();
        return Sequences.cconcatenate(outfile, extension);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 35965L)
    public static SubLObject plot_image_extension() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject image_format = plot_image_format_and_extension();
        final SubLObject extension = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return extension;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 36143L)
    public static SubLObject plot_image_format_and_extension() {
        return plot_unavailable_warning();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 36307L)
    public static SubLObject plotting_availableP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(plot_generation.NIL != Processes.external_processes_supportedP() && plot_generation.NIL != gnuplot_availableP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 36421L)
    public static SubLObject gnuplot_availableP() {
        return (SubLObject)plot_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plot-generation.lisp", position = 36540L)
    public static SubLObject plot_unavailable_warning() {
        return Errors.warn((SubLObject)plot_generation.$str52$External_plotting_not_enabled_in_);
    }
    
    public static SubLObject declare_plot_generation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "generate_line_graph", "GENERATE-LINE-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "generate_line_graph_from_values", "GENERATE-LINE-GRAPH-FROM-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "generate_lines_graph", "GENERATE-LINES-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "generate_unconnected_lines_graph", "GENERATE-UNCONNECTED-LINES-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "generate_points_graph", "GENERATE-POINTS-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "generate_correlation_plot", "GENERATE-CORRELATION-PLOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "generate_lines_graph_from_values_list", "GENERATE-LINES-GRAPH-FROM-VALUES-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_property_correlation_plot", "KBQ-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_properties_correlation_plot", "KBQ-GENERATE-PROPERTIES-CORRELATION-PLOT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_sorted_property_comparison", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_sorted_property_comparison_for_runs", "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON-FOR-RUNS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_sorted_properties_comparison", "KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_sorted_property_display", "KBQ-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_answerable_vs_unanswerable_comparison", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_answerable_vs_unanswerable_comparison_int", "KBQ-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_answerability_prediction_display", "KBQ-GENERATE-ANSWERABILITY-PREDICTION-DISPLAY", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "generate_inference_answer_image", "GENERATE-INFERENCE-ANSWER-IMAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_save_property_comparison_datafile", "KBQ-SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_property_comparison_datafile", "SAVE-PROPERTY-COMPARISON-DATAFILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_tuples_for_property_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_sorted_tuples_for_property_comparison_for_runs", "KBQ-GENERATE-SORTED-TUPLES-FOR-PROPERTY-COMPARISON-FOR-RUNS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "comments_for_property_comparison_datafile", "COMMENTS-FOR-PROPERTY-COMPARISON-DATAFILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_save_properties_comparison_datafile", "KBQ-SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_properties_comparison_datafile", "SAVE-PROPERTIES-COMPARISON-DATAFILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_tuples_for_properties_comparison", "KBQ-GENERATE-TUPLES-FOR-PROPERTIES-COMPARISON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "comments_for_properties_comparison_datafile", "COMMENTS-FOR-PROPERTIES-COMPARISON-DATAFILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_save_property_classification_datafile", "KBQ-SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_property_classification_datafile", "SAVE-PROPERTY-CLASSIFICATION-DATAFILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "comments_for_property_classification_datafile", "COMMENTS-FOR-PROPERTY-CLASSIFICATION-DATAFILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_generate_tuples_for_property_classification", "KBQ-GENERATE-TUPLES-FOR-PROPERTY-CLASSIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "rank_and_classify_property_classification_tuples", "RANK-AND-CLASSIFY-PROPERTY-CLASSIFICATION-TUPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "inference_save_answer_timeline_datafile", "INFERENCE-SAVE-ANSWER-TIMELINE-DATAFILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "inference_answer_elapsed_time_tuples", "INFERENCE-ANSWER-ELAPSED-TIME-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_plot_datafile", "SAVE-PLOT-DATAFILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "kbq_property_coordinates", "KBQ-PROPERTY-COORDINATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "coordinatify", "COORDINATIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "equalize_lengths", "EQUALIZE-LENGTHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "scale_lengths", "SCALE-LENGTHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_lines_graph_plot_file", "SAVE-LINES-GRAPH-PLOT-FILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_points_graph_plot_file", "SAVE-POINTS-GRAPH-PLOT-FILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_correlation_plot_file", "SAVE-CORRELATION-PLOT-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_property_correlation_plot_file", "SAVE-PROPERTY-CORRELATION-PLOT-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_property_comparison_plot_file", "SAVE-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_sorted_property_comparison_plot_file", "SAVE-SORTED-PROPERTY-COMPARISON-PLOT-FILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_sorted_properties_comparison_plot_file", "SAVE-SORTED-PROPERTIES-COMPARISON-PLOT-FILE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_sorted_property_display_plot_file", "SAVE-SORTED-PROPERTY-DISPLAY-PLOT-FILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_inference_answer_plot_file", "SAVE-INFERENCE-ANSWER-PLOT-FILE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "compute_key_location", "COMPUTE-KEY-LOCATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "compute_key_location_from_tuples", "COMPUTE-KEY-LOCATION-FROM-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_properties_name", "PLOT-PROPERTIES-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_properties_display", "PLOT-PROPERTIES-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_full_filename", "PLOT-FULL-FILENAME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_data_full_filename", "PLOT-DATA-FULL-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_data_full_filename_from_properties", "PLOT-DATA-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_program_full_filename", "PLOT-PROGRAM-FULL-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_program_full_filename_from_properties", "PLOT-PROGRAM-FULL-FILENAME-FROM-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "possibly_display_saved_plot", "POSSIBLY-DISPLAY-SAVED-PLOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_plot_as_image", "SAVE-PLOT-AS-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "save_plot_as_image_successfulP", "SAVE-PLOT-AS-IMAGE-SUCCESSFUL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_image_format", "PLOT-IMAGE-FORMAT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "append_proper_plot_image_extension", "APPEND-PROPER-PLOT-IMAGE-EXTENSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_image_extension", "PLOT-IMAGE-EXTENSION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_image_format_and_extension", "PLOT-IMAGE-FORMAT-AND-EXTENSION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plotting_availableP", "PLOTTING-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "gnuplot_availableP", "GNUPLOT-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plot_generation", "plot_unavailable_warning", "PLOT-UNAVAILABLE-WARNING", 0, 0, false);
        return (SubLObject)plot_generation.NIL;
    }
    
    public static SubLObject init_plot_generation_file() {
        plot_generation.$infn_count_data_dir$ = SubLFiles.deflexical("*INFN-COUNT-DATA-DIR*", (SubLObject)plot_generation.$str40$_cyc_top_data_kb_stats_);
        plot_generation.$default_plot_name$ = SubLFiles.deflexical("*DEFAULT-PLOT-NAME*", (SubLObject)plot_generation.$str46$plot);
        plot_generation.$plot_directory$ = SubLFiles.deflexical("*PLOT-DIRECTORY*", (SubLObject)plot_generation.$str49$_tmp_);
        return (SubLObject)plot_generation.NIL;
    }
    
    public static SubLObject setup_plot_generation_file() {
        generic_testing.define_test_case_table_int((SubLObject)plot_generation.$sym53$RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES, (SubLObject)ConsesLow.list(new SubLObject[] { plot_generation.$kw54$TEST, plot_generation.NIL, plot_generation.$kw55$OWNER, plot_generation.NIL, plot_generation.$kw56$CLASSES, plot_generation.NIL, plot_generation.$kw57$KB, plot_generation.$kw58$TINY, plot_generation.$kw59$WORKING_, plot_generation.T }), (SubLObject)plot_generation.$list60);
        return (SubLObject)plot_generation.NIL;
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
    
    static {
        me = (SubLFile)new plot_generation();
        plot_generation.$infn_count_data_dir$ = null;
        plot_generation.$default_plot_name$ = null;
        plot_generation.$plot_directory$ = null;
        $kw0$LINE_LABEL = SubLObjectFactory.makeKeyword("LINE-LABEL");
        $str1$ = SubLObjectFactory.makeString("");
        $kw2$LINE_LABELS = SubLObjectFactory.makeKeyword("LINE-LABELS");
        $sym3$COORDINATIFY = SubLObjectFactory.makeSymbol("COORDINATIFY");
        $kw4$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("BASELINE"), (SubLObject)SubLObjectFactory.makeKeyword("EXPERIMENT"));
        $str6$Invalid_sort_by_parameter_ = SubLObjectFactory.makeString("Invalid sort-by parameter.");
        $kw7$FIRST = SubLObjectFactory.makeKeyword("FIRST");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("FIRST"));
        $str9$There_should_be_atleast_2_runs_sp = SubLObjectFactory.makeString("There should be atleast 2 runs specified");
        $kw10$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym11$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym12$SAFE__ = SubLObjectFactory.makeSymbol("SAFE-<");
        $kw13$SCALE_ = SubLObjectFactory.makeKeyword("SCALE?");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCALED-ANSWERABLE-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("SCALED-UNANSWERABLE-VALUES"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unanswerable"), (SubLObject)SubLObjectFactory.makeString("answerable"));
        $str16$timed_out = SubLObjectFactory.makeString("timed out");
        $sym17$KBQ_QUERY_RUN_TIMED_OUT_ = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-TIMED-OUT?");
        $str18$No_oracularly_answerable_timed_ou = SubLObjectFactory.makeString("No oracularly answerable timed-out queries");
        $str19$_tmp_inference_answer_timeline_da = SubLObjectFactory.makeString("/tmp/inference_answer_timeline.data");
        $str20$_tmp_inference_answer_timeline_pl = SubLObjectFactory.makeString("/tmp/inference_answer_timeline.plot");
        $kw21$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw22$BASELINE_NAME = SubLObjectFactory.makeKeyword("BASELINE-NAME");
        $str23$baseline = SubLObjectFactory.makeString("baseline");
        $kw24$EXPERIMENT_NAME = SubLObjectFactory.makeKeyword("EXPERIMENT-NAME");
        $str25$experiment = SubLObjectFactory.makeString("experiment");
        $str26$baseline_____ = SubLObjectFactory.makeString("baseline   = ");
        $str27$experiment___ = SubLObjectFactory.makeString("experiment = ");
        $str28$property_____ = SubLObjectFactory.makeString("property   = ");
        $str29$Cannot_handle_more_than_10_proper = SubLObjectFactory.makeString("Cannot handle more than 10 properties, got ~s");
        $sym30$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $str31$properties___ = SubLObjectFactory.makeString("properties = ");
        $str32$classification_0 = SubLObjectFactory.makeString("classification 0");
        $sym33$_ = SubLObjectFactory.makeSymbol("<");
        $sym34$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym35$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str36$classification_ = SubLObjectFactory.makeString("classification ");
        $str37$Classification__S_was_empty = SubLObjectFactory.makeString("Classification ~S was empty");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $kw39$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str40$_cyc_top_data_kb_stats_ = SubLObjectFactory.makeString("/cyc/top/data/kb-stats/");
        $sym41$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeSymbol("Y"));
        $float43$0_3 = (SubLFloat)SubLObjectFactory.makeDouble(0.3);
        $float44$0_0 = (SubLFloat)SubLObjectFactory.makeDouble(0.0);
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHO-CARES"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str46$plot = SubLObjectFactory.makeString("plot");
        $kw47$PLOT_NAME = SubLObjectFactory.makeKeyword("PLOT-NAME");
        $kw48$DISPLAY = SubLObjectFactory.makeKeyword("DISPLAY");
        $str49$_tmp_ = SubLObjectFactory.makeString("/tmp/");
        $str50$_ = SubLObjectFactory.makeString(".");
        $str51$dat = SubLObjectFactory.makeString("dat");
        $str52$External_plotting_not_enabled_in_ = SubLObjectFactory.makeString("External plotting not enabled in this image");
        $sym53$RANK_AND_CLASSIFY_PROPERTY_CLASSIFICATION_TUPLES = SubLObjectFactory.makeSymbol("RANK-AND-CLASSIFY-PROPERTY-CLASSIFICATION-TUPLES");
        $kw54$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw55$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw56$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw57$KB = SubLObjectFactory.makeKeyword("KB");
        $kw58$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw59$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)plot_generation.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.4)), (SubLObject)ConsesLow.list((SubLObject)plot_generation.MINUS_ONE_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.7)), (SubLObject)ConsesLow.list((SubLObject)plot_generation.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.3)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(-2), (SubLObject)SubLObjectFactory.makeDouble(0.1))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLUSP"), (SubLObject)SubLObjectFactory.makeSymbol("MINUSP"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)plot_generation.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.3)), (SubLObject)ConsesLow.list((SubLObject)plot_generation.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.4)), (SubLObject)SubLObjectFactory.makeString("classification 1"), (SubLObject)ConsesLow.list((SubLObject)plot_generation.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.1)), (SubLObject)ConsesLow.list((SubLObject)plot_generation.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.7)))));
    }
}

/*

	Total time: 229 ms
	
*/