/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-DISJOINTNESS
 *  source file: /cyc/top/cycl/cb-disjointness.lisp
 *  created:     2019/07/03 17:38:06
 */
public final class cb_disjointness extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_disjointness() {
    }

    public static final SubLFile me = new cb_disjointness();

    public static final String myName = "com.cyc.cycjava.cycl.cb_disjointness";

    // // Definitions
    public static final SubLObject orthogonalP(SubLObject collection1, SubLObject collection2, SubLObject mt) {
        return list_utilities.sublisp_boolean(ask_utilities.query_justified(el_utilities.make_el_formula($$orthogonalInMt, list(mt, collection1, collection2), UNPROVIDED), mt, $list_alt1));
    }

    public static final SubLObject cb_disjointness_tool(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_1 = NIL;
            SubLObject id_2 = NIL;
            SubLObject monad_id = NIL;
            SubLObject exclude_nartsP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            id_1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            id_2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            monad_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            exclude_nartsP = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject candidate_1 = cb_utilities.cb_guess_fort(id_1, UNPROVIDED);
                    SubLObject candidate_2 = cb_utilities.cb_guess_fort(id_2, UNPROVIDED);
                    SubLObject monad_mt = cb_utilities.cb_guess_fort(monad_id, UNPROVIDED);
                    if (exclude_nartsP.equalp($$$t)) {
                        exclude_nartsP = T;
                    } else {
                        exclude_nartsP = NIL;
                    }
                    return cb_disjointness_tool_guts(candidate_1, candidate_2, monad_mt, exclude_nartsP);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt2);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_disjointness_tool(SubLObject candidate1, SubLObject candidate2, SubLObject monad_mt, SubLObject exclude_nartsP, SubLObject linktext) {
        if (monad_mt == UNPROVIDED) {
            monad_mt = NIL;
        }
        if (exclude_nartsP == UNPROVIDED) {
            exclude_nartsP = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == monad_mt) {
                monad_mt = $$UniversalVocabularyMt;
            }
            if (NIL == linktext) {
                linktext = format(NIL, $str_alt6$_a_VS__a, candidate1, candidate2);
            }
            {
                SubLObject id_1 = cb_utilities.cb_fort_identifier(candidate1);
                SubLObject id_2 = cb_utilities.cb_fort_identifier(candidate2);
                SubLObject monad_id = cb_utilities.cb_fort_identifier(monad_mt);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt8$cb_disjointness_tool__a__a__a__a, new SubLObject[]{ id_1, id_2, monad_id, exclude_nartsP });
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                return NIL;
            }
        }
    }

    public static final SubLObject cb_disjointness_tool_guts(SubLObject candidate1, SubLObject candidate2, SubLObject mt, SubLObject exclude_nartsP) {
        if (exclude_nartsP == UNPROVIDED) {
            exclude_nartsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                            SubLObject datum = compute_candidate_disjointness_info(candidate1, candidate2, mt);
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_1 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt11);
                                current_1 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt11);
                                if (NIL == member(current_1, $list_alt12, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_1 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt11);
                            }
                            {
                                SubLObject genls_1_tail = property_list_member($GENLS_1, current);
                                SubLObject genls_1 = (NIL != genls_1_tail) ? ((SubLObject) (cadr(genls_1_tail))) : NIL;
                                SubLObject genls_2_tail = property_list_member($GENLS_2, current);
                                SubLObject genls_2 = (NIL != genls_2_tail) ? ((SubLObject) (cadr(genls_2_tail))) : NIL;
                                SubLObject additional_genls_1_tail = property_list_member($ADDITIONAL_GENLS_1, current);
                                SubLObject additional_genls_1 = (NIL != additional_genls_1_tail) ? ((SubLObject) (cadr(additional_genls_1_tail))) : NIL;
                                SubLObject additional_genls_2_tail = property_list_member($ADDITIONAL_GENLS_2, current);
                                SubLObject additional_genls_2 = (NIL != additional_genls_2_tail) ? ((SubLObject) (cadr(additional_genls_2_tail))) : NIL;
                                SubLObject nearest_common_genls_tail = property_list_member($NEAREST_COMMON_GENLS, current);
                                SubLObject nearest_common_genls = (NIL != nearest_common_genls_tail) ? ((SubLObject) (cadr(nearest_common_genls_tail))) : NIL;
                                SubLObject nearest_common_additional_genls_tail = property_list_member($NEAREST_COMMON_ADDITIONAL_GENLS, current);
                                SubLObject nearest_common_additional_genls = (NIL != nearest_common_additional_genls_tail) ? ((SubLObject) (cadr(nearest_common_additional_genls_tail))) : NIL;
                                SubLObject disjoins_1_tail = property_list_member($DISJOINS_1, current);
                                SubLObject disjoins_1 = (NIL != disjoins_1_tail) ? ((SubLObject) (cadr(disjoins_1_tail))) : NIL;
                                SubLObject disjoins_2_tail = property_list_member($DISJOINS_2, current);
                                SubLObject disjoins_2 = (NIL != disjoins_2_tail) ? ((SubLObject) (cadr(disjoins_2_tail))) : NIL;
                                SubLObject provability_tail = property_list_member($PROVABILITY, current);
                                SubLObject provability = (NIL != provability_tail) ? ((SubLObject) (cadr(provability_tail))) : NIL;
                                SubLObject title = format(NIL, $str_alt6$_a_VS__a, candidate1, candidate2);
                                SubLObject candidate_sentence = list($$disjointWith, candidate1, candidate2);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                html_macros.html_head_content_type();
                                cb_parameters.cb_head_shortcut_icon();
                                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != frame_name_var) {
                                                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(frame_name_var);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_5 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_6 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_hidden_input($str_alt24$cb_handle_disjointness_tool, T, UNPROVIDED);
                                                            html_utilities.html_hidden_input($$$candidate1, cb_utilities.cb_fort_identifier(candidate1), UNPROVIDED);
                                                            html_utilities.html_hidden_input($$$candidate2, cb_utilities.cb_fort_identifier(candidate2), UNPROVIDED);
                                                            html_utilities.html_hidden_input($$$mt, cb_utilities.cb_fort_identifier(mt), UNPROVIDED);
                                                            html_utilities.html_hidden_input($str_alt28$exclude_narts_, exclude_nartsP, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(FOUR_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                    if (true) {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    }
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            cb_utilities.cb_link($DISJOINTNESS_TOOL, candidate1, candidate2, mt, exclude_nartsP, $str_alt31$_Refresh_);
                                                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                                                            html_utilities.html_submit_input($$$Update, $$$update, UNPROVIDED);
                                                                                                            {
                                                                                                                SubLObject power = cardinality_estimates.disjointness_power(candidate1, candidate2);
                                                                                                                SubLObject stars = (power.isPositive()) ? ((SubLObject) (ceiling(log(power, TEN_INTEGER), UNPROVIDED))) : ZERO_INTEGER;
                                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt34$Power____a, power);
                                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                                                                                {
                                                                                                                    SubLObject i = NIL;
                                                                                                                    for (i = ZERO_INTEGER; i.numL(stars); i = add(i, ONE_INTEGER)) {
                                                                                                                        html_utilities.html_princ($str_alt35$_);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                                                                            }
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            cb_utilities.cb_link($GENERATE_DISJOINTNESS_CANDIDATES, mt, exclude_nartsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            cb_utilities.cb_link($DISJOINTNESS_PRELIMINARY_SCREEN, mt, exclude_nartsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                    if (true) {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    }
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                                            cb_utilities.cb_form(candidate_sentence, ZERO_INTEGER, T);
                                                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            html_utilities.html_princ($str_alt39$is_);
                                                                                                            {
                                                                                                                SubLObject pcase_var = provability;
                                                                                                                if (pcase_var.eql($TRUE)) {
                                                                                                                    html_utilities.html_princ($str_alt41$provably_);
                                                                                                                    cb_utilities.cb_form($$True, UNPROVIDED, UNPROVIDED);
                                                                                                                } else
                                                                                                                    if (pcase_var.eql($FALSE)) {
                                                                                                                        html_utilities.html_princ($str_alt41$provably_);
                                                                                                                        cb_utilities.cb_form($$False, UNPROVIDED, UNPROVIDED);
                                                                                                                    } else
                                                                                                                        if (pcase_var.eql($NEITHER)) {
                                                                                                                            html_utilities.html_princ($str_alt46$unknown_);
                                                                                                                        }


                                                                                                            }
                                                                                                            html_utilities.html_princ($str_alt47$_in_);
                                                                                                            cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                                                                            html_utilities.html_princ($str_alt48$_);
                                                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                                                            html_utilities.html_princ($str_alt49$It_could_be_proven_in_);
                                                                                                            cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                                                                            html_utilities.html_princ($str_alt50$_by_asserting);
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            cb_utilities.cb_form($list_alt51, UNPROVIDED, UNPROVIDED);
                                                                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                                                                            html_utilities.html_princ($$$or);
                                                                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                                                                            cb_utilities.cb_form($list_alt53, UNPROVIDED, UNPROVIDED);
                                                                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                                                                            html_utilities.html_princ($$$or);
                                                                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                                                                            cb_utilities.cb_form($list_alt54, UNPROVIDED, UNPROVIDED);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                    if (true) {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    }
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_utilities.html_submit_input($$$Assert, $$$assert, UNPROVIDED);
                                                                                                            html_utilities.html_indent(TWO_INTEGER);
                                                                                                            html_utilities.html_submit_input($$$Assert_orthogonality, $$$orthogonality, UNPROVIDED);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            {
                                                                                SubLObject cdolist_list_var = $list_alt59;
                                                                                SubLObject label = NIL;
                                                                                for (label = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , label = cdolist_list_var.first()) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ONE_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ(label);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($str_alt60$25_);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    {
                                                                                        SubLObject cdolist_list_var = disjoins_2;
                                                                                        SubLObject disjoin_2 = NIL;
                                                                                        for (disjoin_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjoin_2 = cdolist_list_var.first()) {
                                                                                            cb_show_disjointness_tool_item(disjoin_2, ONE_INTEGER, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($str_alt60$25_);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    {
                                                                                        SubLObject cdolist_list_var = genls_1;
                                                                                        SubLObject genl_1 = NIL;
                                                                                        for (genl_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_1 = cdolist_list_var.first()) {
                                                                                            cb_show_disjointness_tool_item(genl_1, TWO_INTEGER, eq(genl_1, candidate1), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject cdolist_list_var = nearest_common_genls;
                                                                                        SubLObject common_genl = NIL;
                                                                                        for (common_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , common_genl = cdolist_list_var.first()) {
                                                                                            cb_show_disjointness_tool_item(common_genl, TWO_INTEGER, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                    if (NIL != additional_genls_1) {
                                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                                        html_utilities.html_princ($str_alt61$additional_);
                                                                                        cb_utilities.cb_form($$genls, UNPROVIDED, UNPROVIDED);
                                                                                        html_utilities.html_princ($str_alt47$_in_);
                                                                                        cb_utilities.cb_form($$EverythingPSC, UNPROVIDED, UNPROVIDED);
                                                                                        html_utilities.html_princ($str_alt64$_);
                                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                                        {
                                                                                            SubLObject cdolist_list_var = additional_genls_1;
                                                                                            SubLObject additional_genl = NIL;
                                                                                            for (additional_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , additional_genl = cdolist_list_var.first()) {
                                                                                                cb_show_disjointness_tool_item(additional_genl, TWO_INTEGER, NIL, NIL, T, candidate1);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($str_alt60$25_);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    {
                                                                                        SubLObject cdolist_list_var = genls_2;
                                                                                        SubLObject genl_2 = NIL;
                                                                                        for (genl_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_2 = cdolist_list_var.first()) {
                                                                                            cb_show_disjointness_tool_item(genl_2, THREE_INTEGER, eq(genl_2, candidate2), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject cdolist_list_var = nearest_common_genls;
                                                                                        SubLObject common_genl = NIL;
                                                                                        for (common_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , common_genl = cdolist_list_var.first()) {
                                                                                            cb_show_disjointness_tool_item(common_genl, THREE_INTEGER, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                    if (NIL != additional_genls_2) {
                                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                                        html_utilities.html_princ($str_alt61$additional_);
                                                                                        cb_utilities.cb_form($$genls, UNPROVIDED, UNPROVIDED);
                                                                                        html_utilities.html_princ($str_alt47$_in_);
                                                                                        cb_utilities.cb_form($$EverythingPSC, UNPROVIDED, UNPROVIDED);
                                                                                        html_utilities.html_princ($str_alt64$_);
                                                                                        html_utilities.html_newline(TWO_INTEGER);
                                                                                        {
                                                                                            SubLObject cdolist_list_var = additional_genls_2;
                                                                                            SubLObject additional_genl = NIL;
                                                                                            for (additional_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , additional_genl = cdolist_list_var.first()) {
                                                                                                cb_show_disjointness_tool_item(additional_genl, THREE_INTEGER, NIL, NIL, T, candidate2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($str_alt60$25_);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    {
                                                                                        SubLObject cdolist_list_var = disjoins_1;
                                                                                        SubLObject disjoin_1 = NIL;
                                                                                        for (disjoin_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjoin_1 = cdolist_list_var.first()) {
                                                                                            cb_show_disjointness_tool_item(disjoin_1, FOUR_INTEGER, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2_6, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1_5, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_copyright_notice();
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $cb_disjointness_default_assert_mt$ = makeSymbol("*CB-DISJOINTNESS-DEFAULT-ASSERT-MT*");

    public static final SubLObject cb_handle_disjointness_tool(SubLObject args) {
        {
            SubLObject datum = string_utilities.break_words(html_utilities.html_extract_input($str_alt65$coll_1, args), UNPROVIDED, UNPROVIDED);
            SubLObject current = datum;
            SubLObject id_1 = NIL;
            SubLObject column_of_coll_1 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt66);
            id_1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt66);
            column_of_coll_1 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_22 = string_utilities.break_words(html_utilities.html_extract_input($str_alt67$coll_2, args), UNPROVIDED, UNPROVIDED);
                    SubLObject current_23 = datum_22;
                    SubLObject id_2 = NIL;
                    SubLObject column_of_coll_2 = NIL;
                    destructuring_bind_must_consp(current_23, datum_22, $list_alt68);
                    id_2 = current_23.first();
                    current_23 = current_23.rest();
                    destructuring_bind_must_consp(current_23, datum_22, $list_alt68);
                    column_of_coll_2 = current_23.first();
                    current_23 = current_23.rest();
                    if (NIL == current_23) {
                        {
                            SubLObject mt_id = html_utilities.html_extract_input($$$mt, args);
                            SubLObject exclude_nartsP = html_utilities.html_extract_input($str_alt28$exclude_narts_, args);
                            SubLObject collection_1 = cb_utilities.cb_guess_fort(id_1, UNPROVIDED);
                            SubLObject collection_2 = cb_utilities.cb_guess_fort(id_2, UNPROVIDED);
                            SubLObject mt = cb_utilities.cb_guess_fort(mt_id, UNPROVIDED);
                            if (exclude_nartsP.equalp($$$t)) {
                                exclude_nartsP = T;
                            } else {
                                exclude_nartsP = NIL;
                            }
                            if (NIL != html_utilities.html_extract_input($$$assert, args)) {
                                {
                                    SubLObject formula = disjointness_tool_generate_formula_to_assert(collection_1, string_utilities.string_to_integer(column_of_coll_1), collection_2, string_utilities.string_to_integer(column_of_coll_2));
                                    SubLObject assert_mt = (NIL != kb_accessors.not_assertible_mtP(mt)) ? ((SubLObject) ($cb_disjointness_default_assert_mt$.getGlobalValue())) : mt;
                                    if (formula.isKeyword()) {
                                        return cb_disjointness_tool_error($str_alt69$You_must_choose_from_columns_A_an);
                                    } else {
                                        {
                                            SubLObject why_falseP = disjointness_tool_why_falseP(formula, assert_mt);
                                            if (NIL != why_falseP) {
                                                return cb_disjointness_tool_reject_false_formula(formula, assert_mt, why_falseP);
                                            } else {
                                                {
                                                    SubLObject sentence = list($$ist, assert_mt, narts_high.nart_expand(formula));
                                                    return cb_assertion_editor.cb_assert_internal($DEFAULT, NIL, sentence, T);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != html_utilities.html_extract_input($$$orthogonality, args)) {
                                {
                                    SubLObject candidate_id_1 = html_utilities.html_extract_input($$$candidate1, args);
                                    SubLObject candidate_id_2 = html_utilities.html_extract_input($$$candidate2, args);
                                    SubLObject candidate1 = cb_utilities.cb_guess_fort(candidate_id_1, UNPROVIDED);
                                    SubLObject candidate2 = cb_utilities.cb_guess_fort(candidate_id_2, UNPROVIDED);
                                    return cb_assert_orthogonality(candidate1, candidate2, mt, exclude_nartsP);
                                }
                            }
                            if (NIL != html_utilities.html_extract_input($$$update, args)) {
                                return cb_disjointness_tool_guts(collection_1, collection_2, mt, exclude_nartsP);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum_22, $list_alt68);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt66);
            }
        }
        return NIL;
    }

    public static final SubLObject compute_candidate_disjointness_info(SubLObject candidate1, SubLObject candidate2, SubLObject mt) {
        {
            SubLObject genls_1 = genls.all_genls(candidate1, mt, UNPROVIDED);
            SubLObject genls_2 = genls.all_genls(candidate2, mt, UNPROVIDED);
            SubLObject disjoins_1 = fast_max_disjoint_with(candidate1, mt);
            SubLObject disjoins_2 = fast_max_disjoint_with(candidate2, mt);
            SubLObject additional_genls_1 = nset_difference(genls.all_genls_in_any_mt(candidate1), genls_1, symbol_function(EQ), UNPROVIDED);
            SubLObject additional_genls_2 = nset_difference(genls.all_genls_in_any_mt(candidate2), genls_2, symbol_function(EQ), UNPROVIDED);
            SubLObject common_genls = intersection(genls_1, genls_2, symbol_function(EQ), UNPROVIDED);
            SubLObject common_additional_genls = intersection(additional_genls_1, additional_genls_2, symbol_function(EQ), UNPROVIDED);
            SubLObject nearest_common_genls = genls.min_cols(common_genls, mt, UNPROVIDED);
            SubLObject nearest_common_additional_genls = genls.min_cols(common_additional_genls, mt, UNPROVIDED);
            SubLObject common_disjoins = intersection(disjoins_1, disjoins_2, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_genls_1 = set_difference(genls_1, common_genls, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_genls_2 = set_difference(genls_2, common_genls, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_additional_genls_1 = set_difference(additional_genls_1, common_additional_genls, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_additional_genls_2 = set_difference(additional_genls_2, common_additional_genls, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_disjoins_1 = set_difference(disjoins_1, common_disjoins, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_disjoins_2 = set_difference(disjoins_2, common_disjoins, symbol_function(EQ), UNPROVIDED);
            unique_genls_1 = Sort.sort(unique_genls_1, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            unique_genls_2 = Sort.sort(unique_genls_2, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            nearest_common_genls = Sort.sort(nearest_common_genls, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            unique_additional_genls_1 = Sort.sort(unique_additional_genls_1, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            unique_additional_genls_2 = Sort.sort(unique_additional_genls_2, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            nearest_common_additional_genls = Sort.sort(nearest_common_additional_genls, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            unique_disjoins_1 = Sort.sort(unique_disjoins_1, symbol_function($sym74$GENERALITY_ESTIMATE_), UNPROVIDED);
            unique_disjoins_2 = Sort.sort(unique_disjoins_2, symbol_function($sym74$GENERALITY_ESTIMATE_), UNPROVIDED);
            {
                SubLObject provability = NIL;
                if (NIL != disjoint_with.disjoint_withP(candidate1, candidate2, mt, UNPROVIDED)) {
                    provability = $TRUE;
                } else {
                    if (NIL != disjoint_with.not_disjoint_withP(candidate1, candidate2, mt, UNPROVIDED)) {
                        provability = $FALSE;
                    } else {
                        provability = $NEITHER;
                    }
                }
                return list(new SubLObject[]{ $GENLS_1, unique_genls_1, $GENLS_2, unique_genls_2, $NEAREST_COMMON_GENLS, nearest_common_genls, $ADDITIONAL_GENLS_1, unique_additional_genls_1, $ADDITIONAL_GENLS_2, unique_additional_genls_2, $NEAREST_COMMON_ADDITIONAL_GENLS, nearest_common_additional_genls, $DISJOINS_1, unique_disjoins_1, $DISJOINS_2, unique_disjoins_2, $PROVABILITY, provability });
            }
        }
    }

    public static final SubLObject fast_max_disjoint_with(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject all_disjoins = NIL;
            SubLObject cdolist_list_var = genls.all_genls(collection, mt, UNPROVIDED);
            SubLObject genl = NIL;
            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_24 = kb_mapping_utilities.pred_values_in_relevant_mts(genl, $$disjointWith, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
                    SubLObject disjoin = NIL;
                    for (disjoin = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , disjoin = cdolist_list_var_24.first()) {
                        {
                            SubLObject item_var = disjoin;
                            if (NIL == member(item_var, all_disjoins, symbol_function(EQ), symbol_function(IDENTITY))) {
                                all_disjoins = cons(item_var, all_disjoins);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var_25 = kb_mapping_utilities.pred_values_in_relevant_mts(genl, $$disjointWith, mt, TWO_INTEGER, ONE_INTEGER, $TRUE);
                    SubLObject disjoin = NIL;
                    for (disjoin = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , disjoin = cdolist_list_var_25.first()) {
                        {
                            SubLObject item_var = disjoin;
                            if (NIL == member(item_var, all_disjoins, symbol_function(EQ), symbol_function(IDENTITY))) {
                                all_disjoins = cons(item_var, all_disjoins);
                            }
                        }
                    }
                }
            }
            all_disjoins = genls.max_cols(all_disjoins, mt, UNPROVIDED);
            all_disjoins = Sort.sort(all_disjoins, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            return all_disjoins;
        }
    }

    public static final SubLObject disjointness_tool_generate_formula_to_assert(SubLObject collection_1, SubLObject column_of_coll_1, SubLObject collection_2, SubLObject column_of_coll_2) {
        {
            SubLObject pcase_var = column_of_coll_1;
            if (pcase_var.eql(TWO_INTEGER)) {
                {
                    SubLObject pcase_var_26 = column_of_coll_2;
                    if (pcase_var_26.eql(ONE_INTEGER)) {
                        return el_utilities.make_el_formula($$genls, list(collection_1, collection_2), UNPROVIDED);
                    } else
                        if (pcase_var_26.eql(THREE_INTEGER)) {
                            return el_utilities.make_el_formula($$disjointWith, list(collection_1, collection_2), UNPROVIDED);
                        }

                }
            } else
                if (pcase_var.eql(FOUR_INTEGER)) {
                    {
                        SubLObject pcase_var_27 = column_of_coll_2;
                        if (pcase_var_27.eql(ONE_INTEGER)) {
                            return $INCOMPATIBLE_COLUMNS;
                        } else
                            if (pcase_var_27.eql(THREE_INTEGER)) {
                                return el_utilities.make_el_formula($$genls, list(collection_2, collection_1), UNPROVIDED);
                            }

                    }
                }

        }
        return $ERROR;
    }

    public static final SubLObject disjointness_tool_why_falseP(SubLObject formula, SubLObject mt) {
        if (el_utilities.literal_predicate(formula, UNPROVIDED) == $$disjointWith) {
            {
                SubLObject datum = el_utilities.literal_args(formula, UNPROVIDED);
                SubLObject current = datum;
                SubLObject coll_1 = NIL;
                SubLObject coll_2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt77);
                coll_1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                coll_2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    return disjoint_with.why_not_disjoint_withP(coll_1, coll_2, mt, UNPROVIDED, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, $list_alt77);
                }
            }
        } else {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject cb_disjointness_preliminary_screen(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject mt_id = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt78);
                current = current.rest();
                {
                    SubLObject exclude_nartsP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt78);
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject mt = cb_utilities.cb_guess_fort(mt_id, UNPROVIDED);
                            if (NIL == mt) {
                                mt = $$UniversalVocabularyMt;
                            }
                            if (exclude_nartsP.equalp($$$t)) {
                                exclude_nartsP = T;
                            } else {
                                exclude_nartsP = NIL;
                            }
                            {
                                SubLObject mt_string = constants_high.constant_name(mt);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != frame_name_var) {
                                                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(frame_name_var);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_hidden_input($str_alt79$cb_handle_disjointness_preliminar, T, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                            html_utilities.html_princ_strong($$$Disjointness_Tool);
                                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt81$Mt___);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_text_input($$$mt, mt_string, $int$35);
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                            html_utilities.html_submit_input($$$Generate_random_pairs, $$$generate, UNPROVIDED);
                                                            html_utilities.html_indent(TWO_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt85$Exclude_NARTs_);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                            html_utilities.html_indent(UNPROVIDED);
                                                            html_utilities.html_checkbox_input($str_alt28$exclude_narts_, NIL, exclude_nartsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt86$OR___);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_utilities.html_newline(TWO_INTEGER);
                                                            html_utilities.html_princ($str_alt87$Consider_the_following_pair_of_co);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_text_input($str_alt65$coll_1, $str_alt88$, $int$35);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_text_input($str_alt67$coll_2, $str_alt88$, $int$35);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                            html_utilities.html_submit_input($$$Consider, $$$consider, UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_copyright_notice();
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt78);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_disjointness_preliminary_screen(SubLObject mt, SubLObject exclude_nartsP, SubLObject linktext) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (exclude_nartsP == UNPROVIDED) {
            exclude_nartsP = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                mt = $$UniversalVocabularyMt;
            }
            if (NIL == linktext) {
                linktext = $str_alt92$_Start_Again_;
            }
            {
                SubLObject mt_id = cb_utilities.cb_fort_identifier(mt);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt93$cb_disjointness_preliminary_scree, mt_id, exclude_nartsP);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_handle_disjointness_preliminary_screen(SubLObject args) {
        {
            SubLObject mt_as_string = html_utilities.html_extract_input($$$mt, args);
            SubLObject mt = constants_high.find_constant(mt_as_string);
            SubLObject exclude_nartsP = equal(html_utilities.html_extract_input($str_alt28$exclude_narts_, args), $$$on);
            if (NIL != html_utilities.html_extract_input($$$generate, args)) {
                return cb_generate_disjointness_candidates_guts(mt, exclude_nartsP);
            } else {
                {
                    SubLObject coll_1_as_string = html_utilities.html_extract_input($str_alt65$coll_1, args);
                    SubLObject coll_2_as_string = html_utilities.html_extract_input($str_alt67$coll_2, args);
                    SubLObject coll_1 = constants_high.find_constant(coll_1_as_string);
                    SubLObject coll_2 = constants_high.find_constant(coll_2_as_string);
                    return cb_disjointness_tool_guts(coll_1, coll_2, mt, exclude_nartsP);
                }
            }
        }
    }

    public static final SubLObject cb_generate_disjointness_candidates(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject mt_id = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
            destructuring_bind_must_listp(current, datum, $list_alt78);
            current = current.rest();
            {
                SubLObject exclude_nartsP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt78);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mt = cb_utilities.cb_guess_fort(mt_id, UNPROVIDED);
                        if (NIL == mt) {
                            mt = $$UniversalVocabularyMt;
                        }
                        if (exclude_nartsP.equalp($$$t)) {
                            exclude_nartsP = T;
                        } else {
                            exclude_nartsP = NIL;
                        }
                        return cb_generate_disjointness_candidates_guts(mt, exclude_nartsP);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt78);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cb_link_generate_disjointness_candidates(SubLObject mt, SubLObject exclude_nartsP, SubLObject linktext) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (exclude_nartsP == UNPROVIDED) {
            exclude_nartsP = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                mt = $$UniversalVocabularyMt;
            }
            if (NIL == linktext) {
                linktext = $str_alt98$_Random_;
            }
            {
                SubLObject mt_id = cb_utilities.cb_fort_identifier(mt);
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt99$cb_generate_disjointness_candidat, mt_id, exclude_nartsP);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_generate_disjointness_candidates_guts(SubLObject mt, SubLObject exclude_nartsP) {
        if (exclude_nartsP == UNPROVIDED) {
            exclude_nartsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($str_alt101$Random__potentially_orthogonal_co);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject orthogonal_pairs = $UNINITIALIZED;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_utilities.html_princ_strong($$$Disjointness_Tool);
                                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_utilities.html_newline(TWO_INTEGER);
                                cb_utilities.cb_link($GENERATE_DISJOINTNESS_CANDIDATES, mt, exclude_nartsP, $str_alt103$_Regenerate_, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(UNPROVIDED);
                                cb_utilities.cb_link($DISJOINTNESS_PRELIMINARY_SCREEN, mt, exclude_nartsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_indent(UNPROVIDED);
                                orthogonal_pairs = random_orthogonal_collections(mt, TEN_INTEGER, exclude_nartsP);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt104$Found__a_random__potentially_orth, length(orthogonal_pairs));
                                cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                html_utilities.html_newline(TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = orthogonal_pairs;
                                            SubLObject orthogonal_pair = NIL;
                                            for (orthogonal_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , orthogonal_pair = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = orthogonal_pair;
                                                    SubLObject current = datum;
                                                    SubLObject candidate1 = NIL;
                                                    SubLObject candidate2 = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt105);
                                                    candidate1 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt105);
                                                    candidate2 = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_utilities.cb_link($DISJOINTNESS_TOOL, candidate1, candidate2, mt, exclude_nartsP, $str_alt106$_Consider_);
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_utilities.cb_form(candidate1, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt107$_vs_);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        cb_utilities.cb_form(candidate2, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt105);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject random_orthogonal_collections(SubLObject mt, SubLObject n, SubLObject exclude_nartsP) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (exclude_nartsP == UNPROVIDED) {
            exclude_nartsP = NIL;
        }
        {
            SubLObject orthogonal_pairs = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                orthogonal_pairs = cons(random_implicitly_orthogonal_collection_pair(mt, exclude_nartsP), orthogonal_pairs);
            }
            return orthogonal_pairs;
        }
    }

    public static final SubLObject random_implicitly_orthogonal_collection_pair(SubLObject mt, SubLObject exclude_nartsP) {
        while (true) {
            {
                SubLObject datum = random_n_collections(TWO_INTEGER);
                SubLObject current = datum;
                SubLObject candidate1 = NIL;
                SubLObject candidate2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt105);
                candidate1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt105);
                candidate2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (((NIL == exclude_nartsP) || ((NIL == nart_handles.nart_p(candidate1)) && (NIL == nart_handles.nart_p(candidate2)))) && ($UNKNOWN == collections_subsumption_status(candidate1, candidate2, mt))) {
                        return list(candidate1, candidate2);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt105);
                }
            }
        } 
    }

    public static final SubLObject collections_subsumption_status(SubLObject collection1, SubLObject collection2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != genls.genlP(collection1, collection2, mt, UNPROVIDED)) {
            return $GENLS;
        } else
            if (NIL != genls.specP(collection1, collection2, mt, UNPROVIDED)) {
                return $SPECS;
            } else
                if (NIL != disjoint_with.disjoint_withP(collection1, collection2, mt, UNPROVIDED)) {
                    return $DISJOINT;
                } else
                    if (NIL != disjoint_with.not_disjoint_withP(collection1, collection2, mt, UNPROVIDED)) {
                        return $NOT_DISJOINT;
                    } else
                        if (NIL != orthogonalP(collection1, collection2, mt)) {
                            return $ORTHOGONAL;
                        } else {
                            return $UNKNOWN;
                        }




    }

    /**
     * Return a list of N different collections chosen at random.
     */
    public static final SubLObject random_n_collections(SubLObject n) {
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        if (n.isZero()) {
            return NIL;
        }
        {
            SubLObject all_collections_set = cached_all_collections_set();
            SubLObject random_collections = NIL;
            if (set.set_size(all_collections_set).numLE(n)) {
                random_collections = all_collections_set;
            } else {
                random_collections = set.new_set(symbol_function(EQ), UNPROVIDED);
                while (set.set_size(random_collections).numL(n)) {
                    set.set_add(set.set_random_element(all_collections_set), random_collections);
                } 
            }
            return set.set_element_list(random_collections);
        }
    }



    public static final SubLObject cached_all_collections_set() {
        if (NIL == $all_collections_set$.getGlobalValue()) {
            $all_collections_set$.setGlobalValue(set_utilities.construct_set_from_list(isa.all_fort_instances_in_all_mts($$Collection), symbol_function(EQ), UNPROVIDED));
        }
        return $all_collections_set$.getGlobalValue();
    }

    public static final SubLObject cb_assert_orthogonality(SubLObject candidate1, SubLObject candidate2, SubLObject mt, SubLObject exclude_nartsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                            SubLObject datum = compute_candidate_orthogonality_info(candidate1, candidate2, mt);
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_37 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt117);
                                current_37 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt117);
                                if (NIL == member(current_37, $list_alt118, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_37 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt117);
                            }
                            {
                                SubLObject isas_1_tail = property_list_member($ISAS_1, current);
                                SubLObject isas_1 = (NIL != isas_1_tail) ? ((SubLObject) (cadr(isas_1_tail))) : NIL;
                                SubLObject isas_2_tail = property_list_member($ISAS_2, current);
                                SubLObject isas_2 = (NIL != isas_2_tail) ? ((SubLObject) (cadr(isas_2_tail))) : NIL;
                                SubLObject additional_isas_1_tail = property_list_member($ADDITIONAL_ISAS_1, current);
                                SubLObject additional_isas_1 = (NIL != additional_isas_1_tail) ? ((SubLObject) (cadr(additional_isas_1_tail))) : NIL;
                                SubLObject additional_isas_2_tail = property_list_member($ADDITIONAL_ISAS_2, current);
                                SubLObject additional_isas_2 = (NIL != additional_isas_2_tail) ? ((SubLObject) (cadr(additional_isas_2_tail))) : NIL;
                                SubLObject nearest_common_isas_tail = property_list_member($NEAREST_COMMON_ISAS, current);
                                SubLObject nearest_common_isas = (NIL != nearest_common_isas_tail) ? ((SubLObject) (cadr(nearest_common_isas_tail))) : NIL;
                                SubLObject nearest_common_additional_isas_tail = property_list_member($NEAREST_COMMON_ADDITIONAL_ISAS, current);
                                SubLObject nearest_common_additional_isas = (NIL != nearest_common_additional_isas_tail) ? ((SubLObject) (cadr(nearest_common_additional_isas_tail))) : NIL;
                                SubLObject title = format(NIL, $str_alt6$_a_VS__a, candidate1, candidate2);
                                SubLObject candidate_sentence = list($$orthogonalInMt, mt, candidate1, candidate2);
                                SubLObject orthogonality_warning = kb_utilities.find_object_by_hl_external_id_string($str_alt125$33210D820C0D810D831E190FA46264353);
                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                html_macros.html_head_content_type();
                                cb_parameters.cb_head_shortcut_icon();
                                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_utilities.html_princ(title);
                                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_38 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != frame_name_var) {
                                                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(frame_name_var);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_41 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_42 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_hidden_input($str_alt126$cb_handle_assert_orthogonality, T, UNPROVIDED);
                                                            html_utilities.html_hidden_input($$$candidate1, cb_utilities.cb_fort_identifier(candidate1), UNPROVIDED);
                                                            html_utilities.html_hidden_input($$$candidate2, cb_utilities.cb_fort_identifier(candidate2), UNPROVIDED);
                                                            html_utilities.html_hidden_input($$$mt, cb_utilities.cb_fort_identifier(mt), UNPROVIDED);
                                                            html_utilities.html_hidden_input($str_alt28$exclude_narts_, exclude_nartsP, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(ONE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(THREE_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                    if (true) {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    }
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_utilities.html_submit_input($$$Refresh, $$$refresh, UNPROVIDED);
                                                                                                            {
                                                                                                                SubLObject power = $$$STUB;
                                                                                                                SubLObject stars = FOUR_INTEGER;
                                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt130$Power____A, power);
                                                                                                                html_utilities.html_newline(UNPROVIDED);
                                                                                                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                                                                                {
                                                                                                                    SubLObject i = NIL;
                                                                                                                    for (i = ZERO_INTEGER; i.numL(stars); i = add(i, ONE_INTEGER)) {
                                                                                                                        html_utilities.html_princ($str_alt35$_);
                                                                                                                    }
                                                                                                                }
                                                                                                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                                                                            }
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            cb_utilities.cb_link($GENERATE_DISJOINTNESS_CANDIDATES, mt, exclude_nartsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            cb_utilities.cb_link($DISJOINTNESS_PRELIMINARY_SCREEN, mt, exclude_nartsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                                    if (true) {
                                                                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                        html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                    }
                                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                        try {
                                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                                            cb_utilities.cb_form(candidate_sentence, ZERO_INTEGER, T);
                                                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                                                            html_utilities.html_princ($$$could_be_proven_by_asserting);
                                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                                            cb_utilities.cb_form(candidate_sentence, UNPROVIDED, UNPROVIDED);
                                                                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                                                                            html_utilities.html_princ($$$or);
                                                                                                            html_utilities.html_indent(FOUR_INTEGER);
                                                                                                            cb_utilities.cb_form(listS($$orthogonalInMt_TypeType, mt, $list_alt133), UNPROVIDED, UNPROVIDED);
                                                                                                        } finally {
                                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ONE_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup($str_alt134$33_);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            cb_utilities.cb_form(candidate1, UNPROVIDED, UNPROVIDED);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ONE_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup($str_alt134$33_);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            cb_utilities.cb_form(candidate2, UNPROVIDED, UNPROVIDED);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ONE_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup($str_alt134$33_);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_submit_input($$$Assert_orthogonalInMt, $$$orthogonal, UNPROVIDED);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ONE_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup($str_alt134$33_);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            {
                                                                                                SubLObject cdolist_list_var = isas_1;
                                                                                                SubLObject isa_1 = NIL;
                                                                                                for (isa_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_1 = cdolist_list_var.first()) {
                                                                                                    cb_show_disjointness_tool_item(isa_1, ONE_INTEGER, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject cdolist_list_var = nearest_common_isas;
                                                                                                SubLObject common_isa = NIL;
                                                                                                for (common_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , common_isa = cdolist_list_var.first()) {
                                                                                                    cb_show_disjointness_tool_item(common_isa, ONE_INTEGER, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                            if (NIL != additional_isas_1) {
                                                                                                html_utilities.html_newline(TWO_INTEGER);
                                                                                                html_utilities.html_princ($str_alt61$additional_);
                                                                                                cb_utilities.cb_form($$isa, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_princ($str_alt138$s_in_);
                                                                                                cb_utilities.cb_form($$EverythingPSC, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_princ($str_alt64$_);
                                                                                                html_utilities.html_newline(TWO_INTEGER);
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = additional_isas_1;
                                                                                                    SubLObject additional_isa = NIL;
                                                                                                    for (additional_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , additional_isa = cdolist_list_var.first()) {
                                                                                                        cb_show_disjointness_tool_item(additional_isa, ONE_INTEGER, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ONE_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup($str_alt134$33_);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            {
                                                                                                SubLObject cdolist_list_var = isas_2;
                                                                                                SubLObject isa_2 = NIL;
                                                                                                for (isa_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_2 = cdolist_list_var.first()) {
                                                                                                    cb_show_disjointness_tool_item(isa_2, TWO_INTEGER, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject cdolist_list_var = nearest_common_isas;
                                                                                                SubLObject common_isa = NIL;
                                                                                                for (common_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , common_isa = cdolist_list_var.first()) {
                                                                                                    cb_show_disjointness_tool_item(common_isa, TWO_INTEGER, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                            if (NIL != additional_isas_2) {
                                                                                                html_utilities.html_newline(TWO_INTEGER);
                                                                                                html_utilities.html_princ($str_alt61$additional_);
                                                                                                cb_utilities.cb_form($$isa, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_princ($str_alt138$s_in_);
                                                                                                cb_utilities.cb_form($$EverythingPSC, UNPROVIDED, UNPROVIDED);
                                                                                                html_utilities.html_princ($str_alt64$_);
                                                                                                html_utilities.html_newline(TWO_INTEGER);
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = additional_isas_2;
                                                                                                    SubLObject additional_isa = NIL;
                                                                                                    for (additional_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , additional_isa = cdolist_list_var.first()) {
                                                                                                        cb_show_disjointness_tool_item(additional_isa, TWO_INTEGER, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(ONE_INTEGER);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    if (true) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        html_utilities.html_markup($str_alt134$33_);
                                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_submit_input($str_alt139$Assert_orthogonalInMt_TypeType, $str_alt140$orthogonal_typetype, UNPROVIDED);
                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                            cb_utilities.cb_link($SHOW_EL_FORMULA, orthogonality_warning, $str_alt142$Warning_re___orthogonalInMt_TypeT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2_42, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1_41, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_copyright_notice();
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_38, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_handle_assert_orthogonality(SubLObject args) {
        {
            SubLObject candidate_id_1 = html_utilities.html_extract_input($$$candidate1, args);
            SubLObject candidate_id_2 = html_utilities.html_extract_input($$$candidate2, args);
            SubLObject mt_id = html_utilities.html_extract_input($$$mt, args);
            SubLObject exclude_nartsP = html_utilities.html_extract_input($str_alt28$exclude_narts_, args);
            SubLObject candidate1 = cb_utilities.cb_guess_fort(candidate_id_1, UNPROVIDED);
            SubLObject candidate2 = cb_utilities.cb_guess_fort(candidate_id_2, UNPROVIDED);
            SubLObject mt = cb_utilities.cb_guess_fort(mt_id, UNPROVIDED);
            if (exclude_nartsP.equalp($$$t)) {
                exclude_nartsP = T;
            } else {
                exclude_nartsP = NIL;
            }
            if (NIL != html_utilities.html_extract_input($$$refresh, args)) {
                return cb_assert_orthogonality(candidate1, candidate2, mt, exclude_nartsP);
            }
            if (NIL != html_utilities.html_extract_input($$$orthogonal, args)) {
                {
                    SubLObject sentence = list($$ist, $$UniversalVocabularyMt, list($$orthogonalInMt, mt, candidate1, candidate2));
                    return cb_assertion_editor.cb_assert_internal($DEFAULT, NIL, sentence, T);
                }
            }
            if (NIL != html_utilities.html_extract_input($str_alt140$orthogonal_typetype, args)) {
                {
                    SubLObject coll_input_1 = html_utilities.html_extract_input($str_alt65$coll_1, args);
                    SubLObject coll_input_2 = html_utilities.html_extract_input($str_alt67$coll_2, args);
                    if ((NIL == coll_input_1) || (NIL == coll_input_2)) {
                        cb_disjointness_tool_error($str_alt143$You_must_select_one_item_from_eac);
                    } else {
                        {
                            SubLObject datum = Mapping.mapcar(symbol_function(STRING_TO_INTEGER), string_utilities.break_words(coll_input_1, UNPROVIDED, UNPROVIDED));
                            SubLObject current = datum;
                            SubLObject coll_type_id_1 = NIL;
                            SubLObject column_of_coll_type_1 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt145);
                            coll_type_id_1 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt145);
                            column_of_coll_type_1 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject datum_58 = Mapping.mapcar(symbol_function(STRING_TO_INTEGER), string_utilities.break_words(coll_input_2, UNPROVIDED, UNPROVIDED));
                                    SubLObject current_59 = datum_58;
                                    SubLObject coll_type_id_2 = NIL;
                                    SubLObject column_of_coll_type_2 = NIL;
                                    destructuring_bind_must_consp(current_59, datum_58, $list_alt146);
                                    coll_type_id_2 = current_59.first();
                                    current_59 = current_59.rest();
                                    destructuring_bind_must_consp(current_59, datum_58, $list_alt146);
                                    column_of_coll_type_2 = current_59.first();
                                    current_59 = current_59.rest();
                                    if (NIL == current_59) {
                                        {
                                            SubLObject coll_type_1 = cb_utilities.cb_guess_fort(coll_type_id_1, UNPROVIDED);
                                            SubLObject coll_type_2 = cb_utilities.cb_guess_fort(coll_type_id_2, UNPROVIDED);
                                            SubLObject sentence = list($$ist, $$UniversalVocabularyMt, list($$orthogonalInMt_TypeType, mt, coll_type_1, coll_type_2));
                                            return cb_assertion_editor.cb_assert_internal($DEFAULT, NIL, sentence, T);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_58, $list_alt146);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt145);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject compute_candidate_orthogonality_info(SubLObject candidate1, SubLObject candidate2, SubLObject mt) {
        {
            SubLObject isas_1 = isa.all_isa(candidate1, mt, UNPROVIDED);
            SubLObject isas_2 = isa.all_isa(candidate2, mt, UNPROVIDED);
            SubLObject additional_isas_1 = nset_difference(isa.all_isa_in_any_mt(candidate1), isas_1, symbol_function(EQ), UNPROVIDED);
            SubLObject additional_isas_2 = nset_difference(isa.all_isa_in_any_mt(candidate2), isas_2, symbol_function(EQ), UNPROVIDED);
            SubLObject common_isas = intersection(isas_1, isas_2, symbol_function(EQ), UNPROVIDED);
            SubLObject common_additional_isas = intersection(additional_isas_1, additional_isas_2, symbol_function(EQ), UNPROVIDED);
            SubLObject nearest_common_isas = genls.min_cols(common_isas, mt, UNPROVIDED);
            SubLObject nearest_common_additional_isas = genls.min_cols(common_additional_isas, mt, UNPROVIDED);
            SubLObject unique_isas_1 = set_difference(isas_1, common_isas, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_isas_2 = set_difference(isas_2, common_isas, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_additional_isas_1 = set_difference(additional_isas_1, common_additional_isas, symbol_function(EQ), UNPROVIDED);
            SubLObject unique_additional_isas_2 = set_difference(additional_isas_2, common_additional_isas, symbol_function(EQ), UNPROVIDED);
            unique_isas_1 = Sort.sort(unique_isas_1, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            unique_isas_2 = Sort.sort(unique_isas_2, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            unique_additional_isas_1 = Sort.sort(unique_additional_isas_1, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            unique_additional_isas_2 = Sort.sort(unique_additional_isas_2, symbol_function($sym73$GENERALITY_ESTIMATE_), UNPROVIDED);
            return list(new SubLObject[]{ $ISAS_1, unique_isas_1, $ISAS_2, unique_isas_2, $ADDITIONAL_ISAS_1, unique_additional_isas_1, $ADDITIONAL_ISAS_2, unique_additional_isas_2, $NEAREST_COMMON_ISAS, nearest_common_isas, $NEAREST_COMMON_ADDITIONAL_ISAS, nearest_common_additional_isas });
        }
    }

    public static final SubLObject cb_disjointness_tool_error(SubLObject error_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_princ_strong($str_alt148$Disjointness_Tool__Error);
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_newline(TWO_INTEGER);
                            html_utilities.html_princ(error_string);
                            html_utilities.html_princ($str_alt149$__Please_try_again_);
                            html_utilities.html_newline(TWO_INTEGER);
                            html_script_utilities.html_back_button(UNPROVIDED);
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject cb_disjointness_tool_reject_false_formula(SubLObject formula, SubLObject mt, SubLObject why_falseP) {
        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($str_alt150$Impossible_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline(TWO_INTEGER);
        html_utilities.html_princ($str_alt151$You_may_not_assert_);
        cb_utilities.cb_form(formula, UNPROVIDED, UNPROVIDED);
        html_utilities.html_princ($str_alt47$_in_);
        cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
        html_utilities.html_princ($str_alt152$_because_it_is_provably_false_);
        html_utilities.html_newline(TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ($str_alt153$Justification_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline(UNPROVIDED);
        {
            SubLObject cdolist_list_var = why_falseP;
            SubLObject why = NIL;
            for (why = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , why = cdolist_list_var.first()) {
                {
                    SubLObject assertion_formula = why.first();
                    SubLObject assertion = kb_indexing.find_gaf_any_mt(assertion_formula);
                    cb_utilities.cb_form(assertion, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_princ($str_alt47$_in_);
                    cb_utilities.cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                    html_utilities.html_newline(UNPROVIDED);
                }
            }
        }
        html_utilities.html_newline(UNPROVIDED);
        cb_utilities.cb_back_button(UNPROVIDED, UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param SPEC:
     * 		collection-p; If GIVE-LIFT-OPTION? is non-nil, this is the spec in the liftable genls relationship.
     * 		Ignored otherwise.
     */
    public static final SubLObject cb_show_disjointness_tool_item(SubLObject collection, SubLObject column, SubLObject emphasizeP, SubLObject allow_selectionP, SubLObject give_lift_optionP, SubLObject spec) {
        if (allow_selectionP == UNPROVIDED) {
            allow_selectionP = T;
        }
        if (give_lift_optionP == UNPROVIDED) {
            give_lift_optionP = NIL;
        }
        if (spec == UNPROVIDED) {
            spec = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != allow_selectionP) {
                                        html_utilities.html_radio_input(column.numE(TWO_INTEGER) || column.numE(FOUR_INTEGER) ? ((SubLObject) ($str_alt65$coll_1)) : $str_alt67$coll_2, cconcatenate(string_utilities.to_string(cb_utilities.cb_fort_identifier(collection)), new SubLObject[]{ $str_alt154$_, string_utilities.to_string(column) }), emphasizeP);
                                    } else {
                                        html_utilities.html_indent(FOUR_INTEGER);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_indent(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != emphasizeP) {
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_utilities.cb_form(collection, ZERO_INTEGER, T);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } else {
                                        cb_utilities.cb_form(collection, ZERO_INTEGER, T);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            if (NIL != give_lift_optionP) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_utilities.cb_link($DISJOINTNESS_LIFT_GENL, spec, collection, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject cb_link_disjointness_lift_genl(SubLObject spec, SubLObject genl, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (NIL == linktext) {
            linktext = $str_alt156$_Lift_;
        }
        {
            SubLObject formula = el_utilities.make_el_formula($$genls, list(spec, genl), UNPROVIDED);
            SubLObject assertion = kb_indexing.find_gaf_any_mt(formula);
            if (NIL != assertion) {
                cb_utilities.cb_link($CHANGE_MT, assertion, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_utilities.cb_link($ASSERT_FORMULA, formula, $$UniversalVocabularyMt, linktext, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject random_collections_subsumption_status(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        {
            SubLObject col1 = fort_types_interface.random_collection();
            SubLObject col2 = fort_types_interface.random_collection();
            if (NIL != verboseP) {
                format(T, $str_alt160$_s_vs___s____, col1, col2);
                force_output(UNPROVIDED);
            }
            {
                SubLObject status = collections_subsumption_status(col1, col2, UNPROVIDED);
                if (NIL != verboseP) {
                    format(T, $str_alt161$_s__, status);
                    force_output(UNPROVIDED);
                }
                return status;
            }
        }
    }

    public static final SubLObject random_collections_subsumption_statuses(SubLObject n, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject statuses = NIL;
                utilities_macros.$progress_note$.setDynamicValue($str_alt162$Sampling_random_pairs_of_collecti, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(n, thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                statuses = cons(random_collections_subsumption_status(verboseP), statuses);
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(statuses);
            }
        }
    }

    public static final SubLObject declare_cb_disjointness_file() {
        declareFunction("orthogonalP", "ORTHOGONAL?", 3, 0, false);
        declareFunction("cb_disjointness_tool", "CB-DISJOINTNESS-TOOL", 1, 0, false);
        declareFunction("cb_link_disjointness_tool", "CB-LINK-DISJOINTNESS-TOOL", 2, 3, false);
        declareFunction("cb_disjointness_tool_guts", "CB-DISJOINTNESS-TOOL-GUTS", 3, 1, false);
        declareFunction("cb_handle_disjointness_tool", "CB-HANDLE-DISJOINTNESS-TOOL", 1, 0, false);
        declareFunction("compute_candidate_disjointness_info", "COMPUTE-CANDIDATE-DISJOINTNESS-INFO", 3, 0, false);
        declareFunction("fast_max_disjoint_with", "FAST-MAX-DISJOINT-WITH", 1, 1, false);
        declareFunction("disjointness_tool_generate_formula_to_assert", "DISJOINTNESS-TOOL-GENERATE-FORMULA-TO-ASSERT", 4, 0, false);
        declareFunction("disjointness_tool_why_falseP", "DISJOINTNESS-TOOL-WHY-FALSE?", 2, 0, false);
        declareFunction("cb_disjointness_preliminary_screen", "CB-DISJOINTNESS-PRELIMINARY-SCREEN", 1, 0, false);
        declareFunction("cb_link_disjointness_preliminary_screen", "CB-LINK-DISJOINTNESS-PRELIMINARY-SCREEN", 0, 3, false);
        declareFunction("cb_handle_disjointness_preliminary_screen", "CB-HANDLE-DISJOINTNESS-PRELIMINARY-SCREEN", 1, 0, false);
        declareFunction("cb_generate_disjointness_candidates", "CB-GENERATE-DISJOINTNESS-CANDIDATES", 1, 0, false);
        declareFunction("cb_link_generate_disjointness_candidates", "CB-LINK-GENERATE-DISJOINTNESS-CANDIDATES", 0, 3, false);
        declareFunction("cb_generate_disjointness_candidates_guts", "CB-GENERATE-DISJOINTNESS-CANDIDATES-GUTS", 1, 1, false);
        declareFunction("random_orthogonal_collections", "RANDOM-ORTHOGONAL-COLLECTIONS", 1, 2, false);
        declareFunction("random_implicitly_orthogonal_collection_pair", "RANDOM-IMPLICITLY-ORTHOGONAL-COLLECTION-PAIR", 2, 0, false);
        declareFunction("collections_subsumption_status", "COLLECTIONS-SUBSUMPTION-STATUS", 2, 1, false);
        declareFunction("random_n_collections", "RANDOM-N-COLLECTIONS", 1, 0, false);
        declareFunction("cached_all_collections_set", "CACHED-ALL-COLLECTIONS-SET", 0, 0, false);
        declareFunction("cb_assert_orthogonality", "CB-ASSERT-ORTHOGONALITY", 4, 0, false);
        declareFunction("cb_handle_assert_orthogonality", "CB-HANDLE-ASSERT-ORTHOGONALITY", 1, 0, false);
        declareFunction("compute_candidate_orthogonality_info", "COMPUTE-CANDIDATE-ORTHOGONALITY-INFO", 3, 0, false);
        declareFunction("cb_disjointness_tool_error", "CB-DISJOINTNESS-TOOL-ERROR", 1, 0, false);
        declareFunction("cb_disjointness_tool_reject_false_formula", "CB-DISJOINTNESS-TOOL-REJECT-FALSE-FORMULA", 3, 0, false);
        declareFunction("cb_show_disjointness_tool_item", "CB-SHOW-DISJOINTNESS-TOOL-ITEM", 3, 3, false);
        declareFunction("cb_link_disjointness_lift_genl", "CB-LINK-DISJOINTNESS-LIFT-GENL", 2, 1, false);
        declareFunction("random_collections_subsumption_status", "RANDOM-COLLECTIONS-SUBSUMPTION-STATUS", 0, 1, false);
        declareFunction("random_collections_subsumption_statuses", "RANDOM-COLLECTIONS-SUBSUMPTION-STATUSES", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_cb_disjointness_file() {
        deflexical("*CB-DISJOINTNESS-DEFAULT-ASSERT-MT*", $$UniversalVocabularyMt);
        deflexical("*ALL-COLLECTIONS-SET*", NIL != boundp($all_collections_set$) ? ((SubLObject) ($all_collections_set$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_disjointness_file() {
                html_macros.note_html_handler_function(CB_DISJOINTNESS_TOOL);
        cb_utilities.setup_cb_link_method($DISJOINTNESS_TOOL, CB_LINK_DISJOINTNESS_TOOL, FIVE_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_DISJOINTNESS_TOOL);
        html_macros.note_html_handler_function(CB_DISJOINTNESS_PRELIMINARY_SCREEN);
        cb_utilities.setup_cb_link_method($DISJOINTNESS_PRELIMINARY_SCREEN, CB_LINK_DISJOINTNESS_PRELIMINARY_SCREEN, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_DISJOINTNESS_PRELIMINARY_SCREEN);
        html_macros.note_html_handler_function(CB_GENERATE_DISJOINTNESS_CANDIDATES);
        cb_utilities.setup_cb_link_method($GENERATE_DISJOINTNESS_CANDIDATES, CB_LINK_GENERATE_DISJOINTNESS_CANDIDATES, THREE_INTEGER);
        subl_macro_promotions.declare_defglobal($all_collections_set$);
        html_macros.note_html_handler_function(CB_HANDLE_ASSERT_ORTHOGONALITY);
        cb_utilities.setup_cb_link_method($DISJOINTNESS_LIFT_GENL, CB_LINK_DISJOINTNESS_LIFT_GENL, THREE_INTEGER);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$orthogonalInMt = constant_handles.reader_make_constant_shell(makeString("orthogonalInMt"));

    static private final SubLList $list_alt1 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

    static private final SubLList $list_alt2 = list(makeSymbol("ID-1"), makeSymbol("ID-2"), makeSymbol("MONAD-ID"), makeSymbol("EXCLUDE-NARTS?"));

    static private final SubLString $$$t = makeString("t");

    private static final SubLSymbol CB_DISJOINTNESS_TOOL = makeSymbol("CB-DISJOINTNESS-TOOL");

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    static private final SubLString $str_alt6$_a_VS__a = makeString("~a VS ~a");



    static private final SubLString $str_alt8$cb_disjointness_tool__a__a__a__a = makeString("cb-disjointness-tool&~a&~a&~a&~a");

    private static final SubLSymbol $DISJOINTNESS_TOOL = makeKeyword("DISJOINTNESS-TOOL");

    private static final SubLSymbol CB_LINK_DISJOINTNESS_TOOL = makeSymbol("CB-LINK-DISJOINTNESS-TOOL");

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("GENLS-1"), makeSymbol("GENLS-2"), makeSymbol("ADDITIONAL-GENLS-1"), makeSymbol("ADDITIONAL-GENLS-2"), makeSymbol("NEAREST-COMMON-GENLS"), makeSymbol("NEAREST-COMMON-ADDITIONAL-GENLS"), makeSymbol("DISJOINS-1"), makeSymbol("DISJOINS-2"), makeSymbol("PROVABILITY") });

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("GENLS-1"), makeKeyword("GENLS-2"), makeKeyword("ADDITIONAL-GENLS-1"), makeKeyword("ADDITIONAL-GENLS-2"), makeKeyword("NEAREST-COMMON-GENLS"), makeKeyword("NEAREST-COMMON-ADDITIONAL-GENLS"), makeKeyword("DISJOINS-1"), makeKeyword("DISJOINS-2"), makeKeyword("PROVABILITY") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $GENLS_1 = makeKeyword("GENLS-1");

    private static final SubLSymbol $GENLS_2 = makeKeyword("GENLS-2");

    private static final SubLSymbol $ADDITIONAL_GENLS_1 = makeKeyword("ADDITIONAL-GENLS-1");

    private static final SubLSymbol $ADDITIONAL_GENLS_2 = makeKeyword("ADDITIONAL-GENLS-2");

    private static final SubLSymbol $NEAREST_COMMON_GENLS = makeKeyword("NEAREST-COMMON-GENLS");

    private static final SubLSymbol $NEAREST_COMMON_ADDITIONAL_GENLS = makeKeyword("NEAREST-COMMON-ADDITIONAL-GENLS");

    private static final SubLSymbol $DISJOINS_1 = makeKeyword("DISJOINS-1");

    private static final SubLSymbol $DISJOINS_2 = makeKeyword("DISJOINS-2");

    private static final SubLSymbol $PROVABILITY = makeKeyword("PROVABILITY");

    public static final SubLObject $$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));

    static private final SubLString $str_alt24$cb_handle_disjointness_tool = makeString("cb-handle-disjointness-tool");

    static private final SubLString $$$candidate1 = makeString("candidate1");

    static private final SubLString $$$candidate2 = makeString("candidate2");

    static private final SubLString $$$mt = makeString("mt");

    static private final SubLString $str_alt28$exclude_narts_ = makeString("exclude-narts?");





    static private final SubLString $str_alt31$_Refresh_ = makeString("[Refresh]");

    static private final SubLString $$$Update = makeString("Update");

    static private final SubLString $$$update = makeString("update");

    static private final SubLString $str_alt34$Power____a = makeString("Power : ~a");

    static private final SubLString $str_alt35$_ = makeString("*");

    private static final SubLSymbol $GENERATE_DISJOINTNESS_CANDIDATES = makeKeyword("GENERATE-DISJOINTNESS-CANDIDATES");

    private static final SubLSymbol $DISJOINTNESS_PRELIMINARY_SCREEN = makeKeyword("DISJOINTNESS-PRELIMINARY-SCREEN");



    static private final SubLString $str_alt39$is_ = makeString("is ");



    static private final SubLString $str_alt41$provably_ = makeString("provably ");

    public static final SubLObject $$True = constant_handles.reader_make_constant_shell(makeString("True"));



    public static final SubLObject $$False = constant_handles.reader_make_constant_shell(makeString("False"));



    static private final SubLString $str_alt46$unknown_ = makeString("unknown ");

    static private final SubLString $str_alt47$_in_ = makeString(" in ");

    static private final SubLString $str_alt48$_ = makeString(".");

    static private final SubLString $str_alt49$It_could_be_proven_in_ = makeString("It could be proven in ");

    static private final SubLString $str_alt50$_by_asserting = makeString(" by asserting");

    static private final SubLList $list_alt51 = list(constant_handles.reader_make_constant_shell(makeString("specs")), makeSymbol("A"), makeSymbol("B"));

    static private final SubLString $$$or = makeString("or");

    static private final SubLList $list_alt53 = list(constant_handles.reader_make_constant_shell(makeString("disjointWith")), makeSymbol("B"), makeSymbol("C"));

    static private final SubLList $list_alt54 = list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("C"), makeSymbol("D"));

    static private final SubLString $$$Assert = makeString("Assert");

    static private final SubLString $$$assert = makeString("assert");

    static private final SubLString $$$Assert_orthogonality = makeString("Assert orthogonality");

    static private final SubLString $$$orthogonality = makeString("orthogonality");

    static private final SubLList $list_alt59 = list(makeString("A"), makeString("B"), makeString("C"), makeString("D"));

    static private final SubLString $str_alt60$25_ = makeString("25%");

    static private final SubLString $str_alt61$additional_ = makeString("additional ");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $str_alt64$_ = makeString(":");

    static private final SubLString $str_alt65$coll_1 = makeString("coll-1");

    static private final SubLList $list_alt66 = list(makeSymbol("ID-1"), makeSymbol("COLUMN-OF-COLL-1"));

    static private final SubLString $str_alt67$coll_2 = makeString("coll-2");

    static private final SubLList $list_alt68 = list(makeSymbol("ID-2"), makeSymbol("COLUMN-OF-COLL-2"));

    static private final SubLString $str_alt69$You_must_choose_from_columns_A_an = makeString("You must choose from columns A and B, or B and C, or C and D.");

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));



    private static final SubLSymbol CB_HANDLE_DISJOINTNESS_TOOL = makeSymbol("CB-HANDLE-DISJOINTNESS-TOOL");

    static private final SubLSymbol $sym73$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    static private final SubLSymbol $sym74$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");

    private static final SubLSymbol $INCOMPATIBLE_COLUMNS = makeKeyword("INCOMPATIBLE-COLUMNS");



    static private final SubLList $list_alt77 = list(makeSymbol("COLL-1"), makeSymbol("COLL-2"));

    static private final SubLList $list_alt78 = list(makeSymbol("&OPTIONAL"), makeSymbol("MT-ID"), makeSymbol("EXCLUDE-NARTS?"));

    static private final SubLString $str_alt79$cb_handle_disjointness_preliminar = makeString("cb-handle-disjointness-preliminary-screen");

    static private final SubLString $$$Disjointness_Tool = makeString("Disjointness Tool");

    static private final SubLString $str_alt81$Mt___ = makeString("Mt:  ");

    public static final SubLInteger $int$35 = makeInteger(35);

    static private final SubLString $$$Generate_random_pairs = makeString("Generate random pairs");

    static private final SubLString $$$generate = makeString("generate");

    static private final SubLString $str_alt85$Exclude_NARTs_ = makeString("Exclude NARTs?");

    static private final SubLString $str_alt86$OR___ = makeString("OR...");

    static private final SubLString $str_alt87$Consider_the_following_pair_of_co = makeString("Consider the following pair of collections:");

    static private final SubLString $str_alt88$ = makeString("");

    static private final SubLString $$$Consider = makeString("Consider");

    static private final SubLString $$$consider = makeString("consider");

    private static final SubLSymbol CB_DISJOINTNESS_PRELIMINARY_SCREEN = makeSymbol("CB-DISJOINTNESS-PRELIMINARY-SCREEN");

    static private final SubLString $str_alt92$_Start_Again_ = makeString("[Start Again]");

    static private final SubLString $str_alt93$cb_disjointness_preliminary_scree = makeString("cb-disjointness-preliminary-screen&~a&~a");

    private static final SubLSymbol CB_LINK_DISJOINTNESS_PRELIMINARY_SCREEN = makeSymbol("CB-LINK-DISJOINTNESS-PRELIMINARY-SCREEN");

    static private final SubLString $$$on = makeString("on");

    private static final SubLSymbol CB_HANDLE_DISJOINTNESS_PRELIMINARY_SCREEN = makeSymbol("CB-HANDLE-DISJOINTNESS-PRELIMINARY-SCREEN");

    private static final SubLSymbol CB_GENERATE_DISJOINTNESS_CANDIDATES = makeSymbol("CB-GENERATE-DISJOINTNESS-CANDIDATES");

    static private final SubLString $str_alt98$_Random_ = makeString("[Random]");

    static private final SubLString $str_alt99$cb_generate_disjointness_candidat = makeString("cb-generate-disjointness-candidates&~a&~a");

    private static final SubLSymbol CB_LINK_GENERATE_DISJOINTNESS_CANDIDATES = makeSymbol("CB-LINK-GENERATE-DISJOINTNESS-CANDIDATES");

    static private final SubLString $str_alt101$Random__potentially_orthogonal_co = makeString("Random, potentially orthogonal collections");



    static private final SubLString $str_alt103$_Regenerate_ = makeString("[Regenerate]");

    static private final SubLString $str_alt104$Found__a_random__potentially_orth = makeString("Found ~a random, potentially orthogonal pairs of collections in ");

    static private final SubLList $list_alt105 = list(makeSymbol("CANDIDATE1"), makeSymbol("CANDIDATE2"));

    static private final SubLString $str_alt106$_Consider_ = makeString("[Consider]");

    static private final SubLString $str_alt107$_vs_ = makeString(" vs ");











    private static final SubLSymbol $ORTHOGONAL = makeKeyword("ORTHOGONAL");



    public static final SubLSymbol $all_collections_set$ = makeSymbol("*ALL-COLLECTIONS-SET*");

    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    static private final SubLList $list_alt117 = list(makeSymbol("&KEY"), makeSymbol("ISAS-1"), makeSymbol("ISAS-2"), makeSymbol("ADDITIONAL-ISAS-1"), makeSymbol("ADDITIONAL-ISAS-2"), makeSymbol("NEAREST-COMMON-ISAS"), makeSymbol("NEAREST-COMMON-ADDITIONAL-ISAS"));

    static private final SubLList $list_alt118 = list(makeKeyword("ISAS-1"), makeKeyword("ISAS-2"), makeKeyword("ADDITIONAL-ISAS-1"), makeKeyword("ADDITIONAL-ISAS-2"), makeKeyword("NEAREST-COMMON-ISAS"), makeKeyword("NEAREST-COMMON-ADDITIONAL-ISAS"));

    private static final SubLSymbol $ISAS_1 = makeKeyword("ISAS-1");

    private static final SubLSymbol $ISAS_2 = makeKeyword("ISAS-2");

    private static final SubLSymbol $ADDITIONAL_ISAS_1 = makeKeyword("ADDITIONAL-ISAS-1");

    private static final SubLSymbol $ADDITIONAL_ISAS_2 = makeKeyword("ADDITIONAL-ISAS-2");

    private static final SubLSymbol $NEAREST_COMMON_ISAS = makeKeyword("NEAREST-COMMON-ISAS");

    private static final SubLSymbol $NEAREST_COMMON_ADDITIONAL_ISAS = makeKeyword("NEAREST-COMMON-ADDITIONAL-ISAS");

    static private final SubLString $str_alt125$33210D820C0D810D831E190FA46264353 = makeString("33210D820C0D810D831E190FA462643538383130382D396332392D313162312D396461642D6333373936333666373237301E190FA431326436636338342D336662662D313164382D393633652D3030303262333936666166610F0273064F6E65206D7573742062652065787472656D656C79206361726566756C20776974682074686973207072656469636174652E2020466F72206578616D706C652C206F6E65206D696768742062652074656D7074656420746F20617373657274202823246F7274686F676F6E616C496E4D742D5479706554797065202324556E6976657273616C566F636162756C6172794D74202324436F6C6F7220232456656869636C6554797065292C20776869636820776F756C642028676976656E206365727461696E2066616374732920656E7461696C202823246F7274686F676F6E616C496E4D742D5479706554797065202324556E6976657273616C566F636162756C6172794D74202324436F6C6F722023244175746F6D6F62696C655479706542794272616E64292E20205468697320617373657274696F6E20697320746F6F2067656E6572616C2C20686F77657665722E2020466F7220737570706F7365206F6E65207765726520746F20637265617465206120636F6C6C656374696F6E204175746F6D6F62696C65547970654279436F6C6F722C2061207370656369616C697A6174696F6E206F6620232456656869636C655479706520686176696E6720636F6C6C656374696F6E73206C696B652052656443617220617320696E7374616E6365732E20202823246F7274686F676F6E616C496E4D742D5479706554797065202324556E6976657273616C566F636162756C6172794D74202324436F6C6F7220232456656869636C65547970652920776F756C6420656E7461696C202823246F7274686F676F6E616C496E4D74202324556E6976657273616C566F636162756C6172794D74202324526564436F6C6F7220526564436172292C207768696368206973206F6276696F75736C792066616C736520286173205265644361722069732061207370656369616C697A6174696F6E206F66202324526564436F6C6F72292E2020546865206D6F726520737065636966696320617373657274696F6E202823246F7274686F676F6E616C496E4D742D5479706554797065202324556E6976657273616C566F636162756C6172794D74202324436F6C6F722023244175746F6D6F62696C655479706542794272616E642920697320736166652C20686F77657665722E2020466F72206576656E206966206F6E65207765726520746F20637265617465206120636F6C6C656374696F6E204175746F6D6F62696C655479706542794272616E64416E64436F6C6F722C20686176696E6720636F6C6C656374696F6E73206C696B6520526564466F726443617220617320696E7374616E6365732C207468697320776F756C64206E6F742062652061207370656369616C697A6174696F6E206F662023244175746F6D6F62696C655479706542794272616E642C20616E64207468657265666F7265202823246F7274686F676F6E616C496E4D742D5479706554797065202324556E6976657273616C566F636162756C6172794D74202324436F6C6F722023244175746F6D6F62696C655479706542794272616E642920776F756C64206E6F7420656E7461696C20746865206F6276696F75736C792066616C73652073656E74656E6365202823246F7274686F676F6E616C496E4D74202324556E6976657273616C566F636162756C6172794D74202324526564436F6C6F7220526564466F7264436172292E2020496E2067656E6572616C2C206F6E652073686F756C6420617373657274202823246F7274686F676F6E616C496E4D742D5479706554797065204D5420434F4C545950453120434F4C545950453229206F6E6C79207768656E20434F4C545950453120616E6420434F4C5459504532206172652C20736F20746F20737065616B2C20227468696E6720747970657320627920617474726962757465222028652E672E202324416E696D616C547970654279506879736963616C4275696C642C2023244175746F6D6F62696C655479706542794272616E642C20232444657669636554797065427946756E6374696F6E2C202324436F6C6F72292C20616E6420746865207265737065637469766520617474726962757465732061726520636C6561726C79206F7274686F676F6E616C20746F2028692E652E206C6F676963616C6C7920696E646570656E64656E74206F66292065616368206F746865722E2020284E6F74652074686174202324436F6C6F722063616E2062652074686F75676874206F66206173204F626A6563745479706542794D61696E436F6C6F722E291E190FA464666634613034312D346461322D313164362D383263302D303030326233346337633966");

    static private final SubLString $str_alt126$cb_handle_assert_orthogonality = makeString("cb-handle-assert-orthogonality");

    static private final SubLString $$$Refresh = makeString("Refresh");

    static private final SubLString $$$refresh = makeString("refresh");

    static private final SubLString $$$STUB = makeString("STUB");

    static private final SubLString $str_alt130$Power____A = makeString("Power : ~A");

    static private final SubLString $$$could_be_proven_by_asserting = makeString("could be proven by asserting");

    public static final SubLObject $$orthogonalInMt_TypeType = constant_handles.reader_make_constant_shell(makeString("orthogonalInMt-TypeType"));

    static private final SubLList $list_alt133 = list(makeSymbol("COL-TYPE1"), makeSymbol("COL-TYPE2"));

    static private final SubLString $str_alt134$33_ = makeString("33%");

    static private final SubLString $$$Assert_orthogonalInMt = makeString("Assert orthogonalInMt");

    static private final SubLString $$$orthogonal = makeString("orthogonal");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLString $str_alt138$s_in_ = makeString("s in ");

    static private final SubLString $str_alt139$Assert_orthogonalInMt_TypeType = makeString("Assert orthogonalInMt-TypeType");

    static private final SubLString $str_alt140$orthogonal_typetype = makeString("orthogonal-typetype");

    private static final SubLSymbol $SHOW_EL_FORMULA = makeKeyword("SHOW-EL-FORMULA");

    static private final SubLString $str_alt142$Warning_re___orthogonalInMt_TypeT = makeString("Warning re #$orthogonalInMt-TypeType");

    static private final SubLString $str_alt143$You_must_select_one_item_from_eac = makeString("You must select one item from each column.");

    private static final SubLSymbol STRING_TO_INTEGER = makeSymbol("STRING-TO-INTEGER");

    static private final SubLList $list_alt145 = list(makeSymbol("COLL-TYPE-ID-1"), makeSymbol("COLUMN-OF-COLL-TYPE-1"));

    static private final SubLList $list_alt146 = list(makeSymbol("COLL-TYPE-ID-2"), makeSymbol("COLUMN-OF-COLL-TYPE-2"));

    private static final SubLSymbol CB_HANDLE_ASSERT_ORTHOGONALITY = makeSymbol("CB-HANDLE-ASSERT-ORTHOGONALITY");

    static private final SubLString $str_alt148$Disjointness_Tool__Error = makeString("Disjointness Tool: Error");

    static private final SubLString $str_alt149$__Please_try_again_ = makeString("  Please try again.");

    static private final SubLString $str_alt150$Impossible_ = makeString("Impossible!");

    static private final SubLString $str_alt151$You_may_not_assert_ = makeString("You may not assert ");

    static private final SubLString $str_alt152$_because_it_is_provably_false_ = makeString(" because it is provably false.");

    static private final SubLString $str_alt153$Justification_ = makeString("Justification:");

    static private final SubLString $str_alt154$_ = makeString(" ");

    private static final SubLSymbol $DISJOINTNESS_LIFT_GENL = makeKeyword("DISJOINTNESS-LIFT-GENL");

    static private final SubLString $str_alt156$_Lift_ = makeString("[Lift]");





    private static final SubLSymbol CB_LINK_DISJOINTNESS_LIFT_GENL = makeSymbol("CB-LINK-DISJOINTNESS-LIFT-GENL");

    static private final SubLString $str_alt160$_s_vs___s____ = makeString("~s vs. ~s... ");

    static private final SubLString $str_alt161$_s__ = makeString("~s~%");

    static private final SubLString $str_alt162$Sampling_random_pairs_of_collecti = makeString("Sampling random pairs of collections");

    // // Initializers
    public void declareFunctions() {
        declare_cb_disjointness_file();
    }

    public void initializeVariables() {
        init_cb_disjointness_file();
    }

    public void runTopLevelForms() {
        setup_cb_disjointness_file();
    }
}

