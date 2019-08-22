package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class disambiguation extends SubLTranslatedFile {
    public static final SubLFile me = new disambiguation();

    public static final String myName = "com.cyc.cycjava.cycl.disambiguation";

    public static final String myFingerPrint = "69e8f22d236bc99d21380dba861e8087abf02d74be2f46cdf258bacef19d58f4";

    // deflexical
    public static final SubLSymbol $disambiguation_term_counts$ = makeSymbol("*DISAMBIGUATION-TERM-COUNTS*");

    // deflexical
    public static final SubLSymbol $disambiguation_term_counts_load_attempted$ = makeSymbol("*DISAMBIGUATION-TERM-COUNTS-LOAD-ATTEMPTED*");



    // defparameter
    public static final SubLSymbol $disambiguation_term_counts_file$ = makeSymbol("*DISAMBIGUATION-TERM-COUNTS-FILE*");

    // Internal Constants
    public static final SubLSymbol $disambiguation_term_counts_lock$ = makeSymbol("*DISAMBIGUATION-TERM-COUNTS-LOCK*");

    public static final SubLString $$$Disambiguation_Term_Counts_Lock = makeString("Disambiguation Term Counts Lock");

    public static final SubLString $str2$data_sense_disambiguation_disambi = makeString("data/sense-disambiguation/disambiguation-term-counts.fht");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLInteger $int$3000 = makeInteger(3000);

    public static final SubLString $str5$Unable_to_create_disambiguation_h = makeString("Unable to create disambiguation hash table (~A).");

    public static final SubLString $str6$Disambiguation_training_data_file = makeString("Disambiguation training data file (~A) does not exist.");



    public static final SubLString $str8$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $str9$processing_line__S__ = makeString("processing line ~S~%");

    public static final SubLList $list10 = list(CHAR_tab);

    public static final SubLSymbol CYCL_FROM_STRING = makeSymbol("CYCL-FROM-STRING");

    public static final SubLString $str12$_NONE = makeString(":NONE");

    public static final SubLString $str13$ = makeString("");

    public static final SubLString $$$d = makeString("d");

    public static final SubLString $$$p = makeString("p");

    public static final SubLString $$$w = makeString("w");





    public static final SubLString $str19$___________________________ = makeString(" ([^#()?]*[^#() ])( *[#()])");

    public static final SubLString $str20$___1__2 = makeString(" \"\\1\"\\2");



    public static final SubLString $str22$Labelled_file__A_does_not_exist_ = makeString("Labelled file ~A does not exist.");



    public static final SubLString $str24$d__ = makeString("d~%");

    public static final SubLString $str25$p__ = makeString("p~%");

    public static final SubLString $$$s = makeString("s");

    public static final SubLString $str27$s__ = makeString("s~%");

    public static final SubLString $str28$w_A_A_A_A = makeString("w~A~A~A~A");



    public static final SubLString $str30$_A_S = makeString("~A~S");

    public static final SubLString $str31$_A__S = makeString("~A^~S");

    public static final SubLString $str32$_A_in_term__S = makeString("~A in term ~S");

    public static final SubLString $str33$__ = makeString("~%");

    public static final SubLString $str34$Unable_to_understand_line___S = makeString("Unable to understand line: ~S");

    public static final SubLString $str35$_A__A = makeString("~A/~A");

    public static final SubLString $str36$Processing__A__ = makeString("Processing ~A~%");

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
    }

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
    }

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
    }

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
    }

    public static SubLObject fix_missing_quotes(final SubLObject term_string) {
        assert NIL != stringp(term_string) : "Types.stringp(term_string) " + "CommonSymbols.NIL != Types.stringp(term_string) " + term_string;
        final SubLObject regex = regular_expressions.compile_regular_expression($str19$___________________________, UNPROVIDED);
        return regular_expression_utilities.regex_subst(regex, $str20$___1__2, term_string, UNPROVIDED);
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
        declareFunction(me, "init_disambiguation_model", "INIT-DISAMBIGUATION-MODEL", 0, 1, false);
        declareFunction(me, "clear_disambiguation_model", "CLEAR-DISAMBIGUATION-MODEL", 0, 0, false);
        declareFunction(me, "update_disambiguation_model", "UPDATE-DISAMBIGUATION-MODEL", 1, 0, false);
        declareFunction(me, "get_disambiguation_prior", "GET-DISAMBIGUATION-PRIOR", 1, 0, false);
        declareFunction(me, "get_disambiguation_probability", "GET-DISAMBIGUATION-PROBABILITY", 2, 0, false);
        declareFunction(me, "disambiguate_word", "DISAMBIGUATE-WORD", 1, 0, false);
        declareFunction(me, "disambiguate_sentence", "DISAMBIGUATE-SENTENCE", 1, 0, false);
        declareFunction(me, "disambiguate_paragraph", "DISAMBIGUATE-PARAGRAPH", 1, 0, false);
        declareFunction(me, "disambiguate_document", "DISAMBIGUATE-DOCUMENT", 1, 0, false);
        declareFunction(me, "fix_missing_quotes", "FIX-MISSING-QUOTES", 1, 0, false);
        declareFunction(me, "add_upward_closure_to_labelled_file", "ADD-UPWARD-CLOSURE-TO-LABELLED-FILE", 2, 1, false);
        declareFunction(me, "add_upward_closure_to_labelled_directory", "ADD-UPWARD-CLOSURE-TO-LABELLED-DIRECTORY", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_disambiguation_file() {
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

    
}

/**
 * Total time: 436 ms synthetic
 */
