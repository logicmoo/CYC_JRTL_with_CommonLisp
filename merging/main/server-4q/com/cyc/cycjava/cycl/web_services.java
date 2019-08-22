/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort_from_non_id;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.html_macros.note_html_handler_function;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_sexpr;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_value;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.xml_utilities.$cycml_indent_level$;
import static com.cyc.cycjava.cycl.xml_utilities.$xml_indentation_amount$;
import static com.cyc.cycjava.cycl.xml_utilities.$xml_indentation_level$;
import static com.cyc.cycjava.cycl.xml_utilities.xml_end_tag_internal;
import static com.cyc.cycjava.cycl.xml_utilities.xml_start_tag_internal;
import static com.cyc.cycjava.cycl.xml_utilities.xml_terpri;
import static com.cyc.cycjava.cycl.xml_vars.$xml_stream$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_inference_monitors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WEB-SERVICES
 * source file: /cyc/top/cycl/web-services.lisp
 * created:     2019/07/03 17:38:52
 */
public final class web_services extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new web_services();

 public static final String myName = "com.cyc.cycjava.cycl.web_services";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $last_monitored_inference$ = makeSymbol("*LAST-MONITORED-INFERENCE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $filter_inference_visualizer_termsP$ = makeSymbol("*FILTER-INFERENCE-VISUALIZER-TERMS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $json_problem_label_max_length$ = makeSymbol("*JSON-PROBLEM-LABEL-MAX-LENGTH*");

    private static final SubLList $list0 = list(makeKeyword("INPUT-NAME"), makeString("query"));



    private static final SubLList $list2 = list(makeKeyword("INPUT-NAME"), makeString("mt"));

    private static final SubLString $$$var = makeString("var");

    private static final SubLString $str4$__xml_version__1_0__encoding__UTF = makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

    private static final SubLList $list5 = list(makeString("xmlns:xsi"), makeString("http://www.w3.org/2001/XMLSchema-instance"), makeString("xsi:schemaLocation"), makeString("http://ws.opencyc.org/xsd/LightWeightResultSet http://ws.opencyc.org/xsd/LightWeightResultSet.xsd"), makeString("xmlns:concepts"), makeString("http://ws.opencyc.org/xsd/CycConcepts"), makeString("xmlns"), makeString("http://ws.opencyc.org/xsd/LightWeightResultSet"));

    private static final SubLString $$$ResultSet = makeString("ResultSet");

    private static final SubLString $$$Term = makeString("Term");

    private static final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol $sym10$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol XML_QUERY_VARIABLE = makeSymbol("XML-QUERY-VARIABLE");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLString $$$root = makeString("root");

    private static final SubLSymbol XML_GET_GENLS_FROM_STRING = makeSymbol("XML-GET-GENLS-FROM-STRING");

    private static final SubLString $$$term = makeString("term");

    private static final SubLSymbol GET_NL_INTERP_CYCL = makeSymbol("GET-NL-INTERP-CYCL");

    private static final SubLSymbol XML_GET_GENLS_FROM_STRING_INT = makeSymbol("XML-GET-GENLS-FROM-STRING-INT");

    private static final SubLSymbol XML_GET_GENLS = makeSymbol("XML-GET-GENLS");

    private static final SubLString $$$mt = makeString("mt");

    private static final SubLString $str21$__InferencePSC = makeString("#$InferencePSC");

    private static final SubLString $$$limit = makeString("limit");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $str24$nl_generation = makeString("nl-generation");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $$$cycml = makeString("cycml");

    private static final SubLString $$$genl = makeString("genl");

    private static final SubLSymbol XML_GET_GENLS_INT = makeSymbol("XML-GET-GENLS-INT");

    private static final SubLString $$$generation = makeString("generation");

    private static final SubLString $str30$_S = makeString("~S");

    private static final SubLSymbol XML_GET_UPWARDS_CLOSURE_FROM_STRING = makeSymbol("XML-GET-UPWARDS-CLOSURE-FROM-STRING");

    private static final SubLSymbol XML_GET_UPWARDS_CLOSURE = makeSymbol("XML-GET-UPWARDS-CLOSURE");

    private static final SubLSymbol XML_GET_ISAS_FROM_STRING = makeSymbol("XML-GET-ISAS-FROM-STRING");

    private static final SubLSymbol XML_GET_ISAS_FROM_STRING_INT = makeSymbol("XML-GET-ISAS-FROM-STRING-INT");

    private static final SubLSymbol XML_GET_ISAS = makeSymbol("XML-GET-ISAS");

    private static final SubLString $$$isa = makeString("isa");

    private static final SubLSymbol XML_GET_ISAS_INT = makeSymbol("XML-GET-ISAS-INT");

    private static final SubLSymbol XML_GET_GENERATION = makeSymbol("XML-GET-GENERATION");

    private static final SubLList $list39 = list(makeSymbol("CONTROL-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol $html_stream$ = makeSymbol("*HTML-STREAM*");

    private static final SubLString $$$mode = makeString("mode");

    private static final SubLString $$$problemStoreId = makeString("problemStoreId");

    private static final SubLString $$$inferenceId = makeString("inferenceId");

    private static final SubLString $$$tickNumber = makeString("tickNumber");

    private static final SubLString $$$dataType = makeString("dataType");

    private static final SubLString $$$language = makeString("language");

    private static final SubLList $list50 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

    private static final SubLString $str52$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str53$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $str54$ERROR__Could_not_find_inference_f = makeString("ERROR: Could not find inference for problemStoreId ~S inferenceId ~S");

    private static final SubLSymbol $LATEST_PROBLEM_STORE = makeKeyword("LATEST-PROBLEM-STORE");

    private static final SubLString $str56$Now_monitoring__S___at_tick__A = makeString("Now monitoring ~S~% at tick ~A");

    private static final SubLString $str57$Input_tick_number___S = makeString("Input tick number: ~S");

    private static final SubLString $str58$Getting_data_for_tick_number__S = makeString("Getting data for tick number ~S");

    private static final SubLString $str59$nlLabel___ = makeString("nlLabel=~%");

    private static final SubLString $str60$stepCount_0__ = makeString("stepCount=0~%");

    private static final SubLString $str61$problemCount_0__ = makeString("problemCount=0~%");

    private static final SubLString $str62$assertionTouchCount_0__ = makeString("assertionTouchCount=0~%");

    private static final SubLString $str63$termTouchCount_0__ = makeString("termTouchCount=0~%");

    private static final SubLString $str64$maxTick__A__ = makeString("maxTick=~A~%");

    private static final SubLSymbol CB_INFERENCE_TICK_DATA = makeSymbol("CB-INFERENCE-TICK-DATA");

    private static final SubLSymbol NOTIFY_GETTING_TICK_DATA = makeSymbol("NOTIFY-GETTING-TICK-DATA");

    private static final SubLString $str67$__Getting_tick_data___ = makeString("~&Getting tick data.~%");

    private static final SubLSymbol $notify_getting_tick_data_caching_state$ = makeSymbol("*NOTIFY-GETTING-TICK-DATA-CACHING-STATE*");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $ASSERTION_TOUCH_COUNT = makeKeyword("ASSERTION-TOUCH-COUNT");

    private static final SubLSymbol $TERM_TOUCH_COUNT = makeKeyword("TERM-TOUCH-COUNT");

    private static final SubLSymbol $LAST_ASSERTION_TOUCHED = makeKeyword("LAST-ASSERTION-TOUCHED");

    private static final SubLSymbol $LAST_TERM_TOUCHED = makeKeyword("LAST-TERM-TOUCHED");

    private static final SubLString $str79$__Tick_count___S__from_tick_numbe = makeString("~&Tick count: ~S (from tick number ~S)~%");

    private static final SubLString $str80$No_problem_count_for__S_at__A = makeString("No problem count for ~S at ~A");

    private static final SubLString $str81$tickCount__A__ = makeString("tickCount=~A~%");

    private static final SubLString $str82$inferenceStatus__A__ = makeString("inferenceStatus=~A~%");

    private static final SubLString $str83$stepCount__A__ = makeString("stepCount=~A~%");

    private static final SubLString $str84$problemCount__A__ = makeString("problemCount=~A~%");

    private static final SubLString $str85$assertionTouchCount__A__ = makeString("assertionTouchCount=~A~%");

    private static final SubLString $str86$termTouchCount__A__ = makeString("termTouchCount=~A~%");

    private static final SubLString $str87$inferenceId__A__ = makeString("inferenceId=~A~%");

    private static final SubLString $str88$problemStoreId__A__ = makeString("problemStoreId=~A~%");

    private static final SubLString $str89$nlLabel__A__ = makeString("nlLabel=~A~%");

    private static final SubLString $$$problem = makeString("problem");

    private static final SubLString $$$NIL = makeString("NIL");

    private static final SubLString $str92$problemQueryFormula___A___ = makeString("problemQueryFormula=\"~A\"~%");

    private static final SubLString $$$assertion = makeString("assertion");

    private static final SubLString $str94$lastAssertionTouched___A___ = makeString("lastAssertionTouched=\"~A\"~%");

    private static final SubLString $str95$lastTermTouched___A___ = makeString("lastTermTouched=\"~A\"~%");

    private static final SubLString $str96$newProblemTerms___A___ = makeString("newProblemTerms=\"~A\"~%");

    private static final SubLString $str97$newAssertionTerms___A___ = makeString("newAssertionTerms=\"~A\"~%");

    private static final SubLSymbol INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED = makeSymbol("INFERENCE-PROGRESS-DATA-FOR-TICK-NUMBER-MEMOIZED");

    private static final SubLSymbol $sym99$INFERENCE_VISUALIZER_SHOW_TERM_ = makeSymbol("INFERENCE-VISUALIZER-SHOW-TERM?");

    private static final SubLSymbol IST_SENTENCE_P = makeSymbol("IST-SENTENCE-P");



    private static final SubLString $$$english = makeString("english");

    private static final SubLSymbol INFERENCE_VISUALIZER_TERM_GENERALITY = makeSymbol("INFERENCE-VISUALIZER-TERM-GENERALITY");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLInteger $int$950 = makeInteger(950);

    private static final SubLInteger $int$900 = makeInteger(900);

    private static final SubLInteger $int$800 = makeInteger(800);

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol $inference_visualizer_term_generality_caching_state$ = makeSymbol("*INFERENCE-VISUALIZER-TERM-GENERALITY-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLString $$$error = makeString("error");

    private static final SubLString $str115$ERROR__Could_not_find_inference_H = makeString("ERROR: Could not find inference HL module times for problemStoreId ~S inferenceId ~S");

    private static final SubLSymbol $sym116$_ = makeSymbol("+");

    private static final SubLString $$$summary = makeString("summary");

    private static final SubLString $$$totalTime = makeString("totalTime");

    private static final SubLString $str119$_d = makeString("~d");

    private static final SubLString $$$modulesTime = makeString("modulesTime");

    private static final SubLSymbol INFERENCE_HARNESS_OVERHEAD = makeSymbol("INFERENCE-HARNESS-OVERHEAD");

    private static final SubLString $$$modulesData = makeString("modulesData");

    private static final SubLString $$$module = makeString("module");

    private static final SubLString $$$percentTime = makeString("percentTime");

    private static final SubLString $str126$__4f_ = makeString("~,4f%");

    private static final SubLSymbol NEGATIVE_NUMBER_P = makeSymbol("NEGATIVE-NUMBER-P");

    private static final SubLString $$$recursiveTime = makeString("recursiveTime");

    private static final SubLString $$$count = makeString("count");

    private static final SubLString $$$maxTime = makeString("maxTime");

    private static final SubLString $$$medianTime = makeString("medianTime");

    private static final SubLString $$$meanTime = makeString("meanTime");

    private static final SubLSymbol $sym135$_ = makeSymbol(">");

    private static final SubLSymbol XML_GET_INFERENCE_HL_MODULE_TIMES = makeSymbol("XML-GET-INFERENCE-HL-MODULE-TIMES");

    private static final SubLString $$$startTickNumber = makeString("startTickNumber");

    private static final SubLString $$$endTickNumber = makeString("endTickNumber");

    private static final SubLString $str142$_A = makeString("~A");

    private static final SubLString $str143$Caught_error_getting_link_info_fo = makeString("Caught error getting link info for ~S~%~A");

    private static final SubLSymbol CB_INFERENCE_LINK_INFO = makeSymbol("CB-INFERENCE-LINK-INFO");

    private static final SubLSymbol PROBLEM_STORE_LINK_ID_MAP_JSON_STRING = makeSymbol("PROBLEM-STORE-LINK-ID-MAP-JSON-STRING");

    private static final SubLSymbol $problem_store_link_id_map_json_string_caching_state$ = makeSymbol("*PROBLEM-STORE-LINK-ID-MAP-JSON-STRING-CACHING-STATE*");

    private static final SubLString $str148$_ = makeString("{");

    private static final SubLString $str150$_ = makeString(",");

    private static final SubLString $str151$__ = makeString(": ");

    private static final SubLString $$$links = makeString("links");

    private static final SubLString $str153$_ = makeString("[");

    private static final SubLList $list154 = cons(makeUninternedSymbol("KEY"), makeSymbol("DATA"));

    private static final SubLList $list155 = list(makeSymbol("PARENT-ID"), makeSymbol("&REST"), makeSymbol("CHILDREN-IDS"));

    private static final SubLString $str157$_ = makeString("]");

    private static final SubLString $$$problems = makeString("problems");

    private static final SubLString $str159$_ = makeString("}");

    private static final SubLSymbol $sym160$LINK_ID_MAP_ENTRY__ = makeSymbol("LINK-ID-MAP-ENTRY-<");

    private static final SubLString $str161$Partial_map___S = makeString("Partial map: ~S");

    private static final SubLList $list162 = cons(makeUninternedSymbol("KEY"), makeSymbol("ITEM"));

    private static final SubLList $list163 = cons(makeSymbol("PARENT-ID"), makeSymbol("CHILD-IDS"));

    private static final SubLString $str164$Unseen_parent__D_in__S_for__S_to_ = makeString("Unseen parent ~D in ~S for ~S to ~S");

    private static final SubLString $str165$Can_t_get_link_ID_map_from_null_i = makeString("Can't get link ID map from null inference.");

    private static final SubLString $str166$Getting_links_from__S_up_to_probl = makeString("Getting links from ~S up to problem ~S");

    private static final SubLList $list167 = cons(makeSymbol("LINK-ID"), makeSymbol("LINK-DATA"));

    private static final SubLSymbol $sym168$__ = makeSymbol(">=");

    private static final SubLSymbol $sym169$_ = makeSymbol("<");

    private static final SubLString $$$pp = makeString("pp");

    private static final SubLString $$$cp = makeString("cp");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$status = makeString("status");

    private static final SubLString $$$label = makeString("label");

    private static final SubLString $str175$ = makeString("");

    private static final SubLString $$$_ = makeString(" ");

    public static SubLObject xml_query_variable(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject query = cb_form_widgets.cb_extract_el_sentence_input(args, $list0);
            final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, $$InferencePSC, $list2);
            SubLObject variable = html_extract_sexpr($$$var, args, UNPROVIDED);
            final SubLObject free_vars = (NIL != variable) ? NIL : obsolete.formula_free_variables(query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject results = NIL;
            if (NIL == variable) {
                variable = free_vars.first();
            }
            results = ask_utilities.query_variable(variable, query, mt, UNPROVIDED);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            final SubLObject attrs = $list5;
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$ResultSet, attrs, NIL, T, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        SubLObject cdolist_list_var = results;
                        SubLObject result = NIL;
                        result = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$Term, list($$$cycl, result), T, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            result = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$ResultSet);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
            return NIL;
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
    }

    // Definitions
    public static final SubLObject xml_get_genls_from_string_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                try {
                    $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject _prev_bind_0_1 = $xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                        try {
                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_start_tag_internal($$$root, NIL, NIL);
                            com.cyc.cycjava.cycl.web_services.xml_get_genls_from_string_int(args);
                        } finally {
                            $cycml_indent_level$.rebind(_prev_bind_1, thread);
                            $xml_indentation_level$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                    xml_terpri();
                    xml_end_tag_internal($$$root);
                } finally {
                    $xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    // Definitions
    public static SubLObject xml_get_genls_from_string(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$root, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_get_genls_from_string_int(args);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$root);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject xml_get_genls_from_string_int_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
            SubLObject terms = NIL;
            terms = Mapping.mapcar(GET_NL_INTERP_CYCL, nl_parsing_api.string_phrasal_meanings(term_string, UNPROVIDED));
            {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    {
                        SubLObject new_args = cons(list($$$term, com.cyc.cycjava.cycl.web_services.term_display_string(v_term)), remove(list($$$term, web_utilities.html_url_encode(term_string, UNPROVIDED)), args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        com.cyc.cycjava.cycl.web_services.xml_get_genls_int(new_args);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_get_genls_from_string_int(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
        SubLObject terms = NIL;
        SubLObject cdolist_list_var;
        terms = cdolist_list_var = Mapping.mapcar(GET_NL_INTERP_CYCL, nl_parsing_api.string_phrasal_meanings(term_string, UNPROVIDED));
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_args = cons(list($$$term, term_display_string(v_term)), remove(list($$$term, web_utilities.html_url_encode(term_string, UNPROVIDED)), args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            xml_get_genls_int(new_args);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject xml_get_genls_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                try {
                    $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject _prev_bind_0_2 = $xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                        try {
                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_start_tag_internal($$$root, NIL, NIL);
                            com.cyc.cycjava.cycl.web_services.xml_get_genls_int(args);
                        } finally {
                            $cycml_indent_level$.rebind(_prev_bind_1, thread);
                            $xml_indentation_level$.rebind(_prev_bind_0_2, thread);
                        }
                    }
                    xml_terpri();
                    xml_end_tag_internal($$$root);
                } finally {
                    $xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_get_genls(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$root, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_get_genls_int(args);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$root);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject xml_get_genls_int_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
                SubLObject v_term = cb_guess_fort_from_non_id(term_string);
                SubLObject mt_string = html_extract_value($$$mt, args, $str_alt7$__InferencePSC);
                SubLObject mt = cb_guess_fort_from_non_id(mt_string);
                SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate(genls.all_genls(v_term, mt, UNPROVIDED), UNPROVIDED);
                SubLObject limit = read_from_string_ignoring_errors(html_extract_value($$$limit, args, $$$nil), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject generationP = read_from_string_ignoring_errors(html_extract_value($str_alt10$nl_generation, args, $$$nil), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pph_params = com.cyc.cycjava.cycl.web_services.pph_params_from_html_args(args);
                {
                    SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                    try {
                        $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                        {
                            SubLObject term_attrs = list($$$name, com.cyc.cycjava.cycl.web_services.term_display_string(v_term));
                            SubLObject current_term_count = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_3 = $xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                                try {
                                    $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                    $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_start_tag_internal($$$term, term_attrs, NIL);
                                    {
                                        SubLObject _prev_bind_0_4 = $xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1_5 = $cycml_indent_level$.currentBinding(thread);
                                        try {
                                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_start_tag_internal($$$cycml, NIL, NIL);
                                            cycml.cycml_serialize_term(v_term);
                                            com.cyc.cycjava.cycl.web_services.xml_possibly_serialize_generation(v_term, pph_params, generationP);
                                        } finally {
                                            $cycml_indent_level$.rebind(_prev_bind_1_5, thread);
                                            $xml_indentation_level$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    xml_terpri();
                                    xml_end_tag_internal($$$cycml);
                                    {
                                        SubLObject cdolist_list_var = v_genls;
                                        SubLObject genl = NIL;
                                        for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                            if ((NIL == limit) || current_term_count.numL(limit)) {
                                                {
                                                    SubLObject genl_name = com.cyc.cycjava.cycl.web_services.term_display_string(genl);
                                                    SubLObject attrs = list($$$name, genl_name);
                                                    {
                                                        SubLObject _prev_bind_0_6 = $xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_7 = $cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_start_tag_internal($$$genl, attrs, NIL);
                                                            {
                                                                SubLObject _prev_bind_0_8 = $xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_9 = $cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_start_tag_internal($$$cycml, NIL, NIL);
                                                                    cycml.cycml_serialize_term(genl);
                                                                    com.cyc.cycjava.cycl.web_services.xml_possibly_serialize_generation(genl, pph_params, generationP);
                                                                } finally {
                                                                    $cycml_indent_level$.rebind(_prev_bind_1_9, thread);
                                                                    $xml_indentation_level$.rebind(_prev_bind_0_8, thread);
                                                                }
                                                            }
                                                            xml_terpri();
                                                            xml_end_tag_internal($$$cycml);
                                                        } finally {
                                                            $cycml_indent_level$.rebind(_prev_bind_1_7, thread);
                                                            $xml_indentation_level$.rebind(_prev_bind_0_6, thread);
                                                        }
                                                    }
                                                    xml_terpri();
                                                    xml_end_tag_internal($$$genl);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $cycml_indent_level$.rebind(_prev_bind_1, thread);
                                    $xml_indentation_level$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                            xml_terpri();
                            xml_end_tag_internal($$$term);
                        }
                    } finally {
                        $xml_stream$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL;
            }
        }
    }

    public static SubLObject xml_get_genls_int(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
        final SubLObject v_term = cb_guess_fort_from_non_id(term_string);
        final SubLObject mt_string = html_extract_value($$$mt, args, $str21$__InferencePSC);
        final SubLObject mt = cb_guess_fort_from_non_id(mt_string);
        final SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate(genls.all_genls(v_term, mt, UNPROVIDED), UNPROVIDED);
        final SubLObject limit = read_from_string_ignoring_errors(html_extract_value($$$limit, args, $$$nil), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject generationP = read_from_string_ignoring_errors(html_extract_value($str24$nl_generation, args, $$$nil), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pph_params = pph_params_from_html_args(args);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject term_attrs = list($$$name, term_display_string(v_term));
            final SubLObject current_term_count = ZERO_INTEGER;
            try {
                final SubLObject _prev_bind_0_$13 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$term, term_attrs, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$cycml, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(v_term);
                                    xml_possibly_serialize_generation(v_term, pph_params, generationP);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$16, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$15, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$cycml);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                        SubLObject cdolist_list_var = v_genls;
                        SubLObject genl = NIL;
                        genl = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == limit) || current_term_count.numL(limit)) {
                                final SubLObject genl_name = term_display_string(genl);
                                final SubLObject attrs = list($$$name, genl_name);
                                try {
                                    final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$genl, attrs, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$cycml, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        cycml.cycml_serialize_term(genl);
                                                        xml_possibly_serialize_generation(genl, pph_params, generationP);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$cycml);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                                }
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$17, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$18, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$genl);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            genl = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$13, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$term);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject xml_possibly_serialize_generation_alt(SubLObject v_term, SubLObject pph_params, SubLObject do_somethingP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != do_somethingP) {
                {
                    SubLObject cdolist_list_var = nl_generation_api.cycl_term_to_nl_internal(v_term, pph_params);
                    SubLObject map = NIL;
                    for (map = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , map = cdolist_list_var.first()) {
                        {
                            SubLObject _prev_bind_0 = $xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                            try {
                                $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_start_tag_internal($$$generation, NIL, NIL);
                                format($xml_stream$.getDynamicValue(thread), $str_alt16$_S, nl_generation_api.pph_output_map_to_text_internal(map, NIL, ZERO_INTEGER, NIL, NIL));
                            } finally {
                                $cycml_indent_level$.rebind(_prev_bind_1, thread);
                                $xml_indentation_level$.rebind(_prev_bind_0, thread);
                            }
                        }
                        xml_terpri();
                        xml_end_tag_internal($$$generation);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_possibly_serialize_generation(final SubLObject v_term, final SubLObject pph_params, final SubLObject do_somethingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != do_somethingP) {
            SubLObject cdolist_list_var = nl_generation_api.cycl_term_to_nl_internal(v_term, pph_params);
            SubLObject map = NIL;
            map = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                try {
                    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$generation, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str30$_S, nl_generation_api.pph_output_map_to_text_internal(map, NIL, ZERO_INTEGER, NIL, NIL));
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$generation);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                map = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject xml_get_upwards_closure_from_string_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                try {
                    $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject _prev_bind_0_10 = $xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                        try {
                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_start_tag_internal($$$root, NIL, NIL);
                            com.cyc.cycjava.cycl.web_services.xml_get_genls_from_string_int(args);
                            com.cyc.cycjava.cycl.web_services.xml_get_isas_from_string_int(args);
                        } finally {
                            $cycml_indent_level$.rebind(_prev_bind_1, thread);
                            $xml_indentation_level$.rebind(_prev_bind_0_10, thread);
                        }
                    }
                    xml_terpri();
                    xml_end_tag_internal($$$root);
                } finally {
                    $xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_get_upwards_closure_from_string(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$root, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_get_genls_from_string_int(args);
                        xml_get_isas_from_string_int(args);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$29, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$root);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLString $str_alt7$__InferencePSC = makeString("#$InferencePSC");

    static private final SubLString $str_alt10$nl_generation = makeString("nl-generation");

    static private final SubLString $str_alt16$_S = makeString("~S");

    public static final SubLObject xml_get_upwards_closure_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                try {
                    $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject _prev_bind_0_11 = $xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                        try {
                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_start_tag_internal($$$root, NIL, NIL);
                            com.cyc.cycjava.cycl.web_services.xml_get_genls_int(args);
                            com.cyc.cycjava.cycl.web_services.xml_get_isas_int(args);
                        } finally {
                            $cycml_indent_level$.rebind(_prev_bind_1, thread);
                            $xml_indentation_level$.rebind(_prev_bind_0_11, thread);
                        }
                    }
                    xml_terpri();
                    xml_end_tag_internal($$$root);
                } finally {
                    $xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_get_upwards_closure(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$32 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$root, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_get_genls_int(args);
                        xml_get_isas_int(args);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$32, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$root);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject xml_get_isas_from_string_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                try {
                    $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject _prev_bind_0_12 = $xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                        try {
                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_start_tag_internal($$$root, NIL, NIL);
                            com.cyc.cycjava.cycl.web_services.xml_get_isas_from_string_int(args);
                        } finally {
                            $cycml_indent_level$.rebind(_prev_bind_1, thread);
                            $xml_indentation_level$.rebind(_prev_bind_0_12, thread);
                        }
                    }
                    xml_terpri();
                    xml_end_tag_internal($$$root);
                } finally {
                    $xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_get_isas_from_string(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$root, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_get_isas_from_string_int(args);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$35, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$root);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject xml_get_isas_from_string_int_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
            SubLObject terms = NIL;
            terms = Mapping.mapcar(GET_NL_INTERP_CYCL, nl_parsing_api.string_phrasal_meanings(term_string, UNPROVIDED));
            {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    {
                        SubLObject new_args = cons(list($$$term, com.cyc.cycjava.cycl.web_services.term_display_string(v_term)), remove(list($$$term, web_utilities.html_url_encode(term_string, UNPROVIDED)), args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        com.cyc.cycjava.cycl.web_services.xml_get_isas_int(new_args);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_get_isas_from_string_int(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
        SubLObject terms = NIL;
        SubLObject cdolist_list_var;
        terms = cdolist_list_var = Mapping.mapcar(GET_NL_INTERP_CYCL, nl_parsing_api.string_phrasal_meanings(term_string, UNPROVIDED));
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_args = cons(list($$$term, term_display_string(v_term)), remove(list($$$term, web_utilities.html_url_encode(term_string, UNPROVIDED)), args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            xml_get_isas_int(new_args);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject xml_get_isas_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                try {
                    $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject _prev_bind_0_13 = $xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                        try {
                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_start_tag_internal($$$root, NIL, NIL);
                            com.cyc.cycjava.cycl.web_services.xml_get_isas_int(args);
                        } finally {
                            $cycml_indent_level$.rebind(_prev_bind_1, thread);
                            $xml_indentation_level$.rebind(_prev_bind_0_13, thread);
                        }
                    }
                    xml_terpri();
                    xml_end_tag_internal($$$root);
                } finally {
                    $xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_get_isas(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            try {
                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$root, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_get_isas_int(args);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$root);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject xml_get_isas_int_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
                SubLObject v_term = cb_guess_fort_from_non_id(term_string);
                SubLObject mt_string = html_extract_value($$$mt, args, $str_alt7$__InferencePSC);
                SubLObject mt = cb_guess_fort_from_non_id(mt_string);
                SubLObject isas = cardinality_estimates.sort_by_generality_estimate(isa.all_isa(czer_main.canonicalize_term(v_term, UNPROVIDED), mt, UNPROVIDED), UNPROVIDED);
                SubLObject limit = read_from_string_ignoring_errors(html_extract_value($$$limit, args, $$$nil), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject generationP = read_from_string_ignoring_errors(html_extract_value($str_alt10$nl_generation, args, $$$nil), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pph_params = com.cyc.cycjava.cycl.web_services.pph_params_from_html_args(args);
                {
                    SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                    try {
                        $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                        {
                            SubLObject term_attrs = list($$$name, com.cyc.cycjava.cycl.web_services.term_display_string(v_term));
                            SubLObject current_count = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_14 = $xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                                try {
                                    $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                    $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_start_tag_internal($$$term, term_attrs, NIL);
                                    {
                                        SubLObject _prev_bind_0_15 = $xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1_16 = $cycml_indent_level$.currentBinding(thread);
                                        try {
                                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_start_tag_internal($$$cycml, NIL, NIL);
                                            cycml.cycml_serialize_term(v_term);
                                            com.cyc.cycjava.cycl.web_services.xml_possibly_serialize_generation(v_term, pph_params, generationP);
                                        } finally {
                                            $cycml_indent_level$.rebind(_prev_bind_1_16, thread);
                                            $xml_indentation_level$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                    xml_terpri();
                                    xml_end_tag_internal($$$cycml);
                                    {
                                        SubLObject cdolist_list_var = isas;
                                        SubLObject v_isa = NIL;
                                        for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                            if ((NIL == limit) || current_count.numL(limit)) {
                                                {
                                                    SubLObject isa_name = com.cyc.cycjava.cycl.web_services.term_display_string(v_isa);
                                                    SubLObject attrs = list($$$name, isa_name);
                                                    {
                                                        SubLObject _prev_bind_0_17 = $xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_18 = $cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_start_tag_internal($$$isa, attrs, NIL);
                                                            {
                                                                SubLObject _prev_bind_0_19 = $xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_20 = $cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_start_tag_internal($$$cycml, NIL, NIL);
                                                                    cycml.cycml_serialize_term(v_isa);
                                                                    com.cyc.cycjava.cycl.web_services.xml_possibly_serialize_generation(v_isa, pph_params, generationP);
                                                                } finally {
                                                                    $cycml_indent_level$.rebind(_prev_bind_1_20, thread);
                                                                    $xml_indentation_level$.rebind(_prev_bind_0_19, thread);
                                                                }
                                                            }
                                                            xml_terpri();
                                                            xml_end_tag_internal($$$cycml);
                                                        } finally {
                                                            $cycml_indent_level$.rebind(_prev_bind_1_18, thread);
                                                            $xml_indentation_level$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                    xml_terpri();
                                                    xml_end_tag_internal($$$isa);
                                                    current_count = add(current_count, ONE_INTEGER);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $cycml_indent_level$.rebind(_prev_bind_1, thread);
                                    $xml_indentation_level$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                            xml_terpri();
                            xml_end_tag_internal($$$term);
                        }
                    } finally {
                        $xml_stream$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL;
            }
        }
    }

    public static SubLObject xml_get_isas_int(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
        final SubLObject v_term = cb_guess_fort_from_non_id(term_string);
        final SubLObject mt_string = html_extract_value($$$mt, args, $str21$__InferencePSC);
        final SubLObject mt = cb_guess_fort_from_non_id(mt_string);
        final SubLObject isas = cardinality_estimates.sort_by_generality_estimate(isa.all_isa(czer_main.canonicalize_term(v_term, UNPROVIDED), mt, UNPROVIDED), UNPROVIDED);
        final SubLObject limit = read_from_string_ignoring_errors(html_extract_value($$$limit, args, $$$nil), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject generationP = read_from_string_ignoring_errors(html_extract_value($str24$nl_generation, args, $$$nil), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pph_params = pph_params_from_html_args(args);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject term_attrs = list($$$name, term_display_string(v_term));
            SubLObject current_count = ZERO_INTEGER;
            try {
                final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$term, term_attrs, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$43 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$44 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$cycml, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$44 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(v_term);
                                    xml_possibly_serialize_generation(v_term, pph_params, generationP);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$44, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$44, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$43, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$cycml);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                            }
                        }
                        SubLObject cdolist_list_var = isas;
                        SubLObject v_isa = NIL;
                        v_isa = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == limit) || current_count.numL(limit)) {
                                final SubLObject isa_name = term_display_string(v_isa);
                                final SubLObject attrs = list($$$name, isa_name);
                                try {
                                    final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$isa, attrs, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$48 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$46 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$cycml, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        cycml.cycml_serialize_term(v_isa);
                                                        xml_possibly_serialize_generation(v_isa, pph_params, generationP);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$49, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$46, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$48, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$cycml);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                                }
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$45, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$isa);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                                    }
                                }
                                current_count = add(current_count, ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            v_isa = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$term);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject xml_get_generation_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                try {
                    $xml_stream$.bind($html_stream$.getDynamicValue(thread), thread);
                    {
                        SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
                        SubLObject v_term = cb_guess_fort_from_non_id(term_string);
                        SubLObject params = com.cyc.cycjava.cycl.web_services.pph_params_from_html_args(args);
                        SubLObject generation_maps = nl_generation_api.cycl_term_to_nl_internal(v_term, params);
                        SubLObject term_name = com.cyc.cycjava.cycl.web_services.term_display_string(v_term);
                        SubLObject attrs = list($$$name, term_name);
                        {
                            SubLObject _prev_bind_0_21 = $xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                            try {
                                $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_start_tag_internal($$$term, attrs, NIL);
                                {
                                    SubLObject _prev_bind_0_22 = $xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_23 = $cycml_indent_level$.currentBinding(thread);
                                    try {
                                        $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                        $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_start_tag_internal($$$cycml, NIL, NIL);
                                        cycml.cycml_serialize_term(v_term);
                                        {
                                            SubLObject cdolist_list_var = generation_maps;
                                            SubLObject map = NIL;
                                            for (map = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , map = cdolist_list_var.first()) {
                                                {
                                                    SubLObject _prev_bind_0_24 = $xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_25 = $cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_start_tag_internal($$$generation, NIL, NIL);
                                                        format($xml_stream$.getDynamicValue(thread), $str_alt16$_S, nl_generation_api.pph_output_map_to_text_internal(map, NIL, ZERO_INTEGER, NIL, NIL));
                                                    } finally {
                                                        $cycml_indent_level$.rebind(_prev_bind_1_25, thread);
                                                        $xml_indentation_level$.rebind(_prev_bind_0_24, thread);
                                                    }
                                                }
                                                xml_terpri();
                                                xml_end_tag_internal($$$generation);
                                            }
                                        }
                                    } finally {
                                        $cycml_indent_level$.rebind(_prev_bind_1_23, thread);
                                        $xml_indentation_level$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                                xml_terpri();
                                xml_end_tag_internal($$$cycml);
                            } finally {
                                $cycml_indent_level$.rebind(_prev_bind_1, thread);
                                $xml_indentation_level$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        xml_terpri();
                        xml_end_tag_internal($$$term);
                    }
                } finally {
                    $xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject xml_get_generation(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject term_string = web_utilities.html_url_decode(html_extract_input($$$term, args));
            final SubLObject v_term = cb_guess_fort_from_non_id(term_string);
            final SubLObject params = pph_params_from_html_args(args);
            final SubLObject generation_maps = nl_generation_api.cycl_term_to_nl_internal(v_term, params);
            final SubLObject term_name = term_display_string(v_term);
            final SubLObject attrs = list($$$name, term_name);
            try {
                final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$term, attrs, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$58 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$59 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$cycml, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(v_term);
                                    SubLObject cdolist_list_var = generation_maps;
                                    SubLObject map = NIL;
                                    map = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        try {
                                            final SubLObject _prev_bind_0_$60 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$60 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$generation, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$61 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str30$_S, nl_generation_api.pph_output_map_to_text_internal(map, NIL, ZERO_INTEGER, NIL, NIL));
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$61, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$60, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$60, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$generation);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        map = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$59, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$58, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$cycml);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$57, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$56, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$term);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject pph_params_from_html_args_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject plist = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_parameter_declaration.pph_parameter_declarations()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject param_name = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject text_arg_value = html_extract_input(string_utilities.str(param_name), args);
                            if (NIL != text_arg_value) {
                                {
                                    SubLObject decoded_string_value = web_utilities.html_url_decode(text_arg_value);
                                    SubLObject fort_arg_value = cb_guess_fort_from_non_id(decoded_string_value);
                                    SubLObject arg_value = (NIL != fort_arg_value) ? ((SubLObject) (fort_arg_value)) : read_from_string_ignoring_errors(decoded_string_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL != arg_value) {
                                        plist = cons(arg_value, plist);
                                        plist = cons(param_name, plist);
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                result = nl_generation_api.new_pph_parameters(plist);
                return result;
            }
        }
    }

    public static SubLObject pph_params_from_html_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject plist = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_parameter_declaration.pph_parameter_declarations())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject param_name = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject text_arg_value = html_extract_input(string_utilities.str(param_name), args);
            if (NIL != text_arg_value) {
                final SubLObject decoded_string_value = web_utilities.html_url_decode(text_arg_value);
                final SubLObject fort_arg_value = cb_guess_fort_from_non_id(decoded_string_value);
                final SubLObject arg_value = (NIL != fort_arg_value) ? fort_arg_value : read_from_string_ignoring_errors(decoded_string_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != arg_value) {
                    plist = cons(arg_value, plist);
                    plist = cons(param_name, plist);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        result = nl_generation_api.new_pph_parameters(plist);
        return result;
    }

    public static final SubLObject term_display_string_alt(SubLObject v_term) {
        {
            SubLObject el_term = (NIL != forts.fort_p(v_term)) ? ((SubLObject) (cycl_utilities.hl_to_el(v_term))) : v_term;
            return string_utilities.string_remove_constant_reader_prefixes(string_utilities.to_lisp_string(cycl_utilities.hl_to_el(el_term)));
        }
    }

    public static SubLObject term_display_string(final SubLObject v_term) {
        final SubLObject el_term = (NIL != forts.fort_p(v_term)) ? cycl_utilities.hl_to_el(v_term) : v_term;
        return string_utilities.string_remove_constant_reader_prefixes(string_utilities.to_lisp_string(cycl_utilities.hl_to_el(el_term)));
    }

    public static SubLObject my_html_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject control_string = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        control_string = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PROGN, listS(FORMAT, $html_stream$, control_string, append(args, NIL)));
    }

    public static SubLObject reset_last_monitored_inference() {
        $last_monitored_inference$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject cb_inference_tick_data(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode_string = html_extract_input($$$mode, args);
        final SubLObject mode = (mode_string.isString()) ? read_from_string_ignoring_errors(mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject problem_store_id_string = html_extract_input($$$problemStoreId, args);
        final SubLObject problem_store_id = (problem_store_id_string.isString()) ? read_from_string_ignoring_errors(problem_store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject problem_store = (NIL != problem_store_id) ? inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id) : NIL;
        final SubLObject inference_id_string = html_extract_input($$$inferenceId, args);
        final SubLObject inference_id = (inference_id_string.isString()) ? read_from_string_ignoring_errors(inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject tick_number_string = html_extract_input($$$tickNumber, args);
        SubLObject tick_number;
        final SubLObject input_tick_number = tick_number = (tick_number_string.isString()) ? read_from_string_ignoring_errors(tick_number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject cycl_data_type = html_extract_input($$$dataType, args);
        final SubLObject language = html_extract_input($$$language, args);
        SubLObject inference = (problem_store_id.isInteger() && inference_id.isInteger()) ? inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id) : NIL;
        notify_getting_tick_data(UNPROVIDED);
        if (NIL == inference_datastructures_inference.inference_p(inference)) {
            thread.resetMultipleValues();
            final SubLObject inference_$67 = get_inference_from_mode(mode);
            final SubLObject problem_store_$68 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference = inference_$67;
            problem_store = problem_store_$68;
        }
        if ((NIL == inference_datastructures_inference.inference_p(inference)) && (NIL != problem_store)) {
            SubLObject max_id = MINUS_ONE_INTEGER;
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$69 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$69, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$69);
                    final SubLObject backwardP_var = NIL;
                    final SubLObject length = length(vector_var);
                    SubLObject current;
                    final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                    SubLObject start = NIL;
                    SubLObject end = NIL;
                    SubLObject delta = NIL;
                    destructuring_bind_must_consp(current, datum, $list50);
                    start = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list50);
                    end = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list50);
                    delta = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == inference) {
                            SubLObject end_var;
                            SubLObject id;
                            SubLObject one_inference;
                            for (end_var = end, id = NIL, id = start; (NIL == inference) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                one_inference = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(one_inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(one_inference)) {
                                        one_inference = $SKIP;
                                    }
                                    if ((NIL != tick_number) && (NIL != gethash(tick_number, inference_metrics.inference_tick_indexed_progress_data(one_inference), UNPROVIDED))) {
                                        inference = one_inference;
                                    } else
                                        if (inference_datastructures_inference.inference_suid(one_inference).numG(max_id)) {
                                            max_id = inference_datastructures_inference.inference_suid(one_inference);
                                        }

                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list50);
                    }
                }
                final SubLObject idx_$70 = idx;
                if ((NIL == id_index_sparse_objects_empty_p(idx_$70)) && (NIL == inference)) {
                    SubLObject catch_var = NIL;
                    try {
                        thread.throwStack.push($DO_HASH_TABLE);
                        final SubLObject cdohash_table = id_index_sparse_objects(idx_$70);
                        SubLObject id2 = NIL;
                        SubLObject one_inference2 = NIL;
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                id2 = getEntryKey(cdohash_entry);
                                one_inference2 = getEntryValue(cdohash_entry);
                                subl_macros.do_hash_table_done_check(inference);
                                if ((NIL != tick_number) && (NIL != gethash(tick_number, inference_metrics.inference_tick_indexed_progress_data(one_inference2), UNPROVIDED))) {
                                    inference = one_inference2;
                                } else {
                                    if (!inference_datastructures_inference.inference_suid(one_inference2).numG(max_id)) {
                                        continue;
                                    }
                                    max_id = inference_datastructures_inference.inference_suid(one_inference2);
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                    } finally {
                        thread.throwStack.pop();
                    }
                }
            }
            if ((NIL != subl_promotions.non_negative_integer_p(max_id)) && (NIL == inference)) {
                inference = inference_datastructures_problem_store.find_inference_by_id(problem_store, max_id);
            }
        }
        html_markup($str52$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str53$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_terpri(UNPROVIDED);
            if ((NIL == inference_datastructures_inference.inference_p(inference)) && (NIL != inference_id)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str54$ERROR__Could_not_find_inference_f, problem_store_id_string, inference_id_string);
            }
            if (NIL != problem_store) {
                final SubLObject max_tick = (mode.eql($LATEST_PROBLEM_STORE) || (NIL == string_utilities.digit_stringP(inference_id_string))) ? problem_store_total_tick_count(problem_store) : inference_metrics.inference_tick_count(inference);
                if (!tick_number.isInteger()) {
                    tick_number = max_tick;
                }
                if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                    tick_number = inference_metrics.inference_tick_count(inference);
                }
                if (!inference.eql($last_monitored_inference$.getGlobalValue())) {
                    cb_inference_monitors.inference_monitor_info($str56$Now_monitoring__S___at_tick__A, inference, tick_number, UNPROVIDED, UNPROVIDED);
                    $last_monitored_inference$.setGlobalValue(inference);
                }
                if (!input_tick_number.eql(tick_number)) {
                    cb_inference_monitors.inference_monitor_info($str57$Input_tick_number___S, input_tick_number, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_inference_monitors.inference_monitor_info($str58$Getting_data_for_tick_number__S, tick_number, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                html_output_tick_data(inference, tick_number, max_tick, cycl_data_type, language);
            } else {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str59$nlLabel___);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str60$stepCount_0__);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str61$problemCount_0__);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str62$assertionTouchCount_0__);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str63$termTouchCount_0__);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str64$maxTick__A__, tick_number);
            }
            html_terpri(UNPROVIDED);
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject clear_notify_getting_tick_data() {
        final SubLObject cs = $notify_getting_tick_data_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_notify_getting_tick_data(SubLObject id) {
        if (id == UNPROVIDED) {
            id = numeric_date_utilities.get_universal_second(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($notify_getting_tick_data_caching_state$.getGlobalValue(), list(id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject notify_getting_tick_data_internal(final SubLObject id) {
        cb_inference_monitors.inference_monitor_info($str67$__Getting_tick_data___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject notify_getting_tick_data(SubLObject id) {
        if (id == UNPROVIDED) {
            id = numeric_date_utilities.get_universal_second(UNPROVIDED);
        }
        SubLObject caching_state = $notify_getting_tick_data_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NOTIFY_GETTING_TICK_DATA, $notify_getting_tick_data_caching_state$, EIGHT_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(notify_getting_tick_data_internal(id)));
            memoization_state.caching_state_put(caching_state, id, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject html_output_tick_data(final SubLObject inference, final SubLObject tick_number, final SubLObject max_tick, final SubLObject cycl_data_type, final SubLObject language) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject data_list = inference_progress_data_for_tick_number(inference, tick_number);
                    final SubLObject inference_status = inference_datastructures_inference.inference_status(inference);
                    final SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
                    final SubLObject current;
                    final SubLObject datum = current = data_list;
                    final SubLObject tick_count_tail = property_list_member($TICK_COUNT, current);
                    final SubLObject tick_count = (NIL != tick_count_tail) ? cadr(tick_count_tail) : NIL;
                    final SubLObject problem_count_tail = property_list_member($PROBLEM_COUNT, current);
                    final SubLObject problem_count = (NIL != problem_count_tail) ? cadr(problem_count_tail) : NIL;
                    final SubLObject problem_tail = property_list_member($PROBLEM, current);
                    final SubLObject problem = (NIL != problem_tail) ? cadr(problem_tail) : NIL;
                    final SubLObject step_count_tail = property_list_member($STEP_COUNT, current);
                    final SubLObject step_count = (NIL != step_count_tail) ? cadr(step_count_tail) : NIL;
                    final SubLObject assertion_touch_count_tail = property_list_member($ASSERTION_TOUCH_COUNT, current);
                    final SubLObject assertion_touch_count = (NIL != assertion_touch_count_tail) ? cadr(assertion_touch_count_tail) : NIL;
                    final SubLObject term_touch_count_tail = property_list_member($TERM_TOUCH_COUNT, current);
                    final SubLObject term_touch_count = (NIL != term_touch_count_tail) ? cadr(term_touch_count_tail) : NIL;
                    final SubLObject last_assertion_touched_tail = property_list_member($LAST_ASSERTION_TOUCHED, current);
                    final SubLObject last_assertion_touched = (NIL != last_assertion_touched_tail) ? cadr(last_assertion_touched_tail) : NIL;
                    final SubLObject last_term_touched_tail = property_list_member($LAST_TERM_TOUCHED, current);
                    final SubLObject last_term_touched = (NIL != last_term_touched_tail) ? cadr(last_term_touched_tail) : NIL;
                    if (!tick_number.eql(tick_count)) {
                        cb_inference_monitors.inference_monitor_info($str79$__Tick_count___S__from_tick_numbe, tick_count, tick_number, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL == problem_count) {
                        cb_inference_monitors.inference_monitor_warn($str80$No_problem_count_for__S_at__A, inference, tick_number, UNPROVIDED, UNPROVIDED);
                    }
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str81$tickCount__A__, tick_count);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str64$maxTick__A__, max_tick);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str82$inferenceStatus__A__, inference_status);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str83$stepCount__A__, step_count);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str84$problemCount__A__, problem_count);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str85$assertionTouchCount__A__, assertion_touch_count);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str86$termTouchCount__A__, term_touch_count);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str87$inferenceId__A__, inference_datastructures_inference.inference_suid(inference));
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str88$problemStoreId__A__, inference_datastructures_problem_store.problem_store_suid(problem_store));
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str89$nlLabel__A__, string_utilities.char_subst(CHAR_space, CHAR_newline, cb_inference_monitors.inference_monitor_focal_object_html(inference, problem_store)));
                    if (cycl_data_type.equalp($$$problem)) {
                        SubLObject formula = $$$NIL;
                        if (NIL != inference_datastructures_problem.problem_p(problem)) {
                            for (formula = inference_datastructures_problem.problem_el_formula(problem); NIL != ist_sentence_p(formula, UNPROVIDED); formula = cycl_utilities.formula_arg2(formula, UNPROVIDED)) {
                            }
                        }
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str92$problemQueryFormula___A___, formula);
                    } else
                        if (cycl_data_type.equalp($$$assertion)) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str94$lastAssertionTouched___A___, NIL != assertion_handles.assertion_p(last_assertion_touched) ? uncanonicalizer.assertion_el_formula(last_assertion_touched) : $$$NIL);
                        } else
                            if (cycl_data_type.equalp($$$term)) {
                                final SubLObject v_term = last_term_touched;
                                if (NIL != inference_visualizer_show_termP(v_term)) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str95$lastTermTouched___A___, NIL != nart_handles.nart_p(v_term) ? narts_high.nart_el_formula(v_term) : NIL != constant_p(v_term) ? v_term : $$$NIL);
                                }
                            }


                    SubLObject this_tick_terms = problem_display_terms_from_tick_data(data_list);
                    SubLObject last_tick_terms = NIL;
                    SubLObject new_terms = set_difference(this_tick_terms, last_tick_terms, UNPROVIDED, UNPROVIDED);
                    if (NIL != new_terms) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str96$newProblemTerms___A___, encode_terms(new_terms, language));
                    }
                    this_tick_terms = assertion_display_terms_from_tick_data(data_list);
                    last_tick_terms = NIL;
                    new_terms = set_difference(this_tick_terms, last_tick_terms, UNPROVIDED, UNPROVIDED);
                    if (NIL != new_terms) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str97$newAssertionTerms___A___, encode_terms(new_terms, language));
                    }
                    html_terpri(UNPROVIDED);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject inference_progress_data_for_tick_number(final SubLObject inference, final SubLObject tick_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_inference.inference_problem_store(inference));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return inference_progress_data_for_tick_number_memoized(inference, tick_number);
            } finally {
                final SubLObject _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject inference_progress_data_for_tick_number_memoized_internal(final SubLObject inference, final SubLObject tick_number) {
        final SubLObject data = inference_metrics.inference_tick_indexed_progress_data(inference);
        SubLObject end_var;
        SubLObject i;
        SubLObject data_list;
        for (end_var = ZERO_INTEGER, i = NIL, i = tick_number; !i.numLE(end_var); i = add(i, MINUS_ONE_INTEGER)) {
            data_list = gethash(i, data, UNPROVIDED);
            if (NIL != data_list) {
                return data_list;
            }
        }
        return NIL;
    }

    public static SubLObject inference_progress_data_for_tick_number_memoized(final SubLObject inference, final SubLObject tick_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_progress_data_for_tick_number_memoized_internal(inference, tick_number);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(inference, tick_number);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (inference.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && tick_number.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_progress_data_for_tick_number_memoized_internal(inference, tick_number)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(inference, tick_number));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject problem_store_total_tick_count(final SubLObject problem_store) {
        SubLObject tick_count = ZERO_INTEGER;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$72 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$72, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$72);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        tick_count = add(tick_count, inference_metrics.inference_tick_count(inference));
                    }
                }
            }
            final SubLObject idx_$73 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$73)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$73);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        tick_count = add(tick_count, inference_metrics.inference_tick_count(inference2));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tick_count;
    }

    public static SubLObject problem_display_terms_from_tick_data(final SubLObject data_list) {
        SubLObject this_tick_terms = NIL;
        final SubLObject problem = getf(data_list, $PROBLEM, UNPROVIDED);
        if (NIL != problem) {
            this_tick_terms = problem_display_terms(problem);
        }
        return this_tick_terms;
    }

    public static SubLObject problem_display_terms(final SubLObject problem) {
        SubLObject terms = NIL;
        if (NIL != problem) {
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(problem_display_formula(problem), $sym99$INFERENCE_VISUALIZER_SHOW_TERM_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_visualizer_show_termP(v_term)) {
                    final SubLObject item_var = v_term;
                    if (NIL == member(item_var, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        terms = cons(item_var, terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return terms;
    }

    public static SubLObject problem_display_formula(final SubLObject problem) {
        return cycl_utilities.expression_transform(inference_datastructures_problem.problem_el_formula(problem), IST_SENTENCE_P, FORMULA_ARG2, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertion_display_terms_from_tick_data(final SubLObject data_list) {
        SubLObject this_tick_terms = NIL;
        final SubLObject assertion = getf(data_list, $LAST_ASSERTION_TOUCHED, UNPROVIDED);
        if (NIL != assertion) {
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(assertion, $sym99$INFERENCE_VISUALIZER_SHOW_TERM_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_visualizer_show_termP(v_term)) {
                    final SubLObject item_var = v_term;
                    if (NIL == member(item_var, this_tick_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        this_tick_terms = cons(item_var, this_tick_terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return this_tick_terms;
    }

    public static SubLObject inference_visualizer_show_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(v_term.isNumber() || ((NIL != constant_p(v_term)) && ((NIL == $filter_inference_visualizer_termsP$.getDynamicValue(thread)) || (NIL != thcl.thcl_fortP(v_term, UNPROVIDED)))));
    }

    public static SubLObject encode_terms(final SubLObject terms, final SubLObject language) {
        final SubLObject max = log(cardinality_estimates.generality_estimate($$Thing), UNPROVIDED);
        SubLObject annotated = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject paraphrase = (language.equalp($$$english) && (NIL != forts.fort_p(v_term))) ? nl_generation_fort_cache.nl_generation_cache_lookup(v_term, UNPROVIDED, UNPROVIDED) : NIL;
            if (NIL != paraphrase) {
                paraphrase = web_utilities.html_url_encode(cycl_string.cycl_string_to_utf8_string(paraphrase), UNPROVIDED);
            }
            annotated = cons(NIL != paraphrase ? paraphrase : v_term, annotated);
            annotated = cons(inference_visualizer_term_generality(v_term, max), annotated);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(annotated);
    }

    public static SubLObject clear_inference_visualizer_term_generality() {
        final SubLObject cs = $inference_visualizer_term_generality_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_inference_visualizer_term_generality(final SubLObject v_term, SubLObject max) {
        if (max == UNPROVIDED) {
            max = cardinality_estimates.generality_estimate($$Thing);
        }
        return memoization_state.caching_state_remove_function_results_with_args($inference_visualizer_term_generality_caching_state$.getGlobalValue(), list(v_term, max), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_visualizer_term_generality_internal(final SubLObject v_term, final SubLObject max) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject score;
        final SubLObject generality_estimate_based_score = score = add(random.random($int$50), floor(divide(multiply($int$950, log(number_utilities.f_1X(cardinality_estimates.generality_estimate(v_term)), UNPROVIDED)), max), UNPROVIDED));
        if (NIL != fort_types_interface.logical_connective_p(v_term)) {
            score = add(score, $int$900);
        } else
            if (NIL != fort_types_interface.quantifier_p(v_term)) {
                score = add(score, $int$900);
            } else
                if (NIL != fort_types_interface.functor_p(v_term)) {
                    score = add(score, $int$800);
                } else
                    if (NIL != fort_types_interface.predicate_p(v_term)) {
                        score = add(score, $int$600);
                    } else
                        if (NIL == $filter_inference_visualizer_termsP$.getDynamicValue(thread)) {
                            final SubLObject _prev_bind_0 = $filter_inference_visualizer_termsP$.currentBinding(thread);
                            try {
                                $filter_inference_visualizer_termsP$.bind(T, thread);
                                if (NIL == inference_visualizer_show_termP(v_term)) {
                                    score = add(score, $int$500);
                                }
                            } finally {
                                $filter_inference_visualizer_termsP$.rebind(_prev_bind_0, thread);
                            }
                        }




        return min($int$1000, score);
    }

    public static SubLObject inference_visualizer_term_generality(final SubLObject v_term, SubLObject max) {
        if (max == UNPROVIDED) {
            max = cardinality_estimates.generality_estimate($$Thing);
        }
        SubLObject caching_state = $inference_visualizer_term_generality_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(INFERENCE_VISUALIZER_TERM_GENERALITY, $inference_visualizer_term_generality_caching_state$, $int$128, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, max);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(inference_visualizer_term_generality_internal(v_term, max)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, max));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject xml_get_inference_hl_module_times(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store_id_string = html_extract_input($$$problemStoreId, args);
        final SubLObject problem_store_id = (problem_store_id_string.isString()) ? read_from_string_ignoring_errors(problem_store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject inference_id_string = html_extract_input($$$inferenceId, args);
        final SubLObject inference_id = (inference_id_string.isString()) ? read_from_string_ignoring_errors(inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject inference = (problem_store_id.isInteger() && inference_id.isInteger()) ? inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id) : NIL;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_markup($str4$__xml_version__1_0__encoding__UTF);
            xml_utilities.xml_terpri();
            if (NIL == inference_datastructures_inference.inference_p(inference)) {
                try {
                    final SubLObject _prev_bind_0_$74 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$75 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str54$ERROR__Could_not_find_inference_f, problem_store_id_string, inference_id_string);
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$75, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$74, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$error);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                    }
                }
                return NIL;
            }
            final SubLObject hl_module_times = hash_table_utilities.copy_hashtable(inference_metrics.inference_hl_module_times(inference), UNPROVIDED);
            if (!hl_module_times.isHashtable()) {
                try {
                    final SubLObject _prev_bind_0_$77 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$error, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$78 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str115$ERROR__Could_not_find_inference_H, problem_store_id_string, inference_id_string);
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$78, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$77, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$error);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                    }
                }
                return NIL;
            }
            SubLObject inference_total_time = inference_datastructures_inference.inference_cumulative_time_so_far(inference, NIL);
            SubLObject hl_modules_total_time_list = NIL;
            SubLObject hl_module = NIL;
            SubLObject times_list = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(hl_module_times);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    hl_module = getEntryKey(cdohash_entry);
                    times_list = getEntryValue(cdohash_entry);
                    hl_modules_total_time_list = cons(list(hl_module, apply($sym116$_, times_list)), hl_modules_total_time_list);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject total_hl_module_time = ZERO_INTEGER;
            SubLObject cdolist_list_var = hl_modules_total_time_list;
            SubLObject hl_modules_total_time = NIL;
            hl_modules_total_time = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                total_hl_module_time = add(total_hl_module_time, second(hl_modules_total_time));
                cdolist_list_var = cdolist_list_var.rest();
                hl_modules_total_time = cdolist_list_var.first();
            } 
            try {
                final SubLObject _prev_bind_0_$80 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$summary, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$81 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$82 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$83 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$totalTime, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$83 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str119$_d, truncate(multiply($int$1000, inference_total_time), UNPROVIDED));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$83, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$83, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$82, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$totalTime);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$85 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$84 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$modulesTime, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$86 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str119$_d, truncate(multiply($int$1000, total_hl_module_time), UNPROVIDED));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$86, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$84, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$85, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$modulesTime);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                            }
                        }
                        final SubLObject overhead_time = subtract(inference_total_time, total_hl_module_time);
                        if (overhead_time.numG(ZERO_INTEGER)) {
                            hl_modules_total_time_list = cons(list(INFERENCE_HARNESS_OVERHEAD, subtract(inference_total_time, total_hl_module_time)), hl_modules_total_time_list);
                            sethash(INFERENCE_HARNESS_OVERHEAD, hl_module_times, list(subtract(inference_total_time, total_hl_module_time)));
                        } else {
                            inference_total_time = total_hl_module_time;
                        }
                        try {
                            final SubLObject _prev_bind_0_$88 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$85 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$modulesData, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$89 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject cdolist_list_var2 = Sort.sort(copy_list(hl_modules_total_time_list), $sym135$_, SECOND);
                                    SubLObject hl_module_with_total_time = NIL;
                                    hl_module_with_total_time = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        final SubLObject hl_module2 = hl_module_with_total_time.first();
                                        final SubLObject total_time = second(hl_module_with_total_time);
                                        final SubLObject times_list2 = nreverse(copy_list(gethash(hl_module2, hl_module_times, UNPROVIDED)));
                                        SubLObject positive_times_list = list_utilities.find_all_if(POSITIVE_NUMBER_P, times_list2, UNPROVIDED);
                                        if (NIL == positive_times_list) {
                                            positive_times_list = list(ZERO_INTEGER);
                                        }
                                        try {
                                            final SubLObject _prev_bind_0_$90 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$86 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$module, list($$$name, NIL != inference_modules.hl_module_p(hl_module2) ? inference_modules.hl_module_name(hl_module2) : hl_module2), NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$91 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    try {
                                                        final SubLObject _prev_bind_0_$92 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$87 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$totalTime, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$93 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str119$_d, truncate(multiply($int$1000, total_time), UNPROVIDED));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$93, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$87, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$92, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values5 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$totalTime);
                                                            restoreValuesFromVector(_values5);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$88 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$percentTime, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str126$__4f_, multiply($int$100, divide(total_time, inference_total_time)));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$96, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$88, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$95, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values6 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$percentTime);
                                                            restoreValuesFromVector(_values6);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                                                        }
                                                    }
                                                    final SubLObject recursion_time = subtract(ZERO_INTEGER, apply($sym116$_, list_utilities.find_all_if(NEGATIVE_NUMBER_P, times_list2, UNPROVIDED)));
                                                    if (NIL != number_utilities.positive_number_p(recursion_time)) {
                                                        try {
                                                            final SubLObject _prev_bind_0_$98 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$89 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$recursiveTime, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$99 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str119$_d, truncate(multiply($int$1000, subtract(ZERO_INTEGER, apply($sym116$_, list_utilities.find_all_if(NEGATIVE_NUMBER_P, times_list2, UNPROVIDED)))), UNPROVIDED));
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$99, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$89, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$98, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values7 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$recursiveTime);
                                                                restoreValuesFromVector(_values7);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$90 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$count, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str119$_d, length(positive_times_list));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$102, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$90, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$101, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values8 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$count);
                                                            restoreValuesFromVector(_values8);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$104 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$91 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$maxTime, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$105 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str119$_d, truncate(multiply($int$1000, apply(MAX, times_list2)), UNPROVIDED));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$105, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$91, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$104, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values9 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$maxTime);
                                                            restoreValuesFromVector(_values9);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$107 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$medianTime, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$108 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str119$_d, truncate(multiply($int$1000, number_utilities.median(positive_times_list, UNPROVIDED, UNPROVIDED)), UNPROVIDED));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$108, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$92, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$107, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$109 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values10 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$medianTime);
                                                            restoreValuesFromVector(_values10);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject _prev_bind_0_$110 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$meanTime, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$111 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str119$_d, truncate(multiply($int$1000, number_utilities.mean(positive_times_list)), UNPROVIDED));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$93, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$110, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values11 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$meanTime);
                                                            restoreValuesFromVector(_values11);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                                                        }
                                                    }
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$91, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$86, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$90, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values12 = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$module);
                                                restoreValuesFromVector(_values12);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                            }
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        hl_module_with_total_time = cdolist_list_var2.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$89, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$85, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$88, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values13 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$modulesData);
                                restoreValuesFromVector(_values13);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$81, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_4, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$80, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$115 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values14 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$summary);
                    restoreValuesFromVector(_values14);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_inference_link_info(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = read_from_string_ignoring_errors(html_extract_input($$$mode, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject problem_store_id_string = html_extract_input($$$problemStoreId, args);
        final SubLObject problem_store_id = read_from_string_ignoring_errors(problem_store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject store = (problem_store_id.isInteger()) ? inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id) : NIL;
        final SubLObject inference_id_string = html_extract_input($$$inferenceId, args);
        final SubLObject inference_id = read_from_string_ignoring_errors(inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject inference = (problem_store_id.isInteger() && inference_id.isInteger()) ? inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id) : NIL;
        final SubLObject start_tick_number_string = html_extract_input($$$startTickNumber, args);
        SubLObject start_tick_number = (start_tick_number_string.isString()) ? read_from_string_ignoring_errors(start_tick_number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject end_tick_number_string = html_extract_input($$$endTickNumber, args);
        final SubLObject end_tick_number = (end_tick_number_string.isString()) ? read_from_string_ignoring_errors(end_tick_number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject err_msg = NIL;
        if (NIL == inference_datastructures_inference.inference_p(inference)) {
            thread.resetMultipleValues();
            final SubLObject inference_$127 = get_inference_from_mode(mode);
            final SubLObject store_$128 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference = inference_$127;
            store = store_$128;
            start_tick_number = ZERO_INTEGER;
        }
        html_markup($str52$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str53$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_terpri(UNPROVIDED);
            if (mode.eql($LATEST_INFERENCE)) {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$129 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str142$_A, problem_store_complete_link_id_map_json_string(store));
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$129, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } else
                if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$130 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str142$_A, problem_store_link_id_map_json_string(store, inference, start_tick_number, end_tick_number));
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$130, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                }

            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        if ((NIL != err_msg) && (NIL != inference_datastructures_inference.valid_inference_p(inference))) {
            cb_inference_monitors.inference_monitor_warn($str143$Caught_error_getting_link_info_fo, args, err_msg, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject get_inference_from_mode(final SubLObject mode) {
        SubLObject inference = NIL;
        SubLObject store = NIL;
        if (mode.eql($LATEST_INFERENCE)) {
            inference = cb_inference_monitors.latest_monitorable_inference();
            store = (NIL != inference) ? inference_datastructures_inference.inference_problem_store(inference) : NIL;
        } else
            if (mode.eql($LATEST_PROBLEM_STORE)) {
                store = cb_inference_monitors.latest_monitorable_problem_store();
                inference = (NIL != store) ? inference_datastructures_problem_store.find_inference_by_id(store, ZERO_INTEGER) : NIL;
            }

        return values(inference, store);
    }

    public static SubLObject clear_problem_store_link_id_map_json_string() {
        final SubLObject cs = $problem_store_link_id_map_json_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_problem_store_link_id_map_json_string(final SubLObject store, SubLObject inference, SubLObject start_tick, SubLObject end_tick) {
        if (inference == UNPROVIDED) {
            inference = inference_datastructures_problem_store.find_inference_by_id(store, ZERO_INTEGER);
        }
        if (start_tick == UNPROVIDED) {
            start_tick = ZERO_INTEGER;
        }
        if (end_tick == UNPROVIDED) {
            end_tick = (NIL != inference) ? inference_metrics.inference_tick_count(inference) : NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($problem_store_link_id_map_json_string_caching_state$.getGlobalValue(), list(store, inference, start_tick, end_tick), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject problem_store_link_id_map_json_string_internal(final SubLObject store, final SubLObject inference, final SubLObject start_tick, final SubLObject end_tick) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_json = NIL;
        final SubLObject _prev_bind_0 = json.$json_stream$.currentBinding(thread);
        try {
            json.$json_stream$.bind(NIL, thread);
            try {
                json.$json_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                json_serialize_problem_store_link_id_map(store, inference, start_tick, end_tick);
                v_json = get_output_stream_string(json.$json_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(json.$json_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                }
            }
        } finally {
            json.$json_stream$.rebind(_prev_bind_0, thread);
        }
        return v_json;
    }

    public static SubLObject problem_store_link_id_map_json_string(final SubLObject store, SubLObject inference, SubLObject start_tick, SubLObject end_tick) {
        if (inference == UNPROVIDED) {
            inference = inference_datastructures_problem_store.find_inference_by_id(store, ZERO_INTEGER);
        }
        if (start_tick == UNPROVIDED) {
            start_tick = ZERO_INTEGER;
        }
        if (end_tick == UNPROVIDED) {
            end_tick = (NIL != inference) ? inference_metrics.inference_tick_count(inference) : NIL;
        }
        SubLObject caching_state = $problem_store_link_id_map_json_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PROBLEM_STORE_LINK_ID_MAP_JSON_STRING, $problem_store_link_id_map_json_string_caching_state$, $int$256, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(store, inference, start_tick, end_tick);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (store.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (start_tick.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && end_tick.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(problem_store_link_id_map_json_string_internal(store, inference, start_tick, end_tick)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(store, inference, start_tick, end_tick));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject problem_store_complete_link_id_map_json_string(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_json = NIL;
        final SubLObject _prev_bind_0 = json.$json_stream$.currentBinding(thread);
        try {
            json.$json_stream$.bind(NIL, thread);
            try {
                json.$json_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                json_serialize_problem_store_complete_link_id_map(store);
                v_json = get_output_stream_string(json.$json_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$132 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(json.$json_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                }
            }
        } finally {
            json.$json_stream$.rebind(_prev_bind_0, thread);
        }
        return v_json;
    }

    public static SubLObject json_serialize_problem_store_link_id_map(final SubLObject store, SubLObject inference, SubLObject start_tick, SubLObject end_tick) {
        if (inference == UNPROVIDED) {
            inference = (NIL != store) ? inference_datastructures_problem_store.find_inference_by_id(store, ZERO_INTEGER) : NIL;
        }
        if (start_tick == UNPROVIDED) {
            start_tick = ZERO_INTEGER;
        }
        if (end_tick == UNPROVIDED) {
            end_tick = (NIL != inference) ? inference_metrics.inference_tick_count(inference) : NIL;
        }
        final SubLObject map = get_partial_problem_store_link_id_map(store, inference, start_tick, end_tick);
        json_serialize_problem_store_link_id_map_int(store, map);
        return store;
    }

    public static SubLObject json_serialize_problem_store_complete_link_id_map(final SubLObject store) {
        final SubLObject map = sort_partial_link_id_map(inference_utilities.problem_store_link_id_map(store, UNPROVIDED, UNPROVIDED));
        json_serialize_problem_store_link_id_map_int(store, map);
        return store;
    }

    public static SubLObject json_serialize_problem_store_link_id_map_int(final SubLObject store, final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problems = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject _prev_bind_0 = json.$json_object_startedP$.currentBinding(thread);
        try {
            json.$json_object_startedP$.bind(NIL, thread);
            json.json_princ($str148$_);
            final SubLObject _prev_bind_0_$133 = json.$json_indent_level$.currentBinding(thread);
            try {
                json.$json_indent_level$.bind(number_utilities.f_1X(json.$json_indent_level$.getDynamicValue(thread)), thread);
                assert NIL != stringp($$$problemStoreId) : "! stringp(web_services.$$$problemStoreId) " + ("Types.stringp(web_services.$str44$problemStoreId) " + "CommonSymbols.NIL != Types.stringp(web_services.$str44$problemStoreId) ") + $$$problemStoreId;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$problemStoreId);
                json.json_princ($str151$__);
                json.json_serialize_atom(inference_datastructures_problem_store.problem_store_suid(store), UNPROVIDED);
                json.$json_object_startedP$.setDynamicValue(T, thread);
                assert NIL != stringp($$$links) : "! stringp(web_services.$$$links) " + ("Types.stringp(web_services.$str152$links) " + "CommonSymbols.NIL != Types.stringp(web_services.$str152$links) ") + $$$links;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$links);
                json.json_princ($str151$__);
                final SubLObject _prev_bind_0_$134 = json.$json_sequence_startedP$.currentBinding(thread);
                try {
                    json.$json_sequence_startedP$.bind(NIL, thread);
                    json.json_princ($str153$_);
                    final SubLObject _prev_bind_0_$135 = json.$json_indent_level$.currentBinding(thread);
                    try {
                        json.$json_indent_level$.bind(number_utilities.f_1X(json.$json_indent_level$.getDynamicValue(thread)), thread);
                        SubLObject cdolist_list_var = map;
                        SubLObject cons = NIL;
                        cons = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = cons;
                            SubLObject key = NIL;
                            SubLObject data = NIL;
                            destructuring_bind_must_consp(current, datum, $list154);
                            key = current.first();
                            current = data = current.rest();
                            SubLObject current_$137;
                            final SubLObject datum_$136 = current_$137 = data;
                            SubLObject parent_id = NIL;
                            destructuring_bind_must_consp(current_$137, datum_$136, $list155);
                            parent_id = current_$137.first();
                            final SubLObject children_ids;
                            current_$137 = children_ids = current_$137.rest();
                            if (!$ROOT.eql(parent_id)) {
                                json_serialize_problem_store_link(store, parent_id, children_ids, problems);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            cons = cdolist_list_var.first();
                        } 
                        json.json_princ($str157$_);
                    } finally {
                        json.$json_indent_level$.rebind(_prev_bind_0_$135, thread);
                    }
                } finally {
                    json.$json_sequence_startedP$.rebind(_prev_bind_0_$134, thread);
                }
                json.$json_object_startedP$.setDynamicValue(T, thread);
                assert NIL != stringp($$$problems) : "! stringp(web_services.$$$problems) " + ("Types.stringp(web_services.$str158$problems) " + "CommonSymbols.NIL != Types.stringp(web_services.$str158$problems) ") + $$$problems;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$problems);
                json.json_princ($str151$__);
                final SubLObject _prev_bind_0_$136 = json.$json_sequence_startedP$.currentBinding(thread);
                try {
                    json.$json_sequence_startedP$.bind(NIL, thread);
                    json.json_princ($str153$_);
                    final SubLObject _prev_bind_0_$137 = json.$json_indent_level$.currentBinding(thread);
                    try {
                        json.$json_indent_level$.bind(number_utilities.f_1X(json.$json_indent_level$.getDynamicValue(thread)), thread);
                        final SubLObject set_contents_var = set.do_set_internal(problems);
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject problem;
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            problem = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, problem)) {
                                json_serialize_problem(problem);
                            }
                        }
                        json.json_princ($str157$_);
                    } finally {
                        json.$json_indent_level$.rebind(_prev_bind_0_$137, thread);
                    }
                } finally {
                    json.$json_sequence_startedP$.rebind(_prev_bind_0_$136, thread);
                }
                json.$json_object_startedP$.setDynamicValue(T, thread);
                json.json_princ($str159$_);
            } finally {
                json.$json_indent_level$.rebind(_prev_bind_0_$133, thread);
            }
        } finally {
            json.$json_object_startedP$.rebind(_prev_bind_0, thread);
        }
        return map;
    }

    public static SubLObject sort_partial_link_id_map(final SubLObject map) {
        return Sort.sort(map, $sym160$LINK_ID_MAP_ENTRY__, UNPROVIDED);
    }

    public static SubLObject link_id_map_entry_L(final SubLObject entry1, final SubLObject entry2) {
        final SubLObject parent1 = second(entry1);
        final SubLObject parent2 = second(entry2);
        if (parent1.eql(parent2)) {
            return numL(entry1.first(), entry2.first());
        }
        if (parent1.eql($ROOT)) {
            return T;
        }
        if (parent2.eql($ROOT)) {
            return NIL;
        }
        return numL(parent1, parent2);
    }

    public static SubLObject get_partial_problem_store_link_id_map(final SubLObject store, SubLObject inference, SubLObject start_tick, SubLObject end_tick) {
        if (inference == UNPROVIDED) {
            inference = inference_datastructures_problem_store.find_inference_by_id(store, ZERO_INTEGER);
        }
        if (start_tick == UNPROVIDED) {
            start_tick = ZERO_INTEGER;
        }
        if (end_tick == UNPROVIDED) {
            end_tick = inference_metrics.inference_tick_count(inference);
        }
        final SubLObject end_map = get_truncated_problem_store_link_id_map(store, end_tick, inference);
        final SubLObject start_map = get_truncated_problem_store_link_id_map(store, start_tick, inference);
        final SubLObject partial_map = set_difference(end_map, start_map, symbol_function(EQUAL), UNPROVIDED);
        cb_inference_monitors.inference_monitor_info($str161$Partial_map___S, partial_map, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return sort_partial_link_id_map(partial_map);
    }

    public static SubLObject validate_partial_problem_store_link_id_maps(final SubLObject store, SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = inference_datastructures_problem_store.find_inference_by_id(store, ZERO_INTEGER);
        }
        final SubLObject seen = set_utilities.new_singleton_set(ZERO_INTEGER, UNPROVIDED);
        SubLObject validP = T;
        SubLObject end_var;
        SubLObject start_tick;
        SubLObject end_tick;
        SubLObject cdolist_list_var;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject item;
        SubLObject current_$141;
        SubLObject datum_$140;
        SubLObject parent_id;
        SubLObject child_ids;
        for (end_var = subtract(inference_metrics.inference_tick_count(inference), TEN_INTEGER), start_tick = NIL, start_tick = ZERO_INTEGER; !start_tick.numGE(end_var); start_tick = add(start_tick, TEN_INTEGER)) {
            end_tick = add(start_tick, TEN_INTEGER);
            cdolist_list_var = get_partial_problem_store_link_id_map(store, inference, start_tick, end_tick);
            cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                datum = current = cons;
                key = NIL;
                item = NIL;
                destructuring_bind_must_consp(current, datum, $list162);
                key = current.first();
                current = item = current.rest();
                datum_$140 = current_$141 = item;
                parent_id = NIL;
                child_ids = NIL;
                destructuring_bind_must_consp(current_$141, datum_$140, $list163);
                parent_id = current_$141.first();
                current_$141 = child_ids = current_$141.rest();
                if (NIL == set.set_memberP(parent_id, seen)) {
                    Errors.sublisp_break($str164$Unseen_parent__D_in__S_for__S_to_, new SubLObject[]{ parent_id, item, start_tick, end_tick });
                    validP = NIL;
                }
                set_utilities.set_add_all(child_ids, seen);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        return validP;
    }

    public static SubLObject get_truncated_problem_store_link_id_map(final SubLObject store, SubLObject end_tick, SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = (NIL != store) ? inference_datastructures_problem_store.find_inference_by_id(store, ZERO_INTEGER) : NIL;
        }
        if (NIL == inference) {
            cb_inference_monitors.inference_monitor_warn($str165$Can_t_get_link_ID_map_from_null_i, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (end_tick.numG(inference_metrics.inference_tick_count(inference))) {
            end_tick = inference_metrics.inference_tick_count(inference);
        }
        final SubLObject tick_data = inference_metrics.inference_tick_indexed_progress_data(inference);
        SubLObject end_problem_id = problem_id_from_tick_data(tick_data, end_tick);
        SubLObject abortP = NIL;
        while ((!end_problem_id.isInteger()) && (NIL == abortP)) {
            end_tick = add(end_tick, ONE_INTEGER);
            if (end_tick.numG(inference_metrics.inference_tick_count(inference))) {
                abortP = T;
            } else {
                end_problem_id = problem_id_from_tick_data(tick_data, end_tick);
            }
        } 
        return NIL != abortP ? NIL : sort_partial_link_id_map(get_truncated_problem_store_link_id_map_int(store, end_problem_id));
    }

    public static SubLObject get_truncated_problem_store_link_id_map_int(final SubLObject store, final SubLObject end_problem_id) {
        cb_inference_monitors.inference_monitor_info($str166$Getting_links_from__S_up_to_probl, store, end_problem_id, UNPROVIDED, UNPROVIDED);
        final SubLObject link_id_map = inference_utilities.problem_store_link_id_map(store, UNPROVIDED, UNPROVIDED);
        SubLObject partial_map = NIL;
        SubLObject cdolist_list_var = link_id_map;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject link_id = NIL;
            SubLObject link_data = NIL;
            destructuring_bind_must_consp(current, datum, $list167);
            link_id = current.first();
            current = link_data = current.rest();
            if ($ROOT != link_data.first()) {
                if (NIL != find(end_problem_id, link_data, symbol_function($sym168$__), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    link_data = delete(end_problem_id, link_data, symbol_function($sym169$_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    link_data = NIL;
                }
            }
            if (NIL != link_data) {
                partial_map = list_utilities.alist_enter(partial_map, link_id, link_data, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return sort_partial_link_id_map(partial_map);
    }

    public static SubLObject problem_id_from_tick_data(final SubLObject tick_data, final SubLObject tick) {
        final SubLObject data = gethash(tick, tick_data, UNPROVIDED);
        final SubLObject problem = list_utilities.plist_lookup(data, $PROBLEM, UNPROVIDED);
        return NIL != inference_datastructures_problem.problem_p(problem) ? inference_datastructures_problem.problem_suid(problem) : NIL;
    }

    public static SubLObject json_serialize_problem_store_link(final SubLObject store, final SubLObject parent_id, final SubLObject children_ids, final SubLObject problems) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != json.$json_sequence_startedP$.getDynamicValue(thread)) {
            json.json_princ($str150$_);
        }
        json.json_newline();
        final SubLObject _prev_bind_0 = json.$json_object_startedP$.currentBinding(thread);
        try {
            json.$json_object_startedP$.bind(NIL, thread);
            json.json_princ($str148$_);
            final SubLObject _prev_bind_0_$142 = json.$json_indent_level$.currentBinding(thread);
            try {
                json.$json_indent_level$.bind(number_utilities.f_1X(json.$json_indent_level$.getDynamicValue(thread)), thread);
                assert NIL != stringp($$$pp) : "! stringp(web_services.$$$pp) " + ("Types.stringp(web_services.$str170$pp) " + "CommonSymbols.NIL != Types.stringp(web_services.$str170$pp) ") + $$$pp;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$pp);
                json.json_princ($str151$__);
                json.json_serialize_atom(parent_id, UNPROVIDED);
                json.$json_object_startedP$.setDynamicValue(T, thread);
                assert NIL != stringp($$$cp) : "! stringp(web_services.$$$cp) " + ("Types.stringp(web_services.$str171$cp) " + "CommonSymbols.NIL != Types.stringp(web_services.$str171$cp) ") + $$$cp;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$cp);
                json.json_princ($str151$__);
                json.json_serialize_atom_sequence(children_ids, UNPROVIDED);
                json.$json_object_startedP$.setDynamicValue(T, thread);
                json.json_princ($str159$_);
            } finally {
                json.$json_indent_level$.rebind(_prev_bind_0_$142, thread);
            }
        } finally {
            json.$json_object_startedP$.rebind(_prev_bind_0, thread);
        }
        json.$json_sequence_startedP$.setDynamicValue(T, thread);
        SubLObject cdolist_list_var = cons(parent_id, children_ids);
        SubLObject problem_id = NIL;
        problem_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(inference_datastructures_problem_store.find_problem_by_id(store, problem_id), problems);
            cdolist_list_var = cdolist_list_var.rest();
            problem_id = cdolist_list_var.first();
        } 
        return problems;
    }

    public static SubLObject json_serialize_problem(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != json.$json_sequence_startedP$.getDynamicValue(thread)) {
            json.json_princ($str150$_);
        }
        json.json_newline();
        final SubLObject _prev_bind_0 = json.$json_object_startedP$.currentBinding(thread);
        try {
            json.$json_object_startedP$.bind(NIL, thread);
            json.json_princ($str148$_);
            final SubLObject _prev_bind_0_$143 = json.$json_indent_level$.currentBinding(thread);
            try {
                json.$json_indent_level$.bind(number_utilities.f_1X(json.$json_indent_level$.getDynamicValue(thread)), thread);
                assert NIL != stringp($$$id) : "! stringp(web_services.$$$id) " + ("Types.stringp(web_services.$str172$id) " + "CommonSymbols.NIL != Types.stringp(web_services.$str172$id) ") + $$$id;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$id);
                json.json_princ($str151$__);
                json.json_serialize_atom(inference_datastructures_problem.problem_suid(problem), UNPROVIDED);
                json.$json_object_startedP$.setDynamicValue(T, thread);
                assert NIL != stringp($$$status) : "! stringp(web_services.$$$status) " + ("Types.stringp(web_services.$str173$status) " + "CommonSymbols.NIL != Types.stringp(web_services.$str173$status) ") + $$$status;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$status);
                json.json_princ($str151$__);
                json.json_serialize_atom(princ_to_string(inference_datastructures_problem.problem_status(problem)), UNPROVIDED);
                json.$json_object_startedP$.setDynamicValue(T, thread);
                assert NIL != stringp($$$label) : "! stringp(web_services.$$$label) " + ("Types.stringp(web_services.$str174$label) " + "CommonSymbols.NIL != Types.stringp(web_services.$str174$label) ") + $$$label;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$label);
                json.json_princ($str151$__);
                json.json_serialize_atom(json_label_for_problem(problem, $$$english), UNPROVIDED);
                json.$json_object_startedP$.setDynamicValue(T, thread);
                assert NIL != stringp($$$cycl) : "! stringp(web_services.$$$cycl) " + ("Types.stringp(web_services.$str9$cycl) " + "CommonSymbols.NIL != Types.stringp(web_services.$str9$cycl) ") + $$$cycl;
                if (NIL != json.$json_object_startedP$.getDynamicValue(thread)) {
                    json.json_princ($str150$_);
                }
                json.json_newline();
                json.json_print($$$cycl);
                json.json_princ($str151$__);
                json.json_serialize_atom(json_label_for_problem(problem, $$$cycl), UNPROVIDED);
                json.$json_object_startedP$.setDynamicValue(T, thread);
                json.json_princ($str159$_);
            } finally {
                json.$json_indent_level$.rebind(_prev_bind_0_$143, thread);
            }
        } finally {
            json.$json_object_startedP$.rebind(_prev_bind_0, thread);
        }
        json.$json_sequence_startedP$.setDynamicValue(T, thread);
        return problem;
    }

    public static SubLObject json_label_for_problem(final SubLObject problem, final SubLObject language) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (language.equalp($$$cycl)) {
            return web_utilities.html_url_encode(format_cycl_expression.get_pretty_formatted_string(problem_display_formula(problem), NIL, T), UNPROVIDED);
        }
        SubLObject label = $str175$;
        SubLObject old_label = $str175$;
        final SubLObject encoded_terms = encode_terms(problem_display_terms(problem), language);
        final SubLObject sorted_terms = list_utilities.alist_keys(list_utilities.sort_alist_by_values(list_utilities.plist_to_alist(encoded_terms), symbol_function($sym169$_)));
        SubLObject too_longP = NIL;
        final SubLObject max_length = $json_problem_label_max_length$.getDynamicValue(thread);
        if (NIL == too_longP) {
            SubLObject csome_list_var = sorted_terms;
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == too_longP) && (NIL != csome_list_var)) {
                old_label = label;
                label = (NIL != string_utilities.empty_string_p(label)) ? format_nil.format_nil_a(v_term) : cconcatenate(label, new SubLObject[]{ web_utilities.html_url_encode($$$_, UNPROVIDED), format_nil.format_nil_a(v_term) });
                too_longP = list_utilities.lengthG(label, max_length, UNPROVIDED);
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        return NIL != list_utilities.lengthG(label, max_length, UNPROVIDED) ? old_label : label;
    }

    public static SubLObject declare_web_services_file() {
        declareFunction("xml_query_variable", "XML-QUERY-VARIABLE", 0, 1, false);
        declareFunction("xml_get_genls_from_string", "XML-GET-GENLS-FROM-STRING", 0, 1, false);
        declareFunction("xml_get_genls_from_string_int", "XML-GET-GENLS-FROM-STRING-INT", 0, 1, false);
        declareFunction("xml_get_genls", "XML-GET-GENLS", 0, 1, false);
        declareFunction("xml_get_genls_int", "XML-GET-GENLS-INT", 0, 1, false);
        declareFunction("xml_possibly_serialize_generation", "XML-POSSIBLY-SERIALIZE-GENERATION", 3, 0, false);
        declareFunction("xml_get_upwards_closure_from_string", "XML-GET-UPWARDS-CLOSURE-FROM-STRING", 0, 1, false);
        declareFunction("xml_get_upwards_closure", "XML-GET-UPWARDS-CLOSURE", 0, 1, false);
        declareFunction("xml_get_isas_from_string", "XML-GET-ISAS-FROM-STRING", 0, 1, false);
        declareFunction("xml_get_isas_from_string_int", "XML-GET-ISAS-FROM-STRING-INT", 0, 1, false);
        declareFunction("xml_get_isas", "XML-GET-ISAS", 0, 1, false);
        declareFunction("xml_get_isas_int", "XML-GET-ISAS-INT", 0, 1, false);
        declareFunction("xml_get_generation", "XML-GET-GENERATION", 0, 1, false);
        declareFunction("pph_params_from_html_args", "PPH-PARAMS-FROM-HTML-ARGS", 1, 0, false);
        declareFunction("term_display_string", "TERM-DISPLAY-STRING", 1, 0, false);
        declareMacro("my_html_format", "MY-HTML-FORMAT");
        declareFunction("reset_last_monitored_inference", "RESET-LAST-MONITORED-INFERENCE", 0, 0, false);
        declareFunction("cb_inference_tick_data", "CB-INFERENCE-TICK-DATA", 1, 0, false);
        declareFunction("clear_notify_getting_tick_data", "CLEAR-NOTIFY-GETTING-TICK-DATA", 0, 0, false);
        declareFunction("remove_notify_getting_tick_data", "REMOVE-NOTIFY-GETTING-TICK-DATA", 0, 1, false);
        declareFunction("notify_getting_tick_data_internal", "NOTIFY-GETTING-TICK-DATA-INTERNAL", 1, 0, false);
        declareFunction("notify_getting_tick_data", "NOTIFY-GETTING-TICK-DATA", 0, 1, false);
        declareFunction("html_output_tick_data", "HTML-OUTPUT-TICK-DATA", 5, 0, false);
        declareFunction("inference_progress_data_for_tick_number", "INFERENCE-PROGRESS-DATA-FOR-TICK-NUMBER", 2, 0, false);
        declareFunction("inference_progress_data_for_tick_number_memoized_internal", "INFERENCE-PROGRESS-DATA-FOR-TICK-NUMBER-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("inference_progress_data_for_tick_number_memoized", "INFERENCE-PROGRESS-DATA-FOR-TICK-NUMBER-MEMOIZED", 2, 0, false);
        declareFunction("problem_store_total_tick_count", "PROBLEM-STORE-TOTAL-TICK-COUNT", 1, 0, false);
        declareFunction("problem_display_terms_from_tick_data", "PROBLEM-DISPLAY-TERMS-FROM-TICK-DATA", 1, 0, false);
        declareFunction("problem_display_terms", "PROBLEM-DISPLAY-TERMS", 1, 0, false);
        declareFunction("problem_display_formula", "PROBLEM-DISPLAY-FORMULA", 1, 0, false);
        declareFunction("assertion_display_terms_from_tick_data", "ASSERTION-DISPLAY-TERMS-FROM-TICK-DATA", 1, 0, false);
        declareFunction("inference_visualizer_show_termP", "INFERENCE-VISUALIZER-SHOW-TERM?", 1, 0, false);
        declareFunction("encode_terms", "ENCODE-TERMS", 2, 0, false);
        declareFunction("clear_inference_visualizer_term_generality", "CLEAR-INFERENCE-VISUALIZER-TERM-GENERALITY", 0, 0, false);
        declareFunction("remove_inference_visualizer_term_generality", "REMOVE-INFERENCE-VISUALIZER-TERM-GENERALITY", 1, 1, false);
        declareFunction("inference_visualizer_term_generality_internal", "INFERENCE-VISUALIZER-TERM-GENERALITY-INTERNAL", 2, 0, false);
        declareFunction("inference_visualizer_term_generality", "INFERENCE-VISUALIZER-TERM-GENERALITY", 1, 1, false);
        declareFunction("xml_get_inference_hl_module_times", "XML-GET-INFERENCE-HL-MODULE-TIMES", 1, 0, false);
        declareFunction("cb_inference_link_info", "CB-INFERENCE-LINK-INFO", 1, 0, false);
        declareFunction("get_inference_from_mode", "GET-INFERENCE-FROM-MODE", 1, 0, false);
        declareFunction("clear_problem_store_link_id_map_json_string", "CLEAR-PROBLEM-STORE-LINK-ID-MAP-JSON-STRING", 0, 0, false);
        declareFunction("remove_problem_store_link_id_map_json_string", "REMOVE-PROBLEM-STORE-LINK-ID-MAP-JSON-STRING", 1, 3, false);
        declareFunction("problem_store_link_id_map_json_string_internal", "PROBLEM-STORE-LINK-ID-MAP-JSON-STRING-INTERNAL", 4, 0, false);
        declareFunction("problem_store_link_id_map_json_string", "PROBLEM-STORE-LINK-ID-MAP-JSON-STRING", 1, 3, false);
        declareFunction("problem_store_complete_link_id_map_json_string", "PROBLEM-STORE-COMPLETE-LINK-ID-MAP-JSON-STRING", 1, 0, false);
        declareFunction("json_serialize_problem_store_link_id_map", "JSON-SERIALIZE-PROBLEM-STORE-LINK-ID-MAP", 1, 3, false);
        declareFunction("json_serialize_problem_store_complete_link_id_map", "JSON-SERIALIZE-PROBLEM-STORE-COMPLETE-LINK-ID-MAP", 1, 0, false);
        declareFunction("json_serialize_problem_store_link_id_map_int", "JSON-SERIALIZE-PROBLEM-STORE-LINK-ID-MAP-INT", 2, 0, false);
        declareFunction("sort_partial_link_id_map", "SORT-PARTIAL-LINK-ID-MAP", 1, 0, false);
        declareFunction("link_id_map_entry_L", "LINK-ID-MAP-ENTRY-<", 2, 0, false);
        declareFunction("get_partial_problem_store_link_id_map", "GET-PARTIAL-PROBLEM-STORE-LINK-ID-MAP", 1, 3, false);
        declareFunction("validate_partial_problem_store_link_id_maps", "VALIDATE-PARTIAL-PROBLEM-STORE-LINK-ID-MAPS", 1, 1, false);
        declareFunction("get_truncated_problem_store_link_id_map", "GET-TRUNCATED-PROBLEM-STORE-LINK-ID-MAP", 2, 1, false);
        declareFunction("get_truncated_problem_store_link_id_map_int", "GET-TRUNCATED-PROBLEM-STORE-LINK-ID-MAP-INT", 2, 0, false);
        declareFunction("problem_id_from_tick_data", "PROBLEM-ID-FROM-TICK-DATA", 2, 0, false);
        declareFunction("json_serialize_problem_store_link", "JSON-SERIALIZE-PROBLEM-STORE-LINK", 4, 0, false);
        declareFunction("json_serialize_problem", "JSON-SERIALIZE-PROBLEM", 1, 0, false);
        declareFunction("json_label_for_problem", "JSON-LABEL-FOR-PROBLEM", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_web_services_file() {
        deflexical("*LAST-MONITORED-INFERENCE*", NIL);
        deflexical("*NOTIFY-GETTING-TICK-DATA-CACHING-STATE*", NIL);
        defparameter("*FILTER-INFERENCE-VISUALIZER-TERMS?*", NIL);
        deflexical("*INFERENCE-VISUALIZER-TERM-GENERALITY-CACHING-STATE*", NIL);
        deflexical("*PROBLEM-STORE-LINK-ID-MAP-JSON-STRING-CACHING-STATE*", NIL);
        defparameter("*JSON-PROBLEM-LABEL-MAX-LENGTH*", $int$100);
        return NIL;
    }

    public static final SubLObject setup_web_services_file_alt() {
        note_html_handler_function(XML_GET_GENLS_FROM_STRING);
        note_html_handler_function(XML_GET_GENLS_FROM_STRING_INT);
        note_html_handler_function(XML_GET_GENLS);
        note_html_handler_function(XML_GET_GENLS_INT);
        note_html_handler_function(XML_GET_UPWARDS_CLOSURE_FROM_STRING);
        note_html_handler_function(XML_GET_UPWARDS_CLOSURE);
        note_html_handler_function(XML_GET_ISAS_FROM_STRING);
        note_html_handler_function(XML_GET_ISAS_FROM_STRING_INT);
        note_html_handler_function(XML_GET_ISAS);
        note_html_handler_function(XML_GET_ISAS_INT);
        note_html_handler_function(XML_GET_GENERATION);
        return NIL;
    }

    public static SubLObject setup_web_services_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(XML_QUERY_VARIABLE, $XML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_GENLS_FROM_STRING, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_GENLS_FROM_STRING_INT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_GENLS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_GENLS_INT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_UPWARDS_CLOSURE_FROM_STRING, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_UPWARDS_CLOSURE, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_ISAS_FROM_STRING, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_ISAS_FROM_STRING_INT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_ISAS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_ISAS_INT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(XML_GET_GENERATION, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_INFERENCE_TICK_DATA, $HTML_HANDLER);
            memoization_state.note_globally_cached_function(NOTIFY_GETTING_TICK_DATA);
            memoization_state.note_memoized_function(INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED);
            memoization_state.note_globally_cached_function(INFERENCE_VISUALIZER_TERM_GENERALITY);
            html_macros.note_cgi_handler_function(XML_GET_INFERENCE_HL_MODULE_TIMES, $XML_HANDLER);
            html_macros.note_cgi_handler_function(CB_INFERENCE_LINK_INFO, $HTML_HANDLER);
            memoization_state.note_globally_cached_function(PROBLEM_STORE_LINK_ID_MAP_JSON_STRING);
        }
        if (SubLFiles.USE_V2) {
            note_html_handler_function(XML_GET_GENLS_FROM_STRING);
            note_html_handler_function(XML_GET_GENLS_FROM_STRING_INT);
            note_html_handler_function(XML_GET_GENLS);
            note_html_handler_function(XML_GET_GENLS_INT);
            note_html_handler_function(XML_GET_UPWARDS_CLOSURE_FROM_STRING);
            note_html_handler_function(XML_GET_UPWARDS_CLOSURE);
            note_html_handler_function(XML_GET_ISAS_FROM_STRING);
            note_html_handler_function(XML_GET_ISAS_FROM_STRING_INT);
            note_html_handler_function(XML_GET_ISAS);
            note_html_handler_function(XML_GET_ISAS_INT);
            note_html_handler_function(XML_GET_GENERATION);
        }
        return NIL;
    }

    public static SubLObject setup_web_services_file_Previous() {
        html_macros.note_cgi_handler_function(XML_QUERY_VARIABLE, $XML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_GENLS_FROM_STRING, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_GENLS_FROM_STRING_INT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_GENLS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_GENLS_INT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_UPWARDS_CLOSURE_FROM_STRING, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_UPWARDS_CLOSURE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_ISAS_FROM_STRING, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_ISAS_FROM_STRING_INT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_ISAS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_ISAS_INT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(XML_GET_GENERATION, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_INFERENCE_TICK_DATA, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(NOTIFY_GETTING_TICK_DATA);
        memoization_state.note_memoized_function(INFERENCE_PROGRESS_DATA_FOR_TICK_NUMBER_MEMOIZED);
        memoization_state.note_globally_cached_function(INFERENCE_VISUALIZER_TERM_GENERALITY);
        html_macros.note_cgi_handler_function(XML_GET_INFERENCE_HL_MODULE_TIMES, $XML_HANDLER);
        html_macros.note_cgi_handler_function(CB_INFERENCE_LINK_INFO, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(PROBLEM_STORE_LINK_ID_MAP_JSON_STRING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_web_services_file();
    }

    @Override
    public void initializeVariables() {
        init_web_services_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_web_services_file();
    }

    
}

/**
 * Total time: 3395 ms
 */
