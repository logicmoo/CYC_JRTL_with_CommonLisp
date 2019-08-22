/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.constant_suid;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-EVENT-DISPATCHER
 * source file: /cyc/top/cycl/rkf-event-dispatcher.lisp
 * created:     2019/07/03 17:37:56
 */
public final class rkf_event_dispatcher extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_event_dispatcher();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_event_dispatcher";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_event_dispatcher_lock$ = makeSymbol("*RKF-EVENT-DISPATCHER-LOCK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DECLARE_EVENT_CLASS = makeSymbol("DECLARE-EVENT-CLASS");

    private static final SubLSymbol $RKF_BASE_EVENT = makeKeyword("RKF-BASE-EVENT");

    private static final SubLSymbol $CYC_APPLICATION_EVENT = makeKeyword("CYC-APPLICATION-EVENT");

    private static final SubLSymbol $RKF_KB_MODIFICATION_EVENT = makeKeyword("RKF-KB-MODIFICATION-EVENT");

    private static final SubLSymbol $RKF_ASSERT_EVENT = makeKeyword("RKF-ASSERT-EVENT");

    private static final SubLSymbol $RKF_UNASSERT_EVENT = makeKeyword("RKF-UNASSERT-EVENT");

    private static final SubLSymbol $RKF_CREATE_TERM_EVENT = makeKeyword("RKF-CREATE-TERM-EVENT");

    private static final SubLSymbol $RKF_KILL_TERM_EVENT = makeKeyword("RKF-KILL-TERM-EVENT");

    private static final SubLSymbol EVENT_P = makeSymbol("EVENT-P");

    static private final SubLString $str18$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    static private final SubLString $str22$RKF_EVENT_DISPATCHER_Lock = makeString("RKF-EVENT-DISPATCHER Lock");

    public static final SubLSymbol $rkf_event_dispatcher_listeners$ = makeSymbol("*RKF-EVENT-DISPATCHER-LISTENERS*");

    // Definitions
    public static final SubLObject rkf_declare_event_class_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject class_key = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    class_key = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject parent_tail = property_list_member($PARENT, current);
                            SubLObject parent = (NIL != parent_tail) ? ((SubLObject) (cadr(parent_tail))) : NIL;
                            SubLObject docstring_tail = property_list_member($DOCSTRING, current);
                            SubLObject docstring = (NIL != docstring_tail) ? ((SubLObject) (cadr(docstring_tail))) : NIL;
                            SubLObject hierarchy_tail = property_list_member($HIERARCHY, current);
                            SubLObject hierarchy = (NIL != hierarchy_tail) ? ((SubLObject) (cadr(hierarchy_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DECLARE_EVENT_CLASS, list(class_key, $PARENT, parent, $DOCSTRING, docstring, $HIERARCHY, hierarchy), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject rkf_declare_event_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject parent_tail = property_list_member($PARENT, current);
        final SubLObject parent = (NIL != parent_tail) ? cadr(parent_tail) : NIL;
        final SubLObject docstring_tail = property_list_member($DOCSTRING, current);
        final SubLObject docstring = (NIL != docstring_tail) ? cadr(docstring_tail) : NIL;
        final SubLObject hierarchy_tail = property_list_member($HIERARCHY, current);
        final SubLObject hierarchy = (NIL != hierarchy_tail) ? cadr(hierarchy_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DECLARE_EVENT_CLASS, list(class_key, $PARENT, parent, $DOCSTRING, docstring, $HIERARCHY, hierarchy), append(body, NIL));
    }

    public static final SubLObject rkf_post_assert_event_alt(SubLObject sentence, SubLObject mt, SubLObject v_agenda, SubLObject source) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (NIL == source) {
            source = operation_communication.the_cyclist();
        }
        {
            SubLObject my_agenda = (NIL != v_agenda) ? ((SubLObject) (v_agenda)) : cb_user_interaction_agenda.cb_current_uia();
            SubLObject event = event_model.new_event($RKF_ASSERT_EVENT, list($SENTENCE, sentence, $MT, mt, $AGENDA, my_agenda), source);
            return event_broker.post_event(event, com.cyc.cycjava.cycl.rkf_event_dispatcher.current_rkf_event_broker());
        }
    }

    public static SubLObject rkf_post_assert_event(final SubLObject sentence, final SubLObject mt, SubLObject v_agenda, SubLObject source) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (NIL == source) {
            source = operation_communication.the_cyclist();
        }
        final SubLObject my_agenda = (NIL != v_agenda) ? v_agenda : NIL;
        final SubLObject event = event_model.new_event($RKF_ASSERT_EVENT, list($SENTENCE, sentence, $MT, mt, $AGENDA, my_agenda), source);
        return event_broker.post_event(event, current_rkf_event_broker());
    }

    public static final SubLObject rkf_assert_event_retrieve_agenda_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_ASSERT_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_ASSERT_EVENT);
            }
        }
        return getf(event_model.event_message(event), $AGENDA, UNPROVIDED);
    }

    public static SubLObject rkf_assert_event_retrieve_agenda(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_ASSERT_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_ASSERT_EVENT);
        }
        return getf(event_model.event_message(event), $AGENDA, UNPROVIDED);
    }

    public static final SubLObject rkf_assert_event_retrieve_mt_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_ASSERT_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_ASSERT_EVENT);
            }
        }
        return getf(event_model.event_message(event), $MT, UNPROVIDED);
    }

    public static SubLObject rkf_assert_event_retrieve_mt(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_ASSERT_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_ASSERT_EVENT);
        }
        return getf(event_model.event_message(event), $MT, UNPROVIDED);
    }

    public static final SubLObject rkf_assert_event_retrieve_sentence_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_ASSERT_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_ASSERT_EVENT);
            }
        }
        return getf(event_model.event_message(event), $SENTENCE, UNPROVIDED);
    }

    public static SubLObject rkf_assert_event_retrieve_sentence(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_ASSERT_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_ASSERT_EVENT);
        }
        return getf(event_model.event_message(event), $SENTENCE, UNPROVIDED);
    }

    public static final SubLObject rkf_post_unassert_event_alt(SubLObject sentence, SubLObject mt, SubLObject v_agenda, SubLObject source) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (NIL == source) {
            source = operation_communication.the_cyclist();
        }
        {
            SubLObject my_agenda = (NIL != v_agenda) ? ((SubLObject) (v_agenda)) : cb_user_interaction_agenda.cb_current_uia();
            SubLObject event = event_model.new_event($RKF_UNASSERT_EVENT, list($SENTENCE, sentence, $MT, mt, $AGENDA, my_agenda), source);
            return event_broker.post_event(event, com.cyc.cycjava.cycl.rkf_event_dispatcher.current_rkf_event_broker());
        }
    }

    public static SubLObject rkf_post_unassert_event(final SubLObject sentence, final SubLObject mt, SubLObject v_agenda, SubLObject source) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (NIL == source) {
            source = operation_communication.the_cyclist();
        }
        final SubLObject my_agenda = (NIL != v_agenda) ? v_agenda : NIL;
        final SubLObject event = event_model.new_event($RKF_UNASSERT_EVENT, list($SENTENCE, sentence, $MT, mt, $AGENDA, my_agenda), source);
        return event_broker.post_event(event, current_rkf_event_broker());
    }

    public static final SubLObject rkf_unassert_event_retrieve_agenda_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_UNASSERT_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_UNASSERT_EVENT);
            }
        }
        return getf(event_model.event_message(event), $AGENDA, UNPROVIDED);
    }

    public static SubLObject rkf_unassert_event_retrieve_agenda(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_UNASSERT_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_UNASSERT_EVENT);
        }
        return getf(event_model.event_message(event), $AGENDA, UNPROVIDED);
    }

    public static final SubLObject rkf_unassert_event_retrieve_mt_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_UNASSERT_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_UNASSERT_EVENT);
            }
        }
        return getf(event_model.event_message(event), $MT, UNPROVIDED);
    }

    public static SubLObject rkf_unassert_event_retrieve_mt(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_UNASSERT_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_UNASSERT_EVENT);
        }
        return getf(event_model.event_message(event), $MT, UNPROVIDED);
    }

    public static final SubLObject rkf_unassert_event_retrieve_sentence_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_UNASSERT_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_UNASSERT_EVENT);
            }
        }
        return getf(event_model.event_message(event), $SENTENCE, UNPROVIDED);
    }

    public static SubLObject rkf_unassert_event_retrieve_sentence(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_UNASSERT_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_UNASSERT_EVENT);
        }
        return getf(event_model.event_message(event), $SENTENCE, UNPROVIDED);
    }

    public static final SubLObject rkf_post_create_term_event_alt(SubLObject v_term, SubLObject source) {
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (NIL == source) {
            source = operation_communication.the_cyclist();
        }
        {
            SubLObject event = event_model.new_event($RKF_CREATE_TERM_EVENT, list($TERM_NAME, constants_high.constant_name(v_term), $TERM_GUID, constants_high.constant_guid(v_term), $TERM_SUID, constant_suid(v_term), $AGENDA, cb_user_interaction_agenda.cb_current_uia()), source);
            return event_broker.post_event(event, com.cyc.cycjava.cycl.rkf_event_dispatcher.current_rkf_event_broker());
        }
    }

    public static SubLObject rkf_post_create_term_event(final SubLObject v_term, SubLObject source) {
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (NIL == source) {
            source = operation_communication.the_cyclist();
        }
        final SubLObject event = event_model.new_event($RKF_CREATE_TERM_EVENT, list($TERM_NAME, constants_high.constant_name(v_term), $TERM_GUID, constants_high.constant_guid(v_term), $TERM_SUID, constant_suid(v_term), $AGENDA, NIL), source);
        return event_broker.post_event(event, current_rkf_event_broker());
    }

    public static final SubLObject rkf_create_term_event_retrieve_agenda_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_CREATE_TERM_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_CREATE_TERM_EVENT);
            }
        }
        return getf(event_model.event_message(event), $AGENDA, UNPROVIDED);
    }

    public static SubLObject rkf_create_term_event_retrieve_agenda(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_CREATE_TERM_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_CREATE_TERM_EVENT);
        }
        return getf(event_model.event_message(event), $AGENDA, UNPROVIDED);
    }

    public static final SubLObject rkf_create_term_event_retrieve_term_suid_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_CREATE_TERM_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_CREATE_TERM_EVENT);
            }
        }
        return getf(event_model.event_message(event), $TERM_SUID, UNPROVIDED);
    }

    public static SubLObject rkf_create_term_event_retrieve_term_suid(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_CREATE_TERM_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_CREATE_TERM_EVENT);
        }
        return getf(event_model.event_message(event), $TERM_SUID, UNPROVIDED);
    }

    public static final SubLObject rkf_create_term_event_retrieve_term_guid_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_CREATE_TERM_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_CREATE_TERM_EVENT);
            }
        }
        return getf(event_model.event_message(event), $TERM_GUID, UNPROVIDED);
    }

    public static SubLObject rkf_create_term_event_retrieve_term_guid(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_CREATE_TERM_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_CREATE_TERM_EVENT);
        }
        return getf(event_model.event_message(event), $TERM_GUID, UNPROVIDED);
    }

    public static final SubLObject rkf_create_term_event_retrieve_term_name_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_CREATE_TERM_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_CREATE_TERM_EVENT);
            }
        }
        return getf(event_model.event_message(event), $TERM_NAME, UNPROVIDED);
    }

    public static SubLObject rkf_create_term_event_retrieve_term_name(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_CREATE_TERM_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_CREATE_TERM_EVENT);
        }
        return getf(event_model.event_message(event), $TERM_NAME, UNPROVIDED);
    }

    public static final SubLObject rkf_post_kill_term_event_alt(SubLObject v_term, SubLObject source) {
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (NIL == source) {
            source = operation_communication.the_cyclist();
        }
        if (NIL == constant_p(v_term)) {
            return NIL;
        }
        {
            SubLObject event = event_model.new_event($RKF_KILL_TERM_EVENT, list($TERM_NAME, constants_high.constant_name(v_term), $TERM_GUID, constants_high.constant_guid(v_term), $TERM_SUID, constant_suid(v_term), $AGENDA, cb_user_interaction_agenda.cb_current_uia()), source);
            return event_broker.post_event(event, com.cyc.cycjava.cycl.rkf_event_dispatcher.current_rkf_event_broker());
        }
    }

    public static SubLObject rkf_post_kill_term_event(final SubLObject v_term, SubLObject source) {
        if (source == UNPROVIDED) {
            source = NIL;
        }
        if (NIL == source) {
            source = operation_communication.the_cyclist();
        }
        if (NIL == constant_p(v_term)) {
            return NIL;
        }
        final SubLObject event = event_model.new_event($RKF_KILL_TERM_EVENT, list($TERM_NAME, constants_high.constant_name(v_term), $TERM_GUID, constants_high.constant_guid(v_term), $TERM_SUID, constant_suid(v_term), $AGENDA, NIL), source);
        return event_broker.post_event(event, current_rkf_event_broker());
    }

    public static final SubLObject rkf_kill_term_event_retrieve_agenda_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_KILL_TERM_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_KILL_TERM_EVENT);
            }
        }
        return getf(event_model.event_message(event), $AGENDA, UNPROVIDED);
    }

    public static SubLObject rkf_kill_term_event_retrieve_agenda(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_KILL_TERM_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_KILL_TERM_EVENT);
        }
        return getf(event_model.event_message(event), $AGENDA, UNPROVIDED);
    }

    public static final SubLObject rkf_kill_term_event_retrieve_term_suid_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_KILL_TERM_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_KILL_TERM_EVENT);
            }
        }
        return getf(event_model.event_message(event), $TERM_SUID, UNPROVIDED);
    }

    public static SubLObject rkf_kill_term_event_retrieve_term_suid(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_KILL_TERM_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_KILL_TERM_EVENT);
        }
        return getf(event_model.event_message(event), $TERM_SUID, UNPROVIDED);
    }

    public static final SubLObject rkf_kill_term_event_retrieve_term_guid_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_KILL_TERM_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_KILL_TERM_EVENT);
            }
        }
        return getf(event_model.event_message(event), $TERM_GUID, UNPROVIDED);
    }

    public static SubLObject rkf_kill_term_event_retrieve_term_guid(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_KILL_TERM_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_KILL_TERM_EVENT);
        }
        return getf(event_model.event_message(event), $TERM_GUID, UNPROVIDED);
    }

    public static final SubLObject rkf_kill_term_event_retrieve_term_name_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $RKF_KILL_TERM_EVENT) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_KILL_TERM_EVENT);
            }
        }
        return getf(event_model.event_message(event), $TERM_NAME, UNPROVIDED);
    }

    public static SubLObject rkf_kill_term_event_retrieve_term_name(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $RKF_KILL_TERM_EVENT) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $RKF_KILL_TERM_EVENT);
        }
        return getf(event_model.event_message(event), $TERM_NAME, UNPROVIDED);
    }

    public static final SubLObject current_rkf_event_broker_alt() {
        return event_broker.core_event_broker();
    }

    public static SubLObject current_rkf_event_broker() {
        return event_broker.core_event_broker();
    }

    public static final SubLObject rkf_event_dispatcher_runningP_alt() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($rkf_event_dispatcher_listeners$);
    }

    public static SubLObject rkf_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($rkf_event_dispatcher_listeners$);
    }

    public static final SubLObject ensure_rkf_event_dispatcher_running_alt() {
        if (NIL == com.cyc.cycjava.cycl.rkf_event_dispatcher.rkf_event_dispatcher_runningP()) {
            com.cyc.cycjava.cycl.rkf_event_dispatcher.start_rkf_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static SubLObject ensure_rkf_event_dispatcher_running() {
        if (NIL == rkf_event_dispatcher_runningP()) {
            start_rkf_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static final SubLObject register_listener_with_rkf_event_dispatcher_alt(SubLObject listener_var) {
        {
            SubLObject lock = $rkf_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == find(listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    $rkf_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue()));
                    if (NIL != com.cyc.cycjava.cycl.rkf_event_dispatcher.rkf_event_dispatcher_runningP()) {
                        event_broker.register_event_listener(listener_var, NIL);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return listener_var;
    }

    public static SubLObject register_listener_with_rkf_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_event_dispatcher_lock$.getGlobalValue());
            if (NIL == find(listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                $rkf_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue()));
                if (NIL != rkf_event_dispatcher_runningP()) {
                    event_broker.register_event_listener(listener_var, NIL);
                }
            }
        } finally {
            if (NIL != release) {
                release_lock($rkf_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    public static final SubLObject deregister_listener_with_rkf_event_dispatcher_alt(SubLObject listener_var) {
        {
            SubLObject lock = $rkf_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $rkf_event_dispatcher_listeners$.setGlobalValue(remove(listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL != com.cyc.cycjava.cycl.rkf_event_dispatcher.rkf_event_dispatcher_runningP()) {
                    event_broker.deregister_event_listener(listener_var, NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return listener_var;
    }

    public static SubLObject deregister_listener_with_rkf_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_event_dispatcher_lock$.getGlobalValue());
            $rkf_event_dispatcher_listeners$.setGlobalValue(remove(listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != rkf_event_dispatcher_runningP()) {
                event_broker.deregister_event_listener(listener_var, NIL);
            }
        } finally {
            if (NIL != release) {
                release_lock($rkf_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    public static final SubLObject stop_rkf_event_dispatcher_alt() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($rkf_event_dispatcher_listeners$);
    }

    public static SubLObject stop_rkf_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($rkf_event_dispatcher_listeners$);
    }

    public static final SubLObject start_rkf_event_dispatcher_alt() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($rkf_event_dispatcher_listeners$);
    }

    public static SubLObject start_rkf_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($rkf_event_dispatcher_listeners$);
    }

    public static SubLObject declare_rkf_event_dispatcher_file() {
        declareMacro("rkf_declare_event_class", "RKF-DECLARE-EVENT-CLASS");
        declareFunction("rkf_post_assert_event", "RKF-POST-ASSERT-EVENT", 2, 2, false);
        declareFunction("rkf_assert_event_retrieve_agenda", "RKF-ASSERT-EVENT-RETRIEVE-AGENDA", 1, 0, false);
        declareFunction("rkf_assert_event_retrieve_mt", "RKF-ASSERT-EVENT-RETRIEVE-MT", 1, 0, false);
        declareFunction("rkf_assert_event_retrieve_sentence", "RKF-ASSERT-EVENT-RETRIEVE-SENTENCE", 1, 0, false);
        declareFunction("rkf_post_unassert_event", "RKF-POST-UNASSERT-EVENT", 2, 2, false);
        declareFunction("rkf_unassert_event_retrieve_agenda", "RKF-UNASSERT-EVENT-RETRIEVE-AGENDA", 1, 0, false);
        declareFunction("rkf_unassert_event_retrieve_mt", "RKF-UNASSERT-EVENT-RETRIEVE-MT", 1, 0, false);
        declareFunction("rkf_unassert_event_retrieve_sentence", "RKF-UNASSERT-EVENT-RETRIEVE-SENTENCE", 1, 0, false);
        declareFunction("rkf_post_create_term_event", "RKF-POST-CREATE-TERM-EVENT", 1, 1, false);
        declareFunction("rkf_create_term_event_retrieve_agenda", "RKF-CREATE-TERM-EVENT-RETRIEVE-AGENDA", 1, 0, false);
        declareFunction("rkf_create_term_event_retrieve_term_suid", "RKF-CREATE-TERM-EVENT-RETRIEVE-TERM-SUID", 1, 0, false);
        declareFunction("rkf_create_term_event_retrieve_term_guid", "RKF-CREATE-TERM-EVENT-RETRIEVE-TERM-GUID", 1, 0, false);
        declareFunction("rkf_create_term_event_retrieve_term_name", "RKF-CREATE-TERM-EVENT-RETRIEVE-TERM-NAME", 1, 0, false);
        declareFunction("rkf_post_kill_term_event", "RKF-POST-KILL-TERM-EVENT", 1, 1, false);
        declareFunction("rkf_kill_term_event_retrieve_agenda", "RKF-KILL-TERM-EVENT-RETRIEVE-AGENDA", 1, 0, false);
        declareFunction("rkf_kill_term_event_retrieve_term_suid", "RKF-KILL-TERM-EVENT-RETRIEVE-TERM-SUID", 1, 0, false);
        declareFunction("rkf_kill_term_event_retrieve_term_guid", "RKF-KILL-TERM-EVENT-RETRIEVE-TERM-GUID", 1, 0, false);
        declareFunction("rkf_kill_term_event_retrieve_term_name", "RKF-KILL-TERM-EVENT-RETRIEVE-TERM-NAME", 1, 0, false);
        declareFunction("current_rkf_event_broker", "CURRENT-RKF-EVENT-BROKER", 0, 0, false);
        declareFunction("rkf_event_dispatcher_runningP", "RKF-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        declareFunction("ensure_rkf_event_dispatcher_running", "ENSURE-RKF-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        declareFunction("register_listener_with_rkf_event_dispatcher", "REGISTER-LISTENER-WITH-RKF-EVENT-DISPATCHER", 1, 0, false);
        declareFunction("deregister_listener_with_rkf_event_dispatcher", "DEREGISTER-LISTENER-WITH-RKF-EVENT-DISPATCHER", 1, 0, false);
        declareFunction("stop_rkf_event_dispatcher", "STOP-RKF-EVENT-DISPATCHER", 0, 0, false);
        declareFunction("start_rkf_event_dispatcher", "START-RKF-EVENT-DISPATCHER", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_rkf_event_dispatcher_file_alt() {
        deflexical("*RKF-EVENT-DISPATCHER-LOCK*", make_lock($str_alt22$RKF_EVENT_DISPATCHER_Lock));
        deflexical("*RKF-EVENT-DISPATCHER-LISTENERS*", NIL != boundp($rkf_event_dispatcher_listeners$) ? ((SubLObject) ($rkf_event_dispatcher_listeners$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_rkf_event_dispatcher_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*RKF-EVENT-DISPATCHER-LOCK*", make_lock($str22$RKF_EVENT_DISPATCHER_Lock));
            deflexical("*RKF-EVENT-DISPATCHER-LISTENERS*", SubLTrampolineFile.maybeDefault($rkf_event_dispatcher_listeners$, $rkf_event_dispatcher_listeners$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RKF-EVENT-DISPATCHER-LISTENERS*", NIL != boundp($rkf_event_dispatcher_listeners$) ? ((SubLObject) ($rkf_event_dispatcher_listeners$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_rkf_event_dispatcher_file_Previous() {
        deflexical("*RKF-EVENT-DISPATCHER-LOCK*", make_lock($str22$RKF_EVENT_DISPATCHER_Lock));
        deflexical("*RKF-EVENT-DISPATCHER-LISTENERS*", SubLTrampolineFile.maybeDefault($rkf_event_dispatcher_listeners$, $rkf_event_dispatcher_listeners$, NIL));
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject setup_rkf_event_dispatcher_file() {
        event_model.register_event_class($RKF_BASE_EVENT, $CYC_APPLICATION_EVENT, NIL);
        event_model.register_event_class($RKF_KB_MODIFICATION_EVENT, $RKF_BASE_EVENT, NIL);
        event_model.register_event_class($RKF_ASSERT_EVENT, $RKF_KB_MODIFICATION_EVENT, NIL);
        event_model.register_event_class($RKF_UNASSERT_EVENT, $RKF_KB_MODIFICATION_EVENT, NIL);
        event_model.register_event_class($RKF_CREATE_TERM_EVENT, $RKF_KB_MODIFICATION_EVENT, NIL);
        event_model.register_event_class($RKF_KILL_TERM_EVENT, $RKF_KB_MODIFICATION_EVENT, NIL);
        declare_defglobal($rkf_event_dispatcher_listeners$);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"));

    @Override
    public void declareFunctions() {
        declare_rkf_event_dispatcher_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_event_dispatcher_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_event_dispatcher_file();
    }

    

    static private final SubLString $str_alt18$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    static private final SubLString $str_alt22$RKF_EVENT_DISPATCHER_Lock = makeString("RKF-EVENT-DISPATCHER Lock");
}

/**
 * Total time: 80 ms
 */
