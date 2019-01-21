package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class disambiguation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.disambiguation";
    public static final String myFingerPrint = "69e8f22d236bc99d21380dba861e8087abf02d74be2f46cdf258bacef19d58f4";
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 1497L)
    public static SubLSymbol $disambiguation_term_counts$;
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 1554L)
    public static SubLSymbol $disambiguation_term_counts_load_attempted$;
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 1625L)
    private static SubLSymbol $disambiguation_term_counts_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 1725L)
    public static SubLSymbol $disambiguation_term_counts_file$;
    private static final SubLSymbol $sym0$_DISAMBIGUATION_TERM_COUNTS_LOCK_;
    private static final SubLString $str1$Disambiguation_Term_Counts_Lock;
    private static final SubLString $str2$data_sense_disambiguation_disambi;
    private static final SubLSymbol $kw3$IMAGE_INDEPENDENT_CFASL;
    private static final SubLInteger $int4$3000;
    private static final SubLString $str5$Unable_to_create_disambiguation_h;
    private static final SubLString $str6$Disambiguation_training_data_file;
    private static final SubLSymbol $kw7$INPUT;
    private static final SubLString $str8$Unable_to_open__S;
    private static final SubLString $str9$processing_line__S__;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$CYCL_FROM_STRING;
    private static final SubLString $str12$_NONE;
    private static final SubLString $str13$;
    private static final SubLString $str14$d;
    private static final SubLString $str15$p;
    private static final SubLString $str16$w;
    private static final SubLSymbol $kw17$WEIGHT;
    private static final SubLSymbol $sym18$STRINGP;
    private static final SubLString $str19$___________________________;
    private static final SubLString $str20$___1__2;
    private static final SubLSymbol $sym21$HASH_TABLE_P;
    private static final SubLString $str22$Labelled_file__A_does_not_exist_;
    private static final SubLSymbol $kw23$OUTPUT;
    private static final SubLString $str24$d__;
    private static final SubLString $str25$p__;
    private static final SubLString $str26$s;
    private static final SubLString $str27$s__;
    private static final SubLString $str28$w_A_A_A_A;
    private static final SubLSymbol $sym29$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str30$_A_S;
    private static final SubLString $str31$_A__S;
    private static final SubLString $str32$_A_in_term__S;
    private static final SubLString $str33$__;
    private static final SubLString $str34$Unable_to_understand_line___S;
    private static final SubLString $str35$_A__A;
    private static final SubLString $str36$Processing__A__;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 1843L)
    public static SubLObject init_disambiguation_model(SubLObject forceP) {
        if (forceP == disambiguation.UNPROVIDED) {
            forceP = (SubLObject)disambiguation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject loaded = (SubLObject)disambiguation.NIL;
        SubLObject release = (SubLObject)disambiguation.NIL;
        try {
            release = Locks.seize_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            if (disambiguation.NIL != disambiguation.$disambiguation_term_counts$.getGlobalValue()) {
                loaded = (SubLObject)disambiguation.T;
            }
            if (disambiguation.NIL != forceP || disambiguation.NIL == disambiguation.$disambiguation_term_counts_load_attempted$.getGlobalValue()) {
                disambiguation.$disambiguation_term_counts_load_attempted$.setGlobalValue((SubLObject)disambiguation.T);
                if (disambiguation.NIL != Filesys.probe_file(disambiguation.$disambiguation_term_counts_file$.getDynamicValue(thread))) {
                    disambiguation.$disambiguation_term_counts$.setGlobalValue(file_hash_table.open_file_hash_table_read_only(disambiguation.$disambiguation_term_counts_file$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)disambiguation.EQUALP), (SubLObject)disambiguation.$kw3$IMAGE_INDEPENDENT_CFASL));
                    if (disambiguation.NIL != disambiguation.$disambiguation_term_counts$.getGlobalValue()) {
                        loaded = (SubLObject)disambiguation.T;
                    }
                }
            }
        }
        finally {
            if (disambiguation.NIL != release) {
                Locks.release_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        return loaded;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 2465L)
    public static SubLObject clear_disambiguation_model() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)disambiguation.NIL;
        try {
            release = Locks.seize_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            disambiguation.$disambiguation_term_counts$.setGlobalValue((SubLObject)disambiguation.NIL);
            if (disambiguation.NIL != Filesys.probe_file(disambiguation.$disambiguation_term_counts_file$.getDynamicValue(thread))) {
                Filesys.delete_file(disambiguation.$disambiguation_term_counts_file$.getDynamicValue(thread));
            }
        }
        finally {
            if (disambiguation.NIL != release) {
                Locks.release_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        return (SubLObject)disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 2807L)
    public static SubLObject update_disambiguation_model(final SubLObject train_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject disambiguation_term_counts_fht = (SubLObject)disambiguation.NIL;
        SubLObject release = (SubLObject)disambiguation.NIL;
        try {
            release = Locks.seize_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            if (disambiguation.NIL != Filesys.probe_file(disambiguation.$disambiguation_term_counts_file$.getDynamicValue(thread))) {
                disambiguation_term_counts_fht = file_hash_table.open_file_hash_table(disambiguation.$disambiguation_term_counts_file$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)disambiguation.EQUALP), (SubLObject)disambiguation.$kw3$IMAGE_INDEPENDENT_CFASL);
            }
            else {
                disambiguation_term_counts_fht = file_hash_table.create_file_hash_table(disambiguation.$disambiguation_term_counts_file$.getDynamicValue(thread), (SubLObject)disambiguation.$int4$3000, (SubLObject)disambiguation.$int4$3000, Symbols.symbol_function((SubLObject)disambiguation.EQUALP), (SubLObject)disambiguation.$kw3$IMAGE_INDEPENDENT_CFASL);
            }
        }
        finally {
            if (disambiguation.NIL != release) {
                Locks.release_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        if (disambiguation.NIL == disambiguation_term_counts_fht) {
            Errors.error((SubLObject)disambiguation.$str5$Unable_to_create_disambiguation_h, disambiguation.$disambiguation_term_counts_file$.getDynamicValue(thread));
        }
        if (disambiguation.NIL == Filesys.probe_file(train_filename)) {
            Errors.error((SubLObject)disambiguation.$str6$Disambiguation_training_data_file, train_filename);
        }
        final SubLObject file = StreamsLow.open(train_filename, disambiguation.EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject stream = (SubLObject)disambiguation.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)disambiguation.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)disambiguation.$kw7$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)disambiguation.$str8$Unable_to_open__S, file);
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
                for (line = (SubLObject)disambiguation.NIL, line = file_utilities.cdolines_get_next_line(infile); disambiguation.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    PrintLow.format((SubLObject)disambiguation.T, (SubLObject)disambiguation.$str9$processing_line__S__, line);
                    parts = string_utilities.split_string(line, (SubLObject)disambiguation.$list10);
                    filepath = parts.first();
                    v_document = string_utilities.string_to_integer(conses_high.second(parts));
                    paragraph = string_utilities.string_to_integer(conses_high.third(parts));
                    word = string_utilities.string_to_integer(conses_high.fourth(parts));
                    labels = Mapping.mapcar((SubLObject)disambiguation.$sym11$CYCL_FROM_STRING, (SubLObject)(conses_high.fifth(parts).equal((SubLObject)disambiguation.$str12$_NONE) ? disambiguation.NIL : conses_high.nthcdr((SubLObject)disambiguation.FOUR_INTEGER, parts)));
                    stream_$1 = (SubLObject)disambiguation.NIL;
                    try {
                        stream_$1 = compatibility.open_text(filepath, (SubLObject)disambiguation.$kw7$INPUT);
                        if (!stream_$1.isStream()) {
                            Errors.error((SubLObject)disambiguation.$str8$Unable_to_open__S, filepath);
                        }
                        datafile = stream_$1;
                        current_document = (SubLObject)disambiguation.MINUS_ONE_INTEGER;
                        current_paragraph = (SubLObject)disambiguation.MINUS_ONE_INTEGER;
                        current_word = (SubLObject)disambiguation.MINUS_ONE_INTEGER;
                        line_$2 = (SubLObject)disambiguation.$str13$;
                        while (current_document.numL(v_document)) {
                            line_$2 = string_utilities.network_read_line(datafile, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED);
                            if (line_$2.equal((SubLObject)disambiguation.$str14$d)) {
                                current_document = Numbers.add((SubLObject)disambiguation.ONE_INTEGER, current_document);
                            }
                        }
                        while (current_paragraph.numL(paragraph)) {
                            line_$2 = string_utilities.network_read_line(datafile, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED);
                            if (line_$2.equal((SubLObject)disambiguation.$str15$p)) {
                                current_paragraph = Numbers.add((SubLObject)disambiguation.ONE_INTEGER, current_paragraph);
                            }
                        }
                        while (current_word.numL(word)) {
                            line_$2 = string_utilities.network_read_line(datafile, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED);
                            if (disambiguation.NIL != string_utilities.starts_with(line_$2, (SubLObject)disambiguation.$str16$w)) {
                                current_word = Numbers.add((SubLObject)disambiguation.ONE_INTEGER, current_word);
                            }
                        }
                        word_parts = string_utilities.split_string(line_$2, (SubLObject)disambiguation.$list10);
                        token = conses_high.second(word_parts);
                        pos = conses_high.third(word_parts);
                        tags = (cdolist_list_var = Mapping.mapcar((SubLObject)disambiguation.$sym11$CYCL_FROM_STRING, conses_high.nthcdr((SubLObject)disambiguation.THREE_INTEGER, word_parts)));
                        tag = (SubLObject)disambiguation.NIL;
                        tag = cdolist_list_var.first();
                        while (disambiguation.NIL != cdolist_list_var) {
                            release_$3 = (SubLObject)disambiguation.NIL;
                            try {
                                release_$3 = Locks.seize_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
                                old_pair = file_hash_table.get_file_hash_table(tag, disambiguation_term_counts_fht, (SubLObject)ConsesLow.list((SubLObject)disambiguation.ZERO_INTEGER, (SubLObject)disambiguation.ZERO_INTEGER));
                                old_correct = old_pair.first();
                                old_total = conses_high.second(old_pair);
                                new_total = Numbers.add((SubLObject)disambiguation.ONE_INTEGER, old_total);
                                if (disambiguation.NIL != subl_promotions.memberP(tag, labels, (SubLObject)disambiguation.EQUAL, (SubLObject)disambiguation.UNPROVIDED)) {
                                    file_hash_table.put_file_hash_table(tag, disambiguation_term_counts_fht, (SubLObject)ConsesLow.list(Numbers.add((SubLObject)disambiguation.ONE_INTEGER, old_correct), new_total));
                                }
                                else {
                                    file_hash_table.put_file_hash_table(tag, disambiguation_term_counts_fht, (SubLObject)ConsesLow.list(old_correct, new_total));
                                }
                                token_term = (SubLObject)ConsesLow.list(token, tag);
                                old_pair2 = file_hash_table.get_file_hash_table(token_term, disambiguation_term_counts_fht, (SubLObject)ConsesLow.list((SubLObject)disambiguation.ZERO_INTEGER, (SubLObject)disambiguation.ZERO_INTEGER));
                                old_correct2 = old_pair2.first();
                                old_total2 = conses_high.second(old_pair2);
                                new_total2 = Numbers.add((SubLObject)disambiguation.ONE_INTEGER, old_total2);
                                if (disambiguation.NIL != subl_promotions.memberP(tag, labels, (SubLObject)disambiguation.EQUAL, (SubLObject)disambiguation.UNPROVIDED)) {
                                    file_hash_table.put_file_hash_table(token_term, disambiguation_term_counts_fht, (SubLObject)ConsesLow.list(Numbers.add((SubLObject)disambiguation.ONE_INTEGER, old_correct2), new_total2));
                                }
                                else {
                                    file_hash_table.put_file_hash_table(token_term, disambiguation_term_counts_fht, (SubLObject)ConsesLow.list(old_correct2, new_total2));
                                }
                            }
                            finally {
                                if (disambiguation.NIL != release_$3) {
                                    Locks.release_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            tag = cdolist_list_var.first();
                        }
                    }
                    finally {
                        _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)disambiguation.T, thread);
                            _values = Values.getValuesAsVector();
                            if (stream_$1.isStream()) {
                                streams_high.close(stream_$1, (SubLObject)disambiguation.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)disambiguation.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)disambiguation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 6083L)
    public static SubLObject get_disambiguation_prior(final SubLObject v_term) {
        if (disambiguation.NIL == init_disambiguation_model((SubLObject)disambiguation.NIL)) {
            return (SubLObject)disambiguation.NIL;
        }
        SubLObject probability = (SubLObject)disambiguation.NIL;
        SubLObject release = (SubLObject)disambiguation.NIL;
        try {
            release = Locks.seize_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            final SubLObject pair = file_hash_table.get_file_hash_table(v_term, disambiguation.$disambiguation_term_counts$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)disambiguation.ZERO_INTEGER, (SubLObject)disambiguation.ZERO_INTEGER));
            final SubLObject correct = pair.first();
            final SubLObject total = conses_high.second(pair);
            if (total.numG((SubLObject)disambiguation.ZERO_INTEGER)) {
                probability = Numbers.divide(correct, total);
            }
        }
        finally {
            if (disambiguation.NIL != release) {
                Locks.release_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        return probability;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 6614L)
    public static SubLObject get_disambiguation_probability(final SubLObject v_term, final SubLObject token) {
        if (disambiguation.NIL == init_disambiguation_model((SubLObject)disambiguation.NIL)) {
            return (SubLObject)disambiguation.NIL;
        }
        SubLObject probability = (SubLObject)disambiguation.NIL;
        SubLObject release = (SubLObject)disambiguation.NIL;
        try {
            release = Locks.seize_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            final SubLObject pair = file_hash_table.get_file_hash_table((SubLObject)ConsesLow.list(token, v_term), disambiguation.$disambiguation_term_counts$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)disambiguation.ZERO_INTEGER, (SubLObject)disambiguation.ZERO_INTEGER));
            final SubLObject correct = pair.first();
            final SubLObject total = conses_high.second(pair);
            if (total.numG((SubLObject)disambiguation.ZERO_INTEGER)) {
                probability = Numbers.divide(correct, total);
            }
        }
        finally {
            if (disambiguation.NIL != release) {
                Locks.release_lock(disambiguation.$disambiguation_term_counts_lock$.getGlobalValue());
            }
        }
        return probability;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 7154L)
    public static SubLObject disambiguate_word(final SubLObject word) {
        SubLObject cdolist_list_var = document.word_interps(word);
        SubLObject interp = (SubLObject)disambiguation.NIL;
        interp = cdolist_list_var.first();
        while (disambiguation.NIL != cdolist_list_var) {
            final SubLObject cycl = nl_api_datastructures.get_nl_interp_cycl(interp);
            final SubLObject prior = get_disambiguation_prior(cycl);
            if (disambiguation.NIL != prior) {
                interp = conses_high.putf(interp, (SubLObject)disambiguation.$kw17$WEIGHT, prior);
            }
            cdolist_list_var = cdolist_list_var.rest();
            interp = cdolist_list_var.first();
        }
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 7533L)
    public static SubLObject disambiguate_sentence(final SubLObject sentence) {
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = (SubLObject)disambiguation.NIL;
        word = cdolist_list_var.first();
        while (disambiguation.NIL != cdolist_list_var) {
            disambiguate_word(word);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 7830L)
    public static SubLObject disambiguate_paragraph(final SubLObject paragraph) {
        final SubLObject vector_var = document.paragraph_sentences(paragraph);
        final SubLObject backwardP_var = (SubLObject)disambiguation.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)disambiguation.NIL, v_iteration = (SubLObject)disambiguation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)disambiguation.ONE_INTEGER)) {
            element_num = ((disambiguation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)disambiguation.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            cdolist_list_var = document.sentence_yield_exhaustive(sentence);
            word = (SubLObject)disambiguation.NIL;
            word = cdolist_list_var.first();
            while (disambiguation.NIL != cdolist_list_var) {
                disambiguate_word(word);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 8136L)
    public static SubLObject disambiguate_document(final SubLObject v_document) {
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)disambiguation.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)disambiguation.NIL, v_iteration = (SubLObject)disambiguation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)disambiguation.ONE_INTEGER)) {
            element_num = ((disambiguation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)disambiguation.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$4 = document.paragraph_sentences(paragraph);
            backwardP_var_$5 = (SubLObject)disambiguation.NIL;
            for (length_$6 = Sequences.length(vector_var_$4), v_iteration_$7 = (SubLObject)disambiguation.NIL, v_iteration_$7 = (SubLObject)disambiguation.ZERO_INTEGER; v_iteration_$7.numL(length_$6); v_iteration_$7 = Numbers.add(v_iteration_$7, (SubLObject)disambiguation.ONE_INTEGER)) {
                element_num_$8 = ((disambiguation.NIL != backwardP_var_$5) ? Numbers.subtract(length_$6, v_iteration_$7, (SubLObject)disambiguation.ONE_INTEGER) : v_iteration_$7);
                sentence = Vectors.aref(vector_var_$4, element_num_$8);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)disambiguation.NIL;
                word = cdolist_list_var.first();
                while (disambiguation.NIL != cdolist_list_var) {
                    disambiguate_word(word);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return v_document;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 8433L)
    public static SubLObject fix_missing_quotes(final SubLObject term_string) {
        assert disambiguation.NIL != Types.stringp(term_string) : term_string;
        final SubLObject regex = regular_expressions.compile_regular_expression((SubLObject)disambiguation.$str19$___________________________, (SubLObject)disambiguation.UNPROVIDED);
        return regular_expression_utilities.regex_subst(regex, (SubLObject)disambiguation.$str20$___1__2, term_string, (SubLObject)disambiguation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 8722L)
    public static SubLObject add_upward_closure_to_labelled_file(final SubLObject input_filename, final SubLObject output_filename, SubLObject missing_terms) {
        if (missing_terms == disambiguation.UNPROVIDED) {
            missing_terms = (SubLObject)disambiguation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (disambiguation.NIL != missing_terms && !disambiguation.assertionsDisabledInClass && disambiguation.NIL == Types.hash_table_p(missing_terms)) {
            throw new AssertionError(missing_terms);
        }
        if (disambiguation.NIL == Filesys.probe_file(input_filename)) {
            Errors.error((SubLObject)disambiguation.$str22$Labelled_file__A_does_not_exist_, input_filename);
        }
        SubLObject stream = (SubLObject)disambiguation.NIL;
        try {
            stream = compatibility.open_text(input_filename, (SubLObject)disambiguation.$kw7$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)disambiguation.$str8$Unable_to_open__S, input_filename);
            }
            final SubLObject in = stream;
            SubLObject stream_$9 = (SubLObject)disambiguation.NIL;
            try {
                stream_$9 = compatibility.open_text(output_filename, (SubLObject)disambiguation.$kw23$OUTPUT);
                if (!stream_$9.isStream()) {
                    Errors.error((SubLObject)disambiguation.$str8$Unable_to_open__S, output_filename);
                }
                final SubLObject out = stream_$9;
                SubLObject stream_$10 = (SubLObject)disambiguation.NIL;
                try {
                    final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)disambiguation.NIL, thread);
                        stream_$10 = compatibility.open_text(in, (SubLObject)disambiguation.$kw7$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                    }
                    if (!stream_$10.isStream()) {
                        Errors.error((SubLObject)disambiguation.$str8$Unable_to_open__S, in);
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
                        for (line = (SubLObject)disambiguation.NIL, line = file_utilities.cdolines_get_next_line(infile); disambiguation.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                            parts = string_utilities.split_string(line, (SubLObject)disambiguation.$list10);
                            if (line.equal((SubLObject)disambiguation.$str14$d)) {
                                PrintLow.format(out, (SubLObject)disambiguation.$str24$d__);
                            }
                            else if (line.equal((SubLObject)disambiguation.$str15$p)) {
                                PrintLow.format(out, (SubLObject)disambiguation.$str25$p__);
                            }
                            else if (line.equal((SubLObject)disambiguation.$str26$s)) {
                                PrintLow.format(out, (SubLObject)disambiguation.$str27$s__);
                            }
                            else if (parts.first().equal((SubLObject)disambiguation.$str16$w)) {
                                PrintLow.format(out, (SubLObject)disambiguation.$str28$w_A_A_A_A, new SubLObject[] { Characters.CHAR_tab, conses_high.second(parts), Characters.CHAR_tab, conses_high.third(parts) });
                                cdolist_list_var = conses_high.nthcdr((SubLObject)disambiguation.THREE_INTEGER, parts);
                                term_string = (SubLObject)disambiguation.NIL;
                                term_string = cdolist_list_var.first();
                                while (disambiguation.NIL != cdolist_list_var) {
                                    error_string = (SubLObject)disambiguation.NIL;
                                    try {
                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)disambiguation.$sym29$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                v_term = reader.read_from_string(fix_missing_quotes(term_string), (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED);
                                                upward_closure = ((disambiguation.NIL != fort_types_interface.collectionP(v_term)) ? genls.all_genls(v_term, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED) : isa.all_isa(v_term, (SubLObject)disambiguation.UNPROVIDED, (SubLObject)disambiguation.UNPROVIDED));
                                                PrintLow.format(out, (SubLObject)disambiguation.$str30$_A_S, (SubLObject)Characters.CHAR_tab, cycl_utilities.hl_to_el(v_term));
                                                cdolist_list_var_$11 = upward_closure;
                                                parent = (SubLObject)disambiguation.NIL;
                                                parent = cdolist_list_var_$11.first();
                                                while (disambiguation.NIL != cdolist_list_var_$11) {
                                                    PrintLow.format(out, (SubLObject)disambiguation.$str31$_A__S, (SubLObject)Characters.CHAR_tab, cycl_utilities.hl_to_el(parent));
                                                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                                                    parent = cdolist_list_var_$11.first();
                                                }
                                            }
                                            catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, (SubLObject)disambiguation.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var) {
                                        error_string = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                    if (disambiguation.NIL != error_string) {
                                        if (disambiguation.NIL != missing_terms) {
                                            Hashtables.sethash(term_string, missing_terms, (SubLObject)disambiguation.T);
                                        }
                                        else {
                                            Errors.warn((SubLObject)disambiguation.$str32$_A_in_term__S, error_string, term_string);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    term_string = cdolist_list_var.first();
                                }
                                PrintLow.format(out, (SubLObject)disambiguation.$str33$__);
                            }
                            else {
                                Errors.error((SubLObject)disambiguation.$str34$Unable_to_understand_line___S, line);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)disambiguation.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream_$10.isStream()) {
                            streams_high.close(stream_$10, (SubLObject)disambiguation.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)disambiguation.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream_$9.isStream()) {
                        streams_high.close(stream_$9, (SubLObject)disambiguation.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)disambiguation.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)disambiguation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return (SubLObject)disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disambiguation.lisp", position = 10057L)
    public static SubLObject add_upward_closure_to_labelled_directory(final SubLObject input_directory, final SubLObject output_directory, SubLObject missing_terms) {
        if (missing_terms == disambiguation.UNPROVIDED) {
            missing_terms = (SubLObject)disambiguation.NIL;
        }
        SubLObject cdolist_list_var = Filesys.directory(input_directory, (SubLObject)disambiguation.UNPROVIDED);
        SubLObject filename = (SubLObject)disambiguation.NIL;
        filename = cdolist_list_var.first();
        while (disambiguation.NIL != cdolist_list_var) {
            final SubLObject input_filename = PrintLow.format((SubLObject)disambiguation.NIL, (SubLObject)disambiguation.$str35$_A__A, input_directory, filename);
            final SubLObject output_filename = PrintLow.format((SubLObject)disambiguation.NIL, (SubLObject)disambiguation.$str35$_A__A, output_directory, filename);
            PrintLow.format((SubLObject)disambiguation.T, (SubLObject)disambiguation.$str36$Processing__A__, input_filename);
            add_upward_closure_to_labelled_file(input_filename, output_filename, missing_terms);
            cdolist_list_var = cdolist_list_var.rest();
            filename = cdolist_list_var.first();
        }
        return (SubLObject)disambiguation.NIL;
    }
    
    public static SubLObject declare_disambiguation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "init_disambiguation_model", "INIT-DISAMBIGUATION-MODEL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "clear_disambiguation_model", "CLEAR-DISAMBIGUATION-MODEL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "update_disambiguation_model", "UPDATE-DISAMBIGUATION-MODEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "get_disambiguation_prior", "GET-DISAMBIGUATION-PRIOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "get_disambiguation_probability", "GET-DISAMBIGUATION-PROBABILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "disambiguate_word", "DISAMBIGUATE-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "disambiguate_sentence", "DISAMBIGUATE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "disambiguate_paragraph", "DISAMBIGUATE-PARAGRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "disambiguate_document", "DISAMBIGUATE-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "fix_missing_quotes", "FIX-MISSING-QUOTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "add_upward_closure_to_labelled_file", "ADD-UPWARD-CLOSURE-TO-LABELLED-FILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disambiguation", "add_upward_closure_to_labelled_directory", "ADD-UPWARD-CLOSURE-TO-LABELLED-DIRECTORY", 2, 1, false);
        return (SubLObject)disambiguation.NIL;
    }
    
    public static SubLObject init_disambiguation_file() {
        disambiguation.$disambiguation_term_counts$ = SubLFiles.deflexical("*DISAMBIGUATION-TERM-COUNTS*", (SubLObject)disambiguation.NIL);
        disambiguation.$disambiguation_term_counts_load_attempted$ = SubLFiles.deflexical("*DISAMBIGUATION-TERM-COUNTS-LOAD-ATTEMPTED*", (SubLObject)disambiguation.NIL);
        disambiguation.$disambiguation_term_counts_lock$ = SubLFiles.deflexical("*DISAMBIGUATION-TERM-COUNTS-LOCK*", (disambiguation.NIL != Symbols.boundp((SubLObject)disambiguation.$sym0$_DISAMBIGUATION_TERM_COUNTS_LOCK_)) ? disambiguation.$disambiguation_term_counts_lock$.getGlobalValue() : Locks.make_lock((SubLObject)disambiguation.$str1$Disambiguation_Term_Counts_Lock));
        disambiguation.$disambiguation_term_counts_file$ = SubLFiles.defparameter("*DISAMBIGUATION-TERM-COUNTS-FILE*", (SubLObject)disambiguation.$str2$data_sense_disambiguation_disambi);
        return (SubLObject)disambiguation.NIL;
    }
    
    public static SubLObject setup_disambiguation_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)disambiguation.$sym0$_DISAMBIGUATION_TERM_COUNTS_LOCK_);
        return (SubLObject)disambiguation.NIL;
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
        me = (SubLFile)new disambiguation();
        disambiguation.$disambiguation_term_counts$ = null;
        disambiguation.$disambiguation_term_counts_load_attempted$ = null;
        disambiguation.$disambiguation_term_counts_lock$ = null;
        disambiguation.$disambiguation_term_counts_file$ = null;
        $sym0$_DISAMBIGUATION_TERM_COUNTS_LOCK_ = SubLObjectFactory.makeSymbol("*DISAMBIGUATION-TERM-COUNTS-LOCK*");
        $str1$Disambiguation_Term_Counts_Lock = SubLObjectFactory.makeString("Disambiguation Term Counts Lock");
        $str2$data_sense_disambiguation_disambi = SubLObjectFactory.makeString("data/sense-disambiguation/disambiguation-term-counts.fht");
        $kw3$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $int4$3000 = SubLObjectFactory.makeInteger(3000);
        $str5$Unable_to_create_disambiguation_h = SubLObjectFactory.makeString("Unable to create disambiguation hash table (~A).");
        $str6$Disambiguation_training_data_file = SubLObjectFactory.makeString("Disambiguation training data file (~A) does not exist.");
        $kw7$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str8$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str9$processing_line__S__ = SubLObjectFactory.makeString("processing line ~S~%");
        $list10 = ConsesLow.list((SubLObject)Characters.CHAR_tab);
        $sym11$CYCL_FROM_STRING = SubLObjectFactory.makeSymbol("CYCL-FROM-STRING");
        $str12$_NONE = SubLObjectFactory.makeString(":NONE");
        $str13$ = SubLObjectFactory.makeString("");
        $str14$d = SubLObjectFactory.makeString("d");
        $str15$p = SubLObjectFactory.makeString("p");
        $str16$w = SubLObjectFactory.makeString("w");
        $kw17$WEIGHT = SubLObjectFactory.makeKeyword("WEIGHT");
        $sym18$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str19$___________________________ = SubLObjectFactory.makeString(" ([^#()?]*[^#() ])( *[#()])");
        $str20$___1__2 = SubLObjectFactory.makeString(" \"\\1\"\\2");
        $sym21$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $str22$Labelled_file__A_does_not_exist_ = SubLObjectFactory.makeString("Labelled file ~A does not exist.");
        $kw23$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str24$d__ = SubLObjectFactory.makeString("d~%");
        $str25$p__ = SubLObjectFactory.makeString("p~%");
        $str26$s = SubLObjectFactory.makeString("s");
        $str27$s__ = SubLObjectFactory.makeString("s~%");
        $str28$w_A_A_A_A = SubLObjectFactory.makeString("w~A~A~A~A");
        $sym29$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str30$_A_S = SubLObjectFactory.makeString("~A~S");
        $str31$_A__S = SubLObjectFactory.makeString("~A^~S");
        $str32$_A_in_term__S = SubLObjectFactory.makeString("~A in term ~S");
        $str33$__ = SubLObjectFactory.makeString("~%");
        $str34$Unable_to_understand_line___S = SubLObjectFactory.makeString("Unable to understand line: ~S");
        $str35$_A__A = SubLObjectFactory.makeString("~A/~A");
        $str36$Processing__A__ = SubLObjectFactory.makeString("Processing ~A~%");
    }
}

/*

	Total time: 436 ms
	 synthetic 
*/