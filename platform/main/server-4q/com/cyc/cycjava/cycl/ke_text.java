/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KE-TEXT
 * source file: /cyc/top/cycl/ke-text.lisp
 * created:     2019/07/03 17:37:49
 */
public final class ke_text extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt130$ = makeString("");

    public static final SubLFile me = new ke_text();

 public static final String myName = "com.cyc.cycjava.cycl.ke_text";


    // defparameter
    @LispMethod(comment = "If too many errors pile up, abort instead of possibly crashing.\ndefparameter")
    private static final SubLSymbol $ke_text_error_count_abort_num$ = makeSymbol("*KE-TEXT-ERROR-COUNT-ABORT-NUM*");

    // defparameter
    /**
     * An assoc array mapping strings to the directive they represent. Note that the
     * strings get canonicalized in @xref ket-lookup-string (i.e. 'In MT' -> 'in
     * mt')
     */
    @LispMethod(comment = "An assoc array mapping strings to the directive they represent. Note that the\r\nstrings get canonicalized in @xref ket-lookup-string (i.e. \'In MT\' -> \'in\r\nmt\')\ndefparameter\nAn assoc array mapping strings to the directive they represent. Note that the\nstrings get canonicalized in @xref ket-lookup-string (i.e. \'In MT\' -> \'in\nmt\')")
    private static final SubLSymbol $ket_string_to_directive$ = makeSymbol("*KET-STRING-TO-DIRECTIVE*");

    // defparameter
    // An assoc array mapping strings to the direction they represent.
    /**
     * An assoc array mapping strings to the direction they represent.
     */
    @LispMethod(comment = "An assoc array mapping strings to the direction they represent.\ndefparameter")
    private static final SubLSymbol $ket_string_to_direction$ = makeSymbol("*KET-STRING-TO-DIRECTION*");

    // defparameter
    // An assoc array mapping strings to the strength they represent.
    /**
     * An assoc array mapping strings to the strength they represent.
     */
    @LispMethod(comment = "An assoc array mapping strings to the strength they represent.\ndefparameter")
    private static final SubLSymbol $ket_string_to_strength$ = makeSymbol("*KET-STRING-TO-STRENGTH*");

    private static final SubLList $list0 = list(makeSymbol("FILENAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");

    public static final SubLSymbol $ke_text_failures_log_file$ = makeSymbol("*KE-TEXT-FAILURES-LOG-FILE*");

    private static final SubLString $str7$Unable_to_log_failures_to__S_beca = makeString("Unable to log failures to ~S because file is not writeable.  Continuing without logging.");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $END_OF_DIRECTIVE = makeKeyword("END-OF-DIRECTIVE");

    static private final SubLList $list9 = list(makeString("Aborting: Too many errors found"));

    private static final SubLString $str10$Too_many_close_parenthesis_on_lin = makeString("Too many close parenthesis on line ~A");

    private static final SubLSymbol $END_OF_DATA = makeKeyword("END-OF-DATA");

    private static final SubLList $list12 = list(makeString("Missing directive"));

    private static final SubLString $str13$Missing_data_for_directive__A = makeString("Missing data for directive ~A");

    private static final SubLString $str14$Unclosed_open_parenthesis_on_line = makeString("Unclosed open parenthesis on line ~A");

    private static final SubLString $str15$Unfinished_expression_at_end_of_f = makeString("Unfinished expression at end of file");

    private static final SubLList $list16 = list(new SubLObject[]{ cons(makeString("constant"), makeKeyword("CONSTANT")), cons(makeString("collection"), makeKeyword("CONSTANT")), cons(makeString("individual"), makeKeyword("CONSTANT")), cons(makeString("function"), makeKeyword("CONSTANT")), cons(makeString("microtheory"), makeKeyword("CONSTANT")), cons(makeString("unit"), makeKeyword("CONSTANT")), cons(makeString("formula"), makeKeyword("FORMULA")), cons(makeString("f"), makeKeyword("FORMULA")), cons(makeString("el"), makeKeyword("FORMULA")), cons(makeString("enter"), makeKeyword("ENTER")), cons(makeString("delete"), makeKeyword("DELETE")), cons(makeString("assert"), makeKeyword("ENTER")), cons(makeString("unassert"), makeKeyword("DELETE")), cons(makeString("in mt"), makeKeyword("IN-MT")), cons(makeString("mt"), makeKeyword("IN-MT")), cons(makeString("default mt"), makeKeyword("DEFAULT-MT")), cons(makeString("direction"), makeKeyword("DIRECTION")), cons(makeString("d"), makeKeyword("DIRECTION")), cons(makeString("al"), makeKeyword("DIRECTION")), cons(makeString("access level"), makeKeyword("DIRECTION")), cons(makeString("strength"), makeKeyword("STRENGTH")), cons(makeString("truth value"), makeKeyword("STRENGTH")), cons(makeString("tv"), makeKeyword("STRENGTH")), cons(makeString("kill"), $KILL), cons(makeString("rename"), makeKeyword("RENAME")), cons(makeString("merge"), makeKeyword("MERGE")) });

    private static final SubLList $list17 = list(cons(makeString("forward"), makeKeyword("FORWARD")), cons(makeString("0"), makeKeyword("FORWARD")), cons(makeString("backward"), makeKeyword("BACKWARD")), cons(makeString("4"), makeKeyword("BACKWARD")), cons(makeString("code"), $CODE), cons(makeString("unknown"), makeKeyword("UNKNOWN")));

    private static final SubLList $list18 = list(cons(makeString("default"), makeKeyword("DEFAULT")), cons(makeString("monotonic"), makeKeyword("MONOTONIC")), cons(makeString("unknown"), makeKeyword("UNKNOWN")));



    private static final SubLString $$$Something_is_nil = makeString("Something is nil");

    private static final SubLString $str26$Bad_reference_to_a_killed_or_rena = makeString("Bad reference to a killed or renamed constant (~A)");

    private static final SubLString $str27$A_single_colon_is_an_invalid_keyw = makeString("A single colon is an invalid keyword name");

    private static final SubLString $str28$A_single_question_mark_is_an_inva = makeString("A single question mark is an invalid variable name");

    private static final SubLList $list29 = list(CHAR_quotation);

    private static final SubLString $$$Malformed_string = makeString("Malformed string");

    private static final SubLString $$$Gratutuious_single_quote = makeString("Gratutuious single quote");

    private static final SubLSymbol $DOT_FOR_DOTTED_LIST = makeKeyword("DOT-FOR-DOTTED-LIST");

    private static final SubLString $str33$Bad_number___A_ = makeString("Bad number (~A)");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $str36$Constant_not_found___A_ = makeString("Constant not found (~A)");

    private static final SubLString $str37$Couldn_t_figure_out_string___A___ = makeString("Couldn't figure out string (~A) (did you forget a period?)");

    private static final SubLString $str38$Couldn_t_figure_out___A_ = makeString("Couldn't figure out (~A)");

    private static final SubLString $$$TheAssertionSentence = makeString("TheAssertionSentence");

    private static final SubLString $str41$__TheAssertionSentence = makeString("#$TheAssertionSentence");

    private static final SubLString $str42$Formula____TheAssertionSentence_i = makeString("Formula: #$TheAssertionSentence is not yet set");

    private static final SubLString $$$Microtheory_not_specified = makeString("Microtheory not specified");

    private static final SubLString $$$Invalid_dotted_list = makeString("Invalid dotted list");

    static private final SubLList $list48 = list(makeString("Unknown directive"));

    static private final SubLList $list50 = list(makeString("Formula: No formula specified"));

    static private final SubLList $list51 = list(makeString("Formula: Formula specified must be a list"));

    private static final SubLList $list53 = list(makeString("Constant: No constant specified"));

    private static final SubLList $list54 = list(makeString("Constant: Only one constant may be specified"));

    static private final SubLList $list55 = list(makeString("Constant: Invalid constant name"));

    private static final SubLString $str56$Constant__Constant_already_exists = makeString("Constant: Constant already exists with different case: ~A");

    private static final SubLString $str58$Constant__Unrecognized_constant__ = makeString("Constant: Unrecognized constant (~A)");

    static private final SubLList $list60 = list(makeString("Kill: No constant specified"));

    static private final SubLList $list61 = list(makeString("Kill: Only one constant may be specified"));

    static private final SubLList $list62 = list(makeString("Kill: Can't kill a NART."));

    private static final SubLList $list63 = list(makeString("Kill: Constant name must be a string."));

    private static final SubLList $list64 = list(makeString("Kill: Constant already killed."));

    private static final SubLList $list66 = list(makeString("Rename: Nothing to rename"));

    private static final SubLList $list67 = list(makeString("Rename: Old constant name not specified"));

    static private final SubLList $list68 = list(makeString("Rename: Can't rename NATs"));

    static private final SubLList $list69 = list(makeString("Rename: Old constant name must be a string"));

    private static final SubLString $str70$Rename__Can_t_rename_a_constant_r = makeString("Rename: Can't rename a constant recently killed or renamed (~A)");

    static private final SubLList $list71 = list(makeString("Rename: New constant name must be a string"));

    static private final SubLList $list72 = list(makeString("Rename: New constant name must be a string inside double quotes."));

    static private final SubLList $list73 = list(makeString("Rename: New constant name is not a valid name for a constant."));

    private static final SubLString $str74$Rename__Can_t_rename_to_constant_ = makeString("Rename: Can't rename to constant recently created (~A)");

    private static final SubLString $str75$Rename__Can_t_rename_to_existing_ = makeString("Rename: Can't rename to existing constant in KB (~A)");

    private static final SubLString $str77$Rename__Unrecognized_constant___A = makeString("Rename: Unrecognized constant (~A)");

    private static final SubLList $list79 = list(makeString("Merge: Nothing to merge"));

    static private final SubLList $list80 = list(makeString("Merge: No kill term given"));

    private static final SubLList $list81 = list(makeString("Merge: Can't merge from killed term"));

    private static final SubLList $list82 = list(makeString("Merge: Kill term must be a FORT"));

    private static final SubLList $list83 = list(makeString("Merge: No keep term given"));

    static private final SubLList $list84 = list(makeString("Merge: Can't merge onto killed term"));

    private static final SubLList $list85 = list(makeString("Merge: Keep term must be a FORT"));

    static private final SubLList $list87 = list(makeString("In Mt: No mt specified"));

    private static final SubLString $str88$In_Mt__NAT_mt_must_be_a_hlmt_p___ = makeString("In Mt: NAT mt must be a hlmt-p (~A)");

    private static final SubLString $str89$In_Mt__Unrecognized_mt___A_ = makeString("In Mt: Unrecognized mt (~A)");

    private static final SubLList $list91 = list(makeString("Default-Mt: No mt specified"));

    private static final SubLString $str92$Default_Mt__NAT_mt_must_be_a_hlmt = makeString("Default Mt: NAT mt must be a hlmt-p (~A)");

    private static final SubLString $str93$Default_Mt__Unrecognized_mt___A_ = makeString("Default Mt: Unrecognized mt (~A)");

    static private final SubLList $list95 = list(makeString("Strength: No strength specified"));

    private static final SubLString $str96$Strength__Unrecognized_strength__ = makeString("Strength: Unrecognized strength (~A)");

    private static final SubLList $list98 = list(makeString("Direction: No direction specified"));

    private static final SubLString $str99$Direction__Unrecognized_direction = makeString("Direction: Unrecognized direction (~A)");

    private static final SubLSymbol $sym100$STRING_ = makeSymbol("STRING=");

    private static final SubLList $list101 = list(makeString("Unrecognized predicate"));

    private static final SubLList $list102 = list(makeString("NAT predicates unsupported"));



    private static final SubLString $$$Constant_must_be_specified = makeString("Constant must be specified");

    private static final SubLString $str106$Unexpected_argument_to_unary_pred = makeString("Unexpected argument to unary predicate (~A)");

    private static final SubLString $str107$No_argument_found_for_binary_pred = makeString("No argument found for binary predicate (~A)");

    private static final SubLString $str108$No_argument_found_for_arity__A_pr = makeString("No argument found for arity ~A predicate (~A)");

    private static final SubLString $str109$List_argument_expected_for_arity_ = makeString("List argument expected for arity ~A predicate (~A)");

    private static final SubLString $str110$Unexpected_argument_for_predicate = makeString("Unexpected argument for predicate (~A)");

    private static final SubLSymbol FI_CREATE = makeSymbol("FI-CREATE");

    private static final SubLSymbol FI_TIMESTAMP_CONSTANT = makeSymbol("FI-TIMESTAMP-CONSTANT");

    private static final SubLSymbol RESOLVE_NEW_CONSTANTS = makeSymbol("RESOLVE-NEW-CONSTANTS");

    private static final SubLSymbol FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");

    private static final SubLSymbol FI_RENAME = makeSymbol("FI-RENAME");





    private static final SubLList $list125 = list(list(QUOTE, reader_make_constant_shell("BookkeepingMt")));

    private static final SubLSymbol FI_KILL = makeSymbol("FI-KILL");

    private static final SubLSymbol FI_MERGE = makeSymbol("FI-MERGE");

    private static final SubLString $str128$Constant_does_not_exist___A_ = makeString("Constant does not exist (~A)");

    private static final SubLString $str129$_new_constant_must_be_followed_by = makeString(":new-constant must be followed by a string or constant");

    private static final SubLList $list130 = list(ZERO_INTEGER, ZERO_INTEGER, makeString("Filename is not a string"));

    private static final SubLList $list131 = list(ZERO_INTEGER, ZERO_INTEGER, makeString("Filename is null string"));

    private static final SubLString $str133$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLList $list136 = list(NIL);

    private static final SubLString $str137$ = makeString("");

    private static final SubLString $str138$_A__ = makeString("~A: ");

    private static final SubLString $str139$_A__A__ = makeString("~A-~A: ");

    private static final SubLString $str140$_A___ = makeString("~A-: ");

    private static final SubLString $str141$__A__ = makeString("-~A: ");

    private static final SubLString $str142$___ = makeString("?: ");

    private static final SubLString $str143$_A = makeString("~A");

    private static final SubLString $str144$el_ = makeString("el:");

    private static final SubLString $str145$____ = makeString(" .~%");

    private static final SubLString $str148$__Sorry___s_is_not_known_to_be_a_ = makeString("~%Sorry, ~s is not known to be a Cyclist.");

    private static final SubLString $str149$_A__ = makeString("~A~%");

    private static final SubLString $$$merged = makeString("merged");

    private static final SubLString $$$renamed = makeString("renamed");

    private static final SubLString $$$killed = makeString("killed");

    private static final SubLString $$$created = makeString("created");

    private static final SubLList $list154 = list(makeString(" or "));

    private static final SubLList $list155 = list(makeString(", "), makeString(", or "));

    private static final SubLList $list156 = list(makeString(", "), makeString(", "), makeString(" or "));

    private static final SubLString $$$The_following_constants_will_be_ = makeString("The following constants will be ");

    private static final SubLString $str159$_ = makeString(":");

    private static final SubLString $str160$__ = makeString("~%");

    private static final SubLString $str161$__Create___A__ = makeString("  Create: ~A~%");

    private static final SubLString $str162$__Kill___A__ = makeString("  Kill: ~A~%");

    private static final SubLString $str163$__Rename___A_to__A__ = makeString("  Rename: ~A to ~A~%");

    private static final SubLString $str164$Evaluating__A_forms_____ = makeString("Evaluating ~A forms...~%");

    private static final SubLSymbol LOAD_KE_TEXT_FILE = makeSymbol("LOAD-KE-TEXT-FILE");

    private static final SubLList $list167 = list(makeSymbol("CYCLIST"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("METHOD"), makeKeyword("AGENDA")), list(makeSymbol("NO-USER-INTERACTION?"), T), list(makeSymbol("VERBOSITY"), makeKeyword("NORMAL")));

    private static final SubLString $str168$Call_the_ke_text_engine_on_a_file = makeString("Call the ke text engine on a file from the lisp interactor.\n@param CYCLIST (string or constant) \n@param FILENAME string\n@param METHOD keyword ;; can be :agenda or :now.\n@param NO-USER-INTERACTION? boolean ;; this parameter is ignored\n@param VERBOSITY keyword-p; either :normal or :quiet.  If :quiet, will only show errors.\n");

    private static final SubLList $list169 = list(list(makeSymbol("FILENAME"), makeSymbol("STRINGP")));

    private static final SubLList $list170 = list(makeKeyword("KE-OPERATIONS"), makeKeyword("ERROR-LISTS"));

    private static final SubLList $list173 = list(makeKeyword("KE-OPERATIONS"), makeKeyword("ERROR-LISTS"), makeKeyword("ERRORS"));

    public static SubLObject with_ke_text_failures_to_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        filename = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PIF, list(FILE_VALID_FOR_WRITING_P, filename), listS(CLET, list(list($ke_text_failures_log_file$, filename)), append(body, NIL)), listS(PROGN, list(WARN, $str7$Unable_to_log_failures_to__S_beca, filename), append(body, NIL)));
    }

    /**
     * Do first pass parsing of some KE-Text.  Returns a list of lists looking like (FILENAME LINE-NUMBER-START LINE-NUMBER-END DIRECTIVE DATA).  These will be further parsed in the second pass.  Basic syntax errors such as missing characters (periods, matching parens, matching quotes,.) are found here.
     *
     * @return 0 list ;; a list of token lists
     * @return 1 list ;; a list of error lists
     * @param KE-TEXT-LIST
     * 		list ;; a list of string to parse
     * @param FILENAME
     * 		string ;; the file these string are from (or 'ke-text compose')
     */
    @LispMethod(comment = "Do first pass parsing of some KE-Text.  Returns a list of lists looking like (FILENAME LINE-NUMBER-START LINE-NUMBER-END DIRECTIVE DATA).  These will be further parsed in the second pass.  Basic syntax errors such as missing characters (periods, matching parens, matching quotes,.) are found here.\r\n\r\n@return 0 list ;; a list of token lists\r\n@return 1 list ;; a list of error lists\r\n@param KE-TEXT-LIST\r\n\t\tlist ;; a list of string to parse\r\n@param FILENAME\r\n\t\tstring ;; the file these string are from (or \'ke-text compose\')")
    public static final SubLObject ke_text_list_to_token_lists_alt(SubLObject ke_text_list, SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject token_lists = NIL;
                SubLObject error_lists = NIL;
                SubLObject line_number_start = ONE_INTEGER;
                SubLObject line_number_end = ZERO_INTEGER;
                SubLObject char_list = NIL;
                SubLObject the_directive = NIL;
                SubLObject the_data = NIL;
                SubLObject looking_for = $END_OF_DIRECTIVE;
                SubLObject ignore_whitespaceP = T;
                SubLObject next_char_quotedP = NIL;
                SubLObject inside_stringP = NIL;
                SubLObject inside_commentP = NIL;
                SubLObject paren_depth = ZERO_INTEGER;
                SubLObject last_paren_line = NIL;
                SubLObject had_bad_directiveP = NIL;
                SubLObject had_bad_dataP = NIL;
                SubLObject abortP = NIL;
                if (!filename.isString()) {
                    filename = NIL;
                }
                if (NIL == abortP) {
                    {
                        SubLObject csome_list_var = ke_text_list;
                        SubLObject text_line = NIL;
                        for (text_line = csome_list_var.first(); !((NIL != abortP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , text_line = csome_list_var.first()) {
                            if (length(error_lists).numG($ke_text_error_count_abort_num$.getDynamicValue(thread))) {
                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt1), error_lists);
                                abortP = T;
                            }
                            {
                                SubLObject text_line_length = length(text_line);
                                line_number_end = add(line_number_end, ONE_INTEGER);
                                if (text_line_length.numE(ZERO_INTEGER) && line_number_start.numE(line_number_end)) {
                                    line_number_start = add(line_number_start, ONE_INTEGER);
                                }
                                if (NIL != char_list) {
                                    if (NIL != inside_stringP) {
                                        char_list = cons(CHAR_newline, char_list);
                                    } else {
                                        char_list = cons(CHAR_space, char_list);
                                    }
                                }
                                inside_commentP = NIL;
                                ignore_whitespaceP = T;
                                {
                                    SubLObject char_number = NIL;
                                    for (char_number = ZERO_INTEGER; !char_number.numE(text_line_length); char_number = add(char_number, ONE_INTEGER)) {
                                        {
                                            SubLObject this_char = Strings.sublisp_char(text_line, char_number);
                                            if (!((NIL != ignore_whitespaceP) && (NIL != string_utilities.whitespacep(this_char)))) {
                                                ignore_whitespaceP = NIL;
                                                if (this_char.equal(CHAR_return)) {
                                                } else {
                                                    if (T.equal(inside_commentP)) {
                                                    } else {
                                                        if (T.equal(next_char_quotedP)) {
                                                            char_list = cons(this_char, char_list);
                                                            next_char_quotedP = NIL;
                                                        } else {
                                                            if (this_char == CHAR_backslash) {
                                                                char_list = cons(this_char, char_list);
                                                                next_char_quotedP = T;
                                                            } else {
                                                                if (T.equal(inside_stringP)) {
                                                                    char_list = cons(this_char, char_list);
                                                                    if (this_char == CHAR_quotation) {
                                                                        inside_stringP = NIL;
                                                                    }
                                                                } else {
                                                                    if (this_char == CHAR_quotation) {
                                                                        char_list = cons(this_char, char_list);
                                                                        inside_stringP = T;
                                                                    } else {
                                                                        if (this_char == CHAR_semicolon) {
                                                                            inside_commentP = T;
                                                                        } else {
                                                                            if (this_char == CHAR_lparen) {
                                                                                char_list = cons(this_char, char_list);
                                                                                if (NIL == last_paren_line) {
                                                                                    last_paren_line = line_number_end;
                                                                                }
                                                                                paren_depth = add(paren_depth, ONE_INTEGER);
                                                                            } else {
                                                                                if (this_char == CHAR_rparen) {
                                                                                    char_list = cons(this_char, char_list);
                                                                                    paren_depth = subtract(paren_depth, ONE_INTEGER);
                                                                                    if (paren_depth.numE(ZERO_INTEGER)) {
                                                                                        last_paren_line = NIL;
                                                                                    }
                                                                                    if (paren_depth.numL(ZERO_INTEGER)) {
                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt2$Too_many_close_parenthesis_on_lin, line_number_end)), error_lists);
                                                                                    }
                                                                                } else {
                                                                                    if (!paren_depth.numE(ZERO_INTEGER)) {
                                                                                        char_list = cons(this_char, char_list);
                                                                                    } else {
                                                                                        if (this_char == CHAR_colon) {
                                                                                            if (looking_for == $END_OF_DATA) {
                                                                                                char_list = cons(this_char, char_list);
                                                                                            } else {
                                                                                                if (NIL == char_list) {
                                                                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt4), error_lists);
                                                                                                } else {
                                                                                                    {
                                                                                                        SubLObject directive_s_poss = string_utilities.char_list_to_string(nreverse(char_list));
                                                                                                        char_list = NIL;
                                                                                                        thread.resetMultipleValues();
                                                                                                        {
                                                                                                            SubLObject directive_s = string_utilities.listify_string(directive_s_poss, UNPROVIDED);
                                                                                                            SubLObject error_strings = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (NIL != error_strings) {
                                                                                                                {
                                                                                                                    SubLObject cdolist_list_var = error_strings;
                                                                                                                    SubLObject error_string = NIL;
                                                                                                                    for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, error_string, directive_s_poss), error_lists);
                                                                                                                    }
                                                                                                                    had_bad_directiveP = T;
                                                                                                                }
                                                                                                            } else {
                                                                                                                looking_for = $END_OF_DATA;
                                                                                                                the_directive = directive_s;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                ignore_whitespaceP = T;
                                                                                                char_list = NIL;
                                                                                            }
                                                                                        } else {
                                                                                            if (this_char == CHAR_period) {
                                                                                                if (looking_for == $END_OF_DIRECTIVE) {
                                                                                                    if (NIL == char_list) {
                                                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt4), error_lists);
                                                                                                    } else {
                                                                                                        {
                                                                                                            SubLObject directive_s_poss = string_utilities.char_list_to_string(nreverse(char_list));
                                                                                                            char_list = NIL;
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject directive_s = string_utilities.listify_string(directive_s_poss, UNPROVIDED);
                                                                                                                SubLObject error_strings = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != error_strings) {
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var = error_strings;
                                                                                                                        SubLObject error_string = NIL;
                                                                                                                        for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string, directive_s_poss), error_lists);
                                                                                                                        }
                                                                                                                        had_bad_directiveP = T;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    the_directive = directive_s;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (NIL == char_list) {
                                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt5$Missing_data_for_directive__A, the_directive)), error_lists);
                                                                                                    } else {
                                                                                                        {
                                                                                                            SubLObject data_s_poss = string_utilities.char_list_to_string(nreverse(char_list));
                                                                                                            char_list = NIL;
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject data = string_utilities.listify_string(data_s_poss, UNPROVIDED);
                                                                                                                SubLObject error_strings = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != error_strings) {
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var = error_strings;
                                                                                                                        SubLObject error_string = NIL;
                                                                                                                        for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string, data_s_poss), error_lists);
                                                                                                                        }
                                                                                                                        had_bad_dataP = T;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    the_data = data;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (!((NIL != had_bad_directiveP) || (NIL != had_bad_dataP))) {
                                                                                                    token_lists = cons(list(filename, line_number_start, line_number_end, the_directive, the_data), token_lists);
                                                                                                }
                                                                                                the_directive = NIL;
                                                                                                the_data = NIL;
                                                                                                had_bad_dataP = NIL;
                                                                                                had_bad_directiveP = NIL;
                                                                                                char_list = NIL;
                                                                                                ignore_whitespaceP = T;
                                                                                                looking_for = $END_OF_DIRECTIVE;
                                                                                                line_number_start = add(ONE_INTEGER, line_number_end);
                                                                                            } else {
                                                                                                char_list = cons(this_char, char_list);
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != char_list) {
                    if (paren_depth.numG(ZERO_INTEGER)) {
                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt6$Unclosed_open_parenthesis_on_line, last_paren_line)), error_lists);
                    } else {
                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt7$Unfinished_expression_at_end_of_f, string_utilities.char_list_to_string(nreverse(char_list)))), error_lists);
                    }
                }
                return values(nreverse(token_lists), nreverse(error_lists));
            }
        }
    }

    /**
     * Do first pass parsing of some KE-Text.  Returns a list of lists looking like (FILENAME LINE-NUMBER-START LINE-NUMBER-END DIRECTIVE DATA).  These will be further parsed in the second pass.  Basic syntax errors such as missing characters (periods, matching parens, matching quotes,.) are found here.
     *
     * @return 0 list ;; a list of token lists
     * @return 1 list ;; a list of error lists
     * @param KE-TEXT-LIST
     * 		list ;; a list of string to parse
     * @param FILENAME
     * 		string ;; the file these string are from (or 'ke-text compose')
     */
    @LispMethod(comment = "Do first pass parsing of some KE-Text.  Returns a list of lists looking like (FILENAME LINE-NUMBER-START LINE-NUMBER-END DIRECTIVE DATA).  These will be further parsed in the second pass.  Basic syntax errors such as missing characters (periods, matching parens, matching quotes,.) are found here.\r\n\r\n@return 0 list ;; a list of token lists\r\n@return 1 list ;; a list of error lists\r\n@param KE-TEXT-LIST\r\n\t\tlist ;; a list of string to parse\r\n@param FILENAME\r\n\t\tstring ;; the file these string are from (or \'ke-text compose\')")
    public static SubLObject ke_text_list_to_token_lists(final SubLObject ke_text_list, SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject token_lists = NIL;
        SubLObject error_lists = NIL;
        SubLObject line_number_start = ONE_INTEGER;
        SubLObject line_number_end = ZERO_INTEGER;
        SubLObject char_list = NIL;
        SubLObject the_directive = NIL;
        SubLObject the_data = NIL;
        SubLObject looking_for = $END_OF_DIRECTIVE;
        SubLObject ignore_whitespaceP = T;
        SubLObject next_char_quotedP = NIL;
        SubLObject inside_stringP = NIL;
        SubLObject inside_commentP = NIL;
        SubLObject paren_depth = ZERO_INTEGER;
        SubLObject last_paren_line = NIL;
        SubLObject had_bad_directiveP = NIL;
        SubLObject had_bad_dataP = NIL;
        SubLObject abortP = NIL;
        if (!filename.isString()) {
            filename = NIL;
        }
        if (NIL == abortP) {
            SubLObject csome_list_var = ke_text_list;
            SubLObject text_line = NIL;
            text_line = csome_list_var.first();
            while ((NIL == abortP) && (NIL != csome_list_var)) {
                if (length(error_lists).numG($ke_text_error_count_abort_num$.getDynamicValue(thread))) {
                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list9), error_lists);
                    abortP = T;
                }
                final SubLObject text_line_length = length(text_line);
                line_number_end = add(line_number_end, ONE_INTEGER);
                if (text_line_length.numE(ZERO_INTEGER) && line_number_start.numE(line_number_end)) {
                    line_number_start = add(line_number_start, ONE_INTEGER);
                }
                if (NIL != char_list) {
                    if (NIL != inside_stringP) {
                        char_list = cons(CHAR_newline, char_list);
                    } else {
                        char_list = cons(CHAR_space, char_list);
                    }
                }
                inside_commentP = NIL;
                ignore_whitespaceP = T;
                SubLObject char_number;
                SubLObject this_char;
                SubLObject directive_s_poss;
                SubLObject directive_s;
                SubLObject error_strings;
                SubLObject cdolist_list_var;
                SubLObject error_string;
                SubLObject data_s_poss;
                SubLObject data;
                for (char_number = NIL, char_number = ZERO_INTEGER; !char_number.numE(text_line_length); char_number = add(char_number, ONE_INTEGER)) {
                    this_char = Strings.sublisp_char(text_line, char_number);
                    if ((NIL == ignore_whitespaceP) || (NIL == string_utilities.whitespacep(this_char))) {
                        ignore_whitespaceP = NIL;
                        if (!this_char.equal(CHAR_return)) {
                            if (!T.equal(inside_commentP)) {
                                if (T.equal(next_char_quotedP)) {
                                    char_list = cons(this_char, char_list);
                                    next_char_quotedP = NIL;
                                } else
                                    if (this_char.eql(CHAR_backslash)) {
                                        char_list = cons(this_char, char_list);
                                        next_char_quotedP = T;
                                    } else
                                        if (T.equal(inside_stringP)) {
                                            char_list = cons(this_char, char_list);
                                            if (this_char.eql(CHAR_quotation)) {
                                                inside_stringP = NIL;
                                            }
                                        } else
                                            if (this_char.eql(CHAR_quotation)) {
                                                char_list = cons(this_char, char_list);
                                                inside_stringP = T;
                                            } else
                                                if (this_char.eql(CHAR_semicolon)) {
                                                    inside_commentP = T;
                                                } else
                                                    if (this_char.eql(CHAR_lparen)) {
                                                        char_list = cons(this_char, char_list);
                                                        if (NIL == last_paren_line) {
                                                            last_paren_line = line_number_end;
                                                        }
                                                        paren_depth = add(paren_depth, ONE_INTEGER);
                                                    } else
                                                        if (this_char.eql(CHAR_rparen)) {
                                                            char_list = cons(this_char, char_list);
                                                            paren_depth = subtract(paren_depth, ONE_INTEGER);
                                                            if (paren_depth.numE(ZERO_INTEGER)) {
                                                                last_paren_line = NIL;
                                                            }
                                                            if (paren_depth.numL(ZERO_INTEGER)) {
                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str10$Too_many_close_parenthesis_on_lin, line_number_end)), error_lists);
                                                            }
                                                        } else
                                                            if (!paren_depth.numE(ZERO_INTEGER)) {
                                                                char_list = cons(this_char, char_list);
                                                            } else
                                                                if (this_char.eql(CHAR_colon)) {
                                                                    if (looking_for == $END_OF_DATA) {
                                                                        char_list = cons(this_char, char_list);
                                                                    } else {
                                                                        if (NIL == char_list) {
                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list12), error_lists);
                                                                        } else {
                                                                            directive_s_poss = string_utilities.char_list_to_string(nreverse(char_list));
                                                                            char_list = NIL;
                                                                            thread.resetMultipleValues();
                                                                            directive_s = string_utilities.listify_string(directive_s_poss, UNPROVIDED);
                                                                            error_strings = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != error_strings) {
                                                                                cdolist_list_var = error_strings;
                                                                                error_string = NIL;
                                                                                error_string = cdolist_list_var.first();
                                                                                while (NIL != cdolist_list_var) {
                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, error_string, directive_s_poss), error_lists);
                                                                                    cdolist_list_var = cdolist_list_var.rest();
                                                                                    error_string = cdolist_list_var.first();
                                                                                } 
                                                                                had_bad_directiveP = T;
                                                                            } else {
                                                                                looking_for = $END_OF_DATA;
                                                                                the_directive = directive_s;
                                                                            }
                                                                        }
                                                                        ignore_whitespaceP = T;
                                                                        char_list = NIL;
                                                                    }
                                                                } else
                                                                    if (this_char.eql(CHAR_period)) {
                                                                        if (looking_for == $END_OF_DIRECTIVE) {
                                                                            if (NIL == char_list) {
                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list12), error_lists);
                                                                            } else {
                                                                                directive_s_poss = string_utilities.char_list_to_string(nreverse(char_list));
                                                                                char_list = NIL;
                                                                                thread.resetMultipleValues();
                                                                                directive_s = string_utilities.listify_string(directive_s_poss, UNPROVIDED);
                                                                                error_strings = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != error_strings) {
                                                                                    cdolist_list_var = error_strings;
                                                                                    error_string = NIL;
                                                                                    error_string = cdolist_list_var.first();
                                                                                    while (NIL != cdolist_list_var) {
                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, error_string, directive_s_poss), error_lists);
                                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                                        error_string = cdolist_list_var.first();
                                                                                    } 
                                                                                    had_bad_directiveP = T;
                                                                                } else {
                                                                                    the_directive = directive_s;
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (NIL == char_list) {
                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str13$Missing_data_for_directive__A, the_directive)), error_lists);
                                                                            } else {
                                                                                data_s_poss = string_utilities.char_list_to_string(nreverse(char_list));
                                                                                char_list = NIL;
                                                                                thread.resetMultipleValues();
                                                                                data = string_utilities.listify_string(data_s_poss, UNPROVIDED);
                                                                                error_strings = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != error_strings) {
                                                                                    cdolist_list_var = error_strings;
                                                                                    error_string = NIL;
                                                                                    error_string = cdolist_list_var.first();
                                                                                    while (NIL != cdolist_list_var) {
                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, error_string, data_s_poss), error_lists);
                                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                                        error_string = cdolist_list_var.first();
                                                                                    } 
                                                                                    had_bad_dataP = T;
                                                                                } else {
                                                                                    the_data = data;
                                                                                }
                                                                            }

                                                                        if ((NIL == had_bad_directiveP) && (NIL == had_bad_dataP)) {
                                                                            token_lists = cons(list(filename, line_number_start, line_number_end, the_directive, the_data), token_lists);
                                                                        }
                                                                        the_directive = NIL;
                                                                        the_data = NIL;
                                                                        had_bad_dataP = NIL;
                                                                        had_bad_directiveP = NIL;
                                                                        char_list = NIL;
                                                                        ignore_whitespaceP = T;
                                                                        looking_for = $END_OF_DIRECTIVE;
                                                                        line_number_start = add(ONE_INTEGER, line_number_end);
                                                                    } else {
                                                                        char_list = cons(this_char, char_list);
                                                                    }









                            }
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                text_line = csome_list_var.first();
            } 
        }
        if (NIL != char_list) {
            if (paren_depth.numG(ZERO_INTEGER)) {
                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str14$Unclosed_open_parenthesis_on_line, last_paren_line)), error_lists);
            } else {
                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str15$Unfinished_expression_at_end_of_f, string_utilities.char_list_to_string(nreverse(char_list)))), error_lists);
            }
        }
        return values(nreverse(token_lists), nreverse(error_lists));
    }

    /**
     * Lookup a list of strings (bunged together) in an assoc array.  Used for lookups in *ket-string-to-direction* and *ket-string-to-strength*.
     *
     * @return keyword or nil ;; the associated keyowrd if found
     * @param STRING-LIST
    list
     * 		
     */
    @LispMethod(comment = "Lookup a list of strings (bunged together) in an assoc array.  Used for lookups in *ket-string-to-direction* and *ket-string-to-strength*.\r\n\r\n@return keyword or nil ;; the associated keyowrd if found\r\n@param STRING-LIST\nlist")
    public static final SubLObject ket_lookup_string_alt(SubLObject string_list, SubLObject assoc) {
        {
            SubLObject cdolist_list_var = string_list;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                if (!string.isString()) {
                    return NIL;
                }
            }
        }
        {
            SubLObject key_string = Strings.string_downcase(string_utilities.bunge(string_list, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            if (NIL != charE(CHAR_colon, Strings.sublisp_char(key_string, ZERO_INTEGER))) {
                key_string = string_utilities.substring(key_string, ONE_INTEGER, length(key_string));
            }
            {
                SubLObject possible_keyword = assoc(key_string, assoc, symbol_function(EQUAL), UNPROVIDED);
                if (NIL != possible_keyword) {
                    return possible_keyword.rest();
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * Lookup a list of strings (bunged together) in an assoc array.  Used for lookups in *ket-string-to-direction* and *ket-string-to-strength*.
     *
     * @return keyword or nil ;; the associated keyowrd if found
     * @param STRING-LIST
    		list
     * 		
     */
    @LispMethod(comment = "Lookup a list of strings (bunged together) in an assoc array.  Used for lookups in *ket-string-to-direction* and *ket-string-to-strength*.\r\n\r\n@return keyword or nil ;; the associated keyowrd if found\r\n@param STRING-LIST\n\t\tlist")
    public static SubLObject ket_lookup_string(final SubLObject string_list, final SubLObject assoc) {
        SubLObject cdolist_list_var = string_list;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!string.isString()) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        SubLObject key_string = Strings.string_downcase(string_utilities.bunge(string_list, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        if (NIL != charE(CHAR_colon, Strings.sublisp_char(key_string, ZERO_INTEGER))) {
            key_string = string_utilities.substring(key_string, ONE_INTEGER, length(key_string));
        }
        final SubLObject possible_keyword = assoc(key_string, assoc, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != possible_keyword) {
            return possible_keyword.rest();
        }
        return NIL;
    }

    /**
     * Lookup a list of strings (bunged together) in *ket-string-to-directive*.
     *
     * @return keyword or fort or new-constant-wrapper or nil ;; the associated object
     * @param DIRECTIVE-LIST
     * 		list ;; a list of strings
     * @param NEW-CONSTANT-NAMES
     * 		list ;; a list of constant names that have been created
     */
    @LispMethod(comment = "Lookup a list of strings (bunged together) in *ket-string-to-directive*.\r\n\r\n@return keyword or fort or new-constant-wrapper or nil ;; the associated object\r\n@param DIRECTIVE-LIST\r\n\t\tlist ;; a list of strings\r\n@param NEW-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant names that have been created")
    public static final SubLObject ket_directive_list_to_directive_alt(SubLObject directive_list, SubLObject new_constant_names) {
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_stringsP = T;
                SubLObject cdolist_list_var = directive_list;
                SubLObject directive_thing = NIL;
                for (directive_thing = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , directive_thing = cdolist_list_var.first()) {
                    if (!directive_thing.isString()) {
                        all_stringsP = NIL;
                    }
                }
                if (NIL != all_stringsP) {
                    {
                        SubLObject directive_string = string_utilities.bunge(directive_list, UNPROVIDED);
                        SubLObject possible_keyword = assoc(Strings.string_downcase(directive_string, UNPROVIDED, UNPROVIDED), $ket_string_to_directive$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED).rest();
                        SubLObject possible_predicate = ke_utilities.fort_from_string(directive_string);
                        if (NIL != possible_keyword) {
                            return possible_keyword;
                        } else {
                            if (NIL != fort_types_interface.predicate_in_any_mtP(possible_predicate)) {
                                return possible_predicate;
                            } else {
                                if (NIL != member(directive_string, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                    return com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(directive_string);
                                }
                            }
                        }
                    }
                } else {
                    if (ONE_INTEGER.equal(length(directive_list))) {
                        {
                            SubLObject possible_nat_predicate = narts_high.find_nart(com.cyc.cycjava.cycl.ke_text.ket_unknown_to_known(directive_list.first(), UNPROVIDED, UNPROVIDED));
                            if (NIL != fort_types_interface.predicate_in_any_mtP(possible_nat_predicate)) {
                                return possible_nat_predicate;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Lookup a list of strings (bunged together) in *ket-string-to-directive*.
     *
     * @return keyword or fort or new-constant-wrapper or nil ;; the associated object
     * @param DIRECTIVE-LIST
     * 		list ;; a list of strings
     * @param NEW-CONSTANT-NAMES
     * 		list ;; a list of constant names that have been created
     */
    @LispMethod(comment = "Lookup a list of strings (bunged together) in *ket-string-to-directive*.\r\n\r\n@return keyword or fort or new-constant-wrapper or nil ;; the associated object\r\n@param DIRECTIVE-LIST\r\n\t\tlist ;; a list of strings\r\n@param NEW-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant names that have been created")
    public static SubLObject ket_directive_list_to_directive(final SubLObject directive_list, SubLObject new_constant_names) {
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_stringsP = T;
        SubLObject cdolist_list_var = directive_list;
        SubLObject directive_thing = NIL;
        directive_thing = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!directive_thing.isString()) {
                all_stringsP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            directive_thing = cdolist_list_var.first();
        } 
        if (NIL != all_stringsP) {
            final SubLObject directive_string = string_utilities.bunge(directive_list, UNPROVIDED);
            final SubLObject possible_keyword = assoc(Strings.string_downcase(directive_string, UNPROVIDED, UNPROVIDED), $ket_string_to_directive$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED).rest();
            final SubLObject possible_predicate = ke_utilities.fort_from_string(directive_string);
            if (NIL != possible_keyword) {
                return possible_keyword;
            }
            if (NIL != fort_types_interface.predicate_in_any_mtP(possible_predicate)) {
                return possible_predicate;
            }
            if (NIL != member(directive_string, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                return make_new_constant_wrapper(directive_string);
            }
        } else
            if (ONE_INTEGER.equal(length(directive_list))) {
                final SubLObject possible_nat_predicate = narts_high.find_nart(ket_unknown_to_known(directive_list.first(), UNPROVIDED, UNPROVIDED));
                if (NIL != fort_types_interface.predicate_in_any_mtP(possible_nat_predicate)) {
                    return possible_nat_predicate;
                }
            }

        return NIL;
    }

    /**
     * Find the currently relevant mt and return a representation for it.
     *
     * @return fort or new-constant-wrapper or nil ;; the mt representation
     * @param CURRENT-MT
     * 		microtheory or string
     * @param CURRENT-DEFAULT-MT
     * 		microtheory or string
     * @param NEW-CONSTANT-NAMES
     * 		list ;; a list of constant names that have been created
     */
    @LispMethod(comment = "Find the currently relevant mt and return a representation for it.\r\n\r\n@return fort or new-constant-wrapper or nil ;; the mt representation\r\n@param CURRENT-MT\r\n\t\tmicrotheory or string\r\n@param CURRENT-DEFAULT-MT\r\n\t\tmicrotheory or string\r\n@param NEW-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant names that have been created")
    public static final SubLObject ket_relevant_mt_alt(SubLObject current_mt, SubLObject current_default_mt, SubLObject new_constant_names) {
        {
            SubLObject possible_mt = (NIL != current_mt) ? ((SubLObject) (current_mt)) : current_default_mt;
            if (NIL == possible_mt) {
                return NIL;
            } else {
                if (NIL != constantp(possible_mt, UNPROVIDED)) {
                    return possible_mt;
                } else {
                    if (NIL != hlmt.hlmt_p(possible_mt)) {
                        return possible_mt;
                    } else {
                        if (possible_mt.isString() && (NIL != member(possible_mt, new_constant_names, symbol_function(EQUAL), UNPROVIDED))) {
                            return com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(possible_mt);
                        } else {
                            if (possible_mt.isList()) {
                                {
                                    SubLObject possible_nart_mt = narts_high.find_nart(possible_mt);
                                    if (NIL != hlmt.hlmt_p(possible_nart_mt)) {
                                        return possible_nart_mt;
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.ke_text.new_constant_wrapperp(possible_mt)) {
                                            return possible_mt;
                                        } else {
                                            return possible_mt;
                                        }
                                    }
                                }
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Find the currently relevant mt and return a representation for it.
     *
     * @return fort or new-constant-wrapper or nil ;; the mt representation
     * @param CURRENT-MT
     * 		microtheory or string
     * @param CURRENT-DEFAULT-MT
     * 		microtheory or string
     * @param NEW-CONSTANT-NAMES
     * 		list ;; a list of constant names that have been created
     */
    @LispMethod(comment = "Find the currently relevant mt and return a representation for it.\r\n\r\n@return fort or new-constant-wrapper or nil ;; the mt representation\r\n@param CURRENT-MT\r\n\t\tmicrotheory or string\r\n@param CURRENT-DEFAULT-MT\r\n\t\tmicrotheory or string\r\n@param NEW-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant names that have been created")
    public static SubLObject ket_relevant_mt(final SubLObject current_mt, final SubLObject current_default_mt, final SubLObject new_constant_names) {
        final SubLObject possible_mt = (NIL != current_mt) ? current_mt : current_default_mt;
        if (NIL == possible_mt) {
            return NIL;
        }
        if (NIL != constantp(possible_mt, UNPROVIDED)) {
            return possible_mt;
        }
        if (NIL != hlmt.hlmt_p(possible_mt)) {
            return possible_mt;
        }
        if (possible_mt.isString() && (NIL != member(possible_mt, new_constant_names, symbol_function(EQUAL), UNPROVIDED))) {
            return make_new_constant_wrapper(possible_mt);
        }
        if (!possible_mt.isList()) {
            return NIL;
        }
        final SubLObject possible_nart_mt = narts_high.find_nart(possible_mt);
        if (NIL != hlmt.hlmt_p(possible_nart_mt)) {
            return possible_nart_mt;
        }
        if (NIL != new_constant_wrapperp(possible_mt)) {
            return possible_mt;
        }
        return possible_mt;
    }

    /**
     * Find the currently relevant assertion strength and return a keyword for it.
     *
     * @return keyword
     * @param OVERRIDE-STRENGTH
    keyword
     * 		
     * @param PRED
     * 		predicate ;; the predicate used to determine the default strength (:default or :monotonic)
     */
    @LispMethod(comment = "Find the currently relevant assertion strength and return a keyword for it.\r\n\r\n@return keyword\r\n@param OVERRIDE-STRENGTH\nkeyword\r\n\t\t\r\n@param PRED\r\n\t\tpredicate ;; the predicate used to determine the default strength (:default or :monotonic)")
    public static final SubLObject ket_relevant_strength_alt(SubLObject override_strength, SubLObject pred) {
        if ($MONOTONIC == override_strength) {
            return override_strength;
        }
        if ($DEFAULT == override_strength) {
            return override_strength;
        }
        if ((NIL != forts.fort_p(pred)) && (NIL != isa.isa_in_any_mtP(pred, $$DefaultMonotonicPredicate))) {
            return $MONOTONIC;
        }
        return $DEFAULT;
    }

    /**
     * Find the currently relevant assertion strength and return a keyword for it.
     *
     * @return keyword
     * @param OVERRIDE-STRENGTH
    		keyword
     * 		
     * @param PRED
     * 		predicate ;; the predicate used to determine the default strength (:default or :monotonic)
     */
    @LispMethod(comment = "Find the currently relevant assertion strength and return a keyword for it.\r\n\r\n@return keyword\r\n@param OVERRIDE-STRENGTH\n\t\tkeyword\r\n\t\t\r\n@param PRED\r\n\t\tpredicate ;; the predicate used to determine the default strength (:default or :monotonic)")
    public static SubLObject ket_relevant_strength(final SubLObject override_strength, final SubLObject pred) {
        if ($MONOTONIC == override_strength) {
            return override_strength;
        }
        if ($DEFAULT == override_strength) {
            return override_strength;
        }
        if ((NIL != forts.fort_p(pred)) && (NIL != isa.isa_in_any_mtP(pred, $$DefaultMonotonicPredicate))) {
            return $MONOTONIC;
        }
        return $DEFAULT;
    }

    /**
     * Find the currently relevant assertion direction and return a keyword for it.
     *
     * @return keyword
     * @param OVERRIDE-DIRECTION
    keyword
     * 		
     * @param FORMULA
     * 		list ;; the formula used to determine the default direction
     */
    @LispMethod(comment = "Find the currently relevant assertion direction and return a keyword for it.\r\n\r\n@return keyword\r\n@param OVERRIDE-DIRECTION\nkeyword\r\n\t\t\r\n@param FORMULA\r\n\t\tlist ;; the formula used to determine the default direction")
    public static final SubLObject ket_relevant_direction_alt(SubLObject override_direction, SubLObject formula) {
        if ($FORWARD == override_direction) {
            return override_direction;
        }
        if ($BACKWARD == override_direction) {
            return override_direction;
        }
        if ($CODE == override_direction) {
            return override_direction;
        }
        return NIL;
    }

    /**
     * Find the currently relevant assertion direction and return a keyword for it.
     *
     * @return keyword
     * @param OVERRIDE-DIRECTION
    		keyword
     * 		
     * @param FORMULA
     * 		list ;; the formula used to determine the default direction
     */
    @LispMethod(comment = "Find the currently relevant assertion direction and return a keyword for it.\r\n\r\n@return keyword\r\n@param OVERRIDE-DIRECTION\n\t\tkeyword\r\n\t\t\r\n@param FORMULA\r\n\t\tlist ;; the formula used to determine the default direction")
    public static SubLObject ket_relevant_direction(final SubLObject override_direction, final SubLObject formula) {
        if ($FORWARD == override_direction) {
            return override_direction;
        }
        if ($BACKWARD == override_direction) {
            return override_direction;
        }
        if ($CODE == override_direction) {
            return override_direction;
        }
        return NIL;
    }

    /**
     * Transform a list of things into a resolved list.  Primarily used to resolve a list of constant names, will also resolve strings representing symbols, keywords, cyc variables, numbers,.
     *
     * @return 0 object ;; the resolved object
     * @return 1 list ;; a list of error strings if error
     * @param UNKNOWN
    thing
     * 		
     * @param NEW-CONSTANT-NAMES
     * 		list ;; a list of constant names that have been created
     * @param KILLED-CONSTANT-NAMES
     * 		list ;; a list of constant name that are no longer valid
     */
    @LispMethod(comment = "Transform a list of things into a resolved list.  Primarily used to resolve a list of constant names, will also resolve strings representing symbols, keywords, cyc variables, numbers,.\r\n\r\n@return 0 object ;; the resolved object\r\n@return 1 list ;; a list of error strings if error\r\n@param UNKNOWN\nthing\r\n\t\t\r\n@param NEW-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant names that have been created\r\n@param KILLED-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant name that are no longer valid")
    public static final SubLObject ket_unknown_to_known_alt(SubLObject unknown, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        if (killed_constant_names == UNPROVIDED) {
            killed_constant_names = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject known = NIL;
                SubLObject error_strings = NIL;
                if (NIL == unknown) {
                    error_strings = cons($$$Something_is_nil, error_strings);
                    known = unknown;
                } else {
                    if (NIL != forts.fort_p(unknown)) {
                        known = unknown;
                    } else {
                        if (unknown.isNumber()) {
                            known = unknown;
                        } else {
                            if (unknown.isKeyword()) {
                                known = unknown;
                            } else {
                                if (unknown.isSymbol()) {
                                    known = unknown;
                                } else {
                                    if (unknown.isList()) {
                                        if (NIL != com.cyc.cycjava.cycl.ke_text.new_constant_wrapperp(unknown)) {
                                            return unknown;
                                        } else {
                                            {
                                                SubLObject cdolist_list_var = unknown;
                                                SubLObject unknown_item = NIL;
                                                for (unknown_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unknown_item = cdolist_list_var.first()) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject known_item = com.cyc.cycjava.cycl.ke_text.ket_unknown_to_known(unknown_item, new_constant_names, killed_constant_names);
                                                        SubLObject more_error_strings = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        error_strings = append(more_error_strings, error_strings);
                                                        known = cons(known_item, known);
                                                    }
                                                }
                                            }
                                            known = nreverse(known);
                                        }
                                    } else {
                                        if (unknown.isString()) {
                                            {
                                                SubLObject possible_constant_name = string_utilities.string_remove_constant_reader_prefix(unknown);
                                                SubLObject first_char = string_utilities.first_char(unknown);
                                                if (NIL != member(unknown, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                    error_strings = cons(format(NIL, $str_alt18$Bad_reference_to_a_killed_or_rena, unknown), error_strings);
                                                } else {
                                                    if (NIL != charE(CHAR_colon, first_char)) {
                                                        if (ONE_INTEGER.numL(length(unknown))) {
                                                            known = string_utilities.keyword_from_string(Strings.string_upcase(string_utilities.substring(unknown, ONE_INTEGER, length(unknown)), UNPROVIDED, UNPROVIDED));
                                                        } else {
                                                            error_strings = cons($str_alt19$A_single_colon_is_an_invalid_keyw, error_strings);
                                                        }
                                                    } else {
                                                        if (NIL != charE(CHAR_question, first_char)) {
                                                            if (ONE_INTEGER.numL(length(unknown))) {
                                                                known = cycl_variables.make_el_var(unknown);
                                                            } else {
                                                                error_strings = cons($str_alt20$A_single_question_mark_is_an_inva, error_strings);
                                                            }
                                                        } else {
                                                            if (NIL != charE(CHAR_quotation, first_char)) {
                                                                if (length(unknown).numG(ONE_INTEGER) && (CHAR_quotation == string_utilities.last_char(unknown))) {
                                                                    known = string_utilities.string_trim_symmetric_n($list_alt21, unknown, ONE_INTEGER);
                                                                } else {
                                                                    error_strings = cons($$$Malformed_string, error_strings);
                                                                }
                                                            } else {
                                                                if (NIL != charE(CHAR_quote, first_char)) {
                                                                    if (ONE_INTEGER.numL(length(unknown))) {
                                                                        known = intern(Strings.string_upcase(string_utilities.substring(unknown, ONE_INTEGER, length(unknown)), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                                    } else {
                                                                        error_strings = cons($$$Gratutuious_single_quote, error_strings);
                                                                    }
                                                                } else {
                                                                    if (NIL != charE(CHAR_period, first_char)) {
                                                                        if (ONE_INTEGER.numL(length(unknown))) {
                                                                            known = intern(unknown, UNPROVIDED);
                                                                        } else {
                                                                            known = $DOT_FOR_DOTTED_LIST;
                                                                        }
                                                                    } else {
                                                                        if (NIL != member(unknown, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                            known = com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(unknown);
                                                                        } else {
                                                                            if (NIL != number_utilities.number_string_p(unknown)) {
                                                                                {
                                                                                    SubLObject possible_number = read_from_string_ignoring_errors(unknown, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    if (NIL != possible_number) {
                                                                                        known = possible_number;
                                                                                    } else {
                                                                                        known = unknown;
                                                                                        error_strings = cons(format(NIL, $str_alt25$Bad_number___A_, unknown), error_strings);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (Strings.string_downcase(unknown, UNPROVIDED, UNPROVIDED).equal($$$nil)) {
                                                                                    known = NIL;
                                                                                } else {
                                                                                    if (Strings.string_downcase(unknown, UNPROVIDED, UNPROVIDED).equal($$$t)) {
                                                                                        known = T;
                                                                                    } else {
                                                                                        if (NIL != constant_completion_high.valid_constant_name_p(possible_constant_name)) {
                                                                                            {
                                                                                                SubLObject possible_constant = com.cyc.cycjava.cycl.ke_text.ket_maybe_find_constant(possible_constant_name);
                                                                                                if (NIL != valid_constantP(possible_constant, UNPROVIDED)) {
                                                                                                    known = possible_constant;
                                                                                                } else {
                                                                                                    if (NIL != member(possible_constant_name, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                                        known = com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(possible_constant_name);
                                                                                                    } else {
                                                                                                        error_strings = cons(format(NIL, $str_alt28$Constant_not_found___A_, unknown), error_strings);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            error_strings = cons(format(NIL, $str_alt29$Couldn_t_figure_out_string___A___, unknown), error_strings);
                                                                                            known = unknown;
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
                                        } else {
                                            error_strings = cons(format(NIL, $str_alt30$Couldn_t_figure_out___A_, unknown), error_strings);
                                            known = unknown;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(known, nreverse(error_strings));
            }
        }
    }

    /**
     * Transform a list of things into a resolved list.  Primarily used to resolve a list of constant names, will also resolve strings representing symbols, keywords, cyc variables, numbers,.
     *
     * @return 0 object ;; the resolved object
     * @return 1 list ;; a list of error strings if error
     * @param UNKNOWN
    		thing
     * 		
     * @param NEW-CONSTANT-NAMES
     * 		list ;; a list of constant names that have been created
     * @param KILLED-CONSTANT-NAMES
     * 		list ;; a list of constant name that are no longer valid
     */
    @LispMethod(comment = "Transform a list of things into a resolved list.  Primarily used to resolve a list of constant names, will also resolve strings representing symbols, keywords, cyc variables, numbers,.\r\n\r\n@return 0 object ;; the resolved object\r\n@return 1 list ;; a list of error strings if error\r\n@param UNKNOWN\n\t\tthing\r\n\t\t\r\n@param NEW-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant names that have been created\r\n@param KILLED-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant name that are no longer valid")
    public static SubLObject ket_unknown_to_known(final SubLObject unknown, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        if (killed_constant_names == UNPROVIDED) {
            killed_constant_names = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known = NIL;
        SubLObject error_strings = NIL;
        if (NIL == unknown) {
            error_strings = cons($$$Something_is_nil, error_strings);
            known = unknown;
        } else
            if (NIL != forts.fort_p(unknown)) {
                known = unknown;
            } else
                if (unknown.isNumber()) {
                    known = unknown;
                } else
                    if (unknown.isKeyword()) {
                        known = unknown;
                    } else
                        if (unknown.isSymbol()) {
                            known = unknown;
                        } else
                            if (unknown.isList()) {
                                if (NIL != new_constant_wrapperp(unknown)) {
                                    return unknown;
                                }
                                SubLObject cdolist_list_var = unknown;
                                SubLObject unknown_item = NIL;
                                unknown_item = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    thread.resetMultipleValues();
                                    final SubLObject known_item = ket_unknown_to_known(unknown_item, new_constant_names, killed_constant_names);
                                    final SubLObject more_error_strings = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    error_strings = append(more_error_strings, error_strings);
                                    known = cons(known_item, known);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    unknown_item = cdolist_list_var.first();
                                } 
                                known = nreverse(known);
                            } else
                                if (NIL != unicode_strings.non_ascii_string_p(unknown)) {
                                    known = unicode_nauts.unicode_string_to_cycl_safe_string(unknown);
                                } else
                                    if (unknown.isString()) {
                                        final SubLObject possible_constant_name = string_utilities.string_remove_constant_reader_prefix(unknown);
                                        final SubLObject first_char = string_utilities.first_char(unknown);
                                        if (NIL != member(unknown, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                            error_strings = cons(format(NIL, $str26$Bad_reference_to_a_killed_or_rena, unknown), error_strings);
                                        } else
                                            if (NIL != charE(CHAR_colon, first_char)) {
                                                if (ONE_INTEGER.numL(length(unknown))) {
                                                    known = string_utilities.keyword_from_string(Strings.string_upcase(string_utilities.substring(unknown, ONE_INTEGER, length(unknown)), UNPROVIDED, UNPROVIDED));
                                                } else {
                                                    error_strings = cons($str27$A_single_colon_is_an_invalid_keyw, error_strings);
                                                }
                                            } else
                                                if (NIL != charE(CHAR_question, first_char)) {
                                                    if (ONE_INTEGER.numL(length(unknown))) {
                                                        known = cycl_variables.make_el_var(unknown);
                                                    } else {
                                                        error_strings = cons($str28$A_single_question_mark_is_an_inva, error_strings);
                                                    }
                                                } else
                                                    if (NIL != charE(CHAR_quotation, first_char)) {
                                                        if (length(unknown).numG(ONE_INTEGER) && CHAR_quotation.eql(string_utilities.last_char(unknown))) {
                                                            known = string_utilities.string_trim_symmetric_n($list29, unknown, ONE_INTEGER);
                                                            if (NIL != unicode_strings.non_ascii_string_p(known)) {
                                                                known = unicode_nauts.non_ascii_string_to_unicode(known);
                                                            }
                                                        } else {
                                                            error_strings = cons($$$Malformed_string, error_strings);
                                                        }
                                                    } else
                                                        if (NIL != charE(CHAR_quote, first_char)) {
                                                            if (ONE_INTEGER.numL(length(unknown))) {
                                                                known = intern(Strings.string_upcase(string_utilities.substring(unknown, ONE_INTEGER, length(unknown)), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                                            } else {
                                                                error_strings = cons($$$Gratutuious_single_quote, error_strings);
                                                            }
                                                        } else
                                                            if ((NIL != charE(CHAR_period, first_char)) && ONE_INTEGER.numE(length(unknown))) {
                                                                known = $DOT_FOR_DOTTED_LIST;
                                                            } else
                                                                if (NIL != member(unknown, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                    known = make_new_constant_wrapper(unknown);
                                                                } else
                                                                    if (NIL != number_utilities.number_string_p(unknown)) {
                                                                        final SubLObject possible_number = read_from_string_ignoring_errors(unknown, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        if (NIL != possible_number) {
                                                                            known = possible_number;
                                                                        } else {
                                                                            known = unknown;
                                                                            error_strings = cons(format(NIL, $str33$Bad_number___A_, unknown), error_strings);
                                                                        }
                                                                    } else
                                                                        if (Strings.string_downcase(unknown, UNPROVIDED, UNPROVIDED).equal($$$nil)) {
                                                                            known = NIL;
                                                                        } else
                                                                            if (Strings.string_downcase(unknown, UNPROVIDED, UNPROVIDED).equal($$$t)) {
                                                                                known = T;
                                                                            } else
                                                                                if (NIL != constant_completion_high.valid_constant_name_p(possible_constant_name)) {
                                                                                    final SubLObject possible_constant = ket_maybe_find_constant(possible_constant_name);
                                                                                    if (NIL != valid_constantP(possible_constant, UNPROVIDED)) {
                                                                                        known = possible_constant;
                                                                                    } else
                                                                                        if (NIL != member(possible_constant_name, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                            known = make_new_constant_wrapper(possible_constant_name);
                                                                                        } else {
                                                                                            error_strings = cons(format(NIL, $str36$Constant_not_found___A_, unknown), error_strings);
                                                                                        }

                                                                                } else {
                                                                                    error_strings = cons(format(NIL, $str37$Couldn_t_figure_out_string___A___, unknown), error_strings);
                                                                                    known = unknown;
                                                                                }










                                    } else {
                                        error_strings = cons(format(NIL, $str38$Couldn_t_figure_out___A_, unknown), error_strings);
                                        known = unknown;
                                    }







        return values(known, nreverse(error_strings));
    }

    /**
     *
     *
     * @return CONSTANT-P or NIL; A Constant whose name (possibly including the #$ prefix)
    is POSSIBLE-CONSTANT-NAME.
     */
    @LispMethod(comment = "@return CONSTANT-P or NIL; A Constant whose name (possibly including the #$ prefix)\r\nis POSSIBLE-CONSTANT-NAME.")
    public static final SubLObject ket_maybe_find_constant_alt(SubLObject possible_constant_name) {
        return constants_high.find_constant(string_utilities.string_remove_constant_reader_prefix(possible_constant_name));
    }

    /**
     *
     *
     * @return CONSTANT-P or NIL; A Constant whose name (possibly including the #$ prefix)
    is POSSIBLE-CONSTANT-NAME.
     */
    @LispMethod(comment = "@return CONSTANT-P or NIL; A Constant whose name (possibly including the #$ prefix)\r\nis POSSIBLE-CONSTANT-NAME.")
    public static SubLObject ket_maybe_find_constant(final SubLObject possible_constant_name) {
        return constants_high.find_constant(string_utilities.string_remove_constant_reader_prefix(possible_constant_name));
    }

    /**
     * Make a ke-operation (almost a form to eval) from the args.
     *
     * @return 0 list ;; a ke operation
     * @return 1 list ;; a list of error strings
     * @param unresolved-formula
    		list
     * 		
     * @param mt
     * 		microtheory or new-constant-wrapper
     * @param strength-override
    		keyword
     * 		
     * @param direction-override
    		keyword
     * 		
     * @param NEW-CONSTANT-NAMES
     * 		list ;; a list of constant names that have been created
     * @param KILLED-CONSTANT-NAMES
     * 		list ;; a list of constant name that are no longer valid
     * @param MODE
     * 		keyword ;; :enter or :delete
     */
    @LispMethod(comment = "Make a ke-operation (almost a form to eval) from the args.\r\n\r\n@return 0 list ;; a ke operation\r\n@return 1 list ;; a list of error strings\r\n@param unresolved-formula\n\t\tlist\r\n\t\t\r\n@param mt\r\n\t\tmicrotheory or new-constant-wrapper\r\n@param strength-override\n\t\tkeyword\r\n\t\t\r\n@param direction-override\n\t\tkeyword\r\n\t\t\r\n@param NEW-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant names that have been created\r\n@param KILLED-CONSTANT-NAMES\r\n\t\tlist ;; a list of constant name that are no longer valid\r\n@param MODE\r\n\t\tkeyword ;; :enter or :delete")
    public static final SubLObject ket_make_ke_operation(SubLObject unresolved_formula, SubLObject mt, SubLObject strength_override, SubLObject direction_override, SubLObject new_constant_names, SubLObject killed_constant_names, SubLObject mode) {
        if (strength_override == UNPROVIDED) {
            strength_override = NIL;
        }
        if (direction_override == UNPROVIDED) {
            direction_override = NIL;
        }
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        if (killed_constant_names == UNPROVIDED) {
            killed_constant_names = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $ENTER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ke_operation = NIL;
                SubLObject error_strings = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject formula = com.cyc.cycjava.cycl.ke_text.ket_unknown_to_known(unresolved_formula, new_constant_names, killed_constant_names);
                    SubLObject some_error_strings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != some_error_strings) {
                        {
                            SubLObject cdolist_list_var = some_error_strings;
                            SubLObject some_error_string = NIL;
                            for (some_error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , some_error_string = cdolist_list_var.first()) {
                                error_strings = cons(some_error_string, error_strings);
                            }
                        }
                    }
                    if (NIL == mt) {
                        error_strings = cons($$$Microtheory_not_specified, error_strings);
                    }
                    {
                        SubLObject predicate = formula.first();
                        SubLObject strength = com.cyc.cycjava.cycl.ke_text.ket_relevant_strength(strength_override, predicate);
                        SubLObject direction = com.cyc.cycjava.cycl.ke_text.ket_relevant_direction(direction_override, formula);
                        thread.resetMultipleValues();
                        {
                            SubLObject dotted_formula = list_utilities.possible_dotted_list_to_dotted_list(formula, UNPROVIDED);
                            SubLObject dotted_formula_okP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != dotted_formula_okP) {
                                formula = dotted_formula;
                            } else {
                                error_strings = cons($$$Invalid_dotted_list, error_strings);
                            }
                            if (mode == $DELETE) {
                                ke_operation = list($UNASSERT, formula, mt);
                            } else {
                                ke_operation = list($ASSERT, formula, mt, strength, direction);
                            }
                            return values(ke_operation, error_strings);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject ket_make_ke_operation(SubLObject unresolved_formula, final SubLObject mt, SubLObject strength_override, SubLObject direction_override, SubLObject new_constant_names, SubLObject killed_constant_names, SubLObject mode, SubLObject current_ist_sentence) {
        if (strength_override == UNPROVIDED) {
            strength_override = NIL;
        }
        if (direction_override == UNPROVIDED) {
            direction_override = NIL;
        }
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        if (killed_constant_names == UNPROVIDED) {
            killed_constant_names = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $ENTER;
        }
        if (current_ist_sentence == UNPROVIDED) {
            current_ist_sentence = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ke_operation = NIL;
        SubLObject error_strings = NIL;
        SubLObject replaced_the_assertion_sentenceP = NIL;
        if ((NIL != list_utilities.tree_find($$$TheAssertionSentence, unresolved_formula, EQUAL, UNPROVIDED)) || (NIL != list_utilities.tree_find($str41$__TheAssertionSentence, unresolved_formula, EQUAL, UNPROVIDED))) {
            if (NIL == current_ist_sentence) {
                error_strings = cons($str42$Formula____TheAssertionSentence_i, error_strings);
            }
            unresolved_formula = cycl_utilities.expression_subst(current_ist_sentence, $$$TheAssertionSentence, unresolved_formula, symbol_function(EQUAL), UNPROVIDED);
            unresolved_formula = cycl_utilities.expression_subst(current_ist_sentence, $str41$__TheAssertionSentence, unresolved_formula, symbol_function(EQUAL), UNPROVIDED);
            replaced_the_assertion_sentenceP = T;
        }
        if ((NIL == replaced_the_assertion_sentenceP) && (mode == $ENTER)) {
            current_ist_sentence = make_ist_sentence(mt, unresolved_formula);
        }
        thread.resetMultipleValues();
        SubLObject formula = ket_unknown_to_known(unresolved_formula, new_constant_names, killed_constant_names);
        final SubLObject some_error_strings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != some_error_strings) {
            SubLObject cdolist_list_var = some_error_strings;
            SubLObject some_error_string = NIL;
            some_error_string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                error_strings = cons(some_error_string, error_strings);
                cdolist_list_var = cdolist_list_var.rest();
                some_error_string = cdolist_list_var.first();
            } 
        }
        if (NIL == mt) {
            error_strings = cons($$$Microtheory_not_specified, error_strings);
        }
        final SubLObject predicate = formula.first();
        final SubLObject strength = ket_relevant_strength(strength_override, predicate);
        final SubLObject direction = ket_relevant_direction(direction_override, formula);
        thread.resetMultipleValues();
        final SubLObject dotted_formula = list_utilities.possible_dotted_list_to_dotted_list(formula, UNPROVIDED);
        final SubLObject dotted_formula_okP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != dotted_formula_okP) {
            formula = dotted_formula;
        } else {
            error_strings = cons($$$Invalid_dotted_list, error_strings);
        }
        if (mode == $DELETE) {
            ke_operation = list($UNASSERT, formula, mt);
        } else {
            ke_operation = list($ASSERT, formula, mt, strength, direction);
        }
        return values(ke_operation, error_strings, current_ist_sentence);
    }

    /**
     * The big function.  Parse through the lists in TOKEN-LISTS and create a list of ke-operation forms.
     *
     * @return 0 list ;; a list of ke operations
     * @return 1 list ;; a list of errors of form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING)
     * @param TOKEN-LISTS
     * 		list ;; a list of lists of tokens of form (FILENAME LINE-NUMBER-START LINE-NUMBER-END DIRECTIVE-LIST DATA-LIST)
     */
    @LispMethod(comment = "The big function.  Parse through the lists in TOKEN-LISTS and create a list of ke-operation forms.\r\n\r\n@return 0 list ;; a list of ke operations\r\n@return 1 list ;; a list of errors of form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING)\r\n@param TOKEN-LISTS\r\n\t\tlist ;; a list of lists of tokens of form (FILENAME LINE-NUMBER-START LINE-NUMBER-END DIRECTIVE-LIST DATA-LIST)")
    public static final SubLObject ke_text_token_lists_to_ke_operations_alt(SubLObject token_lists, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        if (killed_constant_names == UNPROVIDED) {
            killed_constant_names = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current_constant = NIL;
                SubLObject current_default_mt = NIL;
                SubLObject current_assert_mode = $ENTER;
                SubLObject next_assert_strength = NIL;
                SubLObject next_assert_direction = NIL;
                SubLObject current_mt = NIL;
                SubLObject ke_operations = NIL;
                SubLObject error_lists = NIL;
                SubLObject abortP = NIL;
                if (NIL == abortP) {
                    {
                        SubLObject csome_list_var = token_lists;
                        SubLObject token_list = NIL;
                        for (token_list = csome_list_var.first(); !((NIL != abortP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , token_list = csome_list_var.first()) {
                            {
                                SubLObject filename = token_list.first();
                                SubLObject line_number_start = second(token_list);
                                SubLObject line_number_end = third(token_list);
                                SubLObject directive_list = fourth(token_list);
                                SubLObject data_list = fifth(token_list);
                                SubLObject directive = com.cyc.cycjava.cycl.ke_text.ket_directive_list_to_directive(directive_list, new_constant_names);
                                if (length(error_lists).numG($ke_text_error_count_abort_num$.getDynamicValue(thread))) {
                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt1), error_lists);
                                    abortP = T;
                                }
                                if (NIL == directive) {
                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt37), error_lists);
                                } else {
                                    if (directive.isKeyword()) {
                                        {
                                            SubLObject pcase_var = directive;
                                            if (pcase_var.eql($FORMULA)) {
                                                {
                                                    SubLObject mt = com.cyc.cycjava.cycl.ke_text.ket_relevant_mt(current_mt, current_default_mt, new_constant_names);
                                                    SubLObject cdolist_list_var = data_list;
                                                    SubLObject formula = NIL;
                                                    for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                                                        if (NIL == formula) {
                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt39), error_lists);
                                                        } else {
                                                            if (formula.isAtom()) {
                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt40), error_lists);
                                                            } else {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject ke_operation = com.cyc.cycjava.cycl.ke_text.ket_make_ke_operation(formula, mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode);
                                                                    SubLObject error_strings = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    next_assert_strength = NIL;
                                                                    next_assert_direction = NIL;
                                                                    if (NIL != error_strings) {
                                                                        {
                                                                            SubLObject cdolist_list_var_1 = error_strings;
                                                                            SubLObject error_string = NIL;
                                                                            for (error_string = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , error_string = cdolist_list_var_1.first()) {
                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        ke_operations = cons(ke_operation, ke_operations);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($CONSTANT)) {
                                                    current_mt = NIL;
                                                    if (!data_list.isList()) {
                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt42), error_lists);
                                                    } else {
                                                        if (length(data_list).numG(ONE_INTEGER)) {
                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt43), error_lists);
                                                        } else {
                                                            {
                                                                SubLObject constant_thing = data_list.first();
                                                                if (NIL == constant_thing) {
                                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt42), error_lists);
                                                                } else {
                                                                    if (constant_thing.isList()) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject known_constant_thing = com.cyc.cycjava.cycl.ke_text.ket_unknown_to_known(constant_thing, new_constant_names, UNPROVIDED);
                                                                            SubLObject error_strings = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != error_strings) {
                                                                                {
                                                                                    SubLObject cdolist_list_var = error_strings;
                                                                                    SubLObject error_string = NIL;
                                                                                    for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                {
                                                                                    SubLObject possible_nat = narts_high.find_nart(known_constant_thing);
                                                                                    if (NIL != nart_handles.nart_p(possible_nat)) {
                                                                                        current_constant = constant_thing;
                                                                                    } else {
                                                                                        current_constant = constant_thing;
                                                                                        new_constant_names = cons(constant_thing, new_constant_names);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (constant_thing.isString()) {
                                                                            constant_thing = string_utilities.string_remove_constant_reader_prefix(constant_thing);
                                                                            if (NIL == constant_completion_high.valid_constant_name_p(constant_thing)) {
                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt44), error_lists);
                                                                            } else {
                                                                                {
                                                                                    SubLObject possible_constant = com.cyc.cycjava.cycl.ke_text.ket_maybe_find_constant(constant_thing);
                                                                                    if ((NIL != valid_constantP(possible_constant, UNPROVIDED)) && (NIL == subl_promotions.memberP(constants_high.constant_name(possible_constant), killed_constant_names, symbol_function(EQUAL), UNPROVIDED))) {
                                                                                        current_constant = possible_constant;
                                                                                    } else {
                                                                                        if (NIL != member(constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                            current_constant = com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(constant_thing);
                                                                                        } else {
                                                                                            ke_operations = cons(list($CREATE, constant_thing), ke_operations);
                                                                                            current_constant = com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(constant_thing);
                                                                                            new_constant_names = cons(constant_thing, new_constant_names);
                                                                                            killed_constant_names = remove(constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt46$Constant__Unrecognized_constant__, constant_thing)), error_lists);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (pcase_var.eql($KILL)) {
                                                        if (!data_list.isList()) {
                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt48), error_lists);
                                                        } else {
                                                            if (length(data_list).numG(ONE_INTEGER)) {
                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt49), error_lists);
                                                            } else {
                                                                {
                                                                    SubLObject constant_thing = data_list.first();
                                                                    SubLObject possible_constant = NIL;
                                                                    if (NIL == constant_thing) {
                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt48), error_lists);
                                                                    } else {
                                                                        if (constant_thing.isList()) {
                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt50), error_lists);
                                                                        } else {
                                                                            if (!constant_thing.isString()) {
                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt51), error_lists);
                                                                            } else {
                                                                                if (NIL != member(constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt52), error_lists);
                                                                                } else {
                                                                                    possible_constant = com.cyc.cycjava.cycl.ke_text.ket_maybe_find_constant(constant_thing);
                                                                                    if (NIL != constant_p(possible_constant)) {
                                                                                        ke_operations = cons(list($KILL, possible_constant), ke_operations);
                                                                                        killed_constant_names = cons(constants_high.constant_name(possible_constant), killed_constant_names);
                                                                                        new_constant_names = remove(constants_high.constant_name(possible_constant), new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        if (NIL != member(constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                            ke_operations = cons(list($KILL, com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(constant_thing)), ke_operations);
                                                                                            killed_constant_names = cons(new_constant_names, killed_constant_names);
                                                                                            new_constant_names = remove(constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt53$Kill__Unrecognized_constant___A_, constant_thing)), error_lists);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (pcase_var.eql($RENAME)) {
                                                            if (!data_list.isList()) {
                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt55), error_lists);
                                                            } else {
                                                                {
                                                                    SubLObject old_constant_thing = data_list.first();
                                                                    SubLObject possible_existing_old_constant = NIL;
                                                                    SubLObject new_constant_thing = second(data_list);
                                                                    SubLObject unquoted_new_constant_thing = NIL;
                                                                    SubLObject possible_existing_new_constant = NIL;
                                                                    SubLObject continue_counter = ZERO_INTEGER;
                                                                    if (NIL == old_constant_thing) {
                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt56), error_lists);
                                                                    } else {
                                                                        if (old_constant_thing.isList()) {
                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt57), error_lists);
                                                                        } else {
                                                                            if (!old_constant_thing.isString()) {
                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt58), error_lists);
                                                                            } else {
                                                                                if (NIL != member(old_constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt59$Rename__Can_t_rename_a_constant_r, old_constant_thing)), error_lists);
                                                                                } else {
                                                                                    possible_existing_old_constant = com.cyc.cycjava.cycl.ke_text.ket_maybe_find_constant(old_constant_thing);
                                                                                    continue_counter = add(continue_counter, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!new_constant_thing.isString()) {
                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt60), error_lists);
                                                                    } else {
                                                                        if (NIL == charE(CHAR_quotation, Strings.sublisp_char(new_constant_thing, ZERO_INTEGER))) {
                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt61), error_lists);
                                                                        } else {
                                                                            unquoted_new_constant_thing = string_utilities.string_remove_constant_reader_prefix(string_utilities.string_trim_symmetric_n($list_alt21, new_constant_thing, ONE_INTEGER));
                                                                            possible_existing_new_constant = com.cyc.cycjava.cycl.ke_text.ket_maybe_find_constant(unquoted_new_constant_thing);
                                                                            if (NIL == constant_completion_high.valid_constant_name_p(unquoted_new_constant_thing)) {
                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt62), error_lists);
                                                                            } else {
                                                                                if (NIL != member(unquoted_new_constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt63$Rename__Can_t_rename_to_constant_, unquoted_new_constant_thing)), error_lists);
                                                                                } else {
                                                                                    if ((NIL != valid_constantP(possible_existing_new_constant, UNPROVIDED)) && (NIL == subl_promotions.memberP(constants_high.constant_name(possible_existing_new_constant), killed_constant_names, symbol_function(EQUAL), UNPROVIDED))) {
                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt64$Rename__Can_t_rename_to_existing_, unquoted_new_constant_thing)), error_lists);
                                                                                    } else {
                                                                                        continue_counter = add(continue_counter, ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (continue_counter == TWO_INTEGER) {
                                                                        if (NIL != constant_p(possible_existing_old_constant)) {
                                                                            ke_operations = cons(list($RENAME, possible_existing_old_constant, unquoted_new_constant_thing), ke_operations);
                                                                            new_constant_names = cons(unquoted_new_constant_thing, new_constant_names);
                                                                            new_constant_names = remove(constants_high.constant_name(possible_existing_old_constant), new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            killed_constant_names = cons(constants_high.constant_name(possible_existing_old_constant), killed_constant_names);
                                                                            killed_constant_names = remove(unquoted_new_constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            if (possible_existing_old_constant == current_constant) {
                                                                                current_constant = com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(unquoted_new_constant_thing);
                                                                            }
                                                                        } else {
                                                                            if (NIL != member(old_constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                ke_operations = cons(list($RENAME, list($NEW_CONSTANT, old_constant_thing), unquoted_new_constant_thing), ke_operations);
                                                                                new_constant_names = remove(old_constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                new_constant_names = cons(unquoted_new_constant_thing, new_constant_names);
                                                                                killed_constant_names = cons(old_constant_thing, killed_constant_names);
                                                                                killed_constant_names = remove(unquoted_new_constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                if (NIL != list_utilities.tree_find(old_constant_thing, current_constant, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                    current_constant = com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(unquoted_new_constant_thing);
                                                                                }
                                                                            } else {
                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt66$Rename__Unrecognized_constant___A, old_constant_thing)), error_lists);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (pcase_var.eql($MERGE)) {
                                                                if (!data_list.isList()) {
                                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt68), error_lists);
                                                                } else {
                                                                    {
                                                                        SubLObject kill_fort_thing = data_list.first();
                                                                        SubLObject known_kill_fort_thing = NIL;
                                                                        SubLObject kill_fort = NIL;
                                                                        SubLObject keep_fort_thing = second(data_list);
                                                                        SubLObject known_keep_fort_thing = NIL;
                                                                        SubLObject keep_fort = NIL;
                                                                        SubLObject error_strings = NIL;
                                                                        SubLObject continue_counter = ZERO_INTEGER;
                                                                        if (NIL == kill_fort_thing) {
                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt69), error_lists);
                                                                        } else {
                                                                            if (NIL != member(kill_fort_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt70), error_lists);
                                                                            } else {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject known_kill_fort_thing_2 = com.cyc.cycjava.cycl.ke_text.ket_unknown_to_known(kill_fort_thing, new_constant_names, killed_constant_names);
                                                                                    SubLObject error_strings_3 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    known_kill_fort_thing = known_kill_fort_thing_2;
                                                                                    error_strings = error_strings_3;
                                                                                }
                                                                                kill_fort = ke_utilities.fort_from_string(known_kill_fort_thing);
                                                                                if (NIL != error_strings) {
                                                                                    {
                                                                                        SubLObject cdolist_list_var = error_strings;
                                                                                        SubLObject error_string = NIL;
                                                                                        for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (!((NIL != forts.fort_p(kill_fort)) || (NIL != member(kill_fort_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)))) {
                                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt71), error_lists);
                                                                                    } else {
                                                                                        continue_counter = add(continue_counter, ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (NIL == keep_fort_thing) {
                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt72), error_lists);
                                                                        } else {
                                                                            if (NIL != member(keep_fort_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt73), error_lists);
                                                                            } else {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject known_keep_fort_thing_4 = com.cyc.cycjava.cycl.ke_text.ket_unknown_to_known(keep_fort_thing, new_constant_names, killed_constant_names);
                                                                                    SubLObject error_strings_5 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    known_keep_fort_thing = known_keep_fort_thing_4;
                                                                                    error_strings = error_strings_5;
                                                                                }
                                                                                keep_fort = ke_utilities.fort_from_string(known_keep_fort_thing);
                                                                                if (NIL != error_strings) {
                                                                                    {
                                                                                        SubLObject cdolist_list_var = error_strings;
                                                                                        SubLObject error_string = NIL;
                                                                                        for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (!((NIL != forts.fort_p(keep_fort)) || (NIL != member(keep_fort_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)))) {
                                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt74), error_lists);
                                                                                    } else {
                                                                                        continue_counter = add(continue_counter, ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (continue_counter == TWO_INTEGER) {
                                                                            new_constant_names = remove(kill_fort_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            killed_constant_names = cons(kill_fort_thing, killed_constant_names);
                                                                            if (NIL != forts.fort_p(kill_fort)) {
                                                                                if (NIL != forts.fort_p(keep_fort)) {
                                                                                    ke_operations = cons(list($MERGE, kill_fort, keep_fort), ke_operations);
                                                                                } else {
                                                                                    ke_operations = cons(list($MERGE, kill_fort, com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(keep_fort_thing)), ke_operations);
                                                                                }
                                                                            } else {
                                                                                if (NIL != forts.fort_p(keep_fort)) {
                                                                                    ke_operations = cons(list($MERGE, com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(kill_fort_thing), keep_fort), ke_operations);
                                                                                } else {
                                                                                    ke_operations = cons(list($MERGE, com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(kill_fort_thing), com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(keep_fort_thing)), ke_operations);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (pcase_var.eql($ENTER)) {
                                                                    current_assert_mode = $ENTER;
                                                                } else {
                                                                    if (pcase_var.eql($DELETE)) {
                                                                        current_assert_mode = $DELETE;
                                                                    } else {
                                                                        if (pcase_var.eql($IN_MT)) {
                                                                            if (!data_list.isList()) {
                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt76), error_lists);
                                                                            } else {
                                                                                {
                                                                                    SubLObject mt_thing = data_list.first();
                                                                                    if (NIL == mt_thing) {
                                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt76), error_lists);
                                                                                    } else {
                                                                                        if (mt_thing.isList()) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject known_mt_thing = com.cyc.cycjava.cycl.ke_text.ket_unknown_to_known(mt_thing, new_constant_names, killed_constant_names);
                                                                                                SubLObject error_strings = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != error_strings) {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var = error_strings;
                                                                                                        SubLObject error_string = NIL;
                                                                                                        for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    {
                                                                                                        SubLObject possible_nat_mt = narts_high.find_nart(known_mt_thing);
                                                                                                        if (NIL != nart_handles.nart_p(possible_nat_mt)) {
                                                                                                            known_mt_thing = possible_nat_mt;
                                                                                                        }
                                                                                                        current_mt = known_mt_thing;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (NIL != constant_p(mt_thing)) {
                                                                                                current_mt = mt_thing;
                                                                                            } else {
                                                                                                if (mt_thing.isString()) {
                                                                                                    {
                                                                                                        SubLObject possible_mt = com.cyc.cycjava.cycl.ke_text.ket_maybe_find_constant(mt_thing);
                                                                                                        if (NIL != valid_constantP(possible_mt, UNPROVIDED)) {
                                                                                                            current_mt = possible_mt;
                                                                                                        } else {
                                                                                                            if (NIL != subl_promotions.memberP(mt_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                                                current_mt = com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(mt_thing);
                                                                                                            } else {
                                                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt78$In_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt78$In_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (pcase_var.eql($DEFAULT_MT)) {
                                                                                if (!data_list.isList()) {
                                                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt80), error_lists);
                                                                                } else {
                                                                                    {
                                                                                        SubLObject mt_thing = data_list.first();
                                                                                        if (NIL == mt_thing) {
                                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt80), error_lists);
                                                                                        } else {
                                                                                            if (mt_thing.isList()) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject known_mt_thing = com.cyc.cycjava.cycl.ke_text.ket_unknown_to_known(mt_thing, new_constant_names, killed_constant_names);
                                                                                                    SubLObject error_strings = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != error_strings) {
                                                                                                        {
                                                                                                            SubLObject cdolist_list_var = error_strings;
                                                                                                            SubLObject error_string = NIL;
                                                                                                            for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        {
                                                                                                            SubLObject possible_nat_mt = narts_high.find_nart(known_mt_thing);
                                                                                                            if (NIL != nart_handles.nart_p(possible_nat_mt)) {
                                                                                                                known_mt_thing = possible_nat_mt;
                                                                                                            }
                                                                                                            current_mt = NIL;
                                                                                                            current_default_mt = known_mt_thing;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != constant_p(mt_thing)) {
                                                                                                    current_mt = NIL;
                                                                                                    current_default_mt = mt_thing;
                                                                                                } else {
                                                                                                    if (mt_thing.isString()) {
                                                                                                        {
                                                                                                            SubLObject possible_mt = com.cyc.cycjava.cycl.ke_text.ket_maybe_find_constant(mt_thing);
                                                                                                            if (NIL != valid_constantP(possible_mt, UNPROVIDED)) {
                                                                                                                current_mt = NIL;
                                                                                                                current_default_mt = possible_mt;
                                                                                                            } else {
                                                                                                                if (NIL != subl_promotions.memberP(mt_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                                                    current_mt = NIL;
                                                                                                                    current_default_mt = com.cyc.cycjava.cycl.ke_text.make_new_constant_wrapper(mt_thing);
                                                                                                                } else {
                                                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt82$Default_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt82$Default_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (pcase_var.eql($STRENGTH)) {
                                                                                    if (!data_list.isList()) {
                                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt84), error_lists);
                                                                                    } else {
                                                                                        {
                                                                                            SubLObject strength_keyword = com.cyc.cycjava.cycl.ke_text.ket_lookup_string(data_list, $ket_string_to_strength$.getDynamicValue(thread));
                                                                                            if (NIL == strength_keyword) {
                                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt84), error_lists);
                                                                                            } else {
                                                                                                if (strength_keyword.isKeyword()) {
                                                                                                    next_assert_strength = strength_keyword;
                                                                                                } else {
                                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt85$Strength__Unrecognized_strength__, data_list)), error_lists);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (pcase_var.eql($DIRECTION)) {
                                                                                        if (!data_list.isList()) {
                                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt87), error_lists);
                                                                                        } else {
                                                                                            {
                                                                                                SubLObject direction_keyword = com.cyc.cycjava.cycl.ke_text.ket_lookup_string(data_list, $ket_string_to_direction$.getDynamicValue(thread));
                                                                                                if (NIL == direction_keyword) {
                                                                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt87), error_lists);
                                                                                                } else {
                                                                                                    if (direction_keyword.isKeyword()) {
                                                                                                        next_assert_direction = direction_keyword;
                                                                                                    } else {
                                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt88$Direction__Unrecognized_direction, data_list)), error_lists);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (pcase_var.eql($INCLUDE)) {
                                                                                            if (!data_list.isList()) {
                                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt90), error_lists);
                                                                                            } else {
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = data_list;
                                                                                                    SubLObject include_data = NIL;
                                                                                                    for (include_data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , include_data = cdolist_list_var.first()) {
                                                                                                        {
                                                                                                            SubLObject include_filename = string_utilities.string_trim_symmetric_n($list_alt21, include_data, ONE_INTEGER);
                                                                                                            if (!include_data.isString()) {
                                                                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt90), error_lists);
                                                                                                            } else {
                                                                                                                if ((NIL == filename) && (NIL == file_utilities.absolute_pathP(include_filename))) {
                                                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt91$Include__File_not_found___A___Can, include_filename)), error_lists);
                                                                                                                } else {
                                                                                                                    {
                                                                                                                        SubLObject include_filename_absolute = file_utilities.make_path_absolute_relative_to(filename, include_filename);
                                                                                                                        if (NIL == Filesys.probe_file(include_filename_absolute)) {
                                                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt92$Include__File_not_found___A____A_, include_filename_absolute, file_utilities.why_not_probe_fileP(include_filename_absolute))), error_lists);
                                                                                                                        } else {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject new_ke_text_list = com.cyc.cycjava.cycl.ke_text.ke_text_file_to_ke_text_list(include_filename_absolute);
                                                                                                                                SubLObject new_error_lists = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != new_error_lists) {
                                                                                                                                    error_lists = append(nreverse(new_error_lists), error_lists);
                                                                                                                                } else {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject new_ke_operations = com.cyc.cycjava.cycl.ke_text.ke_text_list_to_ke_operations(new_ke_text_list, include_filename_absolute, new_constant_names, killed_constant_names);
                                                                                                                                        SubLObject new_error_lists_6 = thread.secondMultipleValue();
                                                                                                                                        SubLObject new_new_constant_names = thread.thirdMultipleValue();
                                                                                                                                        SubLObject new_killed_constant_names = thread.fourthMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        new_constant_names = new_new_constant_names;
                                                                                                                                        killed_constant_names = new_killed_constant_names;
                                                                                                                                        ke_operations = append(nreverse(new_ke_operations), ke_operations);
                                                                                                                                        if (NIL != new_error_lists_6) {
                                                                                                                                            error_lists = append(nreverse(new_error_lists_6), error_lists);
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
                                    } else {
                                        if (directive.isString() && (NIL == subl_promotions.memberP(directive, new_constant_names, symbol_function($sym93$STRING_), UNPROVIDED))) {
                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt94), error_lists);
                                        } else {
                                            if (directive.isList() && (NIL == com.cyc.cycjava.cycl.ke_text.new_constant_wrapperp(directive))) {
                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list_alt95), error_lists);
                                            } else {
                                                {
                                                    SubLObject known_arity = (NIL != fort_types_interface.predicateP(directive)) ? ((SubLObject) (arity.arity(directive))) : NIL;
                                                    SubLObject mt = com.cyc.cycjava.cycl.ke_text.ket_relevant_mt(current_mt, current_default_mt, new_constant_names);
                                                    {
                                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                            known_arity = (NIL != fort_types_interface.predicateP(directive)) ? ((SubLObject) (arity.arity(directive))) : NIL;
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                    if (NIL == current_constant) {
                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $$$Constant_must_be_specified, directive)), error_lists);
                                                    } else {
                                                        if (ONE_INTEGER == known_arity) {
                                                            if (NIL == data_list) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject ke_operation = com.cyc.cycjava.cycl.ke_text.ket_make_ke_operation(list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode);
                                                                    SubLObject error_strings = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    next_assert_strength = NIL;
                                                                    next_assert_direction = NIL;
                                                                    if (NIL != error_strings) {
                                                                        {
                                                                            SubLObject cdolist_list_var = error_strings;
                                                                            SubLObject error_string = NIL;
                                                                            for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        ke_operations = cons(ke_operation, ke_operations);
                                                                    }
                                                                }
                                                            } else {
                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt99$Unexpected_argument_to_unary_pred, directive)), error_lists);
                                                            }
                                                        } else {
                                                            if (TWO_INTEGER == known_arity) {
                                                                {
                                                                    SubLObject cdolist_list_var = data_list;
                                                                    SubLObject formula_arg3 = NIL;
                                                                    for (formula_arg3 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_arg3 = cdolist_list_var.first()) {
                                                                        if (NIL == formula_arg3) {
                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt100$No_argument_found_for_binary_pred, directive)), error_lists);
                                                                        } else {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject ke_operation = com.cyc.cycjava.cycl.ke_text.ket_make_ke_operation(list(directive, current_constant, formula_arg3), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode);
                                                                                SubLObject error_strings = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                next_assert_strength = NIL;
                                                                                next_assert_direction = NIL;
                                                                                if (NIL != error_strings) {
                                                                                    {
                                                                                        SubLObject cdolist_list_var_7 = error_strings;
                                                                                        SubLObject error_string = NIL;
                                                                                        for (error_string = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , error_string = cdolist_list_var_7.first()) {
                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    ke_operations = cons(ke_operation, ke_operations);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (known_arity.isInteger() && known_arity.numGE(THREE_INTEGER)) {
                                                                    {
                                                                        SubLObject cdolist_list_var = data_list;
                                                                        SubLObject formula_rest_rest = NIL;
                                                                        for (formula_rest_rest = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_rest_rest = cdolist_list_var.first()) {
                                                                            if (NIL == formula_rest_rest) {
                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt101$No_argument_found_for_arity__A_pr, known_arity, directive)), error_lists);
                                                                            } else {
                                                                                if (formula_rest_rest.isAtom()) {
                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt102$List_argument_expected_for_arity_, known_arity, directive)), error_lists);
                                                                                } else {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject ke_operation = com.cyc.cycjava.cycl.ke_text.ket_make_ke_operation(listS(directive, current_constant, append(formula_rest_rest, NIL)), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode);
                                                                                        SubLObject error_strings = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        next_assert_strength = NIL;
                                                                                        next_assert_direction = NIL;
                                                                                        if (NIL != error_strings) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var_8 = error_strings;
                                                                                                SubLObject error_string = NIL;
                                                                                                for (error_string = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , error_string = cdolist_list_var_8.first()) {
                                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            ke_operations = cons(ke_operation, ke_operations);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (NIL == data_list) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject ke_operation = com.cyc.cycjava.cycl.ke_text.ket_make_ke_operation(list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode);
                                                                            SubLObject error_strings = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            next_assert_strength = NIL;
                                                                            next_assert_direction = NIL;
                                                                            if (NIL != error_strings) {
                                                                                {
                                                                                    SubLObject cdolist_list_var = error_strings;
                                                                                    SubLObject error_string = NIL;
                                                                                    for (error_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_string = cdolist_list_var.first()) {
                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                ke_operations = cons(ke_operation, ke_operations);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        {
                                                                            SubLObject cdolist_list_var = data_list;
                                                                            SubLObject formula_args = NIL;
                                                                            for (formula_args = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_args = cdolist_list_var.first()) {
                                                                                if (NIL == formula_args) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject ke_operation = com.cyc.cycjava.cycl.ke_text.ket_make_ke_operation(list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode);
                                                                                        SubLObject error_strings = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        next_assert_strength = NIL;
                                                                                        next_assert_direction = NIL;
                                                                                        if (NIL != error_strings) {
                                                                                            {
                                                                                                SubLObject cdolist_list_var_9 = error_strings;
                                                                                                SubLObject error_string = NIL;
                                                                                                for (error_string = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , error_string = cdolist_list_var_9.first()) {
                                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            ke_operations = cons(ke_operation, ke_operations);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (formula_args.isAtom()) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject ke_operation = com.cyc.cycjava.cycl.ke_text.ket_make_ke_operation(list(directive, current_constant, formula_args), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode);
                                                                                            SubLObject error_strings = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            next_assert_strength = NIL;
                                                                                            next_assert_direction = NIL;
                                                                                            if (NIL != error_strings) {
                                                                                                {
                                                                                                    SubLObject cdolist_list_var_10 = error_strings;
                                                                                                    SubLObject error_string = NIL;
                                                                                                    for (error_string = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , error_string = cdolist_list_var_10.first()) {
                                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                ke_operations = cons(ke_operation, ke_operations);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (NIL != list(formula_args)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject ke_operation = com.cyc.cycjava.cycl.ke_text.ket_make_ke_operation(listS(directive, current_constant, append(formula_args, NIL)), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode);
                                                                                                SubLObject error_strings = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                next_assert_strength = NIL;
                                                                                                next_assert_direction = NIL;
                                                                                                if (NIL != error_strings) {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_11 = error_strings;
                                                                                                        SubLObject error_string = NIL;
                                                                                                        for (error_string = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , error_string = cdolist_list_var_11.first()) {
                                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    ke_operations = cons(ke_operation, ke_operations);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str_alt103$Unexpected_argument_for_predicate, directive)), error_lists);
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
                                    }
                                }
                            }
                        }
                    }
                }
                return values(nreverse(ke_operations), nreverse(error_lists), new_constant_names, killed_constant_names);
            }
        }
    }

    /**
     * The big function.  Parse through the lists in TOKEN-LISTS and create a list of ke-operation forms.
     *
     * @return 0 list ;; a list of ke operations
     * @return 1 list ;; a list of errors of form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING)
     * @param TOKEN-LISTS
     * 		list ;; a list of lists of tokens of form (FILENAME LINE-NUMBER-START LINE-NUMBER-END DIRECTIVE-LIST DATA-LIST)
     */
    @LispMethod(comment = "The big function.  Parse through the lists in TOKEN-LISTS and create a list of ke-operation forms.\r\n\r\n@return 0 list ;; a list of ke operations\r\n@return 1 list ;; a list of errors of form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING)\r\n@param TOKEN-LISTS\r\n\t\tlist ;; a list of lists of tokens of form (FILENAME LINE-NUMBER-START LINE-NUMBER-END DIRECTIVE-LIST DATA-LIST)")
    public static SubLObject ke_text_token_lists_to_ke_operations(final SubLObject token_lists, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        if (killed_constant_names == UNPROVIDED) {
            killed_constant_names = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_constant = NIL;
        SubLObject current_default_mt = NIL;
        SubLObject current_ist_sentence = NIL;
        SubLObject current_assert_mode = $ENTER;
        SubLObject next_assert_strength = NIL;
        SubLObject next_assert_direction = NIL;
        SubLObject current_mt = NIL;
        SubLObject ke_operations = NIL;
        SubLObject error_lists = NIL;
        SubLObject abortP = NIL;
        if (NIL == abortP) {
            SubLObject csome_list_var = token_lists;
            SubLObject token_list = NIL;
            token_list = csome_list_var.first();
            while ((NIL == abortP) && (NIL != csome_list_var)) {
                final SubLObject filename = token_list.first();
                final SubLObject line_number_start = second(token_list);
                final SubLObject line_number_end = third(token_list);
                final SubLObject directive_list = fourth(token_list);
                final SubLObject data_list = fifth(token_list);
                final SubLObject directive = ket_directive_list_to_directive(directive_list, new_constant_names);
                if (length(error_lists).numG($ke_text_error_count_abort_num$.getDynamicValue(thread))) {
                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list9), error_lists);
                    abortP = T;
                }
                if (NIL == directive) {
                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list48), error_lists);
                } else
                    if (directive.isKeyword()) {
                        final SubLObject pcase_var = directive;
                        if (pcase_var.eql($FORMULA)) {
                            final SubLObject mt = ket_relevant_mt(current_mt, current_default_mt, new_constant_names);
                            SubLObject cdolist_list_var = data_list;
                            SubLObject formula = NIL;
                            formula = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (NIL == formula) {
                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list50), error_lists);
                                } else
                                    if ((formula.isAtom() && (NIL == Strings.stringE(formula, $str41$__TheAssertionSentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == Strings.stringE(formula, $$$TheAssertionSentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list51), error_lists);
                                    } else {
                                        thread.resetMultipleValues();
                                        final SubLObject ke_operation = ket_make_ke_operation(formula, mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                        final SubLObject error_strings = thread.secondMultipleValue();
                                        final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        current_ist_sentence = next_ist_sentence;
                                        next_assert_strength = NIL;
                                        next_assert_direction = NIL;
                                        if (NIL != error_strings) {
                                            SubLObject cdolist_list_var_$1 = error_strings;
                                            SubLObject error_string = NIL;
                                            error_string = cdolist_list_var_$1.first();
                                            while (NIL != cdolist_list_var_$1) {
                                                error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                                error_string = cdolist_list_var_$1.first();
                                            } 
                                        } else {
                                            ke_operations = cons(ke_operation, ke_operations);
                                        }
                                    }

                                cdolist_list_var = cdolist_list_var.rest();
                                formula = cdolist_list_var.first();
                            } 
                        } else
                            if (pcase_var.eql($CONSTANT)) {
                                current_mt = NIL;
                                if (!data_list.isList()) {
                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list53), error_lists);
                                } else
                                    if (length(data_list).numG(ONE_INTEGER)) {
                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list54), error_lists);
                                    } else {
                                        SubLObject constant_thing = data_list.first();
                                        if (NIL == constant_thing) {
                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list53), error_lists);
                                        } else
                                            if (constant_thing.isList()) {
                                                thread.resetMultipleValues();
                                                final SubLObject known_constant_thing = ket_unknown_to_known(constant_thing, new_constant_names, UNPROVIDED);
                                                final SubLObject error_strings2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != error_strings2) {
                                                    SubLObject cdolist_list_var2 = error_strings2;
                                                    SubLObject error_string2 = NIL;
                                                    error_string2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        error_lists = cons(list(filename, line_number_start, line_number_end, error_string2), error_lists);
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        error_string2 = cdolist_list_var2.first();
                                                    } 
                                                } else {
                                                    final SubLObject possible_nat = narts_high.find_nart(known_constant_thing);
                                                    if (NIL != nart_handles.nart_p(possible_nat)) {
                                                        current_constant = constant_thing;
                                                    } else {
                                                        current_constant = constant_thing;
                                                        new_constant_names = cons(constant_thing, new_constant_names);
                                                    }
                                                }
                                            } else
                                                if (constant_thing.isString()) {
                                                    constant_thing = string_utilities.string_remove_constant_reader_prefix(constant_thing);
                                                    if (NIL == constant_completion_high.valid_constant_name_p(constant_thing)) {
                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list55), error_lists);
                                                    } else
                                                        if ((NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) && (NIL != constant_completion_high.constant_name_case_collision(constant_thing))) {
                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str56$Constant__Constant_already_exists, constant_completion_high.constant_name_case_collision(constant_thing))), error_lists);
                                                        } else {
                                                            final SubLObject possible_constant = ket_maybe_find_constant(constant_thing);
                                                            if (NIL != member(constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                current_constant = make_new_constant_wrapper(constant_thing);
                                                            } else
                                                                if ((NIL != valid_constantP(possible_constant, UNPROVIDED)) && (NIL == subl_promotions.memberP(constants_high.constant_name(possible_constant), killed_constant_names, symbol_function(EQUAL), UNPROVIDED))) {
                                                                    current_constant = possible_constant;
                                                                } else {
                                                                    ke_operations = cons(list($CREATE, constant_thing), ke_operations);
                                                                    current_constant = make_new_constant_wrapper(constant_thing);
                                                                    new_constant_names = cons(constant_thing, new_constant_names);
                                                                    killed_constant_names = remove(constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }

                                                        }

                                                } else {
                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str58$Constant__Unrecognized_constant__, constant_thing)), error_lists);
                                                }


                                    }

                            } else
                                if (pcase_var.eql($KILL)) {
                                    if (!data_list.isList()) {
                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list60), error_lists);
                                    } else
                                        if (length(data_list).numG(ONE_INTEGER)) {
                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list61), error_lists);
                                        } else {
                                            final SubLObject constant_thing = data_list.first();
                                            SubLObject possible_constant = NIL;
                                            if (NIL == constant_thing) {
                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list60), error_lists);
                                            } else
                                                if (constant_thing.isList()) {
                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list62), error_lists);
                                                } else
                                                    if (!constant_thing.isString()) {
                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list63), error_lists);
                                                    } else
                                                        if (NIL != member(constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list64), error_lists);
                                                        } else {
                                                            possible_constant = ket_maybe_find_constant(constant_thing);
                                                            if (NIL != member(constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                ke_operations = cons(list($KILL, make_new_constant_wrapper(constant_thing)), ke_operations);
                                                                killed_constant_names = cons(new_constant_names, killed_constant_names);
                                                                new_constant_names = remove(constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (NIL != constant_p(possible_constant)) {
                                                                    ke_operations = cons(list($KILL, possible_constant), ke_operations);
                                                                    killed_constant_names = cons(constants_high.constant_name(possible_constant), killed_constant_names);
                                                                    new_constant_names = remove(constants_high.constant_name(possible_constant), new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }

                                                        }



                                        }

                                } else
                                    if (pcase_var.eql($RENAME)) {
                                        if (!data_list.isList()) {
                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list66), error_lists);
                                        } else {
                                            final SubLObject old_constant_thing = data_list.first();
                                            SubLObject possible_existing_old_constant = NIL;
                                            final SubLObject new_constant_thing = second(data_list);
                                            SubLObject unquoted_new_constant_thing = NIL;
                                            SubLObject possible_existing_new_constant = NIL;
                                            SubLObject continue_counter = ZERO_INTEGER;
                                            if (NIL == old_constant_thing) {
                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list67), error_lists);
                                            } else
                                                if (old_constant_thing.isList()) {
                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list68), error_lists);
                                                } else
                                                    if (!old_constant_thing.isString()) {
                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list69), error_lists);
                                                    } else
                                                        if (NIL != member(old_constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str70$Rename__Can_t_rename_a_constant_r, old_constant_thing)), error_lists);
                                                        } else {
                                                            possible_existing_old_constant = ket_maybe_find_constant(old_constant_thing);
                                                            continue_counter = add(continue_counter, ONE_INTEGER);
                                                        }



                                            if (!new_constant_thing.isString()) {
                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list71), error_lists);
                                            } else
                                                if (NIL == charE(CHAR_quotation, Strings.sublisp_char(new_constant_thing, ZERO_INTEGER))) {
                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list72), error_lists);
                                                } else {
                                                    unquoted_new_constant_thing = string_utilities.string_remove_constant_reader_prefix(string_utilities.string_trim_symmetric_n($list29, new_constant_thing, ONE_INTEGER));
                                                    possible_existing_new_constant = ket_maybe_find_constant(unquoted_new_constant_thing);
                                                    if (NIL == constant_completion_high.valid_constant_name_p(unquoted_new_constant_thing)) {
                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list73), error_lists);
                                                    } else
                                                        if (NIL != member(unquoted_new_constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str74$Rename__Can_t_rename_to_constant_, unquoted_new_constant_thing)), error_lists);
                                                        } else
                                                            if ((NIL != valid_constantP(possible_existing_new_constant, UNPROVIDED)) && (NIL == subl_promotions.memberP(constants_high.constant_name(possible_existing_new_constant), killed_constant_names, symbol_function(EQUAL), UNPROVIDED))) {
                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str75$Rename__Can_t_rename_to_existing_, unquoted_new_constant_thing)), error_lists);
                                                            } else {
                                                                continue_counter = add(continue_counter, ONE_INTEGER);
                                                            }


                                                }

                                            if (continue_counter.eql(TWO_INTEGER)) {
                                                if (NIL != constant_p(possible_existing_old_constant)) {
                                                    ke_operations = cons(list($RENAME, possible_existing_old_constant, unquoted_new_constant_thing), ke_operations);
                                                    new_constant_names = cons(unquoted_new_constant_thing, new_constant_names);
                                                    new_constant_names = remove(constants_high.constant_name(possible_existing_old_constant), new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    killed_constant_names = cons(constants_high.constant_name(possible_existing_old_constant), killed_constant_names);
                                                    killed_constant_names = remove(unquoted_new_constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    if (possible_existing_old_constant.eql(current_constant)) {
                                                        current_constant = make_new_constant_wrapper(unquoted_new_constant_thing);
                                                    }
                                                } else
                                                    if (NIL != member(old_constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                        ke_operations = cons(list($RENAME, list($NEW_CONSTANT, old_constant_thing), unquoted_new_constant_thing), ke_operations);
                                                        new_constant_names = remove(old_constant_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        new_constant_names = cons(unquoted_new_constant_thing, new_constant_names);
                                                        killed_constant_names = cons(old_constant_thing, killed_constant_names);
                                                        killed_constant_names = remove(unquoted_new_constant_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        if (NIL != list_utilities.tree_find(old_constant_thing, current_constant, symbol_function(EQUAL), UNPROVIDED)) {
                                                            current_constant = make_new_constant_wrapper(unquoted_new_constant_thing);
                                                        }
                                                    } else {
                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str77$Rename__Unrecognized_constant___A, old_constant_thing)), error_lists);
                                                    }

                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($MERGE)) {
                                            if (!data_list.isList()) {
                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list79), error_lists);
                                            } else {
                                                final SubLObject kill_fort_thing = data_list.first();
                                                SubLObject known_kill_fort_thing = NIL;
                                                SubLObject kill_fort = NIL;
                                                final SubLObject keep_fort_thing = second(data_list);
                                                SubLObject known_keep_fort_thing = NIL;
                                                SubLObject keep_fort = NIL;
                                                SubLObject error_strings3 = NIL;
                                                SubLObject continue_counter2 = ZERO_INTEGER;
                                                if (NIL == kill_fort_thing) {
                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list80), error_lists);
                                                } else
                                                    if (NIL != member(kill_fort_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list81), error_lists);
                                                    } else {
                                                        thread.resetMultipleValues();
                                                        final SubLObject known_kill_fort_thing_$2 = ket_unknown_to_known(kill_fort_thing, new_constant_names, killed_constant_names);
                                                        final SubLObject error_strings_$3 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        known_kill_fort_thing = known_kill_fort_thing_$2;
                                                        error_strings3 = error_strings_$3;
                                                        kill_fort = ke_utilities.fort_from_string(known_kill_fort_thing);
                                                        if (NIL != error_strings3) {
                                                            SubLObject cdolist_list_var3 = error_strings3;
                                                            SubLObject error_string3 = NIL;
                                                            error_string3 = cdolist_list_var3.first();
                                                            while (NIL != cdolist_list_var3) {
                                                                error_lists = cons(list(filename, line_number_start, line_number_end, error_string3), error_lists);
                                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                                error_string3 = cdolist_list_var3.first();
                                                            } 
                                                        } else
                                                            if ((NIL == forts.fort_p(kill_fort)) && (NIL == member(kill_fort_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED))) {
                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list82), error_lists);
                                                            } else {
                                                                continue_counter2 = add(continue_counter2, ONE_INTEGER);
                                                            }

                                                    }

                                                if (NIL == keep_fort_thing) {
                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list83), error_lists);
                                                } else
                                                    if (NIL != member(keep_fort_thing, killed_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list84), error_lists);
                                                    } else {
                                                        thread.resetMultipleValues();
                                                        final SubLObject known_keep_fort_thing_$4 = ket_unknown_to_known(keep_fort_thing, new_constant_names, killed_constant_names);
                                                        final SubLObject error_strings_$4 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        known_keep_fort_thing = known_keep_fort_thing_$4;
                                                        error_strings3 = error_strings_$4;
                                                        keep_fort = ke_utilities.fort_from_string(known_keep_fort_thing);
                                                        if (NIL != error_strings3) {
                                                            SubLObject cdolist_list_var3 = error_strings3;
                                                            SubLObject error_string3 = NIL;
                                                            error_string3 = cdolist_list_var3.first();
                                                            while (NIL != cdolist_list_var3) {
                                                                error_lists = cons(list(filename, line_number_start, line_number_end, error_string3), error_lists);
                                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                                error_string3 = cdolist_list_var3.first();
                                                            } 
                                                        } else
                                                            if ((NIL == forts.fort_p(keep_fort)) && (NIL == member(keep_fort_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED))) {
                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list85), error_lists);
                                                            } else {
                                                                continue_counter2 = add(continue_counter2, ONE_INTEGER);
                                                            }

                                                    }

                                                if (continue_counter2.eql(TWO_INTEGER)) {
                                                    new_constant_names = remove(kill_fort_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    killed_constant_names = cons(kill_fort_thing, killed_constant_names);
                                                    if (NIL != forts.fort_p(kill_fort)) {
                                                        if (NIL != forts.fort_p(keep_fort)) {
                                                            ke_operations = cons(list($MERGE, kill_fort, keep_fort), ke_operations);
                                                        } else {
                                                            ke_operations = cons(list($MERGE, kill_fort, make_new_constant_wrapper(keep_fort_thing)), ke_operations);
                                                        }
                                                    } else
                                                        if (NIL != forts.fort_p(keep_fort)) {
                                                            ke_operations = cons(list($MERGE, make_new_constant_wrapper(kill_fort_thing), keep_fort), ke_operations);
                                                        } else {
                                                            ke_operations = cons(list($MERGE, make_new_constant_wrapper(kill_fort_thing), make_new_constant_wrapper(keep_fort_thing)), ke_operations);
                                                        }

                                                }
                                            }
                                        } else
                                            if (pcase_var.eql($ENTER)) {
                                                current_assert_mode = $ENTER;
                                            } else
                                                if (pcase_var.eql($DELETE)) {
                                                    current_assert_mode = $DELETE;
                                                } else
                                                    if (pcase_var.eql($IN_MT)) {
                                                        if (!data_list.isList()) {
                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list87), error_lists);
                                                        } else {
                                                            final SubLObject mt_thing = data_list.first();
                                                            if (NIL == mt_thing) {
                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list87), error_lists);
                                                            } else
                                                                if (mt_thing.isList()) {
                                                                    thread.resetMultipleValues();
                                                                    SubLObject known_mt_thing = ket_unknown_to_known(mt_thing, new_constant_names, killed_constant_names);
                                                                    final SubLObject error_strings2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != error_strings2) {
                                                                        SubLObject cdolist_list_var2 = error_strings2;
                                                                        SubLObject error_string2 = NIL;
                                                                        error_string2 = cdolist_list_var2.first();
                                                                        while (NIL != cdolist_list_var2) {
                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string2), error_lists);
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            error_string2 = cdolist_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        final SubLObject possible_nat_mt = narts_high.find_nart(known_mt_thing);
                                                                        if (NIL != nart_handles.nart_p(possible_nat_mt)) {
                                                                            known_mt_thing = possible_nat_mt;
                                                                        }
                                                                        current_mt = known_mt_thing;
                                                                    }
                                                                } else
                                                                    if (NIL != constant_p(mt_thing)) {
                                                                        current_mt = mt_thing;
                                                                    } else
                                                                        if (mt_thing.isString()) {
                                                                            final SubLObject possible_mt = ket_maybe_find_constant(mt_thing);
                                                                            if (NIL != valid_constantP(possible_mt, UNPROVIDED)) {
                                                                                current_mt = possible_mt;
                                                                            } else
                                                                                if (NIL != subl_promotions.memberP(mt_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                    current_mt = make_new_constant_wrapper(mt_thing);
                                                                                } else {
                                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str89$In_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                                                                }

                                                                        } else {
                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str89$In_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                                                        }



                                                        }
                                                    } else
                                                        if (pcase_var.eql($DEFAULT_MT)) {
                                                            if (!data_list.isList()) {
                                                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list91), error_lists);
                                                            } else {
                                                                final SubLObject mt_thing = data_list.first();
                                                                if (NIL == mt_thing) {
                                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list91), error_lists);
                                                                } else
                                                                    if (mt_thing.isList()) {
                                                                        thread.resetMultipleValues();
                                                                        SubLObject known_mt_thing = ket_unknown_to_known(mt_thing, new_constant_names, killed_constant_names);
                                                                        final SubLObject error_strings2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != error_strings2) {
                                                                            SubLObject cdolist_list_var2 = error_strings2;
                                                                            SubLObject error_string2 = NIL;
                                                                            error_string2 = cdolist_list_var2.first();
                                                                            while (NIL != cdolist_list_var2) {
                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, error_string2), error_lists);
                                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                                error_string2 = cdolist_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            final SubLObject possible_nat_mt = narts_high.find_nart(known_mt_thing);
                                                                            if (NIL != nart_handles.nart_p(possible_nat_mt)) {
                                                                                known_mt_thing = possible_nat_mt;
                                                                            }
                                                                            current_mt = NIL;
                                                                            current_default_mt = known_mt_thing;
                                                                        }
                                                                    } else
                                                                        if (NIL != constant_p(mt_thing)) {
                                                                            current_mt = NIL;
                                                                            current_default_mt = mt_thing;
                                                                        } else
                                                                            if (mt_thing.isString()) {
                                                                                final SubLObject possible_mt = ket_maybe_find_constant(mt_thing);
                                                                                if (NIL != valid_constantP(possible_mt, UNPROVIDED)) {
                                                                                    current_mt = NIL;
                                                                                    current_default_mt = possible_mt;
                                                                                } else
                                                                                    if (NIL != subl_promotions.memberP(mt_thing, new_constant_names, symbol_function(EQUAL), UNPROVIDED)) {
                                                                                        current_mt = NIL;
                                                                                        current_default_mt = make_new_constant_wrapper(mt_thing);
                                                                                    } else {
                                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str93$Default_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                                                                    }

                                                                            } else {
                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str93$Default_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                                                            }



                                                            }
                                                        } else
                                                            if (pcase_var.eql($STRENGTH)) {
                                                                if (!data_list.isList()) {
                                                                    error_lists = cons(listS(filename, line_number_start, line_number_end, $list95), error_lists);
                                                                } else {
                                                                    final SubLObject strength_keyword = ket_lookup_string(data_list, $ket_string_to_strength$.getDynamicValue(thread));
                                                                    if (NIL == strength_keyword) {
                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list95), error_lists);
                                                                    } else
                                                                        if (strength_keyword.isKeyword()) {
                                                                            next_assert_strength = strength_keyword;
                                                                        } else {
                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str96$Strength__Unrecognized_strength__, data_list)), error_lists);
                                                                        }

                                                                }
                                                            } else
                                                                if (pcase_var.eql($DIRECTION)) {
                                                                    if (!data_list.isList()) {
                                                                        error_lists = cons(listS(filename, line_number_start, line_number_end, $list98), error_lists);
                                                                    } else {
                                                                        final SubLObject direction_keyword = ket_lookup_string(data_list, $ket_string_to_direction$.getDynamicValue(thread));
                                                                        if (NIL == direction_keyword) {
                                                                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list98), error_lists);
                                                                        } else
                                                                            if (direction_keyword.isKeyword()) {
                                                                                next_assert_direction = direction_keyword;
                                                                            } else {
                                                                                error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str99$Direction__Unrecognized_direction, data_list)), error_lists);
                                                                            }

                                                                    }
                                                                }










                    } else
                        if (directive.isString() && (NIL == subl_promotions.memberP(directive, new_constant_names, symbol_function($sym100$STRING_), UNPROVIDED))) {
                            error_lists = cons(listS(filename, line_number_start, line_number_end, $list101), error_lists);
                        } else
                            if (directive.isList() && (NIL == new_constant_wrapperp(directive))) {
                                error_lists = cons(listS(filename, line_number_start, line_number_end, $list102), error_lists);
                            } else {
                                SubLObject known_arity = (NIL != fort_types_interface.predicateP(directive)) ? arity.arity(directive) : NIL;
                                final SubLObject mt = ket_relevant_mt(current_mt, current_default_mt, new_constant_names);
                                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    known_arity = (NIL != fort_types_interface.predicateP(directive)) ? arity.arity(directive) : NIL;
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                                if (NIL == current_constant) {
                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $$$Constant_must_be_specified, directive)), error_lists);
                                } else
                                    if (ONE_INTEGER.eql(known_arity)) {
                                        if (NIL == data_list) {
                                            thread.resetMultipleValues();
                                            final SubLObject ke_operation2 = ket_make_ke_operation(list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                            final SubLObject error_strings2 = thread.secondMultipleValue();
                                            final SubLObject next_ist_sentence2 = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            current_ist_sentence = next_ist_sentence2;
                                            next_assert_strength = NIL;
                                            next_assert_direction = NIL;
                                            if (NIL != error_strings2) {
                                                SubLObject cdolist_list_var4 = error_strings2;
                                                SubLObject error_string4 = NIL;
                                                error_string4 = cdolist_list_var4.first();
                                                while (NIL != cdolist_list_var4) {
                                                    error_lists = cons(list(filename, line_number_start, line_number_end, error_string4), error_lists);
                                                    cdolist_list_var4 = cdolist_list_var4.rest();
                                                    error_string4 = cdolist_list_var4.first();
                                                } 
                                            } else {
                                                ke_operations = cons(ke_operation2, ke_operations);
                                            }
                                        } else {
                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str106$Unexpected_argument_to_unary_pred, directive)), error_lists);
                                        }
                                    } else
                                        if (TWO_INTEGER.eql(known_arity)) {
                                            SubLObject cdolist_list_var = data_list;
                                            SubLObject formula_arg3 = NIL;
                                            formula_arg3 = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                if (NIL == formula_arg3) {
                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str107$No_argument_found_for_binary_pred, directive)), error_lists);
                                                } else {
                                                    thread.resetMultipleValues();
                                                    final SubLObject ke_operation = ket_make_ke_operation(list(directive, current_constant, formula_arg3), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                                    final SubLObject error_strings = thread.secondMultipleValue();
                                                    final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    current_ist_sentence = next_ist_sentence;
                                                    next_assert_strength = NIL;
                                                    next_assert_direction = NIL;
                                                    if (NIL != error_strings) {
                                                        SubLObject cdolist_list_var_$2 = error_strings;
                                                        SubLObject error_string = NIL;
                                                        error_string = cdolist_list_var_$2.first();
                                                        while (NIL != cdolist_list_var_$2) {
                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                                            error_string = cdolist_list_var_$2.first();
                                                        } 
                                                    } else {
                                                        ke_operations = cons(ke_operation, ke_operations);
                                                    }
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                formula_arg3 = cdolist_list_var.first();
                                            } 
                                        } else
                                            if (known_arity.isInteger() && known_arity.numGE(THREE_INTEGER)) {
                                                SubLObject cdolist_list_var = data_list;
                                                SubLObject formula_rest_rest = NIL;
                                                formula_rest_rest = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    if (NIL == formula_rest_rest) {
                                                        error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str108$No_argument_found_for_arity__A_pr, known_arity, directive)), error_lists);
                                                    } else
                                                        if (formula_rest_rest.isAtom()) {
                                                            error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str109$List_argument_expected_for_arity_, known_arity, directive)), error_lists);
                                                        } else {
                                                            thread.resetMultipleValues();
                                                            final SubLObject ke_operation = ket_make_ke_operation(listS(directive, current_constant, append(formula_rest_rest, NIL)), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                                            final SubLObject error_strings = thread.secondMultipleValue();
                                                            final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            current_ist_sentence = next_ist_sentence;
                                                            next_assert_strength = NIL;
                                                            next_assert_direction = NIL;
                                                            if (NIL != error_strings) {
                                                                SubLObject cdolist_list_var_$3 = error_strings;
                                                                SubLObject error_string = NIL;
                                                                error_string = cdolist_list_var_$3.first();
                                                                while (NIL != cdolist_list_var_$3) {
                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                                                    error_string = cdolist_list_var_$3.first();
                                                                } 
                                                            } else {
                                                                ke_operations = cons(ke_operation, ke_operations);
                                                            }
                                                        }

                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    formula_rest_rest = cdolist_list_var.first();
                                                } 
                                            } else
                                                if (NIL == data_list) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject ke_operation2 = ket_make_ke_operation(list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                                    final SubLObject error_strings2 = thread.secondMultipleValue();
                                                    final SubLObject next_ist_sentence2 = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    current_ist_sentence = next_ist_sentence2;
                                                    next_assert_strength = NIL;
                                                    next_assert_direction = NIL;
                                                    if (NIL != error_strings2) {
                                                        SubLObject cdolist_list_var4 = error_strings2;
                                                        SubLObject error_string4 = NIL;
                                                        error_string4 = cdolist_list_var4.first();
                                                        while (NIL != cdolist_list_var4) {
                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string4), error_lists);
                                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                                            error_string4 = cdolist_list_var4.first();
                                                        } 
                                                    } else {
                                                        ke_operations = cons(ke_operation2, ke_operations);
                                                    }
                                                } else {
                                                    SubLObject cdolist_list_var = data_list;
                                                    SubLObject formula_args = NIL;
                                                    formula_args = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        if (NIL == formula_args) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject ke_operation = ket_make_ke_operation(list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                                            final SubLObject error_strings = thread.secondMultipleValue();
                                                            final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            current_ist_sentence = next_ist_sentence;
                                                            next_assert_strength = NIL;
                                                            next_assert_direction = NIL;
                                                            if (NIL != error_strings) {
                                                                SubLObject cdolist_list_var_$4 = error_strings;
                                                                SubLObject error_string = NIL;
                                                                error_string = cdolist_list_var_$4.first();
                                                                while (NIL != cdolist_list_var_$4) {
                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                                                    error_string = cdolist_list_var_$4.first();
                                                                } 
                                                            } else {
                                                                ke_operations = cons(ke_operation, ke_operations);
                                                            }
                                                        } else
                                                            if (NIL != formula_args) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject ke_operation = ket_make_ke_operation(list(directive, current_constant, formula_args), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                                                final SubLObject error_strings = thread.secondMultipleValue();
                                                                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                                                thread.resetMultipleValues();
                                                                current_ist_sentence = next_ist_sentence;
                                                                next_assert_strength = NIL;
                                                                next_assert_direction = NIL;
                                                                if (NIL != error_strings) {
                                                                    SubLObject cdolist_list_var_$5 = error_strings;
                                                                    SubLObject error_string = NIL;
                                                                    error_string = cdolist_list_var_$5.first();
                                                                    while (NIL != cdolist_list_var_$5) {
                                                                        error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                                                        error_string = cdolist_list_var_$5.first();
                                                                    } 
                                                                } else {
                                                                    ke_operations = cons(ke_operation, ke_operations);
                                                                }
                                                            } else
                                                                if (NIL != list(formula_args)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject ke_operation = ket_make_ke_operation(listS(directive, current_constant, append(formula_args, NIL)), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                                                    final SubLObject error_strings = thread.secondMultipleValue();
                                                                    final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    current_ist_sentence = next_ist_sentence;
                                                                    next_assert_strength = NIL;
                                                                    next_assert_direction = NIL;
                                                                    if (NIL != error_strings) {
                                                                        SubLObject cdolist_list_var_$6 = error_strings;
                                                                        SubLObject error_string = NIL;
                                                                        error_string = cdolist_list_var_$6.first();
                                                                        while (NIL != cdolist_list_var_$6) {
                                                                            error_lists = cons(list(filename, line_number_start, line_number_end, error_string), error_lists);
                                                                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                                                            error_string = cdolist_list_var_$6.first();
                                                                        } 
                                                                    } else {
                                                                        ke_operations = cons(ke_operation, ke_operations);
                                                                    }
                                                                } else {
                                                                    error_lists = cons(list(filename, line_number_start, line_number_end, format(NIL, $str110$Unexpected_argument_for_predicate, directive)), error_lists);
                                                                }


                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        formula_args = cdolist_list_var.first();
                                                    } 
                                                }




                            }



                csome_list_var = csome_list_var.rest();
                token_list = csome_list_var.first();
            } 
        }
        return values(nreverse(ke_operations), nreverse(error_lists), new_constant_names, killed_constant_names);
    }

    /**
     * Do a KB operation (:create, :assert, :unassert, :rename, etc.).  Operation is a list looking like (operation operation-args...) (e.g. (:assert (#$isa #$Muffet #$Dog) #$CyclistsMt :DEFAULT :FORWARD))  Method is currently either :agenda (add operation to agenda) or :now (do operation now).
     *
     * @return object
     * @param OPERATION
     * 		list ;; a list of the form (OPERATION . OPERATION-ARGS)
     * @param METHOD
     * 		keyword ;; how to do the operation, currently supports :agenda and :now
     */
    @LispMethod(comment = "Do a KB operation (:create, :assert, :unassert, :rename, etc.).  Operation is a list looking like (operation operation-args...) (e.g. (:assert (#$isa #$Muffet #$Dog) #$CyclistsMt :DEFAULT :FORWARD))  Method is currently either :agenda (add operation to agenda) or :now (do operation now).\r\n\r\n@return object\r\n@param OPERATION\r\n\t\tlist ;; a list of the form (OPERATION . OPERATION-ARGS)\r\n@param METHOD\r\n\t\tkeyword ;; how to do the operation, currently supports :agenda and :now")
    public static final SubLObject do_ke_operation_alt(SubLObject operation, SubLObject method) {
        if (method == UNPROVIDED) {
            method = $AGENDA;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject operation_type = operation.first();
                SubLObject operation_args = operation.rest();
                SubLObject pcase_var = operation_type;
                if (pcase_var.eql($CREATE)) {
                    {
                        SubLObject name = operation_args.first();
                        SubLObject pcase_var_12 = method;
                        if (pcase_var_12.eql($AGENDA)) {
                            operation_queues.add_to_local_queue(list(FI_CREATE, name), UNPROVIDED);
                            operation_queues.add_to_local_queue(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())), UNPROVIDED);
                            return NIL;
                        } else {
                            if (pcase_var_12.eql($NOW)) {
                                return ke.ke_create_now(name, UNPROVIDED);
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($ASSERT)) {
                        {
                            SubLObject formula = operation_args.first();
                            SubLObject mt = second(operation_args);
                            SubLObject strength = third(operation_args);
                            SubLObject direction = fourth(operation_args);
                            if (NIL != list_utilities.tree_find($NEW_CONSTANT, formula, UNPROVIDED, UNPROVIDED)) {
                                formula = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, formula));
                            } else {
                                formula = list(QUOTE, formula);
                            }
                            if (NIL != list_utilities.tree_find($NEW_CONSTANT, mt, UNPROVIDED, UNPROVIDED)) {
                                mt = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, mt));
                            } else {
                                mt = list(QUOTE, mt);
                            }
                            {
                                SubLObject pcase_var_13 = method;
                                if (pcase_var_13.eql($AGENDA)) {
                                    operation_queues.add_to_local_queue(list(FI_ASSERT, formula, mt, strength, direction), UNPROVIDED);
                                    operation_queues.add_to_local_queue(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())), UNPROVIDED);
                                    return NIL;
                                } else {
                                    if (pcase_var_13.eql($NOW)) {
                                        formula = eval(formula);
                                        mt = eval(mt);
                                        return ke.ke_assert_now(formula, mt, strength, direction);
                                    }
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($UNASSERT)) {
                            {
                                SubLObject formula = operation_args.first();
                                SubLObject mt = second(operation_args);
                                if (NIL != list_utilities.tree_find($NEW_CONSTANT, formula, UNPROVIDED, UNPROVIDED)) {
                                    formula = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, formula));
                                } else {
                                    formula = list(QUOTE, formula);
                                }
                                if (NIL != list_utilities.tree_find($NEW_CONSTANT, mt, UNPROVIDED, UNPROVIDED)) {
                                    mt = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, mt));
                                } else {
                                    mt = list(QUOTE, mt);
                                }
                                {
                                    SubLObject pcase_var_14 = method;
                                    if (pcase_var_14.eql($AGENDA)) {
                                        operation_queues.add_to_local_queue(list(FI_UNASSERT, formula, mt), UNPROVIDED);
                                        return NIL;
                                    } else {
                                        if (pcase_var_14.eql($NOW)) {
                                            formula = eval(formula);
                                            mt = eval(mt);
                                            return ke.ke_unassert_now(formula, mt);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($RENAME)) {
                                {
                                    SubLObject constant = operation_args.first();
                                    SubLObject name = second(operation_args);
                                    SubLObject quoted_constant = NIL;
                                    SubLObject old_name = NIL;
                                    if (NIL != list_utilities.tree_find($NEW_CONSTANT, constant, UNPROVIDED, UNPROVIDED)) {
                                        quoted_constant = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, constant));
                                        constant = NIL;
                                    } else {
                                        old_name = constants_high.constant_name(constant);
                                        quoted_constant = list(QUOTE, constant);
                                    }
                                    {
                                        SubLObject pcase_var_15 = method;
                                        if (pcase_var_15.eql($AGENDA)) {
                                            operation_queues.add_to_local_queue(list(FI_RENAME, quoted_constant, name), UNPROVIDED);
                                            if (((NIL != constant) && (NIL != ke.$note_old_constant_name$.getDynamicValue(thread))) && old_name.isString()) {
                                                if (NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, $$oldConstantName, $$BookkeepingMt, UNPROVIDED, UNPROVIDED)) {
                                                    {
                                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                                            mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                                            {
                                                                SubLObject pred_var = $$oldConstantName;
                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                                                                    {
                                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
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
                                                                                                SubLObject done_var_16 = NIL;
                                                                                                SubLObject token_var_17 = NIL;
                                                                                                while (NIL == done_var_16) {
                                                                                                    {
                                                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                                                                                        SubLObject valid_18 = makeBoolean(token_var_17 != assertion);
                                                                                                        if (NIL != valid_18) {
                                                                                                            {
                                                                                                                SubLObject old_formula = ke.ke_assertion_find_formula(assertion);
                                                                                                                SubLObject old_mt = assertions_high.assertion_mt(assertion);
                                                                                                                if ((NIL != old_formula) && (NIL != old_mt)) {
                                                                                                                    operation_queues.add_to_local_queue(list(FI_UNASSERT, list(QUOTE, old_formula), list(QUOTE, old_mt)), UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        done_var_16 = makeBoolean(NIL == valid_18);
                                                                                                    }
                                                                                                } 
                                                                                            }
                                                                                        } finally {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    if (NIL != final_index_iterator) {
                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                    }
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
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
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                }
                                                operation_queues.add_to_local_queue(listS(FI_ASSERT, list(QUOTE, list($$oldConstantName, constant, old_name)), $list_alt118), UNPROVIDED);
                                                operation_queues.add_to_local_queue(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())), UNPROVIDED);
                                            }
                                            return NIL;
                                        } else {
                                            if (pcase_var_15.eql($NOW)) {
                                                constant = eval(quoted_constant);
                                                return ke.ke_rename_now(constant, name);
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($KILL)) {
                                    {
                                        SubLObject constant = operation_args.first();
                                        if (NIL != list_utilities.tree_find($NEW_CONSTANT, constant, UNPROVIDED, UNPROVIDED)) {
                                            constant = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, constant));
                                        } else {
                                            constant = list(QUOTE, constant);
                                        }
                                        {
                                            SubLObject pcase_var_20 = method;
                                            if (pcase_var_20.eql($AGENDA)) {
                                                operation_queues.add_to_local_queue(list(FI_KILL, constant), UNPROVIDED);
                                                return NIL;
                                            } else {
                                                if (pcase_var_20.eql($NOW)) {
                                                    return ke.ke_kill_now(constant);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($MERGE)) {
                                        {
                                            SubLObject kill_fort = operation_args.first();
                                            SubLObject keep_fort = second(operation_args);
                                            if (NIL != list_utilities.tree_find($NEW_CONSTANT, kill_fort, UNPROVIDED, UNPROVIDED)) {
                                                kill_fort = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, kill_fort));
                                            } else {
                                                kill_fort = list(QUOTE, kill_fort);
                                            }
                                            if (NIL != list_utilities.tree_find($NEW_CONSTANT, keep_fort, UNPROVIDED, UNPROVIDED)) {
                                                keep_fort = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, keep_fort));
                                            } else {
                                                keep_fort = list(QUOTE, keep_fort);
                                            }
                                            {
                                                SubLObject pcase_var_21 = method;
                                                if (pcase_var_21.eql($AGENDA)) {
                                                    operation_queues.add_to_local_queue(list(FI_MERGE, kill_fort, keep_fort), UNPROVIDED);
                                                    return NIL;
                                                } else {
                                                    if (pcase_var_21.eql($NOW)) {
                                                        kill_fort = eval(kill_fort);
                                                        keep_fort = eval(keep_fort);
                                                        return ke.ke_merge_now(kill_fort, keep_fort);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Do a KB operation (:create, :assert, :unassert, :rename, etc.).  Operation is a list looking like (operation operation-args...) (e.g. (:assert (#$isa #$Muffet #$Dog) #$CyclistsMt :DEFAULT :FORWARD))  Method is currently either :agenda (add operation to agenda) or :now (do operation now).
     *
     * @return object
     * @param OPERATION
     * 		list ;; a list of the form (OPERATION . OPERATION-ARGS)
     * @param METHOD
     * 		keyword ;; how to do the operation, currently supports :agenda and :now
     */
    @LispMethod(comment = "Do a KB operation (:create, :assert, :unassert, :rename, etc.).  Operation is a list looking like (operation operation-args...) (e.g. (:assert (#$isa #$Muffet #$Dog) #$CyclistsMt :DEFAULT :FORWARD))  Method is currently either :agenda (add operation to agenda) or :now (do operation now).\r\n\r\n@return object\r\n@param OPERATION\r\n\t\tlist ;; a list of the form (OPERATION . OPERATION-ARGS)\r\n@param METHOD\r\n\t\tkeyword ;; how to do the operation, currently supports :agenda and :now")
    public static SubLObject do_ke_operation(final SubLObject operation, SubLObject method) {
        if (method == UNPROVIDED) {
            method = $AGENDA;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operation_type = operation.first();
        final SubLObject operation_args = operation.rest();
        final SubLObject pcase_var = operation_type;
        if (pcase_var.eql($CREATE)) {
            final SubLObject name = operation_args.first();
            final SubLObject pcase_var_$11 = method;
            if (pcase_var_$11.eql($AGENDA)) {
                operation_queues.add_to_local_queue(list(FI_CREATE, name), UNPROVIDED);
                operation_queues.add_to_local_queue(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())), UNPROVIDED);
                return NIL;
            }
            if (pcase_var_$11.eql($NOW)) {
                return ke.ke_create_now(name, UNPROVIDED);
            }
        } else
            if (pcase_var.eql($ASSERT)) {
                SubLObject formula = operation_args.first();
                SubLObject mt = second(operation_args);
                final SubLObject strength = third(operation_args);
                final SubLObject direction = fourth(operation_args);
                if (NIL != list_utilities.tree_find($NEW_CONSTANT, formula, UNPROVIDED, UNPROVIDED)) {
                    formula = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, formula));
                } else {
                    formula = list(QUOTE, formula);
                }
                if (NIL != list_utilities.tree_find($NEW_CONSTANT, mt, UNPROVIDED, UNPROVIDED)) {
                    mt = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, mt));
                } else {
                    mt = list(QUOTE, mt);
                }
                final SubLObject pcase_var_$12 = method;
                if (pcase_var_$12.eql($AGENDA)) {
                    operation_queues.add_to_local_queue(list(FI_ASSERT, formula, mt, strength, direction), UNPROVIDED);
                    operation_queues.add_to_local_queue(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())), UNPROVIDED);
                    return NIL;
                }
                if (pcase_var_$12.eql($NOW)) {
                    formula = eval(formula);
                    mt = eval(mt);
                    return ke.ke_assert_now(formula, mt, strength, direction);
                }
            } else
                if (pcase_var.eql($UNASSERT)) {
                    SubLObject formula = operation_args.first();
                    SubLObject mt = second(operation_args);
                    if (NIL != list_utilities.tree_find($NEW_CONSTANT, formula, UNPROVIDED, UNPROVIDED)) {
                        formula = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, formula));
                    } else {
                        formula = list(QUOTE, formula);
                    }
                    if (NIL != list_utilities.tree_find($NEW_CONSTANT, mt, UNPROVIDED, UNPROVIDED)) {
                        mt = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, mt));
                    } else {
                        mt = list(QUOTE, mt);
                    }
                    final SubLObject pcase_var_$13 = method;
                    if (pcase_var_$13.eql($AGENDA)) {
                        operation_queues.add_to_local_queue(list(FI_UNASSERT, formula, mt), UNPROVIDED);
                        return NIL;
                    }
                    if (pcase_var_$13.eql($NOW)) {
                        formula = eval(formula);
                        mt = eval(mt);
                        return ke.ke_unassert_now(formula, mt);
                    }
                } else
                    if (pcase_var.eql($RENAME)) {
                        SubLObject constant = operation_args.first();
                        final SubLObject name2 = second(operation_args);
                        SubLObject quoted_constant = NIL;
                        SubLObject old_name = NIL;
                        if (NIL != list_utilities.tree_find($NEW_CONSTANT, constant, UNPROVIDED, UNPROVIDED)) {
                            quoted_constant = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, constant));
                            constant = NIL;
                        } else {
                            old_name = constants_high.constant_name(constant);
                            quoted_constant = list(QUOTE, constant);
                        }
                        final SubLObject pcase_var_$14 = method;
                        if (pcase_var_$14.eql($AGENDA)) {
                            operation_queues.add_to_local_queue(list(FI_RENAME, quoted_constant, name2), UNPROVIDED);
                            if (((NIL != constant) && (NIL != ke.$note_old_constant_name$.getDynamicValue(thread))) && old_name.isString()) {
                                if (NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, $$oldConstantName, $$BookkeepingMt, UNPROVIDED, UNPROVIDED)) {
                                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                        mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                        final SubLObject pred_var = $$oldConstantName;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
                                            SubLObject done_var = NIL;
                                            final SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        SubLObject done_var_$15 = NIL;
                                                        final SubLObject token_var_$16 = NIL;
                                                        while (NIL == done_var_$15) {
                                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                                                            final SubLObject valid_$17 = makeBoolean(!token_var_$16.eql(assertion));
                                                            if (NIL != valid_$17) {
                                                                final SubLObject old_formula = ke.ke_assertion_find_formula(assertion);
                                                                final SubLObject old_mt = assertions_high.assertion_mt(assertion);
                                                                if ((NIL != old_formula) && (NIL != old_mt)) {
                                                                    operation_queues.add_to_local_queue(list(FI_UNASSERT, list(QUOTE, old_formula), list(QUOTE, old_mt)), UNPROVIDED);
                                                                }
                                                            }
                                                            done_var_$15 = makeBoolean(NIL == valid_$17);
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            } 
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                operation_queues.add_to_local_queue(listS(FI_ASSERT, list(QUOTE, list($$oldConstantName, constant, old_name)), $list125), UNPROVIDED);
                                operation_queues.add_to_local_queue(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())), UNPROVIDED);
                            }
                            return NIL;
                        }
                        if (pcase_var_$14.eql($NOW)) {
                            constant = eval(quoted_constant);
                            return ke.ke_rename_now(constant, name2);
                        }
                    } else
                        if (pcase_var.eql($KILL)) {
                            SubLObject constant = operation_args.first();
                            if (NIL != list_utilities.tree_find($NEW_CONSTANT, constant, UNPROVIDED, UNPROVIDED)) {
                                constant = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, constant));
                            } else {
                                constant = list(QUOTE, constant);
                            }
                            final SubLObject pcase_var_$15 = method;
                            if (pcase_var_$15.eql($AGENDA)) {
                                operation_queues.add_to_local_queue(list(FI_KILL, constant), UNPROVIDED);
                                return NIL;
                            }
                            if (pcase_var_$15.eql($NOW)) {
                                return ke.ke_kill_now(constant);
                            }
                        } else {
                            if (!pcase_var.eql($MERGE)) {
                                return NIL;
                            }
                            SubLObject kill_fort = operation_args.first();
                            SubLObject keep_fort = second(operation_args);
                            if (NIL != list_utilities.tree_find($NEW_CONSTANT, kill_fort, UNPROVIDED, UNPROVIDED)) {
                                kill_fort = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, kill_fort));
                            } else {
                                kill_fort = list(QUOTE, kill_fort);
                            }
                            if (NIL != list_utilities.tree_find($NEW_CONSTANT, keep_fort, UNPROVIDED, UNPROVIDED)) {
                                keep_fort = list(RESOLVE_NEW_CONSTANTS, list(QUOTE, keep_fort));
                            } else {
                                keep_fort = list(QUOTE, keep_fort);
                            }
                            final SubLObject pcase_var_$16 = method;
                            if (pcase_var_$16.eql($AGENDA)) {
                                operation_queues.add_to_local_queue(list(FI_MERGE, kill_fort, keep_fort), UNPROVIDED);
                                return NIL;
                            }
                            if (pcase_var_$16.eql($NOW)) {
                                kill_fort = eval(kill_fort);
                                keep_fort = eval(keep_fort);
                                return ke.ke_merge_now(kill_fort, keep_fort);
                            }
                        }




        return NIL;
    }/**
     * Do a KB operation (:create, :assert, :unassert, :rename, etc.).  Operation is a list looking like (operation operation-args...) (e.g. (:assert (#$isa #$Muffet #$Dog) #$CyclistsMt :DEFAULT :FORWARD))  Method is currently either :agenda (add operation to agenda) or :now (do operation now).
     *
     * @return object
     * @param OPERATION
     * 		list ;; a list of the form (OPERATION . OPERATION-ARGS)
     * @param METHOD
     * 		keyword ;; how to do the operation, currently supports :agenda and :now
     */


    public static final SubLObject new_constant_wrapperp_alt(SubLObject possible_wrapper) {
        if ((possible_wrapper.isCons() && $NEW_CONSTANT.equal(possible_wrapper.first())) && (TWO_INTEGER == length(possible_wrapper))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject new_constant_wrapperp(final SubLObject possible_wrapper) {
        if ((possible_wrapper.isCons() && $NEW_CONSTANT.equal(possible_wrapper.first())) && TWO_INTEGER.eql(length(possible_wrapper))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject make_new_constant_wrapper_alt(SubLObject new_constant_name) {
        return list($NEW_CONSTANT, new_constant_name);
    }

    public static SubLObject make_new_constant_wrapper(final SubLObject new_constant_name) {
        return list($NEW_CONSTANT, new_constant_name);
    }

    /**
     * Looks for lists of the form (:new-constant "CONSTANT-NAME") inside EXPR and performs a FIND-CONSTANT (or die) on each CONSTANT-NAME.  Returns a list with each new-constant-wrapper replaced with the appropriate constant.  If a constant is not found, an error is generated.
     *
     * @return list ;; the resolved EXPR
     * @param EXPR
    list
     * 		
     */
    @LispMethod(comment = "Looks for lists of the form (:new-constant \"CONSTANT-NAME\") inside EXPR and performs a FIND-CONSTANT (or die) on each CONSTANT-NAME.  Returns a list with each new-constant-wrapper replaced with the appropriate constant.  If a constant is not found, an error is generated.\r\n\r\n@return list ;; the resolved EXPR\r\n@param EXPR\nlist")
    public static final SubLObject resolve_new_constants_alt(SubLObject expr) {
        if (expr.isAtom()) {
            return expr;
        } else {
            if (expr.first().eql($NEW_CONSTANT)) {
                {
                    SubLObject second_expr = second(expr);
                    if (NIL != constant_p(second_expr)) {
                        return second_expr;
                    } else {
                        if (second_expr.isString()) {
                            {
                                SubLObject the_constant = com.cyc.cycjava.cycl.ke_text.ket_maybe_find_constant(second_expr);
                                if (NIL == the_constant) {
                                    Errors.error($str_alt121$Constant_does_not_exist___A_, second_expr);
                                } else {
                                    return the_constant;
                                }
                            }
                        } else {
                            Errors.error($str_alt122$_new_constant_must_be_followed_by);
                        }
                    }
                }
            } else {
                return cons(com.cyc.cycjava.cycl.ke_text.resolve_new_constants(expr.first()), com.cyc.cycjava.cycl.ke_text.resolve_new_constants(expr.rest()));
            }
        }
        return NIL;
    }

    /**
     * Looks for lists of the form (:new-constant "CONSTANT-NAME") inside EXPR and performs a FIND-CONSTANT (or die) on each CONSTANT-NAME.  Returns a list with each new-constant-wrapper replaced with the appropriate constant.  If a constant is not found, an error is generated.
     *
     * @return list ;; the resolved EXPR
     * @param EXPR
    		list
     * 		
     */
    @LispMethod(comment = "Looks for lists of the form (:new-constant \"CONSTANT-NAME\") inside EXPR and performs a FIND-CONSTANT (or die) on each CONSTANT-NAME.  Returns a list with each new-constant-wrapper replaced with the appropriate constant.  If a constant is not found, an error is generated.\r\n\r\n@return list ;; the resolved EXPR\r\n@param EXPR\n\t\tlist")
    public static SubLObject resolve_new_constants(final SubLObject expr) {
        if (expr.isAtom()) {
            return expr;
        }
        if (!expr.first().eql($NEW_CONSTANT)) {
            return cons(resolve_new_constants(expr.first()), resolve_new_constants(expr.rest()));
        }
        final SubLObject second_expr = second(expr);
        if (NIL != constant_p(second_expr)) {
            return second_expr;
        }
        if (second_expr.isString()) {
            final SubLObject the_constant = ket_maybe_find_constant(second_expr);
            if (NIL != the_constant) {
                return the_constant;
            }
            Errors.error($str128$Constant_does_not_exist___A_, second_expr);
        } else {
            Errors.error($str129$_new_constant_must_be_followed_by);
        }
        return NIL;
    }/**
     * Looks for lists of the form (:new-constant "CONSTANT-NAME") inside EXPR and performs a FIND-CONSTANT (or die) on each CONSTANT-NAME.  Returns a list with each new-constant-wrapper replaced with the appropriate constant.  If a constant is not found, an error is generated.
     *
     * @return list ;; the resolved EXPR
     * @param EXPR
    		list
     * 		
     */


    public static final SubLObject ke_text_list_to_ke_operations_alt(SubLObject ke_text_list, SubLObject filename, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        if (killed_constant_names == UNPROVIDED) {
            killed_constant_names = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject token_lists = com.cyc.cycjava.cycl.ke_text.ke_text_list_to_token_lists(ke_text_list, filename);
                SubLObject error_lists = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != error_lists) {
                    return values(NIL, error_lists);
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject ke_operations = com.cyc.cycjava.cycl.ke_text.ke_text_token_lists_to_ke_operations(token_lists, new_constant_names, killed_constant_names);
                        SubLObject error_lists_22 = thread.secondMultipleValue();
                        SubLObject new_constant_names_23 = thread.thirdMultipleValue();
                        SubLObject killed_constant_names_24 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        return values(ke_operations, error_lists_22, new_constant_names_23, killed_constant_names_24);
                    }
                }
            }
        }
    }

    public static SubLObject ke_text_list_to_ke_operations(final SubLObject ke_text_list, SubLObject filename, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        if (new_constant_names == UNPROVIDED) {
            new_constant_names = NIL;
        }
        if (killed_constant_names == UNPROVIDED) {
            killed_constant_names = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject token_lists = ke_text_list_to_token_lists(ke_text_list, filename);
        final SubLObject error_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error_lists) {
            return values(NIL, error_lists);
        }
        thread.resetMultipleValues();
        final SubLObject ke_operations = ke_text_token_lists_to_ke_operations(token_lists, new_constant_names, killed_constant_names);
        final SubLObject error_lists_$21 = thread.secondMultipleValue();
        final SubLObject new_constant_names_$22 = thread.thirdMultipleValue();
        final SubLObject killed_constant_names_$23 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return values(ke_operations, error_lists_$21, new_constant_names_$22, killed_constant_names_$23);
    }

    /**
     * Translate a KE-Text file (with filename KE-TEXT-FILENAME) into a list of strings.
     *
     * @return 0 list ;; a list of strings
     * @return 1 list ;; a list of errors (of the form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING))
     * @param KE-TEXT-FILENAME
    string
     * 		
     */
    @LispMethod(comment = "Translate a KE-Text file (with filename KE-TEXT-FILENAME) into a list of strings.\r\n\r\n@return 0 list ;; a list of strings\r\n@return 1 list ;; a list of errors (of the form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING))\r\n@param KE-TEXT-FILENAME\nstring")
    public static final SubLObject ke_text_file_to_ke_text_list_alt(SubLObject ke_text_filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ke_text_list = NIL;
                SubLObject error_list = NIL;
                if (!ke_text_filename.isString()) {
                    return values(NIL, list(bq_cons(ke_text_filename, $list_alt123)));
                } else {
                    if (NIL != string_utilities.null_stringP(ke_text_filename)) {
                        return values(NIL, list(bq_cons(ke_text_filename, $list_alt124)));
                    } else {
                        if (NIL == Filesys.probe_file(ke_text_filename)) {
                            return values(NIL, list(list(ke_text_filename, ZERO_INTEGER, ZERO_INTEGER, file_utilities.why_not_probe_fileP(ke_text_filename))));
                        } else {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(ke_text_filename, $INPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt126$Unable_to_open__S, ke_text_filename);
                                    }
                                    {
                                        SubLObject ke_text_stream = stream;
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject ke_text_list_25 = com.cyc.cycjava.cycl.ke_text.ke_text_to_ke_text_list_internal(ke_text_stream, ke_text_filename);
                                            SubLObject error_list_26 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            ke_text_list = ke_text_list_25;
                                            error_list = error_list_26;
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
                            }
                        }
                    }
                }
                return values(ke_text_list, error_list);
            }
        }
    }

    /**
     * Translate a KE-Text file (with filename KE-TEXT-FILENAME) into a list of strings.
     *
     * @return 0 list ;; a list of strings
     * @return 1 list ;; a list of errors (of the form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING))
     * @param KE-TEXT-FILENAME
    		string
     * 		
     */
    @LispMethod(comment = "Translate a KE-Text file (with filename KE-TEXT-FILENAME) into a list of strings.\r\n\r\n@return 0 list ;; a list of strings\r\n@return 1 list ;; a list of errors (of the form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING))\r\n@param KE-TEXT-FILENAME\n\t\tstring")
    public static SubLObject ke_text_file_to_ke_text_list(final SubLObject ke_text_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ke_text_list = NIL;
        SubLObject error_list = NIL;
        if (!ke_text_filename.isString()) {
            return values(NIL, list(bq_cons(ke_text_filename, $list130)));
        }
        if (NIL != string_utilities.null_stringP(ke_text_filename)) {
            return values(NIL, list(bq_cons(ke_text_filename, $list131)));
        }
        if (NIL == Filesys.probe_file(ke_text_filename)) {
            return values(NIL, list(list(ke_text_filename, ZERO_INTEGER, ZERO_INTEGER, file_utilities.why_not_probe_fileP(ke_text_filename))));
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(ke_text_filename, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str133$Unable_to_open__S, ke_text_filename);
            }
            final SubLObject ke_text_stream = stream;
            thread.resetMultipleValues();
            final SubLObject ke_text_list_$24 = ke_text_to_ke_text_list_internal(ke_text_stream, ke_text_filename);
            final SubLObject error_list_$25 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ke_text_list = ke_text_list_$24;
            error_list = error_list_$25;
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return values(ke_text_list, error_list);
    }/**
     * Translate a KE-Text file (with filename KE-TEXT-FILENAME) into a list of strings.
     *
     * @return 0 list ;; a list of strings
     * @return 1 list ;; a list of errors (of the form (FILENAME LINE-NUMBER-START LINE-NUMBER-END ERROR-STRING))
     * @param KE-TEXT-FILENAME
    		string
     * 		
     */


    public static final SubLObject ke_text_to_ke_text_list_alt(SubLObject content, SubLObject ke_text_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ke_text_list = NIL;
                SubLObject error_list = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_input_stream(content, ZERO_INTEGER, NIL);
                    thread.resetMultipleValues();
                    {
                        SubLObject ke_text_list_27 = com.cyc.cycjava.cycl.ke_text.ke_text_to_ke_text_list_internal(stream, ke_text_file);
                        SubLObject error_list_28 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        ke_text_list = ke_text_list_27;
                        error_list = error_list_28;
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(ke_text_list, error_list);
            }
        }
    }

    public static SubLObject ke_text_to_ke_text_list(final SubLObject content, final SubLObject ke_text_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ke_text_list = NIL;
        SubLObject error_list = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_input_stream(content, ZERO_INTEGER, NIL);
            thread.resetMultipleValues();
            final SubLObject ke_text_list_$26 = ke_text_to_ke_text_list_internal(stream, ke_text_file);
            final SubLObject error_list_$27 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ke_text_list = ke_text_list_$26;
            error_list = error_list_$27;
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return values(ke_text_list, error_list);
    }

    public static final SubLObject ke_text_to_ke_text_list_internal_alt(SubLObject stream, SubLObject source) {
        {
            SubLObject ke_text_list = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject text_line = NIL;
                                for (text_line = read_line(stream, NIL, UNPROVIDED, UNPROVIDED); !((text_line == $EOF) || (NIL == text_line)); text_line = read_line(stream, NIL, UNPROVIDED, UNPROVIDED)) {
                                    ke_text_list = cons(text_line, ke_text_list);
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                return values(NIL, list(list(source, ZERO_INTEGER, ZERO_INTEGER, error_message)));
            } else {
                return values(nreverse(ke_text_list), NIL);
            }
        }
    }

    public static SubLObject ke_text_to_ke_text_list_internal(final SubLObject stream, SubLObject source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ke_text_list = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject text_line;
                    for (text_line = NIL, text_line = read_line(stream, NIL, UNPROVIDED, UNPROVIDED); (text_line != $EOF) && (NIL != text_line); text_line = read_line(stream, NIL, UNPROVIDED, UNPROVIDED)) {
                        ke_text_list = cons(text_line, ke_text_list);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            return values(NIL, list(list(source, ZERO_INTEGER, ZERO_INTEGER, error_message)));
        }
        return values(nreverse(ke_text_list), NIL);
    }

    public static final SubLObject ke_operations_new_killed_renamed_merged_constant_names_alt(SubLObject ke_operations) {
        {
            SubLObject new_killed_renamed_merged_constants = NIL;
            SubLObject new_constantsP = NIL;
            SubLObject killed_constantsP = NIL;
            SubLObject renamed_constantsP = NIL;
            SubLObject merged_constantsP = NIL;
            SubLObject cdolist_list_var = ke_operations;
            SubLObject ke_operation = NIL;
            for (ke_operation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ke_operation = cdolist_list_var.first()) {
                {
                    SubLObject operation_type = ke_operation.first();
                    SubLObject operation_arg1 = second(ke_operation);
                    SubLObject operation_arg2 = third(ke_operation);
                    if (NIL != com.cyc.cycjava.cycl.ke_text.new_constant_wrapperp(operation_arg1)) {
                        operation_arg1 = second(operation_arg1);
                    }
                    if (NIL != com.cyc.cycjava.cycl.ke_text.new_constant_wrapperp(operation_arg2)) {
                        operation_arg2 = second(operation_arg2);
                    }
                    {
                        SubLObject pcase_var = operation_type;
                        if (pcase_var.eql($CREATE)) {
                            new_constantsP = T;
                            new_killed_renamed_merged_constants = cons(list($CREATE, NIL, operation_arg1), new_killed_renamed_merged_constants);
                        } else {
                            if (pcase_var.eql($KILL)) {
                                killed_constantsP = T;
                                new_killed_renamed_merged_constants = cons(listS($KILL, operation_arg1, $list_alt129), new_killed_renamed_merged_constants);
                            } else {
                                if (pcase_var.eql($RENAME)) {
                                    renamed_constantsP = T;
                                    new_killed_renamed_merged_constants = cons(list($RENAME, operation_arg1, operation_arg2), new_killed_renamed_merged_constants);
                                } else {
                                    if (pcase_var.eql($MERGE)) {
                                        merged_constantsP = T;
                                        new_killed_renamed_merged_constants = cons(list($MERGE, operation_arg1, operation_arg2), new_killed_renamed_merged_constants);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            new_killed_renamed_merged_constants = nreverse(new_killed_renamed_merged_constants);
            return values(new_killed_renamed_merged_constants, new_constantsP, killed_constantsP, renamed_constantsP, merged_constantsP);
        }
    }

    public static SubLObject ke_operations_new_killed_renamed_merged_constant_names(final SubLObject ke_operations) {
        SubLObject new_killed_renamed_merged_constants = NIL;
        SubLObject new_constantsP = NIL;
        SubLObject killed_constantsP = NIL;
        SubLObject renamed_constantsP = NIL;
        SubLObject merged_constantsP = NIL;
        SubLObject cdolist_list_var = ke_operations;
        SubLObject ke_operation = NIL;
        ke_operation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject operation_type = ke_operation.first();
            SubLObject operation_arg1 = second(ke_operation);
            SubLObject operation_arg2 = third(ke_operation);
            if (NIL != new_constant_wrapperp(operation_arg1)) {
                operation_arg1 = second(operation_arg1);
            }
            if (NIL != new_constant_wrapperp(operation_arg2)) {
                operation_arg2 = second(operation_arg2);
            }
            final SubLObject pcase_var = operation_type;
            if (pcase_var.eql($CREATE)) {
                new_constantsP = T;
                new_killed_renamed_merged_constants = cons(list($CREATE, NIL, operation_arg1), new_killed_renamed_merged_constants);
            } else
                if (pcase_var.eql($KILL)) {
                    killed_constantsP = T;
                    new_killed_renamed_merged_constants = cons(listS($KILL, operation_arg1, $list136), new_killed_renamed_merged_constants);
                } else
                    if (pcase_var.eql($RENAME)) {
                        renamed_constantsP = T;
                        new_killed_renamed_merged_constants = cons(list($RENAME, operation_arg1, operation_arg2), new_killed_renamed_merged_constants);
                    } else
                        if (pcase_var.eql($MERGE)) {
                            merged_constantsP = T;
                            new_killed_renamed_merged_constants = cons(list($MERGE, operation_arg1, operation_arg2), new_killed_renamed_merged_constants);
                        }



            cdolist_list_var = cdolist_list_var.rest();
            ke_operation = cdolist_list_var.first();
        } 
        new_killed_renamed_merged_constants = nreverse(new_killed_renamed_merged_constants);
        return values(new_killed_renamed_merged_constants, new_constantsP, killed_constantsP, renamed_constantsP, merged_constantsP);
    }

    public static final SubLObject ke_text_error_message_alt(SubLObject error_list) {
        {
            SubLObject error_message = $str_alt130$;
            SubLObject error_file = error_list.first();
            SubLObject error_line_number_start = second(error_list);
            SubLObject error_line_number_end = third(error_list);
            SubLObject error_string = fourth(error_list);
            if (NIL != error_file) {
                error_message = cconcatenate(error_message, format(NIL, $str_alt131$_A__, error_file));
            }
            if (NIL != error_line_number_start) {
                if (NIL != error_line_number_end) {
                    error_message = cconcatenate(error_message, format(NIL, $str_alt132$_A__A__, error_line_number_start, error_line_number_end));
                } else {
                    error_message = cconcatenate(error_message, format(NIL, $str_alt133$_A___, error_line_number_start));
                }
            } else {
                if (NIL != error_line_number_end) {
                    error_message = cconcatenate(error_message, format(NIL, $str_alt134$__A__, error_line_number_end));
                } else {
                    error_message = cconcatenate(error_message, format(NIL, $str_alt135$___));
                }
            }
            error_message = cconcatenate(error_message, format(NIL, $str_alt136$_A, error_string));
            return error_message;
        }
    }

    public static SubLObject ke_text_error_message(final SubLObject error_list) {
        SubLObject error_message = $str137$;
        final SubLObject error_file = error_list.first();
        final SubLObject error_line_number_start = second(error_list);
        final SubLObject error_line_number_end = third(error_list);
        final SubLObject error_string = fourth(error_list);
        if (NIL != error_file) {
            error_message = cconcatenate(error_message, format(NIL, $str138$_A__, error_file));
        }
        if (NIL != error_line_number_start) {
            if (NIL != error_line_number_end) {
                error_message = cconcatenate(error_message, format(NIL, $str139$_A__A__, error_line_number_start, error_line_number_end));
            } else {
                error_message = cconcatenate(error_message, format(NIL, $str140$_A___, error_line_number_start));
            }
        } else
            if (NIL != error_line_number_end) {
                error_message = cconcatenate(error_message, format(NIL, $str141$__A__, error_line_number_end));
            } else {
                error_message = cconcatenate(error_message, format(NIL, $str142$___));
            }

        error_message = cconcatenate(error_message, format(NIL, $str143$_A, error_string));
        return error_message;
    }

    public static final SubLObject format_el_sentence_as_ke_text_alt(SubLObject stream, SubLObject el_sentence) {
        format(stream, $str_alt137$el_);
        format_cycl_expression.format_cycl_expression(el_sentence, stream, UNPROVIDED);
        format(stream, $str_alt138$____);
        return el_sentence;
    }

    public static SubLObject format_el_sentence_as_ke_text(final SubLObject stream, final SubLObject el_sentence) {
        format(stream, $str144$el_);
        format_cycl_expression.format_cycl_expression(el_sentence, stream, UNPROVIDED);
        format(stream, $str145$____);
        return el_sentence;
    }

    /**
     * Call the ke text engine on a file from the lisp interactor.
     *
     * @param CYCLIST
     * 		(string or constant)
     * @param FILENAME
    		string
     * 		
     * @param METHOD
     * 		keyword ;; can be :agenda or :now.
     * @param NO-USER-INTERACTION?
     * 		boolean ;; if non nil, then the confirming question is not asked.
     */
    @LispMethod(comment = "Call the ke text engine on a file from the lisp interactor.\r\n\r\n@param CYCLIST\r\n\t\t(string or constant)\r\n@param FILENAME\n\t\tstring\r\n\t\t\r\n@param METHOD\r\n\t\tkeyword ;; can be :agenda or :now.\r\n@param NO-USER-INTERACTION?\r\n\t\tboolean ;; if non nil, then the confirming question is not asked.")
    public static final SubLObject load_ke_text_file(SubLObject cyclist, SubLObject filename, SubLObject method, SubLObject no_user_interactionP) {
        if (method == UNPROVIDED) {
            method = $AGENDA;
        }
        if (no_user_interactionP == UNPROVIDED) {
            no_user_interactionP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject the_cyclist = (cyclist.isString()) ? ((SubLObject) (constants_high.find_constant(cyclist))) : cyclist;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL == kb_accessors.cyclistP(the_cyclist)) {
                            format(T, $str_alt140$__Sorry___s_is_not_known_to_be_a_, cyclist);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject old_cyclist = operation_communication.the_cyclist();
                    try {
                        operation_communication.set_the_cyclist(the_cyclist);
                        thread.resetMultipleValues();
                        {
                            SubLObject ke_text_list = com.cyc.cycjava.cycl.ke_text.ke_text_file_to_ke_text_list(filename);
                            SubLObject error_lists = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != error_lists) {
                                {
                                    SubLObject cdolist_list_var = error_lists;
                                    SubLObject error_list = NIL;
                                    for (error_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_list = cdolist_list_var.first()) {
                                        format(T, $str_alt141$_A__, com.cyc.cycjava.cycl.ke_text.ke_text_error_message(error_list));
                                    }
                                }
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject ke_operations = com.cyc.cycjava.cycl.ke_text.ke_text_list_to_ke_operations(ke_text_list, filename, UNPROVIDED, UNPROVIDED);
                                    SubLObject error_lists_29 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != error_lists_29) {
                                        {
                                            SubLObject cdolist_list_var = error_lists_29;
                                            SubLObject error_list = NIL;
                                            for (error_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_list = cdolist_list_var.first()) {
                                                format(T, $str_alt141$_A__, com.cyc.cycjava.cycl.ke_text.ke_text_error_message(error_list));
                                            }
                                        }
                                    } else {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject new_killed_renamed_merged_constants = com.cyc.cycjava.cycl.ke_text.ke_operations_new_killed_renamed_merged_constant_names(ke_operations);
                                            SubLObject new_constantsP = thread.secondMultipleValue();
                                            SubLObject killed_constantsP = thread.thirdMultipleValue();
                                            SubLObject renamed_constantsP = thread.fourthMultipleValue();
                                            SubLObject merged_constantsP = thread.fifthMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject string_list = NIL;
                                                SubLObject filler_list = NIL;
                                                if (NIL != merged_constantsP) {
                                                    string_list = cons($$$merged, string_list);
                                                }
                                                if (NIL != renamed_constantsP) {
                                                    string_list = cons($$$renamed, string_list);
                                                }
                                                if (NIL != killed_constantsP) {
                                                    string_list = cons($$$killed, string_list);
                                                }
                                                if (NIL != new_constantsP) {
                                                    string_list = cons($$$created, string_list);
                                                }
                                                {
                                                    SubLObject pcase_var = length(string_list);
                                                    if (pcase_var.eql(TWO_INTEGER)) {
                                                        filler_list = $list_alt146;
                                                    } else {
                                                        if (pcase_var.eql(THREE_INTEGER)) {
                                                            filler_list = $list_alt147;
                                                        } else {
                                                            if (pcase_var.eql(FOUR_INTEGER)) {
                                                                filler_list = $list_alt148;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL != string_list) {
                                                    format(T, $str_alt149$The_following_constants_will_be_);
                                                    {
                                                        SubLObject string = NIL;
                                                        SubLObject string_30 = NIL;
                                                        SubLObject filler = NIL;
                                                        SubLObject filler_31 = NIL;
                                                        for (string = string_list, string_30 = string.first(), filler = filler_list, filler_31 = filler.first(); !((NIL == filler) && (NIL == string)); string = string.rest() , string_30 = string.first() , filler = filler.rest() , filler_31 = filler.first()) {
                                                            if (NIL != string_30) {
                                                                format(T, string_30);
                                                            }
                                                            if (NIL != filler_31) {
                                                                format(T, filler_31);
                                                            }
                                                        }
                                                    }
                                                    format(T, $str_alt150$_);
                                                }
                                                format(T, $str_alt151$__);
                                                {
                                                    SubLObject cdolist_list_var = new_killed_renamed_merged_constants;
                                                    SubLObject new_killed_renamed_constant = NIL;
                                                    for (new_killed_renamed_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_killed_renamed_constant = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject operation_type = new_killed_renamed_constant.first();
                                                            SubLObject column1 = second(new_killed_renamed_constant);
                                                            SubLObject column2 = third(new_killed_renamed_constant);
                                                            SubLObject pcase_var = operation_type;
                                                            if (pcase_var.eql($CREATE)) {
                                                                format(T, $str_alt152$__Create___A__, column2);
                                                            } else {
                                                                if (pcase_var.eql($KILL)) {
                                                                    format(T, $str_alt153$__Kill___A__, column1);
                                                                } else {
                                                                    if (pcase_var.eql($RENAME)) {
                                                                        format(T, $str_alt154$__Rename___A_to__A__, column1, column2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = ke_operations;
                                            SubLObject ke_operation = NIL;
                                            for (ke_operation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ke_operation = cdolist_list_var.first()) {
                                                print(ke_operation, UNPROVIDED);
                                            }
                                        }
                                        {
                                            SubLObject num_ops = length(ke_operations);
                                            SubLObject cur_op = ZERO_INTEGER;
                                            if ((NIL != no_user_interactionP) || (NIL != UserIO.user_confirm(format(NIL, $str_alt155$Would_you_like_to_evaluate_the__A, num_ops)))) {
                                                {
                                                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                    try {
                                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                                        $within_noting_percent_progress$.bind(T, thread);
                                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                        noting_percent_progress_preamble(format(NIL, $str_alt156$Evaluating__A_forms_____, num_ops));
                                                        {
                                                            SubLObject cdolist_list_var = ke_operations;
                                                            SubLObject ke_operation = NIL;
                                                            for (ke_operation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ke_operation = cdolist_list_var.first()) {
                                                                cur_op = add(cur_op, ONE_INTEGER);
                                                                note_percent_progress(cur_op, num_ops);
                                                                com.cyc.cycjava.cycl.ke_text.do_ke_operation(ke_operation, method);
                                                            }
                                                        }
                                                        noting_percent_progress_postamble();
                                                    } finally {
                                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            }
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
                                operation_communication.set_the_cyclist(old_cyclist);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject load_ke_text_file(final SubLObject cyclist, final SubLObject filename, SubLObject method, SubLObject no_user_interactionP, SubLObject verbosity) {
        if (method == UNPROVIDED) {
            method = $AGENDA;
        }
        if (no_user_interactionP == UNPROVIDED) {
            no_user_interactionP = T;
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $NORMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(filename, STRINGP);
        final SubLObject the_cyclist = (cyclist.isString()) ? constants_high.find_constant(cyclist) : cyclist;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == kb_accessors.cyclistP(the_cyclist)) {
                format(T, $str148$__Sorry___s_is_not_known_to_be_a_, cyclist);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject old_cyclist = operation_communication.the_cyclist();
        try {
            operation_communication.set_the_cyclist(the_cyclist);
            thread.resetMultipleValues();
            final SubLObject ke_text_list = ke_text_file_to_ke_text_list(filename);
            final SubLObject error_lists = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != error_lists) {
                SubLObject cdolist_list_var = error_lists;
                SubLObject error_list = NIL;
                error_list = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(T, $str149$_A__, ke_text_error_message(error_list));
                    cdolist_list_var = cdolist_list_var.rest();
                    error_list = cdolist_list_var.first();
                } 
            } else {
                thread.resetMultipleValues();
                final SubLObject ke_operations = ke_text_list_to_ke_operations(ke_text_list, filename, UNPROVIDED, UNPROVIDED);
                final SubLObject error_lists_$28 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != error_lists_$28) {
                    SubLObject cdolist_list_var2 = error_lists_$28;
                    SubLObject error_list2 = NIL;
                    error_list2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        format(T, $str149$_A__, ke_text_error_message(error_list2));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        error_list2 = cdolist_list_var2.first();
                    } 
                } else {
                    thread.resetMultipleValues();
                    final SubLObject new_killed_renamed_merged_constants = ke_operations_new_killed_renamed_merged_constant_names(ke_operations);
                    final SubLObject new_constantsP = thread.secondMultipleValue();
                    final SubLObject killed_constantsP = thread.thirdMultipleValue();
                    final SubLObject renamed_constantsP = thread.fourthMultipleValue();
                    final SubLObject merged_constantsP = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject string_list = NIL;
                    SubLObject filler_list = NIL;
                    if (NIL != merged_constantsP) {
                        string_list = cons($$$merged, string_list);
                    }
                    if (NIL != renamed_constantsP) {
                        string_list = cons($$$renamed, string_list);
                    }
                    if (NIL != killed_constantsP) {
                        string_list = cons($$$killed, string_list);
                    }
                    if (NIL != new_constantsP) {
                        string_list = cons($$$created, string_list);
                    }
                    final SubLObject pcase_var = length(string_list);
                    if (pcase_var.eql(TWO_INTEGER)) {
                        filler_list = $list154;
                    } else
                        if (pcase_var.eql(THREE_INTEGER)) {
                            filler_list = $list155;
                        } else
                            if (pcase_var.eql(FOUR_INTEGER)) {
                                filler_list = $list156;
                            }


                    if (verbosity != $QUIET) {
                        if (NIL != string_list) {
                            format(T, $$$The_following_constants_will_be_);
                            SubLObject string = NIL;
                            SubLObject string_$29 = NIL;
                            SubLObject filler = NIL;
                            SubLObject filler_$30 = NIL;
                            string = string_list;
                            string_$29 = string.first();
                            filler = filler_list;
                            filler_$30 = filler.first();
                            while ((NIL != filler) || (NIL != string)) {
                                if (NIL != string_$29) {
                                    format(T, string_$29);
                                }
                                if (NIL != filler_$30) {
                                    format(T, filler_$30);
                                }
                                string = string.rest();
                                string_$29 = string.first();
                                filler = filler.rest();
                                filler_$30 = filler.first();
                            } 
                            format(T, $str159$_);
                        }
                        format(T, $str160$__);
                        SubLObject cdolist_list_var3 = new_killed_renamed_merged_constants;
                        SubLObject new_killed_renamed_constant = NIL;
                        new_killed_renamed_constant = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            final SubLObject operation_type = new_killed_renamed_constant.first();
                            final SubLObject column1 = second(new_killed_renamed_constant);
                            final SubLObject column2 = third(new_killed_renamed_constant);
                            final SubLObject pcase_var2 = operation_type;
                            if (pcase_var2.eql($CREATE)) {
                                format(T, $str161$__Create___A__, column2);
                            } else
                                if (pcase_var2.eql($KILL)) {
                                    format(T, $str162$__Kill___A__, column1);
                                } else
                                    if (pcase_var2.eql($RENAME)) {
                                        format(T, $str163$__Rename___A_to__A__, column1, column2);
                                    }


                            cdolist_list_var3 = cdolist_list_var3.rest();
                            new_killed_renamed_constant = cdolist_list_var3.first();
                        } 
                    }
                    if (verbosity != $QUIET) {
                        SubLObject cdolist_list_var2 = ke_operations;
                        SubLObject ke_operation = NIL;
                        ke_operation = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            print(ke_operation, UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            ke_operation = cdolist_list_var2.first();
                        } 
                    }
                    final SubLObject num_ops = length(ke_operations);
                    SubLObject cur_op = ZERO_INTEGER;
                    final SubLObject _prev_bind_3 = $silent_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $silent_progressP$.bind(eq(verbosity, $QUIET), thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(format(NIL, $str164$Evaluating__A_forms_____, num_ops));
                            SubLObject cdolist_list_var3 = ke_operations;
                            SubLObject ke_operation2 = NIL;
                            ke_operation2 = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                cur_op = add(cur_op, ONE_INTEGER);
                                note_percent_progress(cur_op, num_ops);
                                if (NIL != $ke_text_failures_log_file$.getDynamicValue(thread)) {
                                    SubLObject stream = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$31 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                            stream = compatibility.open_text($ke_text_failures_log_file$.getDynamicValue(thread), $APPEND);
                                        } finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$31, thread);
                                        }
                                        if (!stream.isStream()) {
                                            Errors.error($str133$Unable_to_open__S, $ke_text_failures_log_file$.getDynamicValue(thread));
                                        }
                                        final SubLObject s = stream;
                                        thread.resetMultipleValues();
                                        final SubLObject result = do_ke_operation(ke_operation2, method);
                                        final SubLObject error = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != error) {
                                            format(s, $str143$_A, error);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                        }
                                    }
                                } else {
                                    do_ke_operation(ke_operation2, method);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                ke_operation2 = cdolist_list_var3.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_7, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_5, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_4, thread);
                        $silent_progressP$.rebind(_prev_bind_3, thread);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                operation_communication.set_the_cyclist(old_cyclist);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_8, thread);
            }
        }
        return NIL;
    }

    public static SubLObject parse_ke_text_string(final SubLObject ke_text_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ke_text_list = string_utilities.string_tokenize(ke_text_string, list(Strings.make_string(ONE_INTEGER, CHAR_newline)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject ke_operations = ke_text_list_to_ke_operations(ke_text_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject error_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list_utilities.make_plist($list170, list(ke_operations, error_lists));
    }

    public static SubLObject load_ke_text_string(final SubLObject ke_text_string, SubLObject method) {
        if (method == UNPROVIDED) {
            method = $AGENDA;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errors = NIL;
        final SubLObject parse = parse_ke_text_string(ke_text_string);
        final SubLObject ke_operations = getf(parse, $KE_OPERATIONS, UNPROVIDED);
        final SubLObject error_lists = getf(parse, $ERROR_LISTS, UNPROVIDED);
        SubLObject results = NIL;
        if (NIL == error_lists) {
            SubLObject cdolist_list_var = ke_operations;
            SubLObject ke_operation = NIL;
            ke_operation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject result = do_ke_operation(ke_operation, method);
                final SubLObject error = thread.secondMultipleValue();
                thread.resetMultipleValues();
                results = cons(result, results);
                if (NIL != error) {
                    errors = cons(error, errors);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ke_operation = cdolist_list_var.first();
            } 
        }
        return list_utilities.make_plist($list173, list(ke_operations, error_lists, errors));
    }

    public static final SubLObject declare_ke_text_file_alt() {
        declareFunction("ke_text_list_to_token_lists", "KE-TEXT-LIST-TO-TOKEN-LISTS", 1, 1, false);
        declareFunction("ket_lookup_string", "KET-LOOKUP-STRING", 2, 0, false);
        declareFunction("ket_directive_list_to_directive", "KET-DIRECTIVE-LIST-TO-DIRECTIVE", 1, 1, false);
        declareFunction("ket_relevant_mt", "KET-RELEVANT-MT", 3, 0, false);
        declareFunction("ket_relevant_strength", "KET-RELEVANT-STRENGTH", 2, 0, false);
        declareFunction("ket_relevant_direction", "KET-RELEVANT-DIRECTION", 2, 0, false);
        declareFunction("ket_unknown_to_known", "KET-UNKNOWN-TO-KNOWN", 1, 2, false);
        declareFunction("ket_maybe_find_constant", "KET-MAYBE-FIND-CONSTANT", 1, 0, false);
        declareFunction("ket_make_ke_operation", "KET-MAKE-KE-OPERATION", 2, 5, false);
        declareFunction("ke_text_token_lists_to_ke_operations", "KE-TEXT-TOKEN-LISTS-TO-KE-OPERATIONS", 1, 2, false);
        declareFunction("do_ke_operation", "DO-KE-OPERATION", 1, 1, false);
        declareFunction("new_constant_wrapperp", "NEW-CONSTANT-WRAPPERP", 1, 0, false);
        declareFunction("make_new_constant_wrapper", "MAKE-NEW-CONSTANT-WRAPPER", 1, 0, false);
        declareFunction("resolve_new_constants", "RESOLVE-NEW-CONSTANTS", 1, 0, false);
        declareFunction("ke_text_list_to_ke_operations", "KE-TEXT-LIST-TO-KE-OPERATIONS", 1, 3, false);
        declareFunction("ke_text_file_to_ke_text_list", "KE-TEXT-FILE-TO-KE-TEXT-LIST", 1, 0, false);
        declareFunction("ke_text_to_ke_text_list", "KE-TEXT-TO-KE-TEXT-LIST", 2, 0, false);
        declareFunction("ke_text_to_ke_text_list_internal", "KE-TEXT-TO-KE-TEXT-LIST-INTERNAL", 2, 0, false);
        declareFunction("ke_operations_new_killed_renamed_merged_constant_names", "KE-OPERATIONS-NEW-KILLED-RENAMED-MERGED-CONSTANT-NAMES", 1, 0, false);
        declareFunction("ke_text_error_message", "KE-TEXT-ERROR-MESSAGE", 1, 0, false);
        declareFunction("format_el_sentence_as_ke_text", "FORMAT-EL-SENTENCE-AS-KE-TEXT", 2, 0, false);
        declareFunction("load_ke_text_file", "LOAD-KE-TEXT-FILE", 2, 2, false);
        return NIL;
    }

    public static SubLObject declare_ke_text_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_ke_text_failures_to_file", "WITH-KE-TEXT-FAILURES-TO-FILE");
            declareFunction("ke_text_list_to_token_lists", "KE-TEXT-LIST-TO-TOKEN-LISTS", 1, 1, false);
            declareFunction("ket_lookup_string", "KET-LOOKUP-STRING", 2, 0, false);
            declareFunction("ket_directive_list_to_directive", "KET-DIRECTIVE-LIST-TO-DIRECTIVE", 1, 1, false);
            declareFunction("ket_relevant_mt", "KET-RELEVANT-MT", 3, 0, false);
            declareFunction("ket_relevant_strength", "KET-RELEVANT-STRENGTH", 2, 0, false);
            declareFunction("ket_relevant_direction", "KET-RELEVANT-DIRECTION", 2, 0, false);
            declareFunction("ket_unknown_to_known", "KET-UNKNOWN-TO-KNOWN", 1, 2, false);
            declareFunction("ket_maybe_find_constant", "KET-MAYBE-FIND-CONSTANT", 1, 0, false);
            declareFunction("ket_make_ke_operation", "KET-MAKE-KE-OPERATION", 2, 6, false);
            declareFunction("ke_text_token_lists_to_ke_operations", "KE-TEXT-TOKEN-LISTS-TO-KE-OPERATIONS", 1, 2, false);
            declareFunction("do_ke_operation", "DO-KE-OPERATION", 1, 1, false);
            declareFunction("new_constant_wrapperp", "NEW-CONSTANT-WRAPPERP", 1, 0, false);
            declareFunction("make_new_constant_wrapper", "MAKE-NEW-CONSTANT-WRAPPER", 1, 0, false);
            declareFunction("resolve_new_constants", "RESOLVE-NEW-CONSTANTS", 1, 0, false);
            declareFunction("ke_text_list_to_ke_operations", "KE-TEXT-LIST-TO-KE-OPERATIONS", 1, 3, false);
            declareFunction("ke_text_file_to_ke_text_list", "KE-TEXT-FILE-TO-KE-TEXT-LIST", 1, 0, false);
            declareFunction("ke_text_to_ke_text_list", "KE-TEXT-TO-KE-TEXT-LIST", 2, 0, false);
            declareFunction("ke_text_to_ke_text_list_internal", "KE-TEXT-TO-KE-TEXT-LIST-INTERNAL", 2, 0, false);
            declareFunction("ke_operations_new_killed_renamed_merged_constant_names", "KE-OPERATIONS-NEW-KILLED-RENAMED-MERGED-CONSTANT-NAMES", 1, 0, false);
            declareFunction("ke_text_error_message", "KE-TEXT-ERROR-MESSAGE", 1, 0, false);
            declareFunction("format_el_sentence_as_ke_text", "FORMAT-EL-SENTENCE-AS-KE-TEXT", 2, 0, false);
            declareFunction("load_ke_text_file", "LOAD-KE-TEXT-FILE", 2, 3, false);
            declareFunction("parse_ke_text_string", "PARSE-KE-TEXT-STRING", 1, 0, false);
            declareFunction("load_ke_text_string", "LOAD-KE-TEXT-STRING", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("ket_make_ke_operation", "KET-MAKE-KE-OPERATION", 2, 5, false);
            declareFunction("load_ke_text_file", "LOAD-KE-TEXT-FILE", 2, 2, false);
        }
        return NIL;
    }

    public static SubLObject declare_ke_text_file_Previous() {
        declareMacro("with_ke_text_failures_to_file", "WITH-KE-TEXT-FAILURES-TO-FILE");
        declareFunction("ke_text_list_to_token_lists", "KE-TEXT-LIST-TO-TOKEN-LISTS", 1, 1, false);
        declareFunction("ket_lookup_string", "KET-LOOKUP-STRING", 2, 0, false);
        declareFunction("ket_directive_list_to_directive", "KET-DIRECTIVE-LIST-TO-DIRECTIVE", 1, 1, false);
        declareFunction("ket_relevant_mt", "KET-RELEVANT-MT", 3, 0, false);
        declareFunction("ket_relevant_strength", "KET-RELEVANT-STRENGTH", 2, 0, false);
        declareFunction("ket_relevant_direction", "KET-RELEVANT-DIRECTION", 2, 0, false);
        declareFunction("ket_unknown_to_known", "KET-UNKNOWN-TO-KNOWN", 1, 2, false);
        declareFunction("ket_maybe_find_constant", "KET-MAYBE-FIND-CONSTANT", 1, 0, false);
        declareFunction("ket_make_ke_operation", "KET-MAKE-KE-OPERATION", 2, 6, false);
        declareFunction("ke_text_token_lists_to_ke_operations", "KE-TEXT-TOKEN-LISTS-TO-KE-OPERATIONS", 1, 2, false);
        declareFunction("do_ke_operation", "DO-KE-OPERATION", 1, 1, false);
        declareFunction("new_constant_wrapperp", "NEW-CONSTANT-WRAPPERP", 1, 0, false);
        declareFunction("make_new_constant_wrapper", "MAKE-NEW-CONSTANT-WRAPPER", 1, 0, false);
        declareFunction("resolve_new_constants", "RESOLVE-NEW-CONSTANTS", 1, 0, false);
        declareFunction("ke_text_list_to_ke_operations", "KE-TEXT-LIST-TO-KE-OPERATIONS", 1, 3, false);
        declareFunction("ke_text_file_to_ke_text_list", "KE-TEXT-FILE-TO-KE-TEXT-LIST", 1, 0, false);
        declareFunction("ke_text_to_ke_text_list", "KE-TEXT-TO-KE-TEXT-LIST", 2, 0, false);
        declareFunction("ke_text_to_ke_text_list_internal", "KE-TEXT-TO-KE-TEXT-LIST-INTERNAL", 2, 0, false);
        declareFunction("ke_operations_new_killed_renamed_merged_constant_names", "KE-OPERATIONS-NEW-KILLED-RENAMED-MERGED-CONSTANT-NAMES", 1, 0, false);
        declareFunction("ke_text_error_message", "KE-TEXT-ERROR-MESSAGE", 1, 0, false);
        declareFunction("format_el_sentence_as_ke_text", "FORMAT-EL-SENTENCE-AS-KE-TEXT", 2, 0, false);
        declareFunction("load_ke_text_file", "LOAD-KE-TEXT-FILE", 2, 3, false);
        declareFunction("parse_ke_text_string", "PARSE-KE-TEXT-STRING", 1, 0, false);
        declareFunction("load_ke_text_string", "LOAD-KE-TEXT-STRING", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_ke_text_file_alt() {
        defparameter("*KE-TEXT-ERROR-COUNT-ABORT-NUM*", TEN_INTEGER);
        defparameter("*KET-STRING-TO-DIRECTIVE*", $list_alt8);
        defparameter("*KET-STRING-TO-DIRECTION*", $list_alt9);
        defparameter("*KET-STRING-TO-STRENGTH*", $list_alt10);
        return NIL;
    }

    public static SubLObject init_ke_text_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*KE-TEXT-ERROR-COUNT-ABORT-NUM*", TEN_INTEGER);
            defparameter("*KE-TEXT-FAILURES-LOG-FILE*", NIL);
            defparameter("*KET-STRING-TO-DIRECTIVE*", $list16);
            defparameter("*KET-STRING-TO-DIRECTION*", $list17);
            defparameter("*KET-STRING-TO-STRENGTH*", $list18);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*KET-STRING-TO-DIRECTIVE*", $list_alt8);
            defparameter("*KET-STRING-TO-DIRECTION*", $list_alt9);
            defparameter("*KET-STRING-TO-STRENGTH*", $list_alt10);
        }
        return NIL;
    }

    public static SubLObject init_ke_text_file_Previous() {
        defparameter("*KE-TEXT-ERROR-COUNT-ABORT-NUM*", TEN_INTEGER);
        defparameter("*KE-TEXT-FAILURES-LOG-FILE*", NIL);
        defparameter("*KET-STRING-TO-DIRECTIVE*", $list16);
        defparameter("*KET-STRING-TO-DIRECTION*", $list17);
        defparameter("*KET-STRING-TO-STRENGTH*", $list18);
        return NIL;
    }

    public static final SubLObject setup_ke_text_file_alt() {
        register_cyc_api_function(LOAD_KE_TEXT_FILE, $list_alt158, $str_alt159$Call_the_ke_text_engine_on_a_file, $list_alt160, NIL);
        return NIL;
    }

    public static SubLObject setup_ke_text_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function(LOAD_KE_TEXT_FILE, $list167, $str168$Call_the_ke_text_engine_on_a_file, $list169, NIL);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(LOAD_KE_TEXT_FILE, $list_alt158, $str_alt159$Call_the_ke_text_engine_on_a_file, $list_alt160, NIL);
        }
        return NIL;
    }

    public static SubLObject setup_ke_text_file_Previous() {
        register_cyc_api_function(LOAD_KE_TEXT_FILE, $list167, $str168$Call_the_ke_text_engine_on_a_file, $list169, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ke_text_file();
    }

    @Override
    public void initializeVariables() {
        init_ke_text_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ke_text_file();
    }

    static {
    }

    static private final SubLList $list_alt1 = list(makeString("Aborting: Too many errors found"));

    static private final SubLString $str_alt2$Too_many_close_parenthesis_on_lin = makeString("Too many close parenthesis on line ~A");

    static private final SubLList $list_alt4 = list(makeString("Missing directive"));

    static private final SubLString $str_alt5$Missing_data_for_directive__A = makeString("Missing data for directive ~A");

    static private final SubLString $str_alt6$Unclosed_open_parenthesis_on_line = makeString("Unclosed open parenthesis on line ~A");

    static private final SubLString $str_alt7$Unfinished_expression_at_end_of_f = makeString("Unfinished expression at end of file");

    static private final SubLList $list_alt8 = list(new SubLObject[]{ cons(makeString("constant"), makeKeyword("CONSTANT")), cons(makeString("unit"), makeKeyword("CONSTANT")), cons(makeString("formula"), makeKeyword("FORMULA")), cons(makeString("f"), makeKeyword("FORMULA")), cons(makeString("el"), makeKeyword("FORMULA")), cons(makeString("enter"), makeKeyword("ENTER")), cons(makeString("delete"), makeKeyword("DELETE")), cons(makeString("in mt"), makeKeyword("IN-MT")), cons(makeString("default mt"), makeKeyword("DEFAULT-MT")), cons(makeString("direction"), makeKeyword("DIRECTION")), cons(makeString("d"), makeKeyword("DIRECTION")), cons(makeString("al"), makeKeyword("DIRECTION")), cons(makeString("access level"), makeKeyword("DIRECTION")), cons(makeString("strength"), makeKeyword("STRENGTH")), cons(makeString("truth value"), makeKeyword("STRENGTH")), cons(makeString("tv"), makeKeyword("STRENGTH")), cons(makeString("kill"), $KILL), cons(makeString("rename"), makeKeyword("RENAME")), cons(makeString("include"), makeKeyword("INCLUDE")), cons(makeString("merge"), makeKeyword("MERGE")) });

    static private final SubLList $list_alt9 = list(cons(makeString("forward"), makeKeyword("FORWARD")), cons(makeString("0"), makeKeyword("FORWARD")), cons(makeString("backward"), makeKeyword("BACKWARD")), cons(makeString("4"), makeKeyword("BACKWARD")), cons(makeString("code"), $CODE), cons(makeString("unknown"), makeKeyword("UNKNOWN")));

    static private final SubLList $list_alt10 = list(cons(makeString("default"), makeKeyword("DEFAULT")), cons(makeString("monotonic"), makeKeyword("MONOTONIC")), cons(makeString("unknown"), makeKeyword("UNKNOWN")));

    static private final SubLString $str_alt18$Bad_reference_to_a_killed_or_rena = makeString("Bad reference to a killed or renamed constant (~A)");

    static private final SubLString $str_alt19$A_single_colon_is_an_invalid_keyw = makeString("A single colon is an invalid keyword name");

    static private final SubLString $str_alt20$A_single_question_mark_is_an_inva = makeString("A single question mark is an invalid variable name");

    static private final SubLList $list_alt21 = list(CHAR_quotation);

    static private final SubLString $str_alt25$Bad_number___A_ = makeString("Bad number (~A)");

    static private final SubLString $str_alt28$Constant_not_found___A_ = makeString("Constant not found (~A)");

    static private final SubLString $str_alt29$Couldn_t_figure_out_string___A___ = makeString("Couldn't figure out string (~A) (did you forget a period?)");

    static private final SubLString $str_alt30$Couldn_t_figure_out___A_ = makeString("Couldn't figure out (~A)");

    static private final SubLList $list_alt37 = list(makeString("Unknown directive"));

    static private final SubLList $list_alt39 = list(makeString("Formula: No formula specified"));

    static private final SubLList $list_alt40 = list(makeString("Formula: Formula specified must be a list"));

    static private final SubLList $list_alt42 = list(makeString("Constant: No constant specified"));

    static private final SubLList $list_alt43 = list(makeString("Constant: Only one constant may be specified"));

    static private final SubLList $list_alt44 = list(makeString("Constant: Invalid constant name"));

    static private final SubLString $str_alt46$Constant__Unrecognized_constant__ = makeString("Constant: Unrecognized constant (~A)");

    static private final SubLList $list_alt48 = list(makeString("Kill: No constant specified"));

    static private final SubLList $list_alt49 = list(makeString("Kill: Only one constant may be specified"));

    static private final SubLList $list_alt50 = list(makeString("Kill: Can't kill a NART."));

    static private final SubLList $list_alt51 = list(makeString("Kill: Constant name must be a string."));

    static private final SubLList $list_alt52 = list(makeString("Kill: Constant already killed."));

    static private final SubLString $str_alt53$Kill__Unrecognized_constant___A_ = makeString("Kill: Unrecognized constant (~A)");

    static private final SubLList $list_alt55 = list(makeString("Rename: Nothing to rename"));

    static private final SubLList $list_alt56 = list(makeString("Rename: Old constant name not specified"));

    static private final SubLList $list_alt57 = list(makeString("Rename: Can't rename NATs"));

    static private final SubLList $list_alt58 = list(makeString("Rename: Old constant name must be a string"));

    static private final SubLString $str_alt59$Rename__Can_t_rename_a_constant_r = makeString("Rename: Can't rename a constant recently killed or renamed (~A)");

    static private final SubLList $list_alt60 = list(makeString("Rename: New constant name must be a string"));

    static private final SubLList $list_alt61 = list(makeString("Rename: New constant name must be a string inside double quotes."));

    static private final SubLList $list_alt62 = list(makeString("Rename: New constant name is not a valid name for a constant."));

    static private final SubLString $str_alt63$Rename__Can_t_rename_to_constant_ = makeString("Rename: Can't rename to constant recently created (~A)");

    static private final SubLString $str_alt64$Rename__Can_t_rename_to_existing_ = makeString("Rename: Can't rename to existing constant in KB (~A)");

    static private final SubLString $str_alt66$Rename__Unrecognized_constant___A = makeString("Rename: Unrecognized constant (~A)");

    static private final SubLList $list_alt68 = list(makeString("Merge: Nothing to merge"));

    static private final SubLList $list_alt69 = list(makeString("Merge: No kill term given"));

    static private final SubLList $list_alt70 = list(makeString("Merge: Can't merge from killed term"));

    static private final SubLList $list_alt71 = list(makeString("Merge: Kill term must be a FORT"));

    static private final SubLList $list_alt72 = list(makeString("Merge: No keep term given"));

    static private final SubLList $list_alt73 = list(makeString("Merge: Can't merge onto killed term"));

    static private final SubLList $list_alt74 = list(makeString("Merge: Keep term must be a FORT"));

    static private final SubLList $list_alt76 = list(makeString("In Mt: No mt specified"));

    static private final SubLString $str_alt77$In_Mt__NAT_mt_must_be_a_hlmt_p___ = makeString("In Mt: NAT mt must be a hlmt-p (~A)");

    static private final SubLString $str_alt78$In_Mt__Unrecognized_mt___A_ = makeString("In Mt: Unrecognized mt (~A)");

    static private final SubLList $list_alt80 = list(makeString("Default-Mt: No mt specified"));

    static private final SubLString $str_alt81$Default_Mt__NAT_mt_must_be_a_hlmt = makeString("Default Mt: NAT mt must be a hlmt-p (~A)");

    static private final SubLString $str_alt82$Default_Mt__Unrecognized_mt___A_ = makeString("Default Mt: Unrecognized mt (~A)");

    static private final SubLList $list_alt84 = list(makeString("Strength: No strength specified"));

    static private final SubLString $str_alt85$Strength__Unrecognized_strength__ = makeString("Strength: Unrecognized strength (~A)");

    static private final SubLList $list_alt87 = list(makeString("Direction: No direction specified"));

    static private final SubLString $str_alt88$Direction__Unrecognized_direction = makeString("Direction: Unrecognized direction (~A)");

    static private final SubLList $list_alt90 = list(makeString("Include: No file specified"));

    static private final SubLString $str_alt91$Include__File_not_found___A___Can = makeString("Include: File not found (~A) (Can't include relative file path from Compose)");

    static private final SubLString $str_alt92$Include__File_not_found___A____A_ = makeString("Include: File not found (~A) (~A)");

    static private final SubLSymbol $sym93$STRING_ = makeSymbol("STRING=");

    static private final SubLList $list_alt94 = list(makeString("Unrecognized predicate"));

    static private final SubLList $list_alt95 = list(makeString("NAT predicates unsupported"));

    static private final SubLString $str_alt99$Unexpected_argument_to_unary_pred = makeString("Unexpected argument to unary predicate (~A)");

    static private final SubLString $str_alt100$No_argument_found_for_binary_pred = makeString("No argument found for binary predicate (~A)");

    static private final SubLString $str_alt101$No_argument_found_for_arity__A_pr = makeString("No argument found for arity ~A predicate (~A)");

    static private final SubLString $str_alt102$List_argument_expected_for_arity_ = makeString("List argument expected for arity ~A predicate (~A)");

    static private final SubLString $str_alt103$Unexpected_argument_for_predicate = makeString("Unexpected argument for predicate (~A)");

    static private final SubLList $list_alt118 = list(list(QUOTE, reader_make_constant_shell("BookkeepingMt")));

    static private final SubLString $str_alt121$Constant_does_not_exist___A_ = makeString("Constant does not exist (~A)");

    static private final SubLString $str_alt122$_new_constant_must_be_followed_by = makeString(":new-constant must be followed by a string or constant");

    static private final SubLList $list_alt123 = list(ZERO_INTEGER, ZERO_INTEGER, makeString("Filename is not a string"));

    static private final SubLList $list_alt124 = list(ZERO_INTEGER, ZERO_INTEGER, makeString("Filename is null string"));

    static private final SubLString $str_alt126$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt129 = list(NIL);

    static private final SubLString $str_alt131$_A__ = makeString("~A: ");

    static private final SubLString $str_alt132$_A__A__ = makeString("~A-~A: ");

    static private final SubLString $str_alt133$_A___ = makeString("~A-: ");

    static private final SubLString $str_alt134$__A__ = makeString("-~A: ");

    static private final SubLString $str_alt135$___ = makeString("?: ");

    static private final SubLString $str_alt136$_A = makeString("~A");

    static private final SubLString $str_alt137$el_ = makeString("el:");

    static private final SubLString $str_alt138$____ = makeString(" .~%");

    static private final SubLString $str_alt140$__Sorry___s_is_not_known_to_be_a_ = makeString("~%Sorry, ~s is not known to be a Cyclist.");

    static private final SubLString $str_alt141$_A__ = makeString("~A~%");

    static private final SubLList $list_alt146 = list(makeString(" or "));

    static private final SubLList $list_alt147 = list(makeString(", "), makeString(", or "));

    static private final SubLList $list_alt148 = list(makeString(", "), makeString(", "), makeString(" or "));

    static private final SubLString $str_alt149$The_following_constants_will_be_ = makeString("The following constants will be ");

    static private final SubLString $str_alt150$_ = makeString(":");

    static private final SubLString $str_alt151$__ = makeString("~%");

    static private final SubLString $str_alt152$__Create___A__ = makeString("  Create: ~A~%");

    static private final SubLString $str_alt153$__Kill___A__ = makeString("  Kill: ~A~%");

    static private final SubLString $str_alt154$__Rename___A_to__A__ = makeString("  Rename: ~A to ~A~%");

    static private final SubLString $str_alt155$Would_you_like_to_evaluate_the__A = makeString("Would you like to evaluate the ~A forms above? ");

    static private final SubLString $str_alt156$Evaluating__A_forms_____ = makeString("Evaluating ~A forms...~%");

    static private final SubLList $list_alt158 = list(makeSymbol("CYCLIST"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("METHOD"), makeKeyword("AGENDA")), makeSymbol("NO-USER-INTERACTION?"));

    static private final SubLString $str_alt159$Call_the_ke_text_engine_on_a_file = makeString("Call the ke text engine on a file from the lisp interactor.\n@param CYCLIST (string or constant) \n@param FILENAME string\n@param METHOD keyword ;; can be :agenda or :now.\n@param NO-USER-INTERACTION? boolean ;; if non nil, then the confirming question is not asked.\n");

    static private final SubLList $list_alt160 = list(list(makeSymbol("FILENAME"), makeSymbol("STRINGP")));
}

/**
 * Total time: 1462 ms
 */
