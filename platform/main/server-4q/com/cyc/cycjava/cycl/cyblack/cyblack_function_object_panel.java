/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-FUNCTION-OBJECT-PANEL
 *  source file: /cyc/top/cycl/cyblack/cyblack-function-object-panel.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_function_object_panel extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_function_object_panel() {
    }

    public static final SubLFile me = new cyblack_function_object_panel();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_function_object_panel";

    // // Definitions
    public static final SubLObject subloop_reserved_initialize_cyblack_function_object_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_object_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_function_object_panel_p(SubLObject v_cyblack_function_object_panel) {
        return classes.subloop_instanceof_class(v_cyblack_function_object_panel, CYBLACK_FUNCTION_OBJECT_PANEL);
    }

    public static final SubLObject cyblack_function_object_panel_initialize_method(SubLObject self) {
        cyblack_panel.cyblack_basic_panel_initialize_method(self);
        return self;
    }

    public static final SubLObject cyblack_function_object_panel_get_postings_by_domain_tuple_method(SubLObject self, SubLObject domain_tuple) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!domain_tuple.isList()) {
                    Errors.error($str_alt34$_GET_POSTINGS_BY_DOMAIN_TUPLE__S_, self, domain_tuple);
                }
            }
            {
                SubLObject enumerator = cyblack_panel.cyblack_basic_panel_allocate_enumerator_method(self);
                SubLObject collected_postings = NIL;
                if ((NIL != enumerator) && (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P))) {
                    {
                        SubLObject current_posting = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                        if ((NIL != cyblack_function_object_posting.cyblack_function_object_posting_p(current_posting)) && domain_tuple.equal(cyblack_function_object_posting.cyblack_function_object_posting_get_args_method(current_posting))) {
                            collected_postings = cons(current_posting, collected_postings);
                        }
                        while (NIL != methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                            current_posting = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            if ((NIL != cyblack_function_object_posting.cyblack_function_object_posting_p(current_posting)) && domain_tuple.equal(cyblack_function_object_posting.cyblack_function_object_posting_get_args_method(current_posting))) {
                                collected_postings = cons(current_posting, collected_postings);
                            }
                        } 
                    }
                }
                cyblack_panel.cyblack_basic_panel_deallocate_enumerator_method(self, enumerator);
                return nreverse(collected_postings);
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_map_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_map_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_function_map_panel_p(SubLObject cyblack_function_map_panel) {
        return classes.subloop_instanceof_class(cyblack_function_map_panel, CYBLACK_FUNCTION_MAP_PANEL);
    }

    public static final SubLObject cyblack_function_map_panel_initialize_method(SubLObject self) {
        cyblack_function_object_panel_initialize_method(self);
        return self;
    }

    public static final SubLObject cyblack_function_map_panel_get_postings_by_range_tuple_method(SubLObject self, SubLObject range_tuple) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!range_tuple.isList()) {
                    Errors.error($str_alt48$_GET_POSTINGS_BY_RANGE_TUPLE__S__, self, range_tuple);
                }
            }
            {
                SubLObject enumerator = cyblack_panel.cyblack_basic_panel_allocate_enumerator_method(self);
                SubLObject collected_postings = NIL;
                if ((NIL != enumerator) && (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P))) {
                    {
                        SubLObject current_posting = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                        if ((NIL != cyblack_function_object_posting.cyblack_function_object_posting_p(current_posting)) && range_tuple.equal(cyblack_function_object_posting.cyblack_function_map_posting_get_values_method(current_posting, NIL))) {
                            collected_postings = cons(current_posting, collected_postings);
                        }
                        while (NIL != methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                            current_posting = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            if ((NIL != cyblack_function_object_posting.cyblack_function_object_posting_p(current_posting)) && range_tuple.equal(cyblack_function_object_posting.cyblack_function_object_posting_get_args_method(current_posting))) {
                                collected_postings = cons(current_posting, collected_postings);
                            }
                        } 
                    }
                    cyblack_panel.cyblack_basic_panel_deallocate_enumerator_method(self, enumerator);
                }
                return nreverse(collected_postings);
            }
        }
    }

    public static final SubLObject cyblack_function_map_panel_get_postings_by_mapping_method(SubLObject self, SubLObject domain_tuple, SubLObject range_tuple) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!domain_tuple.isList()) {
                    Errors.error($str_alt53$_GET_POSTINGS_BY_MAPPING__S____S_, self, domain_tuple);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!range_tuple.isList()) {
                    Errors.error($str_alt54$_GET_POSTINGS_BY_MAPPING__S____S_, self, range_tuple);
                }
            }
            {
                SubLObject enumerator = cyblack_panel.cyblack_basic_panel_allocate_enumerator_method(self);
                SubLObject collected_postings = NIL;
                if ((NIL != enumerator) && (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P))) {
                    {
                        SubLObject current_posting = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                        if (((NIL != cyblack_function_object_posting.cyblack_function_object_posting_p(current_posting)) && domain_tuple.equal(cyblack_function_object_posting.cyblack_function_object_posting_get_args_method(current_posting))) && range_tuple.equal(cyblack_function_object_posting.cyblack_function_map_posting_get_values_method(current_posting, NIL))) {
                            collected_postings = cons(current_posting, collected_postings);
                        }
                        while (NIL != methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                            current_posting = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                            if (((NIL != cyblack_function_object_posting.cyblack_function_object_posting_p(current_posting)) && domain_tuple.equal(cyblack_function_object_posting.cyblack_function_object_posting_get_args_method(current_posting))) && range_tuple.equal(cyblack_function_object_posting.cyblack_function_map_posting_get_values_method(current_posting, NIL))) {
                                collected_postings = cons(current_posting, collected_postings);
                            }
                        } 
                    }
                    cyblack_panel.cyblack_basic_panel_deallocate_enumerator_method(self, enumerator);
                }
                return nreverse(collected_postings);
            }
        }
    }

    public static final SubLObject declare_cyblack_function_object_panel_file() {
        declareFunction("subloop_reserved_initialize_cyblack_function_object_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_object_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_function_object_panel_p", "CYBLACK-FUNCTION-OBJECT-PANEL-P", 1, 0, false);
        declareFunction("cyblack_function_object_panel_initialize_method", "CYBLACK-FUNCTION-OBJECT-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_function_object_panel_get_postings_by_domain_tuple_method", "CYBLACK-FUNCTION-OBJECT-PANEL-GET-POSTINGS-BY-DOMAIN-TUPLE-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_map_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_map_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_function_map_panel_p", "CYBLACK-FUNCTION-MAP-PANEL-P", 1, 0, false);
        declareFunction("cyblack_function_map_panel_initialize_method", "CYBLACK-FUNCTION-MAP-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_function_map_panel_get_postings_by_range_tuple_method", "CYBLACK-FUNCTION-MAP-PANEL-GET-POSTINGS-BY-RANGE-TUPLE-METHOD", 2, 0, false);
        declareFunction("cyblack_function_map_panel_get_postings_by_mapping_method", "CYBLACK-FUNCTION-MAP-PANEL-GET-POSTINGS-BY-MAPPING-METHOD", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_function_object_panel_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_function_object_panel_file() {
                classes.subloop_new_class(CYBLACK_FUNCTION_OBJECT_PANEL, CYBLACK_BASIC_PANEL, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_FUNCTION_OBJECT_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FUNCTION_OBJECT_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_FUNCTION_OBJECT_PANEL, $sym25$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_PANEL_INSTANC);
        subloop_reserved_initialize_cyblack_function_object_panel_class(CYBLACK_FUNCTION_OBJECT_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FUNCTION_OBJECT_PANEL, $list_alt27, NIL, $list_alt28);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_PANEL, INITIALIZE, CYBLACK_FUNCTION_OBJECT_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTINGS_BY_DOMAIN_TUPLE, CYBLACK_FUNCTION_OBJECT_PANEL, $list_alt31, $list_alt32, $list_alt33);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_PANEL, GET_POSTINGS_BY_DOMAIN_TUPLE, CYBLACK_FUNCTION_OBJECT_PANEL_GET_POSTINGS_BY_DOMAIN_TUPLE_METHOD);
        classes.subloop_new_class(CYBLACK_FUNCTION_MAP_PANEL, CYBLACK_FUNCTION_OBJECT_PANEL, NIL, NIL, $list_alt41);
        classes.class_set_implements_slot_listeners(CYBLACK_FUNCTION_MAP_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FUNCTION_MAP_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_FUNCTION_MAP_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_function_map_panel_class(CYBLACK_FUNCTION_MAP_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FUNCTION_MAP_PANEL, $list_alt27, NIL, $list_alt28);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_PANEL, INITIALIZE, CYBLACK_FUNCTION_MAP_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTINGS_BY_RANGE_TUPLE, CYBLACK_FUNCTION_MAP_PANEL, $list_alt31, $list_alt46, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_PANEL, GET_POSTINGS_BY_RANGE_TUPLE, CYBLACK_FUNCTION_MAP_PANEL_GET_POSTINGS_BY_RANGE_TUPLE_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTINGS_BY_MAPPING, CYBLACK_FUNCTION_MAP_PANEL, $list_alt31, $list_alt51, $list_alt52);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_PANEL, GET_POSTINGS_BY_MAPPING, CYBLACK_FUNCTION_MAP_PANEL_GET_POSTINGS_BY_MAPPING_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_PANEL = makeSymbol("CYBLACK-FUNCTION-OBJECT-PANEL");



    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTINGS-BY-DOMAIN-TUPLE"), list(makeSymbol("DOMAIN-TUPLE")), makeKeyword("PUBLIC")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-PANEL-CLASS");







































    static private final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_PANEL_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-PANEL-INSTANCE");



    static private final SubLList $list_alt27 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt28 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol GET_POSTINGS_BY_DOMAIN_TUPLE = makeSymbol("GET-POSTINGS-BY-DOMAIN-TUPLE");

    static private final SubLList $list_alt31 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt32 = list(makeSymbol("DOMAIN-TUPLE"));

    static private final SubLList $list_alt33 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("DOMAIN-TUPLE")), makeString("(GET-POSTINGS-BY-DOMAIN-TUPLE ~S): ~S is a list.  A domain tuple must be a list."), makeSymbol("SELF"), makeSymbol("DOMAIN-TUPLE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF"))), list(makeSymbol("COLLECTED-POSTINGS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("ENUMERATOR"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))))), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-P"), makeSymbol("CURRENT-POSTING")), list(EQUAL, makeSymbol("DOMAIN-TUPLE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ARGS"), makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING")), makeSymbol("CURRENT-POSTING")))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-POSTING"), makeSymbol("COLLECTED-POSTINGS"))), list(makeSymbol("WHILE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P"))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-P"), makeSymbol("CURRENT-POSTING")), list(EQUAL, makeSymbol("DOMAIN-TUPLE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ARGS"), makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING")), makeSymbol("CURRENT-POSTING")))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-POSTING"), makeSymbol("COLLECTED-POSTINGS")))))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("ENUMERATOR")), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("COLLECTED-POSTINGS")))));

    static private final SubLString $str_alt34$_GET_POSTINGS_BY_DOMAIN_TUPLE__S_ = makeString("(GET-POSTINGS-BY-DOMAIN-TUPLE ~S): ~S is a list.  A domain tuple must be a list.");









    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_PANEL_GET_POSTINGS_BY_DOMAIN_TUPLE_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-PANEL-GET-POSTINGS-BY-DOMAIN-TUPLE-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_PANEL = makeSymbol("CYBLACK-FUNCTION-MAP-PANEL");

    static private final SubLList $list_alt41 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTINGS-BY-RANGE-TUPLE"), list(makeSymbol("RANGE-TUPLE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTINGS-BY-MAPPING"), list(makeSymbol("DOMAIN-TUPLE"), makeSymbol("RANGE-TUPLE")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-PANEL-INSTANCE");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol GET_POSTINGS_BY_RANGE_TUPLE = makeSymbol("GET-POSTINGS-BY-RANGE-TUPLE");

    static private final SubLList $list_alt46 = list(makeSymbol("RANGE-TUPLE"));

    static private final SubLList $list_alt47 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("RANGE-TUPLE")), makeString("(GET-POSTINGS-BY-RANGE-TUPLE ~S): ~S is a list.  A range tuple must be a list."), makeSymbol("SELF"), makeSymbol("RANGE-TUPLE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF"))), list(makeSymbol("COLLECTED-POSTINGS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("ENUMERATOR"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))))), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-P"), makeSymbol("CURRENT-POSTING")), list(EQUAL, makeSymbol("RANGE-TUPLE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VALUES"), makeSymbol("CYBLACK-FUNCTION-MAP-POSTING")), makeSymbol("CURRENT-POSTING"), NIL))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-POSTING"), makeSymbol("COLLECTED-POSTINGS"))), list(makeSymbol("WHILE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P"))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-P"), makeSymbol("CURRENT-POSTING")), list(EQUAL, makeSymbol("RANGE-TUPLE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ARGS"), makeSymbol("CYBLACK-FUNCTION-MAP-POSTING")), makeSymbol("CURRENT-POSTING")))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-POSTING"), makeSymbol("COLLECTED-POSTINGS"))))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("ENUMERATOR"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("COLLECTED-POSTINGS")))));

    static private final SubLString $str_alt48$_GET_POSTINGS_BY_RANGE_TUPLE__S__ = makeString("(GET-POSTINGS-BY-RANGE-TUPLE ~S): ~S is a list.  A range tuple must be a list.");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_PANEL_GET_POSTINGS_BY_RANGE_TUPLE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-PANEL-GET-POSTINGS-BY-RANGE-TUPLE-METHOD");

    private static final SubLSymbol GET_POSTINGS_BY_MAPPING = makeSymbol("GET-POSTINGS-BY-MAPPING");

    static private final SubLList $list_alt51 = list(makeSymbol("DOMAIN-TUPLE"), makeSymbol("RANGE-TUPLE"));

    static private final SubLList $list_alt52 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("DOMAIN-TUPLE")), makeString("(GET-POSTINGS-BY-MAPPING ~S): ~S is a list.  A domain tuple must be a list."), makeSymbol("SELF"), makeSymbol("DOMAIN-TUPLE")), list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("RANGE-TUPLE")), makeString("(GET-POSTINGS-BY-MAPPING ~S): ~S is a list.  A range tuple must be a list."), makeSymbol("SELF"), makeSymbol("RANGE-TUPLE")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF"))), list(makeSymbol("COLLECTED-POSTINGS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("ENUMERATOR"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))))), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-P"), makeSymbol("CURRENT-POSTING")), list(EQUAL, makeSymbol("DOMAIN-TUPLE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ARGS"), makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING")), makeSymbol("CURRENT-POSTING"))), list(EQUAL, makeSymbol("RANGE-TUPLE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VALUES"), makeSymbol("CYBLACK-FUNCTION-MAP-POSTING")), makeSymbol("CURRENT-POSTING"), NIL))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-POSTING"), makeSymbol("COLLECTED-POSTINGS"))), list(makeSymbol("WHILE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P"))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-P"), makeSymbol("CURRENT-POSTING")), list(EQUAL, makeSymbol("DOMAIN-TUPLE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ARGS"), makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING")), makeSymbol("CURRENT-POSTING"))), list(EQUAL, makeSymbol("RANGE-TUPLE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VALUES"), makeSymbol("CYBLACK-FUNCTION-MAP-POSTING")), makeSymbol("CURRENT-POSTING"), NIL))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-POSTING"), makeSymbol("COLLECTED-POSTINGS"))))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("ENUMERATOR"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("COLLECTED-POSTINGS")))));

    static private final SubLString $str_alt53$_GET_POSTINGS_BY_MAPPING__S____S_ = makeString("(GET-POSTINGS-BY-MAPPING ~S): ~S is a list.  A domain tuple must be a list.");

    static private final SubLString $str_alt54$_GET_POSTINGS_BY_MAPPING__S____S_ = makeString("(GET-POSTINGS-BY-MAPPING ~S): ~S is a list.  A range tuple must be a list.");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_PANEL_GET_POSTINGS_BY_MAPPING_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-PANEL-GET-POSTINGS-BY-MAPPING-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_function_object_panel_file();
    }

    public void initializeVariables() {
        init_cyblack_function_object_panel_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_function_object_panel_file();
    }
}

