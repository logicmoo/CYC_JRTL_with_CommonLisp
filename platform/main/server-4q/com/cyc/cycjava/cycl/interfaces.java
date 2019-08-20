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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INTERFACES
 * source file: /cyc/top/cycl/interfaces.lisp
 * created:     2019/07/03 17:37:07
 */
public final class interfaces extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new interfaces();



    // defconstant
    // Definitions
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $interfaces_initial_hashtable_size$ = makeSymbol("*INTERFACES-INITIAL-HASHTABLE-SIZE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $interfaces_interface_table_update_lock$ = makeSymbol("*INTERFACES-INTERFACE-TABLE-UPDATE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $interfaces_marked_interfaces$ = makeSymbol("*INTERFACES-MARKED-INTERFACES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $interface_method_impossible_properties$ = makeSymbol("*INTERFACE-METHOD-IMPOSSIBLE-PROPERTIES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $interface_method_required_properties$ = makeSymbol("*INTERFACE-METHOD-REQUIRED-PROPERTIES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $invalid_interface_method_name_message$ = makeSymbol("*INVALID-INTERFACE-METHOD-NAME-MESSAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $invalid_interface_name_message$ = makeSymbol("*INVALID-INTERFACE-NAME-MESSAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $undeclare_method_name_message$ = makeSymbol("*UNDECLARE-METHOD-NAME-MESSAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $non_existing_interface_message$ = makeSymbol("*NON-EXISTING-INTERFACE-MESSAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $invalid_lambda_list_message$ = makeSymbol("*INVALID-LAMBDA-LIST-MESSAGE*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLInteger $int$400 = makeInteger(400);

    static private final SubLString $$$Interface_Table_Update_Lock = makeString("Interface Table Update Lock");

    public static final SubLSymbol $interfaces_interface_table$ = makeSymbol("*INTERFACES-INTERFACE-TABLE*");

    public static final SubLSymbol $interfaces_alist_of_all_interfaces$ = makeSymbol("*INTERFACES-ALIST-OF-ALL-INTERFACES*");

    static private final SubLList $list4 = list(makeKeyword("DEFAULT"), makeKeyword("AUTO-UPDATE"), makeKeyword("READ-ONLY"));

    static private final SubLList $list5 = list(makeKeyword("NO-MEMBER-VARIABLES"));

    static private final SubLList $list7 = list(list(makeSymbol("*INTERFACES-MARKED-INTERFACES*"), NIL));

    static private final SubLList $list10 = list(list(makeSymbol("INTERFACES-UNMARK-ALL-MARKED-INTERFACES"), makeSymbol("*INTERFACES-MARKED-INTERFACES*")));

    static private final SubLString $str11$__Describing_Interface__S = makeString("~%Describing Interface ~S");

    static private final SubLString $str12$____name_____S = makeString("~%  name -> ~S");

    static private final SubLString $str13$____parents_____S = makeString("~%  parents -> ~S");

    static private final SubLString $str14$____compiled_inheritance_path____ = makeString("~%  compiled-inheritance-path -> ~S");

    static private final SubLString $str15$____subinterfaces_____S = makeString("~%  subinterfaces -> ~S");

    static private final SubLString $str16$____implementers_____S = makeString("~%  implementers -> ~S");

    static private final SubLString $str17$____instance_method_decls_____S = makeString("~%  instance-method-decls -> ~S");

    static private final SubLString $str18$____class_method_decls_____S = makeString("~%  class-method-decls -> ~S");

    static private final SubLString $str19$____compiled_instance_method_decl = makeString("~%  compiled-instance-method-decls -> ~S");

    static private final SubLString $str20$____compiled_class_method_decls__ = makeString("~%  compiled-class-method-decls -> ~S");

    static private final SubLString $str21$____local_class_methods_____S = makeString("~%  local-class-methods -> ~S");

    static private final SubLString $str22$____local_instance_methods_____S = makeString("~%  local-instance-methods -> ~S");

    static private final SubLString $str23$___S_is_not_an_interface_ = makeString("~%~S is not an interface.");

    static private final SubLList $list24 = list(makeSymbol("INTERFACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol INTERFACE_DEFINITION_LOCK = makeSymbol("INTERFACE-DEFINITION-LOCK");

    private static final SubLSymbol $COMPILED_INHERITANCE_PATH_FROM_ABOVE = makeKeyword("COMPILED-INHERITANCE-PATH-FROM-ABOVE");

    private static final SubLSymbol $TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD = makeKeyword("TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD");

    private static final SubLSymbol $COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE = makeKeyword("COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE");

    private static final SubLSymbol $TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD = makeKeyword("TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD");

    private static final SubLSymbol $COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE = makeKeyword("COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE");

    private static final SubLSymbol $TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD = makeKeyword("TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD");

    static private final SubLString $str34$_P = makeString("-P");

    private static final SubLSymbol SUBLOOP_INSTANCEOF_INTERFACE = makeSymbol("SUBLOOP-INSTANCEOF-INTERFACE");

    private static final SubLSymbol NEW_INTERFACE = makeSymbol("NEW-INTERFACE");

    static private final SubLList $list40 = list(makeSymbol("INTERFACE-NAME-AND-PROPERTIES"), makeSymbol("&BODY"), makeSymbol("METHOD-DECLS"));

    static private final SubLString $str42$__Interface_names_must_be_a_symbo = makeString("~%Interface names must be a symbol.  ~S is an invalid interface name.");

    static private final SubLString $str43$__Interface_names_must_not_be_NIL = makeString("~%Interface names must not be NIL.  NIL is an invalid interface name.");

    static private final SubLString $$$Interface_ = makeString("Interface ");

    static private final SubLString $$$_Definition_Lock = makeString(" Definition Lock");

    static private final SubLString $str46$___S_is_not_a_valid_parent_interf = makeString("~%~S is not a valid parent interface specification.");

    static private final SubLString $str47$___S_is_not_a_valid_parent_interf = makeString("~%~S is not a valid parent interface.");

    static private final SubLString $str48$__Parent_interface__S_is_undefine = makeString("~%Parent interface ~S is undefined.");

    static private final SubLString $str49$___S_is_not_a_valid_interface_met = makeString("~%~S is not a valid interface method declaration.");

    static private final SubLString $str50$___S_is_not_a_valid_interface_met = makeString("~%~S is not a valid interface method declaration sequence.");

    static private final SubLString $str51$The_interface_method_name__S_is_n = makeString("The interface method name ~S is not a valid method name.  Valid method names must be non-nil symbols.");

    static private final SubLString $str52$The_interface_name__S_is_not_a_va = makeString("The interface name ~S is not a valid interface name.  Valid interface names must be non-nil symbols.");

    static private final SubLString $str53$The_method__S_of_interface__S_is_ = makeString("The method ~S of interface ~S is undeclared.  The method must be declared within the body of a define-interface.");

    static private final SubLString $str54$The_interface__S_which_appears_in = makeString("The interface ~S which appears in a method declaration does not exist.");

    static private final SubLString $str55$Lambda_list__S_of_method__S_of_in = makeString("Lambda list ~S of method ~S of interface ~S is not a valid lambda list.");

    private static final SubLSymbol INTERFACES_ADD_INTERFACE_CLASS_METHOD = makeSymbol("INTERFACES-ADD-INTERFACE-CLASS-METHOD");

    static private final SubLList $list57 = list(listS(makeSymbol("METHOD-NAME"), makeSymbol("INTERFACE-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol INTERFACES_ADD_INTERFACE_INSTANCE_METHOD = makeSymbol("INTERFACES-ADD-INTERFACE-INSTANCE-METHOD");

    private static final SubLSymbol $INTERFACES_FIND_CLASS_METHOD_INTERNAL = makeKeyword("INTERFACES-FIND-CLASS-METHOD-INTERNAL");

    private static final SubLSymbol $INTERFACES_FIND_INSTANCE_METHOD_INTERNAL = makeKeyword("INTERFACES-FIND-INSTANCE-METHOD-INTERNAL");

    static private final SubLString $str65$SUBLOOP_ALL_METHODS_OF_INTERFACE_ = makeString("SUBLOOP-ALL-METHODS-OF-INTERFACE: ~S is not an interface.");

    static private final SubLList $list66 = list(makeSymbol("INTERFACE"), makeSymbol("INDICATOR"));

    private static final SubLSymbol INTERFACE_PLIST = makeSymbol("INTERFACE-PLIST");

    static private final SubLString $$$interface = makeString("interface");

    private static final SubLSymbol CLASSES_PUTF = makeSymbol("CLASSES-PUTF");

    static private final SubLString $$$queue = makeString("queue");

    static private final SubLString $str73$current_interface = makeString("current-interface");

    static private final SubLList $list75 = list(NIL);

    private static final SubLSymbol INTERFACE_PARENTS = makeSymbol("INTERFACE-PARENTS");

    private static final SubLSymbol INTERFACES_RETRIEVE_INTERFACE = makeSymbol("INTERFACES-RETRIEVE-INTERFACE");

    static private final SubLList $list84 = list(list(makeSymbol("VAR"), makeSymbol("START-INTERFACE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol INTERFACE_SUBINTERFACES = makeSymbol("INTERFACE-SUBINTERFACES");

    static private final SubLString $str86$next_generation = makeString("next-generation");

    static private final SubLList $list88 = list(ZERO_INTEGER);

    static private final SubLList $list90 = list(makeSymbol("PROCESSED-NEXT-GENERATION"), NIL);

    static private final SubLSymbol $sym92$_ = makeSymbol("+");

    static private final SubLList $list93 = list(ONE_INTEGER);

    static private final SubLList $list96 = list(makeSymbol("PROCESSED-NEXT-GENERATION"));

    static private final SubLList $list97 = list(list(makeSymbol("CONS"), makeSymbol("INTERFACE-NAME"), makeSymbol("NEW-DEPTH")));

    static private final SubLList $list98 = list(list(makeSymbol("VAR"), makeSymbol("DEPTH-VAR"), makeSymbol("START-INTERFACE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject interfaces_reset_interface_table_alt() {
        $interfaces_interface_table$.setGlobalValue(make_hash_table($interfaces_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        return T;
    }

    public static SubLObject interfaces_reset_interface_table() {
        $interfaces_interface_table$.setGlobalValue(make_hash_table($interfaces_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        return T;
    }

    public static final SubLObject with_interface_marking_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt7, listS(CUNWIND_PROTECT, bq_cons(PROGN, body), $list_alt10));
        }
    }

    public static SubLObject with_interface_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list7, listS(CUNWIND_PROTECT, bq_cons(PROGN, body), $list10));
    }

    public static final SubLObject display_interface_alt(SubLObject interface_or_interface_name, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject v_interface = (NIL != subloop_structures.interface_p(interface_or_interface_name)) ? ((SubLObject) (interface_or_interface_name)) : com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(interface_or_interface_name);
            if (NIL != v_interface) {
                {
                    SubLObject v_interface_1 = v_interface;
                    SubLObject name = subloop_structures.interface_name(v_interface_1);
                    SubLObject parents = subloop_structures.interface_parents(v_interface_1);
                    SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface_1);
                    SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface_1);
                    SubLObject implementers = subloop_structures.interface_implementers(v_interface_1);
                    SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_1);
                    SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface_1);
                    SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface_1);
                    SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface_1);
                    SubLObject local_class_methods = subloop_structures.interface_local_class_methods(v_interface_1);
                    SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface_1);
                    format(stream, $str_alt11$__Describing_Interface__S, v_interface);
                    format(stream, $str_alt12$____name_____S, name);
                    format(stream, $str_alt13$____parents_____S, parents);
                    format(stream, $str_alt14$____compiled_inheritance_path____, compiled_inheritance_path);
                    format(stream, $str_alt15$____subinterfaces_____S, subinterfaces);
                    format(stream, $str_alt16$____implementers_____S, implementers);
                    format(stream, $str_alt17$____instance_method_decls_____S, instance_method_decls);
                    format(stream, $str_alt18$____class_method_decls_____S, class_method_decls);
                    format(stream, $str_alt19$____compiled_instance_method_decl, compiled_instance_method_decls);
                    format(stream, $str_alt20$____compiled_class_method_decls__, compiled_class_method_decls);
                    format(stream, $str_alt21$____local_class_methods_____S, local_class_methods);
                    format(stream, $str_alt22$____local_instance_methods_____S, local_instance_methods);
                }
            } else {
                format(stream, $str_alt23$___S_is_not_an_interface_, interface_or_interface_name);
            }
            return v_interface;
        }
    }

    public static SubLObject display_interface(final SubLObject interface_or_interface_name, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject v_interface = (NIL != subloop_structures.interface_p(interface_or_interface_name)) ? interface_or_interface_name : interfaces_retrieve_interface(interface_or_interface_name);
        if (NIL != v_interface) {
            final SubLObject v_interface_$1 = v_interface;
            final SubLObject name = subloop_structures.interface_name(v_interface_$1);
            final SubLObject parents = subloop_structures.interface_parents(v_interface_$1);
            final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface_$1);
            final SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface_$1);
            final SubLObject implementers = subloop_structures.interface_implementers(v_interface_$1);
            final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_$1);
            final SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface_$1);
            final SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface_$1);
            final SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface_$1);
            final SubLObject local_class_methods = subloop_structures.interface_local_class_methods(v_interface_$1);
            final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface_$1);
            format(stream, $str11$__Describing_Interface__S, v_interface);
            format(stream, $str12$____name_____S, name);
            format(stream, $str13$____parents_____S, parents);
            format(stream, $str14$____compiled_inheritance_path____, compiled_inheritance_path);
            format(stream, $str15$____subinterfaces_____S, subinterfaces);
            format(stream, $str16$____implementers_____S, implementers);
            format(stream, $str17$____instance_method_decls_____S, instance_method_decls);
            format(stream, $str18$____class_method_decls_____S, class_method_decls);
            format(stream, $str19$____compiled_instance_method_decl, compiled_instance_method_decls);
            format(stream, $str20$____compiled_class_method_decls__, compiled_class_method_decls);
            format(stream, $str21$____local_class_methods_____S, local_class_methods);
            format(stream, $str22$____local_instance_methods_____S, local_instance_methods);
        } else {
            format(stream, $str23$___S_is_not_an_interface_, interface_or_interface_name);
        }
        return v_interface;
    }

    public static final SubLObject with_interface_definition_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_interface = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            v_interface = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(WITH_LOCK_HELD, list(list(INTERFACE_DEFINITION_LOCK, v_interface)), body);
            }
        }
    }

    public static SubLObject with_interface_definition_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_interface = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        v_interface = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(WITH_LOCK_HELD, list(list(INTERFACE_DEFINITION_LOCK, v_interface)), body);
    }

    public static final SubLObject interfaces_mark_interface_alt(SubLObject v_interface, SubLObject mark) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mark_list = subloop_structures.interface_mark_list(v_interface);
                if (NIL != mark_list) {
                    {
                        SubLObject item_var = mark;
                        if (NIL == member(item_var, subloop_structures.interface_mark_list(v_interface), symbol_function(EQ), symbol_function(IDENTITY))) {
                            subloop_structures._csetf_interface_mark_list(v_interface, cons(item_var, subloop_structures.interface_mark_list(v_interface)));
                        }
                    }
                } else {
                    subloop_structures._csetf_interface_mark_list(v_interface, list(mark));
                    $interfaces_marked_interfaces$.setDynamicValue(cons(v_interface, $interfaces_marked_interfaces$.getDynamicValue(thread)), thread);
                }
            }
            return mark;
        }
    }

    public static SubLObject interfaces_mark_interface(final SubLObject v_interface, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mark_list = subloop_structures.interface_mark_list(v_interface);
        if (NIL != mark_list) {
            if (NIL == member(mark, subloop_structures.interface_mark_list(v_interface), symbol_function(EQ), symbol_function(IDENTITY))) {
                subloop_structures._csetf_interface_mark_list(v_interface, cons(mark, subloop_structures.interface_mark_list(v_interface)));
            }
        } else {
            subloop_structures._csetf_interface_mark_list(v_interface, list(mark));
            $interfaces_marked_interfaces$.setDynamicValue(cons(v_interface, $interfaces_marked_interfaces$.getDynamicValue(thread)), thread);
        }
        return mark;
    }

    public static final SubLObject interfaces_remove_mark_alt(SubLObject v_interface, SubLObject mark) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mark_list = subloop_structures.interface_mark_list(v_interface);
                if (NIL != mark_list) {
                    mark_list = delete(mark, mark_list, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    subloop_structures._csetf_interface_mark_list(v_interface, mark_list);
                    if (NIL == mark_list) {
                        $interfaces_marked_interfaces$.setDynamicValue(delete(v_interface, $interfaces_marked_interfaces$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    }
                }
            }
            return mark;
        }
    }

    public static SubLObject interfaces_remove_mark(final SubLObject v_interface, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mark_list = subloop_structures.interface_mark_list(v_interface);
        if (NIL != mark_list) {
            mark_list = delete(mark, mark_list, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            subloop_structures._csetf_interface_mark_list(v_interface, mark_list);
            if (NIL == mark_list) {
                $interfaces_marked_interfaces$.setDynamicValue(delete(v_interface, $interfaces_marked_interfaces$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            }
        }
        return mark;
    }

    public static final SubLObject interfaces_marked_p_alt(SubLObject v_interface, SubLObject mark) {
        return NIL != member(mark, subloop_structures.interface_mark_list(v_interface), symbol_function(EQ), UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject interfaces_marked_p(final SubLObject v_interface, final SubLObject mark) {
        return NIL != member(mark, subloop_structures.interface_mark_list(v_interface), symbol_function(EQ), UNPROVIDED) ? T : NIL;
    }

    public static final SubLObject interfaces_unmark_all_marked_interfaces_alt(SubLObject v_interfaces) {
        {
            SubLObject cdolist_list_var = v_interfaces;
            SubLObject v_interface = NIL;
            for (v_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_interface = cdolist_list_var.first()) {
                subloop_structures._csetf_interface_mark_list(v_interface, NIL);
            }
        }
        return NIL;
    }

    public static SubLObject interfaces_unmark_all_marked_interfaces(final SubLObject v_interfaces) {
        SubLObject cdolist_list_var = v_interfaces;
        SubLObject v_interface = NIL;
        v_interface = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subloop_structures._csetf_interface_mark_list(v_interface, NIL);
            cdolist_list_var = cdolist_list_var.rest();
            v_interface = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject interfaces_retrieve_interface_alt(SubLObject interface_name) {
        if (interface_name.isSymbol()) {
            return gethash(interface_name, $interfaces_interface_table$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject interfaces_retrieve_interface(final SubLObject interface_name) {
        if (interface_name.isSymbol()) {
            return gethash(interface_name, $interfaces_interface_table$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject interfaces_intern_interface_alt(SubLObject interface_name, SubLObject v_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $interfaces_interface_table_update_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (interface_name.isSymbol() && (NIL != subloop_structures.interface_p(v_interface))) {
                        sethash(interface_name, $interfaces_interface_table$.getGlobalValue(), v_interface);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return v_interface;
        }
    }

    public static SubLObject interfaces_intern_interface(final SubLObject interface_name, final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($interfaces_interface_table_update_lock$.getDynamicValue(thread));
            if (interface_name.isSymbol() && (NIL != subloop_structures.interface_p(v_interface))) {
                sethash(interface_name, $interfaces_interface_table$.getGlobalValue(), v_interface);
            }
        } finally {
            if (NIL != release) {
                release_lock($interfaces_interface_table_update_lock$.getDynamicValue(thread));
            }
        }
        return v_interface;
    }

    public static final SubLObject interfaces_delete_interface_alt(SubLObject interface_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $interfaces_interface_table_update_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (interface_name.isSymbol()) {
                        remhash(interface_name, $interfaces_interface_table$.getGlobalValue());
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

    public static SubLObject interfaces_delete_interface(final SubLObject interface_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($interfaces_interface_table_update_lock$.getDynamicValue(thread));
            if (interface_name.isSymbol()) {
                remhash(interface_name, $interfaces_interface_table$.getGlobalValue());
            }
        } finally {
            if (NIL != release) {
                release_lock($interfaces_interface_table_update_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject interfaces_compile_inheritance_path_from_above_alt(SubLObject v_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
                try {
                    $interfaces_marked_interfaces$.bind(NIL, thread);
                    try {
                        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(v_interface, $COMPILED_INHERITANCE_PATH_FROM_ABOVE);
                        com.cyc.cycjava.cycl.interfaces.interfaces_compile_inheritance_path_from_above_aux(v_interface);
                        com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compiled_inheritance_path_downward(v_interface);
                    } finally {
                        {
                            SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.interfaces.interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                    }
                } finally {
                    $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject interfaces_compile_inheritance_path_from_above(final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
        try {
            $interfaces_marked_interfaces$.bind(NIL, thread);
            try {
                interfaces_mark_interface(v_interface, $COMPILED_INHERITANCE_PATH_FROM_ABOVE);
                interfaces_compile_inheritance_path_from_above_aux(v_interface);
                interfaces_transmit_compiled_inheritance_path_downward(v_interface);
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject interfaces_compile_inheritance_path_from_above_aux_alt(SubLObject v_interface) {
        {
            SubLObject v_interface_3 = v_interface;
            SubLObject name = subloop_structures.interface_name(v_interface_3);
            SubLObject parents = subloop_structures.interface_parents(v_interface_3);
            SubLObject parent_interface = NIL;
            SubLObject parent_inheritance_path = NIL;
            SubLObject intermediate_path = NIL;
            SubLObject new_inheritance_path = NIL;
            SubLObject cdolist_list_var = parents;
            SubLObject parent = NIL;
            for (parent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent = cdolist_list_var.first()) {
                parent_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(parent);
                if (NIL != parent_interface) {
                    if (NIL != com.cyc.cycjava.cycl.interfaces.interfaces_marked_p(parent_interface, $COMPILED_INHERITANCE_PATH_FROM_ABOVE)) {
                        parent_inheritance_path = subloop_structures.interface_compiled_inheritance_path(parent_interface);
                    } else {
                        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(parent_interface, $COMPILED_INHERITANCE_PATH_FROM_ABOVE);
                        parent_inheritance_path = com.cyc.cycjava.cycl.interfaces.interfaces_compile_inheritance_path_from_above_aux(parent_interface);
                    }
                    {
                        SubLObject item_var = name;
                        if (NIL == member(item_var, subloop_structures.interface_subinterfaces(parent_interface), symbol_function(EQ), symbol_function(IDENTITY))) {
                            subloop_structures._csetf_interface_subinterfaces(parent_interface, cons(item_var, subloop_structures.interface_subinterfaces(parent_interface)));
                        }
                    }
                    intermediate_path = NIL;
                    {
                        SubLObject cdolist_list_var_4 = parent_inheritance_path;
                        SubLObject grand_parent = NIL;
                        for (grand_parent = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , grand_parent = cdolist_list_var_4.first()) {
                            if (NIL == member(grand_parent, new_inheritance_path, symbol_function(EQ), UNPROVIDED)) {
                                intermediate_path = cons(grand_parent, intermediate_path);
                            }
                        }
                    }
                    if (NIL == member(parent_interface, new_inheritance_path, symbol_function(EQ), UNPROVIDED)) {
                        intermediate_path = cons(parent_interface, intermediate_path);
                    }
                    new_inheritance_path = nconc(new_inheritance_path, intermediate_path);
                }
            }
            subloop_structures._csetf_interface_compiled_inheritance_path(v_interface, new_inheritance_path);
            return new_inheritance_path;
        }
    }

    public static SubLObject interfaces_compile_inheritance_path_from_above_aux(final SubLObject v_interface) {
        final SubLObject name = subloop_structures.interface_name(v_interface);
        final SubLObject parents = subloop_structures.interface_parents(v_interface);
        SubLObject parent_interface = NIL;
        SubLObject parent_inheritance_path = NIL;
        SubLObject intermediate_path = NIL;
        SubLObject new_inheritance_path = NIL;
        SubLObject cdolist_list_var = parents;
        SubLObject parent = NIL;
        parent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            parent_interface = interfaces_retrieve_interface(parent);
            if (NIL != parent_interface) {
                if (NIL != interfaces_marked_p(parent_interface, $COMPILED_INHERITANCE_PATH_FROM_ABOVE)) {
                    parent_inheritance_path = subloop_structures.interface_compiled_inheritance_path(parent_interface);
                } else {
                    interfaces_mark_interface(parent_interface, $COMPILED_INHERITANCE_PATH_FROM_ABOVE);
                    parent_inheritance_path = interfaces_compile_inheritance_path_from_above_aux(parent_interface);
                }
                final SubLObject item_var = name;
                if (NIL == member(item_var, subloop_structures.interface_subinterfaces(parent_interface), symbol_function(EQ), symbol_function(IDENTITY))) {
                    subloop_structures._csetf_interface_subinterfaces(parent_interface, cons(item_var, subloop_structures.interface_subinterfaces(parent_interface)));
                }
                intermediate_path = NIL;
                SubLObject cdolist_list_var_$4 = parent_inheritance_path;
                SubLObject grand_parent = NIL;
                grand_parent = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL == member(grand_parent, new_inheritance_path, symbol_function(EQ), UNPROVIDED)) {
                        intermediate_path = cons(grand_parent, intermediate_path);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    grand_parent = cdolist_list_var_$4.first();
                } 
                if (NIL == member(parent_interface, new_inheritance_path, symbol_function(EQ), UNPROVIDED)) {
                    intermediate_path = cons(parent_interface, intermediate_path);
                }
                new_inheritance_path = nconc(new_inheritance_path, intermediate_path);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent = cdolist_list_var.first();
        } 
        subloop_structures._csetf_interface_compiled_inheritance_path(v_interface, new_inheritance_path);
        return new_inheritance_path;
    }

    public static final SubLObject interfaces_transmit_compiled_inheritance_path_downward_alt(SubLObject v_interface) {
        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(v_interface, $TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD);
        com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compiled_inheritance_path_downward_aux(v_interface);
        return NIL;
    }

    public static SubLObject interfaces_transmit_compiled_inheritance_path_downward(final SubLObject v_interface) {
        interfaces_mark_interface(v_interface, $TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD);
        interfaces_transmit_compiled_inheritance_path_downward_aux(v_interface);
        return NIL;
    }

    public static final SubLObject interfaces_transmit_compiled_inheritance_path_downward_aux_alt(SubLObject v_interface) {
        {
            SubLObject v_interface_5 = v_interface;
            SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface_5);
            SubLObject subinterface_interface = NIL;
            SubLObject cdolist_list_var = subinterfaces;
            SubLObject subinterface = NIL;
            for (subinterface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subinterface = cdolist_list_var.first()) {
                subinterface_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(subinterface);
                if ((NIL != subinterface_interface) && (NIL == com.cyc.cycjava.cycl.interfaces.interfaces_marked_p(subinterface_interface, $TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD))) {
                    com.cyc.cycjava.cycl.interfaces.interfaces_compile_inheritance_path_from_above(subinterface_interface);
                    com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(subinterface_interface, $TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD);
                    com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compiled_inheritance_path_downward_aux(subinterface_interface);
                }
            }
        }
        return NIL;
    }

    public static SubLObject interfaces_transmit_compiled_inheritance_path_downward_aux(final SubLObject v_interface) {
        final SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface);
        SubLObject subinterface_interface = NIL;
        SubLObject cdolist_list_var = subinterfaces;
        SubLObject subinterface = NIL;
        subinterface = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subinterface_interface = interfaces_retrieve_interface(subinterface);
            if ((NIL != subinterface_interface) && (NIL == interfaces_marked_p(subinterface_interface, $TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD))) {
                interfaces_compile_inheritance_path_from_above(subinterface_interface);
                interfaces_mark_interface(subinterface_interface, $TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD);
                interfaces_transmit_compiled_inheritance_path_downward_aux(subinterface_interface);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subinterface = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject interfaces_compile_instance_method_decls_from_above_alt(SubLObject v_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
                try {
                    $interfaces_marked_interfaces$.bind(NIL, thread);
                    try {
                        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(v_interface, $COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE);
                        com.cyc.cycjava.cycl.interfaces.interfaces_compile_instance_method_decls_from_above_aux(v_interface);
                        com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compile_instance_method_decls_downward(v_interface);
                    } finally {
                        {
                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.interfaces.interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                            }
                        }
                    }
                } finally {
                    $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject interfaces_compile_instance_method_decls_from_above(final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
        try {
            $interfaces_marked_interfaces$.bind(NIL, thread);
            try {
                interfaces_mark_interface(v_interface, $COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE);
                interfaces_compile_instance_method_decls_from_above_aux(v_interface);
                interfaces_transmit_compile_instance_method_decls_downward(v_interface);
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject interfaces_compile_instance_method_decls_from_above_aux_alt(SubLObject v_interface) {
        {
            SubLObject result = NIL;
            SubLObject v_interface_7 = v_interface;
            SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface_7);
            SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_7);
            SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface_7);
            try {
                {
                    SubLObject parent_compiled_instance_method_decls = NIL;
                    SubLObject own_decls = NIL;
                    SubLObject new_compiled_decls = NIL;
                    {
                        SubLObject cdolist_list_var = compiled_inheritance_path;
                        SubLObject parent_interface = NIL;
                        for (parent_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.interfaces.interfaces_marked_p(parent_interface, $COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE)) {
                                parent_compiled_instance_method_decls = copy_list(subloop_structures.interface_compiled_instance_method_decls(parent_interface));
                            } else {
                                com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(parent_interface, $COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE);
                                parent_compiled_instance_method_decls = com.cyc.cycjava.cycl.interfaces.interfaces_compile_instance_method_decls_from_above_aux(parent_interface);
                            }
                            {
                                SubLObject cdolist_list_var_8 = parent_compiled_instance_method_decls;
                                SubLObject decl = NIL;
                                for (decl = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , decl = cdolist_list_var_8.first()) {
                                    if (NIL == member(cadr(decl), new_compiled_decls, symbol_function(EQ), symbol_function(CADR))) {
                                        new_compiled_decls = cons(decl, new_compiled_decls);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = instance_method_decls;
                        SubLObject decl = NIL;
                        for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , decl = cdolist_list_var.first()) {
                            if (NIL == member(cadr(decl), new_compiled_decls, symbol_function(EQ), symbol_function(CADR))) {
                                own_decls = cons(decl, own_decls);
                            }
                        }
                    }
                    compiled_instance_method_decls = nconc(nreverse(own_decls), nreverse(new_compiled_decls));
                    result = compiled_instance_method_decls;
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        subloop_structures._csetf_interface_compiled_inheritance_path(v_interface_7, compiled_inheritance_path);
                        subloop_structures._csetf_interface_instance_method_decls(v_interface_7, instance_method_decls);
                        subloop_structures._csetf_interface_compiled_instance_method_decls(v_interface_7, compiled_instance_method_decls);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject interfaces_compile_instance_method_decls_from_above_aux(final SubLObject v_interface) {
        SubLObject result = NIL;
        final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface);
        final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface);
        SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface);
        try {
            SubLObject parent_compiled_instance_method_decls = NIL;
            SubLObject own_decls = NIL;
            SubLObject new_compiled_decls = NIL;
            SubLObject cdolist_list_var = compiled_inheritance_path;
            SubLObject parent_interface = NIL;
            parent_interface = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != interfaces_marked_p(parent_interface, $COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE)) {
                    parent_compiled_instance_method_decls = copy_list(subloop_structures.interface_compiled_instance_method_decls(parent_interface));
                } else {
                    interfaces_mark_interface(parent_interface, $COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE);
                    parent_compiled_instance_method_decls = interfaces_compile_instance_method_decls_from_above_aux(parent_interface);
                }
                SubLObject cdolist_list_var_$8 = parent_compiled_instance_method_decls;
                SubLObject decl = NIL;
                decl = cdolist_list_var_$8.first();
                while (NIL != cdolist_list_var_$8) {
                    if (NIL == member(cadr(decl), new_compiled_decls, symbol_function(EQ), symbol_function(CADR))) {
                        new_compiled_decls = cons(decl, new_compiled_decls);
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    decl = cdolist_list_var_$8.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            } 
            cdolist_list_var = instance_method_decls;
            SubLObject decl2 = NIL;
            decl2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == member(cadr(decl2), new_compiled_decls, symbol_function(EQ), symbol_function(CADR))) {
                    own_decls = cons(decl2, own_decls);
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl2 = cdolist_list_var.first();
            } 
            compiled_instance_method_decls = result = nconc(nreverse(own_decls), nreverse(new_compiled_decls));
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                subloop_structures._csetf_interface_compiled_inheritance_path(v_interface, compiled_inheritance_path);
                subloop_structures._csetf_interface_instance_method_decls(v_interface, instance_method_decls);
                subloop_structures._csetf_interface_compiled_instance_method_decls(v_interface, compiled_instance_method_decls);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static final SubLObject interfaces_transmit_compile_instance_method_decls_downward_alt(SubLObject v_interface) {
        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(v_interface, $TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD);
        com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compile_instance_method_decls_downward_aux(v_interface);
        return NIL;
    }

    public static SubLObject interfaces_transmit_compile_instance_method_decls_downward(final SubLObject v_interface) {
        interfaces_mark_interface(v_interface, $TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD);
        interfaces_transmit_compile_instance_method_decls_downward_aux(v_interface);
        return NIL;
    }

    public static final SubLObject interfaces_transmit_compile_instance_method_decls_downward_aux_alt(SubLObject v_interface) {
        {
            SubLObject v_interface_9 = v_interface;
            SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface_9);
            SubLObject subinterface_interface = NIL;
            SubLObject cdolist_list_var = subinterfaces;
            SubLObject subinterface = NIL;
            for (subinterface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subinterface = cdolist_list_var.first()) {
                subinterface_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(subinterface);
                if ((NIL != subinterface_interface) && (NIL == com.cyc.cycjava.cycl.interfaces.interfaces_marked_p(subinterface_interface, $TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD))) {
                    com.cyc.cycjava.cycl.interfaces.interfaces_compile_instance_method_decls_from_above(subinterface_interface);
                    com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(subinterface_interface, $TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD);
                    com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compile_instance_method_decls_downward_aux(subinterface_interface);
                }
            }
        }
        return NIL;
    }

    public static SubLObject interfaces_transmit_compile_instance_method_decls_downward_aux(final SubLObject v_interface) {
        final SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface);
        SubLObject subinterface_interface = NIL;
        SubLObject cdolist_list_var = subinterfaces;
        SubLObject subinterface = NIL;
        subinterface = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subinterface_interface = interfaces_retrieve_interface(subinterface);
            if ((NIL != subinterface_interface) && (NIL == interfaces_marked_p(subinterface_interface, $TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD))) {
                interfaces_compile_instance_method_decls_from_above(subinterface_interface);
                interfaces_mark_interface(subinterface_interface, $TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD);
                interfaces_transmit_compile_instance_method_decls_downward_aux(subinterface_interface);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subinterface = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject interfaces_compile_class_method_decls_from_above_alt(SubLObject v_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
                try {
                    $interfaces_marked_interfaces$.bind(NIL, thread);
                    try {
                        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(v_interface, $COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE);
                        com.cyc.cycjava.cycl.interfaces.interfaces_compile_class_method_decls_from_above_aux(v_interface);
                        com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compile_class_method_decls_downward(v_interface);
                    } finally {
                        {
                            SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.interfaces.interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                            }
                        }
                    }
                } finally {
                    $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject interfaces_compile_class_method_decls_from_above(final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
        try {
            $interfaces_marked_interfaces$.bind(NIL, thread);
            try {
                interfaces_mark_interface(v_interface, $COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE);
                interfaces_compile_class_method_decls_from_above_aux(v_interface);
                interfaces_transmit_compile_class_method_decls_downward(v_interface);
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject interfaces_compile_class_method_decls_from_above_aux_alt(SubLObject v_interface) {
        {
            SubLObject result = NIL;
            SubLObject v_interface_11 = v_interface;
            SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface_11);
            SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface_11);
            SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface_11);
            try {
                {
                    SubLObject parent_compiled_class_method_decls = NIL;
                    SubLObject own_decls = NIL;
                    SubLObject new_compiled_decls = NIL;
                    {
                        SubLObject cdolist_list_var = compiled_inheritance_path;
                        SubLObject parent_interface = NIL;
                        for (parent_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.interfaces.interfaces_marked_p(parent_interface, $COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE)) {
                                parent_compiled_class_method_decls = copy_list(subloop_structures.interface_compiled_class_method_decls(parent_interface));
                            } else {
                                com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(parent_interface, $COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE);
                                parent_compiled_class_method_decls = com.cyc.cycjava.cycl.interfaces.interfaces_compile_class_method_decls_from_above_aux(parent_interface);
                            }
                            {
                                SubLObject cdolist_list_var_12 = parent_compiled_class_method_decls;
                                SubLObject decl = NIL;
                                for (decl = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , decl = cdolist_list_var_12.first()) {
                                    if (NIL == member(cadr(decl), new_compiled_decls, symbol_function(EQ), symbol_function(CADR))) {
                                        new_compiled_decls = cons(decl, new_compiled_decls);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = class_method_decls;
                        SubLObject decl = NIL;
                        for (decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , decl = cdolist_list_var.first()) {
                            if (NIL == member(cadr(decl), new_compiled_decls, symbol_function(EQ), symbol_function(CADR))) {
                                own_decls = cons(decl, own_decls);
                            }
                        }
                    }
                    compiled_class_method_decls = nconc(nreverse(own_decls), nreverse(new_compiled_decls));
                    result = compiled_class_method_decls;
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        subloop_structures._csetf_interface_compiled_inheritance_path(v_interface_11, compiled_inheritance_path);
                        subloop_structures._csetf_interface_class_method_decls(v_interface_11, class_method_decls);
                        subloop_structures._csetf_interface_compiled_class_method_decls(v_interface_11, compiled_class_method_decls);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject interfaces_compile_class_method_decls_from_above_aux(final SubLObject v_interface) {
        SubLObject result = NIL;
        final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path(v_interface);
        final SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface);
        SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface);
        try {
            SubLObject parent_compiled_class_method_decls = NIL;
            SubLObject own_decls = NIL;
            SubLObject new_compiled_decls = NIL;
            SubLObject cdolist_list_var = compiled_inheritance_path;
            SubLObject parent_interface = NIL;
            parent_interface = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != interfaces_marked_p(parent_interface, $COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE)) {
                    parent_compiled_class_method_decls = copy_list(subloop_structures.interface_compiled_class_method_decls(parent_interface));
                } else {
                    interfaces_mark_interface(parent_interface, $COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE);
                    parent_compiled_class_method_decls = interfaces_compile_class_method_decls_from_above_aux(parent_interface);
                }
                SubLObject cdolist_list_var_$12 = parent_compiled_class_method_decls;
                SubLObject decl = NIL;
                decl = cdolist_list_var_$12.first();
                while (NIL != cdolist_list_var_$12) {
                    if (NIL == member(cadr(decl), new_compiled_decls, symbol_function(EQ), symbol_function(CADR))) {
                        new_compiled_decls = cons(decl, new_compiled_decls);
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    decl = cdolist_list_var_$12.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            } 
            cdolist_list_var = class_method_decls;
            SubLObject decl2 = NIL;
            decl2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == member(cadr(decl2), new_compiled_decls, symbol_function(EQ), symbol_function(CADR))) {
                    own_decls = cons(decl2, own_decls);
                }
                cdolist_list_var = cdolist_list_var.rest();
                decl2 = cdolist_list_var.first();
            } 
            compiled_class_method_decls = result = nconc(nreverse(own_decls), nreverse(new_compiled_decls));
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                subloop_structures._csetf_interface_compiled_inheritance_path(v_interface, compiled_inheritance_path);
                subloop_structures._csetf_interface_class_method_decls(v_interface, class_method_decls);
                subloop_structures._csetf_interface_compiled_class_method_decls(v_interface, compiled_class_method_decls);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static final SubLObject interfaces_transmit_compile_class_method_decls_downward_alt(SubLObject v_interface) {
        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(v_interface, $TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD);
        com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compile_class_method_decls_downward_aux(v_interface);
        return NIL;
    }

    public static SubLObject interfaces_transmit_compile_class_method_decls_downward(final SubLObject v_interface) {
        interfaces_mark_interface(v_interface, $TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD);
        interfaces_transmit_compile_class_method_decls_downward_aux(v_interface);
        return NIL;
    }

    public static final SubLObject interfaces_transmit_compile_class_method_decls_downward_aux_alt(SubLObject v_interface) {
        {
            SubLObject v_interface_13 = v_interface;
            SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface_13);
            SubLObject subinterface_interface = NIL;
            SubLObject cdolist_list_var = subinterfaces;
            SubLObject subinterface = NIL;
            for (subinterface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subinterface = cdolist_list_var.first()) {
                subinterface_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(subinterface);
                if ((NIL != subinterface_interface) && (NIL == com.cyc.cycjava.cycl.interfaces.interfaces_marked_p(subinterface_interface, $TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD))) {
                    com.cyc.cycjava.cycl.interfaces.interfaces_compile_class_method_decls_from_above(subinterface_interface);
                    com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(subinterface_interface, $TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD);
                    com.cyc.cycjava.cycl.interfaces.interfaces_transmit_compile_class_method_decls_downward_aux(subinterface_interface);
                }
            }
        }
        return NIL;
    }

    public static SubLObject interfaces_transmit_compile_class_method_decls_downward_aux(final SubLObject v_interface) {
        final SubLObject subinterfaces = subloop_structures.interface_subinterfaces(v_interface);
        SubLObject subinterface_interface = NIL;
        SubLObject cdolist_list_var = subinterfaces;
        SubLObject subinterface = NIL;
        subinterface = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subinterface_interface = interfaces_retrieve_interface(subinterface);
            if ((NIL != subinterface_interface) && (NIL == interfaces_marked_p(subinterface_interface, $TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD))) {
                interfaces_compile_class_method_decls_from_above(subinterface_interface);
                interfaces_mark_interface(subinterface_interface, $TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD);
                interfaces_transmit_compile_class_method_decls_downward_aux(subinterface_interface);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subinterface = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject expand_interface_predicator_alt(SubLObject interface_name) {
        {
            SubLObject predicator_name = intern(cconcatenate(symbol_name(interface_name), $str_alt34$_P), UNPROVIDED);
            return list(DEFINE_PUBLIC, predicator_name, list(interface_name), list(RET, list(SUBLOOP_INSTANCEOF_INTERFACE, interface_name, list(QUOTE, interface_name))));
        }
    }

    public static SubLObject expand_interface_predicator(final SubLObject interface_name) {
        final SubLObject predicator_name = intern(cconcatenate(symbol_name(interface_name), $str34$_P), UNPROVIDED);
        return list(DEFINE_PUBLIC, predicator_name, list(interface_name), list(RET, list(SUBLOOP_INSTANCEOF_INTERFACE, interface_name, list(QUOTE, interface_name))));
    }

    public static final SubLObject subloop_instanceof_interface_alt(SubLObject v_object, SubLObject v_interface) {
        if (NIL != subloop_structures.instance_p(v_object)) {
            {
                SubLObject direct_class = subloop_structures.instance_class(v_object);
                return classes.classes_implements_p(direct_class, v_interface);
            }
        }
        return NIL;
    }

    public static SubLObject subloop_instanceof_interface(final SubLObject v_object, final SubLObject v_interface) {
        if (NIL != subloop_structures.instance_p(v_object)) {
            final SubLObject direct_class = subloop_structures.instance_class(v_object);
            return classes.classes_implements_p(direct_class, v_interface);
        }
        return NIL;
    }

    public static final SubLObject expand_define_interface_alt(SubLObject interface_name, SubLObject parent_interfaces, SubLObject interface_properties, SubLObject method_decls) {
        com.cyc.cycjava.cycl.interfaces.new_interface(interface_name, parent_interfaces, interface_properties, method_decls);
        return list(PROGN, list(NEW_INTERFACE, list(QUOTE, interface_name), list(QUOTE, parent_interfaces), list(QUOTE, interface_properties), list(QUOTE, method_decls)), com.cyc.cycjava.cycl.interfaces.expand_interface_predicator(interface_name));
    }

    public static SubLObject expand_define_interface(final SubLObject interface_name, final SubLObject parent_interfaces, final SubLObject interface_properties, final SubLObject method_decls) {
        new_interface(interface_name, parent_interfaces, interface_properties, method_decls);
        return list(PROGN, list(NEW_INTERFACE, list(QUOTE, interface_name), list(QUOTE, parent_interfaces), list(QUOTE, interface_properties), list(QUOTE, method_decls)), expand_interface_predicator(interface_name));
    }

    public static final SubLObject define_interface_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject interface_name_and_properties = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt40);
            interface_name_and_properties = current.first();
            current = current.rest();
            {
                SubLObject method_decls = current;
                SubLObject interface_name = interface_name_and_properties.first();
                SubLObject interface_properties = interface_name_and_properties.rest();
                SubLObject parent_interfaces = classes.classes_getf(interface_properties, $EXTENDS);
                return com.cyc.cycjava.cycl.interfaces.expand_define_interface(interface_name, parent_interfaces, interface_properties, method_decls);
            }
        }
    }

    public static SubLObject define_interface(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interface_name_and_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list40);
        interface_name_and_properties = current.first();
        final SubLObject method_decls;
        current = method_decls = current.rest();
        final SubLObject interface_name = interface_name_and_properties.first();
        final SubLObject interface_properties = interface_name_and_properties.rest();
        final SubLObject parent_interfaces = classes.classes_getf(interface_properties, $EXTENDS);
        return expand_define_interface(interface_name, parent_interfaces, interface_properties, method_decls);
    }

    public static final SubLObject new_interface_alt(SubLObject interface_name, SubLObject parent_interfaces, SubLObject interface_properties, SubLObject method_decls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!interface_name.isSymbol()) {
                    Errors.error($str_alt42$__Interface_names_must_be_a_symbo, interface_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == interface_name) {
                    Errors.error($str_alt43$__Interface_names_must_not_be_NIL);
                }
            }
            if (parent_interfaces.isSymbol() && (NIL != parent_interfaces)) {
                parent_interfaces = list(parent_interfaces);
            }
            com.cyc.cycjava.cycl.interfaces.interfaces_check_parent_interfaces(parent_interfaces);
            com.cyc.cycjava.cycl.interfaces.interfaces_must_be_valid_method_interface_decl_list(method_decls);
            {
                SubLObject v_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(interface_name);
                SubLObject apriori_interface = (NIL != v_interface) ? ((SubLObject) (T)) : NIL;
                if (NIL == v_interface) {
                    v_interface = subloop_structures.make_interface(UNPROVIDED);
                    subloop_structures._csetf_interface_definition_lock(v_interface, make_lock(cconcatenate($str_alt44$Interface_, new SubLObject[]{ symbol_name(interface_name), $str_alt45$_Definition_Lock })));
                }
                {
                    SubLObject lock = subloop_structures.interface_definition_lock(v_interface);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        {
                            SubLObject v_interface_14 = v_interface;
                            SubLObject name = subloop_structures.interface_name(v_interface_14);
                            SubLObject parents = subloop_structures.interface_parents(v_interface_14);
                            try {
                                name = interface_name;
                                parents = copy_list(parent_interfaces);
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        subloop_structures._csetf_interface_name(v_interface_14, name);
                                        subloop_structures._csetf_interface_parents(v_interface_14, parents);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                        com.cyc.cycjava.cycl.interfaces.interfaces_compile_inheritance_path_from_above(v_interface);
                        thread.resetMultipleValues();
                        {
                            SubLObject new_class_method_decls = classes.class_separate_decls_into_class_and_instance_method_decls(method_decls);
                            SubLObject new_instance_method_decls = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject v_interface_15 = v_interface;
                                SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_15);
                                SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface_15);
                                try {
                                    class_method_decls = new_class_method_decls;
                                    instance_method_decls = new_instance_method_decls;
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            subloop_structures._csetf_interface_instance_method_decls(v_interface_15, instance_method_decls);
                                            subloop_structures._csetf_interface_class_method_decls(v_interface_15, class_method_decls);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                        com.cyc.cycjava.cycl.interfaces.interfaces_compile_instance_method_decls_from_above(v_interface);
                        com.cyc.cycjava.cycl.interfaces.interfaces_compile_class_method_decls_from_above(v_interface);
                        if (NIL == apriori_interface) {
                            com.cyc.cycjava.cycl.interfaces.interfaces_intern_interface(interface_name, v_interface);
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                return v_interface;
            }
        }
    }

    public static SubLObject new_interface(final SubLObject interface_name, SubLObject parent_interfaces, final SubLObject interface_properties, final SubLObject method_decls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!interface_name.isSymbol())) {
            Errors.error($str42$__Interface_names_must_be_a_symbo, interface_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == interface_name)) {
            Errors.error($str43$__Interface_names_must_not_be_NIL);
        }
        if (parent_interfaces.isSymbol() && (NIL != parent_interfaces)) {
            parent_interfaces = list(parent_interfaces);
        }
        interfaces_check_parent_interfaces(parent_interfaces);
        interfaces_must_be_valid_method_interface_decl_list(method_decls);
        SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        final SubLObject apriori_interface = (NIL != v_interface) ? T : NIL;
        if (NIL == v_interface) {
            v_interface = subloop_structures.make_interface(UNPROVIDED);
            subloop_structures._csetf_interface_definition_lock(v_interface, make_lock(cconcatenate($$$Interface_, new SubLObject[]{ symbol_name(interface_name), $$$_Definition_Lock })));
        }
        final SubLObject lock = subloop_structures.interface_definition_lock(v_interface);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject v_interface_$14 = v_interface;
            SubLObject name = subloop_structures.interface_name(v_interface_$14);
            SubLObject parents = subloop_structures.interface_parents(v_interface_$14);
            try {
                name = interface_name;
                parents = copy_list(parent_interfaces);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_interface_name(v_interface_$14, name);
                    subloop_structures._csetf_interface_parents(v_interface_$14, parents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            interfaces_compile_inheritance_path_from_above(v_interface);
            thread.resetMultipleValues();
            final SubLObject new_class_method_decls = classes.class_separate_decls_into_class_and_instance_method_decls(method_decls);
            final SubLObject new_instance_method_decls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject v_interface_$15 = v_interface;
            SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_$15);
            SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface_$15);
            try {
                class_method_decls = new_class_method_decls;
                instance_method_decls = new_instance_method_decls;
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    subloop_structures._csetf_interface_instance_method_decls(v_interface_$15, instance_method_decls);
                    subloop_structures._csetf_interface_class_method_decls(v_interface_$15, class_method_decls);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            interfaces_compile_instance_method_decls_from_above(v_interface);
            interfaces_compile_class_method_decls_from_above(v_interface);
            if (NIL == apriori_interface) {
                interfaces_intern_interface(interface_name, v_interface);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return v_interface;
    }

    public static final SubLObject interfaces_check_parent_interfaces_alt(SubLObject parent_interfaces) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!parent_interfaces.isList()) {
                    Errors.error($str_alt46$___S_is_not_a_valid_parent_interf, parent_interfaces);
                }
            }
            {
                SubLObject cdolist_list_var = parent_interfaces;
                SubLObject parent_interface = NIL;
                for (parent_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!(parent_interface.isSymbol() && (NIL != parent_interfaces))) {
                            Errors.error($str_alt47$___S_is_not_a_valid_parent_interf, parent_interface);
                        }
                    }
                    if (NIL == com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(parent_interface)) {
                        Errors.warn($str_alt48$__Parent_interface__S_is_undefine, parent_interface);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject interfaces_check_parent_interfaces(final SubLObject parent_interfaces) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!parent_interfaces.isList())) {
            Errors.error($str46$___S_is_not_a_valid_parent_interf, parent_interfaces);
        }
        SubLObject cdolist_list_var = parent_interfaces;
        SubLObject parent_interface = NIL;
        parent_interface = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!parent_interface.isSymbol()) || (NIL == parent_interfaces))) {
                Errors.error($str47$___S_is_not_a_valid_parent_interf, parent_interface);
            }
            if (NIL == interfaces_retrieve_interface(parent_interface)) {
                Errors.warn($str48$__Parent_interface__S_is_undefine, parent_interface);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent_interface = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject interfaces_must_be_valid_method_interface_decl_alt(SubLObject method_decl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == classes.classes_valid_method_interface_decl_p(method_decl)) {
                    Errors.error($str_alt49$___S_is_not_a_valid_interface_met, method_decl);
                }
            }
            return T;
        }
    }

    public static SubLObject interfaces_must_be_valid_method_interface_decl(final SubLObject method_decl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == classes.classes_valid_method_interface_decl_p(method_decl))) {
            Errors.error($str49$___S_is_not_a_valid_interface_met, method_decl);
        }
        return T;
    }

    public static final SubLObject interfaces_must_be_valid_method_interface_decl_list_alt(SubLObject method_decl_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!method_decl_list.isList()) {
                    Errors.error($str_alt50$___S_is_not_a_valid_interface_met, method_decl_list);
                }
            }
            {
                SubLObject cdolist_list_var = method_decl_list;
                SubLObject method_decl = NIL;
                for (method_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method_decl = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.interfaces.interfaces_must_be_valid_method_interface_decl(method_decl);
                }
            }
            return T;
        }
    }

    public static SubLObject interfaces_must_be_valid_method_interface_decl_list(final SubLObject method_decl_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!method_decl_list.isList())) {
            Errors.error($str50$___S_is_not_a_valid_interface_met, method_decl_list);
        }
        SubLObject cdolist_list_var = method_decl_list;
        SubLObject method_decl = NIL;
        method_decl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            interfaces_must_be_valid_method_interface_decl(method_decl);
            cdolist_list_var = cdolist_list_var.rest();
            method_decl = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject interfaces_add_interface_class_method_alt(SubLObject method_name, SubLObject interface_name, SubLObject method_properties, SubLObject lambda_list, SubLObject body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(interface_name);
                SubLObject result = NIL;
                method_properties = set_difference(method_properties, $interface_method_impossible_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                method_properties = set_difference(method_properties, $interface_method_required_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                if (NIL != v_interface) {
                    {
                        SubLObject v_interface_16 = v_interface;
                        SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface_16);
                        SubLObject local_class_methods = subloop_structures.interface_local_class_methods(v_interface_16);
                        try {
                            {
                                SubLObject method = methods.method_assoc(method_name, local_class_methods);
                                SubLObject method_decl_location = member(method_name, compiled_class_method_decls, symbol_function(EQ), symbol_function(CADR));
                                SubLObject method_decl = (NIL != method_decl_location) ? ((SubLObject) (method_decl_location.first())) : NIL;
                                if (NIL != method) {
                                    subloop_structures._csetf_method_class_name(method, interface_name);
                                    subloop_structures._csetf_method_lambda_list(method, copy_tree(lambda_list));
                                    subloop_structures._csetf_method_body(method, copy_tree(body));
                                    subloop_structures._csetf_method_protection(method, methods.methods_protection_level_of_method_decl(method_properties));
                                    subloop_structures._csetf_method_scope(method, methods.methods_scope_level_of_method_decl(method_properties));
                                    subloop_structures._csetf_method_update_type(method, methods.methods_update_type_of_method_decl(method_properties));
                                    result = method;
                                } else {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == method_decl) {
                                            Errors.error($undeclare_method_name_message$.getGlobalValue(), method_name, interface_name);
                                        }
                                    }
                                    {
                                        SubLObject new_method = methods.new_method(method_name, interface_name, lambda_list);
                                        subloop_structures._csetf_method_body(new_method, copy_tree(body));
                                        subloop_structures._csetf_method_protection(new_method, methods.methods_protection_level_of_method_decl(method_properties));
                                        subloop_structures._csetf_method_scope(new_method, methods.methods_scope_level_of_method_decl(method_properties));
                                        subloop_structures._csetf_method_update_type(new_method, methods.methods_update_type_of_method_decl(method_properties));
                                        local_class_methods = nconc(local_class_methods, list(new_method));
                                        result = new_method;
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    subloop_structures._csetf_interface_compiled_class_method_decls(v_interface_16, compiled_class_method_decls);
                                    subloop_structures._csetf_interface_local_class_methods(v_interface_16, local_class_methods);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject interfaces_add_interface_class_method(final SubLObject method_name, final SubLObject interface_name, SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        SubLObject result = NIL;
        method_properties = set_difference(method_properties, $interface_method_impossible_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        method_properties = set_difference(method_properties, $interface_method_required_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        if (NIL != v_interface) {
            final SubLObject v_interface_$16 = v_interface;
            final SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls(v_interface_$16);
            SubLObject local_class_methods = subloop_structures.interface_local_class_methods(v_interface_$16);
            try {
                final SubLObject method = methods.method_assoc(method_name, local_class_methods);
                final SubLObject method_decl_location = member(method_name, compiled_class_method_decls, symbol_function(EQ), symbol_function(CADR));
                final SubLObject method_decl = (NIL != method_decl_location) ? method_decl_location.first() : NIL;
                if (NIL != method) {
                    subloop_structures._csetf_method_class_name(method, interface_name);
                    subloop_structures._csetf_method_lambda_list(method, copy_tree(lambda_list));
                    subloop_structures._csetf_method_body(method, copy_tree(body));
                    subloop_structures._csetf_method_protection(method, methods.methods_protection_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_scope(method, methods.methods_scope_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_update_type(method, methods.methods_update_type_of_method_decl(method_properties));
                    result = method;
                } else {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == method_decl)) {
                        Errors.error($undeclare_method_name_message$.getGlobalValue(), method_name, interface_name);
                    }
                    final SubLObject new_method = methods.new_method(method_name, interface_name, lambda_list);
                    subloop_structures._csetf_method_body(new_method, copy_tree(body));
                    subloop_structures._csetf_method_protection(new_method, methods.methods_protection_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_scope(new_method, methods.methods_scope_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_update_type(new_method, methods.methods_update_type_of_method_decl(method_properties));
                    local_class_methods = nconc(local_class_methods, list(new_method));
                    result = new_method;
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_interface_compiled_class_method_decls(v_interface_$16, compiled_class_method_decls);
                    subloop_structures._csetf_interface_local_class_methods(v_interface_$16, local_class_methods);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return result;
    }

    public static final SubLObject expand_def_class_method_template_alt(SubLObject method_name, SubLObject interface_name, SubLObject method_properties, SubLObject lambda_list, SubLObject body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != method_name) && method_name.isSymbol())) {
                    Errors.error($invalid_interface_method_name_message$.getGlobalValue(), method_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != interface_name) && interface_name.isSymbol())) {
                    Errors.error($invalid_interface_name_message$.getGlobalValue(), interface_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == classes.classes_valid_lambda_list_p(lambda_list)) {
                    Errors.error($invalid_lambda_list_message$.getGlobalValue(), lambda_list, method_name, interface_name);
                }
            }
            {
                SubLObject preprocessed_body = (body.isCons() && body.first().isString()) ? ((SubLObject) (body.rest())) : body;
                SubLObject v_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(interface_name);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == v_interface) {
                        Errors.error($non_existing_interface_message$.getGlobalValue(), v_interface);
                    }
                }
                com.cyc.cycjava.cycl.interfaces.interfaces_add_interface_class_method(method_name, interface_name, method_properties, lambda_list, preprocessed_body);
                return list(INTERFACES_ADD_INTERFACE_CLASS_METHOD, list(QUOTE, method_name), list(QUOTE, interface_name), list(QUOTE, method_properties), list(QUOTE, copy_tree(lambda_list)), list(QUOTE, copy_tree(preprocessed_body)));
            }
        }
    }

    public static SubLObject expand_def_class_method_template(final SubLObject method_name, final SubLObject interface_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == method_name) || (!method_name.isSymbol()))) {
            Errors.error($invalid_interface_method_name_message$.getGlobalValue(), method_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == interface_name) || (!interface_name.isSymbol()))) {
            Errors.error($invalid_interface_name_message$.getGlobalValue(), interface_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == classes.classes_valid_lambda_list_p(lambda_list))) {
            Errors.error($invalid_lambda_list_message$.getGlobalValue(), lambda_list, method_name, interface_name);
        }
        final SubLObject preprocessed_body = (body.isCons() && body.first().isString()) ? body.rest() : body;
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == v_interface)) {
            Errors.error($non_existing_interface_message$.getGlobalValue(), v_interface);
        }
        interfaces_add_interface_class_method(method_name, interface_name, method_properties, lambda_list, preprocessed_body);
        return list(INTERFACES_ADD_INTERFACE_CLASS_METHOD, list(QUOTE, method_name), list(QUOTE, interface_name), list(QUOTE, method_properties), list(QUOTE, copy_tree(lambda_list)), list(QUOTE, copy_tree(preprocessed_body)));
    }

    public static final SubLObject def_class_method_template_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method_name = NIL;
                    SubLObject interface_name = NIL;
                    SubLObject method_properties = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    method_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    interface_name = current.first();
                    current = current.rest();
                    method_properties = current;
                    current = temp;
                    {
                        SubLObject lambda_list = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt57);
                        lambda_list = current.first();
                        current = current.rest();
                        {
                            SubLObject body = current;
                            return com.cyc.cycjava.cycl.interfaces.expand_def_class_method_template(method_name, interface_name, method_properties, lambda_list, body);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject def_class_method_template(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = NIL;
        SubLObject interface_name = NIL;
        SubLObject method_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        method_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        interface_name = current.first();
        current = method_properties = current.rest();
        current = temp;
        SubLObject lambda_list = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        lambda_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        return expand_def_class_method_template(method_name, interface_name, method_properties, lambda_list, body);
    }

    public static final SubLObject interfaces_add_interface_instance_method_alt(SubLObject method_name, SubLObject interface_name, SubLObject method_properties, SubLObject lambda_list, SubLObject body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(interface_name);
                SubLObject result = NIL;
                method_properties = set_difference(method_properties, $interface_method_impossible_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                method_properties = set_difference(method_properties, $interface_method_required_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                if (NIL != v_interface) {
                    {
                        SubLObject v_interface_17 = v_interface;
                        SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface_17);
                        SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface_17);
                        try {
                            {
                                SubLObject method = methods.method_assoc(method_name, local_instance_methods);
                                SubLObject method_decl_location = member(method_name, compiled_instance_method_decls, symbol_function(EQ), symbol_function(CADR));
                                SubLObject method_decl = (NIL != method_decl_location) ? ((SubLObject) (method_decl_location.first())) : NIL;
                                if (NIL != method) {
                                    subloop_structures._csetf_method_class_name(method, interface_name);
                                    subloop_structures._csetf_method_lambda_list(method, copy_tree(lambda_list));
                                    subloop_structures._csetf_method_body(method, copy_tree(body));
                                    subloop_structures._csetf_method_protection(method, methods.methods_protection_level_of_method_decl(method_properties));
                                    subloop_structures._csetf_method_scope(method, methods.methods_scope_level_of_method_decl(method_properties));
                                    subloop_structures._csetf_method_update_type(method, methods.methods_update_type_of_method_decl(method_properties));
                                    result = method;
                                } else {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == method_decl) {
                                            Errors.error($undeclare_method_name_message$.getGlobalValue(), method_name, interface_name);
                                        }
                                    }
                                    {
                                        SubLObject new_method = methods.new_method(method_name, interface_name, lambda_list);
                                        subloop_structures._csetf_method_body(new_method, copy_tree(body));
                                        subloop_structures._csetf_method_protection(new_method, methods.methods_protection_level_of_method_decl(method_properties));
                                        subloop_structures._csetf_method_scope(new_method, methods.methods_scope_level_of_method_decl(method_properties));
                                        subloop_structures._csetf_method_update_type(new_method, methods.methods_update_type_of_method_decl(method_properties));
                                        local_instance_methods = nconc(local_instance_methods, list(new_method));
                                        result = new_method;
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    subloop_structures._csetf_interface_compiled_instance_method_decls(v_interface_17, compiled_instance_method_decls);
                                    subloop_structures._csetf_interface_local_instance_methods(v_interface_17, local_instance_methods);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject interfaces_add_interface_instance_method(final SubLObject method_name, final SubLObject interface_name, SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        SubLObject result = NIL;
        method_properties = set_difference(method_properties, $interface_method_impossible_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        method_properties = set_difference(method_properties, $interface_method_required_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        if (NIL != v_interface) {
            final SubLObject v_interface_$17 = v_interface;
            final SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls(v_interface_$17);
            SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface_$17);
            try {
                final SubLObject method = methods.method_assoc(method_name, local_instance_methods);
                final SubLObject method_decl_location = member(method_name, compiled_instance_method_decls, symbol_function(EQ), symbol_function(CADR));
                final SubLObject method_decl = (NIL != method_decl_location) ? method_decl_location.first() : NIL;
                if (NIL != method) {
                    subloop_structures._csetf_method_class_name(method, interface_name);
                    subloop_structures._csetf_method_lambda_list(method, copy_tree(lambda_list));
                    subloop_structures._csetf_method_body(method, copy_tree(body));
                    subloop_structures._csetf_method_protection(method, methods.methods_protection_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_scope(method, methods.methods_scope_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_update_type(method, methods.methods_update_type_of_method_decl(method_properties));
                    result = method;
                } else {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == method_decl)) {
                        Errors.error($undeclare_method_name_message$.getGlobalValue(), method_name, interface_name);
                    }
                    final SubLObject new_method = methods.new_method(method_name, interface_name, lambda_list);
                    subloop_structures._csetf_method_body(new_method, copy_tree(body));
                    subloop_structures._csetf_method_protection(new_method, methods.methods_protection_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_scope(new_method, methods.methods_scope_level_of_method_decl(method_properties));
                    subloop_structures._csetf_method_update_type(new_method, methods.methods_update_type_of_method_decl(method_properties));
                    local_instance_methods = nconc(local_instance_methods, list(new_method));
                    result = new_method;
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_interface_compiled_instance_method_decls(v_interface_$17, compiled_instance_method_decls);
                    subloop_structures._csetf_interface_local_instance_methods(v_interface_$17, local_instance_methods);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return result;
    }

    public static final SubLObject expand_def_instance_method_template_alt(SubLObject method_name, SubLObject interface_name, SubLObject method_properties, SubLObject lambda_list, SubLObject body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != method_name) && method_name.isSymbol())) {
                    Errors.error($invalid_interface_method_name_message$.getGlobalValue(), method_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != interface_name) && interface_name.isSymbol())) {
                    Errors.error($invalid_interface_name_message$.getGlobalValue(), interface_name);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == classes.classes_valid_lambda_list_p(lambda_list)) {
                    Errors.error($invalid_lambda_list_message$.getGlobalValue(), lambda_list, method_name, interface_name);
                }
            }
            {
                SubLObject preprocessed_body = (body.isCons() && body.first().isString()) ? ((SubLObject) (body.rest())) : body;
                SubLObject v_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(interface_name);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == v_interface) {
                        Errors.error($non_existing_interface_message$.getGlobalValue(), v_interface);
                    }
                }
                com.cyc.cycjava.cycl.interfaces.interfaces_add_interface_instance_method(method_name, interface_name, method_properties, lambda_list, preprocessed_body);
                return list(INTERFACES_ADD_INTERFACE_INSTANCE_METHOD, list(QUOTE, method_name), list(QUOTE, interface_name), list(QUOTE, method_properties), list(QUOTE, copy_tree(lambda_list)), list(QUOTE, copy_tree(preprocessed_body)));
            }
        }
    }

    public static SubLObject expand_def_instance_method_template(final SubLObject method_name, final SubLObject interface_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == method_name) || (!method_name.isSymbol()))) {
            Errors.error($invalid_interface_method_name_message$.getGlobalValue(), method_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == interface_name) || (!interface_name.isSymbol()))) {
            Errors.error($invalid_interface_name_message$.getGlobalValue(), interface_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == classes.classes_valid_lambda_list_p(lambda_list))) {
            Errors.error($invalid_lambda_list_message$.getGlobalValue(), lambda_list, method_name, interface_name);
        }
        final SubLObject preprocessed_body = (body.isCons() && body.first().isString()) ? body.rest() : body;
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == v_interface)) {
            Errors.error($non_existing_interface_message$.getGlobalValue(), v_interface);
        }
        interfaces_add_interface_instance_method(method_name, interface_name, method_properties, lambda_list, preprocessed_body);
        return list(INTERFACES_ADD_INTERFACE_INSTANCE_METHOD, list(QUOTE, method_name), list(QUOTE, interface_name), list(QUOTE, method_properties), list(QUOTE, copy_tree(lambda_list)), list(QUOTE, copy_tree(preprocessed_body)));
    }

    public static final SubLObject def_instance_method_template_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method_name = NIL;
                    SubLObject interface_name = NIL;
                    SubLObject method_properties = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    method_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    interface_name = current.first();
                    current = current.rest();
                    method_properties = current;
                    current = temp;
                    {
                        SubLObject lambda_list = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt57);
                        lambda_list = current.first();
                        current = current.rest();
                        {
                            SubLObject body = current;
                            return com.cyc.cycjava.cycl.interfaces.expand_def_instance_method_template(method_name, interface_name, method_properties, lambda_list, body);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject def_instance_method_template(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = NIL;
        SubLObject interface_name = NIL;
        SubLObject method_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        method_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        interface_name = current.first();
        current = method_properties = current.rest();
        current = temp;
        SubLObject lambda_list = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        lambda_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        return expand_def_instance_method_template(method_name, interface_name, method_properties, lambda_list, body);
    }

    public static final SubLObject interfaces_find_class_method_internal_alt(SubLObject method_name, SubLObject v_interface) {
        if (NIL != com.cyc.cycjava.cycl.interfaces.interfaces_marked_p(v_interface, $INTERFACES_FIND_CLASS_METHOD_INTERNAL)) {
            return NIL;
        }
        if (NIL != v_interface) {
            {
                SubLObject v_interface_18 = v_interface;
                SubLObject parents = subloop_structures.interface_parents(v_interface_18);
                SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface_18);
                SubLObject method = methods.method_assoc(method_name, local_instance_methods);
                if (NIL != method) {
                    return method;
                } else {
                    {
                        SubLObject parent_interface = NIL;
                        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(v_interface, $INTERFACES_FIND_CLASS_METHOD_INTERNAL);
                        {
                            SubLObject cdolist_list_var = parents;
                            SubLObject parent_interface_name = NIL;
                            for (parent_interface_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface_name = cdolist_list_var.first()) {
                                parent_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(parent_interface_name);
                                if (NIL != parent_interface) {
                                    method = com.cyc.cycjava.cycl.interfaces.interfaces_find_class_method_internal(method_name, parent_interface);
                                    if (NIL != method) {
                                        return method;
                                    }
                                }
                            }
                        }
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject interfaces_find_class_method_internal(final SubLObject method_name, final SubLObject v_interface) {
        if (NIL != interfaces_marked_p(v_interface, $INTERFACES_FIND_CLASS_METHOD_INTERNAL)) {
            return NIL;
        }
        if (NIL == v_interface) {
            return NIL;
        }
        final SubLObject parents = subloop_structures.interface_parents(v_interface);
        final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface);
        SubLObject method = methods.method_assoc(method_name, local_instance_methods);
        if (NIL != method) {
            return method;
        }
        SubLObject parent_interface = NIL;
        interfaces_mark_interface(v_interface, $INTERFACES_FIND_CLASS_METHOD_INTERNAL);
        SubLObject cdolist_list_var = parents;
        SubLObject parent_interface_name = NIL;
        parent_interface_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            parent_interface = interfaces_retrieve_interface(parent_interface_name);
            if (NIL != parent_interface) {
                method = interfaces_find_class_method_internal(method_name, parent_interface);
                if (NIL != method) {
                    return method;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent_interface_name = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject interfaces_find_class_method_alt(SubLObject method_name, SubLObject interface_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject v_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(interface_name);
                {
                    SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
                    try {
                        $interfaces_marked_interfaces$.bind(NIL, thread);
                        try {
                            result = com.cyc.cycjava.cycl.interfaces.interfaces_find_class_method_internal(method_name, v_interface);
                        } finally {
                            {
                                SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    com.cyc.cycjava.cycl.interfaces.interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                }
                            }
                        }
                    } finally {
                        $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject interfaces_find_class_method(final SubLObject method_name, final SubLObject interface_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
        try {
            $interfaces_marked_interfaces$.bind(NIL, thread);
            try {
                result = interfaces_find_class_method_internal(method_name, v_interface);
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject interfaces_find_instance_method_internal_alt(SubLObject method_name, SubLObject v_interface) {
        if (NIL != com.cyc.cycjava.cycl.interfaces.interfaces_marked_p(v_interface, $INTERFACES_FIND_INSTANCE_METHOD_INTERNAL)) {
            return NIL;
        }
        if (NIL != v_interface) {
            {
                SubLObject v_interface_20 = v_interface;
                SubLObject parents = subloop_structures.interface_parents(v_interface_20);
                SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface_20);
                SubLObject method = methods.method_assoc(method_name, local_instance_methods);
                if (NIL != method) {
                    return method;
                } else {
                    {
                        SubLObject parent_interface = NIL;
                        com.cyc.cycjava.cycl.interfaces.interfaces_mark_interface(v_interface, $INTERFACES_FIND_INSTANCE_METHOD_INTERNAL);
                        {
                            SubLObject cdolist_list_var = parents;
                            SubLObject parent_interface_name = NIL;
                            for (parent_interface_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface_name = cdolist_list_var.first()) {
                                parent_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(parent_interface_name);
                                if (NIL != parent_interface) {
                                    method = com.cyc.cycjava.cycl.interfaces.interfaces_find_instance_method_internal(method_name, parent_interface);
                                    if (NIL != method) {
                                        return method;
                                    }
                                }
                            }
                        }
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject interfaces_find_instance_method_internal(final SubLObject method_name, final SubLObject v_interface) {
        if (NIL != interfaces_marked_p(v_interface, $INTERFACES_FIND_INSTANCE_METHOD_INTERNAL)) {
            return NIL;
        }
        if (NIL == v_interface) {
            return NIL;
        }
        final SubLObject parents = subloop_structures.interface_parents(v_interface);
        final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods(v_interface);
        SubLObject method = methods.method_assoc(method_name, local_instance_methods);
        if (NIL != method) {
            return method;
        }
        SubLObject parent_interface = NIL;
        interfaces_mark_interface(v_interface, $INTERFACES_FIND_INSTANCE_METHOD_INTERNAL);
        SubLObject cdolist_list_var = parents;
        SubLObject parent_interface_name = NIL;
        parent_interface_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            parent_interface = interfaces_retrieve_interface(parent_interface_name);
            if (NIL != parent_interface) {
                method = interfaces_find_instance_method_internal(method_name, parent_interface);
                if (NIL != method) {
                    return method;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parent_interface_name = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject interfaces_find_instance_method_alt(SubLObject method_name, SubLObject interface_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject v_interface = com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(interface_name);
                {
                    SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
                    try {
                        $interfaces_marked_interfaces$.bind(NIL, thread);
                        try {
                            result = com.cyc.cycjava.cycl.interfaces.interfaces_find_instance_method_internal(method_name, v_interface);
                        } finally {
                            {
                                SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    com.cyc.cycjava.cycl.interfaces.interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                }
                            }
                        }
                    } finally {
                        $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject interfaces_find_instance_method(final SubLObject method_name, final SubLObject interface_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject v_interface = interfaces_retrieve_interface(interface_name);
        final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding(thread);
        try {
            $interfaces_marked_interfaces$.bind(NIL, thread);
            try {
                result = interfaces_find_instance_method_internal(method_name, v_interface);
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    interfaces_unmark_all_marked_interfaces($interfaces_marked_interfaces$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            $interfaces_marked_interfaces$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject interfaces_class_method_to_listed_def_class_method_alt(SubLObject true_class_name, SubLObject method) {
        if (NIL != subloop_structures.method_p(method)) {
            {
                SubLObject method_22 = method;
                SubLObject name = subloop_structures.method_name(method_22);
                SubLObject lambda_list = subloop_structures.method_lambda_list(method_22);
                SubLObject body = subloop_structures.method_body(method_22);
                SubLObject protection = subloop_structures.method_protection(method_22);
                SubLObject scope = subloop_structures.method_scope(method_22);
                SubLObject update_type = subloop_structures.method_update_type(method_22);
                SubLObject before_listeners = subloop_structures.method_before_listeners(method_22);
                SubLObject after_listeners = subloop_structures.method_after_listeners(method_22);
                return list(listS(DEF_CLASS_METHOD, listS(name, true_class_name, append(new SubLObject[]{ NIL != protection ? ((SubLObject) (list(protection))) : NIL, NIL != scope ? ((SubLObject) (list(scope))) : NIL, NIL != update_type ? ((SubLObject) (list(update_type))) : NIL, NIL != before_listeners ? ((SubLObject) (list($BEFORE_LISTENERS))) : NIL, NIL != after_listeners ? ((SubLObject) (list($AFTER_LISTENERS))) : NIL, NIL })), copy_tree(lambda_list), append(copy_tree(body), NIL)));
            }
        }
        return NIL;
    }

    public static SubLObject interfaces_class_method_to_listed_def_class_method(final SubLObject true_class_name, final SubLObject method) {
        if (NIL != subloop_structures.method_p(method)) {
            final SubLObject name = subloop_structures.method_name(method);
            final SubLObject lambda_list = subloop_structures.method_lambda_list(method);
            final SubLObject body = subloop_structures.method_body(method);
            final SubLObject protection = subloop_structures.method_protection(method);
            final SubLObject scope = subloop_structures.method_scope(method);
            final SubLObject update_type = subloop_structures.method_update_type(method);
            final SubLObject before_listeners = subloop_structures.method_before_listeners(method);
            final SubLObject after_listeners = subloop_structures.method_after_listeners(method);
            return list(listS(DEF_CLASS_METHOD, listS(name, true_class_name, append(new SubLObject[]{ NIL != protection ? list(protection) : NIL, NIL != scope ? list(scope) : NIL, NIL != update_type ? list(update_type) : NIL, NIL != before_listeners ? list($BEFORE_LISTENERS) : NIL, NIL != after_listeners ? list($AFTER_LISTENERS) : NIL, NIL })), copy_tree(lambda_list), append(copy_tree(body), NIL)));
        }
        return NIL;
    }

    public static final SubLObject interfaces_instance_method_to_listed_def_instance_method_alt(SubLObject true_class_name, SubLObject method) {
        if (NIL != subloop_structures.method_p(method)) {
            {
                SubLObject method_23 = method;
                SubLObject name = subloop_structures.method_name(method_23);
                SubLObject lambda_list = subloop_structures.method_lambda_list(method_23);
                SubLObject body = subloop_structures.method_body(method_23);
                SubLObject protection = subloop_structures.method_protection(method_23);
                SubLObject scope = subloop_structures.method_scope(method_23);
                SubLObject update_type = subloop_structures.method_update_type(method_23);
                SubLObject before_listeners = subloop_structures.method_before_listeners(method_23);
                SubLObject after_listeners = subloop_structures.method_after_listeners(method_23);
                return list(listS(DEF_INSTANCE_METHOD, listS(name, true_class_name, append(new SubLObject[]{ NIL != protection ? ((SubLObject) (list(protection))) : NIL, NIL != scope ? ((SubLObject) (list(scope))) : NIL, NIL != update_type ? ((SubLObject) (list(update_type))) : NIL, NIL != before_listeners ? ((SubLObject) (list($BEFORE_LISTENERS))) : NIL, NIL != after_listeners ? ((SubLObject) (list($AFTER_LISTENERS))) : NIL, NIL })), copy_tree(lambda_list), append(copy_tree(body), NIL)));
            }
        }
        return NIL;
    }

    public static SubLObject interfaces_instance_method_to_listed_def_instance_method(final SubLObject true_class_name, final SubLObject method) {
        if (NIL != subloop_structures.method_p(method)) {
            final SubLObject name = subloop_structures.method_name(method);
            final SubLObject lambda_list = subloop_structures.method_lambda_list(method);
            final SubLObject body = subloop_structures.method_body(method);
            final SubLObject protection = subloop_structures.method_protection(method);
            final SubLObject scope = subloop_structures.method_scope(method);
            final SubLObject update_type = subloop_structures.method_update_type(method);
            final SubLObject before_listeners = subloop_structures.method_before_listeners(method);
            final SubLObject after_listeners = subloop_structures.method_after_listeners(method);
            return list(listS(DEF_INSTANCE_METHOD, listS(name, true_class_name, append(new SubLObject[]{ NIL != protection ? list(protection) : NIL, NIL != scope ? list(scope) : NIL, NIL != update_type ? list(update_type) : NIL, NIL != before_listeners ? list($BEFORE_LISTENERS) : NIL, NIL != after_listeners ? list($AFTER_LISTENERS) : NIL, NIL })), copy_tree(lambda_list), append(copy_tree(body), NIL)));
        }
        return NIL;
    }

    public static final SubLObject interfaces_implements_p_alt(SubLObject target_interface, SubLObject parent_interface) {
        {
            SubLObject target = (NIL != subloop_structures.interface_p(target_interface)) ? ((SubLObject) (target_interface)) : target_interface.isSymbol() ? ((SubLObject) (com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(target_interface))) : NIL;
            SubLObject parent = (NIL != subloop_structures.interface_p(parent_interface)) ? ((SubLObject) (parent_interface)) : parent_interface.isSymbol() ? ((SubLObject) (com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(parent_interface))) : NIL;
            return (target == parent) || (NIL != member(parent, subloop_structures.interface_compiled_inheritance_path(target), UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (T)) : NIL;
        }
    }

    public static SubLObject interfaces_implements_p(final SubLObject target_interface, final SubLObject parent_interface) {
        final SubLObject target = (NIL != subloop_structures.interface_p(target_interface)) ? target_interface : target_interface.isSymbol() ? interfaces_retrieve_interface(target_interface) : NIL;
        final SubLObject parent = (NIL != subloop_structures.interface_p(parent_interface)) ? parent_interface : parent_interface.isSymbol() ? interfaces_retrieve_interface(parent_interface) : NIL;
        return target.eql(parent) || (NIL != member(parent, subloop_structures.interface_compiled_inheritance_path(target), UNPROVIDED, UNPROVIDED)) ? T : NIL;
    }

    public static final SubLObject interfaces_collect_method_decls_alt(SubLObject v_interfaces) {
        {
            SubLObject all_class_method_decls = NIL;
            SubLObject all_instance_method_decls = NIL;
            SubLObject cdolist_list_var = v_interfaces;
            SubLObject v_interface = NIL;
            for (v_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_interface = cdolist_list_var.first()) {
                if (NIL != subloop_structures.interface_p(v_interface)) {
                    {
                        SubLObject v_interface_24 = v_interface;
                        SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_24);
                        SubLObject class_method_decls = subloop_structures.interface_class_method_decls(v_interface_24);
                        {
                            SubLObject cdolist_list_var_25 = class_method_decls;
                            SubLObject class_method_decl = NIL;
                            for (class_method_decl = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , class_method_decl = cdolist_list_var_25.first()) {
                                if (NIL == member(cadr(class_method_decl), all_class_method_decls, symbol_function(EQ), symbol_function(CADR))) {
                                    all_class_method_decls = cons(class_method_decl, all_class_method_decls);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var_26 = instance_method_decls;
                            SubLObject instance_method_decl = NIL;
                            for (instance_method_decl = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , instance_method_decl = cdolist_list_var_26.first()) {
                                if (NIL == member(cadr(instance_method_decl), all_instance_method_decls, symbol_function(EQ), symbol_function(CADR))) {
                                    all_instance_method_decls = cons(instance_method_decl, all_instance_method_decls);
                                }
                            }
                        }
                    }
                }
            }
            return values(nreverse(all_class_method_decls), nreverse(all_instance_method_decls));
        }
    }

    public static SubLObject interfaces_collect_method_decls(final SubLObject v_interfaces) {
        SubLObject all_class_method_decls = NIL;
        SubLObject all_instance_method_decls = NIL;
        SubLObject cdolist_list_var = v_interfaces;
        SubLObject v_interface = NIL;
        v_interface = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subloop_structures.interface_p(v_interface)) {
                final SubLObject v_interface_$24 = v_interface;
                final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls(v_interface_$24);
                SubLObject cdolist_list_var_$25;
                final SubLObject class_method_decls = cdolist_list_var_$25 = subloop_structures.interface_class_method_decls(v_interface_$24);
                SubLObject class_method_decl = NIL;
                class_method_decl = cdolist_list_var_$25.first();
                while (NIL != cdolist_list_var_$25) {
                    if (NIL == member(cadr(class_method_decl), all_class_method_decls, symbol_function(EQ), symbol_function(CADR))) {
                        all_class_method_decls = cons(class_method_decl, all_class_method_decls);
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    class_method_decl = cdolist_list_var_$25.first();
                } 
                SubLObject cdolist_list_var_$26 = instance_method_decls;
                SubLObject instance_method_decl = NIL;
                instance_method_decl = cdolist_list_var_$26.first();
                while (NIL != cdolist_list_var_$26) {
                    if (NIL == member(cadr(instance_method_decl), all_instance_method_decls, symbol_function(EQ), symbol_function(CADR))) {
                        all_instance_method_decls = cons(instance_method_decl, all_instance_method_decls);
                    }
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    instance_method_decl = cdolist_list_var_$26.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_interface = cdolist_list_var.first();
        } 
        return values(nreverse(all_class_method_decls), nreverse(all_instance_method_decls));
    }

    public static final SubLObject subloop_all_methods_of_interface_alt(SubLObject v_interface) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject actual_interface = (v_interface.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(v_interface))) : NIL != subloop_structures.interface_p(v_interface) ? ((SubLObject) (v_interface)) : NIL;
                SubLObject v_methods = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == actual_interface) {
                        Errors.error($str_alt65$SUBLOOP_ALL_METHODS_OF_INTERFACE_, v_interface);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject class_method_decls = com.cyc.cycjava.cycl.interfaces.interfaces_collect_method_decls(list(actual_interface));
                    SubLObject instance_method_decls = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject list_expression = nconc(class_method_decls, instance_method_decls);
                        if (NIL == list_expression) {
                            v_methods = NIL;
                        } else {
                            if (list_expression.isAtom()) {
                                v_methods = list(list_expression);
                            } else {
                                if (NIL == list_expression.rest()) {
                                    {
                                        SubLObject method_decl = list_expression.first();
                                        v_methods = (method_decl.isCons() && method_decl.rest().isCons()) ? ((SubLObject) (list(cadr(method_decl)))) : NIL;
                                    }
                                } else {
                                    {
                                        SubLObject tail_cons = NIL;
                                        SubLObject result = NIL;
                                        v_methods = NIL;
                                        {
                                            SubLObject cdolist_list_var = list_expression;
                                            SubLObject method_decl = NIL;
                                            for (method_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method_decl = cdolist_list_var.first()) {
                                                result = (method_decl.isCons() && method_decl.rest().isCons()) ? ((SubLObject) (list(cadr(method_decl)))) : NIL;
                                                if (NIL != result) {
                                                    if (NIL != tail_cons) {
                                                        rplacd(tail_cons, result);
                                                        tail_cons = last(result, UNPROVIDED);
                                                    } else {
                                                        v_methods = (method_decl.isCons() && method_decl.rest().isCons()) ? ((SubLObject) (list(cadr(method_decl)))) : NIL;
                                                        tail_cons = last(v_methods, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return v_methods;
            }
        }
    }

    public static SubLObject subloop_all_methods_of_interface(final SubLObject v_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject actual_interface = (v_interface.isSymbol()) ? interfaces_retrieve_interface(v_interface) : NIL != subloop_structures.interface_p(v_interface) ? v_interface : NIL;
        SubLObject v_methods = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == actual_interface)) {
            Errors.error($str65$SUBLOOP_ALL_METHODS_OF_INTERFACE_, v_interface);
        }
        thread.resetMultipleValues();
        final SubLObject class_method_decls = interfaces_collect_method_decls(list(actual_interface));
        final SubLObject instance_method_decls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject list_expression = nconc(class_method_decls, instance_method_decls);
        if (NIL == list_expression) {
            v_methods = NIL;
        } else
            if (list_expression.isAtom()) {
                v_methods = list(list_expression);
            } else
                if (NIL == list_expression.rest()) {
                    final SubLObject method_decl = list_expression.first();
                    v_methods = (method_decl.isCons() && method_decl.rest().isCons()) ? list(cadr(method_decl)) : NIL;
                } else {
                    SubLObject tail_cons = NIL;
                    SubLObject result = NIL;
                    v_methods = NIL;
                    SubLObject cdolist_list_var = list_expression;
                    SubLObject method_decl2 = NIL;
                    method_decl2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = (method_decl2.isCons() && method_decl2.rest().isCons()) ? list(cadr(method_decl2)) : NIL;
                        if (NIL != result) {
                            if (NIL != tail_cons) {
                                rplacd(tail_cons, result);
                                tail_cons = last(result, UNPROVIDED);
                            } else {
                                v_methods = (method_decl2.isCons() && method_decl2.rest().isCons()) ? list(cadr(method_decl2)) : NIL;
                                tail_cons = last(v_methods, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        method_decl2 = cdolist_list_var.first();
                    } 
                }


        return v_methods;
    }

    public static final SubLObject interface_get_property_internal_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_interface = NIL;
            SubLObject indicator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt66);
            v_interface = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt66);
            indicator = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CLASSES_GETF, list(INTERFACE_PLIST, v_interface), indicator);
            } else {
                cdestructuring_bind_error(datum, $list_alt66);
            }
        }
        return NIL;
    }

    public static SubLObject interface_get_property_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_interface = NIL;
        SubLObject indicator = NIL;
        destructuring_bind_must_consp(current, datum, $list66);
        v_interface = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list66);
        indicator = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CLASSES_GETF, list(INTERFACE_PLIST, v_interface), indicator);
        }
        cdestructuring_bind_error(datum, $list66);
        return NIL;
    }

    public static final SubLObject interface_get_property_alt(SubLObject v_interface, SubLObject indicator) {
        if (NIL != subloop_structures.interface_p(v_interface)) {
            return classes.classes_getf(subloop_structures.interface_plist(v_interface), indicator);
        }
        return NIL;
    }

    public static SubLObject interface_get_property(final SubLObject v_interface, final SubLObject indicator) {
        if (NIL != subloop_structures.interface_p(v_interface)) {
            return classes.classes_getf(subloop_structures.interface_plist(v_interface), indicator);
        }
        return NIL;
    }

    public static final SubLObject interface_set_property_internal_alt(SubLObject v_interface, SubLObject indicator, SubLObject value) {
        {
            SubLObject interface_var = make_symbol($$$interface);
            return list(CLET, list(list(interface_var, v_interface)), list(CSETF, list(INTERFACE_PLIST, interface_var), list(CLASSES_PUTF, list(INTERFACE_PLIST, interface_var), indicator, value)));
        }
    }

    public static SubLObject interface_set_property_internal(final SubLObject v_interface, final SubLObject indicator, final SubLObject value) {
        final SubLObject interface_var = make_symbol($$$interface);
        return list(CLET, list(list(interface_var, v_interface)), list(CSETF, list(INTERFACE_PLIST, interface_var), list(CLASSES_PUTF, list(INTERFACE_PLIST, interface_var), indicator, value)));
    }

    public static final SubLObject interface_set_property_alt(SubLObject v_interface, SubLObject indicator, SubLObject value) {
        if (NIL != subloop_structures.interface_p(v_interface)) {
            com.cyc.cycjava.cycl.interfaces.interface_set_property_internal(v_interface, indicator, value);
            return value;
        }
        return NIL;
    }

    public static SubLObject interface_set_property(final SubLObject v_interface, final SubLObject indicator, final SubLObject value) {
        if (NIL != subloop_structures.interface_p(v_interface)) {
            interface_set_property_internal(v_interface, indicator, value);
            return value;
        }
        return NIL;
    }

    public static final SubLObject subloop_all_classes_implementing_interface_alt(SubLObject v_interface) {
        {
            SubLObject actual_interface = (v_interface.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(v_interface))) : NIL != subloop_structures.interface_p(v_interface) ? ((SubLObject) (v_interface)) : NIL;
            SubLObject all_classes = classes.classes_get_all_classes();
            SubLObject all_classes_implementing_interface = NIL;
            SubLObject list_expression = all_classes;
            if (NIL == list_expression) {
                all_classes_implementing_interface = NIL;
            } else {
                if (list_expression.isAtom()) {
                    all_classes_implementing_interface = list(list_expression);
                } else {
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject v_class = list_expression.first();
                            all_classes_implementing_interface = (NIL != classes.classes_implements_p(v_class, actual_interface)) ? ((SubLObject) (list(v_class))) : NIL;
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            all_classes_implementing_interface = NIL;
                            {
                                SubLObject cdolist_list_var = list_expression;
                                SubLObject v_class = NIL;
                                for (v_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_class = cdolist_list_var.first()) {
                                    result = (NIL != classes.classes_implements_p(v_class, actual_interface)) ? ((SubLObject) (list(v_class))) : NIL;
                                    if (NIL != result) {
                                        if (NIL != tail_cons) {
                                            rplacd(tail_cons, result);
                                            tail_cons = last(result, UNPROVIDED);
                                        } else {
                                            all_classes_implementing_interface = (NIL != classes.classes_implements_p(v_class, actual_interface)) ? ((SubLObject) (list(v_class))) : NIL;
                                            tail_cons = last(all_classes_implementing_interface, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return all_classes_implementing_interface;
        }
    }

    public static SubLObject subloop_all_classes_implementing_interface(final SubLObject v_interface) {
        final SubLObject actual_interface = (v_interface.isSymbol()) ? interfaces_retrieve_interface(v_interface) : NIL != subloop_structures.interface_p(v_interface) ? v_interface : NIL;
        final SubLObject all_classes = classes.classes_get_all_classes();
        SubLObject all_classes_implementing_interface = NIL;
        final SubLObject list_expression = all_classes;
        if (NIL == list_expression) {
            all_classes_implementing_interface = NIL;
        } else
            if (list_expression.isAtom()) {
                all_classes_implementing_interface = list(list_expression);
            } else
                if (NIL == list_expression.rest()) {
                    final SubLObject v_class = list_expression.first();
                    all_classes_implementing_interface = (NIL != classes.classes_implements_p(v_class, actual_interface)) ? list(v_class) : NIL;
                } else {
                    SubLObject tail_cons = NIL;
                    SubLObject result = NIL;
                    all_classes_implementing_interface = NIL;
                    SubLObject cdolist_list_var = list_expression;
                    SubLObject v_class2 = NIL;
                    v_class2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = (NIL != classes.classes_implements_p(v_class2, actual_interface)) ? list(v_class2) : NIL;
                        if (NIL != result) {
                            if (NIL != tail_cons) {
                                rplacd(tail_cons, result);
                                tail_cons = last(result, UNPROVIDED);
                            } else {
                                all_classes_implementing_interface = (NIL != classes.classes_implements_p(v_class2, actual_interface)) ? list(v_class2) : NIL;
                                tail_cons = last(all_classes_implementing_interface, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_class2 = cdolist_list_var.first();
                    } 
                }


        return all_classes_implementing_interface;
    }

    public static final SubLObject subloop_all_interfaces_of_class_alt(SubLObject v_class) {
        {
            SubLObject actual_class = (v_class.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_class))) : NIL != subloop_structures.class_p(v_class) ? ((SubLObject) (v_class)) : NIL;
            if (NIL == actual_class) {
                return NIL;
            }
            {
                SubLObject inheritance_path = subloop_structures.class_compiled_inheritance_path(actual_class);
                SubLObject interface_names = NIL;
                SubLObject cdolist_list_var = inheritance_path;
                SubLObject super_class = NIL;
                for (super_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , super_class = cdolist_list_var.first()) {
                    interface_names = union(interface_names, subloop_structures.class_interface_names(super_class), UNPROVIDED, UNPROVIDED);
                }
                return interface_names;
            }
        }
    }

    public static SubLObject subloop_all_interfaces_of_class(final SubLObject v_class) {
        final SubLObject actual_class = (v_class.isSymbol()) ? classes.classes_retrieve_class(v_class) : NIL != subloop_structures.class_p(v_class) ? v_class : NIL;
        if (NIL == actual_class) {
            return NIL;
        }
        final SubLObject inheritance_path = subloop_structures.class_compiled_inheritance_path(actual_class);
        SubLObject interface_names = NIL;
        SubLObject cdolist_list_var = inheritance_path;
        SubLObject super_class = NIL;
        super_class = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            interface_names = union(interface_names, subloop_structures.class_interface_names(super_class), UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            super_class = cdolist_list_var.first();
        } 
        return interface_names;
    }

    public static final SubLObject subloop_all_instance_method_decls_of_interface_alt(SubLObject v_interface) {
        {
            SubLObject actual_interface = (v_interface.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(v_interface))) : NIL != subloop_structures.interface_p(v_interface) ? ((SubLObject) (v_interface)) : NIL;
            if (NIL != actual_interface) {
                {
                    SubLObject union_of_all_parent_methods = NIL;
                    SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
                    SubLObject parent_interface = NIL;
                    for (parent_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface = cdolist_list_var.first()) {
                        union_of_all_parent_methods = union(union_of_all_parent_methods, com.cyc.cycjava.cycl.interfaces.subloop_all_instance_method_decls_of_interface(parent_interface), symbol_function(EQ), symbol_function(CADR));
                    }
                    return union(subloop_structures.interface_instance_method_decls(actual_interface), union_of_all_parent_methods, symbol_function(EQ), symbol_function(CADR));
                }
            }
            return NIL;
        }
    }

    public static SubLObject subloop_all_instance_method_decls_of_interface(final SubLObject v_interface) {
        final SubLObject actual_interface = (v_interface.isSymbol()) ? interfaces_retrieve_interface(v_interface) : NIL != subloop_structures.interface_p(v_interface) ? v_interface : NIL;
        if (NIL != actual_interface) {
            SubLObject union_of_all_parent_methods = NIL;
            SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
            SubLObject parent_interface = NIL;
            parent_interface = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                union_of_all_parent_methods = union(union_of_all_parent_methods, subloop_all_instance_method_decls_of_interface(parent_interface), symbol_function(EQ), symbol_function(CADR));
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            } 
            return union(subloop_structures.interface_instance_method_decls(actual_interface), union_of_all_parent_methods, symbol_function(EQ), symbol_function(CADR));
        }
        return NIL;
    }

    public static final SubLObject subloop_all_class_method_decls_of_interface_alt(SubLObject v_interface) {
        {
            SubLObject actual_interface = (v_interface.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(v_interface))) : NIL != subloop_structures.interface_p(v_interface) ? ((SubLObject) (v_interface)) : NIL;
            if (NIL != actual_interface) {
                {
                    SubLObject union_of_all_parent_methods = NIL;
                    SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
                    SubLObject parent_interface = NIL;
                    for (parent_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface = cdolist_list_var.first()) {
                        union_of_all_parent_methods = union(union_of_all_parent_methods, com.cyc.cycjava.cycl.interfaces.subloop_all_class_method_decls_of_interface(parent_interface), symbol_function(EQ), symbol_function(CADR));
                    }
                    return union(subloop_structures.interface_class_method_decls(actual_interface), union_of_all_parent_methods, symbol_function(EQ), symbol_function(CADR));
                }
            }
            return NIL;
        }
    }

    public static SubLObject subloop_all_class_method_decls_of_interface(final SubLObject v_interface) {
        final SubLObject actual_interface = (v_interface.isSymbol()) ? interfaces_retrieve_interface(v_interface) : NIL != subloop_structures.interface_p(v_interface) ? v_interface : NIL;
        if (NIL != actual_interface) {
            SubLObject union_of_all_parent_methods = NIL;
            SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
            SubLObject parent_interface = NIL;
            parent_interface = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                union_of_all_parent_methods = union(union_of_all_parent_methods, subloop_all_class_method_decls_of_interface(parent_interface), symbol_function(EQ), symbol_function(CADR));
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            } 
            return union(subloop_structures.interface_class_method_decls(actual_interface), union_of_all_parent_methods, symbol_function(EQ), symbol_function(CADR));
        }
        return NIL;
    }

    public static final SubLObject interfaces_who_introduced_method_alt(SubLObject v_interface, SubLObject method_name) {
        {
            SubLObject actual_interface = (v_interface.isSymbol()) ? ((SubLObject) (com.cyc.cycjava.cycl.interfaces.interfaces_retrieve_interface(v_interface))) : NIL != subloop_structures.interface_p(v_interface) ? ((SubLObject) (v_interface)) : NIL;
            if (NIL != actual_interface) {
                if (NIL != member(method_name, subloop_structures.interface_instance_method_decls(actual_interface), symbol_function(EQ), symbol_function(CADR))) {
                    return subloop_structures.interface_name(actual_interface);
                }
                if (NIL != member(method_name, subloop_structures.interface_class_method_decls(actual_interface), symbol_function(EQ), symbol_function(CADR))) {
                    return subloop_structures.interface_name(actual_interface);
                }
                {
                    SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
                    SubLObject parent_interface = NIL;
                    for (parent_interface = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_interface = cdolist_list_var.first()) {
                        {
                            SubLObject found = com.cyc.cycjava.cycl.interfaces.interfaces_who_introduced_method(parent_interface, method_name);
                            if (NIL != found) {
                                return found;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject interfaces_who_introduced_method(final SubLObject v_interface, final SubLObject method_name) {
        final SubLObject actual_interface = (v_interface.isSymbol()) ? interfaces_retrieve_interface(v_interface) : NIL != subloop_structures.interface_p(v_interface) ? v_interface : NIL;
        if (NIL != actual_interface) {
            if (NIL != member(method_name, subloop_structures.interface_instance_method_decls(actual_interface), symbol_function(EQ), symbol_function(CADR))) {
                return subloop_structures.interface_name(actual_interface);
            }
            if (NIL != member(method_name, subloop_structures.interface_class_method_decls(actual_interface), symbol_function(EQ), symbol_function(CADR))) {
                return subloop_structures.interface_name(actual_interface);
            }
            SubLObject cdolist_list_var = subloop_structures.interface_parents(actual_interface);
            SubLObject parent_interface = NIL;
            parent_interface = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject found = interfaces_who_introduced_method(parent_interface, method_name);
                if (NIL != found) {
                    return found;
                }
                cdolist_list_var = cdolist_list_var.rest();
                parent_interface = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject expand_do_interfaces_upward_alt(SubLObject var, SubLObject start_interface, SubLObject body) {
        {
            SubLObject queue_var = make_symbol($$$queue);
            SubLObject current_interface = make_symbol($str_alt73$current_interface);
            return list(CLET, list(list(queue_var, list(LIST, start_interface)), bq_cons(current_interface, $list_alt75), bq_cons(var, $list_alt75)), listS(WHILE, queue_var, list(CSETQ, current_interface, list(CAR, queue_var)), list(CSETQ, var, current_interface), list(CPOP, queue_var), append(body, list(list(CSETQ, queue_var, list(NCONC, list(COPY_LIST, list(INTERFACE_PARENTS, list(INTERFACES_RETRIEVE_INTERFACE, current_interface))), queue_var))))));
        }
    }

    public static SubLObject expand_do_interfaces_upward(final SubLObject var, final SubLObject start_interface, final SubLObject body) {
        final SubLObject queue_var = make_symbol($$$queue);
        final SubLObject current_interface = make_symbol($str73$current_interface);
        return list(CLET, list(list(queue_var, list(LIST, start_interface)), bq_cons(current_interface, $list75), bq_cons(var, $list75)), listS(WHILE, queue_var, list(CSETQ, current_interface, list(CAR, queue_var)), list(CSETQ, var, current_interface), list(CPOP, queue_var), append(body, list(list(CSETQ, queue_var, list(NCONC, list(COPY_LIST, list(INTERFACE_PARENTS, list(INTERFACES_RETRIEVE_INTERFACE, current_interface))), queue_var))))));
    }

    public static final SubLObject do_interfaces_upward_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject start_interface = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    start_interface = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return com.cyc.cycjava.cycl.interfaces.expand_do_interfaces_upward(var, start_interface, body);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt84);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_interfaces_upward(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject start_interface = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        start_interface = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return expand_do_interfaces_upward(var, start_interface, body);
        }
        cdestructuring_bind_error(datum, $list84);
        return NIL;
    }

    public static final SubLObject expand_do_interfaces_downward_alt(SubLObject var, SubLObject start_interface, SubLObject body) {
        {
            SubLObject queue_var = make_symbol($$$queue);
            SubLObject current_interface = make_symbol($str_alt73$current_interface);
            return list(CLET, list(list(queue_var, list(LIST, start_interface)), bq_cons(current_interface, $list_alt75), bq_cons(var, $list_alt75)), listS(WHILE, queue_var, list(CSETQ, current_interface, list(CAR, queue_var)), list(CSETQ, var, current_interface), list(CPOP, queue_var), append(body, list(list(CSETQ, queue_var, list(NCONC, list(COPY_LIST, list(INTERFACE_SUBINTERFACES, list(INTERFACES_RETRIEVE_INTERFACE, current_interface))), queue_var))))));
        }
    }

    public static SubLObject expand_do_interfaces_downward(final SubLObject var, final SubLObject start_interface, final SubLObject body) {
        final SubLObject queue_var = make_symbol($$$queue);
        final SubLObject current_interface = make_symbol($str73$current_interface);
        return list(CLET, list(list(queue_var, list(LIST, start_interface)), bq_cons(current_interface, $list75), bq_cons(var, $list75)), listS(WHILE, queue_var, list(CSETQ, current_interface, list(CAR, queue_var)), list(CSETQ, var, current_interface), list(CPOP, queue_var), append(body, list(list(CSETQ, queue_var, list(NCONC, list(COPY_LIST, list(INTERFACE_SUBINTERFACES, list(INTERFACES_RETRIEVE_INTERFACE, current_interface))), queue_var))))));
    }

    public static final SubLObject do_interfaces_downward_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject start_interface = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    start_interface = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return com.cyc.cycjava.cycl.interfaces.expand_do_interfaces_downward(var, start_interface, body);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt84);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_interfaces_downward(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject start_interface = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        start_interface = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return expand_do_interfaces_downward(var, start_interface, body);
        }
        cdestructuring_bind_error(datum, $list84);
        return NIL;
    }

    public static final SubLObject expand_do_interfaces_upward_with_depth_alt(SubLObject var, SubLObject depth_var, SubLObject start_interface, SubLObject body) {
        {
            SubLObject queue_var = make_symbol($$$queue);
            SubLObject current_record = make_symbol($str_alt73$current_interface);
            SubLObject next_generation_var = make_symbol($str_alt86$next_generation);
            return list(CLET, list(list(queue_var, list(LIST, listS(CONS, start_interface, $list_alt88))), bq_cons(current_record, $list_alt75), bq_cons(var, $list_alt75), bq_cons(depth_var, $list_alt75), bq_cons(next_generation_var, $list_alt75)), listS(WHILE, new SubLObject[]{ queue_var, list(CSETQ, current_record, list(CAR, queue_var)), list(CSETQ, var, list(CAR, current_record)), list(CSETQ, depth_var, list(CDR, current_record)), list(CPOP, queue_var), append(body, list(list(CSETQ, next_generation_var, list(COPY_LIST, list(INTERFACE_PARENTS, list(INTERFACES_RETRIEVE_INTERFACE, list(CAR, current_record))))), list(CLET, list($list_alt90, list(NEW_DEPTH, listS($sym92$_, depth_var, $list_alt93))), listS(CDOLIST_COLLECTING, listS(INTERFACE_NAME, next_generation_var, $list_alt96), $list_alt97), listS(CSETQ, next_generation_var, $list_alt96)), list(CSETQ, queue_var, list(NCONC, next_generation_var, queue_var)))) }));
        }
    }

    public static SubLObject expand_do_interfaces_upward_with_depth(final SubLObject var, final SubLObject depth_var, final SubLObject start_interface, final SubLObject body) {
        final SubLObject queue_var = make_symbol($$$queue);
        final SubLObject current_record = make_symbol($str73$current_interface);
        final SubLObject next_generation_var = make_symbol($str86$next_generation);
        return list(CLET, list(list(queue_var, list(LIST, listS(CONS, start_interface, $list88))), bq_cons(current_record, $list75), bq_cons(var, $list75), bq_cons(depth_var, $list75), bq_cons(next_generation_var, $list75)), listS(WHILE, new SubLObject[]{ queue_var, list(CSETQ, current_record, list(CAR, queue_var)), list(CSETQ, var, list(CAR, current_record)), list(CSETQ, depth_var, list(CDR, current_record)), list(CPOP, queue_var), append(body, list(list(CSETQ, next_generation_var, list(COPY_LIST, list(INTERFACE_PARENTS, list(INTERFACES_RETRIEVE_INTERFACE, list(CAR, current_record))))), list(CLET, list($list90, list(NEW_DEPTH, listS($sym92$_, depth_var, $list93))), listS(CDOLIST_COLLECTING, listS(INTERFACE_NAME, next_generation_var, $list96), $list97), listS(CSETQ, next_generation_var, $list96)), list(CSETQ, queue_var, list(NCONC, next_generation_var, queue_var)))) }));
    }

    public static final SubLObject do_interfaces_upward_with_depth_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt98);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject depth_var = NIL;
                    SubLObject start_interface = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    depth_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    start_interface = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return com.cyc.cycjava.cycl.interfaces.expand_do_interfaces_upward_with_depth(var, depth_var, start_interface, body);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt98);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_interfaces_upward_with_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject depth_var = NIL;
        SubLObject start_interface = NIL;
        destructuring_bind_must_consp(current, datum, $list98);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        depth_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        start_interface = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return expand_do_interfaces_upward_with_depth(var, depth_var, start_interface, body);
        }
        cdestructuring_bind_error(datum, $list98);
        return NIL;
    }

    public static final SubLObject expand_do_interfaces_downward_with_depth_alt(SubLObject var, SubLObject depth_var, SubLObject start_interface, SubLObject body) {
        {
            SubLObject queue_var = make_symbol($$$queue);
            SubLObject current_record = make_symbol($str_alt73$current_interface);
            SubLObject next_generation_var = make_symbol($str_alt86$next_generation);
            return list(CLET, list(list(queue_var, list(LIST, listS(CONS, start_interface, $list_alt88))), bq_cons(current_record, $list_alt75), bq_cons(var, $list_alt75), bq_cons(depth_var, $list_alt75), bq_cons(next_generation_var, $list_alt75)), listS(WHILE, new SubLObject[]{ queue_var, list(CSETQ, current_record, list(CAR, queue_var)), list(CSETQ, var, list(CAR, current_record)), list(CSETQ, depth_var, list(CDR, current_record)), list(CPOP, queue_var), append(body, list(list(CSETQ, next_generation_var, list(COPY_LIST, list(INTERFACE_SUBINTERFACES, list(INTERFACES_RETRIEVE_INTERFACE, list(CAR, current_record))))), list(CLET, list($list_alt90, list(NEW_DEPTH, listS($sym92$_, depth_var, $list_alt93))), listS(CDOLIST_COLLECTING, listS(INTERFACE_NAME, next_generation_var, $list_alt96), $list_alt97), listS(CSETQ, next_generation_var, $list_alt96)), list(CSETQ, queue_var, list(NCONC, next_generation_var, queue_var)))) }));
        }
    }

    public static SubLObject expand_do_interfaces_downward_with_depth(final SubLObject var, final SubLObject depth_var, final SubLObject start_interface, final SubLObject body) {
        final SubLObject queue_var = make_symbol($$$queue);
        final SubLObject current_record = make_symbol($str73$current_interface);
        final SubLObject next_generation_var = make_symbol($str86$next_generation);
        return list(CLET, list(list(queue_var, list(LIST, listS(CONS, start_interface, $list88))), bq_cons(current_record, $list75), bq_cons(var, $list75), bq_cons(depth_var, $list75), bq_cons(next_generation_var, $list75)), listS(WHILE, new SubLObject[]{ queue_var, list(CSETQ, current_record, list(CAR, queue_var)), list(CSETQ, var, list(CAR, current_record)), list(CSETQ, depth_var, list(CDR, current_record)), list(CPOP, queue_var), append(body, list(list(CSETQ, next_generation_var, list(COPY_LIST, list(INTERFACE_SUBINTERFACES, list(INTERFACES_RETRIEVE_INTERFACE, list(CAR, current_record))))), list(CLET, list($list90, list(NEW_DEPTH, listS($sym92$_, depth_var, $list93))), listS(CDOLIST_COLLECTING, listS(INTERFACE_NAME, next_generation_var, $list96), $list97), listS(CSETQ, next_generation_var, $list96)), list(CSETQ, queue_var, list(NCONC, next_generation_var, queue_var)))) }));
    }

    public static final SubLObject do_interfaces_downward_with_depth_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt98);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject depth_var = NIL;
                    SubLObject start_interface = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    depth_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    start_interface = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return com.cyc.cycjava.cycl.interfaces.expand_do_interfaces_downward_with_depth(var, depth_var, start_interface, body);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt98);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_interfaces_downward_with_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject depth_var = NIL;
        SubLObject start_interface = NIL;
        destructuring_bind_must_consp(current, datum, $list98);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        depth_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list98);
        start_interface = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return expand_do_interfaces_downward_with_depth(var, depth_var, start_interface, body);
        }
        cdestructuring_bind_error(datum, $list98);
        return NIL;
    }

    public static SubLObject declare_interfaces_file() {
        declareFunction("interfaces_reset_interface_table", "INTERFACES-RESET-INTERFACE-TABLE", 0, 0, false);
        declareMacro("with_interface_marking", "WITH-INTERFACE-MARKING");
        declareFunction("display_interface", "DISPLAY-INTERFACE", 1, 1, false);
        declareMacro("with_interface_definition_lock", "WITH-INTERFACE-DEFINITION-LOCK");
        declareFunction("interfaces_mark_interface", "INTERFACES-MARK-INTERFACE", 2, 0, false);
        declareFunction("interfaces_remove_mark", "INTERFACES-REMOVE-MARK", 2, 0, false);
        declareFunction("interfaces_marked_p", "INTERFACES-MARKED-P", 2, 0, false);
        declareFunction("interfaces_unmark_all_marked_interfaces", "INTERFACES-UNMARK-ALL-MARKED-INTERFACES", 1, 0, false);
        declareFunction("interfaces_retrieve_interface", "INTERFACES-RETRIEVE-INTERFACE", 1, 0, false);
        declareFunction("interfaces_intern_interface", "INTERFACES-INTERN-INTERFACE", 2, 0, false);
        declareFunction("interfaces_delete_interface", "INTERFACES-DELETE-INTERFACE", 1, 0, false);
        declareFunction("interfaces_compile_inheritance_path_from_above", "INTERFACES-COMPILE-INHERITANCE-PATH-FROM-ABOVE", 1, 0, false);
        declareFunction("interfaces_compile_inheritance_path_from_above_aux", "INTERFACES-COMPILE-INHERITANCE-PATH-FROM-ABOVE-AUX", 1, 0, false);
        declareFunction("interfaces_transmit_compiled_inheritance_path_downward", "INTERFACES-TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD", 1, 0, false);
        declareFunction("interfaces_transmit_compiled_inheritance_path_downward_aux", "INTERFACES-TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD-AUX", 1, 0, false);
        declareFunction("interfaces_compile_instance_method_decls_from_above", "INTERFACES-COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE", 1, 0, false);
        declareFunction("interfaces_compile_instance_method_decls_from_above_aux", "INTERFACES-COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE-AUX", 1, 0, false);
        declareFunction("interfaces_transmit_compile_instance_method_decls_downward", "INTERFACES-TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD", 1, 0, false);
        declareFunction("interfaces_transmit_compile_instance_method_decls_downward_aux", "INTERFACES-TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD-AUX", 1, 0, false);
        declareFunction("interfaces_compile_class_method_decls_from_above", "INTERFACES-COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE", 1, 0, false);
        declareFunction("interfaces_compile_class_method_decls_from_above_aux", "INTERFACES-COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE-AUX", 1, 0, false);
        declareFunction("interfaces_transmit_compile_class_method_decls_downward", "INTERFACES-TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD", 1, 0, false);
        declareFunction("interfaces_transmit_compile_class_method_decls_downward_aux", "INTERFACES-TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD-AUX", 1, 0, false);
        declareFunction("expand_interface_predicator", "EXPAND-INTERFACE-PREDICATOR", 1, 0, false);
        declareFunction("subloop_instanceof_interface", "SUBLOOP-INSTANCEOF-INTERFACE", 2, 0, false);
        declareFunction("expand_define_interface", "EXPAND-DEFINE-INTERFACE", 4, 0, false);
        declareMacro("define_interface", "DEFINE-INTERFACE");
        declareFunction("new_interface", "NEW-INTERFACE", 4, 0, false);
        declareFunction("interfaces_check_parent_interfaces", "INTERFACES-CHECK-PARENT-INTERFACES", 1, 0, false);
        declareFunction("interfaces_must_be_valid_method_interface_decl", "INTERFACES-MUST-BE-VALID-METHOD-INTERFACE-DECL", 1, 0, false);
        declareFunction("interfaces_must_be_valid_method_interface_decl_list", "INTERFACES-MUST-BE-VALID-METHOD-INTERFACE-DECL-LIST", 1, 0, false);
        declareFunction("interfaces_add_interface_class_method", "INTERFACES-ADD-INTERFACE-CLASS-METHOD", 5, 0, false);
        declareFunction("expand_def_class_method_template", "EXPAND-DEF-CLASS-METHOD-TEMPLATE", 5, 0, false);
        declareMacro("def_class_method_template", "DEF-CLASS-METHOD-TEMPLATE");
        declareFunction("interfaces_add_interface_instance_method", "INTERFACES-ADD-INTERFACE-INSTANCE-METHOD", 5, 0, false);
        declareFunction("expand_def_instance_method_template", "EXPAND-DEF-INSTANCE-METHOD-TEMPLATE", 5, 0, false);
        declareMacro("def_instance_method_template", "DEF-INSTANCE-METHOD-TEMPLATE");
        declareFunction("interfaces_find_class_method_internal", "INTERFACES-FIND-CLASS-METHOD-INTERNAL", 2, 0, false);
        declareFunction("interfaces_find_class_method", "INTERFACES-FIND-CLASS-METHOD", 2, 0, false);
        declareFunction("interfaces_find_instance_method_internal", "INTERFACES-FIND-INSTANCE-METHOD-INTERNAL", 2, 0, false);
        declareFunction("interfaces_find_instance_method", "INTERFACES-FIND-INSTANCE-METHOD", 2, 0, false);
        declareFunction("interfaces_class_method_to_listed_def_class_method", "INTERFACES-CLASS-METHOD-TO-LISTED-DEF-CLASS-METHOD", 2, 0, false);
        declareFunction("interfaces_instance_method_to_listed_def_instance_method", "INTERFACES-INSTANCE-METHOD-TO-LISTED-DEF-INSTANCE-METHOD", 2, 0, false);
        declareFunction("interfaces_implements_p", "INTERFACES-IMPLEMENTS-P", 2, 0, false);
        declareFunction("interfaces_collect_method_decls", "INTERFACES-COLLECT-METHOD-DECLS", 1, 0, false);
        declareFunction("subloop_all_methods_of_interface", "SUBLOOP-ALL-METHODS-OF-INTERFACE", 1, 0, false);
        declareMacro("interface_get_property_internal", "INTERFACE-GET-PROPERTY-INTERNAL");
        declareFunction("interface_get_property", "INTERFACE-GET-PROPERTY", 2, 0, false);
        declareFunction("interface_set_property_internal", "INTERFACE-SET-PROPERTY-INTERNAL", 3, 0, false);
        declareFunction("interface_set_property", "INTERFACE-SET-PROPERTY", 3, 0, false);
        declareFunction("subloop_all_classes_implementing_interface", "SUBLOOP-ALL-CLASSES-IMPLEMENTING-INTERFACE", 1, 0, false);
        declareFunction("subloop_all_interfaces_of_class", "SUBLOOP-ALL-INTERFACES-OF-CLASS", 1, 0, false);
        declareFunction("subloop_all_instance_method_decls_of_interface", "SUBLOOP-ALL-INSTANCE-METHOD-DECLS-OF-INTERFACE", 1, 0, false);
        declareFunction("subloop_all_class_method_decls_of_interface", "SUBLOOP-ALL-CLASS-METHOD-DECLS-OF-INTERFACE", 1, 0, false);
        declareFunction("interfaces_who_introduced_method", "INTERFACES-WHO-INTRODUCED-METHOD", 2, 0, false);
        declareFunction("expand_do_interfaces_upward", "EXPAND-DO-INTERFACES-UPWARD", 3, 0, false);
        declareMacro("do_interfaces_upward", "DO-INTERFACES-UPWARD");
        declareFunction("expand_do_interfaces_downward", "EXPAND-DO-INTERFACES-DOWNWARD", 3, 0, false);
        declareMacro("do_interfaces_downward", "DO-INTERFACES-DOWNWARD");
        declareFunction("expand_do_interfaces_upward_with_depth", "EXPAND-DO-INTERFACES-UPWARD-WITH-DEPTH", 4, 0, false);
        declareMacro("do_interfaces_upward_with_depth", "DO-INTERFACES-UPWARD-WITH-DEPTH");
        declareFunction("expand_do_interfaces_downward_with_depth", "EXPAND-DO-INTERFACES-DOWNWARD-WITH-DEPTH", 4, 0, false);
        declareMacro("do_interfaces_downward_with_depth", "DO-INTERFACES-DOWNWARD-WITH-DEPTH");
        return NIL;
    }

    public static final SubLObject init_interfaces_file_alt() {
        defconstant("*INTERFACES-INITIAL-HASHTABLE-SIZE*", $int$400);
        defparameter("*INTERFACES-INTERFACE-TABLE-UPDATE-LOCK*", make_lock($$$Interface_Table_Update_Lock));
        deflexical("*INTERFACES-INTERFACE-TABLE*", NIL != boundp($interfaces_interface_table$) ? ((SubLObject) ($interfaces_interface_table$.getGlobalValue())) : make_hash_table($interfaces_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        deflexical("*INTERFACES-ALIST-OF-ALL-INTERFACES*", NIL != boundp($interfaces_alist_of_all_interfaces$) ? ((SubLObject) ($interfaces_alist_of_all_interfaces$.getGlobalValue())) : NIL);
        defparameter("*INTERFACES-MARKED-INTERFACES*", NIL);
        defconstant("*INTERFACE-METHOD-IMPOSSIBLE-PROPERTIES*", $list_alt4);
        defconstant("*INTERFACE-METHOD-REQUIRED-PROPERTIES*", $list_alt5);
        defconstant("*INVALID-INTERFACE-METHOD-NAME-MESSAGE*", $str_alt51$The_interface_method_name__S_is_n);
        defconstant("*INVALID-INTERFACE-NAME-MESSAGE*", $str_alt52$The_interface_name__S_is_not_a_va);
        defconstant("*UNDECLARE-METHOD-NAME-MESSAGE*", $str_alt53$The_method__S_of_interface__S_is_);
        defconstant("*NON-EXISTING-INTERFACE-MESSAGE*", $str_alt54$The_interface__S_which_appears_in);
        defconstant("*INVALID-LAMBDA-LIST-MESSAGE*", $str_alt55$Lambda_list__S_of_method__S_of_in);
        return NIL;
    }

    public static SubLObject init_interfaces_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*INTERFACES-INITIAL-HASHTABLE-SIZE*", $int$400);
            defparameter("*INTERFACES-INTERFACE-TABLE-UPDATE-LOCK*", make_lock($$$Interface_Table_Update_Lock));
            deflexical("*INTERFACES-INTERFACE-TABLE*", SubLTrampolineFile.maybeDefault($interfaces_interface_table$, $interfaces_interface_table$, () -> make_hash_table($interfaces_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
            deflexical("*INTERFACES-ALIST-OF-ALL-INTERFACES*", SubLTrampolineFile.maybeDefault($interfaces_alist_of_all_interfaces$, $interfaces_alist_of_all_interfaces$, NIL));
            defparameter("*INTERFACES-MARKED-INTERFACES*", NIL);
            defconstant("*INTERFACE-METHOD-IMPOSSIBLE-PROPERTIES*", $list4);
            defconstant("*INTERFACE-METHOD-REQUIRED-PROPERTIES*", $list5);
            defconstant("*INVALID-INTERFACE-METHOD-NAME-MESSAGE*", $str51$The_interface_method_name__S_is_n);
            defconstant("*INVALID-INTERFACE-NAME-MESSAGE*", $str52$The_interface_name__S_is_not_a_va);
            defconstant("*UNDECLARE-METHOD-NAME-MESSAGE*", $str53$The_method__S_of_interface__S_is_);
            defconstant("*NON-EXISTING-INTERFACE-MESSAGE*", $str54$The_interface__S_which_appears_in);
            defconstant("*INVALID-LAMBDA-LIST-MESSAGE*", $str55$Lambda_list__S_of_method__S_of_in);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*INTERFACES-INTERFACE-TABLE*", NIL != boundp($interfaces_interface_table$) ? ((SubLObject) ($interfaces_interface_table$.getGlobalValue())) : make_hash_table($interfaces_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
            deflexical("*INTERFACES-ALIST-OF-ALL-INTERFACES*", NIL != boundp($interfaces_alist_of_all_interfaces$) ? ((SubLObject) ($interfaces_alist_of_all_interfaces$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_interfaces_file_Previous() {
        defconstant("*INTERFACES-INITIAL-HASHTABLE-SIZE*", $int$400);
        defparameter("*INTERFACES-INTERFACE-TABLE-UPDATE-LOCK*", make_lock($$$Interface_Table_Update_Lock));
        deflexical("*INTERFACES-INTERFACE-TABLE*", SubLTrampolineFile.maybeDefault($interfaces_interface_table$, $interfaces_interface_table$, () -> make_hash_table($interfaces_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
        deflexical("*INTERFACES-ALIST-OF-ALL-INTERFACES*", SubLTrampolineFile.maybeDefault($interfaces_alist_of_all_interfaces$, $interfaces_alist_of_all_interfaces$, NIL));
        defparameter("*INTERFACES-MARKED-INTERFACES*", NIL);
        defconstant("*INTERFACE-METHOD-IMPOSSIBLE-PROPERTIES*", $list4);
        defconstant("*INTERFACE-METHOD-REQUIRED-PROPERTIES*", $list5);
        defconstant("*INVALID-INTERFACE-METHOD-NAME-MESSAGE*", $str51$The_interface_method_name__S_is_n);
        defconstant("*INVALID-INTERFACE-NAME-MESSAGE*", $str52$The_interface_name__S_is_not_a_va);
        defconstant("*UNDECLARE-METHOD-NAME-MESSAGE*", $str53$The_method__S_of_interface__S_is_);
        defconstant("*NON-EXISTING-INTERFACE-MESSAGE*", $str54$The_interface__S_which_appears_in);
        defconstant("*INVALID-LAMBDA-LIST-MESSAGE*", $str55$Lambda_list__S_of_method__S_of_in);
        return NIL;
    }

    public static SubLObject setup_interfaces_file() {
        declare_defglobal($interfaces_interface_table$);
        declare_defglobal($interfaces_alist_of_all_interfaces$);
        register_macro_helper(SUBLOOP_INSTANCEOF_INTERFACE, NEW_INTERFACE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_interfaces_file();
    }

    @Override
    public void initializeVariables() {
        init_interfaces_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_interfaces_file();
    }

    static {
    }

    static private final SubLList $list_alt4 = list(makeKeyword("DEFAULT"), makeKeyword("AUTO-UPDATE"), makeKeyword("READ-ONLY"));

    static private final SubLList $list_alt5 = list(makeKeyword("NO-MEMBER-VARIABLES"));

    static private final SubLList $list_alt7 = list(list(makeSymbol("*INTERFACES-MARKED-INTERFACES*"), NIL));

    static private final SubLList $list_alt10 = list(list(makeSymbol("INTERFACES-UNMARK-ALL-MARKED-INTERFACES"), makeSymbol("*INTERFACES-MARKED-INTERFACES*")));

    static private final SubLString $str_alt11$__Describing_Interface__S = makeString("~%Describing Interface ~S");

    static private final SubLString $str_alt12$____name_____S = makeString("~%  name -> ~S");

    static private final SubLString $str_alt13$____parents_____S = makeString("~%  parents -> ~S");

    static private final SubLString $str_alt14$____compiled_inheritance_path____ = makeString("~%  compiled-inheritance-path -> ~S");

    static private final SubLString $str_alt15$____subinterfaces_____S = makeString("~%  subinterfaces -> ~S");

    static private final SubLString $str_alt16$____implementers_____S = makeString("~%  implementers -> ~S");

    static private final SubLString $str_alt17$____instance_method_decls_____S = makeString("~%  instance-method-decls -> ~S");

    static private final SubLString $str_alt18$____class_method_decls_____S = makeString("~%  class-method-decls -> ~S");

    static private final SubLString $str_alt19$____compiled_instance_method_decl = makeString("~%  compiled-instance-method-decls -> ~S");

    static private final SubLString $str_alt20$____compiled_class_method_decls__ = makeString("~%  compiled-class-method-decls -> ~S");

    static private final SubLString $str_alt21$____local_class_methods_____S = makeString("~%  local-class-methods -> ~S");

    static private final SubLString $str_alt22$____local_instance_methods_____S = makeString("~%  local-instance-methods -> ~S");

    static private final SubLString $str_alt23$___S_is_not_an_interface_ = makeString("~%~S is not an interface.");

    static private final SubLList $list_alt24 = list(makeSymbol("INTERFACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt34$_P = makeString("-P");

    static private final SubLList $list_alt40 = list(makeSymbol("INTERFACE-NAME-AND-PROPERTIES"), makeSymbol("&BODY"), makeSymbol("METHOD-DECLS"));

    static private final SubLString $str_alt42$__Interface_names_must_be_a_symbo = makeString("~%Interface names must be a symbol.  ~S is an invalid interface name.");

    static private final SubLString $str_alt43$__Interface_names_must_not_be_NIL = makeString("~%Interface names must not be NIL.  NIL is an invalid interface name.");

    static private final SubLString $str_alt44$Interface_ = makeString("Interface ");

    static private final SubLString $str_alt45$_Definition_Lock = makeString(" Definition Lock");

    static private final SubLString $str_alt46$___S_is_not_a_valid_parent_interf = makeString("~%~S is not a valid parent interface specification.");

    static private final SubLString $str_alt47$___S_is_not_a_valid_parent_interf = makeString("~%~S is not a valid parent interface.");

    static private final SubLString $str_alt48$__Parent_interface__S_is_undefine = makeString("~%Parent interface ~S is undefined.");

    static private final SubLString $str_alt49$___S_is_not_a_valid_interface_met = makeString("~%~S is not a valid interface method declaration.");

    static private final SubLString $str_alt50$___S_is_not_a_valid_interface_met = makeString("~%~S is not a valid interface method declaration sequence.");

    static private final SubLString $str_alt51$The_interface_method_name__S_is_n = makeString("The interface method name ~S is not a valid method name.  Valid method names must be non-nil symbols.");

    static private final SubLString $str_alt52$The_interface_name__S_is_not_a_va = makeString("The interface name ~S is not a valid interface name.  Valid interface names must be non-nil symbols.");

    static private final SubLString $str_alt53$The_method__S_of_interface__S_is_ = makeString("The method ~S of interface ~S is undeclared.  The method must be declared within the body of a define-interface.");

    static private final SubLString $str_alt54$The_interface__S_which_appears_in = makeString("The interface ~S which appears in a method declaration does not exist.");

    static private final SubLString $str_alt55$Lambda_list__S_of_method__S_of_in = makeString("Lambda list ~S of method ~S of interface ~S is not a valid lambda list.");

    static private final SubLList $list_alt57 = list(listS(makeSymbol("METHOD-NAME"), makeSymbol("INTERFACE-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt65$SUBLOOP_ALL_METHODS_OF_INTERFACE_ = makeString("SUBLOOP-ALL-METHODS-OF-INTERFACE: ~S is not an interface.");

    static private final SubLList $list_alt66 = list(makeSymbol("INTERFACE"), makeSymbol("INDICATOR"));

    static private final SubLString $str_alt73$current_interface = makeString("current-interface");

    static private final SubLList $list_alt75 = list(NIL);

    static private final SubLList $list_alt84 = list(list(makeSymbol("VAR"), makeSymbol("START-INTERFACE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt86$next_generation = makeString("next-generation");

    static private final SubLList $list_alt88 = list(ZERO_INTEGER);

    static private final SubLList $list_alt90 = list(makeSymbol("PROCESSED-NEXT-GENERATION"), NIL);

    static private final SubLList $list_alt93 = list(ONE_INTEGER);

    static private final SubLList $list_alt96 = list(makeSymbol("PROCESSED-NEXT-GENERATION"));

    static private final SubLList $list_alt97 = list(list(makeSymbol("CONS"), makeSymbol("INTERFACE-NAME"), makeSymbol("NEW-DEPTH")));

    static private final SubLList $list_alt98 = list(list(makeSymbol("VAR"), makeSymbol("DEPTH-VAR"), makeSymbol("START-INTERFACE")), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 452 ms
 */
