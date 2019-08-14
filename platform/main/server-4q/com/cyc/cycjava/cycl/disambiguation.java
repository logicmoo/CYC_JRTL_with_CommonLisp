/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DISAMBIGUATION
 * source file: /cyc/top/cycl/disambiguation.lisp
 * created:     2019/07/03 17:38:17
 */
public final class disambiguation extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt13$ = makeString("");

    public static final SubLFile me = new disambiguation();

 public static final String myName = "com.cyc.cycjava.cycl.disambiguation";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $disambiguation_term_counts$ = makeSymbol("*DISAMBIGUATION-TERM-COUNTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $disambiguation_term_counts_load_attempted$ = makeSymbol("*DISAMBIGUATION-TERM-COUNTS-LOAD-ATTEMPTED*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $disambiguation_term_counts_file$ = makeSymbol("*DISAMBIGUATION-TERM-COUNTS-FILE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $disambiguation_term_counts_lock$ = makeSymbol("*DISAMBIGUATION-TERM-COUNTS-LOCK*");

    static private final SubLString $$$Disambiguation_Term_Counts_Lock = makeString("Disambiguation Term Counts Lock");

    static private final SubLString $str2$data_sense_disambiguation_disambi = makeString("data/sense-disambiguation/disambiguation-term-counts.fht");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLInteger $int$3000 = makeInteger(3000);

    static private final SubLString $str5$Unable_to_create_disambiguation_h = makeString("Unable to create disambiguation hash table (~A).");

    static private final SubLString $str6$Disambiguation_training_data_file = makeString("Disambiguation training data file (~A) does not exist.");

    static private final SubLString $str8$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str9$processing_line__S__ = makeString("processing line ~S~%");

    static private final SubLList $list10 = list(CHAR_tab);

    private static final SubLSymbol CYCL_FROM_STRING = makeSymbol("CYCL-FROM-STRING");

    static private final SubLString $str12$_NONE = makeString(":NONE");

    static private final SubLString $str13$ = makeString("");

    static private final SubLString $$$d = makeString("d");

    static private final SubLString $$$p = makeString("p");

    static private final SubLString $$$w = makeString("w");

    static private final SubLString $str19$___________________________ = makeString(" ([^#()?]*[^#() ])( *[#()])");

    static private final SubLString $str20$___1__2 = makeString(" \"\\1\"\\2");

    static private final SubLString $str22$Labelled_file__A_does_not_exist_ = makeString("Labelled file ~A does not exist.");

    static private final SubLString $str24$d__ = makeString("d~%");

    static private final SubLString $str25$p__ = makeString("p~%");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $str27$s__ = makeString("s~%");

    static private final SubLString $str28$w_A_A_A_A = makeString("w~A~A~A~A");

    static private final SubLString $str30$_A_S = makeString("~A~S");

    static private final SubLString $str31$_A__S = makeString("~A^~S");

    static private final SubLString $str32$_A_in_term__S = makeString("~A in term ~S");

    static private final SubLString $str33$__ = makeString("~%");

    static private final SubLString $str34$Unable_to_understand_line___S = makeString("Unable to understand line: ~S");

    static private final SubLString $str35$_A__A = makeString("~A/~A");

    static private final SubLString $str36$Processing__A__ = makeString("Processing ~A~%");

    public static final SubLObject init_disambiguation_model_alt(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject loaded = NIL;
                SubLObject lock = $disambiguation_term_counts_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != $disambiguation_term_counts$.getGlobalValue()) {
                        loaded = T;
                    }
                    if ((NIL != forceP) || (NIL == $disambiguation_term_counts_load_attempted$.getGlobalValue())) {
                        $disambiguation_term_counts_load_attempted$.setGlobalValue(T);
                        if (NIL != Filesys.probe_file($disambiguation_term_counts_file$.getDynamicValue(thread))) {
                            $disambiguation_term_counts$.setGlobalValue(file_hash_table.open_file_hash_table_read_only($disambiguation_term_counts_file$.getDynamicValue(thread), symbol_function(EQUALP), $IMAGE_INDEPENDENT_CFASL));
                            if (NIL != $disambiguation_term_counts$.getGlobalValue()) {
                                loaded = T;
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return loaded;
            }
        }
    }

    public static SubLObject init_disambiguation_model(SubLObject forceP) {
        if (forceP == UNPROVIDED) {
            forceP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject loaded = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($disambiguation_term_counts_lock$.getGlobalValue());
            if (NIL != $disambiguation_term_counts$.getGlobalValue()) {
                loaded = T;
            }
            if ((NIL != forceP) || (NIL == $disambiguation_term_counts_load_attempted$.getGlobalValue())) {
                $disambiguation_term_counts_load_attempted$.setGlobalValue(T);
                if (NIL != Filesys.probe_file($disambiguation_term_counts_file$.getDynamicValue(thread))) {
                    $disambiguation_term_counts$.setGlobalValue(file_hash_table.open_file_hash_table_read_only($disambiguation_term_counts_file$.getDynamicValue(thread), symbol_function(EQUALP), $IMAGE_INDEPENDENT_CFASL));
                    if (NIL != $disambiguation_term_counts$.getGlobalValue()) {
                        loaded = T;
                    }
                }
            }
        } finally {
            if (NIL != release) {
                release_lock($disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        return loaded;
    }

    /**
     * Removes all learned data from the global disambiguation model.
     */
    @LispMethod(comment = "Removes all learned data from the global disambiguation model.")
    public static final SubLObject clear_disambiguation_model_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $disambiguation_term_counts_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    $disambiguation_term_counts$.setGlobalValue(NIL);
                    if (NIL != Filesys.probe_file($disambiguation_term_counts_file$.getDynamicValue(thread))) {
                        Filesys.delete_file($disambiguation_term_counts_file$.getDynamicValue(thread));
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Removes all learned data from the global disambiguation model.
     */
    @LispMethod(comment = "Removes all learned data from the global disambiguation model.")
    public static SubLObject clear_disambiguation_model() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($disambiguation_term_counts_lock$.getGlobalValue());
            $disambiguation_term_counts$.setGlobalValue(NIL);
            if (NIL != Filesys.probe_file($disambiguation_term_counts_file$.getDynamicValue(thread))) {
                Filesys.delete_file($disambiguation_term_counts_file$.getDynamicValue(thread));
            }
        } finally {
            if (NIL != release) {
                release_lock($disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Adds data from a file to the disambiguation model.
     *
     * @param TRAIN-FILENAME
     * 		string-p; A file created by our disambiguation labelling tool.
     */
    @LispMethod(comment = "Adds data from a file to the disambiguation model.\r\n\r\n@param TRAIN-FILENAME\r\n\t\tstring-p; A file created by our disambiguation labelling tool.")
    public static final SubLObject update_disambiguation_model_alt(SubLObject train_filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject disambiguation_term_counts_fht = NIL;
                SubLObject lock = $disambiguation_term_counts_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != Filesys.probe_file($disambiguation_term_counts_file$.getDynamicValue(thread))) {
                        disambiguation_term_counts_fht = file_hash_table.open_file_hash_table($disambiguation_term_counts_file$.getDynamicValue(thread), symbol_function(EQUALP), $IMAGE_INDEPENDENT_CFASL);
                    } else {
                        disambiguation_term_counts_fht = file_hash_table.create_file_hash_table($disambiguation_term_counts_file$.getDynamicValue(thread), $int$3000, $int$3000, symbol_function(EQUALP), $IMAGE_INDEPENDENT_CFASL);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                if (NIL == disambiguation_term_counts_fht) {
                    Errors.error($str_alt5$Unable_to_create_disambiguation_h, $disambiguation_term_counts_file$.getDynamicValue(thread));
                }
                if (NIL == Filesys.probe_file(train_filename)) {
                    Errors.error($str_alt6$Disambiguation_training_data_file, train_filename);
                }
                {
                    SubLObject file = StreamsLow.open(train_filename, EMPTY_SUBL_OBJECT_ARRAY);
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(file, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt8$Unable_to_open__S, file);
                        }
                        {
                            SubLObject infile = stream;
                            if (infile.isStream()) {
                                {
                                    SubLObject line = NIL;
                                    for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        format(T, $str_alt9$processing_line__S__, line);
                                        {
                                            SubLObject parts = string_utilities.split_string(line, $list_alt10);
                                            SubLObject filepath = parts.first();
                                            SubLObject v_document = string_utilities.string_to_integer(second(parts));
                                            SubLObject paragraph = string_utilities.string_to_integer(third(parts));
                                            SubLObject word = string_utilities.string_to_integer(fourth(parts));
                                            SubLObject labels = Mapping.mapcar(CYCL_FROM_STRING, fifth(parts).equal($str_alt12$_NONE) ? ((SubLObject) (NIL)) : nthcdr(FOUR_INTEGER, parts));
                                            SubLObject stream_1 = NIL;
                                            try {
                                                stream_1 = compatibility.open_text(filepath, $INPUT, NIL);
                                                if (!stream_1.isStream()) {
                                                    Errors.error($str_alt8$Unable_to_open__S, filepath);
                                                }
                                                {
                                                    SubLObject datafile = stream_1;
                                                    SubLObject current_document = MINUS_ONE_INTEGER;
                                                    SubLObject current_paragraph = MINUS_ONE_INTEGER;
                                                    SubLObject current_word = MINUS_ONE_INTEGER;
                                                    SubLObject line_2 = $str_alt13$;
                                                    while (current_document.numL(v_document)) {
                                                        line_2 = read_line(datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        if (line_2.equal($$$d)) {
                                                            current_document = add(ONE_INTEGER, current_document);
                                                        }
                                                    } 
                                                    while (current_paragraph.numL(paragraph)) {
                                                        line_2 = read_line(datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        if (line_2.equal($$$p)) {
                                                            current_paragraph = add(ONE_INTEGER, current_paragraph);
                                                        }
                                                    } 
                                                    while (current_word.numL(word)) {
                                                        line_2 = read_line(datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        if (NIL != string_utilities.starts_with(line_2, $$$w)) {
                                                            current_word = add(ONE_INTEGER, current_word);
                                                        }
                                                    } 
                                                    {
                                                        SubLObject word_parts = string_utilities.split_string(line_2, $list_alt10);
                                                        SubLObject token = second(word_parts);
                                                        SubLObject pos = third(word_parts);
                                                        SubLObject tags = Mapping.mapcar(CYCL_FROM_STRING, nthcdr(THREE_INTEGER, word_parts));
                                                        SubLObject cdolist_list_var = tags;
                                                        SubLObject tag = NIL;
                                                        for (tag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tag = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject lock_3 = $disambiguation_term_counts_lock$.getGlobalValue();
                                                                SubLObject release_4 = NIL;
                                                                try {
                                                                    release_4 = seize_lock(lock_3);
                                                                    {
                                                                        SubLObject old_pair = file_hash_table.get_file_hash_table(tag, disambiguation_term_counts_fht, list(ZERO_INTEGER, ZERO_INTEGER));
                                                                        SubLObject old_correct = old_pair.first();
                                                                        SubLObject old_total = second(old_pair);
                                                                        SubLObject new_total = add(ONE_INTEGER, old_total);
                                                                        if (NIL != subl_promotions.memberP(tag, labels, EQUAL, UNPROVIDED)) {
                                                                            file_hash_table.put_file_hash_table(tag, disambiguation_term_counts_fht, list(add(ONE_INTEGER, old_correct), new_total));
                                                                        } else {
                                                                            file_hash_table.put_file_hash_table(tag, disambiguation_term_counts_fht, list(old_correct, new_total));
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject token_term = list(token, tag);
                                                                        SubLObject old_pair = file_hash_table.get_file_hash_table(token_term, disambiguation_term_counts_fht, list(ZERO_INTEGER, ZERO_INTEGER));
                                                                        SubLObject old_correct = old_pair.first();
                                                                        SubLObject old_total = second(old_pair);
                                                                        SubLObject new_total = add(ONE_INTEGER, old_total);
                                                                        if (NIL != subl_promotions.memberP(tag, labels, EQUAL, UNPROVIDED)) {
                                                                            file_hash_table.put_file_hash_table(token_term, disambiguation_term_counts_fht, list(add(ONE_INTEGER, old_correct), new_total));
                                                                        } else {
                                                                            file_hash_table.put_file_hash_table(token_term, disambiguation_term_counts_fht, list(old_correct, new_total));
                                                                        }
                                                                    }
                                                                } finally {
                                                                    if (NIL != release_4) {
                                                                        release_lock(lock_3);
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
                                                        if (stream_1.isStream()) {
                                                            close(stream_1, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
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
            return NIL;
        }
    }

    /**
     * Adds data from a file to the disambiguation model.
     *
     * @param TRAIN-FILENAME
     * 		string-p; A file created by our disambiguation labelling tool.
     */
    @LispMethod(comment = "Adds data from a file to the disambiguation model.\r\n\r\n@param TRAIN-FILENAME\r\n\t\tstring-p; A file created by our disambiguation labelling tool.")
    public static SubLObject update_disambiguation_model(final SubLObject train_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject disambiguation_term_counts_fht = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($disambiguation_term_counts_lock$.getGlobalValue());
            if (NIL != Filesys.probe_file($disambiguation_term_counts_file$.getDynamicValue(thread))) {
                disambiguation_term_counts_fht = file_hash_table.open_file_hash_table($disambiguation_term_counts_file$.getDynamicValue(thread), symbol_function(EQUALP), $IMAGE_INDEPENDENT_CFASL);
            } else {
                disambiguation_term_counts_fht = file_hash_table.create_file_hash_table($disambiguation_term_counts_file$.getDynamicValue(thread), $int$3000, $int$3000, symbol_function(EQUALP), $IMAGE_INDEPENDENT_CFASL);
            }
        } finally {
            if (NIL != release) {
                release_lock($disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        if (NIL == disambiguation_term_counts_fht) {
            Errors.error($str5$Unable_to_create_disambiguation_h, $disambiguation_term_counts_file$.getDynamicValue(thread));
        }
        if (NIL == Filesys.probe_file(train_filename)) {
            Errors.error($str6$Disambiguation_training_data_file, train_filename);
        }
        final SubLObject file = StreamsLow.open(train_filename, EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str8$Unable_to_open__S, file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                SubLObject parts;
                SubLObject filepath;
                SubLObject v_document;
                SubLObject paragraph;
                SubLObject word;
                SubLObject labels;
                SubLObject stream_$1;
                SubLObject datafile;
                SubLObject current_document;
                SubLObject current_paragraph;
                SubLObject current_word;
                SubLObject line_$2;
                SubLObject word_parts;
                SubLObject token;
                SubLObject pos;
                SubLObject cdolist_list_var;
                SubLObject tags;
                SubLObject tag;
                SubLObject release_$3;
                SubLObject old_pair;
                SubLObject old_correct;
                SubLObject old_total;
                SubLObject new_total;
                SubLObject token_term;
                SubLObject old_pair2;
                SubLObject old_correct2;
                SubLObject old_total2;
                SubLObject new_total2;
                SubLObject _prev_bind_2;
                SubLObject _values;
                for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    format(T, $str9$processing_line__S__, line);
                    parts = string_utilities.split_string(line, $list10);
                    filepath = parts.first();
                    v_document = string_utilities.string_to_integer(second(parts));
                    paragraph = string_utilities.string_to_integer(third(parts));
                    word = string_utilities.string_to_integer(fourth(parts));
                    labels = Mapping.mapcar(CYCL_FROM_STRING, fifth(parts).equal($str12$_NONE) ? NIL : nthcdr(FOUR_INTEGER, parts));
                    stream_$1 = NIL;
                    try {
                        stream_$1 = compatibility.open_text(filepath, $INPUT);
                        if (!stream_$1.isStream()) {
                            Errors.error($str8$Unable_to_open__S, filepath);
                        }
                        datafile = stream_$1;
                        current_document = MINUS_ONE_INTEGER;
                        current_paragraph = MINUS_ONE_INTEGER;
                        current_word = MINUS_ONE_INTEGER;
                        line_$2 = $str13$;
                        while (current_document.numL(v_document)) {
                            line_$2 = string_utilities.network_read_line(datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (line_$2.equal($$$d)) {
                                current_document = add(ONE_INTEGER, current_document);
                            }
                        } 
                        while (current_paragraph.numL(paragraph)) {
                            line_$2 = string_utilities.network_read_line(datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (line_$2.equal($$$p)) {
                                current_paragraph = add(ONE_INTEGER, current_paragraph);
                            }
                        } 
                        while (current_word.numL(word)) {
                            line_$2 = string_utilities.network_read_line(datafile, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != string_utilities.starts_with(line_$2, $$$w)) {
                                current_word = add(ONE_INTEGER, current_word);
                            }
                        } 
                        word_parts = string_utilities.split_string(line_$2, $list10);
                        token = second(word_parts);
                        pos = third(word_parts);
                        tags = cdolist_list_var = Mapping.mapcar(CYCL_FROM_STRING, nthcdr(THREE_INTEGER, word_parts));
                        tag = NIL;
                        tag = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            release_$3 = NIL;
                            try {
                                release_$3 = seize_lock($disambiguation_term_counts_lock$.getGlobalValue());
                                old_pair = file_hash_table.get_file_hash_table(tag, disambiguation_term_counts_fht, list(ZERO_INTEGER, ZERO_INTEGER));
                                old_correct = old_pair.first();
                                old_total = second(old_pair);
                                new_total = add(ONE_INTEGER, old_total);
                                if (NIL != subl_promotions.memberP(tag, labels, EQUAL, UNPROVIDED)) {
                                    file_hash_table.put_file_hash_table(tag, disambiguation_term_counts_fht, list(add(ONE_INTEGER, old_correct), new_total));
                                } else {
                                    file_hash_table.put_file_hash_table(tag, disambiguation_term_counts_fht, list(old_correct, new_total));
                                }
                                token_term = list(token, tag);
                                old_pair2 = file_hash_table.get_file_hash_table(token_term, disambiguation_term_counts_fht, list(ZERO_INTEGER, ZERO_INTEGER));
                                old_correct2 = old_pair2.first();
                                old_total2 = second(old_pair2);
                                new_total2 = add(ONE_INTEGER, old_total2);
                                if (NIL != subl_promotions.memberP(tag, labels, EQUAL, UNPROVIDED)) {
                                    file_hash_table.put_file_hash_table(token_term, disambiguation_term_counts_fht, list(add(ONE_INTEGER, old_correct2), new_total2));
                                } else {
                                    file_hash_table.put_file_hash_table(token_term, disambiguation_term_counts_fht, list(old_correct2, new_total2));
                                }
                            } finally {
                                if (NIL != release_$3) {
                                    release_lock($disambiguation_term_counts_lock$.getGlobalValue());
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            tag = cdolist_list_var.first();
                        } 
                    } finally {
                        _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            _values = getValuesAsVector();
                            if (stream_$1.isStream()) {
                                close(stream_$1, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    /**
     * Gets the prior probability of a Cyc term appearing in a document.
     *
     * @param TERM
     * 		el-term-p; Any term.
     */
    @LispMethod(comment = "Gets the prior probability of a Cyc term appearing in a document.\r\n\r\n@param TERM\r\n\t\tel-term-p; Any term.")
    public static final SubLObject get_disambiguation_prior_alt(SubLObject v_term) {
        if (NIL == com.cyc.cycjava.cycl.disambiguation.init_disambiguation_model(NIL)) {
            return NIL;
        }
        {
            SubLObject probability = NIL;
            SubLObject lock = $disambiguation_term_counts_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject pair = file_hash_table.get_file_hash_table(v_term, $disambiguation_term_counts$.getGlobalValue(), list(ZERO_INTEGER, ZERO_INTEGER));
                    SubLObject correct = pair.first();
                    SubLObject total = second(pair);
                    if (total.numG(ZERO_INTEGER)) {
                        probability = divide(correct, total);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return probability;
        }
    }

    /**
     * Gets the prior probability of a Cyc term appearing in a document.
     *
     * @param TERM
     * 		el-term-p; Any term.
     */
    @LispMethod(comment = "Gets the prior probability of a Cyc term appearing in a document.\r\n\r\n@param TERM\r\n\t\tel-term-p; Any term.")
    public static SubLObject get_disambiguation_prior(final SubLObject v_term) {
        if (NIL == init_disambiguation_model(NIL)) {
            return NIL;
        }
        SubLObject probability = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($disambiguation_term_counts_lock$.getGlobalValue());
            final SubLObject pair = file_hash_table.get_file_hash_table(v_term, $disambiguation_term_counts$.getGlobalValue(), list(ZERO_INTEGER, ZERO_INTEGER));
            final SubLObject correct = pair.first();
            final SubLObject total = second(pair);
            if (total.numG(ZERO_INTEGER)) {
                probability = divide(correct, total);
            }
        } finally {
            if (NIL != release) {
                release_lock($disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        return probability;
    }

    /**
     * Gets the probability p( TERM is correct | TOKEN and TERM ) based on the training data.
     */
    @LispMethod(comment = "Gets the probability p( TERM is correct | TOKEN and TERM ) based on the training data.")
    public static final SubLObject get_disambiguation_probability_alt(SubLObject v_term, SubLObject token) {
        if (NIL == com.cyc.cycjava.cycl.disambiguation.init_disambiguation_model(NIL)) {
            return NIL;
        }
        {
            SubLObject probability = NIL;
            SubLObject lock = $disambiguation_term_counts_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject pair = file_hash_table.get_file_hash_table(list(token, v_term), $disambiguation_term_counts$.getGlobalValue(), list(ZERO_INTEGER, ZERO_INTEGER));
                    SubLObject correct = pair.first();
                    SubLObject total = second(pair);
                    if (total.numG(ZERO_INTEGER)) {
                        probability = divide(correct, total);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return probability;
        }
    }

    /**
     * Gets the probability p( TERM is correct | TOKEN and TERM ) based on the training data.
     */
    @LispMethod(comment = "Gets the probability p( TERM is correct | TOKEN and TERM ) based on the training data.")
    public static SubLObject get_disambiguation_probability(final SubLObject v_term, final SubLObject token) {
        if (NIL == init_disambiguation_model(NIL)) {
            return NIL;
        }
        SubLObject probability = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($disambiguation_term_counts_lock$.getGlobalValue());
            final SubLObject pair = file_hash_table.get_file_hash_table(list(token, v_term), $disambiguation_term_counts$.getGlobalValue(), list(ZERO_INTEGER, ZERO_INTEGER));
            final SubLObject correct = pair.first();
            final SubLObject total = second(pair);
            if (total.numG(ZERO_INTEGER)) {
                probability = divide(correct, total);
            }
        } finally {
            if (NIL != release) {
                release_lock($disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        return probability;
    }

    /**
     * Disambiguates a word by setting weights on its interps.
     *
     * @param WORD
    word-p;
     * 		
     * @return WORD; The modified word data structure.
     */
    @LispMethod(comment = "Disambiguates a word by setting weights on its interps.\r\n\r\n@param WORD\nword-p;\r\n\t\t\r\n@return WORD; The modified word data structure.")
    public static final SubLObject disambiguate_word_alt(SubLObject word) {
        {
            SubLObject cdolist_list_var = document.word_interps(word);
            SubLObject interp = NIL;
            for (interp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interp = cdolist_list_var.first()) {
                {
                    SubLObject cycl = nl_api_datastructures.get_nl_interp_cycl(interp);
                    SubLObject prior = com.cyc.cycjava.cycl.disambiguation.get_disambiguation_prior(cycl);
                    if (NIL != prior) {
                        interp = putf(interp, $WEIGHT, prior);
                    }
                }
            }
        }
        return word;
    }

    /**
     * Disambiguates a word by setting weights on its interps.
     *
     * @param WORD
    		word-p;
     * 		
     * @return WORD; The modified word data structure.
     */
    @LispMethod(comment = "Disambiguates a word by setting weights on its interps.\r\n\r\n@param WORD\n\t\tword-p;\r\n\t\t\r\n@return WORD; The modified word data structure.")
    public static SubLObject disambiguate_word(final SubLObject word) {
        SubLObject cdolist_list_var = document.word_interps(word);
        SubLObject interp = NIL;
        interp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl = nl_api_datastructures.get_nl_interp_cycl(interp);
            final SubLObject prior = get_disambiguation_prior(cycl);
            if (NIL != prior) {
                interp = putf(interp, $WEIGHT, prior);
            }
            cdolist_list_var = cdolist_list_var.rest();
            interp = cdolist_list_var.first();
        } 
        return word;
    }/**
     * Disambiguates a word by setting weights on its interps.
     *
     * @param WORD
    		word-p;
     * 		
     * @return WORD; The modified word data structure.
     */


    /**
     * Disambiguates the words in SENTENCE by setting weights on their interps.
     *
     * @param SENTENCE
    sentence-p;
     * 		
     * @return WORD; The modified sentence data structure.
     */
    @LispMethod(comment = "Disambiguates the words in SENTENCE by setting weights on their interps.\r\n\r\n@param SENTENCE\nsentence-p;\r\n\t\t\r\n@return WORD; The modified sentence data structure.")
    public static final SubLObject disambiguate_sentence_alt(SubLObject sentence) {
        {
            SubLObject vector_var = document.sentence_yield(sentence);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    com.cyc.cycjava.cycl.disambiguation.disambiguate_word(word);
                }
            }
        }
        return sentence;
    }

    /**
     * Disambiguates the words in SENTENCE by setting weights on their interps.
     *
     * @param SENTENCE
    		sentence-p;
     * 		
     * @return WORD; The modified sentence data structure.
     */
    @LispMethod(comment = "Disambiguates the words in SENTENCE by setting weights on their interps.\r\n\r\n@param SENTENCE\n\t\tsentence-p;\r\n\t\t\r\n@return WORD; The modified sentence data structure.")
    public static SubLObject disambiguate_sentence(final SubLObject sentence) {
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            disambiguate_word(word);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return sentence;
    }/**
     * Disambiguates the words in SENTENCE by setting weights on their interps.
     *
     * @param SENTENCE
    		sentence-p;
     * 		
     * @return WORD; The modified sentence data structure.
     */


    /**
     * Disambiguates the words in PARAGRAPH by setting weights on their interps.
     *
     * @param PARAGRAPH
    paragraph-p;
     * 		
     * @return WORD; The modified paragraph data structure.
     */
    @LispMethod(comment = "Disambiguates the words in PARAGRAPH by setting weights on their interps.\r\n\r\n@param PARAGRAPH\nparagraph-p;\r\n\t\t\r\n@return WORD; The modified paragraph data structure.")
    public static final SubLObject disambiguate_paragraph_alt(SubLObject paragraph) {
        {
            SubLObject vector_var = document.paragraph_sentences(paragraph);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject sentence = aref(vector_var, element_num);
                    SubLObject vector_var_5 = document.sentence_yield(sentence);
                    SubLObject backwardP_var_6 = NIL;
                    SubLObject length_7 = length(vector_var_5);
                    SubLObject v_iteration_8 = NIL;
                    for (v_iteration_8 = ZERO_INTEGER; v_iteration_8.numL(length_7); v_iteration_8 = add(v_iteration_8, ONE_INTEGER)) {
                        {
                            SubLObject element_num_9 = (NIL != backwardP_var_6) ? ((SubLObject) (subtract(length_7, v_iteration_8, ONE_INTEGER))) : v_iteration_8;
                            SubLObject word = aref(vector_var_5, element_num_9);
                            com.cyc.cycjava.cycl.disambiguation.disambiguate_word(word);
                        }
                    }
                }
            }
        }
        return paragraph;
    }

    /**
     * Disambiguates the words in PARAGRAPH by setting weights on their interps.
     *
     * @param PARAGRAPH
    		paragraph-p;
     * 		
     * @return WORD; The modified paragraph data structure.
     */
    @LispMethod(comment = "Disambiguates the words in PARAGRAPH by setting weights on their interps.\r\n\r\n@param PARAGRAPH\n\t\tparagraph-p;\r\n\t\t\r\n@return WORD; The modified paragraph data structure.")
    public static SubLObject disambiguate_paragraph(final SubLObject paragraph) {
        final SubLObject vector_var = document.paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            cdolist_list_var = document.sentence_yield_exhaustive(sentence);
            word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                disambiguate_word(word);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        return paragraph;
    }/**
     * Disambiguates the words in PARAGRAPH by setting weights on their interps.
     *
     * @param PARAGRAPH
    		paragraph-p;
     * 		
     * @return WORD; The modified paragraph data structure.
     */


    /**
     * Disambiguates the words in DOCUMENT by setting weights on their interps.
     *
     * @param DOCUMENT
    document-p;
     * 		
     * @return WORD; The modified document data structure.
     */
    @LispMethod(comment = "Disambiguates the words in DOCUMENT by setting weights on their interps.\r\n\r\n@param DOCUMENT\ndocument-p;\r\n\t\t\r\n@return WORD; The modified document data structure.")
    public static final SubLObject disambiguate_document_alt(SubLObject v_document) {
        {
            SubLObject vector_var = document.document_paragraphs(v_document);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    SubLObject vector_var_10 = document.paragraph_sentences(paragraph);
                    SubLObject backwardP_var_11 = NIL;
                    SubLObject length_12 = length(vector_var_10);
                    SubLObject v_iteration_13 = NIL;
                    for (v_iteration_13 = ZERO_INTEGER; v_iteration_13.numL(length_12); v_iteration_13 = add(v_iteration_13, ONE_INTEGER)) {
                        {
                            SubLObject element_num_14 = (NIL != backwardP_var_11) ? ((SubLObject) (subtract(length_12, v_iteration_13, ONE_INTEGER))) : v_iteration_13;
                            SubLObject sentence = aref(vector_var_10, element_num_14);
                            SubLObject vector_var_15 = document.sentence_yield(sentence);
                            SubLObject backwardP_var_16 = NIL;
                            SubLObject length_17 = length(vector_var_15);
                            SubLObject v_iteration_18 = NIL;
                            for (v_iteration_18 = ZERO_INTEGER; v_iteration_18.numL(length_17); v_iteration_18 = add(v_iteration_18, ONE_INTEGER)) {
                                {
                                    SubLObject element_num_19 = (NIL != backwardP_var_16) ? ((SubLObject) (subtract(length_17, v_iteration_18, ONE_INTEGER))) : v_iteration_18;
                                    SubLObject word = aref(vector_var_15, element_num_19);
                                    com.cyc.cycjava.cycl.disambiguation.disambiguate_word(word);
                                }
                            }
                        }
                    }
                }
            }
        }
        return v_document;
    }

    /**
     * Disambiguates the words in DOCUMENT by setting weights on their interps.
     *
     * @param DOCUMENT
    		document-p;
     * 		
     * @return WORD; The modified document data structure.
     */
    @LispMethod(comment = "Disambiguates the words in DOCUMENT by setting weights on their interps.\r\n\r\n@param DOCUMENT\n\t\tdocument-p;\r\n\t\t\r\n@return WORD; The modified document data structure.")
    public static SubLObject disambiguate_document(final SubLObject v_document) {
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$4;
        SubLObject backwardP_var_$5;
        SubLObject length_$6;
        SubLObject v_iteration_$7;
        SubLObject element_num_$8;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$4 = document.paragraph_sentences(paragraph);
            backwardP_var_$5 = NIL;
            for (length_$6 = length(vector_var_$4), v_iteration_$7 = NIL, v_iteration_$7 = ZERO_INTEGER; v_iteration_$7.numL(length_$6); v_iteration_$7 = add(v_iteration_$7, ONE_INTEGER)) {
                element_num_$8 = (NIL != backwardP_var_$5) ? subtract(length_$6, v_iteration_$7, ONE_INTEGER) : v_iteration_$7;
                sentence = aref(vector_var_$4, element_num_$8);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    disambiguate_word(word);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return v_document;
    }/**
     * Disambiguates the words in DOCUMENT by setting weights on their interps.
     *
     * @param DOCUMENT
    		document-p;
     * 		
     * @return WORD; The modified document data structure.
     */


    public static final SubLObject fix_missing_quotes_alt(SubLObject term_string) {
        SubLTrampolineFile.checkType(term_string, STRINGP);
        {
            SubLObject regex = regular_expressions.compile_regular_expression($str_alt19$___________________________, UNPROVIDED);
            return regular_expression_utilities.regex_subst(regex, $str_alt20$___1__2, term_string, UNPROVIDED);
        }
    }

    public static SubLObject fix_missing_quotes(final SubLObject term_string) {
        assert NIL != stringp(term_string) : "! stringp(term_string) " + ("Types.stringp(term_string) " + "CommonSymbols.NIL != Types.stringp(term_string) ") + term_string;
        final SubLObject regex = regular_expressions.compile_regular_expression($str19$___________________________, UNPROVIDED);
        return regular_expression_utilities.regex_subst(regex, $str20$___1__2, term_string, UNPROVIDED);
    }

    public static final SubLObject add_upward_closure_to_labelled_file_alt(SubLObject input_filename, SubLObject output_filename, SubLObject missing_terms) {
        if (missing_terms == UNPROVIDED) {
            missing_terms = NIL;
        }
        if (NIL != missing_terms) {
            SubLTrampolineFile.checkType(missing_terms, HASH_TABLE_P);
        }
        if (NIL == Filesys.probe_file(input_filename)) {
            Errors.error($str_alt22$Labelled_file__A_does_not_exist_, input_filename);
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(input_filename, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt8$Unable_to_open__S, input_filename);
                }
                {
                    SubLObject in = stream;
                    SubLObject stream_20 = NIL;
                    try {
                        stream_20 = compatibility.open_text(output_filename, $OUTPUT, NIL);
                        if (!stream_20.isStream()) {
                            Errors.error($str_alt8$Unable_to_open__S, output_filename);
                        }
                        {
                            SubLObject out = stream_20;
                            SubLObject stream_21 = NIL;
                            try {
                                stream_21 = compatibility.open_text(in, $INPUT, NIL);
                                if (!stream_21.isStream()) {
                                    Errors.error($str_alt8$Unable_to_open__S, in);
                                }
                                {
                                    SubLObject infile = stream_21;
                                    if (infile.isStream()) {
                                        {
                                            SubLObject line = NIL;
                                            for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                                {
                                                    SubLObject parts = string_utilities.split_string(line, $list_alt10);
                                                    if (line.equal($$$d)) {
                                                        format(out, $str_alt24$d__);
                                                    } else {
                                                        if (line.equal($$$p)) {
                                                            format(out, $str_alt25$p__);
                                                        } else {
                                                            if (line.equal($$$s)) {
                                                                format(out, $str_alt27$s__);
                                                            } else {
                                                                if (parts.first().equal($$$w)) {
                                                                    format(out, $str_alt28$w_A_A_A_A, new SubLObject[]{ CHAR_tab, second(parts), CHAR_tab, third(parts) });
                                                                    {
                                                                        SubLObject cdolist_list_var = nthcdr(THREE_INTEGER, parts);
                                                                        SubLObject term_string = NIL;
                                                                        for (term_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_string = cdolist_list_var.first()) {
                                                                            {
                                                                                SubLObject error_string = NIL;
                                                                                try {
                                                                                    {
                                                                                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                                                                        try {
                                                                                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                                                                            try {
                                                                                                {
                                                                                                    SubLObject v_term = read_from_string(com.cyc.cycjava.cycl.disambiguation.fix_missing_quotes(term_string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    SubLObject upward_closure = (NIL != fort_types_interface.collectionP(v_term)) ? ((SubLObject) (genls.all_genls(v_term, UNPROVIDED, UNPROVIDED))) : isa.all_isa(v_term, UNPROVIDED, UNPROVIDED);
                                                                                                    format(out, $str_alt30$_A_S, CHAR_tab, cycl_utilities.hl_to_el(v_term));
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_22 = upward_closure;
                                                                                                        SubLObject parent = NIL;
                                                                                                        for (parent = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , parent = cdolist_list_var_22.first()) {
                                                                                                            format(out, $str_alt31$_A__S, CHAR_tab, cycl_utilities.hl_to_el(parent));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable catch_var) {
                                                                                                Errors.handleThrowable(catch_var, NIL);
                                                                                            }
                                                                                        } finally {
                                                                                            rebind(Errors.$error_handler$, _prev_bind_0);
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable ccatch_env_var) {
                                                                                    error_string = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                                                }
                                                                                if (NIL != error_string) {
                                                                                    if (NIL != missing_terms) {
                                                                                        sethash(term_string, missing_terms, T);
                                                                                    } else {
                                                                                        Errors.warn($str_alt32$_A_in_term__S, error_string, term_string);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    format(out, $str_alt33$__);
                                                                } else {
                                                                    Errors.error($str_alt34$Unable_to_understand_line___S, line);
                                                                }
                                                            }
                                                        }
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
                                        if (stream_21.isStream()) {
                                            close(stream_21, UNPROVIDED);
                                        }
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream_20.isStream()) {
                                    close(stream_20, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
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
        return NIL;
    }

    public static SubLObject add_upward_closure_to_labelled_file(final SubLObject input_filename, final SubLObject output_filename, SubLObject missing_terms) {
        if (missing_terms == UNPROVIDED) {
            missing_terms = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != missing_terms) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hash_table_p(missing_terms))) {
            throw new AssertionError(missing_terms);
        }
        if (NIL == Filesys.probe_file(input_filename)) {
            Errors.error($str22$Labelled_file__A_does_not_exist_, input_filename);
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(input_filename, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str8$Unable_to_open__S, input_filename);
            }
            final SubLObject in = stream;
            SubLObject stream_$9 = NIL;
            try {
                stream_$9 = compatibility.open_text(output_filename, $OUTPUT);
                if (!stream_$9.isStream()) {
                    Errors.error($str8$Unable_to_open__S, output_filename);
                }
                final SubLObject out = stream_$9;
                SubLObject stream_$10 = NIL;
                try {
                    final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream_$10 = compatibility.open_text(in, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                    }
                    if (!stream_$10.isStream()) {
                        Errors.error($str8$Unable_to_open__S, in);
                    }
                    final SubLObject infile = stream_$10;
                    if (infile.isStream()) {
                        SubLObject line;
                        SubLObject parts;
                        SubLObject cdolist_list_var;
                        SubLObject term_string;
                        SubLObject error_string;
                        SubLObject _prev_bind_2;
                        SubLObject v_term;
                        SubLObject upward_closure;
                        SubLObject cdolist_list_var_$11;
                        SubLObject parent;
                        for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                            parts = string_utilities.split_string(line, $list10);
                            if (line.equal($$$d)) {
                                format(out, $str24$d__);
                            } else
                                if (line.equal($$$p)) {
                                    format(out, $str25$p__);
                                } else
                                    if (line.equal($$$s)) {
                                        format(out, $str27$s__);
                                    } else
                                        if (parts.first().equal($$$w)) {
                                            format(out, $str28$w_A_A_A_A, new SubLObject[]{ CHAR_tab, second(parts), CHAR_tab, third(parts) });
                                            cdolist_list_var = nthcdr(THREE_INTEGER, parts);
                                            term_string = NIL;
                                            term_string = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                error_string = NIL;
                                                try {
                                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                    _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            v_term = read_from_string(fix_missing_quotes(term_string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            upward_closure = (NIL != fort_types_interface.collectionP(v_term)) ? genls.all_genls(v_term, UNPROVIDED, UNPROVIDED) : isa.all_isa(v_term, UNPROVIDED, UNPROVIDED);
                                                            format(out, $str30$_A_S, CHAR_tab, cycl_utilities.hl_to_el(v_term));
                                                            cdolist_list_var_$11 = upward_closure;
                                                            parent = NIL;
                                                            parent = cdolist_list_var_$11.first();
                                                            while (NIL != cdolist_list_var_$11) {
                                                                format(out, $str31$_A__S, CHAR_tab, cycl_utilities.hl_to_el(parent));
                                                                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                                                                parent = cdolist_list_var_$11.first();
                                                            } 
                                                        } catch (final Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                                                    }
                                                } catch (final Throwable ccatch_env_var) {
                                                    error_string = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                } finally {
                                                    thread.throwStack.pop();
                                                }
                                                if (NIL != error_string) {
                                                    if (NIL != missing_terms) {
                                                        sethash(term_string, missing_terms, T);
                                                    } else {
                                                        Errors.warn($str32$_A_in_term__S, error_string, term_string);
                                                    }
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                term_string = cdolist_list_var.first();
                                            } 
                                            format(out, $str33$__);
                                        } else {
                                            Errors.error($str34$Unable_to_understand_line___S, line);
                                        }



                        }
                    }
                } finally {
                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream_$10.isStream()) {
                            close(stream_$10, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream_$9.isStream()) {
                        close(stream_$9, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject add_upward_closure_to_labelled_directory_alt(SubLObject input_directory, SubLObject output_directory, SubLObject missing_terms) {
        if (missing_terms == UNPROVIDED) {
            missing_terms = NIL;
        }
        {
            SubLObject cdolist_list_var = Filesys.directory(input_directory, UNPROVIDED);
            SubLObject filename = NIL;
            for (filename = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filename = cdolist_list_var.first()) {
                {
                    SubLObject input_filename = format(NIL, $str_alt35$_A__A, input_directory, filename);
                    SubLObject output_filename = format(NIL, $str_alt35$_A__A, output_directory, filename);
                    format(T, $str_alt36$Processing__A__, input_filename);
                    com.cyc.cycjava.cycl.disambiguation.add_upward_closure_to_labelled_file(input_filename, output_filename, missing_terms);
                }
            }
        }
        return NIL;
    }

    public static SubLObject add_upward_closure_to_labelled_directory(final SubLObject input_directory, final SubLObject output_directory, SubLObject missing_terms) {
        if (missing_terms == UNPROVIDED) {
            missing_terms = NIL;
        }
        SubLObject cdolist_list_var = Filesys.directory(input_directory, UNPROVIDED);
        SubLObject filename = NIL;
        filename = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject input_filename = format(NIL, $str35$_A__A, input_directory, filename);
            final SubLObject output_filename = format(NIL, $str35$_A__A, output_directory, filename);
            format(T, $str36$Processing__A__, input_filename);
            add_upward_closure_to_labelled_file(input_filename, output_filename, missing_terms);
            cdolist_list_var = cdolist_list_var.rest();
            filename = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_disambiguation_file() {
        declareFunction("init_disambiguation_model", "INIT-DISAMBIGUATION-MODEL", 0, 1, false);
        declareFunction("clear_disambiguation_model", "CLEAR-DISAMBIGUATION-MODEL", 0, 0, false);
        declareFunction("update_disambiguation_model", "UPDATE-DISAMBIGUATION-MODEL", 1, 0, false);
        declareFunction("get_disambiguation_prior", "GET-DISAMBIGUATION-PRIOR", 1, 0, false);
        declareFunction("get_disambiguation_probability", "GET-DISAMBIGUATION-PROBABILITY", 2, 0, false);
        declareFunction("disambiguate_word", "DISAMBIGUATE-WORD", 1, 0, false);
        declareFunction("disambiguate_sentence", "DISAMBIGUATE-SENTENCE", 1, 0, false);
        declareFunction("disambiguate_paragraph", "DISAMBIGUATE-PARAGRAPH", 1, 0, false);
        declareFunction("disambiguate_document", "DISAMBIGUATE-DOCUMENT", 1, 0, false);
        declareFunction("fix_missing_quotes", "FIX-MISSING-QUOTES", 1, 0, false);
        declareFunction("add_upward_closure_to_labelled_file", "ADD-UPWARD-CLOSURE-TO-LABELLED-FILE", 2, 1, false);
        declareFunction("add_upward_closure_to_labelled_directory", "ADD-UPWARD-CLOSURE-TO-LABELLED-DIRECTORY", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_disambiguation_file_alt() {
        deflexical("*DISAMBIGUATION-TERM-COUNTS*", NIL);
        deflexical("*DISAMBIGUATION-TERM-COUNTS-LOAD-ATTEMPTED*", NIL);
        deflexical("*DISAMBIGUATION-TERM-COUNTS-LOCK*", NIL != boundp($disambiguation_term_counts_lock$) ? ((SubLObject) ($disambiguation_term_counts_lock$.getGlobalValue())) : make_lock($$$Disambiguation_Term_Counts_Lock));
        defparameter("*DISAMBIGUATION-TERM-COUNTS-FILE*", $str_alt2$data_sense_disambiguation_disambi);
        return NIL;
    }

    public static SubLObject init_disambiguation_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*DISAMBIGUATION-TERM-COUNTS*", NIL);
            deflexical("*DISAMBIGUATION-TERM-COUNTS-LOAD-ATTEMPTED*", NIL);
            deflexical("*DISAMBIGUATION-TERM-COUNTS-LOCK*", SubLTrampolineFile.maybeDefault($disambiguation_term_counts_lock$, $disambiguation_term_counts_lock$, () -> make_lock($$$Disambiguation_Term_Counts_Lock)));
            defparameter("*DISAMBIGUATION-TERM-COUNTS-FILE*", $str2$data_sense_disambiguation_disambi);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*DISAMBIGUATION-TERM-COUNTS-LOCK*", NIL != boundp($disambiguation_term_counts_lock$) ? ((SubLObject) ($disambiguation_term_counts_lock$.getGlobalValue())) : make_lock($$$Disambiguation_Term_Counts_Lock));
        }
        return NIL;
    }

    public static SubLObject init_disambiguation_file_Previous() {
        deflexical("*DISAMBIGUATION-TERM-COUNTS*", NIL);
        deflexical("*DISAMBIGUATION-TERM-COUNTS-LOAD-ATTEMPTED*", NIL);
        deflexical("*DISAMBIGUATION-TERM-COUNTS-LOCK*", SubLTrampolineFile.maybeDefault($disambiguation_term_counts_lock$, $disambiguation_term_counts_lock$, () -> make_lock($$$Disambiguation_Term_Counts_Lock)));
        defparameter("*DISAMBIGUATION-TERM-COUNTS-FILE*", $str2$data_sense_disambiguation_disambi);
        return NIL;
    }

    public static SubLObject setup_disambiguation_file() {
        declare_defglobal($disambiguation_term_counts_lock$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_disambiguation_file();
    }

    @Override
    public void initializeVariables() {
        init_disambiguation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_disambiguation_file();
    }

    static {
    }

    static private final SubLString $str_alt2$data_sense_disambiguation_disambi = makeString("data/sense-disambiguation/disambiguation-term-counts.fht");

    static private final SubLString $str_alt5$Unable_to_create_disambiguation_h = makeString("Unable to create disambiguation hash table (~A).");

    static private final SubLString $str_alt6$Disambiguation_training_data_file = makeString("Disambiguation training data file (~A) does not exist.");

    static private final SubLString $str_alt8$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt9$processing_line__S__ = makeString("processing line ~S~%");

    static private final SubLList $list_alt10 = list(CHAR_tab);

    static private final SubLString $str_alt12$_NONE = makeString(":NONE");

    static private final SubLString $str_alt19$___________________________ = makeString(" ([^#()?]*[^#() ])( *[#()])");

    static private final SubLString $str_alt20$___1__2 = makeString(" \"\\1\"\\2");

    static private final SubLString $str_alt22$Labelled_file__A_does_not_exist_ = makeString("Labelled file ~A does not exist.");

    static private final SubLString $str_alt24$d__ = makeString("d~%");

    static private final SubLString $str_alt25$p__ = makeString("p~%");

    static private final SubLString $str_alt27$s__ = makeString("s~%");

    static private final SubLString $str_alt28$w_A_A_A_A = makeString("w~A~A~A~A");

    static private final SubLString $str_alt30$_A_S = makeString("~A~S");

    static private final SubLString $str_alt31$_A__S = makeString("~A^~S");

    static private final SubLString $str_alt32$_A_in_term__S = makeString("~A in term ~S");

    static private final SubLString $str_alt33$__ = makeString("~%");

    static private final SubLString $str_alt34$Unable_to_understand_line___S = makeString("Unable to understand line: ~S");

    static private final SubLString $str_alt35$_A__A = makeString("~A/~A");

    static private final SubLString $str_alt36$Processing__A__ = makeString("Processing ~A~%");
}

/**
 * Total time: 436 ms synthetic
 */
