/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYCLIFIER-TESTING
 *  source file: /cyc/top/cycl/cyclifier-testing.lisp
 *  created:     2019/07/03 17:38:55
 */
public final class cyclifier_testing extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyclifier_testing() {
    }

    public static final SubLFile me = new cyclifier_testing();

    public static final String myName = "com.cyc.cycjava.cycl.cyclifier_testing";

    // // Definitions
    public static final class $cyclify_result_stats_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyclifier_testing.$cyclify_result_stats_native.structDecl;
        }

        public SubLObject getField2() {
            return $sentence_count;
        }

        public SubLObject getField3() {
            return $literal_counts;
        }

        public SubLObject getField4() {
            return $parse_counts;
        }

        public SubLObject getField5() {
            return $unparsed_counts;
        }

        public SubLObject setField2(SubLObject value) {
            return $sentence_count = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $literal_counts = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $parse_counts = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $unparsed_counts = value;
        }

        public SubLObject $sentence_count = Lisp.NIL;

        public SubLObject $literal_counts = Lisp.NIL;

        public SubLObject $parse_counts = Lisp.NIL;

        public SubLObject $unparsed_counts = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyclifier_testing.$cyclify_result_stats_native.class, CYCLIFY_RESULT_STATS, CYCLIFY_RESULT_STATS_P, $list_alt2, $list_alt3, new String[]{ "$sentence_count", "$literal_counts", "$parse_counts", "$unparsed_counts" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_cyclify_result_stats$ = makeSymbol("*DTP-CYCLIFY-RESULT-STATS*");

    public static final SubLObject cyclify_result_stats_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cyclify_result_stats_p(SubLObject v_object) {
        return v_object.getClass() == cyclifier_testing.$cyclify_result_stats_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $cyclify_result_stats_p$UnaryFunction extends UnaryFunction {
        public $cyclify_result_stats_p$UnaryFunction() {
            super(extractFunctionNamed("CYCLIFY-RESULT-STATS-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return cyclify_result_stats_p(arg1);
        }
    }

    public static final SubLObject crs_sentence_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCLIFY_RESULT_STATS_P);
        return v_object.getField2();
    }

    public static final SubLObject crs_literal_counts(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCLIFY_RESULT_STATS_P);
        return v_object.getField3();
    }

    public static final SubLObject crs_parse_counts(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCLIFY_RESULT_STATS_P);
        return v_object.getField4();
    }

    public static final SubLObject crs_unparsed_counts(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCLIFY_RESULT_STATS_P);
        return v_object.getField5();
    }

    public static final SubLObject _csetf_crs_sentence_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCLIFY_RESULT_STATS_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_crs_literal_counts(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCLIFY_RESULT_STATS_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_crs_parse_counts(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCLIFY_RESULT_STATS_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_crs_unparsed_counts(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCLIFY_RESULT_STATS_P);
        return v_object.setField5(value);
    }

    public static final SubLObject make_cyclify_result_stats(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyclifier_testing.$cyclify_result_stats_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SENTENCE_COUNT)) {
                        _csetf_crs_sentence_count(v_new, current_value);
                    } else
                        if (pcase_var.eql($LITERAL_COUNTS)) {
                            _csetf_crs_literal_counts(v_new, current_value);
                        } else
                            if (pcase_var.eql($PARSE_COUNTS)) {
                                _csetf_crs_parse_counts(v_new, current_value);
                            } else
                                if (pcase_var.eql($UNPARSED_COUNTS)) {
                                    _csetf_crs_unparsed_counts(v_new, current_value);
                                } else {
                                    Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                }



                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_cyclify_result_stats() {
        {
            SubLObject crs = make_cyclify_result_stats(UNPROVIDED);
            _csetf_crs_sentence_count(crs, ZERO_INTEGER);
            return crs;
        }
    }

    public static final SubLObject get_crs_sentence_count(SubLObject crs) {
        return crs_sentence_count(crs);
    }

    public static final SubLObject get_crs_max_literal_count(SubLObject crs, SubLObject key) {
        return getf(crs_literal_counts(crs), key, ZERO_INTEGER);
    }

    public static final SubLObject get_crs_charniak_max_literal_count(SubLObject crs) {
        return getf(crs_literal_counts(crs), CHARNIAK, ZERO_INTEGER);
    }

    public static final SubLObject get_crs_link_max_literal_count(SubLObject crs) {
        return getf(crs_literal_counts(crs), LINK, ZERO_INTEGER);
    }

    public static final SubLObject get_crs_parse_count(SubLObject crs, SubLObject key) {
        return getf(crs_parse_counts(crs), key, ZERO_INTEGER);
    }

    public static final SubLObject get_crs_charniak_parse_count(SubLObject crs) {
        return getf(crs_parse_counts(crs), CHARNIAK, ZERO_INTEGER);
    }

    public static final SubLObject get_crs_link_parse_count(SubLObject crs) {
        return getf(crs_parse_counts(crs), LINK, ZERO_INTEGER);
    }

    public static final SubLObject get_crs_unparsed_count(SubLObject crs, SubLObject key) {
        return getf(crs_unparsed_counts(crs), key, ZERO_INTEGER);
    }

    public static final SubLObject get_crs_charniak_unparsed_count(SubLObject crs) {
        return getf(crs_unparsed_counts(crs), CHARNIAK, ZERO_INTEGER);
    }

    public static final SubLObject get_crs_link_unparsed_count(SubLObject crs) {
        return getf(crs_unparsed_counts(crs), LINK, ZERO_INTEGER);
    }

    public static final SubLObject set_crs_sentence_count(SubLObject crs, SubLObject value) {
        _csetf_crs_sentence_count(crs, value);
        return crs_sentence_count(crs);
    }

    public static final SubLObject set_crs_max_literal_count(SubLObject crs, SubLObject key, SubLObject value) {
        _csetf_crs_literal_counts(crs, putf(crs_literal_counts(crs), key, value));
        return getf(crs_literal_counts(crs), key, UNPROVIDED);
    }

    public static final SubLObject set_crs_charniak_max_literal_count(SubLObject crs, SubLObject value) {
        return putf(crs_literal_counts(crs), CHARNIAK, value);
    }

    public static final SubLObject set_crs_link_max_literal_count(SubLObject crs, SubLObject value) {
        return putf(crs_literal_counts(crs), LINK, value);
    }

    public static final SubLObject set_crs_parse_count(SubLObject crs, SubLObject key, SubLObject value) {
        return putf(crs_parse_counts(crs), key, value);
    }

    public static final SubLObject set_crs_charniak_parse_count(SubLObject crs, SubLObject value) {
        return putf(crs_parse_counts(crs), CHARNIAK, value);
    }

    public static final SubLObject set_crs_link_parse_count(SubLObject crs, SubLObject value) {
        return putf(crs_parse_counts(crs), LINK, value);
    }

    public static final SubLObject set_crs_unparsed_count(SubLObject crs, SubLObject key, SubLObject value) {
        _csetf_crs_unparsed_counts(crs, putf(crs_unparsed_counts(crs), key, value));
        return crs_unparsed_counts(crs);
    }

    public static final SubLObject set_crs_charniak_unparsed_count(SubLObject crs, SubLObject value) {
        return putf(crs_unparsed_counts(crs), CHARNIAK, value);
    }

    public static final SubLObject set_crs_link_unparsed_count(SubLObject crs, SubLObject value) {
        return putf(crs_unparsed_counts(crs), LINK, value);
    }

    public static final SubLObject inc_crs_sentence_count(SubLObject crs, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        _csetf_crs_sentence_count(crs, add(crs_sentence_count(crs), value));
        return crs_sentence_count(crs);
    }

    public static final SubLObject inc_crs_max_literal_count(SubLObject crs, SubLObject key, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_max_literal_count(crs, key, add(get_crs_max_literal_count(crs, key), value));
    }

    public static final SubLObject inc_crs_charniak_max_literal_count(SubLObject crs, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_charniak_max_literal_count(crs, add(get_crs_charniak_max_literal_count(crs), value));
    }

    public static final SubLObject inc_crs_link_max_literal_count(SubLObject crs, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_link_max_literal_count(crs, add(get_crs_link_max_literal_count(crs), value));
    }

    public static final SubLObject inc_crs_parse_count(SubLObject crs, SubLObject key, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_parse_count(crs, key, add(get_crs_parse_count(crs, key), value));
    }

    public static final SubLObject inc_crs_charniak_parse_count(SubLObject crs, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_charniak_parse_count(crs, add(get_crs_charniak_parse_count(crs), value));
    }

    public static final SubLObject inc_crs_link_parse_count(SubLObject crs, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_link_parse_count(crs, add(get_crs_link_parse_count(crs), value));
    }

    public static final SubLObject inc_crs_unparsed_count(SubLObject crs, SubLObject key, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_unparsed_count(crs, key, add(get_crs_unparsed_count(crs, key), value));
    }

    public static final SubLObject inc_crs_charniak_unparsed_count(SubLObject crs, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_charniak_unparsed_count(crs, add(get_crs_charniak_unparsed_count(crs), value));
    }

    public static final SubLObject inc_crs_link_unparsed_count(SubLObject crs, SubLObject value) {
        if (value == UNPROVIDED) {
            value = ONE_INTEGER;
        }
        return set_crs_link_unparsed_count(crs, add(get_crs_link_unparsed_count(crs), value));
    }

    public static final SubLObject update_crs(SubLObject super_crs, SubLObject sub_crs) {
        inc_crs_sentence_count(super_crs, get_crs_sentence_count(sub_crs));
        inc_crs_charniak_max_literal_count(super_crs, get_crs_charniak_max_literal_count(sub_crs));
        inc_crs_link_max_literal_count(super_crs, get_crs_link_max_literal_count(sub_crs));
        inc_crs_charniak_parse_count(super_crs, get_crs_charniak_parse_count(sub_crs));
        inc_crs_link_parse_count(super_crs, get_crs_link_parse_count(sub_crs));
        inc_crs_charniak_unparsed_count(super_crs, get_crs_charniak_unparsed_count(sub_crs));
        inc_crs_link_unparsed_count(super_crs, get_crs_link_unparsed_count(sub_crs));
        return super_crs;
    }

    public static final SubLObject divide_openmind(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TWENTY_INTEGER;
        }
        {
            SubLObject input_file = $str_alt23$_cyc_departments_nl_corpora_OpenM;
            SubLObject output_file_template = $str_alt24$_cyc_projects_aquaint_ginko_Evalu;
            SubLObject file_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject line_number = ZERO_INTEGER;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(input_file, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt26$Unable_to_open__S, input_file);
                }
                {
                    SubLObject infile = stream;
                    if (infile.isStream()) {
                        {
                            SubLObject line = NIL;
                            for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                if (line.isString() && (!line.equalp($str_alt27$))) {
                                    dictionary_utilities.dictionary_push(file_dict, mod(line_number, n), line);
                                    line_number = add(line_number, ONE_INTEGER);
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
            {
                SubLObject file_number = NIL;
                for (file_number = ZERO_INTEGER; file_number.numL(n); file_number = add(file_number, ONE_INTEGER)) {
                    {
                        SubLObject stream_1 = NIL;
                        try {
                            stream_1 = compatibility.open_text(cconcatenate(format_nil.format_nil_a_no_copy(output_file_template), new SubLObject[]{ format_nil.format_nil_a_no_copy(file_number), $str_alt28$_txt }), $OUTPUT, NIL);
                            if (!stream_1.isStream()) {
                                Errors.error($str_alt26$Unable_to_open__S, cconcatenate(format_nil.format_nil_a_no_copy(output_file_template), new SubLObject[]{ format_nil.format_nil_a_no_copy(file_number), $str_alt28$_txt }));
                            }
                            {
                                SubLObject stream_2 = stream_1;
                                SubLObject cdolist_list_var = dictionary.dictionary_lookup(file_dict, file_number, UNPROVIDED);
                                SubLObject sentence = NIL;
                                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                    format(stream_2, $str_alt30$_A__, sentence);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (stream_1.isStream()) {
                                        close(stream_1, UNPROVIDED);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
            }
        }
        return DONE;
    }

    public static final SubLObject test_openmind_coverage(SubLObject parse_function, SubLObject sentence_count, SubLObject output_dir) {
        if (parse_function == UNPROVIDED) {
            parse_function = NIL;
        }
        if (sentence_count == UNPROVIDED) {
            sentence_count = $int$100;
        }
        if (output_dir == UNPROVIDED) {
            output_dir = $str_alt33$_cyc_projects_aquaint_ginko_Evalu;
        }
        {
            SubLObject dev_sentences = get_dev_sentences(sentence_count, UNPROVIDED);
            SubLObject blind_test_sentences = get_test_sentences(sentence_count, UNPROVIDED);
            return test_parser_coverage(parse_function, dev_sentences, blind_test_sentences, output_dir);
        }
    }

    public static final SubLObject test_parser_coverage(SubLObject parse_function, SubLObject dev_sentences, SubLObject test_sentences, SubLObject output_dir) {
        {
            SubLObject dev_output_detailed = cconcatenate(format_nil.format_nil_a_no_copy(output_dir), new SubLObject[]{ format_nil.format_nil_a_no_copy(parse_function), $str_alt34$_dev_, format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str_alt28$_txt });
            SubLObject dev_output_summary = cconcatenate(format_nil.format_nil_a_no_copy(output_dir), new SubLObject[]{ format_nil.format_nil_a_no_copy(parse_function), $str_alt35$_dev_summary_txt });
            SubLObject test_output_file = cconcatenate(format_nil.format_nil_a_no_copy(output_dir), new SubLObject[]{ format_nil.format_nil_a_no_copy(parse_function), $str_alt36$_test_, format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str_alt28$_txt });
            SubLObject test_output_summary = cconcatenate(format_nil.format_nil_a_no_copy(output_dir), new SubLObject[]{ format_nil.format_nil_a_no_copy(parse_function), $str_alt37$_test_summary_txt });
            test_parses(parse_function, test_sentences, test_output_file, test_output_summary, UNPROVIDED);
            return test_parses(parse_function, dev_sentences, dev_output_detailed, dev_output_summary, T);
        }
    }

    /**
     * In addition to the parsing results and messages, returns the time taken to
     * parse SENTENCE using PARSING-FUNCTION.
     */
    public static final SubLObject timed_parse(SubLObject parse_function, SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parse_result = NIL;
                SubLObject justifications = NIL;
                SubLObject coverage = NIL;
                SubLObject error_msg = NIL;
                SubLObject time_taken = NIL;
                SubLObject time_var = get_internal_real_time();
                thread.resetMultipleValues();
                {
                    SubLObject parse_result_3 = funcall(parse_function, sentence);
                    SubLObject justifications_4 = thread.secondMultipleValue();
                    SubLObject coverage_5 = thread.thirdMultipleValue();
                    SubLObject error_msg_6 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    parse_result = parse_result_3;
                    justifications = justifications_4;
                    coverage = coverage_5;
                    error_msg = error_msg_6;
                }
                time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                return values(parse_result, justifications, coverage, error_msg, time_taken);
            }
        }
    }

    public static final SubLObject test_parses(SubLObject parse_function, SubLObject nl_sentences, SubLObject detailed_output_file, SubLObject summary_output_file, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject crs = new_cyclify_result_stats();
                SubLObject parsing_time = ZERO_INTEGER;
                SubLObject error = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(detailed_output_file, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt26$Unable_to_open__S, detailed_output_file);
                    }
                    {
                        SubLObject out = stream;
                        SubLObject list_var = nl_sentences;
                        utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject sentence = NIL;
                                    for (sentence = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , sentence = csome_list_var.first()) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        if (NIL != verboseP) {
                                            format(T, $str_alt39$___S, sentence);
                                            force_output(T);
                                        }
                                        try {
                                            {
                                                SubLObject _prev_bind_0_7 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject parse_result = timed_parse(parse_function, sentence);
                                                            SubLObject justifications = thread.secondMultipleValue();
                                                            SubLObject coverage = thread.thirdMultipleValue();
                                                            SubLObject error_msg = thread.fourthMultipleValue();
                                                            SubLObject time_taken = thread.fifthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            parsing_time = add(parsing_time, time_taken);
                                                            {
                                                                SubLObject max_lits = el_utilities.max_literal_count(parse_result);
                                                                {
                                                                    SubLObject _prev_bind_0_8 = $print_pretty$.currentBinding(thread);
                                                                    try {
                                                                        $print_pretty$.bind(NIL, thread);
                                                                        format(out, $str_alt41$__S__A__A__A__S___, new SubLObject[]{ sentence, max_lits, Mapping.mapcar(HL_TO_EL, parse_result), coverage, error_msg });
                                                                    } finally {
                                                                        $print_pretty$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                                inc_crs_sentence_count(crs, UNPROVIDED);
                                                                inc_crs_max_literal_count(crs, parse_function, max_lits);
                                                                if (ZERO_INTEGER.numE(max_lits)) {
                                                                    inc_crs_unparsed_count(crs, parse_function, UNPROVIDED);
                                                                }
                                                                inc_crs_parse_count(crs, parse_function, length(parse_result));
                                                            }
                                                        }
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        }
                                        if (NIL != error) {
                                            Errors.warn($str_alt43$__error_parsing___S___S__, sentence, error);
                                            error = NIL;
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
                {
                    SubLObject stream_9 = NIL;
                    try {
                        stream_9 = compatibility.open_text(summary_output_file, $APPEND, NIL);
                        if (!stream_9.isStream()) {
                            Errors.error($str_alt26$Unable_to_open__S, summary_output_file);
                        }
                        {
                            SubLObject out = stream_9;
                            format(out, $str_alt45$_14_a__14_a__22_A__13_A__17_A__14, new SubLObject[]{ $$$timestamp, $str_alt47$sentence_count, $$$literals_in_parses, $$$unparsed, $$$parser, $$$time, $str_alt52$time_scaled_w_r_t__latte });
                            format(out, $str_alt45$_14_a__14_a__22_A__13_A__17_A__14, new SubLObject[]{ numeric_date_utilities.universal_timestring(UNPROVIDED), get_crs_sentence_count(crs), get_crs_max_literal_count(crs, parse_function), get_crs_unparsed_count(crs, parse_function), parse_function, parsing_time, misc_utilities.scale_by_bogomips(list(parsing_time), $float$3984_58) });
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream_9.isStream()) {
                                    close(stream_9, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                Errors.warn($str_alt54$writing_results_to__A, summary_output_file);
                return crs;
            }
        }
    }

    public static final SubLObject get_dev_sentences(SubLObject count, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $str_alt55$_cyc_projects_aquaint_ginko_Evalu;
        }
        return get_random_sentences_from_directory(count, directory);
    }

    public static final SubLObject get_test_sentences(SubLObject count, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $str_alt56$_cyc_projects_aquaint_ginko_Evalu;
        }
        return get_random_sentences_from_directory(count, directory);
    }

    public static final SubLObject get_random_sentences_from_directory(SubLObject count, SubLObject directory_name) {
        {
            SubLObject raw_files = Filesys.directory(directory_name, UNPROVIDED);
            SubLObject files = NIL;
            SubLObject cdolist_list_var = raw_files;
            SubLObject file = NIL;
            for (file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file = cdolist_list_var.first()) {
                {
                    SubLObject file_name = cconcatenate(directory_name, file);
                    if (NIL == Filesys.directory_p(file_name)) {
                        files = cons(file_name, files);
                    }
                }
            }
            {
                SubLObject file_count = length(files);
                SubLObject sentence_count_by_file = make_vector(file_count, ZERO_INTEGER);
                SubLObject sentences = NIL;
                SubLObject sentence_total_count = ZERO_INTEGER;
                {
                    SubLObject sentence_num = NIL;
                    for (sentence_num = ZERO_INTEGER; sentence_num.numL(count); sentence_num = add(sentence_num, ONE_INTEGER)) {
                        {
                            SubLObject file_number = random.random(file_count);
                            set_aref(sentence_count_by_file, file_number, add(aref(sentence_count_by_file, file_number), ONE_INTEGER));
                        }
                    }
                }
                {
                    SubLObject list_var = NIL;
                    SubLObject file_name = NIL;
                    SubLObject file_num = NIL;
                    for (list_var = files, file_name = list_var.first(), file_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , file_name = list_var.first() , file_num = add(ONE_INTEGER, file_num)) {
                        {
                            SubLObject file_sentences = file_utilities.get_file_lines(file_name);
                            SubLObject sentence_count = length(file_sentences);
                            SubLObject cdotimes_end_var = aref(sentence_count_by_file, file_num);
                            SubLObject sentence_num = NIL;
                            for (sentence_num = ZERO_INTEGER; sentence_num.numL(cdotimes_end_var); sentence_num = add(sentence_num, ONE_INTEGER)) {
                                sentence_total_count = add(sentence_total_count, ONE_INTEGER);
                                sentences = cons(nth(random.random(sentence_count), file_sentences), sentences);
                            }
                        }
                    }
                }
                return sentences;
            }
        }
    }

    public static final SubLObject declare_cyclifier_testing_file() {
        declareFunction("cyclify_result_stats_print_function_trampoline", "CYCLIFY-RESULT-STATS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cyclify_result_stats_p", "CYCLIFY-RESULT-STATS-P", 1, 0, false);
        new cyclifier_testing.$cyclify_result_stats_p$UnaryFunction();
        declareFunction("crs_sentence_count", "CRS-SENTENCE-COUNT", 1, 0, false);
        declareFunction("crs_literal_counts", "CRS-LITERAL-COUNTS", 1, 0, false);
        declareFunction("crs_parse_counts", "CRS-PARSE-COUNTS", 1, 0, false);
        declareFunction("crs_unparsed_counts", "CRS-UNPARSED-COUNTS", 1, 0, false);
        declareFunction("_csetf_crs_sentence_count", "_CSETF-CRS-SENTENCE-COUNT", 2, 0, false);
        declareFunction("_csetf_crs_literal_counts", "_CSETF-CRS-LITERAL-COUNTS", 2, 0, false);
        declareFunction("_csetf_crs_parse_counts", "_CSETF-CRS-PARSE-COUNTS", 2, 0, false);
        declareFunction("_csetf_crs_unparsed_counts", "_CSETF-CRS-UNPARSED-COUNTS", 2, 0, false);
        declareFunction("make_cyclify_result_stats", "MAKE-CYCLIFY-RESULT-STATS", 0, 1, false);
        declareFunction("new_cyclify_result_stats", "NEW-CYCLIFY-RESULT-STATS", 0, 0, false);
        declareFunction("get_crs_sentence_count", "GET-CRS-SENTENCE-COUNT", 1, 0, false);
        declareFunction("get_crs_max_literal_count", "GET-CRS-MAX-LITERAL-COUNT", 2, 0, false);
        declareFunction("get_crs_charniak_max_literal_count", "GET-CRS-CHARNIAK-MAX-LITERAL-COUNT", 1, 0, false);
        declareFunction("get_crs_link_max_literal_count", "GET-CRS-LINK-MAX-LITERAL-COUNT", 1, 0, false);
        declareFunction("get_crs_parse_count", "GET-CRS-PARSE-COUNT", 2, 0, false);
        declareFunction("get_crs_charniak_parse_count", "GET-CRS-CHARNIAK-PARSE-COUNT", 1, 0, false);
        declareFunction("get_crs_link_parse_count", "GET-CRS-LINK-PARSE-COUNT", 1, 0, false);
        declareFunction("get_crs_unparsed_count", "GET-CRS-UNPARSED-COUNT", 2, 0, false);
        declareFunction("get_crs_charniak_unparsed_count", "GET-CRS-CHARNIAK-UNPARSED-COUNT", 1, 0, false);
        declareFunction("get_crs_link_unparsed_count", "GET-CRS-LINK-UNPARSED-COUNT", 1, 0, false);
        declareFunction("set_crs_sentence_count", "SET-CRS-SENTENCE-COUNT", 2, 0, false);
        declareFunction("set_crs_max_literal_count", "SET-CRS-MAX-LITERAL-COUNT", 3, 0, false);
        declareFunction("set_crs_charniak_max_literal_count", "SET-CRS-CHARNIAK-MAX-LITERAL-COUNT", 2, 0, false);
        declareFunction("set_crs_link_max_literal_count", "SET-CRS-LINK-MAX-LITERAL-COUNT", 2, 0, false);
        declareFunction("set_crs_parse_count", "SET-CRS-PARSE-COUNT", 3, 0, false);
        declareFunction("set_crs_charniak_parse_count", "SET-CRS-CHARNIAK-PARSE-COUNT", 2, 0, false);
        declareFunction("set_crs_link_parse_count", "SET-CRS-LINK-PARSE-COUNT", 2, 0, false);
        declareFunction("set_crs_unparsed_count", "SET-CRS-UNPARSED-COUNT", 3, 0, false);
        declareFunction("set_crs_charniak_unparsed_count", "SET-CRS-CHARNIAK-UNPARSED-COUNT", 2, 0, false);
        declareFunction("set_crs_link_unparsed_count", "SET-CRS-LINK-UNPARSED-COUNT", 2, 0, false);
        declareFunction("inc_crs_sentence_count", "INC-CRS-SENTENCE-COUNT", 1, 1, false);
        declareFunction("inc_crs_max_literal_count", "INC-CRS-MAX-LITERAL-COUNT", 2, 1, false);
        declareFunction("inc_crs_charniak_max_literal_count", "INC-CRS-CHARNIAK-MAX-LITERAL-COUNT", 1, 1, false);
        declareFunction("inc_crs_link_max_literal_count", "INC-CRS-LINK-MAX-LITERAL-COUNT", 1, 1, false);
        declareFunction("inc_crs_parse_count", "INC-CRS-PARSE-COUNT", 2, 1, false);
        declareFunction("inc_crs_charniak_parse_count", "INC-CRS-CHARNIAK-PARSE-COUNT", 1, 1, false);
        declareFunction("inc_crs_link_parse_count", "INC-CRS-LINK-PARSE-COUNT", 1, 1, false);
        declareFunction("inc_crs_unparsed_count", "INC-CRS-UNPARSED-COUNT", 2, 1, false);
        declareFunction("inc_crs_charniak_unparsed_count", "INC-CRS-CHARNIAK-UNPARSED-COUNT", 1, 1, false);
        declareFunction("inc_crs_link_unparsed_count", "INC-CRS-LINK-UNPARSED-COUNT", 1, 1, false);
        declareFunction("update_crs", "UPDATE-CRS", 2, 0, false);
        declareFunction("divide_openmind", "DIVIDE-OPENMIND", 0, 1, false);
        declareFunction("test_openmind_coverage", "TEST-OPENMIND-COVERAGE", 0, 3, false);
        declareFunction("test_parser_coverage", "TEST-PARSER-COVERAGE", 4, 0, false);
        declareFunction("timed_parse", "TIMED-PARSE", 2, 0, false);
        declareFunction("test_parses", "TEST-PARSES", 4, 1, false);
        declareFunction("get_dev_sentences", "GET-DEV-SENTENCES", 1, 1, false);
        declareFunction("get_test_sentences", "GET-TEST-SENTENCES", 1, 1, false);
        declareFunction("get_random_sentences_from_directory", "GET-RANDOM-SENTENCES-FROM-DIRECTORY", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyclifier_testing_file() {
        defconstant("*DTP-CYCLIFY-RESULT-STATS*", CYCLIFY_RESULT_STATS);
        return NIL;
    }

    public static final SubLObject setup_cyclifier_testing_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_cyclify_result_stats$.getGlobalValue(), symbol_function(CYCLIFY_RESULT_STATS_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CRS_SENTENCE_COUNT, _CSETF_CRS_SENTENCE_COUNT);
        def_csetf(CRS_LITERAL_COUNTS, _CSETF_CRS_LITERAL_COUNTS);
        def_csetf(CRS_PARSE_COUNTS, _CSETF_CRS_PARSE_COUNTS);
        def_csetf(CRS_UNPARSED_COUNTS, _CSETF_CRS_UNPARSED_COUNTS);
        identity(CYCLIFY_RESULT_STATS);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYCLIFY_RESULT_STATS = makeSymbol("CYCLIFY-RESULT-STATS");

    private static final SubLSymbol CYCLIFY_RESULT_STATS_P = makeSymbol("CYCLIFY-RESULT-STATS-P");

    static private final SubLList $list_alt2 = list(makeSymbol("SENTENCE-COUNT"), makeSymbol("LITERAL-COUNTS"), makeSymbol("PARSE-COUNTS"), makeSymbol("UNPARSED-COUNTS"));

    static private final SubLList $list_alt3 = list(makeKeyword("SENTENCE-COUNT"), makeKeyword("LITERAL-COUNTS"), makeKeyword("PARSE-COUNTS"), makeKeyword("UNPARSED-COUNTS"));

    static private final SubLList $list_alt4 = list(makeSymbol("CRS-SENTENCE-COUNT"), makeSymbol("CRS-LITERAL-COUNTS"), makeSymbol("CRS-PARSE-COUNTS"), makeSymbol("CRS-UNPARSED-COUNTS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-CRS-SENTENCE-COUNT"), makeSymbol("_CSETF-CRS-LITERAL-COUNTS"), makeSymbol("_CSETF-CRS-PARSE-COUNTS"), makeSymbol("_CSETF-CRS-UNPARSED-COUNTS"));



    private static final SubLSymbol CYCLIFY_RESULT_STATS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCLIFY-RESULT-STATS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol CRS_SENTENCE_COUNT = makeSymbol("CRS-SENTENCE-COUNT");

    public static final SubLSymbol _CSETF_CRS_SENTENCE_COUNT = makeSymbol("_CSETF-CRS-SENTENCE-COUNT");

    private static final SubLSymbol CRS_LITERAL_COUNTS = makeSymbol("CRS-LITERAL-COUNTS");

    public static final SubLSymbol _CSETF_CRS_LITERAL_COUNTS = makeSymbol("_CSETF-CRS-LITERAL-COUNTS");

    private static final SubLSymbol CRS_PARSE_COUNTS = makeSymbol("CRS-PARSE-COUNTS");

    public static final SubLSymbol _CSETF_CRS_PARSE_COUNTS = makeSymbol("_CSETF-CRS-PARSE-COUNTS");

    private static final SubLSymbol CRS_UNPARSED_COUNTS = makeSymbol("CRS-UNPARSED-COUNTS");

    public static final SubLSymbol _CSETF_CRS_UNPARSED_COUNTS = makeSymbol("_CSETF-CRS-UNPARSED-COUNTS");

    private static final SubLSymbol $SENTENCE_COUNT = makeKeyword("SENTENCE-COUNT");

    private static final SubLSymbol $LITERAL_COUNTS = makeKeyword("LITERAL-COUNTS");

    private static final SubLSymbol $PARSE_COUNTS = makeKeyword("PARSE-COUNTS");

    private static final SubLSymbol $UNPARSED_COUNTS = makeKeyword("UNPARSED-COUNTS");

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol CHARNIAK = makeSymbol("CHARNIAK");



    static private final SubLString $str_alt23$_cyc_departments_nl_corpora_OpenM = makeString("/cyc/departments/nl/corpora/OpenMind/omcsraw.txt");

    static private final SubLString $str_alt24$_cyc_projects_aquaint_ginko_Evalu = makeString("/cyc/projects/aquaint/ginko/Evaluations/ebmt-testing/openmind-segment-");



    static private final SubLString $str_alt26$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt27$ = makeString("");

    static private final SubLString $str_alt28$_txt = makeString(".txt");



    static private final SubLString $str_alt30$_A__ = makeString("~A~%");





    static private final SubLString $str_alt33$_cyc_projects_aquaint_ginko_Evalu = makeString("/cyc/projects/aquaint/ginko/Evaluations/ebmt-testing/");

    static private final SubLString $str_alt34$_dev_ = makeString("-dev-");

    static private final SubLString $str_alt35$_dev_summary_txt = makeString("-dev-summary.txt");

    static private final SubLString $str_alt36$_test_ = makeString("-test-");

    static private final SubLString $str_alt37$_test_summary_txt = makeString("-test-summary.txt");

    static private final SubLString $$$cdolist = makeString("cdolist");

    static private final SubLString $str_alt39$___S = makeString("~%~S");



    static private final SubLString $str_alt41$__S__A__A__A__S___ = makeString("(~S ~A ~A ~A ~S)~%");



    static private final SubLString $str_alt43$__error_parsing___S___S__ = makeString("~%error parsing: ~S~%~S~%");



    static private final SubLString $str_alt45$_14_a__14_a__22_A__13_A__17_A__14 = makeString("~14@a ~14@a ~22@A ~13@A ~17@A ~14@a ~25@a~%");

    static private final SubLString $$$timestamp = makeString("timestamp");

    static private final SubLString $str_alt47$sentence_count = makeString("sentence-count");

    static private final SubLString $$$literals_in_parses = makeString("literals in parses");

    static private final SubLString $$$unparsed = makeString("unparsed");

    static private final SubLString $$$parser = makeString("parser");

    static private final SubLString $$$time = makeString("time");

    static private final SubLString $str_alt52$time_scaled_w_r_t__latte = makeString("time scaled w.r.t. latte");

    public static final SubLFloat $float$3984_58 = makeDouble(3984.58);

    static private final SubLString $str_alt54$writing_results_to__A = makeString("writing results to ~A");

    static private final SubLString $str_alt55$_cyc_projects_aquaint_ginko_Evalu = makeString("/cyc/projects/aquaint/ginko/Evaluations/ebmt-testing/dev-set/");

    static private final SubLString $str_alt56$_cyc_projects_aquaint_ginko_Evalu = makeString("/cyc/projects/aquaint/ginko/Evaluations/ebmt-testing/test-set/");

    // // Initializers
    public void declareFunctions() {
        declare_cyclifier_testing_file();
    }

    public void initializeVariables() {
        init_cyclifier_testing_file();
    }

    public void runTopLevelForms() {
        setup_cyclifier_testing_file();
    }
}

