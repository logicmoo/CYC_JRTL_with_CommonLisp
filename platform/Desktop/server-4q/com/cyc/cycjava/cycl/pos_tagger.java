package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pos_tagger extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pos_tagger";
    public static final String myFingerPrint = "d8038c5ea89358ced6c1867bfd7724c821416c62d5452c15fce87ded9336632b";
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3117L)
    private static SubLSymbol $tagger_data_path$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3390L)
    private static SubLSymbol $exclude_from_normalization$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3541L)
    private static SubLSymbol $initial_state_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3656L)
    private static SubLSymbol $state_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3761L)
    private static SubLSymbol $transition_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3873L)
    private static SubLSymbol $open_states_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 3987L)
    private static SubLSymbol $suffixes_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4090L)
    private static SubLSymbol $unknown_word_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4197L)
    private static SubLSymbol $suffix_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4296L)
    private static SubLSymbol $hyphen_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4395L)
    private static SubLSymbol $number_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4494L)
    private static SubLSymbol $capitalization_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4617L)
    private static SubLSymbol $state_interpretation_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 4762L)
    private static SubLSymbol $token_delimiters$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5050L)
    public static SubLSymbol $impossibility$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5198L)
    public static SubLSymbol $certainty$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5260L)
    public static SubLSymbol $low_probability$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5339L)
    private static SubLSymbol $state_set_cache_capacity$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5509L)
    public static SubLSymbol $pos_tagger$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLSymbol $dtp_tagger$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 19299L)
    private static SubLSymbol $word_tag_patches$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLSymbol $dtp_hmm$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLSymbol $dtp_state_set$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLSymbol $dtp_transition_set$;
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLSymbol $dtp_emission_probability_estimator$;
    private static final SubLString $str0$data;
    private static final SubLString $str1$pos_tagging;
    private static final SubLList $list2;
    private static final SubLString $str3$initial_state;
    private static final SubLString $str4$states;
    private static final SubLString $str5$transitions;
    private static final SubLString $str6$open_states;
    private static final SubLString $str7$suffixes;
    private static final SubLString $str8$unknown;
    private static final SubLString $str9$suffix;
    private static final SubLString $str10$hyphen;
    private static final SubLString $str11$number;
    private static final SubLString $str12$capitalization;
    private static final SubLString $str13$index_to_state;
    private static final SubLList $list14;
    private static final SubLFloat $float15$_3_4028232e38;
    private static final SubLFloat $float16$0_0;
    private static final SubLInteger $int17$_20;
    private static final SubLInteger $int18$2000;
    private static final SubLSymbol $kw19$INPUT;
    private static final SubLString $str20$Unable_to_open__S;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$AREF;
    private static final SubLInteger $int24$256;
    private static final SubLSymbol $kw25$IMAGE_INDEPENDENT_CFASL;
    private static final SubLString $str26$Unable_to_initialize_file_hashtab;
    private static final SubLString $str27$Building_conditional_probability_;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$CONS;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$CAR;
    private static final SubLSymbol $sym32$CDR;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$PROGN;
    private static final SubLSymbol $sym35$CSETF;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$CPUSH;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$ASSOC;
    private static final SubLSymbol $sym40$TRELLIS_CURRENT_COLUMN;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$RPLACA;
    private static final SubLSymbol $sym44$ACONS;
    private static final SubLSymbol $sym45$CPOP;
    private static final SubLSymbol $sym46$TAGGER;
    private static final SubLSymbol $sym47$TAGGER_P;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym53$TAGGER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$TAGGER_HMM;
    private static final SubLSymbol $sym56$_CSETF_TAGGER_HMM;
    private static final SubLSymbol $sym57$TAGGER_STATE_INTERPRETATION;
    private static final SubLSymbol $sym58$_CSETF_TAGGER_STATE_INTERPRETATION;
    private static final SubLSymbol $kw59$HMM;
    private static final SubLSymbol $kw60$STATE_INTERPRETATION;
    private static final SubLString $str61$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw62$BEGIN;
    private static final SubLSymbol $sym63$MAKE_TAGGER;
    private static final SubLSymbol $kw64$SLOT;
    private static final SubLSymbol $kw65$END;
    private static final SubLSymbol $sym66$VISIT_DEFSTRUCT_OBJECT_TAGGER_METHOD;
    private static final SubLSymbol $sym67$LISTP;
    private static final SubLInteger $int68$50;
    private static final SubLSymbol $sym69$DOCUMENT_P;
    private static final SubLSymbol $sym70$SENTENCE_P;
    private static final SubLSymbol $kw71$STRING;
    private static final SubLSymbol $kw72$CATEGORY;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$VECTORP;
    private static final SubLList $list75;
    private static final SubLString $str76$txt;
    private static final SubLString $str77$Unable_to_initialize_pos_tagger_s;
    private static final SubLSymbol $sym78$HMM;
    private static final SubLSymbol $sym79$HMM_P;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$HMM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$HMM_INITIAL_STATE;
    private static final SubLSymbol $sym87$_CSETF_HMM_INITIAL_STATE;
    private static final SubLSymbol $sym88$HMM_STATES;
    private static final SubLSymbol $sym89$_CSETF_HMM_STATES;
    private static final SubLSymbol $sym90$HMM_TRANSITIONS;
    private static final SubLSymbol $sym91$_CSETF_HMM_TRANSITIONS;
    private static final SubLSymbol $kw92$INITIAL_STATE;
    private static final SubLSymbol $kw93$STATES;
    private static final SubLSymbol $kw94$TRANSITIONS;
    private static final SubLSymbol $sym95$MAKE_HMM;
    private static final SubLSymbol $sym96$VISIT_DEFSTRUCT_OBJECT_HMM_METHOD;
    private static final SubLString $str97$Unable_to_initialize_pos_tagger_H;
    private static final SubLSymbol $sym98$STATE_SET;
    private static final SubLSymbol $sym99$STATE_SET_P;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$STATE_SET_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$STATE_SET_STORE;
    private static final SubLSymbol $sym107$_CSETF_STATE_SET_STORE;
    private static final SubLSymbol $sym108$STATE_SET_ESTIMATOR;
    private static final SubLSymbol $sym109$_CSETF_STATE_SET_ESTIMATOR;
    private static final SubLSymbol $sym110$STATE_SET_CACHE;
    private static final SubLSymbol $sym111$_CSETF_STATE_SET_CACHE;
    private static final SubLSymbol $kw112$STORE;
    private static final SubLSymbol $kw113$ESTIMATOR;
    private static final SubLSymbol $kw114$CACHE;
    private static final SubLSymbol $sym115$MAKE_STATE_SET;
    private static final SubLSymbol $sym116$VISIT_DEFSTRUCT_OBJECT_STATE_SET_METHOD;
    private static final SubLString $str117$fht;
    private static final SubLString $str118$Unable_to_initialize_pos_tagger_s;
    private static final SubLSymbol $sym119$TRANSITION_SET;
    private static final SubLSymbol $sym120$TRANSITION_SET_P;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLList $list123;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$TRANSITION_SET_KNOWN_PROBABILITIES;
    private static final SubLSymbol $sym128$_CSETF_TRANSITION_SET_KNOWN_PROBABILITIES;
    private static final SubLSymbol $sym129$TRANSITION_SET_ESTIMATED_PROBABILITIES;
    private static final SubLSymbol $sym130$_CSETF_TRANSITION_SET_ESTIMATED_PROBABILITIES;
    private static final SubLSymbol $kw131$KNOWN_PROBABILITIES;
    private static final SubLSymbol $kw132$ESTIMATED_PROBABILITIES;
    private static final SubLSymbol $sym133$MAKE_TRANSITION_SET;
    private static final SubLSymbol $sym134$VISIT_DEFSTRUCT_OBJECT_TRANSITION_SET_METHOD;
    private static final SubLSymbol $sym135$READ_FROM_STRING;
    private static final SubLString $str136$Unable_to_initialize_pos_tagger_H;
    private static final SubLSymbol $sym137$EMISSION_PROBABILITY_ESTIMATOR;
    private static final SubLSymbol $sym138$EMISSION_PROBABILITY_ESTIMATOR_P;
    private static final SubLList $list139;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$EMISSION_PROBABILITY_ESTIMATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$EPE_OPEN_STATES;
    private static final SubLSymbol $sym146$_CSETF_EPE_OPEN_STATES;
    private static final SubLSymbol $sym147$EPE_SUFFIXES;
    private static final SubLSymbol $sym148$_CSETF_EPE_SUFFIXES;
    private static final SubLSymbol $sym149$EPE_UNKNOWN_WORD;
    private static final SubLSymbol $sym150$_CSETF_EPE_UNKNOWN_WORD;
    private static final SubLSymbol $sym151$EPE_SUFFIX;
    private static final SubLSymbol $sym152$_CSETF_EPE_SUFFIX;
    private static final SubLSymbol $sym153$EPE_HYPHEN;
    private static final SubLSymbol $sym154$_CSETF_EPE_HYPHEN;
    private static final SubLSymbol $sym155$EPE_NUMBER;
    private static final SubLSymbol $sym156$_CSETF_EPE_NUMBER;
    private static final SubLSymbol $sym157$EPE_CAPITALIZATION;
    private static final SubLSymbol $sym158$_CSETF_EPE_CAPITALIZATION;
    private static final SubLSymbol $kw159$OPEN_STATES;
    private static final SubLSymbol $kw160$SUFFIXES;
    private static final SubLSymbol $kw161$UNKNOWN_WORD;
    private static final SubLSymbol $kw162$SUFFIX;
    private static final SubLSymbol $kw163$HYPHEN;
    private static final SubLSymbol $kw164$NUMBER;
    private static final SubLSymbol $kw165$CAPITALIZATION;
    private static final SubLSymbol $sym166$MAKE_EMISSION_PROBABILITY_ESTIMATOR;
    private static final SubLSymbol $sym167$VISIT_DEFSTRUCT_OBJECT_EMISSION_PROBABILITY_ESTIMATOR_METHOD;
    private static final SubLString $str168$Unable_to_initialize_pos_tagger_p;
    private static final SubLString $str169$_UNKNOWN;
    private static final SubLString $str170$_NOSUFF;
    private static final SubLString $str171$_CAP;
    private static final SubLString $str172$_NOCAP;
    private static final SubLString $str173$_HYP;
    private static final SubLString $str174$_NOHYP;
    private static final SubLString $str175$_DIGIT;
    private static final SubLString $str176$_NODIGIT;
    private static final SubLSymbol $sym177$STRINGP;
    private static final SubLString $str178$Unable_to_load_file__;
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 5587L)
    public static SubLObject new_cpm(final SubLObject size, SubLObject source_path, SubLObject testfn) {
        if (source_path == pos_tagger.UNPROVIDED) {
            source_path = (SubLObject)pos_tagger.NIL;
        }
        if (testfn == pos_tagger.UNPROVIDED) {
            testfn = Symbols.symbol_function((SubLObject)pos_tagger.EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cpm = Hashtables.make_hash_table(size, testfn, (SubLObject)pos_tagger.UNPROVIDED);
        if (pos_tagger.NIL != source_path) {
            SubLObject stream = (SubLObject)pos_tagger.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)pos_tagger.NIL, thread);
                    stream = compatibility.open_text(source_path, (SubLObject)pos_tagger.$kw19$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)pos_tagger.$str20$Unable_to_open__S, source_path);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject conditioned;
                    SubLObject conditioning;
                    SubLObject probability;
                    for (line = (SubLObject)pos_tagger.NIL, line = file_utilities.cdolines_get_next_line(infile); pos_tagger.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        datum = (current = string_utilities.split_string(line, pos_tagger.$token_delimiters$.getGlobalValue()));
                        conditioned = (SubLObject)pos_tagger.NIL;
                        conditioning = (SubLObject)pos_tagger.NIL;
                        probability = (SubLObject)pos_tagger.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                        conditioned = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                        conditioning = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                        probability = current.first();
                        current = current.rest();
                        if (pos_tagger.NIL == current) {
                            cpm_set(cpm, conditioned, reader.parse_integer(conditioning, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED), Numbers.sublisp_float(reader.read_from_string(probability, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED), (SubLObject)pos_tagger.UNPROVIDED));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list21);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pos_tagger.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)pos_tagger.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return cpm;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 6615L)
    public static SubLObject cpm_get_distribution(final SubLObject cpm, final SubLObject conditioned) {
        return Hashtables.gethash_without_values(conditioned, cpm, (SubLObject)pos_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 6957L)
    public static SubLObject cpm_get(final SubLObject cpm, final SubLObject conditioned, final SubLObject conditioning, SubLObject testfn, SubLObject v_default) {
        if (testfn == pos_tagger.UNPROVIDED) {
            testfn = Symbols.symbol_function((SubLObject)pos_tagger.EQL);
        }
        if (v_default == pos_tagger.UNPROVIDED) {
            v_default = pos_tagger.$impossibility$.getGlobalValue();
        }
        final SubLObject probability = conses_high.assoc(conditioning, cpm_get_distribution(cpm, conditioned), testfn, (SubLObject)pos_tagger.UNPROVIDED).rest();
        return (pos_tagger.NIL != probability) ? probability : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 7387L)
    public static SubLObject cpm_set(final SubLObject cpm, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        SubLObject distribution = cpm_get_distribution(cpm, conditioned);
        distribution = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(conditioning, probability), distribution);
        Hashtables.sethash(conditioned, cpm, distribution);
        return cpm;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 7937L)
    public static SubLObject new_cpa(final SubLObject x_dimension, final SubLObject y_dimension, SubLObject source_path, SubLObject parsefn) {
        if (source_path == pos_tagger.UNPROVIDED) {
            source_path = (SubLObject)pos_tagger.NIL;
        }
        if (parsefn == pos_tagger.UNPROVIDED) {
            parsefn = Symbols.symbol_function((SubLObject)pos_tagger.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cpa = Vectors.make_vector(x_dimension, (SubLObject)pos_tagger.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)pos_tagger.NIL, i = (SubLObject)pos_tagger.ZERO_INTEGER; i.numL(x_dimension); i = Numbers.add(i, (SubLObject)pos_tagger.ONE_INTEGER)) {
            Vectors.set_aref(cpa, i, Vectors.make_vector(y_dimension, pos_tagger.$low_probability$.getGlobalValue()));
        }
        if (pos_tagger.NIL != source_path) {
            SubLObject stream = (SubLObject)pos_tagger.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)pos_tagger.NIL, thread);
                    stream = compatibility.open_text(source_path, (SubLObject)pos_tagger.$kw19$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)pos_tagger.$str20$Unable_to_open__S, source_path);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject conditioned;
                    SubLObject conditioning;
                    SubLObject probability;
                    for (line = (SubLObject)pos_tagger.NIL, line = file_utilities.cdolines_get_next_line(infile); pos_tagger.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        datum = (current = string_utilities.split_string(line, pos_tagger.$token_delimiters$.getGlobalValue()));
                        conditioned = (SubLObject)pos_tagger.NIL;
                        conditioning = (SubLObject)pos_tagger.NIL;
                        probability = (SubLObject)pos_tagger.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                        conditioned = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                        conditioning = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                        probability = current.first();
                        current = current.rest();
                        if (pos_tagger.NIL == current) {
                            cpa_set(cpa, reader.read_from_string(conditioned, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED), reader.read_from_string(conditioning, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED), Functions.funcall(parsefn, probability));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list21);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pos_tagger.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)pos_tagger.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return cpa;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 9062L)
    public static SubLObject cpa_get(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cpa = (SubLObject)pos_tagger.NIL;
        SubLObject conditioned = (SubLObject)pos_tagger.NIL;
        SubLObject conditioning = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list22);
        cpa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list22);
        conditioned = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list22);
        conditioning = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym23$AREF, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym23$AREF, cpa, conditioned), conditioning);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list22);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 9342L)
    public static SubLObject cpa_set(final SubLObject cpa, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        Vectors.set_aref(Vectors.aref(cpa, conditioned), conditioning, probability);
        return cpa;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 9777L)
    public static SubLObject create_cpf(final SubLObject filename, final SubLObject size, SubLObject testfn, SubLObject avg_size) {
        if (testfn == pos_tagger.UNPROVIDED) {
            testfn = Symbols.symbol_function((SubLObject)pos_tagger.EQUAL);
        }
        if (avg_size == pos_tagger.UNPROVIDED) {
            avg_size = (SubLObject)pos_tagger.$int24$256;
        }
        return file_hash_table.create_file_hash_table(filename, size, avg_size, testfn, (SubLObject)pos_tagger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 10472L)
    public static SubLObject new_cpf(final SubLObject source_path, SubLObject testfn) {
        if (testfn == pos_tagger.UNPROVIDED) {
            testfn = Symbols.symbol_function((SubLObject)pos_tagger.EQUAL);
        }
        return file_hash_table.open_file_hash_table_read_only(source_path, testfn, (SubLObject)pos_tagger.$kw25$IMAGE_INDEPENDENT_CFASL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 10894L)
    public static SubLObject finalize_cpf(final SubLObject cpf) {
        return file_hash_table.finalize_file_hash_table(cpf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 10988L)
    public static SubLObject cpf_get_distribution(final SubLObject cpf, final SubLObject conditioned) {
        return file_hash_table.get_file_hash_table(conditioned, cpf, (SubLObject)pos_tagger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 11328L)
    public static SubLObject cpf_get(final SubLObject cpf, final SubLObject conditioned, final SubLObject conditioning, SubLObject testfn, SubLObject v_default) {
        if (testfn == pos_tagger.UNPROVIDED) {
            testfn = Symbols.symbol_function((SubLObject)pos_tagger.EQL);
        }
        if (v_default == pos_tagger.UNPROVIDED) {
            v_default = pos_tagger.$impossibility$.getGlobalValue();
        }
        final SubLObject probability = conses_high.assoc(conditioning, cpf_get_distribution(cpf, conditioned), testfn, (SubLObject)pos_tagger.UNPROVIDED).rest();
        return (pos_tagger.NIL != probability) ? probability : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 11798L)
    public static SubLObject cpf_set(final SubLObject cpf, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        SubLObject distribution = cpf_get_distribution(cpf, conditioned);
        distribution = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(conditioning, probability), distribution);
        file_hash_table.put_file_hash_table(conditioned, cpf, distribution);
        return cpf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 12390L)
    public static SubLObject cpf_finalize(final SubLObject cpf) {
        file_hash_table.finalize_file_hash_table(cpf);
        return cpf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 12632L)
    public static SubLObject cpf_create_backing_store(final SubLObject source_path, final SubLObject backing_store, final SubLObject size, SubLObject avg_size) {
        if (avg_size == pos_tagger.UNPROVIDED) {
            avg_size = (SubLObject)pos_tagger.$int24$256;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pos_tagger.NIL == Filesys.probe_file(source_path)) {
            Errors.error(Sequences.cconcatenate((SubLObject)pos_tagger.$str26$Unable_to_initialize_file_hashtab, file_utilities.why_not_probe_fileP(source_path)));
        }
        final SubLObject cpf = create_cpf(backing_store, size, (SubLObject)pos_tagger.EQUAL, avg_size);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)pos_tagger.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)pos_tagger.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)pos_tagger.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)pos_tagger.$str27$Building_conditional_probability_);
                SubLObject stream = (SubLObject)pos_tagger.NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)pos_tagger.NIL, thread);
                        stream = compatibility.open_text(source_path, (SubLObject)pos_tagger.$kw19$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$1, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)pos_tagger.$str20$Unable_to_open__S, source_path);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = streams_high.file_length(stream_var);
                        final SubLObject stream_var_$2 = stream_var;
                        SubLObject line_number_var = (SubLObject)pos_tagger.NIL;
                        SubLObject line = (SubLObject)pos_tagger.NIL;
                        line_number_var = (SubLObject)pos_tagger.ZERO_INTEGER;
                        for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$2); pos_tagger.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$2)) {
                            SubLObject current;
                            final SubLObject datum = current = string_utilities.split_string(line, pos_tagger.$token_delimiters$.getGlobalValue());
                            SubLObject conditioned = (SubLObject)pos_tagger.NIL;
                            SubLObject conditioning = (SubLObject)pos_tagger.NIL;
                            SubLObject probability = (SubLObject)pos_tagger.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                            conditioned = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                            conditioning = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list21);
                            probability = current.first();
                            current = current.rest();
                            if (pos_tagger.NIL == current) {
                                cpf_set(cpf, conditioned, reader.parse_integer(conditioning, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED), Numbers.sublisp_float(reader.read_from_string(probability, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED), (SubLObject)pos_tagger.UNPROVIDED));
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list21);
                            }
                            utilities_macros.note_percent_progress(streams_high.file_position(stream_var, (SubLObject)pos_tagger.UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pos_tagger.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)pos_tagger.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pos_tagger.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return cpf_finalize(cpf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 13851L)
    public static SubLObject new_trellis_entry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject probability = (SubLObject)pos_tagger.NIL;
        SubLObject source = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list28);
        probability = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list28);
        source = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym29$CONS, probability, source);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list28);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14158L)
    public static SubLObject trellis_entry_probability(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject entry = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list30);
        entry = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym31$CAR, entry);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list30);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14299L)
    public static SubLObject trellis_entry_source(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject entry = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list30);
        entry = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym32$CDR, entry);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list30);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14430L)
    public static SubLObject trellis_entry_update(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject entry = (SubLObject)pos_tagger.NIL;
        SubLObject probability = (SubLObject)pos_tagger.NIL;
        SubLObject source = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list33);
        entry = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list33);
        probability = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list33);
        source = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym34$PROGN, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym35$CSETF, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym31$CAR, entry), probability), (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym35$CSETF, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym32$CDR, entry), source));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list33);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14790L)
    public static SubLObject new_trellis() {
        return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 14910L)
    public static SubLObject trellis_new_column(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list36);
        trellis = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym37$CPUSH, (SubLObject)pos_tagger.NIL, trellis);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list36);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15039L)
    public static SubLObject trellis_current_column(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list36);
        trellis = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym31$CAR, trellis);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list36);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15146L)
    public static SubLObject trellis_get(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = (SubLObject)pos_tagger.NIL;
        SubLObject key = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list38);
        trellis = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list38);
        key = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym32$CDR, (SubLObject)ConsesLow.listS((SubLObject)pos_tagger.$sym39$ASSOC, key, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym40$TRELLIS_CURRENT_COLUMN, trellis), (SubLObject)pos_tagger.$list41));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list38);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15336L)
    public static SubLObject trellis_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = (SubLObject)pos_tagger.NIL;
        SubLObject key = (SubLObject)pos_tagger.NIL;
        SubLObject value = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list42);
        trellis = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list42);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list42);
        value = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym43$RPLACA, trellis, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym44$ACONS, key, value, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym31$CAR, trellis)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list42);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15510L)
    public static SubLObject trellis_finalize_column(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = (SubLObject)pos_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pos_tagger.$list36);
        trellis = current.first();
        current = current.rest();
        if (pos_tagger.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$sym45$CPOP, trellis);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pos_tagger.$list36);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 15658L)
    public static SubLObject trellis_get_max_entry(final SubLObject trellis) {
        SubLObject max_probability = pos_tagger.$impossibility$.getGlobalValue();
        SubLObject result = (SubLObject)pos_tagger.NIL;
        SubLObject probability = (SubLObject)pos_tagger.NIL;
        SubLObject cdolist_list_var = trellis.first();
        SubLObject stateXentry = (SubLObject)pos_tagger.NIL;
        stateXentry = cdolist_list_var.first();
        while (pos_tagger.NIL != cdolist_list_var) {
            probability = stateXentry.rest().first();
            if (probability.numGE(max_probability)) {
                result = stateXentry;
                max_probability = probability;
            }
            cdolist_list_var = cdolist_list_var.rest();
            stateXentry = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject tagger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)pos_tagger.ZERO_INTEGER);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject tagger_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tagger_native.class) ? pos_tagger.T : pos_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject tagger_hmm(final SubLObject v_object) {
        assert pos_tagger.NIL != tagger_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject tagger_state_interpretation(final SubLObject v_object) {
        assert pos_tagger.NIL != tagger_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject _csetf_tagger_hmm(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != tagger_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject _csetf_tagger_state_interpretation(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != tagger_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject make_tagger(SubLObject arglist) {
        if (arglist == pos_tagger.UNPROVIDED) {
            arglist = (SubLObject)pos_tagger.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tagger_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pos_tagger.NIL, next = arglist; pos_tagger.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pos_tagger.$kw59$HMM)) {
                _csetf_tagger_hmm(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw60$STATE_INTERPRETATION)) {
                _csetf_tagger_state_interpretation(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pos_tagger.$str61$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject visit_defstruct_tagger(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw62$BEGIN, (SubLObject)pos_tagger.$sym63$MAKE_TAGGER, (SubLObject)pos_tagger.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw59$HMM, tagger_hmm(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw60$STATE_INTERPRETATION, tagger_state_interpretation(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw65$END, (SubLObject)pos_tagger.$sym63$MAKE_TAGGER, (SubLObject)pos_tagger.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16236L)
    public static SubLObject visit_defstruct_object_tagger_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tagger(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16417L)
    public static SubLObject new_tagger(SubLObject source_path) {
        if (source_path == pos_tagger.UNPROVIDED) {
            source_path = pos_tagger.$tagger_data_path$.getDynamicValue();
        }
        assert pos_tagger.NIL != Types.listp(source_path) : source_path;
        final SubLObject tagger = make_tagger((SubLObject)pos_tagger.UNPROVIDED);
        _csetf_tagger_hmm(tagger, new_hmm(source_path));
        _csetf_tagger_state_interpretation(tagger, new_state_interpretation((SubLObject)pos_tagger.$int68$50, source_path));
        return tagger;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 16953L)
    public static SubLObject finalize_tagger(final SubLObject tagger) {
        assert pos_tagger.NIL != tagger_p(tagger) : tagger;
        return finalize_hmm(tagger_hmm(tagger));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 17134L)
    public static SubLObject tagger_tag_document(final SubLObject tagger, final SubLObject v_document) {
        assert pos_tagger.NIL != tagger_p(tagger) : tagger;
        assert pos_tagger.NIL != document.document_p(v_document) : v_document;
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)pos_tagger.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$5;
        SubLObject backwardP_var_$6;
        SubLObject length_$7;
        SubLObject v_iteration_$8;
        SubLObject element_num_$9;
        SubLObject sentence;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pos_tagger.NIL, v_iteration = (SubLObject)pos_tagger.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pos_tagger.ONE_INTEGER)) {
            element_num = ((pos_tagger.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pos_tagger.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$5 = document.paragraph_sentences(paragraph);
            backwardP_var_$6 = (SubLObject)pos_tagger.NIL;
            for (length_$7 = Sequences.length(vector_var_$5), v_iteration_$8 = (SubLObject)pos_tagger.NIL, v_iteration_$8 = (SubLObject)pos_tagger.ZERO_INTEGER; v_iteration_$8.numL(length_$7); v_iteration_$8 = Numbers.add(v_iteration_$8, (SubLObject)pos_tagger.ONE_INTEGER)) {
                element_num_$9 = ((pos_tagger.NIL != backwardP_var_$6) ? Numbers.subtract(length_$7, v_iteration_$8, (SubLObject)pos_tagger.ONE_INTEGER) : v_iteration_$8);
                sentence = Vectors.aref(vector_var_$5, element_num_$9);
                tagger_tag_sentence(tagger, sentence);
            }
        }
        return v_document;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 17764L)
    public static SubLObject tagger_tag_sentence(final SubLObject tagger, final SubLObject sentence) {
        assert pos_tagger.NIL != tagger_p(tagger) : tagger;
        assert pos_tagger.NIL != document.sentence_p(sentence) : sentence;
        final SubLObject words = document.sentence_yield(sentence);
        if (Sequences.length(words).isPositive()) {
            final SubLObject initial_spelling = document.word_string(Vectors.aref(words, (SubLObject)pos_tagger.ZERO_INTEGER));
            tagger_normalize_initial_capitalization(tagger, words);
            hmm_most_likely_path_probability(tagger_hmm(tagger), words);
            document.word_update(Vectors.aref(words, (SubLObject)pos_tagger.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$kw71$STRING, initial_spelling));
            SubLObject word = (SubLObject)pos_tagger.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Sequences.length(words), i = (SubLObject)pos_tagger.NIL, i = (SubLObject)pos_tagger.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)pos_tagger.ONE_INTEGER)) {
                word = Vectors.aref(words, i);
                patch_word_tag(word);
                document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$kw72$CATEGORY, state_interpretation_get(tagger_state_interpretation(tagger), document.word_category(word))));
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 19458L)
    public static SubLObject patch_word_tag(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_integer = conses_high.assoc((SubLObject)ConsesLow.cons(document.word_string(word), document.word_category(word)), pos_tagger.$word_tag_patches$.getDynamicValue(thread), (SubLObject)pos_tagger.EQUAL, (SubLObject)pos_tagger.UNPROVIDED).rest();
        return (SubLObject)((pos_tagger.NIL != new_integer) ? document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$kw72$CATEGORY, new_integer)) : pos_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 19779L)
    public static SubLObject tagger_normalize_initial_capitalization(final SubLObject tagger, final SubLObject words) {
        assert pos_tagger.NIL != tagger_p(tagger) : tagger;
        assert pos_tagger.NIL != Types.vectorp(words) : words;
        if (pos_tagger.NIL == exclude_from_normalizationP(document.word_string(Vectors.aref(words, (SubLObject)pos_tagger.ZERO_INTEGER)))) {
            final SubLObject orig_first = document.new_word((SubLObject)ConsesLow.list((SubLObject)pos_tagger.$kw71$STRING, document.word_string(Vectors.aref(words, (SubLObject)pos_tagger.ZERO_INTEGER))));
            final SubLObject second_word = Sequences.length(words).numG((SubLObject)pos_tagger.ONE_INTEGER) ? document.new_word((SubLObject)ConsesLow.list((SubLObject)pos_tagger.$kw71$STRING, document.word_string(Vectors.aref(words, (SubLObject)pos_tagger.ONE_INTEGER)))) : document.new_word((SubLObject)pos_tagger.$list75);
            final SubLObject downcase_first = document.new_word((SubLObject)ConsesLow.list((SubLObject)pos_tagger.$kw71$STRING, Strings.string_downcase(document.word_string(orig_first), (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED)));
            SubLObject orig_prob = pos_tagger.$impossibility$.getGlobalValue();
            SubLObject downcase_prob = pos_tagger.$impossibility$.getGlobalValue();
            final SubLObject orig_sentence = Vectors.vector(new SubLObject[] { orig_first, second_word });
            final SubLObject downcase_sentence = Vectors.vector(new SubLObject[] { downcase_first, second_word });
            final SubLObject hmm = tagger_hmm(tagger);
            if (pos_tagger.NIL != state_set_known_word(hmm_states(hmm), orig_first)) {
                orig_prob = hmm_most_likely_path_probability(hmm, orig_sentence);
            }
            if (pos_tagger.NIL != state_set_known_word(hmm_states(hmm), downcase_first)) {
                downcase_prob = hmm_most_likely_path_probability(hmm, downcase_sentence);
            }
            if (downcase_prob.numG(orig_prob)) {
                document.word_update(Vectors.aref(words, (SubLObject)pos_tagger.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$kw71$STRING, document.word_string(downcase_first)));
            }
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 21419L)
    public static SubLObject exclude_from_normalizationP(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.member(string, pos_tagger.$exclude_from_normalization$.getDynamicValue(thread), (SubLObject)pos_tagger.EQUAL, (SubLObject)pos_tagger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 21655L)
    public static SubLObject new_state_interpretation(final SubLObject size, final SubLObject source_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state_interpretation = Vectors.make_vector(size, (SubLObject)pos_tagger.UNPROVIDED);
        final SubLObject state_interpretation_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$state_interpretation_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        SubLObject tokens = (SubLObject)pos_tagger.NIL;
        SubLObject state = (SubLObject)pos_tagger.NIL;
        SubLObject interpretation = (SubLObject)pos_tagger.NIL;
        if (pos_tagger.NIL != Filesys.probe_file(state_interpretation_path)) {
            SubLObject stream = (SubLObject)pos_tagger.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)pos_tagger.NIL, thread);
                    stream = compatibility.open_text(state_interpretation_path, (SubLObject)pos_tagger.$kw19$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)pos_tagger.$str20$Unable_to_open__S, state_interpretation_path);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = (SubLObject)pos_tagger.NIL, line = file_utilities.cdolines_get_next_line(infile); pos_tagger.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        tokens = string_utilities.split_string(line, pos_tagger.$token_delimiters$.getGlobalValue());
                        state = reader.parse_integer(tokens.first(), (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED);
                        interpretation = (Sequences.length(tokens.rest()).numG((SubLObject)pos_tagger.ONE_INTEGER) ? tokens.rest() : conses_high.second(tokens));
                        Vectors.set_aref(state_interpretation, state, Symbols.make_keyword(interpretation));
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pos_tagger.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)pos_tagger.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str77$Unable_to_initialize_pos_tagger_s, state_interpretation_path);
        }
        return state_interpretation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22666L)
    public static SubLObject state_interpretation_get(final SubLObject si, final SubLObject state) {
        return Vectors.aref(si, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject hmm_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)pos_tagger.ZERO_INTEGER);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject hmm_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $hmm_native.class) ? pos_tagger.T : pos_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject hmm_initial_state(final SubLObject v_object) {
        assert pos_tagger.NIL != hmm_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject hmm_states(final SubLObject v_object) {
        assert pos_tagger.NIL != hmm_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject hmm_transitions(final SubLObject v_object) {
        assert pos_tagger.NIL != hmm_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject _csetf_hmm_initial_state(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != hmm_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject _csetf_hmm_states(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != hmm_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject _csetf_hmm_transitions(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != hmm_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject make_hmm(SubLObject arglist) {
        if (arglist == pos_tagger.UNPROVIDED) {
            arglist = (SubLObject)pos_tagger.NIL;
        }
        final SubLObject v_new = (SubLObject)new $hmm_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pos_tagger.NIL, next = arglist; pos_tagger.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pos_tagger.$kw92$INITIAL_STATE)) {
                _csetf_hmm_initial_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw93$STATES)) {
                _csetf_hmm_states(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw94$TRANSITIONS)) {
                _csetf_hmm_transitions(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pos_tagger.$str61$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject visit_defstruct_hmm(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw62$BEGIN, (SubLObject)pos_tagger.$sym95$MAKE_HMM, (SubLObject)pos_tagger.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw92$INITIAL_STATE, hmm_initial_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw93$STATES, hmm_states(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw94$TRANSITIONS, hmm_transitions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw65$END, (SubLObject)pos_tagger.$sym95$MAKE_HMM, (SubLObject)pos_tagger.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 22838L)
    public static SubLObject visit_defstruct_object_hmm_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hmm(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 23030L)
    public static SubLObject new_hmm(final SubLObject source_path) {
        final SubLObject path = file_utilities.cyc_home_filename(source_path, pos_tagger.$initial_state_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        final SubLObject hmm = make_hmm((SubLObject)pos_tagger.UNPROVIDED);
        if (pos_tagger.NIL != Filesys.probe_file(path)) {
            _csetf_hmm_initial_state(hmm, reader.parse_integer(load_list(path).first(), (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED));
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str97$Unable_to_initialize_pos_tagger_H, path);
        }
        _csetf_hmm_states(hmm, new_state_set(source_path, (SubLObject)pos_tagger.UNPROVIDED));
        _csetf_hmm_transitions(hmm, new_transition_set(source_path));
        return hmm;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 23727L)
    public static SubLObject finalize_hmm(final SubLObject hmm) {
        return finalize_state_set(hmm_states(hmm));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 23828L)
    public static SubLObject hmm_most_likely_path_probability(final SubLObject hmm, final SubLObject words) {
        SubLObject trellis = new_trellis();
        final SubLObject states = hmm_states(hmm);
        final SubLObject transitions = hmm_transitions(hmm);
        SubLObject word_cond_state_prob = (SubLObject)pos_tagger.NIL;
        SubLObject state = (SubLObject)pos_tagger.NIL;
        SubLObject probability = (SubLObject)pos_tagger.NIL;
        SubLObject max_entry = (SubLObject)pos_tagger.NIL;
        SubLObject prev_column = (SubLObject)pos_tagger.NIL;
        SubLObject prev_state = (SubLObject)pos_tagger.NIL;
        SubLObject transition_distribution = (SubLObject)pos_tagger.NIL;
        SubLObject word = (SubLObject)pos_tagger.NIL;
        ConsesLow.rplaca(trellis, conses_high.acons(hmm_initial_state(hmm), (SubLObject)ConsesLow.cons(pos_tagger.$certainty$.getGlobalValue(), (SubLObject)pos_tagger.NIL), trellis.first()));
        SubLObject cdotimes_end_var;
        SubLObject j;
        SubLObject cdolist_list_var;
        SubLObject stateXprob;
        SubLObject cdolist_list_var_$10;
        SubLObject prev_stateXtrellis_entry;
        for (cdotimes_end_var = Sequences.length(words), j = (SubLObject)pos_tagger.NIL, j = (SubLObject)pos_tagger.ZERO_INTEGER; j.numL(cdotimes_end_var); j = Numbers.add(j, (SubLObject)pos_tagger.ONE_INTEGER)) {
            word = Vectors.aref(words, j);
            prev_column = trellis.first();
            trellis = (SubLObject)ConsesLow.cons((SubLObject)pos_tagger.NIL, trellis);
            cdolist_list_var = state_set_get_distribution(states, word);
            stateXprob = (SubLObject)pos_tagger.NIL;
            stateXprob = cdolist_list_var.first();
            while (pos_tagger.NIL != cdolist_list_var) {
                state = stateXprob.first();
                word_cond_state_prob = stateXprob.rest();
                max_entry = (SubLObject)ConsesLow.cons(pos_tagger.$impossibility$.getGlobalValue(), (SubLObject)pos_tagger.ZERO_INTEGER);
                transition_distribution = transition_set_get_distribution(transitions, state);
                cdolist_list_var_$10 = prev_column;
                prev_stateXtrellis_entry = (SubLObject)pos_tagger.NIL;
                prev_stateXtrellis_entry = cdolist_list_var_$10.first();
                while (pos_tagger.NIL != cdolist_list_var_$10) {
                    prev_state = prev_stateXtrellis_entry.first();
                    probability = Numbers.add(prev_stateXtrellis_entry.rest().first(), Vectors.aref(transition_distribution, prev_state), word_cond_state_prob);
                    if (probability.numG(max_entry.first())) {
                        ConsesLow.rplaca(max_entry, probability);
                        ConsesLow.rplacd(max_entry, prev_state);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    prev_stateXtrellis_entry = cdolist_list_var_$10.first();
                }
                ConsesLow.rplaca(trellis, conses_high.acons(state, max_entry, trellis.first()));
                cdolist_list_var = cdolist_list_var.rest();
                stateXprob = cdolist_list_var.first();
            }
        }
        SubLObject word_index = Numbers.subtract(Sequences.length(words), (SubLObject)pos_tagger.ONE_INTEGER);
        final SubLObject maxstateXentry = trellis_get_max_entry(trellis);
        SubLObject max_state = maxstateXentry.first();
        while (!word_index.isNegative()) {
            document.word_update(Vectors.aref(words, word_index), (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$kw72$CATEGORY, max_state));
            max_state = conses_high.assoc(max_state, trellis.first(), Symbols.symbol_function((SubLObject)pos_tagger.EQL), (SubLObject)pos_tagger.UNPROVIDED).rest().rest();
            word_index = Numbers.subtract(word_index, (SubLObject)pos_tagger.ONE_INTEGER);
            trellis = trellis.rest();
        }
        return maxstateXentry.rest().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject state_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)pos_tagger.ZERO_INTEGER);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject state_set_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $state_set_native.class) ? pos_tagger.T : pos_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject state_set_store(final SubLObject v_object) {
        assert pos_tagger.NIL != state_set_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject state_set_estimator(final SubLObject v_object) {
        assert pos_tagger.NIL != state_set_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject state_set_cache(final SubLObject v_object) {
        assert pos_tagger.NIL != state_set_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject _csetf_state_set_store(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != state_set_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject _csetf_state_set_estimator(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != state_set_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject _csetf_state_set_cache(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != state_set_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject make_state_set(SubLObject arglist) {
        if (arglist == pos_tagger.UNPROVIDED) {
            arglist = (SubLObject)pos_tagger.NIL;
        }
        final SubLObject v_new = (SubLObject)new $state_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pos_tagger.NIL, next = arglist; pos_tagger.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pos_tagger.$kw112$STORE)) {
                _csetf_state_set_store(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw113$ESTIMATOR)) {
                _csetf_state_set_estimator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw114$CACHE)) {
                _csetf_state_set_cache(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pos_tagger.$str61$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject visit_defstruct_state_set(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw62$BEGIN, (SubLObject)pos_tagger.$sym115$MAKE_STATE_SET, (SubLObject)pos_tagger.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw112$STORE, state_set_store(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw113$ESTIMATOR, state_set_estimator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw114$CACHE, state_set_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw65$END, (SubLObject)pos_tagger.$sym115$MAKE_STATE_SET, (SubLObject)pos_tagger.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26217L)
    public static SubLObject visit_defstruct_object_state_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_state_set(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 26506L)
    public static SubLObject new_state_set(final SubLObject source_path, SubLObject cache_capacity) {
        if (cache_capacity == pos_tagger.UNPROVIDED) {
            cache_capacity = pos_tagger.$state_set_cache_capacity$.getDynamicValue();
        }
        final SubLObject path = file_utilities.cyc_home_filename(source_path, pos_tagger.$state_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str117$fht);
        final SubLObject state_set = make_state_set((SubLObject)pos_tagger.UNPROVIDED);
        if (pos_tagger.NIL != Filesys.probe_file(path)) {
            _csetf_state_set_store(state_set, new_cpf(path, Symbols.symbol_function((SubLObject)pos_tagger.EQUAL)));
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str118$Unable_to_initialize_pos_tagger_s, path);
        }
        _csetf_state_set_estimator(state_set, new_emission_probability_estimator(source_path));
        _csetf_state_set_cache(state_set, cache.new_cache(cache_capacity, Symbols.symbol_function((SubLObject)pos_tagger.EQUAL)));
        return state_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 27246L)
    public static SubLObject finalize_state_set(final SubLObject state_set) {
        return finalize_cpf(state_set_store(state_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 27370L)
    public static SubLObject state_set_get_distribution(final SubLObject state_set, final SubLObject word) {
        final SubLObject string = document.word_string(word);
        SubLObject distribution = cache.cache_get(state_set_cache(state_set), string);
        if (pos_tagger.NIL == distribution) {
            distribution = cpf_get_distribution(state_set_store(state_set), string);
            if (pos_tagger.NIL == distribution) {
                distribution = epe_get_distribution(state_set_estimator(state_set), string);
            }
            cache.cache_set(state_set_cache(state_set), string, distribution);
        }
        return distribution;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28323L)
    public static SubLObject state_set_known_word(final SubLObject states, final SubLObject word) {
        final SubLObject distribution = cache.cache_get(state_set_cache(states), document.word_string(word));
        return (pos_tagger.NIL != distribution) ? distribution : cpf_get_distribution(state_set_store(states), document.word_string(word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject transition_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)pos_tagger.ZERO_INTEGER);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject transition_set_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $transition_set_native.class) ? pos_tagger.T : pos_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject transition_set_known_probabilities(final SubLObject v_object) {
        assert pos_tagger.NIL != transition_set_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject transition_set_estimated_probabilities(final SubLObject v_object) {
        assert pos_tagger.NIL != transition_set_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject _csetf_transition_set_known_probabilities(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != transition_set_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject _csetf_transition_set_estimated_probabilities(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != transition_set_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject make_transition_set(SubLObject arglist) {
        if (arglist == pos_tagger.UNPROVIDED) {
            arglist = (SubLObject)pos_tagger.NIL;
        }
        final SubLObject v_new = (SubLObject)new $transition_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pos_tagger.NIL, next = arglist; pos_tagger.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pos_tagger.$kw131$KNOWN_PROBABILITIES)) {
                _csetf_transition_set_known_probabilities(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw132$ESTIMATED_PROBABILITIES)) {
                _csetf_transition_set_estimated_probabilities(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pos_tagger.$str61$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject visit_defstruct_transition_set(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw62$BEGIN, (SubLObject)pos_tagger.$sym133$MAKE_TRANSITION_SET, (SubLObject)pos_tagger.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw131$KNOWN_PROBABILITIES, transition_set_known_probabilities(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw132$ESTIMATED_PROBABILITIES, transition_set_estimated_probabilities(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw65$END, (SubLObject)pos_tagger.$sym133$MAKE_TRANSITION_SET, (SubLObject)pos_tagger.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28716L)
    public static SubLObject visit_defstruct_object_transition_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_transition_set(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 28903L)
    public static SubLObject new_transition_set(final SubLObject source_path) {
        final SubLObject transition_set = make_transition_set((SubLObject)pos_tagger.UNPROVIDED);
        final SubLObject transition_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$transition_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        if (pos_tagger.NIL != Filesys.probe_file(transition_path)) {
            _csetf_transition_set_known_probabilities(transition_set, new_cpa((SubLObject)pos_tagger.$int68$50, (SubLObject)pos_tagger.$int68$50, transition_path, Symbols.symbol_function((SubLObject)pos_tagger.$sym135$READ_FROM_STRING)));
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str136$Unable_to_initialize_pos_tagger_H, transition_path);
        }
        _csetf_transition_set_estimated_probabilities(transition_set, (SubLObject)pos_tagger.NIL);
        return transition_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 29681L)
    public static SubLObject transition_set_get(final SubLObject transition_set, final SubLObject conditioned, final SubLObject conditioning) {
        return Vectors.aref(Vectors.aref(transition_set_known_probabilities(transition_set), conditioned), conditioning);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30071L)
    public static SubLObject transition_set_get_distribution(final SubLObject transition_set, final SubLObject conditioned) {
        return Vectors.aref(transition_set_known_probabilities(transition_set), conditioned);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30229L)
    public static SubLObject transition_set_set(final SubLObject transition_set, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        cpa_set(transition_set_known_probabilities(transition_set), conditioned, conditioning, probability);
        return transition_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject emission_probability_estimator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)pos_tagger.ZERO_INTEGER);
        return (SubLObject)pos_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject emission_probability_estimator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $emission_probability_estimator_native.class) ? pos_tagger.T : pos_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject epe_open_states(final SubLObject v_object) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject epe_suffixes(final SubLObject v_object) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject epe_unknown_word(final SubLObject v_object) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject epe_suffix(final SubLObject v_object) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject epe_hyphen(final SubLObject v_object) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject epe_number(final SubLObject v_object) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject epe_capitalization(final SubLObject v_object) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject _csetf_epe_open_states(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject _csetf_epe_suffixes(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject _csetf_epe_unknown_word(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject _csetf_epe_suffix(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject _csetf_epe_hyphen(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject _csetf_epe_number(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject _csetf_epe_capitalization(final SubLObject v_object, final SubLObject value) {
        assert pos_tagger.NIL != emission_probability_estimator_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject make_emission_probability_estimator(SubLObject arglist) {
        if (arglist == pos_tagger.UNPROVIDED) {
            arglist = (SubLObject)pos_tagger.NIL;
        }
        final SubLObject v_new = (SubLObject)new $emission_probability_estimator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pos_tagger.NIL, next = arglist; pos_tagger.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pos_tagger.$kw159$OPEN_STATES)) {
                _csetf_epe_open_states(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw160$SUFFIXES)) {
                _csetf_epe_suffixes(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw161$UNKNOWN_WORD)) {
                _csetf_epe_unknown_word(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw162$SUFFIX)) {
                _csetf_epe_suffix(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw163$HYPHEN)) {
                _csetf_epe_hyphen(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw164$NUMBER)) {
                _csetf_epe_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pos_tagger.$kw165$CAPITALIZATION)) {
                _csetf_epe_capitalization(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pos_tagger.$str61$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject visit_defstruct_emission_probability_estimator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw62$BEGIN, (SubLObject)pos_tagger.$sym166$MAKE_EMISSION_PROBABILITY_ESTIMATOR, (SubLObject)pos_tagger.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw159$OPEN_STATES, epe_open_states(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw160$SUFFIXES, epe_suffixes(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw161$UNKNOWN_WORD, epe_unknown_word(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw162$SUFFIX, epe_suffix(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw163$HYPHEN, epe_hyphen(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw164$NUMBER, epe_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw64$SLOT, (SubLObject)pos_tagger.$kw165$CAPITALIZATION, epe_capitalization(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pos_tagger.$kw65$END, (SubLObject)pos_tagger.$sym166$MAKE_EMISSION_PROBABILITY_ESTIMATOR, (SubLObject)pos_tagger.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 30815L)
    public static SubLObject visit_defstruct_object_emission_probability_estimator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_emission_probability_estimator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 31531L)
    public static SubLObject new_emission_probability_estimator(final SubLObject source_path) {
        final SubLObject open_states_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$open_states_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        final SubLObject suffixes_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$suffixes_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        final SubLObject unknown_word_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$unknown_word_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        final SubLObject suffix_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$suffix_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        final SubLObject hyphen_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$hyphen_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        final SubLObject number_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$number_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        final SubLObject capitalization_path = file_utilities.cyc_home_filename(source_path, pos_tagger.$capitalization_resource$.getGlobalValue(), (SubLObject)pos_tagger.$str76$txt);
        final SubLObject estimator = make_emission_probability_estimator((SubLObject)pos_tagger.UNPROVIDED);
        final SubLObject suffix_trie = strie.new_strie(Symbols.symbol_function((SubLObject)pos_tagger.EQL));
        if (pos_tagger.NIL != Filesys.probe_file(open_states_path)) {
            SubLObject cdolist_list_var = load_list(open_states_path);
            SubLObject state = (SubLObject)pos_tagger.NIL;
            state = cdolist_list_var.first();
            while (pos_tagger.NIL != cdolist_list_var) {
                _csetf_epe_open_states(estimator, (SubLObject)ConsesLow.cons(reader.parse_integer(state, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED, (SubLObject)pos_tagger.UNPROVIDED), epe_open_states(estimator)));
                cdolist_list_var = cdolist_list_var.rest();
                state = cdolist_list_var.first();
            }
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str168$Unable_to_initialize_pos_tagger_p, open_states_path);
        }
        if (pos_tagger.NIL != Filesys.probe_file(suffixes_path)) {
            SubLObject cdolist_list_var = load_list(suffixes_path);
            SubLObject suffix = (SubLObject)pos_tagger.NIL;
            suffix = cdolist_list_var.first();
            while (pos_tagger.NIL != cdolist_list_var) {
                strie.strie_insert(suffix_trie, Sequences.reverse(suffix), suffix);
                cdolist_list_var = cdolist_list_var.rest();
                suffix = cdolist_list_var.first();
            }
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str168$Unable_to_initialize_pos_tagger_p, suffixes_path);
        }
        _csetf_epe_suffixes(estimator, suffix_trie);
        if (pos_tagger.NIL != Filesys.probe_file(unknown_word_path)) {
            _csetf_epe_unknown_word(estimator, new_cpm((SubLObject)pos_tagger.TWO_INTEGER, unknown_word_path, (SubLObject)pos_tagger.UNPROVIDED));
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str168$Unable_to_initialize_pos_tagger_p, unknown_word_path);
        }
        if (pos_tagger.NIL != Filesys.probe_file(suffix_path)) {
            _csetf_epe_suffix(estimator, new_cpm((SubLObject)pos_tagger.TWO_INTEGER, suffix_path, (SubLObject)pos_tagger.UNPROVIDED));
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str168$Unable_to_initialize_pos_tagger_p, suffix_path);
        }
        if (pos_tagger.NIL != Filesys.probe_file(hyphen_path)) {
            _csetf_epe_hyphen(estimator, new_cpm((SubLObject)pos_tagger.TWO_INTEGER, hyphen_path, (SubLObject)pos_tagger.UNPROVIDED));
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str168$Unable_to_initialize_pos_tagger_p, hyphen_path);
        }
        if (pos_tagger.NIL != Filesys.probe_file(number_path)) {
            _csetf_epe_number(estimator, new_cpm((SubLObject)pos_tagger.TWO_INTEGER, number_path, (SubLObject)pos_tagger.UNPROVIDED));
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str168$Unable_to_initialize_pos_tagger_p, number_path);
        }
        if (pos_tagger.NIL != Filesys.probe_file(capitalization_path)) {
            _csetf_epe_capitalization(estimator, new_cpm((SubLObject)pos_tagger.TWO_INTEGER, capitalization_path, (SubLObject)pos_tagger.UNPROVIDED));
        }
        else {
            Errors.error((SubLObject)pos_tagger.$str168$Unable_to_initialize_pos_tagger_p, capitalization_path);
        }
        return estimator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 33933L)
    public static SubLObject epe_get_distribution(final SubLObject epe, final SubLObject word) {
        final SubLObject suffix = suffix(epe, word);
        final SubLObject hyphen = hyphen(word);
        final SubLObject number = number(word);
        final SubLObject capitalization = capitalization(word);
        SubLObject distribution = (SubLObject)pos_tagger.NIL;
        SubLObject cdolist_list_var = epe_open_states(epe);
        SubLObject open_state = (SubLObject)pos_tagger.NIL;
        open_state = cdolist_list_var.first();
        while (pos_tagger.NIL != cdolist_list_var) {
            distribution = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(open_state, Numbers.add(new SubLObject[] { cpm_get(epe_unknown_word(epe), (SubLObject)pos_tagger.$str169$_UNKNOWN, open_state, Symbols.symbol_function((SubLObject)pos_tagger.EQL), (SubLObject)pos_tagger.UNPROVIDED), cpm_get(epe_suffix(epe), suffix, open_state, Symbols.symbol_function((SubLObject)pos_tagger.EQL), (SubLObject)pos_tagger.UNPROVIDED), cpm_get(epe_hyphen(epe), hyphen, open_state, Symbols.symbol_function((SubLObject)pos_tagger.EQL), (SubLObject)pos_tagger.UNPROVIDED), cpm_get(epe_capitalization(epe), capitalization, open_state, Symbols.symbol_function((SubLObject)pos_tagger.EQL), (SubLObject)pos_tagger.UNPROVIDED), cpm_get(epe_number(epe), number, open_state, Symbols.symbol_function((SubLObject)pos_tagger.EQL), (SubLObject)pos_tagger.UNPROVIDED) })), distribution);
            cdolist_list_var = cdolist_list_var.rest();
            open_state = cdolist_list_var.first();
        }
        return distribution;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 34771L)
    public static SubLObject suffix(final SubLObject epe, final SubLObject word) {
        if (pos_tagger.NIL != string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), word, (SubLObject)pos_tagger.UNPROVIDED)) {
            return (SubLObject)pos_tagger.$str170$_NOSUFF;
        }
        final SubLObject suffixes = strie.strie_prefixes(epe_suffixes(epe), Sequences.reverse(word));
        return (SubLObject)((pos_tagger.NIL != suffixes) ? suffixes.first().rest().first() : pos_tagger.$str170$_NOSUFF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 35194L)
    public static SubLObject capitalization(final SubLObject word) {
        return (SubLObject)((pos_tagger.NIL != Characters.upper_case_p(Strings.sublisp_char(word, (SubLObject)pos_tagger.ZERO_INTEGER))) ? pos_tagger.$str171$_CAP : pos_tagger.$str172$_NOCAP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 35404L)
    public static SubLObject hyphen(final SubLObject word) {
        return (SubLObject)((pos_tagger.NIL != string_utilities.contains_charP(word, (SubLObject)Characters.CHAR_hyphen)) ? pos_tagger.$str173$_HYP : pos_tagger.$str174$_NOHYP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 35578L)
    public static SubLObject number(final SubLObject word) {
        return (SubLObject)((pos_tagger.NIL != Characters.digit_char_p(Strings.sublisp_char(word, (SubLObject)pos_tagger.ZERO_INTEGER), (SubLObject)pos_tagger.UNPROVIDED)) ? pos_tagger.$str175$_DIGIT : pos_tagger.$str176$_NODIGIT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 35763L)
    public static SubLObject load_list(final SubLObject source_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pos_tagger.NIL != Types.stringp(source_path) : source_path;
        if (pos_tagger.NIL == Filesys.probe_file(source_path)) {
            Errors.error(Sequences.cconcatenate((SubLObject)pos_tagger.$str178$Unable_to_load_file__, file_utilities.why_not_probe_fileP(source_path)));
        }
        SubLObject strings = (SubLObject)pos_tagger.NIL;
        SubLObject stream = (SubLObject)pos_tagger.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)pos_tagger.NIL, thread);
                stream = compatibility.open_text(source_path, (SubLObject)pos_tagger.$kw19$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)pos_tagger.$str20$Unable_to_open__S, source_path);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                for (line = (SubLObject)pos_tagger.NIL, line = file_utilities.cdolines_get_next_line(infile); pos_tagger.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    strings = (SubLObject)ConsesLow.cons(line, strings);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pos_tagger.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)pos_tagger.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pos-tagger.lisp", position = 36277L)
    public static SubLObject get_tagger() {
        if (pos_tagger.NIL == pos_tagger.$pos_tagger$.getGlobalValue()) {
            pos_tagger.$pos_tagger$.setGlobalValue(new_tagger((SubLObject)pos_tagger.UNPROVIDED));
        }
        return pos_tagger.$pos_tagger$.getGlobalValue();
    }
    
    public static SubLObject declare_pos_tagger_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_cpm", "NEW-CPM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpm_get_distribution", "CPM-GET-DISTRIBUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpm_get", "CPM-GET", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpm_set", "CPM-SET", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_cpa", "NEW-CPA", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "cpa_get", "CPA-GET");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpa_set", "CPA-SET", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "create_cpf", "CREATE-CPF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_cpf", "NEW-CPF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "finalize_cpf", "FINALIZE-CPF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpf_get_distribution", "CPF-GET-DISTRIBUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpf_get", "CPF-GET", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpf_set", "CPF-SET", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpf_finalize", "CPF-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "cpf_create_backing_store", "CPF-CREATE-BACKING-STORE", 3, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "new_trellis_entry", "NEW-TRELLIS-ENTRY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "trellis_entry_probability", "TRELLIS-ENTRY-PROBABILITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "trellis_entry_source", "TRELLIS-ENTRY-SOURCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "trellis_entry_update", "TRELLIS-ENTRY-UPDATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_trellis", "NEW-TRELLIS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "trellis_new_column", "TRELLIS-NEW-COLUMN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "trellis_current_column", "TRELLIS-CURRENT-COLUMN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "trellis_get", "TRELLIS-GET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "trellis_set", "TRELLIS-SET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pos_tagger", "trellis_finalize_column", "TRELLIS-FINALIZE-COLUMN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "trellis_get_max_entry", "TRELLIS-GET-MAX-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "tagger_print_function_trampoline", "TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "tagger_p", "TAGGER-P", 1, 0, false);
        new $tagger_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "tagger_hmm", "TAGGER-HMM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "tagger_state_interpretation", "TAGGER-STATE-INTERPRETATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_tagger_hmm", "_CSETF-TAGGER-HMM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_tagger_state_interpretation", "_CSETF-TAGGER-STATE-INTERPRETATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "make_tagger", "MAKE-TAGGER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_tagger", "VISIT-DEFSTRUCT-TAGGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_object_tagger_method", "VISIT-DEFSTRUCT-OBJECT-TAGGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_tagger", "NEW-TAGGER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "finalize_tagger", "FINALIZE-TAGGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "tagger_tag_document", "TAGGER-TAG-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "tagger_tag_sentence", "TAGGER-TAG-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "patch_word_tag", "PATCH-WORD-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "tagger_normalize_initial_capitalization", "TAGGER-NORMALIZE-INITIAL-CAPITALIZATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "exclude_from_normalizationP", "EXCLUDE-FROM-NORMALIZATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_state_interpretation", "NEW-STATE-INTERPRETATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "state_interpretation_get", "STATE-INTERPRETATION-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "hmm_print_function_trampoline", "HMM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "hmm_p", "HMM-P", 1, 0, false);
        new $hmm_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "hmm_initial_state", "HMM-INITIAL-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "hmm_states", "HMM-STATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "hmm_transitions", "HMM-TRANSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_hmm_initial_state", "_CSETF-HMM-INITIAL-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_hmm_states", "_CSETF-HMM-STATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_hmm_transitions", "_CSETF-HMM-TRANSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "make_hmm", "MAKE-HMM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_hmm", "VISIT-DEFSTRUCT-HMM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_object_hmm_method", "VISIT-DEFSTRUCT-OBJECT-HMM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_hmm", "NEW-HMM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "finalize_hmm", "FINALIZE-HMM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "hmm_most_likely_path_probability", "HMM-MOST-LIKELY-PATH-PROBABILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "state_set_print_function_trampoline", "STATE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "state_set_p", "STATE-SET-P", 1, 0, false);
        new $state_set_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "state_set_store", "STATE-SET-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "state_set_estimator", "STATE-SET-ESTIMATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "state_set_cache", "STATE-SET-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_state_set_store", "_CSETF-STATE-SET-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_state_set_estimator", "_CSETF-STATE-SET-ESTIMATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_state_set_cache", "_CSETF-STATE-SET-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "make_state_set", "MAKE-STATE-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_state_set", "VISIT-DEFSTRUCT-STATE-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_object_state_set_method", "VISIT-DEFSTRUCT-OBJECT-STATE-SET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_state_set", "NEW-STATE-SET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "finalize_state_set", "FINALIZE-STATE-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "state_set_get_distribution", "STATE-SET-GET-DISTRIBUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "state_set_known_word", "STATE-SET-KNOWN-WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "transition_set_print_function_trampoline", "TRANSITION-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "transition_set_p", "TRANSITION-SET-P", 1, 0, false);
        new $transition_set_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "transition_set_known_probabilities", "TRANSITION-SET-KNOWN-PROBABILITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "transition_set_estimated_probabilities", "TRANSITION-SET-ESTIMATED-PROBABILITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_transition_set_known_probabilities", "_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_transition_set_estimated_probabilities", "_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "make_transition_set", "MAKE-TRANSITION-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_transition_set", "VISIT-DEFSTRUCT-TRANSITION-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_object_transition_set_method", "VISIT-DEFSTRUCT-OBJECT-TRANSITION-SET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_transition_set", "NEW-TRANSITION-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "transition_set_get", "TRANSITION-SET-GET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "transition_set_get_distribution", "TRANSITION-SET-GET-DISTRIBUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "transition_set_set", "TRANSITION-SET-SET", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "emission_probability_estimator_print_function_trampoline", "EMISSION-PROBABILITY-ESTIMATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "emission_probability_estimator_p", "EMISSION-PROBABILITY-ESTIMATOR-P", 1, 0, false);
        new $emission_probability_estimator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "epe_open_states", "EPE-OPEN-STATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "epe_suffixes", "EPE-SUFFIXES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "epe_unknown_word", "EPE-UNKNOWN-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "epe_suffix", "EPE-SUFFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "epe_hyphen", "EPE-HYPHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "epe_number", "EPE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "epe_capitalization", "EPE-CAPITALIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_epe_open_states", "_CSETF-EPE-OPEN-STATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_epe_suffixes", "_CSETF-EPE-SUFFIXES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_epe_unknown_word", "_CSETF-EPE-UNKNOWN-WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_epe_suffix", "_CSETF-EPE-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_epe_hyphen", "_CSETF-EPE-HYPHEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_epe_number", "_CSETF-EPE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "_csetf_epe_capitalization", "_CSETF-EPE-CAPITALIZATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "make_emission_probability_estimator", "MAKE-EMISSION-PROBABILITY-ESTIMATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_emission_probability_estimator", "VISIT-DEFSTRUCT-EMISSION-PROBABILITY-ESTIMATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "visit_defstruct_object_emission_probability_estimator_method", "VISIT-DEFSTRUCT-OBJECT-EMISSION-PROBABILITY-ESTIMATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "new_emission_probability_estimator", "NEW-EMISSION-PROBABILITY-ESTIMATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "epe_get_distribution", "EPE-GET-DISTRIBUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "suffix", "SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "capitalization", "CAPITALIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "hyphen", "HYPHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "number", "NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "load_list", "LOAD-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pos_tagger", "get_tagger", "GET-TAGGER", 0, 0, false);
        return (SubLObject)pos_tagger.NIL;
    }
    
    public static SubLObject init_pos_tagger_file() {
        pos_tagger.$tagger_data_path$ = SubLFiles.defparameter("*TAGGER-DATA-PATH*", (SubLObject)ConsesLow.list((SubLObject)pos_tagger.$str0$data, (SubLObject)pos_tagger.$str1$pos_tagging));
        pos_tagger.$exclude_from_normalization$ = SubLFiles.defparameter("*EXCLUDE-FROM-NORMALIZATION*", (SubLObject)pos_tagger.$list2);
        pos_tagger.$initial_state_resource$ = SubLFiles.defconstant("*INITIAL-STATE-RESOURCE*", (SubLObject)pos_tagger.$str3$initial_state);
        pos_tagger.$state_resource$ = SubLFiles.defconstant("*STATE-RESOURCE*", (SubLObject)pos_tagger.$str4$states);
        pos_tagger.$transition_resource$ = SubLFiles.defconstant("*TRANSITION-RESOURCE*", (SubLObject)pos_tagger.$str5$transitions);
        pos_tagger.$open_states_resource$ = SubLFiles.defconstant("*OPEN-STATES-RESOURCE*", (SubLObject)pos_tagger.$str6$open_states);
        pos_tagger.$suffixes_resource$ = SubLFiles.defconstant("*SUFFIXES-RESOURCE*", (SubLObject)pos_tagger.$str7$suffixes);
        pos_tagger.$unknown_word_resource$ = SubLFiles.defconstant("*UNKNOWN-WORD-RESOURCE*", (SubLObject)pos_tagger.$str8$unknown);
        pos_tagger.$suffix_resource$ = SubLFiles.defconstant("*SUFFIX-RESOURCE*", (SubLObject)pos_tagger.$str9$suffix);
        pos_tagger.$hyphen_resource$ = SubLFiles.defconstant("*HYPHEN-RESOURCE*", (SubLObject)pos_tagger.$str10$hyphen);
        pos_tagger.$number_resource$ = SubLFiles.defconstant("*NUMBER-RESOURCE*", (SubLObject)pos_tagger.$str11$number);
        pos_tagger.$capitalization_resource$ = SubLFiles.defconstant("*CAPITALIZATION-RESOURCE*", (SubLObject)pos_tagger.$str12$capitalization);
        pos_tagger.$state_interpretation_resource$ = SubLFiles.defconstant("*STATE-INTERPRETATION-RESOURCE*", (SubLObject)pos_tagger.$str13$index_to_state);
        pos_tagger.$token_delimiters$ = SubLFiles.defconstant("*TOKEN-DELIMITERS*", (SubLObject)pos_tagger.$list14);
        pos_tagger.$impossibility$ = SubLFiles.deflexical("*IMPOSSIBILITY*", (SubLObject)pos_tagger.$float15$_3_4028232e38);
        pos_tagger.$certainty$ = SubLFiles.deflexical("*CERTAINTY*", (SubLObject)pos_tagger.$float16$0_0);
        pos_tagger.$low_probability$ = SubLFiles.deflexical("*LOW-PROBABILITY*", (SubLObject)pos_tagger.$int17$_20);
        pos_tagger.$state_set_cache_capacity$ = SubLFiles.defparameter("*STATE-SET-CACHE-CAPACITY*", (SubLObject)pos_tagger.$int18$2000);
        pos_tagger.$pos_tagger$ = SubLFiles.deflexical("*POS-TAGGER*", (SubLObject)pos_tagger.NIL);
        pos_tagger.$dtp_tagger$ = SubLFiles.defconstant("*DTP-TAGGER*", (SubLObject)pos_tagger.$sym46$TAGGER);
        pos_tagger.$word_tag_patches$ = SubLFiles.defparameter("*WORD-TAG-PATCHES*", (SubLObject)pos_tagger.$list73);
        pos_tagger.$dtp_hmm$ = SubLFiles.defconstant("*DTP-HMM*", (SubLObject)pos_tagger.$sym78$HMM);
        pos_tagger.$dtp_state_set$ = SubLFiles.defconstant("*DTP-STATE-SET*", (SubLObject)pos_tagger.$sym98$STATE_SET);
        pos_tagger.$dtp_transition_set$ = SubLFiles.defconstant("*DTP-TRANSITION-SET*", (SubLObject)pos_tagger.$sym119$TRANSITION_SET);
        pos_tagger.$dtp_emission_probability_estimator$ = SubLFiles.defconstant("*DTP-EMISSION-PROBABILITY-ESTIMATOR*", (SubLObject)pos_tagger.$sym137$EMISSION_PROBABILITY_ESTIMATOR);
        return (SubLObject)pos_tagger.NIL;
    }
    
    public static SubLObject setup_pos_tagger_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pos_tagger.$dtp_tagger$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym53$TAGGER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pos_tagger.$list54);
        Structures.def_csetf((SubLObject)pos_tagger.$sym55$TAGGER_HMM, (SubLObject)pos_tagger.$sym56$_CSETF_TAGGER_HMM);
        Structures.def_csetf((SubLObject)pos_tagger.$sym57$TAGGER_STATE_INTERPRETATION, (SubLObject)pos_tagger.$sym58$_CSETF_TAGGER_STATE_INTERPRETATION);
        Equality.identity((SubLObject)pos_tagger.$sym46$TAGGER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pos_tagger.$dtp_tagger$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym66$VISIT_DEFSTRUCT_OBJECT_TAGGER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pos_tagger.$dtp_hmm$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym84$HMM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pos_tagger.$list85);
        Structures.def_csetf((SubLObject)pos_tagger.$sym86$HMM_INITIAL_STATE, (SubLObject)pos_tagger.$sym87$_CSETF_HMM_INITIAL_STATE);
        Structures.def_csetf((SubLObject)pos_tagger.$sym88$HMM_STATES, (SubLObject)pos_tagger.$sym89$_CSETF_HMM_STATES);
        Structures.def_csetf((SubLObject)pos_tagger.$sym90$HMM_TRANSITIONS, (SubLObject)pos_tagger.$sym91$_CSETF_HMM_TRANSITIONS);
        Equality.identity((SubLObject)pos_tagger.$sym78$HMM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pos_tagger.$dtp_hmm$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym96$VISIT_DEFSTRUCT_OBJECT_HMM_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pos_tagger.$dtp_state_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym104$STATE_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pos_tagger.$list105);
        Structures.def_csetf((SubLObject)pos_tagger.$sym106$STATE_SET_STORE, (SubLObject)pos_tagger.$sym107$_CSETF_STATE_SET_STORE);
        Structures.def_csetf((SubLObject)pos_tagger.$sym108$STATE_SET_ESTIMATOR, (SubLObject)pos_tagger.$sym109$_CSETF_STATE_SET_ESTIMATOR);
        Structures.def_csetf((SubLObject)pos_tagger.$sym110$STATE_SET_CACHE, (SubLObject)pos_tagger.$sym111$_CSETF_STATE_SET_CACHE);
        Equality.identity((SubLObject)pos_tagger.$sym98$STATE_SET);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pos_tagger.$dtp_state_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym116$VISIT_DEFSTRUCT_OBJECT_STATE_SET_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pos_tagger.$dtp_transition_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym125$TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pos_tagger.$list126);
        Structures.def_csetf((SubLObject)pos_tagger.$sym127$TRANSITION_SET_KNOWN_PROBABILITIES, (SubLObject)pos_tagger.$sym128$_CSETF_TRANSITION_SET_KNOWN_PROBABILITIES);
        Structures.def_csetf((SubLObject)pos_tagger.$sym129$TRANSITION_SET_ESTIMATED_PROBABILITIES, (SubLObject)pos_tagger.$sym130$_CSETF_TRANSITION_SET_ESTIMATED_PROBABILITIES);
        Equality.identity((SubLObject)pos_tagger.$sym119$TRANSITION_SET);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pos_tagger.$dtp_transition_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym134$VISIT_DEFSTRUCT_OBJECT_TRANSITION_SET_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pos_tagger.$dtp_emission_probability_estimator$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym143$EMISSION_PROBABILITY_ESTIMATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pos_tagger.$list144);
        Structures.def_csetf((SubLObject)pos_tagger.$sym145$EPE_OPEN_STATES, (SubLObject)pos_tagger.$sym146$_CSETF_EPE_OPEN_STATES);
        Structures.def_csetf((SubLObject)pos_tagger.$sym147$EPE_SUFFIXES, (SubLObject)pos_tagger.$sym148$_CSETF_EPE_SUFFIXES);
        Structures.def_csetf((SubLObject)pos_tagger.$sym149$EPE_UNKNOWN_WORD, (SubLObject)pos_tagger.$sym150$_CSETF_EPE_UNKNOWN_WORD);
        Structures.def_csetf((SubLObject)pos_tagger.$sym151$EPE_SUFFIX, (SubLObject)pos_tagger.$sym152$_CSETF_EPE_SUFFIX);
        Structures.def_csetf((SubLObject)pos_tagger.$sym153$EPE_HYPHEN, (SubLObject)pos_tagger.$sym154$_CSETF_EPE_HYPHEN);
        Structures.def_csetf((SubLObject)pos_tagger.$sym155$EPE_NUMBER, (SubLObject)pos_tagger.$sym156$_CSETF_EPE_NUMBER);
        Structures.def_csetf((SubLObject)pos_tagger.$sym157$EPE_CAPITALIZATION, (SubLObject)pos_tagger.$sym158$_CSETF_EPE_CAPITALIZATION);
        Equality.identity((SubLObject)pos_tagger.$sym137$EMISSION_PROBABILITY_ESTIMATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pos_tagger.$dtp_emission_probability_estimator$.getGlobalValue(), Symbols.symbol_function((SubLObject)pos_tagger.$sym167$VISIT_DEFSTRUCT_OBJECT_EMISSION_PROBABILITY_ESTIMATOR_METHOD));
        return (SubLObject)pos_tagger.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pos_tagger_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pos_tagger_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pos_tagger_file();
    }
    
    static {
        me = (SubLFile)new pos_tagger();
        pos_tagger.$tagger_data_path$ = null;
        pos_tagger.$exclude_from_normalization$ = null;
        pos_tagger.$initial_state_resource$ = null;
        pos_tagger.$state_resource$ = null;
        pos_tagger.$transition_resource$ = null;
        pos_tagger.$open_states_resource$ = null;
        pos_tagger.$suffixes_resource$ = null;
        pos_tagger.$unknown_word_resource$ = null;
        pos_tagger.$suffix_resource$ = null;
        pos_tagger.$hyphen_resource$ = null;
        pos_tagger.$number_resource$ = null;
        pos_tagger.$capitalization_resource$ = null;
        pos_tagger.$state_interpretation_resource$ = null;
        pos_tagger.$token_delimiters$ = null;
        pos_tagger.$impossibility$ = null;
        pos_tagger.$certainty$ = null;
        pos_tagger.$low_probability$ = null;
        pos_tagger.$state_set_cache_capacity$ = null;
        pos_tagger.$pos_tagger$ = null;
        pos_tagger.$dtp_tagger$ = null;
        pos_tagger.$word_tag_patches$ = null;
        pos_tagger.$dtp_hmm$ = null;
        pos_tagger.$dtp_state_set$ = null;
        pos_tagger.$dtp_transition_set$ = null;
        pos_tagger.$dtp_emission_probability_estimator$ = null;
        $str0$data = SubLObjectFactory.makeString("data");
        $str1$pos_tagging = SubLObjectFactory.makeString("pos-tagging");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("WWII"));
        $str3$initial_state = SubLObjectFactory.makeString("initial-state");
        $str4$states = SubLObjectFactory.makeString("states");
        $str5$transitions = SubLObjectFactory.makeString("transitions");
        $str6$open_states = SubLObjectFactory.makeString("open-states");
        $str7$suffixes = SubLObjectFactory.makeString("suffixes");
        $str8$unknown = SubLObjectFactory.makeString("unknown");
        $str9$suffix = SubLObjectFactory.makeString("suffix");
        $str10$hyphen = SubLObjectFactory.makeString("hyphen");
        $str11$number = SubLObjectFactory.makeString("number");
        $str12$capitalization = SubLObjectFactory.makeString("capitalization");
        $str13$index_to_state = SubLObjectFactory.makeString("index-to-state");
        $list14 = ConsesLow.list((SubLObject)Characters.CHAR_caret);
        $float15$_3_4028232e38 = (SubLFloat)SubLObjectFactory.makeDouble(-3.4028232E38);
        $float16$0_0 = (SubLFloat)SubLObjectFactory.makeDouble(0.0);
        $int17$_20 = SubLObjectFactory.makeInteger(-20);
        $int18$2000 = SubLObjectFactory.makeInteger(2000);
        $kw19$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str20$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITIONED"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONING"), (SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPA"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONED"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONING"));
        $sym23$AREF = SubLObjectFactory.makeSymbol("AREF");
        $int24$256 = SubLObjectFactory.makeInteger(256);
        $kw25$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $str26$Unable_to_initialize_file_hashtab = SubLObjectFactory.makeString("Unable to initialize file hashtable. ");
        $str27$Building_conditional_probability_ = SubLObjectFactory.makeString("Building conditional probability file...");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"));
        $sym29$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"));
        $sym31$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym32$CDR = SubLObjectFactory.makeSymbol("CDR");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"));
        $sym34$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym35$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRELLIS"));
        $sym37$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRELLIS"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $sym39$ASSOC = SubLObjectFactory.makeSymbol("ASSOC");
        $sym40$TRELLIS_CURRENT_COLUMN = SubLObjectFactory.makeSymbol("TRELLIS-CURRENT-COLUMN");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)pos_tagger.EQL));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRELLIS"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym43$RPLACA = SubLObjectFactory.makeSymbol("RPLACA");
        $sym44$ACONS = SubLObjectFactory.makeSymbol("ACONS");
        $sym45$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $sym46$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym47$TAGGER_P = SubLObjectFactory.makeSymbol("TAGGER-P");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HMM"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-INTERPRETATION"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HMM"), (SubLObject)SubLObjectFactory.makeKeyword("STATE-INTERPRETATION"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER-HMM"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER-STATE-INTERPRETATION"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAGGER-HMM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAGGER-STATE-INTERPRETATION"));
        $sym52$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym53$TAGGER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TAGGER-PRINT-FUNCTION-TRAMPOLINE");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER-P"));
        $sym55$TAGGER_HMM = SubLObjectFactory.makeSymbol("TAGGER-HMM");
        $sym56$_CSETF_TAGGER_HMM = SubLObjectFactory.makeSymbol("_CSETF-TAGGER-HMM");
        $sym57$TAGGER_STATE_INTERPRETATION = SubLObjectFactory.makeSymbol("TAGGER-STATE-INTERPRETATION");
        $sym58$_CSETF_TAGGER_STATE_INTERPRETATION = SubLObjectFactory.makeSymbol("_CSETF-TAGGER-STATE-INTERPRETATION");
        $kw59$HMM = SubLObjectFactory.makeKeyword("HMM");
        $kw60$STATE_INTERPRETATION = SubLObjectFactory.makeKeyword("STATE-INTERPRETATION");
        $str61$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw62$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym63$MAKE_TAGGER = SubLObjectFactory.makeSymbol("MAKE-TAGGER");
        $kw64$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw65$END = SubLObjectFactory.makeKeyword("END");
        $sym66$VISIT_DEFSTRUCT_OBJECT_TAGGER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TAGGER-METHOD");
        $sym67$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $int68$50 = SubLObjectFactory.makeInteger(50);
        $sym69$DOCUMENT_P = SubLObjectFactory.makeSymbol("DOCUMENT-P");
        $sym70$SENTENCE_P = SubLObjectFactory.makeSymbol("SENTENCE-P");
        $kw71$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw72$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("German"), (SubLObject)pos_tagger.EIGHTEEN_INTEGER), (SubLObject)pos_tagger.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Germans"), (SubLObject)SubLObjectFactory.makeInteger(38)), (SubLObject)SubLObjectFactory.makeInteger(25)), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("French"), (SubLObject)pos_tagger.EIGHTEEN_INTEGER), (SubLObject)pos_tagger.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("French"), (SubLObject)SubLObjectFactory.makeInteger(38)), (SubLObject)SubLObjectFactory.makeInteger(25)));
        $sym74$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeString("."));
        $str76$txt = SubLObjectFactory.makeString("txt");
        $str77$Unable_to_initialize_pos_tagger_s = SubLObjectFactory.makeString("Unable to initialize pos tagger state interpretation from ~a");
        $sym78$HMM = SubLObjectFactory.makeSymbol("HMM");
        $sym79$HMM_P = SubLObjectFactory.makeSymbol("HMM-P");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("STATES"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSITIONS"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INITIAL-STATE"), (SubLObject)SubLObjectFactory.makeKeyword("STATES"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSITIONS"));
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HMM-INITIAL-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("HMM-STATES"), (SubLObject)SubLObjectFactory.makeSymbol("HMM-TRANSITIONS"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HMM-INITIAL-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HMM-STATES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HMM-TRANSITIONS"));
        $sym84$HMM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HMM-PRINT-FUNCTION-TRAMPOLINE");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HMM-P"));
        $sym86$HMM_INITIAL_STATE = SubLObjectFactory.makeSymbol("HMM-INITIAL-STATE");
        $sym87$_CSETF_HMM_INITIAL_STATE = SubLObjectFactory.makeSymbol("_CSETF-HMM-INITIAL-STATE");
        $sym88$HMM_STATES = SubLObjectFactory.makeSymbol("HMM-STATES");
        $sym89$_CSETF_HMM_STATES = SubLObjectFactory.makeSymbol("_CSETF-HMM-STATES");
        $sym90$HMM_TRANSITIONS = SubLObjectFactory.makeSymbol("HMM-TRANSITIONS");
        $sym91$_CSETF_HMM_TRANSITIONS = SubLObjectFactory.makeSymbol("_CSETF-HMM-TRANSITIONS");
        $kw92$INITIAL_STATE = SubLObjectFactory.makeKeyword("INITIAL-STATE");
        $kw93$STATES = SubLObjectFactory.makeKeyword("STATES");
        $kw94$TRANSITIONS = SubLObjectFactory.makeKeyword("TRANSITIONS");
        $sym95$MAKE_HMM = SubLObjectFactory.makeSymbol("MAKE-HMM");
        $sym96$VISIT_DEFSTRUCT_OBJECT_HMM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HMM-METHOD");
        $str97$Unable_to_initialize_pos_tagger_H = SubLObjectFactory.makeString("Unable to initialize pos tagger HMM initial state from ~a");
        $sym98$STATE_SET = SubLObjectFactory.makeSymbol("STATE-SET");
        $sym99$STATE_SET_P = SubLObjectFactory.makeSymbol("STATE-SET-P");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE"), (SubLObject)SubLObjectFactory.makeSymbol("ESTIMATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"));
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STORE"), (SubLObject)SubLObjectFactory.makeKeyword("ESTIMATOR"), (SubLObject)SubLObjectFactory.makeKeyword("CACHE"));
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE-SET-STORE"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-SET-ESTIMATOR"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-SET-CACHE"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STATE-SET-STORE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STATE-SET-ESTIMATOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STATE-SET-CACHE"));
        $sym104$STATE_SET_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("STATE-SET-PRINT-FUNCTION-TRAMPOLINE");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-SET-P"));
        $sym106$STATE_SET_STORE = SubLObjectFactory.makeSymbol("STATE-SET-STORE");
        $sym107$_CSETF_STATE_SET_STORE = SubLObjectFactory.makeSymbol("_CSETF-STATE-SET-STORE");
        $sym108$STATE_SET_ESTIMATOR = SubLObjectFactory.makeSymbol("STATE-SET-ESTIMATOR");
        $sym109$_CSETF_STATE_SET_ESTIMATOR = SubLObjectFactory.makeSymbol("_CSETF-STATE-SET-ESTIMATOR");
        $sym110$STATE_SET_CACHE = SubLObjectFactory.makeSymbol("STATE-SET-CACHE");
        $sym111$_CSETF_STATE_SET_CACHE = SubLObjectFactory.makeSymbol("_CSETF-STATE-SET-CACHE");
        $kw112$STORE = SubLObjectFactory.makeKeyword("STORE");
        $kw113$ESTIMATOR = SubLObjectFactory.makeKeyword("ESTIMATOR");
        $kw114$CACHE = SubLObjectFactory.makeKeyword("CACHE");
        $sym115$MAKE_STATE_SET = SubLObjectFactory.makeSymbol("MAKE-STATE-SET");
        $sym116$VISIT_DEFSTRUCT_OBJECT_STATE_SET_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-STATE-SET-METHOD");
        $str117$fht = SubLObjectFactory.makeString("fht");
        $str118$Unable_to_initialize_pos_tagger_s = SubLObjectFactory.makeString("Unable to initialize pos tagger state set from ~a");
        $sym119$TRANSITION_SET = SubLObjectFactory.makeSymbol("TRANSITION-SET");
        $sym120$TRANSITION_SET_P = SubLObjectFactory.makeSymbol("TRANSITION-SET-P");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWN-PROBABILITIES"), (SubLObject)SubLObjectFactory.makeSymbol("ESTIMATED-PROBABILITIES"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KNOWN-PROBABILITIES"), (SubLObject)SubLObjectFactory.makeKeyword("ESTIMATED-PROBABILITIES"));
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSITION-SET-KNOWN-PROBABILITIES"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSITION-SET-ESTIMATED-PROBABILITIES"));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES"));
        $sym125$TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TRANSITION-SET-PRINT-FUNCTION-TRAMPOLINE");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSITION-SET-P"));
        $sym127$TRANSITION_SET_KNOWN_PROBABILITIES = SubLObjectFactory.makeSymbol("TRANSITION-SET-KNOWN-PROBABILITIES");
        $sym128$_CSETF_TRANSITION_SET_KNOWN_PROBABILITIES = SubLObjectFactory.makeSymbol("_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES");
        $sym129$TRANSITION_SET_ESTIMATED_PROBABILITIES = SubLObjectFactory.makeSymbol("TRANSITION-SET-ESTIMATED-PROBABILITIES");
        $sym130$_CSETF_TRANSITION_SET_ESTIMATED_PROBABILITIES = SubLObjectFactory.makeSymbol("_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES");
        $kw131$KNOWN_PROBABILITIES = SubLObjectFactory.makeKeyword("KNOWN-PROBABILITIES");
        $kw132$ESTIMATED_PROBABILITIES = SubLObjectFactory.makeKeyword("ESTIMATED-PROBABILITIES");
        $sym133$MAKE_TRANSITION_SET = SubLObjectFactory.makeSymbol("MAKE-TRANSITION-SET");
        $sym134$VISIT_DEFSTRUCT_OBJECT_TRANSITION_SET_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSITION-SET-METHOD");
        $sym135$READ_FROM_STRING = SubLObjectFactory.makeSymbol("READ-FROM-STRING");
        $str136$Unable_to_initialize_pos_tagger_H = SubLObjectFactory.makeString("Unable to initialize pos tagger HMM transition set from ~a");
        $sym137$EMISSION_PROBABILITY_ESTIMATOR = SubLObjectFactory.makeSymbol("EMISSION-PROBABILITY-ESTIMATOR");
        $sym138$EMISSION_PROBABILITY_ESTIMATOR_P = SubLObjectFactory.makeSymbol("EMISSION-PROBABILITY-ESTIMATOR-P");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-STATES"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFIX"), (SubLObject)SubLObjectFactory.makeSymbol("HYPHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("CAPITALIZATION"));
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPEN-STATES"), (SubLObject)SubLObjectFactory.makeKeyword("SUFFIXES"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-WORD"), (SubLObject)SubLObjectFactory.makeKeyword("SUFFIX"), (SubLObject)SubLObjectFactory.makeKeyword("HYPHEN"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("CAPITALIZATION"));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EPE-OPEN-STATES"), (SubLObject)SubLObjectFactory.makeSymbol("EPE-SUFFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("EPE-UNKNOWN-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("EPE-SUFFIX"), (SubLObject)SubLObjectFactory.makeSymbol("EPE-HYPHEN"), (SubLObject)SubLObjectFactory.makeSymbol("EPE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("EPE-CAPITALIZATION"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EPE-OPEN-STATES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EPE-SUFFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EPE-UNKNOWN-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EPE-SUFFIX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EPE-HYPHEN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EPE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EPE-CAPITALIZATION"));
        $sym143$EMISSION_PROBABILITY_ESTIMATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EMISSION-PROBABILITY-ESTIMATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EMISSION-PROBABILITY-ESTIMATOR-P"));
        $sym145$EPE_OPEN_STATES = SubLObjectFactory.makeSymbol("EPE-OPEN-STATES");
        $sym146$_CSETF_EPE_OPEN_STATES = SubLObjectFactory.makeSymbol("_CSETF-EPE-OPEN-STATES");
        $sym147$EPE_SUFFIXES = SubLObjectFactory.makeSymbol("EPE-SUFFIXES");
        $sym148$_CSETF_EPE_SUFFIXES = SubLObjectFactory.makeSymbol("_CSETF-EPE-SUFFIXES");
        $sym149$EPE_UNKNOWN_WORD = SubLObjectFactory.makeSymbol("EPE-UNKNOWN-WORD");
        $sym150$_CSETF_EPE_UNKNOWN_WORD = SubLObjectFactory.makeSymbol("_CSETF-EPE-UNKNOWN-WORD");
        $sym151$EPE_SUFFIX = SubLObjectFactory.makeSymbol("EPE-SUFFIX");
        $sym152$_CSETF_EPE_SUFFIX = SubLObjectFactory.makeSymbol("_CSETF-EPE-SUFFIX");
        $sym153$EPE_HYPHEN = SubLObjectFactory.makeSymbol("EPE-HYPHEN");
        $sym154$_CSETF_EPE_HYPHEN = SubLObjectFactory.makeSymbol("_CSETF-EPE-HYPHEN");
        $sym155$EPE_NUMBER = SubLObjectFactory.makeSymbol("EPE-NUMBER");
        $sym156$_CSETF_EPE_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-EPE-NUMBER");
        $sym157$EPE_CAPITALIZATION = SubLObjectFactory.makeSymbol("EPE-CAPITALIZATION");
        $sym158$_CSETF_EPE_CAPITALIZATION = SubLObjectFactory.makeSymbol("_CSETF-EPE-CAPITALIZATION");
        $kw159$OPEN_STATES = SubLObjectFactory.makeKeyword("OPEN-STATES");
        $kw160$SUFFIXES = SubLObjectFactory.makeKeyword("SUFFIXES");
        $kw161$UNKNOWN_WORD = SubLObjectFactory.makeKeyword("UNKNOWN-WORD");
        $kw162$SUFFIX = SubLObjectFactory.makeKeyword("SUFFIX");
        $kw163$HYPHEN = SubLObjectFactory.makeKeyword("HYPHEN");
        $kw164$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw165$CAPITALIZATION = SubLObjectFactory.makeKeyword("CAPITALIZATION");
        $sym166$MAKE_EMISSION_PROBABILITY_ESTIMATOR = SubLObjectFactory.makeSymbol("MAKE-EMISSION-PROBABILITY-ESTIMATOR");
        $sym167$VISIT_DEFSTRUCT_OBJECT_EMISSION_PROBABILITY_ESTIMATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EMISSION-PROBABILITY-ESTIMATOR-METHOD");
        $str168$Unable_to_initialize_pos_tagger_p = SubLObjectFactory.makeString("Unable to initialize pos tagger pos estimator from ~a");
        $str169$_UNKNOWN = SubLObjectFactory.makeString(":UNKNOWN");
        $str170$_NOSUFF = SubLObjectFactory.makeString(":NOSUFF");
        $str171$_CAP = SubLObjectFactory.makeString(":CAP");
        $str172$_NOCAP = SubLObjectFactory.makeString(":NOCAP");
        $str173$_HYP = SubLObjectFactory.makeString(":HYP");
        $str174$_NOHYP = SubLObjectFactory.makeString(":NOHYP");
        $str175$_DIGIT = SubLObjectFactory.makeString(":DIGIT");
        $str176$_NODIGIT = SubLObjectFactory.makeString(":NODIGIT");
        $sym177$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str178$Unable_to_load_file__ = SubLObjectFactory.makeString("Unable to load file. ");
    }
    
    public static final class $tagger_native extends SubLStructNative
    {
        public SubLObject $hmm;
        public SubLObject $state_interpretation;
        private static final SubLStructDeclNative structDecl;
        
        public $tagger_native() {
            this.$hmm = (SubLObject)CommonSymbols.NIL;
            this.$state_interpretation = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tagger_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$hmm;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$state_interpretation;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$hmm = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$state_interpretation = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$tagger_native.class, pos_tagger.$sym46$TAGGER, pos_tagger.$sym47$TAGGER_P, pos_tagger.$list48, pos_tagger.$list49, new String[] { "$hmm", "$state_interpretation" }, pos_tagger.$list50, pos_tagger.$list51, pos_tagger.$sym52$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $tagger_p$UnaryFunction extends UnaryFunction
    {
        public $tagger_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TAGGER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pos_tagger.tagger_p(arg1);
        }
    }
    
    public static final class $hmm_native extends SubLStructNative
    {
        public SubLObject $initial_state;
        public SubLObject $states;
        public SubLObject $transitions;
        private static final SubLStructDeclNative structDecl;
        
        public $hmm_native() {
            this.$initial_state = (SubLObject)CommonSymbols.NIL;
            this.$states = (SubLObject)CommonSymbols.NIL;
            this.$transitions = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$hmm_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$initial_state;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$states;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$transitions;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$initial_state = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$states = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$transitions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$hmm_native.class, pos_tagger.$sym78$HMM, pos_tagger.$sym79$HMM_P, pos_tagger.$list80, pos_tagger.$list81, new String[] { "$initial_state", "$states", "$transitions" }, pos_tagger.$list82, pos_tagger.$list83, pos_tagger.$sym52$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $hmm_p$UnaryFunction extends UnaryFunction
    {
        public $hmm_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HMM-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pos_tagger.hmm_p(arg1);
        }
    }
    
    public static final class $state_set_native extends SubLStructNative
    {
        public SubLObject $store;
        public SubLObject $estimator;
        public SubLObject $cache;
        private static final SubLStructDeclNative structDecl;
        
        public $state_set_native() {
            this.$store = (SubLObject)CommonSymbols.NIL;
            this.$estimator = (SubLObject)CommonSymbols.NIL;
            this.$cache = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$state_set_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$store;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$estimator;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$cache;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$estimator = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$cache = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$state_set_native.class, pos_tagger.$sym98$STATE_SET, pos_tagger.$sym99$STATE_SET_P, pos_tagger.$list100, pos_tagger.$list101, new String[] { "$store", "$estimator", "$cache" }, pos_tagger.$list102, pos_tagger.$list103, pos_tagger.$sym52$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $state_set_p$UnaryFunction extends UnaryFunction
    {
        public $state_set_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STATE-SET-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pos_tagger.state_set_p(arg1);
        }
    }
    
    public static final class $transition_set_native extends SubLStructNative
    {
        public SubLObject $known_probabilities;
        public SubLObject $estimated_probabilities;
        private static final SubLStructDeclNative structDecl;
        
        public $transition_set_native() {
            this.$known_probabilities = (SubLObject)CommonSymbols.NIL;
            this.$estimated_probabilities = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$transition_set_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$known_probabilities;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$estimated_probabilities;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$known_probabilities = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$estimated_probabilities = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$transition_set_native.class, pos_tagger.$sym119$TRANSITION_SET, pos_tagger.$sym120$TRANSITION_SET_P, pos_tagger.$list121, pos_tagger.$list122, new String[] { "$known_probabilities", "$estimated_probabilities" }, pos_tagger.$list123, pos_tagger.$list124, pos_tagger.$sym52$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $transition_set_p$UnaryFunction extends UnaryFunction
    {
        public $transition_set_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANSITION-SET-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pos_tagger.transition_set_p(arg1);
        }
    }
    
    public static final class $emission_probability_estimator_native extends SubLStructNative
    {
        public SubLObject $open_states;
        public SubLObject $suffixes;
        public SubLObject $unknown_word;
        public SubLObject $suffix;
        public SubLObject $hyphen;
        public SubLObject $number;
        public SubLObject $capitalization;
        private static final SubLStructDeclNative structDecl;
        
        public $emission_probability_estimator_native() {
            this.$open_states = (SubLObject)CommonSymbols.NIL;
            this.$suffixes = (SubLObject)CommonSymbols.NIL;
            this.$unknown_word = (SubLObject)CommonSymbols.NIL;
            this.$suffix = (SubLObject)CommonSymbols.NIL;
            this.$hyphen = (SubLObject)CommonSymbols.NIL;
            this.$number = (SubLObject)CommonSymbols.NIL;
            this.$capitalization = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$emission_probability_estimator_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$open_states;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$suffixes;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$unknown_word;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$suffix;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$hyphen;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$number;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$capitalization;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$open_states = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$suffixes = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$unknown_word = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$suffix = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$hyphen = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$number = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$capitalization = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$emission_probability_estimator_native.class, pos_tagger.$sym137$EMISSION_PROBABILITY_ESTIMATOR, pos_tagger.$sym138$EMISSION_PROBABILITY_ESTIMATOR_P, pos_tagger.$list139, pos_tagger.$list140, new String[] { "$open_states", "$suffixes", "$unknown_word", "$suffix", "$hyphen", "$number", "$capitalization" }, pos_tagger.$list141, pos_tagger.$list142, pos_tagger.$sym52$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $emission_probability_estimator_p$UnaryFunction extends UnaryFunction
    {
        public $emission_probability_estimator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EMISSION-PROBABILITY-ESTIMATOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pos_tagger.emission_probability_estimator_p(arg1);
        }
    }
}

/*

	Total time: 636 ms
	
*/