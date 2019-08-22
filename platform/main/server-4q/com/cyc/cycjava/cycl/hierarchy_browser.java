package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_br;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_flush;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_doc_string;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hierarchy_browser extends SubLTranslatedFile {
    public static final SubLFile me = new hierarchy_browser();

    public static final String myName = "com.cyc.cycjava.cycl.hierarchy_browser";

    public static final String myFingerPrint = "3d8e80573d40656003f46dc8cf56a9bc4254f25339aa04cb83f178deffb1ccef";

    // defparameter
    private static final SubLSymbol $hb_type_default_forms$ = makeSymbol("*HB-TYPE-DEFAULT-FORMS*");

    // defparameter
    private static final SubLSymbol $hb_alternate_predicates$ = makeSymbol("*HB-ALTERNATE-PREDICATES*");

    // defparameter
    private static final SubLSymbol $hb_icon_choices$ = makeSymbol("*HB-ICON-CHOICES*");

    // defparameter
    private static final SubLSymbol $hb_bar_choice$ = makeSymbol("*HB-BAR-CHOICE*");

    // defparameter
    /**
     * Used to hold the id of the previous term printed. Shadowed in the recursive
     * function hb-print-nodes-2.
     */
    private static final SubLSymbol $hb_previous_term_id$ = makeSymbol("*HB-PREVIOUS-TERM-ID*");











































































    // defparameter
    private static final SubLSymbol $hb_debug$ = makeSymbol("*HB-DEBUG*");

    // Internal Constants
    public static final SubLList $list0 = list(list(reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("genls")), TWO_INTEGER, ONE_INTEGER, TWO_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("genlPreds")), TWO_INTEGER, ONE_INTEGER, FIVE_INTEGER, FIVE_INTEGER), list(reader_make_constant_shell(makeString("Microtheory")), reader_make_constant_shell(makeString("genlMt")), TWO_INTEGER, ONE_INTEGER, TWO_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("GeographicalRegion")), reader_make_constant_shell(makeString("geographicalSubRegions")), ONE_INTEGER, TWO_INTEGER, TWO_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("CollectionDenotingFunction")), reader_make_constant_shell(makeString("genlFuncs")), TWO_INTEGER, ONE_INTEGER, FIVE_INTEGER, FIVE_INTEGER), list(reader_make_constant_shell(makeString("ScientificFieldOfStudy")), reader_make_constant_shell(makeString("subFields")), ONE_INTEGER, TWO_INTEGER, FIVE_INTEGER, FIVE_INTEGER));

    public static final SubLList $list1 = list(list(reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("genlInverse"))), list(reader_make_constant_shell(makeString("genlInverse")), reader_make_constant_shell(makeString("genlPreds"))));



    public static final SubLString $str3$star_gif = makeString("star.gif");

    public static final SubLString $str4$_ = makeString("*");



    public static final SubLString $str6$grnstar_gif = makeString("grnstar.gif");



    public static final SubLString $str8$cyanstar_gif = makeString("cyanstar.gif");

    public static final SubLList $list9 = list(makeString("*"), makeKeyword("RED-DIAMOND"), makeKeyword("YELLOW-STAR"), makeKeyword("GREEN-STAR"), makeKeyword("CYAN-STAR"));



    public static final SubLString $str11$celtic_bar_gif = makeString("celtic_bar.gif");

    public static final SubLSymbol $hb_icon$ = makeSymbol("*HB-ICON*");

    public static final SubLSymbol $hb_bar$ = makeSymbol("*HB-BAR*");

    public static final SubLString $str14$___ = makeString("-> ");

    public static final SubLSymbol $hb_top_sign$ = makeSymbol("*HB-TOP-SIGN*");

    public static final SubLString $str16$___ = makeString(" <-");

    public static final SubLSymbol $hb_bottom_sign$ = makeSymbol("*HB-BOTTOM-SIGN*");

    public static final SubLString $str18$____ = makeString("... ");

    public static final SubLSymbol $hb_more_superiors_sign$ = makeSymbol("*HB-MORE-SUPERIORS-SIGN*");

    public static final SubLString $str20$____ = makeString(" ...");

    public static final SubLSymbol $hb_more_inferiors_sign$ = makeSymbol("*HB-MORE-INFERIORS-SIGN*");

    public static final SubLString $str22$__see_above_ = makeString(" *see above*");

    public static final SubLSymbol $hb_cycle_sign$ = makeSymbol("*HB-CYCLE-SIGN*");

    public static final SubLSymbol $hb_large_font_size$ = makeSymbol("*HB-LARGE-FONT-SIZE*");

    public static final SubLSymbol $hb_small_font_size$ = makeSymbol("*HB-SMALL-FONT-SIZE*");

    public static final SubLSymbol $hb_tiny_font_size$ = makeSymbol("*HB-TINY-FONT-SIZE*");

    public static final SubLSymbol $hb_pivot_term$ = makeSymbol("*HB-PIVOT-TERM*");

    public static final SubLSymbol $hb_table$ = makeSymbol("*HB-TABLE*");

    public static final SubLSymbol $hb_superior_table$ = makeSymbol("*HB-SUPERIOR-TABLE*");

    public static final SubLSymbol $hb_duplicates_table$ = makeSymbol("*HB-DUPLICATES-TABLE*");

    public static final SubLSymbol $hb_indent_quantum$ = makeSymbol("*HB-INDENT-QUANTUM*");

    public static final SubLSymbol $hb_indent$ = makeSymbol("*HB-INDENT*");

    public static final SubLSymbol $hb_counter$ = makeSymbol("*HB-COUNTER*");

    public static final SubLSymbol $hb_reset_parameter_notice_threshhold$ = makeSymbol("*HB-RESET-PARAMETER-NOTICE-THRESHHOLD*");

    public static final SubLSymbol $hb_use_defaults_for_type$ = makeSymbol("*HB-USE-DEFAULTS-FOR-TYPE*");

    public static final SubLSymbol $hb_alternate_predicate$ = makeSymbol("*HB-ALTERNATE-PREDICATE*");

    public static final SubLSymbol $hb_use_lexicon$ = makeSymbol("*HB-USE-LEXICON*");

    public static final SubLSymbol $hb_computed_max_depth$ = makeSymbol("*HB-COMPUTED-MAX-DEPTH*");

    public static final SubLSymbol $hb_max_depth$ = makeSymbol("*HB-MAX-DEPTH*");

    public static final SubLSymbol $hb_max_height$ = makeSymbol("*HB-MAX-HEIGHT*");

    private static final SubLInteger $int$200 = makeInteger(200);

    public static final SubLSymbol $hb_max_inferiors$ = makeSymbol("*HB-MAX-INFERIORS*");

    public static final SubLSymbol $hb_show_comments$ = makeSymbol("*HB-SHOW-COMMENTS*");

    public static final SubLSymbol $hb_show_mts$ = makeSymbol("*HB-SHOW-MTS*");



    public static final SubLSymbol $hb_mt$ = makeSymbol("*HB-MT*");

    public static final SubLSymbol $hb_predicate$ = makeSymbol("*HB-PREDICATE*");

    public static final SubLSymbol $hb_index_argument$ = makeSymbol("*HB-INDEX-ARGUMENT*");

    public static final SubLSymbol $hb_gather_argument$ = makeSymbol("*HB-GATHER-ARGUMENT*");

    public static final SubLSymbol $hb_use_genl_mts$ = makeSymbol("*HB-USE-GENL-MTS*");



    public static final SubLSymbol $hb_background_color$ = makeSymbol("*HB-BACKGROUND-COLOR*");



    public static final SubLSymbol $hb_message_color$ = makeSymbol("*HB-MESSAGE-COLOR*");

    public static final SubLSymbol $hb_message$ = makeSymbol("*HB-MESSAGE*");

    public static final SubLSymbol $hb_eval_form$ = makeSymbol("*HB-EVAL-FORM*");

    public static final SubLSymbol $hb_inverse_eval_form$ = makeSymbol("*HB-INVERSE-EVAL-FORM*");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static final SubLString $str61$ = makeString("");

    public static final SubLString $$$Starting_Term = makeString("Starting Term");

    public static final SubLString $str63$Current_Term__ = makeString("Current Term: ");

    public static final SubLString $str64$_2 = makeString("+2");

    public static final SubLString $$$None = makeString("None");

    public static final SubLString $str66$cur_term = makeString("cur-term");

    public static final SubLString $str67$Change_Term__ = makeString("Change Term: ");

    public static final SubLString $str68$new_term = makeString("new-term");

    public static final SubLString $$$Complete = makeString("Complete");

    private static final SubLInteger $int$25 = makeInteger(25);

    public static final SubLString $str71$defaults_for_type = makeString("defaults-for-type");

    public static final SubLString $$$_Use_default_settings_for_term = makeString(" Use default settings for term");



    public static final SubLString $str74$Specify_Non_Default_Settings = makeString("Specify Non-Default Settings");

    public static final SubLString $$$middle = makeString("middle");

    public static final SubLString $$$top = makeString("top");

    public static final SubLString $$$Binary_Predicate = makeString("Binary Predicate");

    public static final SubLString $$$pred = makeString("pred");

    private static final SubLObject $$BinaryPredicate = reader_make_constant_shell(makeString("BinaryPredicate"));

    public static final SubLString $$$Index_Argument = makeString("Index Argument");

    public static final SubLString $$$index = makeString("index");

    public static final SubLString $$$_1 = makeString(" 1");

    public static final SubLString $$$_2 = makeString(" 2");

    public static final SubLString $$$Microtheory = makeString("Microtheory");

    public static final SubLString $$$mt = makeString("mt");

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    public static final SubLString $str87$genl_mts = makeString("genl-mts");

    public static final SubLString $str88$_Use_its_genl_mts_too__if_possibl = makeString(" Use its genl mts too, if possible");

    public static final SubLString $str89$all_mts = makeString("all-mts");

    public static final SubLString $$$_Use_all_mts = makeString(" Use all mts");

    public static final SubLString $$$Height_and_Depth = makeString("Height and Depth");

    public static final SubLString $$$right = makeString("right");

    public static final SubLString $str93$Max_height__ = makeString("Max height: ");

    public static final SubLString $$$height = makeString("height");





    public static final SubLList $list97 = list(new SubLObject[]{ makeSymbol("NONE"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, makeSymbol("ALL") });

    public static final SubLString $str98$Max_depth__ = makeString("Max depth: ");

    public static final SubLString $$$depth = makeString("depth");

    public static final SubLString $str100$Max_inferior_terms__ = makeString("Max inferior terms: ");

    public static final SubLString $$$inferior = makeString("inferior");

    public static final SubLString $$$Extras = makeString("Extras");

    public static final SubLString $$$lex = makeString("lex");

    public static final SubLString $str104$_Use_lexicon_entries__if_possible = makeString(" Use lexicon entries, if possible");

    public static final SubLString $$$comments = makeString("comments");

    public static final SubLString $$$_Show_comments_for_terms = makeString(" Show comments for terms");

    public static final SubLString $str107$mts_after = makeString("mts-after");

    public static final SubLString $str108$_Show_assertion_s_mts_after_terms = makeString(" Show assertion's mts after terms");

    public static final SubLString $str109$Indent_quantum__ = makeString("Indent quantum: ");

    public static final SubLString $$$quantum = makeString("quantum");

    private static final SubLSymbol $HB_COLORS_AND_SYMBOLS = makeKeyword("HB-COLORS-AND-SYMBOLS");

    public static final SubLString $str112$bg_color = makeString("bg-color");

    public static final SubLString $str113$__ = makeString(": ");

    public static final SubLString $str114$The_background_color_for_Hierarch = makeString("The background color for Hierarchy Browser pages");

    public static final SubLString $str115$msg_color = makeString("msg-color");

    public static final SubLString $str116$The_color_for_Hierarchy_Browser_a = makeString("The color for Hierarchy Browser alert messages");

    public static final SubLString $str117$hb_icon = makeString("hb-icon");

    public static final SubLString $str118$The_hierarchical_display_link_ico = makeString("The hierarchical display link icon, currently ");

    public static final SubLString $str119$hb_bar = makeString("hb-bar");

    public static final SubLString $str120$___ = makeString(" : ");

    public static final SubLString $$$Use_decorative_separator_bar = makeString("Use decorative separator bar");

    public static final SubLString $str122$hb_top_sign = makeString("hb-top-sign");

    public static final SubLString $str123$__term_ = makeString(" <term>");

    public static final SubLString $str124$Indicates_that__term__has_no_supe = makeString("Indicates that <term> has no superiors");

    public static final SubLString $str125$_term__ = makeString("<term> ");

    public static final SubLString $str126$hb_bottom_sign = makeString("hb-bottom-sign");

    public static final SubLString $str127$Indicates_that__term__has_no_infe = makeString("Indicates that <term> has no inferiors");

    public static final SubLString $str128$superiors_sign = makeString("superiors-sign");

    public static final SubLString $str129$Indicates_that__term__has_more_un = makeString("Indicates that <term> has more undisplayed superiors");

    public static final SubLString $str130$inferiors_sign = makeString("inferiors-sign");

    public static final SubLString $str131$Indicates_that__term__has_more_un = makeString("Indicates that <term> has more undisplayed inferiors");

    public static final SubLString $str132$cycle_sign = makeString("cycle-sign");

    public static final SubLString $str133$Indicates_that_a_sequence_of_term = makeString("Indicates that a sequence of terms beginning with <term> has already been displayed");



    public static final SubLSymbol COERCE_NAME = makeSymbol("COERCE-NAME");



    public static final SubLString $str137$hb_parameters_html = makeString("hb-parameters.html");

    private static final SubLString $str138$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str139$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $$$Cyc_Hierarchy_Browser = makeString("Cyc Hierarchy Browser");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str144$hb_handle_parameters = makeString("hb-handle-parameters");

    private static final SubLString $$$Current_Settings = makeString("Current Settings");

    private static final SubLString $$$Display_Hierarchy = makeString("Display Hierarchy");

    private static final SubLSymbol HB_PARAMETERS = makeSymbol("HB-PARAMETERS");



    private static final SubLString $$$HB_Colors_and_Symbols = makeString("HB Colors and Symbols");

    private static final SubLString $str150$Hierarchy_Browser_Colors_and_Symb = makeString("Hierarchy Browser Colors and Symbols");

    private static final SubLString $str151$hb_handle_colors_and_symbols = makeString("hb-handle-colors-and-symbols");

    private static final SubLString $$$Update = makeString("Update");

    private static final SubLSymbol HB_COLORS_AND_SYMBOLS = makeSymbol("HB-COLORS-AND-SYMBOLS");

    private static final SubLString $$$term = makeString("term");

    private static final SubLSymbol $sym155$VALID_TIMESTRING_CHAR_ = makeSymbol("VALID-TIMESTRING-CHAR?");

    private static final SubLSymbol $sym156$VALID_FORT_ = makeSymbol("VALID-FORT?");

    private static final SubLList $list157 = list(makeString("all"), makeString(":all"), makeKeyword("ALL"), makeSymbol("ALL"));

    private static final SubLSymbol $sym158$MT_ = makeSymbol("MT?");

    private static final SubLSymbol $sym159$HB_BINARY_PREDICATE_ = makeSymbol("HB-BINARY-PREDICATE?");

    private static final SubLString $$$2 = makeString("2");

    private static final SubLInteger $int$50 = makeInteger(50);



    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));





    private static final SubLString $str166$The_input__s_did_not_yield_a_vali = makeString("The input ~s did not yield a valid constant.");

    private static final SubLString $str167$The_input__s_did_not_yield_a_vali = makeString("The input ~s did not yield a valid predicate.");

    private static final SubLString $str168$The_input__s_did_not_yield_a_vali = makeString("The input ~s did not yield a valid microtheory.");

    private static final SubLString $str169$Parameters_updated_at__a_on__a = makeString("Parameters updated at ~a on ~a");

    private static final SubLSymbol HB_HANDLE_PARAMETERS = makeSymbol("HB-HANDLE-PARAMETERS");





    private static final SubLString $str173$Colors_and_symbols_updated_at__a_ = makeString("Colors and symbols updated at ~a on ~a");

    private static final SubLSymbol HB_HANDLE_COLORS_AND_SYMBOLS = makeSymbol("HB-HANDLE-COLORS-AND-SYMBOLS");

    private static final SubLList $list175 = list(makeSymbol("TYPE"), makeSymbol("PREDICATE"), makeSymbol("INDEX"), makeSymbol("GATHER"), makeSymbol("HEIGHT"), makeSymbol("DEPTH"));

    private static final SubLString $str176$Using_default_settings_for_instan = makeString("Using default settings for instances of ~a.");

    private static final SubLString $str177$No_default_display_parameters_are = makeString("No default display parameters are defined for the term `~a'.");

    private static final SubLSymbol HB_STRING_FOR_CONSTANT = makeSymbol("HB-STRING-FOR-CONSTANT");

    private static final SubLString $$$predicate = makeString("predicate");

    private static final SubLString $$$microtheory = makeString("microtheory");

    private static final SubLString $$$microtheories = makeString("microtheories");

    private static final SubLString $str182$_as = makeString("~as");

    private static final SubLString $str183$Choose_Constants__Simple_Version = makeString("Choose Constants: Simple Version");

    private static final SubLString $str184$Choose_a__a = makeString("Choose a ~a");

    private static final SubLString $str185$Please_choose_one_of_the_followin = makeString("Please choose one of the following ~a:");

    private static final SubLString $$$left = makeString("left");

    private static final SubLSymbol $HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = makeKeyword("HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS");



    private static final SubLSymbol HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = makeSymbol("HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS");

    private static final SubLString $str190$Choose_Constants__Complex_Version = makeString("Choose Constants: Complex Version");

    private static final SubLString $$$Resolve_Ambiguous_Input = makeString("Resolve Ambiguous Input");

    private static final SubLString $str192$hb_handle_complex_choose_constant = makeString("hb-handle-complex-choose-constants");

    private static final SubLString $$$Go = makeString("Go");

    private static final SubLString $str194$Please_select_one_term_from_each_ = makeString("Please select one term from each category below:");

    private static final SubLString $$$Terms = makeString("Terms");

    private static final SubLString $$$Predicates = makeString("Predicates");

    private static final SubLString $$$Microtheories = makeString("Microtheories");

    private static final SubLString $str198$_a = makeString("~a");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol HB_HANDLE_COMPLEX_CHOOSE_CONSTANTS = makeSymbol("HB-HANDLE-COMPLEX-CHOOSE-CONSTANTS");

    private static final SubLSymbol HB_SELECT_NODE = makeSymbol("HB-SELECT-NODE");



    private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

    private static final SubLSymbol NAME_OF_CAR = makeSymbol("NAME-OF-CAR");

    private static final SubLSymbol $HB_SELECT_NODE_TEXT = makeKeyword("HB-SELECT-NODE-TEXT");

    private static final SubLSymbol $HB_SELECT_NODE_IMAGE = makeKeyword("HB-SELECT-NODE-IMAGE");

    private static final SubLSymbol CB_CF = makeSymbol("CB-CF");



    private static final SubLSymbol MIN_ISA = makeSymbol("MIN-ISA");



    private static final SubLSymbol MIN_GENLS = makeSymbol("MIN-GENLS");



    private static final SubLSymbol ALL_ISA = makeSymbol("ALL-ISA");







    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLString $str218$__ = makeString(", ");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $str221$Context__ = makeString("Context: ");

    private static final SubLString $$$Union_of_all_contexts = makeString("Union of all contexts");

    private static final SubLString $$$_and_its_ = makeString(" and its ");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $str226$Unknown_ = makeString("Unknown!");

    private static final SubLString $str227$Predicate__ = makeString("Predicate: ");

    private static final SubLString $str228$Index__ = makeString("Index: ");



    private static final SubLString $str230$__________ = makeString("----------");

    private static final SubLSymbol $HB_PRINT_NODES = makeKeyword("HB-PRINT-NODES");

    private static final SubLString $str232$hb_print_nodes_html = makeString("hb-print-nodes.html");

    private static final SubLString $str233$Hierarchical_Display___a = makeString("Hierarchical Display: ~a");

    private static final SubLSymbol HIERARCHY_DEFAULT = makeSymbol("HIERARCHY-DEFAULT");

    private static final SubLString $str235$hb_parameters = makeString("hb-parameters");

    private static final SubLString $$$Change_Hierarchy_Browser_Settings = makeString("Change Hierarchy Browser Settings");

    private static final SubLString $str237$_a_is_not_a_valid_constant_ = makeString("~a is not a valid constant.");

    private static final SubLSymbol HB_PRINT_NODES = makeSymbol("HB-PRINT-NODES");





    private static final SubLString $str241$__ = makeString(" [");

    private static final SubLString $str242$_ = makeString("]");

    private static final SubLString $str243$_ = makeString("[");

    private static final SubLString $str244$_____ = makeString(" -> (");

    private static final SubLString $str245$__ = makeString(")]");

    private static final SubLString $str246$_Unknown__ = makeString("[Unknown!]");

    private static final SubLSymbol $sym247$STRING_ = makeSymbol("STRING<");

    private static final SubLString $$$No_superior_terms = makeString("No superior terms");

    private static final SubLString $str249$__not_an_indexed_term_ = makeString(" [not an indexed term]");

    private static final SubLString $$$No_inferior_terms = makeString("No inferior terms");

    private static final SubLString $$$Go_to_Top = makeString("Go to Top");

    private static final SubLString $str252$____ = makeString("~%~%");

    private static final SubLString $str253$____Level_finished___s = makeString("    Level finished: ~s");

    private static final SubLString $str254$__ = makeString("~%");

    private static final SubLString $str255$_______Total_count___s = makeString("       Total count: ~s");

    private static final SubLString $str256$Computed_max_depth___s = makeString("Computed max depth: ~s");

    private static final SubLSymbol HB_START = makeSymbol("HB-START");

    private static final SubLString $$$Hier = makeString("Hier");



    private static final SubLString $str260$hb_start = makeString("hb-start");



    private static final SubLSymbol CB_LINK_HIERARCHY_BROWSER = makeSymbol("CB-LINK-HIERARCHY-BROWSER");

    private static final SubLString $$$Hierarchy_Browser = makeString("Hierarchy Browser");

    private static final SubLString $$$The_Hierarchy_Browser = makeString("The Hierarchy Browser");

    private static final SubLList $list265 = list(makeSymbol("FORT-SPEC"));

    private static final SubLString $str266$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~a");

    private static final SubLSymbol CB_HIER_DEFAULT = makeSymbol("CB-HIER-DEFAULT");

    private static final SubLList $list268 = list(makeSymbol("FORT-SPEC"), makeSymbol("ARG-STRING"), makeSymbol("PRED-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT-SPEC"));

    private static final SubLString $str269$Could_not_determine_an_arg_from__ = makeString("Could not determine an arg from ~a");

    private static final SubLSymbol CB_HIER = makeSymbol("CB-HIER");



    public static SubLObject hb_default_method_info(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject info = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject isas = isa.all_isa(fort, UNPROVIDED, UNPROVIDED);
            if (NIL == info) {
                SubLObject csome_list_var;
                SubLObject v_isa;
                for (csome_list_var = isas, v_isa = NIL, v_isa = csome_list_var.first(); (NIL == info) && (NIL != csome_list_var); info = assoc(v_isa, $hb_type_default_forms$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return info;
    }

    public static SubLObject hb_default_method_availableP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != list_utilities.sublisp_boolean(hb_default_method_info(v_object))));
    }

    public static SubLObject set_default_hb_icon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $hb_icon$.getDynamicValue(thread)) {
            $hb_icon$.setDynamicValue($RED_DIAMOND, thread);
        }
        return $hb_icon$.getDynamicValue(thread);
    }

    public static SubLObject hb_debug() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $hb_debug$.setDynamicValue(T, thread);
        return $hb_debug$.getDynamicValue(thread);
    }

    public static SubLObject hb_no_debug() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $hb_debug$.setDynamicValue(NIL, thread);
        return $hb_debug$.getDynamicValue(thread);
    }

    public static SubLObject hb_message(SubLObject top_spaces, SubLObject bottom_spaces, SubLObject string) {
        if (top_spaces == UNPROVIDED) {
            top_spaces = NIL;
        }
        if (bottom_spaces == UNPROVIDED) {
            bottom_spaces = NIL;
        }
        if (string == UNPROVIDED) {
            string = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (NIL != string_utilities.non_empty_stringP(string)) ? string : NIL != string_utilities.non_empty_stringP($hb_message$.getDynamicValue(thread)) ? $hb_message$.getDynamicValue(thread) : $str61$;
        final SubLObject color = $hb_message_color$.getDynamicValue(thread);
        if (NIL != string_utilities.non_empty_stringP(message)) {
            if (top_spaces.isInteger()) {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(top_spaces); i = add(i, ONE_INTEGER)) {
                    html_br();
                }
            }
            html_markup(html_macros.$html_center_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            final SubLObject color_val = color;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != color_val) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(color_val));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                format(html_macros.$html_stream$.getDynamicValue(thread), message);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_center_tail$.getGlobalValue());
            if (bottom_spaces.isInteger()) {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(bottom_spaces); i = add(i, ONE_INTEGER)) {
                    html_br();
                }
            }
            $hb_message$.setDynamicValue(NIL, thread);
        }
        return NIL;
    }

    public static SubLObject hb_show_parameters(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($$$Starting_Term);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_princ($str63$Current_Term__);
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        html_markup(html_macros.$html_font_size$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str64$_2);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != forts.fort_p($hb_pivot_term$.getDynamicValue(thread))) {
                cb_form($hb_pivot_term$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            } else {
                html_princ($$$None);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_hidden_input($str66$cur_term, cb_fort_identifier($hb_pivot_term$.getDynamicValue(thread)), UNPROVIDED);
        html_indent(FIVE_INTEGER);
        html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_princ($str67$Change_Term__);
        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        if (NIL != html_complete.$cb_enable_constant_completion$.getDynamicValue(thread)) {
            html_complete.html_complete_button($str68$new_term, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
        }
        html_text_input($str68$new_term, $str61$, $int$25);
        html_newline(UNPROVIDED);
        html_checkbox_input($str71$defaults_for_type, $str71$defaults_for_type, $hb_use_defaults_for_type$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($$$_Use_default_settings_for_term);
        html_markup(html_macros.$html_center_tail$.getGlobalValue());
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_caption_head$.getGlobalValue());
            html_markup(html_macros.$html_caption_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($TOP));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str74$Specify_Non_Default_Settings);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_caption_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$middle));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$top));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Binary_Predicate);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_complete.html_complete_button($$$pred, $$$Complete, $$BinaryPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_text_input($$$pred, misc_kb_utilities.coerce_name($hb_predicate$.getDynamicValue(thread)), $int$25);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Index_Argument);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_radio_input($$$index, ONE_INTEGER, equal($hb_index_argument$.getDynamicValue(thread), ONE_INTEGER), UNPROVIDED);
                    html_princ($$$_1);
                    html_indent(THREE_INTEGER);
                    html_radio_input($$$index, TWO_INTEGER, makeBoolean(!$hb_index_argument$.getDynamicValue(thread).equal(ONE_INTEGER)), UNPROVIDED);
                    html_princ($$$_2);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FIVE_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$middle));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$top));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Microtheory);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_complete.html_complete_button($$$mt, $$$Complete, $$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_text_input($$$mt, misc_kb_utilities.coerce_name($hb_mt$.getDynamicValue(thread)), $int$25);
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_checkbox_input($str87$genl_mts, $str87$genl_mts, $hb_use_genl_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_princ($str88$_Use_its_genl_mts_too__if_possibl);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_checkbox_input($str89$all_mts, $str89$all_mts, eq($hb_mt$.getDynamicValue(thread), $ALL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_princ($$$_Use_all_mts);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$middle));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$top));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_br();
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Height_and_Depth);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_br();
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($$$right));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str93$Max_height__);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_select_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_princ($$$height);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        SubLObject current = $hb_max_height$.getDynamicValue(thread);
                                        if (NIL == current) {
                                            current = ALL;
                                        } else
                                            if (current.equal(ZERO_INTEGER)) {
                                                current = NONE;
                                            }

                                        SubLObject cdolist_list_var = $list97;
                                        SubLObject i = NIL;
                                        i = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                if (i.equal(current)) {
                                                    html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(i);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            cdolist_list_var = cdolist_list_var.rest();
                                            i = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                }
                                html_markup(html_macros.$html_select_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($$$right));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str98$Max_depth__);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_select_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_princ($$$depth);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        SubLObject current = $hb_max_depth$.getDynamicValue(thread);
                                        if (NIL == current) {
                                            current = ALL;
                                        } else
                                            if (current.equal(ZERO_INTEGER)) {
                                                current = NONE;
                                            }

                                        SubLObject cdolist_list_var = $list97;
                                        SubLObject i = NIL;
                                        i = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                if (i.equal(current)) {
                                                    html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(i);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            cdolist_list_var = cdolist_list_var.rest();
                                            i = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                }
                                html_markup(html_macros.$html_select_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_princ($str100$Max_inferior_terms__);
                    html_text_input($$$inferior, $hb_max_inferiors$.getDynamicValue(thread), FOUR_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FIVE_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$middle));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$top));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_br();
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Extras);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_br();
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_checkbox_input($$$lex, $$$lex, $hb_use_lexicon$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_princ($str104$_Use_lexicon_entries__if_possible);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_checkbox_input($$$comments, $$$comments, $hb_show_comments$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_princ($$$_Show_comments_for_terms);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_checkbox_input($str107$mts_after, $str107$mts_after, $hb_show_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_princ($str108$_Show_assertion_s_mts_after_terms);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($$$middle));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str109$Indent_quantum__);
                                html_text_input($$$quantum, $hb_indent_quantum$.getDynamicValue(thread), THREE_INTEGER);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($$$middle));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cyc_navigator_internals.nav_link($HB_COLORS_AND_SYMBOLS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject hb_show_colors_and_symbols(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                        html_princ($str112$bg_color);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = apps_shared.$app_color_name_map$.getDynamicValue(thread);
                            SubLObject pair = NIL;
                            pair = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    if (pair.first().eql($hb_background_color$.getDynamicValue(thread))) {
                                        html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(pair.rest());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                                }
                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                pair = cdolist_list_var.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                    }
                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                    html_princ($str113$__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str114$The_background_color_for_Hierarch);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                        html_princ($str115$msg_color);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = apps_shared.$app_color_name_map$.getDynamicValue(thread);
                            SubLObject pair = NIL;
                            pair = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    if (pair.first().eql($hb_message_color$.getDynamicValue(thread))) {
                                        html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(pair.rest());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                                }
                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                pair = cdolist_list_var.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                    }
                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                    html_princ($str113$__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str116$The_color_for_Hierarchy_Browser_a);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                        html_princ($str117$hb_icon);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_center_head$.getGlobalValue());
                            SubLObject cdolist_list_var = $hb_icon_choices$.getDynamicValue(thread);
                            SubLObject item = NIL;
                            item = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    if (item.equal($hb_icon$.getDynamicValue(thread))) {
                                        html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(item);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                                }
                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                item = cdolist_list_var.first();
                            } 
                            html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                    }
                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                    html_princ($str113$__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str118$The_hierarchical_display_link_ico);
                    if ($hb_icon$.getDynamicValue(thread).equalp($str4$_)) {
                        html_princ($str4$_);
                    } else {
                        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($hb_icon$.getDynamicValue(thread));
                        final SubLObject align = $TOP;
                        final SubLObject alt = $str4$_;
                        final SubLObject border = ZERO_INTEGER;
                        html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(image_src);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != alt) {
                            html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(alt);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align) {
                            html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align(align));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border) {
                            html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(border);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_checkbox_input($str119$hb_bar, $str119$hb_bar, $hb_bar$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str120$___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Use_decorative_separator_bar);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_text_input($str122$hb_top_sign, $hb_top_sign$.getDynamicValue(thread), FOUR_INTEGER);
                    html_princ($str123$__term_);
                    html_princ($str120$___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str124$Indicates_that__term__has_no_supe);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str125$_term__);
                    html_text_input($str126$hb_bottom_sign, $hb_bottom_sign$.getDynamicValue(thread), FOUR_INTEGER);
                    html_princ($str120$___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str127$Indicates_that__term__has_no_infe);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_text_input($str128$superiors_sign, $hb_more_superiors_sign$.getDynamicValue(thread), FOUR_INTEGER);
                    html_princ($str123$__term_);
                    html_princ($str120$___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str129$Indicates_that__term__has_more_un);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str125$_term__);
                    html_text_input($str130$inferiors_sign, $hb_more_inferiors_sign$.getDynamicValue(thread), FOUR_INTEGER);
                    html_princ($str120$___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str131$Indicates_that__term__has_more_un);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str125$_term__);
                    html_text_input($str132$cycle_sign, $hb_cycle_sign$.getDynamicValue(thread), TWELVE_INTEGER);
                    html_princ($str120$___);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str133$Indicates_that_a_sequence_of_term);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject sorted_gaf_mts(final SubLObject gaf, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(STRING_LESSP);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(COERCE_NAME);
        }
        final SubLObject mts = kb_indexing.gaf_mts(gaf);
        final SubLObject sorted_mts = Sort.sort(mts, test, key);
        return sorted_mts;
    }

    public static SubLObject hb_parameters(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = $hb_background_color$.getDynamicValue(thread);
        html_markup($str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str139$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Cyc_Hierarchy_Browser);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$81 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Cyc_Hierarchy_Browser);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    hb_message(ONE_INTEGER, ONE_INTEGER, UNPROVIDED);
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str144$hb_handle_parameters, T, UNPROVIDED);
                        html_markup(html_macros.$html_center_head$.getGlobalValue());
                        cb_help_preamble($HB_PARAMETERS, UNPROVIDED, UNPROVIDED);
                        html_reset_input($$$Current_Settings);
                        html_indent(TWO_INTEGER);
                        html_submit_input($$$Display_Hierarchy, UNPROVIDED, UNPROVIDED);
                        html_br();
                        hb_show_parameters(UNPROVIDED);
                        html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$81, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject hb_colors_and_symbols(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = $hb_background_color$.getDynamicValue(thread);
        html_markup($str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str139$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$HB_Colors_and_Symbols);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$84 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str150$Hierarchy_Browser_Colors_and_Symb);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    hb_message(ONE_INTEGER, ONE_INTEGER, UNPROVIDED);
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str151$hb_handle_colors_and_symbols, T, UNPROVIDED);
                        html_markup(html_macros.$html_center_head$.getGlobalValue());
                        cb_back_button(UNPROVIDED, UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        html_reset_input($$$Current_Settings);
                        html_indent(TWO_INTEGER);
                        html_submit_input($$$Update, UNPROVIDED, UNPROVIDED);
                        html_br();
                        hb_show_colors_and_symbols(UNPROVIDED);
                        html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$84, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject hb_binary_predicateP(final SubLObject fort) {
        return isa.isa_in_any_mtP(fort, $$BinaryPredicate);
    }

    public static SubLObject hb_handle_parameters(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = NIL;
        final SubLObject cur_term = html_extract_input($str66$cur_term, args);
        final SubLObject new_term = html_extract_input($str68$new_term, args);
        final SubLObject pos_term = html_extract_input($$$term, args);
        SubLObject defaults = html_extract_input($str71$defaults_for_type, args);
        SubLObject mt = html_extract_input($$$mt, args);
        SubLObject v_genl_mts = html_extract_input($str87$genl_mts, args);
        SubLObject all_mts = html_extract_input($str89$all_mts, args);
        SubLObject pred = html_extract_input($$$pred, args);
        SubLObject index = html_extract_input($$$index, args);
        SubLObject lex = html_extract_input($$$lex, args);
        SubLObject comments = html_extract_input($$$comments, args);
        SubLObject mts_after = html_extract_input($str107$mts_after, args);
        SubLObject height = html_extract_input($$$height, args);
        SubLObject depth = html_extract_input($$$depth, args);
        SubLObject inferior = html_extract_input($$$inferior, args);
        SubLObject quantum = html_extract_input($$$quantum, args);
        final SubLObject strings = string_utilities.break_words(numeric_date_utilities.timestring(UNPROVIDED), symbol_function($sym155$VALID_TIMESTRING_CHAR_), UNPROVIDED);
        final SubLObject time = second(strings);
        final SubLObject date = strings.first();
        if (NIL != string_utilities.non_empty_stringP(new_term)) {
            v_term = cb_frames.terms_for_browsing(new_term, UNPROVIDED, UNPROVIDED);
            if (v_term.isCons()) {
                v_term = list_utilities.delete_if_not(symbol_function($sym156$VALID_FORT_), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (v_term.isCons() && length(v_term).numE(ONE_INTEGER)) {
                v_term = v_term.first();
            }
        } else
            if (NIL != cur_term) {
                v_term = cb_guess_fort(cur_term, UNPROVIDED);
            } else {
                v_term = cb_frames.terms_for_browsing(pos_term, UNPROVIDED, UNPROVIDED);
            }

        defaults = equalp(defaults, $str71$defaults_for_type);
        if (NIL != string_utilities.non_empty_stringP(mt)) {
            if (NIL != find(mt, $list157, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                mt = $ALL;
            } else {
                mt = cb_frames.terms_for_browsing(mt, UNPROVIDED, UNPROVIDED);
            }
            if (mt.isCons()) {
                mt = list_utilities.delete_if_not(symbol_function($sym158$MT_), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (mt.isCons() && length(mt).numE(ONE_INTEGER)) {
                mt = mt.first();
            }
        }
        v_genl_mts = equalp(v_genl_mts, $str87$genl_mts);
        all_mts = makeBoolean(all_mts.equalp($str89$all_mts) || (mt == $ALL));
        if (NIL != string_utilities.non_empty_stringP(pred)) {
            pred = cb_frames.terms_for_browsing(pred, UNPROVIDED, UNPROVIDED);
            if (pred.isCons()) {
                pred = list_utilities.delete_if_not(symbol_function($sym159$HB_BINARY_PREDICATE_), pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (pred.isCons() && length(pred).numE(ONE_INTEGER)) {
                pred = pred.first();
            }
        }
        index = (index.equalp($$$2)) ? TWO_INTEGER : ONE_INTEGER;
        lex = equalp(lex, $$$lex);
        comments = equalp(comments, $$$comments);
        mts_after = equalp(mts_after, $str107$mts_after);
        height = read_from_string_ignoring_errors(height, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (!height.isInteger()) {
            if (height.equal(NONE)) {
                height = ZERO_INTEGER;
            } else
                if (height.equal(ALL)) {
                    height = NIL;
                } else {
                    height = FOUR_INTEGER;
                }

        }
        depth = read_from_string_ignoring_errors(depth, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (!depth.isInteger()) {
            if (depth.equal(NONE)) {
                depth = ZERO_INTEGER;
            } else
                if (depth.equal(ALL)) {
                    depth = NIL;
                } else {
                    depth = FOUR_INTEGER;
                }

        }
        if (NIL != string_utilities.non_empty_stringP(inferior)) {
            inferior = read_from_string_ignoring_errors(inferior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((!inferior.isInteger()) || (!inferior.numGE(ZERO_INTEGER))) {
            inferior = $str61$;
        }
        if (NIL != string_utilities.non_empty_stringP(quantum)) {
            quantum = read_from_string_ignoring_errors(quantum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (((!quantum.isInteger()) || (!quantum.numGE(ZERO_INTEGER))) || (!quantum.numLE($int$50))) {
            quantum = FOUR_INTEGER;
        }
        $hb_use_defaults_for_type$.setDynamicValue(defaults, thread);
        $hb_use_genl_mts$.setDynamicValue(v_genl_mts, thread);
        $hb_index_argument$.setDynamicValue(index, thread);
        $hb_gather_argument$.setDynamicValue($hb_index_argument$.getDynamicValue(thread).numE(ONE_INTEGER) ? TWO_INTEGER : ONE_INTEGER, thread);
        $hb_use_lexicon$.setDynamicValue(lex, thread);
        $hb_show_comments$.setDynamicValue(comments, thread);
        $hb_show_mts$.setDynamicValue(mts_after, thread);
        $hb_max_height$.setDynamicValue(height, thread);
        $hb_max_depth$.setDynamicValue(depth, thread);
        $hb_max_inferiors$.setDynamicValue(inferior, thread);
        $hb_indent_quantum$.setDynamicValue(quantum, thread);
        SubLObject successes = NIL;
        SubLObject failures = NIL;
        if (NIL != forts.valid_fortP(v_term)) {
            $hb_pivot_term$.setDynamicValue(v_term, thread);
            if (NIL != $hb_use_defaults_for_type$.getDynamicValue(thread)) {
                hb_set_defaults_for_type($hb_pivot_term$.getDynamicValue(thread));
                return hb_print_nodes(UNPROVIDED);
            }
            successes = cons($TERM, successes);
        }
        if ((NIL != forts.valid_fortP(pred)) && (NIL != isa.isa_in_any_mtP(pred, $$Predicate))) {
            $hb_predicate$.setDynamicValue(pred, thread);
            successes = cons($PRED, successes);
        }
        if ((NIL != all_mts) || ((NIL != forts.valid_fortP(mt)) && (NIL != isa.isa_in_any_mtP(mt, $$Microtheory)))) {
            $hb_mt$.setDynamicValue(NIL != all_mts ? $ALL : mt, thread);
            successes = cons($MT, successes);
        }
        if (NIL == find($TERM, successes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (!v_term.isCons()) {
                $hb_message$.setDynamicValue(format(NIL, $str166$The_input__s_did_not_yield_a_vali, html_extract_input($str68$new_term, args)), thread);
                return hb_parameters(UNPROVIDED);
            }
            failures = cons(list($TERM, v_term), failures);
        }
        if (NIL == find($PRED, successes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (!pred.isCons()) {
                $hb_message$.setDynamicValue(format(NIL, $str167$The_input__s_did_not_yield_a_vali, html_extract_input($$$pred, args)), thread);
                return hb_parameters(UNPROVIDED);
            }
            failures = cons(list($PRED, pred), failures);
        }
        if (NIL == find($MT, successes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (!mt.isCons()) {
                $hb_message$.setDynamicValue(format(NIL, $str168$The_input__s_did_not_yield_a_vali, html_extract_input($$$mt, args)), thread);
                return hb_parameters(UNPROVIDED);
            }
            failures = cons(list($MT, mt), failures);
        }
        if (NIL != failures) {
            return hb_choose_constants(failures);
        }
        if (NIL != $hb_use_defaults_for_type$.getDynamicValue(thread)) {
            hb_set_defaults_for_type($hb_pivot_term$.getDynamicValue(thread));
        }
        $hb_message$.setDynamicValue(format(NIL, $str169$Parameters_updated_at__a_on__a, time, date), thread);
        return hb_print_nodes(UNPROVIDED);
    }

    public static SubLObject hb_handle_colors_and_symbols(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bg_color = html_extract_input($str112$bg_color, args);
        SubLObject msg_color = html_extract_input($str115$msg_color, args);
        SubLObject icon = html_extract_input($str117$hb_icon, args);
        SubLObject bar = html_extract_input($str119$hb_bar, args);
        SubLObject top_sign = html_extract_input($str122$hb_top_sign, args);
        SubLObject bottom_sign = html_extract_input($str126$hb_bottom_sign, args);
        SubLObject sup_sign = html_extract_input($str128$superiors_sign, args);
        SubLObject inf_sign = html_extract_input($str130$inferiors_sign, args);
        SubLObject cycle = html_extract_input($str132$cycle_sign, args);
        final SubLObject strings = string_utilities.break_words(numeric_date_utilities.timestring(UNPROVIDED), symbol_function($sym155$VALID_TIMESTRING_CHAR_), UNPROVIDED);
        final SubLObject time = second(strings);
        final SubLObject date = strings.first();
        if (NIL != string_utilities.non_empty_stringP(bg_color)) {
            bg_color = rassoc(bg_color, apps_shared.$app_color_name_map$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED).first();
        } else {
            bg_color = $DEFAULT;
        }
        if (NIL != string_utilities.non_empty_stringP(msg_color)) {
            msg_color = rassoc(msg_color, apps_shared.$app_color_name_map$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED).first();
        } else {
            msg_color = $BLACK;
        }
        if (NIL != string_utilities.non_empty_stringP(icon)) {
            icon = string_utilities.keyword_from_string(icon);
        } else {
            icon = $str4$_;
        }
        if (NIL == string_utilities.non_empty_stringP(bar)) {
            bar = NIL;
        }
        if (NIL == string_utilities.non_empty_stringP(top_sign)) {
            top_sign = $str61$;
        }
        if (NIL == string_utilities.non_empty_stringP(bottom_sign)) {
            bottom_sign = $str61$;
        }
        if (NIL == string_utilities.non_empty_stringP(sup_sign)) {
            sup_sign = $str61$;
        }
        if (NIL == string_utilities.non_empty_stringP(inf_sign)) {
            inf_sign = $str61$;
        }
        if (NIL == string_utilities.non_empty_stringP(cycle)) {
            cycle = $str61$;
        }
        $hb_background_color$.setDynamicValue(bg_color, thread);
        $hb_message_color$.setDynamicValue(msg_color, thread);
        $hb_icon$.setDynamicValue(NIL != member(icon, $hb_icon_choices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? icon : $str4$_, thread);
        $hb_bar$.setDynamicValue((NIL != bar) && $hb_bar_choice$.getDynamicValue(thread).isKeyword() ? $hb_bar_choice$.getDynamicValue(thread) : NIL, thread);
        $hb_top_sign$.setDynamicValue(top_sign, thread);
        $hb_bottom_sign$.setDynamicValue(bottom_sign, thread);
        $hb_more_superiors_sign$.setDynamicValue(sup_sign, thread);
        $hb_more_inferiors_sign$.setDynamicValue(inf_sign, thread);
        $hb_cycle_sign$.setDynamicValue(cycle, thread);
        $hb_message$.setDynamicValue(format(NIL, $str173$Colors_and_symbols_updated_at__a_, time, date), thread);
        return hb_parameters(UNPROVIDED);
    }

    public static SubLObject hb_set_defaults_for_type(final SubLObject fort) {
        if (NIL != indexed_term_p(fort)) {
            final SubLObject default_method_info = hb_default_method_info(fort);
            if (NIL == default_method_info) {
                $hb_message$.setDynamicValue(format(NIL, $str177$No_default_display_parameters_are, hb_string_for_constant(fort)));
                return hb_parameters(UNPROVIDED);
            }
            SubLObject current;
            final SubLObject datum = current = default_method_info;
            SubLObject type = NIL;
            SubLObject predicate = NIL;
            SubLObject index = NIL;
            SubLObject gather = NIL;
            SubLObject height = NIL;
            SubLObject depth = NIL;
            destructuring_bind_must_consp(current, datum, $list175);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list175);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list175);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list175);
            gather = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list175);
            height = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list175);
            depth = current.first();
            current = current.rest();
            if (NIL == current) {
                $hb_pivot_term$.setDynamicValue(fort);
                $hb_predicate$.setDynamicValue(predicate);
                $hb_mt$.setDynamicValue($ALL);
                $hb_index_argument$.setDynamicValue(index);
                $hb_gather_argument$.setDynamicValue(gather);
                $hb_max_height$.setDynamicValue(height);
                $hb_max_depth$.setDynamicValue(depth);
                $hb_message$.setDynamicValue(format(NIL, $str176$Using_default_settings_for_instan, hb_string_for_constant(type)));
            } else {
                cdestructuring_bind_error(datum, $list175);
            }
        }
        return NIL;
    }

    public static SubLObject hb_simple_choose_constants(final SubLObject failures) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = $hb_background_color$.getDynamicValue(thread);
        final SubLObject form = failures.first();
        final SubLObject key = form.first();
        final SubLObject v_forts = second(form);
        final SubLObject sorted_forts = Sort.sort(v_forts, symbol_function(STRING_LESSP), symbol_function(HB_STRING_FOR_CONSTANT));
        final SubLObject string = (key == $TERM) ? $$$term : key == $PRED ? $$$predicate : $$$microtheory;
        final SubLObject plural = (string.equalp($$$microtheory)) ? $$$microtheories : format(NIL, $str182$_as, string);
        html_markup($str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str139$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str183$Choose_Constants__Simple_Version);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$87 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str184$Choose_a__a, Strings.string_capitalize(string, UNPROVIDED, UNPROVIDED));
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_br();
                    html_br();
                    html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str185$Please_choose_one_of_the_followin, plural);
                    html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    html_br();
                    html_br();
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var = sorted_forts;
                        SubLObject c = NIL;
                        c = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($$$left));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cyc_navigator_internals.nav_link($HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, list(cb_fort_identifier(c), string), $SELF, hb_string_for_constant(c), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            c = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$87, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject hb_handle_simple_choose_constants(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject fort = cb_guess_fort(id, UNPROVIDED);
        final SubLObject string = second(args);
        if (string.equalp($$$term)) {
            $hb_pivot_term$.setDynamicValue(fort, thread);
        } else
            if (string.equalp($$$predicate)) {
                $hb_predicate$.setDynamicValue(fort, thread);
            } else
                if (string.equalp($$$microtheory)) {
                    $hb_mt$.setDynamicValue(fort, thread);
                }


        if (NIL != $hb_use_defaults_for_type$.getDynamicValue(thread)) {
            hb_set_defaults_for_type($hb_pivot_term$.getDynamicValue(thread));
        }
        return hb_print_nodes(UNPROVIDED);
    }

    public static SubLObject hb_choose_constants(final SubLObject failures) {
        if (length(failures).numE(ONE_INTEGER)) {
            return hb_simple_choose_constants(failures);
        }
        return hb_complex_choose_constants(failures);
    }

    public static SubLObject hb_complex_choose_constants(SubLObject failures) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        failures = nreverse(failures);
        final SubLObject color = $hb_background_color$.getDynamicValue(thread);
        html_markup($str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str139$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str190$Choose_Constants__Complex_Version);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$92 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Resolve_Ambiguous_Input);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    final SubLObject frame_name_var = cb_frame_name(NIL);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$post);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != frame_name_var) {
                        html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(frame_name_var);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str192$hb_handle_complex_choose_constant, T, UNPROVIDED);
                        html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_submit_input($$$Go, UNPROVIDED, UNPROVIDED);
                        html_br();
                        html_br();
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str194$Please_select_one_term_from_each_);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_br();
                        SubLObject cdolist_list_var = failures;
                        SubLObject form = NIL;
                        form = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_br();
                            final SubLObject key = form.first();
                            final SubLObject v_forts = second(form);
                            final SubLObject first_c = v_forts.first();
                            final SubLObject heading = (key == $TERM) ? $$$Terms : key == $PRED ? $$$Predicates : $$$Microtheories;
                            final SubLObject name = format(NIL, $str198$_a, key);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), heading);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject cdolist_list_var_$96 = v_forts;
                                SubLObject c = NIL;
                                c = cdolist_list_var_$96.first();
                                while (NIL != cdolist_list_var_$96) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($$$right));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_radio_input(name, cb_fort_identifier(c), equal(c, first_c), UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$_);
                                            hb_print_constant(c, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                    c = cdolist_list_var_$96.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            cdolist_list_var = cdolist_list_var.rest();
                            form = cdolist_list_var.first();
                        } 
                        html_submit_input($$$Go, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$92, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject hb_handle_complex_choose_constants(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_id_string = html_extract_input($$$term, args);
        final SubLObject pred_id_string = html_extract_input($$$pred, args);
        final SubLObject mt_id_string = html_extract_input($$$mt, args);
        final SubLObject term_id = (NIL != string_utilities.non_empty_stringP(term_id_string)) ? read_from_string_ignoring_errors(term_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject pred_id = (NIL != string_utilities.non_empty_stringP(pred_id_string)) ? read_from_string_ignoring_errors(pred_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject mt_id = (NIL != string_utilities.non_empty_stringP(mt_id_string)) ? read_from_string_ignoring_errors(mt_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        if (term_id.isFixnum()) {
            $hb_pivot_term$.setDynamicValue(cb_guess_fort(term_id, UNPROVIDED), thread);
        }
        if (pred_id.isFixnum()) {
            $hb_predicate$.setDynamicValue(cb_guess_fort(pred_id, UNPROVIDED), thread);
        }
        if (mt_id.isFixnum()) {
            $hb_mt$.setDynamicValue(cb_guess_fort(mt_id, UNPROVIDED), thread);
        }
        if (NIL != $hb_use_defaults_for_type$.getDynamicValue(thread)) {
            hb_set_defaults_for_type($hb_pivot_term$.getDynamicValue(thread));
        }
        return hb_print_nodes(UNPROVIDED);
    }

    public static SubLObject hb_select_node(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject id = (NIL != string_utilities.non_empty_stringP(args)) ? args : args.isCons() ? args.first() : args.isInteger() ? args : NIL;
        final SubLObject fort = cb_guess_fort(id, UNPROVIDED);
        $hb_pivot_term$.setDynamicValue(fort);
        hb_print_nodes(UNPROVIDED);
        return NIL;
    }

    public static SubLObject set_hb_eval_form() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $hb_eval_form$.setDynamicValue(list($hb_predicate$.getDynamicValue(thread), $hb_index_argument$.getDynamicValue(thread), $hb_gather_argument$.getDynamicValue(thread)), thread);
        $hb_inverse_eval_form$.setDynamicValue(list($hb_predicate$.getDynamicValue(thread), $hb_gather_argument$.getDynamicValue(thread), $hb_index_argument$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject hb_alternate_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject alt_predicate = second(assoc(predicate, $hb_alternate_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        return NIL != forts.valid_fortP(alt_predicate) ? alt_predicate : NIL;
    }

    public static SubLObject set_hb_alternate_predicate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $hb_alternate_predicate$.setDynamicValue(hb_alternate_predicate($hb_predicate$.getDynamicValue(thread)), thread);
        return $hb_alternate_predicate$.getDynamicValue(thread);
    }

    public static SubLObject hb_get_nodes(final SubLObject v_term, SubLObject recursive_call) {
        if (recursive_call == UNPROVIDED) {
            recursive_call = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = function_terms.naut_to_nart(v_term);
        final SubLObject predicate = $hb_eval_form$.getDynamicValue(thread).first();
        final SubLObject index_arg = second($hb_eval_form$.getDynamicValue(thread));
        final SubLObject gather_arg = third($hb_eval_form$.getDynamicValue(thread));
        SubLObject ans = NIL;
        if (NIL != indexed_term_p(fort)) {
            if ($hb_mt$.getDynamicValue(thread) == $ALL) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    ans = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != $hb_use_genl_mts$.getDynamicValue(thread)) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($hb_mt$.getDynamicValue(thread));
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        ans = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind($hb_mt$.getDynamicValue(thread), thread);
                        ans = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }

            if ((NIL == recursive_call) && (NIL != forts.valid_fortP($hb_alternate_predicate$.getDynamicValue(thread)))) {
                final SubLObject _prev_bind_0 = $hb_eval_form$.currentBinding(thread);
                try {
                    $hb_eval_form$.bind(subst($hb_alternate_predicate$.getDynamicValue(thread), predicate, $hb_eval_form$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                    ans = union(ans, hb_get_nodes(v_term, T), symbol_function(EQUAL), UNPROVIDED);
                } finally {
                    $hb_eval_form$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }

    public static SubLObject hb_comments(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = function_terms.naut_to_nart(v_term);
        final SubLObject pred = $$comment;
        SubLObject assertions = NIL;
        SubLObject mt_string_pairs = NIL;
        if ((NIL != indexed_term_p(fort)) && (NIL != pred)) {
            if ($hb_mt$.getDynamicValue(thread) == $ALL) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    assertions = kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != $hb_use_genl_mts$.getDynamicValue(thread)) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($hb_mt$.getDynamicValue(thread));
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        assertions = kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind($hb_mt$.getDynamicValue(thread), thread);
                        assertions = kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }

            SubLObject cdolist_list_var = assertions;
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject formula = misc_kb_utilities.make_lispy_form(ass);
                final SubLObject string = third(formula);
                final SubLObject mt = assertions_high.assertion_mt(ass);
                mt_string_pairs = cons(list(mt, string), mt_string_pairs);
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            mt_string_pairs = Sort.sort(mt_string_pairs, symbol_function(STRING_LESSP), symbol_function(NAME_OF_CAR));
        }
        return mt_string_pairs;
    }

    public static SubLObject hb_maybe_print_comments(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $hb_show_comments$.getDynamicValue(thread)) {
            final SubLObject mt_comment_pairs = hb_comments(fort);
            if (NIL != mt_comment_pairs) {
                html_br();
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = mt_comment_pairs;
                    SubLObject pair = NIL;
                    pair = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_br();
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($$$right));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != size_val) {
                                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(size_val);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_form(pair.first(), UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str113$__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != size_val) {
                                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(size_val);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ_doc_string(second(pair), UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        pair = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject hb_string_for_constant(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        if (NIL != $hb_use_lexicon$.getDynamicValue(thread)) {
            string = pph_main.generate_phrase(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            string = misc_kb_utilities.coerce_name(fort);
        }
        return string;
    }

    public static SubLObject hb_print_constant(final SubLObject fort, SubLObject hb_linkP) {
        if (hb_linkP == UNPROVIDED) {
            hb_linkP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = (NIL != forts.valid_fortP(fort)) ? cb_fort_identifier(fort) : NIL;
        if ((NIL != id) && (NIL != hb_linkP)) {
            if ($hb_icon$.getDynamicValue(thread).equal($str4$_)) {
                cyc_navigator_internals.nav_link($HB_SELECT_NODE_TEXT, list(id), $SELF, $hb_icon$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cyc_navigator_internals.nav_link($HB_SELECT_NODE_IMAGE, list(id), $SELF, NIL, $hb_icon$.getDynamicValue(thread), $str4$_, $TOP, UNPROVIDED, UNPROVIDED);
            }
        }
        if (NIL != $hb_use_lexicon$.getDynamicValue(thread)) {
            pph_html.html_phrase_with_target(fort, CB_CF, $SELF);
        } else {
            cb_form(fort, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject hb_accessor(final SubLObject fort, final SubLObject mt, SubLObject key) {
        if (key == UNPROVIDED) {
            key = $ISA;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mtP = isa.isa_in_any_mtP(mt, $$Microtheory);
        SubLObject function = NIL;
        SubLObject ans = NIL;
        if (NIL != indexed_term_p(fort)) {
            final SubLObject pcase_var = key;
            if (pcase_var.eql($ISA)) {
                function = MIN_ISA;
            } else
                if (pcase_var.eql($GENLS)) {
                    function = MIN_GENLS;
                } else
                    if (pcase_var.eql($ALL_ISA)) {
                        function = ALL_ISA;
                    } else
                        if (pcase_var.eql($ALL_GENLS)) {
                            function = ALL_GENLS;
                        } else {
                            function = LIST;
                        }



            if (mt == $ALL) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    ans = funcall(function, fort);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if ((NIL != $hb_use_genl_mts$.getDynamicValue(thread)) && (NIL != mtP)) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        ans = funcall(function, fort);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    }
                } else
                    if (NIL != mtP) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            ans = funcall(function, fort);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    } else {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = funcall(function, fort);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }


        }
        return remove_duplicates(ans, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hb_status_heading(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_form($$isa, UNPROVIDED, UNPROVIDED);
                        html_princ($str113$__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject isas = hb_accessor($hb_pivot_term$.getDynamicValue(thread), $hb_mt$.getDynamicValue(thread), $ISA);
                        final SubLObject sorted_isas = Sort.sort(isas, symbol_function(STRING_LESSP), symbol_function(HB_STRING_FOR_CONSTANT));
                        final SubLObject last = last(sorted_isas, UNPROVIDED).first();
                        if (NIL != isas) {
                            SubLObject cdolist_list_var = sorted_isas;
                            SubLObject v_isa = NIL;
                            v_isa = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                hb_print_constant(v_isa, UNPROVIDED);
                                if (!v_isa.equal(last)) {
                                    html_princ($str218$__);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                v_isa = cdolist_list_var.first();
                            } 
                        } else {
                            html_princ($$$None);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL != find($$Collection, hb_accessor($hb_pivot_term$.getDynamicValue(thread), $hb_mt$.getDynamicValue(thread), $ALL_ISA), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($$$right));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_form($$genls, UNPROVIDED, UNPROVIDED);
                            html_princ($str113$__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject v_genls = hb_accessor($hb_pivot_term$.getDynamicValue(thread), $hb_mt$.getDynamicValue(thread), $GENLS);
                            final SubLObject sorted_genls = Sort.sort(v_genls, symbol_function(STRING_LESSP), symbol_function(HB_STRING_FOR_CONSTANT));
                            final SubLObject last = last(sorted_genls, UNPROVIDED).first();
                            if (NIL != v_genls) {
                                SubLObject cdolist_list_var = sorted_genls;
                                SubLObject genl = NIL;
                                genl = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    hb_print_constant(genl, UNPROVIDED);
                                    if (!genl.equal(last)) {
                                        html_princ($str218$__);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    genl = cdolist_list_var.first();
                                } 
                            } else {
                                html_princ($$$None);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str221$Context__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject mtP = isa.isa_in_any_mtP($hb_mt$.getDynamicValue(thread), $$Microtheory);
                        if ($hb_mt$.getDynamicValue(thread) == $ALL) {
                            html_princ($$$Union_of_all_contexts);
                        } else
                            if ((NIL != $hb_use_genl_mts$.getDynamicValue(thread)) && (NIL != mtP)) {
                                hb_print_constant($hb_mt$.getDynamicValue(thread), UNPROVIDED);
                                html_princ($$$_and_its_);
                                cb_form($$genlMt, UNPROVIDED, UNPROVIDED);
                                html_princ($$$s);
                            } else
                                if (NIL != mtP) {
                                    hb_print_constant($hb_mt$.getDynamicValue(thread), UNPROVIDED);
                                } else {
                                    html_princ($str226$Unknown_);
                                }


                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str227$Predicate__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        hb_print_constant($hb_predicate$.getDynamicValue(thread), UNPROVIDED);
                        if (NIL != forts.valid_fortP($hb_alternate_predicate$.getDynamicValue(thread))) {
                            html_princ($str218$__);
                            hb_print_constant($hb_alternate_predicate$.getDynamicValue(thread), UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str228$Index__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str198$_a, $hb_index_argument$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_hb_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$hb_table$.getDynamicValue(thread).isHashtable()) {
            $hb_table$.setDynamicValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED), thread);
        }
        clrhash($hb_table$.getDynamicValue(thread));
        return $hb_table$.getDynamicValue(thread);
    }

    public static SubLObject clear_hb_duplicates_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$hb_duplicates_table$.getDynamicValue(thread).isHashtable()) {
            $hb_duplicates_table$.setDynamicValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED), thread);
        }
        clrhash($hb_duplicates_table$.getDynamicValue(thread));
        return $hb_duplicates_table$.getDynamicValue(thread);
    }

    public static SubLObject clear_hb_superior_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$hb_superior_table$.getDynamicValue(thread).isHashtable()) {
            $hb_superior_table$.setDynamicValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED), thread);
        }
        final SubLObject cdohash_table = $hb_superior_table$.getDynamicValue(thread);
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (val.isHashtable()) {
                    clrhash(val);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return $hb_superior_table$.getDynamicValue(thread);
    }

    public static SubLObject hb_init() {
        clear_hb_table();
        clear_hb_duplicates_table();
        clear_hb_superior_table();
        apps_shared.configure_app_colors();
        set_default_hb_icon();
        set_hb_eval_form();
        set_hb_alternate_predicate();
        return NIL;
    }

    public static SubLObject hb_bar(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $hb_bar$.getDynamicValue(thread)) {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($hb_bar$.getDynamicValue(thread));
            final SubLObject align = $TOP;
            final SubLObject alt = $str230$__________;
            final SubLObject border = ZERO_INTEGER;
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != alt) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(alt);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != align) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(align));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != border) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject hb_print_nodes(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.valid_fortP($hb_pivot_term$.getDynamicValue(thread))) {
            hb_init();
            final SubLObject color = $hb_background_color$.getDynamicValue(thread);
            html_markup($str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str139$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str233$Hierarchical_Display___a, hb_string_for_constant($hb_pivot_term$.getDynamicValue(thread)));
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$130 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != color) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_browser.cb_term_page_heading($hb_pivot_term$.getDynamicValue(thread), HIERARCHY_DEFAULT);
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str235$hb_parameters, T, UNPROVIDED);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($$$middle));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        hb_status_heading(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                if (NIL != $hb_message$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($$$middle));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                                            if (NIL != size_val) {
                                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(size_val);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                hb_message(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
                                            }
                                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$140, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$146, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($$$middle));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_help_preamble($HB_PRINT_NODES, UNPROVIDED, UNPROVIDED);
                                        html_submit_input($$$Change_Hierarchy_Browser_Settings, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$147, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                if (NIL != $hb_bar$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($$$middle));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            hb_bar(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                hb_print_nodes_1($hb_pivot_term$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$130, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } else {
            $hb_message$.setDynamicValue(format(NIL, $str237$_a_is_not_a_valid_constant_, $hb_pivot_term$.getDynamicValue(thread)), thread);
            hb_parameters(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject hb_construct_superior_paths(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hb_superior_table();
        clear_hb_table();
        if (NIL != indexed_term_p(fort)) {
            final SubLObject _prev_bind_0 = $hb_eval_form$.currentBinding(thread);
            try {
                $hb_eval_form$.bind($hb_inverse_eval_form$.getDynamicValue(thread), thread);
                hb_construct_superior_paths_int(list(fort), $hb_eval_form$.getDynamicValue(thread), ZERO_INTEGER);
            } finally {
                $hb_eval_form$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject hb_superior_table_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (!$hb_superior_table$.getDynamicValue(thread).isHashtable()) {
            $hb_superior_table$.setDynamicValue(make_hash_table($int$50, symbol_function(EQUAL), UNPROVIDED), thread);
        }
        final SubLObject cdohash_table = $hb_superior_table$.getDynamicValue(thread);
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (val.isHashtable() && hash_table_count(val).numG(ZERO_INTEGER)) {
                    count = add(count, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    public static SubLObject hb_construct_superior_paths_int(SubLObject v_forts, final SubLObject eval_form, SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = eval_form.first();
        final SubLObject alt_pred = hb_alternate_predicate(predicate);
        final SubLObject index_arg = second(eval_form);
        final SubLObject gather_arg = third(eval_form);
        SubLObject superiors = NIL;
        for (SubLObject all_superiors = NIL; (NIL != v_forts) && ((!$hb_max_height$.getDynamicValue(thread).isInteger()) || (!level.numGE($hb_max_height$.getDynamicValue(thread)))); v_forts = all_superiors , all_superiors = NIL , superiors = NIL , level = add(level, ONE_INTEGER)) {
            SubLObject cdolist_list_var = v_forts;
            SubLObject fort = NIL;
            fort = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != indexed_term_p(fort)) {
                    if ($hb_mt$.getDynamicValue(thread) == $ALL) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            superiors = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, UNPROVIDED);
                            if (NIL != forts.valid_fortP(alt_pred)) {
                                superiors = union(superiors, kb_mapping_utilities.pred_values(fort, alt_pred, index_arg, gather_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    } else
                        if (NIL != $hb_use_genl_mts$.getDynamicValue(thread)) {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($hb_mt$.getDynamicValue(thread));
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                superiors = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, UNPROVIDED);
                                if (NIL != forts.valid_fortP(alt_pred)) {
                                    superiors = union(superiors, kb_mapping_utilities.pred_values(fort, alt_pred, index_arg, gather_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                            }
                        } else {
                            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind($hb_mt$.getDynamicValue(thread), thread);
                                superiors = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, UNPROVIDED);
                                if (NIL != forts.valid_fortP(alt_pred)) {
                                    superiors = union(superiors, kb_mapping_utilities.pred_values(fort, alt_pred, index_arg, gather_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }

                }
                if (NIL != superiors) {
                    SubLObject table = gethash(level, $hb_superior_table$.getDynamicValue(thread), UNPROVIDED);
                    if (!table.isHashtable()) {
                        sethash(level, $hb_superior_table$.getDynamicValue(thread), make_hash_table($int$50, UNPROVIDED, UNPROVIDED));
                        table = gethash(level, $hb_superior_table$.getDynamicValue(thread), UNPROVIDED);
                    }
                    SubLObject cdolist_list_var_$152 = superiors;
                    SubLObject p = NIL;
                    p = cdolist_list_var_$152.first();
                    while (NIL != cdolist_list_var_$152) {
                        if (NIL == gethash(list(fort, p), $hb_table$.getDynamicValue(thread), UNPROVIDED)) {
                            final SubLObject val = gethash(p, table, UNPROVIDED);
                            sethash(p, table, adjoin(fort, val, UNPROVIDED, UNPROVIDED));
                            final SubLObject item_var = p;
                            if (NIL == member(item_var, all_superiors, symbol_function(EQL), symbol_function(IDENTITY))) {
                                all_superiors = cons(item_var, all_superiors);
                            }
                            sethash(list(fort, p), $hb_table$.getDynamicValue(thread), T);
                        }
                        cdolist_list_var_$152 = cdolist_list_var_$152.rest();
                        p = cdolist_list_var_$152.first();
                    } 
                    superiors = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject hb_print_mt_list(final SubLObject pivot_term, final SubLObject c2, SubLObject pivot_term_is_to_c2) {
        if (pivot_term_is_to_c2 == UNPROVIDED) {
            pivot_term_is_to_c2 = $SUPERIOR;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        if (((pivot_term_is_to_c2 == $SUPERIOR) && $hb_index_argument$.getDynamicValue(thread).eql(ONE_INTEGER)) || ((pivot_term_is_to_c2 == $INFERIOR) && $hb_index_argument$.getDynamicValue(thread).eql(TWO_INTEGER))) {
            arg1 = pivot_term;
            arg2 = c2;
        } else
            if (((pivot_term_is_to_c2 == $SUPERIOR) && $hb_index_argument$.getDynamicValue(thread).eql(TWO_INTEGER)) || ((pivot_term_is_to_c2 == $INFERIOR) && $hb_index_argument$.getDynamicValue(thread).eql(ONE_INTEGER))) {
                arg2 = pivot_term;
                arg1 = c2;
            }

        final SubLObject some_mts = kb_indexing.gaf_mts(list($hb_predicate$.getDynamicValue(thread), arg1, arg2));
        final SubLObject mts = (NIL != forts.valid_fortP($hb_alternate_predicate$.getDynamicValue(thread))) ? union(some_mts, kb_indexing.gaf_mts(list($hb_alternate_predicate$.getDynamicValue(thread), arg1, arg2)), symbol_function(EQUAL), UNPROVIDED) : some_mts;
        final SubLObject sorted_mts = Sort.sort(mts, symbol_function(STRING_LESSP), symbol_function(COERCE_NAME));
        final SubLObject last = last(sorted_mts, UNPROVIDED).first();
        final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($str241$__);
            if (NIL != sorted_mts) {
                SubLObject cdolist_list_var = sorted_mts;
                SubLObject mt = NIL;
                mt = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cb_form(mt, UNPROVIDED, UNPROVIDED);
                    if (!mt.equal(last)) {
                        html_princ($str218$__);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                } 
            } else {
                html_princ($str226$Unknown_);
            }
            html_princ($str242$_);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject hb_print_pivot_mts(final SubLObject pivot_term, final SubLObject v_forts, final SubLObject indent, SubLObject pivot_term_position) {
        if (pivot_term_position == UNPROVIDED) {
            pivot_term_position = $SUPERIOR;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hb_table();
        SubLObject mt_list = NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject c = NIL;
        c = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            if (((pivot_term_position == $SUPERIOR) && $hb_index_argument$.getDynamicValue(thread).eql(ONE_INTEGER)) || ((pivot_term_position == $INFERIOR) && $hb_index_argument$.getDynamicValue(thread).eql(TWO_INTEGER))) {
                arg1 = pivot_term;
                arg2 = c;
            } else
                if (((pivot_term_position == $SUPERIOR) && $hb_index_argument$.getDynamicValue(thread).eql(TWO_INTEGER)) || ((pivot_term_position == $INFERIOR) && $hb_index_argument$.getDynamicValue(thread).eql(ONE_INTEGER))) {
                    arg2 = pivot_term;
                    arg1 = c;
                }

            SubLObject mts = kb_indexing.gaf_mts(list($hb_predicate$.getDynamicValue(thread), arg1, arg2));
            if (NIL != forts.valid_fortP($hb_alternate_predicate$.getDynamicValue(thread))) {
                mts = union(mts, kb_indexing.gaf_mts(list($hb_alternate_predicate$.getDynamicValue(thread), arg1, arg2)), symbol_function(EQUAL), UNPROVIDED);
            }
            SubLObject cdolist_list_var_$153 = mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var_$153.first();
            while (NIL != cdolist_list_var_$153) {
                hash_table_utilities.pushnew_hash(mt, c, $hb_table$.getDynamicValue(thread), UNPROVIDED);
                final SubLObject item_var = mt;
                if (NIL == member(item_var, mt_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                    mt_list = cons(item_var, mt_list);
                }
                cdolist_list_var_$153 = cdolist_list_var_$153.rest();
                mt = cdolist_list_var_$153.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            c = cdolist_list_var.first();
        } 
        if (NIL != mt_list) {
            cdolist_list_var = Sort.sort(mt_list, symbol_function(STRING_LESSP), symbol_function(COERCE_NAME));
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject val = Sort.sort(copy_list(gethash(x, $hb_table$.getDynamicValue(thread), UNPROVIDED)), symbol_function(STRING_LESSP), symbol_function(HB_STRING_FOR_CONSTANT));
                final SubLObject last = last(val, UNPROVIDED).first();
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_indent(indent);
                final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != size_val) {
                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(size_val);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str243$_);
                    cb_form(x, UNPROVIDED, UNPROVIDED);
                    html_princ($str244$_____);
                    SubLObject cdolist_list_var_$154 = val;
                    SubLObject v = NIL;
                    v = cdolist_list_var_$154.first();
                    while (NIL != cdolist_list_var_$154) {
                        hb_print_constant(v, T);
                        if (!v.equal(last)) {
                            html_princ($str218$__);
                        }
                        cdolist_list_var_$154 = cdolist_list_var_$154.rest();
                        v = cdolist_list_var_$154.first();
                    } 
                    html_princ($str245$__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            } 
        } else {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_indent(indent);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str246$_Unknown__);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        clear_hb_table();
        return NIL;
    }

    public static SubLObject hb_display_superiors() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hb_table();
        $hb_indent$.setDynamicValue(ZERO_INTEGER, thread);
        final SubLObject superior_level_count = hb_superior_table_count();
        if (superior_level_count.numG(ZERO_INTEGER)) {
            SubLObject level;
            SubLObject table;
            SubLObject cdolist_list_var;
            SubLObject v_forts;
            SubLObject c;
            for (level = NIL, level = subtract(superior_level_count, ONE_INTEGER); !level.numL(ZERO_INTEGER); level = subtract(level, ONE_INTEGER)) {
                table = gethash(level, $hb_superior_table$.getDynamicValue(thread), UNPROVIDED);
                v_forts = cdolist_list_var = Sort.sort(hash_table_utilities.list_table_keys(table), symbol_function($sym247$STRING_), symbol_function(COERCE_NAME));
                c = NIL;
                c = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    hb_trace_superior_paths(NIL, c, table, level, ONE_INTEGER, T);
                    cdolist_list_var = cdolist_list_var.rest();
                    c = cdolist_list_var.first();
                } 
            }
        } else
            if ((NIL == $hb_max_height$.getDynamicValue(thread)) || $hb_max_height$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                html_br();
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($$$No_superior_terms);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_br();
            }

        return NIL;
    }

    public static SubLObject reset_hb_indent(final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$hb_indent$.getDynamicValue(thread).numGE(indent)) {
            $hb_indent$.setDynamicValue(indent, thread);
        }
        return $hb_indent$.getDynamicValue(thread);
    }

    public static SubLObject hb_trace_superior_paths(final SubLObject previous, final SubLObject c, final SubLObject table, final SubLObject level, final SubLObject indent, final SubLObject starting_levelP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject quant = multiply(indent, $hb_indent_quantum$.getDynamicValue(thread));
        final SubLObject next_forts = Sort.sort(gethash(c, table, UNPROVIDED), symbol_function($sym247$STRING_), symbol_function(COERCE_NAME));
        final SubLObject next_level = subtract(level, ONE_INTEGER);
        final SubLObject next_table = gethash(next_level, $hb_superior_table$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject next_indent = add(indent, ONE_INTEGER);
        final SubLObject _prev_bind_0 = $hb_eval_form$.currentBinding(thread);
        try {
            $hb_eval_form$.bind($hb_inverse_eval_form$.getDynamicValue(thread), thread);
            SubLObject printing_fortP = NIL;
            SubLObject notice_printedP = NIL;
            if ((NIL == gethash(list(c, level), $hb_table$.getDynamicValue(thread), UNPROVIDED)) || (NIL == starting_levelP)) {
                printing_fortP = T;
                if (NIL != starting_levelP) {
                    final SubLObject sign = (NIL != hb_get_nodes(c, UNPROVIDED)) ? $hb_more_superiors_sign$.getDynamicValue(thread) : $hb_top_sign$.getDynamicValue(thread);
                    final SubLObject len = length(sign);
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_indent(subtract(quant, $hb_indent_quantum$.getDynamicValue(thread)));
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), sign);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_indent(subtract(quant, len));
                    hb_print_constant(c, T);
                    if (NIL == indexed_term_p(c)) {
                        final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str249$__not_an_indexed_term_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                } else {
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_indent(quant);
                    hb_print_constant(c, T);
                    if (NIL == indexed_term_p(c)) {
                        final SubLObject size_val2 = $hb_small_font_size$.getDynamicValue(thread);
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val2) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val2);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str249$__not_an_indexed_term_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$156, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                $hb_counter$.setDynamicValue(add($hb_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
                reset_hb_indent(indent);
                if ((NIL != $hb_show_mts$.getDynamicValue(thread)) && (NIL != previous)) {
                    hb_print_mt_list(c, previous, $INFERIOR);
                }
            }
            sethash(list(c, level), $hb_table$.getDynamicValue(thread), T);
            SubLObject cdolist_list_var = next_forts;
            SubLObject next = NIL;
            next = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                hash_table_utilities.cinc_hash(list(c, next), $hb_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject count = gethash(list(c, next), $hb_table$.getDynamicValue(thread), UNPROVIDED);
                if (count.numL(TWO_INTEGER)) {
                    hb_maybe_print_comments(c);
                    if (level.numG(ZERO_INTEGER)) {
                        hb_trace_superior_paths(c, next, next_table, next_level, next_indent, NIL);
                    }
                } else
                    if (((count.numGE(TWO_INTEGER) && (NIL != printing_fortP)) && level.numG(ZERO_INTEGER)) && (NIL == notice_printedP)) {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($hb_more_inferiors_sign$.getDynamicValue(thread));
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        final SubLObject size_val3 = $hb_small_font_size$.getDynamicValue(thread);
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val3) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val3);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($hb_cycle_sign$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$157, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        hb_maybe_print_comments(c);
                        notice_printedP = T;
                    }

                cdolist_list_var = cdolist_list_var.rest();
                next = cdolist_list_var.first();
            } 
        } finally {
            $hb_eval_form$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject hb_display_term(final SubLObject fort, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $hb_eval_form$.currentBinding(thread);
        try {
            $hb_eval_form$.bind($hb_inverse_eval_form$.getDynamicValue(thread), thread);
            final SubLObject superiors = hb_get_nodes(fort, UNPROVIDED);
            final SubLObject amount = multiply(indent, $hb_indent_quantum$.getDynamicValue(thread));
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_indent(amount);
            final SubLObject size_val = $hb_large_font_size$.getDynamicValue(thread);
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != size_val) {
                html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(size_val);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                hb_print_constant(fort, T);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            $hb_counter$.setDynamicValue(add($hb_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
            if ((NIL != $hb_show_mts$.getDynamicValue(thread)) && (NIL != superiors)) {
                hb_print_pivot_mts(fort, superiors, amount, $INFERIOR);
            }
            hb_maybe_print_comments(fort);
        } finally {
            $hb_eval_form$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject hb_print_nodes_2(final SubLObject fort, final SubLObject max, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $hb_previous_term_id$.currentBinding(thread);
        try {
            $hb_previous_term_id$.bind(NIL != $hb_previous_term_id$.getDynamicValue(thread) ? $hb_previous_term_id$.getDynamicValue(thread) : cb_fort_identifier($hb_pivot_term$.getDynamicValue(thread)), thread);
            final SubLObject previous = cb_guess_fort($hb_previous_term_id$.getDynamicValue(thread), UNPROVIDED);
            final SubLObject id = (NIL != forts.valid_fortP(fort)) ? cb_fort_identifier(fort) : NIL;
            final SubLObject already_printedP = gethash(id, $hb_duplicates_table$.getDynamicValue(thread), UNPROVIDED);
            final SubLObject index = multiply(depth, $hb_indent_quantum$.getDynamicValue(thread));
            final SubLObject nodes = hb_get_nodes(fort, UNPROVIDED);
            final SubLObject sorted_nodes = Sort.sort(nodes, symbol_function(STRING_LESSP), symbol_function(HB_STRING_FOR_CONSTANT));
            if ((NIL != id) && ((NIL == max) || depth.numL(max))) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_indent(index);
                sethash(id, $hb_duplicates_table$.getDynamicValue(thread), T);
                hb_print_constant(fort, T);
                $hb_counter$.setDynamicValue(add($hb_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
                if ((NIL != previous) && (NIL != $hb_show_mts$.getDynamicValue(thread))) {
                    hb_print_mt_list(fort, previous, $INFERIOR);
                }
                if (NIL != already_printedP) {
                    if (NIL != nodes) {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($hb_more_inferiors_sign$.getDynamicValue(thread));
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($hb_cycle_sign$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } else {
                        html_princ($hb_bottom_sign$.getDynamicValue(thread));
                    }
                } else
                    if (max.isInteger() && depth.numLE(subtract(max, ONE_INTEGER))) {
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        if (NIL != nodes) {
                            if (depth.numE(subtract(max, ONE_INTEGER))) {
                                html_princ($hb_more_inferiors_sign$.getDynamicValue(thread));
                            }
                        } else {
                            html_princ($hb_bottom_sign$.getDynamicValue(thread));
                        }
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } else
                        if ((NIL == max) && (NIL == nodes)) {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($hb_bottom_sign$.getDynamicValue(thread));
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }


                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                hb_maybe_print_comments(fort);
                if (NIL == already_printedP) {
                    SubLObject cdolist_list_var = sorted_nodes;
                    SubLObject node = NIL;
                    node = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0_$160 = $hb_previous_term_id$.currentBinding(thread);
                        try {
                            $hb_previous_term_id$.bind(id, thread);
                            hb_print_nodes_2(node, max, add(depth, ONE_INTEGER));
                        } finally {
                            $hb_previous_term_id$.rebind(_prev_bind_0_$160, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        node = cdolist_list_var.first();
                    } 
                }
            } else
                if ((NIL == max) || depth.numL(max)) {
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_indent(index);
                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                    final SubLObject size_val = $hb_small_font_size$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$161 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str249$__not_an_indexed_term_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$161, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }

        } finally {
            $hb_previous_term_id$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject hb_display_inferiors(final SubLObject fort, final SubLObject depth, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hb_duplicates_table();
        if (!$hb_max_depth$.getDynamicValue(thread).equal(ZERO_INTEGER)) {
            final SubLObject id = cb_fort_identifier(fort);
            final SubLObject nodes = hb_get_nodes(fort, UNPROVIDED);
            final SubLObject sorted_nodes = Sort.sort(nodes, symbol_function(STRING_LESSP), symbol_function(HB_STRING_FOR_CONSTANT));
            final SubLObject new_depth = (depth.isInteger()) ? add(indent, depth) : NIL;
            if ((NIL != sorted_nodes) && (!depth.equal(ZERO_INTEGER))) {
                SubLObject cdolist_list_var = sorted_nodes;
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = $hb_previous_term_id$.currentBinding(thread);
                    try {
                        $hb_previous_term_id$.bind(id, thread);
                        hb_print_nodes_2(node, new_depth, indent);
                        html_flush();
                    } finally {
                        $hb_previous_term_id$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
            } else {
                html_br();
                html_br();
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($$$No_inferior_terms);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
        }
        clear_hb_duplicates_table();
        return NIL;
    }

    public static SubLObject hb_print_nodes_1(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!$hb_indent_quantum$.getDynamicValue(thread).isInteger()) || (!$hb_indent_quantum$.getDynamicValue(thread).numGE(ZERO_INTEGER))) {
            $hb_indent_quantum$.setDynamicValue(TWO_INTEGER, thread);
        }
        hb_compute_allowable_depth(fort);
        SubLObject index = ONE_INTEGER;
        hb_construct_superior_paths(fort);
        hb_display_superiors();
        index = add($hb_indent$.getDynamicValue(thread), ONE_INTEGER);
        hb_display_term(fort, index);
        index = add(index, ONE_INTEGER);
        hb_display_inferiors(fort, $hb_computed_max_depth$.getDynamicValue(thread), index);
        if ($hb_counter$.getDynamicValue(thread).numG($hb_reset_parameter_notice_threshhold$.getDynamicValue(thread))) {
            html_br();
            html_br();
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_hash, UNPROVIDED);
            html_markup($$$top);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($$$Go_to_Top);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        $hb_counter$.setDynamicValue(ZERO_INTEGER, thread);
        return NIL;
    }

    public static SubLObject hb_compute_allowable_depth(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $hb_computed_max_depth$.setDynamicValue(ZERO_INTEGER, thread);
        if ($hb_max_depth$.getDynamicValue(thread).equal(ONE_INTEGER)) {
            $hb_computed_max_depth$.setDynamicValue(ONE_INTEGER, thread);
        } else
            if ((NIL == $hb_max_depth$.getDynamicValue(thread)) && ((!$hb_max_inferiors$.getDynamicValue(thread).isInteger()) || (!$hb_max_inferiors$.getDynamicValue(thread).numGE(ZERO_INTEGER)))) {
                $hb_computed_max_depth$.setDynamicValue(NIL, thread);
            } else
                if (NIL == $hb_max_depth$.getDynamicValue(thread)) {
                    $hb_computed_max_depth$.setDynamicValue($hb_max_depth$.getDynamicValue(thread), thread);
                } else {
                    $hb_counter$.setDynamicValue(ZERO_INTEGER, thread);
                    SubLObject level = ZERO_INTEGER;
                    SubLObject last_count = ZERO_INTEGER;
                    SubLObject nodes = list(fort);
                    SubLObject temp = NIL;
                    while (((NIL != nodes) && (((!$hb_max_inferiors$.getDynamicValue(thread).isInteger()) || (!$hb_counter$.getDynamicValue(thread).numG($hb_max_inferiors$.getDynamicValue(thread)))) || (!level.numG(ONE_INTEGER)))) && ((!$hb_max_depth$.getDynamicValue(thread).isInteger()) || (!level.numG($hb_max_depth$.getDynamicValue(thread))))) {
                        SubLObject doneP = NIL;
                        if (NIL == doneP) {
                            SubLObject csome_list_var = nodes;
                            SubLObject node = NIL;
                            node = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject new_nodes = hb_get_nodes(node, UNPROVIDED);
                                temp = append(temp, new_nodes);
                                last_count = $hb_counter$.getDynamicValue(thread);
                                $hb_counter$.setDynamicValue(add($hb_counter$.getDynamicValue(thread), length(new_nodes)), thread);
                                if ($hb_max_inferiors$.getDynamicValue(thread).isInteger() && $hb_counter$.getDynamicValue(thread).numG($hb_max_inferiors$.getDynamicValue(thread))) {
                                    doneP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                node = csome_list_var.first();
                            } 
                        }
                        nodes = temp;
                        temp = NIL;
                        level = add(level, ONE_INTEGER);
                        if (NIL != $hb_debug$.getDynamicValue(thread)) {
                            format(T, $str252$____);
                            format(T, $str253$____Level_finished___s, level);
                            format(T, $str254$__);
                            format(T, $str255$_______Total_count___s, $hb_counter$.getDynamicValue(thread));
                        }
                    } 
                    $hb_counter$.setDynamicValue(last_count, thread);
                    $hb_computed_max_depth$.setDynamicValue(subtract(level, ONE_INTEGER), thread);
                    if (NIL != $hb_debug$.getDynamicValue(thread)) {
                        format(T, $str252$____);
                        format(T, $str256$Computed_max_depth___s, $hb_computed_max_depth$.getDynamicValue(thread));
                    }
                }


        $hb_counter$.setDynamicValue(ZERO_INTEGER, thread);
        return NIL;
    }

    public static SubLObject hb_start(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        hb_init();
        hb_parameters(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_hierarchy_browser(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Hier;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str260$hb_start);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_hier_default(final SubLObject args) {
        SubLObject fort_spec = NIL;
        destructuring_bind_must_consp(args, args, $list265);
        fort_spec = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            SubLObject fort = NIL;
            fort = cb_guess_fort(fort_spec, UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                return cb_error($str266$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cb_hier_default_internal(fort);
        } else {
            cdestructuring_bind_error(args, $list265);
        }
        return NIL;
    }

    public static SubLObject cb_hier_default_internal(final SubLObject fort) {
        hb_set_defaults_for_type(fort);
        return hb_print_nodes(UNPROVIDED);
    }

    public static SubLObject cb_hier(final SubLObject args) {
        SubLObject fort_spec = NIL;
        SubLObject arg_string = NIL;
        SubLObject pred_spec = NIL;
        destructuring_bind_must_consp(args, args, $list268);
        fort_spec = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list268);
        arg_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list268);
        pred_spec = current.first();
        current = current.rest();
        final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list268);
        current = current.rest();
        if (NIL == current) {
            SubLObject fort = NIL;
            SubLObject arg = NIL;
            SubLObject predicate = NIL;
            SubLObject mt = NIL;
            fort = cb_guess_fort(fort_spec, UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                return cb_error($str266$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            arg = read_from_string_ignoring_errors(arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (!arg.isFixnum()) {
                return cb_error($str269$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            predicate = cb_guess_fort(pred_spec, UNPROVIDED);
            if (NIL == forts.fort_p(predicate)) {
                return cb_error($str266$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != mt_spec) {
                mt = cb_guess_term(mt_spec, UNPROVIDED);
                if (NIL == hlmt.hlmt_p(mt)) {
                    return cb_error($str266$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            cb_hier_internal(fort, arg, predicate, mt);
        } else {
            cdestructuring_bind_error(args, $list268);
        }
        return NIL;
    }

    public static SubLObject cb_hier_internal(final SubLObject fort, final SubLObject arg, final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_form = find(predicate, $hb_type_default_forms$.getDynamicValue(thread), symbol_function(EQL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED);
        $hb_pivot_term$.setDynamicValue(fort, thread);
        $hb_predicate$.setDynamicValue(predicate, thread);
        $hb_mt$.setDynamicValue(NIL != mt ? mt : $ALL, thread);
        if ($hb_mt$.getDynamicValue(thread) != $ALL) {
            $hb_use_genl_mts$.setDynamicValue(T, thread);
        }
        $hb_index_argument$.setDynamicValue(NIL != default_form ? third(default_form) : arg, thread);
        $hb_gather_argument$.setDynamicValue($hb_index_argument$.getDynamicValue(thread).numE(ONE_INTEGER) ? TWO_INTEGER : ONE_INTEGER, thread);
        $hb_max_height$.setDynamicValue(TWO_INTEGER, thread);
        $hb_max_depth$.setDynamicValue(TWO_INTEGER, thread);
        return hb_print_nodes(UNPROVIDED);
    }

    public static SubLObject declare_hierarchy_browser_file() {
        declareFunction(me, "hb_default_method_info", "HB-DEFAULT-METHOD-INFO", 1, 0, false);
        declareFunction(me, "hb_default_method_availableP", "HB-DEFAULT-METHOD-AVAILABLE?", 1, 0, false);
        declareFunction(me, "set_default_hb_icon", "SET-DEFAULT-HB-ICON", 0, 0, false);
        declareFunction(me, "hb_debug", "HB-DEBUG", 0, 0, false);
        declareFunction(me, "hb_no_debug", "HB-NO-DEBUG", 0, 0, false);
        declareFunction(me, "hb_message", "HB-MESSAGE", 0, 3, false);
        declareFunction(me, "hb_show_parameters", "HB-SHOW-PARAMETERS", 0, 1, false);
        declareFunction(me, "hb_show_colors_and_symbols", "HB-SHOW-COLORS-AND-SYMBOLS", 0, 1, false);
        declareFunction(me, "sorted_gaf_mts", "SORTED-GAF-MTS", 1, 2, false);
        declareFunction(me, "hb_parameters", "HB-PARAMETERS", 0, 1, false);
        declareFunction(me, "hb_colors_and_symbols", "HB-COLORS-AND-SYMBOLS", 0, 1, false);
        declareFunction(me, "hb_binary_predicateP", "HB-BINARY-PREDICATE?", 1, 0, false);
        declareFunction(me, "hb_handle_parameters", "HB-HANDLE-PARAMETERS", 1, 0, false);
        declareFunction(me, "hb_handle_colors_and_symbols", "HB-HANDLE-COLORS-AND-SYMBOLS", 1, 0, false);
        declareFunction(me, "hb_set_defaults_for_type", "HB-SET-DEFAULTS-FOR-TYPE", 1, 0, false);
        declareFunction(me, "hb_simple_choose_constants", "HB-SIMPLE-CHOOSE-CONSTANTS", 1, 0, false);
        declareFunction(me, "hb_handle_simple_choose_constants", "HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS", 0, 1, false);
        declareFunction(me, "hb_choose_constants", "HB-CHOOSE-CONSTANTS", 1, 0, false);
        declareFunction(me, "hb_complex_choose_constants", "HB-COMPLEX-CHOOSE-CONSTANTS", 1, 0, false);
        declareFunction(me, "hb_handle_complex_choose_constants", "HB-HANDLE-COMPLEX-CHOOSE-CONSTANTS", 0, 1, false);
        declareFunction(me, "hb_select_node", "HB-SELECT-NODE", 0, 1, false);
        declareFunction(me, "set_hb_eval_form", "SET-HB-EVAL-FORM", 0, 0, false);
        declareFunction(me, "hb_alternate_predicate", "HB-ALTERNATE-PREDICATE", 1, 0, false);
        declareFunction(me, "set_hb_alternate_predicate", "SET-HB-ALTERNATE-PREDICATE", 0, 0, false);
        declareFunction(me, "hb_get_nodes", "HB-GET-NODES", 1, 1, false);
        declareFunction(me, "hb_comments", "HB-COMMENTS", 1, 0, false);
        declareFunction(me, "hb_maybe_print_comments", "HB-MAYBE-PRINT-COMMENTS", 1, 0, false);
        declareFunction(me, "hb_string_for_constant", "HB-STRING-FOR-CONSTANT", 1, 0, false);
        declareFunction(me, "hb_print_constant", "HB-PRINT-CONSTANT", 1, 1, false);
        declareFunction(me, "hb_accessor", "HB-ACCESSOR", 2, 1, false);
        declareFunction(me, "hb_status_heading", "HB-STATUS-HEADING", 0, 1, false);
        declareFunction(me, "clear_hb_table", "CLEAR-HB-TABLE", 0, 0, false);
        declareFunction(me, "clear_hb_duplicates_table", "CLEAR-HB-DUPLICATES-TABLE", 0, 0, false);
        declareFunction(me, "clear_hb_superior_table", "CLEAR-HB-SUPERIOR-TABLE", 0, 0, false);
        declareFunction(me, "hb_init", "HB-INIT", 0, 0, false);
        declareFunction(me, "hb_bar", "HB-BAR", 0, 1, false);
        declareFunction(me, "hb_print_nodes", "HB-PRINT-NODES", 0, 1, false);
        declareFunction(me, "hb_construct_superior_paths", "HB-CONSTRUCT-SUPERIOR-PATHS", 1, 0, false);
        declareFunction(me, "hb_superior_table_count", "HB-SUPERIOR-TABLE-COUNT", 0, 0, false);
        declareFunction(me, "hb_construct_superior_paths_int", "HB-CONSTRUCT-SUPERIOR-PATHS-INT", 3, 0, false);
        declareFunction(me, "hb_print_mt_list", "HB-PRINT-MT-LIST", 2, 1, false);
        declareFunction(me, "hb_print_pivot_mts", "HB-PRINT-PIVOT-MTS", 3, 1, false);
        declareFunction(me, "hb_display_superiors", "HB-DISPLAY-SUPERIORS", 0, 0, false);
        declareFunction(me, "reset_hb_indent", "RESET-HB-INDENT", 1, 0, false);
        declareFunction(me, "hb_trace_superior_paths", "HB-TRACE-SUPERIOR-PATHS", 6, 0, false);
        declareFunction(me, "hb_display_term", "HB-DISPLAY-TERM", 2, 0, false);
        declareFunction(me, "hb_print_nodes_2", "HB-PRINT-NODES-2", 3, 0, false);
        declareFunction(me, "hb_display_inferiors", "HB-DISPLAY-INFERIORS", 3, 0, false);
        declareFunction(me, "hb_print_nodes_1", "HB-PRINT-NODES-1", 1, 0, false);
        declareFunction(me, "hb_compute_allowable_depth", "HB-COMPUTE-ALLOWABLE-DEPTH", 1, 0, false);
        declareFunction(me, "hb_start", "HB-START", 0, 1, false);
        declareFunction(me, "cb_link_hierarchy_browser", "CB-LINK-HIERARCHY-BROWSER", 0, 1, false);
        declareFunction(me, "cb_hier_default", "CB-HIER-DEFAULT", 1, 0, false);
        declareFunction(me, "cb_hier_default_internal", "CB-HIER-DEFAULT-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_hier", "CB-HIER", 1, 0, false);
        declareFunction(me, "cb_hier_internal", "CB-HIER-INTERNAL", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_hierarchy_browser_file() {
        defparameter("*HB-TYPE-DEFAULT-FORMS*", $list0);
        defparameter("*HB-ALTERNATE-PREDICATES*", $list1);
        defparameter("*HB-ICON-CHOICES*", $list9);
        defparameter("*HB-BAR-CHOICE*", $CELTIC_BAR);
        defparameter("*HB-PREVIOUS-TERM-ID*", NIL);
        defparameter("*HB-ICON*", NIL);
        defparameter("*HB-BAR*", NIL);
        defparameter("*HB-TOP-SIGN*", $str14$___);
        defparameter("*HB-BOTTOM-SIGN*", $str16$___);
        defparameter("*HB-MORE-SUPERIORS-SIGN*", $str18$____);
        defparameter("*HB-MORE-INFERIORS-SIGN*", $str20$____);
        defparameter("*HB-CYCLE-SIGN*", $str22$__see_above_);
        defparameter("*HB-LARGE-FONT-SIZE*", FIVE_INTEGER);
        defparameter("*HB-SMALL-FONT-SIZE*", TWO_INTEGER);
        defparameter("*HB-TINY-FONT-SIZE*", ONE_INTEGER);
        defparameter("*HB-PIVOT-TERM*", NIL);
        defparameter("*HB-TABLE*", NIL);
        defparameter("*HB-SUPERIOR-TABLE*", NIL);
        defparameter("*HB-DUPLICATES-TABLE*", NIL);
        defparameter("*HB-INDENT-QUANTUM*", THREE_INTEGER);
        defparameter("*HB-INDENT*", ZERO_INTEGER);
        defparameter("*HB-COUNTER*", ZERO_INTEGER);
        defparameter("*HB-RESET-PARAMETER-NOTICE-THRESHHOLD*", TEN_INTEGER);
        defparameter("*HB-USE-DEFAULTS-FOR-TYPE*", NIL);
        defparameter("*HB-ALTERNATE-PREDICATE*", NIL);
        defparameter("*HB-USE-LEXICON*", NIL);
        defparameter("*HB-COMPUTED-MAX-DEPTH*", ZERO_INTEGER);
        defparameter("*HB-MAX-DEPTH*", FOUR_INTEGER);
        defparameter("*HB-MAX-HEIGHT*", FOUR_INTEGER);
        defparameter("*HB-MAX-INFERIORS*", $int$200);
        defparameter("*HB-SHOW-COMMENTS*", NIL);
        defparameter("*HB-SHOW-MTS*", T);
        defparameter("*HB-MT*", $ALL);
        defparameter("*HB-PREDICATE*", NIL);
        defparameter("*HB-INDEX-ARGUMENT*", TWO_INTEGER);
        defparameter("*HB-GATHER-ARGUMENT*", ONE_INTEGER);
        defparameter("*HB-USE-GENL-MTS*", NIL);
        defparameter("*HB-BACKGROUND-COLOR*", $LIGHT_GRAY);
        defparameter("*HB-MESSAGE-COLOR*", $RED);
        defparameter("*HB-MESSAGE*", NIL);
        defparameter("*HB-EVAL-FORM*", NIL);
        defparameter("*HB-INVERSE-EVAL-FORM*", NIL);
        defparameter("*HB-DEBUG*", NIL);
        return NIL;
    }

    public static SubLObject setup_hierarchy_browser_file() {
        sethash($YELLOW_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str3$star_gif, $str4$_));
        sethash($GREEN_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str6$grnstar_gif, $str4$_));
        sethash($CYAN_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str8$cyanstar_gif, $str4$_));
        sethash($CELTIC_BAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str11$celtic_bar_gif, NIL));
        register_html_state_variable($hb_icon$);
        register_html_interface_variable($hb_icon$);
        register_html_state_variable($hb_bar$);
        register_html_interface_variable($hb_bar$);
        register_html_state_variable($hb_top_sign$);
        register_html_interface_variable($hb_top_sign$);
        register_html_state_variable($hb_bottom_sign$);
        register_html_interface_variable($hb_bottom_sign$);
        register_html_state_variable($hb_more_superiors_sign$);
        register_html_interface_variable($hb_more_superiors_sign$);
        register_html_state_variable($hb_more_inferiors_sign$);
        register_html_interface_variable($hb_more_inferiors_sign$);
        register_html_state_variable($hb_cycle_sign$);
        register_html_interface_variable($hb_cycle_sign$);
        register_html_state_variable($hb_large_font_size$);
        register_html_state_variable($hb_small_font_size$);
        register_html_state_variable($hb_tiny_font_size$);
        register_html_state_variable($hb_pivot_term$);
        register_html_state_variable($hb_table$);
        register_html_state_variable($hb_superior_table$);
        register_html_state_variable($hb_duplicates_table$);
        register_html_state_variable($hb_indent_quantum$);
        register_html_interface_variable($hb_indent_quantum$);
        register_html_state_variable($hb_indent$);
        register_html_state_variable($hb_counter$);
        register_html_state_variable($hb_reset_parameter_notice_threshhold$);
        register_html_state_variable($hb_use_defaults_for_type$);
        register_html_state_variable($hb_alternate_predicate$);
        register_html_state_variable($hb_use_lexicon$);
        register_html_interface_variable($hb_use_lexicon$);
        register_html_state_variable($hb_computed_max_depth$);
        register_html_state_variable($hb_max_depth$);
        register_html_interface_variable($hb_max_depth$);
        register_html_state_variable($hb_max_height$);
        register_html_interface_variable($hb_max_height$);
        register_html_state_variable($hb_max_inferiors$);
        register_html_interface_variable($hb_max_inferiors$);
        register_html_state_variable($hb_show_comments$);
        register_html_interface_variable($hb_show_comments$);
        register_html_state_variable($hb_show_mts$);
        register_html_interface_variable($hb_show_mts$);
        register_html_state_variable($hb_mt$);
        register_html_interface_variable($hb_mt$);
        register_html_state_variable($hb_predicate$);
        register_html_state_variable($hb_index_argument$);
        register_html_interface_variable($hb_index_argument$);
        register_html_state_variable($hb_gather_argument$);
        register_html_state_variable($hb_use_genl_mts$);
        register_html_interface_variable($hb_use_genl_mts$);
        register_html_state_variable($hb_background_color$);
        register_html_interface_variable($hb_background_color$);
        register_html_state_variable($hb_message_color$);
        register_html_interface_variable($hb_message_color$);
        register_html_state_variable($hb_message$);
        register_html_state_variable($hb_eval_form$);
        register_html_state_variable($hb_inverse_eval_form$);
        sethash($HB_PARAMETERS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str137$hb_parameters_html, NIL));
        html_macros.note_cgi_handler_function(HB_PARAMETERS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HB_COLORS_AND_SYMBOLS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HB_HANDLE_PARAMETERS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HB_HANDLE_COLORS_AND_SYMBOLS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HB_HANDLE_COMPLEX_CHOOSE_CONSTANTS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HB_SELECT_NODE, $HTML_HANDLER);
        sethash($HB_PRINT_NODES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str232$hb_print_nodes_html, NIL));
        html_macros.note_cgi_handler_function(HB_PRINT_NODES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HB_START, $HTML_HANDLER);
        setup_cb_link_method($HIERARCHY_BROWSER, CB_LINK_HIERARCHY_BROWSER, ONE_INTEGER);
        declare_cb_tool($HIERARCHY_BROWSER, $$$Hierarchy_Browser, $$$Hier, $$$The_Hierarchy_Browser);
        html_macros.note_cgi_handler_function(CB_HIER_DEFAULT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HIER, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_hierarchy_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_hierarchy_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hierarchy_browser_file();
    }

    
}

/**
 * Total time: 3993 ms
 */
