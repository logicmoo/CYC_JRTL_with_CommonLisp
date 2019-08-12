/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
 *  module:      CYBLACK-CB-EVENTS
 *  source file: /cyc/top/cycl/cyblack/cyblack-cb-events.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_cb_events extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_cb_events() {
    }

    public static final SubLFile me = new cyblack_cb_events();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_cb_events";

    // // Definitions
    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_base_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_base_event_posting_instance(SubLObject new_instance) {
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

    public static final SubLObject cyblack_cyc_browser_base_event_posting_p(SubLObject cyblack_cyc_browser_base_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cyc_browser_base_event_posting, CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cyc_browser_base_event_posting_get_doc_method(SubLObject self) {
        return $str_alt45$The_base_class_for_all_CYC_browse;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_login_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_login_event_posting_instance(SubLObject new_instance) {
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

    public static final SubLObject cyblack_cyc_browser_login_event_posting_p(SubLObject cyblack_cyc_browser_login_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cyc_browser_login_event_posting, CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cyc_browser_login_event_posting_get_doc_method(SubLObject self) {
        return $str_alt51$This_event_is_triggered_every_tim;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_selection_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_selection_event_posting_instance(SubLObject new_instance) {
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

    public static final SubLObject cyblack_cyc_browser_selection_event_posting_p(SubLObject cyblack_cyc_browser_selection_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cyc_browser_selection_event_posting, CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cyc_browser_selection_event_posting_get_doc_method(SubLObject self) {
        return $str_alt57$This_event_is_triggered_every_tim;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_fort_selection_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_fort_selection_event_posting_instance(SubLObject new_instance) {
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

    public static final SubLObject cyblack_cyc_browser_fort_selection_event_posting_p(SubLObject cyblack_cyc_browser_fort_selection_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cyc_browser_fort_selection_event_posting, CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cyc_browser_fort_selection_event_posting_get_doc_method(SubLObject self) {
        return $str_alt63$This_event_is_triggered_whenever_;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_constant_selection_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_browser_constant_selection_event_posting_instance(SubLObject new_instance) {
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

    public static final SubLObject cyblack_cyc_browser_constant_selection_event_posting_p(SubLObject cyblack_cyc_browser_constant_selection_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cyc_browser_constant_selection_event_posting, CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cyc_browser_constant_selection_event_posting_get_doc_method(SubLObject self) {
        return $str_alt69$This_event_is_triggered_whenever_;
    }

    public static final SubLObject declare_cyblack_cb_events_file() {
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_base_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_base_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_browser_base_event_posting_p", "CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cyc_browser_base_event_posting_get_doc_method", "CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_login_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_login_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_browser_login_event_posting_p", "CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cyc_browser_login_event_posting_get_doc_method", "CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_selection_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_selection_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_browser_selection_event_posting_p", "CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cyc_browser_selection_event_posting_get_doc_method", "CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_fort_selection_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_fort_selection_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_browser_fort_selection_event_posting_p", "CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cyc_browser_fort_selection_event_posting_get_doc_method", "CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_constant_selection_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_browser_constant_selection_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_browser_constant_selection_event_posting_p", "CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cyc_browser_constant_selection_event_posting_get_doc_method", "CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_cb_events_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_cb_events_file() {
                classes.subloop_new_class(CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, $sym7$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_BASE_EVENT_POSTIN);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, $sym41$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_BASE_EVENT_POSTIN);
        subloop_reserved_initialize_cyblack_cyc_browser_base_event_posting_class(CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, $list_alt43, NIL, $list_alt44);
        methods.subloop_register_class_method(CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, GET_DOC, CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING, CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING, $sym48$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTI);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING, $sym49$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTI);
        subloop_reserved_initialize_cyblack_cyc_browser_login_event_posting_class(CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING, $list_alt43, NIL, $list_alt50);
        methods.subloop_register_class_method(CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING, GET_DOC, CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING, CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING, $sym54$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_SELECTION_EVENT_P);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING, $sym55$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_SELECTION_EVENT_P);
        subloop_reserved_initialize_cyblack_cyc_browser_selection_event_posting_class(CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING, $list_alt43, NIL, $list_alt56);
        methods.subloop_register_class_method(CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING, GET_DOC, CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING, CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING, $sym60$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_FORT_SELECTION_EV);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING, $sym61$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_FORT_SELECTION_EV);
        subloop_reserved_initialize_cyblack_cyc_browser_fort_selection_event_posting_class(CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING, $list_alt43, NIL, $list_alt62);
        methods.subloop_register_class_method(CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING, GET_DOC, CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING, CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING, $sym66$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_CONSTANT_SELECTIO);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING, $sym67$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_CONSTANT_SELECTIO);
        subloop_reserved_initialize_cyblack_cyc_browser_constant_selection_event_posting_class(CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING, $list_alt43, NIL, $list_alt68);
        methods.subloop_register_class_method(CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING, GET_DOC, $sym70$CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_GET_DOC_METH);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING = makeSymbol("CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING");

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-DOC"), NIL, makeKeyword("PUBLIC")));









    static private final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_BASE_EVENT_POSTIN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING-CLASS");





























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





































    static private final SubLSymbol $sym41$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_BASE_EVENT_POSTIN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING-INSTANCE");



    static private final SubLList $list_alt43 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt44 = list(list(RET, makeString("The base class for all CYC browser related events.")));

    static private final SubLString $str_alt45$The_base_class_for_all_CYC_browse = makeString("The base class for all CYC browser related events.");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_BASE_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING");

    static private final SubLSymbol $sym48$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym49$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt50 = list(list(RET, makeString("This event is triggered every time someone completes the Login panel.")));

    static private final SubLString $str_alt51$This_event_is_triggered_every_tim = makeString("This event is triggered every time someone completes the Login panel.");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_LOGIN_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING");

    static private final SubLSymbol $sym54$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_SELECTION_EVENT_P = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym55$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_SELECTION_EVENT_P = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt56 = list(list(RET, makeString("This event is triggered every time someone selects an entity for display.")));

    static private final SubLString $str_alt57$This_event_is_triggered_every_tim = makeString("This event is triggered every time someone selects an entity for display.");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_SELECTION_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING");

    static private final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_FORT_SELECTION_EV = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_FORT_SELECTION_EV = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt62 = list(list(RET, makeString("This event is triggered whenever a FORT is selected.")));

    static private final SubLString $str_alt63$This_event_is_triggered_whenever_ = makeString("This event is triggered whenever a FORT is selected.");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_FORT_SELECTION_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING = makeSymbol("CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING");

    static private final SubLSymbol $sym66$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_CONSTANT_SELECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym67$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_BROWSER_CONSTANT_SELECTIO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt68 = list(list(RET, makeString("This event is triggered whenever a constant is selected.")));

    static private final SubLString $str_alt69$This_event_is_triggered_whenever_ = makeString("This event is triggered whenever a constant is selected.");

    static private final SubLSymbol $sym70$CYBLACK_CYC_BROWSER_CONSTANT_SELECTION_EVENT_POSTING_GET_DOC_METH = makeSymbol("CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING-GET-DOC-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_cb_events_file();
    }

    public void initializeVariables() {
        init_cyblack_cb_events_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_cb_events_file();
    }
}

