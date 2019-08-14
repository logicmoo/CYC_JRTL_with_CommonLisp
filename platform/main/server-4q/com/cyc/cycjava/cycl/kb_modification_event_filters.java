/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_upcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KB-MODIFICATION-EVENT-FILTERS
 * source file: /cyc/top/cycl/kb-modification-event-filters.lisp
 * created:     2019/07/03 17:37:52
 */
public final class kb_modification_event_filters extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_listener_registration_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, LISTENER_REGISTRATION, IDS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_listener_registration_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_filters_and_listeners_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, FILTERS_AND_LISTENERS, FILTER_IDS, NIL);
        classes.subloop_initialize_slot(new_instance, FILTERS_AND_LISTENERS, LISTENER_IDS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_filters_and_listeners_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_filter_registration_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, FILTER_REGISTRATION, IDS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_filter_registration_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_listener_registration_ids(SubLObject listener_registration, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(listener_registration, value, THREE_INTEGER, IDS);
    }

    public static final SubLObject set_filters_and_listeners_listener_ids(SubLObject filters_and_listeners, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(filters_and_listeners, value, FOUR_INTEGER, LISTENER_IDS);
    }

    public static final SubLObject set_filters_and_listeners_filter_ids(SubLObject filters_and_listeners, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(filters_and_listeners, value, THREE_INTEGER, FILTER_IDS);
    }

    public static final SubLObject set_filter_registration_ids(SubLObject filter_registration, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(filter_registration, value, THREE_INTEGER, IDS);
    }

    public static final SubLObject listener_registration_p(SubLObject listener_registration) {
        return classes.subloop_instanceof_class(listener_registration, LISTENER_REGISTRATION);
    }

    public static final SubLObject get_listener_registration_ids(SubLObject listener_registration) {
        return classes.subloop_get_access_protected_instance_slot(listener_registration, THREE_INTEGER, IDS);
    }

    public static final SubLObject get_filters_and_listeners_listener_ids(SubLObject filters_and_listeners) {
        return classes.subloop_get_access_protected_instance_slot(filters_and_listeners, FOUR_INTEGER, LISTENER_IDS);
    }

    public static final SubLObject get_filters_and_listeners_filter_ids(SubLObject filters_and_listeners) {
        return classes.subloop_get_access_protected_instance_slot(filters_and_listeners, THREE_INTEGER, FILTER_IDS);
    }

    public static final SubLObject get_filter_registration_ids(SubLObject filter_registration) {
        return classes.subloop_get_access_protected_instance_slot(filter_registration, THREE_INTEGER, IDS);
    }

    public static final SubLObject filters_and_listeners_p(SubLObject filters_and_listeners) {
        return classes.subloop_instanceof_class(filters_and_listeners, FILTERS_AND_LISTENERS);
    }

    public static final SubLObject filter_registration_p(SubLObject filter_registration) {
        return classes.subloop_instanceof_class(filter_registration, FILTER_REGISTRATION);
    }

    public static final class $event_filter_description_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native.this.$pattern;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native.this.$pattern = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $pattern = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native.class, EVENT_FILTER_DESCRIPTION, EVENT_FILTER_DESCRIPTION_P, $list_alt67, $list_alt68, new String[]{ "$id", "$pattern" }, $list_alt69, $list_alt70, PRINT_EVENT_FILTER_DESCRIPTION);
    }

    public static final SubLFile me = new kb_modification_event_filters();

 public static final String myName = "com.cyc.cycjava.cycl.kb_modification_event_filters";


    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    private static final SubLSymbol $kb_modification_filter_map$ = makeSymbol("*KB-MODIFICATION-FILTER-MAP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $kb_modification_filter_event_equivalents$ = makeSymbol("*KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS*");

    // defparameter
    // The filters that have so far passed this event
    /**
     * The filters that have so far passed this event
     */
    @LispMethod(comment = "The filters that have so far passed this event\ndefparameter")
    public static final SubLSymbol $matched_kb_modification_event_filters$ = makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_event_filter_description$ = makeSymbol("*DTP-EVENT-FILTER-DESCRIPTION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $transmit_kb_modification_event_to_listener_method_table$ = makeSymbol("*TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $kb_modification_external_filter_delivery_timeout$ = makeSymbol("*KB-MODIFICATION-EXTERNAL-FILTER-DELIVERY-TIMEOUT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $compute_key_from_external_event_filter_listener_method_table$ = makeSymbol("*COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $external_event_filter_listener_p_method_table$ = makeSymbol("*EXTERNAL-EVENT-FILTER-LISTENER-P-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $is_external_event_filter_listener_validP_method_table$ = makeSymbol("*IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $invalidate_external_event_filter_listener_method_table$ = makeSymbol("*INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*");

    // deflexical
    // Set to T if one wants a trace of where the modification events are going.
    /**
     * Set to T if one wants a trace of where the modification events are going.
     */
    @LispMethod(comment = "Set to T if one wants a trace of where the modification events are going.\ndeflexical")
    private static final SubLSymbol $verbose_transmit_kb_modification_events$ = makeSymbol("*VERBOSE-TRANSMIT-KB-MODIFICATION-EVENTS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_message_mailbox_listener$ = makeSymbol("*DTP-MESSAGE-MAILBOX-LISTENER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $external_kb_modification_event_listeners_lock$ = makeSymbol("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-LOCK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$Invalid_event_denotation__A_for_f = makeString("Invalid event denotation ~A for filter ~A.");

    static private final SubLList $list1 = list(makeSymbol("FILTER-TOKEN"), makeSymbol("EVENTS"), makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCSTRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str3$Arglist_must_start_with_event_par = makeString("Arglist must start with event parameter.");

    private static final SubLSymbol REGISTER_NEW_KB_MODIFICATION_FILTER = makeSymbol("REGISTER-NEW-KB-MODIFICATION-FILTER");

    private static final SubLSymbol REGISTER_KB_MODIFICATION_FILTER_EVENT_EQUIVALENTS = makeSymbol("REGISTER-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS");

    static private final SubLList $list9 = list(list(makeSymbol("FILTERS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list11 = list(list(makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*"), NIL));

    static private final SubLList $list13 = list(makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*"));

    private static final SubLSymbol SYMBOLIC_PLIST_P = makeSymbol("SYMBOLIC-PLIST-P");

    private static final SubLSymbol $DEFAULT_KB_MODIFICATION_EVENT_FILTER = makeKeyword("DEFAULT-KB-MODIFICATION-EVENT-FILTER");

    private static final SubLSymbol DEFAULT_KB_MODIFICATION_EVENT_FILTER = makeSymbol("DEFAULT-KB-MODIFICATION-EVENT-FILTER");

    static private final SubLList $list21 = list(makeKeyword("ALL"));

    private static final SubLSymbol $CYCL_FORT_FILTER = makeKeyword("CYCL-FORT-FILTER");

    private static final SubLSymbol KB_MODIFICATION_EVENT_FORT_FILTER = makeSymbol("KB-MODIFICATION-EVENT-FORT-FILTER");

    static private final SubLList $list25 = list(makeKeyword("KB-MODIFY-REMOVE-CONSTANT"), makeKeyword("KB-MODIFY-REMOVE-NART"), makeKeyword("KB-MODIFY-CREATE-ASSERTION"), makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));

    private static final SubLSymbol KB_MODIFICATION_EVENT_COLLECTION_FILTER = makeSymbol("KB-MODIFICATION-EVENT-COLLECTION-FILTER");

    static private final SubLList $list28 = list(makeKeyword("KB-MODIFY-CREATE-ASSERTION"), makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));

    private static final SubLSymbol $LEXICON_FORT_FILTER = makeKeyword("LEXICON-FORT-FILTER");

    private static final SubLSymbol KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER = makeSymbol("KB-MODIFICATION-EVENT-LEXICON-FORT-FILTER");

    private static final SubLSymbol KB_MODIFICATION_EVENT_MT_FILTER = makeSymbol("KB-MODIFICATION-EVENT-MT-FILTER");

    private static final SubLSymbol $KB_MODIFY_REMOVE_CONSTANT = makeKeyword("KB-MODIFY-REMOVE-CONSTANT");

    private static final SubLSymbol $CYCL_FORT_EVENT = makeKeyword("CYCL-FORT-EVENT");

    private static final SubLSymbol $KB_MODIFY_CREATE_ASSERTION = makeKeyword("KB-MODIFY-CREATE-ASSERTION");

    private static final SubLSymbol $FORT_ASSERTION_ADDED = makeKeyword("FORT-ASSERTION-ADDED");

    private static final SubLSymbol $KB_MODIFY_REMOVE_ASSERTION = makeKeyword("KB-MODIFY-REMOVE-ASSERTION");

    private static final SubLSymbol $FORT_ASSERTION_REMOVED = makeKeyword("FORT-ASSERTION-REMOVED");

    private static final SubLSymbol $KB_MODIFY_REMOVE_NART = makeKeyword("KB-MODIFY-REMOVE-NART");

    private static final SubLSymbol $CYCL_COLLECTION_EVENT = makeKeyword("CYCL-COLLECTION-EVENT");



    private static final SubLSymbol $CYCL_MICROTHEORY_EVENT = makeKeyword("CYCL-MICROTHEORY-EVENT");

    private static final SubLSymbol EVENT_FILTER_DESCRIPTION = makeSymbol("EVENT-FILTER-DESCRIPTION");

    private static final SubLSymbol EVENT_FILTER_DESCRIPTION_P = makeSymbol("EVENT-FILTER-DESCRIPTION-P");

    static private final SubLList $list67 = list(makeSymbol("ID"), makeSymbol("PATTERN"));

    static private final SubLList $list68 = list(makeKeyword("ID"), makeKeyword("PATTERN"));

    static private final SubLList $list69 = list(makeSymbol("EVENT-FILTER-DESCRIPTION-ID"), makeSymbol("EVENT-FILTER-DESCRIPTION-PATTERN"));

    static private final SubLList $list70 = list(makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-ID"), makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN"));

    private static final SubLSymbol PRINT_EVENT_FILTER_DESCRIPTION = makeSymbol("PRINT-EVENT-FILTER-DESCRIPTION");

    private static final SubLSymbol EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-FILTER-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list73 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVENT-FILTER-DESCRIPTION-P"));

    private static final SubLSymbol EVENT_FILTER_DESCRIPTION_ID = makeSymbol("EVENT-FILTER-DESCRIPTION-ID");

    private static final SubLSymbol _CSETF_EVENT_FILTER_DESCRIPTION_ID = makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-ID");

    private static final SubLSymbol EVENT_FILTER_DESCRIPTION_PATTERN = makeSymbol("EVENT-FILTER-DESCRIPTION-PATTERN");

    private static final SubLSymbol _CSETF_EVENT_FILTER_DESCRIPTION_PATTERN = makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN");

    private static final SubLString $str80$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_EVENT_FILTER_DESCRIPTION = makeSymbol("MAKE-EVENT-FILTER-DESCRIPTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVENT_FILTER_DESCRIPTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-FILTER-DESCRIPTION-METHOD");

    private static final SubLString $str86$_id__ = makeString(" id: ");

    private static final SubLString $str87$_pattern__ = makeString(" pattern: ");

    private static final SubLSymbol $event_filter_registration$ = makeSymbol("*EVENT-FILTER-REGISTRATION*");

    private static final SubLSymbol $event_filter_registration_lock$ = makeSymbol("*EVENT-FILTER-REGISTRATION-LOCK*");

    private static final SubLString $$$Event_Filter_Registration = makeString("Event Filter Registration");

    private static final SubLSymbol $event_filter_pattern_id$ = makeSymbol("*EVENT-FILTER-PATTERN-ID*");

    private static final SubLString $str92$Current_KB_Modification_Event_Fil = makeString("Current KB Modification Event Filter Registration");

    private static final SubLSymbol CREATE_KB_MODIFICATION_EVENT_FILTER = makeSymbol("CREATE-KB-MODIFICATION-EVENT-FILTER");

    private static final SubLSymbol DELETE_KB_MODIFICATION_EVENT_FILTER = makeSymbol("DELETE-KB-MODIFICATION-EVENT-FILTER");

    private static final SubLSymbol $kb_modification_event_to_filter_mapping$ = makeSymbol("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*");

    private static final SubLSymbol $kb_modification_event_to_filter_mapping_lock$ = makeSymbol("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*");

    private static final SubLString $str98$KB_Modification_Event_to_Filter_M = makeString("KB Modification Event to Filter Mapping");

    private static final SubLSymbol $kb_modification_event_internal_listener_table$ = makeSymbol("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*");

    private static final SubLString $str100$Current_KB_Modification_Event_To_ = makeString("Current KB Modification Event To Filter Mapping");

    private static final SubLString $str101$Current_KB_Modification_Event_Int = makeString("Current KB Modification Event Internal Listener Table");

    private static final SubLSymbol KB_MODIFICATION_EVENT_FILTER_GENERIC_EVENT_HANDLER = makeSymbol("KB-MODIFICATION-EVENT-FILTER-GENERIC-EVENT-HANDLER");

    private static final SubLSymbol $KB_MODIFICATION_FILTER_FIRED = makeKeyword("KB-MODIFICATION-FILTER-FIRED");

    private static final SubLSymbol EVENT_P = makeSymbol("EVENT-P");

    private static final SubLString $str112$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    private static final SubLString $str114$Not_implemented_for_type__A = makeString("Not implemented for type ~A");

    private static final SubLSymbol $KB_STORE_EVENT = makeKeyword("KB-STORE-EVENT");

    private static final SubLSymbol $kb_modification_filter_event_fired_listener$ = makeSymbol("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*");

    private static final SubLSymbol HANDLE_KB_MODIFICATION_FILTER_FIRED = makeSymbol("HANDLE-KB-MODIFICATION-FILTER-FIRED");

    private static final SubLList $list118 = list(CHAR_hyphen);

    private static final SubLString $$$eventNotifications = makeString("eventNotifications");

    private static final SubLString $str121$http___www_opencyc_org_xml_eventN = makeString("http://www.opencyc.org/xml/eventNotifications.dtd");

    private static final SubLString $$$eventNotification = makeString("eventNotification");

    private static final SubLString $$$kbModificationFilteredEvent = makeString("kbModificationFilteredEvent");

    private static final SubLString $$$filterList = makeString("filterList");

    private static final SubLString $$$filterId = makeString("filterId");

    private static final SubLString $$$timestamp = makeString("timestamp");

    private static final SubLString $$$kbEvents = makeString("kbEvents");

    private static final SubLString $$$kbEvent = makeString("kbEvent");

    private static final SubLString $str132$KB_Modification_Filter_Fired__cou = makeString("KB Modification Filter Fired: could not report event ~S to listener ~A -> error ~A.~%Deregistering listener ~A");

    private static final SubLSymbol $event_filter_listener_registration$ = makeSymbol("*EVENT-FILTER-LISTENER-REGISTRATION*");

    private static final SubLSymbol $event_filter_listener_registration_lock$ = makeSymbol("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*");

    private static final SubLString $str135$Event_Filter_Listener_Registratio = makeString("Event Filter Listener Registration");

    private static final SubLSymbol $event_filter_listener_id$ = makeSymbol("*EVENT-FILTER-LISTENER-ID*");

    private static final SubLString $str137$Current_External_KB_Modification_ = makeString("Current External KB Modification Event Filter Listener Registration");

    private static final SubLSymbol DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = makeSymbol("DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");

    private static final SubLSymbol TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD = makeSymbol("TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-SOCKET-INFO-METHOD");

    private static final SubLSymbol $sym140$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO = makeSymbol("COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD");

    private static final SubLSymbol EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD = makeSymbol("EXTERNAL-EVENT-FILTER-LISTENER-P-SOCKET-INFO-METHOD");

    private static final SubLSymbol $sym142$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD = makeSymbol("IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD");

    private static final SubLSymbol INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD = makeSymbol("INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD");

    private static final SubLString $str145$_A__About_to_send_to__A__A____A__ = makeString("~A: About to send to ~A:~A:~%~A~%");

    private static final SubLSymbol CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");

    private static final SubLSymbol $kb_modification_event_mailbox_suite$ = makeSymbol("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*");

    private static final SubLSymbol WITH_MESSAGE_MAILBOX_SUITE = makeSymbol("WITH-MESSAGE-MAILBOX-SUITE");

    static private final SubLList $list152 = list(makeSymbol("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*"));

    private static final SubLSymbol MESSAGE_MAILBOX_LISTENER = makeSymbol("MESSAGE-MAILBOX-LISTENER");

    private static final SubLSymbol MESSAGE_MAILBOX_LISTENER_P = makeSymbol("MESSAGE-MAILBOX-LISTENER-P");

    private static final SubLList $list155 = list(makeSymbol("ADDRESS"));

    private static final SubLList $list156 = list(makeKeyword("ADDRESS"));

    private static final SubLList $list157 = list(makeSymbol("MMBOX-LISTENER-ADDRESS"));

    private static final SubLList $list158 = list(makeSymbol("_CSETF-MMBOX-LISTENER-ADDRESS"));

    private static final SubLSymbol PRINT_MESSAGE_MAILBOX_LISTENER = makeSymbol("PRINT-MESSAGE-MAILBOX-LISTENER");

    private static final SubLSymbol MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MESSAGE-MAILBOX-LISTENER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list161 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MESSAGE-MAILBOX-LISTENER-P"));

    private static final SubLSymbol MMBOX_LISTENER_ADDRESS = makeSymbol("MMBOX-LISTENER-ADDRESS");

    private static final SubLSymbol _CSETF_MMBOX_LISTENER_ADDRESS = makeSymbol("_CSETF-MMBOX-LISTENER-ADDRESS");

    private static final SubLSymbol MAKE_MESSAGE_MAILBOX_LISTENER = makeSymbol("MAKE-MESSAGE-MAILBOX-LISTENER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_LISTENER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLString $str167$_address__ = makeString(" address: ");

    private static final SubLSymbol $sym169$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN = makeSymbol("TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLSymbol $sym170$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L = makeSymbol("COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLSymbol EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD = makeSymbol("EXTERNAL-EVENT-FILTER-LISTENER-P-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLSymbol $sym172$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER = makeSymbol("IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLSymbol $sym173$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE = makeSymbol("INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    private static final SubLString $str174$The_listener__S_is_no_longer_vali = makeString("The listener ~S is no longer valid.");

    private static final SubLSymbol $sym175$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST = makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER");

    private static final SubLSymbol ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX = makeSymbol("ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX");

    private static final SubLString $str177$Not_a_valid_external_event_filter = makeString("Not a valid external event filter listener ID.");

    private static final SubLString $str178$Wrong_API_for_type____only_suitab = makeString("Wrong API for type -- only suitable for message mailbox listeners.");

    private static final SubLSymbol $active_external_kb_modification_event_filters$ = makeSymbol("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*");

    private static final SubLSymbol $external_kb_modification_event_listeners_for_filters$ = makeSymbol("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*");

    private static final SubLString $str181$External_KB_Modification_Event_Li = makeString("External KB Modification Event Listeners");

    private static final SubLString $str182$Current_External_KB_Modification_ = makeString("Current External KB Modification Event Filters & Listeners");

    private static final SubLString $str183$_Active_Filters__ = makeString(" Active Filters: ");

    private static final SubLString $str184$_Listeners_for_Filters_Map__ = makeString(" Listeners for Filters Map: ");

    private static final SubLSymbol ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = makeSymbol("ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");

    private static final SubLSymbol REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER = makeSymbol("REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");

    private static final SubLString $$$KB_Modification_Event_Filters = makeString("KB Modification Event Filters");

    private static final SubLString $str189$KB_Modification_Event_Filters_Tes = makeString("KB Modification Event Filters Test Suite");

    public static final SubLObject register_new_kb_modification_filter_alt(SubLObject filter, SubLObject function_spec) {
        return dictionary.dictionary_enter($kb_modification_filter_map$.getGlobalValue(), filter, function_spec);
    }

    public static SubLObject register_new_kb_modification_filter(final SubLObject filter, final SubLObject function_spec) {
        return dictionary.dictionary_enter($kb_modification_filter_map$.getGlobalValue(), filter, function_spec);
    }

    public static final SubLObject register_kb_modification_filter_event_equivalents_alt(SubLObject filter, SubLObject event_denotations) {
        {
            SubLObject events = NIL;
            SubLObject v_properties = NIL;
            {
                SubLObject cdolist_list_var = event_denotations;
                SubLObject event_denotation = NIL;
                for (event_denotation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event_denotation = cdolist_list_var.first()) {
                    if (NIL != kb_modification_event_support.valid_kb_modification_event_class_p(event_denotation)) {
                        {
                            SubLObject item_var = event_denotation;
                            if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                                events = cons(item_var, events);
                            }
                        }
                    } else {
                        if (NIL != kb_modification_event_support.valid_kb_modification_event_property_p(event_denotation)) {
                            v_properties = cons(event_denotation, v_properties);
                        } else {
                            Errors.error($str_alt0$Invalid_event_denotation__A_for_f, event_denotation, filter);
                        }
                    }
                }
            }
            if (NIL != v_properties) {
                {
                    SubLObject cdolist_list_var = kb_modification_event_support.get_kb_modification_event_classes_with_all_properties(v_properties);
                    SubLObject event = NIL;
                    for (event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = event;
                            if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                                events = cons(item_var, events);
                            }
                        }
                    }
                }
            }
            return dictionary.dictionary_enter($kb_modification_filter_event_equivalents$.getGlobalValue(), filter, events);
        }
    }

    public static SubLObject register_kb_modification_filter_event_equivalents(final SubLObject filter, final SubLObject event_denotations) {
        SubLObject events = NIL;
        SubLObject v_properties = NIL;
        SubLObject cdolist_list_var = event_denotations;
        SubLObject event_denotation = NIL;
        event_denotation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_modification_event_support.valid_kb_modification_event_class_p(event_denotation)) {
                final SubLObject item_var = event_denotation;
                if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                    events = cons(item_var, events);
                }
            } else
                if (NIL != kb_modification_event_support.valid_kb_modification_event_property_p(event_denotation)) {
                    v_properties = cons(event_denotation, v_properties);
                } else {
                    Errors.error($str0$Invalid_event_denotation__A_for_f, event_denotation, filter);
                }

            cdolist_list_var = cdolist_list_var.rest();
            event_denotation = cdolist_list_var.first();
        } 
        if (NIL != v_properties) {
            cdolist_list_var = kb_modification_event_support.get_kb_modification_event_classes_with_all_properties(v_properties);
            SubLObject event = NIL;
            event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = event;
                if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                    events = cons(item_var, events);
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            } 
        }
        return dictionary.dictionary_enter($kb_modification_filter_event_equivalents$.getGlobalValue(), filter, events);
    }

    public static final SubLObject get_kb_modification_filter_event_equivalents_alt(SubLObject filter) {
        return dictionary.dictionary_lookup($kb_modification_filter_event_equivalents$.getGlobalValue(), filter, UNPROVIDED);
    }

    public static SubLObject get_kb_modification_filter_event_equivalents(final SubLObject filter) {
        return dictionary.dictionary_lookup($kb_modification_filter_event_equivalents$.getGlobalValue(), filter, UNPROVIDED);
    }

    public static final SubLObject define_kb_modification_event_filter_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject filter_token = NIL;
            SubLObject events = NIL;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            SubLObject docstring = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            filter_token = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt1);
            events = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt1);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt1);
            arglist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt1);
            docstring = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                if (arglist.first() != EVENT) {
                    Errors.error($str_alt3$Arglist_must_start_with_event_par);
                }
                return list(PROGN, listS(DEFINE_PRIVATE, name, arglist, docstring, append(body, NIL)), list(REGISTER_NEW_KB_MODIFICATION_FILTER, filter_token, list(QUOTE, name)), list(REGISTER_KB_MODIFICATION_FILTER_EVENT_EQUIVALENTS, filter_token, list(QUOTE, events)));
            }
        }
    }

    public static SubLObject define_kb_modification_event_filter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filter_token = NIL;
        SubLObject events = NIL;
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        SubLObject docstring = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        filter_token = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        events = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        docstring = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (arglist.first() != EVENT) {
            Errors.error($str3$Arglist_must_start_with_event_par);
        }
        return list(PROGN, listS(DEFINE_PRIVATE, name, arglist, docstring, append(body, NIL)), list(REGISTER_NEW_KB_MODIFICATION_FILTER, filter_token, list(QUOTE, name)), list(REGISTER_KB_MODIFICATION_FILTER_EVENT_EQUIVALENTS, filter_token, list(QUOTE, events)));
    }

    public static final SubLObject map_kb_modification_filter_to_function_spec_alt(SubLObject filter) {
        return dictionary.dictionary_lookup($kb_modification_filter_map$.getGlobalValue(), filter, symbol_function(IDENTITY));
    }

    public static SubLObject map_kb_modification_filter_to_function_spec(final SubLObject filter) {
        return dictionary.dictionary_lookup($kb_modification_filter_map$.getGlobalValue(), filter, symbol_function(IDENTITY));
    }

    public static final SubLObject with_matched_kb_modification_event_filters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject filters = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    filters = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt11, append(body, list(listS(CSETQ, filters, $list_alt13))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt9);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_matched_kb_modification_event_filters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filters = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        filters = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, $list11, append(body, list(listS(CSETQ, filters, $list13))));
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    /**
     * Evaluate the event on the filter expression; accumulate the support information
     * in the information-bundle and the filters that fired in the passed-filters.
     */
    @LispMethod(comment = "Evaluate the event on the filter expression; accumulate the support information\r\nin the information-bundle and the filters that fired in the passed-filters.\nEvaluate the event on the filter expression; accumulate the support information\nin the information-bundle and the filters that fired in the passed-filters.")
    public static final SubLObject apply_filter_to_kb_modification_event_alt(SubLObject event, SubLObject filter_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject passed_filters = NIL;
                SubLObject information_bundle = NIL;
                {
                    SubLObject _prev_bind_0 = $matched_kb_modification_event_filters$.currentBinding(thread);
                    try {
                        $matched_kb_modification_event_filters$.bind(NIL, thread);
                        information_bundle = apply_filter_to_kb_modification_event_internal(event, filter_expression);
                        passed_filters = $matched_kb_modification_event_filters$.getDynamicValue(thread);
                    } finally {
                        $matched_kb_modification_event_filters$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(information_bundle, passed_filters);
            }
        }
    }

    /**
     * Evaluate the event on the filter expression; accumulate the support information
     * in the information-bundle and the filters that fired in the passed-filters.
     */
    @LispMethod(comment = "Evaluate the event on the filter expression; accumulate the support information\r\nin the information-bundle and the filters that fired in the passed-filters.\nEvaluate the event on the filter expression; accumulate the support information\nin the information-bundle and the filters that fired in the passed-filters.")
    public static SubLObject apply_filter_to_kb_modification_event(final SubLObject event, final SubLObject filter_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passed_filters = NIL;
        SubLObject information_bundle = NIL;
        final SubLObject _prev_bind_0 = $matched_kb_modification_event_filters$.currentBinding(thread);
        try {
            $matched_kb_modification_event_filters$.bind(NIL, thread);
            information_bundle = apply_filter_to_kb_modification_event_internal(event, filter_expression);
            passed_filters = $matched_kb_modification_event_filters$.getDynamicValue(thread);
        } finally {
            $matched_kb_modification_event_filters$.rebind(_prev_bind_0, thread);
        }
        return values(information_bundle, passed_filters);
    }

    public static final SubLObject apply_filter_to_kb_modification_event_internal_alt(SubLObject event, SubLObject filter_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filter = filter_expression.first();
                SubLObject pcase_var = filter;
                if (pcase_var.eql($AND)) {
                    {
                        SubLObject was_falseP = NIL;
                        SubLObject v_clauses = filter_expression.rest();
                        SubLObject information_bundle = NIL;
                        if (NIL == was_falseP) {
                            {
                                SubLObject csome_list_var = v_clauses;
                                SubLObject expression = NIL;
                                for (expression = csome_list_var.first(); !((NIL != was_falseP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , expression = csome_list_var.first()) {
                                    {
                                        SubLObject result = apply_filter_to_kb_modification_event_internal(event, expression);
                                        if (NIL != list_utilities.sublisp_boolean(result)) {
                                            if (NIL != symbolic_plist_p(result)) {
                                                information_bundle = cons(result, information_bundle);
                                            } else {
                                                if (NIL != list_utilities.list_of_type_p(SYMBOLIC_PLIST_P, result)) {
                                                    {
                                                        SubLObject cdolist_list_var = result;
                                                        SubLObject one_result = NIL;
                                                        for (one_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , one_result = cdolist_list_var.first()) {
                                                            information_bundle = cons(one_result, information_bundle);
                                                        }
                                                    }
                                                } else {
                                                    information_bundle = cons(result, information_bundle);
                                                }
                                            }
                                        } else {
                                            was_falseP = T;
                                        }
                                    }
                                }
                            }
                        }
                        return NIL == was_falseP ? ((SubLObject) (nreverse(information_bundle))) : NIL;
                    }
                } else {
                    if (pcase_var.eql($OR)) {
                        {
                            SubLObject was_trueP = NIL;
                            SubLObject v_clauses = filter_expression.rest();
                            SubLObject information_bundle = NIL;
                            if (NIL == was_trueP) {
                                {
                                    SubLObject csome_list_var = v_clauses;
                                    SubLObject expression = NIL;
                                    for (expression = csome_list_var.first(); !((NIL != was_trueP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , expression = csome_list_var.first()) {
                                        {
                                            SubLObject result = apply_filter_to_kb_modification_event_internal(event, expression);
                                            if (NIL != list_utilities.sublisp_boolean(result)) {
                                                if (NIL != symbolic_plist_p(result)) {
                                                    information_bundle = cons(result, information_bundle);
                                                } else {
                                                    if (NIL != list_utilities.list_of_type_p(SYMBOLIC_PLIST_P, result)) {
                                                        {
                                                            SubLObject cdolist_list_var = result;
                                                            SubLObject one_result = NIL;
                                                            for (one_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , one_result = cdolist_list_var.first()) {
                                                                information_bundle = cons(one_result, information_bundle);
                                                            }
                                                        }
                                                    } else {
                                                        information_bundle = cons(result, information_bundle);
                                                    }
                                                }
                                                was_trueP = T;
                                            }
                                        }
                                    }
                                }
                            }
                            return NIL != was_trueP ? ((SubLObject) (nreverse(information_bundle))) : NIL;
                        }
                    } else {
                        if (pcase_var.eql($NOT)) {
                            {
                                SubLObject passedP = NIL;
                                SubLObject passed_filters = NIL;
                                {
                                    SubLObject _prev_bind_0 = $matched_kb_modification_event_filters$.currentBinding(thread);
                                    try {
                                        $matched_kb_modification_event_filters$.bind(NIL, thread);
                                        passedP = apply_filter_to_kb_modification_event_internal(event, second(filter_expression));
                                        passed_filters = $matched_kb_modification_event_filters$.getDynamicValue(thread);
                                    } finally {
                                        $matched_kb_modification_event_filters$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (NIL == passedP) {
                                    $matched_kb_modification_event_filters$.setDynamicValue(cons(cons($NOT, passed_filters), $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
                                }
                                return makeBoolean(NIL == passedP);
                            }
                        } else {
                            {
                                SubLObject function_spec = map_kb_modification_filter_to_function_spec(filter);
                                return apply(function_spec, cons(event, filter_expression.rest().rest()));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject apply_filter_to_kb_modification_event_internal(final SubLObject event, final SubLObject filter_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject filter = pcase_var = filter_expression.first();
        if (pcase_var.eql($AND)) {
            SubLObject was_falseP = NIL;
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject information_bundle = NIL;
            if (NIL == was_falseP) {
                SubLObject csome_list_var = v_clauses;
                SubLObject expression = NIL;
                expression = csome_list_var.first();
                while ((NIL == was_falseP) && (NIL != csome_list_var)) {
                    final SubLObject result = apply_filter_to_kb_modification_event_internal(event, expression);
                    if (NIL != list_utilities.sublisp_boolean(result)) {
                        if (NIL != symbolic_plist_p(result)) {
                            information_bundle = cons(result, information_bundle);
                        } else
                            if (NIL != list_utilities.list_of_type_p(SYMBOLIC_PLIST_P, result)) {
                                SubLObject cdolist_list_var = result;
                                SubLObject one_result = NIL;
                                one_result = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    information_bundle = cons(one_result, information_bundle);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    one_result = cdolist_list_var.first();
                                } 
                            } else {
                                information_bundle = cons(result, information_bundle);
                            }

                    } else {
                        was_falseP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    expression = csome_list_var.first();
                } 
            }
            return NIL == was_falseP ? nreverse(information_bundle) : NIL;
        }
        if (pcase_var.eql($OR)) {
            SubLObject was_trueP = NIL;
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject information_bundle = NIL;
            if (NIL == was_trueP) {
                SubLObject csome_list_var = v_clauses;
                SubLObject expression = NIL;
                expression = csome_list_var.first();
                while ((NIL == was_trueP) && (NIL != csome_list_var)) {
                    final SubLObject result = apply_filter_to_kb_modification_event_internal(event, expression);
                    if (NIL != list_utilities.sublisp_boolean(result)) {
                        if (NIL != symbolic_plist_p(result)) {
                            information_bundle = cons(result, information_bundle);
                        } else
                            if (NIL != list_utilities.list_of_type_p(SYMBOLIC_PLIST_P, result)) {
                                SubLObject cdolist_list_var = result;
                                SubLObject one_result = NIL;
                                one_result = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    information_bundle = cons(one_result, information_bundle);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    one_result = cdolist_list_var.first();
                                } 
                            } else {
                                information_bundle = cons(result, information_bundle);
                            }

                        was_trueP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    expression = csome_list_var.first();
                } 
            }
            return NIL != was_trueP ? nreverse(information_bundle) : NIL;
        }
        if (pcase_var.eql($NOT)) {
            SubLObject passedP = NIL;
            SubLObject passed_filters = NIL;
            final SubLObject _prev_bind_0 = $matched_kb_modification_event_filters$.currentBinding(thread);
            try {
                $matched_kb_modification_event_filters$.bind(NIL, thread);
                passedP = apply_filter_to_kb_modification_event_internal(event, second(filter_expression));
                passed_filters = $matched_kb_modification_event_filters$.getDynamicValue(thread);
            } finally {
                $matched_kb_modification_event_filters$.rebind(_prev_bind_0, thread);
            }
            if (NIL == passedP) {
                $matched_kb_modification_event_filters$.setDynamicValue(cons(cons($NOT, passed_filters), $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            }
            return makeBoolean(NIL == passedP);
        }
        final SubLObject function_spec = map_kb_modification_filter_to_function_spec(filter);
        return apply(function_spec, cons(event, filter_expression.rest().rest()));
    }

    public static final SubLObject symbolic_plist_p_alt(SubLObject list) {
        return makeBoolean((NIL != list_utilities.property_list_p(list)) && list.first().isSymbol());
    }

    public static SubLObject symbolic_plist_p(final SubLObject list) {
        return makeBoolean((NIL != list_utilities.property_list_p(list)) && list.first().isSymbol());
    }

    public static final SubLObject extract_filters_from_kb_modification_filter_expression_alt(SubLObject filter_expression) {
        {
            SubLObject filter = filter_expression.first();
            SubLObject pcase_var = filter;
            if (pcase_var.eql($AND) || pcase_var.eql($OR)) {
                {
                    SubLObject v_clauses = filter_expression.rest();
                    SubLObject filters = NIL;
                    SubLObject cdolist_list_var = v_clauses;
                    SubLObject clause = NIL;
                    for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                        {
                            SubLObject sub_filters = extract_filters_from_kb_modification_filter_expression(clause);
                            SubLObject cdolist_list_var_1 = sub_filters;
                            SubLObject sub_filter = NIL;
                            for (sub_filter = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , sub_filter = cdolist_list_var_1.first()) {
                                {
                                    SubLObject item_var = sub_filter;
                                    if (NIL == member(item_var, filters, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        filters = cons(item_var, filters);
                                    }
                                }
                            }
                        }
                    }
                    return filters;
                }
            } else {
                if (pcase_var.eql($NOT)) {
                    return extract_filters_from_kb_modification_filter_expression(second(filter_expression));
                } else {
                    return list(filter);
                }
            }
        }
    }

    public static SubLObject extract_filters_from_kb_modification_filter_expression(final SubLObject filter_expression) {
        final SubLObject pcase_var;
        final SubLObject filter = pcase_var = filter_expression.first();
        if (pcase_var.eql($AND) || pcase_var.eql($OR)) {
            final SubLObject v_clauses = filter_expression.rest();
            SubLObject filters = NIL;
            SubLObject cdolist_list_var = v_clauses;
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1;
                final SubLObject sub_filters = cdolist_list_var_$1 = extract_filters_from_kb_modification_filter_expression(clause);
                SubLObject sub_filter = NIL;
                sub_filter = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    final SubLObject item_var = sub_filter;
                    if (NIL == member(item_var, filters, symbol_function(EQL), symbol_function(IDENTITY))) {
                        filters = cons(item_var, filters);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    sub_filter = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            return filters;
        }
        if (pcase_var.eql($NOT)) {
            return extract_filters_from_kb_modification_filter_expression(second(filter_expression));
        }
        return list(filter);
    }

    public static final SubLObject compute_implied_kb_modification_events_from_filter_expression_alt(SubLObject filter_expression) {
        {
            SubLObject filters = extract_filters_from_kb_modification_filter_expression(filter_expression);
            SubLObject events = NIL;
            SubLObject cdolist_list_var = filters;
            SubLObject filter = NIL;
            for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                {
                    SubLObject event_equivalents = get_kb_modification_filter_event_equivalents(filter);
                    SubLObject cdolist_list_var_2 = event_equivalents;
                    SubLObject event = NIL;
                    for (event = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , event = cdolist_list_var_2.first()) {
                        {
                            SubLObject item_var = event;
                            if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                                events = cons(item_var, events);
                            }
                        }
                    }
                }
            }
            return events;
        }
    }

    public static SubLObject compute_implied_kb_modification_events_from_filter_expression(final SubLObject filter_expression) {
        final SubLObject filters = extract_filters_from_kb_modification_filter_expression(filter_expression);
        SubLObject events = NIL;
        SubLObject cdolist_list_var = filters;
        SubLObject filter = NIL;
        filter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject event_equivalents = cdolist_list_var_$2 = get_kb_modification_filter_event_equivalents(filter);
            SubLObject event = NIL;
            event = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject item_var = event;
                if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                    events = cons(item_var, events);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                event = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            filter = cdolist_list_var.first();
        } 
        return events;
    }

    /**
     * Let's all pass -- works like identity.
     */
    @LispMethod(comment = "Let\'s all pass -- works like identity.")
    public static final SubLObject default_kb_modification_event_filter_alt(SubLObject event) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $matched_kb_modification_event_filters$.setDynamicValue(cons($DEFAULT_KB_MODIFICATION_EVENT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return append(list($EVENT_CLASS, event_model.event_class(event)), event_model.event_message(event));
        }
    }

    /**
     * Let's all pass -- works like identity.
     */
    @LispMethod(comment = "Let\'s all pass -- works like identity.")
    public static SubLObject default_kb_modification_event_filter(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $matched_kb_modification_event_filters$.setDynamicValue(cons($DEFAULT_KB_MODIFICATION_EVENT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
        return append(list($EVENT_CLASS, event_model.event_class(event)), event_model.event_message(event));
    }

    /**
     * Ensures that this event is relevant to the fort FORT when considered under modifier.
     */
    @LispMethod(comment = "Ensures that this event is relevant to the fort FORT when considered under modifier.")
    public static final SubLObject kb_modification_event_fort_filter_alt(SubLObject event, SubLObject fort, SubLObject modifier) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject details = kb_modification_event_mentions_fort(event, fort, modifier);
                if (NIL != details) {
                    $matched_kb_modification_event_filters$.setDynamicValue(cons($FORT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
                    return details;
                }
            }
            return NIL;
        }
    }

    /**
     * Ensures that this event is relevant to the fort FORT when considered under modifier.
     */
    @LispMethod(comment = "Ensures that this event is relevant to the fort FORT when considered under modifier.")
    public static SubLObject kb_modification_event_fort_filter(final SubLObject event, final SubLObject fort, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_mentions_fort(event, fort, modifier);
        if (NIL != details) {
            $matched_kb_modification_event_filters$.setDynamicValue(cons($FORT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return NIL;
    }

    /**
     * Ensures that this event is relevant to the collection COLLECTION when considered under MODIFIER.
     */
    @LispMethod(comment = "Ensures that this event is relevant to the collection COLLECTION when considered under MODIFIER.")
    public static final SubLObject kb_modification_event_collection_filter_alt(SubLObject event, SubLObject collection, SubLObject modifier, SubLObject subsumption) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject details = kb_modification_event_test_for_collection_assertions(event, collection, modifier, subsumption);
                if (NIL != details) {
                    $matched_kb_modification_event_filters$.setDynamicValue(cons($COLLECTION_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
                    return details;
                }
            }
            return NIL;
        }
    }

    /**
     * Ensures that this event is relevant to the collection COLLECTION when considered under MODIFIER.
     */
    @LispMethod(comment = "Ensures that this event is relevant to the collection COLLECTION when considered under MODIFIER.")
    public static SubLObject kb_modification_event_collection_filter(final SubLObject event, final SubLObject collection, final SubLObject modifier, final SubLObject subsumption) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_test_for_collection_assertions(event, collection, modifier, subsumption);
        if (NIL != details) {
            $matched_kb_modification_event_filters$.setDynamicValue(cons($COLLECTION_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return NIL;
    }

    /**
     * Ensures that this event is relevant to lexicon representation for the fort.
     */
    @LispMethod(comment = "Ensures that this event is relevant to lexicon representation for the fort.")
    public static final SubLObject kb_modification_event_lexicon_fort_filter_alt(SubLObject event, SubLObject fort, SubLObject modifier) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $matched_kb_modification_event_filters$.setDynamicValue(cons($LEXICON_FORT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return event_model.event_message(event);
        }
    }

    /**
     * Ensures that this event is relevant to lexicon representation for the fort.
     */
    @LispMethod(comment = "Ensures that this event is relevant to lexicon representation for the fort.")
    public static SubLObject kb_modification_event_lexicon_fort_filter(final SubLObject event, final SubLObject fort, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $matched_kb_modification_event_filters$.setDynamicValue(cons($LEXICON_FORT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
        return event_model.event_message(event);
    }

    /**
     * Ensures that this event is relevant to the microtheory HLMT when considerd under MODIFIER
     */
    @LispMethod(comment = "Ensures that this event is relevant to the microtheory HLMT when considerd under MODIFIER")
    public static final SubLObject kb_modification_event_mt_filter_alt(SubLObject event, SubLObject v_hlmt, SubLObject modifier) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject details = kb_modification_event_test_for_microtheory(event, v_hlmt, modifier);
                if (NIL != details) {
                    $matched_kb_modification_event_filters$.setDynamicValue(cons($MT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
                    return details;
                }
            }
            return NIL;
        }
    }

    /**
     * Ensures that this event is relevant to the microtheory HLMT when considerd under MODIFIER
     */
    @LispMethod(comment = "Ensures that this event is relevant to the microtheory HLMT when considerd under MODIFIER")
    public static SubLObject kb_modification_event_mt_filter(final SubLObject event, final SubLObject v_hlmt, final SubLObject modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject details = kb_modification_event_test_for_microtheory(event, v_hlmt, modifier);
        if (NIL != details) {
            $matched_kb_modification_event_filters$.setDynamicValue(cons($MT_FILTER, $matched_kb_modification_event_filters$.getDynamicValue(thread)), thread);
            return details;
        }
        return NIL;
    }

    public static final SubLObject kb_modification_event_mentions_fort_alt(SubLObject event, SubLObject fort, SubLObject modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $ANY_CHANGE;
        }
        if (NIL == forts.fort_p(fort)) {
            fort = narts_high.find_nart(fort);
            if (NIL == forts.fort_p(fort)) {
                return NIL;
            }
        }
        {
            SubLObject pcase_var = event_model.event_class(event);
            if (pcase_var.eql($KB_MODIFY_REMOVE_CONSTANT)) {
                if (((($ANY_CHANGE == modifier) || ($FORT_REMOVED == modifier)) && (NIL != constant_p(fort))) && constants_high.constant_external_id(fort).equalp(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_constant_retrieve_external_id(event)))) {
                    return list($EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $REMOVED_VALUE, fort);
                }
            } else {
                if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
                    if (($ANY_CHANGE == modifier) || ($FORT_ASSERTION_ADDED == modifier)) {
                        {
                            SubLObject cnf = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event));
                            SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event));
                            if ((NIL != cycl_utilities.expression_find(fort, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (fort == mt)) {
                                return list(new SubLObject[]{ $EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_ADDED, $FORT_MODIFIED, fort, $ASSERTION_SENTENCE, clauses.cnf_formula(cnf, UNPROVIDED), $ASSERTION_MT, mt });
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                        if (($ANY_CHANGE == modifier) || ($FORT_ASSERTION_REMOVED == modifier)) {
                            {
                                SubLObject formula = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
                                SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event));
                                if ((NIL != cycl_utilities.expression_find(fort, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (fort == mt)) {
                                    return list(new SubLObject[]{ $EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $ASSERTION_SENTENCE, kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event), $ASSERTION_MT, mt });
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($KB_MODIFY_REMOVE_NART)) {
                            if (((($ANY_CHANGE == modifier) || ($FORT_REMOVED == modifier)) && (NIL != nart_handles.nart_p(fort))) && narts_high.nart_hl_formula(fort).equalp(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_nart_retrieve_nart_hl_formula(event)))) {
                                return list($EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $REMOVED_VALUE, fort);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_modification_event_mentions_fort(final SubLObject event, SubLObject fort, SubLObject modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $ANY_CHANGE;
        }
        if (NIL == forts.fort_p(fort)) {
            fort = narts_high.find_nart(fort);
            if (NIL == forts.fort_p(fort)) {
                return NIL;
            }
        }
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql($KB_MODIFY_REMOVE_CONSTANT)) {
            if (((($ANY_CHANGE == modifier) || ($FORT_REMOVED == modifier)) && (NIL != constant_p(fort))) && constants_high.constant_external_id(fort).equalp(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_constant_retrieve_external_id(event)))) {
                return list($EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $REMOVED_VALUE, fort);
            }
        } else
            if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
                if (($ANY_CHANGE == modifier) || ($FORT_ASSERTION_ADDED == modifier)) {
                    final SubLObject cnf = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event));
                    final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event));
                    if ((NIL != cycl_utilities.expression_find(fort, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || fort.eql(mt)) {
                        return list(new SubLObject[]{ $EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_ADDED, $FORT_MODIFIED, fort, $ASSERTION_SENTENCE, clauses.cnf_formula(cnf, UNPROVIDED), $ASSERTION_MT, mt });
                    }
                }
            } else
                if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                    if (($ANY_CHANGE == modifier) || ($FORT_ASSERTION_REMOVED == modifier)) {
                        final SubLObject formula = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
                        final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event));
                        if ((NIL != cycl_utilities.expression_find(fort, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || fort.eql(mt)) {
                            return list(new SubLObject[]{ $EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $ASSERTION_SENTENCE, kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event), $ASSERTION_MT, mt });
                        }
                    }
                } else
                    if (((pcase_var.eql($KB_MODIFY_REMOVE_NART) && (($ANY_CHANGE == modifier) || ($FORT_REMOVED == modifier))) && (NIL != nart_handles.nart_p(fort))) && narts_high.nart_hl_formula(fort).equalp(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_nart_retrieve_nart_hl_formula(event)))) {
                        return list($EVENT_TYPE, $CYCL_FORT_EVENT, $EVENT_REASON, $ITEM_REMOVED, $FORT_MODIFIED, fort, $REMOVED_VALUE, fort);
                    }



        return NIL;
    }

    public static final SubLObject kb_modification_event_test_for_collection_assertions_alt(SubLObject event, SubLObject collection, SubLObject modifier, SubLObject subsumption_modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $ANY_CHANGE;
        }
        if (subsumption_modifier == UNPROVIDED) {
            subsumption_modifier = $ALL_INSTANTIATIONS;
        }
        if (NIL == forts.fort_p(collection)) {
            collection = narts_high.find_nart(collection);
            if (NIL == forts.fort_p(collection)) {
                return NIL;
            }
        }
        {
            SubLObject pcase_var = event_model.event_class(event);
            if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
                if (modifier == $INSTANCE_REMOVED) {
                    return NIL;
                }
                {
                    SubLObject cnf = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event));
                    SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event));
                    SubLObject positive = clauses.pos_lits(cnf);
                    if (NIL != list_utilities.singletonP(positive)) {
                        {
                            SubLObject clause = positive.first();
                            if (NIL != kb_modification_event_test_clause_for_collection_assertion(clause, collection, mt, subsumption_modifier)) {
                                {
                                    SubLObject v_term = cycl_utilities.formula_arg1(clause, UNPROVIDED);
                                    return list($EVENT_TYPE, $CYCL_COLLECTION_EVENT, $EVENT_REASON, $ITEM_ADDED, $COLLECTION_MODIFIED, collection, $ADDED_VALUE, v_term);
                                }
                            }
                        }
                    }
                }
            } else {
                if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                    if (modifier == $INSTANCE_ADDED) {
                        return NIL;
                    }
                    if (NIL != kb_modification_event.kb_modify_remove_assertion_retrieve_gaf(event)) {
                        {
                            SubLObject sentence = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
                            SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event));
                            if (TWO_INTEGER.numE(formula_arity(sentence, UNPROVIDED))) {
                                if (NIL != kb_modification_event_test_clause_for_collection_assertion(sentence, collection, mt, subsumption_modifier)) {
                                    {
                                        SubLObject v_term = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
                                        return list($EVENT_TYPE, $CYCL_COLLECTION_EVENT, $EVENT_REASON, $ITEM_REMOVED, $COLLECTION_MODIFIED, collection, $REMOVED_VALUE, v_term);
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

    public static SubLObject kb_modification_event_test_for_collection_assertions(final SubLObject event, SubLObject collection, SubLObject modifier, SubLObject subsumption_modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $ANY_CHANGE;
        }
        if (subsumption_modifier == UNPROVIDED) {
            subsumption_modifier = $ALL_INSTANTIATIONS;
        }
        if (NIL == forts.fort_p(collection)) {
            collection = narts_high.find_nart(collection);
            if (NIL == forts.fort_p(collection)) {
                return NIL;
            }
        }
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
            if (modifier == $INSTANCE_REMOVED) {
                return NIL;
            }
            final SubLObject cnf = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event));
            final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event));
            final SubLObject positive = clauses.pos_lits(cnf);
            if (NIL != list_utilities.singletonP(positive)) {
                final SubLObject clause = positive.first();
                if (NIL != kb_modification_event_test_clause_for_collection_assertion(clause, collection, mt, subsumption_modifier)) {
                    final SubLObject v_term = cycl_utilities.formula_arg1(clause, UNPROVIDED);
                    return list($EVENT_TYPE, $CYCL_COLLECTION_EVENT, $EVENT_REASON, $ITEM_ADDED, $COLLECTION_MODIFIED, collection, $ADDED_VALUE, v_term);
                }
            }
        } else
            if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                if (modifier == $INSTANCE_ADDED) {
                    return NIL;
                }
                if (NIL != kb_modification_event.kb_modify_remove_assertion_retrieve_gaf(event)) {
                    final SubLObject sentence = encapsulation.unencapsulate_partial(kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event));
                    final SubLObject mt = kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event));
                    if (TWO_INTEGER.numE(formula_arity(sentence, UNPROVIDED)) && (NIL != kb_modification_event_test_clause_for_collection_assertion(sentence, collection, mt, subsumption_modifier))) {
                        final SubLObject v_term2 = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
                        return list($EVENT_TYPE, $CYCL_COLLECTION_EVENT, $EVENT_REASON, $ITEM_REMOVED, $COLLECTION_MODIFIED, collection, $REMOVED_VALUE, v_term2);
                    }
                }
            }

        return NIL;
    }

    public static final SubLObject kb_modification_event_test_clause_for_collection_assertion_alt(SubLObject clause, SubLObject collection, SubLObject mt, SubLObject subsumption_modifier) {
        if (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(clause), $$isa, mt, UNPROVIDED)) {
            {
                SubLObject mentioned_collection = cycl_utilities.formula_arg2(clause, UNPROVIDED);
                if (collection == mentioned_collection) {
                    return T;
                }
                if ($IMMEDIATE_INSTANTIATIONS != subsumption_modifier) {
                    return genls.genlsP(cycl_utilities.formula_arg2(clause, UNPROVIDED), collection, mt, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_modification_event_test_clause_for_collection_assertion(final SubLObject clause, final SubLObject collection, final SubLObject mt, final SubLObject subsumption_modifier) {
        if (NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(clause), $$isa, mt, UNPROVIDED)) {
            final SubLObject mentioned_collection = cycl_utilities.formula_arg2(clause, UNPROVIDED);
            if (collection.eql(mentioned_collection)) {
                return T;
            }
            if ($IMMEDIATE_INSTANTIATIONS != subsumption_modifier) {
                return genls.genlsP(cycl_utilities.formula_arg2(clause, UNPROVIDED), collection, mt, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject kb_modification_event_test_for_microtheory_alt(SubLObject event, SubLObject the_test_mt, SubLObject modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $LOCAL_CHANGE;
        }
        {
            SubLObject test_mt = hlmt_czer.coerce_to_hlmt(the_test_mt);
            SubLObject assertion_mt = NIL;
            SubLObject reason = NIL;
            SubLObject sentence = NIL;
            {
                SubLObject pcase_var = event_model.event_class(event);
                if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
                    assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event)));
                    sentence = clauses.cnf_formula(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event)), UNPROVIDED);
                    reason = $ASSERTION_ADDED;
                } else {
                    if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                        assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event)));
                        sentence = kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event);
                        reason = $ASSERTION_REMOVED;
                    } else {
                        assertion_mt = NIL;
                    }
                }
            }
            if (NIL != hlmt.hlmtP(assertion_mt)) {
                {
                    SubLObject matchesP = NIL;
                    SubLObject pcase_var = modifier;
                    if (pcase_var.eql($LOCAL_CHANGE)) {
                        matchesP = hlmt.hlmt_equalP(test_mt, assertion_mt);
                    } else {
                        if (pcase_var.eql($UPWARD_CLOSURE)) {
                            matchesP = genl_mts.genl_mtP(test_mt, assertion_mt, test_mt, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($DOWNWARD_CLOSURE)) {
                                matchesP = genl_mts.genl_mtP(assertion_mt, test_mt, assertion_mt, UNPROVIDED);
                            }
                        }
                    }
                    if (NIL != matchesP) {
                        return list($EVENT_TYPE, $CYCL_MICROTHEORY_EVENT, $EVENT_REASON, reason, $MICROTHEORY_MODIFIED, assertion_mt, $ASSERTION_SENTENCE, sentence);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_modification_event_test_for_microtheory(final SubLObject event, final SubLObject the_test_mt, SubLObject modifier) {
        if (modifier == UNPROVIDED) {
            modifier = $LOCAL_CHANGE;
        }
        final SubLObject test_mt = hlmt_czer.coerce_to_hlmt(the_test_mt);
        SubLObject assertion_mt = NIL;
        SubLObject reason = NIL;
        SubLObject sentence = NIL;
        final SubLObject pcase_var = event_model.event_class(event);
        if (pcase_var.eql($KB_MODIFY_CREATE_ASSERTION)) {
            assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_mt(event)));
            sentence = clauses.cnf_formula(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_create_assertion_retrieve_cnf(event)), UNPROVIDED);
            reason = $ASSERTION_ADDED;
        } else
            if (pcase_var.eql($KB_MODIFY_REMOVE_ASSERTION)) {
                assertion_mt = hlmt_czer.coerce_to_hlmt(kb_modification_event_support.cash_stable_description(kb_modification_event.kb_modify_remove_assertion_retrieve_mt(event)));
                sentence = kb_modification_event.kb_modify_remove_assertion_retrieve_sentence(event);
                reason = $ASSERTION_REMOVED;
            } else {
                assertion_mt = NIL;
            }

        if (NIL != hlmt.hlmtP(assertion_mt)) {
            SubLObject matchesP = NIL;
            final SubLObject pcase_var2 = modifier;
            if (pcase_var2.eql($LOCAL_CHANGE)) {
                matchesP = hlmt.hlmt_equalP(test_mt, assertion_mt);
            } else
                if (pcase_var2.eql($UPWARD_CLOSURE)) {
                    matchesP = genl_mts.genl_mtP(test_mt, assertion_mt, test_mt, UNPROVIDED);
                } else
                    if (pcase_var2.eql($DOWNWARD_CLOSURE)) {
                        matchesP = genl_mts.genl_mtP(assertion_mt, test_mt, assertion_mt, UNPROVIDED);
                    }


            if (NIL != matchesP) {
                return list($EVENT_TYPE, $CYCL_MICROTHEORY_EVENT, $EVENT_REASON, reason, $MICROTHEORY_MODIFIED, assertion_mt, $ASSERTION_SENTENCE, sentence);
            }
        }
        return NIL;
    }

    public static final SubLObject event_filter_description_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_event_filter_description(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_filter_description_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_event_filter_description(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject event_filter_description_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject event_filter_description_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native.class ? T : NIL;
    }

    public static final SubLObject event_filter_description_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_FILTER_DESCRIPTION_P);
        return v_object.getField2();
    }

    public static SubLObject event_filter_description_id(final SubLObject v_object) {
        assert NIL != event_filter_description_p(v_object) : "! kb_modification_event_filters.event_filter_description_p(v_object) " + "kb_modification_event_filters.event_filter_description_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject event_filter_description_pattern_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_FILTER_DESCRIPTION_P);
        return v_object.getField3();
    }

    public static SubLObject event_filter_description_pattern(final SubLObject v_object) {
        assert NIL != event_filter_description_p(v_object) : "! kb_modification_event_filters.event_filter_description_p(v_object) " + "kb_modification_event_filters.event_filter_description_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_event_filter_description_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_FILTER_DESCRIPTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_filter_description_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_filter_description_p(v_object) : "! kb_modification_event_filters.event_filter_description_p(v_object) " + "kb_modification_event_filters.event_filter_description_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_event_filter_description_pattern_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_FILTER_DESCRIPTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_filter_description_pattern(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_filter_description_p(v_object) : "! kb_modification_event_filters.event_filter_description_p(v_object) " + "kb_modification_event_filters.event_filter_description_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_event_filter_description_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_event_filter_description_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PATTERN)) {
                            _csetf_event_filter_description_pattern(v_new, current_value);
                        } else {
                            Errors.error($str_alt79$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_event_filter_description(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_event_filter_description_id(v_new, current_value);
            } else
                if (pcase_var.eql($PATTERN)) {
                    _csetf_event_filter_description_pattern(v_new, current_value);
                } else {
                    Errors.error($str80$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_filter_description(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVENT_FILTER_DESCRIPTION, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, event_filter_description_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PATTERN, event_filter_description_pattern(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVENT_FILTER_DESCRIPTION, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_filter_description_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_filter_description(obj, visitor_fn);
    }

    public static final SubLObject print_event_filter_description_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_3 = v_object;
                    SubLObject stream_4 = stream;
                    write_string($str_alt80$__, stream_4, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_3), new SubLObject[]{ $STREAM, stream_4 });
                    write_char(CHAR_space, stream_4);
                    write_string($str_alt82$_id__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(event_filter_description_id(v_object), stream);
                    write_string($str_alt83$_pattern__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(event_filter_description_pattern(v_object), stream);
                    write_char(CHAR_space, stream_4);
                    write(pointer(v_object_3), new SubLObject[]{ $STREAM, stream_4, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_4);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_event_filter_description(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str86$_id__, stream, UNPROVIDED, UNPROVIDED);
            prin1(event_filter_description_id(v_object), stream);
            write_string($str87$_pattern__, stream, UNPROVIDED, UNPROVIDED);
            prin1(event_filter_description_pattern(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject new_event_filter_description_alt(SubLObject id, SubLObject pattern) {
        {
            SubLObject efdesc = make_event_filter_description(UNPROVIDED);
            _csetf_event_filter_description_id(efdesc, id);
            _csetf_event_filter_description_pattern(efdesc, pattern);
            return efdesc;
        }
    }

    public static SubLObject new_event_filter_description(final SubLObject id, final SubLObject pattern) {
        final SubLObject efdesc = make_event_filter_description(UNPROVIDED);
        _csetf_event_filter_description_id(efdesc, id);
        _csetf_event_filter_description_pattern(efdesc, pattern);
        return efdesc;
    }

    public static final SubLObject valid_event_filter_description_p_alt(SubLObject entitiy) {
        return makeBoolean((NIL != event_filter_description_p(entitiy)) && event_filter_description_id(entitiy).isPositive());
    }

    public static SubLObject valid_event_filter_description_p(final SubLObject entitiy) {
        return makeBoolean((NIL != event_filter_description_p(entitiy)) && event_filter_description_id(entitiy).isPositive());
    }

    public static final SubLObject clear_event_filter_description_alt(SubLObject efdesc) {
        _csetf_event_filter_description_pattern(efdesc, NIL);
        _csetf_event_filter_description_id(efdesc, MINUS_ONE_INTEGER);
        return NIL;
    }

    public static SubLObject clear_event_filter_description(final SubLObject efdesc) {
        _csetf_event_filter_description_pattern(efdesc, NIL);
        _csetf_event_filter_description_id(efdesc, MINUS_ONE_INTEGER);
        return NIL;
    }

    public static final SubLObject display_current_kb_modification_event_filter_registration_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str_alt89$Current_KB_Modification_Event_Fil, stream);
        terpri(stream);
        {
            SubLObject lock = $event_filter_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary_utilities.print_dictionary_contents($event_filter_registration$.getGlobalValue(), stream);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return T;
    }

    public static SubLObject display_current_kb_modification_event_filter_registration(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str92$Current_KB_Modification_Event_Fil, stream);
        terpri(stream);
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents($event_filter_registration$.getGlobalValue(), stream);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static final SubLObject reset_kb_modification_event_filter_registration_alt() {
        $event_filter_registration$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    public static SubLObject reset_kb_modification_event_filter_registration() {
        $event_filter_registration$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    public static final SubLObject kb_modification_event_filter_id_to_filter_description_alt(SubLObject id) {
        {
            SubLObject efdesc = NIL;
            SubLObject lock = $event_filter_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                efdesc = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), id, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return efdesc;
        }
    }

    public static SubLObject kb_modification_event_filter_id_to_filter_description(final SubLObject id) {
        SubLObject efdesc = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            efdesc = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), id, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return efdesc;
    }

    public static final SubLObject valid_kb_modification_event_filter_id_p_alt(SubLObject id) {
        return makeBoolean((id.isFixnum() && id.isPositive()) && (NIL != event_filter_description_p(kb_modification_event_filter_id_to_filter_description(id))));
    }

    public static SubLObject valid_kb_modification_event_filter_id_p(final SubLObject id) {
        return makeBoolean((id.isFixnum() && id.isPositive()) && (NIL != event_filter_description_p(kb_modification_event_filter_id_to_filter_description(id))));
    }

    public static final SubLObject kb_modification_event_filter_pattern_to_id_alt(SubLObject pattern) {
        {
            SubLObject id = NIL;
            SubLObject lock = $event_filter_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                id = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), pattern, MINUS_ONE_INTEGER);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return id;
        }
    }

    public static SubLObject kb_modification_event_filter_pattern_to_id(final SubLObject pattern) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            id = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), pattern, MINUS_ONE_INTEGER);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static final SubLObject create_kb_modification_event_filter_alt(SubLObject pattern) {
        {
            SubLObject id = NIL;
            SubLObject lock = $event_filter_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                id = kb_modification_event_filter_pattern_to_id(pattern);
                if (id.isNegative()) {
                    id = integer_sequence_generator.integer_sequence_generator_next($event_filter_pattern_id$.getGlobalValue());
                    dictionary.dictionary_enter($event_filter_registration$.getGlobalValue(), pattern, id);
                    dictionary.dictionary_enter($event_filter_registration$.getGlobalValue(), id, new_event_filter_description(id, pattern));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return id;
        }
    }

    public static SubLObject create_kb_modification_event_filter(final SubLObject pattern) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            id = kb_modification_event_filter_pattern_to_id(pattern);
            if (id.isNegative()) {
                id = integer_sequence_generator.integer_sequence_generator_next($event_filter_pattern_id$.getGlobalValue());
                dictionary.dictionary_enter($event_filter_registration$.getGlobalValue(), pattern, id);
                dictionary.dictionary_enter($event_filter_registration$.getGlobalValue(), id, new_event_filter_description(id, pattern));
            }
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static final SubLObject delete_kb_modification_event_filter_alt(SubLObject filter_id) {
        {
            SubLObject lock = $event_filter_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject efdesc = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), filter_id, UNPROVIDED);
                    dictionary.dictionary_remove($event_filter_registration$.getGlobalValue(), event_filter_description_pattern(efdesc));
                    dictionary.dictionary_remove($event_filter_registration$.getGlobalValue(), filter_id);
                    clear_event_filter_description(efdesc);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject delete_kb_modification_event_filter(final SubLObject filter_id) {
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            final SubLObject efdesc = dictionary.dictionary_lookup($event_filter_registration$.getGlobalValue(), filter_id, UNPROVIDED);
            dictionary.dictionary_remove($event_filter_registration$.getGlobalValue(), event_filter_description_pattern(efdesc));
            dictionary.dictionary_remove($event_filter_registration$.getGlobalValue(), filter_id);
            clear_event_filter_description(efdesc);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject get_all_kb_modification_event_filter_ids_alt() {
        {
            SubLObject filter_ids = NIL;
            SubLObject lock = $event_filter_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                filter_ids = list_utilities.remove_if_not(symbol_function(FIXNUMP), dictionary.dictionary_keys($event_filter_registration$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return filter_ids;
        }
    }

    public static SubLObject get_all_kb_modification_event_filter_ids() {
        SubLObject filter_ids = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_registration_lock$.getGlobalValue());
            filter_ids = list_utilities.remove_if_not(symbol_function(FIXNUMP), dictionary.dictionary_keys($event_filter_registration$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_registration_lock$.getGlobalValue());
            }
        }
        return filter_ids;
    }

    public static final SubLObject display_current_kb_modification_event_to_filter_mapping_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str_alt97$Current_KB_Modification_Event_To_, stream);
        terpri(stream);
        {
            SubLObject lock = $kb_modification_event_to_filter_mapping_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary_utilities.print_dictionary_contents($kb_modification_event_to_filter_mapping$.getGlobalValue(), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        princ($str_alt98$Current_KB_Modification_Event_Int, stream);
        terpri(stream);
        {
            SubLObject lock = $kb_modification_event_to_filter_mapping_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary_utilities.print_dictionary_contents($kb_modification_event_internal_listener_table$.getGlobalValue(), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return T;
    }

    public static SubLObject display_current_kb_modification_event_to_filter_mapping(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str100$Current_KB_Modification_Event_To_, stream);
        terpri(stream);
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents($kb_modification_event_to_filter_mapping$.getGlobalValue(), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        princ($str101$Current_KB_Modification_Event_Int, stream);
        terpri(stream);
        release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents($kb_modification_event_internal_listener_table$.getGlobalValue(), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static final SubLObject note_interest_in_kb_modification_event_filter_alt(SubLObject filter) {
        SubLTrampolineFile.checkType(filter, EVENT_FILTER_DESCRIPTION_P);
        {
            SubLObject filter_pattern = event_filter_description_pattern(filter);
            SubLObject events = compute_implied_kb_modification_events_from_filter_expression(filter_pattern);
            SubLObject registration_needed = NIL;
            SubLObject lock = $kb_modification_event_to_filter_mapping_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary.dictionary_enter($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter), events);
                {
                    SubLObject cdolist_list_var = events;
                    SubLObject event = NIL;
                    for (event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event = cdolist_list_var.first()) {
                        if ($NOT_FOUND == dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, $NOT_FOUND)) {
                            registration_needed = cons(event, registration_needed);
                        }
                        dictionary_utilities.dictionary_push($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, filter);
                    }
                }
                {
                    SubLObject cdolist_list_var = registration_needed;
                    SubLObject missing_event = NIL;
                    for (missing_event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , missing_event = cdolist_list_var.first()) {
                        {
                            SubLObject listener = event_broker.describe_funcall_listener(missing_event, KB_MODIFICATION_EVENT_FILTER_GENERIC_EVENT_HANDLER, UNPROVIDED, UNPROVIDED);
                            kb_modification_event.register_listener_with_kb_modifications_event_dispatcher(listener);
                            dictionary.dictionary_enter($kb_modification_event_internal_listener_table$.getGlobalValue(), missing_event, listener);
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL != registration_needed) {
                kb_modification_event.ensure_kb_modifications_event_dispatcher_running();
            }
            return registration_needed;
        }
    }

    public static SubLObject note_interest_in_kb_modification_event_filter(final SubLObject filter) {
        assert NIL != event_filter_description_p(filter) : "! kb_modification_event_filters.event_filter_description_p(filter) " + ("kb_modification_event_filters.event_filter_description_p(filter) " + "CommonSymbols.NIL != kb_modification_event_filters.event_filter_description_p(filter) ") + filter;
        final SubLObject filter_pattern = event_filter_description_pattern(filter);
        final SubLObject events = compute_implied_kb_modification_events_from_filter_expression(filter_pattern);
        SubLObject registration_needed = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            dictionary.dictionary_enter($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter), events);
            SubLObject cdolist_list_var = events;
            SubLObject event = NIL;
            event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($NOT_FOUND == dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, $NOT_FOUND)) {
                    registration_needed = cons(event, registration_needed);
                }
                dictionary_utilities.dictionary_push($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, filter);
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            } 
            cdolist_list_var = registration_needed;
            SubLObject missing_event = NIL;
            missing_event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject listener = event_broker.describe_funcall_listener(missing_event, KB_MODIFICATION_EVENT_FILTER_GENERIC_EVENT_HANDLER, UNPROVIDED, UNPROVIDED);
                kb_modification_event.register_listener_with_kb_modifications_event_dispatcher(listener);
                dictionary.dictionary_enter($kb_modification_event_internal_listener_table$.getGlobalValue(), missing_event, listener);
                cdolist_list_var = cdolist_list_var.rest();
                missing_event = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        if (NIL != registration_needed) {
            kb_modification_event.ensure_kb_modifications_event_dispatcher_running();
        }
        return registration_needed;
    }

    public static final SubLObject note_lack_of_interest_in_kb_modification_filter_alt(SubLObject filter) {
        SubLTrampolineFile.checkType(filter, EVENT_FILTER_DESCRIPTION_P);
        {
            SubLObject deregistration_needed = NIL;
            SubLObject lock = $kb_modification_event_to_filter_mapping_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject events = dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter), UNPROVIDED);
                    dictionary.dictionary_remove($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter));
                    {
                        SubLObject cdolist_list_var = events;
                        SubLObject event = NIL;
                        for (event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event = cdolist_list_var.first()) {
                            dictionary_utilities.dictionary_delete_from_value($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, filter, UNPROVIDED, UNPROVIDED);
                            if (NIL == dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, UNPROVIDED)) {
                                deregistration_needed = cons(event, deregistration_needed);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = deregistration_needed;
                        SubLObject extraneous_event = NIL;
                        for (extraneous_event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , extraneous_event = cdolist_list_var.first()) {
                            {
                                SubLObject listener = dictionary.dictionary_lookup($kb_modification_event_internal_listener_table$.getGlobalValue(), extraneous_event, $NOT_FOUND);
                                dictionary.dictionary_remove($kb_modification_event_internal_listener_table$.getGlobalValue(), extraneous_event);
                                if ($NOT_FOUND != listener) {
                                    kb_modification_event.deregister_listener_with_kb_modifications_event_dispatcher(listener);
                                }
                            }
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return deregistration_needed;
        }
    }

    public static SubLObject note_lack_of_interest_in_kb_modification_filter(final SubLObject filter) {
        assert NIL != event_filter_description_p(filter) : "! kb_modification_event_filters.event_filter_description_p(filter) " + ("kb_modification_event_filters.event_filter_description_p(filter) " + "CommonSymbols.NIL != kb_modification_event_filters.event_filter_description_p(filter) ") + filter;
        SubLObject deregistration_needed = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            final SubLObject events = dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter), UNPROVIDED);
            dictionary.dictionary_remove($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_filter_description_id(filter));
            SubLObject cdolist_list_var = events;
            SubLObject event = NIL;
            event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_delete_from_value($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, filter, UNPROVIDED, UNPROVIDED);
                if (NIL == dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event, UNPROVIDED)) {
                    deregistration_needed = cons(event, deregistration_needed);
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            } 
            cdolist_list_var = deregistration_needed;
            SubLObject extraneous_event = NIL;
            extraneous_event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject listener = dictionary.dictionary_lookup($kb_modification_event_internal_listener_table$.getGlobalValue(), extraneous_event, $NOT_FOUND);
                dictionary.dictionary_remove($kb_modification_event_internal_listener_table$.getGlobalValue(), extraneous_event);
                if ($NOT_FOUND != listener) {
                    kb_modification_event.deregister_listener_with_kb_modifications_event_dispatcher(listener);
                }
                cdolist_list_var = cdolist_list_var.rest();
                extraneous_event = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return deregistration_needed;
    }

    public static final SubLObject get_kb_modification_event_filters_from_mapping_alt(SubLObject event_class) {
        {
            SubLObject filters = NIL;
            SubLObject lock = $kb_modification_event_to_filter_mapping_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                filters = dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_class, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return filters;
        }
    }

    public static SubLObject get_kb_modification_event_filters_from_mapping(final SubLObject event_class) {
        SubLObject filters = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            filters = dictionary.dictionary_lookup($kb_modification_event_to_filter_mapping$.getGlobalValue(), event_class, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($kb_modification_event_to_filter_mapping_lock$.getGlobalValue());
            }
        }
        return filters;
    }

    public static final SubLObject post_kb_modification_event_filter_fired_alt(SubLObject listener, SubLObject filter, SubLObject event, SubLObject information_bundle, SubLObject supports) {
        {
            SubLObject message = list(new SubLObject[]{ $LISTENER, listener, $FILTERS, list(filter), $FIRED, event_model.event_timestamp(event), $DETAILS, information_bundle, $TRIGGER, event_model.event_class(event), $SUPPORTS, supports });
            SubLObject filter_event = event_model.new_event($KB_MODIFICATION_FILTER_FIRED, message, event_model.event_source(event));
            return event_broker.post_event(filter_event, current_external_kb_modification_event_filter_broker());
        }
    }

    public static SubLObject post_kb_modification_event_filter_fired(final SubLObject listener, final SubLObject filter, final SubLObject event, final SubLObject information_bundle, final SubLObject supports) {
        final SubLObject message = list(new SubLObject[]{ $LISTENER, listener, $FILTERS, list(filter), $FIRED, event_model.event_timestamp(event), $DETAILS, information_bundle, $TRIGGER, event_model.event_class(event), $SUPPORTS, supports });
        final SubLObject filter_event = event_model.new_event($KB_MODIFICATION_FILTER_FIRED, message, event_model.event_source(event));
        return event_broker.post_event(filter_event, current_external_kb_modification_event_filter_broker());
    }

    public static final SubLObject kb_modification_filter_fired_retrieve_trigger_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt109$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
            }
        }
        return getf(event_model.event_message(event), $TRIGGER, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_trigger(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $TRIGGER, UNPROVIDED);
    }

    public static final SubLObject kb_modification_filter_fired_retrieve_supports_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt109$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
            }
        }
        return getf(event_model.event_message(event), $SUPPORTS, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_supports(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $SUPPORTS, UNPROVIDED);
    }

    public static final SubLObject kb_modification_filter_fired_retrieve_details_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt109$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
            }
        }
        return getf(event_model.event_message(event), $DETAILS, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_details(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $DETAILS, UNPROVIDED);
    }

    public static final SubLObject kb_modification_filter_fired_retrieve_fired_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt109$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
            }
        }
        return getf(event_model.event_message(event), $FIRED, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_fired(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $FIRED, UNPROVIDED);
    }

    public static final SubLObject kb_modification_filter_fired_retrieve_filters_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt109$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
            }
        }
        return getf(event_model.event_message(event), $FILTERS, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_filters(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $FILTERS, UNPROVIDED);
    }

    public static final SubLObject kb_modification_filter_fired_retrieve_listener_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt109$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
            }
        }
        return getf(event_model.event_message(event), $LISTENER, UNPROVIDED);
    }

    public static SubLObject kb_modification_filter_fired_retrieve_listener(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $KB_MODIFICATION_FILTER_FIRED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str112$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $KB_MODIFICATION_FILTER_FIRED);
        }
        return getf(event_model.event_message(event), $LISTENER, UNPROVIDED);
    }

    /**
     * This event handler is called for all filters; we simply map the event class to the filters
     * interested, then pump the event object past all of the filters.
     */
    @LispMethod(comment = "This event handler is called for all filters; we simply map the event class to the filters\r\ninterested, then pump the event object past all of the filters.\nThis event handler is called for all filters; we simply map the event class to the filters\ninterested, then pump the event object past all of the filters.")
    public static final SubLObject kb_modification_event_filter_generic_event_handler_alt(SubLObject event, SubLObject params) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                {
                    SubLObject cdolist_list_var = get_kb_modification_event_filters_from_mapping(event_model.event_class(event));
                    SubLObject filter = NIL;
                    for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject information_bundle = apply_filter_to_kb_modification_event(event, event_filter_description_pattern(filter));
                            SubLObject supports = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != information_bundle) {
                                {
                                    SubLObject id = event_filter_description_id(filter);
                                    SubLObject listeners = get_all_external_kb_modification_event_filter_listeners_for_filter(id);
                                    SubLObject cdolist_list_var_5 = listeners;
                                    SubLObject listener = NIL;
                                    for (listener = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , listener = cdolist_list_var_5.first()) {
                                        post_kb_modification_event_filter_fired(listener, filter, event, information_bundle, supports);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return event;
        }
    }

    /**
     * This event handler is called for all filters; we simply map the event class to the filters
     * interested, then pump the event object past all of the filters.
     */
    @LispMethod(comment = "This event handler is called for all filters; we simply map the event class to the filters\r\ninterested, then pump the event object past all of the filters.\nThis event handler is called for all filters; we simply map the event class to the filters\ninterested, then pump the event object past all of the filters.")
    public static SubLObject kb_modification_event_filter_generic_event_handler(final SubLObject event, final SubLObject params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            SubLObject cdolist_list_var = get_kb_modification_event_filters_from_mapping(event_model.event_class(event));
            SubLObject filter = NIL;
            filter = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject information_bundle = apply_filter_to_kb_modification_event(event, event_filter_description_pattern(filter));
                final SubLObject supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != information_bundle) {
                    final SubLObject id = event_filter_description_id(filter);
                    SubLObject cdolist_list_var_$3;
                    final SubLObject listeners = cdolist_list_var_$3 = get_all_external_kb_modification_event_filter_listeners_for_filter(id);
                    SubLObject listener = NIL;
                    listener = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        post_kb_modification_event_filter_fired(listener, filter, event, information_bundle, supports);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        listener = cdolist_list_var_$3.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                filter = cdolist_list_var.first();
            } 
        }
        return event;
    }

    public static final SubLObject transmit_kb_modification_event_to_listener_alt(SubLObject listener, SubLObject message, SubLObject timeout) {
        {
            SubLObject method_function = method_func(listener, $transmit_kb_modification_event_to_listener_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, listener, message, timeout);
            }
            return Errors.error($str_alt111$Not_implemented_for_type__A, type_of(listener));
        }
    }

    public static SubLObject transmit_kb_modification_event_to_listener(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        final SubLObject method_function = method_func(listener, $transmit_kb_modification_event_to_listener_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener, message, timeout);
        }
        return Errors.error($str114$Not_implemented_for_type__A, type_of(listener));
    }

    public static final SubLObject current_external_kb_modification_event_filter_broker_alt() {
        return kb_modification_event.current_kb_modification_event_broker();
    }

    public static SubLObject current_external_kb_modification_event_filter_broker() {
        return kb_modification_event.current_kb_modification_event_broker();
    }

    public static final SubLObject event_parameter_name_from_keyword_alt(SubLObject keyword) {
        {
            SubLObject adjusted_pieces = string_utilities.split_string(Strings.string_downcase(symbol_name(keyword), UNPROVIDED, UNPROVIDED), $list_alt115);
            if (NIL != list_utilities.singletonP(adjusted_pieces)) {
                return adjusted_pieces.first();
            }
            {
                SubLObject list_var = NIL;
                SubLObject piece = NIL;
                SubLObject counter = NIL;
                for (list_var = adjusted_pieces, piece = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , piece = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                    if (!counter.isZero()) {
                        Strings.set_char(piece, ZERO_INTEGER, char_upcase(Strings.sublisp_char(piece, ZERO_INTEGER)));
                    }
                }
            }
            return apply(symbol_function(CCONCATENATE), adjusted_pieces);
        }
    }

    public static SubLObject event_parameter_name_from_keyword(final SubLObject keyword) {
        final SubLObject adjusted_pieces = string_utilities.split_string(Strings.string_downcase(symbol_name(keyword), UNPROVIDED, UNPROVIDED), $list118);
        if (NIL != list_utilities.singletonP(adjusted_pieces)) {
            return adjusted_pieces.first();
        }
        SubLObject list_var = NIL;
        SubLObject piece = NIL;
        SubLObject counter = NIL;
        list_var = adjusted_pieces;
        piece = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , piece = list_var.first() , counter = add(ONE_INTEGER, counter)) {
            if (!counter.isZero()) {
                Strings.set_char(piece, ZERO_INTEGER, char_upcase(Strings.sublisp_char(piece, ZERO_INTEGER)));
            }
        }
        return apply(symbol_function(CCONCATENATE), adjusted_pieces);
    }

    public static final SubLObject generate_xml_for_kb_modification_filter_fired_message_alt(SubLObject filters, SubLObject event, SubLObject stream, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    {
                        SubLObject details = kb_modification_filter_fired_retrieve_details(event);
                        xml_utilities.generate_valid_xml_header(stream);
                        xml_utilities.generate_xml_header_entry_for_dtd($$$eventNotifications, $str_alt118$http___www_opencyc_org_xml_eventN, stream);
                        {
                            SubLObject _prev_bind_0_6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$eventNotifications, NIL, NIL);
                                {
                                    SubLObject _prev_bind_0_7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$eventNotification, NIL, NIL);
                                        {
                                            SubLObject _prev_bind_0_9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            SubLObject _prev_bind_1_10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$kbModificationFilteredEvent, NIL, NIL);
                                                {
                                                    SubLObject _prev_bind_0_11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$filterList, NIL, NIL);
                                                        {
                                                            SubLObject cdolist_list_var = filters;
                                                            SubLObject filter = NIL;
                                                            for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_13 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$filterId, NIL, NIL);
                                                                        princ(event_filter_description_id(filter), stream);
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_14, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_13, thread);
                                                                    }
                                                                }
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$filterId);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_12, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_11, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$filterList);
                                                {
                                                    SubLObject attributes = list($$$timestamp, event_model.event_timestamp(event));
                                                    if (details.first().isSymbol()) {
                                                        generate_xml_for_details_of_kb_modification_filter_fired_message(attributes, details);
                                                    } else {
                                                        {
                                                            SubLObject _prev_bind_0_15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$kbEvents, NIL, NIL);
                                                                {
                                                                    SubLObject cdolist_list_var = details;
                                                                    SubLObject detail = NIL;
                                                                    for (detail = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , detail = cdolist_list_var.first()) {
                                                                        generate_xml_for_details_of_kb_modification_filter_fired_message(attributes, detail);
                                                                    }
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_16, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$kbEvents);
                                                    }
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_10, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$kbModificationFilteredEvent);
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_8, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$eventNotification);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_6, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$eventNotifications);
                    }
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return event;
        }
    }

    public static SubLObject generate_xml_for_kb_modification_filter_fired_message(final SubLObject filters, final SubLObject event, final SubLObject stream, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            final SubLObject details = kb_modification_filter_fired_retrieve_details(event);
            xml_utilities.generate_valid_xml_header(stream);
            xml_utilities.generate_xml_header_entry_for_dtd($$$eventNotifications, $str121$http___www_opencyc_org_xml_eventN, stream);
            try {
                final SubLObject _prev_bind_0_$4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$eventNotifications, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$5 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$eventNotification, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$kbModificationFilteredEvent, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                try {
                                                    final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$filterList, NIL, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            SubLObject cdolist_list_var = filters;
                                                            SubLObject filter = NIL;
                                                            filter = cdolist_list_var.first();
                                                            while (NIL != cdolist_list_var) {
                                                                try {
                                                                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$filterId, NIL, NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            princ(event_filter_description_id(filter), stream);
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values = getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$filterId);
                                                                        restoreValuesFromVector(_values);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                                                    }
                                                                }
                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                filter = cdolist_list_var.first();
                                                            } 
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$filterList);
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                }
                                                final SubLObject attributes = list($$$timestamp, event_model.event_timestamp(event));
                                                if (details.first().isSymbol()) {
                                                    generate_xml_for_details_of_kb_modification_filter_fired_message(attributes, details);
                                                } else {
                                                    try {
                                                        final SubLObject _prev_bind_0_$16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$kbEvents, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                SubLObject cdolist_list_var2 = details;
                                                                SubLObject detail = NIL;
                                                                detail = cdolist_list_var2.first();
                                                                while (NIL != cdolist_list_var2) {
                                                                    generate_xml_for_details_of_kb_modification_filter_fired_message(attributes, detail);
                                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                                    detail = cdolist_list_var2.first();
                                                                } 
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$17, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$11, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$16, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values3 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$kbEvents);
                                                            restoreValuesFromVector(_values3);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$kbModificationFilteredEvent);
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$eventNotification);
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$5, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values6 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$eventNotifications);
                    restoreValuesFromVector(_values6);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return event;
    }

    public static final SubLObject generate_xml_for_details_of_kb_modification_filter_fired_message_alt(SubLObject attributes, SubLObject details) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$kbEvent, attributes, NIL);
                    {
                        SubLObject remainder = NIL;
                        for (remainder = details; NIL != remainder; remainder = cddr(remainder)) {
                            {
                                SubLObject keyword = remainder.first();
                                SubLObject value = cadr(remainder);
                                SubLObject tag_name = event_parameter_name_from_keyword(keyword);
                                {
                                    SubLObject _prev_bind_0_17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal(tag_name, NIL, NIL);
                                        if (value.isKeyword()) {
                                            {
                                                SubLObject value_tag_name = event_parameter_name_from_keyword(value);
                                                {
                                                    SubLObject _prev_bind_0_19 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal(value_tag_name, NIL, T);
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_20, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                            }
                                        } else {
                                            generate_xml_for_kb_modification_filter_fired_detail(value);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_18, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal(tag_name);
                            }
                        }
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$kbEvent);
            return T;
        }
    }

    public static SubLObject generate_xml_for_details_of_kb_modification_filter_fired_message(final SubLObject attributes, final SubLObject details) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$kbEvent, attributes, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject remainder;
                    SubLObject keyword;
                    SubLObject value;
                    SubLObject tag_name;
                    SubLObject _prev_bind_0_$28;
                    SubLObject _prev_bind_1_$29;
                    SubLObject _prev_bind_0_$29;
                    SubLObject value_tag_name;
                    SubLObject _prev_bind_0_$30;
                    SubLObject _prev_bind_1_$30;
                    SubLObject _prev_bind_0_$31;
                    SubLObject _prev_bind_0_$32;
                    SubLObject _values;
                    for (remainder = NIL, remainder = details; NIL != remainder; remainder = cddr(remainder)) {
                        keyword = remainder.first();
                        value = cadr(remainder);
                        tag_name = event_parameter_name_from_keyword(keyword);
                        try {
                            _prev_bind_0_$28 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            _prev_bind_1_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal(tag_name, NIL, NIL, NIL, $UNINITIALIZED);
                                _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    if (value.isKeyword()) {
                                        value_tag_name = event_parameter_name_from_keyword(value);
                                        _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal(value_tag_name, NIL, T, NIL, $UNINITIALIZED);
                                            _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                                        }
                                    } else {
                                        generate_xml_for_kb_modification_filter_fired_detail(value);
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$29, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$28, thread);
                            }
                        } finally {
                            _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal(tag_name);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$kbEvent);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return T;
    }

    public static final SubLObject generate_xml_for_kb_modification_filter_fired_detail_alt(SubLObject value) {
        if (NIL != list_utilities.tree_find($HP, value, UNPROVIDED, UNPROVIDED)) {
            cycml.cycml_serialize_encapsulated_el_formula(value);
        } else {
            cycml.cycml_serialize_term(value);
        }
        return value;
    }

    public static SubLObject generate_xml_for_kb_modification_filter_fired_detail(final SubLObject value) {
        if (NIL != list_utilities.tree_find($HP, value, UNPROVIDED, UNPROVIDED)) {
            cycml.cycml_serialize_encapsulated_el_formula(value);
        } else {
            cycml.cycml_serialize_term(value);
        }
        return value;
    }

    public static final SubLObject handle_kb_modification_filter_fired_alt(SubLObject event, SubLObject params) {
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject listener = kb_modification_filter_fired_retrieve_listener(event);
                SubLObject filters = kb_modification_filter_fired_retrieve_filters(event);
                SubLObject result = NIL;
                SubLObject xml_message = NIL;
                SubLObject string_stream = NIL;
                try {
                    string_stream = make_private_string_output_stream();
                    generate_xml_for_kb_modification_filter_fired_message(filters, event, string_stream, UNPROVIDED);
                    xml_message = get_output_stream_string(string_stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            close(string_stream, UNPROVIDED);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                transmit_kb_modification_event_to_listener(listener, xml_message, $kb_modification_external_filter_delivery_timeout$.getGlobalValue());
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    result = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != result) {
                    Errors.warn($str_alt128$KB_Modification_Filter_Fired__cou, new SubLObject[]{ event, listener, result, listener });
                    delete_external_kb_modification_event_filter_listener(external_kb_modification_event_filter_listener_to_id(listener));
                }
            }
        }
        return event;
    }

    public static SubLObject handle_kb_modification_filter_fired(final SubLObject event, final SubLObject params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            final SubLObject listener = kb_modification_filter_fired_retrieve_listener(event);
            final SubLObject filters = kb_modification_filter_fired_retrieve_filters(event);
            SubLObject result = NIL;
            SubLObject xml_message = NIL;
            SubLObject string_stream = NIL;
            try {
                string_stream = make_private_string_output_stream();
                generate_xml_for_kb_modification_filter_fired_message(filters, event, string_stream, UNPROVIDED);
                xml_message = get_output_stream_string(string_stream);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(string_stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        transmit_kb_modification_event_to_listener(listener, xml_message, $kb_modification_external_filter_delivery_timeout$.getGlobalValue());
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                result = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != result) {
                Errors.warn($str132$KB_Modification_Filter_Fired__cou, new SubLObject[]{ event, listener, result, listener });
                delete_external_kb_modification_event_filter_listener(external_kb_modification_event_filter_listener_to_id(listener));
            }
        }
        return event;
    }

    public static final SubLObject display_current_external_kb_modification_event_filter_listener_registration_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str_alt133$Current_External_KB_Modification_, UNPROVIDED);
        terpri(stream);
        {
            SubLObject lock = $event_filter_listener_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary_utilities.print_dictionary_contents($event_filter_listener_registration$.getGlobalValue(), stream);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return T;
    }

    public static SubLObject display_current_external_kb_modification_event_filter_listener_registration(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        terpri(stream);
        princ($str137$Current_External_KB_Modification_, UNPROVIDED);
        terpri(stream);
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            dictionary_utilities.print_dictionary_contents($event_filter_listener_registration$.getGlobalValue(), stream);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static final SubLObject reset_external_kb_modification_event_filter_listener_registration_alt() {
        $event_filter_listener_registration$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    public static SubLObject reset_external_kb_modification_event_filter_listener_registration() {
        $event_filter_listener_registration$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    /**
     * Abstract out the non-changing and unique part of the listener that can be
     * passed to the SXHASH function. The dictionary is EQUALP.
     */
    @LispMethod(comment = "Abstract out the non-changing and unique part of the listener that can be\r\npassed to the SXHASH function. The dictionary is EQUALP.\nAbstract out the non-changing and unique part of the listener that can be\npassed to the SXHASH function. The dictionary is EQUALP.")
    public static final SubLObject compute_key_from_external_event_filter_listener_alt(SubLObject listener) {
        {
            SubLObject method_function = method_func(listener, $compute_key_from_external_event_filter_listener_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, listener);
            }
            return listener;
        }
    }

    /**
     * Abstract out the non-changing and unique part of the listener that can be
     * passed to the SXHASH function. The dictionary is EQUALP.
     */
    @LispMethod(comment = "Abstract out the non-changing and unique part of the listener that can be\r\npassed to the SXHASH function. The dictionary is EQUALP.\nAbstract out the non-changing and unique part of the listener that can be\npassed to the SXHASH function. The dictionary is EQUALP.")
    public static SubLObject compute_key_from_external_event_filter_listener(final SubLObject listener) {
        final SubLObject method_function = method_func(listener, $compute_key_from_external_event_filter_listener_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener);
        }
        return listener;
    }

    /**
     * Verifies that this is a datastructure which describes an external event listener.
     */
    @LispMethod(comment = "Verifies that this is a datastructure which describes an external event listener.")
    public static final SubLObject external_event_filter_listener_p_alt(SubLObject listener) {
        {
            SubLObject method_function = method_func(listener, $external_event_filter_listener_p_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, listener);
            }
            return NIL;
        }
    }

    /**
     * Verifies that this is a datastructure which describes an external event listener.
     */
    @LispMethod(comment = "Verifies that this is a datastructure which describes an external event listener.")
    public static SubLObject external_event_filter_listener_p(final SubLObject listener) {
        final SubLObject method_function = method_func(listener, $external_event_filter_listener_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener);
        }
        return NIL;
    }

    /**
     * Verifies that the listener is still valid (e.g. in use, whatever);
     * used to implement VALID-EXTERNAL-EVENT-FILTER-LISTENER-P.  Called entities
     * can assume that EXTERNAL-EVENT-FILTER-LISTENER-P has returned T.
     */
    @LispMethod(comment = "Verifies that the listener is still valid (e.g. in use, whatever);\r\nused to implement VALID-EXTERNAL-EVENT-FILTER-LISTENER-P.  Called entities\r\ncan assume that EXTERNAL-EVENT-FILTER-LISTENER-P has returned T.\nVerifies that the listener is still valid (e.g. in use, whatever);\nused to implement VALID-EXTERNAL-EVENT-FILTER-LISTENER-P.  Called entities\ncan assume that EXTERNAL-EVENT-FILTER-LISTENER-P has returned T.")
    public static final SubLObject is_external_event_filter_listener_validP_alt(SubLObject listener) {
        {
            SubLObject method_function = method_func(listener, $is_external_event_filter_listener_validP_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, listener);
            }
            return NIL;
        }
    }

    /**
     * Verifies that the listener is still valid (e.g. in use, whatever);
     * used to implement VALID-EXTERNAL-EVENT-FILTER-LISTENER-P.  Called entities
     * can assume that EXTERNAL-EVENT-FILTER-LISTENER-P has returned T.
     */
    @LispMethod(comment = "Verifies that the listener is still valid (e.g. in use, whatever);\r\nused to implement VALID-EXTERNAL-EVENT-FILTER-LISTENER-P.  Called entities\r\ncan assume that EXTERNAL-EVENT-FILTER-LISTENER-P has returned T.\nVerifies that the listener is still valid (e.g. in use, whatever);\nused to implement VALID-EXTERNAL-EVENT-FILTER-LISTENER-P.  Called entities\ncan assume that EXTERNAL-EVENT-FILTER-LISTENER-P has returned T.")
    public static SubLObject is_external_event_filter_listener_validP(final SubLObject listener) {
        final SubLObject method_function = method_func(listener, $is_external_event_filter_listener_validP_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener);
        }
        return NIL;
    }

    /**
     * Tramples whatever datastructure parts need to be trampled to ensure
     * that IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID? returns NIL afterwards.
     */
    @LispMethod(comment = "Tramples whatever datastructure parts need to be trampled to ensure\r\nthat IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID? returns NIL afterwards.\nTramples whatever datastructure parts need to be trampled to ensure\nthat IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID? returns NIL afterwards.")
    public static final SubLObject invalidate_external_event_filter_listener_alt(SubLObject listener) {
        {
            SubLObject method_function = method_func(listener, $invalidate_external_event_filter_listener_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, listener);
            }
            return NIL;
        }
    }

    /**
     * Tramples whatever datastructure parts need to be trampled to ensure
     * that IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID? returns NIL afterwards.
     */
    @LispMethod(comment = "Tramples whatever datastructure parts need to be trampled to ensure\r\nthat IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID? returns NIL afterwards.\nTramples whatever datastructure parts need to be trampled to ensure\nthat IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID? returns NIL afterwards.")
    public static SubLObject invalidate_external_event_filter_listener(final SubLObject listener) {
        final SubLObject method_function = method_func(listener, $invalidate_external_event_filter_listener_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, listener);
        }
        return NIL;
    }

    public static final SubLObject valid_external_event_filter_listener_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != external_event_filter_listener_p(v_object)) && (NIL != is_external_event_filter_listener_validP(v_object)));
    }

    public static SubLObject valid_external_event_filter_listener_p(final SubLObject v_object) {
        return makeBoolean((NIL != external_event_filter_listener_p(v_object)) && (NIL != is_external_event_filter_listener_validP(v_object)));
    }

    public static final SubLObject valid_external_kb_modification_event_filter_listener_id_p_alt(SubLObject id) {
        return makeBoolean((id.isFixnum() && id.isPositive()) && (NIL != external_event_filter_listener_p(external_kb_modification_event_filter_listener_id_to_listener(id))));
    }

    public static SubLObject valid_external_kb_modification_event_filter_listener_id_p(final SubLObject id) {
        return makeBoolean((id.isFixnum() && id.isPositive()) && (NIL != external_event_filter_listener_p(external_kb_modification_event_filter_listener_id_to_listener(id))));
    }

    public static final SubLObject new_external_kb_modification_event_filter_listener_alt(SubLObject listener) {
        {
            SubLObject id = NIL;
            SubLObject lock = $event_filter_listener_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject key = compute_key_from_external_event_filter_listener(listener);
                    id = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), key, MINUS_ONE_INTEGER);
                    if (!id.isNegative()) {
                        delete_external_kb_modification_event_filter_listener(id);
                    }
                    id = integer_sequence_generator.integer_sequence_generator_next($event_filter_listener_id$.getGlobalValue());
                    dictionary.dictionary_enter($event_filter_listener_registration$.getGlobalValue(), key, id);
                    dictionary.dictionary_enter($event_filter_listener_registration$.getGlobalValue(), id, listener);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return id;
        }
    }

    public static SubLObject new_external_kb_modification_event_filter_listener(final SubLObject listener) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            final SubLObject key = compute_key_from_external_event_filter_listener(listener);
            id = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), key, MINUS_ONE_INTEGER);
            if (!id.isNegative()) {
                delete_external_kb_modification_event_filter_listener(id);
            }
            id = integer_sequence_generator.integer_sequence_generator_next($event_filter_listener_id$.getGlobalValue());
            dictionary.dictionary_enter($event_filter_listener_registration$.getGlobalValue(), key, id);
            dictionary.dictionary_enter($event_filter_listener_registration$.getGlobalValue(), id, listener);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static final SubLObject delete_external_kb_modification_event_filter_listener_alt(SubLObject listener_id) {
        {
            SubLObject lock = $event_filter_listener_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject listener = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), listener_id, UNPROVIDED);
                    if (NIL != external_event_filter_listener_p(listener)) {
                        remove_listener_from_all_external_kb_modification_event_filters_internal(listener);
                        {
                            SubLObject key = compute_key_from_external_event_filter_listener(listener);
                            dictionary.dictionary_remove($event_filter_listener_registration$.getGlobalValue(), listener_id);
                            dictionary.dictionary_remove($event_filter_listener_registration$.getGlobalValue(), key);
                            listener = invalidate_external_event_filter_listener(listener);
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject delete_external_kb_modification_event_filter_listener(final SubLObject listener_id) {
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            SubLObject listener = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), listener_id, UNPROVIDED);
            if (NIL != external_event_filter_listener_p(listener)) {
                remove_listener_from_all_external_kb_modification_event_filters_internal(listener);
                final SubLObject key = compute_key_from_external_event_filter_listener(listener);
                dictionary.dictionary_remove($event_filter_listener_registration$.getGlobalValue(), listener_id);
                dictionary.dictionary_remove($event_filter_listener_registration$.getGlobalValue(), key);
                listener = invalidate_external_event_filter_listener(listener);
            }
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject get_all_external_kb_modification_event_filter_listener_ids_alt() {
        {
            SubLObject listeners = NIL;
            SubLObject lock = $event_filter_listener_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                listeners = list_utilities.remove_if_not(symbol_function(FIXNUMP), dictionary.dictionary_keys($event_filter_listener_registration$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return listeners;
        }
    }

    public static SubLObject get_all_external_kb_modification_event_filter_listener_ids() {
        SubLObject listeners = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            listeners = list_utilities.remove_if_not(symbol_function(FIXNUMP), dictionary.dictionary_keys($event_filter_listener_registration$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return listeners;
    }

    public static final SubLObject external_kb_modification_event_filter_listener_id_to_listener_alt(SubLObject id) {
        {
            SubLObject description = NIL;
            SubLObject lock = $event_filter_listener_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                description = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), id, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return description;
        }
    }

    public static SubLObject external_kb_modification_event_filter_listener_id_to_listener(final SubLObject id) {
        SubLObject description = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            description = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), id, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return description;
    }

    public static final SubLObject external_kb_modification_event_filter_listener_to_id_alt(SubLObject listener) {
        {
            SubLObject id = NIL;
            SubLObject lock = $event_filter_listener_registration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                id = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), compute_key_from_external_event_filter_listener(listener), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return id;
        }
    }

    public static SubLObject external_kb_modification_event_filter_listener_to_id(final SubLObject listener) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($event_filter_listener_registration_lock$.getGlobalValue());
            id = dictionary.dictionary_lookup($event_filter_listener_registration$.getGlobalValue(), compute_key_from_external_event_filter_listener(listener), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($event_filter_listener_registration_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static final SubLObject transmit_kb_modification_event_to_listener_socket_info_method_alt(SubLObject listener, SubLObject message, SubLObject timeout) {
        return transmit_kb_modification_event_to_socket_info_listener(listener, message, timeout);
    }

    public static SubLObject transmit_kb_modification_event_to_listener_socket_info_method(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        return transmit_kb_modification_event_to_socket_info_listener(listener, message, timeout);
    }

    public static final SubLObject compute_key_from_external_event_filter_listener_socket_info_method_alt(SubLObject listener) {
        return compute_key_from_external_event_filter_socket_info_listener(listener);
    }

    public static SubLObject compute_key_from_external_event_filter_listener_socket_info_method(final SubLObject listener) {
        return compute_key_from_external_event_filter_socket_info_listener(listener);
    }

    public static final SubLObject external_event_filter_listener_p_socket_info_method_alt(SubLObject listener) {
        return T;
    }

    public static SubLObject external_event_filter_listener_p_socket_info_method(final SubLObject listener) {
        return T;
    }

    public static final SubLObject is_external_event_filter_listener_validP_socket_info_method_alt(SubLObject listener) {
        return is_external_event_socket_info_listener_validP(listener);
    }

    public static SubLObject is_external_event_filter_listener_validP_socket_info_method(final SubLObject listener) {
        return is_external_event_socket_info_listener_validP(listener);
    }

    public static final SubLObject invalidate_external_event_filter_listener_socket_info_method_alt(SubLObject listener) {
        return invalidate_external_socket_info_event_listener(listener);
    }

    public static SubLObject invalidate_external_event_filter_listener_socket_info_method(final SubLObject listener) {
        return invalidate_external_socket_info_event_listener(listener);
    }

    public static final SubLObject compute_key_from_external_event_filter_socket_info_listener_alt(SubLObject listener) {
        return cons(event_broker.socket_info_host(listener), event_broker.socket_info_port(listener));
    }

    public static SubLObject compute_key_from_external_event_filter_socket_info_listener(final SubLObject listener) {
        return cons(event_broker.socket_info_host(listener), event_broker.socket_info_port(listener));
    }

    public static final SubLObject is_external_event_socket_info_listener_validP_alt(SubLObject listener) {
        return makeBoolean(event_broker.socket_info_host(listener).isString() && event_broker.socket_info_port(listener).isFixnum());
    }

    public static SubLObject is_external_event_socket_info_listener_validP(final SubLObject listener) {
        return makeBoolean(event_broker.socket_info_host(listener).isString() && event_broker.socket_info_port(listener).isFixnum());
    }

    public static final SubLObject invalidate_external_socket_info_event_listener_alt(SubLObject listener) {
        event_broker._csetf_socket_info_host(listener, NIL);
        event_broker._csetf_socket_info_port(listener, NIL);
        return listener;
    }

    public static SubLObject invalidate_external_socket_info_event_listener(final SubLObject listener) {
        event_broker._csetf_socket_info_host(listener, NIL);
        event_broker._csetf_socket_info_port(listener, NIL);
        return listener;
    }

    public static final SubLObject transmit_kb_modification_event_to_socket_info_listener_alt(SubLObject socket_info_listener, SubLObject message, SubLObject timeout) {
        {
            SubLObject host = event_broker.socket_info_host(socket_info_listener);
            SubLObject port = event_broker.socket_info_port(socket_info_listener);
            SubLObject xml_message = message;
            SubLObject stream = NIL;
            try {
                stream = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, $PRIVATE);
                if (NIL != stream) {
                    if (NIL != $verbose_transmit_kb_modification_events$.getGlobalValue()) {
                        Errors.warn($str_alt141$_A__About_to_send_to__A__A____A__, new SubLObject[]{ current_process(), host, port, xml_message });
                    }
                    write_string(xml_message, stream, UNPROVIDED, UNPROVIDED);
                    force_output(stream);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != stream) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return socket_info_listener;
    }

    public static SubLObject transmit_kb_modification_event_to_socket_info_listener(final SubLObject socket_info_listener, final SubLObject message, final SubLObject timeout) {
        final SubLObject host = event_broker.socket_info_host(socket_info_listener);
        final SubLObject port = event_broker.socket_info_port(socket_info_listener);
        SubLObject stream = NIL;
        try {
            stream = subl_promotions.open_tcp_stream_with_timeout(host, port, timeout, $PRIVATE);
            if (NIL != validate_tcp_connection(stream, host, port)) {
                if (NIL != $verbose_transmit_kb_modification_events$.getGlobalValue()) {
                    Errors.warn($str145$_A__About_to_send_to__A__A____A__, new SubLObject[]{ current_process(), host, port, message });
                }
                write_string(message, stream, UNPROVIDED, UNPROVIDED);
                force_output(stream);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != stream) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return socket_info_listener;
    }

    /**
     * Convenience method for the not unusual case of a SOCKET-INFO.
     */
    @LispMethod(comment = "Convenience method for the not unusual case of a SOCKET-INFO.")
    public static final SubLObject create_external_kb_modification_event_filter_listener_alt(SubLObject host, SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = NIL;
        }
        SubLTrampolineFile.checkType(host, STRINGP);
        SubLTrampolineFile.checkType(port, PLUSP);
        return new_external_kb_modification_event_filter_listener(event_broker.new_socket_info(host, port, UNPROVIDED));
    }

    /**
     * Convenience method for the not unusual case of a SOCKET-INFO.
     */
    @LispMethod(comment = "Convenience method for the not unusual case of a SOCKET-INFO.")
    public static SubLObject create_external_kb_modification_event_filter_listener(final SubLObject host, final SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = NIL;
        }
        assert NIL != stringp(host) : "! stringp(host) " + ("Types.stringp(host) " + "CommonSymbols.NIL != Types.stringp(host) ") + host;
        assert NIL != plusp(port) : "! Numbers.plusp(port) " + ("Numbers.plusp(port) " + "CommonSymbols.NIL != Numbers.plusp(port) ") + port;
        return new_external_kb_modification_event_filter_listener(event_broker.new_socket_info(host, port, UNPROVIDED));
    }

    public static final SubLObject clear_kb_modification_event_mailboxes_alt() {
        $kb_modification_event_mailbox_suite$.setGlobalValue(message_mailboxes.new_message_mailbox_suite());
        return $CLEARED;
    }

    public static SubLObject clear_kb_modification_event_mailboxes() {
        $kb_modification_event_mailbox_suite$.setGlobalValue(message_mailboxes.new_message_mailbox_suite());
        return $CLEARED;
    }

    public static final SubLObject current_kb_modification_event_mailbox_suite_alt() {
        return $kb_modification_event_mailbox_suite$.getGlobalValue();
    }

    public static SubLObject current_kb_modification_event_mailbox_suite() {
        return $kb_modification_event_mailbox_suite$.getGlobalValue();
    }

    public static final SubLObject with_kb_modification_event_mailbox_suite_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_MESSAGE_MAILBOX_SUITE, $list_alt148, append(body, NIL));
        }
    }

    public static SubLObject with_kb_modification_event_mailbox_suite(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_MESSAGE_MAILBOX_SUITE, $list152, append(body, NIL));
    }

    public static final SubLObject message_mailbox_listener_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_message_mailbox_listener(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject message_mailbox_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_message_mailbox_listener(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject message_mailbox_listener_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kb_modification_event_filters.$message_mailbox_listener_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject message_mailbox_listener_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kb_modification_event_filters.$message_mailbox_listener_native.class ? T : NIL;
    }

    public static final SubLObject mmbox_listener_address_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_MAILBOX_LISTENER_P);
        return v_object.getField2();
    }

    public static SubLObject mmbox_listener_address(final SubLObject v_object) {
        assert NIL != message_mailbox_listener_p(v_object) : "! kb_modification_event_filters.message_mailbox_listener_p(v_object) " + "kb_modification_event_filters.message_mailbox_listener_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_mmbox_listener_address_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MESSAGE_MAILBOX_LISTENER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_mmbox_listener_address(final SubLObject v_object, final SubLObject value) {
        assert NIL != message_mailbox_listener_p(v_object) : "! kb_modification_event_filters.message_mailbox_listener_p(v_object) " + "kb_modification_event_filters.message_mailbox_listener_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_message_mailbox_listener_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.kb_modification_event_filters.$message_mailbox_listener_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ADDRESS)) {
                        _csetf_mmbox_listener_address(v_new, current_value);
                    } else {
                        Errors.error($str_alt79$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_message_mailbox_listener(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.kb_modification_event_filters.$message_mailbox_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ADDRESS)) {
                _csetf_mmbox_listener_address(v_new, current_value);
            } else {
                Errors.error($str80$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_message_mailbox_listener(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MESSAGE_MAILBOX_LISTENER, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ADDRESS, mmbox_listener_address(obj));
        funcall(visitor_fn, obj, $END, MAKE_MESSAGE_MAILBOX_LISTENER, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_message_mailbox_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_message_mailbox_listener(obj, visitor_fn);
    }

    public static final SubLObject print_message_mailbox_listener_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_21 = v_object;
                    SubLObject stream_22 = stream;
                    write_string($str_alt80$__, stream_22, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_21), new SubLObject[]{ $STREAM, stream_22 });
                    write_char(CHAR_space, stream_22);
                    write_string($str_alt160$_address__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(mmbox_listener_address(v_object), stream);
                    write_char(CHAR_space, stream_22);
                    write(pointer(v_object_21), new SubLObject[]{ $STREAM, stream_22, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_22);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_message_mailbox_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str167$_address__, stream, UNPROVIDED, UNPROVIDED);
            prin1(mmbox_listener_address(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject new_message_mailbox_listener_alt(SubLObject mailbox_suite) {
        if (mailbox_suite == UNPROVIDED) {
            mailbox_suite = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mmbox = make_message_mailbox_listener(UNPROVIDED);
                SubLObject address = Guids.guid_to_string(Guids.new_guid());
                _csetf_mmbox_listener_address(mmbox, address);
                if (NIL != message_mailboxes.message_mailbox_suite_p(mailbox_suite)) {
                    {
                        SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                        try {
                            message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                            message_mailboxes.ensure_message_mailbox_allocation(address, mailbox_suite);
                        } finally {
                            message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return mmbox;
            }
        }
    }

    public static SubLObject new_message_mailbox_listener(SubLObject mailbox_suite) {
        if (mailbox_suite == UNPROVIDED) {
            mailbox_suite = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mmbox = make_message_mailbox_listener(UNPROVIDED);
        final SubLObject address = Guids.guid_to_string(Guids.new_guid());
        _csetf_mmbox_listener_address(mmbox, address);
        if (NIL != message_mailboxes.message_mailbox_suite_p(mailbox_suite)) {
            final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
            try {
                message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                message_mailboxes.ensure_message_mailbox_allocation(address, mailbox_suite);
            } finally {
                message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_0, thread);
            }
        }
        return mmbox;
    }

    public static final SubLObject transmit_kb_modification_event_to_listener_message_mailbox_listener_method_alt(SubLObject listener, SubLObject message, SubLObject timeout) {
        return transmit_kb_modification_event_to_message_mailbox_listener(listener, message, timeout);
    }

    public static SubLObject transmit_kb_modification_event_to_listener_message_mailbox_listener_method(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        return transmit_kb_modification_event_to_message_mailbox_listener(listener, message, timeout);
    }

    public static final SubLObject compute_key_from_external_event_filter_listener_message_mailbox_listener_method_alt(SubLObject listener) {
        return compute_key_from_external_event_filter_message_mailbox_listener(listener);
    }

    public static SubLObject compute_key_from_external_event_filter_listener_message_mailbox_listener_method(final SubLObject listener) {
        return compute_key_from_external_event_filter_message_mailbox_listener(listener);
    }

    public static final SubLObject external_event_filter_listener_p_message_mailbox_listener_method_alt(SubLObject listener) {
        return T;
    }

    public static SubLObject external_event_filter_listener_p_message_mailbox_listener_method(final SubLObject listener) {
        return T;
    }

    public static final SubLObject is_external_event_filter_listener_validP_message_mailbox_listener_method_alt(SubLObject listener) {
        return is_external_event_message_mailbox_listener_validP(listener);
    }

    public static SubLObject is_external_event_filter_listener_validP_message_mailbox_listener_method(final SubLObject listener) {
        return is_external_event_message_mailbox_listener_validP(listener);
    }

    public static final SubLObject invalidate_external_event_filter_listener_message_mailbox_listener_method_alt(SubLObject listener) {
        return invalidate_external_message_mailbox_event_listener(listener);
    }

    public static SubLObject invalidate_external_event_filter_listener_message_mailbox_listener_method(final SubLObject listener) {
        return invalidate_external_message_mailbox_event_listener(listener);
    }

    public static final SubLObject compute_key_from_external_event_filter_message_mailbox_listener_alt(SubLObject listener) {
        return mmbox_listener_address(listener);
    }

    public static SubLObject compute_key_from_external_event_filter_message_mailbox_listener(final SubLObject listener) {
        return mmbox_listener_address(listener);
    }

    public static final SubLObject is_external_event_message_mailbox_listener_validP_alt(SubLObject listener) {
        return Guids.guid_string_p(mmbox_listener_address(listener));
    }

    public static SubLObject is_external_event_message_mailbox_listener_validP(final SubLObject listener) {
        return Guids.guid_string_p(mmbox_listener_address(listener));
    }

    public static final SubLObject invalidate_external_message_mailbox_event_listener_alt(SubLObject listener) {
        _csetf_mmbox_listener_address(listener, NIL);
        return listener;
    }

    public static SubLObject invalidate_external_message_mailbox_event_listener(final SubLObject listener) {
        _csetf_mmbox_listener_address(listener, NIL);
        return listener;
    }

    public static final SubLObject transmit_kb_modification_event_to_message_mailbox_listener_alt(SubLObject listener, SubLObject message, SubLObject timeout) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject address = mmbox_listener_address(listener);
                SubLObject errorP = NIL;
                {
                    SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                    SubLObject _prev_bind_1 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                    try {
                        message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                        message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                        if (NIL != message_mailboxes.known_message_mailboxP(address)) {
                            message_mailboxes.store_mail_in_message_mailbox(address, message, UNPROVIDED);
                        } else {
                            errorP = T;
                        }
                    } finally {
                        message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_1, thread);
                        message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != errorP) {
                    Errors.error($str_alt167$The_listener__S_is_no_longer_vali, listener);
                }
                return listener;
            }
        }
    }

    public static SubLObject transmit_kb_modification_event_to_message_mailbox_listener(final SubLObject listener, final SubLObject message, final SubLObject timeout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject address = mmbox_listener_address(listener);
        SubLObject errorP = NIL;
        final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
        final SubLObject _prev_bind_2 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
        try {
            message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
            message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
            if (NIL != message_mailboxes.known_message_mailboxP(address)) {
                message_mailboxes.store_mail_in_message_mailbox(address, message, UNPROVIDED);
            } else {
                errorP = T;
            }
        } finally {
            message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_2, thread);
            message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0, thread);
        }
        if (NIL != errorP) {
            Errors.error($str174$The_listener__S_is_no_longer_vali, listener);
        }
        return listener;
    }

    /**
     * Convenience method for creating new message mailbox based listener.
     */
    @LispMethod(comment = "Convenience method for creating new message mailbox based listener.")
    public static final SubLObject create_external_kb_modification_event_filter_message_mailbox_listener_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject listener = NIL;
                {
                    SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                    try {
                        message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                        listener = new_message_mailbox_listener(current_kb_modification_event_mailbox_suite());
                    } finally {
                        message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_external_kb_modification_event_filter_listener(listener);
            }
        }
    }

    /**
     * Convenience method for creating new message mailbox based listener.
     */
    @LispMethod(comment = "Convenience method for creating new message mailbox based listener.")
    public static SubLObject create_external_kb_modification_event_filter_message_mailbox_listener() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject listener = NIL;
        final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
        try {
            message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
            listener = new_message_mailbox_listener(current_kb_modification_event_mailbox_suite());
        } finally {
            message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_0, thread);
        }
        return new_external_kb_modification_event_filter_listener(listener);
    }

    /**
     * This function is some sense never returns. It simply keeps piping intermediate
     * results up the stream to the Java API for the listener-id.
     * When CLEANUP-ON-EXIT? is T, then we deallocate the mailbox on terminating.
     */
    @LispMethod(comment = "This function is some sense never returns. It simply keeps piping intermediate\r\nresults up the stream to the Java API for the listener-id.\r\nWhen CLEANUP-ON-EXIT? is T, then we deallocate the mailbox on terminating.\nThis function is some sense never returns. It simply keeps piping intermediate\nresults up the stream to the Java API for the listener-id.\nWhen CLEANUP-ON-EXIT? is T, then we deallocate the mailbox on terminating.")
    public static final SubLObject all_external_kb_modification_event_filter_messages_from_mailbox_alt(SubLObject listener_id, SubLObject cleanup_on_exitP) {
        if (cleanup_on_exitP == UNPROVIDED) {
            cleanup_on_exitP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
                if (NIL == valid_external_event_filter_listener_p(listener)) {
                    Errors.error($str_alt170$Not_a_valid_external_event_filter);
                }
                if (NIL == message_mailbox_listener_p(listener)) {
                    Errors.error($str_alt171$Wrong_API_for_type____only_suitab);
                }
                {
                    SubLObject address = mmbox_listener_address(listener);
                    SubLObject event_counter = ZERO_INTEGER;
                    try {
                        while (true) {
                            {
                                SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                                SubLObject _prev_bind_1 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                                try {
                                    message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                                    message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                                    {
                                        SubLObject message = message_mailboxes.retrieve_mail_from_message_mailbox(address);
                                        task_processor.post_task_info_processor_partial_results(list(message));
                                        event_counter = add(event_counter, ONE_INTEGER);
                                    }
                                } finally {
                                    message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_1, thread);
                                    message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } 
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != cleanup_on_exitP) {
                                    {
                                        SubLObject _prev_bind_0_23 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                                        try {
                                            message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                                            message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                                            message_mailboxes.deallocate_message_mailbox(address, UNPROVIDED);
                                        } finally {
                                            message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_1, thread);
                                            message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0_23, thread);
                                        }
                                    }
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * This function is some sense never returns. It simply keeps piping intermediate
     * results up the stream to the Java API for the listener-id.
     * When CLEANUP-ON-EXIT? is T, then we deallocate the mailbox on terminating.
     */
    @LispMethod(comment = "This function is some sense never returns. It simply keeps piping intermediate\r\nresults up the stream to the Java API for the listener-id.\r\nWhen CLEANUP-ON-EXIT? is T, then we deallocate the mailbox on terminating.\nThis function is some sense never returns. It simply keeps piping intermediate\nresults up the stream to the Java API for the listener-id.\nWhen CLEANUP-ON-EXIT? is T, then we deallocate the mailbox on terminating.")
    public static SubLObject all_external_kb_modification_event_filter_messages_from_mailbox(final SubLObject listener_id, SubLObject cleanup_on_exitP) {
        if (cleanup_on_exitP == UNPROVIDED) {
            cleanup_on_exitP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if (NIL == valid_external_event_filter_listener_p(listener)) {
            Errors.error($str177$Not_a_valid_external_event_filter);
        }
        if (NIL == message_mailbox_listener_p(listener)) {
            Errors.error($str178$Wrong_API_for_type____only_suitab);
        }
        final SubLObject address = mmbox_listener_address(listener);
        SubLObject event_counter = ZERO_INTEGER;
        try {
            while (true) {
                final SubLObject _prev_bind_0 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                final SubLObject _prev_bind_2 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                try {
                    message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                    message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                    final SubLObject message = message_mailboxes.retrieve_mail_from_message_mailbox(address);
                    task_processor.post_task_info_processor_partial_results(list(message));
                    event_counter = add(event_counter, ONE_INTEGER);
                } finally {
                    message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_2, thread);
                    message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0, thread);
                }
            } 
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != cleanup_on_exitP) {
                    final SubLObject _prev_bind_0_$35 = message_mailboxes.$message_mailbox_suite$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = message_mailboxes.$message_mailbox_style$.currentBinding(thread);
                    try {
                        message_mailboxes.$message_mailbox_suite$.bind($kb_modification_event_mailbox_suite$.getGlobalValue(), thread);
                        message_mailboxes.$message_mailbox_style$.bind($BLOCKING, thread);
                        message_mailboxes.deallocate_message_mailbox(address, UNPROVIDED);
                    } finally {
                        message_mailboxes.$message_mailbox_style$.rebind(_prev_bind_4, thread);
                        message_mailboxes.$message_mailbox_suite$.rebind(_prev_bind_0_$35, thread);
                    }
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
    }

    public static final SubLObject display_current_external_kb_modification_event_filters_and_listeners_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        princ($str_alt175$Current_External_KB_Modification_, stream);
        display_current_kb_modification_event_to_filter_mapping(stream);
        display_current_kb_modification_event_filter_registration(stream);
        display_current_external_kb_modification_event_filter_listener_registration(stream);
        terpri(stream);
        princ($str_alt176$_Active_Filters__, stream);
        terpri(stream);
        dictionary_utilities.print_dictionary_contents($active_external_kb_modification_event_filters$.getGlobalValue(), stream);
        terpri(stream);
        princ($str_alt177$_Listeners_for_Filters_Map__, stream);
        terpri(stream);
        dictionary_utilities.print_dictionary_contents($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), UNPROVIDED);
        return T;
    }

    public static SubLObject display_current_external_kb_modification_event_filters_and_listeners(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        princ($str182$Current_External_KB_Modification_, stream);
        display_current_kb_modification_event_to_filter_mapping(stream);
        display_current_kb_modification_event_filter_registration(stream);
        display_current_external_kb_modification_event_filter_listener_registration(stream);
        terpri(stream);
        princ($str183$_Active_Filters__, stream);
        terpri(stream);
        dictionary_utilities.print_dictionary_contents($active_external_kb_modification_event_filters$.getGlobalValue(), stream);
        terpri(stream);
        princ($str184$_Listeners_for_Filters_Map__, stream);
        terpri(stream);
        dictionary_utilities.print_dictionary_contents($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), UNPROVIDED);
        return T;
    }

    public static final SubLObject reset_external_kb_modification_event_filters_and_listeners_alt() {
        reset_kb_modification_event_filter_registration();
        reset_external_kb_modification_event_filter_listener_registration();
        $active_external_kb_modification_event_filters$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        $external_kb_modification_event_listeners_for_filters$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    public static SubLObject reset_external_kb_modification_event_filters_and_listeners() {
        reset_kb_modification_event_filter_registration();
        reset_external_kb_modification_event_filter_listener_registration();
        $active_external_kb_modification_event_filters$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        $external_kb_modification_event_listeners_for_filters$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        return T;
    }

    public static final SubLObject add_external_kb_modification_event_filter_listener_alt(SubLObject listener_id, SubLObject filter_id) {
        {
            SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
            SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
            if (!((NIL != valid_event_filter_description_p(filter)) && (NIL != valid_external_event_filter_listener_p(listener)))) {
                return NIL;
            }
            {
                SubLObject lock = $external_kb_modification_event_listeners_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject not_foundP = eq($NOT_FOUND, dictionary.dictionary_lookup($active_external_kb_modification_event_filters$.getGlobalValue(), filter, $NOT_FOUND));
                        dictionary_utilities.dictionary_increment($active_external_kb_modification_event_filters$.getGlobalValue(), filter, UNPROVIDED);
                        dictionary_utilities.dictionary_push($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, listener);
                        dictionary_utilities.dictionary_push($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, filter);
                        if (NIL != not_foundP) {
                            note_interest_in_kb_modification_event_filter(filter);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject add_external_kb_modification_event_filter_listener(final SubLObject listener_id, final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if ((NIL == valid_event_filter_description_p(filter)) || (NIL == valid_external_event_filter_listener_p(listener))) {
            return NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            final SubLObject not_foundP = eq($NOT_FOUND, dictionary.dictionary_lookup($active_external_kb_modification_event_filters$.getGlobalValue(), filter, $NOT_FOUND));
            dictionary_utilities.dictionary_increment($active_external_kb_modification_event_filters$.getGlobalValue(), filter, UNPROVIDED);
            dictionary_utilities.dictionary_push($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, listener);
            dictionary_utilities.dictionary_push($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, filter);
            if (NIL != not_foundP) {
                note_interest_in_kb_modification_event_filter(filter);
            }
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static final SubLObject get_active_external_kb_modification_event_filters_alt() {
        {
            SubLObject filters = NIL;
            SubLObject lock = $external_kb_modification_event_listeners_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                filters = dictionary.dictionary_keys($active_external_kb_modification_event_filters$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return filters;
        }
    }

    public static SubLObject get_active_external_kb_modification_event_filters() {
        SubLObject filters = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            filters = dictionary.dictionary_keys($active_external_kb_modification_event_filters$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return filters;
    }

    public static final SubLObject get_all_external_kb_modification_event_filter_listeners_for_filter_alt(SubLObject filter_id) {
        {
            SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
            SubLObject listeners = NIL;
            if (NIL == valid_event_filter_description_p(filter)) {
                return NIL;
            }
            {
                SubLObject lock = $external_kb_modification_event_listeners_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    listeners = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, UNPROVIDED);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return listeners;
        }
    }

    public static SubLObject get_all_external_kb_modification_event_filter_listeners_for_filter(final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        SubLObject listeners = NIL;
        if (NIL == valid_event_filter_description_p(filter)) {
            return NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            listeners = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return listeners;
    }

    public static final SubLObject get_all_filters_for_external_kb_modification_event_filter_listener_alt(SubLObject listener_id) {
        {
            SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
            SubLObject filters = NIL;
            if (NIL == valid_external_event_filter_listener_p(listener)) {
                return NIL;
            }
            {
                SubLObject lock = $external_kb_modification_event_listeners_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    filters = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, UNPROVIDED);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return filters;
        }
    }

    public static SubLObject get_all_filters_for_external_kb_modification_event_filter_listener(final SubLObject listener_id) {
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        SubLObject filters = NIL;
        if (NIL == valid_external_event_filter_listener_p(listener)) {
            return NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            filters = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return filters;
    }

    public static final SubLObject remove_external_kb_modification_event_filter_listener_alt(SubLObject listener_id, SubLObject filter_id) {
        {
            SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
            SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
            if (!((NIL != valid_event_filter_description_p(filter)) && (NIL != valid_external_event_filter_listener_p(listener)))) {
                return NIL;
            }
            return remove_external_kb_modification_event_filter_listener_internal(listener, filter);
        }
    }

    public static SubLObject remove_external_kb_modification_event_filter_listener(final SubLObject listener_id, final SubLObject filter_id) {
        final SubLObject filter = kb_modification_event_filter_id_to_filter_description(filter_id);
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if ((NIL == valid_event_filter_description_p(filter)) || (NIL == valid_external_event_filter_listener_p(listener))) {
            return NIL;
        }
        return remove_external_kb_modification_event_filter_listener_internal(listener, filter);
    }

    public static final SubLObject remove_external_kb_modification_event_filter_listener_internal_alt(SubLObject listener, SubLObject filter) {
        {
            SubLObject lock = $external_kb_modification_event_listeners_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary_utilities.dictionary_decrement_and_remove_if($active_external_kb_modification_event_filters$.getGlobalValue(), filter, UNPROVIDED, UNPROVIDED);
                dictionary_utilities.dictionary_delete_from_value($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, listener, UNPROVIDED, UNPROVIDED);
                dictionary_utilities.dictionary_delete_from_value($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, filter, UNPROVIDED, UNPROVIDED);
                if ($EMPTY == dictionary.dictionary_lookup($active_external_kb_modification_event_filters$.getGlobalValue(), filter, $EMPTY)) {
                    note_lack_of_interest_in_kb_modification_filter(filter);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return T;
    }

    public static SubLObject remove_external_kb_modification_event_filter_listener_internal(final SubLObject listener, final SubLObject filter) {
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            dictionary_utilities.dictionary_decrement_and_remove_if($active_external_kb_modification_event_filters$.getGlobalValue(), filter, UNPROVIDED, UNPROVIDED);
            dictionary_utilities.dictionary_delete_from_value($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), filter, listener, UNPROVIDED, UNPROVIDED);
            dictionary_utilities.dictionary_delete_from_value($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, filter, UNPROVIDED, UNPROVIDED);
            if ($EMPTY == dictionary.dictionary_lookup($active_external_kb_modification_event_filters$.getGlobalValue(), filter, $EMPTY)) {
                note_lack_of_interest_in_kb_modification_filter(filter);
            }
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static final SubLObject remove_listener_from_all_external_kb_modification_event_filters_alt(SubLObject listener_id) {
        {
            SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
            if (NIL == valid_external_event_filter_listener_p(listener)) {
                return NIL;
            }
            return remove_listener_from_all_external_kb_modification_event_filters_internal(listener);
        }
    }

    public static SubLObject remove_listener_from_all_external_kb_modification_event_filters(final SubLObject listener_id) {
        final SubLObject listener = external_kb_modification_event_filter_listener_id_to_listener(listener_id);
        if (NIL == valid_external_event_filter_listener_p(listener)) {
            return NIL;
        }
        return remove_listener_from_all_external_kb_modification_event_filters_internal(listener);
    }

    public static final SubLObject remove_listener_from_all_external_kb_modification_event_filters_internal_alt(SubLObject listener) {
        {
            SubLObject lock = $external_kb_modification_event_listeners_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject filters = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, UNPROVIDED);
                    SubLObject cdolist_list_var = filters;
                    SubLObject filter = NIL;
                    for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                        remove_external_kb_modification_event_filter_listener_internal(listener, filter);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return T;
    }

    public static SubLObject remove_listener_from_all_external_kb_modification_event_filters_internal(final SubLObject listener) {
        SubLObject release = NIL;
        try {
            release = seize_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            SubLObject cdolist_list_var;
            final SubLObject filters = cdolist_list_var = dictionary.dictionary_lookup($external_kb_modification_event_listeners_for_filters$.getGlobalValue(), listener, UNPROVIDED);
            SubLObject filter = NIL;
            filter = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                remove_external_kb_modification_event_filter_listener_internal(listener, filter);
                cdolist_list_var = cdolist_list_var.rest();
                filter = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($external_kb_modification_event_listeners_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static final SubLObject declare_kb_modification_event_filters_file_alt() {
        declareFunction("register_new_kb_modification_filter", "REGISTER-NEW-KB-MODIFICATION-FILTER", 2, 0, false);
        declareFunction("register_kb_modification_filter_event_equivalents", "REGISTER-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 2, 0, false);
        declareFunction("get_kb_modification_filter_event_equivalents", "GET-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 1, 0, false);
        declareMacro("define_kb_modification_event_filter", "DEFINE-KB-MODIFICATION-EVENT-FILTER");
        declareFunction("map_kb_modification_filter_to_function_spec", "MAP-KB-MODIFICATION-FILTER-TO-FUNCTION-SPEC", 1, 0, false);
        declareMacro("with_matched_kb_modification_event_filters", "WITH-MATCHED-KB-MODIFICATION-EVENT-FILTERS");
        declareFunction("apply_filter_to_kb_modification_event", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT", 2, 0, false);
        declareFunction("apply_filter_to_kb_modification_event_internal", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT-INTERNAL", 2, 0, false);
        declareFunction("symbolic_plist_p", "SYMBOLIC-PLIST-P", 1, 0, false);
        declareFunction("extract_filters_from_kb_modification_filter_expression", "EXTRACT-FILTERS-FROM-KB-MODIFICATION-FILTER-EXPRESSION", 1, 0, false);
        declareFunction("compute_implied_kb_modification_events_from_filter_expression", "COMPUTE-IMPLIED-KB-MODIFICATION-EVENTS-FROM-FILTER-EXPRESSION", 1, 0, false);
        declareFunction("default_kb_modification_event_filter", "DEFAULT-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction("kb_modification_event_fort_filter", "KB-MODIFICATION-EVENT-FORT-FILTER", 3, 0, false);
        declareFunction("kb_modification_event_collection_filter", "KB-MODIFICATION-EVENT-COLLECTION-FILTER", 4, 0, false);
        declareFunction("kb_modification_event_lexicon_fort_filter", "KB-MODIFICATION-EVENT-LEXICON-FORT-FILTER", 3, 0, false);
        declareFunction("kb_modification_event_mt_filter", "KB-MODIFICATION-EVENT-MT-FILTER", 3, 0, false);
        declareFunction("kb_modification_event_mentions_fort", "KB-MODIFICATION-EVENT-MENTIONS-FORT", 2, 1, false);
        declareFunction("kb_modification_event_test_for_collection_assertions", "KB-MODIFICATION-EVENT-TEST-FOR-COLLECTION-ASSERTIONS", 2, 2, false);
        declareFunction("kb_modification_event_test_clause_for_collection_assertion", "KB-MODIFICATION-EVENT-TEST-CLAUSE-FOR-COLLECTION-ASSERTION", 4, 0, false);
        declareFunction("kb_modification_event_test_for_microtheory", "KB-MODIFICATION-EVENT-TEST-FOR-MICROTHEORY", 2, 1, false);
        declareFunction("event_filter_description_print_function_trampoline", "EVENT-FILTER-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("event_filter_description_p", "EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.kb_modification_event_filters.$event_filter_description_p$UnaryFunction();
        declareFunction("event_filter_description_id", "EVENT-FILTER-DESCRIPTION-ID", 1, 0, false);
        declareFunction("event_filter_description_pattern", "EVENT-FILTER-DESCRIPTION-PATTERN", 1, 0, false);
        declareFunction("_csetf_event_filter_description_id", "_CSETF-EVENT-FILTER-DESCRIPTION-ID", 2, 0, false);
        declareFunction("_csetf_event_filter_description_pattern", "_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN", 2, 0, false);
        declareFunction("make_event_filter_description", "MAKE-EVENT-FILTER-DESCRIPTION", 0, 1, false);
        declareFunction("print_event_filter_description", "PRINT-EVENT-FILTER-DESCRIPTION", 3, 0, false);
        declareFunction("new_event_filter_description", "NEW-EVENT-FILTER-DESCRIPTION", 2, 0, false);
        declareFunction("valid_event_filter_description_p", "VALID-EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
        declareFunction("clear_event_filter_description", "CLEAR-EVENT-FILTER-DESCRIPTION", 1, 0, false);
        declareFunction("display_current_kb_modification_event_filter_registration", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 1, false);
        declareFunction("reset_kb_modification_event_filter_registration", "RESET-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 0, false);
        declareFunction("kb_modification_event_filter_id_to_filter_description", "KB-MODIFICATION-EVENT-FILTER-ID-TO-FILTER-DESCRIPTION", 1, 0, false);
        declareFunction("valid_kb_modification_event_filter_id_p", "VALID-KB-MODIFICATION-EVENT-FILTER-ID-P", 1, 0, false);
        declareFunction("kb_modification_event_filter_pattern_to_id", "KB-MODIFICATION-EVENT-FILTER-PATTERN-TO-ID", 1, 0, false);
        declareFunction("create_kb_modification_event_filter", "CREATE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction("delete_kb_modification_event_filter", "DELETE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction("get_all_kb_modification_event_filter_ids", "GET-ALL-KB-MODIFICATION-EVENT-FILTER-IDS", 0, 0, false);
        declareFunction("display_current_kb_modification_event_to_filter_mapping", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-TO-FILTER-MAPPING", 0, 1, false);
        declareFunction("note_interest_in_kb_modification_event_filter", "NOTE-INTEREST-IN-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction("note_lack_of_interest_in_kb_modification_filter", "NOTE-LACK-OF-INTEREST-IN-KB-MODIFICATION-FILTER", 1, 0, false);
        declareFunction("get_kb_modification_event_filters_from_mapping", "GET-KB-MODIFICATION-EVENT-FILTERS-FROM-MAPPING", 1, 0, false);
        declareFunction("post_kb_modification_event_filter_fired", "POST-KB-MODIFICATION-EVENT-FILTER-FIRED", 5, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_trigger", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-TRIGGER", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_supports", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-SUPPORTS", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_details", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-DETAILS", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_fired", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FIRED", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_filters", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FILTERS", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_listener", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-LISTENER", 1, 0, false);
        declareFunction("kb_modification_event_filter_generic_event_handler", "KB-MODIFICATION-EVENT-FILTER-GENERIC-EVENT-HANDLER", 2, 0, false);
        declareFunction("transmit_kb_modification_event_to_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER", 3, 0, false);
        declareFunction("current_external_kb_modification_event_filter_broker", "CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER", 0, 0, false);
        declareFunction("event_parameter_name_from_keyword", "EVENT-PARAMETER-NAME-FROM-KEYWORD", 1, 0, false);
        declareFunction("generate_xml_for_kb_modification_filter_fired_message", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 3, 1, false);
        declareFunction("generate_xml_for_details_of_kb_modification_filter_fired_message", "GENERATE-XML-FOR-DETAILS-OF-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 2, 0, false);
        declareFunction("generate_xml_for_kb_modification_filter_fired_detail", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-DETAIL", 1, 0, false);
        declareFunction("handle_kb_modification_filter_fired", "HANDLE-KB-MODIFICATION-FILTER-FIRED", 2, 0, false);
        declareFunction("display_current_external_kb_modification_event_filter_listener_registration", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 1, false);
        declareFunction("reset_external_kb_modification_event_filter_listener_registration", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 0, false);
        declareFunction("compute_key_from_external_event_filter_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("external_event_filter_listener_p", "EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
        declareFunction("is_external_event_filter_listener_validP", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?", 1, 0, false);
        declareFunction("invalidate_external_event_filter_listener", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("valid_external_event_filter_listener_p", "VALID-EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
        declareFunction("valid_external_kb_modification_event_filter_listener_id_p", "VALID-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-P", 1, 0, false);
        declareFunction("new_external_kb_modification_event_filter_listener", "NEW-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("delete_external_kb_modification_event_filter_listener", "DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("get_all_external_kb_modification_event_filter_listener_ids", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-IDS", 0, 0, false);
        declareFunction("external_kb_modification_event_filter_listener_id_to_listener", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-TO-LISTENER", 1, 0, false);
        declareFunction("external_kb_modification_event_filter_listener_to_id", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-TO-ID", 1, 0, false);
        declareFunction("transmit_kb_modification_event_to_listener_socket_info_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-SOCKET-INFO-METHOD", 3, 0, false);
        declareFunction("compute_key_from_external_event_filter_listener_socket_info_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction("external_event_filter_listener_p_socket_info_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction("is_external_event_filter_listener_validP_socket_info_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction("invalidate_external_event_filter_listener_socket_info_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction("compute_key_from_external_event_filter_socket_info_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-SOCKET-INFO-LISTENER", 1, 0, false);
        declareFunction("is_external_event_socket_info_listener_validP", "IS-EXTERNAL-EVENT-SOCKET-INFO-LISTENER-VALID?", 1, 0, false);
        declareFunction("invalidate_external_socket_info_event_listener", "INVALIDATE-EXTERNAL-SOCKET-INFO-EVENT-LISTENER", 1, 0, false);
        declareFunction("transmit_kb_modification_event_to_socket_info_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-SOCKET-INFO-LISTENER", 3, 0, false);
        declareFunction("create_external_kb_modification_event_filter_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 1, false);
        declareFunction("clear_kb_modification_event_mailboxes", "CLEAR-KB-MODIFICATION-EVENT-MAILBOXES", 0, 0, false);
        declareFunction("current_kb_modification_event_mailbox_suite", "CURRENT-KB-MODIFICATION-EVENT-MAILBOX-SUITE", 0, 0, false);
        declareMacro("with_kb_modification_event_mailbox_suite", "WITH-KB-MODIFICATION-EVENT-MAILBOX-SUITE");
        declareFunction("message_mailbox_listener_print_function_trampoline", "MESSAGE-MAILBOX-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("message_mailbox_listener_p", "MESSAGE-MAILBOX-LISTENER-P", 1, 0, false);
        new com.cyc.cycjava.cycl.kb_modification_event_filters.$message_mailbox_listener_p$UnaryFunction();
        declareFunction("mmbox_listener_address", "MMBOX-LISTENER-ADDRESS", 1, 0, false);
        declareFunction("_csetf_mmbox_listener_address", "_CSETF-MMBOX-LISTENER-ADDRESS", 2, 0, false);
        declareFunction("make_message_mailbox_listener", "MAKE-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
        declareFunction("print_message_mailbox_listener", "PRINT-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
        declareFunction("new_message_mailbox_listener", "NEW-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
        declareFunction("transmit_kb_modification_event_to_listener_message_mailbox_listener_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 3, 0, false);
        declareFunction("compute_key_from_external_event_filter_listener_message_mailbox_listener_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction("external_event_filter_listener_p_message_mailbox_listener_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction("is_external_event_filter_listener_validP_message_mailbox_listener_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction("invalidate_external_event_filter_listener_message_mailbox_listener_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction("compute_key_from_external_event_filter_message_mailbox_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 1, 0, false);
        declareFunction("is_external_event_message_mailbox_listener_validP", "IS-EXTERNAL-EVENT-MESSAGE-MAILBOX-LISTENER-VALID?", 1, 0, false);
        declareFunction("invalidate_external_message_mailbox_event_listener", "INVALIDATE-EXTERNAL-MESSAGE-MAILBOX-EVENT-LISTENER", 1, 0, false);
        declareFunction("transmit_kb_modification_event_to_message_mailbox_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
        declareFunction("create_external_kb_modification_event_filter_message_mailbox_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 0, 0, false);
        declareFunction("all_external_kb_modification_event_filter_messages_from_mailbox", "ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX", 1, 1, false);
        declareFunction("display_current_external_kb_modification_event_filters_and_listeners", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 1, false);
        declareFunction("reset_external_kb_modification_event_filters_and_listeners", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 0, false);
        declareFunction("add_external_kb_modification_event_filter_listener", "ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        declareFunction("get_active_external_kb_modification_event_filters", "GET-ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 0, 0, false);
        declareFunction("get_all_external_kb_modification_event_filter_listeners_for_filter", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENERS-FOR-FILTER", 1, 0, false);
        declareFunction("get_all_filters_for_external_kb_modification_event_filter_listener", "GET-ALL-FILTERS-FOR-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("remove_external_kb_modification_event_filter_listener", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        declareFunction("remove_external_kb_modification_event_filter_listener_internal", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-INTERNAL", 2, 0, false);
        declareFunction("remove_listener_from_all_external_kb_modification_event_filters", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 1, 0, false);
        declareFunction("remove_listener_from_all_external_kb_modification_event_filters_internal", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-INTERNAL", 1, 0, false);
        declareFunction("get_filter_registration_ids", "GET-FILTER-REGISTRATION-IDS", 1, 0, false);
        declareFunction("set_filter_registration_ids", "SET-FILTER-REGISTRATION-IDS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_filter_registration_class", "SUBLOOP-RESERVED-INITIALIZE-FILTER-REGISTRATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_filter_registration_instance", "SUBLOOP-RESERVED-INITIALIZE-FILTER-REGISTRATION-INSTANCE", 1, 0, false);
        declareFunction("filter_registration_p", "FILTER-REGISTRATION-P", 1, 0, false);
        declareFunction("get_listener_registration_ids", "GET-LISTENER-REGISTRATION-IDS", 1, 0, false);
        declareFunction("set_listener_registration_ids", "SET-LISTENER-REGISTRATION-IDS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_listener_registration_class", "SUBLOOP-RESERVED-INITIALIZE-LISTENER-REGISTRATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_listener_registration_instance", "SUBLOOP-RESERVED-INITIALIZE-LISTENER-REGISTRATION-INSTANCE", 1, 0, false);
        declareFunction("listener_registration_p", "LISTENER-REGISTRATION-P", 1, 0, false);
        declareFunction("get_filters_and_listeners_listener_ids", "GET-FILTERS-AND-LISTENERS-LISTENER-IDS", 1, 0, false);
        declareFunction("set_filters_and_listeners_listener_ids", "SET-FILTERS-AND-LISTENERS-LISTENER-IDS", 2, 0, false);
        declareFunction("get_filters_and_listeners_filter_ids", "GET-FILTERS-AND-LISTENERS-FILTER-IDS", 1, 0, false);
        declareFunction("set_filters_and_listeners_filter_ids", "SET-FILTERS-AND-LISTENERS-FILTER-IDS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_filters_and_listeners_class", "SUBLOOP-RESERVED-INITIALIZE-FILTERS-AND-LISTENERS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_filters_and_listeners_instance", "SUBLOOP-RESERVED-INITIALIZE-FILTERS-AND-LISTENERS-INSTANCE", 1, 0, false);
        declareFunction("filters_and_listeners_p", "FILTERS-AND-LISTENERS-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_kb_modification_event_filters_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("register_new_kb_modification_filter", "REGISTER-NEW-KB-MODIFICATION-FILTER", 2, 0, false);
            declareFunction("register_kb_modification_filter_event_equivalents", "REGISTER-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 2, 0, false);
            declareFunction("get_kb_modification_filter_event_equivalents", "GET-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 1, 0, false);
            declareMacro("define_kb_modification_event_filter", "DEFINE-KB-MODIFICATION-EVENT-FILTER");
            declareFunction("map_kb_modification_filter_to_function_spec", "MAP-KB-MODIFICATION-FILTER-TO-FUNCTION-SPEC", 1, 0, false);
            declareMacro("with_matched_kb_modification_event_filters", "WITH-MATCHED-KB-MODIFICATION-EVENT-FILTERS");
            declareFunction("apply_filter_to_kb_modification_event", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT", 2, 0, false);
            declareFunction("apply_filter_to_kb_modification_event_internal", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT-INTERNAL", 2, 0, false);
            declareFunction("symbolic_plist_p", "SYMBOLIC-PLIST-P", 1, 0, false);
            declareFunction("extract_filters_from_kb_modification_filter_expression", "EXTRACT-FILTERS-FROM-KB-MODIFICATION-FILTER-EXPRESSION", 1, 0, false);
            declareFunction("compute_implied_kb_modification_events_from_filter_expression", "COMPUTE-IMPLIED-KB-MODIFICATION-EVENTS-FROM-FILTER-EXPRESSION", 1, 0, false);
            declareFunction("default_kb_modification_event_filter", "DEFAULT-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
            declareFunction("kb_modification_event_fort_filter", "KB-MODIFICATION-EVENT-FORT-FILTER", 3, 0, false);
            declareFunction("kb_modification_event_collection_filter", "KB-MODIFICATION-EVENT-COLLECTION-FILTER", 4, 0, false);
            declareFunction("kb_modification_event_lexicon_fort_filter", "KB-MODIFICATION-EVENT-LEXICON-FORT-FILTER", 3, 0, false);
            declareFunction("kb_modification_event_mt_filter", "KB-MODIFICATION-EVENT-MT-FILTER", 3, 0, false);
            declareFunction("kb_modification_event_mentions_fort", "KB-MODIFICATION-EVENT-MENTIONS-FORT", 2, 1, false);
            declareFunction("kb_modification_event_test_for_collection_assertions", "KB-MODIFICATION-EVENT-TEST-FOR-COLLECTION-ASSERTIONS", 2, 2, false);
            declareFunction("kb_modification_event_test_clause_for_collection_assertion", "KB-MODIFICATION-EVENT-TEST-CLAUSE-FOR-COLLECTION-ASSERTION", 4, 0, false);
            declareFunction("kb_modification_event_test_for_microtheory", "KB-MODIFICATION-EVENT-TEST-FOR-MICROTHEORY", 2, 1, false);
            declareFunction("event_filter_description_print_function_trampoline", "EVENT-FILTER-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("event_filter_description_p", "EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
            new kb_modification_event_filters.$event_filter_description_p$UnaryFunction();
            declareFunction("event_filter_description_id", "EVENT-FILTER-DESCRIPTION-ID", 1, 0, false);
            declareFunction("event_filter_description_pattern", "EVENT-FILTER-DESCRIPTION-PATTERN", 1, 0, false);
            declareFunction("_csetf_event_filter_description_id", "_CSETF-EVENT-FILTER-DESCRIPTION-ID", 2, 0, false);
            declareFunction("_csetf_event_filter_description_pattern", "_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN", 2, 0, false);
            declareFunction("make_event_filter_description", "MAKE-EVENT-FILTER-DESCRIPTION", 0, 1, false);
            declareFunction("visit_defstruct_event_filter_description", "VISIT-DEFSTRUCT-EVENT-FILTER-DESCRIPTION", 2, 0, false);
            declareFunction("visit_defstruct_object_event_filter_description_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-FILTER-DESCRIPTION-METHOD", 2, 0, false);
            declareFunction("print_event_filter_description", "PRINT-EVENT-FILTER-DESCRIPTION", 3, 0, false);
            declareFunction("new_event_filter_description", "NEW-EVENT-FILTER-DESCRIPTION", 2, 0, false);
            declareFunction("valid_event_filter_description_p", "VALID-EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
            declareFunction("clear_event_filter_description", "CLEAR-EVENT-FILTER-DESCRIPTION", 1, 0, false);
            declareFunction("display_current_kb_modification_event_filter_registration", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 1, false);
            declareFunction("reset_kb_modification_event_filter_registration", "RESET-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 0, false);
            declareFunction("kb_modification_event_filter_id_to_filter_description", "KB-MODIFICATION-EVENT-FILTER-ID-TO-FILTER-DESCRIPTION", 1, 0, false);
            declareFunction("valid_kb_modification_event_filter_id_p", "VALID-KB-MODIFICATION-EVENT-FILTER-ID-P", 1, 0, false);
            declareFunction("kb_modification_event_filter_pattern_to_id", "KB-MODIFICATION-EVENT-FILTER-PATTERN-TO-ID", 1, 0, false);
            declareFunction("create_kb_modification_event_filter", "CREATE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
            declareFunction("delete_kb_modification_event_filter", "DELETE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
            declareFunction("get_all_kb_modification_event_filter_ids", "GET-ALL-KB-MODIFICATION-EVENT-FILTER-IDS", 0, 0, false);
            declareFunction("display_current_kb_modification_event_to_filter_mapping", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-TO-FILTER-MAPPING", 0, 1, false);
            declareFunction("note_interest_in_kb_modification_event_filter", "NOTE-INTEREST-IN-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
            declareFunction("note_lack_of_interest_in_kb_modification_filter", "NOTE-LACK-OF-INTEREST-IN-KB-MODIFICATION-FILTER", 1, 0, false);
            declareFunction("get_kb_modification_event_filters_from_mapping", "GET-KB-MODIFICATION-EVENT-FILTERS-FROM-MAPPING", 1, 0, false);
            declareFunction("post_kb_modification_event_filter_fired", "POST-KB-MODIFICATION-EVENT-FILTER-FIRED", 5, 0, false);
            declareFunction("kb_modification_filter_fired_retrieve_trigger", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-TRIGGER", 1, 0, false);
            declareFunction("kb_modification_filter_fired_retrieve_supports", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-SUPPORTS", 1, 0, false);
            declareFunction("kb_modification_filter_fired_retrieve_details", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-DETAILS", 1, 0, false);
            declareFunction("kb_modification_filter_fired_retrieve_fired", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FIRED", 1, 0, false);
            declareFunction("kb_modification_filter_fired_retrieve_filters", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FILTERS", 1, 0, false);
            declareFunction("kb_modification_filter_fired_retrieve_listener", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-LISTENER", 1, 0, false);
            declareFunction("kb_modification_event_filter_generic_event_handler", "KB-MODIFICATION-EVENT-FILTER-GENERIC-EVENT-HANDLER", 2, 0, false);
            declareFunction("transmit_kb_modification_event_to_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER", 3, 0, false);
            declareFunction("current_external_kb_modification_event_filter_broker", "CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER", 0, 0, false);
            declareFunction("event_parameter_name_from_keyword", "EVENT-PARAMETER-NAME-FROM-KEYWORD", 1, 0, false);
            declareFunction("generate_xml_for_kb_modification_filter_fired_message", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 3, 1, false);
            declareFunction("generate_xml_for_details_of_kb_modification_filter_fired_message", "GENERATE-XML-FOR-DETAILS-OF-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 2, 0, false);
            declareFunction("generate_xml_for_kb_modification_filter_fired_detail", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-DETAIL", 1, 0, false);
            declareFunction("handle_kb_modification_filter_fired", "HANDLE-KB-MODIFICATION-FILTER-FIRED", 2, 0, false);
            declareFunction("display_current_external_kb_modification_event_filter_listener_registration", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 1, false);
            declareFunction("reset_external_kb_modification_event_filter_listener_registration", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 0, false);
            declareFunction("compute_key_from_external_event_filter_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
            declareFunction("external_event_filter_listener_p", "EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
            declareFunction("is_external_event_filter_listener_validP", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?", 1, 0, false);
            declareFunction("invalidate_external_event_filter_listener", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
            declareFunction("valid_external_event_filter_listener_p", "VALID-EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
            declareFunction("valid_external_kb_modification_event_filter_listener_id_p", "VALID-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-P", 1, 0, false);
            declareFunction("new_external_kb_modification_event_filter_listener", "NEW-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
            declareFunction("delete_external_kb_modification_event_filter_listener", "DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
            declareFunction("get_all_external_kb_modification_event_filter_listener_ids", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-IDS", 0, 0, false);
            declareFunction("external_kb_modification_event_filter_listener_id_to_listener", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-TO-LISTENER", 1, 0, false);
            declareFunction("external_kb_modification_event_filter_listener_to_id", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-TO-ID", 1, 0, false);
            declareFunction("transmit_kb_modification_event_to_listener_socket_info_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-SOCKET-INFO-METHOD", 3, 0, false);
            declareFunction("compute_key_from_external_event_filter_listener_socket_info_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
            declareFunction("external_event_filter_listener_p_socket_info_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-SOCKET-INFO-METHOD", 1, 0, false);
            declareFunction("is_external_event_filter_listener_validP_socket_info_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD", 1, 0, false);
            declareFunction("invalidate_external_event_filter_listener_socket_info_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
            declareFunction("compute_key_from_external_event_filter_socket_info_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-SOCKET-INFO-LISTENER", 1, 0, false);
            declareFunction("is_external_event_socket_info_listener_validP", "IS-EXTERNAL-EVENT-SOCKET-INFO-LISTENER-VALID?", 1, 0, false);
            declareFunction("invalidate_external_socket_info_event_listener", "INVALIDATE-EXTERNAL-SOCKET-INFO-EVENT-LISTENER", 1, 0, false);
            declareFunction("transmit_kb_modification_event_to_socket_info_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-SOCKET-INFO-LISTENER", 3, 0, false);
            declareFunction("create_external_kb_modification_event_filter_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 1, false);
            declareFunction("clear_kb_modification_event_mailboxes", "CLEAR-KB-MODIFICATION-EVENT-MAILBOXES", 0, 0, false);
            declareFunction("current_kb_modification_event_mailbox_suite", "CURRENT-KB-MODIFICATION-EVENT-MAILBOX-SUITE", 0, 0, false);
            declareMacro("with_kb_modification_event_mailbox_suite", "WITH-KB-MODIFICATION-EVENT-MAILBOX-SUITE");
            declareFunction("message_mailbox_listener_print_function_trampoline", "MESSAGE-MAILBOX-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("message_mailbox_listener_p", "MESSAGE-MAILBOX-LISTENER-P", 1, 0, false);
            new kb_modification_event_filters.$message_mailbox_listener_p$UnaryFunction();
            declareFunction("mmbox_listener_address", "MMBOX-LISTENER-ADDRESS", 1, 0, false);
            declareFunction("_csetf_mmbox_listener_address", "_CSETF-MMBOX-LISTENER-ADDRESS", 2, 0, false);
            declareFunction("make_message_mailbox_listener", "MAKE-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
            declareFunction("visit_defstruct_message_mailbox_listener", "VISIT-DEFSTRUCT-MESSAGE-MAILBOX-LISTENER", 2, 0, false);
            declareFunction("visit_defstruct_object_message_mailbox_listener_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-LISTENER-METHOD", 2, 0, false);
            declareFunction("print_message_mailbox_listener", "PRINT-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
            declareFunction("new_message_mailbox_listener", "NEW-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
            declareFunction("transmit_kb_modification_event_to_listener_message_mailbox_listener_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 3, 0, false);
            declareFunction("compute_key_from_external_event_filter_listener_message_mailbox_listener_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
            declareFunction("external_event_filter_listener_p_message_mailbox_listener_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
            declareFunction("is_external_event_filter_listener_validP_message_mailbox_listener_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
            declareFunction("invalidate_external_event_filter_listener_message_mailbox_listener_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
            declareFunction("compute_key_from_external_event_filter_message_mailbox_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 1, 0, false);
            declareFunction("is_external_event_message_mailbox_listener_validP", "IS-EXTERNAL-EVENT-MESSAGE-MAILBOX-LISTENER-VALID?", 1, 0, false);
            declareFunction("invalidate_external_message_mailbox_event_listener", "INVALIDATE-EXTERNAL-MESSAGE-MAILBOX-EVENT-LISTENER", 1, 0, false);
            declareFunction("transmit_kb_modification_event_to_message_mailbox_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
            declareFunction("create_external_kb_modification_event_filter_message_mailbox_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 0, 0, false);
            declareFunction("all_external_kb_modification_event_filter_messages_from_mailbox", "ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX", 1, 1, false);
            declareFunction("display_current_external_kb_modification_event_filters_and_listeners", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 1, false);
            declareFunction("reset_external_kb_modification_event_filters_and_listeners", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 0, false);
            declareFunction("add_external_kb_modification_event_filter_listener", "ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
            declareFunction("get_active_external_kb_modification_event_filters", "GET-ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 0, 0, false);
            declareFunction("get_all_external_kb_modification_event_filter_listeners_for_filter", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENERS-FOR-FILTER", 1, 0, false);
            declareFunction("get_all_filters_for_external_kb_modification_event_filter_listener", "GET-ALL-FILTERS-FOR-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
            declareFunction("remove_external_kb_modification_event_filter_listener", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
            declareFunction("remove_external_kb_modification_event_filter_listener_internal", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-INTERNAL", 2, 0, false);
            declareFunction("remove_listener_from_all_external_kb_modification_event_filters", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 1, 0, false);
            declareFunction("remove_listener_from_all_external_kb_modification_event_filters_internal", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-INTERNAL", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_filter_registration_ids", "GET-FILTER-REGISTRATION-IDS", 1, 0, false);
            declareFunction("set_filter_registration_ids", "SET-FILTER-REGISTRATION-IDS", 2, 0, false);
            declareFunction("subloop_reserved_initialize_filter_registration_class", "SUBLOOP-RESERVED-INITIALIZE-FILTER-REGISTRATION-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_filter_registration_instance", "SUBLOOP-RESERVED-INITIALIZE-FILTER-REGISTRATION-INSTANCE", 1, 0, false);
            declareFunction("filter_registration_p", "FILTER-REGISTRATION-P", 1, 0, false);
            declareFunction("get_listener_registration_ids", "GET-LISTENER-REGISTRATION-IDS", 1, 0, false);
            declareFunction("set_listener_registration_ids", "SET-LISTENER-REGISTRATION-IDS", 2, 0, false);
            declareFunction("subloop_reserved_initialize_listener_registration_class", "SUBLOOP-RESERVED-INITIALIZE-LISTENER-REGISTRATION-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_listener_registration_instance", "SUBLOOP-RESERVED-INITIALIZE-LISTENER-REGISTRATION-INSTANCE", 1, 0, false);
            declareFunction("listener_registration_p", "LISTENER-REGISTRATION-P", 1, 0, false);
            declareFunction("get_filters_and_listeners_listener_ids", "GET-FILTERS-AND-LISTENERS-LISTENER-IDS", 1, 0, false);
            declareFunction("set_filters_and_listeners_listener_ids", "SET-FILTERS-AND-LISTENERS-LISTENER-IDS", 2, 0, false);
            declareFunction("get_filters_and_listeners_filter_ids", "GET-FILTERS-AND-LISTENERS-FILTER-IDS", 1, 0, false);
            declareFunction("set_filters_and_listeners_filter_ids", "SET-FILTERS-AND-LISTENERS-FILTER-IDS", 2, 0, false);
            declareFunction("subloop_reserved_initialize_filters_and_listeners_class", "SUBLOOP-RESERVED-INITIALIZE-FILTERS-AND-LISTENERS-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_filters_and_listeners_instance", "SUBLOOP-RESERVED-INITIALIZE-FILTERS-AND-LISTENERS-INSTANCE", 1, 0, false);
            declareFunction("filters_and_listeners_p", "FILTERS-AND-LISTENERS-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_kb_modification_event_filters_file_Previous() {
        declareFunction("register_new_kb_modification_filter", "REGISTER-NEW-KB-MODIFICATION-FILTER", 2, 0, false);
        declareFunction("register_kb_modification_filter_event_equivalents", "REGISTER-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 2, 0, false);
        declareFunction("get_kb_modification_filter_event_equivalents", "GET-KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS", 1, 0, false);
        declareMacro("define_kb_modification_event_filter", "DEFINE-KB-MODIFICATION-EVENT-FILTER");
        declareFunction("map_kb_modification_filter_to_function_spec", "MAP-KB-MODIFICATION-FILTER-TO-FUNCTION-SPEC", 1, 0, false);
        declareMacro("with_matched_kb_modification_event_filters", "WITH-MATCHED-KB-MODIFICATION-EVENT-FILTERS");
        declareFunction("apply_filter_to_kb_modification_event", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT", 2, 0, false);
        declareFunction("apply_filter_to_kb_modification_event_internal", "APPLY-FILTER-TO-KB-MODIFICATION-EVENT-INTERNAL", 2, 0, false);
        declareFunction("symbolic_plist_p", "SYMBOLIC-PLIST-P", 1, 0, false);
        declareFunction("extract_filters_from_kb_modification_filter_expression", "EXTRACT-FILTERS-FROM-KB-MODIFICATION-FILTER-EXPRESSION", 1, 0, false);
        declareFunction("compute_implied_kb_modification_events_from_filter_expression", "COMPUTE-IMPLIED-KB-MODIFICATION-EVENTS-FROM-FILTER-EXPRESSION", 1, 0, false);
        declareFunction("default_kb_modification_event_filter", "DEFAULT-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction("kb_modification_event_fort_filter", "KB-MODIFICATION-EVENT-FORT-FILTER", 3, 0, false);
        declareFunction("kb_modification_event_collection_filter", "KB-MODIFICATION-EVENT-COLLECTION-FILTER", 4, 0, false);
        declareFunction("kb_modification_event_lexicon_fort_filter", "KB-MODIFICATION-EVENT-LEXICON-FORT-FILTER", 3, 0, false);
        declareFunction("kb_modification_event_mt_filter", "KB-MODIFICATION-EVENT-MT-FILTER", 3, 0, false);
        declareFunction("kb_modification_event_mentions_fort", "KB-MODIFICATION-EVENT-MENTIONS-FORT", 2, 1, false);
        declareFunction("kb_modification_event_test_for_collection_assertions", "KB-MODIFICATION-EVENT-TEST-FOR-COLLECTION-ASSERTIONS", 2, 2, false);
        declareFunction("kb_modification_event_test_clause_for_collection_assertion", "KB-MODIFICATION-EVENT-TEST-CLAUSE-FOR-COLLECTION-ASSERTION", 4, 0, false);
        declareFunction("kb_modification_event_test_for_microtheory", "KB-MODIFICATION-EVENT-TEST-FOR-MICROTHEORY", 2, 1, false);
        declareFunction("event_filter_description_print_function_trampoline", "EVENT-FILTER-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("event_filter_description_p", "EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
        new kb_modification_event_filters.$event_filter_description_p$UnaryFunction();
        declareFunction("event_filter_description_id", "EVENT-FILTER-DESCRIPTION-ID", 1, 0, false);
        declareFunction("event_filter_description_pattern", "EVENT-FILTER-DESCRIPTION-PATTERN", 1, 0, false);
        declareFunction("_csetf_event_filter_description_id", "_CSETF-EVENT-FILTER-DESCRIPTION-ID", 2, 0, false);
        declareFunction("_csetf_event_filter_description_pattern", "_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN", 2, 0, false);
        declareFunction("make_event_filter_description", "MAKE-EVENT-FILTER-DESCRIPTION", 0, 1, false);
        declareFunction("visit_defstruct_event_filter_description", "VISIT-DEFSTRUCT-EVENT-FILTER-DESCRIPTION", 2, 0, false);
        declareFunction("visit_defstruct_object_event_filter_description_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-FILTER-DESCRIPTION-METHOD", 2, 0, false);
        declareFunction("print_event_filter_description", "PRINT-EVENT-FILTER-DESCRIPTION", 3, 0, false);
        declareFunction("new_event_filter_description", "NEW-EVENT-FILTER-DESCRIPTION", 2, 0, false);
        declareFunction("valid_event_filter_description_p", "VALID-EVENT-FILTER-DESCRIPTION-P", 1, 0, false);
        declareFunction("clear_event_filter_description", "CLEAR-EVENT-FILTER-DESCRIPTION", 1, 0, false);
        declareFunction("display_current_kb_modification_event_filter_registration", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 1, false);
        declareFunction("reset_kb_modification_event_filter_registration", "RESET-KB-MODIFICATION-EVENT-FILTER-REGISTRATION", 0, 0, false);
        declareFunction("kb_modification_event_filter_id_to_filter_description", "KB-MODIFICATION-EVENT-FILTER-ID-TO-FILTER-DESCRIPTION", 1, 0, false);
        declareFunction("valid_kb_modification_event_filter_id_p", "VALID-KB-MODIFICATION-EVENT-FILTER-ID-P", 1, 0, false);
        declareFunction("kb_modification_event_filter_pattern_to_id", "KB-MODIFICATION-EVENT-FILTER-PATTERN-TO-ID", 1, 0, false);
        declareFunction("create_kb_modification_event_filter", "CREATE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction("delete_kb_modification_event_filter", "DELETE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction("get_all_kb_modification_event_filter_ids", "GET-ALL-KB-MODIFICATION-EVENT-FILTER-IDS", 0, 0, false);
        declareFunction("display_current_kb_modification_event_to_filter_mapping", "DISPLAY-CURRENT-KB-MODIFICATION-EVENT-TO-FILTER-MAPPING", 0, 1, false);
        declareFunction("note_interest_in_kb_modification_event_filter", "NOTE-INTEREST-IN-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        declareFunction("note_lack_of_interest_in_kb_modification_filter", "NOTE-LACK-OF-INTEREST-IN-KB-MODIFICATION-FILTER", 1, 0, false);
        declareFunction("get_kb_modification_event_filters_from_mapping", "GET-KB-MODIFICATION-EVENT-FILTERS-FROM-MAPPING", 1, 0, false);
        declareFunction("post_kb_modification_event_filter_fired", "POST-KB-MODIFICATION-EVENT-FILTER-FIRED", 5, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_trigger", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-TRIGGER", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_supports", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-SUPPORTS", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_details", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-DETAILS", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_fired", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FIRED", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_filters", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-FILTERS", 1, 0, false);
        declareFunction("kb_modification_filter_fired_retrieve_listener", "KB-MODIFICATION-FILTER-FIRED-RETRIEVE-LISTENER", 1, 0, false);
        declareFunction("kb_modification_event_filter_generic_event_handler", "KB-MODIFICATION-EVENT-FILTER-GENERIC-EVENT-HANDLER", 2, 0, false);
        declareFunction("transmit_kb_modification_event_to_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER", 3, 0, false);
        declareFunction("current_external_kb_modification_event_filter_broker", "CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER", 0, 0, false);
        declareFunction("event_parameter_name_from_keyword", "EVENT-PARAMETER-NAME-FROM-KEYWORD", 1, 0, false);
        declareFunction("generate_xml_for_kb_modification_filter_fired_message", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 3, 1, false);
        declareFunction("generate_xml_for_details_of_kb_modification_filter_fired_message", "GENERATE-XML-FOR-DETAILS-OF-KB-MODIFICATION-FILTER-FIRED-MESSAGE", 2, 0, false);
        declareFunction("generate_xml_for_kb_modification_filter_fired_detail", "GENERATE-XML-FOR-KB-MODIFICATION-FILTER-FIRED-DETAIL", 1, 0, false);
        declareFunction("handle_kb_modification_filter_fired", "HANDLE-KB-MODIFICATION-FILTER-FIRED", 2, 0, false);
        declareFunction("display_current_external_kb_modification_event_filter_listener_registration", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 1, false);
        declareFunction("reset_external_kb_modification_event_filter_listener_registration", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION", 0, 0, false);
        declareFunction("compute_key_from_external_event_filter_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("external_event_filter_listener_p", "EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
        declareFunction("is_external_event_filter_listener_validP", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?", 1, 0, false);
        declareFunction("invalidate_external_event_filter_listener", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("valid_external_event_filter_listener_p", "VALID-EXTERNAL-EVENT-FILTER-LISTENER-P", 1, 0, false);
        declareFunction("valid_external_kb_modification_event_filter_listener_id_p", "VALID-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-P", 1, 0, false);
        declareFunction("new_external_kb_modification_event_filter_listener", "NEW-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("delete_external_kb_modification_event_filter_listener", "DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("get_all_external_kb_modification_event_filter_listener_ids", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-IDS", 0, 0, false);
        declareFunction("external_kb_modification_event_filter_listener_id_to_listener", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-ID-TO-LISTENER", 1, 0, false);
        declareFunction("external_kb_modification_event_filter_listener_to_id", "EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-TO-ID", 1, 0, false);
        declareFunction("transmit_kb_modification_event_to_listener_socket_info_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-SOCKET-INFO-METHOD", 3, 0, false);
        declareFunction("compute_key_from_external_event_filter_listener_socket_info_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction("external_event_filter_listener_p_socket_info_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction("is_external_event_filter_listener_validP_socket_info_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction("invalidate_external_event_filter_listener_socket_info_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD", 1, 0, false);
        declareFunction("compute_key_from_external_event_filter_socket_info_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-SOCKET-INFO-LISTENER", 1, 0, false);
        declareFunction("is_external_event_socket_info_listener_validP", "IS-EXTERNAL-EVENT-SOCKET-INFO-LISTENER-VALID?", 1, 0, false);
        declareFunction("invalidate_external_socket_info_event_listener", "INVALIDATE-EXTERNAL-SOCKET-INFO-EVENT-LISTENER", 1, 0, false);
        declareFunction("transmit_kb_modification_event_to_socket_info_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-SOCKET-INFO-LISTENER", 3, 0, false);
        declareFunction("create_external_kb_modification_event_filter_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 1, false);
        declareFunction("clear_kb_modification_event_mailboxes", "CLEAR-KB-MODIFICATION-EVENT-MAILBOXES", 0, 0, false);
        declareFunction("current_kb_modification_event_mailbox_suite", "CURRENT-KB-MODIFICATION-EVENT-MAILBOX-SUITE", 0, 0, false);
        declareMacro("with_kb_modification_event_mailbox_suite", "WITH-KB-MODIFICATION-EVENT-MAILBOX-SUITE");
        declareFunction("message_mailbox_listener_print_function_trampoline", "MESSAGE-MAILBOX-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("message_mailbox_listener_p", "MESSAGE-MAILBOX-LISTENER-P", 1, 0, false);
        new kb_modification_event_filters.$message_mailbox_listener_p$UnaryFunction();
        declareFunction("mmbox_listener_address", "MMBOX-LISTENER-ADDRESS", 1, 0, false);
        declareFunction("_csetf_mmbox_listener_address", "_CSETF-MMBOX-LISTENER-ADDRESS", 2, 0, false);
        declareFunction("make_message_mailbox_listener", "MAKE-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
        declareFunction("visit_defstruct_message_mailbox_listener", "VISIT-DEFSTRUCT-MESSAGE-MAILBOX-LISTENER", 2, 0, false);
        declareFunction("visit_defstruct_object_message_mailbox_listener_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-LISTENER-METHOD", 2, 0, false);
        declareFunction("print_message_mailbox_listener", "PRINT-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
        declareFunction("new_message_mailbox_listener", "NEW-MESSAGE-MAILBOX-LISTENER", 0, 1, false);
        declareFunction("transmit_kb_modification_event_to_listener_message_mailbox_listener_method", "TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 3, 0, false);
        declareFunction("compute_key_from_external_event_filter_listener_message_mailbox_listener_method", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction("external_event_filter_listener_p_message_mailbox_listener_method", "EXTERNAL-EVENT-FILTER-LISTENER-P-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction("is_external_event_filter_listener_validP_message_mailbox_listener_method", "IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction("invalidate_external_event_filter_listener_message_mailbox_listener_method", "INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD", 1, 0, false);
        declareFunction("compute_key_from_external_event_filter_message_mailbox_listener", "COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 1, 0, false);
        declareFunction("is_external_event_message_mailbox_listener_validP", "IS-EXTERNAL-EVENT-MESSAGE-MAILBOX-LISTENER-VALID?", 1, 0, false);
        declareFunction("invalidate_external_message_mailbox_event_listener", "INVALIDATE-EXTERNAL-MESSAGE-MAILBOX-EVENT-LISTENER", 1, 0, false);
        declareFunction("transmit_kb_modification_event_to_message_mailbox_listener", "TRANSMIT-KB-MODIFICATION-EVENT-TO-MESSAGE-MAILBOX-LISTENER", 3, 0, false);
        declareFunction("create_external_kb_modification_event_filter_message_mailbox_listener", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 0, 0, false);
        declareFunction("all_external_kb_modification_event_filter_messages_from_mailbox", "ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX", 1, 1, false);
        declareFunction("display_current_external_kb_modification_event_filters_and_listeners", "DISPLAY-CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 1, false);
        declareFunction("reset_external_kb_modification_event_filters_and_listeners", "RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-AND-LISTENERS", 0, 0, false);
        declareFunction("add_external_kb_modification_event_filter_listener", "ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        declareFunction("get_active_external_kb_modification_event_filters", "GET-ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 0, 0, false);
        declareFunction("get_all_external_kb_modification_event_filter_listeners_for_filter", "GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENERS-FOR-FILTER", 1, 0, false);
        declareFunction("get_all_filters_for_external_kb_modification_event_filter_listener", "GET-ALL-FILTERS-FOR-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        declareFunction("remove_external_kb_modification_event_filter_listener", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        declareFunction("remove_external_kb_modification_event_filter_listener_internal", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-INTERNAL", 2, 0, false);
        declareFunction("remove_listener_from_all_external_kb_modification_event_filters", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS", 1, 0, false);
        declareFunction("remove_listener_from_all_external_kb_modification_event_filters_internal", "REMOVE-LISTENER-FROM-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS-INTERNAL", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kb_modification_event_filters_file_alt() {
        deflexical("*KB-MODIFICATION-FILTER-MAP*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*", NIL);
        defconstant("*DTP-EVENT-FILTER-DESCRIPTION*", EVENT_FILTER_DESCRIPTION);
        deflexical("*EVENT-FILTER-REGISTRATION*", NIL != boundp($event_filter_registration$) ? ((SubLObject) ($event_filter_registration$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        deflexical("*EVENT-FILTER-REGISTRATION-LOCK*", NIL != boundp($event_filter_registration_lock$) ? ((SubLObject) ($event_filter_registration_lock$.getGlobalValue())) : make_lock($$$Event_Filter_Registration));
        deflexical("*EVENT-FILTER-PATTERN-ID*", NIL != boundp($event_filter_pattern_id$) ? ((SubLObject) ($event_filter_pattern_id$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED));
        deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*", NIL != boundp($kb_modification_event_to_filter_mapping$) ? ((SubLObject) ($kb_modification_event_to_filter_mapping$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*", NIL != boundp($kb_modification_event_to_filter_mapping_lock$) ? ((SubLObject) ($kb_modification_event_to_filter_mapping_lock$.getGlobalValue())) : make_lock($str_alt95$KB_Modification_Event_to_Filter_M));
        deflexical("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*", NIL != boundp($kb_modification_event_internal_listener_table$) ? ((SubLObject) ($kb_modification_event_internal_listener_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*", NIL != boundp($kb_modification_filter_event_fired_listener$) ? ((SubLObject) ($kb_modification_filter_event_fired_listener$.getGlobalValue())) : event_broker.describe_funcall_listener($KB_MODIFICATION_FILTER_FIRED, HANDLE_KB_MODIFICATION_FILTER_FIRED, UNPROVIDED, UNPROVIDED));
        deflexical("*KB-MODIFICATION-EXTERNAL-FILTER-DELIVERY-TIMEOUT*", TWENTY_INTEGER);
        deflexical("*EVENT-FILTER-LISTENER-REGISTRATION*", NIL != boundp($event_filter_listener_registration$) ? ((SubLObject) ($event_filter_listener_registration$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        deflexical("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*", NIL != boundp($event_filter_listener_registration_lock$) ? ((SubLObject) ($event_filter_listener_registration_lock$.getGlobalValue())) : make_lock($str_alt131$Event_Filter_Listener_Registratio));
        deflexical("*EVENT-FILTER-LISTENER-ID*", NIL != boundp($event_filter_listener_id$) ? ((SubLObject) ($event_filter_listener_id$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED));
        deflexical("*COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*EXTERNAL-EVENT-FILTER-LISTENER-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*VERBOSE-TRANSMIT-KB-MODIFICATION-EVENTS*", NIL);
        deflexical("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*", NIL != boundp($kb_modification_event_mailbox_suite$) ? ((SubLObject) ($kb_modification_event_mailbox_suite$.getGlobalValue())) : message_mailboxes.new_message_mailbox_suite());
        defconstant("*DTP-MESSAGE-MAILBOX-LISTENER*", MESSAGE_MAILBOX_LISTENER);
        deflexical("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*", NIL != boundp($active_external_kb_modification_event_filters$) ? ((SubLObject) ($active_external_kb_modification_event_filters$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*", NIL != boundp($external_kb_modification_event_listeners_for_filters$) ? ((SubLObject) ($external_kb_modification_event_listeners_for_filters$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-LOCK*", make_lock($str_alt174$External_KB_Modification_Event_Li));
        return NIL;
    }

    public static SubLObject init_kb_modification_event_filters_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*KB-MODIFICATION-FILTER-MAP*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            defparameter("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*", NIL);
            defconstant("*DTP-EVENT-FILTER-DESCRIPTION*", EVENT_FILTER_DESCRIPTION);
            deflexical("*EVENT-FILTER-REGISTRATION*", SubLTrampolineFile.maybeDefault($event_filter_registration$, $event_filter_registration$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
            deflexical("*EVENT-FILTER-REGISTRATION-LOCK*", SubLTrampolineFile.maybeDefault($event_filter_registration_lock$, $event_filter_registration_lock$, () -> make_lock($$$Event_Filter_Registration)));
            deflexical("*EVENT-FILTER-PATTERN-ID*", SubLTrampolineFile.maybeDefault($event_filter_pattern_id$, $event_filter_pattern_id$, () -> integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED)));
            deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*", SubLTrampolineFile.maybeDefault($kb_modification_event_to_filter_mapping$, $kb_modification_event_to_filter_mapping$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*", SubLTrampolineFile.maybeDefault($kb_modification_event_to_filter_mapping_lock$, $kb_modification_event_to_filter_mapping_lock$, () -> make_lock($str98$KB_Modification_Event_to_Filter_M)));
            deflexical("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*", SubLTrampolineFile.maybeDefault($kb_modification_event_internal_listener_table$, $kb_modification_event_internal_listener_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
            deflexical("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*", SubLTrampolineFile.maybeDefault($kb_modification_filter_event_fired_listener$, $kb_modification_filter_event_fired_listener$, () -> event_broker.describe_funcall_listener($KB_MODIFICATION_FILTER_FIRED, HANDLE_KB_MODIFICATION_FILTER_FIRED, UNPROVIDED, UNPROVIDED)));
            deflexical("*KB-MODIFICATION-EXTERNAL-FILTER-DELIVERY-TIMEOUT*", TWENTY_INTEGER);
            deflexical("*EVENT-FILTER-LISTENER-REGISTRATION*", SubLTrampolineFile.maybeDefault($event_filter_listener_registration$, $event_filter_listener_registration$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
            deflexical("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*", SubLTrampolineFile.maybeDefault($event_filter_listener_registration_lock$, $event_filter_listener_registration_lock$, () -> make_lock($str135$Event_Filter_Listener_Registratio)));
            deflexical("*EVENT-FILTER-LISTENER-ID*", SubLTrampolineFile.maybeDefault($event_filter_listener_id$, $event_filter_listener_id$, () -> integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED)));
            deflexical("*COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
            deflexical("*EXTERNAL-EVENT-FILTER-LISTENER-P-METHOD-TABLE*", make_vector($int$256, NIL));
            deflexical("*IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-METHOD-TABLE*", make_vector($int$256, NIL));
            deflexical("*INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
            deflexical("*VERBOSE-TRANSMIT-KB-MODIFICATION-EVENTS*", NIL);
            deflexical("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*", SubLTrampolineFile.maybeDefault($kb_modification_event_mailbox_suite$, $kb_modification_event_mailbox_suite$, () -> message_mailboxes.new_message_mailbox_suite()));
            defconstant("*DTP-MESSAGE-MAILBOX-LISTENER*", MESSAGE_MAILBOX_LISTENER);
            deflexical("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*", SubLTrampolineFile.maybeDefault($active_external_kb_modification_event_filters$, $active_external_kb_modification_event_filters$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
            deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*", SubLTrampolineFile.maybeDefault($external_kb_modification_event_listeners_for_filters$, $external_kb_modification_event_listeners_for_filters$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
            deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-LOCK*", make_lock($str181$External_KB_Modification_Event_Li));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*EVENT-FILTER-REGISTRATION*", NIL != boundp($event_filter_registration$) ? ((SubLObject) ($event_filter_registration$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
            deflexical("*EVENT-FILTER-REGISTRATION-LOCK*", NIL != boundp($event_filter_registration_lock$) ? ((SubLObject) ($event_filter_registration_lock$.getGlobalValue())) : make_lock($$$Event_Filter_Registration));
            deflexical("*EVENT-FILTER-PATTERN-ID*", NIL != boundp($event_filter_pattern_id$) ? ((SubLObject) ($event_filter_pattern_id$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED));
            deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*", NIL != boundp($kb_modification_event_to_filter_mapping$) ? ((SubLObject) ($kb_modification_event_to_filter_mapping$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*", NIL != boundp($kb_modification_event_to_filter_mapping_lock$) ? ((SubLObject) ($kb_modification_event_to_filter_mapping_lock$.getGlobalValue())) : make_lock($str_alt95$KB_Modification_Event_to_Filter_M));
            deflexical("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*", NIL != boundp($kb_modification_event_internal_listener_table$) ? ((SubLObject) ($kb_modification_event_internal_listener_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*", NIL != boundp($kb_modification_filter_event_fired_listener$) ? ((SubLObject) ($kb_modification_filter_event_fired_listener$.getGlobalValue())) : event_broker.describe_funcall_listener($KB_MODIFICATION_FILTER_FIRED, HANDLE_KB_MODIFICATION_FILTER_FIRED, UNPROVIDED, UNPROVIDED));
            deflexical("*EVENT-FILTER-LISTENER-REGISTRATION*", NIL != boundp($event_filter_listener_registration$) ? ((SubLObject) ($event_filter_listener_registration$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
            deflexical("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*", NIL != boundp($event_filter_listener_registration_lock$) ? ((SubLObject) ($event_filter_listener_registration_lock$.getGlobalValue())) : make_lock($str_alt131$Event_Filter_Listener_Registratio));
            deflexical("*EVENT-FILTER-LISTENER-ID*", NIL != boundp($event_filter_listener_id$) ? ((SubLObject) ($event_filter_listener_id$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED));
            deflexical("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*", NIL != boundp($kb_modification_event_mailbox_suite$) ? ((SubLObject) ($kb_modification_event_mailbox_suite$.getGlobalValue())) : message_mailboxes.new_message_mailbox_suite());
            deflexical("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*", NIL != boundp($active_external_kb_modification_event_filters$) ? ((SubLObject) ($active_external_kb_modification_event_filters$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
            deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*", NIL != boundp($external_kb_modification_event_listeners_for_filters$) ? ((SubLObject) ($external_kb_modification_event_listeners_for_filters$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
            deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-LOCK*", make_lock($str_alt174$External_KB_Modification_Event_Li));
        }
        return NIL;
    }

    public static SubLObject init_kb_modification_event_filters_file_Previous() {
        deflexical("*KB-MODIFICATION-FILTER-MAP*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*KB-MODIFICATION-FILTER-EVENT-EQUIVALENTS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*", NIL);
        defconstant("*DTP-EVENT-FILTER-DESCRIPTION*", EVENT_FILTER_DESCRIPTION);
        deflexical("*EVENT-FILTER-REGISTRATION*", SubLTrampolineFile.maybeDefault($event_filter_registration$, $event_filter_registration$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*EVENT-FILTER-REGISTRATION-LOCK*", SubLTrampolineFile.maybeDefault($event_filter_registration_lock$, $event_filter_registration_lock$, () -> make_lock($$$Event_Filter_Registration)));
        deflexical("*EVENT-FILTER-PATTERN-ID*", SubLTrampolineFile.maybeDefault($event_filter_pattern_id$, $event_filter_pattern_id$, () -> integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED)));
        deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING*", SubLTrampolineFile.maybeDefault($kb_modification_event_to_filter_mapping$, $kb_modification_event_to_filter_mapping$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*KB-MODIFICATION-EVENT-TO-FILTER-MAPPING-LOCK*", SubLTrampolineFile.maybeDefault($kb_modification_event_to_filter_mapping_lock$, $kb_modification_event_to_filter_mapping_lock$, () -> make_lock($str98$KB_Modification_Event_to_Filter_M)));
        deflexical("*KB-MODIFICATION-EVENT-INTERNAL-LISTENER-TABLE*", SubLTrampolineFile.maybeDefault($kb_modification_event_internal_listener_table$, $kb_modification_event_internal_listener_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*KB-MODIFICATION-FILTER-EVENT-FIRED-LISTENER*", SubLTrampolineFile.maybeDefault($kb_modification_filter_event_fired_listener$, $kb_modification_filter_event_fired_listener$, () -> event_broker.describe_funcall_listener($KB_MODIFICATION_FILTER_FIRED, HANDLE_KB_MODIFICATION_FILTER_FIRED, UNPROVIDED, UNPROVIDED)));
        deflexical("*KB-MODIFICATION-EXTERNAL-FILTER-DELIVERY-TIMEOUT*", TWENTY_INTEGER);
        deflexical("*EVENT-FILTER-LISTENER-REGISTRATION*", SubLTrampolineFile.maybeDefault($event_filter_listener_registration$, $event_filter_listener_registration$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*EVENT-FILTER-LISTENER-REGISTRATION-LOCK*", SubLTrampolineFile.maybeDefault($event_filter_listener_registration_lock$, $event_filter_listener_registration_lock$, () -> make_lock($str135$Event_Filter_Listener_Registratio)));
        deflexical("*EVENT-FILTER-LISTENER-ID*", SubLTrampolineFile.maybeDefault($event_filter_listener_id$, $event_filter_listener_id$, () -> integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED)));
        deflexical("*COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*EXTERNAL-EVENT-FILTER-LISTENER-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*VERBOSE-TRANSMIT-KB-MODIFICATION-EVENTS*", NIL);
        deflexical("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*", SubLTrampolineFile.maybeDefault($kb_modification_event_mailbox_suite$, $kb_modification_event_mailbox_suite$, () -> message_mailboxes.new_message_mailbox_suite()));
        defconstant("*DTP-MESSAGE-MAILBOX-LISTENER*", MESSAGE_MAILBOX_LISTENER);
        deflexical("*ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS*", SubLTrampolineFile.maybeDefault($active_external_kb_modification_event_filters$, $active_external_kb_modification_event_filters$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-FOR-FILTERS*", SubLTrampolineFile.maybeDefault($external_kb_modification_event_listeners_for_filters$, $external_kb_modification_event_listeners_for_filters$, () -> dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*EXTERNAL-KB-MODIFICATION-EVENT-LISTENERS-LOCK*", make_lock($str181$External_KB_Modification_Event_Li));
        return NIL;
    }

    public static final SubLObject setup_kb_modification_event_filters_file_alt() {
        register_new_kb_modification_filter($DEFAULT_KB_MODIFICATION_EVENT_FILTER, DEFAULT_KB_MODIFICATION_EVENT_FILTER);
        register_kb_modification_filter_event_equivalents($DEFAULT_KB_MODIFICATION_EVENT_FILTER, $list_alt21);
        register_new_kb_modification_filter($CYCL_FORT_FILTER, KB_MODIFICATION_EVENT_FORT_FILTER);
        register_kb_modification_filter_event_equivalents($CYCL_FORT_FILTER, $list_alt25);
        register_new_kb_modification_filter($COLLECTION_FILTER, KB_MODIFICATION_EVENT_COLLECTION_FILTER);
        register_kb_modification_filter_event_equivalents($COLLECTION_FILTER, $list_alt28);
        register_new_kb_modification_filter($LEXICON_FORT_FILTER, KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER);
        register_kb_modification_filter_event_equivalents($LEXICON_FORT_FILTER, $list_alt25);
        register_new_kb_modification_filter($MT_FILTER, KB_MODIFICATION_EVENT_MT_FILTER);
        register_kb_modification_filter_event_equivalents($MT_FILTER, $list_alt28);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_filter_description$.getGlobalValue(), symbol_function(EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EVENT_FILTER_DESCRIPTION_ID, _CSETF_EVENT_FILTER_DESCRIPTION_ID);
        def_csetf(EVENT_FILTER_DESCRIPTION_PATTERN, _CSETF_EVENT_FILTER_DESCRIPTION_PATTERN);
        identity(EVENT_FILTER_DESCRIPTION);
        declare_defglobal($event_filter_registration$);
        declare_defglobal($event_filter_registration_lock$);
        declare_defglobal($event_filter_pattern_id$);
        register_external_symbol(CREATE_KB_MODIFICATION_EVENT_FILTER);
        register_external_symbol(DELETE_KB_MODIFICATION_EVENT_FILTER);
        declare_defglobal($kb_modification_event_to_filter_mapping$);
        declare_defglobal($kb_modification_event_to_filter_mapping_lock$);
        declare_defglobal($kb_modification_event_internal_listener_table$);
        event_model.register_event_class($KB_MODIFICATION_FILTER_FIRED, $KB_STORE_EVENT, NIL);
        declare_defglobal($kb_modification_filter_event_fired_listener$);
        kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($kb_modification_filter_event_fired_listener$.getGlobalValue());
        declare_defglobal($event_filter_listener_registration$);
        declare_defglobal($event_filter_listener_registration_lock$);
        declare_defglobal($event_filter_listener_id$);
        register_external_symbol(DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD));
        register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym136$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO));
        register_method($external_event_filter_listener_p_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD));
        register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym138$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD));
        register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD));
        register_external_symbol(CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        declare_defglobal($kb_modification_event_mailbox_suite$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(MMBOX_LISTENER_ADDRESS, _CSETF_MMBOX_LISTENER_ADDRESS);
        identity(MESSAGE_MAILBOX_LISTENER);
        register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym162$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN));
        register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym163$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L));
        register_method($external_event_filter_listener_p_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD));
        register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym165$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER));
        register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym166$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE));
        register_external_symbol($sym168$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST);
        register_external_symbol(ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX);
        declare_defglobal($active_external_kb_modification_event_filters$);
        declare_defglobal($external_kb_modification_event_listeners_for_filters$);
        register_external_symbol(ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        register_external_symbol(REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        sunit_external.define_test_category($$$KB_Modification_Event_Filters, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(FILTER_REGISTRATION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(FILTER_REGISTRATION);
        classes.subloop_new_class(FILTER_REGISTRATION, TEST_CASE, NIL, NIL, $list_alt184);
        classes.class_set_implements_slot_listeners(FILTER_REGISTRATION, NIL);
        classes.subloop_note_class_initialization_function(FILTER_REGISTRATION, SUBLOOP_RESERVED_INITIALIZE_FILTER_REGISTRATION_CLASS);
        classes.subloop_note_instance_initialization_function(FILTER_REGISTRATION, SUBLOOP_RESERVED_INITIALIZE_FILTER_REGISTRATION_INSTANCE);
        subloop_reserved_initialize_filter_registration_class(FILTER_REGISTRATION);
        sunit_macros.define_test_case_postamble(FILTER_REGISTRATION, $str_alt200$kb_modification_event_filters, $$$cycl, list($$$KB_Modification_Event_Filters));
        sunit_macros.def_test_method_register(FILTER_REGISTRATION, TEST_FILTERS);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(LISTENER_REGISTRATION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(LISTENER_REGISTRATION);
        classes.subloop_new_class(LISTENER_REGISTRATION, TEST_CASE, NIL, NIL, $list_alt204);
        classes.class_set_implements_slot_listeners(LISTENER_REGISTRATION, NIL);
        classes.subloop_note_class_initialization_function(LISTENER_REGISTRATION, SUBLOOP_RESERVED_INITIALIZE_LISTENER_REGISTRATION_CLASS);
        classes.subloop_note_instance_initialization_function(LISTENER_REGISTRATION, SUBLOOP_RESERVED_INITIALIZE_LISTENER_REGISTRATION_INSTANCE);
        subloop_reserved_initialize_listener_registration_class(LISTENER_REGISTRATION);
        sunit_macros.define_test_case_postamble(LISTENER_REGISTRATION, $str_alt200$kb_modification_event_filters, $$$cycl, list($$$KB_Modification_Event_Filters));
        sunit_macros.def_test_method_register(LISTENER_REGISTRATION, TEST_LISTENERS);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(FILTERS_AND_LISTENERS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(FILTERS_AND_LISTENERS);
        classes.subloop_new_class(FILTERS_AND_LISTENERS, TEST_CASE, NIL, NIL, $list_alt209);
        classes.class_set_implements_slot_listeners(FILTERS_AND_LISTENERS, NIL);
        classes.subloop_note_class_initialization_function(FILTERS_AND_LISTENERS, SUBLOOP_RESERVED_INITIALIZE_FILTERS_AND_LISTENERS_CLASS);
        classes.subloop_note_instance_initialization_function(FILTERS_AND_LISTENERS, SUBLOOP_RESERVED_INITIALIZE_FILTERS_AND_LISTENERS_INSTANCE);
        subloop_reserved_initialize_filters_and_listeners_class(FILTERS_AND_LISTENERS);
        sunit_macros.define_test_case_postamble(FILTERS_AND_LISTENERS, $str_alt200$kb_modification_event_filters, $$$cycl, list($$$KB_Modification_Event_Filters));
        sunit_macros.def_test_method_register(FILTERS_AND_LISTENERS, TEST_FILTERS_AND_LISTENERS);
        sunit_external.define_test_suite($str_alt215$KB_Modification_Event_Filters_Tes, list($$$KB_Modification_Event_Filters), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject setup_kb_modification_event_filters_file() {
        if (SubLFiles.USE_V1) {
            register_new_kb_modification_filter($DEFAULT_KB_MODIFICATION_EVENT_FILTER, DEFAULT_KB_MODIFICATION_EVENT_FILTER);
            register_kb_modification_filter_event_equivalents($DEFAULT_KB_MODIFICATION_EVENT_FILTER, $list21);
            register_new_kb_modification_filter($CYCL_FORT_FILTER, KB_MODIFICATION_EVENT_FORT_FILTER);
            register_kb_modification_filter_event_equivalents($CYCL_FORT_FILTER, $list25);
            register_new_kb_modification_filter($COLLECTION_FILTER, KB_MODIFICATION_EVENT_COLLECTION_FILTER);
            register_kb_modification_filter_event_equivalents($COLLECTION_FILTER, $list28);
            register_new_kb_modification_filter($LEXICON_FORT_FILTER, KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER);
            register_kb_modification_filter_event_equivalents($LEXICON_FORT_FILTER, $list25);
            register_new_kb_modification_filter($MT_FILTER, KB_MODIFICATION_EVENT_MT_FILTER);
            register_kb_modification_filter_event_equivalents($MT_FILTER, $list28);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_event_filter_description$.getGlobalValue(), symbol_function(EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list73);
            def_csetf(EVENT_FILTER_DESCRIPTION_ID, _CSETF_EVENT_FILTER_DESCRIPTION_ID);
            def_csetf(EVENT_FILTER_DESCRIPTION_PATTERN, _CSETF_EVENT_FILTER_DESCRIPTION_PATTERN);
            identity(EVENT_FILTER_DESCRIPTION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_filter_description$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_FILTER_DESCRIPTION_METHOD));
            declare_defglobal($event_filter_registration$);
            declare_defglobal($event_filter_registration_lock$);
            declare_defglobal($event_filter_pattern_id$);
            register_external_symbol(CREATE_KB_MODIFICATION_EVENT_FILTER);
            register_external_symbol(DELETE_KB_MODIFICATION_EVENT_FILTER);
            declare_defglobal($kb_modification_event_to_filter_mapping$);
            declare_defglobal($kb_modification_event_to_filter_mapping_lock$);
            declare_defglobal($kb_modification_event_internal_listener_table$);
            event_model.register_event_class($KB_MODIFICATION_FILTER_FIRED, $KB_STORE_EVENT, NIL);
            declare_defglobal($kb_modification_filter_event_fired_listener$);
            kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($kb_modification_filter_event_fired_listener$.getGlobalValue());
            declare_defglobal($event_filter_listener_registration$);
            declare_defglobal($event_filter_listener_registration_lock$);
            declare_defglobal($event_filter_listener_id$);
            register_external_symbol(DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
            register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD));
            register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym140$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO));
            register_method($external_event_filter_listener_p_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD));
            register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym142$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD));
            register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD));
            register_external_symbol(CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
            declare_defglobal($kb_modification_event_mailbox_suite$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list161);
            def_csetf(MMBOX_LISTENER_ADDRESS, _CSETF_MMBOX_LISTENER_ADDRESS);
            identity(MESSAGE_MAILBOX_LISTENER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_LISTENER_METHOD));
            register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym169$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN));
            register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym170$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L));
            register_method($external_event_filter_listener_p_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD));
            register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym172$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER));
            register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym173$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE));
            register_external_symbol($sym175$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST);
            register_external_symbol(ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX);
            declare_defglobal($active_external_kb_modification_event_filters$);
            declare_defglobal($external_kb_modification_event_listeners_for_filters$);
            register_external_symbol(ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
            register_external_symbol(REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
            sunit_external.define_test_category($$$KB_Modification_Event_Filters, UNPROVIDED);
            sunit_external.define_test_suite($str189$KB_Modification_Event_Filters_Tes, list($$$KB_Modification_Event_Filters), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym136$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO));
            register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym138$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD));
            register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym162$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN));
            register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym163$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L));
            register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym165$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER));
            register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym166$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE));
            register_external_symbol($sym168$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(FILTER_REGISTRATION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(FILTER_REGISTRATION);
            classes.subloop_new_class(FILTER_REGISTRATION, TEST_CASE, NIL, NIL, $list_alt184);
            classes.class_set_implements_slot_listeners(FILTER_REGISTRATION, NIL);
            classes.subloop_note_class_initialization_function(FILTER_REGISTRATION, SUBLOOP_RESERVED_INITIALIZE_FILTER_REGISTRATION_CLASS);
            classes.subloop_note_instance_initialization_function(FILTER_REGISTRATION, SUBLOOP_RESERVED_INITIALIZE_FILTER_REGISTRATION_INSTANCE);
            subloop_reserved_initialize_filter_registration_class(FILTER_REGISTRATION);
            sunit_macros.define_test_case_postamble(FILTER_REGISTRATION, $str_alt200$kb_modification_event_filters, $$$cycl, list($$$KB_Modification_Event_Filters));
            sunit_macros.def_test_method_register(FILTER_REGISTRATION, TEST_FILTERS);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(LISTENER_REGISTRATION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(LISTENER_REGISTRATION);
            classes.subloop_new_class(LISTENER_REGISTRATION, TEST_CASE, NIL, NIL, $list_alt204);
            classes.class_set_implements_slot_listeners(LISTENER_REGISTRATION, NIL);
            classes.subloop_note_class_initialization_function(LISTENER_REGISTRATION, SUBLOOP_RESERVED_INITIALIZE_LISTENER_REGISTRATION_CLASS);
            classes.subloop_note_instance_initialization_function(LISTENER_REGISTRATION, SUBLOOP_RESERVED_INITIALIZE_LISTENER_REGISTRATION_INSTANCE);
            subloop_reserved_initialize_listener_registration_class(LISTENER_REGISTRATION);
            sunit_macros.define_test_case_postamble(LISTENER_REGISTRATION, $str_alt200$kb_modification_event_filters, $$$cycl, list($$$KB_Modification_Event_Filters));
            sunit_macros.def_test_method_register(LISTENER_REGISTRATION, TEST_LISTENERS);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(FILTERS_AND_LISTENERS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(FILTERS_AND_LISTENERS);
            classes.subloop_new_class(FILTERS_AND_LISTENERS, TEST_CASE, NIL, NIL, $list_alt209);
            classes.class_set_implements_slot_listeners(FILTERS_AND_LISTENERS, NIL);
            classes.subloop_note_class_initialization_function(FILTERS_AND_LISTENERS, SUBLOOP_RESERVED_INITIALIZE_FILTERS_AND_LISTENERS_CLASS);
            classes.subloop_note_instance_initialization_function(FILTERS_AND_LISTENERS, SUBLOOP_RESERVED_INITIALIZE_FILTERS_AND_LISTENERS_INSTANCE);
            subloop_reserved_initialize_filters_and_listeners_class(FILTERS_AND_LISTENERS);
            sunit_macros.define_test_case_postamble(FILTERS_AND_LISTENERS, $str_alt200$kb_modification_event_filters, $$$cycl, list($$$KB_Modification_Event_Filters));
            sunit_macros.def_test_method_register(FILTERS_AND_LISTENERS, TEST_FILTERS_AND_LISTENERS);
            sunit_external.define_test_suite($str_alt215$KB_Modification_Event_Filters_Tes, list($$$KB_Modification_Event_Filters), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject setup_kb_modification_event_filters_file_Previous() {
        register_new_kb_modification_filter($DEFAULT_KB_MODIFICATION_EVENT_FILTER, DEFAULT_KB_MODIFICATION_EVENT_FILTER);
        register_kb_modification_filter_event_equivalents($DEFAULT_KB_MODIFICATION_EVENT_FILTER, $list21);
        register_new_kb_modification_filter($CYCL_FORT_FILTER, KB_MODIFICATION_EVENT_FORT_FILTER);
        register_kb_modification_filter_event_equivalents($CYCL_FORT_FILTER, $list25);
        register_new_kb_modification_filter($COLLECTION_FILTER, KB_MODIFICATION_EVENT_COLLECTION_FILTER);
        register_kb_modification_filter_event_equivalents($COLLECTION_FILTER, $list28);
        register_new_kb_modification_filter($LEXICON_FORT_FILTER, KB_MODIFICATION_EVENT_LEXICON_FORT_FILTER);
        register_kb_modification_filter_event_equivalents($LEXICON_FORT_FILTER, $list25);
        register_new_kb_modification_filter($MT_FILTER, KB_MODIFICATION_EVENT_MT_FILTER);
        register_kb_modification_filter_event_equivalents($MT_FILTER, $list28);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_filter_description$.getGlobalValue(), symbol_function(EVENT_FILTER_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list73);
        def_csetf(EVENT_FILTER_DESCRIPTION_ID, _CSETF_EVENT_FILTER_DESCRIPTION_ID);
        def_csetf(EVENT_FILTER_DESCRIPTION_PATTERN, _CSETF_EVENT_FILTER_DESCRIPTION_PATTERN);
        identity(EVENT_FILTER_DESCRIPTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_filter_description$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_FILTER_DESCRIPTION_METHOD));
        declare_defglobal($event_filter_registration$);
        declare_defglobal($event_filter_registration_lock$);
        declare_defglobal($event_filter_pattern_id$);
        register_external_symbol(CREATE_KB_MODIFICATION_EVENT_FILTER);
        register_external_symbol(DELETE_KB_MODIFICATION_EVENT_FILTER);
        declare_defglobal($kb_modification_event_to_filter_mapping$);
        declare_defglobal($kb_modification_event_to_filter_mapping_lock$);
        declare_defglobal($kb_modification_event_internal_listener_table$);
        event_model.register_event_class($KB_MODIFICATION_FILTER_FIRED, $KB_STORE_EVENT, NIL);
        declare_defglobal($kb_modification_filter_event_fired_listener$);
        kb_modification_event.register_listener_with_kb_modifications_event_dispatcher($kb_modification_filter_event_fired_listener$.getGlobalValue());
        declare_defglobal($event_filter_listener_registration$);
        declare_defglobal($event_filter_listener_registration_lock$);
        declare_defglobal($event_filter_listener_id$);
        register_external_symbol(DELETE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_SOCKET_INFO_METHOD));
        register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym140$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO));
        register_method($external_event_filter_listener_p_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(EXTERNAL_EVENT_FILTER_LISTENER_P_SOCKET_INFO_METHOD));
        register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function($sym142$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD));
        register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHOD));
        register_external_symbol(CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        declare_defglobal($kb_modification_event_mailbox_suite$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(MESSAGE_MAILBOX_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list161);
        def_csetf(MMBOX_LISTENER_ADDRESS, _CSETF_MMBOX_LISTENER_ADDRESS);
        identity(MESSAGE_MAILBOX_LISTENER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_LISTENER_METHOD));
        register_method($transmit_kb_modification_event_to_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym169$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN));
        register_method($compute_key_from_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym170$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L));
        register_method($external_event_filter_listener_p_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function(EXTERNAL_EVENT_FILTER_LISTENER_P_MESSAGE_MAILBOX_LISTENER_METHOD));
        register_method($is_external_event_filter_listener_validP_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym172$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER));
        register_method($invalidate_external_event_filter_listener_method_table$.getGlobalValue(), $dtp_message_mailbox_listener$.getGlobalValue(), symbol_function($sym173$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE));
        register_external_symbol($sym175$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST);
        register_external_symbol(ALL_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGES_FROM_MAILBOX);
        declare_defglobal($active_external_kb_modification_event_filters$);
        declare_defglobal($external_kb_modification_event_listeners_for_filters$);
        register_external_symbol(ADD_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        register_external_symbol(REMOVE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_LISTENER);
        sunit_external.define_test_category($$$KB_Modification_Event_Filters, UNPROVIDED);
        sunit_external.define_test_suite($str189$KB_Modification_Event_Filters_Tes, list($$$KB_Modification_Event_Filters), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Invalid_event_denotation__A_for_f = makeString("Invalid event denotation ~A for filter ~A.");

    static private final SubLList $list_alt1 = list(makeSymbol("FILTER-TOKEN"), makeSymbol("EVENTS"), makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCSTRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt3$Arglist_must_start_with_event_par = makeString("Arglist must start with event parameter.");

    static private final SubLList $list_alt9 = list(list(makeSymbol("FILTERS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*"), NIL));

    static private final SubLList $list_alt13 = list(makeSymbol("*MATCHED-KB-MODIFICATION-EVENT-FILTERS*"));

    static private final SubLList $list_alt21 = list(makeKeyword("ALL"));

    static private final SubLList $list_alt25 = list(makeKeyword("KB-MODIFY-REMOVE-CONSTANT"), makeKeyword("KB-MODIFY-REMOVE-NART"), makeKeyword("KB-MODIFY-CREATE-ASSERTION"), makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));

    @Override
    public void declareFunctions() {
        declare_kb_modification_event_filters_file();
    }

    static private final SubLList $list_alt28 = list(makeKeyword("KB-MODIFY-CREATE-ASSERTION"), makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));

    @Override
    public void initializeVariables() {
        init_kb_modification_event_filters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_modification_event_filters_file();
    }

    static {
    }

    static private final SubLList $list_alt67 = list(makeSymbol("ID"), makeSymbol("PATTERN"));

    static private final SubLList $list_alt68 = list(makeKeyword("ID"), makeKeyword("PATTERN"));

    public static final class $event_filter_description_p$UnaryFunction extends UnaryFunction {
        public $event_filter_description_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-FILTER-DESCRIPTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_filter_description_p(arg1);
        }
    }

    static private final SubLList $list_alt69 = list(makeSymbol("EVENT-FILTER-DESCRIPTION-ID"), makeSymbol("EVENT-FILTER-DESCRIPTION-PATTERN"));

    static private final SubLList $list_alt70 = list(makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-ID"), makeSymbol("_CSETF-EVENT-FILTER-DESCRIPTION-PATTERN"));

    public static final class $message_mailbox_listener_native extends SubLStructNative {
        public SubLObject $address;

        private static final SubLStructDeclNative structDecl;

        public $message_mailbox_listener_native() {
            kb_modification_event_filters.$message_mailbox_listener_native.this.$address = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return kb_modification_event_filters.$message_mailbox_listener_native.this.$address;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return kb_modification_event_filters.$message_mailbox_listener_native.this.$address = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.kb_modification_event_filters.$message_mailbox_listener_native.class, MESSAGE_MAILBOX_LISTENER, MESSAGE_MAILBOX_LISTENER_P, $list155, $list156, new String[]{ "$address" }, $list157, $list158, PRINT_MESSAGE_MAILBOX_LISTENER);
        }
    }

    static private final SubLString $str_alt79$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt80$__ = makeString("#<");

    public static final class $message_mailbox_listener_p$UnaryFunction extends UnaryFunction {
        public $message_mailbox_listener_p$UnaryFunction() {
            super(extractFunctionNamed("MESSAGE-MAILBOX-LISTENER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return message_mailbox_listener_p(arg1);
        }
    }

    static private final SubLString $str_alt82$_id__ = makeString(" id: ");

    static private final SubLString $str_alt83$_pattern__ = makeString(" pattern: ");

    static private final SubLString $str_alt89$Current_KB_Modification_Event_Fil = makeString("Current KB Modification Event Filter Registration");

    static private final SubLString $str_alt95$KB_Modification_Event_to_Filter_M = makeString("KB Modification Event to Filter Mapping");

    static private final SubLString $str_alt97$Current_KB_Modification_Event_To_ = makeString("Current KB Modification Event To Filter Mapping");

    static private final SubLString $str_alt98$Current_KB_Modification_Event_Int = makeString("Current KB Modification Event Internal Listener Table");

    static private final SubLString $str_alt109$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    static private final SubLString $str_alt111$Not_implemented_for_type__A = makeString("Not implemented for type ~A");

    static private final SubLList $list_alt115 = list(CHAR_hyphen);

    static private final SubLString $str_alt118$http___www_opencyc_org_xml_eventN = makeString("http://www.opencyc.org/xml/eventNotifications.dtd");

    static private final SubLString $str_alt128$KB_Modification_Filter_Fired__cou = makeString("KB Modification Filter Fired: could not report event ~S to listener ~A -> error ~A.~%Deregistering listener ~A");

    static private final SubLString $str_alt131$Event_Filter_Listener_Registratio = makeString("Event Filter Listener Registration");

    static private final SubLString $str_alt133$Current_External_KB_Modification_ = makeString("Current External KB Modification Event Filter Listener Registration");

    static private final SubLSymbol $sym136$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_SOCKET_INFO_METHO = makeSymbol("COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-SOCKET-INFO-METHOD");

    static private final SubLSymbol $sym138$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__SOCKET_INFO_METHOD = makeSymbol("IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-SOCKET-INFO-METHOD");

    static private final SubLString $str_alt141$_A__About_to_send_to__A__A____A__ = makeString("~A: About to send to ~A:~A:~%~A~%");

    static private final SubLList $list_alt148 = list(makeSymbol("*KB-MODIFICATION-EVENT-MAILBOX-SUITE*"));

    static private final SubLList $list_alt151 = list(makeSymbol("ADDRESS"));

    static private final SubLList $list_alt152 = list(makeKeyword("ADDRESS"));

    static private final SubLList $list_alt153 = list(makeSymbol("MMBOX-LISTENER-ADDRESS"));

    static private final SubLList $list_alt154 = list(makeSymbol("_CSETF-MMBOX-LISTENER-ADDRESS"));

    static private final SubLString $str_alt160$_address__ = makeString(" address: ");

    static private final SubLSymbol $sym162$TRANSMIT_KB_MODIFICATION_EVENT_TO_LISTENER_MESSAGE_MAILBOX_LISTEN = makeSymbol("TRANSMIT-KB-MODIFICATION-EVENT-TO-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    static private final SubLSymbol $sym163$COMPUTE_KEY_FROM_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_L = makeSymbol("COMPUTE-KEY-FROM-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    static private final SubLSymbol $sym165$IS_EXTERNAL_EVENT_FILTER_LISTENER_VALID__MESSAGE_MAILBOX_LISTENER = makeSymbol("IS-EXTERNAL-EVENT-FILTER-LISTENER-VALID?-MESSAGE-MAILBOX-LISTENER-METHOD");

    static private final SubLSymbol $sym166$INVALIDATE_EXTERNAL_EVENT_FILTER_LISTENER_MESSAGE_MAILBOX_LISTENE = makeSymbol("INVALIDATE-EXTERNAL-EVENT-FILTER-LISTENER-MESSAGE-MAILBOX-LISTENER-METHOD");

    static private final SubLString $str_alt167$The_listener__S_is_no_longer_vali = makeString("The listener ~S is no longer valid.");

    static private final SubLSymbol $sym168$CREATE_EXTERNAL_KB_MODIFICATION_EVENT_FILTER_MESSAGE_MAILBOX_LIST = makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER");

    static private final SubLString $str_alt170$Not_a_valid_external_event_filter = makeString("Not a valid external event filter listener ID.");

    static private final SubLString $str_alt171$Wrong_API_for_type____only_suitab = makeString("Wrong API for type -- only suitable for message mailbox listeners.");

    static private final SubLString $str_alt174$External_KB_Modification_Event_Li = makeString("External KB Modification Event Listeners");

    static private final SubLString $str_alt175$Current_External_KB_Modification_ = makeString("Current External KB Modification Event Filters & Listeners");

    static private final SubLString $str_alt176$_Active_Filters__ = makeString(" Active Filters: ");

    static private final SubLString $str_alt177$_Listeners_for_Filters_Map__ = makeString(" Listeners for Filters Map: ");

    private static final SubLSymbol FILTER_REGISTRATION = makeSymbol("FILTER-REGISTRATION");

    static private final SubLList $list_alt184 = list(list(makeSymbol("IDS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-FILTERS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol IDS = makeSymbol("IDS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FILTER_REGISTRATION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FILTER-REGISTRATION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FILTER_REGISTRATION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FILTER-REGISTRATION-INSTANCE");

    static private final SubLString $str_alt200$kb_modification_event_filters = makeString("kb-modification-event-filters");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol TEST_FILTERS = makeSymbol("TEST-FILTERS");

    private static final SubLSymbol LISTENER_REGISTRATION = makeSymbol("LISTENER-REGISTRATION");

    static private final SubLList $list_alt204 = list(list(makeSymbol("IDS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-LISTENERS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LISTENER_REGISTRATION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LISTENER-REGISTRATION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LISTENER_REGISTRATION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LISTENER-REGISTRATION-INSTANCE");

    private static final SubLSymbol TEST_LISTENERS = makeSymbol("TEST-LISTENERS");

    private static final SubLSymbol FILTERS_AND_LISTENERS = makeSymbol("FILTERS-AND-LISTENERS");

    static private final SubLList $list_alt209 = list(list(makeSymbol("FILTER-IDS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("LISTENER-IDS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-FILTERS-AND-LISTENERS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol LISTENER_IDS = makeSymbol("LISTENER-IDS");

    private static final SubLSymbol FILTER_IDS = makeSymbol("FILTER-IDS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FILTERS_AND_LISTENERS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FILTERS-AND-LISTENERS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FILTERS_AND_LISTENERS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FILTERS-AND-LISTENERS-INSTANCE");

    private static final SubLSymbol TEST_FILTERS_AND_LISTENERS = makeSymbol("TEST-FILTERS-AND-LISTENERS");

    static private final SubLString $str_alt215$KB_Modification_Event_Filters_Tes = makeString("KB Modification Event Filters Test Suite");
}

/**
 * Total time: 1042 ms
 */
