package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_text extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ke_text";
    public static final String myFingerPrint = "525c8166049655251f365db83a6c6f90291a98b017a110d2130c34102c454f0f";
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 997L)
    private static SubLSymbol $ke_text_error_count_abort_num$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 1218L)
    public static SubLSymbol $ke_text_failures_log_file$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 9061L)
    private static SubLSymbol $ket_string_to_directive$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 10491L)
    private static SubLSymbol $ket_string_to_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 10803L)
    private static SubLSymbol $ket_string_to_strength$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PIF;
    private static final SubLSymbol $sym2$FILE_VALID_FOR_WRITING_P;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLSymbol $sym4$_KE_TEXT_FAILURES_LOG_FILE_;
    private static final SubLSymbol $sym5$PROGN;
    private static final SubLSymbol $sym6$WARN;
    private static final SubLString $str7$Unable_to_log_failures_to__S_beca;
    private static final SubLSymbol $kw8$END_OF_DIRECTIVE;
    private static final SubLList $list9;
    private static final SubLString $str10$Too_many_close_parenthesis_on_lin;
    private static final SubLSymbol $kw11$END_OF_DATA;
    private static final SubLList $list12;
    private static final SubLString $str13$Missing_data_for_directive__A;
    private static final SubLString $str14$Unclosed_open_parenthesis_on_line;
    private static final SubLString $str15$Unfinished_expression_at_end_of_f;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$MONOTONIC;
    private static final SubLSymbol $kw20$DEFAULT;
    private static final SubLObject $const21$DefaultMonotonicPredicate;
    private static final SubLSymbol $kw22$FORWARD;
    private static final SubLSymbol $kw23$BACKWARD;
    private static final SubLSymbol $kw24$CODE;
    private static final SubLString $str25$Something_is_nil;
    private static final SubLString $str26$Bad_reference_to_a_killed_or_rena;
    private static final SubLString $str27$A_single_colon_is_an_invalid_keyw;
    private static final SubLString $str28$A_single_question_mark_is_an_inva;
    private static final SubLList $list29;
    private static final SubLString $str30$Malformed_string;
    private static final SubLString $str31$Gratutuious_single_quote;
    private static final SubLSymbol $kw32$DOT_FOR_DOTTED_LIST;
    private static final SubLString $str33$Bad_number___A_;
    private static final SubLString $str34$nil;
    private static final SubLString $str35$t;
    private static final SubLString $str36$Constant_not_found___A_;
    private static final SubLString $str37$Couldn_t_figure_out_string___A___;
    private static final SubLString $str38$Couldn_t_figure_out___A_;
    private static final SubLSymbol $kw39$ENTER;
    private static final SubLString $str40$TheAssertionSentence;
    private static final SubLString $str41$__TheAssertionSentence;
    private static final SubLString $str42$Formula____TheAssertionSentence_i;
    private static final SubLString $str43$Microtheory_not_specified;
    private static final SubLString $str44$Invalid_dotted_list;
    private static final SubLSymbol $kw45$DELETE;
    private static final SubLSymbol $kw46$UNASSERT;
    private static final SubLSymbol $kw47$ASSERT;
    private static final SubLList $list48;
    private static final SubLSymbol $kw49$FORMULA;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $kw52$CONSTANT;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLString $str56$Constant__Constant_already_exists;
    private static final SubLSymbol $kw57$CREATE;
    private static final SubLString $str58$Constant__Unrecognized_constant__;
    private static final SubLSymbol $kw59$KILL;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$RENAME;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLString $str70$Rename__Can_t_rename_a_constant_r;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLString $str74$Rename__Can_t_rename_to_constant_;
    private static final SubLString $str75$Rename__Can_t_rename_to_existing_;
    private static final SubLSymbol $kw76$NEW_CONSTANT;
    private static final SubLString $str77$Rename__Unrecognized_constant___A;
    private static final SubLSymbol $kw78$MERGE;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $kw86$IN_MT;
    private static final SubLList $list87;
    private static final SubLString $str88$In_Mt__NAT_mt_must_be_a_hlmt_p___;
    private static final SubLString $str89$In_Mt__Unrecognized_mt___A_;
    private static final SubLSymbol $kw90$DEFAULT_MT;
    private static final SubLList $list91;
    private static final SubLString $str92$Default_Mt__NAT_mt_must_be_a_hlmt;
    private static final SubLString $str93$Default_Mt__Unrecognized_mt___A_;
    private static final SubLSymbol $kw94$STRENGTH;
    private static final SubLList $list95;
    private static final SubLString $str96$Strength__Unrecognized_strength__;
    private static final SubLSymbol $kw97$DIRECTION;
    private static final SubLList $list98;
    private static final SubLString $str99$Direction__Unrecognized_direction;
    private static final SubLSymbol $sym100$STRING_;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const104$EverythingPSC;
    private static final SubLString $str105$Constant_must_be_specified;
    private static final SubLString $str106$Unexpected_argument_to_unary_pred;
    private static final SubLString $str107$No_argument_found_for_binary_pred;
    private static final SubLString $str108$No_argument_found_for_arity__A_pr;
    private static final SubLString $str109$List_argument_expected_for_arity_;
    private static final SubLString $str110$Unexpected_argument_for_predicate;
    private static final SubLSymbol $kw111$AGENDA;
    private static final SubLSymbol $sym112$FI_CREATE;
    private static final SubLSymbol $sym113$FI_TIMESTAMP_CONSTANT;
    private static final SubLSymbol $sym114$QUOTE;
    private static final SubLSymbol $kw115$NOW;
    private static final SubLSymbol $sym116$RESOLVE_NEW_CONSTANTS;
    private static final SubLSymbol $sym117$FI_ASSERT;
    private static final SubLSymbol $sym118$FI_TIMESTAMP_ASSERTION;
    private static final SubLSymbol $sym119$FI_UNASSERT;
    private static final SubLSymbol $sym120$FI_RENAME;
    private static final SubLObject $const121$oldConstantName;
    private static final SubLObject $const122$BookkeepingMt;
    private static final SubLSymbol $sym123$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $kw124$GAF;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$FI_KILL;
    private static final SubLSymbol $sym127$FI_MERGE;
    private static final SubLString $str128$Constant_does_not_exist___A_;
    private static final SubLString $str129$_new_constant_must_be_followed_by;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLSymbol $kw132$INPUT;
    private static final SubLString $str133$Unable_to_open__S;
    private static final SubLSymbol $sym134$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw135$EOF;
    private static final SubLList $list136;
    private static final SubLString $str137$;
    private static final SubLString $str138$_A__;
    private static final SubLString $str139$_A__A__;
    private static final SubLString $str140$_A___;
    private static final SubLString $str141$__A__;
    private static final SubLString $str142$___;
    private static final SubLString $str143$_A;
    private static final SubLString $str144$el_;
    private static final SubLString $str145$____;
    private static final SubLSymbol $kw146$NORMAL;
    private static final SubLSymbol $sym147$STRINGP;
    private static final SubLString $str148$__Sorry___s_is_not_known_to_be_a_;
    private static final SubLString $str149$_A__;
    private static final SubLString $str150$merged;
    private static final SubLString $str151$renamed;
    private static final SubLString $str152$killed;
    private static final SubLString $str153$created;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLList $list156;
    private static final SubLSymbol $kw157$QUIET;
    private static final SubLString $str158$The_following_constants_will_be_;
    private static final SubLString $str159$_;
    private static final SubLString $str160$__;
    private static final SubLString $str161$__Create___A__;
    private static final SubLString $str162$__Kill___A__;
    private static final SubLString $str163$__Rename___A_to__A__;
    private static final SubLString $str164$Evaluating__A_forms_____;
    private static final SubLSymbol $kw165$APPEND;
    private static final SubLSymbol $sym166$LOAD_KE_TEXT_FILE;
    private static final SubLList $list167;
    private static final SubLString $str168$Call_the_ke_text_engine_on_a_file;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLSymbol $kw171$KE_OPERATIONS;
    private static final SubLSymbol $kw172$ERROR_LISTS;
    private static final SubLList $list173;
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 1401L)
    public static SubLObject with_ke_text_failures_to_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filename = (SubLObject)ke_text.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ke_text.$list0);
        filename = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym1$PIF, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym2$FILE_VALID_FOR_WRITING_P, filename), (SubLObject)ConsesLow.listS((SubLObject)ke_text.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym4$_KE_TEXT_FAILURES_LOG_FILE_, filename)), ConsesLow.append(body, (SubLObject)ke_text.NIL)), (SubLObject)ConsesLow.listS((SubLObject)ke_text.$sym5$PROGN, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym6$WARN, (SubLObject)ke_text.$str7$Unable_to_log_failures_to__S_beca, filename), ConsesLow.append(body, (SubLObject)ke_text.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 1832L)
    public static SubLObject ke_text_list_to_token_lists(final SubLObject ke_text_list, SubLObject filename) {
        if (filename == ke_text.UNPROVIDED) {
            filename = (SubLObject)ke_text.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject token_lists = (SubLObject)ke_text.NIL;
        SubLObject error_lists = (SubLObject)ke_text.NIL;
        SubLObject line_number_start = (SubLObject)ke_text.ONE_INTEGER;
        SubLObject line_number_end = (SubLObject)ke_text.ZERO_INTEGER;
        SubLObject char_list = (SubLObject)ke_text.NIL;
        SubLObject the_directive = (SubLObject)ke_text.NIL;
        SubLObject the_data = (SubLObject)ke_text.NIL;
        SubLObject looking_for = (SubLObject)ke_text.$kw8$END_OF_DIRECTIVE;
        SubLObject ignore_whitespaceP = (SubLObject)ke_text.T;
        SubLObject next_char_quotedP = (SubLObject)ke_text.NIL;
        SubLObject inside_stringP = (SubLObject)ke_text.NIL;
        SubLObject inside_commentP = (SubLObject)ke_text.NIL;
        SubLObject paren_depth = (SubLObject)ke_text.ZERO_INTEGER;
        SubLObject last_paren_line = (SubLObject)ke_text.NIL;
        SubLObject had_bad_directiveP = (SubLObject)ke_text.NIL;
        SubLObject had_bad_dataP = (SubLObject)ke_text.NIL;
        SubLObject abortP = (SubLObject)ke_text.NIL;
        if (!filename.isString()) {
            filename = (SubLObject)ke_text.NIL;
        }
        if (ke_text.NIL == abortP) {
            SubLObject csome_list_var = ke_text_list;
            SubLObject text_line = (SubLObject)ke_text.NIL;
            text_line = csome_list_var.first();
            while (ke_text.NIL == abortP && ke_text.NIL != csome_list_var) {
                if (Sequences.length(error_lists).numG(ke_text.$ke_text_error_count_abort_num$.getDynamicValue(thread))) {
                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list9), error_lists);
                    abortP = (SubLObject)ke_text.T;
                }
                final SubLObject text_line_length = Sequences.length(text_line);
                line_number_end = Numbers.add(line_number_end, (SubLObject)ke_text.ONE_INTEGER);
                if (text_line_length.numE((SubLObject)ke_text.ZERO_INTEGER) && line_number_start.numE(line_number_end)) {
                    line_number_start = Numbers.add(line_number_start, (SubLObject)ke_text.ONE_INTEGER);
                }
                if (ke_text.NIL != char_list) {
                    if (ke_text.NIL != inside_stringP) {
                        char_list = (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_newline, char_list);
                    }
                    else {
                        char_list = (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_space, char_list);
                    }
                }
                inside_commentP = (SubLObject)ke_text.NIL;
                ignore_whitespaceP = (SubLObject)ke_text.T;
                SubLObject char_number;
                SubLObject this_char;
                SubLObject directive_s_poss;
                SubLObject directive_s;
                SubLObject error_strings;
                SubLObject cdolist_list_var;
                SubLObject error_string;
                SubLObject data_s_poss;
                SubLObject data;
                for (char_number = (SubLObject)ke_text.NIL, char_number = (SubLObject)ke_text.ZERO_INTEGER; !char_number.numE(text_line_length); char_number = Numbers.add(char_number, (SubLObject)ke_text.ONE_INTEGER)) {
                    this_char = Strings.sublisp_char(text_line, char_number);
                    if (ke_text.NIL == ignore_whitespaceP || ke_text.NIL == string_utilities.whitespacep(this_char)) {
                        ignore_whitespaceP = (SubLObject)ke_text.NIL;
                        if (!this_char.equal((SubLObject)Characters.CHAR_return)) {
                            if (!ke_text.T.equal(inside_commentP)) {
                                if (ke_text.T.equal(next_char_quotedP)) {
                                    char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                    next_char_quotedP = (SubLObject)ke_text.NIL;
                                }
                                else if (this_char.eql((SubLObject)Characters.CHAR_backslash)) {
                                    char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                    next_char_quotedP = (SubLObject)ke_text.T;
                                }
                                else if (ke_text.T.equal(inside_stringP)) {
                                    char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                    if (this_char.eql((SubLObject)Characters.CHAR_quotation)) {
                                        inside_stringP = (SubLObject)ke_text.NIL;
                                    }
                                }
                                else if (this_char.eql((SubLObject)Characters.CHAR_quotation)) {
                                    char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                    inside_stringP = (SubLObject)ke_text.T;
                                }
                                else if (this_char.eql((SubLObject)Characters.CHAR_semicolon)) {
                                    inside_commentP = (SubLObject)ke_text.T;
                                }
                                else if (this_char.eql((SubLObject)Characters.CHAR_lparen)) {
                                    char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                    if (ke_text.NIL == last_paren_line) {
                                        last_paren_line = line_number_end;
                                    }
                                    paren_depth = Numbers.add(paren_depth, (SubLObject)ke_text.ONE_INTEGER);
                                }
                                else if (this_char.eql((SubLObject)Characters.CHAR_rparen)) {
                                    char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                    paren_depth = Numbers.subtract(paren_depth, (SubLObject)ke_text.ONE_INTEGER);
                                    if (paren_depth.numE((SubLObject)ke_text.ZERO_INTEGER)) {
                                        last_paren_line = (SubLObject)ke_text.NIL;
                                    }
                                    if (paren_depth.numL((SubLObject)ke_text.ZERO_INTEGER)) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str10$Too_many_close_parenthesis_on_lin, line_number_end)), error_lists);
                                    }
                                }
                                else if (!paren_depth.numE((SubLObject)ke_text.ZERO_INTEGER)) {
                                    char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                }
                                else if (this_char.eql((SubLObject)Characters.CHAR_colon)) {
                                    if (looking_for == ke_text.$kw11$END_OF_DATA) {
                                        char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                    }
                                    else {
                                        if (ke_text.NIL == char_list) {
                                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list12), error_lists);
                                        }
                                        else {
                                            directive_s_poss = string_utilities.char_list_to_string(Sequences.nreverse(char_list));
                                            char_list = (SubLObject)ke_text.NIL;
                                            thread.resetMultipleValues();
                                            directive_s = string_utilities.listify_string(directive_s_poss, (SubLObject)ke_text.UNPROVIDED);
                                            error_strings = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (ke_text.NIL != error_strings) {
                                                cdolist_list_var = error_strings;
                                                error_string = (SubLObject)ke_text.NIL;
                                                error_string = cdolist_list_var.first();
                                                while (ke_text.NIL != cdolist_list_var) {
                                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string, directive_s_poss), error_lists);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    error_string = cdolist_list_var.first();
                                                }
                                                had_bad_directiveP = (SubLObject)ke_text.T;
                                            }
                                            else {
                                                looking_for = (SubLObject)ke_text.$kw11$END_OF_DATA;
                                                the_directive = directive_s;
                                            }
                                        }
                                        ignore_whitespaceP = (SubLObject)ke_text.T;
                                        char_list = (SubLObject)ke_text.NIL;
                                    }
                                }
                                else if (this_char.eql((SubLObject)Characters.CHAR_period)) {
                                    if (looking_for == ke_text.$kw8$END_OF_DIRECTIVE) {
                                        if (ke_text.NIL == char_list) {
                                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list12), error_lists);
                                        }
                                        else {
                                            directive_s_poss = string_utilities.char_list_to_string(Sequences.nreverse(char_list));
                                            char_list = (SubLObject)ke_text.NIL;
                                            thread.resetMultipleValues();
                                            directive_s = string_utilities.listify_string(directive_s_poss, (SubLObject)ke_text.UNPROVIDED);
                                            error_strings = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (ke_text.NIL != error_strings) {
                                                cdolist_list_var = error_strings;
                                                error_string = (SubLObject)ke_text.NIL;
                                                error_string = cdolist_list_var.first();
                                                while (ke_text.NIL != cdolist_list_var) {
                                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string, directive_s_poss), error_lists);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    error_string = cdolist_list_var.first();
                                                }
                                                had_bad_directiveP = (SubLObject)ke_text.T;
                                            }
                                            else {
                                                the_directive = directive_s;
                                            }
                                        }
                                    }
                                    else if (ke_text.NIL == char_list) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str13$Missing_data_for_directive__A, the_directive)), error_lists);
                                    }
                                    else {
                                        data_s_poss = string_utilities.char_list_to_string(Sequences.nreverse(char_list));
                                        char_list = (SubLObject)ke_text.NIL;
                                        thread.resetMultipleValues();
                                        data = string_utilities.listify_string(data_s_poss, (SubLObject)ke_text.UNPROVIDED);
                                        error_strings = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (ke_text.NIL != error_strings) {
                                            cdolist_list_var = error_strings;
                                            error_string = (SubLObject)ke_text.NIL;
                                            error_string = cdolist_list_var.first();
                                            while (ke_text.NIL != cdolist_list_var) {
                                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string, data_s_poss), error_lists);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                error_string = cdolist_list_var.first();
                                            }
                                            had_bad_dataP = (SubLObject)ke_text.T;
                                        }
                                        else {
                                            the_data = data;
                                        }
                                    }
                                    if (ke_text.NIL == had_bad_directiveP && ke_text.NIL == had_bad_dataP) {
                                        token_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, the_directive, the_data), token_lists);
                                    }
                                    the_directive = (SubLObject)ke_text.NIL;
                                    the_data = (SubLObject)ke_text.NIL;
                                    had_bad_dataP = (SubLObject)ke_text.NIL;
                                    had_bad_directiveP = (SubLObject)ke_text.NIL;
                                    char_list = (SubLObject)ke_text.NIL;
                                    ignore_whitespaceP = (SubLObject)ke_text.T;
                                    looking_for = (SubLObject)ke_text.$kw8$END_OF_DIRECTIVE;
                                    line_number_start = Numbers.add((SubLObject)ke_text.ONE_INTEGER, line_number_end);
                                }
                                else {
                                    char_list = (SubLObject)ConsesLow.cons(this_char, char_list);
                                }
                            }
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                text_line = csome_list_var.first();
            }
        }
        if (ke_text.NIL != char_list) {
            if (paren_depth.numG((SubLObject)ke_text.ZERO_INTEGER)) {
                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str14$Unclosed_open_parenthesis_on_line, last_paren_line)), error_lists);
            }
            else {
                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str15$Unfinished_expression_at_end_of_f, string_utilities.char_list_to_string(Sequences.nreverse(char_list)))), error_lists);
            }
        }
        return Values.values(Sequences.nreverse(token_lists), Sequences.nreverse(error_lists));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 11017L)
    public static SubLObject ket_lookup_string(final SubLObject string_list, final SubLObject assoc) {
        SubLObject cdolist_list_var = string_list;
        SubLObject string = (SubLObject)ke_text.NIL;
        string = cdolist_list_var.first();
        while (ke_text.NIL != cdolist_list_var) {
            if (!string.isString()) {
                return (SubLObject)ke_text.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        SubLObject key_string = Strings.string_downcase(string_utilities.bunge(string_list, (SubLObject)ke_text.UNPROVIDED), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
        if (ke_text.NIL != Characters.charE((SubLObject)Characters.CHAR_colon, Strings.sublisp_char(key_string, (SubLObject)ke_text.ZERO_INTEGER))) {
            key_string = string_utilities.substring(key_string, (SubLObject)ke_text.ONE_INTEGER, Sequences.length(key_string));
        }
        final SubLObject possible_keyword = conses_high.assoc(key_string, assoc, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED);
        if (ke_text.NIL != possible_keyword) {
            return possible_keyword.rest();
        }
        return (SubLObject)ke_text.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 11774L)
    public static SubLObject ket_directive_list_to_directive(final SubLObject directive_list, SubLObject new_constant_names) {
        if (new_constant_names == ke_text.UNPROVIDED) {
            new_constant_names = (SubLObject)ke_text.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_stringsP = (SubLObject)ke_text.T;
        SubLObject cdolist_list_var = directive_list;
        SubLObject directive_thing = (SubLObject)ke_text.NIL;
        directive_thing = cdolist_list_var.first();
        while (ke_text.NIL != cdolist_list_var) {
            if (!directive_thing.isString()) {
                all_stringsP = (SubLObject)ke_text.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            directive_thing = cdolist_list_var.first();
        }
        if (ke_text.NIL != all_stringsP) {
            final SubLObject directive_string = string_utilities.bunge(directive_list, (SubLObject)ke_text.UNPROVIDED);
            final SubLObject possible_keyword = conses_high.assoc(Strings.string_downcase(directive_string, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED), ke_text.$ket_string_to_directive$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED).rest();
            final SubLObject possible_predicate = ke_utilities.fort_from_string(directive_string);
            if (ke_text.NIL != possible_keyword) {
                return possible_keyword;
            }
            if (ke_text.NIL != fort_types_interface.predicate_in_any_mtP(possible_predicate)) {
                return possible_predicate;
            }
            if (ke_text.NIL != conses_high.member(directive_string, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                return make_new_constant_wrapper(directive_string);
            }
        }
        else if (ke_text.ONE_INTEGER.equal(Sequences.length(directive_list))) {
            final SubLObject possible_nat_predicate = narts_high.find_nart(ket_unknown_to_known(directive_list.first(), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED));
            if (ke_text.NIL != fort_types_interface.predicate_in_any_mtP(possible_nat_predicate)) {
                return possible_nat_predicate;
            }
        }
        return (SubLObject)ke_text.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 13061L)
    public static SubLObject ket_relevant_mt(final SubLObject current_mt, final SubLObject current_default_mt, final SubLObject new_constant_names) {
        final SubLObject possible_mt = (ke_text.NIL != current_mt) ? current_mt : current_default_mt;
        if (ke_text.NIL == possible_mt) {
            return (SubLObject)ke_text.NIL;
        }
        if (ke_text.NIL != Eval.constantp(possible_mt, (SubLObject)ke_text.UNPROVIDED)) {
            return possible_mt;
        }
        if (ke_text.NIL != hlmt.hlmt_p(possible_mt)) {
            return possible_mt;
        }
        if (possible_mt.isString() && ke_text.NIL != conses_high.member(possible_mt, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
            return make_new_constant_wrapper(possible_mt);
        }
        if (!possible_mt.isList()) {
            return (SubLObject)ke_text.NIL;
        }
        final SubLObject possible_nart_mt = narts_high.find_nart(possible_mt);
        if (ke_text.NIL != hlmt.hlmt_p(possible_nart_mt)) {
            return possible_nart_mt;
        }
        if (ke_text.NIL != new_constant_wrapperp(possible_mt)) {
            return possible_mt;
        }
        return possible_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 14196L)
    public static SubLObject ket_relevant_strength(final SubLObject override_strength, final SubLObject pred) {
        if (ke_text.$kw19$MONOTONIC == override_strength) {
            return override_strength;
        }
        if (ke_text.$kw20$DEFAULT == override_strength) {
            return override_strength;
        }
        if (ke_text.NIL != forts.fort_p(pred) && ke_text.NIL != isa.isa_in_any_mtP(pred, ke_text.$const21$DefaultMonotonicPredicate)) {
            return (SubLObject)ke_text.$kw19$MONOTONIC;
        }
        return (SubLObject)ke_text.$kw20$DEFAULT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 14761L)
    public static SubLObject ket_relevant_direction(final SubLObject override_direction, final SubLObject formula) {
        if (ke_text.$kw22$FORWARD == override_direction) {
            return override_direction;
        }
        if (ke_text.$kw23$BACKWARD == override_direction) {
            return override_direction;
        }
        if (ke_text.$kw24$CODE == override_direction) {
            return override_direction;
        }
        return (SubLObject)ke_text.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 15573L)
    public static SubLObject ket_unknown_to_known(final SubLObject unknown, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (new_constant_names == ke_text.UNPROVIDED) {
            new_constant_names = (SubLObject)ke_text.NIL;
        }
        if (killed_constant_names == ke_text.UNPROVIDED) {
            killed_constant_names = (SubLObject)ke_text.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known = (SubLObject)ke_text.NIL;
        SubLObject error_strings = (SubLObject)ke_text.NIL;
        if (ke_text.NIL == unknown) {
            error_strings = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str25$Something_is_nil, error_strings);
            known = unknown;
        }
        else if (ke_text.NIL != forts.fort_p(unknown)) {
            known = unknown;
        }
        else if (unknown.isNumber()) {
            known = unknown;
        }
        else if (unknown.isKeyword()) {
            known = unknown;
        }
        else if (unknown.isSymbol()) {
            known = unknown;
        }
        else if (unknown.isList()) {
            if (ke_text.NIL != new_constant_wrapperp(unknown)) {
                return unknown;
            }
            SubLObject cdolist_list_var = unknown;
            SubLObject unknown_item = (SubLObject)ke_text.NIL;
            unknown_item = cdolist_list_var.first();
            while (ke_text.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject known_item = ket_unknown_to_known(unknown_item, new_constant_names, killed_constant_names);
                final SubLObject more_error_strings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                error_strings = ConsesLow.append(more_error_strings, error_strings);
                known = (SubLObject)ConsesLow.cons(known_item, known);
                cdolist_list_var = cdolist_list_var.rest();
                unknown_item = cdolist_list_var.first();
            }
            known = Sequences.nreverse(known);
        }
        else if (ke_text.NIL != unicode_strings.non_ascii_string_p(unknown)) {
            known = unicode_nauts.unicode_string_to_cycl_safe_string(unknown);
        }
        else if (unknown.isString()) {
            final SubLObject possible_constant_name = string_utilities.string_remove_constant_reader_prefix(unknown);
            final SubLObject first_char = string_utilities.first_char(unknown);
            if (ke_text.NIL != conses_high.member(unknown, killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                error_strings = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str26$Bad_reference_to_a_killed_or_rena, unknown), error_strings);
            }
            else if (ke_text.NIL != Characters.charE((SubLObject)Characters.CHAR_colon, first_char)) {
                if (ke_text.ONE_INTEGER.numL(Sequences.length(unknown))) {
                    known = string_utilities.keyword_from_string(Strings.string_upcase(string_utilities.substring(unknown, (SubLObject)ke_text.ONE_INTEGER, Sequences.length(unknown)), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED));
                }
                else {
                    error_strings = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str27$A_single_colon_is_an_invalid_keyw, error_strings);
                }
            }
            else if (ke_text.NIL != Characters.charE((SubLObject)Characters.CHAR_question, first_char)) {
                if (ke_text.ONE_INTEGER.numL(Sequences.length(unknown))) {
                    known = cycl_variables.make_el_var(unknown);
                }
                else {
                    error_strings = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str28$A_single_question_mark_is_an_inva, error_strings);
                }
            }
            else if (ke_text.NIL != Characters.charE((SubLObject)Characters.CHAR_quotation, first_char)) {
                if (Sequences.length(unknown).numG((SubLObject)ke_text.ONE_INTEGER) && Characters.CHAR_quotation.eql(string_utilities.last_char(unknown))) {
                    known = string_utilities.string_trim_symmetric_n((SubLObject)ke_text.$list29, unknown, (SubLObject)ke_text.ONE_INTEGER);
                    if (ke_text.NIL != unicode_strings.non_ascii_string_p(known)) {
                        known = unicode_nauts.non_ascii_string_to_unicode(known);
                    }
                }
                else {
                    error_strings = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str30$Malformed_string, error_strings);
                }
            }
            else if (ke_text.NIL != Characters.charE((SubLObject)Characters.CHAR_quote, first_char)) {
                if (ke_text.ONE_INTEGER.numL(Sequences.length(unknown))) {
                    known = Packages.intern(Strings.string_upcase(string_utilities.substring(unknown, (SubLObject)ke_text.ONE_INTEGER, Sequences.length(unknown)), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED), (SubLObject)ke_text.UNPROVIDED);
                }
                else {
                    error_strings = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str31$Gratutuious_single_quote, error_strings);
                }
            }
            else if (ke_text.NIL != Characters.charE((SubLObject)Characters.CHAR_period, first_char) && ke_text.ONE_INTEGER.numE(Sequences.length(unknown))) {
                known = (SubLObject)ke_text.$kw32$DOT_FOR_DOTTED_LIST;
            }
            else if (ke_text.NIL != conses_high.member(unknown, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                known = make_new_constant_wrapper(unknown);
            }
            else if (ke_text.NIL != number_utilities.number_string_p(unknown)) {
                final SubLObject possible_number = reader.read_from_string_ignoring_errors(unknown, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                if (ke_text.NIL != possible_number) {
                    known = possible_number;
                }
                else {
                    known = unknown;
                    error_strings = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str33$Bad_number___A_, unknown), error_strings);
                }
            }
            else if (Strings.string_downcase(unknown, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED).equal((SubLObject)ke_text.$str34$nil)) {
                known = (SubLObject)ke_text.NIL;
            }
            else if (Strings.string_downcase(unknown, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED).equal((SubLObject)ke_text.$str35$t)) {
                known = (SubLObject)ke_text.T;
            }
            else if (ke_text.NIL != constant_completion_high.valid_constant_name_p(possible_constant_name)) {
                final SubLObject possible_constant = ket_maybe_find_constant(possible_constant_name);
                if (ke_text.NIL != constant_handles.valid_constantP(possible_constant, (SubLObject)ke_text.UNPROVIDED)) {
                    known = possible_constant;
                }
                else if (ke_text.NIL != conses_high.member(possible_constant_name, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                    known = make_new_constant_wrapper(possible_constant_name);
                }
                else {
                    error_strings = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str36$Constant_not_found___A_, unknown), error_strings);
                }
            }
            else {
                error_strings = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str37$Couldn_t_figure_out_string___A___, unknown), error_strings);
                known = unknown;
            }
        }
        else {
            error_strings = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str38$Couldn_t_figure_out___A_, unknown), error_strings);
            known = unknown;
        }
        return Values.values(known, Sequences.nreverse(error_strings));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 20033L)
    public static SubLObject ket_maybe_find_constant(final SubLObject possible_constant_name) {
        return constants_high.find_constant(string_utilities.string_remove_constant_reader_prefix(possible_constant_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 20301L)
    public static SubLObject ket_make_ke_operation(SubLObject unresolved_formula, final SubLObject mt, SubLObject strength_override, SubLObject direction_override, SubLObject new_constant_names, SubLObject killed_constant_names, SubLObject mode, SubLObject current_ist_sentence) {
        if (strength_override == ke_text.UNPROVIDED) {
            strength_override = (SubLObject)ke_text.NIL;
        }
        if (direction_override == ke_text.UNPROVIDED) {
            direction_override = (SubLObject)ke_text.NIL;
        }
        if (new_constant_names == ke_text.UNPROVIDED) {
            new_constant_names = (SubLObject)ke_text.NIL;
        }
        if (killed_constant_names == ke_text.UNPROVIDED) {
            killed_constant_names = (SubLObject)ke_text.NIL;
        }
        if (mode == ke_text.UNPROVIDED) {
            mode = (SubLObject)ke_text.$kw39$ENTER;
        }
        if (current_ist_sentence == ke_text.UNPROVIDED) {
            current_ist_sentence = (SubLObject)ke_text.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ke_operation = (SubLObject)ke_text.NIL;
        SubLObject error_strings = (SubLObject)ke_text.NIL;
        SubLObject replaced_the_assertion_sentenceP = (SubLObject)ke_text.NIL;
        if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$str40$TheAssertionSentence, unresolved_formula, (SubLObject)ke_text.EQUAL, (SubLObject)ke_text.UNPROVIDED) || ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$str41$__TheAssertionSentence, unresolved_formula, (SubLObject)ke_text.EQUAL, (SubLObject)ke_text.UNPROVIDED)) {
            if (ke_text.NIL == current_ist_sentence) {
                error_strings = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str42$Formula____TheAssertionSentence_i, error_strings);
            }
            unresolved_formula = cycl_utilities.expression_subst(current_ist_sentence, (SubLObject)ke_text.$str40$TheAssertionSentence, unresolved_formula, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED);
            unresolved_formula = cycl_utilities.expression_subst(current_ist_sentence, (SubLObject)ke_text.$str41$__TheAssertionSentence, unresolved_formula, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED);
            replaced_the_assertion_sentenceP = (SubLObject)ke_text.T;
        }
        if (ke_text.NIL == replaced_the_assertion_sentenceP && mode == ke_text.$kw39$ENTER) {
            current_ist_sentence = el_utilities.make_ist_sentence(mt, unresolved_formula);
        }
        thread.resetMultipleValues();
        SubLObject formula = ket_unknown_to_known(unresolved_formula, new_constant_names, killed_constant_names);
        final SubLObject some_error_strings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (ke_text.NIL != some_error_strings) {
            SubLObject cdolist_list_var = some_error_strings;
            SubLObject some_error_string = (SubLObject)ke_text.NIL;
            some_error_string = cdolist_list_var.first();
            while (ke_text.NIL != cdolist_list_var) {
                error_strings = (SubLObject)ConsesLow.cons(some_error_string, error_strings);
                cdolist_list_var = cdolist_list_var.rest();
                some_error_string = cdolist_list_var.first();
            }
        }
        if (ke_text.NIL == mt) {
            error_strings = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str43$Microtheory_not_specified, error_strings);
        }
        final SubLObject predicate = formula.first();
        final SubLObject strength = ket_relevant_strength(strength_override, predicate);
        final SubLObject direction = ket_relevant_direction(direction_override, formula);
        thread.resetMultipleValues();
        final SubLObject dotted_formula = list_utilities.possible_dotted_list_to_dotted_list(formula, (SubLObject)ke_text.UNPROVIDED);
        final SubLObject dotted_formula_okP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (ke_text.NIL != dotted_formula_okP) {
            formula = dotted_formula;
        }
        else {
            error_strings = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str44$Invalid_dotted_list, error_strings);
        }
        if (mode == ke_text.$kw45$DELETE) {
            ke_operation = (SubLObject)ConsesLow.list((SubLObject)ke_text.$kw46$UNASSERT, formula, mt);
        }
        else {
            ke_operation = (SubLObject)ConsesLow.list((SubLObject)ke_text.$kw47$ASSERT, formula, mt, strength, direction);
        }
        return Values.values(ke_operation, error_strings, current_ist_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 23252L)
    public static SubLObject ke_text_token_lists_to_ke_operations(final SubLObject token_lists, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (new_constant_names == ke_text.UNPROVIDED) {
            new_constant_names = (SubLObject)ke_text.NIL;
        }
        if (killed_constant_names == ke_text.UNPROVIDED) {
            killed_constant_names = (SubLObject)ke_text.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_constant = (SubLObject)ke_text.NIL;
        SubLObject current_default_mt = (SubLObject)ke_text.NIL;
        SubLObject current_ist_sentence = (SubLObject)ke_text.NIL;
        SubLObject current_assert_mode = (SubLObject)ke_text.$kw39$ENTER;
        SubLObject next_assert_strength = (SubLObject)ke_text.NIL;
        SubLObject next_assert_direction = (SubLObject)ke_text.NIL;
        SubLObject current_mt = (SubLObject)ke_text.NIL;
        SubLObject ke_operations = (SubLObject)ke_text.NIL;
        SubLObject error_lists = (SubLObject)ke_text.NIL;
        SubLObject abortP = (SubLObject)ke_text.NIL;
        if (ke_text.NIL == abortP) {
            SubLObject csome_list_var = token_lists;
            SubLObject token_list = (SubLObject)ke_text.NIL;
            token_list = csome_list_var.first();
            while (ke_text.NIL == abortP && ke_text.NIL != csome_list_var) {
                final SubLObject filename = token_list.first();
                final SubLObject line_number_start = conses_high.second(token_list);
                final SubLObject line_number_end = conses_high.third(token_list);
                final SubLObject directive_list = conses_high.fourth(token_list);
                final SubLObject data_list = conses_high.fifth(token_list);
                final SubLObject directive = ket_directive_list_to_directive(directive_list, new_constant_names);
                if (Sequences.length(error_lists).numG(ke_text.$ke_text_error_count_abort_num$.getDynamicValue(thread))) {
                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list9), error_lists);
                    abortP = (SubLObject)ke_text.T;
                }
                if (ke_text.NIL == directive) {
                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list48), error_lists);
                }
                else if (directive.isKeyword()) {
                    final SubLObject pcase_var = directive;
                    if (pcase_var.eql((SubLObject)ke_text.$kw49$FORMULA)) {
                        final SubLObject mt = ket_relevant_mt(current_mt, current_default_mt, new_constant_names);
                        SubLObject cdolist_list_var = data_list;
                        SubLObject formula = (SubLObject)ke_text.NIL;
                        formula = cdolist_list_var.first();
                        while (ke_text.NIL != cdolist_list_var) {
                            if (ke_text.NIL == formula) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list50), error_lists);
                            }
                            else if (formula.isAtom() && ke_text.NIL == Strings.stringE(formula, (SubLObject)ke_text.$str41$__TheAssertionSentence, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED) && ke_text.NIL == Strings.stringE(formula, (SubLObject)ke_text.$str40$TheAssertionSentence, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list51), error_lists);
                            }
                            else {
                                thread.resetMultipleValues();
                                final SubLObject ke_operation = ket_make_ke_operation(formula, mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                final SubLObject error_strings = thread.secondMultipleValue();
                                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                current_ist_sentence = next_ist_sentence;
                                next_assert_strength = (SubLObject)ke_text.NIL;
                                next_assert_direction = (SubLObject)ke_text.NIL;
                                if (ke_text.NIL != error_strings) {
                                    SubLObject cdolist_list_var_$1 = error_strings;
                                    SubLObject error_string = (SubLObject)ke_text.NIL;
                                    error_string = cdolist_list_var_$1.first();
                                    while (ke_text.NIL != cdolist_list_var_$1) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string), error_lists);
                                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                        error_string = cdolist_list_var_$1.first();
                                    }
                                }
                                else {
                                    ke_operations = (SubLObject)ConsesLow.cons(ke_operation, ke_operations);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            formula = cdolist_list_var.first();
                        }
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw52$CONSTANT)) {
                        current_mt = (SubLObject)ke_text.NIL;
                        if (!data_list.isList()) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list53), error_lists);
                        }
                        else if (Sequences.length(data_list).numG((SubLObject)ke_text.ONE_INTEGER)) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list54), error_lists);
                        }
                        else {
                            SubLObject constant_thing = data_list.first();
                            if (ke_text.NIL == constant_thing) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list53), error_lists);
                            }
                            else if (constant_thing.isList()) {
                                thread.resetMultipleValues();
                                final SubLObject known_constant_thing = ket_unknown_to_known(constant_thing, new_constant_names, (SubLObject)ke_text.UNPROVIDED);
                                final SubLObject error_strings2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (ke_text.NIL != error_strings2) {
                                    SubLObject cdolist_list_var2 = error_strings2;
                                    SubLObject error_string2 = (SubLObject)ke_text.NIL;
                                    error_string2 = cdolist_list_var2.first();
                                    while (ke_text.NIL != cdolist_list_var2) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string2), error_lists);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        error_string2 = cdolist_list_var2.first();
                                    }
                                }
                                else {
                                    final SubLObject possible_nat = narts_high.find_nart(known_constant_thing);
                                    if (ke_text.NIL != nart_handles.nart_p(possible_nat)) {
                                        current_constant = constant_thing;
                                    }
                                    else {
                                        current_constant = constant_thing;
                                        new_constant_names = (SubLObject)ConsesLow.cons(constant_thing, new_constant_names);
                                    }
                                }
                            }
                            else if (constant_thing.isString()) {
                                constant_thing = string_utilities.string_remove_constant_reader_prefix(constant_thing);
                                if (ke_text.NIL == constant_completion_high.valid_constant_name_p(constant_thing)) {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list55), error_lists);
                                }
                                else if (ke_text.NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread) && ke_text.NIL != constant_completion_high.constant_name_case_collision(constant_thing)) {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str56$Constant__Constant_already_exists, constant_completion_high.constant_name_case_collision(constant_thing))), error_lists);
                                }
                                else {
                                    final SubLObject possible_constant = ket_maybe_find_constant(constant_thing);
                                    if (ke_text.NIL != conses_high.member(constant_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                        current_constant = make_new_constant_wrapper(constant_thing);
                                    }
                                    else if (ke_text.NIL != constant_handles.valid_constantP(possible_constant, (SubLObject)ke_text.UNPROVIDED) && ke_text.NIL == subl_promotions.memberP(constants_high.constant_name(possible_constant), killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                        current_constant = possible_constant;
                                    }
                                    else {
                                        ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw57$CREATE, constant_thing), ke_operations);
                                        current_constant = make_new_constant_wrapper(constant_thing);
                                        new_constant_names = (SubLObject)ConsesLow.cons(constant_thing, new_constant_names);
                                        killed_constant_names = Sequences.remove(constant_thing, killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                                    }
                                }
                            }
                            else {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str58$Constant__Unrecognized_constant__, constant_thing)), error_lists);
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw59$KILL)) {
                        if (!data_list.isList()) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list60), error_lists);
                        }
                        else if (Sequences.length(data_list).numG((SubLObject)ke_text.ONE_INTEGER)) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list61), error_lists);
                        }
                        else {
                            final SubLObject constant_thing = data_list.first();
                            SubLObject possible_constant = (SubLObject)ke_text.NIL;
                            if (ke_text.NIL == constant_thing) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list60), error_lists);
                            }
                            else if (constant_thing.isList()) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list62), error_lists);
                            }
                            else if (!constant_thing.isString()) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list63), error_lists);
                            }
                            else if (ke_text.NIL != conses_high.member(constant_thing, killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list64), error_lists);
                            }
                            else {
                                possible_constant = ket_maybe_find_constant(constant_thing);
                                if (ke_text.NIL != conses_high.member(constant_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                    ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw59$KILL, make_new_constant_wrapper(constant_thing)), ke_operations);
                                    killed_constant_names = (SubLObject)ConsesLow.cons(new_constant_names, killed_constant_names);
                                    new_constant_names = Sequences.remove(constant_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                                }
                                else if (ke_text.NIL != constant_handles.constant_p(possible_constant)) {
                                    ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw59$KILL, possible_constant), ke_operations);
                                    killed_constant_names = (SubLObject)ConsesLow.cons(constants_high.constant_name(possible_constant), killed_constant_names);
                                    new_constant_names = Sequences.remove(constants_high.constant_name(possible_constant), new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                                }
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw65$RENAME)) {
                        if (!data_list.isList()) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list66), error_lists);
                        }
                        else {
                            final SubLObject old_constant_thing = data_list.first();
                            SubLObject possible_existing_old_constant = (SubLObject)ke_text.NIL;
                            final SubLObject new_constant_thing = conses_high.second(data_list);
                            SubLObject unquoted_new_constant_thing = (SubLObject)ke_text.NIL;
                            SubLObject possible_existing_new_constant = (SubLObject)ke_text.NIL;
                            SubLObject continue_counter = (SubLObject)ke_text.ZERO_INTEGER;
                            if (ke_text.NIL == old_constant_thing) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list67), error_lists);
                            }
                            else if (old_constant_thing.isList()) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list68), error_lists);
                            }
                            else if (!old_constant_thing.isString()) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list69), error_lists);
                            }
                            else if (ke_text.NIL != conses_high.member(old_constant_thing, killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str70$Rename__Can_t_rename_a_constant_r, old_constant_thing)), error_lists);
                            }
                            else {
                                possible_existing_old_constant = ket_maybe_find_constant(old_constant_thing);
                                continue_counter = Numbers.add(continue_counter, (SubLObject)ke_text.ONE_INTEGER);
                            }
                            if (!new_constant_thing.isString()) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list71), error_lists);
                            }
                            else if (ke_text.NIL == Characters.charE((SubLObject)Characters.CHAR_quotation, Strings.sublisp_char(new_constant_thing, (SubLObject)ke_text.ZERO_INTEGER))) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list72), error_lists);
                            }
                            else {
                                unquoted_new_constant_thing = string_utilities.string_remove_constant_reader_prefix(string_utilities.string_trim_symmetric_n((SubLObject)ke_text.$list29, new_constant_thing, (SubLObject)ke_text.ONE_INTEGER));
                                possible_existing_new_constant = ket_maybe_find_constant(unquoted_new_constant_thing);
                                if (ke_text.NIL == constant_completion_high.valid_constant_name_p(unquoted_new_constant_thing)) {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list73), error_lists);
                                }
                                else if (ke_text.NIL != conses_high.member(unquoted_new_constant_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str74$Rename__Can_t_rename_to_constant_, unquoted_new_constant_thing)), error_lists);
                                }
                                else if (ke_text.NIL != constant_handles.valid_constantP(possible_existing_new_constant, (SubLObject)ke_text.UNPROVIDED) && ke_text.NIL == subl_promotions.memberP(constants_high.constant_name(possible_existing_new_constant), killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str75$Rename__Can_t_rename_to_existing_, unquoted_new_constant_thing)), error_lists);
                                }
                                else {
                                    continue_counter = Numbers.add(continue_counter, (SubLObject)ke_text.ONE_INTEGER);
                                }
                            }
                            if (continue_counter.eql((SubLObject)ke_text.TWO_INTEGER)) {
                                if (ke_text.NIL != constant_handles.constant_p(possible_existing_old_constant)) {
                                    ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw65$RENAME, possible_existing_old_constant, unquoted_new_constant_thing), ke_operations);
                                    new_constant_names = (SubLObject)ConsesLow.cons(unquoted_new_constant_thing, new_constant_names);
                                    new_constant_names = Sequences.remove(constants_high.constant_name(possible_existing_old_constant), new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                                    killed_constant_names = (SubLObject)ConsesLow.cons(constants_high.constant_name(possible_existing_old_constant), killed_constant_names);
                                    killed_constant_names = Sequences.remove(unquoted_new_constant_thing, killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                                    if (possible_existing_old_constant.eql(current_constant)) {
                                        current_constant = make_new_constant_wrapper(unquoted_new_constant_thing);
                                    }
                                }
                                else if (ke_text.NIL != conses_high.member(old_constant_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                    ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw65$RENAME, (SubLObject)ConsesLow.list((SubLObject)ke_text.$kw76$NEW_CONSTANT, old_constant_thing), unquoted_new_constant_thing), ke_operations);
                                    new_constant_names = Sequences.remove(old_constant_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                                    new_constant_names = (SubLObject)ConsesLow.cons(unquoted_new_constant_thing, new_constant_names);
                                    killed_constant_names = (SubLObject)ConsesLow.cons(old_constant_thing, killed_constant_names);
                                    killed_constant_names = Sequences.remove(unquoted_new_constant_thing, killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                                    if (ke_text.NIL != list_utilities.tree_find(old_constant_thing, current_constant, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                        current_constant = make_new_constant_wrapper(unquoted_new_constant_thing);
                                    }
                                }
                                else {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str77$Rename__Unrecognized_constant___A, old_constant_thing)), error_lists);
                                }
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw78$MERGE)) {
                        if (!data_list.isList()) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list79), error_lists);
                        }
                        else {
                            final SubLObject kill_fort_thing = data_list.first();
                            SubLObject known_kill_fort_thing = (SubLObject)ke_text.NIL;
                            SubLObject kill_fort = (SubLObject)ke_text.NIL;
                            final SubLObject keep_fort_thing = conses_high.second(data_list);
                            SubLObject known_keep_fort_thing = (SubLObject)ke_text.NIL;
                            SubLObject keep_fort = (SubLObject)ke_text.NIL;
                            SubLObject error_strings3 = (SubLObject)ke_text.NIL;
                            SubLObject continue_counter2 = (SubLObject)ke_text.ZERO_INTEGER;
                            if (ke_text.NIL == kill_fort_thing) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list80), error_lists);
                            }
                            else if (ke_text.NIL != conses_high.member(kill_fort_thing, killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list81), error_lists);
                            }
                            else {
                                thread.resetMultipleValues();
                                final SubLObject known_kill_fort_thing_$2 = ket_unknown_to_known(kill_fort_thing, new_constant_names, killed_constant_names);
                                final SubLObject error_strings_$3 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                known_kill_fort_thing = known_kill_fort_thing_$2;
                                error_strings3 = error_strings_$3;
                                kill_fort = ke_utilities.fort_from_string(known_kill_fort_thing);
                                if (ke_text.NIL != error_strings3) {
                                    SubLObject cdolist_list_var3 = error_strings3;
                                    SubLObject error_string3 = (SubLObject)ke_text.NIL;
                                    error_string3 = cdolist_list_var3.first();
                                    while (ke_text.NIL != cdolist_list_var3) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string3), error_lists);
                                        cdolist_list_var3 = cdolist_list_var3.rest();
                                        error_string3 = cdolist_list_var3.first();
                                    }
                                }
                                else if (ke_text.NIL == forts.fort_p(kill_fort) && ke_text.NIL == conses_high.member(kill_fort_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list82), error_lists);
                                }
                                else {
                                    continue_counter2 = Numbers.add(continue_counter2, (SubLObject)ke_text.ONE_INTEGER);
                                }
                            }
                            if (ke_text.NIL == keep_fort_thing) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list83), error_lists);
                            }
                            else if (ke_text.NIL != conses_high.member(keep_fort_thing, killed_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list84), error_lists);
                            }
                            else {
                                thread.resetMultipleValues();
                                final SubLObject known_keep_fort_thing_$4 = ket_unknown_to_known(keep_fort_thing, new_constant_names, killed_constant_names);
                                final SubLObject error_strings_$4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                known_keep_fort_thing = known_keep_fort_thing_$4;
                                error_strings3 = error_strings_$4;
                                keep_fort = ke_utilities.fort_from_string(known_keep_fort_thing);
                                if (ke_text.NIL != error_strings3) {
                                    SubLObject cdolist_list_var3 = error_strings3;
                                    SubLObject error_string3 = (SubLObject)ke_text.NIL;
                                    error_string3 = cdolist_list_var3.first();
                                    while (ke_text.NIL != cdolist_list_var3) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string3), error_lists);
                                        cdolist_list_var3 = cdolist_list_var3.rest();
                                        error_string3 = cdolist_list_var3.first();
                                    }
                                }
                                else if (ke_text.NIL == forts.fort_p(keep_fort) && ke_text.NIL == conses_high.member(keep_fort_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list85), error_lists);
                                }
                                else {
                                    continue_counter2 = Numbers.add(continue_counter2, (SubLObject)ke_text.ONE_INTEGER);
                                }
                            }
                            if (continue_counter2.eql((SubLObject)ke_text.TWO_INTEGER)) {
                                new_constant_names = Sequences.remove(kill_fort_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                                killed_constant_names = (SubLObject)ConsesLow.cons(kill_fort_thing, killed_constant_names);
                                if (ke_text.NIL != forts.fort_p(kill_fort)) {
                                    if (ke_text.NIL != forts.fort_p(keep_fort)) {
                                        ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw78$MERGE, kill_fort, keep_fort), ke_operations);
                                    }
                                    else {
                                        ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw78$MERGE, kill_fort, make_new_constant_wrapper(keep_fort_thing)), ke_operations);
                                    }
                                }
                                else if (ke_text.NIL != forts.fort_p(keep_fort)) {
                                    ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw78$MERGE, make_new_constant_wrapper(kill_fort_thing), keep_fort), ke_operations);
                                }
                                else {
                                    ke_operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw78$MERGE, make_new_constant_wrapper(kill_fort_thing), make_new_constant_wrapper(keep_fort_thing)), ke_operations);
                                }
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw39$ENTER)) {
                        current_assert_mode = (SubLObject)ke_text.$kw39$ENTER;
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw45$DELETE)) {
                        current_assert_mode = (SubLObject)ke_text.$kw45$DELETE;
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw86$IN_MT)) {
                        if (!data_list.isList()) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list87), error_lists);
                        }
                        else {
                            final SubLObject mt_thing = data_list.first();
                            if (ke_text.NIL == mt_thing) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list87), error_lists);
                            }
                            else if (mt_thing.isList()) {
                                thread.resetMultipleValues();
                                SubLObject known_mt_thing = ket_unknown_to_known(mt_thing, new_constant_names, killed_constant_names);
                                final SubLObject error_strings2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (ke_text.NIL != error_strings2) {
                                    SubLObject cdolist_list_var2 = error_strings2;
                                    SubLObject error_string2 = (SubLObject)ke_text.NIL;
                                    error_string2 = cdolist_list_var2.first();
                                    while (ke_text.NIL != cdolist_list_var2) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string2), error_lists);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        error_string2 = cdolist_list_var2.first();
                                    }
                                }
                                else {
                                    final SubLObject possible_nat_mt = narts_high.find_nart(known_mt_thing);
                                    if (ke_text.NIL != nart_handles.nart_p(possible_nat_mt)) {
                                        known_mt_thing = possible_nat_mt;
                                    }
                                    current_mt = known_mt_thing;
                                }
                            }
                            else if (ke_text.NIL != constant_handles.constant_p(mt_thing)) {
                                current_mt = mt_thing;
                            }
                            else if (mt_thing.isString()) {
                                final SubLObject possible_mt = ket_maybe_find_constant(mt_thing);
                                if (ke_text.NIL != constant_handles.valid_constantP(possible_mt, (SubLObject)ke_text.UNPROVIDED)) {
                                    current_mt = possible_mt;
                                }
                                else if (ke_text.NIL != subl_promotions.memberP(mt_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                    current_mt = make_new_constant_wrapper(mt_thing);
                                }
                                else {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str89$In_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                }
                            }
                            else {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str89$In_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw90$DEFAULT_MT)) {
                        if (!data_list.isList()) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list91), error_lists);
                        }
                        else {
                            final SubLObject mt_thing = data_list.first();
                            if (ke_text.NIL == mt_thing) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list91), error_lists);
                            }
                            else if (mt_thing.isList()) {
                                thread.resetMultipleValues();
                                SubLObject known_mt_thing = ket_unknown_to_known(mt_thing, new_constant_names, killed_constant_names);
                                final SubLObject error_strings2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (ke_text.NIL != error_strings2) {
                                    SubLObject cdolist_list_var2 = error_strings2;
                                    SubLObject error_string2 = (SubLObject)ke_text.NIL;
                                    error_string2 = cdolist_list_var2.first();
                                    while (ke_text.NIL != cdolist_list_var2) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string2), error_lists);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        error_string2 = cdolist_list_var2.first();
                                    }
                                }
                                else {
                                    final SubLObject possible_nat_mt = narts_high.find_nart(known_mt_thing);
                                    if (ke_text.NIL != nart_handles.nart_p(possible_nat_mt)) {
                                        known_mt_thing = possible_nat_mt;
                                    }
                                    current_mt = (SubLObject)ke_text.NIL;
                                    current_default_mt = known_mt_thing;
                                }
                            }
                            else if (ke_text.NIL != constant_handles.constant_p(mt_thing)) {
                                current_mt = (SubLObject)ke_text.NIL;
                                current_default_mt = mt_thing;
                            }
                            else if (mt_thing.isString()) {
                                final SubLObject possible_mt = ket_maybe_find_constant(mt_thing);
                                if (ke_text.NIL != constant_handles.valid_constantP(possible_mt, (SubLObject)ke_text.UNPROVIDED)) {
                                    current_mt = (SubLObject)ke_text.NIL;
                                    current_default_mt = possible_mt;
                                }
                                else if (ke_text.NIL != subl_promotions.memberP(mt_thing, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.EQUAL), (SubLObject)ke_text.UNPROVIDED)) {
                                    current_mt = (SubLObject)ke_text.NIL;
                                    current_default_mt = make_new_constant_wrapper(mt_thing);
                                }
                                else {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str93$Default_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                                }
                            }
                            else {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str93$Default_Mt__Unrecognized_mt___A_, mt_thing)), error_lists);
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw94$STRENGTH)) {
                        if (!data_list.isList()) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list95), error_lists);
                        }
                        else {
                            final SubLObject strength_keyword = ket_lookup_string(data_list, ke_text.$ket_string_to_strength$.getDynamicValue(thread));
                            if (ke_text.NIL == strength_keyword) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list95), error_lists);
                            }
                            else if (strength_keyword.isKeyword()) {
                                next_assert_strength = strength_keyword;
                            }
                            else {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str96$Strength__Unrecognized_strength__, data_list)), error_lists);
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.$kw97$DIRECTION)) {
                        if (!data_list.isList()) {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list98), error_lists);
                        }
                        else {
                            final SubLObject direction_keyword = ket_lookup_string(data_list, ke_text.$ket_string_to_direction$.getDynamicValue(thread));
                            if (ke_text.NIL == direction_keyword) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list98), error_lists);
                            }
                            else if (direction_keyword.isKeyword()) {
                                next_assert_direction = direction_keyword;
                            }
                            else {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str99$Direction__Unrecognized_direction, data_list)), error_lists);
                            }
                        }
                    }
                }
                else if (directive.isString() && ke_text.NIL == subl_promotions.memberP(directive, new_constant_names, Symbols.symbol_function((SubLObject)ke_text.$sym100$STRING_), (SubLObject)ke_text.UNPROVIDED)) {
                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list101), error_lists);
                }
                else if (directive.isList() && ke_text.NIL == new_constant_wrapperp(directive)) {
                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(filename, line_number_start, line_number_end, (SubLObject)ke_text.$list102), error_lists);
                }
                else {
                    SubLObject known_arity = (SubLObject)((ke_text.NIL != fort_types_interface.predicateP(directive)) ? arity.arity(directive) : ke_text.NIL);
                    final SubLObject mt = ket_relevant_mt(current_mt, current_default_mt, new_constant_names);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_text.$sym103$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(ke_text.$const104$EverythingPSC, thread);
                        known_arity = (SubLObject)((ke_text.NIL != fort_types_interface.predicateP(directive)) ? arity.arity(directive) : ke_text.NIL);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    if (ke_text.NIL == current_constant) {
                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str105$Constant_must_be_specified, directive)), error_lists);
                    }
                    else if (ke_text.ONE_INTEGER.eql(known_arity)) {
                        if (ke_text.NIL == data_list) {
                            thread.resetMultipleValues();
                            final SubLObject ke_operation2 = ket_make_ke_operation((SubLObject)ConsesLow.list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                            final SubLObject error_strings2 = thread.secondMultipleValue();
                            final SubLObject next_ist_sentence2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            current_ist_sentence = next_ist_sentence2;
                            next_assert_strength = (SubLObject)ke_text.NIL;
                            next_assert_direction = (SubLObject)ke_text.NIL;
                            if (ke_text.NIL != error_strings2) {
                                SubLObject cdolist_list_var4 = error_strings2;
                                SubLObject error_string4 = (SubLObject)ke_text.NIL;
                                error_string4 = cdolist_list_var4.first();
                                while (ke_text.NIL != cdolist_list_var4) {
                                    error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string4), error_lists);
                                    cdolist_list_var4 = cdolist_list_var4.rest();
                                    error_string4 = cdolist_list_var4.first();
                                }
                            }
                            else {
                                ke_operations = (SubLObject)ConsesLow.cons(ke_operation2, ke_operations);
                            }
                        }
                        else {
                            error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str106$Unexpected_argument_to_unary_pred, directive)), error_lists);
                        }
                    }
                    else if (ke_text.TWO_INTEGER.eql(known_arity)) {
                        SubLObject cdolist_list_var = data_list;
                        SubLObject formula_arg3 = (SubLObject)ke_text.NIL;
                        formula_arg3 = cdolist_list_var.first();
                        while (ke_text.NIL != cdolist_list_var) {
                            if (ke_text.NIL == formula_arg3) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str107$No_argument_found_for_binary_pred, directive)), error_lists);
                            }
                            else {
                                thread.resetMultipleValues();
                                final SubLObject ke_operation = ket_make_ke_operation((SubLObject)ConsesLow.list(directive, current_constant, formula_arg3), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                final SubLObject error_strings = thread.secondMultipleValue();
                                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                current_ist_sentence = next_ist_sentence;
                                next_assert_strength = (SubLObject)ke_text.NIL;
                                next_assert_direction = (SubLObject)ke_text.NIL;
                                if (ke_text.NIL != error_strings) {
                                    SubLObject cdolist_list_var_$2 = error_strings;
                                    SubLObject error_string = (SubLObject)ke_text.NIL;
                                    error_string = cdolist_list_var_$2.first();
                                    while (ke_text.NIL != cdolist_list_var_$2) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string), error_lists);
                                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                        error_string = cdolist_list_var_$2.first();
                                    }
                                }
                                else {
                                    ke_operations = (SubLObject)ConsesLow.cons(ke_operation, ke_operations);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            formula_arg3 = cdolist_list_var.first();
                        }
                    }
                    else if (known_arity.isInteger() && known_arity.numGE((SubLObject)ke_text.THREE_INTEGER)) {
                        SubLObject cdolist_list_var = data_list;
                        SubLObject formula_rest_rest = (SubLObject)ke_text.NIL;
                        formula_rest_rest = cdolist_list_var.first();
                        while (ke_text.NIL != cdolist_list_var) {
                            if (ke_text.NIL == formula_rest_rest) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str108$No_argument_found_for_arity__A_pr, known_arity, directive)), error_lists);
                            }
                            else if (formula_rest_rest.isAtom()) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str109$List_argument_expected_for_arity_, known_arity, directive)), error_lists);
                            }
                            else {
                                thread.resetMultipleValues();
                                final SubLObject ke_operation = ket_make_ke_operation((SubLObject)ConsesLow.listS(directive, current_constant, ConsesLow.append(formula_rest_rest, (SubLObject)ke_text.NIL)), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                final SubLObject error_strings = thread.secondMultipleValue();
                                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                current_ist_sentence = next_ist_sentence;
                                next_assert_strength = (SubLObject)ke_text.NIL;
                                next_assert_direction = (SubLObject)ke_text.NIL;
                                if (ke_text.NIL != error_strings) {
                                    SubLObject cdolist_list_var_$3 = error_strings;
                                    SubLObject error_string = (SubLObject)ke_text.NIL;
                                    error_string = cdolist_list_var_$3.first();
                                    while (ke_text.NIL != cdolist_list_var_$3) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string), error_lists);
                                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                        error_string = cdolist_list_var_$3.first();
                                    }
                                }
                                else {
                                    ke_operations = (SubLObject)ConsesLow.cons(ke_operation, ke_operations);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            formula_rest_rest = cdolist_list_var.first();
                        }
                    }
                    else if (ke_text.NIL == data_list) {
                        thread.resetMultipleValues();
                        final SubLObject ke_operation2 = ket_make_ke_operation((SubLObject)ConsesLow.list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                        final SubLObject error_strings2 = thread.secondMultipleValue();
                        final SubLObject next_ist_sentence2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        current_ist_sentence = next_ist_sentence2;
                        next_assert_strength = (SubLObject)ke_text.NIL;
                        next_assert_direction = (SubLObject)ke_text.NIL;
                        if (ke_text.NIL != error_strings2) {
                            SubLObject cdolist_list_var4 = error_strings2;
                            SubLObject error_string4 = (SubLObject)ke_text.NIL;
                            error_string4 = cdolist_list_var4.first();
                            while (ke_text.NIL != cdolist_list_var4) {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string4), error_lists);
                                cdolist_list_var4 = cdolist_list_var4.rest();
                                error_string4 = cdolist_list_var4.first();
                            }
                        }
                        else {
                            ke_operations = (SubLObject)ConsesLow.cons(ke_operation2, ke_operations);
                        }
                    }
                    else {
                        SubLObject cdolist_list_var = data_list;
                        SubLObject formula_args = (SubLObject)ke_text.NIL;
                        formula_args = cdolist_list_var.first();
                        while (ke_text.NIL != cdolist_list_var) {
                            if (ke_text.NIL == formula_args) {
                                thread.resetMultipleValues();
                                final SubLObject ke_operation = ket_make_ke_operation((SubLObject)ConsesLow.list(directive, current_constant), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                final SubLObject error_strings = thread.secondMultipleValue();
                                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                current_ist_sentence = next_ist_sentence;
                                next_assert_strength = (SubLObject)ke_text.NIL;
                                next_assert_direction = (SubLObject)ke_text.NIL;
                                if (ke_text.NIL != error_strings) {
                                    SubLObject cdolist_list_var_$4 = error_strings;
                                    SubLObject error_string = (SubLObject)ke_text.NIL;
                                    error_string = cdolist_list_var_$4.first();
                                    while (ke_text.NIL != cdolist_list_var_$4) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string), error_lists);
                                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                        error_string = cdolist_list_var_$4.first();
                                    }
                                }
                                else {
                                    ke_operations = (SubLObject)ConsesLow.cons(ke_operation, ke_operations);
                                }
                            }
                            else if (ke_text.NIL != formula_args) {
                                thread.resetMultipleValues();
                                final SubLObject ke_operation = ket_make_ke_operation((SubLObject)ConsesLow.list(directive, current_constant, formula_args), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                final SubLObject error_strings = thread.secondMultipleValue();
                                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                current_ist_sentence = next_ist_sentence;
                                next_assert_strength = (SubLObject)ke_text.NIL;
                                next_assert_direction = (SubLObject)ke_text.NIL;
                                if (ke_text.NIL != error_strings) {
                                    SubLObject cdolist_list_var_$5 = error_strings;
                                    SubLObject error_string = (SubLObject)ke_text.NIL;
                                    error_string = cdolist_list_var_$5.first();
                                    while (ke_text.NIL != cdolist_list_var_$5) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string), error_lists);
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        error_string = cdolist_list_var_$5.first();
                                    }
                                }
                                else {
                                    ke_operations = (SubLObject)ConsesLow.cons(ke_operation, ke_operations);
                                }
                            }
                            else if (ke_text.NIL != ConsesLow.list(formula_args)) {
                                thread.resetMultipleValues();
                                final SubLObject ke_operation = ket_make_ke_operation((SubLObject)ConsesLow.listS(directive, current_constant, ConsesLow.append(formula_args, (SubLObject)ke_text.NIL)), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence);
                                final SubLObject error_strings = thread.secondMultipleValue();
                                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                current_ist_sentence = next_ist_sentence;
                                next_assert_strength = (SubLObject)ke_text.NIL;
                                next_assert_direction = (SubLObject)ke_text.NIL;
                                if (ke_text.NIL != error_strings) {
                                    SubLObject cdolist_list_var_$6 = error_strings;
                                    SubLObject error_string = (SubLObject)ke_text.NIL;
                                    error_string = cdolist_list_var_$6.first();
                                    while (ke_text.NIL != cdolist_list_var_$6) {
                                        error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, error_string), error_lists);
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        error_string = cdolist_list_var_$6.first();
                                    }
                                }
                                else {
                                    ke_operations = (SubLObject)ConsesLow.cons(ke_operation, ke_operations);
                                }
                            }
                            else {
                                error_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(filename, line_number_start, line_number_end, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str110$Unexpected_argument_for_predicate, directive)), error_lists);
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
        return Values.values(Sequences.nreverse(ke_operations), Sequences.nreverse(error_lists), new_constant_names, killed_constant_names);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 53148L)
    public static SubLObject do_ke_operation(final SubLObject operation, SubLObject method) {
        if (method == ke_text.UNPROVIDED) {
            method = (SubLObject)ke_text.$kw111$AGENDA;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operation_type = operation.first();
        final SubLObject operation_args = operation.rest();
        final SubLObject pcase_var = operation_type;
        if (pcase_var.eql((SubLObject)ke_text.$kw57$CREATE)) {
            final SubLObject name = operation_args.first();
            final SubLObject pcase_var_$11 = method;
            if (pcase_var_$11.eql((SubLObject)ke_text.$kw111$AGENDA)) {
                operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym112$FI_CREATE, name), (SubLObject)ke_text.UNPROVIDED);
                operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym113$FI_TIMESTAMP_CONSTANT, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.the_date()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.ke_purpose()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.the_second())), (SubLObject)ke_text.UNPROVIDED);
                return (SubLObject)ke_text.NIL;
            }
            if (pcase_var_$11.eql((SubLObject)ke_text.$kw115$NOW)) {
                return ke.ke_create_now(name, (SubLObject)ke_text.UNPROVIDED);
            }
        }
        else if (pcase_var.eql((SubLObject)ke_text.$kw47$ASSERT)) {
            SubLObject formula = operation_args.first();
            SubLObject mt = conses_high.second(operation_args);
            final SubLObject strength = conses_high.third(operation_args);
            final SubLObject direction = conses_high.fourth(operation_args);
            if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$kw76$NEW_CONSTANT, formula, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                formula = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym116$RESOLVE_NEW_CONSTANTS, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, formula));
            }
            else {
                formula = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, formula);
            }
            if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$kw76$NEW_CONSTANT, mt, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                mt = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym116$RESOLVE_NEW_CONSTANTS, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, mt));
            }
            else {
                mt = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, mt);
            }
            final SubLObject pcase_var_$12 = method;
            if (pcase_var_$12.eql((SubLObject)ke_text.$kw111$AGENDA)) {
                operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym117$FI_ASSERT, formula, mt, strength, direction), (SubLObject)ke_text.UNPROVIDED);
                operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym118$FI_TIMESTAMP_ASSERTION, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.the_date()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.ke_purpose()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.the_second())), (SubLObject)ke_text.UNPROVIDED);
                return (SubLObject)ke_text.NIL;
            }
            if (pcase_var_$12.eql((SubLObject)ke_text.$kw115$NOW)) {
                formula = Eval.eval(formula);
                mt = Eval.eval(mt);
                return ke.ke_assert_now(formula, mt, strength, direction);
            }
        }
        else if (pcase_var.eql((SubLObject)ke_text.$kw46$UNASSERT)) {
            SubLObject formula = operation_args.first();
            SubLObject mt = conses_high.second(operation_args);
            if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$kw76$NEW_CONSTANT, formula, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                formula = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym116$RESOLVE_NEW_CONSTANTS, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, formula));
            }
            else {
                formula = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, formula);
            }
            if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$kw76$NEW_CONSTANT, mt, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                mt = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym116$RESOLVE_NEW_CONSTANTS, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, mt));
            }
            else {
                mt = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, mt);
            }
            final SubLObject pcase_var_$13 = method;
            if (pcase_var_$13.eql((SubLObject)ke_text.$kw111$AGENDA)) {
                operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym119$FI_UNASSERT, formula, mt), (SubLObject)ke_text.UNPROVIDED);
                return (SubLObject)ke_text.NIL;
            }
            if (pcase_var_$13.eql((SubLObject)ke_text.$kw115$NOW)) {
                formula = Eval.eval(formula);
                mt = Eval.eval(mt);
                return ke.ke_unassert_now(formula, mt);
            }
        }
        else if (pcase_var.eql((SubLObject)ke_text.$kw65$RENAME)) {
            SubLObject constant = operation_args.first();
            final SubLObject name2 = conses_high.second(operation_args);
            SubLObject quoted_constant = (SubLObject)ke_text.NIL;
            SubLObject old_name = (SubLObject)ke_text.NIL;
            if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$kw76$NEW_CONSTANT, constant, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                quoted_constant = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym116$RESOLVE_NEW_CONSTANTS, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, constant));
                constant = (SubLObject)ke_text.NIL;
            }
            else {
                old_name = constants_high.constant_name(constant);
                quoted_constant = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, constant);
            }
            final SubLObject pcase_var_$14 = method;
            if (pcase_var_$14.eql((SubLObject)ke_text.$kw111$AGENDA)) {
                operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym120$FI_RENAME, quoted_constant, name2), (SubLObject)ke_text.UNPROVIDED);
                if (ke_text.NIL != constant && ke_text.NIL != ke.$note_old_constant_name$.getDynamicValue(thread) && old_name.isString()) {
                    if (ke_text.NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, ke_text.$const121$oldConstantName, ke_text.$const122$BookkeepingMt, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_text.$sym123$RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(ke_text.$const122$BookkeepingMt, thread);
                            final SubLObject pred_var = ke_text.$const121$oldConstantName;
                            if (ke_text.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, (SubLObject)ke_text.ONE_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, (SubLObject)ke_text.ONE_INTEGER, pred_var);
                                SubLObject done_var = (SubLObject)ke_text.NIL;
                                final SubLObject token_var = (SubLObject)ke_text.NIL;
                                while (ke_text.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (ke_text.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)ke_text.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)ke_text.$kw124$GAF, (SubLObject)ke_text.NIL, (SubLObject)ke_text.NIL);
                                            SubLObject done_var_$15 = (SubLObject)ke_text.NIL;
                                            final SubLObject token_var_$16 = (SubLObject)ke_text.NIL;
                                            while (ke_text.NIL == done_var_$15) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                                                final SubLObject valid_$17 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$16.eql(assertion));
                                                if (ke_text.NIL != valid_$17) {
                                                    final SubLObject old_formula = ke.ke_assertion_find_formula(assertion);
                                                    final SubLObject old_mt = assertions_high.assertion_mt(assertion);
                                                    if (ke_text.NIL != old_formula && ke_text.NIL != old_mt) {
                                                        operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym119$FI_UNASSERT, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, old_formula), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, old_mt)), (SubLObject)ke_text.UNPROVIDED);
                                                    }
                                                }
                                                done_var_$15 = (SubLObject)SubLObjectFactory.makeBoolean(ke_text.NIL == valid_$17);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_text.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (ke_text.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(ke_text.NIL == valid);
                                }
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    operation_queues.add_to_local_queue((SubLObject)ConsesLow.listS((SubLObject)ke_text.$sym117$FI_ASSERT, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, (SubLObject)ConsesLow.list(ke_text.$const121$oldConstantName, constant, old_name)), (SubLObject)ke_text.$list125), (SubLObject)ke_text.UNPROVIDED);
                    operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym118$FI_TIMESTAMP_ASSERTION, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, operation_communication.the_cyclist()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.the_date()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.ke_purpose()), (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, fi.the_second())), (SubLObject)ke_text.UNPROVIDED);
                }
                return (SubLObject)ke_text.NIL;
            }
            if (pcase_var_$14.eql((SubLObject)ke_text.$kw115$NOW)) {
                constant = Eval.eval(quoted_constant);
                return ke.ke_rename_now(constant, name2);
            }
        }
        else if (pcase_var.eql((SubLObject)ke_text.$kw59$KILL)) {
            SubLObject constant = operation_args.first();
            if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$kw76$NEW_CONSTANT, constant, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                constant = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym116$RESOLVE_NEW_CONSTANTS, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, constant));
            }
            else {
                constant = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, constant);
            }
            final SubLObject pcase_var_$15 = method;
            if (pcase_var_$15.eql((SubLObject)ke_text.$kw111$AGENDA)) {
                operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym126$FI_KILL, constant), (SubLObject)ke_text.UNPROVIDED);
                return (SubLObject)ke_text.NIL;
            }
            if (pcase_var_$15.eql((SubLObject)ke_text.$kw115$NOW)) {
                return ke.ke_kill_now(constant);
            }
        }
        else {
            if (!pcase_var.eql((SubLObject)ke_text.$kw78$MERGE)) {
                return (SubLObject)ke_text.NIL;
            }
            SubLObject kill_fort = operation_args.first();
            SubLObject keep_fort = conses_high.second(operation_args);
            if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$kw76$NEW_CONSTANT, kill_fort, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                kill_fort = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym116$RESOLVE_NEW_CONSTANTS, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, kill_fort));
            }
            else {
                kill_fort = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, kill_fort);
            }
            if (ke_text.NIL != list_utilities.tree_find((SubLObject)ke_text.$kw76$NEW_CONSTANT, keep_fort, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                keep_fort = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym116$RESOLVE_NEW_CONSTANTS, (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, keep_fort));
            }
            else {
                keep_fort = (SubLObject)ConsesLow.list((SubLObject)ke_text.$sym114$QUOTE, keep_fort);
            }
            final SubLObject pcase_var_$16 = method;
            if (pcase_var_$16.eql((SubLObject)ke_text.$kw111$AGENDA)) {
                operation_queues.add_to_local_queue((SubLObject)ConsesLow.list((SubLObject)ke_text.$sym127$FI_MERGE, kill_fort, keep_fort), (SubLObject)ke_text.UNPROVIDED);
                return (SubLObject)ke_text.NIL;
            }
            if (pcase_var_$16.eql((SubLObject)ke_text.$kw115$NOW)) {
                kill_fort = Eval.eval(kill_fort);
                keep_fort = Eval.eval(keep_fort);
                return ke.ke_merge_now(kill_fort, keep_fort);
            }
        }
        return (SubLObject)ke_text.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 58115L)
    public static SubLObject new_constant_wrapperp(final SubLObject possible_wrapper) {
        if (possible_wrapper.isCons() && ke_text.$kw76$NEW_CONSTANT.equal(possible_wrapper.first()) && ke_text.TWO_INTEGER.eql(Sequences.length(possible_wrapper))) {
            return (SubLObject)ke_text.T;
        }
        return (SubLObject)ke_text.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 58465L)
    public static SubLObject make_new_constant_wrapper(final SubLObject new_constant_name) {
        return (SubLObject)ConsesLow.list((SubLObject)ke_text.$kw76$NEW_CONSTANT, new_constant_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 58573L)
    public static SubLObject resolve_new_constants(final SubLObject expr) {
        if (expr.isAtom()) {
            return expr;
        }
        if (!expr.first().eql((SubLObject)ke_text.$kw76$NEW_CONSTANT)) {
            return (SubLObject)ConsesLow.cons(resolve_new_constants(expr.first()), resolve_new_constants(expr.rest()));
        }
        final SubLObject second_expr = conses_high.second(expr);
        if (ke_text.NIL != constant_handles.constant_p(second_expr)) {
            return second_expr;
        }
        if (second_expr.isString()) {
            final SubLObject the_constant = ket_maybe_find_constant(second_expr);
            if (ke_text.NIL != the_constant) {
                return the_constant;
            }
            Errors.error((SubLObject)ke_text.$str128$Constant_does_not_exist___A_, second_expr);
        }
        else {
            Errors.error((SubLObject)ke_text.$str129$_new_constant_must_be_followed_by);
        }
        return (SubLObject)ke_text.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 59534L)
    public static SubLObject ke_text_list_to_ke_operations(final SubLObject ke_text_list, SubLObject filename, SubLObject new_constant_names, SubLObject killed_constant_names) {
        if (filename == ke_text.UNPROVIDED) {
            filename = (SubLObject)ke_text.NIL;
        }
        if (new_constant_names == ke_text.UNPROVIDED) {
            new_constant_names = (SubLObject)ke_text.NIL;
        }
        if (killed_constant_names == ke_text.UNPROVIDED) {
            killed_constant_names = (SubLObject)ke_text.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject token_lists = ke_text_list_to_token_lists(ke_text_list, filename);
        final SubLObject error_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (ke_text.NIL != error_lists) {
            return Values.values((SubLObject)ke_text.NIL, error_lists);
        }
        thread.resetMultipleValues();
        final SubLObject ke_operations = ke_text_token_lists_to_ke_operations(token_lists, new_constant_names, killed_constant_names);
        final SubLObject error_lists_$21 = thread.secondMultipleValue();
        final SubLObject new_constant_names_$22 = thread.thirdMultipleValue();
        final SubLObject killed_constant_names_$23 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(ke_operations, error_lists_$21, new_constant_names_$22, killed_constant_names_$23);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 60221L)
    public static SubLObject ke_text_file_to_ke_text_list(final SubLObject ke_text_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ke_text_list = (SubLObject)ke_text.NIL;
        SubLObject error_list = (SubLObject)ke_text.NIL;
        if (!ke_text_filename.isString()) {
            return Values.values((SubLObject)ke_text.NIL, (SubLObject)ConsesLow.list(reader.bq_cons(ke_text_filename, (SubLObject)ke_text.$list130)));
        }
        if (ke_text.NIL != string_utilities.null_stringP(ke_text_filename)) {
            return Values.values((SubLObject)ke_text.NIL, (SubLObject)ConsesLow.list(reader.bq_cons(ke_text_filename, (SubLObject)ke_text.$list131)));
        }
        if (ke_text.NIL == Filesys.probe_file(ke_text_filename)) {
            return Values.values((SubLObject)ke_text.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(ke_text_filename, (SubLObject)ke_text.ZERO_INTEGER, (SubLObject)ke_text.ZERO_INTEGER, file_utilities.why_not_probe_fileP(ke_text_filename))));
        }
        SubLObject stream = (SubLObject)ke_text.NIL;
        try {
            stream = compatibility.open_text(ke_text_filename, (SubLObject)ke_text.$kw132$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)ke_text.$str133$Unable_to_open__S, ke_text_filename);
            }
            final SubLObject ke_text_stream = stream;
            thread.resetMultipleValues();
            final SubLObject ke_text_list_$24 = ke_text_to_ke_text_list_internal(ke_text_stream, ke_text_filename);
            final SubLObject error_list_$25 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ke_text_list = ke_text_list_$24;
            error_list = error_list_$25;
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_text.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)ke_text.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(ke_text_list, error_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 61243L)
    public static SubLObject ke_text_to_ke_text_list(final SubLObject content, final SubLObject ke_text_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ke_text_list = (SubLObject)ke_text.NIL;
        SubLObject error_list = (SubLObject)ke_text.NIL;
        SubLObject stream = (SubLObject)ke_text.NIL;
        try {
            stream = streams_high.make_private_string_input_stream(content, (SubLObject)ke_text.ZERO_INTEGER, (SubLObject)ke_text.NIL);
            thread.resetMultipleValues();
            final SubLObject ke_text_list_$26 = ke_text_to_ke_text_list_internal(stream, ke_text_file);
            final SubLObject error_list_$27 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ke_text_list = ke_text_list_$26;
            error_list = error_list_$27;
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_text.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)ke_text.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(ke_text_list, error_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 61556L)
    public static SubLObject ke_text_to_ke_text_list_internal(final SubLObject stream, SubLObject source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ke_text_list = (SubLObject)ke_text.NIL;
        SubLObject error_message = (SubLObject)ke_text.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ke_text.$sym134$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject text_line;
                    for (text_line = (SubLObject)ke_text.NIL, text_line = streams_high.read_line(stream, (SubLObject)ke_text.NIL, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED); text_line != ke_text.$kw135$EOF && ke_text.NIL != text_line; text_line = streams_high.read_line(stream, (SubLObject)ke_text.NIL, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED)) {
                        ke_text_list = (SubLObject)ConsesLow.cons(text_line, ke_text_list);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ke_text.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ke_text.NIL != error_message) {
            return Values.values((SubLObject)ke_text.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(source, (SubLObject)ke_text.ZERO_INTEGER, (SubLObject)ke_text.ZERO_INTEGER, error_message)));
        }
        return Values.values(Sequences.nreverse(ke_text_list), (SubLObject)ke_text.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 62068L)
    public static SubLObject ke_operations_new_killed_renamed_merged_constant_names(final SubLObject ke_operations) {
        SubLObject new_killed_renamed_merged_constants = (SubLObject)ke_text.NIL;
        SubLObject new_constantsP = (SubLObject)ke_text.NIL;
        SubLObject killed_constantsP = (SubLObject)ke_text.NIL;
        SubLObject renamed_constantsP = (SubLObject)ke_text.NIL;
        SubLObject merged_constantsP = (SubLObject)ke_text.NIL;
        SubLObject cdolist_list_var = ke_operations;
        SubLObject ke_operation = (SubLObject)ke_text.NIL;
        ke_operation = cdolist_list_var.first();
        while (ke_text.NIL != cdolist_list_var) {
            final SubLObject operation_type = ke_operation.first();
            SubLObject operation_arg1 = conses_high.second(ke_operation);
            SubLObject operation_arg2 = conses_high.third(ke_operation);
            if (ke_text.NIL != new_constant_wrapperp(operation_arg1)) {
                operation_arg1 = conses_high.second(operation_arg1);
            }
            if (ke_text.NIL != new_constant_wrapperp(operation_arg2)) {
                operation_arg2 = conses_high.second(operation_arg2);
            }
            final SubLObject pcase_var = operation_type;
            if (pcase_var.eql((SubLObject)ke_text.$kw57$CREATE)) {
                new_constantsP = (SubLObject)ke_text.T;
                new_killed_renamed_merged_constants = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw57$CREATE, (SubLObject)ke_text.NIL, operation_arg1), new_killed_renamed_merged_constants);
            }
            else if (pcase_var.eql((SubLObject)ke_text.$kw59$KILL)) {
                killed_constantsP = (SubLObject)ke_text.T;
                new_killed_renamed_merged_constants = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)ke_text.$kw59$KILL, operation_arg1, (SubLObject)ke_text.$list136), new_killed_renamed_merged_constants);
            }
            else if (pcase_var.eql((SubLObject)ke_text.$kw65$RENAME)) {
                renamed_constantsP = (SubLObject)ke_text.T;
                new_killed_renamed_merged_constants = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw65$RENAME, operation_arg1, operation_arg2), new_killed_renamed_merged_constants);
            }
            else if (pcase_var.eql((SubLObject)ke_text.$kw78$MERGE)) {
                merged_constantsP = (SubLObject)ke_text.T;
                new_killed_renamed_merged_constants = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ke_text.$kw78$MERGE, operation_arg1, operation_arg2), new_killed_renamed_merged_constants);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ke_operation = cdolist_list_var.first();
        }
        new_killed_renamed_merged_constants = Sequences.nreverse(new_killed_renamed_merged_constants);
        return Values.values(new_killed_renamed_merged_constants, new_constantsP, killed_constantsP, renamed_constantsP, merged_constantsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 63540L)
    public static SubLObject ke_text_error_message(final SubLObject error_list) {
        SubLObject error_message = (SubLObject)ke_text.$str137$;
        final SubLObject error_file = error_list.first();
        final SubLObject error_line_number_start = conses_high.second(error_list);
        final SubLObject error_line_number_end = conses_high.third(error_list);
        final SubLObject error_string = conses_high.fourth(error_list);
        if (ke_text.NIL != error_file) {
            error_message = Sequences.cconcatenate(error_message, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str138$_A__, error_file));
        }
        if (ke_text.NIL != error_line_number_start) {
            if (ke_text.NIL != error_line_number_end) {
                error_message = Sequences.cconcatenate(error_message, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str139$_A__A__, error_line_number_start, error_line_number_end));
            }
            else {
                error_message = Sequences.cconcatenate(error_message, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str140$_A___, error_line_number_start));
            }
        }
        else if (ke_text.NIL != error_line_number_end) {
            error_message = Sequences.cconcatenate(error_message, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str141$__A__, error_line_number_end));
        }
        else {
            error_message = Sequences.cconcatenate(error_message, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str142$___));
        }
        error_message = Sequences.cconcatenate(error_message, PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str143$_A, error_string));
        return error_message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 64514L)
    public static SubLObject format_el_sentence_as_ke_text(final SubLObject stream, final SubLObject el_sentence) {
        PrintLow.format(stream, (SubLObject)ke_text.$str144$el_);
        format_cycl_expression.format_cycl_expression(el_sentence, stream, (SubLObject)ke_text.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)ke_text.$str145$____);
        return el_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 64717L)
    public static SubLObject load_ke_text_file(final SubLObject cyclist, final SubLObject filename, SubLObject method, SubLObject no_user_interactionP, SubLObject verbosity) {
        if (method == ke_text.UNPROVIDED) {
            method = (SubLObject)ke_text.$kw111$AGENDA;
        }
        if (no_user_interactionP == ke_text.UNPROVIDED) {
            no_user_interactionP = (SubLObject)ke_text.T;
        }
        if (verbosity == ke_text.UNPROVIDED) {
            verbosity = (SubLObject)ke_text.$kw146$NORMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(filename, ke_text.$sym147$STRINGP);
        final SubLObject the_cyclist = cyclist.isString() ? constants_high.find_constant(cyclist) : cyclist;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_text.$sym103$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(ke_text.$const104$EverythingPSC, thread);
            if (ke_text.NIL == kb_accessors.cyclistP(the_cyclist)) {
                PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str148$__Sorry___s_is_not_known_to_be_a_, cyclist);
            }
        }
        finally {
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
            if (ke_text.NIL != error_lists) {
                SubLObject cdolist_list_var = error_lists;
                SubLObject error_list = (SubLObject)ke_text.NIL;
                error_list = cdolist_list_var.first();
                while (ke_text.NIL != cdolist_list_var) {
                    PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str149$_A__, ke_text_error_message(error_list));
                    cdolist_list_var = cdolist_list_var.rest();
                    error_list = cdolist_list_var.first();
                }
            }
            else {
                thread.resetMultipleValues();
                final SubLObject ke_operations = ke_text_list_to_ke_operations(ke_text_list, filename, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
                final SubLObject error_lists_$28 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (ke_text.NIL != error_lists_$28) {
                    SubLObject cdolist_list_var2 = error_lists_$28;
                    SubLObject error_list2 = (SubLObject)ke_text.NIL;
                    error_list2 = cdolist_list_var2.first();
                    while (ke_text.NIL != cdolist_list_var2) {
                        PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str149$_A__, ke_text_error_message(error_list2));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        error_list2 = cdolist_list_var2.first();
                    }
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject new_killed_renamed_merged_constants = ke_operations_new_killed_renamed_merged_constant_names(ke_operations);
                    final SubLObject new_constantsP = thread.secondMultipleValue();
                    final SubLObject killed_constantsP = thread.thirdMultipleValue();
                    final SubLObject renamed_constantsP = thread.fourthMultipleValue();
                    final SubLObject merged_constantsP = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject string_list = (SubLObject)ke_text.NIL;
                    SubLObject filler_list = (SubLObject)ke_text.NIL;
                    if (ke_text.NIL != merged_constantsP) {
                        string_list = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str150$merged, string_list);
                    }
                    if (ke_text.NIL != renamed_constantsP) {
                        string_list = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str151$renamed, string_list);
                    }
                    if (ke_text.NIL != killed_constantsP) {
                        string_list = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str152$killed, string_list);
                    }
                    if (ke_text.NIL != new_constantsP) {
                        string_list = (SubLObject)ConsesLow.cons((SubLObject)ke_text.$str153$created, string_list);
                    }
                    final SubLObject pcase_var = Sequences.length(string_list);
                    if (pcase_var.eql((SubLObject)ke_text.TWO_INTEGER)) {
                        filler_list = (SubLObject)ke_text.$list154;
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.THREE_INTEGER)) {
                        filler_list = (SubLObject)ke_text.$list155;
                    }
                    else if (pcase_var.eql((SubLObject)ke_text.FOUR_INTEGER)) {
                        filler_list = (SubLObject)ke_text.$list156;
                    }
                    if (verbosity != ke_text.$kw157$QUIET) {
                        if (ke_text.NIL != string_list) {
                            PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str158$The_following_constants_will_be_);
                            SubLObject string = (SubLObject)ke_text.NIL;
                            SubLObject string_$29 = (SubLObject)ke_text.NIL;
                            SubLObject filler = (SubLObject)ke_text.NIL;
                            SubLObject filler_$30 = (SubLObject)ke_text.NIL;
                            string = string_list;
                            string_$29 = string.first();
                            filler = filler_list;
                            filler_$30 = filler.first();
                            while (ke_text.NIL != filler || ke_text.NIL != string) {
                                if (ke_text.NIL != string_$29) {
                                    PrintLow.format((SubLObject)ke_text.T, string_$29);
                                }
                                if (ke_text.NIL != filler_$30) {
                                    PrintLow.format((SubLObject)ke_text.T, filler_$30);
                                }
                                string = string.rest();
                                string_$29 = string.first();
                                filler = filler.rest();
                                filler_$30 = filler.first();
                            }
                            PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str159$_);
                        }
                        PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str160$__);
                        SubLObject cdolist_list_var3 = new_killed_renamed_merged_constants;
                        SubLObject new_killed_renamed_constant = (SubLObject)ke_text.NIL;
                        new_killed_renamed_constant = cdolist_list_var3.first();
                        while (ke_text.NIL != cdolist_list_var3) {
                            final SubLObject operation_type = new_killed_renamed_constant.first();
                            final SubLObject column1 = conses_high.second(new_killed_renamed_constant);
                            final SubLObject column2 = conses_high.third(new_killed_renamed_constant);
                            final SubLObject pcase_var2 = operation_type;
                            if (pcase_var2.eql((SubLObject)ke_text.$kw57$CREATE)) {
                                PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str161$__Create___A__, column2);
                            }
                            else if (pcase_var2.eql((SubLObject)ke_text.$kw59$KILL)) {
                                PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str162$__Kill___A__, column1);
                            }
                            else if (pcase_var2.eql((SubLObject)ke_text.$kw65$RENAME)) {
                                PrintLow.format((SubLObject)ke_text.T, (SubLObject)ke_text.$str163$__Rename___A_to__A__, column1, column2);
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            new_killed_renamed_constant = cdolist_list_var3.first();
                        }
                    }
                    if (verbosity != ke_text.$kw157$QUIET) {
                        SubLObject cdolist_list_var2 = ke_operations;
                        SubLObject ke_operation = (SubLObject)ke_text.NIL;
                        ke_operation = cdolist_list_var2.first();
                        while (ke_text.NIL != cdolist_list_var2) {
                            print_high.print(ke_operation, (SubLObject)ke_text.UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            ke_operation = cdolist_list_var2.first();
                        }
                    }
                    final SubLObject num_ops = Sequences.length(ke_operations);
                    SubLObject cur_op = (SubLObject)ke_text.ZERO_INTEGER;
                    final SubLObject _prev_bind_3 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$silent_progressP$.bind(Equality.eq(verbosity, (SubLObject)ke_text.$kw157$QUIET), thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)ke_text.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)ke_text.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)ke_text.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(PrintLow.format((SubLObject)ke_text.NIL, (SubLObject)ke_text.$str164$Evaluating__A_forms_____, num_ops));
                            SubLObject cdolist_list_var3 = ke_operations;
                            SubLObject ke_operation2 = (SubLObject)ke_text.NIL;
                            ke_operation2 = cdolist_list_var3.first();
                            while (ke_text.NIL != cdolist_list_var3) {
                                cur_op = Numbers.add(cur_op, (SubLObject)ke_text.ONE_INTEGER);
                                utilities_macros.note_percent_progress(cur_op, num_ops);
                                if (ke_text.NIL != ke_text.$ke_text_failures_log_file$.getDynamicValue(thread)) {
                                    SubLObject stream = (SubLObject)ke_text.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$31 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind((SubLObject)ke_text.NIL, thread);
                                            stream = compatibility.open_text(ke_text.$ke_text_failures_log_file$.getDynamicValue(thread), (SubLObject)ke_text.$kw165$APPEND);
                                        }
                                        finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$31, thread);
                                        }
                                        if (!stream.isStream()) {
                                            Errors.error((SubLObject)ke_text.$str133$Unable_to_open__S, ke_text.$ke_text_failures_log_file$.getDynamicValue(thread));
                                        }
                                        final SubLObject s = stream;
                                        thread.resetMultipleValues();
                                        final SubLObject result = do_ke_operation(ke_operation2, method);
                                        final SubLObject error = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (ke_text.NIL != error) {
                                            PrintLow.format(s, (SubLObject)ke_text.$str143$_A, error);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_text.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (stream.isStream()) {
                                                streams_high.close(stream, (SubLObject)ke_text.UNPROVIDED);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                        }
                                    }
                                }
                                else {
                                    do_ke_operation(ke_operation2, method);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                ke_operation2 = cdolist_list_var3.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_text.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_7, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_5, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_4, thread);
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_3, thread);
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_text.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                operation_communication.set_the_cyclist(old_cyclist);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_8, thread);
            }
        }
        return (SubLObject)ke_text.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 68367L)
    public static SubLObject parse_ke_text_string(final SubLObject ke_text_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ke_text_list = string_utilities.string_tokenize(ke_text_string, (SubLObject)ConsesLow.list(Strings.make_string((SubLObject)ke_text.ONE_INTEGER, (SubLObject)Characters.CHAR_newline)), (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject ke_operations = ke_text_list_to_ke_operations(ke_text_list, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED, (SubLObject)ke_text.UNPROVIDED);
        final SubLObject error_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list_utilities.make_plist((SubLObject)ke_text.$list170, (SubLObject)ConsesLow.list(ke_operations, error_lists));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 68714L)
    public static SubLObject load_ke_text_string(final SubLObject ke_text_string, SubLObject method) {
        if (method == ke_text.UNPROVIDED) {
            method = (SubLObject)ke_text.$kw111$AGENDA;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errors = (SubLObject)ke_text.NIL;
        final SubLObject parse = parse_ke_text_string(ke_text_string);
        final SubLObject ke_operations = conses_high.getf(parse, (SubLObject)ke_text.$kw171$KE_OPERATIONS, (SubLObject)ke_text.UNPROVIDED);
        final SubLObject error_lists = conses_high.getf(parse, (SubLObject)ke_text.$kw172$ERROR_LISTS, (SubLObject)ke_text.UNPROVIDED);
        SubLObject results = (SubLObject)ke_text.NIL;
        if (ke_text.NIL == error_lists) {
            SubLObject cdolist_list_var = ke_operations;
            SubLObject ke_operation = (SubLObject)ke_text.NIL;
            ke_operation = cdolist_list_var.first();
            while (ke_text.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject result = do_ke_operation(ke_operation, method);
                final SubLObject error = thread.secondMultipleValue();
                thread.resetMultipleValues();
                results = (SubLObject)ConsesLow.cons(result, results);
                if (ke_text.NIL != error) {
                    errors = (SubLObject)ConsesLow.cons(error, errors);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ke_operation = cdolist_list_var.first();
            }
        }
        return list_utilities.make_plist((SubLObject)ke_text.$list173, (SubLObject)ConsesLow.list(ke_operations, error_lists, errors));
    }
    
    public static SubLObject declare_ke_text_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ke_text", "with_ke_text_failures_to_file", "WITH-KE-TEXT-FAILURES-TO-FILE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ke_text_list_to_token_lists", "KE-TEXT-LIST-TO-TOKEN-LISTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ket_lookup_string", "KET-LOOKUP-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ket_directive_list_to_directive", "KET-DIRECTIVE-LIST-TO-DIRECTIVE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ket_relevant_mt", "KET-RELEVANT-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ket_relevant_strength", "KET-RELEVANT-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ket_relevant_direction", "KET-RELEVANT-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ket_unknown_to_known", "KET-UNKNOWN-TO-KNOWN", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ket_maybe_find_constant", "KET-MAYBE-FIND-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ket_make_ke_operation", "KET-MAKE-KE-OPERATION", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ke_text_token_lists_to_ke_operations", "KE-TEXT-TOKEN-LISTS-TO-KE-OPERATIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "do_ke_operation", "DO-KE-OPERATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "new_constant_wrapperp", "NEW-CONSTANT-WRAPPERP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "make_new_constant_wrapper", "MAKE-NEW-CONSTANT-WRAPPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "resolve_new_constants", "RESOLVE-NEW-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ke_text_list_to_ke_operations", "KE-TEXT-LIST-TO-KE-OPERATIONS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ke_text_file_to_ke_text_list", "KE-TEXT-FILE-TO-KE-TEXT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ke_text_to_ke_text_list", "KE-TEXT-TO-KE-TEXT-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ke_text_to_ke_text_list_internal", "KE-TEXT-TO-KE-TEXT-LIST-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ke_operations_new_killed_renamed_merged_constant_names", "KE-OPERATIONS-NEW-KILLED-RENAMED-MERGED-CONSTANT-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "ke_text_error_message", "KE-TEXT-ERROR-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "format_el_sentence_as_ke_text", "FORMAT-EL-SENTENCE-AS-KE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "load_ke_text_file", "LOAD-KE-TEXT-FILE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "parse_ke_text_string", "PARSE-KE-TEXT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_text", "load_ke_text_string", "LOAD-KE-TEXT-STRING", 1, 1, false);
        return (SubLObject)ke_text.NIL;
    }
    
    public static SubLObject init_ke_text_file() {
        ke_text.$ke_text_error_count_abort_num$ = SubLFiles.defparameter("*KE-TEXT-ERROR-COUNT-ABORT-NUM*", (SubLObject)ke_text.TEN_INTEGER);
        ke_text.$ke_text_failures_log_file$ = SubLFiles.defparameter("*KE-TEXT-FAILURES-LOG-FILE*", (SubLObject)ke_text.NIL);
        ke_text.$ket_string_to_directive$ = SubLFiles.defparameter("*KET-STRING-TO-DIRECTIVE*", (SubLObject)ke_text.$list16);
        ke_text.$ket_string_to_direction$ = SubLFiles.defparameter("*KET-STRING-TO-DIRECTION*", (SubLObject)ke_text.$list17);
        ke_text.$ket_string_to_strength$ = SubLFiles.defparameter("*KET-STRING-TO-STRENGTH*", (SubLObject)ke_text.$list18);
        return (SubLObject)ke_text.NIL;
    }
    
    public static SubLObject setup_ke_text_file() {
        utilities_macros.register_cyc_api_function((SubLObject)ke_text.$sym166$LOAD_KE_TEXT_FILE, (SubLObject)ke_text.$list167, (SubLObject)ke_text.$str168$Call_the_ke_text_engine_on_a_file, (SubLObject)ke_text.$list169, (SubLObject)ke_text.NIL);
        return (SubLObject)ke_text.NIL;
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
        me = (SubLFile)new ke_text();
        ke_text.$ke_text_error_count_abort_num$ = null;
        ke_text.$ke_text_failures_log_file$ = null;
        ke_text.$ket_string_to_directive$ = null;
        ke_text.$ket_string_to_direction$ = null;
        ke_text.$ket_string_to_strength$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym2$FILE_VALID_FOR_WRITING_P = SubLObjectFactory.makeSymbol("FILE-VALID-FOR-WRITING-P");
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym4$_KE_TEXT_FAILURES_LOG_FILE_ = SubLObjectFactory.makeSymbol("*KE-TEXT-FAILURES-LOG-FILE*");
        $sym5$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym6$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str7$Unable_to_log_failures_to__S_beca = SubLObjectFactory.makeString("Unable to log failures to ~S because file is not writeable.  Continuing without logging.");
        $kw8$END_OF_DIRECTIVE = SubLObjectFactory.makeKeyword("END-OF-DIRECTIVE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Aborting: Too many errors found"));
        $str10$Too_many_close_parenthesis_on_lin = SubLObjectFactory.makeString("Too many close parenthesis on line ~A");
        $kw11$END_OF_DATA = SubLObjectFactory.makeKeyword("END-OF-DATA");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Missing directive"));
        $str13$Missing_data_for_directive__A = SubLObjectFactory.makeString("Missing data for directive ~A");
        $str14$Unclosed_open_parenthesis_on_line = SubLObjectFactory.makeString("Unclosed open parenthesis on line ~A");
        $str15$Unfinished_expression_at_end_of_f = SubLObjectFactory.makeString("Unfinished expression at end of file");
        $list16 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("constant"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("collection"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("individual"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("function"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("microtheory"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("unit"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("formula"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("f"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("el"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("enter"), (SubLObject)SubLObjectFactory.makeKeyword("ENTER")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("delete"), (SubLObject)SubLObjectFactory.makeKeyword("DELETE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("assert"), (SubLObject)SubLObjectFactory.makeKeyword("ENTER")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("unassert"), (SubLObject)SubLObjectFactory.makeKeyword("DELETE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("in mt"), (SubLObject)SubLObjectFactory.makeKeyword("IN-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("mt"), (SubLObject)SubLObjectFactory.makeKeyword("IN-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("default mt"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("d"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("al"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("access level"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("strength"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("truth value"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("tv"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("kill"), (SubLObject)SubLObjectFactory.makeKeyword("KILL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rename"), (SubLObject)SubLObjectFactory.makeKeyword("RENAME")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("merge"), (SubLObject)SubLObjectFactory.makeKeyword("MERGE")) });
        $list17 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("forward"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("0"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("backward"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("4"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("code"), (SubLObject)SubLObjectFactory.makeKeyword("CODE")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("unknown"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("default"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("monotonic"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("unknown"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")));
        $kw19$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw20$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const21$DefaultMonotonicPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultMonotonicPredicate"));
        $kw22$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw23$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $kw24$CODE = SubLObjectFactory.makeKeyword("CODE");
        $str25$Something_is_nil = SubLObjectFactory.makeString("Something is nil");
        $str26$Bad_reference_to_a_killed_or_rena = SubLObjectFactory.makeString("Bad reference to a killed or renamed constant (~A)");
        $str27$A_single_colon_is_an_invalid_keyw = SubLObjectFactory.makeString("A single colon is an invalid keyword name");
        $str28$A_single_question_mark_is_an_inva = SubLObjectFactory.makeString("A single question mark is an invalid variable name");
        $list29 = ConsesLow.list((SubLObject)Characters.CHAR_quotation);
        $str30$Malformed_string = SubLObjectFactory.makeString("Malformed string");
        $str31$Gratutuious_single_quote = SubLObjectFactory.makeString("Gratutuious single quote");
        $kw32$DOT_FOR_DOTTED_LIST = SubLObjectFactory.makeKeyword("DOT-FOR-DOTTED-LIST");
        $str33$Bad_number___A_ = SubLObjectFactory.makeString("Bad number (~A)");
        $str34$nil = SubLObjectFactory.makeString("nil");
        $str35$t = SubLObjectFactory.makeString("t");
        $str36$Constant_not_found___A_ = SubLObjectFactory.makeString("Constant not found (~A)");
        $str37$Couldn_t_figure_out_string___A___ = SubLObjectFactory.makeString("Couldn't figure out string (~A) (did you forget a period?)");
        $str38$Couldn_t_figure_out___A_ = SubLObjectFactory.makeString("Couldn't figure out (~A)");
        $kw39$ENTER = SubLObjectFactory.makeKeyword("ENTER");
        $str40$TheAssertionSentence = SubLObjectFactory.makeString("TheAssertionSentence");
        $str41$__TheAssertionSentence = SubLObjectFactory.makeString("#$TheAssertionSentence");
        $str42$Formula____TheAssertionSentence_i = SubLObjectFactory.makeString("Formula: #$TheAssertionSentence is not yet set");
        $str43$Microtheory_not_specified = SubLObjectFactory.makeString("Microtheory not specified");
        $str44$Invalid_dotted_list = SubLObjectFactory.makeString("Invalid dotted list");
        $kw45$DELETE = SubLObjectFactory.makeKeyword("DELETE");
        $kw46$UNASSERT = SubLObjectFactory.makeKeyword("UNASSERT");
        $kw47$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Unknown directive"));
        $kw49$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Formula: No formula specified"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Formula: Formula specified must be a list"));
        $kw52$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Constant: No constant specified"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Constant: Only one constant may be specified"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Constant: Invalid constant name"));
        $str56$Constant__Constant_already_exists = SubLObjectFactory.makeString("Constant: Constant already exists with different case: ~A");
        $kw57$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $str58$Constant__Unrecognized_constant__ = SubLObjectFactory.makeString("Constant: Unrecognized constant (~A)");
        $kw59$KILL = SubLObjectFactory.makeKeyword("KILL");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: No constant specified"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: Only one constant may be specified"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: Can't kill a NART."));
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: Constant name must be a string."));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: Constant already killed."));
        $kw65$RENAME = SubLObjectFactory.makeKeyword("RENAME");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: Nothing to rename"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: Old constant name not specified"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: Can't rename NATs"));
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: Old constant name must be a string"));
        $str70$Rename__Can_t_rename_a_constant_r = SubLObjectFactory.makeString("Rename: Can't rename a constant recently killed or renamed (~A)");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: New constant name must be a string"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: New constant name must be a string inside double quotes."));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: New constant name is not a valid name for a constant."));
        $str74$Rename__Can_t_rename_to_constant_ = SubLObjectFactory.makeString("Rename: Can't rename to constant recently created (~A)");
        $str75$Rename__Can_t_rename_to_existing_ = SubLObjectFactory.makeString("Rename: Can't rename to existing constant in KB (~A)");
        $kw76$NEW_CONSTANT = SubLObjectFactory.makeKeyword("NEW-CONSTANT");
        $str77$Rename__Unrecognized_constant___A = SubLObjectFactory.makeString("Rename: Unrecognized constant (~A)");
        $kw78$MERGE = SubLObjectFactory.makeKeyword("MERGE");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Nothing to merge"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: No kill term given"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Can't merge from killed term"));
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Kill term must be a FORT"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: No keep term given"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Can't merge onto killed term"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Keep term must be a FORT"));
        $kw86$IN_MT = SubLObjectFactory.makeKeyword("IN-MT");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("In Mt: No mt specified"));
        $str88$In_Mt__NAT_mt_must_be_a_hlmt_p___ = SubLObjectFactory.makeString("In Mt: NAT mt must be a hlmt-p (~A)");
        $str89$In_Mt__Unrecognized_mt___A_ = SubLObjectFactory.makeString("In Mt: Unrecognized mt (~A)");
        $kw90$DEFAULT_MT = SubLObjectFactory.makeKeyword("DEFAULT-MT");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Default-Mt: No mt specified"));
        $str92$Default_Mt__NAT_mt_must_be_a_hlmt = SubLObjectFactory.makeString("Default Mt: NAT mt must be a hlmt-p (~A)");
        $str93$Default_Mt__Unrecognized_mt___A_ = SubLObjectFactory.makeString("Default Mt: Unrecognized mt (~A)");
        $kw94$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Strength: No strength specified"));
        $str96$Strength__Unrecognized_strength__ = SubLObjectFactory.makeString("Strength: Unrecognized strength (~A)");
        $kw97$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Direction: No direction specified"));
        $str99$Direction__Unrecognized_direction = SubLObjectFactory.makeString("Direction: Unrecognized direction (~A)");
        $sym100$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Unrecognized predicate"));
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NAT predicates unsupported"));
        $sym103$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const104$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str105$Constant_must_be_specified = SubLObjectFactory.makeString("Constant must be specified");
        $str106$Unexpected_argument_to_unary_pred = SubLObjectFactory.makeString("Unexpected argument to unary predicate (~A)");
        $str107$No_argument_found_for_binary_pred = SubLObjectFactory.makeString("No argument found for binary predicate (~A)");
        $str108$No_argument_found_for_arity__A_pr = SubLObjectFactory.makeString("No argument found for arity ~A predicate (~A)");
        $str109$List_argument_expected_for_arity_ = SubLObjectFactory.makeString("List argument expected for arity ~A predicate (~A)");
        $str110$Unexpected_argument_for_predicate = SubLObjectFactory.makeString("Unexpected argument for predicate (~A)");
        $kw111$AGENDA = SubLObjectFactory.makeKeyword("AGENDA");
        $sym112$FI_CREATE = SubLObjectFactory.makeSymbol("FI-CREATE");
        $sym113$FI_TIMESTAMP_CONSTANT = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT");
        $sym114$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw115$NOW = SubLObjectFactory.makeKeyword("NOW");
        $sym116$RESOLVE_NEW_CONSTANTS = SubLObjectFactory.makeSymbol("RESOLVE-NEW-CONSTANTS");
        $sym117$FI_ASSERT = SubLObjectFactory.makeSymbol("FI-ASSERT");
        $sym118$FI_TIMESTAMP_ASSERTION = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION");
        $sym119$FI_UNASSERT = SubLObjectFactory.makeSymbol("FI-UNASSERT");
        $sym120$FI_RENAME = SubLObjectFactory.makeSymbol("FI-RENAME");
        $const121$oldConstantName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("oldConstantName"));
        $const122$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $sym123$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $kw124$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list125 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"))));
        $sym126$FI_KILL = SubLObjectFactory.makeSymbol("FI-KILL");
        $sym127$FI_MERGE = SubLObjectFactory.makeSymbol("FI-MERGE");
        $str128$Constant_does_not_exist___A_ = SubLObjectFactory.makeString("Constant does not exist (~A)");
        $str129$_new_constant_must_be_followed_by = SubLObjectFactory.makeString(":new-constant must be followed by a string or constant");
        $list130 = ConsesLow.list((SubLObject)ke_text.ZERO_INTEGER, (SubLObject)ke_text.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Filename is not a string"));
        $list131 = ConsesLow.list((SubLObject)ke_text.ZERO_INTEGER, (SubLObject)ke_text.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Filename is null string"));
        $kw132$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str133$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym134$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw135$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list136 = ConsesLow.list((SubLObject)ke_text.NIL);
        $str137$ = SubLObjectFactory.makeString("");
        $str138$_A__ = SubLObjectFactory.makeString("~A: ");
        $str139$_A__A__ = SubLObjectFactory.makeString("~A-~A: ");
        $str140$_A___ = SubLObjectFactory.makeString("~A-: ");
        $str141$__A__ = SubLObjectFactory.makeString("-~A: ");
        $str142$___ = SubLObjectFactory.makeString("?: ");
        $str143$_A = SubLObjectFactory.makeString("~A");
        $str144$el_ = SubLObjectFactory.makeString("el:");
        $str145$____ = SubLObjectFactory.makeString(" .~%");
        $kw146$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
        $sym147$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str148$__Sorry___s_is_not_known_to_be_a_ = SubLObjectFactory.makeString("~%Sorry, ~s is not known to be a Cyclist.");
        $str149$_A__ = SubLObjectFactory.makeString("~A~%");
        $str150$merged = SubLObjectFactory.makeString("merged");
        $str151$renamed = SubLObjectFactory.makeString("renamed");
        $str152$killed = SubLObjectFactory.makeString("killed");
        $str153$created = SubLObjectFactory.makeString("created");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" or "));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(", or "));
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(" or "));
        $kw157$QUIET = SubLObjectFactory.makeKeyword("QUIET");
        $str158$The_following_constants_will_be_ = SubLObjectFactory.makeString("The following constants will be ");
        $str159$_ = SubLObjectFactory.makeString(":");
        $str160$__ = SubLObjectFactory.makeString("~%");
        $str161$__Create___A__ = SubLObjectFactory.makeString("  Create: ~A~%");
        $str162$__Kill___A__ = SubLObjectFactory.makeString("  Kill: ~A~%");
        $str163$__Rename___A_to__A__ = SubLObjectFactory.makeString("  Rename: ~A to ~A~%");
        $str164$Evaluating__A_forms_____ = SubLObjectFactory.makeString("Evaluating ~A forms...~%");
        $kw165$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $sym166$LOAD_KE_TEXT_FILE = SubLObjectFactory.makeSymbol("LOAD-KE-TEXT-FILE");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("AGENDA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NO-USER-INTERACTION?"), (SubLObject)ke_text.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("NORMAL")));
        $str168$Call_the_ke_text_engine_on_a_file = SubLObjectFactory.makeString("Call the ke text engine on a file from the lisp interactor.\n@param CYCLIST (string or constant) \n@param FILENAME string\n@param METHOD keyword ;; can be :agenda or :now.\n@param NO-USER-INTERACTION? boolean ;; this parameter is ignored\n@param VERBOSITY keyword-p; either :normal or :quiet.  If :quiet, will only show errors.\n");
        $list169 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KE-OPERATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR-LISTS"));
        $kw171$KE_OPERATIONS = SubLObjectFactory.makeKeyword("KE-OPERATIONS");
        $kw172$ERROR_LISTS = SubLObjectFactory.makeKeyword("ERROR-LISTS");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KE-OPERATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR-LISTS"), (SubLObject)SubLObjectFactory.makeKeyword("ERRORS"));
    }
}

/*

	Total time: 1462 ms
	
*/