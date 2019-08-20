/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subloop_queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-CYC-EVENT-KNOWLEDGE-SOURCES
 *  source file: /cyc/top/cycl/cyblack/cyblack-cyc-event-knowledge-sources.lisp
 *  created:     2019/07/03 17:38:52
 */
public final class cyblack_cyc_event_knowledge_sources extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_cyc_event_knowledge_sources() {
    }

    public static final SubLFile me = new cyblack_cyc_event_knowledge_sources();


    // // Definitions
    public static final SubLObject subloop_reserved_initialize_acknowledge_event_root_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_event_root_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_event_root_stimulation_ks_p(SubLObject acknowledge_event_root_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_event_root_stimulation_ks, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_event_root_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt4);
        return self;
    }

    public static final SubLObject acknowledge_event_root_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_event_root_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_event_root_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym57$OUTER_CATCH_FOR_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_event_root_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_METHOD);
            }
            return catch_var_for_acknowledge_event_root_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_event_root_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_event_root_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_event_root_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_event_root_stimulation_proposal_p(SubLObject acknowledge_event_root_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_event_root_stimulation_proposal, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_event_root_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_event_root_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_event_root_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_event_root_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_event_root_stimulation_ksi_p(SubLObject acknowledge_event_root_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_event_root_stimulation_ksi, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_event_root_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_event_root_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_event_root_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_event_root_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_EVENT_ROOT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_system_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_system_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_system_event_stimulation_ks_p(SubLObject acknowledge_system_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_system_event_stimulation_ks, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_system_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt121);
        return self;
    }

    public static final SubLObject acknowledge_system_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_system_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_system_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym129$OUTER_CATCH_FOR_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_system_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym129$OUTER_CATCH_FOR_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_METHOD);
            }
            return catch_var_for_acknowledge_system_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_system_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_system_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_system_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_system_event_stimulation_proposal_p(SubLObject acknowledge_system_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_system_event_stimulation_proposal, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_system_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_system_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_system_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_system_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_system_event_stimulation_ksi_p(SubLObject acknowledge_system_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_system_event_stimulation_ksi, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_system_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_system_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_system_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_system_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ks_p(SubLObject acknowledge_sublisp_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_sublisp_event_stimulation_ks, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt147);
        return self;
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_sublisp_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym155$OUTER_CATCH_FOR_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_sublisp_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym155$OUTER_CATCH_FOR_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_METHOD);
            }
            return catch_var_for_acknowledge_sublisp_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_proposal_p(SubLObject acknowledge_sublisp_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_sublisp_event_stimulation_proposal, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ksi_p(SubLObject acknowledge_sublisp_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_sublisp_event_stimulation_ksi, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_sublisp_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_sublisp_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_application_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_application_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_application_event_stimulation_ks_p(SubLObject acknowledge_application_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_application_event_stimulation_ks, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_application_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt173);
        return self;
    }

    public static final SubLObject acknowledge_application_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_application_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_application_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym181$OUTER_CATCH_FOR_ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_METH, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_application_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym181$OUTER_CATCH_FOR_ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_METH);
            }
            return catch_var_for_acknowledge_application_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_application_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_application_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_application_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_application_event_stimulation_proposal_p(SubLObject acknowledge_application_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_application_event_stimulation_proposal, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_application_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_application_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_application_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_application_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_application_event_stimulation_ksi_p(SubLObject acknowledge_application_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_application_event_stimulation_ksi, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_application_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_application_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_application_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_application_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ks_p(SubLObject acknowledge_cyc_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_cyc_event_stimulation_ks, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt199);
        return self;
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_cyc_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym207$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_cyc_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym207$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_METHOD);
            }
            return catch_var_for_acknowledge_cyc_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_proposal_p(SubLObject acknowledge_cyc_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_cyc_event_stimulation_proposal, ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ksi_p(SubLObject acknowledge_cyc_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_cyc_event_stimulation_ksi, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_cyc_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_cyc_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_CYC_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ks_p(SubLObject acknowledge_kb_store_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_kb_store_event_stimulation_ks, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt225);
        return self;
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_kb_store_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym233$OUTER_CATCH_FOR_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_kb_store_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym233$OUTER_CATCH_FOR_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_METHOD);
            }
            return catch_var_for_acknowledge_kb_store_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_proposal_p(SubLObject acknowledge_kb_store_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_kb_store_event_stimulation_proposal, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ksi_p(SubLObject acknowledge_kb_store_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_kb_store_event_stimulation_ksi, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_kb_store_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_kb_store_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_inference_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_inference_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ks_p(SubLObject acknowledge_inference_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_inference_event_stimulation_ks, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt251);
        return self;
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_inference_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym259$OUTER_CATCH_FOR_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_inference_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym259$OUTER_CATCH_FOR_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_METHOD);
            }
            return catch_var_for_acknowledge_inference_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_inference_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_inference_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_inference_event_stimulation_proposal_p(SubLObject acknowledge_inference_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_inference_event_stimulation_proposal, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_inference_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_inference_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_inference_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_inference_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ksi_p(SubLObject acknowledge_inference_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_inference_event_stimulation_ksi, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_inference_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_inference_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ks_p(SubLObject acknowledge_sbhl_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_sbhl_event_stimulation_ks, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt277);
        return self;
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_sbhl_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym285$OUTER_CATCH_FOR_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_sbhl_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym285$OUTER_CATCH_FOR_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_METHOD);
            }
            return catch_var_for_acknowledge_sbhl_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_proposal_p(SubLObject acknowledge_sbhl_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_sbhl_event_stimulation_proposal, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ksi_p(SubLObject acknowledge_sbhl_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_sbhl_event_stimulation_ksi, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_sbhl_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_sbhl_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_SBHL_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_nl_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_nl_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ks_p(SubLObject acknowledge_nl_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_nl_event_stimulation_ks, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt303);
        return self;
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_nl_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym311$OUTER_CATCH_FOR_ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_nl_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym311$OUTER_CATCH_FOR_ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_METHOD);
            }
            return catch_var_for_acknowledge_nl_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_nl_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_nl_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_nl_event_stimulation_proposal_p(SubLObject acknowledge_nl_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_nl_event_stimulation_proposal, ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_nl_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_nl_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_nl_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_nl_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ksi_p(SubLObject acknowledge_nl_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_nl_event_stimulation_ksi, ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_nl_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_nl_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_NL_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ks_p(SubLObject acknowledge_cyc_application_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_cyc_application_event_stimulation_ks, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt329);
        return self;
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_cyc_application_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym337$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_cyc_application_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym337$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_);
            }
            return catch_var_for_acknowledge_cyc_application_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_proposal_p(SubLObject acknowledge_cyc_application_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_cyc_application_event_stimulation_proposal, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ksi_p(SubLObject acknowledge_cyc_application_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_cyc_application_event_stimulation_ksi, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_cyc_application_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_cyc_application_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ks_p(SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_missing_knowledge_discovery_event_stimulation_ks, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt355);
        return self;
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_missing_knowledge_discovery_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance($sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym363$OUTER_CATCH_FOR_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STI, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_missing_knowledge_discovery_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym363$OUTER_CATCH_FOR_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STI);
            }
            return catch_var_for_acknowledge_missing_knowledge_discovery_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_proposal_p(SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_missing_knowledge_discovery_event_stimulation_proposal, $sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA);
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ksi_p(SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_missing_knowledge_discovery_event_stimulation_ksi, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_missing_knowledge_discovery_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_missing_knowledge_discovery_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ks_p(SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_unlexified_term_discovery_event_stimulation_ks, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt381);
        return self;
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_unlexified_term_discovery_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym389$OUTER_CATCH_FOR_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMU, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_unlexified_term_discovery_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym389$OUTER_CATCH_FOR_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMU);
            }
            return catch_var_for_acknowledge_unlexified_term_discovery_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_proposal_p(SubLObject acknowledge_unlexified_term_discovery_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_unlexified_term_discovery_event_stimulation_proposal, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ksi_p(SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_unlexified_term_discovery_event_stimulation_ksi, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_unlexified_term_discovery_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_unlexified_term_discovery_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_p(SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_base_event_posting_event_stimulation_ks, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt407);
        return self;
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance($sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym415$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym415$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_);
            }
            return catch_var_for_acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_p(SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal, $sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP);
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_p(SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_p(SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_login_event_posting_event_stimulation_ks, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt433);
        return self;
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance($sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym441$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym441$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT);
            }
            return catch_var_for_acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_p(SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal, $sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO);
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_p(SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_p(SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks, $sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt459);
        return self;
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance($sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym467$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_E, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym467$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_E);
            }
            return catch_var_for_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_p(SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal, $sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_p(SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi, $sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_p(SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks, $sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt485);
        return self;
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance($sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym493$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POST, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym493$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POST);
            }
            return catch_var_for_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_p(SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal, $sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_p(SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi, $sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, $sym481$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_p(SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks, $sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt511);
        return self;
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance($sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym519$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym519$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_);
            }
            return catch_var_for_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_p(SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal, $sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_p(SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi, $sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, $sym507$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ks_p(SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_rkf_base_event_posting_event_stimulation_ks, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt537);
        return self;
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_rkf_base_event_posting_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym545$OUTER_CATCH_FOR_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULAT, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_rkf_base_event_posting_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym545$OUTER_CATCH_FOR_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULAT);
            }
            return catch_var_for_acknowledge_rkf_base_event_posting_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_proposal_p(SubLObject acknowledge_rkf_base_event_posting_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_rkf_base_event_posting_event_stimulation_proposal, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ksi_p(SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_rkf_base_event_posting_event_stimulation_ksi, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_rkf_base_event_posting_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_rkf_base_event_posting_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ks_p(SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_rkf_trace_event_posting_event_stimulation_ks, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt563);
        return self;
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_rkf_trace_event_posting_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym571$OUTER_CATCH_FOR_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULA, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_rkf_trace_event_posting_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym571$OUTER_CATCH_FOR_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULA);
            }
            return catch_var_for_acknowledge_rkf_trace_event_posting_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_proposal_p(SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_rkf_trace_event_posting_event_stimulation_proposal, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL);
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ksi_p(SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_rkf_trace_event_posting_event_stimulation_ksi, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_rkf_trace_event_posting_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_rkf_trace_event_posting_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_p(SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks) {
        return classes.subloop_instanceof_class(acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS);
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt589);
        return self;
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance($sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt60));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym597$OUTER_CATCH_FOR_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_method = Errors.handleThrowable(ccatch_env_var, $sym597$OUTER_CATCH_FOR_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_);
            }
            return catch_var_for_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_method;
        }
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_p(SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal) {
        return classes.subloop_instanceof_class(acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal, $sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP);
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_p(SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi) {
        return classes.subloop_instanceof_class(acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI);
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, UNPROVIDED);
                                        posting = acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION, $RESPONSIBLE_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_remove_event_root_posting_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_remove_event_root_posting_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE, BINDING_LIST, NIL);
        return NIL;
    }

    public static final SubLObject remove_event_root_posting_ks_p(SubLObject remove_event_root_posting_ks) {
        return classes.subloop_instanceof_class(remove_event_root_posting_ks, REMOVE_EVENT_ROOT_POSTING_KS);
    }

    public static final SubLObject remove_event_root_posting_ks_initialize_method(SubLObject self) {
        cyblack_defks.cyblack_auto_generated_internal_knowledge_source_initialize_method(self);
        cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(self, NIL);
        cyblack_ks.cyblack_basic_knowledge_source_set_unification_robot_class_method(self, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(self, $list_alt4);
        return self;
    }

    public static final SubLObject remove_event_root_posting_ks_on_startup_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ks_on_startup_method(self);
    }

    public static final SubLObject remove_event_root_posting_ks_create_proposals_method(SubLObject self, SubLObject environment) {
        {
            SubLObject catch_var_for_remove_event_root_posting_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject proposals = NIL;
                        SubLObject target_posting = (NIL != environment) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(environment, GET, $sym59$_TARGET_POSTING))) : NIL;
                        cyblack_utilities.cyblack_silence(target_posting);
                        {
                            SubLObject proposal = object.new_class_instance(REMOVE_EVENT_ROOT_POSTING_PROPOSAL);
                            cyblack_object.cyblack_object_set_application_method(proposal, application);
                            cyblack_proposal.cyblack_internal_proposal_set_knowledge_source_method(proposal, self);
                            cyblack_proposal.cyblack_basic_proposal_set_proposed_contributions_method(proposal, cyblack_proposal.cyblack_basic_proposal_create_datatype_bag_method(proposal, $list_alt622));
                            cyblack_defks.cyblack_auto_generated_internal_proposal_set_proposal_index_method(proposal, ZERO_INTEGER);
                            cyblack_proposal.cyblack_internal_proposal_set_activation_pattern_method(proposal, environment);
                            cyblack_proposal.cyblack_internal_proposal_set_reasons_method(proposal, $list_alt61);
                            methods.funcall_instance_method_with_2_args(proposal, BIND_VAR, TARGET_POSTING, target_posting);
                            proposals = cons(proposal, proposals);
                        }
                        sublisp_throw($sym621$OUTER_CATCH_FOR_REMOVE_EVENT_ROOT_POSTING_KS_METHOD, nreverse(proposals));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_remove_event_root_posting_ks_method = Errors.handleThrowable(ccatch_env_var, $sym621$OUTER_CATCH_FOR_REMOVE_EVENT_ROOT_POSTING_KS_METHOD);
            }
            return catch_var_for_remove_event_root_posting_ks_method;
        }
    }

    public static final SubLObject remove_event_root_posting_ks_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject ksi = object.new_class_instance(REMOVE_EVENT_ROOT_POSTING_KSI);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_ksi_index_method(ksi, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(proposal));
            cyblack_ks.cyblack_proto_knowledge_source_link_ksi_method(self, ksi);
            cyblack_defks.cyblack_auto_generated_internal_ksi_set_proposal_method(ksi, proposal);
            return ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_remove_event_root_posting_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_remove_event_root_posting_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, PROPOSAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_PROPOSAL, TRACE_BASIC_METHODS, NIL);
        return NIL;
    }

    public static final SubLObject remove_event_root_posting_proposal_p(SubLObject remove_event_root_posting_proposal) {
        return classes.subloop_instanceof_class(remove_event_root_posting_proposal, REMOVE_EVENT_ROOT_POSTING_PROPOSAL);
    }

    public static final SubLObject remove_event_root_posting_proposal_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_proposal_initialize_method(self);
    }

    public static final SubLObject remove_event_root_posting_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject generated_ksi = cyblack_defks.cyblack_internal_base_proposal_generate_ksi_method(self);
            if (NIL != generated_ksi) {
                instances.set_slot(generated_ksi, KSI_INDEX, cyblack_defks.cyblack_auto_generated_internal_proposal_get_proposal_index_method(self));
            }
            return generated_ksi;
        }
    }

    public static final SubLObject subloop_reserved_initialize_remove_event_root_posting_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, AUTO_GENERATED_KS_ASSISTENT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_remove_event_root_posting_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, IS_PROPOSAL_AUTO_GENERATED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, KSI_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, TRACE_BASIC_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_AUTO_GENERATED_INTERNAL_KSI, PROPOSAL, NIL);
        return NIL;
    }

    public static final SubLObject remove_event_root_posting_ksi_p(SubLObject remove_event_root_posting_ksi) {
        return classes.subloop_instanceof_class(remove_event_root_posting_ksi, REMOVE_EVENT_ROOT_POSTING_KSI);
    }

    public static final SubLObject remove_event_root_posting_ksi_initialize_method(SubLObject self) {
        return cyblack_defks.cyblack_internal_base_ksi_initialize_method(self);
    }

    public static final SubLObject remove_event_root_posting_ksi_create_posting_method(SubLObject self, SubLObject datatype) {
        return cyblack_defks.cyblack_internal_base_ksi_create_posting_method(self, datatype);
    }

    public static final SubLObject remove_event_root_posting_ksi_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.cyblack_object_get_application_method(self);
                SubLObject ksi_index = cyblack_defks.cyblack_auto_generated_internal_ksi_get_ksi_index_method(self);
                cyblack_utilities.cyblack_silence(ksi_index);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == application) {
                        Errors.error($str_alt108$_EXECUTE__S___No_application_is_a, self);
                    }
                }
                {
                    SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == blackboard) {
                            Errors.error($str_alt109$_EXECUTE__S___No_blackboard_is_as, self, application);
                        }
                    }
                    {
                        SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == datatype_dictionary) {
                                Errors.error($str_alt110$_EXECUTE__S___No_datatype_diction, self, application);
                            }
                        }
                        {
                            SubLObject datatype = NIL;
                            SubLObject posting = NIL;
                            cyblack_utilities.cyblack_silence(datatype);
                            cyblack_utilities.cyblack_silence(posting);
                            {
                                SubLObject pcase_var = ksi_index;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    {
                                        SubLObject target_posting = methods.funcall_instance_method_with_1_args(self, EVAL_VAR, TARGET_POSTING);
                                        cyblack_utilities.cyblack_silence(target_posting);
                                        cyblack_blackboard.cyblack_blackboard_unpost(blackboard, target_posting);
                                        datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, $str_alt635$ACKNOWLEDGE_POSTING_REMOVAL_POSTI, UNPROVIDED);
                                        posting = remove_event_root_posting_ksi_create_posting_method(self, datatype);
                                        object.object_assimilate_method(posting, list($RESPONSIBLE_KS, $sym507$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $RESPONSIBLE_POSTING, target_posting, $REMOVED_POSTING, target_posting, $CONFIDENCE, ONE_INTEGER));
                                        cyblack_blackboard.cyblack_blackboard_post(blackboard, posting);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_test_knowledge_source_battery_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_test_knowledge_source_battery_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, KSB_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, INTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, KNOWLEDGE_SOURCES_WAITING_FOR_APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, EKSC_TO_PORT_ID_MAP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, STORED_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, STORED_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_test_knowledge_source_battery_p(SubLObject cyblack_cyc_event_test_knowledge_source_battery) {
        return classes.subloop_instanceof_class(cyblack_cyc_event_test_knowledge_source_battery, CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject cyblack_cyc_event_test_knowledge_source_battery_initialize_method(SubLObject self) {
        cyblack_ksb.cyblack_basic_knowledge_source_battery_initialize_method(self);
        cyblack_ksb.cyblack_basic_knowledge_source_battery_add_internal_knowledge_source_class_method(self, CYBLACK_MUMBLER_KS);
        cyblack_ksb.cyblack_basic_knowledge_source_battery_add_internal_knowledge_source_class_method(self, REMOVE_EVENT_ROOT_POSTING_KS);
        cyblack_ksb.cyblack_basic_knowledge_source_battery_add_external_knowledge_source_class_method(self, CYBLACK_ISI_WHY_NOT_KS);
        cyblack_ksb.cyblack_basic_knowledge_source_battery_add_eksc_to_port_id_association_method(self, CYBLACK_ISI_WHY_NOT_KS, $int$3599);
        return self;
    }

    public static final SubLObject cyblack_cyc_event_test_knowledge_source_battery_on_startup_method(SubLObject self) {
        cyblack_defksb.cyblack_defksb_base_on_startup_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_test_knowledge_source_battery_on_shutdown_method(SubLObject self) {
        cyblack_ksb.cyblack_basic_knowledge_source_battery_on_shutdown_method(self);
        return NIL;
    }

    // defvar
    private static final SubLSymbol $virb3$ = makeSymbol("*VIRB3*");

    public static final SubLObject get_virb3() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $virb3$.getDynamicValue(thread);
        }
    }

    // defvar
    private static final SubLSymbol $virb3_minimum_sleep_interval$ = makeSymbol("*VIRB3-MINIMUM-SLEEP-INTERVAL*");

    // defvar
    private static final SubLSymbol $virb3_maximum_sleep_interval$ = makeSymbol("*VIRB3-MAXIMUM-SLEEP-INTERVAL*");

    public static final SubLObject virb3_normalize_sleep_interval(SubLObject proposed_sleep_interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return max(min(proposed_sleep_interval, $virb3_maximum_sleep_interval$.getDynamicValue(thread)), $virb3_minimum_sleep_interval$.getDynamicValue(thread));
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_blackboard_application_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_blackboard_application_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, DELAY_STANDARD_INITIALIZATION_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_blackboard_application_p(SubLObject cyblack_cyc_event_blackboard_application) {
        return classes.subloop_instanceof_class(cyblack_cyc_event_blackboard_application, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION);
    }

    public static final SubLObject cyblack_cyc_event_blackboard_application_initialize_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_application.$cyblack_application$.setDynamicValue(self, thread);
            cyblack_defapp.cyblack_defapp_external_base_initialize_method(self);
            cyblack_application.cyblack_basic_application_set_application_name_method(self, $$$VirB3);
            cyblack_application.cyblack_basic_application_set_agenda_class_method(self, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA);
            cyblack_application.cyblack_app_install_agenda(self, object.new_class_instance(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA));
            {
                SubLObject new_message_broker = object.object_new_method(CYBLACK_MESSAGE_BROKER);
                cyblack_application.cyblack_basic_application_install_message_broker_method(self, new_message_broker);
                {
                    SubLObject new_external_connection = (NIL != cyblack_defapp.$cyblack_default_connection_class$.getDynamicValue(thread)) ? ((SubLObject) (object.new_object_instance(cyblack_defapp.$cyblack_default_connection_class$.getDynamicValue(thread)))) : NIL;
                    if (NIL != new_external_connection) {
                        methods.funcall_instance_method_with_1_args(new_external_connection, SET_APPLICATION, self);
                        methods.funcall_instance_method_with_1_args(new_external_connection, ASSIGN_MESSAGE_BROKER, new_message_broker);
                        cyblack_application.cyblack_basic_application_install_external_connection_method(self, new_external_connection);
                    }
                }
            }
            cyblack_application.cyblack_basic_application_set_blackboard_class_method(self, CYBLACK_CYC_EVENT_BLACKBOARD);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt703$EVENT_ROOT_POSTING, $$$POSTING, CYBLACK_CEM_EVENT_ROOT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt707$SYSTEM_EVENT_POSTING, $str_alt703$EVENT_ROOT_POSTING, CYBLACK_CEM_SYSTEM_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt709$SUBLISP_EVENT_POSTING, $str_alt707$SYSTEM_EVENT_POSTING, CYBLACK_CEM_SUBLISP_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt711$APPLICATION_EVENT_POSTING, $str_alt703$EVENT_ROOT_POSTING, CYBLACK_CEM_APPLICATION_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt713$CYC_EVENT_POSTING, $str_alt711$APPLICATION_EVENT_POSTING, CYBLACK_CEM_CYC_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt715$KB_STORE_EVENT_POSTING, $str_alt713$CYC_EVENT_POSTING, CYBLACK_CEM_KB_STORE_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt717$INFERENCE_EVENT_POSTING, $str_alt713$CYC_EVENT_POSTING, CYBLACK_CEM_INFERENCE_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt719$SBHL_EVENT_POSTING, $str_alt713$CYC_EVENT_POSTING, CYBLACK_CEM_SBHL_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt721$NL_EVENT_POSTING, $str_alt713$CYC_EVENT_POSTING, CYBLACK_CEM_NL_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt723$CYC_APPLICATION_EVENT_POSTING, $str_alt713$CYC_EVENT_POSTING, CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt725$MISSING_KNOWLEDGE_DISCOVERY_EVENT, $str_alt723$CYC_APPLICATION_EVENT_POSTING, CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt727$UNLEXIFIED_TERM_DISCOVERY_EVENT_P, $str_alt725$MISSING_KNOWLEDGE_DISCOVERY_EVENT, CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt729$CYC_BROWSER_BASE_EVENT_POSTING, $str_alt713$CYC_EVENT_POSTING, CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt731$CYC_BROWSER_LOGIN_EVENT_POSTING, $str_alt729$CYC_BROWSER_BASE_EVENT_POSTING, CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt733$CYC_BROWSER_SELECTION_EVENT_POSTI, $str_alt729$CYC_BROWSER_BASE_EVENT_POSTING, CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt735$CYC_BROWSER_FORT_SELECTION_EVENT_, $str_alt733$CYC_BROWSER_SELECTION_EVENT_POSTI, CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt737$CYC_BROWSER_CONSTANT_SELECTION_EV, $str_alt735$CYC_BROWSER_FORT_SELECTION_EVENT_, CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt739$RKF_BASE_EVENT_POSTING, $str_alt723$CYC_APPLICATION_EVENT_POSTING, CYBLACK_RKF_BASE_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt741$RKF_TRACE_EVENT_POSTING, $str_alt739$RKF_BASE_EVENT_POSTING, CYBLACK_RKF_TRACE_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt743$UIA_BLUE_EVENT_POSTING, $str_alt739$RKF_BASE_EVENT_POSTING, CYBLACK_UIA_BLUE_EVENT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt745$TEST_ROOT_POSTING, $$$POSTING, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING, $str_alt745$TEST_ROOT_POSTING, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt635$ACKNOWLEDGE_POSTING_REMOVAL_POSTI, $str_alt745$TEST_ROOT_POSTING, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt749$ISI_ROOT, $$$POSTING, ISI_ROOT_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt751$ISI_DATUM, $str_alt749$ISI_ROOT, ISI_DATUM_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt753$FAILED_QUERY, $str_alt751$ISI_DATUM, ISI_PROBLEM, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_declare_subtype_method(self, $str_alt755$QUERY_IMPROVEMENT_PROPOSAL, $str_alt751$ISI_DATUM, ISI_QUERY_IMPROVEMENT_PROPOSAL, CYBLACK_BASIC_PANEL);
            cyblack_application.cyblack_basic_application_set_connection_class_method(self, CYBLACK_STANDARD_EXTERNAL_CONNECTION);
            cyblack_application.cyblack_basic_application_set_message_broker_class_method(self, CYBLACK_MESSAGE_BROKER);
            {
                SubLObject ksb = object.new_object_instance(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY);
                SubLObject name = NIL;
                SubLObject ks_class = NIL;
                SubLObject port = NIL;
                cyblack_utilities.cyblack_silence(name);
                {
                    SubLObject cdolist_list_var = $list_alt758;
                    SubLObject triplet = NIL;
                    for (triplet = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triplet = cdolist_list_var.first()) {
                        name = triplet.first();
                        ks_class = second(triplet);
                        port = third(triplet);
                        cyblack_ksb.cyblack_basic_knowledge_source_battery_add_external_knowledge_source_class_method(ksb, ks_class);
                        cyblack_ksb.cyblack_basic_knowledge_source_battery_add_eksc_to_port_id_association_method(ksb, ks_class, port);
                    }
                }
                {
                    SubLObject cdolist_list_var = $list_alt760;
                    SubLObject pair_var = NIL;
                    for (pair_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair_var = cdolist_list_var.first()) {
                        name = pair_var.first();
                        ks_class = second(pair_var);
                        methods.funcall_instance_method_with_1_args(ksb, ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS, ks_class);
                    }
                }
                cyblack_application.cyblack_basic_application_install_knowledge_source_battery_method(self, ksb);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_cyc_event_blackboard_application_generated_on_startup_method(SubLObject self) {
        cyblack_defapp.cyblack_defapp_base_generated_on_startup_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_blackboard_application_user_on_startup_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_defapp.cyblack_defapp_base_user_on_startup_method(self);
            $virb3$.setDynamicValue(self, thread);
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt767$__Starting_Cyc_Event_Blackboard_A);
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.setDynamicValue(self, thread);
            cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.setDynamicValue(cyblack_application.cyblack_basic_application_get_agenda_method(self), thread);
            if ((NIL != cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread)) && (NIL != cyblack_cyc_event_model_glue.$cyblack_buffered_event_postings$.getDynamicValue(thread))) {
                while (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(cyblack_cyc_event_model_glue.$cyblack_buffered_event_postings$.getDynamicValue(thread))) {
                    cyblack_cyc_event_bb_agenda.cyblack_cyc_event_bb_lazy_agenda_enqueue_serialized_event_method(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread), subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(cyblack_cyc_event_model_glue.$cyblack_buffered_event_postings$.getDynamicValue(thread)));
                } 
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_cyc_event_blackboard_application_generated_on_shutdown_method(SubLObject self) {
        cyblack_defapp.cyblack_defapp_base_generated_on_shutdown_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_blackboard_application_user_on_shutdown_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_defapp.cyblack_defapp_base_user_on_shutdown_method(self);
            cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.setDynamicValue(NIL, thread);
            cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.setDynamicValue(NIL, thread);
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt774$__Halting_Cyc_Event_Blackboard_Ap);
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static final SubLObject cyblack_cyc_event_blackboard_application_on_quiescence_method(SubLObject self) {
        cyblack_application.cyblack_basic_application_on_quiescence_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_blackboard_application_on_empty_agenda_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_cyc_event_blackboard_application_method = NIL;
                SubLObject v_agenda = cyblack_application.get_cyblack_basic_application_agenda(self);
                SubLObject blackboard = cyblack_application.get_cyblack_basic_application_blackboard(self);
                try {
                    try {
                        cyblack_defapp.cyblack_defapp_external_base_on_empty_agenda_method(self);
                        {
                            SubLObject event = cyblack_cyc_event_bb_agenda.cyblack_cyc_event_bb_agenda_dequeue_event_method(v_agenda);
                            if (NIL != event) {
                                cyblack_blackboard.cyblack_blackboard_post(blackboard, event);
                            }
                            if ((NIL == event) && (NIL != cyblack_agenda.cyblack_basic_simple_agenda_empty_p_method(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread)))) {
                                cyblack_cyc_event_bb_agenda.cyblack_cyc_event_bb_lazy_agenda_slow_down_method(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread), $virb3_maximum_sleep_interval$.getDynamicValue(thread));
                            }
                        }
                        sleep(virb3_normalize_sleep_interval(cyblack_cyc_event_bb_agenda.cyblack_cyc_event_bb_lazy_agenda_get_current_sleep_interval_method(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread))));
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_application.set_cyblack_basic_application_agenda(self, v_agenda);
                                cyblack_application.set_cyblack_basic_application_blackboard(self, blackboard);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_cyc_event_blackboard_application_method = Errors.handleThrowable(ccatch_env_var, $sym781$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_METHOD);
                }
                return catch_var_for_cyblack_cyc_event_blackboard_application_method;
            }
        }
    }

    public static final SubLObject run_cyblack_cyc_event_blackboard_application() {
        {
            SubLObject app_instance = object.new_object_instance(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION);
            try {
                cyblack_defapp.$cyblack_current_app$.setDynamicValue(app_instance);
                cyblack_application.cyblack_basic_application_run_method(app_instance);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        cyblack_processes.cyblack_kill_application_processes_and_deallocate_application_id(cyblack_application.cyblack_application_get_application_id(app_instance));
                        if (NIL != instances.get_slot(app_instance, PORT_MANAGER)) {
                            methods.funcall_instance_method_with_0_args(instances.get_slot(app_instance, PORT_MANAGER), CLOSE_ALL_PORTS);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return app_instance;
        }
    }

    // defvar
    private static final SubLSymbol $cyblack_blackboard_startup_timeout$ = makeSymbol("*CYBLACK-BLACKBOARD-STARTUP-TIMEOUT*");

    // defvar
    private static final SubLSymbol $cyblack_inside_ensure_cyblack_cyc_event_blackboard_is_running$ = makeSymbol("*CYBLACK-INSIDE-ENSURE-CYBLACK-CYC-EVENT-BLACKBOARD-IS-RUNNING*");

    public static final SubLObject ensure_cyblack_cyc_event_blackboard_application_is_running() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cyblack_inside_ensure_cyblack_cyc_event_blackboard_is_running$.getDynamicValue(thread)) {
                return T;
            }
            {
                SubLObject result = T;
                try {
                    try {
                        $cyblack_inside_ensure_cyblack_cyc_event_blackboard_is_running$.setDynamicValue(T, thread);
                        if (NIL != cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.getDynamicValue(thread)) {
                            {
                                SubLObject application_id = cyblack_application.cyblack_application_get_application_id(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.getDynamicValue(thread));
                                if (NIL != cyblack_processes.cyblack_application_is_running_p(application_id)) {
                                    sublisp_throw($sym784$TAG_FOR_ENSURE_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_IS_RUNNIN, T);
                                }
                            }
                        }
                        cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.setDynamicValue(NIL, thread);
                        make_process($$$VirB3, RUN_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION);
                        {
                            SubLObject start_time = get_universal_time();
                            while (NIL == cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.getDynamicValue(thread)) {
                                sleep($float$0_25);
                                if (subtract(get_universal_time(), start_time).numG($cyblack_blackboard_startup_timeout$.getDynamicValue(thread))) {
                                    sublisp_throw($sym784$TAG_FOR_ENSURE_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_IS_RUNNIN, NIL);
                                }
                            } 
                        }
                        format(T, $str_alt787$__Detected_that_VirB3_is_running_);
                        force_output(T);
                    } catch (Throwable ccatch_env_var) {
                        result = Errors.handleThrowable(ccatch_env_var, $sym784$TAG_FOR_ENSURE_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_IS_RUNNIN);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            $cyblack_inside_ensure_cyblack_cyc_event_blackboard_is_running$.setDynamicValue(NIL, thread);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject enable_virb3() {
        cyblack_cyc_event_model_glue.set_cyblack_cem_enqueue_event_supression_state(NIL);
        cyblack_cyc_event_bb_agenda.set_cyblack_obtain_semaphore_from_event_broker_state(T);
        return T;
    }

    public static final SubLObject disable_virb3() {
        cyblack_cyc_event_model_glue.set_cyblack_cem_enqueue_event_supression_state(T);
        cyblack_cyc_event_bb_agenda.set_cyblack_obtain_semaphore_from_event_broker_state(NIL);
        return T;
    }

    public static final SubLObject enable_and_ensure_virb3() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            disable_virb3();
            if (NIL != cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.getDynamicValue(thread)) {
                cyblack_processes.cyblack_kill_application_processes_and_deallocate_application_id(cyblack_application.cyblack_application_get_application_id(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.getDynamicValue(thread)));
            }
            enable_virb3();
            ensure_cyblack_cyc_event_blackboard_application_is_running();
            return T;
        }
    }

    public static final SubLObject kill_virb3() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            disable_virb3();
            if (NIL != cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.getDynamicValue(thread)) {
                cyblack_processes.cyblack_kill_application_processes_and_deallocate_application_id(cyblack_application.cyblack_application_get_application_id(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.getDynamicValue(thread)));
            }
            cyblack_globals.$cyblack_open_ports$.setDynamicValue(NIL, thread);
            return T;
        }
    }

    public static final SubLObject declare_cyblack_cyc_event_knowledge_sources_file() {
        declareFunction("subloop_reserved_initialize_acknowledge_event_root_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_event_root_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ks_p", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ks_initialize_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ks_on_startup_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_event_root_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_event_root_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_proposal_p", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_proposal_initialize_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_event_root_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_event_root_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ksi_p", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ksi_initialize_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_event_root_stimulation_ksi_execute_method", "ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_system_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_system_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ks_p", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_system_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_system_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_proposal_p", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_system_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_system_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ksi_p", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_system_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ks_p", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_proposal_p", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ksi_p", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_sublisp_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_application_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_application_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ks_p", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_application_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_application_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_proposal_p", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_application_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_application_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ksi_p", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_application_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ks_p", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_proposal_p", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ksi_p", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ks_p", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_proposal_p", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ksi_p", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_kb_store_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_inference_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_inference_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ks_p", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_inference_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_inference_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_proposal_p", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_inference_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_inference_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ksi_p", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_inference_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ks_p", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_proposal_p", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ksi_p", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_sbhl_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_nl_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_nl_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ks_p", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_nl_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_nl_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_proposal_p", "ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_nl_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_nl_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ksi_p", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_nl_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ks_p", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_proposal_p", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ksi_p", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_application_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ks_p", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_proposal_p", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ksi_p", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_missing_knowledge_discovery_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ks_p", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_proposal_p", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ksi_p", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_unlexified_term_discovery_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_p", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_p", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_p", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_p", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_p", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_p", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_p", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_p", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_p", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_p", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_p", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_p", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_p", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_p", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_p", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ks_p", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_proposal_p", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ksi_p", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_rkf_base_event_posting_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ks_p", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_proposal_p", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ksi_p", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_rkf_trace_event_posting_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_p", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-P", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_initialize_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_on_startup_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_create_proposals_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_generate_ksi_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_p", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-P", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_initialize_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_generate_ksi_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_p", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-P", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_initialize_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_create_posting_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_execute_method", "ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_remove_event_root_posting_ks_class", "SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_remove_event_root_posting_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-KS-INSTANCE", 1, 0, false);
        declareFunction("remove_event_root_posting_ks_p", "REMOVE-EVENT-ROOT-POSTING-KS-P", 1, 0, false);
        declareFunction("remove_event_root_posting_ks_initialize_method", "REMOVE-EVENT-ROOT-POSTING-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("remove_event_root_posting_ks_on_startup_method", "REMOVE-EVENT-ROOT-POSTING-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("remove_event_root_posting_ks_create_proposals_method", "REMOVE-EVENT-ROOT-POSTING-KS-CREATE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("remove_event_root_posting_ks_generate_ksi_method", "REMOVE-EVENT-ROOT-POSTING-KS-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_remove_event_root_posting_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_remove_event_root_posting_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("remove_event_root_posting_proposal_p", "REMOVE-EVENT-ROOT-POSTING-PROPOSAL-P", 1, 0, false);
        declareFunction("remove_event_root_posting_proposal_initialize_method", "REMOVE-EVENT-ROOT-POSTING-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("remove_event_root_posting_proposal_generate_ksi_method", "REMOVE-EVENT-ROOT-POSTING-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_remove_event_root_posting_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_remove_event_root_posting_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-KSI-INSTANCE", 1, 0, false);
        declareFunction("remove_event_root_posting_ksi_p", "REMOVE-EVENT-ROOT-POSTING-KSI-P", 1, 0, false);
        declareFunction("remove_event_root_posting_ksi_initialize_method", "REMOVE-EVENT-ROOT-POSTING-KSI-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("remove_event_root_posting_ksi_create_posting_method", "REMOVE-EVENT-ROOT-POSTING-KSI-CREATE-POSTING-METHOD", 2, 0, false);
        declareFunction("remove_event_root_posting_ksi_execute_method", "REMOVE-EVENT-ROOT-POSTING-KSI-EXECUTE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_test_knowledge_source_battery_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_test_knowledge_source_battery_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_knowledge_source_battery_p", "CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-P", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_knowledge_source_battery_initialize_method", "CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_knowledge_source_battery_on_startup_method", "CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_knowledge_source_battery_on_shutdown_method", "CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("get_virb3", "GET-VIRB3", 0, 0, false);
        declareFunction("virb3_normalize_sleep_interval", "VIRB3-NORMALIZE-SLEEP-INTERVAL", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_blackboard_application_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_blackboard_application_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_application_p", "CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-P", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_application_initialize_method", "CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_application_generated_on_startup_method", "CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-GENERATED-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_application_user_on_startup_method", "CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-USER-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_application_generated_on_shutdown_method", "CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-GENERATED-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_application_user_on_shutdown_method", "CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-USER-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_application_on_quiescence_method", "CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-ON-QUIESCENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_application_on_empty_agenda_method", "CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-ON-EMPTY-AGENDA-METHOD", 1, 0, false);
        declareFunction("run_cyblack_cyc_event_blackboard_application", "RUN-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION", 0, 0, false);
        declareFunction("ensure_cyblack_cyc_event_blackboard_application_is_running", "ENSURE-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-IS-RUNNING", 0, 0, false);
        declareFunction("enable_virb3", "ENABLE-VIRB3", 0, 0, false);
        declareFunction("disable_virb3", "DISABLE-VIRB3", 0, 0, false);
        declareFunction("enable_and_ensure_virb3", "ENABLE-AND-ENSURE-VIRB3", 0, 0, false);
        declareFunction("kill_virb3", "KILL-VIRB3", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_cyc_event_knowledge_sources_file() {
        defvar("*VIRB3*", NIL);
        defvar("*VIRB3-MINIMUM-SLEEP-INTERVAL*", $float$0_0);
        defvar("*VIRB3-MAXIMUM-SLEEP-INTERVAL*", $float$10_0);
        defvar("*CYBLACK-BLACKBOARD-STARTUP-TIMEOUT*", TEN_INTEGER);
        defvar("*CYBLACK-INSIDE-ENSURE-CYBLACK-CYC-EVENT-BLACKBOARD-IS-RUNNING*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cyblack_cyc_event_knowledge_sources_file() {
                cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_EVENT_ROOT_STIMULATION, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, $list_alt4);
        classes.subloop_new_class(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, $sym11$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, $sym44$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS);
        subloop_reserved_initialize_acknowledge_event_root_stimulation_ks_class(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, $list_alt46, NIL, $list_alt47);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, $list_alt51, $list_alt55, $list_alt56);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, CREATE_PROPOSALS, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_CREATE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt68);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, $sym73$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PR);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, $sym86$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PR);
        subloop_reserved_initialize_acknowledge_event_root_stimulation_proposal_class(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, INITIALIZE, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL, GENERATE_KSI, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, $sym96$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, $sym100$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS);
        subloop_reserved_initialize_acknowledge_event_root_stimulation_ksi_class(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, CREATE_POSTING, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, $list_alt66, NIL, $list_alt107);
        methods.subloop_register_instance_method(ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, $list_alt121);
        classes.subloop_new_class(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, $sym122$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, $sym123$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_);
        subloop_reserved_initialize_acknowledge_system_event_stimulation_ks_class(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt124);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, $list_alt51, $list_alt127, $list_alt128);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, CREATE_PROPOSALS, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt131);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, $sym133$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, $sym134$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_);
        subloop_reserved_initialize_acknowledge_system_event_stimulation_proposal_class(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, INITIALIZE, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, $sym137$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, $sym138$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_);
        subloop_reserved_initialize_acknowledge_system_event_stimulation_ksi_class(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, CREATE_POSTING, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt141);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, $list_alt147);
        classes.subloop_new_class(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, $sym148$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, $sym149$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION);
        subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ks_class(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt150);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, $list_alt51, $list_alt153, $list_alt154);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, CREATE_PROPOSALS, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt157);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, $sym159$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, $sym160$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION);
        subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_proposal_class(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, INITIALIZE, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, $sym162$ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHO);
        classes.subloop_new_class(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, $sym163$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, $sym164$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION);
        subloop_reserved_initialize_acknowledge_sublisp_event_stimulation_ksi_class(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, CREATE_POSTING, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt167);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, $list_alt173);
        classes.subloop_new_class(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, $sym174$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, $sym175$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA);
        subloop_reserved_initialize_acknowledge_application_event_stimulation_ks_class(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt176);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, $list_alt51, $list_alt179, $list_alt180);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym182$ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_CREATE_PROPOSALS_MET);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt183);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, $sym185$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, $sym186$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA);
        subloop_reserved_initialize_acknowledge_application_event_stimulation_proposal_class(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, INITIALIZE, $sym187$ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL_INITIALIZE_MET);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, $sym188$ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_M);
        classes.subloop_new_class(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, $sym189$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, $sym190$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA);
        subloop_reserved_initialize_acknowledge_application_event_stimulation_ksi_class(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym192$ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI_CREATE_POSTING_METH);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt193);
        methods.subloop_register_instance_method(ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_CYC_EVENT_STIMULATION, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, $list_alt199);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, $sym200$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, $sym201$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_);
        subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ks_class(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt202);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, $list_alt51, $list_alt205, $list_alt206);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, CREATE_PROPOSALS, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt209);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, $sym211$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_PRO);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, $sym212$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_PRO);
        subloop_reserved_initialize_acknowledge_cyc_event_stimulation_proposal_class(ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, INITIALIZE, ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, $sym215$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, $sym216$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI);
        subloop_reserved_initialize_acknowledge_cyc_event_stimulation_ksi_class(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, CREATE_POSTING, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt219);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, $list_alt225);
        classes.subloop_new_class(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, $sym226$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, $sym227$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO);
        subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ks_class(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt228);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, $list_alt51, $list_alt231, $list_alt232);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, CREATE_PROPOSALS, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt235);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, $sym237$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, $sym238$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO);
        subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_proposal_class(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, INITIALIZE, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, $sym240$ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METH);
        classes.subloop_new_class(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, $sym241$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, $sym242$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO);
        subloop_reserved_initialize_acknowledge_kb_store_event_stimulation_ksi_class(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, CREATE_POSTING, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt245);
        methods.subloop_register_instance_method(ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, $list_alt251);
        classes.subloop_new_class(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, $sym252$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, $sym253$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI);
        subloop_reserved_initialize_acknowledge_inference_event_stimulation_ks_class(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt254);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, $list_alt51, $list_alt257, $list_alt258);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym260$ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHO);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt261);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, $sym263$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, $sym264$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI);
        subloop_reserved_initialize_acknowledge_inference_event_stimulation_proposal_class(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, INITIALIZE, $sym265$ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHO);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, $sym266$ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_MET);
        classes.subloop_new_class(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, $sym267$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, $sym268$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI);
        subloop_reserved_initialize_acknowledge_inference_event_stimulation_ksi_class(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, CREATE_POSTING, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt271);
        methods.subloop_register_instance_method(ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_SBHL_EVENT_STIMULATION, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, $list_alt277);
        classes.subloop_new_class(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, $sym278$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, $sym279$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS);
        subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ks_class(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt280);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, $list_alt51, $list_alt283, $list_alt284);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, CREATE_PROPOSALS, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt287);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, $sym289$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PR);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, $sym290$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PR);
        subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_proposal_class(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, INITIALIZE, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, $sym293$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, $sym294$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS);
        subloop_reserved_initialize_acknowledge_sbhl_event_stimulation_ksi_class(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, CREATE_POSTING, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt297);
        methods.subloop_register_instance_method(ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_NL_EVENT_STIMULATION, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, $list_alt303);
        classes.subloop_new_class(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, $sym304$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_C);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, $sym305$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_I);
        subloop_reserved_initialize_acknowledge_nl_event_stimulation_ks_class(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt306);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, INITIALIZE, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, ON_STARTUP, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, $list_alt51, $list_alt309, $list_alt310);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, CREATE_PROPOSALS, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt313);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_KS, GENERATE_KSI, ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, $sym315$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_PROP);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, $sym316$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_PROP);
        subloop_reserved_initialize_acknowledge_nl_event_stimulation_proposal_class(ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, INITIALIZE, ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD);
        classes.subloop_new_class(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, $sym319$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, $sym320$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_);
        subloop_reserved_initialize_acknowledge_nl_event_stimulation_ksi_class(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, INITIALIZE, ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, CREATE_POSTING, ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt323);
        methods.subloop_register_instance_method(ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, $list_alt329);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, $sym330$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, $sym331$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI);
        subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ks_class(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt332);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, INITIALIZE, $sym333$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_INITIALIZE_METHO);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, ON_STARTUP, $sym334$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_ON_STARTUP_METHO);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, $list_alt51, $list_alt335, $list_alt336);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym338$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_CREATE_PROPOSALS);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt339);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS, GENERATE_KSI, $sym340$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_GENERATE_KSI_MET);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, $sym341$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, $sym342$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI);
        subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_proposal_class(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, INITIALIZE, $sym343$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL_INITIALIZE);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, $sym344$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL_GENERATE_K);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, $sym345$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, $sym346$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI);
        subloop_reserved_initialize_acknowledge_cyc_application_event_stimulation_ksi_class(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, INITIALIZE, $sym347$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI_INITIALIZE_METH);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym348$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI_CREATE_POSTING_);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt349);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI, EXECUTE, ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI_EXECUTE_METHOD);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, $sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, $list_alt355);
        classes.subloop_new_class(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, $sym356$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, $sym357$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE);
        subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ks_class(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt358);
        methods.subloop_register_instance_method(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, INITIALIZE, $sym359$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS_INIT);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, ON_STARTUP, $sym360$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS_ON_S);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, $list_alt51, $list_alt361, $list_alt362);
        methods.subloop_register_instance_method(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym364$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS_CREA);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt365);
        methods.subloop_register_instance_method(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS, GENERATE_KSI, $sym366$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS_GENE);
        classes.subloop_new_class($sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners($sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, NIL);
        classes.subloop_note_class_initialization_function($sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, $sym367$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE);
        classes.subloop_note_instance_initialization_function($sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, $sym368$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE);
        subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_proposal_class($sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, INITIALIZE, $sym369$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method($sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA, GENERATE_KSI, $sym370$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA);
        classes.subloop_new_class(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, $sym371$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, $sym372$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE);
        subloop_reserved_initialize_acknowledge_missing_knowledge_discovery_event_stimulation_ksi_class(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, INITIALIZE, $sym373$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI_INI);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym374$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI_CRE);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt375);
        methods.subloop_register_instance_method(ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI, EXECUTE, $sym376$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI_EXE);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, $list_alt381);
        classes.subloop_new_class(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, $sym382$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, $sym383$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY);
        subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ks_class(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt384);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, INITIALIZE, $sym385$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS_INITIA);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, ON_STARTUP, $sym386$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS_ON_STA);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, $list_alt51, $list_alt387, $list_alt388);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym390$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS_CREATE);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt391);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS, GENERATE_KSI, $sym392$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS_GENERA);
        classes.subloop_new_class(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, $sym393$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, $sym394$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY);
        subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_proposal_class(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, INITIALIZE, $sym395$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL_);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, $sym396$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL_);
        classes.subloop_new_class(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, $sym397$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, $sym398$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY);
        subloop_reserved_initialize_acknowledge_unlexified_term_discovery_event_stimulation_ksi_class(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, INITIALIZE, $sym399$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI_INITI);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym400$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI_CREAT);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt401);
        methods.subloop_register_instance_method(ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI, EXECUTE, $sym402$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI_EXECU);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt407);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym408$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym409$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO);
        subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ks_class(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt410);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, INITIALIZE, $sym411$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_I);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, ON_STARTUP, $sym412$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_O);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, $list_alt413, $list_alt414);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym416$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_C);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt417);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, GENERATE_KSI, $sym418$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_G);
        classes.subloop_new_class($sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners($sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, NIL);
        classes.subloop_note_class_initialization_function($sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, $sym419$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO);
        classes.subloop_note_instance_initialization_function($sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, $sym420$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO);
        subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_proposal_class($sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, INITIALIZE, $sym421$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method($sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP, GENERATE_KSI, $sym422$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym423$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym424$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO);
        subloop_reserved_initialize_acknowledge_cyc_browser_base_event_posting_event_stimulation_ksi_class(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, INITIALIZE, $sym425$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym426$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt427);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, EXECUTE, $sym428$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, $sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt433);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, $sym434$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, $sym435$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P);
        subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ks_class(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt436);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, INITIALIZE, $sym437$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS_);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, ON_STARTUP, $sym438$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS_);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, $list_alt439, $list_alt440);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym442$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS_);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt443);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS, GENERATE_KSI, $sym444$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS_);
        classes.subloop_new_class($sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners($sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, NIL);
        classes.subloop_note_class_initialization_function($sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, $sym445$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P);
        classes.subloop_note_instance_initialization_function($sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, $sym446$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P);
        subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_proposal_class($sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, INITIALIZE, $sym447$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method($sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO, GENERATE_KSI, $sym448$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO);
        classes.subloop_new_class(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym449$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym450$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P);
        subloop_reserved_initialize_acknowledge_cyc_browser_login_event_posting_event_stimulation_ksi_class(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, INITIALIZE, $sym451$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym452$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt453);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI, EXECUTE, $sym454$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt459);
        classes.subloop_new_class($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, NIL);
        classes.subloop_note_class_initialization_function($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym460$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE);
        classes.subloop_note_instance_initialization_function($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym461$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE);
        subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ks_class($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt46, NIL, $list_alt462);
        methods.subloop_register_instance_method($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, INITIALIZE, $sym463$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(ON_STARTUP, $sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, ON_STARTUP, $sym464$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, $sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt51, $list_alt465, $list_alt466);
        methods.subloop_register_instance_method($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, CREATE_PROPOSALS, $sym468$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt66, $list_alt67, $list_alt469);
        methods.subloop_register_instance_method($sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, GENERATE_KSI, $sym470$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        classes.subloop_new_class($sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners($sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, NIL);
        classes.subloop_note_class_initialization_function($sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym471$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE);
        classes.subloop_note_instance_initialization_function($sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym472$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE);
        subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_proposal_class($sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, INITIALIZE, $sym473$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method($sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, GENERATE_KSI, $sym474$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        classes.subloop_new_class($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, NIL);
        classes.subloop_note_class_initialization_function($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym475$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE);
        classes.subloop_note_instance_initialization_function($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $sym476$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE);
        subloop_reserved_initialize_acknowledge_cyc_browser_selection_event_posting_event_stimulation_ksi_class($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, INITIALIZE, $sym477$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(CREATE_POSTING, $sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, CREATE_POSTING, $sym478$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        methods.methods_incorporate_instance_method(EXECUTE, $sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, $list_alt66, NIL, $list_alt479);
        methods.subloop_register_instance_method($sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION, EXECUTE, $sym480$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION);
        cyblack_defks.cyblack_create_defks_assistant_extended($sym481$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt485);
        classes.subloop_new_class($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, NIL);
        classes.subloop_note_class_initialization_function($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym486$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO);
        classes.subloop_note_instance_initialization_function($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym487$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO);
        subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ks_class($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt46, NIL, $list_alt488);
        methods.subloop_register_instance_method($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, INITIALIZE, $sym489$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(ON_STARTUP, $sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, ON_STARTUP, $sym490$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, $sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt51, $list_alt491, $list_alt492);
        methods.subloop_register_instance_method($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, CREATE_PROPOSALS, $sym494$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt66, $list_alt67, $list_alt495);
        methods.subloop_register_instance_method($sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, GENERATE_KSI, $sym496$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        classes.subloop_new_class($sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners($sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, NIL);
        classes.subloop_note_class_initialization_function($sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym497$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO);
        classes.subloop_note_instance_initialization_function($sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym498$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO);
        subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_proposal_class($sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, INITIALIZE, $sym499$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method($sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, GENERATE_KSI, $sym500$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        classes.subloop_new_class($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, NIL);
        classes.subloop_note_class_initialization_function($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym501$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO);
        classes.subloop_note_instance_initialization_function($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $sym502$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO);
        subloop_reserved_initialize_acknowledge_cyc_browser_fort_selection_event_posting_event_stimulation_ksi_class($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, INITIALIZE, $sym503$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(CREATE_POSTING, $sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, CREATE_POSTING, $sym504$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        methods.methods_incorporate_instance_method(EXECUTE, $sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, $list_alt66, NIL, $list_alt505);
        methods.subloop_register_instance_method($sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL, EXECUTE, $sym506$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL);
        cyblack_defks.cyblack_create_defks_assistant_extended($sym507$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt511);
        classes.subloop_new_class($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, NIL);
        classes.subloop_note_class_initialization_function($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym512$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE);
        classes.subloop_note_instance_initialization_function($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym513$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE);
        subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ks_class($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt46, NIL, $list_alt514);
        methods.subloop_register_instance_method($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, INITIALIZE, $sym515$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(ON_STARTUP, $sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, ON_STARTUP, $sym516$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, $sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt51, $list_alt517, $list_alt518);
        methods.subloop_register_instance_method($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, CREATE_PROPOSALS, $sym520$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt66, $list_alt67, $list_alt521);
        methods.subloop_register_instance_method($sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, GENERATE_KSI, $sym522$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        classes.subloop_new_class($sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners($sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, NIL);
        classes.subloop_note_class_initialization_function($sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym523$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE);
        classes.subloop_note_instance_initialization_function($sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym524$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE);
        subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_proposal_class($sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, INITIALIZE, $sym525$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method($sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, GENERATE_KSI, $sym526$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        classes.subloop_new_class($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, NIL);
        classes.subloop_note_class_initialization_function($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym527$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE);
        classes.subloop_note_instance_initialization_function($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $sym528$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE);
        subloop_reserved_initialize_acknowledge_cyc_browser_constant_selection_event_posting_event_stimulation_ksi_class($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, INITIALIZE, $sym529$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(CREATE_POSTING, $sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, CREATE_POSTING, $sym530$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        methods.methods_incorporate_instance_method(EXECUTE, $sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, $list_alt66, NIL, $list_alt531);
        methods.subloop_register_instance_method($sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST, EXECUTE, $sym532$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt537);
        classes.subloop_new_class(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym538$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym539$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV);
        subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ks_class(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt540);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, INITIALIZE, $sym541$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_INITIALIZ);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, ON_STARTUP, $sym542$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_ON_STARTU);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, $list_alt543, $list_alt544);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym546$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_CREATE_PR);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt547);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS, GENERATE_KSI, $sym548$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_GENERATE_);
        classes.subloop_new_class(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, $sym549$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, $sym550$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV);
        subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_proposal_class(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, INITIALIZE, $sym551$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL_INI);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, $sym552$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL_GEN);
        classes.subloop_new_class(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym553$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym554$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV);
        subloop_reserved_initialize_acknowledge_rkf_base_event_posting_event_stimulation_ksi_class(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, INITIALIZE, $sym555$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_INITIALI);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym556$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_CREATE_P);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt557);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI, EXECUTE, $sym558$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_EXECUTE_);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt563);
        classes.subloop_new_class(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym564$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym565$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E);
        subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ks_class(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt566);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, INITIALIZE, $sym567$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS_INITIALI);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, ON_STARTUP, $sym568$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS_ON_START);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, $list_alt569, $list_alt570);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym572$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS_CREATE_P);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt573);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS, GENERATE_KSI, $sym574$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS_GENERATE);
        classes.subloop_new_class(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, $sym575$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, $sym576$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E);
        subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_proposal_class(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, INITIALIZE, $sym577$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL_IN);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL, GENERATE_KSI, $sym578$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL_GE);
        classes.subloop_new_class(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym579$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym580$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E);
        subloop_reserved_initialize_acknowledge_rkf_trace_event_posting_event_stimulation_ksi_class(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, INITIALIZE, $sym581$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI_INITIAL);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym582$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI_CREATE_);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt583);
        methods.subloop_register_instance_method(ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI, EXECUTE, $sym584$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI_EXECUTE);
        cyblack_defks.cyblack_create_defks_assistant_extended(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt589);
        classes.subloop_new_class(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym590$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, $sym591$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO);
        subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ks_class(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt46, NIL, $list_alt592);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, INITIALIZE, $sym593$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS_I);
        methods.methods_incorporate_instance_method(ON_STARTUP, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, ON_STARTUP, $sym594$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS_O);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt51, $list_alt595, $list_alt596);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, CREATE_PROPOSALS, $sym598$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS_C);
        methods.methods_incorporate_instance_method(GENERATE_KSI, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, $list_alt66, $list_alt67, $list_alt599);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS, GENERATE_KSI, $sym600$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS_G);
        classes.subloop_new_class($sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners($sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, NIL);
        classes.subloop_note_class_initialization_function($sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, $sym601$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO);
        classes.subloop_note_instance_initialization_function($sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, $sym602$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO);
        subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_proposal_class($sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP);
        methods.methods_incorporate_instance_method(INITIALIZE, $sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method($sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, INITIALIZE, $sym603$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP);
        methods.methods_incorporate_instance_method(GENERATE_KSI, $sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method($sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP, GENERATE_KSI, $sym604$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP);
        classes.subloop_new_class(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, NIL);
        classes.subloop_note_class_initialization_function(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym605$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO);
        classes.subloop_note_instance_initialization_function(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, $sym606$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO);
        subloop_reserved_initialize_acknowledge_cyblack_uia_blue_event_posting_event_stimulation_ksi_class(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, INITIALIZE, $sym607$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI_);
        methods.methods_incorporate_instance_method(CREATE_POSTING, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, CREATE_POSTING, $sym608$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI_);
        methods.methods_incorporate_instance_method(EXECUTE, ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, $list_alt66, NIL, $list_alt609);
        methods.subloop_register_instance_method(ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI, EXECUTE, $sym610$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI_);
        cyblack_defks.cyblack_create_defks_assistant_extended(REMOVE_EVENT_ROOT_POSTING, REMOVE_EVENT_ROOT_POSTING_KS, REMOVE_EVENT_ROOT_POSTING_PROPOSAL, REMOVE_EVENT_ROOT_POSTING_KSI, $list_alt4);
        classes.subloop_new_class(REMOVE_EVENT_ROOT_POSTING_KS, CYBLACK_INTERNAL_BASE_KS, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(REMOVE_EVENT_ROOT_POSTING_KS, NIL);
        classes.subloop_note_class_initialization_function(REMOVE_EVENT_ROOT_POSTING_KS, SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_KS_CLASS);
        classes.subloop_note_instance_initialization_function(REMOVE_EVENT_ROOT_POSTING_KS, SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_KS_INSTANCE);
        subloop_reserved_initialize_remove_event_root_posting_ks_class(REMOVE_EVENT_ROOT_POSTING_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, REMOVE_EVENT_ROOT_POSTING_KS, $list_alt46, NIL, $list_alt47);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_KS, INITIALIZE, REMOVE_EVENT_ROOT_POSTING_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, REMOVE_EVENT_ROOT_POSTING_KS, $list_alt51, NIL, $list_alt52);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_KS, ON_STARTUP, REMOVE_EVENT_ROOT_POSTING_KS_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSALS, REMOVE_EVENT_ROOT_POSTING_KS, $list_alt51, $list_alt619, $list_alt620);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_KS, CREATE_PROPOSALS, REMOVE_EVENT_ROOT_POSTING_KS_CREATE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, REMOVE_EVENT_ROOT_POSTING_KS, $list_alt66, $list_alt67, $list_alt624);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_KS, GENERATE_KSI, REMOVE_EVENT_ROOT_POSTING_KS_GENERATE_KSI_METHOD);
        classes.subloop_new_class(REMOVE_EVENT_ROOT_POSTING_PROPOSAL, CYBLACK_INTERNAL_BASE_PROPOSAL, NIL, NIL, $list_alt71);
        classes.class_set_implements_slot_listeners(REMOVE_EVENT_ROOT_POSTING_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(REMOVE_EVENT_ROOT_POSTING_PROPOSAL, $sym626$SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_PROPOSAL_CL);
        classes.subloop_note_instance_initialization_function(REMOVE_EVENT_ROOT_POSTING_PROPOSAL, $sym627$SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_PROPOSAL_IN);
        subloop_reserved_initialize_remove_event_root_posting_proposal_class(REMOVE_EVENT_ROOT_POSTING_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, REMOVE_EVENT_ROOT_POSTING_PROPOSAL, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_PROPOSAL, INITIALIZE, REMOVE_EVENT_ROOT_POSTING_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, REMOVE_EVENT_ROOT_POSTING_PROPOSAL, $list_alt51, NIL, $list_alt90);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_PROPOSAL, GENERATE_KSI, REMOVE_EVENT_ROOT_POSTING_PROPOSAL_GENERATE_KSI_METHOD);
        classes.subloop_new_class(REMOVE_EVENT_ROOT_POSTING_KSI, CYBLACK_INTERNAL_BASE_KSI, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(REMOVE_EVENT_ROOT_POSTING_KSI, NIL);
        classes.subloop_note_class_initialization_function(REMOVE_EVENT_ROOT_POSTING_KSI, SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_KSI_CLASS);
        classes.subloop_note_instance_initialization_function(REMOVE_EVENT_ROOT_POSTING_KSI, $sym631$SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_KSI_INSTANC);
        subloop_reserved_initialize_remove_event_root_posting_ksi_class(REMOVE_EVENT_ROOT_POSTING_KSI);
        methods.methods_incorporate_instance_method(INITIALIZE, REMOVE_EVENT_ROOT_POSTING_KSI, $list_alt87, NIL, $list_alt88);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_KSI, INITIALIZE, REMOVE_EVENT_ROOT_POSTING_KSI_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, REMOVE_EVENT_ROOT_POSTING_KSI, $list_alt87, $list_alt103, $list_alt104);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_KSI, CREATE_POSTING, REMOVE_EVENT_ROOT_POSTING_KSI_CREATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, REMOVE_EVENT_ROOT_POSTING_KSI, $list_alt66, NIL, $list_alt634);
        methods.subloop_register_instance_method(REMOVE_EVENT_ROOT_POSTING_KSI, EXECUTE, REMOVE_EVENT_ROOT_POSTING_KSI_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_DEFKSB_BASE, NIL, NIL, $list_alt640);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, $sym641$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOUR);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, $sym654$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOUR);
        subloop_reserved_initialize_cyblack_cyc_event_test_knowledge_source_battery_class(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, $list_alt87, NIL, $list_alt655);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, INITIALIZE, CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, $list_alt51, NIL, $list_alt660);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, ON_STARTUP, CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, $list_alt51, NIL, $list_alt663);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY, ON_SHUTDOWN, $sym664$CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY_ON_SHUTDOWN_METHO);
        classes.subloop_new_class(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, CYBLACK_DEFAPP_EXTERNAL_BASE, NIL, NIL, $list_alt669);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $sym670$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICAT);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $sym695$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICAT);
        subloop_reserved_initialize_cyblack_cyc_event_blackboard_application_class(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $list_alt87, NIL, $list_alt696);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, INITIALIZE, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATED_ON_STARTUP, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $list_alt51, NIL, $list_alt763);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, GENERATED_ON_STARTUP, $sym764$CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_GENERATED_ON_STARTUP_MET);
        methods.methods_incorporate_instance_method(USER_ON_STARTUP, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $list_alt51, NIL, $list_alt766);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, USER_ON_STARTUP, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_USER_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(GENERATED_ON_SHUTDOWN, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $list_alt51, NIL, $list_alt770);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, GENERATED_ON_SHUTDOWN, $sym771$CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_GENERATED_ON_SHUTDOWN_ME);
        methods.methods_incorporate_instance_method(USER_ON_SHUTDOWN, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $list_alt51, NIL, $list_alt773);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, USER_ON_SHUTDOWN, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_USER_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(ON_QUIESCENCE, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $list_alt51, NIL, $list_alt777);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, ON_QUIESCENCE, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_ON_QUIESCENCE_METHOD);
        methods.methods_incorporate_instance_method(ON_EMPTY_AGENDA, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, $list_alt51, NIL, $list_alt780);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION, ON_EMPTY_AGENDA, CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_ON_EMPTY_AGENDA_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI");

    static private final SubLList $list_alt4 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("EVENT-ROOT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    private static final SubLSymbol CYBLACK_INTERNAL_BASE_KS = makeSymbol("CYBLACK-INTERNAL-BASE-KS");

    static private final SubLList $list_alt6 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PROPOSALS"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));





    private static final SubLSymbol CYBLACK_AUTO_GENERATED_INTERNAL_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KNOWLEDGE-SOURCE");



    static private final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-CLASS");



    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE");















    private static final SubLSymbol REMOVE_KNOWLEDGE_SOURCES_AT_WILL = makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE");

































    private static final SubLSymbol RANGE_SET = makeSymbol("RANGE-SET");

    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE");







    static private final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-INSTANCE");



    static private final SubLList $list_alt46 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt47 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("EVENT-ROOT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));



    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-INITIALIZE-METHOD");



    static private final SubLList $list_alt51 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt52 = list(list(RET, list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER"))));

    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-ON-STARTUP-METHOD");



    static private final SubLList $list_alt55 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt56 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-METHOD");



    static private final SubLSymbol $sym59$_TARGET_POSTING = makeSymbol("?TARGET-POSTING");

    static private final SubLList $list_alt60 = list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"));

    static private final SubLList $list_alt61 = list(makeKeyword("BY-DEFINITION"));





    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_CREATE_PROPOSALS_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");



    static private final SubLList $list_alt66 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt67 = list(makeSymbol("PROPOSAL"));

    static private final SubLList $list_alt68 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KS-GENERATE-KSI-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_BASE_PROPOSAL = makeSymbol("CYBLACK-INTERNAL-BASE-PROPOSAL");

    static private final SubLList $list_alt71 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), NIL, makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym73$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-CLASS");













    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL = makeSymbol("CYBLACK-INTERNAL-PROPOSAL");









    private static final SubLSymbol PROPOSAL_INDEX = makeSymbol("PROPOSAL-INDEX");

    static private final SubLSymbol $sym86$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLList $list_alt87 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt88 = list(list(RET, list(makeSymbol("INITIALIZE"), makeSymbol("SUPER"))));

    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLList $list_alt90 = list(list(makeSymbol("CLET"), list(list(makeSymbol("GENERATED-KSI"), list(makeSymbol("GENERATE-KSI"), makeSymbol("SUPER")))), list(makeSymbol("PWHEN"), makeSymbol("GENERATED-KSI"), list(makeSymbol("SET-SLOT"), makeSymbol("GENERATED-KSI"), list(QUOTE, makeSymbol("KSI-INDEX")), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("SELF")))), list(RET, makeSymbol("GENERATED-KSI"))));



    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_BASE_KSI = makeSymbol("CYBLACK-INTERNAL-BASE-KSI");

    static private final SubLList $list_alt94 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-POSTING"), list(makeSymbol("DATATYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym96$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-CLASS");







    static private final SubLSymbol $sym100$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-INITIALIZE-METHOD");



    static private final SubLList $list_alt103 = list(makeSymbol("DATATYPE"));

    static private final SubLList $list_alt104 = list(list(RET, list(makeSymbol("CREATE-POSTING"), makeSymbol("SUPER"), makeSymbol("DATATYPE"))));

    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI_CREATE_POSTING_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-CREATE-POSTING-METHOD");



    static private final SubLList $list_alt107 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLString $str_alt108$_EXECUTE__S___No_application_is_a = makeString("(EXECUTE ~S): No application is associated with this KSI.");

    static private final SubLString $str_alt109$_EXECUTE__S___No_blackboard_is_as = makeString("(EXECUTE ~S): No blackboard is associated with application ~S.");

    static private final SubLString $str_alt110$_EXECUTE__S___No_datatype_diction = makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S.");



    static private final SubLString $str_alt112$ACKNOWLEDGE_STIMULATION_POSTING = makeString("ACKNOWLEDGE-STIMULATION-POSTING");

    private static final SubLSymbol $RESPONSIBLE_KS = makeKeyword("RESPONSIBLE-KS");

    private static final SubLSymbol $RESPONSIBLE_POSTING = makeKeyword("RESPONSIBLE-POSTING");



    private static final SubLSymbol ACKNOWLEDGE_EVENT_ROOT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-EVENT-ROOT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt121 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("SYSTEM-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym122$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym123$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt124 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("SYSTEM-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt127 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt128 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym129$OUTER_CATCH_FOR_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt131 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym133$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym134$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym137$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym138$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt141 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_SYSTEM_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-SYSTEM-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt147 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("SUBLISP-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym148$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym149$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt150 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("SUBLISP-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt153 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt154 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym155$OUTER_CATCH_FOR_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt157 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym159$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym160$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym162$ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHO = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym163$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym164$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt167 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_SUBLISP_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-SUBLISP-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt173 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("APPLICATION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym174$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym175$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt176 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("APPLICATION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt179 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt180 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym181$OUTER_CATCH_FOR_ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_METH = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym182$ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_CREATE_PROPOSALS_MET = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt183 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym185$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym186$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym187$ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL_INITIALIZE_MET = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym188$ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_M = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym189$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym190$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_APPLICATION_EVENT_STIMULA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym192$ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI_CREATE_POSTING_METH = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt193 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_APPLICATION_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-APPLICATION-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt199 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym200$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym201$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt202 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt205 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt206 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym207$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt209 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym211$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_PRO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym212$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_PRO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym215$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym216$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt219 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_CYC_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-CYC-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt225 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("KB-STORE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym226$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym227$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt228 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("KB-STORE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt231 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt232 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym233$OUTER_CATCH_FOR_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt235 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym237$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym238$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym240$ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METH = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym241$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym242$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_KB_STORE_EVENT_STIMULATIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt245 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_KB_STORE_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-KB-STORE-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt251 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("INFERENCE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym252$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym253$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt254 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("INFERENCE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt257 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt258 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym259$OUTER_CATCH_FOR_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym260$ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHO = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt261 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym263$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym264$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym265$ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHO = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym266$ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_MET = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym267$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym268$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_INFERENCE_EVENT_STIMULATI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt271 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_INFERENCE_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-INFERENCE-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt277 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("SBHL-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym278$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym279$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt280 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("SBHL-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt283 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt284 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym285$OUTER_CATCH_FOR_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt287 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym289$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym290$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym293$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym294$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt297 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_SBHL_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-SBHL-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt303 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("NL-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym304$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym305$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt306 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("NL-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_ON_STARTUP_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt309 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt310 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym311$OUTER_CATCH_FOR_ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_CREATE_PROPOSALS_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt313 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KS_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym315$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_PROP = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym316$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_PROP = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_PROPOSAL_GENERATE_KSI_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym319$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym320$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-INSTANCE");

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_INITIALIZE_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_CREATE_POSTING_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt323 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_NL_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-NL-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS");



    private static final SubLSymbol ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt329 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-APPLICATION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym330$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym331$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt332 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-APPLICATION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym333$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_INITIALIZE_METHO = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym334$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_ON_STARTUP_METHO = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt335 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt336 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym337$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_ = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym338$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_CREATE_PROPOSALS = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt339 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym340$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KS_GENERATE_KSI_MET = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym341$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym342$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym343$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL_INITIALIZE = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym344$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_PROPOSAL_GENERATE_K = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym345$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym346$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_APPLICATION_EVENT_STI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym347$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI_INITIALIZE_METH = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym348$ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI_CREATE_POSTING_ = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt349 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    private static final SubLSymbol ACKNOWLEDGE_CYC_APPLICATION_EVENT_STIMULATION_KSI_EXECUTE_METHOD = makeSymbol("ACKNOWLEDGE-CYC-APPLICATION-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS");

    static private final SubLSymbol $sym353$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL");

    private static final SubLSymbol ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt355 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym356$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym357$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt358 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym359$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS_INIT = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym360$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS_ON_S = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt361 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt362 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym363$OUTER_CATCH_FOR_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STI = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym364$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS_CREA = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt365 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym366$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KS_GENE = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym367$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym368$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym369$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym370$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_PROPOSA = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym371$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym372$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym373$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI_INI = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym374$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI_CRE = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt375 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym376$ACKNOWLEDGE_MISSING_KNOWLEDGE_DISCOVERY_EVENT_STIMULATION_KSI_EXE = makeSymbol("ACKNOWLEDGE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS");

    private static final SubLSymbol ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL");

    private static final SubLSymbol ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt381 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym382$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym383$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt384 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym385$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS_INITIA = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym386$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS_ON_STA = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt387 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt388 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym389$OUTER_CATCH_FOR_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMU = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym390$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS_CREATE = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt391 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym392$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KS_GENERA = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym393$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym394$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym395$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL_ = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym396$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_PROPOSAL_ = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym397$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym398$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym399$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI_INITI = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym400$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI_CREAT = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt401 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym402$ACKNOWLEDGE_UNLEXIFIED_TERM_DISCOVERY_EVENT_STIMULATION_KSI_EXECU = makeSymbol("ACKNOWLEDGE-UNLEXIFIED-TERM-DISCOVERY-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS");

    static private final SubLSymbol $sym405$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL");

    private static final SubLSymbol ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt407 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-BASE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym408$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym409$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt410 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-BASE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym411$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_I = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym412$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_O = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt413 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt414 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym415$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym416$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_C = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt417 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym418$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_G = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym419$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym420$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym421$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym422$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_PROP = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym423$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym424$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym425$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_ = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym426$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_ = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt427 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym428$ACKNOWLEDGE_CYC_BROWSER_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_ = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS");

    static private final SubLSymbol $sym431$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL");

    private static final SubLSymbol ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt433 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-LOGIN-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym434$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym435$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt436 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-LOGIN-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym437$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS_ = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym438$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS_ = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt439 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt440 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym441$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym442$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS_ = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt443 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym444$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KS_ = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym445$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym446$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym447$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym448$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_PRO = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym449$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym450$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_P = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym451$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym452$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt453 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym454$ACKNOWLEDGE_CYC_BROWSER_LOGIN_EVENT_POSTING_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-LOGIN-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION");

    static private final SubLSymbol $sym456$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS");

    static private final SubLSymbol $sym457$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL");

    static private final SubLSymbol $sym458$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt459 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-SELECTION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym460$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym461$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt462 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-SELECTION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym463$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym464$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt465 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt466 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym467$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_E = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym468$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt469 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym470$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym471$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym472$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym473$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym474$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym475$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym476$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym477$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym478$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt479 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym480$ACKNOWLEDGE_CYC_BROWSER_SELECTION_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    static private final SubLSymbol $sym481$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION");

    static private final SubLSymbol $sym482$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS");

    static private final SubLSymbol $sym483$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL");

    static private final SubLSymbol $sym484$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt485 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym486$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym487$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt488 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym489$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym490$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt491 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt492 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym493$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POST = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym494$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt495 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym496$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym497$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym498$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym499$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym500$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym501$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym502$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym503$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym504$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt505 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym506$ACKNOWLEDGE_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_EVENT_STIMUL = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    static private final SubLSymbol $sym507$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION");

    static private final SubLSymbol $sym508$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS");

    static private final SubLSymbol $sym509$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL");

    static private final SubLSymbol $sym510$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt511 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym512$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym513$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt514 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym515$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym516$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt517 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt518 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym519$OUTER_CATCH_FOR_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym520$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt521 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym522$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym523$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym524$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym525$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym526$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym527$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym528$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym529$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym530$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt531 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym532$ACKNOWLEDGE_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_EVENT_ST = makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS");

    private static final SubLSymbol ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL");

    private static final SubLSymbol ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt537 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("RKF-BASE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym538$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym539$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt540 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("RKF-BASE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym541$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_INITIALIZ = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym542$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_ON_STARTU = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt543 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt544 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym545$OUTER_CATCH_FOR_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULAT = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym546$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_CREATE_PR = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt547 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym548$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KS_GENERATE_ = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym549$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym550$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym551$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL_INI = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym552$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL_GEN = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym553$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym554$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EV = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym555$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_INITIALI = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym556$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_CREATE_P = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt557 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym558$ACKNOWLEDGE_RKF_BASE_EVENT_POSTING_EVENT_STIMULATION_KSI_EXECUTE_ = makeSymbol("ACKNOWLEDGE-RKF-BASE-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS");

    private static final SubLSymbol ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL");

    private static final SubLSymbol ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt563 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("RKF-TRACE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym564$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym565$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt566 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("RKF-TRACE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym567$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS_INITIALI = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym568$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS_ON_START = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt569 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt570 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym571$OUTER_CATCH_FOR_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULA = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym572$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS_CREATE_P = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt573 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym574$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KS_GENERATE = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym575$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym576$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym577$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL_IN = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym578$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_PROPOSAL_GE = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym579$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym580$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym581$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI_INITIAL = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym582$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI_CREATE_ = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt583 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym584$ACKNOWLEDGE_RKF_TRACE_EVENT_POSTING_EVENT_STIMULATION_KSI_EXECUTE = makeSymbol("ACKNOWLEDGE-RKF-TRACE-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION");

    private static final SubLSymbol ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS");

    static private final SubLSymbol $sym587$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL");

    private static final SubLSymbol ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI");

    static private final SubLList $list_alt589 = list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("UIA-BLUE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE);

    static private final SubLSymbol $sym590$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-CLASS");

    static private final SubLSymbol $sym591$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-INSTANCE");

    static private final SubLList $list_alt592 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-POST-AT-WILL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(QUOTE, list(makeKeyword("KS-ARGS"), list(list(makeSymbol("?TARGET-POSTING"), makeString("UIA-BLUE-EVENT-POSTING"))), makeKeyword("BINDING-LIST"), NIL, makeKeyword("WHERE"), $TRUE))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym593$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS_I = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym594$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS_O = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt595 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt596 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-STIMULATION-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym597$OUTER_CATCH_FOR_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-METHOD");

    static private final SubLSymbol $sym598$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS_C = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt599 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    static private final SubLSymbol $sym600$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KS_G = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym601$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-CLASS");

    static private final SubLSymbol $sym602$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INSTANCE");

    static private final SubLSymbol $sym603$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym604$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_PROP = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-PROPOSAL-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym605$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-CLASS");

    static private final SubLSymbol $sym606$SUBLOOP_RESERVED_INITIALIZE_ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-INSTANCE");

    static private final SubLSymbol $sym607$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI_ = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-INITIALIZE-METHOD");

    static private final SubLSymbol $sym608$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI_ = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt609 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER)), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLSymbol $sym610$ACKNOWLEDGE_CYBLACK_UIA_BLUE_EVENT_POSTING_EVENT_STIMULATION_KSI_ = makeSymbol("ACKNOWLEDGE-CYBLACK-UIA-BLUE-EVENT-POSTING-EVENT-STIMULATION-KSI-EXECUTE-METHOD");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING = makeSymbol("REMOVE-EVENT-ROOT-POSTING");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KS = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KS");



    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KSI = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KSI");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_KS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-KS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_KS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-KS-INSTANCE");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KS_INITIALIZE_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KS-INITIALIZE-METHOD");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KS_ON_STARTUP_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt619 = list(makeUninternedSymbol("environment"));

    static private final SubLList $list_alt620 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("proposals"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIF"), makeUninternedSymbol("environment"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN")), makeUninternedSymbol("environment"), list(QUOTE, makeSymbol("?TARGET-POSTING"))), NIL))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), T, list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeUninternedSymbol("proposal"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KNOWLEDGE-SOURCE"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL")), makeUninternedSymbol("proposal"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL")), makeUninternedSymbol("proposal"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CREATE-DATATYPE-BAG"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeString("ACKNOWLEDGE-POSTING-REMOVAL-POSTING"), makeString("EVENT-ROOT-POSTING"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL-INDEX"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL")), makeUninternedSymbol("proposal"), ZERO_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-ACTIVATION-PATTERN"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL")), makeUninternedSymbol("proposal"), makeUninternedSymbol("environment")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-REASONS"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL")), makeUninternedSymbol("proposal"), list(QUOTE, list(makeKeyword("BY-DEFINITION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("proposal"), list(QUOTE, makeSymbol("BIND-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING")), makeSymbol("TARGET-POSTING")), list(makeSymbol("CPUSH"), makeUninternedSymbol("proposal"), makeUninternedSymbol("proposals")) })))), list(RET, list(makeSymbol("NREVERSE"), makeUninternedSymbol("proposals")))));

    static private final SubLSymbol $sym621$OUTER_CATCH_FOR_REMOVE_EVENT_ROOT_POSTING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-REMOVE-EVENT-ROOT-POSTING-KS-METHOD");

    static private final SubLList $list_alt622 = list(makeString("ACKNOWLEDGE-POSTING-REMOVAL-POSTING"), makeString("EVENT-ROOT-POSTING"));

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KS_CREATE_PROPOSALS_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KS-CREATE-PROPOSALS-METHOD");

    static private final SubLList $list_alt624 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("REMOVE-EVENT-ROOT-POSTING-KSI"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-KSI-INDEX"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-KSI")), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPOSAL-INDEX"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL")), makeSymbol("PROPOSAL"))), list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSAL"), makeSymbol("CYBLACK-AUTO-GENERATED-INTERNAL-KSI")), makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KS_GENERATE_KSI_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KS-GENERATE-KSI-METHOD");

    static private final SubLSymbol $sym626$SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_PROPOSAL_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-PROPOSAL-CLASS");

    static private final SubLSymbol $sym627$SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_PROPOSAL_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-PROPOSAL-INSTANCE");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_PROPOSAL_INITIALIZE_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL-INITIALIZE-METHOD");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_PROPOSAL_GENERATE_KSI_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-PROPOSAL-GENERATE-KSI-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_KSI_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-KSI-CLASS");

    static private final SubLSymbol $sym631$SUBLOOP_RESERVED_INITIALIZE_REMOVE_EVENT_ROOT_POSTING_KSI_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REMOVE-EVENT-ROOT-POSTING-KSI-INSTANCE");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KSI_INITIALIZE_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KSI-INITIALIZE-METHOD");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KSI_CREATE_POSTING_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KSI-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt634 = list(list(makeSymbol("CLET"), list(list(makeUninternedSymbol("application"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeUninternedSymbol("ksi-index"), list(makeSymbol("GET-KSI-INDEX"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("ksi-index")), list(makeSymbol("MUST"), makeUninternedSymbol("application"), makeString("(EXECUTE ~S): No application is associated with this KSI."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("blackboard"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("blackboard"), makeString("(EXECUTE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("datatype-dictionary"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeUninternedSymbol("application")))), list(makeSymbol("MUST"), makeUninternedSymbol("datatype-dictionary"), makeString("(EXECUTE ~S): No datatype dictionary is associated with application ~S."), makeSymbol("SELF"), makeUninternedSymbol("application")), list(makeSymbol("CLET"), list(makeUninternedSymbol("datatype"), makeUninternedSymbol("posting")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("datatype")), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("posting")), list(makeSymbol("PCASE"), makeUninternedSymbol("ksi-index"), list(ZERO_INTEGER, list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVAL-VAR")), list(QUOTE, makeSymbol("TARGET-POSTING"))))), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("TARGET-POSTING")), list(makeSymbol("CYBLACK-BLACKBOARD-UNPOST"), makeUninternedSymbol("blackboard"), makeSymbol("TARGET-POSTING")), list(makeSymbol("CSETQ"), makeUninternedSymbol("datatype"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeUninternedSymbol("datatype-dictionary"), makeString("ACKNOWLEDGE-POSTING-REMOVAL-POSTING"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("posting"), list(makeSymbol("CREATE-POSTING"), makeSymbol("SELF"), makeUninternedSymbol("datatype"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("OBJECT")), makeUninternedSymbol("posting"), list(new SubLObject[]{ makeSymbol("LIST"), makeKeyword("RESPONSIBLE-KS"), list(QUOTE, makeSymbol("ACKNOWLEDGE-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-EVENT-STIMULATION")), makeKeyword("RESPONSIBLE-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("REMOVED-POSTING"), makeSymbol("TARGET-POSTING"), makeKeyword("CONFIDENCE"), ONE_INTEGER })), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeUninternedSymbol("blackboard"), makeUninternedSymbol("posting")))))))), list(RET, NIL)));

    static private final SubLString $str_alt635$ACKNOWLEDGE_POSTING_REMOVAL_POSTI = makeString("ACKNOWLEDGE-POSTING-REMOVAL-POSTING");

    private static final SubLSymbol $REMOVED_POSTING = makeKeyword("REMOVED-POSTING");

    private static final SubLSymbol REMOVE_EVENT_ROOT_POSTING_KSI_EXECUTE_METHOD = makeSymbol("REMOVE-EVENT-ROOT-POSTING-KSI-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY = makeSymbol("CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY");

    private static final SubLSymbol CYBLACK_DEFKSB_BASE = makeSymbol("CYBLACK-DEFKSB-BASE");

    static private final SubLList $list_alt640 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym641$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOUR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-CLASS");











    private static final SubLSymbol KSB_DICTIONARY = makeSymbol("KSB-DICTIONARY");

    private static final SubLSymbol INTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol EXTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol KNOWLEDGE_SOURCES_WAITING_FOR_APPLICATION = makeSymbol("KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION");



    private static final SubLSymbol STORED_INTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol STORED_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    static private final SubLSymbol $sym654$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOUR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-INSTANCE");

    static private final SubLList $list_alt655 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-MUMBLER-KS"))), list(makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REMOVE-EVENT-ROOT-POSTING-KS"))), list(makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-ISI-WHY-NOT-KS"))), list(makeSymbol("ADD-EKSC-TO-PORT-ID-ASSOCIATION"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-ISI-WHY-NOT-KS")), list(QUOTE, makeInteger(3599))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_MUMBLER_KS = makeSymbol("CYBLACK-MUMBLER-KS");

    private static final SubLSymbol CYBLACK_ISI_WHY_NOT_KS = makeSymbol("CYBLACK-ISI-WHY-NOT-KS");

    public static final SubLInteger $int$3599 = makeInteger(3599);

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY_INITIALIZE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-INITIALIZE-METHOD");

    static private final SubLList $list_alt660 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY_ON_STARTUP_METHOD = makeSymbol("CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-ON-STARTUP-METHOD");



    static private final SubLList $list_alt663 = list(list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym664$CYBLACK_CYC_EVENT_TEST_KNOWLEDGE_SOURCE_BATTERY_ON_SHUTDOWN_METHO = makeSymbol("CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY-ON-SHUTDOWN-METHOD");

    public static final SubLFloat $float$0_0 = makeDouble(0.0);

    public static final SubLFloat $float$10_0 = makeDouble(10.0);

    private static final SubLSymbol CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION");

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE");

    static private final SubLList $list_alt669 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATED-ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USER-ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATED-ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USER-ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-EMPTY-AGENDA"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym670$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICAT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-CLASS");





    private static final SubLSymbol CYBLACK_DEFAPP_BASE = makeSymbol("CYBLACK-DEFAPP-BASE");

    private static final SubLSymbol DELAY_STANDARD_INITIALIZATION_P = makeSymbol("DELAY-STANDARD-INITIALIZATION-P");

















    private static final SubLSymbol ROOT_DATATYPE = makeSymbol("ROOT-DATATYPE");























    static private final SubLSymbol $sym695$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICAT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-INSTANCE");

    public static final SubLObject $list_alt696 = _constant_696_initializer();

    static private final SubLString $$$VirB3 = makeString("VirB3");







    private static final SubLSymbol ASSIGN_MESSAGE_BROKER = makeSymbol("ASSIGN-MESSAGE-BROKER");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BLACKBOARD = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD");

    static private final SubLString $str_alt703$EVENT_ROOT_POSTING = makeString("EVENT-ROOT-POSTING");

    static private final SubLString $$$POSTING = makeString("POSTING");





    static private final SubLString $str_alt707$SYSTEM_EVENT_POSTING = makeString("SYSTEM-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_SYSTEM_EVENT_POSTING = makeSymbol("CYBLACK-CEM-SYSTEM-EVENT-POSTING");

    static private final SubLString $str_alt709$SUBLISP_EVENT_POSTING = makeString("SUBLISP-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_SUBLISP_EVENT_POSTING = makeSymbol("CYBLACK-CEM-SUBLISP-EVENT-POSTING");

    static private final SubLString $str_alt711$APPLICATION_EVENT_POSTING = makeString("APPLICATION-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_APPLICATION_EVENT_POSTING = makeSymbol("CYBLACK-CEM-APPLICATION-EVENT-POSTING");

    static private final SubLString $str_alt713$CYC_EVENT_POSTING = makeString("CYC-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_CYC_EVENT_POSTING = makeSymbol("CYBLACK-CEM-CYC-EVENT-POSTING");

    static private final SubLString $str_alt715$KB_STORE_EVENT_POSTING = makeString("KB-STORE-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_KB_STORE_EVENT_POSTING = makeSymbol("CYBLACK-CEM-KB-STORE-EVENT-POSTING");

    static private final SubLString $str_alt717$INFERENCE_EVENT_POSTING = makeString("INFERENCE-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_INFERENCE_EVENT_POSTING = makeSymbol("CYBLACK-CEM-INFERENCE-EVENT-POSTING");

    static private final SubLString $str_alt719$SBHL_EVENT_POSTING = makeString("SBHL-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_SBHL_EVENT_POSTING = makeSymbol("CYBLACK-CEM-SBHL-EVENT-POSTING");

    static private final SubLString $str_alt721$NL_EVENT_POSTING = makeString("NL-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_NL_EVENT_POSTING = makeSymbol("CYBLACK-CEM-NL-EVENT-POSTING");

    static private final SubLString $str_alt723$CYC_APPLICATION_EVENT_POSTING = makeString("CYC-APPLICATION-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING = makeSymbol("CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING");

    static private final SubLString $str_alt725$MISSING_KNOWLEDGE_DISCOVERY_EVENT = makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING = makeSymbol("CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING");

    static private final SubLString $str_alt727$UNLEXIFIED_TERM_DISCOVERY_EVENT_P = makeString("UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING = makeSymbol("CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING");

    static private final SubLString $str_alt729$CYC_BROWSER_BASE_EVENT_POSTING = makeString("CYC-BROWSER-BASE-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING");

    static private final SubLString $str_alt731$CYC_BROWSER_LOGIN_EVENT_POSTING = makeString("CYC-BROWSER-LOGIN-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING");

    static private final SubLString $str_alt733$CYC_BROWSER_SELECTION_EVENT_POSTI = makeString("CYC-BROWSER-SELECTION-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING");

    static private final SubLString $str_alt735$CYC_BROWSER_FORT_SELECTION_EVENT_ = makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING");

    static private final SubLString $str_alt737$CYC_BROWSER_CONSTANT_SELECTION_EV = makeString("CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING");

    static private final SubLString $str_alt739$RKF_BASE_EVENT_POSTING = makeString("RKF-BASE-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_RKF_BASE_EVENT_POSTING = makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING");

    static private final SubLString $str_alt741$RKF_TRACE_EVENT_POSTING = makeString("RKF-TRACE-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_RKF_TRACE_EVENT_POSTING = makeSymbol("CYBLACK-RKF-TRACE-EVENT-POSTING");

    static private final SubLString $str_alt743$UIA_BLUE_EVENT_POSTING = makeString("UIA-BLUE-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_UIA_BLUE_EVENT_POSTING = makeSymbol("CYBLACK-UIA-BLUE-EVENT-POSTING");

    static private final SubLString $str_alt745$TEST_ROOT_POSTING = makeString("TEST-ROOT-POSTING");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ROOT_POSTING = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING = makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING = makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING");

    static private final SubLString $str_alt749$ISI_ROOT = makeString("ISI-ROOT");

    private static final SubLSymbol ISI_ROOT_POSTING = makeSymbol("ISI-ROOT-POSTING");

    static private final SubLString $str_alt751$ISI_DATUM = makeString("ISI-DATUM");

    private static final SubLSymbol ISI_DATUM_POSTING = makeSymbol("ISI-DATUM-POSTING");

    static private final SubLString $str_alt753$FAILED_QUERY = makeString("FAILED-QUERY");



    static private final SubLString $str_alt755$QUERY_IMPROVEMENT_PROPOSAL = makeString("QUERY-IMPROVEMENT-PROPOSAL");

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL");

    private static final SubLSymbol CYBLACK_STANDARD_EXTERNAL_CONNECTION = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION");

    static private final SubLList $list_alt758 = list(list(makeString("WhyNot"), makeSymbol("CYBLACK-ISI-WHY-NOT-KS"), makeInteger(3599)));

    private static final SubLSymbol ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS = makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLList $list_alt760 = list(list(makeString("CYBLACK-MUMBLER-KS"), makeSymbol("CYBLACK-MUMBLER-KS")), list(makeString("REMOVE-EVENT-ROOT-POSTING"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-KS")));

    private static final SubLSymbol CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_INITIALIZE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-INITIALIZE-METHOD");



    static private final SubLList $list_alt763 = list(list(makeSymbol("GENERATED-ON-STARTUP"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym764$CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_GENERATED_ON_STARTUP_MET = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-GENERATED-ON-STARTUP-METHOD");



    static private final SubLList $list_alt766 = list(list(makeSymbol("USER-ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("*VIRB3*"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%Starting Cyc Event Blackboard Application.")), list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION*"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*"), makeSymbol("*CYBLACK-BUFFERED-EVENT-POSTINGS*")), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("*CYBLACK-BUFFERED-EVENT-POSTINGS*"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE-SERIALIZED-EVENT"), makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA")), makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("*CYBLACK-BUFFERED-EVENT-POSTINGS*"))))), list(RET, NIL));

    static private final SubLString $str_alt767$__Starting_Cyc_Event_Blackboard_A = makeString("~%Starting Cyc Event Blackboard Application.");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_USER_ON_STARTUP_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-USER-ON-STARTUP-METHOD");



    static private final SubLList $list_alt770 = list(list(makeSymbol("GENERATED-ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym771$CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_GENERATED_ON_SHUTDOWN_ME = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-GENERATED-ON-SHUTDOWN-METHOD");



    static private final SubLList $list_alt773 = list(list(makeSymbol("USER-ON-SHUTDOWN"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION*"), NIL), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*"), NIL), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%Halting Cyc Event Blackboard Application.")), list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*STANDARD-OUTPUT*")), list(RET, NIL));

    static private final SubLString $str_alt774$__Halting_Cyc_Event_Blackboard_Ap = makeString("~%Halting Cyc Event Blackboard Application.");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_USER_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-USER-ON-SHUTDOWN-METHOD");



    static private final SubLList $list_alt777 = list(list(makeSymbol("ON-QUIESCENCE"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_ON_QUIESCENCE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-ON-QUIESCENCE-METHOD");



    static private final SubLList $list_alt780 = list(list(makeSymbol("ON-EMPTY-AGENDA"), makeSymbol("SUPER")), list(makeSymbol("CLET"), list(list(makeSymbol("EVENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE-EVENT"), makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA")), makeSymbol("AGENDA")))), list(makeSymbol("PWHEN"), makeSymbol("EVENT"), list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeSymbol("BLACKBOARD"), makeSymbol("EVENT"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NULL"), makeSymbol("EVENT")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA")), makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SLOW-DOWN"), makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA")), makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*"), makeSymbol("*VIRB3-MAXIMUM-SLEEP-INTERVAL*")))), list(makeSymbol("SLEEP"), list(makeSymbol("VIRB3-NORMALIZE-SLEEP-INTERVAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CURRENT-SLEEP-INTERVAL"), makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA")), makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*")))));

    static private final SubLSymbol $sym781$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_ON_EMPTY_AGENDA_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-ON-EMPTY-AGENDA-METHOD");

    private static final SubLSymbol CLOSE_ALL_PORTS = makeSymbol("CLOSE-ALL-PORTS");

    static private final SubLSymbol $sym784$TAG_FOR_ENSURE_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION_IS_RUNNIN = makeSymbol("TAG-FOR-ENSURE-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION-IS-RUNNING");

    private static final SubLSymbol RUN_CYBLACK_CYC_EVENT_BLACKBOARD_APPLICATION = makeSymbol("RUN-CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION");

    public static final SubLFloat $float$0_25 = makeDouble(0.25);

    static private final SubLString $str_alt787$__Detected_that_VirB3_is_running_ = makeString("~%Detected that VirB3 is running.~%");

    // // Internal Constant Initializer Methods
    private static final SubLObject _constant_696_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-APPLICATION*"), makeSymbol("SELF")), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-APPLICATION-NAME"), makeSymbol("SELF"), makeString("VirB3")), list(makeSymbol("SET-AGENDA-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA"))), list(makeSymbol("CYBLACK-APP-INSTALL-AGENDA"), makeSymbol("SELF"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA")))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-MESSAGE-BROKER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-MESSAGE-BROKER")), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER"))))), list(makeSymbol("INSTALL-MESSAGE-BROKER"), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-EXTERNAL-CONNECTION"), list(makeSymbol("FIF"), makeSymbol("*CYBLACK-DEFAULT-CONNECTION-CLASS*"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("*CYBLACK-DEFAULT-CONNECTION-CLASS*")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("ASSIGN-MESSAGE-BROKER")), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("INSTALL-EXTERNAL-CONNECTION"), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-CONNECTION"))))), list(makeSymbol("SET-BLACKBOARD-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("EVENT-ROOT-POSTING"), makeString("POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("SYSTEM-EVENT-POSTING"), makeString("EVENT-ROOT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-SYSTEM-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("SUBLISP-EVENT-POSTING"), makeString("SYSTEM-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-SUBLISP-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("APPLICATION-EVENT-POSTING"), makeString("EVENT-ROOT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-APPLICATION-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("CYC-EVENT-POSTING"), makeString("APPLICATION-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-CYC-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("KB-STORE-EVENT-POSTING"), makeString("CYC-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-KB-STORE-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("INFERENCE-EVENT-POSTING"), makeString("CYC-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-INFERENCE-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("SBHL-EVENT-POSTING"), makeString("CYC-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-SBHL-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("NL-EVENT-POSTING"), makeString("CYC-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-NL-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("CYC-APPLICATION-EVENT-POSTING"), makeString("CYC-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING"), makeString("CYC-APPLICATION-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING"), makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("CYC-BROWSER-BASE-EVENT-POSTING"), makeString("CYC-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("CYC-BROWSER-LOGIN-EVENT-POSTING"), makeString("CYC-BROWSER-BASE-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("CYC-BROWSER-SELECTION-EVENT-POSTING"), makeString("CYC-BROWSER-BASE-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING"), makeString("CYC-BROWSER-SELECTION-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING"), makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("RKF-BASE-EVENT-POSTING"), makeString("CYC-APPLICATION-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("RKF-TRACE-EVENT-POSTING"), makeString("RKF-BASE-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-RKF-TRACE-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("UIA-BLUE-EVENT-POSTING"), makeString("RKF-BASE-EVENT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-UIA-BLUE-EVENT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("TEST-ROOT-POSTING"), makeString("POSTING"), list(QUOTE, makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"), makeString("TEST-ROOT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("ACKNOWLEDGE-POSTING-REMOVAL-POSTING"), makeString("TEST-ROOT-POSTING"), list(QUOTE, makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("ISI-ROOT"), makeString("POSTING"), list(QUOTE, makeSymbol("ISI-ROOT-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("ISI-DATUM"), makeString("ISI-ROOT"), list(QUOTE, makeSymbol("ISI-DATUM-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("FAILED-QUERY"), makeString("ISI-DATUM"), list(QUOTE, makeSymbol("ISI-PROBLEM")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("DECLARE-SUBTYPE"), makeSymbol("SELF"), makeString("QUERY-IMPROVEMENT-PROPOSAL"), makeString("ISI-DATUM"), list(QUOTE, makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("SET-CONNECTION-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION"))), list(makeSymbol("SET-MESSAGE-BROKER-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER"))), list(makeSymbol("CLET"), list(list(makeUninternedSymbol("ksb"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-CYC-EVENT-TEST-KNOWLEDGE-SOURCE-BATTERY")))), list(makeUninternedSymbol("name"), NIL), list(makeUninternedSymbol("ks-class"), NIL), list(makeUninternedSymbol("port"), NIL)), list(makeSymbol("CYBLACK-SILENCE"), makeUninternedSymbol("name")), list(makeSymbol("CDOLIST"), list(makeUninternedSymbol("triplet"), list(QUOTE, list(list(makeString("WhyNot"), makeSymbol("CYBLACK-ISI-WHY-NOT-KS"), makeInteger(3599))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("name"), list(makeSymbol("FIRST"), makeUninternedSymbol("triplet"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("ks-class"), list(makeSymbol("SECOND"), makeUninternedSymbol("triplet"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("port"), list(makeSymbol("THIRD"), makeUninternedSymbol("triplet"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY")), makeUninternedSymbol("ksb"), makeUninternedSymbol("ks-class")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-EKSC-TO-PORT-ID-ASSOCIATION"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY")), makeUninternedSymbol("ksb"), makeUninternedSymbol("ks-class"), makeUninternedSymbol("port"))), list(makeSymbol("CDOLIST"), list(makeUninternedSymbol("pair-var"), list(QUOTE, list(list(makeString("CYBLACK-MUMBLER-KS"), makeSymbol("CYBLACK-MUMBLER-KS")), list(makeString("REMOVE-EVENT-ROOT-POSTING"), makeSymbol("REMOVE-EVENT-ROOT-POSTING-KS"))))), list(makeSymbol("CSETQ"), makeUninternedSymbol("name"), list(makeSymbol("FIRST"), makeUninternedSymbol("pair-var"))), list(makeSymbol("CSETQ"), makeUninternedSymbol("ks-class"), list(makeSymbol("SECOND"), makeUninternedSymbol("pair-var"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeUninternedSymbol("ksb"), list(QUOTE, makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS")), makeUninternedSymbol("ks-class"))), list(makeSymbol("INSTALL-KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("SELF"), makeUninternedSymbol("ksb"))), list(RET, makeSymbol("SELF")) });
    }

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_cyc_event_knowledge_sources_file();
    }

    public void initializeVariables() {
        init_cyblack_cyc_event_knowledge_sources_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_cyc_event_knowledge_sources_file();
    }
}

