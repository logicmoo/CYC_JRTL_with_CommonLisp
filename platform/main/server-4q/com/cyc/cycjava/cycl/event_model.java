package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class event_model extends SubLTranslatedFile {
    public static final SubLFile me = new event_model();

    public static final String myName = "com.cyc.cycjava.cycl.event_model";

    public static final String myFingerPrint = "5a844689f54d9dbdd4e9107c74ac32aa1f8060e06a46956a5eae069c8a825ddf";

    // defconstant
    public static final SubLSymbol $dtp_event_class$ = makeSymbol("*DTP-EVENT-CLASS*");

    // defconstant
    public static final SubLSymbol $dtp_event_hierarchy$ = makeSymbol("*DTP-EVENT-HIERARCHY*");



    // defconstant
    public static final SubLSymbol $dtp_event$ = makeSymbol("*DTP-EVENT*");

    // Internal Constants
    public static final SubLSymbol EVENT_CLASS = makeSymbol("EVENT-CLASS");

    public static final SubLSymbol EVENT_CLASS_P = makeSymbol("EVENT-CLASS-P");

    public static final SubLList $list2 = list(makeSymbol("PARENT"), makeSymbol("SELF"), makeSymbol("PATTERN"), makeSymbol("PROPERTIES"));

    public static final SubLList $list3 = list(makeKeyword("PARENT"), makeKeyword("SELF"), makeKeyword("PATTERN"), makeKeyword("PROPERTIES"));

    public static final SubLList $list4 = list(makeSymbol("EVENT-CLASS-PARENT"), makeSymbol("EVENT-CLASS-SELF"), makeSymbol("EVENT-CLASS-PATTERN"), makeSymbol("EVENT-CLASS-PROPERTIES"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-EVENT-CLASS-PARENT"), makeSymbol("_CSETF-EVENT-CLASS-SELF"), makeSymbol("_CSETF-EVENT-CLASS-PATTERN"), makeSymbol("_CSETF-EVENT-CLASS-PROPERTIES"));



    public static final SubLSymbol EVENT_CLASS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-CLASS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVENT-CLASS-P"));

    private static final SubLSymbol EVENT_CLASS_PARENT = makeSymbol("EVENT-CLASS-PARENT");

    private static final SubLSymbol _CSETF_EVENT_CLASS_PARENT = makeSymbol("_CSETF-EVENT-CLASS-PARENT");

    private static final SubLSymbol EVENT_CLASS_SELF = makeSymbol("EVENT-CLASS-SELF");

    private static final SubLSymbol _CSETF_EVENT_CLASS_SELF = makeSymbol("_CSETF-EVENT-CLASS-SELF");

    private static final SubLSymbol EVENT_CLASS_PATTERN = makeSymbol("EVENT-CLASS-PATTERN");

    private static final SubLSymbol _CSETF_EVENT_CLASS_PATTERN = makeSymbol("_CSETF-EVENT-CLASS-PATTERN");

    private static final SubLSymbol EVENT_CLASS_PROPERTIES = makeSymbol("EVENT-CLASS-PROPERTIES");

    private static final SubLSymbol _CSETF_EVENT_CLASS_PROPERTIES = makeSymbol("_CSETF-EVENT-CLASS-PROPERTIES");









    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_EVENT_CLASS = makeSymbol("MAKE-EVENT-CLASS");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVENT_CLASS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-CLASS-METHOD");













    private static final SubLSymbol EVENT_HIERARCHY = makeSymbol("EVENT-HIERARCHY");

    private static final SubLSymbol EVENT_HIERARCHY_P = makeSymbol("EVENT-HIERARCHY-P");

    private static final SubLList $list35 = list(makeSymbol("LOCK"), makeSymbol("GRAPH"), makeSymbol("PROPERTIES"));

    private static final SubLList $list36 = list(makeKeyword("LOCK"), makeKeyword("GRAPH"), makeKeyword("PROPERTIES"));

    private static final SubLList $list37 = list(makeSymbol("EVENT-HIERARCHY-LOCK"), makeSymbol("EVENT-HIERARCHY-GRAPH"), makeSymbol("EVENT-HIERARCHY-PROPERTIES"));

    private static final SubLList $list38 = list(makeSymbol("_CSETF-EVENT-HIERARCHY-LOCK"), makeSymbol("_CSETF-EVENT-HIERARCHY-GRAPH"), makeSymbol("_CSETF-EVENT-HIERARCHY-PROPERTIES"));

    private static final SubLSymbol EVENT_HIERARCHY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-HIERARCHY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list40 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVENT-HIERARCHY-P"));

    private static final SubLSymbol EVENT_HIERARCHY_LOCK = makeSymbol("EVENT-HIERARCHY-LOCK");

    private static final SubLSymbol _CSETF_EVENT_HIERARCHY_LOCK = makeSymbol("_CSETF-EVENT-HIERARCHY-LOCK");

    private static final SubLSymbol EVENT_HIERARCHY_GRAPH = makeSymbol("EVENT-HIERARCHY-GRAPH");

    private static final SubLSymbol _CSETF_EVENT_HIERARCHY_GRAPH = makeSymbol("_CSETF-EVENT-HIERARCHY-GRAPH");

    private static final SubLSymbol EVENT_HIERARCHY_PROPERTIES = makeSymbol("EVENT-HIERARCHY-PROPERTIES");

    private static final SubLSymbol _CSETF_EVENT_HIERARCHY_PROPERTIES = makeSymbol("_CSETF-EVENT-HIERARCHY-PROPERTIES");





    private static final SubLSymbol MAKE_EVENT_HIERARCHY = makeSymbol("MAKE-EVENT-HIERARCHY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVENT_HIERARCHY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-HIERARCHY-METHOD");

    private static final SubLString $$$Event_Hierarchy = makeString("Event Hierarchy");

    private static final SubLList $list52 = list(list(makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $event_hierarchy$ = makeSymbol("*EVENT-HIERARCHY*");

    private static final SubLString $str55$Cannot_register_base_class__S_wit = makeString("Cannot register base-class ~S with unknown parent ~S.~%");



    private static final SubLList $list57 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("DOC"), makeSymbol("PARENT"), makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list58 = list(makeKeyword("DOC"), makeKeyword("PARENT"), makeKeyword("HIERARCHY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol DECLARE_BASE_EVENT_CLASS_INTERNAL = makeSymbol("DECLARE-BASE-EVENT-CLASS-INTERNAL");



    private static final SubLString $str64$The_root_class_of_all_events_in_t = makeString("The root class of all events in the hierarchy.");



    private static final SubLString $str66$All_of_the_events_used_by_the_run = makeString("All of the events used by the runtime support system itself.");



    private static final SubLString $str68$All_of_the_events_used_by_the_app = makeString("All of the events used by the applications written by the users.");



    private static final SubLString $str70$All_of_the_events_triggered_by_Su = makeString("All of the events triggered by SubLISP code.");



    private static final SubLString $str72$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the CYC implementation.");

    private static final SubLSymbol $KB_STORE_EVENT = makeKeyword("KB-STORE-EVENT");

    private static final SubLString $str74$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the KB implementation.");



    private static final SubLString $str76$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the inference engine.");



    private static final SubLString $str78$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the SBHL reasoning subsystem.");



    private static final SubLString $str80$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the NL subsystem.");

    private static final SubLSymbol $CYC_APPLICATION_EVENT = makeKeyword("CYC-APPLICATION-EVENT");

    private static final SubLString $str82$The_parent_for_all_events_that_ar = makeString("The parent for all events that are trigged by applications built on top of CYC.");

    private static final SubLSymbol INITIALIZE_EVENT_HIERARCHY = makeSymbol("INITIALIZE-EVENT-HIERARCHY");

    private static final SubLSymbol DO_EVENT_DOWNWARD_CLOSURE = makeSymbol("DO-EVENT-DOWNWARD-CLOSURE");

    private static final SubLList $list85 = list(makeSymbol("HIERARCHY"));







    public static final SubLList $list89 = list(list(makeSymbol("ENSURE-EVENT-HIERARCHY")));



    private static final SubLString $str91$Cannot_register_event__S_for_unkn = makeString("Cannot register event ~S for unknown parent ~S.~%");

    private static final SubLList $list92 = list(list(makeSymbol("CURR"), makeSymbol("EVENT"), makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));









    public static final SubLList $list97 = list(makeKeyword("EVENT-ROOT"));

    private static final SubLList $list98 = list(NIL);

    private static final SubLSymbol FIND_IN_EVENT_HIERARCHY = makeSymbol("FIND-IN-EVENT-HIERARCHY");

    private static final SubLList $list100 = list(list(makeSymbol("CURR"), makeSymbol("EVENT"), makeSymbol("CHILDREN"), makeSymbol("&OPTIONAL"), makeSymbol("HIERARCHY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym101$QUEUE = makeUninternedSymbol("QUEUE");

    private static final SubLSymbol $sym102$KID = makeUninternedSymbol("KID");

    private static final SubLSymbol $sym103$KIDS = makeUninternedSymbol("KIDS");

    private static final SubLList $list104 = list(list(makeSymbol("CREATE-QUEUE")));



    private static final SubLList $list106 = list(makeSymbol("EVENT-HIERARCHY-P"));









    private static final SubLSymbol CHILDREN_OF_EVENT_CLASS_IN_HIERARCHY = makeSymbol("CHILDREN-OF-EVENT-CLASS-IN-HIERARCHY");



    private static final SubLString $str113$__S_ = makeString(" ~S ");

    private static final SubLString $str114$____ = makeString(" => ");

    private static final SubLString $str115$__S = makeString(" ~S");



    private static final SubLSymbol EVENT_P = makeSymbol("EVENT-P");

    private static final SubLList $list118 = list(makeSymbol("CLASS"), makeSymbol("TIMESTAMP"), makeSymbol("SOURCE"), makeSymbol("MESSAGE"));

    private static final SubLList $list119 = list(makeKeyword("CLASS"), makeKeyword("TIMESTAMP"), makeKeyword("SOURCE"), makeKeyword("MESSAGE"));

    private static final SubLList $list120 = list(makeSymbol("EVENT-CLASS"), makeSymbol("EVENT-TIMESTAMP"), makeSymbol("EVENT-SOURCE"), makeSymbol("EVENT-MESSAGE"));

    private static final SubLList $list121 = list(makeSymbol("_CSETF-EVENT-CLASS"), makeSymbol("_CSETF-EVENT-TIMESTAMP"), makeSymbol("_CSETF-EVENT-SOURCE"), makeSymbol("_CSETF-EVENT-MESSAGE"));

    private static final SubLSymbol PRINT_EVENT = makeSymbol("PRINT-EVENT");

    private static final SubLSymbol EVENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list124 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVENT-P"));

    private static final SubLSymbol _CSETF_EVENT_CLASS = makeSymbol("_CSETF-EVENT-CLASS");

    private static final SubLSymbol EVENT_TIMESTAMP = makeSymbol("EVENT-TIMESTAMP");

    private static final SubLSymbol _CSETF_EVENT_TIMESTAMP = makeSymbol("_CSETF-EVENT-TIMESTAMP");

    private static final SubLSymbol EVENT_SOURCE = makeSymbol("EVENT-SOURCE");

    private static final SubLSymbol _CSETF_EVENT_SOURCE = makeSymbol("_CSETF-EVENT-SOURCE");

    private static final SubLSymbol EVENT_MESSAGE = makeSymbol("EVENT-MESSAGE");

    private static final SubLSymbol _CSETF_EVENT_MESSAGE = makeSymbol("_CSETF-EVENT-MESSAGE");









    private static final SubLSymbol MAKE_EVENT = makeSymbol("MAKE-EVENT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-METHOD");

    private static final SubLString $str138$__EVENT_ = makeString("#<EVENT ");

    private static final SubLString $$$_posted = makeString(" posted");

    private static final SubLString $$$_by_ = makeString(" by ");

    private static final SubLString $$$_at_ = makeString(" at ");

    private static final SubLString $str142$__w__msg_ = makeString("  w/ msg ");

    private static final SubLString $str143$__ = makeString("> ");

    public static SubLObject event_class_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_class_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$event_class_native.class ? T : NIL;
    }

    public static SubLObject event_class_parent(final SubLObject v_object) {
        assert NIL != event_class_p(v_object) : "event_model.event_class_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject event_class_self(final SubLObject v_object) {
        assert NIL != event_class_p(v_object) : "event_model.event_class_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject event_class_pattern(final SubLObject v_object) {
        assert NIL != event_class_p(v_object) : "event_model.event_class_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject event_class_properties(final SubLObject v_object) {
        assert NIL != event_class_p(v_object) : "event_model.event_class_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_event_class_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_class_p(v_object) : "event_model.event_class_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_class_self(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_class_p(v_object) : "event_model.event_class_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_class_pattern(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_class_p(v_object) : "event_model.event_class_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_event_class_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_class_p(v_object) : "event_model.event_class_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_event_class(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $event_class_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARENT)) {
                _csetf_event_class_parent(v_new, current_value);
            } else
                if (pcase_var.eql($SELF)) {
                    _csetf_event_class_self(v_new, current_value);
                } else
                    if (pcase_var.eql($PATTERN)) {
                        _csetf_event_class_pattern(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROPERTIES)) {
                            _csetf_event_class_properties(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_class(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVENT_CLASS, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARENT, event_class_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $SELF, event_class_self(obj));
        funcall(visitor_fn, obj, $SLOT, $PATTERN, event_class_pattern(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, event_class_properties(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVENT_CLASS, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_class_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_class(obj, visitor_fn);
    }

    public static SubLObject instantiate_event_class_structure(final SubLObject self, final SubLObject parent) {
        final SubLObject event_class = make_event_class(UNPROVIDED);
        _csetf_event_class_parent(event_class, parent);
        _csetf_event_class_self(event_class, self);
        _csetf_event_class_pattern(event_class, NIL);
        _csetf_event_class_properties(event_class, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        return event_class;
    }

    public static SubLObject event_class_set_property(final SubLObject event_class, final SubLObject property, final SubLObject value) {
        return dictionary.dictionary_enter(event_class_properties(event_class), property, value);
    }

    public static SubLObject event_class_get_property(final SubLObject event_class, final SubLObject property) {
        return dictionary.dictionary_lookup(event_class_properties(event_class), property, UNPROVIDED);
    }

    public static SubLObject event_class_is_abstractP(final SubLObject event_class) {
        return eq($ABSTRACT, event_class_get_property(event_class, $TYPE));
    }

    public static SubLObject make_event_class_abstract(final SubLObject event_class) {
        return event_class_set_property(event_class, $TYPE, $ABSTRACT);
    }

    public static SubLObject make_event_class_instantiatable(final SubLObject event_class) {
        return event_class_set_property(event_class, $TYPE, $INSTANTIATABLE);
    }

    public static SubLObject event_class_is_mutableP(final SubLObject event_class) {
        return eq($TRUE, event_class_get_property(event_class, $MUTABLE));
    }

    public static SubLObject make_event_class_immutable(final SubLObject event_class) {
        return event_class_set_property(event_class, $MUTABLE, $FALSE);
    }

    public static SubLObject make_event_class_mutable(final SubLObject event_class) {
        return event_class_set_property(event_class, $MUTABLE, $TRUE);
    }

    public static SubLObject event_hierarchy_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_hierarchy_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$event_hierarchy_native.class ? T : NIL;
    }

    public static SubLObject event_hierarchy_lock(final SubLObject v_object) {
        assert NIL != event_hierarchy_p(v_object) : "event_model.event_hierarchy_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject event_hierarchy_graph(final SubLObject v_object) {
        assert NIL != event_hierarchy_p(v_object) : "event_model.event_hierarchy_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject event_hierarchy_properties(final SubLObject v_object) {
        assert NIL != event_hierarchy_p(v_object) : "event_model.event_hierarchy_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_event_hierarchy_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_hierarchy_p(v_object) : "event_model.event_hierarchy_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_hierarchy_graph(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_hierarchy_p(v_object) : "event_model.event_hierarchy_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_hierarchy_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_hierarchy_p(v_object) : "event_model.event_hierarchy_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_event_hierarchy(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $event_hierarchy_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_event_hierarchy_lock(v_new, current_value);
            } else
                if (pcase_var.eql($GRAPH)) {
                    _csetf_event_hierarchy_graph(v_new, current_value);
                } else
                    if (pcase_var.eql($PROPERTIES)) {
                        _csetf_event_hierarchy_properties(v_new, current_value);
                    } else {
                        Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_hierarchy(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVENT_HIERARCHY, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, event_hierarchy_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $GRAPH, event_hierarchy_graph(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, event_hierarchy_properties(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVENT_HIERARCHY, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_hierarchy_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_hierarchy(obj, visitor_fn);
    }

    public static SubLObject new_event_hierarchy() {
        final SubLObject hier = make_event_hierarchy(UNPROVIDED);
        _csetf_event_hierarchy_lock(hier, make_lock($$$Event_Hierarchy));
        _csetf_event_hierarchy_graph(hier, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_event_hierarchy_properties(hier, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        return hier;
    }

    public static SubLObject with_event_hierarchy_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list52);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hierarchy = NIL;
        destructuring_bind_must_consp(current, datum, $list52);
        hierarchy = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_LOCK_HELD, list(list(EVENT_HIERARCHY_LOCK, hierarchy)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list52);
        return NIL;
    }

    public static SubLObject add_to_event_hierarchy(final SubLObject hierarchy, final SubLObject event_class) {
        assert NIL != event_hierarchy_p(hierarchy) : "event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) " + hierarchy;
        SubLObject result = NIL;
        final SubLObject lock = event_hierarchy_lock(hierarchy);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_graph = event_hierarchy_graph(hierarchy);
            final SubLObject event_key = event_class_self(event_class);
            if (NIL != find_in_event_hierarchy(hierarchy, event_key)) {
                result = NIL;
            } else {
                dictionary.dictionary_enter(v_graph, event_key, event_class);
                result = T;
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject find_in_event_hierarchy(final SubLObject hierarchy, final SubLObject event_key) {
        assert NIL != event_hierarchy_p(hierarchy) : "event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) " + hierarchy;
        SubLObject result = NIL;
        final SubLObject lock = event_hierarchy_lock(hierarchy);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_graph = event_hierarchy_graph(hierarchy);
            result = dictionary.dictionary_lookup(v_graph, event_key, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject children_of_event_class_in_hierarchy(final SubLObject parent_key, final SubLObject hierarchy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject children = NIL;
        final SubLObject lock = event_hierarchy_lock(hierarchy);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_graph = event_hierarchy_graph(hierarchy);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_graph)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject the_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject the_class = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (parent_key.eql(event_class_parent(the_class))) {
                    children = cons(the_class, children);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return children;
    }

    public static SubLObject remove_from_event_hierarchy(final SubLObject hierarchy, final SubLObject event_key) {
        assert NIL != event_hierarchy_p(hierarchy) : "event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) " + hierarchy;
        SubLObject result = NIL;
        final SubLObject lock = event_hierarchy_lock(hierarchy);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject event_class = find_in_event_hierarchy(hierarchy, event_key);
            if (((NIL != event_class_p(event_class)) && (NIL != event_class_is_mutableP(event_class))) && (NIL == children_of_event_class_in_hierarchy(event_key, hierarchy))) {
                final SubLObject v_graph = event_hierarchy_graph(hierarchy);
                dictionary.dictionary_remove(v_graph, event_key);
                result = T;
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject ensure_event_hierarchy() {
        if (NIL == event_hierarchy_p($event_hierarchy$.getGlobalValue())) {
            $event_hierarchy$.setGlobalValue(new_event_hierarchy());
        }
        return $event_hierarchy$.getGlobalValue();
    }

    public static SubLObject event_class_register_base_class(final SubLObject event, final SubLObject parent, SubLObject hierarchy) {
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        if (NIL == event_hierarchy_p(hierarchy)) {
            hierarchy = ensure_event_hierarchy();
        }
        final SubLObject event_class = instantiate_event_class_structure(event, parent);
        if ((NIL != parent) && (NIL == find_in_event_hierarchy(hierarchy, parent))) {
            Errors.error($str55$Cannot_register_base_class__S_wit, event, parent);
        }
        make_event_class_abstract(event_class);
        make_event_class_immutable(event_class);
        add_to_event_hierarchy(hierarchy, event_class);
        return event_class;
    }

    public static SubLObject declare_base_event_class_internal(final SubLObject class_key, final SubLObject parent, SubLObject docstring, SubLObject hierarchy) {
        if (docstring == UNPROVIDED) {
            docstring = NIL;
        }
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        final SubLObject event_class = event_class_register_base_class(class_key, parent, hierarchy);
        if (docstring.isString()) {
            event_class_set_property(event_class, $DOC_STRING, docstring);
        }
        return event_class;
    }

    public static SubLObject declare_base_event_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$1, $list58, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject doc_tail = property_list_member($DOC, current);
        final SubLObject doc = (NIL != doc_tail) ? cadr(doc_tail) : NIL;
        final SubLObject parent_tail = property_list_member($PARENT, current);
        final SubLObject parent = (NIL != parent_tail) ? cadr(parent_tail) : NIL;
        final SubLObject hierarchy_tail = property_list_member($HIERARCHY, current);
        final SubLObject hierarchy = (NIL != hierarchy_tail) ? cadr(hierarchy_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DECLARE_BASE_EVENT_CLASS_INTERNAL, class_key, parent, doc, hierarchy);
    }

    public static SubLObject initialize_event_hierarchy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject hierarchy = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        hierarchy = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, list(NULL, hierarchy), listS(CSETQ, hierarchy, $list89));
        }
        cdestructuring_bind_error(datum, $list85);
        return NIL;
    }

    public static SubLObject core_event_hierarchy() {
        return $event_hierarchy$.getGlobalValue();
    }

    public static SubLObject register_event_class(final SubLObject event, final SubLObject parent, SubLObject hierarchy) {
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        assert NIL != keywordp(event) : "Types.keywordp(event) " + "CommonSymbols.NIL != Types.keywordp(event) " + event;
        assert NIL != keywordp(parent) : "Types.keywordp(parent) " + "CommonSymbols.NIL != Types.keywordp(parent) " + parent;
        if (NIL == hierarchy) {
            hierarchy = ensure_event_hierarchy();
        }
        assert NIL != event_hierarchy_p(hierarchy) : "event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) " + hierarchy;
        if (NIL == find_in_event_hierarchy(hierarchy, parent)) {
            Errors.error($str91$Cannot_register_event__S_for_unkn, parent);
        }
        final SubLObject event_class = instantiate_event_class_structure(event, parent);
        return add_to_event_hierarchy(hierarchy, event_class);
    }

    public static SubLObject find_event_class(final SubLObject event, SubLObject hierarchy) {
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        assert NIL != keywordp(event) : "Types.keywordp(event) " + "CommonSymbols.NIL != Types.keywordp(event) " + event;
        if (NIL == hierarchy) {
            hierarchy = ensure_event_hierarchy();
        }
        assert NIL != event_hierarchy_p(hierarchy) : "event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) " + hierarchy;
        return find_in_event_hierarchy(hierarchy, event);
    }

    public static SubLObject do_event_upward_closure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject curr = NIL;
        SubLObject event = NIL;
        SubLObject hierarchy = NIL;
        destructuring_bind_must_consp(current, datum, $list92);
        curr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        event = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list92);
        hierarchy = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list(curr, event)), list(WHILE, curr, bq_cons(PROGN, append(body, NIL)), list(PIF, listS(EQ, list(EVENT_CLASS_SELF, curr), $list97), listS(CSETQ, curr, $list98), list(CSETQ, curr, list(FIND_IN_EVENT_HIERARCHY, hierarchy, list(EVENT_CLASS_PARENT, curr))))));
        }
        cdestructuring_bind_error(datum, $list92);
        return NIL;
    }

    public static SubLObject do_event_downward_closure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject curr = NIL;
        SubLObject event = NIL;
        SubLObject children = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        curr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        event = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        children = current.first();
        current = current.rest();
        final SubLObject hierarchy = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list100);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject queue = $sym101$QUEUE;
            final SubLObject kid = $sym102$KID;
            final SubLObject kids = $sym103$KIDS;
            return list(CLET, list(bq_cons(queue, $list104), bq_cons(children, $list98)), list(INITIALIZE_EVENT_HIERARCHY, hierarchy), listS(CHECK_TYPE, hierarchy, $list106), list(ENQUEUE, event, queue), list(WHILE, list(CNOT, list(QUEUE_EMPTY_P, queue)), listS(CLET, list(list(curr, list(DEQUEUE, queue)), list(kids, list(CHILDREN_OF_EVENT_CLASS_IN_HIERARCHY, curr, hierarchy))), list(CSETQ, children, kids), append(body, list(list(CDOLIST, list(kid, kids), list(ENQUEUE, list(EVENT_CLASS_SELF, kid), queue)))))));
        }
        cdestructuring_bind_error(datum, $list100);
        return NIL;
    }

    public static SubLObject display_event_hierarchy(SubLObject hierarchy, SubLObject stream) {
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject queue = queues.create_queue(UNPROVIDED);
        SubLObject children = NIL;
        if (NIL == hierarchy) {
            hierarchy = ensure_event_hierarchy();
        }
        assert NIL != event_hierarchy_p(hierarchy) : "event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) " + hierarchy;
        queues.enqueue($EVENT_ROOT, queue);
        while (NIL == queues.queue_empty_p(queue)) {
            final SubLObject curr = queues.dequeue(queue);
            final SubLObject kids = children = children_of_event_class_in_hierarchy(curr, hierarchy);
            format(stream, $str113$__S_, curr);
            if (NIL != children) {
                write_string($str114$____, stream, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = children;
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(T, $str115$__S, event_class_self(child));
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
            }
            terpri(stream);
            SubLObject cdolist_list_var = kids;
            SubLObject kid = NIL;
            kid = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                queues.enqueue(event_class_self(kid), queue);
                cdolist_list_var = cdolist_list_var.rest();
                kid = cdolist_list_var.first();
            } 
        } 
        return T;
    }

    public static SubLObject display_event_hierarchy_depth_first(SubLObject hierarchy, SubLObject start_event, SubLObject stream) {
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        if (start_event == UNPROVIDED) {
            start_event = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (NIL == hierarchy) {
            hierarchy = ensure_event_hierarchy();
        }
        assert NIL != event_hierarchy_p(hierarchy) : "event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) " + hierarchy;
        return display_event_hierarchy_current_node(start_event, hierarchy, stream, ZERO_INTEGER);
    }

    public static SubLObject display_event_hierarchy_current_node(final SubLObject event, final SubLObject hierarchy, final SubLObject stream, final SubLObject indentation) {
        string_utilities.indent(stream, indentation);
        prin1(event, stream);
        terpri(stream);
        final SubLObject deeper = add(indentation, THREE_INTEGER);
        SubLObject cdolist_list_var = children_of_event_class_in_hierarchy(event, hierarchy);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            display_event_hierarchy_current_node(event_class_self(child), hierarchy, stream, deeper);
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return event;
    }

    public static SubLObject event_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_event(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$event_native.class ? T : NIL;
    }

    public static SubLObject event_class(final SubLObject v_object) {
        assert NIL != event_p(v_object) : "event_model.event_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject event_timestamp(final SubLObject v_object) {
        assert NIL != event_p(v_object) : "event_model.event_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject event_source(final SubLObject v_object) {
        assert NIL != event_p(v_object) : "event_model.event_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject event_message(final SubLObject v_object) {
        assert NIL != event_p(v_object) : "event_model.event_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_event_class(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_p(v_object) : "event_model.event_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_timestamp(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_p(v_object) : "event_model.event_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_source(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_p(v_object) : "event_model.event_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_event_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_p(v_object) : "event_model.event_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_event(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $event_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CLASS)) {
                _csetf_event_class(v_new, current_value);
            } else
                if (pcase_var.eql($TIMESTAMP)) {
                    _csetf_event_timestamp(v_new, current_value);
                } else
                    if (pcase_var.eql($SOURCE)) {
                        _csetf_event_source(v_new, current_value);
                    } else
                        if (pcase_var.eql($MESSAGE)) {
                            _csetf_event_message(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVENT, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CLASS, event_class(obj));
        funcall(visitor_fn, obj, $SLOT, $TIMESTAMP, event_timestamp(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE, event_source(obj));
        funcall(visitor_fn, obj, $SLOT, $MESSAGE, event_message(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVENT, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event(obj, visitor_fn);
    }

    public static SubLObject new_event(final SubLObject v_class, SubLObject message, SubLObject source) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (source == UNPROVIDED) {
            source = NIL;
        }
        final SubLObject event = make_event(UNPROVIDED);
        _csetf_event_class(event, v_class);
        _csetf_event_timestamp(event, get_universal_time());
        _csetf_event_source(event, source);
        _csetf_event_message(event, message);
        return event;
    }

    public static SubLObject print_event(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str138$__EVENT_, stream, UNPROVIDED, UNPROVIDED);
        princ(event_class(v_object), stream);
        write_string($$$_posted, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != event_source(v_object)) {
            write_string($$$_by_, stream, UNPROVIDED, UNPROVIDED);
            princ(event_source(v_object), stream);
        }
        write_string($$$_at_, stream, UNPROVIDED, UNPROVIDED);
        princ(numeric_date_utilities.timestring(event_timestamp(v_object)), stream);
        if (NIL != event_message(v_object)) {
            terpri(stream);
            write_string($str142$__w__msg_, stream, UNPROVIDED, UNPROVIDED);
            princ(event_message(v_object), stream);
        }
        write_string($str143$__, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject declare_event_model_file() {
        declareFunction(me, "event_class_print_function_trampoline", "EVENT-CLASS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "event_class_p", "EVENT-CLASS-P", 1, 0, false);
        new event_model.$event_class_p$UnaryFunction();
        declareFunction(me, "event_class_parent", "EVENT-CLASS-PARENT", 1, 0, false);
        declareFunction(me, "event_class_self", "EVENT-CLASS-SELF", 1, 0, false);
        declareFunction(me, "event_class_pattern", "EVENT-CLASS-PATTERN", 1, 0, false);
        declareFunction(me, "event_class_properties", "EVENT-CLASS-PROPERTIES", 1, 0, false);
        declareFunction(me, "_csetf_event_class_parent", "_CSETF-EVENT-CLASS-PARENT", 2, 0, false);
        declareFunction(me, "_csetf_event_class_self", "_CSETF-EVENT-CLASS-SELF", 2, 0, false);
        declareFunction(me, "_csetf_event_class_pattern", "_CSETF-EVENT-CLASS-PATTERN", 2, 0, false);
        declareFunction(me, "_csetf_event_class_properties", "_CSETF-EVENT-CLASS-PROPERTIES", 2, 0, false);
        declareFunction(me, "make_event_class", "MAKE-EVENT-CLASS", 0, 1, false);
        declareFunction(me, "visit_defstruct_event_class", "VISIT-DEFSTRUCT-EVENT-CLASS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_event_class_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-CLASS-METHOD", 2, 0, false);
        declareFunction(me, "instantiate_event_class_structure", "INSTANTIATE-EVENT-CLASS-STRUCTURE", 2, 0, false);
        declareFunction(me, "event_class_set_property", "EVENT-CLASS-SET-PROPERTY", 3, 0, false);
        declareFunction(me, "event_class_get_property", "EVENT-CLASS-GET-PROPERTY", 2, 0, false);
        declareFunction(me, "event_class_is_abstractP", "EVENT-CLASS-IS-ABSTRACT?", 1, 0, false);
        declareFunction(me, "make_event_class_abstract", "MAKE-EVENT-CLASS-ABSTRACT", 1, 0, false);
        declareFunction(me, "make_event_class_instantiatable", "MAKE-EVENT-CLASS-INSTANTIATABLE", 1, 0, false);
        declareFunction(me, "event_class_is_mutableP", "EVENT-CLASS-IS-MUTABLE?", 1, 0, false);
        declareFunction(me, "make_event_class_immutable", "MAKE-EVENT-CLASS-IMMUTABLE", 1, 0, false);
        declareFunction(me, "make_event_class_mutable", "MAKE-EVENT-CLASS-MUTABLE", 1, 0, false);
        declareFunction(me, "event_hierarchy_print_function_trampoline", "EVENT-HIERARCHY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "event_hierarchy_p", "EVENT-HIERARCHY-P", 1, 0, false);
        new event_model.$event_hierarchy_p$UnaryFunction();
        declareFunction(me, "event_hierarchy_lock", "EVENT-HIERARCHY-LOCK", 1, 0, false);
        declareFunction(me, "event_hierarchy_graph", "EVENT-HIERARCHY-GRAPH", 1, 0, false);
        declareFunction(me, "event_hierarchy_properties", "EVENT-HIERARCHY-PROPERTIES", 1, 0, false);
        declareFunction(me, "_csetf_event_hierarchy_lock", "_CSETF-EVENT-HIERARCHY-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_event_hierarchy_graph", "_CSETF-EVENT-HIERARCHY-GRAPH", 2, 0, false);
        declareFunction(me, "_csetf_event_hierarchy_properties", "_CSETF-EVENT-HIERARCHY-PROPERTIES", 2, 0, false);
        declareFunction(me, "make_event_hierarchy", "MAKE-EVENT-HIERARCHY", 0, 1, false);
        declareFunction(me, "visit_defstruct_event_hierarchy", "VISIT-DEFSTRUCT-EVENT-HIERARCHY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_event_hierarchy_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-HIERARCHY-METHOD", 2, 0, false);
        declareFunction(me, "new_event_hierarchy", "NEW-EVENT-HIERARCHY", 0, 0, false);
        declareMacro(me, "with_event_hierarchy_lock_held", "WITH-EVENT-HIERARCHY-LOCK-HELD");
        declareFunction(me, "add_to_event_hierarchy", "ADD-TO-EVENT-HIERARCHY", 2, 0, false);
        declareFunction(me, "find_in_event_hierarchy", "FIND-IN-EVENT-HIERARCHY", 2, 0, false);
        declareFunction(me, "children_of_event_class_in_hierarchy", "CHILDREN-OF-EVENT-CLASS-IN-HIERARCHY", 2, 0, false);
        declareFunction(me, "remove_from_event_hierarchy", "REMOVE-FROM-EVENT-HIERARCHY", 2, 0, false);
        declareFunction(me, "ensure_event_hierarchy", "ENSURE-EVENT-HIERARCHY", 0, 0, false);
        declareFunction(me, "event_class_register_base_class", "EVENT-CLASS-REGISTER-BASE-CLASS", 2, 1, false);
        declareFunction(me, "declare_base_event_class_internal", "DECLARE-BASE-EVENT-CLASS-INTERNAL", 2, 2, false);
        declareMacro(me, "declare_base_event_class", "DECLARE-BASE-EVENT-CLASS");
        declareMacro(me, "initialize_event_hierarchy", "INITIALIZE-EVENT-HIERARCHY");
        declareFunction(me, "core_event_hierarchy", "CORE-EVENT-HIERARCHY", 0, 0, false);
        declareFunction(me, "register_event_class", "REGISTER-EVENT-CLASS", 2, 1, false);
        declareFunction(me, "find_event_class", "FIND-EVENT-CLASS", 1, 1, false);
        declareMacro(me, "do_event_upward_closure", "DO-EVENT-UPWARD-CLOSURE");
        declareMacro(me, "do_event_downward_closure", "DO-EVENT-DOWNWARD-CLOSURE");
        declareFunction(me, "display_event_hierarchy", "DISPLAY-EVENT-HIERARCHY", 0, 2, false);
        declareFunction(me, "display_event_hierarchy_depth_first", "DISPLAY-EVENT-HIERARCHY-DEPTH-FIRST", 0, 3, false);
        declareFunction(me, "display_event_hierarchy_current_node", "DISPLAY-EVENT-HIERARCHY-CURRENT-NODE", 4, 0, false);
        declareFunction(me, "event_print_function_trampoline", "EVENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "event_p", "EVENT-P", 1, 0, false);
        new event_model.$event_p$UnaryFunction();
        declareFunction(me, "event_class", "EVENT-CLASS", 1, 0, false);
        declareFunction(me, "event_timestamp", "EVENT-TIMESTAMP", 1, 0, false);
        declareFunction(me, "event_source", "EVENT-SOURCE", 1, 0, false);
        declareFunction(me, "event_message", "EVENT-MESSAGE", 1, 0, false);
        declareFunction(me, "_csetf_event_class", "_CSETF-EVENT-CLASS", 2, 0, false);
        declareFunction(me, "_csetf_event_timestamp", "_CSETF-EVENT-TIMESTAMP", 2, 0, false);
        declareFunction(me, "_csetf_event_source", "_CSETF-EVENT-SOURCE", 2, 0, false);
        declareFunction(me, "_csetf_event_message", "_CSETF-EVENT-MESSAGE", 2, 0, false);
        declareFunction(me, "make_event", "MAKE-EVENT", 0, 1, false);
        declareFunction(me, "visit_defstruct_event", "VISIT-DEFSTRUCT-EVENT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_event_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-METHOD", 2, 0, false);
        declareFunction(me, "new_event", "NEW-EVENT", 1, 2, false);
        declareFunction(me, "print_event", "PRINT-EVENT", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_event_model_file() {
        defconstant("*DTP-EVENT-CLASS*", EVENT_CLASS);
        defconstant("*DTP-EVENT-HIERARCHY*", EVENT_HIERARCHY);
        deflexical("*EVENT-HIERARCHY*", SubLTrampolineFile.maybeDefault($event_hierarchy$, $event_hierarchy$, NIL));
        defconstant("*DTP-EVENT*", EVENT);
        return NIL;
    }

    public static SubLObject setup_event_model_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_class$.getGlobalValue(), symbol_function(EVENT_CLASS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(EVENT_CLASS_PARENT, _CSETF_EVENT_CLASS_PARENT);
        def_csetf(EVENT_CLASS_SELF, _CSETF_EVENT_CLASS_SELF);
        def_csetf(EVENT_CLASS_PATTERN, _CSETF_EVENT_CLASS_PATTERN);
        def_csetf(EVENT_CLASS_PROPERTIES, _CSETF_EVENT_CLASS_PROPERTIES);
        identity(EVENT_CLASS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_class$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_CLASS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_hierarchy$.getGlobalValue(), symbol_function(EVENT_HIERARCHY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list40);
        def_csetf(EVENT_HIERARCHY_LOCK, _CSETF_EVENT_HIERARCHY_LOCK);
        def_csetf(EVENT_HIERARCHY_GRAPH, _CSETF_EVENT_HIERARCHY_GRAPH);
        def_csetf(EVENT_HIERARCHY_PROPERTIES, _CSETF_EVENT_HIERARCHY_PROPERTIES);
        identity(EVENT_HIERARCHY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_hierarchy$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_HIERARCHY_METHOD));
        declare_defglobal($event_hierarchy$);
        declare_base_event_class_internal($EVENT_ROOT, NIL, $str64$The_root_class_of_all_events_in_t, NIL);
        declare_base_event_class_internal($SYSTEM_EVENT, $EVENT_ROOT, $str66$All_of_the_events_used_by_the_run, NIL);
        declare_base_event_class_internal($APPLICATION_EVENT, $EVENT_ROOT, $str68$All_of_the_events_used_by_the_app, NIL);
        declare_base_event_class_internal($SUBLISP_EVENT, $SYSTEM_EVENT, $str70$All_of_the_events_triggered_by_Su, NIL);
        declare_base_event_class_internal($CYC_EVENT, $APPLICATION_EVENT, $str72$All_of_the_events_triggered_by_th, NIL);
        declare_base_event_class_internal($KB_STORE_EVENT, $CYC_EVENT, $str74$All_of_the_events_triggered_by_th, NIL);
        declare_base_event_class_internal($INFERENCE_EVENT, $CYC_EVENT, $str76$All_of_the_events_triggered_by_th, NIL);
        declare_base_event_class_internal($SBHL_EVENT, $CYC_EVENT, $str78$All_of_the_events_triggered_by_th, NIL);
        declare_base_event_class_internal($NL_EVENT, $CYC_EVENT, $str80$All_of_the_events_triggered_by_th, NIL);
        declare_base_event_class_internal($CYC_APPLICATION_EVENT, $CYC_EVENT, $str82$The_parent_for_all_events_that_ar, NIL);
        register_macro_helper(INITIALIZE_EVENT_HIERARCHY, DO_EVENT_DOWNWARD_CLOSURE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event$.getGlobalValue(), symbol_function(EVENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list124);
        def_csetf(EVENT_CLASS, _CSETF_EVENT_CLASS);
        def_csetf(EVENT_TIMESTAMP, _CSETF_EVENT_TIMESTAMP);
        def_csetf(EVENT_SOURCE, _CSETF_EVENT_SOURCE);
        def_csetf(EVENT_MESSAGE, _CSETF_EVENT_MESSAGE);
        identity(EVENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_event_model_file();
    }

    @Override
    public void initializeVariables() {
        init_event_model_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_event_model_file();
    }

    

    public static final class $event_class_native extends SubLStructNative {
        public SubLObject $parent;

        public SubLObject $self;

        public SubLObject $pattern;

        public SubLObject $properties;

        private static final SubLStructDeclNative structDecl;

        private $event_class_native() {
            this.$parent = Lisp.NIL;
            this.$self = Lisp.NIL;
            this.$pattern = Lisp.NIL;
            this.$properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$parent;
        }

        @Override
        public SubLObject getField3() {
            return this.$self;
        }

        @Override
        public SubLObject getField4() {
            return this.$pattern;
        }

        @Override
        public SubLObject getField5() {
            return this.$properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$parent = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$self = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$pattern = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$properties = value;
        }

        static {
            structDecl = makeStructDeclNative($event_class_native.class, EVENT_CLASS, EVENT_CLASS_P, $list2, $list3, new String[]{ "$parent", "$self", "$pattern", "$properties" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $event_class_p$UnaryFunction extends UnaryFunction {
        public $event_class_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-CLASS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_class_p(arg1);
        }
    }

    public static final class $event_hierarchy_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $graph;

        public SubLObject $properties;

        private static final SubLStructDeclNative structDecl;

        private $event_hierarchy_native() {
            this.$lock = Lisp.NIL;
            this.$graph = Lisp.NIL;
            this.$properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return this.$graph;
        }

        @Override
        public SubLObject getField4() {
            return this.$properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$graph = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$properties = value;
        }

        static {
            structDecl = makeStructDeclNative($event_hierarchy_native.class, EVENT_HIERARCHY, EVENT_HIERARCHY_P, $list35, $list36, new String[]{ "$lock", "$graph", "$properties" }, $list37, $list38, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $event_hierarchy_p$UnaryFunction extends UnaryFunction {
        public $event_hierarchy_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-HIERARCHY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_hierarchy_p(arg1);
        }
    }

    public static final class $event_native extends SubLStructNative {
        public SubLObject $class;

        public SubLObject $timestamp;

        public SubLObject $source;

        public SubLObject $message;

        private static final SubLStructDeclNative structDecl;

        private $event_native() {
            this.$class = Lisp.NIL;
            this.$timestamp = Lisp.NIL;
            this.$source = Lisp.NIL;
            this.$message = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$class;
        }

        @Override
        public SubLObject getField3() {
            return this.$timestamp;
        }

        @Override
        public SubLObject getField4() {
            return this.$source;
        }

        @Override
        public SubLObject getField5() {
            return this.$message;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$class = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$timestamp = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$source = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$message = value;
        }

        static {
            structDecl = makeStructDeclNative($event_native.class, EVENT, EVENT_P, $list118, $list119, new String[]{ "$class", "$timestamp", "$source", "$message" }, $list120, $list121, PRINT_EVENT);
        }
    }

    public static final class $event_p$UnaryFunction extends UnaryFunction {
        public $event_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_p(arg1);
        }
    }
}

/**
 * Total time: 232 ms
 */
