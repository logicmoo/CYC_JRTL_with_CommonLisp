/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.LispSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CLASSES
 * source file: /cyc/top/cycl/classes.lisp
 * created:     2019/07/03 17:37:07
 */
public final class classes extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new classes();

 public static final String myName = "com.cyc.cycjava.cycl.classes";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $classes_class_slot_access_violation$ = makeSymbol("*CLASSES-CLASS-SLOT-ACCESS-VIOLATION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $classes_initial_hashtable_size$ = makeSymbol("*CLASSES-INITIAL-HASHTABLE-SIZE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $classes_class_table_update_lock$ = makeSymbol("*CLASSES-CLASS-TABLE-UPDATE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $classes_valid_class_properties$ = makeSymbol("*CLASSES-VALID-CLASS-PROPERTIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $classes_valid_slot_properties$ = makeSymbol("*CLASSES-VALID-SLOT-PROPERTIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $classes_valid_method_interface_types$ = makeSymbol("*CLASSES-VALID-METHOD-INTERFACE-TYPES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $classes_valid_method_properties$ = makeSymbol("*CLASSES-VALID-METHOD-PROPERTIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $classes_new_class_current$ = makeSymbol("*CLASSES-NEW-CLASS-CURRENT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $curclass$ = makeSymbol("*CURCLASS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$Cannot_access__A_slot__S_from_cla = makeString("Cannot access ~A slot ~S from class ~S.");

    private static final SubLInteger $int$800 = makeInteger(800);

    static private final SubLString $$$Class_Table_Update_Lock = makeString("Class Table Update Lock");

    public static final SubLSymbol $classes_class_table$ = makeSymbol("*CLASSES-CLASS-TABLE*");

    static private final SubLList $list4 = list(makeKeyword("EXTENDS"), makeKeyword("IMPLEMENTS"), makeKeyword("SLOT-LISTENERS"), makeKeyword("SYNCHRONIZED-SLOTS"), makeKeyword("ABSTRACT"));

    static private final SubLList $list5 = list(new SubLObject[] { makeKeyword("PRIVATE"), makeKeyword("PROTECTED"), makeKeyword("PUBLIC"), makeKeyword("FILE-SCOPE"), makeKeyword("SYSTEM-SCOPE"), makeKeyword("GLOBAL-SCOPE"), makeKeyword("CLASS"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"),
	    makeKeyword("VALUE"), makeKeyword("ESSENTIAL"), makeKeyword("NON-ESSENTAIL") });

    static private final SubLList $list6 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEF-CLASS-METHOD"));

    static private final SubLList $list7 = list(new SubLObject[] { makeKeyword("PRIVATE"), makeKeyword("PROTECTED"), makeKeyword("PUBLIC"), makeKeyword("FILE-SCOPE"), makeKeyword("SYSTEM-SCOPE"), makeKeyword("GLOBAL-SCOPE"), makeKeyword("DEFAULT"), makeKeyword("AUTO-UPDATE"),
	    makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("READ-ONLY"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("INSTANTIATE-TEMPLATE") });

    public static final SubLSymbol $classes_always_generate_before_listeners$ = makeSymbol("*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*");

    public static final SubLSymbol $classes_always_generate_after_listeners$ = makeSymbol("*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*");

    private static final SubLSymbol $NO_MEMBER_VARIABLES = makeKeyword("NO-MEMBER-VARIABLES");

    static private final SubLSymbol $sym17$_OPTIONAL = makeSymbol("&OPTIONAL");

    static private final SubLString $str20$_S_is_an_invalid_class_declaratio = makeString("~S is an invalid class declaration body.");

    static private final SubLString $str21$_S_is_neither_a_valid_slot_nor_va = makeString("~S is neither a valid slot nor valid method interface declaration.");

    static private final SubLString $str22$__class_name_____S = makeString("~%class-name -> ~S");

    static private final SubLString $str23$__parent_____S = makeString("~%parent -> ~S");

    static private final SubLString $str24$__subclasses_____S = makeString("~%subclasses -> ~S");

    static private final SubLString $str25$__interface_names_____S = makeString("~%interface-names -> ~S");

    static private final SubLString $str26$__interfaces_____S = makeString("~%interfaces -> ~S");

    static private final SubLString $str27$__compiled_inheritance_path_____S = makeString("~%compiled-inheritance-path -> ~S");

    static private final SubLString $str28$__instance_var_decls_____S = makeString("~%instance-var-decls -> ~S");

    static private final SubLString $str29$__class_var_decls_____S = makeString("~%class-var-decls -> ~S");

    static private final SubLString $str30$__compiled_instance_slot_access_a = makeString("~%compiled-instance-slot-access-alist -> ~S");

    static private final SubLString $str31$__compiled_instance_boolean_slot_ = makeString("~%compiled-instance-boolean-slot-access-alist -> ~S");

    static private final SubLString $str32$__compiled_class_slot_access_alis = makeString("~%compiled-class-slot-access-alist -> ~S");

    static private final SubLString $str33$__compiled_class_boolean_slot_acc = makeString("~%compiled-class-boolean-slot-access-alist -> ~S");

    static private final SubLString $str34$__slot_accessor_alist_____S = makeString("~%slot-accessor-alist -> ~S");

    static private final SubLString $str35$__instance_method_decls_____S = makeString("~%instance-method-decls -> ~S");

    static private final SubLString $str36$__class_method_decls_____S = makeString("~%class-method-decls -> ~S");

    static private final SubLString $str37$__boolean_slots_____S = makeString("~%boolean-slots -> ~S");

    static private final SubLString $str38$__any_slots_____S = makeString("~%any-slots -> ~S");

    static private final SubLString $str39$__compiled_instance_method_access = makeString("~%compiled-instance-method-access-alist -> ~S");

    static private final SubLString $str40$__compiled_class_method_access_al = makeString("~%compiled-class-method-access-alist -> ~S");

    static private final SubLString $str41$__class_initialization_function__ = makeString("~%class-initialization-function -> ~S");

    static private final SubLString $str42$__class_initialized_p_____S = makeString("~%class-initialized-p -> ~S");

    static private final SubLList $list43 = list(makeSymbol("CLASS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CLASS_ACCESS_LOCK = makeSymbol("CLASS-ACCESS-LOCK");

    private static final SubLSymbol SUBLISP_CLASS_STRUCTURE = makeSymbol("SUBLISP-CLASS-STRUCTURE");

    static private final SubLString $str48$_S_is_not_a_valid_class_name_ = makeString("~S is not a valid class name.");

    static private final SubLString $str49$NEW_CLASS__A_class_cannot_be_its_ = makeString("NEW-CLASS: A class cannot be its own superclass.  ~S can not extend ~S.");

    static private final SubLString $str50$NEW_CLASS__A_class_cannot_subclas = makeString("NEW-CLASS: A class cannot subclass its own subclass.  ~S is a subclass of ~S.");

    private static final SubLSymbol ON_DESTROY_CLASS = makeSymbol("ON-DESTROY-CLASS");

    static private final SubLString $$$Class_ = makeString("Class ");

    static private final SubLString $$$_Definition_Lock = makeString(" Definition Lock");

    static private final SubLString $$$_Access_Lock = makeString(" Access Lock");

    static private final SubLString $str56$SUBLOOP_RESERVED_INITIALIZE_ = makeString("SUBLOOP-RESERVED-INITIALIZE-");

    static private final SubLString $str57$_CLASS = makeString("-CLASS");

    static private final SubLString $str58$_INSTANCE = makeString("-INSTANCE");

    static private final SubLList $list60 = list(makeSymbol("SLOT-ACCESSOR-ASSOCIATION"));

    static private final SubLString $str63$GET_ = makeString("GET-");

    static private final SubLString $str64$_ = makeString("-");

    static private final SubLString $str65$SET_ = makeString("SET-");

    static private final SubLString $str66$___S_is_not_a_valid_class_propert = makeString("~%~S is not a valid class property list.  A class property list~\n     ~%must be a sequence of :extend followed by a class or :implements~\n     ~%followed by an interface or a list of interfaces.");

    static private final SubLString $str67$___S_is_not_a_valid_class_propert = makeString("~%~S is not a valid class property.~%If you wish to extend a class used :extend.~\n                   ~%If you wish to implement an interface, use :implements.");

    static private final SubLString $str68$___S_is_not_a_valid_class_propert = makeString("~%~S is not a valid class property.~%Only :extends and :implements are valid class properties.");

    static private final SubLString $str70$___S_is_not_a_valid_value_for_the = makeString("~%~S is not a valid value for the :extends class property.");

    static private final SubLString $str71$__Attempting_to_subclass_unknown_ = makeString("~%Attempting to subclass unknown class ~S.");

    static private final SubLString $str73$___S_is_not_a_valid_value_for_the = makeString("~%~S is not a valid value for the :implements class property.");

    static private final SubLList $list74 = cons(makeSymbol("GETTER"), makeSymbol("SETTER"));

    private static final SubLSymbol SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT = makeSymbol("SUBLOOP-GET-ACCESS-PROTECTED-INSTANCE-SLOT");

    private static final SubLSymbol SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS = makeSymbol("SLOT-LISTENERS-FAST-FIRE-ALL-SLOT-LISTENERS");

    private static final SubLSymbol $SLOT_GETTER_REGISTRY = makeKeyword("SLOT-GETTER-REGISTRY");

    static private final SubLList $list83 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list84 = list(list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLList $list85 = list(makeSymbol("VALUE"));

    private static final SubLSymbol SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT = makeSymbol("SUBLOOP-SET-ACCESS-PROTECTED-INSTANCE-SLOT");

    private static final SubLSymbol $SLOT_SETTER_REGISTRY = makeKeyword("SLOT-SETTER-REGISTRY");

    static private final SubLList $list89 = list(list(RET, makeSymbol("VALUE")));

    private static final SubLSymbol SUBLOOP_GET_INSTANCE_SLOT = makeSymbol("SUBLOOP-GET-INSTANCE-SLOT");

    private static final SubLSymbol SUBLOOP_SET_INSTANCE_SLOT = makeSymbol("SUBLOOP-SET-INSTANCE-SLOT");

    static private final SubLString $$$class = makeString("class");

    static private final SubLString $$$slot = makeString("slot");

    private static final SubLSymbol SLOT_ASSOC = makeSymbol("SLOT-ASSOC");

    private static final SubLSymbol CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST");

    private static final SubLSymbol INSTANCES_ACCESS_CHECK_INSTANCE_SLOT = makeSymbol("INSTANCES-ACCESS-CHECK-INSTANCE-SLOT");

    private static final SubLSymbol LDB_TEST = makeSymbol("LDB-TEST");

    private static final SubLSymbol INSTANCE_BOOLEAN_SLOTS = makeSymbol("INSTANCE-BOOLEAN-SLOTS");

    private static final SubLSymbol DPB = makeSymbol("DPB");

    static private final SubLList $list103 = list(makeSymbol("FIF"), makeSymbol("VALUE"), ONE_INTEGER, ZERO_INTEGER);

    private static final SubLSymbol CLASSES_ACCESS_CHECK_CLASS_SLOT = makeSymbol("CLASSES-ACCESS-CHECK-CLASS-SLOT");

    static private final SubLList $list106 = list(list(makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeSymbol("CLASS")));

    static private final SubLList $list112 = list(NIL);

    static private final SubLList $list115 = list(makeSymbol("CLASS-ANY-SLOTS"), makeSymbol("CLASS"));

    static private final SubLList $list116 = list(list(RET, NIL));

    static private final SubLList $list118 = list(list(makeSymbol("CLASS-BOOLEAN-SLOTS"), makeSymbol("CLASS")));

    static private final SubLList $list119 = list(makeSymbol("CLASS-BOOLEAN-SLOTS"), makeSymbol("CLASS"));

    static private final SubLString $str120$_P = makeString("-P");

    private static final SubLSymbol SUBLOOP_INSTANCEOF_CLASS = makeSymbol("SUBLOOP-INSTANCEOF-CLASS");

    private static final SubLSymbol SUBLOOP_INITIALIZE_SLOT = makeSymbol("SUBLOOP-INITIALIZE-SLOT");

    static private final SubLList $list125 = list(makeSymbol("NEW-INSTANCE"));

    private static final SubLSymbol SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION = makeSymbol("SUBLOOP-NOTE-CLASS-INITIALIZATION-FUNCTION");

    private static final SubLSymbol SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION = makeSymbol("SUBLOOP-NOTE-INSTANCE-INITIALIZATION-FUNCTION");

    static private final SubLString $str128$___S_is_not_a_valid_class_name_ = makeString("~%~S is not a valid class name.");

    static private final SubLString $str129$___S_is_not_a_valid_member_variab = makeString("~%~S is not a valid member variable and method decl list.");

    private static final SubLSymbol SUBLOOP_NEW_CLASS = makeSymbol("SUBLOOP-NEW-CLASS");

    private static final SubLSymbol CLASS_SET_IMPLEMENTS_SLOT_LISTENERS = makeSymbol("CLASS-SET-IMPLEMENTS-SLOT-LISTENERS");

    static private final SubLList $list133 = list(T);

    static private final SubLList $list134 = list(makeSymbol("CLASS-NAME-AND-PROPERTIES"), makeSymbol("&BODY"), makeSymbol("SLOT-DECLS"));

    static private final SubLList $list135 = cons(makeSymbol("CLASS-NAME"), makeSymbol("CLASS-PROPERTIES"));

    static private final SubLList $list145 = list(makeSymbol("CLASS"), makeSymbol("INDICATOR"));

    private static final SubLSymbol CLASS_PLIST = makeSymbol("CLASS-PLIST");

    private static final SubLSymbol CLASSES_PUTF = makeSymbol("CLASSES-PUTF");

    private static final SubLSymbol $IMPLEMENTS_SLOT_LISTENERS = makeKeyword("IMPLEMENTS-SLOT-LISTENERS");

    static private final SubLList $list150 = list(listS(makeSymbol("VAR"), makeSymbol("BASE-CLASS"), makeSymbol("LISTED-OPTIONAL-DEPTH-VAR")), makeSymbol("&BODY"), makeSymbol("FORMS"));

    static private final SubLString $$$stack = makeString("stack");

    static private final SubLString $str152$stack_element = makeString("stack-element");

    static private final SubLString $str153$actual_class = makeString("actual-class");

    static private final SubLString $str154$current_depth = makeString("current-depth");

    static private final SubLList $list157 = list(ZERO_INTEGER);

    private static final SubLSymbol NEXT_DEPTH = makeSymbol("NEXT-DEPTH");

    static private final SubLSymbol $sym163$_ = makeSymbol("+");

    static private final SubLList $list164 = list(ONE_INTEGER);

    static private final SubLList $list165 = list(makeSymbol("ACTUAL-CHILD"));

    private static final SubLSymbol CHILD_CLASS = makeSymbol("CHILD-CLASS");

    private static final SubLSymbol CLASS_SUBCLASSES = makeSymbol("CLASS-SUBCLASSES");

    static private final SubLList $list169 = list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-CHILD"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("CHILD-CLASS")));

    private static final SubLSymbol ACTUAL_CHILD = makeSymbol("ACTUAL-CHILD");

    static private final SubLList $list172 = list(makeSymbol("CONS"), makeSymbol("ACTUAL-CHILD"), makeSymbol("NEXT-DEPTH"));

    static private final SubLString $str173$__ = makeString("~%");

    static private final SubLString $str174$__ = makeString("| ");

    static private final SubLString $str175$_S_ = makeString("~S:");

    public static final SubLObject classes_reset_class_table_alt() {
	$classes_class_table$.setGlobalValue(make_hash_table($classes_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
	return T;
    }

    public static SubLObject classes_reset_class_table() {
	$classes_class_table$.setGlobalValue(make_hash_table($classes_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
	return T;
    }

    public static final SubLObject classes_get_all_classes_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_classes = NIL;
		SubLObject lock = $classes_class_table_update_lock$.getDynamicValue(thread);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    {
			SubLObject class_name = NIL;
			SubLObject v_class = NIL;
			{
			    final Iterator cdohash_iterator = getEntrySetIterator($classes_class_table$.getGlobalValue());
			    try {
				while (iteratorHasNext(cdohash_iterator)) {
				    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
				    class_name = getEntryKey(cdohash_entry);
				    v_class = getEntryValue(cdohash_entry);
				    v_classes = cons(v_class, v_classes);
				}
			    } finally {
				releaseEntrySetIterator(cdohash_iterator);
			    }
			}
		    }
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
		return v_classes;
	    }
	}
    }

    public static SubLObject classes_get_all_classes() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject v_classes = NIL;
	SubLObject release = NIL;
	try {
	    release = seize_lock($classes_class_table_update_lock$.getDynamicValue(thread));
	    SubLObject class_name = NIL;
	    SubLObject v_class = NIL;
	    final Iterator cdohash_iterator = getEntrySetIterator($classes_class_table$.getGlobalValue());
	    try {
		while (iteratorHasNext(cdohash_iterator)) {
		    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
		    class_name = getEntryKey(cdohash_entry);
		    v_class = getEntryValue(cdohash_entry);
		    v_classes = cons(v_class, v_classes);
		}
	    } finally {
		releaseEntrySetIterator(cdohash_iterator);
	    }
	} finally {
	    if (NIL != release) {
		release_lock($classes_class_table_update_lock$.getDynamicValue(thread));
	    }
	}
	return v_classes;
    }

    public static final SubLObject classes_get_all_class_names_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject class_names = NIL;
		SubLObject lock = $classes_class_table_update_lock$.getDynamicValue(thread);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    {
			SubLObject class_name = NIL;
			SubLObject v_class = NIL;
			{
			    final Iterator cdohash_iterator = getEntrySetIterator($classes_class_table$.getGlobalValue());
			    try {
				while (iteratorHasNext(cdohash_iterator)) {
				    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
				    class_name = getEntryKey(cdohash_entry);
				    v_class = getEntryValue(cdohash_entry);
				    class_names = cons(class_name, class_names);
				}
			    } finally {
				releaseEntrySetIterator(cdohash_iterator);
			    }
			}
		    }
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
		return class_names;
	    }
	}
    }

    public static SubLObject classes_get_all_class_names() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject class_names = NIL;
	SubLObject release = NIL;
	try {
	    release = seize_lock($classes_class_table_update_lock$.getDynamicValue(thread));
	    SubLObject class_name = NIL;
	    SubLObject v_class = NIL;
	    final Iterator cdohash_iterator = getEntrySetIterator($classes_class_table$.getGlobalValue());
	    try {
		while (iteratorHasNext(cdohash_iterator)) {
		    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
		    class_name = getEntryKey(cdohash_entry);
		    v_class = getEntryValue(cdohash_entry);
		    class_names = cons(class_name, class_names);
		}
	    } finally {
		releaseEntrySetIterator(cdohash_iterator);
	    }
	} finally {
	    if (NIL != release) {
		release_lock($classes_class_table_update_lock$.getDynamicValue(thread));
	    }
	}
	return class_names;
    }

    public static final SubLObject classes_protection_greater_than_or_equal(SubLObject level1, SubLObject level2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject sublist = member(level1, $classes_valid_slot_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		return NIL != member(level2, sublist, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
	    }
	}
    }

    public static SubLObject classes_protection_greater_than_or_equal_hide(SubLObject level1, final SubLObject level2) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject sublist = member(level1, $classes_valid_slot_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
	return NIL != member(level2, sublist, UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static final SubLObject classes_set_always_generate_before_listeners(SubLObject value) {
	$classes_always_generate_before_listeners$.setGlobalValue(value);
	return value;
    }

    public static SubLObject classes_set_always_generate_before_listeners_hide(SubLObject value) {
	$classes_always_generate_before_listeners$.setGlobalValue(value);
	return value;
    }

    public static final SubLObject classes_before_listeners_by_default_p_alt() {
	return $classes_always_generate_before_listeners$.getGlobalValue();
    }

    public static SubLObject classes_before_listeners_by_default_p() {
	return $classes_always_generate_before_listeners$.getGlobalValue();
    }

    public static final SubLObject classes_set_always_generate_after_listeners(SubLObject value) {
	$classes_always_generate_after_listeners$.setGlobalValue(value);
	return value;
    }

    public static SubLObject classes_set_always_generate_after_listeners_hide(SubLObject value) {
	$classes_always_generate_after_listeners$.setGlobalValue(value);
	return value;
    }

    public static final SubLObject classes_after_listeners_by_default_p_alt() {
	return $classes_always_generate_after_listeners$.getGlobalValue();
    }

    public static SubLObject classes_after_listeners_by_default_p() {
	return $classes_always_generate_after_listeners$.getGlobalValue();
    }

    public static final SubLObject classes_getf(SubLObject plist, SubLObject target_indicator) {
	{
	    SubLObject remainder = NIL;
	    for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
		{
		    SubLObject indicator = remainder.first();
		    SubLObject value = cadr(remainder);
		    if (indicator == target_indicator) {
			return value;
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject classes_getf_hide(SubLObject plist, final SubLObject target_indicator) {
	SubLObject remainder;
	SubLObject indicator;
	SubLObject value;
	for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
	    indicator = remainder.first();
	    value = cadr(remainder);
	    if (indicator.eql(target_indicator)) {
		return value;
	    }
	}
	return NIL;
    }

    public static final SubLObject classes_putf(SubLObject plist, SubLObject target_indicator, SubLObject new_value) {
	{
	    SubLObject indicator = NIL;
	    SubLObject sublist = NIL;
	    for (sublist = plist; NIL != sublist; sublist = ((NIL != plist.rest()) && plist.rest().isCons()) ? ((SubLObject) (cddr(plist))) : NIL) {
		indicator = sublist.first();
		if (indicator == target_indicator) {
		    rplaca(sublist.rest(), new_value);
		    return plist;
		}
	    }
	    return listS(target_indicator, new_value, plist);
	}
    }

    public static SubLObject classes_putf_hide(SubLObject plist, final SubLObject target_indicator, final SubLObject new_value) {
	SubLObject indicator = NIL;
	SubLObject sublist;
	for (sublist = NIL, sublist = plist; NIL != sublist; sublist = ((NIL != plist.rest()) && plist.rest().isCons()) ? cddr(plist) : NIL) {
	    indicator = sublist.first();
	    if (indicator.eql(target_indicator)) {
		rplaca(sublist.rest(), new_value);
		return plist;
	    }
	}
	return listS(target_indicator, new_value, plist);
    }

    public static final SubLObject classes_implement_slot_listeners_p(SubLObject class_properties) {
	return com.cyc.cycjava.cycl.classes.classes_getf(class_properties, $SLOT_LISTENERS);
    }

    public static SubLObject classes_implement_slot_listeners_p_hide(SubLObject class_properties) {
	return classes_getf(class_properties, $SLOT_LISTENERS);
    }

    public static final SubLObject classes_valid_slot_property_p(SubLObject v_object) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return NIL != member(v_object, $classes_valid_slot_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
	}
    }

    public static SubLObject classes_valid_slot_property_p_hide(SubLObject v_object) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return NIL != member(v_object, $classes_valid_slot_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static final SubLObject classes_list_of_valid_slot_properties_p(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	} else {
	    if (v_object.isCons()) {
		{
		    SubLObject sublist = v_object;
		    SubLObject element = NIL;
		    while (NIL != sublist) {
			element = sublist.first();
			if (element == $VALUE) {
			    if (NIL != sublist.rest()) {
				sublist = cddr(sublist);
			    } else {
				return NIL;
			    }
			} else {
			    if (NIL != com.cyc.cycjava.cycl.classes.classes_valid_slot_property_p(element)) {
				sublist = sublist.rest();
			    } else {
				return NIL;
			    }
			}
		    }
		    return T;
		}
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject classes_list_of_valid_slot_properties_p_hide(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	}
	if (v_object.isCons()) {
	    SubLObject sublist = v_object;
	    SubLObject element = NIL;
	    while (NIL != sublist) {
		element = sublist.first();
		if (element == $VALUE) {
		    if (NIL == sublist.rest()) {
			return NIL;
		    }
		    sublist = cddr(sublist);
		} else {
		    if (NIL == classes_valid_slot_property_p(element)) {
			return NIL;
		    }
		    sublist = sublist.rest();
		}
	    }
	    return T;
	}
	return NIL;
    }

    public static final SubLObject classes_list_of_valid_method_properties_p(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	} else {
	    if (v_object.isCons()) {
		{
		    SubLObject cdolist_list_var = v_object;
		    SubLObject element = NIL;
		    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), element = cdolist_list_var.first()) {
			if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_method_property_p(element)) {
			    return NIL;
			}
		    }
		}
		return T;
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject classes_list_of_valid_method_properties_p_hide(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	}
	if (v_object.isCons()) {
	    SubLObject cdolist_list_var = v_object;
	    SubLObject element = NIL;
	    element = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL == classes_valid_method_property_p(element)) {
		    return NIL;
		}
		cdolist_list_var = cdolist_list_var.rest();
		element = cdolist_list_var.first();
	    }
	    return T;
	}
	return NIL;
    }

    public static final SubLObject classes_valid_slot_name_p(SubLObject v_object) {
	return makeBoolean(((NIL != v_object) && v_object.isSymbol()) && (!v_object.isKeyword()));
    }

    public static SubLObject classes_valid_slot_name_p_hide(SubLObject v_object) {
	return makeBoolean(((NIL != v_object) && v_object.isSymbol()) && (!v_object.isKeyword()));
    }

    public static final SubLObject classes_valid_slot_decl_p(SubLObject v_object) {
	if (NIL == v_object) {
	    return NIL;
	} else {
	    if (NIL != com.cyc.cycjava.cycl.classes.classes_valid_slot_name_p(v_object)) {
		return T;
	    } else {
		if (v_object.isCons()) {
		    return makeBoolean((v_object.isCons() && (NIL != com.cyc.cycjava.cycl.classes.classes_valid_slot_name_p(v_object.first()))) && (NIL != com.cyc.cycjava.cycl.classes.classes_list_of_valid_slot_properties_p(v_object.rest())));
		} else {
		    return NIL;
		}
	    }
	}
    }

    public static SubLObject classes_valid_slot_decl_p_hide(SubLObject v_object) {
	if (NIL == v_object) {
	    return NIL;
	}
	if (NIL != classes_valid_slot_name_p(v_object)) {
	    return T;
	}
	if (v_object.isCons()) {
	    return makeBoolean((v_object.isCons() && (NIL != classes_valid_slot_name_p(v_object.first()))) && (NIL != classes_list_of_valid_slot_properties_p(v_object.rest())));
	}
	return NIL;
    }

    public static final SubLObject classes_valid_method_property_p(SubLObject v_object) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return NIL != member(v_object, $classes_valid_method_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
	}
    }

    public static SubLObject classes_valid_method_property_p_hide(SubLObject v_object) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return NIL != member(v_object, $classes_valid_method_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static final SubLObject classes_valid_method_properties_p(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	} else {
	    if (v_object.isCons()) {
		{
		    SubLObject cdolist_list_var = v_object;
		    SubLObject element = NIL;
		    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), element = cdolist_list_var.first()) {
			if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_method_property_p(element)) {
			    return NIL;
			}
		    }
		}
		return T;
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject classes_valid_method_properties_p_hide(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	}
	if (v_object.isCons()) {
	    SubLObject cdolist_list_var = v_object;
	    SubLObject element = NIL;
	    element = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL == classes_valid_method_property_p(element)) {
		    return NIL;
		}
		cdolist_list_var = cdolist_list_var.rest();
		element = cdolist_list_var.first();
	    }
	    return T;
	}
	return NIL;
    }

    public static final SubLObject classes_auto_update_p(SubLObject method_properties) {
	return NIL != member($AUTO_UPDATE, method_properties, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject classes_auto_update_p_hide(SubLObject method_properties) {
	return NIL != member($AUTO_UPDATE, method_properties, UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static final SubLObject classes_no_member_variables_p(SubLObject method_properties) {
	return NIL != member($NO_MEMBER_VARIABLES, method_properties, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject classes_no_member_variables_p_hide(SubLObject method_properties) {
	return NIL != member($NO_MEMBER_VARIABLES, method_properties, UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static final SubLObject classes_read_only_p(SubLObject method_properties) {
	return NIL != member($READ_ONLY, method_properties, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject classes_read_only_p_hide(SubLObject method_properties) {
	return NIL != member($READ_ONLY, method_properties, UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static final SubLObject classes_before_listeners_p(SubLObject method_properties) {
	return (NIL != com.cyc.cycjava.cycl.classes.classes_before_listeners_by_default_p()) || (NIL != member($BEFORE_LISTENERS, method_properties, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject classes_before_listeners_p_hide(SubLObject method_properties) {
	return (NIL != classes_before_listeners_by_default_p()) || (NIL != member($BEFORE_LISTENERS, method_properties, UNPROVIDED, UNPROVIDED)) ? T : NIL;
    }

    public static final SubLObject classes_after_listeners_p(SubLObject method_properties) {
	return (NIL != com.cyc.cycjava.cycl.classes.classes_after_listeners_by_default_p()) || (NIL != member($AFTER_LISTENERS, method_properties, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject classes_after_listeners_p_hide(SubLObject method_properties) {
	return (NIL != classes_after_listeners_by_default_p()) || (NIL != member($AFTER_LISTENERS, method_properties, UNPROVIDED, UNPROVIDED)) ? T : NIL;
    }

    public static final SubLObject classes_valid_method_interface_type_p(SubLObject v_object) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return NIL != member(v_object, $classes_valid_method_interface_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
	}
    }

    public static SubLObject classes_valid_method_interface_type_p_hide(SubLObject v_object) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return NIL != member(v_object, $classes_valid_method_interface_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static final SubLObject classes_valid_method_name_p(SubLObject v_object) {
	return makeBoolean(((NIL != v_object) && v_object.isSymbol()) && (!v_object.isKeyword()));
    }

    public static SubLObject classes_valid_method_name_p_hide(SubLObject v_object) {
	return makeBoolean(((NIL != v_object) && v_object.isSymbol()) && (!v_object.isKeyword()));
    }

    public static final SubLObject classes_valid_parameter_name_p(SubLObject v_object) {
	return makeBoolean((((NIL != v_object) && v_object.isSymbol()) && (v_object != $sym17$_OPTIONAL)) && (!v_object.isKeyword()));
    }

    public static SubLObject classes_valid_parameter_name_p_hide(SubLObject v_object) {
	return makeBoolean((((NIL != v_object) && v_object.isSymbol()) && (v_object != $sym17$_OPTIONAL)) && (!v_object.isKeyword()));
    }

    public static final SubLObject classes_valid_optional_parameter_p(SubLObject v_object) {
	return makeBoolean((NIL != com.cyc.cycjava.cycl.classes.classes_valid_parameter_name_p(v_object)) || ((v_object.isCons() && v_object.rest().isList()) && (NIL != com.cyc.cycjava.cycl.classes.classes_valid_parameter_name_p(v_object.first()))));
    }

    public static SubLObject classes_valid_optional_parameter_p_hide(SubLObject v_object) {
	return makeBoolean((NIL != classes_valid_parameter_name_p(v_object)) || ((v_object.isCons() && v_object.rest().isList()) && (NIL != classes_valid_parameter_name_p(v_object.first()))));
    }

    public static final SubLObject classes_valid_optional_parameter_list_p(SubLObject v_object) {
	if (NIL == v_object) {
	    return NIL;
	} else {
	    if (v_object.isCons()) {
		{
		    SubLObject cdolist_list_var = v_object;
		    SubLObject element = NIL;
		    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), element = cdolist_list_var.first()) {
			if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_optional_parameter_p(element)) {
			    return NIL;
			}
		    }
		}
		return T;
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject classes_valid_optional_parameter_list_p_hide(SubLObject v_object) {
	if (NIL == v_object) {
	    return NIL;
	}
	if (v_object.isCons()) {
	    SubLObject cdolist_list_var = v_object;
	    SubLObject element = NIL;
	    element = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL == classes_valid_optional_parameter_p(element)) {
		    return NIL;
		}
		cdolist_list_var = cdolist_list_var.rest();
		element = cdolist_list_var.first();
	    }
	    return T;
	}
	return NIL;
    }

    public static final SubLObject classes_valid_lambda_list_p(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	} else {
	    if (v_object.isCons()) {
		{
		    SubLObject first_element = v_object.first();
		    SubLObject rest_of_elements = v_object.rest();
		    if (first_element == $sym17$_OPTIONAL) {
			return com.cyc.cycjava.cycl.classes.classes_valid_optional_parameter_list_p(rest_of_elements);
		    } else {
			return makeBoolean((NIL != com.cyc.cycjava.cycl.classes.classes_valid_parameter_name_p(first_element)) && (NIL != com.cyc.cycjava.cycl.classes.classes_valid_lambda_list_p(rest_of_elements)));
		    }
		}
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject classes_valid_lambda_list_p_hide(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	}
	if (!v_object.isCons()) {
	    return NIL;
	}
	final SubLObject first_element = v_object.first();
	final SubLObject rest_of_elements = v_object.rest();
	if (first_element == $sym17$_OPTIONAL) {
	    return classes_valid_optional_parameter_list_p(rest_of_elements);
	}
	return makeBoolean((NIL != classes_valid_parameter_name_p(first_element)) && (NIL != classes_valid_lambda_list_p(rest_of_elements)));
    }

    public static final SubLObject classes_valid_method_interface_body_p(SubLObject v_object) {
	return sublisp_null(v_object);
    }

    public static SubLObject classes_valid_method_interface_body_p_hide(SubLObject v_object) {
	return sublisp_null(v_object);
    }

    public static final SubLObject classes_valid_method_interface_decl_p(SubLObject v_object) {
	return makeBoolean(
		(((((v_object.isCons() && (NIL != com.cyc.cycjava.cycl.classes.classes_valid_method_interface_type_p(v_object.first()))) && v_object.rest().isCons()) && (NIL != com.cyc.cycjava.cycl.classes.classes_valid_method_name_p(v_object.rest().first()))) && v_object.rest().rest().isCons())
			&& (NIL != com.cyc.cycjava.cycl.classes.classes_valid_lambda_list_p(v_object.rest().rest().first()))) && (NIL != com.cyc.cycjava.cycl.classes.classes_list_of_valid_method_properties_p(v_object.rest().rest().rest())));
    }

    public static SubLObject classes_valid_method_interface_decl_p_hide(SubLObject v_object) {
	return makeBoolean((((((v_object.isCons() && (NIL != classes_valid_method_interface_type_p(v_object.first()))) && v_object.rest().isCons()) && (NIL != classes_valid_method_name_p(v_object.rest().first()))) && v_object.rest().rest().isCons())
		&& (NIL != classes_valid_lambda_list_p(v_object.rest().rest().first()))) && (NIL != classes_list_of_valid_method_properties_p(v_object.rest().rest().rest())));
    }

    public static final SubLObject classes_method_decl_type(SubLObject method_interface_decl) {
	return method_interface_decl.first();
    }

    public static SubLObject classes_method_decl_type_hide(SubLObject method_interface_decl) {
	return method_interface_decl.first();
    }

    public static final SubLObject classes_class_method_decl_p(SubLObject method_interface_decl) {
	return eq(com.cyc.cycjava.cycl.classes.classes_method_decl_type(method_interface_decl), DEF_CLASS_METHOD);
    }

    public static SubLObject classes_class_method_decl_p_hide(SubLObject method_interface_decl) {
	return eq(classes_method_decl_type(method_interface_decl), DEF_CLASS_METHOD);
    }

    public static final SubLObject classes_instance_method_decl_p(SubLObject method_interface_decl) {
	return eq(com.cyc.cycjava.cycl.classes.classes_method_decl_type(method_interface_decl), DEF_INSTANCE_METHOD);
    }

    public static SubLObject classes_instance_method_decl_p_hide(SubLObject method_interface_decl) {
	return eq(classes_method_decl_type(method_interface_decl), DEF_INSTANCE_METHOD);
    }

    public static final SubLObject classes_method_name_given_method_decl(SubLObject method_interface_decl) {
	return cadr(method_interface_decl);
    }

    public static SubLObject classes_method_name_given_method_decl_hide(SubLObject method_interface_decl) {
	return cadr(method_interface_decl);
    }

    public static final SubLObject classes_lambda_list_given_method_decl(SubLObject method_interface_decl) {
	return cddr(method_interface_decl).first();
    }

    public static SubLObject classes_lambda_list_given_method_decl_hide(SubLObject method_interface_decl) {
	return cddr(method_interface_decl).first();
    }

    public static final SubLObject classes_properties_given_method_decl(SubLObject method_interface_decl) {
	return cddr(method_interface_decl).rest();
    }

    public static SubLObject classes_properties_given_method_decl_hide(SubLObject method_interface_decl) {
	return cddr(method_interface_decl).rest();
    }

    public static final SubLObject classes_valid_slot_or_method_decl_p(SubLObject v_object) {
	return makeBoolean((NIL != com.cyc.cycjava.cycl.classes.classes_valid_slot_decl_p(v_object)) || (NIL != com.cyc.cycjava.cycl.classes.classes_valid_method_interface_decl_p(v_object)));
    }

    public static SubLObject classes_valid_slot_or_method_decl_p_hide(SubLObject v_object) {
	return makeBoolean((NIL != classes_valid_slot_decl_p(v_object)) || (NIL != classes_valid_method_interface_decl_p(v_object)));
    }

    public static final SubLObject classes_valid_slot_or_method_decls_p(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	} else {
	    if (v_object.isCons()) {
		{
		    SubLObject cdolist_list_var = v_object;
		    SubLObject element = NIL;
		    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), element = cdolist_list_var.first()) {
			if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_slot_or_method_decl_p(element)) {
			    return NIL;
			}
		    }
		}
		return T;
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject classes_valid_slot_or_method_decls_p_hide(SubLObject v_object) {
	if (NIL == v_object) {
	    return T;
	}
	if (v_object.isCons()) {
	    SubLObject cdolist_list_var = v_object;
	    SubLObject element = NIL;
	    element = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL == classes_valid_slot_or_method_decl_p(element)) {
		    return NIL;
		}
		cdolist_list_var = cdolist_list_var.rest();
		element = cdolist_list_var.first();
	    }
	    return T;
	}
	return NIL;
    }

    public static final SubLObject classes_must_be_valid_slot_or_method_decls(SubLObject v_object) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (!((NIL == v_object) || v_object.isCons())) {
		    Errors.error($str_alt20$_S_is_an_invalid_class_declaratio, v_object);
		}
	    }
	    if (v_object.isCons()) {
		{
		    SubLObject cdolist_list_var = v_object;
		    SubLObject element = NIL;
		    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), element = cdolist_list_var.first()) {
			if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
			    if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_slot_or_method_decl_p(element)) {
				Errors.error($str_alt21$_S_is_neither_a_valid_slot_nor_va, element);
			    }
			}
		    }
		}
	    }
	    return T;
	}
    }

    public static SubLObject classes_must_be_valid_slot_or_method_decls_hide(SubLObject v_object) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != v_object)) && (!v_object.isCons())) {
	    Errors.error($str20$_S_is_an_invalid_class_declaratio, v_object);
	}
	if (v_object.isCons()) {
	    SubLObject cdolist_list_var = v_object;
	    SubLObject element = NIL;
	    element = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == classes_valid_slot_or_method_decl_p(element))) {
		    Errors.error($str21$_S_is_neither_a_valid_slot_nor_va, element);
		}
		cdolist_list_var = cdolist_list_var.rest();
		element = cdolist_list_var.first();
	    }
	}
	return T;
    }

    public static final SubLObject classes_separate_decls_into_slot_decls_and_method_decls(SubLObject slot_and_method_decls) {
	if (NIL == slot_and_method_decls) {
	    return values(NIL, NIL);
	} else {
	    {
		SubLObject slot_decls = NIL;
		SubLObject method_decls = NIL;
		SubLObject cdolist_list_var = slot_and_method_decls;
		SubLObject decl = NIL;
		for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
		    if (NIL != com.cyc.cycjava.cycl.classes.classes_valid_slot_decl_p(decl)) {
			slot_decls = cons(decl, slot_decls);
		    } else {
			if (NIL != com.cyc.cycjava.cycl.classes.classes_valid_method_interface_decl_p(decl)) {
			    method_decls = cons(decl, method_decls);
			}
		    }
		}
		return values(nreverse(slot_decls), nreverse(method_decls));
	    }
	}
    }

    public static SubLObject classes_separate_decls_into_slot_decls_and_method_decls_hide(SubLObject slot_and_method_decls) {
	if (NIL == slot_and_method_decls) {
	    return values(NIL, NIL);
	}
	SubLObject slot_decls = NIL;
	SubLObject method_decls = NIL;
	SubLObject cdolist_list_var = slot_and_method_decls;
	SubLObject decl = NIL;
	decl = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != classes_valid_slot_decl_p(decl)) {
		slot_decls = cons(decl, slot_decls);
	    } else if (NIL != classes_valid_method_interface_decl_p(decl)) {
		method_decls = cons(decl, method_decls);
	    }

	    cdolist_list_var = cdolist_list_var.rest();
	    decl = cdolist_list_var.first();
	}
	return values(nreverse(slot_decls), nreverse(method_decls));
    }

    public static final SubLObject class_separate_decls_into_class_and_instance_method_decls(SubLObject method_decls) {
	if (NIL == method_decls) {
	    return values(NIL, NIL);
	} else {
	    {
		SubLObject class_method_decls = NIL;
		SubLObject instance_method_decls = NIL;
		SubLObject cdolist_list_var = method_decls;
		SubLObject decl = NIL;
		for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
		    if (NIL != com.cyc.cycjava.cycl.classes.classes_class_method_decl_p(decl)) {
			class_method_decls = cons(decl, class_method_decls);
		    } else {
			if (NIL != com.cyc.cycjava.cycl.classes.classes_instance_method_decl_p(decl)) {
			    instance_method_decls = cons(decl, instance_method_decls);
			}
		    }
		}
		return values(nreverse(class_method_decls), nreverse(instance_method_decls));
	    }
	}
    }

    public static SubLObject class_separate_decls_into_class_and_instance_method_decls_hide(SubLObject method_decls) {
	if (NIL == method_decls) {
	    return values(NIL, NIL);
	}
	SubLObject class_method_decls = NIL;
	SubLObject instance_method_decls = NIL;
	SubLObject cdolist_list_var = method_decls;
	SubLObject decl = NIL;
	decl = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != classes_class_method_decl_p(decl)) {
		class_method_decls = cons(decl, class_method_decls);
	    } else if (NIL != classes_instance_method_decl_p(decl)) {
		instance_method_decls = cons(decl, instance_method_decls);
	    }

	    cdolist_list_var = cdolist_list_var.rest();
	    decl = cdolist_list_var.first();
	}
	return values(nreverse(class_method_decls), nreverse(instance_method_decls));
    }

    public static final SubLObject ldb_test(SubLObject spec, SubLObject integer) {
	return bytes.ldb(spec, integer).isZero() ? ((SubLObject) (NIL)) : T;
    }

    public static SubLObject ldb_test_hide(SubLObject spec, final SubLObject integer) {
	return bytes.ldb(spec, integer).isZero() ? NIL : T;
    }

    public static final SubLObject display_class(SubLObject class_name_or_class) {
	{
	    SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : class_name_or_class;
	    format(T, $str_alt22$__class_name_____S, subloop_structures.class_name(v_class));
	    format(T, $str_alt23$__parent_____S, subloop_structures.class_parent(v_class));
	    format(T, $str_alt24$__subclasses_____S, subloop_structures.class_subclasses(v_class));
	    format(T, $str_alt25$__interface_names_____S, subloop_structures.class_interface_names(v_class));
	    format(T, $str_alt26$__interfaces_____S, subloop_structures.class_interfaces(v_class));
	    format(T, $str_alt27$__compiled_inheritance_path_____S, subloop_structures.class_compiled_inheritance_path(v_class));
	    format(T, $str_alt28$__instance_var_decls_____S, subloop_structures.class_instance_var_decls(v_class));
	    format(T, $str_alt29$__class_var_decls_____S, subloop_structures.class_class_var_decls(v_class));
	    format(T, $str_alt30$__compiled_instance_slot_access_a, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
	    format(T, $str_alt31$__compiled_instance_boolean_slot_, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
	    format(T, $str_alt32$__compiled_class_slot_access_alis, subloop_structures.class_compiled_class_slot_access_alist(v_class));
	    format(T, $str_alt33$__compiled_class_boolean_slot_acc, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
	    format(T, $str_alt34$__slot_accessor_alist_____S, subloop_structures.class_slot_accessor_alist(v_class));
	    format(T, $str_alt35$__instance_method_decls_____S, subloop_structures.class_instance_method_decls(v_class));
	    format(T, $str_alt36$__class_method_decls_____S, subloop_structures.class_class_method_decls(v_class));
	    format(T, $str_alt37$__boolean_slots_____S, subloop_structures.class_boolean_slots(v_class));
	    format(T, $str_alt38$__any_slots_____S, subloop_structures.class_any_slots(v_class));
	    format(T, $str_alt39$__compiled_instance_method_access, subloop_structures.class_compiled_instance_method_access_alist(v_class));
	    format(T, $str_alt40$__compiled_class_method_access_al, subloop_structures.class_compiled_class_method_access_alist(v_class));
	    format(T, $str_alt41$__class_initialization_function__, subloop_structures.class_class_initialization_function(v_class));
	    format(T, $str_alt42$__class_initialized_p_____S, subloop_structures.class_class_initialized_p(v_class));
	    return v_class;
	}
    }

    public static SubLObject display_class_hide(SubLObject class_name_or_class) {
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
	format(T, $str22$__class_name_____S, subloop_structures.class_name(v_class));
	format(T, $str23$__parent_____S, subloop_structures.class_parent(v_class));
	format(T, $str24$__subclasses_____S, subloop_structures.class_subclasses(v_class));
	format(T, $str25$__interface_names_____S, subloop_structures.class_interface_names(v_class));
	format(T, $str26$__interfaces_____S, subloop_structures.class_interfaces(v_class));
	format(T, $str27$__compiled_inheritance_path_____S, subloop_structures.class_compiled_inheritance_path(v_class));
	format(T, $str28$__instance_var_decls_____S, subloop_structures.class_instance_var_decls(v_class));
	format(T, $str29$__class_var_decls_____S, subloop_structures.class_class_var_decls(v_class));
	format(T, $str30$__compiled_instance_slot_access_a, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
	format(T, $str31$__compiled_instance_boolean_slot_, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
	format(T, $str32$__compiled_class_slot_access_alis, subloop_structures.class_compiled_class_slot_access_alist(v_class));
	format(T, $str33$__compiled_class_boolean_slot_acc, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
	format(T, $str34$__slot_accessor_alist_____S, subloop_structures.class_slot_accessor_alist(v_class));
	format(T, $str35$__instance_method_decls_____S, subloop_structures.class_instance_method_decls(v_class));
	format(T, $str36$__class_method_decls_____S, subloop_structures.class_class_method_decls(v_class));
	format(T, $str37$__boolean_slots_____S, subloop_structures.class_boolean_slots(v_class));
	format(T, $str38$__any_slots_____S, subloop_structures.class_any_slots(v_class));
	format(T, $str39$__compiled_instance_method_access, subloop_structures.class_compiled_instance_method_access_alist(v_class));
	format(T, $str40$__compiled_class_method_access_al, subloop_structures.class_compiled_class_method_access_alist(v_class));
	format(T, $str41$__class_initialization_function__, subloop_structures.class_class_initialization_function(v_class));
	format(T, $str42$__class_initialized_p_____S, subloop_structures.class_class_initialized_p(v_class));
	return v_class;
    }

    public static final SubLObject with_class_definition_lock(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject v_class = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt43);
	    v_class = current.first();
	    current = current.rest();
	    {
		SubLObject body = current;
		return bq_cons(PROGN, body);
	    }
	}
    }

    public static SubLObject with_class_definition_lock_hide(SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject v_class = NIL;
	destructuring_bind_must_consp(current, datum, $list43);
	v_class = current.first();
	final SubLObject body;
	current = body = current.rest();
	return bq_cons(PROGN, body);
    }

    public static final SubLObject with_class_access_lock(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject v_class = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt43);
	    v_class = current.first();
	    current = current.rest();
	    {
		SubLObject body = current;
		return listS(WITH_LOCK_HELD, list(list(CLASS_ACCESS_LOCK, v_class)), body);
	    }
	}
    }

    public static SubLObject with_class_access_lock_hide(SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject v_class = NIL;
	destructuring_bind_must_consp(current, datum, $list43);
	v_class = current.first();
	final SubLObject body;
	current = body = current.rest();
	return listS(WITH_LOCK_HELD, list(list(CLASS_ACCESS_LOCK, v_class)), body);
    }

    public static final SubLObject classes_retrieve_class(SubLObject class_name) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (class_name.isSymbol()) {
		{
		    SubLObject actual_class = gethash(class_name, $classes_class_table$.getGlobalValue(), UNPROVIDED);
		    if (NIL != actual_class) {
			if (NIL == subloop_structures.class_class_initialized_p(actual_class)) {
			    {
				SubLObject function = subloop_structures.class_class_initialization_function(actual_class);
				if ((((NIL != fboundp(function)) && ($classes_new_class_current$.getDynamicValue(thread) != class_name)) && (NIL != subloop_structures.class_any_slots(actual_class))) && (NIL != subloop_structures.class_boolean_slots(actual_class))) {
				    funcall(subloop_structures.class_class_initialization_function(actual_class), actual_class);
				    subloop_structures._csetf_class_class_initialized_p(actual_class, T);
				}
			    }
			}
		    }
		    return actual_class;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_retrieve_class_hide(SubLObject class_name) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (class_name.isSymbol()) {
	    final SubLObject actual_class = gethash(class_name, $classes_class_table$.getGlobalValue(), UNPROVIDED);
	    if ((NIL != actual_class) && (NIL == subloop_structures.class_class_initialized_p(actual_class))) {
		final SubLObject function = subloop_structures.class_class_initialization_function(actual_class);
		if ((((NIL != fboundp(function)) && (!$classes_new_class_current$.getDynamicValue(thread).eql(class_name))) && (NIL != subloop_structures.class_any_slots(actual_class))) && (NIL != subloop_structures.class_boolean_slots(actual_class))) {
		    funcall(subloop_structures.class_class_initialization_function(actual_class), actual_class);
		    subloop_structures._csetf_class_class_initialized_p(actual_class, T);
		}
	    }
	    return actual_class;
	}
	return NIL;
    }

    public static final SubLObject classes_intern_class(SubLObject class_name, SubLObject v_class) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject lock = $classes_class_table_update_lock$.getDynamicValue(thread);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    if (class_name.isSymbol() && (NIL != subloop_structures.class_p(v_class))) {
			sethash(class_name, $classes_class_table$.getGlobalValue(), v_class);
		    }
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
	    }
	    return v_class;
	}
    }

    public static SubLObject classes_intern_class_hide(SubLObject class_name, final SubLObject v_class) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject release = NIL;
	try {
	    release = seize_lock($classes_class_table_update_lock$.getDynamicValue(thread));
	    if (class_name.isSymbol() && (NIL != subloop_structures.class_p(v_class))) {
		sethash(class_name, $classes_class_table$.getGlobalValue(), v_class);
	    }
	} finally {
	    if (NIL != release) {
		release_lock($classes_class_table_update_lock$.getDynamicValue(thread));
	    }
	}
	return v_class;
    }

    public static final SubLObject classes_delete_class(SubLObject class_name) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject lock = $classes_class_table_update_lock$.getDynamicValue(thread);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    if (class_name.isSymbol()) {
			remhash(class_name, $classes_class_table$.getGlobalValue());
		    }
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_delete_class_hide(SubLObject class_name) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject release = NIL;
	try {
	    release = seize_lock($classes_class_table_update_lock$.getDynamicValue(thread));
	    if (class_name.isSymbol()) {
		remhash(class_name, $classes_class_table$.getGlobalValue());
	    }
	} finally {
	    if (NIL != release) {
		release_lock($classes_class_table_update_lock$.getDynamicValue(thread));
	    }
	}
	return NIL;
    }

    public static final SubLObject classes_set_class(SubLObject symbol, SubLObject new_class) {
	if (symbol.isSymbol() && ((NIL == new_class) || (NIL != subloop_structures.class_p(new_class)))) {
	    put(symbol, SUBLISP_CLASS_STRUCTURE, new_class);
	    return new_class;
	}
	return NIL;
    }

    public static SubLObject classes_set_class_hide(SubLObject symbol, final SubLObject new_class) {
	if (symbol.isSymbol() && ((NIL == new_class) || (NIL != subloop_structures.class_p(new_class)))) {
	    put(symbol, SUBLISP_CLASS_STRUCTURE, new_class);
	    return new_class;
	}
	return NIL;
    }

    public static final SubLObject classes_get_class(SubLObject symbol) {
	if (symbol.isSymbol()) {
	    {
		SubLObject possible_class = get(symbol, SUBLISP_CLASS_STRUCTURE, UNPROVIDED);
		if (NIL != subloop_structures.class_p(possible_class)) {
		    return possible_class;
		}
	    }
	}
	return NIL;
    }

    public static SubLObject classes_get_class_hide(SubLObject symbol) {
	if (symbol.isSymbol()) {
	    final SubLObject possible_class = get(symbol, SUBLISP_CLASS_STRUCTURE, UNPROVIDED);
	    if (NIL != subloop_structures.class_p(possible_class)) {
		return possible_class;
	    }
	}
	return NIL;
    }

    public static final SubLObject classes_valid_class_property_p(SubLObject v_object) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean(v_object.isSymbol() && (NIL != member(v_object, $classes_valid_class_properties$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED)));
	}
    }

    public static SubLObject classes_valid_class_property_p_hide(SubLObject v_object) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(v_object.isSymbol() && (NIL != member(v_object, $classes_valid_class_properties$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED)));
    }

    public static final SubLObject classes_valid_instance_var_decl_p(SubLObject instance_var_decl) {
	return makeBoolean(instance_var_decl.isSymbol() || (instance_var_decl.isCons() && instance_var_decl.first().isSymbol()));
    }

    public static SubLObject classes_valid_instance_var_decl_p_hide(SubLObject instance_var_decl) {
	return makeBoolean(instance_var_decl.isSymbol() || (instance_var_decl.isCons() && instance_var_decl.first().isSymbol()));
    }

    public static final SubLObject classes_valid_instance_var_decls_p(SubLObject instance_var_decls) {
	if (instance_var_decls.isList()) {
	    {
		SubLObject cdolist_list_var = instance_var_decls;
		SubLObject instance_var_decl = NIL;
		for (instance_var_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), instance_var_decl = cdolist_list_var.first()) {
		    if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_instance_var_decl_p(instance_var_decl)) {
			return NIL;
		    }
		}
	    }
	    return T;
	}
	return NIL;
    }

    public static SubLObject classes_valid_instance_var_decls_p_hide(SubLObject instance_var_decls) {
	if (instance_var_decls.isList()) {
	    SubLObject cdolist_list_var = instance_var_decls;
	    SubLObject instance_var_decl = NIL;
	    instance_var_decl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL == classes_valid_instance_var_decl_p(instance_var_decl)) {
		    return NIL;
		}
		cdolist_list_var = cdolist_list_var.rest();
		instance_var_decl = cdolist_list_var.first();
	    }
	    return T;
	}
	return NIL;
    }

    public static final SubLObject classes_valid_class_name_p(SubLObject v_object) {
	return makeBoolean(((NIL != v_object) && v_object.isSymbol()) && (!v_object.isKeyword()));
    }

    public static SubLObject classes_valid_class_name_p_hide(SubLObject v_object) {
	return makeBoolean(((NIL != v_object) && v_object.isSymbol()) && (!v_object.isKeyword()));
    }

    public static final SubLObject classes_must_be_valid_class_name(SubLObject v_object) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_class_name_p(v_object)) {
		    Errors.error($str_alt48$_S_is_not_a_valid_class_name_, v_object);
		}
	    }
	    return T;
	}
    }

    public static SubLObject classes_must_be_valid_class_name_hide(SubLObject v_object) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == classes_valid_class_name_p(v_object))) {
	    Errors.error($str48$_S_is_not_a_valid_class_name_, v_object);
	}
	return T;
    }

    public static final SubLObject classes_unique_elements(SubLObject list_of_elements) {
	{
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = list_of_elements;
	    SubLObject element = NIL;
	    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), element = cdolist_list_var.first()) {
		if (NIL == member(element, result, UNPROVIDED, UNPROVIDED)) {
		    result = cons(element, result);
		}
	    }
	    return nreverse(result);
	}
    }

    public static SubLObject classes_unique_elements_hide(SubLObject list_of_elements) {
	SubLObject result = NIL;
	SubLObject cdolist_list_var = list_of_elements;
	SubLObject element = NIL;
	element = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL == member(element, result, UNPROVIDED, UNPROVIDED)) {
		result = cons(element, result);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    element = cdolist_list_var.first();
	}
	return nreverse(result);
    }

    public static final SubLObject new_class(SubLObject class_name, SubLObject parent_class, SubLObject parent_interfaces, SubLObject slot_and_method_decls) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding(thread);
		try {
		    $classes_new_class_current$.bind(class_name, thread);
		    com.cyc.cycjava.cycl.classes.classes_must_be_valid_class_name(class_name);
		    parent_interfaces = com.cyc.cycjava.cycl.classes.classes_unique_elements(parent_interfaces);
		    interfaces.interfaces_check_parent_interfaces(parent_interfaces);
		    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
			if (class_name == parent_class) {
			    Errors.error($str_alt49$NEW_CLASS__A_class_cannot_be_its_, class_name, parent_class);
			}
		    }
		    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
			if (NIL != com.cyc.cycjava.cycl.classes.subclassp(parent_class, class_name)) {
			    Errors.error($str_alt50$NEW_CLASS__A_class_cannot_subclas, parent_class, class_name);
			}
		    }
		    if (NIL != parent_class) {
			com.cyc.cycjava.cycl.classes.classes_must_be_valid_class_name(parent_class);
		    }
		    com.cyc.cycjava.cycl.classes.classes_must_be_valid_slot_or_method_decls(slot_and_method_decls);
		} finally {
		    $classes_new_class_current$.rebind(_prev_bind_0, thread);
		}
	    }
	    thread.resetMultipleValues();
	    {
		SubLObject slot_decls = com.cyc.cycjava.cycl.classes.classes_separate_decls_into_slot_decls_and_method_decls(slot_and_method_decls);
		SubLObject method_interface_decls = thread.secondMultipleValue();
		thread.resetMultipleValues();
		{
		    SubLObject v_class = NIL;
		    {
			SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding(thread);
			try {
			    $classes_new_class_current$.bind(class_name, thread);
			    {
				SubLObject old_class = com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name);
				SubLObject actual_interface = NIL;
				SubLObject actual_interfaces = NIL;
				SubLObject class_var_decls = NIL;
				SubLObject instance_var_decls = NIL;
				if ((NIL != old_class) && (NIL != com.cyc.cycjava.cycl.classes.subclassp(old_class, OBJECT))) {
				    {
					SubLObject association = methods.method_assoc(ON_DESTROY_CLASS, subloop_structures.class_compiled_class_method_access_alist(old_class));
					if (NIL != association) {
					    {
						SubLObject function_name = subloop_structures.method_function_name(association);
						if (NIL != fboundp(function_name)) {
						    methods.funcall_class_method_with_0_args(old_class, ON_DESTROY_CLASS);
						}
					    }
					}
				    }
				}
				v_class = (NIL != old_class) ? ((SubLObject) (old_class)) : subloop_structures.create_class();
				subloop_structures._csetf_class_class_properties(v_class, ZERO_INTEGER);
				if (NIL == old_class) {
				    subloop_structures._csetf_class_definition_lock(v_class, make_lock(cconcatenate($str_alt53$Class_, new SubLObject[] { symbol_name(class_name), $str_alt54$_Definition_Lock })));
				    subloop_structures._csetf_class_access_lock(v_class, make_lock(cconcatenate($str_alt53$Class_, new SubLObject[] { symbol_name(class_name), $str_alt55$_Access_Lock })));
				}
				{
				    SubLObject cdolist_list_var = parent_interfaces;
				    SubLObject interface_name = NIL;
				    for (interface_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), interface_name = cdolist_list_var.first()) {
					actual_interface = interfaces.interfaces_retrieve_interface(interface_name);
					if (NIL != actual_interface) {
					    actual_interfaces = cons(actual_interface, actual_interfaces);
					}
				    }
				}
				actual_interfaces = nreverse(actual_interfaces);
				{
				    SubLObject cdolist_list_var = slot_decls;
				    SubLObject decl = NIL;
				    for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
					if (NIL != com.cyc.cycjava.cycl.classes.classes_class_slot_decl_p(decl)) {
					    class_var_decls = cons(decl, class_var_decls);
					} else {
					    if (NIL != com.cyc.cycjava.cycl.classes.classes_instance_slot_decl_p(decl)) {
						instance_var_decls = cons(decl, instance_var_decls);
					    }
					}
				    }
				}
				subloop_structures._csetf_class_name(v_class, class_name);
				subloop_structures._csetf_class_parent(v_class, parent_class);
				subloop_structures._csetf_class_subclasses(v_class, NIL);
				subloop_structures._csetf_class_interface_names(v_class, parent_interfaces);
				subloop_structures._csetf_class_interfaces(v_class, actual_interfaces);
				subloop_structures._csetf_class_compiled_inheritance_path(v_class, NIL);
				subloop_structures._csetf_class_instance_var_decls(v_class, nreverse(instance_var_decls));
				subloop_structures._csetf_class_class_var_decls(v_class, nreverse(class_var_decls));
				subloop_structures._csetf_class_compiled_instance_slot_access_alist(v_class, NIL);
				subloop_structures._csetf_class_instance_method_decls(v_class, NIL);
				subloop_structures._csetf_class_class_method_decls(v_class, NIL);
				subloop_structures._csetf_class_boolean_slots(v_class, ZERO_INTEGER);
				subloop_structures._csetf_class_slot_accessor_alist(v_class, NIL);
				subloop_structures._csetf_class_any_slots(v_class, NIL);
				subloop_structures._csetf_class_compiled_instance_method_access_alist(v_class, NIL);
				subloop_structures._csetf_class_compiled_class_method_access_alist(v_class, NIL);
				subloop_structures._csetf_class_class_initialization_function(v_class, intern(cconcatenate($str_alt56$SUBLOOP_RESERVED_INITIALIZE_, new SubLObject[] { symbol_name(class_name), $str_alt57$_CLASS }), UNPROVIDED));
				subloop_structures._csetf_class_class_initialized_p(v_class, NIL);
				subloop_structures._csetf_class_instance_initialization_function(v_class, intern(cconcatenate($str_alt56$SUBLOOP_RESERVED_INITIALIZE_, new SubLObject[] { symbol_name(class_name), $str_alt58$_INSTANCE }), UNPROVIDED));
				com.cyc.cycjava.cycl.classes.classes_intern_class(class_name, v_class);
				com.cyc.cycjava.cycl.classes.classes_set_class(class_name, v_class);
				com.cyc.cycjava.cycl.classes.classes_compile_inheritance_path(v_class, UNPROVIDED);
				com.cyc.cycjava.cycl.classes.classes_compile_instance_slot_access_list(v_class, UNPROVIDED);
				com.cyc.cycjava.cycl.classes.classes_compile_instance_boolean_slot_access_list(v_class, UNPROVIDED);
				com.cyc.cycjava.cycl.classes.classes_compile_class_slot_access_list(v_class, UNPROVIDED);
				com.cyc.cycjava.cycl.classes.classes_compile_class_boolean_slot_access_list(v_class, UNPROVIDED);
				com.cyc.cycjava.cycl.classes.classes_generate_slot_accessor_names(v_class);
				com.cyc.cycjava.cycl.classes.classes_initialize_class_slots(v_class);
				thread.resetMultipleValues();
				{
				    SubLObject class_method_decls = com.cyc.cycjava.cycl.classes.class_separate_decls_into_class_and_instance_method_decls(method_interface_decls);
				    SubLObject instance_method_decls = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    thread.resetMultipleValues();
				    {
					SubLObject interface_class_methods = interfaces.interfaces_collect_method_decls(actual_interfaces);
					SubLObject interface_instance_methods = thread.secondMultipleValue();
					thread.resetMultipleValues();
					{
					    SubLObject class_methods_to_append = NIL;
					    SubLObject instance_methods_to_append = NIL;
					    {
						SubLObject cdolist_list_var = interface_class_methods;
						SubLObject method_decl = NIL;
						for (method_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), method_decl = cdolist_list_var.first()) {
						    if (NIL == member(cadr(method_decl), class_method_decls, symbol_function(EQ), symbol_function(CADR))) {
							class_methods_to_append = cons(method_decl, class_methods_to_append);
						    }
						}
					    }
					    {
						SubLObject cdolist_list_var = interface_instance_methods;
						SubLObject method_decl = NIL;
						for (method_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), method_decl = cdolist_list_var.first()) {
						    if (NIL == member(cadr(method_decl), instance_method_decls, symbol_function(EQ), symbol_function(CADR))) {
							instance_methods_to_append = cons(method_decl, instance_methods_to_append);
						    }
						}
					    }
					    class_method_decls = nconc(class_method_decls, nreverse(class_methods_to_append));
					    instance_method_decls = nconc(instance_method_decls, nreverse(instance_methods_to_append));
					}
				    }
				    {
					SubLObject method_name = NIL;
					SubLObject lambda_list = NIL;
					SubLObject v_properties = NIL;
					{
					    SubLObject cdolist_list_var = class_method_decls;
					    SubLObject decl = NIL;
					    for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
						method_name = com.cyc.cycjava.cycl.classes.classes_method_name_given_method_decl(decl);
						lambda_list = com.cyc.cycjava.cycl.classes.classes_lambda_list_given_method_decl(decl);
						v_properties = com.cyc.cycjava.cycl.classes.classes_properties_given_method_decl(decl);
						methods.methods_incorporate_class_method(method_name, class_name, v_properties, lambda_list, NIL);
					    }
					}
					{
					    SubLObject cdolist_list_var = instance_method_decls;
					    SubLObject decl = NIL;
					    for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
						method_name = com.cyc.cycjava.cycl.classes.classes_method_name_given_method_decl(decl);
						lambda_list = com.cyc.cycjava.cycl.classes.classes_lambda_list_given_method_decl(decl);
						v_properties = com.cyc.cycjava.cycl.classes.classes_properties_given_method_decl(decl);
						methods.methods_incorporate_instance_method(method_name, class_name, v_properties, lambda_list, NIL);
					    }
					}
					if (!((NIL != class_method_decls) || (NIL != instance_method_decls))) {
					    methods.methods_compile_method_access_alists(v_class);
					}
				    }
				}
			    }
			} finally {
			    $classes_new_class_current$.rebind(_prev_bind_0, thread);
			}
		    }
		    return v_class;
		}
	    }
	}
    }

    public static SubLObject new_class_hide(SubLObject class_name, final SubLObject parent_class, SubLObject parent_interfaces, final SubLObject slot_and_method_decls) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding(thread);
	try {
	    $classes_new_class_current$.bind(class_name, thread);
	    classes_must_be_valid_class_name(class_name);
	    parent_interfaces = classes_unique_elements(parent_interfaces);
	    interfaces.interfaces_check_parent_interfaces(parent_interfaces);
	    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && class_name.eql(parent_class)) {
		Errors.error($str49$NEW_CLASS__A_class_cannot_be_its_, class_name, parent_class);
	    }
	    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != subclassp(parent_class, class_name))) {
		Errors.error($str50$NEW_CLASS__A_class_cannot_subclas, parent_class, class_name);
	    }
	    if (NIL != parent_class) {
		classes_must_be_valid_class_name(parent_class);
	    }
	    classes_must_be_valid_slot_or_method_decls(slot_and_method_decls);
	} finally {
	    $classes_new_class_current$.rebind(_prev_bind_0, thread);
	}
	thread.resetMultipleValues();
	final SubLObject slot_decls = classes_separate_decls_into_slot_decls_and_method_decls(slot_and_method_decls);
	final SubLObject method_interface_decls = thread.secondMultipleValue();
	thread.resetMultipleValues();
	SubLObject v_class = NIL;
	final SubLObject _prev_bind_2 = $classes_new_class_current$.currentBinding(thread);
	try {
	    $classes_new_class_current$.bind(class_name, thread);
	    final SubLObject old_class = classes_retrieve_class(class_name);
	    SubLObject actual_interface = NIL;
	    SubLObject actual_interfaces = NIL;
	    SubLObject class_var_decls = NIL;
	    SubLObject instance_var_decls = NIL;
	    if ((NIL != old_class) && (NIL != subclassp(old_class, OBJECT))) {
		final SubLObject association = methods.method_assoc(ON_DESTROY_CLASS, subloop_structures.class_compiled_class_method_access_alist(old_class));
		if (NIL != association) {
		    final SubLObject function_name = subloop_structures.method_function_name(association);
		    if (NIL != fboundp(function_name)) {
			methods.funcall_class_method_with_0_args(old_class, ON_DESTROY_CLASS);
		    }
		}
	    }
	    v_class = (NIL != old_class) ? old_class : subloop_structures.create_class();
	    subloop_structures._csetf_class_class_properties(v_class, ZERO_INTEGER);
	    if (NIL == old_class) {
		subloop_structures._csetf_class_definition_lock(v_class, make_lock(cconcatenate($$$Class_, new SubLObject[] { symbol_name(class_name), $$$_Definition_Lock })));
		subloop_structures._csetf_class_access_lock(v_class, make_lock(cconcatenate($$$Class_, new SubLObject[] { symbol_name(class_name), $$$_Access_Lock })));
	    }
	    SubLObject cdolist_list_var = parent_interfaces;
	    SubLObject interface_name = NIL;
	    interface_name = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		actual_interface = interfaces.interfaces_retrieve_interface(interface_name);
		if (NIL != actual_interface) {
		    actual_interfaces = cons(actual_interface, actual_interfaces);
		}
		cdolist_list_var = cdolist_list_var.rest();
		interface_name = cdolist_list_var.first();
	    }
	    actual_interfaces = nreverse(actual_interfaces);
	    cdolist_list_var = slot_decls;
	    SubLObject decl = NIL;
	    decl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != classes_class_slot_decl_p(decl)) {
		    class_var_decls = cons(decl, class_var_decls);
		} else if (NIL != classes_instance_slot_decl_p(decl)) {
		    instance_var_decls = cons(decl, instance_var_decls);
		}

		cdolist_list_var = cdolist_list_var.rest();
		decl = cdolist_list_var.first();
	    }
	    subloop_structures._csetf_class_name(v_class, class_name);
	    subloop_structures._csetf_class_parent(v_class, parent_class);
	    subloop_structures._csetf_class_subclasses(v_class, NIL);
	    subloop_structures._csetf_class_interface_names(v_class, parent_interfaces);
	    subloop_structures._csetf_class_interfaces(v_class, actual_interfaces);
	    subloop_structures._csetf_class_compiled_inheritance_path(v_class, NIL);
	    subloop_structures._csetf_class_instance_var_decls(v_class, nreverse(instance_var_decls));
	    subloop_structures._csetf_class_class_var_decls(v_class, nreverse(class_var_decls));
	    subloop_structures._csetf_class_compiled_instance_slot_access_alist(v_class, NIL);
	    subloop_structures._csetf_class_instance_method_decls(v_class, NIL);
	    subloop_structures._csetf_class_class_method_decls(v_class, NIL);
	    subloop_structures._csetf_class_boolean_slots(v_class, ZERO_INTEGER);
	    subloop_structures._csetf_class_slot_accessor_alist(v_class, NIL);
	    subloop_structures._csetf_class_any_slots(v_class, NIL);
	    subloop_structures._csetf_class_compiled_instance_method_access_alist(v_class, NIL);
	    subloop_structures._csetf_class_compiled_class_method_access_alist(v_class, NIL);
	    subloop_structures._csetf_class_class_initialization_function(v_class, intern(cconcatenate($str56$SUBLOOP_RESERVED_INITIALIZE_, new SubLObject[] { symbol_name(class_name), $str57$_CLASS }), UNPROVIDED));
	    subloop_structures._csetf_class_class_initialized_p(v_class, NIL);
	    subloop_structures._csetf_class_instance_initialization_function(v_class, intern(cconcatenate($str56$SUBLOOP_RESERVED_INITIALIZE_, new SubLObject[] { symbol_name(class_name), $str58$_INSTANCE }), UNPROVIDED));
	    classes_intern_class(class_name, v_class);
	    classes_set_class(class_name, v_class);
	    classes_compile_inheritance_path(v_class, UNPROVIDED);
	    classes_compile_instance_slot_access_list(v_class, UNPROVIDED);
	    classes_compile_instance_boolean_slot_access_list(v_class, UNPROVIDED);
	    classes_compile_class_slot_access_list(v_class, UNPROVIDED);
	    classes_compile_class_boolean_slot_access_list(v_class, UNPROVIDED);
	    classes_generate_slot_accessor_names(v_class);
	    classes_initialize_class_slots(v_class);
	    thread.resetMultipleValues();
	    SubLObject class_method_decls = class_separate_decls_into_class_and_instance_method_decls(method_interface_decls);
	    SubLObject instance_method_decls = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    thread.resetMultipleValues();
	    final SubLObject interface_class_methods = interfaces.interfaces_collect_method_decls(actual_interfaces);
	    final SubLObject interface_instance_methods = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    SubLObject class_methods_to_append = NIL;
	    SubLObject instance_methods_to_append = NIL;
	    SubLObject cdolist_list_var2 = interface_class_methods;
	    SubLObject method_decl = NIL;
	    method_decl = cdolist_list_var2.first();
	    while (NIL != cdolist_list_var2) {
		if (NIL == member(cadr(method_decl), class_method_decls, symbol_function(EQ), symbol_function(CADR))) {
		    class_methods_to_append = cons(method_decl, class_methods_to_append);
		}
		cdolist_list_var2 = cdolist_list_var2.rest();
		method_decl = cdolist_list_var2.first();
	    }
	    cdolist_list_var2 = interface_instance_methods;
	    method_decl = NIL;
	    method_decl = cdolist_list_var2.first();
	    while (NIL != cdolist_list_var2) {
		if (NIL == member(cadr(method_decl), instance_method_decls, symbol_function(EQ), symbol_function(CADR))) {
		    instance_methods_to_append = cons(method_decl, instance_methods_to_append);
		}
		cdolist_list_var2 = cdolist_list_var2.rest();
		method_decl = cdolist_list_var2.first();
	    }
	    class_method_decls = nconc(class_method_decls, nreverse(class_methods_to_append));
	    instance_method_decls = nconc(instance_method_decls, nreverse(instance_methods_to_append));
	    SubLObject method_name = NIL;
	    SubLObject lambda_list = NIL;
	    SubLObject v_properties = NIL;
	    SubLObject cdolist_list_var3 = class_method_decls;
	    SubLObject decl2 = NIL;
	    decl2 = cdolist_list_var3.first();
	    while (NIL != cdolist_list_var3) {
		method_name = classes_method_name_given_method_decl(decl2);
		lambda_list = classes_lambda_list_given_method_decl(decl2);
		v_properties = classes_properties_given_method_decl(decl2);
		methods.methods_incorporate_class_method(method_name, class_name, v_properties, lambda_list, NIL);
		cdolist_list_var3 = cdolist_list_var3.rest();
		decl2 = cdolist_list_var3.first();
	    }
	    cdolist_list_var3 = instance_method_decls;
	    decl2 = NIL;
	    decl2 = cdolist_list_var3.first();
	    while (NIL != cdolist_list_var3) {
		method_name = classes_method_name_given_method_decl(decl2);
		lambda_list = classes_lambda_list_given_method_decl(decl2);
		v_properties = classes_properties_given_method_decl(decl2);
		methods.methods_incorporate_instance_method(method_name, class_name, v_properties, lambda_list, NIL);
		cdolist_list_var3 = cdolist_list_var3.rest();
		decl2 = cdolist_list_var3.first();
	    }
	    if ((NIL == class_method_decls) && (NIL == instance_method_decls)) {
		methods.methods_compile_method_access_alists(v_class);
	    }
	} finally {
	    $classes_new_class_current$.rebind(_prev_bind_2, thread);
	}
	LispSync.addClass(v_class);
	return v_class;
    }

    public static final SubLObject classes_make_slot_accessor_association(SubLObject slot_name, SubLObject getter_name, SubLObject setter_name) {
	return listS(slot_name, getter_name, setter_name);
    }

    public static SubLObject classes_make_slot_accessor_association_hide(SubLObject slot_name, final SubLObject getter_name, final SubLObject setter_name) {
	return listS(slot_name, getter_name, setter_name);
    }

    public static final SubLObject classes_slot_accessor_association_slot_name(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject slot_accessor_association = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt60);
	    slot_accessor_association = current.first();
	    current = current.rest();
	    if (NIL == current) {
		return list(CAR, slot_accessor_association);
	    } else {
		cdestructuring_bind_error(datum, $list_alt60);
	    }
	}
	return NIL;
    }

    public static SubLObject classes_slot_accessor_association_slot_name_hide(SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject slot_accessor_association = NIL;
	destructuring_bind_must_consp(current, datum, $list60);
	slot_accessor_association = current.first();
	current = current.rest();
	if (NIL == current) {
	    return list(CAR, slot_accessor_association);
	}
	cdestructuring_bind_error(datum, $list60);
	return NIL;
    }

    public static final SubLObject classes_slot_accessor_association_getter_name(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject slot_accessor_association = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt60);
	    slot_accessor_association = current.first();
	    current = current.rest();
	    if (NIL == current) {
		return list(CADR, slot_accessor_association);
	    } else {
		cdestructuring_bind_error(datum, $list_alt60);
	    }
	}
	return NIL;
    }

    public static SubLObject classes_slot_accessor_association_getter_name_hide(SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject slot_accessor_association = NIL;
	destructuring_bind_must_consp(current, datum, $list60);
	slot_accessor_association = current.first();
	current = current.rest();
	if (NIL == current) {
	    return list(CADR, slot_accessor_association);
	}
	cdestructuring_bind_error(datum, $list60);
	return NIL;
    }

    public static final SubLObject classes_slot_accessor_association_setter_name(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject slot_accessor_association = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt60);
	    slot_accessor_association = current.first();
	    current = current.rest();
	    if (NIL == current) {
		return list(CDDR, slot_accessor_association);
	    } else {
		cdestructuring_bind_error(datum, $list_alt60);
	    }
	}
	return NIL;
    }

    public static SubLObject classes_slot_accessor_association_setter_name_hide(SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject slot_accessor_association = NIL;
	destructuring_bind_must_consp(current, datum, $list60);
	slot_accessor_association = current.first();
	current = current.rest();
	if (NIL == current) {
	    return list(CDDR, slot_accessor_association);
	}
	cdestructuring_bind_error(datum, $list60);
	return NIL;
    }

    public static final SubLObject classes_retrieve_slot_getter(SubLObject v_class, SubLObject slot_name) {
	{
	    SubLObject association = assoc(slot_name, subloop_structures.class_slot_accessor_alist(v_class), UNPROVIDED, UNPROVIDED);
	    if (NIL != association) {
		return cadr(association);
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_retrieve_slot_getter_hide(SubLObject v_class, final SubLObject slot_name) {
	final SubLObject association = assoc(slot_name, subloop_structures.class_slot_accessor_alist(v_class), UNPROVIDED, UNPROVIDED);
	if (NIL != association) {
	    return cadr(association);
	}
	return NIL;
    }

    public static final SubLObject classes_retrieve_slot_setter(SubLObject v_class, SubLObject slot_name) {
	{
	    SubLObject association = assoc(slot_name, subloop_structures.class_slot_accessor_alist(v_class), UNPROVIDED, UNPROVIDED);
	    if (NIL != association) {
		return cddr(association);
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_retrieve_slot_setter_hide(SubLObject v_class, final SubLObject slot_name) {
	final SubLObject association = assoc(slot_name, subloop_structures.class_slot_accessor_alist(v_class), UNPROVIDED, UNPROVIDED);
	if (NIL != association) {
	    return cddr(association);
	}
	return NIL;
    }

    public static final SubLObject classes_generate_slot_accessor_names(SubLObject v_class) {
	{
	    SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
	    SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
	    SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
	    SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
	    SubLObject class_name = subloop_structures.class_name(v_class);
	    SubLObject slot_accessor_alist = NIL;
	    {
		SubLObject slot_name = NIL;
		SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
		SubLObject slot = NIL;
		for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
		    slot_name = slots.slot_name(slot);
		    slot_accessor_alist = cons(com.cyc.cycjava.cycl.classes.classes_make_slot_accessor_association(slot_name, intern(cconcatenate($str_alt63$GET_, new SubLObject[] { symbol_name(class_name), $str_alt64$_, symbol_name(slot_name) }), UNPROVIDED),
			    intern(cconcatenate($str_alt65$SET_, new SubLObject[] { symbol_name(class_name), $str_alt64$_, symbol_name(slot_name) }), UNPROVIDED)), slot_accessor_alist);
		}
	    }
	    {
		SubLObject slot_name = NIL;
		SubLObject cdolist_list_var = compiled_instance_boolean_slot_access_alist;
		SubLObject slot = NIL;
		for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
		    slot_name = slots.slot_name(slot);
		    slot_accessor_alist = cons(com.cyc.cycjava.cycl.classes.classes_make_slot_accessor_association(slot_name, intern(cconcatenate($str_alt63$GET_, new SubLObject[] { symbol_name(class_name), $str_alt64$_, symbol_name(slot_name) }), UNPROVIDED),
			    intern(cconcatenate($str_alt65$SET_, new SubLObject[] { symbol_name(class_name), $str_alt64$_, symbol_name(slot_name) }), UNPROVIDED)), slot_accessor_alist);
		}
	    }
	    {
		SubLObject slot_name = NIL;
		SubLObject cdolist_list_var = compiled_class_slot_access_alist;
		SubLObject slot = NIL;
		for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
		    slot_name = slots.slot_name(slot);
		    slot_accessor_alist = cons(com.cyc.cycjava.cycl.classes.classes_make_slot_accessor_association(slot_name, intern(cconcatenate($str_alt63$GET_, new SubLObject[] { symbol_name(class_name), $str_alt64$_, symbol_name(slot_name) }), UNPROVIDED),
			    intern(cconcatenate($str_alt65$SET_, new SubLObject[] { symbol_name(class_name), $str_alt64$_, symbol_name(slot_name) }), UNPROVIDED)), slot_accessor_alist);
		}
	    }
	    {
		SubLObject slot_name = NIL;
		SubLObject cdolist_list_var = compiled_class_boolean_slot_access_alist;
		SubLObject slot = NIL;
		for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
		    slot_name = slots.slot_name(slot);
		    slot_accessor_alist = cons(com.cyc.cycjava.cycl.classes.classes_make_slot_accessor_association(slot_name, intern(cconcatenate($str_alt63$GET_, new SubLObject[] { symbol_name(class_name), $str_alt64$_, symbol_name(slot_name) }), UNPROVIDED),
			    intern(cconcatenate($str_alt65$SET_, new SubLObject[] { symbol_name(class_name), $str_alt64$_, symbol_name(slot_name) }), UNPROVIDED)), slot_accessor_alist);
		}
	    }
	    subloop_structures._csetf_class_slot_accessor_alist(v_class, nreverse(slot_accessor_alist));
	    return v_class;
	}
    }

    public static SubLObject classes_generate_slot_accessor_names_hide(SubLObject v_class) {
	final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
	final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
	final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
	final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
	final SubLObject class_name = subloop_structures.class_name(v_class);
	SubLObject slot_accessor_alist = NIL;
	SubLObject slot_name = NIL;
	SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
	SubLObject slot = NIL;
	slot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    slot_name = slots.slot_name(slot);
	    slot_accessor_alist = cons(classes_make_slot_accessor_association(slot_name, intern(cconcatenate($str63$GET_, new SubLObject[] { symbol_name(class_name), $str64$_, symbol_name(slot_name) }), UNPROVIDED),
		    intern(cconcatenate($str65$SET_, new SubLObject[] { symbol_name(class_name), $str64$_, symbol_name(slot_name) }), UNPROVIDED)), slot_accessor_alist);
	    cdolist_list_var = cdolist_list_var.rest();
	    slot = cdolist_list_var.first();
	}
	slot_name = NIL;
	cdolist_list_var = compiled_instance_boolean_slot_access_alist;
	slot = NIL;
	slot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    slot_name = slots.slot_name(slot);
	    slot_accessor_alist = cons(classes_make_slot_accessor_association(slot_name, intern(cconcatenate($str63$GET_, new SubLObject[] { symbol_name(class_name), $str64$_, symbol_name(slot_name) }), UNPROVIDED),
		    intern(cconcatenate($str65$SET_, new SubLObject[] { symbol_name(class_name), $str64$_, symbol_name(slot_name) }), UNPROVIDED)), slot_accessor_alist);
	    cdolist_list_var = cdolist_list_var.rest();
	    slot = cdolist_list_var.first();
	}
	slot_name = NIL;
	cdolist_list_var = compiled_class_slot_access_alist;
	slot = NIL;
	slot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    slot_name = slots.slot_name(slot);
	    slot_accessor_alist = cons(classes_make_slot_accessor_association(slot_name, intern(cconcatenate($str63$GET_, new SubLObject[] { symbol_name(class_name), $str64$_, symbol_name(slot_name) }), UNPROVIDED),
		    intern(cconcatenate($str65$SET_, new SubLObject[] { symbol_name(class_name), $str64$_, symbol_name(slot_name) }), UNPROVIDED)), slot_accessor_alist);
	    cdolist_list_var = cdolist_list_var.rest();
	    slot = cdolist_list_var.first();
	}
	slot_name = NIL;
	cdolist_list_var = compiled_class_boolean_slot_access_alist;
	slot = NIL;
	slot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    slot_name = slots.slot_name(slot);
	    slot_accessor_alist = cons(classes_make_slot_accessor_association(slot_name, intern(cconcatenate($str63$GET_, new SubLObject[] { symbol_name(class_name), $str64$_, symbol_name(slot_name) }), UNPROVIDED),
		    intern(cconcatenate($str65$SET_, new SubLObject[] { symbol_name(class_name), $str64$_, symbol_name(slot_name) }), UNPROVIDED)), slot_accessor_alist);
	    cdolist_list_var = cdolist_list_var.rest();
	    slot = cdolist_list_var.first();
	}
	subloop_structures._csetf_class_slot_accessor_alist(v_class, nreverse(slot_accessor_alist));
	return v_class;
    }

    public static final SubLObject classes_valid_class_properties_p(SubLObject plist) {
	if (plist.isList()) {
	    {
		SubLObject remainder = NIL;
		for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
		    {
			SubLObject indicator = remainder.first();
			SubLObject value = cadr(remainder);
			if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_class_property_p(indicator)) {
			    return NIL;
			}
		    }
		}
		return T;
	    }
	} else {
	    return NIL;
	}
    }

    public static SubLObject classes_valid_class_properties_p_hide(SubLObject plist) {
	if (plist.isList()) {
	    SubLObject remainder;
	    SubLObject indicator;
	    SubLObject value;
	    for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
		indicator = remainder.first();
		value = cadr(remainder);
		if (NIL == classes_valid_class_property_p(indicator)) {
		    return NIL;
		}
	    }
	    return T;
	}
	return NIL;
    }

    public static final SubLObject class_properties_must_be_valid(SubLObject class_properties) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (!class_properties.isList()) {
		    Errors.error($str_alt66$___S_is_not_a_valid_class_propert, class_properties);
		}
	    }
	    {
		SubLObject remainder = NIL;
		for (remainder = class_properties; NIL != remainder; remainder = cddr(remainder)) {
		    {
			SubLObject class_property = remainder.first();
			SubLObject value = cadr(remainder);
			if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
			    if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_class_property_p(class_property)) {
				Errors.error(class_property.isSymbol() ? ((SubLObject) ($str_alt67$___S_is_not_a_valid_class_propert)) : $str_alt68$___S_is_not_a_valid_class_propert, class_property);
			    }
			}
			{
			    SubLObject pcase_var = class_property;
			    if (pcase_var.eql($EXTENDS)) {
				if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
				    if (!value.isSymbol()) {
					Errors.error($str_alt70$___S_is_not_a_valid_value_for_the, value);
				    }
				}
				if (NIL == com.cyc.cycjava.cycl.classes.classes_retrieve_class(value)) {
				    Errors.warn($str_alt71$__Attempting_to_subclass_unknown_, value);
				}
			    } else {
				if (pcase_var.eql($IMPLEMENTS)) {
				    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
					if (!(value.isSymbol() || (NIL != classes_utilities.classes_symbol_list_p(value)))) {
					    Errors.error($str_alt73$___S_is_not_a_valid_value_for_the, value);
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    return T;
	}
    }

    public static SubLObject class_properties_must_be_valid_hide(SubLObject class_properties) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!class_properties.isList())) {
	    Errors.error($str66$___S_is_not_a_valid_class_propert, class_properties);
	}
	SubLObject remainder;
	SubLObject class_property;
	SubLObject value;
	SubLObject pcase_var;
	for (remainder = NIL, remainder = class_properties; NIL != remainder; remainder = cddr(remainder)) {
	    class_property = remainder.first();
	    value = cadr(remainder);
	    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == classes_valid_class_property_p(class_property))) {
		Errors.error(class_property.isSymbol() ? $str67$___S_is_not_a_valid_class_propert : $str68$___S_is_not_a_valid_class_propert, class_property);
	    }
	    pcase_var = class_property;
	    if (pcase_var.eql($EXTENDS)) {
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!value.isSymbol())) {
		    Errors.error($str70$___S_is_not_a_valid_value_for_the, value);
		}
		if (NIL == classes_retrieve_class(value)) {
		    Errors.warn($str71$__Attempting_to_subclass_unknown_, value);
		}
	    } else if (((pcase_var.eql($IMPLEMENTS) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (!value.isSymbol())) && (NIL == classes_utilities.classes_symbol_list_p(value))) {
		Errors.error($str73$___S_is_not_a_valid_value_for_the, value);
	    }

	}
	return T;
    }

    public static final SubLObject expand_interface_method_instantiations(SubLObject class_name_or_class) {
	{
	    SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : class_name_or_class;
	    SubLObject class_name = (NIL != v_class) ? ((SubLObject) (subloop_structures.class_name(v_class))) : NIL;
	    if (NIL != subloop_structures.class_p(v_class)) {
		{
		    SubLObject instantiations = NIL;
		    SubLObject v_class_1 = v_class;
		    SubLObject interface_names = subloop_structures.class_interface_names(v_class_1);
		    SubLObject instance_method_decls = subloop_structures.class_instance_method_decls(v_class_1);
		    SubLObject class_method_decls = subloop_structures.class_class_method_decls(v_class_1);
		    {
			SubLObject cdolist_list_var = class_method_decls;
			SubLObject method = NIL;
			for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), method = cdolist_list_var.first()) {
			    if (NIL != subloop_structures.method_instantiate_template(method)) {
				{
				    SubLObject collected_methods = NIL;
				    SubLObject v_interface = NIL;
				    SubLObject interface_method = NIL;
				    SubLObject cdolist_list_var_2 = interface_names;
				    SubLObject interface_name = NIL;
				    for (interface_name = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest(), interface_name = cdolist_list_var_2.first()) {
					v_interface = interfaces.interfaces_retrieve_interface(interface_name);
					if (NIL != v_interface) {
					    interface_method = interfaces.interfaces_find_class_method(subloop_structures.method_name(method), subloop_structures.interface_name(v_interface));
					    if (NIL != interface_method) {
						collected_methods = cons(interface_method, collected_methods);
					    }
					}
				    }
				    if (collected_methods.isCons() && (NIL == collected_methods.rest())) {
					instantiations = nconc(instantiations, interfaces.interfaces_class_method_to_listed_def_class_method(class_name, collected_methods.first()));
				    }
				}
			    }
			}
		    }
		    {
			SubLObject cdolist_list_var = instance_method_decls;
			SubLObject method = NIL;
			for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), method = cdolist_list_var.first()) {
			    if (NIL != subloop_structures.method_instantiate_template(method)) {
				{
				    SubLObject collected_methods = NIL;
				    SubLObject v_interface = NIL;
				    SubLObject interface_method = NIL;
				    SubLObject cdolist_list_var_3 = interface_names;
				    SubLObject interface_name = NIL;
				    for (interface_name = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest(), interface_name = cdolist_list_var_3.first()) {
					v_interface = interfaces.interfaces_retrieve_interface(interface_name);
					if (NIL != v_interface) {
					    interface_method = interfaces.interfaces_find_instance_method(subloop_structures.method_name(method), subloop_structures.interface_name(v_interface));
					    if (NIL != interface_method) {
						collected_methods = cons(interface_method, collected_methods);
					    }
					}
				    }
				    if (collected_methods.isCons() && (NIL == collected_methods.rest())) {
					instantiations = nconc(instantiations, interfaces.interfaces_instance_method_to_listed_def_instance_method(class_name, collected_methods.first()));
				    }
				}
			    }
			}
		    }
		    return instantiations;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject expand_interface_method_instantiations_hide(SubLObject class_name_or_class) {
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
	final SubLObject class_name = (NIL != v_class) ? subloop_structures.class_name(v_class) : NIL;
	if (NIL != subloop_structures.class_p(v_class)) {
	    SubLObject instantiations = NIL;
	    final SubLObject v_class_$1 = v_class;
	    final SubLObject interface_names = subloop_structures.class_interface_names(v_class_$1);
	    final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls(v_class_$1);
	    SubLObject cdolist_list_var;
	    final SubLObject class_method_decls = cdolist_list_var = subloop_structures.class_class_method_decls(v_class_$1);
	    SubLObject method = NIL;
	    method = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != subloop_structures.method_instantiate_template(method)) {
		    SubLObject collected_methods = NIL;
		    SubLObject v_interface = NIL;
		    SubLObject interface_method = NIL;
		    SubLObject cdolist_list_var_$2 = interface_names;
		    SubLObject interface_name = NIL;
		    interface_name = cdolist_list_var_$2.first();
		    while (NIL != cdolist_list_var_$2) {
			v_interface = interfaces.interfaces_retrieve_interface(interface_name);
			if (NIL != v_interface) {
			    interface_method = interfaces.interfaces_find_class_method(subloop_structures.method_name(method), subloop_structures.interface_name(v_interface));
			    if (NIL != interface_method) {
				collected_methods = cons(interface_method, collected_methods);
			    }
			}
			cdolist_list_var_$2 = cdolist_list_var_$2.rest();
			interface_name = cdolist_list_var_$2.first();
		    }
		    if (collected_methods.isCons() && (NIL == collected_methods.rest())) {
			instantiations = nconc(instantiations, interfaces.interfaces_class_method_to_listed_def_class_method(class_name, collected_methods.first()));
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		method = cdolist_list_var.first();
	    }
	    cdolist_list_var = instance_method_decls;
	    method = NIL;
	    method = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != subloop_structures.method_instantiate_template(method)) {
		    SubLObject collected_methods = NIL;
		    SubLObject v_interface = NIL;
		    SubLObject interface_method = NIL;
		    SubLObject cdolist_list_var_$3 = interface_names;
		    SubLObject interface_name = NIL;
		    interface_name = cdolist_list_var_$3.first();
		    while (NIL != cdolist_list_var_$3) {
			v_interface = interfaces.interfaces_retrieve_interface(interface_name);
			if (NIL != v_interface) {
			    interface_method = interfaces.interfaces_find_instance_method(subloop_structures.method_name(method), subloop_structures.interface_name(v_interface));
			    if (NIL != interface_method) {
				collected_methods = cons(interface_method, collected_methods);
			    }
			}
			cdolist_list_var_$3 = cdolist_list_var_$3.rest();
			interface_name = cdolist_list_var_$3.first();
		    }
		    if (collected_methods.isCons() && (NIL == collected_methods.rest())) {
			instantiations = nconc(instantiations, interfaces.interfaces_instance_method_to_listed_def_instance_method(class_name, collected_methods.first()));
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		method = cdolist_list_var.first();
	    }
	    return instantiations;
	}
	return NIL;
    }

    public static final SubLObject expand_accessors_for_class(SubLObject class_name_or_class, SubLObject v_slot_listeners) {
	if (v_slot_listeners == UNPROVIDED) {
	    v_slot_listeners = NIL;
	}
	{
	    SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : class_name_or_class;
	    if (NIL != subloop_structures.class_p(v_class)) {
		{
		    SubLObject class_name = subloop_structures.class_name(v_class);
		    SubLObject defn_pairs = NIL;
		    SubLObject v_defns = NIL;
		    SubLObject v_class_4 = v_class;
		    SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_4);
		    SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_4);
		    SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_4);
		    SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_4);
		    {
			SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			    if (slots.slot_class_name(slot) == class_name) {
				defn_pairs = cons(com.cyc.cycjava.cycl.classes.expand_instance_any_slot_accessors(v_class, slot, v_slot_listeners), defn_pairs);
			    }
			}
		    }
		    {
			SubLObject cdolist_list_var = compiled_instance_boolean_slot_access_alist;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			    if (slots.slot_class_name(slot) == class_name) {
				defn_pairs = cons(com.cyc.cycjava.cycl.classes.expand_instance_boolean_slot_accessors(v_class, slot), defn_pairs);
			    }
			}
		    }
		    {
			SubLObject cdolist_list_var = compiled_class_slot_access_alist;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			    if (slots.slot_class_name(slot) == class_name) {
				defn_pairs = cons(com.cyc.cycjava.cycl.classes.expand_class_any_slot_accessors(v_class, slot), defn_pairs);
			    }
			}
		    }
		    {
			SubLObject cdolist_list_var = compiled_class_boolean_slot_access_alist;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			    if (slots.slot_class_name(slot) == class_name) {
				defn_pairs = cons(com.cyc.cycjava.cycl.classes.expand_class_boolean_slot_accessors(v_class, slot), defn_pairs);
			    }
			}
		    }
		    {
			SubLObject cdolist_list_var = defn_pairs;
			SubLObject cons = NIL;
			for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
			    {
				SubLObject datum = cons;
				SubLObject current = datum;
				SubLObject getter = NIL;
				SubLObject setter = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt74);
				getter = current.first();
				current = current.rest();
				setter = current;
				v_defns = cons(setter, v_defns);
				v_defns = cons(getter, v_defns);
			    }
			}
		    }
		    return v_defns;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject expand_accessors_for_class_hide(SubLObject class_name_or_class, SubLObject v_slot_listeners) {
	if (v_slot_listeners == UNPROVIDED) {
	    v_slot_listeners = NIL;
	}
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
	if (NIL != subloop_structures.class_p(v_class)) {
	    final SubLObject class_name = subloop_structures.class_name(v_class);
	    SubLObject defn_pairs = NIL;
	    SubLObject v_defns = NIL;
	    final SubLObject v_class_$4 = v_class;
	    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$4);
	    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$4);
	    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_$4);
	    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_$4);
	    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
	    SubLObject slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (slots.slot_class_name(slot).eql(class_name)) {
		    defn_pairs = cons(expand_instance_any_slot_accessors(v_class, slot, v_slot_listeners), defn_pairs);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    cdolist_list_var = compiled_instance_boolean_slot_access_alist;
	    slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (slots.slot_class_name(slot).eql(class_name)) {
		    defn_pairs = cons(expand_instance_boolean_slot_accessors(v_class, slot), defn_pairs);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    cdolist_list_var = compiled_class_slot_access_alist;
	    slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (slots.slot_class_name(slot).eql(class_name)) {
		    defn_pairs = cons(expand_class_any_slot_accessors(v_class, slot), defn_pairs);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    cdolist_list_var = compiled_class_boolean_slot_access_alist;
	    slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (slots.slot_class_name(slot).eql(class_name)) {
		    defn_pairs = cons(expand_class_boolean_slot_accessors(v_class, slot), defn_pairs);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    cdolist_list_var = defn_pairs;
	    SubLObject cons = NIL;
	    cons = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject current;
		final SubLObject datum = current = cons;
		SubLObject getter = NIL;
		SubLObject setter = NIL;
		destructuring_bind_must_consp(current, datum, $list74);
		getter = current.first();
		current = setter = current.rest();
		v_defns = cons(setter, v_defns);
		v_defns = cons(getter, v_defns);
		cdolist_list_var = cdolist_list_var.rest();
		cons = cdolist_list_var.first();
	    }
	    return v_defns;
	}
	return NIL;
    }

    public static final SubLObject expand_instance_any_slot_accessors(SubLObject v_class, SubLObject slot, SubLObject v_slot_listeners) {
	if (v_slot_listeners == UNPROVIDED) {
	    v_slot_listeners = NIL;
	}
	{
	    SubLObject class_name = subloop_structures.class_name(v_class);
	    SubLObject slot_name = slots.slot_name(slot);
	    SubLObject slot_index = slots.slot_index(slot);
	    SubLObject slot_protection = slots.slot_protection(slot);
	    SubLObject getter_name = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_getter(v_class, slot_name);
	    SubLObject setter_name = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_setter(v_class, slot_name);
	    SubLObject access_protection = makeBoolean(slot_protection != $PUBLIC);
	    if (NIL != v_slot_listeners) {
		if (NIL != access_protection) {
		    return cons(
			    list(DEFINE_PUBLIC, getter_name, list(class_name),
				    listS(CLET, list(list(NEW_VALUE, list(SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, slot_index, list(QUOTE, slot_name)))),
					    listS(SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $SLOT_GETTER_REGISTRY, list(QUOTE, slot_name), slot_index, $list_alt83), $list_alt84)),
			    listS(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list_alt85), list(SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, VALUE, slot_index, list(QUOTE, slot_name)),
				    listS(SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $SLOT_SETTER_REGISTRY, list(QUOTE, slot_name), slot_index, $list_alt85), $list_alt89));
		} else {
		    return cons(
			    list(DEFINE_PUBLIC, getter_name, list(class_name),
				    listS(CLET, list(list(NEW_VALUE, list(SUBLOOP_GET_INSTANCE_SLOT, class_name, slot_index))), listS(SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $SLOT_GETTER_REGISTRY, list(QUOTE, slot_name), slot_index, $list_alt83), $list_alt84)),
			    listS(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list_alt85), list(SUBLOOP_SET_INSTANCE_SLOT, class_name, VALUE, slot_index), listS(SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $SLOT_SETTER_REGISTRY, list(QUOTE, slot_name), slot_index, $list_alt85),
				    $list_alt89));
		}
	    } else {
		if (NIL != access_protection) {
		    return cons(list(DEFINE_PUBLIC, getter_name, list(class_name), list(RET, list(SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, slot_index, list(QUOTE, slot_name)))),
			    list(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list_alt85), list(RET, list(SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, VALUE, slot_index, list(QUOTE, slot_name)))));
		} else {
		    return cons(list(DEFINE_PUBLIC, getter_name, list(class_name), list(RET, list(SUBLOOP_GET_INSTANCE_SLOT, class_name, slot_index))), list(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list_alt85), list(RET, list(SUBLOOP_SET_INSTANCE_SLOT, class_name, VALUE, slot_index))));
		}
	    }
	}
    }

    public static SubLObject expand_instance_any_slot_accessors_hide(SubLObject v_class, final SubLObject slot, SubLObject v_slot_listeners) {
	if (v_slot_listeners == UNPROVIDED) {
	    v_slot_listeners = NIL;
	}
	final SubLObject class_name = subloop_structures.class_name(v_class);
	final SubLObject slot_name = slots.slot_name(slot);
	final SubLObject slot_index = slots.slot_index(slot);
	final SubLObject slot_protection = slots.slot_protection(slot);
	final SubLObject getter_name = classes_retrieve_slot_getter(v_class, slot_name);
	final SubLObject setter_name = classes_retrieve_slot_setter(v_class, slot_name);
	final SubLObject access_protection = makeBoolean(slot_protection != $PUBLIC);
	if (NIL != v_slot_listeners) {
	    if (NIL != access_protection) {
		return cons(
			list(DEFINE_PUBLIC, getter_name, list(class_name),
				listS(CLET, list(list(NEW_VALUE, list(SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, slot_index, list(QUOTE, slot_name)))), listS(SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $SLOT_GETTER_REGISTRY, list(QUOTE, slot_name), slot_index, $list83),
					$list84)),
			listS(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list85), list(SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, VALUE, slot_index, list(QUOTE, slot_name)),
				listS(SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $SLOT_SETTER_REGISTRY, list(QUOTE, slot_name), slot_index, $list85), $list89));
	    }
	    return cons(
		    list(DEFINE_PUBLIC, getter_name, list(class_name),
			    listS(CLET, list(list(NEW_VALUE, list(SUBLOOP_GET_INSTANCE_SLOT, class_name, slot_index))), listS(SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $SLOT_GETTER_REGISTRY, list(QUOTE, slot_name), slot_index, $list83), $list84)),
		    listS(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list85), list(SUBLOOP_SET_INSTANCE_SLOT, class_name, VALUE, slot_index), listS(SLOT_LISTENERS_FAST_FIRE_ALL_SLOT_LISTENERS, class_name, $SLOT_SETTER_REGISTRY, list(QUOTE, slot_name), slot_index, $list85), $list89));
	} else {
	    if (NIL != access_protection) {
		return cons(list(DEFINE_PUBLIC, getter_name, list(class_name), list(RET, list(SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, slot_index, list(QUOTE, slot_name)))),
			list(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list85), list(RET, list(SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, class_name, VALUE, slot_index, list(QUOTE, slot_name)))));
	    }
	    return cons(list(DEFINE_PUBLIC, getter_name, list(class_name), list(RET, list(SUBLOOP_GET_INSTANCE_SLOT, class_name, slot_index))), list(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list85), list(RET, list(SUBLOOP_SET_INSTANCE_SLOT, class_name, VALUE, slot_index))));
	}
    }

    public static final SubLObject expand_instance_boolean_slot_accessors(SubLObject v_class, SubLObject slot) {
	{
	    SubLObject slot_name = slots.slot_name(slot);
	    SubLObject slot_index = slots.slot_index(slot);
	    SubLObject slot_protection = slots.slot_protection(slot);
	    SubLObject slot_byte_spec = bytes.sublisp_byte(ONE_INTEGER, slot_index);
	    SubLObject class_name = subloop_structures.class_name(v_class);
	    SubLObject getter_name = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_getter(v_class, slot_name);
	    SubLObject setter_name = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_setter(v_class, slot_name);
	    SubLObject class_var = make_symbol($$$class);
	    SubLObject slot_var = make_symbol($$$slot);
	    SubLObject access_protection = (slot_protection == $PUBLIC) ? ((SubLObject) (NIL))
		    : list(list(CLET, list(list(class_var, list(INSTANCE_CLASS, class_name)), list(slot_var, list(SLOT_ASSOC, list(QUOTE, slot_name), list(CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, class_var)))), list(INSTANCES_ACCESS_CHECK_INSTANCE_SLOT, class_var, class_name, slot_var)));
	    if (NIL != access_protection) {
		return cons(listS(DEFINE_PUBLIC, getter_name, list(class_name), append(copy_list(access_protection), list(list(RET, list(LDB_TEST, slot_byte_spec, list(INSTANCE_BOOLEAN_SLOTS, class_name)))))),
			listS(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list_alt85), append(copy_list(access_protection), bq_cons(list(CSETF, list(INSTANCE_BOOLEAN_SLOTS, class_name), list(DPB, $list_alt103, slot_byte_spec, list(INSTANCE_BOOLEAN_SLOTS, class_name))), $list_alt89))));
	    } else {
		return cons(listS(DEFINE_PUBLIC, getter_name, list(class_name), append(copy_list(access_protection), list(list(RET, list(LDB_TEST, slot_byte_spec, list(INSTANCE_BOOLEAN_SLOTS, class_name)))))),
			listS(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list_alt85), append(copy_list(access_protection), bq_cons(list(CSETF, list(INSTANCE_BOOLEAN_SLOTS, class_name), list(DPB, $list_alt103, slot_byte_spec, list(INSTANCE_BOOLEAN_SLOTS, class_name))), $list_alt89))));
	    }
	}
    }

    public static SubLObject expand_instance_boolean_slot_accessors_hide(SubLObject v_class, final SubLObject slot) {
	final SubLObject slot_name = slots.slot_name(slot);
	final SubLObject slot_index = slots.slot_index(slot);
	final SubLObject slot_protection = slots.slot_protection(slot);
	final SubLObject slot_byte_spec = bytes.sublisp_byte(ONE_INTEGER, slot_index);
	final SubLObject class_name = subloop_structures.class_name(v_class);
	final SubLObject getter_name = classes_retrieve_slot_getter(v_class, slot_name);
	final SubLObject setter_name = classes_retrieve_slot_setter(v_class, slot_name);
	final SubLObject class_var = make_symbol($$$class);
	final SubLObject slot_var = make_symbol($$$slot);
	final SubLObject access_protection = (slot_protection == $PUBLIC) ? NIL
		: list(list(CLET, list(list(class_var, list(INSTANCE_CLASS, class_name)), list(slot_var, list(SLOT_ASSOC, list(QUOTE, slot_name), list(CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, class_var)))), list(INSTANCES_ACCESS_CHECK_INSTANCE_SLOT, class_var, class_name, slot_var)));
	if (NIL != access_protection) {
	    return cons(listS(DEFINE_PUBLIC, getter_name, list(class_name), append(copy_list(access_protection), list(list(RET, list(LDB_TEST, slot_byte_spec, list(INSTANCE_BOOLEAN_SLOTS, class_name)))))),
		    listS(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list85), append(copy_list(access_protection), bq_cons(list(CSETF, list(INSTANCE_BOOLEAN_SLOTS, class_name), list(DPB, $list103, slot_byte_spec, list(INSTANCE_BOOLEAN_SLOTS, class_name))), $list89))));
	}
	return cons(listS(DEFINE_PUBLIC, getter_name, list(class_name), append(copy_list(access_protection), list(list(RET, list(LDB_TEST, slot_byte_spec, list(INSTANCE_BOOLEAN_SLOTS, class_name)))))),
		listS(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list85), append(copy_list(access_protection), bq_cons(list(CSETF, list(INSTANCE_BOOLEAN_SLOTS, class_name), list(DPB, $list103, slot_byte_spec, list(INSTANCE_BOOLEAN_SLOTS, class_name))), $list89))));
    }

    public static final SubLObject expand_class_any_slot_accessors(SubLObject v_class, SubLObject slot) {
	{
	    SubLObject slot_name = slots.slot_name(slot);
	    SubLObject slot_index = slots.slot_index(slot);
	    SubLObject slot_protection = slots.slot_protection(slot);
	    SubLObject class_name = subloop_structures.class_name(v_class);
	    SubLObject getter_name = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_getter(v_class, slot_name);
	    SubLObject setter_name = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_setter(v_class, slot_name);
	    SubLObject access_protection = (slot_protection == $PUBLIC) ? ((SubLObject) (NIL)) : list(list(CLASSES_ACCESS_CHECK_CLASS_SLOT, CLASS, listS(SLOT_ASSOC, list(QUOTE, slot_name), $list_alt106)));
	    return cons(
		    list(DEFINE_PUBLIC, getter_name, list(class_name),
			    listS(CLET, list(list(CLASS, list(FIF, list(SYMBOLP, class_name), list(CLASSES_RETRIEVE_CLASS, class_name), list(FIF, list(CLASS_P, class_name), class_name, listS(FIF, list(INSTANCE_P, class_name), list(INSTANCE_CLASS, class_name), $list_alt112))))),
				    listS(PWHEN, CLASS, append(copy_list(access_protection), list(list(RET, list(AREF, $list_alt115, slot_index))))), $list_alt116)),
		    list(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list_alt85),
			    listS(CLET, list(list(CLASS, list(FIF, list(SYMBOLP, class_name), list(CLASSES_RETRIEVE_CLASS, class_name), list(FIF, list(CLASS_P, class_name), class_name, listS(FIF, list(INSTANCE_P, class_name), list(INSTANCE_CLASS, class_name), $list_alt112))))),
				    listS(PWHEN, CLASS, append(copy_list(access_protection), list(list(RET, listS(SET_AREF, $list_alt115, slot_index, $list_alt85))))), $list_alt116)));
	}
    }

    public static SubLObject expand_class_any_slot_accessors_hide(SubLObject v_class, final SubLObject slot) {
	final SubLObject slot_name = slots.slot_name(slot);
	final SubLObject slot_index = slots.slot_index(slot);
	final SubLObject slot_protection = slots.slot_protection(slot);
	final SubLObject class_name = subloop_structures.class_name(v_class);
	final SubLObject getter_name = classes_retrieve_slot_getter(v_class, slot_name);
	final SubLObject setter_name = classes_retrieve_slot_setter(v_class, slot_name);
	final SubLObject access_protection = (slot_protection == $PUBLIC) ? NIL : list(list(CLASSES_ACCESS_CHECK_CLASS_SLOT, CLASS, listS(SLOT_ASSOC, list(QUOTE, slot_name), $list106)));
	return cons(
		list(DEFINE_PUBLIC, getter_name, list(class_name),
			listS(CLET, list(list(CLASS, list(FIF, list(SYMBOLP, class_name), list(CLASSES_RETRIEVE_CLASS, class_name), list(FIF, list(CLASS_P, class_name), class_name, listS(FIF, list(INSTANCE_P, class_name), list(INSTANCE_CLASS, class_name), $list112))))),
				listS(PWHEN, CLASS, append(copy_list(access_protection), list(list(RET, list(AREF, $list115, slot_index))))), $list116)),
		list(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list85),
			listS(CLET, list(list(CLASS, list(FIF, list(SYMBOLP, class_name), list(CLASSES_RETRIEVE_CLASS, class_name), list(FIF, list(CLASS_P, class_name), class_name, listS(FIF, list(INSTANCE_P, class_name), list(INSTANCE_CLASS, class_name), $list112))))),
				listS(PWHEN, CLASS, append(copy_list(access_protection), list(list(RET, listS(SET_AREF, $list115, slot_index, $list85))))), $list116)));
    }

    public static final SubLObject expand_class_boolean_slot_accessors(SubLObject v_class, SubLObject slot) {
	{
	    SubLObject slot_name = slots.slot_name(slot);
	    SubLObject slot_index = slots.slot_index(slot);
	    SubLObject slot_protection = slots.slot_protection(slot);
	    SubLObject slot_byte_spec = bytes.sublisp_byte(ONE_INTEGER, slot_index);
	    SubLObject class_name = subloop_structures.class_name(v_class);
	    SubLObject getter_name = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_getter(v_class, slot_name);
	    SubLObject setter_name = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_setter(v_class, slot_name);
	    SubLObject access_protection = (slot_protection == $PUBLIC) ? ((SubLObject) (NIL)) : list(list(CLASSES_ACCESS_CHECK_CLASS_SLOT, CLASS, listS(SLOT_ASSOC, list(QUOTE, slot_name), $list_alt106)));
	    return cons(
		    list(DEFINE_PUBLIC, getter_name, list(class_name),
			    listS(CLET, list(list(CLASS, list(FIF, list(SYMBOLP, class_name), list(CLASSES_RETRIEVE_CLASS, class_name), list(FIF, list(CLASS_P, class_name), class_name, listS(FIF, list(INSTANCE_P, class_name), list(INSTANCE_CLASS, class_name), $list_alt112))))),
				    listS(PWHEN, CLASS, append(copy_list(access_protection), list(list(RET, listS(LDB_TEST, slot_byte_spec, $list_alt118))))), $list_alt116)),
		    list(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list_alt85),
			    listS(CLET, list(list(CLASS, list(FIF, list(SYMBOLP, class_name), list(CLASSES_RETRIEVE_CLASS, class_name), list(FIF, list(CLASS_P, class_name), class_name, listS(FIF, list(INSTANCE_P, class_name), list(INSTANCE_CLASS, class_name), $list_alt112))))),
				    listS(PWHEN, CLASS, append(copy_list(access_protection), bq_cons(list(CSETF, $list_alt119, listS(DPB, $list_alt103, slot_byte_spec, $list_alt118)), $list_alt89))), $list_alt116)));
	}
    }

    public static SubLObject expand_class_boolean_slot_accessors_hide(SubLObject v_class, final SubLObject slot) {
	final SubLObject slot_name = slots.slot_name(slot);
	final SubLObject slot_index = slots.slot_index(slot);
	final SubLObject slot_protection = slots.slot_protection(slot);
	final SubLObject slot_byte_spec = bytes.sublisp_byte(ONE_INTEGER, slot_index);
	final SubLObject class_name = subloop_structures.class_name(v_class);
	final SubLObject getter_name = classes_retrieve_slot_getter(v_class, slot_name);
	final SubLObject setter_name = classes_retrieve_slot_setter(v_class, slot_name);
	final SubLObject access_protection = (slot_protection == $PUBLIC) ? NIL : list(list(CLASSES_ACCESS_CHECK_CLASS_SLOT, CLASS, listS(SLOT_ASSOC, list(QUOTE, slot_name), $list106)));
	return cons(
		list(DEFINE_PUBLIC, getter_name, list(class_name),
			listS(CLET, list(list(CLASS, list(FIF, list(SYMBOLP, class_name), list(CLASSES_RETRIEVE_CLASS, class_name), list(FIF, list(CLASS_P, class_name), class_name, listS(FIF, list(INSTANCE_P, class_name), list(INSTANCE_CLASS, class_name), $list112))))),
				listS(PWHEN, CLASS, append(copy_list(access_protection), list(list(RET, listS(LDB_TEST, slot_byte_spec, $list118))))), $list116)),
		list(DEFINE_PUBLIC, setter_name, bq_cons(class_name, $list85),
			listS(CLET, list(list(CLASS, list(FIF, list(SYMBOLP, class_name), list(CLASSES_RETRIEVE_CLASS, class_name), list(FIF, list(CLASS_P, class_name), class_name, listS(FIF, list(INSTANCE_P, class_name), list(INSTANCE_CLASS, class_name), $list112))))),
				listS(PWHEN, CLASS, append(copy_list(access_protection), bq_cons(list(CSETF, $list119, listS(DPB, $list103, slot_byte_spec, $list118)), $list89))), $list116)));
    }

    public static final SubLObject expand_class_predicator(SubLObject class_name) {
	{
	    SubLObject predicate_name = intern(cconcatenate(symbol_name(class_name), $str_alt120$_P), UNPROVIDED);
	    return list(DEFINE_PUBLIC, predicate_name, list(class_name), list(RET, list(SUBLOOP_INSTANCEOF_CLASS, class_name, list(QUOTE, class_name))));
	}
    }

    public static SubLObject expand_class_predicator_hide(SubLObject class_name) {
	final SubLObject predicate_name = intern(cconcatenate(symbol_name(class_name), $str120$_P), UNPROVIDED);
	return list(DEFINE_PUBLIC, predicate_name, list(class_name), list(RET, list(SUBLOOP_INSTANCEOF_CLASS, class_name, list(QUOTE, class_name))));
    }

    public static final SubLObject expand_class_initializer(SubLObject class_or_class_name) {
	{
	    SubLObject v_class = (NIL != subloop_structures.class_p(class_or_class_name)) ? ((SubLObject) (class_or_class_name)) : com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_or_class_name);
	    SubLObject class_initializer_name = subloop_structures.class_class_initialization_function(v_class);
	    SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
	    SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
	    SubLObject initializations = NIL;
	    {
		SubLObject slot_name = NIL;
		SubLObject class_name = NIL;
		SubLObject value = NIL;
		SubLObject cdolist_list_var = compiled_class_slot_access_alist;
		SubLObject slot = NIL;
		for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
		    slot_name = slots.slot_name(slot);
		    class_name = slots.slot_class_name(slot);
		    value = slots.slot_init_value(slot);
		    initializations = cons(list(SUBLOOP_INITIALIZE_SLOT, NEW_INSTANCE, list(QUOTE, class_name), list(QUOTE, slot_name), copy_tree(value)), initializations);
		}
	    }
	    {
		SubLObject slot_name = NIL;
		SubLObject class_name = NIL;
		SubLObject value = NIL;
		SubLObject cdolist_list_var = compiled_class_boolean_slot_access_alist;
		SubLObject slot = NIL;
		for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
		    slot_name = slots.slot_name(slot);
		    class_name = slots.slot_class_name(slot);
		    value = slots.slot_init_value(slot);
		    initializations = cons(list(SUBLOOP_INITIALIZE_SLOT, NEW_INSTANCE, list(QUOTE, class_name), list(QUOTE, slot_name), copy_tree(value)), initializations);
		}
	    }
	    return list(PROGN, listS(DEFINE_PROTECTED, class_initializer_name, $list_alt125, append(initializations, $list_alt116)), list(SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION, list(QUOTE, class_or_class_name), list(QUOTE, class_initializer_name)));
	}
    }

    public static SubLObject expand_class_initializer_hide(SubLObject class_or_class_name) {
	final SubLObject v_class = (NIL != subloop_structures.class_p(class_or_class_name)) ? class_or_class_name : classes_retrieve_class(class_or_class_name);
	final SubLObject class_initializer_name = subloop_structures.class_class_initialization_function(v_class);
	final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
	final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
	SubLObject initializations = NIL;
	SubLObject slot_name = NIL;
	SubLObject class_name = NIL;
	SubLObject value = NIL;
	SubLObject cdolist_list_var = compiled_class_slot_access_alist;
	SubLObject slot = NIL;
	slot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    slot_name = slots.slot_name(slot);
	    class_name = slots.slot_class_name(slot);
	    value = slots.slot_init_value(slot);
	    initializations = cons(list(SUBLOOP_INITIALIZE_SLOT, NEW_INSTANCE, list(QUOTE, class_name), list(QUOTE, slot_name), copy_tree(value)), initializations);
	    cdolist_list_var = cdolist_list_var.rest();
	    slot = cdolist_list_var.first();
	}
	slot_name = NIL;
	class_name = NIL;
	value = NIL;
	cdolist_list_var = compiled_class_boolean_slot_access_alist;
	slot = NIL;
	slot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    slot_name = slots.slot_name(slot);
	    class_name = slots.slot_class_name(slot);
	    value = slots.slot_init_value(slot);
	    initializations = cons(list(SUBLOOP_INITIALIZE_SLOT, NEW_INSTANCE, list(QUOTE, class_name), list(QUOTE, slot_name), copy_tree(value)), initializations);
	    cdolist_list_var = cdolist_list_var.rest();
	    slot = cdolist_list_var.first();
	}
	return list(PROGN, listS(DEFINE_PROTECTED, class_initializer_name, $list125, append(initializations, $list116)), list(SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION, list(QUOTE, class_or_class_name), list(QUOTE, class_initializer_name)));
    }

    public static final SubLObject expand_instance_initializer(SubLObject class_or_class_name) {
	{
	    SubLObject v_class = (NIL != subloop_structures.class_p(class_or_class_name)) ? ((SubLObject) (class_or_class_name)) : com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_or_class_name);
	    SubLObject instance_initializer_name = subloop_structures.class_instance_initialization_function(v_class);
	    SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
	    SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
	    SubLObject initializations = NIL;
	    {
		SubLObject slot_name = NIL;
		SubLObject class_name = NIL;
		SubLObject value = NIL;
		SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
		SubLObject slot = NIL;
		for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
		    slot_name = slots.slot_name(slot);
		    class_name = slots.slot_class_name(slot);
		    value = slots.slot_init_value(slot);
		    initializations = cons(list(SUBLOOP_INITIALIZE_SLOT, NEW_INSTANCE, list(QUOTE, class_name), list(QUOTE, slot_name), copy_tree(value)), initializations);
		}
	    }
	    {
		SubLObject slot_name = NIL;
		SubLObject class_name = NIL;
		SubLObject value = NIL;
		SubLObject cdolist_list_var = compiled_instance_boolean_slot_access_alist;
		SubLObject slot = NIL;
		for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
		    slot_name = slots.slot_name(slot);
		    class_name = slots.slot_class_name(slot);
		    value = slots.slot_init_value(slot);
		    initializations = cons(list(SUBLOOP_INITIALIZE_SLOT, NEW_INSTANCE, list(QUOTE, class_name), list(QUOTE, slot_name), copy_tree(value)), initializations);
		}
	    }
	    return list(PROGN, listS(DEFINE_PROTECTED, instance_initializer_name, $list_alt125, append(initializations, $list_alt116)), list(SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION, list(QUOTE, class_or_class_name), list(QUOTE, instance_initializer_name)));
	}
    }

    public static SubLObject expand_instance_initializer_hide(SubLObject class_or_class_name) {
	final SubLObject v_class = (NIL != subloop_structures.class_p(class_or_class_name)) ? class_or_class_name : classes_retrieve_class(class_or_class_name);
	final SubLObject instance_initializer_name = subloop_structures.class_instance_initialization_function(v_class);
	final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
	final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
	SubLObject initializations = NIL;
	SubLObject slot_name = NIL;
	SubLObject class_name = NIL;
	SubLObject value = NIL;
	SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
	SubLObject slot = NIL;
	slot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    slot_name = slots.slot_name(slot);
	    class_name = slots.slot_class_name(slot);
	    value = slots.slot_init_value(slot);
	    initializations = cons(list(SUBLOOP_INITIALIZE_SLOT, NEW_INSTANCE, list(QUOTE, class_name), list(QUOTE, slot_name), copy_tree(value)), initializations);
	    cdolist_list_var = cdolist_list_var.rest();
	    slot = cdolist_list_var.first();
	}
	slot_name = NIL;
	class_name = NIL;
	value = NIL;
	cdolist_list_var = compiled_instance_boolean_slot_access_alist;
	slot = NIL;
	slot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    slot_name = slots.slot_name(slot);
	    class_name = slots.slot_class_name(slot);
	    value = slots.slot_init_value(slot);
	    initializations = cons(list(SUBLOOP_INITIALIZE_SLOT, NEW_INSTANCE, list(QUOTE, class_name), list(QUOTE, slot_name), copy_tree(value)), initializations);
	    cdolist_list_var = cdolist_list_var.rest();
	    slot = cdolist_list_var.first();
	}
	return list(PROGN, listS(DEFINE_PROTECTED, instance_initializer_name, $list125, append(initializations, $list116)), list(SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION, list(QUOTE, class_or_class_name), list(QUOTE, instance_initializer_name)));
    }

    public static final SubLObject expand_define_class(SubLObject class_name, SubLObject class_properties, SubLObject slot_decls) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (!class_name.isSymbol()) {
		    Errors.error($str_alt128$___S_is_not_a_valid_class_name_, class_name);
		}
	    }
	    com.cyc.cycjava.cycl.classes.class_properties_must_be_valid(class_properties);
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (NIL == com.cyc.cycjava.cycl.classes.classes_valid_instance_var_decls_p(slot_decls)) {
		    Errors.error($str_alt129$___S_is_not_a_valid_member_variab, slot_decls);
		}
	    }
	    {
		SubLObject parent_class = com.cyc.cycjava.cycl.classes.classes_getf(class_properties, $EXTENDS);
		SubLObject parent_interfaces = com.cyc.cycjava.cycl.classes.classes_getf(class_properties, $IMPLEMENTS);
		SubLObject slot_properties = com.cyc.cycjava.cycl.classes.classes_implement_slot_listeners_p(class_properties);
		SubLObject v_class = NIL;
		if (parent_interfaces.isSymbol() && (NIL != parent_interfaces)) {
		    parent_interfaces = list(parent_interfaces);
		}
		v_class = com.cyc.cycjava.cycl.classes.new_class(class_name, parent_class, parent_interfaces, slot_decls);
		com.cyc.cycjava.cycl.classes.class_set_implements_slot_listeners(v_class, slot_properties);
		{
		    SubLObject expanded_definition = NIL;
		    SubLObject expanded_class_initializer = com.cyc.cycjava.cycl.classes.expand_class_initializer(class_name);
		    SubLObject expanded_instance_initializer = com.cyc.cycjava.cycl.classes.expand_instance_initializer(class_name);
		    {
			SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding(thread);
			try {
			    $classes_new_class_current$.bind(class_name, thread);
			    if (NIL != slot_properties) {
				expanded_definition = listS(PROGN,
					list(SUBLOOP_NEW_CLASS, list(QUOTE, class_name), list(QUOTE, parent_class), list(QUOTE, parent_interfaces), NIL != com.cyc.cycjava.cycl.classes.classes_getf(class_properties, $ABSTRACT) ? ((SubLObject) (T)) : NIL, list(QUOTE, slot_decls)),
					listS(CLASS_SET_IMPLEMENTS_SLOT_LISTENERS, list(QUOTE, class_name), $list_alt133), append(com.cyc.cycjava.cycl.classes.expand_accessors_for_class(class_name, T), com.cyc.cycjava.cycl.classes.expand_interface_method_instantiations(class_name),
						list(expanded_class_initializer, expanded_instance_initializer, com.cyc.cycjava.cycl.classes.expand_class_predicator(class_name), list(cadr(second(expanded_class_initializer)), list(QUOTE, class_name)))));
			    } else {
				expanded_definition = listS(PROGN,
					list(SUBLOOP_NEW_CLASS, list(QUOTE, class_name), list(QUOTE, parent_class), list(QUOTE, parent_interfaces), NIL != com.cyc.cycjava.cycl.classes.classes_getf(class_properties, $ABSTRACT) ? ((SubLObject) (T)) : NIL, list(QUOTE, slot_decls)),
					listS(CLASS_SET_IMPLEMENTS_SLOT_LISTENERS, list(QUOTE, class_name), $list_alt112), append(com.cyc.cycjava.cycl.classes.expand_accessors_for_class(class_name, UNPROVIDED), com.cyc.cycjava.cycl.classes.expand_interface_method_instantiations(class_name),
						list(expanded_class_initializer, expanded_instance_initializer, com.cyc.cycjava.cycl.classes.expand_class_predicator(class_name), list(cadr(second(expanded_class_initializer)), list(QUOTE, class_name)))));
			    }
			} finally {
			    $classes_new_class_current$.rebind(_prev_bind_0, thread);
			}
		    }
		    return expanded_definition;
		}
	    }
	}
    }

    public static SubLObject expand_define_class_hide(SubLObject class_name, final SubLObject class_properties, final SubLObject slot_decls) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!class_name.isSymbol())) {
	    Errors.error($str128$___S_is_not_a_valid_class_name_, class_name);
	}
	class_properties_must_be_valid(class_properties);
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == classes_valid_instance_var_decls_p(slot_decls))) {
	    Errors.error($str129$___S_is_not_a_valid_member_variab, slot_decls);
	}
	final SubLObject parent_class = classes_getf(class_properties, $EXTENDS);
	SubLObject parent_interfaces = classes_getf(class_properties, $IMPLEMENTS);
	final SubLObject slot_properties = classes_implement_slot_listeners_p(class_properties);
	SubLObject v_class = NIL;
	if (parent_interfaces.isSymbol() && (NIL != parent_interfaces)) {
	    parent_interfaces = list(parent_interfaces);
	}
	v_class = new_class(class_name, parent_class, parent_interfaces, slot_decls);
	class_set_implements_slot_listeners(v_class, slot_properties);
	SubLObject expanded_definition = NIL;
	final SubLObject expanded_class_initializer = expand_class_initializer(class_name);
	final SubLObject expanded_instance_initializer = expand_instance_initializer(class_name);
	final SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding(thread);
	try {
	    $classes_new_class_current$.bind(class_name, thread);
	    if (NIL != slot_properties) {
		expanded_definition = listS(PROGN, list(SUBLOOP_NEW_CLASS, list(QUOTE, class_name), list(QUOTE, parent_class), list(QUOTE, parent_interfaces), NIL != classes_getf(class_properties, $ABSTRACT) ? T : NIL, list(QUOTE, slot_decls)),
			listS(CLASS_SET_IMPLEMENTS_SLOT_LISTENERS, list(QUOTE, class_name), $list133), append(expand_accessors_for_class(class_name, T), expand_interface_method_instantiations(class_name),
				list(expanded_class_initializer, expanded_instance_initializer, expand_class_predicator(class_name), list(cadr(second(expanded_class_initializer)), list(QUOTE, class_name)))));
	    } else {
		expanded_definition = listS(PROGN, list(SUBLOOP_NEW_CLASS, list(QUOTE, class_name), list(QUOTE, parent_class), list(QUOTE, parent_interfaces), NIL != classes_getf(class_properties, $ABSTRACT) ? T : NIL, list(QUOTE, slot_decls)),
			listS(CLASS_SET_IMPLEMENTS_SLOT_LISTENERS, list(QUOTE, class_name), $list112), append(expand_accessors_for_class(class_name, UNPROVIDED), expand_interface_method_instantiations(class_name),
				list(expanded_class_initializer, expanded_instance_initializer, expand_class_predicator(class_name), list(cadr(second(expanded_class_initializer)), list(QUOTE, class_name)))));
	    }
	} finally {
	    $classes_new_class_current$.rebind(_prev_bind_0, thread);
	}
	return expanded_definition;
    }

    public static final SubLObject define_class(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject class_name_and_properties = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt134);
	    class_name_and_properties = current.first();
	    current = current.rest();
	    {
		SubLObject slot_decls = current;
		SubLObject datum_5 = class_name_and_properties;
		SubLObject current_6 = datum_5;
		SubLObject class_name = NIL;
		SubLObject class_properties = NIL;
		destructuring_bind_must_consp(current_6, datum_5, $list_alt135);
		class_name = current_6.first();
		current_6 = current_6.rest();
		class_properties = current_6;
		{
		    SubLObject class_structure = com.cyc.cycjava.cycl.classes.new_class(class_name, com.cyc.cycjava.cycl.classes.classes_getf(class_properties, $EXTENDS), com.cyc.cycjava.cycl.classes.classes_getf(class_properties, $IMPLEMENTS), slot_decls);
		    subloop_class_properties.set_subloop_class_property_abstract_p(class_structure, com.cyc.cycjava.cycl.classes.classes_getf(class_properties, $ABSTRACT));
		    return com.cyc.cycjava.cycl.classes.expand_define_class(class_name, class_properties, slot_decls);
		}
	    }
	}
    }

    public static SubLObject define_class_hide(SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject class_name_and_properties = NIL;
	destructuring_bind_must_consp(current, datum, $list134);
	class_name_and_properties = current.first();
	final SubLObject slot_decls;
	current = slot_decls = current.rest();
	SubLObject current_$6;
	final SubLObject datum_$5 = current_$6 = class_name_and_properties;
	SubLObject class_name = NIL;
	SubLObject class_properties = NIL;
	destructuring_bind_must_consp(current_$6, datum_$5, $list135);
	class_name = current_$6.first();
	current_$6 = class_properties = current_$6.rest();
	final SubLObject class_structure = new_class(class_name, classes_getf(class_properties, $EXTENDS), classes_getf(class_properties, $IMPLEMENTS), slot_decls);
	subloop_class_properties.set_subloop_class_property_abstract_p(class_structure, classes_getf(class_properties, $ABSTRACT));
	return expand_define_class(class_name, class_properties, slot_decls);
    }

    public static final SubLObject subloop_new_class(SubLObject class_name, SubLObject parent_class, SubLObject parent_interfaces, SubLObject abstract_p, SubLObject slot_decls) {
	{
	    SubLObject class_structure = com.cyc.cycjava.cycl.classes.new_class(class_name, parent_class, parent_interfaces, slot_decls);
	    subloop_class_properties.set_subloop_class_property_abstract_p(class_structure, abstract_p);
	    return class_structure;
	}
    }

    public static SubLObject subloop_new_class_hide(SubLObject class_name, final SubLObject parent_class, final SubLObject parent_interfaces, final SubLObject abstract_p, final SubLObject slot_decls) {
	final SubLObject class_structure = new_class(class_name, parent_class, parent_interfaces, slot_decls);
	subloop_class_properties.set_subloop_class_property_abstract_p(class_structure, abstract_p);
	LispSync.addClass(class_structure);
	return class_structure;
    }

    public static final SubLObject subloop_initialize_slot(SubLObject v_object, SubLObject class_name, SubLObject slot_name, SubLObject value) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_class = com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name);
		SubLObject setter = com.cyc.cycjava.cycl.classes.classes_retrieve_slot_setter(v_class, slot_name);
		{
		    SubLObject _prev_bind_0 = $curclass$.currentBinding(thread);
		    try {
			$curclass$.bind(v_class, thread);
			funcall(setter, v_object, value);
		    } finally {
			$curclass$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject subloop_initialize_slot_hide(SubLObject v_object, final SubLObject class_name, final SubLObject slot_name, final SubLObject value) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_class = classes_retrieve_class(class_name);
	final SubLObject setter = classes_retrieve_slot_setter(v_class, slot_name);
	final SubLObject _prev_bind_0 = $curclass$.currentBinding(thread);
	try {
	    $curclass$.bind(v_class, thread);
	    funcall(setter, v_object, value);
	} finally {
	    $curclass$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject subloop_note_class_initialization_function(SubLObject class_name, SubLObject class_initializer_name) {
	{
	    SubLObject v_class = com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name);
	    subloop_structures._csetf_class_class_initialization_function(v_class, class_initializer_name);
	}
	return NIL;
    }

    public static SubLObject subloop_note_class_initialization_function_hide(SubLObject class_name, final SubLObject class_initializer_name) {
	final SubLObject v_class = classes_retrieve_class(class_name);
	subloop_structures._csetf_class_class_initialization_function(v_class, class_initializer_name);
	return NIL;
    }

    public static final SubLObject subloop_note_instance_initialization_function(SubLObject class_name, SubLObject instance_initializer_name) {
	{
	    SubLObject v_class = com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name);
	    subloop_structures._csetf_class_instance_initialization_function(v_class, instance_initializer_name);
	}
	return NIL;
    }

    public static SubLObject subloop_note_instance_initialization_function_hide(SubLObject class_name, final SubLObject instance_initializer_name) {
	final SubLObject v_class = classes_retrieve_class(class_name);
	subloop_structures._csetf_class_instance_initialization_function(v_class, instance_initializer_name);
	return NIL;
    }

    public static final SubLObject subloop_instanceof_class(SubLObject v_object, SubLObject v_class) {
	if (NIL != subloop_structures.instance_p(v_object)) {
	    {
		SubLObject direct_class = subloop_structures.instance_class(v_object);
		SubLObject cdolist_list_var = subloop_structures.class_compiled_inheritance_path(direct_class);
		SubLObject superclass = NIL;
		for (superclass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), superclass = cdolist_list_var.first()) {
		    if (v_class == subloop_structures.class_name(superclass)) {
			return T;
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject subloop_instanceof_class_hide(SubLObject v_object, final SubLObject v_class) {
	if (NIL != subloop_structures.instance_p(v_object)) {
	    final SubLObject direct_class = subloop_structures.instance_class(v_object);
	    SubLObject cdolist_list_var = subloop_structures.class_compiled_inheritance_path(direct_class);
	    SubLObject superclass = NIL;
	    superclass = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (v_class.eql(subloop_structures.class_name(superclass))) {
		    return T;
		}
		cdolist_list_var = cdolist_list_var.rest();
		superclass = cdolist_list_var.first();
	    }
	}
	return NIL;
    }

    public static final SubLObject subloop_get_instance_slot(SubLObject v_object, SubLObject slot_index) {
	return aref(subloop_structures.instance_any_slots(v_object), slot_index);
    }

    public static SubLObject subloop_get_instance_slot_hide(SubLObject v_object, final SubLObject slot_index) {
	return aref(subloop_structures.instance_any_slots(v_object), slot_index);
    }

    public static final SubLObject subloop_get_access_protected_instance_slot(SubLObject v_object, SubLObject slot_index, SubLObject slot_name) {
	{
	    SubLObject v_class = subloop_structures.instance_class(v_object);
	    SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
	    instances.instances_access_check_instance_slot(v_class, v_object, slot);
	}
	return com.cyc.cycjava.cycl.classes.subloop_get_instance_slot(v_object, slot_index);
    }

    public static SubLObject subloop_get_access_protected_instance_slot_hide(SubLObject v_object, final SubLObject slot_index, final SubLObject slot_name) {
	final SubLObject v_class = subloop_structures.instance_class(v_object);
	final SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
	instances.instances_access_check_instance_slot(v_class, v_object, slot);
	return subloop_get_instance_slot(v_object, slot_index);
    }

    public static final SubLObject subloop_set_instance_slot(SubLObject v_object, SubLObject value, SubLObject slot_index) {
	set_aref(subloop_structures.instance_any_slots(v_object), slot_index, value);
	return value;
    }

    public static SubLObject subloop_set_instance_slot_hide(SubLObject v_object, final SubLObject value, final SubLObject slot_index) {
	set_aref(subloop_structures.instance_any_slots(v_object), slot_index, value);
	return value;
    }

    public static final SubLObject subloop_set_access_protected_instance_slot(SubLObject v_object, SubLObject value, SubLObject slot_index, SubLObject slot_name) {
	{
	    SubLObject v_class = subloop_structures.instance_class(v_object);
	    SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
	    instances.instances_access_check_instance_slot(v_class, v_object, slot);
	}
	return com.cyc.cycjava.cycl.classes.subloop_set_instance_slot(v_object, value, slot_index);
    }

    public static SubLObject subloop_set_access_protected_instance_slot_hide(SubLObject v_object, final SubLObject value, final SubLObject slot_index, final SubLObject slot_name) {
	final SubLObject v_class = subloop_structures.instance_class(v_object);
	final SubLObject slot = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
	instances.instances_access_check_instance_slot(v_class, v_object, slot);
	return subloop_set_instance_slot(v_object, value, slot_index);
    }

    public static final SubLObject classes_compile_inheritance_path(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? ((SubLObject) (class_name_or_class)) : class_name_or_class.isSymbol() ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : NIL;
		if (NIL != v_class) {
		    if (NIL == recompile) {
			{
			    SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(v_class);
			    if (NIL != compiled_inheritance_path) {
				return compiled_inheritance_path;
			    }
			}
		    }
		    {
			SubLObject parent = subloop_structures.class_parent(v_class);
			SubLObject parent_inheritance_path = (NIL != parent) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_compile_inheritance_path(parent, NIL))) : NIL;
			SubLObject inheritance_path = cons(v_class, parent_inheritance_path);
			if (NIL != parent) {
			    {
				SubLObject parent_class = com.cyc.cycjava.cycl.classes.classes_retrieve_class(parent);
				SubLObject class_name = subloop_structures.class_name(v_class);
				if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
				    if (NIL == parent_class) {
					Errors.error($str_alt71$__Attempting_to_subclass_unknown_, parent);
				    }
				}
				if (NIL == member(class_name, subloop_structures.class_subclasses(parent_class), symbol_function(EQ), UNPROVIDED)) {
				    subloop_structures._csetf_class_subclasses(parent_class, cons(class_name, subloop_structures.class_subclasses(parent_class)));
				}
			    }
			}
			subloop_structures._csetf_class_compiled_inheritance_path(v_class, inheritance_path);
			return inheritance_path;
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_compile_inheritance_path_hide(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : NIL;
	if (NIL != v_class) {
	    if (NIL == recompile) {
		final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(v_class);
		if (NIL != compiled_inheritance_path) {
		    return compiled_inheritance_path;
		}
	    }
	    final SubLObject parent = subloop_structures.class_parent(v_class);
	    final SubLObject parent_inheritance_path = (NIL != parent) ? classes_compile_inheritance_path(parent, NIL) : NIL;
	    final SubLObject inheritance_path = cons(v_class, parent_inheritance_path);
	    if (NIL != parent) {
		final SubLObject parent_class = classes_retrieve_class(parent);
		final SubLObject class_name = subloop_structures.class_name(v_class);
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == parent_class)) {
		    Errors.error($str71$__Attempting_to_subclass_unknown_, parent);
		}
		if (NIL == member(class_name, subloop_structures.class_subclasses(parent_class), symbol_function(EQ), UNPROVIDED)) {
		    subloop_structures._csetf_class_subclasses(parent_class, cons(class_name, subloop_structures.class_subclasses(parent_class)));
		}
	    }
	    subloop_structures._csetf_class_compiled_inheritance_path(v_class, inheritance_path);
	    return inheritance_path;
	}
	return NIL;
    }

    public static final SubLObject classes_instance_slot_index(SubLObject v_class, SubLObject slot_name) {
	return slots.find_slot_index(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
    }

    public static SubLObject classes_instance_slot_index_hide(SubLObject v_class, final SubLObject slot_name) {
	return slots.find_slot_index(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
    }

    public static final SubLObject classes_boolean_slot_decl_p(SubLObject slot_decl) {
	return makeBoolean(slot_decl.isCons() && (NIL != member($BOOLEAN, slot_decl.rest(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject classes_boolean_slot_decl_p_hide(SubLObject slot_decl) {
	return makeBoolean(slot_decl.isCons() && (NIL != member($BOOLEAN, slot_decl.rest(), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject classes_class_slot_decl_p(SubLObject slot_decl) {
	return makeBoolean(slot_decl.isCons() && (NIL != member($CLASS, slot_decl.rest(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject classes_class_slot_decl_p_hide(SubLObject slot_decl) {
	return makeBoolean(slot_decl.isCons() && (NIL != member($CLASS, slot_decl.rest(), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject classes_instance_slot_decl_p(SubLObject slot_decl) {
	return makeBoolean((slot_decl.isCons() && ((NIL != member($INSTANCE, slot_decl.rest(), UNPROVIDED, UNPROVIDED)) || (NIL == member($CLASS, slot_decl.rest(), UNPROVIDED, UNPROVIDED)))) || slot_decl.isSymbol());
    }

    public static SubLObject classes_instance_slot_decl_p_hide(SubLObject slot_decl) {
	return makeBoolean((slot_decl.isCons() && ((NIL != member($INSTANCE, slot_decl.rest(), UNPROVIDED, UNPROVIDED)) || (NIL == member($CLASS, slot_decl.rest(), UNPROVIDED, UNPROVIDED)))) || slot_decl.isSymbol());
    }

    public static final SubLObject classes_protection_level_of_slot_decl(SubLObject slot_decl) {
	if (slot_decl.isCons()) {
	    {
		SubLObject v_properties = slot_decl.rest();
		if (v_properties.isCons()) {
		    if (NIL != member($PRIVATE, v_properties, UNPROVIDED, UNPROVIDED)) {
			return $PRIVATE;
		    }
		    if (NIL != member($PROTECTED, v_properties, UNPROVIDED, UNPROVIDED)) {
			return $PROTECTED;
		    }
		    if (NIL != member($PUBLIC, v_properties, UNPROVIDED, UNPROVIDED)) {
			return $PUBLIC;
		    }
		    return $PUBLIC;
		} else {
		    return $PUBLIC;
		}
	    }
	} else {
	    return $PUBLIC;
	}
    }

    public static SubLObject classes_protection_level_of_slot_decl_hide(SubLObject slot_decl) {
	if (!slot_decl.isCons()) {
	    return $PUBLIC;
	}
	final SubLObject v_properties = slot_decl.rest();
	if (!v_properties.isCons()) {
	    return $PUBLIC;
	}
	if (NIL != member($PRIVATE, v_properties, UNPROVIDED, UNPROVIDED)) {
	    return $PRIVATE;
	}
	if (NIL != member($PROTECTED, v_properties, UNPROVIDED, UNPROVIDED)) {
	    return $PROTECTED;
	}
	if (NIL != member($PUBLIC, v_properties, UNPROVIDED, UNPROVIDED)) {
	    return $PUBLIC;
	}
	return $PUBLIC;
    }

    public static final SubLObject classes_essential_slot_p(SubLObject slot_decl) {
	if (slot_decl.isCons()) {
	    {
		SubLObject v_properties = slot_decl.rest();
		if (v_properties.isCons()) {
		    return makeBoolean((NIL != member($ESSENTIAL, v_properties, UNPROVIDED, UNPROVIDED)) && (NIL == member($NON_ESSENTIAL, v_properties, UNPROVIDED, UNPROVIDED)));
		} else {
		    return NIL;
		}
	    }
	} else {
	    return NIL;
	}
    }

    public static SubLObject classes_essential_slot_p_hide(SubLObject slot_decl) {
	if (!slot_decl.isCons()) {
	    return NIL;
	}
	final SubLObject v_properties = slot_decl.rest();
	if (v_properties.isCons()) {
	    return makeBoolean((NIL != member($ESSENTIAL, v_properties, UNPROVIDED, UNPROVIDED)) && (NIL == member($NON_ESSENTIAL, v_properties, UNPROVIDED, UNPROVIDED)));
	}
	return NIL;
    }

    public static final SubLObject classes_value_of_slot_decl(SubLObject slot_decl) {
	if (slot_decl.isCons()) {
	    {
		SubLObject v_properties = slot_decl.rest();
		if (v_properties.isCons()) {
		    {
			SubLObject value_sublist = member($VALUE, v_properties, UNPROVIDED, UNPROVIDED);
			if (NIL != value_sublist) {
			    if (value_sublist.rest().isCons()) {
				return cadr(value_sublist);
			    } else {
				return NIL;
			    }
			} else {
			    return NIL;
			}
		    }
		} else {
		    return NIL;
		}
	    }
	} else {
	    return NIL;
	}
    }

    public static SubLObject classes_value_of_slot_decl_hide(SubLObject slot_decl) {
	if (!slot_decl.isCons()) {
	    return NIL;
	}
	final SubLObject v_properties = slot_decl.rest();
	if (!v_properties.isCons()) {
	    return NIL;
	}
	final SubLObject value_sublist = member($VALUE, v_properties, UNPROVIDED, UNPROVIDED);
	if (NIL == value_sublist) {
	    return NIL;
	}
	if (value_sublist.rest().isCons()) {
	    return cadr(value_sublist);
	}
	return NIL;
    }

    public static final SubLObject classes_slot_name_given_slot_decl(SubLObject slot_decl) {
	return slot_decl.isSymbol() ? ((SubLObject) (slot_decl)) : slot_decl.isCons() ? ((SubLObject) (slot_decl.first().isSymbol() ? ((SubLObject) (slot_decl.first())) : NIL)) : NIL;
    }

    public static SubLObject classes_slot_name_given_slot_decl_hide(SubLObject slot_decl) {
	return slot_decl.isSymbol() ? slot_decl : slot_decl.isCons() ? slot_decl.first().isSymbol() ? slot_decl.first() : NIL : NIL;
    }

    public static final SubLObject classes_compile_instance_slot_access_list(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	{
	    SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? ((SubLObject) (class_name_or_class)) : class_name_or_class.isSymbol() ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : NIL;
	    SubLObject class_name = (NIL != v_class) ? ((SubLObject) (subloop_structures.class_name(v_class))) : NIL;
	    if (NIL != v_class) {
		if (NIL == recompile) {
		    {
			SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
			if (NIL != compiled_instance_slot_access_alist) {
			    return compiled_instance_slot_access_alist;
			}
		    }
		}
		{
		    SubLObject parent = subloop_structures.class_parent(v_class);
		    SubLObject parent_instance_slot_access_list = (NIL != parent) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_compile_instance_slot_access_list(parent, NIL))) : NIL;
		    SubLObject last_index = (NIL != parent_instance_slot_access_list) ? ((SubLObject) (slots.slot_index(parent_instance_slot_access_list.first()))) : MINUS_ONE_INTEGER;
		    SubLObject instance_var = NIL;
		    SubLObject cdolist_list_var = subloop_structures.class_instance_var_decls(v_class);
		    SubLObject decl = NIL;
		    for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
			if (NIL == com.cyc.cycjava.cycl.classes.classes_boolean_slot_decl_p(decl)) {
			    instance_var = com.cyc.cycjava.cycl.classes.classes_slot_name_given_slot_decl(decl);
			    if (NIL != instance_var) {
				if (NIL == slots.slot_assoc(instance_var, parent_instance_slot_access_list)) {
				    last_index = add(last_index, ONE_INTEGER);
				    parent_instance_slot_access_list = cons(
					    slots.new_slot(instance_var, last_index, class_name, com.cyc.cycjava.cycl.classes.classes_protection_level_of_slot_decl(decl), com.cyc.cycjava.cycl.classes.classes_essential_slot_p(decl), com.cyc.cycjava.cycl.classes.classes_value_of_slot_decl(decl)),
					    parent_instance_slot_access_list);
				} else {
				    slots.set_slot_init_value(instance_var, parent_instance_slot_access_list, com.cyc.cycjava.cycl.classes.classes_value_of_slot_decl(decl));
				}
			    }
			}
		    }
		    subloop_structures._csetf_class_compiled_instance_slot_access_alist(v_class, parent_instance_slot_access_list);
		    return parent_instance_slot_access_list;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_compile_instance_slot_access_list_hide(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	final SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : NIL;
	final SubLObject class_name = (NIL != v_class) ? subloop_structures.class_name(v_class) : NIL;
	if (NIL != v_class) {
	    if (NIL == recompile) {
		final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
		if (NIL != compiled_instance_slot_access_alist) {
		    return compiled_instance_slot_access_alist;
		}
	    }
	    final SubLObject parent = subloop_structures.class_parent(v_class);
	    SubLObject parent_instance_slot_access_list = (NIL != parent) ? classes_compile_instance_slot_access_list(parent, NIL) : NIL;
	    SubLObject last_index = (NIL != parent_instance_slot_access_list) ? slots.slot_index(parent_instance_slot_access_list.first()) : MINUS_ONE_INTEGER;
	    SubLObject instance_var = NIL;
	    SubLObject cdolist_list_var = subloop_structures.class_instance_var_decls(v_class);
	    SubLObject decl = NIL;
	    decl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL == classes_boolean_slot_decl_p(decl)) {
		    instance_var = classes_slot_name_given_slot_decl(decl);
		    if (NIL != instance_var) {
			if (NIL == slots.slot_assoc(instance_var, parent_instance_slot_access_list)) {
			    last_index = add(last_index, ONE_INTEGER);
			    parent_instance_slot_access_list = cons(slots.new_slot(instance_var, last_index, class_name, classes_protection_level_of_slot_decl(decl), classes_essential_slot_p(decl), classes_value_of_slot_decl(decl)), parent_instance_slot_access_list);
			} else {
			    slots.set_slot_init_value(instance_var, parent_instance_slot_access_list, classes_value_of_slot_decl(decl));
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		decl = cdolist_list_var.first();
	    }
	    subloop_structures._csetf_class_compiled_instance_slot_access_alist(v_class, parent_instance_slot_access_list);
	    return parent_instance_slot_access_list;
	}
	return NIL;
    }

    public static final SubLObject classes_compile_instance_boolean_slot_access_list(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	{
	    SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? ((SubLObject) (class_name_or_class)) : class_name_or_class.isSymbol() ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : NIL;
	    SubLObject class_name = (NIL != v_class) ? ((SubLObject) (subloop_structures.class_name(v_class))) : NIL;
	    if (NIL != v_class) {
		if (NIL == recompile) {
		    {
			SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
			if (NIL != compiled_instance_boolean_slot_access_alist) {
			    return compiled_instance_boolean_slot_access_alist;
			}
		    }
		}
		{
		    SubLObject parent = subloop_structures.class_parent(v_class);
		    SubLObject parent_instance_boolean_slot_access_list = (NIL != parent) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_compile_instance_boolean_slot_access_list(parent, NIL))) : NIL;
		    SubLObject last_index = (NIL != parent_instance_boolean_slot_access_list) ? ((SubLObject) (slots.slot_index(parent_instance_boolean_slot_access_list.first()))) : MINUS_ONE_INTEGER;
		    SubLObject instance_var = NIL;
		    SubLObject cdolist_list_var = subloop_structures.class_instance_var_decls(v_class);
		    SubLObject decl = NIL;
		    for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
			if (NIL != com.cyc.cycjava.cycl.classes.classes_boolean_slot_decl_p(decl)) {
			    instance_var = com.cyc.cycjava.cycl.classes.classes_slot_name_given_slot_decl(decl);
			    if (NIL != instance_var) {
				if (NIL == slots.slot_assoc(instance_var, parent_instance_boolean_slot_access_list)) {
				    last_index = add(last_index, ONE_INTEGER);
				    parent_instance_boolean_slot_access_list = cons(
					    slots.new_slot(instance_var, last_index, class_name, com.cyc.cycjava.cycl.classes.classes_protection_level_of_slot_decl(decl), com.cyc.cycjava.cycl.classes.classes_essential_slot_p(decl), com.cyc.cycjava.cycl.classes.classes_value_of_slot_decl(decl)),
					    parent_instance_boolean_slot_access_list);
				} else {
				    slots.set_slot_init_value(instance_var, parent_instance_boolean_slot_access_list, com.cyc.cycjava.cycl.classes.classes_value_of_slot_decl(decl));
				}
			    }
			}
		    }
		    subloop_structures._csetf_class_compiled_instance_boolean_slot_access_alist(v_class, parent_instance_boolean_slot_access_list);
		    return parent_instance_boolean_slot_access_list;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_compile_instance_boolean_slot_access_list_hide(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	final SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : NIL;
	final SubLObject class_name = (NIL != v_class) ? subloop_structures.class_name(v_class) : NIL;
	if (NIL != v_class) {
	    if (NIL == recompile) {
		final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
		if (NIL != compiled_instance_boolean_slot_access_alist) {
		    return compiled_instance_boolean_slot_access_alist;
		}
	    }
	    final SubLObject parent = subloop_structures.class_parent(v_class);
	    SubLObject parent_instance_boolean_slot_access_list = (NIL != parent) ? classes_compile_instance_boolean_slot_access_list(parent, NIL) : NIL;
	    SubLObject last_index = (NIL != parent_instance_boolean_slot_access_list) ? slots.slot_index(parent_instance_boolean_slot_access_list.first()) : MINUS_ONE_INTEGER;
	    SubLObject instance_var = NIL;
	    SubLObject cdolist_list_var = subloop_structures.class_instance_var_decls(v_class);
	    SubLObject decl = NIL;
	    decl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != classes_boolean_slot_decl_p(decl)) {
		    instance_var = classes_slot_name_given_slot_decl(decl);
		    if (NIL != instance_var) {
			if (NIL == slots.slot_assoc(instance_var, parent_instance_boolean_slot_access_list)) {
			    last_index = add(last_index, ONE_INTEGER);
			    parent_instance_boolean_slot_access_list = cons(slots.new_slot(instance_var, last_index, class_name, classes_protection_level_of_slot_decl(decl), classes_essential_slot_p(decl), classes_value_of_slot_decl(decl)), parent_instance_boolean_slot_access_list);
			} else {
			    slots.set_slot_init_value(instance_var, parent_instance_boolean_slot_access_list, classes_value_of_slot_decl(decl));
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		decl = cdolist_list_var.first();
	    }
	    subloop_structures._csetf_class_compiled_instance_boolean_slot_access_alist(v_class, parent_instance_boolean_slot_access_list);
	    return parent_instance_boolean_slot_access_list;
	}
	return NIL;
    }

    public static final SubLObject classes_compile_class_slot_access_list(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	{
	    SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? ((SubLObject) (class_name_or_class)) : class_name_or_class.isSymbol() ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : NIL;
	    SubLObject class_name = (NIL != v_class) ? ((SubLObject) (subloop_structures.class_name(v_class))) : NIL;
	    if (NIL != v_class) {
		if (NIL == recompile) {
		    {
			SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
			if (NIL != compiled_class_slot_access_alist) {
			    return compiled_class_slot_access_alist;
			}
		    }
		}
		{
		    SubLObject parent = subloop_structures.class_parent(v_class);
		    SubLObject parent_class_slot_access_list = (NIL != parent) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_compile_class_slot_access_list(parent, NIL))) : NIL;
		    SubLObject last_index = (NIL != parent_class_slot_access_list) ? ((SubLObject) (slots.slot_index(parent_class_slot_access_list.first()))) : MINUS_ONE_INTEGER;
		    SubLObject class_var = NIL;
		    SubLObject cdolist_list_var = subloop_structures.class_class_var_decls(v_class);
		    SubLObject decl = NIL;
		    for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
			if (NIL == com.cyc.cycjava.cycl.classes.classes_boolean_slot_decl_p(decl)) {
			    class_var = com.cyc.cycjava.cycl.classes.classes_slot_name_given_slot_decl(decl);
			    if (NIL != class_var) {
				if (NIL == slots.slot_assoc(class_var, parent_class_slot_access_list)) {
				    last_index = add(last_index, ONE_INTEGER);
				    parent_class_slot_access_list = cons(
					    slots.new_slot(class_var, last_index, class_name, com.cyc.cycjava.cycl.classes.classes_protection_level_of_slot_decl(decl), com.cyc.cycjava.cycl.classes.classes_essential_slot_p(decl), com.cyc.cycjava.cycl.classes.classes_value_of_slot_decl(decl)),
					    parent_class_slot_access_list);
				}
			    }
			}
		    }
		    subloop_structures._csetf_class_compiled_class_slot_access_alist(v_class, parent_class_slot_access_list);
		    return parent_class_slot_access_list;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_compile_class_slot_access_list_hide(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	final SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : NIL;
	final SubLObject class_name = (NIL != v_class) ? subloop_structures.class_name(v_class) : NIL;
	if (NIL != v_class) {
	    if (NIL == recompile) {
		final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
		if (NIL != compiled_class_slot_access_alist) {
		    return compiled_class_slot_access_alist;
		}
	    }
	    final SubLObject parent = subloop_structures.class_parent(v_class);
	    SubLObject parent_class_slot_access_list = (NIL != parent) ? classes_compile_class_slot_access_list(parent, NIL) : NIL;
	    SubLObject last_index = (NIL != parent_class_slot_access_list) ? slots.slot_index(parent_class_slot_access_list.first()) : MINUS_ONE_INTEGER;
	    SubLObject class_var = NIL;
	    SubLObject cdolist_list_var = subloop_structures.class_class_var_decls(v_class);
	    SubLObject decl = NIL;
	    decl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL == classes_boolean_slot_decl_p(decl)) {
		    class_var = classes_slot_name_given_slot_decl(decl);
		    if ((NIL != class_var) && (NIL == slots.slot_assoc(class_var, parent_class_slot_access_list))) {
			last_index = add(last_index, ONE_INTEGER);
			parent_class_slot_access_list = cons(slots.new_slot(class_var, last_index, class_name, classes_protection_level_of_slot_decl(decl), classes_essential_slot_p(decl), classes_value_of_slot_decl(decl)), parent_class_slot_access_list);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		decl = cdolist_list_var.first();
	    }
	    subloop_structures._csetf_class_compiled_class_slot_access_alist(v_class, parent_class_slot_access_list);
	    return parent_class_slot_access_list;
	}
	return NIL;
    }

    public static final SubLObject classes_compile_class_boolean_slot_access_list(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	{
	    SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? ((SubLObject) (class_name_or_class)) : class_name_or_class.isSymbol() ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : NIL;
	    SubLObject class_name = (NIL != v_class) ? ((SubLObject) (subloop_structures.class_name(v_class))) : NIL;
	    if (NIL != v_class) {
		if (NIL == recompile) {
		    {
			SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
			if (NIL != compiled_class_boolean_slot_access_alist) {
			    return compiled_class_boolean_slot_access_alist;
			}
		    }
		}
		{
		    SubLObject parent = subloop_structures.class_parent(v_class);
		    SubLObject parent_class_boolean_slot_access_list = (NIL != parent) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_compile_class_boolean_slot_access_list(parent, NIL))) : NIL;
		    SubLObject last_index = (NIL != parent_class_boolean_slot_access_list) ? ((SubLObject) (slots.slot_index(parent_class_boolean_slot_access_list.first()))) : MINUS_ONE_INTEGER;
		    SubLObject class_var = NIL;
		    SubLObject cdolist_list_var = subloop_structures.class_class_var_decls(v_class);
		    SubLObject decl = NIL;
		    for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), decl = cdolist_list_var.first()) {
			if (NIL != com.cyc.cycjava.cycl.classes.classes_boolean_slot_decl_p(decl)) {
			    class_var = com.cyc.cycjava.cycl.classes.classes_slot_name_given_slot_decl(decl);
			    if (NIL != class_var) {
				if (NIL == slots.slot_assoc(class_var, parent_class_boolean_slot_access_list)) {
				    last_index = add(last_index, ONE_INTEGER);
				    parent_class_boolean_slot_access_list = cons(
					    slots.new_slot(class_var, last_index, class_name, com.cyc.cycjava.cycl.classes.classes_protection_level_of_slot_decl(decl), com.cyc.cycjava.cycl.classes.classes_essential_slot_p(decl), com.cyc.cycjava.cycl.classes.classes_value_of_slot_decl(decl)),
					    parent_class_boolean_slot_access_list);
				}
			    }
			}
		    }
		    subloop_structures._csetf_class_compiled_class_boolean_slot_access_alist(v_class, parent_class_boolean_slot_access_list);
		    return parent_class_boolean_slot_access_list;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_compile_class_boolean_slot_access_list_hide(SubLObject class_name_or_class, SubLObject recompile) {
	if (recompile == UNPROVIDED) {
	    recompile = T;
	}
	final SubLObject v_class = (NIL != subloop_structures.class_p(class_name_or_class)) ? class_name_or_class : class_name_or_class.isSymbol() ? classes_retrieve_class(class_name_or_class) : NIL;
	final SubLObject class_name = (NIL != v_class) ? subloop_structures.class_name(v_class) : NIL;
	if (NIL != v_class) {
	    if (NIL == recompile) {
		final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
		if (NIL != compiled_class_boolean_slot_access_alist) {
		    return compiled_class_boolean_slot_access_alist;
		}
	    }
	    final SubLObject parent = subloop_structures.class_parent(v_class);
	    SubLObject parent_class_boolean_slot_access_list = (NIL != parent) ? classes_compile_class_boolean_slot_access_list(parent, NIL) : NIL;
	    SubLObject last_index = (NIL != parent_class_boolean_slot_access_list) ? slots.slot_index(parent_class_boolean_slot_access_list.first()) : MINUS_ONE_INTEGER;
	    SubLObject class_var = NIL;
	    SubLObject cdolist_list_var = subloop_structures.class_class_var_decls(v_class);
	    SubLObject decl = NIL;
	    decl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != classes_boolean_slot_decl_p(decl)) {
		    class_var = classes_slot_name_given_slot_decl(decl);
		    if ((NIL != class_var) && (NIL == slots.slot_assoc(class_var, parent_class_boolean_slot_access_list))) {
			last_index = add(last_index, ONE_INTEGER);
			parent_class_boolean_slot_access_list = cons(slots.new_slot(class_var, last_index, class_name, classes_protection_level_of_slot_decl(decl), classes_essential_slot_p(decl), classes_value_of_slot_decl(decl)), parent_class_boolean_slot_access_list);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		decl = cdolist_list_var.first();
	    }
	    subloop_structures._csetf_class_compiled_class_boolean_slot_access_alist(v_class, parent_class_boolean_slot_access_list);
	    return parent_class_boolean_slot_access_list;
	}
	return NIL;
    }

    public static final SubLObject classes_initialize_class_slots(SubLObject class_name_or_class) {
	{
	    SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : class_name_or_class;
	    if (NIL != subloop_structures.class_p(v_class)) {
		{
		    SubLObject boolean_slot_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
		    SubLObject boolean_slot_count = length(boolean_slot_alist);
		    SubLObject boolean_slot_vector = (boolean_slot_count.numG(ZERO_INTEGER)) ? ((SubLObject) (ZERO_INTEGER)) : NIL;
		    SubLObject any_slot_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
		    SubLObject any_slot_count = length(any_slot_alist);
		    SubLObject any_slot_vector = (any_slot_count.numG(ZERO_INTEGER)) ? ((SubLObject) (make_vector(any_slot_count, UNPROVIDED))) : NIL;
		    if (NIL != any_slot_vector) {
			{
			    SubLObject i = NIL;
			    for (i = ZERO_INTEGER; i.numL(any_slot_count); i = add(i, ONE_INTEGER)) {
				set_aref(any_slot_vector, i, NIL);
			    }
			}
		    }
		    subloop_structures._csetf_class_boolean_slots(v_class, boolean_slot_vector);
		    subloop_structures._csetf_class_any_slots(v_class, any_slot_vector);
		}
		return v_class;
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_initialize_class_slots_hide(SubLObject class_name_or_class) {
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
	if (NIL != subloop_structures.class_p(v_class)) {
	    final SubLObject boolean_slot_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
	    final SubLObject boolean_slot_count = length(boolean_slot_alist);
	    final SubLObject boolean_slot_vector = (boolean_slot_count.numG(ZERO_INTEGER)) ? ZERO_INTEGER : NIL;
	    final SubLObject any_slot_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
	    final SubLObject any_slot_count = length(any_slot_alist);
	    final SubLObject any_slot_vector = (any_slot_count.numG(ZERO_INTEGER)) ? make_vector(any_slot_count, UNPROVIDED) : NIL;
	    if (NIL != any_slot_vector) {
		SubLObject i;
		for (i = NIL, i = ZERO_INTEGER; i.numL(any_slot_count); i = add(i, ONE_INTEGER)) {
		    set_aref(any_slot_vector, i, NIL);
		}
	    }
	    subloop_structures._csetf_class_boolean_slots(v_class, boolean_slot_vector);
	    subloop_structures._csetf_class_any_slots(v_class, any_slot_vector);
	    return v_class;
	}
	return NIL;
    }

    public static final SubLObject superclassp(SubLObject class_name_or_class_1, SubLObject class_name_or_class_2) {
	{
	    SubLObject class1 = (class_name_or_class_1.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class_1))) : class_name_or_class_1;
	    SubLObject class2 = (class_name_or_class_2.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class_2))) : class_name_or_class_2;
	    if ((NIL != subloop_structures.class_p(class1)) && (NIL != subloop_structures.class_p(class2))) {
		{
		    SubLObject class1_name = subloop_structures.class_name(class1);
		    SubLObject cdolist_list_var = subloop_structures.class_compiled_inheritance_path(class2);
		    SubLObject parent_class = NIL;
		    for (parent_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), parent_class = cdolist_list_var.first()) {
			if (class1_name == subloop_structures.class_name(parent_class)) {
			    return T;
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject superclassp_hide(SubLObject class_name_or_class_1, final SubLObject class_name_or_class_2) {
	final SubLObject class1 = (class_name_or_class_1.isSymbol()) ? classes_retrieve_class(class_name_or_class_1) : class_name_or_class_1;
	final SubLObject class2 = (class_name_or_class_2.isSymbol()) ? classes_retrieve_class(class_name_or_class_2) : class_name_or_class_2;
	if ((NIL != subloop_structures.class_p(class1)) && (NIL != subloop_structures.class_p(class2))) {
	    final SubLObject class1_name = subloop_structures.class_name(class1);
	    SubLObject cdolist_list_var = subloop_structures.class_compiled_inheritance_path(class2);
	    SubLObject parent_class = NIL;
	    parent_class = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (class1_name.eql(subloop_structures.class_name(parent_class))) {
		    return T;
		}
		cdolist_list_var = cdolist_list_var.rest();
		parent_class = cdolist_list_var.first();
	    }
	}
	return NIL;
    }

    public static final SubLObject subclassp(SubLObject class_name_or_class_1, SubLObject class_name_or_class_2) {
	return com.cyc.cycjava.cycl.classes.superclassp(class_name_or_class_2, class_name_or_class_1);
    }

    public static SubLObject subclassp_hide(SubLObject class_name_or_class_1, final SubLObject class_name_or_class_2) {
	return superclassp(class_name_or_class_2, class_name_or_class_1);
    }

    public static final SubLObject classes_access_check_class_slot(SubLObject v_class, SubLObject slot) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject pcase_var = slots.slot_protection(slot);
		if (pcase_var.eql($PROTECTED)) {
		    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
			if (NIL == member(slots.slot_class_name(slot), subloop_structures.class_compiled_inheritance_path(v_class), symbol_function(EQ), symbol_function(CLASS_NAME))) {
			    Errors.error($classes_class_slot_access_violation$.getGlobalValue(), $PROTECTED, slots.slot_name(slot), subloop_structures.class_name(v_class));
			}
		    }
		} else {
		    if (pcase_var.eql($PRIVATE)) {
			if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
			    if (subloop_structures.class_name(v_class) != slots.slot_class_name(slot)) {
				Errors.error($classes_class_slot_access_violation$.getGlobalValue(), $PRIVATE, slots.slot_name(slot), subloop_structures.class_name(v_class));
			    }
			}
		    }
		}
	    }
	    return T;
	}
    }

    public static SubLObject classes_access_check_class_slot_hide(SubLObject v_class, final SubLObject slot) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject pcase_var = slots.slot_protection(slot);
	if (pcase_var.eql($PROTECTED)) {
	    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(slots.slot_class_name(slot), subloop_structures.class_compiled_inheritance_path(v_class), symbol_function(EQ), symbol_function(CLASS_NAME)))) {
		Errors.error($classes_class_slot_access_violation$.getGlobalValue(), $PROTECTED, slots.slot_name(slot), subloop_structures.class_name(v_class));
	    }
	} else if ((pcase_var.eql($PRIVATE) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (!subloop_structures.class_name(v_class).eql(slots.slot_class_name(slot)))) {
	    Errors.error($classes_class_slot_access_violation$.getGlobalValue(), $PRIVATE, slots.slot_name(slot), subloop_structures.class_name(v_class));
	}

	return T;
    }

    public static final SubLObject get_class_slot(SubLObject v_class, SubLObject slot_name) {
	{
	    SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
	    if (NIL != association) {
		com.cyc.cycjava.cycl.classes.classes_access_check_class_slot(v_class, association);
		return aref(subloop_structures.class_any_slots(v_class), slots.slot_index(association));
	    } else {
		association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
		if (NIL != association) {
		    com.cyc.cycjava.cycl.classes.classes_access_check_class_slot(v_class, association);
		    return com.cyc.cycjava.cycl.classes.ldb_test(bytes.sublisp_byte(ONE_INTEGER, slots.slot_index(association)), subloop_structures.class_boolean_slots(v_class));
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject get_class_slot_hide(SubLObject v_class, final SubLObject slot_name) {
	SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
	if (NIL != association) {
	    classes_access_check_class_slot(v_class, association);
	    return aref(subloop_structures.class_any_slots(v_class), slots.slot_index(association));
	}
	association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
	if (NIL != association) {
	    classes_access_check_class_slot(v_class, association);
	    return ldb_test(bytes.sublisp_byte(ONE_INTEGER, slots.slot_index(association)), subloop_structures.class_boolean_slots(v_class));
	}
	return NIL;
    }

    public static final SubLObject set_class_slot(SubLObject v_class, SubLObject slot_name, SubLObject value) {
	{
	    SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
	    if (NIL != association) {
		com.cyc.cycjava.cycl.classes.classes_access_check_class_slot(v_class, association);
		return set_aref(subloop_structures.class_any_slots(v_class), slots.slot_index(association), value);
	    } else {
		association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
		if (NIL != association) {
		    com.cyc.cycjava.cycl.classes.classes_access_check_class_slot(v_class, association);
		    subloop_structures._csetf_class_boolean_slots(v_class, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, bytes.sublisp_byte(ONE_INTEGER, slots.slot_index(association)), subloop_structures.class_boolean_slots(v_class)));
		    return value;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject set_class_slot_hide(SubLObject v_class, final SubLObject slot_name, final SubLObject value) {
	SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
	if (NIL != association) {
	    classes_access_check_class_slot(v_class, association);
	    return set_aref(subloop_structures.class_any_slots(v_class), slots.slot_index(association), value);
	}
	association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
	if (NIL != association) {
	    classes_access_check_class_slot(v_class, association);
	    subloop_structures._csetf_class_boolean_slots(v_class, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, bytes.sublisp_byte(ONE_INTEGER, slots.slot_index(association)), subloop_structures.class_boolean_slots(v_class)));
	    return value;
	}
	return NIL;
    }

    public static final SubLObject classes_shadowed_association(SubLObject target_key, SubLObject alist) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject cdolist_list_var = alist;
	    SubLObject association = NIL;
	    for (association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), association = cdolist_list_var.first()) {
		if (association.first() == target_key) {
		    if (count.numE(ONE_INTEGER)) {
			return association;
		    }
		    count = add(count, ONE_INTEGER);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_shadowed_association_hide(SubLObject target_key, final SubLObject alist) {
	SubLObject count = ZERO_INTEGER;
	SubLObject cdolist_list_var = alist;
	SubLObject association = NIL;
	association = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (association.first().eql(target_key)) {
		if (count.numE(ONE_INTEGER)) {
		    return association;
		}
		count = add(count, ONE_INTEGER);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    association = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject classes_all_class_slots(SubLObject class_name_or_class, SubLObject access_level) {
	if (access_level == UNPROVIDED) {
	    access_level = $PRIVATE;
	}
	{
	    SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : class_name_or_class;
	    if (NIL != subloop_structures.class_p(v_class)) {
		{
		    SubLObject v_class_7 = v_class;
		    SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_7);
		    SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_7);
		    SubLObject v_slots = NIL;
		    {
			SubLObject slot_name = NIL;
			SubLObject protection = NIL;
			SubLObject cdolist_list_var = compiled_class_slot_access_alist;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			    slot_name = slots.slot_name(slot);
			    protection = slots.slot_protection(slot);
			    if (NIL != com.cyc.cycjava.cycl.classes.classes_protection_greater_than_or_equal(access_level, protection)) {
				v_slots = cons(slot_name, v_slots);
			    }
			}
		    }
		    {
			SubLObject slot_name = NIL;
			SubLObject protection = NIL;
			SubLObject cdolist_list_var = compiled_class_boolean_slot_access_alist;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			    slot_name = slots.slot_name(slot);
			    protection = slots.slot_protection(slot);
			    if (NIL != com.cyc.cycjava.cycl.classes.classes_protection_greater_than_or_equal(access_level, protection)) {
				v_slots = cons(slot_name, v_slots);
			    }
			}
		    }
		    return nreverse(v_slots);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_all_class_slots_hide(SubLObject class_name_or_class, SubLObject access_level) {
	if (access_level == UNPROVIDED) {
	    access_level = $PRIVATE;
	}
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
	if (NIL != subloop_structures.class_p(v_class)) {
	    final SubLObject v_class_$7 = v_class;
	    final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_$7);
	    final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_$7);
	    SubLObject v_slots = NIL;
	    SubLObject slot_name = NIL;
	    SubLObject protection = NIL;
	    SubLObject cdolist_list_var = compiled_class_slot_access_alist;
	    SubLObject slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		slot_name = slots.slot_name(slot);
		protection = slots.slot_protection(slot);
		if (NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
		    v_slots = cons(slot_name, v_slots);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    slot_name = NIL;
	    protection = NIL;
	    cdolist_list_var = compiled_class_boolean_slot_access_alist;
	    slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		slot_name = slots.slot_name(slot);
		protection = slots.slot_protection(slot);
		if (NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
		    v_slots = cons(slot_name, v_slots);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    return nreverse(v_slots);
	}
	return NIL;
    }

    public static final SubLObject classes_all_instance_slots(SubLObject class_name_or_class, SubLObject access_level) {
	if (access_level == UNPROVIDED) {
	    access_level = $PRIVATE;
	}
	{
	    SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : class_name_or_class;
	    if (NIL != subloop_structures.class_p(v_class)) {
		{
		    SubLObject v_class_8 = v_class;
		    SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_8);
		    SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_8);
		    SubLObject v_slots = NIL;
		    {
			SubLObject slot_name = NIL;
			SubLObject protection = NIL;
			SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			    slot_name = slots.slot_name(slot);
			    protection = slots.slot_protection(slot);
			    if (NIL != com.cyc.cycjava.cycl.classes.classes_protection_greater_than_or_equal(access_level, protection)) {
				v_slots = cons(slot_name, v_slots);
			    }
			}
		    }
		    {
			SubLObject slot_name = NIL;
			SubLObject protection = NIL;
			SubLObject cdolist_list_var = compiled_instance_boolean_slot_access_alist;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			    slot_name = slots.slot_name(slot);
			    protection = slots.slot_protection(slot);
			    if (NIL != com.cyc.cycjava.cycl.classes.classes_protection_greater_than_or_equal(access_level, protection)) {
				v_slots = cons(slot_name, v_slots);
			    }
			}
		    }
		    return nreverse(v_slots);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_all_instance_slots_hide(SubLObject class_name_or_class, SubLObject access_level) {
	if (access_level == UNPROVIDED) {
	    access_level = $PRIVATE;
	}
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
	if (NIL != subloop_structures.class_p(v_class)) {
	    final SubLObject v_class_$8 = v_class;
	    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$8);
	    final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_$8);
	    SubLObject v_slots = NIL;
	    SubLObject slot_name = NIL;
	    SubLObject protection = NIL;
	    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
	    SubLObject slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		slot_name = slots.slot_name(slot);
		protection = slots.slot_protection(slot);
		if (NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
		    v_slots = cons(slot_name, v_slots);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    slot_name = NIL;
	    protection = NIL;
	    cdolist_list_var = compiled_instance_boolean_slot_access_alist;
	    slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		slot_name = slots.slot_name(slot);
		protection = slots.slot_protection(slot);
		if (NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
		    v_slots = cons(slot_name, v_slots);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    return nreverse(v_slots);
	}
	return NIL;
    }

    public static final SubLObject classes_all_any_instance_slots(SubLObject class_name_or_class, SubLObject access_level) {
	if (access_level == UNPROVIDED) {
	    access_level = $PRIVATE;
	}
	{
	    SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : class_name_or_class;
	    if (NIL != subloop_structures.class_p(v_class)) {
		{
		    SubLObject v_class_9 = v_class;
		    SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_9);
		    SubLObject v_slots = NIL;
		    SubLObject slot_name = NIL;
		    SubLObject protection = NIL;
		    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
		    SubLObject slot = NIL;
		    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
			slot_name = slots.slot_name(slot);
			protection = slots.slot_protection(slot);
			if (NIL != com.cyc.cycjava.cycl.classes.classes_protection_greater_than_or_equal(access_level, protection)) {
			    v_slots = cons(slot_name, v_slots);
			}
		    }
		    return nreverse(v_slots);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_all_any_instance_slots_hide(SubLObject class_name_or_class, SubLObject access_level) {
	if (access_level == UNPROVIDED) {
	    access_level = $PRIVATE;
	}
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
	if (NIL != subloop_structures.class_p(v_class)) {
	    final SubLObject v_class_$9 = v_class;
	    final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$9);
	    SubLObject v_slots = NIL;
	    SubLObject slot_name = NIL;
	    SubLObject protection = NIL;
	    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
	    SubLObject slot = NIL;
	    slot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		slot_name = slots.slot_name(slot);
		protection = slots.slot_protection(slot);
		if (NIL != classes_protection_greater_than_or_equal(access_level, protection)) {
		    v_slots = cons(slot_name, v_slots);
		}
		cdolist_list_var = cdolist_list_var.rest();
		slot = cdolist_list_var.first();
	    }
	    return nreverse(v_slots);
	}
	return NIL;
    }

    public static final SubLObject classes_all_slots(SubLObject class_name_or_class, SubLObject access_level) {
	if (access_level == UNPROVIDED) {
	    access_level = $PRIVATE;
	}
	{
	    SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : class_name_or_class;
	    if (NIL != subloop_structures.class_p(v_class)) {
		return nconc(com.cyc.cycjava.cycl.classes.classes_all_class_slots(v_class, access_level), com.cyc.cycjava.cycl.classes.classes_all_instance_slots(v_class, access_level));
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_all_slots_hide(SubLObject class_name_or_class, SubLObject access_level) {
	if (access_level == UNPROVIDED) {
	    access_level = $PRIVATE;
	}
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : class_name_or_class;
	if (NIL != subloop_structures.class_p(v_class)) {
	    return nconc(classes_all_class_slots(v_class, access_level), classes_all_instance_slots(v_class, access_level));
	}
	return NIL;
    }

    public static final SubLObject class_get_property_internal(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject v_class = NIL;
	    SubLObject indicator = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt145);
	    v_class = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt145);
	    indicator = current.first();
	    current = current.rest();
	    if (NIL == current) {
		return list(CLASSES_GETF, list(CLASS_PLIST, v_class), indicator);
	    } else {
		cdestructuring_bind_error(datum, $list_alt145);
	    }
	}
	return NIL;
    }

    public static SubLObject class_get_property_internal_hide(SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject v_class = NIL;
	SubLObject indicator = NIL;
	destructuring_bind_must_consp(current, datum, $list145);
	v_class = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list145);
	indicator = current.first();
	current = current.rest();
	if (NIL == current) {
	    return list(CLASSES_GETF, list(CLASS_PLIST, v_class), indicator);
	}
	cdestructuring_bind_error(datum, $list145);
	return NIL;
    }

    public static final SubLObject class_get_property(SubLObject v_class, SubLObject indicator) {
	if (NIL != subloop_structures.class_p(v_class)) {
	    return com.cyc.cycjava.cycl.classes.classes_getf(subloop_structures.class_plist(v_class), indicator);
	}
	return NIL;
    }

    public static SubLObject class_get_property_hide(SubLObject v_class, final SubLObject indicator) {
	if (NIL != subloop_structures.class_p(v_class)) {
	    return classes_getf(subloop_structures.class_plist(v_class), indicator);
	}
	return NIL;
    }

    public static final SubLObject class_set_property_internal(SubLObject v_class, SubLObject indicator, SubLObject value) {
	{
	    SubLObject class_var = make_symbol($$$class);
	    return list(CLET, list(list(class_var, v_class)), list(CSETF, list(CLASS_PLIST, class_var), list(CLASSES_PUTF, list(CLASS_PLIST, class_var), indicator, value)));
	}
    }

    public static SubLObject class_set_property_internal_hide(SubLObject v_class, final SubLObject indicator, final SubLObject value) {
	final SubLObject class_var = make_symbol($$$class);
	return list(CLET, list(list(class_var, v_class)), list(CSETF, list(CLASS_PLIST, class_var), list(CLASSES_PUTF, list(CLASS_PLIST, class_var), indicator, value)));
    }

    public static final SubLObject class_set_property(SubLObject v_class, SubLObject indicator, SubLObject value) {
	if (NIL != subloop_structures.class_p(v_class)) {
	    com.cyc.cycjava.cycl.classes.class_set_property_internal(v_class, indicator, value);
	    return value;
	}
	return NIL;
    }

    public static SubLObject class_set_property_hide(SubLObject v_class, final SubLObject indicator, final SubLObject value) {
	if (NIL != subloop_structures.class_p(v_class)) {
	    class_set_property_internal(v_class, indicator, value);
	    return value;
	}
	return NIL;
    }

    public static final SubLObject class_implements_slot_listeners_p(SubLObject class_name_or_class) {
	if (NIL != subloop_structures.class_p(class_name_or_class)) {
	    return com.cyc.cycjava.cycl.classes.class_get_property(class_name_or_class, $IMPLEMENTS_SLOT_LISTENERS);
	} else {
	    {
		SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : NIL;
		if (NIL != v_class) {
		    return com.cyc.cycjava.cycl.classes.class_get_property(v_class, $IMPLEMENTS_SLOT_LISTENERS);
		} else {
		    return NIL;
		}
	    }
	}
    }

    public static SubLObject class_implements_slot_listeners_p_hide(SubLObject class_name_or_class) {
	if (NIL != subloop_structures.class_p(class_name_or_class)) {
	    return class_get_property(class_name_or_class, $IMPLEMENTS_SLOT_LISTENERS);
	}
	final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : NIL;
	if (NIL != v_class) {
	    return class_get_property(v_class, $IMPLEMENTS_SLOT_LISTENERS);
	}
	return NIL;
    }

    public static final SubLObject class_set_implements_slot_listeners(SubLObject class_name_or_class, SubLObject boolean_value) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject result = NIL;
		{
		    SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding(thread);
		    try {
			$classes_new_class_current$.bind(NIL != subloop_structures.class_p(class_name_or_class) ? ((SubLObject) (subloop_structures.class_name(class_name_or_class))) : class_name_or_class, thread);
			if (NIL != subloop_structures.class_p(class_name_or_class)) {
			    result = com.cyc.cycjava.cycl.classes.class_set_property(class_name_or_class, $IMPLEMENTS_SLOT_LISTENERS, boolean_value);
			} else {
			    {
				SubLObject v_class = (class_name_or_class.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_name_or_class))) : NIL;
				if (NIL != v_class) {
				    result = com.cyc.cycjava.cycl.classes.class_set_property(v_class, $IMPLEMENTS_SLOT_LISTENERS, boolean_value);
				} else {
				    result = NIL;
				}
			    }
			}
		    } finally {
			$classes_new_class_current$.rebind(_prev_bind_0, thread);
		    }
		}
		return result;
	    }
	}
    }

    public static SubLObject class_set_implements_slot_listeners_hide(SubLObject class_name_or_class, final SubLObject boolean_value) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = NIL;
	final SubLObject _prev_bind_0 = $classes_new_class_current$.currentBinding(thread);
	try {
	    $classes_new_class_current$.bind(NIL != subloop_structures.class_p(class_name_or_class) ? subloop_structures.class_name(class_name_or_class) : class_name_or_class, thread);
	    if (NIL != subloop_structures.class_p(class_name_or_class)) {
		result = class_set_property(class_name_or_class, $IMPLEMENTS_SLOT_LISTENERS, boolean_value);
	    } else {
		final SubLObject v_class = (class_name_or_class.isSymbol()) ? classes_retrieve_class(class_name_or_class) : NIL;
		if (NIL != v_class) {
		    result = class_set_property(v_class, $IMPLEMENTS_SLOT_LISTENERS, boolean_value);
		} else {
		    result = NIL;
		}
	    }
	} finally {
	    $classes_new_class_current$.rebind(_prev_bind_0, thread);
	}
	return result;
    }

    public static final SubLObject classes_implements_p(SubLObject target_class, SubLObject parent_interface) {
	{
	    SubLObject true_class = (NIL != subloop_structures.class_p(target_class)) ? ((SubLObject) (target_class)) : (NIL != target_class) && target_class.isSymbol() ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(target_class))) : NIL;
	    SubLObject true_interface = (NIL != subloop_structures.interface_p(parent_interface)) ? ((SubLObject) (parent_interface)) : (NIL != parent_interface) && parent_interface.isSymbol() ? ((SubLObject) (interfaces.interfaces_retrieve_interface(parent_interface))) : NIL;
	    if ((NIL != true_class) && (NIL != true_interface)) {
		{
		    SubLObject v_class = true_class;
		    SubLObject v_interfaces = subloop_structures.class_interfaces(v_class);
		    SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(v_class);
		    if (NIL != member(true_interface, v_interfaces, UNPROVIDED, UNPROVIDED)) {
			return T;
		    }
		    {
			SubLObject cdolist_list_var = v_interfaces;
			SubLObject v_interface = NIL;
			for (v_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_interface = cdolist_list_var.first()) {
			    if (NIL != interfaces.interfaces_implements_p(v_interface, true_interface)) {
				return T;
			    }
			}
		    }
		    {
			SubLObject cdolist_list_var = compiled_inheritance_path.rest();
			SubLObject parent_class = NIL;
			for (parent_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), parent_class = cdolist_list_var.first()) {
			    if (NIL != com.cyc.cycjava.cycl.classes.classes_implements_p(parent_class, true_interface)) {
				return T;
			    }
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject classes_implements_p_hide(SubLObject target_class, final SubLObject parent_interface) {
	final SubLObject true_class = (NIL != subloop_structures.class_p(target_class)) ? target_class : (NIL != target_class) && target_class.isSymbol() ? classes_retrieve_class(target_class) : NIL;
	final SubLObject true_interface = (NIL != subloop_structures.interface_p(parent_interface)) ? parent_interface : (NIL != parent_interface) && parent_interface.isSymbol() ? interfaces.interfaces_retrieve_interface(parent_interface) : NIL;
	if ((NIL != true_class) && (NIL != true_interface)) {
	    final SubLObject v_class = true_class;
	    final SubLObject v_interfaces = subloop_structures.class_interfaces(v_class);
	    final SubLObject compiled_inheritance_path = subloop_structures.class_compiled_inheritance_path(v_class);
	    if (NIL != member(true_interface, v_interfaces, UNPROVIDED, UNPROVIDED)) {
		return T;
	    }
	    SubLObject cdolist_list_var = v_interfaces;
	    SubLObject v_interface = NIL;
	    v_interface = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != interfaces.interfaces_implements_p(v_interface, true_interface)) {
		    return T;
		}
		cdolist_list_var = cdolist_list_var.rest();
		v_interface = cdolist_list_var.first();
	    }
	    cdolist_list_var = compiled_inheritance_path.rest();
	    SubLObject parent_class = NIL;
	    parent_class = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != classes_implements_p(parent_class, true_interface)) {
		    return T;
		}
		cdolist_list_var = cdolist_list_var.rest();
		parent_class = cdolist_list_var.first();
	    }
	}
	return NIL;
    }

    public static final SubLObject classes_get_slot(SubLObject v_class, SubLObject slot_name) {
	if (NIL != subloop_structures.class_p(v_class)) {
	    {
		SubLObject association = NIL;
		association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
		if (NIL != association) {
		    return association;
		}
		association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
		if (NIL != association) {
		    return association;
		}
		association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
		if (NIL != association) {
		    return association;
		}
		association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
		if (NIL != association) {
		    return association;
		}
	    }
	}
	return NIL;
    }

    public static SubLObject classes_get_slot_hide(SubLObject v_class, final SubLObject slot_name) {
	if (NIL != subloop_structures.class_p(v_class)) {
	    SubLObject association = NIL;
	    association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
	    if (NIL != association) {
		return association;
	    }
	    association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
	    if (NIL != association) {
		return association;
	    }
	    association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_slot_access_alist(v_class));
	    if (NIL != association) {
		return association;
	    }
	    association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class));
	    if (NIL != association) {
		return association;
	    }
	}
	return NIL;
    }

    public static final SubLObject do_classes_in_order(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt150);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject var = NIL;
		    SubLObject base_class = NIL;
		    SubLObject listed_optional_depth_var = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt150);
		    var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt150);
		    base_class = current.first();
		    current = current.rest();
		    listed_optional_depth_var = current;
		    current = temp;
		    {
			SubLObject forms = current;
			classes_utilities.classes_check_do_classes_in_order_parameters(var, base_class, listed_optional_depth_var, forms);
			{
			    SubLObject stack_var = make_symbol($$$stack);
			    SubLObject stack_element_var = make_symbol($str_alt152$stack_element);
			    SubLObject actual_class_var = make_symbol($str_alt153$actual_class);
			    SubLObject current_depth_var = (NIL != listed_optional_depth_var) ? ((SubLObject) (listed_optional_depth_var.first())) : make_symbol($str_alt154$current_depth);
			    return list(CLET, list(list(stack_var, list(LIST, listS(CONS, list(CLASSES_RETRIEVE_CLASS, base_class), $list_alt157))), current_depth_var, stack_element_var, actual_class_var, var),
				    list(WHILE, stack_var, list(CSETQ, stack_element_var, list(CAR, stack_var)), list(CPOP, stack_var), list(CSETQ, current_depth_var, list(CDR, stack_element_var)), list(CSETQ, actual_class_var, list(CAR, stack_element_var)),
					    list(PWHEN, actual_class_var, list(CSETQ, var, list(CLASS_NAME, actual_class_var)), bq_cons(PROGN, forms), list(CLET, bq_cons(list(NEXT_DEPTH, listS($sym163$_, current_depth_var, $list_alt164)), $list_alt165),
						    list(CDOLIST, list(CHILD_CLASS, list(CLASS_SUBCLASSES, actual_class_var)), $list_alt169, list(PWHEN, ACTUAL_CHILD, list(CPUSH, $list_alt172, stack_var)))))));
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_classes_in_order_hide(SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list150);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject var = NIL;
	SubLObject base_class = NIL;
	SubLObject listed_optional_depth_var = NIL;
	destructuring_bind_must_consp(current, datum, $list150);
	var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list150);
	base_class = current.first();
	current = listed_optional_depth_var = current.rest();
	final SubLObject forms;
	current = forms = temp;
	classes_utilities.classes_check_do_classes_in_order_parameters(var, base_class, listed_optional_depth_var, forms);
	final SubLObject stack_var = make_symbol($$$stack);
	final SubLObject stack_element_var = make_symbol($str152$stack_element);
	final SubLObject actual_class_var = make_symbol($str153$actual_class);
	final SubLObject current_depth_var = (NIL != listed_optional_depth_var) ? listed_optional_depth_var.first() : make_symbol($str154$current_depth);
	return list(CLET, list(list(stack_var, list(LIST, listS(CONS, list(CLASSES_RETRIEVE_CLASS, base_class), $list157))), current_depth_var, stack_element_var, actual_class_var, var),
		list(WHILE, stack_var, list(CSETQ, stack_element_var, list(CAR, stack_var)), list(CPOP, stack_var), list(CSETQ, current_depth_var, list(CDR, stack_element_var)), list(CSETQ, actual_class_var, list(CAR, stack_element_var)),
			list(PWHEN, actual_class_var, list(CSETQ, var, list(CLASS_NAME, actual_class_var)), bq_cons(PROGN, forms),
				list(CLET, bq_cons(list(NEXT_DEPTH, listS($sym163$_, current_depth_var, $list164)), $list165), list(CDOLIST, list(CHILD_CLASS, list(CLASS_SUBCLASSES, actual_class_var)), $list169, list(PWHEN, ACTUAL_CHILD, list(CPUSH, $list172, stack_var)))))));
    }

    public static final SubLObject classes_tab_to_depth(SubLObject stream, SubLObject depth) {
	format(stream, $str_alt173$__);
	{
	    SubLObject i = NIL;
	    for (i = ZERO_INTEGER; i.numL(depth); i = add(i, ONE_INTEGER)) {
		format(stream, $str_alt174$__);
	    }
	}
	return depth;
    }

    public static SubLObject classes_tab_to_depth_hide(SubLObject stream, final SubLObject depth) {
	format(stream, $str173$__);
	SubLObject i;
	for (i = NIL, i = ZERO_INTEGER; i.numL(depth); i = add(i, ONE_INTEGER)) {
	    format(stream, $str174$__);
	}
	return depth;
    }

    public static final SubLObject classes_display_class_name_at_depth(SubLObject stream, SubLObject class_name, SubLObject depth) {
	com.cyc.cycjava.cycl.classes.classes_tab_to_depth(stream, depth);
	format(stream, $str_alt175$_S_, class_name);
	return class_name;
    }

    public static SubLObject classes_display_class_name_at_depth_hide(SubLObject stream, final SubLObject class_name, final SubLObject depth) {
	classes_tab_to_depth(stream, depth);
	format(stream, $str175$_S_, class_name);
	return class_name;
    }

    public static final SubLObject classes_display_hierarchy(SubLObject base_class_symbolic_name, SubLObject stream) {
	if (stream == UNPROVIDED) {
	    stream = T;
	}
	{
	    SubLObject stack = list(cons(com.cyc.cycjava.cycl.classes.classes_retrieve_class(base_class_symbolic_name), ZERO_INTEGER));
	    SubLObject depth = NIL;
	    SubLObject stack_element = NIL;
	    SubLObject actual_class = NIL;
	    SubLObject class_symbolic_name = NIL;
	    while (NIL != stack) {
		stack_element = stack.first();
		stack = stack.rest();
		depth = stack_element.rest();
		actual_class = stack_element.first();
		if (NIL != actual_class) {
		    class_symbolic_name = subloop_structures.class_name(actual_class);
		    com.cyc.cycjava.cycl.classes.classes_display_class_name_at_depth(stream, class_symbolic_name, depth);
		    {
			SubLObject next_depth = add(depth, ONE_INTEGER);
			SubLObject actual_child = NIL;
			SubLObject cdolist_list_var = subloop_structures.class_subclasses(actual_class);
			SubLObject child_class = NIL;
			for (child_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), child_class = cdolist_list_var.first()) {
			    actual_child = com.cyc.cycjava.cycl.classes.classes_retrieve_class(child_class);
			    if (NIL != actual_child) {
				stack = cons(cons(actual_child, next_depth), stack);
			    }
			}
		    }
		}
	    }
	}
	return base_class_symbolic_name;
    }

    public static SubLObject classes_display_hierarchy_hide(SubLObject base_class_symbolic_name, SubLObject stream) {
	if (stream == UNPROVIDED) {
	    stream = T;
	}
	SubLObject stack = list(cons(classes_retrieve_class(base_class_symbolic_name), ZERO_INTEGER));
	SubLObject depth = NIL;
	SubLObject stack_element = NIL;
	SubLObject actual_class = NIL;
	SubLObject class_symbolic_name = NIL;
	while (NIL != stack) {
	    stack_element = stack.first();
	    stack = stack.rest();
	    depth = stack_element.rest();
	    actual_class = stack_element.first();
	    if (NIL != actual_class) {
		class_symbolic_name = subloop_structures.class_name(actual_class);
		classes_display_class_name_at_depth(stream, class_symbolic_name, depth);
		final SubLObject next_depth = add(depth, ONE_INTEGER);
		SubLObject actual_child = NIL;
		SubLObject cdolist_list_var = subloop_structures.class_subclasses(actual_class);
		SubLObject child_class = NIL;
		child_class = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    actual_child = classes_retrieve_class(child_class);
		    if (NIL != actual_child) {
			stack = cons(cons(actual_child, next_depth), stack);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    child_class = cdolist_list_var.first();
		}
	    }
	}
	return base_class_symbolic_name;
    }

    public static final SubLObject subloop_type_p(SubLObject class_or_class_name) {
	if (NIL == class_or_class_name) {
	    return NIL;
	}
	if (class_or_class_name.isSymbol()) {
	    {
		SubLObject v_class = com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_or_class_name);
		if (NIL != v_class) {
		    return T;
		} else {
		    {
			SubLObject v_interface = interfaces.interfaces_retrieve_interface(class_or_class_name);
			return NIL != v_interface ? ((SubLObject) (T)) : NIL;
		    }
		}
	    }
	}
	if (NIL != subloop_structures.class_p(class_or_class_name)) {
	    return T;
	}
	return NIL;
    }

    public static SubLObject subloop_type_p_hide(SubLObject class_or_class_name) {
	if (NIL == class_or_class_name) {
	    return NIL;
	}
	if (class_or_class_name.isSymbol()) {
	    final SubLObject v_class = classes_retrieve_class(class_or_class_name);
	    if (NIL != v_class) {
		return T;
	    }
	    final SubLObject v_interface = interfaces.interfaces_retrieve_interface(class_or_class_name);
	    return NIL != v_interface ? T : NIL;
	} else {
	    if (NIL != subloop_structures.class_p(class_or_class_name)) {
		return T;
	    }
	    return NIL;
	}
    }

    public static final SubLObject classes_find_all_subclasses(SubLObject class_or_class_name, SubLObject recursively) {
	if (recursively == UNPROVIDED) {
	    recursively = T;
	}
	{
	    SubLObject actual_class = (class_or_class_name.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.classes.classes_retrieve_class(class_or_class_name))) : NIL != subloop_structures.class_p(class_or_class_name) ? ((SubLObject) (class_or_class_name)) : NIL;
	    if (NIL == actual_class) {
		return NIL;
	    }
	    {
		SubLObject direct_subclasses = copy_list(subloop_structures.class_subclasses(actual_class));
		if (NIL != recursively) {
		    {
			SubLObject all_subclasses = copy_list(direct_subclasses);
			SubLObject cdolist_list_var = direct_subclasses;
			SubLObject subclass = NIL;
			for (subclass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), subclass = cdolist_list_var.first()) {
			    all_subclasses = union(all_subclasses, com.cyc.cycjava.cycl.classes.classes_find_all_subclasses(subclass, T), UNPROVIDED, UNPROVIDED);
			}
			return cons(subloop_structures.class_name(actual_class), all_subclasses);
		    }
		}
		return cons(subloop_structures.class_name(actual_class), direct_subclasses);
	    }
	}
    }

    public static SubLObject classes_find_all_subclasses_hide(SubLObject class_or_class_name, SubLObject recursively) {
	if (recursively == UNPROVIDED) {
	    recursively = T;
	}
	final SubLObject actual_class = (class_or_class_name.isSymbol()) ? classes_retrieve_class(class_or_class_name) : NIL != subloop_structures.class_p(class_or_class_name) ? class_or_class_name : NIL;
	if (NIL == actual_class) {
	    return NIL;
	}
	final SubLObject direct_subclasses = copy_list(subloop_structures.class_subclasses(actual_class));
	if (NIL != recursively) {
	    SubLObject all_subclasses = copy_list(direct_subclasses);
	    SubLObject cdolist_list_var = direct_subclasses;
	    SubLObject subclass = NIL;
	    subclass = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		all_subclasses = union(all_subclasses, classes_find_all_subclasses(subclass, T), UNPROVIDED, UNPROVIDED);
		cdolist_list_var = cdolist_list_var.rest();
		subclass = cdolist_list_var.first();
	    }
	    return cons(subloop_structures.class_name(actual_class), all_subclasses);
	}
	return cons(subloop_structures.class_name(actual_class), direct_subclasses);
    }

    public static SubLObject declare_classes_file() {
	declareFunction("classes_reset_class_table", "CLASSES-RESET-CLASS-TABLE", 0, 0, false);
	declareFunction("classes_get_all_classes", "CLASSES-GET-ALL-CLASSES", 0, 0, false);
	declareFunction("classes_get_all_class_names", "CLASSES-GET-ALL-CLASS-NAMES", 0, 0, false);
	declareFunction("classes_protection_greater_than_or_equal", "CLASSES-PROTECTION-GREATER-THAN-OR-EQUAL", 2, 0, false);
	declareFunction("classes_set_always_generate_before_listeners", "CLASSES-SET-ALWAYS-GENERATE-BEFORE-LISTENERS", 1, 0, false);
	declareFunction("classes_before_listeners_by_default_p", "CLASSES-BEFORE-LISTENERS-BY-DEFAULT-P", 0, 0, false);
	declareFunction("classes_set_always_generate_after_listeners", "CLASSES-SET-ALWAYS-GENERATE-AFTER-LISTENERS", 1, 0, false);
	declareFunction("classes_after_listeners_by_default_p", "CLASSES-AFTER-LISTENERS-BY-DEFAULT-P", 0, 0, false);
	declareFunction("classes_getf", "CLASSES-GETF", 2, 0, false);
	declareFunction("classes_putf", "CLASSES-PUTF", 3, 0, false);
	declareFunction("classes_implement_slot_listeners_p", "CLASSES-IMPLEMENT-SLOT-LISTENERS-P", 1, 0, false);
	declareFunction("classes_valid_slot_property_p", "CLASSES-VALID-SLOT-PROPERTY-P", 1, 0, false);
	declareFunction("classes_list_of_valid_slot_properties_p", "CLASSES-LIST-OF-VALID-SLOT-PROPERTIES-P", 1, 0, false);
	declareFunction("classes_list_of_valid_method_properties_p", "CLASSES-LIST-OF-VALID-METHOD-PROPERTIES-P", 1, 0, false);
	declareFunction("classes_valid_slot_name_p", "CLASSES-VALID-SLOT-NAME-P", 1, 0, false);
	declareFunction("classes_valid_slot_decl_p", "CLASSES-VALID-SLOT-DECL-P", 1, 0, false);
	declareFunction("classes_valid_method_property_p", "CLASSES-VALID-METHOD-PROPERTY-P", 1, 0, false);
	declareFunction("classes_valid_method_properties_p", "CLASSES-VALID-METHOD-PROPERTIES-P", 1, 0, false);
	declareFunction("classes_auto_update_p", "CLASSES-AUTO-UPDATE-P", 1, 0, false);
	declareFunction("classes_no_member_variables_p", "CLASSES-NO-MEMBER-VARIABLES-P", 1, 0, false);
	declareFunction("classes_read_only_p", "CLASSES-READ-ONLY-P", 1, 0, false);
	declareFunction("classes_before_listeners_p", "CLASSES-BEFORE-LISTENERS-P", 1, 0, false);
	declareFunction("classes_after_listeners_p", "CLASSES-AFTER-LISTENERS-P", 1, 0, false);
	declareFunction("classes_valid_method_interface_type_p", "CLASSES-VALID-METHOD-INTERFACE-TYPE-P", 1, 0, false);
	declareFunction("classes_valid_method_name_p", "CLASSES-VALID-METHOD-NAME-P", 1, 0, false);
	declareFunction("classes_valid_parameter_name_p", "CLASSES-VALID-PARAMETER-NAME-P", 1, 0, false);
	declareFunction("classes_valid_optional_parameter_p", "CLASSES-VALID-OPTIONAL-PARAMETER-P", 1, 0, false);
	declareFunction("classes_valid_optional_parameter_list_p", "CLASSES-VALID-OPTIONAL-PARAMETER-LIST-P", 1, 0, false);
	declareFunction("classes_valid_lambda_list_p", "CLASSES-VALID-LAMBDA-LIST-P", 1, 0, false);
	declareFunction("classes_valid_method_interface_body_p", "CLASSES-VALID-METHOD-INTERFACE-BODY-P", 1, 0, false);
	declareFunction("classes_valid_method_interface_decl_p", "CLASSES-VALID-METHOD-INTERFACE-DECL-P", 1, 0, false);
	declareFunction("classes_method_decl_type", "CLASSES-METHOD-DECL-TYPE", 1, 0, false);
	declareFunction("classes_class_method_decl_p", "CLASSES-CLASS-METHOD-DECL-P", 1, 0, false);
	declareFunction("classes_instance_method_decl_p", "CLASSES-INSTANCE-METHOD-DECL-P", 1, 0, false);
	declareFunction("classes_method_name_given_method_decl", "CLASSES-METHOD-NAME-GIVEN-METHOD-DECL", 1, 0, false);
	declareFunction("classes_lambda_list_given_method_decl", "CLASSES-LAMBDA-LIST-GIVEN-METHOD-DECL", 1, 0, false);
	declareFunction("classes_properties_given_method_decl", "CLASSES-PROPERTIES-GIVEN-METHOD-DECL", 1, 0, false);
	declareFunction("classes_valid_slot_or_method_decl_p", "CLASSES-VALID-SLOT-OR-METHOD-DECL-P", 1, 0, false);
	declareFunction("classes_valid_slot_or_method_decls_p", "CLASSES-VALID-SLOT-OR-METHOD-DECLS-P", 1, 0, false);
	declareFunction("classes_must_be_valid_slot_or_method_decls", "CLASSES-MUST-BE-VALID-SLOT-OR-METHOD-DECLS", 1, 0, false);
	declareFunction("classes_separate_decls_into_slot_decls_and_method_decls", "CLASSES-SEPARATE-DECLS-INTO-SLOT-DECLS-AND-METHOD-DECLS", 1, 0, false);
	declareFunction("class_separate_decls_into_class_and_instance_method_decls", "CLASS-SEPARATE-DECLS-INTO-CLASS-AND-INSTANCE-METHOD-DECLS", 1, 0, false);
	declareFunction("ldb_test", "LDB-TEST", 2, 0, false);
	declareFunction("display_class", "DISPLAY-CLASS", 1, 0, false);
	declareMacro("with_class_definition_lock", "WITH-CLASS-DEFINITION-LOCK");
	declareMacro("with_class_access_lock", "WITH-CLASS-ACCESS-LOCK");
	declareFunction("classes_retrieve_class", "CLASSES-RETRIEVE-CLASS", 1, 0, false);
	declareFunction("classes_intern_class", "CLASSES-INTERN-CLASS", 2, 0, false);
	declareFunction("classes_delete_class", "CLASSES-DELETE-CLASS", 1, 0, false);
	declareFunction("classes_set_class", "CLASSES-SET-CLASS", 2, 0, false);
	declareFunction("classes_get_class", "CLASSES-GET-CLASS", 1, 0, false);
	declareFunction("classes_valid_class_property_p", "CLASSES-VALID-CLASS-PROPERTY-P", 1, 0, false);
	declareFunction("classes_valid_instance_var_decl_p", "CLASSES-VALID-INSTANCE-VAR-DECL-P", 1, 0, false);
	declareFunction("classes_valid_instance_var_decls_p", "CLASSES-VALID-INSTANCE-VAR-DECLS-P", 1, 0, false);
	declareFunction("classes_valid_class_name_p", "CLASSES-VALID-CLASS-NAME-P", 1, 0, false);
	declareFunction("classes_must_be_valid_class_name", "CLASSES-MUST-BE-VALID-CLASS-NAME", 1, 0, false);
	declareFunction("classes_unique_elements", "CLASSES-UNIQUE-ELEMENTS", 1, 0, false);
	declareFunction("new_class", "NEW-CLASS", 4, 0, false);
	declareFunction("classes_make_slot_accessor_association", "CLASSES-MAKE-SLOT-ACCESSOR-ASSOCIATION", 3, 0, false);
	declareMacro("classes_slot_accessor_association_slot_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-SLOT-NAME");
	declareMacro("classes_slot_accessor_association_getter_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-GETTER-NAME");
	declareMacro("classes_slot_accessor_association_setter_name", "CLASSES-SLOT-ACCESSOR-ASSOCIATION-SETTER-NAME");
	declareFunction("classes_retrieve_slot_getter", "CLASSES-RETRIEVE-SLOT-GETTER", 2, 0, false);
	declareFunction("classes_retrieve_slot_setter", "CLASSES-RETRIEVE-SLOT-SETTER", 2, 0, false);
	declareFunction("classes_generate_slot_accessor_names", "CLASSES-GENERATE-SLOT-ACCESSOR-NAMES", 1, 0, false);
	declareFunction("classes_valid_class_properties_p", "CLASSES-VALID-CLASS-PROPERTIES-P", 1, 0, false);
	declareFunction("class_properties_must_be_valid", "CLASS-PROPERTIES-MUST-BE-VALID", 1, 0, false);
	declareFunction("expand_interface_method_instantiations", "EXPAND-INTERFACE-METHOD-INSTANTIATIONS", 1, 0, false);
	declareFunction("expand_accessors_for_class", "EXPAND-ACCESSORS-FOR-CLASS", 1, 1, false);
	declareFunction("expand_instance_any_slot_accessors", "EXPAND-INSTANCE-ANY-SLOT-ACCESSORS", 2, 1, false);
	declareFunction("expand_instance_boolean_slot_accessors", "EXPAND-INSTANCE-BOOLEAN-SLOT-ACCESSORS", 2, 0, false);
	declareFunction("expand_class_any_slot_accessors", "EXPAND-CLASS-ANY-SLOT-ACCESSORS", 2, 0, false);
	declareFunction("expand_class_boolean_slot_accessors", "EXPAND-CLASS-BOOLEAN-SLOT-ACCESSORS", 2, 0, false);
	declareFunction("expand_class_predicator", "EXPAND-CLASS-PREDICATOR", 1, 0, false);
	declareFunction("expand_class_initializer", "EXPAND-CLASS-INITIALIZER", 1, 0, false);
	declareFunction("expand_instance_initializer", "EXPAND-INSTANCE-INITIALIZER", 1, 0, false);
	declareFunction("expand_define_class", "EXPAND-DEFINE-CLASS", 3, 0, false);
	declareMacro("define_class", "DEFINE-CLASS");
	declareFunction("subloop_new_class", "SUBLOOP-NEW-CLASS", 5, 0, false);
	declareFunction("subloop_initialize_slot", "SUBLOOP-INITIALIZE-SLOT", 4, 0, false);
	declareFunction("subloop_note_class_initialization_function", "SUBLOOP-NOTE-CLASS-INITIALIZATION-FUNCTION", 2, 0, false);
	declareFunction("subloop_note_instance_initialization_function", "SUBLOOP-NOTE-INSTANCE-INITIALIZATION-FUNCTION", 2, 0, false);
	declareFunction("subloop_instanceof_class", "SUBLOOP-INSTANCEOF-CLASS", 2, 0, false);
	declareFunction("subloop_get_instance_slot", "SUBLOOP-GET-INSTANCE-SLOT", 2, 0, false);
	declareFunction("subloop_get_access_protected_instance_slot", "SUBLOOP-GET-ACCESS-PROTECTED-INSTANCE-SLOT", 3, 0, false);
	declareFunction("subloop_set_instance_slot", "SUBLOOP-SET-INSTANCE-SLOT", 3, 0, false);
	declareFunction("subloop_set_access_protected_instance_slot", "SUBLOOP-SET-ACCESS-PROTECTED-INSTANCE-SLOT", 4, 0, false);
	declareFunction("classes_compile_inheritance_path", "CLASSES-COMPILE-INHERITANCE-PATH", 1, 1, false);
	declareFunction("classes_instance_slot_index", "CLASSES-INSTANCE-SLOT-INDEX", 2, 0, false);
	declareFunction("classes_boolean_slot_decl_p", "CLASSES-BOOLEAN-SLOT-DECL-P", 1, 0, false);
	declareFunction("classes_class_slot_decl_p", "CLASSES-CLASS-SLOT-DECL-P", 1, 0, false);
	declareFunction("classes_instance_slot_decl_p", "CLASSES-INSTANCE-SLOT-DECL-P", 1, 0, false);
	declareFunction("classes_protection_level_of_slot_decl", "CLASSES-PROTECTION-LEVEL-OF-SLOT-DECL", 1, 0, false);
	declareFunction("classes_essential_slot_p", "CLASSES-ESSENTIAL-SLOT-P", 1, 0, false);
	declareFunction("classes_value_of_slot_decl", "CLASSES-VALUE-OF-SLOT-DECL", 1, 0, false);
	declareFunction("classes_slot_name_given_slot_decl", "CLASSES-SLOT-NAME-GIVEN-SLOT-DECL", 1, 0, false);
	declareFunction("classes_compile_instance_slot_access_list", "CLASSES-COMPILE-INSTANCE-SLOT-ACCESS-LIST", 1, 1, false);
	declareFunction("classes_compile_instance_boolean_slot_access_list", "CLASSES-COMPILE-INSTANCE-BOOLEAN-SLOT-ACCESS-LIST", 1, 1, false);
	declareFunction("classes_compile_class_slot_access_list", "CLASSES-COMPILE-CLASS-SLOT-ACCESS-LIST", 1, 1, false);
	declareFunction("classes_compile_class_boolean_slot_access_list", "CLASSES-COMPILE-CLASS-BOOLEAN-SLOT-ACCESS-LIST", 1, 1, false);
	declareFunction("classes_initialize_class_slots", "CLASSES-INITIALIZE-CLASS-SLOTS", 1, 0, false);
	declareFunction("superclassp", "SUPERCLASSP", 2, 0, false);
	declareFunction("subclassp", "SUBCLASSP", 2, 0, false);
	declareFunction("classes_access_check_class_slot", "CLASSES-ACCESS-CHECK-CLASS-SLOT", 2, 0, false);
	declareFunction("get_class_slot", "GET-CLASS-SLOT", 2, 0, false);
	declareFunction("set_class_slot", "SET-CLASS-SLOT", 3, 0, false);
	declareFunction("classes_shadowed_association", "CLASSES-SHADOWED-ASSOCIATION", 2, 0, false);
	declareFunction("classes_all_class_slots", "CLASSES-ALL-CLASS-SLOTS", 1, 1, false);
	declareFunction("classes_all_instance_slots", "CLASSES-ALL-INSTANCE-SLOTS", 1, 1, false);
	declareFunction("classes_all_any_instance_slots", "CLASSES-ALL-ANY-INSTANCE-SLOTS", 1, 1, false);
	declareFunction("classes_all_slots", "CLASSES-ALL-SLOTS", 1, 1, false);
	declareMacro("class_get_property_internal", "CLASS-GET-PROPERTY-INTERNAL");
	declareFunction("class_get_property", "CLASS-GET-PROPERTY", 2, 0, false);
	declareFunction("class_set_property_internal", "CLASS-SET-PROPERTY-INTERNAL", 3, 0, false);
	declareFunction("class_set_property", "CLASS-SET-PROPERTY", 3, 0, false);
	declareFunction("class_implements_slot_listeners_p", "CLASS-IMPLEMENTS-SLOT-LISTENERS-P", 1, 0, false);
	declareFunction("class_set_implements_slot_listeners", "CLASS-SET-IMPLEMENTS-SLOT-LISTENERS", 2, 0, false);
	declareFunction("classes_implements_p", "CLASSES-IMPLEMENTS-P", 2, 0, false);
	declareFunction("classes_get_slot", "CLASSES-GET-SLOT", 2, 0, false);
	declareMacro("do_classes_in_order", "DO-CLASSES-IN-ORDER");
	declareFunction("classes_tab_to_depth", "CLASSES-TAB-TO-DEPTH", 2, 0, false);
	declareFunction("classes_display_class_name_at_depth", "CLASSES-DISPLAY-CLASS-NAME-AT-DEPTH", 3, 0, false);
	declareFunction("classes_display_hierarchy", "CLASSES-DISPLAY-HIERARCHY", 1, 1, false);
	declareFunction("subloop_type_p", "SUBLOOP-TYPE-P", 1, 0, false);
	declareFunction("classes_find_all_subclasses", "CLASSES-FIND-ALL-SUBCLASSES", 1, 1, false);
	return NIL;
    }

    public static final SubLObject init_classes_file_alt() {
	defconstant("*CLASSES-CLASS-SLOT-ACCESS-VIOLATION*", $str_alt0$Cannot_access__A_slot__S_from_cla);
	defconstant("*CLASSES-INITIAL-HASHTABLE-SIZE*", $int$800);
	defparameter("*CLASSES-CLASS-TABLE-UPDATE-LOCK*", make_lock($$$Class_Table_Update_Lock));
	deflexical("*CLASSES-CLASS-TABLE*", NIL != boundp($classes_class_table$) ? ((SubLObject) ($classes_class_table$.getGlobalValue())) : make_hash_table($classes_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
	defparameter("*CLASSES-VALID-CLASS-PROPERTIES*", $list_alt4);
	defparameter("*CLASSES-VALID-SLOT-PROPERTIES*", $list_alt5);
	defparameter("*CLASSES-VALID-METHOD-INTERFACE-TYPES*", $list_alt6);
	defparameter("*CLASSES-VALID-METHOD-PROPERTIES*", $list_alt7);
	deflexical("*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*", NIL != boundp($classes_always_generate_before_listeners$) ? ((SubLObject) ($classes_always_generate_before_listeners$.getGlobalValue())) : NIL);
	deflexical("*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*", NIL != boundp($classes_always_generate_after_listeners$) ? ((SubLObject) ($classes_always_generate_after_listeners$.getGlobalValue())) : NIL);
	defparameter("*CLASSES-NEW-CLASS-CURRENT*", NIL);
	defparameter("*CURCLASS*", NIL);
	return NIL;
    }

    public static SubLObject init_classes_file() {
	if (SubLFiles.USE_V1) {
	    defconstant("*CLASSES-CLASS-SLOT-ACCESS-VIOLATION*", $str0$Cannot_access__A_slot__S_from_cla);
	    defconstant("*CLASSES-INITIAL-HASHTABLE-SIZE*", $int$800);
	    defparameter("*CLASSES-CLASS-TABLE-UPDATE-LOCK*", make_lock($$$Class_Table_Update_Lock));
	    deflexical("*CLASSES-CLASS-TABLE*", SubLTrampolineFile.maybeDefault($classes_class_table$, $classes_class_table$, () -> make_hash_table($classes_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
	    defparameter("*CLASSES-VALID-CLASS-PROPERTIES*", $list4);
	    defparameter("*CLASSES-VALID-SLOT-PROPERTIES*", $list5);
	    defparameter("*CLASSES-VALID-METHOD-INTERFACE-TYPES*", $list6);
	    defparameter("*CLASSES-VALID-METHOD-PROPERTIES*", $list7);
	    deflexical("*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*", SubLTrampolineFile.maybeDefault($classes_always_generate_before_listeners$, $classes_always_generate_before_listeners$, NIL));
	    deflexical("*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*", SubLTrampolineFile.maybeDefault($classes_always_generate_after_listeners$, $classes_always_generate_after_listeners$, NIL));
	    defparameter("*CLASSES-NEW-CLASS-CURRENT*", NIL);
	    defparameter("*CURCLASS*", NIL);
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*CLASSES-CLASS-TABLE*", NIL != boundp($classes_class_table$) ? ((SubLObject) ($classes_class_table$.getGlobalValue())) : make_hash_table($classes_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
	    deflexical("*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*", NIL != boundp($classes_always_generate_before_listeners$) ? ((SubLObject) ($classes_always_generate_before_listeners$.getGlobalValue())) : NIL);
	    deflexical("*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*", NIL != boundp($classes_always_generate_after_listeners$) ? ((SubLObject) ($classes_always_generate_after_listeners$.getGlobalValue())) : NIL);
	}
	return NIL;
    }

    public static SubLObject init_classes_file_Previous() {
	defconstant("*CLASSES-CLASS-SLOT-ACCESS-VIOLATION*", $str0$Cannot_access__A_slot__S_from_cla);
	defconstant("*CLASSES-INITIAL-HASHTABLE-SIZE*", $int$800);
	defparameter("*CLASSES-CLASS-TABLE-UPDATE-LOCK*", make_lock($$$Class_Table_Update_Lock));
	deflexical("*CLASSES-CLASS-TABLE*", SubLTrampolineFile.maybeDefault($classes_class_table$, $classes_class_table$, () -> make_hash_table($classes_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
	defparameter("*CLASSES-VALID-CLASS-PROPERTIES*", $list4);
	defparameter("*CLASSES-VALID-SLOT-PROPERTIES*", $list5);
	defparameter("*CLASSES-VALID-METHOD-INTERFACE-TYPES*", $list6);
	defparameter("*CLASSES-VALID-METHOD-PROPERTIES*", $list7);
	deflexical("*CLASSES-ALWAYS-GENERATE-BEFORE-LISTENERS*", SubLTrampolineFile.maybeDefault($classes_always_generate_before_listeners$, $classes_always_generate_before_listeners$, NIL));
	deflexical("*CLASSES-ALWAYS-GENERATE-AFTER-LISTENERS*", SubLTrampolineFile.maybeDefault($classes_always_generate_after_listeners$, $classes_always_generate_after_listeners$, NIL));
	defparameter("*CLASSES-NEW-CLASS-CURRENT*", NIL);
	defparameter("*CURCLASS*", NIL);
	return NIL;
    }

    public static SubLObject setup_classes_file() {
	declare_defglobal($classes_class_table$);
	declare_defglobal($classes_always_generate_before_listeners$);
	declare_defglobal($classes_always_generate_after_listeners$);
	register_macro_helper(SUBLOOP_NEW_CLASS, DEFINE_CLASS);
	register_macro_helper(SUBLOOP_INITIALIZE_SLOT, DEFINE_CLASS);
	register_macro_helper(SUBLOOP_NOTE_CLASS_INITIALIZATION_FUNCTION, DEFINE_CLASS);
	register_macro_helper(SUBLOOP_NOTE_INSTANCE_INITIALIZATION_FUNCTION, DEFINE_CLASS);
	register_macro_helper(SUBLOOP_INSTANCEOF_CLASS, DEFINE_CLASS);
	register_macro_helper(SUBLOOP_GET_INSTANCE_SLOT, DEFINE_CLASS);
	register_macro_helper(SUBLOOP_GET_ACCESS_PROTECTED_INSTANCE_SLOT, DEFINE_CLASS);
	register_macro_helper(SUBLOOP_SET_INSTANCE_SLOT, DEFINE_CLASS);
	register_macro_helper(SUBLOOP_SET_ACCESS_PROTECTED_INSTANCE_SLOT, DEFINE_CLASS);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_classes_file();
    }

    @Override
    public void initializeVariables() {
	init_classes_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_classes_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Cannot_access__A_slot__S_from_cla = makeString("Cannot access ~A slot ~S from class ~S.");

    static private final SubLList $list_alt4 = list(makeKeyword("EXTENDS"), makeKeyword("IMPLEMENTS"), makeKeyword("SLOT-LISTENERS"), makeKeyword("SYNCHRONIZED-SLOTS"), makeKeyword("ABSTRACT"));

    static private final SubLList $list_alt5 = list(new SubLObject[] { makeKeyword("PRIVATE"), makeKeyword("PROTECTED"), makeKeyword("PUBLIC"), makeKeyword("FILE-SCOPE"), makeKeyword("SYSTEM-SCOPE"), makeKeyword("GLOBAL-SCOPE"), makeKeyword("CLASS"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"),
	    makeKeyword("VALUE"), makeKeyword("ESSENTIAL"), makeKeyword("NON-ESSENTAIL") });

    static private final SubLList $list_alt6 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEF-CLASS-METHOD"));

    static private final SubLList $list_alt7 = list(new SubLObject[] { makeKeyword("PRIVATE"), makeKeyword("PROTECTED"), makeKeyword("PUBLIC"), makeKeyword("FILE-SCOPE"), makeKeyword("SYSTEM-SCOPE"), makeKeyword("GLOBAL-SCOPE"), makeKeyword("DEFAULT"), makeKeyword("AUTO-UPDATE"),
	    makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("READ-ONLY"), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("INSTANTIATE-TEMPLATE") });

    static private final SubLString $str_alt20$_S_is_an_invalid_class_declaratio = makeString("~S is an invalid class declaration body.");

    static private final SubLString $str_alt21$_S_is_neither_a_valid_slot_nor_va = makeString("~S is neither a valid slot nor valid method interface declaration.");

    static private final SubLString $str_alt22$__class_name_____S = makeString("~%class-name -> ~S");

    static private final SubLString $str_alt23$__parent_____S = makeString("~%parent -> ~S");

    static private final SubLString $str_alt24$__subclasses_____S = makeString("~%subclasses -> ~S");

    static private final SubLString $str_alt25$__interface_names_____S = makeString("~%interface-names -> ~S");

    static private final SubLString $str_alt26$__interfaces_____S = makeString("~%interfaces -> ~S");

    static private final SubLString $str_alt27$__compiled_inheritance_path_____S = makeString("~%compiled-inheritance-path -> ~S");

    static private final SubLString $str_alt28$__instance_var_decls_____S = makeString("~%instance-var-decls -> ~S");

    static private final SubLString $str_alt29$__class_var_decls_____S = makeString("~%class-var-decls -> ~S");

    static private final SubLString $str_alt30$__compiled_instance_slot_access_a = makeString("~%compiled-instance-slot-access-alist -> ~S");

    static private final SubLString $str_alt31$__compiled_instance_boolean_slot_ = makeString("~%compiled-instance-boolean-slot-access-alist -> ~S");

    static private final SubLString $str_alt32$__compiled_class_slot_access_alis = makeString("~%compiled-class-slot-access-alist -> ~S");

    static private final SubLString $str_alt33$__compiled_class_boolean_slot_acc = makeString("~%compiled-class-boolean-slot-access-alist -> ~S");

    static private final SubLString $str_alt34$__slot_accessor_alist_____S = makeString("~%slot-accessor-alist -> ~S");

    static private final SubLString $str_alt35$__instance_method_decls_____S = makeString("~%instance-method-decls -> ~S");

    static private final SubLString $str_alt36$__class_method_decls_____S = makeString("~%class-method-decls -> ~S");

    static private final SubLString $str_alt37$__boolean_slots_____S = makeString("~%boolean-slots -> ~S");

    static private final SubLString $str_alt38$__any_slots_____S = makeString("~%any-slots -> ~S");

    static private final SubLString $str_alt39$__compiled_instance_method_access = makeString("~%compiled-instance-method-access-alist -> ~S");

    static private final SubLString $str_alt40$__compiled_class_method_access_al = makeString("~%compiled-class-method-access-alist -> ~S");

    static private final SubLString $str_alt41$__class_initialization_function__ = makeString("~%class-initialization-function -> ~S");

    static private final SubLString $str_alt42$__class_initialized_p_____S = makeString("~%class-initialized-p -> ~S");

    static private final SubLList $list_alt43 = list(makeSymbol("CLASS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt48$_S_is_not_a_valid_class_name_ = makeString("~S is not a valid class name.");

    static private final SubLString $str_alt49$NEW_CLASS__A_class_cannot_be_its_ = makeString("NEW-CLASS: A class cannot be its own superclass.  ~S can not extend ~S.");

    static private final SubLString $str_alt50$NEW_CLASS__A_class_cannot_subclas = makeString("NEW-CLASS: A class cannot subclass its own subclass.  ~S is a subclass of ~S.");

    static private final SubLString $str_alt53$Class_ = makeString("Class ");

    static private final SubLString $str_alt54$_Definition_Lock = makeString(" Definition Lock");

    static private final SubLString $str_alt55$_Access_Lock = makeString(" Access Lock");

    static private final SubLString $str_alt56$SUBLOOP_RESERVED_INITIALIZE_ = makeString("SUBLOOP-RESERVED-INITIALIZE-");

    static private final SubLString $str_alt57$_CLASS = makeString("-CLASS");

    static private final SubLString $str_alt58$_INSTANCE = makeString("-INSTANCE");

    static private final SubLList $list_alt60 = list(makeSymbol("SLOT-ACCESSOR-ASSOCIATION"));

    static private final SubLString $str_alt63$GET_ = makeString("GET-");

    static private final SubLString $str_alt64$_ = makeString("-");

    static private final SubLString $str_alt65$SET_ = makeString("SET-");

    static private final SubLString $str_alt66$___S_is_not_a_valid_class_propert = makeString("~%~S is not a valid class property list.  A class property list~\n     ~%must be a sequence of :extend followed by a class or :implements~\n     ~%followed by an interface or a list of interfaces.");

    static private final SubLString $str_alt67$___S_is_not_a_valid_class_propert = makeString("~%~S is not a valid class property.~%If you wish to extend a class used :extend.~\n                   ~%If you wish to implement an interface, use :implements.");

    static private final SubLString $str_alt68$___S_is_not_a_valid_class_propert = makeString("~%~S is not a valid class property.~%Only :extends and :implements are valid class properties.");

    static private final SubLString $str_alt70$___S_is_not_a_valid_value_for_the = makeString("~%~S is not a valid value for the :extends class property.");

    static private final SubLString $str_alt71$__Attempting_to_subclass_unknown_ = makeString("~%Attempting to subclass unknown class ~S.");

    static private final SubLString $str_alt73$___S_is_not_a_valid_value_for_the = makeString("~%~S is not a valid value for the :implements class property.");

    static private final SubLList $list_alt74 = cons(makeSymbol("GETTER"), makeSymbol("SETTER"));

    static private final SubLList $list_alt83 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt84 = list(list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLList $list_alt85 = list(makeSymbol("VALUE"));

    static private final SubLList $list_alt89 = list(list(RET, makeSymbol("VALUE")));

    static private final SubLList $list_alt103 = list(makeSymbol("FIF"), makeSymbol("VALUE"), ONE_INTEGER, ZERO_INTEGER);

    static private final SubLList $list_alt106 = list(list(makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), makeSymbol("CLASS")));

    static private final SubLList $list_alt112 = list(NIL);

    static private final SubLList $list_alt115 = list(makeSymbol("CLASS-ANY-SLOTS"), makeSymbol("CLASS"));

    static private final SubLList $list_alt116 = list(list(RET, NIL));

    static private final SubLList $list_alt118 = list(list(makeSymbol("CLASS-BOOLEAN-SLOTS"), makeSymbol("CLASS")));

    static private final SubLList $list_alt119 = list(makeSymbol("CLASS-BOOLEAN-SLOTS"), makeSymbol("CLASS"));

    static private final SubLString $str_alt120$_P = makeString("-P");

    static private final SubLList $list_alt125 = list(makeSymbol("NEW-INSTANCE"));

    static private final SubLString $str_alt128$___S_is_not_a_valid_class_name_ = makeString("~%~S is not a valid class name.");

    static private final SubLString $str_alt129$___S_is_not_a_valid_member_variab = makeString("~%~S is not a valid member variable and method decl list.");

    static private final SubLList $list_alt133 = list(T);

    static private final SubLList $list_alt134 = list(makeSymbol("CLASS-NAME-AND-PROPERTIES"), makeSymbol("&BODY"), makeSymbol("SLOT-DECLS"));

    static private final SubLList $list_alt135 = cons(makeSymbol("CLASS-NAME"), makeSymbol("CLASS-PROPERTIES"));

    static private final SubLList $list_alt145 = list(makeSymbol("CLASS"), makeSymbol("INDICATOR"));

    static private final SubLList $list_alt150 = list(listS(makeSymbol("VAR"), makeSymbol("BASE-CLASS"), makeSymbol("LISTED-OPTIONAL-DEPTH-VAR")), makeSymbol("&BODY"), makeSymbol("FORMS"));

    static private final SubLString $str_alt152$stack_element = makeString("stack-element");

    static private final SubLString $str_alt153$actual_class = makeString("actual-class");

    static private final SubLString $str_alt154$current_depth = makeString("current-depth");

    static private final SubLList $list_alt157 = list(ZERO_INTEGER);

    static private final SubLList $list_alt164 = list(ONE_INTEGER);

    static private final SubLList $list_alt165 = list(makeSymbol("ACTUAL-CHILD"));

    static private final SubLList $list_alt169 = list(makeSymbol("CSETQ"), makeSymbol("ACTUAL-CHILD"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("CHILD-CLASS")));

    static private final SubLList $list_alt172 = list(makeSymbol("CONS"), makeSymbol("ACTUAL-CHILD"), makeSymbol("NEXT-DEPTH"));

    static private final SubLString $str_alt173$__ = makeString("~%");

    static private final SubLString $str_alt174$__ = makeString("| ");

    static private final SubLString $str_alt175$_S_ = makeString("~S:");
}

/**
 * Total time: 727 ms
 */
