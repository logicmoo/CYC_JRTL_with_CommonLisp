/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-ISI-KNOWLEDGE-SOURCES
 *  source file: /cyc/top/cycl/cyblack/cyblack-isi-knowledge-sources.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_isi_knowledge_sources extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_isi_knowledge_sources() {
    }

    public static final SubLFile me = new cyblack_isi_knowledge_sources();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_isi_knowledge_sources";

    // // Definitions
    public static final SubLObject subloop_reserved_initialize_cyblack_isi_why_not_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_isi_why_not_ks_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, WAITING_ON_LINK_CALLBACK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTED, NIL);
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, EXTERNAL_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CACHED_MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CACHED_PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, INVITATION_TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GUID_AS_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTION_EXCUSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, PORT_ID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_isi_why_not_ks_p(SubLObject cyblack_isi_why_not_ks) {
        return classes.subloop_instanceof_class(cyblack_isi_why_not_ks, CYBLACK_ISI_WHY_NOT_KS);
    }

    public static final SubLObject cyblack_isi_why_not_ks_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_isi_why_not_ks_method = NIL;
            SubLObject port_id = cyblack_ks.get_cyblack_external_knowledge_source_port_id(self);
            SubLObject proposal_class = cyblack_ks.get_cyblack_external_knowledge_source_proposal_class(self);
            SubLObject name = cyblack_ks.get_cyblack_external_knowledge_source_name(self);
            try {
                try {
                    cyblack_ks.cyblack_external_knowledge_source_initialize_method(self);
                    name = $$$WhyNot;
                    port_id = $int$3599;
                    proposal_class = CYBLACK_ISI_WHY_NOT_PROPOSAL;
                    sublisp_throw($sym48$OUTER_CATCH_FOR_CYBLACK_ISI_WHY_NOT_KS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_ks.set_cyblack_external_knowledge_source_port_id(self, port_id);
                            cyblack_ks.set_cyblack_external_knowledge_source_proposal_class(self, proposal_class);
                            cyblack_ks.set_cyblack_external_knowledge_source_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_isi_why_not_ks_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_CYBLACK_ISI_WHY_NOT_KS_METHOD);
            }
            return catch_var_for_cyblack_isi_why_not_ks_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_isi_why_not_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_isi_why_not_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_PROPOSAL, ALREADY_RECONFIRMED, NIL);
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_PROPOSAL, EXTERNAL_PROPOSAL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_PROPOSAL, CACHED_KSI_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_PROPOSAL, KSI_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_isi_why_not_proposal_p(SubLObject cyblack_isi_why_not_proposal) {
        return classes.subloop_instanceof_class(cyblack_isi_why_not_proposal, CYBLACK_ISI_WHY_NOT_PROPOSAL);
    }

    public static final SubLObject cyblack_isi_why_not_proposal_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_isi_why_not_proposal_method = NIL;
            SubLObject ksi_class = cyblack_proposal.get_cyblack_external_proposal_ksi_class(self);
            try {
                try {
                    cyblack_proposal.cyblack_external_proposal_initialize_method(self);
                    ksi_class = CYBLACK_ISI_WHY_NOT_KSI;
                    sublisp_throw($sym67$OUTER_CATCH_FOR_CYBLACK_ISI_WHY_NOT_PROPOSAL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_proposal.set_cyblack_external_proposal_ksi_class(self, ksi_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_isi_why_not_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYBLACK_ISI_WHY_NOT_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_isi_why_not_proposal_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_isi_why_not_ksi_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_isi_why_not_ksi_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KSI, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KSI, POSTINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_isi_why_not_ksi_p(SubLObject cyblack_isi_why_not_ksi) {
        return classes.subloop_instanceof_class(cyblack_isi_why_not_ksi, CYBLACK_ISI_WHY_NOT_KSI);
    }

    public static final SubLObject declare_cyblack_isi_knowledge_sources_file() {
        declareFunction("subloop_reserved_initialize_cyblack_isi_why_not_ks_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_isi_why_not_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-KS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_isi_why_not_ks_p", "CYBLACK-ISI-WHY-NOT-KS-P", 1, 0, false);
        declareFunction("cyblack_isi_why_not_ks_initialize_method", "CYBLACK-ISI-WHY-NOT-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_isi_why_not_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_isi_why_not_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_isi_why_not_proposal_p", "CYBLACK-ISI-WHY-NOT-PROPOSAL-P", 1, 0, false);
        declareFunction("cyblack_isi_why_not_proposal_initialize_method", "CYBLACK-ISI-WHY-NOT-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_isi_why_not_ksi_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-KSI-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_isi_why_not_ksi_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-KSI-INSTANCE", 1, 0, false);
        declareFunction("cyblack_isi_why_not_ksi_p", "CYBLACK-ISI-WHY-NOT-KSI-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_isi_knowledge_sources_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_isi_knowledge_sources_file() {
                classes.subloop_new_class(CYBLACK_ISI_WHY_NOT_KS, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_ISI_WHY_NOT_KS, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ISI_WHY_NOT_KS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_KS_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ISI_WHY_NOT_KS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_KS_INSTANCE);
        subloop_reserved_initialize_cyblack_isi_why_not_ks_class(CYBLACK_ISI_WHY_NOT_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ISI_WHY_NOT_KS, $list_alt46, NIL, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_ISI_WHY_NOT_KS, INITIALIZE, CYBLACK_ISI_WHY_NOT_KS_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_ISI_WHY_NOT_PROPOSAL, CYBLACK_EXTERNAL_PROPOSAL, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_ISI_WHY_NOT_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ISI_WHY_NOT_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_PROPOSAL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ISI_WHY_NOT_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_PROPOSAL_INSTANCE);
        subloop_reserved_initialize_cyblack_isi_why_not_proposal_class(CYBLACK_ISI_WHY_NOT_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ISI_WHY_NOT_PROPOSAL, $list_alt46, NIL, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_ISI_WHY_NOT_PROPOSAL, INITIALIZE, CYBLACK_ISI_WHY_NOT_PROPOSAL_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_ISI_WHY_NOT_KSI, CYBLACK_EXTERNAL_KSI, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(CYBLACK_ISI_WHY_NOT_KSI, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ISI_WHY_NOT_KSI, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_KSI_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ISI_WHY_NOT_KSI, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_KSI_INSTANCE);
        subloop_reserved_initialize_cyblack_isi_why_not_ksi_class(CYBLACK_ISI_WHY_NOT_KSI);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_ISI_WHY_NOT_KS = makeSymbol("CYBLACK-ISI-WHY-NOT-KS");



    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_KS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-KS-CLASS");



    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE");















    private static final SubLSymbol REMOVE_KNOWLEDGE_SOURCES_AT_WILL = makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE");



































    private static final SubLSymbol RANGE_SET = makeSymbol("RANGE-SET");















    private static final SubLSymbol REJECTION_EXCUSES = makeSymbol("REJECTION-EXCUSES");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_KS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-KS-INSTANCE");



    static private final SubLList $list_alt46 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt47 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeString("WhyNot")), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), makeInteger(3599)), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-ISI-WHY-NOT-PROPOSAL"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym48$OUTER_CATCH_FOR_CYBLACK_ISI_WHY_NOT_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ISI-WHY-NOT-KS-METHOD");

    static private final SubLString $$$WhyNot = makeString("WhyNot");

    public static final SubLInteger $int$3599 = makeInteger(3599);

    private static final SubLSymbol CYBLACK_ISI_WHY_NOT_PROPOSAL = makeSymbol("CYBLACK-ISI-WHY-NOT-PROPOSAL");

    private static final SubLSymbol CYBLACK_ISI_WHY_NOT_KS_INITIALIZE_METHOD = makeSymbol("CYBLACK-ISI-WHY-NOT-KS-INITIALIZE-METHOD");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_PROPOSAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-PROPOSAL-CLASS");



    private static final SubLSymbol ALREADY_RECONFIRMED = makeSymbol("ALREADY-RECONFIRMED");

















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_PROPOSAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-PROPOSAL-INSTANCE");

    static private final SubLList $list_alt66 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("KSI-CLASS"), list(QUOTE, makeSymbol("CYBLACK-ISI-WHY-NOT-KSI"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym67$OUTER_CATCH_FOR_CYBLACK_ISI_WHY_NOT_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ISI-WHY-NOT-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_ISI_WHY_NOT_KSI = makeSymbol("CYBLACK-ISI-WHY-NOT-KSI");

    private static final SubLSymbol CYBLACK_ISI_WHY_NOT_PROPOSAL_INITIALIZE_METHOD = makeSymbol("CYBLACK-ISI-WHY-NOT-PROPOSAL-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI = makeSymbol("CYBLACK-EXTERNAL-KSI");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_KSI_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-KSI-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ISI_WHY_NOT_KSI_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ISI-WHY-NOT-KSI-INSTANCE");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_isi_knowledge_sources_file();
    }

    public void initializeVariables() {
        init_cyblack_isi_knowledge_sources_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_isi_knowledge_sources_file();
    }
}

