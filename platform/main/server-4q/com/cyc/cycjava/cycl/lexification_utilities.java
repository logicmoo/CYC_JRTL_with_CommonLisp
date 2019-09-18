package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_display_string;
import static com.cyc.cycjava.cycl.cb_utilities.cb_string_for_fort;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg_position;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_asterisk;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_caret;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.decode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.encode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class lexification_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new lexification_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.lexification_utilities";

    public static final String myFingerPrint = "4726a48153d58acdb611e5671afc8f11282aefc377590f12c8806f63139e370b";

    // defconstant
    // Definitions
    // Trace level for no tracing at all
    public static final SubLSymbol $lex_none$ = makeSymbol("*LEX-NONE*");

    // defconstant
    public static final SubLSymbol $lex_always$ = makeSymbol("*LEX-ALWAYS*");

    // defconstant
    // Minimal tracing
    public static final SubLSymbol $lex_basic$ = makeSymbol("*LEX-BASIC*");

    // defconstant
    // Alias for @xref *lex-basic*
    public static final SubLSymbol $lex_warning$ = makeSymbol("*LEX-WARNING*");

    // defconstant
    // Tracing level for main flow of control
    public static final SubLSymbol $lex_detailed$ = makeSymbol("*LEX-DETAILED*");

    // defconstant
    // Tracing level with useful but verbose output
    public static final SubLSymbol $lex_verbose$ = makeSymbol("*LEX-VERBOSE*");

    // defconstant
    // next level after @xref *lex-verbose*
    public static final SubLSymbol $lex_very_detailed$ = makeSymbol("*LEX-VERY-DETAILED*");

    // defconstant
    // next level after @xref *lex-very-detailed*
    public static final SubLSymbol $lex_very_verbose$ = makeSymbol("*LEX-VERY-VERBOSE*");

    // defconstant
    // next level after @xref *lex-very-verbose*
    public static final SubLSymbol $lex_most_detailed$ = makeSymbol("*LEX-MOST-DETAILED*");

    // defconstant
    // next level after @xref *lex-most-detailed*
    public static final SubLSymbol $lex_most_verbose$ = makeSymbol("*LEX-MOST-VERBOSE*");

    // defconstant
    // highest practical trace level
    public static final SubLSymbol $lex_all$ = makeSymbol("*LEX-ALL*");









    // defparameter
    // Whitespace characters for @xref lex-string-tokenize
    private static final SubLSymbol $lex_white_space_chars$ = makeSymbol("*LEX-WHITE-SPACE-CHARS*");

    // defparameter
    /**
     * Punctuation characters for @xref lex-string-tokenize
     *
     * @unknown This is different from the standard punctuation characters (@xref
    *standard-punctuation-chars*) in that dashes and apostrophes are
    excluded
     */
    private static final SubLSymbol $lex_punctuation_chars$ = makeSymbol("*LEX-PUNCTUATION-CHARS*");





















    // deflexical
    /**
     * Gating parameter to turn off this functionality while it appears to be both
     * broken and expensive.
     */
    private static final SubLSymbol $terrorist_attack_lexification_worksP$ = makeSymbol("*TERRORIST-ATTACK-LEXIFICATION-WORKS?*");

    // Internal Constants
    public static final SubLSymbol $lexification_check_max_days$ = makeSymbol("*LEXIFICATION-CHECK-MAX-DAYS*");

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLSymbol $lexification_reviewer$ = makeSymbol("*LEXIFICATION-REVIEWER*");



    public static final SubLSymbol $num_predicate_examples$ = makeSymbol("*NUM-PREDICATE-EXAMPLES*");

    public static final SubLList $list5 = list(new SubLObject[]{ CHAR_period, CHAR_semicolon, CHAR_comma, CHAR_colon, CHAR_quotation, CHAR_exclamation, CHAR_question, CHAR_lparen, CHAR_rparen, CHAR_percent, CHAR_caret, CHAR_asterisk });

    public static final SubLList $list6 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-SPEC"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLSymbol $sym8$__ = makeSymbol(">=");

    public static final SubLSymbol $lex_trace_level$ = makeSymbol("*LEX-TRACE-LEVEL*");



    public static final SubLSymbol $trace_output$ = makeSymbol("*TRACE-OUTPUT*");

    public static final SubLList $list12 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*TRACE-OUTPUT*")));

    public static final SubLList $list13 = list(makeSymbol("FORMAT-SPEC"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLList $list15 = list(makeSymbol("MAX"), makeSymbol("*LEX-TRACE-LEVEL*"), makeSymbol("*LEX-BASIC*"));



    public static final SubLString $str17$Warning__ = makeString("Warning: ");

    public static final SubLList $list18 = list(makeSymbol("FORM"), makeSymbol("&REST"), makeSymbol("OPTIONAL-FORMS"));

    public static final SubLList $list19 = list(makeSymbol(">="), makeSymbol("*LEX-TRACE-LEVEL*"), makeSymbol("*LEX-VERBOSE*"));

    public static final SubLList $list20 = list(makeSymbol("TRACE-LEVEL"), makeSymbol("FORM"), makeSymbol("&REST"), makeSymbol("OPTIONAL-FORMS"));

    public static final SubLList $list21 = list(makeSymbol("MAX"), makeSymbol("*LEX-TRACE-LEVEL*"), makeSymbol("*LEX-VERBOSE*"));

    private static final SubLList $list22 = list(makeSymbol("EXPRESSION"));





    private static final SubLString $str25$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");



    private static final SubLList $list27 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Finding unlexified terms...")), makeSymbol("ALLOW-TERMSTRINGS?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str28$Finding_unlexified_terms___ = makeString("Finding unlexified terms...");

    private static final SubLSymbol DO_CONSTANTS = makeSymbol("DO-CONSTANTS");

    private static final SubLSymbol $sym30$UNLEXIFIED_ = makeSymbol("UNLEXIFIED?");

    private static final SubLString $str31$Looking_for_unlexified_FORTs_crea = makeString("Looking for unlexified FORTs created by ");

    private static final SubLString $$$_in_last_ = makeString(" in last ");

    private static final SubLString $str33$_days___ = makeString(" days...");

    private static final SubLString $$$cdolist = makeString("cdolist");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$termDoesntNeedLexification = reader_make_constant_shell(makeString("termDoesntNeedLexification"));

    private static final SubLObject $$instancesDontNeedLexification = reader_make_constant_shell(makeString("instancesDontNeedLexification"));

    private static final SubLObject $const40$quotedInstancesDontNeedLexificati = reader_make_constant_shell(makeString("quotedInstancesDontNeedLexification"));





    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$conceptuallyRelated = reader_make_constant_shell(makeString("conceptuallyRelated"));

    public static final SubLList $list46 = list(makeSymbol("?MT"));

    private static final SubLList $list47 = list(list(reader_make_constant_shell(makeString("genlMt")), makeSymbol("?MT"), reader_make_constant_shell(makeString("GeneralLexiconMt"))));

    private static final SubLList $list48 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?MT")));

    private static final SubLObject $$TemporaryLexicalAssertionsMt = reader_make_constant_shell(makeString("TemporaryLexicalAssertionsMt"));

    private static final SubLString $str50$char__a_next__a_next_next__a_run_ = makeString("char=~a next=~a next-next=~a run-len=~a new-index=~a~%");

    private static final SubLList $list51 = list(reader_make_constant_shell(makeString("singular")));

    private static final SubLString $$$_Mt = makeString(" Mt");

    private static final SubLString $$$_G = makeString(" G");

    private static final SubLString $$$General_ = makeString("General ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str56$___ = makeString(" - ");

    private static final SubLString $str57$__ = makeString(" -");

    private static final SubLObject $$multiWordString = reader_make_constant_shell(makeString("multiWordString"));

    private static final SubLObject $$Know_TheWord = reader_make_constant_shell(makeString("Know-TheWord"));

    private static final SubLObject $$MassNoun = reader_make_constant_shell(makeString("MassNoun"));

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLString $str62$ = makeString("");



    private static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym68$_ = makeSymbol(">");

    private static final SubLSymbol NUM_PREDICATE_EXTENT_INDEX = makeSymbol("NUM-PREDICATE-EXTENT-INDEX");

    private static final SubLObject $$CycLReifiableDenotationalTerm = reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm"));

    private static final SubLObject $$EnglishLexiconMt = reader_make_constant_shell(makeString("EnglishLexiconMt"));

    private static final SubLSymbol KEYWORD_FOR_POS = makeSymbol("KEYWORD-FOR-POS");

    private static final SubLObject $$ProperNoun = reader_make_constant_shell(makeString("ProperNoun"));



    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));



    private static final SubLObject $$Pronoun = reader_make_constant_shell(makeString("Pronoun"));



    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));



    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));



    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));



    private static final SubLObject $$Adverb = reader_make_constant_shell(makeString("Adverb"));



    private static final SubLObject $$Preposition = reader_make_constant_shell(makeString("Preposition"));



    private static final SubLObject $$Conjunction = reader_make_constant_shell(makeString("Conjunction"));



    private static final SubLSymbol $keyword_for_pos_caching_state$ = makeSymbol("*KEYWORD-FOR-POS-CACHING-STATE*");





    private static final SubLSymbol PRECISE_KEYWORD_FOR_POS = makeSymbol("PRECISE-KEYWORD-FOR-POS");



    private static final SubLObject $$CountNoun = reader_make_constant_shell(makeString("CountNoun"));



    private static final SubLObject $$AgentiveNoun = reader_make_constant_shell(makeString("AgentiveNoun"));



    private static final SubLObject $$GerundiveNoun = reader_make_constant_shell(makeString("GerundiveNoun"));



    private static final SubLObject $$DeVerbalNoun = reader_make_constant_shell(makeString("DeVerbalNoun"));



    private static final SubLObject $$AuxVerb = reader_make_constant_shell(makeString("AuxVerb"));



    private static final SubLSymbol $precise_keyword_for_pos_caching_state$ = makeSymbol("*PRECISE-KEYWORD-FOR-POS-CACHING-STATE*");

    private static final SubLSymbol KEYWORD_FOR_PRED = makeSymbol("KEYWORD-FOR-PRED");

    private static final SubLSymbol $keyword_for_pred_caching_state$ = makeSymbol("*KEYWORD-FOR-PRED-CACHING-STATE*");

    private static final SubLSymbol PRECISE_KEYWORD_FOR_PRED = makeSymbol("PRECISE-KEYWORD-FOR-PRED");

    private static final SubLSymbol $precise_keyword_for_pred_caching_state$ = makeSymbol("*PRECISE-KEYWORD-FOR-PRED-CACHING-STATE*");

    private static final SubLString $str111$invalid_formula____a__ = makeString("invalid formula:~%~a~%");

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLList $list113 = list(reader_make_constant_shell(makeString("ProperNoun")));

    private static final SubLSymbol PLURALIZE_WORD = makeSymbol("PLURALIZE-WORD");

    private static final SubLSymbol $pluralize_word_caching_state$ = makeSymbol("*PLURALIZE-WORD-CACHING-STATE*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol SINGULARIZE_WORD = makeSymbol("SINGULARIZE-WORD");

    private static final SubLSymbol $singularize_word_caching_state$ = makeSymbol("*SINGULARIZE-WORD-CACHING-STATE*");

    private static final SubLSymbol BASIC_PREDS_FOR_PART_OF_SPEECH = makeSymbol("BASIC-PREDS-FOR-PART-OF-SPEECH");

    private static final SubLSymbol $basic_preds_for_part_of_speech_caching_state$ = makeSymbol("*BASIC-PREDS-FOR-PART-OF-SPEECH-CACHING-STATE*");



    private static final SubLSymbol FIND_ROOT_WORDFORM = makeSymbol("FIND-ROOT-WORDFORM");

    private static final SubLSymbol $find_root_wordform_caching_state$ = makeSymbol("*FIND-ROOT-WORDFORM-CACHING-STATE*");



    private static final SubLObject $$AllLexicalMicrotheoryPSC = reader_make_constant_shell(makeString("AllLexicalMicrotheoryPSC"));

    private static final SubLSymbol IS_ABBREVIATION_PREDICATE = makeSymbol("IS-ABBREVIATION-PREDICATE");

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLList $list129 = list(makeSymbol("?CONSTRAINT"));

    private static final SubLList $list130 = list(list(reader_make_constant_shell(makeString("genls")), makeSymbol("?CONSTRAINT"), reader_make_constant_shell(makeString("Abbreviation"))));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol $is_abbreviation_predicate_caching_state$ = makeSymbol("*IS-ABBREVIATION-PREDICATE-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLObject $$properNameStrings = reader_make_constant_shell(makeString("properNameStrings"));

    private static final SubLSymbol EXAMPLES_FOR_PRED = makeSymbol("EXAMPLES-FOR-PRED");

    private static final SubLString $str137$examples_for_pred__a__a___ = makeString("examples-for-pred(~a ~a)~%");

    private static final SubLSymbol $examples_for_pred_caching_state$ = makeSymbol("*EXAMPLES-FOR-PRED-CACHING-STATE*");

    private static final SubLObject $$examples_Positive = reader_make_constant_shell(makeString("examples-Positive"));

    private static final SubLList $list140 = list(reader_make_constant_shell(makeString("exampleSentence")), reader_make_constant_shell(makeString("examplePredSentence")), reader_make_constant_shell(makeString("exampleAssertions")));





    private static final SubLString $str143$try_lex_assert__s_in_MT__a__ = makeString("try-lex-assert ~s in MT ~a~%");

    private static final SubLObject $$toBeReviewedBy = reader_make_constant_shell(makeString("toBeReviewedBy"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLString $str147$try_lex_assert_now__s_in_MT__a__ = makeString("try-lex-assert-now ~s in MT ~a~%");

    private static final SubLObject $$DeadTerm = reader_make_constant_shell(makeString("DeadTerm"));

    private static final SubLString $$$DeadTerm = makeString("DeadTerm");

    private static final SubLObject $$preferredTermStrings = reader_make_constant_shell(makeString("preferredTermStrings"));





    private static final SubLSymbol PPH_STRING_TO_CYCL = makeSymbol("PPH-STRING-TO-CYCL");

    private static final SubLSymbol CYCL_FORMULAIC_SENTENCE_P = makeSymbol("CYCL-FORMULAIC-SENTENCE-P");

    private static final SubLSymbol $sym155$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$nameableCollection = reader_make_constant_shell(makeString("nameableCollection"));

    private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

    private static final SubLList $list158 = list(makeString("worthy"), makeString("ous"), makeString("ical"), makeString("less"), makeString("like"), makeString("able"), makeString("ible"), makeString("ic"));

    private static final SubLList $list159 = list(makeString("ly"));

    private static final SubLList $list160 = list(makeString("ability"), makeString("ism"), makeString("ness"), makeString("ation"), makeString("ion"), makeString("ity"));

    private static final SubLList $list161 = list(makeString("ify"), makeString("ize"));

    private static final SubLList $list162 = list(makeString("ing"));

    private static final SubLList $list163 = list(makeString("or"), makeString("er"));

    private static final SubLList $list164 = list(makeKeyword("ANY"), makeKeyword("INITIAL"));

    private static final SubLObject $$HeadInitialMultiWordPhrasePred = reader_make_constant_shell(makeString("HeadInitialMultiWordPhrasePred"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));











    private static final SubLString $str172$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str177$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str178$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str179$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list180 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str181$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLList $list182 = list(makeKeyword("ANY"), makeKeyword("FINAL"));

    private static final SubLObject $$HeadFinalMultiWordPhrasePred = reader_make_constant_shell(makeString("HeadFinalMultiWordPhrasePred"));

    private static final SubLList $list184 = list(makeKeyword("ANY"), makeKeyword("MEDIAL"));

    private static final SubLObject $$HeadMedialMultiWordPhrasePred = reader_make_constant_shell(makeString("HeadMedialMultiWordPhrasePred"));







    private static final SubLString $str189$word__a_usage___a__ = makeString("word ~a usage: ~a~%");

    private static final SubLString $str190$Setting_new_guessed_headword_to__ = makeString("Setting new guessed headword to ~S~%");

    private static final SubLSymbol $sym191$CYCL_STRING__ = makeSymbol("CYCL-STRING-<");

    private static final SubLSymbol POSSIBLY_LEXIFY_TERRORIST_ATTACK = makeSymbol("POSSIBLY-LEXIFY-TERRORIST-ATTACK");

    private static final SubLObject $$definiteDescriptions = reader_make_constant_shell(makeString("definiteDescriptions"));



    private static final SubLList $list195 = list(makeSymbol("STRING"), makeSymbol("ASSERTION-EL-SET"));

    private static final SubLObject $$TerrorismLexicalMt = reader_make_constant_shell(makeString("TerrorismLexicalMt"));



    private static final SubLList $list198 = list(makeSymbol("?STRING"), makeSymbol("?SET"));

    private static final SubLList $list199 = list(list(ONE_INTEGER, TWO_INTEGER, ONE_INTEGER), list(TWO_INTEGER, TWO_INTEGER, TWO_INTEGER, TWO_INTEGER));



    public static final SubLList $list201 = list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("NLGIT-LexifyTerroristAttack")));

    public static SubLObject lexification_reviewer() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $lexification_reviewer$.getDynamicValue(thread);
    }

    public static SubLObject set_lexification_reviewer(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != cyclist) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        $lexification_reviewer$.setDynamicValue(cyclist, thread);
        return $lexification_reviewer$.getDynamicValue(thread);
    }

    public static SubLObject lex_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        SubLObject format_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        format_spec = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(PWHEN, list($sym8$__, $lex_trace_level$, level), listS(FORMAT, $trace_output$, format_spec, append(args, NIL)), $list12);
    }

    public static SubLObject lex_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        format_spec = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(LEX_TRACE, $list15, list(CCONCATENATE, $str17$Warning__, format_spec), append(args, NIL));
    }

    public static SubLObject lex_debug(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        form = current.first();
        final SubLObject optional_forms;
        current = optional_forms = current.rest();
        return listS(PWHEN, $list19, form, append(optional_forms, NIL));
    }

    public static SubLObject lex_if_level(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trace_level = NIL;
        SubLObject form = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        trace_level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        form = current.first();
        final SubLObject optional_forms;
        current = optional_forms = current.rest();
        return listS(PWHEN, $list19, form, append(optional_forms, NIL));
    }

    public static SubLObject lex_debug_out(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        format_spec = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(LEX_TRACE, $list21, format_spec, append(args, NIL));
    }

    public static SubLObject lex_debug_on(SubLObject trace_level) {
        if (trace_level == UNPROVIDED) {
            trace_level = $lex_verbose$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $lex_trace_level$.setDynamicValue(trace_level, thread);
        return $lex_trace_level$.getDynamicValue(thread);
    }

    public static SubLObject lex_assertion(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PUNLESS, expression, list(LEX_WARN, $str25$____assertion_failed___a______, list(QUOTE, expression)));
        }
        cdestructuring_bind_error(datum, $list22);
        return NIL;
    }

    public static SubLObject do_unlexified_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        var = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $str28$Finding_unlexified_terms___;
        destructuring_bind_must_listp(current, datum, $list27);
        current = current.rest();
        final SubLObject allow_termstringsP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list27);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_CONSTANTS, list(var, message), listS(PWHEN, list($sym30$UNLEXIFIED_, var, allow_termstringsP), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list27);
        return NIL;
    }

    public static SubLObject unlexified_terms_for_cyclist(final SubLObject cyclist, SubLObject max_days, SubLObject check_termstringsP) {
        if (max_days == UNPROVIDED) {
            max_days = $lexification_check_max_days$.getGlobalValue();
        }
        if (check_termstringsP == UNPROVIDED) {
            check_termstringsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unlexified_forts = NIL;
        final SubLObject start_date = n_universal_days_ago(max_days);
        final SubLObject todays_date = universal_time_to_universal_date(get_universal_time());
        final SubLObject list_var;
        final SubLObject cyclist_forts = list_var = kb_utilities.constants_created_between(start_date, todays_date, cyclist);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($str31$Looking_for_unlexified_FORTs_crea, new SubLObject[]{ format_nil.format_nil_s_no_copy(cyclist), $$$_in_last_, format_nil.format_nil_d_no_copy(max_days), $str33$_days___ }) ? cconcatenate($str31$Looking_for_unlexified_FORTs_crea, new SubLObject[]{ format_nil.format_nil_s_no_copy(cyclist), $$$_in_last_, format_nil.format_nil_d_no_copy(max_days), $str33$_days___ }) : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject fort = NIL;
                fort = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != unlexifiedP(fort, check_termstringsP)) {
                        unlexified_forts = cons(fort, unlexified_forts);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    fort = csome_list_var.first();
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
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return unlexified_forts;
    }

    public static SubLObject lexification_not_neededP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(fort) : "kb_indexing_datastructures.indexed_term_p(fort) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(fort) " + fort;
        SubLObject not_neededP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_utilities.pred_values(fort, $$termDoesntNeedLexification, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                not_neededP = T;
            } else
                if (NIL != isa.isa_anyP(fort, kb_mapping_utilities.pred_refs($$instancesDontNeedLexification, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    not_neededP = T;
                } else
                    if (NIL != isa.quoted_isa_anyP(fort, kb_mapping_utilities.pred_refs($const40$quotedInstancesDontNeedLexificati, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        not_neededP = T;
                    }


        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return not_neededP;
    }

    public static SubLObject unlexifiedP(final SubLObject fort, SubLObject allow_termstringsP) {
        if (allow_termstringsP == UNPROVIDED) {
            allow_termstringsP = NIL;
        }
        assert NIL != indexed_term_p(fort) : "kb_indexing_datastructures.indexed_term_p(fort) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(fort) " + fort;
        SubLObject is_unlexified = NIL;
        if (NIL == lexification_not_neededP(fort)) {
            is_unlexified = sublisp_null(lexicon_utilities.lexifications_for_term(fort, allow_termstringsP, ONE_INTEGER, UNPROVIDED));
        }
        return is_unlexified;
    }

    public static SubLObject lexifiedP(final SubLObject fort, SubLObject allow_termstringsP) {
        if (allow_termstringsP == UNPROVIDED) {
            allow_termstringsP = NIL;
        }
        return makeBoolean(NIL == unlexifiedP(fort, allow_termstringsP));
    }

    public static SubLObject generalization_is_lexifiedP(final SubLObject v_term) {
        SubLObject lexified = NIL;
        if (NIL != pph_utilities.pph_relationP(v_term)) {
            if (NIL == lexified) {
                SubLObject csome_list_var = pph_utilities.pph_all_genl_relations(v_term);
                SubLObject genl_relation = NIL;
                genl_relation = csome_list_var.first();
                while ((NIL == lexified) && (NIL != csome_list_var)) {
                    if (NIL == lexicon_utilities.missing_generation_assertion(genl_relation)) {
                        lexified = genl_relation;
                    }
                    csome_list_var = csome_list_var.rest();
                    genl_relation = csome_list_var.first();
                } 
            }
            if (NIL == lexified) {
                SubLObject csome_list_var = genl_predicates.all_genl_inverses(v_term, UNPROVIDED, UNPROVIDED);
                SubLObject genl_relation = NIL;
                genl_relation = csome_list_var.first();
                while ((NIL == lexified) && (NIL != csome_list_var)) {
                    if (NIL == lexicon_utilities.missing_generation_assertion(genl_relation)) {
                        lexified = genl_relation;
                    }
                    csome_list_var = csome_list_var.rest();
                    genl_relation = csome_list_var.first();
                } 
            }
        }
        return values(list_utilities.sublisp_boolean(lexified), lexified);
    }

    public static SubLObject get_unlexified_terms(SubLObject allow_termstringsP, SubLObject max_num) {
        if (allow_termstringsP == UNPROVIDED) {
            allow_termstringsP = NIL;
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject max_count = (NIL != max_num) ? max_num : forts.fort_count();
        SubLObject term_list = NIL;
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str28$Finding_unlexified_terms___;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$2 = idx;
                if (NIL == id_index_objects_empty_p(idx_$2, $SKIP)) {
                    final SubLObject idx_$3 = idx_$2;
                    if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$3);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_term;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            v_term = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(v_term)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(v_term)) {
                                    v_term = $SKIP;
                                }
                                if ((NIL != unlexifiedP(v_term, allow_termstringsP)) && (!count.numGE(max_count))) {
                                    count = add(count, ONE_INTEGER);
                                    term_list = cons(v_term, term_list);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$4 = idx_$2;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$4);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$4);
                        final SubLObject end_id = id_index_next_id(idx_$4);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject v_term2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                if ((NIL != unlexifiedP(v_term2, allow_termstringsP)) && (!count.numGE(max_count))) {
                                    count = add(count, ONE_INTEGER);
                                    term_list = cons(v_term2, term_list);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return term_list;
    }

    public static SubLObject get_termstring_assertions_for_cyclist(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLObject mt = lexical_mt_for_cyclist(cyclist);
        return kb_mapping.gather_predicate_extent_index($$termStrings, mt, UNPROVIDED);
    }

    public static SubLObject lexical_mt_for_cyclist(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLObject mt = inference_kernel.new_cyc_query(listS($$and, listS($$conceptuallyRelated, cyclist, $list46), $list47), $$EverythingPSC, $list48).first();
        return NIL != mt ? mt : $$TemporaryLexicalAssertionsMt;
    }

    public static SubLObject acronym_char_p(final SubLObject v_char) {
        return makeBoolean((NIL != upper_case_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED)));
    }

    public static SubLObject regroup_acronyms(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_length = length(string);
        final SubLObject new_string = Strings.make_string(old_length, UNPROVIDED);
        SubLObject run_len = ZERO_INTEGER;
        SubLObject new_index = MINUS_ONE_INTEGER;
        SubLObject end_var_$6;
        SubLObject end_var;
        SubLObject index;
        SubLObject v_char;
        SubLObject next_char;
        SubLObject next_next_char;
        for (end_var = end_var_$6 = length(string), index = NIL, index = ZERO_INTEGER; !index.numGE(end_var_$6); index = number_utilities.f_1X(index)) {
            v_char = Strings.sublisp_char(string, index);
            next_char = string_utilities.char_at(string, add(index, ONE_INTEGER));
            next_next_char = string_utilities.char_at(string, add(index, TWO_INTEGER));
            if ((((!v_char.eql(CHAR_space)) || (NIL == acronym_char_p(next_char))) || ((!next_next_char.eql(CHAR_space)) && (next_next_char != NIL))) || (!run_len.numE(ONE_INTEGER))) {
                new_index = add(new_index, ONE_INTEGER);
                Strings.set_char(new_string, new_index, v_char);
            }
            if ($lex_trace_level$.getDynamicValue(thread).numGE($lex_very_verbose$.getGlobalValue())) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str50$char__a_next__a_next_next__a_run_, new SubLObject[]{ v_char, next_char, next_next_char, run_len, new_index });
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            if (NIL != acronym_char_p(v_char)) {
                run_len = add(run_len, ONE_INTEGER);
            } else {
                run_len = ZERO_INTEGER;
            }
        }
        return string_utilities.trim_sides(new_string, UNPROVIDED);
    }

    public static SubLObject phrase_from_term(final SubLObject v_term, SubLObject retain_caseP) {
        if (retain_caseP == UNPROVIDED) {
            retain_caseP = NIL;
        }
        SubLObject phrase = (NIL != constant_p(v_term)) ? regroup_acronyms(kb_utilities.string_for_unlexified_term(v_term, UNPROVIDED)) : pph_main.generate_phrase(v_term, $list51, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == cyc_individual_constantP(v_term)) && (NIL == retain_caseP)) {
            phrase = Strings.string_downcase(phrase, UNPROVIDED, UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject cyc_individual_constantP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject is_individual = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == fort_types_interface.fort_types(v_term, UNPROVIDED)) {
                is_individual = T;
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return is_individual;
    }

    public static SubLObject phrase_for_mt(final SubLObject mt) {
        SubLObject mt_phrase = phrase_from_term(mt, T);
        mt_phrase = string_utilities.strip_trailer(mt_phrase, $$$_Mt);
        if (NIL != string_utilities.ends_with(mt_phrase, $$$_G, UNPROVIDED)) {
            mt_phrase = cconcatenate($$$General_, string_utilities.strip_trailer(mt_phrase, $$$_G));
        }
        mt_phrase = string_utilities.string_substitute($$$_, $str56$___, mt_phrase, UNPROVIDED);
        mt_phrase = string_utilities.string_substitute($$$_, $str57$__, mt_phrase, UNPROVIDED);
        return string_utilities.trim_whitespace(mt_phrase);
    }

    public static SubLObject lexification_for_mt(final SubLObject mt) {
        final SubLObject tokenized_phrase = string_utilities.string_tokenize(phrase_for_mt(mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list($$multiWordString, tokenized_phrase, $$Know_TheWord, $$MassNoun, mt);
    }

    public static SubLObject lexify_mts(final SubLObject mt_list) {
        SubLObject cdolist_list_var = mt_list;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = lexification_for_mt(mt);
            try_lex_assert(formula, $$EnglishMt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject skip_mt_lexificationP(final SubLObject mt) {
        final SubLObject tokenized_phrase = string_utilities.string_tokenize(phrase_for_mt(mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject skipP = NIL;
        if (NIL == skipP) {
            SubLObject csome_list_var = tokenized_phrase;
            SubLObject word = NIL;
            word = csome_list_var.first();
            while ((NIL == skipP) && (NIL != csome_list_var)) {
                if ((NIL == list_utilities.proper_list_p(nl_trie.nl_trie_search(word, UNPROVIDED, UNPROVIDED))) && (NIL == string_utilities.is_numericP(word))) {
                    skipP = T;
                }
                csome_list_var = csome_list_var.rest();
                word = csome_list_var.first();
            } 
        }
        return skipP;
    }

    public static SubLObject all_specifiedP(final SubLObject list) {
        SubLObject unspecified = NIL;
        if (NIL == unspecified) {
            SubLObject csome_list_var = list;
            SubLObject item = NIL;
            item = csome_list_var.first();
            while ((NIL == unspecified) && (NIL != csome_list_var)) {
                if ((NIL == item) || item.equal($str62$)) {
                    unspecified = T;
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == unspecified);
    }

    public static SubLObject universal_date_to_universal_time(final SubLObject yyyymmdd) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(yyyymmdd) : "Types.integerp(yyyymmdd) " + "CommonSymbols.NIL != Types.integerp(yyyymmdd) " + yyyymmdd;
        thread.resetMultipleValues();
        final SubLObject month = numeric_date_utilities.decode_universal_date(yyyymmdd);
        final SubLObject day = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_time(ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, month, day, year, UNPROVIDED);
    }

    public static SubLObject universal_time_to_universal_date(final SubLObject universal_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return numeric_date_utilities.encode_universal_date(day, month, year);
    }

    public static SubLObject n_universal_days_ago(final SubLObject num_days) {
        final SubLObject today_seconds = get_universal_time();
        final SubLObject seconds_per_day = multiply($int$3600, $int$24);
        final SubLObject previous_seconds = subtract(today_seconds, multiply(num_days, seconds_per_day));
        return universal_time_to_universal_date(previous_seconds);
    }

    public static SubLObject extract_integer(final SubLObject numeric_string, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject value = v_default;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject num = parse_integer(numeric_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != num) {
                        value = num;
                    }
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
        return value;
    }

    public static SubLObject sort_by_pred_usage(final SubLObject list) {
        return Sort.stable_sort(list, symbol_function($sym68$_), symbol_function(NUM_PREDICATE_EXTENT_INDEX));
    }

    public static SubLObject most_specific_arg1_constraint(final SubLObject pred) {
        return most_specific_argn_constraint(pred, ONE_INTEGER);
    }

    public static SubLObject most_specific_argn_constraint(final SubLObject pred, final SubLObject arg_pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraint = $$CycLReifiableDenotationalTerm;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject constraints = remove($$CycLReifiableDenotationalTerm, cardinality_estimates.sort_by_generality_estimate(kb_accessors.argn_isa(pred, arg_pos, UNPROVIDED), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != constraints) {
                constraint = constraints.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return constraint;
    }

    public static SubLObject get_relation_argument_type(final SubLObject relation, SubLObject position) {
        return most_specific_argn_constraint(relation, position);
    }

    public static SubLObject clear_keyword_for_pos() {
        final SubLObject cs = $keyword_for_pos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_keyword_for_pos(final SubLObject pos, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args($keyword_for_pos_caching_state$.getGlobalValue(), list(pos, lexical_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject keyword_for_pos_internal(final SubLObject pos, final SubLObject lexical_mt) {
        if (NIL != lexicon_accessors.genl_posP(pos, $$ProperNoun, lexical_mt)) {
            return $PROPER_NOUN;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$Determiner, lexical_mt)) {
            return $DET;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$Pronoun, lexical_mt)) {
            return $PRONOUN;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$Noun, lexical_mt)) {
            return $NOUN;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$Verb, lexical_mt)) {
            return $VERB;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$Adjective, lexical_mt)) {
            return $ADJECTIVE;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$Adverb, lexical_mt)) {
            return $ADVERB;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$Preposition, lexical_mt)) {
            return $PREP;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$Conjunction, lexical_mt)) {
            return $CONJ;
        }
        return NIL;
    }

    public static SubLObject keyword_for_pos(final SubLObject pos, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        SubLObject caching_state = $keyword_for_pos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(KEYWORD_FOR_POS, $keyword_for_pos_caching_state$, $int$256, EQL, TWO_INTEGER, $int$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pos, lexical_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pos.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexical_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(keyword_for_pos_internal(pos, lexical_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos, lexical_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_precise_keyword_for_pos() {
        final SubLObject cs = $precise_keyword_for_pos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_precise_keyword_for_pos(final SubLObject pos, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args($precise_keyword_for_pos_caching_state$.getGlobalValue(), list(pos, lexical_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject precise_keyword_for_pos_internal(final SubLObject pos, final SubLObject lexical_mt) {
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        if (NIL != lexicon_accessors.genl_posP(pos, $$MassNoun, lexical_mt)) {
            return $MASS_NOUN;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$CountNoun, lexical_mt)) {
            return $SIMPLE_NOUN;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$AgentiveNoun, lexical_mt)) {
            return $AGENTIVE_NOUN;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$GerundiveNoun, lexical_mt)) {
            return $GERUNDIVE_NOUN;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$DeVerbalNoun, lexical_mt)) {
            return $DEVERBAL_NOUN;
        }
        if (NIL != lexicon_accessors.genl_posP(pos, $$AuxVerb, lexical_mt)) {
            return $AUX;
        }
        return keyword_for_pos(pos, UNPROVIDED);
    }

    public static SubLObject precise_keyword_for_pos(final SubLObject pos, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        SubLObject caching_state = $precise_keyword_for_pos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PRECISE_KEYWORD_FOR_POS, $precise_keyword_for_pos_caching_state$, $int$256, EQL, TWO_INTEGER, $int$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pos, lexical_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pos.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexical_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(precise_keyword_for_pos_internal(pos, lexical_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos, lexical_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_keyword_for_pred() {
        final SubLObject cs = $keyword_for_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_keyword_for_pred(final SubLObject pred, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args($keyword_for_pred_caching_state$.getGlobalValue(), list(pred, lexical_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject keyword_for_pred_internal(final SubLObject pred, final SubLObject lexical_mt) {
        return keyword_for_pos(lexicon_accessors.pos_of_pred(pred), lexical_mt);
    }

    public static SubLObject keyword_for_pred(final SubLObject pred, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        SubLObject caching_state = $keyword_for_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(KEYWORD_FOR_PRED, $keyword_for_pred_caching_state$, $int$256, EQL, TWO_INTEGER, $int$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, lexical_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexical_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(keyword_for_pred_internal(pred, lexical_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, lexical_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_precise_keyword_for_pred() {
        final SubLObject cs = $precise_keyword_for_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_precise_keyword_for_pred(final SubLObject pred, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args($precise_keyword_for_pred_caching_state$.getGlobalValue(), list(pred, lexical_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject precise_keyword_for_pred_internal(final SubLObject pred, final SubLObject lexical_mt) {
        return precise_keyword_for_pos(lexicon_accessors.pos_of_pred(pred), lexical_mt);
    }

    public static SubLObject precise_keyword_for_pred(final SubLObject pred, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        SubLObject caching_state = $precise_keyword_for_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PRECISE_KEYWORD_FOR_PRED, $precise_keyword_for_pred_caching_state$, $int$256, EQL, TWO_INTEGER, $int$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, lexical_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexical_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(precise_keyword_for_pred_internal(pred, lexical_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, lexical_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject invalid_formulaP(final SubLObject formula, final SubLObject mt) {
        SubLObject status = NIL;
        if (NIL == wff.el_wffP(formula, mt, UNPROVIDED)) {
            status = wff.explanation_of_why_not_wff(formula, mt, UNPROVIDED);
        }
        return status;
    }

    public static SubLObject invalid_lexificationP(final SubLObject formula, final SubLObject mt) {
        SubLObject status = invalid_formulaP(formula, mt);
        if (NIL != status) {
            status = format(NIL, $str111$invalid_formula____a__, status);
        }
        return status;
    }

    public static SubLObject lex_pos_for_keyword(final SubLObject pos_keyword) {
        return lexicon_accessors.pos_for_keyword(pos_keyword, UNPROVIDED);
    }

    public static SubLObject parts_of_speech(final SubLObject word_form) {
        SubLObject pos_list = lexicon_accessors.pos_of_string(word_form, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == pos_list) {
            SubLObject csome_list_var = lexicon_accessors.denots_of_string(word_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject denot = NIL;
            denot = csome_list_var.first();
            while ((NIL == pos_list) && (NIL != csome_list_var)) {
                if (NIL != isa.isa_in_any_mtP(denot, $$Individual)) {
                    pos_list = $list113;
                }
                csome_list_var = csome_list_var.rest();
                denot = csome_list_var.first();
            } 
        }
        return pos_list;
    }

    public static SubLObject clear_pluralize_word() {
        final SubLObject cs = $pluralize_word_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pluralize_word(final SubLObject word, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pluralize_word_caching_state$.getGlobalValue(), list(word, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pluralize_word_internal(final SubLObject word, final SubLObject mt) {
        return morphology.pluralize_string(morphology.find_stem(word, $NOUN), mt);
    }

    public static SubLObject pluralize_word(final SubLObject word, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $pluralize_word_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PLURALIZE_WORD, $pluralize_word_caching_state$, $int$2048, EQUAL, TWO_INTEGER, $int$1024);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pluralize_word_internal(word, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_singularize_word() {
        final SubLObject cs = $singularize_word_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_singularize_word(final SubLObject word, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($singularize_word_caching_state$.getGlobalValue(), list(word, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject singularize_word_internal(final SubLObject word, final SubLObject mt) {
        return morphology.plural_noun_to_sg(word, mt);
    }

    public static SubLObject singularize_word(final SubLObject word, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $singularize_word_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SINGULARIZE_WORD, $singularize_word_caching_state$, $int$2048, EQUAL, TWO_INTEGER, $int$1024);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(singularize_word_internal(word, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_basic_preds_for_part_of_speech() {
        final SubLObject cs = $basic_preds_for_part_of_speech_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_basic_preds_for_part_of_speech(final SubLObject pos_keyword) {
        return memoization_state.caching_state_remove_function_results_with_args($basic_preds_for_part_of_speech_caching_state$.getGlobalValue(), list(pos_keyword), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject basic_preds_for_part_of_speech_internal(final SubLObject pos_keyword) {
        return intersection(lexicon_utilities.preds_for_keyword(pos_keyword), lexicon_vars.$root_form_speech_parts$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject basic_preds_for_part_of_speech(final SubLObject pos_keyword) {
        SubLObject caching_state = $basic_preds_for_part_of_speech_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(BASIC_PREDS_FOR_PART_OF_SPEECH, $basic_preds_for_part_of_speech_caching_state$, $int$64, EQ, ONE_INTEGER, TWELVE_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos_keyword, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(basic_preds_for_part_of_speech_internal(pos_keyword)));
            memoization_state.caching_state_put(caching_state, pos_keyword, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_find_root_wordform() {
        final SubLObject cs = $find_root_wordform_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_find_root_wordform(final SubLObject wordform) {
        return memoization_state.caching_state_remove_function_results_with_args($find_root_wordform_caching_state$.getGlobalValue(), list(wordform), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_root_wordform_internal(final SubLObject wordform) {
        final SubLObject word_units_to_check = append(lexicon_accessors.words_of_stringXpos(wordform, $VERB, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon_accessors.words_of_stringXpos(wordform, $NOUN, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon_cache.words_of_string(wordform, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject root = NIL;
        if (NIL == root) {
            SubLObject csome_list_var;
            SubLObject word_unit;
            for (csome_list_var = word_units_to_check, word_unit = NIL, word_unit = csome_list_var.first(); (NIL == root) && (NIL != csome_list_var); root = lexicon_cache.ordered_strings_of_word_unit(word_unit, lexicon_vars.$root_form_speech_parts$.getGlobalValue(), UNPROVIDED, UNPROVIDED).first() , csome_list_var = csome_list_var.rest() , word_unit = csome_list_var.first()) {
            }
        }
        if (NIL == root) {
            SubLObject csome_list_var = lexicon_cache.words_of_string(wordform, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject word_unit = NIL;
            word_unit = csome_list_var.first();
            while ((NIL == root) && (NIL != csome_list_var)) {
                final SubLObject label = cb_string_for_fort(word_unit);
                root = Strings.string_downcase(string_utilities.string_upto(label, CHAR_hyphen), UNPROVIDED, UNPROVIDED);
                csome_list_var = csome_list_var.rest();
                word_unit = csome_list_var.first();
            } 
        }
        if (NIL == root) {
            root = wordform;
        }
        return root;
    }

    public static SubLObject find_root_wordform(final SubLObject wordform) {
        SubLObject caching_state = $find_root_wordform_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FIND_ROOT_WORDFORM, $find_root_wordform_caching_state$, $int$2048, EQUAL, ONE_INTEGER, $int$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, wordform, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(find_root_wordform_internal(wordform)));
            memoization_state.caching_state_put(caching_state, wordform, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject lexified_phrases_for_term(final SubLObject v_term, SubLObject include_preds) {
        if (include_preds == UNPROVIDED) {
            include_preds = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrases = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind($$AllLexicalMicrotheoryPSC, thread);
            phrases = remove_duplicates(pph_methods_lexicon.all_phrases_for_term(v_term, include_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return phrases;
    }

    public static SubLObject nonplural_lexified_phrases_for_term(final SubLObject v_term) {
        return lexified_phrases_for_term(v_term, lexicon_vars.$root_form_speech_parts$.getGlobalValue());
    }

    public static SubLObject join_words(final SubLObject word_list) {
        return string_utilities.bunge(word_list, UNPROVIDED);
    }

    public static SubLObject has_vowel(final SubLObject string) {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(string), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            if (NIL != morphology.vowel_charP(Strings.sublisp_char(string, i), T)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject guess_stem(final SubLObject wordform, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $SIMPLE_NOUN;
        }
        SubLObject stem = morphology.find_stem(wordform, UNPROVIDED);
        if (stem.equalp(wordform) && (NIL == lexicon_cache.words_of_string(wordform, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            SubLObject test_stem = stem;
            final SubLObject pcase_var = pos_keyword;
            if (pcase_var.eql($VERB)) {
                test_stem = morphology.inflected_verb_to_infinitive(wordform);
            } else
                if (pcase_var.eql($SIMPLE_NOUN)) {
                    test_stem = morphology.plural_noun_to_sg(wordform, UNPROVIDED);
                }

            if (NIL != has_vowel(test_stem)) {
                stem = test_stem;
            }
        }
        return stem;
    }

    public static SubLObject clear_is_abbreviation_predicate() {
        final SubLObject cs = $is_abbreviation_predicate_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_is_abbreviation_predicate(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($is_abbreviation_predicate_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject is_abbreviation_predicate_internal(final SubLObject pred) {
        return fi.fi_ask_int(listS($$and, listS($$arg2Isa, pred, $list129), $list130), $$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject is_abbreviation_predicate(final SubLObject pred) {
        SubLObject caching_state = $is_abbreviation_predicate_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(IS_ABBREVIATION_PREDICATE, $is_abbreviation_predicate_caching_state$, $int$128, EQL, ONE_INTEGER, $int$40);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(is_abbreviation_predicate_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_abbreviation_predicates() {
        SubLObject abbrev_preds = NIL;
        SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$properNameStrings, UNPROVIDED, UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != is_abbreviation_predicate(pred)) {
                abbrev_preds = cons(pred, abbrev_preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return abbrev_preds;
    }

    public static SubLObject clear_examples_for_pred() {
        final SubLObject cs = $examples_for_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_examples_for_pred(final SubLObject pred, SubLObject num) {
        if (num == UNPROVIDED) {
            num = $num_predicate_examples$.getGlobalValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($examples_for_pred_caching_state$.getGlobalValue(), list(pred, num), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject examples_for_pred_internal(final SubLObject pred, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($lex_trace_level$.getDynamicValue(thread).numGE(max($lex_trace_level$.getDynamicValue(thread), $lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str137$examples_for_pred__a__a___, pred, num);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        final SubLObject positive_examples = positive_examples_for_pred(pred);
        SubLObject examples = list_utilities.first_n(num, positive_examples);
        SubLObject got_enoughP;
        SubLObject real_examples;
        SubLObject real_example;
        for (got_enoughP = list_utilities.lengthGE(examples, num, UNPROVIDED), real_examples = NIL, real_example = NIL, real_examples = real_examples_for_pred(pred), real_example = real_examples.first(); (NIL != real_example) && (NIL == got_enoughP); real_example = real_examples.first()) {
            if (NIL == subl_promotions.memberP(real_example, examples, symbol_function(EQUALP), UNPROVIDED)) {
                examples = cons(real_example, examples);
                got_enoughP = list_utilities.lengthGE(examples, num, UNPROVIDED);
            }
            real_examples = real_examples.rest();
        }
        return nreverse(examples);
    }

    public static SubLObject examples_for_pred(final SubLObject pred, SubLObject num) {
        if (num == UNPROVIDED) {
            num = $num_predicate_examples$.getGlobalValue();
        }
        SubLObject caching_state = $examples_for_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(EXAMPLES_FOR_PRED, $examples_for_pred_caching_state$, $int$256, EQL, TWO_INTEGER, $int$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, num);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && num.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(examples_for_pred_internal(pred, num)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, num));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject positive_examples_for_pred(final SubLObject pred) {
        SubLObject examples = other_positive_examples_for_pred(pred);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(pred, $$examples_Positive, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject formula_text = NIL;
        formula_text = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = read_from_string_ignoring_errors(formula_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject phrase = (NIL != el_formula_p(formula)) ? cycl_utilities.formula_arg2(formula, UNPROVIDED) : NIL;
            if (phrase.isString()) {
                final SubLObject item_var = phrase;
                if (NIL == member(item_var, examples, symbol_function(EQL), symbol_function(IDENTITY))) {
                    examples = cons(item_var, examples);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula_text = cdolist_list_var.first();
        } 
        return examples;
    }

    public static SubLObject other_positive_examples_for_pred(final SubLObject pred) {
        SubLObject examples = NIL;
        SubLObject cdolist_list_var = $list140;
        SubLObject example_pred = NIL;
        example_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$7 = kb_mapping_utilities.pred_values_in_any_mt(pred, example_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject formula = NIL;
            formula = cdolist_list_var_$7.first();
            while (NIL != cdolist_list_var_$7) {
                final SubLObject phrase = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                if (phrase.isString()) {
                    final SubLObject item_var = phrase;
                    if (NIL == member(item_var, examples, symbol_function(EQL), symbol_function(IDENTITY))) {
                        examples = cons(item_var, examples);
                    }
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                formula = cdolist_list_var_$7.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            example_pred = cdolist_list_var.first();
        } 
        return examples;
    }

    public static SubLObject real_examples_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject examples = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$8 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$9 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$10 = NIL;
                                final SubLObject token_var_$11 = NIL;
                                while (NIL == done_var_$10) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                    final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(assertion));
                                    if ((NIL != valid_$12) && (NIL != assertions_high.gaf_assertionP(assertion))) {
                                        final SubLObject phrase = assertions_high.gaf_arg2(assertion);
                                        if (phrase.isString()) {
                                            examples = cons(phrase, examples);
                                        }
                                    }
                                    done_var_$10 = makeBoolean(NIL == valid_$12);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$9, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return examples;
    }

    public static SubLObject try_lex_assert(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($lex_trace_level$.getDynamicValue(thread).numGE(max($lex_trace_level$.getDynamicValue(thread), $lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str143$try_lex_assert__s_in_MT__a__, formula, mt);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        final SubLObject ok = misc_kb_utilities.try_assert(formula, mt, strength, direction);
        if ((NIL != ok) && (NIL != forts.fort_p(lexification_reviewer()))) {
            misc_kb_utilities.try_assert(list($$toBeReviewedBy, list($$ist, mt, formula), lexification_reviewer()), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
        }
        return ok;
    }

    public static SubLObject try_lex_assert_now(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($lex_trace_level$.getDynamicValue(thread).numGE(max($lex_trace_level$.getDynamicValue(thread), $lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str147$try_lex_assert_now__s_in_MT__a__, formula, mt);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        final SubLObject ok = misc_kb_utilities.try_assert_now(formula, mt, strength, direction);
        if ((NIL != ok) && (NIL != forts.fort_p(lexification_reviewer()))) {
            misc_kb_utilities.try_assert(list($$toBeReviewedBy, list($$ist, mt, formula), lexification_reviewer()), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
        }
        return ok;
    }

    public static SubLObject lex_string_tokenize(final SubLObject phrase, SubLObject separate_punctuationP) {
        if (separate_punctuationP == UNPROVIDED) {
            separate_punctuationP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return standard_tokenization.tokenize_sentence(lex_remove_final_punctuation(phrase), $lex_white_space_chars$.getDynamicValue(thread), NIL != separate_punctuationP ? $lex_punctuation_chars$.getDynamicValue(thread) : NIL, UNPROVIDED);
    }

    public static SubLObject lex_remove_final_punctuation(SubLObject phrase) {
        for (final SubLThread thread = SubLProcess.currentSubLThread(); (NIL != string_utilities.non_empty_stringP(phrase)) && (NIL != member(string_utilities.last_char(phrase), $lex_punctuation_chars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)); phrase = string_utilities.strip_final(phrase, UNPROVIDED)) {
        }
        return phrase;
    }

    public static SubLObject lex_find_word_in_string(final SubLObject wordstring, final SubLObject string) {
        return position(wordstring, lex_string_tokenize(string, UNPROVIDED), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lex_describe_term(final SubLObject v_term, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject description = NIL;
        if (lexical_mt.isString()) {
            lexical_mt = misc_kb_utilities.fort_for_string(lexical_mt);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(lexical_mt, thread);
            description = string_utilities.unquote_string(pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return description;
    }

    public static SubLObject lex_fort_for_string(final SubLObject fort_label) {
        final SubLObject fort = misc_kb_utilities.fort_for_string(fort_label);
        if ((!fort.eql($$DeadTerm)) || (NIL != string_utilities.substringP($$$DeadTerm, fort_label, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return fort;
        }
        return NIL;
    }

    public static SubLObject lex_arity_in_any_mt(final SubLObject v_term) {
        final SubLObject v_arity = arity.arity(v_term);
        return NIL != v_arity ? v_arity : ZERO_INTEGER;
    }

    public static SubLObject loose_lexification_phrases_for_term(final SubLObject v_term) {
        SubLObject phrases = NIL;
        SubLObject cdolist_list_var = lexicon_utilities.loose_lexifications_for_term(v_term);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                final SubLObject item_var = assertions_high.gaf_arg2(assertion);
                if (NIL == member(item_var, phrases, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                    phrases = cons(item_var, phrases);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return phrases;
    }

    public static SubLObject preferred_loose_lexification_phrase_for_term(final SubLObject v_term) {
        final SubLObject phrase = kb_mapping_utilities.fpred_value_in_any_mt(v_term, $$preferredTermStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return phrase;
    }

    public static SubLObject proper_lexification_phrases_for_term(final SubLObject v_term) {
        SubLObject phrases = NIL;
        SubLObject cdolist_list_var = lexicon_utilities.proper_lexifications_for_term(v_term);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = phrases_from_semantic_assertion(assertion, UNPROVIDED);
            SubLObject phrase = NIL;
            phrase = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                final SubLObject item_var = phrase;
                if (NIL == member(item_var, phrases, symbol_function(EQL), symbol_function(IDENTITY))) {
                    phrases = cons(item_var, phrases);
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                phrase = cdolist_list_var_$14.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return phrases;
    }

    public static SubLObject phrases_from_semantic_assertion(final SubLObject assertion, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        SubLObject phrases = NIL;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(assertions_high.assertion_mt(assertion), thread);
                final SubLObject air_pred = assertions_high.gaf_arg0(assertion);
                final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(air_pred);
                final SubLObject v_term = lexicon_utilities.term_from_nl_assertion(assertion);
                if (NIL != pos_arg) {
                    final SubLObject pos = assertions_high.gaf_arg(assertion, pos_arg);
                    final SubLObject pos_preds = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
                    SubLObject cdolist_list_var = pph_utilities.pph_filter_preds(nl_preds, pos_preds, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject phrase = pph_data_structures.pph_phrase_output_item_string(pph_methods_lexicon.generate_phrase_from_as(assertion, v_term, list(pred), NIL, UNPROVIDED, UNPROVIDED));
                        if (NIL != phrase) {
                            final SubLObject item_var = phrase;
                            if (NIL == member(item_var, phrases, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                phrases = cons(item_var, phrases);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                } else {
                    final SubLObject var = pph_data_structures.pph_phrase_output_item_string(pph_methods_lexicon.generate_phrase_from_as(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    if (NIL != var) {
                        final SubLObject item_var2 = var;
                        if (NIL == member(item_var2, phrases, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            phrases = cons(item_var2, phrases);
                        }
                    }
                }
            } finally {
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Mapping.mapcar(PPH_STRING_TO_CYCL, phrases);
    }

    public static SubLObject phrases_from_lexification_sentence(final SubLObject sentence, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_formulaic_sentence_p(sentence) : "cycl_grammar.cycl_formulaic_sentence_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_formulaic_sentence_p(sentence) " + sentence;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                final SubLObject air_pred = cycl_utilities.formula_arg0(sentence);
                final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(air_pred);
                SubLObject phrases = list(phrase_from_lexification_sentence(sentence, nl_preds));
                if (NIL != pos_arg) {
                    final SubLObject pos = cycl_utilities.formula_arg(sentence, pos_arg, UNPROVIDED);
                    final SubLObject pos_preds = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
                    SubLObject cdolist_list_var = pph_utilities.pph_filter_preds(nl_preds, pos_preds, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject var = phrase_from_lexification_sentence(sentence, list(pred));
                        if (NIL != var) {
                            final SubLObject item_var = var;
                            if (NIL == member(item_var, phrases, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                phrases = cons(item_var, phrases);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                } else {
                    final SubLObject var2 = phrase_from_lexification_sentence(sentence, nl_preds);
                    if (NIL != var2) {
                        final SubLObject item_var2 = var2;
                        if (NIL == member(item_var2, phrases, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            phrases = cons(item_var2, phrases);
                        }
                    }
                }
                return values(list_utilities.last_one(phrases), butlast(phrases, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject phrase_from_lexification_sentence(final SubLObject sentence, final SubLObject nl_preds) {
        return pph_string.pph_string_to_cycl(pph_data_structures.pph_phrase_output_item_string(pph_methods_lexicon.generate_phrase_from_lexification_sentence(sentence, nl_preds, NIL, UNPROVIDED)));
    }

    public static SubLObject is_nameable_entityP(final SubLObject v_term) {
        return makeBoolean((NIL != is_nameable_individualP(v_term)) || (NIL != is_nameable_collectionP(v_term)));
    }

    public static SubLObject is_nameable_individualP(final SubLObject v_term) {
        return isa.isa_in_any_mtP(v_term, $$Individual);
    }

    public static SubLObject is_nameable_collectionP(final SubLObject v_term) {
        return list_utilities.sublisp_boolean(fi.fi_ask_int(list($$nameableCollection, v_term), $$EverythingPSC, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject lex_empty_stringP(final SubLObject string) {
        return makeBoolean((NIL != string_utilities.empty_string_p(string)) || (NIL == string));
    }

    public static SubLObject clear_lexification_caches() {
        clear_keyword_for_pos();
        clear_precise_keyword_for_pos();
        clear_is_abbreviation_predicate();
        clear_examples_for_pred();
        clear_pluralize_word();
        clear_singularize_word();
        clear_find_root_wordform();
        clear_is_abbreviation_predicate();
        return T;
    }

    public static SubLObject string_for_fort(final SubLObject fort) {
        return NIL != forts.valid_fortP(fort) ? cb_fort_display_string(fort) : $str62$;
    }

    public static SubLObject string_for_field(final SubLObject field_value) {
        return NIL != field_value ? string_utilities.to_string(field_value) : $str62$;
    }

    public static SubLObject is_relationalP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relationalP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if ((NIL != fort_types_interface.predicateP(v_term)) || (NIL != fort_types_interface.functionP(v_term))) {
                relationalP = T;
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return relationalP;
    }

    public static SubLObject is_functionalP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject functionalP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != fort_types_interface.functionP(v_term)) {
                functionalP = T;
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return functionalP;
    }

    public static SubLObject get_term_comments(final SubLObject v_term) {
        final SubLObject comments = kb_mapping_utilities.pred_values_in_any_mt(v_term, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject double_newline = Strings.make_string(TWO_INTEGER, CHAR_newline);
        SubLObject formatted_comments = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject list_var = NIL;
            SubLObject comment = NIL;
            SubLObject i = NIL;
            list_var = comments;
            comment = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , comment = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (i.numG(ZERO_INTEGER)) {
                    write_string(double_newline, stream, UNPROVIDED, UNPROVIDED);
                }
                write_string(substitute(CHAR_space, CHAR_newline, comment, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
            }
            formatted_comments = get_output_stream_string(stream);
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
        return formatted_comments;
    }

    public static SubLObject likely_has_part_of_speechP(final SubLObject part_of_speech, final SubLObject wordform, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject ok = subl_promotions.memberP(part_of_speech, lexicon_accessors.pos_of_string(wordform, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        SubLObject indicator_suffixes = NIL;
        if (part_of_speech.eql($$Adjective)) {
            indicator_suffixes = $list158;
        } else
            if (part_of_speech.eql($$Adverb)) {
                indicator_suffixes = $list159;
            } else
                if (part_of_speech.eql($$Noun)) {
                    indicator_suffixes = $list160;
                } else
                    if (part_of_speech.eql($$Verb)) {
                        indicator_suffixes = $list161;
                    } else
                        if (part_of_speech.eql($$GerundiveNoun)) {
                            indicator_suffixes = $list162;
                        } else
                            if (part_of_speech.eql($$AgentiveNoun)) {
                                indicator_suffixes = $list163;
                            }





        if (NIL == ok) {
            SubLObject csome_list_var = indicator_suffixes;
            SubLObject suffix = NIL;
            suffix = csome_list_var.first();
            while ((NIL == ok) && (NIL != csome_list_var)) {
                if (NIL != string_utilities.ends_with(wordform, suffix, UNPROVIDED)) {
                    ok = T;
                }
                csome_list_var = csome_list_var.rest();
                suffix = csome_list_var.first();
            } 
        }
        return ok;
    }

    public static SubLObject likely_adverbP(final SubLObject wordform, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return likely_has_part_of_speechP($$Adverb, wordform, lexical_mt);
    }

    public static SubLObject likely_adjectiveP(final SubLObject wordform, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return likely_has_part_of_speechP($$Adjective, wordform, lexical_mt);
    }

    public static SubLObject likely_nounP(final SubLObject wordform, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return likely_has_part_of_speechP($$Noun, wordform, lexical_mt);
    }

    public static SubLObject likely_verbP(final SubLObject wordform, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return likely_has_part_of_speechP($$Verb, wordform, lexical_mt);
    }

    public static SubLObject word_unit_part_of_speech_usage(final SubLObject word_unit, final SubLObject part_of_speech) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject usage = ZERO_INTEGER;
        if ((NIL != indexed_term_p(word_unit)) && (NIL != indexed_term_p(part_of_speech))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                usage = length(virtual_indexing.assertions_mentioning_terms(list(word_unit, part_of_speech), UNPROVIDED));
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return usage;
    }

    public static SubLObject wordform_part_of_speech_usage(final SubLObject wordform, final SubLObject part_of_speech) {
        SubLObject usage = ZERO_INTEGER;
        SubLObject cdolist_list_var = lexicon_accessors.words_of_stringXspeech_part(wordform, part_of_speech, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject word_unit = NIL;
        word_unit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            usage = add(usage, word_unit_part_of_speech_usage(word_unit, part_of_speech));
            cdolist_list_var = cdolist_list_var.rest();
            word_unit = cdolist_list_var.first();
        } 
        return usage;
    }

    public static SubLObject headword_usage(final SubLObject word_unit, SubLObject speech_part, SubLObject position) {
        if (speech_part == UNPROVIDED) {
            speech_part = $ANY;
        }
        if (position == UNPROVIDED) {
            position = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != subl_promotions.memberP(position, $list164, UNPROVIDED, UNPROVIDED)) {
                final SubLObject node_var = $$HeadInitialMultiWordPhrasePred;
                final SubLObject _prev_bind_0_$16 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$17 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$18 = node_var;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str177$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$18, UNPROVIDED);
                                                while (NIL != node_var_$18) {
                                                    final SubLObject tt_node_var = node_var_$18;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$30;
                                                                                    for (iteration_state_$30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$30); iteration_state_$30 = dictionary_contents.do_dictionary_contents_next(iteration_state_$30)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$30);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject pred;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(pred)) {
                                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject pred2 = NIL;
                                                                                                        pred2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(pred2)) {
                                                                                                                    count = add(count, headword_usage_for_pred(word_unit, speech_part, pred2));
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            pred2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$23, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$30);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$22, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt2 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(pred)) {
                                                                                                            count = add(count, headword_usage_for_pred(word_unit, speech_part, pred));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$34 = sol;
                                                                                                    SubLObject pred2 = NIL;
                                                                                                    pred2 = csome_list_var_$34.first();
                                                                                                    while (NIL != csome_list_var_$34) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(pred2)) {
                                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred2));
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$34 = csome_list_var_$34.rest();
                                                                                                        pred2 = csome_list_var_$34.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$25, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$24, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list180);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$35;
                                                                    final SubLObject new_list = cdolist_list_var_$35 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$35.first();
                                                                    while (NIL != cdolist_list_var_$35) {
                                                                        final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject pred3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, pred3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(pred3)) {
                                                                                            count = add(count, headword_usage_for_pred(word_unit, speech_part, pred3));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject pred4 = NIL;
                                                                                    pred4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(pred4)) {
                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred4));
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        pred4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$26, thread);
                                                                        }
                                                                        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                                                                        generating_fn = cdolist_list_var_$35.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$21, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$18);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$31;
                                                                                    for (iteration_state_$31 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$31); iteration_state_$31 = dictionary_contents.do_dictionary_contents_next(iteration_state_$31)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$31);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$31);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$36;
                                                                    final SubLObject new_list2 = cdolist_list_var_$36 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$36.first();
                                                                    while (NIL != cdolist_list_var_$36) {
                                                                        final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                                        }
                                                                        cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                                                        generating_fn2 = cdolist_list_var_$36.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$22, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$27, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    } 
                                                    node_var_$18 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$26, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$20, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str181$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$19, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$18, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$17, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$17, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$16, thread);
                }
            }
            if (NIL != subl_promotions.memberP(position, $list182, UNPROVIDED, UNPROVIDED)) {
                final SubLObject node_var = $$HeadFinalMultiWordPhrasePred;
                final SubLObject _prev_bind_0_$33 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$23 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$19 = node_var;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$34 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str177$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$19, UNPROVIDED);
                                                while (NIL != node_var_$19) {
                                                    final SubLObject tt_node_var = node_var_$19;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$38 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$32;
                                                                                    for (iteration_state_$32 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$32); iteration_state_$32 = dictionary_contents.do_dictionary_contents_next(iteration_state_$32)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$32);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject pred;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(pred)) {
                                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject pred2 = NIL;
                                                                                                        pred2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(pred2)) {
                                                                                                                    count = add(count, headword_usage_for_pred(word_unit, speech_part, pred2));
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            pred2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$40, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$32);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$39, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt2 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(pred)) {
                                                                                                            count = add(count, headword_usage_for_pred(word_unit, speech_part, pred));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$35 = sol;
                                                                                                    SubLObject pred2 = NIL;
                                                                                                    pred2 = csome_list_var_$35.first();
                                                                                                    while (NIL != csome_list_var_$35) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(pred2)) {
                                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred2));
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$35 = csome_list_var_$35.rest();
                                                                                                        pred2 = csome_list_var_$35.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$42, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$41, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list180);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$37;
                                                                    final SubLObject new_list = cdolist_list_var_$37 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$37.first();
                                                                    while (NIL != cdolist_list_var_$37) {
                                                                        final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject pred3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, pred3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(pred3)) {
                                                                                            count = add(count, headword_usage_for_pred(word_unit, speech_part, pred3));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject pred4 = NIL;
                                                                                    pred4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(pred4)) {
                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred4));
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        pred4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$43, thread);
                                                                        }
                                                                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                                                        generating_fn = cdolist_list_var_$37.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$27, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$38, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$44 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$19);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$33;
                                                                                    for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$46, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$45, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$38;
                                                                    final SubLObject new_list2 = cdolist_list_var_$38 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$38.first();
                                                                    while (NIL != cdolist_list_var_$38) {
                                                                        final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$47, thread);
                                                                        }
                                                                        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                                                        generating_fn2 = cdolist_list_var_$38.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$28, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$44, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    } 
                                                    node_var_$19 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$27, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$26, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$37, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str181$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$36, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$24, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$35, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$34, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$23, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$33, thread);
                }
            }
            if (NIL != subl_promotions.memberP(position, $list184, UNPROVIDED, UNPROVIDED)) {
                final SubLObject node_var = $$HeadMedialMultiWordPhrasePred;
                final SubLObject _prev_bind_0_$50 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$20 = node_var;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$30 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str177$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str172$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$32 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$20, UNPROVIDED);
                                                while (NIL != node_var_$20) {
                                                    final SubLObject tt_node_var = node_var_$20;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$55 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$34;
                                                                                    for (iteration_state_$34 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$34); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next(iteration_state_$34)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$34);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject pred;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(pred)) {
                                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject pred2 = NIL;
                                                                                                        pred2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(pred2)) {
                                                                                                                    count = add(count, headword_usage_for_pred(word_unit, speech_part, pred2));
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            pred2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$57, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$34);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$56, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt2 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list180);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(pred)) {
                                                                                                            count = add(count, headword_usage_for_pred(word_unit, speech_part, pred));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$36 = sol;
                                                                                                    SubLObject pred2 = NIL;
                                                                                                    pred2 = csome_list_var_$36.first();
                                                                                                    while (NIL != csome_list_var_$36) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(pred2)) {
                                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred2));
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$36 = csome_list_var_$36.rest();
                                                                                                        pred2 = csome_list_var_$36.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$59, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$58, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list180);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$39;
                                                                    final SubLObject new_list = cdolist_list_var_$39 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$39.first();
                                                                    while (NIL != cdolist_list_var_$39) {
                                                                        final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject pred3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, pred3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(pred3)) {
                                                                                            count = add(count, headword_usage_for_pred(word_unit, speech_part, pred3));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject pred4 = NIL;
                                                                                    pred4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(pred4)) {
                                                                                                count = add(count, headword_usage_for_pred(word_unit, speech_part, pred4));
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        pred4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$60, thread);
                                                                        }
                                                                        cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                                                        generating_fn = cdolist_list_var_$39.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$33, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$55, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$61 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$20);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$35;
                                                                                    for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$63, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$62, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str179$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$40;
                                                                    final SubLObject new_list2 = cdolist_list_var_$40 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$40.first();
                                                                    while (NIL != cdolist_list_var_$40) {
                                                                        final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str178$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$64, thread);
                                                                        }
                                                                        cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                                                        generating_fn2 = cdolist_list_var_$40.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$34, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$61, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    } 
                                                    node_var_$20 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$28, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$32, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$54, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str181$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$31, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$53, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$30, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$52, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values5 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values5);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$51, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values6 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values6);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$29, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$50, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject headword_usage_for_pred(final SubLObject word_unit, final SubLObject speech_part, final SubLObject pred) {
        final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(pred);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(pred);
        if (!wu_arg.isInteger()) {
            return ZERO_INTEGER;
        }
        if (speech_part == $ANY) {
            return kb_indexing.num_gaf_arg_index(word_unit, wu_arg, pred, UNPROVIDED);
        }
        if (!pos_arg.isInteger()) {
            return ZERO_INTEGER;
        }
        if (NIL != lexicon_accessors.speech_partP(speech_part, UNPROVIDED)) {
            SubLObject count = ZERO_INTEGER;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, wu_arg, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, wu_arg, pred);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$106 = NIL;
                            final SubLObject token_var_$107 = NIL;
                            while (NIL == done_var_$106) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$107);
                                final SubLObject valid_$108 = makeBoolean(!token_var_$107.eql(as));
                                if ((NIL != valid_$108) && (NIL != lexicon_accessors.genl_posP(assertions_high.gaf_arg(as, pos_arg), speech_part, UNPROVIDED))) {
                                    count = add(count, ONE_INTEGER);
                                }
                                done_var_$106 = makeBoolean(NIL == valid_$108);
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
            return count;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject most_frequent_headword(final SubLObject phrase_words, SubLObject ignore_capitalized_words) {
        if (ignore_capitalized_words == UNPROVIDED) {
            ignore_capitalized_words = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject position;
        final SubLObject last_position = position = number_utilities.f_1_(length(phrase_words));
        SubLObject max_usage = ZERO_INTEGER;
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = phrase_words;
        word = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            SubLObject usage = ZERO_INTEGER;
            final SubLObject word_position = (i.isZero()) ? $INITIAL : i.eql(last_position) ? $FINAL : $MEDIAL;
            if ((NIL == lexicon_accessors.closed_lexical_class_stringP(word, UNPROVIDED)) && ((NIL == ignore_capitalized_words) || (NIL == initial_capitalizedP(word)))) {
                SubLObject cdolist_list_var = lexicon_cache.words_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject word_unit = NIL;
                word_unit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    usage = add(usage, ONE_INTEGER);
                    SubLObject cdolist_list_var_$109 = lexicon_accessors.pos_of_stringXword(word, word_unit, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject pos = NIL;
                    pos = cdolist_list_var_$109.first();
                    while (NIL != cdolist_list_var_$109) {
                        usage = add(usage, headword_usage(word_unit, pos, word_position));
                        cdolist_list_var_$109 = cdolist_list_var_$109.rest();
                        pos = cdolist_list_var_$109.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    word_unit = cdolist_list_var.first();
                } 
                if ($lex_trace_level$.getDynamicValue(thread).numGE(max($lex_trace_level$.getDynamicValue(thread), $lex_verbose$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), $str189$word__a_usage___a__, i, usage);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                if (usage.numGE(max_usage)) {
                    if ($lex_trace_level$.getDynamicValue(thread).numGE(max($lex_trace_level$.getDynamicValue(thread), $lex_verbose$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), $str190$Setting_new_guessed_headword_to__, word);
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }
                    position = i;
                    max_usage = usage;
                }
            }
        }
        return position;
    }

    public static SubLObject initial_capitalizedP(final SubLObject word) {
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        final SubLObject first_letter = string_utilities.first_char(word);
        return upper_case_p(first_letter);
    }

    public static SubLObject most_likely_headword(final SubLObject phrase_words) {
        return most_frequent_headword(phrase_words, T);
    }

    public static SubLObject other_lexified_phrases_for_term(final SubLObject cyc_term, final SubLObject lex_phrase) {
        final SubLObject all_other_phrases = remove(lex_phrase, lexified_phrases_for_term(cyc_term, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject other_phrases = list_utilities.remove_if_not(symbol_function(STRINGP), all_other_phrases, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return Sort.sort(other_phrases, $sym191$CYCL_STRING__, UNPROVIDED);
    }

    public static SubLObject possibly_lexify_terrorist_attack(final SubLObject attack, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject skipP = makeBoolean(NIL == $terrorist_attack_lexification_worksP$.getGlobalValue());
        if (NIL == skipP) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$EnglishMt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                skipP = kb_mapping_utilities.some_pred_value(attack, $$definiteDescriptions, ONE_INTEGER, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != skipP ? $DONE : lexify_terrorist_attack(attack, problem_store);
    }

    public static SubLObject lexify_terrorist_attack(final SubLObject attack, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = NIL;
        SubLObject time = ZERO_INTEGER;
        SubLObject lexifications = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject _prev_bind_0 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        try {
            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
            lexifications = terrorist_attack_lexifications(attack, problem_store);
        } finally {
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = lexifications;
        SubLObject lex_info = NIL;
        lex_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lex_info;
            SubLObject string = NIL;
            SubLObject assertion_el_set = NIL;
            destructuring_bind_must_consp(current, datum, $list195);
            string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list195);
            assertion_el_set = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject lex_sentence = NIL;
                lex_sentence = list($$definiteDescriptions, attack, string);
                if (NIL != ke.ke_assert_now(lex_sentence, $$TerrorismLexicalMt, $DEFAULT, $FORWARD)) {
                    strings = cons(string, strings);
                }
            } else {
                cdestructuring_bind_error(datum, $list195);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_info = cdolist_list_var.first();
        } 
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return values(strings, time);
    }

    public static SubLObject terrorist_attack_lexifications(final SubLObject attack, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        thread.resetMultipleValues();
        final SubLObject sentence = terrorist_attack_lexification_query_args(attack, problem_store);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        results = ask_utilities.query_template($list198, sentence, mt, query_properties);
        return results;
    }

    public static SubLObject terrorist_attack_lexification_query_args(final SubLObject attack, SubLObject problem_store) {
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject sentence = kb_query.kbq_query_arguments(terrorist_attack_lexification_kbq(), UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = $list199;
        SubLObject arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sentence = replace_formula_arg_position(arg_pos, attack, sentence);
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        putf(query_properties, $PROBLEM_STORE, problem_store);
        return values(sentence, mt, query_properties);
    }

    public static SubLObject terrorist_attack_lexification_kbq() {
        return narts_high.find_nart($list201);
    }

    public static SubLObject declare_lexification_utilities_file() {
        declareFunction(me, "lexification_reviewer", "LEXIFICATION-REVIEWER", 0, 0, false);
        declareFunction(me, "set_lexification_reviewer", "SET-LEXIFICATION-REVIEWER", 1, 0, false);
        declareMacro(me, "lex_trace", "LEX-TRACE");
        declareMacro(me, "lex_warn", "LEX-WARN");
        declareMacro(me, "lex_debug", "LEX-DEBUG");
        declareMacro(me, "lex_if_level", "LEX-IF-LEVEL");
        declareMacro(me, "lex_debug_out", "LEX-DEBUG-OUT");
        declareFunction(me, "lex_debug_on", "LEX-DEBUG-ON", 0, 1, false);
        declareMacro(me, "lex_assertion", "LEX-ASSERTION");
        declareMacro(me, "do_unlexified_terms", "DO-UNLEXIFIED-TERMS");
        declareFunction(me, "unlexified_terms_for_cyclist", "UNLEXIFIED-TERMS-FOR-CYCLIST", 1, 2, false);
        declareFunction(me, "lexification_not_neededP", "LEXIFICATION-NOT-NEEDED?", 1, 0, false);
        declareFunction(me, "unlexifiedP", "UNLEXIFIED?", 1, 1, false);
        declareFunction(me, "lexifiedP", "LEXIFIED?", 1, 1, false);
        declareFunction(me, "generalization_is_lexifiedP", "GENERALIZATION-IS-LEXIFIED?", 1, 0, false);
        declareFunction(me, "get_unlexified_terms", "GET-UNLEXIFIED-TERMS", 0, 2, false);
        declareFunction(me, "get_termstring_assertions_for_cyclist", "GET-TERMSTRING-ASSERTIONS-FOR-CYCLIST", 0, 1, false);
        declareFunction(me, "lexical_mt_for_cyclist", "LEXICAL-MT-FOR-CYCLIST", 0, 1, false);
        declareFunction(me, "acronym_char_p", "ACRONYM-CHAR-P", 1, 0, false);
        declareFunction(me, "regroup_acronyms", "REGROUP-ACRONYMS", 1, 0, false);
        declareFunction(me, "phrase_from_term", "PHRASE-FROM-TERM", 1, 1, false);
        declareFunction(me, "cyc_individual_constantP", "CYC-INDIVIDUAL-CONSTANT?", 1, 0, false);
        declareFunction(me, "phrase_for_mt", "PHRASE-FOR-MT", 1, 0, false);
        declareFunction(me, "lexification_for_mt", "LEXIFICATION-FOR-MT", 1, 0, false);
        declareFunction(me, "lexify_mts", "LEXIFY-MTS", 1, 0, false);
        declareFunction(me, "skip_mt_lexificationP", "SKIP-MT-LEXIFICATION?", 1, 0, false);
        declareFunction(me, "all_specifiedP", "ALL-SPECIFIED?", 1, 0, false);
        declareFunction(me, "universal_date_to_universal_time", "UNIVERSAL-DATE-TO-UNIVERSAL-TIME", 1, 0, false);
        declareFunction(me, "universal_time_to_universal_date", "UNIVERSAL-TIME-TO-UNIVERSAL-DATE", 1, 0, false);
        declareFunction(me, "n_universal_days_ago", "N-UNIVERSAL-DAYS-AGO", 1, 0, false);
        declareFunction(me, "extract_integer", "EXTRACT-INTEGER", 1, 1, false);
        declareFunction(me, "sort_by_pred_usage", "SORT-BY-PRED-USAGE", 1, 0, false);
        declareFunction(me, "most_specific_arg1_constraint", "MOST-SPECIFIC-ARG1-CONSTRAINT", 1, 0, false);
        declareFunction(me, "most_specific_argn_constraint", "MOST-SPECIFIC-ARGN-CONSTRAINT", 2, 0, false);
        declareFunction(me, "get_relation_argument_type", "GET-RELATION-ARGUMENT-TYPE", 2, 0, false);
        declareFunction(me, "clear_keyword_for_pos", "CLEAR-KEYWORD-FOR-POS", 0, 0, false);
        declareFunction(me, "remove_keyword_for_pos", "REMOVE-KEYWORD-FOR-POS", 1, 1, false);
        declareFunction(me, "keyword_for_pos_internal", "KEYWORD-FOR-POS-INTERNAL", 2, 0, false);
        declareFunction(me, "keyword_for_pos", "KEYWORD-FOR-POS", 1, 1, false);
        declareFunction(me, "clear_precise_keyword_for_pos", "CLEAR-PRECISE-KEYWORD-FOR-POS", 0, 0, false);
        declareFunction(me, "remove_precise_keyword_for_pos", "REMOVE-PRECISE-KEYWORD-FOR-POS", 1, 1, false);
        declareFunction(me, "precise_keyword_for_pos_internal", "PRECISE-KEYWORD-FOR-POS-INTERNAL", 2, 0, false);
        declareFunction(me, "precise_keyword_for_pos", "PRECISE-KEYWORD-FOR-POS", 1, 1, false);
        declareFunction(me, "clear_keyword_for_pred", "CLEAR-KEYWORD-FOR-PRED", 0, 0, false);
        declareFunction(me, "remove_keyword_for_pred", "REMOVE-KEYWORD-FOR-PRED", 1, 1, false);
        declareFunction(me, "keyword_for_pred_internal", "KEYWORD-FOR-PRED-INTERNAL", 2, 0, false);
        declareFunction(me, "keyword_for_pred", "KEYWORD-FOR-PRED", 1, 1, false);
        declareFunction(me, "clear_precise_keyword_for_pred", "CLEAR-PRECISE-KEYWORD-FOR-PRED", 0, 0, false);
        declareFunction(me, "remove_precise_keyword_for_pred", "REMOVE-PRECISE-KEYWORD-FOR-PRED", 1, 1, false);
        declareFunction(me, "precise_keyword_for_pred_internal", "PRECISE-KEYWORD-FOR-PRED-INTERNAL", 2, 0, false);
        declareFunction(me, "precise_keyword_for_pred", "PRECISE-KEYWORD-FOR-PRED", 1, 1, false);
        declareFunction(me, "invalid_formulaP", "INVALID-FORMULA?", 2, 0, false);
        declareFunction(me, "invalid_lexificationP", "INVALID-LEXIFICATION?", 2, 0, false);
        declareFunction(me, "lex_pos_for_keyword", "LEX-POS-FOR-KEYWORD", 1, 0, false);
        declareFunction(me, "parts_of_speech", "PARTS-OF-SPEECH", 1, 0, false);
        declareFunction(me, "clear_pluralize_word", "CLEAR-PLURALIZE-WORD", 0, 0, false);
        declareFunction(me, "remove_pluralize_word", "REMOVE-PLURALIZE-WORD", 1, 1, false);
        declareFunction(me, "pluralize_word_internal", "PLURALIZE-WORD-INTERNAL", 2, 0, false);
        declareFunction(me, "pluralize_word", "PLURALIZE-WORD", 1, 1, false);
        declareFunction(me, "clear_singularize_word", "CLEAR-SINGULARIZE-WORD", 0, 0, false);
        declareFunction(me, "remove_singularize_word", "REMOVE-SINGULARIZE-WORD", 1, 1, false);
        declareFunction(me, "singularize_word_internal", "SINGULARIZE-WORD-INTERNAL", 2, 0, false);
        declareFunction(me, "singularize_word", "SINGULARIZE-WORD", 1, 1, false);
        declareFunction(me, "clear_basic_preds_for_part_of_speech", "CLEAR-BASIC-PREDS-FOR-PART-OF-SPEECH", 0, 0, false);
        declareFunction(me, "remove_basic_preds_for_part_of_speech", "REMOVE-BASIC-PREDS-FOR-PART-OF-SPEECH", 1, 0, false);
        declareFunction(me, "basic_preds_for_part_of_speech_internal", "BASIC-PREDS-FOR-PART-OF-SPEECH-INTERNAL", 1, 0, false);
        declareFunction(me, "basic_preds_for_part_of_speech", "BASIC-PREDS-FOR-PART-OF-SPEECH", 1, 0, false);
        declareFunction(me, "clear_find_root_wordform", "CLEAR-FIND-ROOT-WORDFORM", 0, 0, false);
        declareFunction(me, "remove_find_root_wordform", "REMOVE-FIND-ROOT-WORDFORM", 1, 0, false);
        declareFunction(me, "find_root_wordform_internal", "FIND-ROOT-WORDFORM-INTERNAL", 1, 0, false);
        declareFunction(me, "find_root_wordform", "FIND-ROOT-WORDFORM", 1, 0, false);
        declareFunction(me, "lexified_phrases_for_term", "LEXIFIED-PHRASES-FOR-TERM", 1, 1, false);
        declareFunction(me, "nonplural_lexified_phrases_for_term", "NONPLURAL-LEXIFIED-PHRASES-FOR-TERM", 1, 0, false);
        declareFunction(me, "join_words", "JOIN-WORDS", 1, 0, false);
        declareFunction(me, "has_vowel", "HAS-VOWEL", 1, 0, false);
        declareFunction(me, "guess_stem", "GUESS-STEM", 1, 1, false);
        declareFunction(me, "clear_is_abbreviation_predicate", "CLEAR-IS-ABBREVIATION-PREDICATE", 0, 0, false);
        declareFunction(me, "remove_is_abbreviation_predicate", "REMOVE-IS-ABBREVIATION-PREDICATE", 1, 0, false);
        declareFunction(me, "is_abbreviation_predicate_internal", "IS-ABBREVIATION-PREDICATE-INTERNAL", 1, 0, false);
        declareFunction(me, "is_abbreviation_predicate", "IS-ABBREVIATION-PREDICATE", 1, 0, false);
        declareFunction(me, "get_abbreviation_predicates", "GET-ABBREVIATION-PREDICATES", 0, 0, false);
        declareFunction(me, "clear_examples_for_pred", "CLEAR-EXAMPLES-FOR-PRED", 0, 0, false);
        declareFunction(me, "remove_examples_for_pred", "REMOVE-EXAMPLES-FOR-PRED", 1, 1, false);
        declareFunction(me, "examples_for_pred_internal", "EXAMPLES-FOR-PRED-INTERNAL", 2, 0, false);
        declareFunction(me, "examples_for_pred", "EXAMPLES-FOR-PRED", 1, 1, false);
        declareFunction(me, "positive_examples_for_pred", "POSITIVE-EXAMPLES-FOR-PRED", 1, 0, false);
        declareFunction(me, "other_positive_examples_for_pred", "OTHER-POSITIVE-EXAMPLES-FOR-PRED", 1, 0, false);
        declareFunction(me, "real_examples_for_pred", "REAL-EXAMPLES-FOR-PRED", 1, 0, false);
        declareFunction(me, "try_lex_assert", "TRY-LEX-ASSERT", 2, 2, false);
        declareFunction(me, "try_lex_assert_now", "TRY-LEX-ASSERT-NOW", 2, 2, false);
        declareFunction(me, "lex_string_tokenize", "LEX-STRING-TOKENIZE", 1, 1, false);
        declareFunction(me, "lex_remove_final_punctuation", "LEX-REMOVE-FINAL-PUNCTUATION", 1, 0, false);
        declareFunction(me, "lex_find_word_in_string", "LEX-FIND-WORD-IN-STRING", 2, 0, false);
        declareFunction(me, "lex_describe_term", "LEX-DESCRIBE-TERM", 1, 1, false);
        declareFunction(me, "lex_fort_for_string", "LEX-FORT-FOR-STRING", 1, 0, false);
        declareFunction(me, "lex_arity_in_any_mt", "LEX-ARITY-IN-ANY-MT", 1, 0, false);
        declareFunction(me, "loose_lexification_phrases_for_term", "LOOSE-LEXIFICATION-PHRASES-FOR-TERM", 1, 0, false);
        declareFunction(me, "preferred_loose_lexification_phrase_for_term", "PREFERRED-LOOSE-LEXIFICATION-PHRASE-FOR-TERM", 1, 0, false);
        declareFunction(me, "proper_lexification_phrases_for_term", "PROPER-LEXIFICATION-PHRASES-FOR-TERM", 1, 0, false);
        declareFunction(me, "phrases_from_semantic_assertion", "PHRASES-FROM-SEMANTIC-ASSERTION", 1, 1, false);
        declareFunction(me, "phrases_from_lexification_sentence", "PHRASES-FROM-LEXIFICATION-SENTENCE", 1, 1, false);
        declareFunction(me, "phrase_from_lexification_sentence", "PHRASE-FROM-LEXIFICATION-SENTENCE", 2, 0, false);
        declareFunction(me, "is_nameable_entityP", "IS-NAMEABLE-ENTITY?", 1, 0, false);
        declareFunction(me, "is_nameable_individualP", "IS-NAMEABLE-INDIVIDUAL?", 1, 0, false);
        declareFunction(me, "is_nameable_collectionP", "IS-NAMEABLE-COLLECTION?", 1, 0, false);
        declareFunction(me, "lex_empty_stringP", "LEX-EMPTY-STRING?", 1, 0, false);
        declareFunction(me, "clear_lexification_caches", "CLEAR-LEXIFICATION-CACHES", 0, 0, false);
        declareFunction(me, "string_for_fort", "STRING-FOR-FORT", 1, 0, false);
        declareFunction(me, "string_for_field", "STRING-FOR-FIELD", 1, 0, false);
        declareFunction(me, "is_relationalP", "IS-RELATIONAL?", 1, 0, false);
        declareFunction(me, "is_functionalP", "IS-FUNCTIONAL?", 1, 0, false);
        declareFunction(me, "get_term_comments", "GET-TERM-COMMENTS", 1, 0, false);
        declareFunction(me, "likely_has_part_of_speechP", "LIKELY-HAS-PART-OF-SPEECH?", 2, 1, false);
        declareFunction(me, "likely_adverbP", "LIKELY-ADVERB?", 1, 1, false);
        declareFunction(me, "likely_adjectiveP", "LIKELY-ADJECTIVE?", 1, 1, false);
        declareFunction(me, "likely_nounP", "LIKELY-NOUN?", 1, 1, false);
        declareFunction(me, "likely_verbP", "LIKELY-VERB?", 1, 1, false);
        declareFunction(me, "word_unit_part_of_speech_usage", "WORD-UNIT-PART-OF-SPEECH-USAGE", 2, 0, false);
        declareFunction(me, "wordform_part_of_speech_usage", "WORDFORM-PART-OF-SPEECH-USAGE", 2, 0, false);
        declareFunction(me, "headword_usage", "HEADWORD-USAGE", 1, 2, false);
        declareFunction(me, "headword_usage_for_pred", "HEADWORD-USAGE-FOR-PRED", 3, 0, false);
        declareFunction(me, "most_frequent_headword", "MOST-FREQUENT-HEADWORD", 1, 1, false);
        declareFunction(me, "initial_capitalizedP", "INITIAL-CAPITALIZED?", 1, 0, false);
        declareFunction(me, "most_likely_headword", "MOST-LIKELY-HEADWORD", 1, 0, false);
        declareFunction(me, "other_lexified_phrases_for_term", "OTHER-LEXIFIED-PHRASES-FOR-TERM", 2, 0, false);
        declareFunction(me, "possibly_lexify_terrorist_attack", "POSSIBLY-LEXIFY-TERRORIST-ATTACK", 1, 1, false);
        declareFunction(me, "lexify_terrorist_attack", "LEXIFY-TERRORIST-ATTACK", 1, 1, false);
        declareFunction(me, "terrorist_attack_lexifications", "TERRORIST-ATTACK-LEXIFICATIONS", 1, 1, false);
        declareFunction(me, "terrorist_attack_lexification_query_args", "TERRORIST-ATTACK-LEXIFICATION-QUERY-ARGS", 1, 1, false);
        declareFunction(me, "terrorist_attack_lexification_kbq", "TERRORIST-ATTACK-LEXIFICATION-KBQ", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_lexification_utilities_file() {
        defconstant("*LEX-NONE*", ZERO_INTEGER);
        defconstant("*LEX-ALWAYS*", ZERO_INTEGER);
        defconstant("*LEX-BASIC*", ONE_INTEGER);
        defconstant("*LEX-WARNING*", ONE_INTEGER);
        defconstant("*LEX-DETAILED*", TWO_INTEGER);
        defconstant("*LEX-VERBOSE*", THREE_INTEGER);
        defconstant("*LEX-VERY-DETAILED*", FOUR_INTEGER);
        defconstant("*LEX-VERY-VERBOSE*", FIVE_INTEGER);
        defconstant("*LEX-MOST-DETAILED*", SIX_INTEGER);
        defconstant("*LEX-MOST-VERBOSE*", SEVEN_INTEGER);
        defconstant("*LEX-ALL*", NINE_INTEGER);
        defvar("*LEX-TRACE-LEVEL*", $lex_basic$.getGlobalValue());
        deflexical("*LEXIFICATION-CHECK-MAX-DAYS*", SubLSystemTrampolineFile.maybeDefault($lexification_check_max_days$, $lexification_check_max_days$, $int$30));
        defvar("*LEXIFICATION-REVIEWER*", NIL);
        deflexical("*NUM-PREDICATE-EXAMPLES*", SubLSystemTrampolineFile.maybeDefault($num_predicate_examples$, $num_predicate_examples$, THREE_INTEGER));
        defparameter("*LEX-WHITE-SPACE-CHARS*", string_utilities.whitespace_chars());
        defparameter("*LEX-PUNCTUATION-CHARS*", $list5);
        deflexical("*KEYWORD-FOR-POS-CACHING-STATE*", NIL);
        deflexical("*PRECISE-KEYWORD-FOR-POS-CACHING-STATE*", NIL);
        deflexical("*KEYWORD-FOR-PRED-CACHING-STATE*", NIL);
        deflexical("*PRECISE-KEYWORD-FOR-PRED-CACHING-STATE*", NIL);
        deflexical("*PLURALIZE-WORD-CACHING-STATE*", NIL);
        deflexical("*SINGULARIZE-WORD-CACHING-STATE*", NIL);
        deflexical("*BASIC-PREDS-FOR-PART-OF-SPEECH-CACHING-STATE*", NIL);
        deflexical("*FIND-ROOT-WORDFORM-CACHING-STATE*", NIL);
        deflexical("*IS-ABBREVIATION-PREDICATE-CACHING-STATE*", NIL);
        deflexical("*EXAMPLES-FOR-PRED-CACHING-STATE*", NIL);
        deflexical("*TERRORIST-ATTACK-LEXIFICATION-WORKS?*", NIL);
        return NIL;
    }

    public static SubLObject setup_lexification_utilities_file() {
        declare_defglobal($lexification_check_max_days$);
        register_html_state_variable($lexification_reviewer$);
        register_html_interface_variable($lexification_reviewer$);
        declare_defglobal($num_predicate_examples$);
        memoization_state.note_globally_cached_function(KEYWORD_FOR_POS);
        memoization_state.note_globally_cached_function(PRECISE_KEYWORD_FOR_POS);
        memoization_state.note_globally_cached_function(KEYWORD_FOR_PRED);
        memoization_state.note_globally_cached_function(PRECISE_KEYWORD_FOR_PRED);
        memoization_state.note_globally_cached_function(PLURALIZE_WORD);
        memoization_state.note_globally_cached_function(SINGULARIZE_WORD);
        memoization_state.note_globally_cached_function(BASIC_PREDS_FOR_PART_OF_SPEECH);
        memoization_state.note_globally_cached_function(FIND_ROOT_WORDFORM);
        memoization_state.note_globally_cached_function(IS_ABBREVIATION_PREDICATE);
        memoization_state.note_globally_cached_function(EXAMPLES_FOR_PRED);
        register_external_symbol(POSSIBLY_LEXIFY_TERRORIST_ATTACK);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexification_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_lexification_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexification_utilities_file();
    }

    
}

/**
 * Total time: 7691 ms synthetic
 */
