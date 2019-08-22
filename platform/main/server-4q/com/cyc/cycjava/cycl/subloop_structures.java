package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.generate_instance_variable_bindings_for_structure_slots;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_structures extends SubLTranslatedFile {
    public static final SubLFile me = new subloop_structures();

    public static final String myName = "com.cyc.cycjava.cycl.subloop_structures";

    public static final String myFingerPrint = "f04f0b8e7475cdf199586418a2765ffe66dda06b089d44ab98ff1dc678fa508e";

    // defconstant
    public static final SubLSymbol $dtp_class$ = makeSymbol("*DTP-CLASS*");

    // defconstant
    public static final SubLSymbol $dtp_instance$ = makeSymbol("*DTP-INSTANCE*");

    // defconstant
    public static final SubLSymbol $dtp_interface$ = makeSymbol("*DTP-INTERFACE*");

    // defconstant
    public static final SubLSymbol $dtp_method$ = makeSymbol("*DTP-METHOD*");

    // defconstant
    private static final SubLSymbol $methods_initial_hashtable_size$ = makeSymbol("*METHODS-INITIAL-HASHTABLE-SIZE*");

    // defvar
    public static final SubLSymbol $method_trace_on$ = makeSymbol("*METHOD-TRACE-ON*");

    // defparameter
    public static final SubLSymbol $methods_current_method_trace$ = makeSymbol("*METHODS-CURRENT-METHOD-TRACE*");

    // defconstant
    public static final SubLSymbol $dtp_method_trace$ = makeSymbol("*DTP-METHOD-TRACE*");

    // defconstant
    public static final SubLSymbol $dtp_method_info$ = makeSymbol("*DTP-METHOD-INFO*");

    // defconstant
    public static final SubLSymbol $dtp_slot_listener$ = makeSymbol("*DTP-SLOT-LISTENER*");

    // defconstant
    public static final SubLSymbol $dtp_slot_listener_registry$ = makeSymbol("*DTP-SLOT-LISTENER-REGISTRY*");

    // defconstant
    public static final SubLSymbol $dtp_method_listener$ = makeSymbol("*DTP-METHOD-LISTENER*");

    // defconstant
    public static final SubLSymbol $dtp_function_detail$ = makeSymbol("*DTP-FUNCTION-DETAIL*");

    // defconstant
    public static final SubLSymbol $dtp_method_detail$ = makeSymbol("*DTP-METHOD-DETAIL*");

    // defconstant
    public static final SubLSymbol $dtp_method_listener_registry$ = makeSymbol("*DTP-METHOD-LISTENER-REGISTRY*");





    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("PARENT"), makeSymbol("SUBCLASSES"), makeSymbol("INTERFACE-NAMES"), makeSymbol("INTERFACES"), makeSymbol("COMPILED-INHERITANCE-PATH"), makeSymbol("INSTANCE-VAR-DECLS"), makeSymbol("CLASS-VAR-DECLS"), makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("SLOT-ACCESSOR-ALIST"), makeSymbol("INSTANCE-METHOD-DECLS"), makeSymbol("CLASS-METHOD-DECLS"), makeSymbol("BOOLEAN-SLOTS"), makeSymbol("ANY-SLOTS"), makeSymbol("COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("TABLIFIED-INSTANCE-METHODS"), makeSymbol("DEFINITION-LOCK"), makeSymbol("ACCESS-LOCK"), makeSymbol("SYNCHRONIZED-SLOTS-P"), makeSymbol("PLIST"), makeSymbol("CLASS-INITIALIZATION-FUNCTION"), makeSymbol("CLASS-INITIALIZED-P"), makeSymbol("INSTANCE-INITIALIZATION-FUNCTION"), makeSymbol("CLASS-PROPERTIES") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("NAME"), makeKeyword("PARENT"), makeKeyword("SUBCLASSES"), makeKeyword("INTERFACE-NAMES"), makeKeyword("INTERFACES"), makeKeyword("COMPILED-INHERITANCE-PATH"), makeKeyword("INSTANCE-VAR-DECLS"), makeKeyword("CLASS-VAR-DECLS"), makeKeyword("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeKeyword("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), makeKeyword("COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeKeyword("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), makeKeyword("SLOT-ACCESSOR-ALIST"), makeKeyword("INSTANCE-METHOD-DECLS"), makeKeyword("CLASS-METHOD-DECLS"), makeKeyword("BOOLEAN-SLOTS"), makeKeyword("ANY-SLOTS"), makeKeyword("COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeKeyword("COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeKeyword("TABLIFIED-INSTANCE-METHODS"), makeKeyword("DEFINITION-LOCK"), makeKeyword("ACCESS-LOCK"), makeKeyword("SYNCHRONIZED-SLOTS-P"), makeKeyword("PLIST"), makeKeyword("CLASS-INITIALIZATION-FUNCTION"), makeKeyword("CLASS-INITIALIZED-P"), makeKeyword("INSTANCE-INITIALIZATION-FUNCTION"), makeKeyword("CLASS-PROPERTIES") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("CLASS-NAME"), makeSymbol("CLASS-PARENT"), makeSymbol("CLASS-SUBCLASSES"), makeSymbol("CLASS-INTERFACE-NAMES"), makeSymbol("CLASS-INTERFACES"), makeSymbol("CLASS-COMPILED-INHERITANCE-PATH"), makeSymbol("CLASS-INSTANCE-VAR-DECLS"), makeSymbol("CLASS-CLASS-VAR-DECLS"), makeSymbol("CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeSymbol("CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("CLASS-SLOT-ACCESSOR-ALIST"), makeSymbol("CLASS-INSTANCE-METHOD-DECLS"), makeSymbol("CLASS-CLASS-METHOD-DECLS"), makeSymbol("CLASS-BOOLEAN-SLOTS"), makeSymbol("CLASS-ANY-SLOTS"), makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS"), makeSymbol("CLASS-DEFINITION-LOCK"), makeSymbol("CLASS-ACCESS-LOCK"), makeSymbol("CLASS-SYNCHRONIZED-SLOTS-P"), makeSymbol("CLASS-PLIST"), makeSymbol("CLASS-CLASS-INITIALIZATION-FUNCTION"), makeSymbol("CLASS-CLASS-INITIALIZED-P"), makeSymbol("CLASS-INSTANCE-INITIALIZATION-FUNCTION"), makeSymbol("CLASS-CLASS-PROPERTIES") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-CLASS-NAME", "SUBLISP"), makeSymbol("_CSETF-CLASS-PARENT"), makeSymbol("_CSETF-CLASS-SUBCLASSES"), makeSymbol("_CSETF-CLASS-INTERFACE-NAMES"), makeSymbol("_CSETF-CLASS-INTERFACES"), makeSymbol("_CSETF-CLASS-COMPILED-INHERITANCE-PATH"), makeSymbol("_CSETF-CLASS-INSTANCE-VAR-DECLS"), makeSymbol("_CSETF-CLASS-CLASS-VAR-DECLS"), makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeSymbol("_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("_CSETF-CLASS-SLOT-ACCESSOR-ALIST"), makeSymbol("_CSETF-CLASS-INSTANCE-METHOD-DECLS"), makeSymbol("_CSETF-CLASS-CLASS-METHOD-DECLS"), makeSymbol("_CSETF-CLASS-BOOLEAN-SLOTS"), makeSymbol("_CSETF-CLASS-ANY-SLOTS"), makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS"), makeSymbol("_CSETF-CLASS-DEFINITION-LOCK"), makeSymbol("_CSETF-CLASS-ACCESS-LOCK"), makeSymbol("_CSETF-CLASS-SYNCHRONIZED-SLOTS-P"), makeSymbol("_CSETF-CLASS-PLIST"), makeSymbol("_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION"), makeSymbol("_CSETF-CLASS-CLASS-INITIALIZED-P"), makeSymbol("_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION"), makeSymbol("_CSETF-CLASS-CLASS-PROPERTIES") });

    public static final SubLSymbol PRINT_CLASS = makeSymbol("PRINT-CLASS");

    private static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLInteger $int$22 = makeInteger(22);

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLInteger $int$28 = makeInteger(28);

    private static final SubLInteger $int$29 = makeInteger(29);

    public static final SubLSymbol CLASS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CLASS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list17 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CLASS-P"));



    private static final SubLSymbol _CSETF_CLASS_NAME = makeSymbol("_CSETF-CLASS-NAME", "SUBLISP");

    private static final SubLSymbol CLASS_PARENT = makeSymbol("CLASS-PARENT");

    private static final SubLSymbol _CSETF_CLASS_PARENT = makeSymbol("_CSETF-CLASS-PARENT");

    private static final SubLSymbol CLASS_SUBCLASSES = makeSymbol("CLASS-SUBCLASSES");

    private static final SubLSymbol _CSETF_CLASS_SUBCLASSES = makeSymbol("_CSETF-CLASS-SUBCLASSES");

    private static final SubLSymbol CLASS_INTERFACE_NAMES = makeSymbol("CLASS-INTERFACE-NAMES");

    private static final SubLSymbol _CSETF_CLASS_INTERFACE_NAMES = makeSymbol("_CSETF-CLASS-INTERFACE-NAMES");

    private static final SubLSymbol CLASS_INTERFACES = makeSymbol("CLASS-INTERFACES");

    private static final SubLSymbol _CSETF_CLASS_INTERFACES = makeSymbol("_CSETF-CLASS-INTERFACES");

    private static final SubLSymbol CLASS_COMPILED_INHERITANCE_PATH = makeSymbol("CLASS-COMPILED-INHERITANCE-PATH");

    private static final SubLSymbol _CSETF_CLASS_COMPILED_INHERITANCE_PATH = makeSymbol("_CSETF-CLASS-COMPILED-INHERITANCE-PATH");

    private static final SubLSymbol CLASS_INSTANCE_VAR_DECLS = makeSymbol("CLASS-INSTANCE-VAR-DECLS");

    private static final SubLSymbol _CSETF_CLASS_INSTANCE_VAR_DECLS = makeSymbol("_CSETF-CLASS-INSTANCE-VAR-DECLS");

    private static final SubLSymbol CLASS_CLASS_VAR_DECLS = makeSymbol("CLASS-CLASS-VAR-DECLS");

    private static final SubLSymbol _CSETF_CLASS_CLASS_VAR_DECLS = makeSymbol("_CSETF-CLASS-CLASS-VAR-DECLS");

    private static final SubLSymbol CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST = makeSymbol("CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST");

    private static final SubLSymbol _CSETF_CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST = makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST");

    private static final SubLSymbol CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST");

    private static final SubLSymbol _CSETF_CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST");

    private static final SubLSymbol CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST = makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST");

    private static final SubLSymbol _CSETF_CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST = makeSymbol("_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST");

    private static final SubLSymbol CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol("CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST");

    private static final SubLSymbol _CSETF_CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol("_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST");

    private static final SubLSymbol CLASS_SLOT_ACCESSOR_ALIST = makeSymbol("CLASS-SLOT-ACCESSOR-ALIST");

    private static final SubLSymbol _CSETF_CLASS_SLOT_ACCESSOR_ALIST = makeSymbol("_CSETF-CLASS-SLOT-ACCESSOR-ALIST");

    private static final SubLSymbol CLASS_INSTANCE_METHOD_DECLS = makeSymbol("CLASS-INSTANCE-METHOD-DECLS");

    private static final SubLSymbol _CSETF_CLASS_INSTANCE_METHOD_DECLS = makeSymbol("_CSETF-CLASS-INSTANCE-METHOD-DECLS");

    private static final SubLSymbol CLASS_CLASS_METHOD_DECLS = makeSymbol("CLASS-CLASS-METHOD-DECLS");

    private static final SubLSymbol _CSETF_CLASS_CLASS_METHOD_DECLS = makeSymbol("_CSETF-CLASS-CLASS-METHOD-DECLS");

    private static final SubLSymbol CLASS_BOOLEAN_SLOTS = makeSymbol("CLASS-BOOLEAN-SLOTS");

    private static final SubLSymbol _CSETF_CLASS_BOOLEAN_SLOTS = makeSymbol("_CSETF-CLASS-BOOLEAN-SLOTS");

    private static final SubLSymbol CLASS_ANY_SLOTS = makeSymbol("CLASS-ANY-SLOTS");

    private static final SubLSymbol _CSETF_CLASS_ANY_SLOTS = makeSymbol("_CSETF-CLASS-ANY-SLOTS");

    private static final SubLSymbol CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST = makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST");

    private static final SubLSymbol _CSETF_CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST = makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST");

    private static final SubLSymbol CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST = makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST");

    private static final SubLSymbol _CSETF_CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST = makeSymbol("_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST");

    private static final SubLSymbol CLASS_TABLIFIED_INSTANCE_METHODS = makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS");

    private static final SubLSymbol _CSETF_CLASS_TABLIFIED_INSTANCE_METHODS = makeSymbol("_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS");

    private static final SubLSymbol CLASS_DEFINITION_LOCK = makeSymbol("CLASS-DEFINITION-LOCK");

    private static final SubLSymbol _CSETF_CLASS_DEFINITION_LOCK = makeSymbol("_CSETF-CLASS-DEFINITION-LOCK");

    private static final SubLSymbol CLASS_ACCESS_LOCK = makeSymbol("CLASS-ACCESS-LOCK");

    private static final SubLSymbol _CSETF_CLASS_ACCESS_LOCK = makeSymbol("_CSETF-CLASS-ACCESS-LOCK");

    private static final SubLSymbol CLASS_SYNCHRONIZED_SLOTS_P = makeSymbol("CLASS-SYNCHRONIZED-SLOTS-P");

    private static final SubLSymbol _CSETF_CLASS_SYNCHRONIZED_SLOTS_P = makeSymbol("_CSETF-CLASS-SYNCHRONIZED-SLOTS-P");

    private static final SubLSymbol CLASS_PLIST = makeSymbol("CLASS-PLIST");

    private static final SubLSymbol _CSETF_CLASS_PLIST = makeSymbol("_CSETF-CLASS-PLIST");

    private static final SubLSymbol CLASS_CLASS_INITIALIZATION_FUNCTION = makeSymbol("CLASS-CLASS-INITIALIZATION-FUNCTION");

    private static final SubLSymbol _CSETF_CLASS_CLASS_INITIALIZATION_FUNCTION = makeSymbol("_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION");

    private static final SubLSymbol CLASS_CLASS_INITIALIZED_P = makeSymbol("CLASS-CLASS-INITIALIZED-P");

    private static final SubLSymbol _CSETF_CLASS_CLASS_INITIALIZED_P = makeSymbol("_CSETF-CLASS-CLASS-INITIALIZED-P");

    private static final SubLSymbol CLASS_INSTANCE_INITIALIZATION_FUNCTION = makeSymbol("CLASS-INSTANCE-INITIALIZATION-FUNCTION");

    private static final SubLSymbol _CSETF_CLASS_INSTANCE_INITIALIZATION_FUNCTION = makeSymbol("_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION");

    private static final SubLSymbol CLASS_CLASS_PROPERTIES = makeSymbol("CLASS-CLASS-PROPERTIES");

    private static final SubLSymbol _CSETF_CLASS_CLASS_PROPERTIES = makeSymbol("_CSETF-CLASS-CLASS-PROPERTIES");











    private static final SubLSymbol $COMPILED_INHERITANCE_PATH = makeKeyword("COMPILED-INHERITANCE-PATH");

    private static final SubLSymbol $INSTANCE_VAR_DECLS = makeKeyword("INSTANCE-VAR-DECLS");

    private static final SubLSymbol $CLASS_VAR_DECLS = makeKeyword("CLASS-VAR-DECLS");

    private static final SubLSymbol $COMPILED_INSTANCE_SLOT_ACCESS_ALIST = makeKeyword("COMPILED-INSTANCE-SLOT-ACCESS-ALIST");

    private static final SubLSymbol $COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = makeKeyword("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST");

    private static final SubLSymbol $COMPILED_CLASS_SLOT_ACCESS_ALIST = makeKeyword("COMPILED-CLASS-SLOT-ACCESS-ALIST");

    private static final SubLSymbol $COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = makeKeyword("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST");

    private static final SubLSymbol $SLOT_ACCESSOR_ALIST = makeKeyword("SLOT-ACCESSOR-ALIST");

    private static final SubLSymbol $INSTANCE_METHOD_DECLS = makeKeyword("INSTANCE-METHOD-DECLS");

    private static final SubLSymbol $CLASS_METHOD_DECLS = makeKeyword("CLASS-METHOD-DECLS");





    private static final SubLSymbol $COMPILED_INSTANCE_METHOD_ACCESS_ALIST = makeKeyword("COMPILED-INSTANCE-METHOD-ACCESS-ALIST");

    private static final SubLSymbol $COMPILED_CLASS_METHOD_ACCESS_ALIST = makeKeyword("COMPILED-CLASS-METHOD-ACCESS-ALIST");

    private static final SubLSymbol $TABLIFIED_INSTANCE_METHODS = makeKeyword("TABLIFIED-INSTANCE-METHODS");





    private static final SubLSymbol $SYNCHRONIZED_SLOTS_P = makeKeyword("SYNCHRONIZED-SLOTS-P");



    private static final SubLSymbol $CLASS_INITIALIZATION_FUNCTION = makeKeyword("CLASS-INITIALIZATION-FUNCTION");

    private static final SubLSymbol $CLASS_INITIALIZED_P = makeKeyword("CLASS-INITIALIZED-P");

    private static final SubLSymbol $INSTANCE_INITIALIZATION_FUNCTION = makeKeyword("INSTANCE-INITIALIZATION-FUNCTION");



    private static final SubLString $str102$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CLASS = makeSymbol("MAKE-CLASS");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CLASS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CLASS-METHOD");

    private static final SubLList $list108 = list(makeSymbol("CLASS"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $$$class = makeString("class");

    private static final SubLSymbol CLASS_ = makeSymbol("CLASS-");

    private static final SubLList $list111 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("PARENT"), makeSymbol("SUBCLASSES"), makeSymbol("INTERFACE-NAMES"), makeSymbol("INTERFACES"), makeSymbol("COMPILED-INHERITANCE-PATH"), makeSymbol("INSTANCE-VAR-DECLS"), makeSymbol("CLASS-VAR-DECLS"), makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), makeSymbol("SLOT-ACCESSOR-ALIST"), makeSymbol("INSTANCE-METHOD-DECLS"), makeSymbol("CLASS-METHOD-DECLS"), makeSymbol("BOOLEAN-SLOTS"), makeSymbol("ANY-SLOTS"), makeSymbol("COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("TABLIFIED-INSTANCE-METHODS"), makeSymbol("CLASS-INITIALIZATION-FUNCTION"), makeSymbol("INSTANCE-INITIALIZATION-FUNCTION") });

    private static final SubLString $str112$__CLASS__S_ = makeString("#<CLASS:~S>");

    public static final SubLList $list113 = list(makeSymbol("PROPERTY-NAME"), makeSymbol("OFFSET"));

    private static final SubLString $str114$SUBLOOP_CLASS_PROPERTY_ = makeString("SUBLOOP-CLASS-PROPERTY-");

    private static final SubLString $str115$GET_ = makeString("GET-");

    private static final SubLString $str116$SET_ = makeString("SET-");





    private static final SubLList $list119 = list(makeSymbol("CLASS-STRUCTURE"));



    private static final SubLSymbol LDB_TEST = makeSymbol("LDB-TEST");

    private static final SubLSymbol BYTE = makeSymbol("BYTE");

    public static final SubLList $list123 = list(list(makeSymbol("CLASS-CLASS-PROPERTIES"), makeSymbol("CLASS-STRUCTURE")));

    private static final SubLList $list124 = list(makeSymbol("CLASS-STRUCTURE"), makeSymbol("NEW-VALUE"));



    public static final SubLList $list126 = list(makeSymbol("CLASS-CLASS-PROPERTIES"), makeSymbol("CLASS-STRUCTURE"));

    private static final SubLSymbol DPB = makeSymbol("DPB");

    public static final SubLList $list128 = list(makeSymbol("FIF"), makeSymbol("NEW-VALUE"), ONE_INTEGER, ZERO_INTEGER);

    public static final SubLList $list129 = list(list(makeSymbol("RET"), makeSymbol("NEW-VALUE")));





    private static final SubLList $list132 = list(makeSymbol("CLASS"), makeSymbol("BOOLEAN-SLOTS"), makeSymbol("ANY-SLOTS"), makeSymbol("PLIST"));

    private static final SubLList $list133 = list(makeKeyword("CLASS"), makeKeyword("BOOLEAN-SLOTS"), makeKeyword("ANY-SLOTS"), makeKeyword("PLIST"));

    private static final SubLList $list134 = list(makeSymbol("INSTANCE-CLASS"), makeSymbol("INSTANCE-BOOLEAN-SLOTS"), makeSymbol("INSTANCE-ANY-SLOTS"), makeSymbol("INSTANCE-PLIST"));

    private static final SubLList $list135 = list(makeSymbol("_CSETF-INSTANCE-CLASS"), makeSymbol("_CSETF-INSTANCE-BOOLEAN-SLOTS"), makeSymbol("_CSETF-INSTANCE-ANY-SLOTS"), makeSymbol("_CSETF-INSTANCE-PLIST"));

    private static final SubLSymbol PRINT_INSTANCE = makeSymbol("PRINT-INSTANCE");

    private static final SubLSymbol INSTANCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INSTANCE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list138 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INSTANCE-P"));



    private static final SubLSymbol _CSETF_INSTANCE_CLASS = makeSymbol("_CSETF-INSTANCE-CLASS");

    private static final SubLSymbol INSTANCE_BOOLEAN_SLOTS = makeSymbol("INSTANCE-BOOLEAN-SLOTS");

    private static final SubLSymbol _CSETF_INSTANCE_BOOLEAN_SLOTS = makeSymbol("_CSETF-INSTANCE-BOOLEAN-SLOTS");

    private static final SubLSymbol INSTANCE_ANY_SLOTS = makeSymbol("INSTANCE-ANY-SLOTS");

    private static final SubLSymbol _CSETF_INSTANCE_ANY_SLOTS = makeSymbol("_CSETF-INSTANCE-ANY-SLOTS");

    private static final SubLSymbol INSTANCE_PLIST = makeSymbol("INSTANCE-PLIST");

    private static final SubLSymbol _CSETF_INSTANCE_PLIST = makeSymbol("_CSETF-INSTANCE-PLIST");



    private static final SubLSymbol MAKE_INSTANCE = makeSymbol("MAKE-INSTANCE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INSTANCE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INSTANCE-METHOD");

    public static final SubLList $list150 = list(makeSymbol("INSTANCE"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $$$instance = makeString("instance");

    private static final SubLSymbol INSTANCE_ = makeSymbol("INSTANCE-");





    private static final SubLString $str155$__Instance_of__S_ = makeString("#<Instance of ~S>");



    private static final SubLSymbol INTERFACE_P = makeSymbol("INTERFACE-P");

    private static final SubLList $list158 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("PARENTS"), makeSymbol("COMPILED-INHERITANCE-PATH"), makeSymbol("SUBINTERFACES"), makeSymbol("IMPLEMENTERS"), makeSymbol("INSTANCE-METHOD-DECLS"), makeSymbol("CLASS-METHOD-DECLS"), makeSymbol("COMPILED-INSTANCE-METHOD-DECLS"), makeSymbol("COMPILED-CLASS-METHOD-DECLS"), makeSymbol("LOCAL-CLASS-METHODS"), makeSymbol("LOCAL-INSTANCE-METHODS"), makeSymbol("MARK-LIST"), makeSymbol("PLIST"), makeSymbol("DEFINITION-LOCK") });

    private static final SubLList $list159 = list(new SubLObject[]{ makeKeyword("NAME"), makeKeyword("PARENTS"), makeKeyword("COMPILED-INHERITANCE-PATH"), makeKeyword("SUBINTERFACES"), makeKeyword("IMPLEMENTERS"), makeKeyword("INSTANCE-METHOD-DECLS"), makeKeyword("CLASS-METHOD-DECLS"), makeKeyword("COMPILED-INSTANCE-METHOD-DECLS"), makeKeyword("COMPILED-CLASS-METHOD-DECLS"), makeKeyword("LOCAL-CLASS-METHODS"), makeKeyword("LOCAL-INSTANCE-METHODS"), makeKeyword("MARK-LIST"), makeKeyword("PLIST"), makeKeyword("DEFINITION-LOCK") });

    private static final SubLList $list160 = list(new SubLObject[]{ makeSymbol("INTERFACE-NAME"), makeSymbol("INTERFACE-PARENTS"), makeSymbol("INTERFACE-COMPILED-INHERITANCE-PATH"), makeSymbol("INTERFACE-SUBINTERFACES"), makeSymbol("INTERFACE-IMPLEMENTERS"), makeSymbol("INTERFACE-INSTANCE-METHOD-DECLS"), makeSymbol("INTERFACE-CLASS-METHOD-DECLS"), makeSymbol("INTERFACE-COMPILED-INSTANCE-METHOD-DECLS"), makeSymbol("INTERFACE-COMPILED-CLASS-METHOD-DECLS"), makeSymbol("INTERFACE-LOCAL-CLASS-METHODS"), makeSymbol("INTERFACE-LOCAL-INSTANCE-METHODS"), makeSymbol("INTERFACE-MARK-LIST"), makeSymbol("INTERFACE-PLIST"), makeSymbol("INTERFACE-DEFINITION-LOCK") });

    private static final SubLList $list161 = list(new SubLObject[]{ makeSymbol("_CSETF-INTERFACE-NAME"), makeSymbol("_CSETF-INTERFACE-PARENTS"), makeSymbol("_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH"), makeSymbol("_CSETF-INTERFACE-SUBINTERFACES"), makeSymbol("_CSETF-INTERFACE-IMPLEMENTERS"), makeSymbol("_CSETF-INTERFACE-INSTANCE-METHOD-DECLS"), makeSymbol("_CSETF-INTERFACE-CLASS-METHOD-DECLS"), makeSymbol("_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS"), makeSymbol("_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS"), makeSymbol("_CSETF-INTERFACE-LOCAL-CLASS-METHODS"), makeSymbol("_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS"), makeSymbol("_CSETF-INTERFACE-MARK-LIST"), makeSymbol("_CSETF-INTERFACE-PLIST"), makeSymbol("_CSETF-INTERFACE-DEFINITION-LOCK") });

    private static final SubLSymbol PRINT_INTERFACE = makeSymbol("PRINT-INTERFACE");

    private static final SubLSymbol INTERFACE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INTERFACE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list164 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INTERFACE-P"));



    private static final SubLSymbol _CSETF_INTERFACE_NAME = makeSymbol("_CSETF-INTERFACE-NAME");

    private static final SubLSymbol INTERFACE_PARENTS = makeSymbol("INTERFACE-PARENTS");

    private static final SubLSymbol _CSETF_INTERFACE_PARENTS = makeSymbol("_CSETF-INTERFACE-PARENTS");

    private static final SubLSymbol INTERFACE_COMPILED_INHERITANCE_PATH = makeSymbol("INTERFACE-COMPILED-INHERITANCE-PATH");

    private static final SubLSymbol _CSETF_INTERFACE_COMPILED_INHERITANCE_PATH = makeSymbol("_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH");

    private static final SubLSymbol INTERFACE_SUBINTERFACES = makeSymbol("INTERFACE-SUBINTERFACES");

    private static final SubLSymbol _CSETF_INTERFACE_SUBINTERFACES = makeSymbol("_CSETF-INTERFACE-SUBINTERFACES");

    private static final SubLSymbol INTERFACE_IMPLEMENTERS = makeSymbol("INTERFACE-IMPLEMENTERS");

    private static final SubLSymbol _CSETF_INTERFACE_IMPLEMENTERS = makeSymbol("_CSETF-INTERFACE-IMPLEMENTERS");

    private static final SubLSymbol INTERFACE_INSTANCE_METHOD_DECLS = makeSymbol("INTERFACE-INSTANCE-METHOD-DECLS");

    private static final SubLSymbol _CSETF_INTERFACE_INSTANCE_METHOD_DECLS = makeSymbol("_CSETF-INTERFACE-INSTANCE-METHOD-DECLS");

    private static final SubLSymbol INTERFACE_CLASS_METHOD_DECLS = makeSymbol("INTERFACE-CLASS-METHOD-DECLS");

    private static final SubLSymbol _CSETF_INTERFACE_CLASS_METHOD_DECLS = makeSymbol("_CSETF-INTERFACE-CLASS-METHOD-DECLS");

    private static final SubLSymbol INTERFACE_COMPILED_INSTANCE_METHOD_DECLS = makeSymbol("INTERFACE-COMPILED-INSTANCE-METHOD-DECLS");

    private static final SubLSymbol _CSETF_INTERFACE_COMPILED_INSTANCE_METHOD_DECLS = makeSymbol("_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS");

    private static final SubLSymbol INTERFACE_COMPILED_CLASS_METHOD_DECLS = makeSymbol("INTERFACE-COMPILED-CLASS-METHOD-DECLS");

    private static final SubLSymbol _CSETF_INTERFACE_COMPILED_CLASS_METHOD_DECLS = makeSymbol("_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS");

    private static final SubLSymbol INTERFACE_LOCAL_CLASS_METHODS = makeSymbol("INTERFACE-LOCAL-CLASS-METHODS");

    private static final SubLSymbol _CSETF_INTERFACE_LOCAL_CLASS_METHODS = makeSymbol("_CSETF-INTERFACE-LOCAL-CLASS-METHODS");

    private static final SubLSymbol INTERFACE_LOCAL_INSTANCE_METHODS = makeSymbol("INTERFACE-LOCAL-INSTANCE-METHODS");

    private static final SubLSymbol _CSETF_INTERFACE_LOCAL_INSTANCE_METHODS = makeSymbol("_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS");

    private static final SubLSymbol INTERFACE_MARK_LIST = makeSymbol("INTERFACE-MARK-LIST");

    private static final SubLSymbol _CSETF_INTERFACE_MARK_LIST = makeSymbol("_CSETF-INTERFACE-MARK-LIST");

    private static final SubLSymbol INTERFACE_PLIST = makeSymbol("INTERFACE-PLIST");

    private static final SubLSymbol _CSETF_INTERFACE_PLIST = makeSymbol("_CSETF-INTERFACE-PLIST");

    private static final SubLSymbol INTERFACE_DEFINITION_LOCK = makeSymbol("INTERFACE-DEFINITION-LOCK");

    private static final SubLSymbol _CSETF_INTERFACE_DEFINITION_LOCK = makeSymbol("_CSETF-INTERFACE-DEFINITION-LOCK");







    private static final SubLSymbol $COMPILED_INSTANCE_METHOD_DECLS = makeKeyword("COMPILED-INSTANCE-METHOD-DECLS");

    private static final SubLSymbol $COMPILED_CLASS_METHOD_DECLS = makeKeyword("COMPILED-CLASS-METHOD-DECLS");

    private static final SubLSymbol $LOCAL_CLASS_METHODS = makeKeyword("LOCAL-CLASS-METHODS");

    private static final SubLSymbol $LOCAL_INSTANCE_METHODS = makeKeyword("LOCAL-INSTANCE-METHODS");



    private static final SubLSymbol MAKE_INTERFACE = makeSymbol("MAKE-INTERFACE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INTERFACE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTERFACE-METHOD");

    private static final SubLList $list203 = list(makeSymbol("INTERFACE"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $$$interface = makeString("interface");

    private static final SubLSymbol INTERFACE_ = makeSymbol("INTERFACE-");

    private static final SubLList $list206 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("PARENTS"), makeSymbol("COMPILED-INHERITANCE-PATH"), makeSymbol("SUBINTERFACES"), makeSymbol("IMPLEMENTERS"), makeSymbol("INSTANCE-METHOD-DECLS"), makeSymbol("CLASS-METHOD-DECLS"), makeSymbol("COMPILED-INSTANCE-METHOD-DECLS"), makeSymbol("COMPILED-CLASS-METHOD-DECLS"), makeSymbol("LOCAL-CLASS-METHODS"), makeSymbol("LOCAL-INSTANCE-METHODS") });

    private static final SubLString $str207$__Interface__S_PARENTS___S_ = makeString("#<Interface:~S PARENTS: ~S>");



    private static final SubLSymbol METHOD_P = makeSymbol("METHOD-P");

    private static final SubLList $list210 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("CLASS-NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("BODY"), makeSymbol("PROTECTION"), makeSymbol("SCOPE"), makeSymbol("UPDATE-TYPE"), makeSymbol("FUNCTION-NAME"), makeSymbol("FUNCTION-DEF"), makeSymbol("BEFORE-LISTENERS"), makeSymbol("AFTER-LISTENERS"), makeSymbol("INSTANTIATE-TEMPLATE") });

    private static final SubLList $list211 = list(new SubLObject[]{ makeKeyword("NAME"), makeKeyword("CLASS-NAME"), makeKeyword("LAMBDA-LIST"), makeKeyword("BODY"), makeKeyword("PROTECTION"), makeKeyword("SCOPE"), makeKeyword("UPDATE-TYPE"), makeKeyword("FUNCTION-NAME"), makeKeyword("FUNCTION-DEF"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("INSTANTIATE-TEMPLATE") });

    private static final SubLList $list212 = list(new SubLObject[]{ makeSymbol("METHOD-NAME"), makeSymbol("METHOD-CLASS-NAME"), makeSymbol("METHOD-LAMBDA-LIST"), makeSymbol("METHOD-BODY"), makeSymbol("METHOD-PROTECTION"), makeSymbol("METHOD-SCOPE"), makeSymbol("METHOD-UPDATE-TYPE"), makeSymbol("METHOD-FUNCTION-NAME"), makeSymbol("METHOD-FUNCTION-DEF"), makeSymbol("METHOD-BEFORE-LISTENERS"), makeSymbol("METHOD-AFTER-LISTENERS"), makeSymbol("METHOD-INSTANTIATE-TEMPLATE") });

    private static final SubLList $list213 = list(new SubLObject[]{ makeSymbol("_CSETF-METHOD-NAME"), makeSymbol("_CSETF-METHOD-CLASS-NAME"), makeSymbol("_CSETF-METHOD-LAMBDA-LIST"), makeSymbol("_CSETF-METHOD-BODY"), makeSymbol("_CSETF-METHOD-PROTECTION"), makeSymbol("_CSETF-METHOD-SCOPE"), makeSymbol("_CSETF-METHOD-UPDATE-TYPE"), makeSymbol("_CSETF-METHOD-FUNCTION-NAME"), makeSymbol("_CSETF-METHOD-FUNCTION-DEF"), makeSymbol("_CSETF-METHOD-BEFORE-LISTENERS"), makeSymbol("_CSETF-METHOD-AFTER-LISTENERS"), makeSymbol("_CSETF-METHOD-INSTANTIATE-TEMPLATE") });

    private static final SubLSymbol PRINT_METHOD = makeSymbol("PRINT-METHOD");

    private static final SubLSymbol METHOD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("METHOD-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list216 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("METHOD-P"));



    private static final SubLSymbol _CSETF_METHOD_NAME = makeSymbol("_CSETF-METHOD-NAME");

    private static final SubLSymbol METHOD_CLASS_NAME = makeSymbol("METHOD-CLASS-NAME");

    private static final SubLSymbol _CSETF_METHOD_CLASS_NAME = makeSymbol("_CSETF-METHOD-CLASS-NAME");

    private static final SubLSymbol METHOD_LAMBDA_LIST = makeSymbol("METHOD-LAMBDA-LIST");

    private static final SubLSymbol _CSETF_METHOD_LAMBDA_LIST = makeSymbol("_CSETF-METHOD-LAMBDA-LIST");

    private static final SubLSymbol METHOD_BODY = makeSymbol("METHOD-BODY");

    private static final SubLSymbol _CSETF_METHOD_BODY = makeSymbol("_CSETF-METHOD-BODY");

    private static final SubLSymbol METHOD_PROTECTION = makeSymbol("METHOD-PROTECTION");

    private static final SubLSymbol _CSETF_METHOD_PROTECTION = makeSymbol("_CSETF-METHOD-PROTECTION");

    private static final SubLSymbol METHOD_SCOPE = makeSymbol("METHOD-SCOPE");

    private static final SubLSymbol _CSETF_METHOD_SCOPE = makeSymbol("_CSETF-METHOD-SCOPE");

    private static final SubLSymbol METHOD_UPDATE_TYPE = makeSymbol("METHOD-UPDATE-TYPE");

    private static final SubLSymbol _CSETF_METHOD_UPDATE_TYPE = makeSymbol("_CSETF-METHOD-UPDATE-TYPE");

    private static final SubLSymbol METHOD_FUNCTION_NAME = makeSymbol("METHOD-FUNCTION-NAME");

    private static final SubLSymbol _CSETF_METHOD_FUNCTION_NAME = makeSymbol("_CSETF-METHOD-FUNCTION-NAME");

    private static final SubLSymbol METHOD_FUNCTION_DEF = makeSymbol("METHOD-FUNCTION-DEF");

    private static final SubLSymbol _CSETF_METHOD_FUNCTION_DEF = makeSymbol("_CSETF-METHOD-FUNCTION-DEF");

    private static final SubLSymbol METHOD_BEFORE_LISTENERS = makeSymbol("METHOD-BEFORE-LISTENERS");

    private static final SubLSymbol _CSETF_METHOD_BEFORE_LISTENERS = makeSymbol("_CSETF-METHOD-BEFORE-LISTENERS");

    private static final SubLSymbol METHOD_AFTER_LISTENERS = makeSymbol("METHOD-AFTER-LISTENERS");

    private static final SubLSymbol _CSETF_METHOD_AFTER_LISTENERS = makeSymbol("_CSETF-METHOD-AFTER-LISTENERS");

    private static final SubLSymbol METHOD_INSTANTIATE_TEMPLATE = makeSymbol("METHOD-INSTANTIATE-TEMPLATE");

    private static final SubLSymbol _CSETF_METHOD_INSTANTIATE_TEMPLATE = makeSymbol("_CSETF-METHOD-INSTANTIATE-TEMPLATE");























    private static final SubLSymbol MAKE_METHOD = makeSymbol("MAKE-METHOD");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_METHOD_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-METHOD");

    private static final SubLList $list254 = list(makeSymbol("METHOD"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $$$method = makeString("method");

    private static final SubLSymbol METHOD_ = makeSymbol("METHOD-");

    private static final SubLString $str257$__METHOD____S__S___S_ = makeString("#<METHOD: (~S ~S) ~S>");



    private static final SubLSymbol METHOD_TRACE = makeSymbol("METHOD-TRACE");

    private static final SubLSymbol METHOD_TRACE_P = makeSymbol("METHOD-TRACE-P");

    private static final SubLList $list261 = list(makeSymbol("NAME"), makeSymbol("CLASS-NAME"), makeSymbol("FUNCTION"), makeSymbol("OUTER"));

    public static final SubLList $list262 = list(makeKeyword("NAME"), makeKeyword("CLASS-NAME"), makeKeyword("FUNCTION"), makeKeyword("OUTER"));

    private static final SubLList $list263 = list(makeSymbol("METHOD-TRACE-NAME"), makeSymbol("METHOD-TRACE-CLASS-NAME"), makeSymbol("METHOD-TRACE-FUNCTION"), makeSymbol("METHOD-TRACE-OUTER"));

    private static final SubLList $list264 = list(makeSymbol("_CSETF-METHOD-TRACE-NAME"), makeSymbol("_CSETF-METHOD-TRACE-CLASS-NAME"), makeSymbol("_CSETF-METHOD-TRACE-FUNCTION"), makeSymbol("_CSETF-METHOD-TRACE-OUTER"));

    private static final SubLSymbol PRINT_METHOD_TRACE = makeSymbol("PRINT-METHOD-TRACE");

    private static final SubLSymbol METHOD_TRACE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("METHOD-TRACE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list267 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("METHOD-TRACE-P"));

    private static final SubLSymbol METHOD_TRACE_NAME = makeSymbol("METHOD-TRACE-NAME");

    private static final SubLSymbol _CSETF_METHOD_TRACE_NAME = makeSymbol("_CSETF-METHOD-TRACE-NAME");

    private static final SubLSymbol METHOD_TRACE_CLASS_NAME = makeSymbol("METHOD-TRACE-CLASS-NAME");

    private static final SubLSymbol _CSETF_METHOD_TRACE_CLASS_NAME = makeSymbol("_CSETF-METHOD-TRACE-CLASS-NAME");

    private static final SubLSymbol METHOD_TRACE_FUNCTION = makeSymbol("METHOD-TRACE-FUNCTION");

    private static final SubLSymbol _CSETF_METHOD_TRACE_FUNCTION = makeSymbol("_CSETF-METHOD-TRACE-FUNCTION");

    private static final SubLSymbol METHOD_TRACE_OUTER = makeSymbol("METHOD-TRACE-OUTER");

    private static final SubLSymbol _CSETF_METHOD_TRACE_OUTER = makeSymbol("_CSETF-METHOD-TRACE-OUTER");





    private static final SubLSymbol MAKE_METHOD_TRACE = makeSymbol("MAKE-METHOD-TRACE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_METHOD_TRACE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-TRACE-METHOD");

    private static final SubLList $list280 = list(makeSymbol("METHOD-TRACE"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $str281$method_trace = makeString("method-trace");

    private static final SubLSymbol METHOD_TRACE_ = makeSymbol("METHOD-TRACE-");

    private static final SubLString $str283$__METHOD_TRACE____S__S__ = makeString("#<METHOD-TRACE: (~S ~S)>");

    private static final SubLSymbol METHOD_INFO = makeSymbol("METHOD-INFO");

    private static final SubLSymbol METHOD_INFO_P = makeSymbol("METHOD-INFO-P");

    private static final SubLList $list286 = list(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME"), makeSymbol("MV-USED-IN-BODY"), makeSymbol("MV-MODIFIED-IN-BODY"), makeSymbol("METHODS-USED-IN-BODY"));

    private static final SubLList $list287 = list(makeKeyword("METHOD-NAME"), makeKeyword("CLASS-NAME"), makeKeyword("MV-USED-IN-BODY"), makeKeyword("MV-MODIFIED-IN-BODY"), makeKeyword("METHODS-USED-IN-BODY"));

    public static final SubLList $list288 = list(makeSymbol("MI-METHOD-NAME"), makeSymbol("MI-CLASS-NAME"), makeSymbol("MI-MV-USED-IN-BODY"), makeSymbol("MI-MV-MODIFIED-IN-BODY"), makeSymbol("MI-METHODS-USED-IN-BODY"));

    private static final SubLList $list289 = list(makeSymbol("_CSETF-MI-METHOD-NAME"), makeSymbol("_CSETF-MI-CLASS-NAME"), makeSymbol("_CSETF-MI-MV-USED-IN-BODY"), makeSymbol("_CSETF-MI-MV-MODIFIED-IN-BODY"), makeSymbol("_CSETF-MI-METHODS-USED-IN-BODY"));



    private static final SubLSymbol METHOD_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("METHOD-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list292 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("METHOD-INFO-P"));

    private static final SubLSymbol MI_METHOD_NAME = makeSymbol("MI-METHOD-NAME");

    private static final SubLSymbol _CSETF_MI_METHOD_NAME = makeSymbol("_CSETF-MI-METHOD-NAME");

    private static final SubLSymbol MI_CLASS_NAME = makeSymbol("MI-CLASS-NAME");

    private static final SubLSymbol _CSETF_MI_CLASS_NAME = makeSymbol("_CSETF-MI-CLASS-NAME");

    private static final SubLSymbol MI_MV_USED_IN_BODY = makeSymbol("MI-MV-USED-IN-BODY");

    private static final SubLSymbol _CSETF_MI_MV_USED_IN_BODY = makeSymbol("_CSETF-MI-MV-USED-IN-BODY");

    private static final SubLSymbol MI_MV_MODIFIED_IN_BODY = makeSymbol("MI-MV-MODIFIED-IN-BODY");

    private static final SubLSymbol _CSETF_MI_MV_MODIFIED_IN_BODY = makeSymbol("_CSETF-MI-MV-MODIFIED-IN-BODY");

    private static final SubLSymbol MI_METHODS_USED_IN_BODY = makeSymbol("MI-METHODS-USED-IN-BODY");

    private static final SubLSymbol _CSETF_MI_METHODS_USED_IN_BODY = makeSymbol("_CSETF-MI-METHODS-USED-IN-BODY");



    private static final SubLSymbol $MV_USED_IN_BODY = makeKeyword("MV-USED-IN-BODY");

    private static final SubLSymbol $MV_MODIFIED_IN_BODY = makeKeyword("MV-MODIFIED-IN-BODY");

    private static final SubLSymbol $METHODS_USED_IN_BODY = makeKeyword("METHODS-USED-IN-BODY");

    private static final SubLSymbol MAKE_METHOD_INFO = makeSymbol("MAKE-METHOD-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_METHOD_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-INFO-METHOD");

    private static final SubLList $list309 = list(makeSymbol("METHOD-INFO"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $str310$method_info = makeString("method-info");

    private static final SubLSymbol MI_ = makeSymbol("MI-");

    private static final SubLSymbol SLOT_LISTENER = makeSymbol("SLOT-LISTENER");

    private static final SubLSymbol SLOT_LISTENER_P = makeSymbol("SLOT-LISTENER-P");

    private static final SubLList $list314 = list(makeSymbol("SLOT-NAME"), makeSymbol("DEMON-TYPE"), makeSymbol("VALUE-TRIGGER"), makeSymbol("FUNCTIONAL-TYPE"), makeSymbol("ISA-METHOD"), makeSymbol("TARGET-INSTANCE"));

    private static final SubLList $list315 = list(makeKeyword("SLOT-NAME"), makeKeyword("DEMON-TYPE"), makeKeyword("VALUE-TRIGGER"), makeKeyword("FUNCTIONAL-TYPE"), makeKeyword("ISA-METHOD"), makeKeyword("TARGET-INSTANCE"));

    private static final SubLList $list316 = list(makeSymbol("SL-SLOT-NAME"), makeSymbol("SL-DEMON-TYPE"), makeSymbol("SL-VALUE-TRIGGER"), makeSymbol("SL-FUNCTIONAL-TYPE"), makeSymbol("SL-ISA-METHOD"), makeSymbol("SL-TARGET-INSTANCE"));

    private static final SubLList $list317 = list(makeSymbol("_CSETF-SL-SLOT-NAME"), makeSymbol("_CSETF-SL-DEMON-TYPE"), makeSymbol("_CSETF-SL-VALUE-TRIGGER"), makeSymbol("_CSETF-SL-FUNCTIONAL-TYPE"), makeSymbol("_CSETF-SL-ISA-METHOD"), makeSymbol("_CSETF-SL-TARGET-INSTANCE"));

    private static final SubLSymbol PRINT_SLOT_LISTENER = makeSymbol("PRINT-SLOT-LISTENER");

    private static final SubLSymbol SLOT_LISTENER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SLOT-LISTENER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list320 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SLOT-LISTENER-P"));

    private static final SubLSymbol SL_SLOT_NAME = makeSymbol("SL-SLOT-NAME");

    private static final SubLSymbol _CSETF_SL_SLOT_NAME = makeSymbol("_CSETF-SL-SLOT-NAME");

    private static final SubLSymbol SL_DEMON_TYPE = makeSymbol("SL-DEMON-TYPE");

    private static final SubLSymbol _CSETF_SL_DEMON_TYPE = makeSymbol("_CSETF-SL-DEMON-TYPE");

    private static final SubLSymbol SL_VALUE_TRIGGER = makeSymbol("SL-VALUE-TRIGGER");

    private static final SubLSymbol _CSETF_SL_VALUE_TRIGGER = makeSymbol("_CSETF-SL-VALUE-TRIGGER");

    private static final SubLSymbol SL_FUNCTIONAL_TYPE = makeSymbol("SL-FUNCTIONAL-TYPE");

    private static final SubLSymbol _CSETF_SL_FUNCTIONAL_TYPE = makeSymbol("_CSETF-SL-FUNCTIONAL-TYPE");

    private static final SubLSymbol SL_ISA_METHOD = makeSymbol("SL-ISA-METHOD");

    private static final SubLSymbol _CSETF_SL_ISA_METHOD = makeSymbol("_CSETF-SL-ISA-METHOD");

    private static final SubLSymbol SL_TARGET_INSTANCE = makeSymbol("SL-TARGET-INSTANCE");

    private static final SubLSymbol _CSETF_SL_TARGET_INSTANCE = makeSymbol("_CSETF-SL-TARGET-INSTANCE");













    private static final SubLSymbol MAKE_SLOT_LISTENER = makeSymbol("MAKE-SLOT-LISTENER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-METHOD");

    private static final SubLString $str341$__SLOT_LISTENER_for_Slot__S___S__ = makeString("#<SLOT-LISTENER for Slot ~S; ~S; ~S>");

    private static final SubLList $list342 = list(makeSymbol("SLOT-LISTENER"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $str343$slot_listener = makeString("slot-listener");

    private static final SubLSymbol SL_ = makeSymbol("SL-");

    private static final SubLSymbol SLOT_LISTENER_REGISTRY = makeSymbol("SLOT-LISTENER-REGISTRY");

    private static final SubLSymbol SLOT_LISTENER_REGISTRY_P = makeSymbol("SLOT-LISTENER-REGISTRY-P");

    private static final SubLList $list347 = list(makeSymbol("INSTANCE"), makeSymbol("SLOT-COUNT"), makeSymbol("LISTENERS-VECTOR"));

    private static final SubLList $list348 = list(makeKeyword("INSTANCE"), makeKeyword("SLOT-COUNT"), makeKeyword("LISTENERS-VECTOR"));

    private static final SubLList $list349 = list(makeSymbol("SLR-INSTANCE"), makeSymbol("SLR-SLOT-COUNT"), makeSymbol("SLR-LISTENERS-VECTOR"));

    private static final SubLList $list350 = list(makeSymbol("_CSETF-SLR-INSTANCE"), makeSymbol("_CSETF-SLR-SLOT-COUNT"), makeSymbol("_CSETF-SLR-LISTENERS-VECTOR"));

    private static final SubLSymbol SLOT_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SLOT-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list352 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SLOT-LISTENER-REGISTRY-P"));

    private static final SubLSymbol SLR_INSTANCE = makeSymbol("SLR-INSTANCE");

    private static final SubLSymbol _CSETF_SLR_INSTANCE = makeSymbol("_CSETF-SLR-INSTANCE");

    private static final SubLSymbol SLR_SLOT_COUNT = makeSymbol("SLR-SLOT-COUNT");

    private static final SubLSymbol _CSETF_SLR_SLOT_COUNT = makeSymbol("_CSETF-SLR-SLOT-COUNT");

    private static final SubLSymbol SLR_LISTENERS_VECTOR = makeSymbol("SLR-LISTENERS-VECTOR");

    private static final SubLSymbol _CSETF_SLR_LISTENERS_VECTOR = makeSymbol("_CSETF-SLR-LISTENERS-VECTOR");







    private static final SubLSymbol MAKE_SLOT_LISTENER_REGISTRY = makeSymbol("MAKE-SLOT-LISTENER-REGISTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_REGISTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-REGISTRY-METHOD");

    private static final SubLString $str364$__SLOT_LISTENER_REGISTRY___S__SLO = makeString("#<SLOT-LISTENER-REGISTRY: ~S; SLOT-COUNT ~S>");

    public static final SubLList $list365 = list(makeSymbol("SLOT-LISTENER-REGISTRY"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $str366$slot_listener_registry = makeString("slot-listener-registry");

    private static final SubLSymbol SLR_ = makeSymbol("SLR-");

    private static final SubLSymbol METHOD_LISTENER = makeSymbol("METHOD-LISTENER");

    private static final SubLSymbol METHOD_LISTENER_P = makeSymbol("METHOD-LISTENER-P");

    private static final SubLList $list370 = list(makeSymbol("OWNING-METHOD-NAME"), makeSymbol("OWNING-CLASS-NAME"), makeSymbol("DEMON-TYPE"), makeSymbol("DETAIL"));

    private static final SubLList $list371 = list(makeKeyword("OWNING-METHOD-NAME"), makeKeyword("OWNING-CLASS-NAME"), makeKeyword("DEMON-TYPE"), makeKeyword("DETAIL"));

    private static final SubLList $list372 = list(makeSymbol("ML-OWNING-METHOD-NAME"), makeSymbol("ML-OWNING-CLASS-NAME"), makeSymbol("ML-DEMON-TYPE"), makeSymbol("ML-DETAIL"));

    private static final SubLList $list373 = list(makeSymbol("_CSETF-ML-OWNING-METHOD-NAME"), makeSymbol("_CSETF-ML-OWNING-CLASS-NAME"), makeSymbol("_CSETF-ML-DEMON-TYPE"), makeSymbol("_CSETF-ML-DETAIL"));

    private static final SubLSymbol PRINT_METHOD_LISTENER = makeSymbol("PRINT-METHOD-LISTENER");

    private static final SubLSymbol METHOD_LISTENER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("METHOD-LISTENER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list376 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("METHOD-LISTENER-P"));

    private static final SubLSymbol ML_OWNING_METHOD_NAME = makeSymbol("ML-OWNING-METHOD-NAME");

    private static final SubLSymbol _CSETF_ML_OWNING_METHOD_NAME = makeSymbol("_CSETF-ML-OWNING-METHOD-NAME");

    private static final SubLSymbol ML_OWNING_CLASS_NAME = makeSymbol("ML-OWNING-CLASS-NAME");

    private static final SubLSymbol _CSETF_ML_OWNING_CLASS_NAME = makeSymbol("_CSETF-ML-OWNING-CLASS-NAME");

    private static final SubLSymbol ML_DEMON_TYPE = makeSymbol("ML-DEMON-TYPE");

    private static final SubLSymbol _CSETF_ML_DEMON_TYPE = makeSymbol("_CSETF-ML-DEMON-TYPE");

    private static final SubLSymbol ML_DETAIL = makeSymbol("ML-DETAIL");

    private static final SubLSymbol _CSETF_ML_DETAIL = makeSymbol("_CSETF-ML-DETAIL");

    private static final SubLSymbol $OWNING_METHOD_NAME = makeKeyword("OWNING-METHOD-NAME");

    private static final SubLSymbol $OWNING_CLASS_NAME = makeKeyword("OWNING-CLASS-NAME");



    private static final SubLSymbol MAKE_METHOD_LISTENER = makeSymbol("MAKE-METHOD-LISTENER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-METHOD");

    private static final SubLList $list390 = list(makeSymbol("METHOD-LISTENER"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $str391$method_listener = makeString("method-listener");

    private static final SubLSymbol ML_ = makeSymbol("ML-");

    private static final SubLSymbol FUNCTION_DETAIL = makeSymbol("FUNCTION-DETAIL");

    private static final SubLSymbol FUNCTION_DETAIL_P = makeSymbol("FUNCTION-DETAIL-P");

    private static final SubLList $list395 = list(makeSymbol("FUNCTION-NAME"), makeSymbol("ARGLIST"));

    private static final SubLList $list396 = list(makeKeyword("FUNCTION-NAME"), makeKeyword("ARGLIST"));

    private static final SubLList $list397 = list(makeSymbol("FD-FUNCTION-NAME"), makeSymbol("FD-ARGLIST"));

    public static final SubLList $list398 = list(makeSymbol("_CSETF-FD-FUNCTION-NAME"), makeSymbol("_CSETF-FD-ARGLIST"));

    private static final SubLSymbol FUNCTION_DETAIL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FUNCTION-DETAIL-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list400 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FUNCTION-DETAIL-P"));

    private static final SubLSymbol FD_FUNCTION_NAME = makeSymbol("FD-FUNCTION-NAME");

    private static final SubLSymbol _CSETF_FD_FUNCTION_NAME = makeSymbol("_CSETF-FD-FUNCTION-NAME");

    private static final SubLSymbol FD_ARGLIST = makeSymbol("FD-ARGLIST");

    private static final SubLSymbol _CSETF_FD_ARGLIST = makeSymbol("_CSETF-FD-ARGLIST");



    private static final SubLSymbol MAKE_FUNCTION_DETAIL = makeSymbol("MAKE-FUNCTION-DETAIL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FUNCTION_DETAIL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FUNCTION-DETAIL-METHOD");

    public static final SubLList $list408 = list(makeSymbol("FUNCTION-DETAIL"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $str409$function_detail = makeString("function-detail");

    private static final SubLSymbol FD_ = makeSymbol("FD-");

    private static final SubLSymbol METHOD_DETAIL = makeSymbol("METHOD-DETAIL");

    private static final SubLSymbol METHOD_DETAIL_P = makeSymbol("METHOD-DETAIL-P");

    private static final SubLList $list413 = list(makeSymbol("METHOD-NAME"), makeSymbol("FUNCTION-NAME"), makeSymbol("ARGLIST"), makeSymbol("INSTANCE"));

    private static final SubLList $list414 = list(makeKeyword("METHOD-NAME"), makeKeyword("FUNCTION-NAME"), makeKeyword("ARGLIST"), makeKeyword("INSTANCE"));

    private static final SubLList $list415 = list(makeSymbol("MD-METHOD-NAME"), makeSymbol("MD-FUNCTION-NAME"), makeSymbol("MD-ARGLIST"), makeSymbol("MD-INSTANCE"));

    private static final SubLList $list416 = list(makeSymbol("_CSETF-MD-METHOD-NAME"), makeSymbol("_CSETF-MD-FUNCTION-NAME"), makeSymbol("_CSETF-MD-ARGLIST"), makeSymbol("_CSETF-MD-INSTANCE"));

    private static final SubLSymbol METHOD_DETAIL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("METHOD-DETAIL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list418 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("METHOD-DETAIL-P"));

    private static final SubLSymbol MD_METHOD_NAME = makeSymbol("MD-METHOD-NAME");

    private static final SubLSymbol _CSETF_MD_METHOD_NAME = makeSymbol("_CSETF-MD-METHOD-NAME");

    private static final SubLSymbol MD_FUNCTION_NAME = makeSymbol("MD-FUNCTION-NAME");

    private static final SubLSymbol _CSETF_MD_FUNCTION_NAME = makeSymbol("_CSETF-MD-FUNCTION-NAME");

    private static final SubLSymbol MD_ARGLIST = makeSymbol("MD-ARGLIST");

    private static final SubLSymbol _CSETF_MD_ARGLIST = makeSymbol("_CSETF-MD-ARGLIST");

    private static final SubLSymbol MD_INSTANCE = makeSymbol("MD-INSTANCE");

    private static final SubLSymbol _CSETF_MD_INSTANCE = makeSymbol("_CSETF-MD-INSTANCE");

    private static final SubLSymbol MAKE_METHOD_DETAIL = makeSymbol("MAKE-METHOD-DETAIL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_METHOD_DETAIL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-DETAIL-METHOD");

    private static final SubLList $list429 = list(makeSymbol("METHOD-DETAIL"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $str430$method_detail = makeString("method-detail");

    private static final SubLSymbol MD_ = makeSymbol("MD-");

    private static final SubLSymbol METHOD_LISTENER_REGISTRY = makeSymbol("METHOD-LISTENER-REGISTRY");

    private static final SubLSymbol METHOD_LISTENER_REGISTRY_P = makeSymbol("METHOD-LISTENER-REGISTRY-P");

    private static final SubLList $list434 = list(makeSymbol("INSTANCE"), makeSymbol("LISTENER-ALIST"));

    private static final SubLList $list435 = list(makeKeyword("INSTANCE"), makeKeyword("LISTENER-ALIST"));

    private static final SubLList $list436 = list(makeSymbol("MLR-INSTANCE"), makeSymbol("MLR-LISTENER-ALIST"));

    private static final SubLList $list437 = list(makeSymbol("_CSETF-MLR-INSTANCE"), makeSymbol("_CSETF-MLR-LISTENER-ALIST"));

    private static final SubLSymbol METHOD_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("METHOD-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list439 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("METHOD-LISTENER-REGISTRY-P"));

    private static final SubLSymbol MLR_INSTANCE = makeSymbol("MLR-INSTANCE");

    private static final SubLSymbol _CSETF_MLR_INSTANCE = makeSymbol("_CSETF-MLR-INSTANCE");

    private static final SubLSymbol MLR_LISTENER_ALIST = makeSymbol("MLR-LISTENER-ALIST");

    private static final SubLSymbol _CSETF_MLR_LISTENER_ALIST = makeSymbol("_CSETF-MLR-LISTENER-ALIST");



    private static final SubLSymbol MAKE_METHOD_LISTENER_REGISTRY = makeSymbol("MAKE-METHOD-LISTENER-REGISTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_REGISTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-REGISTRY-METHOD");

    private static final SubLList $list447 = list(makeSymbol("METHOD-LISTENER-REGISTRY"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $str448$method_listener_registry = makeString("method-listener-registry");

    private static final SubLSymbol MLR_ = makeSymbol("MLR-");

    private static final SubLString $str450$__METHOD_LISTENER____S__S_ = makeString("#<METHOD-LISTENER: (~S ~S)");

    private static final SubLString $str451$_monitored_by_function__S_ = makeString(" monitored by function ~S>");

    private static final SubLString $str452$_monitored_by_method___S__S__ = makeString(" monitored by method (~S ~S)>");

    private static final SubLString $str453$_ = makeString(">");

    public static SubLObject class_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_class(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject class_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$class_native.class ? T : NIL;
    }

    public static SubLObject class_name(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject class_parent(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject class_subclasses(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject class_interface_names(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject class_interfaces(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject class_compiled_inheritance_path(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject class_instance_var_decls(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject class_class_var_decls(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject class_compiled_instance_slot_access_alist(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject class_compiled_instance_boolean_slot_access_alist(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject class_compiled_class_slot_access_alist(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject class_compiled_class_boolean_slot_access_alist(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject class_slot_accessor_alist(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject class_instance_method_decls(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField15();
    }

    public static SubLObject class_class_method_decls(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField16();
    }

    public static SubLObject class_boolean_slots(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField17();
    }

    public static SubLObject class_any_slots(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField18();
    }

    public static SubLObject class_compiled_instance_method_access_alist(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField19();
    }

    public static SubLObject class_compiled_class_method_access_alist(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.getField20();
    }

    public static SubLObject class_tablified_instance_methods(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$tablified_instance_methods;
    }

    public static SubLObject class_definition_lock(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$definition_lock;
    }

    public static SubLObject class_access_lock(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$access_lock;
    }

    public static SubLObject class_synchronized_slots_p(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$synchronized_slots_p;
    }

    public static SubLObject class_plist(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$plist;
    }

    public static SubLObject class_class_initialization_function(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$class_initialization_function;
    }

    public static SubLObject class_class_initialized_p(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$class_initialized_p;
    }

    public static SubLObject class_instance_initialization_function(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$instance_initialization_function;
    }

    public static SubLObject class_class_properties(final SubLObject v_object) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$class_properties;
    }

    public static SubLObject _csetf_class_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_class_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_class_subclasses(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_class_interface_names(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_class_interfaces(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_class_compiled_inheritance_path(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_class_instance_var_decls(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_class_class_var_decls(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_class_compiled_instance_slot_access_alist(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_class_compiled_instance_boolean_slot_access_alist(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_class_compiled_class_slot_access_alist(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_class_compiled_class_boolean_slot_access_alist(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_class_slot_accessor_alist(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_class_instance_method_decls(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_class_class_method_decls(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_class_boolean_slots(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField17(value);
    }

    public static SubLObject _csetf_class_any_slots(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField18(value);
    }

    public static SubLObject _csetf_class_compiled_instance_method_access_alist(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField19(value);
    }

    public static SubLObject _csetf_class_compiled_class_method_access_alist(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return v_object.setField20(value);
    }

    public static SubLObject _csetf_class_tablified_instance_methods(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$tablified_instance_methods = value;
    }

    public static SubLObject _csetf_class_definition_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$definition_lock = value;
    }

    public static SubLObject _csetf_class_access_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$access_lock = value;
    }

    public static SubLObject _csetf_class_synchronized_slots_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$synchronized_slots_p = value;
    }

    public static SubLObject _csetf_class_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$plist = value;
    }

    public static SubLObject _csetf_class_class_initialization_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$class_initialization_function = value;
    }

    public static SubLObject _csetf_class_class_initialized_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$class_initialized_p = value;
    }

    public static SubLObject _csetf_class_instance_initialization_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$instance_initialization_function = value;
    }

    public static SubLObject _csetf_class_class_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != class_p(v_object) : "subloop_structures.class_p error :" + v_object;
        return (($class_native) (v_object)).$class_properties = value;
    }

    public static SubLObject make_class(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $class_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_class_name(v_new, current_value);
            } else
                if (pcase_var.eql($PARENT)) {
                    _csetf_class_parent(v_new, current_value);
                } else
                    if (pcase_var.eql($SUBCLASSES)) {
                        _csetf_class_subclasses(v_new, current_value);
                    } else
                        if (pcase_var.eql($INTERFACE_NAMES)) {
                            _csetf_class_interface_names(v_new, current_value);
                        } else
                            if (pcase_var.eql($INTERFACES)) {
                                _csetf_class_interfaces(v_new, current_value);
                            } else
                                if (pcase_var.eql($COMPILED_INHERITANCE_PATH)) {
                                    _csetf_class_compiled_inheritance_path(v_new, current_value);
                                } else
                                    if (pcase_var.eql($INSTANCE_VAR_DECLS)) {
                                        _csetf_class_instance_var_decls(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($CLASS_VAR_DECLS)) {
                                            _csetf_class_class_var_decls(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($COMPILED_INSTANCE_SLOT_ACCESS_ALIST)) {
                                                _csetf_class_compiled_instance_slot_access_alist(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST)) {
                                                    _csetf_class_compiled_instance_boolean_slot_access_alist(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($COMPILED_CLASS_SLOT_ACCESS_ALIST)) {
                                                        _csetf_class_compiled_class_slot_access_alist(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST)) {
                                                            _csetf_class_compiled_class_boolean_slot_access_alist(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($SLOT_ACCESSOR_ALIST)) {
                                                                _csetf_class_slot_accessor_alist(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($INSTANCE_METHOD_DECLS)) {
                                                                    _csetf_class_instance_method_decls(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($CLASS_METHOD_DECLS)) {
                                                                        _csetf_class_class_method_decls(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($BOOLEAN_SLOTS)) {
                                                                            _csetf_class_boolean_slots(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($ANY_SLOTS)) {
                                                                                _csetf_class_any_slots(v_new, current_value);
                                                                            } else
                                                                                if (pcase_var.eql($COMPILED_INSTANCE_METHOD_ACCESS_ALIST)) {
                                                                                    _csetf_class_compiled_instance_method_access_alist(v_new, current_value);
                                                                                } else
                                                                                    if (pcase_var.eql($COMPILED_CLASS_METHOD_ACCESS_ALIST)) {
                                                                                        _csetf_class_compiled_class_method_access_alist(v_new, current_value);
                                                                                    } else
                                                                                        if (pcase_var.eql($TABLIFIED_INSTANCE_METHODS)) {
                                                                                            _csetf_class_tablified_instance_methods(v_new, current_value);
                                                                                        } else
                                                                                            if (pcase_var.eql($DEFINITION_LOCK)) {
                                                                                                _csetf_class_definition_lock(v_new, current_value);
                                                                                            } else
                                                                                                if (pcase_var.eql($ACCESS_LOCK)) {
                                                                                                    _csetf_class_access_lock(v_new, current_value);
                                                                                                } else
                                                                                                    if (pcase_var.eql($SYNCHRONIZED_SLOTS_P)) {
                                                                                                        _csetf_class_synchronized_slots_p(v_new, current_value);
                                                                                                    } else
                                                                                                        if (pcase_var.eql($PLIST)) {
                                                                                                            _csetf_class_plist(v_new, current_value);
                                                                                                        } else
                                                                                                            if (pcase_var.eql($CLASS_INITIALIZATION_FUNCTION)) {
                                                                                                                _csetf_class_class_initialization_function(v_new, current_value);
                                                                                                            } else
                                                                                                                if (pcase_var.eql($CLASS_INITIALIZED_P)) {
                                                                                                                    _csetf_class_class_initialized_p(v_new, current_value);
                                                                                                                } else
                                                                                                                    if (pcase_var.eql($INSTANCE_INITIALIZATION_FUNCTION)) {
                                                                                                                        _csetf_class_instance_initialization_function(v_new, current_value);
                                                                                                                    } else
                                                                                                                        if (pcase_var.eql($CLASS_PROPERTIES)) {
                                                                                                                            _csetf_class_class_properties(v_new, current_value);
                                                                                                                        } else {
                                                                                                                            Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                                                                                                                        }



























        }
        return v_new;
    }

    public static SubLObject visit_defstruct_class(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CLASS, $int$28);
        funcall(visitor_fn, obj, $SLOT, $NAME, class_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT, class_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBCLASSES, class_subclasses(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERFACE_NAMES, class_interface_names(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERFACES, class_interfaces(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_INHERITANCE_PATH, class_compiled_inheritance_path(obj));
        funcall(visitor_fn, obj, $SLOT, $INSTANCE_VAR_DECLS, class_instance_var_decls(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_VAR_DECLS, class_class_var_decls(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_INSTANCE_SLOT_ACCESS_ALIST, class_compiled_instance_slot_access_alist(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, class_compiled_instance_boolean_slot_access_alist(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_CLASS_SLOT_ACCESS_ALIST, class_compiled_class_slot_access_alist(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST, class_compiled_class_boolean_slot_access_alist(obj));
        funcall(visitor_fn, obj, $SLOT, $SLOT_ACCESSOR_ALIST, class_slot_accessor_alist(obj));
        funcall(visitor_fn, obj, $SLOT, $INSTANCE_METHOD_DECLS, class_instance_method_decls(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_METHOD_DECLS, class_class_method_decls(obj));
        funcall(visitor_fn, obj, $SLOT, $BOOLEAN_SLOTS, class_boolean_slots(obj));
        funcall(visitor_fn, obj, $SLOT, $ANY_SLOTS, class_any_slots(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_INSTANCE_METHOD_ACCESS_ALIST, class_compiled_instance_method_access_alist(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_CLASS_METHOD_ACCESS_ALIST, class_compiled_class_method_access_alist(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLIFIED_INSTANCE_METHODS, class_tablified_instance_methods(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINITION_LOCK, class_definition_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $ACCESS_LOCK, class_access_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $SYNCHRONIZED_SLOTS_P, class_synchronized_slots_p(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, class_plist(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_INITIALIZATION_FUNCTION, class_class_initialization_function(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_INITIALIZED_P, class_class_initialized_p(obj));
        funcall(visitor_fn, obj, $SLOT, $INSTANCE_INITIALIZATION_FUNCTION, class_instance_initialization_function(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_PROPERTIES, class_class_properties(obj));
        funcall(visitor_fn, obj, $END, MAKE_CLASS, $int$28);
        return obj;
    }

    public static SubLObject visit_defstruct_object_class_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_class(obj, visitor_fn);
    }

    public static SubLObject create_class() {
        final SubLObject new_class = make_class(UNPROVIDED);
        _csetf_class_class_properties(new_class, ZERO_INTEGER);
        return new_class;
    }

    public static SubLObject with_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(current, datum, $list108);
        v_class = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject class_var = make_symbol($$$class);
        return generate_instance_variable_bindings_for_structure_slots(class_var, v_class, CLASS_, $list111, forms, UNPROVIDED);
    }

    public static SubLObject with_class_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(current, datum, $list108);
        v_class = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject class_var = make_symbol($$$class);
        return generate_instance_variable_bindings_for_structure_slots(class_var, v_class, CLASS_, $list111, forms, NIL);
    }

    public static SubLObject print_class(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str112$__CLASS__S_, class_name(v_object));
        return v_object;
    }

    public static SubLObject def_class_property(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject property_name = NIL;
        SubLObject offset = NIL;
        destructuring_bind_must_consp(current, datum, $list113);
        property_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list113);
        offset = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject accessor_base_name = cconcatenate($str114$SUBLOOP_CLASS_PROPERTY_, symbol_name(property_name));
            final SubLObject getter_name = intern(cconcatenate($str115$GET_, accessor_base_name), UNPROVIDED);
            final SubLObject setter_name = intern(cconcatenate($str116$SET_, accessor_base_name), UNPROVIDED);
            return list(PROGN, list(DEFINE_PROTECTED, getter_name, $list119, list(RET, listS(LDB_TEST, list(BYTE, ONE_INTEGER, offset), $list123))), listS(DEFINE_PROTECTED, setter_name, $list124, list(CSETF, $list126, listS(DPB, $list128, list(BYTE, ONE_INTEGER, offset), $list123)), $list129));
        }
        cdestructuring_bind_error(datum, $list113);
        return NIL;
    }

    public static SubLObject instance_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_instance(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject instance_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$instance_native.class ? T : NIL;
    }

    public static SubLObject instance_class(final SubLObject v_object) {
        assert NIL != instance_p(v_object) : "subloop_structures.instance_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject instance_boolean_slots(final SubLObject v_object) {
        assert NIL != instance_p(v_object) : "subloop_structures.instance_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject instance_any_slots(final SubLObject v_object) {
        assert NIL != instance_p(v_object) : "subloop_structures.instance_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject instance_plist(final SubLObject v_object) {
        assert NIL != instance_p(v_object) : "subloop_structures.instance_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_instance_class(final SubLObject v_object, final SubLObject value) {
        assert NIL != instance_p(v_object) : "subloop_structures.instance_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_instance_boolean_slots(final SubLObject v_object, final SubLObject value) {
        assert NIL != instance_p(v_object) : "subloop_structures.instance_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_instance_any_slots(final SubLObject v_object, final SubLObject value) {
        assert NIL != instance_p(v_object) : "subloop_structures.instance_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_instance_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != instance_p(v_object) : "subloop_structures.instance_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_instance(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $instance_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CLASS)) {
                _csetf_instance_class(v_new, current_value);
            } else
                if (pcase_var.eql($BOOLEAN_SLOTS)) {
                    _csetf_instance_boolean_slots(v_new, current_value);
                } else
                    if (pcase_var.eql($ANY_SLOTS)) {
                        _csetf_instance_any_slots(v_new, current_value);
                    } else
                        if (pcase_var.eql($PLIST)) {
                            _csetf_instance_plist(v_new, current_value);
                        } else {
                            Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_instance(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_INSTANCE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CLASS, instance_class(obj));
        funcall(visitor_fn, obj, $SLOT, $BOOLEAN_SLOTS, instance_boolean_slots(obj));
        funcall(visitor_fn, obj, $SLOT, $ANY_SLOTS, instance_any_slots(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, instance_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_INSTANCE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_instance_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_instance(obj, visitor_fn);
    }

    public static SubLObject with_instance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = NIL;
        destructuring_bind_must_consp(current, datum, $list150);
        instance = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject instance_var = make_symbol($$$instance);
        return generate_instance_variable_bindings_for_structure_slots(instance_var, instance, INSTANCE_, $list132, forms, UNPROVIDED);
    }

    public static SubLObject print_instance(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject v_class = instance_class(v_object);
        final SubLObject class_name = class_name(v_class);
        if (NIL != classes.subclassp(class_name, OBJECT)) {
            methods.funcall_instance_method_with_2_args(v_object, PRINT, stream, depth);
        } else {
            format(stream, $str155$__Instance_of__S_, class_name(v_class));
        }
        return v_object;
    }

    public static SubLObject interface_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_interface(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject interface_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$interface_native.class ? T : NIL;
    }

    public static SubLObject interface_name(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject interface_parents(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject interface_compiled_inheritance_path(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject interface_subinterfaces(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject interface_implementers(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject interface_instance_method_decls(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject interface_class_method_decls(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject interface_compiled_instance_method_decls(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject interface_compiled_class_method_decls(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject interface_local_class_methods(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject interface_local_instance_methods(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject interface_mark_list(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject interface_plist(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject interface_definition_lock(final SubLObject v_object) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.getField15();
    }

    public static SubLObject _csetf_interface_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_interface_parents(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_interface_compiled_inheritance_path(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_interface_subinterfaces(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_interface_implementers(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_interface_instance_method_decls(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_interface_class_method_decls(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_interface_compiled_instance_method_decls(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_interface_compiled_class_method_decls(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_interface_local_class_methods(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_interface_local_instance_methods(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_interface_mark_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_interface_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_interface_definition_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != interface_p(v_object) : "subloop_structures.interface_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject make_interface(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $interface_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_interface_name(v_new, current_value);
            } else
                if (pcase_var.eql($PARENTS)) {
                    _csetf_interface_parents(v_new, current_value);
                } else
                    if (pcase_var.eql($COMPILED_INHERITANCE_PATH)) {
                        _csetf_interface_compiled_inheritance_path(v_new, current_value);
                    } else
                        if (pcase_var.eql($SUBINTERFACES)) {
                            _csetf_interface_subinterfaces(v_new, current_value);
                        } else
                            if (pcase_var.eql($IMPLEMENTERS)) {
                                _csetf_interface_implementers(v_new, current_value);
                            } else
                                if (pcase_var.eql($INSTANCE_METHOD_DECLS)) {
                                    _csetf_interface_instance_method_decls(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CLASS_METHOD_DECLS)) {
                                        _csetf_interface_class_method_decls(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($COMPILED_INSTANCE_METHOD_DECLS)) {
                                            _csetf_interface_compiled_instance_method_decls(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($COMPILED_CLASS_METHOD_DECLS)) {
                                                _csetf_interface_compiled_class_method_decls(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($LOCAL_CLASS_METHODS)) {
                                                    _csetf_interface_local_class_methods(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($LOCAL_INSTANCE_METHODS)) {
                                                        _csetf_interface_local_instance_methods(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($MARK_LIST)) {
                                                            _csetf_interface_mark_list(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($PLIST)) {
                                                                _csetf_interface_plist(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($DEFINITION_LOCK)) {
                                                                    _csetf_interface_definition_lock(v_new, current_value);
                                                                } else {
                                                                    Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                                                                }













        }
        return v_new;
    }

    public static SubLObject visit_defstruct_interface(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_INTERFACE, FOURTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, interface_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENTS, interface_parents(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_INHERITANCE_PATH, interface_compiled_inheritance_path(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBINTERFACES, interface_subinterfaces(obj));
        funcall(visitor_fn, obj, $SLOT, $IMPLEMENTERS, interface_implementers(obj));
        funcall(visitor_fn, obj, $SLOT, $INSTANCE_METHOD_DECLS, interface_instance_method_decls(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_METHOD_DECLS, interface_class_method_decls(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_INSTANCE_METHOD_DECLS, interface_compiled_instance_method_decls(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPILED_CLASS_METHOD_DECLS, interface_compiled_class_method_decls(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCAL_CLASS_METHODS, interface_local_class_methods(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCAL_INSTANCE_METHODS, interface_local_instance_methods(obj));
        funcall(visitor_fn, obj, $SLOT, $MARK_LIST, interface_mark_list(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, interface_plist(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINITION_LOCK, interface_definition_lock(obj));
        funcall(visitor_fn, obj, $END, MAKE_INTERFACE, FOURTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_interface_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_interface(obj, visitor_fn);
    }

    public static SubLObject with_interface(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_interface = NIL;
        destructuring_bind_must_consp(current, datum, $list203);
        v_interface = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject interface_var = make_symbol($$$interface);
        return generate_instance_variable_bindings_for_structure_slots(interface_var, v_interface, INTERFACE_, $list206, forms, UNPROVIDED);
    }

    public static SubLObject with_interface_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_interface = NIL;
        destructuring_bind_must_consp(current, datum, $list203);
        v_interface = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject interface_var = make_symbol($$$interface);
        return generate_instance_variable_bindings_for_structure_slots(interface_var, v_interface, INTERFACE_, $list206, forms, NIL);
    }

    public static SubLObject print_interface(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str207$__Interface__S_PARENTS___S_, interface_name(v_object), interface_parents(v_object));
        return v_object;
    }

    public static SubLObject method_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_method(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject method_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$method_native.class ? T : NIL;
    }

    public static SubLObject method_name(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject method_class_name(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject method_lambda_list(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject method_body(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject method_protection(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject method_scope(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject method_update_type(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject method_function_name(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject method_function_def(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject method_before_listeners(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject method_after_listeners(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject method_instantiate_template(final SubLObject v_object) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_method_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_method_class_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_method_lambda_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_method_body(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_method_protection(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_method_scope(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_method_update_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_method_function_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_method_function_def(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_method_before_listeners(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_method_after_listeners(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_method_instantiate_template(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_p(v_object) : "subloop_structures.method_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_method(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $method_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_method_name(v_new, current_value);
            } else
                if (pcase_var.eql($CLASS_NAME)) {
                    _csetf_method_class_name(v_new, current_value);
                } else
                    if (pcase_var.eql($LAMBDA_LIST)) {
                        _csetf_method_lambda_list(v_new, current_value);
                    } else
                        if (pcase_var.eql($BODY)) {
                            _csetf_method_body(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROTECTION)) {
                                _csetf_method_protection(v_new, current_value);
                            } else
                                if (pcase_var.eql($SCOPE)) {
                                    _csetf_method_scope(v_new, current_value);
                                } else
                                    if (pcase_var.eql($UPDATE_TYPE)) {
                                        _csetf_method_update_type(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($FUNCTION_NAME)) {
                                            _csetf_method_function_name(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FUNCTION_DEF)) {
                                                _csetf_method_function_def(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($BEFORE_LISTENERS)) {
                                                    _csetf_method_before_listeners(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($AFTER_LISTENERS)) {
                                                        _csetf_method_after_listeners(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($INSTANTIATE_TEMPLATE)) {
                                                            _csetf_method_instantiate_template(v_new, current_value);
                                                        } else {
                                                            Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_method(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_METHOD, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, method_name(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_NAME, method_class_name(obj));
        funcall(visitor_fn, obj, $SLOT, $LAMBDA_LIST, method_lambda_list(obj));
        funcall(visitor_fn, obj, $SLOT, $BODY, method_body(obj));
        funcall(visitor_fn, obj, $SLOT, $PROTECTION, method_protection(obj));
        funcall(visitor_fn, obj, $SLOT, $SCOPE, method_scope(obj));
        funcall(visitor_fn, obj, $SLOT, $UPDATE_TYPE, method_update_type(obj));
        funcall(visitor_fn, obj, $SLOT, $FUNCTION_NAME, method_function_name(obj));
        funcall(visitor_fn, obj, $SLOT, $FUNCTION_DEF, method_function_def(obj));
        funcall(visitor_fn, obj, $SLOT, $BEFORE_LISTENERS, method_before_listeners(obj));
        funcall(visitor_fn, obj, $SLOT, $AFTER_LISTENERS, method_after_listeners(obj));
        funcall(visitor_fn, obj, $SLOT, $INSTANTIATE_TEMPLATE, method_instantiate_template(obj));
        funcall(visitor_fn, obj, $END, MAKE_METHOD, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_method_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method(obj, visitor_fn);
    }

    public static SubLObject with_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = NIL;
        destructuring_bind_must_consp(current, datum, $list254);
        method = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_var = make_symbol($$$method);
        return generate_instance_variable_bindings_for_structure_slots(method_var, method, METHOD_, $list210, forms, UNPROVIDED);
    }

    public static SubLObject with_method_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = NIL;
        destructuring_bind_must_consp(current, datum, $list254);
        method = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_var = make_symbol($$$method);
        return generate_instance_variable_bindings_for_structure_slots(method_var, method, METHOD_, $list210, forms, NIL);
    }

    public static SubLObject print_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = method_name(v_object);
        final SubLObject class_name = method_class_name(v_object);
        final SubLObject lambda_list = method_lambda_list(v_object);
        format(stream, $str257$__METHOD____S__S___S_, new SubLObject[]{ name, class_name, lambda_list });
        return v_object;
    }

    public static SubLObject tablify_method_list(final SubLObject method_list) {
        final SubLObject method_list_length = length(method_list);
        final SubLObject hashtable_size = (method_list_length.isZero()) ? $methods_initial_hashtable_size$.getGlobalValue() : add(method_list_length, floor(method_list_length, FOUR_INTEGER));
        final SubLObject hashtable = make_hash_table(hashtable_size, symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject reversed_method_list = cdolist_list_var = reverse(method_list);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject method_$1 = method;
            final SubLObject name = method_name(method_$1);
            sethash(name, hashtable, method);
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return hashtable;
    }

    public static SubLObject method_trace_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_method_trace(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject method_trace_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$method_trace_native.class ? T : NIL;
    }

    public static SubLObject method_trace_name(final SubLObject v_object) {
        assert NIL != method_trace_p(v_object) : "subloop_structures.method_trace_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject method_trace_class_name(final SubLObject v_object) {
        assert NIL != method_trace_p(v_object) : "subloop_structures.method_trace_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject method_trace_function(final SubLObject v_object) {
        assert NIL != method_trace_p(v_object) : "subloop_structures.method_trace_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject method_trace_outer(final SubLObject v_object) {
        assert NIL != method_trace_p(v_object) : "subloop_structures.method_trace_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_method_trace_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_trace_p(v_object) : "subloop_structures.method_trace_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_method_trace_class_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_trace_p(v_object) : "subloop_structures.method_trace_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_method_trace_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_trace_p(v_object) : "subloop_structures.method_trace_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_method_trace_outer(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_trace_p(v_object) : "subloop_structures.method_trace_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_method_trace(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $method_trace_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_method_trace_name(v_new, current_value);
            } else
                if (pcase_var.eql($CLASS_NAME)) {
                    _csetf_method_trace_class_name(v_new, current_value);
                } else
                    if (pcase_var.eql($FUNCTION)) {
                        _csetf_method_trace_function(v_new, current_value);
                    } else
                        if (pcase_var.eql($OUTER)) {
                            _csetf_method_trace_outer(v_new, current_value);
                        } else {
                            Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_method_trace(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_METHOD_TRACE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, method_trace_name(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_NAME, method_trace_class_name(obj));
        funcall(visitor_fn, obj, $SLOT, $FUNCTION, method_trace_function(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTER, method_trace_outer(obj));
        funcall(visitor_fn, obj, $END, MAKE_METHOD_TRACE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_method_trace_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_trace(obj, visitor_fn);
    }

    public static SubLObject with_method_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_trace = NIL;
        destructuring_bind_must_consp(current, datum, $list280);
        method_trace = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_trace_var = make_symbol($str281$method_trace);
        return generate_instance_variable_bindings_for_structure_slots(method_trace_var, method_trace, METHOD_TRACE_, $list261, forms, UNPROVIDED);
    }

    public static SubLObject with_method_trace_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_trace = NIL;
        destructuring_bind_must_consp(current, datum, $list280);
        method_trace = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_trace_var = make_symbol($str281$method_trace);
        return generate_instance_variable_bindings_for_structure_slots(method_trace_var, method_trace, METHOD_TRACE_, $list261, forms, NIL);
    }

    public static SubLObject print_method_trace(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = method_trace_name(v_object);
        final SubLObject class_name = method_trace_class_name(v_object);
        format(stream, $str283$__METHOD_TRACE____S__S__, name, class_name);
        return v_object;
    }

    public static SubLObject push_method_trace(final SubLObject name, final SubLObject class_name, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $method_trace_on$.getDynamicValue(thread)) {
            final SubLObject new_method_trace = make_method_trace(UNPROVIDED);
            _csetf_method_trace_name(new_method_trace, name);
            _csetf_method_trace_class_name(new_method_trace, class_name);
            _csetf_method_trace_function(new_method_trace, function);
            _csetf_method_trace_outer(new_method_trace, $methods_current_method_trace$.getDynamicValue(thread));
            return new_method_trace;
        }
        return NIL;
    }

    public static SubLObject method_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject method_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$method_info_native.class ? T : NIL;
    }

    public static SubLObject mi_method_name(final SubLObject v_object) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject mi_class_name(final SubLObject v_object) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject mi_mv_used_in_body(final SubLObject v_object) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject mi_mv_modified_in_body(final SubLObject v_object) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject mi_methods_used_in_body(final SubLObject v_object) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_mi_method_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_mi_class_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_mi_mv_used_in_body(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_mi_mv_modified_in_body(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_mi_methods_used_in_body(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_info_p(v_object) : "subloop_structures.method_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_method_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $method_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($METHOD_NAME)) {
                _csetf_mi_method_name(v_new, current_value);
            } else
                if (pcase_var.eql($CLASS_NAME)) {
                    _csetf_mi_class_name(v_new, current_value);
                } else
                    if (pcase_var.eql($MV_USED_IN_BODY)) {
                        _csetf_mi_mv_used_in_body(v_new, current_value);
                    } else
                        if (pcase_var.eql($MV_MODIFIED_IN_BODY)) {
                            _csetf_mi_mv_modified_in_body(v_new, current_value);
                        } else
                            if (pcase_var.eql($METHODS_USED_IN_BODY)) {
                                _csetf_mi_methods_used_in_body(v_new, current_value);
                            } else {
                                Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_method_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_METHOD_INFO, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $METHOD_NAME, mi_method_name(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS_NAME, mi_class_name(obj));
        funcall(visitor_fn, obj, $SLOT, $MV_USED_IN_BODY, mi_mv_used_in_body(obj));
        funcall(visitor_fn, obj, $SLOT, $MV_MODIFIED_IN_BODY, mi_mv_modified_in_body(obj));
        funcall(visitor_fn, obj, $SLOT, $METHODS_USED_IN_BODY, mi_methods_used_in_body(obj));
        funcall(visitor_fn, obj, $END, MAKE_METHOD_INFO, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_method_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_info(obj, visitor_fn);
    }

    public static SubLObject with_method_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_info = NIL;
        destructuring_bind_must_consp(current, datum, $list309);
        method_info = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_info_var = make_symbol($str310$method_info);
        return generate_instance_variable_bindings_for_structure_slots(method_info_var, method_info, MI_, $list286, forms, UNPROVIDED);
    }

    public static SubLObject with_method_info_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_info = NIL;
        destructuring_bind_must_consp(current, datum, $list309);
        method_info = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_info_var = make_symbol($str310$method_info);
        return generate_instance_variable_bindings_for_structure_slots(method_info_var, method_info, MI_, $list286, forms, NIL);
    }

    public static SubLObject slot_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_slot_listener(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject slot_listener_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$slot_listener_native.class ? T : NIL;
    }

    public static SubLObject sl_slot_name(final SubLObject v_object) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sl_demon_type(final SubLObject v_object) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sl_value_trigger(final SubLObject v_object) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sl_functional_type(final SubLObject v_object) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sl_isa_method(final SubLObject v_object) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sl_target_instance(final SubLObject v_object) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_sl_slot_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sl_demon_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sl_value_trigger(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sl_functional_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sl_isa_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sl_target_instance(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_p(v_object) : "subloop_structures.slot_listener_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_slot_listener(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $slot_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SLOT_NAME)) {
                _csetf_sl_slot_name(v_new, current_value);
            } else
                if (pcase_var.eql($DEMON_TYPE)) {
                    _csetf_sl_demon_type(v_new, current_value);
                } else
                    if (pcase_var.eql($VALUE_TRIGGER)) {
                        _csetf_sl_value_trigger(v_new, current_value);
                    } else
                        if (pcase_var.eql($FUNCTIONAL_TYPE)) {
                            _csetf_sl_functional_type(v_new, current_value);
                        } else
                            if (pcase_var.eql($ISA_METHOD)) {
                                _csetf_sl_isa_method(v_new, current_value);
                            } else
                                if (pcase_var.eql($TARGET_INSTANCE)) {
                                    _csetf_sl_target_instance(v_new, current_value);
                                } else {
                                    Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_slot_listener(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SLOT_LISTENER, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SLOT_NAME, sl_slot_name(obj));
        funcall(visitor_fn, obj, $SLOT, $DEMON_TYPE, sl_demon_type(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUE_TRIGGER, sl_value_trigger(obj));
        funcall(visitor_fn, obj, $SLOT, $FUNCTIONAL_TYPE, sl_functional_type(obj));
        funcall(visitor_fn, obj, $SLOT, $ISA_METHOD, sl_isa_method(obj));
        funcall(visitor_fn, obj, $SLOT, $TARGET_INSTANCE, sl_target_instance(obj));
        funcall(visitor_fn, obj, $END, MAKE_SLOT_LISTENER, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_slot_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_slot_listener(obj, visitor_fn);
    }

    public static SubLObject print_slot_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str341$__SLOT_LISTENER_for_Slot__S___S__, new SubLObject[]{ sl_slot_name(v_object), sl_demon_type(v_object), sl_value_trigger(v_object) });
        return v_object;
    }

    public static SubLObject with_slot_listener(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_listener = NIL;
        destructuring_bind_must_consp(current, datum, $list342);
        slot_listener = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject slot_listener_var = make_symbol($str343$slot_listener);
        return generate_instance_variable_bindings_for_structure_slots(slot_listener_var, slot_listener, SL_, $list314, forms, UNPROVIDED);
    }

    public static SubLObject with_slot_listener_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_listener = NIL;
        destructuring_bind_must_consp(current, datum, $list342);
        slot_listener = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject slot_listener_var = make_symbol($str343$slot_listener);
        return generate_instance_variable_bindings_for_structure_slots(slot_listener_var, slot_listener, SL_, $list314, forms, NIL);
    }

    public static SubLObject slot_listener_registry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject slot_listener_registry_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$slot_listener_registry_native.class ? T : NIL;
    }

    public static SubLObject slr_instance(final SubLObject v_object) {
        assert NIL != slot_listener_registry_p(v_object) : "subloop_structures.slot_listener_registry_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject slr_slot_count(final SubLObject v_object) {
        assert NIL != slot_listener_registry_p(v_object) : "subloop_structures.slot_listener_registry_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject slr_listeners_vector(final SubLObject v_object) {
        assert NIL != slot_listener_registry_p(v_object) : "subloop_structures.slot_listener_registry_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_slr_instance(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_registry_p(v_object) : "subloop_structures.slot_listener_registry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_slr_slot_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_registry_p(v_object) : "subloop_structures.slot_listener_registry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_slr_listeners_vector(final SubLObject v_object, final SubLObject value) {
        assert NIL != slot_listener_registry_p(v_object) : "subloop_structures.slot_listener_registry_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_slot_listener_registry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $slot_listener_registry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INSTANCE)) {
                _csetf_slr_instance(v_new, current_value);
            } else
                if (pcase_var.eql($SLOT_COUNT)) {
                    _csetf_slr_slot_count(v_new, current_value);
                } else
                    if (pcase_var.eql($LISTENERS_VECTOR)) {
                        _csetf_slr_listeners_vector(v_new, current_value);
                    } else {
                        Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_slot_listener_registry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SLOT_LISTENER_REGISTRY, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INSTANCE, slr_instance(obj));
        funcall(visitor_fn, obj, $SLOT, $SLOT_COUNT, slr_slot_count(obj));
        funcall(visitor_fn, obj, $SLOT, $LISTENERS_VECTOR, slr_listeners_vector(obj));
        funcall(visitor_fn, obj, $END, MAKE_SLOT_LISTENER_REGISTRY, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_slot_listener_registry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_slot_listener_registry(obj, visitor_fn);
    }

    public static SubLObject print_slot_listener_registry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str364$__SLOT_LISTENER_REGISTRY___S__SLO, slr_instance(v_object), slr_slot_count(v_object));
        return v_object;
    }

    public static SubLObject with_slot_listener_registry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_listener_registry = NIL;
        destructuring_bind_must_consp(current, datum, $list365);
        slot_listener_registry = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject slot_listener_registry_var = make_symbol($str366$slot_listener_registry);
        return generate_instance_variable_bindings_for_structure_slots(slot_listener_registry_var, slot_listener_registry, SLR_, $list347, forms, UNPROVIDED);
    }

    public static SubLObject with_slot_listener_registry_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_listener_registry = NIL;
        destructuring_bind_must_consp(current, datum, $list365);
        slot_listener_registry = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject slot_listener_registry_var = make_symbol($str366$slot_listener_registry);
        return generate_instance_variable_bindings_for_structure_slots(slot_listener_registry_var, slot_listener_registry, SLR_, $list347, forms, NIL);
    }

    public static SubLObject method_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_method_listener(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject method_listener_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$method_listener_native.class ? T : NIL;
    }

    public static SubLObject ml_owning_method_name(final SubLObject v_object) {
        assert NIL != method_listener_p(v_object) : "subloop_structures.method_listener_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject ml_owning_class_name(final SubLObject v_object) {
        assert NIL != method_listener_p(v_object) : "subloop_structures.method_listener_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject ml_demon_type(final SubLObject v_object) {
        assert NIL != method_listener_p(v_object) : "subloop_structures.method_listener_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject ml_detail(final SubLObject v_object) {
        assert NIL != method_listener_p(v_object) : "subloop_structures.method_listener_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_ml_owning_method_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_listener_p(v_object) : "subloop_structures.method_listener_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ml_owning_class_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_listener_p(v_object) : "subloop_structures.method_listener_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ml_demon_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_listener_p(v_object) : "subloop_structures.method_listener_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ml_detail(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_listener_p(v_object) : "subloop_structures.method_listener_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_method_listener(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $method_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($OWNING_METHOD_NAME)) {
                _csetf_ml_owning_method_name(v_new, current_value);
            } else
                if (pcase_var.eql($OWNING_CLASS_NAME)) {
                    _csetf_ml_owning_class_name(v_new, current_value);
                } else
                    if (pcase_var.eql($DEMON_TYPE)) {
                        _csetf_ml_demon_type(v_new, current_value);
                    } else
                        if (pcase_var.eql($DETAIL)) {
                            _csetf_ml_detail(v_new, current_value);
                        } else {
                            Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_method_listener(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_METHOD_LISTENER, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $OWNING_METHOD_NAME, ml_owning_method_name(obj));
        funcall(visitor_fn, obj, $SLOT, $OWNING_CLASS_NAME, ml_owning_class_name(obj));
        funcall(visitor_fn, obj, $SLOT, $DEMON_TYPE, ml_demon_type(obj));
        funcall(visitor_fn, obj, $SLOT, $DETAIL, ml_detail(obj));
        funcall(visitor_fn, obj, $END, MAKE_METHOD_LISTENER, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_method_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_listener(obj, visitor_fn);
    }

    public static SubLObject with_method_listener(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_listener = NIL;
        destructuring_bind_must_consp(current, datum, $list390);
        method_listener = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_listener_var = make_symbol($str391$method_listener);
        return generate_instance_variable_bindings_for_structure_slots(method_listener_var, method_listener, ML_, $list370, forms, UNPROVIDED);
    }

    public static SubLObject with_method_listener_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_listener = NIL;
        destructuring_bind_must_consp(current, datum, $list390);
        method_listener = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_listener_var = make_symbol($str391$method_listener);
        return generate_instance_variable_bindings_for_structure_slots(method_listener_var, method_listener, ML_, $list370, forms, NIL);
    }

    public static SubLObject function_detail_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject function_detail_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$function_detail_native.class ? T : NIL;
    }

    public static SubLObject fd_function_name(final SubLObject v_object) {
        assert NIL != function_detail_p(v_object) : "subloop_structures.function_detail_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject fd_arglist(final SubLObject v_object) {
        assert NIL != function_detail_p(v_object) : "subloop_structures.function_detail_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_fd_function_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != function_detail_p(v_object) : "subloop_structures.function_detail_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fd_arglist(final SubLObject v_object, final SubLObject value) {
        assert NIL != function_detail_p(v_object) : "subloop_structures.function_detail_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_function_detail(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $function_detail_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FUNCTION_NAME)) {
                _csetf_fd_function_name(v_new, current_value);
            } else
                if (pcase_var.eql($ARGLIST)) {
                    _csetf_fd_arglist(v_new, current_value);
                } else {
                    Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_function_detail(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FUNCTION_DETAIL, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FUNCTION_NAME, fd_function_name(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGLIST, fd_arglist(obj));
        funcall(visitor_fn, obj, $END, MAKE_FUNCTION_DETAIL, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_function_detail_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_function_detail(obj, visitor_fn);
    }

    public static SubLObject with_function_detail(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_detail = NIL;
        destructuring_bind_must_consp(current, datum, $list408);
        function_detail = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject function_detail_var = make_symbol($str409$function_detail);
        return generate_instance_variable_bindings_for_structure_slots(function_detail_var, function_detail, FD_, $list395, forms, UNPROVIDED);
    }

    public static SubLObject with_function_detail_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_detail = NIL;
        destructuring_bind_must_consp(current, datum, $list408);
        function_detail = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject function_detail_var = make_symbol($str409$function_detail);
        return generate_instance_variable_bindings_for_structure_slots(function_detail_var, function_detail, FD_, $list395, forms, NIL);
    }

    public static SubLObject method_detail_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject method_detail_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$method_detail_native.class ? T : NIL;
    }

    public static SubLObject md_method_name(final SubLObject v_object) {
        assert NIL != method_detail_p(v_object) : "subloop_structures.method_detail_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject md_function_name(final SubLObject v_object) {
        assert NIL != method_detail_p(v_object) : "subloop_structures.method_detail_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject md_arglist(final SubLObject v_object) {
        assert NIL != method_detail_p(v_object) : "subloop_structures.method_detail_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject md_instance(final SubLObject v_object) {
        assert NIL != method_detail_p(v_object) : "subloop_structures.method_detail_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_md_method_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_detail_p(v_object) : "subloop_structures.method_detail_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_md_function_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_detail_p(v_object) : "subloop_structures.method_detail_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_md_arglist(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_detail_p(v_object) : "subloop_structures.method_detail_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_md_instance(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_detail_p(v_object) : "subloop_structures.method_detail_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_method_detail(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $method_detail_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($METHOD_NAME)) {
                _csetf_md_method_name(v_new, current_value);
            } else
                if (pcase_var.eql($FUNCTION_NAME)) {
                    _csetf_md_function_name(v_new, current_value);
                } else
                    if (pcase_var.eql($ARGLIST)) {
                        _csetf_md_arglist(v_new, current_value);
                    } else
                        if (pcase_var.eql($INSTANCE)) {
                            _csetf_md_instance(v_new, current_value);
                        } else {
                            Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_method_detail(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_METHOD_DETAIL, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $METHOD_NAME, md_method_name(obj));
        funcall(visitor_fn, obj, $SLOT, $FUNCTION_NAME, md_function_name(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGLIST, md_arglist(obj));
        funcall(visitor_fn, obj, $SLOT, $INSTANCE, md_instance(obj));
        funcall(visitor_fn, obj, $END, MAKE_METHOD_DETAIL, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_method_detail_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_detail(obj, visitor_fn);
    }

    public static SubLObject with_method_detail(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_detail = NIL;
        destructuring_bind_must_consp(current, datum, $list429);
        method_detail = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_detail_var = make_symbol($str430$method_detail);
        return generate_instance_variable_bindings_for_structure_slots(method_detail_var, method_detail, MD_, $list413, forms, UNPROVIDED);
    }

    public static SubLObject with_method_detail_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_detail = NIL;
        destructuring_bind_must_consp(current, datum, $list429);
        method_detail = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject method_detail_var = make_symbol($str430$method_detail);
        return generate_instance_variable_bindings_for_structure_slots(method_detail_var, method_detail, MD_, $list413, forms, NIL);
    }

    public static SubLObject method_listener_registry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject method_listener_registry_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$method_listener_registry_native.class ? T : NIL;
    }

    public static SubLObject mlr_instance(final SubLObject v_object) {
        assert NIL != method_listener_registry_p(v_object) : "subloop_structures.method_listener_registry_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject mlr_listener_alist(final SubLObject v_object) {
        assert NIL != method_listener_registry_p(v_object) : "subloop_structures.method_listener_registry_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_mlr_instance(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_listener_registry_p(v_object) : "subloop_structures.method_listener_registry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_mlr_listener_alist(final SubLObject v_object, final SubLObject value) {
        assert NIL != method_listener_registry_p(v_object) : "subloop_structures.method_listener_registry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_method_listener_registry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $method_listener_registry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INSTANCE)) {
                _csetf_mlr_instance(v_new, current_value);
            } else
                if (pcase_var.eql($LISTENER_ALIST)) {
                    _csetf_mlr_listener_alist(v_new, current_value);
                } else {
                    Errors.error($str102$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_method_listener_registry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_METHOD_LISTENER_REGISTRY, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INSTANCE, mlr_instance(obj));
        funcall(visitor_fn, obj, $SLOT, $LISTENER_ALIST, mlr_listener_alist(obj));
        funcall(visitor_fn, obj, $END, MAKE_METHOD_LISTENER_REGISTRY, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_method_listener_registry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_listener_registry(obj, visitor_fn);
    }

    public static SubLObject with_method_listener_registry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_listener_registry = NIL;
        destructuring_bind_must_consp(current, datum, $list447);
        method_listener_registry = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject mlr_var = make_symbol($str448$method_listener_registry);
        return generate_instance_variable_bindings_for_structure_slots(mlr_var, method_listener_registry, MLR_, $list434, forms, UNPROVIDED);
    }

    public static SubLObject with_method_listener_registry_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_listener_registry = NIL;
        destructuring_bind_must_consp(current, datum, $list447);
        method_listener_registry = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject mlr_var = make_symbol($str448$method_listener_registry);
        return generate_instance_variable_bindings_for_structure_slots(mlr_var, method_listener_registry, MLR_, $list434, forms, NIL);
    }

    public static SubLObject print_method_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject owning_method_name = ml_owning_method_name(v_object);
        final SubLObject owning_class_name = ml_owning_class_name(v_object);
        final SubLObject detail = ml_detail(v_object);
        format(stream, $str450$__METHOD_LISTENER____S__S_, owning_method_name, owning_class_name);
        if (NIL != function_detail_p(detail)) {
            format(stream, $str451$_monitored_by_function__S_, fd_function_name(detail));
        } else
            if (NIL != method_detail_p(detail)) {
                final SubLObject method_detail = detail;
                final SubLObject method_name = md_method_name(method_detail);
                final SubLObject instance = md_instance(method_detail);
                format(stream, $str452$_monitored_by_method___S__S__, method_name, instance);
            } else {
                format(stream, $str453$_);
            }

        return v_object;
    }

    public static SubLObject declare_subloop_structures_file() {
        declareFunction(me, "class_print_function_trampoline", "CLASS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "class_p", "CLASS-P", 1, 0, false);
        new subloop_structures.$class_p$UnaryFunction();
        declareFunction(me, "class_name", "CLASS-NAME", 1, 0, false);
        new subloop_structures.$class_name$UnaryFunction();
        declareFunction(me, "class_parent", "CLASS-PARENT", 1, 0, false);
        declareFunction(me, "class_subclasses", "CLASS-SUBCLASSES", 1, 0, false);
        declareFunction(me, "class_interface_names", "CLASS-INTERFACE-NAMES", 1, 0, false);
        declareFunction(me, "class_interfaces", "CLASS-INTERFACES", 1, 0, false);
        declareFunction(me, "class_compiled_inheritance_path", "CLASS-COMPILED-INHERITANCE-PATH", 1, 0, false);
        declareFunction(me, "class_instance_var_decls", "CLASS-INSTANCE-VAR-DECLS", 1, 0, false);
        declareFunction(me, "class_class_var_decls", "CLASS-CLASS-VAR-DECLS", 1, 0, false);
        declareFunction(me, "class_compiled_instance_slot_access_alist", "CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST", 1, 0, false);
        declareFunction(me, "class_compiled_instance_boolean_slot_access_alist", "CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST", 1, 0, false);
        declareFunction(me, "class_compiled_class_slot_access_alist", "CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST", 1, 0, false);
        declareFunction(me, "class_compiled_class_boolean_slot_access_alist", "CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST", 1, 0, false);
        declareFunction(me, "class_slot_accessor_alist", "CLASS-SLOT-ACCESSOR-ALIST", 1, 0, false);
        declareFunction(me, "class_instance_method_decls", "CLASS-INSTANCE-METHOD-DECLS", 1, 0, false);
        declareFunction(me, "class_class_method_decls", "CLASS-CLASS-METHOD-DECLS", 1, 0, false);
        declareFunction(me, "class_boolean_slots", "CLASS-BOOLEAN-SLOTS", 1, 0, false);
        declareFunction(me, "class_any_slots", "CLASS-ANY-SLOTS", 1, 0, false);
        declareFunction(me, "class_compiled_instance_method_access_alist", "CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST", 1, 0, false);
        declareFunction(me, "class_compiled_class_method_access_alist", "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST", 1, 0, false);
        declareFunction(me, "class_tablified_instance_methods", "CLASS-TABLIFIED-INSTANCE-METHODS", 1, 0, false);
        declareFunction(me, "class_definition_lock", "CLASS-DEFINITION-LOCK", 1, 0, false);
        declareFunction(me, "class_access_lock", "CLASS-ACCESS-LOCK", 1, 0, false);
        declareFunction(me, "class_synchronized_slots_p", "CLASS-SYNCHRONIZED-SLOTS-P", 1, 0, false);
        declareFunction(me, "class_plist", "CLASS-PLIST", 1, 0, false);
        declareFunction(me, "class_class_initialization_function", "CLASS-CLASS-INITIALIZATION-FUNCTION", 1, 0, false);
        declareFunction(me, "class_class_initialized_p", "CLASS-CLASS-INITIALIZED-P", 1, 0, false);
        declareFunction(me, "class_instance_initialization_function", "CLASS-INSTANCE-INITIALIZATION-FUNCTION", 1, 0, false);
        declareFunction(me, "class_class_properties", "CLASS-CLASS-PROPERTIES", 1, 0, false);
        declareFunction(me, "_csetf_class_name", "_CSETF-CLASS-NAME", 2, 0, false);
        declareFunction(me, "_csetf_class_parent", "_CSETF-CLASS-PARENT", 2, 0, false);
        declareFunction(me, "_csetf_class_subclasses", "_CSETF-CLASS-SUBCLASSES", 2, 0, false);
        declareFunction(me, "_csetf_class_interface_names", "_CSETF-CLASS-INTERFACE-NAMES", 2, 0, false);
        declareFunction(me, "_csetf_class_interfaces", "_CSETF-CLASS-INTERFACES", 2, 0, false);
        declareFunction(me, "_csetf_class_compiled_inheritance_path", "_CSETF-CLASS-COMPILED-INHERITANCE-PATH", 2, 0, false);
        declareFunction(me, "_csetf_class_instance_var_decls", "_CSETF-CLASS-INSTANCE-VAR-DECLS", 2, 0, false);
        declareFunction(me, "_csetf_class_class_var_decls", "_CSETF-CLASS-CLASS-VAR-DECLS", 2, 0, false);
        declareFunction(me, "_csetf_class_compiled_instance_slot_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST", 2, 0, false);
        declareFunction(me, "_csetf_class_compiled_instance_boolean_slot_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST", 2, 0, false);
        declareFunction(me, "_csetf_class_compiled_class_slot_access_alist", "_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST", 2, 0, false);
        declareFunction(me, "_csetf_class_compiled_class_boolean_slot_access_alist", "_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST", 2, 0, false);
        declareFunction(me, "_csetf_class_slot_accessor_alist", "_CSETF-CLASS-SLOT-ACCESSOR-ALIST", 2, 0, false);
        declareFunction(me, "_csetf_class_instance_method_decls", "_CSETF-CLASS-INSTANCE-METHOD-DECLS", 2, 0, false);
        declareFunction(me, "_csetf_class_class_method_decls", "_CSETF-CLASS-CLASS-METHOD-DECLS", 2, 0, false);
        declareFunction(me, "_csetf_class_boolean_slots", "_CSETF-CLASS-BOOLEAN-SLOTS", 2, 0, false);
        declareFunction(me, "_csetf_class_any_slots", "_CSETF-CLASS-ANY-SLOTS", 2, 0, false);
        declareFunction(me, "_csetf_class_compiled_instance_method_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST", 2, 0, false);
        declareFunction(me, "_csetf_class_compiled_class_method_access_alist", "_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST", 2, 0, false);
        declareFunction(me, "_csetf_class_tablified_instance_methods", "_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS", 2, 0, false);
        declareFunction(me, "_csetf_class_definition_lock", "_CSETF-CLASS-DEFINITION-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_class_access_lock", "_CSETF-CLASS-ACCESS-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_class_synchronized_slots_p", "_CSETF-CLASS-SYNCHRONIZED-SLOTS-P", 2, 0, false);
        declareFunction(me, "_csetf_class_plist", "_CSETF-CLASS-PLIST", 2, 0, false);
        declareFunction(me, "_csetf_class_class_initialization_function", "_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION", 2, 0, false);
        declareFunction(me, "_csetf_class_class_initialized_p", "_CSETF-CLASS-CLASS-INITIALIZED-P", 2, 0, false);
        declareFunction(me, "_csetf_class_instance_initialization_function", "_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION", 2, 0, false);
        declareFunction(me, "_csetf_class_class_properties", "_CSETF-CLASS-CLASS-PROPERTIES", 2, 0, false);
        declareFunction(me, "make_class", "MAKE-CLASS", 0, 1, false);
        declareFunction(me, "visit_defstruct_class", "VISIT-DEFSTRUCT-CLASS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_class_method", "VISIT-DEFSTRUCT-OBJECT-CLASS-METHOD", 2, 0, false);
        declareFunction(me, "create_class", "CREATE-CLASS", 0, 0, false);
        declareMacro(me, "with_class", "WITH-CLASS");
        declareMacro(me, "with_class_private", "WITH-CLASS-PRIVATE");
        declareFunction(me, "print_class", "PRINT-CLASS", 3, 0, false);
        declareMacro(me, "def_class_property", "DEF-CLASS-PROPERTY");
        declareFunction(me, "instance_print_function_trampoline", "INSTANCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "instance_p", "INSTANCE-P", 1, 0, false);
        new subloop_structures.$instance_p$UnaryFunction();
        declareFunction(me, "instance_class", "INSTANCE-CLASS", 1, 0, false);
        declareFunction(me, "instance_boolean_slots", "INSTANCE-BOOLEAN-SLOTS", 1, 0, false);
        declareFunction(me, "instance_any_slots", "INSTANCE-ANY-SLOTS", 1, 0, false);
        declareFunction(me, "instance_plist", "INSTANCE-PLIST", 1, 0, false);
        declareFunction(me, "_csetf_instance_class", "_CSETF-INSTANCE-CLASS", 2, 0, false);
        declareFunction(me, "_csetf_instance_boolean_slots", "_CSETF-INSTANCE-BOOLEAN-SLOTS", 2, 0, false);
        declareFunction(me, "_csetf_instance_any_slots", "_CSETF-INSTANCE-ANY-SLOTS", 2, 0, false);
        declareFunction(me, "_csetf_instance_plist", "_CSETF-INSTANCE-PLIST", 2, 0, false);
        declareFunction(me, "make_instance", "MAKE-INSTANCE", 0, 1, false);
        declareFunction(me, "visit_defstruct_instance", "VISIT-DEFSTRUCT-INSTANCE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_instance_method", "VISIT-DEFSTRUCT-OBJECT-INSTANCE-METHOD", 2, 0, false);
        declareMacro(me, "with_instance", "WITH-INSTANCE");
        declareFunction(me, "print_instance", "PRINT-INSTANCE", 3, 0, false);
        declareFunction(me, "interface_print_function_trampoline", "INTERFACE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "interface_p", "INTERFACE-P", 1, 0, false);
        new subloop_structures.$interface_p$UnaryFunction();
        declareFunction(me, "interface_name", "INTERFACE-NAME", 1, 0, false);
        declareFunction(me, "interface_parents", "INTERFACE-PARENTS", 1, 0, false);
        declareFunction(me, "interface_compiled_inheritance_path", "INTERFACE-COMPILED-INHERITANCE-PATH", 1, 0, false);
        declareFunction(me, "interface_subinterfaces", "INTERFACE-SUBINTERFACES", 1, 0, false);
        declareFunction(me, "interface_implementers", "INTERFACE-IMPLEMENTERS", 1, 0, false);
        declareFunction(me, "interface_instance_method_decls", "INTERFACE-INSTANCE-METHOD-DECLS", 1, 0, false);
        declareFunction(me, "interface_class_method_decls", "INTERFACE-CLASS-METHOD-DECLS", 1, 0, false);
        declareFunction(me, "interface_compiled_instance_method_decls", "INTERFACE-COMPILED-INSTANCE-METHOD-DECLS", 1, 0, false);
        declareFunction(me, "interface_compiled_class_method_decls", "INTERFACE-COMPILED-CLASS-METHOD-DECLS", 1, 0, false);
        declareFunction(me, "interface_local_class_methods", "INTERFACE-LOCAL-CLASS-METHODS", 1, 0, false);
        declareFunction(me, "interface_local_instance_methods", "INTERFACE-LOCAL-INSTANCE-METHODS", 1, 0, false);
        declareFunction(me, "interface_mark_list", "INTERFACE-MARK-LIST", 1, 0, false);
        declareFunction(me, "interface_plist", "INTERFACE-PLIST", 1, 0, false);
        declareFunction(me, "interface_definition_lock", "INTERFACE-DEFINITION-LOCK", 1, 0, false);
        declareFunction(me, "_csetf_interface_name", "_CSETF-INTERFACE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_interface_parents", "_CSETF-INTERFACE-PARENTS", 2, 0, false);
        declareFunction(me, "_csetf_interface_compiled_inheritance_path", "_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH", 2, 0, false);
        declareFunction(me, "_csetf_interface_subinterfaces", "_CSETF-INTERFACE-SUBINTERFACES", 2, 0, false);
        declareFunction(me, "_csetf_interface_implementers", "_CSETF-INTERFACE-IMPLEMENTERS", 2, 0, false);
        declareFunction(me, "_csetf_interface_instance_method_decls", "_CSETF-INTERFACE-INSTANCE-METHOD-DECLS", 2, 0, false);
        declareFunction(me, "_csetf_interface_class_method_decls", "_CSETF-INTERFACE-CLASS-METHOD-DECLS", 2, 0, false);
        declareFunction(me, "_csetf_interface_compiled_instance_method_decls", "_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS", 2, 0, false);
        declareFunction(me, "_csetf_interface_compiled_class_method_decls", "_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS", 2, 0, false);
        declareFunction(me, "_csetf_interface_local_class_methods", "_CSETF-INTERFACE-LOCAL-CLASS-METHODS", 2, 0, false);
        declareFunction(me, "_csetf_interface_local_instance_methods", "_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS", 2, 0, false);
        declareFunction(me, "_csetf_interface_mark_list", "_CSETF-INTERFACE-MARK-LIST", 2, 0, false);
        declareFunction(me, "_csetf_interface_plist", "_CSETF-INTERFACE-PLIST", 2, 0, false);
        declareFunction(me, "_csetf_interface_definition_lock", "_CSETF-INTERFACE-DEFINITION-LOCK", 2, 0, false);
        declareFunction(me, "make_interface", "MAKE-INTERFACE", 0, 1, false);
        declareFunction(me, "visit_defstruct_interface", "VISIT-DEFSTRUCT-INTERFACE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_interface_method", "VISIT-DEFSTRUCT-OBJECT-INTERFACE-METHOD", 2, 0, false);
        declareMacro(me, "with_interface", "WITH-INTERFACE");
        declareMacro(me, "with_interface_private", "WITH-INTERFACE-PRIVATE");
        declareFunction(me, "print_interface", "PRINT-INTERFACE", 3, 0, false);
        declareFunction(me, "method_print_function_trampoline", "METHOD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "method_p", "METHOD-P", 1, 0, false);
        new subloop_structures.$method_p$UnaryFunction();
        declareFunction(me, "method_name", "METHOD-NAME", 1, 0, false);
        declareFunction(me, "method_class_name", "METHOD-CLASS-NAME", 1, 0, false);
        declareFunction(me, "method_lambda_list", "METHOD-LAMBDA-LIST", 1, 0, false);
        declareFunction(me, "method_body", "METHOD-BODY", 1, 0, false);
        declareFunction(me, "method_protection", "METHOD-PROTECTION", 1, 0, false);
        declareFunction(me, "method_scope", "METHOD-SCOPE", 1, 0, false);
        declareFunction(me, "method_update_type", "METHOD-UPDATE-TYPE", 1, 0, false);
        declareFunction(me, "method_function_name", "METHOD-FUNCTION-NAME", 1, 0, false);
        declareFunction(me, "method_function_def", "METHOD-FUNCTION-DEF", 1, 0, false);
        declareFunction(me, "method_before_listeners", "METHOD-BEFORE-LISTENERS", 1, 0, false);
        declareFunction(me, "method_after_listeners", "METHOD-AFTER-LISTENERS", 1, 0, false);
        declareFunction(me, "method_instantiate_template", "METHOD-INSTANTIATE-TEMPLATE", 1, 0, false);
        declareFunction(me, "_csetf_method_name", "_CSETF-METHOD-NAME", 2, 0, false);
        declareFunction(me, "_csetf_method_class_name", "_CSETF-METHOD-CLASS-NAME", 2, 0, false);
        declareFunction(me, "_csetf_method_lambda_list", "_CSETF-METHOD-LAMBDA-LIST", 2, 0, false);
        declareFunction(me, "_csetf_method_body", "_CSETF-METHOD-BODY", 2, 0, false);
        declareFunction(me, "_csetf_method_protection", "_CSETF-METHOD-PROTECTION", 2, 0, false);
        declareFunction(me, "_csetf_method_scope", "_CSETF-METHOD-SCOPE", 2, 0, false);
        declareFunction(me, "_csetf_method_update_type", "_CSETF-METHOD-UPDATE-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_method_function_name", "_CSETF-METHOD-FUNCTION-NAME", 2, 0, false);
        declareFunction(me, "_csetf_method_function_def", "_CSETF-METHOD-FUNCTION-DEF", 2, 0, false);
        declareFunction(me, "_csetf_method_before_listeners", "_CSETF-METHOD-BEFORE-LISTENERS", 2, 0, false);
        declareFunction(me, "_csetf_method_after_listeners", "_CSETF-METHOD-AFTER-LISTENERS", 2, 0, false);
        declareFunction(me, "_csetf_method_instantiate_template", "_CSETF-METHOD-INSTANTIATE-TEMPLATE", 2, 0, false);
        declareFunction(me, "make_method", "MAKE-METHOD", 0, 1, false);
        declareFunction(me, "visit_defstruct_method", "VISIT-DEFSTRUCT-METHOD", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_method_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-METHOD", 2, 0, false);
        declareMacro(me, "with_method", "WITH-METHOD");
        declareMacro(me, "with_method_private", "WITH-METHOD-PRIVATE");
        declareFunction(me, "print_method", "PRINT-METHOD", 3, 0, false);
        declareFunction(me, "tablify_method_list", "TABLIFY-METHOD-LIST", 1, 0, false);
        declareFunction(me, "method_trace_print_function_trampoline", "METHOD-TRACE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "method_trace_p", "METHOD-TRACE-P", 1, 0, false);
        new subloop_structures.$method_trace_p$UnaryFunction();
        declareFunction(me, "method_trace_name", "METHOD-TRACE-NAME", 1, 0, false);
        declareFunction(me, "method_trace_class_name", "METHOD-TRACE-CLASS-NAME", 1, 0, false);
        declareFunction(me, "method_trace_function", "METHOD-TRACE-FUNCTION", 1, 0, false);
        declareFunction(me, "method_trace_outer", "METHOD-TRACE-OUTER", 1, 0, false);
        declareFunction(me, "_csetf_method_trace_name", "_CSETF-METHOD-TRACE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_method_trace_class_name", "_CSETF-METHOD-TRACE-CLASS-NAME", 2, 0, false);
        declareFunction(me, "_csetf_method_trace_function", "_CSETF-METHOD-TRACE-FUNCTION", 2, 0, false);
        declareFunction(me, "_csetf_method_trace_outer", "_CSETF-METHOD-TRACE-OUTER", 2, 0, false);
        declareFunction(me, "make_method_trace", "MAKE-METHOD-TRACE", 0, 1, false);
        declareFunction(me, "visit_defstruct_method_trace", "VISIT-DEFSTRUCT-METHOD-TRACE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_method_trace_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-TRACE-METHOD", 2, 0, false);
        declareMacro(me, "with_method_trace", "WITH-METHOD-TRACE");
        declareMacro(me, "with_method_trace_private", "WITH-METHOD-TRACE-PRIVATE");
        declareFunction(me, "print_method_trace", "PRINT-METHOD-TRACE", 3, 0, false);
        declareFunction(me, "push_method_trace", "PUSH-METHOD-TRACE", 3, 0, false);
        declareFunction(me, "method_info_print_function_trampoline", "METHOD-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "method_info_p", "METHOD-INFO-P", 1, 0, false);
        new subloop_structures.$method_info_p$UnaryFunction();
        declareFunction(me, "mi_method_name", "MI-METHOD-NAME", 1, 0, false);
        declareFunction(me, "mi_class_name", "MI-CLASS-NAME", 1, 0, false);
        declareFunction(me, "mi_mv_used_in_body", "MI-MV-USED-IN-BODY", 1, 0, false);
        declareFunction(me, "mi_mv_modified_in_body", "MI-MV-MODIFIED-IN-BODY", 1, 0, false);
        declareFunction(me, "mi_methods_used_in_body", "MI-METHODS-USED-IN-BODY", 1, 0, false);
        declareFunction(me, "_csetf_mi_method_name", "_CSETF-MI-METHOD-NAME", 2, 0, false);
        declareFunction(me, "_csetf_mi_class_name", "_CSETF-MI-CLASS-NAME", 2, 0, false);
        declareFunction(me, "_csetf_mi_mv_used_in_body", "_CSETF-MI-MV-USED-IN-BODY", 2, 0, false);
        declareFunction(me, "_csetf_mi_mv_modified_in_body", "_CSETF-MI-MV-MODIFIED-IN-BODY", 2, 0, false);
        declareFunction(me, "_csetf_mi_methods_used_in_body", "_CSETF-MI-METHODS-USED-IN-BODY", 2, 0, false);
        declareFunction(me, "make_method_info", "MAKE-METHOD-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_method_info", "VISIT-DEFSTRUCT-METHOD-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_method_info_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-INFO-METHOD", 2, 0, false);
        declareMacro(me, "with_method_info", "WITH-METHOD-INFO");
        declareMacro(me, "with_method_info_private", "WITH-METHOD-INFO-PRIVATE");
        declareFunction(me, "slot_listener_print_function_trampoline", "SLOT-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "slot_listener_p", "SLOT-LISTENER-P", 1, 0, false);
        new subloop_structures.$slot_listener_p$UnaryFunction();
        declareFunction(me, "sl_slot_name", "SL-SLOT-NAME", 1, 0, false);
        declareFunction(me, "sl_demon_type", "SL-DEMON-TYPE", 1, 0, false);
        declareFunction(me, "sl_value_trigger", "SL-VALUE-TRIGGER", 1, 0, false);
        declareFunction(me, "sl_functional_type", "SL-FUNCTIONAL-TYPE", 1, 0, false);
        declareFunction(me, "sl_isa_method", "SL-ISA-METHOD", 1, 0, false);
        declareFunction(me, "sl_target_instance", "SL-TARGET-INSTANCE", 1, 0, false);
        declareFunction(me, "_csetf_sl_slot_name", "_CSETF-SL-SLOT-NAME", 2, 0, false);
        declareFunction(me, "_csetf_sl_demon_type", "_CSETF-SL-DEMON-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_sl_value_trigger", "_CSETF-SL-VALUE-TRIGGER", 2, 0, false);
        declareFunction(me, "_csetf_sl_functional_type", "_CSETF-SL-FUNCTIONAL-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_sl_isa_method", "_CSETF-SL-ISA-METHOD", 2, 0, false);
        declareFunction(me, "_csetf_sl_target_instance", "_CSETF-SL-TARGET-INSTANCE", 2, 0, false);
        declareFunction(me, "make_slot_listener", "MAKE-SLOT-LISTENER", 0, 1, false);
        declareFunction(me, "visit_defstruct_slot_listener", "VISIT-DEFSTRUCT-SLOT-LISTENER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_slot_listener_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-METHOD", 2, 0, false);
        declareFunction(me, "print_slot_listener", "PRINT-SLOT-LISTENER", 3, 0, false);
        declareMacro(me, "with_slot_listener", "WITH-SLOT-LISTENER");
        declareMacro(me, "with_slot_listener_private", "WITH-SLOT-LISTENER-PRIVATE");
        declareFunction(me, "slot_listener_registry_print_function_trampoline", "SLOT-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "slot_listener_registry_p", "SLOT-LISTENER-REGISTRY-P", 1, 0, false);
        new subloop_structures.$slot_listener_registry_p$UnaryFunction();
        declareFunction(me, "slr_instance", "SLR-INSTANCE", 1, 0, false);
        declareFunction(me, "slr_slot_count", "SLR-SLOT-COUNT", 1, 0, false);
        declareFunction(me, "slr_listeners_vector", "SLR-LISTENERS-VECTOR", 1, 0, false);
        declareFunction(me, "_csetf_slr_instance", "_CSETF-SLR-INSTANCE", 2, 0, false);
        declareFunction(me, "_csetf_slr_slot_count", "_CSETF-SLR-SLOT-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_slr_listeners_vector", "_CSETF-SLR-LISTENERS-VECTOR", 2, 0, false);
        declareFunction(me, "make_slot_listener_registry", "MAKE-SLOT-LISTENER-REGISTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_slot_listener_registry", "VISIT-DEFSTRUCT-SLOT-LISTENER-REGISTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_slot_listener_registry_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-REGISTRY-METHOD", 2, 0, false);
        declareFunction(me, "print_slot_listener_registry", "PRINT-SLOT-LISTENER-REGISTRY", 3, 0, false);
        declareMacro(me, "with_slot_listener_registry", "WITH-SLOT-LISTENER-REGISTRY");
        declareMacro(me, "with_slot_listener_registry_private", "WITH-SLOT-LISTENER-REGISTRY-PRIVATE");
        declareFunction(me, "method_listener_print_function_trampoline", "METHOD-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "method_listener_p", "METHOD-LISTENER-P", 1, 0, false);
        new subloop_structures.$method_listener_p$UnaryFunction();
        declareFunction(me, "ml_owning_method_name", "ML-OWNING-METHOD-NAME", 1, 0, false);
        declareFunction(me, "ml_owning_class_name", "ML-OWNING-CLASS-NAME", 1, 0, false);
        declareFunction(me, "ml_demon_type", "ML-DEMON-TYPE", 1, 0, false);
        declareFunction(me, "ml_detail", "ML-DETAIL", 1, 0, false);
        declareFunction(me, "_csetf_ml_owning_method_name", "_CSETF-ML-OWNING-METHOD-NAME", 2, 0, false);
        declareFunction(me, "_csetf_ml_owning_class_name", "_CSETF-ML-OWNING-CLASS-NAME", 2, 0, false);
        declareFunction(me, "_csetf_ml_demon_type", "_CSETF-ML-DEMON-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_ml_detail", "_CSETF-ML-DETAIL", 2, 0, false);
        declareFunction(me, "make_method_listener", "MAKE-METHOD-LISTENER", 0, 1, false);
        declareFunction(me, "visit_defstruct_method_listener", "VISIT-DEFSTRUCT-METHOD-LISTENER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_method_listener_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-METHOD", 2, 0, false);
        declareMacro(me, "with_method_listener", "WITH-METHOD-LISTENER");
        declareMacro(me, "with_method_listener_private", "WITH-METHOD-LISTENER-PRIVATE");
        declareFunction(me, "function_detail_print_function_trampoline", "FUNCTION-DETAIL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "function_detail_p", "FUNCTION-DETAIL-P", 1, 0, false);
        new subloop_structures.$function_detail_p$UnaryFunction();
        declareFunction(me, "fd_function_name", "FD-FUNCTION-NAME", 1, 0, false);
        declareFunction(me, "fd_arglist", "FD-ARGLIST", 1, 0, false);
        declareFunction(me, "_csetf_fd_function_name", "_CSETF-FD-FUNCTION-NAME", 2, 0, false);
        declareFunction(me, "_csetf_fd_arglist", "_CSETF-FD-ARGLIST", 2, 0, false);
        declareFunction(me, "make_function_detail", "MAKE-FUNCTION-DETAIL", 0, 1, false);
        declareFunction(me, "visit_defstruct_function_detail", "VISIT-DEFSTRUCT-FUNCTION-DETAIL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_function_detail_method", "VISIT-DEFSTRUCT-OBJECT-FUNCTION-DETAIL-METHOD", 2, 0, false);
        declareMacro(me, "with_function_detail", "WITH-FUNCTION-DETAIL");
        declareMacro(me, "with_function_detail_private", "WITH-FUNCTION-DETAIL-PRIVATE");
        declareFunction(me, "method_detail_print_function_trampoline", "METHOD-DETAIL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "method_detail_p", "METHOD-DETAIL-P", 1, 0, false);
        new subloop_structures.$method_detail_p$UnaryFunction();
        declareFunction(me, "md_method_name", "MD-METHOD-NAME", 1, 0, false);
        declareFunction(me, "md_function_name", "MD-FUNCTION-NAME", 1, 0, false);
        declareFunction(me, "md_arglist", "MD-ARGLIST", 1, 0, false);
        declareFunction(me, "md_instance", "MD-INSTANCE", 1, 0, false);
        declareFunction(me, "_csetf_md_method_name", "_CSETF-MD-METHOD-NAME", 2, 0, false);
        declareFunction(me, "_csetf_md_function_name", "_CSETF-MD-FUNCTION-NAME", 2, 0, false);
        declareFunction(me, "_csetf_md_arglist", "_CSETF-MD-ARGLIST", 2, 0, false);
        declareFunction(me, "_csetf_md_instance", "_CSETF-MD-INSTANCE", 2, 0, false);
        declareFunction(me, "make_method_detail", "MAKE-METHOD-DETAIL", 0, 1, false);
        declareFunction(me, "visit_defstruct_method_detail", "VISIT-DEFSTRUCT-METHOD-DETAIL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_method_detail_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-DETAIL-METHOD", 2, 0, false);
        declareMacro(me, "with_method_detail", "WITH-METHOD-DETAIL");
        declareMacro(me, "with_method_detail_private", "WITH-METHOD-DETAIL-PRIVATE");
        declareFunction(me, "method_listener_registry_print_function_trampoline", "METHOD-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "method_listener_registry_p", "METHOD-LISTENER-REGISTRY-P", 1, 0, false);
        new subloop_structures.$method_listener_registry_p$UnaryFunction();
        declareFunction(me, "mlr_instance", "MLR-INSTANCE", 1, 0, false);
        declareFunction(me, "mlr_listener_alist", "MLR-LISTENER-ALIST", 1, 0, false);
        declareFunction(me, "_csetf_mlr_instance", "_CSETF-MLR-INSTANCE", 2, 0, false);
        declareFunction(me, "_csetf_mlr_listener_alist", "_CSETF-MLR-LISTENER-ALIST", 2, 0, false);
        declareFunction(me, "make_method_listener_registry", "MAKE-METHOD-LISTENER-REGISTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_method_listener_registry", "VISIT-DEFSTRUCT-METHOD-LISTENER-REGISTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_method_listener_registry_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-REGISTRY-METHOD", 2, 0, false);
        declareMacro(me, "with_method_listener_registry", "WITH-METHOD-LISTENER-REGISTRY");
        declareMacro(me, "with_method_listener_registry_private", "WITH-METHOD-LISTENER-REGISTRY-PRIVATE");
        declareFunction(me, "print_method_listener", "PRINT-METHOD-LISTENER", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_subloop_structures_file() {
        defconstant("*DTP-CLASS*", CLASS);
        defconstant("*DTP-INSTANCE*", INSTANCE);
        defconstant("*DTP-INTERFACE*", INTERFACE);
        defconstant("*DTP-METHOD*", METHOD);
        defconstant("*METHODS-INITIAL-HASHTABLE-SIZE*", $int$100);
        defvar("*METHOD-TRACE-ON*", T);
        defparameter("*METHODS-CURRENT-METHOD-TRACE*", NIL);
        defconstant("*DTP-METHOD-TRACE*", METHOD_TRACE);
        defconstant("*DTP-METHOD-INFO*", METHOD_INFO);
        defconstant("*DTP-SLOT-LISTENER*", SLOT_LISTENER);
        defconstant("*DTP-SLOT-LISTENER-REGISTRY*", SLOT_LISTENER_REGISTRY);
        defconstant("*DTP-METHOD-LISTENER*", METHOD_LISTENER);
        defconstant("*DTP-FUNCTION-DETAIL*", FUNCTION_DETAIL);
        defconstant("*DTP-METHOD-DETAIL*", METHOD_DETAIL);
        defconstant("*DTP-METHOD-LISTENER-REGISTRY*", METHOD_LISTENER_REGISTRY);
        return NIL;
    }

    public static SubLObject setup_subloop_structures_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_class$.getGlobalValue(), symbol_function(CLASS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list17);
        def_csetf(CLASS_NAME, _CSETF_CLASS_NAME);
        def_csetf(CLASS_PARENT, _CSETF_CLASS_PARENT);
        def_csetf(CLASS_SUBCLASSES, _CSETF_CLASS_SUBCLASSES);
        def_csetf(CLASS_INTERFACE_NAMES, _CSETF_CLASS_INTERFACE_NAMES);
        def_csetf(CLASS_INTERFACES, _CSETF_CLASS_INTERFACES);
        def_csetf(CLASS_COMPILED_INHERITANCE_PATH, _CSETF_CLASS_COMPILED_INHERITANCE_PATH);
        def_csetf(CLASS_INSTANCE_VAR_DECLS, _CSETF_CLASS_INSTANCE_VAR_DECLS);
        def_csetf(CLASS_CLASS_VAR_DECLS, _CSETF_CLASS_CLASS_VAR_DECLS);
        def_csetf(CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST, _CSETF_CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST);
        def_csetf(CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, _CSETF_CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST);
        def_csetf(CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST, _CSETF_CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST);
        def_csetf(CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST, _CSETF_CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST);
        def_csetf(CLASS_SLOT_ACCESSOR_ALIST, _CSETF_CLASS_SLOT_ACCESSOR_ALIST);
        def_csetf(CLASS_INSTANCE_METHOD_DECLS, _CSETF_CLASS_INSTANCE_METHOD_DECLS);
        def_csetf(CLASS_CLASS_METHOD_DECLS, _CSETF_CLASS_CLASS_METHOD_DECLS);
        def_csetf(CLASS_BOOLEAN_SLOTS, _CSETF_CLASS_BOOLEAN_SLOTS);
        def_csetf(CLASS_ANY_SLOTS, _CSETF_CLASS_ANY_SLOTS);
        def_csetf(CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST, _CSETF_CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST);
        def_csetf(CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST, _CSETF_CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST);
        def_csetf(CLASS_TABLIFIED_INSTANCE_METHODS, _CSETF_CLASS_TABLIFIED_INSTANCE_METHODS);
        def_csetf(CLASS_DEFINITION_LOCK, _CSETF_CLASS_DEFINITION_LOCK);
        def_csetf(CLASS_ACCESS_LOCK, _CSETF_CLASS_ACCESS_LOCK);
        def_csetf(CLASS_SYNCHRONIZED_SLOTS_P, _CSETF_CLASS_SYNCHRONIZED_SLOTS_P);
        def_csetf(CLASS_PLIST, _CSETF_CLASS_PLIST);
        def_csetf(CLASS_CLASS_INITIALIZATION_FUNCTION, _CSETF_CLASS_CLASS_INITIALIZATION_FUNCTION);
        def_csetf(CLASS_CLASS_INITIALIZED_P, _CSETF_CLASS_CLASS_INITIALIZED_P);
        def_csetf(CLASS_INSTANCE_INITIALIZATION_FUNCTION, _CSETF_CLASS_INSTANCE_INITIALIZATION_FUNCTION);
        def_csetf(CLASS_CLASS_PROPERTIES, _CSETF_CLASS_CLASS_PROPERTIES);
        identity(CLASS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_class$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CLASS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_instance$.getGlobalValue(), symbol_function(INSTANCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list138);
        def_csetf(INSTANCE_CLASS, _CSETF_INSTANCE_CLASS);
        def_csetf(INSTANCE_BOOLEAN_SLOTS, _CSETF_INSTANCE_BOOLEAN_SLOTS);
        def_csetf(INSTANCE_ANY_SLOTS, _CSETF_INSTANCE_ANY_SLOTS);
        def_csetf(INSTANCE_PLIST, _CSETF_INSTANCE_PLIST);
        identity(INSTANCE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_instance$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INSTANCE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_interface$.getGlobalValue(), symbol_function(INTERFACE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list164);
        def_csetf(INTERFACE_NAME, _CSETF_INTERFACE_NAME);
        def_csetf(INTERFACE_PARENTS, _CSETF_INTERFACE_PARENTS);
        def_csetf(INTERFACE_COMPILED_INHERITANCE_PATH, _CSETF_INTERFACE_COMPILED_INHERITANCE_PATH);
        def_csetf(INTERFACE_SUBINTERFACES, _CSETF_INTERFACE_SUBINTERFACES);
        def_csetf(INTERFACE_IMPLEMENTERS, _CSETF_INTERFACE_IMPLEMENTERS);
        def_csetf(INTERFACE_INSTANCE_METHOD_DECLS, _CSETF_INTERFACE_INSTANCE_METHOD_DECLS);
        def_csetf(INTERFACE_CLASS_METHOD_DECLS, _CSETF_INTERFACE_CLASS_METHOD_DECLS);
        def_csetf(INTERFACE_COMPILED_INSTANCE_METHOD_DECLS, _CSETF_INTERFACE_COMPILED_INSTANCE_METHOD_DECLS);
        def_csetf(INTERFACE_COMPILED_CLASS_METHOD_DECLS, _CSETF_INTERFACE_COMPILED_CLASS_METHOD_DECLS);
        def_csetf(INTERFACE_LOCAL_CLASS_METHODS, _CSETF_INTERFACE_LOCAL_CLASS_METHODS);
        def_csetf(INTERFACE_LOCAL_INSTANCE_METHODS, _CSETF_INTERFACE_LOCAL_INSTANCE_METHODS);
        def_csetf(INTERFACE_MARK_LIST, _CSETF_INTERFACE_MARK_LIST);
        def_csetf(INTERFACE_PLIST, _CSETF_INTERFACE_PLIST);
        def_csetf(INTERFACE_DEFINITION_LOCK, _CSETF_INTERFACE_DEFINITION_LOCK);
        identity(INTERFACE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_interface$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INTERFACE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_method$.getGlobalValue(), symbol_function(METHOD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list216);
        def_csetf(METHOD_NAME, _CSETF_METHOD_NAME);
        def_csetf(METHOD_CLASS_NAME, _CSETF_METHOD_CLASS_NAME);
        def_csetf(METHOD_LAMBDA_LIST, _CSETF_METHOD_LAMBDA_LIST);
        def_csetf(METHOD_BODY, _CSETF_METHOD_BODY);
        def_csetf(METHOD_PROTECTION, _CSETF_METHOD_PROTECTION);
        def_csetf(METHOD_SCOPE, _CSETF_METHOD_SCOPE);
        def_csetf(METHOD_UPDATE_TYPE, _CSETF_METHOD_UPDATE_TYPE);
        def_csetf(METHOD_FUNCTION_NAME, _CSETF_METHOD_FUNCTION_NAME);
        def_csetf(METHOD_FUNCTION_DEF, _CSETF_METHOD_FUNCTION_DEF);
        def_csetf(METHOD_BEFORE_LISTENERS, _CSETF_METHOD_BEFORE_LISTENERS);
        def_csetf(METHOD_AFTER_LISTENERS, _CSETF_METHOD_AFTER_LISTENERS);
        def_csetf(METHOD_INSTANTIATE_TEMPLATE, _CSETF_METHOD_INSTANTIATE_TEMPLATE);
        identity(METHOD);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_METHOD_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_method_trace$.getGlobalValue(), symbol_function(METHOD_TRACE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list267);
        def_csetf(METHOD_TRACE_NAME, _CSETF_METHOD_TRACE_NAME);
        def_csetf(METHOD_TRACE_CLASS_NAME, _CSETF_METHOD_TRACE_CLASS_NAME);
        def_csetf(METHOD_TRACE_FUNCTION, _CSETF_METHOD_TRACE_FUNCTION);
        def_csetf(METHOD_TRACE_OUTER, _CSETF_METHOD_TRACE_OUTER);
        identity(METHOD_TRACE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_trace$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_METHOD_TRACE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_method_info$.getGlobalValue(), symbol_function(METHOD_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list292);
        def_csetf(MI_METHOD_NAME, _CSETF_MI_METHOD_NAME);
        def_csetf(MI_CLASS_NAME, _CSETF_MI_CLASS_NAME);
        def_csetf(MI_MV_USED_IN_BODY, _CSETF_MI_MV_USED_IN_BODY);
        def_csetf(MI_MV_MODIFIED_IN_BODY, _CSETF_MI_MV_MODIFIED_IN_BODY);
        def_csetf(MI_METHODS_USED_IN_BODY, _CSETF_MI_METHODS_USED_IN_BODY);
        identity(METHOD_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_METHOD_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_slot_listener$.getGlobalValue(), symbol_function(SLOT_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list320);
        def_csetf(SL_SLOT_NAME, _CSETF_SL_SLOT_NAME);
        def_csetf(SL_DEMON_TYPE, _CSETF_SL_DEMON_TYPE);
        def_csetf(SL_VALUE_TRIGGER, _CSETF_SL_VALUE_TRIGGER);
        def_csetf(SL_FUNCTIONAL_TYPE, _CSETF_SL_FUNCTIONAL_TYPE);
        def_csetf(SL_ISA_METHOD, _CSETF_SL_ISA_METHOD);
        def_csetf(SL_TARGET_INSTANCE, _CSETF_SL_TARGET_INSTANCE);
        identity(SLOT_LISTENER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_slot_listener$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_slot_listener_registry$.getGlobalValue(), symbol_function(SLOT_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list352);
        def_csetf(SLR_INSTANCE, _CSETF_SLR_INSTANCE);
        def_csetf(SLR_SLOT_COUNT, _CSETF_SLR_SLOT_COUNT);
        def_csetf(SLR_LISTENERS_VECTOR, _CSETF_SLR_LISTENERS_VECTOR);
        identity(SLOT_LISTENER_REGISTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_slot_listener_registry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_REGISTRY_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_method_listener$.getGlobalValue(), symbol_function(METHOD_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list376);
        def_csetf(ML_OWNING_METHOD_NAME, _CSETF_ML_OWNING_METHOD_NAME);
        def_csetf(ML_OWNING_CLASS_NAME, _CSETF_ML_OWNING_CLASS_NAME);
        def_csetf(ML_DEMON_TYPE, _CSETF_ML_DEMON_TYPE);
        def_csetf(ML_DETAIL, _CSETF_ML_DETAIL);
        identity(METHOD_LISTENER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_listener$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_function_detail$.getGlobalValue(), symbol_function(FUNCTION_DETAIL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list400);
        def_csetf(FD_FUNCTION_NAME, _CSETF_FD_FUNCTION_NAME);
        def_csetf(FD_ARGLIST, _CSETF_FD_ARGLIST);
        identity(FUNCTION_DETAIL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_function_detail$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FUNCTION_DETAIL_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_method_detail$.getGlobalValue(), symbol_function(METHOD_DETAIL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list418);
        def_csetf(MD_METHOD_NAME, _CSETF_MD_METHOD_NAME);
        def_csetf(MD_FUNCTION_NAME, _CSETF_MD_FUNCTION_NAME);
        def_csetf(MD_ARGLIST, _CSETF_MD_ARGLIST);
        def_csetf(MD_INSTANCE, _CSETF_MD_INSTANCE);
        identity(METHOD_DETAIL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_detail$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_METHOD_DETAIL_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_method_listener_registry$.getGlobalValue(), symbol_function(METHOD_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list439);
        def_csetf(MLR_INSTANCE, _CSETF_MLR_INSTANCE);
        def_csetf(MLR_LISTENER_ALIST, _CSETF_MLR_LISTENER_ALIST);
        identity(METHOD_LISTENER_REGISTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_listener_registry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_REGISTRY_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subloop_structures_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_structures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_structures_file();
    }

    

    public static final class $class_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $parent;

        public SubLObject $subclasses;

        public SubLObject $interface_names;

        public SubLObject $interfaces;

        public SubLObject $compiled_inheritance_path;

        public SubLObject $instance_var_decls;

        public SubLObject $class_var_decls;

        public SubLObject $compiled_instance_slot_access_alist;

        public SubLObject $compiled_instance_boolean_slot_access_alist;

        public SubLObject $compiled_class_slot_access_alist;

        public SubLObject $compiled_class_boolean_slot_access_alist;

        public SubLObject $slot_accessor_alist;

        public SubLObject $instance_method_decls;

        public SubLObject $class_method_decls;

        public SubLObject $boolean_slots;

        public SubLObject $any_slots;

        public SubLObject $compiled_instance_method_access_alist;

        public SubLObject $compiled_class_method_access_alist;

        public SubLObject $tablified_instance_methods;

        public SubLObject $definition_lock;

        public SubLObject $access_lock;

        public SubLObject $synchronized_slots_p;

        public SubLObject $plist;

        public SubLObject $class_initialization_function;

        public SubLObject $class_initialized_p;

        public SubLObject $instance_initialization_function;

        public SubLObject $class_properties;

        private static final SubLStructDeclNative structDecl;

        private $class_native() {
            this.$name = Lisp.NIL;
            this.$parent = Lisp.NIL;
            this.$subclasses = Lisp.NIL;
            this.$interface_names = Lisp.NIL;
            this.$interfaces = Lisp.NIL;
            this.$compiled_inheritance_path = Lisp.NIL;
            this.$instance_var_decls = Lisp.NIL;
            this.$class_var_decls = Lisp.NIL;
            this.$compiled_instance_slot_access_alist = Lisp.NIL;
            this.$compiled_instance_boolean_slot_access_alist = Lisp.NIL;
            this.$compiled_class_slot_access_alist = Lisp.NIL;
            this.$compiled_class_boolean_slot_access_alist = Lisp.NIL;
            this.$slot_accessor_alist = Lisp.NIL;
            this.$instance_method_decls = Lisp.NIL;
            this.$class_method_decls = Lisp.NIL;
            this.$boolean_slots = Lisp.NIL;
            this.$any_slots = Lisp.NIL;
            this.$compiled_instance_method_access_alist = Lisp.NIL;
            this.$compiled_class_method_access_alist = Lisp.NIL;
            this.$tablified_instance_methods = Lisp.NIL;
            this.$definition_lock = Lisp.NIL;
            this.$access_lock = Lisp.NIL;
            this.$synchronized_slots_p = Lisp.NIL;
            this.$plist = Lisp.NIL;
            this.$class_initialization_function = Lisp.NIL;
            this.$class_initialized_p = Lisp.NIL;
            this.$instance_initialization_function = Lisp.NIL;
            this.$class_properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$parent;
        }

        @Override
        public SubLObject getField4() {
            return this.$subclasses;
        }

        @Override
        public SubLObject getField5() {
            return this.$interface_names;
        }

        @Override
        public SubLObject getField6() {
            return this.$interfaces;
        }

        @Override
        public SubLObject getField7() {
            return this.$compiled_inheritance_path;
        }

        @Override
        public SubLObject getField8() {
            return this.$instance_var_decls;
        }

        @Override
        public SubLObject getField9() {
            return this.$class_var_decls;
        }

        @Override
        public SubLObject getField10() {
            return this.$compiled_instance_slot_access_alist;
        }

        @Override
        public SubLObject getField11() {
            return this.$compiled_instance_boolean_slot_access_alist;
        }

        @Override
        public SubLObject getField12() {
            return this.$compiled_class_slot_access_alist;
        }

        @Override
        public SubLObject getField13() {
            return this.$compiled_class_boolean_slot_access_alist;
        }

        @Override
        public SubLObject getField14() {
            return this.$slot_accessor_alist;
        }

        @Override
        public SubLObject getField15() {
            return this.$instance_method_decls;
        }

        @Override
        public SubLObject getField16() {
            return this.$class_method_decls;
        }

        @Override
        public SubLObject getField17() {
            return this.$boolean_slots;
        }

        @Override
        public SubLObject getField18() {
            return this.$any_slots;
        }

        @Override
        public SubLObject getField19() {
            return this.$compiled_instance_method_access_alist;
        }

        @Override
        public SubLObject getField20() {
            return this.$compiled_class_method_access_alist;
        }

        public SubLObject getField21() {
            return this.$tablified_instance_methods;
        }

        public SubLObject getField22() {
            return this.$definition_lock;
        }

        public SubLObject getField23() {
            return this.$access_lock;
        }

        public SubLObject getField24() {
            return this.$synchronized_slots_p;
        }

        public SubLObject getField25() {
            return this.$plist;
        }

        public SubLObject getField26() {
            return this.$class_initialization_function;
        }

        public SubLObject getField27() {
            return this.$class_initialized_p;
        }

        public SubLObject getField28() {
            return this.$instance_initialization_function;
        }

        public SubLObject getField29() {
            return this.$class_properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$parent = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$subclasses = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$interface_names = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$interfaces = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$compiled_inheritance_path = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$instance_var_decls = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$class_var_decls = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$compiled_instance_slot_access_alist = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$compiled_instance_boolean_slot_access_alist = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$compiled_class_slot_access_alist = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$compiled_class_boolean_slot_access_alist = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$slot_accessor_alist = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$instance_method_decls = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$class_method_decls = value;
        }

        @Override
        public SubLObject setField17(final SubLObject value) {
            return this.$boolean_slots = value;
        }

        @Override
        public SubLObject setField18(final SubLObject value) {
            return this.$any_slots = value;
        }

        @Override
        public SubLObject setField19(final SubLObject value) {
            return this.$compiled_instance_method_access_alist = value;
        }

        @Override
        public SubLObject setField20(final SubLObject value) {
            return this.$compiled_class_method_access_alist = value;
        }

        public SubLObject setField21(final SubLObject value) {
            return this.$tablified_instance_methods = value;
        }

        public SubLObject setField22(final SubLObject value) {
            return this.$definition_lock = value;
        }

        public SubLObject setField23(final SubLObject value) {
            return this.$access_lock = value;
        }

        public SubLObject setField24(final SubLObject value) {
            return this.$synchronized_slots_p = value;
        }

        public SubLObject setField25(final SubLObject value) {
            return this.$plist = value;
        }

        public SubLObject setField26(final SubLObject value) {
            return this.$class_initialization_function = value;
        }

        public SubLObject setField27(final SubLObject value) {
            return this.$class_initialized_p = value;
        }

        public SubLObject setField28(final SubLObject value) {
            return this.$instance_initialization_function = value;
        }

        public SubLObject setField29(final SubLObject value) {
            return this.$class_properties = value;
        }

        static {
            structDecl = makeStructDeclNative($class_native.class, CLASS, CLASS_P, $list2, $list3, new String[]{ "$name", "$parent", "$subclasses", "$interface_names", "$interfaces", "$compiled_inheritance_path", "$instance_var_decls", "$class_var_decls", "$compiled_instance_slot_access_alist", "$compiled_instance_boolean_slot_access_alist", "$compiled_class_slot_access_alist", "$compiled_class_boolean_slot_access_alist", "$slot_accessor_alist", "$instance_method_decls", "$class_method_decls", "$boolean_slots", "$any_slots", "$compiled_instance_method_access_alist", "$compiled_class_method_access_alist", "$tablified_instance_methods", "$definition_lock", "$access_lock", "$synchronized_slots_p", "$plist", "$class_initialization_function", "$class_initialized_p", "$instance_initialization_function", "$class_properties" }, $list4, $list5, PRINT_CLASS);
        }
    }

    public static final class $class_p$UnaryFunction extends UnaryFunction {
        public $class_p$UnaryFunction() {
            super(extractFunctionNamed("CLASS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return class_p(arg1);
        }
    }

    public static final class $class_name$UnaryFunction extends UnaryFunction {
        public $class_name$UnaryFunction() {
            super(extractFunctionNamed("CLASS-NAME"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return class_name(arg1);
        }
    }

    public static final class $instance_native extends SubLStructNative {
        public SubLObject $class;

        public SubLObject $boolean_slots;

        public SubLObject $any_slots;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        private $instance_native() {
            this.$class = Lisp.NIL;
            this.$boolean_slots = Lisp.NIL;
            this.$any_slots = Lisp.NIL;
            this.$plist = Lisp.NIL;
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
            return this.$boolean_slots;
        }

        @Override
        public SubLObject getField4() {
            return this.$any_slots;
        }

        @Override
        public SubLObject getField5() {
            return this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$class = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$boolean_slots = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$any_slots = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative($instance_native.class, INSTANCE, INSTANCE_P, $list132, $list133, new String[]{ "$class", "$boolean_slots", "$any_slots", "$plist" }, $list134, $list135, PRINT_INSTANCE);
        }
    }

    public static final class $instance_p$UnaryFunction extends UnaryFunction {
        public $instance_p$UnaryFunction() {
            super(extractFunctionNamed("INSTANCE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return instance_p(arg1);
        }
    }

    public static final class $interface_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $parents;

        public SubLObject $compiled_inheritance_path;

        public SubLObject $subinterfaces;

        public SubLObject $implementers;

        public SubLObject $instance_method_decls;

        public SubLObject $class_method_decls;

        public SubLObject $compiled_instance_method_decls;

        public SubLObject $compiled_class_method_decls;

        public SubLObject $local_class_methods;

        public SubLObject $local_instance_methods;

        public SubLObject $mark_list;

        public SubLObject $plist;

        public SubLObject $definition_lock;

        private static final SubLStructDeclNative structDecl;

        private $interface_native() {
            this.$name = Lisp.NIL;
            this.$parents = Lisp.NIL;
            this.$compiled_inheritance_path = Lisp.NIL;
            this.$subinterfaces = Lisp.NIL;
            this.$implementers = Lisp.NIL;
            this.$instance_method_decls = Lisp.NIL;
            this.$class_method_decls = Lisp.NIL;
            this.$compiled_instance_method_decls = Lisp.NIL;
            this.$compiled_class_method_decls = Lisp.NIL;
            this.$local_class_methods = Lisp.NIL;
            this.$local_instance_methods = Lisp.NIL;
            this.$mark_list = Lisp.NIL;
            this.$plist = Lisp.NIL;
            this.$definition_lock = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$parents;
        }

        @Override
        public SubLObject getField4() {
            return this.$compiled_inheritance_path;
        }

        @Override
        public SubLObject getField5() {
            return this.$subinterfaces;
        }

        @Override
        public SubLObject getField6() {
            return this.$implementers;
        }

        @Override
        public SubLObject getField7() {
            return this.$instance_method_decls;
        }

        @Override
        public SubLObject getField8() {
            return this.$class_method_decls;
        }

        @Override
        public SubLObject getField9() {
            return this.$compiled_instance_method_decls;
        }

        @Override
        public SubLObject getField10() {
            return this.$compiled_class_method_decls;
        }

        @Override
        public SubLObject getField11() {
            return this.$local_class_methods;
        }

        @Override
        public SubLObject getField12() {
            return this.$local_instance_methods;
        }

        @Override
        public SubLObject getField13() {
            return this.$mark_list;
        }

        @Override
        public SubLObject getField14() {
            return this.$plist;
        }

        @Override
        public SubLObject getField15() {
            return this.$definition_lock;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$parents = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$compiled_inheritance_path = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$subinterfaces = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$implementers = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$instance_method_decls = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$class_method_decls = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$compiled_instance_method_decls = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$compiled_class_method_decls = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$local_class_methods = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$local_instance_methods = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$mark_list = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$plist = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$definition_lock = value;
        }

        static {
            structDecl = makeStructDeclNative($interface_native.class, INTERFACE, INTERFACE_P, $list158, $list159, new String[]{ "$name", "$parents", "$compiled_inheritance_path", "$subinterfaces", "$implementers", "$instance_method_decls", "$class_method_decls", "$compiled_instance_method_decls", "$compiled_class_method_decls", "$local_class_methods", "$local_instance_methods", "$mark_list", "$plist", "$definition_lock" }, $list160, $list161, PRINT_INTERFACE);
        }
    }

    public static final class $interface_p$UnaryFunction extends UnaryFunction {
        public $interface_p$UnaryFunction() {
            super(extractFunctionNamed("INTERFACE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return interface_p(arg1);
        }
    }

    public static final class $method_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $class_name;

        public SubLObject $lambda_list;

        public SubLObject $body;

        public SubLObject $protection;

        public SubLObject $scope;

        public SubLObject $update_type;

        public SubLObject $function_name;

        public SubLObject $function_def;

        public SubLObject $before_listeners;

        public SubLObject $after_listeners;

        public SubLObject $instantiate_template;

        private static final SubLStructDeclNative structDecl;

        private $method_native() {
            this.$name = Lisp.NIL;
            this.$class_name = Lisp.NIL;
            this.$lambda_list = Lisp.NIL;
            this.$body = Lisp.NIL;
            this.$protection = Lisp.NIL;
            this.$scope = Lisp.NIL;
            this.$update_type = Lisp.NIL;
            this.$function_name = Lisp.NIL;
            this.$function_def = Lisp.NIL;
            this.$before_listeners = Lisp.NIL;
            this.$after_listeners = Lisp.NIL;
            this.$instantiate_template = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$class_name;
        }

        @Override
        public SubLObject getField4() {
            return this.$lambda_list;
        }

        @Override
        public SubLObject getField5() {
            return this.$body;
        }

        @Override
        public SubLObject getField6() {
            return this.$protection;
        }

        @Override
        public SubLObject getField7() {
            return this.$scope;
        }

        @Override
        public SubLObject getField8() {
            return this.$update_type;
        }

        @Override
        public SubLObject getField9() {
            return this.$function_name;
        }

        @Override
        public SubLObject getField10() {
            return this.$function_def;
        }

        @Override
        public SubLObject getField11() {
            return this.$before_listeners;
        }

        @Override
        public SubLObject getField12() {
            return this.$after_listeners;
        }

        @Override
        public SubLObject getField13() {
            return this.$instantiate_template;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$class_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$lambda_list = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$body = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$protection = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$scope = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$update_type = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$function_name = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$function_def = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$before_listeners = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$after_listeners = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$instantiate_template = value;
        }

        static {
            structDecl = makeStructDeclNative($method_native.class, METHOD, METHOD_P, $list210, $list211, new String[]{ "$name", "$class_name", "$lambda_list", "$body", "$protection", "$scope", "$update_type", "$function_name", "$function_def", "$before_listeners", "$after_listeners", "$instantiate_template" }, $list212, $list213, PRINT_METHOD);
        }
    }

    public static final class $method_p$UnaryFunction extends UnaryFunction {
        public $method_p$UnaryFunction() {
            super(extractFunctionNamed("METHOD-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return method_p(arg1);
        }
    }

    public static final class $method_trace_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $class_name;

        public SubLObject $function;

        public SubLObject $outer;

        private static final SubLStructDeclNative structDecl;

        private $method_trace_native() {
            this.$name = Lisp.NIL;
            this.$class_name = Lisp.NIL;
            this.$function = Lisp.NIL;
            this.$outer = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$class_name;
        }

        @Override
        public SubLObject getField4() {
            return this.$function;
        }

        @Override
        public SubLObject getField5() {
            return this.$outer;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$class_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$function = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$outer = value;
        }

        static {
            structDecl = makeStructDeclNative($method_trace_native.class, METHOD_TRACE, METHOD_TRACE_P, $list261, $list262, new String[]{ "$name", "$class_name", "$function", "$outer" }, $list263, $list264, PRINT_METHOD_TRACE);
        }
    }

    public static final class $method_trace_p$UnaryFunction extends UnaryFunction {
        public $method_trace_p$UnaryFunction() {
            super(extractFunctionNamed("METHOD-TRACE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return method_trace_p(arg1);
        }
    }

    public static final class $method_info_native extends SubLStructNative {
        public SubLObject $method_name;

        public SubLObject $class_name;

        public SubLObject $mv_used_in_body;

        public SubLObject $mv_modified_in_body;

        public SubLObject $methods_used_in_body;

        private static final SubLStructDeclNative structDecl;

        private $method_info_native() {
            this.$method_name = Lisp.NIL;
            this.$class_name = Lisp.NIL;
            this.$mv_used_in_body = Lisp.NIL;
            this.$mv_modified_in_body = Lisp.NIL;
            this.$methods_used_in_body = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$method_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$class_name;
        }

        @Override
        public SubLObject getField4() {
            return this.$mv_used_in_body;
        }

        @Override
        public SubLObject getField5() {
            return this.$mv_modified_in_body;
        }

        @Override
        public SubLObject getField6() {
            return this.$methods_used_in_body;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$method_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$class_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$mv_used_in_body = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$mv_modified_in_body = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$methods_used_in_body = value;
        }

        static {
            structDecl = makeStructDeclNative($method_info_native.class, METHOD_INFO, METHOD_INFO_P, $list286, $list287, new String[]{ "$method_name", "$class_name", "$mv_used_in_body", "$mv_modified_in_body", "$methods_used_in_body" }, $list288, $list289, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $method_info_p$UnaryFunction extends UnaryFunction {
        public $method_info_p$UnaryFunction() {
            super(extractFunctionNamed("METHOD-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return method_info_p(arg1);
        }
    }

    public static final class $slot_listener_native extends SubLStructNative {
        public SubLObject $slot_name;

        public SubLObject $demon_type;

        public SubLObject $value_trigger;

        public SubLObject $functional_type;

        public SubLObject $isa_method;

        public SubLObject $target_instance;

        private static final SubLStructDeclNative structDecl;

        private $slot_listener_native() {
            this.$slot_name = Lisp.NIL;
            this.$demon_type = Lisp.NIL;
            this.$value_trigger = Lisp.NIL;
            this.$functional_type = Lisp.NIL;
            this.$isa_method = Lisp.NIL;
            this.$target_instance = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$slot_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$demon_type;
        }

        @Override
        public SubLObject getField4() {
            return this.$value_trigger;
        }

        @Override
        public SubLObject getField5() {
            return this.$functional_type;
        }

        @Override
        public SubLObject getField6() {
            return this.$isa_method;
        }

        @Override
        public SubLObject getField7() {
            return this.$target_instance;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$slot_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$demon_type = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$value_trigger = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$functional_type = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$isa_method = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$target_instance = value;
        }

        static {
            structDecl = makeStructDeclNative($slot_listener_native.class, SLOT_LISTENER, SLOT_LISTENER_P, $list314, $list315, new String[]{ "$slot_name", "$demon_type", "$value_trigger", "$functional_type", "$isa_method", "$target_instance" }, $list316, $list317, PRINT_SLOT_LISTENER);
        }
    }

    public static final class $slot_listener_p$UnaryFunction extends UnaryFunction {
        public $slot_listener_p$UnaryFunction() {
            super(extractFunctionNamed("SLOT-LISTENER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return slot_listener_p(arg1);
        }
    }

    public static final class $slot_listener_registry_native extends SubLStructNative {
        public SubLObject $instance;

        public SubLObject $slot_count;

        public SubLObject $listeners_vector;

        private static final SubLStructDeclNative structDecl;

        private $slot_listener_registry_native() {
            this.$instance = Lisp.NIL;
            this.$slot_count = Lisp.NIL;
            this.$listeners_vector = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$instance;
        }

        @Override
        public SubLObject getField3() {
            return this.$slot_count;
        }

        @Override
        public SubLObject getField4() {
            return this.$listeners_vector;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$instance = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$slot_count = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$listeners_vector = value;
        }

        static {
            structDecl = makeStructDeclNative($slot_listener_registry_native.class, SLOT_LISTENER_REGISTRY, SLOT_LISTENER_REGISTRY_P, $list347, $list348, new String[]{ "$instance", "$slot_count", "$listeners_vector" }, $list349, $list350, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $slot_listener_registry_p$UnaryFunction extends UnaryFunction {
        public $slot_listener_registry_p$UnaryFunction() {
            super(extractFunctionNamed("SLOT-LISTENER-REGISTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return slot_listener_registry_p(arg1);
        }
    }

    public static final class $method_listener_native extends SubLStructNative {
        public SubLObject $owning_method_name;

        public SubLObject $owning_class_name;

        public SubLObject $demon_type;

        public SubLObject $detail;

        private static final SubLStructDeclNative structDecl;

        private $method_listener_native() {
            this.$owning_method_name = Lisp.NIL;
            this.$owning_class_name = Lisp.NIL;
            this.$demon_type = Lisp.NIL;
            this.$detail = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$owning_method_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$owning_class_name;
        }

        @Override
        public SubLObject getField4() {
            return this.$demon_type;
        }

        @Override
        public SubLObject getField5() {
            return this.$detail;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$owning_method_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$owning_class_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$demon_type = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$detail = value;
        }

        static {
            structDecl = makeStructDeclNative($method_listener_native.class, METHOD_LISTENER, METHOD_LISTENER_P, $list370, $list371, new String[]{ "$owning_method_name", "$owning_class_name", "$demon_type", "$detail" }, $list372, $list373, PRINT_METHOD_LISTENER);
        }
    }

    public static final class $method_listener_p$UnaryFunction extends UnaryFunction {
        public $method_listener_p$UnaryFunction() {
            super(extractFunctionNamed("METHOD-LISTENER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return method_listener_p(arg1);
        }
    }

    public static final class $function_detail_native extends SubLStructNative {
        public SubLObject $function_name;

        public SubLObject $arglist;

        private static final SubLStructDeclNative structDecl;

        private $function_detail_native() {
            this.$function_name = Lisp.NIL;
            this.$arglist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$function_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$arglist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$function_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$arglist = value;
        }

        static {
            structDecl = makeStructDeclNative($function_detail_native.class, FUNCTION_DETAIL, FUNCTION_DETAIL_P, $list395, $list396, new String[]{ "$function_name", "$arglist" }, $list397, $list398, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $function_detail_p$UnaryFunction extends UnaryFunction {
        public $function_detail_p$UnaryFunction() {
            super(extractFunctionNamed("FUNCTION-DETAIL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return function_detail_p(arg1);
        }
    }

    public static final class $method_detail_native extends SubLStructNative {
        public SubLObject $method_name;

        public SubLObject $function_name;

        public SubLObject $arglist;

        public SubLObject $instance;

        private static final SubLStructDeclNative structDecl;

        private $method_detail_native() {
            this.$method_name = Lisp.NIL;
            this.$function_name = Lisp.NIL;
            this.$arglist = Lisp.NIL;
            this.$instance = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$method_name;
        }

        @Override
        public SubLObject getField3() {
            return this.$function_name;
        }

        @Override
        public SubLObject getField4() {
            return this.$arglist;
        }

        @Override
        public SubLObject getField5() {
            return this.$instance;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$method_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$function_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$arglist = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$instance = value;
        }

        static {
            structDecl = makeStructDeclNative($method_detail_native.class, METHOD_DETAIL, METHOD_DETAIL_P, $list413, $list414, new String[]{ "$method_name", "$function_name", "$arglist", "$instance" }, $list415, $list416, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $method_detail_p$UnaryFunction extends UnaryFunction {
        public $method_detail_p$UnaryFunction() {
            super(extractFunctionNamed("METHOD-DETAIL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return method_detail_p(arg1);
        }
    }

    public static final class $method_listener_registry_native extends SubLStructNative {
        public SubLObject $instance;

        public SubLObject $listener_alist;

        private static final SubLStructDeclNative structDecl;

        private $method_listener_registry_native() {
            this.$instance = Lisp.NIL;
            this.$listener_alist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$instance;
        }

        @Override
        public SubLObject getField3() {
            return this.$listener_alist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$instance = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$listener_alist = value;
        }

        static {
            structDecl = makeStructDeclNative($method_listener_registry_native.class, METHOD_LISTENER_REGISTRY, METHOD_LISTENER_REGISTRY_P, $list434, $list435, new String[]{ "$instance", "$listener_alist" }, $list436, $list437, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $method_listener_registry_p$UnaryFunction extends UnaryFunction {
        public $method_listener_registry_p$UnaryFunction() {
            super(extractFunctionNamed("METHOD-LISTENER-REGISTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return method_listener_registry_p(arg1);
        }
    }
}

/**
 * Total time: 1308 ms
 */
