/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENTS
 *  source file: /cyc/top/cycl/cyblack/cyblack-missing-knowledge-discovery-events.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_missing_knowledge_discovery_events extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_missing_knowledge_discovery_events() {
    }

    public static final SubLFile me = new cyblack_missing_knowledge_discovery_events();


    // // Definitions
    public static final SubLObject subloop_reserved_initialize_cyblack_missing_knowledge_discovery_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_missing_knowledge_discovery_event_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTIES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_missing_knowledge_discovery_event_posting_p(SubLObject cyblack_missing_knowledge_discovery_event_posting) {
        return classes.subloop_instanceof_class(cyblack_missing_knowledge_discovery_event_posting, CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING);
    }

    public static final SubLObject cyblack_missing_knowledge_discovery_event_posting_get_doc_method(SubLObject self) {
        return $str_alt45$Cyc_discovers_that_it_lacks_a_cer;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_unlexified_term_discovery_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_unlexified_term_discovery_event_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTIES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_unlexified_term_discovery_event_posting_p(SubLObject cyblack_unlexified_term_discovery_event_posting) {
        return classes.subloop_instanceof_class(cyblack_unlexified_term_discovery_event_posting, CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING);
    }

    public static final SubLObject cyblack_unlexified_term_discovery_event_posting_get_doc_method(SubLObject self) {
        return $str_alt51$Cyc_discovers_that_a_term_has_no_;
    }

    public static final SubLObject declare_cyblack_missing_knowledge_discovery_events_file() {
        declareFunction("subloop_reserved_initialize_cyblack_missing_knowledge_discovery_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_missing_knowledge_discovery_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_missing_knowledge_discovery_event_posting_p", "CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_missing_knowledge_discovery_event_posting_get_doc_method", "CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_unlexified_term_discovery_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_unlexified_term_discovery_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_unlexified_term_discovery_event_posting_p", "CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_unlexified_term_discovery_event_posting_get_doc_method", "CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_missing_knowledge_discovery_events_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_missing_knowledge_discovery_events_file() {
                classes.subloop_new_class(CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING, CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING, $sym7$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_E);
        classes.subloop_note_instance_initialization_function(CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING, $sym41$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_E);
        subloop_reserved_initialize_cyblack_missing_knowledge_discovery_event_posting_class(CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING, $list_alt43, NIL, $list_alt44);
        methods.subloop_register_class_method(CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING, GET_DOC, CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING, CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING, $sym48$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVE);
        classes.subloop_note_instance_initialization_function(CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING, $sym49$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVE);
        subloop_reserved_initialize_cyblack_unlexified_term_discovery_event_posting_class(CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING, $list_alt43, NIL, $list_alt50);
        methods.subloop_register_class_method(CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING, GET_DOC, CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING_GET_DOC_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING = makeSymbol("CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING = makeSymbol("CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING");

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-DOC"), NIL, makeKeyword("PUBLIC")));









    static private final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING-CLASS");





























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





































    static private final SubLSymbol $sym41$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING-INSTANCE");



    static private final SubLList $list_alt43 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt44 = list(list(RET, makeString("Cyc discovers that it lacks a certain piece of knowledge")));

    static private final SubLString $str_alt45$Cyc_discovers_that_it_lacks_a_cer = makeString("Cyc discovers that it lacks a certain piece of knowledge");

    private static final SubLSymbol CYBLACK_MISSING_KNOWLEDGE_DISCOVERY_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING = makeSymbol("CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING");

    static private final SubLSymbol $sym48$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym49$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt50 = list(list(RET, makeString("Cyc discovers that a term has no lexification")));

    static private final SubLString $str_alt51$Cyc_discovers_that_a_term_has_no_ = makeString("Cyc discovers that a term has no lexification");

    private static final SubLSymbol CYBLACK_UNLEXIFIED_TERM_DISCOVERY_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING-GET-DOC-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_missing_knowledge_discovery_events_file();
    }

    public void initializeVariables() {
        init_cyblack_missing_knowledge_discovery_events_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_missing_knowledge_discovery_events_file();
    }
}

