/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WORD-FREQUENCIES
 * source file: /cyc/top/cycl/word-frequencies.lisp
 * created:     2019/07/03 17:38:16
 */
public final class word_frequencies extends SubLTranslatedFile implements V12 {
    /**
     * Record that HITS hits were found for STRING on DATE.
     */
    @LispMethod(comment = "Record that HITS hits were found for STRING on DATE.")
    public static final SubLObject web_hit_fht_record(SubLObject string, SubLObject hits, SubLObject date) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || string.isString())) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt11$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt12$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(string), new SubLObject[]{ $str_alt13$_is_not_a_, format_nil.format_nil_s_no_copy(STRINGP) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != subl_promotions.non_negative_integer_p(hits)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt11$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt12$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(hits), new SubLObject[]{ $str_alt13$_is_not_a_, format_nil.format_nil_s_no_copy(NON_NEGATIVE_INTEGER_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != numeric_date_utilities.universal_date_p(date)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt11$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt12$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(date), new SubLObject[]{ $str_alt13$_is_not_a_, format_nil.format_nil_s_no_copy(UNIVERSAL_DATE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject value = cons(hits, date);
                return file_hash_table.put_file_hash_table(string, com.cyc.cycjava.cycl.word_frequencies.web_hit_fht(), value);
            }
        }
    }

    /**
     *
     *
     * @return 0 integerp or NIL; How many hits were found for STRING?
     * @return 1 universal-date-p; When were those hits found?
     */
    @LispMethod(comment = "@return 0 integerp or NIL; How many hits were found for STRING?\r\n@return 1 universal-date-p; When were those hits found?")
    public static final SubLObject web_hit_fht_lookup(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || string.isString())) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt11$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt12$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(string), new SubLObject[]{ $str_alt13$_is_not_a_, format_nil.format_nil_s_no_copy(STRINGP) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject datum = file_hash_table.get_file_hash_table(string, com.cyc.cycjava.cycl.word_frequencies.web_hit_fht(), $list_alt14);
                SubLObject current = datum;
                SubLObject hits = NIL;
                SubLObject date = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt15);
                hits = current.first();
                current = current.rest();
                date = current;
                return values(hits, date);
            }
        }
    }

    public static final SubLObject web_hit_fht_filename() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return file_utilities.cyc_home_filename($web_hit_frequency_path$.getDynamicValue(thread), $str_alt19$web_hit_table, $$$fht);
        }
    }

    public static final SubLObject web_hit_fht() {
        if (NIL != file_hash_table.file_hash_table_p($web_hit_fht$.getGlobalValue())) {
            return $web_hit_fht$.getGlobalValue();
        } else {
            if (NIL != Filesys.probe_file(com.cyc.cycjava.cycl.word_frequencies.web_hit_fht_filename())) {
                $web_hit_fht$.setGlobalValue(file_hash_table.open_file_hash_table(com.cyc.cycjava.cycl.word_frequencies.web_hit_fht_filename(), EQUALP, UNPROVIDED));
                return $web_hit_fht$.getGlobalValue();
            } else {
                $web_hit_fht$.setGlobalValue(com.cyc.cycjava.cycl.word_frequencies.create_web_hit_fht());
                return $web_hit_fht$.getGlobalValue();
            }
        }
    }

    /**
     *
     *
     * @param WEB-HITS;
     * 		integerp representing number of documents in a very large corpus returned for a seach.
     * @return INTEGERP; a normalized score between 0 and MAX inclusive.
     */
    @LispMethod(comment = "@param WEB-HITS;\r\n\t\tintegerp representing number of documents in a very large corpus returned for a seach.\r\n@return INTEGERP; a normalized score between 0 and MAX inclusive.")
    public static final SubLObject normalize_web_hit_count(SubLObject web_hits, SubLObject max) {
        if (max == UNPROVIDED) {
            max = $int$99;
        }
        {
            SubLObject k = divide(max, log($highest_meaningful_web_hit_count$.getGlobalValue(), UNPROVIDED));
            SubLObject normalized = floor(multiply(log(web_hits, UNPROVIDED), k), UNPROVIDED);
            return normalized.numG(max) ? ((SubLObject) (max)) : normalized;
        }
    }

    public static final SubLObject create_web_hit_fht() {
        {
            SubLObject filename = com.cyc.cycjava.cycl.word_frequencies.web_hit_fht_filename();
            return file_hash_table.create_file_hash_table(filename, $int$10000, SIXTEEN_INTEGER, EQUALP, UNPROVIDED);
        }
    }

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $web_hit_fht$ = makeSymbol("*WEB-HIT-FHT*");

    /**
     * the location of all web hit frequency data, relative to the cyc home
     */
    // defparameter
    @LispMethod(comment = "the location of all web hit frequency data, relative to the cyc home\ndefparameter")
    private static final SubLSymbol $web_hit_frequency_path$ = makeSymbol("*WEB-HIT-FREQUENCY-PATH*");

    /**
     * Highest meaningful number of web-hits returned for a string
     */
    // defconstant
    @LispMethod(comment = "Highest meaningful number of web-hits returned for a string\ndefconstant")
    public static final SubLSymbol $highest_meaningful_web_hit_count$ = makeSymbol("*HIGHEST-MEANINGFUL-WEB-HIT-COUNT*");

    public static final SubLFile me = new word_frequencies();

 public static final String myName = "com.cyc.cycjava.cycl.word_frequencies";


    // deflexical
    // Definitions
    @LispMethod(comment = "Initial size of the word-frequency hash tables to be created\ndeflexical")
    /**
     * Initial size of the word-frequency hash tables to be created
     */
    public static final SubLSymbol $frequency_hash_initial_size$ = makeSymbol("*FREQUENCY-HASH-INITIAL-SIZE*");

    // defparameter
    // Default file for saving the cfasl form of the word-frequency hash table
    /**
     * Default file for saving the cfasl form of the word-frequency hash table
     */
    @LispMethod(comment = "Default file for saving the cfasl form of the word-frequency hash table\ndefparameter")
    private static final SubLSymbol $frequency_hash_save_name$ = makeSymbol("*FREQUENCY-HASH-SAVE-NAME*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLInteger $int$64000 = makeInteger(64000);

    public static final SubLSymbol $word_frequency_hash$ = makeSymbol("*WORD-FREQUENCY-HASH*");

    static private final SubLList $list2 = list(makeString("data"), makeString("word-frequencies"));

    static private final SubLString $str3$word_frequencies = makeString("word-frequencies");

    static private final SubLString $$$hash = makeString("hash");

    static private final SubLString $str6$Loading_frequencies_from__a____ = makeString("Loading frequencies from ~a ...");

    static private final SubLString $str8$Unable_to_open__S = makeString("Unable to open ~S");

    /**
     * Returns a number which measures the frequency of a given string.  More frequent
     * strings will have higher numbers, and two strings with the same frequency will
     * have the same number.  If the string is unknown, the given value of UNKNOWN is
     * returned instead.
     */
    @LispMethod(comment = "Returns a number which measures the frequency of a given string.  More frequent\r\nstrings will have higher numbers, and two strings with the same frequency will\r\nhave the same number.  If the string is unknown, the given value of UNKNOWN is\r\nreturned instead.\nReturns a number which measures the frequency of a given string.  More frequent\nstrings will have higher numbers, and two strings with the same frequency will\nhave the same number.  If the string is unknown, the given value of UNKNOWN is\nreturned instead.")
    public static final SubLObject frequency_of_string_alt(SubLObject string, SubLObject unknown, SubLObject hash_table) {
        if (unknown == UNPROVIDED) {
            unknown = ZERO_INTEGER;
        }
        if (hash_table == UNPROVIDED) {
            hash_table = $word_frequency_hash$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        return gethash(string, hash_table, unknown);
    }

    /**
     * Returns a number which measures the frequency of a given string.  More frequent
     * strings will have higher numbers, and two strings with the same frequency will
     * have the same number.  If the string is unknown, the given value of UNKNOWN is
     * returned instead.
     */
    @LispMethod(comment = "Returns a number which measures the frequency of a given string.  More frequent\r\nstrings will have higher numbers, and two strings with the same frequency will\r\nhave the same number.  If the string is unknown, the given value of UNKNOWN is\r\nreturned instead.\nReturns a number which measures the frequency of a given string.  More frequent\nstrings will have higher numbers, and two strings with the same frequency will\nhave the same number.  If the string is unknown, the given value of UNKNOWN is\nreturned instead.")
    public static SubLObject frequency_of_string(final SubLObject string, SubLObject unknown, SubLObject hash_table) {
        if (unknown == UNPROVIDED) {
            unknown = ZERO_INTEGER;
        }
        if (hash_table == UNPROVIDED) {
            hash_table = $word_frequency_hash$.getGlobalValue();
        }
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return gethash(string, hash_table, unknown);
    }

    /**
     * Loads already-computed word frequencies from a file that has been previously
     * saved using SAVE-COMPUTED-FREQUENCIES.  The default filename to load from is given
     * by *FREQUENCY-HASH-SAVE-NAME*.
     */
    @LispMethod(comment = "Loads already-computed word frequencies from a file that has been previously\r\nsaved using SAVE-COMPUTED-FREQUENCIES.  The default filename to load from is given\r\nby *FREQUENCY-HASH-SAVE-NAME*.\nLoads already-computed word frequencies from a file that has been previously\nsaved using SAVE-COMPUTED-FREQUENCIES.  The default filename to load from is given\nby *FREQUENCY-HASH-SAVE-NAME*.")
    public static final SubLObject load_computed_frequencies_alt(SubLObject hash_table_var, SubLObject hash_table_file) {
        if (hash_table_var == UNPROVIDED) {
            hash_table_var = $word_frequency_hash$;
        }
        if (hash_table_file == UNPROVIDED) {
            hash_table_file = $frequency_hash_save_name$.getDynamicValue();
        }
        set(hash_table_var, cfasl_utilities.cfasl_load(hash_table_file));
        return eval(hash_table_var);
    }

    /**
     * Loads already-computed word frequencies from a file that has been previously
     * saved using SAVE-COMPUTED-FREQUENCIES.  The default filename to load from is given
     * by *FREQUENCY-HASH-SAVE-NAME*.
     */
    @LispMethod(comment = "Loads already-computed word frequencies from a file that has been previously\r\nsaved using SAVE-COMPUTED-FREQUENCIES.  The default filename to load from is given\r\nby *FREQUENCY-HASH-SAVE-NAME*.\nLoads already-computed word frequencies from a file that has been previously\nsaved using SAVE-COMPUTED-FREQUENCIES.  The default filename to load from is given\nby *FREQUENCY-HASH-SAVE-NAME*.")
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

    /**
     * Saves the current word frequencies to a file that can be later loaded using
     * LOAD-COMPUTED-FREQUENCIES.  The default filename to save to is given by
     * FREQUENCY-HASH-SAVE-NAME*.
     */
    @LispMethod(comment = "Saves the current word frequencies to a file that can be later loaded using\r\nLOAD-COMPUTED-FREQUENCIES.  The default filename to save to is given by\r\nFREQUENCY-HASH-SAVE-NAME*.\nSaves the current word frequencies to a file that can be later loaded using\nLOAD-COMPUTED-FREQUENCIES.  The default filename to save to is given by\nFREQUENCY-HASH-SAVE-NAME*.")
    public static final SubLObject save_computed_frequencies_alt(SubLObject hash_table, SubLObject hash_table_file) {
        if (hash_table == UNPROVIDED) {
            hash_table = $word_frequency_hash$.getGlobalValue();
        }
        if (hash_table_file == UNPROVIDED) {
            hash_table_file = $frequency_hash_save_name$.getDynamicValue();
        }
        return cfasl_utilities.cfasl_save(hash_table, hash_table_file);
    }

    @LispMethod(comment = "Saves the current word frequencies to a file that can be later loaded using\r\nLOAD-COMPUTED-FREQUENCIES.  The default filename to save to is given by\r\nFREQUENCY-HASH-SAVE-NAME*.\nSaves the current word frequencies to a file that can be later loaded using\nLOAD-COMPUTED-FREQUENCIES.  The default filename to save to is given by\nFREQUENCY-HASH-SAVE-NAME*.")
    public static SubLObject save_computed_frequencies(SubLObject hash_table, SubLObject hash_table_file) {
        if (hash_table == UNPROVIDED) {
            hash_table = $word_frequency_hash$.getGlobalValue();
        }
        if (hash_table_file == UNPROVIDED) {
            hash_table_file = $frequency_hash_save_name$.getDynamicValue();
        }
        return cfasl_utilities.cfasl_save(hash_table, hash_table_file);
    }

    /**
     * Loads a list of words and frequencies from a file so that they can be used by
     * FREQUENCY-OF-STRING.  The file should be an ASCII file, where each line lists
     * one word, in this format:
     * <metric> <word>
     * METRIC is some integer specifying the frequency of the word.  It may be
     * any scale, as long as more frequent words get a higher metric, and that
     * two words with the same metric are considered to have the same frequency.
     * Fields are separated by whitespace.  Anything after WORD on the line
     * is ignored.  If the same word is listed more than once in a file,
     * then the last entry is retained.  Currently, only one frequency list may
     * be loaded at a time.
     */
    @LispMethod(comment = "Loads a list of words and frequencies from a file so that they can be used by\r\nFREQUENCY-OF-STRING.  The file should be an ASCII file, where each line lists\r\none word, in this format:\r\n<metric> <word>\r\nMETRIC is some integer specifying the frequency of the word.  It may be\r\nany scale, as long as more frequent words get a higher metric, and that\r\ntwo words with the same metric are considered to have the same frequency.\r\nFields are separated by whitespace.  Anything after WORD on the line\r\nis ignored.  If the same word is listed more than once in a file,\r\nthen the last entry is retained.  Currently, only one frequency list may\r\nbe loaded at a time.\nLoads a list of words and frequencies from a file so that they can be used by\nFREQUENCY-OF-STRING.  The file should be an ASCII file, where each line lists\none word, in this format:\n<metric> <word>\nMETRIC is some integer specifying the frequency of the word.  It may be\nany scale, as long as more frequent words get a higher metric, and that\ntwo words with the same metric are considered to have the same frequency.\nFields are separated by whitespace.  Anything after WORD on the line\nis ignored.  If the same word is listed more than once in a file,\nthen the last entry is retained.  Currently, only one frequency list may\nbe loaded at a time.")
    public static final SubLObject import_frequencies_from_file_alt(SubLObject filename, SubLObject hash_table_var) {
        if (hash_table_var == UNPROVIDED) {
            hash_table_var = $word_frequency_hash$;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject progress_message = format(NIL, $str_alt6$Loading_frequencies_from__a____, filename);
                SubLObject hash_table = NIL;
                if ((NIL == boundp(hash_table_var)) || (NIL == eval(hash_table_var))) {
                    set(hash_table_var, make_hash_table($frequency_hash_initial_size$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
                }
                hash_table = eval(hash_table_var);
                clrhash(hash_table);
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(filename, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt8$Unable_to_open__S, filename);
                        }
                        {
                            SubLObject file = stream;
                            {
                                SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(progress_message);
                                    {
                                        SubLObject line = NIL;
                                        SubLObject tok_list = NIL;
                                        SubLObject file_len = NIL;
                                        for (line = read_line(file, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED), tok_list = string_utilities.string_tokenize(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), file_len = file_length(file); !line.equal(string_utilities.$empty_string$.getGlobalValue()); line = read_line(file, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED) , tok_list = string_utilities.string_tokenize(line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) , file_len = file_len) {
                                            if (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                                                sethash(second(tok_list), hash_table, parse_integer(tok_list.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                note_percent_progress(file_position(file, UNPROVIDED), file_len);
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
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
                return hash_table;
            }
        }
    }

    /**
     * Loads a list of words and frequencies from a file so that they can be used by
     * FREQUENCY-OF-STRING.  The file should be an ASCII file, where each line lists
     * one word, in this format:
     * <metric> <word>
     * METRIC is some integer specifying the frequency of the word.  It may be
     * any scale, as long as more frequent words get a higher metric, and that
     * two words with the same metric are considered to have the same frequency.
     * Fields are separated by whitespace.  Anything after WORD on the line
     * is ignored.  If the same word is listed more than once in a file,
     * then the last entry is retained.  Currently, only one frequency list may
     * be loaded at a time.
     */
    @LispMethod(comment = "Loads a list of words and frequencies from a file so that they can be used by\r\nFREQUENCY-OF-STRING.  The file should be an ASCII file, where each line lists\r\none word, in this format:\r\n<metric> <word>\r\nMETRIC is some integer specifying the frequency of the word.  It may be\r\nany scale, as long as more frequent words get a higher metric, and that\r\ntwo words with the same metric are considered to have the same frequency.\r\nFields are separated by whitespace.  Anything after WORD on the line\r\nis ignored.  If the same word is listed more than once in a file,\r\nthen the last entry is retained.  Currently, only one frequency list may\r\nbe loaded at a time.\nLoads a list of words and frequencies from a file so that they can be used by\nFREQUENCY-OF-STRING.  The file should be an ASCII file, where each line lists\none word, in this format:\n<metric> <word>\nMETRIC is some integer specifying the frequency of the word.  It may be\nany scale, as long as more frequent words get a higher metric, and that\ntwo words with the same metric are considered to have the same frequency.\nFields are separated by whitespace.  Anything after WORD on the line\nis ignored.  If the same word is listed more than once in a file,\nthen the last entry is retained.  Currently, only one frequency list may\nbe loaded at a time.")
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

    public static final SubLObject declare_word_frequencies_file_alt() {
        declareFunction("frequency_of_string", "FREQUENCY-OF-STRING", 1, 2, false);
        declareFunction("load_computed_frequencies", "LOAD-COMPUTED-FREQUENCIES", 0, 2, false);
        declareFunction("save_computed_frequencies", "SAVE-COMPUTED-FREQUENCIES", 0, 2, false);
        declareFunction("import_frequencies_from_file", "IMPORT-FREQUENCIES-FROM-FILE", 1, 1, false);
        declareFunction("normalize_web_hit_count", "NORMALIZE-WEB-HIT-COUNT", 1, 1, false);
        declareFunction("web_hit_fht_lookup", "WEB-HIT-FHT-LOOKUP", 1, 0, false);
        declareFunction("web_hit_fht_record", "WEB-HIT-FHT-RECORD", 3, 0, false);
        declareFunction("web_hit_fht_filename", "WEB-HIT-FHT-FILENAME", 0, 0, false);
        declareFunction("create_web_hit_fht", "CREATE-WEB-HIT-FHT", 0, 0, false);
        declareFunction("web_hit_fht", "WEB-HIT-FHT", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_word_frequencies_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("frequency_of_string", "FREQUENCY-OF-STRING", 1, 2, false);
            declareFunction("load_computed_frequencies", "LOAD-COMPUTED-FREQUENCIES", 0, 2, false);
            declareFunction("save_computed_frequencies", "SAVE-COMPUTED-FREQUENCIES", 0, 2, false);
            declareFunction("import_frequencies_from_file", "IMPORT-FREQUENCIES-FROM-FILE", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("normalize_web_hit_count", "NORMALIZE-WEB-HIT-COUNT", 1, 1, false);
            declareFunction("web_hit_fht_lookup", "WEB-HIT-FHT-LOOKUP", 1, 0, false);
            declareFunction("web_hit_fht_record", "WEB-HIT-FHT-RECORD", 3, 0, false);
            declareFunction("web_hit_fht_filename", "WEB-HIT-FHT-FILENAME", 0, 0, false);
            declareFunction("create_web_hit_fht", "CREATE-WEB-HIT-FHT", 0, 0, false);
            declareFunction("web_hit_fht", "WEB-HIT-FHT", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_word_frequencies_file_Previous() {
        declareFunction("frequency_of_string", "FREQUENCY-OF-STRING", 1, 2, false);
        declareFunction("load_computed_frequencies", "LOAD-COMPUTED-FREQUENCIES", 0, 2, false);
        declareFunction("save_computed_frequencies", "SAVE-COMPUTED-FREQUENCIES", 0, 2, false);
        declareFunction("import_frequencies_from_file", "IMPORT-FREQUENCIES-FROM-FILE", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_word_frequencies_file_alt() {
        deflexical("*FREQUENCY-HASH-INITIAL-SIZE*", $int$64000);
        deflexical("*WORD-FREQUENCY-HASH*", NIL != boundp($word_frequency_hash$) ? ((SubLObject) ($word_frequency_hash$.getGlobalValue())) : make_hash_table($int$64000, symbol_function(EQUALP), UNPROVIDED));
        defparameter("*FREQUENCY-HASH-SAVE-NAME*", Filesys.construct_filename($list_alt2, $str_alt3$word_frequencies, $$$hash, T));
        defconstant("*HIGHEST-MEANINGFUL-WEB-HIT-COUNT*", $int$10000000);
        defparameter("*WEB-HIT-FREQUENCY-PATH*", list($$$data, $str_alt3$word_frequencies));
        deflexical("*WEB-HIT-FHT*", NIL);
        return NIL;
    }

    public static SubLObject init_word_frequencies_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*FREQUENCY-HASH-INITIAL-SIZE*", $int$64000);
            deflexical("*WORD-FREQUENCY-HASH*", SubLTrampolineFile.maybeDefault($word_frequency_hash$, $word_frequency_hash$, () -> make_hash_table($int$64000, symbol_function(EQUALP), UNPROVIDED)));
            defparameter("*FREQUENCY-HASH-SAVE-NAME*", Filesys.construct_filename($list2, $str3$word_frequencies, $$$hash, T));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*WORD-FREQUENCY-HASH*", NIL != boundp($word_frequency_hash$) ? ((SubLObject) ($word_frequency_hash$.getGlobalValue())) : make_hash_table($int$64000, symbol_function(EQUALP), UNPROVIDED));
            defconstant("*HIGHEST-MEANINGFUL-WEB-HIT-COUNT*", $int$10000000);
            defparameter("*WEB-HIT-FREQUENCY-PATH*", list($$$data, $str_alt3$word_frequencies));
            deflexical("*WEB-HIT-FHT*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_word_frequencies_file_Previous() {
        deflexical("*FREQUENCY-HASH-INITIAL-SIZE*", $int$64000);
        deflexical("*WORD-FREQUENCY-HASH*", SubLTrampolineFile.maybeDefault($word_frequency_hash$, $word_frequency_hash$, () -> make_hash_table($int$64000, symbol_function(EQUALP), UNPROVIDED)));
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

    static {
    }

    static private final SubLList $list_alt2 = list(makeString("data"), makeString("word-frequencies"));

    static private final SubLString $str_alt3$word_frequencies = makeString("word-frequencies");

    static private final SubLString $str_alt6$Loading_frequencies_from__a____ = makeString("Loading frequencies from ~a ...");

    static private final SubLString $str_alt8$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLInteger $int$10000000 = makeInteger(10000000);

    public static final SubLInteger $int$99 = makeInteger(99);

    static private final SubLString $str_alt11$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt12$__ = makeString(") ");

    static private final SubLString $str_alt13$_is_not_a_ = makeString(" is not a ");

    static private final SubLList $list_alt14 = list(NIL);

    static private final SubLList $list_alt15 = cons(makeSymbol("HITS"), makeSymbol("DATE"));

    static private final SubLString $$$data = makeString("data");

    static private final SubLString $str_alt19$web_hit_table = makeString("web-hit-table");

    static private final SubLString $$$fht = makeString("fht");

    public static final SubLInteger $int$10000 = makeInteger(10000);
}

/**
 * Total time: 170 ms
 */
