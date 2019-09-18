package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.set;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class word_frequencies extends SubLTranslatedFile {
    public static final SubLFile me = new word_frequencies();

    public static final String myName = "com.cyc.cycjava.cycl.word_frequencies";

    public static final String myFingerPrint = "95357cf9c809a3bcd20d2e4dc4c581b4b01d84adc7eb4b3054b0e9b658ff4825";

    // deflexical
    // Definitions
    public static final SubLSymbol $frequency_hash_initial_size$ = makeSymbol("*FREQUENCY-HASH-INITIAL-SIZE*");



    // defparameter
    // Default file for saving the cfasl form of the word-frequency hash table
    private static final SubLSymbol $frequency_hash_save_name$ = makeSymbol("*FREQUENCY-HASH-SAVE-NAME*");

    private static final SubLInteger $int$64000 = makeInteger(64000);

    public static final SubLSymbol $word_frequency_hash$ = makeSymbol("*WORD-FREQUENCY-HASH*");

    public static final SubLList $list2 = list(makeString("data"), makeString("word-frequencies"));

    public static final SubLString $str3$word_frequencies = makeString("word-frequencies");

    public static final SubLString $$$hash = makeString("hash");



    public static final SubLString $str6$Loading_frequencies_from__a____ = makeString("Loading frequencies from ~a ...");



    public static final SubLString $str8$Unable_to_open__S = makeString("Unable to open ~S");

    public static SubLObject frequency_of_string(final SubLObject string, SubLObject unknown, SubLObject hash_table) {
        if (unknown == UNPROVIDED) {
            unknown = ZERO_INTEGER;
        }
        if (hash_table == UNPROVIDED) {
            hash_table = $word_frequency_hash$.getGlobalValue();
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return gethash(string, hash_table, unknown);
    }

    public static SubLObject load_computed_frequencies(SubLObject hash_table_var, SubLObject hash_table_file) {
        if (hash_table_var == UNPROVIDED) {
            hash_table_var = $word_frequency_hash$;
        }
        if (hash_table_file == UNPROVIDED) {
            hash_table_file = $frequency_hash_save_name$.getDynamicValue();
        }
        set(hash_table_var, cfasl_utilities.cfasl_load(hash_table_file));
        return eval(hash_table_var);
    }

    public static SubLObject save_computed_frequencies(SubLObject hash_table, SubLObject hash_table_file) {
        if (hash_table == UNPROVIDED) {
            hash_table = $word_frequency_hash$.getGlobalValue();
        }
        if (hash_table_file == UNPROVIDED) {
            hash_table_file = $frequency_hash_save_name$.getDynamicValue();
        }
        return cfasl_utilities.cfasl_save(hash_table, hash_table_file);
    }

    public static SubLObject import_frequencies_from_file(final SubLObject filename, SubLObject hash_table_var) {
        if (hash_table_var == UNPROVIDED) {
            hash_table_var = $word_frequency_hash$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject progress_message = format(NIL, $str6$Loading_frequencies_from__a____, filename);
        SubLObject hash_table = NIL;
        if ((NIL == boundp(hash_table_var)) || (NIL == eval(hash_table_var))) {
            set(hash_table_var, make_hash_table($frequency_hash_initial_size$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
        }
        hash_table = eval(hash_table_var);
        clrhash(hash_table);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str8$Unable_to_open__S, filename);
            }
            final SubLObject file = stream;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(progress_message);
                    SubLObject line = NIL;
                    SubLObject tok_list = NIL;
                    SubLObject file_len = NIL;
                    line = string_utilities.network_read_line(file, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
                    tok_list = string_utilities.string_tokenize(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    file_len = file_length(file);
                    while (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                        if (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                            sethash(second(tok_list), hash_table, parse_integer(tok_list.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            note_percent_progress(file_position(file, UNPROVIDED), file_len);
                        }
                        line = string_utilities.network_read_line(file, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
                        tok_list = string_utilities.string_tokenize(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        // file_len = file_len;
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return hash_table;
    }

    public static SubLObject declare_word_frequencies_file() {
        declareFunction(me, "frequency_of_string", "FREQUENCY-OF-STRING", 1, 2, false);
        declareFunction(me, "load_computed_frequencies", "LOAD-COMPUTED-FREQUENCIES", 0, 2, false);
        declareFunction(me, "save_computed_frequencies", "SAVE-COMPUTED-FREQUENCIES", 0, 2, false);
        declareFunction(me, "import_frequencies_from_file", "IMPORT-FREQUENCIES-FROM-FILE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_word_frequencies_file() {
        deflexical("*FREQUENCY-HASH-INITIAL-SIZE*", $int$64000);
        deflexical("*WORD-FREQUENCY-HASH*", SubLSystemTrampolineFile.maybeDefault($word_frequency_hash$, $word_frequency_hash$, () -> make_hash_table($int$64000, symbol_function(EQUALP), UNPROVIDED)));
        defparameter("*FREQUENCY-HASH-SAVE-NAME*", Filesys.construct_filename($list2, $str3$word_frequencies, $$$hash, T));
        return NIL;
    }

    public static SubLObject setup_word_frequencies_file() {
        declare_defglobal($word_frequency_hash$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_word_frequencies_file();
    }

    @Override
    public void initializeVariables() {
        init_word_frequencies_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_word_frequencies_file();
    }

    
}

/**
 * Total time: 170 ms
 */
