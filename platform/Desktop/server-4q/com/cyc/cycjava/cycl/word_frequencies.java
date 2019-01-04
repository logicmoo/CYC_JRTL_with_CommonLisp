package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class word_frequencies extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.word_frequencies";
    public static final String myFingerPrint = "95357cf9c809a3bcd20d2e4dc4c581b4b01d84adc7eb4b3054b0e9b658ff4825";
    @SubLTranslatedFile.SubL(source = "cycl/word-frequencies.lisp", position = 3652L)
    public static SubLSymbol $frequency_hash_initial_size$;
    @SubLTranslatedFile.SubL(source = "cycl/word-frequencies.lisp", position = 3777L)
    private static SubLSymbol $word_frequency_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/word-frequencies.lisp", position = 3920L)
    private static SubLSymbol $frequency_hash_save_name$;
    private static final SubLInteger $int0$64000;
    private static final SubLSymbol $sym1$_WORD_FREQUENCY_HASH_;
    private static final SubLList $list2;
    private static final SubLString $str3$word_frequencies;
    private static final SubLString $str4$hash;
    private static final SubLSymbol $sym5$STRINGP;
    private static final SubLString $str6$Loading_frequencies_from__a____;
    private static final SubLSymbol $kw7$INPUT;
    private static final SubLString $str8$Unable_to_open__S;
    
    @SubLTranslatedFile.SubL(source = "cycl/word-frequencies.lisp", position = 4130L)
    public static SubLObject frequency_of_string(final SubLObject string, SubLObject unknown, SubLObject hash_table) {
        if (unknown == word_frequencies.UNPROVIDED) {
            unknown = (SubLObject)word_frequencies.ZERO_INTEGER;
        }
        if (hash_table == word_frequencies.UNPROVIDED) {
            hash_table = word_frequencies.$word_frequency_hash$.getGlobalValue();
        }
        assert word_frequencies.NIL != Types.stringp(string) : string;
        return Hashtables.gethash(string, hash_table, unknown);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-frequencies.lisp", position = 4597L)
    public static SubLObject load_computed_frequencies(SubLObject hash_table_var, SubLObject hash_table_file) {
        if (hash_table_var == word_frequencies.UNPROVIDED) {
            hash_table_var = (SubLObject)word_frequencies.$sym1$_WORD_FREQUENCY_HASH_;
        }
        if (hash_table_file == word_frequencies.UNPROVIDED) {
            hash_table_file = word_frequencies.$frequency_hash_save_name$.getDynamicValue();
        }
        Symbols.set(hash_table_var, cfasl_utilities.cfasl_load(hash_table_file));
        return Eval.eval(hash_table_var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-frequencies.lisp", position = 5035L)
    public static SubLObject save_computed_frequencies(SubLObject hash_table, SubLObject hash_table_file) {
        if (hash_table == word_frequencies.UNPROVIDED) {
            hash_table = word_frequencies.$word_frequency_hash$.getGlobalValue();
        }
        if (hash_table_file == word_frequencies.UNPROVIDED) {
            hash_table_file = word_frequencies.$frequency_hash_save_name$.getDynamicValue();
        }
        return cfasl_utilities.cfasl_save(hash_table, hash_table_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/word-frequencies.lisp", position = 5419L)
    public static SubLObject import_frequencies_from_file(final SubLObject filename, SubLObject hash_table_var) {
        if (hash_table_var == word_frequencies.UNPROVIDED) {
            hash_table_var = (SubLObject)word_frequencies.$sym1$_WORD_FREQUENCY_HASH_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject progress_message = PrintLow.format((SubLObject)word_frequencies.NIL, (SubLObject)word_frequencies.$str6$Loading_frequencies_from__a____, filename);
        SubLObject hash_table = (SubLObject)word_frequencies.NIL;
        if (word_frequencies.NIL == Symbols.boundp(hash_table_var) || word_frequencies.NIL == Eval.eval(hash_table_var)) {
            Symbols.set(hash_table_var, Hashtables.make_hash_table(word_frequencies.$frequency_hash_initial_size$.getGlobalValue(), Symbols.symbol_function((SubLObject)word_frequencies.EQUALP), (SubLObject)word_frequencies.UNPROVIDED));
        }
        hash_table = Eval.eval(hash_table_var);
        Hashtables.clrhash(hash_table);
        SubLObject stream = (SubLObject)word_frequencies.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)word_frequencies.$kw7$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)word_frequencies.$str8$Unable_to_open__S, filename);
            }
            final SubLObject file = stream;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)word_frequencies.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)word_frequencies.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)word_frequencies.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(progress_message);
                    SubLObject line = (SubLObject)word_frequencies.NIL;
                    SubLObject tok_list = (SubLObject)word_frequencies.NIL;
                    SubLObject file_len = (SubLObject)word_frequencies.NIL;
                    line = string_utilities.network_read_line(file, (SubLObject)word_frequencies.NIL, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)word_frequencies.UNPROVIDED);
                    tok_list = string_utilities.string_tokenize(line, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED);
                    file_len = streams_high.file_length(file);
                    while (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                        if (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                            Hashtables.sethash(conses_high.second(tok_list), hash_table, reader.parse_integer(tok_list.first(), (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED));
                            utilities_macros.note_percent_progress(streams_high.file_position(file, (SubLObject)word_frequencies.UNPROVIDED), file_len);
                        }
                        line = string_utilities.network_read_line(file, (SubLObject)word_frequencies.NIL, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)word_frequencies.UNPROVIDED);
                        tok_list = string_utilities.string_tokenize(line, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED, (SubLObject)word_frequencies.UNPROVIDED);
                        file_len = file_len;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_frequencies.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)word_frequencies.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)word_frequencies.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return hash_table;
    }
    
    public static SubLObject declare_word_frequencies_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_frequencies", "frequency_of_string", "FREQUENCY-OF-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_frequencies", "load_computed_frequencies", "LOAD-COMPUTED-FREQUENCIES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_frequencies", "save_computed_frequencies", "SAVE-COMPUTED-FREQUENCIES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.word_frequencies", "import_frequencies_from_file", "IMPORT-FREQUENCIES-FROM-FILE", 1, 1, false);
        return (SubLObject)word_frequencies.NIL;
    }
    
    public static SubLObject init_word_frequencies_file() {
        word_frequencies.$frequency_hash_initial_size$ = SubLFiles.deflexical("*FREQUENCY-HASH-INITIAL-SIZE*", (SubLObject)word_frequencies.$int0$64000);
        word_frequencies.$word_frequency_hash$ = SubLFiles.deflexical("*WORD-FREQUENCY-HASH*", (word_frequencies.NIL != Symbols.boundp((SubLObject)word_frequencies.$sym1$_WORD_FREQUENCY_HASH_)) ? word_frequencies.$word_frequency_hash$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)word_frequencies.$int0$64000, Symbols.symbol_function((SubLObject)word_frequencies.EQUALP), (SubLObject)word_frequencies.UNPROVIDED));
        word_frequencies.$frequency_hash_save_name$ = SubLFiles.defparameter("*FREQUENCY-HASH-SAVE-NAME*", Filesys.construct_filename((SubLObject)word_frequencies.$list2, (SubLObject)word_frequencies.$str3$word_frequencies, (SubLObject)word_frequencies.$str4$hash, (SubLObject)word_frequencies.T));
        return (SubLObject)word_frequencies.NIL;
    }
    
    public static SubLObject setup_word_frequencies_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)word_frequencies.$sym1$_WORD_FREQUENCY_HASH_);
        return (SubLObject)word_frequencies.NIL;
    }
    
    public void declareFunctions() {
        declare_word_frequencies_file();
    }
    
    public void initializeVariables() {
        init_word_frequencies_file();
    }
    
    public void runTopLevelForms() {
        setup_word_frequencies_file();
    }
    
    static {
        me = (SubLFile)new word_frequencies();
        word_frequencies.$frequency_hash_initial_size$ = null;
        word_frequencies.$word_frequency_hash$ = null;
        word_frequencies.$frequency_hash_save_name$ = null;
        $int0$64000 = SubLObjectFactory.makeInteger(64000);
        $sym1$_WORD_FREQUENCY_HASH_ = SubLObjectFactory.makeSymbol("*WORD-FREQUENCY-HASH*");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("data"), (SubLObject)SubLObjectFactory.makeString("word-frequencies"));
        $str3$word_frequencies = SubLObjectFactory.makeString("word-frequencies");
        $str4$hash = SubLObjectFactory.makeString("hash");
        $sym5$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str6$Loading_frequencies_from__a____ = SubLObjectFactory.makeString("Loading frequencies from ~a ...");
        $kw7$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str8$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
    }
}

/*

	Total time: 170 ms
	
*/