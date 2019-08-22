/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-TOOLS-MISC
 *  source file: /cyc/top/cycl/uia-tools-misc.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_tools_misc extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_misc() {
    }

    public static final SubLFile me = new uia_tools_misc();


    // // Definitions
    public static final SubLObject uia_act_new_wff_checker(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence, SubLObject v_assert) {
        if (v_assert == UNPROVIDED) {
            v_assert = $TRUE;
        }
        {
            SubLObject plist = NIL;
            if (NIL != v_assert) {
                plist = putf(plist, $ASSERT, v_assert);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $WFF_CHECKER, list(cycl_sentence), plist);
        }
    }

    public static final SubLObject uiat_wff_checker_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                    return format(NIL, $str_alt5$Well_formed_____A, phrase);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_wff_checker_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_assert = user_interaction_agenda.ui_state_lookup(interaction, $ASSERT, $UNKNOWN);
                    SubLObject wff_type = ($TRUE == v_assert) ? ((SubLObject) ($sym7$UIA_ASSERTIBLE_COMPLIANT_)) : $sym8$UIA_WFF_COMPLIANT_;
                    SubLObject wffP = user_interaction_agenda.ui_state_lookup(interaction, $kw9$WFF_, $UNKNOWN);
                    SubLObject result = NIL;
                    user_interaction_agenda.ui_state_update(interaction, $WFF_TYPE, wff_type);
                    {
                        SubLObject pcase_var = wffP;
                        if (pcase_var.eql($UNKNOWN)) {
                            {
                                SubLObject message = format(NIL, $str_alt11$Checking_whether__S_is_plausible_, uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED));
                                uia_mumbler.uia_mumble(v_agenda, message);
                                uia_tools_basic.uia_act_new_thinking_child(interaction, wff_type, list(v_agenda, cycl_sentence), message, $kw9$WFF_);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }
                        } else
                            if (pcase_var.eql($WFF)) {
                                result = $OK;
                                {
                                    SubLObject paraphrased = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                                    SubLObject stmt = cconcatenate($str_alt14$There_is_no_obvious_reason_to_dou, new SubLObject[]{ paraphrased, $str_alt15$__ });
                                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, result);
                                    user_interaction_agenda.uia_act_new_comment(v_agenda, stmt);
                                }
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            } else {
                                result = $ILL_FORMED;
                                {
                                    SubLObject request = NIL;
                                    request = uiat_all_is_not_wff(interaction, cycl_sentence, v_assert);
                                    return request;
                                }
                            }

                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_all_is_not_wff(SubLObject interaction, SubLObject cycl_sentence, SubLObject v_assert) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject why_not_wff = ($TRUE == v_assert) ? ((SubLObject) (uia_trampolines.uia_why_not_assertible_compliant(v_agenda, cycl_sentence, UNPROVIDED))) : uia_trampolines.uia_why_not_wff_compliant(v_agenda, cycl_sentence, UNPROVIDED);
            SubLObject repairs = NIL;
            SubLObject request = NIL;
            user_interaction_agenda.ui_state_update(interaction, $WHY_NOT_WFF, why_not_wff);
            user_interaction_agenda.ui_state_update(interaction, $NON_WFF_SENTENCE, cycl_sentence);
            {
                SubLObject cdolist_list_var = why_not_wff;
                SubLObject argument = NIL;
                for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                    if (NIL != hl_supports.opaque_hl_support_p(argument)) {
                        {
                            SubLObject formula = arguments.support_formula(argument);
                            if ((cycl_utilities.formula_arg0(formula) == $$unknownSentence) && (NIL == rkf_contradiction_finder.rkf_rejected(formula, user_interaction_agenda.uia_domain_interaction_mt(v_agenda), UNPROVIDED, UNPROVIDED))) {
                                repairs = cons(cycl_utilities.formula_arg1(formula, UNPROVIDED), repairs);
                            }
                        }
                    }
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $REPAIRS, repairs);
            request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($CYCL_SENTENCE, cycl_sentence, $WHY_NOT_WFF, why_not_wff, $REPAIRS, repairs));
            return request;
        }
    }

    public static final SubLObject uiat_wff_checker_done(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject sentence = user_interaction_agenda.ui_state_lookup(interaction, $NON_WFF_SENTENCE, UNPROVIDED);
            SubLObject why_not_wff = user_interaction_agenda.ui_state_lookup(interaction, $WHY_NOT_WFF, UNPROVIDED);
            uia_problem_reporting.uia_problem_reporting_email_autoreport(format(NIL, $str_alt23$WFF_checker_problem___A, sentence), format(NIL, $str_alt24$This_is_an_auto_mailed_message___, new SubLObject[]{ $str_alt25$uia_tools_misc, $str_alt26$uiat_wff_checker_generate_request, sentence, why_not_wff }), interaction);
            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $ILL_FORMED);
        }
        return interaction;
    }

    public static final SubLObject uiat_wff_checker_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt27);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt31);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt31);
                            if (NIL == member(current_3, $list_alt32, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt31);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_2);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject assert_tail = property_list_member($ASSERT, current_2);
                            SubLObject v_assert = (NIL != assert_tail) ? ((SubLObject) (cadr(assert_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_2);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_wff_checker(v_agenda, mode, sentence, v_assert);
                        }
                    }
                } else
                    if (pcase_var.eql($REPAIR)) {
                        {
                            SubLObject datum_4 = plist;
                            SubLObject current_5 = datum_4;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_5;
                            SubLObject bad = NIL;
                            SubLObject current_6 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_4, $list_alt38);
                                current_6 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_4, $list_alt38);
                                if (NIL == member(current_6, $list_alt39, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_6 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_4, $list_alt38);
                            }
                            {
                                SubLObject sentences_tail = property_list_member($SENTENCES, current_5);
                                SubLObject sentences = (NIL != sentences_tail) ? ((SubLObject) (cadr(sentences_tail))) : NIL;
                                if (NIL != sentences) {
                                    user_interaction_agenda.ui_state_update(interaction, $kw9$WFF_, $UNKNOWN);
                                }
                                {
                                    SubLObject cdolist_list_var = sentences;
                                    SubLObject sentence = NIL;
                                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                        {
                                            SubLObject extend = uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED), sentence, UNPROVIDED);
                                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, extend);
                                        }
                                    }
                                }
                            }
                        }
                    } else
                        if (pcase_var.eql($FAIL)) {
                            uiat_wff_checker_done(interaction);
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject uiat_wff_checker_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($THINKING)) {
                {
                    SubLObject result = user_interaction_agenda.ui_result(child);
                    SubLObject my_result_will_be = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
                    SubLObject pcase_var_7 = my_result_will_be;
                    if (pcase_var_7.eql($kw9$WFF_)) {
                        user_interaction_agenda.ui_state_update(parent, $kw9$WFF_, NIL != result ? ((SubLObject) ($WFF)) : $NOT_WFF);
                    }
                }
            }
        }
        return parent;
    }

    public static final SubLObject uia_act_new_contradiction_finder(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONTRADICTION_FINDER, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_contradiction_finder_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                    return format(NIL, $str_alt47$Contradiction_Check____A, phrase);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_contradiction_finder_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject contradiction = uia_trampolines.uia_rejected_sentence(v_agenda, cycl_sentence, UNPROVIDED);
                    SubLObject result = NIL;
                    if (NIL != contradiction) {
                        result = $CONTRADICTION;
                        {
                            SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($CYCL_SENTENCE, cycl_sentence, $CONTRADICTION, contradiction));
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, result);
                            return request;
                        }
                    } else {
                        result = $OK;
                        {
                            SubLObject paraphrased = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                            SubLObject stmt = cconcatenate($str_alt49$After_checking__I_can_find_nothin, new SubLObject[]{ paraphrased, $str_alt50$__contradicts_ });
                            user_interaction_agenda.uia_act_new_comment(v_agenda, stmt);
                        }
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, result);
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_redundancy_detector(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $REDUNDANCY_DETECTOR, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_redundancy_detector_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                    return format(NIL, $str_alt53$Redundancy_Check____A, phrase);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_redundancy_detector_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            if (user_interaction_agenda.ui_state_lookup(interaction, $kw54$ALREADY_SHOWN_, UNPROVIDED) == $TRUE) {
                user_interaction_agenda.uia_act_complete(v_agenda, interaction, user_interaction_agenda.ui_state_lookup(interaction, $STATUS, UNPROVIDED));
                return user_interaction_agenda.uia_generate_next_request(v_agenda);
            }
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject cycl_sentence = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt4);
                cycl_sentence = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject redundancy = uia_trampolines.uia_redundant_sentence(v_agenda, cycl_sentence, UNPROVIDED);
                        SubLObject result = (NIL != redundancy) ? ((SubLObject) ($REDUNDANT)) : $OK;
                        user_interaction_agenda.ui_state_update(interaction, $STATUS, result);
                        if (NIL != redundancy) {
                            {
                                SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($CYCL_SENTENCE, cycl_sentence, $REDUNDANCY, redundancy));
                                SubLObject paraphrased = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                                SubLObject stmt = cconcatenate($str_alt58$Important__I_already_know_that__, new SubLObject[]{ paraphrased, $str_alt15$__ });
                                user_interaction_agenda.uia_act_new_comment(v_agenda, stmt);
                                return request;
                            }
                        } else {
                            {
                                SubLObject paraphrased = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                                SubLObject stmt = cconcatenate($str_alt59$I_do_not_think_that_I_previously_, new SubLObject[]{ paraphrased, $str_alt60$____It_is_not_redundant_knowledge });
                                user_interaction_agenda.uia_act_new_comment(v_agenda, stmt);
                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, result);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt4);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_concept_killer(SubLObject v_agenda, SubLObject mode, SubLObject v_term) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_KILLER, list(v_term), UNPROVIDED);
    }

    public static final SubLObject uiat_concept_killer_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt63);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return format(NIL, $str_alt64$Forget____A, phrase);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt63);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_killer_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt63);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject term_name = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject confirmed = user_interaction_agenda.ui_state_lookup(interaction, $CONFIRMED, $NO);
                    if ($YES != confirmed) {
                        {
                            SubLObject message = cconcatenate($str_alt68$Do_you_want_me_to_forget_the_conc, new SubLObject[]{ term_name, $str_alt69$_ });
                            SubLObject child = uia_tools_basic.uia_act_new_yes_no_question(v_agenda, $REQUIRED, message, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                        }
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    } else
                        if ($YES == confirmed) {
                            if (NIL != forts.fort_p(v_term)) {
                                {
                                    SubLObject message = cconcatenate($str_alt70$The_concept_, new SubLObject[]{ term_name, $str_alt71$_has_been_forgotten_ });
                                    uia_trampolines.uia_kill(v_agenda, v_term);
                                    user_interaction_agenda.uia_act_new_comment(v_agenda, message);
                                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $KILLED);
                                }
                            }
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list_alt63);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_killer_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($YES_NO_QUESTION)) {
                {
                    SubLObject pcase_var_8 = user_interaction_agenda.ui_result(child);
                    if (pcase_var_8.eql($YES)) {
                        user_interaction_agenda.ui_state_update(parent, $CONFIRMED, $YES);
                    } else
                        if (pcase_var_8.eql($NO)) {
                            user_interaction_agenda.uia_act_complete(v_agenda, parent, $NOT_KILLED);
                        }

                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_concept_killer_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt27);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_9 = plist;
                        SubLObject current_10 = datum_9;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_10;
                        SubLObject bad = NIL;
                        SubLObject current_11 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_9, $list_alt75);
                            current_11 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_9, $list_alt75);
                            if (NIL == member(current_11, $list_alt76, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_11 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_9, $list_alt75);
                        }
                        {
                            SubLObject term_tail = property_list_member($TERM, current_10);
                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_10);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_concept_killer(v_agenda, mode, v_term);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_assertion_killer(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ASSERTION_KILLER, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_assertion_killer_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt63);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return format(NIL, $str_alt64$Forget____A, phrase);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt63);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_assertion_killer_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject successP = uia_trampolines.uia_unassert(v_agenda, cycl_sentence);
                    SubLObject nl_sentence = uia_trampolines.uia_sentence_phrase(v_agenda, cycl_sentence, UNPROVIDED, UNPROVIDED);
                    if (NIL != successP) {
                        {
                            SubLObject message = cconcatenate($str_alt80$I_have_forgotten_the_following_se, nl_sentence);
                            user_interaction_agenda.uia_act_new_comment(v_agenda, message);
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $SUCCESS);
                        }
                    } else {
                        {
                            SubLObject message = cconcatenate($str_alt82$I_have_failed_to_forget_the_follo, nl_sentence);
                            user_interaction_agenda.uia_act_new_acknowledge_message(v_agenda, message);
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $FAILURE);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
            return user_interaction_agenda.uia_generate_next_request(v_agenda);
        }
    }

    public static final SubLObject uiat_assertion_killer_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt27);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_12 = plist;
                        SubLObject current_13 = datum_12;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_13;
                        SubLObject bad = NIL;
                        SubLObject current_14 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_12, $list_alt84);
                            current_14 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_12, $list_alt84);
                            if (NIL == member(current_14, $list_alt85, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_14 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_12, $list_alt84);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_13);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_13);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_assertion_killer(v_agenda, mode, sentence);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T if we can support precision suggestion on this formula.
     */
    public static final SubLObject uia_precision_suggestion_supportedP(SubLObject v_agenda, SubLObject formula) {
        return el_utilities.gafP(formula);
    }

    public static final SubLObject uia_act_new_precision_suggestor(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $PRECISION_SUGGESTOR, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uia_act_new_precision_suggestor_with_facet(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence, SubLObject argnum, SubLObject facet) {
        {
            SubLObject ui = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $PRECISION_SUGGESTOR, list(cycl_sentence), UNPROVIDED);
            SubLObject typecols_for_args = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.ui_state_update(ui, $CREATED_WITH_FOCUS_ON_FACET, facet);
            dictionary.dictionary_enter(typecols_for_args, argnum, list(facet));
            user_interaction_agenda.ui_state_update(ui, $CONSTRAINING_TYPE_COLS, typecols_for_args);
            return ui;
        }
    }

    public static final SubLObject uiat_precision_suggestor_hint(SubLObject interaction) {
        return cconcatenate($str_alt90$Find_the_right_level_of_generalit, uiat_precision_suggestor_sentence_under_construction(interaction));
    }

    public static final SubLObject uiat_precision_suggestor_sentence_under_construction(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject sentence = args.first();
            SubLObject facet = user_interaction_agenda.ui_state_lookup(interaction, $CREATED_WITH_FOCUS_ON_FACET, UNPROVIDED);
            SubLObject phrase = uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
            if (NIL != forts.fort_p(facet)) {
                return cconcatenate(phrase, new SubLObject[]{ $str_alt91$__, uia_trampolines.uia_term_phrase(v_agenda, facet, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str_alt92$_ });
            } else {
                return phrase;
            }
        }
    }

    public static final SubLObject uiat_precision_suggestor_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject argnums_generalized = user_interaction_agenda.ui_state_lookup(interaction, $ARGNUMS_GENERALIZED, NIL);
            SubLObject argnums_specialized = user_interaction_agenda.ui_state_lookup(interaction, $ARGNUMS_SPECIALIZED, NIL);
            SubLObject predicate_specialized = user_interaction_agenda.ui_state_lookup(interaction, $PREDICATE_SPECIALIZED, $FALSE);
            SubLObject typecols_for_args = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINING_TYPE_COLS, $UNKNOWN);
            SubLObject type_strengthened_sentences = uiat_precision_suggestor_get_type_strengthened_sentences(interaction);
            if (typecols_for_args == $UNKNOWN) {
                typecols_for_args = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                user_interaction_agenda.ui_state_update(interaction, $CONSTRAINING_TYPE_COLS, typecols_for_args);
            }
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject sentence = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt97);
                sentence = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, sentence);
                        SubLObject argnums_left_to_generalize = argnums_left(modified_sentence, argnums_generalized);
                        SubLObject generalizeP = (NIL == argnums_left_to_generalize) ? ((SubLObject) ($FALSE)) : $TRUE;
                        SubLObject argnums_left_to_specialize = argnums_left(modified_sentence, argnums_specialized);
                        SubLObject argnum_list_to_work_on = ($TRUE == generalizeP) ? ((SubLObject) (argnums_left_to_generalize)) : argnums_left_to_specialize;
                        SubLObject argnum_to_strengthen = argnum_list_to_work_on.first();
                        if (($TRUE != predicate_specialized) && (NIL != type_strengthened_sentences)) {
                            {
                                SubLObject candidate_sentences = type_strengthened_sentences;
                                SubLObject original_includedP = subl_promotions.memberP(modified_sentence, candidate_sentences, symbol_function(EQUAL), UNPROVIDED);
                                SubLObject action_type = (NIL != original_includedP) ? ((SubLObject) ($SHOW_SENTENCE)) : $SHOW_SENTENCE_CHANGE_REQUIRED;
                                candidate_sentences = remove(modified_sentence, candidate_sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.ui_state_update(interaction, $SUGGESTIONS, candidate_sentences);
                                return user_interaction_agenda.make_ui_request(interaction, action_type, list($SENTENCE, modified_sentence, $SUGGESTIONS, candidate_sentences, $ARGNUM, ZERO_INTEGER));
                            }
                        } else
                            if ((dictionary.dictionary_lookup(typecols_for_args, argnum_to_strengthen, $UNKNOWN) == $UNKNOWN) && (generalizeP == $FALSE)) {
                                return uiat_precision_suggestor_generate_typecol_request(interaction, sentence, argnum_to_strengthen);
                            } else
                                if (NIL != argnum_to_strengthen) {
                                    return uiat_precision_suggestor_generate_arg_request(interaction, sentence, argnum_to_strengthen, generalizeP);
                                } else
                                    if ($TRUE != predicate_specialized) {
                                        {
                                            SubLObject predicates = uia_trampolines.uia_precisify_argument_candidates(v_agenda, modified_sentence, ZERO_INTEGER, $SPECIALIZE, UNPROVIDED, UNPROVIDED);
                                            SubLObject candidate_sentences = uia_appropriate_replacement_sentences(v_agenda, modified_sentence, predicates, ZERO_INTEGER);
                                            SubLObject weak_predicates = (NIL != uima_interface_parameter_declaration.uia_forge_aheadP(v_agenda)) ? ((SubLObject) (NIL)) : uia_trampolines.uia_precisify_argument_candidates(v_agenda, modified_sentence, ZERO_INTEGER, $GENERALIZE, UNPROVIDED, UNPROVIDED);
                                            SubLObject weak_candidate_sentences = uia_appropriate_replacement_sentences(v_agenda, modified_sentence, weak_predicates, ZERO_INTEGER);
                                            user_interaction_agenda.ui_state_update(interaction, $SUGGESTIONS, candidate_sentences);
                                            user_interaction_agenda.ui_state_update(interaction, $WEAK_SUGGESTIONS, weak_candidate_sentences);
                                            if ((NIL != candidate_sentences) || (NIL != weak_candidate_sentences)) {
                                                {
                                                    SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW_SENTENCE, list(new SubLObject[]{ $SENTENCE, modified_sentence, $SUGGESTIONS, candidate_sentences, $WEAK_SUGGESTIONS, weak_candidate_sentences, $ARGNUM, ZERO_INTEGER, $GENERALIZE, generalizeP }));
                                                    return request;
                                                }
                                            } else {
                                                user_interaction_agenda.ui_state_update(interaction, $PREDICATE_SPECIALIZED, $TRUE);
                                                user_interaction_agenda.uia_act_new_quick_message(v_agenda, cconcatenate($str_alt106$The_relationship_expressed_in_the, new SubLObject[]{ uia_trampolines.uia_sentence_phrase(v_agenda, modified_sentence, UNPROVIDED, UNPROVIDED), $str_alt107$_is_sufficiently_strengthened_ }));
                                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                            }
                                        }
                                    } else {
                                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, list(modified_sentence));
                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                    }



                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt97);
                }
            }
        }
        return NIL;
    }

    /**
     * Try to strengthen a sentence using #$typedGenlPreds and #$typedGenlInverse.
     *
     * @unknown - try to do this automatically, only asking the user if there are multiple possibilities
     */
    public static final SubLObject uiat_precision_suggestor_get_type_strengthened_sentences(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject predicate_type_strengthened = user_interaction_agenda.ui_state_lookup(interaction, $PREDICATE_TYPE_STRENGTHENED, $FALSE);
            SubLObject type_strengthened_sentences = NIL;
            if ($TRUE != predicate_type_strengthened) {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt97);
                    sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, sentence);
                            SubLObject stronger_sentences = uia_trampolines.uia_typed_replacement_sentences(v_agenda, modified_sentence, UNPROVIDED);
                            if (NIL != list_utilities.singletonP(stronger_sentences)) {
                                modified_sentence = stronger_sentences.first();
                                user_interaction_agenda.ui_state_update(interaction, $MODIFIED_SENTENCE, modified_sentence);
                                user_interaction_agenda.ui_state_update(interaction, $PREDICATE_TYPE_STRENGTHENED, $TRUE);
                            } else
                                if (NIL == stronger_sentences) {
                                    user_interaction_agenda.ui_state_update(interaction, $PREDICATE_TYPE_STRENGTHENED, $TRUE);
                                } else {
                                    type_strengthened_sentences = stronger_sentences;
                                }

                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt97);
                    }
                }
            }
            return type_strengthened_sentences;
        }
    }

    public static final SubLObject uiat_precision_suggestor_generate_typecol_request(SubLObject interaction, SubLObject sentence, SubLObject argnum_to_strengthen) {
        {
            SubLObject original_arg = cycl_utilities.sentence_arg(sentence, argnum_to_strengthen, UNPROVIDED);
            SubLObject typecols = uia_trampolines.uia_typed_specializations_for_term(user_interaction_agenda.ui_agenda(interaction), original_arg, UNPROVIDED);
            SubLObject typecols_for_args = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINING_TYPE_COLS, UNPROVIDED);
            if (NIL == typecols) {
                if (NIL == dictionary.dictionary_lookup(typecols_for_args, argnum_to_strengthen, NIL)) {
                    dictionary.dictionary_enter(typecols_for_args, argnum_to_strengthen, NIL);
                }
                user_interaction_agenda.uia_act_new_quick_message(user_interaction_agenda.ui_agenda(interaction), cconcatenate($str_alt109$Preparing_to_strengthen_the_entit, new SubLObject[]{ uiat_precision_suggestor_sentence_under_construction(interaction), $str_alt110$_ }));
                return user_interaction_agenda.uia_generate_next_request(user_interaction_agenda.ui_agenda(interaction));
            } else {
                return user_interaction_agenda.make_ui_request(interaction, $SHOW_FACETS, list($TYPE_COLLECTIONS, typecols, $SENTENCE, sentence, $ARGNUM, argnum_to_strengthen));
            }
        }
    }

    public static final SubLObject uiat_precision_suggestor_generate_arg_request(SubLObject interaction, SubLObject sentence, SubLObject argnum_to_strengthen, SubLObject generalizeP) {
        {
            SubLObject slot_to_update = (generalizeP == $TRUE) ? ((SubLObject) ($ARGNUMS_GENERALIZED)) : $ARGNUMS_SPECIALIZED;
            SubLObject argnums_for_slot = (generalizeP == $TRUE) ? ((SubLObject) (user_interaction_agenda.ui_state_lookup(interaction, $ARGNUMS_GENERALIZED, NIL))) : user_interaction_agenda.ui_state_lookup(interaction, $ARGNUMS_SPECIALIZED, NIL);
            SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, sentence);
            SubLObject current_term = cycl_utilities.formula_arg(modified_sentence, argnum_to_strengthen, UNPROVIDED);
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject suggestions = uiat_precision_suggestor_suggestions(interaction, sentence, argnum_to_strengthen, generalizeP);
            SubLObject typecols_for_args = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINING_TYPE_COLS, UNPROVIDED);
            SubLObject faceting_type_cols = (NIL != dictionary.dictionary_p(typecols_for_args)) ? ((SubLObject) (dictionary.dictionary_lookup(typecols_for_args, argnum_to_strengthen, NIL))) : NIL;
            SubLObject faceting_type_col = faceting_type_cols.first();
            SubLObject show_sentencesP = uiat_precision_suggestor_show_sentencesP(modified_sentence, argnum_to_strengthen);
            if (NIL == suggestions) {
                if (generalizeP == $TRUE) {
                    {
                        SubLObject new_argnums_for_slot = cons(argnum_to_strengthen, argnums_for_slot);
                        user_interaction_agenda.ui_state_update(interaction, slot_to_update, new_argnums_for_slot);
                    }
                } else {
                    uiat_precision_suggestor_update_typecolXargnum(interaction, argnum_to_strengthen);
                }
                user_interaction_agenda.uia_act_new_quick_message(v_agenda, cconcatenate($str_alt113$No_interesting_ways_to_strengthen, uia_trampolines.uia_term_phrase(v_agenda, current_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                return user_interaction_agenda.uia_generate_next_request(v_agenda);
            } else
                if (NIL != show_sentencesP) {
                    {
                        SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW_SENTENCE, list(new SubLObject[]{ $SENTENCE, modified_sentence, $GENERALIZE, generalizeP, $SUGGESTIONS, suggestions, $FACETING_TYPE_COL, faceting_type_col, $ARGNUM, argnum_to_strengthen }));
                        return request;
                    }
                } else {
                    {
                        SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW_ARG, list(new SubLObject[]{ $SENTENCE, modified_sentence, $GENERALIZE, generalizeP, $SUGGESTIONS, suggestions, $FACETING_TYPE_COL, faceting_type_col, $ARGNUM, argnum_to_strengthen }));
                        return request;
                    }
                }

        }
    }

    public static final SubLObject uiat_precision_suggestor_suggestions(SubLObject interaction, SubLObject sentence, SubLObject argnum_to_strengthen, SubLObject generalizeP) {
        {
            SubLObject suggestions = user_interaction_agenda.ui_state_lookup(interaction, $SUGGESTIONS, NIL);
            if (NIL == suggestions) {
                {
                    SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, sentence);
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    SubLObject direction = (generalizeP == $TRUE) ? ((SubLObject) ($GENERALIZE)) : $SPECIALIZE;
                    SubLObject show_sentencesP = uiat_precision_suggestor_show_sentencesP(modified_sentence, argnum_to_strengthen);
                    SubLObject typecols_for_args = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINING_TYPE_COLS, UNPROVIDED);
                    SubLObject current_type_col = dictionary.dictionary_lookup(typecols_for_args, argnum_to_strengthen, UNPROVIDED).first();
                    suggestions = uia_trampolines.uia_precisify_argument_candidates(v_agenda, modified_sentence, argnum_to_strengthen, direction, current_type_col, UNPROVIDED);
                    if (NIL != show_sentencesP) {
                        suggestions = uia_appropriate_replacement_sentences(v_agenda, modified_sentence, suggestions, argnum_to_strengthen);
                    }
                    user_interaction_agenda.ui_state_update(interaction, $SUGGESTIONS, suggestions);
                    user_interaction_agenda.ui_state_update(interaction, $kw116$SHOW_SENTENCES_, show_sentencesP);
                }
            }
            return suggestions;
        }
    }

    public static final SubLObject uiat_precision_suggestor_show_sentencesP(SubLObject sentence, SubLObject argnum_to_strengthen) {
        return makeBoolean((NIL != fort_types_interface.predicate_in_any_mtP(cycl_utilities.atomic_sentence_arg(sentence, argnum_to_strengthen, UNPROVIDED))) && (NIL != isa.isa_in_any_mtP(cycl_utilities.atomic_sentence_arg0(sentence), $$RuleMacroPredicate)));
    }

    /**
     *
     *
     * @return LISTP of appropriate sentences formed by substituting each of NEW-ARGS
    for the argARG-NUM of ORIGINAL-SENTENCE.
     */
    public static final SubLObject uia_appropriate_replacement_sentences(SubLObject v_agenda, SubLObject original_sentence, SubLObject new_args, SubLObject arg_num) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = new_args;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                {
                    SubLObject new_sentence = el_utilities.replace_formula_arg(arg_num, pred, original_sentence);
                    if (NIL == uia_trampolines.uia_inappropriate_sentenceP(v_agenda, new_sentence, UNPROVIDED)) {
                        ans = cons(new_sentence, ans);
                    }
                }
            }
            return nreverse(ans);
        }
    }

    public static final SubLObject uiat_is_faceted_precision_suggestion_sentenceP(SubLObject sentence) {
        return makeBoolean((sentence.first() == $FACETED) && (NIL != list_utilities.lengthE(sentence, FOUR_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject uiat_faceted_precision_suggestion_sentence_get_sentence(SubLObject sentence) {
        return second(sentence);
    }

    public static final SubLObject uiat_faceted_precision_suggestion_sentence_get_argnum(SubLObject sentence) {
        return third(sentence);
    }

    public static final SubLObject uiat_faceted_precision_suggestion_sentence_get_facet(SubLObject sentence) {
        return fourth(sentence);
    }

    public static final SubLObject uiat_is_faceted_precision_suggestion_result_listP(SubLObject sentence_list) {
        return list_utilities.list_of_type_p($sym119$UIAT_IS_FACETED_PRECISION_SUGGESTION_SENTENCE_, sentence_list);
    }

    public static final SubLObject uiat_precision_suggestor_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt27);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_15 = plist;
                        SubLObject current_16 = datum_15;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_16;
                        SubLObject bad = NIL;
                        SubLObject current_17 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_15, $list_alt84);
                            current_17 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_15, $list_alt84);
                            if (NIL == member(current_17, $list_alt85, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_17 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_15, $list_alt84);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_16);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_16);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_precision_suggestor(v_agenda, mode, sentence);
                        }
                    }
                } else
                    if (pcase_var.eql($CONSTRAIN_TO_FACETS)) {
                        {
                            SubLObject datum_18 = plist;
                            SubLObject current_19 = datum_18;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_19;
                            SubLObject bad = NIL;
                            SubLObject current_20 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_18, $list_alt121);
                                current_20 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_18, $list_alt121);
                                if (NIL == member(current_20, $list_alt122, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_20 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_18, $list_alt121);
                            }
                            {
                                SubLObject facets_tail = property_list_member($FACETS, current_19);
                                SubLObject v_facets = (NIL != facets_tail) ? ((SubLObject) (cadr(facets_tail))) : NIL;
                                SubLObject argnum_tail = property_list_member($ARGNUM, current_19);
                                SubLObject argnum = (NIL != argnum_tail) ? ((SubLObject) (cadr(argnum_tail))) : NIL;
                                if (NIL == v_facets) {
                                    {
                                        SubLObject typecols_for_args = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINING_TYPE_COLS, UNPROVIDED);
                                        dictionary.dictionary_enter(typecols_for_args, argnum, NIL);
                                    }
                                } else {
                                    {
                                        SubLObject results = NIL;
                                        SubLObject datum_21 = user_interaction_agenda.ui_args(interaction);
                                        SubLObject current_22 = datum_21;
                                        SubLObject original_sentence = NIL;
                                        destructuring_bind_must_consp(current_22, datum_21, $list_alt124);
                                        original_sentence = current_22.first();
                                        current_22 = current_22.rest();
                                        if (NIL == current_22) {
                                            {
                                                SubLObject sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, original_sentence);
                                                SubLObject cdolist_list_var = v_facets;
                                                SubLObject facet = NIL;
                                                for (facet = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet = cdolist_list_var.first()) {
                                                    results = cons(list($FACETED, sentence, argnum, facet), results);
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_21, $list_alt124);
                                        }
                                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, results);
                                    }
                                }
                            }
                        }
                    } else
                        if (pcase_var.eql($ANSWER)) {
                            {
                                SubLObject datum_23 = plist;
                                SubLObject current_24 = datum_23;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_24;
                                SubLObject bad = NIL;
                                SubLObject current_25 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_23, $list_alt126);
                                    current_25 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_23, $list_alt126);
                                    if (NIL == member(current_25, $list_alt127, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_25 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_23, $list_alt126);
                                }
                                {
                                    SubLObject generalize_tail = property_list_member($GENERALIZE, current_24);
                                    SubLObject generalize = (NIL != generalize_tail) ? ((SubLObject) (cadr(generalize_tail))) : NIL;
                                    SubLObject choices_tail = property_list_member($CHOICES, current_24);
                                    SubLObject choices = (NIL != choices_tail) ? ((SubLObject) (cadr(choices_tail))) : NIL;
                                    SubLObject argnum_tail = property_list_member($ARGNUM, current_24);
                                    SubLObject argnum = (NIL != argnum_tail) ? ((SubLObject) (cadr(argnum_tail))) : NIL;
                                    SubLObject sentence_or_arg_tail = property_list_member($SENTENCE_OR_ARG, current_24);
                                    SubLObject sentence_or_arg = (NIL != sentence_or_arg_tail) ? ((SubLObject) (cadr(sentence_or_arg_tail))) : NIL;
                                    SubLObject arg_done_tail = property_list_member($ARG_DONE, current_24);
                                    SubLObject arg_done = (NIL != arg_done_tail) ? ((SubLObject) (cadr(arg_done_tail))) : NIL;
                                    if ($YES == arg_done) {
                                        user_interaction_agenda.ui_state_clear(interaction, $SUGGESTIONS);
                                        if ($TRUE == generalize) {
                                            {
                                                SubLObject argnums_generalized = user_interaction_agenda.ui_state_lookup(interaction, $ARGNUMS_GENERALIZED, NIL);
                                                SubLObject new_argnums_generalized = cons(argnum, argnums_generalized);
                                                user_interaction_agenda.ui_state_update(interaction, $ARGNUMS_GENERALIZED, new_argnums_generalized);
                                            }
                                        } else {
                                            if (argnum.isZero()) {
                                                user_interaction_agenda.ui_state_update(interaction, $PREDICATE_SPECIALIZED, $TRUE);
                                            } else {
                                                uiat_precision_suggestor_update_typecolXargnum(interaction, argnum);
                                            }
                                        }
                                    }
                                    if ($$$none.equal(choices)) {
                                    } else
                                        if (choices.isCons()) {
                                            user_interaction_agenda.ui_state_update(interaction, $PREDICATE_TYPE_STRENGTHENED, $TRUE);
                                            {
                                                SubLObject args = user_interaction_agenda.ui_args(interaction);
                                                SubLObject result = user_interaction_agenda.ui_result(interaction);
                                                SubLObject cdolist_list_var = choices;
                                                SubLObject pair = NIL;
                                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum_26 = pair;
                                                        SubLObject current_27 = datum_26;
                                                        SubLObject choice = NIL;
                                                        SubLObject weaken = NIL;
                                                        destructuring_bind_must_consp(current_27, datum_26, $list_alt132);
                                                        choice = current_27.first();
                                                        current_27 = current_27.rest();
                                                        destructuring_bind_must_consp(current_27, datum_26, $list_alt132);
                                                        weaken = current_27.first();
                                                        current_27 = current_27.rest();
                                                        if (NIL == current_27) {
                                                            {
                                                                SubLObject datum_28 = args;
                                                                SubLObject current_29 = datum_28;
                                                                SubLObject sentence = NIL;
                                                                destructuring_bind_must_consp(current_29, datum_28, $list_alt97);
                                                                sentence = current_29.first();
                                                                current_29 = current_29.rest();
                                                                if (NIL == current_29) {
                                                                    {
                                                                        SubLObject modified_sentence = user_interaction_agenda.ui_state_lookup(interaction, $MODIFIED_SENTENCE, sentence);
                                                                        SubLObject suggestions = user_interaction_agenda.ui_state_lookup(interaction, $SUGGESTIONS, UNPROVIDED);
                                                                        SubLObject weak_suggestions = user_interaction_agenda.ui_state_lookup(interaction, $WEAK_SUGGESTIONS, UNPROVIDED);
                                                                        SubLObject choice_list = ($TRUE == weaken) ? ((SubLObject) (weak_suggestions)) : suggestions;
                                                                        SubLObject chosen_term = nth(choice, choice_list);
                                                                        SubLObject chosen_sentence = (sentence_or_arg == $SENTENCE) ? ((SubLObject) (chosen_term)) : el_utilities.replace_formula_arg(argnum, chosen_term, modified_sentence);
                                                                        result = cons(chosen_sentence, result);
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum_28, $list_alt97);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum_26, $list_alt132);
                                                        }
                                                    }
                                                }
                                                if (NIL != list_utilities.singletonP(result)) {
                                                    user_interaction_agenda.ui_state_clear(interaction, $SUGGESTIONS);
                                                    user_interaction_agenda.ui_state_update(interaction, $MODIFIED_SENTENCE, result.first());
                                                } else {
                                                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, result);
                                                }
                                            }
                                        }

                                }
                            }
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject uiat_precision_suggestor_update_typecolXargnum(SubLObject interaction, SubLObject argnum) {
        {
            SubLObject typecols_for_args = user_interaction_agenda.ui_state_lookup(interaction, $CONSTRAINING_TYPE_COLS, UNPROVIDED);
            SubLObject remaining_facets = dictionary.dictionary_lookup(typecols_for_args, argnum, NIL);
            remaining_facets = remaining_facets.rest();
            dictionary.dictionary_enter(typecols_for_args, argnum, remaining_facets);
            if (NIL == remaining_facets) {
                {
                    SubLObject argnums_specialized = user_interaction_agenda.ui_state_lookup(interaction, $ARGNUMS_SPECIALIZED, NIL);
                    SubLObject new_argnums_specialized = cons(argnum, argnums_specialized);
                    user_interaction_agenda.ui_state_update(interaction, $ARGNUMS_SPECIALIZED, new_argnums_specialized);
                }
            }
        }
        return interaction;
    }

    public static final SubLObject argnums_left(SubLObject sentence, SubLObject argnums_done) {
        {
            SubLObject result = NIL;
            SubLObject len = el_utilities.formula_length(sentence, UNPROVIDED);
            SubLObject n = NIL;
            for (n = ZERO_INTEGER; n.numL(len); n = add(n, ONE_INTEGER)) {
                if (n.numG(ZERO_INTEGER)) {
                    if (NIL == subl_promotions.memberP(n, argnums_done, UNPROVIDED, UNPROVIDED)) {
                        result = cons(n, result);
                    }
                }
            }
            result = Sort.sort(result, symbol_function($sym133$_), UNPROVIDED);
            return result;
        }
    }

    public static final SubLObject uia_act_new_assertion_validator(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ASSERTION_VALIDATOR, list(cycl_sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_assertion_validator_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt97);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt136$Validate_Fact___A, uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list_alt97);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_assertion_validator_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            cycl_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject well_formed = user_interaction_agenda.ui_state_lookup(interaction, $WELL_FORMED, $UNDETERMINED);
                    SubLObject free_of_contradiction = user_interaction_agenda.ui_state_lookup(interaction, $FREE_OF_CONTRADICTION, $UNDETERMINED);
                    SubLObject free_of_redundancy = user_interaction_agenda.ui_state_lookup(interaction, $FREE_OF_REDUNDANCY, $UNDETERMINED);
                    if ($TRUE != well_formed) {
                        {
                            SubLObject wff_checker = uia_act_new_wff_checker(v_agenda, $REQUIRED, cycl_sentence, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, wff_checker);
                        }
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    } else
                        if ($TRUE != free_of_contradiction) {
                            {
                                SubLObject contradiction_finder = uia_act_new_contradiction_finder(v_agenda, $REQUIRED, cycl_sentence);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, contradiction_finder);
                            }
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        } else
                            if ($TRUE != free_of_redundancy) {
                                {
                                    SubLObject redundancy_detector = uia_act_new_redundancy_detector(v_agenda, $REQUIRED, cycl_sentence);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, redundancy_detector);
                                }
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            } else {
                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, $OK);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }


                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_assertion_validator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($WFF_CHECKER)) {
                {
                    SubLObject pcase_var_30 = user_interaction_agenda.ui_result(child);
                    if (pcase_var_30.eql($OK)) {
                        user_interaction_agenda.ui_state_update(parent, $WELL_FORMED, $TRUE);
                    } else
                        if (pcase_var_30.eql($ILL_FORMED)) {
                            user_interaction_agenda.uia_act_complete(v_agenda, parent, user_interaction_agenda.ui_result(child));
                        }

                }
            } else
                if (pcase_var.eql($CONTRADICTION_FINDER)) {
                    {
                        SubLObject pcase_var_31 = user_interaction_agenda.ui_result(child);
                        if (pcase_var_31.eql($OK)) {
                            user_interaction_agenda.ui_state_update(parent, $FREE_OF_CONTRADICTION, $TRUE);
                        } else
                            if (pcase_var_31.eql($CONTRADICTION)) {
                                user_interaction_agenda.uia_act_complete(v_agenda, parent, user_interaction_agenda.ui_result(child));
                            }

                    }
                } else
                    if (pcase_var.eql($REDUNDANCY_DETECTOR)) {
                        {
                            SubLObject pcase_var_32 = user_interaction_agenda.ui_result(child);
                            if (pcase_var_32.eql($OK)) {
                                user_interaction_agenda.ui_state_update(parent, $FREE_OF_REDUNDANCY, $TRUE);
                            } else
                                if (pcase_var_32.eql($REDUNDANT)) {
                                    user_interaction_agenda.uia_act_complete(v_agenda, parent, user_interaction_agenda.ui_result(child));
                                }

                        }
                    }


        }
        return parent;
    }

    public static final SubLObject uia_act_new_coa_evaluator(SubLObject v_agenda, SubLObject mode, SubLObject course_of_action) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $COA_EVALUATOR, list(course_of_action), UNPROVIDED);
    }

    public static final SubLObject uiat_coa_evaluator_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject course_of_action = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt143);
            course_of_action = current.first();
            current = current.rest();
            {
                SubLObject toss = current;
                return cconcatenate($str_alt144$Evaluate_Course_of_Action__, uia_trampolines.uia_term_phrase(v_agenda, course_of_action, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
    }

    public static final SubLObject uiat_coaeval_get_course_of_action(SubLObject interaction) {
        return user_interaction_agenda.ui_args(interaction).first();
    }

    public static final SubLObject uiat_coaeval_get_matrix_results(SubLObject interaction) {
        return user_interaction_agenda.ui_state_lookup(interaction, $MATRIX_RESULTS, $UNKNOWN);
    }

    public static final SubLObject uiat_coaeval_set_matrix_results(SubLObject interaction, SubLObject matrix_results) {
        return user_interaction_agenda.ui_state_update(interaction, $MATRIX_RESULTS, matrix_results);
    }

    public static final SubLObject uiat_coaeval_clear_matrix_results(SubLObject interaction) {
        return user_interaction_agenda.ui_state_clear(interaction, $MATRIX_RESULTS);
    }

    public static final SubLObject uiat_coa_evaluator_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject course_of_action = uiat_coaeval_get_course_of_action(interaction);
            SubLObject evaluation_matrix = uiat_coaeval_get_evaluation_matrix(interaction, UNPROVIDED);
            SubLObject matrix_results = uiat_coaeval_get_matrix_results(interaction);
            if (evaluation_matrix == $UNKNOWN) {
                evaluation_matrix = uiat_coaeval_compute_evaluation_matrix(interaction, course_of_action);
                return uiat_coaeval_make_ui_request($SHOW, interaction, evaluation_matrix);
            } else
                if (NIL != dictionary.dictionary_p(matrix_results)) {
                    return uiat_coaeval_make_ui_request($SHOW_RESULTS, interaction, matrix_results);
                } else {
                    return uiat_coaeval_make_ui_request($SHOW, interaction, evaluation_matrix);
                }

        }
    }

    public static final SubLObject uiat_coaeval_make_ui_request(SubLObject action, SubLObject interaction, SubLObject evaluation_matrix) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject course_of_action = uiat_coaeval_get_course_of_action(interaction);
            SubLObject dimensions = uia_coa_utilities.uia_get_coa_evaluation_dimensions(v_agenda, course_of_action, UNPROVIDED);
            SubLObject attributes = uia_coa_utilities.uia_get_coa_evaluation_atribute_values(v_agenda, course_of_action, UNPROVIDED);
            SubLObject dimension_classification = uiat_coaeval_get_dimension_classification(v_agenda, dimensions);
            SubLObject classification_ordering = uiat_coaeval_get_classification_ordering(v_agenda);
            return user_interaction_agenda.make_ui_request(interaction, action, list(new SubLObject[]{ $DIMENSIONS, dimensions, $ATTRIBUTES, attributes, $DIMENSION_CLASSIFICATION, dimension_classification, $CLASSIFICATION_ORDERING, classification_ordering, $MATRIX, evaluation_matrix }));
        }
    }

    // deflexical
    private static final SubLSymbol $uiat_coaeval_default_criteria_title$ = makeSymbol("*UIAT-COAEVAL-DEFAULT-CRITERIA-TITLE*");

    public static final SubLObject uiat_coaeval_get_dimension_classification(SubLObject v_agenda, SubLObject dimensions) {
        {
            SubLObject dimclass = dictionary.new_dictionary(EQUALP, UNPROVIDED);
            dictionary.dictionary_enter(dimclass, $uiat_coaeval_default_criteria_title$.getGlobalValue(), dimensions);
            return dimclass;
        }
    }

    public static final SubLObject uiat_coaeval_get_classification_ordering(SubLObject v_agenda) {
        return list($uiat_coaeval_default_criteria_title$.getGlobalValue());
    }

    public static final SubLObject uiat_coa_evaluator_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt27);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($EDIT_RULE)) {
                    {
                        SubLObject datum_33 = plist;
                        SubLObject current_34 = datum_33;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_34;
                        SubLObject bad = NIL;
                        SubLObject current_35 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_33, $list_alt154);
                            current_35 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_33, $list_alt154);
                            if (NIL == member(current_35, $list_alt155, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_35 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_33, $list_alt154);
                        }
                        {
                            SubLObject assertion_tail = property_list_member($ASSERTION, current_34);
                            SubLObject assertion = (NIL != assertion_tail) ? ((SubLObject) (cadr(assertion_tail))) : NIL;
                            SubLObject child = cb_uia_tools_introduction.uia_act_new_rule_constructor(v_agenda, NIL, NIL, $REQUIRED, uncanonicalizer.assertion_el_formula(assertion));
                            uiat_coaeval_record_child_causation(child, $EDIT_RULE, plist);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                } else
                    if (pcase_var.eql($TEST_RULE)) {
                        {
                            SubLObject datum_36 = plist;
                            SubLObject current_37 = datum_36;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_37;
                            SubLObject bad = NIL;
                            SubLObject current_38 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_36, $list_alt158);
                                current_38 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_36, $list_alt158);
                                if (NIL == member(current_38, $list_alt159, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_38 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_36, $list_alt158);
                            }
                            {
                                SubLObject assertion_tail = property_list_member($ASSERTION, current_37);
                                SubLObject assertion = (NIL != assertion_tail) ? ((SubLObject) (cadr(assertion_tail))) : NIL;
                                SubLObject dimension_tail = property_list_member($DIMENSION, current_37);
                                SubLObject dimension = (NIL != dimension_tail) ? ((SubLObject) (cadr(dimension_tail))) : NIL;
                                SubLObject attribute_tail = property_list_member($ATTRIBUTE, current_37);
                                SubLObject attribute = (NIL != attribute_tail) ? ((SubLObject) (cadr(attribute_tail))) : NIL;
                                SubLObject course_of_action = uiat_coaeval_get_course_of_action(interaction);
                                SubLObject consequent = uiat_coaeval_get_query_formula(interaction, dimension, attribute, course_of_action);
                                SubLObject params = uiat_coaeval_generate_sf_params(interaction, dimension, attribute);
                                SubLObject phrase = uia_trampolines.uia_query_phrase(v_agenda, consequent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject child = cb_uia_tools_review_and_testing.uia_act_new_solution_finder(v_agenda, phrase, consequent, $REQUIRED, params);
                                uiat_coaeval_record_child_causation(child, $TEST_RULE, plist);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }
                        }
                    } else
                        if (pcase_var.eql($ADD_RULE_TO_CELL)) {
                            {
                                SubLObject datum_39 = plist;
                                SubLObject current_40 = datum_39;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_40;
                                SubLObject bad = NIL;
                                SubLObject current_41 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_39, $list_alt163);
                                    current_41 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_39, $list_alt163);
                                    if (NIL == member(current_41, $list_alt164, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_41 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_39, $list_alt163);
                                }
                                {
                                    SubLObject dimension_tail = property_list_member($DIMENSION, current_40);
                                    SubLObject dimension = (NIL != dimension_tail) ? ((SubLObject) (cadr(dimension_tail))) : NIL;
                                    SubLObject attribute_tail = property_list_member($ATTRIBUTE, current_40);
                                    SubLObject attribute = (NIL != attribute_tail) ? ((SubLObject) (cadr(attribute_tail))) : NIL;
                                    SubLObject else_clause = uiat_coaeval_new_evaluation_consequent(v_agenda, dimension, attribute);
                                    SubLObject child = cb_uia_tools_introduction.uia_act_new_rule_constructor_for_consequent(v_agenda, else_clause, user_interaction_agenda.ui_mode(interaction));
                                    uiat_coaeval_record_child_causation(child, $ADD_RULE, plist);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                }
                            }
                        } else
                            if (pcase_var.eql($EVALUATE_COA)) {
                                uiat_coaeval_launch_matrix_evaluation(interaction, uiat_coaeval_get_course_of_action(interaction));
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            } else
                                if (pcase_var.eql($FORGET_COA_RESULTS)) {
                                    uiat_coaeval_clear_matrix_results(interaction);
                                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                } else
                                    if (pcase_var.eql($DONE)) {
                                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                    } else {
                                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                                    }





            }
        }
    }

    public static final SubLObject uiat_coa_evaluator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($THINKING)) {
                {
                    SubLObject result = user_interaction_agenda.ui_state_lookup(child, $MATRIX_RESULTS, UNPROVIDED);
                    uiat_coaeval_set_matrix_results(parent, result);
                }
            } else
                if (pcase_var.eql($RULE_CONSTRUCTOR)) {
                    uiat_coaeval_compute_evaluation_matrix(parent, uiat_coaeval_get_course_of_action(parent));
                } else
                    if (pcase_var.eql($SOLUTION_FINDER)) {
                    } else {
                        Errors.warn($str_alt171$COA_Evaluator_does_not_handle_chi, child);
                    }


        }
        return parent;
    }

    public static final SubLObject uiat_coaeval_extract_consequent_from_assertion(SubLObject assertion) {
        return cycl_utilities.formula_arg2(uncanonicalizer.assertion_el_formula(assertion), UNPROVIDED);
    }

    public static final SubLObject uiat_coaeval_new_evaluation_consequent(SubLObject v_agenda, SubLObject dimension, SubLObject attribute) {
        return uia_coa_utilities.uia_generate_new_coa_evaluation_consequent(v_agenda, dimension, attribute, UNPROVIDED);
    }

    public static final SubLObject uiat_coaeval_record_child_causation(SubLObject child, SubLObject cause, SubLObject v_arguments) {
        user_interaction_agenda.ui_state_update(child, $CAUSED_BY, cause);
        user_interaction_agenda.ui_state_update(child, $CAUSAL_ARGS, v_arguments);
        return child;
    }

    public static final SubLObject uiat_coaeval_retrieve_child_causation(SubLObject child) {
        {
            SubLObject cause = user_interaction_agenda.ui_state_lookup(child, $CAUSED_BY, UNPROVIDED);
            SubLObject v_arguments = user_interaction_agenda.ui_state_lookup(child, $CAUSAL_ARGS, UNPROVIDED);
            return values(cause, v_arguments);
        }
    }

    public static final SubLObject uiat_coaeval_get_evaluation_matrix(SubLObject interaction, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNKNOWN;
        }
        return user_interaction_agenda.ui_state_lookup(interaction, $EVALUATION_MATRIX, v_default);
    }

    public static final SubLObject uiat_coaeval_set_evaluation_matrix(SubLObject interaction, SubLObject evalmat) {
        return user_interaction_agenda.ui_state_update(interaction, $EVALUATION_MATRIX, evalmat);
    }

    public static final SubLObject uiat_coaeval_compute_evaluation_matrix(SubLObject interaction, SubLObject course_of_action) {
        {
            SubLObject evaluation_matrix = uia_coa_utilities.uia_compile_coa_evaluation_matrix(user_interaction_agenda.ui_agenda(interaction), course_of_action, UNPROVIDED);
            uiat_coaeval_set_evaluation_matrix(interaction, evaluation_matrix);
            return evaluation_matrix;
        }
    }

    public static final SubLObject uiat_coaeval_launch_matrix_evaluation(SubLObject interaction, SubLObject course_of_action) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject evaluation_matrix = uiat_coaeval_get_evaluation_matrix(interaction, UNPROVIDED);
            SubLObject dimensions = uia_coa_utilities.uia_get_coa_evaluation_dimensions(v_agenda, course_of_action, UNPROVIDED);
            SubLObject attributes = uia_coa_utilities.uia_get_coa_evaluation_atribute_values(v_agenda, course_of_action, UNPROVIDED);
            SubLObject child = uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_COAEVAL_RUN_EVALUATION_MATRIX, list(course_of_action, evaluation_matrix, dimensions, attributes), UNPROVIDED, UNPROVIDED);
            return child;
        }
    }

    public static final SubLObject uiat_coaeval_run_evaluation_matrix(SubLObject course_of_action, SubLObject evaluation_matrix, SubLObject dimensions, SubLObject attributes) {
        {
            SubLObject interaction = uia_tools_basic.uiat_thinking_interaction();
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject coa_phrase = uia_trampolines.uia_term_phrase(v_agenda, course_of_action, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject coa_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            SubLObject matrix_results = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            user_interaction_agenda.ui_state_update(interaction, $COURSE_OF_ACTION, course_of_action);
            {
                SubLObject cdolist_list_var = dimensions;
                SubLObject dimension = NIL;
                for (dimension = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dimension = cdolist_list_var.first()) {
                    {
                        SubLObject matrix_row = dictionary.dictionary_lookup(evaluation_matrix, dimension, UNPROVIDED);
                        SubLObject row_results = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                        if (NIL == dictionary.dictionary_p(matrix_row)) {
                            Errors.error($str_alt177$invalid_evaluation_matrix____cann);
                        }
                        {
                            SubLObject cdolist_list_var_42 = attributes;
                            SubLObject attribute = NIL;
                            for (attribute = cdolist_list_var_42.first(); NIL != cdolist_list_var_42; cdolist_list_var_42 = cdolist_list_var_42.rest() , attribute = cdolist_list_var_42.first()) {
                                {
                                    SubLObject query_formula = uiat_coaeval_get_query_formula(interaction, dimension, attribute, UNPROVIDED);
                                    SubLObject phrase = uia_trampolines.uia_query_phrase(v_agenda, query_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject message = cconcatenate($str_alt178$Evaluating_COA_, new SubLObject[]{ coa_phrase, $str_alt179$__, phrase });
                                    uia_tools_basic.uiat_thinking_note_progress_message(message, UNPROVIDED);
                                    {
                                        SubLObject backchains = uiat_coaeval_get_backchains(interaction, dimension, attribute);
                                        SubLObject time = uiat_coaeval_get_time(interaction, dimension, attribute);
                                        SubLObject results = NIL;
                                        SubLObject cdolist_list_var_43 = rkf_query_utilities.rkf_query(query_formula, coa_mt, backchains, time, UNPROVIDED, UNPROVIDED);
                                        SubLObject result = NIL;
                                        for (result = cdolist_list_var_43.first(); NIL != cdolist_list_var_43; cdolist_list_var_43 = cdolist_list_var_43.rest() , result = cdolist_list_var_43.first()) {
                                            {
                                                SubLObject datum = result;
                                                SubLObject current = datum;
                                                SubLObject v_bindings = NIL;
                                                SubLObject justification = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt180);
                                                v_bindings = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt180);
                                                justification = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    {
                                                        SubLObject hl_support_justification = arguments.hl_justification_to_hl_support_justification(justification);
                                                        results = cons(list(v_bindings, hl_support_justification), results);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt180);
                                                }
                                            }
                                        }
                                        dictionary.dictionary_enter(row_results, attribute, results);
                                    }
                                }
                            }
                        }
                        dictionary.dictionary_enter(matrix_results, dimension, row_results);
                    }
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $MATRIX_RESULTS, matrix_results);
            return interaction;
        }
    }

    /**
     *
     *
     * @unknown this should go to the test suite code
     */
    public static final SubLObject uiat_coaeval_get_query_formula(SubLObject interaction, SubLObject dimension, SubLObject attribute, SubLObject coa) {
        if (coa == UNPROVIDED) {
            coa = NIL;
        }
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject the_coa = user_interaction_agenda.ui_state_lookup(interaction, $COURSE_OF_ACTION, coa);
            return uia_coa_utilities.uia_generate_new_coa_evaluation_consequent(v_agenda, dimension, attribute, the_coa);
        }
    }

    // deflexical
    private static final SubLSymbol $uiat_coaeval_default_backchains$ = makeSymbol("*UIAT-COAEVAL-DEFAULT-BACKCHAINS*");

    // deflexical
    private static final SubLSymbol $uiat_coaeval_default_time$ = makeSymbol("*UIAT-COAEVAL-DEFAULT-TIME*");

    /**
     *
     *
     * @unknown this should go to the test suite code
     */
    public static final SubLObject uiat_coaeval_get_backchains(SubLObject interaction, SubLObject dimension, SubLObject attribute) {
        return $uiat_coaeval_default_backchains$.getGlobalValue();
    }

    /**
     *
     *
     * @unknown this should go to the test suite code
     */
    public static final SubLObject uiat_coaeval_get_time(SubLObject interaction, SubLObject dimension, SubLObject attribute) {
        return $uiat_coaeval_default_time$.getGlobalValue();
    }

    public static final SubLObject uiat_coaeval_generate_sf_params(SubLObject interaction, SubLObject dimension, SubLObject attribute) {
        {
            SubLObject backchain = $uiat_coaeval_default_backchains$.getGlobalValue();
            SubLObject number = NIL;
            SubLObject time = $uiat_coaeval_default_time$.getGlobalValue();
            SubLObject depth = TWENTY_INTEGER;
            return list(backchain, number, time, depth);
        }
    }

    public static final SubLObject declare_uia_tools_misc_file() {
        declareFunction("uia_act_new_wff_checker", "UIA-ACT-NEW-WFF-CHECKER", 3, 1, false);
        declareFunction("uiat_wff_checker_hint", "UIAT-WFF-CHECKER-HINT", 1, 0, false);
        declareFunction("uiat_wff_checker_generate_request", "UIAT-WFF-CHECKER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_all_is_not_wff", "UIAT-ALL-IS-NOT-WFF", 3, 0, false);
        declareFunction("uiat_wff_checker_done", "UIAT-WFF-CHECKER-DONE", 1, 0, false);
        declareFunction("uiat_wff_checker_handle_reply", "UIAT-WFF-CHECKER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_wff_checker_child_completed", "UIAT-WFF-CHECKER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uia_act_new_contradiction_finder", "UIA-ACT-NEW-CONTRADICTION-FINDER", 3, 0, false);
        declareFunction("uiat_contradiction_finder_hint", "UIAT-CONTRADICTION-FINDER-HINT", 1, 0, false);
        declareFunction("uiat_contradiction_finder_generate_request", "UIAT-CONTRADICTION-FINDER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uia_act_new_redundancy_detector", "UIA-ACT-NEW-REDUNDANCY-DETECTOR", 3, 0, false);
        declareFunction("uiat_redundancy_detector_hint", "UIAT-REDUNDANCY-DETECTOR-HINT", 1, 0, false);
        declareFunction("uiat_redundancy_detector_generate_request", "UIAT-REDUNDANCY-DETECTOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uia_act_new_concept_killer", "UIA-ACT-NEW-CONCEPT-KILLER", 3, 0, false);
        declareFunction("uiat_concept_killer_hint", "UIAT-CONCEPT-KILLER-HINT", 1, 0, false);
        declareFunction("uiat_concept_killer_generate_request", "UIAT-CONCEPT-KILLER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_concept_killer_child_completed", "UIAT-CONCEPT-KILLER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_concept_killer_handle_reply", "UIAT-CONCEPT-KILLER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_assertion_killer", "UIA-ACT-NEW-ASSERTION-KILLER", 3, 0, false);
        declareFunction("uiat_assertion_killer_hint", "UIAT-ASSERTION-KILLER-HINT", 1, 0, false);
        declareFunction("uiat_assertion_killer_generate_request", "UIAT-ASSERTION-KILLER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_assertion_killer_handle_reply", "UIAT-ASSERTION-KILLER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_precision_suggestion_supportedP", "UIA-PRECISION-SUGGESTION-SUPPORTED?", 2, 0, false);
        declareFunction("uia_act_new_precision_suggestor", "UIA-ACT-NEW-PRECISION-SUGGESTOR", 3, 0, false);
        declareFunction("uia_act_new_precision_suggestor_with_facet", "UIA-ACT-NEW-PRECISION-SUGGESTOR-WITH-FACET", 5, 0, false);
        declareFunction("uiat_precision_suggestor_hint", "UIAT-PRECISION-SUGGESTOR-HINT", 1, 0, false);
        declareFunction("uiat_precision_suggestor_sentence_under_construction", "UIAT-PRECISION-SUGGESTOR-SENTENCE-UNDER-CONSTRUCTION", 1, 0, false);
        declareFunction("uiat_precision_suggestor_generate_request", "UIAT-PRECISION-SUGGESTOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_precision_suggestor_get_type_strengthened_sentences", "UIAT-PRECISION-SUGGESTOR-GET-TYPE-STRENGTHENED-SENTENCES", 1, 0, false);
        declareFunction("uiat_precision_suggestor_generate_typecol_request", "UIAT-PRECISION-SUGGESTOR-GENERATE-TYPECOL-REQUEST", 3, 0, false);
        declareFunction("uiat_precision_suggestor_generate_arg_request", "UIAT-PRECISION-SUGGESTOR-GENERATE-ARG-REQUEST", 4, 0, false);
        declareFunction("uiat_precision_suggestor_suggestions", "UIAT-PRECISION-SUGGESTOR-SUGGESTIONS", 4, 0, false);
        declareFunction("uiat_precision_suggestor_show_sentencesP", "UIAT-PRECISION-SUGGESTOR-SHOW-SENTENCES?", 2, 0, false);
        declareFunction("uia_appropriate_replacement_sentences", "UIA-APPROPRIATE-REPLACEMENT-SENTENCES", 4, 0, false);
        declareFunction("uiat_is_faceted_precision_suggestion_sentenceP", "UIAT-IS-FACETED-PRECISION-SUGGESTION-SENTENCE?", 1, 0, false);
        declareFunction("uiat_faceted_precision_suggestion_sentence_get_sentence", "UIAT-FACETED-PRECISION-SUGGESTION-SENTENCE-GET-SENTENCE", 1, 0, false);
        declareFunction("uiat_faceted_precision_suggestion_sentence_get_argnum", "UIAT-FACETED-PRECISION-SUGGESTION-SENTENCE-GET-ARGNUM", 1, 0, false);
        declareFunction("uiat_faceted_precision_suggestion_sentence_get_facet", "UIAT-FACETED-PRECISION-SUGGESTION-SENTENCE-GET-FACET", 1, 0, false);
        declareFunction("uiat_is_faceted_precision_suggestion_result_listP", "UIAT-IS-FACETED-PRECISION-SUGGESTION-RESULT-LIST?", 1, 0, false);
        declareFunction("uiat_precision_suggestor_handle_reply", "UIAT-PRECISION-SUGGESTOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_precision_suggestor_update_typecolXargnum", "UIAT-PRECISION-SUGGESTOR-UPDATE-TYPECOL&ARGNUM", 2, 0, false);
        declareFunction("argnums_left", "ARGNUMS-LEFT", 2, 0, false);
        declareFunction("uia_act_new_assertion_validator", "UIA-ACT-NEW-ASSERTION-VALIDATOR", 3, 0, false);
        declareFunction("uiat_assertion_validator_hint", "UIAT-ASSERTION-VALIDATOR-HINT", 1, 0, false);
        declareFunction("uiat_assertion_validator_generate_request", "UIAT-ASSERTION-VALIDATOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_assertion_validator_child_completed", "UIAT-ASSERTION-VALIDATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uia_act_new_coa_evaluator", "UIA-ACT-NEW-COA-EVALUATOR", 3, 0, false);
        declareFunction("uiat_coa_evaluator_hint", "UIAT-COA-EVALUATOR-HINT", 1, 0, false);
        declareFunction("uiat_coaeval_get_course_of_action", "UIAT-COAEVAL-GET-COURSE-OF-ACTION", 1, 0, false);
        declareFunction("uiat_coaeval_get_matrix_results", "UIAT-COAEVAL-GET-MATRIX-RESULTS", 1, 0, false);
        declareFunction("uiat_coaeval_set_matrix_results", "UIAT-COAEVAL-SET-MATRIX-RESULTS", 2, 0, false);
        declareFunction("uiat_coaeval_clear_matrix_results", "UIAT-COAEVAL-CLEAR-MATRIX-RESULTS", 1, 0, false);
        declareFunction("uiat_coa_evaluator_generate_request", "UIAT-COA-EVALUATOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_coaeval_make_ui_request", "UIAT-COAEVAL-MAKE-UI-REQUEST", 3, 0, false);
        declareFunction("uiat_coaeval_get_dimension_classification", "UIAT-COAEVAL-GET-DIMENSION-CLASSIFICATION", 2, 0, false);
        declareFunction("uiat_coaeval_get_classification_ordering", "UIAT-COAEVAL-GET-CLASSIFICATION-ORDERING", 1, 0, false);
        declareFunction("uiat_coa_evaluator_handle_reply", "UIAT-COA-EVALUATOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_coa_evaluator_child_completed", "UIAT-COA-EVALUATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_coaeval_extract_consequent_from_assertion", "UIAT-COAEVAL-EXTRACT-CONSEQUENT-FROM-ASSERTION", 1, 0, false);
        declareFunction("uiat_coaeval_new_evaluation_consequent", "UIAT-COAEVAL-NEW-EVALUATION-CONSEQUENT", 3, 0, false);
        declareFunction("uiat_coaeval_record_child_causation", "UIAT-COAEVAL-RECORD-CHILD-CAUSATION", 3, 0, false);
        declareFunction("uiat_coaeval_retrieve_child_causation", "UIAT-COAEVAL-RETRIEVE-CHILD-CAUSATION", 1, 0, false);
        declareFunction("uiat_coaeval_get_evaluation_matrix", "UIAT-COAEVAL-GET-EVALUATION-MATRIX", 1, 1, false);
        declareFunction("uiat_coaeval_set_evaluation_matrix", "UIAT-COAEVAL-SET-EVALUATION-MATRIX", 2, 0, false);
        declareFunction("uiat_coaeval_compute_evaluation_matrix", "UIAT-COAEVAL-COMPUTE-EVALUATION-MATRIX", 2, 0, false);
        declareFunction("uiat_coaeval_launch_matrix_evaluation", "UIAT-COAEVAL-LAUNCH-MATRIX-EVALUATION", 2, 0, false);
        declareFunction("uiat_coaeval_run_evaluation_matrix", "UIAT-COAEVAL-RUN-EVALUATION-MATRIX", 4, 0, false);
        declareFunction("uiat_coaeval_get_query_formula", "UIAT-COAEVAL-GET-QUERY-FORMULA", 3, 1, false);
        declareFunction("uiat_coaeval_get_backchains", "UIAT-COAEVAL-GET-BACKCHAINS", 3, 0, false);
        declareFunction("uiat_coaeval_get_time", "UIAT-COAEVAL-GET-TIME", 3, 0, false);
        declareFunction("uiat_coaeval_generate_sf_params", "UIAT-COAEVAL-GENERATE-SF-PARAMS", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_misc_file() {
        deflexical("*UIAT-COAEVAL-DEFAULT-CRITERIA-TITLE*", $$$COA_Criteria_List);
        deflexical("*UIAT-COAEVAL-DEFAULT-BACKCHAINS*", TWO_INTEGER);
        deflexical("*UIAT-COAEVAL-DEFAULT-TIME*", $int$120);
        return NIL;
    }

    public static final SubLObject setup_uia_tools_misc_file() {
                uia_tool_declaration.declare_uia_tool($WFF_CHECKER, $list_alt1);
        uia_tool_declaration.declare_uia_tool($CONTRADICTION_FINDER, $list_alt46);
        uia_tool_declaration.declare_uia_tool($REDUNDANCY_DETECTOR, $list_alt52);
        uia_tool_declaration.declare_uia_tool($CONCEPT_KILLER, $list_alt62);
        uia_tool_declaration.declare_uia_tool($ASSERTION_KILLER, $list_alt79);
        uia_tool_declaration.declare_uia_tool($PRECISION_SUGGESTOR, $list_alt87);
        uia_tool_declaration.declare_uia_tool($ASSERTION_VALIDATOR, $list_alt135);
        uia_tool_declaration.declare_uia_tool($COA_EVALUATOR, $list_alt142);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $WFF_CHECKER = makeKeyword("WFF-CHECKER");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Well-Formedness Checker"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-WFF-CHECKER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-WFF-CHECKER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-WFF-CHECKER-HANDLE-REPLY"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-WFF-CHECKER-CHILD-COMPLETED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("UIAWffCheckerTool")) });





    static private final SubLList $list_alt4 = list(makeSymbol("CYCL-SENTENCE"));

    static private final SubLString $str_alt5$Well_formed_____A = makeString("Well-formed? : ~A");



    static private final SubLSymbol $sym7$UIA_ASSERTIBLE_COMPLIANT_ = makeSymbol("UIA-ASSERTIBLE-COMPLIANT?");

    static private final SubLSymbol $sym8$UIA_WFF_COMPLIANT_ = makeSymbol("UIA-WFF-COMPLIANT?");

    public static final SubLSymbol $kw9$WFF_ = makeKeyword("WFF?");

    private static final SubLSymbol $WFF_TYPE = makeKeyword("WFF-TYPE");

    static private final SubLString $str_alt11$Checking_whether__S_is_plausible_ = makeString("Checking whether ~S is plausible.");





    static private final SubLString $str_alt14$There_is_no_obvious_reason_to_dou = makeString("There is no obvious reason to doubt the assertion '");

    static private final SubLString $str_alt15$__ = makeString("'.");



    private static final SubLSymbol $WHY_NOT_WFF = makeKeyword("WHY-NOT-WFF");

    private static final SubLSymbol $NON_WFF_SENTENCE = makeKeyword("NON-WFF-SENTENCE");

    public static final SubLObject $$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLSymbol $REPAIRS = makeKeyword("REPAIRS");





    static private final SubLString $str_alt23$WFF_checker_problem___A = makeString("WFF checker problem: ~A");

    static private final SubLString $str_alt24$This_is_an_auto_mailed_message___ = makeString("This is an auto-mailed message.~%(file=~A)~%(fn=~A)~%~%cycl-sentence=~A~%why-not-wff=~A~%~%");

    static private final SubLString $str_alt25$uia_tools_misc = makeString("uia-tools-misc");

    static private final SubLString $str_alt26$uiat_wff_checker_generate_request = makeString("uiat-wff-checker-generate-request");

    static private final SubLList $list_alt27 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    static private final SubLList $list_alt31 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("ASSERT"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt32 = list(makeKeyword("SENTENCE"), makeKeyword("ASSERT"), $MODE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    private static final SubLSymbol $REPAIR = makeKeyword("REPAIR");

    static private final SubLList $list_alt38 = list(makeSymbol("&KEY"), makeSymbol("SENTENCES"));

    static private final SubLList $list_alt39 = list(makeKeyword("SENTENCES"));







    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");



    private static final SubLSymbol $CONTRADICTION_FINDER = makeKeyword("CONTRADICTION-FINDER");

    static private final SubLList $list_alt46 = list($NAME, makeString("Contradiction Finder"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONTRADICTION-FINDER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONTRADICTION-FINDER-GENERATE-REQUEST"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycContradictionFinderTool")));

    static private final SubLString $str_alt47$Contradiction_Check____A = makeString("Contradiction Check : ~A");



    static private final SubLString $str_alt49$After_checking__I_can_find_nothin = makeString("After checking, I can find nothing that the assertion '");

    static private final SubLString $str_alt50$__contradicts_ = makeString("' contradicts.");

    private static final SubLSymbol $REDUNDANCY_DETECTOR = makeKeyword("REDUNDANCY-DETECTOR");

    static private final SubLList $list_alt52 = list($NAME, makeString("Redundancy Detector"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-REDUNDANCY-DETECTOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-REDUNDANCY-DETECTOR-GENERATE-REQUEST"));

    static private final SubLString $str_alt53$Redundancy_Check____A = makeString("Redundancy Check : ~A");

    public static final SubLSymbol $kw54$ALREADY_SHOWN_ = makeKeyword("ALREADY-SHOWN?");







    static private final SubLString $str_alt58$Important__I_already_know_that__ = makeString("Important: I already know that '");

    static private final SubLString $str_alt59$I_do_not_think_that_I_previously_ = makeString("I do not think that I previously had reason to believe '");

    static private final SubLString $str_alt60$____It_is_not_redundant_knowledge = makeString("'. (It is not redundant knowledge.)");

    private static final SubLSymbol $CONCEPT_KILLER = makeKeyword("CONCEPT-KILLER");

    static private final SubLList $list_alt62 = list(new SubLObject[]{ $NAME, makeString("Concept Killer"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONCEPT-KILLER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONCEPT-KILLER-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-CONCEPT-KILLER-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-CONCEPT-KILLER-HANDLE-REPLY") });

    static private final SubLList $list_alt63 = list(makeSymbol("TERM"));

    static private final SubLString $str_alt64$Forget____A = makeString("Forget : ~A");

    private static final SubLSymbol $CONFIRMED = makeKeyword("CONFIRMED");





    static private final SubLString $str_alt68$Do_you_want_me_to_forget_the_conc = makeString("Do you want me to forget the concept ");

    static private final SubLString $str_alt69$_ = makeString("?");

    static private final SubLString $str_alt70$The_concept_ = makeString("The concept ");

    static private final SubLString $str_alt71$_has_been_forgotten_ = makeString(" has been forgotten.");



    private static final SubLSymbol $YES_NO_QUESTION = makeKeyword("YES-NO-QUESTION");

    private static final SubLSymbol $NOT_KILLED = makeKeyword("NOT-KILLED");

    static private final SubLList $list_alt75 = list(makeSymbol("&KEY"), makeSymbol("TERM"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt76 = list($TERM, $MODE);



    private static final SubLSymbol $ASSERTION_KILLER = makeKeyword("ASSERTION-KILLER");

    static private final SubLList $list_alt79 = list(new SubLObject[]{ $NAME, makeString("Assertion Killer"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ASSERTION-KILLER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ASSERTION-KILLER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-ASSERTION-KILLER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycAssertionKillerTool")) });

    static private final SubLString $str_alt80$I_have_forgotten_the_following_se = makeString("I have forgotten the following sentence: ");



    static private final SubLString $str_alt82$I_have_failed_to_forget_the_follo = makeString("I have failed to forget the following sentence: ");



    static private final SubLList $list_alt84 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt85 = list(makeKeyword("SENTENCE"), $MODE);



    static private final SubLList $list_alt87 = list(new SubLObject[]{ $NAME, makeString("Precision Suggestor"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-PRECISION-SUGGESTOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-PRECISION-SUGGESTOR-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-PRECISION-SUGGESTOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycPrecisionSuggestor")) });

    private static final SubLSymbol $CREATED_WITH_FOCUS_ON_FACET = makeKeyword("CREATED-WITH-FOCUS-ON-FACET");

    private static final SubLSymbol $CONSTRAINING_TYPE_COLS = makeKeyword("CONSTRAINING-TYPE-COLS");

    static private final SubLString $str_alt90$Find_the_right_level_of_generalit = makeString("Find the right level of generality: ");

    static private final SubLString $str_alt91$__ = makeString(" (");

    static private final SubLString $str_alt92$_ = makeString(")");

    private static final SubLSymbol $ARGNUMS_GENERALIZED = makeKeyword("ARGNUMS-GENERALIZED");

    private static final SubLSymbol $ARGNUMS_SPECIALIZED = makeKeyword("ARGNUMS-SPECIALIZED");

    private static final SubLSymbol $PREDICATE_SPECIALIZED = makeKeyword("PREDICATE-SPECIALIZED");



    static private final SubLList $list_alt97 = list(makeSymbol("SENTENCE"));

    private static final SubLSymbol $MODIFIED_SENTENCE = makeKeyword("MODIFIED-SENTENCE");

    private static final SubLSymbol $SHOW_SENTENCE = makeKeyword("SHOW-SENTENCE");

    private static final SubLSymbol $SHOW_SENTENCE_CHANGE_REQUIRED = makeKeyword("SHOW-SENTENCE-CHANGE-REQUIRED");









    private static final SubLSymbol $WEAK_SUGGESTIONS = makeKeyword("WEAK-SUGGESTIONS");

    static private final SubLString $str_alt106$The_relationship_expressed_in_the = makeString("The relationship expressed in the fact: ");

    static private final SubLString $str_alt107$_is_sufficiently_strengthened_ = makeString(" is sufficiently strengthened.");

    private static final SubLSymbol $PREDICATE_TYPE_STRENGTHENED = makeKeyword("PREDICATE-TYPE-STRENGTHENED");

    static private final SubLString $str_alt109$Preparing_to_strengthen_the_entit = makeString("Preparing to strengthen the entities in the fact: ");

    static private final SubLString $str_alt110$_ = makeString(".");

    private static final SubLSymbol $SHOW_FACETS = makeKeyword("SHOW-FACETS");

    private static final SubLSymbol $TYPE_COLLECTIONS = makeKeyword("TYPE-COLLECTIONS");

    static private final SubLString $str_alt113$No_interesting_ways_to_strengthen = makeString("No interesting ways to strengthen ");

    private static final SubLSymbol $FACETING_TYPE_COL = makeKeyword("FACETING-TYPE-COL");

    private static final SubLSymbol $SHOW_ARG = makeKeyword("SHOW-ARG");

    public static final SubLSymbol $kw116$SHOW_SENTENCES_ = makeKeyword("SHOW-SENTENCES?");

    public static final SubLObject $$RuleMacroPredicate = constant_handles.reader_make_constant_shell(makeString("RuleMacroPredicate"));

    private static final SubLSymbol $FACETED = makeKeyword("FACETED");

    static private final SubLSymbol $sym119$UIAT_IS_FACETED_PRECISION_SUGGESTION_SENTENCE_ = makeSymbol("UIAT-IS-FACETED-PRECISION-SUGGESTION-SENTENCE?");

    private static final SubLSymbol $CONSTRAIN_TO_FACETS = makeKeyword("CONSTRAIN-TO-FACETS");

    static private final SubLList $list_alt121 = list(makeSymbol("&KEY"), makeSymbol("FACETS"), makeSymbol("ARGNUM"));

    static private final SubLList $list_alt122 = list(makeKeyword("FACETS"), makeKeyword("ARGNUM"));

    private static final SubLSymbol $FACETS = makeKeyword("FACETS");

    static private final SubLList $list_alt124 = list(makeSymbol("ORIGINAL-SENTENCE"));



    static private final SubLList $list_alt126 = list(makeSymbol("&KEY"), makeSymbol("GENERALIZE"), makeSymbol("CHOICES"), makeSymbol("ARGNUM"), makeSymbol("SENTENCE-OR-ARG"), makeSymbol("ARG-DONE"));

    static private final SubLList $list_alt127 = list(makeKeyword("GENERALIZE"), makeKeyword("CHOICES"), makeKeyword("ARGNUM"), makeKeyword("SENTENCE-OR-ARG"), makeKeyword("ARG-DONE"));



    private static final SubLSymbol $SENTENCE_OR_ARG = makeKeyword("SENTENCE-OR-ARG");

    private static final SubLSymbol $ARG_DONE = makeKeyword("ARG-DONE");

    static private final SubLString $$$none = makeString("none");

    static private final SubLList $list_alt132 = list(makeSymbol("CHOICE"), makeSymbol("WEAKEN"));

    static private final SubLSymbol $sym133$_ = makeSymbol("<");

    private static final SubLSymbol $ASSERTION_VALIDATOR = makeKeyword("ASSERTION-VALIDATOR");

    static private final SubLList $list_alt135 = list(new SubLObject[]{ $NAME, makeString("Assertion Validator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ASSERTION-VALIDATOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ASSERTION-VALIDATOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-ASSERTION-VALIDATOR-CHILD-COMPLETED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycAssertionValidatorTool")) });

    static private final SubLString $str_alt136$Validate_Fact___A = makeString("Validate Fact: ~A");

    private static final SubLSymbol $WELL_FORMED = makeKeyword("WELL-FORMED");



    private static final SubLSymbol $FREE_OF_CONTRADICTION = makeKeyword("FREE-OF-CONTRADICTION");

    private static final SubLSymbol $FREE_OF_REDUNDANCY = makeKeyword("FREE-OF-REDUNDANCY");

    private static final SubLSymbol $COA_EVALUATOR = makeKeyword("COA-EVALUATOR");

    static private final SubLList $list_alt142 = list(new SubLObject[]{ $NAME, makeString("COA Evaluator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-COA-EVALUATOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-COA-EVALUATOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-COA-EVALUATOR-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-COA-EVALUATOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("METT-TC-COACritiquingTool")) });

    static private final SubLList $list_alt143 = list(makeSymbol("COURSE-OF-ACTION"), makeSymbol("&REST"), makeSymbol("TOSS"));

    static private final SubLString $str_alt144$Evaluate_Course_of_Action__ = makeString("Evaluate Course of Action: ");

    private static final SubLSymbol $MATRIX_RESULTS = makeKeyword("MATRIX-RESULTS");

    private static final SubLSymbol $SHOW_RESULTS = makeKeyword("SHOW-RESULTS");





    private static final SubLSymbol $DIMENSION_CLASSIFICATION = makeKeyword("DIMENSION-CLASSIFICATION");

    private static final SubLSymbol $CLASSIFICATION_ORDERING = makeKeyword("CLASSIFICATION-ORDERING");

    private static final SubLSymbol $MATRIX = makeKeyword("MATRIX");

    static private final SubLString $$$COA_Criteria_List = makeString("COA Criteria List");

    private static final SubLSymbol $EDIT_RULE = makeKeyword("EDIT-RULE");

    static private final SubLList $list_alt154 = list(makeSymbol("&KEY"), makeSymbol("ASSERTION"));

    static private final SubLList $list_alt155 = list(makeKeyword("ASSERTION"));



    private static final SubLSymbol $TEST_RULE = makeKeyword("TEST-RULE");

    static private final SubLList $list_alt158 = list(makeSymbol("&KEY"), makeSymbol("ASSERTION"), makeSymbol("DIMENSION"), makeSymbol("ATTRIBUTE"));

    static private final SubLList $list_alt159 = list(makeKeyword("ASSERTION"), makeKeyword("DIMENSION"), makeKeyword("ATTRIBUTE"));

    private static final SubLSymbol $DIMENSION = makeKeyword("DIMENSION");

    private static final SubLSymbol $ATTRIBUTE = makeKeyword("ATTRIBUTE");

    private static final SubLSymbol $ADD_RULE_TO_CELL = makeKeyword("ADD-RULE-TO-CELL");

    static private final SubLList $list_alt163 = list(makeSymbol("&KEY"), makeSymbol("DIMENSION"), makeSymbol("ATTRIBUTE"));

    static private final SubLList $list_alt164 = list(makeKeyword("DIMENSION"), makeKeyword("ATTRIBUTE"));

    private static final SubLSymbol $ADD_RULE = makeKeyword("ADD-RULE");

    private static final SubLSymbol $EVALUATE_COA = makeKeyword("EVALUATE-COA");

    private static final SubLSymbol $FORGET_COA_RESULTS = makeKeyword("FORGET-COA-RESULTS");



    private static final SubLSymbol $RULE_CONSTRUCTOR = makeKeyword("RULE-CONSTRUCTOR");

    private static final SubLSymbol $SOLUTION_FINDER = makeKeyword("SOLUTION-FINDER");

    static private final SubLString $str_alt171$COA_Evaluator_does_not_handle_chi = makeString("COA Evaluator does not handle child ~A properly.");

    private static final SubLSymbol $CAUSED_BY = makeKeyword("CAUSED-BY");

    private static final SubLSymbol $CAUSAL_ARGS = makeKeyword("CAUSAL-ARGS");

    private static final SubLSymbol $EVALUATION_MATRIX = makeKeyword("EVALUATION-MATRIX");

    private static final SubLSymbol UIAT_COAEVAL_RUN_EVALUATION_MATRIX = makeSymbol("UIAT-COAEVAL-RUN-EVALUATION-MATRIX");

    private static final SubLSymbol $COURSE_OF_ACTION = makeKeyword("COURSE-OF-ACTION");

    static private final SubLString $str_alt177$invalid_evaluation_matrix____cann = makeString("invalid evaluation matrix -- cannot run");

    static private final SubLString $str_alt178$Evaluating_COA_ = makeString("Evaluating COA ");

    static private final SubLString $str_alt179$__ = makeString(": ");

    static private final SubLList $list_alt180 = list(makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATION"));

    public static final SubLInteger $int$120 = makeInteger(120);

    // // Initializers
    public void declareFunctions() {
        declare_uia_tools_misc_file();
    }

    public void initializeVariables() {
        init_uia_tools_misc_file();
    }

    public void runTopLevelForms() {
        setup_uia_tools_misc_file();
    }
}

