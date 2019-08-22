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
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class event_learning extends SubLTranslatedFile {
    public static final SubLFile me = new event_learning();

    public static final String myName = "com.cyc.cycjava.cycl.event_learning";

    public static final String myFingerPrint = "1ddb8861a1a7a97e2429a1552bc953467d8b36fda4619306977d06e8fc3a3ee3";

    // defparameter
    private static final SubLSymbol $event_finding_query_mt$ = makeSymbol("*EVENT-FINDING-QUERY-MT*");

    // defparameter
    private static final SubLSymbol $event_learning_indexes_templates$ = makeSymbol("*EVENT-LEARNING-INDEXES-TEMPLATES*");

    // defparameter
    private static final SubLSymbol $event_learning_cyclist$ = makeSymbol("*EVENT-LEARNING-CYCLIST*");

    // defparameter
    private static final SubLSymbol $event_learner_head_mt$ = makeSymbol("*EVENT-LEARNER-HEAD-MT*");

    // defconstant
    public static final SubLSymbol $dtp_event_document$ = makeSymbol("*DTP-EVENT-DOCUMENT*");





    // defparameter
    // If more than or equal to n documents mention it, this is not helping.
    public static final SubLSymbol $search_term_relevancy_too_high$ = makeSymbol("*SEARCH-TERM-RELEVANCY-TOO-HIGH*");

    // defparameter
    // If less than or equal to n documents mention it, this is too obscure.
    public static final SubLSymbol $search_term_relevancy_too_low$ = makeSymbol("*SEARCH-TERM-RELEVANCY-TOO-LOW*");

    // defparameter
    /**
     * If this many or fewer (but more than too low) are selected, this is
     * excellent.
     */
    public static final SubLSymbol $search_term_relevancy_accept$ = makeSymbol("*SEARCH-TERM-RELEVANCY-ACCEPT*");





    // defparameter
    private static final SubLSymbol $subevents$ = makeSymbol("*SUBEVENTS*");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$TheUser = reader_make_constant_shell(makeString("TheUser"));

    private static final SubLObject $$EventLearnerHeadMt = reader_make_constant_shell(makeString("EventLearnerHeadMt"));

    public static final SubLSymbol EVENT_DOCUMENT = makeSymbol("EVENT-DOCUMENT");

    public static final SubLSymbol EVENT_DOCUMENT_P = makeSymbol("EVENT-DOCUMENT-P");

    public static final SubLList $list5 = list(makeSymbol("CYCL"), makeSymbol("URL"), makeSymbol("STRING"), makeSymbol("HTML-STRING"));

    public static final SubLList $list6 = list(makeKeyword("CYCL"), makeKeyword("URL"), makeKeyword("STRING"), makeKeyword("HTML-STRING"));

    public static final SubLList $list7 = list(makeSymbol("EVENT-DOC-CYCL"), makeSymbol("EVENT-DOC-URL"), makeSymbol("EVENT-DOC-STRING"), makeSymbol("EVENT-DOC-HTML-STRING"));

    public static final SubLList $list8 = list(makeSymbol("_CSETF-EVENT-DOC-CYCL"), makeSymbol("_CSETF-EVENT-DOC-URL"), makeSymbol("_CSETF-EVENT-DOC-STRING"), makeSymbol("_CSETF-EVENT-DOC-HTML-STRING"));



    public static final SubLSymbol EVENT_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLObject $$WebPageAtURLFn = reader_make_constant_shell(makeString("WebPageAtURLFn"));

    private static final SubLObject $$URLFn = reader_make_constant_shell(makeString("URLFn"));

    private static final SubLObject $$ContentMtOfCDAFromEventTypeFn = reader_make_constant_shell(makeString("ContentMtOfCDAFromEventTypeFn"));

    private static final SubLObject $$URLReferentFn = reader_make_constant_shell(makeString("URLReferentFn"));

    private static final SubLList $list34 = list(reader_make_constant_shell(makeString("EBMT-EnglishToCycL")));

    private static final SubLList $list35 = list(list(makeSymbol("SENTENCE-VAR"), makeSymbol("DOC")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol SENTENCIFY_STRING = makeSymbol("SENTENCIFY-STRING");

    private static final SubLSymbol GET_EVENT_DOC_STRING = makeSymbol("GET-EVENT-DOC-STRING");

    private static final SubLString $str39$ = makeString("");



    private static final SubLString $str41$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$_ = makeString(" ");



    private static final SubLObject $$facilitates_EventEvent = reader_make_constant_shell(makeString("facilitates-EventEvent"));

    private static final SubLString $str45$Invalid_search_direction__A__no_o = makeString("Invalid search direction ~A: no other direction is currently imlemented.");







    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));

    private static final SubLList $list50 = list(list(makeSymbol("CURRENT"), makeSymbol("EVENT-GRAPH"), makeSymbol("&KEY"), list(makeSymbol("DIRECTION"), makeKeyword("NOT-PROVIDED"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list51 = list(makeKeyword("DIRECTION"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym54$LINKED = makeUninternedSymbol("LINKED");

    private static final SubLSymbol $sym55$EVENT_ROOT = makeUninternedSymbol("EVENT-ROOT");

    private static final SubLSymbol $sym56$THE_DIRECTION = makeUninternedSymbol("THE-DIRECTION");





    public static final SubLList $list59 = list(makeKeyword("NOT-PROVIDED"));









    private static final SubLString $str64$Cannot_walk_event_graph_generated = makeString("Cannot walk event graph generated in direction ~A in direction ~A.~%");

    public static final SubLList $list65 = list(makeKeyword("SEED-EVENT"));

    private static final SubLSymbol WALK_GRAPH_BREADTH_FIRST = makeSymbol("WALK-GRAPH-BREADTH-FIRST");

    private static final SubLSymbol GET_ALL_SUBEVENTS = makeSymbol("GET-ALL-SUBEVENTS");

    private static final SubLSymbol $sym68$_EVENT = makeSymbol("?EVENT");

    private static final SubLObject $$properSubEvents = reader_make_constant_shell(makeString("properSubEvents"));

    private static final SubLList $list70 = list(makeSymbol("?EVENT"));

    private static final SubLList $list71 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    private static final SubLSymbol $get_all_subevents_caching_state$ = makeSymbol("*GET-ALL-SUBEVENTS-CACHING-STATE*");

    private static final SubLSymbol GET_ALL_SCRIPTED_SUBEVENT_TYPES = makeSymbol("GET-ALL-SCRIPTED-SUBEVENT-TYPES");

    private static final SubLSymbol $sym74$_SUB_TYPE = makeSymbol("?SUB-TYPE");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list77 = list(makeSymbol("?TYPE"));

    private static final SubLList $list78 = list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?DIRECT-SUB-TYPE"), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("candidateProperSubSituationTypes")), makeSymbol("?TYPE"), makeSymbol("?SUB-TYPE")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("candidateProperSubSituationTypes")), makeSymbol("?TYPE"), makeSymbol("?DIRECT-SUB-TYPE")), list(reader_make_constant_shell(makeString("candidateProperSubSituationTypes")), makeSymbol("?DIRECT-SUB-TYPE"), makeSymbol("?SUB-TYPE"))))));

    private static final SubLSymbol $get_all_scripted_subevent_types_caching_state$ = makeSymbol("*GET-ALL-SCRIPTED-SUBEVENT-TYPES-CACHING-STATE*");



    private static final SubLList $list81 = list(makeSymbol("TERM"), makeSymbol("COUNT"), makeSymbol("SEARCH-TERM"));

    private static final SubLSymbol $sym82$_ = makeSymbol(">");



    private static final SubLSymbol $sym84$_ = makeSymbol("<");



    private static final SubLString $str86$Cyc_rejected___S = makeString("Cyc rejected: ~S");



    private static final SubLSymbol $sym88$_MT = makeSymbol("?MT");

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    private static final SubLList $list90 = list(makeSymbol("?MT"));

    private static final SubLString $str91$No_semantic_MT_found_for__S__retu = makeString("No semantic MT found for ~S, returning default value: ~S");

    private static final SubLSymbol $sym92$_SPINDLE = makeSymbol("?SPINDLE");

    private static final SubLObject $$mtSpindleCollector = reader_make_constant_shell(makeString("mtSpindleCollector"));

    private static final SubLString $str94$Added__S_new_templates_to_the_EBM = makeString("Added ~S new templates to the EBMT Template Index");



    private static final SubLObject $$Event = reader_make_constant_shell(makeString("Event"));

    private static final SubLObject $$SBHLTimePredicate = reader_make_constant_shell(makeString("SBHLTimePredicate"));

    private static final SubLObject $$Role = reader_make_constant_shell(makeString("Role"));

    private static final SubLObject $$subEvents = reader_make_constant_shell(makeString("subEvents"));



    private static final SubLSymbol WEBSTORE_INDEX_DOC_COUNT = makeSymbol("WEBSTORE-INDEX-DOC-COUNT");



    private static final SubLList $list103 = list(reader_make_constant_shell(makeString("HoursDuration")), ONE_INTEGER);

    private static final SubLObject $$ActorSlot = reader_make_constant_shell(makeString("ActorSlot"));

    private static final SubLSymbol $sym105$_HEAD = makeSymbol("?HEAD");

    private static final SubLObject $$mtSpindleHead = reader_make_constant_shell(makeString("mtSpindleHead"));

    private static final SubLList $list107 = list(makeSymbol("?HEAD"));

    private static final SubLObject $$mtSpindleMember = reader_make_constant_shell(makeString("mtSpindleMember"));

    private static final SubLString $str109$Failed_to_assert___S_in__S = makeString("Failed to assert: ~S in ~S");

    private static final SubLSymbol INDEXICAL_P = makeSymbol("INDEXICAL-P");

    public static final SubLList $list111 = list(makeSymbol("FACT"), makeSymbol("MARKER-STRINGS"));

    private static final SubLList $list112 = list(new SubLObject[]{ CHAR_comma, CHAR_period, CHAR_question, CHAR_exclamation, CHAR_semicolon, CHAR_colon, CHAR_lparen, CHAR_rparen, CHAR_hyphen });

    private static final SubLSymbol $sym113$PROPER_SUPERSTRING_ = makeSymbol("PROPER-SUPERSTRING?");



    private static final SubLList $list115 = list(makeKeyword("ACRONYMS"));

    private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));

    private static final SubLSymbol GENERATE_ENGLISH_DAY_NAUT = makeSymbol("GENERATE-ENGLISH-DAY-NAUT");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol CYCL_EVENT_P = makeSymbol("CYCL-EVENT-P");



    private static final SubLSymbol GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES = makeSymbol("GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES");

    private static final SubLList $list123 = list(makeSymbol("EVENT-TYPE"), makeSymbol("DIFFERENTIATED-GENLS"));

    private static final SubLSymbol $sym124$_STRING = makeSymbol("?STRING");

    private static final SubLObject $$termPhrases = reader_make_constant_shell(makeString("termPhrases"));

    private static final SubLList $list126 = list(reader_make_constant_shell(makeString("wordStrings")), makeSymbol("?STRING"));

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLList $list128 = list(makeSymbol("EVENT-TYPE"), makeSymbol("PHRASES"));

    private static final SubLSymbol $get_phrases_for_differentiated_event_types_caching_state$ = makeSymbol("*GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES-CACHING-STATE*");

    private static final SubLSymbol DIFFERENTIATING_GENLS = makeSymbol("DIFFERENTIATING-GENLS");



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list133 = list(makeKeyword("GENL"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym136$_OTHER_TYPE = makeSymbol("?OTHER-TYPE");

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLList $list139 = list(list(reader_make_constant_shell(makeString("genls")), makeSymbol("?OTHER-TYPE"), makeKeyword("GENL")));

    private static final SubLSymbol $differentiating_genls_caching_state$ = makeSymbol("*DIFFERENTIATING-GENLS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_DIFFERENTIATING_GENLS = makeSymbol("CLEAR-DIFFERENTIATING-GENLS");





    private static final SubLString $str144$__ = makeString("~~");

    private static final SubLString $str145$_ = makeString("~");





    private static final SubLSymbol $sym148$LAMBDA_SUBEVENT_ = makeSymbol("LAMBDA-SUBEVENT?");

    private static final SubLObject $$TheFn = reader_make_constant_shell(makeString("TheFn"));

    private static final SubLString $str150$No_substitution_done_for__S = makeString("No substitution done for ~S");

    private static final SubLList $list151 = list(makeString("kidnapping"), makeString("ransom"));



    private static final SubLList $list153 = list(reader_make_constant_shell(makeString("crimeVictim")), reader_make_constant_shell(makeString("agentCaptured")), reader_make_constant_shell(makeString("perpetrator")), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("dateOfEvent")), reader_make_constant_shell(makeString("eventOccursAt")));

    private static final SubLSymbol GREATER_LENGTH_P = makeSymbol("GREATER-LENGTH-P");

    private static final SubLList $list155 = cons(makeSymbol("EVENT"), makeSymbol("FACTS"));

    private static final SubLString $str156$Failed_to_assert__S_in__S_because = makeString("Failed to assert ~S in ~S because: ~%~S");

    private static final SubLString $$$GatheredEvent = makeString("GatheredEvent");



    private static final SubLString $str159$Failed_to_assert___S_in__S__ = makeString("Failed to assert: ~S in ~S~%");

    private static final SubLString $str160$NOT_WFF___S__ = makeString("NOT-WFF: ~S~%");



    private static final SubLString $str162$_s_is_not_present_in_input_linkag = makeString("~s is not present in input linkage~% Words: ~S");



    private static final SubLSymbol LINK_P = makeSymbol("LINK-P");

    public static SubLObject event_document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_document_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$event_document_native.class ? T : NIL;
    }

    public static SubLObject event_doc_cycl(final SubLObject v_object) {
        assert NIL != event_document_p(v_object) : "event_learning.event_document_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject event_doc_url(final SubLObject v_object) {
        assert NIL != event_document_p(v_object) : "event_learning.event_document_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject event_doc_string(final SubLObject v_object) {
        assert NIL != event_document_p(v_object) : "event_learning.event_document_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject event_doc_html_string(final SubLObject v_object) {
        assert NIL != event_document_p(v_object) : "event_learning.event_document_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_event_doc_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_document_p(v_object) : "event_learning.event_document_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_doc_url(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_document_p(v_object) : "event_learning.event_document_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_doc_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_document_p(v_object) : "event_learning.event_document_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_event_doc_html_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_document_p(v_object) : "event_learning.event_document_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_event_document(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $event_document_native();
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

    public static SubLObject get_event_doc_string(final SubLObject doc) {
        return event_doc_string(doc);
    }

    public static SubLObject get_event_doc_url(final SubLObject doc) {
        return event_doc_url(doc);
    }

    public static SubLObject get_event_doc_content_mt(final SubLObject doc) {
        return narts_high.nart_substitute(listS($$ContentMtOfCDAFromEventTypeFn, list($$URLReferentFn, get_event_doc_url(doc)), $list34));
    }

    public static SubLObject set_event_doc_string(final SubLObject doc, final SubLObject string) {
        _csetf_event_doc_string(doc, string);
        return doc;
    }

    public static SubLObject set_event_doc_url(final SubLObject doc, final SubLObject url) {
        _csetf_event_doc_url(doc, url);
        return doc;
    }

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

    public static SubLObject is_root_of_event_graph_p(final SubLObject v_term, final SubLObject event_graph) {
        return eq(v_term, dictionary.dictionary_lookup(event_graph, $SEED_EVENT, UNPROVIDED));
    }

    public static SubLObject clear_get_all_subevents() {
        final SubLObject cs = $get_all_subevents_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_all_subevents(final SubLObject event) {
        return memoization_state.caching_state_remove_function_results_with_args($get_all_subevents_caching_state$.getGlobalValue(), list(event), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_all_subevents_internal(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable($sym68$_EVENT, listS($$properSubEvents, event, $list70), $event_finding_query_mt$.getDynamicValue(thread), $list71);
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

    public static SubLObject clear_get_all_scripted_subevent_types() {
        final SubLObject cs = $get_all_scripted_subevent_types_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_all_scripted_subevent_types(final SubLObject event) {
        return memoization_state.caching_state_remove_function_results_with_args($get_all_scripted_subevent_types_caching_state$.getGlobalValue(), list(event), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_all_scripted_subevent_types_internal(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subevent_types = ask_utilities.query_variable($sym74$_SUB_TYPE, listS($$and, listS($$isa, event, $list77), $list78), $event_finding_query_mt$.getDynamicValue(thread), UNPROVIDED);
        subevent_types = cconcatenate(isa.min_isa(event, UNPROVIDED, UNPROVIDED), subevent_types);
        return subevent_types;
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

    public static SubLObject best_docs_for_search_strings(final SubLObject search_strings) {
        final SubLObject docs = NIL;
        return docs;
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

    public static SubLObject clear_all_event_learning_caches() {
        clear_get_phrases_for_differentiated_event_types();
        clear_differentiating_genls();
        clear_get_all_subevents();
        clear_get_all_scripted_subevent_types();
        return $CLEARED;
    }

    public static SubLObject event_learning_semantic_mt(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject semantic_mt = ask_utilities.query_variable($sym88$_MT, listS($$definingMt, event, $list90), $$InferencePSC, UNPROVIDED).first();
        if (NIL == semantic_mt) {
            Errors.warn($str91$No_semantic_MT_found_for__S__retu, event, mt_relevance_macros.$mt$.getDynamicValue(thread));
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        return semantic_mt;
    }

    public static SubLObject gather_facts_from_seed_event(final SubLObject event) {
        final SubLObject semantic_mt = event_learning_semantic_mt(event);
        final SubLObject event_source_spindle = ask_utilities.query_variable($sym92$_SPINDLE, list($$mtSpindleCollector, $sym92$_SPINDLE, semantic_mt), UNPROVIDED, UNPROVIDED).first();
        return gather_more_facts_about_seed_event(event, semantic_mt, event_source_spindle);
    }

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

    public static SubLObject get_best_documents_for_represented_event_via_terms(final SubLObject event, final SubLObject elmt, SubLObject facts) {
        if (facts == UNPROVIDED) {
            facts = NIL;
        }
        final SubLObject search_terms = get_search_terms_for_represented_event(event, elmt, facts);
        return best_docs_for_search_terms(search_terms);
    }

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

    public static SubLObject event_learning_valid_sentP(final SubLObject sent) {
        return sent;
    }

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
    }

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

    public static SubLObject cycl_event_p(final SubLObject obj) {
        return makeBoolean((NIL != forts.fort_p(obj)) && (NIL != isa.isa_in_any_mtP(obj, $$Event)));
    }

    public static SubLObject marker_strings_for_event_type(final SubLObject event_type, final SubLObject reference_event_types, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject non_shared_genls_list = differentiate_genls_lists(union(list(event_type), reference_event_types, UNPROVIDED, UNPROVIDED), mt);
        final SubLObject differentiated_phrase_list = get_phrases_for_differentiated_event_types(non_shared_genls_list, UNPROVIDED);
        return second(find(event_type, differentiated_phrase_list, EQUAL, FIRST, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject clear_get_phrases_for_differentiated_event_types() {
        final SubLObject cs = $get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_phrases_for_differentiated_event_types(final SubLObject differentiated_event_types, SubLObject semantic_mt) {
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue(), list(differentiated_event_types, semantic_mt), UNPROVIDED, UNPROVIDED);
    }

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

    public static SubLObject clear_differentiating_genls() {
        final SubLObject cs = $differentiating_genls_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_differentiating_genls(final SubLObject coll, final SubLObject differentia, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($differentiating_genls_caching_state$.getGlobalValue(), list(coll, differentia, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject differentiating_genls_internal(final SubLObject coll, final SubLObject differentia, final SubLObject mt) {
        return ask_utilities.query_variable($GENL, list($$and, listS($$genls, coll, $list133), list($$unknownSentence, list($$thereExists, $sym136$_OTHER_TYPE, listS($$and, list($$elementOf, $sym136$_OTHER_TYPE, bq_cons($$TheSet, differentia)), $list139)))), mt, UNPROVIDED);
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

    public static SubLObject partial_linkage(final SubLObject v_word_linkage, SubLObject sorted_nl_markers) {
        SubLObject selected_links = NIL;
        while (length(sorted_nl_markers).numG(ONE_INTEGER)) {
            selected_links = nunion(selected_links, linkage_path_between(v_word_linkage, sorted_nl_markers.first(), second(sorted_nl_markers)), UNPROVIDED, UNPROVIDED);
            sorted_nl_markers = sorted_nl_markers.rest();
        } 
        return selected_links;
    }

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
    }

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
    }

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
    }

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
    }

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

    public static SubLObject lambda_subeventP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(obj, $subevents$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
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

    public static SubLObject search_strings_for_event_type(final SubLObject event_type) {
        final SubLObject search_strings = $list151;
        return search_strings;
    }

    public static SubLObject find_possible_known_events_for_fact(final SubLObject event_type, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexical = cycl_utilities.expression_gather(sentence, INDEXICAL_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED).first();
        final SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
        final SubLObject query_sentence = cycl_utilities.expression_subst($sym68$_EVENT, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject matching_events = ask_utilities.query_variable($sym68$_EVENT, list($$and, list($$isa, $sym68$_EVENT, event_type), list($$isa, $sym68$_EVENT, indexical_event_type), query_sentence), $event_finding_query_mt$.getDynamicValue(thread), UNPROVIDED);
        return matching_events;
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
    }

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
    }

    public static SubLObject facts_sufficient_to_make_eventP(final SubLObject event_type, final SubLObject facts) {
        return T;
    }

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

    public static SubLObject link_other_word(final SubLObject link, final SubLObject word) {
        if (word.equal(linkage.link_right_word(link))) {
            return linkage.link_left_word(link);
        }
        return linkage.link_right_word(link);
    }

    public static SubLObject declare_event_learning_file() {
        declareFunction(me, "event_document_print_function_trampoline", "EVENT-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "event_document_p", "EVENT-DOCUMENT-P", 1, 0, false);
        new event_learning.$event_document_p$UnaryFunction();
        declareFunction(me, "event_doc_cycl", "EVENT-DOC-CYCL", 1, 0, false);
        declareFunction(me, "event_doc_url", "EVENT-DOC-URL", 1, 0, false);
        declareFunction(me, "event_doc_string", "EVENT-DOC-STRING", 1, 0, false);
        declareFunction(me, "event_doc_html_string", "EVENT-DOC-HTML-STRING", 1, 0, false);
        declareFunction(me, "_csetf_event_doc_cycl", "_CSETF-EVENT-DOC-CYCL", 2, 0, false);
        declareFunction(me, "_csetf_event_doc_url", "_CSETF-EVENT-DOC-URL", 2, 0, false);
        declareFunction(me, "_csetf_event_doc_string", "_CSETF-EVENT-DOC-STRING", 2, 0, false);
        declareFunction(me, "_csetf_event_doc_html_string", "_CSETF-EVENT-DOC-HTML-STRING", 2, 0, false);
        declareFunction(me, "make_event_document", "MAKE-EVENT-DOCUMENT", 0, 1, false);
        declareFunction(me, "visit_defstruct_event_document", "VISIT-DEFSTRUCT-EVENT-DOCUMENT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_event_document_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-DOCUMENT-METHOD", 2, 0, false);
        declareFunction(me, "new_event_document", "NEW-EVENT-DOCUMENT", 1, 1, false);
        declareFunction(me, "get_event_doc_string", "GET-EVENT-DOC-STRING", 1, 0, false);
        declareFunction(me, "get_event_doc_url", "GET-EVENT-DOC-URL", 1, 0, false);
        declareFunction(me, "get_event_doc_content_mt", "GET-EVENT-DOC-CONTENT-MT", 1, 0, false);
        declareFunction(me, "set_event_doc_string", "SET-EVENT-DOC-STRING", 2, 0, false);
        declareFunction(me, "set_event_doc_url", "SET-EVENT-DOC-URL", 2, 0, false);
        declareMacro(me, "do_event_doc_sentences", "DO-EVENT-DOC-SENTENCES");
        declareFunction(me, "event_document_from_file", "EVENT-DOCUMENT-FROM-FILE", 1, 0, false);
        declareFunction(me, "gather_event_graph_from_seed", "GATHER-EVENT-GRAPH-FROM-SEED", 2, 2, false);
        declareMacro(me, "walk_event_graph", "WALK-EVENT-GRAPH");
        declareFunction(me, "is_root_of_event_graph_p", "IS-ROOT-OF-EVENT-GRAPH-P", 2, 0, false);
        declareFunction(me, "clear_get_all_subevents", "CLEAR-GET-ALL-SUBEVENTS", 0, 0, false);
        declareFunction(me, "remove_get_all_subevents", "REMOVE-GET-ALL-SUBEVENTS", 1, 0, false);
        declareFunction(me, "get_all_subevents_internal", "GET-ALL-SUBEVENTS-INTERNAL", 1, 0, false);
        declareFunction(me, "get_all_subevents", "GET-ALL-SUBEVENTS", 1, 0, false);
        declareFunction(me, "clear_get_all_scripted_subevent_types", "CLEAR-GET-ALL-SCRIPTED-SUBEVENT-TYPES", 0, 0, false);
        declareFunction(me, "remove_get_all_scripted_subevent_types", "REMOVE-GET-ALL-SCRIPTED-SUBEVENT-TYPES", 1, 0, false);
        declareFunction(me, "get_all_scripted_subevent_types_internal", "GET-ALL-SCRIPTED-SUBEVENT-TYPES-INTERNAL", 1, 0, false);
        declareFunction(me, "get_all_scripted_subevent_types", "GET-ALL-SCRIPTED-SUBEVENT-TYPES", 1, 0, false);
        declareFunction(me, "best_docs_for_search_strings", "BEST-DOCS-FOR-SEARCH-STRINGS", 1, 0, false);
        declareFunction(me, "best_docs_for_search_terms", "BEST-DOCS-FOR-SEARCH-TERMS", 1, 0, false);
        declareFunction(me, "best_files_for_search_terms", "BEST-FILES-FOR-SEARCH-TERMS", 1, 0, false);
        declareFunction(me, "get_ranked_search_term_list", "GET-RANKED-SEARCH-TERM-LIST", 1, 0, false);
        declareFunction(me, "event_learner_assert", "EVENT-LEARNER-ASSERT", 2, 0, false);
        declareFunction(me, "extract_event_facts_from_doc", "EXTRACT-EVENT-FACTS-FROM-DOC", 1, 0, false);
        declareFunction(me, "best_interpretations_of_facts", "BEST-INTERPRETATIONS-OF-FACTS", 1, 0, false);
        declareFunction(me, "clear_all_event_learning_caches", "CLEAR-ALL-EVENT-LEARNING-CACHES", 0, 0, false);
        declareFunction(me, "event_learning_semantic_mt", "EVENT-LEARNING-SEMANTIC-MT", 1, 0, false);
        declareFunction(me, "gather_facts_from_seed_event", "GATHER-FACTS-FROM-SEED-EVENT", 1, 0, false);
        declareFunction(me, "gather_more_facts_about_seed_event", "GATHER-MORE-FACTS-ABOUT-SEED-EVENT", 3, 0, false);
        declareFunction(me, "get_represented_facts_for_event", "GET-REPRESENTED-FACTS-FOR-EVENT", 2, 0, false);
        declareFunction(me, "get_search_strings_for_represented_event", "GET-SEARCH-STRINGS-FOR-REPRESENTED-EVENT", 2, 1, false);
        declareFunction(me, "get_search_terms_for_represented_event", "GET-SEARCH-TERMS-FOR-REPRESENTED-EVENT", 2, 1, false);
        declareFunction(me, "get_best_documents_for_represented_event_via_terms", "GET-BEST-DOCUMENTS-FOR-REPRESENTED-EVENT-VIA-TERMS", 2, 1, false);
        declareFunction(me, "represented_facts_for_event", "REPRESENTED-FACTS-FOR-EVENT", 1, 0, false);
        declareFunction(me, "webstore_index_doc_count", "WEBSTORE-INDEX-DOC-COUNT", 1, 2, false);
        declareFunction(me, "search_terms_for_sentences_and_event", "SEARCH-TERMS-FOR-SENTENCES-AND-EVENT", 2, 1, false);
        declareFunction(me, "potentially_add_term_for_searching", "POTENTIALLY-ADD-TERM-FOR-SEARCHING", 3, 0, false);
        declareFunction(me, "search_strings_for_sentences_and_event", "SEARCH-STRINGS-FOR-SENTENCES-AND-EVENT", 2, 0, false);
        declareFunction(me, "learn_new_facts_for_event_in_document", "LEARN-NEW-FACTS-FOR-EVENT-IN-DOCUMENT", 3, 0, false);
        declareFunction(me, "substitute_event_for_indexical", "SUBSTITUTE-EVENT-FOR-INDEXICAL", 2, 0, false);
        declareFunction(me, "event_learning_valid_sentP", "EVENT-LEARNING-VALID-SENT?", 1, 0, false);
        declareFunction(me, "learn_new_templates_for_known_facts", "LEARN-NEW-TEMPLATES-FOR-KNOWN-FACTS", 3, 0, false);
        declareFunction(me, "calculate_fact_pairs_for_sentences", "CALCULATE-FACT-PAIRS-FOR-SENTENCES", 2, 0, false);
        declareFunction(me, "subevent_sentences_from_sentences", "SUBEVENT-SENTENCES-FROM-SENTENCES", 1, 0, false);
        declareFunction(me, "phrases_for_individual", "PHRASES-FOR-INDIVIDUAL", 1, 0, false);
        declareFunction(me, "get_markers_for_sentences", "GET-MARKERS-FOR-SENTENCES", 1, 0, false);
        declareFunction(me, "collect_marker_for_individual_cycl_term", "COLLECT-MARKER-FOR-INDIVIDUAL-CYCL-TERM", 3, 1, false);
        declareFunction(me, "get_all_event_types_from_sentences", "GET-ALL-EVENT-TYPES-FROM-SENTENCES", 1, 1, false);
        declareFunction(me, "cycl_event_p", "CYCL-EVENT-P", 1, 0, false);
        declareFunction(me, "marker_strings_for_event_type", "MARKER-STRINGS-FOR-EVENT-TYPE", 2, 1, false);
        declareFunction(me, "clear_get_phrases_for_differentiated_event_types", "CLEAR-GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 0, 0, false);
        declareFunction(me, "remove_get_phrases_for_differentiated_event_types", "REMOVE-GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 1, 1, false);
        declareFunction(me, "get_phrases_for_differentiated_event_types_internal", "GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES-INTERNAL", 2, 0, false);
        declareFunction(me, "get_phrases_for_differentiated_event_types", "GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 1, 1, false);
        declareFunction(me, "differentiate_genls_lists", "DIFFERENTIATE-GENLS-LISTS", 1, 1, false);
        declareFunction(me, "clear_differentiating_genls", "CLEAR-DIFFERENTIATING-GENLS", 0, 0, false);
        declareFunction(me, "remove_differentiating_genls", "REMOVE-DIFFERENTIATING-GENLS", 2, 1, false);
        declareFunction(me, "differentiating_genls_internal", "DIFFERENTIATING-GENLS-INTERNAL", 3, 0, false);
        declareFunction(me, "differentiating_genls", "DIFFERENTIATING-GENLS", 2, 1, false);
        declareFunction(me, "partial_linkage", "PARTIAL-LINKAGE", 2, 0, false);
        declareFunction(me, "linkword_strings_in_linkage_links", "LINKWORD-STRINGS-IN-LINKAGE-LINKS", 1, 0, false);
        declareFunction(me, "event_learning_create_template", "EVENT-LEARNING-CREATE-TEMPLATE", 3, 1, false);
        declareFunction(me, "event_learning_create_and_add_template", "EVENT-LEARNING-CREATE-AND-ADD-TEMPLATE", 3, 2, false);
        declareFunction(me, "strings_sorted_by_offset", "STRINGS-SORTED-BY-OFFSET", 2, 0, false);
        declareFunction(me, "learn_templates_for_sentence", "LEARN-TEMPLATES-FOR-SENTENCE", 3, 1, false);
        declareFunction(me, "pick_best_tuple_groups", "PICK-BEST-TUPLE-GROUPS", 1, 0, false);
        declareFunction(me, "group_sentences_by_subevent", "GROUP-SENTENCES-BY-SUBEVENT", 2, 1, false);
        declareFunction(me, "lambda_subeventP", "LAMBDA-SUBEVENT?", 1, 0, false);
        declareFunction(me, "group_tuples", "GROUP-TUPLES", 2, 0, false);
        declareFunction(me, "get_event_learning_templated_cycl", "GET-EVENT-LEARNING-TEMPLATED-CYCL", 2, 0, false);
        declareFunction(me, "search_strings_for_event_type", "SEARCH-STRINGS-FOR-EVENT-TYPE", 1, 0, false);
        declareFunction(me, "find_possible_known_events_for_fact", "FIND-POSSIBLE-KNOWN-EVENTS-FOR-FACT", 2, 0, false);
        declareFunction(me, "preds_in_cycl_sentences", "PREDS-IN-CYCL-SENTENCES", 1, 0, false);
        declareFunction(me, "best_event_facts_pair", "BEST-EVENT-FACTS-PAIR", 2, 0, false);
        declareFunction(me, "find_best_event", "FIND-BEST-EVENT", 1, 0, false);
        declareFunction(me, "update_event", "UPDATE-EVENT", 3, 0, false);
        declareFunction(me, "find_and_update_event", "FIND-AND-UPDATE-EVENT", 3, 0, false);
        declareFunction(me, "facts_sufficient_to_make_eventP", "FACTS-SUFFICIENT-TO-MAKE-EVENT?", 2, 0, false);
        declareFunction(me, "make_new_event", "MAKE-NEW-EVENT", 3, 0, false);
        declareFunction(me, "find_new_events", "FIND-NEW-EVENTS", 1, 0, false);
        declareFunction(me, "linkage_path_between", "LINKAGE-PATH-BETWEEN", 3, 0, false);
        declareFunction(me, "linkage_path_between_int", "LINKAGE-PATH-BETWEEN-INT", 2, 0, false);
        declareFunction(me, "link_other_word", "LINK-OTHER-WORD", 2, 0, false);
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

    

    public static final class $event_document_native extends SubLStructNative {
        public SubLObject $cycl;

        public SubLObject $url;

        public SubLObject $string;

        public SubLObject $html_string;

        private static final SubLStructDeclNative structDecl;

        private $event_document_native() {
            this.$cycl = Lisp.NIL;
            this.$url = Lisp.NIL;
            this.$string = Lisp.NIL;
            this.$html_string = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cycl;
        }

        @Override
        public SubLObject getField3() {
            return this.$url;
        }

        @Override
        public SubLObject getField4() {
            return this.$string;
        }

        @Override
        public SubLObject getField5() {
            return this.$html_string;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$url = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$string = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$html_string = value;
        }

        static {
            structDecl = makeStructDeclNative($event_document_native.class, EVENT_DOCUMENT, EVENT_DOCUMENT_P, $list5, $list6, new String[]{ "$cycl", "$url", "$string", "$html_string" }, $list7, $list8, DEFAULT_STRUCT_PRINT_FUNCTION);
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
}

/**
 * Total time: 548 ms
 */
