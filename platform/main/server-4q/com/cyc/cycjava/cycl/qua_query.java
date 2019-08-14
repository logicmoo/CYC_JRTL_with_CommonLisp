/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      QUA-QUERY
 * source file: /cyc/top/cycl/qua-query.lisp
 * created:     2019/07/03 17:38:26
 */
public final class qua_query extends SubLTranslatedFile implements V12 {
    public static final SubLObject sets_equalp(SubLObject set1, SubLObject set2) {
        return list_utilities.sets_equalP(set1, set2, symbol_function(EQUALP));
    }

    static private final SubLString $str_alt44$ = makeString("");

    public static final class $augmented_query_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$original_phrase;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$id;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$tokenizations;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$query_string;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$query_string_staleP;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$search_engine;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$original_phrase = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$id = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$tokenizations = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$query_string = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$query_string_staleP = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$augmented_query_native.this.$search_engine = value;
        }

        public SubLObject $original_phrase = Lisp.NIL;

        public SubLObject $id = Lisp.NIL;

        public SubLObject $tokenizations = Lisp.NIL;

        public SubLObject $query_string = Lisp.NIL;

        public SubLObject $query_string_staleP = Lisp.NIL;

        public SubLObject $search_engine = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.qua_query.$augmented_query_native.class, AUGMENTED_QUERY, AUGMENTED_QUERY_P, $list_alt14, $list_alt15, new String[]{ "$original_phrase", "$id", "$tokenizations", "$query_string", "$query_string_staleP", "$search_engine" }, $list_alt16, $list_alt17, PRINT_AUGMENTED_QUERY);
    }

    public static final class $aq_term_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$original_string;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$raw_meanings;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$possible_meanings;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$disfavored_meanings;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$positive_strings;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$positive_terms_in_upward_closure;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$positive_strings_staleP;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$negative_strings;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$negative_terms_in_upward_closure;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$negative_strings_staleP;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$original_string = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$raw_meanings = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$possible_meanings = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$disfavored_meanings = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$positive_strings = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$positive_terms_in_upward_closure = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$positive_strings_staleP = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$negative_strings = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$negative_terms_in_upward_closure = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.qua_query.$aq_term_native.this.$negative_strings_staleP = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $original_string = Lisp.NIL;

        public SubLObject $raw_meanings = Lisp.NIL;

        public SubLObject $possible_meanings = Lisp.NIL;

        public SubLObject $disfavored_meanings = Lisp.NIL;

        public SubLObject $positive_strings = Lisp.NIL;

        public SubLObject $positive_terms_in_upward_closure = Lisp.NIL;

        public SubLObject $positive_strings_staleP = Lisp.NIL;

        public SubLObject $negative_strings = Lisp.NIL;

        public SubLObject $negative_terms_in_upward_closure = Lisp.NIL;

        public SubLObject $negative_strings_staleP = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.qua_query.$aq_term_native.class, AQ_TERM, AQ_TERM_P, $list_alt58, $list_alt59, new String[]{ "$id", "$original_string", "$raw_meanings", "$possible_meanings", "$disfavored_meanings", "$positive_strings", "$positive_terms_in_upward_closure", "$positive_strings_staleP", "$negative_strings", "$negative_terms_in_upward_closure", "$negative_strings_staleP" }, $list_alt60, $list_alt61, PRINT_AQ_TERM);
    }

    public static final SubLFile me = new qua_query();

 public static final String myName = "com.cyc.cycjava.cycl.qua_query";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $qua_default_search_engine$ = makeSymbol("*QUA-DEFAULT-SEARCH-ENGINE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $google_string_count_limit$ = makeSymbol("*GOOGLE-STRING-COUNT-LIMIT*");

    // defparameter
    /**
     * to be bound to the proper engine-specific values for each particular query
     */
    @LispMethod(comment = "to be bound to the proper engine-specific values for each particular query\ndefparameter")
    private static final SubLSymbol $qua_operators$ = makeSymbol("*QUA-OPERATORS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $augmented_query_id_generator$ = makeSymbol("*AUGMENTED-QUERY-ID-GENERATOR*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $augmented_query_dict$ = makeSymbol("*AUGMENTED-QUERY-DICT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $augmented_query_lexicon$ = makeSymbol("*AUGMENTED-QUERY-LEXICON*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_augmented_query$ = makeSymbol("*DTP-AUGMENTED-QUERY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $qua_url_templates$ = makeSymbol("*QUA-URL-TEMPLATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $aq_term_id_generator$ = makeSymbol("*AQ-TERM-ID-GENERATOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_aq_term$ = makeSymbol("*DTP-AQ-TERM*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $qua_filter_termP_caching_state$ = makeSymbol("*QUA-FILTER-TERM?-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $qua_speech_part_preds$ = makeSymbol("*QUA-SPEECH-PART-PREDS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $qua_ignore_predsP$ = makeSymbol("*QUA-IGNORE-PREDS?*");

    // defparameter
    /**
     * terms that are more general than this cutoff will not be used in formulating
     * augmented queries, since they're likely to match too often
     */
    @LispMethod(comment = "terms that are more general than this cutoff will not be used in formulating\r\naugmented queries, since they\'re likely to match too often\ndefparameter\nterms that are more general than this cutoff will not be used in formulating\naugmented queries, since they\'re likely to match too often")
    private static final SubLSymbol $qua_generality_cutoff$ = makeSymbol("*QUA-GENERALITY-CUTOFF*");







    private static final SubLSymbol SIMPLE_DATE_LEARN = makeSymbol("SIMPLE-DATE-LEARN");

    private static final SubLSymbol AUGMENTED_QUERY = makeSymbol("AUGMENTED-QUERY");

    private static final SubLSymbol AUGMENTED_QUERY_P = makeSymbol("AUGMENTED-QUERY-P");

    static private final SubLList $list14 = list(makeSymbol("ORIGINAL-PHRASE"), makeSymbol("ID"), makeSymbol("TOKENIZATIONS"), makeSymbol("QUERY-STRING"), makeSymbol("QUERY-STRING-STALE?"), makeSymbol("SEARCH-ENGINE"));

    static private final SubLList $list15 = list(makeKeyword("ORIGINAL-PHRASE"), makeKeyword("ID"), makeKeyword("TOKENIZATIONS"), makeKeyword("QUERY-STRING"), makeKeyword("QUERY-STRING-STALE?"), makeKeyword("SEARCH-ENGINE"));

    static private final SubLList $list16 = list(makeSymbol("AQ-ORIGINAL-PHRASE"), makeSymbol("AQ-ID"), makeSymbol("AQ-TOKENIZATIONS"), makeSymbol("AQ-QUERY-STRING"), makeSymbol("AQ-QUERY-STRING-STALE?"), makeSymbol("AQ-SEARCH-ENGINE"));

    static private final SubLList $list17 = list(makeSymbol("_CSETF-AQ-ORIGINAL-PHRASE"), makeSymbol("_CSETF-AQ-ID"), makeSymbol("_CSETF-AQ-TOKENIZATIONS"), makeSymbol("_CSETF-AQ-QUERY-STRING"), makeSymbol("_CSETF-AQ-QUERY-STRING-STALE?"), makeSymbol("_CSETF-AQ-SEARCH-ENGINE"));

    private static final SubLSymbol PRINT_AUGMENTED_QUERY = makeSymbol("PRINT-AUGMENTED-QUERY");

    private static final SubLSymbol AUGMENTED_QUERY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AUGMENTED-QUERY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list20 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AUGMENTED-QUERY-P"));

    private static final SubLSymbol AQ_ORIGINAL_PHRASE = makeSymbol("AQ-ORIGINAL-PHRASE");

    private static final SubLSymbol _CSETF_AQ_ORIGINAL_PHRASE = makeSymbol("_CSETF-AQ-ORIGINAL-PHRASE");

    private static final SubLSymbol AQ_ID = makeSymbol("AQ-ID");

    private static final SubLSymbol _CSETF_AQ_ID = makeSymbol("_CSETF-AQ-ID");

    private static final SubLSymbol AQ_TOKENIZATIONS = makeSymbol("AQ-TOKENIZATIONS");

    private static final SubLSymbol _CSETF_AQ_TOKENIZATIONS = makeSymbol("_CSETF-AQ-TOKENIZATIONS");

    private static final SubLSymbol AQ_QUERY_STRING = makeSymbol("AQ-QUERY-STRING");

    private static final SubLSymbol _CSETF_AQ_QUERY_STRING = makeSymbol("_CSETF-AQ-QUERY-STRING");

    private static final SubLSymbol $sym29$AQ_QUERY_STRING_STALE_ = makeSymbol("AQ-QUERY-STRING-STALE?");

    private static final SubLSymbol $sym30$_CSETF_AQ_QUERY_STRING_STALE_ = makeSymbol("_CSETF-AQ-QUERY-STRING-STALE?");

    private static final SubLSymbol AQ_SEARCH_ENGINE = makeSymbol("AQ-SEARCH-ENGINE");

    private static final SubLSymbol _CSETF_AQ_SEARCH_ENGINE = makeSymbol("_CSETF-AQ-SEARCH-ENGINE");

    private static final SubLSymbol $kw37$QUERY_STRING_STALE_ = makeKeyword("QUERY-STRING-STALE?");

    private static final SubLString $str39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_AUGMENTED_QUERY = makeSymbol("MAKE-AUGMENTED-QUERY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AUGMENTED_QUERY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AUGMENTED-QUERY-METHOD");

    private static final SubLString $str45$_augmented_query__A__S__S_ = makeString("<augmented-query-~A:~S:~S>");

    private static final SubLList $list47 = list(makeKeyword("OR"), makeSymbol("OR"), makeKeyword("AND"), NIL);

    private static final SubLList $list48 = list(makeKeyword("OR"), makeSymbol("OR"), makeKeyword("AND"), makeSymbol("AND"));

    private static final SubLList $list49 = list(makeKeyword("ALTAVISTA"), makeString("http://www.altavista.com/web/results?q=SEARCH-STRING&kgs=1&kls=0&nbq=ANSWER-COUNT"), makeKeyword("GOOGLE"), makeString("http://www.google.com/search?hl=en&q=SEARCH-STRING&btnG=Google+Search&num=ANSWER-COUNT"));

    private static final SubLString $str50$ = makeString("");

    private static final SubLString $str51$ANSWER_COUNT = makeString("ANSWER-COUNT");

    private static final SubLString $str52$SEARCH_STRING = makeString("SEARCH-STRING");

    private static final SubLString $str53$_A = makeString("~A");

    private static final SubLString $str57$_ = makeString("\"");



    private static final SubLSymbol QUA_GENERATE_PHRASE = makeSymbol("QUA-GENERATE-PHRASE");

    static private final SubLList $list61 = list(reader_make_constant_shell("nonPlural-Generic"));

    private static final SubLSymbol AQ_TERM = makeSymbol("AQ-TERM");

    private static final SubLSymbol AQ_TERM_P = makeSymbol("AQ-TERM-P");

    private static final SubLList $list64 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("ORIGINAL-STRING"), makeSymbol("RAW-MEANINGS"), makeSymbol("POSSIBLE-MEANINGS"), makeSymbol("DISFAVORED-MEANINGS"), makeSymbol("POSITIVE-STRINGS"), makeSymbol("POSITIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("POSITIVE-STRINGS-STALE?"), makeSymbol("NEGATIVE-STRINGS"), makeSymbol("NEGATIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("NEGATIVE-STRINGS-STALE?") });

    private static final SubLList $list65 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("ORIGINAL-STRING"), makeKeyword("RAW-MEANINGS"), makeKeyword("POSSIBLE-MEANINGS"), makeKeyword("DISFAVORED-MEANINGS"), makeKeyword("POSITIVE-STRINGS"), makeKeyword("POSITIVE-TERMS-IN-UPWARD-CLOSURE"), makeKeyword("POSITIVE-STRINGS-STALE?"), makeKeyword("NEGATIVE-STRINGS"), makeKeyword("NEGATIVE-TERMS-IN-UPWARD-CLOSURE"), makeKeyword("NEGATIVE-STRINGS-STALE?") });

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("AQ-TERM-ID"), makeSymbol("AQ-TERM-ORIGINAL-STRING"), makeSymbol("AQ-TERM-RAW-MEANINGS"), makeSymbol("AQ-TERM-POSSIBLE-MEANINGS"), makeSymbol("AQ-TERM-DISFAVORED-MEANINGS"), makeSymbol("AQ-TERM-POSITIVE-STRINGS"), makeSymbol("AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("AQ-TERM-POSITIVE-STRINGS-STALE?"), makeSymbol("AQ-TERM-NEGATIVE-STRINGS"), makeSymbol("AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("AQ-TERM-NEGATIVE-STRINGS-STALE?") });

    private static final SubLList $list67 = list(new SubLObject[]{ makeSymbol("_CSETF-AQ-TERM-ID"), makeSymbol("_CSETF-AQ-TERM-ORIGINAL-STRING"), makeSymbol("_CSETF-AQ-TERM-RAW-MEANINGS"), makeSymbol("_CSETF-AQ-TERM-POSSIBLE-MEANINGS"), makeSymbol("_CSETF-AQ-TERM-DISFAVORED-MEANINGS"), makeSymbol("_CSETF-AQ-TERM-POSITIVE-STRINGS"), makeSymbol("_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?"), makeSymbol("_CSETF-AQ-TERM-NEGATIVE-STRINGS"), makeSymbol("_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?") });

    private static final SubLSymbol PRINT_AQ_TERM = makeSymbol("PRINT-AQ-TERM");

    private static final SubLSymbol AQ_TERM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AQ-TERM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list70 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AQ-TERM-P"));

    private static final SubLSymbol AQ_TERM_ID = makeSymbol("AQ-TERM-ID");

    private static final SubLSymbol _CSETF_AQ_TERM_ID = makeSymbol("_CSETF-AQ-TERM-ID");

    private static final SubLSymbol AQ_TERM_ORIGINAL_STRING = makeSymbol("AQ-TERM-ORIGINAL-STRING");

    private static final SubLSymbol _CSETF_AQ_TERM_ORIGINAL_STRING = makeSymbol("_CSETF-AQ-TERM-ORIGINAL-STRING");

    private static final SubLSymbol AQ_TERM_RAW_MEANINGS = makeSymbol("AQ-TERM-RAW-MEANINGS");

    private static final SubLSymbol _CSETF_AQ_TERM_RAW_MEANINGS = makeSymbol("_CSETF-AQ-TERM-RAW-MEANINGS");

    private static final SubLSymbol AQ_TERM_POSSIBLE_MEANINGS = makeSymbol("AQ-TERM-POSSIBLE-MEANINGS");

    private static final SubLSymbol _CSETF_AQ_TERM_POSSIBLE_MEANINGS = makeSymbol("_CSETF-AQ-TERM-POSSIBLE-MEANINGS");

    private static final SubLSymbol AQ_TERM_DISFAVORED_MEANINGS = makeSymbol("AQ-TERM-DISFAVORED-MEANINGS");

    private static final SubLSymbol _CSETF_AQ_TERM_DISFAVORED_MEANINGS = makeSymbol("_CSETF-AQ-TERM-DISFAVORED-MEANINGS");

    private static final SubLSymbol AQ_TERM_POSITIVE_STRINGS = makeSymbol("AQ-TERM-POSITIVE-STRINGS");

    private static final SubLSymbol _CSETF_AQ_TERM_POSITIVE_STRINGS = makeSymbol("_CSETF-AQ-TERM-POSITIVE-STRINGS");

    private static final SubLSymbol AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE = makeSymbol("AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE");

    private static final SubLSymbol _CSETF_AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE = makeSymbol("_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE");

    private static final SubLSymbol $sym85$AQ_TERM_POSITIVE_STRINGS_STALE_ = makeSymbol("AQ-TERM-POSITIVE-STRINGS-STALE?");

    private static final SubLSymbol $sym86$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_ = makeSymbol("_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?");

    private static final SubLSymbol AQ_TERM_NEGATIVE_STRINGS = makeSymbol("AQ-TERM-NEGATIVE-STRINGS");

    private static final SubLSymbol _CSETF_AQ_TERM_NEGATIVE_STRINGS = makeSymbol("_CSETF-AQ-TERM-NEGATIVE-STRINGS");

    private static final SubLSymbol AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE = makeSymbol("AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE");

    private static final SubLSymbol _CSETF_AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE = makeSymbol("_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE");

    private static final SubLSymbol $sym91$AQ_TERM_NEGATIVE_STRINGS_STALE_ = makeSymbol("AQ-TERM-NEGATIVE-STRINGS-STALE?");

    private static final SubLSymbol $sym92$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_ = makeSymbol("_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?");

    private static final SubLSymbol $POSITIVE_TERMS_IN_UPWARD_CLOSURE = makeKeyword("POSITIVE-TERMS-IN-UPWARD-CLOSURE");

    private static final SubLSymbol $kw99$POSITIVE_STRINGS_STALE_ = makeKeyword("POSITIVE-STRINGS-STALE?");

    private static final SubLSymbol $NEGATIVE_TERMS_IN_UPWARD_CLOSURE = makeKeyword("NEGATIVE-TERMS-IN-UPWARD-CLOSURE");

    private static final SubLSymbol $kw102$NEGATIVE_STRINGS_STALE_ = makeKeyword("NEGATIVE-STRINGS-STALE?");

    private static final SubLSymbol MAKE_AQ_TERM = makeSymbol("MAKE-AQ-TERM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AQ_TERM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AQ-TERM-METHOD");

    private static final SubLString $str105$_aq_token___S__S__S_ = makeString("<aq-token: ~S ~S ~S>");











    private static final SubLSymbol $sym116$_PREFERRED = makeSymbol("?PREFERRED");

    private static final SubLList $list117 = list(makeSymbol("?PREFERRED"));



    private static final SubLSymbol $sym120$QUA_FILTER_TERM_ = makeSymbol("QUA-FILTER-TERM?");

    private static final SubLSymbol $sym121$_QUA_FILTER_TERM__CACHING_STATE_ = makeSymbol("*QUA-FILTER-TERM?-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);



    private static final SubLSymbol QUA_EXPANSION_CYCLS = makeSymbol("QUA-EXPANSION-CYCLS");

    private static final SubLSymbol $qua_expansion_cycls_caching_state$ = makeSymbol("*QUA-EXPANSION-CYCLS-CACHING-STATE*");



    private static final SubLSymbol WEB_CONCEPTUALLY_RELATED = makeSymbol("WEB-CONCEPTUALLY-RELATED");





    static private final SubLList $list136 = list(makeKeyword("RELATED"));

    private static final SubLList $list137 = list(makeKeyword("MAX-NUMBER"), makeInteger(30), makeKeyword("MAX-TIME"), makeInteger(30));

    private static final SubLSymbol $web_conceptually_related_caching_state$ = makeSymbol("*WEB-CONCEPTUALLY-RELATED-CACHING-STATE*");

    private static final SubLSymbol $sym139$_INST = makeSymbol("?INST");







    private static final SubLList $list143 = list(makeSymbol("NL-GENERATION-CACHE-METHOD"));

    private static final SubLSymbol $qua_generate_phrase_caching_state$ = makeSymbol("*QUA-GENERATE-PHRASE-CACHING-STATE*");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol QUA_ALL_PHRASES_FOR_TERM = makeSymbol("QUA-ALL-PHRASES-FOR-TERM");

    private static final SubLList $list147 = list(makeKeyword("ACRONYMS"));

    private static final SubLSymbol $qua_all_phrases_for_term_caching_state$ = makeSymbol("*QUA-ALL-PHRASES-FOR-TERM-CACHING-STATE*");

    private static final SubLString $str149$__ = makeString(", ");



    private static final SubLInteger $int$400000 = makeInteger(400000);

    private static final SubLSymbol $sym153$QUA_TERM_FROM_SENTENCE_ = makeSymbol("QUA-TERM-FROM-SENTENCE?");



    private static final SubLString $str155$Pushing__S_because_it_is_not_a_ge = makeString("Pushing ~S because it is not a general term (~A) or pred with no nominal lexes (~A).~%");

    private static final SubLString $str156$This_term_is_a_naut___A__ = makeString("This term is a naut: ~A~%");



    private static final SubLString $str158$Either_the_term_is_not_lexified_o = makeString("Either the term is not lexified or the functor is inappropriate for a search string: ~A~%");

    private static final SubLString $str159$Recursing_on__A__ = makeString("Recursing on ~A~%");





    private static final SubLList $list162 = list(reader_make_constant_shell("nounStrings"), makeSymbol("?X"));

    private static final SubLList $list163 = list(reader_make_constant_shell("nameString"), makeSymbol("?X"));

    private static final SubLSymbol QUA_SEARCHABLE_TERMS_FROM_CYCL_SENTENCE = makeSymbol("QUA-SEARCHABLE-TERMS-FROM-CYCL-SENTENCE");

    private static final SubLSymbol SETS_EQUALP = makeSymbol("SETS-EQUALP");

    private static final SubLList $list172 = list(new SubLObject[]{ list(list(reader_make_constant_shell("GeorgeWBush")), list(reader_make_constant_shell("GeorgeWBush"))), list(list(reader_make_constant_shell("Person")), list(reader_make_constant_shell("Person"))), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("Dog"))), list(list(list(reader_make_constant_shell("MotherFn"), reader_make_constant_shell("ChelseaClinton"))), list(reader_make_constant_shell("ChelseaClinton"))), list(list(list(reader_make_constant_shell("YearFn"), makeInteger(2006))), list(list(reader_make_constant_shell("YearFn"), makeInteger(2006)))), list(list(list(reader_make_constant_shell("TheSet"), reader_make_constant_shell("Cat"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("Cat"), reader_make_constant_shell("Dog"))), list(list(list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog")))), list(reader_make_constant_shell("Dog"))), list(list(list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog"))))), list(reader_make_constant_shell("Cat"), reader_make_constant_shell("Dog"))), list(list(list(reader_make_constant_shell("CollectionSubsetFn"), reader_make_constant_shell("CriminalOrganization"), list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("residenceOfOrganization"), makeSymbol("?X"), reader_make_constant_shell("Russia"))))), list(reader_make_constant_shell("CriminalOrganization"), reader_make_constant_shell("Russia"))), list(list(list(reader_make_constant_shell("PlusAll"), list(reader_make_constant_shell("TheSet"), list(reader_make_constant_shell("Kilogram"), FOUR_INTEGER), list(reader_make_constant_shell("Kilogram"), NINE_INTEGER)), reader_make_constant_shell("SquareRootFn"))), list(list(reader_make_constant_shell("Kilogram"), FOUR_INTEGER), list(reader_make_constant_shell("Kilogram"), NINE_INTEGER))), list(list(list(reader_make_constant_shell("CollectionSubsetFn"), reader_make_constant_shell("CarBombing"), list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Iraq"))))), list(reader_make_constant_shell("CarBombing"), reader_make_constant_shell("eventOccursAt"), reader_make_constant_shell("Iraq"))), list(list(list(reader_make_constant_shell("FunctionToArg"), TWO_INTEGER, reader_make_constant_shell("eventOccursAt"))), list(reader_make_constant_shell("eventOccursAt"))) });

    /**
     *
     *
     * @param SEARCH-STRING
    stringp
     * 		
     * @param SEARCH-ENGINE
     * 		keywordp; currently only :altavista is supported, due to limitations in public-access search-engines
     * 		(e.g. google will only pay attention to the first 10 words of a query)
     * @return stringp
     */
    @LispMethod(comment = "@param SEARCH-STRING\nstringp\r\n\t\t\r\n@param SEARCH-ENGINE\r\n\t\tkeywordp; currently only :altavista is supported, due to limitations in public-access search-engines\r\n\t\t(e.g. google will only pay attention to the first 10 words of a query)\r\n@return stringp")
    public static final SubLObject augmented_query_string_for_query_string_alt(SubLObject search_string, SubLObject v_search_engine) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        {
            SubLObject query = get_augmented_query_for_id(new_augmented_query(search_string, v_search_engine));
            return get_search_string_for_query(query);
        }
    }

    /**
     *
     *
     * @param SEARCH-STRING
    stringp
     * 		
     * @param SEARCH-ENGINE
     * 		keywordp; currently only :altavista is supported, due to limitations in public-access search-engines
     * 		(e.g. google will only pay attention to the first 10 words of a query)
     * @return stringp
     */
    @LispMethod(comment = "@param SEARCH-STRING\nstringp\r\n\t\t\r\n@param SEARCH-ENGINE\r\n\t\tkeywordp; currently only :altavista is supported, due to limitations in public-access search-engines\r\n\t\t(e.g. google will only pay attention to the first 10 words of a query)\r\n@return stringp")
    public static SubLObject augmented_query_string_for_query_string(final SubLObject search_string, SubLObject v_search_engine) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        final SubLObject query = get_augmented_query_for_id(new_augmented_query(search_string, v_search_engine));
        return get_search_string_for_query(query);
    }

    public static final SubLObject augmented_query_string_for_cycl_terms_alt(SubLObject term_list, SubLObject v_search_engine) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        {
            SubLObject query = get_augmented_query_for_cycl_terms(term_list, v_search_engine);
            return get_search_string_for_query(query);
        }
    }

    public static SubLObject augmented_query_string_for_cycl_terms(final SubLObject term_list, SubLObject v_search_engine) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        final SubLObject query = get_augmented_query_for_cycl_terms(term_list, v_search_engine);
        return get_search_string_for_query(query);
    }

    public static final SubLObject get_aq_lexicon_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $augmented_query_lexicon$.getDynamicValue(thread)) {
                $augmented_query_lexicon$.setDynamicValue(object.new_class_instance(TERM_LEXICON), thread);
                methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), SET_CASE_SENSITIVITY, $OFF);
                methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ALLOW_MT, $$RelationParaphraseMt);
                methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ALLOW_MT, $$MedicalLexicalMt);
                methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ALLOW_MT, $$CCFLexicalMt);
                methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ADD_LEARNER, NUMBER_LEARN);
                methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ADD_LEARNER, SIMPLE_DATE_LEARN);
            }
            return $augmented_query_lexicon$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_aq_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $augmented_query_lexicon$.getDynamicValue(thread)) {
            $augmented_query_lexicon$.setDynamicValue(object.new_class_instance(TERM_LEXICON), thread);
            methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), SET_CASE_SENSITIVITY, $OFF);
            methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ALLOW_MT, $$RelationParaphraseMt);
            methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ALLOW_MT, $$MedicalLexicalMt);
            methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ALLOW_MT, $$CCFLexicalMt);
            methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ADD_LEARNER, NUMBER_LEARN);
            methods.funcall_instance_method_with_1_args($augmented_query_lexicon$.getDynamicValue(thread), ADD_LEARNER, SIMPLE_DATE_LEARN);
        }
        return $augmented_query_lexicon$.getDynamicValue(thread);
    }

    public static final SubLObject augmented_query_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_augmented_query(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject augmented_query_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_augmented_query(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject augmented_query_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.qua_query.$augmented_query_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject augmented_query_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.qua_query.$augmented_query_native.class ? T : NIL;
    }

    public static final SubLObject aq_original_phrase_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.getField2();
    }

    public static SubLObject aq_original_phrase(final SubLObject v_object) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject aq_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.getField3();
    }

    public static SubLObject aq_id(final SubLObject v_object) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject aq_tokenizations_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.getField4();
    }

    public static SubLObject aq_tokenizations(final SubLObject v_object) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject aq_query_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.getField5();
    }

    public static SubLObject aq_query_string(final SubLObject v_object) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject aq_query_string_staleP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.getField6();
    }

    public static SubLObject aq_query_string_staleP(final SubLObject v_object) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject aq_search_engine_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.getField7();
    }

    public static SubLObject aq_search_engine(final SubLObject v_object) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_aq_original_phrase_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_aq_original_phrase(final SubLObject v_object, final SubLObject value) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_aq_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_aq_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_aq_tokenizations_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_aq_tokenizations(final SubLObject v_object, final SubLObject value) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_aq_query_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_aq_query_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_aq_query_string_staleP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_aq_query_string_staleP(final SubLObject v_object, final SubLObject value) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_aq_search_engine_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AUGMENTED_QUERY_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_aq_search_engine(final SubLObject v_object, final SubLObject value) {
        assert NIL != augmented_query_p(v_object) : "! qua_query.augmented_query_p(v_object) " + "qua_query.augmented_query_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_augmented_query_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.qua_query.$augmented_query_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ORIGINAL_PHRASE)) {
                        _csetf_aq_original_phrase(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ID)) {
                            _csetf_aq_id(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TOKENIZATIONS)) {
                                _csetf_aq_tokenizations(v_new, current_value);
                            } else {
                                if (pcase_var.eql($QUERY_STRING)) {
                                    _csetf_aq_query_string(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($kw36$QUERY_STRING_STALE_)) {
                                        _csetf_aq_query_string_staleP(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($SEARCH_ENGINE)) {
                                            _csetf_aq_search_engine(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt38$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_augmented_query(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.qua_query.$augmented_query_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ORIGINAL_PHRASE)) {
                _csetf_aq_original_phrase(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_aq_id(v_new, current_value);
                } else
                    if (pcase_var.eql($TOKENIZATIONS)) {
                        _csetf_aq_tokenizations(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUERY_STRING)) {
                            _csetf_aq_query_string(v_new, current_value);
                        } else
                            if (pcase_var.eql($kw37$QUERY_STRING_STALE_)) {
                                _csetf_aq_query_string_staleP(v_new, current_value);
                            } else
                                if (pcase_var.eql($SEARCH_ENGINE)) {
                                    _csetf_aq_search_engine(v_new, current_value);
                                } else {
                                    Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_augmented_query(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AUGMENTED_QUERY, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ORIGINAL_PHRASE, aq_original_phrase(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, aq_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TOKENIZATIONS, aq_tokenizations(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY_STRING, aq_query_string(obj));
        funcall(visitor_fn, obj, $SLOT, $kw37$QUERY_STRING_STALE_, aq_query_string_staleP(obj));
        funcall(visitor_fn, obj, $SLOT, $SEARCH_ENGINE, aq_search_engine(obj));
        funcall(visitor_fn, obj, $END, MAKE_AUGMENTED_QUERY, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_augmented_query_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_augmented_query(obj, visitor_fn);
    }

    public static final SubLObject new_augmented_query_alt(SubLObject string, SubLObject v_search_engine) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query = make_augmented_query(UNPROVIDED);
                SubLObject query_id = integer_sequence_generator.integer_sequence_generator_next($augmented_query_id_generator$.getDynamicValue(thread));
                _csetf_aq_original_phrase(query, string);
                _csetf_aq_id(query, query_id);
                _csetf_aq_tokenizations(query, NIL != string ? ((SubLObject) (get_tokenizations_for_aq_string(string, UNPROVIDED))) : NIL);
                _csetf_aq_search_engine(query, v_search_engine);
                dictionary.dictionary_enter($augmented_query_dict$.getDynamicValue(thread), query_id, query);
                return query_id;
            }
        }
    }

    public static SubLObject new_augmented_query(SubLObject string, SubLObject v_search_engine) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = make_augmented_query(UNPROVIDED);
        final SubLObject query_id = integer_sequence_generator.integer_sequence_generator_next($augmented_query_id_generator$.getDynamicValue(thread));
        _csetf_aq_original_phrase(query, string);
        _csetf_aq_id(query, query_id);
        _csetf_aq_tokenizations(query, NIL != string ? get_tokenizations_for_aq_string(string, UNPROVIDED) : NIL);
        _csetf_aq_search_engine(query, v_search_engine);
        dictionary.dictionary_enter($augmented_query_dict$.getDynamicValue(thread), query_id, query);
        return query_id;
    }

    public static final SubLObject print_augmented_query_alt(SubLObject item, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt39$_augmented_query__A__S__S_, new SubLObject[]{ aq_id(item), aq_original_phrase(item), aq_search_engine(item) });
        return item;
    }

    public static SubLObject print_augmented_query(final SubLObject item, final SubLObject stream, final SubLObject depth) {
        format(stream, $str45$_augmented_query__A__S__S_, new SubLObject[]{ aq_id(item), aq_original_phrase(item), aq_search_engine(item) });
        return item;
    }

    public static final SubLObject get_aq_tokenizations_alt(SubLObject query) {
        return aq_tokenizations(query);
    }

    public static SubLObject get_aq_tokenizations(final SubLObject query) {
        return aq_tokenizations(query);
    }

    public static final SubLObject get_aq_search_engine_alt(SubLObject query) {
        return aq_search_engine(query);
    }

    public static SubLObject get_aq_search_engine(final SubLObject query) {
        return aq_search_engine(query);
    }

    public static final SubLObject set_aq_search_engine_alt(SubLObject query, SubLObject v_search_engine) {
        _csetf_aq_search_engine(query, v_search_engine);
        return aq_search_engine(query);
    }

    public static SubLObject set_aq_search_engine(final SubLObject query, final SubLObject v_search_engine) {
        _csetf_aq_search_engine(query, v_search_engine);
        return aq_search_engine(query);
    }

    public static final SubLObject aq_max_strings_for_search_alt(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = get_aq_search_engine(query);
                if (pcase_var.eql($GOOGLE)) {
                    return $google_string_count_limit$.getDynamicValue(thread);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject aq_max_strings_for_search(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = get_aq_search_engine(query);
        if (pcase_var.eql($GOOGLE)) {
            return $google_string_count_limit$.getDynamicValue(thread);
        }
        return NIL;
    }

    public static final SubLObject get_aq_max_strings_per_term_alt(SubLObject query) {
        {
            SubLObject max_length = aq_max_strings_for_search(query);
            SubLObject token_count = length(get_aq_tokenizations(query).first());
            if (NIL == max_length) {
                return NIL;
            }
            if (token_count == ZERO_INTEGER) {
                return NIL;
            }
            return number_utilities.div(max_length, length(get_aq_tokenizations(query).first()));
        }
    }

    public static SubLObject get_aq_max_strings_per_term(final SubLObject query) {
        final SubLObject max_length = aq_max_strings_for_search(query);
        final SubLObject token_count = length(get_aq_tokenizations(query).first());
        if (NIL == max_length) {
            return NIL;
        }
        if (token_count.eql(ZERO_INTEGER)) {
            return NIL;
        }
        return number_utilities.div(max_length, length(get_aq_tokenizations(query).first()));
    }

    public static final SubLObject get_qua_operator_strings_for_search_alt(SubLObject query) {
        {
            SubLObject pcase_var = get_aq_search_engine(query);
            if (pcase_var.eql($GOOGLE)) {
                return $list_alt41;
            } else {
                if (pcase_var.eql($ALTAVISTA)) {
                    return $list_alt42;
                } else {
                    return $list_alt42;
                }
            }
        }
    }

    public static SubLObject get_qua_operator_strings_for_search(final SubLObject query) {
        final SubLObject pcase_var = get_aq_search_engine(query);
        if (pcase_var.eql($GOOGLE)) {
            return $list47;
        }
        if (pcase_var.eql($ALTAVISTA)) {
            return $list48;
        }
        return $list48;
    }

    public static final SubLObject get_aq_term_by_id_alt(SubLObject query, SubLObject id) {
        {
            SubLObject cdolist_list_var = get_aq_tokenizations(query);
            SubLObject tokenization = NIL;
            for (tokenization = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tokenization = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = tokenization;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , v_term = cdolist_list_var_1.first()) {
                        if (id == aq_term_id(v_term)) {
                            return v_term;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject get_aq_term_by_id(final SubLObject query, final SubLObject id) {
        SubLObject cdolist_list_var = get_aq_tokenizations(query);
        SubLObject tokenization = NIL;
        tokenization = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = tokenization;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                if (id.eql(aq_term_id(v_term))) {
                    return v_term;
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                v_term = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            tokenization = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject get_augmented_query_for_id_alt(SubLObject query_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != augmented_query_p(query_id)) {
                return query_id;
            }
            return dictionary.dictionary_lookup($augmented_query_dict$.getDynamicValue(thread), query_id, UNPROVIDED);
        }
    }

    public static SubLObject get_augmented_query_for_id(final SubLObject query_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != augmented_query_p(query_id)) {
            return query_id;
        }
        return dictionary.dictionary_lookup($augmented_query_dict$.getDynamicValue(thread), query_id, UNPROVIDED);
    }

    public static final SubLObject get_augmented_query_for_cycl_terms_alt(SubLObject query_terms, SubLObject v_search_engine) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        {
            SubLObject query = get_augmented_query_for_id(new_augmented_query(NIL, v_search_engine));
            _csetf_aq_tokenizations(query, get_tokenizations_for_terms(query_terms));
            return query;
        }
    }

    public static SubLObject get_augmented_query_for_cycl_terms(final SubLObject query_terms, SubLObject v_search_engine) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        final SubLObject query = get_augmented_query_for_id(new_augmented_query(NIL, v_search_engine));
        _csetf_aq_tokenizations(query, get_tokenizations_for_terms(query_terms));
        return query;
    }

    /**
     *
     *
     * @return STRINGP; url for the original query from QUERY-ID
     */
    @LispMethod(comment = "@return STRINGP; url for the original query from QUERY-ID")
    public static final SubLObject get_raw_query_url_alt(SubLObject query_id, SubLObject answer_count) {
        if (answer_count == UNPROVIDED) {
            answer_count = TEN_INTEGER;
        }
        {
            SubLObject query = get_augmented_query_for_id(query_id);
            SubLObject search_string = (NIL != aq_original_phrase(query)) ? ((SubLObject) (aq_original_phrase(query))) : $str_alt44$;
            return get_query_url(query, search_string, answer_count);
        }
    }

    /**
     *
     *
     * @return STRINGP; url for the original query from QUERY-ID
     */
    @LispMethod(comment = "@return STRINGP; url for the original query from QUERY-ID")
    public static SubLObject get_raw_query_url(final SubLObject query_id, SubLObject answer_count) {
        if (answer_count == UNPROVIDED) {
            answer_count = TEN_INTEGER;
        }
        final SubLObject query = get_augmented_query_for_id(query_id);
        final SubLObject search_string = (NIL != aq_original_phrase(query)) ? aq_original_phrase(query) : $str50$;
        return get_query_url(query, search_string, answer_count);
    }

    /**
     *
     *
     * @return STRINGP; url for the augmented query from QUERY-ID
     */
    @LispMethod(comment = "@return STRINGP; url for the augmented query from QUERY-ID")
    public static final SubLObject get_augmented_query_url_alt(SubLObject query_id, SubLObject answer_count) {
        if (answer_count == UNPROVIDED) {
            answer_count = TEN_INTEGER;
        }
        {
            SubLObject query = get_augmented_query_for_id(query_id);
            SubLObject search_string = web_utilities.html_url_encode(get_search_string_for_query(query), UNPROVIDED);
            return get_query_url(query, search_string, answer_count);
        }
    }

    /**
     *
     *
     * @return STRINGP; url for the augmented query from QUERY-ID
     */
    @LispMethod(comment = "@return STRINGP; url for the augmented query from QUERY-ID")
    public static SubLObject get_augmented_query_url(final SubLObject query_id, SubLObject answer_count) {
        if (answer_count == UNPROVIDED) {
            answer_count = TEN_INTEGER;
        }
        final SubLObject query = get_augmented_query_for_id(query_id);
        final SubLObject search_string = web_utilities.html_url_encode(get_search_string_for_query(query), UNPROVIDED);
        return get_query_url(query, search_string, answer_count);
    }

    /**
     *
     *
     * @return STRINGP; url for the search for the augmented query from QUERY-ID
     */
    @LispMethod(comment = "@return STRINGP; url for the search for the augmented query from QUERY-ID")
    public static final SubLObject get_query_url_alt(SubLObject query, SubLObject search_string, SubLObject answer_count) {
        if (answer_count == UNPROVIDED) {
            answer_count = TEN_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_search_engine = get_aq_search_engine(query);
                SubLObject url_template = getf($qua_url_templates$.getDynamicValue(thread), v_search_engine, UNPROVIDED);
                SubLObject answer_count_string = princ_to_string(answer_count);
                SubLObject url = string_utilities.string_subst(answer_count_string, $str_alt45$ANSWER_COUNT, string_utilities.string_subst(search_string, $str_alt46$SEARCH_STRING, url_template, UNPROVIDED), UNPROVIDED);
                return url;
            }
        }
    }

    /**
     *
     *
     * @return STRINGP; url for the search for the augmented query from QUERY-ID
     */
    @LispMethod(comment = "@return STRINGP; url for the search for the augmented query from QUERY-ID")
    public static SubLObject get_query_url(final SubLObject query, final SubLObject search_string, SubLObject answer_count) {
        if (answer_count == UNPROVIDED) {
            answer_count = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_search_engine = get_aq_search_engine(query);
        final SubLObject url_template = getf($qua_url_templates$.getDynamicValue(thread), v_search_engine, UNPROVIDED);
        final SubLObject answer_count_string = princ_to_string(answer_count);
        final SubLObject url = string_utilities.string_subst(answer_count_string, $str51$ANSWER_COUNT, string_utilities.string_subst(search_string, $str52$SEARCH_STRING, url_template, UNPROVIDED), UNPROVIDED);
        return url;
    }

    public static final SubLObject get_search_string_for_query_alt(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tokenization = get_aq_tokenizations(query).first();
                SubLObject top_level_items = NIL;
                SubLObject search_string = NIL;
                SubLObject max_strings_per_term = get_aq_max_strings_per_term(query);
                {
                    SubLObject _prev_bind_0 = $qua_operators$.currentBinding(thread);
                    try {
                        $qua_operators$.bind(get_qua_operator_strings_for_search(query), thread);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject cdolist_list_var = tokenization;
                                    SubLObject aq_term = NIL;
                                    for (aq_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , aq_term = cdolist_list_var.first()) {
                                        {
                                            SubLObject possible_for_term = NIL;
                                            SubLObject cdolist_list_var_2 = get_aq_term_possible_meanings(aq_term);
                                            SubLObject possible = NIL;
                                            for (possible = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , possible = cdolist_list_var_2.first()) {
                                                {
                                                    SubLObject original_string = aq_term_original_string(aq_term);
                                                    SubLObject qua_expansion_strings = NIL;
                                                    SubLObject clarifying_genls_strings = NIL;
                                                    SubLObject spec_strings = NIL;
                                                    SubLObject synset_strings = qua_strings_for_term_via_synsets(possible);
                                                    SubLObject cyc_strings = qua_all_phrases_for_term(possible);
                                                    SubLObject alt_strings = remove_duplicates(cconcatenate(cyc_strings, new SubLObject[]{ synset_strings, spec_strings }), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject good_string_for_this_term = qua_and_clause(list(qua_or_clause(n_best_qua_strings(max_strings_per_term, alt_strings)), qua_or_clause(n_best_qua_strings(NIL != max_strings_per_term ? ((SubLObject) (subtract(max_strings_per_term, length(alt_strings)))) : NIL, cconcatenate(clarifying_genls_strings, qua_expansion_strings)))));
                                                    possible_for_term = cons(good_string_for_this_term, possible_for_term);
                                                }
                                            }
                                            possible_for_term = qua_or_clause(possible_for_term);
                                            top_level_items = cons(possible_for_term, top_level_items);
                                        }
                                    }
                                }
                                {
                                    SubLObject top_level_result = qua_and_clause(nreverse(top_level_items));
                                    if (NIL != top_level_result) {
                                        format(stream, $str_alt47$_A, top_level_result);
                                    } else {
                                        princ($str_alt44$, stream);
                                    }
                                }
                                search_string = get_output_stream_string(stream);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        close(stream, UNPROVIDED);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $qua_operators$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != search_string ? ((SubLObject) (search_string)) : $str_alt44$;
            }
        }
    }

    public static SubLObject get_search_string_for_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokenization = get_aq_tokenizations(query).first();
        SubLObject top_level_items = NIL;
        SubLObject search_string = NIL;
        final SubLObject max_strings_per_term = get_aq_max_strings_per_term(query);
        final SubLObject _prev_bind_0 = $qua_operators$.currentBinding(thread);
        try {
            $qua_operators$.bind(get_qua_operator_strings_for_search(query), thread);
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                SubLObject cdolist_list_var = tokenization;
                SubLObject aq_term = NIL;
                aq_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject possible_for_term = NIL;
                    SubLObject cdolist_list_var_$2 = get_aq_term_possible_meanings(aq_term);
                    SubLObject possible = NIL;
                    possible = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject original_string = aq_term_original_string(aq_term);
                        final SubLObject qua_expansion_strings = NIL;
                        final SubLObject clarifying_genls_strings = NIL;
                        final SubLObject spec_strings = NIL;
                        final SubLObject synset_strings = qua_strings_for_term_via_synsets(possible);
                        final SubLObject cyc_strings = qua_all_phrases_for_term(possible);
                        final SubLObject alt_strings = remove_duplicates(cconcatenate(cyc_strings, new SubLObject[]{ synset_strings, spec_strings }), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject good_string_for_this_term = qua_and_clause(list(qua_or_clause(n_best_qua_strings(max_strings_per_term, alt_strings)), qua_or_clause(n_best_qua_strings(NIL != max_strings_per_term ? subtract(max_strings_per_term, length(alt_strings)) : NIL, cconcatenate(clarifying_genls_strings, qua_expansion_strings)))));
                        possible_for_term = cons(good_string_for_this_term, possible_for_term);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        possible = cdolist_list_var_$2.first();
                    } 
                    possible_for_term = qua_or_clause(possible_for_term);
                    top_level_items = cons(possible_for_term, top_level_items);
                    cdolist_list_var = cdolist_list_var.rest();
                    aq_term = cdolist_list_var.first();
                } 
                final SubLObject top_level_result = qua_and_clause(nreverse(top_level_items));
                if (NIL != top_level_result) {
                    format(stream, $str53$_A, top_level_result);
                } else {
                    princ($str50$, stream);
                }
                search_string = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $qua_operators$.rebind(_prev_bind_0, thread);
        }
        return NIL != search_string ? search_string : $str50$;
    }

    public static final SubLObject n_best_qua_strings_alt(SubLObject n, SubLObject strings) {
        if (NIL == n) {
            return strings;
        } else {
            if (ONE_INTEGER.numG(n)) {
                return NIL;
            } else {
                {
                    SubLObject result = NIL;
                    SubLObject string_count = ZERO_INTEGER;
                    SubLObject done = NIL;
                    if (NIL == done) {
                        {
                            SubLObject csome_list_var = strings;
                            SubLObject string = NIL;
                            for (string = csome_list_var.first(); !((NIL != done) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , string = csome_list_var.first()) {
                                if (n.numG(add(length(string_utilities.split_string(string, UNPROVIDED)), string_count))) {
                                    result = cons(string, result);
                                    string_count = add(string_count, length(string_utilities.split_string(string, UNPROVIDED)));
                                } else {
                                    done = T;
                                }
                            }
                        }
                    }
                    return result;
                }
            }
        }
    }

    public static SubLObject n_best_qua_strings(final SubLObject n, final SubLObject strings) {
        if (NIL == n) {
            return strings;
        }
        if (ONE_INTEGER.numG(n)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject string_count = ZERO_INTEGER;
        SubLObject done = NIL;
        if (NIL == done) {
            SubLObject csome_list_var = strings;
            SubLObject string = NIL;
            string = csome_list_var.first();
            while ((NIL == done) && (NIL != csome_list_var)) {
                if (n.numG(add(length(string_utilities.split_string(string, UNPROVIDED)), string_count))) {
                    result = cons(string, result);
                    string_count = add(string_count, length(string_utilities.split_string(string, UNPROVIDED)));
                } else {
                    done = T;
                }
                csome_list_var = csome_list_var.rest();
                string = csome_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject qua_or_clause_alt(SubLObject strings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return qua_connected_clause(strings, getf($qua_operators$.getDynamicValue(thread), $OR, UNPROVIDED));
        }
    }

    public static SubLObject qua_or_clause(final SubLObject strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return qua_connected_clause(strings, getf($qua_operators$.getDynamicValue(thread), $OR, UNPROVIDED));
    }

    public static final SubLObject qua_and_clause_alt(SubLObject strings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return qua_connected_clause(strings, getf($qua_operators$.getDynamicValue(thread), $AND, UNPROVIDED));
        }
    }

    public static SubLObject qua_and_clause(final SubLObject strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return qua_connected_clause(strings, getf($qua_operators$.getDynamicValue(thread), $AND, UNPROVIDED));
    }

    public static final SubLObject qua_connected_clause_alt(SubLObject strings, SubLObject connective) {
        if (NIL != strings) {
            {
                SubLObject useful_strings = remove_if(NULL, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.singletonP(useful_strings)) {
                    return useful_strings.first();
                }
                return qua_add_connective(useful_strings, connective);
            }
        }
        return NIL;
    }

    public static SubLObject qua_connected_clause(final SubLObject strings, final SubLObject connective) {
        if (NIL == strings) {
            return NIL;
        }
        final SubLObject useful_strings = remove_if(NULL, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(useful_strings)) {
            return useful_strings.first();
        }
        return qua_add_connective(useful_strings, connective);
    }

    public static final SubLObject maybe_add_quotes_alt(SubLObject input) {
        return input.isString() && (NIL == string_utilities.starts_with(input, $str_alt51$_)) ? ((SubLObject) (cconcatenate($str_alt51$_, new SubLObject[]{ input, $str_alt51$_ }))) : input;
    }

    public static SubLObject maybe_add_quotes(final SubLObject input) {
        return input.isString() && (NIL == string_utilities.starts_with(input, $str57$_)) ? cconcatenate($str57$_, new SubLObject[]{ input, $str57$_ }) : input;
    }

    public static final SubLObject qua_add_connective_alt(SubLObject terms, SubLObject connective) {
        if (NIL == terms) {
            return NIL;
        }
        {
            SubLObject first_term = terms.first();
            SubLObject other_terms = terms.rest();
            SubLObject join_result = list(maybe_add_quotes(first_term));
            SubLObject cdolist_list_var = other_terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != connective) {
                    join_result = cons(connective, join_result);
                }
                join_result = cons(maybe_add_quotes(v_term), join_result);
            }
            return nreverse(join_result);
        }
    }

    public static SubLObject qua_add_connective(final SubLObject terms, final SubLObject connective) {
        if (NIL == terms) {
            return NIL;
        }
        final SubLObject first_term = terms.first();
        final SubLObject other_terms = terms.rest();
        SubLObject join_result = list(maybe_add_quotes(first_term));
        SubLObject cdolist_list_var = other_terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != connective) {
                join_result = cons(connective, join_result);
            }
            join_result = cons(maybe_add_quotes(v_term), join_result);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(join_result);
    }

    public static final SubLObject nearest_spec_strings_alt(SubLObject v_term) {
        if (NIL == forts.fort_p(v_term)) {
            return NIL;
        }
        {
            SubLObject specs = genls.max_specs(v_term, $$InferencePSC, UNPROVIDED);
            SubLObject strings = Mapping.mapcar(QUA_GENERATE_PHRASE, specs);
            return strings;
        }
    }

    public static SubLObject nearest_spec_strings(final SubLObject v_term) {
        if (NIL == forts.fort_p(v_term)) {
            return NIL;
        }
        final SubLObject specs = genls.max_specs(v_term, $$InferencePSC, UNPROVIDED);
        final SubLObject strings = Mapping.mapcar(QUA_GENERATE_PHRASE, specs);
        return strings;
    }

    /**
     * return all remaining meanings for each term in the query.  Currently unused, as it doesn't make much
     * sense for the UI to ever just show just some of the choices.  However, if the system can completely
     * eliminate some meanings (e.g. via something akin to wff-checking), this might come to be more useful.
     *
     * @unknown this and @xref get-all-disambiguation-options should really take a tokenization in addition
    to the query-id, since one would typically accept a tokenization first...  Either that or
    the query should store which tokenization is currently preferred.
     * @return list; ((term-id1 (disambig-id1 disambig-string) (disambig-id2 disambig-string...)) (term-id2 (disambig-id1 disambig-string) (disambig-id2 disambig-string)...))
     */
    @LispMethod(comment = "return all remaining meanings for each term in the query.  Currently unused, as it doesn\'t make much\r\nsense for the UI to ever just show just some of the choices.  However, if the system can completely\r\neliminate some meanings (e.g. via something akin to wff-checking), this might come to be more useful.\r\n\r\n@unknown this and @xref get-all-disambiguation-options should really take a tokenization in addition\r\nto the query-id, since one would typically accept a tokenization first...  Either that or\r\nthe query should store which tokenization is currently preferred.\r\n@return list; ((term-id1 (disambig-id1 disambig-string) (disambig-id2 disambig-string...)) (term-id2 (disambig-id1 disambig-string) (disambig-id2 disambig-string)...))\nreturn all remaining meanings for each term in the query.  Currently unused, as it doesn\'t make much\nsense for the UI to ever just show just some of the choices.  However, if the system can completely\neliminate some meanings (e.g. via something akin to wff-checking), this might come to be more useful.")
    public static final SubLObject get_disambiguation_options_alt(SubLObject query_id) {
        {
            SubLObject query = get_augmented_query_for_id(query_id);
            SubLObject tokenizations = get_aq_tokenizations(query);
            SubLObject tokenization = tokenizations.first();
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tokenization;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject id = aq_term_id(v_term);
                    SubLObject possible_meanings = get_aq_term_disambig_options(v_term);
                    SubLObject meanings_and_strings = generate_unambiguous_aq_term_meanings(possible_meanings);
                    result = cons(list(id, meanings_and_strings), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * return all remaining meanings for each term in the query.  Currently unused, as it doesn't make much
     * sense for the UI to ever just show just some of the choices.  However, if the system can completely
     * eliminate some meanings (e.g. via something akin to wff-checking), this might come to be more useful.
     *
     * @unknown this and @xref get-all-disambiguation-options should really take a tokenization in addition
    to the query-id, since one would typically accept a tokenization first...  Either that or
    the query should store which tokenization is currently preferred.
     * @return list; ((term-id1 (disambig-id1 disambig-string) (disambig-id2 disambig-string...)) (term-id2 (disambig-id1 disambig-string) (disambig-id2 disambig-string)...))
     */
    @LispMethod(comment = "return all remaining meanings for each term in the query.  Currently unused, as it doesn\'t make much\r\nsense for the UI to ever just show just some of the choices.  However, if the system can completely\r\neliminate some meanings (e.g. via something akin to wff-checking), this might come to be more useful.\r\n\r\n@unknown this and @xref get-all-disambiguation-options should really take a tokenization in addition\r\nto the query-id, since one would typically accept a tokenization first...  Either that or\r\nthe query should store which tokenization is currently preferred.\r\n@return list; ((term-id1 (disambig-id1 disambig-string) (disambig-id2 disambig-string...)) (term-id2 (disambig-id1 disambig-string) (disambig-id2 disambig-string)...))\nreturn all remaining meanings for each term in the query.  Currently unused, as it doesn\'t make much\nsense for the UI to ever just show just some of the choices.  However, if the system can completely\neliminate some meanings (e.g. via something akin to wff-checking), this might come to be more useful.")
    public static SubLObject get_disambiguation_options(final SubLObject query_id) {
        final SubLObject query = get_augmented_query_for_id(query_id);
        final SubLObject tokenizations = get_aq_tokenizations(query);
        final SubLObject tokenization = tokenizations.first();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = tokenization;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject id = aq_term_id(v_term);
            final SubLObject possible_meanings = get_aq_term_disambig_options(v_term);
            final SubLObject meanings_and_strings = generate_unambiguous_aq_term_meanings(possible_meanings);
            result = cons(list(id, meanings_and_strings), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * get a list of all ways that something could be disambiguated,
     * including the original 'ambiguous' string
     *
     * @return list; ((term-id1 (disambig-id1 disambig-string) (disambig-id2 disambig-string...))
    (term-id2 (disambig-id1 disambig-string) (disambig-id2 disambig-string)...))
     * @unknown the first disambig-id for each of the terms is the currently selected one
     */
    @LispMethod(comment = "get a list of all ways that something could be disambiguated,\r\nincluding the original \'ambiguous\' string\r\n\r\n@return list; ((term-id1 (disambig-id1 disambig-string) (disambig-id2 disambig-string...))\r\n(term-id2 (disambig-id1 disambig-string) (disambig-id2 disambig-string)...))\r\n@unknown the first disambig-id for each of the terms is the currently selected one\nget a list of all ways that something could be disambiguated,\nincluding the original \'ambiguous\' string")
    public static final SubLObject get_all_disambiguation_options_alt(SubLObject query_id) {
        {
            SubLObject query = get_augmented_query_for_id(query_id);
            SubLObject tokenizations = get_aq_tokenizations(query);
            SubLObject tokenization = tokenizations.first();
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tokenization;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject id = aq_term_id(v_term);
                    SubLObject available_options = get_aq_term_disambig_options(v_term);
                    SubLObject raw_meanings = aq_term_raw_meanings(v_term);
                    SubLObject current_choice = available_options.first();
                    SubLObject possible_meanings = cons(current_choice, remove(current_choice, raw_meanings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    SubLObject meanings_and_strings = generate_unambiguous_aq_term_meanings(possible_meanings);
                    result = cons(list(id, meanings_and_strings), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * get a list of all ways that something could be disambiguated,
     * including the original 'ambiguous' string
     *
     * @return list; ((term-id1 (disambig-id1 disambig-string) (disambig-id2 disambig-string...))
    (term-id2 (disambig-id1 disambig-string) (disambig-id2 disambig-string)...))
     * @unknown the first disambig-id for each of the terms is the currently selected one
     */
    @LispMethod(comment = "get a list of all ways that something could be disambiguated,\r\nincluding the original \'ambiguous\' string\r\n\r\n@return list; ((term-id1 (disambig-id1 disambig-string) (disambig-id2 disambig-string...))\r\n(term-id2 (disambig-id1 disambig-string) (disambig-id2 disambig-string)...))\r\n@unknown the first disambig-id for each of the terms is the currently selected one\nget a list of all ways that something could be disambiguated,\nincluding the original \'ambiguous\' string")
    public static SubLObject get_all_disambiguation_options(final SubLObject query_id) {
        final SubLObject query = get_augmented_query_for_id(query_id);
        final SubLObject tokenizations = get_aq_tokenizations(query);
        final SubLObject tokenization = tokenizations.first();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = tokenization;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject id = aq_term_id(v_term);
            final SubLObject available_options = get_aq_term_disambig_options(v_term);
            final SubLObject raw_meanings = aq_term_raw_meanings(v_term);
            final SubLObject current_choice = available_options.first();
            final SubLObject possible_meanings = cons(current_choice, remove(current_choice, raw_meanings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject meanings_and_strings = generate_unambiguous_aq_term_meanings(possible_meanings);
            result = cons(list(id, meanings_and_strings), result);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject generate_unambiguous_aq_term_meanings_alt(SubLObject meanings) {
        return pph_main.generate_disambiguation_phrases(meanings, $NONE, pph_utilities.pph_convert_required_nl_preds_to_preferred($list_alt55), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_unambiguous_aq_term_meanings(final SubLObject meanings) {
        return pph_main.generate_disambiguation_phrases(meanings, $NONE, pph_utilities.pph_convert_required_nl_preds_to_preferred($list61), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject reset_ambiguity_alt(SubLObject query_id, SubLObject term_id) {
        {
            SubLObject query = get_augmented_query_for_id(query_id);
            SubLObject v_term = get_aq_term_by_id(query, term_id);
            return reset_aq_term_ambiguity(v_term);
        }
    }

    public static SubLObject reset_ambiguity(final SubLObject query_id, final SubLObject term_id) {
        final SubLObject query = get_augmented_query_for_id(query_id);
        final SubLObject v_term = get_aq_term_by_id(query, term_id);
        return reset_aq_term_ambiguity(v_term);
    }

    public static final SubLObject accept_disambiguation_option_alt(SubLObject query_id, SubLObject term_id, SubLObject disambig_id) {
        {
            SubLObject query = get_augmented_query_for_id(query_id);
            SubLObject aq_term = get_aq_term_by_id(query, term_id);
            SubLObject changedP = accept_meaning(aq_term, disambig_id);
            return changedP;
        }
    }

    public static SubLObject accept_disambiguation_option(final SubLObject query_id, final SubLObject term_id, final SubLObject disambig_id) {
        final SubLObject query = get_augmented_query_for_id(query_id);
        final SubLObject aq_term = get_aq_term_by_id(query, term_id);
        final SubLObject changedP = accept_meaning(aq_term, disambig_id);
        return changedP;
    }

    public static final SubLObject aq_term_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_aq_term(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject aq_term_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_aq_term(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject aq_term_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.qua_query.$aq_term_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject aq_term_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.qua_query.$aq_term_native.class ? T : NIL;
    }

    public static final SubLObject aq_term_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField2();
    }

    public static SubLObject aq_term_id(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject aq_term_original_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField3();
    }

    public static SubLObject aq_term_original_string(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject aq_term_raw_meanings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField4();
    }

    public static SubLObject aq_term_raw_meanings(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject aq_term_possible_meanings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField5();
    }

    public static SubLObject aq_term_possible_meanings(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject aq_term_disfavored_meanings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField6();
    }

    public static SubLObject aq_term_disfavored_meanings(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject aq_term_positive_strings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField7();
    }

    public static SubLObject aq_term_positive_strings(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject aq_term_positive_terms_in_upward_closure_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField8();
    }

    public static SubLObject aq_term_positive_terms_in_upward_closure(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject aq_term_positive_strings_staleP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField9();
    }

    public static SubLObject aq_term_positive_strings_staleP(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject aq_term_negative_strings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField10();
    }

    public static SubLObject aq_term_negative_strings(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject aq_term_negative_terms_in_upward_closure_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField11();
    }

    public static SubLObject aq_term_negative_terms_in_upward_closure(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject aq_term_negative_strings_staleP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.getField12();
    }

    public static SubLObject aq_term_negative_strings_staleP(final SubLObject v_object) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject _csetf_aq_term_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_aq_term_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_aq_term_original_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_aq_term_original_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_aq_term_raw_meanings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_aq_term_raw_meanings(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_aq_term_possible_meanings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_aq_term_possible_meanings(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_aq_term_disfavored_meanings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_aq_term_disfavored_meanings(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_aq_term_positive_strings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_aq_term_positive_strings(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_aq_term_positive_terms_in_upward_closure_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_aq_term_positive_terms_in_upward_closure(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_aq_term_positive_strings_staleP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_aq_term_positive_strings_staleP(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_aq_term_negative_strings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_aq_term_negative_strings(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_aq_term_negative_terms_in_upward_closure_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_aq_term_negative_terms_in_upward_closure(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_aq_term_negative_strings_staleP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AQ_TERM_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_aq_term_negative_strings_staleP(final SubLObject v_object, final SubLObject value) {
        assert NIL != aq_term_p(v_object) : "! qua_query.aq_term_p(v_object) " + "qua_query.aq_term_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject make_aq_term_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.qua_query.$aq_term_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_aq_term_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ORIGINAL_STRING)) {
                            _csetf_aq_term_original_string(v_new, current_value);
                        } else {
                            if (pcase_var.eql($RAW_MEANINGS)) {
                                _csetf_aq_term_raw_meanings(v_new, current_value);
                            } else {
                                if (pcase_var.eql($POSSIBLE_MEANINGS)) {
                                    _csetf_aq_term_possible_meanings(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DISFAVORED_MEANINGS)) {
                                        _csetf_aq_term_disfavored_meanings(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($POSITIVE_STRINGS)) {
                                            _csetf_aq_term_positive_strings(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($POSITIVE_TERMS_IN_UPWARD_CLOSURE)) {
                                                _csetf_aq_term_positive_terms_in_upward_closure(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($kw92$POSITIVE_STRINGS_STALE_)) {
                                                    _csetf_aq_term_positive_strings_staleP(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($NEGATIVE_STRINGS)) {
                                                        _csetf_aq_term_negative_strings(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($NEGATIVE_TERMS_IN_UPWARD_CLOSURE)) {
                                                            _csetf_aq_term_negative_terms_in_upward_closure(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($kw95$NEGATIVE_STRINGS_STALE_)) {
                                                                _csetf_aq_term_negative_strings_staleP(v_new, current_value);
                                                            } else {
                                                                Errors.error($str_alt38$Invalid_slot__S_for_construction_, current_arg);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_aq_term(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.qua_query.$aq_term_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_aq_term_id(v_new, current_value);
            } else
                if (pcase_var.eql($ORIGINAL_STRING)) {
                    _csetf_aq_term_original_string(v_new, current_value);
                } else
                    if (pcase_var.eql($RAW_MEANINGS)) {
                        _csetf_aq_term_raw_meanings(v_new, current_value);
                    } else
                        if (pcase_var.eql($POSSIBLE_MEANINGS)) {
                            _csetf_aq_term_possible_meanings(v_new, current_value);
                        } else
                            if (pcase_var.eql($DISFAVORED_MEANINGS)) {
                                _csetf_aq_term_disfavored_meanings(v_new, current_value);
                            } else
                                if (pcase_var.eql($POSITIVE_STRINGS)) {
                                    _csetf_aq_term_positive_strings(v_new, current_value);
                                } else
                                    if (pcase_var.eql($POSITIVE_TERMS_IN_UPWARD_CLOSURE)) {
                                        _csetf_aq_term_positive_terms_in_upward_closure(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($kw99$POSITIVE_STRINGS_STALE_)) {
                                            _csetf_aq_term_positive_strings_staleP(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($NEGATIVE_STRINGS)) {
                                                _csetf_aq_term_negative_strings(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($NEGATIVE_TERMS_IN_UPWARD_CLOSURE)) {
                                                    _csetf_aq_term_negative_terms_in_upward_closure(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($kw102$NEGATIVE_STRINGS_STALE_)) {
                                                        _csetf_aq_term_negative_strings_staleP(v_new, current_value);
                                                    } else {
                                                        Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                                    }










        }
        return v_new;
    }

    public static SubLObject visit_defstruct_aq_term(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AQ_TERM, ELEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, aq_term_id(obj));
        funcall(visitor_fn, obj, $SLOT, $ORIGINAL_STRING, aq_term_original_string(obj));
        funcall(visitor_fn, obj, $SLOT, $RAW_MEANINGS, aq_term_raw_meanings(obj));
        funcall(visitor_fn, obj, $SLOT, $POSSIBLE_MEANINGS, aq_term_possible_meanings(obj));
        funcall(visitor_fn, obj, $SLOT, $DISFAVORED_MEANINGS, aq_term_disfavored_meanings(obj));
        funcall(visitor_fn, obj, $SLOT, $POSITIVE_STRINGS, aq_term_positive_strings(obj));
        funcall(visitor_fn, obj, $SLOT, $POSITIVE_TERMS_IN_UPWARD_CLOSURE, aq_term_positive_terms_in_upward_closure(obj));
        funcall(visitor_fn, obj, $SLOT, $kw99$POSITIVE_STRINGS_STALE_, aq_term_positive_strings_staleP(obj));
        funcall(visitor_fn, obj, $SLOT, $NEGATIVE_STRINGS, aq_term_negative_strings(obj));
        funcall(visitor_fn, obj, $SLOT, $NEGATIVE_TERMS_IN_UPWARD_CLOSURE, aq_term_negative_terms_in_upward_closure(obj));
        funcall(visitor_fn, obj, $SLOT, $kw102$NEGATIVE_STRINGS_STALE_, aq_term_negative_strings_staleP(obj));
        funcall(visitor_fn, obj, $END, MAKE_AQ_TERM, ELEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_aq_term_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_aq_term(obj, visitor_fn);
    }

    public static final SubLObject print_aq_term_alt(SubLObject item, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt96$_aq_token___S__S__S_, new SubLObject[]{ aq_term_id(item), aq_term_original_string(item), aq_term_possible_meanings(item) });
        return item;
    }

    public static SubLObject print_aq_term(final SubLObject item, final SubLObject stream, final SubLObject depth) {
        format(stream, $str105$_aq_token___S__S__S_, new SubLObject[]{ aq_term_id(item), aq_term_original_string(item), aq_term_possible_meanings(item) });
        return item;
    }

    public static final SubLObject new_aq_term_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = make_aq_term(UNPROVIDED);
                if (string.isString()) {
                    _csetf_aq_term_original_string(result, string);
                } else {
                    _csetf_aq_term_original_string(result, $str_alt44$);
                }
                _csetf_aq_term_id(result, integer_sequence_generator.integer_sequence_generator_next($aq_term_id_generator$.getDynamicValue(thread)));
                _csetf_aq_term_positive_strings_staleP(result, T);
                _csetf_aq_term_negative_strings_staleP(result, T);
                return result;
            }
        }
    }

    public static SubLObject new_aq_term(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = make_aq_term(UNPROVIDED);
        if (string.isString()) {
            _csetf_aq_term_original_string(result, string);
        } else {
            _csetf_aq_term_original_string(result, $str50$);
        }
        _csetf_aq_term_id(result, integer_sequence_generator.integer_sequence_generator_next($aq_term_id_generator$.getDynamicValue(thread)));
        _csetf_aq_term_positive_strings_staleP(result, T);
        _csetf_aq_term_negative_strings_staleP(result, T);
        return result;
    }

    public static final SubLObject aq_term_preferred_meaning_alt(SubLObject aq_term) {
        return narts_high.nart_substitute(aq_term_possible_meanings(aq_term).first());
    }

    public static SubLObject aq_term_preferred_meaning(final SubLObject aq_term) {
        return narts_high.nart_substitute(aq_term_possible_meanings(aq_term).first());
    }

    public static final SubLObject undisambiguated_termP_alt(SubLObject aq_term) {
        return makeBoolean(((get_aq_term_possible_meanings(aq_term).equalp(aq_term_raw_meanings(aq_term)) && (NIL == list_utilities.singletonP(get_aq_term_possible_meanings(aq_term)))) && (NIL == aq_term_disfavored_meanings(aq_term))) && (NIL != aq_term_raw_meanings(aq_term)));
    }

    public static SubLObject undisambiguated_termP(final SubLObject aq_term) {
        return makeBoolean(((get_aq_term_possible_meanings(aq_term).equalp(aq_term_raw_meanings(aq_term)) && (NIL == list_utilities.singletonP(get_aq_term_possible_meanings(aq_term)))) && (NIL == aq_term_disfavored_meanings(aq_term))) && (NIL != aq_term_raw_meanings(aq_term)));
    }

    /**
     *
     *
     * @return listp; a list of tokenizations of STRING, where each token is an aq-term representing at least one word from the input STRING
     * @unknown currently, this is only capable of returning a single tokenization...
     */
    @LispMethod(comment = "@return listp; a list of tokenizations of STRING, where each token is an aq-term representing at least one word from the input STRING\r\n@unknown currently, this is only capable of returning a single tokenization...")
    public static final SubLObject get_tokenizations_for_aq_string_alt(SubLObject string, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject sentence = document.new_sentence(string, UNPROVIDED);
            SubLObject lex = (NIL != lexicon) ? ((SubLObject) (lexicon)) : get_aq_lexicon();
            SubLObject learned_results = methods.funcall_instance_method_with_1_args(lex, LEARN, string);
            SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args(lex, LEXIFY_SENTENCE, sentence);
            SubLObject vector_var = document.sentence_yield(lexified_sentence);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    SubLObject word_string = document.word_string(word);
                    SubLObject v_term = new_aq_term(word_string);
                    SubLObject lex_entries = document.word_info(word);
                    SubLObject denots = NIL;
                    SubLObject other_denots = NIL;
                    if (NIL == lexicon_utilities.denots_of_string_stop_word(word_string)) {
                        {
                            SubLObject cdolist_list_var = lex_entries;
                            SubLObject entry = NIL;
                            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                if (NIL != lexicon_accessors.genl_posP(methods.funcall_instance_method_with_1_args(entry, GET, $CYC_POS), $$ClosedClassWord, UNPROVIDED)) {
                                } else {
                                    if (NIL != lexicon_accessors.genl_posP(methods.funcall_instance_method_with_1_args(entry, GET, $CYC_POS), $$Noun, UNPROVIDED)) {
                                        {
                                            SubLObject item_var = conflated_term_from(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT));
                                            if (NIL == member(item_var, denots, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                denots = cons(item_var, denots);
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject item_var = conflated_term_from(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT));
                                            if (NIL == member(item_var, other_denots, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                other_denots = cons(item_var, other_denots);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == denots) {
                        denots = other_denots;
                    }
                    if (NIL != list_utilities.singletonP(denots)) {
                        denots = list_utilities.snoc(cconcatenate($str_alt51$_, new SubLObject[]{ word_string, $str_alt51$_ }), denots);
                    } else {
                        denots = cons(cconcatenate($str_alt51$_, new SubLObject[]{ word_string, $str_alt51$_ }), denots);
                    }
                    set_aq_term_possible_meanings(v_term, list(denots.first()));
                    set_aq_term_raw_meanings(v_term, denots);
                    _csetf_aq_term_disfavored_meanings(v_term, denots.rest());
                    result = cons(v_term, result);
                }
            }
            return list(nreverse(result));
        }
    }

    /**
     *
     *
     * @return listp; a list of tokenizations of STRING, where each token is an aq-term representing at least one word from the input STRING
     * @unknown currently, this is only capable of returning a single tokenization...
     */
    @LispMethod(comment = "@return listp; a list of tokenizations of STRING, where each token is an aq-term representing at least one word from the input STRING\r\n@unknown currently, this is only capable of returning a single tokenization...")
    public static SubLObject get_tokenizations_for_aq_string(final SubLObject string, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        SubLObject result = NIL;
        final SubLObject sentence = document.new_sentence(string, UNPROVIDED);
        final SubLObject lex = (NIL != lexicon) ? lexicon : get_aq_lexicon();
        final SubLObject learned_results = methods.funcall_instance_method_with_1_args(lex, LEARN, string);
        final SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args(lex, LEXIFY_SENTENCE, sentence);
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(lexified_sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject word_string = document.word_string(word);
            final SubLObject v_term = new_aq_term(word_string);
            final SubLObject lex_entries = document.word_info(word);
            SubLObject denots = NIL;
            SubLObject other_denots = NIL;
            if (NIL == lexicon_utilities.denots_of_string_stop_word(word_string)) {
                SubLObject cdolist_list_var_$4 = lex_entries;
                SubLObject entry = NIL;
                entry = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL == lexicon_accessors.genl_posP(methods.funcall_instance_method_with_1_args(entry, GET, $CYC_POS), $$ClosedClassWord, UNPROVIDED)) {
                        if (NIL != lexicon_accessors.genl_posP(methods.funcall_instance_method_with_1_args(entry, GET, $CYC_POS), $$Noun, UNPROVIDED)) {
                            final SubLObject item_var = conflated_term_from(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT));
                            if (NIL == member(item_var, denots, symbol_function(EQL), symbol_function(IDENTITY))) {
                                denots = cons(item_var, denots);
                            }
                        } else {
                            final SubLObject item_var = conflated_term_from(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT));
                            if (NIL == member(item_var, other_denots, symbol_function(EQL), symbol_function(IDENTITY))) {
                                other_denots = cons(item_var, other_denots);
                            }
                        }
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    entry = cdolist_list_var_$4.first();
                } 
            }
            if (NIL == denots) {
                denots = other_denots;
            }
            if (NIL != list_utilities.singletonP(denots)) {
                denots = list_utilities.snoc(cconcatenate($str57$_, new SubLObject[]{ word_string, $str57$_ }), denots);
            } else {
                denots = cons(cconcatenate($str57$_, new SubLObject[]{ word_string, $str57$_ }), denots);
            }
            set_aq_term_possible_meanings(v_term, list(denots.first()));
            set_aq_term_raw_meanings(v_term, denots);
            _csetf_aq_term_disfavored_meanings(v_term, denots.rest());
            result = cons(v_term, result);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return list(nreverse(result));
    }

    public static final SubLObject conflated_term_from_alt(SubLObject cycl) {
        cycl = czer_main.canonicalize_term(cycl, UNPROVIDED);
        if (!((((NIL != narts_high.naut_p(cycl)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$parsingConflateTo, cycl, ONE_INTEGER, UNPROVIDED))) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$qaConflateTo, cycl, ONE_INTEGER, UNPROVIDED))) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$qaConflateToCompletely, cycl, ONE_INTEGER, UNPROVIDED)))) {
            return cycl;
        }
        return ask_utilities.query_variable($sym107$_PREFERRED, listS($$parsingConflateTo, cycl, $list_alt108), $$InferencePSC, UNPROVIDED).first();
    }

    public static SubLObject conflated_term_from(SubLObject cycl) {
        cycl = czer_main.canonicalize_term(cycl, UNPROVIDED);
        if ((((NIL == narts_high.naut_p(cycl)) && (NIL == somewhere_cache.some_pred_assertion_somewhereP($$parsingConflateTo, cycl, ONE_INTEGER, UNPROVIDED))) && (NIL == somewhere_cache.some_pred_assertion_somewhereP($$qaConflateTo, cycl, ONE_INTEGER, UNPROVIDED))) && (NIL == somewhere_cache.some_pred_assertion_somewhereP($$qaConflateToCompletely, cycl, ONE_INTEGER, UNPROVIDED))) {
            return cycl;
        }
        return ask_utilities.query_variable($sym116$_PREFERRED, listS($$parsingConflateTo, cycl, $list117), $$InferencePSC, UNPROVIDED).first();
    }

    public static final SubLObject get_tokenizations_for_terms_alt(SubLObject cycl_terms) {
        {
            SubLObject tokenizations = NIL;
            SubLObject cdolist_list_var = cycl_terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject aq_term = new_aq_term(v_term);
                    set_aq_term_possible_meanings(aq_term, list(v_term));
                    set_aq_term_raw_meanings(aq_term, list(v_term));
                    _csetf_aq_term_disfavored_meanings(aq_term, NIL);
                    tokenizations = cons(aq_term, tokenizations);
                }
            }
            return list(nreverse(tokenizations));
        }
    }

    public static SubLObject get_tokenizations_for_terms(final SubLObject cycl_terms) {
        SubLObject tokenizations = NIL;
        SubLObject cdolist_list_var = cycl_terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject aq_term = new_aq_term(v_term);
            set_aq_term_possible_meanings(aq_term, list(v_term));
            set_aq_term_raw_meanings(aq_term, list(v_term));
            _csetf_aq_term_disfavored_meanings(aq_term, NIL);
            tokenizations = cons(aq_term, tokenizations);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return list(nreverse(tokenizations));
    }

    public static final SubLObject positive_strings_for_term_alt(SubLObject aq_term) {
        if (NIL != aq_term_positive_strings_staleP(aq_term)) {
            if (NIL != undisambiguated_termP(aq_term)) {
                _csetf_aq_term_positive_strings(aq_term, list(aq_term_original_string(aq_term)));
            } else {
                _csetf_aq_term_positive_strings(aq_term, NIL);
                {
                    SubLObject cdolist_list_var = get_aq_term_possible_meanings(aq_term);
                    SubLObject possible = NIL;
                    for (possible = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , possible = cdolist_list_var.first()) {
                        {
                            SubLObject synset_strings = qua_strings_for_term_via_synsets(possible);
                            SubLObject cyc_strings = qua_all_phrases_for_term(possible);
                            SubLObject clarifying_genls_strings = clarifying_genls_strings(possible, aq_term_disfavored_meanings(aq_term), UNPROVIDED);
                            SubLObject mys_expansion_strings = qua_expansion_strings(possible);
                            _csetf_aq_term_positive_strings(aq_term, cconcatenate(aq_term_positive_strings(aq_term), new SubLObject[]{ cyc_strings, synset_strings, clarifying_genls_strings, mys_expansion_strings }));
                        }
                    }
                }
            }
            _csetf_aq_term_positive_strings_staleP(aq_term, NIL);
        }
        _csetf_aq_term_positive_strings(aq_term, remove_duplicates(aq_term_positive_strings(aq_term), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return aq_term_positive_strings(aq_term);
    }

    public static SubLObject positive_strings_for_term(final SubLObject aq_term) {
        if (NIL != aq_term_positive_strings_staleP(aq_term)) {
            if (NIL != undisambiguated_termP(aq_term)) {
                _csetf_aq_term_positive_strings(aq_term, list(aq_term_original_string(aq_term)));
            } else {
                _csetf_aq_term_positive_strings(aq_term, NIL);
                SubLObject cdolist_list_var = get_aq_term_possible_meanings(aq_term);
                SubLObject possible = NIL;
                possible = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject synset_strings = qua_strings_for_term_via_synsets(possible);
                    final SubLObject cyc_strings = qua_all_phrases_for_term(possible);
                    final SubLObject clarifying_genls_strings = clarifying_genls_strings(possible, aq_term_disfavored_meanings(aq_term), UNPROVIDED);
                    final SubLObject mys_expansion_strings = qua_expansion_strings(possible);
                    _csetf_aq_term_positive_strings(aq_term, cconcatenate(aq_term_positive_strings(aq_term), new SubLObject[]{ cyc_strings, synset_strings, clarifying_genls_strings, mys_expansion_strings }));
                    cdolist_list_var = cdolist_list_var.rest();
                    possible = cdolist_list_var.first();
                } 
            }
            _csetf_aq_term_positive_strings_staleP(aq_term, NIL);
        }
        _csetf_aq_term_positive_strings(aq_term, remove_duplicates(aq_term_positive_strings(aq_term), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return aq_term_positive_strings(aq_term);
    }

    public static final SubLObject qua_filter_terms_alt(SubLObject term_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filtered = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        filtered = list_utilities.remove_if_not($sym111$QUA_FILTER_TERM_, rkf_relevance_utilities.rkf_filter_irrelevant_terms(term_list, $$InferencePSC), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return filtered;
            }
        }
    }

    public static SubLObject qua_filter_terms(final SubLObject term_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject filtered = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            filtered = list_utilities.remove_if_not($sym120$QUA_FILTER_TERM_, rkf_relevance_utilities.rkf_filter_irrelevant_terms(term_list, $$InferencePSC), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return filtered;
    }

    public static final SubLObject clear_qua_filter_termP_alt() {
        {
            SubLObject cs = $qua_filter_termP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_qua_filter_termP() {
        final SubLObject cs = $qua_filter_termP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_qua_filter_termP_alt(SubLObject v_term, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($qua_filter_termP_caching_state$.getGlobalValue(), list(v_term, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_qua_filter_termP(final SubLObject v_term, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($qua_filter_termP_caching_state$.getGlobalValue(), list(v_term, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qua_filter_termP_internal_alt(SubLObject v_term, SubLObject mt_info) {
        return makeBoolean(NIL == qua_irrelevant_termP(v_term, mt_info));
    }

    public static SubLObject qua_filter_termP_internal(final SubLObject v_term, final SubLObject mt_info) {
        return makeBoolean(NIL == qua_irrelevant_termP(v_term, mt_info));
    }

    public static final SubLObject qua_filter_termP_alt(SubLObject v_term, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            SubLObject caching_state = $qua_filter_termP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym111$QUA_FILTER_TERM_, $sym112$_QUA_FILTER_TERM__CACHING_STATE_, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt_info);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw114$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qua_filter_termP_internal(v_term, mt_info)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt_info));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject qua_filter_termP(final SubLObject v_term, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        SubLObject caching_state = $qua_filter_termP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym120$QUA_FILTER_TERM_, $sym121$_QUA_FILTER_TERM__CACHING_STATE_, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(qua_filter_termP_internal(v_term, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject qua_irrelevant_termP_alt(SubLObject v_term, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$qaIrrelevantTerm, v_term), UNPROVIDED, UNPROVIDED));
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                ans = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$qaIrrelevantTerm, v_term), UNPROVIDED, UNPROVIDED));
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                    ans = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$qaIrrelevantTerm, v_term), UNPROVIDED, UNPROVIDED));
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                                    ans = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$qaIrrelevantTerm, v_term), UNPROVIDED, UNPROVIDED));
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject qua_irrelevant_termP(final SubLObject v_term, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                ans = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$qaIrrelevantTerm, v_term), UNPROVIDED, UNPROVIDED));
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    ans = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$qaIrrelevantTerm, v_term), UNPROVIDED, UNPROVIDED));
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        ans = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$qaIrrelevantTerm, v_term), UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        ans = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$qaIrrelevantTerm, v_term), UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return ans;
    }

    public static final SubLObject qua_lexifiedP_alt(SubLObject v_term) {
        {
            SubLObject fort_term = narts_high.nart_substitute(v_term);
            return makeBoolean((NIL == forts.fort_p(fort_term)) || (NIL != lexification_utilities.lexifiedP(fort_term, UNPROVIDED)));
        }
    }

    public static SubLObject qua_lexifiedP(final SubLObject v_term) {
        final SubLObject fort_term = narts_high.nart_substitute(v_term);
        return makeBoolean((NIL == forts.fort_p(fort_term)) || (NIL != lexification_utilities.lexifiedP(fort_term, UNPROVIDED)));
    }

    public static final SubLObject clear_qua_expansion_cycls_alt() {
        {
            SubLObject cs = $qua_expansion_cycls_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_qua_expansion_cycls() {
        final SubLObject cs = $qua_expansion_cycls_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_qua_expansion_cycls_alt(SubLObject cyc_term) {
        return memoization_state.caching_state_remove_function_results_with_args($qua_expansion_cycls_caching_state$.getGlobalValue(), list(cyc_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_qua_expansion_cycls(final SubLObject cyc_term) {
        return memoization_state.caching_state_remove_function_results_with_args($qua_expansion_cycls_caching_state$.getGlobalValue(), list(cyc_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qua_expansion_cycls_internal_alt(SubLObject cyc_term) {
        if ((NIL != forts.fort_p(cyc_term)) && (NIL == kb_accessors.individualP(cyc_term))) {
            return mysentient_user_profile_manager_widgets.expansion_cycls_for_strategy(cyc_term, $const120$ProvideTerseExpansions_IRExpansio, $$InferencePSC, FIVE_INTEGER, UNPROVIDED, UNPROVIDED);
        } else {
            return NIL;
        }
    }

    public static SubLObject qua_expansion_cycls_internal(final SubLObject cyc_term) {
        return NIL;
    }

    public static final SubLObject qua_expansion_cycls_alt(SubLObject cyc_term) {
        {
            SubLObject caching_state = $qua_expansion_cycls_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QUA_EXPANSION_CYCLS, $qua_expansion_cycls_caching_state$, $int$100, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, cyc_term, $kw114$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw114$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(qua_expansion_cycls_internal(cyc_term)));
                    memoization_state.caching_state_put(caching_state, cyc_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject qua_expansion_cycls(final SubLObject cyc_term) {
        SubLObject caching_state = $qua_expansion_cycls_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUA_EXPANSION_CYCLS, $qua_expansion_cycls_caching_state$, $int$100, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cyc_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(qua_expansion_cycls_internal(cyc_term)));
            memoization_state.caching_state_put(caching_state, cyc_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject qua_expansion_strings_alt(SubLObject cyc_term) {
        return Mapping.mapcar(QUA_GENERATE_PHRASE, qua_expansion_cycls(cyc_term));
    }

    public static SubLObject qua_expansion_strings(final SubLObject cyc_term) {
        return Mapping.mapcar(QUA_GENERATE_PHRASE, qua_expansion_cycls(cyc_term));
    }

    public static final SubLObject aq_term_related_terms_alt(SubLObject aq_term) {
        {
            SubLObject cycl = aq_term_possible_meanings(aq_term).first();
            SubLObject related_cycls = qua_filter_terms(aq_term_siblings(aq_term));
            SubLObject web_related = qua_filter_terms(web_conceptually_related(cycl, $int$30));
            return cconcatenate(related_cycls, web_related);
        }
    }

    public static SubLObject aq_term_related_terms(final SubLObject aq_term) {
        final SubLObject cycl = aq_term_possible_meanings(aq_term).first();
        final SubLObject related_cycls = qua_filter_terms(aq_term_siblings(aq_term));
        final SubLObject web_related = qua_filter_terms(web_conceptually_related(cycl, $int$30));
        return cconcatenate(related_cycls, web_related);
    }

    public static final SubLObject aq_term_related_strings_alt(SubLObject aq_term) {
        return Mapping.mapcar(GENERATE_PHRASE, aq_term_related_terms(aq_term));
    }

    public static SubLObject aq_term_related_strings(final SubLObject aq_term) {
        return Mapping.mapcar(GENERATE_PHRASE, aq_term_related_terms(aq_term));
    }

    public static final SubLObject aq_term_siblings_alt(SubLObject aq_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl = aq_term_preferred_meaning(aq_term);
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate(genls.genls(cycl, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = v_genls;
                                    SubLObject genl = NIL;
                                    for (genl = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                        if (NIL == qua_filter_termP(genl, UNPROVIDED)) {
                                            result = cons(genl, result);
                                        }
                                        {
                                            SubLObject cdolist_list_var = genls.max_specs(genl, UNPROVIDED, UNPROVIDED);
                                            SubLObject spec = NIL;
                                            for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                                                if (NIL == list_utilities.lengthG(result, $int$30, UNPROVIDED)) {
                                                    if (NIL == qua_filter_termP(spec, UNPROVIDED)) {
                                                        {
                                                            SubLObject item_var = spec;
                                                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                result = cons(item_var, result);
                                                            }
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
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static SubLObject aq_term_siblings(final SubLObject aq_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = aq_term_preferred_meaning(aq_term);
        SubLObject result = NIL;
        final SubLObject doneP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate(genls.genls(cycl, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            if (NIL == doneP) {
                SubLObject csome_list_var = v_genls;
                SubLObject genl = NIL;
                genl = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL == qua_filter_termP(genl, UNPROVIDED)) {
                        result = cons(genl, result);
                    }
                    SubLObject cdolist_list_var = genls.max_specs(genl, UNPROVIDED, UNPROVIDED);
                    SubLObject spec = NIL;
                    spec = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == list_utilities.lengthG(result, $int$30, UNPROVIDED)) && (NIL == qua_filter_termP(spec, UNPROVIDED))) {
                            final SubLObject item_var = spec;
                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result = cons(item_var, result);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        spec = cdolist_list_var.first();
                    } 
                    csome_list_var = csome_list_var.rest();
                    genl = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static final SubLObject clear_web_conceptually_related_alt() {
        {
            SubLObject cs = $web_conceptually_related_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_web_conceptually_related() {
        final SubLObject cs = $web_conceptually_related_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_web_conceptually_related_alt(SubLObject cyc_term, SubLObject count) {
        if (count == UNPROVIDED) {
            count = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($web_conceptually_related_caching_state$.getGlobalValue(), list(cyc_term, count), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_web_conceptually_related(final SubLObject cyc_term, SubLObject count) {
        if (count == UNPROVIDED) {
            count = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($web_conceptually_related_caching_state$.getGlobalValue(), list(cyc_term, count), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown having this function be cached is in one sense completely wrong, but for a deployed system, it's
    reasonably appropriate, since the KB is unlikely to change on a particularly regular basis.
     */
    @LispMethod(comment = "@unknown having this function be cached is in one sense completely wrong, but for a deployed system, it\'s\r\nreasonably appropriate, since the KB is unlikely to change on a particularly regular basis.")
    public static final SubLObject web_conceptually_related_internal_alt(SubLObject cyc_term, SubLObject count) {
        if (NIL != forts.fort_p(cyc_term)) {
            return ask_utilities.query_variable($RELATED, list($$and, listS($$webConceptuallyRelated, cyc_term, $list_alt129)), $$InferencePSC, $list_alt130);
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown having this function be cached is in one sense completely wrong, but for a deployed system, it's
    reasonably appropriate, since the KB is unlikely to change on a particularly regular basis.
     */
    @LispMethod(comment = "@unknown having this function be cached is in one sense completely wrong, but for a deployed system, it\'s\r\nreasonably appropriate, since the KB is unlikely to change on a particularly regular basis.")
    public static SubLObject web_conceptually_related_internal(final SubLObject cyc_term, final SubLObject count) {
        if (NIL != forts.fort_p(cyc_term)) {
            return ask_utilities.query_variable($RELATED, list($$and, listS($$webConceptuallyRelated, cyc_term, $list136)), $$InferencePSC, $list137);
        }
        return NIL;
    }

    public static final SubLObject web_conceptually_related_alt(SubLObject cyc_term, SubLObject count) {
        if (count == UNPROVIDED) {
            count = NIL;
        }
        {
            SubLObject caching_state = $web_conceptually_related_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WEB_CONCEPTUALLY_RELATED, $web_conceptually_related_caching_state$, $int$100, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(cyc_term, count);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw114$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (cyc_term.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && count.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(web_conceptually_related_internal(cyc_term, count)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cyc_term, count));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject web_conceptually_related(final SubLObject cyc_term, SubLObject count) {
        if (count == UNPROVIDED) {
            count = NIL;
        }
        SubLObject caching_state = $web_conceptually_related_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WEB_CONCEPTUALLY_RELATED, $web_conceptually_related_caching_state$, $int$100, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(cyc_term, count);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cyc_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && count.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(web_conceptually_related_internal(cyc_term, count)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cyc_term, count));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject aq_term_specs_alt(SubLObject aq_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject cycl = aq_term_preferred_meaning(aq_term);
                            SubLObject specs = cardinality_estimates.sort_by_generality_estimate(list_utilities.first_n($int$30, qua_filter_terms(genls.specs(cycl, UNPROVIDED, UNPROVIDED))), UNPROVIDED);
                            SubLObject v_instances = cardinality_estimates.sort_by_generality_estimate(qua_filter_terms(ask_utilities.query_variable($sym132$_INST, list($$isa, $sym132$_INST, cycl), $$InferencePSC, UNPROVIDED)), UNPROVIDED);
                            result = list_utilities.first_n($int$30, cconcatenate(specs, v_instances));
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject aq_term_specs(final SubLObject aq_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject cycl = aq_term_preferred_meaning(aq_term);
            final SubLObject specs = cardinality_estimates.sort_by_generality_estimate(list_utilities.first_n($int$30, qua_filter_terms(genls.specs(cycl, UNPROVIDED, UNPROVIDED))), UNPROVIDED);
            final SubLObject v_instances = cardinality_estimates.sort_by_generality_estimate(qua_filter_terms(ask_utilities.query_variable($sym139$_INST, list($$isa, $sym139$_INST, cycl), $$InferencePSC, UNPROVIDED)), UNPROVIDED);
            result = list_utilities.first_n($int$30, cconcatenate(specs, v_instances));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject aq_term_spec_strings_alt(SubLObject aq_term) {
        return Mapping.mapcar(QUA_GENERATE_PHRASE, aq_term_specs(aq_term));
    }

    public static SubLObject aq_term_spec_strings(final SubLObject aq_term) {
        return Mapping.mapcar(QUA_GENERATE_PHRASE, aq_term_specs(aq_term));
    }

    public static final SubLObject aq_term_genls_alt(SubLObject aq_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject cycl = aq_term_preferred_meaning(aq_term);
                            SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate(list_utilities.first_n($int$30, qua_filter_terms(genls.genls(cycl, UNPROVIDED, UNPROVIDED))), UNPROVIDED);
                            SubLObject isas = cardinality_estimates.sort_by_generality_estimate(qua_filter_terms(isa.isa(cycl, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
                            result = list_utilities.first_n($int$30, cconcatenate(v_genls, isas));
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject aq_term_genls(final SubLObject aq_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject cycl = aq_term_preferred_meaning(aq_term);
            final SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate(list_utilities.first_n($int$30, qua_filter_terms(genls.genls(cycl, UNPROVIDED, UNPROVIDED))), UNPROVIDED);
            final SubLObject isas = cardinality_estimates.sort_by_generality_estimate(qua_filter_terms(isa.isa(cycl, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            result = list_utilities.first_n($int$30, cconcatenate(v_genls, isas));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject aq_term_genl_strings_alt(SubLObject aq_term) {
        return Mapping.mapcar(QUA_GENERATE_PHRASE, aq_term_genls(aq_term));
    }

    public static SubLObject aq_term_genl_strings(final SubLObject aq_term) {
        return Mapping.mapcar(QUA_GENERATE_PHRASE, aq_term_genls(aq_term));
    }

    public static final SubLObject qua_speech_part_preds_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishLexiconMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $qua_speech_part_preds$.getDynamicValue(thread)) {
                $qua_speech_part_preds$.setDynamicValue(set_difference(cconcatenate(lexicon_accessors.all_speech_part_preds(UNPROVIDED), pph_methods.pph_name_string_preds()), genl_predicates.all_spec_preds($$verbFormWithAuxiliary, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED), thread);
            }
            return $qua_speech_part_preds$.getDynamicValue(thread);
        }
    }

    public static SubLObject qua_speech_part_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishLexiconMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $qua_speech_part_preds$.getDynamicValue(thread)) {
            $qua_speech_part_preds$.setDynamicValue(set_difference(cconcatenate(lexicon_accessors.all_speech_part_preds(UNPROVIDED), pph_methods.pph_name_string_preds(UNPROVIDED)), genl_predicates.all_spec_preds($$verbFormWithAuxiliary, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED), thread);
        }
        return $qua_speech_part_preds$.getDynamicValue(thread);
    }

    public static final SubLObject clear_qua_generate_phrase_alt() {
        {
            SubLObject cs = $qua_generate_phrase_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_qua_generate_phrase() {
        final SubLObject cs = $qua_generate_phrase_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_qua_generate_phrase_alt(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($qua_generate_phrase_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_qua_generate_phrase(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($qua_generate_phrase_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qua_generate_phrase_internal_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                    try {
                        pph_vars.$select_string_methods_to_omit$.bind($list_alt136, thread);
                        if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(TWO_INTEGER)))) {
                            {
                                SubLObject new_format_string = cconcatenate($str_alt137$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt138$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(TWO_INTEGER), new SubLObject[]{ $str_alt139$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                                pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                            }
                        }
                        {
                            SubLObject _prev_bind_0_4 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                            try {
                                pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                                result = pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                    } finally {
                        pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject qua_generate_phrase_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$select_string_methods_to_omit$.bind($list143, thread);
            pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
            result = pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject qua_generate_phrase_alt(SubLObject v_term) {
        {
            SubLObject caching_state = $qua_generate_phrase_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QUA_GENERATE_PHRASE, $qua_generate_phrase_caching_state$, $int$500, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw114$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw114$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(qua_generate_phrase_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject qua_generate_phrase(final SubLObject v_term) {
        SubLObject caching_state = $qua_generate_phrase_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUA_GENERATE_PHRASE, $qua_generate_phrase_caching_state$, $int$500, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(qua_generate_phrase_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_qua_all_phrases_for_term_alt() {
        {
            SubLObject cs = $qua_all_phrases_for_term_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_qua_all_phrases_for_term() {
        final SubLObject cs = $qua_all_phrases_for_term_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_qua_all_phrases_for_term_alt(SubLObject cyc_term) {
        return memoization_state.caching_state_remove_function_results_with_args($qua_all_phrases_for_term_caching_state$.getGlobalValue(), list(cyc_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_qua_all_phrases_for_term(final SubLObject cyc_term) {
        return memoization_state.caching_state_remove_function_results_with_args($qua_all_phrases_for_term_caching_state$.getGlobalValue(), list(cyc_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qua_all_phrases_for_term_internal_alt(SubLObject cyc_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                    try {
                        pph_vars.$select_string_methods_to_omit$.bind($list_alt136, thread);
                        if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(TWO_INTEGER)))) {
                            {
                                SubLObject new_format_string = cconcatenate($str_alt137$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt138$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(TWO_INTEGER), new SubLObject[]{ $str_alt139$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                                pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                            }
                        }
                        {
                            SubLObject _prev_bind_0_5 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                            try {
                                pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                                result = pph_methods_lexicon.all_phrases_for_term(cyc_term, qua_speech_part_preds(UNPROVIDED), $list_alt144, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_5, thread);
                            }
                        }
                    } finally {
                        pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject qua_all_phrases_for_term_internal(final SubLObject cyc_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$select_string_methods_to_omit$.bind($list143, thread);
            pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
            result = pph_methods_lexicon.all_phrases_for_term(cyc_term, qua_speech_part_preds(UNPROVIDED), $list147, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject qua_all_phrases_for_term_alt(SubLObject cyc_term) {
        {
            SubLObject caching_state = $qua_all_phrases_for_term_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QUA_ALL_PHRASES_FOR_TERM, $qua_all_phrases_for_term_caching_state$, $int$100, EQUALP, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, cyc_term, $kw114$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw114$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(qua_all_phrases_for_term_internal(cyc_term)));
                    memoization_state.caching_state_put(caching_state, cyc_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject qua_all_phrases_for_term(final SubLObject cyc_term) {
        SubLObject caching_state = $qua_all_phrases_for_term_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUA_ALL_PHRASES_FOR_TERM, $qua_all_phrases_for_term_caching_state$, $int$100, EQUALP, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cyc_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(qua_all_phrases_for_term_internal(cyc_term)));
            memoization_state.caching_state_put(caching_state, cyc_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject qua_all_phrases_for_term_as_string_list_alt(SubLObject cyc_term) {
        {
            SubLObject all_strings = qua_all_phrases_for_term(cyc_term);
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                princ(all_strings.first(), stream);
                all_strings = all_strings.rest();
                {
                    SubLObject cdolist_list_var = all_strings;
                    SubLObject string = NIL;
                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                        princ($str_alt146$__, stream);
                        princ(string, stream);
                    }
                }
                result = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject qua_all_phrases_for_term_as_string_list(final SubLObject cyc_term) {
        SubLObject all_strings = qua_all_phrases_for_term(cyc_term);
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            princ(all_strings.first(), stream);
            SubLObject cdolist_list_var;
            all_strings = cdolist_list_var = all_strings.rest();
            SubLObject string = NIL;
            string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ($str149$__, stream);
                princ(string, stream);
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
            } 
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static final SubLObject clarifying_genls_strings_alt(SubLObject good_term, SubLObject bad_terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject v_genls = clarifying_differentiating_genls(good_term, bad_terms, mt);
            SubLObject strings = Mapping.mapcar(QUA_GENERATE_PHRASE, v_genls);
            return strings;
        }
    }

    public static SubLObject clarifying_genls_strings(final SubLObject good_term, final SubLObject bad_terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject v_genls = clarifying_differentiating_genls(good_term, bad_terms, mt);
        final SubLObject strings = Mapping.mapcar(QUA_GENERATE_PHRASE, v_genls);
        return strings;
    }

    public static final SubLObject clarifying_differentiating_genls_alt(SubLObject good_term, SubLObject bad_terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (good_term.isString()) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject usable_bad_terms = remove_if(STRINGP, bad_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject ceilings = genls.nearest_common_genls(cons(good_term, usable_bad_terms), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = ceilings;
                            SubLObject ceiling = NIL;
                            for (ceiling = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ceiling = cdolist_list_var.first()) {
                                {
                                    SubLObject middle_terms = genls.all_genls_wrt(good_term, ceiling, UNPROVIDED, UNPROVIDED);
                                    SubLObject cdolist_list_var_6 = middle_terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , v_term = cdolist_list_var_6.first()) {
                                        if (NIL != isa.isaP(v_term, $$QAClarifyingCollectionType, UNPROVIDED, UNPROVIDED)) {
                                            if (!(v_term.equalp(good_term) || v_term.equalp(ceiling))) {
                                                result = cons(v_term, result);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return remove_duplicates(list_utilities.flatten(result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject clarifying_differentiating_genls(final SubLObject good_term, final SubLObject bad_terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (good_term.isString()) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject usable_bad_terms = remove_if(STRINGP, bad_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject ceilings = cdolist_list_var = genls.nearest_common_genls(cons(good_term, usable_bad_terms), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject ceiling = NIL;
            ceiling = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$5;
                final SubLObject middle_terms = cdolist_list_var_$5 = genls.all_genls_wrt(good_term, ceiling, UNPROVIDED, UNPROVIDED);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    if (((NIL != isa.isaP(v_term, $$QAClarifyingCollectionType, UNPROVIDED, UNPROVIDED)) && (!v_term.equalp(good_term))) && (!v_term.equalp(ceiling))) {
                        result = cons(v_term, result);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    v_term = cdolist_list_var_$5.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                ceiling = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(list_utilities.flatten(result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject remove_stop_words_from_strings_alt(SubLObject string_list) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = string_list;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject non_stop_word_tokens = NIL;
                    SubLObject cdolist_list_var_7 = string_utilities.split_string(string, UNPROVIDED);
                    SubLObject token = NIL;
                    for (token = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , token = cdolist_list_var_7.first()) {
                        if (NIL == lexicon_accessors.closed_lexical_class_stringP(token, UNPROVIDED)) {
                            non_stop_word_tokens = cons(token, non_stop_word_tokens);
                        }
                    }
                    result = cons(string_utilities.bunge(nreverse(non_stop_word_tokens), UNPROVIDED), result);
                }
            }
            return result;
        }
    }

    public static SubLObject remove_stop_words_from_strings(final SubLObject string_list) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = string_list;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject non_stop_word_tokens = NIL;
            SubLObject cdolist_list_var_$6 = string_utilities.split_string(string, UNPROVIDED);
            SubLObject token = NIL;
            token = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                if (NIL == lexicon_accessors.closed_lexical_class_stringP(token, UNPROVIDED)) {
                    non_stop_word_tokens = cons(token, non_stop_word_tokens);
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                token = cdolist_list_var_$6.first();
            } 
            result = cons(string_utilities.bunge(nreverse(non_stop_word_tokens), UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject negative_strings_for_term_alt(SubLObject aq_term) {
        if (NIL != aq_term_negative_strings_staleP(aq_term)) {
            if (NIL != undisambiguated_termP(aq_term)) {
                _csetf_aq_term_negative_strings(aq_term, NIL);
            } else {
                _csetf_aq_term_negative_strings(aq_term, NIL);
                {
                    SubLObject cdolist_list_var = aq_term_disfavored_meanings(aq_term);
                    SubLObject possible = NIL;
                    for (possible = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , possible = cdolist_list_var.first()) {
                        {
                            SubLObject synset_strings = qua_strings_for_term_via_synsets(possible);
                            SubLObject cyc_strings = remove_stop_words_from_strings(pph_methods_lexicon.all_phrases_for_term(possible, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            SubLObject clarifying_genls_strings = clarifying_genls_strings(possible, get_aq_term_possible_meanings(aq_term), UNPROVIDED);
                            _csetf_aq_term_negative_strings(aq_term, cconcatenate(aq_term_negative_strings(aq_term), new SubLObject[]{ cyc_strings, synset_strings, clarifying_genls_strings }));
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = aq_term_positive_strings(aq_term);
                SubLObject good_string = NIL;
                for (good_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , good_string = cdolist_list_var.first()) {
                    _csetf_aq_term_negative_strings(aq_term, remove(good_string, aq_term_negative_strings(aq_term), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            _csetf_aq_term_negative_strings_staleP(aq_term, NIL);
        }
        return aq_term_negative_strings(aq_term);
    }

    public static SubLObject negative_strings_for_term(final SubLObject aq_term) {
        if (NIL != aq_term_negative_strings_staleP(aq_term)) {
            if (NIL != undisambiguated_termP(aq_term)) {
                _csetf_aq_term_negative_strings(aq_term, NIL);
            } else {
                _csetf_aq_term_negative_strings(aq_term, NIL);
                SubLObject cdolist_list_var = aq_term_disfavored_meanings(aq_term);
                SubLObject possible = NIL;
                possible = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject synset_strings = qua_strings_for_term_via_synsets(possible);
                    final SubLObject cyc_strings = remove_stop_words_from_strings(pph_methods_lexicon.all_phrases_for_term(possible, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    final SubLObject clarifying_genls_strings = clarifying_genls_strings(possible, get_aq_term_possible_meanings(aq_term), UNPROVIDED);
                    _csetf_aq_term_negative_strings(aq_term, cconcatenate(aq_term_negative_strings(aq_term), new SubLObject[]{ cyc_strings, synset_strings, clarifying_genls_strings }));
                    cdolist_list_var = cdolist_list_var.rest();
                    possible = cdolist_list_var.first();
                } 
            }
            SubLObject cdolist_list_var = aq_term_positive_strings(aq_term);
            SubLObject good_string = NIL;
            good_string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                _csetf_aq_term_negative_strings(aq_term, remove(good_string, aq_term_negative_strings(aq_term), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                good_string = cdolist_list_var.first();
            } 
            _csetf_aq_term_negative_strings_staleP(aq_term, NIL);
        }
        return aq_term_negative_strings(aq_term);
    }

    public static final SubLObject qua_strings_for_term_via_synsets_alt(SubLObject cyc_term) {
        return NIL;
    }

    public static SubLObject qua_strings_for_term_via_synsets(final SubLObject cyc_term) {
        return NIL;
    }

    public static final SubLObject get_aq_term_disambig_options_alt(SubLObject aq_term) {
        return aq_term_possible_meanings(aq_term);
    }

    public static SubLObject get_aq_term_disambig_options(final SubLObject aq_term) {
        return aq_term_possible_meanings(aq_term);
    }

    public static final SubLObject reset_aq_term_ambiguity_alt(SubLObject aq_term) {
        set_aq_term_possible_meanings(aq_term, list(aq_term_raw_meanings(aq_term).first()));
        set_aq_term_disfavored_meanings(aq_term, aq_term_raw_meanings(aq_term).rest());
        return aq_term;
    }

    public static SubLObject reset_aq_term_ambiguity(final SubLObject aq_term) {
        set_aq_term_possible_meanings(aq_term, list(aq_term_raw_meanings(aq_term).first()));
        set_aq_term_disfavored_meanings(aq_term, aq_term_raw_meanings(aq_term).rest());
        return aq_term;
    }

    public static final SubLObject set_aq_term_possible_meanings_alt(SubLObject aq_term, SubLObject new_value) {
        _csetf_aq_term_possible_meanings(aq_term, new_value);
        _csetf_aq_term_positive_strings_staleP(aq_term, T);
        return NIL;
    }

    public static SubLObject set_aq_term_possible_meanings(final SubLObject aq_term, final SubLObject new_value) {
        _csetf_aq_term_possible_meanings(aq_term, new_value);
        _csetf_aq_term_positive_strings_staleP(aq_term, T);
        return NIL;
    }

    public static final SubLObject set_aq_term_raw_meanings_alt(SubLObject aq_term, SubLObject new_value) {
        _csetf_aq_term_raw_meanings(aq_term, new_value);
        return NIL;
    }

    public static SubLObject set_aq_term_raw_meanings(final SubLObject aq_term, final SubLObject new_value) {
        _csetf_aq_term_raw_meanings(aq_term, new_value);
        return NIL;
    }

    public static final SubLObject get_aq_term_possible_meanings_alt(SubLObject aq_term) {
        return aq_term_possible_meanings(aq_term);
    }

    public static SubLObject get_aq_term_possible_meanings(final SubLObject aq_term) {
        return aq_term_possible_meanings(aq_term);
    }

    public static final SubLObject set_aq_term_disfavored_meanings_alt(SubLObject aq_term, SubLObject new_value) {
        _csetf_aq_term_disfavored_meanings(aq_term, new_value);
        _csetf_aq_term_negative_strings_staleP(aq_term, T);
        return NIL;
    }

    public static SubLObject set_aq_term_disfavored_meanings(final SubLObject aq_term, final SubLObject new_value) {
        _csetf_aq_term_disfavored_meanings(aq_term, new_value);
        _csetf_aq_term_negative_strings_staleP(aq_term, T);
        return NIL;
    }

    public static final SubLObject accept_meaning_alt(SubLObject aq_term, SubLObject meaning) {
        if (!list(meaning).equalp(aq_term_possible_meanings(aq_term))) {
            set_aq_term_possible_meanings(aq_term, list(meaning));
            set_aq_term_disfavored_meanings(aq_term, remove_if(STRINGP, remove(meaning, aq_term_raw_meanings(aq_term), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return aq_term;
        }
        return NIL;
    }

    public static SubLObject accept_meaning(final SubLObject aq_term, final SubLObject meaning) {
        if (!list(meaning).equalp(aq_term_possible_meanings(aq_term))) {
            set_aq_term_possible_meanings(aq_term, list(meaning));
            set_aq_term_disfavored_meanings(aq_term, remove_if(STRINGP, remove(meaning, aq_term_raw_meanings(aq_term), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return aq_term;
        }
        return NIL;
    }

    public static final SubLObject reject_meaning_alt(SubLObject aq_term, SubLObject meaning) {
        set_aq_term_disfavored_meanings(aq_term, cons(meaning, aq_term_disfavored_meanings(aq_term)));
        set_aq_term_possible_meanings(aq_term, remove(meaning, aq_term_possible_meanings(aq_term), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return aq_term;
    }

    public static SubLObject reject_meaning(final SubLObject aq_term, final SubLObject meaning) {
        set_aq_term_disfavored_meanings(aq_term, cons(meaning, aq_term_disfavored_meanings(aq_term)));
        set_aq_term_possible_meanings(aq_term, remove(meaning, aq_term_possible_meanings(aq_term), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return aq_term;
    }

    public static final SubLObject clear_qua_caches_alt() {
        clear_qua_all_phrases_for_term();
        clear_qua_generate_phrase();
        clear_web_conceptually_related();
        clear_qua_filter_termP();
        clear_qua_expansion_cycls();
        $qua_speech_part_preds$.setDynamicValue(NIL);
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject clear_qua_caches() {
        clear_qua_all_phrases_for_term();
        clear_qua_generate_phrase();
        clear_web_conceptually_related();
        clear_qua_filter_termP();
        clear_qua_expansion_cycls();
        $qua_speech_part_preds$.setDynamicValue(NIL);
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject get_query_url_for_sentence_alt(SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        if (ignore_all_preds == UNPROVIDED) {
            ignore_all_preds = T;
        }
        {
            SubLObject query = qua_query_for_cycl_sentence(cycl, v_search_engine, ignore_all_preds);
            return get_augmented_query_url(aq_id(query), UNPROVIDED);
        }
    }

    public static SubLObject get_query_url_for_sentence(final SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        if (ignore_all_preds == UNPROVIDED) {
            ignore_all_preds = T;
        }
        final SubLObject query = qua_query_for_cycl_sentence(cycl, v_search_engine, ignore_all_preds);
        return get_augmented_query_url(aq_id(query), UNPROVIDED);
    }

    public static final SubLObject qua_query_string_for_cycl_sentence_alt(SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        if (ignore_all_preds == UNPROVIDED) {
            ignore_all_preds = T;
        }
        {
            SubLObject query = qua_query_for_cycl_sentence(cycl, v_search_engine, ignore_all_preds);
            return get_search_string_for_query(query);
        }
    }

    public static SubLObject qua_query_string_for_cycl_sentence(final SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        if (ignore_all_preds == UNPROVIDED) {
            ignore_all_preds = T;
        }
        final SubLObject query = qua_query_for_cycl_sentence(cycl, v_search_engine, ignore_all_preds);
        return get_search_string_for_query(query);
    }

    public static final SubLObject qua_query_for_cycl_sentence_alt(SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        if (ignore_all_preds == UNPROVIDED) {
            ignore_all_preds = NIL;
        }
        {
            SubLObject searchable_items = qua_searchable_terms_from_cycl_sentence(cycl, ignore_all_preds, UNPROVIDED, UNPROVIDED);
            return get_augmented_query_for_cycl_terms(searchable_items, v_search_engine);
        }
    }

    public static SubLObject qua_query_for_cycl_sentence(final SubLObject cycl, SubLObject v_search_engine, SubLObject ignore_all_preds) {
        if (v_search_engine == UNPROVIDED) {
            v_search_engine = $qua_default_search_engine$.getDynamicValue();
        }
        if (ignore_all_preds == UNPROVIDED) {
            ignore_all_preds = NIL;
        }
        final SubLObject searchable_items = qua_searchable_terms_from_cycl_sentence(cycl, ignore_all_preds, UNPROVIDED, UNPROVIDED);
        return get_augmented_query_for_cycl_terms(searchable_items, v_search_engine);
    }

    public static final SubLObject qua_searchable_terms_from_cycl_sentence_alt(SubLObject cycl, SubLObject ignore_all_preds, SubLObject generality_cutoff, SubLObject debug) {
        if (ignore_all_preds == UNPROVIDED) {
            ignore_all_preds = NIL;
        }
        if (generality_cutoff == UNPROVIDED) {
            generality_cutoff = $qua_generality_cutoff$.getDynamicValue();
        }
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject searchable_terms = NIL;
                {
                    SubLObject _prev_bind_0 = $qua_ignore_predsP$.currentBinding(thread);
                    try {
                        $qua_ignore_predsP$.bind(ignore_all_preds, thread);
                        {
                            SubLObject all_terms = cycl_utilities.expression_gather(cycl, $sym150$QUA_TERM_FROM_SENTENCE_, NIL, symbol_function(EQL), symbol_function(IDENTITY), NIL);
                            SubLObject cdolist_list_var = all_terms;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                if (!(((NIL != isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)) && cardinality_estimates.generality_estimate(v_term).numG(generality_cutoff)) || (NIL != pred_with_no_nominal_lexesP(v_term, UNPROVIDED)))) {
                                    if (NIL != debug) {
                                        format(T, $str_alt152$Pushing__S_because_it_is_not_a_ge, new SubLObject[]{ v_term, makeBoolean((NIL != isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)) && cardinality_estimates.generality_estimate(v_term).numG(generality_cutoff)), pred_with_no_nominal_lexesP(v_term, UNPROVIDED) });
                                    }
                                    searchable_terms = cons(v_term, searchable_terms);
                                }
                                if (NIL != narts_high.naut_p(v_term)) {
                                    if (NIL != debug) {
                                        format(T, $str_alt153$This_term_is_a_naut___A__, v_term);
                                    }
                                    {
                                        SubLObject functor = v_term.first();
                                        if (((NIL != isa.isaP(functor, $$SearchStringInappropriateFunction, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_variables.cyc_varP(functor))) || (NIL == qua_lexifiedP(v_term))) {
                                            if (NIL != debug) {
                                                format(T, $str_alt155$Either_the_term_is_not_lexified_o, v_term);
                                            }
                                            if (searchable_terms.first().eql(v_term)) {
                                                searchable_terms = searchable_terms.rest();
                                            }
                                            {
                                                SubLObject cdolist_list_var_8 = v_term.rest();
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , arg = cdolist_list_var_8.first()) {
                                                    if (NIL != debug) {
                                                        format(T, $str_alt156$Recursing_on__A__, arg);
                                                    }
                                                    searchable_terms = append(qua_searchable_terms_from_cycl_sentence(arg, ignore_all_preds, generality_cutoff, UNPROVIDED), searchable_terms);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $qua_ignore_predsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return qua_filter_terms(remove_duplicates(searchable_terms, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
    }

    public static SubLObject qua_searchable_terms_from_cycl_sentence(final SubLObject cycl, SubLObject ignore_all_preds, SubLObject generality_cutoff, SubLObject debug) {
        if (ignore_all_preds == UNPROVIDED) {
            ignore_all_preds = NIL;
        }
        if (generality_cutoff == UNPROVIDED) {
            generality_cutoff = $qua_generality_cutoff$.getDynamicValue();
        }
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject searchable_terms = NIL;
        final SubLObject _prev_bind_0 = $qua_ignore_predsP$.currentBinding(thread);
        try {
            $qua_ignore_predsP$.bind(ignore_all_preds, thread);
            SubLObject cdolist_list_var;
            final SubLObject all_terms = cdolist_list_var = cycl_utilities.expression_gather(cycl, $sym153$QUA_TERM_FROM_SENTENCE_, NIL, symbol_function(EQL), symbol_function(IDENTITY), NIL);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL == isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)) || (!cardinality_estimates.generality_estimate(v_term).numG(generality_cutoff))) && (NIL == pred_with_no_nominal_lexesP(v_term, UNPROVIDED))) {
                    if (NIL != debug) {
                        format(T, $str155$Pushing__S_because_it_is_not_a_ge, new SubLObject[]{ v_term, makeBoolean((NIL != isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)) && cardinality_estimates.generality_estimate(v_term).numG(generality_cutoff)), pred_with_no_nominal_lexesP(v_term, UNPROVIDED) });
                    }
                    searchable_terms = cons(v_term, searchable_terms);
                }
                if (NIL != narts_high.naut_p(v_term)) {
                    if (NIL != debug) {
                        format(T, $str156$This_term_is_a_naut___A__, v_term);
                    }
                    final SubLObject functor = v_term.first();
                    if (((NIL != isa.isaP(functor, $$SearchStringInappropriateFunction, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_variables.cyc_varP(functor))) || (NIL == qua_lexifiedP(v_term))) {
                        if (NIL != debug) {
                            format(T, $str158$Either_the_term_is_not_lexified_o, v_term);
                        }
                        if (searchable_terms.first().eql(v_term)) {
                            searchable_terms = searchable_terms.rest();
                        }
                        SubLObject cdolist_list_var_$7 = v_term.rest();
                        SubLObject arg = NIL;
                        arg = cdolist_list_var_$7.first();
                        while (NIL != cdolist_list_var_$7) {
                            if (NIL != debug) {
                                format(T, $str159$Recursing_on__A__, arg);
                            }
                            searchable_terms = append(qua_searchable_terms_from_cycl_sentence(arg, ignore_all_preds, generality_cutoff, UNPROVIDED), searchable_terms);
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            arg = cdolist_list_var_$7.first();
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        } finally {
            $qua_ignore_predsP$.rebind(_prev_bind_0, thread);
        }
        return qua_filter_terms(remove_duplicates(searchable_terms, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject qua_term_from_sentenceP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != misc_kb_utilities.constant_or_natP(v_term)) || (NIL != narts_high.naut_p(v_term))) && (!((NIL != $qua_ignore_predsP$.getDynamicValue(thread)) && (NIL != fort_types_interface.predicate_p(v_term)))));
        }
    }

    public static SubLObject qua_term_from_sentenceP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != misc_kb_utilities.constant_or_natP(v_term)) || (NIL != narts_high.naut_p(v_term))) && ((NIL == $qua_ignore_predsP$.getDynamicValue(thread)) || (NIL == fort_types_interface.predicate_p(v_term))));
    }

    public static final SubLObject pred_with_no_nominal_lexesP_alt(SubLObject v_term, SubLObject lex_mt) {
        if (lex_mt == UNPROVIDED) {
            lex_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return makeBoolean((NIL != fort_types_interface.predicateP(v_term)) && (NIL == ask_utilities.query_boolean(list($$or, listS($$termPhrases, v_term, $list_alt159), listS($$termPhrases, v_term, $list_alt160)), lex_mt, UNPROVIDED)));
    }

    public static SubLObject pred_with_no_nominal_lexesP(final SubLObject v_term, SubLObject lex_mt) {
        if (lex_mt == UNPROVIDED) {
            lex_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return makeBoolean((NIL != fort_types_interface.predicateP(v_term)) && (NIL == ask_utilities.query_boolean(list($$or, listS($$termPhrases, v_term, $list162), listS($$termPhrases, v_term, $list163)), lex_mt, UNPROVIDED)));
    }

    public static final SubLObject terms_from_web_query_alt(SubLObject query_string) {
        {
            SubLObject tokenizations = get_tokenizations_for_aq_string(query_string, UNPROVIDED);
            SubLObject words = NIL;
            SubLObject cdolist_list_var = tokenizations;
            SubLObject tokenization = NIL;
            for (tokenization = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tokenization = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_9 = tokenization;
                    SubLObject token = NIL;
                    for (token = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , token = cdolist_list_var_9.first()) {
                        {
                            SubLObject string = aq_term_original_string(token);
                            SubLObject cdolist_list_var_10 = aq_term_raw_meanings(token).rest();
                            SubLObject interp_cycl = NIL;
                            for (interp_cycl = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , interp_cycl = cdolist_list_var_10.first()) {
                                {
                                    SubLObject word = list($STRING, string, $INTERP, interp_cycl, $INTERP_CFASL, kb_utilities.hl_external_id_string(interp_cycl), $INTERP_GENERATION, pph_main.generate_phrase(interp_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    words = cons(word, words);
                                }
                            }
                        }
                    }
                }
            }
            return words;
        }
    }

    public static SubLObject terms_from_web_query(final SubLObject query_string) {
        final SubLObject tokenizations = get_tokenizations_for_aq_string(query_string, UNPROVIDED);
        SubLObject words = NIL;
        SubLObject cdolist_list_var = tokenizations;
        SubLObject tokenization = NIL;
        tokenization = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = tokenization;
            SubLObject token = NIL;
            token = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                final SubLObject string = aq_term_original_string(token);
                SubLObject cdolist_list_var_$9 = aq_term_raw_meanings(token).rest();
                SubLObject interp_cycl = NIL;
                interp_cycl = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    final SubLObject word = list($STRING, string, $INTERP, interp_cycl, $INTERP_CFASL, kb_utilities.hl_external_id_string(interp_cycl), $INTERP_GENERATION, pph_main.generate_phrase(interp_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    words = cons(word, words);
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    interp_cycl = cdolist_list_var_$9.first();
                } 
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                token = cdolist_list_var_$8.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            tokenization = cdolist_list_var.first();
        } 
        return words;
    }

    public static final SubLObject declare_qua_query_file_alt() {
        declareFunction("augmented_query_string_for_query_string", "AUGMENTED-QUERY-STRING-FOR-QUERY-STRING", 1, 1, false);
        declareFunction("augmented_query_string_for_cycl_terms", "AUGMENTED-QUERY-STRING-FOR-CYCL-TERMS", 1, 1, false);
        declareFunction("get_aq_lexicon", "GET-AQ-LEXICON", 0, 0, false);
        declareFunction("augmented_query_print_function_trampoline", "AUGMENTED-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("augmented_query_p", "AUGMENTED-QUERY-P", 1, 0, false);
        new com.cyc.cycjava.cycl.qua_query.$augmented_query_p$UnaryFunction();
        declareFunction("aq_original_phrase", "AQ-ORIGINAL-PHRASE", 1, 0, false);
        declareFunction("aq_id", "AQ-ID", 1, 0, false);
        declareFunction("aq_tokenizations", "AQ-TOKENIZATIONS", 1, 0, false);
        declareFunction("aq_query_string", "AQ-QUERY-STRING", 1, 0, false);
        declareFunction("aq_query_string_staleP", "AQ-QUERY-STRING-STALE?", 1, 0, false);
        declareFunction("aq_search_engine", "AQ-SEARCH-ENGINE", 1, 0, false);
        declareFunction("_csetf_aq_original_phrase", "_CSETF-AQ-ORIGINAL-PHRASE", 2, 0, false);
        declareFunction("_csetf_aq_id", "_CSETF-AQ-ID", 2, 0, false);
        declareFunction("_csetf_aq_tokenizations", "_CSETF-AQ-TOKENIZATIONS", 2, 0, false);
        declareFunction("_csetf_aq_query_string", "_CSETF-AQ-QUERY-STRING", 2, 0, false);
        declareFunction("_csetf_aq_query_string_staleP", "_CSETF-AQ-QUERY-STRING-STALE?", 2, 0, false);
        declareFunction("_csetf_aq_search_engine", "_CSETF-AQ-SEARCH-ENGINE", 2, 0, false);
        declareFunction("make_augmented_query", "MAKE-AUGMENTED-QUERY", 0, 1, false);
        declareFunction("new_augmented_query", "NEW-AUGMENTED-QUERY", 0, 2, false);
        declareFunction("print_augmented_query", "PRINT-AUGMENTED-QUERY", 3, 0, false);
        declareFunction("get_aq_tokenizations", "GET-AQ-TOKENIZATIONS", 1, 0, false);
        declareFunction("get_aq_search_engine", "GET-AQ-SEARCH-ENGINE", 1, 0, false);
        declareFunction("set_aq_search_engine", "SET-AQ-SEARCH-ENGINE", 2, 0, false);
        declareFunction("aq_max_strings_for_search", "AQ-MAX-STRINGS-FOR-SEARCH", 1, 0, false);
        declareFunction("get_aq_max_strings_per_term", "GET-AQ-MAX-STRINGS-PER-TERM", 1, 0, false);
        declareFunction("get_qua_operator_strings_for_search", "GET-QUA-OPERATOR-STRINGS-FOR-SEARCH", 1, 0, false);
        declareFunction("get_aq_term_by_id", "GET-AQ-TERM-BY-ID", 2, 0, false);
        declareFunction("get_augmented_query_for_id", "GET-AUGMENTED-QUERY-FOR-ID", 1, 0, false);
        declareFunction("get_augmented_query_for_cycl_terms", "GET-AUGMENTED-QUERY-FOR-CYCL-TERMS", 1, 1, false);
        declareFunction("get_raw_query_url", "GET-RAW-QUERY-URL", 1, 1, false);
        declareFunction("get_augmented_query_url", "GET-AUGMENTED-QUERY-URL", 1, 1, false);
        declareFunction("get_query_url", "GET-QUERY-URL", 2, 1, false);
        declareFunction("get_search_string_for_query", "GET-SEARCH-STRING-FOR-QUERY", 1, 0, false);
        declareFunction("n_best_qua_strings", "N-BEST-QUA-STRINGS", 2, 0, false);
        declareFunction("qua_or_clause", "QUA-OR-CLAUSE", 1, 0, false);
        declareFunction("qua_and_clause", "QUA-AND-CLAUSE", 1, 0, false);
        declareFunction("qua_connected_clause", "QUA-CONNECTED-CLAUSE", 2, 0, false);
        declareFunction("maybe_add_quotes", "MAYBE-ADD-QUOTES", 1, 0, false);
        declareFunction("qua_add_connective", "QUA-ADD-CONNECTIVE", 2, 0, false);
        declareFunction("nearest_spec_strings", "NEAREST-SPEC-STRINGS", 1, 0, false);
        declareFunction("get_disambiguation_options", "GET-DISAMBIGUATION-OPTIONS", 1, 0, false);
        declareFunction("get_all_disambiguation_options", "GET-ALL-DISAMBIGUATION-OPTIONS", 1, 0, false);
        declareFunction("generate_unambiguous_aq_term_meanings", "GENERATE-UNAMBIGUOUS-AQ-TERM-MEANINGS", 1, 0, false);
        declareFunction("reset_ambiguity", "RESET-AMBIGUITY", 2, 0, false);
        declareFunction("accept_disambiguation_option", "ACCEPT-DISAMBIGUATION-OPTION", 3, 0, false);
        declareFunction("aq_term_print_function_trampoline", "AQ-TERM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("aq_term_p", "AQ-TERM-P", 1, 0, false);
        new com.cyc.cycjava.cycl.qua_query.$aq_term_p$UnaryFunction();
        declareFunction("aq_term_id", "AQ-TERM-ID", 1, 0, false);
        declareFunction("aq_term_original_string", "AQ-TERM-ORIGINAL-STRING", 1, 0, false);
        declareFunction("aq_term_raw_meanings", "AQ-TERM-RAW-MEANINGS", 1, 0, false);
        declareFunction("aq_term_possible_meanings", "AQ-TERM-POSSIBLE-MEANINGS", 1, 0, false);
        declareFunction("aq_term_disfavored_meanings", "AQ-TERM-DISFAVORED-MEANINGS", 1, 0, false);
        declareFunction("aq_term_positive_strings", "AQ-TERM-POSITIVE-STRINGS", 1, 0, false);
        declareFunction("aq_term_positive_terms_in_upward_closure", "AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE", 1, 0, false);
        declareFunction("aq_term_positive_strings_staleP", "AQ-TERM-POSITIVE-STRINGS-STALE?", 1, 0, false);
        declareFunction("aq_term_negative_strings", "AQ-TERM-NEGATIVE-STRINGS", 1, 0, false);
        declareFunction("aq_term_negative_terms_in_upward_closure", "AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE", 1, 0, false);
        declareFunction("aq_term_negative_strings_staleP", "AQ-TERM-NEGATIVE-STRINGS-STALE?", 1, 0, false);
        declareFunction("_csetf_aq_term_id", "_CSETF-AQ-TERM-ID", 2, 0, false);
        declareFunction("_csetf_aq_term_original_string", "_CSETF-AQ-TERM-ORIGINAL-STRING", 2, 0, false);
        declareFunction("_csetf_aq_term_raw_meanings", "_CSETF-AQ-TERM-RAW-MEANINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_possible_meanings", "_CSETF-AQ-TERM-POSSIBLE-MEANINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_disfavored_meanings", "_CSETF-AQ-TERM-DISFAVORED-MEANINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_positive_strings", "_CSETF-AQ-TERM-POSITIVE-STRINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_positive_terms_in_upward_closure", "_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE", 2, 0, false);
        declareFunction("_csetf_aq_term_positive_strings_staleP", "_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?", 2, 0, false);
        declareFunction("_csetf_aq_term_negative_strings", "_CSETF-AQ-TERM-NEGATIVE-STRINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_negative_terms_in_upward_closure", "_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE", 2, 0, false);
        declareFunction("_csetf_aq_term_negative_strings_staleP", "_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?", 2, 0, false);
        declareFunction("make_aq_term", "MAKE-AQ-TERM", 0, 1, false);
        declareFunction("print_aq_term", "PRINT-AQ-TERM", 3, 0, false);
        declareFunction("new_aq_term", "NEW-AQ-TERM", 1, 0, false);
        declareFunction("aq_term_preferred_meaning", "AQ-TERM-PREFERRED-MEANING", 1, 0, false);
        declareFunction("undisambiguated_termP", "UNDISAMBIGUATED-TERM?", 1, 0, false);
        declareFunction("get_tokenizations_for_aq_string", "GET-TOKENIZATIONS-FOR-AQ-STRING", 1, 1, false);
        declareFunction("conflated_term_from", "CONFLATED-TERM-FROM", 1, 0, false);
        declareFunction("get_tokenizations_for_terms", "GET-TOKENIZATIONS-FOR-TERMS", 1, 0, false);
        declareFunction("positive_strings_for_term", "POSITIVE-STRINGS-FOR-TERM", 1, 0, false);
        declareFunction("qua_filter_terms", "QUA-FILTER-TERMS", 1, 0, false);
        declareFunction("clear_qua_filter_termP", "CLEAR-QUA-FILTER-TERM?", 0, 0, false);
        declareFunction("remove_qua_filter_termP", "REMOVE-QUA-FILTER-TERM?", 1, 1, false);
        declareFunction("qua_filter_termP_internal", "QUA-FILTER-TERM?-INTERNAL", 2, 0, false);
        declareFunction("qua_filter_termP", "QUA-FILTER-TERM?", 1, 1, false);
        declareFunction("qua_irrelevant_termP", "QUA-IRRELEVANT-TERM?", 2, 0, false);
        declareFunction("qua_lexifiedP", "QUA-LEXIFIED?", 1, 0, false);
        declareFunction("clear_qua_expansion_cycls", "CLEAR-QUA-EXPANSION-CYCLS", 0, 0, false);
        declareFunction("remove_qua_expansion_cycls", "REMOVE-QUA-EXPANSION-CYCLS", 1, 0, false);
        declareFunction("qua_expansion_cycls_internal", "QUA-EXPANSION-CYCLS-INTERNAL", 1, 0, false);
        declareFunction("qua_expansion_cycls", "QUA-EXPANSION-CYCLS", 1, 0, false);
        declareFunction("qua_expansion_strings", "QUA-EXPANSION-STRINGS", 1, 0, false);
        declareFunction("aq_term_related_terms", "AQ-TERM-RELATED-TERMS", 1, 0, false);
        declareFunction("aq_term_related_strings", "AQ-TERM-RELATED-STRINGS", 1, 0, false);
        declareFunction("aq_term_siblings", "AQ-TERM-SIBLINGS", 1, 0, false);
        declareFunction("clear_web_conceptually_related", "CLEAR-WEB-CONCEPTUALLY-RELATED", 0, 0, false);
        declareFunction("remove_web_conceptually_related", "REMOVE-WEB-CONCEPTUALLY-RELATED", 1, 1, false);
        declareFunction("web_conceptually_related_internal", "WEB-CONCEPTUALLY-RELATED-INTERNAL", 2, 0, false);
        declareFunction("web_conceptually_related", "WEB-CONCEPTUALLY-RELATED", 1, 1, false);
        declareFunction("aq_term_specs", "AQ-TERM-SPECS", 1, 0, false);
        declareFunction("aq_term_spec_strings", "AQ-TERM-SPEC-STRINGS", 1, 0, false);
        declareFunction("aq_term_genls", "AQ-TERM-GENLS", 1, 0, false);
        declareFunction("aq_term_genl_strings", "AQ-TERM-GENL-STRINGS", 1, 0, false);
        declareFunction("qua_speech_part_preds", "QUA-SPEECH-PART-PREDS", 0, 1, false);
        declareFunction("clear_qua_generate_phrase", "CLEAR-QUA-GENERATE-PHRASE", 0, 0, false);
        declareFunction("remove_qua_generate_phrase", "REMOVE-QUA-GENERATE-PHRASE", 1, 0, false);
        declareFunction("qua_generate_phrase_internal", "QUA-GENERATE-PHRASE-INTERNAL", 1, 0, false);
        declareFunction("qua_generate_phrase", "QUA-GENERATE-PHRASE", 1, 0, false);
        declareFunction("clear_qua_all_phrases_for_term", "CLEAR-QUA-ALL-PHRASES-FOR-TERM", 0, 0, false);
        declareFunction("remove_qua_all_phrases_for_term", "REMOVE-QUA-ALL-PHRASES-FOR-TERM", 1, 0, false);
        declareFunction("qua_all_phrases_for_term_internal", "QUA-ALL-PHRASES-FOR-TERM-INTERNAL", 1, 0, false);
        declareFunction("qua_all_phrases_for_term", "QUA-ALL-PHRASES-FOR-TERM", 1, 0, false);
        declareFunction("qua_all_phrases_for_term_as_string_list", "QUA-ALL-PHRASES-FOR-TERM-AS-STRING-LIST", 1, 0, false);
        declareFunction("clarifying_genls_strings", "CLARIFYING-GENLS-STRINGS", 2, 1, false);
        declareFunction("clarifying_differentiating_genls", "CLARIFYING-DIFFERENTIATING-GENLS", 2, 1, false);
        declareFunction("remove_stop_words_from_strings", "REMOVE-STOP-WORDS-FROM-STRINGS", 1, 0, false);
        declareFunction("negative_strings_for_term", "NEGATIVE-STRINGS-FOR-TERM", 1, 0, false);
        declareFunction("qua_strings_for_term_via_synsets", "QUA-STRINGS-FOR-TERM-VIA-SYNSETS", 1, 0, false);
        declareFunction("get_aq_term_disambig_options", "GET-AQ-TERM-DISAMBIG-OPTIONS", 1, 0, false);
        declareFunction("reset_aq_term_ambiguity", "RESET-AQ-TERM-AMBIGUITY", 1, 0, false);
        declareFunction("set_aq_term_possible_meanings", "SET-AQ-TERM-POSSIBLE-MEANINGS", 2, 0, false);
        declareFunction("set_aq_term_raw_meanings", "SET-AQ-TERM-RAW-MEANINGS", 2, 0, false);
        declareFunction("get_aq_term_possible_meanings", "GET-AQ-TERM-POSSIBLE-MEANINGS", 1, 0, false);
        declareFunction("set_aq_term_disfavored_meanings", "SET-AQ-TERM-DISFAVORED-MEANINGS", 2, 0, false);
        declareFunction("accept_meaning", "ACCEPT-MEANING", 2, 0, false);
        declareFunction("reject_meaning", "REJECT-MEANING", 2, 0, false);
        declareFunction("clear_qua_caches", "CLEAR-QUA-CACHES", 0, 0, false);
        declareFunction("get_query_url_for_sentence", "GET-QUERY-URL-FOR-SENTENCE", 1, 2, false);
        declareFunction("qua_query_string_for_cycl_sentence", "QUA-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 2, false);
        declareFunction("qua_query_for_cycl_sentence", "QUA-QUERY-FOR-CYCL-SENTENCE", 1, 2, false);
        declareFunction("qua_searchable_terms_from_cycl_sentence", "QUA-SEARCHABLE-TERMS-FROM-CYCL-SENTENCE", 1, 3, false);
        declareFunction("qua_term_from_sentenceP", "QUA-TERM-FROM-SENTENCE?", 1, 0, false);
        declareFunction("pred_with_no_nominal_lexesP", "PRED-WITH-NO-NOMINAL-LEXES?", 1, 1, false);
        declareFunction("sets_equalp", "SETS-EQUALP", 2, 0, false);
        declareFunction("terms_from_web_query", "TERMS-FROM-WEB-QUERY", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_qua_query_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("augmented_query_string_for_query_string", "AUGMENTED-QUERY-STRING-FOR-QUERY-STRING", 1, 1, false);
            declareFunction("augmented_query_string_for_cycl_terms", "AUGMENTED-QUERY-STRING-FOR-CYCL-TERMS", 1, 1, false);
            declareFunction("get_aq_lexicon", "GET-AQ-LEXICON", 0, 0, false);
            declareFunction("augmented_query_print_function_trampoline", "AUGMENTED-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("augmented_query_p", "AUGMENTED-QUERY-P", 1, 0, false);
            new qua_query.$augmented_query_p$UnaryFunction();
            declareFunction("aq_original_phrase", "AQ-ORIGINAL-PHRASE", 1, 0, false);
            declareFunction("aq_id", "AQ-ID", 1, 0, false);
            declareFunction("aq_tokenizations", "AQ-TOKENIZATIONS", 1, 0, false);
            declareFunction("aq_query_string", "AQ-QUERY-STRING", 1, 0, false);
            declareFunction("aq_query_string_staleP", "AQ-QUERY-STRING-STALE?", 1, 0, false);
            declareFunction("aq_search_engine", "AQ-SEARCH-ENGINE", 1, 0, false);
            declareFunction("_csetf_aq_original_phrase", "_CSETF-AQ-ORIGINAL-PHRASE", 2, 0, false);
            declareFunction("_csetf_aq_id", "_CSETF-AQ-ID", 2, 0, false);
            declareFunction("_csetf_aq_tokenizations", "_CSETF-AQ-TOKENIZATIONS", 2, 0, false);
            declareFunction("_csetf_aq_query_string", "_CSETF-AQ-QUERY-STRING", 2, 0, false);
            declareFunction("_csetf_aq_query_string_staleP", "_CSETF-AQ-QUERY-STRING-STALE?", 2, 0, false);
            declareFunction("_csetf_aq_search_engine", "_CSETF-AQ-SEARCH-ENGINE", 2, 0, false);
            declareFunction("make_augmented_query", "MAKE-AUGMENTED-QUERY", 0, 1, false);
            declareFunction("visit_defstruct_augmented_query", "VISIT-DEFSTRUCT-AUGMENTED-QUERY", 2, 0, false);
            declareFunction("visit_defstruct_object_augmented_query_method", "VISIT-DEFSTRUCT-OBJECT-AUGMENTED-QUERY-METHOD", 2, 0, false);
            declareFunction("new_augmented_query", "NEW-AUGMENTED-QUERY", 0, 2, false);
            declareFunction("print_augmented_query", "PRINT-AUGMENTED-QUERY", 3, 0, false);
            declareFunction("get_aq_tokenizations", "GET-AQ-TOKENIZATIONS", 1, 0, false);
            declareFunction("get_aq_search_engine", "GET-AQ-SEARCH-ENGINE", 1, 0, false);
            declareFunction("set_aq_search_engine", "SET-AQ-SEARCH-ENGINE", 2, 0, false);
            declareFunction("aq_max_strings_for_search", "AQ-MAX-STRINGS-FOR-SEARCH", 1, 0, false);
            declareFunction("get_aq_max_strings_per_term", "GET-AQ-MAX-STRINGS-PER-TERM", 1, 0, false);
            declareFunction("get_qua_operator_strings_for_search", "GET-QUA-OPERATOR-STRINGS-FOR-SEARCH", 1, 0, false);
            declareFunction("get_aq_term_by_id", "GET-AQ-TERM-BY-ID", 2, 0, false);
            declareFunction("get_augmented_query_for_id", "GET-AUGMENTED-QUERY-FOR-ID", 1, 0, false);
            declareFunction("get_augmented_query_for_cycl_terms", "GET-AUGMENTED-QUERY-FOR-CYCL-TERMS", 1, 1, false);
            declareFunction("get_raw_query_url", "GET-RAW-QUERY-URL", 1, 1, false);
            declareFunction("get_augmented_query_url", "GET-AUGMENTED-QUERY-URL", 1, 1, false);
            declareFunction("get_query_url", "GET-QUERY-URL", 2, 1, false);
            declareFunction("get_search_string_for_query", "GET-SEARCH-STRING-FOR-QUERY", 1, 0, false);
            declareFunction("n_best_qua_strings", "N-BEST-QUA-STRINGS", 2, 0, false);
            declareFunction("qua_or_clause", "QUA-OR-CLAUSE", 1, 0, false);
            declareFunction("qua_and_clause", "QUA-AND-CLAUSE", 1, 0, false);
            declareFunction("qua_connected_clause", "QUA-CONNECTED-CLAUSE", 2, 0, false);
            declareFunction("maybe_add_quotes", "MAYBE-ADD-QUOTES", 1, 0, false);
            declareFunction("qua_add_connective", "QUA-ADD-CONNECTIVE", 2, 0, false);
            declareFunction("nearest_spec_strings", "NEAREST-SPEC-STRINGS", 1, 0, false);
            declareFunction("get_disambiguation_options", "GET-DISAMBIGUATION-OPTIONS", 1, 0, false);
            declareFunction("get_all_disambiguation_options", "GET-ALL-DISAMBIGUATION-OPTIONS", 1, 0, false);
            declareFunction("generate_unambiguous_aq_term_meanings", "GENERATE-UNAMBIGUOUS-AQ-TERM-MEANINGS", 1, 0, false);
            declareFunction("reset_ambiguity", "RESET-AMBIGUITY", 2, 0, false);
            declareFunction("accept_disambiguation_option", "ACCEPT-DISAMBIGUATION-OPTION", 3, 0, false);
            declareFunction("aq_term_print_function_trampoline", "AQ-TERM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("aq_term_p", "AQ-TERM-P", 1, 0, false);
            new qua_query.$aq_term_p$UnaryFunction();
            declareFunction("aq_term_id", "AQ-TERM-ID", 1, 0, false);
            declareFunction("aq_term_original_string", "AQ-TERM-ORIGINAL-STRING", 1, 0, false);
            declareFunction("aq_term_raw_meanings", "AQ-TERM-RAW-MEANINGS", 1, 0, false);
            declareFunction("aq_term_possible_meanings", "AQ-TERM-POSSIBLE-MEANINGS", 1, 0, false);
            declareFunction("aq_term_disfavored_meanings", "AQ-TERM-DISFAVORED-MEANINGS", 1, 0, false);
            declareFunction("aq_term_positive_strings", "AQ-TERM-POSITIVE-STRINGS", 1, 0, false);
            declareFunction("aq_term_positive_terms_in_upward_closure", "AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE", 1, 0, false);
            declareFunction("aq_term_positive_strings_staleP", "AQ-TERM-POSITIVE-STRINGS-STALE?", 1, 0, false);
            declareFunction("aq_term_negative_strings", "AQ-TERM-NEGATIVE-STRINGS", 1, 0, false);
            declareFunction("aq_term_negative_terms_in_upward_closure", "AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE", 1, 0, false);
            declareFunction("aq_term_negative_strings_staleP", "AQ-TERM-NEGATIVE-STRINGS-STALE?", 1, 0, false);
            declareFunction("_csetf_aq_term_id", "_CSETF-AQ-TERM-ID", 2, 0, false);
            declareFunction("_csetf_aq_term_original_string", "_CSETF-AQ-TERM-ORIGINAL-STRING", 2, 0, false);
            declareFunction("_csetf_aq_term_raw_meanings", "_CSETF-AQ-TERM-RAW-MEANINGS", 2, 0, false);
            declareFunction("_csetf_aq_term_possible_meanings", "_CSETF-AQ-TERM-POSSIBLE-MEANINGS", 2, 0, false);
            declareFunction("_csetf_aq_term_disfavored_meanings", "_CSETF-AQ-TERM-DISFAVORED-MEANINGS", 2, 0, false);
            declareFunction("_csetf_aq_term_positive_strings", "_CSETF-AQ-TERM-POSITIVE-STRINGS", 2, 0, false);
            declareFunction("_csetf_aq_term_positive_terms_in_upward_closure", "_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE", 2, 0, false);
            declareFunction("_csetf_aq_term_positive_strings_staleP", "_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?", 2, 0, false);
            declareFunction("_csetf_aq_term_negative_strings", "_CSETF-AQ-TERM-NEGATIVE-STRINGS", 2, 0, false);
            declareFunction("_csetf_aq_term_negative_terms_in_upward_closure", "_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE", 2, 0, false);
            declareFunction("_csetf_aq_term_negative_strings_staleP", "_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?", 2, 0, false);
            declareFunction("make_aq_term", "MAKE-AQ-TERM", 0, 1, false);
            declareFunction("visit_defstruct_aq_term", "VISIT-DEFSTRUCT-AQ-TERM", 2, 0, false);
            declareFunction("visit_defstruct_object_aq_term_method", "VISIT-DEFSTRUCT-OBJECT-AQ-TERM-METHOD", 2, 0, false);
            declareFunction("print_aq_term", "PRINT-AQ-TERM", 3, 0, false);
            declareFunction("new_aq_term", "NEW-AQ-TERM", 1, 0, false);
            declareFunction("aq_term_preferred_meaning", "AQ-TERM-PREFERRED-MEANING", 1, 0, false);
            declareFunction("undisambiguated_termP", "UNDISAMBIGUATED-TERM?", 1, 0, false);
            declareFunction("get_tokenizations_for_aq_string", "GET-TOKENIZATIONS-FOR-AQ-STRING", 1, 1, false);
            declareFunction("conflated_term_from", "CONFLATED-TERM-FROM", 1, 0, false);
            declareFunction("get_tokenizations_for_terms", "GET-TOKENIZATIONS-FOR-TERMS", 1, 0, false);
            declareFunction("positive_strings_for_term", "POSITIVE-STRINGS-FOR-TERM", 1, 0, false);
            declareFunction("qua_filter_terms", "QUA-FILTER-TERMS", 1, 0, false);
            declareFunction("clear_qua_filter_termP", "CLEAR-QUA-FILTER-TERM?", 0, 0, false);
            declareFunction("remove_qua_filter_termP", "REMOVE-QUA-FILTER-TERM?", 1, 1, false);
            declareFunction("qua_filter_termP_internal", "QUA-FILTER-TERM?-INTERNAL", 2, 0, false);
            declareFunction("qua_filter_termP", "QUA-FILTER-TERM?", 1, 1, false);
            declareFunction("qua_irrelevant_termP", "QUA-IRRELEVANT-TERM?", 2, 0, false);
            declareFunction("qua_lexifiedP", "QUA-LEXIFIED?", 1, 0, false);
            declareFunction("clear_qua_expansion_cycls", "CLEAR-QUA-EXPANSION-CYCLS", 0, 0, false);
            declareFunction("remove_qua_expansion_cycls", "REMOVE-QUA-EXPANSION-CYCLS", 1, 0, false);
            declareFunction("qua_expansion_cycls_internal", "QUA-EXPANSION-CYCLS-INTERNAL", 1, 0, false);
            declareFunction("qua_expansion_cycls", "QUA-EXPANSION-CYCLS", 1, 0, false);
            declareFunction("qua_expansion_strings", "QUA-EXPANSION-STRINGS", 1, 0, false);
            declareFunction("aq_term_related_terms", "AQ-TERM-RELATED-TERMS", 1, 0, false);
            declareFunction("aq_term_related_strings", "AQ-TERM-RELATED-STRINGS", 1, 0, false);
            declareFunction("aq_term_siblings", "AQ-TERM-SIBLINGS", 1, 0, false);
            declareFunction("clear_web_conceptually_related", "CLEAR-WEB-CONCEPTUALLY-RELATED", 0, 0, false);
            declareFunction("remove_web_conceptually_related", "REMOVE-WEB-CONCEPTUALLY-RELATED", 1, 1, false);
            declareFunction("web_conceptually_related_internal", "WEB-CONCEPTUALLY-RELATED-INTERNAL", 2, 0, false);
            declareFunction("web_conceptually_related", "WEB-CONCEPTUALLY-RELATED", 1, 1, false);
            declareFunction("aq_term_specs", "AQ-TERM-SPECS", 1, 0, false);
            declareFunction("aq_term_spec_strings", "AQ-TERM-SPEC-STRINGS", 1, 0, false);
            declareFunction("aq_term_genls", "AQ-TERM-GENLS", 1, 0, false);
            declareFunction("aq_term_genl_strings", "AQ-TERM-GENL-STRINGS", 1, 0, false);
            declareFunction("qua_speech_part_preds", "QUA-SPEECH-PART-PREDS", 0, 1, false);
            declareFunction("clear_qua_generate_phrase", "CLEAR-QUA-GENERATE-PHRASE", 0, 0, false);
            declareFunction("remove_qua_generate_phrase", "REMOVE-QUA-GENERATE-PHRASE", 1, 0, false);
            declareFunction("qua_generate_phrase_internal", "QUA-GENERATE-PHRASE-INTERNAL", 1, 0, false);
            declareFunction("qua_generate_phrase", "QUA-GENERATE-PHRASE", 1, 0, false);
            declareFunction("clear_qua_all_phrases_for_term", "CLEAR-QUA-ALL-PHRASES-FOR-TERM", 0, 0, false);
            declareFunction("remove_qua_all_phrases_for_term", "REMOVE-QUA-ALL-PHRASES-FOR-TERM", 1, 0, false);
            declareFunction("qua_all_phrases_for_term_internal", "QUA-ALL-PHRASES-FOR-TERM-INTERNAL", 1, 0, false);
            declareFunction("qua_all_phrases_for_term", "QUA-ALL-PHRASES-FOR-TERM", 1, 0, false);
            declareFunction("qua_all_phrases_for_term_as_string_list", "QUA-ALL-PHRASES-FOR-TERM-AS-STRING-LIST", 1, 0, false);
            declareFunction("clarifying_genls_strings", "CLARIFYING-GENLS-STRINGS", 2, 1, false);
            declareFunction("clarifying_differentiating_genls", "CLARIFYING-DIFFERENTIATING-GENLS", 2, 1, false);
            declareFunction("remove_stop_words_from_strings", "REMOVE-STOP-WORDS-FROM-STRINGS", 1, 0, false);
            declareFunction("negative_strings_for_term", "NEGATIVE-STRINGS-FOR-TERM", 1, 0, false);
            declareFunction("qua_strings_for_term_via_synsets", "QUA-STRINGS-FOR-TERM-VIA-SYNSETS", 1, 0, false);
            declareFunction("get_aq_term_disambig_options", "GET-AQ-TERM-DISAMBIG-OPTIONS", 1, 0, false);
            declareFunction("reset_aq_term_ambiguity", "RESET-AQ-TERM-AMBIGUITY", 1, 0, false);
            declareFunction("set_aq_term_possible_meanings", "SET-AQ-TERM-POSSIBLE-MEANINGS", 2, 0, false);
            declareFunction("set_aq_term_raw_meanings", "SET-AQ-TERM-RAW-MEANINGS", 2, 0, false);
            declareFunction("get_aq_term_possible_meanings", "GET-AQ-TERM-POSSIBLE-MEANINGS", 1, 0, false);
            declareFunction("set_aq_term_disfavored_meanings", "SET-AQ-TERM-DISFAVORED-MEANINGS", 2, 0, false);
            declareFunction("accept_meaning", "ACCEPT-MEANING", 2, 0, false);
            declareFunction("reject_meaning", "REJECT-MEANING", 2, 0, false);
            declareFunction("clear_qua_caches", "CLEAR-QUA-CACHES", 0, 0, false);
            declareFunction("get_query_url_for_sentence", "GET-QUERY-URL-FOR-SENTENCE", 1, 2, false);
            declareFunction("qua_query_string_for_cycl_sentence", "QUA-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 2, false);
            declareFunction("qua_query_for_cycl_sentence", "QUA-QUERY-FOR-CYCL-SENTENCE", 1, 2, false);
            declareFunction("qua_searchable_terms_from_cycl_sentence", "QUA-SEARCHABLE-TERMS-FROM-CYCL-SENTENCE", 1, 3, false);
            declareFunction("qua_term_from_sentenceP", "QUA-TERM-FROM-SENTENCE?", 1, 0, false);
            declareFunction("pred_with_no_nominal_lexesP", "PRED-WITH-NO-NOMINAL-LEXES?", 1, 1, false);
            declareFunction("terms_from_web_query", "TERMS-FROM-WEB-QUERY", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("sets_equalp", "SETS-EQUALP", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_qua_query_file_Previous() {
        declareFunction("augmented_query_string_for_query_string", "AUGMENTED-QUERY-STRING-FOR-QUERY-STRING", 1, 1, false);
        declareFunction("augmented_query_string_for_cycl_terms", "AUGMENTED-QUERY-STRING-FOR-CYCL-TERMS", 1, 1, false);
        declareFunction("get_aq_lexicon", "GET-AQ-LEXICON", 0, 0, false);
        declareFunction("augmented_query_print_function_trampoline", "AUGMENTED-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("augmented_query_p", "AUGMENTED-QUERY-P", 1, 0, false);
        new qua_query.$augmented_query_p$UnaryFunction();
        declareFunction("aq_original_phrase", "AQ-ORIGINAL-PHRASE", 1, 0, false);
        declareFunction("aq_id", "AQ-ID", 1, 0, false);
        declareFunction("aq_tokenizations", "AQ-TOKENIZATIONS", 1, 0, false);
        declareFunction("aq_query_string", "AQ-QUERY-STRING", 1, 0, false);
        declareFunction("aq_query_string_staleP", "AQ-QUERY-STRING-STALE?", 1, 0, false);
        declareFunction("aq_search_engine", "AQ-SEARCH-ENGINE", 1, 0, false);
        declareFunction("_csetf_aq_original_phrase", "_CSETF-AQ-ORIGINAL-PHRASE", 2, 0, false);
        declareFunction("_csetf_aq_id", "_CSETF-AQ-ID", 2, 0, false);
        declareFunction("_csetf_aq_tokenizations", "_CSETF-AQ-TOKENIZATIONS", 2, 0, false);
        declareFunction("_csetf_aq_query_string", "_CSETF-AQ-QUERY-STRING", 2, 0, false);
        declareFunction("_csetf_aq_query_string_staleP", "_CSETF-AQ-QUERY-STRING-STALE?", 2, 0, false);
        declareFunction("_csetf_aq_search_engine", "_CSETF-AQ-SEARCH-ENGINE", 2, 0, false);
        declareFunction("make_augmented_query", "MAKE-AUGMENTED-QUERY", 0, 1, false);
        declareFunction("visit_defstruct_augmented_query", "VISIT-DEFSTRUCT-AUGMENTED-QUERY", 2, 0, false);
        declareFunction("visit_defstruct_object_augmented_query_method", "VISIT-DEFSTRUCT-OBJECT-AUGMENTED-QUERY-METHOD", 2, 0, false);
        declareFunction("new_augmented_query", "NEW-AUGMENTED-QUERY", 0, 2, false);
        declareFunction("print_augmented_query", "PRINT-AUGMENTED-QUERY", 3, 0, false);
        declareFunction("get_aq_tokenizations", "GET-AQ-TOKENIZATIONS", 1, 0, false);
        declareFunction("get_aq_search_engine", "GET-AQ-SEARCH-ENGINE", 1, 0, false);
        declareFunction("set_aq_search_engine", "SET-AQ-SEARCH-ENGINE", 2, 0, false);
        declareFunction("aq_max_strings_for_search", "AQ-MAX-STRINGS-FOR-SEARCH", 1, 0, false);
        declareFunction("get_aq_max_strings_per_term", "GET-AQ-MAX-STRINGS-PER-TERM", 1, 0, false);
        declareFunction("get_qua_operator_strings_for_search", "GET-QUA-OPERATOR-STRINGS-FOR-SEARCH", 1, 0, false);
        declareFunction("get_aq_term_by_id", "GET-AQ-TERM-BY-ID", 2, 0, false);
        declareFunction("get_augmented_query_for_id", "GET-AUGMENTED-QUERY-FOR-ID", 1, 0, false);
        declareFunction("get_augmented_query_for_cycl_terms", "GET-AUGMENTED-QUERY-FOR-CYCL-TERMS", 1, 1, false);
        declareFunction("get_raw_query_url", "GET-RAW-QUERY-URL", 1, 1, false);
        declareFunction("get_augmented_query_url", "GET-AUGMENTED-QUERY-URL", 1, 1, false);
        declareFunction("get_query_url", "GET-QUERY-URL", 2, 1, false);
        declareFunction("get_search_string_for_query", "GET-SEARCH-STRING-FOR-QUERY", 1, 0, false);
        declareFunction("n_best_qua_strings", "N-BEST-QUA-STRINGS", 2, 0, false);
        declareFunction("qua_or_clause", "QUA-OR-CLAUSE", 1, 0, false);
        declareFunction("qua_and_clause", "QUA-AND-CLAUSE", 1, 0, false);
        declareFunction("qua_connected_clause", "QUA-CONNECTED-CLAUSE", 2, 0, false);
        declareFunction("maybe_add_quotes", "MAYBE-ADD-QUOTES", 1, 0, false);
        declareFunction("qua_add_connective", "QUA-ADD-CONNECTIVE", 2, 0, false);
        declareFunction("nearest_spec_strings", "NEAREST-SPEC-STRINGS", 1, 0, false);
        declareFunction("get_disambiguation_options", "GET-DISAMBIGUATION-OPTIONS", 1, 0, false);
        declareFunction("get_all_disambiguation_options", "GET-ALL-DISAMBIGUATION-OPTIONS", 1, 0, false);
        declareFunction("generate_unambiguous_aq_term_meanings", "GENERATE-UNAMBIGUOUS-AQ-TERM-MEANINGS", 1, 0, false);
        declareFunction("reset_ambiguity", "RESET-AMBIGUITY", 2, 0, false);
        declareFunction("accept_disambiguation_option", "ACCEPT-DISAMBIGUATION-OPTION", 3, 0, false);
        declareFunction("aq_term_print_function_trampoline", "AQ-TERM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("aq_term_p", "AQ-TERM-P", 1, 0, false);
        new qua_query.$aq_term_p$UnaryFunction();
        declareFunction("aq_term_id", "AQ-TERM-ID", 1, 0, false);
        declareFunction("aq_term_original_string", "AQ-TERM-ORIGINAL-STRING", 1, 0, false);
        declareFunction("aq_term_raw_meanings", "AQ-TERM-RAW-MEANINGS", 1, 0, false);
        declareFunction("aq_term_possible_meanings", "AQ-TERM-POSSIBLE-MEANINGS", 1, 0, false);
        declareFunction("aq_term_disfavored_meanings", "AQ-TERM-DISFAVORED-MEANINGS", 1, 0, false);
        declareFunction("aq_term_positive_strings", "AQ-TERM-POSITIVE-STRINGS", 1, 0, false);
        declareFunction("aq_term_positive_terms_in_upward_closure", "AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE", 1, 0, false);
        declareFunction("aq_term_positive_strings_staleP", "AQ-TERM-POSITIVE-STRINGS-STALE?", 1, 0, false);
        declareFunction("aq_term_negative_strings", "AQ-TERM-NEGATIVE-STRINGS", 1, 0, false);
        declareFunction("aq_term_negative_terms_in_upward_closure", "AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE", 1, 0, false);
        declareFunction("aq_term_negative_strings_staleP", "AQ-TERM-NEGATIVE-STRINGS-STALE?", 1, 0, false);
        declareFunction("_csetf_aq_term_id", "_CSETF-AQ-TERM-ID", 2, 0, false);
        declareFunction("_csetf_aq_term_original_string", "_CSETF-AQ-TERM-ORIGINAL-STRING", 2, 0, false);
        declareFunction("_csetf_aq_term_raw_meanings", "_CSETF-AQ-TERM-RAW-MEANINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_possible_meanings", "_CSETF-AQ-TERM-POSSIBLE-MEANINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_disfavored_meanings", "_CSETF-AQ-TERM-DISFAVORED-MEANINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_positive_strings", "_CSETF-AQ-TERM-POSITIVE-STRINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_positive_terms_in_upward_closure", "_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE", 2, 0, false);
        declareFunction("_csetf_aq_term_positive_strings_staleP", "_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?", 2, 0, false);
        declareFunction("_csetf_aq_term_negative_strings", "_CSETF-AQ-TERM-NEGATIVE-STRINGS", 2, 0, false);
        declareFunction("_csetf_aq_term_negative_terms_in_upward_closure", "_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE", 2, 0, false);
        declareFunction("_csetf_aq_term_negative_strings_staleP", "_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?", 2, 0, false);
        declareFunction("make_aq_term", "MAKE-AQ-TERM", 0, 1, false);
        declareFunction("visit_defstruct_aq_term", "VISIT-DEFSTRUCT-AQ-TERM", 2, 0, false);
        declareFunction("visit_defstruct_object_aq_term_method", "VISIT-DEFSTRUCT-OBJECT-AQ-TERM-METHOD", 2, 0, false);
        declareFunction("print_aq_term", "PRINT-AQ-TERM", 3, 0, false);
        declareFunction("new_aq_term", "NEW-AQ-TERM", 1, 0, false);
        declareFunction("aq_term_preferred_meaning", "AQ-TERM-PREFERRED-MEANING", 1, 0, false);
        declareFunction("undisambiguated_termP", "UNDISAMBIGUATED-TERM?", 1, 0, false);
        declareFunction("get_tokenizations_for_aq_string", "GET-TOKENIZATIONS-FOR-AQ-STRING", 1, 1, false);
        declareFunction("conflated_term_from", "CONFLATED-TERM-FROM", 1, 0, false);
        declareFunction("get_tokenizations_for_terms", "GET-TOKENIZATIONS-FOR-TERMS", 1, 0, false);
        declareFunction("positive_strings_for_term", "POSITIVE-STRINGS-FOR-TERM", 1, 0, false);
        declareFunction("qua_filter_terms", "QUA-FILTER-TERMS", 1, 0, false);
        declareFunction("clear_qua_filter_termP", "CLEAR-QUA-FILTER-TERM?", 0, 0, false);
        declareFunction("remove_qua_filter_termP", "REMOVE-QUA-FILTER-TERM?", 1, 1, false);
        declareFunction("qua_filter_termP_internal", "QUA-FILTER-TERM?-INTERNAL", 2, 0, false);
        declareFunction("qua_filter_termP", "QUA-FILTER-TERM?", 1, 1, false);
        declareFunction("qua_irrelevant_termP", "QUA-IRRELEVANT-TERM?", 2, 0, false);
        declareFunction("qua_lexifiedP", "QUA-LEXIFIED?", 1, 0, false);
        declareFunction("clear_qua_expansion_cycls", "CLEAR-QUA-EXPANSION-CYCLS", 0, 0, false);
        declareFunction("remove_qua_expansion_cycls", "REMOVE-QUA-EXPANSION-CYCLS", 1, 0, false);
        declareFunction("qua_expansion_cycls_internal", "QUA-EXPANSION-CYCLS-INTERNAL", 1, 0, false);
        declareFunction("qua_expansion_cycls", "QUA-EXPANSION-CYCLS", 1, 0, false);
        declareFunction("qua_expansion_strings", "QUA-EXPANSION-STRINGS", 1, 0, false);
        declareFunction("aq_term_related_terms", "AQ-TERM-RELATED-TERMS", 1, 0, false);
        declareFunction("aq_term_related_strings", "AQ-TERM-RELATED-STRINGS", 1, 0, false);
        declareFunction("aq_term_siblings", "AQ-TERM-SIBLINGS", 1, 0, false);
        declareFunction("clear_web_conceptually_related", "CLEAR-WEB-CONCEPTUALLY-RELATED", 0, 0, false);
        declareFunction("remove_web_conceptually_related", "REMOVE-WEB-CONCEPTUALLY-RELATED", 1, 1, false);
        declareFunction("web_conceptually_related_internal", "WEB-CONCEPTUALLY-RELATED-INTERNAL", 2, 0, false);
        declareFunction("web_conceptually_related", "WEB-CONCEPTUALLY-RELATED", 1, 1, false);
        declareFunction("aq_term_specs", "AQ-TERM-SPECS", 1, 0, false);
        declareFunction("aq_term_spec_strings", "AQ-TERM-SPEC-STRINGS", 1, 0, false);
        declareFunction("aq_term_genls", "AQ-TERM-GENLS", 1, 0, false);
        declareFunction("aq_term_genl_strings", "AQ-TERM-GENL-STRINGS", 1, 0, false);
        declareFunction("qua_speech_part_preds", "QUA-SPEECH-PART-PREDS", 0, 1, false);
        declareFunction("clear_qua_generate_phrase", "CLEAR-QUA-GENERATE-PHRASE", 0, 0, false);
        declareFunction("remove_qua_generate_phrase", "REMOVE-QUA-GENERATE-PHRASE", 1, 0, false);
        declareFunction("qua_generate_phrase_internal", "QUA-GENERATE-PHRASE-INTERNAL", 1, 0, false);
        declareFunction("qua_generate_phrase", "QUA-GENERATE-PHRASE", 1, 0, false);
        declareFunction("clear_qua_all_phrases_for_term", "CLEAR-QUA-ALL-PHRASES-FOR-TERM", 0, 0, false);
        declareFunction("remove_qua_all_phrases_for_term", "REMOVE-QUA-ALL-PHRASES-FOR-TERM", 1, 0, false);
        declareFunction("qua_all_phrases_for_term_internal", "QUA-ALL-PHRASES-FOR-TERM-INTERNAL", 1, 0, false);
        declareFunction("qua_all_phrases_for_term", "QUA-ALL-PHRASES-FOR-TERM", 1, 0, false);
        declareFunction("qua_all_phrases_for_term_as_string_list", "QUA-ALL-PHRASES-FOR-TERM-AS-STRING-LIST", 1, 0, false);
        declareFunction("clarifying_genls_strings", "CLARIFYING-GENLS-STRINGS", 2, 1, false);
        declareFunction("clarifying_differentiating_genls", "CLARIFYING-DIFFERENTIATING-GENLS", 2, 1, false);
        declareFunction("remove_stop_words_from_strings", "REMOVE-STOP-WORDS-FROM-STRINGS", 1, 0, false);
        declareFunction("negative_strings_for_term", "NEGATIVE-STRINGS-FOR-TERM", 1, 0, false);
        declareFunction("qua_strings_for_term_via_synsets", "QUA-STRINGS-FOR-TERM-VIA-SYNSETS", 1, 0, false);
        declareFunction("get_aq_term_disambig_options", "GET-AQ-TERM-DISAMBIG-OPTIONS", 1, 0, false);
        declareFunction("reset_aq_term_ambiguity", "RESET-AQ-TERM-AMBIGUITY", 1, 0, false);
        declareFunction("set_aq_term_possible_meanings", "SET-AQ-TERM-POSSIBLE-MEANINGS", 2, 0, false);
        declareFunction("set_aq_term_raw_meanings", "SET-AQ-TERM-RAW-MEANINGS", 2, 0, false);
        declareFunction("get_aq_term_possible_meanings", "GET-AQ-TERM-POSSIBLE-MEANINGS", 1, 0, false);
        declareFunction("set_aq_term_disfavored_meanings", "SET-AQ-TERM-DISFAVORED-MEANINGS", 2, 0, false);
        declareFunction("accept_meaning", "ACCEPT-MEANING", 2, 0, false);
        declareFunction("reject_meaning", "REJECT-MEANING", 2, 0, false);
        declareFunction("clear_qua_caches", "CLEAR-QUA-CACHES", 0, 0, false);
        declareFunction("get_query_url_for_sentence", "GET-QUERY-URL-FOR-SENTENCE", 1, 2, false);
        declareFunction("qua_query_string_for_cycl_sentence", "QUA-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 2, false);
        declareFunction("qua_query_for_cycl_sentence", "QUA-QUERY-FOR-CYCL-SENTENCE", 1, 2, false);
        declareFunction("qua_searchable_terms_from_cycl_sentence", "QUA-SEARCHABLE-TERMS-FROM-CYCL-SENTENCE", 1, 3, false);
        declareFunction("qua_term_from_sentenceP", "QUA-TERM-FROM-SENTENCE?", 1, 0, false);
        declareFunction("pred_with_no_nominal_lexesP", "PRED-WITH-NO-NOMINAL-LEXES?", 1, 1, false);
        declareFunction("terms_from_web_query", "TERMS-FROM-WEB-QUERY", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_qua_query_file_alt() {
        defparameter("*QUA-DEFAULT-SEARCH-ENGINE*", $ALTAVISTA);
        defparameter("*GOOGLE-STRING-COUNT-LIMIT*", $int$32);
        defparameter("*QUA-OPERATORS*", NIL);
        defparameter("*AUGMENTED-QUERY-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defparameter("*AUGMENTED-QUERY-DICT*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*AUGMENTED-QUERY-LEXICON*", NIL);
        defconstant("*DTP-AUGMENTED-QUERY*", AUGMENTED_QUERY);
        defparameter("*QUA-URL-TEMPLATES*", $list_alt43);
        defparameter("*AQ-TERM-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-AQ-TERM*", AQ_TERM);
        deflexical("*QUA-FILTER-TERM?-CACHING-STATE*", NIL);
        deflexical("*QUA-EXPANSION-CYCLS-CACHING-STATE*", NIL);
        deflexical("*WEB-CONCEPTUALLY-RELATED-CACHING-STATE*", NIL);
        defparameter("*QUA-SPEECH-PART-PREDS*", NIL);
        deflexical("*QUA-GENERATE-PHRASE-CACHING-STATE*", NIL);
        deflexical("*QUA-ALL-PHRASES-FOR-TERM-CACHING-STATE*", NIL);
        defparameter("*QUA-IGNORE-PREDS?*", NIL);
        defparameter("*QUA-GENERALITY-CUTOFF*", $int$400000);
        return NIL;
    }

    public static SubLObject init_qua_query_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*QUA-DEFAULT-SEARCH-ENGINE*", $ALTAVISTA);
            defparameter("*GOOGLE-STRING-COUNT-LIMIT*", $int$32);
            defparameter("*QUA-OPERATORS*", NIL);
            defparameter("*AUGMENTED-QUERY-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            defparameter("*AUGMENTED-QUERY-DICT*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            defparameter("*AUGMENTED-QUERY-LEXICON*", NIL);
            defconstant("*DTP-AUGMENTED-QUERY*", AUGMENTED_QUERY);
            defparameter("*QUA-URL-TEMPLATES*", $list49);
            defparameter("*AQ-TERM-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            defconstant("*DTP-AQ-TERM*", AQ_TERM);
            deflexical("*QUA-FILTER-TERM?-CACHING-STATE*", NIL);
            deflexical("*QUA-EXPANSION-CYCLS-CACHING-STATE*", NIL);
            deflexical("*WEB-CONCEPTUALLY-RELATED-CACHING-STATE*", NIL);
            defparameter("*QUA-SPEECH-PART-PREDS*", NIL);
            deflexical("*QUA-GENERATE-PHRASE-CACHING-STATE*", NIL);
            deflexical("*QUA-ALL-PHRASES-FOR-TERM-CACHING-STATE*", NIL);
            defparameter("*QUA-IGNORE-PREDS?*", NIL);
            defparameter("*QUA-GENERALITY-CUTOFF*", $int$400000);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*QUA-URL-TEMPLATES*", $list_alt43);
        }
        return NIL;
    }

    public static SubLObject init_qua_query_file_Previous() {
        defparameter("*QUA-DEFAULT-SEARCH-ENGINE*", $ALTAVISTA);
        defparameter("*GOOGLE-STRING-COUNT-LIMIT*", $int$32);
        defparameter("*QUA-OPERATORS*", NIL);
        defparameter("*AUGMENTED-QUERY-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defparameter("*AUGMENTED-QUERY-DICT*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*AUGMENTED-QUERY-LEXICON*", NIL);
        defconstant("*DTP-AUGMENTED-QUERY*", AUGMENTED_QUERY);
        defparameter("*QUA-URL-TEMPLATES*", $list49);
        defparameter("*AQ-TERM-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-AQ-TERM*", AQ_TERM);
        deflexical("*QUA-FILTER-TERM?-CACHING-STATE*", NIL);
        deflexical("*QUA-EXPANSION-CYCLS-CACHING-STATE*", NIL);
        deflexical("*WEB-CONCEPTUALLY-RELATED-CACHING-STATE*", NIL);
        defparameter("*QUA-SPEECH-PART-PREDS*", NIL);
        deflexical("*QUA-GENERATE-PHRASE-CACHING-STATE*", NIL);
        deflexical("*QUA-ALL-PHRASES-FOR-TERM-CACHING-STATE*", NIL);
        defparameter("*QUA-IGNORE-PREDS?*", NIL);
        defparameter("*QUA-GENERALITY-CUTOFF*", $int$400000);
        return NIL;
    }

    public static final SubLObject setup_qua_query_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_augmented_query$.getGlobalValue(), symbol_function(AUGMENTED_QUERY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(AQ_ORIGINAL_PHRASE, _CSETF_AQ_ORIGINAL_PHRASE);
        def_csetf(AQ_ID, _CSETF_AQ_ID);
        def_csetf(AQ_TOKENIZATIONS, _CSETF_AQ_TOKENIZATIONS);
        def_csetf(AQ_QUERY_STRING, _CSETF_AQ_QUERY_STRING);
        def_csetf($sym28$AQ_QUERY_STRING_STALE_, $sym29$_CSETF_AQ_QUERY_STRING_STALE_);
        def_csetf(AQ_SEARCH_ENGINE, _CSETF_AQ_SEARCH_ENGINE);
        identity(AUGMENTED_QUERY);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_aq_term$.getGlobalValue(), symbol_function(AQ_TERM_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(AQ_TERM_ID, _CSETF_AQ_TERM_ID);
        def_csetf(AQ_TERM_ORIGINAL_STRING, _CSETF_AQ_TERM_ORIGINAL_STRING);
        def_csetf(AQ_TERM_RAW_MEANINGS, _CSETF_AQ_TERM_RAW_MEANINGS);
        def_csetf(AQ_TERM_POSSIBLE_MEANINGS, _CSETF_AQ_TERM_POSSIBLE_MEANINGS);
        def_csetf(AQ_TERM_DISFAVORED_MEANINGS, _CSETF_AQ_TERM_DISFAVORED_MEANINGS);
        def_csetf(AQ_TERM_POSITIVE_STRINGS, _CSETF_AQ_TERM_POSITIVE_STRINGS);
        def_csetf(AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE, _CSETF_AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE);
        def_csetf($sym78$AQ_TERM_POSITIVE_STRINGS_STALE_, $sym79$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_);
        def_csetf(AQ_TERM_NEGATIVE_STRINGS, _CSETF_AQ_TERM_NEGATIVE_STRINGS);
        def_csetf(AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE, _CSETF_AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE);
        def_csetf($sym84$AQ_TERM_NEGATIVE_STRINGS_STALE_, $sym85$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_);
        identity(AQ_TERM);
        memoization_state.note_globally_cached_function($sym111$QUA_FILTER_TERM_);
        memoization_state.note_globally_cached_function(QUA_EXPANSION_CYCLS);
        memoization_state.note_globally_cached_function(WEB_CONCEPTUALLY_RELATED);
        memoization_state.note_globally_cached_function(QUA_GENERATE_PHRASE);
        memoization_state.note_globally_cached_function(QUA_ALL_PHRASES_FOR_TERM);
        define_test_case_table_int(QUA_SEARCHABLE_TERMS_FROM_CYCL_SENTENCE, list(new SubLObject[]{ $TEST, symbol_function(SETS_EQUALP), $OWNER, $$$baxter, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt170);
        return NIL;
    }

    public static SubLObject setup_qua_query_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_augmented_query$.getGlobalValue(), symbol_function(AUGMENTED_QUERY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list20);
            def_csetf(AQ_ORIGINAL_PHRASE, _CSETF_AQ_ORIGINAL_PHRASE);
            def_csetf(AQ_ID, _CSETF_AQ_ID);
            def_csetf(AQ_TOKENIZATIONS, _CSETF_AQ_TOKENIZATIONS);
            def_csetf(AQ_QUERY_STRING, _CSETF_AQ_QUERY_STRING);
            def_csetf($sym29$AQ_QUERY_STRING_STALE_, $sym30$_CSETF_AQ_QUERY_STRING_STALE_);
            def_csetf(AQ_SEARCH_ENGINE, _CSETF_AQ_SEARCH_ENGINE);
            identity(AUGMENTED_QUERY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_augmented_query$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AUGMENTED_QUERY_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_aq_term$.getGlobalValue(), symbol_function(AQ_TERM_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list70);
            def_csetf(AQ_TERM_ID, _CSETF_AQ_TERM_ID);
            def_csetf(AQ_TERM_ORIGINAL_STRING, _CSETF_AQ_TERM_ORIGINAL_STRING);
            def_csetf(AQ_TERM_RAW_MEANINGS, _CSETF_AQ_TERM_RAW_MEANINGS);
            def_csetf(AQ_TERM_POSSIBLE_MEANINGS, _CSETF_AQ_TERM_POSSIBLE_MEANINGS);
            def_csetf(AQ_TERM_DISFAVORED_MEANINGS, _CSETF_AQ_TERM_DISFAVORED_MEANINGS);
            def_csetf(AQ_TERM_POSITIVE_STRINGS, _CSETF_AQ_TERM_POSITIVE_STRINGS);
            def_csetf(AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE, _CSETF_AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE);
            def_csetf($sym85$AQ_TERM_POSITIVE_STRINGS_STALE_, $sym86$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_);
            def_csetf(AQ_TERM_NEGATIVE_STRINGS, _CSETF_AQ_TERM_NEGATIVE_STRINGS);
            def_csetf(AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE, _CSETF_AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE);
            def_csetf($sym91$AQ_TERM_NEGATIVE_STRINGS_STALE_, $sym92$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_);
            identity(AQ_TERM);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_aq_term$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AQ_TERM_METHOD));
            memoization_state.note_globally_cached_function($sym120$QUA_FILTER_TERM_);
            memoization_state.note_globally_cached_function(QUA_EXPANSION_CYCLS);
            memoization_state.note_globally_cached_function(WEB_CONCEPTUALLY_RELATED);
            memoization_state.note_globally_cached_function(QUA_GENERATE_PHRASE);
            memoization_state.note_globally_cached_function(QUA_ALL_PHRASES_FOR_TERM);
            define_test_case_table_int(QUA_SEARCHABLE_TERMS_FROM_CYCL_SENTENCE, list(new SubLObject[]{ $TEST, symbol_function(SETS_EQUALP), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list172);
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym28$AQ_QUERY_STRING_STALE_, $sym29$_CSETF_AQ_QUERY_STRING_STALE_);
            def_csetf($sym78$AQ_TERM_POSITIVE_STRINGS_STALE_, $sym79$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_);
            def_csetf($sym84$AQ_TERM_NEGATIVE_STRINGS_STALE_, $sym85$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_);
            memoization_state.note_globally_cached_function($sym111$QUA_FILTER_TERM_);
            define_test_case_table_int(QUA_SEARCHABLE_TERMS_FROM_CYCL_SENTENCE, list(new SubLObject[]{ $TEST, symbol_function(SETS_EQUALP), $OWNER, $$$baxter, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt170);
        }
        return NIL;
    }

    public static SubLObject setup_qua_query_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_augmented_query$.getGlobalValue(), symbol_function(AUGMENTED_QUERY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list20);
        def_csetf(AQ_ORIGINAL_PHRASE, _CSETF_AQ_ORIGINAL_PHRASE);
        def_csetf(AQ_ID, _CSETF_AQ_ID);
        def_csetf(AQ_TOKENIZATIONS, _CSETF_AQ_TOKENIZATIONS);
        def_csetf(AQ_QUERY_STRING, _CSETF_AQ_QUERY_STRING);
        def_csetf($sym29$AQ_QUERY_STRING_STALE_, $sym30$_CSETF_AQ_QUERY_STRING_STALE_);
        def_csetf(AQ_SEARCH_ENGINE, _CSETF_AQ_SEARCH_ENGINE);
        identity(AUGMENTED_QUERY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_augmented_query$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AUGMENTED_QUERY_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_aq_term$.getGlobalValue(), symbol_function(AQ_TERM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list70);
        def_csetf(AQ_TERM_ID, _CSETF_AQ_TERM_ID);
        def_csetf(AQ_TERM_ORIGINAL_STRING, _CSETF_AQ_TERM_ORIGINAL_STRING);
        def_csetf(AQ_TERM_RAW_MEANINGS, _CSETF_AQ_TERM_RAW_MEANINGS);
        def_csetf(AQ_TERM_POSSIBLE_MEANINGS, _CSETF_AQ_TERM_POSSIBLE_MEANINGS);
        def_csetf(AQ_TERM_DISFAVORED_MEANINGS, _CSETF_AQ_TERM_DISFAVORED_MEANINGS);
        def_csetf(AQ_TERM_POSITIVE_STRINGS, _CSETF_AQ_TERM_POSITIVE_STRINGS);
        def_csetf(AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE, _CSETF_AQ_TERM_POSITIVE_TERMS_IN_UPWARD_CLOSURE);
        def_csetf($sym85$AQ_TERM_POSITIVE_STRINGS_STALE_, $sym86$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_);
        def_csetf(AQ_TERM_NEGATIVE_STRINGS, _CSETF_AQ_TERM_NEGATIVE_STRINGS);
        def_csetf(AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE, _CSETF_AQ_TERM_NEGATIVE_TERMS_IN_UPWARD_CLOSURE);
        def_csetf($sym91$AQ_TERM_NEGATIVE_STRINGS_STALE_, $sym92$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_);
        identity(AQ_TERM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_aq_term$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AQ_TERM_METHOD));
        memoization_state.note_globally_cached_function($sym120$QUA_FILTER_TERM_);
        memoization_state.note_globally_cached_function(QUA_EXPANSION_CYCLS);
        memoization_state.note_globally_cached_function(WEB_CONCEPTUALLY_RELATED);
        memoization_state.note_globally_cached_function(QUA_GENERATE_PHRASE);
        memoization_state.note_globally_cached_function(QUA_ALL_PHRASES_FOR_TERM);
        define_test_case_table_int(QUA_SEARCHABLE_TERMS_FROM_CYCL_SENTENCE, list(new SubLObject[]{ $TEST, symbol_function(SETS_EQUALP), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list172);
        return NIL;
    }

    static private final SubLList $list_alt14 = list(makeSymbol("ORIGINAL-PHRASE"), makeSymbol("ID"), makeSymbol("TOKENIZATIONS"), makeSymbol("QUERY-STRING"), makeSymbol("QUERY-STRING-STALE?"), makeSymbol("SEARCH-ENGINE"));

    static private final SubLList $list_alt15 = list(makeKeyword("ORIGINAL-PHRASE"), makeKeyword("ID"), makeKeyword("TOKENIZATIONS"), makeKeyword("QUERY-STRING"), makeKeyword("QUERY-STRING-STALE?"), makeKeyword("SEARCH-ENGINE"));

    static private final SubLList $list_alt16 = list(makeSymbol("AQ-ORIGINAL-PHRASE"), makeSymbol("AQ-ID"), makeSymbol("AQ-TOKENIZATIONS"), makeSymbol("AQ-QUERY-STRING"), makeSymbol("AQ-QUERY-STRING-STALE?"), makeSymbol("AQ-SEARCH-ENGINE"));

    static private final SubLList $list_alt17 = list(makeSymbol("_CSETF-AQ-ORIGINAL-PHRASE"), makeSymbol("_CSETF-AQ-ID"), makeSymbol("_CSETF-AQ-TOKENIZATIONS"), makeSymbol("_CSETF-AQ-QUERY-STRING"), makeSymbol("_CSETF-AQ-QUERY-STRING-STALE?"), makeSymbol("_CSETF-AQ-SEARCH-ENGINE"));

    @Override
    public void declareFunctions() {
        declare_qua_query_file();
    }

    @Override
    public void initializeVariables() {
        init_qua_query_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_qua_query_file();
    }

    static {
    }

    static private final SubLSymbol $sym28$AQ_QUERY_STRING_STALE_ = makeSymbol("AQ-QUERY-STRING-STALE?");

    static private final SubLSymbol $sym29$_CSETF_AQ_QUERY_STRING_STALE_ = makeSymbol("_CSETF-AQ-QUERY-STRING-STALE?");

    public static final SubLSymbol $kw36$QUERY_STRING_STALE_ = makeKeyword("QUERY-STRING-STALE?");

    static private final SubLString $str_alt38$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt39$_augmented_query__A__S__S_ = makeString("<augmented-query-~A:~S:~S>");

    static private final SubLList $list_alt41 = list(makeKeyword("OR"), makeSymbol("OR"), makeKeyword("AND"), NIL);

    static private final SubLList $list_alt42 = list(makeKeyword("OR"), makeSymbol("OR"), makeKeyword("AND"), makeSymbol("AND"));

    static private final SubLList $list_alt43 = list(makeKeyword("ALTAVISTA"), makeString("http://www.altavista.com/web/results?q=SEARCH-STRING&kgs=1&kls=0&nbq=ANSWER-COUNT"), makeKeyword("GOOGLE"), makeString("http://www.google.com/search?hl=en&q=SEARCH-STRING&btnG=Google+Search&num=ANSWER-COUNT"));

    static private final SubLString $str_alt45$ANSWER_COUNT = makeString("ANSWER-COUNT");

    static private final SubLString $str_alt46$SEARCH_STRING = makeString("SEARCH-STRING");

    static private final SubLString $str_alt47$_A = makeString("~A");

    static private final SubLString $str_alt51$_ = makeString("\"");

    static private final SubLList $list_alt55 = list(reader_make_constant_shell("nonPlural-Generic"));

    static private final SubLList $list_alt58 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("ORIGINAL-STRING"), makeSymbol("RAW-MEANINGS"), makeSymbol("POSSIBLE-MEANINGS"), makeSymbol("DISFAVORED-MEANINGS"), makeSymbol("POSITIVE-STRINGS"), makeSymbol("POSITIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("POSITIVE-STRINGS-STALE?"), makeSymbol("NEGATIVE-STRINGS"), makeSymbol("NEGATIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("NEGATIVE-STRINGS-STALE?") });

    public static final class $augmented_query_p$UnaryFunction extends UnaryFunction {
        public $augmented_query_p$UnaryFunction() {
            super(extractFunctionNamed("AUGMENTED-QUERY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return augmented_query_p(arg1);
        }
    }

    static private final SubLList $list_alt59 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("ORIGINAL-STRING"), makeKeyword("RAW-MEANINGS"), makeKeyword("POSSIBLE-MEANINGS"), makeKeyword("DISFAVORED-MEANINGS"), makeKeyword("POSITIVE-STRINGS"), makeKeyword("POSITIVE-TERMS-IN-UPWARD-CLOSURE"), makeKeyword("POSITIVE-STRINGS-STALE?"), makeKeyword("NEGATIVE-STRINGS"), makeKeyword("NEGATIVE-TERMS-IN-UPWARD-CLOSURE"), makeKeyword("NEGATIVE-STRINGS-STALE?") });

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeSymbol("AQ-TERM-ID"), makeSymbol("AQ-TERM-ORIGINAL-STRING"), makeSymbol("AQ-TERM-RAW-MEANINGS"), makeSymbol("AQ-TERM-POSSIBLE-MEANINGS"), makeSymbol("AQ-TERM-DISFAVORED-MEANINGS"), makeSymbol("AQ-TERM-POSITIVE-STRINGS"), makeSymbol("AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("AQ-TERM-POSITIVE-STRINGS-STALE?"), makeSymbol("AQ-TERM-NEGATIVE-STRINGS"), makeSymbol("AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("AQ-TERM-NEGATIVE-STRINGS-STALE?") });

    static private final SubLList $list_alt61 = list(new SubLObject[]{ makeSymbol("_CSETF-AQ-TERM-ID"), makeSymbol("_CSETF-AQ-TERM-ORIGINAL-STRING"), makeSymbol("_CSETF-AQ-TERM-RAW-MEANINGS"), makeSymbol("_CSETF-AQ-TERM-POSSIBLE-MEANINGS"), makeSymbol("_CSETF-AQ-TERM-DISFAVORED-MEANINGS"), makeSymbol("_CSETF-AQ-TERM-POSITIVE-STRINGS"), makeSymbol("_CSETF-AQ-TERM-POSITIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?"), makeSymbol("_CSETF-AQ-TERM-NEGATIVE-STRINGS"), makeSymbol("_CSETF-AQ-TERM-NEGATIVE-TERMS-IN-UPWARD-CLOSURE"), makeSymbol("_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?") });

    static private final SubLSymbol $sym78$AQ_TERM_POSITIVE_STRINGS_STALE_ = makeSymbol("AQ-TERM-POSITIVE-STRINGS-STALE?");

    static private final SubLSymbol $sym79$_CSETF_AQ_TERM_POSITIVE_STRINGS_STALE_ = makeSymbol("_CSETF-AQ-TERM-POSITIVE-STRINGS-STALE?");

    static private final SubLSymbol $sym84$AQ_TERM_NEGATIVE_STRINGS_STALE_ = makeSymbol("AQ-TERM-NEGATIVE-STRINGS-STALE?");

    static private final SubLSymbol $sym85$_CSETF_AQ_TERM_NEGATIVE_STRINGS_STALE_ = makeSymbol("_CSETF-AQ-TERM-NEGATIVE-STRINGS-STALE?");

    public static final SubLSymbol $kw92$POSITIVE_STRINGS_STALE_ = makeKeyword("POSITIVE-STRINGS-STALE?");

    public static final SubLSymbol $kw95$NEGATIVE_STRINGS_STALE_ = makeKeyword("NEGATIVE-STRINGS-STALE?");

    static private final SubLString $str_alt96$_aq_token___S__S__S_ = makeString("<aq-token: ~S ~S ~S>");

    public static final class $aq_term_p$UnaryFunction extends UnaryFunction {
        public $aq_term_p$UnaryFunction() {
            super(extractFunctionNamed("AQ-TERM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return aq_term_p(arg1);
        }
    }

    static private final SubLSymbol $sym107$_PREFERRED = makeSymbol("?PREFERRED");

    static private final SubLList $list_alt108 = list(makeSymbol("?PREFERRED"));

    static private final SubLSymbol $sym111$QUA_FILTER_TERM_ = makeSymbol("QUA-FILTER-TERM?");

    static private final SubLSymbol $sym112$_QUA_FILTER_TERM__CACHING_STATE_ = makeSymbol("*QUA-FILTER-TERM?-CACHING-STATE*");

    public static final SubLSymbol $kw114$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject $const120$ProvideTerseExpansions_IRExpansio = reader_make_constant_shell("ProvideTerseExpansions-IRExpansionStrategy");

    static private final SubLList $list_alt129 = list(makeKeyword("RELATED"));

    static private final SubLList $list_alt130 = list(makeKeyword("MAX-NUMBER"), makeInteger(30), makeKeyword("MAX-TIME"), makeInteger(30));

    static private final SubLSymbol $sym132$_INST = makeSymbol("?INST");

    static private final SubLList $list_alt136 = list(makeSymbol("NL-GENERATION-CACHE-METHOD"));

    static private final SubLString $str_alt137$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt138$__ = makeString(") ");

    static private final SubLString $str_alt139$_is_not_a_ = makeString(" is not a ");

    static private final SubLList $list_alt144 = list(makeKeyword("ACRONYMS"));

    static private final SubLString $str_alt146$__ = makeString(", ");

    static private final SubLSymbol $sym150$QUA_TERM_FROM_SENTENCE_ = makeSymbol("QUA-TERM-FROM-SENTENCE?");

    static private final SubLString $str_alt152$Pushing__S_because_it_is_not_a_ge = makeString("Pushing ~S because it is not a general term (~A) or pred with no nominal lexes (~A).~%");

    static private final SubLString $str_alt153$This_term_is_a_naut___A__ = makeString("This term is a naut: ~A~%");

    static private final SubLString $str_alt155$Either_the_term_is_not_lexified_o = makeString("Either the term is not lexified or the functor is inappropriate for a search string: ~A~%");

    static private final SubLString $str_alt156$Recursing_on__A__ = makeString("Recursing on ~A~%");

    static private final SubLList $list_alt159 = list(reader_make_constant_shell("nounStrings"), makeSymbol("?X"));

    static private final SubLList $list_alt160 = list(reader_make_constant_shell("nameString"), makeSymbol("?X"));

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt170 = list(new SubLObject[]{ list(list(reader_make_constant_shell("GeorgeWBush")), list(reader_make_constant_shell("GeorgeWBush"))), list(list(reader_make_constant_shell("Person")), list(reader_make_constant_shell("Person"))), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("Dog"))), list(list(list(reader_make_constant_shell("MotherFn"), reader_make_constant_shell("ChelseaClinton"))), list(reader_make_constant_shell("ChelseaClinton"))), list(list(list(reader_make_constant_shell("YearFn"), makeInteger(2006))), list(list(reader_make_constant_shell("YearFn"), makeInteger(2006)))), list(list(list(reader_make_constant_shell("TheSet"), reader_make_constant_shell("Cat"), reader_make_constant_shell("Dog"))), list(reader_make_constant_shell("Cat"), reader_make_constant_shell("Dog"))), list(list(list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog")))), list(reader_make_constant_shell("Dog"))), list(list(list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Dog"))))), list(reader_make_constant_shell("Cat"), reader_make_constant_shell("Dog"))), list(list(list(reader_make_constant_shell("CollectionSubsetFn"), reader_make_constant_shell("CriminalOrganization"), list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("residenceOfOrganization"), makeSymbol("?X"), reader_make_constant_shell("Russia"))))), list(reader_make_constant_shell("CriminalOrganization"), reader_make_constant_shell("Russia"))), list(list(list(reader_make_constant_shell("PlusAll"), list(reader_make_constant_shell("TheSet"), list(reader_make_constant_shell("Kilogram"), FOUR_INTEGER), list(reader_make_constant_shell("Kilogram"), NINE_INTEGER)), reader_make_constant_shell("SquareRootFn"))), list(list(reader_make_constant_shell("Kilogram"), FOUR_INTEGER), list(reader_make_constant_shell("Kilogram"), NINE_INTEGER))), list(list(list(reader_make_constant_shell("CollectionSubsetFn"), reader_make_constant_shell("CarBombing"), list(reader_make_constant_shell("TheSetOf"), makeSymbol("?X"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Iraq"))))), list(reader_make_constant_shell("CarBombing"), reader_make_constant_shell("eventOccursAt"), reader_make_constant_shell("Iraq"))), list(list(list(reader_make_constant_shell("FunctionToArg"), TWO_INTEGER, reader_make_constant_shell("eventOccursAt"))), list(reader_make_constant_shell("eventOccursAt"))) });
}

/**
 * Total time: 608 ms
 */
