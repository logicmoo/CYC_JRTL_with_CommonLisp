/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.html_utilities.remove_html_tags;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DOCUMENT-SEARCH
 * source file: /cyc/top/cycl/document-search.lisp
 * created:     2019/07/03 17:38:53
 */
public final class document_search extends SubLTranslatedFile implements V12 {
    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_82_initializer() {
        return list(list(list(makeString("George Washington chopped down an apple tree"), reader_make_constant_shell("InferencePSC"), reader_make_constant_shell("EnglishParaphraseMt"), NIL), list(list(list(list(makeString("George Washington"), list(list(makeString("George"), reader_make_constant_shell("GeorgeWashington"), NIL, makeString("<a href=\"cg?CB-CF&14961\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashington"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell("GeorgeWashington"), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell("GeorgeWashington")), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("George Washington University"), list(list(makeString("George"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, makeString("<a href=\"cg?CB-CF&67586\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SEVENTEEN_INTEGER), list(makeString("University"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, makeString("</a>"), EIGHTEEN_INTEGER))), reader_make_constant_shell("GeorgeWashingtonUniversity")), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("chopping"), list(list(makeString("chopping"), reader_make_constant_shell("ChoppingSomething"), NIL, makeString("<a href=\"cg?CB-CF&7109\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("ChoppingSomething")), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("apple tree"), list(list(makeString("apple"), reader_make_constant_shell("AppleTree"), NIL, makeString("<a href=\"cg?CB-CF&607\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("AppleTree"), NIL, NIL, NIL, FIVE_INTEGER), list(makeString("tree"), reader_make_constant_shell("AppleTree"), NIL, NIL, makeString("</a>"), SIX_INTEGER))), reader_make_constant_shell("AppleTree")), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER))), list(list(makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York")), list(new SubLObject[]{ list(list(list(makeString("Osama bin Laden"), list(list(makeString("Osama"), reader_make_constant_shell("OsamaBinLaden"), NIL, makeString("<a href=\"cg?CB-CF&44138\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("OsamaBinLaden"), NIL, NIL, NIL, FIVE_INTEGER), list(makeString("bin"), reader_make_constant_shell("OsamaBinLaden"), NIL, NIL, NIL, SIX_INTEGER), list(makeString(" "), reader_make_constant_shell("OsamaBinLaden"), NIL, NIL, NIL, NINE_INTEGER), list(makeString("Laden"), reader_make_constant_shell("OsamaBinLaden"), NIL, NIL, makeString("</a>"), TEN_INTEGER))), reader_make_constant_shell("OsamaBinLaden")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("belonging"), list(list(makeString("belonging"), reader_make_constant_shell("possesses"), NIL, makeString("<a href=\"cg?CB-CF&17858\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("possesses")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("sighting"), list(list(makeString("sighting"), reader_make_constant_shell("Sighting"), NIL, makeString("<a href=\"cg?CB-CF&123172\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("Sighting")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("Afghanistan"), list(list(makeString("Afghanistan"), reader_make_constant_shell("Afghanistan"), NIL, makeString("<a href=\"cg?CB-CF&2761\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("Afghanistan")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("Mohamed Atta"), list(list(makeString("Mohamed"), reader_make_constant_shell("MohamedAtta"), NIL, makeString("<a href=\"cg?CB-CF&94907\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("MohamedAtta"), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString("Atta"), reader_make_constant_shell("MohamedAtta"), NIL, NIL, makeString("</a>"), EIGHT_INTEGER))), reader_make_constant_shell("MohamedAtta")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("visit"), list(list(makeString("visit"), reader_make_constant_shell("VisitingSomeone"), NIL, makeString("<a href=\"cg?CB-CF&5536\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("VisitingSomeone")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("sight"), list(list(makeString("sight"), reader_make_constant_shell("sees"), NIL, makeString("<a href=\"cg?CB-CF&5242\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("sees")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("meeting event"), list(list(makeString("meeting"), reader_make_constant_shell("MeetingSomeone"), NIL, makeString("<a href=\"cg?CB-CF&21509\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("MeetingSomeone"), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString("event"), reader_make_constant_shell("MeetingSomeone"), NIL, NIL, makeString("</a>"), EIGHT_INTEGER))), reader_make_constant_shell("MeetingSomeone")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("visual perception"), list(list(makeString("visual"), reader_make_constant_shell("VisualPerception"), NIL, makeString("<a href=\"cg?CB-CF&5427\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("VisualPerception"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("perception"), reader_make_constant_shell("VisualPerception"), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell("VisualPerception")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York"), list(list(makeString("New"), reader_make_constant_shell("NewYork-State"), NIL, makeString("<a href=\"cg?CB-CF&503\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("NewYork-State"), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell("NewYork-State"), NIL, NIL, makeString("</a>"), FOUR_INTEGER))), reader_make_constant_shell("NewYork-State")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York City, NY"), list(list(makeString("New"), reader_make_constant_shell("CityOfNewYorkNY"), NIL, makeString("<a href=\"cg?CB-CF&2405\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, FOUR_INTEGER), list(makeString(" "), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, EIGHT_INTEGER), list(makeString("City,"), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, NINE_INTEGER), list(makeString(" "), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, FOURTEEN_INTEGER), list(makeString("NY"), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, makeString("</a>"), FIFTEEN_INTEGER))), reader_make_constant_shell("CityOfNewYorkNY")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York"), list(list(makeString("New"), reader_make_constant_shell("NewYork-Colony"), NIL, makeString("<a href=\"cg?CB-CF&166826\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("NewYork-Colony"), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell("NewYork-Colony"), NIL, NIL, makeString("</a>"), FOUR_INTEGER))), reader_make_constant_shell("NewYork-Colony")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER) })), list(list(makeString("George Washington likes to eat apples")), list(list(list(list(makeString("George Washington"), list(list(makeString("George"), reader_make_constant_shell("GeorgeWashington"), NIL, makeString("<a href=\"cg?CB-CF&14961\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashington"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell("GeorgeWashington"), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell("GeorgeWashington")), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("George Washington University"), list(list(makeString("George"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, makeString("<a href=\"cg?CB-CF&67586\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SEVENTEEN_INTEGER), list(makeString("University"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, makeString("</a>"), EIGHTEEN_INTEGER))), reader_make_constant_shell("GeorgeWashingtonUniversity")), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("liking"), list(list(makeString("liking"), list(reader_make_constant_shell("ExperiencingEmotionFn"), reader_make_constant_shell("Like")), NIL, makeString("<a href=\"cg?CB-CF&-119393\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), list(reader_make_constant_shell("ExperiencingEmotionFn"), reader_make_constant_shell("Like"))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("liking"), list(list(makeString("liking"), reader_make_constant_shell("likes-Generic"), NIL, makeString("<a href=\"cg?CB-CF&83363\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("likes-Generic")), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("eating"), list(list(makeString("eating"), reader_make_constant_shell("EatingEvent"), NIL, makeString("<a href=\"cg?CB-CF&293\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("EatingEvent")), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("apple"), list(list(makeString("apple"), list(reader_make_constant_shell("FruitFn"), reader_make_constant_shell("AppleTree")), NIL, makeString("<a href=\"cg?CB-CF&-3414\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), list(reader_make_constant_shell("FruitFn"), reader_make_constant_shell("AppleTree"))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER))));
    }

    static private final SubLString $str_alt64$ = makeString("");

    public static final SubLFile me = new document_search();



    // deflexical
    // Definitions
    @LispMethod(comment = "The search engines that are registered right now\ndeflexical")
    private static final SubLSymbol $search_engines$ = makeSymbol("*SEARCH-ENGINES*");

    // deflexical
    // Possible search engines, and all the information needed to register them
    /**
     * Possible search engines, and all the information needed to register them
     */
    @LispMethod(comment = "Possible search engines, and all the information needed to register them\ndeflexical")
    private static final SubLSymbol $search_engine_specs$ = makeSymbol("*SEARCH-ENGINE-SPECS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_search_engine$ = makeSymbol("*DEFAULT-SEARCH-ENGINE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeKeyword("CYC-SEMANTIC"), makeString("Cyc Semantic Search"), makeSymbol("CYC-SEMANTIC-INDEX-SERVER-ALIVE?"), makeSymbol("CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("CYC-SEMANTIC-SEARCH-WRAPPER"), makeSymbol("CYC-SEMANTIC-COUNT-WRAPPER"), NIL), list(makeKeyword("YAHOO"), makeString("Yahoo!"), makeSymbol("YAHOO-AVAILABLE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("YAHOO-SEARCH"), makeSymbol("YAHOO-COUNT"), makeSymbol("YAHOO-SEARCH-URL")), list(makeKeyword("GOOGLE"), makeString("Google"), makeSymbol("GET-GOOGLE-KEY"), makeSymbol("GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("GOOGLE-SEARCH-WRAPPER"), makeSymbol("GOOGLE-COUNT"), makeSymbol("GOOGLE-SEARCH-URL")), list(makeKeyword("LUCENE"), makeString("Lucene"), makeSymbol("WS-INDEX-SERVER-ALIVE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("LUCENE-SEARCH-WRAPPER"), makeSymbol("LUCENE-COUNT-WRAPPER"), NIL));

    static private final SubLList $list1 = list(list(makeKeyword("YAHOO"), makeString("Yahoo!"), makeSymbol("YAHOO-AVAILABLE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("YAHOO-SEARCH"), makeSymbol("YAHOO-COUNT"), makeSymbol("YAHOO-SEARCH-URL")), list(makeKeyword("GOOGLE"), makeString("Google"), makeSymbol("GET-GOOGLE-KEY"), makeSymbol("GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("GOOGLE-SEARCH-WRAPPER"), makeSymbol("GOOGLE-COUNT"), makeSymbol("GOOGLE-SEARCH-URL")), list(makeKeyword("LUCENE"), makeString("Lucene"), makeSymbol("WS-INDEX-SERVER-ALIVE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("LUCENE-SEARCH-WRAPPER"), makeSymbol("LUCENE-COUNT-WRAPPER"), NIL), list(makeKeyword("CYC-SEMANTIC"), makeString("Cyc Semantic Search"), makeSymbol("CYC-SEMANTIC-INDEX-SERVER-ALIVE?"), makeSymbol("CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("CYC-SEMANTIC-SEARCH-WRAPPER"), makeSymbol("CYC-SEMANTIC-COUNT-WRAPPER"), NIL));

    private static final SubLSymbol SEARCH_ENGINE_P = makeSymbol("SEARCH-ENGINE-P");

    private static final SubLSymbol REGISTER_SEARCH_ENGINE = makeSymbol("REGISTER-SEARCH-ENGINE");

    static private final SubLList $list4 = list(makeSymbol("SYMBOL"), makeSymbol("DESCRIPTION"), makeSymbol("AVAILABLE?"), makeSymbol("STRING-FUNCTION"), makeSymbol("SEARCH-FUNCTION"), makeSymbol("COUNT-FUNCTION"), makeSymbol("SEARCH-URL-FUNC"));

    private static final SubLSymbol DEREGISTER_SEARCH_ENGINE = makeSymbol("DEREGISTER-SEARCH-ENGINE");

    private static final SubLSymbol GET_AVAILABLE_SEARCH_ENGINES = makeSymbol("GET-AVAILABLE-SEARCH-ENGINES");

    static private final SubLSymbol $sym8$SEARCH_ENGINE_AVAILABLE_ = makeSymbol("SEARCH-ENGINE-AVAILABLE?");

    private static final SubLSymbol GET_DEFAULT_SEARCH_ENGINE = makeSymbol("GET-DEFAULT-SEARCH-ENGINE");

    private static final SubLSymbol SET_DEFAULT_SEARCH_ENGINE = makeSymbol("SET-DEFAULT-SEARCH-ENGINE");

    private static final SubLSymbol GET_SEARCH_ENGINE_DESCRIPTION = makeSymbol("GET-SEARCH-ENGINE-DESCRIPTION");

    static private final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE = makeSymbol("SEARCH-DOCUMENTS-FOR-CYCL-SENTENCE");

    private static final SubLSymbol SEARCH_DOCUMENTS_FOR_NL_SENTENCE = makeSymbol("SEARCH-DOCUMENTS-FOR-NL-SENTENCE");

    private static final SubLSymbol SEARCH_COUNT = makeSymbol("SEARCH-COUNT");

    static private final SubLSymbol $sym17$SEARCH_URL_AVAILABLE_ = makeSymbol("SEARCH-URL-AVAILABLE?");

    private static final SubLSymbol SEARCH_URL = makeSymbol("SEARCH-URL");

    static private final SubLString $str19$Cannot_retrieve_a_search_url_beca = makeString("Cannot retrieve a search url because ~A does not provide that capability.");

    private static final SubLSymbol SEARCH_URL_FOR_CYCL_SENTENCE = makeSymbol("SEARCH-URL-FOR-CYCL-SENTENCE");

    static private final SubLString $str22$Server_error_ = makeString("Server error.");

    static private final SubLString $str24$Error_ = makeString("Error.");

    static private final SubLString $str28$0_0_q__0 = makeString("0#0#q\\^0");

    private static final SubLSymbol DOC_ANNOTATION_IRRELEVANT_TERM = makeSymbol("DOC-ANNOTATION-IRRELEVANT-TERM");

    private static final SubLSymbol CYCL_FORT_P = makeSymbol("CYCL-FORT-P");

    static private final SubLString $str31$cycTermID____0_9____ = makeString("cycTermID=\"([0-9]+)\"");

    static private final SubLString $str32$justification____a_zA_Z_0_9____ = makeString("justification=\"([a-zA-Z 0-9]+)\"");

    static private final SubLString $str33$_span2_type__tooltip__id__ = makeString("<span2 type=\"tooltip\" id=\"");

    static private final SubLString $str34$___strong_ = makeString("\"><strong>");

    static private final SubLString $str35$_span_______ = makeString("<span [^>]+>");

    static private final SubLString $str36$__span_ = makeString("</span>");

    static private final SubLString $str37$__strong___span2_ = makeString("</strong></span2>");

    static private final SubLString $str38$Cyc_Semantic_Search_was_unable_to = makeString("Cyc Semantic Search was unable to perform the search.");

    static private final SubLString $str40$_html__font_color___005522___b_ = makeString("<html><font color=\"#005522\"><b>");

    static private final SubLString $str42$__b___font___html_ = makeString("</b></font></html>");

    static private final SubLString $str44$failed_to_replace_SPAN_tags___S__ = makeString("failed to replace SPAN tags: ~S~%");



    private static final SubLSymbol VALID_CONCEPT_FILTER_NODES = makeSymbol("VALID-CONCEPT-FILTER-NODES");

    static private final SubLList $list47 = list(list(makeSymbol("SET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $default_concept_filter_specification$ = makeSymbol("*DEFAULT-CONCEPT-FILTER-SPECIFICATION*");

    public static final SubLSymbol $cluster_id_isg$ = makeSymbol("*CLUSTER-ID-ISG*");

    public static final SubLSymbol $cluster_map$ = makeSymbol("*CLUSTER-MAP*");

    public static final SubLSymbol $cluster_lock$ = makeSymbol("*CLUSTER-LOCK*");

    static private final SubLString $$$Ontological_Cluster_Map_Lock = makeString("Ontological Cluster Map Lock");

    private static final SubLSymbol CREATE_CLUSTER = makeSymbol("CREATE-CLUSTER");



    private static final SubLSymbol FREE_CLUSTER = makeSymbol("FREE-CLUSTER");

    private static final SubLSymbol ADD_TERM_TO_CLUSTER = makeSymbol("ADD-TERM-TO-CLUSTER");





    private static final SubLSymbol RETRIEVE_CLUSTER = makeSymbol("RETRIEVE-CLUSTER");

    private static final SubLSymbol CLUSTER_TERMS_ONTOLOGICALLY = makeSymbol("CLUSTER-TERMS-ONTOLOGICALLY");

    private static final SubLSymbol GET_TERMS_FROM_URL = makeSymbol("GET-TERMS-FROM-URL");

    static private final SubLString $str64$ = makeString("");

    static private final SubLString $str65$_nbsp_ = makeString("&nbsp;");

    private static final SubLSymbol GET_TERMS_IN_STRING = makeSymbol("GET-TERMS-IN-STRING");



    static private final SubLSymbol $sym72$LIST_ITEM_ = makeSymbol("LIST-ITEM<");

    static private final SubLString $str73$failed_on__S____S__ = makeString("failed on ~S~% ~S~%");

    private static final SubLSymbol SUPER_JAVALISTS_MORE_OR_LESS_EQUAL = makeSymbol("SUPER-JAVALISTS-MORE-OR-LESS-EQUAL");

    private static final SubLObject $list81 = _constant_81_initializer();

    public static final SubLObject search_engine_p_alt(SubLObject v_object) {
        return list_utilities.alist_has_keyP($search_engine_specs$.getGlobalValue(), v_object, UNPROVIDED);
    }

    public static SubLObject search_engine_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP($search_engine_specs$.getGlobalValue(), v_object, UNPROVIDED);
    }

    public static final SubLObject register_search_engine_alt(SubLObject symbol) {
        if (NIL != list_utilities.alist_has_keyP($search_engine_specs$.getGlobalValue(), symbol, UNPROVIDED)) {
            {
                SubLObject datum = assoc(symbol, $search_engine_specs$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                SubLObject current = datum;
                SubLObject symbol_1 = NIL;
                SubLObject description = NIL;
                SubLObject availableP = NIL;
                SubLObject string_function = NIL;
                SubLObject search_function = NIL;
                SubLObject count_function = NIL;
                SubLObject search_url_func = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt4);
                symbol_1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt4);
                description = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt4);
                availableP = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt4);
                string_function = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt4);
                search_function = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt4);
                count_function = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt4);
                search_url_func = current.first();
                current = current.rest();
                if (NIL == current) {
                    return com.cyc.cycjava.cycl.document_search.register_search_engine_int(symbol_1, description, availableP, string_function, search_function, count_function, search_url_func);
                } else {
                    cdestructuring_bind_error(datum, $list_alt4);
                }
            }
        } else {
            return $ENGINE_UNKNOWN;
        }
        return NIL;
    }

    public static SubLObject register_search_engine(final SubLObject symbol) {
        if (NIL == list_utilities.alist_has_keyP($search_engine_specs$.getGlobalValue(), symbol, UNPROVIDED)) {
            return $ENGINE_UNKNOWN;
        }
        SubLObject current;
        final SubLObject datum = current = assoc(symbol, $search_engine_specs$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        SubLObject symbol_$1 = NIL;
        SubLObject description = NIL;
        SubLObject availableP = NIL;
        SubLObject string_function = NIL;
        SubLObject search_function = NIL;
        SubLObject count_function = NIL;
        SubLObject search_url_func = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        symbol_$1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        description = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        availableP = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        string_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        search_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        count_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        search_url_func = current.first();
        current = current.rest();
        if (NIL == current) {
            return register_search_engine_int(symbol_$1, description, availableP, string_function, search_function, count_function, search_url_func);
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    public static final SubLObject register_search_engine_int_alt(SubLObject symbol, SubLObject description, SubLObject availableP, SubLObject string_function, SubLObject search_function, SubLObject count_function, SubLObject search_url_func) {
        $search_engines$.setGlobalValue(list_utilities.alist_delete($search_engines$.getGlobalValue(), symbol, UNPROVIDED));
        $search_engines$.setGlobalValue(list_utilities.alist_enter($search_engines$.getGlobalValue(), symbol, list(description, availableP, string_function, search_function, count_function, search_url_func), UNPROVIDED));
        return symbol;
    }

    public static SubLObject register_search_engine_int(final SubLObject symbol, final SubLObject description, final SubLObject availableP, final SubLObject string_function, final SubLObject search_function, final SubLObject count_function, final SubLObject search_url_func) {
        $search_engines$.setGlobalValue(list_utilities.alist_delete($search_engines$.getGlobalValue(), symbol, UNPROVIDED));
        $search_engines$.setGlobalValue(list_utilities.alist_enter($search_engines$.getGlobalValue(), symbol, list(description, availableP, string_function, search_function, count_function, search_url_func), UNPROVIDED));
        return symbol;
    }

    public static final SubLObject deregister_search_engine_alt(SubLObject symbol) {
        $search_engines$.setGlobalValue(list_utilities.alist_delete($search_engines$.getGlobalValue(), symbol, UNPROVIDED));
        return symbol;
    }

    public static SubLObject deregister_search_engine(final SubLObject symbol) {
        $search_engines$.setGlobalValue(list_utilities.alist_delete($search_engines$.getGlobalValue(), symbol, UNPROVIDED));
        return symbol;
    }

    public static final SubLObject get_available_search_engines_alt() {
        {
            SubLObject engines = NIL;
            SubLObject cdolist_list_var = $search_engines$.getGlobalValue();
            SubLObject engine = NIL;
            for (engine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , engine = cdolist_list_var.first()) {
                if (NIL != apply(third(engine), NIL)) {
                    engines = cons(engine.first(), engines);
                }
            }
            return reverse(engines);
        }
    }

    public static SubLObject get_available_search_engines() {
        SubLObject engines = NIL;
        SubLObject cdolist_list_var = $search_engines$.getGlobalValue();
        SubLObject engine = NIL;
        engine = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != apply(third(engine), NIL)) {
                engines = cons(engine.first(), engines);
            }
            cdolist_list_var = cdolist_list_var.rest();
            engine = cdolist_list_var.first();
        } 
        return reverse(engines);
    }

    public static final SubLObject search_engine_availableP_alt(SubLObject engine) {
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
            if (NIL == desc) {
                return NIL;
            }
            return apply(second(desc), NIL);
        }
    }

    public static SubLObject search_engine_availableP(final SubLObject engine) {
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == desc) {
            return NIL;
        }
        return apply(second(desc), NIL);
    }

    public static final SubLObject get_default_search_engine_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $default_search_engine$.getDynamicValue(thread)) {
                return $default_search_engine$.getDynamicValue(thread);
            }
            com.cyc.cycjava.cycl.document_search.set_default_search_engine(com.cyc.cycjava.cycl.document_search.get_available_search_engines().first());
            return $default_search_engine$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_default_search_engine() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $default_search_engine$.getDynamicValue(thread)) {
            return $default_search_engine$.getDynamicValue(thread);
        }
        set_default_search_engine(get_available_search_engines().first());
        return $default_search_engine$.getDynamicValue(thread);
    }

    public static final SubLObject set_default_search_engine_alt(SubLObject engine) {
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        $default_search_engine$.setDynamicValue(engine);
        return NIL;
    }

    public static SubLObject set_default_search_engine(final SubLObject engine) {
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        $default_search_engine$.setDynamicValue(engine);
        return NIL;
    }

    public static final SubLObject get_search_engine_description_alt(SubLObject engine) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
            {
                SubLObject description = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
                    SubLObject found = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != found) {
                        description = desc.first();
                    }
                }
                return description;
            }
        }
    }

    public static SubLObject get_search_engine_description(final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        SubLObject description = NIL;
        thread.resetMultipleValues();
        final SubLObject desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        final SubLObject found = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != found) {
            description = desc.first();
        }
        return description;
    }

    public static final SubLObject generic_query_string_for_cycl_sentence_alt(SubLObject cycl_sentence) {
        {
            SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence(cycl_sentence, UNPROVIDED, UNPROVIDED);
            SubLObject string_without_eol = string_utilities.replace_substring(search_string, string_utilities.$new_line_string$.getGlobalValue(), $str_alt12$_);
            return string_without_eol;
        }
    }

    public static SubLObject generic_query_string_for_cycl_sentence(final SubLObject cycl_sentence) {
        final SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence(cycl_sentence, UNPROVIDED, UNPROVIDED);
        final SubLObject string_without_eol = string_utilities.replace_substring(search_string, string_utilities.$new_line_string$.getGlobalValue(), $$$_);
        return string_without_eol;
    }

    public static final SubLObject query_string_for_cycl_sentence_alt(SubLObject cycl_sentence, SubLObject engine) {
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
            if (NIL == engine_desc) {
                return NIL;
            }
            return apply(third(engine_desc), list(cycl_sentence));
        }
    }

    public static SubLObject query_string_for_cycl_sentence(final SubLObject cycl_sentence, final SubLObject engine) {
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        return apply(third(engine_desc), list(cycl_sentence));
    }

    /**
     * Returns a list of lists, each containing the rank, url, and snippet.
     *
     * @param SEARCH-SENTENCE
     * 		listp; e.g. (quote (#$isa ?X #$YasserArafat))
     * @param ENGINE
     * 		search-engine-p; The search engine to use.
     * @param START
    integerp;
     * 		
     * @param HITS
    integerp;
     * 		
     * @return RESULTS listp; e.g. ((4 (#$URLFn "http://www.israeluniverse.com/")
    "Yasir Arafat"
    "... Yasser Arafat was born on ...")) ...)
     */
    @LispMethod(comment = "Returns a list of lists, each containing the rank, url, and snippet.\r\n\r\n@param SEARCH-SENTENCE\r\n\t\tlistp; e.g. (quote (#$isa ?X #$YasserArafat))\r\n@param ENGINE\r\n\t\tsearch-engine-p; The search engine to use.\r\n@param START\nintegerp;\r\n\t\t\r\n@param HITS\nintegerp;\r\n\t\t\r\n@return RESULTS listp; e.g. ((4 (#$URLFn \"http://www.israeluniverse.com/\")\r\n\"Yasir Arafat\"\r\n\"... Yasser Arafat was born on ...\")) ...)")
    public static final SubLObject search_documents_for_cycl_sentence_alt(SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = com.cyc.cycjava.cycl.document_search.get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject search_string = com.cyc.cycjava.cycl.document_search.query_string_for_cycl_sentence(search_sentence, engine);
            return com.cyc.cycjava.cycl.document_search.search_documents(search_string, engine, start, hits);
        }
    }

    /**
     * Returns a list of lists, each containing the rank, url, and snippet.
     *
     * @param SEARCH-SENTENCE
     * 		listp; e.g. (quote (#$isa ?X #$YasserArafat))
     * @param ENGINE
     * 		search-engine-p; The search engine to use.
     * @param START
    		integerp;
     * 		
     * @param HITS
    		integerp;
     * 		
     * @return RESULTS listp; e.g. ((4 (#$URLFn "http://www.israeluniverse.com/")
    "Yasir Arafat"
    "... Yasser Arafat was born on ...")) ...)
     */
    @LispMethod(comment = "Returns a list of lists, each containing the rank, url, and snippet.\r\n\r\n@param SEARCH-SENTENCE\r\n\t\tlistp; e.g. (quote (#$isa ?X #$YasserArafat))\r\n@param ENGINE\r\n\t\tsearch-engine-p; The search engine to use.\r\n@param START\n\t\tintegerp;\r\n\t\t\r\n@param HITS\n\t\tintegerp;\r\n\t\t\r\n@return RESULTS listp; e.g. ((4 (#$URLFn \"http://www.israeluniverse.com/\")\r\n\"Yasir Arafat\"\r\n\"... Yasser Arafat was born on ...\")) ...)")
    public static SubLObject search_documents_for_cycl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject search_string = query_string_for_cycl_sentence(search_sentence, engine);
        return search_documents(search_string, engine, start, hits);
    }

    /**
     * Returns a list of lists, each containing the rank, url, title and snippet.
     *
     * @param SEARCH-SENTENCE
     * 		listp; e.g. (quote (#$isa ?X #$YasserArafat))
     * @param ENGINE
     * 		search-engine-p; The search engine to use.
     * @param START
    integerp;
     * 		
     * @param HITS
    integerp;
     * 		
     * @return RESULTS listp; e.g. ((4 (#$URLFn "http://www.israeluniverse.com/")
    "Yasir Arafat"
    "... Yasser Arafat was born on ...")) ...)
     */
    @LispMethod(comment = "Returns a list of lists, each containing the rank, url, title and snippet.\r\n\r\n@param SEARCH-SENTENCE\r\n\t\tlistp; e.g. (quote (#$isa ?X #$YasserArafat))\r\n@param ENGINE\r\n\t\tsearch-engine-p; The search engine to use.\r\n@param START\nintegerp;\r\n\t\t\r\n@param HITS\nintegerp;\r\n\t\t\r\n@return RESULTS listp; e.g. ((4 (#$URLFn \"http://www.israeluniverse.com/\")\r\n\"Yasir Arafat\"\r\n\"... Yasser Arafat was born on ...\")) ...)")
    public static final SubLObject search_documents_for_nl_sentence_alt(SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = com.cyc.cycjava.cycl.document_search.get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject search_string = (engine == $CYC_SEMANTIC) ? ((SubLObject) (com.cyc.cycjava.cycl.document_search.cyc_semantic_search_string(search_sentence))) : search_sentence;
            return com.cyc.cycjava.cycl.document_search.search_documents(search_string, engine, start, hits);
        }
    }

    /**
     * Returns a list of lists, each containing the rank, url, title and snippet.
     *
     * @param SEARCH-SENTENCE
     * 		listp; e.g. (quote (#$isa ?X #$YasserArafat))
     * @param ENGINE
     * 		search-engine-p; The search engine to use.
     * @param START
    		integerp;
     * 		
     * @param HITS
    		integerp;
     * 		
     * @return RESULTS listp; e.g. ((4 (#$URLFn "http://www.israeluniverse.com/")
    "Yasir Arafat"
    "... Yasser Arafat was born on ...")) ...)
     */
    @LispMethod(comment = "Returns a list of lists, each containing the rank, url, title and snippet.\r\n\r\n@param SEARCH-SENTENCE\r\n\t\tlistp; e.g. (quote (#$isa ?X #$YasserArafat))\r\n@param ENGINE\r\n\t\tsearch-engine-p; The search engine to use.\r\n@param START\n\t\tintegerp;\r\n\t\t\r\n@param HITS\n\t\tintegerp;\r\n\t\t\r\n@return RESULTS listp; e.g. ((4 (#$URLFn \"http://www.israeluniverse.com/\")\r\n\"Yasir Arafat\"\r\n\"... Yasser Arafat was born on ...\")) ...)")
    public static SubLObject search_documents_for_nl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject search_string = (engine == $CYC_SEMANTIC) ? cyc_semantic_search_string(search_sentence) : search_sentence;
        return search_documents(search_string, engine, start, hits);
    }

    /**
     * Returns a list of lists, each containing the rank, url, title, and snippet.
     *
     * @param SEARCH-STRING
     * 		stringp; e.g. "Yasser Arafat was born on "
     * @param ENGINE
     * 		search-engine-p; The search engine to use.
     * @param START
    integerp;
     * 		
     * @param HITS
    integerp;
     * 		
     * @return RESULTS listp; e.g. ((4 (#$URLFn "http://www.israeluniverse.com/")
    "Yasir Arafat"
    "... Yasser Arafat was born on ...")) ...)
     */
    @LispMethod(comment = "Returns a list of lists, each containing the rank, url, title, and snippet.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp; e.g. \"Yasser Arafat was born on \"\r\n@param ENGINE\r\n\t\tsearch-engine-p; The search engine to use.\r\n@param START\nintegerp;\r\n\t\t\r\n@param HITS\nintegerp;\r\n\t\t\r\n@return RESULTS listp; e.g. ((4 (#$URLFn \"http://www.israeluniverse.com/\")\r\n\"Yasir Arafat\"\r\n\"... Yasser Arafat was born on ...\")) ...)")
    public static final SubLObject search_documents_alt(SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = com.cyc.cycjava.cycl.document_search.get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
            if (NIL == engine_desc) {
                return NIL;
            }
            return apply(fourth(engine_desc), list(search_string, start, hits));
        }
    }

    /**
     * Returns a list of lists, each containing the rank, url, title, and snippet.
     *
     * @param SEARCH-STRING
     * 		stringp; e.g. "Yasser Arafat was born on "
     * @param ENGINE
     * 		search-engine-p; The search engine to use.
     * @param START
    		integerp;
     * 		
     * @param HITS
    		integerp;
     * 		
     * @return RESULTS listp; e.g. ((4 (#$URLFn "http://www.israeluniverse.com/")
    "Yasir Arafat"
    "... Yasser Arafat was born on ...")) ...)
     */
    @LispMethod(comment = "Returns a list of lists, each containing the rank, url, title, and snippet.\r\n\r\n@param SEARCH-STRING\r\n\t\tstringp; e.g. \"Yasser Arafat was born on \"\r\n@param ENGINE\r\n\t\tsearch-engine-p; The search engine to use.\r\n@param START\n\t\tintegerp;\r\n\t\t\r\n@param HITS\n\t\tintegerp;\r\n\t\t\r\n@return RESULTS listp; e.g. ((4 (#$URLFn \"http://www.israeluniverse.com/\")\r\n\"Yasir Arafat\"\r\n\"... Yasser Arafat was born on ...\")) ...)")
    public static SubLObject search_documents(final SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        return apply(fourth(engine_desc), list(search_string, start, hits));
    }

    public static final SubLObject search_count_alt(SubLObject search_string, SubLObject engine) {
        if (engine == UNPROVIDED) {
            engine = com.cyc.cycjava.cycl.document_search.get_default_search_engine();
        }
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
            if (NIL == engine_desc) {
                return NIL;
            }
            return apply(fifth(engine_desc), list(search_string));
        }
    }

    public static SubLObject search_count(final SubLObject search_string, SubLObject engine) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        return apply(fifth(engine_desc), list(search_string));
    }

    public static final SubLObject search_url_availableP_alt(SubLObject engine) {
        if (engine == UNPROVIDED) {
            engine = com.cyc.cycjava.cycl.document_search.get_default_search_engine();
        }
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
            if (NIL == engine_desc) {
                return NIL;
            }
            return NIL != sixth(engine_desc) ? ((SubLObject) (T)) : NIL;
        }
    }

    public static SubLObject search_url_availableP(SubLObject engine) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        return NIL != sixth(engine_desc) ? T : NIL;
    }

    public static final SubLObject search_url_alt(SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = com.cyc.cycjava.cycl.document_search.get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
            if (NIL == engine_desc) {
                return NIL;
            }
            if (NIL == sixth(engine_desc)) {
                Errors.error($str_alt19$Cannot_retrieve_a_search_url_beca, engine_desc.first());
            }
            return apply(sixth(engine_desc), list(search_string, start, hits));
        }
    }

    public static SubLObject search_url(final SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject engine_desc = list_utilities.alist_lookup($search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED);
        if (NIL == engine_desc) {
            return NIL;
        }
        if (NIL == sixth(engine_desc)) {
            Errors.error($str19$Cannot_retrieve_a_search_url_beca, engine_desc.first());
        }
        return apply(sixth(engine_desc), list(search_string, start, hits));
    }

    public static final SubLObject search_url_for_cycl_sentence_alt(SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = com.cyc.cycjava.cycl.document_search.get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        SubLTrampolineFile.checkType(engine, SEARCH_ENGINE_P);
        {
            SubLObject search_string = com.cyc.cycjava.cycl.document_search.query_string_for_cycl_sentence(search_sentence, engine);
            return com.cyc.cycjava.cycl.document_search.search_url(search_string, engine, start, hits);
        }
    }

    public static SubLObject search_url_for_cycl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits) {
        if (engine == UNPROVIDED) {
            engine = get_default_search_engine();
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        assert NIL != search_engine_p(engine) : "! document_search.search_engine_p(engine) " + ("document_search.search_engine_p(engine) " + "CommonSymbols.NIL != document_search.search_engine_p(engine) ") + engine;
        final SubLObject search_string = query_string_for_cycl_sentence(search_sentence, engine);
        return search_url(search_string, engine, start, hits);
    }

    public static final SubLObject google_search_wrapper_alt(SubLObject search_string, SubLObject start, SubLObject hits) {
        {
            SubLObject google_results = search_engine.google_search(search_string, start, hits);
            SubLObject results = NIL;
            if ($SERVER_ERROR == google_results) {
                return $str_alt22$Server_error_;
            } else {
                if ($ERROR == google_results) {
                    return $str_alt24$Error_;
                } else {
                    {
                        SubLObject list_var = NIL;
                        SubLObject result = NIL;
                        SubLObject result_number = NIL;
                        for (list_var = google_results, result = list_var.first(), result_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , result = list_var.first() , result_number = add(ONE_INTEGER, result_number)) {
                            if (result_number.numL(hits)) {
                                {
                                    SubLObject url = search_engine.google_passage_get_url_method(result);
                                    SubLObject rank = search_engine.google_passage_get_rank_method(result);
                                    SubLObject title = search_engine.google_passage_get_title_method(result);
                                    SubLObject snippet = search_engine.google_passage_get_snippet_method(result);
                                    SubLObject v_answer = list(rank, url, title, snippet);
                                    SubLObject item_var = v_answer;
                                    if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        results = cons(item_var, results);
                                    }
                                }
                            }
                        }
                    }
                    return reverse(results);
                }
            }
        }
    }

    public static SubLObject google_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLObject google_results = search_engine.google_search(search_string, start, hits);
        SubLObject results = NIL;
        if ($SERVER_ERROR == google_results) {
            return $str22$Server_error_;
        }
        if ($ERROR == google_results) {
            return $str24$Error_;
        }
        SubLObject list_var = NIL;
        SubLObject result = NIL;
        SubLObject result_number = NIL;
        list_var = google_results;
        result = list_var.first();
        for (result_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , result = list_var.first() , result_number = add(ONE_INTEGER, result_number)) {
            if (result_number.numL(hits)) {
                final SubLObject url = search_engine.google_passage_get_url_method(result);
                final SubLObject rank = search_engine.google_passage_get_rank_method(result);
                final SubLObject title = search_engine.google_passage_get_title_method(result);
                final SubLObject snippet = search_engine.google_passage_get_snippet_method(result);
                final SubLObject item_var;
                final SubLObject v_answer = item_var = list(rank, url, title, snippet);
                if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                    results = cons(item_var, results);
                }
            }
        }
        return reverse(results);
    }

    public static final SubLObject google_query_string_for_cycl_sentence_alt(SubLObject cycl_sentence) {
        {
            SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence(cycl_sentence, $GOOGLE, UNPROVIDED);
            SubLObject string_without_eol = string_utilities.replace_substring(search_string, string_utilities.$new_line_string$.getGlobalValue(), $str_alt12$_);
            return string_without_eol;
        }
    }

    public static SubLObject google_query_string_for_cycl_sentence(final SubLObject cycl_sentence) {
        final SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence(cycl_sentence, $GOOGLE, UNPROVIDED);
        final SubLObject string_without_eol = string_utilities.replace_substring(search_string, string_utilities.$new_line_string$.getGlobalValue(), $$$_);
        return string_without_eol;
    }

    public static final SubLObject lucene_search_wrapper_alt(SubLObject search_string, SubLObject start, SubLObject hits) {
        {
            SubLObject pages = lucene_index.ws_index_search_with_titles_and_snippets(search_string, start, hits, UNPROVIDED, UNPROVIDED);
            SubLObject results = NIL;
            SubLObject cdolist_list_var = pages;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject rank = result.first();
                    SubLObject url = http_kernel.get_absolute_url(second(result), UNPROVIDED);
                    SubLObject title = third(result);
                    SubLObject snippet = fourth(result);
                    results = cons(list(rank, url, title, snippet), results);
                }
            }
            return reverse(results);
        }
    }

    public static SubLObject lucene_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLObject pages = lucene_index.ws_index_search_with_titles_and_snippets(search_string, start, hits, UNPROVIDED, UNPROVIDED);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = pages;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rank = result.first();
            final SubLObject url = http_kernel.get_absolute_url(second(result), UNPROVIDED);
            final SubLObject title = third(result);
            final SubLObject snippet = fourth(result);
            results = cons(list(rank, url, title, snippet), results);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return reverse(results);
    }

