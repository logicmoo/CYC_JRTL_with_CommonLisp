/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-USER-EXPERIENCE-MANAGER-WIDGETS
 *  source file: /cyc/top/cycl/mysentient-user-experience-manager-widgets.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class mysentient_user_experience_manager_widgets extends SubLTranslatedFile implements V02 {
    // // Constructor
    private mysentient_user_experience_manager_widgets() {
    }

    public static final SubLFile me = new mysentient_user_experience_manager_widgets();


    // // Definitions
    // deflexical
    private static final SubLSymbol $default_mysentient_user_happiness_confidence$ = makeSymbol("*DEFAULT-MYSENTIENT-USER-HAPPINESS-CONFIDENCE*");

    /**
     * When T, we also generate an overall #$completeStringContentsOfIBT assertion; skipped when NIL.
     */
    // deflexical
    public static final SubLSymbol $myse_uem_generate_overall_string_contents_of_ibtP$ = makeSymbol("*MYSE-UEM-GENERATE-OVERALL-STRING-CONTENTS-OF-IBT?*");

    /**
     * Create the QA module output that was received by the UEM, and return selected QA outputs to show to the user.
     */
    public static final SubLObject mysentient_uem_note_one_qa_module_output_for_user(SubLObject user, SubLObject session, SubLObject session_mt, SubLObject java_package_name, SubLObject output_confidence, SubLObject xml_confidence_tuples) {
        SubLTrampolineFile.checkType(user, FORT_P);
        SubLTrampolineFile.checkType(session, FORT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        SubLTrampolineFile.checkType(java_package_name, STRINGP);
        SubLTrampolineFile.checkType(output_confidence, NUMBERP);
        SubLTrampolineFile.checkType(xml_confidence_tuples, LISTP);
        mysentient_utilities.myselog_fine(cconcatenate($str_alt7$Noting_output_of_QA_module_, new SubLObject[]{ format_nil.format_nil_a_no_copy(java_package_name), $str_alt8$_and_selecting_outputs_to_show_us }));
        {
            SubLObject iteration_event = mysentient_preprocess_widgets.mysentient_pp_most_recent_session_iteration(session, session_mt);
            SubLObject okP = T;
            if (NIL == iteration_event) {
                mysentient_utilities.myselog_error($str_alt9$Couldn_t_find_the_most_recent_ite);
                okP = NIL;
            }
            {
                SubLObject info_transfer = info_transfer_of_most_recent_utterance(session_mt);
                if (NIL == info_transfer) {
                    okP = NIL;
                }
                myse_uem_note_qa_module_output(info_transfer, iteration_event, user, session, session_mt, java_package_name, output_confidence, xml_confidence_tuples);
            }
            return okP;
        }
    }

    public static final SubLObject info_transfer_of_most_recent_utterance(SubLObject session_mt) {
        {
            SubLObject utterance_peg = mysentient_user_profile_manager_widgets.most_recent_utterance_peg(session_mt);
            if (NIL == utterance_peg) {
                mysentient_utilities.myselog_error($str_alt10$Couldn_t_find_the_most_recent_utt);
                return NIL;
            }
            return mysentient_utilities.info_transfer_event_for_peg(utterance_peg);
        }
    }

    /**
     * Establish what outputs to show the user this time around, based on the current state of session
     * and session mt.
     */
    public static final SubLObject mysentient_uem_get_module_outputs_to_show_user(SubLObject session, SubLObject session_mt) {
        SubLTrampolineFile.checkType(session, FORT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        {
            SubLObject info_transfer = info_transfer_of_most_recent_utterance(session_mt);
            SubLObject output_ibts = myse_select_qa_outputs_to_show_user(info_transfer, session, session_mt);
            SubLObject ibt_strings = NIL;
            SubLObject cdolist_list_var = output_ibts;
            SubLObject ibt = NIL;
            for (ibt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ibt = cdolist_list_var.first()) {
                ibt_strings = cons(complete_string_contents_of_ibt(ibt, session_mt), ibt_strings);
            }
            return values(nreverse(ibt_strings), output_ibts);
        }
    }

    /**
     * Record how the user triaged what was recommended and return what's the next thing to do.
     */
    public static final SubLObject mysentient_uem_note_user_response_to_answer_reporter(SubLObject user, SubLObject presented_ibts, SubLObject rejected_ibts, SubLObject accepted_ibts, SubLObject session, SubLObject session_mt) {
        SubLTrampolineFile.checkType(user, FORT_P);
        SubLTrampolineFile.checkType(presented_ibts, LISTP);
        SubLTrampolineFile.checkType(rejected_ibts, LISTP);
        SubLTrampolineFile.checkType(accepted_ibts, LISTP);
        SubLTrampolineFile.checkType(session, FORT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        mysentient_utilities.myselog_fine($str_alt13$Recording_which_IBTs_were_present);
        {
            SubLObject info_transfer = info_transfer_of_most_recent_utterance(session_mt);
            SubLObject answer_reporter_event = NIL;
            SubLObject reply_event = NIL;
            if (NIL == info_transfer) {
                return NIL;
            }
            answer_reporter_event = myse_uem_note_answer_reporter_event(presented_ibts, info_transfer, session, session_mt);
            mysentient_utilities.myselog_fine(cconcatenate($str_alt14$Noting_user_s_response_to_answer_, format_nil.format_nil_a_no_copy(answer_reporter_event)));
            mysentient_utilities.myselog_fine($str_alt15$Recording_how_user_felt_about_IBT);
            reply_event = myse_uem_note_user_response_to_answer_reporter(user, rejected_ibts, accepted_ibts, answer_reporter_event, session, session_mt);
            return reply_event;
        }
    }

    /**
     * Figure out what to do next.
     */
    public static final SubLObject mysentient_uem_select_next_action(SubLObject iteration_id, SubLObject session, SubLObject session_mt) {
        SubLTrampolineFile.checkType(session, FORT_P);
        SubLTrampolineFile.checkType(session_mt, POSSIBLY_HLMT_P);
        {
            SubLObject iteration_event = mysentient_preprocess_widgets.mysentient_pp_most_recent_session_iteration(session, session_mt);
            if (NIL == iteration_event) {
                mysentient_utilities.myselog_error(cconcatenate($str_alt17$Couldn_t_find_the_current_iterati, format_nil.format_nil_s_no_copy(session)));
                return $$InteractionRequiresEsclation;
            }
            return myse_uem_select_next_action(iteration_event, session, session_mt);
        }
    }

    /**
     * Select the next action for the UEM to perform, such as presenting QA
     * outputs to the user or triggering a new iteration.
     */
    public static final SubLObject myse_uem_select_next_action(SubLObject iteration_event, SubLObject session, SubLObject session_mt) {
        perform_genlmt_workaround_hack();
        {
            SubLObject action = mysentient_utilities.myse_query_variable($STATUS, listS($$interactionStatus, iteration_event, $list_alt21), session_mt, $list_alt22);
            return action.first();
        }
    }

    /**
     * Note the user's response to the QA output that was presented to him/her by the Answer Reporter.
     */
    public static final SubLObject myse_uem_note_user_response_to_answer_reporter(SubLObject user, SubLObject rejected_ibts, SubLObject accepted_ibts, SubLObject answer_reporter_event, SubLObject session, SubLObject session_mt) {
        {
            SubLObject event = mysentient_utilities.myse_create(cconcatenate(myse_uem_user_name(user), new SubLObject[]{ $str_alt23$_responds_to_, kb_paths.fort_name(answer_reporter_event) }), session_mt, UNPROVIDED, UNPROVIDED);
            SubLObject iteration_event = mysentient_preprocess_widgets.mysentient_pp_most_recent_session_iteration(session, session_mt);
            mysentient_utilities.myselog_fine(cconcatenate($str_alt24$Reifying_user_response_event_, format_nil.format_nil_a_no_copy(event)));
            mysentient_utilities.myse_assert_now(listS($$isa, event, $list_alt26), $$UniversalVocabularyMt);
            mysentient_utilities.myse_assert_now(listS($$isa, event, $list_alt28), session_mt);
            mysentient_utilities.myse_assert_now(list($$properSubEvents, iteration_event, event), session_mt);
            mysentient_utilities.myse_assert_now(list($$properSubEvents, session, event), session_mt);
            mysentient_utilities.myse_assert_now(listS($$nthSubSituationOfType, event, session, myse_uem_get_next_user_response_event_number(session, session_mt), $list_alt28), session_mt);
            {
                SubLObject cdolist_list_var = rejected_ibts;
                SubLObject ibt = NIL;
                for (ibt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ibt = cdolist_list_var.first()) {
                    mysentient_utilities.myse_assert_now(list($$answerSourceIBTsRejected, event, ibt), session_mt);
                }
            }
            {
                SubLObject cdolist_list_var = accepted_ibts;
                SubLObject ibt = NIL;
                for (ibt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ibt = cdolist_list_var.first()) {
                    mysentient_utilities.myse_assert_now(list($$answerSourceIBTsAccepted, event, ibt), session_mt);
                }
            }
            mysentient_utilities.myse_assert_now(list($$inReplyTo, event, answer_reporter_event), session_mt);
            myse_uem_note_user_feelings_towards_answer_reporter_event(user, answer_reporter_event, session_mt);
            return event;
        }
    }

    /**
     * This is used for creating new constant names that mention the user, e.g. #$JaneDoeRespondsToAnswerReporterEvent001
     */
    public static final SubLObject myse_uem_user_name(SubLObject user) {
        return constants_high.constant_name(user);
    }

    public static final SubLObject complete_string_contents_of_ibt(SubLObject ibt, SubLObject mt) {
        perform_genlmt_workaround_hack();
        {
            SubLObject query_results = ask_utilities.query_variable($sym34$_STRING, listS($$completeStringContentsOfIBT, ibt, $list_alt36), mt, list($MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER, $MAX_NUMBER, ONE_INTEGER));
            return NIL != query_results ? ((SubLObject) (query_results.first())) : NIL;
        }
    }

    /**
     * Reify the Answer Reporter event that has taken place.
     */
    public static final SubLObject myse_uem_note_answer_reporter_event(SubLObject presented_ibts, SubLObject utterance_info_transfer, SubLObject session, SubLObject session_mt) {
        {
            SubLObject event = mysentient_utilities.myse_create($$$my_sentient_answer_reporter_event, session_mt, UNPROVIDED, UNPROVIDED);
            SubLObject iteration_event = mysentient_preprocess_widgets.mysentient_pp_most_recent_session_iteration(session, session_mt);
            SubLObject jvm_used = list($$InterpreterOfJavaPackageFn, list($$JavaPackageFn, $myse_uem_mysentient_answer_reporter_module_package_name$.getGlobalValue()));
            mysentient_utilities.myselog_fine(cconcatenate($str_alt42$Reifying_Answer_Reporter_event_, format_nil.format_nil_a_no_copy(event)));
            mysentient_utilities.myse_assert_now(listS($$isa, event, $list_alt26), $$UniversalVocabularyMt);
            mysentient_utilities.myse_assert_now(listS($$isa, event, $list_alt43), session_mt);
            mysentient_utilities.myse_assert_now(list($$properSubEvents, iteration_event, event), session_mt);
            mysentient_utilities.myse_assert_now(list($$properSubEvents, session, event), session_mt);
            mysentient_utilities.myse_assert_now(listS($$nthSubSituationOfType, event, session, myse_uem_get_next_ar_event_number(session, session_mt), $list_alt43), session_mt);
            mysentient_utilities.myse_assert_now(list($$programOfProcess, event, jvm_used), session_mt);
            {
                SubLObject cdolist_list_var = presented_ibts;
                SubLObject ibt = NIL;
                for (ibt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ibt = cdolist_list_var.first()) {
                    mysentient_utilities.myse_assert_now(list($$answerSourceIBTsPresented, event, ibt), session_mt);
                }
            }
            mysentient_utilities.myse_assert_now(list($$inReplyTo, event, utterance_info_transfer), session_mt);
            mysentient_utilities.myse_assert_now(list($$nthInteractionOfSession, event, session, myse_uem_get_next_interaction_number(NIL, session, session_mt)), session_mt);
            return event;
        }
    }

    /**
     * Create the QA module output that was received by the UEM.
     */
    public static final SubLObject myse_uem_note_qa_module_output(SubLObject utterance_info_transfer, SubLObject iteration_event, SubLObject user, SubLObject session, SubLObject session_mt, SubLObject java_package_name, SubLObject output_confidence, SubLObject xml_confidence_tuples) {
        {
            SubLObject event = mysentient_utilities.myse_create(cconcatenate($str_alt47$my_sentient_QA_output_event_for_, constants_high.constant_name(session)), session_mt, UNPROVIDED, UNPROVIDED);
            SubLObject ibt = mysentient_utilities.myse_create(cconcatenate($str_alt48$my_sentient_QA_output_for_, constants_high.constant_name(session)), session_mt, UNPROVIDED, UNPROVIDED);
            SubLObject jvm_used = list($$InterpreterOfJavaPackageFn, list($$JavaPackageFn, java_package_name));
            mysentient_utilities.myselog_fine(cconcatenate($str_alt49$Reifying_module_output_event_, format_nil.format_nil_a_no_copy(event)));
            mysentient_utilities.myse_assert_now(listS($$isa, event, $list_alt26), $$UniversalVocabularyMt);
            mysentient_utilities.myse_assert_now(listS($$isa, event, $list_alt50), session_mt);
            if (NIL != myse_uem_clarification_module_package_name_p(java_package_name)) {
                mysentient_utilities.myselog_fine(cconcatenate(format_nil.format_nil_a_no_copy(event), $str_alt51$_represents_a_request_of_informat));
                mysentient_utilities.myse_assert_now(listS($$isa, event, $list_alt52), session_mt);
            }
            mysentient_utilities.myse_assert_now(list($$properSubEvents, iteration_event, event), session_mt);
            mysentient_utilities.myse_assert_now(list($$properSubEvents, session, event), session_mt);
            mysentient_utilities.myse_assert_now(listS($$nthSubSituationOfType, event, session, myse_uem_get_next_qa_output_number(session, session_mt), $list_alt50), session_mt);
            mysentient_utilities.myse_assert_now(list($$inReactionTo, event, utterance_info_transfer), session_mt);
            mysentient_utilities.myse_assert_now(list($$informationOrigin, utterance_info_transfer, user), session_mt);
            mysentient_utilities.myse_assert_now(list($$programOfProcess, event, jvm_used), session_mt);
            mysentient_utilities.myselog_fine(cconcatenate($str_alt55$Reifying_overall_module_output_, format_nil.format_nil_a_no_copy(ibt)));
            mysentient_utilities.myse_assert_now(listS($$isa, ibt, $list_alt26), $$UniversalVocabularyMt);
            mysentient_utilities.myse_assert_now(listS($$isa, ibt, $list_alt56), session_mt);
            myseuem_note_ibt_output_confidence(ibt, output_confidence, jvm_used, session_mt);
            mysentient_utilities.myselog_fine(cconcatenate($str_alt57$Connecting_module_output_event_, new SubLObject[]{ format_nil.format_nil_a_no_copy(event), $str_alt58$_and_module_output_, format_nil.format_nil_a_no_copy(ibt) }));
            mysentient_utilities.myse_assert_now(list($$ibtGenerated, event, ibt), session_mt);
            mysentient_utilities.myselog_fine(cconcatenate($str_alt60$Processing_the_, new SubLObject[]{ format_nil.format_nil_d_no_copy(length(xml_confidence_tuples)), $str_alt61$_tuple_s__of_XML_string_and_outpu }));
            {
                SubLObject overall_string = NIL;
                if (NIL != $myse_uem_generate_overall_string_contents_of_ibtP$.getGlobalValue()) {
                    overall_string = make_string_output_stream();
                    write_string($str_alt62$_myse_ANSWERS_confidence__, overall_string, UNPROVIDED, UNPROVIDED);
                    princ(output_confidence, overall_string);
                    write_string($str_alt63$__, overall_string, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject list_var = NIL;
                    SubLObject tuple = NIL;
                    SubLObject counter = NIL;
                    for (list_var = xml_confidence_tuples, tuple = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                        {
                            SubLObject datum = tuple;
                            SubLObject current = datum;
                            SubLObject xml_string = NIL;
                            SubLObject confidence = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt64);
                            xml_string = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt64);
                            confidence = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject sub_ibt = mysentient_utilities.myse_create($$$QUA_Module_IBT, session_mt, UNPROVIDED, UNPROVIDED);
                                    mysentient_utilities.myselog_fine(cconcatenate($str_alt66$Reifying_Answer__, new SubLObject[]{ format_nil.format_nil_a_no_copy(add(counter, ONE_INTEGER)), $str_alt67$_as_, format_nil.format_nil_a_no_copy(sub_ibt) }));
                                    mysentient_utilities.myse_assert_now(listS($$isa, sub_ibt, $list_alt26), $$UniversalVocabularyMt);
                                    mysentient_utilities.myse_assert_now(listS($$isa, sub_ibt, $list_alt68), session_mt);
                                    myseuem_note_ibt_output_confidence(sub_ibt, confidence, jvm_used, session_mt);
                                    mysentient_utilities.myse_assert_now(list($$completeStringContentsOfIBT, sub_ibt, xml_string), session_mt);
                                    if (NIL != myse_uem_is_clarification_manager_outputP(xml_string)) {
                                        mysentient_utilities.myse_assert_now(listS($$isa, ibt, $list_alt69), session_mt);
                                    }
                                    mysentient_utilities.myse_assert_now(list($$moduleOutputContainsIBT, ibt, sub_ibt), session_mt);
                                    if (NIL != $myse_uem_generate_overall_string_contents_of_ibtP$.getGlobalValue()) {
                                        write_string(xml_string, overall_string, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt64);
                            }
                        }
                    }
                }
                if (NIL != $myse_uem_generate_overall_string_contents_of_ibtP$.getGlobalValue()) {
                    write_string($str_alt71$__myse_ANSWERS_, overall_string, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != $myse_uem_generate_overall_string_contents_of_ibtP$.getGlobalValue()) {
                    mysentient_utilities.myselog_fine($str_alt72$Generating_an_overall_string_cont);
                    {
                        SubLObject xml_string = get_output_stream_string(overall_string);
                        mysentient_utilities.myse_assert_now(list($$completeStringContentsOfIBT, ibt, xml_string), session_mt);
                    }
                } else {
                    mysentient_utilities.myselog_fine($str_alt73$No_overall_string_contents_assert);
                }
            }
            return event;
        }
    }

    // deflexical
    private static final SubLSymbol $myse_uem_clarification_manager_output_tag$ = makeSymbol("*MYSE-UEM-CLARIFICATION-MANAGER-OUTPUT-TAG*");

    public static final SubLObject myse_uem_is_clarification_manager_outputP(SubLObject string) {
        return list_utilities.sublisp_boolean(string_utilities.substringP($myse_uem_clarification_manager_output_tag$.getGlobalValue(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject myse_uem_get_next_user_response_event_number(SubLObject session, SubLObject session_mt) {
        perform_genlmt_workaround_hack();
        {
            SubLObject counts = ask_utilities.query_variable($COUNT, list($$assertedSentence, listS($$nthSubSituationOfType, $sym77$__EVENT, session, $list_alt78)), session_mt, UNPROVIDED);
            if (NIL == counts) {
                return ONE_INTEGER;
            }
            return number_utilities.f_1X(number_utilities.maximum(counts, UNPROVIDED));
        }
    }

    public static final SubLObject myse_uem_get_next_ar_event_number(SubLObject session, SubLObject session_mt) {
        perform_genlmt_workaround_hack();
        {
            SubLObject counts = ask_utilities.query_variable($COUNT, list($$assertedSentence, listS($$nthSubSituationOfType, $sym77$__EVENT, session, $list_alt79)), session_mt, UNPROVIDED);
            if (NIL == counts) {
                return ONE_INTEGER;
            }
            return number_utilities.f_1X(number_utilities.maximum(counts, UNPROVIDED));
        }
    }

    public static final SubLObject myse_uem_get_next_qa_output_number(SubLObject session, SubLObject session_mt) {
        perform_genlmt_workaround_hack();
        {
            SubLObject counts = ask_utilities.query_variable($COUNT, list($$assertedSentence, listS($$nthSubSituationOfType, $sym77$__EVENT, session, $list_alt80)), session_mt, UNPROVIDED);
            if (NIL == counts) {
                return ONE_INTEGER;
            }
            return number_utilities.f_1X(number_utilities.maximum(counts, UNPROVIDED));
        }
    }

    // defconstant
    private static final SubLSymbol $myse_uem_cycorp_clarification_module_package_name$ = makeSymbol("*MYSE-UEM-CYCORP-CLARIFICATION-MODULE-PACKAGE-NAME*");

    // defconstant
    private static final SubLSymbol $myse_uem_mysentient_answer_reporter_module_package_name$ = makeSymbol("*MYSE-UEM-MYSENTIENT-ANSWER-REPORTER-MODULE-PACKAGE-NAME*");

    public static final SubLObject myse_uem_clarification_module_package_name_p(SubLObject v_object) {
        return equal(v_object, $myse_uem_cycorp_clarification_module_package_name$.getGlobalValue());
    }

    public static final SubLObject myseuem_note_ibt_output_confidence(SubLObject ibt, SubLObject output_confidence, SubLObject program, SubLObject session_mt) {
        {
            SubLObject confidence_sentence = list($$programOutputConfidence, ibt, output_confidence);
            mysentient_utilities.myse_assert_now(confidence_sentence, session_mt);
            mysentient_utilities.myse_assert_now(list($$sourceOfTerm, confidence_sentence, program), session_mt);
        }
        return ibt;
    }

    /**
     * Return selected QA output IBTs to show to the user.
     */
    public static final SubLObject myse_select_qa_outputs_to_show_user(SubLObject utterance_info_transfer, SubLObject session, SubLObject session_mt) {
        return myse_uem_viable_module_output_with_highest_confidence(utterance_info_transfer, session_mt, UNPROVIDED);
    }

    // deflexical
    public static final SubLSymbol $myse_uem_module_output_selection_strategy$ = makeSymbol("*MYSE-UEM-MODULE-OUTPUT-SELECTION-STRATEGY*");

    // deflexical
    public static final SubLSymbol $myse_uem_module_output_selection_sentence_pattern$ = makeSymbol("*MYSE-UEM-MODULE-OUTPUT-SELECTION-SENTENCE-PATTERN*");

    // deflexical
    public static final SubLSymbol $myse_uem_module_output_selection_variable$ = makeSymbol("*MYSE-UEM-MODULE-OUTPUT-SELECTION-VARIABLE*");

    // deflexical
    public static final SubLSymbol $myse_uem_module_output_selection_inference_properties$ = makeSymbol("*MYSE-UEM-MODULE-OUTPUT-SELECTION-INFERENCE-PROPERTIES*");

    public static final SubLObject myse_uem_viable_module_output_with_highest_confidence(SubLObject info_transfer, SubLObject session_mt, SubLObject strategy) {
        if (strategy == UNPROVIDED) {
            strategy = $myse_uem_module_output_selection_strategy$.getGlobalValue();
        }
        perform_genlmt_workaround_hack();
        {
            SubLObject query_sentence = cycl_utilities.expression_subst(info_transfer, $INFO_TRANSFER, cycl_utilities.expression_subst(strategy, $STRATEGY, $myse_uem_module_output_selection_sentence_pattern$.getGlobalValue(), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            return ask_utilities.query_variable($myse_uem_module_output_selection_variable$.getGlobalValue(), query_sentence, session_mt, $myse_uem_module_output_selection_inference_properties$.getGlobalValue());
        }
    }

    /**
     *
     *
     * @param USER
     * 		fort-p; the fort that identifies the user for the session in question
     * @param SESSION-MT
     * 		hlmt-p; the microtheory in which session-information is stored
     */
    public static final SubLObject mysentient_uem_user_happiness_level(SubLObject user, SubLObject session_mt) {
        SubLTrampolineFile.checkType(session_mt, HLMT_P);
        perform_genlmt_workaround_hack();
        {
            SubLObject session = mysentient_user_profile_manager_widgets.mys_session_from_session_mt(session_mt);
            SubLObject happiness_level = ask_utilities.query_variable($sym93$_FEELING, listS($$feelsTowardsObject_Ternary, user, session, $list_alt95), session_mt, $list_alt96).first();
            SubLObject happiness_number = NIL;
            if ((NIL != el_utilities.possibly_nat_p(happiness_level)) && ($$IntervalTypeRatingFn == cycl_utilities.nat_arg0(happiness_level))) {
                happiness_number = cycl_utilities.nat_arg3(happiness_level, UNPROVIDED);
            }
            if (NIL == happiness_level) {
                happiness_level = $$$unknown;
            }
            if (NIL == happiness_number) {
                happiness_number = $float$7_0;
            }
            return values(happiness_level, happiness_number, $default_mysentient_user_happiness_confidence$.getGlobalValue());
        }
    }

    /**
     * Note the current user's sentiment, which is expected to be a NAT of the form
     * (MediumAmountFn Happiness) or the like.
     *
     * @return see myse-uem-user-happiness-level
     */
    public static final SubLObject mysentient_uem_note_user_happiness(SubLObject user, SubLObject session_mt, SubLObject happiness_level) {
        SubLTrampolineFile.checkType(user, FORT_P);
        SubLTrampolineFile.checkType(session_mt, HLMT_P);
        SubLTrampolineFile.checkType(happiness_level, POSSIBLY_NAT_P);
        {
            SubLObject session = mysentient_user_profile_manager_widgets.mys_session_from_session_mt(session_mt);
            SubLObject next_interaction_number = myse_uem_get_next_interaction_number(user, session, session_mt);
            SubLObject next_interaction = mysentient_utilities.myse_create(cconcatenate(mysentient_user_profile_manager_widgets.$mysentient_session_term_prefix$.getGlobalValue(), new SubLObject[]{ $str_alt102$_, kb_paths.fort_name(user), $str_alt103$_Interaction_, princ_to_string(next_interaction_number) }), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            mysentient_utilities.myse_assert_now(listS($$isa, next_interaction, $list_alt26), $$UniversalVocabularyMt);
            mysentient_utilities.myse_assert_now(listS($$isa, next_interaction, $list_alt104), session_mt);
            mysentient_utilities.myse_assert_now(list($$nthInteractionOfSession, next_interaction, session, next_interaction_number), session_mt);
            mysentient_utilities.myse_assert_now(list($$feelsTowardsObject_Ternary, user, next_interaction, happiness_level), session_mt);
            mysentient_utilities.myse_assert_now(list($$properSubEvents, session, next_interaction), session_mt);
            return mysentient_uem_user_happiness_level(user, session_mt);
        }
    }

    public static final SubLObject myse_uem_note_user_feelings_towards_answer_reporter_event(SubLObject user, SubLObject answer_reporter_event, SubLObject session_mt) {
        {
            SubLObject happiness_level = myse_uem_user_feelings_towards_answer_reporter_event(user, answer_reporter_event, session_mt);
            return NIL != happiness_level ? ((SubLObject) (mysentient_utilities.myse_assert_now(list($$feelsTowardsObject_Ternary, user, answer_reporter_event, happiness_level), UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @param USER
     * 		fort-p; the fort that identifies the user for the session in question
     * @param ANSWER-REPORTER-EVENT
     * 		fort-p; the fort that identifies the event of QA output being presented to the user
     * @param SESSION-MT
     * 		hlmt-p; the microtheory in which session-information is stored
     */
    public static final SubLObject myse_uem_user_feelings_towards_answer_reporter_event(SubLObject user, SubLObject answer_reporter_event, SubLObject session_mt) {
        perform_genlmt_workaround_hack();
        return ask_utilities.query_variable($sym93$_FEELING, listS($$feelsTowardsObject_Ternary, user, answer_reporter_event, $list_alt95), session_mt, $list_alt96).first();
    }

    public static final SubLObject myse_uem_get_next_interaction_number(SubLObject user, SubLObject session, SubLObject session_mt) {
        perform_genlmt_workaround_hack();
        {
            SubLObject counts = ask_utilities.query_variable($COUNT, list($$assertedSentence, listS($$nthInteractionOfSession, $sym105$__INTER, session, $list_alt106)), session_mt, UNPROVIDED);
            if (NIL == counts) {
                return ONE_INTEGER;
            }
            return add(ONE_INTEGER, Sort.sort(counts, symbol_function($sym107$_), UNPROVIDED).first());
        }
    }

    // deflexical
    private static final SubLSymbol $mysuem_perform_genl_mt_workaround_hack$ = makeSymbol("*MYSUEM-PERFORM-GENL-MT-WORKAROUND-HACK*");

    public static final SubLObject perform_genlmt_workaround_hack() {
        if (NIL != $mysuem_perform_genl_mt_workaround_hack$.getGlobalValue()) {
            if (NIL != fboundp($sym108$CLEAR_BASE_MT_INT_)) {
                funcall($sym108$CLEAR_BASE_MT_INT_);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_mysentient_user_experience_manager_widgets_file() {
        declareFunction("mysentient_uem_note_one_qa_module_output_for_user", "MYSENTIENT-UEM-NOTE-ONE-QA-MODULE-OUTPUT-FOR-USER", 6, 0, false);
        declareFunction("info_transfer_of_most_recent_utterance", "INFO-TRANSFER-OF-MOST-RECENT-UTTERANCE", 1, 0, false);
        declareFunction("mysentient_uem_get_module_outputs_to_show_user", "MYSENTIENT-UEM-GET-MODULE-OUTPUTS-TO-SHOW-USER", 2, 0, false);
        declareFunction("mysentient_uem_note_user_response_to_answer_reporter", "MYSENTIENT-UEM-NOTE-USER-RESPONSE-TO-ANSWER-REPORTER", 6, 0, false);
        declareFunction("mysentient_uem_select_next_action", "MYSENTIENT-UEM-SELECT-NEXT-ACTION", 3, 0, false);
        declareFunction("myse_uem_select_next_action", "MYSE-UEM-SELECT-NEXT-ACTION", 3, 0, false);
        declareFunction("myse_uem_note_user_response_to_answer_reporter", "MYSE-UEM-NOTE-USER-RESPONSE-TO-ANSWER-REPORTER", 6, 0, false);
        declareFunction("myse_uem_user_name", "MYSE-UEM-USER-NAME", 1, 0, false);
        declareFunction("complete_string_contents_of_ibt", "COMPLETE-STRING-CONTENTS-OF-IBT", 2, 0, false);
        declareFunction("myse_uem_note_answer_reporter_event", "MYSE-UEM-NOTE-ANSWER-REPORTER-EVENT", 4, 0, false);
        declareFunction("myse_uem_note_qa_module_output", "MYSE-UEM-NOTE-QA-MODULE-OUTPUT", 8, 0, false);
        declareFunction("myse_uem_is_clarification_manager_outputP", "MYSE-UEM-IS-CLARIFICATION-MANAGER-OUTPUT?", 1, 0, false);
        declareFunction("myse_uem_get_next_user_response_event_number", "MYSE-UEM-GET-NEXT-USER-RESPONSE-EVENT-NUMBER", 2, 0, false);
        declareFunction("myse_uem_get_next_ar_event_number", "MYSE-UEM-GET-NEXT-AR-EVENT-NUMBER", 2, 0, false);
        declareFunction("myse_uem_get_next_qa_output_number", "MYSE-UEM-GET-NEXT-QA-OUTPUT-NUMBER", 2, 0, false);
        declareFunction("myse_uem_clarification_module_package_name_p", "MYSE-UEM-CLARIFICATION-MODULE-PACKAGE-NAME-P", 1, 0, false);
        declareFunction("myseuem_note_ibt_output_confidence", "MYSEUEM-NOTE-IBT-OUTPUT-CONFIDENCE", 4, 0, false);
        declareFunction("myse_select_qa_outputs_to_show_user", "MYSE-SELECT-QA-OUTPUTS-TO-SHOW-USER", 3, 0, false);
        declareFunction("myse_uem_viable_module_output_with_highest_confidence", "MYSE-UEM-VIABLE-MODULE-OUTPUT-WITH-HIGHEST-CONFIDENCE", 2, 1, false);
        declareFunction("mysentient_uem_user_happiness_level", "MYSENTIENT-UEM-USER-HAPPINESS-LEVEL", 2, 0, false);
        declareFunction("mysentient_uem_note_user_happiness", "MYSENTIENT-UEM-NOTE-USER-HAPPINESS", 3, 0, false);
        declareFunction("myse_uem_note_user_feelings_towards_answer_reporter_event", "MYSE-UEM-NOTE-USER-FEELINGS-TOWARDS-ANSWER-REPORTER-EVENT", 3, 0, false);
        declareFunction("myse_uem_user_feelings_towards_answer_reporter_event", "MYSE-UEM-USER-FEELINGS-TOWARDS-ANSWER-REPORTER-EVENT", 3, 0, false);
        declareFunction("myse_uem_get_next_interaction_number", "MYSE-UEM-GET-NEXT-INTERACTION-NUMBER", 3, 0, false);
        declareFunction("perform_genlmt_workaround_hack", "PERFORM-GENLMT-WORKAROUND-HACK", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_mysentient_user_experience_manager_widgets_file() {
        deflexical("*DEFAULT-MYSENTIENT-USER-HAPPINESS-CONFIDENCE*", $float$0_8);
        deflexical("*MYSE-UEM-GENERATE-OVERALL-STRING-CONTENTS-OF-IBT?*", NIL);
        deflexical("*MYSE-UEM-CLARIFICATION-MANAGER-OUTPUT-TAG*", $str_alt74$myse_CLARIFY_QUESTION);
        defconstant("*MYSE-UEM-CYCORP-CLARIFICATION-MODULE-PACKAGE-NAME*", $str_alt81$com_cyc_project_mysentient_module);
        defconstant("*MYSE-UEM-MYSENTIENT-ANSWER-REPORTER-MODULE-PACKAGE-NAME*", $str_alt82$com_mysentient_answerReporter);
        deflexical("*MYSE-UEM-MODULE-OUTPUT-SELECTION-STRATEGY*", $const85$SelectViableSingleAnswerModuleIBT);
        deflexical("*MYSE-UEM-MODULE-OUTPUT-SELECTION-SENTENCE-PATTERN*", $list_alt86);
        deflexical("*MYSE-UEM-MODULE-OUTPUT-SELECTION-VARIABLE*", $sym87$_IBT);
        deflexical("*MYSE-UEM-MODULE-OUTPUT-SELECTION-INFERENCE-PROPERTIES*", $list_alt88);
        deflexical("*MYSUEM-PERFORM-GENL-MT-WORKAROUND-HACK*", T);
        return NIL;
    }

    public static final SubLObject setup_mysentient_user_experience_manager_widgets_file() {
                access_macros.register_external_symbol(MYSENTIENT_UEM_NOTE_ONE_QA_MODULE_OUTPUT_FOR_USER);
        access_macros.register_external_symbol(MYSENTIENT_UEM_GET_MODULE_OUTPUTS_TO_SHOW_USER);
        access_macros.register_external_symbol(MYSENTIENT_UEM_NOTE_USER_RESPONSE_TO_ANSWER_REPORTER);
        access_macros.register_external_symbol(MYSENTIENT_UEM_SELECT_NEXT_ACTION);
        access_macros.register_external_symbol(MYSENTIENT_UEM_USER_HAPPINESS_LEVEL);
        access_macros.register_external_symbol(MYSENTIENT_UEM_NOTE_USER_HAPPINESS);
        return NIL;
    }

    // // Internal Constants
    public static final SubLFloat $float$0_8 = makeDouble(0.8);

    private static final SubLSymbol MYSENTIENT_UEM_NOTE_ONE_QA_MODULE_OUTPUT_FOR_USER = makeSymbol("MYSENTIENT-UEM-NOTE-ONE-QA-MODULE-OUTPUT-FOR-USER");











    static private final SubLString $str_alt7$Noting_output_of_QA_module_ = makeString("Noting output of QA module ");

    static private final SubLString $str_alt8$_and_selecting_outputs_to_show_us = makeString(" and selecting outputs to show user");

    static private final SubLString $str_alt9$Couldn_t_find_the_most_recent_ite = makeString("Couldn't find the most recent iteration event of the session.");

    static private final SubLString $str_alt10$Couldn_t_find_the_most_recent_utt = makeString("Couldn't find the most recent utterance peg.");

    private static final SubLSymbol MYSENTIENT_UEM_GET_MODULE_OUTPUTS_TO_SHOW_USER = makeSymbol("MYSENTIENT-UEM-GET-MODULE-OUTPUTS-TO-SHOW-USER");

    private static final SubLSymbol MYSENTIENT_UEM_NOTE_USER_RESPONSE_TO_ANSWER_REPORTER = makeSymbol("MYSENTIENT-UEM-NOTE-USER-RESPONSE-TO-ANSWER-REPORTER");

    static private final SubLString $str_alt13$Recording_which_IBTs_were_present = makeString("Recording which IBTs were presented.");

    static private final SubLString $str_alt14$Noting_user_s_response_to_answer_ = makeString("Noting user's response to answer reporter event ");

    static private final SubLString $str_alt15$Recording_how_user_felt_about_IBT = makeString("Recording how user felt about IBTs presented.");

    private static final SubLSymbol MYSENTIENT_UEM_SELECT_NEXT_ACTION = makeSymbol("MYSENTIENT-UEM-SELECT-NEXT-ACTION");

    static private final SubLString $str_alt17$Couldn_t_find_the_current_iterati = makeString("Couldn't find the current iteration event for session ");

    public static final SubLObject $$InteractionRequiresEsclation = constant_handles.reader_make_constant_shell(makeString("InteractionRequiresEsclation"));



    public static final SubLObject $$interactionStatus = constant_handles.reader_make_constant_shell(makeString("interactionStatus"));

    static private final SubLList $list_alt21 = list(makeKeyword("STATUS"));

    static private final SubLList $list_alt22 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE);

    static private final SubLString $str_alt23$_responds_to_ = makeString(" responds to ");

    static private final SubLString $str_alt24$Reifying_user_response_event_ = makeString("Reifying user response event ");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt26 = list(constant_handles.reader_make_constant_shell(makeString("Individual")));

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    static private final SubLList $list_alt28 = list(constant_handles.reader_make_constant_shell(makeString("RespondingToAMySentientAnswerReporterOutputEvent")));

    public static final SubLObject $$properSubEvents = constant_handles.reader_make_constant_shell(makeString("properSubEvents"));

    public static final SubLObject $$nthSubSituationOfType = constant_handles.reader_make_constant_shell(makeString("nthSubSituationOfType"));

    public static final SubLObject $$answerSourceIBTsRejected = constant_handles.reader_make_constant_shell(makeString("answerSourceIBTsRejected"));

    public static final SubLObject $$answerSourceIBTsAccepted = constant_handles.reader_make_constant_shell(makeString("answerSourceIBTsAccepted"));

    public static final SubLObject $$inReplyTo = constant_handles.reader_make_constant_shell(makeString("inReplyTo"));

    static private final SubLSymbol $sym34$_STRING = makeSymbol("?STRING");

    public static final SubLObject $$completeStringContentsOfIBT = constant_handles.reader_make_constant_shell(makeString("completeStringContentsOfIBT"));

    static private final SubLList $list_alt36 = list(makeSymbol("?STRING"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    static private final SubLString $$$my_sentient_answer_reporter_event = makeString("my sentient answer reporter event");

    public static final SubLObject $$InterpreterOfJavaPackageFn = constant_handles.reader_make_constant_shell(makeString("InterpreterOfJavaPackageFn"));

    public static final SubLObject $$JavaPackageFn = constant_handles.reader_make_constant_shell(makeString("JavaPackageFn"));

    static private final SubLString $str_alt42$Reifying_Answer_Reporter_event_ = makeString("Reifying Answer Reporter event ");

    static private final SubLList $list_alt43 = list(constant_handles.reader_make_constant_shell(makeString("PresentingQAModuleResultsToAMySentientAnswersUser")));

    public static final SubLObject $$programOfProcess = constant_handles.reader_make_constant_shell(makeString("programOfProcess"));

    public static final SubLObject $$answerSourceIBTsPresented = constant_handles.reader_make_constant_shell(makeString("answerSourceIBTsPresented"));

    public static final SubLObject $$nthInteractionOfSession = constant_handles.reader_make_constant_shell(makeString("nthInteractionOfSession"));

    static private final SubLString $str_alt47$my_sentient_QA_output_event_for_ = makeString("my sentient QA output event for ");

    static private final SubLString $str_alt48$my_sentient_QA_output_for_ = makeString("my sentient QA output for ");

    static private final SubLString $str_alt49$Reifying_module_output_event_ = makeString("Reifying module output event ");

    static private final SubLList $list_alt50 = list(constant_handles.reader_make_constant_shell(makeString("MySentientQAModuleOutputEvent")));

    static private final SubLString $str_alt51$_represents_a_request_of_informat = makeString(" represents a request of information event.");

    static private final SubLList $list_alt52 = list(constant_handles.reader_make_constant_shell(makeString("RequestingInformation")));

    public static final SubLObject $$inReactionTo = constant_handles.reader_make_constant_shell(makeString("inReactionTo"));

    public static final SubLObject $$informationOrigin = constant_handles.reader_make_constant_shell(makeString("informationOrigin"));

    static private final SubLString $str_alt55$Reifying_overall_module_output_ = makeString("Reifying overall module output ");

    static private final SubLList $list_alt56 = list(constant_handles.reader_make_constant_shell(makeString("MySentientQAModuleOutput")));

    static private final SubLString $str_alt57$Connecting_module_output_event_ = makeString("Connecting module output event ");

    static private final SubLString $str_alt58$_and_module_output_ = makeString(" and module output ");

    public static final SubLObject $$ibtGenerated = constant_handles.reader_make_constant_shell(makeString("ibtGenerated"));

    static private final SubLString $str_alt60$Processing_the_ = makeString("Processing the ");

    static private final SubLString $str_alt61$_tuple_s__of_XML_string_and_outpu = makeString(" tuple(s) of XML-string and output confidences.");

    static private final SubLString $str_alt62$_myse_ANSWERS_confidence__ = makeString("<myse:ANSWERS confidence=\"");

    static private final SubLString $str_alt63$__ = makeString("\">");

    static private final SubLList $list_alt64 = list(makeSymbol("XML-STRING"), makeSymbol("CONFIDENCE"));

    static private final SubLString $$$QUA_Module_IBT = makeString("QUA Module IBT");

    static private final SubLString $str_alt66$Reifying_Answer__ = makeString("Reifying Answer #");

    static private final SubLString $str_alt67$_as_ = makeString(" as ");

    static private final SubLList $list_alt68 = list(constant_handles.reader_make_constant_shell(makeString("MySentientModuleIBT")));

    static private final SubLList $list_alt69 = list(constant_handles.reader_make_constant_shell(makeString("MySentientClarificationManagerOutput")));

    public static final SubLObject $$moduleOutputContainsIBT = constant_handles.reader_make_constant_shell(makeString("moduleOutputContainsIBT"));

    static private final SubLString $str_alt71$__myse_ANSWERS_ = makeString("</myse:ANSWERS>");

    static private final SubLString $str_alt72$Generating_an_overall_string_cont = makeString("Generating an overall string contents assertion for the IBT is enabled.");

    static private final SubLString $str_alt73$No_overall_string_contents_assert = makeString("No overall string contents assertion for the IBT will be generated.");

    static private final SubLString $str_alt74$myse_CLARIFY_QUESTION = makeString("myse:CLARIFY_QUESTION");



    public static final SubLObject $$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));

    static private final SubLSymbol $sym77$__EVENT = makeSymbol("??EVENT");

    static private final SubLList $list_alt78 = list(makeKeyword("COUNT"), constant_handles.reader_make_constant_shell(makeString("RespondingToAMySentientAnswerReporterOutputEvent")));

    static private final SubLList $list_alt79 = list(makeKeyword("COUNT"), constant_handles.reader_make_constant_shell(makeString("PresentingQAModuleResultsToAMySentientAnswersUser")));

    static private final SubLList $list_alt80 = list(makeKeyword("COUNT"), constant_handles.reader_make_constant_shell(makeString("MySentientQAModuleOutputEvent")));

    static private final SubLString $str_alt81$com_cyc_project_mysentient_module = makeString("com.cyc.project.mysentient.module.clarificationManager");

    static private final SubLString $str_alt82$com_mysentient_answerReporter = makeString("com.mysentient.answerReporter");

    public static final SubLObject $$programOutputConfidence = constant_handles.reader_make_constant_shell(makeString("programOutputConfidence"));

    public static final SubLObject $$sourceOfTerm = constant_handles.reader_make_constant_shell(makeString("sourceOfTerm"));

    public static final SubLObject $const85$SelectViableSingleAnswerModuleIBT = constant_handles.reader_make_constant_shell(makeString("SelectViableSingleAnswerModuleIBTWithHighestConfidence-ProblemSolvingStrategy"));

    static private final SubLList $list_alt86 = list(constant_handles.reader_make_constant_shell(makeString("strategyLicensesOutput")), makeKeyword("INFO-TRANSFER"), makeKeyword("STRATEGY"), makeSymbol("?IBT"));

    static private final SubLSymbol $sym87$_IBT = makeSymbol("?IBT");

    static private final SubLList $list_alt88 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE);

    private static final SubLSymbol $INFO_TRANSFER = makeKeyword("INFO-TRANSFER");



    private static final SubLSymbol MYSENTIENT_UEM_USER_HAPPINESS_LEVEL = makeSymbol("MYSENTIENT-UEM-USER-HAPPINESS-LEVEL");



    static private final SubLSymbol $sym93$_FEELING = makeSymbol("?FEELING");

    public static final SubLObject $$feelsTowardsObject_Ternary = constant_handles.reader_make_constant_shell(makeString("feelsTowardsObject-Ternary"));

    static private final SubLList $list_alt95 = list(makeSymbol("?FEELING"));

    static private final SubLList $list_alt96 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    public static final SubLObject $$IntervalTypeRatingFn = constant_handles.reader_make_constant_shell(makeString("IntervalTypeRatingFn"));

    static private final SubLString $$$unknown = makeString("unknown");

    public static final SubLFloat $float$7_0 = makeDouble(7.0);

    private static final SubLSymbol MYSENTIENT_UEM_NOTE_USER_HAPPINESS = makeSymbol("MYSENTIENT-UEM-NOTE-USER-HAPPINESS");

    private static final SubLSymbol POSSIBLY_NAT_P = makeSymbol("POSSIBLY-NAT-P");

    static private final SubLString $str_alt102$_ = makeString("-");

    static private final SubLString $str_alt103$_Interaction_ = makeString("-Interaction-");

    static private final SubLList $list_alt104 = list(constant_handles.reader_make_constant_shell(makeString("MySentientAnswersComputerUserInteraction")));

    static private final SubLSymbol $sym105$__INTER = makeSymbol("??INTER");

    static private final SubLList $list_alt106 = list(makeKeyword("COUNT"));

    static private final SubLSymbol $sym107$_ = makeSymbol(">");

    static private final SubLSymbol $sym108$CLEAR_BASE_MT_INT_ = makeSymbol("CLEAR-BASE-MT-INT?");

    // // Initializers
    public void declareFunctions() {
        declare_mysentient_user_experience_manager_widgets_file();
    }

    public void initializeVariables() {
        init_mysentient_user_experience_manager_widgets_file();
    }

    public void runTopLevelForms() {
        setup_mysentient_user_experience_manager_widgets_file();
    }
}

