/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.defmacro_obsolete_warning;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$html_icon_definitions$;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$javascript_definitions$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst_if;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_input_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HTML-UTILITIES
 * source file: /cyc/top/cycl/html-utilities.lisp
 * created:     2019/07/03 17:38:02
 */
public final class html_utilities extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @unknown belasco
     */
    @LispMethod(comment = "@unknown belasco")
    public static final SubLObject print_url_with_tag(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!string.isString()) {
                return NIL;
            }
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a_href___S__A__a_, string, string);
            return string;
        }
    }

    /**
     * Prints to *html-stream* a linked constant or stale constant reference in string.
     */
    @LispMethod(comment = "Prints to *html-stream* a linked constant or stale constant reference in string.")
    public static final SubLObject print_embedded_constant(SubLObject string, SubLObject length, SubLObject dollar_idx, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == UNPROVIDED) {
            link_function = CB_FORM;
        }
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        {
            SubLObject token_start = add(dollar_idx, ONE_INTEGER);
            SubLObject token_end = list_utilities.position_if_not(symbol_function(VALID_CONSTANT_NAME_CHAR_P), string, symbol_function(IDENTITY), token_start, UNPROVIDED);
            SubLObject token_last = NIL;
            SubLObject possible_constant = NIL;
            if (NIL == token_end) {
                token_end = length;
            }
            token_last = subtract(token_end, ONE_INTEGER);
            possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_end);
            if (!((NIL != possible_constant) || (NIL != require_exactP))) {
                if (NIL == possible_constant) {
                    {
                        SubLObject csome_list_var = $embedded_constant_suffix_strings$.getGlobalValue();
                        SubLObject suffix_string = NIL;
                        for (suffix_string = csome_list_var.first(); !((NIL != possible_constant) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , suffix_string = csome_list_var.first()) {
                            {
                                SubLObject abort_this_suffixP = NIL;
                                SubLObject i = NIL;
                                SubLObject j = NIL;
                                for (i = subtract(length(suffix_string), ONE_INTEGER), j = ZERO_INTEGER; !((i.numL(ZERO_INTEGER) || (NIL != possible_constant)) || (NIL != abort_this_suffixP)); i = subtract(i, ONE_INTEGER) , j = add(j, ONE_INTEGER)) {
                                    {
                                        SubLObject chari = Strings.sublisp_char(suffix_string, i);
                                        SubLObject possible_token_last = subtract(token_last, j);
                                        if (possible_token_last.numG(token_start) && (NIL != char_equal(chari, Strings.sublisp_char(string, possible_token_last)))) {
                                            possible_constant = constant_completion_high.constant_complete_exact(string, token_start, possible_token_last);
                                            if (NIL != possible_constant) {
                                                token_end = possible_token_last;
                                            }
                                        } else {
                                            abort_this_suffixP = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != possible_constant) {
                if (CB_FORM == link_function) {
                    cb_form(possible_constant, UNPROVIDED, UNPROVIDED);
                } else {
                    funcall(link_function, possible_constant);
                }
            } else {
                html_stale_constant_reference(string, subtract(dollar_idx, ONE_INTEGER), token_end);
            }
            return token_end;
        }
    }

    public static final SubLObject normalize_doc_string(SubLObject doc_string) {
        doc_string = string_utilities.string_substitute($str_alt37$, Strings.make_string(ONE_INTEGER, CHAR_return), doc_string, UNPROVIDED);
        if (NIL != Strings.stringE(doc_string, $str_alt37$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $str_alt37$;
        }
        {
            SubLObject doc_string_lines = string_utilities.string_tokenize(doc_string, list(Strings.make_string(ONE_INTEGER, CHAR_newline)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject new_doc_string_lines = NIL;
                SubLObject cdolist_list_var = doc_string_lines;
                SubLObject doc_string_line = NIL;
                for (doc_string_line = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , doc_string_line = cdolist_list_var.first()) {
                    new_doc_string_lines = cons(Strings.string_trim($list_alt38, doc_string_line), new_doc_string_lines);
                }
                doc_string_lines = nreverse(new_doc_string_lines);
            }
            doc_string_lines = subst_if($str_alt39$_p_, EMPTY_STRING_P, doc_string_lines, UNPROVIDED);
            {
                SubLObject cycl_block_positions = NIL;
                SubLObject initial_position = NIL;
                SubLObject block_type = NIL;
                SubLObject list_var = NIL;
                SubLObject doc_string_line = NIL;
                SubLObject line_position = NIL;
                for (list_var = doc_string_lines, doc_string_line = list_var.first(), line_position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , doc_string_line = list_var.first() , line_position = add(ONE_INTEGER, line_position)) {
                    {
                        SubLObject initial_character = (NIL != string_utilities.non_empty_stringP(doc_string_line)) ? ((SubLObject) (Strings.sublisp_char(doc_string_line, ZERO_INTEGER))) : NIL;
                        if (initial_character == CHAR_tab) {
                            {
                                SubLObject trimmed_doc_string_line = string_utilities.trim_whitespace(doc_string_line);
                                if (!((NIL != initial_position) || ((NIL != string_utilities.non_empty_stringP(trimmed_doc_string_line) ? ((SubLObject) (Strings.sublisp_char(trimmed_doc_string_line, ZERO_INTEGER))) : NIL) != CHAR_lparen))) {
                                    initial_position = line_position;
                                    block_type = initial_character;
                                }
                            }
                        } else {
                            if (initial_character == CHAR_lparen) {
                                initial_position = line_position;
                                block_type = initial_character;
                            } else {
                                if (NIL != initial_position) {
                                    cycl_block_positions = cons(list(initial_position, subtract(line_position, ONE_INTEGER), block_type), cycl_block_positions);
                                }
                                initial_position = NIL;
                            }
                        }
                    }
                }
                if (NIL != initial_position) {
                    cycl_block_positions = cons(list(initial_position, subtract(length(doc_string_lines), ONE_INTEGER), block_type), cycl_block_positions);
                }
                cycl_block_positions = nreverse(cycl_block_positions);
                {
                    SubLObject new_cycl_block_positions = NIL;
                    SubLObject cdolist_list_var = cycl_block_positions;
                    SubLObject cycl_block_position = NIL;
                    for (cycl_block_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_block_position = cdolist_list_var.first()) {
                        {
                            SubLObject start_line = cycl_block_position.first();
                            SubLObject end_line = second(cycl_block_position);
                            SubLObject block_type_5 = third(cycl_block_position);
                            if (!((start_line == end_line) && (block_type_5 == CHAR_lparen))) {
                                new_cycl_block_positions = cons(cycl_block_position, new_cycl_block_positions);
                            }
                        }
                    }
                    cycl_block_positions = nreverse(new_cycl_block_positions);
                }
                {
                    SubLObject new_doc_string_lines = NIL;
                    SubLObject last_line_processed = MINUS_ONE_INTEGER;
                    SubLObject cdolist_list_var = cycl_block_positions;
                    SubLObject cycl_block_position = NIL;
                    for (cycl_block_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_block_position = cdolist_list_var.first()) {
                        {
                            SubLObject start_line = cycl_block_position.first();
                            SubLObject end_line = second(cycl_block_position);
                            SubLObject tab_string = Strings.make_string(ONE_INTEGER, CHAR_tab);
                            {
                                SubLObject i = NIL;
                                for (i = add(last_line_processed, ONE_INTEGER); !i.numGE(start_line); i = add(i, ONE_INTEGER)) {
                                    new_doc_string_lines = cons(nth(i, doc_string_lines), new_doc_string_lines);
                                }
                            }
                            new_doc_string_lines = cons($str_alt41$_pre_, new_doc_string_lines);
                            {
                                SubLObject i = NIL;
                                for (i = start_line; !i.numG(end_line); i = add(i, ONE_INTEGER)) {
                                    new_doc_string_lines = cons(string_utilities.string_subst($str_alt42$__, tab_string, nth(i, doc_string_lines), UNPROVIDED), new_doc_string_lines);
                                    last_line_processed = i;
                                }
                            }
                            new_doc_string_lines = cons($str_alt43$__pre_, new_doc_string_lines);
                        }
                    }
                    {
                        SubLObject i = NIL;
                        for (i = add(last_line_processed, ONE_INTEGER); !i.numG(length(doc_string_lines)); i = add(i, ONE_INTEGER)) {
                            new_doc_string_lines = cons(nth(i, doc_string_lines), new_doc_string_lines);
                        }
                    }
                    doc_string_lines = nreverse(new_doc_string_lines);
                }
            }
            return string_utilities.bunge(doc_string_lines, CHAR_newline);
        }
    }

    public static final SubLObject convert_cycl_documentation_assertion_to_current_formatting2(SubLObject documentation_assertion) {
        SubLTrampolineFile.checkType(documentation_assertion, $sym44$GAF_ASSERTION_);
        if (NIL == isa.isaP(assertions_high.gaf_arg0(documentation_assertion), $$DocumentationPredicate, UNPROVIDED, UNPROVIDED)) {
            Errors.error($str_alt46$assertion_is_not_a_documentation_);
        }
        {
            SubLObject doc_string = assertions_high.gaf_arg2(documentation_assertion);
            SubLObject new_doc_string = string_utilities.string_subst($str_alt48$_code_, $str_alt49$_b_, doc_string, UNPROVIDED);
            new_doc_string = string_utilities.string_subst($str_alt50$__code_, $str_alt51$__b_, new_doc_string, UNPROVIDED);
            if (NIL == Strings.stringE(doc_string, new_doc_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject new_sentence = subst(new_doc_string, doc_string, uncanonicalizer.assertion_el_formula(documentation_assertion), UNPROVIDED, UNPROVIDED);
                    ke.ke_edit_assertion_strings(documentation_assertion, new_sentence, assertion_utilities.all_meta_assertions(documentation_assertion));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject convert_cycl_documentation_assertion_to_current_formatting(SubLObject documentation_assertion) {
        SubLTrampolineFile.checkType(documentation_assertion, $sym44$GAF_ASSERTION_);
        if (NIL == isa.isaP(assertions_high.gaf_arg0(documentation_assertion), $$DocumentationPredicate, UNPROVIDED, UNPROVIDED)) {
            Errors.error($str_alt46$assertion_is_not_a_documentation_);
        }
        {
            SubLObject doc_string = assertions_high.gaf_arg2(documentation_assertion);
            SubLObject new_doc_string = normalize_doc_string(doc_string);
            if ((NIL == Strings.stringE(doc_string, new_doc_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != string_utilities.substring_positions(new_doc_string, $list_alt47))) {
                {
                    SubLObject new_sentence = subst(new_doc_string, doc_string, uncanonicalizer.assertion_el_formula(documentation_assertion), UNPROVIDED, UNPROVIDED);
                    ke.ke_edit_assertion_strings(documentation_assertion, new_sentence, assertion_utilities.all_meta_assertions(documentation_assertion));
                }
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt37$ = makeString("");

    /**
     * A list of strings that can appear after a constant string in a KB comment.  This is used to determine what the constant is for highlighting purpose.  Note that each string implicitly effectively adds all the substrings that contain the last character of the string to the list.  For example, "es?" will find constants that are suffixed with either ":", "s:", or "es:" (in that order, meaning that "#$Dogs:" will match to #$Dogs before #$Dog if both those constants exist.)  Also note that these strings should only contain characters that pass VALID-CONSTANT-NAME-CHAR since non-valid characters won't be relevant.
     */
    // deflexical
    @LispMethod(comment = "A list of strings that can appear after a constant string in a KB comment.  This is used to determine what the constant is for highlighting purpose.  Note that each string implicitly effectively adds all the substrings that contain the last character of the string to the list.  For example, \"es?\" will find constants that are suffixed with either \":\", \"s:\", or \"es:\" (in that order, meaning that \"#$Dogs:\" will match to #$Dogs before #$Dog if both those constants exist.)  Also note that these strings should only contain characters that pass VALID-CONSTANT-NAME-CHAR since non-valid characters won\'t be relevant.\ndeflexical")
    private static final SubLSymbol $embedded_constant_suffix_strings$ = makeSymbol("*EMBEDDED-CONSTANT-SUFFIX-STRINGS*");

    /**
     * A list of HTML tags that will be preserved when printing cycl strings.
     */
    // deflexical
    @LispMethod(comment = "A list of HTML tags that will be preserved when printing cycl strings.\ndeflexical")
    public static final SubLSymbol $cycl_string_allowable_html_tags$ = makeSymbol("*CYCL-STRING-ALLOWABLE-HTML-TAGS*");

    public static final SubLFile me = new html_utilities();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $use_new_html_princ_cycl_stringP$ = makeSymbol("*USE-NEW-HTML-PRINC-CYCL-STRING?*");

    // defparameter
    /**
     * The color to use for stale #$ references in documentation strings (or NIL to
     * disable)
     */
    @LispMethod(comment = "The color to use for stale #$ references in documentation strings (or NIL to\r\ndisable)\ndefparameter\nThe color to use for stale #$ references in documentation strings (or NIL to\ndisable)")
    private static final SubLSymbol $html_stale_constant_reference_color$ = makeSymbol("*HTML-STALE-CONSTANT-REFERENCE-COLOR*");

    // defparameter
    // Do we convert #Space to #+ when outputting a string via HTML-URL-PRINC?
    /**
     * Do we convert #Space to #+ when outputting a string via HTML-URL-PRINC?
     */
    @LispMethod(comment = "Do we convert #Space to #+ when outputting a string via HTML-URL-PRINC?\ndefparameter")
    public static final SubLSymbol $html_url_princ_escape_spaces$ = makeSymbol("*HTML-URL-PRINC-ESCAPE-SPACES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_style_background$ = makeSymbol("*HTML-STYLE-BACKGROUND*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_align_map$ = makeSymbol("*HTML-ALIGN-MAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cycorp_homepage_url$ = makeSymbol("*CYCORP-HOMEPAGE-URL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cycorp_homepage_text$ = makeSymbol("*CYCORP-HOMEPAGE-TEXT*");

    // defparameter
    // Used internally by HTML-EXTRACT-INPUT
    /**
     * Used internally by HTML-EXTRACT-INPUT
     */
    @LispMethod(comment = "Used internally by HTML-EXTRACT-INPUT\ndefparameter")
    private static final SubLSymbol $html_extract_field_name$ = makeSymbol("*HTML-EXTRACT-FIELD-NAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $url_to_text_replacements$ = makeSymbol("*URL-TO-TEXT-REPLACEMENTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_filename_input_prefix$ = makeSymbol("*HTML-FILENAME-INPUT-PREFIX*");

    // deflexical
    /**
     * Key put onto the arg list to indicate that we are looking at
     * multipart/formdata.
     */
    @LispMethod(comment = "Key put onto the arg list to indicate that we are looking at\r\nmultipart/formdata.\ndeflexical\nKey put onto the arg list to indicate that we are looking at\nmultipart/formdata.")
    public static final SubLSymbol $html_multipart_form_date$ = makeSymbol("*HTML-MULTIPART-FORM-DATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $html_newline_string$ = makeSymbol("*HTML-NEWLINE-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_multipart_content_marker$ = makeSymbol("*HTML-MULTIPART-CONTENT-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $html_multipart_content_marker_size$ = makeSymbol("*HTML-MULTIPART-CONTENT-MARKER-SIZE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $build_treemap_depth$ = makeSymbol("*BUILD-TREEMAP-DEPTH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $build_treemap_max_depth$ = makeSymbol("*BUILD-TREEMAP-MAX-DEPTH*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $html_utils_test$ = makeSymbol("*HTML-UTILS-TEST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $html_utils_test_category$ = makeSymbol("*HTML-UTILS-TEST-CATEGORY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $html_utils_test_suite$ = makeSymbol("*HTML-UTILS-TEST-SUITE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $html_utils_module$ = makeSymbol("*HTML-UTILS-MODULE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $cb_use_frames$ = makeSymbol("*CB-USE-FRAMES*");

    private static final SubLSymbol HTML_RESERVED_CHAR_P = makeSymbol("HTML-RESERVED-CHAR-P");

    private static final SubLSymbol NON_ASCII_CHAR_P = makeSymbol("NON-ASCII-CHAR-P");





    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLInteger $int$62 = makeInteger(62);

    private static final SubLString $str7$__x = makeString("&#x");

    private static final SubLString $str8$_ = makeString(";");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLString $str14$__A_ = makeString("|~A|");

    private static final SubLString $str16$__x_x_ = makeString("&#x~x;");

    private static final SubLString $str17$______i__ = makeString(" ... <i>(");

    private static final SubLString $str18$_characters_total___i_ = makeString(" characters total)</i>");

    private static final SubLSymbol $sym21$EL_VARIABLE_CHAR_ = makeSymbol("EL-VARIABLE-CHAR?");

    private static final SubLSymbol $sym22$STRING_ = makeSymbol("STRING=");

    private static final SubLString $str23$_ = makeString("<");

    private static final SubLString $str24$_ = makeString("/");

    private static final SubLString $str25$_ = makeString(">");

    private static final SubLString $$$code = makeString("code");

    private static final SubLString $$$pre = makeString("pre");

    private static final SubLSymbol HTML_LINK_TO_OWL_URI = makeSymbol("HTML-LINK-TO-OWL-URI");

    private static final SubLSymbol HTML_LINK_TO_OWL_OPENCYC_URI = makeSymbol("HTML-LINK-TO-OWL-OPENCYC-URI");

    private static final SubLSymbol OPENCYC_HTML_CYCL_STRING = makeSymbol("OPENCYC-HTML-CYCL-STRING");

    private static final SubLList $list37 = list(new SubLObject[]{ list(list(makeString("#$rdfs:label is")), makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is")), list(list(makeString("#$rdfs:label is #$owl:NONSENSE http://www.w3.org/2000/01/rdf-schema#label")), makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is <font color=\"#ff0000\">#$owl:NONSENSE</font> <a href= \"http://www.w3.org/2000/01/rdf-schema#label\">http://www.w3.org/2000/01/rdf-schema#label</a>")), list(list(makeString("This is a <code>META-VARIABLE</code>.")), makeString("This is a <code><b>META-VARIABLE</b></code>.")), list(list(makeString("This is not a META-VARIABLE.")), makeString("This is not a META-VARIABLE.")), list(list(makeString("<code>(#$isa #$Emu THING)</code>.")), makeString("<code>(<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViBBJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">isa</a> <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a> <b>THING</b>)</code>.")), list(list(makeString("Bert is an #$Emu.")), makeString("Bert is an <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>.")), list(list(makeString("Please link to http://www.cyc.com.")), makeString("Please link to <a href= \"http://www.cyc.com\">http://www.cyc.com</a>.")), list(list(makeString("#$Emus are kind and gentle creatures.")), makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>s are kind and gentle creatures.")), list(list(list(reader_make_constant_shell("UnicodeStringFn"), makeString("The #$FamousHuman artist known as &u99AC;&u53CB;&u53CB;."))), makeString("The <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvVjma5wpEbGdrcN5Y29ycA\" class=\"cyc_term\">FamousHuman</a> artist known as &#x99AC;&#x53CB;&#x53CB;.")), list(list(makeString("Blake loves <code>code</code>, but hates <CODE>code</CODE> unless there's a <code>#$Person</code> in it.")), makeString("Blake loves <code>code</code>, but hates <CODE>code</CODE> unless there\'s a <code><a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViAkpwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Person</a></code> in it.")), list(list(makeString("S")), makeString("S")) });

    private static final SubLString $str39$_A = makeString("~A");

    private static final SubLString $str40$_ = makeString("(");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str42$___ = makeString(" . ");

    private static final SubLString $str43$_ = makeString(")");

    private static final SubLString $str44$___ = makeString("-_.");

    private static final SubLString $str45$__C_C = makeString("%~C~C");

    private static final SubLString $str46$_ = makeString("=");

    private static final SubLString $str47$ = makeString("");

    private static final SubLString $str48$background_color_ = makeString("background-color:");

    private static final SubLList $list49 = list(new SubLObject[]{ cons(makeKeyword("TOP"), makeString("top")), cons(makeKeyword("MIDDLE"), makeString("middle")), cons(makeKeyword("BOTTOM"), makeString("bottom")), cons($LEFT, makeString("left")), cons(makeKeyword("CENTER"), makeString("center")), cons(makeKeyword("RIGHT"), makeString("right")), cons(makeKeyword("TEXTTOP"), makeString("top")), cons(makeKeyword("ABSMIDDLE"), makeString("middle")), cons(makeKeyword("BASELINE"), makeString("bottom")), cons(makeKeyword("ABSBOTTOM"), makeString("bottom")) });

    private static final SubLString $str50$http___www_cyc_com = makeString("http://www.cyc.com");

    private static final SubLString $$$Cycorp = makeString("Cycorp");

    public static final SubLSymbol $proprietarity_message$ = makeSymbol("*PROPRIETARITY-MESSAGE*");

    private static final SubLString $$$copyright = makeString("copyright");

    private static final SubLString $str54$Copyright__copy__1995____A_ = makeString("Copyright &copy; 1995 - ~A ");

    private static final SubLString $str55$___All_rights_reserved___ = makeString(".  All rights reserved.  ");

    private static final SubLSymbol $CYC_LOGO_SMALL_VIOLET_FULL_URL = makeKeyword("CYC-LOGO-SMALL-VIOLET-FULL-URL");

    private static final SubLString $str57$cyc_logo_violet_16_gif = makeString("cyc-logo-violet-16.gif");

    private static final SubLSymbol $CYC_LOGO_LARGE_VIOLET_FULL_URL = makeKeyword("CYC-LOGO-LARGE-VIOLET-FULL-URL");

    private static final SubLString $str59$cyc_logo_violet_60_gif = makeString("cyc-logo-violet-60.gif");

    private static final SubLSymbol $CYCORP_SYMBOL_TINY = makeKeyword("CYCORP-SYMBOL-TINY");

    private static final SubLString $str61$cyc_logo_tiny_gif = makeString("cyc-logo-tiny.gif");

    private static final SubLSymbol $CYCORP_SYMBOL_SMALL = makeKeyword("CYCORP-SYMBOL-SMALL");

    private static final SubLString $str63$cyc_logo_sm_gif = makeString("cyc-logo-sm.gif");

    private static final SubLSymbol $CYCORP_SYMBOL_MEDIUM = makeKeyword("CYCORP-SYMBOL-MEDIUM");

    private static final SubLString $str65$cyc_logo_10_t_gif = makeString("cyc-logo-10-t.gif");

    private static final SubLSymbol $CYCORP_LOGO_MEDIUM = makeKeyword("CYCORP-LOGO-MEDIUM");

    private static final SubLString $str67$cyc_logo_25_t_gif = makeString("cyc-logo-25-t.gif");

    private static final SubLSymbol $CYCORP_LOGO_BIG = makeKeyword("CYCORP-LOGO-BIG");

    private static final SubLString $str69$cyc_logo_50_t_gif = makeString("cyc-logo-50-t.gif");

    private static final SubLString $str70$_URL_ = makeString(";URL=");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str72$Content_type = makeString("Content-type");

    private static final SubLString $str73$text_html__charset_UTF_8 = makeString("text/html; charset=UTF-8");

    private static final SubLString $$$Expires = makeString("Expires");

    private static final SubLString $str75$Last_Modified = makeString("Last-Modified");

    private static final SubLString $str76$Cache_Control = makeString("Cache-Control");

    private static final SubLString $str77$no_cache = makeString("no-cache");

    private static final SubLList $list78 = list(list(makeSymbol("&KEY"), list(makeSymbol("HH"), ZERO_INTEGER), list(makeSymbol("MM"), ZERO_INTEGER), list(makeSymbol("SS"), ZERO_INTEGER)));

    private static final SubLList $list79 = list(makeKeyword("HH"), makeKeyword("MM"), makeKeyword("SS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol HTML_WEBPAGE_EXPIRES = makeSymbol("HTML-WEBPAGE-EXPIRES");

    private static final SubLList $list85 = list(makeSymbol("HTML-META-EXPIRES"));

    private static final SubLSymbol HTML_META_EXPIRES = makeSymbol("HTML-META-EXPIRES");

    private static final SubLList $list87 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("UNIV-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))));

    private static final SubLSymbol HTML_WEBPAGE_LAST_MODIFIED = makeSymbol("HTML-WEBPAGE-LAST-MODIFIED");

    static private final SubLList $list89 = list(makeSymbol("HTML-META-LAST-MODIFIED"));

    private static final SubLSymbol HTML_META_LAST_MODIFIED = makeSymbol("HTML-META-LAST-MODIFIED");

    private static final SubLSymbol HTML_DONT_CACHE_WEBPAGE = makeSymbol("HTML-DONT-CACHE-WEBPAGE");

    private static final SubLList $list92 = list(makeSymbol("HTML-META-DONT-CACHE"));

    private static final SubLString $$$ROBOTS = makeString("ROBOTS");

    private static final SubLString $str94$NOINDEX__NOFOLLOW = makeString("NOINDEX, NOFOLLOW");

    private static final SubLString $str95$INDEX__FOLLOW = makeString("INDEX, FOLLOW");

    private static final SubLString $str96$NOINDEX__FOLLOW = makeString("NOINDEX, FOLLOW");

    private static final SubLString $str97$INDEX__NOFOLLOW = makeString("INDEX, NOFOLLOW");

    private static final SubLString $str98$Invalid_HTML_meta_select_robot_in = makeString("Invalid HTML meta select robot instruction.");

    private static final SubLString $$$Reset_All_Fields = makeString("Reset All Fields");

    private static final SubLString $str100$autocomplete_ = makeString("autocomplete-");

    private static final SubLString $str101$input_ = makeString("input-");

    private static final SubLString $str102$autocomplete_results_ = makeString("autocomplete-results-");

    private static final SubLString $str103$position_static__width_auto_ = makeString("position:static; width:auto ");

    private static final SubLString $str104$yui_ac = makeString("yui-ac");

    private static final SubLString $str105$yui_ac_input = makeString("yui-ac-input");

    private static final SubLString $str106$yui_ac_container = makeString("yui-ac-container");

    private static final SubLList $list107 = list(makeSymbol("SRC"), makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("MAP"));

    private static final SubLList $list108 = list(makeSymbol("SRC"), makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("MAP-ITEMS"));

    private static final SubLString $str109$_x = makeString(".x");

    private static final SubLString $str110$_y = makeString(".y");

    static private final SubLList $list111 = list(makeSymbol("X-RANGE"), makeSymbol("Y-RANGE"), makeSymbol("VALUE"));

    private static final SubLList $list112 = list(makeSymbol("ARG-NAME"), makeSymbol("VALUE"));

    private static final SubLList $list116 = list(makeSymbol("&KEY"), makeSymbol("SOFAR"), makeSymbol("TOTAL"), makeSymbol("WIDTH"), list(makeSymbol("HEIGHT"), TWO_INTEGER), list(makeSymbol("PROGRESS-COLOR"), list(QUOTE, makeSymbol("*HTML-COLOR-SAT-GREEN*"))), list(makeSymbol("REMAINING-COLOR"), list(QUOTE, makeSymbol("*HTML-COLOR-SAT-RED*"))), list(makeSymbol("BORDER"), ZERO_INTEGER));

    private static final SubLList $list117 = list(makeKeyword("SOFAR"), makeKeyword("TOTAL"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("PROGRESS-COLOR"), makeKeyword("REMAINING-COLOR"), makeKeyword("BORDER"));

    private static final SubLSymbol $html_color_sat_green$ = makeSymbol("*HTML-COLOR-SAT-GREEN*");

    private static final SubLSymbol $html_color_sat_red$ = makeSymbol("*HTML-COLOR-SAT-RED*");

    private static final SubLSymbol $sym127$WIDTH1 = makeUninternedSymbol("WIDTH1");

    private static final SubLSymbol $sym128$WIDTH2 = makeUninternedSymbol("WIDTH2");

    private static final SubLSymbol HTML_FANCY_TABLE = makeSymbol("HTML-FANCY-TABLE");

    private static final SubLList $list130 = list(makeKeyword("CELLSPACING"), ZERO_INTEGER, makeKeyword("CELLPADDING"), ZERO_INTEGER);

    private static final SubLSymbol HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS = makeSymbol("HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS");

    private static final SubLSymbol HTML_FANCY_TABLE_ROW = makeSymbol("HTML-FANCY-TABLE-ROW");

    private static final SubLSymbol HTML_FANCY_PERCENT_PROGRESS_BAR = makeSymbol("HTML-FANCY-PERCENT-PROGRESS-BAR");

    private static final SubLString $str141$Run_Time__ = makeString("Run Time :");

    private static final SubLString $str142$Elapsed_Time__ = makeString("Elapsed Time :");

    private static final SubLString $str144$Current_Total__ = makeString("Current Total :");

    private static final SubLString $$$_of_ = makeString(" of ");

    private static final SubLString $str147$_D_ = makeString("~D%");

    private static final SubLString $str148$_No_data_to_graph_ = makeString("[No data to graph]");

    private static final SubLString $str151$100_ = makeString("100%");

    private static final SubLString $str152$1_ = makeString("1%");

    private static final SubLString $str153$_ = makeString("%");

    private static final SubLString $str154$5_ = makeString("5%");

    private static final SubLString $str155$95_ = makeString("95%");

    private static final SubLString $str156$__D = makeString("~:D");

    private static final SubLList $list161 = list(list(makeKeyword("ENTRY"), makeSymbol("TRUE"), makeString("Value")));

    private static final SubLList $list164 = list(makeSymbol("TYPE"), makeSymbol("DATUM"), makeSymbol("POSSIBILITY-FANCY-NAME"));

    private static final SubLList $list165 = list($TEXT, NIL);

    private static final SubLList $list166 = list(makeSymbol("TYPE"), makeSymbol("SIZE"));

    private static final SubLString $str168$The_value_entered_for__ = makeString("The value entered for '");

    private static final SubLString $str169$__was_not_valid_ = makeString("' was not valid.");

    private static final SubLString $str170$No_value_was_entered_for__ = makeString("No value was entered for '");

    private static final SubLString $str171$__ = makeString("'.");

    private static final SubLString $str172$No_choice_was_made_for__ = makeString("No choice was made for '");

    private static final SubLString $str173$_is_not_a_declared_control_parame = makeString(" is not a declared control parameter");

    private static final SubLString $str176$entry_ = makeString("entry-");

    private static final SubLString $str177$radio_ = makeString("radio-");

    private static final SubLSymbol MATCHING_HTML_FIELD = makeSymbol("MATCHING-HTML-FIELD");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym184$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol MATCHING_HTML_BUTTON_FIELD = makeSymbol("MATCHING-HTML-BUTTON-FIELD");

    private static final SubLString $$$en = makeString("en");



    private static final SubLString $str188$en_gb = makeString("en-gb");



    private static final SubLString $$$fr = makeString("fr");



    private static final SubLString $$$de = makeString("de");





    private static final SubLString $str197$_lt_ = makeString("&lt;");

    private static final SubLString $str199$_gt_ = makeString("&gt;");

    private static final SubLString $str201$_amp_ = makeString("&amp;");

    private static final SubLString $str203$_quot_ = makeString("&quot;");

    private static final SubLString $str205$_reg_ = makeString("&reg;");

    private static final SubLString $str207$_copy_ = makeString("&copy;");

    private static final SubLString $str208$_nbsp_ = makeString("&nbsp;");

    private static final SubLString $str210$_emsp_ = makeString("&emsp;");

    private static final SubLString $str212$_ensp_ = makeString("&ensp;");

    private static final SubLString $str214$__X0020_ = makeString("&#X0020;");

    private static final SubLString $str216$__X2003_ = makeString("&#X2003;");

    private static final SubLString $str218$__X2002_ = makeString("&#X2002;");

    private static final SubLSymbol $TWO_PER_EM_SPACE = makeKeyword("TWO-PER-EM-SPACE");

    private static final SubLSymbol $THREE_PER_EM_SPACE = makeKeyword("THREE-PER-EM-SPACE");

    private static final SubLString $str221$__X2004_ = makeString("&#X2004;");

    private static final SubLSymbol $FOUR_PER_EM_SPACE = makeKeyword("FOUR-PER-EM-SPACE");

    private static final SubLString $str223$__X2005_ = makeString("&#X2005;");

    private static final SubLSymbol $SIX_PER_EM_SPACE = makeKeyword("SIX-PER-EM-SPACE");

    private static final SubLString $str225$__X2006_ = makeString("&#X2006;");

    private static final SubLString $str227$__X2009_ = makeString("&#X2009;");

    private static final SubLString $str229$__X200A_ = makeString("&#X200A;");

    private static final SubLString $str231$_iexcl_ = makeString("&iexcl;");

    private static final SubLString $str233$_cent_ = makeString("&cent;");

    private static final SubLString $str235$_pound_ = makeString("&pound;");

    private static final SubLString $str237$_curren_ = makeString("&curren;");

    private static final SubLString $str239$_yen_ = makeString("&yen;");

    private static final SubLString $str241$_brvba_ = makeString("&brvba;");

    private static final SubLString $str243$_sect_ = makeString("&sect;");

    private static final SubLString $str245$_uml_ = makeString("&uml;");

    private static final SubLString $str247$_ordf_ = makeString("&ordf;");

    private static final SubLString $str249$_laquo_ = makeString("&laquo;");

    private static final SubLString $str251$_not_ = makeString("&not;");

    private static final SubLString $str253$_shy_ = makeString("&shy;");

    private static final SubLString $str255$_macr_ = makeString("&macr;");

    private static final SubLString $str257$_deg_ = makeString("&deg;");

    private static final SubLString $str259$_plusmn_ = makeString("&plusmn;");

    private static final SubLString $str261$_sup2_ = makeString("&sup2;");

    private static final SubLString $str263$_sup3_ = makeString("&sup3;");

    private static final SubLString $str265$_acute_ = makeString("&acute;");

    private static final SubLString $str267$_micro_ = makeString("&micro;");

    private static final SubLString $str269$_para_ = makeString("&para;");

    private static final SubLString $str271$_middoy_ = makeString("&middoy;");

    private static final SubLString $str273$_cedil_ = makeString("&cedil;");

    private static final SubLString $str275$_sup1_ = makeString("&sup1;");

    private static final SubLString $str277$_ordm_ = makeString("&ordm;");

    private static final SubLString $str279$_raquo_ = makeString("&raquo;");

    private static final SubLString $str281$_frac14_ = makeString("&frac14;");

    private static final SubLString $str283$_frac12_ = makeString("&frac12;");

    private static final SubLString $str285$_frac34_ = makeString("&frac34;");

    private static final SubLString $str287$_iquest_ = makeString("&iquest;");

    private static final SubLString $str289$_Agrave_ = makeString("&Agrave;");

    private static final SubLString $str291$_Aacute_ = makeString("&Aacute;");

    private static final SubLString $str293$_Acirc_ = makeString("&Acirc;");

    private static final SubLString $str295$_Atilde_ = makeString("&Atilde;");

    private static final SubLString $str297$_Auml_ = makeString("&Auml;");

    private static final SubLString $str299$_Aring_ = makeString("&Aring;");

    private static final SubLString $str301$_AElig_ = makeString("&AElig;");

    private static final SubLString $str303$_Ccedil_ = makeString("&Ccedil;");

    private static final SubLString $str305$_Egrave_ = makeString("&Egrave;");

    private static final SubLString $str307$_Eacute_ = makeString("&Eacute;");

    private static final SubLString $str309$_Ecirc_ = makeString("&Ecirc;");

    private static final SubLString $str311$_Euml_ = makeString("&Euml;");

    private static final SubLString $str313$_Igrave_ = makeString("&Igrave;");

    private static final SubLString $str315$_Iacute_ = makeString("&Iacute;");

    private static final SubLString $str317$_Icirc_ = makeString("&Icirc;");

    private static final SubLString $str319$_Iuml_ = makeString("&Iuml;");

    private static final SubLString $str321$_ETH_ = makeString("&ETH;");

    private static final SubLString $str323$_Ntilde_ = makeString("&Ntilde;");

    private static final SubLString $str325$_Ograve_ = makeString("&Ograve;");

    private static final SubLString $str327$_Oacute_ = makeString("&Oacute;");

    private static final SubLString $str329$_Ocirc_ = makeString("&Ocirc;");

    private static final SubLString $str331$_Otilde_ = makeString("&Otilde;");

    private static final SubLString $str333$_Ouml_ = makeString("&Ouml;");

    private static final SubLString $str335$_times_ = makeString("&times;");

    private static final SubLString $str337$_Oslash_ = makeString("&Oslash;");

    private static final SubLString $str339$_Ugrave_ = makeString("&Ugrave;");

    private static final SubLString $str341$_Uacute_ = makeString("&Uacute;");

    private static final SubLString $str343$_Ucirc_ = makeString("&Ucirc;");

    private static final SubLString $str345$_Uuml_ = makeString("&Uuml;");

    private static final SubLString $str347$_Yacute_ = makeString("&Yacute;");

    private static final SubLString $str349$_THORN_ = makeString("&THORN;");

    private static final SubLString $str351$_szlig_ = makeString("&szlig;");

    private static final SubLString $str353$_agrave_ = makeString("&agrave;");

    private static final SubLString $str355$_aacute_ = makeString("&aacute;");

    private static final SubLString $str357$_acirc_ = makeString("&acirc;");

    private static final SubLString $str359$_atilde_ = makeString("&atilde;");

    private static final SubLString $str361$_auml_ = makeString("&auml;");

    private static final SubLString $str363$_aring_ = makeString("&aring;");

    private static final SubLString $str365$_aelig_ = makeString("&aelig;");

    private static final SubLString $str367$_ccedil_ = makeString("&ccedil;");

    private static final SubLString $str369$_egrave_ = makeString("&egrave;");

    private static final SubLString $str371$_eacute_ = makeString("&eacute;");

    private static final SubLString $str373$_ecirc_ = makeString("&ecirc;");

    private static final SubLString $str375$_euml_ = makeString("&euml;");

    private static final SubLString $str377$_igrave_ = makeString("&igrave;");

    private static final SubLString $str379$_iacute_ = makeString("&iacute;");

    private static final SubLString $str381$_icirc_ = makeString("&icirc;");

    private static final SubLString $str383$_iuml_ = makeString("&iuml;");

    private static final SubLString $str385$_eth_ = makeString("&eth;");

    private static final SubLString $str387$_ntilde_ = makeString("&ntilde;");

    private static final SubLString $str389$_ograve_ = makeString("&ograve;");

    private static final SubLString $str391$_oacute_ = makeString("&oacute;");

    private static final SubLString $str393$_ocirc_ = makeString("&ocirc;");

    private static final SubLString $str395$_otilde_ = makeString("&otilde;");

    private static final SubLString $str397$_ouml_ = makeString("&ouml;");

    private static final SubLString $str399$_divide_ = makeString("&divide;");

    private static final SubLString $str401$_oslash_ = makeString("&oslash;");

    private static final SubLString $str403$_ugrave_ = makeString("&ugrave;");

    private static final SubLString $str405$_uacute_ = makeString("&uacute;");

    private static final SubLString $str407$_ucirc_ = makeString("&ucirc;");

    private static final SubLString $str409$_uuml_ = makeString("&uuml;");

    private static final SubLString $str411$_yacute_ = makeString("&yacute;");

    private static final SubLString $str413$_thorn_ = makeString("&thorn;");

    private static final SubLString $str415$_yuml_ = makeString("&yuml;");

    private static final SubLString $str417$_fnof_ = makeString("&fnof;");

    private static final SubLString $str419$_Alpha_ = makeString("&Alpha;");

    private static final SubLString $str421$_Beta_ = makeString("&Beta;");

    private static final SubLString $str423$_Gamma_ = makeString("&Gamma;");

    private static final SubLString $str425$_Delta_ = makeString("&Delta;");

    private static final SubLString $str427$_Epsilon_ = makeString("&Epsilon;");

    private static final SubLString $str429$_Zeta_ = makeString("&Zeta;");

    private static final SubLString $str431$_Eta_ = makeString("&Eta;");

    private static final SubLString $str433$_Theta_ = makeString("&Theta;");

    private static final SubLString $str435$_Iota_ = makeString("&Iota;");

    private static final SubLString $str437$_Kappa_ = makeString("&Kappa;");

    private static final SubLString $str439$_Lambda_ = makeString("&Lambda;");

    private static final SubLString $str441$_Mu_ = makeString("&Mu;");

    private static final SubLString $str443$_Nu_ = makeString("&Nu;");

    private static final SubLString $str445$_Xi_ = makeString("&Xi;");

    private static final SubLString $str447$_Omicron_ = makeString("&Omicron;");

    private static final SubLString $str449$_Pi_ = makeString("&Pi;");

    private static final SubLString $str451$_Rho_ = makeString("&Rho;");

    private static final SubLString $str453$_Sigma_ = makeString("&Sigma;");

    private static final SubLString $str455$_Tau_ = makeString("&Tau;");

    private static final SubLString $str457$_Upsilon_ = makeString("&Upsilon;");

    private static final SubLString $str459$_Phi_ = makeString("&Phi;");

    private static final SubLString $str461$_Chi_ = makeString("&Chi;");

    private static final SubLString $str463$_Psi_ = makeString("&Psi;");

    private static final SubLString $str465$_Omega_ = makeString("&Omega;");

    private static final SubLString $str467$_alpha_ = makeString("&alpha;");

    private static final SubLString $str469$_beta_ = makeString("&beta;");

    private static final SubLString $str471$_gamma_ = makeString("&gamma;");

    private static final SubLString $str473$_delta_ = makeString("&delta;");

    private static final SubLString $str475$_epsilon_ = makeString("&epsilon;");

    private static final SubLString $str477$_zeta_ = makeString("&zeta;");

    private static final SubLString $str479$_eta_ = makeString("&eta;");

    private static final SubLString $str481$_theta_ = makeString("&theta;");

    private static final SubLString $str483$_iota_ = makeString("&iota;");

    private static final SubLString $str485$_kappa_ = makeString("&kappa;");

    private static final SubLString $str487$_lambda_ = makeString("&lambda;");

    private static final SubLString $str489$_mu_ = makeString("&mu;");

    private static final SubLString $str491$_nu_ = makeString("&nu;");

    private static final SubLString $str493$_xi_ = makeString("&xi;");

    private static final SubLString $str495$_omicron_ = makeString("&omicron;");

    private static final SubLString $str497$_pi_ = makeString("&pi;");

    private static final SubLString $str499$_rho_ = makeString("&rho;");

    private static final SubLString $str501$_sigmaf_ = makeString("&sigmaf;");

    private static final SubLString $str503$_sigma_ = makeString("&sigma;");

    private static final SubLString $str505$_tau_ = makeString("&tau;");

    private static final SubLString $str507$_upsilon_ = makeString("&upsilon;");

    private static final SubLString $str509$_phi_ = makeString("&phi;");

    private static final SubLString $str511$_chi_ = makeString("&chi;");

    private static final SubLString $str513$_psi_ = makeString("&psi;");

    private static final SubLString $str515$_omega_ = makeString("&omega;");

    private static final SubLString $str518$_upsih_ = makeString("&upsih;");

    private static final SubLString $str520$_piv_ = makeString("&piv;");

    private static final SubLString $str522$_bull_ = makeString("&bull;");

    private static final SubLString $str524$_hellip_ = makeString("&hellip;");

    private static final SubLString $str526$_prime_ = makeString("&prime;");

    private static final SubLString $str528$_Prime_ = makeString("&Prime;");

    private static final SubLString $str530$_oline_ = makeString("&oline;");

    private static final SubLString $str532$_frasl_ = makeString("&frasl;");

    private static final SubLString $str534$_weierp_ = makeString("&weierp;");

    private static final SubLString $str536$_image_ = makeString("&image;");

    private static final SubLString $str538$_real_ = makeString("&real;");

    private static final SubLString $str540$_trade_ = makeString("&trade;");

    private static final SubLString $str542$_alefsym_ = makeString("&alefsym;");

    private static final SubLString $str544$_uarr_ = makeString("&uarr;");

    private static final SubLString $str546$_rarr_ = makeString("&rarr;");

    private static final SubLString $str548$_larr_ = makeString("&larr;");

    private static final SubLString $str552$_darr_ = makeString("&darr;");

    private static final SubLString $str554$_harr_ = makeString("&harr;");

    private static final SubLString $str556$_crarr_ = makeString("&crarr;");

    private static final SubLString $str558$_lArr_ = makeString("&lArr;");

    private static final SubLString $str560$_uArr_ = makeString("&uArr;");

    private static final SubLString $str562$_rArr_ = makeString("&rArr;");

    private static final SubLString $str564$_dArr_ = makeString("&dArr;");

    private static final SubLString $str566$_hArr_ = makeString("&hArr;");

    private static final SubLString $str568$_forall_ = makeString("&forall;");

    private static final SubLString $str570$_part_ = makeString("&part;");

    private static final SubLString $str572$_exist_ = makeString("&exist;");

    private static final SubLString $str574$_empty_ = makeString("&empty;");

    private static final SubLString $str576$_nabla_ = makeString("&nabla;");

    private static final SubLString $str578$_isin_ = makeString("&isin;");

    private static final SubLString $str580$_notin_ = makeString("&notin;");

    private static final SubLString $str582$_ni_ = makeString("&ni;");

    private static final SubLString $str584$_prod_ = makeString("&prod;");

    private static final SubLString $str586$_sum_ = makeString("&sum;");

    private static final SubLString $str588$_minus_ = makeString("&minus;");

    private static final SubLString $str590$_lowast_ = makeString("&lowast;");

    private static final SubLString $str592$_radic_ = makeString("&radic;");

    private static final SubLString $str594$_prop_ = makeString("&prop;");

    private static final SubLString $str596$_infin_ = makeString("&infin;");

    private static final SubLString $str598$_ang_ = makeString("&ang;");

    private static final SubLString $str600$_and_ = makeString("&and;");

    private static final SubLString $str602$_or_ = makeString("&or;");

    private static final SubLString $str604$_cap_ = makeString("&cap;");

    private static final SubLString $str606$_cup_ = makeString("&cup;");

    private static final SubLString $str608$_int_ = makeString("&int;");

    private static final SubLString $str610$_there4_ = makeString("&there4;");

    private static final SubLString $str612$_sim_ = makeString("&sim;");

    private static final SubLString $str614$_cong_ = makeString("&cong;");

    private static final SubLString $str616$_asymp_ = makeString("&asymp;");

    private static final SubLString $str618$_ne_ = makeString("&ne;");

    private static final SubLString $str620$_equiv_ = makeString("&equiv;");

    private static final SubLString $str622$_le_ = makeString("&le;");

    private static final SubLString $str624$_ge_ = makeString("&ge;");

    private static final SubLString $str626$_sub_ = makeString("&sub;");

    private static final SubLString $str628$_sup_ = makeString("&sup;");

    private static final SubLString $str630$_nsub_ = makeString("&nsub;");

    private static final SubLString $str632$_sube_ = makeString("&sube;");

    private static final SubLString $str634$_supe_ = makeString("&supe;");

    private static final SubLString $str636$_oplus_ = makeString("&oplus;");

    private static final SubLString $str638$_otimes_ = makeString("&otimes;");

    private static final SubLString $str640$_perp_ = makeString("&perp;");

    private static final SubLString $str642$_sdot_ = makeString("&sdot;");

    private static final SubLString $str644$_lceil_ = makeString("&lceil;");

    private static final SubLString $str646$_rceil_ = makeString("&rceil;");

    private static final SubLString $str648$_lfloor_ = makeString("&lfloor;");

    private static final SubLString $str650$_rfloor_ = makeString("&rfloor;");

    private static final SubLString $str652$_lang_ = makeString("&lang;");

    private static final SubLString $str654$_rang_ = makeString("&rang;");

    private static final SubLString $str656$_loz_ = makeString("&loz;");

    private static final SubLString $str658$_spades_ = makeString("&spades;");

    private static final SubLString $str660$_clubs_ = makeString("&clubs;");

    private static final SubLString $str662$_hearts_ = makeString("&hearts;");

    private static final SubLString $str664$_diams_ = makeString("&diams;");

    private static final SubLString $str666$__9785_ = makeString("&#9785;");

    private static final SubLSymbol HEX_CHAR_STRING_P = makeSymbol("HEX-CHAR-STRING-P");

    private static final SubLString $str668$__ = makeString("&#");

    private static final SubLString $str669$_ = makeString("_");

    private static final SubLString $str670$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str671$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $$$Echo_of_ARGS = makeString("Echo of ARGS");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLSymbol HTML_ECHO_ARGS = makeSymbol("HTML-ECHO-ARGS");

    private static final SubLList $list678 = list(makeSymbol("FILENAME"));

    private static final SubLString $str680$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol HTML_ECHO_FILE = makeSymbol("HTML-ECHO-FILE");

    private static final SubLString $str682$_ = makeString("\"");

    private static final SubLString $str683$____ = makeString("<!--");

    private static final SubLString $str684$___ = makeString("-->");

    private static final SubLString $str685$_script = makeString("<script");

    private static final SubLString $str686$__script_ = makeString("</script>");

    private static final SubLString $str687$__script = makeString("</script");

    private static final SubLList $list688 = list(CHAR_backslash);

    private static final SubLList $list689 = list(cons(makeString("&quot;"), makeString("\"")), cons(makeString("&amp;"), makeString("&")), cons(makeString("&nbsp;"), makeString(" ")));

    private static final SubLString $str690$http___ = makeString("http://");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $str693$_style = makeString("<style");

    private static final SubLString $str694$__style_ = makeString("</style>");

    private static final SubLString $str695$_p_ = makeString("<p>");

    private static final SubLString $str696$_file_input_ = makeString("_file_input_");

    private static final SubLString $str697$this_form_ = makeString("this.form.");

    private static final SubLString $str698$_value___this_value_ = makeString(".value = this.value;");

    private static final SubLString $$$TEXT = makeString("TEXT");

    private static final SubLList $list700 = list(list(makeSymbol("HANDLER-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym701$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    private static final SubLSymbol CB_FRAME_NAME = makeSymbol("CB-FRAME-NAME");

    private static final SubLSymbol HTML_FANCY_FORM = makeSymbol("HTML-FANCY-FORM");

    private static final SubLSymbol $cyc_cgi_program$ = makeSymbol("*CYC-CGI-PROGRAM*");

    private static final SubLSymbol $html_form_method_post$ = makeSymbol("*HTML-FORM-METHOD-POST*");

    private static final SubLList $list707 = list(NIL, NIL, NIL, makeString("multipart/form-data"));

    private static final SubLSymbol HTML_HIDDEN_INPUT = makeSymbol("HTML-HIDDEN-INPUT");

    private static final SubLList $list709 = list(T);

    private static final SubLString $str710$_multipart_formdata = makeString(" multipart/formdata");

    private static final SubLString $str711$application_octet_stream = makeString("application/octet-stream");

    private static final SubLString $$$T = makeString("T");

    private static final SubLSymbol $sym713$CHAR_ = makeSymbol("CHAR=");

    private static final SubLList $list714 = list(makeSymbol("ITEM"), makeSymbol("VALUE"));

    private static final SubLString $str715$__2__0X = makeString("%~2,'0X");

    private static final SubLString $str716$____________________ = makeString("--------------------");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLInteger $int$800 = makeInteger(800);

    private static final SubLString $str730$new_login_id = makeString("new_login_id");

    private static final SubLString $str731$hashed_password = makeString("hashed_password");

    private static final SubLString $$$User_ID = makeString("User ID");

    private static final SubLString $$$Password = makeString("Password");

    private static final SubLString $str734$unhashed_password_ = makeString("unhashed_password_");

    private static final SubLString $str735$var_oldB64Pad___b64pad__b64pad___ = makeString("var oldB64Pad = b64pad; b64pad = '='; var theInput=(this.form.");

    private static final SubLString $str736$_value_this_form_ = makeString(".value+this.form.");

    private static final SubLString $str737$_value___this_form_ = makeString(".value); this.form.");

    private static final SubLString $str738$_value_b64_sha1_theInput___b64pad = makeString(".value=b64_sha1(theInput); b64pad = oldB64Pad");



    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $$$HTML_Utilities_Test = makeString("HTML Utilities Test");

    private static final SubLString $$$_Category = makeString(" Category");

    private static final SubLString $$$_Suite = makeString(" Suite");

    private static final SubLString $str746$HTML_Utilities = makeString("HTML-Utilities");

    /**
     * Flush the output of *html-stream*
     */
    @LispMethod(comment = "Flush the output of *html-stream*")
    public static final SubLObject html_flush_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            force_output(html_macros.$html_stream$.getDynamicValue(thread));
            return NIL;
        }
    }

    /**
     * Flush the output of *html-stream*
     */
    @LispMethod(comment = "Flush the output of *html-stream*")
    public static SubLObject html_flush() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        force_output(html_macros.$html_stream$.getDynamicValue(thread));
        return NIL;
    }

    /**
     * Write <char> to *html-stream* <n> times
     */
    @LispMethod(comment = "Write <char> to *html-stream* <n> times")
    public static final SubLObject html_char_alt(SubLObject v_char, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                    write_char(v_char, html_macros.$html_stream$.getDynamicValue(thread));
                }
            }
            return v_char;
        }
    }

    /**
     * Write <char> to *html-stream* <n> times
     */
    @LispMethod(comment = "Write <char> to *html-stream* <n> times")
    public static SubLObject html_char(final SubLObject v_char, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            write_char(v_char, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return v_char;
    }

    /**
     * Write <string> to *html-stream*, beginning at <start>. <start> defaults to 0.
     * If <end> is specified, stop at that character.
     * If *html-safe-print* is non-NIL, then substitute HTML escape sequences for HTML reserved characters.
     */
    @LispMethod(comment = "Write <string> to *html-stream*, beginning at <start>. <start> defaults to 0.\r\nIf <end> is specified, stop at that character.\r\nIf *html-safe-print* is non-NIL, then substitute HTML escape sequences for HTML reserved characters.\nWrite <string> to *html-stream*, beginning at <start>. <start> defaults to 0.\nIf <end> is specified, stop at that character.\nIf *html-safe-print* is non-NIL, then substitute HTML escape sequences for HTML reserved characters.")
    public static final SubLObject html_string_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == end) {
                end = length(string);
            }
            if (start.numL(end)) {
                if (((NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) && (NIL != find_if(HTML_RESERVED_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != find_if(NON_ASCII_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    {
                        SubLObject string_var = string;
                        SubLObject end_var = (NIL != end) ? ((SubLObject) (end)) : length(string_var);
                        SubLObject end_var_1 = end_var;
                        SubLObject char_num = NIL;
                        for (char_num = start; !char_num.numGE(end_var_1); char_num = number_utilities.f_1X(char_num)) {
                            {
                                SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                                SubLObject subst_string = html_escape_string_for_char(v_char, html_macros.$html_safe_print$.getDynamicValue(thread));
                                if (NIL != subst_string) {
                                    write_string(subst_string, html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                } else {
                                    write_char(v_char, html_macros.$html_stream$.getDynamicValue(thread));
                                }
                            }
                        }
                    }
                } else {
                    write_string(string, html_macros.$html_stream$.getDynamicValue(thread), start, end);
                }
            }
            return NIL;
        }
    }

    /**
     * Write <string> to *html-stream*, beginning at <start>. <start> defaults to 0.
     * If <end> is specified, stop at that character.
     * If *html-safe-print* is non-NIL, then substitute HTML escape sequences for HTML reserved characters.
     */
    @LispMethod(comment = "Write <string> to *html-stream*, beginning at <start>. <start> defaults to 0.\r\nIf <end> is specified, stop at that character.\r\nIf *html-safe-print* is non-NIL, then substitute HTML escape sequences for HTML reserved characters.\nWrite <string> to *html-stream*, beginning at <start>. <start> defaults to 0.\nIf <end> is specified, stop at that character.\nIf *html-safe-print* is non-NIL, then substitute HTML escape sequences for HTML reserved characters.")
    public static SubLObject html_string(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == end) {
            end = length(string);
        }
        if (start.numL(end)) {
            if (((NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) && (NIL != find_if(HTML_RESERVED_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != find_if(NON_ASCII_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                SubLObject end_var_$1;
                SubLObject end_var;
                SubLObject char_num;
                SubLObject v_char;
                SubLObject subst_string;
                for (end_var = end_var_$1 = (NIL != end) ? end : length(string), char_num = NIL, char_num = start; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                    subst_string = html_escape_string_for_char(v_char, html_macros.$html_safe_print$.getDynamicValue(thread));
                    if (NIL != subst_string) {
                        write_string(subst_string, html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    } else {
                        write_char(v_char, html_macros.$html_stream$.getDynamicValue(thread));
                    }
                }
            } else {
                write_string(string, html_macros.$html_stream$.getDynamicValue(thread), start, end);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT an HTML reserved character?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT an HTML reserved character?")
    public static final SubLObject html_reserved_char_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values(html_macros.$html_escapes_map$.getDynamicValue(thread), v_object, symbol_function(EQ), NIL));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT an HTML reserved character?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT an HTML reserved character?")
    public static SubLObject html_reserved_char_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values(html_macros.$html_escapes_map$.getDynamicValue(thread), v_object, symbol_function(EQ), NIL));
    }

    public static final SubLObject html_escape_string_for_char_alt(SubLObject v_char, SubLObject escape_reserved_charsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != unicode_strings.non_ascii_char_p(v_char)) {
                return html_escape_string_for_non_ascii_char(v_char);
            } else {
                if (NIL != escape_reserved_charsP) {
                    return list_utilities.alist_lookup_without_values(html_macros.$html_escapes_map$.getDynamicValue(thread), v_char, symbol_function(EQ), NIL);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject html_escape_string_for_char(final SubLObject v_char, final SubLObject escape_reserved_charsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != unicode_strings.non_ascii_char_p(v_char)) {
            return html_escape_string_for_non_ascii_char(v_char);
        }
        if (NIL != escape_reserved_charsP) {
            return list_utilities.alist_lookup_without_values(html_macros.$html_escapes_map$.getDynamicValue(thread), v_char, symbol_function(EQ), NIL);
        }
        return NIL;
    }

    public static SubLObject string_has_any_escape_charsP(final SubLObject string, final SubLObject escape_reserved_charsP) {
        SubLObject result = NIL;
        final SubLObject end_var = length(string);
        if (NIL == result) {
            SubLObject end_var_$2;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$2 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == result) && (!char_num.numGE(end_var_$2)); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if ((NIL != unicode_strings.non_ascii_char_p(v_char)) || ((NIL != escape_reserved_charsP) && (NIL != html_reserved_character_code_p(char_code(v_char))))) {
                    result = T;
                }
            }
        }
        return result;
    }

    public static SubLObject html_reserved_character_code_p(final SubLObject code) {
        if (((code.eql($int$38) || code.eql($int$34)) || code.eql($int$60)) || code.eql($int$62)) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return STRINGP; The hexadecimal HTML escape string for CHAR.
     * @unknown baxter
     */
    @LispMethod(comment = "@return STRINGP; The hexadecimal HTML escape string for CHAR.\r\n@unknown baxter")
    public static final SubLObject html_escape_string_for_non_ascii_char_alt(SubLObject v_char) {
        SubLTrampolineFile.checkType(v_char, NON_ASCII_CHAR_P);
        {
            SubLObject char_code = char_code(v_char);
            return cconcatenate($str_alt3$__x, new SubLObject[]{ format_nil.format_nil_a_no_copy(number_utilities.convert_to_hexadecimal(char_code)), $str_alt4$_ });
        }
    }

    /**
     *
     *
     * @return STRINGP; The hexadecimal HTML escape string for CHAR.
     * @unknown baxter
     */
    @LispMethod(comment = "@return STRINGP; The hexadecimal HTML escape string for CHAR.\r\n@unknown baxter")
    public static SubLObject html_escape_string_for_non_ascii_char(final SubLObject v_char) {
        assert NIL != unicode_strings.non_ascii_char_p(v_char) : "! unicode_strings.non_ascii_char_p(v_char) " + ("unicode_strings.non_ascii_char_p(v_char) " + "CommonSymbols.NIL != unicode_strings.non_ascii_char_p(v_char) ") + v_char;
        final SubLObject char_code = char_code(v_char);
        return cconcatenate($str7$__x, new SubLObject[]{ format_nil.format_nil_a_no_copy(number_utilities.convert_to_hexadecimal(char_code)), $str8$_ });
    }

    /**
     *
     *
     * @return STRINGP; version of STRING with non-ASCII characters (and, if ESCAPE-RESERVED-CHARS?
    is non-NIL, HTML reserved characters) replaced with their escape codes.
     * @unknown baxter
     */
    @LispMethod(comment = "@return STRINGP; version of STRING with non-ASCII characters (and, if ESCAPE-RESERVED-CHARS?\r\nis non-NIL, HTML reserved characters) replaced with their escape codes.\r\n@unknown baxter")
    public static final SubLObject html_escape_alt(SubLObject string, SubLObject escape_reserved_charsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject new_string = NIL;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(escape_reserved_charsP, thread);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(stream, thread);
                                        html_string(string, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                new_string = get_output_stream_string(stream);
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
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_string;
            }
        }
    }

    /**
     *
     *
     * @return STRINGP; version of STRING with non-ASCII characters (and, if ESCAPE-RESERVED-CHARS?
    is non-NIL, HTML reserved characters) replaced with their escape codes.
     * @unknown baxter
     */
    @LispMethod(comment = "@return STRINGP; version of STRING with non-ASCII characters (and, if ESCAPE-RESERVED-CHARS?\r\nis non-NIL, HTML reserved characters) replaced with their escape codes.\r\n@unknown baxter")
    public static SubLObject html_escape(final SubLObject string, final SubLObject escape_reserved_charsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL == string_has_any_escape_charsP(string, escape_reserved_charsP)) {
            return string;
        }
        SubLObject new_string = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(escape_reserved_charsP, thread);
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0_$3 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    html_string(string, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0_$3, thread);
                }
                new_string = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        return new_string;
    }

    public static final SubLObject subl_string_to_display_vector_string_alt(SubLObject subl_string) {
        return unicode_strings.html_escaped_to_display(html_escape(subl_string, T));
    }

    public static SubLObject subl_string_to_display_vector_string(final SubLObject subl_string) {
        return unicode_strings.html_escaped_to_display(html_escape(subl_string, T));
    }

    /**
     * princ <object> to *html-stream*.  If *html-safe-print* is non-NIL, use functions which will also check *html-safe-print* and substitute HTML escape sequences for HTML reserved characters.  Otherwise, just call princ.
     */
    @LispMethod(comment = "princ <object> to *html-stream*.  If *html-safe-print* is non-NIL, use functions which will also check *html-safe-print* and substitute HTML escape sequences for HTML reserved characters.  Otherwise, just call princ.")
    public static final SubLObject html_princ_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) {
                if (v_object.isString()) {
                    html_string(v_object, UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL != nart_handles.nart_p(v_object)) {
                        html_princ(format_nil.format_nil_a(v_object));
                    } else {
                        if (NIL != constant_p(v_object)) {
                            html_markup(constants_high.constant_name(v_object));
                        } else {
                            if (v_object.isChar()) {
                                html_char(v_object, UNPROVIDED);
                            } else {
                                if (v_object.isNumber()) {
                                    princ(v_object, html_macros.$html_stream$.getDynamicValue(thread));
                                } else {
                                    if (v_object.isKeyword()) {
                                        html_string(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
                                    } else {
                                        if (v_object.isSymbol()) {
                                            html_string(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
                                        } else {
                                            html_princ(format_nil.format_nil_a(v_object));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                princ(v_object, html_macros.$html_stream$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    /**
     * princ <object> to *html-stream*.  If *html-safe-print* is non-NIL, use functions which will also check *html-safe-print* and substitute HTML escape sequences for HTML reserved characters.  Otherwise, just call princ.
     */
    @LispMethod(comment = "princ <object> to *html-stream*.  If *html-safe-print* is non-NIL, use functions which will also check *html-safe-print* and substitute HTML escape sequences for HTML reserved characters.  Otherwise, just call princ.")
    public static SubLObject html_princ(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) {
            if (v_object.isString()) {
                html_string(v_object, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != nart_handles.nart_p(v_object)) {
                    html_princ(format_nil.format_nil_a(v_object));
                } else
                    if (NIL != constant_p(v_object)) {
                        html_markup(constants_high.constant_name(v_object));
                    } else
                        if (v_object.isChar()) {
                            html_char(v_object, UNPROVIDED);
                        } else
                            if (v_object.isNumber()) {
                                princ(v_object, html_macros.$html_stream$.getDynamicValue(thread));
                            } else
                                if (v_object.isKeyword()) {
                                    html_string(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
                                } else
                                    if (v_object.isSymbol()) {
                                        html_string(symbol_name(v_object), UNPROVIDED, UNPROVIDED);
                                    } else {
                                        html_princ(format_nil.format_nil_a(v_object));
                                    }






        } else {
            princ(v_object, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject html_princ_strong_alt(SubLObject v_object) {
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(v_object);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_princ_strong(final SubLObject v_object) {
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(v_object);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_princ_possibly_strong_alt(SubLObject v_object, SubLObject strongP) {
        if (NIL != strongP) {
            html_princ_strong(v_object);
        } else {
            html_princ(v_object);
        }
        return NIL;
    }

    public static SubLObject html_princ_possibly_strong(final SubLObject v_object, final SubLObject strongP) {
        if (NIL != strongP) {
            html_princ_strong(v_object);
        } else {
            html_princ(v_object);
        }
        return NIL;
    }

    public static final SubLObject html_princ_non_breaking_alt(SubLObject v_object) {
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_princ(v_object);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_princ_non_breaking(final SubLObject v_object) {
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_princ(v_object);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * prin1 <object> to *html-stream*.  If *html-safe-print* is non-NIL, substitute HTML escape sequences for HTML reserved characters.  Otherwise, just call prin1.
     */
    @LispMethod(comment = "prin1 <object> to *html-stream*.  If *html-safe-print* is non-NIL, substitute HTML escape sequences for HTML reserved characters.  Otherwise, just call prin1.")
    public static final SubLObject html_prin1_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) {
                if (v_object.isString()) {
                    html_char(CHAR_quotation, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_escapes_map$.currentBinding(thread);
                        try {
                            html_macros.$html_escapes_map$.bind(html_macros.$html_prin1_string_escapes_map$.getGlobalValue(), thread);
                            html_princ(v_object);
                        } finally {
                            html_macros.$html_escapes_map$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_char(CHAR_quotation, UNPROVIDED);
                } else {
                    if (v_object.isKeyword()) {
                        html_char(CHAR_colon, UNPROVIDED);
                        html_princ(v_object);
                    } else {
                        if (v_object.isNumber()) {
                            prin1(v_object, html_macros.$html_stream$.getDynamicValue(thread));
                        } else {
                            html_princ(format(NIL, $str_alt6$_S, v_object));
                        }
                    }
                }
            } else {
                prin1(v_object, html_macros.$html_stream$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    /**
     * prin1 <object> to *html-stream*.  If *html-safe-print* is non-NIL, substitute HTML escape sequences for HTML reserved characters.  Otherwise, just call prin1.
     */
    @LispMethod(comment = "prin1 <object> to *html-stream*.  If *html-safe-print* is non-NIL, substitute HTML escape sequences for HTML reserved characters.  Otherwise, just call prin1.")
    public static SubLObject html_prin1(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) {
            if (v_object.isString()) {
                html_char(CHAR_quotation, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_escapes_map$.currentBinding(thread);
                try {
                    html_macros.$html_escapes_map$.bind(html_macros.$html_prin1_string_escapes_map$.getGlobalValue(), thread);
                    html_princ(v_object);
                } finally {
                    html_macros.$html_escapes_map$.rebind(_prev_bind_0, thread);
                }
                html_char(CHAR_quotation, UNPROVIDED);
            } else
                if (v_object.isKeyword()) {
                    html_char(CHAR_colon, UNPROVIDED);
                    html_princ(v_object);
                } else
                    if (v_object.isNumber()) {
                        prin1(v_object, html_macros.$html_stream$.getDynamicValue(thread));
                    } else {
                        html_princ(format_nil.format_nil_s(v_object));
                    }


        } else {
            prin1(v_object, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return NIL;
    }

    /**
     * Like html-princ on STRING, except preserve the formatting of newlines and spaces.
     */
    @LispMethod(comment = "Like html-princ on STRING, except preserve the formatting of newlines and spaces.")
    public static final SubLObject html_princ_formatted_string_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        if (!((NIL != find(CHAR_newline, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find(CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
            html_princ(string);
        } else {
            {
                SubLObject string_var = string;
                SubLObject end_var = length(string_var);
                SubLObject end_var_4 = end_var;
                SubLObject char_num = NIL;
                for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_4); char_num = number_utilities.f_1X(char_num)) {
                    {
                        SubLObject character = Strings.sublisp_char(string_var, char_num);
                        SubLObject pcase_var = character;
                        if (pcase_var.eql(CHAR_newline)) {
                            html_newline(UNPROVIDED);
                        } else {
                            if (pcase_var.eql(CHAR_space)) {
                                html_glyph($NBSP, UNPROVIDED);
                            } else {
                                html_char(character, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Like html-princ on STRING, except preserve the formatting of newlines and spaces.
     */
    @LispMethod(comment = "Like html-princ on STRING, except preserve the formatting of newlines and spaces.")
    public static SubLObject html_princ_formatted_string(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if ((NIL == find(CHAR_newline, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find(CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            html_princ(string);
        } else {
            SubLObject end_var_$5;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject pcase_var;
            SubLObject character;
            for (end_var = end_var_$5 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$5); char_num = number_utilities.f_1X(char_num)) {
                character = pcase_var = Strings.sublisp_char(string, char_num);
                if (pcase_var.eql(CHAR_newline)) {
                    html_newline(UNPROVIDED);
                } else
                    if (pcase_var.eql(CHAR_space)) {
                        html_glyph($NBSP, UNPROVIDED);
                    } else {
                        html_char(character, UNPROVIDED);
                    }

            }
        }
        return NIL;
    }

    /**
     * call terpri <n> times on *html-stream*
     */
    @LispMethod(comment = "call terpri <n> times on *html-stream*")
    public static final SubLObject html_terpri_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                    terpri(html_macros.$html_stream$.getDynamicValue(thread));
                }
            }
            return NIL;
        }
    }

    /**
     * call terpri <n> times on *html-stream*
     */
    @LispMethod(comment = "call terpri <n> times on *html-stream*")
    public static SubLObject html_terpri(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            terpri(html_macros.$html_stream$.getDynamicValue(thread));
        }
        return NIL;
    }

    /**
     * Pragma indicating that outputting N terpris here improves HTML readability.
     */
    @LispMethod(comment = "Pragma indicating that outputting N terpris here improves HTML readability.")
    public static final SubLObject html_source_readability_terpri_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == html_macros.$within_html_pre$.getDynamicValue(thread)) {
                html_terpri(n);
            }
            return NIL;
        }
    }

    /**
     * Pragma indicating that outputting N terpris here improves HTML readability.
     */
    @LispMethod(comment = "Pragma indicating that outputting N terpris here improves HTML readability.")
    public static SubLObject html_source_readability_terpri(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == html_macros.$within_html_pre$.getDynamicValue(thread)) && (NIL == html_macros.$suppress_html_source_readability_terpriP$.getDynamicValue(thread))) {
            html_terpri(n);
        }
        return NIL;
    }

    /**
     * output <n> tabs to *html-stream*
     */
    @LispMethod(comment = "output <n> tabs to *html-stream*")
    public static final SubLObject html_tab_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        return html_char(CHAR_tab, n);
    }

    /**
     * output <n> tabs to *html-stream*
     */
    @LispMethod(comment = "output <n> tabs to *html-stream*")
    public static SubLObject html_tab(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        return html_char(CHAR_tab, n);
    }

    public static final SubLObject html_spaces_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        html_indent(n);
        return NIL;
    }

    public static SubLObject html_spaces(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        html_indent(n);
        return NIL;
    }

    /**
     * output <n> spaces to *html-stream*
     */
    @LispMethod(comment = "output <n> spaces to *html-stream*")
    public static final SubLObject html_indent_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (n.numG(ZERO_INTEGER)) {
                if (NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
                    return html_char(CHAR_space, n);
                }
                {
                    SubLObject cdotimes_end_var = subtract(n, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        html_glyph($NBSP, TWO_INTEGER);
                    }
                }
                html_char(CHAR_space, UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * output <n> spaces to *html-stream*
     */
    @LispMethod(comment = "output <n> spaces to *html-stream*")
    public static SubLObject html_indent(SubLObject n) {
        if (n == UNPROVIDED) {
            n = $float$0_5;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (n.numG(ZERO_INTEGER)) {
            if (NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
                return html_char(CHAR_space, n);
            }
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = subtract(multiply(TWO_INTEGER, n), ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                html_glyph($NBSP, UNPROVIDED);
            }
            html_char(CHAR_space, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * princ <thing> to *html-stream* without substituting HTML escape sequences for HTML reserved characters.  Intended for outputing HTML directives.
     */
    @LispMethod(comment = "princ <thing> to *html-stream* without substituting HTML escape sequences for HTML reserved characters.  Intended for outputing HTML directives.")
    public static final SubLObject html_markup_alt(SubLObject thing) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (thing.isString()) {
                write_string(thing, html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            } else {
                princ(thing, html_macros.$html_stream$.getDynamicValue(thread));
            }
            return thing;
        }
    }

    /**
     * princ <thing> to *html-stream* without substituting HTML escape sequences for HTML reserved characters.  Intended for outputing HTML directives.
     */
    @LispMethod(comment = "princ <thing> to *html-stream* without substituting HTML escape sequences for HTML reserved characters.  Intended for outputing HTML directives.")
    public static SubLObject html_markup(final SubLObject thing) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (thing.isString()) {
            write_string(thing, html_macros.$html_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        } else {
            princ(thing, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return thing;
    }

    /**
     * PRINC STRING (wrapped with quotes) with links for any embedded constant references or urls.
     */
    @LispMethod(comment = "PRINC STRING (wrapped with quotes) with links for any embedded constant references or urls.")
    public static final SubLObject html_print_doc_string_alt(SubLObject string) {
        html_princ(CHAR_quotation);
        html_princ_doc_string(string, UNPROVIDED);
        html_princ(CHAR_quotation);
        return string;
    }

    /**
     * PRINC STRING (wrapped with quotes) with links for any embedded constant references or urls.
     */
    @LispMethod(comment = "PRINC STRING (wrapped with quotes) with links for any embedded constant references or urls.")
    public static SubLObject html_print_doc_string(final SubLObject string) {
        html_princ(CHAR_quotation);
        html_princ_doc_string(string, UNPROVIDED);
        html_princ(CHAR_quotation);
        return string;
    }

    /**
     * PRINC STRING with links for any embedded constant references or embedded urls.
     *
     * @unknown belasco
     */
    @LispMethod(comment = "PRINC STRING with links for any embedded constant references or embedded urls.\r\n\r\n@unknown belasco")
    public static final SubLObject html_princ_doc_string_alt(SubLObject string, SubLObject link_function) {
        if (link_function == UNPROVIDED) {
            link_function = CB_FORM;
        }
        return html_princ_cycl_string(string, link_function, NIL);
    }

    /**
     * PRINC STRING with links for any embedded constant references or embedded urls.
     *
     * @unknown belasco
     */
    @LispMethod(comment = "PRINC STRING with links for any embedded constant references or embedded urls.\r\n\r\n@unknown belasco")
    public static SubLObject html_princ_doc_string(final SubLObject string, SubLObject link_function) {
        if (link_function == UNPROVIDED) {
            link_function = CB_FORM;
        }
        return html_princ_cycl_string(string, link_function, NIL);
    }

    public static SubLObject hide_non_ascii_chars(final SubLObject unicode_string) {
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject vector_var = unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(unicode_string, UNPROVIDED));
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject code;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                code = aref(vector_var, element_num);
                if (code.numL($int$128)) {
                    princ(code_char(code), stream);
                } else {
                    format(stream, $str14$__A_, code);
                }
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

    public static SubLObject html_princ_string_with_hidden_non_ascii_chars(final SubLObject str) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject next_start_idx;
        for (SubLObject last_pipe = next_start_idx = ZERO_INTEGER, next_pipe = position(CHAR_vertical, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != next_pipe; next_pipe = position(CHAR_vertical, str, symbol_function(EQL), symbol_function(IDENTITY), next_start_idx, UNPROVIDED)) {
            html_markup(string_utilities.substring(str, next_start_idx, next_pipe));
            last_pipe = next_start_idx = next_pipe;
            next_pipe = position(CHAR_vertical, str, symbol_function(EQL), symbol_function(IDENTITY), number_utilities.f_1X(last_pipe), UNPROVIDED);
            final SubLObject code = read_from_string_ignoring_errors(str, NIL, $EOF, number_utilities.f_1X(last_pipe), next_pipe);
            if (NIL != subl_promotions.positive_integer_p(code)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str16$__x_x_, code);
                last_pipe = next_pipe;
                next_start_idx = number_utilities.f_1X(last_pipe);
            }
        }
        if (NIL != list_utilities.lengthG(str, next_start_idx, UNPROVIDED)) {
            html_markup(string_utilities.substring(str, next_start_idx, UNPROVIDED));
        }
        return str;
    }

    /**
     * princ STRING which is assumed to be a string possibly containing some CycL.
     * For example, it might be a documentation string or a string meant to be parsed into a CycL sentence.
     *
     * @param REQUIRE-EXACT?;
     * 		if NIL, suffixes like -s and -es are allowed and
     * 		the constant name is still considered valid.
     * @unknown - Tests for this are in test-case-table for HTML-CYCL-STRING.
     */
    @LispMethod(comment = "princ STRING which is assumed to be a string possibly containing some CycL.\r\nFor example, it might be a documentation string or a string meant to be parsed into a CycL sentence.\r\n\r\n@param REQUIRE-EXACT?;\r\n\t\tif NIL, suffixes like -s and -es are allowed and\r\n\t\tthe constant name is still considered valid.\r\n@unknown - Tests for this are in test-case-table for HTML-CYCL-STRING.\nprinc STRING which is assumed to be a string possibly containing some CycL.\nFor example, it might be a documentation string or a string meant to be parsed into a CycL sentence.")
    public static final SubLObject html_princ_cycl_string_alt(SubLObject string, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == UNPROVIDED) {
            link_function = CB_FORM;
        }
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        {
            SubLObject length = length(string);
            SubLObject last_idx = ZERO_INTEGER;
            SubLObject next_char_idx = NIL;
            SubLObject inside_cycl_tagP = NIL;
            SubLObject hash_idx = NIL;
            SubLObject colon_idx = NIL;
            SubLObject lt_idx = NIL;
            SubLObject variable_idx = NIL;
            SubLObject url_idx = NIL;
            SubLObject url_end_idx = NIL;
            for (hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED), colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED), lt_idx = position(CHAR_less, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED), variable_idx = position_if($sym10$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), last_idx, UNPROVIDED), url_idx = ZERO_INTEGER, url_end_idx = ZERO_INTEGER; !((((NIL == colon_idx) && (NIL == hash_idx)) && (NIL == lt_idx)) && (NIL == variable_idx)); hash_idx = hash_idx , colon_idx = colon_idx , lt_idx = lt_idx , variable_idx = variable_idx , url_idx = url_idx , url_end_idx = url_end_idx) {
                next_char_idx = apply(symbol_function(MIN), remove_if(symbol_function(NULL), list(hash_idx, colon_idx, lt_idx, variable_idx), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (colon_idx == next_char_idx) {
                    url_idx = web_utilities.find_url_beginning(string, length, colon_idx);
                    if (NIL != url_idx) {
                        url_end_idx = web_utilities.find_url_end(string, length, url_idx);
                    }
                    if ((NIL != url_idx) && (NIL != url_end_idx)) {
                        html_string(string, last_idx, url_idx);
                        print_url_with_tag(subseq(string, url_idx, url_end_idx));
                        last_idx = url_end_idx;
                    } else {
                        html_string(string, last_idx, add(ONE_INTEGER, colon_idx));
                        last_idx = add(ONE_INTEGER, colon_idx);
                    }
                    colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
                    hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
                    variable_idx = position_if($sym10$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), last_idx, UNPROVIDED);
                } else {
                    if (hash_idx == next_char_idx) {
                        html_string(string, last_idx, hash_idx);
                        {
                            SubLObject dollar_idx = add(hash_idx, ONE_INTEGER);
                            if (dollar_idx.numE(length) || (Strings.sublisp_char(string, dollar_idx) != constant_reader.constant_reader_macro_char())) {
                                html_princ(CHAR_hash);
                                last_idx = dollar_idx;
                            } else {
                                last_idx = print_embedded_constant(string, length, dollar_idx, link_function, require_exactP);
                            }
                            hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
                            colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
                            variable_idx = position_if($sym10$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), last_idx, UNPROVIDED);
                        }
                    } else {
                        if (variable_idx == next_char_idx) {
                            html_string(string, last_idx, variable_idx);
                            last_idx = variable_idx;
                            {
                                SubLObject non_variable_idx = list_utilities.position_if_not($sym10$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), variable_idx, UNPROVIDED);
                                if ((NIL != inside_cycl_tagP) && (NIL != non_variable_idx)) {
                                    if (non_variable_idx.numG(variable_idx) && (NIL == alpha_char_p(Strings.sublisp_char(string, non_variable_idx)))) {
                                        {
                                            SubLObject variable_name = subseq(string, variable_idx, non_variable_idx);
                                            if (NIL != cycl_variables.valid_el_var_nameP(variable_name)) {
                                                html_princ(variable_name);
                                            } else {
                                                if (NIL != string_utilities.integer_string_p(variable_name)) {
                                                    html_princ(variable_name);
                                                } else {
                                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                    html_princ(variable_name);
                                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                }
                                            }
                                        }
                                        last_idx = non_variable_idx;
                                    }
                                }
                                if (NIL != non_variable_idx) {
                                    variable_idx = position_if($sym10$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), non_variable_idx, UNPROVIDED);
                                } else {
                                    variable_idx = NIL;
                                }
                            }
                        } else {
                            if (lt_idx == next_char_idx) {
                                html_string(string, last_idx, lt_idx);
                                last_idx = lt_idx;
                                {
                                    SubLObject gt_idx = position(CHAR_greater, string, symbol_function(EQL), symbol_function(IDENTITY), lt_idx, UNPROVIDED);
                                    if (NIL != gt_idx) {
                                        {
                                            SubLObject tag_start_idx = (NIL != charE(CHAR_slash, Strings.sublisp_char(string, add(lt_idx, ONE_INTEGER)))) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                                            SubLObject tag = subseq(string, add(lt_idx, tag_start_idx), gt_idx);
                                            if (NIL != memberP(Strings.string_downcase(string_utilities.trim_whitespace(tag), UNPROVIDED, UNPROVIDED), $cycl_string_allowable_html_tags$.getGlobalValue(), symbol_function($sym13$STRING_), UNPROVIDED)) {
                                                if (NIL != Strings.stringE(tag, $$$sub, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                    tag = $$$small;
                                                }
                                                html_markup($str_alt16$_);
                                                if (TWO_INTEGER == tag_start_idx) {
                                                    html_princ($str_alt17$_);
                                                }
                                                html_markup(tag);
                                                html_markup($str_alt18$_);
                                                if ((NIL != Strings.stringE(tag, $$$code, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.stringE(tag, $$$pre, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                    if (TWO_INTEGER == tag_start_idx) {
                                                        inside_cycl_tagP = NIL;
                                                    } else {
                                                        inside_cycl_tagP = T;
                                                    }
                                                }
                                                last_idx = add(gt_idx, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                                lt_idx = position(CHAR_less, string, symbol_function(EQL), symbol_function(IDENTITY), add(lt_idx, ONE_INTEGER), UNPROVIDED);
                            }
                        }
                    }
                }
            }
            html_string(string, last_idx, NIL);
        }
        return string;
    }

    /**
     * princ STRING which is assumed to be a string possibly containing some CycL.
     * For example, it might be a documentation string or a string meant to be parsed into a CycL sentence.
     *
     * @param REQUIRE-EXACT?;
     * 		if NIL, suffixes like -s and -es are allowed and
     * 		the constant name is still considered valid.
     * @unknown - Tests for this are in test-case-table for HTML-CYCL-STRING.
     */
    @LispMethod(comment = "princ STRING which is assumed to be a string possibly containing some CycL.\r\nFor example, it might be a documentation string or a string meant to be parsed into a CycL sentence.\r\n\r\n@param REQUIRE-EXACT?;\r\n\t\tif NIL, suffixes like -s and -es are allowed and\r\n\t\tthe constant name is still considered valid.\r\n@unknown - Tests for this are in test-case-table for HTML-CYCL-STRING.\nprinc STRING which is assumed to be a string possibly containing some CycL.\nFor example, it might be a documentation string or a string meant to be parsed into a CycL sentence.")
    public static SubLObject html_princ_cycl_string(final SubLObject string, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == UNPROVIDED) {
            link_function = CB_FORM;
        }
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != unicode_nauts.unicode_naut_p(string, UNPROVIDED)) {
            SubLObject html = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    html_princ_cycl_string(hide_non_ascii_chars(string), link_function, require_exactP);
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                html = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            return html_princ_string_with_hidden_non_ascii_chars(html);
        }
        if ((NIL != html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread)) && (NIL != list_utilities.lengthG(string, html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread), UNPROVIDED))) {
            final SubLObject prefix = string_utilities.substring(string, ZERO_INTEGER, html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread));
            final SubLObject truncated_string = cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[]{ $str17$______i__, format_nil.format_nil_a_no_copy(length(string)), $str18$_characters_total___i_ });
            final SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding(thread);
            try {
                html_cycl_string_printer.$html_large_string_limit$.bind(NIL, thread);
                html_princ_cycl_string(truncated_string, link_function, require_exactP);
            } finally {
                html_cycl_string_printer.$html_large_string_limit$.rebind(_prev_bind_0, thread);
            }
            return truncated_string;
        }
        return NIL != $use_new_html_princ_cycl_stringP$.getDynamicValue(thread) ? html_princ_cycl_string_new(string, link_function, require_exactP) : html_princ_cycl_string_old(string, link_function, require_exactP);
    }

    public static SubLObject html_princ_cycl_string_new(final SubLObject string, final SubLObject link_function, final SubLObject require_exactP) {
        final SubLObject printer = html_cycl_string_printer.new_html_cycl_string_printer(string, link_function, require_exactP);
        while (NIL == html_cycl_string_printer.html_cycl_string_printer_done_p(printer)) {
            html_cycl_string_printer.html_cycl_string_printer_print_next(printer);
        } 
        return NIL;
    }

    public static SubLObject html_princ_cycl_string_old(final SubLObject string, final SubLObject link_function, final SubLObject require_exactP) {
        final SubLObject length = length(string);
        SubLObject last_idx = ZERO_INTEGER;
        SubLObject next_char_idx = NIL;
        SubLObject inside_cycl_tagP = NIL;
        SubLObject hash_idx = NIL;
        SubLObject colon_idx = NIL;
        SubLObject lt_idx = NIL;
        SubLObject variable_idx = NIL;
        SubLObject url_idx = NIL;
        SubLObject url_end_idx = NIL;
        hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
        colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
        lt_idx = position(CHAR_less, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
        variable_idx = html_cycl_string_printer.html_cycl_string_variable_index(string, last_idx);
        url_idx = ZERO_INTEGER;
        url_end_idx = ZERO_INTEGER;
        while ((((NIL != colon_idx) || (NIL != hash_idx)) || (NIL != lt_idx)) || (NIL != variable_idx)) {
            next_char_idx = apply(symbol_function(MIN), remove_if(symbol_function(NULL), list(hash_idx, colon_idx, lt_idx, variable_idx), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (colon_idx.eql(next_char_idx)) {
                url_idx = web_utilities.find_url_beginning(string, length, colon_idx);
                if (NIL != url_idx) {
                    url_end_idx = web_utilities.find_url_end(string, length, url_idx);
                }
                if ((NIL != url_idx) && (NIL != url_end_idx)) {
                    html_string(string, last_idx, url_idx);
                    html_cycl_string_printer.print_url_with_tag(subseq(string, url_idx, url_end_idx));
                    last_idx = url_end_idx;
                } else {
                    html_string(string, last_idx, add(ONE_INTEGER, colon_idx));
                    last_idx = add(ONE_INTEGER, colon_idx);
                }
                colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
                hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
                variable_idx = position_if($sym21$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), last_idx, UNPROVIDED);
            } else
                if (hash_idx.eql(next_char_idx)) {
                    html_string(string, last_idx, hash_idx);
                    final SubLObject dollar_idx = add(hash_idx, ONE_INTEGER);
                    if (dollar_idx.numE(length) || (!Strings.sublisp_char(string, dollar_idx).eql(constant_reader.constant_reader_macro_char()))) {
                        html_princ(CHAR_hash);
                        last_idx = dollar_idx;
                    } else {
                        last_idx = html_cycl_string_printer.print_embedded_constant(string, length, dollar_idx, link_function, require_exactP);
                    }
                    hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
                    colon_idx = position(CHAR_colon, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED);
                    variable_idx = position_if($sym21$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), last_idx, UNPROVIDED);
                } else
                    if (variable_idx.eql(next_char_idx)) {
                        html_string(string, last_idx, variable_idx);
                        last_idx = variable_idx;
                        final SubLObject non_variable_idx = list_utilities.position_if_not($sym21$EL_VARIABLE_CHAR_, string, symbol_function(IDENTITY), variable_idx, UNPROVIDED);
                        if ((((NIL != inside_cycl_tagP) && (NIL != non_variable_idx)) && non_variable_idx.numG(variable_idx)) && (NIL == alpha_char_p(Strings.sublisp_char(string, non_variable_idx)))) {
                            final SubLObject variable_name = subseq(string, variable_idx, non_variable_idx);
                            if (NIL != cycl_variables.valid_el_var_nameP(variable_name)) {
                                html_princ(variable_name);
                            } else
                                if (NIL != string_utilities.integer_string_p(variable_name)) {
                                    html_princ(variable_name);
                                } else {
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ(variable_name);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }

                            last_idx = non_variable_idx;
                        }
                        if (NIL != non_variable_idx) {
                            variable_idx = html_cycl_string_printer.html_cycl_string_variable_index(string, non_variable_idx);
                        } else {
                            variable_idx = NIL;
                        }
                    } else
                        if (lt_idx.eql(next_char_idx)) {
                            html_string(string, last_idx, lt_idx);
                            last_idx = lt_idx;
                            final SubLObject gt_idx = position(CHAR_greater, string, symbol_function(EQL), symbol_function(IDENTITY), lt_idx, UNPROVIDED);
                            if (NIL != gt_idx) {
                                final SubLObject tag_start_idx = (NIL != charE(CHAR_slash, Strings.sublisp_char(string, add(lt_idx, ONE_INTEGER)))) ? TWO_INTEGER : ONE_INTEGER;
                                final SubLObject tag = subseq(string, add(lt_idx, tag_start_idx), gt_idx);
                                if (NIL != subl_promotions.memberP(Strings.string_downcase(string_utilities.trim_whitespace(tag), UNPROVIDED, UNPROVIDED), html_cycl_string_printer.$cycl_string_allowable_html_tags$.getGlobalValue(), symbol_function($sym22$STRING_), UNPROVIDED)) {
                                    html_markup($str23$_);
                                    if (TWO_INTEGER.eql(tag_start_idx)) {
                                        html_princ($str24$_);
                                    }
                                    html_markup(tag);
                                    html_markup($str25$_);
                                    if ((NIL != Strings.string_equal(tag, $$$code, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.string_equal(tag, $$$pre, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                        if (TWO_INTEGER.eql(tag_start_idx)) {
                                            inside_cycl_tagP = NIL;
                                        } else {
                                            inside_cycl_tagP = T;
                                        }
                                    }
                                    last_idx = add(gt_idx, ONE_INTEGER);
                                }
                            }
                            lt_idx = position(CHAR_less, string, symbol_function(EQL), symbol_function(IDENTITY), add(lt_idx, ONE_INTEGER), UNPROVIDED);
                        }



            // hash_idx = hash_idx;
            // colon_idx = colon_idx;
            // lt_idx = lt_idx;
            // variable_idx = variable_idx;
            // url_idx = url_idx;
            // url_end_idx = url_end_idx;
        } 
        html_string(string, last_idx, NIL);
        return string;
    }

    public static final SubLObject html_cycl_string_alt(SubLObject string, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == UNPROVIDED) {
            link_function = HTML_LINK_TO_OWL_URI;
        }
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject html_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_princ_cycl_string(string, link_function, require_exactP);
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_string = get_output_stream_string(stream);
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
                return html_string;
            }
        }
    }

    public static SubLObject html_cycl_string(final SubLObject string, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == UNPROVIDED) {
            link_function = HTML_LINK_TO_OWL_URI;
        }
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject html_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_princ_cycl_string(string, link_function, require_exactP);
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            html_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return html_string;
    }

    public static final SubLObject opencyc_html_cycl_string_alt(SubLObject string) {
        return html_cycl_string(string, HTML_LINK_TO_OWL_OPENCYC_URI, UNPROVIDED);
    }

    public static SubLObject opencyc_html_cycl_string(final SubLObject string) {
        return html_cycl_string(string, HTML_LINK_TO_OWL_OPENCYC_URI, UNPROVIDED);
    }

    /**
     * Helper function to help "auto-cyclify" comment text inside a <cycl></cycl> block in comments if we support it by adding the support to html-princ-cycl-string.
     */
    @LispMethod(comment = "Helper function to help \"auto-cyclify\" comment text inside a <cycl></cycl> block in comments if we support it by adding the support to html-princ-cycl-string.")
    public static final SubLObject cb_form_for_cycl_string_alt(SubLObject cycl_string, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        {
            SubLObject cycl_list = read_from_string_ignoring_errors(cycl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != Strings.stringE(format(NIL, $str_alt32$_A, cycl_list), cycl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                cb_form(cycl_list, depth, wrap_axiomsP);
            } else {
                cb_form(cycl_string, depth, wrap_axiomsP);
            }
        }
        return NIL;
    }

    /**
     * Helper function to help "auto-cyclify" comment text inside a <cycl></cycl> block in comments if we support it by adding the support to html-princ-cycl-string.
     */
    @LispMethod(comment = "Helper function to help \"auto-cyclify\" comment text inside a <cycl></cycl> block in comments if we support it by adding the support to html-princ-cycl-string.")
    public static SubLObject cb_form_for_cycl_string(final SubLObject v_cycl_string, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        final SubLObject cycl_list = read_from_string_ignoring_errors(v_cycl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != Strings.stringE(format_nil.format_nil_a(cycl_list), v_cycl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            cb_form(cycl_list, depth, wrap_axiomsP);
        } else {
            cb_form(v_cycl_string, depth, wrap_axiomsP);
        }
        return NIL;
    }

    public static final SubLObject html_stale_constant_reference_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $html_stale_constant_reference_color$.getDynamicValue(thread)) {
                {
                    SubLObject color_val = $html_stale_constant_reference_color$.getDynamicValue(thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != color_val) {
                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color_val));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_string(string, start, end);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
            } else {
                html_string(string, start, end);
            }
            return NIL;
        }
    }

    public static SubLObject html_stale_constant_reference(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $html_stale_constant_reference_color$.getDynamicValue(thread)) {
            final SubLObject color_val = $html_stale_constant_reference_color$.getDynamicValue(thread);
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
                html_string(string, start, end);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        } else {
            html_string(string, start, end);
        }
        return NIL;
    }

    /**
     *
     *
     * @param REQUIRE-EXACT?;
     * 		if NIL, suffixes like -s and -es are allowed and
     * 		the constant name is still considered valid.
     */
    @LispMethod(comment = "@param REQUIRE-EXACT?;\r\n\t\tif NIL, suffixes like -s and -es are allowed and\r\n\t\tthe constant name is still considered valid.")
    public static final SubLObject html_show_string_with_invalid_constants_highlighted_alt(SubLObject string, SubLObject require_exactP) {
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $html_stale_constant_reference_color$.currentBinding(thread);
                try {
                    $html_stale_constant_reference_color$.bind($RED, thread);
                    html_princ_cycl_string(string, CB_FORM, require_exactP);
                } finally {
                    $html_stale_constant_reference_color$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param REQUIRE-EXACT?;
     * 		if NIL, suffixes like -s and -es are allowed and
     * 		the constant name is still considered valid.
     */
    @LispMethod(comment = "@param REQUIRE-EXACT?;\r\n\t\tif NIL, suffixes like -s and -es are allowed and\r\n\t\tthe constant name is still considered valid.")
    public static SubLObject html_show_string_with_invalid_constants_highlighted(final SubLObject string, SubLObject require_exactP) {
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $html_stale_constant_reference_color$.currentBinding(thread);
        try {
            $html_stale_constant_reference_color$.bind($RED, thread);
            html_princ_cycl_string(string, CB_FORM, require_exactP);
        } finally {
            $html_stale_constant_reference_color$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Output OBJECT to the HTML stream, performing the same character encoding that form text inputs perform.
     */
    @LispMethod(comment = "Output OBJECT to the HTML stream, performing the same character encoding that form text inputs perform.")
    public static final SubLObject html_url_princ_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_object.isString()) {
                {
                    SubLObject cdotimes_end_var = length(v_object);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        html_url_princ_char(Strings.sublisp_char(v_object, i));
                    }
                }
            } else {
                if (v_object.isSymbol()) {
                    html_url_princ(symbol_name(v_object));
                } else {
                    if (v_object.isInteger()) {
                        html_markup(v_object);
                    } else {
                        if (NIL != nart_handles.nart_p(v_object)) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt32$_A, v_object);
                        } else {
                            if (NIL != constant_p(v_object)) {
                                html_url_princ(constants_high.constant_name(v_object));
                            } else {
                                if (v_object.isChar()) {
                                    html_url_princ_char(v_object);
                                } else {
                                    if (v_object.isCons()) {
                                        html_url_princ($str_alt52$_);
                                        {
                                            SubLObject rest = NIL;
                                            SubLObject item = NIL;
                                            for (rest = v_object, item = rest.first(); rest.rest().isCons(); rest = rest.rest() , item = rest.first()) {
                                                if (rest != v_object) {
                                                    html_url_princ($str_alt53$_);
                                                }
                                                html_url_princ(item);
                                            }
                                            if (rest != v_object) {
                                                html_url_princ($str_alt53$_);
                                            }
                                            html_url_princ(rest.first());
                                            if (NIL != rest.rest()) {
                                                html_url_princ($str_alt54$___);
                                                html_url_princ(rest.rest());
                                            }
                                            html_url_princ($str_alt55$_);
                                        }
                                    } else {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt32$_A, v_object);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_object;
        }
    }

    /**
     * Output OBJECT to the HTML stream, performing the same character encoding that form text inputs perform.
     */
    @LispMethod(comment = "Output OBJECT to the HTML stream, performing the same character encoding that form text inputs perform.")
    public static SubLObject html_url_princ(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isString()) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = length(v_object), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                html_url_princ_char(Strings.sublisp_char(v_object, i));
            }
        } else
            if (v_object.isSymbol()) {
                html_url_princ(symbol_name(v_object));
            } else
                if (v_object.isInteger()) {
                    html_markup(v_object);
                } else
                    if (NIL != nart_handles.nart_p(v_object)) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str39$_A, v_object);
                    } else
                        if (NIL != constant_p(v_object)) {
                            html_url_princ(constants_high.constant_name(v_object));
                        } else
                            if (v_object.isChar()) {
                                html_url_princ_char(v_object);
                            } else
                                if (v_object.isCons()) {
                                    html_url_princ($str40$_);
                                    SubLObject rest = NIL;
                                    SubLObject item = NIL;
                                    rest = v_object;
                                    item = rest.first();
                                    while (rest.rest().isCons()) {
                                        if (!rest.eql(v_object)) {
                                            html_url_princ($$$_);
                                        }
                                        html_url_princ(item);
                                        rest = rest.rest();
                                        item = rest.first();
                                    } 
                                    if (!rest.eql(v_object)) {
                                        html_url_princ($$$_);
                                    }
                                    html_url_princ(rest.first());
                                    if (NIL != rest.rest()) {
                                        html_url_princ($str42$___);
                                        html_url_princ(rest.rest());
                                    }
                                    html_url_princ($str43$_);
                                } else {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str39$_A, v_object);
                                }






        return v_object;
    }

    public static final SubLObject html_url_princ_char_alt(SubLObject v_char) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != alpha_char_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED))) || (NIL != find(v_char, $str_alt56$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                html_char(v_char, UNPROVIDED);
            } else {
                if (v_char.eql(CHAR_space) && (NIL != $html_url_princ_escape_spaces$.getDynamicValue(thread))) {
                    html_char(CHAR_plus, UNPROVIDED);
                } else {
                    {
                        SubLObject code = char_code(v_char);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt57$__C_C, string_utilities.hex_char(integerDivide(code, SIXTEEN_INTEGER)), string_utilities.hex_char(mod(code, SIXTEEN_INTEGER)));
                    }
                }
            }
            return v_char;
        }
    }

    public static SubLObject html_url_princ_char(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != alpha_char_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED))) || (NIL != find(v_char, $str44$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            html_char(v_char, UNPROVIDED);
        } else
            if (v_char.eql(CHAR_space) && (NIL != $html_url_princ_escape_spaces$.getDynamicValue(thread))) {
                html_char(CHAR_plus, UNPROVIDED);
            } else {
                final SubLObject code = char_code(v_char);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str45$__C_C, string_utilities.hex_char(integerDivide(code, SIXTEEN_INTEGER)), string_utilities.hex_char(mod(code, SIXTEEN_INTEGER)));
            }

        return v_char;
    }

    /**
     * output ATTRIBUTE as an html tag attribute, with ATTRIBUTE as the value as well (in accord with XHTML standards)
     */
    @LispMethod(comment = "output ATTRIBUTE as an html tag attribute, with ATTRIBUTE as the value as well (in accord with XHTML standards)")
    public static final SubLObject html_simple_attribute_alt(SubLObject attribute) {
        html_markup(cconcatenate(format_nil.format_nil_a_no_copy(attribute), new SubLObject[]{ $str_alt58$_, format_nil.format_nil_s_no_copy(attribute) }));
        return NIL;
    }

    /**
     * output ATTRIBUTE as an html tag attribute, with ATTRIBUTE as the value as well (in accord with XHTML standards)
     */
    @LispMethod(comment = "output ATTRIBUTE as an html tag attribute, with ATTRIBUTE as the value as well (in accord with XHTML standards)")
    public static SubLObject html_simple_attribute(final SubLObject attribute) {
        html_markup(cconcatenate(format_nil.format_nil_a_no_copy(attribute), new SubLObject[]{ $str46$_, format_nil.format_nil_s_no_copy(attribute) }));
        return NIL;
    }

    /**
     * output ATTRIBUTE as an html tag attribute, and VALUE as its value
     */
    @LispMethod(comment = "output ATTRIBUTE as an html tag attribute, and VALUE as its value")
    public static final SubLObject html_simple_quoted_attribute_alt(SubLObject attribute, SubLObject value) {
        html_markup(attribute);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(value);
        html_char(CHAR_quotation, UNPROVIDED);
        return NIL;
    }

    /**
     * output ATTRIBUTE as an html tag attribute, and VALUE as its value
     */
    @LispMethod(comment = "output ATTRIBUTE as an html tag attribute, and VALUE as its value")
    public static SubLObject html_simple_quoted_attribute(final SubLObject attribute, final SubLObject value) {
        html_markup(attribute);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(value);
        html_char(CHAR_quotation, UNPROVIDED);
        return NIL;
    }

    /**
     * convert COLOR into a string suitable for an html color attribute
     */
    @LispMethod(comment = "convert COLOR into a string suitable for an html color attribute")
    public static final SubLObject html_color_alt(SubLObject color) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (color.isString()) {
                return color;
            }
            color = assoc(color, html_macros.$html_color_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
            if (color.isString()) {
                return color;
            } else {
                return $str_alt37$;
            }
        }
    }

    /**
     * convert COLOR into a string suitable for an html color attribute
     */
    @LispMethod(comment = "convert COLOR into a string suitable for an html color attribute")
    public static SubLObject html_color(SubLObject color) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (color.isString()) {
            return color;
        }
        color = assoc(color, html_macros.$html_color_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        if (color.isString()) {
            return color;
        }
        return $str47$;
    }

    public static final SubLObject html_style_background_color_alt(SubLObject color) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_string = html_color(color);
                html_princ($html_style_background$.getDynamicValue(thread));
                html_princ(color_string);
                html_princ($str_alt4$_);
            }
            return NIL;
        }
    }

    public static SubLObject html_style_background_color(final SubLObject color) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color_string = html_color(color);
        html_princ($html_style_background$.getDynamicValue(thread));
        html_princ(color_string);
        html_princ($str8$_);
        return NIL;
    }

    /**
     * convert ALIGN into a string suitable for an html align attribute
     */
    @LispMethod(comment = "convert ALIGN into a string suitable for an html align attribute")
    public static final SubLObject html_align_alt(SubLObject align) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (align.isString()) {
                return align;
            }
            align = assoc(align, $html_align_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
            if (align.isString()) {
                return align;
            } else {
                return $str_alt37$;
            }
        }
    }

    /**
     * convert ALIGN into a string suitable for an html align attribute
     */
    @LispMethod(comment = "convert ALIGN into a string suitable for an html align attribute")
    public static SubLObject html_align(SubLObject align) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (align.isString()) {
            return align;
        }
        align = assoc(align, $html_align_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        if (align.isString()) {
            return align;
        }
        return $str47$;
    }

    public static final SubLObject html_copyright_notice_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_hr(UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$copyright);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    html_copyright_text();
                    html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_span_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject html_copyright_notice() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$copyright);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_copyright_text();
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_copyright_text_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt65$Copyright__copy__1995____A_, numeric_date_utilities.this_year());
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($cycorp_homepage_url$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($cycorp_homepage_text$.getDynamicValue(thread));
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_princ($str_alt66$___All_rights_reserved___);
            html_princ($proprietarity_message$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject html_copyright_text() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str54$Copyright__copy__1995____A_, numeric_date_utilities.this_year());
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($cycorp_homepage_url$.getDynamicValue(thread));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ($cycorp_homepage_text$.getDynamicValue(thread));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_princ($str55$___All_rights_reserved___);
        html_princ($proprietarity_message$.getGlobalValue());
        return NIL;
    }

    /**
     * Output a URL which is a mailto: link to ADDRESS
     */
    @LispMethod(comment = "Output a URL which is a mailto: link to ADDRESS")
    public static final SubLObject html_mailto_url_alt(SubLObject address) {
        SubLTrampolineFile.checkType(address, STRINGP);
        html_markup(html_macros.$html_protocol_mailto$.getGlobalValue());
        html_princ(address);
        return NIL;
    }

    /**
     * Output a URL which is a mailto: link to ADDRESS
     */
    @LispMethod(comment = "Output a URL which is a mailto: link to ADDRESS")
    public static SubLObject html_mailto_url(final SubLObject address) {
        assert NIL != stringp(address) : "! stringp(address) " + ("Types.stringp(address) " + "CommonSymbols.NIL != Types.stringp(address) ") + address;
        html_markup(html_macros.$html_protocol_mailto$.getGlobalValue());
        html_princ(address);
        return NIL;
    }

    /**
     * Output a URL which is a file: link to FILENAME
     */
    @LispMethod(comment = "Output a URL which is a file: link to FILENAME")
    public static final SubLObject html_file_url_alt(SubLObject filename) {
        SubLTrampolineFile.checkType(filename, STRINGP);
        html_markup(html_macros.$html_protocol_file$.getGlobalValue());
        html_princ(filename);
        return NIL;
    }

    /**
     * Output a URL which is a file: link to FILENAME
     */
    @LispMethod(comment = "Output a URL which is a file: link to FILENAME")
    public static SubLObject html_file_url(final SubLObject filename) {
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        html_markup(html_macros.$html_protocol_file$.getGlobalValue());
        html_princ(filename);
        return NIL;
    }

    /**
     * make this page refresh every SECONDS seconds
     */
    @LispMethod(comment = "make this page refresh every SECONDS seconds")
    public static final SubLObject html_refresh(SubLObject seconds) {
        if (seconds.isInteger()) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_meta_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$Refresh);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != seconds) {
                html_markup(html_macros.$html_meta_content$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(seconds);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject html_refresh(final SubLObject seconds, SubLObject url) {
        if (url == UNPROVIDED) {
            url = NIL;
        }
        if (seconds.isInteger()) {
            final SubLObject content = cconcatenate(format_nil.format_nil_d_no_copy(seconds), format_nil.format_nil_a_no_copy(NIL != url ? cconcatenate($str70$_URL_, format_nil.format_nil_a_no_copy(url)) : $str47$));
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_meta_head$.getGlobalValue());
            html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$Refresh);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != content) {
                html_markup(html_macros.$html_meta_content$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(content);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject html_meta_utf_8_content_type_alt() {
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        if (true) {
            html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str_alt82$Content_type);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (true) {
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str_alt83$text_html__charset_UTF_8);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_meta_utf_8_content_type() {
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str72$Content_type);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_meta_content$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str73$text_html__charset_UTF_8);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_meta_expires_alt(SubLObject seconds, SubLObject minutes, SubLObject hours) {
        if (seconds == UNPROVIDED) {
            seconds = ZERO_INTEGER;
        }
        if (minutes == UNPROVIDED) {
            minutes = ZERO_INTEGER;
        }
        if (hours == UNPROVIDED) {
            hours = ZERO_INTEGER;
        }
        {
            SubLObject time = numeric_date_utilities.universal_time_from_now(seconds, minutes, hours);
            SubLObject date_string = web_utilities.http_date_string(time);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_meta_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$Expires);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != date_string) {
                html_markup(html_macros.$html_meta_content$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(date_string);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject html_meta_expires(SubLObject seconds, SubLObject minutes, SubLObject hours) {
        if (seconds == UNPROVIDED) {
            seconds = ZERO_INTEGER;
        }
        if (minutes == UNPROVIDED) {
            minutes = ZERO_INTEGER;
        }
        if (hours == UNPROVIDED) {
            hours = ZERO_INTEGER;
        }
        final SubLObject time = numeric_date_utilities.universal_time_from_now(seconds, minutes, hours);
        final SubLObject date_string = web_utilities.http_date_string(time);
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$Expires);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != date_string) {
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(date_string);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_meta_last_modified_alt(SubLObject time) {
        if (time == UNPROVIDED) {
            time = get_universal_time();
        }
        {
            SubLObject date_string = web_utilities.http_date_string(time);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_meta_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt85$Last_Modified);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != date_string) {
                html_markup(html_macros.$html_meta_content$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(date_string);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject html_meta_last_modified(SubLObject time) {
        if (time == UNPROVIDED) {
            time = get_universal_time();
        }
        final SubLObject date_string = web_utilities.http_date_string(time);
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str75$Last_Modified);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != date_string) {
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(date_string);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_meta_dont_cache_alt() {
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        if (true) {
            html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str_alt86$Cache_Control);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (true) {
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str_alt87$no_cache);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_meta_dont_cache() {
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str76$Cache_Control);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_meta_content$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str77$no_cache);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_webpage_expires_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt88);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_6 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt88);
                        current_6 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt88);
                        if (NIL == member(current_6, $list_alt89, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_6 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt88);
                    }
                    {
                        SubLObject hh_tail = property_list_member($HH, current);
                        SubLObject hh = (NIL != hh_tail) ? ((SubLObject) (cadr(hh_tail))) : ZERO_INTEGER;
                        SubLObject mm_tail = property_list_member($MM, current);
                        SubLObject mm = (NIL != mm_tail) ? ((SubLObject) (cadr(mm_tail))) : ZERO_INTEGER;
                        SubLObject ss_tail = property_list_member($SS, current);
                        SubLObject ss = (NIL != ss_tail) ? ((SubLObject) (cadr(ss_tail))) : ZERO_INTEGER;
                        current = temp;
                        if (NIL == current) {
                            defmacro_obsolete_warning(HTML_WEBPAGE_EXPIRES, $list_alt95);
                            return list(HTML_META_EXPIRES, ss, mm, hh);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt88);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject html_webpage_expires(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list78);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list78);
            if (NIL == member(current_$6, $list79, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list78);
        }
        final SubLObject hh_tail = property_list_member($HH, current);
        final SubLObject hh = (NIL != hh_tail) ? cadr(hh_tail) : ZERO_INTEGER;
        final SubLObject mm_tail = property_list_member($MM, current);
        final SubLObject mm = (NIL != mm_tail) ? cadr(mm_tail) : ZERO_INTEGER;
        final SubLObject ss_tail = property_list_member($SS, current);
        final SubLObject ss = (NIL != ss_tail) ? cadr(ss_tail) : ZERO_INTEGER;
        current = temp;
        if (NIL == current) {
            defmacro_obsolete_warning(HTML_WEBPAGE_EXPIRES, $list85);
            return list(HTML_META_EXPIRES, ss, mm, hh);
        }
        cdestructuring_bind_error(datum, $list78);
        return NIL;
    }

    public static final SubLObject html_webpage_last_modified_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject univ_time = (current.isCons()) ? ((SubLObject) (current.first())) : get_universal_time();
            destructuring_bind_must_listp(current, datum, $list_alt97);
            current = current.rest();
            if (NIL == current) {
                defmacro_obsolete_warning(HTML_WEBPAGE_LAST_MODIFIED, $list_alt99);
                return list(HTML_META_LAST_MODIFIED, univ_time);
            } else {
                cdestructuring_bind_error(datum, $list_alt97);
            }
        }
        return NIL;
    }

    public static SubLObject html_webpage_last_modified(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        final SubLObject univ_time = (current.isCons()) ? current.first() : get_universal_time();
        destructuring_bind_must_listp(current, datum, $list87);
        current = current.rest();
        if (NIL == current) {
            defmacro_obsolete_warning(HTML_WEBPAGE_LAST_MODIFIED, $list89);
            return list(HTML_META_LAST_MODIFIED, univ_time);
        }
        cdestructuring_bind_error(datum, $list87);
        return NIL;
    }

    public static final SubLObject html_dont_cache_webpage_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            if (NIL != datum) {
                cdestructuring_bind_error(datum, NIL);
            }
            defmacro_obsolete_warning(HTML_DONT_CACHE_WEBPAGE, $list_alt102);
            return $list_alt102;
        }
    }

    public static SubLObject html_dont_cache_webpage(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        defmacro_obsolete_warning(HTML_DONT_CACHE_WEBPAGE, $list92);
        return $list92;
    }

    /**
     * Emit a meta statement to prevent robots from following or indexing.
     */
    @LispMethod(comment = "Emit a meta statement to prevent robots from following or indexing.")
    public static final SubLObject html_meta_no_robots_alt() {
        return html_meta_robot_instructions(NIL, NIL);
    }

    /**
     * Emit a meta statement to prevent robots from following or indexing.
     */
    @LispMethod(comment = "Emit a meta statement to prevent robots from following or indexing.")
    public static SubLObject html_meta_no_robots() {
        return html_meta_robot_instructions(NIL, NIL);
    }

    public static final SubLObject html_meta_robot_instructions_alt(SubLObject index, SubLObject follow) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (follow == UNPROVIDED) {
            follow = NIL;
        }
        {
            SubLObject robot_instructions = html_meta_select_robot_instructions(index, follow);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_meta_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_meta_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$ROBOTS);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != robot_instructions) {
                html_markup(html_macros.$html_meta_content$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(robot_instructions);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject html_meta_robot_instructions(SubLObject index, SubLObject follow) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (follow == UNPROVIDED) {
            follow = NIL;
        }
        final SubLObject robot_instructions = html_meta_select_robot_instructions(index, follow);
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$ROBOTS);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != robot_instructions) {
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(robot_instructions);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    /**
     * This saves us consing up a string over and over.
     */
    @LispMethod(comment = "This saves us consing up a string over and over.")
    public static final SubLObject html_meta_select_robot_instructions_alt(SubLObject index, SubLObject follow) {
        if ((NIL == index) && (NIL == follow)) {
            return $str_alt104$NOINDEX__NOFOLLOW;
        } else {
            if ((NIL != index) && (NIL != follow)) {
                return $str_alt105$INDEX__FOLLOW;
            } else {
                if ((NIL == index) && (NIL != follow)) {
                    return $str_alt106$NOINDEX__FOLLOW;
                } else {
                    if ((NIL != index) && (NIL == follow)) {
                        return $str_alt107$INDEX__NOFOLLOW;
                    } else {
                        Errors.error($str_alt108$Invalid_HTML_meta_select_robot_in);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * This saves us consing up a string over and over.
     */
    @LispMethod(comment = "This saves us consing up a string over and over.")
    public static SubLObject html_meta_select_robot_instructions(final SubLObject index, final SubLObject follow) {
        if ((NIL == index) && (NIL == follow)) {
            return $str94$NOINDEX__NOFOLLOW;
        }
        if ((NIL != index) && (NIL != follow)) {
            return $str95$INDEX__FOLLOW;
        }
        if ((NIL == index) && (NIL != follow)) {
            return $str96$NOINDEX__FOLLOW;
        }
        if ((NIL != index) && (NIL == follow)) {
            return $str97$INDEX__NOFOLLOW;
        }
        Errors.error($str98$Invalid_HTML_meta_select_robot_in);
        return NIL;
    }

    public static final SubLObject html_hr_alt(SubLObject size, SubLObject width) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        html_markup(html_macros.$html_hr_head$.getGlobalValue());
        if (NIL != size) {
            html_markup(html_macros.$html_hr_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != width) {
            html_markup(html_macros.$html_hr_width$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(width);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_hr(SubLObject size, SubLObject width) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        html_markup(html_macros.$html_hr_head$.getGlobalValue());
        if (NIL != size) {
            html_markup(html_macros.$html_hr_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != width) {
            html_markup(html_macros.$html_hr_width$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(width);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_line_break_alt(SubLObject clear) {
        if (clear == UNPROVIDED) {
            clear = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != clear) {
                html_markup(html_macros.$html_line_break$.getGlobalValue());
                html_markup(html_macros.$html_line_break_clear$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(clear);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_line_break_tail$.getGlobalValue());
            } else {
                html_markup(html_macros.$html_line_break_atomic$.getGlobalValue());
            }
            if (NIL == html_macros.$within_html_pre$.getDynamicValue(thread)) {
                html_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject html_line_break(SubLObject clear) {
        if (clear == UNPROVIDED) {
            clear = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != clear) {
            html_markup(html_macros.$html_line_break$.getGlobalValue());
            html_markup(html_macros.$html_line_break_clear$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(clear);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_line_break_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_line_break_atomic$.getGlobalValue());
        }
        if (NIL == html_macros.$within_html_pre$.getDynamicValue(thread)) {
            html_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject html_br_alt() {
        return html_line_break(UNPROVIDED);
    }

    public static SubLObject html_br() {
        return html_line_break(UNPROVIDED);
    }

    /**
     * Produce a new line in HTML whether or not within a preformatted section.
     */
    @LispMethod(comment = "Produce a new line in HTML whether or not within a preformatted section.")
    public static final SubLObject html_newline_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                    if (NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
                        html_terpri(UNPROVIDED);
                    } else {
                        html_br();
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Produce a new line in HTML whether or not within a preformatted section.
     */
    @LispMethod(comment = "Produce a new line in HTML whether or not within a preformatted section.")
    public static SubLObject html_newline(SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            if (NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
                html_terpri(UNPROVIDED);
            } else {
                html_br();
            }
        }
        return NIL;
    }

    public static final SubLObject html_checkbox_input_alt(SubLObject name, SubLObject value, SubLObject checkedP, SubLObject script, SubLObject onclick, SubLObject disabledP) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        if (checkedP == UNPROVIDED) {
            checkedP = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        if (onclick == UNPROVIDED) {
            onclick = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(value);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != checkedP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        if (NIL != disabledP) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_indent(ONE_INTEGER);
        html_markup(script);
        if (NIL != onclick) {
            html_markup(html_macros.$html_select_onchange$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onclick);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_checkbox_input(final SubLObject name, SubLObject value, SubLObject checkedP, SubLObject script, SubLObject onclick, SubLObject disabledP) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        if (checkedP == UNPROVIDED) {
            checkedP = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        if (onclick == UNPROVIDED) {
            onclick = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = html_macros.$html_input_disabledP$.getDynamicValue();
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(value);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != checkedP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        if (NIL != disabledP) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        if (NIL != script) {
            html_char(CHAR_space, UNPROVIDED);
            html_markup(script);
        }
        if (NIL != onclick) {
            html_markup(html_macros.$html_select_onchange$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onclick);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_hidden_input_alt(SubLObject name, SubLObject value, SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_hidden$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(value);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_hidden_input(final SubLObject name, final SubLObject value, SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_hidden$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(value);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_image_input_alt(SubLObject name, SubLObject image_url, SubLObject align, SubLObject border) {
        if (align == UNPROVIDED) {
            align = NIL;
        }
        if (border == UNPROVIDED) {
            border = ZERO_INTEGER;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_image$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_input_src$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(image_url);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != align) {
            html_markup(html_macros.$html_input_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align(align));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != border) {
            html_markup(html_macros.$html_input_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(border);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_image_input(final SubLObject name, final SubLObject image_url, SubLObject align, SubLObject border) {
        if (align == UNPROVIDED) {
            align = NIL;
        }
        if (border == UNPROVIDED) {
            border = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_image$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != image_url) {
            html_markup(html_macros.$html_input_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_url);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != align) {
            html_markup(html_macros.$html_input_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align(align));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != border) {
            html_markup(html_macros.$html_input_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(border);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_password_input_alt(SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (v_default.equalp($str_alt37$)) {
            v_default = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_password$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(v_default);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_password_input(final SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_default.equalp($str47$)) {
            v_default = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_password$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(v_default);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_radio_input(SubLObject name, SubLObject value, SubLObject checkedP) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        if (checkedP == UNPROVIDED) {
            checkedP = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(value);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != checkedP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_radio_input(final SubLObject name, SubLObject value, SubLObject checkedP, SubLObject id) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        if (checkedP == UNPROVIDED) {
            checkedP = NIL;
        }
        if (id == UNPROVIDED) {
            id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(value);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != checkedP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_reset_input_alt(SubLObject label) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_reset$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (true) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ($$$Reset_All_Fields);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_reset_input(SubLObject label) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_reset$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_princ($$$Reset_All_Fields);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_submit_input_alt(SubLObject label, SubLObject name, SubLObject script) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_submit$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != label) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(label);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_indent(ONE_INTEGER);
        html_markup(script);
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_submit_input(SubLObject label, SubLObject name, SubLObject script) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_submit$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != label) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(label);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != script) {
            html_char(CHAR_space, UNPROVIDED);
            html_markup(script);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_text_input_alt(SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (v_default.equalp($str_alt37$)) {
            v_default = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(v_default);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_text_input(final SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_default.equalp($str47$)) {
            v_default = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(v_default);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_scripted_text_input_alt(SubLObject name, SubLObject script, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (v_default.equalp($str_alt37$)) {
            v_default = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(v_default);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_indent(ONE_INTEGER);
        html_markup(script);
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_scripted_text_input(final SubLObject name, final SubLObject script, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_default.equalp($str47$)) {
            v_default = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(v_default);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != script) {
            html_char(CHAR_space, UNPROVIDED);
            html_markup(script);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_disabled_text_input_alt(SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (v_default.equalp($str_alt37$)) {
            v_default = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(v_default);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_disabled_text_input(final SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (v_default.equalp($str47$)) {
            v_default = NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(v_default);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    /**
     * Special form of HTML-TEXT-INPUT where the name is constructed via a format
     */
    @LispMethod(comment = "Special form of HTML-TEXT-INPUT where the name is constructed via a format")
    public static final SubLObject html_format_input_alt(SubLObject v_default, SubLObject size, SubLObject name_format_string, SubLObject arg_1, SubLObject arg_2, SubLObject arg_3, SubLObject arg_4) {
        if (arg_1 == UNPROVIDED) {
            arg_1 = NIL;
        }
        if (arg_2 == UNPROVIDED) {
            arg_2 = NIL;
        }
        if (arg_3 == UNPROVIDED) {
            arg_3 = NIL;
        }
        if (arg_4 == UNPROVIDED) {
            arg_4 = NIL;
        }
        {
            SubLObject name = format(NIL, name_format_string, new SubLObject[]{ arg_1, arg_2, arg_3, arg_4 });
            return html_text_input(name, v_default, size);
        }
    }

    /**
     * Special form of HTML-TEXT-INPUT where the name is constructed via a format
     */
    @LispMethod(comment = "Special form of HTML-TEXT-INPUT where the name is constructed via a format")
    public static SubLObject html_format_input(final SubLObject v_default, final SubLObject size, final SubLObject name_format_string, SubLObject arg_1, SubLObject arg_2, SubLObject arg_3, SubLObject arg_4) {
        if (arg_1 == UNPROVIDED) {
            arg_1 = NIL;
        }
        if (arg_2 == UNPROVIDED) {
            arg_2 = NIL;
        }
        if (arg_3 == UNPROVIDED) {
            arg_3 = NIL;
        }
        if (arg_4 == UNPROVIDED) {
            arg_4 = NIL;
        }
        final SubLObject name = format(NIL, name_format_string, new SubLObject[]{ arg_1, arg_2, arg_3, arg_4 });
        return html_text_input(name, v_default, size);
    }

    public static SubLObject html_autocomplete_text_input(final SubLObject name, SubLObject v_default, SubLObject size, SubLObject cycl_type, SubLObject style) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (cycl_type == UNPROVIDED) {
            cycl_type = NIL;
        }
        if (style == UNPROVIDED) {
            style = $str47$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != html_macros.next_html_id_definedP(UNPROVIDED)) {
            final SubLObject id_num = html_macros.next_html_id(UNPROVIDED);
            final SubLObject autocomplete_id = cconcatenate($str100$autocomplete_, format_nil.format_nil_a_no_copy(id_num));
            final SubLObject input_id = cconcatenate($str101$input_, format_nil.format_nil_a_no_copy(id_num));
            final SubLObject result_id = cconcatenate($str102$autocomplete_results_, format_nil.format_nil_a_no_copy(id_num));
            final SubLObject complete_style = cconcatenate($str103$position_static__width_auto_, format_nil.format_nil_a_no_copy(style));
            html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (NIL != autocomplete_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(autocomplete_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str104$yui_ac);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_input_head$.getGlobalValue());
                html_markup(html_macros.$html_input_type$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_input_text$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_input_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(complete_style);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != input_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(input_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != name) {
                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(name);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != v_default) {
                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_princ(v_default);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != size) {
                    html_markup(html_macros.$html_input_size$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(size);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str105$yui_ac_input);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_char(CHAR_greater, UNPROVIDED);
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != result_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(result_id);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str106$yui_ac_container);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_span_tail$.getGlobalValue());
            html_complete.html_print_js_autocomplete_setup_int(input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, cycl_type);
        } else {
            html_text_input(name, v_default, size);
        }
        return NIL;
    }

    public static final SubLObject html_image_multi_submit_alt(SubLObject template, SubLObject align) {
        if (align == UNPROVIDED) {
            align = NIL;
        }
        {
            SubLObject datum = template;
            SubLObject current = datum;
            SubLObject src = NIL;
            SubLObject name = NIL;
            SubLObject v_default = NIL;
            SubLObject map = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt110);
            src = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt110);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt110);
            v_default = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt110);
            map = current.first();
            current = current.rest();
            if (NIL == current) {
                return html_image_input(name, src, align, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list_alt110);
            }
        }
        return NIL;
    }

    public static SubLObject html_image_multi_submit(final SubLObject template, SubLObject align) {
        if (align == UNPROVIDED) {
            align = NIL;
        }
        SubLObject src = NIL;
        SubLObject name = NIL;
        SubLObject v_default = NIL;
        SubLObject map = NIL;
        destructuring_bind_must_consp(template, template, $list107);
        src = template.first();
        SubLObject current = template.rest();
        destructuring_bind_must_consp(current, template, $list107);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, template, $list107);
        v_default = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, template, $list107);
        map = current.first();
        current = current.rest();
        if (NIL == current) {
            return html_image_input(name, src, align, UNPROVIDED);
        }
        cdestructuring_bind_error(template, $list107);
        return NIL;
    }

    /**
     * Return the value indicated by the multi-submit TEMPLATE given the submitted ARGS.
     */
    @LispMethod(comment = "Return the value indicated by the multi-submit TEMPLATE given the submitted ARGS.")
    public static final SubLObject html_extract_multi_submit_input_alt(SubLObject template, SubLObject args) {
        {
            SubLObject datum = template;
            SubLObject current = datum;
            SubLObject src = NIL;
            SubLObject name = NIL;
            SubLObject v_default = NIL;
            SubLObject map_items = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            src = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt111);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt111);
            v_default = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt111);
            map_items = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject x_start = html_extract_multi_submit_input_internal(name, $str_alt112$_x, args);
                    SubLObject y_start = html_extract_multi_submit_input_internal(name, $str_alt113$_y, args);
                    if (x_start.isString() && y_start.isString()) {
                        x_start = read_from_string_ignoring_errors(x_start, NIL, NIL, UNPROVIDED, UNPROVIDED);
                        y_start = read_from_string_ignoring_errors(y_start, NIL, NIL, UNPROVIDED, UNPROVIDED);
                        if (x_start.isInteger() && y_start.isInteger()) {
                            {
                                SubLObject cdolist_list_var = map_items;
                                SubLObject map_item = NIL;
                                for (map_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , map_item = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum_7 = map_item;
                                        SubLObject current_8 = datum_7;
                                        SubLObject x_range = NIL;
                                        SubLObject y_range = NIL;
                                        SubLObject value = NIL;
                                        destructuring_bind_must_consp(current_8, datum_7, $list_alt114);
                                        x_range = current_8.first();
                                        current_8 = current_8.rest();
                                        destructuring_bind_must_consp(current_8, datum_7, $list_alt114);
                                        y_range = current_8.first();
                                        current_8 = current_8.rest();
                                        destructuring_bind_must_consp(current_8, datum_7, $list_alt114);
                                        value = current_8.first();
                                        current_8 = current_8.rest();
                                        if (NIL == current_8) {
                                            if (((NIL == x_range) || (x_start.numGE(x_range.first()) && x_start.numLE(second(x_range)))) && ((NIL == y_range) || (y_start.numGE(y_range.first()) && y_start.numLE(second(y_range))))) {
                                                return value;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_7, $list_alt114);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return v_default;
            } else {
                cdestructuring_bind_error(datum, $list_alt111);
            }
        }
        return NIL;
    }

    /**
     * Return the value indicated by the multi-submit TEMPLATE given the submitted ARGS.
     */
    @LispMethod(comment = "Return the value indicated by the multi-submit TEMPLATE given the submitted ARGS.")
    public static SubLObject html_extract_multi_submit_input(final SubLObject template, final SubLObject args) {
        SubLObject src = NIL;
        SubLObject name = NIL;
        SubLObject v_default = NIL;
        SubLObject map_items = NIL;
        destructuring_bind_must_consp(template, template, $list108);
        src = template.first();
        SubLObject current = template.rest();
        destructuring_bind_must_consp(current, template, $list108);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, template, $list108);
        v_default = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, template, $list108);
        map_items = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject x_start = html_extract_multi_submit_input_internal(name, $str109$_x, args);
            SubLObject y_start = html_extract_multi_submit_input_internal(name, $str110$_y, args);
            if (x_start.isString() && y_start.isString()) {
                x_start = read_from_string_ignoring_errors(x_start, NIL, NIL, UNPROVIDED, UNPROVIDED);
                y_start = read_from_string_ignoring_errors(y_start, NIL, NIL, UNPROVIDED, UNPROVIDED);
                if (x_start.isInteger() && y_start.isInteger()) {
                    SubLObject cdolist_list_var = map_items;
                    SubLObject map_item = NIL;
                    map_item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current_$9;
                        final SubLObject datum_$8 = current_$9 = map_item;
                        SubLObject x_range = NIL;
                        SubLObject y_range = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current_$9, datum_$8, $list111);
                        x_range = current_$9.first();
                        current_$9 = current_$9.rest();
                        destructuring_bind_must_consp(current_$9, datum_$8, $list111);
                        y_range = current_$9.first();
                        current_$9 = current_$9.rest();
                        destructuring_bind_must_consp(current_$9, datum_$8, $list111);
                        value = current_$9.first();
                        current_$9 = current_$9.rest();
                        if (NIL == current_$9) {
                            if (((NIL == x_range) || (x_start.numGE(x_range.first()) && x_start.numLE(second(x_range)))) && ((NIL == y_range) || (y_start.numGE(y_range.first()) && y_start.numLE(second(y_range))))) {
                                return value;
                            }
                        } else {
                            cdestructuring_bind_error(datum_$8, $list111);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        map_item = cdolist_list_var.first();
                    } 
                }
            }
            return v_default;
        }
        cdestructuring_bind_error(template, $list108);
        return NIL;
    }

    /**
     * internal function used by extract-image-multi-submit
     */
    @LispMethod(comment = "internal function used by extract-image-multi-submit")
    public static final SubLObject html_extract_multi_submit_input_internal_alt(SubLObject name, SubLObject suffix, SubLObject args) {
        {
            SubLObject name_length = length(name);
            SubLObject suffix_length = length(suffix);
            SubLObject list = NIL;
            for (list = args; NIL != list; list = list.rest()) {
                {
                    SubLObject arg = list.first();
                    if (arg.isCons()) {
                        {
                            SubLObject datum = arg;
                            SubLObject current = datum;
                            SubLObject arg_name = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt115);
                            arg_name = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt115);
                            value = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject arg_name_length = length(arg_name);
                                    if ((arg_name_length.numE(add(length(name), length(suffix))) && (NIL != Strings.string_equal(name, arg_name, ZERO_INTEGER, name_length, ZERO_INTEGER, name_length))) && (NIL != Strings.string_equal(suffix, arg_name, ZERO_INTEGER, suffix_length, name_length, arg_name_length))) {
                                        return value;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt115);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * internal function used by extract-image-multi-submit
     */
    @LispMethod(comment = "internal function used by extract-image-multi-submit")
    public static SubLObject html_extract_multi_submit_input_internal(final SubLObject name, final SubLObject suffix, final SubLObject args) {
        final SubLObject name_length = length(name);
        final SubLObject suffix_length = length(suffix);
        SubLObject list;
        SubLObject arg;
        SubLObject current;
        SubLObject datum;
        SubLObject arg_name;
        SubLObject value;
        SubLObject arg_name_length;
        for (list = NIL, list = args; NIL != list; list = list.rest()) {
            arg = list.first();
            if (arg.isCons()) {
                datum = current = arg;
                arg_name = NIL;
                value = NIL;
                destructuring_bind_must_consp(current, datum, $list112);
                arg_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list112);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    arg_name_length = length(arg_name);
                    if ((arg_name_length.numE(add(length(name), length(suffix))) && (NIL != Strings.string_equal(name, arg_name, ZERO_INTEGER, name_length, ZERO_INTEGER, name_length))) && (NIL != Strings.string_equal(suffix, arg_name, ZERO_INTEGER, suffix_length, name_length, arg_name_length))) {
                        return value;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list112);
                }
            }
        }
        return NIL;
    }

    /**
     * Used internally by the html-indent-table macro
     */
    @LispMethod(comment = "Used internally by the html-indent-table macro")
    public static final SubLObject html_indent_table_internal_alt(SubLObject indent_width) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(html_macros.$html_indent_table_max$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.verify_not_within_html_pre();
                                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    {
                                        SubLObject _prev_bind_0_10 = html_macros.$within_html_pre$.currentBinding(thread);
                                        try {
                                            html_macros.$within_html_pre$.bind(T, thread);
                                            html_indent(indent_width);
                                        } finally {
                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Used internally by the html-indent-table macro
     */
    @LispMethod(comment = "Used internally by the html-indent-table macro")
    public static SubLObject html_indent_table_internal(final SubLObject indent_width) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject i;
            SubLObject _prev_bind_0_$10;
            SubLObject _prev_bind_0_$11;
            for (i = NIL, i = ZERO_INTEGER; i.numL(html_macros.$html_indent_table_max$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_macros.verify_not_within_html_pre();
                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                    _prev_bind_0_$11 = html_macros.$within_html_pre$.currentBinding(thread);
                    try {
                        html_macros.$within_html_pre$.bind(T, thread);
                        html_indent(indent_width);
                    } finally {
                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    /**
     * Used internally by the html-indent-row macro
     */
    @LispMethod(comment = "Used internally by the html-indent-row macro")
    public static final SubLObject html_indent_row_internal_alt(SubLObject indent_amount) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (indent_amount.numG(ZERO_INTEGER)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != indent_amount) {
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(indent_amount);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Used internally by the html-indent-row macro
     */
    @LispMethod(comment = "Used internally by the html-indent-row macro")
    public static SubLObject html_indent_row_internal(final SubLObject indent_amount) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (indent_amount.numG(ZERO_INTEGER)) {
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (NIL != indent_amount) {
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(indent_amount);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * Define a location called NAME for use as a relative target within this document.
     */
    @LispMethod(comment = "Define a location called NAME for use as a relative target within this document.")
    public static final SubLObject html_target_definition_alt(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            if (NIL != name) {
                html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(name);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            return name;
        }
    }

    /**
     * Define a location called NAME for use as a relative target within this document.
     */
    @LispMethod(comment = "Define a location called NAME for use as a relative target within this document.")
    public static SubLObject html_target_definition(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        if (NIL != name) {
            html_markup(html_macros.$html_anchor_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return name;
    }

    /**
     * Set the base font size to SIZE in the current document.
     */
    @LispMethod(comment = "Set the base font size to SIZE in the current document.")
    public static final SubLObject html_basefont_alt(SubLObject size) {
        if (NIL != size) {
            html_markup(html_macros.$html_basefont_head$.getGlobalValue());
            html_markup(html_macros.$html_basefont_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Set the base font size to SIZE in the current document.
     */
    @LispMethod(comment = "Set the base font size to SIZE in the current document.")
    public static SubLObject html_basefont(final SubLObject size) {
        if (NIL != size) {
            html_markup(html_macros.$html_basefont_head$.getGlobalValue());
            html_markup(html_macros.$html_basefont_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Output a word break
     */
    @LispMethod(comment = "Output a word break")
    public static final SubLObject html_word_break_alt() {
        html_markup(html_macros.$html_word_break$.getGlobalValue());
        return NIL;
    }

    /**
     * Output a word break
     */
    @LispMethod(comment = "Output a word break")
    public static SubLObject html_word_break() {
        html_markup(html_macros.$html_word_break$.getGlobalValue());
        return NIL;
    }

    /**
     * Print an object's lexicon entry
     */
    @LispMethod(comment = "Print an object\'s lexicon entry")
    public static final SubLObject html_print_lexicon_entry_alt(SubLObject fort) {
        cb_link($LEXICON, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Print an object's lexicon entry
     */
    @LispMethod(comment = "Print an object\'s lexicon entry")
    public static SubLObject html_print_lexicon_entry(final SubLObject fort) {
        cb_link($LEXICON, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Be sure to handle nats as nat constants, if possible
     */
    @LispMethod(comment = "Be sure to handle nats as nat constants, if possible")
    public static final SubLObject html_print_form_alt(SubLObject form, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        {
            SubLObject nautP = term.hl_ground_nautP(form);
            SubLObject atomic = (NIL != nautP) ? ((SubLObject) (narts_high.find_nart(form))) : NIL;
            if ((NIL != nautP) && (NIL != atomic)) {
                cb_form(atomic, depth, wrap_axiomsP);
            } else {
                cb_form(form, depth, wrap_axiomsP);
            }
        }
        return NIL;
    }

    /**
     * Be sure to handle nats as nat constants, if possible
     */
    @LispMethod(comment = "Be sure to handle nats as nat constants, if possible")
    public static SubLObject html_print_form(final SubLObject form, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        final SubLObject nautP = term.hl_ground_nautP(form);
        final SubLObject atomic = (NIL != nautP) ? narts_high.find_nart(form) : NIL;
        if ((NIL != nautP) && (NIL != atomic)) {
            cb_form(atomic, depth, wrap_axiomsP);
        } else {
            cb_form(form, depth, wrap_axiomsP);
        }
        return NIL;
    }

    /**
     * outputs an image with source in /cycdoc/img/NAME using ALT if provided
     * ALIGN, if provided, must be one of :top, :middle, :bottom
     */
    @LispMethod(comment = "outputs an image with source in /cycdoc/img/NAME using ALT if provided\r\nALIGN, if provided, must be one of :top, :middle, :bottom\noutputs an image with source in /cycdoc/img/NAME using ALT if provided\nALIGN, if provided, must be one of :top, :middle, :bottom")
    public static final SubLObject html_basic_image_alt(SubLObject name, SubLObject alt, SubLObject align, SubLObject border) {
        if (alt == UNPROVIDED) {
            alt = name;
        }
        if (align == UNPROVIDED) {
            align = NIL;
        }
        if (border == UNPROVIDED) {
            border = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(system_parameters.$html_image_directory$.getDynamicValue(thread));
            html_markup(name);
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
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * outputs an image with source in /cycdoc/img/NAME using ALT if provided
     * ALIGN, if provided, must be one of :top, :middle, :bottom
     */
    @LispMethod(comment = "outputs an image with source in /cycdoc/img/NAME using ALT if provided\r\nALIGN, if provided, must be one of :top, :middle, :bottom\noutputs an image with source in /cycdoc/img/NAME using ALT if provided\nALIGN, if provided, must be one of :top, :middle, :bottom")
    public static SubLObject html_basic_image(final SubLObject name, SubLObject alt, SubLObject align, SubLObject border) {
        if (alt == UNPROVIDED) {
            alt = name;
        }
        if (align == UNPROVIDED) {
            align = NIL;
        }
        if (border == UNPROVIDED) {
            border = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(system_parameters.$html_image_directory$.getDynamicValue(thread));
        html_markup(name);
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
        return NIL;
    }

    public static final SubLObject html_table_row_list_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject cdolist_list_var = items;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(item);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject html_table_row_list(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(item);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_table_heading_list_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject cdolist_list_var = items;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(item);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject html_table_heading_list(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(item);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_percent_progress_bar_alt(SubLObject sofar, SubLObject total, SubLObject granularity, SubLObject progress_color, SubLObject remaining_color) {
        if (granularity == UNPROVIDED) {
            granularity = $int$100;
        }
        if (progress_color == UNPROVIDED) {
            progress_color = html_macros.$html_color_sat_green$.getDynamicValue();
        }
        if (remaining_color == UNPROVIDED) {
            remaining_color = html_macros.$html_color_sat_red$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sofar, INTEGERP);
            SubLTrampolineFile.checkType(total, INTEGERP);
            SubLTrampolineFile.checkType(granularity, INTEGERP);
            {
                SubLObject progress_width = truncate(multiply(sofar, granularity), total);
                SubLObject remaining_width = subtract(granularity, progress_width);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (!ZERO_INTEGER.numE(progress_width)) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != progress_color) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(progress_color);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject i = NIL;
                                        for (i = ZERO_INTEGER; i.numL(progress_width); i = add(i, ONE_INTEGER)) {
                                            html_glyph($NBSP, UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        if (!ZERO_INTEGER.numE(remaining_width)) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != remaining_color) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(remaining_color);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject i = NIL;
                                        for (i = ZERO_INTEGER; i.numL(remaining_width); i = add(i, ONE_INTEGER)) {
                                            html_glyph($NBSP, UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject html_percent_progress_bar(final SubLObject sofar, final SubLObject total, SubLObject granularity, SubLObject progress_color, SubLObject remaining_color) {
        if (granularity == UNPROVIDED) {
            granularity = $int$100;
        }
        if (progress_color == UNPROVIDED) {
            progress_color = html_macros.$html_color_sat_green$.getGlobalValue();
        }
        if (remaining_color == UNPROVIDED) {
            remaining_color = html_macros.$html_color_sat_red$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(sofar) : "! integerp(sofar) " + ("Types.integerp(sofar) " + "CommonSymbols.NIL != Types.integerp(sofar) ") + sofar;
        assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
        assert NIL != integerp(granularity) : "! integerp(granularity) " + ("Types.integerp(granularity) " + "CommonSymbols.NIL != Types.integerp(granularity) ") + granularity;
        final SubLObject progress_width = truncate(multiply(sofar, granularity), total);
        final SubLObject remaining_width = subtract(granularity, progress_width);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (!ZERO_INTEGER.numE(progress_width)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != progress_color) {
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(progress_color);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject i;
                    for (i = NIL, i = ZERO_INTEGER; i.numL(progress_width); i = add(i, ONE_INTEGER)) {
                        html_glyph($NBSP, UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            if (!ZERO_INTEGER.numE(remaining_width)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != remaining_color) {
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(remaining_color);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject i;
                    for (i = NIL, i = ZERO_INTEGER; i.numL(remaining_width); i = add(i, ONE_INTEGER)) {
                        html_glyph($NBSP, UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_fancy_percent_progress_bar(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$16 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list116);
            current_$16 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list116);
            if (NIL == member(current_$16, $list117, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$16 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list116);
        }
        final SubLObject sofar_tail = property_list_member($SOFAR, current);
        final SubLObject sofar = (NIL != sofar_tail) ? cadr(sofar_tail) : NIL;
        final SubLObject total_tail = property_list_member($TOTAL, current);
        final SubLObject total = (NIL != total_tail) ? cadr(total_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : TWO_INTEGER;
        final SubLObject progress_color_tail = property_list_member($PROGRESS_COLOR, current);
        final SubLObject progress_color = (NIL != progress_color_tail) ? cadr(progress_color_tail) : $html_color_sat_green$;
        final SubLObject remaining_color_tail = property_list_member($REMAINING_COLOR, current);
        final SubLObject remaining_color = (NIL != remaining_color_tail) ? cadr(remaining_color_tail) : $html_color_sat_red$;
        final SubLObject border_tail = property_list_member($BORDER, current);
        final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : ZERO_INTEGER;
        final SubLObject width2 = $sym127$WIDTH1;
        final SubLObject width3 = $sym128$WIDTH2;
        return list(HTML_FANCY_TABLE, append(NIL != width ? list($WIDTH, width) : NIL, NIL != border ? list($BORDER, border) : NIL, $list130), list(CMULTIPLE_VALUE_BIND, list(width2, width3), list(HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, sofar, total, width), list(HTML_FANCY_TABLE_ROW, append(NIL != height ? list($HEIGHT, height) : NIL, NIL), list(HTML_FANCY_TABLE_DATA, list($WIDTH, width2, $BGCOLOR, progress_color)), list(HTML_FANCY_TABLE_DATA, list($WIDTH, width3, $BGCOLOR, remaining_color)))));
    }

    public static SubLObject html_fancy_percent_progress_bar_widths(final SubLObject sofar, final SubLObject total, final SubLObject width) {
        assert NIL != numberp(sofar) : "! numberp(sofar) " + ("Types.numberp(sofar) " + "CommonSymbols.NIL != Types.numberp(sofar) ") + sofar;
        assert NIL != numberp(total) : "! numberp(total) " + ("Types.numberp(total) " + "CommonSymbols.NIL != Types.numberp(total) ") + total;
        if (sofar.numG(total)) {
            return html_fancy_percent_progress_bar_widths(total, total, width);
        }
        if (sofar.numL(ZERO_INTEGER)) {
            return html_fancy_percent_progress_bar_widths(ZERO_INTEGER, total, width);
        }
        if (total.numLE(ZERO_INTEGER)) {
            return html_fancy_percent_progress_bar_widths(sofar, ONE_INTEGER, width);
        }
        if (width.isInteger() && width.isPositive()) {
            SubLObject sofar_width = truncate(divide(multiply(sofar, width), total), UNPROVIDED);
            if (sofar.isPositive()) {
                sofar_width = max(sofar_width, ONE_INTEGER);
            }
            final SubLObject total_width = subtract(width, sofar_width);
            return values(sofar_width, total_width);
        }
        return html_fancy_percent_progress_bar_widths(sofar, total, $int$1000);
    }

    public static final SubLObject html_progress_section_alt(SubLObject message, SubLObject sofar, SubLObject total, SubLObject run_time, SubLObject finish_time) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (sofar == UNPROVIDED) {
            sofar = NIL;
        }
        if (total == UNPROVIDED) {
            total = NIL;
        }
        if (run_time == UNPROVIDED) {
            run_time = NIL;
        }
        if (finish_time == UNPROVIDED) {
            finish_time = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != message) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(message);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            if ((NIL != run_time) || (NIL != sofar)) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != run_time) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != finish_time) {
                                                html_princ($str_alt121$Run_Time__);
                                            } else {
                                                html_princ($str_alt122$Elapsed_Time__);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ(numeric_date_utilities.elapsed_seconds_string(run_time));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != sofar) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str_alt124$Current_Total__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ(sofar);
                                            if (NIL != total) {
                                                html_princ($str_alt125$_of_);
                                                html_princ(total);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            if ((NIL != sofar) && (NIL != total)) {
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject percent = number_utilities.integer_percent(sofar, total, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt127$_D_, percent);
                                            html_indent(TWO_INTEGER);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_percent_progress_bar(sofar, total, $int$100, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject html_progress_section(SubLObject message, SubLObject sofar, SubLObject total, SubLObject run_time, SubLObject finish_time) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (sofar == UNPROVIDED) {
            sofar = NIL;
        }
        if (total == UNPROVIDED) {
            total = NIL;
        }
        if (run_time == UNPROVIDED) {
            run_time = NIL;
        }
        if (finish_time == UNPROVIDED) {
            finish_time = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != message) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ(message);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
        }
        if ((NIL != run_time) || (NIL != sofar)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != run_time) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != finish_time) {
                                html_princ($str141$Run_Time__);
                            } else {
                                html_princ($str142$Elapsed_Time__);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(numeric_date_utilities.elapsed_seconds_string(run_time));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
                if (NIL != sofar) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str144$Current_Total__);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(sofar);
                            if (NIL != total) {
                                html_princ($$$_of_);
                                html_princ(total);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        if ((NIL != sofar) && (NIL != total)) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject percent = number_utilities.integer_percent(sofar, total, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str147$_D_, percent);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_percent_progress_bar(sofar, total, $int$100, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject html_horizontal_bar_graph_alt(SubLObject label_value_pairs, SubLObject outerborder, SubLObject smallerbars, SubLObject color1, SubLObject color2) {
        if (outerborder == UNPROVIDED) {
            outerborder = TWO_INTEGER;
        }
        if (smallerbars == UNPROVIDED) {
            smallerbars = NIL;
        }
        if (color1 == UNPROVIDED) {
            color1 = html_macros.$html_color_lighter_blue$.getDynamicValue();
        }
        if (color2 == UNPROVIDED) {
            color2 = html_macros.$html_color_lighter_green$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == label_value_pairs) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str_alt128$_No_data_to_graph_);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                return NIL;
            }
            {
                SubLObject v_switch = NIL;
                SubLObject newpairs = NIL;
                SubLObject adjustfactor = ONE_INTEGER;
                adjustfactor = divide($int$100, max(ONE_INTEGER, apply(symbol_function(MAX), Mapping.mapcar(symbol_function(SECOND), label_value_pairs))));
                {
                    SubLObject cdolist_list_var = label_value_pairs;
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        newpairs = cons(list(pair.first(), round(multiply(second(pair), adjustfactor), UNPROVIDED), second(pair)), newpairs);
                    }
                }
                {
                    SubLObject workingpairs = nreverse(newpairs);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (NIL != outerborder) {
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(outerborder);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(FOUR_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(FOUR_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str_alt131$100_);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(ZERO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(ZERO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(ZERO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str_alt131$100_);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    {
                                                        SubLObject cdolist_list_var = workingpairs;
                                                        SubLObject pair = NIL;
                                                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject label_string = pair.first();
                                                                SubLObject perc_width = second(pair);
                                                                SubLObject actual_width = third(pair);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject widthstring = (perc_width.isZero()) ? ((SubLObject) ($str_alt132$1_)) : format(NIL, $str_alt133$_A_, perc_width);
                                                                            SubLObject switchedcolor = (NIL != v_switch) ? ((SubLObject) (color1)) : color2;
                                                                            html_draw_bargraph_label(label_string);
                                                                            html_draw_bargraph_colorbar(widthstring, actual_width, switchedcolor, smallerbars);
                                                                            v_switch = makeBoolean(NIL == v_switch);
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static SubLObject html_horizontal_bar_graph(final SubLObject label_value_pairs, SubLObject outerborder, SubLObject smallerbars, SubLObject color1, SubLObject color2) {
        if (outerborder == UNPROVIDED) {
            outerborder = TWO_INTEGER;
        }
        if (smallerbars == UNPROVIDED) {
            smallerbars = NIL;
        }
        if (color1 == UNPROVIDED) {
            color1 = html_macros.$html_color_lighter_blue$.getGlobalValue();
        }
        if (color2 == UNPROVIDED) {
            color2 = html_macros.$html_color_lighter_green$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == label_value_pairs) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str148$_No_data_to_graph_);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            return NIL;
        }
        SubLObject v_switch = NIL;
        SubLObject newpairs = NIL;
        SubLObject adjustfactor = ONE_INTEGER;
        adjustfactor = divide($int$100, max(ONE_INTEGER, apply(symbol_function(MAX), Mapping.mapcar(symbol_function(SECOND), label_value_pairs))));
        SubLObject cdolist_list_var = label_value_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            newpairs = cons(list(pair.first(), round(multiply(second(pair), adjustfactor), UNPROVIDED), second(pair)), newpairs);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        final SubLObject workingpairs = nreverse(newpairs);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        if (NIL != outerborder) {
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(outerborder);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(FOUR_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(FOUR_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str151$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str151$100_);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var2 = workingpairs;
                        SubLObject pair2 = NIL;
                        pair2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject label_string = pair2.first();
                            final SubLObject perc_width = second(pair2);
                            final SubLObject actual_width = third(pair2);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject widthstring = (perc_width.isZero()) ? $str152$1_ : cconcatenate(format_nil.format_nil_a_no_copy(perc_width), $str153$_);
                                final SubLObject switchedcolor = (NIL != v_switch) ? color1 : color2;
                                html_draw_bargraph_label(label_string);
                                html_draw_bargraph_colorbar(widthstring, actual_width, switchedcolor, smallerbars);
                                v_switch = makeBoolean(NIL == v_switch);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            pair2 = cdolist_list_var2.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_draw_bargraph_label_alt(SubLObject labelstring) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt134$5_);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(labelstring);
                    html_indent(TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject html_draw_bargraph_label(final SubLObject labelstring) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($RIGHT));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str154$5_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(labelstring);
            html_indent(TWO_INTEGER);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_draw_bargraph_colorbar_alt(SubLObject widthstring, SubLObject actualwidth, SubLObject bgcolor, SubLObject smallbars) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt135$95_);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str_alt131$100_);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != bgcolor) {
                                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(bgcolor);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != widthstring) {
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(widthstring);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject size_val = TWO_INTEGER;
                                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                if (NIL != size_val) {
                                                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(size_val);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt136$__D, actualwidth);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != smallbars) {
                                                {
                                                    SubLObject size_val = TWO_INTEGER;
                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                    if (NIL != size_val) {
                                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(size_val);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_glyph($NBSP, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                }
                                            } else {
                                                html_glyph($NBSP, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject html_draw_bargraph_colorbar(final SubLObject widthstring, final SubLObject actualwidth, final SubLObject bgcolor, final SubLObject smallbars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str155$95_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_width$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str151$100_);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != bgcolor) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(bgcolor);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != widthstring) {
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(widthstring);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject size_val = TWO_INTEGER;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str156$__D, actualwidth);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != smallbars) {
                            final SubLObject size_val = TWO_INTEGER;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != size_val) {
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(size_val);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_glyph($NBSP, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        } else {
                            html_glyph($NBSP, UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Output HTML for setting PARAMETER inside a form.
     * When DESCRIPTION? is non-nil, the full documentation for parameter is included, if any.
     * If there is a text input, ENTRY-SIZE will be used as its size.
     */
    @LispMethod(comment = "Output HTML for setting PARAMETER inside a form.\r\nWhen DESCRIPTION? is non-nil, the full documentation for parameter is included, if any.\r\nIf there is a text input, ENTRY-SIZE will be used as its size.\nOutput HTML for setting PARAMETER inside a form.\nWhen DESCRIPTION? is non-nil, the full documentation for parameter is included, if any.\nIf there is a text input, ENTRY-SIZE will be used as its size.")
    public static final SubLObject html_control_parameter_chooser_alt(SubLObject parameter, SubLObject descriptionP) {
        if (descriptionP == UNPROVIDED) {
            descriptionP = NIL;
        }
        SubLTrampolineFile.checkType(parameter, SYMBOLP);
        {
            SubLObject fancy_name = get(parameter, $FANCY_NAME, UNPROVIDED);
            SubLObject description = get(parameter, $DESCRIPTION, UNPROVIDED);
            SubLObject settings_spec = get(parameter, $SETTINGS_SPEC, UNPROVIDED);
            if (NIL != boundp(parameter)) {
                if (NIL == fancy_name) {
                    fancy_name = symbol_name(parameter);
                }
                if (NIL == settings_spec) {
                    settings_spec = $list_alt141;
                }
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ(fancy_name);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                if (NIL != descriptionP) {
                    html_newline(UNPROVIDED);
                    html_princ_doc_string(description, UNPROVIDED);
                }
                {
                    SubLObject entry_name = html_control_parameter_entry_name(parameter);
                    SubLObject radio_name = html_control_parameter_radio_name(parameter);
                    SubLObject some_entryP = find($ENTRY, settings_spec, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                    SubLObject current_value = eval(parameter);
                    SubLObject total_settings = length(settings_spec);
                    SubLObject index = ZERO_INTEGER;
                    SubLObject cdolist_list_var = settings_spec;
                    SubLObject setting_spec = NIL;
                    for (setting_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , setting_spec = cdolist_list_var.first()) {
                        html_newline(UNPROVIDED);
                        {
                            SubLObject datum = setting_spec;
                            SubLObject current = datum;
                            SubLObject type = NIL;
                            SubLObject datum_36 = NIL;
                            SubLObject possibility_fancy_name = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt144);
                            type = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt144);
                            datum_36 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt144);
                            possibility_fancy_name = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject radio_checkedP = NIL;
                                    SubLObject entry_default = NIL;
                                    if (total_settings.numE(ONE_INTEGER)) {
                                        radio_checkedP = T;
                                    } else {
                                        if (type == $ENTRY) {
                                            radio_checkedP = funcall(datum_36, current_value);
                                        } else {
                                            radio_checkedP = equal(current_value, datum_36);
                                        }
                                    }
                                    if ((NIL != radio_checkedP) && (type == $ENTRY)) {
                                        entry_default = princ_to_string(current_value);
                                    }
                                    if (total_settings.numE(ONE_INTEGER)) {
                                        html_hidden_input(radio_name, index, UNPROVIDED);
                                    } else {
                                        if (NIL != some_entryP) {
                                            if (type == $ENTRY) {
                                                html_script_utilities.html_focus_radio_input(radio_name, entry_name, index, radio_checkedP);
                                            } else {
                                                html_script_utilities.html_clear_radio_input(radio_name, entry_name, index, radio_checkedP);
                                            }
                                        } else {
                                            html_radio_input(radio_name, index, radio_checkedP);
                                        }
                                        html_indent(UNPROVIDED);
                                    }
                                    if (type == $ENTRY) {
                                        {
                                            SubLObject entry_format = html_macros.html_parameter_entry_format(parameter);
                                            if (NIL == entry_format) {
                                                entry_format = $list_alt145;
                                            }
                                            {
                                                SubLObject datum_37 = entry_format;
                                                SubLObject current_38 = datum_37;
                                                SubLObject type_39 = NIL;
                                                SubLObject size = NIL;
                                                destructuring_bind_must_consp(current_38, datum_37, $list_alt146);
                                                type_39 = current_38.first();
                                                current_38 = current_38.rest();
                                                destructuring_bind_must_consp(current_38, datum_37, $list_alt146);
                                                size = current_38.first();
                                                current_38 = current_38.rest();
                                                if (NIL == current_38) {
                                                    {
                                                        SubLObject pcase_var = type_39;
                                                        if (pcase_var.eql($TEXT)) {
                                                            html_text_input(entry_name, entry_default, size);
                                                        } else {
                                                            html_text_input(entry_name, entry_default, UNPROVIDED);
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_37, $list_alt146);
                                                }
                                            }
                                        }
                                        html_indent(UNPROVIDED);
                                    }
                                    html_princ(possibility_fancy_name);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt144);
                            }
                        }
                        index = add(index, ONE_INTEGER);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Output HTML for setting PARAMETER inside a form.
     * When DESCRIPTION? is non-nil, the full documentation for parameter is included, if any.
     * If there is a text input, ENTRY-SIZE will be used as its size.
     */
    @LispMethod(comment = "Output HTML for setting PARAMETER inside a form.\r\nWhen DESCRIPTION? is non-nil, the full documentation for parameter is included, if any.\r\nIf there is a text input, ENTRY-SIZE will be used as its size.\nOutput HTML for setting PARAMETER inside a form.\nWhen DESCRIPTION? is non-nil, the full documentation for parameter is included, if any.\nIf there is a text input, ENTRY-SIZE will be used as its size.")
    public static SubLObject html_control_parameter_chooser(final SubLObject parameter, SubLObject descriptionP) {
        if (descriptionP == UNPROVIDED) {
            descriptionP = NIL;
        }
        assert NIL != symbolp(parameter) : "! symbolp(parameter) " + ("Types.symbolp(parameter) " + "CommonSymbols.NIL != Types.symbolp(parameter) ") + parameter;
        SubLObject fancy_name = get(parameter, $FANCY_NAME, UNPROVIDED);
        final SubLObject description = get(parameter, $DESCRIPTION, UNPROVIDED);
        SubLObject settings_spec = get(parameter, $SETTINGS_SPEC, UNPROVIDED);
        if (NIL != boundp(parameter)) {
            if (NIL == fancy_name) {
                fancy_name = symbol_name(parameter);
            }
            if (NIL == settings_spec) {
                settings_spec = $list161;
            }
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ(fancy_name);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            if (NIL != descriptionP) {
                html_newline(UNPROVIDED);
                html_princ_doc_string(description, UNPROVIDED);
            }
            final SubLObject entry_name = html_control_parameter_entry_name(parameter);
            final SubLObject radio_name = html_control_parameter_radio_name(parameter);
            final SubLObject some_entryP = find($ENTRY, settings_spec, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            final SubLObject current_value = eval(parameter);
            final SubLObject total_settings = length(settings_spec);
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = settings_spec;
            SubLObject setting_spec = NIL;
            setting_spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                SubLObject current;
                final SubLObject datum = current = setting_spec;
                SubLObject type = NIL;
                SubLObject datum_$38 = NIL;
                SubLObject possibility_fancy_name = NIL;
                destructuring_bind_must_consp(current, datum, $list164);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list164);
                datum_$38 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list164);
                possibility_fancy_name = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject radio_checkedP = NIL;
                    SubLObject entry_default = NIL;
                    if (total_settings.numE(ONE_INTEGER)) {
                        radio_checkedP = T;
                    } else
                        if (type == $ENTRY) {
                            radio_checkedP = funcall(datum_$38, current_value);
                        } else {
                            radio_checkedP = equal(current_value, datum_$38);
                        }

                    if ((NIL != radio_checkedP) && (type == $ENTRY)) {
                        entry_default = princ_to_string(current_value);
                    }
                    if (total_settings.numE(ONE_INTEGER)) {
                        html_hidden_input(radio_name, index, UNPROVIDED);
                    } else {
                        if (NIL != some_entryP) {
                            if (type == $ENTRY) {
                                html_script_utilities.html_focus_radio_input(radio_name, entry_name, index, radio_checkedP, UNPROVIDED);
                            } else {
                                html_script_utilities.html_clear_radio_input(radio_name, entry_name, index, radio_checkedP, UNPROVIDED);
                            }
                        } else {
                            html_radio_input(radio_name, index, radio_checkedP, UNPROVIDED);
                        }
                        html_indent(UNPROVIDED);
                    }
                    if (type == $ENTRY) {
                        SubLObject entry_format = html_macros.html_parameter_entry_format(parameter);
                        if (NIL == entry_format) {
                            entry_format = $list165;
                        }
                        SubLObject current_$40;
                        final SubLObject datum_$39 = current_$40 = entry_format;
                        SubLObject type_$41 = NIL;
                        SubLObject size = NIL;
                        destructuring_bind_must_consp(current_$40, datum_$39, $list166);
                        type_$41 = current_$40.first();
                        current_$40 = current_$40.rest();
                        destructuring_bind_must_consp(current_$40, datum_$39, $list166);
                        size = current_$40.first();
                        current_$40 = current_$40.rest();
                        if (NIL == current_$40) {
                            final SubLObject pcase_var = type_$41;
                            if (pcase_var.eql($TEXT)) {
                                html_text_input(entry_name, entry_default, size);
                            } else {
                                html_text_input(entry_name, entry_default, UNPROVIDED);
                            }
                        } else {
                            cdestructuring_bind_error(datum_$39, $list166);
                        }
                        html_indent(UNPROVIDED);
                    }
                    html_princ(possibility_fancy_name);
                } else {
                    cdestructuring_bind_error(datum, $list164);
                }
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                setting_spec = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Extract the new specified value for PARAMETER from ARGS.
     * If the specification was invalid, a second value returned is
     * an error message describing the problem.
     */
    @LispMethod(comment = "Extract the new specified value for PARAMETER from ARGS.\r\nIf the specification was invalid, a second value returned is\r\nan error message describing the problem.\nExtract the new specified value for PARAMETER from ARGS.\nIf the specification was invalid, a second value returned is\nan error message describing the problem.")
    public static final SubLObject html_extract_control_parameter_value_alt(SubLObject parameter, SubLObject args) {
        SubLTrampolineFile.checkType(parameter, SYMBOLP);
        {
            SubLObject fancy_name = get(parameter, $FANCY_NAME, UNPROVIDED);
            SubLObject settings_spec = get(parameter, $SETTINGS_SPEC, UNPROVIDED);
            SubLObject new_value = NIL;
            SubLObject invalid_explanation = NIL;
            if (((NIL != fancy_name) && (NIL != settings_spec)) && (NIL != boundp(parameter))) {
                {
                    SubLObject radio_name = html_control_parameter_radio_name(parameter);
                    SubLObject radio_choice = html_extract_input(radio_name, args);
                    if (NIL != radio_choice) {
                        {
                            SubLObject setting_spec = nth(read_from_string_ignoring_errors(radio_choice, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), settings_spec);
                            SubLObject datum = setting_spec;
                            SubLObject current = datum;
                            SubLObject type = NIL;
                            SubLObject datum_40 = NIL;
                            SubLObject possibility_fancy_name = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt144);
                            type = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt144);
                            datum_40 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt144);
                            possibility_fancy_name = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (type == $ENTRY) {
                                    {
                                        SubLObject entry_name = html_control_parameter_entry_name(parameter);
                                        SubLObject entry_string = html_extract_input(entry_name, args);
                                        if (NIL != entry_string) {
                                            if (NIL != funcall(datum_40, entry_string)) {
                                                new_value = entry_string;
                                            } else {
                                                {
                                                    SubLObject value = read_from_string_ignoring_errors(entry_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != funcall(datum_40, value)) {
                                                        new_value = value;
                                                    } else {
                                                        invalid_explanation = format(NIL, $str_alt148$The_value_entered_for___A__was_no, fancy_name);
                                                    }
                                                }
                                            }
                                        } else {
                                            invalid_explanation = format(NIL, $str_alt149$No_value_was_entered_for___A__, fancy_name);
                                        }
                                    }
                                } else {
                                    new_value = datum_40;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt144);
                            }
                        }
                    } else {
                        invalid_explanation = format(NIL, $str_alt150$No_choice_was_made_for___A__, fancy_name);
                    }
                }
            } else {
                invalid_explanation = format(NIL, $str_alt151$_S_is_not_a_declared_control_para, parameter);
            }
            return values(new_value, invalid_explanation);
        }
    }

    /**
     * Extract the new specified value for PARAMETER from ARGS.
     * If the specification was invalid, a second value returned is
     * an error message describing the problem.
     */
    @LispMethod(comment = "Extract the new specified value for PARAMETER from ARGS.\r\nIf the specification was invalid, a second value returned is\r\nan error message describing the problem.\nExtract the new specified value for PARAMETER from ARGS.\nIf the specification was invalid, a second value returned is\nan error message describing the problem.")
    public static SubLObject html_extract_control_parameter_value(final SubLObject parameter, final SubLObject args) {
        assert NIL != symbolp(parameter) : "! symbolp(parameter) " + ("Types.symbolp(parameter) " + "CommonSymbols.NIL != Types.symbolp(parameter) ") + parameter;
        final SubLObject fancy_name = get(parameter, $FANCY_NAME, UNPROVIDED);
        final SubLObject settings_spec = get(parameter, $SETTINGS_SPEC, UNPROVIDED);
        SubLObject new_value = NIL;
        SubLObject invalid_explanation = NIL;
        if (((NIL != fancy_name) && (NIL != settings_spec)) && (NIL != boundp(parameter))) {
            final SubLObject radio_name = html_control_parameter_radio_name(parameter);
            final SubLObject radio_choice = html_extract_input(radio_name, args);
            if (NIL != radio_choice) {
                final SubLObject setting_spec = nth(read_from_string_ignoring_errors(radio_choice, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), settings_spec);
                SubLObject current;
                final SubLObject datum = current = setting_spec;
                SubLObject type = NIL;
                SubLObject datum_$42 = NIL;
                SubLObject possibility_fancy_name = NIL;
                destructuring_bind_must_consp(current, datum, $list164);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list164);
                datum_$42 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list164);
                possibility_fancy_name = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (type == $ENTRY) {
                        final SubLObject entry_name = html_control_parameter_entry_name(parameter);
                        final SubLObject entry_string = html_extract_input(entry_name, args);
                        if (NIL != entry_string) {
                            if (NIL != funcall(datum_$42, entry_string)) {
                                new_value = entry_string;
                            } else {
                                final SubLObject value = read_from_string_ignoring_errors(entry_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                if (NIL != funcall(datum_$42, value)) {
                                    new_value = value;
                                } else {
                                    invalid_explanation = cconcatenate($str168$The_value_entered_for__, new SubLObject[]{ format_nil.format_nil_a_no_copy(fancy_name), $str169$__was_not_valid_ });
                                }
                            }
                        } else {
                            invalid_explanation = cconcatenate($str170$No_value_was_entered_for__, new SubLObject[]{ format_nil.format_nil_a_no_copy(fancy_name), $str171$__ });
                        }
                    } else {
                        new_value = datum_$42;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list164);
                }
            } else {
                invalid_explanation = cconcatenate($str172$No_choice_was_made_for__, new SubLObject[]{ format_nil.format_nil_a_no_copy(fancy_name), $str171$__ });
            }
        } else {
            invalid_explanation = cconcatenate(format_nil.format_nil_s_no_copy(parameter), $str173$_is_not_a_declared_control_parame);
        }
        return values(new_value, invalid_explanation);
    }

    /**
     * Extract and set the new value for PARAMETER from ARGS.
     * Return T iff this was successfully done.
     * Otherwise, cb-error explains the problem
     */
    @LispMethod(comment = "Extract and set the new value for PARAMETER from ARGS.\r\nReturn T iff this was successfully done.\r\nOtherwise, cb-error explains the problem\nExtract and set the new value for PARAMETER from ARGS.\nReturn T iff this was successfully done.\nOtherwise, cb-error explains the problem")
    public static final SubLObject html_set_control_parameter_alt(SubLObject parameter, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = html_extract_control_parameter_value(parameter, args);
                SubLObject error_message = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != error_message) {
                    cb_error(error_message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                eval(list(CSETQ, parameter, list(QUOTE, value)));
                return T;
            }
        }
    }

    /**
     * Extract and set the new value for PARAMETER from ARGS.
     * Return T iff this was successfully done.
     * Otherwise, cb-error explains the problem
     */
    @LispMethod(comment = "Extract and set the new value for PARAMETER from ARGS.\r\nReturn T iff this was successfully done.\r\nOtherwise, cb-error explains the problem\nExtract and set the new value for PARAMETER from ARGS.\nReturn T iff this was successfully done.\nOtherwise, cb-error explains the problem")
    public static SubLObject html_set_control_parameter(final SubLObject parameter, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = html_extract_control_parameter_value(parameter, args);
        final SubLObject error_message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error_message) {
            cb_error(error_message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        eval(list(CSETQ, parameter, list(QUOTE, value)));
        return T;
    }

    public static final SubLObject html_control_parameter_entry_name_alt(SubLObject parameter) {
        {
            SubLObject name = symbol_name(parameter);
            return format(NIL, $str_alt154$entry__A, name);
        }
    }

    public static SubLObject html_control_parameter_entry_name(final SubLObject parameter) {
        final SubLObject name = symbol_name(parameter);
        return cconcatenate($str176$entry_, format_nil.format_nil_a_no_copy(name));
    }

    public static final SubLObject html_control_parameter_radio_name_alt(SubLObject parameter) {
        {
            SubLObject name = symbol_name(parameter);
            return format(NIL, $str_alt155$radio__A, name);
        }
    }

    public static SubLObject html_control_parameter_radio_name(final SubLObject parameter) {
        final SubLObject name = symbol_name(parameter);
        return cconcatenate($str177$radio_, format_nil.format_nil_a_no_copy(name));
    }

    /**
     *
     *
     * @param SELECTED-OPTION-CONTENT:
     * 		if this is equal to one of OPTION-CONTENTS, then it will be the
     * 		initially-selected element of the list
     * @param OPTION-CONTENTS
     * 		listp: the contents of the html OPTION elements.  These are displayed as the items in the list.
     * @param OPTION-VALUES
     * 		listp: the VALUE attributes of the html OPTION elements.  These are used when submitting the form's
     * 		content.  This is optional; by default, the element's content doubles as its value.
     */
    @LispMethod(comment = "@param SELECTED-OPTION-CONTENT:\r\n\t\tif this is equal to one of OPTION-CONTENTS, then it will be the\r\n\t\tinitially-selected element of the list\r\n@param OPTION-CONTENTS\r\n\t\tlistp: the contents of the html OPTION elements.  These are displayed as the items in the list.\r\n@param OPTION-VALUES\r\n\t\tlistp: the VALUE attributes of the html OPTION elements.  These are used when submitting the form\'s\r\n\t\tcontent.  This is optional; by default, the element\'s content doubles as its value.")
    public static final SubLObject html_select_from_list_alt(SubLObject name, SubLObject selected_option_content, SubLObject option_contents, SubLObject option_values) {
        if (option_values == UNPROVIDED) {
            option_values = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_select_head$.getGlobalValue());
            html_markup(html_macros.$html_select_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(name);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject option_content = NIL;
                        SubLObject option_content_41 = NIL;
                        SubLObject option_value = NIL;
                        SubLObject option_value_42 = NIL;
                        for (option_content = option_contents, option_content_41 = option_content.first(), option_value = option_values, option_value_42 = option_value.first(); !((NIL == option_value) && (NIL == option_content)); option_content = option_content.rest() , option_content_41 = option_content.first() , option_value = option_value.rest() , option_value_42 = option_value.first()) {
                            {
                                SubLObject selectedP = equal(option_content_41, selected_option_content);
                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                if (NIL != selectedP) {
                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                }
                                if (NIL != option_value_42) {
                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(option_value_42);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(option_content_41);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                    }
                                }
                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_select_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     *
     *
     * @param SELECTED-OPTION-CONTENT:
     * 		if this is equal to one of OPTION-CONTENTS, then it will be the
     * 		initially-selected element of the list
     * @param OPTION-CONTENTS
     * 		listp: the contents of the html OPTION elements.  These are displayed as the items in the list.
     * @param OPTION-VALUES
     * 		listp: the VALUE attributes of the html OPTION elements.  These are used when submitting the form's
     * 		content.  This is optional; by default, the element's content doubles as its value.
     */
    @LispMethod(comment = "@param SELECTED-OPTION-CONTENT:\r\n\t\tif this is equal to one of OPTION-CONTENTS, then it will be the\r\n\t\tinitially-selected element of the list\r\n@param OPTION-CONTENTS\r\n\t\tlistp: the contents of the html OPTION elements.  These are displayed as the items in the list.\r\n@param OPTION-VALUES\r\n\t\tlistp: the VALUE attributes of the html OPTION elements.  These are used when submitting the form\'s\r\n\t\tcontent.  This is optional; by default, the element\'s content doubles as its value.")
    public static SubLObject html_select_from_list(final SubLObject name, final SubLObject selected_option_content, final SubLObject option_contents, SubLObject option_values) {
        if (option_values == UNPROVIDED) {
            option_values = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_select_head$.getGlobalValue());
        html_markup(html_macros.$html_select_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(name);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject option_content = NIL;
            SubLObject option_content_$43 = NIL;
            SubLObject option_value = NIL;
            SubLObject option_value_$44 = NIL;
            option_content = option_contents;
            option_content_$43 = option_content.first();
            option_value = option_values;
            option_value_$44 = option_value.first();
            while ((NIL != option_value) || (NIL != option_content)) {
                final SubLObject selectedP = equal(option_content_$43, selected_option_content);
                html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (NIL != selectedP) {
                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                }
                if (NIL != option_value_$44) {
                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(option_value_$44);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(option_content_$43);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                option_content = option_content.rest();
                option_content_$43 = option_content.first();
                option_value = option_value.rest();
                option_value_$44 = option_value.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_select_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Used internally by HTML-EXTRACT-INPUT
     */
    @LispMethod(comment = "Used internally by HTML-EXTRACT-INPUT")
    public static final SubLObject matching_html_field_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(v_object.isCons() && v_object.first().equalp($html_extract_field_name$.getDynamicValue(thread)));
        }
    }

    /**
     * Used internally by HTML-EXTRACT-INPUT
     */
    @LispMethod(comment = "Used internally by HTML-EXTRACT-INPUT")
    public static SubLObject matching_html_field(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(v_object.isCons() && v_object.first().equalp($html_extract_field_name$.getDynamicValue(thread)));
    }

    /**
     * Used internally by HTML-EXTRACT-INPUT
     */
    @LispMethod(comment = "Used internally by HTML-EXTRACT-INPUT")
    public static final SubLObject matching_html_button_field_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(v_object.isCons() && second(v_object).equalp($html_extract_field_name$.getDynamicValue(thread)));
        }
    }

    /**
     * Used internally by HTML-EXTRACT-INPUT
     */
    @LispMethod(comment = "Used internally by HTML-EXTRACT-INPUT")
    public static SubLObject matching_html_button_field(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(v_object.isCons() && second(v_object).equalp($html_extract_field_name$.getDynamicValue(thread)));
    }

    /**
     * Extract the value for FIELD-NAME from HTML argument list ARGS
     */
    @LispMethod(comment = "Extract the value for FIELD-NAME from HTML argument list ARGS")
    public static final SubLObject html_extract_input_alt(SubLObject field_name, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(field_name, STRINGP);
            SubLTrampolineFile.checkType(args, LISTP);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
                    try {
                        $html_extract_field_name$.bind(field_name, thread);
                        ans = find_if(symbol_function(MATCHING_HTML_FIELD), args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $html_extract_field_name$.rebind(_prev_bind_0, thread);
                    }
                }
                return second(ans);
            }
        }
    }

    /**
     * Extract the value for FIELD-NAME from HTML argument list ARGS
     */
    @LispMethod(comment = "Extract the value for FIELD-NAME from HTML argument list ARGS")
    public static SubLObject html_extract_input(final SubLObject field_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(field_name) : "! stringp(field_name) " + ("Types.stringp(field_name) " + "CommonSymbols.NIL != Types.stringp(field_name) ") + field_name;
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
        try {
            $html_extract_field_name$.bind(field_name, thread);
            ans = find_if(symbol_function(MATCHING_HTML_FIELD), args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $html_extract_field_name$.rebind(_prev_bind_0, thread);
        }
        return second(ans);
    }

    /**
     * Extracts the list of all values for FIELD-NAME from the HTML argument list ARGS.
     */
    @LispMethod(comment = "Extracts the list of all values for FIELD-NAME from the HTML argument list ARGS.")
    public static final SubLObject html_extract_input_values_alt(SubLObject field_name, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(field_name, STRINGP);
            SubLTrampolineFile.checkType(args, LISTP);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
                    try {
                        $html_extract_field_name$.bind(field_name, thread);
                        {
                            SubLObject cdolist_list_var = args;
                            SubLObject arg = NIL;
                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                if (NIL != matching_html_field(arg)) {
                                    ans = cons(second(arg), ans);
                                }
                            }
                        }
                    } finally {
                        $html_extract_field_name$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(ans);
            }
        }
    }

    /**
     * Extracts the list of all values for FIELD-NAME from the HTML argument list ARGS.
     */
    @LispMethod(comment = "Extracts the list of all values for FIELD-NAME from the HTML argument list ARGS.")
    public static SubLObject html_extract_input_values(final SubLObject field_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(field_name) : "! stringp(field_name) " + ("Types.stringp(field_name) " + "CommonSymbols.NIL != Types.stringp(field_name) ") + field_name;
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
        try {
            $html_extract_field_name$.bind(field_name, thread);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != matching_html_field(arg)) {
                    ans = cons(second(arg), ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        } finally {
            $html_extract_field_name$.rebind(_prev_bind_0, thread);
        }
        return nreverse(ans);
    }

    /**
     *
     *
     * @return string or symbol ; the value of FIELD-NAME from HTML-ARGS, defaulting to DEFAULT
     * @unknown tom
     */
    @LispMethod(comment = "@return string or symbol ; the value of FIELD-NAME from HTML-ARGS, defaulting to DEFAULT\r\n@unknown tom")
    public static final SubLObject html_extract_value_alt(SubLObject field_name, SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject result = html_extract_input(field_name, html_args);
            if (NIL == result) {
                result = v_default;
            }
            return result;
        }
    }

    /**
     *
     *
     * @return string or symbol ; the value of FIELD-NAME from HTML-ARGS, defaulting to DEFAULT
     * @unknown tom
     */
    @LispMethod(comment = "@return string or symbol ; the value of FIELD-NAME from HTML-ARGS, defaulting to DEFAULT\r\n@unknown tom")
    public static SubLObject html_extract_value(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLObject result = html_extract_input(field_name, html_args);
        if (NIL == result) {
            result = v_default;
        }
        return result;
    }

    public static SubLObject html_extract_integer(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = html_extract_value(field_name, html_args, NIL);
        SubLObject v_int = v_default;
        if (NIL != find_if(DIGIT_CHAR_P, str, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        v_int = parse_integer(str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        }
        return v_int;
    }

    public static SubLObject html_extract_date(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = html_extract_value(field_name, html_args, v_default);
        SubLObject dates = v_default;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    dates = date_utilities.parse_date_from_string_fast(str, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        return dates;
    }

    public static SubLObject html_extract_keyword(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = html_extract_value(field_name, html_args, v_default);
        SubLObject kwd = v_default;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    kwd = make_keyword(Strings.string_upcase(str, UNPROVIDED, UNPROVIDED));
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
        return kwd;
    }

    /**
     *
     *
     * @return string ; version of @xref html-extract-value defaulting to ""
     */
    @LispMethod(comment = "@return string ; version of @xref html-extract-value defaulting to \"\"")
    public static final SubLObject html_extract_string_alt(SubLObject field_name, SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $str_alt37$;
        }
        return html_extract_value(field_name, html_args, v_default);
    }

    /**
     *
     *
     * @return string ; version of @xref html-extract-value defaulting to ""
     */
    @LispMethod(comment = "@return string ; version of @xref html-extract-value defaulting to \"\"")
    public static SubLObject html_extract_string(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $str47$;
        }
        return html_extract_value(field_name, html_args, v_default);
    }

    /**
     *
     *
     * @return boolean ; boolean version version of @xref html-extract-value
     */
    @LispMethod(comment = "@return boolean ; boolean version version of @xref html-extract-value")
    public static final SubLObject html_extract_boolean_alt(SubLObject field_name, SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return list_utilities.sublisp_boolean(html_extract_value(field_name, html_args, v_default));
    }

    /**
     *
     *
     * @return boolean ; boolean version version of @xref html-extract-value
     */
    @LispMethod(comment = "@return boolean ; boolean version version of @xref html-extract-value")
    public static SubLObject html_extract_boolean(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return list_utilities.sublisp_boolean(html_extract_value(field_name, html_args, v_default));
    }

    public static SubLObject html_extract_sexpr(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return html_extract_sexpr_int(field_name, html_args, v_default, NIL);
    }

    public static SubLObject html_extract_cyclified_sexpr(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if ($str47$.equal(html_extract_input(field_name, html_args))) {
            return v_default;
        }
        return html_extract_sexpr_int(field_name, html_args, v_default, T);
    }

    public static SubLObject html_extract_sexpr_int(final SubLObject field_name, final SubLObject html_args, final SubLObject v_default, final SubLObject cyclifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $read_eval$.currentBinding(thread);
        try {
            $read_eval$.bind(NIL, thread);
            final SubLObject value = html_extract_input(field_name, html_args);
            final SubLObject clean_value = ((NIL != value) && (NIL != cyclifyP)) ? string_utilities.cyclify_string(value) : value;
            final SubLObject sexpr = (NIL != value) ? read_from_string_ignoring_errors(clean_value, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED) : v_default;
            return sexpr;
        } finally {
            $read_eval$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     *
     *
     * @return the value of clicking on a submit button in a form
     */
    @LispMethod(comment = "@return the value of clicking on a submit button in a form")
    public static final SubLObject html_extract_button_value_alt(SubLObject button_name, SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(button_name, STRINGP);
            SubLTrampolineFile.checkType(html_args, LISTP);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
                    try {
                        $html_extract_field_name$.bind(button_name, thread);
                        ans = find_if(symbol_function(MATCHING_HTML_BUTTON_FIELD), html_args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $html_extract_field_name$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans.first();
            }
        }
    }

    /**
     *
     *
     * @return the value of clicking on a submit button in a form
     */
    @LispMethod(comment = "@return the value of clicking on a submit button in a form")
    public static SubLObject html_extract_button_value(final SubLObject button_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(button_name) : "! stringp(button_name) " + ("Types.stringp(button_name) " + "CommonSymbols.NIL != Types.stringp(button_name) ") + button_name;
        assert NIL != listp(html_args) : "! listp(html_args) " + ("Types.listp(html_args) " + "CommonSymbols.NIL != Types.listp(html_args) ") + html_args;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding(thread);
        try {
            $html_extract_field_name$.bind(button_name, thread);
            ans = find_if(symbol_function(MATCHING_HTML_BUTTON_FIELD), html_args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $html_extract_field_name$.rebind(_prev_bind_0, thread);
        }
        return ans.first();
    }

    public static final SubLObject decode_html_language_abbreviation_alt(SubLObject lang_value) {
        {
            SubLObject lang = NIL;
            if (lang_value.equalp($$$en)) {
                lang = $$EnglishLanguage;
            } else {
                if (lang_value.equalp($str_alt161$en_gb)) {
                    lang = $$BritishEnglishDialect;
                } else {
                    if (lang_value.equalp($$$fr)) {
                        lang = $$FrenchLanguage;
                    } else {
                        if (lang_value.equalp($$$de)) {
                            lang = $$GermanLanguage;
                        }
                    }
                }
            }
            return lang;
        }
    }

    public static SubLObject decode_html_language_abbreviation(final SubLObject lang_value) {
        SubLObject lang = NIL;
        if (lang_value.equalp($$$en)) {
            lang = $$EnglishLanguage;
        } else
            if (lang_value.equalp($str188$en_gb)) {
                lang = $$BritishEnglishDialect;
            } else
                if (lang_value.equalp($$$fr)) {
                    lang = $$FrenchLanguage;
                } else
                    if (lang_value.equalp($$$de)) {
                        lang = $$GermanLanguage;
                    } else {
                        lang = kb_mapping_utilities.fpred_value_in_any_mt(lang_value, $$languageCodeDigraph, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    }



        return lang;
    }

    /**
     * Output the syntax for an HTML escape glyph.
     */
    @LispMethod(comment = "Output the syntax for an HTML escape glyph.")
    public static final SubLObject html_glyph_alt(SubLObject glyph, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(glyph, SYMBOLP);
        {
            SubLObject markup = html_glyph_markup(glyph);
            if (markup.isString()) {
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                        html_markup(markup);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Output the syntax for an HTML escape glyph.
     */
    @LispMethod(comment = "Output the syntax for an HTML escape glyph.")
    public static SubLObject html_glyph(final SubLObject glyph, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        assert NIL != symbolp(glyph) : "! symbolp(glyph) " + ("Types.symbolp(glyph) " + "CommonSymbols.NIL != Types.symbolp(glyph) ") + glyph;
        final SubLObject markup = html_glyph_markup(glyph);
        if (markup.isString()) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                html_markup(markup);
            }
        }
        return NIL;
    }

    public static final SubLObject html_glyph_markup_alt(SubLObject glyph) {
        return get(glyph, $HTML_GLYPH, NIL);
    }

    public static SubLObject html_glyph_markup(final SubLObject glyph) {
        return get(glyph, $HTML_GLYPH, NIL);
    }

    /**
     * Declare that MARKUP is the HTML syntax for the escape GLYPH
     */
    @LispMethod(comment = "Declare that MARKUP is the HTML syntax for the escape GLYPH")
    public static final SubLObject html_declare_glyph_alt(SubLObject glyph, SubLObject markup) {
        SubLTrampolineFile.checkType(glyph, SYMBOLP);
        SubLTrampolineFile.checkType(markup, STRINGP);
        put(glyph, $HTML_GLYPH, markup);
        return glyph;
    }

    /**
     * Declare that MARKUP is the HTML syntax for the escape GLYPH
     */
    @LispMethod(comment = "Declare that MARKUP is the HTML syntax for the escape GLYPH")
    public static SubLObject html_declare_glyph(final SubLObject glyph, final SubLObject markup) {
        assert NIL != symbolp(glyph) : "! symbolp(glyph) " + ("Types.symbolp(glyph) " + "CommonSymbols.NIL != Types.symbolp(glyph) ") + glyph;
        assert NIL != stringp(markup) : "! stringp(markup) " + ("Types.stringp(markup) " + "CommonSymbols.NIL != Types.stringp(markup) ") + markup;
        put(glyph, $HTML_GLYPH, markup);
        return glyph;
    }

    /**
     * Output the syntax for an HTML unicode escape glyph.  This can be used to output a unicode character without defining a glyph for it.
     */
    @LispMethod(comment = "Output the syntax for an HTML unicode escape glyph.  This can be used to output a unicode character without defining a glyph for it.")
    public static final SubLObject html_unicode_char_alt(SubLObject unicode_identifier, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(unicode_identifier, HEX_CHAR_STRING_P);
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                html_markup(cconcatenate($str_alt623$__, new SubLObject[]{ unicode_identifier, $str_alt4$_ }));
            }
        }
        return NIL;
    }

    /**
     * Output the syntax for an HTML unicode escape glyph.  This can be used to output a unicode character without defining a glyph for it.
     */
    @LispMethod(comment = "Output the syntax for an HTML unicode escape glyph.  This can be used to output a unicode character without defining a glyph for it.")
    public static SubLObject html_unicode_char(final SubLObject unicode_identifier, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        assert NIL != string_utilities.hex_char_string_p(unicode_identifier) : "! string_utilities.hex_char_string_p(unicode_identifier) " + ("string_utilities.hex_char_string_p(unicode_identifier) " + "CommonSymbols.NIL != string_utilities.hex_char_string_p(unicode_identifier) ") + unicode_identifier;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            html_markup(cconcatenate($str668$__, new SubLObject[]{ unicode_identifier, $str8$_ }));
        }
        return NIL;
    }

    /**
     * Create a list box filled with CHOICES having SIZE entries visible, defaulting to the item at CHOICE-OFFSET and optionally returning the items in VALUES
     */
    @LispMethod(comment = "Create a list box filled with CHOICES having SIZE entries visible, defaulting to the item at CHOICE-OFFSET and optionally returning the items in VALUES")
    public static final SubLObject html_create_listbox_alt(SubLObject field_name, SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_select_head$.getGlobalValue());
            html_markup(html_macros.$html_select_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(field_name);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != size) {
                html_markup(html_macros.$html_select_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(size);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_indent(ONE_INTEGER);
            html_markup(script);
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject list_var = NIL;
                        SubLObject item = NIL;
                        SubLObject i = NIL;
                        for (list_var = choices, item = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , i = add(ONE_INTEGER, i)) {
                            {
                                SubLObject is_selectedP = eql(i, choice_offset);
                                SubLObject value = (NIL != list_utilities.lengthG(values, i, UNPROVIDED)) ? ((SubLObject) (elt(values, i))) : NIL;
                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                if (NIL != is_selectedP) {
                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                }
                                if (NIL != value) {
                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(value);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(item);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                    }
                                }
                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_select_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * Create a list box filled with CHOICES having SIZE entries visible, defaulting to the item at CHOICE-OFFSET and optionally returning the items in VALUES
     */
    @LispMethod(comment = "Create a list box filled with CHOICES having SIZE entries visible, defaulting to the item at CHOICE-OFFSET and optionally returning the items in VALUES")
    public static SubLObject html_create_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_select_head$.getGlobalValue());
        html_markup(html_macros.$html_select_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(field_name);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != size) {
            html_markup(html_macros.$html_select_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_space, UNPROVIDED);
        html_markup(script);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject list_var = NIL;
            SubLObject item = NIL;
            SubLObject i = NIL;
            list_var = choices;
            item = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , i = add(ONE_INTEGER, i)) {
                final SubLObject is_selectedP = eql(i, choice_offset);
                final SubLObject value = (NIL != list_utilities.lengthG(values, i, UNPROVIDED)) ? elt(values, i) : NIL;
                html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (NIL != is_selectedP) {
                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                }
                if (NIL != value) {
                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(value);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(item);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_markup(html_macros.$html_option_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_select_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Create the form FORM-NAME with radio button input fields for each element of CHOICES, defaulting to the item at CHOICE-OFFSET and optionally returning the items in VALUES.
     *
     * @unknown The choices will be displayed on separate lines unless SAME-LINE? specified.
     * @unknown If any of the choices is an empty string (or NIL) then no radio button will be displayed and a gap will be displayed
     */
    @LispMethod(comment = "Create the form FORM-NAME with radio button input fields for each element of CHOICES, defaulting to the item at CHOICE-OFFSET and optionally returning the items in VALUES.\r\n\r\n@unknown The choices will be displayed on separate lines unless SAME-LINE? specified.\r\n@unknown If any of the choices is an empty string (or NIL) then no radio button will be displayed and a gap will be displayed")
    public static final SubLObject html_create_radiobox_form_alt(SubLObject form_name, SubLObject choices, SubLObject values, SubLObject choice_offset, SubLObject same_lineP) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        if (same_lineP == UNPROVIDED) {
            same_lineP = NIL;
        }
        {
            SubLObject list_var = NIL;
            SubLObject item = NIL;
            SubLObject i = NIL;
            for (list_var = choices, item = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject is_selectedP = eql(i, choice_offset);
                    SubLObject user_value = elt(values, i);
                    SubLObject form_value = (NIL != user_value) ? ((SubLObject) (user_value)) : item;
                    if (NIL != string_utilities.non_empty_stringP(item)) {
                        html_radio_input(form_name, form_value, is_selectedP);
                        html_indent(UNPROVIDED);
                        html_princ(item);
                    }
                    if (NIL != same_lineP) {
                        html_indent(UNPROVIDED);
                    } else {
                        html_newline(UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Create the form FORM-NAME with radio button input fields for each element of CHOICES, defaulting to the item at CHOICE-OFFSET and optionally returning the items in VALUES.
     *
     * @unknown The choices will be displayed on separate lines unless SAME-LINE? specified.
     * @unknown If any of the choices is an empty string (or NIL) then no radio button will be displayed and a gap will be displayed
     */
    @LispMethod(comment = "Create the form FORM-NAME with radio button input fields for each element of CHOICES, defaulting to the item at CHOICE-OFFSET and optionally returning the items in VALUES.\r\n\r\n@unknown The choices will be displayed on separate lines unless SAME-LINE? specified.\r\n@unknown If any of the choices is an empty string (or NIL) then no radio button will be displayed and a gap will be displayed")
    public static SubLObject html_create_radiobox_form(final SubLObject form_name, final SubLObject choices, SubLObject values, SubLObject choice_offset, SubLObject same_lineP) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        if (same_lineP == UNPROVIDED) {
            same_lineP = NIL;
        }
        SubLObject list_var = NIL;
        SubLObject item = NIL;
        SubLObject i = NIL;
        list_var = choices;
        item = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject is_selectedP = eql(i, choice_offset);
            final SubLObject user_value = elt(values, i);
            final SubLObject form_value = (NIL != user_value) ? user_value : item;
            if (NIL != string_utilities.non_empty_stringP(item)) {
                html_radio_input(form_name, form_value, is_selectedP, UNPROVIDED);
                html_indent(UNPROVIDED);
                html_princ(item);
            }
            if (NIL != same_lineP) {
                html_indent(UNPROVIDED);
            } else {
                html_newline(UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Create a list box filled with CHOICES having SIZE entries visible, defaulting to the items at CHOICE-OFFSETS and optionally returning the items in VALUES
     */
    @LispMethod(comment = "Create a list box filled with CHOICES having SIZE entries visible, defaulting to the items at CHOICE-OFFSETS and optionally returning the items in VALUES")
    public static final SubLObject html_create_multiple_selection_listbox_alt(SubLObject field_name, SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offsets == UNPROVIDED) {
            choice_offsets = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_select_head$.getGlobalValue());
            html_markup(html_macros.$html_select_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(field_name);
            html_char(CHAR_quotation, UNPROVIDED);
            html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
            if (NIL != size) {
                html_markup(html_macros.$html_select_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(size);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject list_var = NIL;
                        SubLObject item = NIL;
                        SubLObject i = NIL;
                        for (list_var = choices, item = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , i = add(ONE_INTEGER, i)) {
                            {
                                SubLObject is_selectedP = member(i, choice_offsets, symbol_function(EQL), UNPROVIDED);
                                SubLObject value = elt(values, i);
                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                if (NIL != is_selectedP) {
                                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                }
                                if (NIL != value) {
                                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(value);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(item);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                    }
                                }
                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_select_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * Create a list box filled with CHOICES having SIZE entries visible, defaulting to the items at CHOICE-OFFSETS and optionally returning the items in VALUES
     */
    @LispMethod(comment = "Create a list box filled with CHOICES having SIZE entries visible, defaulting to the items at CHOICE-OFFSETS and optionally returning the items in VALUES")
    public static SubLObject html_create_multiple_selection_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offsets == UNPROVIDED) {
            choice_offsets = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_select_head$.getGlobalValue());
        html_markup(html_macros.$html_select_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(field_name);
        html_char(CHAR_quotation, UNPROVIDED);
        html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
        if (NIL != size) {
            html_markup(html_macros.$html_select_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject list_var = NIL;
            SubLObject item = NIL;
            SubLObject i = NIL;
            list_var = choices;
            item = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , i = add(ONE_INTEGER, i)) {
                final SubLObject is_selectedP = member(i, choice_offsets, symbol_function(EQL), UNPROVIDED);
                final SubLObject value = elt(values, i);
                html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (NIL != is_selectedP) {
                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                }
                if (NIL != value) {
                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(value);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(item);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_markup(html_macros.$html_option_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_select_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Create a dropdown list box labelled FIELD-NAME with CHOICES, optionally returning items from VALUES and with the default choice set to item at CHOICE-OFFSET
     */
    @LispMethod(comment = "Create a dropdown list box labelled FIELD-NAME with CHOICES, optionally returning items from VALUES and with the default choice set to item at CHOICE-OFFSET")
    public static final SubLObject html_create_dropdown_list_alt(SubLObject field_name, SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        return html_create_listbox(field_name, choices, values, size, choice_offset, script);
    }

    /**
     * Create a dropdown list box labelled FIELD-NAME with CHOICES, optionally returning items from VALUES and with the default choice set to item at CHOICE-OFFSET
     */
    @LispMethod(comment = "Create a dropdown list box labelled FIELD-NAME with CHOICES, optionally returning items from VALUES and with the default choice set to item at CHOICE-OFFSET")
    public static SubLObject html_create_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        return html_create_listbox(field_name, choices, values, size, choice_offset, script);
    }

    /**
     * Create a dropdown list box labelled FIELD-NAME with CHOICES, optionally set to DEFAULT-CHOICE
     *
     * @unknown the choices are assumed to be unique
     */
    @LispMethod(comment = "Create a dropdown list box labelled FIELD-NAME with CHOICES, optionally set to DEFAULT-CHOICE\r\n\r\n@unknown the choices are assumed to be unique")
    public static final SubLObject html_create_simple_dropdown_list_alt(SubLObject field_name, SubLObject choices, SubLObject default_choice) {
        if (default_choice == UNPROVIDED) {
            default_choice = NIL;
        }
        return html_create_listbox(field_name, choices, NIL, ONE_INTEGER, position(default_choice, choices, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * Create a dropdown list box labelled FIELD-NAME with CHOICES, optionally set to DEFAULT-CHOICE
     *
     * @unknown the choices are assumed to be unique
     */
    @LispMethod(comment = "Create a dropdown list box labelled FIELD-NAME with CHOICES, optionally set to DEFAULT-CHOICE\r\n\r\n@unknown the choices are assumed to be unique")
    public static SubLObject html_create_simple_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject default_choice) {
        if (default_choice == UNPROVIDED) {
            default_choice = NIL;
        }
        return html_create_listbox(field_name, choices, NIL, ONE_INTEGER, position(default_choice, choices, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * obsolete wrapper for @xref html-create-listbox
     */
    @LispMethod(comment = "obsolete wrapper for @xref html-create-listbox")
    public static final SubLObject create_listbox_alt(SubLObject field_name, SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        return html_create_listbox(field_name, choices, values, size, choice_offset, UNPROVIDED);
    }

    /**
     * obsolete wrapper for @xref html-create-listbox
     */
    @LispMethod(comment = "obsolete wrapper for @xref html-create-listbox")
    public static SubLObject create_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        return html_create_listbox(field_name, choices, values, size, choice_offset, UNPROVIDED);
    }

    /**
     * obsolete wrapper for @xref html-create-multiple-selection-listbox
     */
    @LispMethod(comment = "obsolete wrapper for @xref html-create-multiple-selection-listbox")
    public static final SubLObject create_multiple_selection_listbox_alt(SubLObject field_name, SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offsets == UNPROVIDED) {
            choice_offsets = NIL;
        }
        return html_create_multiple_selection_listbox(field_name, choices, values, size, choice_offsets);
    }

    /**
     * obsolete wrapper for @xref html-create-multiple-selection-listbox
     */
    @LispMethod(comment = "obsolete wrapper for @xref html-create-multiple-selection-listbox")
    public static SubLObject create_multiple_selection_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offsets == UNPROVIDED) {
            choice_offsets = NIL;
        }
        return html_create_multiple_selection_listbox(field_name, choices, values, size, choice_offsets);
    }

    /**
     * obsolete wrapper for @xref html-create-dropdown-list
     */
    @LispMethod(comment = "obsolete wrapper for @xref html-create-dropdown-list")
    public static final SubLObject create_dropdown_list_alt(SubLObject field_name, SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        return html_create_dropdown_list(field_name, choices, values, size, choice_offset, UNPROVIDED);
    }

    /**
     * obsolete wrapper for @xref html-create-dropdown-list
     */
    @LispMethod(comment = "obsolete wrapper for @xref html-create-dropdown-list")
    public static SubLObject create_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset) {
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (choice_offset == UNPROVIDED) {
            choice_offset = NIL;
        }
        return html_create_dropdown_list(field_name, choices, values, size, choice_offset, UNPROVIDED);
    }

    /**
     * obsolete wrapper for @xref html-create-simple-dropdown-list
     */
    @LispMethod(comment = "obsolete wrapper for @xref html-create-simple-dropdown-list")
    public static final SubLObject create_simple_dropdown_list_alt(SubLObject field_name, SubLObject choices, SubLObject default_choice) {
        if (default_choice == UNPROVIDED) {
            default_choice = NIL;
        }
        return html_create_simple_dropdown_list(field_name, choices, default_choice);
    }

    /**
     * obsolete wrapper for @xref html-create-simple-dropdown-list
     */
    @LispMethod(comment = "obsolete wrapper for @xref html-create-simple-dropdown-list")
    public static SubLObject create_simple_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject default_choice) {
        if (default_choice == UNPROVIDED) {
            default_choice = NIL;
        }
        return html_create_simple_dropdown_list(field_name, choices, default_choice);
    }

    /**
     *
     *
     * @param BASIC-NAME
    stringp
     * 		
     * @return STRINGP; based on BASIC-NAME, uniquified using *HTML-FORM-FIELD-UNIQUIFIER-CODE*.
     */
    @LispMethod(comment = "@param BASIC-NAME\nstringp\r\n\t\t\r\n@return STRINGP; based on BASIC-NAME, uniquified using *HTML-FORM-FIELD-UNIQUIFIER-CODE*.")
    public static final SubLObject get_encoded_form_field_name_alt(SubLObject basic_name) {
        return encode_form_field_name(basic_name);
    }

    /**
     *
     *
     * @param BASIC-NAME
    stringp
     * 		
     * @return STRINGP; based on BASIC-NAME, uniquified using *HTML-FORM-FIELD-UNIQUIFIER-CODE*.
     */
    @LispMethod(comment = "@param BASIC-NAME\nstringp\r\n\t\t\r\n@return STRINGP; based on BASIC-NAME, uniquified using *HTML-FORM-FIELD-UNIQUIFIER-CODE*.")
    public static SubLObject get_encoded_form_field_name(final SubLObject basic_name) {
        return encode_form_field_name(basic_name);
    }

    /**
     *
     *
     * @return STRINGP or NIL; The value from ARGS of the field whose name is the encoded
    version of UNENCODED-NAME encoded using the code in ARGS.
     */
    @LispMethod(comment = "@return STRINGP or NIL; The value from ARGS of the field whose name is the encoded\r\nversion of UNENCODED-NAME encoded using the code in ARGS.")
    public static final SubLObject extract_encoded_form_field_value_alt(SubLObject unencoded_name, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
                        {
                            SubLObject encoded_field_name = get_encoded_form_field_name(unencoded_name);
                            ans = html_extract_input(encoded_field_name, args);
                        }
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return STRINGP or NIL; The value from ARGS of the field whose name is the encoded
    version of UNENCODED-NAME encoded using the code in ARGS.
     */
    @LispMethod(comment = "@return STRINGP or NIL; The value from ARGS of the field whose name is the encoded\r\nversion of UNENCODED-NAME encoded using the code in ARGS.")
    public static SubLObject extract_encoded_form_field_value(final SubLObject unencoded_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
            final SubLObject encoded_field_name = get_encoded_form_field_name(unencoded_name);
            ans = html_extract_input(encoded_field_name, args);
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    /**
     *
     *
     * @param BASIC-NAME
    stringp
     * 		
     * @return STRINGP; based on BASIC-NAME, uniquified using *HTML-FORM-FIELD-UNIQUIFIER-CODE*.
     */
    @LispMethod(comment = "@param BASIC-NAME\nstringp\r\n\t\t\r\n@return STRINGP; based on BASIC-NAME, uniquified using *HTML-FORM-FIELD-UNIQUIFIER-CODE*.")
    public static final SubLObject encode_form_field_name_alt(SubLObject basic_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread).isInteger()) {
                return cconcatenate(basic_name, new SubLObject[]{ $str_alt624$_, princ_to_string(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread)) });
            } else {
                Errors.warn($str_alt625$Bad__HTML_FORM_FIELD_UNIQUIFIER_C, html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                return basic_name;
            }
        }
    }

    /**
     *
     *
     * @param BASIC-NAME
    stringp
     * 		
     * @return STRINGP; based on BASIC-NAME, uniquified using *HTML-FORM-FIELD-UNIQUIFIER-CODE*.
     */
    @LispMethod(comment = "@param BASIC-NAME\nstringp\r\n\t\t\r\n@return STRINGP; based on BASIC-NAME, uniquified using *HTML-FORM-FIELD-UNIQUIFIER-CODE*.")
    public static SubLObject encode_form_field_name(final SubLObject basic_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread).isInteger()) {
            return cconcatenate(basic_name, new SubLObject[]{ $str669$_, princ_to_string(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread)) });
        }
        return basic_name;
    }

    public static final SubLObject html_echo_args_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Echo_of_ARGS);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(color_value));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ($$$Echo_of_ARGS);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        cb_back_button($SELF, $$$Back);
                                        html_macros.verify_not_within_html_pre();
                                        html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_48 = html_macros.$within_html_pre$.currentBinding(thread);
                                            try {
                                                html_macros.$within_html_pre$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = args;
                                                    SubLObject arg = NIL;
                                                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                        html_prin1(arg);
                                                        html_terpri(UNPROVIDED);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$within_html_pre$.rebind(_prev_bind_0_48, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject html_echo_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str670$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str671$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Echo_of_ARGS);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$48 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($$$Echo_of_ARGS);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        cb_back_button($SELF, $$$Back);
                        html_macros.verify_not_within_html_pre();
                        html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                        final SubLObject _prev_bind_0_$51 = html_macros.$within_html_pre$.currentBinding(thread);
                        try {
                            html_macros.$within_html_pre$.bind(T, thread);
                            SubLObject cdolist_list_var = args;
                            SubLObject arg = NIL;
                            arg = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_prin1(arg);
                                html_terpri(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                arg = cdolist_list_var.first();
                            } 
                        } finally {
                            html_macros.$within_html_pre$.rebind(_prev_bind_0_$51, thread);
                        }
                        html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$48, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_echo_file_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject filename = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt630);
                filename = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_text(filename, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt632$Unable_to_open__S, filename);
                            }
                            {
                                SubLObject s = stream;
                                SubLObject v_char = NIL;
                                for (v_char = read_char(s, NIL, $EOF, UNPROVIDED); $EOF != v_char; v_char = read_char(s, NIL, $EOF, UNPROVIDED)) {
                                    html_char(v_char, UNPROVIDED);
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
                } else {
                    cdestructuring_bind_error(datum, $list_alt630);
                }
            }
            return NIL;
        }
    }

    public static SubLObject html_echo_file(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(args, args, $list678);
        filename = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str680$Unable_to_open__S, filename);
                }
                SubLObject s;
                SubLObject v_char;
                for (s = stream, v_char = NIL, v_char = read_char(s, NIL, $EOF, UNPROVIDED); $EOF != v_char; v_char = read_char(s, NIL, $EOF, UNPROVIDED)) {
                    html_char(v_char, UNPROVIDED);
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
        } else {
            cdestructuring_bind_error(args, $list678);
        }
        return NIL;
    }

    /**
     *
     *
     * @return stringp ; STRING with html tags replaced with SEPARATOR-STRING
     */
    @LispMethod(comment = "@return stringp ; STRING with html tags replaced with SEPARATOR-STRING")
    public static final SubLObject remove_html_tags_alt(SubLObject string, SubLObject separator_string) {
        if (separator_string == UNPROVIDED) {
            separator_string = $str_alt53$_;
        }
        {
            SubLObject open = $str_alt16$_;
            SubLObject close = $str_alt18$_;
            SubLObject quote = $str_alt635$_;
            SubLObject open_comment = $str_alt636$____;
            SubLObject close_comment = $str_alt637$___;
            SubLObject open_script = $str_alt638$_script;
            SubLObject close_script = $str_alt639$__script_;
            SubLObject html_string1 = string_utilities.string_substitute($str_alt638$_script, $str_alt638$_script, string, symbol_function(EQUALP));
            SubLObject html_string = string_utilities.string_substitute($str_alt640$__script, $str_alt640$__script, html_string1, symbol_function(EQUALP));
            SubLObject strings = string_utilities.string_tokenize(html_string, list(open_comment, close_comment, open_script, close_script, open, close, quote), NIL, T, T, $list_alt641, UNPROVIDED);
            SubLObject in_tagP = NIL;
            SubLObject in_commentP = NIL;
            SubLObject in_scriptP = NIL;
            SubLObject in_quoteP = NIL;
            SubLObject tagless_string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                {
                    SubLObject cdolist_list_var = strings;
                    SubLObject substring = NIL;
                    for (substring = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , substring = cdolist_list_var.first()) {
                        if (NIL != in_commentP) {
                            if (substring.equalp(close_comment)) {
                                in_commentP = NIL;
                            }
                        } else {
                            if (NIL != in_scriptP) {
                                if (substring.equalp(open_comment)) {
                                    in_commentP = T;
                                } else {
                                    if (substring.equalp(close_script)) {
                                        in_scriptP = NIL;
                                    }
                                }
                            } else {
                                if (NIL != in_tagP) {
                                    if (NIL != in_quoteP) {
                                        if (substring.equalp(quote)) {
                                            in_quoteP = NIL;
                                        }
                                    } else {
                                        if (substring.equalp(open_comment)) {
                                            in_commentP = T;
                                        } else {
                                            if (substring.equalp(quote)) {
                                                in_quoteP = T;
                                            } else {
                                                if (substring.equalp(close)) {
                                                    in_tagP = NIL;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (substring.equalp(open_comment)) {
                                        in_commentP = T;
                                    } else {
                                        if (substring.equalp(open_script)) {
                                            in_scriptP = T;
                                            if (NIL == string_utilities.empty_string_p(separator_string)) {
                                                princ(separator_string, stream);
                                            }
                                        } else {
                                            if (substring.equalp(open)) {
                                                in_tagP = T;
                                                if (NIL == string_utilities.empty_string_p(separator_string)) {
                                                    princ(separator_string, stream);
                                                }
                                            } else {
                                                if (NIL == string_utilities.empty_string_p(substring)) {
                                                    princ(substring, stream);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                tagless_string = get_output_stream_string(stream);
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
            return tagless_string;
        }
    }

    /**
     *
     *
     * @return stringp ; STRING with html tags replaced with SEPARATOR-STRING
     */
    @LispMethod(comment = "@return stringp ; STRING with html tags replaced with SEPARATOR-STRING")
    public static SubLObject remove_html_tags(final SubLObject string, SubLObject separator_string) {
        if (separator_string == UNPROVIDED) {
            separator_string = $$$_;
        }
        final SubLObject open = $str23$_;
        final SubLObject close = $str25$_;
        final SubLObject quote = $str682$_;
        final SubLObject open_comment = $str683$____;
        final SubLObject close_comment = $str684$___;
        final SubLObject open_script = $str685$_script;
        final SubLObject close_script = $str686$__script_;
        final SubLObject html_string1 = string_utilities.string_substitute($str685$_script, $str685$_script, string, symbol_function(EQUALP));
        final SubLObject html_string2 = string_utilities.string_substitute($str687$__script, $str687$__script, html_string1, symbol_function(EQUALP));
        final SubLObject strings = string_utilities.string_tokenize(html_string2, list(open_comment, close_comment, open_script, close_script, open, close, quote), NIL, T, T, $list688, UNPROVIDED);
        SubLObject in_tagP = NIL;
        SubLObject in_commentP = NIL;
        SubLObject in_scriptP = NIL;
        SubLObject in_quoteP = NIL;
        SubLObject tagless_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject cdolist_list_var = strings;
            SubLObject substring = NIL;
            substring = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != in_commentP) {
                    if (substring.equalp(close_comment)) {
                        in_commentP = NIL;
                    }
                } else
                    if (NIL != in_scriptP) {
                        if (substring.equalp(open_comment)) {
                            in_commentP = T;
                        } else
                            if (substring.equalp(close_script)) {
                                in_scriptP = NIL;
                            }

                    } else
                        if (NIL != in_tagP) {
                            if (NIL != in_quoteP) {
                                if (substring.equalp(quote)) {
                                    in_quoteP = NIL;
                                }
                            } else
                                if (substring.equalp(open_comment)) {
                                    in_commentP = T;
                                } else
                                    if (substring.equalp(quote)) {
                                        in_quoteP = T;
                                    } else
                                        if (substring.equalp(close)) {
                                            in_tagP = NIL;
                                        }



                        } else
                            if (substring.equalp(open_comment)) {
                                in_commentP = T;
                            } else
                                if (substring.equalp(open_script)) {
                                    in_scriptP = T;
                                    if (NIL == string_utilities.empty_string_p(separator_string)) {
                                        princ(separator_string, stream);
                                    }
                                } else
                                    if (substring.equalp(open)) {
                                        in_tagP = T;
                                        if (NIL == string_utilities.empty_string_p(separator_string)) {
                                            princ(separator_string, stream);
                                        }
                                    } else
                                        if (NIL == string_utilities.empty_string_p(substring)) {
                                            princ(substring, stream);
                                        }






                cdolist_list_var = cdolist_list_var.rest();
                substring = cdolist_list_var.first();
            } 
            tagless_string = get_output_stream_string(stream);
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
        return tagless_string;
    }

    /**
     *
     *
     * @return string : ascii representation of HTML-TEXT
     */
    @LispMethod(comment = "@return string : ascii representation of HTML-TEXT")
    public static final SubLObject convert_html_to_text_alt(SubLObject html_text) {
        return remove_html_tags(html_text, UNPROVIDED);
    }

    /**
     *
     *
     * @return string : ascii representation of HTML-TEXT
     */
    @LispMethod(comment = "@return string : ascii representation of HTML-TEXT")
    public static SubLObject convert_html_to_text(final SubLObject html_text) {
        return remove_html_tags(html_text, UNPROVIDED);
    }

    /**
     * convert an http URL target into a string, leaving just the text
     */
    @LispMethod(comment = "convert an http URL target into a string, leaving just the text")
    public static final SubLObject url_to_text_alt(SubLObject url) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                if (!((NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str_alt645$http___)) || (NIL != web_utilities.url_p(url)))) {
                                    url = cconcatenate($str_alt645$http___, url);
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject machine = web_utilities.parse_http_url(url);
                                    SubLObject port = thread.secondMultipleValue();
                                    SubLObject path = thread.thirdMultipleValue();
                                    SubLObject query = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == machine) {
                                        machine = url;
                                    }
                                    if (NIL == path) {
                                        path = $str_alt17$_;
                                    }
                                    if (!port.isInteger()) {
                                        port = $int$80;
                                    }
                                    {
                                        SubLObject out_stream = NIL;
                                        try {
                                            out_stream = make_private_string_output_stream();
                                            {
                                                SubLObject stream = NIL;
                                                try {
                                                    stream = make_private_string_input_stream(web_utilities.http_retrieve(list(list(query)), path, machine, port, $GET, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL);
                                                    {
                                                        SubLObject tokens = web_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        while (NIL != tokens) {
                                                            {
                                                                SubLObject token = tokens.first();
                                                                if (NIL != web_utilities.xml_token_starts_with(token, $str_alt638$_script)) {
                                                                    tokens = web_utilities.advance_xml_tokens(web_utilities.advance_xml_tokens_to(tokens, $str_alt639$__script_, UNPROVIDED), UNPROVIDED);
                                                                } else {
                                                                    if (NIL != web_utilities.xml_token_starts_with(token, $str_alt648$_style)) {
                                                                        tokens = web_utilities.advance_xml_tokens(web_utilities.advance_xml_tokens_to(tokens, $str_alt649$__style_, UNPROVIDED), UNPROVIDED);
                                                                    } else {
                                                                        if (NIL != web_utilities.xml_token_starts_with(token, $str_alt39$_p_)) {
                                                                            princ($str_alt53$_, out_stream);
                                                                            tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                                                        } else {
                                                                            if (NIL != web_utilities.xml_token_starts_with(token, $str_alt16$_)) {
                                                                                tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                                                            } else {
                                                                                format(out_stream, $str_alt32$_A, token);
                                                                                tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            close(stream, UNPROVIDED);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_49, thread);
                                                        }
                                                    }
                                                }
                                            }
                                            result = get_output_stream_string(out_stream);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close(out_stream, UNPROVIDED);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_50, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                if (result.isString()) {
                    return string_utilities.do_string_substitutions_robust(result, $url_to_text_replacements$.getGlobalValue(), UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * convert an http URL target into a string, leaving just the text
     */
    @LispMethod(comment = "convert an http URL target into a string, leaving just the text")
    public static SubLObject url_to_text(SubLObject url) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if ((NIL == string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str690$http___)) && (NIL == web_utilities.url_p(url))) {
                        url = cconcatenate($str690$http___, url);
                    }
                    thread.resetMultipleValues();
                    SubLObject machine = web_utilities.parse_http_url(url);
                    SubLObject port = thread.secondMultipleValue();
                    SubLObject path = thread.thirdMultipleValue();
                    final SubLObject query = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == machine) {
                        machine = url;
                    }
                    if (NIL == path) {
                        path = $str24$_;
                    }
                    if (!port.isInteger()) {
                        port = $int$80;
                    }
                    SubLObject out_stream = NIL;
                    try {
                        out_stream = make_private_string_output_stream();
                        SubLObject stream = NIL;
                        try {
                            stream = make_private_string_input_stream(web_utilities.http_retrieve(list(list(query)), path, machine, port, $GET, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL);
                            SubLObject tokens = xml_parsing_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            while (NIL != tokens) {
                                final SubLObject token = tokens.first();
                                if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str685$_script)) {
                                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, $str686$__script_, UNPROVIDED), UNPROVIDED);
                                } else
                                    if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str693$_style)) {
                                        tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, $str694$__style_, UNPROVIDED), UNPROVIDED);
                                    } else
                                        if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str695$_p_)) {
                                            princ($$$_, out_stream);
                                            tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                        } else
                                            if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str23$_)) {
                                                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                            } else {
                                                format(out_stream, $str39$_A, token);
                                                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                            }



                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                close(stream, UNPROVIDED);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                        result = get_output_stream_string(out_stream);
                    } finally {
                        final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            close(out_stream, UNPROVIDED);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                        }
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
        if (result.isString()) {
            return string_utilities.do_string_substitutions_robust(result, $url_to_text_replacements$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject generate_html_filename_input_fieldname_alt(SubLObject name) {
        return cconcatenate($html_filename_input_prefix$.getGlobalValue(), name);
    }

    public static SubLObject generate_html_filename_input_fieldname(final SubLObject name) {
        return cconcatenate($html_filename_input_prefix$.getGlobalValue(), name);
    }

    public static final SubLObject html_filename_input_alt(SubLObject name, SubLObject initial_value, SubLObject size) {
        {
            SubLObject file_input = generate_html_filename_input_fieldname(name);
            SubLObject update_name_script = cconcatenate($str_alt651$this_form_, new SubLObject[]{ name, $str_alt652$_value___this_value_ });
            html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$TEXT);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != file_input) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(file_input);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != file_input) {
                html_markup(html_macros.$html_input_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(file_input);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != initial_value) {
                html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_princ(initial_value);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != size) {
                html_markup(html_macros.$html_input_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(size);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != update_name_script) {
                html_markup(html_macros.$html_select_onchange$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(update_name_script);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != update_name_script) {
                html_markup(html_macros.$html_event_attribute_onblur$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(update_name_script);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            html_hidden_input(name, $str_alt37$, NIL);
        }
        return NIL;
    }

    public static SubLObject html_filename_input(final SubLObject name, final SubLObject initial_value, final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file_input = generate_html_filename_input_fieldname(name);
        final SubLObject update_name_script = cconcatenate($str697$this_form_, new SubLObject[]{ name, $str698$_value___this_value_ });
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$TEXT);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != file_input) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(file_input);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != file_input) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(file_input);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != initial_value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(initial_value);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != update_name_script) {
            html_markup(html_macros.$html_select_onchange$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(update_name_script);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != update_name_script) {
            html_markup(html_macros.$html_event_attribute_onblur$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(update_name_script);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        html_hidden_input(name, $str47$, NIL);
        return NIL;
    }

    public static final SubLObject html_with_file_transmitting_form_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt654);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject handler_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt654);
                    handler_name = current.first();
                    current = current.rest();
                    {
                        SubLObject target = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt654);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject frame_name_var = $sym655$FRAME_NAME_VAR;
                                return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), listS(HTML_FANCY_FORM, listS($cyc_cgi_program$, $html_form_method_post$, frame_name_var, $list_alt661), listS(HTML_HIDDEN_INPUT, handler_name, $list_alt663), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt654);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject html_with_file_transmitting_form(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list700);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject handler_name = NIL;
        destructuring_bind_must_consp(current, datum, $list700);
        handler_name = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list700);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject frame_name_var = $sym701$FRAME_NAME_VAR;
            return list(CLET, list(list(frame_name_var, list(CB_FRAME_NAME, target))), listS(HTML_FANCY_FORM, listS($cyc_cgi_program$, $html_form_method_post$, frame_name_var, $list707), listS(HTML_HIDDEN_INPUT, handler_name, $list709), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list700);
        return NIL;
    }

    public static final SubLObject html_arguments_contain_multipart_form_dataP_alt(SubLObject args) {
        return list_utilities.sublisp_boolean(html_extract_input($html_multipart_form_date$.getGlobalValue(), args));
    }

    public static SubLObject html_arguments_contain_multipart_form_dataP(final SubLObject args) {
        return list_utilities.sublisp_boolean(html_extract_input($html_multipart_form_date$.getGlobalValue(), args));
    }

    public static final SubLObject html_parse_multipart_form_data_alt(SubLObject string) {
        {
            SubLObject values = NIL;
            SubLObject s = NIL;
            try {
                s = make_private_string_input_stream(string, ZERO_INTEGER, NIL);
                {
                    SubLObject separator = read_line(s, NIL, $EOF, UNPROVIDED);
                    SubLObject eof = NIL;
                    while (NIL == eof) {
                        {
                            SubLObject content_disposition = read_line(s, NIL, $EOF, UNPROVIDED);
                            SubLObject content_type = read_line(s, NIL, $EOF, UNPROVIDED);
                            SubLObject field = NIL;
                            SubLObject content = NIL;
                            if ($EOF == content_disposition) {
                                eof = T;
                            } else {
                                field = html_parse_data_name_from_content_disposition(content_disposition);
                                if (NIL != search($str_alt665$application_octet_stream, content_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    content = html_parse_multipart_form_line(s, separator);
                                } else {
                                    content = read_line(s, NIL, $EOF, UNPROVIDED);
                                    html_parse_consume_separator(s, separator);
                                }
                                values = cons(list(field, delete(CHAR_return, content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), values);
                            }
                        }
                    } 
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(s, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            values = cons(list($html_multipart_form_date$.getGlobalValue(), $$$T), values);
            return nreverse(values);
        }
    }

    public static SubLObject html_parse_multipart_form_data(final SubLObject string) {
        SubLObject values = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_input_stream(string, ZERO_INTEGER, NIL);
            final SubLObject separator = read_line(s, NIL, $EOF, UNPROVIDED);
            SubLObject eof = NIL;
            while (NIL == eof) {
                final SubLObject content_disposition = read_line(s, NIL, $EOF, UNPROVIDED);
                final SubLObject content_type = read_line(s, NIL, $EOF, UNPROVIDED);
                SubLObject field = NIL;
                SubLObject content = NIL;
                if ($EOF == content_disposition) {
                    eof = T;
                } else {
                    field = html_parse_data_name_from_content_disposition(content_disposition);
                    if (NIL != search($str711$application_octet_stream, content_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        content = html_parse_multipart_form_line(s, separator);
                    } else {
                        content = read_line(s, NIL, $EOF, UNPROVIDED);
                        html_parse_consume_separator(s, separator);
                    }
                    values = cons(list(field, delete(CHAR_return, content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), values);
                }
            } 
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        values = cons(list($html_multipart_form_date$.getGlobalValue(), $$$T), values);
        return nreverse(values);
    }

    public static final SubLObject html_parse_consume_separator_alt(SubLObject stream, SubLObject separator) {
        return Strings.string_equal(separator, read_line(stream, NIL, $EOF, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_parse_consume_separator(final SubLObject stream, final SubLObject separator) {
        return Strings.string_equal(separator, read_line(stream, NIL, $EOF, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_parse_data_name_from_content_disposition_alt(SubLObject content) {
        {
            SubLObject first_quote = position(CHAR_quotation, content, symbol_function($sym667$CHAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject inside_value = add(ONE_INTEGER, first_quote);
            SubLObject second_quote = position(CHAR_quotation, content, symbol_function($sym667$CHAR_), symbol_function(IDENTITY), inside_value, UNPROVIDED);
            return string_utilities.substring(content, inside_value, second_quote);
        }
    }

    public static SubLObject html_parse_data_name_from_content_disposition(final SubLObject content) {
        final SubLObject first_quote = position(CHAR_quotation, content, symbol_function($sym713$CHAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject inside_value = add(ONE_INTEGER, first_quote);
        final SubLObject second_quote = position(CHAR_quotation, content, symbol_function($sym713$CHAR_), symbol_function(IDENTITY), inside_value, UNPROVIDED);
        return string_utilities.substring(content, inside_value, second_quote);
    }

    public static final SubLObject html_parse_multipart_form_line_alt(SubLObject s, SubLObject separator) {
        read_line(s, NIL, $EOF, UNPROVIDED);
        {
            SubLObject line = read_line(s, NIL, $EOF, UNPROVIDED);
            SubLObject pieces = $str_alt37$;
            while (NIL == Strings.string_equal(separator, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                pieces = cconcatenate(pieces, new SubLObject[]{ line, $html_newline_string$.getGlobalValue() });
                line = read_line(s, NIL, separator, UNPROVIDED);
            } 
            return delete(CHAR_return, pieces, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject html_parse_multipart_form_line(final SubLObject s, final SubLObject separator) {
        read_line(s, NIL, $EOF, UNPROVIDED);
        SubLObject line = read_line(s, NIL, $EOF, UNPROVIDED);
        SubLObject pieces = $str47$;
        while (NIL == Strings.string_equal(separator, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            pieces = cconcatenate(pieces, new SubLObject[]{ line, $html_newline_string$.getGlobalValue() });
            line = read_line(s, NIL, separator, UNPROVIDED);
        } 
        return delete(CHAR_return, pieces, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_construct_message_from_multipart_data_alt(SubLObject contents) {
        {
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                {
                    SubLObject list_var = NIL;
                    SubLObject component = NIL;
                    SubLObject index = NIL;
                    for (list_var = contents, component = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , component = list_var.first() , index = add(ONE_INTEGER, index)) {
                        {
                            SubLObject datum = component;
                            SubLObject current = datum;
                            SubLObject item = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt668);
                            item = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt668);
                            value = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (index.isPositive()) {
                                    write_char(CHAR_ampersand, stream);
                                }
                                write_string(item, stream, UNPROVIDED, UNPROVIDED);
                                write_char(CHAR_equal, stream);
                                {
                                    SubLObject string_var = value;
                                    SubLObject end_var = length(string_var);
                                    SubLObject end_var_51 = end_var;
                                    SubLObject char_num = NIL;
                                    for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_51); char_num = number_utilities.f_1X(char_num)) {
                                        {
                                            SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                                            if (NIL != charE(CHAR_space, v_char)) {
                                                write_char(CHAR_plus, stream);
                                            } else {
                                                if (NIL != alphanumericp(v_char)) {
                                                    write_char(v_char, stream);
                                                } else {
                                                    format(stream, $str_alt669$__2__0X, char_code(v_char));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt668);
                            }
                        }
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

    public static SubLObject html_construct_message_from_multipart_data(final SubLObject contents) {
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject list_var = NIL;
            SubLObject component = NIL;
            SubLObject index = NIL;
            list_var = contents;
            component = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , component = list_var.first() , index = add(ONE_INTEGER, index)) {
                SubLObject current;
                final SubLObject datum = current = component;
                SubLObject item = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list714);
                item = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list714);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (index.isPositive()) {
                        write_char(CHAR_ampersand, stream);
                    }
                    write_string(item, stream, UNPROVIDED, UNPROVIDED);
                    write_char(CHAR_equal, stream);
                    final SubLObject string_var = value;
                    SubLObject end_var_$54;
                    SubLObject end_var;
                    SubLObject char_num;
                    SubLObject v_char;
                    for (end_var = end_var_$54 = length(string_var), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$54); char_num = number_utilities.f_1X(char_num)) {
                        v_char = Strings.sublisp_char(string_var, char_num);
                        if (NIL != charE(CHAR_space, v_char)) {
                            write_char(CHAR_plus, stream);
                        } else
                            if (NIL != alphanumericp(v_char)) {
                                write_char(v_char, stream);
                            } else {
                                format(stream, $str715$__2__0X, char_code(v_char));
                            }

                    }
                } else {
                    cdestructuring_bind_error(datum, $list714);
                }
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

    public static final SubLObject html_request_arguments_are_multipart_dataP_alt(SubLObject v_arguments) {
        return makeBoolean((NIL != list_utilities.lengthG(v_arguments, $html_multipart_content_marker_size$.getGlobalValue(), UNPROVIDED)) && (NIL != Strings.string_equal(v_arguments, $html_multipart_content_marker$.getGlobalValue(), ZERO_INTEGER, $html_multipart_content_marker_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject html_request_arguments_are_multipart_dataP(final SubLObject v_arguments) {
        return makeBoolean((NIL != list_utilities.lengthG(v_arguments, $html_multipart_content_marker_size$.getGlobalValue(), UNPROVIDED)) && (NIL != Strings.string_equal(v_arguments, $html_multipart_content_marker$.getGlobalValue(), ZERO_INTEGER, $html_multipart_content_marker_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Display a TREEMAP in a rectangular region using HTML tables.
     * WIDTH is the width in pixels for the topmost table.
     * HEIGHT is the height in pixels for the topmost table.
     * SPLIT-TYPE must be either :vertical or :horizontal, and represents the top-level split.
     */
    @LispMethod(comment = "Display a TREEMAP in a rectangular region using HTML tables.\r\nWIDTH is the width in pixels for the topmost table.\r\nHEIGHT is the height in pixels for the topmost table.\r\nSPLIT-TYPE must be either :vertical or :horizontal, and represents the top-level split.\nDisplay a TREEMAP in a rectangular region using HTML tables.\nWIDTH is the width in pixels for the topmost table.\nHEIGHT is the height in pixels for the topmost table.\nSPLIT-TYPE must be either :vertical or :horizontal, and represents the top-level split.")
    public static final SubLObject html_treemap_table_alt(SubLObject treemap, SubLObject width, SubLObject height, SubLObject split_type, SubLObject display_properties) {
        if (width == UNPROVIDED) {
            width = $int$200;
        }
        if (height == UNPROVIDED) {
            height = width;
        }
        if (split_type == UNPROVIDED) {
            split_type = $VERTICAL;
        }
        if (display_properties == UNPROVIDED) {
            display_properties = NIL;
        }
        html_treemap_table_recursive(treemap, width, height, split_type, display_properties);
        return NIL;
    }

    /**
     * Display a TREEMAP in a rectangular region using HTML tables.
     * WIDTH is the width in pixels for the topmost table.
     * HEIGHT is the height in pixels for the topmost table.
     * SPLIT-TYPE must be either :vertical or :horizontal, and represents the top-level split.
     */
    @LispMethod(comment = "Display a TREEMAP in a rectangular region using HTML tables.\r\nWIDTH is the width in pixels for the topmost table.\r\nHEIGHT is the height in pixels for the topmost table.\r\nSPLIT-TYPE must be either :vertical or :horizontal, and represents the top-level split.\nDisplay a TREEMAP in a rectangular region using HTML tables.\nWIDTH is the width in pixels for the topmost table.\nHEIGHT is the height in pixels for the topmost table.\nSPLIT-TYPE must be either :vertical or :horizontal, and represents the top-level split.")
    public static SubLObject html_treemap_table(final SubLObject treemap, SubLObject width, SubLObject height, SubLObject split_type, SubLObject display_properties) {
        if (width == UNPROVIDED) {
            width = $int$200;
        }
        if (height == UNPROVIDED) {
            height = width;
        }
        if (split_type == UNPROVIDED) {
            split_type = $VERTICAL;
        }
        if (display_properties == UNPROVIDED) {
            display_properties = NIL;
        }
        html_treemap_table_recursive(treemap, width, height, split_type, display_properties);
        return NIL;
    }

    /**
     * Return the total of all the :SIZE attributes in TREEMAP
     */
    @LispMethod(comment = "Return the total of all the :SIZE attributes in TREEMAP")
    public static final SubLObject treemap_size_alt(SubLObject treemap) {
        if (treemap.first().isList()) {
            {
                SubLObject size = ZERO_INTEGER;
                SubLObject cdolist_list_var = treemap;
                SubLObject subtreemap = NIL;
                for (subtreemap = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtreemap = cdolist_list_var.first()) {
                    size = add(size, treemap_size(subtreemap));
                }
                return size;
            }
        } else {
            return getf(treemap, $SIZE, UNPROVIDED);
        }
    }

    /**
     * Return the total of all the :SIZE attributes in TREEMAP
     */
    @LispMethod(comment = "Return the total of all the :SIZE attributes in TREEMAP")
    public static SubLObject treemap_size(final SubLObject treemap) {
        if (treemap.first().isList()) {
            SubLObject size = ZERO_INTEGER;
            SubLObject cdolist_list_var = treemap;
            SubLObject subtreemap = NIL;
            subtreemap = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                size = add(size, treemap_size(subtreemap));
                cdolist_list_var = cdolist_list_var.rest();
                subtreemap = cdolist_list_var.first();
            } 
            return size;
        }
        return getf(treemap, $SIZE, UNPROVIDED);
    }

    /**
     * Return the total of all the :SIZE attributes
     * of items in TREEMAP whose class equals CLASS.
     */
    @LispMethod(comment = "Return the total of all the :SIZE attributes\r\nof items in TREEMAP whose class equals CLASS.\nReturn the total of all the :SIZE attributes\nof items in TREEMAP whose class equals CLASS.")
    public static final SubLObject treemap_class_size_alt(SubLObject treemap, SubLObject v_class) {
        if (treemap.first().isList()) {
            {
                SubLObject size = ZERO_INTEGER;
                SubLObject cdolist_list_var = treemap;
                SubLObject subtreemap = NIL;
                for (subtreemap = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtreemap = cdolist_list_var.first()) {
                    size = add(size, treemap_class_size(subtreemap, v_class));
                }
                return size;
            }
        } else {
            if (v_class.equal(getf(treemap, $CLASS, UNPROVIDED))) {
                return getf(treemap, $SIZE, UNPROVIDED);
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    /**
     * Return the total of all the :SIZE attributes
     * of items in TREEMAP whose class equals CLASS.
     */
    @LispMethod(comment = "Return the total of all the :SIZE attributes\r\nof items in TREEMAP whose class equals CLASS.\nReturn the total of all the :SIZE attributes\nof items in TREEMAP whose class equals CLASS.")
    public static SubLObject treemap_class_size(final SubLObject treemap, final SubLObject v_class) {
        if (treemap.first().isList()) {
            SubLObject size = ZERO_INTEGER;
            SubLObject cdolist_list_var = treemap;
            SubLObject subtreemap = NIL;
            subtreemap = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                size = add(size, treemap_class_size(subtreemap, v_class));
                cdolist_list_var = cdolist_list_var.rest();
                subtreemap = cdolist_list_var.first();
            } 
            return size;
        }
        if (v_class.equal(getf(treemap, $CLASS, UNPROVIDED))) {
            return getf(treemap, $SIZE, UNPROVIDED);
        }
        return ZERO_INTEGER;
    }

    /**
     *
     *
     * @return LISTP; a treemap rooted at ROOT.
    Daughters for each node are computed by calling DTRS-FN on the node.
    Size is computed by calling SIZE-FN.
    Similarly for names and classes.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LISTP; a treemap rooted at ROOT.\r\nDaughters for each node are computed by calling DTRS-FN on the node.\r\nSize is computed by calling SIZE-FN.\r\nSimilarly for names and classes.\r\n@unknown baxter")
    public static final SubLObject build_treemap_alt(SubLObject root, SubLObject dtrs_fn, SubLObject size_fn, SubLObject name_fn, SubLObject class_fn) {
        SubLTrampolineFile.checkType(dtrs_fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(size_fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(name_fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(class_fn, FUNCTION_SPEC_P);
        return build_treemap_recursive(root, dtrs_fn, size_fn, name_fn, class_fn, set.new_set(symbol_function(EQUAL), UNPROVIDED));
    }

    /**
     *
     *
     * @return LISTP; a treemap rooted at ROOT.
    Daughters for each node are computed by calling DTRS-FN on the node.
    Size is computed by calling SIZE-FN.
    Similarly for names and classes.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LISTP; a treemap rooted at ROOT.\r\nDaughters for each node are computed by calling DTRS-FN on the node.\r\nSize is computed by calling SIZE-FN.\r\nSimilarly for names and classes.\r\n@unknown baxter")
    public static SubLObject build_treemap(final SubLObject root, final SubLObject dtrs_fn, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn) {
        assert NIL != function_spec_p(dtrs_fn) : "! function_spec_p(dtrs_fn) " + ("Types.function_spec_p(dtrs_fn) " + "CommonSymbols.NIL != Types.function_spec_p(dtrs_fn) ") + dtrs_fn;
        assert NIL != function_spec_p(size_fn) : "! function_spec_p(size_fn) " + ("Types.function_spec_p(size_fn) " + "CommonSymbols.NIL != Types.function_spec_p(size_fn) ") + size_fn;
        assert NIL != function_spec_p(name_fn) : "! function_spec_p(name_fn) " + ("Types.function_spec_p(name_fn) " + "CommonSymbols.NIL != Types.function_spec_p(name_fn) ") + name_fn;
        assert NIL != function_spec_p(class_fn) : "! function_spec_p(class_fn) " + ("Types.function_spec_p(class_fn) " + "CommonSymbols.NIL != Types.function_spec_p(class_fn) ") + class_fn;
        return build_treemap_recursive(root, dtrs_fn, size_fn, name_fn, class_fn, set.new_set(symbol_function(EQUAL), UNPROVIDED));
    }

    public static final SubLObject html_treemap_table_recursive_alt(SubLObject treemap, SubLObject width, SubLObject height, SubLObject split_type, SubLObject display_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!treemap.first().isList()) {
                {
                    SubLObject datum = treemap;
                    SubLObject current = datum;
                    SubLObject size_tail = property_list_member($SIZE, current);
                    SubLObject size = (NIL != size_tail) ? ((SubLObject) (cadr(size_tail))) : NIL;
                    SubLObject name_tail = property_list_member($NAME, current);
                    SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
                    SubLObject color_tail = property_list_member($COLOR, current);
                    SubLObject color = (NIL != color_tail) ? ((SubLObject) (cadr(color_tail))) : NIL;
                    SubLObject class_tail = property_list_member($CLASS, current);
                    SubLObject v_class = (NIL != class_tail) ? ((SubLObject) (cadr(class_tail))) : NIL;
                    SubLObject bgcolor = compute_treemap_color(color, v_class, display_properties);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != height) {
                                html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(height);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($CENTER));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($CENTER));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != bgcolor) {
                                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(bgcolor);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != width) {
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(width);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (multiply(width, height).numG($int$100)) {
                                                if (multiply(width, height).numG($int$1000)) {
                                                    html_princ(name);
                                                    html_newline(UNPROVIDED);
                                                }
                                                html_princ(size);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            } else {
                if (split_type == $VERTICAL) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    if (true) {
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject tree_size = treemap_size(treemap);
                                SubLObject cdolist_list_var = treemap;
                                SubLObject subtreemap = NIL;
                                for (subtreemap = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtreemap = cdolist_list_var.first()) {
                                    {
                                        SubLObject subtree_size = treemap_size(subtreemap);
                                        SubLObject sub_height = ceiling(multiply(height, divide(subtree_size, tree_size)), UNPROVIDED);
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != sub_height) {
                                            html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(sub_height);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($CENTER));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($CENTER));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != width) {
                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(width);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_treemap_table_recursive(subtreemap, width, sub_height, $HORIZONTAL, display_properties);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } else {
                    if (split_type == $HORIZONTAL) {
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        if (true) {
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject tree_size = treemap_size(treemap);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    if (NIL != height) {
                                        html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(height);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject cdolist_list_var = treemap;
                                                SubLObject subtreemap = NIL;
                                                for (subtreemap = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subtreemap = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject subtree_size = treemap_size(subtreemap);
                                                        SubLObject sub_width = ceiling(multiply(width, divide(subtree_size, tree_size)), UNPROVIDED);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($CENTER));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align($CENTER));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != sub_width) {
                                                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(sub_width);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_treemap_table_recursive(subtreemap, sub_width, height, $VERTICAL, display_properties);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    }
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject html_treemap_table_recursive(final SubLObject treemap, final SubLObject width, final SubLObject height, final SubLObject split_type, final SubLObject display_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!treemap.first().isList()) {
            final SubLObject size_tail = property_list_member($SIZE, treemap);
            final SubLObject size = (NIL != size_tail) ? cadr(size_tail) : NIL;
            final SubLObject name_tail = property_list_member($NAME, treemap);
            final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
            final SubLObject color_tail = property_list_member($COLOR, treemap);
            final SubLObject color = (NIL != color_tail) ? cadr(color_tail) : NIL;
            final SubLObject class_tail = property_list_member($CLASS, treemap);
            final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
            final SubLObject bgcolor = compute_treemap_color(color, v_class, display_properties);
            final SubLObject font_color = getf(display_properties, $FONT_COLOR, $BLACK);
            final SubLObject border = getf(display_properties, $BORDER, ONE_INTEGER);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (NIL != border) {
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != height) {
                    html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(height);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != bgcolor) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(bgcolor);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != width) {
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(width);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject color_val = font_color;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != color_val) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(color_val));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (multiply(width, height).numG($int$400)) {
                                if (multiply(width, height).numG($int$800)) {
                                    html_princ(name);
                                    html_indent(UNPROVIDED);
                                }
                                html_princ(size);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } else
            if (split_type == $VERTICAL) {
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject tree_size = treemap_size(treemap);
                    SubLObject cdolist_list_var = treemap;
                    SubLObject subtreemap = NIL;
                    subtreemap = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject subtree_size = treemap_size(subtreemap);
                        final SubLObject sub_height = round(multiply(height, divide(subtree_size, tree_size)), UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != sub_height) {
                            html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(sub_height);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != width) {
                                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(width);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_treemap_table_recursive(subtreemap, width, sub_height, $HORIZONTAL, display_properties);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        subtreemap = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } else
                if (split_type == $HORIZONTAL) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject tree_size = treemap_size(treemap);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != height) {
                            html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(height);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var2 = treemap;
                            SubLObject subtreemap2 = NIL;
                            subtreemap2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                final SubLObject subtree_size2 = treemap_size(subtreemap2);
                                final SubLObject sub_width = round(multiply(width, divide(subtree_size2, tree_size)), UNPROVIDED);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != sub_width) {
                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(sub_width);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_treemap_table_recursive(subtreemap2, sub_width, height, $VERTICAL, display_properties);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                subtreemap2 = cdolist_list_var2.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }


        return NIL;
    }

    public static final SubLObject compute_treemap_color_alt(SubLObject color, SubLObject v_class, SubLObject display_properties) {
        if (NIL == color) {
            {
                SubLObject datum = display_properties;
                SubLObject current = datum;
                SubLObject class_colormap_tail = property_list_member($CLASS_COLORMAP, current);
                SubLObject class_colormap = (NIL != class_colormap_tail) ? ((SubLObject) (cadr(class_colormap_tail))) : NIL;
                if (NIL != class_colormap) {
                    color = list_utilities.alist_lookup_without_values(class_colormap, v_class, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return color;
    }

    public static SubLObject compute_treemap_color(SubLObject color, final SubLObject v_class, final SubLObject display_properties) {
        if (NIL == color) {
            final SubLObject class_colormap_tail = property_list_member($CLASS_COLORMAP, display_properties);
            final SubLObject class_colormap = (NIL != class_colormap_tail) ? cadr(class_colormap_tail) : NIL;
            if (NIL != class_colormap) {
                color = list_utilities.alist_lookup_without_values(class_colormap, v_class, UNPROVIDED, UNPROVIDED);
            }
        }
        return color;
    }

    /**
     *
     *
     * @return LISTP; a treemap rooted at ROOT.
     */
    @LispMethod(comment = "@return LISTP; a treemap rooted at ROOT.")
    public static final SubLObject build_treemap_recursive_alt(SubLObject root, SubLObject dtrs_fn, SubLObject size_fn, SubLObject name_fn, SubLObject class_fn, SubLObject done) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subtreemap_for_root = treemap_entry_for_node(root, size_fn, name_fn, class_fn);
                SubLObject dtrs = funcall(dtrs_fn, root);
                SubLObject treemap = NIL;
                if (NIL != set.set_memberP(root, done)) {
                } else {
                    if (NIL == dtrs) {
                        treemap = subtreemap_for_root;
                    } else {
                        {
                            SubLObject subtreemaps = NIL;
                            if (!$build_treemap_depth$.getDynamicValue(thread).numGE($build_treemap_max_depth$.getGlobalValue())) {
                                {
                                    SubLObject _prev_bind_0 = $build_treemap_depth$.currentBinding(thread);
                                    try {
                                        $build_treemap_depth$.bind(number_utilities.f_1X($build_treemap_depth$.getDynamicValue(thread)), thread);
                                        {
                                            SubLObject cdolist_list_var = dtrs;
                                            SubLObject dtr = NIL;
                                            for (dtr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dtr = cdolist_list_var.first()) {
                                                if (NIL == set.set_memberP(dtr, done)) {
                                                    {
                                                        SubLObject subtreemap = build_treemap_recursive(dtr, dtrs_fn, size_fn, name_fn, class_fn, done);
                                                        if (NIL != number_utilities.positive_number_p(treemap_size(subtreemap))) {
                                                            subtreemaps = cons(subtreemap, subtreemaps);
                                                        }
                                                    }
                                                    set.set_add(dtr, done);
                                                }
                                            }
                                        }
                                    } finally {
                                        $build_treemap_depth$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            if (NIL != number_utilities.positive_number_p(treemap_size(subtreemap_for_root))) {
                                subtreemaps = cons(subtreemap_for_root, subtreemaps);
                            }
                            return nreverse(subtreemaps);
                        }
                    }
                }
                set.set_add(root, done);
                return treemap;
            }
        }
    }

    /**
     *
     *
     * @return LISTP; a treemap rooted at ROOT.
     */
    @LispMethod(comment = "@return LISTP; a treemap rooted at ROOT.")
    public static SubLObject build_treemap_recursive(final SubLObject root, final SubLObject dtrs_fn, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn, final SubLObject done) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subtreemap_for_root = treemap_entry_for_node(root, size_fn, name_fn, class_fn);
        final SubLObject dtrs = funcall(dtrs_fn, root);
        SubLObject treemap = NIL;
        if (NIL == set.set_memberP(root, done)) {
            if (NIL != dtrs) {
                SubLObject subtreemaps = NIL;
                if (!$build_treemap_depth$.getDynamicValue(thread).numGE($build_treemap_max_depth$.getGlobalValue())) {
                    final SubLObject _prev_bind_0 = $build_treemap_depth$.currentBinding(thread);
                    try {
                        $build_treemap_depth$.bind(number_utilities.f_1X($build_treemap_depth$.getDynamicValue(thread)), thread);
                        SubLObject cdolist_list_var = dtrs;
                        SubLObject dtr = NIL;
                        dtr = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == set.set_memberP(dtr, done)) {
                                final SubLObject subtreemap = build_treemap_recursive(dtr, dtrs_fn, size_fn, name_fn, class_fn, done);
                                if (NIL != number_utilities.positive_number_p(treemap_size(subtreemap))) {
                                    subtreemaps = cons(subtreemap, subtreemaps);
                                }
                                set.set_add(dtr, done);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dtr = cdolist_list_var.first();
                        } 
                    } finally {
                        $build_treemap_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != number_utilities.positive_number_p(treemap_size(subtreemap_for_root))) {
                    subtreemaps = cons(subtreemap_for_root, subtreemaps);
                }
                return nreverse(subtreemaps);
            }
            treemap = subtreemap_for_root;
        }
        set.set_add(root, done);
        return treemap;
    }

    public static final SubLObject treemap_entry_for_node_alt(SubLObject root, SubLObject size_fn, SubLObject name_fn, SubLObject class_fn) {
        {
            SubLObject size = funcall(size_fn, root);
            SubLObject name = funcall(name_fn, root);
            SubLObject v_class = funcall(class_fn, root);
            SubLObject entry = NIL;
            if (NIL != number_utilities.positive_number_p(size)) {
                entry = putf(entry, $SIZE, size);
            }
            if (NIL != name) {
                entry = putf(entry, $NAME, name);
            }
            if (NIL != v_class) {
                entry = putf(entry, $CLASS, v_class);
            }
            return entry;
        }
    }

    public static SubLObject treemap_entry_for_node(final SubLObject root, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn) {
        final SubLObject size = funcall(size_fn, root);
        final SubLObject name = funcall(name_fn, root);
        final SubLObject v_class = funcall(class_fn, root);
        SubLObject entry = NIL;
        if (NIL != number_utilities.positive_number_p(size)) {
            entry = putf(entry, $SIZE, size);
        }
        if (NIL != name) {
            entry = putf(entry, $NAME, name);
        }
        if (NIL != v_class) {
            entry = putf(entry, $CLASS, v_class);
        }
        return entry;
    }

    /**
     * Generates a form that will accept the user's login name and password
     * and will return an SHA1 hashed form of the password in the HASHED-PASSWORD-FIELD
     * value and the plaintext user ID in the USER-ID-FIELD value.
     * The password itself is not returned.
     *
     * @unknown the names CANNOT contain -, since that is a JavaScript operator
     */
    @LispMethod(comment = "Generates a form that will accept the user\'s login name and password\r\nand will return an SHA1 hashed form of the password in the HASHED-PASSWORD-FIELD\r\nvalue and the plaintext user ID in the USER-ID-FIELD value.\r\nThe password itself is not returned.\r\n\r\n@unknown the names CANNOT contain -, since that is a JavaScript operator\nGenerates a form that will accept the user\'s login name and password\nand will return an SHA1 hashed form of the password in the HASHED-PASSWORD-FIELD\nvalue and the plaintext user ID in the USER-ID-FIELD value.\nThe password itself is not returned.")
    public static final SubLObject html_user_id_and_password_alt(SubLObject user_id_field, SubLObject hashed_password_field, SubLObject user_text, SubLObject password_text, SubLObject user, SubLObject bad_passwordP) {
        if (user_id_field == UNPROVIDED) {
            user_id_field = $str_alt683$new_login_id;
        }
        if (hashed_password_field == UNPROVIDED) {
            hashed_password_field = $str_alt684$hashed_password;
        }
        if (user_text == UNPROVIDED) {
            user_text = $$$User_ID;
        }
        if (password_text == UNPROVIDED) {
            password_text = $$$Password;
        }
        if (user == UNPROVIDED) {
            user = NIL;
        }
        if (bad_passwordP == UNPROVIDED) {
            bad_passwordP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unhashed_password = cconcatenate($str_alt687$unhashed_password_, user_id_field);
                SubLObject keyup_event = cconcatenate($str_alt688$var_oldB64Pad___b64pad__b64pad___, new SubLObject[]{ format_nil.format_nil_a_no_copy(user_id_field), $str_alt689$_value_this_form_, format_nil.format_nil_a_no_copy(unhashed_password), $str_alt690$_value___this_form_, format_nil.format_nil_a_no_copy(hashed_password_field), $str_alt691$_value_b64_sha1_theInput___b64pad });
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(user_text);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_text_input(user_id_field, user, $int$30);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != bad_passwordP) {
                                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                                            if (NIL != html_macros.$html_color_sat_red$.getDynamicValue(thread)) {
                                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_color(html_macros.$html_color_sat_red$.getDynamicValue(thread)));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(password_text);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        } else {
                                            html_princ(password_text);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_input_head$.getGlobalValue());
                                        html_markup(html_macros.$html_input_type$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($PASSWORD);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != unhashed_password) {
                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(unhashed_password);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != keyup_event) {
                                            html_markup(html_macros.$html_event_attribute_onkeyup$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(keyup_event);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_reset_input(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_hidden_input(hashed_password_field, NIL, $int$80);
            }
            return NIL;
        }
    }

    /**
     * Generates a form that will accept the user's login name and password
     * and will return an SHA1 hashed form of the password in the HASHED-PASSWORD-FIELD
     * value and the plaintext user ID in the USER-ID-FIELD value.
     * The password itself is not returned.
     *
     * @unknown the names CANNOT contain -, since that is a JavaScript operator
     */
    @LispMethod(comment = "Generates a form that will accept the user\'s login name and password\r\nand will return an SHA1 hashed form of the password in the HASHED-PASSWORD-FIELD\r\nvalue and the plaintext user ID in the USER-ID-FIELD value.\r\nThe password itself is not returned.\r\n\r\n@unknown the names CANNOT contain -, since that is a JavaScript operator\nGenerates a form that will accept the user\'s login name and password\nand will return an SHA1 hashed form of the password in the HASHED-PASSWORD-FIELD\nvalue and the plaintext user ID in the USER-ID-FIELD value.\nThe password itself is not returned.")
    public static SubLObject html_user_id_and_password(SubLObject user_id_field, SubLObject hashed_password_field, SubLObject user_text, SubLObject password_text, SubLObject user, SubLObject bad_passwordP) {
        if (user_id_field == UNPROVIDED) {
            user_id_field = $str730$new_login_id;
        }
        if (hashed_password_field == UNPROVIDED) {
            hashed_password_field = $str731$hashed_password;
        }
        if (user_text == UNPROVIDED) {
            user_text = $$$User_ID;
        }
        if (password_text == UNPROVIDED) {
            password_text = $$$Password;
        }
        if (user == UNPROVIDED) {
            user = NIL;
        }
        if (bad_passwordP == UNPROVIDED) {
            bad_passwordP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unhashed_password = cconcatenate($str734$unhashed_password_, user_id_field);
        final SubLObject keyup_event = cconcatenate($str735$var_oldB64Pad___b64pad__b64pad___, new SubLObject[]{ format_nil.format_nil_a_no_copy(user_id_field), $str736$_value_this_form_, format_nil.format_nil_a_no_copy(unhashed_password), $str737$_value___this_form_, format_nil.format_nil_a_no_copy(hashed_password_field), $str738$_value_b64_sha1_theInput___b64pad });
        cyc_file_dependencies.javascript($SHA1);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
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
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(user_text);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_text_input(user_id_field, user, $int$30);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != bad_passwordP) {
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(password_text);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } else {
                        html_princ(password_text);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_input_head$.getGlobalValue());
                    html_markup(html_macros.$html_input_type$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($PASSWORD);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != unhashed_password) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(unhashed_password);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != keyup_event) {
                        html_markup(html_macros.$html_event_attribute_onkeyup$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(keyup_event);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_reset_input(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_hidden_input(hashed_password_field, NIL, $int$80);
        return NIL;
    }

    public static final SubLObject declare_html_utilities_file_alt() {
        declareFunction("html_flush", "HTML-FLUSH", 0, 0, false);
        declareFunction("html_char", "HTML-CHAR", 1, 1, false);
        declareFunction("html_string", "HTML-STRING", 1, 2, false);
        declareFunction("html_reserved_char_p", "HTML-RESERVED-CHAR-P", 1, 0, false);
        declareFunction("html_escape_string_for_char", "HTML-ESCAPE-STRING-FOR-CHAR", 2, 0, false);
        declareFunction("html_escape_string_for_non_ascii_char", "HTML-ESCAPE-STRING-FOR-NON-ASCII-CHAR", 1, 0, false);
        declareFunction("html_escape", "HTML-ESCAPE", 2, 0, false);
        declareFunction("subl_string_to_display_vector_string", "SUBL-STRING-TO-DISPLAY-VECTOR-STRING", 1, 0, false);
        declareFunction("html_princ", "HTML-PRINC", 1, 0, false);
        declareFunction("html_princ_strong", "HTML-PRINC-STRONG", 1, 0, false);
        declareFunction("html_princ_possibly_strong", "HTML-PRINC-POSSIBLY-STRONG", 2, 0, false);
        declareFunction("html_princ_non_breaking", "HTML-PRINC-NON-BREAKING", 1, 0, false);
        declareFunction("html_prin1", "HTML-PRIN1", 1, 0, false);
        declareFunction("html_princ_formatted_string", "HTML-PRINC-FORMATTED-STRING", 1, 0, false);
        declareFunction("html_terpri", "HTML-TERPRI", 0, 1, false);
        declareFunction("html_source_readability_terpri", "HTML-SOURCE-READABILITY-TERPRI", 0, 1, false);
        declareFunction("html_tab", "HTML-TAB", 0, 1, false);
        declareFunction("html_spaces", "HTML-SPACES", 0, 1, false);
        declareFunction("html_indent", "HTML-INDENT", 0, 1, false);
        declareFunction("html_markup", "HTML-MARKUP", 1, 0, false);
        declareFunction("html_print_doc_string", "HTML-PRINT-DOC-STRING", 1, 0, false);
        declareFunction("html_princ_doc_string", "HTML-PRINC-DOC-STRING", 1, 1, false);
        declareFunction("html_princ_cycl_string", "HTML-PRINC-CYCL-STRING", 1, 2, false);
        declareFunction("html_cycl_string", "HTML-CYCL-STRING", 1, 2, false);
        declareFunction("opencyc_html_cycl_string", "OPENCYC-HTML-CYCL-STRING", 1, 0, false);
        declareFunction("cb_form_for_cycl_string", "CB-FORM-FOR-CYCL-STRING", 1, 2, false);
        declareFunction("print_url_with_tag", "PRINT-URL-WITH-TAG", 1, 0, false);
        declareFunction("print_embedded_constant", "PRINT-EMBEDDED-CONSTANT", 3, 2, false);
        declareFunction("html_stale_constant_reference", "HTML-STALE-CONSTANT-REFERENCE", 1, 2, false);
        declareFunction("html_show_string_with_invalid_constants_highlighted", "HTML-SHOW-STRING-WITH-INVALID-CONSTANTS-HIGHLIGHTED", 1, 1, false);
        declareFunction("normalize_doc_string", "NORMALIZE-DOC-STRING", 1, 0, false);
        declareFunction("convert_cycl_documentation_assertion_to_current_formatting", "CONVERT-CYCL-DOCUMENTATION-ASSERTION-TO-CURRENT-FORMATTING", 1, 0, false);
        declareFunction("convert_cycl_documentation_assertion_to_current_formatting2", "CONVERT-CYCL-DOCUMENTATION-ASSERTION-TO-CURRENT-FORMATTING2", 1, 0, false);
        declareFunction("html_url_princ", "HTML-URL-PRINC", 1, 0, false);
        declareFunction("html_url_princ_char", "HTML-URL-PRINC-CHAR", 1, 0, false);
        declareFunction("html_simple_attribute", "HTML-SIMPLE-ATTRIBUTE", 1, 0, false);
        declareFunction("html_simple_quoted_attribute", "HTML-SIMPLE-QUOTED-ATTRIBUTE", 2, 0, false);
        declareFunction("html_color", "HTML-COLOR", 1, 0, false);
        declareFunction("html_style_background_color", "HTML-STYLE-BACKGROUND-COLOR", 1, 0, false);
        declareFunction("html_align", "HTML-ALIGN", 1, 0, false);
        declareFunction("html_copyright_notice", "HTML-COPYRIGHT-NOTICE", 0, 0, false);
        declareFunction("html_copyright_text", "HTML-COPYRIGHT-TEXT", 0, 0, false);
        declareFunction("html_mailto_url", "HTML-MAILTO-URL", 1, 0, false);
        declareFunction("html_file_url", "HTML-FILE-URL", 1, 0, false);
        declareFunction("html_refresh", "HTML-REFRESH", 1, 0, false);
        declareFunction("html_meta_utf_8_content_type", "HTML-META-UTF-8-CONTENT-TYPE", 0, 0, false);
        declareFunction("html_meta_expires", "HTML-META-EXPIRES", 0, 3, false);
        declareFunction("html_meta_last_modified", "HTML-META-LAST-MODIFIED", 0, 1, false);
        declareFunction("html_meta_dont_cache", "HTML-META-DONT-CACHE", 0, 0, false);
        declareMacro("html_webpage_expires", "HTML-WEBPAGE-EXPIRES");
        declareMacro("html_webpage_last_modified", "HTML-WEBPAGE-LAST-MODIFIED");
        declareMacro("html_dont_cache_webpage", "HTML-DONT-CACHE-WEBPAGE");
        declareFunction("html_meta_no_robots", "HTML-META-NO-ROBOTS", 0, 0, false);
        declareFunction("html_meta_robot_instructions", "HTML-META-ROBOT-INSTRUCTIONS", 0, 2, false);
        declareFunction("html_meta_select_robot_instructions", "HTML-META-SELECT-ROBOT-INSTRUCTIONS", 2, 0, false);
        declareFunction("html_hr", "HTML-HR", 0, 2, false);
        declareFunction("html_line_break", "HTML-LINE-BREAK", 0, 1, false);
        declareFunction("html_br", "HTML-BR", 0, 0, false);
        declareFunction("html_newline", "HTML-NEWLINE", 0, 1, false);
        declareFunction("html_checkbox_input", "HTML-CHECKBOX-INPUT", 1, 5, false);
        declareFunction("html_hidden_input", "HTML-HIDDEN-INPUT", 2, 1, false);
        declareFunction("html_image_input", "HTML-IMAGE-INPUT", 2, 2, false);
        declareFunction("html_password_input", "HTML-PASSWORD-INPUT", 1, 2, false);
        declareFunction("html_radio_input", "HTML-RADIO-INPUT", 1, 2, false);
        declareFunction("html_reset_input", "HTML-RESET-INPUT", 0, 1, false);
        declareFunction("html_submit_input", "HTML-SUBMIT-INPUT", 0, 3, false);
        declareFunction("html_text_input", "HTML-TEXT-INPUT", 1, 2, false);
        declareFunction("html_scripted_text_input", "HTML-SCRIPTED-TEXT-INPUT", 2, 2, false);
        declareFunction("html_disabled_text_input", "HTML-DISABLED-TEXT-INPUT", 1, 2, false);
        declareFunction("html_format_input", "HTML-FORMAT-INPUT", 3, 4, false);
        declareFunction("html_image_multi_submit", "HTML-IMAGE-MULTI-SUBMIT", 1, 1, false);
        declareFunction("html_extract_multi_submit_input", "HTML-EXTRACT-MULTI-SUBMIT-INPUT", 2, 0, false);
        declareFunction("html_extract_multi_submit_input_internal", "HTML-EXTRACT-MULTI-SUBMIT-INPUT-INTERNAL", 3, 0, false);
        declareFunction("html_indent_table_internal", "HTML-INDENT-TABLE-INTERNAL", 1, 0, false);
        declareFunction("html_indent_row_internal", "HTML-INDENT-ROW-INTERNAL", 1, 0, false);
        declareFunction("html_target_definition", "HTML-TARGET-DEFINITION", 1, 0, false);
        declareFunction("html_basefont", "HTML-BASEFONT", 1, 0, false);
        declareFunction("html_word_break", "HTML-WORD-BREAK", 0, 0, false);
        declareFunction("html_print_lexicon_entry", "HTML-PRINT-LEXICON-ENTRY", 1, 0, false);
        declareFunction("html_print_form", "HTML-PRINT-FORM", 1, 2, false);
        declareFunction("html_basic_image", "HTML-BASIC-IMAGE", 1, 3, false);
        declareFunction("html_table_row_list", "HTML-TABLE-ROW-LIST", 1, 0, false);
        declareFunction("html_table_heading_list", "HTML-TABLE-HEADING-LIST", 1, 0, false);
        declareFunction("html_percent_progress_bar", "HTML-PERCENT-PROGRESS-BAR", 2, 3, false);
        declareFunction("html_progress_section", "HTML-PROGRESS-SECTION", 0, 5, false);
        declareFunction("html_horizontal_bar_graph", "HTML-HORIZONTAL-BAR-GRAPH", 1, 4, false);
        declareFunction("html_draw_bargraph_label", "HTML-DRAW-BARGRAPH-LABEL", 1, 0, false);
        declareFunction("html_draw_bargraph_colorbar", "HTML-DRAW-BARGRAPH-COLORBAR", 4, 0, false);
        declareFunction("html_control_parameter_chooser", "HTML-CONTROL-PARAMETER-CHOOSER", 1, 1, false);
        declareFunction("html_extract_control_parameter_value", "HTML-EXTRACT-CONTROL-PARAMETER-VALUE", 2, 0, false);
        declareFunction("html_set_control_parameter", "HTML-SET-CONTROL-PARAMETER", 2, 0, false);
        declareFunction("html_control_parameter_entry_name", "HTML-CONTROL-PARAMETER-ENTRY-NAME", 1, 0, false);
        declareFunction("html_control_parameter_radio_name", "HTML-CONTROL-PARAMETER-RADIO-NAME", 1, 0, false);
        declareFunction("html_select_from_list", "HTML-SELECT-FROM-LIST", 3, 1, false);
        declareFunction("matching_html_field", "MATCHING-HTML-FIELD", 1, 0, false);
        declareFunction("matching_html_button_field", "MATCHING-HTML-BUTTON-FIELD", 1, 0, false);
        declareFunction("html_extract_input", "HTML-EXTRACT-INPUT", 2, 0, false);
        declareFunction("html_extract_input_values", "HTML-EXTRACT-INPUT-VALUES", 2, 0, false);
        declareFunction("html_extract_value", "HTML-EXTRACT-VALUE", 2, 1, false);
        declareFunction("html_extract_string", "HTML-EXTRACT-STRING", 2, 1, false);
        declareFunction("html_extract_boolean", "HTML-EXTRACT-BOOLEAN", 2, 1, false);
        declareFunction("html_extract_button_value", "HTML-EXTRACT-BUTTON-VALUE", 2, 1, false);
        declareFunction("decode_html_language_abbreviation", "DECODE-HTML-LANGUAGE-ABBREVIATION", 1, 0, false);
        declareFunction("html_glyph", "HTML-GLYPH", 1, 1, false);
        declareFunction("html_glyph_markup", "HTML-GLYPH-MARKUP", 1, 0, false);
        declareFunction("html_declare_glyph", "HTML-DECLARE-GLYPH", 2, 0, false);
        declareFunction("html_unicode_char", "HTML-UNICODE-CHAR", 1, 1, false);
        declareFunction("html_create_listbox", "HTML-CREATE-LISTBOX", 2, 4, false);
        declareFunction("html_create_radiobox_form", "HTML-CREATE-RADIOBOX-FORM", 2, 3, false);
        declareFunction("html_create_multiple_selection_listbox", "HTML-CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
        declareFunction("html_create_dropdown_list", "HTML-CREATE-DROPDOWN-LIST", 2, 4, false);
        declareFunction("html_create_simple_dropdown_list", "HTML-CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
        declareFunction("create_listbox", "CREATE-LISTBOX", 2, 3, false);
        declareFunction("create_multiple_selection_listbox", "CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
        declareFunction("create_dropdown_list", "CREATE-DROPDOWN-LIST", 2, 3, false);
        declareFunction("create_simple_dropdown_list", "CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
        declareFunction("get_encoded_form_field_name", "GET-ENCODED-FORM-FIELD-NAME", 1, 0, false);
        declareFunction("extract_encoded_form_field_value", "EXTRACT-ENCODED-FORM-FIELD-VALUE", 2, 0, false);
        declareFunction("encode_form_field_name", "ENCODE-FORM-FIELD-NAME", 1, 0, false);
        declareFunction("html_echo_args", "HTML-ECHO-ARGS", 1, 0, false);
        declareFunction("html_echo_file", "HTML-ECHO-FILE", 1, 0, false);
        declareFunction("remove_html_tags", "REMOVE-HTML-TAGS", 1, 1, false);
        declareFunction("convert_html_to_text", "CONVERT-HTML-TO-TEXT", 1, 0, false);
        declareFunction("url_to_text", "URL-TO-TEXT", 1, 0, false);
        declareFunction("generate_html_filename_input_fieldname", "GENERATE-HTML-FILENAME-INPUT-FIELDNAME", 1, 0, false);
        declareFunction("html_filename_input", "HTML-FILENAME-INPUT", 3, 0, false);
        declareMacro("html_with_file_transmitting_form", "HTML-WITH-FILE-TRANSMITTING-FORM");
        declareFunction("html_arguments_contain_multipart_form_dataP", "HTML-ARGUMENTS-CONTAIN-MULTIPART-FORM-DATA?", 1, 0, false);
        declareFunction("html_parse_multipart_form_data", "HTML-PARSE-MULTIPART-FORM-DATA", 1, 0, false);
        declareFunction("html_parse_consume_separator", "HTML-PARSE-CONSUME-SEPARATOR", 2, 0, false);
        declareFunction("html_parse_data_name_from_content_disposition", "HTML-PARSE-DATA-NAME-FROM-CONTENT-DISPOSITION", 1, 0, false);
        declareFunction("html_parse_multipart_form_line", "HTML-PARSE-MULTIPART-FORM-LINE", 2, 0, false);
        declareFunction("html_construct_message_from_multipart_data", "HTML-CONSTRUCT-MESSAGE-FROM-MULTIPART-DATA", 1, 0, false);
        declareFunction("html_request_arguments_are_multipart_dataP", "HTML-REQUEST-ARGUMENTS-ARE-MULTIPART-DATA?", 1, 0, false);
        declareFunction("html_treemap_table", "HTML-TREEMAP-TABLE", 1, 4, false);
        declareFunction("treemap_size", "TREEMAP-SIZE", 1, 0, false);
        declareFunction("treemap_class_size", "TREEMAP-CLASS-SIZE", 2, 0, false);
        declareFunction("build_treemap", "BUILD-TREEMAP", 5, 0, false);
        declareFunction("html_treemap_table_recursive", "HTML-TREEMAP-TABLE-RECURSIVE", 5, 0, false);
        declareFunction("compute_treemap_color", "COMPUTE-TREEMAP-COLOR", 3, 0, false);
        declareFunction("build_treemap_recursive", "BUILD-TREEMAP-RECURSIVE", 6, 0, false);
        declareFunction("treemap_entry_for_node", "TREEMAP-ENTRY-FOR-NODE", 4, 0, false);
        declareFunction("html_user_id_and_password", "HTML-USER-ID-AND-PASSWORD", 0, 6, false);
        return NIL;
    }

    public static SubLObject declare_html_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("html_flush", "HTML-FLUSH", 0, 0, false);
            declareFunction("html_char", "HTML-CHAR", 1, 1, false);
            declareFunction("html_string", "HTML-STRING", 1, 2, false);
            declareFunction("html_reserved_char_p", "HTML-RESERVED-CHAR-P", 1, 0, false);
            declareFunction("html_escape_string_for_char", "HTML-ESCAPE-STRING-FOR-CHAR", 2, 0, false);
            declareFunction("string_has_any_escape_charsP", "STRING-HAS-ANY-ESCAPE-CHARS?", 2, 0, false);
            declareFunction("html_reserved_character_code_p", "HTML-RESERVED-CHARACTER-CODE-P", 1, 0, false);
            declareFunction("html_escape_string_for_non_ascii_char", "HTML-ESCAPE-STRING-FOR-NON-ASCII-CHAR", 1, 0, false);
            declareFunction("html_escape", "HTML-ESCAPE", 2, 0, false);
            declareFunction("subl_string_to_display_vector_string", "SUBL-STRING-TO-DISPLAY-VECTOR-STRING", 1, 0, false);
            declareFunction("html_princ", "HTML-PRINC", 1, 0, false);
            declareFunction("html_princ_strong", "HTML-PRINC-STRONG", 1, 0, false);
            declareFunction("html_princ_possibly_strong", "HTML-PRINC-POSSIBLY-STRONG", 2, 0, false);
            declareFunction("html_princ_non_breaking", "HTML-PRINC-NON-BREAKING", 1, 0, false);
            declareFunction("html_prin1", "HTML-PRIN1", 1, 0, false);
            declareFunction("html_princ_formatted_string", "HTML-PRINC-FORMATTED-STRING", 1, 0, false);
            declareFunction("html_terpri", "HTML-TERPRI", 0, 1, false);
            declareFunction("html_source_readability_terpri", "HTML-SOURCE-READABILITY-TERPRI", 0, 1, false);
            declareFunction("html_tab", "HTML-TAB", 0, 1, false);
            declareFunction("html_spaces", "HTML-SPACES", 0, 1, false);
            declareFunction("html_indent", "HTML-INDENT", 0, 1, false);
            declareFunction("html_markup", "HTML-MARKUP", 1, 0, false);
            declareFunction("html_print_doc_string", "HTML-PRINT-DOC-STRING", 1, 0, false);
            declareFunction("html_princ_doc_string", "HTML-PRINC-DOC-STRING", 1, 1, false);
            declareFunction("hide_non_ascii_chars", "HIDE-NON-ASCII-CHARS", 1, 0, false);
            declareFunction("html_princ_string_with_hidden_non_ascii_chars", "HTML-PRINC-STRING-WITH-HIDDEN-NON-ASCII-CHARS", 1, 0, false);
            declareFunction("html_princ_cycl_string", "HTML-PRINC-CYCL-STRING", 1, 2, false);
            declareFunction("html_princ_cycl_string_new", "HTML-PRINC-CYCL-STRING-NEW", 3, 0, false);
            declareFunction("html_princ_cycl_string_old", "HTML-PRINC-CYCL-STRING-OLD", 3, 0, false);
            declareFunction("html_cycl_string", "HTML-CYCL-STRING", 1, 2, false);
            declareFunction("opencyc_html_cycl_string", "OPENCYC-HTML-CYCL-STRING", 1, 0, false);
            declareFunction("cb_form_for_cycl_string", "CB-FORM-FOR-CYCL-STRING", 1, 2, false);
            declareFunction("html_stale_constant_reference", "HTML-STALE-CONSTANT-REFERENCE", 1, 2, false);
            declareFunction("html_show_string_with_invalid_constants_highlighted", "HTML-SHOW-STRING-WITH-INVALID-CONSTANTS-HIGHLIGHTED", 1, 1, false);
            declareFunction("html_url_princ", "HTML-URL-PRINC", 1, 0, false);
            declareFunction("html_url_princ_char", "HTML-URL-PRINC-CHAR", 1, 0, false);
            declareFunction("html_simple_attribute", "HTML-SIMPLE-ATTRIBUTE", 1, 0, false);
            declareFunction("html_simple_quoted_attribute", "HTML-SIMPLE-QUOTED-ATTRIBUTE", 2, 0, false);
            declareFunction("html_color", "HTML-COLOR", 1, 0, false);
            declareFunction("html_style_background_color", "HTML-STYLE-BACKGROUND-COLOR", 1, 0, false);
            declareFunction("html_align", "HTML-ALIGN", 1, 0, false);
            declareFunction("html_copyright_notice", "HTML-COPYRIGHT-NOTICE", 0, 0, false);
            declareFunction("html_copyright_text", "HTML-COPYRIGHT-TEXT", 0, 0, false);
            declareFunction("html_mailto_url", "HTML-MAILTO-URL", 1, 0, false);
            declareFunction("html_file_url", "HTML-FILE-URL", 1, 0, false);
            declareFunction("html_refresh", "HTML-REFRESH", 1, 1, false);
            declareFunction("html_meta_utf_8_content_type", "HTML-META-UTF-8-CONTENT-TYPE", 0, 0, false);
            declareFunction("html_meta_expires", "HTML-META-EXPIRES", 0, 3, false);
            declareFunction("html_meta_last_modified", "HTML-META-LAST-MODIFIED", 0, 1, false);
            declareFunction("html_meta_dont_cache", "HTML-META-DONT-CACHE", 0, 0, false);
            declareMacro("html_webpage_expires", "HTML-WEBPAGE-EXPIRES");
            declareMacro("html_webpage_last_modified", "HTML-WEBPAGE-LAST-MODIFIED");
            declareMacro("html_dont_cache_webpage", "HTML-DONT-CACHE-WEBPAGE");
            declareFunction("html_meta_no_robots", "HTML-META-NO-ROBOTS", 0, 0, false);
            declareFunction("html_meta_robot_instructions", "HTML-META-ROBOT-INSTRUCTIONS", 0, 2, false);
            declareFunction("html_meta_select_robot_instructions", "HTML-META-SELECT-ROBOT-INSTRUCTIONS", 2, 0, false);
            declareFunction("html_hr", "HTML-HR", 0, 2, false);
            declareFunction("html_line_break", "HTML-LINE-BREAK", 0, 1, false);
            declareFunction("html_br", "HTML-BR", 0, 0, false);
            declareFunction("html_newline", "HTML-NEWLINE", 0, 1, false);
            declareFunction("html_checkbox_input", "HTML-CHECKBOX-INPUT", 1, 5, false);
            declareFunction("html_hidden_input", "HTML-HIDDEN-INPUT", 2, 1, false);
            declareFunction("html_image_input", "HTML-IMAGE-INPUT", 2, 2, false);
            declareFunction("html_password_input", "HTML-PASSWORD-INPUT", 1, 2, false);
            declareFunction("html_radio_input", "HTML-RADIO-INPUT", 1, 3, false);
            declareFunction("html_reset_input", "HTML-RESET-INPUT", 0, 1, false);
            declareFunction("html_submit_input", "HTML-SUBMIT-INPUT", 0, 3, false);
            declareFunction("html_text_input", "HTML-TEXT-INPUT", 1, 2, false);
            declareFunction("html_scripted_text_input", "HTML-SCRIPTED-TEXT-INPUT", 2, 2, false);
            declareFunction("html_disabled_text_input", "HTML-DISABLED-TEXT-INPUT", 1, 2, false);
            declareFunction("html_format_input", "HTML-FORMAT-INPUT", 3, 4, false);
            declareFunction("html_autocomplete_text_input", "HTML-AUTOCOMPLETE-TEXT-INPUT", 1, 4, false);
            declareFunction("html_image_multi_submit", "HTML-IMAGE-MULTI-SUBMIT", 1, 1, false);
            declareFunction("html_extract_multi_submit_input", "HTML-EXTRACT-MULTI-SUBMIT-INPUT", 2, 0, false);
            declareFunction("html_extract_multi_submit_input_internal", "HTML-EXTRACT-MULTI-SUBMIT-INPUT-INTERNAL", 3, 0, false);
            declareFunction("html_indent_table_internal", "HTML-INDENT-TABLE-INTERNAL", 1, 0, false);
            declareFunction("html_indent_row_internal", "HTML-INDENT-ROW-INTERNAL", 1, 0, false);
            declareFunction("html_target_definition", "HTML-TARGET-DEFINITION", 1, 0, false);
            declareFunction("html_basefont", "HTML-BASEFONT", 1, 0, false);
            declareFunction("html_word_break", "HTML-WORD-BREAK", 0, 0, false);
            declareFunction("html_print_lexicon_entry", "HTML-PRINT-LEXICON-ENTRY", 1, 0, false);
            declareFunction("html_print_form", "HTML-PRINT-FORM", 1, 2, false);
            declareFunction("html_basic_image", "HTML-BASIC-IMAGE", 1, 3, false);
            declareFunction("html_table_row_list", "HTML-TABLE-ROW-LIST", 1, 0, false);
            declareFunction("html_table_heading_list", "HTML-TABLE-HEADING-LIST", 1, 0, false);
            declareFunction("html_percent_progress_bar", "HTML-PERCENT-PROGRESS-BAR", 2, 3, false);
            declareMacro("html_fancy_percent_progress_bar", "HTML-FANCY-PERCENT-PROGRESS-BAR");
            declareFunction("html_fancy_percent_progress_bar_widths", "HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS", 3, 0, false);
            declareFunction("html_progress_section", "HTML-PROGRESS-SECTION", 0, 5, false);
            declareFunction("html_horizontal_bar_graph", "HTML-HORIZONTAL-BAR-GRAPH", 1, 4, false);
            declareFunction("html_draw_bargraph_label", "HTML-DRAW-BARGRAPH-LABEL", 1, 0, false);
            declareFunction("html_draw_bargraph_colorbar", "HTML-DRAW-BARGRAPH-COLORBAR", 4, 0, false);
            declareFunction("html_control_parameter_chooser", "HTML-CONTROL-PARAMETER-CHOOSER", 1, 1, false);
            declareFunction("html_extract_control_parameter_value", "HTML-EXTRACT-CONTROL-PARAMETER-VALUE", 2, 0, false);
            declareFunction("html_set_control_parameter", "HTML-SET-CONTROL-PARAMETER", 2, 0, false);
            declareFunction("html_control_parameter_entry_name", "HTML-CONTROL-PARAMETER-ENTRY-NAME", 1, 0, false);
            declareFunction("html_control_parameter_radio_name", "HTML-CONTROL-PARAMETER-RADIO-NAME", 1, 0, false);
            declareFunction("html_select_from_list", "HTML-SELECT-FROM-LIST", 3, 1, false);
            declareFunction("matching_html_field", "MATCHING-HTML-FIELD", 1, 0, false);
            declareFunction("matching_html_button_field", "MATCHING-HTML-BUTTON-FIELD", 1, 0, false);
            declareFunction("html_extract_input", "HTML-EXTRACT-INPUT", 2, 0, false);
            declareFunction("html_extract_input_values", "HTML-EXTRACT-INPUT-VALUES", 2, 0, false);
            declareFunction("html_extract_value", "HTML-EXTRACT-VALUE", 2, 1, false);
            declareFunction("html_extract_integer", "HTML-EXTRACT-INTEGER", 2, 1, false);
            declareFunction("html_extract_date", "HTML-EXTRACT-DATE", 2, 1, false);
            declareFunction("html_extract_keyword", "HTML-EXTRACT-KEYWORD", 2, 1, false);
            declareFunction("html_extract_string", "HTML-EXTRACT-STRING", 2, 1, false);
            declareFunction("html_extract_boolean", "HTML-EXTRACT-BOOLEAN", 2, 1, false);
            declareFunction("html_extract_sexpr", "HTML-EXTRACT-SEXPR", 2, 1, false);
            declareFunction("html_extract_cyclified_sexpr", "HTML-EXTRACT-CYCLIFIED-SEXPR", 2, 1, false);
            declareFunction("html_extract_sexpr_int", "HTML-EXTRACT-SEXPR-INT", 4, 0, false);
            declareFunction("html_extract_button_value", "HTML-EXTRACT-BUTTON-VALUE", 2, 1, false);
            declareFunction("decode_html_language_abbreviation", "DECODE-HTML-LANGUAGE-ABBREVIATION", 1, 0, false);
            declareFunction("html_glyph", "HTML-GLYPH", 1, 1, false);
            declareFunction("html_glyph_markup", "HTML-GLYPH-MARKUP", 1, 0, false);
            declareFunction("html_declare_glyph", "HTML-DECLARE-GLYPH", 2, 0, false);
            declareFunction("html_unicode_char", "HTML-UNICODE-CHAR", 1, 1, false);
            declareFunction("html_create_listbox", "HTML-CREATE-LISTBOX", 2, 4, false);
            declareFunction("html_create_radiobox_form", "HTML-CREATE-RADIOBOX-FORM", 2, 3, false);
            declareFunction("html_create_multiple_selection_listbox", "HTML-CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
            declareFunction("html_create_dropdown_list", "HTML-CREATE-DROPDOWN-LIST", 2, 4, false);
            declareFunction("html_create_simple_dropdown_list", "HTML-CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
            declareFunction("create_listbox", "CREATE-LISTBOX", 2, 3, false);
            declareFunction("create_multiple_selection_listbox", "CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
            declareFunction("create_dropdown_list", "CREATE-DROPDOWN-LIST", 2, 3, false);
            declareFunction("create_simple_dropdown_list", "CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
            declareFunction("get_encoded_form_field_name", "GET-ENCODED-FORM-FIELD-NAME", 1, 0, false);
            declareFunction("extract_encoded_form_field_value", "EXTRACT-ENCODED-FORM-FIELD-VALUE", 2, 0, false);
            declareFunction("encode_form_field_name", "ENCODE-FORM-FIELD-NAME", 1, 0, false);
            declareFunction("html_echo_args", "HTML-ECHO-ARGS", 1, 0, false);
            declareFunction("html_echo_file", "HTML-ECHO-FILE", 1, 0, false);
            declareFunction("remove_html_tags", "REMOVE-HTML-TAGS", 1, 1, false);
            declareFunction("convert_html_to_text", "CONVERT-HTML-TO-TEXT", 1, 0, false);
            declareFunction("url_to_text", "URL-TO-TEXT", 1, 0, false);
            declareFunction("generate_html_filename_input_fieldname", "GENERATE-HTML-FILENAME-INPUT-FIELDNAME", 1, 0, false);
            declareFunction("html_filename_input", "HTML-FILENAME-INPUT", 3, 0, false);
            declareMacro("html_with_file_transmitting_form", "HTML-WITH-FILE-TRANSMITTING-FORM");
            declareFunction("html_arguments_contain_multipart_form_dataP", "HTML-ARGUMENTS-CONTAIN-MULTIPART-FORM-DATA?", 1, 0, false);
            declareFunction("html_parse_multipart_form_data", "HTML-PARSE-MULTIPART-FORM-DATA", 1, 0, false);
            declareFunction("html_parse_consume_separator", "HTML-PARSE-CONSUME-SEPARATOR", 2, 0, false);
            declareFunction("html_parse_data_name_from_content_disposition", "HTML-PARSE-DATA-NAME-FROM-CONTENT-DISPOSITION", 1, 0, false);
            declareFunction("html_parse_multipart_form_line", "HTML-PARSE-MULTIPART-FORM-LINE", 2, 0, false);
            declareFunction("html_construct_message_from_multipart_data", "HTML-CONSTRUCT-MESSAGE-FROM-MULTIPART-DATA", 1, 0, false);
            declareFunction("html_request_arguments_are_multipart_dataP", "HTML-REQUEST-ARGUMENTS-ARE-MULTIPART-DATA?", 1, 0, false);
            declareFunction("html_treemap_table", "HTML-TREEMAP-TABLE", 1, 4, false);
            declareFunction("treemap_size", "TREEMAP-SIZE", 1, 0, false);
            declareFunction("treemap_class_size", "TREEMAP-CLASS-SIZE", 2, 0, false);
            declareFunction("build_treemap", "BUILD-TREEMAP", 5, 0, false);
            declareFunction("html_treemap_table_recursive", "HTML-TREEMAP-TABLE-RECURSIVE", 5, 0, false);
            declareFunction("compute_treemap_color", "COMPUTE-TREEMAP-COLOR", 3, 0, false);
            declareFunction("build_treemap_recursive", "BUILD-TREEMAP-RECURSIVE", 6, 0, false);
            declareFunction("treemap_entry_for_node", "TREEMAP-ENTRY-FOR-NODE", 4, 0, false);
            declareFunction("html_user_id_and_password", "HTML-USER-ID-AND-PASSWORD", 0, 6, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("print_url_with_tag", "PRINT-URL-WITH-TAG", 1, 0, false);
            declareFunction("print_embedded_constant", "PRINT-EMBEDDED-CONSTANT", 3, 2, false);
            declareFunction("normalize_doc_string", "NORMALIZE-DOC-STRING", 1, 0, false);
            declareFunction("convert_cycl_documentation_assertion_to_current_formatting", "CONVERT-CYCL-DOCUMENTATION-ASSERTION-TO-CURRENT-FORMATTING", 1, 0, false);
            declareFunction("convert_cycl_documentation_assertion_to_current_formatting2", "CONVERT-CYCL-DOCUMENTATION-ASSERTION-TO-CURRENT-FORMATTING2", 1, 0, false);
            declareFunction("html_refresh", "HTML-REFRESH", 1, 0, false);
            declareFunction("html_radio_input", "HTML-RADIO-INPUT", 1, 2, false);
        }
        return NIL;
    }

    public static SubLObject declare_html_utilities_file_Previous() {
        declareFunction("html_flush", "HTML-FLUSH", 0, 0, false);
        declareFunction("html_char", "HTML-CHAR", 1, 1, false);
        declareFunction("html_string", "HTML-STRING", 1, 2, false);
        declareFunction("html_reserved_char_p", "HTML-RESERVED-CHAR-P", 1, 0, false);
        declareFunction("html_escape_string_for_char", "HTML-ESCAPE-STRING-FOR-CHAR", 2, 0, false);
        declareFunction("string_has_any_escape_charsP", "STRING-HAS-ANY-ESCAPE-CHARS?", 2, 0, false);
        declareFunction("html_reserved_character_code_p", "HTML-RESERVED-CHARACTER-CODE-P", 1, 0, false);
        declareFunction("html_escape_string_for_non_ascii_char", "HTML-ESCAPE-STRING-FOR-NON-ASCII-CHAR", 1, 0, false);
        declareFunction("html_escape", "HTML-ESCAPE", 2, 0, false);
        declareFunction("subl_string_to_display_vector_string", "SUBL-STRING-TO-DISPLAY-VECTOR-STRING", 1, 0, false);
        declareFunction("html_princ", "HTML-PRINC", 1, 0, false);
        declareFunction("html_princ_strong", "HTML-PRINC-STRONG", 1, 0, false);
        declareFunction("html_princ_possibly_strong", "HTML-PRINC-POSSIBLY-STRONG", 2, 0, false);
        declareFunction("html_princ_non_breaking", "HTML-PRINC-NON-BREAKING", 1, 0, false);
        declareFunction("html_prin1", "HTML-PRIN1", 1, 0, false);
        declareFunction("html_princ_formatted_string", "HTML-PRINC-FORMATTED-STRING", 1, 0, false);
        declareFunction("html_terpri", "HTML-TERPRI", 0, 1, false);
        declareFunction("html_source_readability_terpri", "HTML-SOURCE-READABILITY-TERPRI", 0, 1, false);
        declareFunction("html_tab", "HTML-TAB", 0, 1, false);
        declareFunction("html_spaces", "HTML-SPACES", 0, 1, false);
        declareFunction("html_indent", "HTML-INDENT", 0, 1, false);
        declareFunction("html_markup", "HTML-MARKUP", 1, 0, false);
        declareFunction("html_print_doc_string", "HTML-PRINT-DOC-STRING", 1, 0, false);
        declareFunction("html_princ_doc_string", "HTML-PRINC-DOC-STRING", 1, 1, false);
        declareFunction("hide_non_ascii_chars", "HIDE-NON-ASCII-CHARS", 1, 0, false);
        declareFunction("html_princ_string_with_hidden_non_ascii_chars", "HTML-PRINC-STRING-WITH-HIDDEN-NON-ASCII-CHARS", 1, 0, false);
        declareFunction("html_princ_cycl_string", "HTML-PRINC-CYCL-STRING", 1, 2, false);
        declareFunction("html_princ_cycl_string_new", "HTML-PRINC-CYCL-STRING-NEW", 3, 0, false);
        declareFunction("html_princ_cycl_string_old", "HTML-PRINC-CYCL-STRING-OLD", 3, 0, false);
        declareFunction("html_cycl_string", "HTML-CYCL-STRING", 1, 2, false);
        declareFunction("opencyc_html_cycl_string", "OPENCYC-HTML-CYCL-STRING", 1, 0, false);
        declareFunction("cb_form_for_cycl_string", "CB-FORM-FOR-CYCL-STRING", 1, 2, false);
        declareFunction("html_stale_constant_reference", "HTML-STALE-CONSTANT-REFERENCE", 1, 2, false);
        declareFunction("html_show_string_with_invalid_constants_highlighted", "HTML-SHOW-STRING-WITH-INVALID-CONSTANTS-HIGHLIGHTED", 1, 1, false);
        declareFunction("html_url_princ", "HTML-URL-PRINC", 1, 0, false);
        declareFunction("html_url_princ_char", "HTML-URL-PRINC-CHAR", 1, 0, false);
        declareFunction("html_simple_attribute", "HTML-SIMPLE-ATTRIBUTE", 1, 0, false);
        declareFunction("html_simple_quoted_attribute", "HTML-SIMPLE-QUOTED-ATTRIBUTE", 2, 0, false);
        declareFunction("html_color", "HTML-COLOR", 1, 0, false);
        declareFunction("html_style_background_color", "HTML-STYLE-BACKGROUND-COLOR", 1, 0, false);
        declareFunction("html_align", "HTML-ALIGN", 1, 0, false);
        declareFunction("html_copyright_notice", "HTML-COPYRIGHT-NOTICE", 0, 0, false);
        declareFunction("html_copyright_text", "HTML-COPYRIGHT-TEXT", 0, 0, false);
        declareFunction("html_mailto_url", "HTML-MAILTO-URL", 1, 0, false);
        declareFunction("html_file_url", "HTML-FILE-URL", 1, 0, false);
        declareFunction("html_refresh", "HTML-REFRESH", 1, 1, false);
        declareFunction("html_meta_utf_8_content_type", "HTML-META-UTF-8-CONTENT-TYPE", 0, 0, false);
        declareFunction("html_meta_expires", "HTML-META-EXPIRES", 0, 3, false);
        declareFunction("html_meta_last_modified", "HTML-META-LAST-MODIFIED", 0, 1, false);
        declareFunction("html_meta_dont_cache", "HTML-META-DONT-CACHE", 0, 0, false);
        declareMacro("html_webpage_expires", "HTML-WEBPAGE-EXPIRES");
        declareMacro("html_webpage_last_modified", "HTML-WEBPAGE-LAST-MODIFIED");
        declareMacro("html_dont_cache_webpage", "HTML-DONT-CACHE-WEBPAGE");
        declareFunction("html_meta_no_robots", "HTML-META-NO-ROBOTS", 0, 0, false);
        declareFunction("html_meta_robot_instructions", "HTML-META-ROBOT-INSTRUCTIONS", 0, 2, false);
        declareFunction("html_meta_select_robot_instructions", "HTML-META-SELECT-ROBOT-INSTRUCTIONS", 2, 0, false);
        declareFunction("html_hr", "HTML-HR", 0, 2, false);
        declareFunction("html_line_break", "HTML-LINE-BREAK", 0, 1, false);
        declareFunction("html_br", "HTML-BR", 0, 0, false);
        declareFunction("html_newline", "HTML-NEWLINE", 0, 1, false);
        declareFunction("html_checkbox_input", "HTML-CHECKBOX-INPUT", 1, 5, false);
        declareFunction("html_hidden_input", "HTML-HIDDEN-INPUT", 2, 1, false);
        declareFunction("html_image_input", "HTML-IMAGE-INPUT", 2, 2, false);
        declareFunction("html_password_input", "HTML-PASSWORD-INPUT", 1, 2, false);
        declareFunction("html_radio_input", "HTML-RADIO-INPUT", 1, 3, false);
        declareFunction("html_reset_input", "HTML-RESET-INPUT", 0, 1, false);
        declareFunction("html_submit_input", "HTML-SUBMIT-INPUT", 0, 3, false);
        declareFunction("html_text_input", "HTML-TEXT-INPUT", 1, 2, false);
        declareFunction("html_scripted_text_input", "HTML-SCRIPTED-TEXT-INPUT", 2, 2, false);
        declareFunction("html_disabled_text_input", "HTML-DISABLED-TEXT-INPUT", 1, 2, false);
        declareFunction("html_format_input", "HTML-FORMAT-INPUT", 3, 4, false);
        declareFunction("html_autocomplete_text_input", "HTML-AUTOCOMPLETE-TEXT-INPUT", 1, 4, false);
        declareFunction("html_image_multi_submit", "HTML-IMAGE-MULTI-SUBMIT", 1, 1, false);
        declareFunction("html_extract_multi_submit_input", "HTML-EXTRACT-MULTI-SUBMIT-INPUT", 2, 0, false);
        declareFunction("html_extract_multi_submit_input_internal", "HTML-EXTRACT-MULTI-SUBMIT-INPUT-INTERNAL", 3, 0, false);
        declareFunction("html_indent_table_internal", "HTML-INDENT-TABLE-INTERNAL", 1, 0, false);
        declareFunction("html_indent_row_internal", "HTML-INDENT-ROW-INTERNAL", 1, 0, false);
        declareFunction("html_target_definition", "HTML-TARGET-DEFINITION", 1, 0, false);
        declareFunction("html_basefont", "HTML-BASEFONT", 1, 0, false);
        declareFunction("html_word_break", "HTML-WORD-BREAK", 0, 0, false);
        declareFunction("html_print_lexicon_entry", "HTML-PRINT-LEXICON-ENTRY", 1, 0, false);
        declareFunction("html_print_form", "HTML-PRINT-FORM", 1, 2, false);
        declareFunction("html_basic_image", "HTML-BASIC-IMAGE", 1, 3, false);
        declareFunction("html_table_row_list", "HTML-TABLE-ROW-LIST", 1, 0, false);
        declareFunction("html_table_heading_list", "HTML-TABLE-HEADING-LIST", 1, 0, false);
        declareFunction("html_percent_progress_bar", "HTML-PERCENT-PROGRESS-BAR", 2, 3, false);
        declareMacro("html_fancy_percent_progress_bar", "HTML-FANCY-PERCENT-PROGRESS-BAR");
        declareFunction("html_fancy_percent_progress_bar_widths", "HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS", 3, 0, false);
        declareFunction("html_progress_section", "HTML-PROGRESS-SECTION", 0, 5, false);
        declareFunction("html_horizontal_bar_graph", "HTML-HORIZONTAL-BAR-GRAPH", 1, 4, false);
        declareFunction("html_draw_bargraph_label", "HTML-DRAW-BARGRAPH-LABEL", 1, 0, false);
        declareFunction("html_draw_bargraph_colorbar", "HTML-DRAW-BARGRAPH-COLORBAR", 4, 0, false);
        declareFunction("html_control_parameter_chooser", "HTML-CONTROL-PARAMETER-CHOOSER", 1, 1, false);
        declareFunction("html_extract_control_parameter_value", "HTML-EXTRACT-CONTROL-PARAMETER-VALUE", 2, 0, false);
        declareFunction("html_set_control_parameter", "HTML-SET-CONTROL-PARAMETER", 2, 0, false);
        declareFunction("html_control_parameter_entry_name", "HTML-CONTROL-PARAMETER-ENTRY-NAME", 1, 0, false);
        declareFunction("html_control_parameter_radio_name", "HTML-CONTROL-PARAMETER-RADIO-NAME", 1, 0, false);
        declareFunction("html_select_from_list", "HTML-SELECT-FROM-LIST", 3, 1, false);
        declareFunction("matching_html_field", "MATCHING-HTML-FIELD", 1, 0, false);
        declareFunction("matching_html_button_field", "MATCHING-HTML-BUTTON-FIELD", 1, 0, false);
        declareFunction("html_extract_input", "HTML-EXTRACT-INPUT", 2, 0, false);
        declareFunction("html_extract_input_values", "HTML-EXTRACT-INPUT-VALUES", 2, 0, false);
        declareFunction("html_extract_value", "HTML-EXTRACT-VALUE", 2, 1, false);
        declareFunction("html_extract_integer", "HTML-EXTRACT-INTEGER", 2, 1, false);
        declareFunction("html_extract_date", "HTML-EXTRACT-DATE", 2, 1, false);
        declareFunction("html_extract_keyword", "HTML-EXTRACT-KEYWORD", 2, 1, false);
        declareFunction("html_extract_string", "HTML-EXTRACT-STRING", 2, 1, false);
        declareFunction("html_extract_boolean", "HTML-EXTRACT-BOOLEAN", 2, 1, false);
        declareFunction("html_extract_sexpr", "HTML-EXTRACT-SEXPR", 2, 1, false);
        declareFunction("html_extract_cyclified_sexpr", "HTML-EXTRACT-CYCLIFIED-SEXPR", 2, 1, false);
        declareFunction("html_extract_sexpr_int", "HTML-EXTRACT-SEXPR-INT", 4, 0, false);
        declareFunction("html_extract_button_value", "HTML-EXTRACT-BUTTON-VALUE", 2, 1, false);
        declareFunction("decode_html_language_abbreviation", "DECODE-HTML-LANGUAGE-ABBREVIATION", 1, 0, false);
        declareFunction("html_glyph", "HTML-GLYPH", 1, 1, false);
        declareFunction("html_glyph_markup", "HTML-GLYPH-MARKUP", 1, 0, false);
        declareFunction("html_declare_glyph", "HTML-DECLARE-GLYPH", 2, 0, false);
        declareFunction("html_unicode_char", "HTML-UNICODE-CHAR", 1, 1, false);
        declareFunction("html_create_listbox", "HTML-CREATE-LISTBOX", 2, 4, false);
        declareFunction("html_create_radiobox_form", "HTML-CREATE-RADIOBOX-FORM", 2, 3, false);
        declareFunction("html_create_multiple_selection_listbox", "HTML-CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
        declareFunction("html_create_dropdown_list", "HTML-CREATE-DROPDOWN-LIST", 2, 4, false);
        declareFunction("html_create_simple_dropdown_list", "HTML-CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
        declareFunction("create_listbox", "CREATE-LISTBOX", 2, 3, false);
        declareFunction("create_multiple_selection_listbox", "CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
        declareFunction("create_dropdown_list", "CREATE-DROPDOWN-LIST", 2, 3, false);
        declareFunction("create_simple_dropdown_list", "CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
        declareFunction("get_encoded_form_field_name", "GET-ENCODED-FORM-FIELD-NAME", 1, 0, false);
        declareFunction("extract_encoded_form_field_value", "EXTRACT-ENCODED-FORM-FIELD-VALUE", 2, 0, false);
        declareFunction("encode_form_field_name", "ENCODE-FORM-FIELD-NAME", 1, 0, false);
        declareFunction("html_echo_args", "HTML-ECHO-ARGS", 1, 0, false);
        declareFunction("html_echo_file", "HTML-ECHO-FILE", 1, 0, false);
        declareFunction("remove_html_tags", "REMOVE-HTML-TAGS", 1, 1, false);
        declareFunction("convert_html_to_text", "CONVERT-HTML-TO-TEXT", 1, 0, false);
        declareFunction("url_to_text", "URL-TO-TEXT", 1, 0, false);
        declareFunction("generate_html_filename_input_fieldname", "GENERATE-HTML-FILENAME-INPUT-FIELDNAME", 1, 0, false);
        declareFunction("html_filename_input", "HTML-FILENAME-INPUT", 3, 0, false);
        declareMacro("html_with_file_transmitting_form", "HTML-WITH-FILE-TRANSMITTING-FORM");
        declareFunction("html_arguments_contain_multipart_form_dataP", "HTML-ARGUMENTS-CONTAIN-MULTIPART-FORM-DATA?", 1, 0, false);
        declareFunction("html_parse_multipart_form_data", "HTML-PARSE-MULTIPART-FORM-DATA", 1, 0, false);
        declareFunction("html_parse_consume_separator", "HTML-PARSE-CONSUME-SEPARATOR", 2, 0, false);
        declareFunction("html_parse_data_name_from_content_disposition", "HTML-PARSE-DATA-NAME-FROM-CONTENT-DISPOSITION", 1, 0, false);
        declareFunction("html_parse_multipart_form_line", "HTML-PARSE-MULTIPART-FORM-LINE", 2, 0, false);
        declareFunction("html_construct_message_from_multipart_data", "HTML-CONSTRUCT-MESSAGE-FROM-MULTIPART-DATA", 1, 0, false);
        declareFunction("html_request_arguments_are_multipart_dataP", "HTML-REQUEST-ARGUMENTS-ARE-MULTIPART-DATA?", 1, 0, false);
        declareFunction("html_treemap_table", "HTML-TREEMAP-TABLE", 1, 4, false);
        declareFunction("treemap_size", "TREEMAP-SIZE", 1, 0, false);
        declareFunction("treemap_class_size", "TREEMAP-CLASS-SIZE", 2, 0, false);
        declareFunction("build_treemap", "BUILD-TREEMAP", 5, 0, false);
        declareFunction("html_treemap_table_recursive", "HTML-TREEMAP-TABLE-RECURSIVE", 5, 0, false);
        declareFunction("compute_treemap_color", "COMPUTE-TREEMAP-COLOR", 3, 0, false);
        declareFunction("build_treemap_recursive", "BUILD-TREEMAP-RECURSIVE", 6, 0, false);
        declareFunction("treemap_entry_for_node", "TREEMAP-ENTRY-FOR-NODE", 4, 0, false);
        declareFunction("html_user_id_and_password", "HTML-USER-ID-AND-PASSWORD", 0, 6, false);
        return NIL;
    }

    public static final SubLObject init_html_utilities_file_alt() {
        defparameter("*CB-USE-FRAMES*", T);
        deflexical("*CYCL-STRING-ALLOWABLE-HTML-TAGS*", $list_alt9);
        deflexical("*EMBEDDED-CONSTANT-SUFFIX-STRINGS*", $list_alt34);
        defparameter("*HTML-STALE-CONSTANT-REFERENCE-COLOR*", $RED);
        defparameter("*HTML-URL-PRINC-ESCAPE-SPACES*", T);
        defparameter("*HTML-STYLE-BACKGROUND*", $str_alt59$background_color_);
        defparameter("*HTML-ALIGN-MAP*", $list_alt60);
        defparameter("*CYCORP-HOMEPAGE-URL*", $str_alt61$http___www_cyc_com);
        defparameter("*CYCORP-HOMEPAGE-TEXT*", $$$Cycorp);
        deflexical("*PROPRIETARITY-MESSAGE*", NIL != boundp($proprietarity_message$) ? ((SubLObject) ($proprietarity_message$.getGlobalValue())) : $str_alt37$);
        defparameter("*HTML-EXTRACT-FIELD-NAME*", NIL);
        deflexical("*URL-TO-TEXT-REPLACEMENTS*", $list_alt642);
        deflexical("*HTML-FILENAME-INPUT-PREFIX*", $str_alt650$_file_input_);
        deflexical("*HTML-MULTIPART-FORM-DATE*", $str_alt664$_multipart_formdata);
        defconstant("*HTML-NEWLINE-STRING*", Strings.make_string(ONE_INTEGER, CHAR_newline));
        deflexical("*HTML-MULTIPART-CONTENT-MARKER*", $str_alt670$____________________);
        deflexical("*HTML-MULTIPART-CONTENT-MARKER-SIZE*", length($html_multipart_content_marker$.getGlobalValue()));
        defparameter("*BUILD-TREEMAP-DEPTH*", ZERO_INTEGER);
        deflexical("*BUILD-TREEMAP-MAX-DEPTH*", TEN_INTEGER);
        return NIL;
    }

    public static SubLObject init_html_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CB-USE-FRAMES*", T);
            defparameter("*USE-NEW-HTML-PRINC-CYCL-STRING?*", T);
            defparameter("*HTML-STALE-CONSTANT-REFERENCE-COLOR*", NIL);
            defparameter("*HTML-URL-PRINC-ESCAPE-SPACES*", T);
            defparameter("*HTML-STYLE-BACKGROUND*", $str48$background_color_);
            defparameter("*HTML-ALIGN-MAP*", $list49);
            defparameter("*CYCORP-HOMEPAGE-URL*", $str50$http___www_cyc_com);
            defparameter("*CYCORP-HOMEPAGE-TEXT*", $$$Cycorp);
            deflexical("*PROPRIETARITY-MESSAGE*", SubLTrampolineFile.maybeDefault($proprietarity_message$, $proprietarity_message$, $str47$));
            defparameter("*HTML-EXTRACT-FIELD-NAME*", NIL);
            deflexical("*URL-TO-TEXT-REPLACEMENTS*", $list689);
            deflexical("*HTML-FILENAME-INPUT-PREFIX*", $str696$_file_input_);
            deflexical("*HTML-MULTIPART-FORM-DATE*", $str710$_multipart_formdata);
            defconstant("*HTML-NEWLINE-STRING*", Strings.make_string(ONE_INTEGER, CHAR_newline));
            deflexical("*HTML-MULTIPART-CONTENT-MARKER*", $str716$____________________);
            deflexical("*HTML-MULTIPART-CONTENT-MARKER-SIZE*", length($html_multipart_content_marker$.getGlobalValue()));
            defparameter("*BUILD-TREEMAP-DEPTH*", ZERO_INTEGER);
            deflexical("*BUILD-TREEMAP-MAX-DEPTH*", TEN_INTEGER);
            defconstant("*HTML-UTILS-TEST*", $$$HTML_Utilities_Test);
            defconstant("*HTML-UTILS-TEST-CATEGORY*", cconcatenate($html_utils_test$.getGlobalValue(), $$$_Category));
            defconstant("*HTML-UTILS-TEST-SUITE*", cconcatenate($html_utils_test$.getGlobalValue(), $$$_Suite));
            defconstant("*HTML-UTILS-MODULE*", $str746$HTML_Utilities);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CYCL-STRING-ALLOWABLE-HTML-TAGS*", $list_alt9);
            deflexical("*EMBEDDED-CONSTANT-SUFFIX-STRINGS*", $list_alt34);
            defparameter("*HTML-STALE-CONSTANT-REFERENCE-COLOR*", $RED);
            defparameter("*HTML-STYLE-BACKGROUND*", $str_alt59$background_color_);
            defparameter("*HTML-ALIGN-MAP*", $list_alt60);
            defparameter("*CYCORP-HOMEPAGE-URL*", $str_alt61$http___www_cyc_com);
            deflexical("*PROPRIETARITY-MESSAGE*", NIL != boundp($proprietarity_message$) ? ((SubLObject) ($proprietarity_message$.getGlobalValue())) : $str_alt37$);
            deflexical("*URL-TO-TEXT-REPLACEMENTS*", $list_alt642);
            deflexical("*HTML-FILENAME-INPUT-PREFIX*", $str_alt650$_file_input_);
            deflexical("*HTML-MULTIPART-FORM-DATE*", $str_alt664$_multipart_formdata);
            deflexical("*HTML-MULTIPART-CONTENT-MARKER*", $str_alt670$____________________);
        }
        return NIL;
    }

    public static SubLObject init_html_utilities_file_Previous() {
        defparameter("*CB-USE-FRAMES*", T);
        defparameter("*USE-NEW-HTML-PRINC-CYCL-STRING?*", T);
        defparameter("*HTML-STALE-CONSTANT-REFERENCE-COLOR*", NIL);
        defparameter("*HTML-URL-PRINC-ESCAPE-SPACES*", T);
        defparameter("*HTML-STYLE-BACKGROUND*", $str48$background_color_);
        defparameter("*HTML-ALIGN-MAP*", $list49);
        defparameter("*CYCORP-HOMEPAGE-URL*", $str50$http___www_cyc_com);
        defparameter("*CYCORP-HOMEPAGE-TEXT*", $$$Cycorp);
        deflexical("*PROPRIETARITY-MESSAGE*", SubLTrampolineFile.maybeDefault($proprietarity_message$, $proprietarity_message$, $str47$));
        defparameter("*HTML-EXTRACT-FIELD-NAME*", NIL);
        deflexical("*URL-TO-TEXT-REPLACEMENTS*", $list689);
        deflexical("*HTML-FILENAME-INPUT-PREFIX*", $str696$_file_input_);
        deflexical("*HTML-MULTIPART-FORM-DATE*", $str710$_multipart_formdata);
        defconstant("*HTML-NEWLINE-STRING*", Strings.make_string(ONE_INTEGER, CHAR_newline));
        deflexical("*HTML-MULTIPART-CONTENT-MARKER*", $str716$____________________);
        deflexical("*HTML-MULTIPART-CONTENT-MARKER-SIZE*", length($html_multipart_content_marker$.getGlobalValue()));
        defparameter("*BUILD-TREEMAP-DEPTH*", ZERO_INTEGER);
        deflexical("*BUILD-TREEMAP-MAX-DEPTH*", TEN_INTEGER);
        defconstant("*HTML-UTILS-TEST*", $$$HTML_Utilities_Test);
        defconstant("*HTML-UTILS-TEST-CATEGORY*", cconcatenate($html_utils_test$.getGlobalValue(), $$$_Category));
        defconstant("*HTML-UTILS-TEST-SUITE*", cconcatenate($html_utils_test$.getGlobalValue(), $$$_Suite));
        defconstant("*HTML-UTILS-MODULE*", $str746$HTML_Utilities);
        return NIL;
    }

    public static final SubLObject setup_html_utilities_file_alt() {
        register_html_state_variable($cb_use_frames$);
        register_html_interface_variable($cb_use_frames$);
        define_test_case_table_int(OPENCYC_HTML_CYCL_STRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt31);
        declare_defglobal($proprietarity_message$);
        sethash($CYC_LOGO_SMALL_VIOLET_FULL_URL, $html_icon_definitions$.getGlobalValue(), list($str_alt68$cyc_logo_violet_16_gif, NIL));
        sethash($CYC_LOGO_LARGE_VIOLET_FULL_URL, $html_icon_definitions$.getGlobalValue(), list($str_alt70$cyc_logo_violet_60_gif, NIL));
        sethash($CYCORP_SYMBOL_TINY, $html_icon_definitions$.getGlobalValue(), list($str_alt72$cyc_logo_tiny_gif, NIL));
        sethash($CYCORP_SYMBOL_SMALL, $html_icon_definitions$.getGlobalValue(), list($str_alt74$cyc_logo_sm_gif, NIL));
        sethash($CYCORP_SYMBOL_MEDIUM, $html_icon_definitions$.getGlobalValue(), list($str_alt76$cyc_logo_10_t_gif, NIL));
        sethash($CYCORP_LOGO_MEDIUM, $html_icon_definitions$.getGlobalValue(), list($str_alt78$cyc_logo_25_t_gif, NIL));
        sethash($CYCORP_LOGO_BIG, $html_icon_definitions$.getGlobalValue(), list($str_alt80$cyc_logo_50_t_gif, NIL));
        html_declare_glyph($LT, $str_alt169$_lt_);
        html_declare_glyph($GT, $str_alt171$_gt_);
        html_declare_glyph($AMP, $str_alt173$_amp_);
        html_declare_glyph($QUOT, $str_alt175$_quot_);
        html_declare_glyph($REG, $str_alt177$_reg_);
        html_declare_glyph($COPY, $str_alt179$_copy_);
        html_declare_glyph($NBSP, $str_alt180$_nbsp_);
        html_declare_glyph($EMSP, $str_alt182$_emsp_);
        html_declare_glyph($ENSP, $str_alt184$_ensp_);
        html_declare_glyph($IEXCL, $str_alt186$_iexcl_);
        html_declare_glyph($CENT, $str_alt188$_cent_);
        html_declare_glyph($POUND, $str_alt190$_pound_);
        html_declare_glyph($CURREN, $str_alt192$_curren_);
        html_declare_glyph($YEN, $str_alt194$_yen_);
        html_declare_glyph($BRVBAR, $str_alt196$_brvba_);
        html_declare_glyph($SECT, $str_alt198$_sect_);
        html_declare_glyph($UML, $str_alt200$_uml_);
        html_declare_glyph($COPY, $str_alt179$_copy_);
        html_declare_glyph($ORDF, $str_alt202$_ordf_);
        html_declare_glyph($LAQUO, $str_alt204$_laquo_);
        html_declare_glyph($NOT, $str_alt206$_not_);
        html_declare_glyph($SHY, $str_alt208$_shy_);
        html_declare_glyph($REG, $str_alt177$_reg_);
        html_declare_glyph($MACR, $str_alt210$_macr_);
        html_declare_glyph($DEG, $str_alt212$_deg_);
        html_declare_glyph($PLUSMN, $str_alt214$_plusmn_);
        html_declare_glyph($SUP2, $str_alt216$_sup2_);
        html_declare_glyph($SUP3, $str_alt218$_sup3_);
        html_declare_glyph($ACUTE, $str_alt220$_acute_);
        html_declare_glyph($MICRO, $str_alt222$_micro_);
        html_declare_glyph($PARA, $str_alt224$_para_);
        html_declare_glyph($MIDDOT, $str_alt226$_middoy_);
        html_declare_glyph($CEDIL, $str_alt228$_cedil_);
        html_declare_glyph($SUP1, $str_alt230$_sup1_);
        html_declare_glyph($ORDM, $str_alt232$_ordm_);
        html_declare_glyph($RAQUO, $str_alt234$_raquo_);
        html_declare_glyph($FRAC14, $str_alt236$_frac14_);
        html_declare_glyph($FRAC12, $str_alt238$_frac12_);
        html_declare_glyph($FRAC34, $str_alt240$_frac34_);
        html_declare_glyph($IQUEST, $str_alt242$_iquest_);
        html_declare_glyph($AGRAVE_CAP, $str_alt244$_Agrave_);
        html_declare_glyph($AACUTE_CAP, $str_alt246$_Aacute_);
        html_declare_glyph($ACIRC_CAP, $str_alt248$_Acirc_);
        html_declare_glyph($ATILDE_CAP, $str_alt250$_Atilde_);
        html_declare_glyph($AUML_CAP, $str_alt252$_Auml_);
        html_declare_glyph($ARING_CAP, $str_alt254$_Aring_);
        html_declare_glyph($AELIG_CAP, $str_alt256$_AElig_);
        html_declare_glyph($CCEDIL_CAP, $str_alt258$_Ccedil_);
        html_declare_glyph($EGRAVE_CAP, $str_alt260$_Egrave_);
        html_declare_glyph($EACUTE_CAP, $str_alt262$_Eacute_);
        html_declare_glyph($ECIRC_CAP, $str_alt264$_Ecirc_);
        html_declare_glyph($EUML_CAP, $str_alt266$_Euml_);
        html_declare_glyph($IGRAVE_CAP, $str_alt268$_Igrave_);
        html_declare_glyph($IACUTE_CAP, $str_alt270$_Iacute_);
        html_declare_glyph($ICIRC_CAP, $str_alt272$_Icirc_);
        html_declare_glyph($IUML_CAP, $str_alt274$_Iuml_);
        html_declare_glyph($ETH_CAP, $str_alt276$_ETH_);
        html_declare_glyph($NTILDE_CAP, $str_alt278$_Ntilde_);
        html_declare_glyph($OGRAVE_CAP, $str_alt280$_Ograve_);
        html_declare_glyph($OACUTE_CAP, $str_alt282$_Oacute_);
        html_declare_glyph($OCIRC_CAP, $str_alt284$_Ocirc_);
        html_declare_glyph($OTILDE_CAP, $str_alt286$_Otilde_);
        html_declare_glyph($OUML_CAP, $str_alt288$_Ouml_);
        html_declare_glyph($TIMES, $str_alt290$_times_);
        html_declare_glyph($OSLASH_CAP, $str_alt292$_Oslash_);
        html_declare_glyph($UGRAVE_CAP, $str_alt294$_Ugrave_);
        html_declare_glyph($UACUTE_CAP, $str_alt296$_Uacute_);
        html_declare_glyph($UCIRC_CAP, $str_alt298$_Ucirc_);
        html_declare_glyph($UUML_CAP, $str_alt300$_Uuml_);
        html_declare_glyph($YACUTE_CAP, $str_alt302$_Yacute_);
        html_declare_glyph($THORN_CAP, $str_alt304$_THORN_);
        html_declare_glyph($SZLIG, $str_alt306$_szlig_);
        html_declare_glyph($AGRAVE, $str_alt308$_agrave_);
        html_declare_glyph($AACUTE, $str_alt310$_aacute_);
        html_declare_glyph($ACIRC, $str_alt312$_acirc_);
        html_declare_glyph($ATILDE, $str_alt314$_atilde_);
        html_declare_glyph($AUML, $str_alt316$_auml_);
        html_declare_glyph($ARING, $str_alt318$_aring_);
        html_declare_glyph($AELIG, $str_alt320$_aelig_);
        html_declare_glyph($CCEDIL, $str_alt322$_ccedil_);
        html_declare_glyph($EGRAVE, $str_alt324$_egrave_);
        html_declare_glyph($EACUTE, $str_alt326$_eacute_);
        html_declare_glyph($ECIRC, $str_alt328$_ecirc_);
        html_declare_glyph($EUML, $str_alt330$_euml_);
        html_declare_glyph($IGRAVE, $str_alt332$_igrave_);
        html_declare_glyph($IACUTE, $str_alt334$_iacute_);
        html_declare_glyph($ICIRC, $str_alt336$_icirc_);
        html_declare_glyph($IUML, $str_alt338$_iuml_);
        html_declare_glyph($ETH, $str_alt340$_eth_);
        html_declare_glyph($NTILDE, $str_alt342$_ntilde_);
        html_declare_glyph($OGRAVE, $str_alt344$_ograve_);
        html_declare_glyph($OACUTE, $str_alt346$_oacute_);
        html_declare_glyph($OCIRC, $str_alt348$_ocirc_);
        html_declare_glyph($OTILDE, $str_alt350$_otilde_);
        html_declare_glyph($OUML, $str_alt352$_ouml_);
        html_declare_glyph($DIVIDE, $str_alt354$_divide_);
        html_declare_glyph($OSLASH, $str_alt356$_oslash_);
        html_declare_glyph($UGRAVE, $str_alt358$_ugrave_);
        html_declare_glyph($UACUTE, $str_alt360$_uacute_);
        html_declare_glyph($UCIRC, $str_alt362$_ucirc_);
        html_declare_glyph($UUML, $str_alt364$_uuml_);
        html_declare_glyph($YACUTE, $str_alt366$_yacute_);
        html_declare_glyph($THORN, $str_alt368$_thorn_);
        html_declare_glyph($YUML, $str_alt370$_yuml_);
        html_declare_glyph($FNOF, $str_alt372$_fnof_);
        html_declare_glyph($ALPHA_CAP, $str_alt374$_Alpha_);
        html_declare_glyph($BETA_CAP, $str_alt376$_Beta_);
        html_declare_glyph($GAMMA_CAP, $str_alt378$_Gamma_);
        html_declare_glyph($DELTA_CAP, $str_alt380$_Delta_);
        html_declare_glyph($EPSILON_CAP, $str_alt382$_Epsilon_);
        html_declare_glyph($ZETA_CAP, $str_alt384$_Zeta_);
        html_declare_glyph($ETA_CAP, $str_alt386$_Eta_);
        html_declare_glyph($THETA_CAP, $str_alt388$_Theta_);
        html_declare_glyph($IOTA_CAP, $str_alt390$_Iota_);
        html_declare_glyph($KAPPA_CAP, $str_alt392$_Kappa_);
        html_declare_glyph($LAMBDA_CAP, $str_alt394$_Lambda_);
        html_declare_glyph($MU_CAP, $str_alt396$_Mu_);
        html_declare_glyph($NU_CAP, $str_alt398$_Nu_);
        html_declare_glyph($XI_CAP, $str_alt400$_Xi_);
        html_declare_glyph($OMICRON_CAP, $str_alt402$_Omicron_);
        html_declare_glyph($PI_CAP, $str_alt404$_Pi_);
        html_declare_glyph($RHO_CAP, $str_alt406$_Rho_);
        html_declare_glyph($SIGMA_CAP, $str_alt408$_Sigma_);
        html_declare_glyph($TAU_CAP, $str_alt410$_Tau_);
        html_declare_glyph($UPSILON_CAP, $str_alt412$_Upsilon_);
        html_declare_glyph($PHI_CAP, $str_alt414$_Phi_);
        html_declare_glyph($CHI_CAP, $str_alt416$_Chi_);
        html_declare_glyph($PSI_CAP, $str_alt418$_Psi_);
        html_declare_glyph($OMEGA_CAP, $str_alt420$_Omega_);
        html_declare_glyph($ALPHA, $str_alt422$_alpha_);
        html_declare_glyph($BETA, $str_alt424$_beta_);
        html_declare_glyph($GAMMA, $str_alt426$_gamma_);
        html_declare_glyph($DELTA, $str_alt428$_delta_);
        html_declare_glyph($EPSILON, $str_alt430$_epsilon_);
        html_declare_glyph($ZETA, $str_alt432$_zeta_);
        html_declare_glyph($ETA, $str_alt434$_eta_);
        html_declare_glyph($THETA, $str_alt436$_theta_);
        html_declare_glyph($IOTA, $str_alt438$_iota_);
        html_declare_glyph($KAPPA, $str_alt440$_kappa_);
        html_declare_glyph($LAMBDA, $str_alt442$_lambda_);
        html_declare_glyph($MU, $str_alt444$_mu_);
        html_declare_glyph($NU, $str_alt446$_nu_);
        html_declare_glyph($XI, $str_alt448$_xi_);
        html_declare_glyph($OMICRON, $str_alt450$_omicron_);
        html_declare_glyph($PI, $str_alt452$_pi_);
        html_declare_glyph($RHO, $str_alt454$_rho_);
        html_declare_glyph($SIGMAF, $str_alt456$_sigmaf_);
        html_declare_glyph($SIGMA, $str_alt458$_sigma_);
        html_declare_glyph($TAU, $str_alt460$_tau_);
        html_declare_glyph($UPSILON, $str_alt462$_upsilon_);
        html_declare_glyph($PHI, $str_alt464$_phi_);
        html_declare_glyph($CHI, $str_alt466$_chi_);
        html_declare_glyph($PSI, $str_alt468$_psi_);
        html_declare_glyph($OMEGA, $str_alt470$_omega_);
        html_declare_glyph($THETASYM, $str_alt436$_theta_);
        html_declare_glyph($UPSIH, $str_alt473$_upsih_);
        html_declare_glyph($PIV, $str_alt475$_piv_);
        html_declare_glyph($BULL, $str_alt477$_bull_);
        html_declare_glyph($HELLIP, $str_alt479$_hellip_);
        html_declare_glyph($PRIME, $str_alt481$_prime_);
        html_declare_glyph($PRIME_DBL, $str_alt483$_Prime_);
        html_declare_glyph($OLINE, $str_alt485$_oline_);
        html_declare_glyph($FRASL, $str_alt487$_frasl_);
        html_declare_glyph($WEIERP, $str_alt489$_weierp_);
        html_declare_glyph($IMAGE, $str_alt491$_image_);
        html_declare_glyph($REAL, $str_alt493$_real_);
        html_declare_glyph($TRADE, $str_alt495$_trade_);
        html_declare_glyph($ALEFSYM, $str_alt497$_alefsym_);
        html_declare_glyph($UPWARDS_ARROW, $str_alt499$_uarr_);
        html_declare_glyph($RIGHTWARDS_ARROW, $str_alt501$_rarr_);
        html_declare_glyph($LARR, $str_alt503$_larr_);
        html_declare_glyph($UARR, $str_alt499$_uarr_);
        html_declare_glyph($RARR, $str_alt501$_rarr_);
        html_declare_glyph($DARR, $str_alt507$_darr_);
        html_declare_glyph($HARR, $str_alt509$_harr_);
        html_declare_glyph($CRARR, $str_alt511$_crarr_);
        html_declare_glyph($LARR_DBL, $str_alt513$_lArr_);
        html_declare_glyph($UARR_DBL, $str_alt515$_uArr_);
        html_declare_glyph($RARR_DBL, $str_alt517$_rArr_);
        html_declare_glyph($DARR_DBL, $str_alt519$_dArr_);
        html_declare_glyph($HARR_DBL, $str_alt521$_hArr_);
        html_declare_glyph($FORALL, $str_alt523$_forall_);
        html_declare_glyph($PART, $str_alt525$_part_);
        html_declare_glyph($EXIST, $str_alt527$_exist_);
        html_declare_glyph($EMPTY, $str_alt529$_empty_);
        html_declare_glyph($NABLA, $str_alt531$_nabla_);
        html_declare_glyph($ISIN, $str_alt533$_isin_);
        html_declare_glyph($NOTIN, $str_alt535$_notin_);
        html_declare_glyph($NI, $str_alt537$_ni_);
        html_declare_glyph($PROD, $str_alt539$_prod_);
        html_declare_glyph($SUM, $str_alt541$_sum_);
        html_declare_glyph($MINUS, $str_alt543$_minus_);
        html_declare_glyph($LOWAST, $str_alt545$_lowast_);
        html_declare_glyph($RADIC, $str_alt547$_radic_);
        html_declare_glyph($PROP, $str_alt549$_prop_);
        html_declare_glyph($INFIN, $str_alt551$_infin_);
        html_declare_glyph($ANG, $str_alt553$_ang_);
        html_declare_glyph($AND, $str_alt555$_and_);
        html_declare_glyph($OR, $str_alt557$_or_);
        html_declare_glyph($CAP, $str_alt559$_cap_);
        html_declare_glyph($CUP, $str_alt561$_cup_);
        html_declare_glyph($INT, $str_alt563$_int_);
        html_declare_glyph($THERE4, $str_alt565$_there4_);
        html_declare_glyph($SIM, $str_alt567$_sim_);
        html_declare_glyph($CONG, $str_alt569$_cong_);
        html_declare_glyph($ASYMP, $str_alt571$_asymp_);
        html_declare_glyph($NE, $str_alt573$_ne_);
        html_declare_glyph($EQUIV, $str_alt575$_equiv_);
        html_declare_glyph($LE, $str_alt577$_le_);
        html_declare_glyph($GE, $str_alt579$_ge_);
        html_declare_glyph($SUB, $str_alt581$_sub_);
        html_declare_glyph($SUP, $str_alt583$_sup_);
        html_declare_glyph($NSUB, $str_alt585$_nsub_);
        html_declare_glyph($SUBE, $str_alt587$_sube_);
        html_declare_glyph($SUPE, $str_alt589$_supe_);
        html_declare_glyph($OPLUS, $str_alt591$_oplus_);
        html_declare_glyph($OTIMES, $str_alt593$_otimes_);
        html_declare_glyph($PERP, $str_alt595$_perp_);
        html_declare_glyph($SDOT, $str_alt597$_sdot_);
        html_declare_glyph($LCEIL, $str_alt599$_lceil_);
        html_declare_glyph($RCEIL, $str_alt601$_rceil_);
        html_declare_glyph($LFLOOR, $str_alt603$_lfloor_);
        html_declare_glyph($RFLOOR, $str_alt605$_rfloor_);
        html_declare_glyph($LANG, $str_alt607$_lang_);
        html_declare_glyph($RANG, $str_alt609$_rang_);
        html_declare_glyph($LOZ, $str_alt611$_loz_);
        html_declare_glyph($SPADES, $str_alt613$_spades_);
        html_declare_glyph($CLUBS, $str_alt615$_clubs_);
        html_declare_glyph($HEARTS, $str_alt617$_hearts_);
        html_declare_glyph($DIAMS, $str_alt619$_diams_);
        html_declare_glyph($FROWNY_FACE, $str_alt621$__9785_);
        html_macros.note_html_handler_function(HTML_ECHO_ARGS);
        html_macros.note_html_handler_function(HTML_ECHO_FILE);
        sethash($SHA1, $javascript_definitions$.getGlobalValue(), list($str_alt682$sha1_js, NIL));
        return NIL;
    }

    public static SubLObject setup_html_utilities_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($cb_use_frames$);
            register_html_interface_variable($cb_use_frames$);
            define_test_case_table_int(OPENCYC_HTML_CYCL_STRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list37);
            declare_defglobal($proprietarity_message$);
            sethash($CYC_LOGO_SMALL_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str57$cyc_logo_violet_16_gif, NIL));
            sethash($CYC_LOGO_LARGE_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str59$cyc_logo_violet_60_gif, NIL));
            sethash($CYCORP_SYMBOL_TINY, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str61$cyc_logo_tiny_gif, NIL));
            sethash($CYCORP_SYMBOL_SMALL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str63$cyc_logo_sm_gif, NIL));
            sethash($CYCORP_SYMBOL_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str65$cyc_logo_10_t_gif, NIL));
            sethash($CYCORP_LOGO_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str67$cyc_logo_25_t_gif, NIL));
            sethash($CYCORP_LOGO_BIG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str69$cyc_logo_50_t_gif, NIL));
            register_macro_helper(HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, HTML_FANCY_PERCENT_PROGRESS_BAR);
            html_declare_glyph($LT, $str197$_lt_);
            html_declare_glyph($GT, $str199$_gt_);
            html_declare_glyph($AMP, $str201$_amp_);
            html_declare_glyph($QUOT, $str203$_quot_);
            html_declare_glyph($REG, $str205$_reg_);
            html_declare_glyph($COPY, $str207$_copy_);
            html_declare_glyph($NBSP, $str208$_nbsp_);
            html_declare_glyph($EMSP, $str210$_emsp_);
            html_declare_glyph($ENSP, $str212$_ensp_);
            html_declare_glyph($SPACE, $str214$__X0020_);
            html_declare_glyph($EM_SPACE, $str216$__X2003_);
            html_declare_glyph($EN_SPACE, $str218$__X2002_);
            html_declare_glyph($TWO_PER_EM_SPACE, html_glyph_markup($EN_SPACE));
            html_declare_glyph($THREE_PER_EM_SPACE, $str221$__X2004_);
            html_declare_glyph($FOUR_PER_EM_SPACE, $str223$__X2005_);
            html_declare_glyph($SIX_PER_EM_SPACE, $str225$__X2006_);
            html_declare_glyph($THIN_SPACE, $str227$__X2009_);
            html_declare_glyph($HAIR_SPACE, $str229$__X200A_);
            html_declare_glyph($IEXCL, $str231$_iexcl_);
            html_declare_glyph($CENT, $str233$_cent_);
            html_declare_glyph($POUND, $str235$_pound_);
            html_declare_glyph($CURREN, $str237$_curren_);
            html_declare_glyph($YEN, $str239$_yen_);
            html_declare_glyph($BRVBAR, $str241$_brvba_);
            html_declare_glyph($SECT, $str243$_sect_);
            html_declare_glyph($UML, $str245$_uml_);
            html_declare_glyph($COPY, $str207$_copy_);
            html_declare_glyph($ORDF, $str247$_ordf_);
            html_declare_glyph($LAQUO, $str249$_laquo_);
            html_declare_glyph($NOT, $str251$_not_);
            html_declare_glyph($SHY, $str253$_shy_);
            html_declare_glyph($REG, $str205$_reg_);
            html_declare_glyph($MACR, $str255$_macr_);
            html_declare_glyph($DEG, $str257$_deg_);
            html_declare_glyph($PLUSMN, $str259$_plusmn_);
            html_declare_glyph($SUP2, $str261$_sup2_);
            html_declare_glyph($SUP3, $str263$_sup3_);
            html_declare_glyph($ACUTE, $str265$_acute_);
            html_declare_glyph($MICRO, $str267$_micro_);
            html_declare_glyph($PARA, $str269$_para_);
            html_declare_glyph($MIDDOT, $str271$_middoy_);
            html_declare_glyph($CEDIL, $str273$_cedil_);
            html_declare_glyph($SUP1, $str275$_sup1_);
            html_declare_glyph($ORDM, $str277$_ordm_);
            html_declare_glyph($RAQUO, $str279$_raquo_);
            html_declare_glyph($FRAC14, $str281$_frac14_);
            html_declare_glyph($FRAC12, $str283$_frac12_);
            html_declare_glyph($FRAC34, $str285$_frac34_);
            html_declare_glyph($IQUEST, $str287$_iquest_);
            html_declare_glyph($AGRAVE_CAP, $str289$_Agrave_);
            html_declare_glyph($AACUTE_CAP, $str291$_Aacute_);
            html_declare_glyph($ACIRC_CAP, $str293$_Acirc_);
            html_declare_glyph($ATILDE_CAP, $str295$_Atilde_);
            html_declare_glyph($AUML_CAP, $str297$_Auml_);
            html_declare_glyph($ARING_CAP, $str299$_Aring_);
            html_declare_glyph($AELIG_CAP, $str301$_AElig_);
            html_declare_glyph($CCEDIL_CAP, $str303$_Ccedil_);
            html_declare_glyph($EGRAVE_CAP, $str305$_Egrave_);
            html_declare_glyph($EACUTE_CAP, $str307$_Eacute_);
            html_declare_glyph($ECIRC_CAP, $str309$_Ecirc_);
            html_declare_glyph($EUML_CAP, $str311$_Euml_);
            html_declare_glyph($IGRAVE_CAP, $str313$_Igrave_);
            html_declare_glyph($IACUTE_CAP, $str315$_Iacute_);
            html_declare_glyph($ICIRC_CAP, $str317$_Icirc_);
            html_declare_glyph($IUML_CAP, $str319$_Iuml_);
            html_declare_glyph($ETH_CAP, $str321$_ETH_);
            html_declare_glyph($NTILDE_CAP, $str323$_Ntilde_);
            html_declare_glyph($OGRAVE_CAP, $str325$_Ograve_);
            html_declare_glyph($OACUTE_CAP, $str327$_Oacute_);
            html_declare_glyph($OCIRC_CAP, $str329$_Ocirc_);
            html_declare_glyph($OTILDE_CAP, $str331$_Otilde_);
            html_declare_glyph($OUML_CAP, $str333$_Ouml_);
            html_declare_glyph($TIMES, $str335$_times_);
            html_declare_glyph($OSLASH_CAP, $str337$_Oslash_);
            html_declare_glyph($UGRAVE_CAP, $str339$_Ugrave_);
            html_declare_glyph($UACUTE_CAP, $str341$_Uacute_);
            html_declare_glyph($UCIRC_CAP, $str343$_Ucirc_);
            html_declare_glyph($UUML_CAP, $str345$_Uuml_);
            html_declare_glyph($YACUTE_CAP, $str347$_Yacute_);
            html_declare_glyph($THORN_CAP, $str349$_THORN_);
            html_declare_glyph($SZLIG, $str351$_szlig_);
            html_declare_glyph($AGRAVE, $str353$_agrave_);
            html_declare_glyph($AACUTE, $str355$_aacute_);
            html_declare_glyph($ACIRC, $str357$_acirc_);
            html_declare_glyph($ATILDE, $str359$_atilde_);
            html_declare_glyph($AUML, $str361$_auml_);
            html_declare_glyph($ARING, $str363$_aring_);
            html_declare_glyph($AELIG, $str365$_aelig_);
            html_declare_glyph($CCEDIL, $str367$_ccedil_);
            html_declare_glyph($EGRAVE, $str369$_egrave_);
            html_declare_glyph($EACUTE, $str371$_eacute_);
            html_declare_glyph($ECIRC, $str373$_ecirc_);
            html_declare_glyph($EUML, $str375$_euml_);
            html_declare_glyph($IGRAVE, $str377$_igrave_);
            html_declare_glyph($IACUTE, $str379$_iacute_);
            html_declare_glyph($ICIRC, $str381$_icirc_);
            html_declare_glyph($IUML, $str383$_iuml_);
            html_declare_glyph($ETH, $str385$_eth_);
            html_declare_glyph($NTILDE, $str387$_ntilde_);
            html_declare_glyph($OGRAVE, $str389$_ograve_);
            html_declare_glyph($OACUTE, $str391$_oacute_);
            html_declare_glyph($OCIRC, $str393$_ocirc_);
            html_declare_glyph($OTILDE, $str395$_otilde_);
            html_declare_glyph($OUML, $str397$_ouml_);
            html_declare_glyph($DIVIDE, $str399$_divide_);
            html_declare_glyph($OSLASH, $str401$_oslash_);
            html_declare_glyph($UGRAVE, $str403$_ugrave_);
            html_declare_glyph($UACUTE, $str405$_uacute_);
            html_declare_glyph($UCIRC, $str407$_ucirc_);
            html_declare_glyph($UUML, $str409$_uuml_);
            html_declare_glyph($YACUTE, $str411$_yacute_);
            html_declare_glyph($THORN, $str413$_thorn_);
            html_declare_glyph($YUML, $str415$_yuml_);
            html_declare_glyph($FNOF, $str417$_fnof_);
            html_declare_glyph($ALPHA_CAP, $str419$_Alpha_);
            html_declare_glyph($BETA_CAP, $str421$_Beta_);
            html_declare_glyph($GAMMA_CAP, $str423$_Gamma_);
            html_declare_glyph($DELTA_CAP, $str425$_Delta_);
            html_declare_glyph($EPSILON_CAP, $str427$_Epsilon_);
            html_declare_glyph($ZETA_CAP, $str429$_Zeta_);
            html_declare_glyph($ETA_CAP, $str431$_Eta_);
            html_declare_glyph($THETA_CAP, $str433$_Theta_);
            html_declare_glyph($IOTA_CAP, $str435$_Iota_);
            html_declare_glyph($KAPPA_CAP, $str437$_Kappa_);
            html_declare_glyph($LAMBDA_CAP, $str439$_Lambda_);
            html_declare_glyph($MU_CAP, $str441$_Mu_);
            html_declare_glyph($NU_CAP, $str443$_Nu_);
            html_declare_glyph($XI_CAP, $str445$_Xi_);
            html_declare_glyph($OMICRON_CAP, $str447$_Omicron_);
            html_declare_glyph($PI_CAP, $str449$_Pi_);
            html_declare_glyph($RHO_CAP, $str451$_Rho_);
            html_declare_glyph($SIGMA_CAP, $str453$_Sigma_);
            html_declare_glyph($TAU_CAP, $str455$_Tau_);
            html_declare_glyph($UPSILON_CAP, $str457$_Upsilon_);
            html_declare_glyph($PHI_CAP, $str459$_Phi_);
            html_declare_glyph($CHI_CAP, $str461$_Chi_);
            html_declare_glyph($PSI_CAP, $str463$_Psi_);
            html_declare_glyph($OMEGA_CAP, $str465$_Omega_);
            html_declare_glyph($ALPHA, $str467$_alpha_);
            html_declare_glyph($BETA, $str469$_beta_);
            html_declare_glyph($GAMMA, $str471$_gamma_);
            html_declare_glyph($DELTA, $str473$_delta_);
            html_declare_glyph($EPSILON, $str475$_epsilon_);
            html_declare_glyph($ZETA, $str477$_zeta_);
            html_declare_glyph($ETA, $str479$_eta_);
            html_declare_glyph($THETA, $str481$_theta_);
            html_declare_glyph($IOTA, $str483$_iota_);
            html_declare_glyph($KAPPA, $str485$_kappa_);
            html_declare_glyph($LAMBDA, $str487$_lambda_);
            html_declare_glyph($MU, $str489$_mu_);
            html_declare_glyph($NU, $str491$_nu_);
            html_declare_glyph($XI, $str493$_xi_);
            html_declare_glyph($OMICRON, $str495$_omicron_);
            html_declare_glyph($PI, $str497$_pi_);
            html_declare_glyph($RHO, $str499$_rho_);
            html_declare_glyph($SIGMAF, $str501$_sigmaf_);
            html_declare_glyph($SIGMA, $str503$_sigma_);
            html_declare_glyph($TAU, $str505$_tau_);
            html_declare_glyph($UPSILON, $str507$_upsilon_);
            html_declare_glyph($PHI, $str509$_phi_);
            html_declare_glyph($CHI, $str511$_chi_);
            html_declare_glyph($PSI, $str513$_psi_);
            html_declare_glyph($OMEGA, $str515$_omega_);
            html_declare_glyph($THETASYM, $str481$_theta_);
            html_declare_glyph($UPSIH, $str518$_upsih_);
            html_declare_glyph($PIV, $str520$_piv_);
            html_declare_glyph($BULL, $str522$_bull_);
            html_declare_glyph($HELLIP, $str524$_hellip_);
            html_declare_glyph($PRIME, $str526$_prime_);
            html_declare_glyph($PRIME_DBL, $str528$_Prime_);
            html_declare_glyph($OLINE, $str530$_oline_);
            html_declare_glyph($FRASL, $str532$_frasl_);
            html_declare_glyph($WEIERP, $str534$_weierp_);
            html_declare_glyph($IMAGE, $str536$_image_);
            html_declare_glyph($REAL, $str538$_real_);
            html_declare_glyph($TRADE, $str540$_trade_);
            html_declare_glyph($ALEFSYM, $str542$_alefsym_);
            html_declare_glyph($UPWARDS_ARROW, $str544$_uarr_);
            html_declare_glyph($RIGHTWARDS_ARROW, $str546$_rarr_);
            html_declare_glyph($LARR, $str548$_larr_);
            html_declare_glyph($UARR, $str544$_uarr_);
            html_declare_glyph($RARR, $str546$_rarr_);
            html_declare_glyph($DARR, $str552$_darr_);
            html_declare_glyph($HARR, $str554$_harr_);
            html_declare_glyph($CRARR, $str556$_crarr_);
            html_declare_glyph($LARR_DBL, $str558$_lArr_);
            html_declare_glyph($UARR_DBL, $str560$_uArr_);
            html_declare_glyph($RARR_DBL, $str562$_rArr_);
            html_declare_glyph($DARR_DBL, $str564$_dArr_);
            html_declare_glyph($HARR_DBL, $str566$_hArr_);
            html_declare_glyph($FORALL, $str568$_forall_);
            html_declare_glyph($PART, $str570$_part_);
            html_declare_glyph($EXIST, $str572$_exist_);
            html_declare_glyph($EMPTY, $str574$_empty_);
            html_declare_glyph($NABLA, $str576$_nabla_);
            html_declare_glyph($ISIN, $str578$_isin_);
            html_declare_glyph($NOTIN, $str580$_notin_);
            html_declare_glyph($NI, $str582$_ni_);
            html_declare_glyph($PROD, $str584$_prod_);
            html_declare_glyph($SUM, $str586$_sum_);
            html_declare_glyph($MINUS, $str588$_minus_);
            html_declare_glyph($LOWAST, $str590$_lowast_);
            html_declare_glyph($RADIC, $str592$_radic_);
            html_declare_glyph($PROP, $str594$_prop_);
            html_declare_glyph($INFIN, $str596$_infin_);
            html_declare_glyph($ANG, $str598$_ang_);
            html_declare_glyph($AND, $str600$_and_);
            html_declare_glyph($OR, $str602$_or_);
            html_declare_glyph($CAP, $str604$_cap_);
            html_declare_glyph($CUP, $str606$_cup_);
            html_declare_glyph($INT, $str608$_int_);
            html_declare_glyph($THERE4, $str610$_there4_);
            html_declare_glyph($SIM, $str612$_sim_);
            html_declare_glyph($CONG, $str614$_cong_);
            html_declare_glyph($ASYMP, $str616$_asymp_);
            html_declare_glyph($NE, $str618$_ne_);
            html_declare_glyph($EQUIV, $str620$_equiv_);
            html_declare_glyph($LE, $str622$_le_);
            html_declare_glyph($GE, $str624$_ge_);
            html_declare_glyph($SUB, $str626$_sub_);
            html_declare_glyph($SUP, $str628$_sup_);
            html_declare_glyph($NSUB, $str630$_nsub_);
            html_declare_glyph($SUBE, $str632$_sube_);
            html_declare_glyph($SUPE, $str634$_supe_);
            html_declare_glyph($OPLUS, $str636$_oplus_);
            html_declare_glyph($OTIMES, $str638$_otimes_);
            html_declare_glyph($PERP, $str640$_perp_);
            html_declare_glyph($SDOT, $str642$_sdot_);
            html_declare_glyph($LCEIL, $str644$_lceil_);
            html_declare_glyph($RCEIL, $str646$_rceil_);
            html_declare_glyph($LFLOOR, $str648$_lfloor_);
            html_declare_glyph($RFLOOR, $str650$_rfloor_);
            html_declare_glyph($LANG, $str652$_lang_);
            html_declare_glyph($RANG, $str654$_rang_);
            html_declare_glyph($LOZ, $str656$_loz_);
            html_declare_glyph($SPADES, $str658$_spades_);
            html_declare_glyph($CLUBS, $str660$_clubs_);
            html_declare_glyph($HEARTS, $str662$_hearts_);
            html_declare_glyph($DIAMS, $str664$_diams_);
            html_declare_glyph($FROWNY_FACE, $str666$__9785_);
            html_macros.note_cgi_handler_function(HTML_ECHO_ARGS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(HTML_ECHO_FILE, $HTML_HANDLER);
            sunit_external.define_test_category($html_utils_test_category$.getGlobalValue(), UNPROVIDED);
            sunit_external.define_test_suite($html_utils_test_suite$.getGlobalValue(), list($html_utils_test_category$.getGlobalValue()), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(OPENCYC_HTML_CYCL_STRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt31);
            sethash($CYC_LOGO_SMALL_VIOLET_FULL_URL, $html_icon_definitions$.getGlobalValue(), list($str_alt68$cyc_logo_violet_16_gif, NIL));
            sethash($CYC_LOGO_LARGE_VIOLET_FULL_URL, $html_icon_definitions$.getGlobalValue(), list($str_alt70$cyc_logo_violet_60_gif, NIL));
            sethash($CYCORP_SYMBOL_TINY, $html_icon_definitions$.getGlobalValue(), list($str_alt72$cyc_logo_tiny_gif, NIL));
            sethash($CYCORP_SYMBOL_SMALL, $html_icon_definitions$.getGlobalValue(), list($str_alt74$cyc_logo_sm_gif, NIL));
            sethash($CYCORP_SYMBOL_MEDIUM, $html_icon_definitions$.getGlobalValue(), list($str_alt76$cyc_logo_10_t_gif, NIL));
            sethash($CYCORP_LOGO_MEDIUM, $html_icon_definitions$.getGlobalValue(), list($str_alt78$cyc_logo_25_t_gif, NIL));
            sethash($CYCORP_LOGO_BIG, $html_icon_definitions$.getGlobalValue(), list($str_alt80$cyc_logo_50_t_gif, NIL));
            html_declare_glyph($LT, $str_alt169$_lt_);
            html_declare_glyph($GT, $str_alt171$_gt_);
            html_declare_glyph($AMP, $str_alt173$_amp_);
            html_declare_glyph($QUOT, $str_alt175$_quot_);
            html_declare_glyph($REG, $str_alt177$_reg_);
            html_declare_glyph($COPY, $str_alt179$_copy_);
            html_declare_glyph($NBSP, $str_alt180$_nbsp_);
            html_declare_glyph($EMSP, $str_alt182$_emsp_);
            html_declare_glyph($ENSP, $str_alt184$_ensp_);
            html_declare_glyph($IEXCL, $str_alt186$_iexcl_);
            html_declare_glyph($CENT, $str_alt188$_cent_);
            html_declare_glyph($POUND, $str_alt190$_pound_);
            html_declare_glyph($CURREN, $str_alt192$_curren_);
            html_declare_glyph($YEN, $str_alt194$_yen_);
            html_declare_glyph($BRVBAR, $str_alt196$_brvba_);
            html_declare_glyph($SECT, $str_alt198$_sect_);
            html_declare_glyph($UML, $str_alt200$_uml_);
            html_declare_glyph($COPY, $str_alt179$_copy_);
            html_declare_glyph($ORDF, $str_alt202$_ordf_);
            html_declare_glyph($LAQUO, $str_alt204$_laquo_);
            html_declare_glyph($NOT, $str_alt206$_not_);
            html_declare_glyph($SHY, $str_alt208$_shy_);
            html_declare_glyph($REG, $str_alt177$_reg_);
            html_declare_glyph($MACR, $str_alt210$_macr_);
            html_declare_glyph($DEG, $str_alt212$_deg_);
            html_declare_glyph($PLUSMN, $str_alt214$_plusmn_);
            html_declare_glyph($SUP2, $str_alt216$_sup2_);
            html_declare_glyph($SUP3, $str_alt218$_sup3_);
            html_declare_glyph($ACUTE, $str_alt220$_acute_);
            html_declare_glyph($MICRO, $str_alt222$_micro_);
            html_declare_glyph($PARA, $str_alt224$_para_);
            html_declare_glyph($MIDDOT, $str_alt226$_middoy_);
            html_declare_glyph($CEDIL, $str_alt228$_cedil_);
            html_declare_glyph($SUP1, $str_alt230$_sup1_);
            html_declare_glyph($ORDM, $str_alt232$_ordm_);
            html_declare_glyph($RAQUO, $str_alt234$_raquo_);
            html_declare_glyph($FRAC14, $str_alt236$_frac14_);
            html_declare_glyph($FRAC12, $str_alt238$_frac12_);
            html_declare_glyph($FRAC34, $str_alt240$_frac34_);
            html_declare_glyph($IQUEST, $str_alt242$_iquest_);
            html_declare_glyph($AGRAVE_CAP, $str_alt244$_Agrave_);
            html_declare_glyph($AACUTE_CAP, $str_alt246$_Aacute_);
            html_declare_glyph($ACIRC_CAP, $str_alt248$_Acirc_);
            html_declare_glyph($ATILDE_CAP, $str_alt250$_Atilde_);
            html_declare_glyph($AUML_CAP, $str_alt252$_Auml_);
            html_declare_glyph($ARING_CAP, $str_alt254$_Aring_);
            html_declare_glyph($AELIG_CAP, $str_alt256$_AElig_);
            html_declare_glyph($CCEDIL_CAP, $str_alt258$_Ccedil_);
            html_declare_glyph($EGRAVE_CAP, $str_alt260$_Egrave_);
            html_declare_glyph($EACUTE_CAP, $str_alt262$_Eacute_);
            html_declare_glyph($ECIRC_CAP, $str_alt264$_Ecirc_);
            html_declare_glyph($EUML_CAP, $str_alt266$_Euml_);
            html_declare_glyph($IGRAVE_CAP, $str_alt268$_Igrave_);
            html_declare_glyph($IACUTE_CAP, $str_alt270$_Iacute_);
            html_declare_glyph($ICIRC_CAP, $str_alt272$_Icirc_);
            html_declare_glyph($IUML_CAP, $str_alt274$_Iuml_);
            html_declare_glyph($ETH_CAP, $str_alt276$_ETH_);
            html_declare_glyph($NTILDE_CAP, $str_alt278$_Ntilde_);
            html_declare_glyph($OGRAVE_CAP, $str_alt280$_Ograve_);
            html_declare_glyph($OACUTE_CAP, $str_alt282$_Oacute_);
            html_declare_glyph($OCIRC_CAP, $str_alt284$_Ocirc_);
            html_declare_glyph($OTILDE_CAP, $str_alt286$_Otilde_);
            html_declare_glyph($OUML_CAP, $str_alt288$_Ouml_);
            html_declare_glyph($TIMES, $str_alt290$_times_);
            html_declare_glyph($OSLASH_CAP, $str_alt292$_Oslash_);
            html_declare_glyph($UGRAVE_CAP, $str_alt294$_Ugrave_);
            html_declare_glyph($UACUTE_CAP, $str_alt296$_Uacute_);
            html_declare_glyph($UCIRC_CAP, $str_alt298$_Ucirc_);
            html_declare_glyph($UUML_CAP, $str_alt300$_Uuml_);
            html_declare_glyph($YACUTE_CAP, $str_alt302$_Yacute_);
            html_declare_glyph($THORN_CAP, $str_alt304$_THORN_);
            html_declare_glyph($SZLIG, $str_alt306$_szlig_);
            html_declare_glyph($AGRAVE, $str_alt308$_agrave_);
            html_declare_glyph($AACUTE, $str_alt310$_aacute_);
            html_declare_glyph($ACIRC, $str_alt312$_acirc_);
            html_declare_glyph($ATILDE, $str_alt314$_atilde_);
            html_declare_glyph($AUML, $str_alt316$_auml_);
            html_declare_glyph($ARING, $str_alt318$_aring_);
            html_declare_glyph($AELIG, $str_alt320$_aelig_);
            html_declare_glyph($CCEDIL, $str_alt322$_ccedil_);
            html_declare_glyph($EGRAVE, $str_alt324$_egrave_);
            html_declare_glyph($EACUTE, $str_alt326$_eacute_);
            html_declare_glyph($ECIRC, $str_alt328$_ecirc_);
            html_declare_glyph($EUML, $str_alt330$_euml_);
            html_declare_glyph($IGRAVE, $str_alt332$_igrave_);
            html_declare_glyph($IACUTE, $str_alt334$_iacute_);
            html_declare_glyph($ICIRC, $str_alt336$_icirc_);
            html_declare_glyph($IUML, $str_alt338$_iuml_);
            html_declare_glyph($ETH, $str_alt340$_eth_);
            html_declare_glyph($NTILDE, $str_alt342$_ntilde_);
            html_declare_glyph($OGRAVE, $str_alt344$_ograve_);
            html_declare_glyph($OACUTE, $str_alt346$_oacute_);
            html_declare_glyph($OCIRC, $str_alt348$_ocirc_);
            html_declare_glyph($OTILDE, $str_alt350$_otilde_);
            html_declare_glyph($OUML, $str_alt352$_ouml_);
            html_declare_glyph($DIVIDE, $str_alt354$_divide_);
            html_declare_glyph($OSLASH, $str_alt356$_oslash_);
            html_declare_glyph($UGRAVE, $str_alt358$_ugrave_);
            html_declare_glyph($UACUTE, $str_alt360$_uacute_);
            html_declare_glyph($UCIRC, $str_alt362$_ucirc_);
            html_declare_glyph($UUML, $str_alt364$_uuml_);
            html_declare_glyph($YACUTE, $str_alt366$_yacute_);
            html_declare_glyph($THORN, $str_alt368$_thorn_);
            html_declare_glyph($YUML, $str_alt370$_yuml_);
            html_declare_glyph($FNOF, $str_alt372$_fnof_);
            html_declare_glyph($ALPHA_CAP, $str_alt374$_Alpha_);
            html_declare_glyph($BETA_CAP, $str_alt376$_Beta_);
            html_declare_glyph($GAMMA_CAP, $str_alt378$_Gamma_);
            html_declare_glyph($DELTA_CAP, $str_alt380$_Delta_);
            html_declare_glyph($EPSILON_CAP, $str_alt382$_Epsilon_);
            html_declare_glyph($ZETA_CAP, $str_alt384$_Zeta_);
            html_declare_glyph($ETA_CAP, $str_alt386$_Eta_);
            html_declare_glyph($THETA_CAP, $str_alt388$_Theta_);
            html_declare_glyph($IOTA_CAP, $str_alt390$_Iota_);
            html_declare_glyph($KAPPA_CAP, $str_alt392$_Kappa_);
            html_declare_glyph($LAMBDA_CAP, $str_alt394$_Lambda_);
            html_declare_glyph($MU_CAP, $str_alt396$_Mu_);
            html_declare_glyph($NU_CAP, $str_alt398$_Nu_);
            html_declare_glyph($XI_CAP, $str_alt400$_Xi_);
            html_declare_glyph($OMICRON_CAP, $str_alt402$_Omicron_);
            html_declare_glyph($PI_CAP, $str_alt404$_Pi_);
            html_declare_glyph($RHO_CAP, $str_alt406$_Rho_);
            html_declare_glyph($SIGMA_CAP, $str_alt408$_Sigma_);
            html_declare_glyph($TAU_CAP, $str_alt410$_Tau_);
            html_declare_glyph($UPSILON_CAP, $str_alt412$_Upsilon_);
            html_declare_glyph($PHI_CAP, $str_alt414$_Phi_);
            html_declare_glyph($CHI_CAP, $str_alt416$_Chi_);
            html_declare_glyph($PSI_CAP, $str_alt418$_Psi_);
            html_declare_glyph($OMEGA_CAP, $str_alt420$_Omega_);
            html_declare_glyph($ALPHA, $str_alt422$_alpha_);
            html_declare_glyph($BETA, $str_alt424$_beta_);
            html_declare_glyph($GAMMA, $str_alt426$_gamma_);
            html_declare_glyph($DELTA, $str_alt428$_delta_);
            html_declare_glyph($EPSILON, $str_alt430$_epsilon_);
            html_declare_glyph($ZETA, $str_alt432$_zeta_);
            html_declare_glyph($ETA, $str_alt434$_eta_);
            html_declare_glyph($THETA, $str_alt436$_theta_);
            html_declare_glyph($IOTA, $str_alt438$_iota_);
            html_declare_glyph($KAPPA, $str_alt440$_kappa_);
            html_declare_glyph($LAMBDA, $str_alt442$_lambda_);
            html_declare_glyph($MU, $str_alt444$_mu_);
            html_declare_glyph($NU, $str_alt446$_nu_);
            html_declare_glyph($XI, $str_alt448$_xi_);
            html_declare_glyph($OMICRON, $str_alt450$_omicron_);
            html_declare_glyph($PI, $str_alt452$_pi_);
            html_declare_glyph($RHO, $str_alt454$_rho_);
            html_declare_glyph($SIGMAF, $str_alt456$_sigmaf_);
            html_declare_glyph($SIGMA, $str_alt458$_sigma_);
            html_declare_glyph($TAU, $str_alt460$_tau_);
            html_declare_glyph($UPSILON, $str_alt462$_upsilon_);
            html_declare_glyph($PHI, $str_alt464$_phi_);
            html_declare_glyph($CHI, $str_alt466$_chi_);
            html_declare_glyph($PSI, $str_alt468$_psi_);
            html_declare_glyph($OMEGA, $str_alt470$_omega_);
            html_declare_glyph($THETASYM, $str_alt436$_theta_);
            html_declare_glyph($UPSIH, $str_alt473$_upsih_);
            html_declare_glyph($PIV, $str_alt475$_piv_);
            html_declare_glyph($BULL, $str_alt477$_bull_);
            html_declare_glyph($HELLIP, $str_alt479$_hellip_);
            html_declare_glyph($PRIME, $str_alt481$_prime_);
            html_declare_glyph($PRIME_DBL, $str_alt483$_Prime_);
            html_declare_glyph($OLINE, $str_alt485$_oline_);
            html_declare_glyph($FRASL, $str_alt487$_frasl_);
            html_declare_glyph($WEIERP, $str_alt489$_weierp_);
            html_declare_glyph($IMAGE, $str_alt491$_image_);
            html_declare_glyph($REAL, $str_alt493$_real_);
            html_declare_glyph($TRADE, $str_alt495$_trade_);
            html_declare_glyph($ALEFSYM, $str_alt497$_alefsym_);
            html_declare_glyph($UPWARDS_ARROW, $str_alt499$_uarr_);
            html_declare_glyph($RIGHTWARDS_ARROW, $str_alt501$_rarr_);
            html_declare_glyph($LARR, $str_alt503$_larr_);
            html_declare_glyph($UARR, $str_alt499$_uarr_);
            html_declare_glyph($RARR, $str_alt501$_rarr_);
            html_declare_glyph($DARR, $str_alt507$_darr_);
            html_declare_glyph($HARR, $str_alt509$_harr_);
            html_declare_glyph($CRARR, $str_alt511$_crarr_);
            html_declare_glyph($LARR_DBL, $str_alt513$_lArr_);
            html_declare_glyph($UARR_DBL, $str_alt515$_uArr_);
            html_declare_glyph($RARR_DBL, $str_alt517$_rArr_);
            html_declare_glyph($DARR_DBL, $str_alt519$_dArr_);
            html_declare_glyph($HARR_DBL, $str_alt521$_hArr_);
            html_declare_glyph($FORALL, $str_alt523$_forall_);
            html_declare_glyph($PART, $str_alt525$_part_);
            html_declare_glyph($EXIST, $str_alt527$_exist_);
            html_declare_glyph($EMPTY, $str_alt529$_empty_);
            html_declare_glyph($NABLA, $str_alt531$_nabla_);
            html_declare_glyph($ISIN, $str_alt533$_isin_);
            html_declare_glyph($NOTIN, $str_alt535$_notin_);
            html_declare_glyph($NI, $str_alt537$_ni_);
            html_declare_glyph($PROD, $str_alt539$_prod_);
            html_declare_glyph($SUM, $str_alt541$_sum_);
            html_declare_glyph($MINUS, $str_alt543$_minus_);
            html_declare_glyph($LOWAST, $str_alt545$_lowast_);
            html_declare_glyph($RADIC, $str_alt547$_radic_);
            html_declare_glyph($PROP, $str_alt549$_prop_);
            html_declare_glyph($INFIN, $str_alt551$_infin_);
            html_declare_glyph($ANG, $str_alt553$_ang_);
            html_declare_glyph($AND, $str_alt555$_and_);
            html_declare_glyph($OR, $str_alt557$_or_);
            html_declare_glyph($CAP, $str_alt559$_cap_);
            html_declare_glyph($CUP, $str_alt561$_cup_);
            html_declare_glyph($INT, $str_alt563$_int_);
            html_declare_glyph($THERE4, $str_alt565$_there4_);
            html_declare_glyph($SIM, $str_alt567$_sim_);
            html_declare_glyph($CONG, $str_alt569$_cong_);
            html_declare_glyph($ASYMP, $str_alt571$_asymp_);
            html_declare_glyph($NE, $str_alt573$_ne_);
            html_declare_glyph($EQUIV, $str_alt575$_equiv_);
            html_declare_glyph($LE, $str_alt577$_le_);
            html_declare_glyph($GE, $str_alt579$_ge_);
            html_declare_glyph($SUB, $str_alt581$_sub_);
            html_declare_glyph($SUP, $str_alt583$_sup_);
            html_declare_glyph($NSUB, $str_alt585$_nsub_);
            html_declare_glyph($SUBE, $str_alt587$_sube_);
            html_declare_glyph($SUPE, $str_alt589$_supe_);
            html_declare_glyph($OPLUS, $str_alt591$_oplus_);
            html_declare_glyph($OTIMES, $str_alt593$_otimes_);
            html_declare_glyph($PERP, $str_alt595$_perp_);
            html_declare_glyph($SDOT, $str_alt597$_sdot_);
            html_declare_glyph($LCEIL, $str_alt599$_lceil_);
            html_declare_glyph($RCEIL, $str_alt601$_rceil_);
            html_declare_glyph($LFLOOR, $str_alt603$_lfloor_);
            html_declare_glyph($RFLOOR, $str_alt605$_rfloor_);
            html_declare_glyph($LANG, $str_alt607$_lang_);
            html_declare_glyph($RANG, $str_alt609$_rang_);
            html_declare_glyph($LOZ, $str_alt611$_loz_);
            html_declare_glyph($SPADES, $str_alt613$_spades_);
            html_declare_glyph($CLUBS, $str_alt615$_clubs_);
            html_declare_glyph($HEARTS, $str_alt617$_hearts_);
            html_declare_glyph($DIAMS, $str_alt619$_diams_);
            html_declare_glyph($FROWNY_FACE, $str_alt621$__9785_);
            html_macros.note_html_handler_function(HTML_ECHO_ARGS);
            html_macros.note_html_handler_function(HTML_ECHO_FILE);
            sethash($SHA1, $javascript_definitions$.getGlobalValue(), list($str_alt682$sha1_js, NIL));
        }
        return NIL;
    }

    public static SubLObject setup_html_utilities_file_Previous() {
        register_html_state_variable($cb_use_frames$);
        register_html_interface_variable($cb_use_frames$);
        define_test_case_table_int(OPENCYC_HTML_CYCL_STRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list37);
        declare_defglobal($proprietarity_message$);
        sethash($CYC_LOGO_SMALL_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str57$cyc_logo_violet_16_gif, NIL));
        sethash($CYC_LOGO_LARGE_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str59$cyc_logo_violet_60_gif, NIL));
        sethash($CYCORP_SYMBOL_TINY, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str61$cyc_logo_tiny_gif, NIL));
        sethash($CYCORP_SYMBOL_SMALL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str63$cyc_logo_sm_gif, NIL));
        sethash($CYCORP_SYMBOL_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str65$cyc_logo_10_t_gif, NIL));
        sethash($CYCORP_LOGO_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str67$cyc_logo_25_t_gif, NIL));
        sethash($CYCORP_LOGO_BIG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), list($str69$cyc_logo_50_t_gif, NIL));
        register_macro_helper(HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, HTML_FANCY_PERCENT_PROGRESS_BAR);
        html_declare_glyph($LT, $str197$_lt_);
        html_declare_glyph($GT, $str199$_gt_);
        html_declare_glyph($AMP, $str201$_amp_);
        html_declare_glyph($QUOT, $str203$_quot_);
        html_declare_glyph($REG, $str205$_reg_);
        html_declare_glyph($COPY, $str207$_copy_);
        html_declare_glyph($NBSP, $str208$_nbsp_);
        html_declare_glyph($EMSP, $str210$_emsp_);
        html_declare_glyph($ENSP, $str212$_ensp_);
        html_declare_glyph($SPACE, $str214$__X0020_);
        html_declare_glyph($EM_SPACE, $str216$__X2003_);
        html_declare_glyph($EN_SPACE, $str218$__X2002_);
        html_declare_glyph($TWO_PER_EM_SPACE, html_glyph_markup($EN_SPACE));
        html_declare_glyph($THREE_PER_EM_SPACE, $str221$__X2004_);
        html_declare_glyph($FOUR_PER_EM_SPACE, $str223$__X2005_);
        html_declare_glyph($SIX_PER_EM_SPACE, $str225$__X2006_);
        html_declare_glyph($THIN_SPACE, $str227$__X2009_);
        html_declare_glyph($HAIR_SPACE, $str229$__X200A_);
        html_declare_glyph($IEXCL, $str231$_iexcl_);
        html_declare_glyph($CENT, $str233$_cent_);
        html_declare_glyph($POUND, $str235$_pound_);
        html_declare_glyph($CURREN, $str237$_curren_);
        html_declare_glyph($YEN, $str239$_yen_);
        html_declare_glyph($BRVBAR, $str241$_brvba_);
        html_declare_glyph($SECT, $str243$_sect_);
        html_declare_glyph($UML, $str245$_uml_);
        html_declare_glyph($COPY, $str207$_copy_);
        html_declare_glyph($ORDF, $str247$_ordf_);
        html_declare_glyph($LAQUO, $str249$_laquo_);
        html_declare_glyph($NOT, $str251$_not_);
        html_declare_glyph($SHY, $str253$_shy_);
        html_declare_glyph($REG, $str205$_reg_);
        html_declare_glyph($MACR, $str255$_macr_);
        html_declare_glyph($DEG, $str257$_deg_);
        html_declare_glyph($PLUSMN, $str259$_plusmn_);
        html_declare_glyph($SUP2, $str261$_sup2_);
        html_declare_glyph($SUP3, $str263$_sup3_);
        html_declare_glyph($ACUTE, $str265$_acute_);
        html_declare_glyph($MICRO, $str267$_micro_);
        html_declare_glyph($PARA, $str269$_para_);
        html_declare_glyph($MIDDOT, $str271$_middoy_);
        html_declare_glyph($CEDIL, $str273$_cedil_);
        html_declare_glyph($SUP1, $str275$_sup1_);
        html_declare_glyph($ORDM, $str277$_ordm_);
        html_declare_glyph($RAQUO, $str279$_raquo_);
        html_declare_glyph($FRAC14, $str281$_frac14_);
        html_declare_glyph($FRAC12, $str283$_frac12_);
        html_declare_glyph($FRAC34, $str285$_frac34_);
        html_declare_glyph($IQUEST, $str287$_iquest_);
        html_declare_glyph($AGRAVE_CAP, $str289$_Agrave_);
        html_declare_glyph($AACUTE_CAP, $str291$_Aacute_);
        html_declare_glyph($ACIRC_CAP, $str293$_Acirc_);
        html_declare_glyph($ATILDE_CAP, $str295$_Atilde_);
        html_declare_glyph($AUML_CAP, $str297$_Auml_);
        html_declare_glyph($ARING_CAP, $str299$_Aring_);
        html_declare_glyph($AELIG_CAP, $str301$_AElig_);
        html_declare_glyph($CCEDIL_CAP, $str303$_Ccedil_);
        html_declare_glyph($EGRAVE_CAP, $str305$_Egrave_);
        html_declare_glyph($EACUTE_CAP, $str307$_Eacute_);
        html_declare_glyph($ECIRC_CAP, $str309$_Ecirc_);
        html_declare_glyph($EUML_CAP, $str311$_Euml_);
        html_declare_glyph($IGRAVE_CAP, $str313$_Igrave_);
        html_declare_glyph($IACUTE_CAP, $str315$_Iacute_);
        html_declare_glyph($ICIRC_CAP, $str317$_Icirc_);
        html_declare_glyph($IUML_CAP, $str319$_Iuml_);
        html_declare_glyph($ETH_CAP, $str321$_ETH_);
        html_declare_glyph($NTILDE_CAP, $str323$_Ntilde_);
        html_declare_glyph($OGRAVE_CAP, $str325$_Ograve_);
        html_declare_glyph($OACUTE_CAP, $str327$_Oacute_);
        html_declare_glyph($OCIRC_CAP, $str329$_Ocirc_);
        html_declare_glyph($OTILDE_CAP, $str331$_Otilde_);
        html_declare_glyph($OUML_CAP, $str333$_Ouml_);
        html_declare_glyph($TIMES, $str335$_times_);
        html_declare_glyph($OSLASH_CAP, $str337$_Oslash_);
        html_declare_glyph($UGRAVE_CAP, $str339$_Ugrave_);
        html_declare_glyph($UACUTE_CAP, $str341$_Uacute_);
        html_declare_glyph($UCIRC_CAP, $str343$_Ucirc_);
        html_declare_glyph($UUML_CAP, $str345$_Uuml_);
        html_declare_glyph($YACUTE_CAP, $str347$_Yacute_);
        html_declare_glyph($THORN_CAP, $str349$_THORN_);
        html_declare_glyph($SZLIG, $str351$_szlig_);
        html_declare_glyph($AGRAVE, $str353$_agrave_);
        html_declare_glyph($AACUTE, $str355$_aacute_);
        html_declare_glyph($ACIRC, $str357$_acirc_);
        html_declare_glyph($ATILDE, $str359$_atilde_);
        html_declare_glyph($AUML, $str361$_auml_);
        html_declare_glyph($ARING, $str363$_aring_);
        html_declare_glyph($AELIG, $str365$_aelig_);
        html_declare_glyph($CCEDIL, $str367$_ccedil_);
        html_declare_glyph($EGRAVE, $str369$_egrave_);
        html_declare_glyph($EACUTE, $str371$_eacute_);
        html_declare_glyph($ECIRC, $str373$_ecirc_);
        html_declare_glyph($EUML, $str375$_euml_);
        html_declare_glyph($IGRAVE, $str377$_igrave_);
        html_declare_glyph($IACUTE, $str379$_iacute_);
        html_declare_glyph($ICIRC, $str381$_icirc_);
        html_declare_glyph($IUML, $str383$_iuml_);
        html_declare_glyph($ETH, $str385$_eth_);
        html_declare_glyph($NTILDE, $str387$_ntilde_);
        html_declare_glyph($OGRAVE, $str389$_ograve_);
        html_declare_glyph($OACUTE, $str391$_oacute_);
        html_declare_glyph($OCIRC, $str393$_ocirc_);
        html_declare_glyph($OTILDE, $str395$_otilde_);
        html_declare_glyph($OUML, $str397$_ouml_);
        html_declare_glyph($DIVIDE, $str399$_divide_);
        html_declare_glyph($OSLASH, $str401$_oslash_);
        html_declare_glyph($UGRAVE, $str403$_ugrave_);
        html_declare_glyph($UACUTE, $str405$_uacute_);
        html_declare_glyph($UCIRC, $str407$_ucirc_);
        html_declare_glyph($UUML, $str409$_uuml_);
        html_declare_glyph($YACUTE, $str411$_yacute_);
        html_declare_glyph($THORN, $str413$_thorn_);
        html_declare_glyph($YUML, $str415$_yuml_);
        html_declare_glyph($FNOF, $str417$_fnof_);
        html_declare_glyph($ALPHA_CAP, $str419$_Alpha_);
        html_declare_glyph($BETA_CAP, $str421$_Beta_);
        html_declare_glyph($GAMMA_CAP, $str423$_Gamma_);
        html_declare_glyph($DELTA_CAP, $str425$_Delta_);
        html_declare_glyph($EPSILON_CAP, $str427$_Epsilon_);
        html_declare_glyph($ZETA_CAP, $str429$_Zeta_);
        html_declare_glyph($ETA_CAP, $str431$_Eta_);
        html_declare_glyph($THETA_CAP, $str433$_Theta_);
        html_declare_glyph($IOTA_CAP, $str435$_Iota_);
        html_declare_glyph($KAPPA_CAP, $str437$_Kappa_);
        html_declare_glyph($LAMBDA_CAP, $str439$_Lambda_);
        html_declare_glyph($MU_CAP, $str441$_Mu_);
        html_declare_glyph($NU_CAP, $str443$_Nu_);
        html_declare_glyph($XI_CAP, $str445$_Xi_);
        html_declare_glyph($OMICRON_CAP, $str447$_Omicron_);
        html_declare_glyph($PI_CAP, $str449$_Pi_);
        html_declare_glyph($RHO_CAP, $str451$_Rho_);
        html_declare_glyph($SIGMA_CAP, $str453$_Sigma_);
        html_declare_glyph($TAU_CAP, $str455$_Tau_);
        html_declare_glyph($UPSILON_CAP, $str457$_Upsilon_);
        html_declare_glyph($PHI_CAP, $str459$_Phi_);
        html_declare_glyph($CHI_CAP, $str461$_Chi_);
        html_declare_glyph($PSI_CAP, $str463$_Psi_);
        html_declare_glyph($OMEGA_CAP, $str465$_Omega_);
        html_declare_glyph($ALPHA, $str467$_alpha_);
        html_declare_glyph($BETA, $str469$_beta_);
        html_declare_glyph($GAMMA, $str471$_gamma_);
        html_declare_glyph($DELTA, $str473$_delta_);
        html_declare_glyph($EPSILON, $str475$_epsilon_);
        html_declare_glyph($ZETA, $str477$_zeta_);
        html_declare_glyph($ETA, $str479$_eta_);
        html_declare_glyph($THETA, $str481$_theta_);
        html_declare_glyph($IOTA, $str483$_iota_);
        html_declare_glyph($KAPPA, $str485$_kappa_);
        html_declare_glyph($LAMBDA, $str487$_lambda_);
        html_declare_glyph($MU, $str489$_mu_);
        html_declare_glyph($NU, $str491$_nu_);
        html_declare_glyph($XI, $str493$_xi_);
        html_declare_glyph($OMICRON, $str495$_omicron_);
        html_declare_glyph($PI, $str497$_pi_);
        html_declare_glyph($RHO, $str499$_rho_);
        html_declare_glyph($SIGMAF, $str501$_sigmaf_);
        html_declare_glyph($SIGMA, $str503$_sigma_);
        html_declare_glyph($TAU, $str505$_tau_);
        html_declare_glyph($UPSILON, $str507$_upsilon_);
        html_declare_glyph($PHI, $str509$_phi_);
        html_declare_glyph($CHI, $str511$_chi_);
        html_declare_glyph($PSI, $str513$_psi_);
        html_declare_glyph($OMEGA, $str515$_omega_);
        html_declare_glyph($THETASYM, $str481$_theta_);
        html_declare_glyph($UPSIH, $str518$_upsih_);
        html_declare_glyph($PIV, $str520$_piv_);
        html_declare_glyph($BULL, $str522$_bull_);
        html_declare_glyph($HELLIP, $str524$_hellip_);
        html_declare_glyph($PRIME, $str526$_prime_);
        html_declare_glyph($PRIME_DBL, $str528$_Prime_);
        html_declare_glyph($OLINE, $str530$_oline_);
        html_declare_glyph($FRASL, $str532$_frasl_);
        html_declare_glyph($WEIERP, $str534$_weierp_);
        html_declare_glyph($IMAGE, $str536$_image_);
        html_declare_glyph($REAL, $str538$_real_);
        html_declare_glyph($TRADE, $str540$_trade_);
        html_declare_glyph($ALEFSYM, $str542$_alefsym_);
        html_declare_glyph($UPWARDS_ARROW, $str544$_uarr_);
        html_declare_glyph($RIGHTWARDS_ARROW, $str546$_rarr_);
        html_declare_glyph($LARR, $str548$_larr_);
        html_declare_glyph($UARR, $str544$_uarr_);
        html_declare_glyph($RARR, $str546$_rarr_);
        html_declare_glyph($DARR, $str552$_darr_);
        html_declare_glyph($HARR, $str554$_harr_);
        html_declare_glyph($CRARR, $str556$_crarr_);
        html_declare_glyph($LARR_DBL, $str558$_lArr_);
        html_declare_glyph($UARR_DBL, $str560$_uArr_);
        html_declare_glyph($RARR_DBL, $str562$_rArr_);
        html_declare_glyph($DARR_DBL, $str564$_dArr_);
        html_declare_glyph($HARR_DBL, $str566$_hArr_);
        html_declare_glyph($FORALL, $str568$_forall_);
        html_declare_glyph($PART, $str570$_part_);
        html_declare_glyph($EXIST, $str572$_exist_);
        html_declare_glyph($EMPTY, $str574$_empty_);
        html_declare_glyph($NABLA, $str576$_nabla_);
        html_declare_glyph($ISIN, $str578$_isin_);
        html_declare_glyph($NOTIN, $str580$_notin_);
        html_declare_glyph($NI, $str582$_ni_);
        html_declare_glyph($PROD, $str584$_prod_);
        html_declare_glyph($SUM, $str586$_sum_);
        html_declare_glyph($MINUS, $str588$_minus_);
        html_declare_glyph($LOWAST, $str590$_lowast_);
        html_declare_glyph($RADIC, $str592$_radic_);
        html_declare_glyph($PROP, $str594$_prop_);
        html_declare_glyph($INFIN, $str596$_infin_);
        html_declare_glyph($ANG, $str598$_ang_);
        html_declare_glyph($AND, $str600$_and_);
        html_declare_glyph($OR, $str602$_or_);
        html_declare_glyph($CAP, $str604$_cap_);
        html_declare_glyph($CUP, $str606$_cup_);
        html_declare_glyph($INT, $str608$_int_);
        html_declare_glyph($THERE4, $str610$_there4_);
        html_declare_glyph($SIM, $str612$_sim_);
        html_declare_glyph($CONG, $str614$_cong_);
        html_declare_glyph($ASYMP, $str616$_asymp_);
        html_declare_glyph($NE, $str618$_ne_);
        html_declare_glyph($EQUIV, $str620$_equiv_);
        html_declare_glyph($LE, $str622$_le_);
        html_declare_glyph($GE, $str624$_ge_);
        html_declare_glyph($SUB, $str626$_sub_);
        html_declare_glyph($SUP, $str628$_sup_);
        html_declare_glyph($NSUB, $str630$_nsub_);
        html_declare_glyph($SUBE, $str632$_sube_);
        html_declare_glyph($SUPE, $str634$_supe_);
        html_declare_glyph($OPLUS, $str636$_oplus_);
        html_declare_glyph($OTIMES, $str638$_otimes_);
        html_declare_glyph($PERP, $str640$_perp_);
        html_declare_glyph($SDOT, $str642$_sdot_);
        html_declare_glyph($LCEIL, $str644$_lceil_);
        html_declare_glyph($RCEIL, $str646$_rceil_);
        html_declare_glyph($LFLOOR, $str648$_lfloor_);
        html_declare_glyph($RFLOOR, $str650$_rfloor_);
        html_declare_glyph($LANG, $str652$_lang_);
        html_declare_glyph($RANG, $str654$_rang_);
        html_declare_glyph($LOZ, $str656$_loz_);
        html_declare_glyph($SPADES, $str658$_spades_);
        html_declare_glyph($CLUBS, $str660$_clubs_);
        html_declare_glyph($HEARTS, $str662$_hearts_);
        html_declare_glyph($DIAMS, $str664$_diams_);
        html_declare_glyph($FROWNY_FACE, $str666$__9785_);
        html_macros.note_cgi_handler_function(HTML_ECHO_ARGS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HTML_ECHO_FILE, $HTML_HANDLER);
        sunit_external.define_test_category($html_utils_test_category$.getGlobalValue(), UNPROVIDED);
        sunit_external.define_test_suite($html_utils_test_suite$.getGlobalValue(), list($html_utils_test_category$.getGlobalValue()), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    static private final SubLString $str_alt3$__x = makeString("&#x");

    static private final SubLString $str_alt4$_ = makeString(";");

    static private final SubLString $str_alt6$_S = makeString("~S");

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeString("i"), makeString("b"), makeString("sub"), makeString("sup"), makeString("pre"), makeString("code"), makeString("blockquote"), makeString("p"), makeString("br") });

    static private final SubLSymbol $sym10$EL_VARIABLE_CHAR_ = makeSymbol("EL-VARIABLE-CHAR?");

    static private final SubLSymbol $sym13$STRING_ = makeSymbol("STRING=");

    static private final SubLString $$$sub = makeString("sub");

    static private final SubLString $$$small = makeString("small");

    static private final SubLString $str_alt16$_ = makeString("<");

    static private final SubLString $str_alt17$_ = makeString("/");

    static private final SubLString $str_alt18$_ = makeString(">");

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt31 = list(list(list(makeString("#$rdfs:label is")), makeString("<a href=\"&opencyc;Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is")), list(list(makeString("#$rdfs:label is #$owl:sameAs http://www.w3.org/2000/01/rdf-schema#label")), makeString("<a href=\"&opencyc;Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is <font color=\"#ff0000\">#$owl:sameAs</font> <a href= \"http://www.w3.org/2000/01/rdf-schema#label\">http://www.w3.org/2000/01/rdf-schema#label</a>")), list(list(makeString("This is a <code>META-VARIABLE</code>.")), makeString("This is a <code><b>META-VARIABLE</b></code>.")), list(list(makeString("<code>(#$isa #$Emu THING)</code>.")), makeString("<code>(<a href=\"&opencyc;Mx4rvViBBJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">isa</a> <a href=\"&opencyc;Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a> <b>THING</b>)</code>.")), list(list(makeString("Bert is an #$Emu.")), makeString("Bert is an <a href=\"&opencyc;Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>.")), list(list(makeString("Please link to http://www.cyc.com.")), makeString("Please link to <a href= \"http://www.cyc.com\">http://www.cyc.com</a>.")), list(list(makeString("#$Emus are kind and gentle creatures.")), makeString("<a href=\"&opencyc;Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>s are kind and gentle creatures.")));

    static private final SubLString $str_alt32$_A = makeString("~A");

    static private final SubLString $str_alt33$_a_href___S__A__a_ = makeString("<a href= ~S>~A</a>");

    static private final SubLList $list_alt34 = list(makeString("es"), makeString("es:"));

    static private final SubLList $list_alt38 = list(CHAR_space);

    static private final SubLString $str_alt39$_p_ = makeString("<p>");

    static private final SubLString $str_alt41$_pre_ = makeString("<pre>");

    static private final SubLString $str_alt42$__ = makeString("  ");

    static private final SubLString $str_alt43$__pre_ = makeString("</pre>");

    static private final SubLSymbol $sym44$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");



    static private final SubLString $str_alt46$assertion_is_not_a_documentation_ = makeString("assertion is not a documentation assertion");

    static private final SubLList $list_alt47 = list(makeString("<p>"), makeString("<pre>"));

    static private final SubLString $str_alt48$_code_ = makeString("<code>");

    static private final SubLString $str_alt49$_b_ = makeString("<b>");

    static private final SubLString $str_alt50$__code_ = makeString("</code>");

    static private final SubLString $str_alt51$__b_ = makeString("</b>");

    static private final SubLString $str_alt52$_ = makeString("(");

    static private final SubLString $str_alt53$_ = makeString(" ");

    static private final SubLString $str_alt54$___ = makeString(" . ");

    @Override
    public void declareFunctions() {
        declare_html_utilities_file();
    }

    static private final SubLString $str_alt55$_ = makeString(")");

    static private final SubLString $str_alt56$___ = makeString("-_.");

    @Override
    public void initializeVariables() {
        init_html_utilities_file();
    }

    static private final SubLString $str_alt57$__C_C = makeString("%~C~C");

    @Override
    public void runTopLevelForms() {
        setup_html_utilities_file();
    }

    static private final SubLString $str_alt58$_ = makeString("=");

    static private final SubLString $str_alt59$background_color_ = makeString("background-color:");

    static {
    }

    static private final SubLList $list_alt60 = list(new SubLObject[]{ cons(makeKeyword("TOP"), makeString("top")), cons(makeKeyword("MIDDLE"), makeString("middle")), cons(makeKeyword("BOTTOM"), makeString("bottom")), cons($LEFT, makeString("left")), cons(makeKeyword("CENTER"), makeString("center")), cons(makeKeyword("RIGHT"), makeString("right")), cons(makeKeyword("TEXTTOP"), makeString("top")), cons(makeKeyword("ABSMIDDLE"), makeString("middle")), cons(makeKeyword("BASELINE"), makeString("bottom")), cons(makeKeyword("ABSBOTTOM"), makeString("bottom")) });

    static private final SubLString $str_alt61$http___www_cyc_com = makeString("http://www.cyc.com");

    static private final SubLString $str_alt65$Copyright__copy__1995____A_ = makeString("Copyright &copy; 1995 - ~A ");

    static private final SubLString $str_alt66$___All_rights_reserved___ = makeString(".  All rights reserved.  ");

    static private final SubLString $str_alt68$cyc_logo_violet_16_gif = makeString("cyc-logo-violet-16.gif");

    static private final SubLString $str_alt70$cyc_logo_violet_60_gif = makeString("cyc-logo-violet-60.gif");

    static private final SubLString $str_alt72$cyc_logo_tiny_gif = makeString("cyc-logo-tiny.gif");

    static private final SubLString $str_alt74$cyc_logo_sm_gif = makeString("cyc-logo-sm.gif");

    static private final SubLString $str_alt76$cyc_logo_10_t_gif = makeString("cyc-logo-10-t.gif");

    static private final SubLString $str_alt78$cyc_logo_25_t_gif = makeString("cyc-logo-25-t.gif");

    static private final SubLString $str_alt80$cyc_logo_50_t_gif = makeString("cyc-logo-50-t.gif");

    static private final SubLString $str_alt82$Content_type = makeString("Content-type");

    static private final SubLString $str_alt83$text_html__charset_UTF_8 = makeString("text/html; charset=UTF-8");

    static private final SubLString $str_alt85$Last_Modified = makeString("Last-Modified");

    static private final SubLString $str_alt86$Cache_Control = makeString("Cache-Control");

    static private final SubLString $str_alt87$no_cache = makeString("no-cache");

    static private final SubLList $list_alt88 = list(list(makeSymbol("&KEY"), list(makeSymbol("HH"), ZERO_INTEGER), list(makeSymbol("MM"), ZERO_INTEGER), list(makeSymbol("SS"), ZERO_INTEGER)));

    static private final SubLList $list_alt89 = list(makeKeyword("HH"), makeKeyword("MM"), makeKeyword("SS"));

    static private final SubLList $list_alt95 = list(makeSymbol("HTML-META-EXPIRES"));

    static private final SubLList $list_alt97 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("UNIV-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))));

    static private final SubLList $list_alt99 = list(makeSymbol("HTML-META-LAST-MODIFIED"));

    static private final SubLList $list_alt102 = list(makeSymbol("HTML-META-DONT-CACHE"));

    static private final SubLString $str_alt104$NOINDEX__NOFOLLOW = makeString("NOINDEX, NOFOLLOW");

    static private final SubLString $str_alt105$INDEX__FOLLOW = makeString("INDEX, FOLLOW");

    static private final SubLString $str_alt106$NOINDEX__FOLLOW = makeString("NOINDEX, FOLLOW");

    static private final SubLString $str_alt107$INDEX__NOFOLLOW = makeString("INDEX, NOFOLLOW");

    static private final SubLString $str_alt108$Invalid_HTML_meta_select_robot_in = makeString("Invalid HTML meta select robot instruction.");

    static private final SubLList $list_alt110 = list(makeSymbol("SRC"), makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("MAP"));

    static private final SubLList $list_alt111 = list(makeSymbol("SRC"), makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("MAP-ITEMS"));

    static private final SubLString $str_alt112$_x = makeString(".x");

    static private final SubLString $str_alt113$_y = makeString(".y");

    static private final SubLList $list_alt114 = list(makeSymbol("X-RANGE"), makeSymbol("Y-RANGE"), makeSymbol("VALUE"));

    static private final SubLList $list_alt115 = list(makeSymbol("ARG-NAME"), makeSymbol("VALUE"));

    static private final SubLString $str_alt121$Run_Time__ = makeString("Run Time :");

    static private final SubLString $str_alt122$Elapsed_Time__ = makeString("Elapsed Time :");

    static private final SubLString $str_alt124$Current_Total__ = makeString("Current Total :");

    static private final SubLString $str_alt125$_of_ = makeString(" of ");

    static private final SubLString $str_alt127$_D_ = makeString("~D%");

    static private final SubLString $str_alt128$_No_data_to_graph_ = makeString("[No data to graph]");

    static private final SubLString $str_alt131$100_ = makeString("100%");

    static private final SubLString $str_alt132$1_ = makeString("1%");

    static private final SubLString $str_alt133$_A_ = makeString("~A%");

    static private final SubLString $str_alt134$5_ = makeString("5%");

    static private final SubLString $str_alt135$95_ = makeString("95%");

    static private final SubLString $str_alt136$__D = makeString("~:D");

    static private final SubLList $list_alt141 = list(list(makeKeyword("ENTRY"), makeSymbol("TRUE"), makeString("Value")));

    static private final SubLList $list_alt144 = list(makeSymbol("TYPE"), makeSymbol("DATUM"), makeSymbol("POSSIBILITY-FANCY-NAME"));

    static private final SubLList $list_alt145 = list($TEXT, NIL);

    static private final SubLList $list_alt146 = list(makeSymbol("TYPE"), makeSymbol("SIZE"));

    static private final SubLString $str_alt148$The_value_entered_for___A__was_no = makeString("The value entered for '~A' was not valid.");

    static private final SubLString $str_alt149$No_value_was_entered_for___A__ = makeString("No value was entered for '~A'.");

    static private final SubLString $str_alt150$No_choice_was_made_for___A__ = makeString("No choice was made for '~A'.");

    static private final SubLString $str_alt151$_S_is_not_a_declared_control_para = makeString("~S is not a declared control parameter");

    static private final SubLString $str_alt154$entry__A = makeString("entry-~A");

    static private final SubLString $str_alt155$radio__A = makeString("radio-~A");

    static private final SubLString $str_alt161$en_gb = makeString("en-gb");

    static private final SubLString $str_alt169$_lt_ = makeString("&lt;");

    static private final SubLString $str_alt171$_gt_ = makeString("&gt;");

    static private final SubLString $str_alt173$_amp_ = makeString("&amp;");

    static private final SubLString $str_alt175$_quot_ = makeString("&quot;");

    static private final SubLString $str_alt177$_reg_ = makeString("&reg;");

    static private final SubLString $str_alt179$_copy_ = makeString("&copy;");

    static private final SubLString $str_alt180$_nbsp_ = makeString("&nbsp;");

    static private final SubLString $str_alt182$_emsp_ = makeString("&emsp;");

    static private final SubLString $str_alt184$_ensp_ = makeString("&ensp;");

    static private final SubLString $str_alt186$_iexcl_ = makeString("&iexcl;");

    static private final SubLString $str_alt188$_cent_ = makeString("&cent;");

    static private final SubLString $str_alt190$_pound_ = makeString("&pound;");

    static private final SubLString $str_alt192$_curren_ = makeString("&curren;");

    static private final SubLString $str_alt194$_yen_ = makeString("&yen;");

    static private final SubLString $str_alt196$_brvba_ = makeString("&brvba;");

    static private final SubLString $str_alt198$_sect_ = makeString("&sect;");

    static private final SubLString $str_alt200$_uml_ = makeString("&uml;");

    static private final SubLString $str_alt202$_ordf_ = makeString("&ordf;");

    static private final SubLString $str_alt204$_laquo_ = makeString("&laquo;");

    static private final SubLString $str_alt206$_not_ = makeString("&not;");

    static private final SubLString $str_alt208$_shy_ = makeString("&shy;");

    static private final SubLString $str_alt210$_macr_ = makeString("&macr;");

    static private final SubLString $str_alt212$_deg_ = makeString("&deg;");

    static private final SubLString $str_alt214$_plusmn_ = makeString("&plusmn;");

    static private final SubLString $str_alt216$_sup2_ = makeString("&sup2;");

    static private final SubLString $str_alt218$_sup3_ = makeString("&sup3;");

    static private final SubLString $str_alt220$_acute_ = makeString("&acute;");

    static private final SubLString $str_alt222$_micro_ = makeString("&micro;");

    static private final SubLString $str_alt224$_para_ = makeString("&para;");

    static private final SubLString $str_alt226$_middoy_ = makeString("&middoy;");

    static private final SubLString $str_alt228$_cedil_ = makeString("&cedil;");

    static private final SubLString $str_alt230$_sup1_ = makeString("&sup1;");

    static private final SubLString $str_alt232$_ordm_ = makeString("&ordm;");

    static private final SubLString $str_alt234$_raquo_ = makeString("&raquo;");

    static private final SubLString $str_alt236$_frac14_ = makeString("&frac14;");

    static private final SubLString $str_alt238$_frac12_ = makeString("&frac12;");

    static private final SubLString $str_alt240$_frac34_ = makeString("&frac34;");

    static private final SubLString $str_alt242$_iquest_ = makeString("&iquest;");

    static private final SubLString $str_alt244$_Agrave_ = makeString("&Agrave;");

    static private final SubLString $str_alt246$_Aacute_ = makeString("&Aacute;");

    static private final SubLString $str_alt248$_Acirc_ = makeString("&Acirc;");

    static private final SubLString $str_alt250$_Atilde_ = makeString("&Atilde;");

    static private final SubLString $str_alt252$_Auml_ = makeString("&Auml;");

    static private final SubLString $str_alt254$_Aring_ = makeString("&Aring;");

    static private final SubLString $str_alt256$_AElig_ = makeString("&AElig;");

    static private final SubLString $str_alt258$_Ccedil_ = makeString("&Ccedil;");

    static private final SubLString $str_alt260$_Egrave_ = makeString("&Egrave;");

    static private final SubLString $str_alt262$_Eacute_ = makeString("&Eacute;");

    static private final SubLString $str_alt264$_Ecirc_ = makeString("&Ecirc;");

    static private final SubLString $str_alt266$_Euml_ = makeString("&Euml;");

    static private final SubLString $str_alt268$_Igrave_ = makeString("&Igrave;");

    static private final SubLString $str_alt270$_Iacute_ = makeString("&Iacute;");

    static private final SubLString $str_alt272$_Icirc_ = makeString("&Icirc;");

    static private final SubLString $str_alt274$_Iuml_ = makeString("&Iuml;");

    static private final SubLString $str_alt276$_ETH_ = makeString("&ETH;");

    static private final SubLString $str_alt278$_Ntilde_ = makeString("&Ntilde;");

    static private final SubLString $str_alt280$_Ograve_ = makeString("&Ograve;");

    static private final SubLString $str_alt282$_Oacute_ = makeString("&Oacute;");

    static private final SubLString $str_alt284$_Ocirc_ = makeString("&Ocirc;");

    static private final SubLString $str_alt286$_Otilde_ = makeString("&Otilde;");

    static private final SubLString $str_alt288$_Ouml_ = makeString("&Ouml;");

    static private final SubLString $str_alt290$_times_ = makeString("&times;");

    static private final SubLString $str_alt292$_Oslash_ = makeString("&Oslash;");

    static private final SubLString $str_alt294$_Ugrave_ = makeString("&Ugrave;");

    static private final SubLString $str_alt296$_Uacute_ = makeString("&Uacute;");

    static private final SubLString $str_alt298$_Ucirc_ = makeString("&Ucirc;");

    static private final SubLString $str_alt300$_Uuml_ = makeString("&Uuml;");

    static private final SubLString $str_alt302$_Yacute_ = makeString("&Yacute;");

    static private final SubLString $str_alt304$_THORN_ = makeString("&THORN;");

    static private final SubLString $str_alt306$_szlig_ = makeString("&szlig;");

    static private final SubLString $str_alt308$_agrave_ = makeString("&agrave;");

    static private final SubLString $str_alt310$_aacute_ = makeString("&aacute;");

    static private final SubLString $str_alt312$_acirc_ = makeString("&acirc;");

    static private final SubLString $str_alt314$_atilde_ = makeString("&atilde;");

    static private final SubLString $str_alt316$_auml_ = makeString("&auml;");

    static private final SubLString $str_alt318$_aring_ = makeString("&aring;");

    static private final SubLString $str_alt320$_aelig_ = makeString("&aelig;");

    static private final SubLString $str_alt322$_ccedil_ = makeString("&ccedil;");

    static private final SubLString $str_alt324$_egrave_ = makeString("&egrave;");

    static private final SubLString $str_alt326$_eacute_ = makeString("&eacute;");

    static private final SubLString $str_alt328$_ecirc_ = makeString("&ecirc;");

    static private final SubLString $str_alt330$_euml_ = makeString("&euml;");

    static private final SubLString $str_alt332$_igrave_ = makeString("&igrave;");

    static private final SubLString $str_alt334$_iacute_ = makeString("&iacute;");

    static private final SubLString $str_alt336$_icirc_ = makeString("&icirc;");

    static private final SubLString $str_alt338$_iuml_ = makeString("&iuml;");

    static private final SubLString $str_alt340$_eth_ = makeString("&eth;");

    static private final SubLString $str_alt342$_ntilde_ = makeString("&ntilde;");

    static private final SubLString $str_alt344$_ograve_ = makeString("&ograve;");

    static private final SubLString $str_alt346$_oacute_ = makeString("&oacute;");

    static private final SubLString $str_alt348$_ocirc_ = makeString("&ocirc;");

    static private final SubLString $str_alt350$_otilde_ = makeString("&otilde;");

    static private final SubLString $str_alt352$_ouml_ = makeString("&ouml;");

    static private final SubLString $str_alt354$_divide_ = makeString("&divide;");

    static private final SubLString $str_alt356$_oslash_ = makeString("&oslash;");

    static private final SubLString $str_alt358$_ugrave_ = makeString("&ugrave;");

    static private final SubLString $str_alt360$_uacute_ = makeString("&uacute;");

    static private final SubLString $str_alt362$_ucirc_ = makeString("&ucirc;");

    static private final SubLString $str_alt364$_uuml_ = makeString("&uuml;");

    static private final SubLString $str_alt366$_yacute_ = makeString("&yacute;");

    static private final SubLString $str_alt368$_thorn_ = makeString("&thorn;");

    static private final SubLString $str_alt370$_yuml_ = makeString("&yuml;");

    static private final SubLString $str_alt372$_fnof_ = makeString("&fnof;");

    static private final SubLString $str_alt374$_Alpha_ = makeString("&Alpha;");

    static private final SubLString $str_alt376$_Beta_ = makeString("&Beta;");

    static private final SubLString $str_alt378$_Gamma_ = makeString("&Gamma;");

    static private final SubLString $str_alt380$_Delta_ = makeString("&Delta;");

    static private final SubLString $str_alt382$_Epsilon_ = makeString("&Epsilon;");

    static private final SubLString $str_alt384$_Zeta_ = makeString("&Zeta;");

    static private final SubLString $str_alt386$_Eta_ = makeString("&Eta;");

    static private final SubLString $str_alt388$_Theta_ = makeString("&Theta;");

    static private final SubLString $str_alt390$_Iota_ = makeString("&Iota;");

    static private final SubLString $str_alt392$_Kappa_ = makeString("&Kappa;");

    static private final SubLString $str_alt394$_Lambda_ = makeString("&Lambda;");

    static private final SubLString $str_alt396$_Mu_ = makeString("&Mu;");

    static private final SubLString $str_alt398$_Nu_ = makeString("&Nu;");

    static private final SubLString $str_alt400$_Xi_ = makeString("&Xi;");

    static private final SubLString $str_alt402$_Omicron_ = makeString("&Omicron;");

    static private final SubLString $str_alt404$_Pi_ = makeString("&Pi;");

    static private final SubLString $str_alt406$_Rho_ = makeString("&Rho;");

    static private final SubLString $str_alt408$_Sigma_ = makeString("&Sigma;");

    static private final SubLString $str_alt410$_Tau_ = makeString("&Tau;");

    static private final SubLString $str_alt412$_Upsilon_ = makeString("&Upsilon;");

    static private final SubLString $str_alt414$_Phi_ = makeString("&Phi;");

    static private final SubLString $str_alt416$_Chi_ = makeString("&Chi;");

    static private final SubLString $str_alt418$_Psi_ = makeString("&Psi;");

    static private final SubLString $str_alt420$_Omega_ = makeString("&Omega;");

    static private final SubLString $str_alt422$_alpha_ = makeString("&alpha;");

    static private final SubLString $str_alt424$_beta_ = makeString("&beta;");

    static private final SubLString $str_alt426$_gamma_ = makeString("&gamma;");

    static private final SubLString $str_alt428$_delta_ = makeString("&delta;");

    static private final SubLString $str_alt430$_epsilon_ = makeString("&epsilon;");

    static private final SubLString $str_alt432$_zeta_ = makeString("&zeta;");

    static private final SubLString $str_alt434$_eta_ = makeString("&eta;");

    static private final SubLString $str_alt436$_theta_ = makeString("&theta;");

    static private final SubLString $str_alt438$_iota_ = makeString("&iota;");

    static private final SubLString $str_alt440$_kappa_ = makeString("&kappa;");

    static private final SubLString $str_alt442$_lambda_ = makeString("&lambda;");

    static private final SubLString $str_alt444$_mu_ = makeString("&mu;");

    static private final SubLString $str_alt446$_nu_ = makeString("&nu;");

    static private final SubLString $str_alt448$_xi_ = makeString("&xi;");

    static private final SubLString $str_alt450$_omicron_ = makeString("&omicron;");

    static private final SubLString $str_alt452$_pi_ = makeString("&pi;");

    static private final SubLString $str_alt454$_rho_ = makeString("&rho;");

    static private final SubLString $str_alt456$_sigmaf_ = makeString("&sigmaf;");

    static private final SubLString $str_alt458$_sigma_ = makeString("&sigma;");

    static private final SubLString $str_alt460$_tau_ = makeString("&tau;");

    static private final SubLString $str_alt462$_upsilon_ = makeString("&upsilon;");

    static private final SubLString $str_alt464$_phi_ = makeString("&phi;");

    static private final SubLString $str_alt466$_chi_ = makeString("&chi;");

    static private final SubLString $str_alt468$_psi_ = makeString("&psi;");

    static private final SubLString $str_alt470$_omega_ = makeString("&omega;");

    static private final SubLString $str_alt473$_upsih_ = makeString("&upsih;");

    static private final SubLString $str_alt475$_piv_ = makeString("&piv;");

    static private final SubLString $str_alt477$_bull_ = makeString("&bull;");

    static private final SubLString $str_alt479$_hellip_ = makeString("&hellip;");

    static private final SubLString $str_alt481$_prime_ = makeString("&prime;");

    static private final SubLString $str_alt483$_Prime_ = makeString("&Prime;");

    static private final SubLString $str_alt485$_oline_ = makeString("&oline;");

    static private final SubLString $str_alt487$_frasl_ = makeString("&frasl;");

    static private final SubLString $str_alt489$_weierp_ = makeString("&weierp;");

    static private final SubLString $str_alt491$_image_ = makeString("&image;");

    static private final SubLString $str_alt493$_real_ = makeString("&real;");

    static private final SubLString $str_alt495$_trade_ = makeString("&trade;");

    static private final SubLString $str_alt497$_alefsym_ = makeString("&alefsym;");

    static private final SubLString $str_alt499$_uarr_ = makeString("&uarr;");

    static private final SubLString $str_alt501$_rarr_ = makeString("&rarr;");

    static private final SubLString $str_alt503$_larr_ = makeString("&larr;");

    static private final SubLString $str_alt507$_darr_ = makeString("&darr;");

    static private final SubLString $str_alt509$_harr_ = makeString("&harr;");

    static private final SubLString $str_alt511$_crarr_ = makeString("&crarr;");

    static private final SubLString $str_alt513$_lArr_ = makeString("&lArr;");

    static private final SubLString $str_alt515$_uArr_ = makeString("&uArr;");

    static private final SubLString $str_alt517$_rArr_ = makeString("&rArr;");

    static private final SubLString $str_alt519$_dArr_ = makeString("&dArr;");

    static private final SubLString $str_alt521$_hArr_ = makeString("&hArr;");

    static private final SubLString $str_alt523$_forall_ = makeString("&forall;");

    static private final SubLString $str_alt525$_part_ = makeString("&part;");

    static private final SubLString $str_alt527$_exist_ = makeString("&exist;");

    static private final SubLString $str_alt529$_empty_ = makeString("&empty;");

    static private final SubLString $str_alt531$_nabla_ = makeString("&nabla;");

    static private final SubLString $str_alt533$_isin_ = makeString("&isin;");

    static private final SubLString $str_alt535$_notin_ = makeString("&notin;");

    static private final SubLString $str_alt537$_ni_ = makeString("&ni;");

    static private final SubLString $str_alt539$_prod_ = makeString("&prod;");

    static private final SubLString $str_alt541$_sum_ = makeString("&sum;");

    static private final SubLString $str_alt543$_minus_ = makeString("&minus;");

    static private final SubLString $str_alt545$_lowast_ = makeString("&lowast;");

    static private final SubLString $str_alt547$_radic_ = makeString("&radic;");

    static private final SubLString $str_alt549$_prop_ = makeString("&prop;");

    static private final SubLString $str_alt551$_infin_ = makeString("&infin;");

    static private final SubLString $str_alt553$_ang_ = makeString("&ang;");

    static private final SubLString $str_alt555$_and_ = makeString("&and;");

    static private final SubLString $str_alt557$_or_ = makeString("&or;");

    static private final SubLString $str_alt559$_cap_ = makeString("&cap;");

    static private final SubLString $str_alt561$_cup_ = makeString("&cup;");

    static private final SubLString $str_alt563$_int_ = makeString("&int;");

    static private final SubLString $str_alt565$_there4_ = makeString("&there4;");

    static private final SubLString $str_alt567$_sim_ = makeString("&sim;");

    static private final SubLString $str_alt569$_cong_ = makeString("&cong;");

    static private final SubLString $str_alt571$_asymp_ = makeString("&asymp;");

    static private final SubLString $str_alt573$_ne_ = makeString("&ne;");

    static private final SubLString $str_alt575$_equiv_ = makeString("&equiv;");

    static private final SubLString $str_alt577$_le_ = makeString("&le;");

    static private final SubLString $str_alt579$_ge_ = makeString("&ge;");

    static private final SubLString $str_alt581$_sub_ = makeString("&sub;");

    static private final SubLString $str_alt583$_sup_ = makeString("&sup;");

    static private final SubLString $str_alt585$_nsub_ = makeString("&nsub;");

    static private final SubLString $str_alt587$_sube_ = makeString("&sube;");

    static private final SubLString $str_alt589$_supe_ = makeString("&supe;");

    static private final SubLString $str_alt591$_oplus_ = makeString("&oplus;");

    static private final SubLString $str_alt593$_otimes_ = makeString("&otimes;");

    static private final SubLString $str_alt595$_perp_ = makeString("&perp;");

    static private final SubLString $str_alt597$_sdot_ = makeString("&sdot;");

    static private final SubLString $str_alt599$_lceil_ = makeString("&lceil;");

    static private final SubLString $str_alt601$_rceil_ = makeString("&rceil;");

    static private final SubLString $str_alt603$_lfloor_ = makeString("&lfloor;");

    static private final SubLString $str_alt605$_rfloor_ = makeString("&rfloor;");

    static private final SubLString $str_alt607$_lang_ = makeString("&lang;");

    static private final SubLString $str_alt609$_rang_ = makeString("&rang;");

    static private final SubLString $str_alt611$_loz_ = makeString("&loz;");

    static private final SubLString $str_alt613$_spades_ = makeString("&spades;");

    static private final SubLString $str_alt615$_clubs_ = makeString("&clubs;");

    static private final SubLString $str_alt617$_hearts_ = makeString("&hearts;");

    static private final SubLString $str_alt619$_diams_ = makeString("&diams;");

    static private final SubLString $str_alt621$__9785_ = makeString("&#9785;");

    static private final SubLString $str_alt623$__ = makeString("&#");

    static private final SubLString $str_alt624$_ = makeString("_");

    static private final SubLString $str_alt625$Bad__HTML_FORM_FIELD_UNIQUIFIER_C = makeString("Bad *HTML-FORM-FIELD-UNIQUIFIER-CODE*: ~S");

    static private final SubLList $list_alt630 = list(makeSymbol("FILENAME"));

    static private final SubLString $str_alt632$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt635$_ = makeString("\"");

    static private final SubLString $str_alt636$____ = makeString("<!--");

    static private final SubLString $str_alt637$___ = makeString("-->");

    static private final SubLString $str_alt638$_script = makeString("<script");

    static private final SubLString $str_alt639$__script_ = makeString("</script>");

    static private final SubLString $str_alt640$__script = makeString("</script");

    static private final SubLList $list_alt641 = list(CHAR_backslash);

    static private final SubLList $list_alt642 = list(cons(makeString("&quot;"), makeString("\"")), cons(makeString("&amp;"), makeString("&")), cons(makeString("&nbsp;"), makeString(" ")));

    static private final SubLString $str_alt645$http___ = makeString("http://");

    static private final SubLString $str_alt648$_style = makeString("<style");

    static private final SubLString $str_alt649$__style_ = makeString("</style>");

    static private final SubLString $str_alt650$_file_input_ = makeString("_file_input_");

    static private final SubLString $str_alt651$this_form_ = makeString("this.form.");

    static private final SubLString $str_alt652$_value___this_value_ = makeString(".value = this.value;");

    static private final SubLList $list_alt654 = list(list(makeSymbol("HANDLER-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym655$FRAME_NAME_VAR = makeUninternedSymbol("FRAME-NAME-VAR");

    static private final SubLList $list_alt661 = list(NIL, NIL, NIL, makeString("multipart/form-data"));

    static private final SubLList $list_alt663 = list(T);

    static private final SubLString $str_alt664$_multipart_formdata = makeString(" multipart/formdata");

    static private final SubLString $str_alt665$application_octet_stream = makeString("application/octet-stream");

    static private final SubLSymbol $sym667$CHAR_ = makeSymbol("CHAR=");

    static private final SubLList $list_alt668 = list(makeSymbol("ITEM"), makeSymbol("VALUE"));

    static private final SubLString $str_alt669$__2__0X = makeString("%~2,'0X");

    static private final SubLString $str_alt670$____________________ = makeString("--------------------");

    static private final SubLString $str_alt682$sha1_js = makeString("sha1.js");

    static private final SubLString $str_alt683$new_login_id = makeString("new_login_id");

    static private final SubLString $str_alt684$hashed_password = makeString("hashed_password");

    static private final SubLString $str_alt687$unhashed_password_ = makeString("unhashed_password_");

    static private final SubLString $str_alt688$var_oldB64Pad___b64pad__b64pad___ = makeString("var oldB64Pad = b64pad; b64pad = '='; var theInput=(this.form.");

    static private final SubLString $str_alt689$_value_this_form_ = makeString(".value+this.form.");

    static private final SubLString $str_alt690$_value___this_form_ = makeString(".value); this.form.");

    static private final SubLString $str_alt691$_value_b64_sha1_theInput___b64pad = makeString(".value=b64_sha1(theInput); b64pad = oldB64Pad");
}

/**
 * Total time: 2858 ms
 */
