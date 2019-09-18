/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIA-WIDGETS
 *  source file: /cyc/top/cycl/cb-uia-widgets.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_uia_widgets extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_widgets() {
    }

    public static final SubLFile me = new cb_uia_widgets();


    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_uia_widgets$ = makeSymbol("*CB-UIA-WIDGETS*");

    public static final SubLObject declare_cb_uia_widget(SubLObject operator, SubLObject plist) {
        SubLSystemTrampolineFile.checkType(operator, UI_OPERATOR_P);
        SubLSystemTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        {
            SubLObject name = getf(plist, $NAME, UNPROVIDED);
            SubLSystemTrampolineFile.checkType(name, STRINGP);
        }
        {
            SubLObject render_request_method = getf(plist, $RENDER_REQUEST_METHOD, UNPROVIDED);
            SubLSystemTrampolineFile.checkType(render_request_method, SYMBOLP);
        }
        {
            SubLObject html_handler_method = getf(plist, $HTML_HANDLER_METHOD, UNPROVIDED);
            SubLSystemTrampolineFile.checkType(html_handler_method, SYMBOLP);
        }
        {
            SubLObject handle_reply_method = getf(plist, $HANDLE_REPLY_METHOD, UNPROVIDED);
            SubLSystemTrampolineFile.checkType(handle_reply_method, SYMBOLP);
        }
        return dictionary.dictionary_enter($cb_uia_widgets$.getGlobalValue(), operator, plist);
    }

    public static final SubLObject cb_uia_widget_state_lookup(SubLObject operator, SubLObject indicator) {
        return getf(dictionary.dictionary_lookup($cb_uia_widgets$.getGlobalValue(), operator, UNPROVIDED), indicator, UNPROVIDED);
    }

    public static final SubLObject cb_uia_widget_name(SubLObject interaction) {
        return cb_uia_widget_state_lookup(user_interaction_agenda.ui_operator(interaction), $NAME);
    }

    public static final SubLObject cb_uia_widget_render_request_method(SubLObject request) {
        return cb_uia_widget_state_lookup(request.first(), $RENDER_REQUEST_METHOD);
    }

    public static final SubLObject cb_uia_widget_html_handler_method(SubLObject interaction) {
        return cb_uia_widget_state_lookup(user_interaction_agenda.ui_operator(interaction), $HTML_HANDLER_METHOD);
    }

    public static final SubLObject cb_uia_widget_handle_reply_method(SubLObject interaction) {
        return cb_uia_widget_state_lookup(user_interaction_agenda.ui_operator(interaction), $HANDLE_REPLY_METHOD);
    }

    /**
     * Show INTERACTION as a sub-piece of some other interaction
     */
    public static final SubLObject cb_uia_show_widget(SubLObject interaction) {
        {
            SubLObject request = user_interaction_agenda.uia_generate_request(user_interaction_agenda.ui_agenda(interaction), interaction);
            SubLObject render_method = cb_uia_widget_render_request_method(request);
            if (NIL != render_method) {
                funcall(render_method, request);
            } else {
                Errors.warn($str_alt8$No_widget_render_request_method_d, user_interaction_agenda.ui_operator(interaction));
            }
        }
        return NIL;
    }

    /**
     * Handle the subset of ARGS relevant to the widget INTERACTION.
     * Should return the result of INTERACTION's completion.
     */
    public static final SubLObject cb_uia_widget_html_handler(SubLObject interaction, SubLObject args) {
        {
            SubLObject relevant_args = html_extract_all_input_for_widget(interaction, args);
            SubLObject html_handler_method = cb_uia_widget_html_handler_method(interaction);
            SubLObject handle_reply_method = cb_uia_widget_handle_reply_method(interaction);
            if (((html_handler_method.isSymbol() && (NIL != fboundp(html_handler_method))) && handle_reply_method.isSymbol()) && (NIL != fboundp(handle_reply_method))) {
                {
                    SubLObject reply = funcall(html_handler_method, interaction, relevant_args);
                    SubLObject result = funcall(handle_reply_method, reply);
                    return result;
                }
            }
        }
        return NIL;
    }

    // defconstant
    private static final SubLSymbol $widget_id_separator_char$ = makeSymbol("*WIDGET-ID-SEPARATOR-CHAR*");

    public static final SubLObject html_widget_text_input(SubLObject sub_interaction, SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        {
            SubLObject id = user_interaction_agenda.ui_id(sub_interaction);
            SubLObject field = cconcatenate(string_utilities.str(id), new SubLObject[]{ string_utilities.str($widget_id_separator_char$.getGlobalValue()), name });
            return html_utilities.html_text_input(field, v_default, size);
        }
    }

    public static final SubLObject html_widget_hidden_input(SubLObject sub_interaction, SubLObject name, SubLObject value) {
        {
            SubLObject id = user_interaction_agenda.ui_id(sub_interaction);
            SubLObject field = cconcatenate(string_utilities.str(id), new SubLObject[]{ string_utilities.str($widget_id_separator_char$.getGlobalValue()), name });
            return html_utilities.html_hidden_input(field, value, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return listp; a list of pairs of the form (id value)
    where ID is the ID of the sub-interaction for which the value of FIELD-NAME is VALUE.
     */
    public static final SubLObject html_widget_extract_inputs(SubLObject field_name, SubLObject args) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (arg.isCons()) {
                    {
                        SubLObject field_with_header = arg.first();
                        if (field_with_header.isString() && (NIL != find($widget_id_separator_char$.getGlobalValue(), field_with_header, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            {
                                SubLObject field = string_utilities.string_after(field_with_header, $widget_id_separator_char$.getGlobalValue());
                                if (field.equalp(field_name)) {
                                    {
                                        SubLObject id_string = string_utilities.string_upto(field_with_header, $widget_id_separator_char$.getGlobalValue());
                                        SubLObject id = string_utilities.string_to_integer(id_string);
                                        SubLObject value = second(arg);
                                        result = cons(list(id, value), result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return listp; a list of args, i.e. (<field> <value>) pairs,
    meant for SUB-INTERACTION, with the widget header stripped.
     */
    public static final SubLObject html_extract_all_input_for_widget(SubLObject sub_interaction, SubLObject args) {
        {
            SubLObject result = NIL;
            SubLObject id = user_interaction_agenda.ui_id(sub_interaction);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (arg.isCons()) {
                    {
                        SubLObject field_with_header = arg.first();
                        if (field_with_header.isString() && (NIL != find($widget_id_separator_char$.getGlobalValue(), field_with_header, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            {
                                SubLObject arg_id_string = string_utilities.string_upto(field_with_header, $widget_id_separator_char$.getGlobalValue());
                                SubLObject arg_id = string_utilities.string_to_integer(arg_id_string);
                                if (id.equal(arg_id)) {
                                    {
                                        SubLObject field = string_utilities.string_after(field_with_header, $widget_id_separator_char$.getGlobalValue());
                                        SubLObject value = second(arg);
                                        result = cons(list(field, value), result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static final SubLObject cb_uia_sentence_cloner_widget_render_request(SubLObject request) {
        {
            SubLObject datum = request;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt11);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt11);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt11);
            signature = current.first();
            current = current.rest();
            plist = current;
            {
                SubLObject interaction = user_interaction_agenda.find_ui_by_signature(signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($SHOW)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt13);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt13);
                            if (NIL == member(current_3, $list_alt14, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt13);
                        }
                        {
                            SubLObject original_sentence_tail = property_list_member($ORIGINAL_SENTENCE, current_2);
                            SubLObject original_sentence = (NIL != original_sentence_tail) ? ((SubLObject) (cadr(original_sentence_tail))) : NIL;
                            SubLObject modified_sentence_tail = property_list_member($MODIFIED_SENTENCE, current_2);
                            SubLObject modified_sentence = (NIL != modified_sentence_tail) ? ((SubLObject) (cadr(modified_sentence_tail))) : NIL;
                            SubLObject clone_type_tail = property_list_member($CLONE_TYPE, current_2);
                            SubLObject clone_type = (NIL != clone_type_tail) ? ((SubLObject) (cadr(clone_type_tail))) : NIL;
                            SubLObject editable_arg_info_tail = property_list_member($EDITABLE_ARG_INFO, current_2);
                            SubLObject editable_arg_info = (NIL != editable_arg_info_tail) ? ((SubLObject) (cadr(editable_arg_info_tail))) : NIL;
                            SubLObject header_string_tail = property_list_member($HEADER_STRING, current_2);
                            SubLObject header_string = (NIL != header_string_tail) ? ((SubLObject) (cadr(header_string_tail))) : NIL;
                            SubLObject button_text_tail = property_list_member($BUTTON_TEXT, current_2);
                            SubLObject button_text = (NIL != button_text_tail) ? ((SubLObject) (cadr(button_text_tail))) : NIL;
                            SubLObject indexical_strings_tail = property_list_member($INDEXICAL_STRINGS, current_2);
                            SubLObject indexical_strings = (NIL != indexical_strings_tail) ? ((SubLObject) (cadr(indexical_strings_tail))) : NIL;
                            SubLObject sentence_paraphrase_tail = property_list_member($SENTENCE_PARAPHRASE, current_2);
                            SubLObject sentence_paraphrase = (NIL != sentence_paraphrase_tail) ? ((SubLObject) (cadr(sentence_paraphrase_tail))) : NIL;
                            cb_sentence_cloner_widget_guts(interaction, original_sentence, modified_sentence, clone_type, editable_arg_info);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_sentence_cloner_widget_guts(SubLObject interaction, SubLObject original_sentence, SubLObject modified_sentence, SubLObject clone_type, SubLObject editable_arg_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject editable_arg_positions = Mapping.mapcar(symbol_function(SECOND), editable_arg_info);
                html_widget_hidden_input(interaction, $str_alt25$argpos_list, cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, editable_arg_positions));
                {
                    SubLObject output_list = uia_trampolines.uia_phrase_output_list(v_agenda, original_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLSystemTrampolineFile.checkType(output_list, PPH_PHRASE_OUTPUT_LIST_P);
                    {
                        SubLObject start_char_index = ZERO_INTEGER;
                        SubLObject end_char_index = ZERO_INTEGER;
                        SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string(output_list, T);
                        SubLObject whole_string = pph_utilities.pph_remove_html_tags(whole_html_string, NIL);
                        SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator(output_list);
                        while (NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p(iterator)) {
                            {
                                SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next(iterator);
                                SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
                                start_char_index = pph_macros.pph_output_list_find_start_char(raw_item_string, whole_string, end_char_index);
                                if (start_char_index.numG(end_char_index)) {
                                    {
                                        SubLObject string = pph_macros.pph_make_space_string(start_char_index, end_char_index);
                                        SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
                                        SubLObject html_open_tag = NIL;
                                        SubLObject html_close_tag = NIL;
                                        SubLObject arg = pph_phrase.pph_empty_cycl();
                                        SubLObject start_char_index_4 = end_char_index;
                                        if (NIL != show_sentence_cloner_input_boxP(arg_position, original_sentence, arg, editable_arg_info)) {
                                            {
                                                SubLObject info = sent_clone_widget_extract_editable_arg_info(arg_position, editable_arg_info);
                                                SubLObject type = info.first();
                                                SubLObject index = sent_clone_widget_get_argposition_index(arg_position, editable_arg_positions);
                                                SubLObject v_default = string;
                                                SubLObject size = cb_sentence_cloner_input_box_width(type, v_default);
                                                html_widget_hidden_input(interaction, cconcatenate($$$default, string_utilities.str(index)), v_default);
                                                html_widget_text_input(interaction, cconcatenate($$$input, string_utilities.str(index)), v_default, size);
                                            }
                                        } else {
                                            format(html_macros.$html_stream$.getDynamicValue(thread), string);
                                        }
                                        html_utilities.html_princ($str_alt29$_);
                                    }
                                }
                                end_char_index = pph_macros.pph_update_end_char_index(start_char_index, raw_item_string);
                                {
                                    SubLObject string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
                                    SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
                                    SubLObject html_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
                                    SubLObject html_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
                                    SubLObject arg = pph_data_structures.pph_phrase_output_item_cycl(item);
                                    if (NIL != show_sentence_cloner_input_boxP(arg_position, original_sentence, arg, editable_arg_info)) {
                                        {
                                            SubLObject info = sent_clone_widget_extract_editable_arg_info(arg_position, editable_arg_info);
                                            SubLObject type = info.first();
                                            SubLObject index = sent_clone_widget_get_argposition_index(arg_position, editable_arg_positions);
                                            SubLObject v_default = string;
                                            SubLObject size = cb_sentence_cloner_input_box_width(type, v_default);
                                            html_widget_hidden_input(interaction, cconcatenate($$$default, string_utilities.str(index)), v_default);
                                            html_widget_text_input(interaction, cconcatenate($$$input, string_utilities.str(index)), v_default, size);
                                        }
                                    } else {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), string);
                                    }
                                    html_utilities.html_princ($str_alt29$_);
                                }
                            }
                        } 
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sent_clone_widget_extract_editable_arg_info(SubLObject argpos, SubLObject arginfo) {
        return find(argpos, arginfo, symbol_function(EQUAL), SECOND, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sent_clone_widget_get_argposition_index(SubLObject argpos, SubLObject argpos_info) {
        return position(argpos, argpos_info, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Should we display the text for ARG-POSITION as an input box?
     */
    public static final SubLObject show_sentence_cloner_input_boxP(SubLObject arg_position, SubLObject sentence, SubLObject arg, SubLObject editable_arg_info) {
        {
            SubLObject info = (NIL != arg_position) ? ((SubLObject) (sent_clone_widget_extract_editable_arg_info(arg_position, editable_arg_info))) : NIL;
            return makeBoolean((NIL != info) && arg.equal(list_utilities.get_nested_nth(sentence, arg_position, UNPROVIDED)));
        }
    }

    // deflexical
    private static final SubLSymbol $cb_sentence_cloner_input_box_width_multiplier$ = makeSymbol("*CB-SENTENCE-CLONER-INPUT-BOX-WIDTH-MULTIPLIER*");

    public static final SubLObject cb_sentence_cloner_input_box_width(SubLObject type, SubLObject v_default) {
        return round(multiply(length(v_default), $cb_sentence_cloner_input_box_width_multiplier$.getGlobalValue()), UNPROVIDED);
    }

    public static final SubLObject cb_uia_sentence_cloner_widget_html_handler(SubLObject interaction, SubLObject args) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject arg_positions = cb_user_interaction_agenda.cb_uia_html_decode(v_agenda, html_utilities.html_extract_input($str_alt25$argpos_list, args));
            SubLObject arg_position_phrase_pairs = NIL;
            SubLObject list_var = NIL;
            SubLObject arg_position = NIL;
            SubLObject index = NIL;
            for (list_var = arg_positions, arg_position = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg_position = list_var.first() , index = add(ONE_INTEGER, index)) {
                {
                    SubLObject default_field = cconcatenate($$$default, string_utilities.str(index));
                    SubLObject input_field = cconcatenate($$$input, string_utilities.str(index));
                    SubLObject old_term_string = html_utilities.html_extract_input(default_field, args);
                    SubLObject new_term_string = html_utilities.html_extract_input(input_field, args);
                    if (!old_term_string.equalp(new_term_string)) {
                        arg_position_phrase_pairs = cons(list(arg_position, new_term_string), arg_position_phrase_pairs);
                    }
                }
            }
            arg_position_phrase_pairs = nreverse(arg_position_phrase_pairs);
            {
                SubLObject plist = list($ARG_POSITION_PHRASE_PAIRS, arg_position_phrase_pairs, $NEGATED, $FALSE);
                SubLObject reply = user_interaction_agenda.make_ui_reply_with_interaction(interaction, $ANSWER, plist);
                return reply;
            }
        }
    }

    public static final SubLObject cb_uia_sentence_cloner_widget_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt35);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                user_interaction_agenda.handle_ui_reply(reply);
                user_interaction_agenda.uia_act_promote_to_child(interaction);
            }
        }
        return $PROMOTED;
    }

    public static final SubLObject declare_cb_uia_widgets_file() {
        declareFunction("declare_cb_uia_widget", "DECLARE-CB-UIA-WIDGET", 2, 0, false);
        declareFunction("cb_uia_widget_state_lookup", "CB-UIA-WIDGET-STATE-LOOKUP", 2, 0, false);
        declareFunction("cb_uia_widget_name", "CB-UIA-WIDGET-NAME", 1, 0, false);
        declareFunction("cb_uia_widget_render_request_method", "CB-UIA-WIDGET-RENDER-REQUEST-METHOD", 1, 0, false);
        declareFunction("cb_uia_widget_html_handler_method", "CB-UIA-WIDGET-HTML-HANDLER-METHOD", 1, 0, false);
        declareFunction("cb_uia_widget_handle_reply_method", "CB-UIA-WIDGET-HANDLE-REPLY-METHOD", 1, 0, false);
        declareFunction("cb_uia_show_widget", "CB-UIA-SHOW-WIDGET", 1, 0, false);
        declareFunction("cb_uia_widget_html_handler", "CB-UIA-WIDGET-HTML-HANDLER", 2, 0, false);
        declareFunction("html_widget_text_input", "HTML-WIDGET-TEXT-INPUT", 2, 2, false);
        declareFunction("html_widget_hidden_input", "HTML-WIDGET-HIDDEN-INPUT", 3, 0, false);
        declareFunction("html_widget_extract_inputs", "HTML-WIDGET-EXTRACT-INPUTS", 2, 0, false);
        declareFunction("html_extract_all_input_for_widget", "HTML-EXTRACT-ALL-INPUT-FOR-WIDGET", 2, 0, false);
        declareFunction("cb_uia_sentence_cloner_widget_render_request", "CB-UIA-SENTENCE-CLONER-WIDGET-RENDER-REQUEST", 1, 0, false);
        declareFunction("cb_sentence_cloner_widget_guts", "CB-SENTENCE-CLONER-WIDGET-GUTS", 5, 0, false);
        declareFunction("sent_clone_widget_extract_editable_arg_info", "SENT-CLONE-WIDGET-EXTRACT-EDITABLE-ARG-INFO", 2, 0, false);
        declareFunction("sent_clone_widget_get_argposition_index", "SENT-CLONE-WIDGET-GET-ARGPOSITION-INDEX", 2, 0, false);
        declareFunction("show_sentence_cloner_input_boxP", "SHOW-SENTENCE-CLONER-INPUT-BOX?", 4, 0, false);
        declareFunction("cb_sentence_cloner_input_box_width", "CB-SENTENCE-CLONER-INPUT-BOX-WIDTH", 2, 0, false);
        declareFunction("cb_uia_sentence_cloner_widget_html_handler", "CB-UIA-SENTENCE-CLONER-WIDGET-HTML-HANDLER", 2, 0, false);
        declareFunction("cb_uia_sentence_cloner_widget_handle_reply", "CB-UIA-SENTENCE-CLONER-WIDGET-HANDLE-REPLY", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_widgets_file() {
        deflexical("*CB-UIA-WIDGETS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*WIDGET-ID-SEPARATOR-CHAR*", CHAR_vertical);
        deflexical("*CB-SENTENCE-CLONER-INPUT-BOX-WIDTH-MULTIPLIER*", $float$1_3);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_widgets_file() {
                declare_cb_uia_widget($SENTENCE_CLONER, $list_alt10);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol UI_OPERATOR_P = makeSymbol("UI-OPERATOR-P");







    private static final SubLSymbol $RENDER_REQUEST_METHOD = makeKeyword("RENDER-REQUEST-METHOD");



    private static final SubLSymbol $HTML_HANDLER_METHOD = makeKeyword("HTML-HANDLER-METHOD");

    private static final SubLSymbol $HANDLE_REPLY_METHOD = makeKeyword("HANDLE-REPLY-METHOD");

    static private final SubLString $str_alt8$No_widget_render_request_method_d = makeString("No widget render request method defined for ~a");

    private static final SubLSymbol $SENTENCE_CLONER = makeKeyword("SENTENCE-CLONER");

    static private final SubLList $list_alt10 = list($NAME, makeString("Sentence Cloner"), makeKeyword("RENDER-REQUEST-METHOD"), makeSymbol("CB-UIA-SENTENCE-CLONER-WIDGET-RENDER-REQUEST"), makeKeyword("HTML-HANDLER-METHOD"), makeSymbol("CB-UIA-SENTENCE-CLONER-WIDGET-HTML-HANDLER"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("CB-UIA-SENTENCE-CLONER-WIDGET-HANDLE-REPLY"));

    static private final SubLList $list_alt11 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("SIGNATURE"), makeSymbol("PLIST"));



    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("ORIGINAL-SENTENCE"), makeSymbol("MODIFIED-SENTENCE"), makeSymbol("CLONE-TYPE"), makeSymbol("EDITABLE-ARG-INFO"), makeSymbol("HEADER-STRING"), makeSymbol("BUTTON-TEXT"), makeSymbol("INDEXICAL-STRINGS"), makeSymbol("SENTENCE-PARAPHRASE") });

    static private final SubLList $list_alt14 = list(makeKeyword("ORIGINAL-SENTENCE"), makeKeyword("MODIFIED-SENTENCE"), makeKeyword("CLONE-TYPE"), makeKeyword("EDITABLE-ARG-INFO"), makeKeyword("HEADER-STRING"), makeKeyword("BUTTON-TEXT"), makeKeyword("INDEXICAL-STRINGS"), makeKeyword("SENTENCE-PARAPHRASE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $MODIFIED_SENTENCE = makeKeyword("MODIFIED-SENTENCE");

    private static final SubLSymbol $CLONE_TYPE = makeKeyword("CLONE-TYPE");

    private static final SubLSymbol $EDITABLE_ARG_INFO = makeKeyword("EDITABLE-ARG-INFO");

    private static final SubLSymbol $HEADER_STRING = makeKeyword("HEADER-STRING");

    private static final SubLSymbol $BUTTON_TEXT = makeKeyword("BUTTON-TEXT");

    private static final SubLSymbol $INDEXICAL_STRINGS = makeKeyword("INDEXICAL-STRINGS");

    private static final SubLSymbol $SENTENCE_PARAPHRASE = makeKeyword("SENTENCE-PARAPHRASE");



    static private final SubLString $str_alt25$argpos_list = makeString("argpos-list");



    static private final SubLString $$$default = makeString("default");

    static private final SubLString $$$input = makeString("input");

    static private final SubLString $str_alt29$_ = makeString(" ");

    public static final SubLFloat $float$1_3 = makeDouble(1.3);

    private static final SubLSymbol $ARG_POSITION_PHRASE_PAIRS = makeKeyword("ARG-POSITION-PHRASE-PAIRS");

    private static final SubLSymbol $NEGATED = makeKeyword("NEGATED");





    static private final SubLList $list_alt35 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    private static final SubLSymbol $PROMOTED = makeKeyword("PROMOTED");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_widgets_file();
    }

    public void initializeVariables() {
        init_cb_uia_widgets_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_widgets_file();
    }
}

