/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIA-MACROS
 *  source file: /cyc/top/cycl/cb-uia-macros.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_uia_macros extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_macros() {
    }

    public static final SubLFile me = new cb_uia_macros();


    // // Definitions
    public static final SubLObject cb_uiat_with_hoverover_support(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(PROGN, $list_alt1, append(body, NIL));
        }
    }

    // deflexical
    public static final SubLSymbol $cb_uiat_generate_entry_boxes_js$ = makeSymbol("*CB-UIAT-GENERATE-ENTRY-BOXES-JS*");

    public static final SubLObject cb_uiat_with_generating_inputs_script(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(PROGN, $list_alt3, append(body, NIL));
        }
    }

    /**
     * The counter used for meassuring the number of boxes to add.
     */
    public static final SubLObject cb_uiat_generate_counters_name(SubLObject id) {
        return cconcatenate(id, $str_alt4$_counter);
    }

    /**
     * The counter used for meassuring the number of boxes to add.
     */
    public static final SubLObject cb_uiat_generate_counters_id(SubLObject id) {
        return cconcatenate(id, $str_alt5$_counter_ID);
    }

    // deflexical
    public static final SubLSymbol $cb_uiat_generated_input_stem_id$ = makeSymbol("*CB-UIAT-GENERATED-INPUT-STEM-ID*");

    public static final SubLObject cb_uiat_non_generated_id(SubLObject input_id_stem, SubLObject counter_value) {
        if (counter_value == UNPROVIDED) {
            counter_value = ZERO_INTEGER;
        }
        return format(NIL, $str_alt7$_A_D, input_id_stem, counter_value);
    }

    public static final SubLObject cb_uiat_generated_input_counter(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject input_id_stem = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            input_id_stem = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt8);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt8);
                    if (NIL == member(current_1, $list_alt9, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt8);
                }
                {
                    SubLObject counter_value_tail = property_list_member($COUNTER_VALUE, current);
                    SubLObject counter_value = (NIL != counter_value_tail) ? ((SubLObject) (cadr(counter_value_tail))) : ZERO_INTEGER;
                    SubLObject counter_name = $sym12$COUNTER_NAME;
                    SubLObject counter_id = $sym13$COUNTER_ID;
                    return list(CLET, list(list(counter_name, list(CB_UIAT_GENERATE_COUNTERS_NAME, input_id_stem)), list(counter_id, list(CB_UIAT_GENERATE_COUNTERS_ID, input_id_stem))), list(HTML_HIDDEN_INPUT, counter_name, counter_value, counter_id), list(HTML_HIDDEN_INPUT, $cb_uiat_generated_input_stem_id$.getGlobalValue(), input_id_stem));
                }
            }
        }
    }

    public static final SubLObject cb_uiat_compute_generating_event_js(SubLObject parent_id, SubLObject input_id_stem, SubLObject size, SubLObject separator) {
        if (separator == UNPROVIDED) {
            separator = $$$br;
        }
        {
            SubLObject counter_id = cb_uiat_generate_counters_id(input_id_stem);
            return cconcatenate($str_alt19$addAnotherInput__, new SubLObject[]{ parent_id, $str_alt20$___, input_id_stem, $str_alt20$___, counter_id, $str_alt20$___, string_utilities.to_string(size), $str_alt20$___, separator, $str_alt21$___ });
        }
    }

    public static final SubLObject cb_uiat_input_generating_button(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject parent_id = NIL;
                    SubLObject input_id_stem = NIL;
                    SubLObject label = NIL;
                    SubLObject size = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    parent_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    input_id_stem = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    label = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    size = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        if (NIL == current) {
                            {
                                SubLObject event_script = $sym23$EVENT_SCRIPT;
                                return list(CLET, list(list(event_script, list(CB_UIAT_COMPUTE_GENERATING_EVENT_JS, parent_id, input_id_stem, size))), list(HTML_FANCY_INPUT, $$$button, $VALUE, label, $ONCLICK, event_script));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt22);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt22);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_generated_stem_id_from_args(SubLObject args) {
        return html_utilities.html_extract_input($cb_uiat_generated_input_stem_id$.getGlobalValue(), args);
    }

    public static final SubLObject cb_uiat_extract_generated_input_values(SubLObject args, SubLObject id_stem) {
        if (id_stem == UNPROVIDED) {
            id_stem = NIL;
        }
        if (NIL == id_stem) {
            id_stem = cb_uiat_generated_stem_id_from_args(args);
        }
        {
            SubLObject count = cb_uiat_generated_input_count(args, id_stem);
            if (count.isInteger()) {
                {
                    SubLObject values = make_list(count, $str_alt29$);
                    SubLObject index = NIL;
                    for (index = ZERO_INTEGER; index.numL(count); index = add(index, ONE_INTEGER)) {
                        {
                            SubLObject input_id = cb_uiat_non_generated_id(id_stem, index);
                            SubLObject result = html_utilities.html_extract_input(input_id, args);
                            set_nth(index, values, result);
                        }
                    }
                    return values;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_generated_input_count(SubLObject args, SubLObject id_stem) {
        if (id_stem == UNPROVIDED) {
            id_stem = NIL;
        }
        if (NIL == id_stem) {
            id_stem = cb_uiat_generated_stem_id_from_args(args);
        }
        if (id_stem.isString()) {
            {
                SubLObject counter = cb_uiat_generate_counters_name(id_stem);
                SubLObject value_string = html_utilities.html_extract_input(counter, args);
                if (NIL != value_string) {
                    {
                        SubLObject count = add(parse_integer(value_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ONE_INTEGER);
                        return count;
                    }
                }
            }
        }
        return NIL;
    }

    // deflexical
    public static final SubLSymbol $cb_uiat_generate_counter_input_js$ = makeSymbol("*CB-UIAT-GENERATE-COUNTER-INPUT-JS*");

    // deflexical
    public static final SubLSymbol $cb_uiat_counter_input_clicked_method$ = makeSymbol("*CB-UIAT-COUNTER-INPUT-CLICKED-METHOD*");

    public static final SubLObject cb_uiat_with_counter_input_support(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_JAVASCRIPT_EVENT_REMAPPING, $list_alt33, append(body, NIL));
        }
    }

    public static final SubLObject cb_uiat_generate_modification_script(SubLObject id, SubLObject delta) {
        return cconcatenate($str_alt34$updateCounterInputViaId__, new SubLObject[]{ id, $str_alt35$__, string_utilities.to_string(delta), $str_alt36$__ });
    }

    public static final SubLObject cb_uiat_counter_input(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            id = current.first();
            current = current.rest();
            {
                SubLObject initial_value = (current.isCons()) ? ((SubLObject) (current.first())) : ONE_INTEGER;
                destructuring_bind_must_listp(current, datum, $list_alt37);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject value_string = $sym38$VALUE_STRING;
                        SubLObject inc_script = $sym39$INC_SCRIPT;
                        SubLObject dec_script = $sym40$DEC_SCRIPT;
                        return list(CLET, list(list(value_string, listS(CCONCATENATE, $str_alt42$_, list(TO_STRING, initial_value), $list_alt44)), list(inc_script, listS(CB_UIAT_GENERATE_MODIFICATION_SCRIPT, id, $list_alt46)), list(dec_script, listS(CB_UIAT_GENERATE_MODIFICATION_SCRIPT, id, $list_alt47))), listS(JAVASCRIPT_NOTE_EVENT_REMAPPING, id, $list_alt49), listS(HTML_FANCY_ANCHOR, list($HREF, $dhtml_blank_href_js$, $ONCLICK, dec_script), $list_alt53), $list_alt54, list(new SubLObject[]{ HTML_FANCY_INPUT, $$$text, $ID, id, $SIZE, THREE_INTEGER, $NAME, id, $READONLY, T, $VALUE, value_string }), $list_alt54, listS(HTML_FANCY_ANCHOR, list($HREF, $dhtml_blank_href_js$, $ONCLICK, inc_script), $list_alt60));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt37);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uiat_body(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(HTML_FANCY_BODY, $list_alt62, $list_alt63, bq_cons(CB_UIAT_WITH_HOVEROVER_SUPPORT, append(body, NIL)));
        }
    }

    public static final SubLObject cb_uiat_display_no_interaction_body(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject operator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            operator = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PROGN, list(CB_UIA_SHOW_TITLE_LINE, operator), append(body, NIL));
            }
        }
    }

    public static final SubLObject cb_uiat_display_naked_body(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject interaction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    interaction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(PROGN, listS(PWHEN, list(CB_UI_SHOULD_BE_FOCUSED, interaction), $list_alt70), list(CB_UIA_SHOW_TITLE_LINE, list(UI_OPERATOR, interaction)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt67);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_ui_should_be_focused(SubLObject interaction) {
        if (T == user_interaction_agenda.ui_state_lookup(interaction, $FOCUSED_INTERACTION, UNPROVIDED)) {
            user_interaction_agenda.ui_state_update(interaction, $FOCUSED_INTERACTION, NIL);
            return T;
        } else
            if (NIL != user_interaction_agenda.ui_parent_interaction(interaction)) {
                return cb_ui_should_be_focused(user_interaction_agenda.ui_parent_interaction(interaction));
            } else {
                return NIL;
            }

    }

    public static final SubLObject cb_uiat_display_body(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject interaction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    interaction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(PROGN, list(CB_UIA_SHOW_INTERACTION_PREAMBLE, interaction), list(CB_UIAT_DISPLAY_NAKED_BODY, list(interaction)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt67);
                    }
                }
            }
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $cb_uiat_default_webpage_expiration_hours$ = makeSymbol("*CB-UIAT-DEFAULT-WEBPAGE-EXPIRATION-HOURS*");

    // defparameter
    public static final SubLSymbol $cb_uiat_default_webpage_expiration_minutes$ = makeSymbol("*CB-UIAT-DEFAULT-WEBPAGE-EXPIRATION-MINUTES*");

    // defparameter
    public static final SubLSymbol $cb_uiat_default_webpage_expiration_seconds$ = makeSymbol("*CB-UIAT-DEFAULT-WEBPAGE-EXPIRATION-SECONDS*");

    public static final SubLObject cb_uiat_document_expiration() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_meta_expires($cb_uiat_default_webpage_expiration_seconds$.getDynamicValue(thread), $cb_uiat_default_webpage_expiration_minutes$.getDynamicValue(thread), $cb_uiat_default_webpage_expiration_hours$.getDynamicValue(thread));
            html_utilities.html_meta_last_modified(get_universal_time());
            html_utilities.html_meta_dont_cache();
            return NIL;
        }
    }

    public static final SubLObject cb_uiat_webpage_expiration(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            if (NIL != datum) {
                cdestructuring_bind_error(datum, NIL);
            }
            access_macros.defmacro_obsolete_warning(CB_UIAT_WEBPAGE_EXPIRATION, $list_alt77);
            return $list_alt77;
        }
    }

    /**
     * Honor the hiding support ASAP
     */
    public static final SubLObject cb_uiat_display_naked_document(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt78);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject interaction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt78);
                    interaction = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt78);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt78);
                            if (NIL == member(current_2, $list_alt79, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt78);
                        }
                        {
                            SubLObject show_document_titleP_tail = property_list_member($kw80$SHOW_DOCUMENT_TITLE_, current);
                            SubLObject show_document_titleP = (NIL != show_document_titleP_tail) ? ((SubLObject) (cadr(show_document_titleP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject v_agenda = $sym81$AGENDA;
                                return list(PROGN, listS(HTML_DOCUMENT, new SubLObject[]{ list(PWHEN, show_document_titleP, list(CLET, list(list(v_agenda, list(UI_AGENDA, interaction))), list(HTML_HEAD, list(HTML_TITLE, list(CB_UIA_SHOW_ACTION_HINT, interaction, NIL, v_agenda))))), $list_alt77, $list_alt87, $list_alt88, $list_alt89, list(CB_UIAT_BODY, listS(CB_UIAT_DISPLAY_NAKED_BODY, list(interaction), append(body, NIL))), $list_alt91 }));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Honor the hiding support ASAP
     */
    public static final SubLObject cb_uiat_display_document(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt92);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject interaction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt92);
                    interaction = current.first();
                    current = current.rest();
                    {
                        SubLObject hiding_supportP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt92);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(HTML_DOCUMENT, new SubLObject[]{ $list_alt77, $list_alt87, $list_alt88, $list_alt89, listS(CB_UIAT_DISPLAY_BODY, list(interaction), append(body, NIL)), $list_alt91 });
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt92);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_launcher_document(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt94);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject operator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt94);
                    operator = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt94);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt94);
                            if (NIL == member(current_3, $list_alt95, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt94);
                        }
                        {
                            SubLObject handler_tail = property_list_member($HANDLER, current);
                            SubLObject handler = (NIL != handler_tail) ? ((SubLObject) (cadr(handler_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject title = uia_tool_declaration.ui_operator_name(operator);
                                SubLObject title_code = (title.isString()) ? ((SubLObject) (list(HTML_PRINC, title))) : list(PWHEN, title, list(HTML_PRINC, title));
                                return bq_cons(HTML_DOCUMENT, append(NIL != title ? ((SubLObject) (list(list(HTML_HEAD, list(HTML_TITLE, title_code))))) : NIL, list($list_alt77, list(CB_UIAT_BODY, NIL != handler ? ((SubLObject) (listS(CB_BASIC_FORM_HANDLER, list(handler), append(NIL != title ? ((SubLObject) (list(listS(PROGN, list(HTML_BIG, list(HTML_STRONG, title_code)), $list_alt101)))) : NIL, body, NIL)))) : bq_cons(PROGN, append(body, NIL))))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject macro_helper_cb_uia_html_print_encoded_args(SubLObject header_string, SubLObject arglist) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            html_utilities.html_url_princ(header_string);
            {
                SubLObject cdolist_list_var = arglist;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    html_utilities.html_princ($str_alt102$_);
                    html_utilities.html_url_princ(cb_user_interaction_agenda.cb_uia_html_encode(v_agenda, arg));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_uia_html_print_encoded_args(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject header_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt103);
            header_string = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arglist = $sym104$ARGLIST;
                return list(CLET, list(list(arglist, bq_cons(LIST, append(args, NIL)))), list(MACRO_HELPER_CB_UIA_HTML_PRINT_ENCODED_ARGS, header_string, arglist));
            }
        }
    }

    public static final SubLObject cb_uia_bind_decoded_args(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pattern = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt107);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt107);
            args = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CDESTRUCTURING_BIND, pattern, list(CB_UIA_HTML_DECODE_ARGS, $list_alt110, args), append(body, NIL));
            }
        }
    }

    /**
     * convert any keyword values to symbols, because of a difference in the way C and Allegro
     * keywords are handled
     */
    public static final SubLObject cb_uia_fancy_option(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_4 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt111);
                        current_4 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt111);
                        if (NIL == member(current_4, $list_alt112, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_4 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt111);
                    }
                    {
                        SubLObject selected_tail = property_list_member($SELECTED, current);
                        SubLObject selected = (NIL != selected_tail) ? ((SubLObject) (cadr(selected_tail))) : NIL;
                        SubLObject value_tail = property_list_member($VALUE, current);
                        SubLObject value = (NIL != value_tail) ? ((SubLObject) (cadr(value_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            if (value.isKeyword()) {
                                value = symbol_name(value);
                            }
                            return listS(HTML_FANCY_OPTION, list($SELECTED, selected, $VALUE, value), append(body, NIL));
                        }
                    }
                }
            }
        }
    }

    /**
     * Outputs a preferred UIA link
     */
    public static final SubLObject cb_uia_preferred_link(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt115);
            type = current.first();
            current = current.rest();
            {
                SubLObject arg1 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt115);
                current = current.rest();
                {
                    SubLObject arg2 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt115);
                    current = current.rest();
                    {
                        SubLObject arg3 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt115);
                        current = current.rest();
                        {
                            SubLObject arg4 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt115);
                            current = current.rest();
                            {
                                SubLObject arg5 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt115);
                                current = current.rest();
                                if (NIL == current) {
                                    return list(HTML_STRONG, list(CB_LINK, type, arg1, arg2, arg3, arg4, arg5));
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt115);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Output a preferred link which will complete any pending Concept Finder with TERM.
     */
    public static final SubLObject cb_uiat_concept_finder_select_link(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt117);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CB_UIA_PREFERRED_LINK, $UIA_CONCEPT_FINDER_THROW, v_term);
            } else {
                cdestructuring_bind_error(datum, $list_alt117);
            }
        }
        return NIL;
    }

    /**
     * Output a preferred link which will complete any pending Sentence Finder with SENTENCE.
     */
    public static final SubLObject cb_uiat_sentence_finder_select_link(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt120);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CB_UIA_PREFERRED_LINK, $UIA_SENTENCE_FINDER_THROW, sentence);
            } else {
                cdestructuring_bind_error(datum, $list_alt120);
            }
        }
        return NIL;
    }

    public static final SubLObject with_uima_of_interaction(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject interaction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    interaction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject v_agenda = $sym122$AGENDA;
                            SubLObject meta_agenda = $sym123$META_AGENDA;
                            return listS(CLET, list(list(v_agenda, list(UI_AGENDA, interaction)), list(meta_agenda, list(UIA_META_AGENDA, v_agenda)), list($cb_current_uima$, meta_agenda)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt67);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cb_uia_macros_file() {
        declareMacro("cb_uiat_with_hoverover_support", "CB-UIAT-WITH-HOVEROVER-SUPPORT");
        declareMacro("cb_uiat_with_generating_inputs_script", "CB-UIAT-WITH-GENERATING-INPUTS-SCRIPT");
        declareFunction("cb_uiat_generate_counters_name", "CB-UIAT-GENERATE-COUNTERS-NAME", 1, 0, false);
        declareFunction("cb_uiat_generate_counters_id", "CB-UIAT-GENERATE-COUNTERS-ID", 1, 0, false);
        declareFunction("cb_uiat_non_generated_id", "CB-UIAT-NON-GENERATED-ID", 1, 1, false);
        declareMacro("cb_uiat_generated_input_counter", "CB-UIAT-GENERATED-INPUT-COUNTER");
        declareFunction("cb_uiat_compute_generating_event_js", "CB-UIAT-COMPUTE-GENERATING-EVENT-JS", 3, 1, false);
        declareMacro("cb_uiat_input_generating_button", "CB-UIAT-INPUT-GENERATING-BUTTON");
        declareFunction("cb_uiat_generated_stem_id_from_args", "CB-UIAT-GENERATED-STEM-ID-FROM-ARGS", 1, 0, false);
        declareFunction("cb_uiat_extract_generated_input_values", "CB-UIAT-EXTRACT-GENERATED-INPUT-VALUES", 1, 1, false);
        declareFunction("cb_uiat_generated_input_count", "CB-UIAT-GENERATED-INPUT-COUNT", 1, 1, false);
        declareMacro("cb_uiat_with_counter_input_support", "CB-UIAT-WITH-COUNTER-INPUT-SUPPORT");
        declareFunction("cb_uiat_generate_modification_script", "CB-UIAT-GENERATE-MODIFICATION-SCRIPT", 2, 0, false);
        declareMacro("cb_uiat_counter_input", "CB-UIAT-COUNTER-INPUT");
        declareMacro("cb_uiat_body", "CB-UIAT-BODY");
        declareMacro("cb_uiat_display_no_interaction_body", "CB-UIAT-DISPLAY-NO-INTERACTION-BODY");
        declareMacro("cb_uiat_display_naked_body", "CB-UIAT-DISPLAY-NAKED-BODY");
        declareFunction("cb_ui_should_be_focused", "CB-UI-SHOULD-BE-FOCUSED", 1, 0, false);
        declareMacro("cb_uiat_display_body", "CB-UIAT-DISPLAY-BODY");
        declareFunction("cb_uiat_document_expiration", "CB-UIAT-DOCUMENT-EXPIRATION", 0, 0, false);
        declareMacro("cb_uiat_webpage_expiration", "CB-UIAT-WEBPAGE-EXPIRATION");
        declareMacro("cb_uiat_display_naked_document", "CB-UIAT-DISPLAY-NAKED-DOCUMENT");
        declareMacro("cb_uiat_display_document", "CB-UIAT-DISPLAY-DOCUMENT");
        declareMacro("cb_uia_launcher_document", "CB-UIA-LAUNCHER-DOCUMENT");
        declareFunction("macro_helper_cb_uia_html_print_encoded_args", "MACRO-HELPER-CB-UIA-HTML-PRINT-ENCODED-ARGS", 2, 0, false);
        declareMacro("cb_uia_html_print_encoded_args", "CB-UIA-HTML-PRINT-ENCODED-ARGS");
        declareMacro("cb_uia_bind_decoded_args", "CB-UIA-BIND-DECODED-ARGS");
        declareMacro("cb_uia_fancy_option", "CB-UIA-FANCY-OPTION");
        declareMacro("cb_uia_preferred_link", "CB-UIA-PREFERRED-LINK");
        declareMacro("cb_uiat_concept_finder_select_link", "CB-UIAT-CONCEPT-FINDER-SELECT-LINK");
        declareMacro("cb_uiat_sentence_finder_select_link", "CB-UIAT-SENTENCE-FINDER-SELECT-LINK");
        declareMacro("with_uima_of_interaction", "WITH-UIMA-OF-INTERACTION");
        return NIL;
    }

    public static final SubLObject init_cb_uia_macros_file() {
        deflexical("*CB-UIAT-GENERATE-ENTRY-BOXES-JS*", $str_alt2$_SCRIPT______function_getNextInpu);
        deflexical("*CB-UIAT-GENERATED-INPUT-STEM-ID*", $$$StemId);
        deflexical("*CB-UIAT-GENERATE-COUNTER-INPUT-JS*", $str_alt30$_SCRIPT_LANGUAGE__JavaScript_____);
        deflexical("*CB-UIAT-COUNTER-INPUT-CLICKED-METHOD*", $$$clickedCounterInput);
        defparameter("*CB-UIAT-DEFAULT-WEBPAGE-EXPIRATION-HOURS*", ZERO_INTEGER);
        defparameter("*CB-UIAT-DEFAULT-WEBPAGE-EXPIRATION-MINUTES*", THREE_INTEGER);
        defparameter("*CB-UIAT-DEFAULT-WEBPAGE-EXPIRATION-SECONDS*", $int$30);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_macros_file() {
                access_macros.register_macro_helper(CB_UI_SHOULD_BE_FOCUSED, CB_UIAT_DISPLAY_NAKED_BODY);
        return NIL;
    }



    static private final SubLList $list_alt1 = list(makeSymbol("PWHEN"), makeSymbol("*CB-HOVEROVER-ENABLED*"), list(makeSymbol("CB-HOVEROVER-PAGE-INIT")));

    static private final SubLString $str_alt2$_SCRIPT______function_getNextInpu = makeString("<SCRIPT><!--\nfunction getNextInputName( stem_name, counter_name) {\n  var counter = document.getElementById( counter_name);\n  var result = Number(counter.getAttribute( \"value\"));\n  result = result + 1;\n  counter.setAttribute( \"value\", result.toString());\n  return stem_name + result.toString();\n}\n\nfunction createSeparatorHead (parent, separator) {\n  var curr;\n  if (separator == \"br\") {\n    curr = document.createElement( separator);\n    parent.appendChild( curr);\n    return parent;\n  }\n  else if (separator == \"td\") {\n    curr = document.createElement( separator);\n    parent.appendChild( curr);\n    return curr;\n  } \n  else if (separator == \"tr\") {\n    curr = document.createElement( separator);\n    parent.appendChild( curr);\n    return createSeparatorHead( curr, \"td\");\n  }\n  else  \n    return parent;\n}\n\n\nfunction addAnotherInput ( parent_name, stem, counter_name, size, separator) {\n  var parent = document.getElementById( parent_name);\n  var real_parent = createSeparatorHead( parent, separator);\n  var input  = document.createElement( \"input\");\n  input.setAttribute( \"type\", \"text\");\n  input.setAttribute( \"name\", getNextInputName( stem, counter_name));\n  input.setAttribute( \"size\", size.toString());\n  real_parent.appendChild( input);\n}\n\n// -->\n</SCRIPT>");

    static private final SubLList $list_alt3 = list(makeSymbol("HTML-FORMAT"), makeSymbol("*CB-UIAT-GENERATE-ENTRY-BOXES-JS*"));

    static private final SubLString $str_alt4$_counter = makeString("_counter");

    static private final SubLString $str_alt5$_counter_ID = makeString("_counter_ID");

    static private final SubLString $$$StemId = makeString("StemId");

    static private final SubLString $str_alt7$_A_D = makeString("~A~D");

    static private final SubLList $list_alt8 = list(makeSymbol("INPUT-ID-STEM"), makeSymbol("&KEY"), list(makeSymbol("COUNTER-VALUE"), ZERO_INTEGER));

    static private final SubLList $list_alt9 = list(makeKeyword("COUNTER-VALUE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $COUNTER_VALUE = makeKeyword("COUNTER-VALUE");

    static private final SubLSymbol $sym12$COUNTER_NAME = makeUninternedSymbol("COUNTER-NAME");

    static private final SubLSymbol $sym13$COUNTER_ID = makeUninternedSymbol("COUNTER-ID");



    private static final SubLSymbol CB_UIAT_GENERATE_COUNTERS_NAME = makeSymbol("CB-UIAT-GENERATE-COUNTERS-NAME");

    private static final SubLSymbol CB_UIAT_GENERATE_COUNTERS_ID = makeSymbol("CB-UIAT-GENERATE-COUNTERS-ID");

    private static final SubLSymbol HTML_HIDDEN_INPUT = makeSymbol("HTML-HIDDEN-INPUT");

    static private final SubLString $$$br = makeString("br");

    static private final SubLString $str_alt19$addAnotherInput__ = makeString("addAnotherInput('");

    static private final SubLString $str_alt20$___ = makeString("','");

    static private final SubLString $str_alt21$___ = makeString("');");

    static private final SubLList $list_alt22 = list(list(makeSymbol("PARENT-ID"), makeSymbol("INPUT-ID-STEM"), makeSymbol("LABEL"), makeSymbol("SIZE")));

    static private final SubLSymbol $sym23$EVENT_SCRIPT = makeUninternedSymbol("EVENT-SCRIPT");

    private static final SubLSymbol CB_UIAT_COMPUTE_GENERATING_EVENT_JS = makeSymbol("CB-UIAT-COMPUTE-GENERATING-EVENT-JS");

    private static final SubLSymbol HTML_FANCY_INPUT = makeSymbol("HTML-FANCY-INPUT");

    static private final SubLString $$$button = makeString("button");





    static private final SubLString $str_alt29$ = makeString("");

    static private final SubLString $str_alt30$_SCRIPT_LANGUAGE__JavaScript_____ = makeString("<SCRIPT LANGUAGE=\"JavaScript\"><!--\n\nfunction updateCounterInput( counter, delta) {\n  var result = Number(counter.getAttribute( \"value\"));\n  result = result + delta;\n  var new_value = \" \" +  result.toString() + \" \"; \n  counter.setAttribute( \"value\",new_value);\n}\n\nfunction clickedCounterInput( e ) {\n  var input = e.currentTarget\n  var delta;\n  if (e.altKey)\n     delta = -1;\n  else\n     delta = 1;\n  updateCounterInput( input, delta);\n}\n\nfunction updateCounterInputViaId( id, delta) {\n  var counter = document.getElementById(id);\n  updateCounterInput( counter, delta);\n}\n\n// -->\n</SCRIPT>");

    static private final SubLString $$$clickedCounterInput = makeString("clickedCounterInput");

    private static final SubLSymbol WITH_JAVASCRIPT_EVENT_REMAPPING = makeSymbol("WITH-JAVASCRIPT-EVENT-REMAPPING");

    static private final SubLList $list_alt33 = list(makeSymbol("HTML-FORMAT"), makeSymbol("*CB-UIAT-GENERATE-COUNTER-INPUT-JS*"));

    static private final SubLString $str_alt34$updateCounterInputViaId__ = makeString("updateCounterInputViaId('");

    static private final SubLString $str_alt35$__ = makeString("',");

    static private final SubLString $str_alt36$__ = makeString(");");

    static private final SubLList $list_alt37 = list(makeSymbol("ID"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIAL-VALUE"), ONE_INTEGER));

    static private final SubLSymbol $sym38$VALUE_STRING = makeUninternedSymbol("VALUE-STRING");

    static private final SubLSymbol $sym39$INC_SCRIPT = makeUninternedSymbol("INC-SCRIPT");

    static private final SubLSymbol $sym40$DEC_SCRIPT = makeUninternedSymbol("DEC-SCRIPT");



    static private final SubLString $str_alt42$_ = makeString(" ");



    static private final SubLList $list_alt44 = list(makeString(" "));

    private static final SubLSymbol CB_UIAT_GENERATE_MODIFICATION_SCRIPT = makeSymbol("CB-UIAT-GENERATE-MODIFICATION-SCRIPT");

    static private final SubLList $list_alt46 = list(ONE_INTEGER);

    static private final SubLList $list_alt47 = list(list(makeSymbol("-"), ONE_INTEGER));

    private static final SubLSymbol JAVASCRIPT_NOTE_EVENT_REMAPPING = makeSymbol("JAVASCRIPT-NOTE-EVENT-REMAPPING");

    static private final SubLList $list_alt49 = list(makeKeyword("ONCLICK"), makeSymbol("*CB-UIAT-COUNTER-INPUT-CLICKED-METHOD*"));





    public static final SubLSymbol $dhtml_blank_href_js$ = makeSymbol("*DHTML-BLANK-HREF-JS*");

    static private final SubLList $list_alt53 = list(list(makeSymbol("HTML-BOLD"), list(makeSymbol("HTML-PRINC"), makeString("-"))));

    static private final SubLList $list_alt54 = list(makeSymbol("HTML-INDENT"));

    static private final SubLString $$$text = makeString("text");









    static private final SubLList $list_alt60 = list(list(makeSymbol("HTML-BOLD"), list(makeSymbol("HTML-PRINC"), makeString("+"))));



    static private final SubLList $list_alt62 = list(makeKeyword("SHOW-COPYRIGHT"), NIL);

    static private final SubLList $list_alt63 = list(makeSymbol("PWHEN"), list(makeSymbol("CB-UIA-USE-MENU-BASED-LAUNCHERS-P")), list(makeSymbol("CB-UIA-DRAW-LAUNCHERS-AS-MENU"), list(makeSymbol("CB-CURRENT-UIA"))));

    private static final SubLSymbol CB_UIAT_WITH_HOVEROVER_SUPPORT = makeSymbol("CB-UIAT-WITH-HOVEROVER-SUPPORT");

    static private final SubLList $list_alt65 = list(makeSymbol("OPERATOR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CB_UIA_SHOW_TITLE_LINE = makeSymbol("CB-UIA-SHOW-TITLE-LINE");

    static private final SubLList $list_alt67 = list(list(makeSymbol("INTERACTION")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol CB_UI_SHOULD_BE_FOCUSED = makeSymbol("CB-UI-SHOULD-BE-FOCUSED");

    static private final SubLList $list_alt70 = list(list(makeSymbol("HTML-JS-FOCUS-WINDOW")));

    private static final SubLSymbol UI_OPERATOR = makeSymbol("UI-OPERATOR");

    private static final SubLSymbol CB_UIAT_DISPLAY_NAKED_BODY = makeSymbol("CB-UIAT-DISPLAY-NAKED-BODY");



    private static final SubLSymbol CB_UIA_SHOW_INTERACTION_PREAMBLE = makeSymbol("CB-UIA-SHOW-INTERACTION-PREAMBLE");

    public static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLSymbol CB_UIAT_WEBPAGE_EXPIRATION = makeSymbol("CB-UIAT-WEBPAGE-EXPIRATION");

    static private final SubLList $list_alt77 = list(makeSymbol("CB-UIAT-DOCUMENT-EXPIRATION"));

    static private final SubLList $list_alt78 = list(list(makeSymbol("INTERACTION"), makeSymbol("&KEY"), makeSymbol("SHOW-DOCUMENT-TITLE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt79 = list(makeKeyword("SHOW-DOCUMENT-TITLE?"));

    public static final SubLSymbol $kw80$SHOW_DOCUMENT_TITLE_ = makeKeyword("SHOW-DOCUMENT-TITLE?");

    static private final SubLSymbol $sym81$AGENDA = makeUninternedSymbol("AGENDA");





    private static final SubLSymbol HTML_HEAD = makeSymbol("HTML-HEAD");

    private static final SubLSymbol HTML_TITLE = makeSymbol("HTML-TITLE");

    private static final SubLSymbol CB_UIA_SHOW_ACTION_HINT = makeSymbol("CB-UIA-SHOW-ACTION-HINT");

    static private final SubLList $list_alt87 = list(makeSymbol("CB-UIAT-SHOW-LOAD-PACIFIER"), NIL);

    static private final SubLList $list_alt88 = list(makeSymbol("DHTML-WITH-DOM-SCRIPT"));

    static private final SubLList $list_alt89 = list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT"));

    private static final SubLSymbol CB_UIAT_BODY = makeSymbol("CB-UIAT-BODY");

    static private final SubLList $list_alt91 = list(list(makeSymbol("CB-UIAT-HIDE-LOAD-PACIFIER"), NIL));

    static private final SubLList $list_alt92 = list(list(makeSymbol("INTERACTION"), makeSymbol("&OPTIONAL"), makeSymbol("HIDING-SUPPORT?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CB_UIAT_DISPLAY_BODY = makeSymbol("CB-UIAT-DISPLAY-BODY");

    static private final SubLList $list_alt94 = list(list(makeSymbol("OPERATOR"), makeSymbol("&KEY"), makeSymbol("HANDLER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt95 = list(makeKeyword("HANDLER"));





    private static final SubLSymbol CB_BASIC_FORM_HANDLER = makeSymbol("CB-BASIC-FORM-HANDLER");

    private static final SubLSymbol HTML_BIG = makeSymbol("HTML-BIG");



    static private final SubLList $list_alt101 = list(list(makeSymbol("HTML-NEWLINE")));

    static private final SubLString $str_alt102$_ = makeString("&");

    static private final SubLList $list_alt103 = list(makeSymbol("HEADER-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLSymbol $sym104$ARGLIST = makeUninternedSymbol("ARGLIST");



    private static final SubLSymbol MACRO_HELPER_CB_UIA_HTML_PRINT_ENCODED_ARGS = makeSymbol("MACRO-HELPER-CB-UIA-HTML-PRINT-ENCODED-ARGS");

    static private final SubLList $list_alt107 = list(makeSymbol("PATTERN"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol CB_UIA_HTML_DECODE_ARGS = makeSymbol("CB-UIA-HTML-DECODE-ARGS");

    static private final SubLList $list_alt110 = list(makeSymbol("CB-CURRENT-UIA"));

    static private final SubLList $list_alt111 = list(list(makeSymbol("&KEY"), makeSymbol("SELECTED"), makeSymbol("VALUE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt112 = list(makeKeyword("SELECTED"), makeKeyword("VALUE"));



    private static final SubLSymbol HTML_FANCY_OPTION = makeSymbol("HTML-FANCY-OPTION");

    static private final SubLList $list_alt115 = list(makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"), makeSymbol("ARG5"));

    private static final SubLSymbol CB_LINK = makeSymbol("CB-LINK");

    static private final SubLList $list_alt117 = list(makeSymbol("TERM"));

    private static final SubLSymbol CB_UIA_PREFERRED_LINK = makeSymbol("CB-UIA-PREFERRED-LINK");

    private static final SubLSymbol $UIA_CONCEPT_FINDER_THROW = makeKeyword("UIA-CONCEPT-FINDER-THROW");

    static private final SubLList $list_alt120 = list(makeSymbol("SENTENCE"));

    private static final SubLSymbol $UIA_SENTENCE_FINDER_THROW = makeKeyword("UIA-SENTENCE-FINDER-THROW");

    static private final SubLSymbol $sym122$AGENDA = makeUninternedSymbol("AGENDA");

    static private final SubLSymbol $sym123$META_AGENDA = makeUninternedSymbol("META-AGENDA");

    private static final SubLSymbol UIA_META_AGENDA = makeSymbol("UIA-META-AGENDA");

    public static final SubLSymbol $cb_current_uima$ = makeSymbol("*CB-CURRENT-UIMA*");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_macros_file();
    }

    public void initializeVariables() {
        init_cb_uia_macros_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_macros_file();
    }
}