    public static final SubLObject lucene_count_wrapper_alt(SubLObject search_string) {
        return lucene_index.ws_index_count(search_string, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lucene_count_wrapper(final SubLObject search_string) {
        return lucene_index.ws_index_count(search_string, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_semantic_search_string_alt(SubLObject text_string) {
        {
            SubLObject ids = NIL;
            SubLObject cdolist_list_var = document_annotation_widgets.terms_for_cyc_semantic_query(text_string);
            SubLObject record = NIL;
            for (record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , record = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_2 = record.rest();
                    SubLObject interps = NIL;
                    for (interps = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , interps = cdolist_list_var_2.first()) {
                        ids = cons(getf(interps, $INTERP_ID, UNPROVIDED), ids);
                    }
                }
            }
            return string_utilities.bunge(nreverse(ids), UNPROVIDED);
        }
    }

    public static SubLObject cyc_semantic_search_string(final SubLObject text_string) {
        SubLObject ids = NIL;
        SubLObject cdolist_list_var = document_annotation_widgets.terms_for_cyc_semantic_query(text_string);
        SubLObject record = NIL;
        record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = record.rest();
            SubLObject interps = NIL;
            interps = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                ids = cons(getf(interps, $INTERP_ID, UNPROVIDED), ids);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                interps = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
        } 
        return string_utilities.bunge(nreverse(ids), UNPROVIDED);
    }

    public static final SubLObject cyc_semantic_index_server_aliveP_alt() {
        if (NIL == document_annotation_widgets.semantic_index_initializedP()) {
            return NIL;
        }
        {
            SubLObject error_msg = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            document_annotation_widgets.lucene_sem_query_with_sem_search_string($str_alt28$0_0_q__0, ONE_INTEGER);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL == error_msg) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject cyc_semantic_index_server_aliveP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == document_annotation_widgets.semantic_index_initializedP()) {
            return NIL;
        }
        SubLObject error_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    document_annotation_widgets.lucene_sem_query_with_sem_search_string($str28$0_0_q__0, ONE_INTEGER);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == error_msg) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject cyc_semantic_query_string_for_cycl_sentence_alt(SubLObject cycl_sent) {
        {
            SubLObject cycl_terms = remove_if(DOC_ANNOTATION_IRRELEVANT_TERM, cycl_utilities.expression_gather(cycl_sent, CYCL_FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject query_terms = NIL;
            SubLObject cdolist_list_var = cycl_terms;
            SubLObject cycl_term = NIL;
            for (cycl_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_term = cdolist_list_var.first()) {
                {
                    SubLObject item_var = document_annotation_widgets.cyc_semantic_search_token(NIL, cycl_term);
                    if (NIL == member(item_var, query_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        query_terms = cons(item_var, query_terms);
                    }
                }
            }
            return string_utilities.bunge(query_terms, UNPROVIDED);
        }
    }

    public static SubLObject cyc_semantic_query_string_for_cycl_sentence(final SubLObject cycl_sent) {
        final SubLObject cycl_terms = remove_if(DOC_ANNOTATION_IRRELEVANT_TERM, cycl_utilities.expression_gather(cycl_sent, CYCL_FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject query_terms = NIL;
        SubLObject cdolist_list_var = cycl_terms;
        SubLObject cycl_term = NIL;
        cycl_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = document_annotation_widgets.cyc_semantic_search_token(NIL, cycl_term);
            if (NIL == member(item_var, query_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                query_terms = cons(item_var, query_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_term = cdolist_list_var.first();
        } 
        return string_utilities.bunge(query_terms, UNPROVIDED);
    }

    /**
     * Replace the original SPAN tag in the snippet
     * (e.g. <span class="cyc" cycTermID="44" justification="t 44 ">) with
     * another SPAN tag (<span2 type="tooltip" id="44 t 44 ">) and a font-style tag
     * (e.g. <strong>)
     *
     * @param SNIPPET
    stringp
     * 		
     * @return stringp; a modified snippet
     */
    @LispMethod(comment = "Replace the original SPAN tag in the snippet\r\n(e.g. <span class=\"cyc\" cycTermID=\"44\" justification=\"t 44 \">) with\r\nanother SPAN tag (<span2 type=\"tooltip\" id=\"44 t 44 \">) and a font-style tag\r\n(e.g. <strong>)\r\n\r\n@param SNIPPET\nstringp\r\n\t\t\r\n@return stringp; a modified snippet\nReplace the original SPAN tag in the snippet\n(e.g. <span class=\"cyc\" cycTermID=\"44\" justification=\"t 44 \">) with\nanother SPAN tag (<span2 type=\"tooltip\" id=\"44 t 44 \">) and a font-style tag\n(e.g. <strong>)")
    public static final SubLObject replace_span_tags_alt(SubLObject snippet) {
        {
            SubLObject cdolist_list_var = regular_expression_utilities.find_all_matches_for_regular_expression($str_alt35$_span_______, snippet, UNPROVIDED, UNPROVIDED);
            SubLObject span_tag = NIL;
            for (span_tag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , span_tag = cdolist_list_var.first()) {
                {
                    SubLObject term_id = second(regular_expression_utilities.regexp_capturing_match($str_alt31$cycTermID____0_9____, span_tag, UNPROVIDED, UNPROVIDED));
                    SubLObject justification_terms = string_utilities.split_string(second(regular_expression_utilities.regexp_capturing_match($str_alt32$justification____a_zA_Z_0_9____, span_tag, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
                    SubLObject relation_id = justification_terms.first();
                    SubLObject related_term_id = second(justification_terms);
                    if (((NIL != term_id) && (NIL != relation_id)) && (NIL != related_term_id)) {
                        snippet = string_utilities.replace_substring(snippet, span_tag, cconcatenate($str_alt33$_span2_type__tooltip__id__, new SubLObject[]{ format_nil.format_nil_a_no_copy(term_id), $str_alt12$_, format_nil.format_nil_a_no_copy(relation_id), $str_alt12$_, format_nil.format_nil_a_no_copy(related_term_id), $str_alt34$___strong_ }));
                    }
                }
            }
        }
        snippet = string_utilities.replace_substring(snippet, $str_alt36$__span_, $str_alt37$__strong___span2_);
        return snippet;
    }

    /**
     * Replace the original SPAN tag in the snippet
     * (e.g. <span class="cyc" cycTermID="44" justification="t 44 ">) with
     * another SPAN tag (<span2 type="tooltip" id="44 t 44 ">) and a font-style tag
     * (e.g. <strong>)
     *
     * @param SNIPPET
    		stringp
     * 		
     * @return stringp; a modified snippet
     */
    @LispMethod(comment = "Replace the original SPAN tag in the snippet\r\n(e.g. <span class=\"cyc\" cycTermID=\"44\" justification=\"t 44 \">) with\r\nanother SPAN tag (<span2 type=\"tooltip\" id=\"44 t 44 \">) and a font-style tag\r\n(e.g. <strong>)\r\n\r\n@param SNIPPET\n\t\tstringp\r\n\t\t\r\n@return stringp; a modified snippet\nReplace the original SPAN tag in the snippet\n(e.g. <span class=\"cyc\" cycTermID=\"44\" justification=\"t 44 \">) with\nanother SPAN tag (<span2 type=\"tooltip\" id=\"44 t 44 \">) and a font-style tag\n(e.g. <strong>)")
    public static SubLObject replace_span_tags(SubLObject snippet) {
        SubLObject cdolist_list_var = regular_expression_utilities.find_all_matches_for_regular_expression($str35$_span_______, snippet, UNPROVIDED, UNPROVIDED);
        SubLObject span_tag = NIL;
        span_tag = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_id = second(regular_expression_utilities.regexp_capturing_match($str31$cycTermID____0_9____, span_tag, UNPROVIDED, UNPROVIDED));
            final SubLObject justification_terms = string_utilities.split_string(second(regular_expression_utilities.regexp_capturing_match($str32$justification____a_zA_Z_0_9____, span_tag, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            final SubLObject relation_id = justification_terms.first();
            final SubLObject related_term_id = second(justification_terms);
            if (((NIL != term_id) && (NIL != relation_id)) && (NIL != related_term_id)) {
                snippet = string_utilities.replace_substring(snippet, span_tag, cconcatenate($str33$_span2_type__tooltip__id__, new SubLObject[]{ format_nil.format_nil_a_no_copy(term_id), $$$_, format_nil.format_nil_a_no_copy(relation_id), $$$_, format_nil.format_nil_a_no_copy(related_term_id), $str34$___strong_ }));
            }
            cdolist_list_var = cdolist_list_var.rest();
            span_tag = cdolist_list_var.first();
        } 
        snippet = string_utilities.replace_substring(snippet, $str36$__span_, $str37$__strong___span2_);
        return snippet;
    }

    public static final SubLObject cyc_semantic_search_wrapper_alt(SubLObject search_string, SubLObject start, SubLObject hits) {
        {
            SubLObject rank = ONE_INTEGER;
            SubLObject results = NIL;
            SubLObject error_msg = NIL;
            SubLObject search_results = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            search_results = document_annotation_widgets.lucene_sem_query_with_sem_search_string(search_string, hits);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_msg) {
                return $str_alt38$Cyc_Semantic_Search_was_unable_to;
            }
            {
                SubLObject cdolist_list_var = search_results;
                SubLObject search_result = NIL;
                for (search_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_result = cdolist_list_var.first()) {
                    {
                        SubLObject url = list_utilities.plist_lookup(search_result, $URL, UNPROVIDED);
                        SubLObject title = cconcatenate($str_alt40$_html__font_color___005522___b_, new SubLObject[]{ list_utilities.plist_lookup(search_result, $TITLE, UNPROVIDED), $str_alt42$__b___font___html_ });
                        SubLObject snippet = list_utilities.plist_lookup(search_result, $SNIPPET, UNPROVIDED);
                        error_msg = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                try {
                                    bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                    try {
                                        snippet = com.cyc.cycjava.cycl.document_search.replace_span_tags(snippet);
                                        results = cons(list(rank, url, title, snippet), results);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    rebind(Errors.$error_handler$, _prev_bind_0);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                        if (NIL != error_msg) {
                            Errors.warn($str_alt44$failed_to_replace_SPAN_tags___S__, error_msg);
                        }
                        rank = add(rank, ONE_INTEGER);
                    }
                }
            }
            return nreverse(results);
        }
    }

    public static SubLObject cyc_semantic_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rank = ONE_INTEGER;
        SubLObject results = NIL;
        SubLObject error_msg = NIL;
        SubLObject search_results = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    search_results = document_annotation_widgets.lucene_sem_query_with_sem_search_string(search_string, hits);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_msg) {
            return $str38$Cyc_Semantic_Search_was_unable_to;
        }
        SubLObject cdolist_list_var = search_results;
        SubLObject search_result = NIL;
        search_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject url = list_utilities.plist_lookup(search_result, $URL, UNPROVIDED);
            final SubLObject title = cconcatenate($str40$_html__font_color___005522___b_, new SubLObject[]{ list_utilities.plist_lookup(search_result, $TITLE, UNPROVIDED), $str42$__b___font___html_ });
            SubLObject snippet = list_utilities.plist_lookup(search_result, $SNIPPET, UNPROVIDED);
            error_msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        snippet = replace_span_tags(snippet);
                        results = cons(list(rank, url, title, snippet), results);
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                error_msg = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error_msg) {
                Errors.warn($str44$failed_to_replace_SPAN_tags___S__, error_msg);
            }
            rank = add(rank, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            search_result = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static final SubLObject cyc_semantic_count_wrapper_alt(SubLObject search_string) {
        return TEN_INTEGER;
    }

    public static SubLObject cyc_semantic_count_wrapper(final SubLObject search_string) {
        return TEN_INTEGER;
    }

    /**
     * Returns the most-specific proper genls of collection COL
     * other than itself that are also elements of SET.
     *
     * @unknown bklimt
     */
    @LispMethod(comment = "Returns the most-specific proper genls of collection COL\r\nother than itself that are also elements of SET.\r\n\r\n@unknown bklimt\nReturns the most-specific proper genls of collection COL\nother than itself that are also elements of SET.")
    public static final SubLObject min_cluster_parents_for_collection_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject all_genls = genls.all_genls(col, mt, tv);
            SubLObject genls_of_type = list_utilities.remove_if_not(symbol_function(VALID_CONCEPT_FILTER_NODES), all_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return genls.min_cols(remove(col, genls_of_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, tv);
        }
    }

    /**
     * Returns the most-specific proper genls of collection COL
     * other than itself that are also elements of SET.
     *
     * @unknown bklimt
     */
    @LispMethod(comment = "Returns the most-specific proper genls of collection COL\r\nother than itself that are also elements of SET.\r\n\r\n@unknown bklimt\nReturns the most-specific proper genls of collection COL\nother than itself that are also elements of SET.")
    public static SubLObject min_cluster_parents_for_collection(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_genls = genls.all_genls(col, mt, tv);
        final SubLObject genls_of_type = list_utilities.remove_if_not(symbol_function(VALID_CONCEPT_FILTER_NODES), all_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return genls.min_cols(remove(col, genls_of_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, tv);
    }

    /**
     *
     *
     * @return listp, Returns the minimal isas of TERM such that each is an element of SET.
     */
    @LispMethod(comment = "@return listp, Returns the minimal isas of TERM such that each is an element of SET.")
    public static final SubLObject min_cluster_parents_for_individual_alt(SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject all_isas = isa.all_isa(v_term, mt, tv);
            SubLObject isas_of_type = list_utilities.remove_if_not(symbol_function(VALID_CONCEPT_FILTER_NODES), all_isas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return genls.min_cols(isas_of_type, mt, tv);
        }
    }

    /**
     *
     *
     * @return listp, Returns the minimal isas of TERM such that each is an element of SET.
     */
    @LispMethod(comment = "@return listp, Returns the minimal isas of TERM such that each is an element of SET.")
    public static SubLObject min_cluster_parents_for_individual(final SubLObject v_term, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_isas = isa.all_isa(v_term, mt, tv);
        final SubLObject isas_of_type = list_utilities.remove_if_not(symbol_function(VALID_CONCEPT_FILTER_NODES), all_isas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return genls.min_cols(isas_of_type, mt, tv);
    }

    public static final SubLObject with_cluster_taxonomy_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_set = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    v_set = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($default_concept_filter_specification$, v_set)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt47);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_cluster_taxonomy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_set = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        v_set = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($default_concept_filter_specification$, v_set)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list47);
        return NIL;
    }

    /**
     * Creates a new cluster with #$Thing as its root.
     *
     * @return integerp; the id of the new cluster.
     */
    @LispMethod(comment = "Creates a new cluster with #$Thing as its root.\r\n\r\n@return integerp; the id of the new cluster.")
    public static final SubLObject create_cluster_alt() {
        {
            SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject root_node = $$Thing;
            SubLObject uuid = task_processor.get_current_task_processor_client();
            SubLObject id = integer_sequence_generator.integer_sequence_generator_next($cluster_id_isg$.getGlobalValue());
            SubLObject lock = $cluster_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary.dictionary_enter($cluster_map$.getGlobalValue(), id, list(v_graph, root_node, uuid));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            dictionary.dictionary_enter(v_graph, root_node, NIL);
            return id;
        }
    }

    /**
     * Creates a new cluster with #$Thing as its root.
     *
     * @return integerp; the id of the new cluster.
     */
    @LispMethod(comment = "Creates a new cluster with #$Thing as its root.\r\n\r\n@return integerp; the id of the new cluster.")
    public static SubLObject create_cluster() {
        final SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject root_node = $$Thing;
        final SubLObject uuid = task_processor.get_current_task_processor_client();
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next($cluster_id_isg$.getGlobalValue());
        SubLObject release = NIL;
        try {
            release = seize_lock($cluster_lock$.getGlobalValue());
            dictionary.dictionary_enter($cluster_map$.getGlobalValue(), id, list(v_graph, root_node, uuid));
        } finally {
            if (NIL != release) {
                release_lock($cluster_lock$.getGlobalValue());
            }
        }
        dictionary.dictionary_enter(v_graph, root_node, NIL);
        return id;
    }

    public static final SubLObject lookup_cluster_alt(SubLObject graph_id) {
        {
            SubLObject v_graph = NIL;
            SubLObject root = NIL;
            SubLObject uuid = NIL;
            SubLObject lock = $cluster_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject graph_triplet = dictionary.dictionary_lookup($cluster_map$.getGlobalValue(), graph_id, UNPROVIDED);
                    v_graph = graph_triplet.first();
                    root = second(graph_triplet);
                    uuid = third(graph_triplet);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return values(v_graph, root, uuid);
        }
    }

    public static SubLObject lookup_cluster(final SubLObject graph_id) {
        SubLObject v_graph = NIL;
        SubLObject root = NIL;
        SubLObject uuid = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($cluster_lock$.getGlobalValue());
            final SubLObject graph_triplet = dictionary.dictionary_lookup($cluster_map$.getGlobalValue(), graph_id, UNPROVIDED);
            v_graph = graph_triplet.first();
            root = second(graph_triplet);
            uuid = third(graph_triplet);
        } finally {
            if (NIL != release) {
                release_lock($cluster_lock$.getGlobalValue());
            }
        }
        return values(v_graph, root, uuid);
    }

    /**
     * Frees an existing cluster by removing it from the cluster map.
     *
     * @param GRAPH-ID
     * 		integerp; the id of the graph.
     * @return NIL
     */
    @LispMethod(comment = "Frees an existing cluster by removing it from the cluster map.\r\n\r\n@param GRAPH-ID\r\n\t\tintegerp; the id of the graph.\r\n@return NIL")
    public static final SubLObject free_cluster_alt(SubLObject graph_id) {
        {
            SubLObject lock = $cluster_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary.dictionary_remove($cluster_map$.getGlobalValue(), graph_id);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * Frees an existing cluster by removing it from the cluster map.
     *
     * @param GRAPH-ID
     * 		integerp; the id of the graph.
     * @return NIL
     */
    @LispMethod(comment = "Frees an existing cluster by removing it from the cluster map.\r\n\r\n@param GRAPH-ID\r\n\t\tintegerp; the id of the graph.\r\n@return NIL")
    public static SubLObject free_cluster(final SubLObject graph_id) {
        SubLObject release = NIL;
        try {
            release = seize_lock($cluster_lock$.getGlobalValue());
            dictionary.dictionary_remove($cluster_map$.getGlobalValue(), graph_id);
        } finally {
            if (NIL != release) {
                release_lock($cluster_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Frees any resources in use by clusters for clients identified by the given uuid-string.
     *
     * @param client-uuid
     * 		; stringp
     */
    @LispMethod(comment = "Frees any resources in use by clusters for clients identified by the given uuid-string.\r\n\r\n@param client-uuid\r\n\t\t; stringp")
    public static final SubLObject release_cluster_resources_for_client_alt(SubLObject client_uuid) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $cluster_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($cluster_map$.getGlobalValue()));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject graph_triplet = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject graph_uuid = third(graph_triplet);
                                    if (graph_uuid.equal(client_uuid)) {
                                        com.cyc.cycjava.cycl.document_search.free_cluster(id);
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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
     * Frees any resources in use by clusters for clients identified by the given uuid-string.
     *
     * @param client-uuid
     * 		; stringp
     */
    @LispMethod(comment = "Frees any resources in use by clusters for clients identified by the given uuid-string.\r\n\r\n@param client-uuid\r\n\t\t; stringp")
    public static SubLObject release_cluster_resources_for_client(final SubLObject client_uuid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($cluster_lock$.getGlobalValue());
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($cluster_map$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject graph_triplet = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject graph_uuid = third(graph_triplet);
                if (graph_uuid.equal(client_uuid)) {
                    free_cluster(id);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            if (NIL != release) {
                release_lock($cluster_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject add_term_to_cluster_alt(SubLObject graph_id, SubLObject v_term, SubLObject mt, SubLObject seen_map) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (seen_map == UNPROVIDED) {
            seen_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_graph = com.cyc.cycjava.cycl.document_search.lookup_cluster(graph_id);
                            SubLObject root = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == dictionary_utilities.dictionary_has_keyP(v_graph, v_term)) {
                                dictionary.dictionary_enter(v_graph, v_term, NIL);
                                dictionary.dictionary_enter(seen_map, v_term, T);
                                {
                                    SubLObject parents = (NIL != isa.isaP(v_term, $$Collection, mt, UNPROVIDED)) ? ((SubLObject) (com.cyc.cycjava.cycl.document_search.min_cluster_parents_for_collection(v_term, mt, UNPROVIDED))) : com.cyc.cycjava.cycl.document_search.min_cluster_parents_for_individual(v_term, mt, UNPROVIDED);
                                    SubLObject seen_a_parent = NIL;
                                    SubLObject cdolist_list_var = parents;
                                    SubLObject parent = NIL;
                                    for (parent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent = cdolist_list_var.first()) {
                                        if (!((NIL != dictionary_utilities.dictionary_has_keyP(seen_map, parent)) || (NIL != cardinality_estimates.generality_estimateG(parent, $$Event)))) {
                                            seen_a_parent = T;
                                            com.cyc.cycjava.cycl.document_search.add_term_to_cluster(graph_id, parent, mt, seen_map);
                                            dictionary_utilities.dictionary_pushnew(v_graph, parent, v_term, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                    if (NIL == seen_a_parent) {
                                        dictionary_utilities.dictionary_pushnew(v_graph, root, v_term, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                dictionary.dictionary_remove(seen_map, v_term);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject add_term_to_cluster(final SubLObject graph_id, final SubLObject v_term, SubLObject mt, SubLObject seen_map) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (seen_map == UNPROVIDED) {
            seen_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject v_graph = lookup_cluster(graph_id);
            final SubLObject root = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == dictionary_utilities.dictionary_has_keyP(v_graph, v_term)) {
                dictionary.dictionary_enter(v_graph, v_term, NIL);
                dictionary.dictionary_enter(seen_map, v_term, T);
                final SubLObject parents = (NIL != isa.isaP(v_term, $$Collection, mt, UNPROVIDED)) ? min_cluster_parents_for_collection(v_term, mt, UNPROVIDED) : min_cluster_parents_for_individual(v_term, mt, UNPROVIDED);
                SubLObject seen_a_parent = NIL;
                SubLObject cdolist_list_var = parents;
                SubLObject parent = NIL;
                parent = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == dictionary_utilities.dictionary_has_keyP(seen_map, parent)) && (NIL == cardinality_estimates.generality_estimateG(parent, $$Event))) {
                        seen_a_parent = T;
                        add_term_to_cluster(graph_id, parent, mt, seen_map);
                        dictionary_utilities.dictionary_pushnew(v_graph, parent, v_term, UNPROVIDED, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    parent = cdolist_list_var.first();
                } 
                if (NIL == seen_a_parent) {
                    dictionary_utilities.dictionary_pushnew(v_graph, root, v_term, UNPROVIDED, UNPROVIDED);
                }
                dictionary.dictionary_remove(seen_map, v_term);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Retrieves a java-friendly representation of a cluster, cleaned up for humans.
     *
     * @param GRAPH-ID
     * 		integerp; the id of the graph.
     * @return listp; a tree of terms of the form: <TREE> -> (TERM <TREE>*)
     */
    @LispMethod(comment = "Retrieves a java-friendly representation of a cluster, cleaned up for humans.\r\n\r\n@param GRAPH-ID\r\n\t\tintegerp; the id of the graph.\r\n@return listp; a tree of terms of the form: <TREE> -> (TERM <TREE>*)")
    public static final SubLObject retrieve_cluster_alt(SubLObject graph_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_graph = com.cyc.cycjava.cycl.document_search.lookup_cluster(graph_id);
                SubLObject root = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return com.cyc.cycjava.cycl.document_search.build_cluster_from_dag(root, v_graph, UNPROVIDED);
            }
        }
    }

    @LispMethod(comment = "Retrieves a java-friendly representation of a cluster, cleaned up for humans.\r\n\r\n@param GRAPH-ID\r\n\t\tintegerp; the id of the graph.\r\n@return listp; a tree of terms of the form: <TREE> -> (TERM <TREE>*)")
    public static SubLObject retrieve_cluster(final SubLObject graph_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_graph = lookup_cluster(graph_id);
        final SubLObject root = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return build_cluster_from_dag(root, v_graph, UNPROVIDED);
    }

    /**
     * Creates a hierarchical clustering of the elements of TERMS based on their
     * organization in the Cyc ontology.
     *
     * @param TERMS
     * 		listp; a list of terms to cluster
     * @return a hierarchical tree containing clusters according to the grammar:
    <CLUSTER> -> (TERM <CLUSTER>*)
     */
    @LispMethod(comment = "Creates a hierarchical clustering of the elements of TERMS based on their\r\norganization in the Cyc ontology.\r\n\r\n@param TERMS\r\n\t\tlistp; a list of terms to cluster\r\n@return a hierarchical tree containing clusters according to the grammar:\r\n<CLUSTER> -> (TERM <CLUSTER>*)\nCreates a hierarchical clustering of the elements of TERMS based on their\norganization in the Cyc ontology.")
    public static final SubLObject cluster_terms_ontologically_alt(SubLObject terms) {
        {
            SubLObject graph_id = com.cyc.cycjava.cycl.document_search.create_cluster();
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.document_search.add_term_to_cluster(graph_id, v_term, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject v_answer = com.cyc.cycjava.cycl.document_search.retrieve_cluster(graph_id);
                com.cyc.cycjava.cycl.document_search.free_cluster(graph_id);
                return v_answer;
            }
        }
    }

    @LispMethod(comment = "Creates a hierarchical clustering of the elements of TERMS based on their\r\norganization in the Cyc ontology.\r\n\r\n@param TERMS\r\n\t\tlistp; a list of terms to cluster\r\n@return a hierarchical tree containing clusters according to the grammar:\r\n<CLUSTER> -> (TERM <CLUSTER>*)\nCreates a hierarchical clustering of the elements of TERMS based on their\norganization in the Cyc ontology.")
    public static SubLObject cluster_terms_ontologically(final SubLObject terms) {
        final SubLObject graph_id = create_cluster();
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_term_to_cluster(graph_id, v_term, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        final SubLObject v_answer = retrieve_cluster(graph_id);
        free_cluster(graph_id);
        return v_answer;
    }

    /**
     * Determines if TERM is in a java-friendly CLUSTER.
     *
     * @param TERM
     * 		fort-p; the term to find.
     * @param CLUSTER
     * 		listp; the cluster to search.
     * @return T or NIL.
     */
    @LispMethod(comment = "Determines if TERM is in a java-friendly CLUSTER.\r\n\r\n@param TERM\r\n\t\tfort-p; the term to find.\r\n@param CLUSTER\r\n\t\tlistp; the cluster to search.\r\n@return T or NIL.")
    public static final SubLObject find_term_in_cluster_alt(SubLObject v_term, SubLObject cluster) {
        if (NIL == cluster) {
            return NIL;
        }
        if (cluster.first() == v_term) {
            return T;
        }
        {
            SubLObject cdolist_list_var = cluster.rest();
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.document_search.find_term_in_cluster(v_term, child)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Determines if TERM is in a java-friendly CLUSTER.\r\n\r\n@param TERM\r\n\t\tfort-p; the term to find.\r\n@param CLUSTER\r\n\t\tlistp; the cluster to search.\r\n@return T or NIL.")
    public static SubLObject find_term_in_cluster(final SubLObject v_term, final SubLObject cluster) {
        if (NIL == cluster) {
            return NIL;
        }
        if (cluster.first().eql(v_term)) {
            return T;
        }
        SubLObject cdolist_list_var = cluster.rest();
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != find_term_in_cluster(v_term, child)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Cleans a java-friendly cluster to make sure it won't be too stupid for humans.
     * This consists of a few cases, applied recursively:
     * 1. Clusters with only one member are collapsed, e.g. (collection (term)) -> (term)
     * 2. Merge identical clusters, e.g. (c (c1 (t1)) (c1 (t2))) -> (c (c1 t1 t2))
     * 3. Remove siblings that are also children, e.g. (c t1 (c1 t1)) -> (c (c1 t1))
     *
     * @param CLUSTER
     * 		listp; the cluster to clean.
     * @return listp; a tree of terms of the form: <TREE> -> (TERM <TREE>*)
     */
    @LispMethod(comment = "Cleans a java-friendly cluster to make sure it won\'t be too stupid for humans.\r\nThis consists of a few cases, applied recursively:\r\n1. Clusters with only one member are collapsed, e.g. (collection (term)) -> (term)\r\n2. Merge identical clusters, e.g. (c (c1 (t1)) (c1 (t2))) -> (c (c1 t1 t2))\r\n3. Remove siblings that are also children, e.g. (c t1 (c1 t1)) -> (c (c1 t1))\r\n\r\n@param CLUSTER\r\n\t\tlistp; the cluster to clean.\r\n@return listp; a tree of terms of the form: <TREE> -> (TERM <TREE>*)\nCleans a java-friendly cluster to make sure it won\'t be too stupid for humans.\nThis consists of a few cases, applied recursively:\n1. Clusters with only one member are collapsed, e.g. (collection (term)) -> (term)\n2. Merge identical clusters, e.g. (c (c1 (t1)) (c1 (t2))) -> (c (c1 t1 t2))\n3. Remove siblings that are also children, e.g. (c t1 (c1 t1)) -> (c (c1 t1))")
    public static final SubLObject clean_cluster_alt(SubLObject cluster) {
        {
            SubLObject root_term = cluster.first();
            SubLObject children = cluster.rest();
            SubLObject child_count = length(children);
            SubLObject i = ZERO_INTEGER;
            SubLObject j = ZERO_INTEGER;
            if (ONE_INTEGER.numE(child_count)) {
                return children.first();
            }
            if (ZERO_INTEGER.numE(child_count)) {
                return cluster;
            }
            while (i.numL(child_count)) {
                if (NIL != nth(i, children)) {
                    j = ZERO_INTEGER;
                    while (j.numL(i)) {
                        if (NIL != nth(j, children)) {
                            {
                                SubLObject child1 = nth(i, children);
                                SubLObject child2 = nth(j, children);
                                SubLObject head1 = child1.first();
                                SubLObject head2 = child2.first();
                                SubLObject rest1 = child1.rest();
                                SubLObject rest2 = child2.rest();
                                if (head1 == head2) {
                                    set_nth(i, children, com.cyc.cycjava.cycl.document_search.clean_cluster(cons(head1, append(rest1, rest2))));
                                    set_nth(j, children, NIL);
                                }
                            }
                        }
                        j = add(j, ONE_INTEGER);
                    } 
                }
                i = add(i, ONE_INTEGER);
            } 
            i = ZERO_INTEGER;
            while (i.numL(child_count)) {
                if (NIL != nth(i, children)) {
                    j = ZERO_INTEGER;
                    while (j.numL(child_count)) {
                        if ((NIL != nth(j, children)) && (!i.numE(j))) {
                            {
                                SubLObject child1 = nth(i, children);
                                SubLObject child2 = nth(j, children);
                                SubLObject head1 = child1.first();
                                if (NIL != com.cyc.cycjava.cycl.document_search.find_term_in_cluster(head1, child2)) {
                                    set_nth(i, children, NIL);
                                }
                            }
                        }
                        j = add(j, ONE_INTEGER);
                    } 
                }
                i = add(i, ONE_INTEGER);
            } 
            children = remove_if(NULL, children, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (ONE_INTEGER.numE(length(children))) {
                return children.first();
            }
            return cons(root_term, children);
        }
    }

    @LispMethod(comment = "Cleans a java-friendly cluster to make sure it won\'t be too stupid for humans.\r\nThis consists of a few cases, applied recursively:\r\n1. Clusters with only one member are collapsed, e.g. (collection (term)) -> (term)\r\n2. Merge identical clusters, e.g. (c (c1 (t1)) (c1 (t2))) -> (c (c1 t1 t2))\r\n3. Remove siblings that are also children, e.g. (c t1 (c1 t1)) -> (c (c1 t1))\r\n\r\n@param CLUSTER\r\n\t\tlistp; the cluster to clean.\r\n@return listp; a tree of terms of the form: <TREE> -> (TERM <TREE>*)\nCleans a java-friendly cluster to make sure it won\'t be too stupid for humans.\nThis consists of a few cases, applied recursively:\n1. Clusters with only one member are collapsed, e.g. (collection (term)) -> (term)\n2. Merge identical clusters, e.g. (c (c1 (t1)) (c1 (t2))) -> (c (c1 t1 t2))\n3. Remove siblings that are also children, e.g. (c t1 (c1 t1)) -> (c (c1 t1))")
    public static SubLObject clean_cluster(final SubLObject cluster) {
        final SubLObject root_term = cluster.first();
        SubLObject children = cluster.rest();
        final SubLObject child_count = length(children);
        SubLObject i = ZERO_INTEGER;
        SubLObject j = ZERO_INTEGER;
        if (ONE_INTEGER.numE(child_count)) {
            return children.first();
        }
        if (ZERO_INTEGER.numE(child_count)) {
            return cluster;
        }
        while (i.numL(child_count)) {
            if (NIL != nth(i, children)) {
                for (j = ZERO_INTEGER; j.numL(i); j = add(j, ONE_INTEGER)) {
                    if (NIL != nth(j, children)) {
                        final SubLObject child1 = nth(i, children);
                        final SubLObject child2 = nth(j, children);
                        final SubLObject head1 = child1.first();
                        final SubLObject head2 = child2.first();
                        final SubLObject rest1 = child1.rest();
                        final SubLObject rest2 = child2.rest();
                        if (head1.eql(head2)) {
                            set_nth(i, children, clean_cluster(cons(head1, append(rest1, rest2))));
                            set_nth(j, children, NIL);
                        }
                    }
                }
            }
            i = add(i, ONE_INTEGER);
        } 
        for (i = ZERO_INTEGER; i.numL(child_count); i = add(i, ONE_INTEGER)) {
            if (NIL != nth(i, children)) {
                for (j = ZERO_INTEGER; j.numL(child_count); j = add(j, ONE_INTEGER)) {
                    if ((NIL != nth(j, children)) && (!i.numE(j))) {
                        final SubLObject child1 = nth(i, children);
                        final SubLObject child2 = nth(j, children);
                        final SubLObject head1 = child1.first();
                        if (NIL != find_term_in_cluster(head1, child2)) {
                            set_nth(i, children, NIL);
                        }
                    }
                }
            }
        }
        children = remove_if(NULL, children, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (ONE_INTEGER.numE(length(children))) {
            return children.first();
        }
        return cons(root_term, children);
    }

    /**
     * Creates a java-friendly cluster from a table of links representing a
     * directed graph.  (It doesn't have to be acyclic, but cycles will be cut
     * arbitrarily.
     *
     * @param ROOT-TERM
     * 		fort-p; term to use for the root of the tree (often #$Thing).
     * @param LINK-MAP
     * 		dictionary-p; table where (key,value) represents a link from key->value.
     * @param SEEN-MAP
     * 		dictionary-p; table of terms that have been seen already.
     * @return listp; a cluster as defined by CLUSTER-TERMS-ONTOLOGICALLY
     */
    @LispMethod(comment = "Creates a java-friendly cluster from a table of links representing a\r\ndirected graph.  (It doesn\'t have to be acyclic, but cycles will be cut\r\narbitrarily.\r\n\r\n@param ROOT-TERM\r\n\t\tfort-p; term to use for the root of the tree (often #$Thing).\r\n@param LINK-MAP\r\n\t\tdictionary-p; table where (key,value) represents a link from key->value.\r\n@param SEEN-MAP\r\n\t\tdictionary-p; table of terms that have been seen already.\r\n@return listp; a cluster as defined by CLUSTER-TERMS-ONTOLOGICALLY\nCreates a java-friendly cluster from a table of links representing a\ndirected graph.  (It doesn\'t have to be acyclic, but cycles will be cut\narbitrarily.")
    public static final SubLObject build_cluster_from_dag_alt(SubLObject root_term, SubLObject link_map, SubLObject seen_map) {
        if (seen_map == UNPROVIDED) {
            seen_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject result = NIL;
            SubLObject terms = dictionary.dictionary_lookup(link_map, root_term, UNPROVIDED);
            if (NIL == dictionary.dictionary_lookup(seen_map, root_term, UNPROVIDED)) {
                dictionary.dictionary_enter(seen_map, root_term, T);
                {
                    SubLObject cdolist_list_var = terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        result = cons(com.cyc.cycjava.cycl.document_search.build_cluster_from_dag(v_term, link_map, seen_map), result);
                    }
                }
                dictionary.dictionary_remove(seen_map, root_term);
            }
            return com.cyc.cycjava.cycl.document_search.clean_cluster(cons(root_term, result));
        }
    }

    @LispMethod(comment = "Creates a java-friendly cluster from a table of links representing a\r\ndirected graph.  (It doesn\'t have to be acyclic, but cycles will be cut\r\narbitrarily.\r\n\r\n@param ROOT-TERM\r\n\t\tfort-p; term to use for the root of the tree (often #$Thing).\r\n@param LINK-MAP\r\n\t\tdictionary-p; table where (key,value) represents a link from key->value.\r\n@param SEEN-MAP\r\n\t\tdictionary-p; table of terms that have been seen already.\r\n@return listp; a cluster as defined by CLUSTER-TERMS-ONTOLOGICALLY\nCreates a java-friendly cluster from a table of links representing a\ndirected graph.  (It doesn\'t have to be acyclic, but cycles will be cut\narbitrarily.")
    public static SubLObject build_cluster_from_dag(final SubLObject root_term, final SubLObject link_map, SubLObject seen_map) {
        if (seen_map == UNPROVIDED) {
            seen_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        SubLObject result = NIL;
        final SubLObject terms = dictionary.dictionary_lookup(link_map, root_term, UNPROVIDED);
        if (NIL == dictionary.dictionary_lookup(seen_map, root_term, UNPROVIDED)) {
            dictionary.dictionary_enter(seen_map, root_term, T);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(build_cluster_from_dag(v_term, link_map, seen_map), result);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            dictionary.dictionary_remove(seen_map, root_term);
        }
        return clean_cluster(cons(root_term, result));
    }

    /**
     * Returns a list of PPH lists for terms that are mentioned on the page at URL.
     *
     * @param URL
     * 		stringp; the url of the website to search.
     * @return RESULTS listp; a list of cycl terms, represented as java-friendly PPHs.
     */
    @LispMethod(comment = "Returns a list of PPH lists for terms that are mentioned on the page at URL.\r\n\r\n@param URL\r\n\t\tstringp; the url of the website to search.\r\n@return RESULTS listp; a list of cycl terms, represented as java-friendly PPHs.")
    public static final SubLObject get_terms_from_url_alt(SubLObject url, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject text_object = remove_html_tags(web_utilities.get_html_source_from_url(url, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            SubLObject dirty_text = (text_object.isString()) ? ((SubLObject) (text_object)) : second(text_object);
            SubLObject clean_text = (NIL == dirty_text) ? ((SubLObject) ($str_alt64$)) : string_utilities.string_substitute($str_alt12$_, $str_alt65$_nbsp_, dirty_text, UNPROVIDED);
            return com.cyc.cycjava.cycl.document_search.get_terms_in_string(clean_text, mt, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns a list of PPH lists for terms that are mentioned on the page at URL.\r\n\r\n@param URL\r\n\t\tstringp; the url of the website to search.\r\n@return RESULTS listp; a list of cycl terms, represented as java-friendly PPHs.")
    public static SubLObject get_terms_from_url(final SubLObject url, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject text_object = remove_html_tags(web_utilities.get_html_source_from_url(url, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject dirty_text = (text_object.isString()) ? text_object : second(text_object);
        final SubLObject clean_text = (NIL == dirty_text) ? $str64$ : string_utilities.string_substitute($$$_, $str65$_nbsp_, dirty_text, UNPROVIDED);
        return get_terms_in_string(clean_text, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a list of PPH lists for terms that are mentioned in STRING.
     *
     * @param STRING
     * 		stringp; the string to search.
     * @return RESULTS listp; a list of cycl terms, represented as java-friendly PPHs.
     */
    @LispMethod(comment = "Returns a list of PPH lists for terms that are mentioned in STRING.\r\n\r\n@param STRING\r\n\t\tstringp; the string to search.\r\n@return RESULTS listp; a list of cycl terms, represented as java-friendly PPHs.")
    public static final SubLObject get_terms_in_string_alt(SubLObject string, SubLObject mt, SubLObject generation_mt, SubLObject filter) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (generation_mt == UNPROVIDED) {
            generation_mt = $$EnglishParaphraseMt;
        }
        if (filter == UNPROVIDED) {
            filter = concept_filter.get_default_concept_filter_specification();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_document = document.new_document(string, UNPROVIDED);
                SubLObject iterator = concept_tagger.tag_concepts(v_document, list($FILTER, filter));
                SubLObject total = document.document_sentence_length(v_document);
                SubLObject current = ZERO_INTEGER;
                SubLObject results = NIL;
                while (NIL == iteration.iteration_done(iterator)) {
                    {
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
                                    SubLObject sentence = iteration.iteration_next(iterator);
                                    SubLObject sentence_text = document.sentence_string(sentence);
                                    current = add(ONE_INTEGER, current);
                                    {
                                        SubLObject vector_var = document.sentence_yield(sentence);
                                        SubLObject backwardP_var = NIL;
                                        SubLObject length = length(vector_var);
                                        SubLObject v_iteration = NIL;
                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            {
                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                SubLObject word = aref(vector_var, element_num);
                                                SubLObject cdolist_list_var = document.word_cycls(word);
                                                SubLObject v_term = NIL;
                                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject _prev_bind_0_3 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_4 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_5 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                        SubLObject _prev_bind_4 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
                                                        SubLObject _prev_bind_5 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
                                                        SubLObject _prev_bind_6 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
                                                        SubLObject _prev_bind_7 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
                                                        SubLObject _prev_bind_8 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                        SubLObject _prev_bind_9 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
                                                        SubLObject _prev_bind_10 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
                                                        SubLObject _prev_bind_11 = pph_vars.$pph_addressee$.currentBinding(thread);
                                                        SubLObject _prev_bind_12 = pph_vars.$pph_speaker$.currentBinding(thread);
                                                        SubLObject _prev_bind_13 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_terse_modeP$.bind(T, thread);
                                                            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                                                            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
                                                            pph_vars.$paraphrase_precision$.bind(NIL, thread);
                                                            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
                                                            pph_vars.$pph_maximize_linksP$.bind(T, thread);
                                                            pph_vars.$pph_link_arg0P$.bind(T, thread);
                                                            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
                                                            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
                                                            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
                                                            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
                                                            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
                                                            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
                                                            pph_vars.$pph_quantify_varsP$.bind(T, thread);
                                                            {
                                                                SubLObject java_phrase = pph_main.generate_phrase_for_java(v_term, $DEFAULT, $NONE, generation_mt, mt, UNPROVIDED);
                                                                SubLObject result = list(java_phrase, narts_high.nart_substitute(v_term));
                                                                if (NIL != task_processor.task_process_pool_p(task_processor.get_task_process_pool_for_process(current_process()))) {
                                                                    task_processor.post_task_info_processor_partial_results(list(result, sentence_text, current, total));
                                                                } else {
                                                                    results = cons(list(result, sentence_text, current, total), results);
                                                                }
                                                            }
                                                        } finally {
                                                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_13, thread);
                                                            pph_vars.$pph_speaker$.rebind(_prev_bind_12, thread);
                                                            pph_vars.$pph_addressee$.rebind(_prev_bind_11, thread);
                                                            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_10, thread);
                                                            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_9, thread);
                                                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_8, thread);
                                                            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_7, thread);
                                                            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_6, thread);
                                                            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_5, thread);
                                                            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_4, thread);
                                                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_3, thread);
                                                            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_2_5, thread);
                                                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_1_4, thread);
                                                            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0_3, thread);
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
                    }
                } 
                return reverse(results);
            }
        }
    }

    /**
     * Returns a list of PPH lists for terms that are mentioned in STRING.
     *
     * @param STRING
     * 		stringp; the string to search.
     * @return RESULTS listp; a list of cycl terms, represented as java-friendly PPHs.
     */
    @LispMethod(comment = "Returns a list of PPH lists for terms that are mentioned in STRING.\r\n\r\n@param STRING\r\n\t\tstringp; the string to search.\r\n@return RESULTS listp; a list of cycl terms, represented as java-friendly PPHs.")
    public static SubLObject get_terms_in_string(final SubLObject string, SubLObject mt, SubLObject generation_mt, SubLObject filter) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (generation_mt == UNPROVIDED) {
            generation_mt = $$EnglishParaphraseMt;
        }
        if (filter == UNPROVIDED) {
            filter = concept_filter.get_default_concept_filter_specification();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = document.new_document(string, UNPROVIDED, UNPROVIDED);
        final SubLObject iterator = concept_tagger.tag_concepts(v_document, list($FILTER, filter));
        final SubLObject total = document.document_sentence_length(v_document);
        SubLObject current = ZERO_INTEGER;
        SubLObject results = NIL;
        while (NIL == iteration.iteration_done(iterator)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject sentence = iteration.iteration_next(iterator);
                final SubLObject sentence_text = document.sentence_string(sentence);
                current = add(ONE_INTEGER, current);
                SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                SubLObject word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$3 = document.word_cycls(word);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        final SubLObject _prev_bind_0_$4 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$6 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = pph_vars.$pph_addressee$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = pph_vars.$pph_speaker$.currentBinding(thread);
                        final SubLObject _prev_bind_14 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_terse_modeP$.bind(T, thread);
                            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
                            pph_vars.$paraphrase_precision$.bind(NIL, thread);
                            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
                            pph_vars.$pph_maximize_linksP$.bind(T, thread);
                            pph_vars.$pph_link_arg0P$.bind(T, thread);
                            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
                            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
                            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
                            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
                            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
                            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
                            pph_vars.$pph_quantify_varsP$.bind(T, thread);
                            final SubLObject java_phrase = pph_main.generate_phrase_for_java(v_term, $DEFAULT, $NONE, generation_mt, mt, UNPROVIDED);
                            final SubLObject result = list(java_phrase, narts_high.nart_substitute(v_term));
                            if (NIL != task_processor.task_process_pool_p(task_processor.get_task_process_pool_for_process(current_process()))) {
                                task_processor.post_task_info_processor_partial_results(list(result, sentence_text, current, total));
                            } else {
                                results = cons(list(result, sentence_text, current, total), results);
                            }
                        } finally {
                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_14, thread);
                            pph_vars.$pph_speaker$.rebind(_prev_bind_13, thread);
                            pph_vars.$pph_addressee$.rebind(_prev_bind_12, thread);
                            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_11, thread);
                            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_10, thread);
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_9, thread);
                            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_8, thread);
                            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
                            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_6, thread);
                            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_5, thread);
                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_4, thread);
                            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_2_$6, thread);
                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_1_$5, thread);
                            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0_$4, thread);
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        v_term = cdolist_list_var_$3.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } 
        return reverse(results);
    }

    public static final SubLObject list_itemL_alt(SubLObject list_item1, SubLObject list_item2) {
        {
            SubLObject pph_item1 = second(list_item1.first().first()).first();
            SubLObject pph_item2 = second(list_item2.first().first()).first();
            SubLObject term1 = czer_main.canonicalize_term(second(pph_item1), UNPROVIDED);
            SubLObject term2 = czer_main.canonicalize_term(second(pph_item2), UNPROVIDED);
            return kb_utilities.term_L(term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject list_itemL(final SubLObject list_item1, final SubLObject list_item2) {
        final SubLObject pph_item1 = second(list_item1.first().first()).first();
        final SubLObject pph_item2 = second(list_item2.first().first()).first();
        final SubLObject term1 = czer_main.canonicalize_term(second(pph_item1), UNPROVIDED);
        final SubLObject term2 = czer_main.canonicalize_term(second(pph_item2), UNPROVIDED);
        return kb_utilities.term_L(term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * we don't care what the SUIDs are for javalists (or their order), but we do care about everything else in the pph-javalist
     */
    @LispMethod(comment = "we don\'t care what the SUIDs are for javalists (or their order), but we do care about everything else in the pph-javalist")
    public static final SubLObject super_javalists_more_or_less_equal_alt(SubLObject super_jl1, SubLObject super_jl2) {
        super_jl1 = Sort.sort(copy_list(super_jl1), symbol_function($sym72$LIST_ITEM_), UNPROVIDED);
        super_jl2 = Sort.sort(copy_list(super_jl2), symbol_function($sym72$LIST_ITEM_), UNPROVIDED);
        {
            SubLObject failureP = NIL;
            SubLObject super_list1_item = NIL;
            SubLObject super_list1_item_6 = NIL;
            SubLObject super_list2_item = NIL;
            SubLObject super_list2_item_7 = NIL;
            for (super_list1_item = super_jl1, super_list1_item_6 = super_list1_item.first(), super_list2_item = super_jl2, super_list2_item_7 = super_list2_item.first(); !((NIL == super_list2_item) && (NIL == super_list1_item)); super_list1_item = super_list1_item.rest() , super_list1_item_6 = super_list1_item.first() , super_list2_item = super_list2_item.rest() , super_list2_item_7 = super_list2_item.first()) {
                {
                    SubLObject jl1 = super_list1_item_6.first().first();
                    SubLObject jl2 = super_list2_item_7.first().first();
                    if (NIL == failureP) {
                        failureP = makeBoolean(NIL == com.cyc.cycjava.cycl.document_search.javalists_more_or_less_equal(jl1, jl2));
                    }
                }
            }
            return makeBoolean(NIL == failureP);
        }
    }

    @LispMethod(comment = "we don\'t care what the SUIDs are for javalists (or their order), but we do care about everything else in the pph-javalist")
    public static SubLObject super_javalists_more_or_less_equal(SubLObject super_jl1, SubLObject super_jl2) {
        super_jl1 = Sort.sort(copy_list(super_jl1), symbol_function($sym72$LIST_ITEM_), UNPROVIDED);
        super_jl2 = Sort.sort(copy_list(super_jl2), symbol_function($sym72$LIST_ITEM_), UNPROVIDED);
        SubLObject failureP = NIL;
        SubLObject super_list1_item = NIL;
        SubLObject super_list1_item_$7 = NIL;
        SubLObject super_list2_item = NIL;
        SubLObject super_list2_item_$8 = NIL;
        super_list1_item = super_jl1;
        super_list1_item_$7 = super_list1_item.first();
        super_list2_item = super_jl2;
        super_list2_item_$8 = super_list2_item.first();
        while ((NIL != super_list2_item) || (NIL != super_list1_item)) {
            final SubLObject jl1 = super_list1_item_$7.first().first();
            final SubLObject jl2 = super_list2_item_$8.first().first();
            if (NIL == failureP) {
                failureP = makeBoolean(NIL == javalists_more_or_less_equal(jl1, jl2));
            }
            super_list1_item = super_list1_item.rest();
            super_list1_item_$7 = super_list1_item.first();
            super_list2_item = super_list2_item.rest();
            super_list2_item_$8 = super_list2_item.first();
        } 
        return makeBoolean(NIL == failureP);
    }/**
     * we don't care what the SUIDs are for javalists (or their order), but we do care about everything else in the pph-javalist
     */


    public static final SubLObject javalists_more_or_less_equal_alt(SubLObject jl1, SubLObject jl2) {
        {
            SubLObject display_string1 = jl1.first();
            SubLObject display_string2 = jl2.first();
            SubLObject pph_list1 = second(jl1);
            SubLObject pph_list2 = second(jl2);
            SubLObject failureP = NIL;
            if (NIL == failureP) {
                {
                    SubLObject pph_item1 = NIL;
                    SubLObject pph_item1_8 = NIL;
                    SubLObject pph_item2 = NIL;
                    SubLObject pph_item2_9 = NIL;
                    for (pph_item1 = pph_list1, pph_item1_8 = pph_item1.first(), pph_item2 = pph_list2, pph_item2_9 = pph_item2.first(); !((NIL != failureP) || ((NIL == pph_item2) && (NIL == pph_item1))); pph_item1 = pph_item1.rest() , pph_item1_8 = pph_item1.first() , pph_item2 = pph_item2.rest() , pph_item2_9 = pph_item2.first()) {
                        if (NIL == failureP) {
                            if (!(((((pph_item1_8.first().equal(pph_item2_9.first()) && (NIL != czer_utilities.equals_elP(czer_main.canonicalize_term(second(pph_item1_8), UNPROVIDED), czer_main.canonicalize_term(second(pph_item2_9), UNPROVIDED), UNPROVIDED, UNPROVIDED))) && third(pph_item1_8).equal(third(pph_item2_9))) && fifth(pph_item1_8).equal(fifth(pph_item2_9))) && sixth(pph_item1_8).equal(sixth(pph_item2_9))) && display_string1.equal(display_string2))) {
                                Errors.warn($str_alt73$failed_on__S____S__, pph_item1_8, pph_item2_9);
                                failureP = T;
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == failureP);
        }
    }

    public static SubLObject javalists_more_or_less_equal(final SubLObject jl1, final SubLObject jl2) {
        final SubLObject display_string1 = jl1.first();
        final SubLObject display_string2 = jl2.first();
        final SubLObject pph_list1 = second(jl1);
        final SubLObject pph_list2 = second(jl2);
        SubLObject failureP = NIL;
        if (NIL == failureP) {
            SubLObject pph_item1 = NIL;
            SubLObject pph_item1_$9 = NIL;
            SubLObject pph_item2 = NIL;
            SubLObject pph_item2_$10 = NIL;
            pph_item1 = pph_list1;
            pph_item1_$9 = pph_item1.first();
            pph_item2 = pph_list2;
            pph_item2_$10 = pph_item2.first();
            while ((NIL == failureP) && ((NIL != pph_item2) || (NIL != pph_item1))) {
                if ((NIL == failureP) && ((((((!pph_item1_$9.first().equal(pph_item2_$10.first())) || (NIL == czer_utilities.equals_elP(czer_main.canonicalize_term(second(pph_item1_$9), UNPROVIDED), czer_main.canonicalize_term(second(pph_item2_$10), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (!third(pph_item1_$9).equal(third(pph_item2_$10)))) || (!fifth(pph_item1_$9).equal(fifth(pph_item2_$10)))) || (!sixth(pph_item1_$9).equal(sixth(pph_item2_$10)))) || (!display_string1.equal(display_string2)))) {
                    Errors.warn($str73$failed_on__S____S__, pph_item1_$9, pph_item2_$10);
                    failureP = T;
                }
                pph_item1 = pph_item1.rest();
                pph_item1_$9 = pph_item1.first();
                pph_item2 = pph_item2.rest();
                pph_item2_$10 = pph_item2.first();
            } 
        }
        return makeBoolean(NIL == failureP);
    }

    public static SubLObject declare_document_search_file() {
        declareFunction("search_engine_p", "SEARCH-ENGINE-P", 1, 0, false);
        declareFunction("register_search_engine", "REGISTER-SEARCH-ENGINE", 1, 0, false);
        declareFunction("register_search_engine_int", "REGISTER-SEARCH-ENGINE-INT", 7, 0, false);
        declareFunction("deregister_search_engine", "DEREGISTER-SEARCH-ENGINE", 1, 0, false);
        declareFunction("get_available_search_engines", "GET-AVAILABLE-SEARCH-ENGINES", 0, 0, false);
        declareFunction("search_engine_availableP", "SEARCH-ENGINE-AVAILABLE?", 1, 0, false);
        declareFunction("get_default_search_engine", "GET-DEFAULT-SEARCH-ENGINE", 0, 0, false);
        declareFunction("set_default_search_engine", "SET-DEFAULT-SEARCH-ENGINE", 1, 0, false);
        declareFunction("get_search_engine_description", "GET-SEARCH-ENGINE-DESCRIPTION", 1, 0, false);
        declareFunction("generic_query_string_for_cycl_sentence", "GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        declareFunction("query_string_for_cycl_sentence", "QUERY-STRING-FOR-CYCL-SENTENCE", 2, 0, false);
        declareFunction("search_documents_for_cycl_sentence", "SEARCH-DOCUMENTS-FOR-CYCL-SENTENCE", 1, 3, false);
        declareFunction("search_documents_for_nl_sentence", "SEARCH-DOCUMENTS-FOR-NL-SENTENCE", 1, 3, false);
        declareFunction("search_documents", "SEARCH-DOCUMENTS", 1, 3, false);
        declareFunction("search_count", "SEARCH-COUNT", 1, 1, false);
        declareFunction("search_url_availableP", "SEARCH-URL-AVAILABLE?", 0, 1, false);
        declareFunction("search_url", "SEARCH-URL", 1, 3, false);
        declareFunction("search_url_for_cycl_sentence", "SEARCH-URL-FOR-CYCL-SENTENCE", 1, 3, false);
        declareFunction("google_search_wrapper", "GOOGLE-SEARCH-WRAPPER", 3, 0, false);
        declareFunction("google_query_string_for_cycl_sentence", "GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        declareFunction("lucene_search_wrapper", "LUCENE-SEARCH-WRAPPER", 3, 0, false);
        declareFunction("lucene_count_wrapper", "LUCENE-COUNT-WRAPPER", 1, 0, false);
        declareFunction("cyc_semantic_search_string", "CYC-SEMANTIC-SEARCH-STRING", 1, 0, false);
        declareFunction("cyc_semantic_index_server_aliveP", "CYC-SEMANTIC-INDEX-SERVER-ALIVE?", 0, 0, false);
        declareFunction("cyc_semantic_query_string_for_cycl_sentence", "CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false);
        declareFunction("replace_span_tags", "REPLACE-SPAN-TAGS", 1, 0, false);
        declareFunction("cyc_semantic_search_wrapper", "CYC-SEMANTIC-SEARCH-WRAPPER", 3, 0, false);
        declareFunction("cyc_semantic_count_wrapper", "CYC-SEMANTIC-COUNT-WRAPPER", 1, 0, false);
        declareFunction("min_cluster_parents_for_collection", "MIN-CLUSTER-PARENTS-FOR-COLLECTION", 1, 2, false);
        declareFunction("min_cluster_parents_for_individual", "MIN-CLUSTER-PARENTS-FOR-INDIVIDUAL", 1, 2, false);
        declareMacro("with_cluster_taxonomy", "WITH-CLUSTER-TAXONOMY");
        declareFunction("create_cluster", "CREATE-CLUSTER", 0, 0, false);
        declareFunction("lookup_cluster", "LOOKUP-CLUSTER", 1, 0, false);
        declareFunction("free_cluster", "FREE-CLUSTER", 1, 0, false);
        declareFunction("release_cluster_resources_for_client", "RELEASE-CLUSTER-RESOURCES-FOR-CLIENT", 1, 0, false);
        declareFunction("add_term_to_cluster", "ADD-TERM-TO-CLUSTER", 2, 2, false);
        declareFunction("retrieve_cluster", "RETRIEVE-CLUSTER", 1, 0, false);
        declareFunction("cluster_terms_ontologically", "CLUSTER-TERMS-ONTOLOGICALLY", 1, 0, false);
        declareFunction("find_term_in_cluster", "FIND-TERM-IN-CLUSTER", 2, 0, false);
        declareFunction("clean_cluster", "CLEAN-CLUSTER", 1, 0, false);
        declareFunction("build_cluster_from_dag", "BUILD-CLUSTER-FROM-DAG", 2, 1, false);
        declareFunction("get_terms_from_url", "GET-TERMS-FROM-URL", 1, 1, false);
        declareFunction("get_terms_in_string", "GET-TERMS-IN-STRING", 1, 3, false);
        declareFunction("list_itemL", "LIST-ITEM<", 2, 0, false);
        declareFunction("super_javalists_more_or_less_equal", "SUPER-JAVALISTS-MORE-OR-LESS-EQUAL", 2, 0, false);
        declareFunction("javalists_more_or_less_equal", "JAVALISTS-MORE-OR-LESS-EQUAL", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_document_search_file_alt() {
        deflexical("*SEARCH-ENGINES*", $list_alt0);
        deflexical("*SEARCH-ENGINE-SPECS*", $list_alt1);
        defparameter("*DEFAULT-SEARCH-ENGINE*", NIL);
        deflexical("*CLUSTER-ID-ISG*", NIL != boundp($cluster_id_isg$) ? ((SubLObject) ($cluster_id_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*CLUSTER-MAP*", NIL != boundp($cluster_map$) ? ((SubLObject) ($cluster_map$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*CLUSTER-LOCK*", NIL != boundp($cluster_lock$) ? ((SubLObject) ($cluster_lock$.getGlobalValue())) : make_lock($$$Ontological_Cluster_Map_Lock));
        return NIL;
    }

    public static SubLObject init_document_search_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SEARCH-ENGINES*", $list0);
            deflexical("*SEARCH-ENGINE-SPECS*", $list1);
            defparameter("*DEFAULT-SEARCH-ENGINE*", NIL);
            deflexical("*CLUSTER-ID-ISG*", SubLTrampolineFile.maybeDefault($cluster_id_isg$, $cluster_id_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            deflexical("*CLUSTER-MAP*", SubLTrampolineFile.maybeDefault($cluster_map$, $cluster_map$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*CLUSTER-LOCK*", SubLTrampolineFile.maybeDefault($cluster_lock$, $cluster_lock$, () -> make_lock($$$Ontological_Cluster_Map_Lock)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CLUSTER-ID-ISG*", NIL != boundp($cluster_id_isg$) ? ((SubLObject) ($cluster_id_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*CLUSTER-MAP*", NIL != boundp($cluster_map$) ? ((SubLObject) ($cluster_map$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*CLUSTER-LOCK*", NIL != boundp($cluster_lock$) ? ((SubLObject) ($cluster_lock$.getGlobalValue())) : make_lock($$$Ontological_Cluster_Map_Lock));
        }
        return NIL;
    }

    public static SubLObject init_document_search_file_Previous() {
        deflexical("*SEARCH-ENGINES*", $list0);
        deflexical("*SEARCH-ENGINE-SPECS*", $list1);
        defparameter("*DEFAULT-SEARCH-ENGINE*", NIL);
        deflexical("*CLUSTER-ID-ISG*", SubLTrampolineFile.maybeDefault($cluster_id_isg$, $cluster_id_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*CLUSTER-MAP*", SubLTrampolineFile.maybeDefault($cluster_map$, $cluster_map$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*CLUSTER-LOCK*", SubLTrampolineFile.maybeDefault($cluster_lock$, $cluster_lock$, () -> make_lock($$$Ontological_Cluster_Map_Lock)));
        return NIL;
    }

    public static final SubLObject setup_document_search_file_alt() {
        register_external_symbol(SEARCH_ENGINE_P);
        register_external_symbol(REGISTER_SEARCH_ENGINE);
        register_external_symbol(DEREGISTER_SEARCH_ENGINE);
        register_external_symbol(GET_AVAILABLE_SEARCH_ENGINES);
        register_external_symbol($sym8$SEARCH_ENGINE_AVAILABLE_);
        register_external_symbol(GET_DEFAULT_SEARCH_ENGINE);
        register_external_symbol(SET_DEFAULT_SEARCH_ENGINE);
        register_external_symbol(GET_SEARCH_ENGINE_DESCRIPTION);
        register_external_symbol(SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE);
        register_external_symbol(SEARCH_DOCUMENTS_FOR_NL_SENTENCE);
        register_external_symbol(SEARCH_COUNT);
        register_external_symbol($sym17$SEARCH_URL_AVAILABLE_);
        register_external_symbol(SEARCH_URL);
        register_external_symbol(SEARCH_URL_FOR_CYCL_SENTENCE);
        declare_defglobal($cluster_id_isg$);
        declare_defglobal($cluster_map$);
        declare_defglobal($cluster_lock$);
        register_external_symbol(CREATE_CLUSTER);
        register_external_symbol(FREE_CLUSTER);
        register_external_symbol(ADD_TERM_TO_CLUSTER);
        register_external_symbol(RETRIEVE_CLUSTER);
        register_external_symbol(CLUSTER_TERMS_ONTOLOGICALLY);
        register_external_symbol(GET_TERMS_FROM_URL);
        register_external_symbol(GET_TERMS_IN_STRING);
        define_test_case_table_int(GET_TERMS_IN_STRING, list(new SubLObject[]{ $TEST, SUPER_JAVALISTS_MORE_OR_LESS_EQUAL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt82);
        return NIL;
    }

    public static SubLObject setup_document_search_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(SEARCH_ENGINE_P);
            register_external_symbol(REGISTER_SEARCH_ENGINE);
            register_external_symbol(DEREGISTER_SEARCH_ENGINE);
            register_external_symbol(GET_AVAILABLE_SEARCH_ENGINES);
            register_external_symbol($sym8$SEARCH_ENGINE_AVAILABLE_);
            register_external_symbol(GET_DEFAULT_SEARCH_ENGINE);
            register_external_symbol(SET_DEFAULT_SEARCH_ENGINE);
            register_external_symbol(GET_SEARCH_ENGINE_DESCRIPTION);
            register_external_symbol(SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE);
            register_external_symbol(SEARCH_DOCUMENTS_FOR_NL_SENTENCE);
            register_external_symbol(SEARCH_COUNT);
            register_external_symbol($sym17$SEARCH_URL_AVAILABLE_);
            register_external_symbol(SEARCH_URL);
            register_external_symbol(SEARCH_URL_FOR_CYCL_SENTENCE);
            declare_defglobal($cluster_id_isg$);
            declare_defglobal($cluster_map$);
            declare_defglobal($cluster_lock$);
            register_external_symbol(CREATE_CLUSTER);
            register_external_symbol(FREE_CLUSTER);
            register_external_symbol(ADD_TERM_TO_CLUSTER);
            register_external_symbol(RETRIEVE_CLUSTER);
            register_external_symbol(CLUSTER_TERMS_ONTOLOGICALLY);
            register_external_symbol(GET_TERMS_FROM_URL);
            register_external_symbol(GET_TERMS_IN_STRING);
            define_test_case_table_int(GET_TERMS_IN_STRING, list(new SubLObject[]{ $TEST, SUPER_JAVALISTS_MORE_OR_LESS_EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list81);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(GET_TERMS_IN_STRING, list(new SubLObject[]{ $TEST, SUPER_JAVALISTS_MORE_OR_LESS_EQUAL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt82);
        }
        return NIL;
    }

    public static SubLObject setup_document_search_file_Previous() {
        register_external_symbol(SEARCH_ENGINE_P);
        register_external_symbol(REGISTER_SEARCH_ENGINE);
        register_external_symbol(DEREGISTER_SEARCH_ENGINE);
        register_external_symbol(GET_AVAILABLE_SEARCH_ENGINES);
        register_external_symbol($sym8$SEARCH_ENGINE_AVAILABLE_);
        register_external_symbol(GET_DEFAULT_SEARCH_ENGINE);
        register_external_symbol(SET_DEFAULT_SEARCH_ENGINE);
        register_external_symbol(GET_SEARCH_ENGINE_DESCRIPTION);
        register_external_symbol(SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE);
        register_external_symbol(SEARCH_DOCUMENTS_FOR_NL_SENTENCE);
        register_external_symbol(SEARCH_COUNT);
        register_external_symbol($sym17$SEARCH_URL_AVAILABLE_);
        register_external_symbol(SEARCH_URL);
        register_external_symbol(SEARCH_URL_FOR_CYCL_SENTENCE);
        declare_defglobal($cluster_id_isg$);
        declare_defglobal($cluster_map$);
        declare_defglobal($cluster_lock$);
        register_external_symbol(CREATE_CLUSTER);
        register_external_symbol(FREE_CLUSTER);
        register_external_symbol(ADD_TERM_TO_CLUSTER);
        register_external_symbol(RETRIEVE_CLUSTER);
        register_external_symbol(CLUSTER_TERMS_ONTOLOGICALLY);
        register_external_symbol(GET_TERMS_FROM_URL);
        register_external_symbol(GET_TERMS_IN_STRING);
        define_test_case_table_int(GET_TERMS_IN_STRING, list(new SubLObject[]{ $TEST, SUPER_JAVALISTS_MORE_OR_LESS_EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list81);
        return NIL;
    }

    private static SubLObject _constant_81_initializer() {
        return list(list(list(makeString("George Washington chopped down an apple tree"), reader_make_constant_shell("InferencePSC"), reader_make_constant_shell("EnglishParaphraseMt"), NIL), list(list(list(list(makeString("George Washington"), list(list(makeString("George"), reader_make_constant_shell("GeorgeWashington"), NIL, makeString("<a href=\"cg?CB-CF&14961\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashington"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell("GeorgeWashington"), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell("GeorgeWashington")), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("George Washington University"), list(list(makeString("George"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, makeString("<a href=\"cg?CB-CF&67586\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SEVENTEEN_INTEGER), list(makeString("University"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, makeString("</a>"), EIGHTEEN_INTEGER))), reader_make_constant_shell("GeorgeWashingtonUniversity")), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("chopping"), list(list(makeString("chopping"), reader_make_constant_shell("ChoppingSomething"), NIL, makeString("<a href=\"cg?CB-CF&7109\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("ChoppingSomething")), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("apple tree"), list(list(makeString("apple"), reader_make_constant_shell("AppleTree"), NIL, makeString("<a href=\"cg?CB-CF&607\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("AppleTree"), NIL, NIL, NIL, FIVE_INTEGER), list(makeString("tree"), reader_make_constant_shell("AppleTree"), NIL, NIL, makeString("</a>"), SIX_INTEGER))), reader_make_constant_shell("AppleTree")), makeString("George Washington chopped down an apple tree"), ONE_INTEGER, ONE_INTEGER))), list(list(makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York")), list(new SubLObject[]{ list(list(list(makeString("Osama bin Laden"), list(list(makeString("Osama"), reader_make_constant_shell("OsamaBinLaden"), NIL, makeString("<a href=\"cg?CB-CF&44138\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("OsamaBinLaden"), NIL, NIL, NIL, FIVE_INTEGER), list(makeString("bin"), reader_make_constant_shell("OsamaBinLaden"), NIL, NIL, NIL, SIX_INTEGER), list(makeString(" "), reader_make_constant_shell("OsamaBinLaden"), NIL, NIL, NIL, NINE_INTEGER), list(makeString("Laden"), reader_make_constant_shell("OsamaBinLaden"), NIL, NIL, makeString("</a>"), TEN_INTEGER))), reader_make_constant_shell("OsamaBinLaden")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("belonging"), list(list(makeString("belonging"), reader_make_constant_shell("possesses"), NIL, makeString("<a href=\"cg?CB-CF&17858\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("possesses")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("sighting"), list(list(makeString("sighting"), reader_make_constant_shell("Sighting"), NIL, makeString("<a href=\"cg?CB-CF&123172\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("Sighting")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("Afghanistan"), list(list(makeString("Afghanistan"), reader_make_constant_shell("Afghanistan"), NIL, makeString("<a href=\"cg?CB-CF&2761\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("Afghanistan")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("Mohamed Atta"), list(list(makeString("Mohamed"), reader_make_constant_shell("MohamedAtta"), NIL, makeString("<a href=\"cg?CB-CF&94907\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("MohamedAtta"), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString("Atta"), reader_make_constant_shell("MohamedAtta"), NIL, NIL, makeString("</a>"), EIGHT_INTEGER))), reader_make_constant_shell("MohamedAtta")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("visit"), list(list(makeString("visit"), reader_make_constant_shell("VisitingSomeone"), NIL, makeString("<a href=\"cg?CB-CF&5536\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("VisitingSomeone")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("sight"), list(list(makeString("sight"), reader_make_constant_shell("sees"), NIL, makeString("<a href=\"cg?CB-CF&5242\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("sees")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("meeting event"), list(list(makeString("meeting"), reader_make_constant_shell("MeetingSomeone"), NIL, makeString("<a href=\"cg?CB-CF&21509\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("MeetingSomeone"), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString("event"), reader_make_constant_shell("MeetingSomeone"), NIL, NIL, makeString("</a>"), EIGHT_INTEGER))), reader_make_constant_shell("MeetingSomeone")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("visual perception"), list(list(makeString("visual"), reader_make_constant_shell("VisualPerception"), NIL, makeString("<a href=\"cg?CB-CF&5427\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("VisualPerception"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("perception"), reader_make_constant_shell("VisualPerception"), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell("VisualPerception")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York"), list(list(makeString("New"), reader_make_constant_shell("NewYork-State"), NIL, makeString("<a href=\"cg?CB-CF&503\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("NewYork-State"), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell("NewYork-State"), NIL, NIL, makeString("</a>"), FOUR_INTEGER))), reader_make_constant_shell("NewYork-State")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York City, NY"), list(list(makeString("New"), reader_make_constant_shell("CityOfNewYorkNY"), NIL, makeString("<a href=\"cg?CB-CF&2405\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, FOUR_INTEGER), list(makeString(" "), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, EIGHT_INTEGER), list(makeString("City,"), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, NINE_INTEGER), list(makeString(" "), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, NIL, FOURTEEN_INTEGER), list(makeString("NY"), reader_make_constant_shell("CityOfNewYorkNY"), NIL, NIL, makeString("</a>"), FIFTEEN_INTEGER))), reader_make_constant_shell("CityOfNewYorkNY")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("New York"), list(list(makeString("New"), reader_make_constant_shell("NewYork-Colony"), NIL, makeString("<a href=\"cg?CB-CF&166826\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("NewYork-Colony"), NIL, NIL, NIL, THREE_INTEGER), list(makeString("York"), reader_make_constant_shell("NewYork-Colony"), NIL, NIL, makeString("</a>"), FOUR_INTEGER))), reader_make_constant_shell("NewYork-Colony")), makeString("Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York"), ONE_INTEGER, ONE_INTEGER) })), list(list(makeString("George Washington likes to eat apples")), list(list(list(list(makeString("George Washington"), list(list(makeString("George"), reader_make_constant_shell("GeorgeWashington"), NIL, makeString("<a href=\"cg?CB-CF&14961\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashington"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell("GeorgeWashington"), NIL, NIL, makeString("</a>"), SEVEN_INTEGER))), reader_make_constant_shell("GeorgeWashington")), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("George Washington University"), list(list(makeString("George"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, makeString("<a href=\"cg?CB-CF&67586\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SIX_INTEGER), list(makeString("Washington"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, NIL, SEVENTEEN_INTEGER), list(makeString("University"), reader_make_constant_shell("GeorgeWashingtonUniversity"), NIL, NIL, makeString("</a>"), EIGHTEEN_INTEGER))), reader_make_constant_shell("GeorgeWashingtonUniversity")), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("liking"), list(list(makeString("liking"), list(reader_make_constant_shell("ExperiencingEmotionFn"), reader_make_constant_shell("Like")), NIL, makeString("<a href=\"cg?CB-CF&-119393\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), list(reader_make_constant_shell("ExperiencingEmotionFn"), reader_make_constant_shell("Like"))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("liking"), list(list(makeString("liking"), reader_make_constant_shell("likes-Generic"), NIL, makeString("<a href=\"cg?CB-CF&83363\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("likes-Generic")), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("eating"), list(list(makeString("eating"), reader_make_constant_shell("EatingEvent"), NIL, makeString("<a href=\"cg?CB-CF&293\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), reader_make_constant_shell("EatingEvent")), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER), list(list(list(makeString("apple"), list(list(makeString("apple"), list(reader_make_constant_shell("FruitFn"), reader_make_constant_shell("AppleTree")), NIL, makeString("<a href=\"cg?CB-CF&-3414\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER))), list(reader_make_constant_shell("FruitFn"), reader_make_constant_shell("AppleTree"))), makeString("George Washington likes to eat apples"), ONE_INTEGER, ONE_INTEGER))));
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeKeyword("CYC-SEMANTIC"), makeString("Cyc Semantic Search"), makeSymbol("CYC-SEMANTIC-INDEX-SERVER-ALIVE?"), makeSymbol("CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("CYC-SEMANTIC-SEARCH-WRAPPER"), makeSymbol("CYC-SEMANTIC-COUNT-WRAPPER"), NIL), list(makeKeyword("YAHOO"), makeString("Yahoo!"), makeSymbol("YAHOO-AVAILABLE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("YAHOO-SEARCH"), makeSymbol("YAHOO-COUNT"), makeSymbol("YAHOO-SEARCH-URL")), list(makeKeyword("GOOGLE"), makeString("Google"), makeSymbol("GET-GOOGLE-KEY"), makeSymbol("GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("GOOGLE-SEARCH-WRAPPER"), makeSymbol("GOOGLE-COUNT"), makeSymbol("GOOGLE-SEARCH-URL")), list(makeKeyword("LUCENE"), makeString("Lucene"), makeSymbol("WS-INDEX-SERVER-ALIVE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("LUCENE-SEARCH-WRAPPER"), makeSymbol("LUCENE-COUNT-WRAPPER"), NIL));

    static private final SubLList $list_alt1 = list(list(makeKeyword("YAHOO"), makeString("Yahoo!"), makeSymbol("YAHOO-AVAILABLE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("YAHOO-SEARCH"), makeSymbol("YAHOO-COUNT"), makeSymbol("YAHOO-SEARCH-URL")), list(makeKeyword("GOOGLE"), makeString("Google"), makeSymbol("GET-GOOGLE-KEY"), makeSymbol("GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("GOOGLE-SEARCH-WRAPPER"), makeSymbol("GOOGLE-COUNT"), makeSymbol("GOOGLE-SEARCH-URL")), list(makeKeyword("LUCENE"), makeString("Lucene"), makeSymbol("WS-INDEX-SERVER-ALIVE?"), makeSymbol("GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("LUCENE-SEARCH-WRAPPER"), makeSymbol("LUCENE-COUNT-WRAPPER"), NIL), list(makeKeyword("CYC-SEMANTIC"), makeString("Cyc Semantic Search"), makeSymbol("CYC-SEMANTIC-INDEX-SERVER-ALIVE?"), makeSymbol("CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE"), makeSymbol("CYC-SEMANTIC-SEARCH-WRAPPER"), makeSymbol("CYC-SEMANTIC-COUNT-WRAPPER"), NIL));

    static private final SubLList $list_alt4 = list(makeSymbol("SYMBOL"), makeSymbol("DESCRIPTION"), makeSymbol("AVAILABLE?"), makeSymbol("STRING-FUNCTION"), makeSymbol("SEARCH-FUNCTION"), makeSymbol("COUNT-FUNCTION"), makeSymbol("SEARCH-URL-FUNC"));

    static private final SubLString $str_alt12$_ = makeString(" ");

    static private final SubLString $str_alt19$Cannot_retrieve_a_search_url_beca = makeString("Cannot retrieve a search url because ~A does not provide that capability.");

    static private final SubLString $str_alt22$Server_error_ = makeString("Server error.");

    static private final SubLString $str_alt24$Error_ = makeString("Error.");

    static private final SubLString $str_alt28$0_0_q__0 = makeString("0#0#q\\^0");

    static private final SubLString $str_alt31$cycTermID____0_9____ = makeString("cycTermID=\"([0-9]+)\"");

    static private final SubLString $str_alt32$justification____a_zA_Z_0_9____ = makeString("justification=\"([a-zA-Z 0-9]+)\"");

    static private final SubLString $str_alt33$_span2_type__tooltip__id__ = makeString("<span2 type=\"tooltip\" id=\"");

    static private final SubLString $str_alt34$___strong_ = makeString("\"><strong>");

    static private final SubLString $str_alt35$_span_______ = makeString("<span [^>]+>");

    static private final SubLString $str_alt36$__span_ = makeString("</span>");

    static private final SubLString $str_alt37$__strong___span2_ = makeString("</strong></span2>");

    static private final SubLString $str_alt38$Cyc_Semantic_Search_was_unable_to = makeString("Cyc Semantic Search was unable to perform the search.");

    static private final SubLString $str_alt40$_html__font_color___005522___b_ = makeString("<html><font color=\"#005522\"><b>");

    static private final SubLString $str_alt42$__b___font___html_ = makeString("</b></font></html>");

    static private final SubLString $str_alt44$failed_to_replace_SPAN_tags___S__ = makeString("failed to replace SPAN tags: ~S~%");

    static private final SubLList $list_alt47 = list(list(makeSymbol("SET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt65$_nbsp_ = makeString("&nbsp;");

    static private final SubLString $str_alt73$failed_on__S____S__ = makeString("failed on ~S~% ~S~%");

    static private final SubLString $$$daves = makeString("daves");

    public static final SubLObject $list_alt82 = com.cyc.cycjava.cycl.document_search._constant_82_initializer();

    @Override
    public void declareFunctions() {
        declare_document_search_file();
    }

    @Override
    public void initializeVariables() {
        init_document_search_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_document_search_file();
    }

    static {
    }
}

/**
 * Total time: 462 ms
 */
