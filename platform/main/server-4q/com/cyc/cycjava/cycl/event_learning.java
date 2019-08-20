/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.remove_el_duplicates;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EVENT-LEARNING
 * source file: /cyc/top/cycl/event-learning.lisp
 * created:     2019/07/03 17:38:59
 */
public final class event_learning extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt33$ = makeString("");

    public static final SubLFile me = new event_learning();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $event_finding_query_mt$ = makeSymbol("*EVENT-FINDING-QUERY-MT*");

    // defparameter
    @LispMethod(comment = "for development use, it can be useful to set this to nil\ndefparameter")
    private static final SubLSymbol $event_learning_indexes_templates$ = makeSymbol("*EVENT-LEARNING-INDEXES-TEMPLATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $event_learning_cyclist$ = makeSymbol("*EVENT-LEARNING-CYCLIST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $event_learner_head_mt$ = makeSymbol("*EVENT-LEARNER-HEAD-MT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_event_document$ = makeSymbol("*DTP-EVENT-DOCUMENT*");

    // defparameter
    // If more than or equal to n documents mention it, this is not helping.
    /**
     * If more than or equal to n documents mention it, this is not helping.
     */
    @LispMethod(comment = "If more than or equal to n documents mention it, this is not helping.\ndefparameter")
    public static final SubLSymbol $search_term_relevancy_too_high$ = makeSymbol("*SEARCH-TERM-RELEVANCY-TOO-HIGH*");

    // defparameter
    // If less than or equal to n documents mention it, this is too obscure.
    /**
     * If less than or equal to n documents mention it, this is too obscure.
     */
    @LispMethod(comment = "If less than or equal to n documents mention it, this is too obscure.\ndefparameter")
    public static final SubLSymbol $search_term_relevancy_too_low$ = makeSymbol("*SEARCH-TERM-RELEVANCY-TOO-LOW*");

    // defparameter
    /**
     * If this many or fewer (but more than too low) are selected, this is
     * excellent.
     */
    @LispMethod(comment = "If this many or fewer (but more than too low) are selected, this is\r\nexcellent.\ndefparameter\nIf this many or fewer (but more than too low) are selected, this is\nexcellent.")
    public static final SubLSymbol $search_term_relevancy_accept$ = makeSymbol("*SEARCH-TERM-RELEVANCY-ACCEPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $subevents$ = makeSymbol("*SUBEVENTS*");







    private static final SubLSymbol EVENT_DOCUMENT = makeSymbol("EVENT-DOCUMENT");

    private static final SubLSymbol EVENT_DOCUMENT_P = makeSymbol("EVENT-DOCUMENT-P");

    static private final SubLList $list5 = list(makeSymbol("CYCL"), makeSymbol("URL"), makeSymbol("STRING"), makeSymbol("HTML-STRING"));

    static private final SubLList $list6 = list($CYCL, makeKeyword("URL"), makeKeyword("STRING"), makeKeyword("HTML-STRING"));

    static private final SubLList $list7 = list(makeSymbol("EVENT-DOC-CYCL"), makeSymbol("EVENT-DOC-URL"), makeSymbol("EVENT-DOC-STRING"), makeSymbol("EVENT-DOC-HTML-STRING"));

    static private final SubLList $list8 = list(makeSymbol("_CSETF-EVENT-DOC-CYCL"), makeSymbol("_CSETF-EVENT-DOC-URL"), makeSymbol("_CSETF-EVENT-DOC-STRING"), makeSymbol("_CSETF-EVENT-DOC-HTML-STRING"));

    private static final SubLSymbol EVENT_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVENT-DOCUMENT-P"));

    private static final SubLSymbol EVENT_DOC_CYCL = makeSymbol("EVENT-DOC-CYCL");

    private static final SubLSymbol _CSETF_EVENT_DOC_CYCL = makeSymbol("_CSETF-EVENT-DOC-CYCL");

    private static final SubLSymbol EVENT_DOC_URL = makeSymbol("EVENT-DOC-URL");

    private static final SubLSymbol _CSETF_EVENT_DOC_URL = makeSymbol("_CSETF-EVENT-DOC-URL");

    private static final SubLSymbol EVENT_DOC_STRING = makeSymbol("EVENT-DOC-STRING");

    private static final SubLSymbol _CSETF_EVENT_DOC_STRING = makeSymbol("_CSETF-EVENT-DOC-STRING");

    private static final SubLSymbol EVENT_DOC_HTML_STRING = makeSymbol("EVENT-DOC-HTML-STRING");

    private static final SubLSymbol _CSETF_EVENT_DOC_HTML_STRING = makeSymbol("_CSETF-EVENT-DOC-HTML-STRING");

    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_EVENT_DOCUMENT = makeSymbol("MAKE-EVENT-DOCUMENT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVENT_DOCUMENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-DOCUMENT-METHOD");









    private static final SubLList $list34 = list(reader_make_constant_shell("EBMT-EnglishToCycL"));

    private static final SubLList $list35 = list(list(makeSymbol("SENTENCE-VAR"), makeSymbol("DOC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SENTENCIFY_STRING = makeSymbol("SENTENCIFY-STRING");

    private static final SubLSymbol GET_EVENT_DOC_STRING = makeSymbol("GET-EVENT-DOC-STRING");

    private static final SubLString $str39$ = makeString("");

    private static final SubLString $str41$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLObject $$facilitates_EventEvent = reader_make_constant_shell("facilitates-EventEvent");

    private static final SubLString $str45$Invalid_search_direction__A__no_o = makeString("Invalid search direction ~A: no other direction is currently imlemented.");



    private static final SubLList $list50 = list(list(makeSymbol("CURRENT"), makeSymbol("EVENT-GRAPH"), makeSymbol("&KEY"), list(makeSymbol("DIRECTION"), makeKeyword("NOT-PROVIDED"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list51 = list(makeKeyword("DIRECTION"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym54$LINKED = makeUninternedSymbol("LINKED");

    private static final SubLSymbol $sym55$EVENT_ROOT = makeUninternedSymbol("EVENT-ROOT");

    private static final SubLSymbol $sym56$THE_DIRECTION = makeUninternedSymbol("THE-DIRECTION");

    static private final SubLList $list59 = list(makeKeyword("NOT-PROVIDED"));

    private static final SubLString $str64$Cannot_walk_event_graph_generated = makeString("Cannot walk event graph generated in direction ~A in direction ~A.~%");

    static private final SubLList $list65 = list(makeKeyword("SEED-EVENT"));

    private static final SubLSymbol WALK_GRAPH_BREADTH_FIRST = makeSymbol("WALK-GRAPH-BREADTH-FIRST");

    private static final SubLSymbol GET_ALL_SUBEVENTS = makeSymbol("GET-ALL-SUBEVENTS");

    private static final SubLSymbol $sym68$_EVENT = makeSymbol("?EVENT");



    private static final SubLList $list70 = list(makeSymbol("?EVENT"));

    private static final SubLList $list71 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    private static final SubLSymbol $get_all_subevents_caching_state$ = makeSymbol("*GET-ALL-SUBEVENTS-CACHING-STATE*");

    private static final SubLSymbol GET_ALL_SCRIPTED_SUBEVENT_TYPES = makeSymbol("GET-ALL-SCRIPTED-SUBEVENT-TYPES");

    private static final SubLSymbol $sym74$_SUB_TYPE = makeSymbol("?SUB-TYPE");





    private static final SubLList $list77 = list(makeSymbol("?TYPE"));

    private static final SubLList $list78 = list(list(reader_make_constant_shell("thereExists"), makeSymbol("?DIRECT-SUB-TYPE"), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("candidateProperSubSituationTypes"), makeSymbol("?TYPE"), makeSymbol("?SUB-TYPE")), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("candidateProperSubSituationTypes"), makeSymbol("?TYPE"), makeSymbol("?DIRECT-SUB-TYPE")), list(reader_make_constant_shell("candidateProperSubSituationTypes"), makeSymbol("?DIRECT-SUB-TYPE"), makeSymbol("?SUB-TYPE"))))));

    private static final SubLSymbol $get_all_scripted_subevent_types_caching_state$ = makeSymbol("*GET-ALL-SCRIPTED-SUBEVENT-TYPES-CACHING-STATE*");

    private static final SubLList $list81 = list(makeSymbol("TERM"), makeSymbol("COUNT"), makeSymbol("SEARCH-TERM"));

    private static final SubLSymbol $sym82$_ = makeSymbol(">");

    private static final SubLSymbol $sym84$_ = makeSymbol("<");

    private static final SubLString $str86$Cyc_rejected___S = makeString("Cyc rejected: ~S");

    private static final SubLSymbol $sym88$_MT = makeSymbol("?MT");



    private static final SubLList $list90 = list(makeSymbol("?MT"));

    private static final SubLString $str91$No_semantic_MT_found_for__S__retu = makeString("No semantic MT found for ~S, returning default value: ~S");

    private static final SubLSymbol $sym92$_SPINDLE = makeSymbol("?SPINDLE");



    private static final SubLString $str94$Added__S_new_templates_to_the_EBM = makeString("Added ~S new templates to the EBMT Template Index");









    private static final SubLSymbol WEBSTORE_INDEX_DOC_COUNT = makeSymbol("WEBSTORE-INDEX-DOC-COUNT");

    private static final SubLList $list103 = list(reader_make_constant_shell("HoursDuration"), ONE_INTEGER);



    private static final SubLSymbol $sym105$_HEAD = makeSymbol("?HEAD");



    private static final SubLList $list107 = list(makeSymbol("?HEAD"));



    private static final SubLString $str109$Failed_to_assert___S_in__S = makeString("Failed to assert: ~S in ~S");

    private static final SubLSymbol INDEXICAL_P = makeSymbol("INDEXICAL-P");

    static private final SubLList $list111 = list(makeSymbol("FACT"), makeSymbol("MARKER-STRINGS"));

    private static final SubLList $list112 = list(new SubLObject[]{ CHAR_comma, CHAR_period, CHAR_question, CHAR_exclamation, CHAR_semicolon, CHAR_colon, CHAR_lparen, CHAR_rparen, CHAR_hyphen });

    private static final SubLSymbol $sym113$PROPER_SUPERSTRING_ = makeSymbol("PROPER-SUPERSTRING?");

    private static final SubLList $list115 = list(makeKeyword("ACRONYMS"));



    private static final SubLSymbol GENERATE_ENGLISH_DAY_NAUT = makeSymbol("GENERATE-ENGLISH-DAY-NAUT");





    private static final SubLSymbol CYCL_EVENT_P = makeSymbol("CYCL-EVENT-P");

    private static final SubLSymbol GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES = makeSymbol("GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES");

    private static final SubLList $list123 = list(makeSymbol("EVENT-TYPE"), makeSymbol("DIFFERENTIATED-GENLS"));

    private static final SubLSymbol $sym124$_STRING = makeSymbol("?STRING");



    private static final SubLList $list126 = list(reader_make_constant_shell("wordStrings"), makeSymbol("?STRING"));



    private static final SubLList $list128 = list(makeSymbol("EVENT-TYPE"), makeSymbol("PHRASES"));

    private static final SubLSymbol $get_phrases_for_differentiated_event_types_caching_state$ = makeSymbol("*GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES-CACHING-STATE*");

    private static final SubLSymbol DIFFERENTIATING_GENLS = makeSymbol("DIFFERENTIATING-GENLS");



    private static final SubLList $list133 = list($GENL);





    private static final SubLSymbol $sym136$_OTHER_TYPE = makeSymbol("?OTHER-TYPE");





    private static final SubLList $list139 = list(list(reader_make_constant_shell("genls"), makeSymbol("?OTHER-TYPE"), $GENL));

    private static final SubLSymbol $differentiating_genls_caching_state$ = makeSymbol("*DIFFERENTIATING-GENLS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_DIFFERENTIATING_GENLS = makeSymbol("CLEAR-DIFFERENTIATING-GENLS");

    private static final SubLString $str144$__ = makeString("~~");

    private static final SubLString $str145$_ = makeString("~");

    private static final SubLSymbol $sym148$LAMBDA_SUBEVENT_ = makeSymbol("LAMBDA-SUBEVENT?");



    private static final SubLString $str150$No_substitution_done_for__S = makeString("No substitution done for ~S");

    private static final SubLList $list151 = list(makeString("kidnapping"), makeString("ransom"));

    private static final SubLList $list153 = list(reader_make_constant_shell("crimeVictim"), reader_make_constant_shell("agentCaptured"), reader_make_constant_shell("perpetrator"), reader_make_constant_shell("performedBy"), reader_make_constant_shell("dateOfEvent"), reader_make_constant_shell("eventOccursAt"));

    private static final SubLSymbol GREATER_LENGTH_P = makeSymbol("GREATER-LENGTH-P");

    private static final SubLList $list155 = cons(makeSymbol("EVENT"), makeSymbol("FACTS"));

    private static final SubLString $str156$Failed_to_assert__S_in__S_because = makeString("Failed to assert ~S in ~S because: ~%~S");

    private static final SubLString $$$GatheredEvent = makeString("GatheredEvent");

    private static final SubLString $str159$Failed_to_assert___S_in__S__ = makeString("Failed to assert: ~S in ~S~%");

    private static final SubLString $str160$NOT_WFF___S__ = makeString("NOT-WFF: ~S~%");

    private static final SubLString $str162$_s_is_not_present_in_input_linkag = makeString("~s is not present in input linkage~% Words: ~S");

    private static final SubLSymbol LINK_P = makeSymbol("LINK-P");

    public static final SubLObject event_document_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject event_document_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_learning.$event_document_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject event_document_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_learning.$event_document_native.class ? T : NIL;
    }

    public static final SubLObject event_doc_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_DOCUMENT_P);
        return v_object.getField2();
    }

    public static SubLObject event_doc_cycl(final SubLObject v_object) {
        assert NIL != event_document_p(v_object) : "! event_learning.event_document_p(v_object) " + "event_learning.event_document_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject event_doc_url_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_DOCUMENT_P);
        return v_object.getField3();
    }

    public static SubLObject event_doc_url(final SubLObject v_object) {
        assert NIL != event_document_p(v_object) : "! event_learning.event_document_p(v_object) " + "event_learning.event_document_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject event_doc_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_DOCUMENT_P);
        return v_object.getField4();
    }

    public static SubLObject event_doc_string(final SubLObject v_object) {
        assert NIL != event_document_p(v_object) : "! event_learning.event_document_p(v_object) " + "event_learning.event_document_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject event_doc_html_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_DOCUMENT_P);
        return v_object.getField5();
    }

    public static SubLObject event_doc_html_string(final SubLObject v_object) {
        assert NIL != event_document_p(v_object) : "! event_learning.event_document_p(v_object) " + "event_learning.event_document_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_event_doc_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_DOCUMENT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_doc_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_document_p(v_object) : "! event_learning.event_document_p(v_object) " + "event_learning.event_document_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_event_doc_url_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_DOCUMENT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_doc_url(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_document_p(v_object) : "! event_learning.event_document_p(v_object) " + "event_learning.event_document_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_event_doc_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_DOCUMENT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_event_doc_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_document_p(v_object) : "! event_learning.event_document_p(v_object) " + "event_learning.event_document_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_event_doc_html_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_DOCUMENT_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_event_doc_html_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_document_p(v_object) : "! event_learning.event_document_p(v_object) " + "event_learning.event_document_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_event_document_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.event_learning.$event_document_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL)) {
                        _csetf_event_doc_cycl(v_new, current_value);
                    } else {
                        if (pcase_var.eql($URL)) {
                            _csetf_event_doc_url(v_new, current_value);
                        } else {
                            if (pcase_var.eql($STRING)) {
                                _csetf_event_doc_string(v_new, current_value);
                            } else {
                                if (pcase_var.eql($HTML_STRING)) {
                                    _csetf_event_doc_html_string(v_new, current_value);
                                } else {
                                    Errors.error($str_alt23$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_event_document(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.event_learning.$event_document_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL)) {
                _csetf_event_doc_cycl(v_new, current_value);
            } else
                if (pcase_var.eql($URL)) {
                    _csetf_event_doc_url(v_new, current_value);
                } else
                    if (pcase_var.eql($STRING)) {
                        _csetf_event_doc_string(v_new, current_value);
                    } else
                        if (pcase_var.eql($HTML_STRING)) {
                            _csetf_event_doc_html_string(v_new, current_value);
                        } else {
                            Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_document(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVENT_DOCUMENT, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL, event_doc_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $URL, event_doc_url(obj));
        funcall(visitor_fn, obj, $SLOT, $STRING, event_doc_string(obj));
        funcall(visitor_fn, obj, $SLOT, $HTML_STRING, event_doc_html_string(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVENT_DOCUMENT, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_document_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_document(obj, visitor_fn);
    }

    /**
     *
     *
     * @param URL
    stringp;
     * 		
     * @param STRING
     * 		stringp; the string-y version of URL
     * @return XXX
     */
    @LispMethod(comment = "@param URL\nstringp;\r\n\t\t\r\n@param STRING\r\n\t\tstringp; the string-y version of URL\r\n@return XXX")
    public static final SubLObject new_event_document_alt(SubLObject url, SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        {
            SubLObject doc = make_event_document(UNPROVIDED);
            SubLObject cycl = list($$WebPageAtURLFn, list($$URLFn, url));
            _csetf_event_doc_url(doc, url);
            _csetf_event_doc_string(doc, string);
            _csetf_event_doc_cycl(doc, cycl);
            return doc;
        }
    }

    /**
     *
     *
     * @param URL
    stringp;
     * 		
     * @param STRING
     * 		stringp; the string-y version of URL
     * @return XXX
     */
    @LispMethod(comment = "@param URL\nstringp;\r\n\t\t\r\n@param STRING\r\n\t\tstringp; the string-y version of URL\r\n@return XXX")
    public static SubLObject new_event_document(final SubLObject url, SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        final SubLObject doc = make_event_document(UNPROVIDED);
        final SubLObject cycl = list($$WebPageAtURLFn, list($$URLFn, url));
        _csetf_event_doc_url(doc, url);
        _csetf_event_doc_string(doc, string);
        _csetf_event_doc_cycl(doc, cycl);
        return doc;
    }

    /**
     *
     *
     * @param DOC
     * 		
     * @return stringp
     */
    @LispMethod(comment = "@param DOC\r\n\t\t\r\n@return stringp")
    public static final SubLObject get_event_doc_string_alt(SubLObject doc) {
        return event_doc_string(doc);
    }

    /**
     *
     *
     * @param DOC
     * 		
     * @return stringp
     */
    @LispMethod(comment = "@param DOC\r\n\t\t\r\n@return stringp")
    public static SubLObject get_event_doc_string(final SubLObject doc) {
        return event_doc_string(doc);
    }

    /**
     *
     *
     * @param DOC
     * 		
     * @return stringp
     */
    @LispMethod(comment = "@param DOC\r\n\t\t\r\n@return stringp")
    public static final SubLObject get_event_doc_url_alt(SubLObject doc) {
        return event_doc_url(doc);
    }

    /**
     *
     *
     * @param DOC
     * 		
     * @return stringp
     */
    @LispMethod(comment = "@param DOC\r\n\t\t\r\n@return stringp")
    public static SubLObject get_event_doc_url(final SubLObject doc) {
        return event_doc_url(doc);
    }

    /**
     *
     *
     * @param DOC
    event-doc-p
     * 		
     * @return hlmt-p
     */
    @LispMethod(comment = "@param DOC\nevent-doc-p\r\n\t\t\r\n@return hlmt-p")
    public static final SubLObject get_event_doc_content_mt_alt(SubLObject doc) {
        return narts_high.nart_substitute(listS($$ContentMtOfCDAFromEventTypeFn, list($$URLReferentFn, get_event_doc_url(doc)), $list_alt28));
    }

    /**
     *
     *
     * @param DOC
    event-doc-p
     * 		
     * @return hlmt-p
     */
    @LispMethod(comment = "@param DOC\nevent-doc-p\r\n\t\t\r\n@return hlmt-p")
    public static SubLObject get_event_doc_content_mt(final SubLObject doc) {
        return narts_high.nart_substitute(listS($$ContentMtOfCDAFromEventTypeFn, list($$URLReferentFn, get_event_doc_url(doc)), $list34));
    }

    /**
     *
     *
     * @param DOC
     * 		
     * @param STRING
    stringp;
     * 		
     * @return doc
     */
    @LispMethod(comment = "@param DOC\r\n\t\t\r\n@param STRING\nstringp;\r\n\t\t\r\n@return doc")
    public static final SubLObject set_event_doc_string_alt(SubLObject doc, SubLObject string) {
        _csetf_event_doc_string(doc, string);
        return doc;
    }

    /**
     *
     *
     * @param DOC
     * 		
     * @param STRING
    stringp;
     * 		
     * @return doc
     */
    @LispMethod(comment = "@param DOC\r\n\t\t\r\n@param STRING\nstringp;\r\n\t\t\r\n@return doc")
    public static SubLObject set_event_doc_string(final SubLObject doc, final SubLObject string) {
        _csetf_event_doc_string(doc, string);
        return doc;
    }

    /**
     *
     *
     * @param DOC
     * 		
     * @param URL
    stringp;
     * 		
     * @return doc
     */
    @LispMethod(comment = "@param DOC\r\n\t\t\r\n@param URL\nstringp;\r\n\t\t\r\n@return doc")
    public static final SubLObject set_event_doc_url_alt(SubLObject doc, SubLObject url) {
        _csetf_event_doc_url(doc, url);
        return doc;
    }

    /**
     *
     *
     * @param DOC
     * 		
     * @param URL
    stringp;
     * 		
     * @return doc
     */
    @LispMethod(comment = "@param DOC\r\n\t\t\r\n@param URL\nstringp;\r\n\t\t\r\n@return doc")
    public static SubLObject set_event_doc_url(final SubLObject doc, final SubLObject url) {
        _csetf_event_doc_url(doc, url);
        return doc;
    }

    /**
     * Iterate through every sentence in the text of DOC
     */
    @LispMethod(comment = "Iterate through every sentence in the text of DOC")
    public static final SubLObject do_event_doc_sentences_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sentence_var = NIL;
                    SubLObject doc = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    sentence_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    doc = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, list(sentence_var, list(SENTENCIFY_STRING, list(GET_EVENT_DOC_STRING, doc))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt29);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterate through every sentence in the text of DOC
     */
    @LispMethod(comment = "Iterate through every sentence in the text of DOC")
    public static SubLObject do_event_doc_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = NIL;
        SubLObject doc = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        sentence_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        doc = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(sentence_var, list(SENTENCIFY_STRING, list(GET_EVENT_DOC_STRING, doc))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    /**
     * Given an file, generate an event document structure from it.
     */
    @LispMethod(comment = "Given an file, generate an event document structure from it.")
    public static final SubLObject event_document_from_file_alt(SubLObject file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject line_no = ZERO_INTEGER;
                SubLObject doc_string = $str_alt33$;
                SubLObject url = NIL;
                SubLObject file_var = file;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt35$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_1 = stream_var;
                                SubLObject line_number_var = NIL;
                                SubLObject line = NIL;
                                for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_1, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_1, NIL, NIL, UNPROVIDED)) {
                                    line_no = add(line_no, ONE_INTEGER);
                                    if (line_no.numE(THREE_INTEGER)) {
                                        if (NIL != string_utilities.empty_string_p(line)) {
                                            url = file;
                                        } else {
                                            url = line;
                                        }
                                    }
                                    if (line_no.numG(SEVEN_INTEGER)) {
                                        doc_string = cconcatenate(doc_string, new SubLObject[]{ $str_alt36$_, line });
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
                return new_event_document(url, doc_string);
            }
        }
    }

    /**
     * Given an file, generate an event document structure from it.
     */
    @LispMethod(comment = "Given an file, generate an event document structure from it.")
    public static SubLObject event_document_from_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject line_no = ZERO_INTEGER;
        SubLObject doc_string = $str39$;
        SubLObject url = NIL;
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
                Errors.error($str41$Unable_to_open__S, file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$1 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$1); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$1)) {
                    line_no = add(line_no, ONE_INTEGER);
                    if (line_no.numE(THREE_INTEGER)) {
                        if (NIL != string_utilities.empty_string_p(line)) {
                            url = file;
                        } else {
                            url = line;
                        }
                    }
                    if (line_no.numG(SEVEN_INTEGER)) {
                        doc_string = cconcatenate(doc_string, new SubLObject[]{ $$$_, line });
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return new_event_document(url, doc_string);
    }

    /**
     * Follow the chain of events visible from ELMT in the temporal direction of DIRECTION
     * using PREDICATE to look for chained events. Return a DICTIONARY of event -> events
     * links that goes in DIRECTION.
     */
    @LispMethod(comment = "Follow the chain of events visible from ELMT in the temporal direction of DIRECTION\r\nusing PREDICATE to look for chained events. Return a DICTIONARY of event -> events\r\nlinks that goes in DIRECTION.\nFollow the chain of events visible from ELMT in the temporal direction of DIRECTION\nusing PREDICATE to look for chained events. Return a DICTIONARY of event -> events\nlinks that goes in DIRECTION.")
    public static final SubLObject gather_event_graph_from_seed_alt(SubLObject seed_event, SubLObject elmt, SubLObject direction, SubLObject predicate) {
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        if (predicate == UNPROVIDED) {
            predicate = $$facilitates_EventEvent;
        }
        if (direction != $BACKWARD) {
            Errors.error($str_alt39$Invalid_search_direction__A__no_o, direction);
        }
        {
            SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            dictionary.dictionary_enter(v_graph, $DIRECTION, direction);
            dictionary.dictionary_enter(v_graph, $SEED_EVENT, seed_event);
            {
                SubLObject seen = set.new_set(EQL, UNPROVIDED);
                SubLObject todo = queues.create_queue();
                queues.enqueue(seed_event, todo);
                set.set_add(seed_event, seen);
                while (NIL == queues.queue_empty_p(todo)) {
                    {
                        SubLObject current = NIL;
                        SubLObject chained = NIL;
                        current = queues.dequeue(todo);
                        {
                            SubLObject variable_token = $EVENT;
                            SubLObject sentence = make_unary_formula($$assertedSentence, make_binary_formula(predicate, variable_token, current));
                            chained = ask_utilities.query_variable(variable_token, sentence, elmt, UNPROVIDED);
                            dictionary.dictionary_enter(v_graph, current, chained);
                        }
                        {
                            SubLObject cdolist_list_var = chained;
                            SubLObject child = NIL;
                            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                if (NIL == set.set_memberP(child, seen)) {
                                    set.set_add(child, seen);
                                    queues.enqueue(child, todo);
                                }
                            }
                        }
                    }
                } 
            }
            return v_graph;
        }
    }

    /**
     * Follow the chain of events visible from ELMT in the temporal direction of DIRECTION
     * using PREDICATE to look for chained events. Return a DICTIONARY of event -> events
     * links that goes in DIRECTION.
     */
    @LispMethod(comment = "Follow the chain of events visible from ELMT in the temporal direction of DIRECTION\r\nusing PREDICATE to look for chained events. Return a DICTIONARY of event -> events\r\nlinks that goes in DIRECTION.\nFollow the chain of events visible from ELMT in the temporal direction of DIRECTION\nusing PREDICATE to look for chained events. Return a DICTIONARY of event -> events\nlinks that goes in DIRECTION.")
    public static SubLObject gather_event_graph_from_seed(final SubLObject seed_event, final SubLObject elmt, SubLObject direction, SubLObject predicate) {
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        if (predicate == UNPROVIDED) {
            predicate = $$facilitates_EventEvent;
        }
        if (direction != $BACKWARD) {
            Errors.error($str45$Invalid_search_direction__A__no_o, direction);
        }
        final SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        dictionary.dictionary_enter(v_graph, $DIRECTION, direction);
        dictionary.dictionary_enter(v_graph, $SEED_EVENT, seed_event);
        final SubLObject seen = set.new_set(EQL, UNPROVIDED);
        final SubLObject todo = queues.create_queue(UNPROVIDED);
        queues.enqueue(seed_event, todo);
        set.set_add(seed_event, seen);
        while (NIL == queues.queue_empty_p(todo)) {
            SubLObject current = NIL;
            SubLObject chained = NIL;
            current = queues.dequeue(todo);
            final SubLObject variable_token = $EVENT;
            final SubLObject sentence = make_unary_formula($$assertedSentence, make_binary_formula(predicate, variable_token, current));
            chained = ask_utilities.query_variable(variable_token, sentence, elmt, UNPROVIDED);
            dictionary.dictionary_enter(v_graph, current, chained);
            SubLObject cdolist_list_var = chained;
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == set.set_memberP(child, seen)) {
                    set.set_add(child, seen);
                    queues.enqueue(child, todo);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        } 
        return v_graph;
    }

    public static final SubLObject walk_event_graph_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject current_2 = NIL;
                    SubLObject event_graph = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    current_2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    event_graph = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt44);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt44);
                            if (NIL == member(current_3, $list_alt45, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt44);
                        }
                        {
                            SubLObject direction_tail = property_list_member($DIRECTION, current);
                            SubLObject direction = (NIL != direction_tail) ? ((SubLObject) (cadr(direction_tail))) : $NOT_PROVIDED;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject linked = $sym48$LINKED;
                                SubLObject event_root = $sym49$EVENT_ROOT;
                                SubLObject the_direction = $sym50$THE_DIRECTION;
                                return list(CLET, list(list(the_direction, direction)), list(PWHEN, listS(EQ, the_direction, $list_alt53), list(CSETQ, the_direction, listS(DICTIONARY_LOOKUP, event_graph, $list_alt45))), list(PUNLESS, list(EQ, the_direction, listS(DICTIONARY_LOOKUP, event_graph, $list_alt45)), list(ERROR, $str_alt58$Cannot_walk_event_graph_generated, listS(DICTIONARY_LOOKUP, event_graph, $list_alt45), the_direction)), list(CLET, list(list(event_root, listS(DICTIONARY_LOOKUP, event_graph, $list_alt59))), listS(WALK_GRAPH_BREADTH_FIRST, list(event_root, current_2, linked), list(CSETQ, linked, list(DICTIONARY_LOOKUP, event_graph, current_2)), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject walk_event_graph(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject current_$2 = NIL;
        SubLObject event_graph = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        current_$2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        event_graph = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list50);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list50);
            if (NIL == member(current_$3, $list51, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list50);
        }
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : $NOT_PROVIDED;
        final SubLObject body;
        current = body = temp;
        final SubLObject linked = $sym54$LINKED;
        final SubLObject event_root = $sym55$EVENT_ROOT;
        final SubLObject the_direction = $sym56$THE_DIRECTION;
        return list(CLET, list(list(the_direction, direction)), list(PWHEN, listS(EQ, the_direction, $list59), list(CSETQ, the_direction, listS(DICTIONARY_LOOKUP, event_graph, $list51))), list(PUNLESS, list(EQ, the_direction, listS(DICTIONARY_LOOKUP, event_graph, $list51)), list(ERROR, $str64$Cannot_walk_event_graph_generated, listS(DICTIONARY_LOOKUP, event_graph, $list51), the_direction)), list(CLET, list(list(event_root, listS(DICTIONARY_LOOKUP, event_graph, $list65))), listS(WALK_GRAPH_BREADTH_FIRST, list(event_root, current_$2, linked), list(CSETQ, linked, list(DICTIONARY_LOOKUP, event_graph, current_$2)), append(body, NIL))));
    }

    public static final SubLObject is_root_of_event_graph_p_alt(SubLObject v_term, SubLObject event_graph) {
        return eq(v_term, dictionary.dictionary_lookup(event_graph, $SEED_EVENT, UNPROVIDED));
    }

    public static SubLObject is_root_of_event_graph_p(final SubLObject v_term, final SubLObject event_graph) {
        return eq(v_term, dictionary.dictionary_lookup(event_graph, $SEED_EVENT, UNPROVIDED));
    }

    public static final SubLObject clear_get_all_subevents_alt() {
        {
            SubLObject cs = $get_all_subevents_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_get_all_subevents() {
        final SubLObject cs = $get_all_subevents_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_get_all_subevents_alt(SubLObject event) {
        return memoization_state.caching_state_remove_function_results_with_args($get_all_subevents_caching_state$.getGlobalValue(), list(event), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_get_all_subevents(final SubLObject event) {
        return memoization_state.caching_state_remove_function_results_with_args($get_all_subevents_caching_state$.getGlobalValue(), list(event), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_all_subevents_internal_alt(SubLObject event) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return ask_utilities.query_variable($sym62$_EVENT, listS($$properSubEvents, event, $list_alt64), $event_finding_query_mt$.getDynamicValue(thread), $list_alt65);
        }
    }

    public static SubLObject get_all_subevents_internal(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable($sym68$_EVENT, listS($$properSubEvents, event, $list70), $event_finding_query_mt$.getDynamicValue(thread), $list71);
    }

    public static final SubLObject get_all_subevents_alt(SubLObject event) {
        {
            SubLObject caching_state = $get_all_subevents_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_ALL_SUBEVENTS, $get_all_subevents_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, event, $kw67$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(get_all_subevents_internal(event)));
                    memoization_state.caching_state_put(caching_state, event, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject get_all_subevents(final SubLObject event) {
        SubLObject caching_state = $get_all_subevents_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_ALL_SUBEVENTS, $get_all_subevents_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, event, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_all_subevents_internal(event)));
            memoization_state.caching_state_put(caching_state, event, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_get_all_scripted_subevent_types_alt() {
        {
            SubLObject cs = $get_all_scripted_subevent_types_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_get_all_scripted_subevent_types() {
        final SubLObject cs = $get_all_scripted_subevent_types_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_get_all_scripted_subevent_types_alt(SubLObject event) {
        return memoization_state.caching_state_remove_function_results_with_args($get_all_scripted_subevent_types_caching_state$.getGlobalValue(), list(event), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_get_all_scripted_subevent_types(final SubLObject event) {
        return memoization_state.caching_state_remove_function_results_with_args($get_all_scripted_subevent_types_caching_state$.getGlobalValue(), list(event), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_all_scripted_subevent_types_internal_alt(SubLObject event) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subevent_types = ask_utilities.query_variable($sym69$_SUB_TYPE, listS($$and, listS($$isa, event, $list_alt72), $list_alt73), $event_finding_query_mt$.getDynamicValue(thread), UNPROVIDED);
                subevent_types = cconcatenate(isa.min_isa(event, UNPROVIDED, UNPROVIDED), subevent_types);
                return subevent_types;
            }
        }
    }

    public static SubLObject get_all_scripted_subevent_types_internal(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subevent_types = ask_utilities.query_variable($sym74$_SUB_TYPE, listS($$and, listS($$isa, event, $list77), $list78), $event_finding_query_mt$.getDynamicValue(thread), UNPROVIDED);
        subevent_types = cconcatenate(isa.min_isa(event, UNPROVIDED, UNPROVIDED), subevent_types);
        return subevent_types;
    }

    public static final SubLObject get_all_scripted_subevent_types_alt(SubLObject event) {
        {
            SubLObject caching_state = $get_all_scripted_subevent_types_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_ALL_SCRIPTED_SUBEVENT_TYPES, $get_all_scripted_subevent_types_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, event, $kw67$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(get_all_scripted_subevent_types_internal(event)));
                    memoization_state.caching_state_put(caching_state, event, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject get_all_scripted_subevent_types(final SubLObject event) {
        SubLObject caching_state = $get_all_scripted_subevent_types_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_ALL_SCRIPTED_SUBEVENT_TYPES, $get_all_scripted_subevent_types_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, event, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_all_scripted_subevent_types_internal(event)));
            memoization_state.caching_state_put(caching_state, event, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @param SEARCH-STRINGS
     * 		listp of stringps
     * @return listp; a list of event-document-p's, with the appropriate webPageURL
    assertions and asHtmlSourceString assertions
     */
    @LispMethod(comment = "@param SEARCH-STRINGS\r\n\t\tlistp of stringps\r\n@return listp; a list of event-document-p\'s, with the appropriate webPageURL\r\nassertions and asHtmlSourceString assertions")
    public static final SubLObject best_docs_for_search_strings_alt(SubLObject search_strings) {
        {
            SubLObject docs = NIL;
            return docs;
        }
    }

    /**
     *
     *
     * @param SEARCH-STRINGS
     * 		listp of stringps
     * @return listp; a list of event-document-p's, with the appropriate webPageURL
    assertions and asHtmlSourceString assertions
     */
    @LispMethod(comment = "@param SEARCH-STRINGS\r\n\t\tlistp of stringps\r\n@return listp; a list of event-document-p\'s, with the appropriate webPageURL\r\nassertions and asHtmlSourceString assertions")
    public static SubLObject best_docs_for_search_strings(final SubLObject search_strings) {
        final SubLObject docs = NIL;
        return docs;
    }

    public static final SubLObject best_docs_for_search_terms_alt(SubLObject search_terms) {
        {
            SubLObject file_infos = best_files_for_search_terms(search_terms);
            SubLObject documents = NIL;
            SubLObject cdolist_list_var = file_infos;
            SubLObject file_info = NIL;
            for (file_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file_info = cdolist_list_var.first()) {
                {
                    SubLObject file = file_info.first();
                    documents = cons(event_document_from_file(file), documents);
                }
            }
            return nreverse(documents);
        }
    }

    public static SubLObject best_docs_for_search_terms(final SubLObject search_terms) {
        final SubLObject file_infos = best_files_for_search_terms(search_terms);
        SubLObject documents = NIL;
        SubLObject cdolist_list_var = file_infos;
        SubLObject file_info = NIL;
        file_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject file = file_info.first();
            documents = cons(event_document_from_file(file), documents);
            cdolist_list_var = cdolist_list_var.rest();
            file_info = cdolist_list_var.first();
        } 
        return nreverse(documents);
    }

    /**
     *
     *
     * @param SEARCH-TERMS
     * 		a dictionary of terms and counts.
     * @return LISTP, a LIST of strings representing the paths to the files
     */
    @LispMethod(comment = "@param SEARCH-TERMS\r\n\t\ta dictionary of terms and counts.\r\n@return LISTP, a LIST of strings representing the paths to the files")
    public static final SubLObject best_files_for_search_terms_alt(SubLObject search_terms) {
        {
            SubLObject file_ranking = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject ranked_list = get_ranked_search_term_list(search_terms);
            SubLObject cdolist_list_var = ranked_list;
            SubLObject ranking = NIL;
            for (ranking = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ranking = cdolist_list_var.first()) {
                {
                    SubLObject datum = ranking;
                    SubLObject current = datum;
                    SubLObject v_term = NIL;
                    SubLObject count = NIL;
                    SubLObject search_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    v_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    count = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    search_term = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject files = lucene_index.ws_index_search_for_pathnames(lucene_index.lucene_symbolic_query_to_string(search_term), UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var_4 = files;
                            SubLObject file = NIL;
                            for (file = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , file = cdolist_list_var_4.first()) {
                                dictionary_utilities.dictionary_push(file_ranking, file, ranking);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt76);
                    }
                }
            }
            {
                SubLObject final_ranking = dictionary_utilities.dictionary_to_alist(file_ranking);
                return Sort.sort(final_ranking, symbol_function($sym77$_), symbol_function(LENGTH));
            }
        }
    }

    /**
     *
     *
     * @param SEARCH-TERMS
     * 		a dictionary of terms and counts.
     * @return LISTP, a LIST of strings representing the paths to the files
     */
    @LispMethod(comment = "@param SEARCH-TERMS\r\n\t\ta dictionary of terms and counts.\r\n@return LISTP, a LIST of strings representing the paths to the files")
    public static SubLObject best_files_for_search_terms(final SubLObject search_terms) {
        final SubLObject file_ranking = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject ranked_list = cdolist_list_var = get_ranked_search_term_list(search_terms);
        SubLObject ranking = NIL;
        ranking = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = ranking;
            SubLObject v_term = NIL;
            SubLObject count = NIL;
            SubLObject search_term = NIL;
            destructuring_bind_must_consp(current, datum, $list81);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list81);
            count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list81);
            search_term = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$4;
                final SubLObject files = cdolist_list_var_$4 = lucene_index.ws_index_search_for_pathnames(lucene_index.lucene_symbolic_query_to_string(search_term), UNPROVIDED, UNPROVIDED);
                SubLObject file = NIL;
                file = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    dictionary_utilities.dictionary_push(file_ranking, file, ranking);
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    file = cdolist_list_var_$4.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list81);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ranking = cdolist_list_var.first();
        } 
        final SubLObject final_ranking = dictionary_utilities.dictionary_to_alist(file_ranking);
        return Sort.sort(final_ranking, symbol_function($sym82$_), symbol_function(LENGTH));
    }

    public static final SubLObject get_ranked_search_term_list_alt(SubLObject search_terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ranked_list = NIL;
                SubLObject search_term_to_term = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(search_terms));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject search_term = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (!search_term.isFixnum()) {
                                dictionary.dictionary_enter(search_term_to_term, search_term, v_term);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(search_terms));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject search_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (count.isFixnum()) {
                                if (count.isPositive()) {
                                    {
                                        SubLObject v_term = dictionary.dictionary_lookup(search_term_to_term, search_term, search_term);
                                        ranked_list = cons(list(v_term, count, search_term), ranked_list);
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return Sort.sort(ranked_list, symbol_function($sym79$_), symbol_function(SECOND));
            }
        }
    }

    public static SubLObject get_ranked_search_term_list(final SubLObject search_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ranked_list = NIL;
        final SubLObject search_term_to_term = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(search_terms)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject search_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (!search_term.isFixnum()) {
                dictionary.dictionary_enter(search_term_to_term, search_term, v_term);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(search_terms)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject search_term2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (count.isFixnum() && count.isPositive()) {
                final SubLObject v_term2 = dictionary.dictionary_lookup(search_term_to_term, search_term2, search_term2);
                ranked_list = cons(list(v_term2, count, search_term2), ranked_list);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(ranked_list, symbol_function($sym84$_), symbol_function(SECOND));
    }

    public static final SubLObject event_learner_assert_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assert_result = NIL;
                SubLObject error = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind($event_learning_cyclist$.getDynamicValue(thread), thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject assert_result_5 = ke.ke_assert_now(formula, mt, UNPROVIDED, UNPROVIDED);
                            SubLObject error_6 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            assert_result = assert_result_5;
                            error = error_6;
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(assert_result, error);
            }
        }
    }

    public static SubLObject event_learner_assert(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assert_result = NIL;
        SubLObject error = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($event_learning_cyclist$.getDynamicValue(thread), thread);
            thread.resetMultipleValues();
            final SubLObject assert_result_$5 = ke.ke_assert_now(formula, mt, UNPROVIDED, UNPROVIDED);
            final SubLObject error_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            assert_result = assert_result_$5;
            error = error_$6;
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return values(assert_result, error);
    }

    /**
     *
     *
     * @param DOC
    event-doc-p
     * 		
     * @return listp; a list of lists of candidate facts that were extracted from
    DOC
     */
    @LispMethod(comment = "@param DOC\nevent-doc-p\r\n\t\t\r\n@return listp; a list of lists of candidate facts that were extracted from\r\nDOC")
    public static final SubLObject extract_event_facts_from_doc_alt(SubLObject doc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject facts = NIL;
                SubLObject cdolist_list_var = document.sentencify_string(get_event_doc_string(doc));
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    {
                        SubLObject interpretations = remove_el_duplicates(ebmt_template_parser.ebmt_parse(sentence, $event_learner_head_mt$.getDynamicValue(thread), NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != interpretations) {
                            facts = cons(interpretations, facts);
                        }
                    }
                }
                return facts;
            }
        }
    }

    /**
     *
     *
     * @param DOC
    event-doc-p
     * 		
     * @return listp; a list of lists of candidate facts that were extracted from
    DOC
     */
    @LispMethod(comment = "@param DOC\nevent-doc-p\r\n\t\t\r\n@return listp; a list of lists of candidate facts that were extracted from\r\nDOC")
    public static SubLObject extract_event_facts_from_doc(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject facts = NIL;
        SubLObject cdolist_list_var = document.sentencify_string(get_event_doc_string(doc));
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject interpretations = remove_el_duplicates(ebmt_template_parser.ebmt_parse(sentence, $event_learner_head_mt$.getDynamicValue(thread), NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != interpretations) {
                facts = cons(interpretations, facts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return facts;
    }

    /**
     *
     *
     * @param FACTS
     * 		listp; list of lists where each member-list contains various
     * 		interpretations of a particular sentence
     */
    @LispMethod(comment = "@param FACTS\r\n\t\tlistp; list of lists where each member-list contains various\r\n\t\tinterpretations of a particular sentence")
    public static final SubLObject best_interpretations_of_facts_alt(SubLObject facts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject best_facts = NIL;
                SubLObject cdolist_list_var = facts;
                SubLObject interpretations = NIL;
                for (interpretations = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interpretations = cdolist_list_var.first()) {
                    {
                        SubLObject best_interpretations = NIL;
                        SubLObject doneP = NIL;
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = interpretations;
                                SubLObject interpretation = NIL;
                                for (interpretation = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , interpretation = csome_list_var.first()) {
                                    if (NIL != rkf_query_utilities.rkf_known(interpretation, $event_learner_head_mt$.getDynamicValue(thread), UNPROVIDED)) {
                                        best_interpretations = list(interpretation);
                                        doneP = T;
                                    } else {
                                        if (NIL != rkf_contradiction_finder.rkf_rejected(interpretation, $event_learner_head_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                            Errors.warn($str_alt81$Cyc_rejected___S, interpretation);
                                        } else {
                                            {
                                                SubLObject item_var = interpretation;
                                                if (NIL == member(item_var, best_interpretations, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    best_interpretations = cons(item_var, best_interpretations);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != best_interpretations) {
                            {
                                SubLObject item_var = nreverse(best_interpretations).first();
                                if (NIL == member(item_var, best_facts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    best_facts = cons(item_var, best_facts);
                                }
                            }
                        }
                    }
                }
                return best_facts;
            }
        }
    }

    /**
     *
     *
     * @param FACTS
     * 		listp; list of lists where each member-list contains various
     * 		interpretations of a particular sentence
     */
    @LispMethod(comment = "@param FACTS\r\n\t\tlistp; list of lists where each member-list contains various\r\n\t\tinterpretations of a particular sentence")
    public static SubLObject best_interpretations_of_facts(final SubLObject facts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_facts = NIL;
        SubLObject cdolist_list_var = facts;
        SubLObject interpretations = NIL;
        interpretations = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject best_interpretations = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = interpretations;
                SubLObject interpretation = NIL;
                interpretation = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL != rkf_query_utilities.rkf_known(interpretation, $event_learner_head_mt$.getDynamicValue(thread), UNPROVIDED)) {
                        best_interpretations = list(interpretation);
                        doneP = T;
                    } else
                        if (NIL != rkf_contradiction_finder.rkf_rejected(interpretation, $event_learner_head_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            Errors.warn($str86$Cyc_rejected___S, interpretation);
                        } else {
                            final SubLObject item_var = interpretation;
                            if (NIL == member(item_var, best_interpretations, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                best_interpretations = cons(item_var, best_interpretations);
                            }
                        }

                    csome_list_var = csome_list_var.rest();
                    interpretation = csome_list_var.first();
                } 
            }
            if (NIL != best_interpretations) {
                final SubLObject item_var2 = nreverse(best_interpretations).first();
                if (NIL == member(item_var2, best_facts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    best_facts = cons(item_var2, best_facts);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            interpretations = cdolist_list_var.first();
        } 
        return best_facts;
    }

    public static final SubLObject clear_all_event_learning_caches_alt() {
        clear_get_phrases_for_differentiated_event_types();
        clear_differentiating_genls();
        clear_get_all_subevents();
        clear_get_all_scripted_subevent_types();
        return $CLEARED;
    }

    public static SubLObject clear_all_event_learning_caches() {
        clear_get_phrases_for_differentiated_event_types();
        clear_differentiating_genls();
        clear_get_all_subevents();
        clear_get_all_scripted_subevent_types();
        return $CLEARED;
    }

    /**
     * Returns the semantic MT for EVENT, i.e. the MT that is to be used in all
     * queries that will be performed during event-learning.  It is a spindle
     * collector-MT.
     *
     * @param EVENT
     * 		cycl-represented-term-p; an instance of #$Event
     * @return SEMANTIC-MT hlmt-p
     */
    @LispMethod(comment = "Returns the semantic MT for EVENT, i.e. the MT that is to be used in all\r\nqueries that will be performed during event-learning.  It is a spindle\r\ncollector-MT.\r\n\r\n@param EVENT\r\n\t\tcycl-represented-term-p; an instance of #$Event\r\n@return SEMANTIC-MT hlmt-p\nReturns the semantic MT for EVENT, i.e. the MT that is to be used in all\nqueries that will be performed during event-learning.  It is a spindle\ncollector-MT.")
    public static final SubLObject event_learning_semantic_mt_alt(SubLObject event) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject semantic_mt = ask_utilities.query_variable($sym83$_MT, listS($$definingMt, event, $list_alt85), $$InferencePSC, UNPROVIDED).first();
                if (NIL == semantic_mt) {
                    Errors.warn($str_alt86$No_semantic_MT_found_for__S__retu, event, mt_relevance_macros.$mt$.getDynamicValue(thread));
                    semantic_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                }
                return semantic_mt;
            }
        }
    }

    /**
     * Returns the semantic MT for EVENT, i.e. the MT that is to be used in all
     * queries that will be performed during event-learning.  It is a spindle
     * collector-MT.
     *
     * @param EVENT
     * 		cycl-represented-term-p; an instance of #$Event
     * @return SEMANTIC-MT hlmt-p
     */
    @LispMethod(comment = "Returns the semantic MT for EVENT, i.e. the MT that is to be used in all\r\nqueries that will be performed during event-learning.  It is a spindle\r\ncollector-MT.\r\n\r\n@param EVENT\r\n\t\tcycl-represented-term-p; an instance of #$Event\r\n@return SEMANTIC-MT hlmt-p\nReturns the semantic MT for EVENT, i.e. the MT that is to be used in all\nqueries that will be performed during event-learning.  It is a spindle\ncollector-MT.")
    public static SubLObject event_learning_semantic_mt(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject semantic_mt = ask_utilities.query_variable($sym88$_MT, listS($$definingMt, event, $list90), $$InferencePSC, UNPROVIDED).first();
        if (NIL == semantic_mt) {
            Errors.warn($str91$No_semantic_MT_found_for__S__retu, event, mt_relevance_macros.$mt$.getDynamicValue(thread));
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        return semantic_mt;
    }

    public static final SubLObject gather_facts_from_seed_event_alt(SubLObject event) {
        {
            SubLObject semantic_mt = event_learning_semantic_mt(event);
            SubLObject event_source_spindle = ask_utilities.query_variable($sym87$_SPINDLE, list($$mtSpindleCollector, $sym87$_SPINDLE, semantic_mt), UNPROVIDED, UNPROVIDED).first();
            return gather_more_facts_about_seed_event(event, semantic_mt, event_source_spindle);
        }
    }

    public static SubLObject gather_facts_from_seed_event(final SubLObject event) {
        final SubLObject semantic_mt = event_learning_semantic_mt(event);
        final SubLObject event_source_spindle = ask_utilities.query_variable($sym92$_SPINDLE, list($$mtSpindleCollector, $sym92$_SPINDLE, semantic_mt), UNPROVIDED, UNPROVIDED).first();
        return gather_more_facts_about_seed_event(event, semantic_mt, event_source_spindle);
    }

    /**
     * Given an event, its context of meaning, and the source spindle where to place the
     * document interpretations, gather additional facts about a seed event that are
     * patterned on the facts already found.
     *
     * @param event
     * 		FORT-P the seed event
     * @param semantic-mt
     * 		ELMT-P the seed interpretation mt
     * @param event-source-spindle
     * 		ELMT-P the head of the spindle for the sources
     * @return 
     */
    @LispMethod(comment = "Given an event, its context of meaning, and the source spindle where to place the\r\ndocument interpretations, gather additional facts about a seed event that are\r\npatterned on the facts already found.\r\n\r\n@param event\r\n\t\tFORT-P the seed event\r\n@param semantic-mt\r\n\t\tELMT-P the seed interpretation mt\r\n@param event-source-spindle\r\n\t\tELMT-P the head of the spindle for the sources\r\n@return\nGiven an event, its context of meaning, and the source spindle where to place the\ndocument interpretations, gather additional facts about a seed event that are\npatterned on the facts already found.")
    public static final SubLObject gather_more_facts_about_seed_event_alt(SubLObject event, SubLObject semantic_mt, SubLObject event_source_spindle) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject overall_confirmed_facts = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject known_facts = represented_facts_for_event(event);
                            SubLObject search_strings = search_strings_for_sentences_and_event(known_facts, event);
                            SubLObject documents = best_docs_for_search_strings(search_strings);
                            SubLObject enoughP = NIL;
                            {
                                SubLObject list_var = NIL;
                                SubLObject v_document = NIL;
                                SubLObject doc_num = NIL;
                                for (list_var = documents, v_document = list_var.first(), doc_num = ZERO_INTEGER; !((NIL != enoughP) || (NIL == list_var)); list_var = list_var.rest() , v_document = list_var.first() , doc_num = add(ONE_INTEGER, doc_num)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject confirmed_facts = learn_new_templates_for_known_facts(v_document, known_facts, event);
                                        SubLObject num_new_templates = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        overall_confirmed_facts = cconcatenate(confirmed_facts, overall_confirmed_facts);
                                        if (length(overall_confirmed_facts).numGE(length(known_facts))) {
                                            enoughP = T;
                                        }
                                        Errors.warn($str_alt89$Added__S_new_templates_to_the_EBM, num_new_templates);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = documents;
                                SubLObject v_document = NIL;
                                for (v_document = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_document = cdolist_list_var.first()) {
                                    learn_new_facts_for_event_in_document(event, v_document, event_source_spindle);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return overall_confirmed_facts;
            }
        }
    }

    /**
     * Given an event, its context of meaning, and the source spindle where to place the
     * document interpretations, gather additional facts about a seed event that are
     * patterned on the facts already found.
     *
     * @param event
     * 		FORT-P the seed event
     * @param semantic-mt
     * 		ELMT-P the seed interpretation mt
     * @param event-source-spindle
     * 		ELMT-P the head of the spindle for the sources
     * @return 
     */
    @LispMethod(comment = "Given an event, its context of meaning, and the source spindle where to place the\r\ndocument interpretations, gather additional facts about a seed event that are\r\npatterned on the facts already found.\r\n\r\n@param event\r\n\t\tFORT-P the seed event\r\n@param semantic-mt\r\n\t\tELMT-P the seed interpretation mt\r\n@param event-source-spindle\r\n\t\tELMT-P the head of the spindle for the sources\r\n@return\nGiven an event, its context of meaning, and the source spindle where to place the\ndocument interpretations, gather additional facts about a seed event that are\npatterned on the facts already found.")
    public static SubLObject gather_more_facts_about_seed_event(final SubLObject event, final SubLObject semantic_mt, final SubLObject event_source_spindle) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject overall_confirmed_facts = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject known_facts = represented_facts_for_event(event);
            final SubLObject search_strings = search_strings_for_sentences_and_event(known_facts, event);
            final SubLObject documents = best_docs_for_search_strings(search_strings);
            SubLObject enoughP = NIL;
            SubLObject list_var = NIL;
            SubLObject v_document = NIL;
            SubLObject doc_num = NIL;
            list_var = documents;
            v_document = list_var.first();
            for (doc_num = ZERO_INTEGER; (NIL == enoughP) && (NIL != list_var); list_var = list_var.rest() , v_document = list_var.first() , doc_num = add(ONE_INTEGER, doc_num)) {
                thread.resetMultipleValues();
                final SubLObject confirmed_facts = learn_new_templates_for_known_facts(v_document, known_facts, event);
                final SubLObject num_new_templates = thread.secondMultipleValue();
                thread.resetMultipleValues();
                overall_confirmed_facts = cconcatenate(confirmed_facts, overall_confirmed_facts);
                if (length(overall_confirmed_facts).numGE(length(known_facts))) {
                    enoughP = T;
                }
                Errors.warn($str94$Added__S_new_templates_to_the_EBM, num_new_templates);
            }
            SubLObject cdolist_list_var = documents;
            v_document = NIL;
            v_document = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                learn_new_facts_for_event_in_document(event, v_document, event_source_spindle);
                cdolist_list_var = cdolist_list_var.rest();
                v_document = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return overall_confirmed_facts;
    }

    /**
     *
     *
     * @param EVENT;
     * 		instance of #$Event
     * @return listp; a list of facts (cycl sentences) known about EVENT and its
    subevents
     */
    @LispMethod(comment = "@param EVENT;\r\n\t\tinstance of #$Event\r\n@return listp; a list of facts (cycl sentences) known about EVENT and its\r\nsubevents")
    public static final SubLObject get_represented_facts_for_event_alt(SubLObject event, SubLObject elmt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        results = represented_facts_for_event(event);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    /**
     *
     *
     * @param EVENT;
     * 		instance of #$Event
     * @return listp; a list of facts (cycl sentences) known about EVENT and its
    subevents
     */
    @LispMethod(comment = "@param EVENT;\r\n\t\tinstance of #$Event\r\n@return listp; a list of facts (cycl sentences) known about EVENT and its\r\nsubevents")
    public static SubLObject get_represented_facts_for_event(final SubLObject event, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            results = represented_facts_for_event(event);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    /**
     * Compute search strings for an event. Use what is known in the KB about the
     * event to get more. Gather the represented facts about an event, if non are provided,
     * using ELMT to resolve visibility issues.
     *
     * @return LISTP of search strings
     */
    @LispMethod(comment = "Compute search strings for an event. Use what is known in the KB about the\r\nevent to get more. Gather the represented facts about an event, if non are provided,\r\nusing ELMT to resolve visibility issues.\r\n\r\n@return LISTP of search strings\nCompute search strings for an event. Use what is known in the KB about the\nevent to get more. Gather the represented facts about an event, if non are provided,\nusing ELMT to resolve visibility issues.")
    public static final SubLObject get_search_strings_for_represented_event_alt(SubLObject event, SubLObject elmt, SubLObject facts) {
        if (facts == UNPROVIDED) {
            facts = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == facts) {
                facts = get_represented_facts_for_event(event, elmt);
            }
            {
                SubLObject search_strings = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        search_strings = search_strings_for_sentences_and_event(facts, event);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return search_strings;
            }
        }
    }

    /**
     * Compute search strings for an event. Use what is known in the KB about the
     * event to get more. Gather the represented facts about an event, if non are provided,
     * using ELMT to resolve visibility issues.
     *
     * @return LISTP of search strings
     */
    @LispMethod(comment = "Compute search strings for an event. Use what is known in the KB about the\r\nevent to get more. Gather the represented facts about an event, if non are provided,\r\nusing ELMT to resolve visibility issues.\r\n\r\n@return LISTP of search strings\nCompute search strings for an event. Use what is known in the KB about the\nevent to get more. Gather the represented facts about an event, if non are provided,\nusing ELMT to resolve visibility issues.")
    public static SubLObject get_search_strings_for_represented_event(final SubLObject event, final SubLObject elmt, SubLObject facts) {
        if (facts == UNPROVIDED) {
            facts = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == facts) {
            facts = get_represented_facts_for_event(event, elmt);
        }
        SubLObject search_strings = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            search_strings = search_strings_for_sentences_and_event(facts, event);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return search_strings;
    }

    /**
     * Compute search terms for an event. Use what is known in the KB about the event to
     * get more. Gather the represented facts about an event, if none are provided,
     * using ELMT for KB visibility.
     *
     * @return DICTIONARYP of TERM -> COUNT entries.
     */
    @LispMethod(comment = "Compute search terms for an event. Use what is known in the KB about the event to\r\nget more. Gather the represented facts about an event, if none are provided,\r\nusing ELMT for KB visibility.\r\n\r\n@return DICTIONARYP of TERM -> COUNT entries.\nCompute search terms for an event. Use what is known in the KB about the event to\nget more. Gather the represented facts about an event, if none are provided,\nusing ELMT for KB visibility.")
    public static final SubLObject get_search_terms_for_represented_event_alt(SubLObject event, SubLObject elmt, SubLObject facts) {
        if (facts == UNPROVIDED) {
            facts = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == facts) {
                facts = get_represented_facts_for_event(event, elmt);
            }
            {
                SubLObject search_terms = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        search_terms = search_terms_for_sentences_and_event(facts, event, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return search_terms;
            }
        }
    }

    /**
     * Compute search terms for an event. Use what is known in the KB about the event to
     * get more. Gather the represented facts about an event, if none are provided,
     * using ELMT for KB visibility.
     *
     * @return DICTIONARYP of TERM -> COUNT entries.
     */
    @LispMethod(comment = "Compute search terms for an event. Use what is known in the KB about the event to\r\nget more. Gather the represented facts about an event, if none are provided,\r\nusing ELMT for KB visibility.\r\n\r\n@return DICTIONARYP of TERM -> COUNT entries.\nCompute search terms for an event. Use what is known in the KB about the event to\nget more. Gather the represented facts about an event, if none are provided,\nusing ELMT for KB visibility.")
    public static SubLObject get_search_terms_for_represented_event(final SubLObject event, final SubLObject elmt, SubLObject facts) {
        if (facts == UNPROVIDED) {
            facts = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == facts) {
            facts = get_represented_facts_for_event(event, elmt);
        }
        SubLObject search_terms = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            search_terms = search_terms_for_sentences_and_event(facts, event, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return search_terms;
    }

    public static final SubLObject get_best_documents_for_represented_event_via_terms_alt(SubLObject event, SubLObject elmt, SubLObject facts) {
        if (facts == UNPROVIDED) {
            facts = NIL;
        }
        {
            SubLObject search_terms = get_search_terms_for_represented_event(event, elmt, facts);
            return best_docs_for_search_terms(search_terms);
        }
    }

    public static SubLObject get_best_documents_for_represented_event_via_terms(final SubLObject event, final SubLObject elmt, SubLObject facts) {
        if (facts == UNPROVIDED) {
            facts = NIL;
        }
        final SubLObject search_terms = get_search_terms_for_represented_event(event, elmt, facts);
        return best_docs_for_search_terms(search_terms);
    }

    /**
     * Returns the CycL assertions that describe the event.  Thus, assertions using
     * #$isa are NOT included.  However, assertions that relate an event to its
     * sub-event are selected.
     *
     * @param EVENT;
     * 		instance of #$Event
     * @return listp; a list of facts (cycl sentences) known about EVENT and its
    subevents
     */
    @LispMethod(comment = "Returns the CycL assertions that describe the event.  Thus, assertions using\r\n#$isa are NOT included.  However, assertions that relate an event to its\r\nsub-event are selected.\r\n\r\n@param EVENT;\r\n\t\tinstance of #$Event\r\n@return listp; a list of facts (cycl sentences) known about EVENT and its\r\nsubevents\nReturns the CycL assertions that describe the event.  Thus, assertions using\n#$isa are NOT included.  However, assertions that relate an event to its\nsub-event are selected.")
    public static final SubLObject represented_facts_for_event_alt(SubLObject event) {
        {
            SubLObject subevents = get_all_subevents(event);
            SubLObject subevent_types = get_all_scripted_subevent_types(event);
            SubLObject sentences = NIL;
            {
                SubLObject item_var = event;
                if (NIL == member(item_var, subevents, symbol_function(EQL), symbol_function(IDENTITY))) {
                    subevents = cons(item_var, subevents);
                }
            }
            subevent_types = union(cycl_utilities.hl_to_el(isa.min_isa(event, UNPROVIDED, UNPROVIDED)), subevent_types, EQUAL, UNPROVIDED);
            {
                SubLObject cdolist_list_var = subevents;
                SubLObject subevent = NIL;
                for (subevent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subevent = cdolist_list_var.first()) {
                    if (NIL != intersection(cycl_utilities.hl_to_el(isa.all_isa(subevent, UNPROVIDED, UNPROVIDED)), subevent_types, EQUAL, UNPROVIDED)) {
                        {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(subevent, NIL, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(subevent, NIL, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_7 = NIL;
                                                            SubLObject token_var_8 = NIL;
                                                            while (NIL == done_var_7) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                    SubLObject valid_9 = makeBoolean(token_var_8 != assertion);
                                                                    if (NIL != valid_9) {
                                                                        {
                                                                            SubLObject arg0 = cycl_utilities.formula_arg0(assertion);
                                                                            SubLObject arg2 = cycl_utilities.formula_arg2(assertion, UNPROVIDED);
                                                                            if (((((NIL != genl_predicates.genl_predP(arg0, $$isa, UNPROVIDED, UNPROVIDED)) && (NIL != genls.genlP(arg2, $$Event, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(arg0, $$SBHLTimePredicate, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(arg0, $$Role, UNPROVIDED, UNPROVIDED))) || (NIL != genl_predicates.genl_predP(arg0, $$subEvents, UNPROVIDED, UNPROVIDED))) {
                                                                                {
                                                                                    SubLObject item_var = uncanonicalizer.assertion_el_formula(assertion);
                                                                                    if (NIL == member(item_var, sentences, EQUALP, symbol_function(IDENTITY))) {
                                                                                        sentences = cons(item_var, sentences);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_7 = makeBoolean(NIL == valid_9);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                            try {
                                                                bind($is_thread_performing_cleanupP$, T);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    }
                }
            }
            return sentences;
        }
    }

    /**
     * Returns the CycL assertions that describe the event.  Thus, assertions using
     * #$isa are NOT included.  However, assertions that relate an event to its
     * sub-event are selected.
     *
     * @param EVENT;
     * 		instance of #$Event
     * @return listp; a list of facts (cycl sentences) known about EVENT and its
    subevents
     */
    @LispMethod(comment = "Returns the CycL assertions that describe the event.  Thus, assertions using\r\n#$isa are NOT included.  However, assertions that relate an event to its\r\nsub-event are selected.\r\n\r\n@param EVENT;\r\n\t\tinstance of #$Event\r\n@return listp; a list of facts (cycl sentences) known about EVENT and its\r\nsubevents\nReturns the CycL assertions that describe the event.  Thus, assertions using\n#$isa are NOT included.  However, assertions that relate an event to its\nsub-event are selected.")
    public static SubLObject represented_facts_for_event(final SubLObject event) {
        SubLObject subevents = get_all_subevents(event);
        SubLObject subevent_types = get_all_scripted_subevent_types(event);
        SubLObject sentences = NIL;
        if (NIL == member(event, subevents, symbol_function(EQL), symbol_function(IDENTITY))) {
            subevents = cons(event, subevents);
        }
        subevent_types = union(cycl_utilities.hl_to_el(isa.min_isa(event, UNPROVIDED, UNPROVIDED)), subevent_types, EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var = subevents;
        SubLObject subevent = NIL;
        subevent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != intersection(cycl_utilities.hl_to_el(isa.all_isa(subevent, UNPROVIDED, UNPROVIDED)), subevent_types, EQUAL, UNPROVIDED)) {
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(subevent, NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(subevent, NIL, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$7 = NIL;
                                final SubLObject token_var_$8 = NIL;
                                while (NIL == done_var_$7) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                    final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion));
                                    if (NIL != valid_$9) {
                                        final SubLObject arg0 = cycl_utilities.formula_arg0(assertion);
                                        final SubLObject arg2 = cycl_utilities.formula_arg2(assertion, UNPROVIDED);
                                        if (((((NIL != genl_predicates.genl_predP(arg0, $$isa, UNPROVIDED, UNPROVIDED)) && (NIL != genls.genlP(arg2, $$Event, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(arg0, $$SBHLTimePredicate, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(arg0, $$Role, UNPROVIDED, UNPROVIDED))) || (NIL != genl_predicates.genl_predP(arg0, $$subEvents, UNPROVIDED, UNPROVIDED))) {
                                            final SubLObject item_var = uncanonicalizer.assertion_el_formula(assertion);
                                            if (NIL == member(item_var, sentences, EQUALP, symbol_function(IDENTITY))) {
                                                sentences = cons(item_var, sentences);
                                            }
                                        }
                                    }
                                    done_var_$7 = makeBoolean(NIL == valid_$9);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            subevent = cdolist_list_var.first();
        } 
        return sentences;
    }

    /**
     *
     *
     * @param query
     * 		a symbolic query specification
     * @return INTEGERP number of documents containing that search string
     */
    @LispMethod(comment = "@param query\r\n\t\ta symbolic query specification\r\n@return INTEGERP number of documents containing that search string")
    public static final SubLObject webstore_index_doc_count_alt(SubLObject query, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $UNPROVIDED;
        }
        if (port == UNPROVIDED) {
            port = $UNPROVIDED;
        }
        {
            SubLObject query_string = lucene_index.lucene_symbolic_query_to_string(query);
            if ($UNPROVIDED == host) {
                host = lucene_index.get_ws_index_host();
            }
            if ($UNPROVIDED == port) {
                port = lucene_index.get_ws_index_port();
            }
            return lucene_index.ws_index_count(query_string, host, port);
        }
    }

    /**
     *
     *
     * @param query
     * 		a symbolic query specification
     * @return INTEGERP number of documents containing that search string
     */
    @LispMethod(comment = "@param query\r\n\t\ta symbolic query specification\r\n@return INTEGERP number of documents containing that search string")
    public static SubLObject webstore_index_doc_count(final SubLObject query, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $UNPROVIDED;
        }
        if (port == UNPROVIDED) {
            port = $UNPROVIDED;
        }
        final SubLObject query_string = lucene_index.lucene_symbolic_query_to_string(query);
        if ($UNPROVIDED == host) {
            host = lucene_index.get_ws_index_host();
        }
        if ($UNPROVIDED == port) {
            port = lucene_index.get_ws_index_port();
        }
        return lucene_index.ws_index_count(query_string, host, port);
    }

    /**
     * find terms for an index indexed with CycL terms
     *
     * @param SENTENCES;
     * 		a list of CycL sentences
     * @return DICTIONARY-P; a mapping of CycL terms to their doc counts
     */
    @LispMethod(comment = "find terms for an index indexed with CycL terms\r\n\r\n@param SENTENCES;\r\n\t\ta list of CycL sentences\r\n@return DICTIONARY-P; a mapping of CycL terms to their doc counts")
    public static final SubLObject search_terms_for_sentences_and_event_alt(SubLObject sentences, SubLObject event, SubLObject doc_count_fn) {
        if (doc_count_fn == UNPROVIDED) {
            doc_count_fn = NIL;
        }
        if (NIL == doc_count_fn) {
            doc_count_fn = symbol_function(WEBSTORE_INDEX_DOC_COUNT);
        }
        {
            SubLObject terms_seen = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            {
                SubLObject cdolist_list_var = pph_utilities.pph_salient_generalizations(event, THREE_INTEGER, UNPROVIDED, UNPROVIDED);
                SubLObject event_type = NIL;
                for (event_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event_type = cdolist_list_var.first()) {
                    potentially_add_term_for_searching(event_type, terms_seen, doc_count_fn);
                }
            }
            {
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    {
                        SubLObject terms = cycl_utilities.formula_terms(sentence, $IGNORE);
                        SubLObject cdolist_list_var_10 = terms;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , v_term = cdolist_list_var_10.first()) {
                            potentially_add_term_for_searching(v_term, terms_seen, doc_count_fn);
                        }
                    }
                }
            }
            return terms_seen;
        }
    }

    @LispMethod(comment = "find terms for an index indexed with CycL terms\r\n\r\n@param SENTENCES;\r\n\t\ta list of CycL sentences\r\n@return DICTIONARY-P; a mapping of CycL terms to their doc counts")
    public static SubLObject search_terms_for_sentences_and_event(final SubLObject sentences, final SubLObject event, SubLObject doc_count_fn) {
        if (doc_count_fn == UNPROVIDED) {
            doc_count_fn = NIL;
        }
        if (NIL == doc_count_fn) {
            doc_count_fn = symbol_function(WEBSTORE_INDEX_DOC_COUNT);
        }
        final SubLObject terms_seen = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = pph_utilities.pph_salient_generalizations(event, THREE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject event_type = NIL;
        event_type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            potentially_add_term_for_searching(event_type, terms_seen, doc_count_fn);
            cdolist_list_var = cdolist_list_var.rest();
            event_type = cdolist_list_var.first();
        } 
        cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10;
            final SubLObject terms = cdolist_list_var_$10 = cycl_utilities.formula_terms(sentence, $IGNORE);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                potentially_add_term_for_searching(v_term, terms_seen, doc_count_fn);
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                v_term = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return terms_seen;
    }

    public static final SubLObject potentially_add_term_for_searching_alt(SubLObject v_term, SubLObject terms_seen, SubLObject doc_count_fn) {
        if (NIL == dictionary.dictionary_lookup(terms_seen, v_term, UNPROVIDED)) {
            {
                SubLObject search_term = v_term;
                if (NIL != date_utilities.date_p(search_term)) {
                    {
                        SubLObject range_start = date_utilities.date_before(search_term, $list_alt98);
                        search_term = lucene_index.construct_symbolic_terminus_post_quem_query(range_start);
                    }
                }
                {
                    SubLObject count = funcall(doc_count_fn, search_term);
                    dictionary.dictionary_enter(terms_seen, search_term, count);
                    if (search_term != v_term) {
                        dictionary.dictionary_enter(terms_seen, v_term, search_term);
                    }
                    if ((NIL != cycl_grammar.cycl_nat_p(v_term)) && count.isZero()) {
                        {
                            SubLObject terms = cycl_utilities.formula_terms(v_term, $IGNORE);
                            SubLObject cdolist_list_var = terms;
                            SubLObject formula_term = NIL;
                            for (formula_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_term = cdolist_list_var.first()) {
                                potentially_add_term_for_searching(formula_term, terms_seen, doc_count_fn);
                            }
                        }
                    }
                }
            }
        }
        return v_term;
    }

    public static SubLObject potentially_add_term_for_searching(final SubLObject v_term, final SubLObject terms_seen, final SubLObject doc_count_fn) {
        if (NIL == dictionary.dictionary_lookup(terms_seen, v_term, UNPROVIDED)) {
            SubLObject search_term = v_term;
            if (NIL != date_utilities.date_p(search_term)) {
                final SubLObject range_start = date_utilities.date_before(search_term, $list103);
                search_term = lucene_index.construct_symbolic_terminus_post_quem_query(range_start);
            }
            final SubLObject count = funcall(doc_count_fn, search_term);
            dictionary.dictionary_enter(terms_seen, search_term, count);
            if (!search_term.eql(v_term)) {
                dictionary.dictionary_enter(terms_seen, v_term, search_term);
            }
            if ((NIL != cycl_grammar.cycl_nat_p(v_term)) && count.isZero()) {
                SubLObject cdolist_list_var;
                final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(v_term, $IGNORE);
                SubLObject formula_term = NIL;
                formula_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    potentially_add_term_for_searching(formula_term, terms_seen, doc_count_fn);
                    cdolist_list_var = cdolist_list_var.rest();
                    formula_term = cdolist_list_var.first();
                } 
            }
        }
        return v_term;
    }

    /**
     *
     *
     * @param SENTENCES;
     * 		a list of CycL sentences
     * @return listp; a list of strings that can be used to search for documents related to SENTENCES
     */
    @LispMethod(comment = "@param SENTENCES;\r\n\t\ta list of CycL sentences\r\n@return listp; a list of strings that can be used to search for documents related to SENTENCES")
    public static final SubLObject search_strings_for_sentences_and_event_alt(SubLObject sentences, SubLObject event) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject event_type = pph_utilities.pph_salient_generalization(event, UNPROVIDED, UNPROVIDED);
                SubLObject search_strings = (NIL != event_type) ? ((SubLObject) (pph_methods_lexicon.all_phrases_for_term(event_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    if (NIL != isa.isaP(cycl_utilities.formula_arg0(sentence), $$ActorSlot, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject _prev_bind_0 = nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.currentBinding(thread);
                            try {
                                nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.bind(NIL, thread);
                                if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(TWO_INTEGER)))) {
                                    {
                                        SubLObject new_format_string = cconcatenate($str_alt100$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt101$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(TWO_INTEGER), new SubLObject[]{ $str_alt102$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                                        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_11 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                                        {
                                            SubLObject actor_slot_value = pph_main.generate_phrase(cycl_utilities.formula_arg2(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != actor_slot_value) {
                                                {
                                                    SubLObject item_var = actor_slot_value;
                                                    if (NIL == member(item_var, search_strings, EQUAL, symbol_function(IDENTITY))) {
                                                        search_strings = cons(item_var, search_strings);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                            } finally {
                                nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return search_strings;
            }
        }
    }

    /**
     *
     *
     * @param SENTENCES;
     * 		a list of CycL sentences
     * @return listp; a list of strings that can be used to search for documents related to SENTENCES
     */
    @LispMethod(comment = "@param SENTENCES;\r\n\t\ta list of CycL sentences\r\n@return listp; a list of strings that can be used to search for documents related to SENTENCES")
    public static SubLObject search_strings_for_sentences_and_event(final SubLObject sentences, final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject event_type = pph_utilities.pph_salient_generalization(event, UNPROVIDED, UNPROVIDED);
        SubLObject search_strings = (NIL != event_type) ? pph_methods_lexicon.all_phrases_for_term(event_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isaP(cycl_utilities.formula_arg0(sentence), $$ActorSlot, UNPROVIDED, UNPROVIDED)) {
                final SubLObject _prev_bind_0 = nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                try {
                    nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.bind(NIL, thread);
                    pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                    final SubLObject actor_slot_value = pph_main.generate_phrase(cycl_utilities.formula_arg2(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != actor_slot_value) {
                        final SubLObject item_var = actor_slot_value;
                        if (NIL == member(item_var, search_strings, EQUAL, symbol_function(IDENTITY))) {
                            search_strings = cons(item_var, search_strings);
                        }
                    }
                } finally {
                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                    nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return search_strings;
    }

    /**
     *
     *
     * @param EVENT
     * 		instance of #$Event
     * @param DOCUMENT
    event-document-p
     * 		
     * @param EVENT-SOURCE-SPINDLE;
     * 		an instance of #$MicrotheorySpindle
     * @return listp; a list of new facts learned about event (already asserted in
    the KB).
     */
    @LispMethod(comment = "@param EVENT\r\n\t\tinstance of #$Event\r\n@param DOCUMENT\nevent-document-p\r\n\t\t\r\n@param EVENT-SOURCE-SPINDLE;\r\n\t\tan instance of #$MicrotheorySpindle\r\n@return listp; a list of new facts learned about event (already asserted in\r\nthe KB).")
    public static final SubLObject learn_new_facts_for_event_in_document_alt(SubLObject event, SubLObject v_document, SubLObject event_source_spindle) {
        {
            SubLObject facts = best_interpretations_of_facts(extract_event_facts_from_doc(v_document));
            SubLObject sentences_to_assert = NIL;
            if (NIL != facts) {
                {
                    SubLObject content_mt = get_event_doc_content_mt(v_document);
                    if (NIL == nart_handles.nart_p(content_mt)) {
                        {
                            SubLObject spindle_head = ask_utilities.query_variable($sym104$_HEAD, listS($$mtSpindleHead, event_source_spindle, $list_alt106), $$InferencePSC, UNPROVIDED).first();
                            event_learner_assert(list($$mtSpindleMember, event_source_spindle, content_mt), spindle_head);
                            content_mt = narts_high.nart_substitute(content_mt);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = facts;
                        SubLObject fact = NIL;
                        for (fact = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fact = cdolist_list_var.first()) {
                            {
                                SubLObject assert_formula = substitute_event_for_indexical(fact, event);
                                if (NIL != assert_formula) {
                                    {
                                        SubLObject item_var = assert_formula;
                                        if (NIL == member(item_var, sentences_to_assert, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            sentences_to_assert = cons(item_var, sentences_to_assert);
                                        }
                                    }
                                    if (NIL != event_learner_assert(assert_formula, content_mt)) {
                                    } else {
                                        Errors.warn($str_alt108$Failed_to_assert___S_in__S, assert_formula, content_mt);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return sentences_to_assert;
        }
    }

    /**
     *
     *
     * @param EVENT
     * 		instance of #$Event
     * @param DOCUMENT
    event-document-p
     * 		
     * @param EVENT-SOURCE-SPINDLE;
     * 		an instance of #$MicrotheorySpindle
     * @return listp; a list of new facts learned about event (already asserted in
    the KB).
     */
    @LispMethod(comment = "@param EVENT\r\n\t\tinstance of #$Event\r\n@param DOCUMENT\nevent-document-p\r\n\t\t\r\n@param EVENT-SOURCE-SPINDLE;\r\n\t\tan instance of #$MicrotheorySpindle\r\n@return listp; a list of new facts learned about event (already asserted in\r\nthe KB).")
    public static SubLObject learn_new_facts_for_event_in_document(final SubLObject event, final SubLObject v_document, final SubLObject event_source_spindle) {
        final SubLObject facts = best_interpretations_of_facts(extract_event_facts_from_doc(v_document));
        SubLObject sentences_to_assert = NIL;
        if (NIL != facts) {
            SubLObject content_mt = get_event_doc_content_mt(v_document);
            if (NIL == nart_handles.nart_p(content_mt)) {
                final SubLObject spindle_head = ask_utilities.query_variable($sym105$_HEAD, listS($$mtSpindleHead, event_source_spindle, $list107), $$InferencePSC, UNPROVIDED).first();
                event_learner_assert(list($$mtSpindleMember, event_source_spindle, content_mt), spindle_head);
                content_mt = narts_high.nart_substitute(content_mt);
            }
            SubLObject cdolist_list_var = facts;
            SubLObject fact = NIL;
            fact = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject assert_formula = substitute_event_for_indexical(fact, event);
                if (NIL != assert_formula) {
                    final SubLObject item_var = assert_formula;
                    if (NIL == member(item_var, sentences_to_assert, symbol_function(EQL), symbol_function(IDENTITY))) {
                        sentences_to_assert = cons(item_var, sentences_to_assert);
                    }
                    if (NIL == event_learner_assert(assert_formula, content_mt)) {
                        Errors.warn($str109$Failed_to_assert___S_in__S, assert_formula, content_mt);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                fact = cdolist_list_var.first();
            } 
        }
        return sentences_to_assert;
    }

    /**
     * Replace the indexicals in SENTENCE with the relevant subevent of EVENT, if
     * possible.  If there are no subevents that can be used, then use the EVENT
     * itself.
     *
     * @param SENTENCE
    cycl-sentence-p
     * 		
     * @param EVENT
     * 		instance of #$Event
     * @return cycl-sentence-assertible
     */
    @LispMethod(comment = "Replace the indexicals in SENTENCE with the relevant subevent of EVENT, if\r\npossible.  If there are no subevents that can be used, then use the EVENT\r\nitself.\r\n\r\n@param SENTENCE\ncycl-sentence-p\r\n\t\t\r\n@param EVENT\r\n\t\tinstance of #$Event\r\n@return cycl-sentence-assertible\nReplace the indexicals in SENTENCE with the relevant subevent of EVENT, if\npossible.  If there are no subevents that can be used, then use the EVENT\nitself.")
    public static final SubLObject substitute_event_for_indexical_alt(SubLObject sentence, SubLObject event) {
        {
            SubLObject indexicals = cycl_utilities.expression_gather(sentence, INDEXICAL_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
            SubLObject subevents = get_all_subevents(event);
            SubLObject subevent_types = get_all_scripted_subevent_types(event);
            SubLObject cdolist_list_var = indexicals;
            SubLObject indexical = NIL;
            for (indexical = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical = cdolist_list_var.first()) {
                {
                    SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
                    if (NIL != subl_promotions.memberP(indexical_event_type, subevent_types, symbol_function(EQUAL), UNPROVIDED)) {
                        {
                            SubLObject subevent_type = NIL;
                            if (NIL == subevent_type) {
                                {
                                    SubLObject csome_list_var = subevents;
                                    SubLObject subevent = NIL;
                                    for (subevent = csome_list_var.first(); !((NIL != subevent_type) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subevent = csome_list_var.first()) {
                                        if (NIL == subevent_type) {
                                            {
                                                SubLObject csome_list_var_12 = cycl_utilities.hl_to_el(isa.min_isa(subevent, $$InferencePSC, UNPROVIDED));
                                                SubLObject sub_type = NIL;
                                                for (sub_type = csome_list_var_12.first(); !((NIL != subevent_type) || (NIL == csome_list_var_12)); csome_list_var_12 = csome_list_var_12.rest() , sub_type = csome_list_var_12.first()) {
                                                    if (sub_type.equal(indexical_event_type)) {
                                                        sentence = cycl_utilities.expression_subst(subevent, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
                                                        subevent_type = sub_type;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL == subevent_type) {
                                sentence = cycl_utilities.expression_subst(event, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
                            }
                        }
                    } else {
                        sentence = cycl_utilities.expression_subst(event, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
                    }
                }
            }
            return values(sentence, indexicals);
        }
    }

    @LispMethod(comment = "Replace the indexicals in SENTENCE with the relevant subevent of EVENT, if\r\npossible.  If there are no subevents that can be used, then use the EVENT\r\nitself.\r\n\r\n@param SENTENCE\n\t\tcycl-sentence-p\r\n\t\t\r\n@param EVENT\r\n\t\tinstance of #$Event\r\n@return cycl-sentence-assertible\nReplace the indexicals in SENTENCE with the relevant subevent of EVENT, if\npossible.  If there are no subevents that can be used, then use the EVENT\nitself.")
    public static SubLObject substitute_event_for_indexical(SubLObject sentence, final SubLObject event) {
        final SubLObject indexicals = cycl_utilities.expression_gather(sentence, INDEXICAL_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        final SubLObject subevents = get_all_subevents(event);
        final SubLObject subevent_types = get_all_scripted_subevent_types(event);
        SubLObject cdolist_list_var = indexicals;
        SubLObject indexical = NIL;
        indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
            if (NIL != subl_promotions.memberP(indexical_event_type, subevent_types, symbol_function(EQUAL), UNPROVIDED)) {
                SubLObject subevent_type = NIL;
                if (NIL == subevent_type) {
                    SubLObject csome_list_var = subevents;
                    SubLObject subevent = NIL;
                    subevent = csome_list_var.first();
                    while ((NIL == subevent_type) && (NIL != csome_list_var)) {
                        if (NIL == subevent_type) {
                            SubLObject csome_list_var_$11 = cycl_utilities.hl_to_el(isa.min_isa(subevent, $$InferencePSC, UNPROVIDED));
                            SubLObject sub_type = NIL;
                            sub_type = csome_list_var_$11.first();
                            while ((NIL == subevent_type) && (NIL != csome_list_var_$11)) {
                                if (sub_type.equal(indexical_event_type)) {
                                    sentence = cycl_utilities.expression_subst(subevent, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
                                    subevent_type = sub_type;
                                }
                                csome_list_var_$11 = csome_list_var_$11.rest();
                                sub_type = csome_list_var_$11.first();
                            } 
                        }
                        csome_list_var = csome_list_var.rest();
                        subevent = csome_list_var.first();
                    } 
                }
                if (NIL == subevent_type) {
                    sentence = cycl_utilities.expression_subst(event, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
                }
            } else {
                sentence = cycl_utilities.expression_subst(event, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        } 
        return values(sentence, indexicals);
    }

    /**
     * Check if SENT should be used in EBMT template creation.
     */
    @LispMethod(comment = "Check if SENT should be used in EBMT template creation.")
    public static final SubLObject event_learning_valid_sentP_alt(SubLObject sent) {
        return sent;
    }

    @LispMethod(comment = "Check if SENT should be used in EBMT template creation.")
    public static SubLObject event_learning_valid_sentP(final SubLObject sent) {
        return sent;
    }/**
     * Check if SENT should be used in EBMT template creation.
     */


    /**
     *
     *
     * @param DOCUMENT
    event-document-p
     * 		
     * @param KNOWN-FACTS
     * 		listp; list of cycl sentences of known-facts that might be
     * 		in DOCUMENT
     * @param EVENT
     * 		instance of #$Event; the main event that KNOWN-FACTS are about
     * @unknown listp; list of cycl-sentences from KNOWN-FACTS that were confirmed
    in DOCUMENT
     * @unknown non-negative-integer-p; number of new templates derived from
    KNOWN-FACTS and DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\nevent-document-p\r\n\t\t\r\n@param KNOWN-FACTS\r\n\t\tlistp; list of cycl sentences of known-facts that might be\r\n\t\tin DOCUMENT\r\n@param EVENT\r\n\t\tinstance of #$Event; the main event that KNOWN-FACTS are about\r\n@unknown listp; list of cycl-sentences from KNOWN-FACTS that were confirmed\r\nin DOCUMENT\r\n@unknown non-negative-integer-p; number of new templates derived from\r\nKNOWN-FACTS and DOCUMENT")
    public static final SubLObject learn_new_templates_for_known_facts_alt(SubLObject v_document, SubLObject known_facts, SubLObject event) {
        {
            SubLObject fact_strings_pairs = get_markers_for_sentences(known_facts);
            SubLObject subevent_structure_sentences = subevent_sentences_from_sentences(known_facts);
            SubLObject num_templates_added = ZERO_INTEGER;
            SubLObject confirmed_facts = NIL;
            SubLObject cdolist_list_var = document.sentencify_string(get_event_doc_string(v_document));
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                if (NIL != event_learning_valid_sentP(sentence)) {
                    {
                        SubLObject fact_pairs_for_sentence = calculate_fact_pairs_for_sentences(sentence, fact_strings_pairs);
                        if (NIL != fact_pairs_for_sentence) {
                            num_templates_added = add(num_templates_added, learn_templates_for_sentence(sentence, fact_pairs_for_sentence, event, subevent_structure_sentences));
                        }
                    }
                }
            }
            return values(confirmed_facts, num_templates_added);
        }
    }

    /**
     *
     *
     * @param DOCUMENT
    event-document-p
     * 		
     * @param KNOWN-FACTS
     * 		listp; list of cycl sentences of known-facts that might be
     * 		in DOCUMENT
     * @param EVENT
     * 		instance of #$Event; the main event that KNOWN-FACTS are about
     * @unknown listp; list of cycl-sentences from KNOWN-FACTS that were confirmed
    in DOCUMENT
     * @unknown non-negative-integer-p; number of new templates derived from
    KNOWN-FACTS and DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\nevent-document-p\r\n\t\t\r\n@param KNOWN-FACTS\r\n\t\tlistp; list of cycl sentences of known-facts that might be\r\n\t\tin DOCUMENT\r\n@param EVENT\r\n\t\tinstance of #$Event; the main event that KNOWN-FACTS are about\r\n@unknown listp; list of cycl-sentences from KNOWN-FACTS that were confirmed\r\nin DOCUMENT\r\n@unknown non-negative-integer-p; number of new templates derived from\r\nKNOWN-FACTS and DOCUMENT")
    public static SubLObject learn_new_templates_for_known_facts(final SubLObject v_document, final SubLObject known_facts, final SubLObject event) {
        final SubLObject fact_strings_pairs = get_markers_for_sentences(known_facts);
        final SubLObject subevent_structure_sentences = subevent_sentences_from_sentences(known_facts);
        SubLObject num_templates_added = ZERO_INTEGER;
        final SubLObject confirmed_facts = NIL;
        SubLObject cdolist_list_var = document.sentencify_string(get_event_doc_string(v_document));
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != event_learning_valid_sentP(sentence)) {
                final SubLObject fact_pairs_for_sentence = calculate_fact_pairs_for_sentences(sentence, fact_strings_pairs);
                if (NIL != fact_pairs_for_sentence) {
                    num_templates_added = add(num_templates_added, learn_templates_for_sentence(sentence, fact_pairs_for_sentence, event, subevent_structure_sentences));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return values(confirmed_facts, num_templates_added);
    }

    public static final SubLObject calculate_fact_pairs_for_sentences_alt(SubLObject sentence, SubLObject fact_strings_pairs) {
        {
            SubLObject fact_pairs_for_sentence = NIL;
            SubLObject cdolist_list_var = fact_strings_pairs;
            SubLObject fact_with_strings = NIL;
            for (fact_with_strings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fact_with_strings = cdolist_list_var.first()) {
                {
                    SubLObject datum = fact_with_strings;
                    SubLObject current = datum;
                    SubLObject fact = NIL;
                    SubLObject marker_strings = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt110);
                    fact = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt110);
                    marker_strings = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject valid_marker_groups = NIL;
                            SubLObject cdolist_list_var_13 = marker_strings;
                            SubLObject marker_group = NIL;
                            for (marker_group = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , marker_group = cdolist_list_var_13.first()) {
                                {
                                    SubLObject valid_markers = NIL;
                                    SubLObject cdolist_list_var_14 = marker_group;
                                    SubLObject marker = NIL;
                                    for (marker = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , marker = cdolist_list_var_14.first()) {
                                        if (NIL != string_utilities.subwordP(marker, sentence, $list_alt111, UNPROVIDED)) {
                                            valid_markers = cons(marker, valid_markers);
                                        }
                                    }
                                    if (NIL != valid_markers) {
                                        {
                                            SubLObject item_var = valid_markers;
                                            if (NIL == member(item_var, valid_marker_groups, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                valid_marker_groups = cons(item_var, valid_marker_groups);
                                            }
                                        }
                                    }
                                }
                            }
                            if (length(valid_marker_groups).numG(ONE_INTEGER)) {
                                fact_pairs_for_sentence = cons(list(fact, list_utilities.remove_subsumed_items(list_utilities.flatten(valid_marker_groups), $sym112$PROPER_SUPERSTRING_, UNPROVIDED)), fact_pairs_for_sentence);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt110);
                    }
                }
            }
            return fact_pairs_for_sentence;
        }
    }

    public static SubLObject calculate_fact_pairs_for_sentences(final SubLObject sentence, final SubLObject fact_strings_pairs) {
        SubLObject fact_pairs_for_sentence = NIL;
        SubLObject cdolist_list_var = fact_strings_pairs;
        SubLObject fact_with_strings = NIL;
        fact_with_strings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = fact_with_strings;
            SubLObject fact = NIL;
            SubLObject marker_strings = NIL;
            destructuring_bind_must_consp(current, datum, $list111);
            fact = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list111);
            marker_strings = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject valid_marker_groups = NIL;
                SubLObject cdolist_list_var_$12 = marker_strings;
                SubLObject marker_group = NIL;
                marker_group = cdolist_list_var_$12.first();
                while (NIL != cdolist_list_var_$12) {
                    SubLObject valid_markers = NIL;
                    SubLObject cdolist_list_var_$13 = marker_group;
                    SubLObject marker = NIL;
                    marker = cdolist_list_var_$13.first();
                    while (NIL != cdolist_list_var_$13) {
                        if (NIL != string_utilities.subwordP(marker, sentence, $list112, UNPROVIDED)) {
                            valid_markers = cons(marker, valid_markers);
                        }
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        marker = cdolist_list_var_$13.first();
                    } 
                    if (NIL != valid_markers) {
                        final SubLObject item_var = valid_markers;
                        if (NIL == member(item_var, valid_marker_groups, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            valid_marker_groups = cons(item_var, valid_marker_groups);
                        }
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    marker_group = cdolist_list_var_$12.first();
                } 
                if (length(valid_marker_groups).numG(ONE_INTEGER)) {
                    fact_pairs_for_sentence = cons(list(fact, list_utilities.remove_subsumed_items(list_utilities.flatten(valid_marker_groups), $sym113$PROPER_SUPERSTRING_, UNPROVIDED)), fact_pairs_for_sentence);
                }
            } else {
                cdestructuring_bind_error(datum, $list111);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fact_with_strings = cdolist_list_var.first();
        } 
        return fact_pairs_for_sentence;
    }

    public static final SubLObject subevent_sentences_from_sentences_alt(SubLObject sentences) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                if (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$subEvents, UNPROVIDED, UNPROVIDED)) {
                    result = cons(sentence, result);
                }
            }
            return result;
        }
    }

    public static SubLObject subevent_sentences_from_sentences(final SubLObject sentences) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), $$subEvents, UNPROVIDED, UNPROVIDED)) {
                result = cons(sentence, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * Paraphrases CycL term INDIVIDUAL
     */
    @LispMethod(comment = "Paraphrases CycL term INDIVIDUAL")
    public static final SubLObject phrases_for_individual_alt(SubLObject individual) {
        {
            SubLObject phrases = pph_methods_lexicon.all_phrases_for_term(individual, $ALL, $list_alt114, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != isa.isaP(individual, $$Date, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject info = pph_types.pph_method_info(GENERATE_ENGLISH_DAY_NAUT, NIL);
                    pph_types.pph_deregister_method_info(GENERATE_ENGLISH_DAY_NAUT, info);
                    try {
                        {
                            SubLObject item_var = pph_main.generate_phrase(individual, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL == member(item_var, phrases, EQUAL, symbol_function(IDENTITY))) {
                                phrases = cons(item_var, phrases);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                pph_types.pph_register_method_info(GENERATE_ENGLISH_DAY_NAUT, info);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return phrases;
        }
    }

    @LispMethod(comment = "Paraphrases CycL term INDIVIDUAL")
    public static SubLObject phrases_for_individual(final SubLObject individual) {
        SubLObject phrases = pph_methods_lexicon.all_phrases_for_term(individual, $ALL, $list115, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != isa.isaP(individual, $$Date, UNPROVIDED, UNPROVIDED)) {
            final SubLObject info = pph_types.pph_method_info(GENERATE_ENGLISH_DAY_NAUT, NIL);
            pph_types.pph_deregister_method_info(GENERATE_ENGLISH_DAY_NAUT, info);
            try {
                final SubLObject item_var = pph_main.generate_phrase(individual, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == member(item_var, phrases, EQUAL, symbol_function(IDENTITY))) {
                    phrases = cons(item_var, phrases);
                }
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    pph_types.pph_register_method_info(GENERATE_ENGLISH_DAY_NAUT, info);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return phrases;
    }/**
     * Paraphrases CycL term INDIVIDUAL
     */


    /**
     * get strings that are likely to come up in an NL sentence that means
     * CYCL-SENTENCE
     *
     * @param CYCL-SENTENCES
     * 		listp of cycl-sentence-p
     * @return listp; a list of strings
     */
    @LispMethod(comment = "get strings that are likely to come up in an NL sentence that means\r\nCYCL-SENTENCE\r\n\r\n@param CYCL-SENTENCES\r\n\t\tlistp of cycl-sentence-p\r\n@return listp; a list of strings\nget strings that are likely to come up in an NL sentence that means\nCYCL-SENTENCE")
    public static final SubLObject get_markers_for_sentences_alt(SubLObject cycl_sentences) {
        {
            SubLObject all_event_types = get_all_event_types_from_sentences(cycl_sentences, UNPROVIDED);
            SubLObject subevent_sentences = subevent_sentences_from_sentences(cycl_sentences);
            SubLObject result_strings = NIL;
            SubLObject cdolist_list_var = cycl_sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                {
                    SubLObject markers_for_sentence = NIL;
                    if (NIL == subl_promotions.memberP(sentence, subevent_sentences, EQUAL, UNPROVIDED)) {
                        {
                            SubLObject predicate = cycl_utilities.formula_operator(sentence);
                            SubLObject allow_collectionsP = genl_predicates.genl_predP(predicate, $$isa, UNPROVIDED, UNPROVIDED);
                            SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                            SubLObject cdolist_list_var_15 = args;
                            SubLObject arg = NIL;
                            for (arg = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , arg = cdolist_list_var_15.first()) {
                                markers_for_sentence = collect_marker_for_individual_cycl_term(arg, all_event_types, allow_collectionsP, markers_for_sentence);
                            }
                        }
                    }
                    result_strings = cons(list(sentence, markers_for_sentence), result_strings);
                }
            }
            return result_strings;
        }
    }

    @LispMethod(comment = "get strings that are likely to come up in an NL sentence that means\r\nCYCL-SENTENCE\r\n\r\n@param CYCL-SENTENCES\r\n\t\tlistp of cycl-sentence-p\r\n@return listp; a list of strings\nget strings that are likely to come up in an NL sentence that means\nCYCL-SENTENCE")
    public static SubLObject get_markers_for_sentences(final SubLObject cycl_sentences) {
        final SubLObject all_event_types = get_all_event_types_from_sentences(cycl_sentences, UNPROVIDED);
        final SubLObject subevent_sentences = subevent_sentences_from_sentences(cycl_sentences);
        SubLObject result_strings = NIL;
        SubLObject cdolist_list_var = cycl_sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject markers_for_sentence = NIL;
            if (NIL == subl_promotions.memberP(sentence, subevent_sentences, EQUAL, UNPROVIDED)) {
                final SubLObject predicate = cycl_utilities.formula_operator(sentence);
                final SubLObject allow_collectionsP = genl_predicates.genl_predP(predicate, $$isa, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var_$14;
                final SubLObject args = cdolist_list_var_$14 = cycl_utilities.formula_args(sentence, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var_$14.first();
                while (NIL != cdolist_list_var_$14) {
                    markers_for_sentence = collect_marker_for_individual_cycl_term(arg, all_event_types, allow_collectionsP, markers_for_sentence);
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    arg = cdolist_list_var_$14.first();
                } 
            }
            result_strings = cons(list(sentence, markers_for_sentence), result_strings);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return result_strings;
    }/**
     * get strings that are likely to come up in an NL sentence that means
     * CYCL-SENTENCE
     *
     * @param CYCL-SENTENCES
     * 		listp of cycl-sentence-p
     * @return listp; a list of strings
     */


    public static final SubLObject collect_marker_for_individual_cycl_term_alt(SubLObject v_term, SubLObject all_event_types, SubLObject allow_collectionsP, SubLObject markers_for_sentence) {
        if (markers_for_sentence == UNPROVIDED) {
            markers_for_sentence = NIL;
        }
        if (NIL != isa.isaP(v_term, $$Event, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject phrases = NIL;
                SubLObject cdolist_list_var = isa.min_isa(v_term, UNPROVIDED, UNPROVIDED);
                SubLObject event_type = NIL;
                for (event_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event_type = cdolist_list_var.first()) {
                    phrases = cconcatenate(marker_strings_for_event_type(event_type, all_event_types, UNPROVIDED), phrases);
                }
                {
                    SubLObject item_var = phrases;
                    if (NIL == member(item_var, markers_for_sentence, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        markers_for_sentence = cons(item_var, markers_for_sentence);
                    }
                }
            }
        } else {
            if (!((NIL != isa.isaP(v_term, $$Relation, UNPROVIDED, UNPROVIDED)) || ((NIL == allow_collectionsP) && (NIL != isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED))))) {
                {
                    SubLObject item_var = pph_methods_lexicon.all_phrases_for_term(v_term, $ALL, $list_alt114, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == member(item_var, markers_for_sentence, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        markers_for_sentence = cons(item_var, markers_for_sentence);
                    }
                }
            }
        }
        if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
            {
                SubLObject terms = cycl_utilities.formula_terms(v_term, $IGNORE);
                SubLObject cdolist_list_var = terms;
                SubLObject sub_term = NIL;
                for (sub_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_term = cdolist_list_var.first()) {
                    markers_for_sentence = collect_marker_for_individual_cycl_term(sub_term, all_event_types, allow_collectionsP, markers_for_sentence);
                }
            }
        }
        return markers_for_sentence;
    }

    public static SubLObject collect_marker_for_individual_cycl_term(final SubLObject v_term, final SubLObject all_event_types, final SubLObject allow_collectionsP, SubLObject markers_for_sentence) {
        if (markers_for_sentence == UNPROVIDED) {
            markers_for_sentence = NIL;
        }
        if (NIL != isa.isaP(v_term, $$Event, UNPROVIDED, UNPROVIDED)) {
            SubLObject phrases = NIL;
            SubLObject cdolist_list_var = isa.min_isa(v_term, UNPROVIDED, UNPROVIDED);
            SubLObject event_type = NIL;
            event_type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                phrases = cconcatenate(marker_strings_for_event_type(event_type, all_event_types, UNPROVIDED), phrases);
                cdolist_list_var = cdolist_list_var.rest();
                event_type = cdolist_list_var.first();
            } 
            final SubLObject item_var = phrases;
            if (NIL == member(item_var, markers_for_sentence, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                markers_for_sentence = cons(item_var, markers_for_sentence);
            }
        } else
            if ((NIL == isa.isaP(v_term, $$Relation, UNPROVIDED, UNPROVIDED)) && ((NIL != allow_collectionsP) || (NIL == isa.isaP(v_term, $$Collection, UNPROVIDED, UNPROVIDED)))) {
                final SubLObject item_var2 = pph_methods_lexicon.all_phrases_for_term(v_term, $ALL, $list115, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == member(item_var2, markers_for_sentence, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    markers_for_sentence = cons(item_var2, markers_for_sentence);
                }
            }

        if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
            SubLObject cdolist_list_var;
            final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(v_term, $IGNORE);
            SubLObject sub_term = NIL;
            sub_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                markers_for_sentence = collect_marker_for_individual_cycl_term(sub_term, all_event_types, allow_collectionsP, markers_for_sentence);
                cdolist_list_var = cdolist_list_var.rest();
                sub_term = cdolist_list_var.first();
            } 
        }
        return markers_for_sentence;
    }

    public static final SubLObject get_all_event_types_from_sentences_alt(SubLObject sentences, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject events = list_utilities.tree_gather(sentences, CYCL_EVENT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject event_types = NIL;
            SubLObject cdolist_list_var = events;
            SubLObject event = NIL;
            for (event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event = cdolist_list_var.first()) {
                event_types = cconcatenate(isa.min_isa(event, mt, UNPROVIDED), event_types);
            }
            return event_types;
        }
    }

    public static SubLObject get_all_event_types_from_sentences(final SubLObject sentences, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject events = list_utilities.tree_gather(sentences, CYCL_EVENT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject event_types = NIL;
        SubLObject cdolist_list_var = events;
        SubLObject event = NIL;
        event = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            event_types = cconcatenate(isa.min_isa(event, mt, UNPROVIDED), event_types);
            cdolist_list_var = cdolist_list_var.rest();
            event = cdolist_list_var.first();
        } 
        return event_types;
    }

    public static final SubLObject cycl_event_p_alt(SubLObject obj) {
        return makeBoolean((NIL != forts.fort_p(obj)) && (NIL != isa.isa_in_any_mtP(obj, $$Event)));
    }

    public static SubLObject cycl_event_p(final SubLObject obj) {
        return makeBoolean((NIL != forts.fort_p(obj)) && (NIL != isa.isa_in_any_mtP(obj, $$Event)));
    }

    public static final SubLObject marker_strings_for_event_type_alt(SubLObject event_type, SubLObject reference_event_types, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject non_shared_genls_list = differentiate_genls_lists(union(list(event_type), reference_event_types, UNPROVIDED, UNPROVIDED), mt);
            SubLObject differentiated_phrase_list = get_phrases_for_differentiated_event_types(non_shared_genls_list, UNPROVIDED);
            return second(find(event_type, differentiated_phrase_list, EQUAL, FIRST, UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject marker_strings_for_event_type(final SubLObject event_type, final SubLObject reference_event_types, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject non_shared_genls_list = differentiate_genls_lists(union(list(event_type), reference_event_types, UNPROVIDED, UNPROVIDED), mt);
        final SubLObject differentiated_phrase_list = get_phrases_for_differentiated_event_types(non_shared_genls_list, UNPROVIDED);
        return second(find(event_type, differentiated_phrase_list, EQUAL, FIRST, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject clear_get_phrases_for_differentiated_event_types_alt() {
        {
            SubLObject cs = $get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_get_phrases_for_differentiated_event_types() {
        final SubLObject cs = $get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_get_phrases_for_differentiated_event_types_alt(SubLObject differentiated_event_types, SubLObject semantic_mt) {
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue(), list(differentiated_event_types, semantic_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_get_phrases_for_differentiated_event_types(final SubLObject differentiated_event_types, SubLObject semantic_mt) {
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue(), list(differentiated_event_types, semantic_mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param DIFFERENTIATED-EVENT-TYPES
     * 		listp; a list of specs of #$Event
     * @return listp; a list, each element of which takes this form (EVENT-TYPE (STRING1 STRING2 STRING3)), where
    the strings are words that indicate EVENT-TYPE, and do not indicate any other element of
    DIFFERENTIATED-EVENT-TYPES.
     */
    @LispMethod(comment = "@param DIFFERENTIATED-EVENT-TYPES\r\n\t\tlistp; a list of specs of #$Event\r\n@return listp; a list, each element of which takes this form (EVENT-TYPE (STRING1 STRING2 STRING3)), where\r\nthe strings are words that indicate EVENT-TYPE, and do not indicate any other element of\r\nDIFFERENTIATED-EVENT-TYPES.")
    public static final SubLObject get_phrases_for_differentiated_event_types_internal_alt(SubLObject differentiated_event_types, SubLObject semantic_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject possibly_duplicate_results = NIL;
                SubLObject final_results = NIL;
                {
                    SubLObject cdolist_list_var = differentiated_event_types;
                    SubLObject event_type_differentia = NIL;
                    for (event_type_differentia = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event_type_differentia = cdolist_list_var.first()) {
                        {
                            SubLObject phrases = NIL;
                            SubLObject datum = event_type_differentia;
                            SubLObject current = datum;
                            SubLObject event_type = NIL;
                            SubLObject differentiated_genls = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt122);
                            event_type = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt122);
                            differentiated_genls = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject cdolist_list_var_16 = differentiated_genls;
                                    SubLObject differentiated_event_type = NIL;
                                    for (differentiated_event_type = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , differentiated_event_type = cdolist_list_var_16.first()) {
                                        phrases = union(phrases, ask_utilities.query_variable($sym123$_STRING, listS($$termPhrases, differentiated_event_type, $list_alt125), list($$MtUnionFn, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), semantic_mt), UNPROVIDED), EQUAL, UNPROVIDED);
                                    }
                                }
                                possibly_duplicate_results = cons(list(event_type, phrases), possibly_duplicate_results);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt122);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = possibly_duplicate_results;
                    SubLObject result_item = NIL;
                    for (result_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result_item = cdolist_list_var.first()) {
                        {
                            SubLObject datum = result_item;
                            SubLObject current = datum;
                            SubLObject event_type = NIL;
                            SubLObject phrases = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt127);
                            event_type = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt127);
                            phrases = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject my_good_phrases = NIL;
                                    SubLObject cdolist_list_var_17 = phrases;
                                    SubLObject phrase = NIL;
                                    for (phrase = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , phrase = cdolist_list_var_17.first()) {
                                        if (NIL == find(phrase, possibly_duplicate_results, EQUAL, SECOND, UNPROVIDED, UNPROVIDED)) {
                                            my_good_phrases = cons(phrase, my_good_phrases);
                                        }
                                    }
                                    final_results = cons(list(event_type, my_good_phrases), final_results);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt127);
                            }
                        }
                    }
                }
                return final_results;
            }
        }
    }

    /**
     *
     *
     * @param DIFFERENTIATED-EVENT-TYPES
     * 		listp; a list of specs of #$Event
     * @return listp; a list, each element of which takes this form (EVENT-TYPE (STRING1 STRING2 STRING3)), where
    the strings are words that indicate EVENT-TYPE, and do not indicate any other element of
    DIFFERENTIATED-EVENT-TYPES.
     */
    @LispMethod(comment = "@param DIFFERENTIATED-EVENT-TYPES\r\n\t\tlistp; a list of specs of #$Event\r\n@return listp; a list, each element of which takes this form (EVENT-TYPE (STRING1 STRING2 STRING3)), where\r\nthe strings are words that indicate EVENT-TYPE, and do not indicate any other element of\r\nDIFFERENTIATED-EVENT-TYPES.")
    public static SubLObject get_phrases_for_differentiated_event_types_internal(final SubLObject differentiated_event_types, final SubLObject semantic_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject possibly_duplicate_results = NIL;
        SubLObject final_results = NIL;
        SubLObject cdolist_list_var = differentiated_event_types;
        SubLObject event_type_differentia = NIL;
        event_type_differentia = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject phrases = NIL;
            SubLObject current;
            final SubLObject datum = current = event_type_differentia;
            SubLObject event_type = NIL;
            SubLObject differentiated_genls = NIL;
            destructuring_bind_must_consp(current, datum, $list123);
            event_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list123);
            differentiated_genls = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$15 = differentiated_genls;
                SubLObject differentiated_event_type = NIL;
                differentiated_event_type = cdolist_list_var_$15.first();
                while (NIL != cdolist_list_var_$15) {
                    phrases = union(phrases, ask_utilities.query_variable($sym124$_STRING, listS($$termPhrases, differentiated_event_type, $list126), list($$MtUnionFn, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), semantic_mt), UNPROVIDED), EQUAL, UNPROVIDED);
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    differentiated_event_type = cdolist_list_var_$15.first();
                } 
                possibly_duplicate_results = cons(list(event_type, phrases), possibly_duplicate_results);
            } else {
                cdestructuring_bind_error(datum, $list123);
            }
            cdolist_list_var = cdolist_list_var.rest();
            event_type_differentia = cdolist_list_var.first();
        } 
        cdolist_list_var = possibly_duplicate_results;
        SubLObject result_item = NIL;
        result_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = result_item;
            SubLObject event_type2 = NIL;
            SubLObject phrases2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list128);
            event_type2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list128);
            phrases2 = current2.first();
            current2 = current2.rest();
            if (NIL == current2) {
                SubLObject my_good_phrases = NIL;
                SubLObject cdolist_list_var_$16 = phrases2;
                SubLObject phrase = NIL;
                phrase = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    if (NIL == find(phrase, possibly_duplicate_results, EQUAL, SECOND, UNPROVIDED, UNPROVIDED)) {
                        my_good_phrases = cons(phrase, my_good_phrases);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    phrase = cdolist_list_var_$16.first();
                } 
                final_results = cons(list(event_type2, my_good_phrases), final_results);
            } else {
                cdestructuring_bind_error(datum2, $list128);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result_item = cdolist_list_var.first();
        } 
        return final_results;
    }

    public static final SubLObject get_phrases_for_differentiated_event_types_alt(SubLObject differentiated_event_types, SubLObject semantic_mt) {
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES, $get_phrases_for_differentiated_event_types_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(differentiated_event_types, semantic_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (differentiated_event_types.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && semantic_mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(get_phrases_for_differentiated_event_types_internal(differentiated_event_types, semantic_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(differentiated_event_types, semantic_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject get_phrases_for_differentiated_event_types(final SubLObject differentiated_event_types, SubLObject semantic_mt) {
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES, $get_phrases_for_differentiated_event_types_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(differentiated_event_types, semantic_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (differentiated_event_types.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && semantic_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_phrases_for_differentiated_event_types_internal(differentiated_event_types, semantic_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(differentiated_event_types, semantic_mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @param COLLS
     * 		listp; the list of collections that you're to differentiate
     * @param MT
    hlmt-p
     * 		
     * @return listp; a list of the form ((coll1 (differentiator1 differentiator2 ...))
    (coll2 (differentiator3 differentiator4 ...)))
    For example, differentiator1 is a collection that is a genls of coll1, but not
    a genls of any other member of COLLS.
     */
    @LispMethod(comment = "@param COLLS\r\n\t\tlistp; the list of collections that you\'re to differentiate\r\n@param MT\nhlmt-p\r\n\t\t\r\n@return listp; a list of the form ((coll1 (differentiator1 differentiator2 ...))\r\n(coll2 (differentiator3 differentiator4 ...)))\r\nFor example, differentiator1 is a collection that is a genls of coll1, but not\r\na genls of any other member of COLLS.")
    public static final SubLObject differentiate_genls_lists_alt(SubLObject colls, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result_list = NIL;
            SubLObject cdolist_list_var = colls;
            SubLObject coll = NIL;
            for (coll = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coll = cdolist_list_var.first()) {
                {
                    SubLObject others = remove(coll, colls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject differentiating_genls = differentiating_genls(coll, others, mt);
                    result_list = cons(list(coll, differentiating_genls), result_list);
                }
            }
            return result_list;
        }
    }

    /**
     *
     *
     * @param COLLS
     * 		listp; the list of collections that you're to differentiate
     * @param MT
    hlmt-p
     * 		
     * @return listp; a list of the form ((coll1 (differentiator1 differentiator2 ...))
    (coll2 (differentiator3 differentiator4 ...)))
    For example, differentiator1 is a collection that is a genls of coll1, but not
    a genls of any other member of COLLS.
     */
    @LispMethod(comment = "@param COLLS\r\n\t\tlistp; the list of collections that you\'re to differentiate\r\n@param MT\nhlmt-p\r\n\t\t\r\n@return listp; a list of the form ((coll1 (differentiator1 differentiator2 ...))\r\n(coll2 (differentiator3 differentiator4 ...)))\r\nFor example, differentiator1 is a collection that is a genls of coll1, but not\r\na genls of any other member of COLLS.")
    public static SubLObject differentiate_genls_lists(final SubLObject colls, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject result_list = NIL;
        SubLObject cdolist_list_var = colls;
        SubLObject coll = NIL;
        coll = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject others = remove(coll, colls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject differentiating_genls = differentiating_genls(coll, others, mt);
            result_list = cons(list(coll, differentiating_genls), result_list);
            cdolist_list_var = cdolist_list_var.rest();
            coll = cdolist_list_var.first();
        } 
        return result_list;
    }

    public static final SubLObject clear_differentiating_genls_alt() {
        {
            SubLObject cs = $differentiating_genls_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_differentiating_genls() {
        final SubLObject cs = $differentiating_genls_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_differentiating_genls_alt(SubLObject coll, SubLObject differentia, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($differentiating_genls_caching_state$.getGlobalValue(), list(coll, differentia, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_differentiating_genls(final SubLObject coll, final SubLObject differentia, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($differentiating_genls_caching_state$.getGlobalValue(), list(coll, differentia, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param COLLECTION
    collection-p
     * 		
     * @param differentia
     * 		listp; listp of collection-ps
     * @param mt
    hlmt-p
     * 		
     * @return listp; the collections that are genls of COLL, but not genls of any member of DIFFERENTIA.
     */
    @LispMethod(comment = "@param COLLECTION\ncollection-p\r\n\t\t\r\n@param differentia\r\n\t\tlistp; listp of collection-ps\r\n@param mt\nhlmt-p\r\n\t\t\r\n@return listp; the collections that are genls of COLL, but not genls of any member of DIFFERENTIA.")
    public static final SubLObject differentiating_genls_internal_alt(SubLObject coll, SubLObject differentia, SubLObject mt) {
        return ask_utilities.query_variable($GENL, list($$and, listS($$genls, coll, $list_alt132), list($$unknownSentence, list($$thereExists, $sym135$_OTHER_TYPE, listS($$and, list($$elementOf, $sym135$_OTHER_TYPE, bq_cons($$TheSet, differentia)), $list_alt138)))), mt, UNPROVIDED);
    }

    /**
     *
     *
     * @param COLLECTION
    collection-p
     * 		
     * @param differentia
     * 		listp; listp of collection-ps
     * @param mt
    hlmt-p
     * 		
     * @return listp; the collections that are genls of COLL, but not genls of any member of DIFFERENTIA.
     */
    @LispMethod(comment = "@param COLLECTION\ncollection-p\r\n\t\t\r\n@param differentia\r\n\t\tlistp; listp of collection-ps\r\n@param mt\nhlmt-p\r\n\t\t\r\n@return listp; the collections that are genls of COLL, but not genls of any member of DIFFERENTIA.")
    public static SubLObject differentiating_genls_internal(final SubLObject coll, final SubLObject differentia, final SubLObject mt) {
        return ask_utilities.query_variable($GENL, list($$and, listS($$genls, coll, $list133), list($$unknownSentence, list($$thereExists, $sym136$_OTHER_TYPE, listS($$and, list($$elementOf, $sym136$_OTHER_TYPE, bq_cons($$TheSet, differentia)), $list139)))), mt, UNPROVIDED);
    }

    public static final SubLObject differentiating_genls_alt(SubLObject coll, SubLObject differentia, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $differentiating_genls_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(DIFFERENTIATING_GENLS, $differentiating_genls_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
                memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_DIFFERENTIATING_GENLS);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(coll, differentia, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw67$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (coll.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (differentia.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(differentiating_genls_internal(coll, differentia, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(coll, differentia, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject differentiating_genls(final SubLObject coll, final SubLObject differentia, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $differentiating_genls_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DIFFERENTIATING_GENLS, $differentiating_genls_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_DIFFERENTIATING_GENLS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(coll, differentia, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (coll.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (differentia.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(differentiating_genls_internal(coll, differentia, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(coll, differentia, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject partial_linkage_alt(SubLObject v_word_linkage, SubLObject sorted_nl_markers) {
        {
            SubLObject selected_links = NIL;
            while (length(sorted_nl_markers).numG(ONE_INTEGER)) {
                selected_links = nunion(selected_links, linkage_path_between(v_word_linkage, sorted_nl_markers.first(), second(sorted_nl_markers)), UNPROVIDED, UNPROVIDED);
                sorted_nl_markers = sorted_nl_markers.rest();
            } 
            return selected_links;
        }
    }

    public static SubLObject partial_linkage(final SubLObject v_word_linkage, SubLObject sorted_nl_markers) {
        SubLObject selected_links = NIL;
        while (length(sorted_nl_markers).numG(ONE_INTEGER)) {
            selected_links = nunion(selected_links, linkage_path_between(v_word_linkage, sorted_nl_markers.first(), second(sorted_nl_markers)), UNPROVIDED, UNPROVIDED);
            sorted_nl_markers = sorted_nl_markers.rest();
        } 
        return selected_links;
    }

    /**
     * Given a list of linkage links, it returns the strings of the linkwords that
     * are attached to these links.
     */
    @LispMethod(comment = "Given a list of linkage links, it returns the strings of the linkwords that\r\nare attached to these links.\nGiven a list of linkage links, it returns the strings of the linkwords that\nare attached to these links.")
    public static final SubLObject linkword_strings_in_linkage_links_alt(SubLObject links) {
        {
            SubLObject linkword_strings = NIL;
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                {
                    SubLObject item_var = methods.funcall_instance_method_with_0_args(linkage.link_left_word(link), GET_STRING);
                    if (NIL == member(item_var, linkword_strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        linkword_strings = cons(item_var, linkword_strings);
                    }
                }
                {
                    SubLObject item_var = methods.funcall_instance_method_with_0_args(linkage.link_right_word(link), GET_STRING);
                    if (NIL == member(item_var, linkword_strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        linkword_strings = cons(item_var, linkword_strings);
                    }
                }
            }
            return linkword_strings;
        }
    }

    @LispMethod(comment = "Given a list of linkage links, it returns the strings of the linkwords that\r\nare attached to these links.\nGiven a list of linkage links, it returns the strings of the linkwords that\nare attached to these links.")
    public static SubLObject linkword_strings_in_linkage_links(final SubLObject links) {
        SubLObject linkword_strings = NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = methods.funcall_instance_method_with_0_args(linkage.link_left_word(link), GET_STRING);
            if (NIL == member(item_var, linkword_strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                linkword_strings = cons(item_var, linkword_strings);
            }
            item_var = methods.funcall_instance_method_with_0_args(linkage.link_right_word(link), GET_STRING);
            if (NIL == member(item_var, linkword_strings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                linkword_strings = cons(item_var, linkword_strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return linkword_strings;
    }/**
     * Given a list of linkage links, it returns the strings of the linkwords that
     * are attached to these links.
     */


    /**
     * Creates special event-learning EBMT templates.  These templates are different
     * from the standard EBMT templates becuase they contain only a part of the
     * word-linkage that is computed for the English sentence NL.  The selected part
     * is the part of the word-linkage that is between the NL-MARKERS.
     *
     * @param NL
     * 		stringp; an English sentence
     * @param CYCL
    cycl-sentence-p;
     * 		
     * @param NL-MARKERS
     * 		listp; list of strings that are the markers used to select
     * 		the part of the linkage that is relevant to creating the template
     * @param ALLOW-MULTIPLE-MATCHES?
    booleanp
     * 		
     */
    @LispMethod(comment = "Creates special event-learning EBMT templates.  These templates are different\r\nfrom the standard EBMT templates becuase they contain only a part of the\r\nword-linkage that is computed for the English sentence NL.  The selected part\r\nis the part of the word-linkage that is between the NL-MARKERS.\r\n\r\n@param NL\r\n\t\tstringp; an English sentence\r\n@param CYCL\ncycl-sentence-p;\r\n\t\t\r\n@param NL-MARKERS\r\n\t\tlistp; list of strings that are the markers used to select\r\n\t\tthe part of the linkage that is relevant to creating the template\r\n@param ALLOW-MULTIPLE-MATCHES?\nbooleanp\nCreates special event-learning EBMT templates.  These templates are different\nfrom the standard EBMT templates becuase they contain only a part of the\nword-linkage that is computed for the English sentence NL.  The selected part\nis the part of the word-linkage that is between the NL-MARKERS.")
    public static final SubLObject event_learning_create_template_alt(SubLObject nl, SubLObject cycl, SubLObject nl_markers, SubLObject allow_multiple_matchesP) {
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canonical_cycl = ebmt_template_parser.ebmt_canonicalize_el_sentence(cycl, $$InferencePSC);
                SubLObject err_msg = NIL;
                SubLObject v_linkage = NIL;
                SubLObject mapped_terms = NIL;
                SubLObject cycl_term_vars = NIL;
                SubLObject nl_term_vars = NIL;
                SubLObject relevant_links = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_linkage_18 = ebmt_template_parser.ebmt_linkage_and_mapped_terms(nl, cycl, ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED), NIL);
                                    SubLObject mapped_terms_19 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    v_linkage = v_linkage_18;
                                    mapped_terms = mapped_terms_19;
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject cycl_term_vars_20 = ebmt_template_parser.ebmt_mapped_term_vars(nl, cycl, mapped_terms, v_linkage, allow_multiple_matchesP);
                                    SubLObject nl_term_vars_21 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    cycl_term_vars = cycl_term_vars_20;
                                    nl_term_vars = nl_term_vars_21;
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != err_msg) {
                    Errors.warn(string_utilities.string_subst($str_alt143$__, $str_alt144$_, err_msg, UNPROVIDED));
                    return NIL;
                }
                relevant_links = partial_linkage(v_linkage, nl_markers);
                if (NIL == relevant_links) {
                    return NIL;
                }
                {
                    SubLObject relevant_nl_terms = linkword_strings_in_linkage_links(relevant_links);
                    SubLObject cdolist_list_var = mapped_terms;
                    SubLObject cycl_nl_mapped_pair = NIL;
                    for (cycl_nl_mapped_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_nl_mapped_pair = cdolist_list_var.first()) {
                        {
                            SubLObject nl_term = cycl_nl_mapped_pair.rest();
                            SubLObject cycl_term = cycl_nl_mapped_pair.first();
                            if (NIL == subl_promotions.memberP(nl_term, relevant_nl_terms, symbol_function(EQUAL), UNPROVIDED)) {
                                cycl_term_vars = list_utilities.alist_remove(cycl_term_vars, cycl_term, symbol_function(EQ));
                            }
                        }
                    }
                }
                return ebmt_template_parser.new_ebmt_template(list(nl, cycl, nl_markers), NIL != cycl_term_vars ? ((SubLObject) ($GENERAL)) : $SPECIFIC, ebmt_template_parser.ebmt_linkset_from_linkage_links(relevant_links, nl_term_vars), NIL != cycl_term_vars ? ((SubLObject) (ebmt_template_parser.ebmt_cycl_with_vars(copy_expression(canonical_cycl), cycl_term_vars))) : canonical_cycl, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    @LispMethod(comment = "Creates special event-learning EBMT templates.  These templates are different\r\nfrom the standard EBMT templates becuase they contain only a part of the\r\nword-linkage that is computed for the English sentence NL.  The selected part\r\nis the part of the word-linkage that is between the NL-MARKERS.\r\n\r\n@param NL\r\n\t\tstringp; an English sentence\r\n@param CYCL\n\t\tcycl-sentence-p;\r\n\t\t\r\n@param NL-MARKERS\r\n\t\tlistp; list of strings that are the markers used to select\r\n\t\tthe part of the linkage that is relevant to creating the template\r\n@param ALLOW-MULTIPLE-MATCHES?\n\t\tbooleanp\nCreates special event-learning EBMT templates.  These templates are different\nfrom the standard EBMT templates becuase they contain only a part of the\nword-linkage that is computed for the English sentence NL.  The selected part\nis the part of the word-linkage that is between the NL-MARKERS.")
    public static SubLObject event_learning_create_template(final SubLObject nl, final SubLObject cycl, final SubLObject nl_markers, SubLObject allow_multiple_matchesP) {
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canonical_cycl = ebmt_template_parser.ebmt_canonicalize_el_sentence(cycl, $$InferencePSC);
        SubLObject err_msg = NIL;
        SubLObject v_linkage = NIL;
        SubLObject mapped_terms = NIL;
        SubLObject cycl_term_vars = NIL;
        SubLObject nl_term_vars = NIL;
        SubLObject relevant_links = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject v_linkage_$17 = ebmt_template_parser.ebmt_linkage_and_mapped_terms(nl, cycl, ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED), NIL);
                    final SubLObject mapped_terms_$18 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_linkage = v_linkage_$17;
                    mapped_terms = mapped_terms_$18;
                    thread.resetMultipleValues();
                    final SubLObject cycl_term_vars_$19 = ebmt_template_parser.ebmt_mapped_term_vars(nl, cycl, mapped_terms, v_linkage, allow_multiple_matchesP);
                    final SubLObject nl_term_vars_$20 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cycl_term_vars = cycl_term_vars_$19;
                    nl_term_vars = nl_term_vars_$20;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err_msg) {
            Errors.warn(string_utilities.string_subst($str144$__, $str145$_, err_msg, UNPROVIDED));
            return NIL;
        }
        relevant_links = partial_linkage(v_linkage, nl_markers);
        if (NIL == relevant_links) {
            return NIL;
        }
        final SubLObject relevant_nl_terms = linkword_strings_in_linkage_links(relevant_links);
        SubLObject cdolist_list_var = mapped_terms;
        SubLObject cycl_nl_mapped_pair = NIL;
        cycl_nl_mapped_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject nl_term = cycl_nl_mapped_pair.rest();
            final SubLObject cycl_term = cycl_nl_mapped_pair.first();
            if (NIL == subl_promotions.memberP(nl_term, relevant_nl_terms, symbol_function(EQUAL), UNPROVIDED)) {
                cycl_term_vars = list_utilities.alist_remove(cycl_term_vars, cycl_term, symbol_function(EQ));
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_nl_mapped_pair = cdolist_list_var.first();
        } 
        return ebmt_template_parser.new_ebmt_template(list(nl, cycl, nl_markers), NIL != cycl_term_vars ? $GENERAL : $SPECIFIC, ebmt_template_parser.ebmt_linkset_from_linkage_links(relevant_links, nl_term_vars), NIL != cycl_term_vars ? ebmt_template_parser.ebmt_cycl_with_vars(copy_expression(canonical_cycl), cycl_term_vars) : canonical_cycl, UNPROVIDED, UNPROVIDED);
    }/**
     * Creates special event-learning EBMT templates.  These templates are different
     * from the standard EBMT templates becuase they contain only a part of the
     * word-linkage that is computed for the English sentence NL.  The selected part
     * is the part of the word-linkage that is between the NL-MARKERS.
     *
     * @param NL
     * 		stringp; an English sentence
     * @param CYCL
    		cycl-sentence-p;
     * 		
     * @param NL-MARKERS
     * 		listp; list of strings that are the markers used to select
     * 		the part of the linkage that is relevant to creating the template
     * @param ALLOW-MULTIPLE-MATCHES?
    		booleanp
     * 		
     */


    /**
     * Creates and adds special EBMT templates (@see EVENT-LEARNING-CREATE-TEMPLATE
     * for more details) to an EBMT Template Index specified by TEMPLATE-INDEX-MT.
     *
     * @param NL
     * 		stringp; an English sentence
     * @param CYCL
    cycl-sentence-p;
     * 		
     * @param NL-MARKERS
     * 		listp; list of strings that are the markers used to select
     * 		the part of the linkage that is relevant to creating the template
     * @param ALLOW-MULTIPLE-MATCHES?
    booleanp;
     * 		
     * @param TEMPLATE-INDEX-MT
    hlmt-p
     * 		
     * @param VERBOSE?
    booleanp
     * 		
     */
    @LispMethod(comment = "Creates and adds special EBMT templates (@see EVENT-LEARNING-CREATE-TEMPLATE\r\nfor more details) to an EBMT Template Index specified by TEMPLATE-INDEX-MT.\r\n\r\n@param NL\r\n\t\tstringp; an English sentence\r\n@param CYCL\ncycl-sentence-p;\r\n\t\t\r\n@param NL-MARKERS\r\n\t\tlistp; list of strings that are the markers used to select\r\n\t\tthe part of the linkage that is relevant to creating the template\r\n@param ALLOW-MULTIPLE-MATCHES?\nbooleanp;\r\n\t\t\r\n@param TEMPLATE-INDEX-MT\nhlmt-p\r\n\t\t\r\n@param VERBOSE?\nbooleanp\nCreates and adds special EBMT templates (@see EVENT-LEARNING-CREATE-TEMPLATE\nfor more details) to an EBMT Template Index specified by TEMPLATE-INDEX-MT.")
    public static final SubLObject event_learning_create_and_add_template_alt(SubLObject nl, SubLObject cycl, SubLObject nl_markers, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            SubLObject template = event_learning_create_template(nl, cycl, nl_markers, allow_multiple_matchesP);
            if (NIL != template) {
                ebmt_template_parser._csetf_ebmt_template_indexing_result(template, ebmt_template_parser.ebmt_index_template(template, NIL, verboseP));
            }
            return template;
        }
    }

    @LispMethod(comment = "Creates and adds special EBMT templates (@see EVENT-LEARNING-CREATE-TEMPLATE\r\nfor more details) to an EBMT Template Index specified by TEMPLATE-INDEX-MT.\r\n\r\n@param NL\r\n\t\tstringp; an English sentence\r\n@param CYCL\n\t\tcycl-sentence-p;\r\n\t\t\r\n@param NL-MARKERS\r\n\t\tlistp; list of strings that are the markers used to select\r\n\t\tthe part of the linkage that is relevant to creating the template\r\n@param ALLOW-MULTIPLE-MATCHES?\n\t\tbooleanp;\r\n\t\t\r\n@param TEMPLATE-INDEX-MT\n\t\thlmt-p\r\n\t\t\r\n@param VERBOSE?\n\t\tbooleanp\nCreates and adds special EBMT templates (@see EVENT-LEARNING-CREATE-TEMPLATE\nfor more details) to an EBMT Template Index specified by TEMPLATE-INDEX-MT.")
    public static SubLObject event_learning_create_and_add_template(final SubLObject nl, final SubLObject cycl, final SubLObject nl_markers, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = T;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLObject template = event_learning_create_template(nl, cycl, nl_markers, allow_multiple_matchesP);
        if (NIL != template) {
            ebmt_template_parser._csetf_ebmt_template_indexing_result(template, ebmt_template_parser.ebmt_index_template(template, NIL, verboseP));
        }
        return template;
    }/**
     * Creates and adds special EBMT templates (@see EVENT-LEARNING-CREATE-TEMPLATE
     * for more details) to an EBMT Template Index specified by TEMPLATE-INDEX-MT.
     *
     * @param NL
     * 		stringp; an English sentence
     * @param CYCL
    		cycl-sentence-p;
     * 		
     * @param NL-MARKERS
     * 		listp; list of strings that are the markers used to select
     * 		the part of the linkage that is relevant to creating the template
     * @param ALLOW-MULTIPLE-MATCHES?
    		booleanp;
     * 		
     * @param TEMPLATE-INDEX-MT
    		hlmt-p
     * 		
     * @param VERBOSE?
    		booleanp
     * 		
     */


    /**
     * Returns the STRINGS sorted by their offset in NL-SENTENCE
     */
    @LispMethod(comment = "Returns the STRINGS sorted by their offset in NL-SENTENCE")
    public static final SubLObject strings_sorted_by_offset_alt(SubLObject strings, SubLObject nl_sentence) {
        {
            SubLObject string_offset_pairs = NIL;
            SubLObject cdolist_list_var = strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                string_offset_pairs = acons(string, search(string, nl_sentence, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), string_offset_pairs);
            }
            return list_utilities.alist_keys(list_utilities.sort_alist_by_values(string_offset_pairs, $sym79$_));
        }
    }

    @LispMethod(comment = "Returns the STRINGS sorted by their offset in NL-SENTENCE")
    public static SubLObject strings_sorted_by_offset(final SubLObject strings, final SubLObject nl_sentence) {
        SubLObject string_offset_pairs = NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            string_offset_pairs = acons(string, search(string, nl_sentence, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), string_offset_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return list_utilities.alist_keys(list_utilities.sort_alist_by_values(string_offset_pairs, $sym84$_));
    }/**
     * Returns the STRINGS sorted by their offset in NL-SENTENCE
     */


    /**
     *
     *
     * @param NL-SENTENCE
    stringp
     * 		
     * @param FACT-STRING-EVENT-TUPLES
     * 		listp; a list of triples of CycL sentences,
     * 		substrings of SENTENCE, and events in FACT that are believed to correspond
     * 		to parts of FACT.
     * @param EVENT
     * 		instance of #$Event; the main event that
     * 		FACT-STRING-EVENT-TUPLES is about
     * @return NUM-TEMPLATES-ADDED non-negative-integer-p; number of templates added
    to EBMT index
     */
    @LispMethod(comment = "@param NL-SENTENCE\nstringp\r\n\t\t\r\n@param FACT-STRING-EVENT-TUPLES\r\n\t\tlistp; a list of triples of CycL sentences,\r\n\t\tsubstrings of SENTENCE, and events in FACT that are believed to correspond\r\n\t\tto parts of FACT.\r\n@param EVENT\r\n\t\tinstance of #$Event; the main event that\r\n\t\tFACT-STRING-EVENT-TUPLES is about\r\n@return NUM-TEMPLATES-ADDED non-negative-integer-p; number of templates added\r\nto EBMT index")
    public static final SubLObject learn_templates_for_sentence_alt(SubLObject nl_sentence, SubLObject fact_string_event_tuples, SubLObject event, SubLObject subevent_structure_sentences) {
        if (subevent_structure_sentences == UNPROVIDED) {
            subevent_structure_sentences = NIL;
        }
        {
            SubLObject raw_subevents = get_all_subevents(event);
            SubLObject subevents = (NIL == raw_subevents) ? ((SubLObject) (list(event))) : raw_subevents;
            SubLObject grouped_tuples = group_sentences_by_subevent(fact_string_event_tuples, subevents, subevent_structure_sentences);
            SubLObject best_tuple_groups = pick_best_tuple_groups(grouped_tuples);
            SubLObject num_templates_added = ZERO_INTEGER;
            SubLObject cdolist_list_var = best_tuple_groups;
            SubLObject fact_group = NIL;
            for (fact_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fact_group = cdolist_list_var.first()) {
                {
                    SubLObject full_fact = remove_el_duplicates(simplifier.conjoin(Mapping.mapcar(FIRST, fact_group), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject strings = remove_duplicates(remove(NIL, list_utilities.flatten(Mapping.mapcar(SECOND, fact_group)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != strings) {
                        {
                            SubLObject strings_for_partial_linkage = strings_sorted_by_offset(strings, nl_sentence);
                            SubLObject template_cycl = get_event_learning_templated_cycl(full_fact, event);
                            if (NIL != event_learning_create_and_add_template(nl_sentence, template_cycl, strings_for_partial_linkage, UNPROVIDED, UNPROVIDED)) {
                                num_templates_added = add(num_templates_added, ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            return num_templates_added;
        }
    }

    /**
     *
     *
     * @param NL-SENTENCE
    stringp
     * 		
     * @param FACT-STRING-EVENT-TUPLES
     * 		listp; a list of triples of CycL sentences,
     * 		substrings of SENTENCE, and events in FACT that are believed to correspond
     * 		to parts of FACT.
     * @param EVENT
     * 		instance of #$Event; the main event that
     * 		FACT-STRING-EVENT-TUPLES is about
     * @return NUM-TEMPLATES-ADDED non-negative-integer-p; number of templates added
    to EBMT index
     */
    @LispMethod(comment = "@param NL-SENTENCE\nstringp\r\n\t\t\r\n@param FACT-STRING-EVENT-TUPLES\r\n\t\tlistp; a list of triples of CycL sentences,\r\n\t\tsubstrings of SENTENCE, and events in FACT that are believed to correspond\r\n\t\tto parts of FACT.\r\n@param EVENT\r\n\t\tinstance of #$Event; the main event that\r\n\t\tFACT-STRING-EVENT-TUPLES is about\r\n@return NUM-TEMPLATES-ADDED non-negative-integer-p; number of templates added\r\nto EBMT index")
    public static SubLObject learn_templates_for_sentence(final SubLObject nl_sentence, final SubLObject fact_string_event_tuples, final SubLObject event, SubLObject subevent_structure_sentences) {
        if (subevent_structure_sentences == UNPROVIDED) {
            subevent_structure_sentences = NIL;
        }
        final SubLObject raw_subevents = get_all_subevents(event);
        final SubLObject subevents = (NIL == raw_subevents) ? list(event) : raw_subevents;
        final SubLObject grouped_tuples = group_sentences_by_subevent(fact_string_event_tuples, subevents, subevent_structure_sentences);
        final SubLObject best_tuple_groups = pick_best_tuple_groups(grouped_tuples);
        SubLObject num_templates_added = ZERO_INTEGER;
        SubLObject cdolist_list_var = best_tuple_groups;
        SubLObject fact_group = NIL;
        fact_group = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject full_fact = remove_el_duplicates(simplifier.conjoin(Mapping.mapcar(FIRST, fact_group), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject strings = remove_duplicates(remove(NIL, list_utilities.flatten(Mapping.mapcar(SECOND, fact_group)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != strings) {
                final SubLObject strings_for_partial_linkage = strings_sorted_by_offset(strings, nl_sentence);
                final SubLObject template_cycl = get_event_learning_templated_cycl(full_fact, event);
                if (NIL != event_learning_create_and_add_template(nl_sentence, template_cycl, strings_for_partial_linkage, UNPROVIDED, UNPROVIDED)) {
                    num_templates_added = add(num_templates_added, ONE_INTEGER);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fact_group = cdolist_list_var.first();
        } 
        return num_templates_added;
    }

    /**
     * the intuition here is the that the events that have the most role-players that match things in the sentence are the
     * most likely events for that sentence to be about.  For example, most all of the sub-events will be in a kidnapping, so
     * if the victim's name is in the sentence, we don't want to assume that that means that the sentence is about each of the
     * subevents
     */
    @LispMethod(comment = "the intuition here is the that the events that have the most role-players that match things in the sentence are the\r\nmost likely events for that sentence to be about.  For example, most all of the sub-events will be in a kidnapping, so\r\nif the victim\'s name is in the sentence, we don\'t want to assume that that means that the sentence is about each of the\r\nsubevents\nthe intuition here is the that the events that have the most role-players that match things in the sentence are the\nmost likely events for that sentence to be about.  For example, most all of the sub-events will be in a kidnapping, so\nif the victim\'s name is in the sentence, we don\'t want to assume that that means that the sentence is about each of the\nsubevents")
    public static final SubLObject pick_best_tuple_groups_alt(SubLObject tuple_groups) {
        {
            SubLObject result = NIL;
            SubLObject max_length = ZERO_INTEGER;
            SubLObject cdolist_list_var = tuple_groups;
            SubLObject tuple_group = NIL;
            for (tuple_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple_group = cdolist_list_var.first()) {
                if (length(tuple_group).numG(max_length)) {
                    max_length = length(tuple_group);
                    result = list(tuple_group);
                } else {
                    if (length(tuple_group).numE(max_length)) {
                        result = cons(tuple_group, result);
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "the intuition here is the that the events that have the most role-players that match things in the sentence are the\r\nmost likely events for that sentence to be about.  For example, most all of the sub-events will be in a kidnapping, so\r\nif the victim\'s name is in the sentence, we don\'t want to assume that that means that the sentence is about each of the\r\nsubevents\nthe intuition here is the that the events that have the most role-players that match things in the sentence are the\nmost likely events for that sentence to be about.  For example, most all of the sub-events will be in a kidnapping, so\nif the victim\'s name is in the sentence, we don\'t want to assume that that means that the sentence is about each of the\nsubevents")
    public static SubLObject pick_best_tuple_groups(final SubLObject tuple_groups) {
        SubLObject result = NIL;
        SubLObject max_length = ZERO_INTEGER;
        SubLObject cdolist_list_var = tuple_groups;
        SubLObject tuple_group = NIL;
        tuple_group = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (length(tuple_group).numG(max_length)) {
                max_length = length(tuple_group);
                result = list(tuple_group);
            } else
                if (length(tuple_group).numE(max_length)) {
                    result = cons(tuple_group, result);
                }

            cdolist_list_var = cdolist_list_var.rest();
            tuple_group = cdolist_list_var.first();
        } 
        return result;
    }/**
     * the intuition here is the that the events that have the most role-players that match things in the sentence are the
     * most likely events for that sentence to be about.  For example, most all of the sub-events will be in a kidnapping, so
     * if the victim's name is in the sentence, we don't want to assume that that means that the sentence is about each of the
     * subevents
     */


    public static final SubLObject group_sentences_by_subevent_alt(SubLObject sentence_string_pairs, SubLObject subevents, SubLObject subevent_structures_sentences) {
        if (subevent_structures_sentences == UNPROVIDED) {
            subevent_structures_sentences = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject sentences_by_event = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $subevents$.currentBinding(thread);
                    try {
                        $subevents$.bind(subevents, thread);
                        {
                            SubLObject cdolist_list_var = sentence_string_pairs;
                            SubLObject pair = NIL;
                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                {
                                    SubLObject my_subevents = cycl_utilities.expression_gather(pair.first(), $sym147$LAMBDA_SUBEVENT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject cdolist_list_var_22 = my_subevents;
                                    SubLObject my_subevent = NIL;
                                    for (my_subevent = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , my_subevent = cdolist_list_var_22.first()) {
                                        dictionary_utilities.dictionary_push(sentences_by_event, my_subevent, pair);
                                    }
                                }
                            }
                        }
                    } finally {
                        $subevents$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sentences_by_event));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject subevent = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject raw_sentences = dictionary.dictionary_lookup(sentences_by_event, subevent, UNPROVIDED);
                                SubLObject good_sentences = raw_sentences;
                                SubLObject cdolist_list_var = subevent_structures_sentences;
                                SubLObject se_struct_sent = NIL;
                                for (se_struct_sent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , se_struct_sent = cdolist_list_var.first()) {
                                    if (cycl_utilities.formula_arg2(se_struct_sent, UNPROVIDED).equalp(subevent)) {
                                        good_sentences = cons(list(se_struct_sent), good_sentences);
                                    }
                                }
                                result = cons(good_sentences, result);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return result;
            }
        }
    }

    public static SubLObject group_sentences_by_subevent(final SubLObject sentence_string_pairs, final SubLObject subevents, SubLObject subevent_structures_sentences) {
        if (subevent_structures_sentences == UNPROVIDED) {
            subevent_structures_sentences = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject sentences_by_event = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $subevents$.currentBinding(thread);
        try {
            $subevents$.bind(subevents, thread);
            SubLObject cdolist_list_var = sentence_string_pairs;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$21;
                final SubLObject my_subevents = cdolist_list_var_$21 = cycl_utilities.expression_gather(pair.first(), $sym148$LAMBDA_SUBEVENT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject my_subevent = NIL;
                my_subevent = cdolist_list_var_$21.first();
                while (NIL != cdolist_list_var_$21) {
                    dictionary_utilities.dictionary_push(sentences_by_event, my_subevent, pair);
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    my_subevent = cdolist_list_var_$21.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
        } finally {
            $subevents$.rebind(_prev_bind_0, thread);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sentences_by_event)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject subevent = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject good_sentences;
            final SubLObject raw_sentences = good_sentences = dictionary.dictionary_lookup(sentences_by_event, subevent, UNPROVIDED);
            SubLObject cdolist_list_var2 = subevent_structures_sentences;
            SubLObject se_struct_sent = NIL;
            se_struct_sent = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (cycl_utilities.formula_arg2(se_struct_sent, UNPROVIDED).equalp(subevent)) {
                    good_sentences = cons(list(se_struct_sent), good_sentences);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                se_struct_sent = cdolist_list_var2.first();
            } 
            result = cons(good_sentences, result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static final SubLObject lambda_subeventP_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(obj, $subevents$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject lambda_subeventP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(obj, $subevents$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject group_tuples_alt(SubLObject tuples, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = tuples;
                SubLObject tuple = NIL;
                for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                    dictionary_utilities.dictionary_push(v_dictionary, funcall(key, tuple), tuple);
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject dict_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = cons(dictionary.dictionary_lookup(v_dictionary, dict_key, UNPROVIDED), result);
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return result;
            }
        }
    }

    public static SubLObject group_tuples(final SubLObject tuples, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_push(v_dictionary, funcall(key, tuple), tuple);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject dict_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = cons(dictionary.dictionary_lookup(v_dictionary, dict_key, UNPROVIDED), result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    /**
     *
     *
     * @param CYCL
    cycl-sentence-p
     * 		
     * @param EVENT
     * 		instance of #$Event; the main event being investigated
     * @return cycl-sentence-p; CYCL with appropriate indexicals replaced
     */
    @LispMethod(comment = "@param CYCL\ncycl-sentence-p\r\n\t\t\r\n@param EVENT\r\n\t\tinstance of #$Event; the main event being investigated\r\n@return cycl-sentence-p; CYCL with appropriate indexicals replaced")
    public static final SubLObject get_event_learning_templated_cycl_alt(SubLObject cycl, SubLObject event) {
        {
            SubLObject subevents = get_all_subevents(event);
            SubLObject subevent_types = get_all_scripted_subevent_types(event);
            SubLObject item_var = event;
            if (NIL == member(item_var, subevents, symbol_function(EQL), symbol_function(IDENTITY))) {
                subevents = cons(item_var, subevents);
            }
            subevent_types = union(cycl_utilities.hl_to_el(isa.min_isa(event, UNPROVIDED, UNPROVIDED)), subevent_types, EQUAL, UNPROVIDED);
            {
                SubLObject cdolist_list_var = subevents;
                SubLObject subevent = NIL;
                for (subevent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subevent = cdolist_list_var.first()) {
                    {
                        SubLObject subevent_type = NIL;
                        if (NIL == subevent_type) {
                            {
                                SubLObject csome_list_var = cycl_utilities.hl_to_el(isa.min_isa(subevent, UNPROVIDED, UNPROVIDED));
                                SubLObject sub_type = NIL;
                                for (sub_type = csome_list_var.first(); !((NIL != subevent_type) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sub_type = csome_list_var.first()) {
                                    if (NIL != subl_promotions.memberP(sub_type, subevent_types, EQUAL, UNPROVIDED)) {
                                        subevent_type = sub_type;
                                    }
                                }
                            }
                        }
                        if (NIL != subevent_type) {
                            cycl = cycl_utilities.expression_subst(list($$TheFn, subevent_type), subevent, cycl, UNPROVIDED, UNPROVIDED);
                        } else {
                            Errors.warn($str_alt149$No_substitution_done_for__S, subevent);
                        }
                    }
                }
            }
            return cycl;
        }
    }

    /**
     *
     *
     * @param CYCL
    cycl-sentence-p
     * 		
     * @param EVENT
     * 		instance of #$Event; the main event being investigated
     * @return cycl-sentence-p; CYCL with appropriate indexicals replaced
     */
    @LispMethod(comment = "@param CYCL\ncycl-sentence-p\r\n\t\t\r\n@param EVENT\r\n\t\tinstance of #$Event; the main event being investigated\r\n@return cycl-sentence-p; CYCL with appropriate indexicals replaced")
    public static SubLObject get_event_learning_templated_cycl(SubLObject cycl, final SubLObject event) {
        SubLObject subevents = get_all_subevents(event);
        SubLObject subevent_types = get_all_scripted_subevent_types(event);
        if (NIL == member(event, subevents, symbol_function(EQL), symbol_function(IDENTITY))) {
            subevents = cons(event, subevents);
        }
        subevent_types = union(cycl_utilities.hl_to_el(isa.min_isa(event, UNPROVIDED, UNPROVIDED)), subevent_types, EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var = subevents;
        SubLObject subevent = NIL;
        subevent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject subevent_type = NIL;
            if (NIL == subevent_type) {
                SubLObject csome_list_var = cycl_utilities.hl_to_el(isa.min_isa(subevent, UNPROVIDED, UNPROVIDED));
                SubLObject sub_type = NIL;
                sub_type = csome_list_var.first();
                while ((NIL == subevent_type) && (NIL != csome_list_var)) {
                    if (NIL != subl_promotions.memberP(sub_type, subevent_types, EQUAL, UNPROVIDED)) {
                        subevent_type = sub_type;
                    }
                    csome_list_var = csome_list_var.rest();
                    sub_type = csome_list_var.first();
                } 
            }
            if (NIL != subevent_type) {
                cycl = cycl_utilities.expression_subst(list($$TheFn, subevent_type), subevent, cycl, UNPROVIDED, UNPROVIDED);
            } else {
                Errors.warn($str150$No_substitution_done_for__S, subevent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subevent = cdolist_list_var.first();
        } 
        return cycl;
    }

    /**
     *
     *
     * @param EVENT-TYPE
     * 		spec of #$Event
     * @return listp; a list of strings that are relevant when searching for an
    instance of EVENT-TYPE
     */
    @LispMethod(comment = "@param EVENT-TYPE\r\n\t\tspec of #$Event\r\n@return listp; a list of strings that are relevant when searching for an\r\ninstance of EVENT-TYPE")
    public static final SubLObject search_strings_for_event_type_alt(SubLObject event_type) {
        {
            SubLObject search_strings = $list_alt150;
            return search_strings;
        }
    }

    /**
     *
     *
     * @param EVENT-TYPE
     * 		spec of #$Event
     * @return listp; a list of strings that are relevant when searching for an
    instance of EVENT-TYPE
     */
    @LispMethod(comment = "@param EVENT-TYPE\r\n\t\tspec of #$Event\r\n@return listp; a list of strings that are relevant when searching for an\r\ninstance of EVENT-TYPE")
    public static SubLObject search_strings_for_event_type(final SubLObject event_type) {
        final SubLObject search_strings = $list151;
        return search_strings;
    }

    /**
     *
     *
     * @param EVENT-TYPE
     * 		cycl-represented-term-p; spec of #$Event
     * @param SENTENCES
    cycl-sentence-p;
     * 		
     * @return listp; a list of events
     */
    @LispMethod(comment = "@param EVENT-TYPE\r\n\t\tcycl-represented-term-p; spec of #$Event\r\n@param SENTENCES\ncycl-sentence-p;\r\n\t\t\r\n@return listp; a list of events")
    public static final SubLObject find_possible_known_events_for_fact_alt(SubLObject event_type, SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject indexical = cycl_utilities.expression_gather(sentence, INDEXICAL_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED).first();
                SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
                SubLObject query_sentence = cycl_utilities.expression_subst($sym62$_EVENT, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
                SubLObject matching_events = ask_utilities.query_variable($sym62$_EVENT, list($$and, list($$isa, $sym62$_EVENT, event_type), list($$isa, $sym62$_EVENT, indexical_event_type), query_sentence), $event_finding_query_mt$.getDynamicValue(thread), UNPROVIDED);
                return matching_events;
            }
        }
    }

    /**
     *
     *
     * @param EVENT-TYPE
     * 		cycl-represented-term-p; spec of #$Event
     * @param SENTENCES
    cycl-sentence-p;
     * 		
     * @return listp; a list of events
     */
    @LispMethod(comment = "@param EVENT-TYPE\r\n\t\tcycl-represented-term-p; spec of #$Event\r\n@param SENTENCES\ncycl-sentence-p;\r\n\t\t\r\n@return listp; a list of events")
    public static SubLObject find_possible_known_events_for_fact(final SubLObject event_type, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexical = cycl_utilities.expression_gather(sentence, INDEXICAL_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED).first();
        final SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
        final SubLObject query_sentence = cycl_utilities.expression_subst($sym68$_EVENT, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject matching_events = ask_utilities.query_variable($sym68$_EVENT, list($$and, list($$isa, $sym68$_EVENT, event_type), list($$isa, $sym68$_EVENT, indexical_event_type), query_sentence), $event_finding_query_mt$.getDynamicValue(thread), UNPROVIDED);
        return matching_events;
    }

    public static final SubLObject preds_in_cycl_sentences_alt(SubLObject sentences) {
        {
            SubLObject preds = NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                preds = union(preds, cycl_utilities.expression_gather(sentence, PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            return preds;
        }
    }

    public static SubLObject preds_in_cycl_sentences(final SubLObject sentences) {
        SubLObject preds = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            preds = union(preds, cycl_utilities.expression_gather(sentence, PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return preds;
    }

    public static final SubLObject best_event_facts_pair_alt(SubLObject event_facts_pair1, SubLObject event_facts_pair2) {
        {
            SubLObject facts1 = second(event_facts_pair1);
            SubLObject preds1 = preds_in_cycl_sentences(facts1);
            SubLObject facts2 = second(event_facts_pair2);
            SubLObject preds2 = preds_in_cycl_sentences(facts2);
            SubLObject ranked_preds = $list_alt152;
            SubLObject cdolist_list_var = ranked_preds;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                if ((NIL != subl_promotions.memberP(pred, preds1, UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(pred, preds2, UNPROVIDED, UNPROVIDED))) {
                    return event_facts_pair1;
                } else {
                    if ((NIL != subl_promotions.memberP(pred, preds2, UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(pred, preds1, UNPROVIDED, UNPROVIDED))) {
                        return event_facts_pair2;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject best_event_facts_pair(final SubLObject event_facts_pair1, final SubLObject event_facts_pair2) {
        final SubLObject facts1 = second(event_facts_pair1);
        final SubLObject preds1 = preds_in_cycl_sentences(facts1);
        final SubLObject facts2 = second(event_facts_pair2);
        final SubLObject preds2 = preds_in_cycl_sentences(facts2);
        SubLObject cdolist_list_var;
        final SubLObject ranked_preds = cdolist_list_var = $list153;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != subl_promotions.memberP(pred, preds1, UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(pred, preds2, UNPROVIDED, UNPROVIDED))) {
                return event_facts_pair1;
            }
            if ((NIL != subl_promotions.memberP(pred, preds2, UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(pred, preds1, UNPROVIDED, UNPROVIDED))) {
                return event_facts_pair2;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject find_best_event_alt(SubLObject event_facts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            list_utilities.sort_alist_by_values(event_facts, GREATER_LENGTH_P);
            {
                SubLObject max_length = ZERO_INTEGER;
                SubLObject events = NIL;
                SubLObject doneP = NIL;
                SubLObject rest = NIL;
                for (rest = event_facts; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject cons = rest.first();
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject event = NIL;
                        SubLObject facts = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt154);
                        event = current.first();
                        current = current.rest();
                        facts = current;
                        if (length(facts).numGE(max_length)) {
                            max_length = length(facts);
                            events = cons(event, events);
                        } else {
                            doneP = T;
                        }
                    }
                }
                if (length(events).numG(ONE_INTEGER)) {
                    {
                        SubLObject best_event = events.first();
                        SubLObject best_event_facts = list_utilities.alist_lookup(event_facts, events.first(), symbol_function(EQUAL), UNPROVIDED);
                        SubLObject cdolist_list_var = events.rest();
                        SubLObject potential_best_event = NIL;
                        for (potential_best_event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , potential_best_event = cdolist_list_var.first()) {
                            {
                                SubLObject potential_best_event_facts = list_utilities.alist_lookup(event_facts, potential_best_event, symbol_function(EQUAL), UNPROVIDED);
                                thread.resetMultipleValues();
                                {
                                    SubLObject best_event_23 = best_event_facts_pair(list(best_event, best_event_facts), list(potential_best_event, potential_best_event_facts));
                                    SubLObject best_event_facts_24 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    best_event = best_event_23;
                                    best_event_facts = best_event_facts_24;
                                }
                                if (NIL == best_event) {
                                    return NIL;
                                }
                            }
                        }
                        return best_event;
                    }
                }
                return events.first();
            }
        }
    }

    public static SubLObject find_best_event(final SubLObject event_facts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        list_utilities.sort_alist_by_values(event_facts, GREATER_LENGTH_P);
        SubLObject max_length = ZERO_INTEGER;
        SubLObject events = NIL;
        SubLObject doneP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject event;
        SubLObject facts;
        for (doneP = NIL, rest = NIL, rest = event_facts; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            event = NIL;
            facts = NIL;
            destructuring_bind_must_consp(current, datum, $list155);
            event = current.first();
            current = facts = current.rest();
            if (length(facts).numGE(max_length)) {
                max_length = length(facts);
                events = cons(event, events);
            } else {
                doneP = T;
            }
        }
        if (length(events).numG(ONE_INTEGER)) {
            SubLObject best_event = events.first();
            SubLObject best_event_facts = list_utilities.alist_lookup(event_facts, events.first(), symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = events.rest();
            SubLObject potential_best_event = NIL;
            potential_best_event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject potential_best_event_facts = list_utilities.alist_lookup(event_facts, potential_best_event, symbol_function(EQUAL), UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject best_event_$22 = best_event_facts_pair(list(best_event, best_event_facts), list(potential_best_event, potential_best_event_facts));
                final SubLObject best_event_facts_$23 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                best_event = best_event_$22;
                best_event_facts = best_event_facts_$23;
                if (NIL == best_event) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                potential_best_event = cdolist_list_var.first();
            } 
            return best_event;
        }
        return events.first();
    }

    /**
     * Asserts all FACTS for EVENT in the content MT of DOC.
     *
     * @param EVENT
     * 		cycl-represented-term-p;  an instance of #$Event
     * @param FACTS
     * 		listp;  list of cycl-sentence-p
     * @param DOC
    event-document-p
     * 		
     */
    @LispMethod(comment = "Asserts all FACTS for EVENT in the content MT of DOC.\r\n\r\n@param EVENT\r\n\t\tcycl-represented-term-p;  an instance of #$Event\r\n@param FACTS\r\n\t\tlistp;  list of cycl-sentence-p\r\n@param DOC\nevent-document-p")
    public static final SubLObject update_event_alt(SubLObject event, SubLObject facts, SubLObject doc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = get_event_doc_content_mt(doc);
                SubLObject cdolist_list_var = facts;
                SubLObject fact = NIL;
                for (fact = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fact = cdolist_list_var.first()) {
                    {
                        SubLObject formula = substitute_event_for_indexical(fact, event);
                        thread.resetMultipleValues();
                        {
                            SubLObject assert_result = event_learner_assert(formula, mt);
                            SubLObject error = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == assert_result) {
                                Errors.warn($str_alt155$Failed_to_assert__S_in__S_because, formula, mt, error);
                            }
                        }
                    }
                }
            }
            return event;
        }
    }

    @LispMethod(comment = "Asserts all FACTS for EVENT in the content MT of DOC.\r\n\r\n@param EVENT\r\n\t\tcycl-represented-term-p;  an instance of #$Event\r\n@param FACTS\r\n\t\tlistp;  list of cycl-sentence-p\r\n@param DOC\n\t\tevent-document-p")
    public static SubLObject update_event(final SubLObject event, final SubLObject facts, final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = get_event_doc_content_mt(doc);
        SubLObject cdolist_list_var = facts;
        SubLObject fact = NIL;
        fact = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = substitute_event_for_indexical(fact, event);
            thread.resetMultipleValues();
            final SubLObject assert_result = event_learner_assert(formula, mt);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == assert_result) {
                Errors.warn($str156$Failed_to_assert__S_in__S_because, formula, mt, error);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fact = cdolist_list_var.first();
        } 
        return event;
    }/**
     * Asserts all FACTS for EVENT in the content MT of DOC.
     *
     * @param EVENT
     * 		cycl-represented-term-p;  an instance of #$Event
     * @param FACTS
     * 		listp;  list of cycl-sentence-p
     * @param DOC
    		event-document-p
     * 		
     */


    /**
     * Try to find and update a single event, of type EVENT-TYPE, that can be
     * updated using FACTS.
     *
     * @param EVENT-TYPE
     * 		cycl-represented-term-p; spec of #$Event
     * @param FACTS
     * 		listp; list of lists where each member-list contains various
     * 		interpretations of a particular sentence.
     */
    @LispMethod(comment = "Try to find and update a single event, of type EVENT-TYPE, that can be\r\nupdated using FACTS.\r\n\r\n@param EVENT-TYPE\r\n\t\tcycl-represented-term-p; spec of #$Event\r\n@param FACTS\r\n\t\tlistp; list of lists where each member-list contains various\r\n\t\tinterpretations of a particular sentence.\nTry to find and update a single event, of type EVENT-TYPE, that can be\nupdated using FACTS.")
    public static final SubLObject find_and_update_event_alt(SubLObject event_type, SubLObject facts, SubLObject doc) {
        {
            SubLObject event_facts = NIL;
            SubLObject cdolist_list_var = facts;
            SubLObject interpretations = NIL;
            for (interpretations = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interpretations = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_25 = interpretations;
                    SubLObject interpretation = NIL;
                    for (interpretation = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , interpretation = cdolist_list_var_25.first()) {
                        {
                            SubLObject cdolist_list_var_26 = find_possible_known_events_for_fact(event_type, interpretation);
                            SubLObject event = NIL;
                            for (event = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , event = cdolist_list_var_26.first()) {
                                event_facts = list_utilities.alist_pushnew(event_facts, event, interpretation, symbol_function(EQUAL), symbol_function(EQUAL));
                            }
                        }
                    }
                }
            }
            if (NIL != event_facts) {
                {
                    SubLObject event = find_best_event(event_facts);
                    update_event(event, list_utilities.alist_lookup(event_facts, event, UNPROVIDED, UNPROVIDED), doc);
                    return event;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Try to find and update a single event, of type EVENT-TYPE, that can be\r\nupdated using FACTS.\r\n\r\n@param EVENT-TYPE\r\n\t\tcycl-represented-term-p; spec of #$Event\r\n@param FACTS\r\n\t\tlistp; list of lists where each member-list contains various\r\n\t\tinterpretations of a particular sentence.\nTry to find and update a single event, of type EVENT-TYPE, that can be\nupdated using FACTS.")
    public static SubLObject find_and_update_event(final SubLObject event_type, final SubLObject facts, final SubLObject doc) {
        SubLObject event_facts = NIL;
        SubLObject cdolist_list_var = facts;
        SubLObject interpretations = NIL;
        interpretations = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = interpretations;
            SubLObject interpretation = NIL;
            interpretation = cdolist_list_var_$24.first();
            while (NIL != cdolist_list_var_$24) {
                SubLObject cdolist_list_var_$25 = find_possible_known_events_for_fact(event_type, interpretation);
                SubLObject event = NIL;
                event = cdolist_list_var_$25.first();
                while (NIL != cdolist_list_var_$25) {
                    event_facts = list_utilities.alist_pushnew(event_facts, event, interpretation, symbol_function(EQUAL), symbol_function(EQUAL));
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    event = cdolist_list_var_$25.first();
                } 
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                interpretation = cdolist_list_var_$24.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            interpretations = cdolist_list_var.first();
        } 
        if (NIL != event_facts) {
            final SubLObject event2 = find_best_event(event_facts);
            update_event(event2, list_utilities.alist_lookup(event_facts, event2, UNPROVIDED, UNPROVIDED), doc);
            return event2;
        }
        return NIL;
    }/**
     * Try to find and update a single event, of type EVENT-TYPE, that can be
     * updated using FACTS.
     *
     * @param EVENT-TYPE
     * 		cycl-represented-term-p; spec of #$Event
     * @param FACTS
     * 		listp; list of lists where each member-list contains various
     * 		interpretations of a particular sentence.
     */


    public static final SubLObject facts_sufficient_to_make_eventP_alt(SubLObject event_type, SubLObject facts) {
        return T;
    }

    public static SubLObject facts_sufficient_to_make_eventP(final SubLObject event_type, final SubLObject facts) {
        return T;
    }

    /**
     *
     *
     * @param EVENT-TYPE
     * 		spec of #$Event
     * @param SENTENCES
     * 		listp; a list of CycL sentences about some new event
     * @param DOC;
     * 		used for getting the assertion-mt for SENTENCES
     * @return instance of #$Event, about which SENTENCES have been asserted
     */
    @LispMethod(comment = "@param EVENT-TYPE\r\n\t\tspec of #$Event\r\n@param SENTENCES\r\n\t\tlistp; a list of CycL sentences about some new event\r\n@param DOC;\r\n\t\tused for getting the assertion-mt for SENTENCES\r\n@return instance of #$Event, about which SENTENCES have been asserted")
    public static final SubLObject make_new_event_alt(SubLObject event_type, SubLObject sentences, SubLObject doc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_mt = get_event_doc_content_mt(doc);
                SubLObject event_name = $$$GatheredEvent;
                SubLObject event = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind($event_learning_cyclist$.getDynamicValue(thread), thread);
                        event = rkf_term_utilities.create_new_constant(event_name, list(event_type), NIL, assertion_mt, $str_alt33$, NIL, T, T, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = sentences;
                            SubLObject sentence = NIL;
                            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject assertion_formula = substitute_event_for_indexical(sentence, event);
                                    SubLObject indexicals = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject assertion_formulae = list(assertion_formula);
                                        {
                                            SubLObject cdolist_list_var_27 = indexicals;
                                            SubLObject indexical = NIL;
                                            for (indexical = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , indexical = cdolist_list_var_27.first()) {
                                                {
                                                    SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
                                                    SubLObject item_var = list($$isa, event, indexical_event_type);
                                                    if (NIL == member(item_var, assertion_formulae, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        assertion_formulae = cons(item_var, assertion_formulae);
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var_28 = assertion_formulae;
                                            SubLObject assertion_formula_29 = NIL;
                                            for (assertion_formula_29 = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , assertion_formula_29 = cdolist_list_var_28.first()) {
                                                if (NIL != wff.el_wff_assertibleP(assertion_formula_29, assertion_mt, UNPROVIDED)) {
                                                    if (NIL == event_learner_assert(assertion_formula_29, assertion_mt)) {
                                                        Errors.warn($str_alt157$Failed_to_assert___S_in__S__, assertion_formula_29, assertion_mt);
                                                    }
                                                } else {
                                                    Errors.warn($str_alt158$NOT_WFF___S__, assertion_formula_29);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return event;
            }
        }
    }

    /**
     *
     *
     * @param EVENT-TYPE
     * 		spec of #$Event
     * @param SENTENCES
     * 		listp; a list of CycL sentences about some new event
     * @param DOC;
     * 		used for getting the assertion-mt for SENTENCES
     * @return instance of #$Event, about which SENTENCES have been asserted
     */
    @LispMethod(comment = "@param EVENT-TYPE\r\n\t\tspec of #$Event\r\n@param SENTENCES\r\n\t\tlistp; a list of CycL sentences about some new event\r\n@param DOC;\r\n\t\tused for getting the assertion-mt for SENTENCES\r\n@return instance of #$Event, about which SENTENCES have been asserted")
    public static SubLObject make_new_event(final SubLObject event_type, final SubLObject sentences, final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_mt = get_event_doc_content_mt(doc);
        final SubLObject event_name = $$$GatheredEvent;
        SubLObject event = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind($event_learning_cyclist$.getDynamicValue(thread), thread);
            event = rkf_term_utilities.create_new_constant(event_name, list(event_type), NIL, assertion_mt, $str39$, NIL, $UPCASE, T, UNPROVIDED);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject assertion_formula = substitute_event_for_indexical(sentence, event);
                final SubLObject indexicals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject assertion_formulae = list(assertion_formula);
                SubLObject cdolist_list_var_$26 = indexicals;
                SubLObject indexical = NIL;
                indexical = cdolist_list_var_$26.first();
                while (NIL != cdolist_list_var_$26) {
                    final SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
                    final SubLObject item_var = list($$isa, event, indexical_event_type);
                    if (NIL == member(item_var, assertion_formulae, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        assertion_formulae = cons(item_var, assertion_formulae);
                    }
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    indexical = cdolist_list_var_$26.first();
                } 
                SubLObject cdolist_list_var_$27 = assertion_formulae;
                SubLObject assertion_formula_$28 = NIL;
                assertion_formula_$28 = cdolist_list_var_$27.first();
                while (NIL != cdolist_list_var_$27) {
                    if (NIL != wff.el_wff_assertibleP(assertion_formula_$28, assertion_mt, UNPROVIDED)) {
                        if (NIL == event_learner_assert(assertion_formula_$28, assertion_mt)) {
                            Errors.warn($str159$Failed_to_assert___S_in__S__, assertion_formula_$28, assertion_mt);
                        }
                    } else {
                        Errors.warn($str160$NOT_WFF___S__, assertion_formula_$28);
                    }
                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                    assertion_formula_$28 = cdolist_list_var_$27.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return event;
    }

    /**
     *
     *
     * @unknown high-level entry point for finding new events of a particular type
     */
    @LispMethod(comment = "@unknown high-level entry point for finding new events of a particular type")
    public static final SubLObject find_new_events_alt(SubLObject event_type) {
        {
            SubLObject search_strings = search_strings_for_event_type(event_type);
            SubLObject docs = best_docs_for_search_strings(search_strings);
            SubLObject new_events = NIL;
            SubLObject cdolist_list_var = docs;
            SubLObject doc = NIL;
            for (doc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , doc = cdolist_list_var.first()) {
                {
                    SubLObject facts = extract_event_facts_from_doc(doc);
                    if (NIL == find_and_update_event(event_type, facts, doc)) {
                        if (NIL != facts_sufficient_to_make_eventP(event_type, facts)) {
                            {
                                SubLObject facts_for_new_event = best_interpretations_of_facts(facts);
                                new_events = cons(make_new_event(event_type, facts_for_new_event, doc), new_events);
                            }
                        }
                    }
                }
            }
            return new_events;
        }
    }

    /**
     *
     *
     * @unknown high-level entry point for finding new events of a particular type
     */
    @LispMethod(comment = "@unknown high-level entry point for finding new events of a particular type")
    public static SubLObject find_new_events(final SubLObject event_type) {
        final SubLObject search_strings = search_strings_for_event_type(event_type);
        final SubLObject docs = best_docs_for_search_strings(search_strings);
        SubLObject new_events = NIL;
        SubLObject cdolist_list_var = docs;
        SubLObject doc = NIL;
        doc = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject facts = extract_event_facts_from_doc(doc);
            if ((NIL == find_and_update_event(event_type, facts, doc)) && (NIL != facts_sufficient_to_make_eventP(event_type, facts))) {
                final SubLObject facts_for_new_event = best_interpretations_of_facts(facts);
                new_events = cons(make_new_event(event_type, facts_for_new_event, doc), new_events);
            }
            cdolist_list_var = cdolist_list_var.rest();
            doc = cdolist_list_var.first();
        } 
        return new_events;
    }

    public static final SubLObject linkage_path_between_alt(SubLObject v_linkage, SubLObject string1, SubLObject string2) {
        {
            SubLObject link_word1 = methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, string1);
            SubLObject link_word2 = methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, string2);
            SubLObject path_queue = queues.create_queue();
            if (NIL == link_word1) {
                link_word1 = methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, string_utilities.split_string(string1, UNPROVIDED).first());
                if (NIL == link_word1) {
                    Errors.error($str_alt160$_s_is_not_present_in_input_linkag, string1, instances.get_slot(v_linkage, WORDS));
                }
            }
            if (NIL == link_word2) {
                link_word2 = methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, list_utilities.last_one(string_utilities.split_string(string2, UNPROVIDED)));
                if (NIL == link_word2) {
                    Errors.error($str_alt160$_s_is_not_present_in_input_linkag, string2, instances.get_slot(v_linkage, WORDS));
                }
            }
            queues.enqueue(list(link_word1), path_queue);
            return list_utilities.find_all_if(LINK_P, linkage_path_between_int(link_word2, path_queue), UNPROVIDED);
        }
    }

    public static SubLObject linkage_path_between(final SubLObject v_linkage, final SubLObject string1, final SubLObject string2) {
        SubLObject link_word1 = methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, string1);
        SubLObject link_word2 = methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, string2);
        final SubLObject path_queue = queues.create_queue(UNPROVIDED);
        if (NIL == link_word1) {
            link_word1 = methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, string_utilities.split_string(string1, UNPROVIDED).first());
            if (NIL == link_word1) {
                Errors.error($str162$_s_is_not_present_in_input_linkag, string1, instances.get_slot(v_linkage, WORDS));
            }
        }
        if (NIL == link_word2) {
            link_word2 = methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, list_utilities.last_one(string_utilities.split_string(string2, UNPROVIDED)));
            if (NIL == link_word2) {
                Errors.error($str162$_s_is_not_present_in_input_linkag, string2, instances.get_slot(v_linkage, WORDS));
            }
        }
        queues.enqueue(list(link_word1), path_queue);
        return list_utilities.find_all_if(LINK_P, linkage_path_between_int(link_word2, path_queue), UNPROVIDED);
    }

    public static final SubLObject linkage_path_between_int_alt(SubLObject goal_link_word, SubLObject active_paths) {
        {
            SubLObject active_path = NIL;
            while (NIL == queues.queue_empty_p(active_paths)) {
                active_path = queues.dequeue(active_paths);
                {
                    SubLObject current_word = active_path.first();
                    SubLObject all_paths_from_word = union(word_linkage.get_word_linkage_word_right_links(current_word), word_linkage.get_word_linkage_word_left_links(current_word), UNPROVIDED, UNPROVIDED);
                    SubLObject explored_links = list_utilities.find_all_if(LINK_P, active_path, UNPROVIDED);
                    SubLObject unexplored_paths_from_word = set_difference(all_paths_from_word, explored_links, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = unexplored_paths_from_word;
                    SubLObject possibly_good_link = NIL;
                    for (possibly_good_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , possibly_good_link = cdolist_list_var.first()) {
                        if (link_other_word(possibly_good_link, current_word).equal(goal_link_word)) {
                            return cconcatenate(list(goal_link_word, possibly_good_link), active_path);
                        }
                        queues.enqueue(cons(link_other_word(possibly_good_link, current_word), cons(possibly_good_link, copy_list(active_path))), active_paths);
                    }
                }
            } 
            return NIL;
        }
    }

    public static SubLObject linkage_path_between_int(final SubLObject goal_link_word, final SubLObject active_paths) {
        SubLObject active_path = NIL;
        while (NIL == queues.queue_empty_p(active_paths)) {
            active_path = queues.dequeue(active_paths);
            final SubLObject current_word = active_path.first();
            final SubLObject all_paths_from_word = union(word_linkage.get_word_linkage_word_right_links(current_word), word_linkage.get_word_linkage_word_left_links(current_word), UNPROVIDED, UNPROVIDED);
            final SubLObject explored_links = list_utilities.find_all_if(LINK_P, active_path, UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject unexplored_paths_from_word = cdolist_list_var = set_difference(all_paths_from_word, explored_links, UNPROVIDED, UNPROVIDED);
            SubLObject possibly_good_link = NIL;
            possibly_good_link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (link_other_word(possibly_good_link, current_word).equal(goal_link_word)) {
                    return cconcatenate(list(goal_link_word, possibly_good_link), active_path);
                }
                queues.enqueue(cons(link_other_word(possibly_good_link, current_word), cons(possibly_good_link, copy_list(active_path))), active_paths);
                cdolist_list_var = cdolist_list_var.rest();
                possibly_good_link = cdolist_list_var.first();
            } 
        } 
        return NIL;
    }

    public static final SubLObject link_other_word_alt(SubLObject link, SubLObject word) {
        if (word.equal(linkage.link_right_word(link))) {
            return linkage.link_left_word(link);
        }
        return linkage.link_right_word(link);
    }

    public static SubLObject link_other_word(final SubLObject link, final SubLObject word) {
        if (word.equal(linkage.link_right_word(link))) {
            return linkage.link_left_word(link);
        }
        return linkage.link_right_word(link);
    }

    public static SubLObject declare_event_learning_file() {
        declareFunction("event_document_print_function_trampoline", "EVENT-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("event_document_p", "EVENT-DOCUMENT-P", 1, 0, false);
        new event_learning.$event_document_p$UnaryFunction();
        declareFunction("event_doc_cycl", "EVENT-DOC-CYCL", 1, 0, false);
        declareFunction("event_doc_url", "EVENT-DOC-URL", 1, 0, false);
        declareFunction("event_doc_string", "EVENT-DOC-STRING", 1, 0, false);
        declareFunction("event_doc_html_string", "EVENT-DOC-HTML-STRING", 1, 0, false);
        declareFunction("_csetf_event_doc_cycl", "_CSETF-EVENT-DOC-CYCL", 2, 0, false);
        declareFunction("_csetf_event_doc_url", "_CSETF-EVENT-DOC-URL", 2, 0, false);
        declareFunction("_csetf_event_doc_string", "_CSETF-EVENT-DOC-STRING", 2, 0, false);
        declareFunction("_csetf_event_doc_html_string", "_CSETF-EVENT-DOC-HTML-STRING", 2, 0, false);
        declareFunction("make_event_document", "MAKE-EVENT-DOCUMENT", 0, 1, false);
        declareFunction("visit_defstruct_event_document", "VISIT-DEFSTRUCT-EVENT-DOCUMENT", 2, 0, false);
        declareFunction("visit_defstruct_object_event_document_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-DOCUMENT-METHOD", 2, 0, false);
        declareFunction("new_event_document", "NEW-EVENT-DOCUMENT", 1, 1, false);
        declareFunction("get_event_doc_string", "GET-EVENT-DOC-STRING", 1, 0, false);
        declareFunction("get_event_doc_url", "GET-EVENT-DOC-URL", 1, 0, false);
        declareFunction("get_event_doc_content_mt", "GET-EVENT-DOC-CONTENT-MT", 1, 0, false);
        declareFunction("set_event_doc_string", "SET-EVENT-DOC-STRING", 2, 0, false);
        declareFunction("set_event_doc_url", "SET-EVENT-DOC-URL", 2, 0, false);
        declareMacro("do_event_doc_sentences", "DO-EVENT-DOC-SENTENCES");
        declareFunction("event_document_from_file", "EVENT-DOCUMENT-FROM-FILE", 1, 0, false);
        declareFunction("gather_event_graph_from_seed", "GATHER-EVENT-GRAPH-FROM-SEED", 2, 2, false);
        declareMacro("walk_event_graph", "WALK-EVENT-GRAPH");
        declareFunction("is_root_of_event_graph_p", "IS-ROOT-OF-EVENT-GRAPH-P", 2, 0, false);
        declareFunction("clear_get_all_subevents", "CLEAR-GET-ALL-SUBEVENTS", 0, 0, false);
        declareFunction("remove_get_all_subevents", "REMOVE-GET-ALL-SUBEVENTS", 1, 0, false);
        declareFunction("get_all_subevents_internal", "GET-ALL-SUBEVENTS-INTERNAL", 1, 0, false);
        declareFunction("get_all_subevents", "GET-ALL-SUBEVENTS", 1, 0, false);
        declareFunction("clear_get_all_scripted_subevent_types", "CLEAR-GET-ALL-SCRIPTED-SUBEVENT-TYPES", 0, 0, false);
        declareFunction("remove_get_all_scripted_subevent_types", "REMOVE-GET-ALL-SCRIPTED-SUBEVENT-TYPES", 1, 0, false);
        declareFunction("get_all_scripted_subevent_types_internal", "GET-ALL-SCRIPTED-SUBEVENT-TYPES-INTERNAL", 1, 0, false);
        declareFunction("get_all_scripted_subevent_types", "GET-ALL-SCRIPTED-SUBEVENT-TYPES", 1, 0, false);
        declareFunction("best_docs_for_search_strings", "BEST-DOCS-FOR-SEARCH-STRINGS", 1, 0, false);
        declareFunction("best_docs_for_search_terms", "BEST-DOCS-FOR-SEARCH-TERMS", 1, 0, false);
        declareFunction("best_files_for_search_terms", "BEST-FILES-FOR-SEARCH-TERMS", 1, 0, false);
        declareFunction("get_ranked_search_term_list", "GET-RANKED-SEARCH-TERM-LIST", 1, 0, false);
        declareFunction("event_learner_assert", "EVENT-LEARNER-ASSERT", 2, 0, false);
        declareFunction("extract_event_facts_from_doc", "EXTRACT-EVENT-FACTS-FROM-DOC", 1, 0, false);
        declareFunction("best_interpretations_of_facts", "BEST-INTERPRETATIONS-OF-FACTS", 1, 0, false);
        declareFunction("clear_all_event_learning_caches", "CLEAR-ALL-EVENT-LEARNING-CACHES", 0, 0, false);
        declareFunction("event_learning_semantic_mt", "EVENT-LEARNING-SEMANTIC-MT", 1, 0, false);
        declareFunction("gather_facts_from_seed_event", "GATHER-FACTS-FROM-SEED-EVENT", 1, 0, false);
        declareFunction("gather_more_facts_about_seed_event", "GATHER-MORE-FACTS-ABOUT-SEED-EVENT", 3, 0, false);
        declareFunction("get_represented_facts_for_event", "GET-REPRESENTED-FACTS-FOR-EVENT", 2, 0, false);
        declareFunction("get_search_strings_for_represented_event", "GET-SEARCH-STRINGS-FOR-REPRESENTED-EVENT", 2, 1, false);
        declareFunction("get_search_terms_for_represented_event", "GET-SEARCH-TERMS-FOR-REPRESENTED-EVENT", 2, 1, false);
        declareFunction("get_best_documents_for_represented_event_via_terms", "GET-BEST-DOCUMENTS-FOR-REPRESENTED-EVENT-VIA-TERMS", 2, 1, false);
        declareFunction("represented_facts_for_event", "REPRESENTED-FACTS-FOR-EVENT", 1, 0, false);
        declareFunction("webstore_index_doc_count", "WEBSTORE-INDEX-DOC-COUNT", 1, 2, false);
        declareFunction("search_terms_for_sentences_and_event", "SEARCH-TERMS-FOR-SENTENCES-AND-EVENT", 2, 1, false);
        declareFunction("potentially_add_term_for_searching", "POTENTIALLY-ADD-TERM-FOR-SEARCHING", 3, 0, false);
        declareFunction("search_strings_for_sentences_and_event", "SEARCH-STRINGS-FOR-SENTENCES-AND-EVENT", 2, 0, false);
        declareFunction("learn_new_facts_for_event_in_document", "LEARN-NEW-FACTS-FOR-EVENT-IN-DOCUMENT", 3, 0, false);
        declareFunction("substitute_event_for_indexical", "SUBSTITUTE-EVENT-FOR-INDEXICAL", 2, 0, false);
        declareFunction("event_learning_valid_sentP", "EVENT-LEARNING-VALID-SENT?", 1, 0, false);
        declareFunction("learn_new_templates_for_known_facts", "LEARN-NEW-TEMPLATES-FOR-KNOWN-FACTS", 3, 0, false);
        declareFunction("calculate_fact_pairs_for_sentences", "CALCULATE-FACT-PAIRS-FOR-SENTENCES", 2, 0, false);
        declareFunction("subevent_sentences_from_sentences", "SUBEVENT-SENTENCES-FROM-SENTENCES", 1, 0, false);
        declareFunction("phrases_for_individual", "PHRASES-FOR-INDIVIDUAL", 1, 0, false);
        declareFunction("get_markers_for_sentences", "GET-MARKERS-FOR-SENTENCES", 1, 0, false);
        declareFunction("collect_marker_for_individual_cycl_term", "COLLECT-MARKER-FOR-INDIVIDUAL-CYCL-TERM", 3, 1, false);
        declareFunction("get_all_event_types_from_sentences", "GET-ALL-EVENT-TYPES-FROM-SENTENCES", 1, 1, false);
        declareFunction("cycl_event_p", "CYCL-EVENT-P", 1, 0, false);
        declareFunction("marker_strings_for_event_type", "MARKER-STRINGS-FOR-EVENT-TYPE", 2, 1, false);
        declareFunction("clear_get_phrases_for_differentiated_event_types", "CLEAR-GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 0, 0, false);
        declareFunction("remove_get_phrases_for_differentiated_event_types", "REMOVE-GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 1, 1, false);
        declareFunction("get_phrases_for_differentiated_event_types_internal", "GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES-INTERNAL", 2, 0, false);
        declareFunction("get_phrases_for_differentiated_event_types", "GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 1, 1, false);
        declareFunction("differentiate_genls_lists", "DIFFERENTIATE-GENLS-LISTS", 1, 1, false);
        declareFunction("clear_differentiating_genls", "CLEAR-DIFFERENTIATING-GENLS", 0, 0, false);
        declareFunction("remove_differentiating_genls", "REMOVE-DIFFERENTIATING-GENLS", 2, 1, false);
        declareFunction("differentiating_genls_internal", "DIFFERENTIATING-GENLS-INTERNAL", 3, 0, false);
        declareFunction("differentiating_genls", "DIFFERENTIATING-GENLS", 2, 1, false);
        declareFunction("partial_linkage", "PARTIAL-LINKAGE", 2, 0, false);
        declareFunction("linkword_strings_in_linkage_links", "LINKWORD-STRINGS-IN-LINKAGE-LINKS", 1, 0, false);
        declareFunction("event_learning_create_template", "EVENT-LEARNING-CREATE-TEMPLATE", 3, 1, false);
        declareFunction("event_learning_create_and_add_template", "EVENT-LEARNING-CREATE-AND-ADD-TEMPLATE", 3, 2, false);
        declareFunction("strings_sorted_by_offset", "STRINGS-SORTED-BY-OFFSET", 2, 0, false);
        declareFunction("learn_templates_for_sentence", "LEARN-TEMPLATES-FOR-SENTENCE", 3, 1, false);
        declareFunction("pick_best_tuple_groups", "PICK-BEST-TUPLE-GROUPS", 1, 0, false);
        declareFunction("group_sentences_by_subevent", "GROUP-SENTENCES-BY-SUBEVENT", 2, 1, false);
        declareFunction("lambda_subeventP", "LAMBDA-SUBEVENT?", 1, 0, false);
        declareFunction("group_tuples", "GROUP-TUPLES", 2, 0, false);
        declareFunction("get_event_learning_templated_cycl", "GET-EVENT-LEARNING-TEMPLATED-CYCL", 2, 0, false);
        declareFunction("search_strings_for_event_type", "SEARCH-STRINGS-FOR-EVENT-TYPE", 1, 0, false);
        declareFunction("find_possible_known_events_for_fact", "FIND-POSSIBLE-KNOWN-EVENTS-FOR-FACT", 2, 0, false);
        declareFunction("preds_in_cycl_sentences", "PREDS-IN-CYCL-SENTENCES", 1, 0, false);
        declareFunction("best_event_facts_pair", "BEST-EVENT-FACTS-PAIR", 2, 0, false);
        declareFunction("find_best_event", "FIND-BEST-EVENT", 1, 0, false);
        declareFunction("update_event", "UPDATE-EVENT", 3, 0, false);
        declareFunction("find_and_update_event", "FIND-AND-UPDATE-EVENT", 3, 0, false);
        declareFunction("facts_sufficient_to_make_eventP", "FACTS-SUFFICIENT-TO-MAKE-EVENT?", 2, 0, false);
        declareFunction("make_new_event", "MAKE-NEW-EVENT", 3, 0, false);
        declareFunction("find_new_events", "FIND-NEW-EVENTS", 1, 0, false);
        declareFunction("linkage_path_between", "LINKAGE-PATH-BETWEEN", 3, 0, false);
        declareFunction("linkage_path_between_int", "LINKAGE-PATH-BETWEEN-INT", 2, 0, false);
        declareFunction("link_other_word", "LINK-OTHER-WORD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_event_learning_file() {
        defparameter("*EVENT-FINDING-QUERY-MT*", $$InferencePSC);
        defparameter("*EVENT-LEARNING-INDEXES-TEMPLATES*", T);
        defparameter("*EVENT-LEARNING-CYCLIST*", $$TheUser);
        defparameter("*EVENT-LEARNER-HEAD-MT*", $$EventLearnerHeadMt);
        defconstant("*DTP-EVENT-DOCUMENT*", EVENT_DOCUMENT);
        deflexical("*GET-ALL-SUBEVENTS-CACHING-STATE*", NIL);
        deflexical("*GET-ALL-SCRIPTED-SUBEVENT-TYPES-CACHING-STATE*", NIL);
        defparameter("*SEARCH-TERM-RELEVANCY-TOO-HIGH*", $int$1000);
        defparameter("*SEARCH-TERM-RELEVANCY-TOO-LOW*", ZERO_INTEGER);
        defparameter("*SEARCH-TERM-RELEVANCY-ACCEPT*", TEN_INTEGER);
        deflexical("*GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES-CACHING-STATE*", NIL);
        deflexical("*DIFFERENTIATING-GENLS-CACHING-STATE*", NIL);
        defparameter("*SUBEVENTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_event_learning_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_document$.getGlobalValue(), symbol_function(EVENT_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(EVENT_DOC_CYCL, _CSETF_EVENT_DOC_CYCL);
        def_csetf(EVENT_DOC_URL, _CSETF_EVENT_DOC_URL);
        def_csetf(EVENT_DOC_STRING, _CSETF_EVENT_DOC_STRING);
        def_csetf(EVENT_DOC_HTML_STRING, _CSETF_EVENT_DOC_HTML_STRING);
        identity(EVENT_DOCUMENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_document$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_DOCUMENT_METHOD));
        memoization_state.note_globally_cached_function(GET_ALL_SUBEVENTS);
        memoization_state.note_globally_cached_function(GET_ALL_SCRIPTED_SUBEVENT_TYPES);
        memoization_state.note_globally_cached_function(GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES);
        memoization_state.note_globally_cached_function(DIFFERENTIATING_GENLS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_event_learning_file();
    }

    @Override
    public void initializeVariables() {
        init_event_learning_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_event_learning_file();
    }

    static {
    }

    public static final class $event_document_native extends SubLStructNative {
        public SubLObject $cycl;

        public SubLObject $url;

        public SubLObject $string;

        public SubLObject $html_string;

        private static final SubLStructDeclNative structDecl;

        public $event_document_native() {
            event_learning.$event_document_native.this.$cycl = Lisp.NIL;
            event_learning.$event_document_native.this.$url = Lisp.NIL;
            event_learning.$event_document_native.this.$string = Lisp.NIL;
            event_learning.$event_document_native.this.$html_string = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return event_learning.$event_document_native.this.$cycl;
        }

        @Override
        public SubLObject getField3() {
            return event_learning.$event_document_native.this.$url;
        }

        @Override
        public SubLObject getField4() {
            return event_learning.$event_document_native.this.$string;
        }

        @Override
        public SubLObject getField5() {
            return event_learning.$event_document_native.this.$html_string;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return event_learning.$event_document_native.this.$cycl = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return event_learning.$event_document_native.this.$url = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return event_learning.$event_document_native.this.$string = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return event_learning.$event_document_native.this.$html_string = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.event_learning.$event_document_native.class, EVENT_DOCUMENT, EVENT_DOCUMENT_P, $list5, $list6, new String[]{ "$cycl", "$url", "$string", "$html_string" }, $list7, $list8, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $event_document_p$UnaryFunction extends UnaryFunction {
        public $event_document_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-DOCUMENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_document_p(arg1);
        }
    }

    static private final SubLList $list_alt5 = list(makeSymbol("CYCL"), makeSymbol("URL"), makeSymbol("STRING"), makeSymbol("HTML-STRING"));

    static private final SubLList $list_alt6 = list($CYCL, makeKeyword("URL"), makeKeyword("STRING"), makeKeyword("HTML-STRING"));

    static private final SubLList $list_alt7 = list(makeSymbol("EVENT-DOC-CYCL"), makeSymbol("EVENT-DOC-URL"), makeSymbol("EVENT-DOC-STRING"), makeSymbol("EVENT-DOC-HTML-STRING"));

    static private final SubLList $list_alt8 = list(makeSymbol("_CSETF-EVENT-DOC-CYCL"), makeSymbol("_CSETF-EVENT-DOC-URL"), makeSymbol("_CSETF-EVENT-DOC-STRING"), makeSymbol("_CSETF-EVENT-DOC-HTML-STRING"));

    static private final SubLString $str_alt23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt28 = list(reader_make_constant_shell("EBMT-EnglishToCycL"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("SENTENCE-VAR"), makeSymbol("DOC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt35$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt36$_ = makeString(" ");

    static private final SubLString $str_alt39$Invalid_search_direction__A__no_o = makeString("Invalid search direction ~A: no other direction is currently imlemented.");

    static private final SubLList $list_alt44 = list(list(makeSymbol("CURRENT"), makeSymbol("EVENT-GRAPH"), makeSymbol("&KEY"), list(makeSymbol("DIRECTION"), makeKeyword("NOT-PROVIDED"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt45 = list(makeKeyword("DIRECTION"));

    static private final SubLSymbol $sym48$LINKED = makeUninternedSymbol("LINKED");

    static private final SubLSymbol $sym49$EVENT_ROOT = makeUninternedSymbol("EVENT-ROOT");

    static private final SubLSymbol $sym50$THE_DIRECTION = makeUninternedSymbol("THE-DIRECTION");

    static private final SubLList $list_alt53 = list(makeKeyword("NOT-PROVIDED"));

    static private final SubLString $str_alt58$Cannot_walk_event_graph_generated = makeString("Cannot walk event graph generated in direction ~A in direction ~A.~%");

    static private final SubLList $list_alt59 = list(makeKeyword("SEED-EVENT"));

    static private final SubLSymbol $sym62$_EVENT = makeSymbol("?EVENT");

    static private final SubLList $list_alt64 = list(makeSymbol("?EVENT"));

    static private final SubLList $list_alt65 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    public static final SubLSymbol $kw67$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym69$_SUB_TYPE = makeSymbol("?SUB-TYPE");

    static private final SubLList $list_alt72 = list(makeSymbol("?TYPE"));

    static private final SubLList $list_alt73 = list(list(reader_make_constant_shell("thereExists"), makeSymbol("?DIRECT-SUB-TYPE"), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("candidateProperSubSituationTypes"), makeSymbol("?TYPE"), makeSymbol("?SUB-TYPE")), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("candidateProperSubSituationTypes"), makeSymbol("?TYPE"), makeSymbol("?DIRECT-SUB-TYPE")), list(reader_make_constant_shell("candidateProperSubSituationTypes"), makeSymbol("?DIRECT-SUB-TYPE"), makeSymbol("?SUB-TYPE"))))));

    static private final SubLList $list_alt76 = list(makeSymbol("TERM"), makeSymbol("COUNT"), makeSymbol("SEARCH-TERM"));

    static private final SubLSymbol $sym77$_ = makeSymbol(">");

    static private final SubLSymbol $sym79$_ = makeSymbol("<");

    static private final SubLString $str_alt81$Cyc_rejected___S = makeString("Cyc rejected: ~S");

    static private final SubLSymbol $sym83$_MT = makeSymbol("?MT");

    static private final SubLList $list_alt85 = list(makeSymbol("?MT"));

    static private final SubLString $str_alt86$No_semantic_MT_found_for__S__retu = makeString("No semantic MT found for ~S, returning default value: ~S");

    static private final SubLSymbol $sym87$_SPINDLE = makeSymbol("?SPINDLE");

    static private final SubLString $str_alt89$Added__S_new_templates_to_the_EBM = makeString("Added ~S new templates to the EBMT Template Index");

    static private final SubLList $list_alt98 = list(reader_make_constant_shell("HoursDuration"), ONE_INTEGER);

    static private final SubLString $str_alt100$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt101$__ = makeString(") ");

    static private final SubLString $str_alt102$_is_not_a_ = makeString(" is not a ");

    static private final SubLSymbol $sym104$_HEAD = makeSymbol("?HEAD");

    static private final SubLList $list_alt106 = list(makeSymbol("?HEAD"));

    static private final SubLString $str_alt108$Failed_to_assert___S_in__S = makeString("Failed to assert: ~S in ~S");

    static private final SubLList $list_alt110 = list(makeSymbol("FACT"), makeSymbol("MARKER-STRINGS"));

    static private final SubLList $list_alt111 = list(new SubLObject[]{ CHAR_comma, CHAR_period, CHAR_question, CHAR_exclamation, CHAR_semicolon, CHAR_colon, CHAR_lparen, CHAR_rparen, CHAR_hyphen });

    static private final SubLSymbol $sym112$PROPER_SUPERSTRING_ = makeSymbol("PROPER-SUPERSTRING?");

    static private final SubLList $list_alt114 = list(makeKeyword("ACRONYMS"));

    static private final SubLList $list_alt122 = list(makeSymbol("EVENT-TYPE"), makeSymbol("DIFFERENTIATED-GENLS"));

    static private final SubLSymbol $sym123$_STRING = makeSymbol("?STRING");

    static private final SubLList $list_alt125 = list(reader_make_constant_shell("wordStrings"), makeSymbol("?STRING"));

    static private final SubLList $list_alt127 = list(makeSymbol("EVENT-TYPE"), makeSymbol("PHRASES"));

    static private final SubLList $list_alt132 = list($GENL);

    static private final SubLSymbol $sym135$_OTHER_TYPE = makeSymbol("?OTHER-TYPE");

    static private final SubLList $list_alt138 = list(list(reader_make_constant_shell("genls"), makeSymbol("?OTHER-TYPE"), $GENL));

    static private final SubLString $str_alt143$__ = makeString("~~");

    static private final SubLString $str_alt144$_ = makeString("~");

    static private final SubLSymbol $sym147$LAMBDA_SUBEVENT_ = makeSymbol("LAMBDA-SUBEVENT?");

    static private final SubLString $str_alt149$No_substitution_done_for__S = makeString("No substitution done for ~S");

    static private final SubLList $list_alt150 = list(makeString("kidnapping"), makeString("ransom"));

    static private final SubLList $list_alt152 = list(reader_make_constant_shell("crimeVictim"), reader_make_constant_shell("agentCaptured"), reader_make_constant_shell("perpetrator"), reader_make_constant_shell("performedBy"), reader_make_constant_shell("dateOfEvent"), reader_make_constant_shell("eventOccursAt"));

    static private final SubLList $list_alt154 = cons(makeSymbol("EVENT"), makeSymbol("FACTS"));

    static private final SubLString $str_alt155$Failed_to_assert__S_in__S_because = makeString("Failed to assert ~S in ~S because: ~%~S");

    static private final SubLString $str_alt157$Failed_to_assert___S_in__S__ = makeString("Failed to assert: ~S in ~S~%");

    static private final SubLString $str_alt158$NOT_WFF___S__ = makeString("NOT-WFF: ~S~%");

    static private final SubLString $str_alt160$_s_is_not_present_in_input_linkag = makeString("~s is not present in input linkage~% Words: ~S");
}

/**
 * Total time: 548 ms
 */
