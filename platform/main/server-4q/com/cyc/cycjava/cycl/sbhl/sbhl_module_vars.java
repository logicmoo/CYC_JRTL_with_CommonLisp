/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.dictionary.dictionary_enter;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup_without_values;
import static com.cyc.cycjava.cycl.dictionary.dictionary_p;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.forts.valid_fortP;
import static com.cyc.cycjava.cycl.list_utilities.nmapcar;
import static com.cyc.cycjava.cycl.list_utilities.position_L;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_size;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dumper;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-MODULE-VARS
 * source file: /cyc/top/cycl/sbhl/sbhl-module-vars.lisp
 * created:     2019/07/03 17:37:18
 */
public final class sbhl_module_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_module_vars();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_module$ = makeSymbol("*DTP-SBHL-MODULE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sbhl_module_key_test$ = makeSymbol("*SBHL-MODULE-KEY-TEST*");

    // deflexical
    // Roles that sbhl modules play in the grand SBHL scheme.
    /**
     * Roles that sbhl modules play in the grand SBHL scheme.
     */
    @LispMethod(comment = "Roles that sbhl modules play in the grand SBHL scheme.\ndeflexical")
    public static final SubLSymbol $sbhl_module_types$ = makeSymbol("*SBHL-MODULE-TYPES*");

    // deflexical
    // the list of required properties for each of the @see *sbhl-modules*
    /**
     * the list of required properties for each of the @see *sbhl-modules*
     */
    @LispMethod(comment = "the list of required properties for each of the @see *sbhl-modules*\ndeflexical")
    private static final SubLSymbol $sbhl_module_required_properties$ = makeSymbol("*SBHL-MODULE-REQUIRED-PROPERTIES*");

    // defvar
    // The parameters bound with each sbhl module.
    /**
     * The parameters bound with each sbhl module.
     */
    @LispMethod(comment = "The parameters bound with each sbhl module.\ndefvar")
    public static final SubLSymbol $sbhl_module_vars$ = makeSymbol("*SBHL-MODULE-VARS*");

    // deflexical
    /**
     * the fort which is used to determine whether a predicate has directed links
     */
    @LispMethod(comment = "the fort which is used to determine whether a predicate has directed links\ndeflexical")
    public static final SubLSymbol $fort_denoting_sbhl_directed_graph$ = makeSymbol("*FORT-DENOTING-SBHL-DIRECTED-GRAPH*");

    // deflexical
    /**
     * the fort which is used to determine whether a predicate has undirected links
     */
    @LispMethod(comment = "the fort which is used to determine whether a predicate has undirected links\ndeflexical")
    public static final SubLSymbol $fort_denoting_sbhl_undirected_graph$ = makeSymbol("*FORT-DENOTING-SBHL-UNDIRECTED-GRAPH*");

    // defparameter
    /**
     * Assumption made for a collection, predicate, etc. that has no known extent.
     * The two possible values are t (assume nonempty) and nil (assume nothing)
     */
    @LispMethod(comment = "Assumption made for a collection, predicate, etc. that has no known extent.\r\nThe two possible values are t (assume nonempty) and nil (assume nothing)\ndefparameter\nAssumption made for a collection, predicate, etc. that has no known extent.\nThe two possible values are t (assume nonempty) and nil (assume nothing)")
    public static final SubLSymbol $assume_sbhl_extensions_nonempty$ = makeSymbol("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sbhl_module_link_pred_preference_order$ = makeSymbol("*SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SBHL_MODULE = makeSymbol("SBHL-MODULE");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("LINK-PRED"), makeSymbol("ACCESSIBLE-LINK-PREDS"), makeSymbol("GRAPH"), makeSymbol("LINK-STYLE"), makeSymbol("INDEX-ARG"), makeSymbol("MODULE-TYPE"), makeSymbol("TYPE-TEST"), makeSymbol("PATH-TERMINATING-MARK-FN"), makeSymbol("MARKING-FN"), makeSymbol("UNMARKING-FN"), makeSymbol("VAR-BINDINGS"), makeSymbol("MISC-PROPERTIES") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("LINK-PRED"), makeKeyword("ACCESSIBLE-LINK-PREDS"), makeKeyword("GRAPH"), makeKeyword("LINK-STYLE"), makeKeyword("INDEX-ARG"), makeKeyword("MODULE-TYPE"), makeKeyword("TYPE-TEST"), makeKeyword("PATH-TERMINATING-MARK-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("VAR-BINDINGS"), makeKeyword("MISC-PROPERTIES") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("SBHL-MOD-LINK-PRED"), makeSymbol("SBHL-MOD-ACCESSIBLE-LINK-PREDS"), makeSymbol("SBHL-MOD-GRAPH"), makeSymbol("SBHL-MOD-LINK-STYLE"), makeSymbol("SBHL-MOD-INDEX-ARG"), makeSymbol("SBHL-MOD-MODULE-TYPE"), makeSymbol("SBHL-MOD-TYPE-TEST"), makeSymbol("SBHL-MOD-PATH-TERMINATING-MARK-FN"), makeSymbol("SBHL-MOD-MARKING-FN"), makeSymbol("SBHL-MOD-UNMARKING-FN"), makeSymbol("SBHL-MOD-VAR-BINDINGS"), makeSymbol("SBHL-MOD-MISC-PROPERTIES") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-SBHL-MOD-LINK-PRED"), makeSymbol("_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS"), makeSymbol("_CSETF-SBHL-MOD-GRAPH"), makeSymbol("_CSETF-SBHL-MOD-LINK-STYLE"), makeSymbol("_CSETF-SBHL-MOD-INDEX-ARG"), makeSymbol("_CSETF-SBHL-MOD-MODULE-TYPE"), makeSymbol("_CSETF-SBHL-MOD-TYPE-TEST"), makeSymbol("_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN"), makeSymbol("_CSETF-SBHL-MOD-MARKING-FN"), makeSymbol("_CSETF-SBHL-MOD-UNMARKING-FN"), makeSymbol("_CSETF-SBHL-MOD-VAR-BINDINGS"), makeSymbol("_CSETF-SBHL-MOD-MISC-PROPERTIES") });

    private static final SubLSymbol PRINT_SBHL_MODULE = makeSymbol("PRINT-SBHL-MODULE");

    private static final SubLSymbol SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-MODULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-MODULE-P"));

    private static final SubLSymbol SBHL_MOD_LINK_PRED = makeSymbol("SBHL-MOD-LINK-PRED");

    private static final SubLSymbol _CSETF_SBHL_MOD_LINK_PRED = makeSymbol("_CSETF-SBHL-MOD-LINK-PRED");

    private static final SubLSymbol SBHL_MOD_ACCESSIBLE_LINK_PREDS = makeSymbol("SBHL-MOD-ACCESSIBLE-LINK-PREDS");

    private static final SubLSymbol _CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS = makeSymbol("_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS");

    private static final SubLSymbol SBHL_MOD_GRAPH = makeSymbol("SBHL-MOD-GRAPH");

    private static final SubLSymbol _CSETF_SBHL_MOD_GRAPH = makeSymbol("_CSETF-SBHL-MOD-GRAPH");

    private static final SubLSymbol SBHL_MOD_LINK_STYLE = makeSymbol("SBHL-MOD-LINK-STYLE");

    private static final SubLSymbol _CSETF_SBHL_MOD_LINK_STYLE = makeSymbol("_CSETF-SBHL-MOD-LINK-STYLE");

    private static final SubLSymbol SBHL_MOD_INDEX_ARG = makeSymbol("SBHL-MOD-INDEX-ARG");

    private static final SubLSymbol _CSETF_SBHL_MOD_INDEX_ARG = makeSymbol("_CSETF-SBHL-MOD-INDEX-ARG");

    private static final SubLSymbol SBHL_MOD_MODULE_TYPE = makeSymbol("SBHL-MOD-MODULE-TYPE");

    private static final SubLSymbol _CSETF_SBHL_MOD_MODULE_TYPE = makeSymbol("_CSETF-SBHL-MOD-MODULE-TYPE");

    private static final SubLSymbol SBHL_MOD_TYPE_TEST = makeSymbol("SBHL-MOD-TYPE-TEST");

    private static final SubLSymbol _CSETF_SBHL_MOD_TYPE_TEST = makeSymbol("_CSETF-SBHL-MOD-TYPE-TEST");

    private static final SubLSymbol SBHL_MOD_PATH_TERMINATING_MARK_FN = makeSymbol("SBHL-MOD-PATH-TERMINATING-MARK-FN");

    private static final SubLSymbol _CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN = makeSymbol("_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN");

    private static final SubLSymbol SBHL_MOD_MARKING_FN = makeSymbol("SBHL-MOD-MARKING-FN");

    private static final SubLSymbol _CSETF_SBHL_MOD_MARKING_FN = makeSymbol("_CSETF-SBHL-MOD-MARKING-FN");

    private static final SubLSymbol SBHL_MOD_UNMARKING_FN = makeSymbol("SBHL-MOD-UNMARKING-FN");

    private static final SubLSymbol _CSETF_SBHL_MOD_UNMARKING_FN = makeSymbol("_CSETF-SBHL-MOD-UNMARKING-FN");

    private static final SubLSymbol SBHL_MOD_VAR_BINDINGS = makeSymbol("SBHL-MOD-VAR-BINDINGS");

    private static final SubLSymbol _CSETF_SBHL_MOD_VAR_BINDINGS = makeSymbol("_CSETF-SBHL-MOD-VAR-BINDINGS");

    private static final SubLSymbol SBHL_MOD_MISC_PROPERTIES = makeSymbol("SBHL-MOD-MISC-PROPERTIES");

    private static final SubLSymbol _CSETF_SBHL_MOD_MISC_PROPERTIES = makeSymbol("_CSETF-SBHL-MOD-MISC-PROPERTIES");

    private static final SubLSymbol $ACCESSIBLE_LINK_PREDS = makeKeyword("ACCESSIBLE-LINK-PREDS");

    private static final SubLSymbol $PATH_TERMINATING_MARK_FN = makeKeyword("PATH-TERMINATING-MARK-FN");

    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SBHL_MODULE = makeSymbol("MAKE-SBHL-MODULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-METHOD");

    private static final SubLString $str51$__SBHL_MODULE__ = makeString("#<SBHL-MODULE: ");

    private static final SubLString $str52$_ = makeString(">");

    private static final SubLString $str55$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_MODULE_PROPERTY_P = makeSymbol("SBHL-MODULE-PROPERTY-P");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str60$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLSymbol $kw61$PATH_TERMINATING_MARK__FN = makeKeyword("PATH-TERMINATING-MARK?-FN");

    public static final SubLSymbol $sbhl_modules$ = makeSymbol("*SBHL-MODULES*");

    private static final SubLString $str63$____SBHL_module_store_has_been_co = makeString(";;; SBHL module store has been converted to new format.~&");

    private static final SubLString $str64$____No_KB_has_been_loaded__SBHL_m = makeString(";;; No KB has been loaded, SBHL module store format is fine.~&");

    private static final SubLString $str65$____Unexpected_SBHL_module_store_ = makeString(";;; Unexpected SBHL module store format ~A ... SBHL may not work.~&");

    private static final SubLSymbol SBHL_PREDICATE_OBJECT_P = makeSymbol("SBHL-PREDICATE-OBJECT-P");

    private static final SubLSymbol SBHL_MODULE_OBJECT_P = makeSymbol("SBHL-MODULE-OBJECT-P");

    private static final SubLList $list69 = list(list(makeSymbol("MODULE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym70$KEY = makeUninternedSymbol("KEY");

    private static final SubLList $list72 = list(makeSymbol("GET-SBHL-MODULES"));

    private static final SubLList $list75 = list(makeKeyword("SIMPLE-REFLEXIVE"), makeKeyword("SIMPLE-NON-REFLEXIVE"), makeKeyword("TRANSFERS-THROUGH"), makeKeyword("DISJOINS"), $TIME);

    private static final SubLSymbol $SIMPLE_NON_REFLEXIVE = makeKeyword("SIMPLE-NON-REFLEXIVE");

    private static final SubLSymbol $sym81$MODULE = makeUninternedSymbol("MODULE");

    private static final SubLSymbol DO_SBHL_MODULES = makeSymbol("DO-SBHL-MODULES");

    private static final SubLSymbol SBHL_SIMPLE_MODULE_P = makeSymbol("SBHL-SIMPLE-MODULE-P");

    private static final SubLSymbol GET_SBHL_LINK_PRED = makeSymbol("GET-SBHL-LINK-PRED");

    private static final SubLSymbol $sym87$MODULE = makeUninternedSymbol("MODULE");

    private static final SubLSymbol SBHL_TIME_MODULE_P = makeSymbol("SBHL-TIME-MODULE-P");

    private static final SubLList $list89 = list(list(makeSymbol("PRED-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym90$MODULE = makeUninternedSymbol("MODULE");

    private static final SubLSymbol $sbhl_module_properties$ = makeSymbol("*SBHL-MODULE-PROPERTIES*");

    private static final SubLSymbol SBHL_LINK_STYLE_SPECIFIER_P = makeSymbol("SBHL-LINK-STYLE-SPECIFIER-P");

    private static final SubLSymbol $NAUT_FORWARD_TRUE_GENERATORS = makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");

    private static final SubLSymbol FUNCTION_SYMBOL_LIST_P = makeSymbol("FUNCTION-SYMBOL-LIST-P");

    private static final SubLSymbol SBHL_MODULE_TYPE_P = makeSymbol("SBHL-MODULE-TYPE-P");

    private static final SubLSymbol FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");

    private static final SubLSymbol $MODULE_INVERTS_ARGUMENTS = makeKeyword("MODULE-INVERTS-ARGUMENTS");

    private static final SubLSymbol SBHL_MODULE_OR_PREDICATE_P = makeSymbol("SBHL-MODULE-OR-PREDICATE-P");

    private static final SubLSymbol $INVERTS_ARGUMENTS_OF_MODULE = makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");

    private static final SubLSymbol $TRANSFERS_THROUGH_MODULE = makeKeyword("TRANSFERS-THROUGH-MODULE");

    private static final SubLSymbol $TRANSFERS_VIA_ARG = makeKeyword("TRANSFERS-VIA-ARG");

    private static final SubLSymbol $ADD_NODE_TO_RESULT_TEST = makeKeyword("ADD-NODE-TO-RESULT-TEST");

    private static final SubLSymbol $ADD_UNMARKED_NODE_TO_RESULT_TEST = makeKeyword("ADD-UNMARKED-NODE-TO-RESULT-TEST");

    private static final SubLSymbol $PREDICATE_SEARCH_P = makeKeyword("PREDICATE-SEARCH-P");

    private static final SubLSymbol SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");

    private static final SubLSymbol $SBHL_MARKING_PARAMETERS = makeKeyword("SBHL-MARKING-PARAMETERS");

    static private final SubLList $list116 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("TEST-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list118 = list(makeSymbol("GET-SBHL-MODULE-PROPERTIES"));

    private static final SubLList $list119 = list(makeKeyword("LINK-PRED"), makeKeyword("LINK-STYLE"), makeKeyword("MODULE-TYPE"), makeKeyword("PATH-TERMINATING-MARK?-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("INDEX-ARG"), makeKeyword("GRAPH"));

    private static final SubLList $list120 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SMART_CSOME = makeSymbol("SMART-CSOME");

    private static final SubLList $list122 = list(makeSymbol("GET-SBHL-MODULE-REQUIRED-PROPERTIES"));

    private static final SubLString $str123$_A_is_not_a_valid_sbhl_predicate_ = makeString("~A is not a valid sbhl-predicate-p");

    private static final SubLList $list124 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_module$ = makeSymbol("*SBHL-MODULE*");

    private static final SubLList $list127 = list(makeSymbol("*SBHL-MODULE*"));





    private static final SubLString $str130$Term___a__is_not_used_to_specify_ = makeString("Term, ~a, is not used to specify directed nor undirected graphs");

    private static final SubLList $list131 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));

    private static final SubLSymbol $sym132$SBHL_MODULES_LINK_PRED__ = makeSymbol("SBHL-MODULES-LINK-PRED-<");

    private static final SubLSymbol $sym133$_ = makeSymbol(">");



    public static final SubLObject sbhl_module_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.print_sbhl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sbhl_module_vars.print_sbhl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_module_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.$sbhl_module_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_module_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.$sbhl_module_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_mod_link_pred_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_mod_link_pred(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sbhl_mod_accessible_link_preds_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField3();
    }

    public static SubLObject sbhl_mod_accessible_link_preds(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sbhl_mod_graph_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField4();
    }

    public static SubLObject sbhl_mod_graph(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sbhl_mod_link_style_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField5();
    }

    public static SubLObject sbhl_mod_link_style(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sbhl_mod_index_arg_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField6();
    }

    public static SubLObject sbhl_mod_index_arg(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sbhl_mod_module_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField7();
    }

    public static SubLObject sbhl_mod_module_type(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sbhl_mod_type_test_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField8();
    }

    public static SubLObject sbhl_mod_type_test(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject sbhl_mod_path_terminating_mark_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField9();
    }

    public static SubLObject sbhl_mod_path_terminating_mark_fn(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject sbhl_mod_marking_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField10();
    }

    public static SubLObject sbhl_mod_marking_fn(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject sbhl_mod_unmarking_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField11();
    }

    public static SubLObject sbhl_mod_unmarking_fn(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject sbhl_mod_var_bindings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField12();
    }

    public static SubLObject sbhl_mod_var_bindings(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject sbhl_mod_misc_properties_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.getField13();
    }

    public static SubLObject sbhl_mod_misc_properties(final SubLObject v_object) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject _csetf_sbhl_mod_link_pred_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_mod_link_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sbhl_mod_accessible_link_preds_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_mod_accessible_link_preds(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sbhl_mod_graph_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sbhl_mod_graph(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sbhl_mod_link_style_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sbhl_mod_link_style(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sbhl_mod_index_arg_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sbhl_mod_index_arg(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sbhl_mod_module_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sbhl_mod_module_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sbhl_mod_type_test_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sbhl_mod_type_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_sbhl_mod_path_terminating_mark_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sbhl_mod_path_terminating_mark_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_sbhl_mod_marking_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sbhl_mod_marking_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_sbhl_mod_unmarking_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_sbhl_mod_unmarking_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_sbhl_mod_var_bindings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_sbhl_mod_var_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_sbhl_mod_misc_properties_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_sbhl_mod_misc_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_vars.sbhl_module_p(v_object) : "! sbhl_module_vars.sbhl_module_p(v_object) " + "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_sbhl_module_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.$sbhl_module_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LINK_PRED)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_link_pred(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ACCESSIBLE_LINK_PREDS)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_accessible_link_preds(v_new, current_value);
                        } else {
                            if (pcase_var.eql($GRAPH)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_graph(v_new, current_value);
                            } else {
                                if (pcase_var.eql($LINK_STYLE)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_link_style(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($INDEX_ARG)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_index_arg(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($MODULE_TYPE)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_module_type(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($TYPE_TEST)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_type_test(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($PATH_TERMINATING_MARK_FN)) {
                                                    com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_path_terminating_mark_fn(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($MARKING_FN)) {
                                                        com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_marking_fn(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($UNMARKING_FN)) {
                                                            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_unmarking_fn(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($VAR_BINDINGS)) {
                                                                com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_var_bindings(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($MISC_PROPERTIES)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_misc_properties(v_new, current_value);
                                                                } else {
                                                                    Errors.error($str_alt44$Invalid_slot__S_for_construction_, current_arg);
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
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sbhl_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.$sbhl_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LINK_PRED)) {
                sbhl_module_vars._csetf_sbhl_mod_link_pred(v_new, current_value);
            } else
                if (pcase_var.eql(sbhl_module_vars.$ACCESSIBLE_LINK_PREDS)) {
                    sbhl_module_vars._csetf_sbhl_mod_accessible_link_preds(v_new, current_value);
                } else
                    if (pcase_var.eql($GRAPH)) {
                        sbhl_module_vars._csetf_sbhl_mod_graph(v_new, current_value);
                    } else
                        if (pcase_var.eql($LINK_STYLE)) {
                            sbhl_module_vars._csetf_sbhl_mod_link_style(v_new, current_value);
                        } else
                            if (pcase_var.eql($INDEX_ARG)) {
                                sbhl_module_vars._csetf_sbhl_mod_index_arg(v_new, current_value);
                            } else
                                if (pcase_var.eql($MODULE_TYPE)) {
                                    sbhl_module_vars._csetf_sbhl_mod_module_type(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TYPE_TEST)) {
                                        sbhl_module_vars._csetf_sbhl_mod_type_test(v_new, current_value);
                                    } else
                                        if (pcase_var.eql(sbhl_module_vars.$PATH_TERMINATING_MARK_FN)) {
                                            sbhl_module_vars._csetf_sbhl_mod_path_terminating_mark_fn(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($MARKING_FN)) {
                                                sbhl_module_vars._csetf_sbhl_mod_marking_fn(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($UNMARKING_FN)) {
                                                    sbhl_module_vars._csetf_sbhl_mod_unmarking_fn(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($VAR_BINDINGS)) {
                                                        sbhl_module_vars._csetf_sbhl_mod_var_bindings(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($MISC_PROPERTIES)) {
                                                            sbhl_module_vars._csetf_sbhl_mod_misc_properties(v_new, current_value);
                                                        } else {
                                                            Errors.error(sbhl_module_vars.$str45$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_module_vars.MAKE_SBHL_MODULE, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LINK_PRED, sbhl_module_vars.sbhl_mod_link_pred(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_module_vars.$ACCESSIBLE_LINK_PREDS, sbhl_module_vars.sbhl_mod_accessible_link_preds(obj));
        funcall(visitor_fn, obj, $SLOT, $GRAPH, sbhl_module_vars.sbhl_mod_graph(obj));
        funcall(visitor_fn, obj, $SLOT, $LINK_STYLE, sbhl_module_vars.sbhl_mod_link_style(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX_ARG, sbhl_module_vars.sbhl_mod_index_arg(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE_TYPE, sbhl_module_vars.sbhl_mod_module_type(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE_TEST, sbhl_module_vars.sbhl_mod_type_test(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_module_vars.$PATH_TERMINATING_MARK_FN, sbhl_module_vars.sbhl_mod_path_terminating_mark_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $MARKING_FN, sbhl_module_vars.sbhl_mod_marking_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $UNMARKING_FN, sbhl_module_vars.sbhl_mod_unmarking_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR_BINDINGS, sbhl_module_vars.sbhl_mod_var_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $MISC_PROPERTIES, sbhl_module_vars.sbhl_mod_misc_properties(obj));
        funcall(visitor_fn, obj, $END, sbhl_module_vars.MAKE_SBHL_MODULE, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_module_vars.visit_defstruct_sbhl_module(obj, visitor_fn);
    }

    public static final SubLObject print_sbhl_module_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_module_p(v_object)) {
            format(stream, $str_alt45$__SBHL_MODULE__);
            prin1(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_link_pred(v_object), stream);
            format(stream, $str_alt46$_);
        } else {
            compatibility.default_struct_print_function(v_object, stream, depth);
        }
        return v_object;
    }

    public static SubLObject print_sbhl_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != sbhl_module_vars.sbhl_module_p(v_object)) {
            format(stream, sbhl_module_vars.$str51$__SBHL_MODULE__);
            prin1(sbhl_module_vars.sbhl_mod_link_pred(v_object), stream);
            format(stream, sbhl_module_vars.$str52$_);
        } else {
            compatibility.default_struct_print_function(v_object, stream, depth);
        }
        return v_object;
    }

    public static final SubLObject new_sbhl_module_alt(SubLObject pred) {
        SubLTrampolineFile.checkType(pred, FORT_P);
        {
            SubLObject module = com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.make_sbhl_module(UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_link_pred(module, pred);
            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_misc_properties(module, dictionary.new_dictionary(EQ, ZERO_INTEGER));
            return module;
        }
    }

    public static SubLObject new_sbhl_module(final SubLObject pred) {
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        final SubLObject module = sbhl_module_vars.make_sbhl_module(UNPROVIDED);
        sbhl_module_vars._csetf_sbhl_mod_link_pred(module, pred);
        sbhl_module_vars._csetf_sbhl_mod_misc_properties(module, new_dictionary(EQL, ZERO_INTEGER));
        return module;
    }

    public static final SubLObject set_sbhl_module_property_alt(SubLObject module, SubLObject property, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_module_property_p(property)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt49$_A_is_not_a__A, property, SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt49$_A_is_not_a__A, property, SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt49$_A_is_not_a__A, property, SBHL_MODULE_PROPERTY_P);
                                } else {
                                    Errors.warn($str_alt54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt49$_A_is_not_a__A, property, SBHL_MODULE_PROPERTY_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_module_p(module)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt49$_A_is_not_a__A, module, SBHL_MODULE_P);
                                } else {
                                    Errors.warn($str_alt54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_P);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject pcase_var = property;
                if (pcase_var.eql($LINK_PRED)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_link_pred(module, value);
                } else {
                    if (pcase_var.eql($ACCESSIBLE_LINK_PREDS)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_accessible_link_preds(module, value);
                    } else {
                        if (pcase_var.eql($GRAPH)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_graph(module, value);
                        } else {
                            if (pcase_var.eql($LINK_STYLE)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_link_style(module, value);
                            } else {
                                if (pcase_var.eql($INDEX_ARG)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_index_arg(module, value);
                                } else {
                                    if (pcase_var.eql($MODULE_TYPE)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_module_type(module, value);
                                    } else {
                                        if (pcase_var.eql($TYPE_TEST)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_type_test(module, value);
                                        } else {
                                            if (pcase_var.eql($kw55$PATH_TERMINATING_MARK__FN)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_path_terminating_mark_fn(module, value);
                                            } else {
                                                if (pcase_var.eql($MARKING_FN)) {
                                                    com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_marking_fn(module, value);
                                                } else {
                                                    if (pcase_var.eql($UNMARKING_FN)) {
                                                        com.cyc.cycjava.cycl.sbhl.sbhl_module_vars._csetf_sbhl_mod_unmarking_fn(module, value);
                                                    } else {
                                                        dictionary.dictionary_enter(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_misc_properties(module), property, value);
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
            }
            return module;
        }
    }

    public static SubLObject set_sbhl_module_property(final SubLObject module, final SubLObject property, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_vars.sbhl_module_property_p(property))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_module_vars.$str55$_A_is_not_a__A, property, sbhl_module_vars.SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, property, sbhl_module_vars.SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_module_vars.$str55$_A_is_not_a__A, property, sbhl_module_vars.SBHL_MODULE_PROPERTY_P);
                    } else {
                        Errors.warn(sbhl_module_vars.$str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, property, sbhl_module_vars.SBHL_MODULE_PROPERTY_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_vars.sbhl_module_p(module))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_module_vars.$str55$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_module_vars.$str55$_A_is_not_a__A, module, SBHL_MODULE_P);
                    } else {
                        Errors.warn(sbhl_module_vars.$str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, module, SBHL_MODULE_P);
                    }


        }
        if (property.eql($LINK_PRED)) {
            sbhl_module_vars._csetf_sbhl_mod_link_pred(module, value);
        } else
            if (property.eql(sbhl_module_vars.$ACCESSIBLE_LINK_PREDS)) {
                sbhl_module_vars._csetf_sbhl_mod_accessible_link_preds(module, value);
            } else
                if (property.eql($GRAPH)) {
                    sbhl_module_vars._csetf_sbhl_mod_graph(module, value);
                } else
                    if (property.eql($LINK_STYLE)) {
                        sbhl_module_vars._csetf_sbhl_mod_link_style(module, value);
                    } else
                        if (property.eql($INDEX_ARG)) {
                            sbhl_module_vars._csetf_sbhl_mod_index_arg(module, value);
                        } else
                            if (property.eql($MODULE_TYPE)) {
                                sbhl_module_vars._csetf_sbhl_mod_module_type(module, value);
                            } else
                                if (property.eql($TYPE_TEST)) {
                                    sbhl_module_vars._csetf_sbhl_mod_type_test(module, value);
                                } else
                                    if (property.eql(sbhl_module_vars.$kw61$PATH_TERMINATING_MARK__FN)) {
                                        sbhl_module_vars._csetf_sbhl_mod_path_terminating_mark_fn(module, value);
                                    } else
                                        if (property.eql($MARKING_FN)) {
                                            sbhl_module_vars._csetf_sbhl_mod_marking_fn(module, value);
                                        } else
                                            if (property.eql($UNMARKING_FN)) {
                                                sbhl_module_vars._csetf_sbhl_mod_unmarking_fn(module, value);
                                            } else {
                                                dictionary_enter(sbhl_module_vars.sbhl_mod_misc_properties(module), property, value);
                                            }









        return module;
    }

    public static final SubLObject get_sbhl_module_property_alt(SubLObject module, SubLObject property) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_module_p(module)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt49$_A_is_not_a__A, module, SBHL_MODULE_P);
                                } else {
                                    Errors.warn($str_alt54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_P);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject pcase_var = property;
                if (pcase_var.eql($LINK_PRED)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_link_pred(module);
                } else {
                    if (pcase_var.eql($ACCESSIBLE_LINK_PREDS)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_accessible_link_preds(module);
                    } else {
                        if (pcase_var.eql($GRAPH)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_graph(module);
                        } else {
                            if (pcase_var.eql($LINK_STYLE)) {
                                return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_link_style(module);
                            } else {
                                if (pcase_var.eql($INDEX_ARG)) {
                                    return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_index_arg(module);
                                } else {
                                    if (pcase_var.eql($MODULE_TYPE)) {
                                        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_module_type(module);
                                    } else {
                                        if (pcase_var.eql($TYPE_TEST)) {
                                            return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_type_test(module);
                                        } else {
                                            if (pcase_var.eql($kw55$PATH_TERMINATING_MARK__FN)) {
                                                return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_path_terminating_mark_fn(module);
                                            } else {
                                                if (pcase_var.eql($MARKING_FN)) {
                                                    return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_marking_fn(module);
                                                } else {
                                                    if (pcase_var.eql($UNMARKING_FN)) {
                                                        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_unmarking_fn(module);
                                                    } else {
                                                        return dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_misc_properties(module), property, UNPROVIDED);
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
            }
        }
    }

    public static SubLObject get_sbhl_module_property(final SubLObject module, final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_vars.sbhl_module_p(module))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_module_vars.$str55$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_module_vars.$str55$_A_is_not_a__A, module, SBHL_MODULE_P);
                    } else {
                        Errors.warn(sbhl_module_vars.$str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, module, SBHL_MODULE_P);
                    }


        }
        if (property.eql($LINK_PRED)) {
            return sbhl_module_vars.sbhl_mod_link_pred(module);
        }
        if (property.eql(sbhl_module_vars.$ACCESSIBLE_LINK_PREDS)) {
            return sbhl_module_vars.sbhl_mod_accessible_link_preds(module);
        }
        if (property.eql($GRAPH)) {
            return sbhl_module_vars.sbhl_mod_graph(module);
        }
        if (property.eql($LINK_STYLE)) {
            return sbhl_module_vars.sbhl_mod_link_style(module);
        }
        if (property.eql($INDEX_ARG)) {
            return sbhl_module_vars.sbhl_mod_index_arg(module);
        }
        if (property.eql($MODULE_TYPE)) {
            return sbhl_module_vars.sbhl_mod_module_type(module);
        }
        if (property.eql($TYPE_TEST)) {
            return sbhl_module_vars.sbhl_mod_type_test(module);
        }
        if (property.eql(sbhl_module_vars.$kw61$PATH_TERMINATING_MARK__FN)) {
            return sbhl_module_vars.sbhl_mod_path_terminating_mark_fn(module);
        }
        if (property.eql($MARKING_FN)) {
            return sbhl_module_vars.sbhl_mod_marking_fn(module);
        }
        if (property.eql($UNMARKING_FN)) {
            return sbhl_module_vars.sbhl_mod_unmarking_fn(module);
        }
        return dictionary_lookup_without_values(sbhl_module_vars.sbhl_mod_misc_properties(module), property, UNPROVIDED);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_link_pred_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_link_pred(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_link_pred(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_link_pred(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_accessible_link_preds_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_accessible_link_preds(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_accessible_link_preds(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_accessible_link_preds(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_graph_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_graph(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_graph(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_graph(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_link_style_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_link_style(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_link_style(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_link_style(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_index_arg_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_index_arg(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_index_arg(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_index_arg(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_module_type_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_module_type(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_module_type(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_module_type(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_type_test_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_type_test(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_type_test(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_type_test(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_path_terminating_mark_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_path_terminating_mark_fn(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_path_terminating_mark(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_path_terminating_mark_fn(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_marking_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_marking_fn(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_marking_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_marking_fn(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static final SubLObject get_sbhl_module_unmarking_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_mod_unmarking_fn(module);
    }

    /**
     * Accessor. @return  . Returns the  associated with MODULE.
     */
    @LispMethod(comment = "Accessor. @return  . Returns the  associated with MODULE.")
    public static SubLObject get_sbhl_module_unmarking_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_mod_unmarking_fn(module);
    }

    public static SubLObject check_sbhl_modules_store_for_legacy_format() {
        if (NIL != dictionary_p(sbhl_module_vars.$sbhl_modules$.getGlobalValue())) {
            sbhl_module_vars.$sbhl_modules$.setGlobalValue(dictionary_utilities.dictionary_to_alist(sbhl_module_vars.$sbhl_modules$.getGlobalValue()));
            Errors.warn(sbhl_module_vars.$str63$____SBHL_module_store_has_been_co);
        } else
            if (NIL == list_utilities.alist_p(sbhl_module_vars.$sbhl_modules$.getGlobalValue())) {
                if (NIL == sbhl_module_vars.$sbhl_modules$.getGlobalValue()) {
                    Errors.warn(sbhl_module_vars.$str64$____No_KB_has_been_loaded__SBHL_m);
                } else {
                    Errors.warn(sbhl_module_vars.$str65$____Unexpected_SBHL_module_store_, type_of(sbhl_module_vars.$sbhl_modules$.getGlobalValue()));
                }
            }

        return $CHECKED;
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a @see dictionary-p.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a @see dictionary-p.")
    public static final SubLObject sbhl_module_object_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_module_p(v_object);
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a @see dictionary-p.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a @see dictionary-p.")
    public static SubLObject sbhl_module_object_p(final SubLObject v_object) {
        return sbhl_module_vars.sbhl_module_p(v_object);
    }

    public static final SubLObject reset_sbhl_modules_alt() {
        $sbhl_modules$.setGlobalValue(dictionary.new_dictionary($sbhl_module_key_test$.getGlobalValue(), UNPROVIDED));
        return NIL;
    }

    public static SubLObject reset_sbhl_modules() {
        sbhl_module_vars.$sbhl_modules$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject rebuild_sbhl_modules_alt() {
        dictionary.dictionary_rebuild($sbhl_modules$.getGlobalValue());
        return T;
    }

    public static SubLObject rebuild_sbhl_modules() {
        return T;
    }

    /**
     *
     *
     * @return dictionary-p; the defined sbhl modules, which each correspond directly to link a link table. @see *sbhl-modules*
     */
    @LispMethod(comment = "@return dictionary-p; the defined sbhl modules, which each correspond directly to link a link table. @see *sbhl-modules*")
    public static final SubLObject get_sbhl_modules_alt() {
        return $sbhl_modules$.getGlobalValue();
    }

    /**
     *
     *
     * @return dictionary-p; the defined sbhl modules, which each correspond directly to link a link table. @see *sbhl-modules*
     */
    @LispMethod(comment = "@return dictionary-p; the defined sbhl modules, which each correspond directly to link a link table. @see *sbhl-modules*")
    public static SubLObject get_sbhl_modules() {
        return sbhl_module_vars.$sbhl_modules$.getGlobalValue();
    }

    /**
     * modifier. enters MODULE into *sbhl-modules*. assumes *sbhl-modules* is a dictionary. checks that MODULE-KEY is a fort-p, and MODULE-DATA is a dictionary-p
     */
    @LispMethod(comment = "modifier. enters MODULE into *sbhl-modules*. assumes *sbhl-modules* is a dictionary. checks that MODULE-KEY is a fort-p, and MODULE-DATA is a dictionary-p")
    public static final SubLObject add_sbhl_module_alt(SubLObject predicate, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_predicate_object_p(predicate)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt49$_A_is_not_a__A, predicate, SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt49$_A_is_not_a__A, predicate, SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt49$_A_is_not_a__A, predicate, SBHL_PREDICATE_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt49$_A_is_not_a__A, predicate, SBHL_PREDICATE_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_module_object_p(module)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt49$_A_is_not_a__A, module, SBHL_MODULE_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt49$_A_is_not_a__A, module, SBHL_MODULE_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            dictionary.dictionary_enter($sbhl_modules$.getGlobalValue(), predicate, module);
            sbhl_module_utilities.clear_get_sbhl_predicates();
            return NIL;
        }
    }

    /**
     * modifier. enters MODULE into *sbhl-modules*. assumes *sbhl-modules* is a dictionary. checks that MODULE-KEY is a fort-p, and MODULE-DATA is a dictionary-p
     */
    @LispMethod(comment = "modifier. enters MODULE into *sbhl-modules*. assumes *sbhl-modules* is a dictionary. checks that MODULE-KEY is a fort-p, and MODULE-DATA is a dictionary-p")
    public static SubLObject add_sbhl_module(final SubLObject predicate, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_vars.sbhl_predicate_object_p(predicate))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_module_vars.$str55$_A_is_not_a__A, predicate, sbhl_module_vars.SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, predicate, sbhl_module_vars.SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_module_vars.$str55$_A_is_not_a__A, predicate, sbhl_module_vars.SBHL_PREDICATE_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_module_vars.$str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, predicate, sbhl_module_vars.SBHL_PREDICATE_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_vars.sbhl_module_object_p(module))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_module_vars.$str55$_A_is_not_a__A, module, sbhl_module_vars.SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, module, sbhl_module_vars.SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_module_vars.$str55$_A_is_not_a__A, module, sbhl_module_vars.SBHL_MODULE_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_module_vars.$str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_module_vars.$$$continue_anyway, sbhl_module_vars.$str55$_A_is_not_a__A, module, sbhl_module_vars.SBHL_MODULE_OBJECT_P);
                    }


        }
        sbhl_module_vars.$sbhl_modules$.setGlobalValue(acons(predicate, module, sbhl_module_vars.$sbhl_modules$.getGlobalValue()));
        sbhl_module_utilities.clear_get_sbhl_predicates();
        return NIL;
    }

    /**
     * modifier. removes the module (if any) for PREDICATE from *sbhl-modules*.
     */
    @LispMethod(comment = "modifier. removes the module (if any) for PREDICATE from *sbhl-modules*.")
    public static final SubLObject remove_sbhl_module_alt(SubLObject predicate) {
        dictionary.dictionary_remove($sbhl_modules$.getGlobalValue(), predicate);
        sbhl_module_utilities.clear_get_sbhl_predicates();
        return NIL;
    }

    /**
     * modifier. removes the module (if any) for PREDICATE from *sbhl-modules*.
     */
    @LispMethod(comment = "modifier. removes the module (if any) for PREDICATE from *sbhl-modules*.")
    public static SubLObject remove_sbhl_module(final SubLObject predicate) {
        sbhl_module_vars.$sbhl_modules$.setGlobalValue(list_utilities.alist_delete_without_values(sbhl_module_vars.$sbhl_modules$.getGlobalValue(), predicate, UNPROVIDED));
        sbhl_module_utilities.clear_get_sbhl_predicates();
        return NIL;
    }

    /**
     * iterator over *sbhl-modules* dictionary
     */
    @LispMethod(comment = "iterator over *sbhl-modules* dictionary")
    public static final SubLObject do_sbhl_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject module_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    module_var = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt59);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject key = $sym60$KEY;
                                return listS(DO_DICTIONARY, list(key, module_var, $list_alt62, done_var), list(IGNORE, key), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt59);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * iterator over *sbhl-modules* dictionary
     */
    @LispMethod(comment = "iterator over *sbhl-modules* dictionary")
    public static SubLObject do_sbhl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list69);
        module_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, sbhl_module_vars.$list69);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject key = sbhl_module_vars.$sym70$KEY;
            return listS(DO_ALIST, list(key, module_var, sbhl_module_vars.$list72, $DONE, done_var), list(IGNORE, key), append(body, NIL));
        }
        cdestructuring_bind_error(datum, sbhl_module_vars.$list69);
        return NIL;
    }

    /**
     *
     *
     * @return listp; the defined sbhl predicates. @see *sbhl-modules*
     */
    @LispMethod(comment = "@return listp; the defined sbhl predicates. @see *sbhl-modules*")
    public static final SubLObject get_sbhl_predicates_int_alt() {
        return dictionary.dictionary_keys(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_modules());
    }

    /**
     *
     *
     * @return listp; the defined sbhl predicates. @see *sbhl-modules*
     */
    @LispMethod(comment = "@return listp; the defined sbhl predicates. @see *sbhl-modules*")
    public static SubLObject get_sbhl_predicates_int() {
        return list_utilities.alist_keys(sbhl_module_vars.get_sbhl_modules());
    }

    /**
     * Return what the sbhl module structures that the predicates point to.
     */
    @LispMethod(comment = "Return what the sbhl module structures that the predicates point to.")
    public static final SubLObject get_sbhl_module_list_alt() {
        return dictionary.dictionary_values(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_modules());
    }

    /**
     * Return what the sbhl module structures that the predicates point to.
     */
    @LispMethod(comment = "Return what the sbhl module structures that the predicates point to.")
    public static SubLObject get_sbhl_module_list() {
        return list_utilities.alist_values(sbhl_module_vars.get_sbhl_modules());
    }

    /**
     * Type test for candidate sbhl-predicates.
     */
    @LispMethod(comment = "Type test for candidate sbhl-predicates.")
    public static final SubLObject sbhl_predicate_object_p_alt(SubLObject v_object) {
        return fort_p(v_object);
    }

    /**
     * Type test for candidate sbhl-predicates.
     */
    @LispMethod(comment = "Type test for candidate sbhl-predicates.")
    public static SubLObject sbhl_predicate_object_p(final SubLObject v_object) {
        return forts.fort_p(v_object);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is of the simple transitive and reflexive variety.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is of the simple transitive and reflexive variety.")
    public static final SubLObject sbhl_simple_reflexive_module_type_p_alt(SubLObject module_type) {
        return eq(module_type, $SIMPLE_REFLEXIVE);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is of the simple transitive and reflexive variety.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is of the simple transitive and reflexive variety.")
    public static SubLObject sbhl_simple_reflexive_module_type_p(final SubLObject module_type) {
        return eq(module_type, $SIMPLE_REFLEXIVE);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is of the simple transitive but irreflexive variety.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is of the simple transitive but irreflexive variety.")
    public static final SubLObject sbhl_simple_non_reflexive_module_type_p_alt(SubLObject module_type) {
        return eq(module_type, $SIMPLE_NON_REFLEXIVE);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is of the simple transitive but irreflexive variety.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is of the simple transitive but irreflexive variety.")
    public static SubLObject sbhl_simple_non_reflexive_module_type_p(final SubLObject module_type) {
        return eq(module_type, sbhl_module_vars.$SIMPLE_NON_REFLEXIVE);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is the keyword for transfers-through sbhl modules.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is the keyword for transfers-through sbhl modules.")
    public static final SubLObject sbhl_transfers_through_module_type_p_alt(SubLObject module_type) {
        return eq(module_type, $TRANSFERS_THROUGH);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is the keyword for transfers-through sbhl modules.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is the keyword for transfers-through sbhl modules.")
    public static SubLObject sbhl_transfers_through_module_type_p(final SubLObject module_type) {
        return eq(module_type, $TRANSFERS_THROUGH);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is the keyword for disjoins sbhl modules.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is the keyword for disjoins sbhl modules.")
    public static final SubLObject sbhl_disjoins_module_type_p_alt(SubLObject module_type) {
        return eq(module_type, $DISJOINS);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is the keyword for disjoins sbhl modules.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is the keyword for disjoins sbhl modules.")
    public static SubLObject sbhl_disjoins_module_type_p(final SubLObject module_type) {
        return eq(module_type, $DISJOINS);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is the keyword for sbhl time modules.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is the keyword for sbhl time modules.")
    public static final SubLObject sbhl_time_module_type_p_alt(SubLObject module_type) {
        return eq(module_type, $TIME);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is the keyword for sbhl time modules.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is the keyword for sbhl time modules.")
    public static SubLObject sbhl_time_module_type_p(final SubLObject module_type) {
        return eq(module_type, $TIME);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is the keyword for simple sbhl modules, or for sbhl time modules.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is the keyword for simple sbhl modules, or for sbhl time modules.")
    public static final SubLObject sbhl_transitive_module_type_p_alt(SubLObject module_type) {
        return makeBoolean(((module_type == $SIMPLE_REFLEXIVE) || (module_type == $SIMPLE_NON_REFLEXIVE)) || (module_type == $TIME));
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is the keyword for simple sbhl modules, or for sbhl time modules.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is the keyword for simple sbhl modules, or for sbhl time modules.")
    public static SubLObject sbhl_transitive_module_type_p(final SubLObject module_type) {
        return makeBoolean(((module_type == $SIMPLE_REFLEXIVE) || (module_type == sbhl_module_vars.$SIMPLE_NON_REFLEXIVE)) || (module_type == $TIME));
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is a member of @see *sbhl-module-types*.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is a member of @see *sbhl-module-types*.")
    public static final SubLObject sbhl_module_type_p_alt(SubLObject module_type) {
        return subl_promotions.memberP(module_type, $sbhl_module_types$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether MODULE-TYPE is a member of @see *sbhl-module-types*.
     */
    @LispMethod(comment = "@return booleanp; whether MODULE-TYPE is a member of @see *sbhl-module-types*.")
    public static SubLObject sbhl_module_type_p(final SubLObject module_type) {
        return subl_promotions.memberP(module_type, sbhl_module_vars.$sbhl_module_types$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    /**
     * iterator over simple transitive sbhl predicates
     */
    @LispMethod(comment = "iterator over simple transitive sbhl predicates")
    public static final SubLObject do_sbhl_simple_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject module_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    module_var = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt59);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject module = $sym70$MODULE;
                                return list(DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(SBHL_SIMPLE_MODULE_P, module), listS(CLET, list(list(module_var, list(GET_SBHL_LINK_PRED, module))), append(body, NIL))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt59);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * iterator over simple transitive sbhl predicates
     */
    @LispMethod(comment = "iterator over simple transitive sbhl predicates")
    public static SubLObject do_sbhl_simple_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list69);
        module_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, sbhl_module_vars.$list69);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = sbhl_module_vars.$sym81$MODULE;
            return list(sbhl_module_vars.DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(sbhl_module_vars.SBHL_SIMPLE_MODULE_P, module), listS(CLET, list(list(module_var, list(sbhl_module_vars.GET_SBHL_LINK_PRED, module))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, sbhl_module_vars.$list69);
        return NIL;
    }

    /**
     * iterator over sbhl predicates used for temporal reasoning
     */
    @LispMethod(comment = "iterator over sbhl predicates used for temporal reasoning")
    public static final SubLObject do_sbhl_time_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject module_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    module_var = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt59);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject module = $sym76$MODULE;
                                return list(DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(SBHL_TIME_MODULE_P, module), listS(CLET, list(list(module_var, module)), append(body, NIL))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt59);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * iterator over sbhl predicates used for temporal reasoning
     */
    @LispMethod(comment = "iterator over sbhl predicates used for temporal reasoning")
    public static SubLObject do_sbhl_time_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list69);
        module_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, sbhl_module_vars.$list69);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = sbhl_module_vars.$sym87$MODULE;
            return list(sbhl_module_vars.DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(sbhl_module_vars.SBHL_TIME_MODULE_P, module), listS(CLET, list(list(module_var, module)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, sbhl_module_vars.$list69);
        return NIL;
    }

    /**
     * iterator over sbhl predicates used for temporal reasoning
     */
    @LispMethod(comment = "iterator over sbhl predicates used for temporal reasoning")
    public static final SubLObject do_sbhl_time_predicates_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt78);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject pred_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt78);
                    pred_var = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt78);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject module = $sym79$MODULE;
                                return list(DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(SBHL_TIME_MODULE_P, module), listS(CLET, list(list(pred_var, list(GET_SBHL_LINK_PRED, module))), append(body, NIL))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt78);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * iterator over sbhl predicates used for temporal reasoning
     */
    @LispMethod(comment = "iterator over sbhl predicates used for temporal reasoning")
    public static SubLObject do_sbhl_time_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list89);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list89);
        pred_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, sbhl_module_vars.$list89);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = sbhl_module_vars.$sym90$MODULE;
            return list(sbhl_module_vars.DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(sbhl_module_vars.SBHL_TIME_MODULE_P, module), listS(CLET, list(list(pred_var, list(sbhl_module_vars.GET_SBHL_LINK_PRED, module))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, sbhl_module_vars.$list89);
        return NIL;
    }

    /**
     * Modifier. used to store initial values for the @see *sbhl-module-properties*
     */
    @LispMethod(comment = "Modifier. used to store initial values for the @see *sbhl-module-properties*")
    public static final SubLObject init_sbhl_module_properties_alt(SubLObject property_list) {
        {
            SubLObject cdolist_list_var = property_list;
            SubLObject property_test_pair = NIL;
            for (property_test_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property_test_pair = cdolist_list_var.first()) {
                {
                    SubLObject property = property_test_pair.first();
                    SubLObject test_fn = second(property_test_pair);
                    dictionary.dictionary_enter($sbhl_module_properties$.getGlobalValue(), property, test_fn);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. used to store initial values for the @see *sbhl-module-properties*")
    public static SubLObject init_sbhl_module_properties(final SubLObject property_list) {
        SubLObject cdolist_list_var = property_list;
        SubLObject property_test_pair = NIL;
        property_test_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject property = property_test_pair.first();
            final SubLObject test_fn = second(property_test_pair);
            dictionary_enter(sbhl_module_vars.$sbhl_module_properties$.getGlobalValue(), property, test_fn);
            cdolist_list_var = cdolist_list_var.rest();
            property_test_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return listp; the the defined sbhl module properties
     */
    @LispMethod(comment = "@return listp; the the defined sbhl module properties")
    public static final SubLObject get_sbhl_module_properties_alt() {
        return $sbhl_module_properties$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp; the the defined sbhl module properties
     */
    @LispMethod(comment = "@return listp; the the defined sbhl module properties")
    public static SubLObject get_sbhl_module_properties() {
        return sbhl_module_vars.$sbhl_module_properties$.getGlobalValue();
    }

    /**
     * modifier. pushes PROPERTY onto *sbhl-module-properties*, with associated test TEST.
     */
    @LispMethod(comment = "modifier. pushes PROPERTY onto *sbhl-module-properties*, with associated test TEST.")
    public static final SubLObject add_sbhl_module_property_alt(SubLObject property, SubLObject test) {
        dictionary.dictionary_enter($sbhl_module_properties$.getGlobalValue(), property, test);
        return NIL;
    }

    @LispMethod(comment = "modifier. pushes PROPERTY onto *sbhl-module-properties*, with associated test TEST.")
    public static SubLObject add_sbhl_module_property(final SubLObject property, final SubLObject test) {
        dictionary_enter(sbhl_module_vars.$sbhl_module_properties$.getGlobalValue(), property, test);
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether PROPERTY is a member of *sbhl-module-properties*
     */
    @LispMethod(comment = "@return booleanp; whether PROPERTY is a member of *sbhl-module-properties*")
    public static final SubLObject sbhl_module_property_p_alt(SubLObject property) {
        return dictionary.dictionary_lookup_without_values($sbhl_module_properties$.getGlobalValue(), property, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether PROPERTY is a member of *sbhl-module-properties*
     */
    @LispMethod(comment = "@return booleanp; whether PROPERTY is a member of *sbhl-module-properties*")
    public static SubLObject sbhl_module_property_p(final SubLObject property) {
        return dictionary_lookup_without_values(sbhl_module_vars.$sbhl_module_properties$.getGlobalValue(), property, UNPROVIDED);
    }

    /**
     * iterator over *sbhl-module-properties*
     */
    @LispMethod(comment = "iterator over *sbhl-module-properties*")
    public static final SubLObject do_sbhl_module_properties_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject property_var = NIL;
                    SubLObject test_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt105);
                    property_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt105);
                    test_var = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt105);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_DICTIONARY, list(property_var, test_var, $list_alt106, done_var), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt105);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "iterator over *sbhl-module-properties*")
    public static SubLObject do_sbhl_module_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list116);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property_var = NIL;
        SubLObject test_var = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list116);
        property_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list116);
        test_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, sbhl_module_vars.$list116);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, list(property_var, test_var, sbhl_module_vars.$list118, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, sbhl_module_vars.$list116);
        return NIL;
    }

    /**
     *
     *
     * @return listp; the the defined sbhl module required properties
     */
    @LispMethod(comment = "@return listp; the the defined sbhl module required properties")
    public static final SubLObject get_sbhl_module_required_properties_alt() {
        return $sbhl_module_required_properties$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp; the the defined sbhl module required properties
     */
    @LispMethod(comment = "@return listp; the the defined sbhl module required properties")
    public static SubLObject get_sbhl_module_required_properties() {
        return sbhl_module_vars.$sbhl_module_required_properties$.getGlobalValue();
    }

    /**
     *
     *
     * @return booleanp; whether PROPERTY is a member of *sbhl-module-required-properties*
     */
    @LispMethod(comment = "@return booleanp; whether PROPERTY is a member of *sbhl-module-required-properties*")
    public static final SubLObject sbhl_module_required_property_p_alt(SubLObject property) {
        return subl_promotions.memberP(property, $sbhl_module_required_properties$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether PROPERTY is a member of *sbhl-module-required-properties*
     */
    @LispMethod(comment = "@return booleanp; whether PROPERTY is a member of *sbhl-module-required-properties*")
    public static SubLObject sbhl_module_required_property_p(final SubLObject property) {
        return subl_promotions.memberP(property, sbhl_module_vars.$sbhl_module_required_properties$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    /**
     * iterator over *sbhl-module-required-properties*
     */
    @LispMethod(comment = "iterator over *sbhl-module-required-properties*")
    public static final SubLObject do_sbhl_module_required_properties_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt108);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject property_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    property_var = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt108);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(SMART_CSOME, list(property_var, $list_alt110, done_var), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt108);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "iterator over *sbhl-module-required-properties*")
    public static SubLObject do_sbhl_module_required_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property_var = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list120);
        property_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, sbhl_module_vars.$list120);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(sbhl_module_vars.SMART_CSOME, list(property_var, sbhl_module_vars.$list122, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, sbhl_module_vars.$list120);
        return NIL;
    }

    /**
     * Accessor: @return sbhl-module-p; the sbhl module for PREDICATE / defaults to *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return sbhl-module-p; the sbhl module for PREDICATE / defaults to *sbhl-module*")
    public static final SubLObject get_sbhl_module_alt(SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == predicate) {
                if (NIL == $sbhl_module$.getDynamicValue(thread)) {
                    Errors.warn($str_alt111$_sbhl_module__is_unexpectedly_nul);
                }
                return $sbhl_module$.getDynamicValue(thread);
            } else {
                if ((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_module_p($sbhl_module$.getDynamicValue(thread))) && (predicate == sbhl_module_utilities.get_sbhl_link_pred($sbhl_module$.getDynamicValue(thread)))) {
                    return $sbhl_module$.getDynamicValue(thread);
                } else {
                    {
                        SubLObject module = dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_modules(), predicate, UNPROVIDED);
                        if (NIL == module) {
                            return sbhl_paranoia.sbhl_warn(ZERO_INTEGER, $str_alt112$_A_is_not_a_valid_sbhl_predicate_, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            return module;
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-module-p; the sbhl module for PREDICATE / defaults to *sbhl-module*")
    public static SubLObject get_sbhl_module(SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == predicate) {
            return sbhl_module_vars.$sbhl_module$.getDynamicValue(thread);
        }
        if ((NIL != sbhl_module_vars.sbhl_module_p(sbhl_module_vars.$sbhl_module$.getDynamicValue(thread))) && predicate.eql(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.$sbhl_module$.getDynamicValue(thread)))) {
            return sbhl_module_vars.$sbhl_module$.getDynamicValue(thread);
        }
        final SubLObject module = list_utilities.alist_lookup_without_values(sbhl_module_vars.get_sbhl_modules(), predicate, UNPROVIDED, UNPROVIDED);
        if (NIL == module) {
            return sbhl_paranoia.sbhl_warn(ZERO_INTEGER, sbhl_module_vars.$str123$_A_is_not_a_valid_sbhl_predicate_, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return module;
    }

    /**
     * sets *sbhl-module* to MODULE within macro context
     */
    @LispMethod(comment = "sets *sbhl-module* to MODULE within macro context")
    public static final SubLObject with_sbhl_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            module = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_module$, module)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "sets *sbhl-module* to MODULE within macro context")
    public static SubLObject with_sbhl_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list124);
        module = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list(sbhl_module_vars.$sbhl_module$, module)), append(body, NIL));
    }

    public static final SubLObject possibly_with_sbhl_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            module = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_module$, listS(FIF, module, module, $list_alt116))), append(body, NIL));
            }
        }
    }

    public static SubLObject possibly_with_sbhl_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list124);
        module = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list(sbhl_module_vars.$sbhl_module$, listS(FIF, module, module, sbhl_module_vars.$list127))), append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether FORT indicates a directed or undirected graph
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether FORT indicates a directed or undirected graph")
    public static final SubLObject fort_denotes_sbhl_directed_graph_p_alt(SubLObject fort) {
        if (fort == $fort_denoting_sbhl_directed_graph$.getGlobalValue()) {
            return T;
        } else {
            if (fort == $fort_denoting_sbhl_undirected_graph$.getGlobalValue()) {
                return NIL;
            } else {
                if (NIL != sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt119$Term___a__is_not_used_to_specify_, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether FORT indicates a directed or undirected graph")
    public static SubLObject fort_denotes_sbhl_directed_graph_p(final SubLObject fort) {
        if (fort.eql(sbhl_module_vars.$fort_denoting_sbhl_directed_graph$.getGlobalValue())) {
            return T;
        }
        if (fort.eql(sbhl_module_vars.$fort_denoting_sbhl_undirected_graph$.getGlobalValue())) {
            return NIL;
        }
        if (NIL != sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_module_vars.$str130$Term___a__is_not_used_to_specify_, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
        }
        return NIL;
    }

    /**
     * Accessor: @return booleanp; whether FORT is used to specify either directed or undirected graph link styles
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether FORT is used to specify either directed or undirected graph link styles")
    public static final SubLObject sbhl_link_style_specifier_p_alt(SubLObject fort) {
        return makeBoolean((fort == $fort_denoting_sbhl_directed_graph$.getGlobalValue()) || (fort == $fort_denoting_sbhl_undirected_graph$.getGlobalValue()));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether FORT is used to specify either directed or undirected graph link styles")
    public static SubLObject sbhl_link_style_specifier_p(final SubLObject fort) {
        return makeBoolean(fort.eql(sbhl_module_vars.$fort_denoting_sbhl_directed_graph$.getGlobalValue()) || fort.eql(sbhl_module_vars.$fort_denoting_sbhl_undirected_graph$.getGlobalValue()));
    }

    public static final SubLObject clean_sbhl_modules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject predicate = sbhl_module_utilities.get_sbhl_link_pred(module);
                            if (NIL == valid_fortP(predicate)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.remove_sbhl_module(module);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.optimize_sbhl_modules();
            return NIL;
        }
    }

    public static SubLObject clean_sbhl_modules() {
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list131);
            key = current.first();
            current = module = current.rest();
            final SubLObject predicate = sbhl_module_utilities.get_sbhl_link_pred(module);
            if (NIL == forts.valid_fortP(predicate)) {
                sbhl_module_vars.remove_sbhl_module(module);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        dumper.recompute_missing_sbhl_graphs();
        sbhl_module_vars.optimize_sbhl_modules();
        return NIL;
    }

    /**
     * Optimize SBHL modules for access.
     */
    @LispMethod(comment = "Optimize SBHL modules for access.")
    public static final SubLObject optimize_sbhl_modules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $sbhl_module_link_pred_preference_order$.currentBinding(thread);
                try {
                    $sbhl_module_link_pred_preference_order$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.sbhl_module_link_pred_preference_order(), thread);
                    dictionary.dictionary_optimize(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_modules(), symbol_function($sym120$SBHL_MODULES_LINK_PRED__));
                } finally {
                    $sbhl_module_link_pred_preference_order$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Optimize SBHL modules for access.
     */
    @LispMethod(comment = "Optimize SBHL modules for access.")
    public static SubLObject optimize_sbhl_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module_link_pred_preference_order$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module_link_pred_preference_order$.bind(sbhl_module_vars.sbhl_module_link_pred_preference_order(), thread);
            list_utilities.alist_optimize(sbhl_module_vars.get_sbhl_modules(), symbol_function(sbhl_module_vars.$sym132$SBHL_MODULES_LINK_PRED__));
        } finally {
            sbhl_module_vars.$sbhl_module_link_pred_preference_order$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject sbhl_modules_link_pred_L_alt(SubLObject pred1, SubLObject pred2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return position_L(pred1, pred2, $sbhl_module_link_pred_preference_order$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED);
        }
    }

    public static SubLObject sbhl_modules_link_pred_L(final SubLObject pred1, final SubLObject pred2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.position_L(pred1, pred2, sbhl_module_vars.$sbhl_module_link_pred_preference_order$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject sbhl_module_link_pred_preference_order_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tuples = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject link_pred = sbhl_module_utilities.get_sbhl_link_pred(module);
                            SubLObject v_graph = sbhl_module_utilities.get_sbhl_graph(module);
                            SubLObject graph_size = hash_table_size(v_graph);
                            tuples = cons(list(link_pred, graph_size), tuples);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                tuples = Sort.stable_sort(tuples, symbol_function($sym121$_), symbol_function(SECOND));
                {
                    SubLObject link_preds = nmapcar(symbol_function(FIRST), tuples);
                    link_preds = cons($$genls, delete($$genls, link_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    return link_preds;
                }
            }
        }
    }

    public static SubLObject sbhl_module_link_pred_preference_order() {
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, sbhl_module_vars.$list131);
            key = current.first();
            current = module = current.rest();
            final SubLObject link_pred = sbhl_module_utilities.get_sbhl_link_pred(module);
            final SubLObject v_graph = sbhl_module_utilities.get_sbhl_graph(module);
            final SubLObject graph_size = hash_table_size(v_graph);
            tuples = cons(list(link_pred, graph_size), tuples);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        tuples = Sort.stable_sort(tuples, symbol_function(sbhl_module_vars.$sym133$_), symbol_function(SECOND));
        SubLObject link_preds = list_utilities.nmapcar(symbol_function(FIRST), tuples);
        link_preds = cons(sbhl_module_vars.$$genls, delete(sbhl_module_vars.$$genls, link_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return link_preds;
    }

    public static SubLObject declare_sbhl_module_vars_file() {
        declareFunction("sbhl_module_print_function_trampoline", "SBHL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_module_p", "SBHL-MODULE-P", 1, 0, false);
        new sbhl_module_vars.$sbhl_module_p$UnaryFunction();
        declareFunction("sbhl_mod_link_pred", "SBHL-MOD-LINK-PRED", 1, 0, false);
        declareFunction("sbhl_mod_accessible_link_preds", "SBHL-MOD-ACCESSIBLE-LINK-PREDS", 1, 0, false);
        declareFunction("sbhl_mod_graph", "SBHL-MOD-GRAPH", 1, 0, false);
        declareFunction("sbhl_mod_link_style", "SBHL-MOD-LINK-STYLE", 1, 0, false);
        declareFunction("sbhl_mod_index_arg", "SBHL-MOD-INDEX-ARG", 1, 0, false);
        declareFunction("sbhl_mod_module_type", "SBHL-MOD-MODULE-TYPE", 1, 0, false);
        declareFunction("sbhl_mod_type_test", "SBHL-MOD-TYPE-TEST", 1, 0, false);
        declareFunction("sbhl_mod_path_terminating_mark_fn", "SBHL-MOD-PATH-TERMINATING-MARK-FN", 1, 0, false);
        declareFunction("sbhl_mod_marking_fn", "SBHL-MOD-MARKING-FN", 1, 0, false);
        declareFunction("sbhl_mod_unmarking_fn", "SBHL-MOD-UNMARKING-FN", 1, 0, false);
        declareFunction("sbhl_mod_var_bindings", "SBHL-MOD-VAR-BINDINGS", 1, 0, false);
        declareFunction("sbhl_mod_misc_properties", "SBHL-MOD-MISC-PROPERTIES", 1, 0, false);
        declareFunction("_csetf_sbhl_mod_link_pred", "_CSETF-SBHL-MOD-LINK-PRED", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_accessible_link_preds", "_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_graph", "_CSETF-SBHL-MOD-GRAPH", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_link_style", "_CSETF-SBHL-MOD-LINK-STYLE", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_index_arg", "_CSETF-SBHL-MOD-INDEX-ARG", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_module_type", "_CSETF-SBHL-MOD-MODULE-TYPE", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_type_test", "_CSETF-SBHL-MOD-TYPE-TEST", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_path_terminating_mark_fn", "_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_marking_fn", "_CSETF-SBHL-MOD-MARKING-FN", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_unmarking_fn", "_CSETF-SBHL-MOD-UNMARKING-FN", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_var_bindings", "_CSETF-SBHL-MOD-VAR-BINDINGS", 2, 0, false);
        declareFunction("_csetf_sbhl_mod_misc_properties", "_CSETF-SBHL-MOD-MISC-PROPERTIES", 2, 0, false);
        declareFunction("make_sbhl_module", "MAKE-SBHL-MODULE", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_module", "VISIT-DEFSTRUCT-SBHL-MODULE", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_module_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-METHOD", 2, 0, false);
        declareFunction("print_sbhl_module", "PRINT-SBHL-MODULE", 3, 0, false);
        declareFunction("new_sbhl_module", "NEW-SBHL-MODULE", 1, 0, false);
        declareFunction("set_sbhl_module_property", "SET-SBHL-MODULE-PROPERTY", 3, 0, false);
        declareFunction("get_sbhl_module_property", "GET-SBHL-MODULE-PROPERTY", 2, 0, false);
        declareFunction("get_sbhl_module_link_pred", "GET-SBHL-MODULE-LINK-PRED", 1, 0, false);
        declareFunction("get_sbhl_module_accessible_link_preds", "GET-SBHL-MODULE-ACCESSIBLE-LINK-PREDS", 1, 0, false);
        declareFunction("get_sbhl_module_graph", "GET-SBHL-MODULE-GRAPH", 1, 0, false);
        declareFunction("get_sbhl_module_link_style", "GET-SBHL-MODULE-LINK-STYLE", 1, 0, false);
        declareFunction("get_sbhl_module_index_arg", "GET-SBHL-MODULE-INDEX-ARG", 1, 0, false);
        declareFunction("get_sbhl_module_module_type", "GET-SBHL-MODULE-MODULE-TYPE", 1, 0, false);
        declareFunction("get_sbhl_module_type_test", "GET-SBHL-MODULE-TYPE-TEST", 1, 0, false);
        declareFunction("get_sbhl_module_path_terminating_mark", "GET-SBHL-MODULE-PATH-TERMINATING-MARK", 1, 0, false);
        declareFunction("get_sbhl_module_marking_fn", "GET-SBHL-MODULE-MARKING-FN", 1, 0, false);
        declareFunction("get_sbhl_module_unmarking_fn", "GET-SBHL-MODULE-UNMARKING-FN", 1, 0, false);
        declareFunction("check_sbhl_modules_store_for_legacy_format", "CHECK-SBHL-MODULES-STORE-FOR-LEGACY-FORMAT", 0, 0, false);
        declareFunction("sbhl_module_object_p", "SBHL-MODULE-OBJECT-P", 1, 0, false);
        declareFunction("reset_sbhl_modules", "RESET-SBHL-MODULES", 0, 0, false);
        declareFunction("rebuild_sbhl_modules", "REBUILD-SBHL-MODULES", 0, 0, false);
        declareFunction("get_sbhl_modules", "GET-SBHL-MODULES", 0, 0, false);
        declareFunction("add_sbhl_module", "ADD-SBHL-MODULE", 2, 0, false);
        declareFunction("remove_sbhl_module", "REMOVE-SBHL-MODULE", 1, 0, false);
        declareMacro("do_sbhl_modules", "DO-SBHL-MODULES");
        declareFunction("get_sbhl_predicates_int", "GET-SBHL-PREDICATES-INT", 0, 0, false);
        declareFunction("get_sbhl_module_list", "GET-SBHL-MODULE-LIST", 0, 0, false);
        declareFunction("sbhl_predicate_object_p", "SBHL-PREDICATE-OBJECT-P", 1, 0, false);
        declareFunction("sbhl_simple_reflexive_module_type_p", "SBHL-SIMPLE-REFLEXIVE-MODULE-TYPE-P", 1, 0, false);
        declareFunction("sbhl_simple_non_reflexive_module_type_p", "SBHL-SIMPLE-NON-REFLEXIVE-MODULE-TYPE-P", 1, 0, false);
        declareFunction("sbhl_transfers_through_module_type_p", "SBHL-TRANSFERS-THROUGH-MODULE-TYPE-P", 1, 0, false);
        declareFunction("sbhl_disjoins_module_type_p", "SBHL-DISJOINS-MODULE-TYPE-P", 1, 0, false);
        declareFunction("sbhl_time_module_type_p", "SBHL-TIME-MODULE-TYPE-P", 1, 0, false);
        declareFunction("sbhl_transitive_module_type_p", "SBHL-TRANSITIVE-MODULE-TYPE-P", 1, 0, false);
        declareFunction("sbhl_module_type_p", "SBHL-MODULE-TYPE-P", 1, 0, false);
        declareMacro("do_sbhl_simple_modules", "DO-SBHL-SIMPLE-MODULES");
        declareMacro("do_sbhl_time_modules", "DO-SBHL-TIME-MODULES");
        declareMacro("do_sbhl_time_predicates", "DO-SBHL-TIME-PREDICATES");
        declareFunction("init_sbhl_module_properties", "INIT-SBHL-MODULE-PROPERTIES", 1, 0, false);
        declareFunction("get_sbhl_module_properties", "GET-SBHL-MODULE-PROPERTIES", 0, 0, false);
        declareFunction("add_sbhl_module_property", "ADD-SBHL-MODULE-PROPERTY", 2, 0, false);
        declareFunction("sbhl_module_property_p", "SBHL-MODULE-PROPERTY-P", 1, 0, false);
        declareMacro("do_sbhl_module_properties", "DO-SBHL-MODULE-PROPERTIES");
        declareFunction("get_sbhl_module_required_properties", "GET-SBHL-MODULE-REQUIRED-PROPERTIES", 0, 0, false);
        declareFunction("sbhl_module_required_property_p", "SBHL-MODULE-REQUIRED-PROPERTY-P", 1, 0, false);
        declareMacro("do_sbhl_module_required_properties", "DO-SBHL-MODULE-REQUIRED-PROPERTIES");
        declareFunction("get_sbhl_module", "GET-SBHL-MODULE", 0, 1, false);
        new sbhl_module_vars.$get_sbhl_module$ZeroArityFunction();
        new sbhl_module_vars.$get_sbhl_module$UnaryFunction();
        declareMacro("with_sbhl_module", "WITH-SBHL-MODULE");
        declareMacro("possibly_with_sbhl_module", "POSSIBLY-WITH-SBHL-MODULE");
        declareFunction("fort_denotes_sbhl_directed_graph_p", "FORT-DENOTES-SBHL-DIRECTED-GRAPH-P", 1, 0, false);
        declareFunction("sbhl_link_style_specifier_p", "SBHL-LINK-STYLE-SPECIFIER-P", 1, 0, false);
        declareFunction("clean_sbhl_modules", "CLEAN-SBHL-MODULES", 0, 0, false);
        declareFunction("optimize_sbhl_modules", "OPTIMIZE-SBHL-MODULES", 0, 0, false);
        declareFunction("sbhl_modules_link_pred_L", "SBHL-MODULES-LINK-PRED-<", 2, 0, false);
        declareFunction("sbhl_module_link_pred_preference_order", "SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_sbhl_module_vars_file_alt() {
        defconstant("*DTP-SBHL-MODULE*", SBHL_MODULE);
        deflexical("*SBHL-MODULE-KEY-TEST*", symbol_function(EQ));
        deflexical("*SBHL-MODULES*", NIL != boundp($sbhl_modules$) ? ((SubLObject) ($sbhl_modules$.getGlobalValue())) : dictionary.new_dictionary($sbhl_module_key_test$.getGlobalValue(), UNPROVIDED));
        deflexical("*SBHL-MODULE-TYPES*", $list_alt64);
        deflexical("*SBHL-MODULE-PROPERTIES*", NIL != boundp($sbhl_module_properties$) ? ((SubLObject) ($sbhl_module_properties$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*SBHL-MODULE-REQUIRED-PROPERTIES*", $list_alt107);
        defparameter("*SBHL-MODULE*", NIL);
        defvar("*SBHL-MODULE-VARS*", NIL);
        deflexical("*FORT-DENOTING-SBHL-DIRECTED-GRAPH*", $$DirectedMultigraph);
        deflexical("*FORT-DENOTING-SBHL-UNDIRECTED-GRAPH*", $$Multigraph);
        defparameter("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*", T);
        defparameter("*SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER*", NIL);
        return NIL;
    }

    public static SubLObject init_sbhl_module_vars_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-SBHL-MODULE*", sbhl_module_vars.SBHL_MODULE);
            deflexical("*SBHL-MODULE-KEY-TEST*", symbol_function(EQL));
            deflexical("*SBHL-MODULES*", SubLTrampolineFile.maybeDefault(sbhl_module_vars.$sbhl_modules$, sbhl_module_vars.$sbhl_modules$, NIL));
            deflexical("*SBHL-MODULE-TYPES*", sbhl_module_vars.$list75);
            deflexical("*SBHL-MODULE-PROPERTIES*", SubLTrampolineFile.maybeDefault(sbhl_module_vars.$sbhl_module_properties$, sbhl_module_vars.$sbhl_module_properties$, () -> new_dictionary(symbol_function(EQ), UNPROVIDED)));
            deflexical("*SBHL-MODULE-REQUIRED-PROPERTIES*", sbhl_module_vars.$list119);
            defparameter("*SBHL-MODULE*", NIL);
            defvar("*SBHL-MODULE-VARS*", NIL);
            deflexical("*FORT-DENOTING-SBHL-DIRECTED-GRAPH*", sbhl_module_vars.$$DirectedMultigraph);
            deflexical("*FORT-DENOTING-SBHL-UNDIRECTED-GRAPH*", sbhl_module_vars.$$Multigraph);
            defparameter("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*", T);
            defparameter("*SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SBHL-MODULE-KEY-TEST*", symbol_function(EQ));
            deflexical("*SBHL-MODULES*", NIL != boundp($sbhl_modules$) ? ((SubLObject) ($sbhl_modules$.getGlobalValue())) : dictionary.new_dictionary($sbhl_module_key_test$.getGlobalValue(), UNPROVIDED));
            deflexical("*SBHL-MODULE-TYPES*", $list_alt64);
            deflexical("*SBHL-MODULE-PROPERTIES*", NIL != boundp($sbhl_module_properties$) ? ((SubLObject) ($sbhl_module_properties$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            deflexical("*SBHL-MODULE-REQUIRED-PROPERTIES*", $list_alt107);
        }
        return NIL;
    }

    public static SubLObject init_sbhl_module_vars_file_Previous() {
        defconstant("*DTP-SBHL-MODULE*", sbhl_module_vars.SBHL_MODULE);
        deflexical("*SBHL-MODULE-KEY-TEST*", symbol_function(EQL));
        deflexical("*SBHL-MODULES*", SubLTrampolineFile.maybeDefault(sbhl_module_vars.$sbhl_modules$, sbhl_module_vars.$sbhl_modules$, NIL));
        deflexical("*SBHL-MODULE-TYPES*", sbhl_module_vars.$list75);
        deflexical("*SBHL-MODULE-PROPERTIES*", SubLTrampolineFile.maybeDefault(sbhl_module_vars.$sbhl_module_properties$, sbhl_module_vars.$sbhl_module_properties$, () -> new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SBHL-MODULE-REQUIRED-PROPERTIES*", sbhl_module_vars.$list119);
        defparameter("*SBHL-MODULE*", NIL);
        defvar("*SBHL-MODULE-VARS*", NIL);
        deflexical("*FORT-DENOTING-SBHL-DIRECTED-GRAPH*", sbhl_module_vars.$$DirectedMultigraph);
        deflexical("*FORT-DENOTING-SBHL-UNDIRECTED-GRAPH*", sbhl_module_vars.$$Multigraph);
        defparameter("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*", T);
        defparameter("*SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER*", NIL);
        return NIL;
    }

    public static final SubLObject setup_sbhl_module_vars_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_module$.getGlobalValue(), symbol_function(SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SBHL_MOD_LINK_PRED, _CSETF_SBHL_MOD_LINK_PRED);
        def_csetf(SBHL_MOD_ACCESSIBLE_LINK_PREDS, _CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS);
        def_csetf(SBHL_MOD_GRAPH, _CSETF_SBHL_MOD_GRAPH);
        def_csetf(SBHL_MOD_LINK_STYLE, _CSETF_SBHL_MOD_LINK_STYLE);
        def_csetf(SBHL_MOD_INDEX_ARG, _CSETF_SBHL_MOD_INDEX_ARG);
        def_csetf(SBHL_MOD_MODULE_TYPE, _CSETF_SBHL_MOD_MODULE_TYPE);
        def_csetf(SBHL_MOD_TYPE_TEST, _CSETF_SBHL_MOD_TYPE_TEST);
        def_csetf(SBHL_MOD_PATH_TERMINATING_MARK_FN, _CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN);
        def_csetf(SBHL_MOD_MARKING_FN, _CSETF_SBHL_MOD_MARKING_FN);
        def_csetf(SBHL_MOD_UNMARKING_FN, _CSETF_SBHL_MOD_UNMARKING_FN);
        def_csetf(SBHL_MOD_VAR_BINDINGS, _CSETF_SBHL_MOD_VAR_BINDINGS);
        def_csetf(SBHL_MOD_MISC_PROPERTIES, _CSETF_SBHL_MOD_MISC_PROPERTIES);
        identity(SBHL_MODULE);
        declare_defglobal($sbhl_modules$);
        declare_defglobal($sbhl_module_properties$);
        com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.init_sbhl_module_properties(list(new SubLObject[]{ list($LINK_PRED, SBHL_PREDICATE_OBJECT_P), list($LINK_STYLE, SBHL_LINK_STYLE_SPECIFIER_P), list($NAUT_FORWARD_TRUE_GENERATORS, FUNCTION_SYMBOL_LIST_P), list($MODULE_TYPE, SBHL_MODULE_TYPE_P), list($TYPE_TEST, FUNCTION_SYMBOL_P), list($MODULE_INVERTS_ARGUMENTS, SBHL_MODULE_OR_PREDICATE_P), list($INVERTS_ARGUMENTS_OF_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($DISJOINS_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($kw55$PATH_TERMINATING_MARK__FN, FUNCTION_SYMBOL_P), list($MARKING_FN, FUNCTION_SYMBOL_P), list($UNMARKING_FN, FUNCTION_SYMBOL_P), list($MARKING_INCREMENT, INTEGERP), list($ACCESSIBLE_LINK_PREDS, LISTP), list($TRANSFERS_THROUGH_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($TRANSFERS_VIA_ARG, INTEGERP), list($ADD_NODE_TO_RESULT_TEST, FUNCTION_SYMBOL_P), list($ADD_UNMARKED_NODE_TO_RESULT_TEST, FUNCTION_SYMBOL_P), list($PREDICATE_SEARCH_P, BOOLEANP), list($MODULE_TAG, KEYWORDP), list($INDEX_ARG, INTEGERP), list($ROOT, SBHL_NODE_OBJECT_P), list($GRAPH, HASH_TABLE_P), list($SBHL_MARKING_PARAMETERS, LISTP) }));
        note_funcall_helper_function($sym120$SBHL_MODULES_LINK_PRED__);
        return NIL;
    }

    public static SubLObject setup_sbhl_module_vars_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), sbhl_module_vars.$dtp_sbhl_module$.getGlobalValue(), symbol_function(sbhl_module_vars.SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(sbhl_module_vars.$list8);
            def_csetf(sbhl_module_vars.SBHL_MOD_LINK_PRED, sbhl_module_vars._CSETF_SBHL_MOD_LINK_PRED);
            def_csetf(sbhl_module_vars.SBHL_MOD_ACCESSIBLE_LINK_PREDS, sbhl_module_vars._CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS);
            def_csetf(sbhl_module_vars.SBHL_MOD_GRAPH, sbhl_module_vars._CSETF_SBHL_MOD_GRAPH);
            def_csetf(sbhl_module_vars.SBHL_MOD_LINK_STYLE, sbhl_module_vars._CSETF_SBHL_MOD_LINK_STYLE);
            def_csetf(sbhl_module_vars.SBHL_MOD_INDEX_ARG, sbhl_module_vars._CSETF_SBHL_MOD_INDEX_ARG);
            def_csetf(sbhl_module_vars.SBHL_MOD_MODULE_TYPE, sbhl_module_vars._CSETF_SBHL_MOD_MODULE_TYPE);
            def_csetf(sbhl_module_vars.SBHL_MOD_TYPE_TEST, sbhl_module_vars._CSETF_SBHL_MOD_TYPE_TEST);
            def_csetf(sbhl_module_vars.SBHL_MOD_PATH_TERMINATING_MARK_FN, sbhl_module_vars._CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN);
            def_csetf(sbhl_module_vars.SBHL_MOD_MARKING_FN, sbhl_module_vars._CSETF_SBHL_MOD_MARKING_FN);
            def_csetf(sbhl_module_vars.SBHL_MOD_UNMARKING_FN, sbhl_module_vars._CSETF_SBHL_MOD_UNMARKING_FN);
            def_csetf(sbhl_module_vars.SBHL_MOD_VAR_BINDINGS, sbhl_module_vars._CSETF_SBHL_MOD_VAR_BINDINGS);
            def_csetf(sbhl_module_vars.SBHL_MOD_MISC_PROPERTIES, sbhl_module_vars._CSETF_SBHL_MOD_MISC_PROPERTIES);
            identity(sbhl_module_vars.SBHL_MODULE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_module_vars.$dtp_sbhl_module$.getGlobalValue(), symbol_function(sbhl_module_vars.VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_METHOD));
            declare_defglobal(sbhl_module_vars.$sbhl_modules$);
            declare_defglobal(sbhl_module_vars.$sbhl_module_properties$);
            sbhl_module_vars.init_sbhl_module_properties(list(new SubLObject[]{ list($LINK_PRED, sbhl_module_vars.SBHL_PREDICATE_OBJECT_P), list($LINK_STYLE, sbhl_module_vars.SBHL_LINK_STYLE_SPECIFIER_P), list(sbhl_module_vars.$NAUT_FORWARD_TRUE_GENERATORS, sbhl_module_vars.FUNCTION_SYMBOL_LIST_P), list($MODULE_TYPE, sbhl_module_vars.SBHL_MODULE_TYPE_P), list($TYPE_TEST, sbhl_module_vars.FUNCTION_SYMBOL_P), list(sbhl_module_vars.$MODULE_INVERTS_ARGUMENTS, sbhl_module_vars.SBHL_MODULE_OR_PREDICATE_P), list(sbhl_module_vars.$INVERTS_ARGUMENTS_OF_MODULE, sbhl_module_vars.SBHL_MODULE_OR_PREDICATE_P), list($DISJOINS_MODULE, sbhl_module_vars.SBHL_MODULE_OR_PREDICATE_P), list(sbhl_module_vars.$kw61$PATH_TERMINATING_MARK__FN, sbhl_module_vars.FUNCTION_SYMBOL_P), list($MARKING_FN, sbhl_module_vars.FUNCTION_SYMBOL_P), list($UNMARKING_FN, sbhl_module_vars.FUNCTION_SYMBOL_P), list($MARKING_INCREMENT, INTEGERP), list(sbhl_module_vars.$ACCESSIBLE_LINK_PREDS, LISTP), list(sbhl_module_vars.$TRANSFERS_THROUGH_MODULE, sbhl_module_vars.SBHL_MODULE_OR_PREDICATE_P), list(sbhl_module_vars.$TRANSFERS_VIA_ARG, INTEGERP), list(sbhl_module_vars.$ADD_NODE_TO_RESULT_TEST, sbhl_module_vars.FUNCTION_SYMBOL_P), list(sbhl_module_vars.$ADD_UNMARKED_NODE_TO_RESULT_TEST, sbhl_module_vars.FUNCTION_SYMBOL_P), list(sbhl_module_vars.$PREDICATE_SEARCH_P, BOOLEANP), list($MODULE_TAG, KEYWORDP), list($INDEX_ARG, INTEGERP), list($ROOT, sbhl_module_vars.SBHL_NODE_OBJECT_P), list($GRAPH, HASH_TABLE_P), list(sbhl_module_vars.$SBHL_MARKING_PARAMETERS, LISTP) }));
            note_funcall_helper_function(sbhl_module_vars.$sym132$SBHL_MODULES_LINK_PRED__);
        }
        if (SubLFiles.USE_V2) {
            com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.init_sbhl_module_properties(list(new SubLObject[]{ list($LINK_PRED, SBHL_PREDICATE_OBJECT_P), list($LINK_STYLE, SBHL_LINK_STYLE_SPECIFIER_P), list($NAUT_FORWARD_TRUE_GENERATORS, FUNCTION_SYMBOL_LIST_P), list($MODULE_TYPE, SBHL_MODULE_TYPE_P), list($TYPE_TEST, FUNCTION_SYMBOL_P), list($MODULE_INVERTS_ARGUMENTS, SBHL_MODULE_OR_PREDICATE_P), list($INVERTS_ARGUMENTS_OF_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($DISJOINS_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($kw55$PATH_TERMINATING_MARK__FN, FUNCTION_SYMBOL_P), list($MARKING_FN, FUNCTION_SYMBOL_P), list($UNMARKING_FN, FUNCTION_SYMBOL_P), list($MARKING_INCREMENT, INTEGERP), list($ACCESSIBLE_LINK_PREDS, LISTP), list($TRANSFERS_THROUGH_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($TRANSFERS_VIA_ARG, INTEGERP), list($ADD_NODE_TO_RESULT_TEST, FUNCTION_SYMBOL_P), list($ADD_UNMARKED_NODE_TO_RESULT_TEST, FUNCTION_SYMBOL_P), list($PREDICATE_SEARCH_P, BOOLEANP), list($MODULE_TAG, KEYWORDP), list($INDEX_ARG, INTEGERP), list($ROOT, SBHL_NODE_OBJECT_P), list($GRAPH, HASH_TABLE_P), list($SBHL_MARKING_PARAMETERS, LISTP) }));
            note_funcall_helper_function($sym120$SBHL_MODULES_LINK_PRED__);
        }
        return NIL;
    }

    public static SubLObject setup_sbhl_module_vars_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), sbhl_module_vars.$dtp_sbhl_module$.getGlobalValue(), symbol_function(sbhl_module_vars.SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_module_vars.$list8);
        def_csetf(sbhl_module_vars.SBHL_MOD_LINK_PRED, sbhl_module_vars._CSETF_SBHL_MOD_LINK_PRED);
        def_csetf(sbhl_module_vars.SBHL_MOD_ACCESSIBLE_LINK_PREDS, sbhl_module_vars._CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS);
        def_csetf(sbhl_module_vars.SBHL_MOD_GRAPH, sbhl_module_vars._CSETF_SBHL_MOD_GRAPH);
        def_csetf(sbhl_module_vars.SBHL_MOD_LINK_STYLE, sbhl_module_vars._CSETF_SBHL_MOD_LINK_STYLE);
        def_csetf(sbhl_module_vars.SBHL_MOD_INDEX_ARG, sbhl_module_vars._CSETF_SBHL_MOD_INDEX_ARG);
        def_csetf(sbhl_module_vars.SBHL_MOD_MODULE_TYPE, sbhl_module_vars._CSETF_SBHL_MOD_MODULE_TYPE);
        def_csetf(sbhl_module_vars.SBHL_MOD_TYPE_TEST, sbhl_module_vars._CSETF_SBHL_MOD_TYPE_TEST);
        def_csetf(sbhl_module_vars.SBHL_MOD_PATH_TERMINATING_MARK_FN, sbhl_module_vars._CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN);
        def_csetf(sbhl_module_vars.SBHL_MOD_MARKING_FN, sbhl_module_vars._CSETF_SBHL_MOD_MARKING_FN);
        def_csetf(sbhl_module_vars.SBHL_MOD_UNMARKING_FN, sbhl_module_vars._CSETF_SBHL_MOD_UNMARKING_FN);
        def_csetf(sbhl_module_vars.SBHL_MOD_VAR_BINDINGS, sbhl_module_vars._CSETF_SBHL_MOD_VAR_BINDINGS);
        def_csetf(sbhl_module_vars.SBHL_MOD_MISC_PROPERTIES, sbhl_module_vars._CSETF_SBHL_MOD_MISC_PROPERTIES);
        identity(sbhl_module_vars.SBHL_MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_module_vars.$dtp_sbhl_module$.getGlobalValue(), symbol_function(sbhl_module_vars.VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_METHOD));
        declare_defglobal(sbhl_module_vars.$sbhl_modules$);
        declare_defglobal(sbhl_module_vars.$sbhl_module_properties$);
        sbhl_module_vars.init_sbhl_module_properties(list(new SubLObject[]{ list($LINK_PRED, sbhl_module_vars.SBHL_PREDICATE_OBJECT_P), list($LINK_STYLE, sbhl_module_vars.SBHL_LINK_STYLE_SPECIFIER_P), list(sbhl_module_vars.$NAUT_FORWARD_TRUE_GENERATORS, sbhl_module_vars.FUNCTION_SYMBOL_LIST_P), list($MODULE_TYPE, sbhl_module_vars.SBHL_MODULE_TYPE_P), list($TYPE_TEST, sbhl_module_vars.FUNCTION_SYMBOL_P), list(sbhl_module_vars.$MODULE_INVERTS_ARGUMENTS, sbhl_module_vars.SBHL_MODULE_OR_PREDICATE_P), list(sbhl_module_vars.$INVERTS_ARGUMENTS_OF_MODULE, sbhl_module_vars.SBHL_MODULE_OR_PREDICATE_P), list($DISJOINS_MODULE, sbhl_module_vars.SBHL_MODULE_OR_PREDICATE_P), list(sbhl_module_vars.$kw61$PATH_TERMINATING_MARK__FN, sbhl_module_vars.FUNCTION_SYMBOL_P), list($MARKING_FN, sbhl_module_vars.FUNCTION_SYMBOL_P), list($UNMARKING_FN, sbhl_module_vars.FUNCTION_SYMBOL_P), list($MARKING_INCREMENT, INTEGERP), list(sbhl_module_vars.$ACCESSIBLE_LINK_PREDS, LISTP), list(sbhl_module_vars.$TRANSFERS_THROUGH_MODULE, sbhl_module_vars.SBHL_MODULE_OR_PREDICATE_P), list(sbhl_module_vars.$TRANSFERS_VIA_ARG, INTEGERP), list(sbhl_module_vars.$ADD_NODE_TO_RESULT_TEST, sbhl_module_vars.FUNCTION_SYMBOL_P), list(sbhl_module_vars.$ADD_UNMARKED_NODE_TO_RESULT_TEST, sbhl_module_vars.FUNCTION_SYMBOL_P), list(sbhl_module_vars.$PREDICATE_SEARCH_P, BOOLEANP), list($MODULE_TAG, KEYWORDP), list($INDEX_ARG, INTEGERP), list($ROOT, sbhl_module_vars.SBHL_NODE_OBJECT_P), list($GRAPH, HASH_TABLE_P), list(sbhl_module_vars.$SBHL_MARKING_PARAMETERS, LISTP) }));
        note_funcall_helper_function(sbhl_module_vars.$sym132$SBHL_MODULES_LINK_PRED__);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        sbhl_module_vars.declare_sbhl_module_vars_file();
    }

    @Override
    public void initializeVariables() {
        sbhl_module_vars.init_sbhl_module_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        sbhl_module_vars.setup_sbhl_module_vars_file();
    }

    static {
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("LINK-PRED"), makeSymbol("ACCESSIBLE-LINK-PREDS"), makeSymbol("GRAPH"), makeSymbol("LINK-STYLE"), makeSymbol("INDEX-ARG"), makeSymbol("MODULE-TYPE"), makeSymbol("TYPE-TEST"), makeSymbol("PATH-TERMINATING-MARK-FN"), makeSymbol("MARKING-FN"), makeSymbol("UNMARKING-FN"), makeSymbol("VAR-BINDINGS"), makeSymbol("MISC-PROPERTIES") });

    public static final class $sbhl_module_native extends SubLStructNative {
        public SubLObject $link_pred;

        public SubLObject $accessible_link_preds;

        public SubLObject $graph;

        public SubLObject $link_style;

        public SubLObject $index_arg;

        public SubLObject $module_type;

        public SubLObject $type_test;

        public SubLObject $path_terminating_mark_fn;

        public SubLObject $marking_fn;

        public SubLObject $unmarking_fn;

        public SubLObject $var_bindings;

        public SubLObject $misc_properties;

        private static final SubLStructDeclNative structDecl;

        public $sbhl_module_native() {
            sbhl_module_vars.$sbhl_module_native.this.$link_pred = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$accessible_link_preds = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$graph = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$link_style = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$index_arg = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$module_type = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$type_test = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$path_terminating_mark_fn = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$marking_fn = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$unmarking_fn = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$var_bindings = Lisp.NIL;
            sbhl_module_vars.$sbhl_module_native.this.$misc_properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sbhl_module_vars.$sbhl_module_native.this.$link_pred;
        }

        @Override
        public SubLObject getField3() {
            return sbhl_module_vars.$sbhl_module_native.this.$accessible_link_preds;
        }

        @Override
        public SubLObject getField4() {
            return sbhl_module_vars.$sbhl_module_native.this.$graph;
        }

        @Override
        public SubLObject getField5() {
            return sbhl_module_vars.$sbhl_module_native.this.$link_style;
        }

        @Override
        public SubLObject getField6() {
            return sbhl_module_vars.$sbhl_module_native.this.$index_arg;
        }

        @Override
        public SubLObject getField7() {
            return sbhl_module_vars.$sbhl_module_native.this.$module_type;
        }

        @Override
        public SubLObject getField8() {
            return sbhl_module_vars.$sbhl_module_native.this.$type_test;
        }

        @Override
        public SubLObject getField9() {
            return sbhl_module_vars.$sbhl_module_native.this.$path_terminating_mark_fn;
        }

        @Override
        public SubLObject getField10() {
            return sbhl_module_vars.$sbhl_module_native.this.$marking_fn;
        }

        @Override
        public SubLObject getField11() {
            return sbhl_module_vars.$sbhl_module_native.this.$unmarking_fn;
        }

        @Override
        public SubLObject getField12() {
            return sbhl_module_vars.$sbhl_module_native.this.$var_bindings;
        }

        @Override
        public SubLObject getField13() {
            return sbhl_module_vars.$sbhl_module_native.this.$misc_properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$link_pred = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$accessible_link_preds = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$graph = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$link_style = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$index_arg = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$module_type = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$type_test = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$path_terminating_mark_fn = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$marking_fn = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$unmarking_fn = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$var_bindings = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return sbhl_module_vars.$sbhl_module_native.this.$misc_properties = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.$sbhl_module_native.class, sbhl_module_vars.SBHL_MODULE, SBHL_MODULE_P, sbhl_module_vars.$list2, sbhl_module_vars.$list3, new String[]{ "$link_pred", "$accessible_link_preds", "$graph", "$link_style", "$index_arg", "$module_type", "$type_test", "$path_terminating_mark_fn", "$marking_fn", "$unmarking_fn", "$var_bindings", "$misc_properties" }, sbhl_module_vars.$list4, sbhl_module_vars.$list5, sbhl_module_vars.PRINT_SBHL_MODULE);
        }
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("LINK-PRED"), makeKeyword("ACCESSIBLE-LINK-PREDS"), makeKeyword("GRAPH"), makeKeyword("LINK-STYLE"), makeKeyword("INDEX-ARG"), makeKeyword("MODULE-TYPE"), makeKeyword("TYPE-TEST"), makeKeyword("PATH-TERMINATING-MARK-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("VAR-BINDINGS"), makeKeyword("MISC-PROPERTIES") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("SBHL-MOD-LINK-PRED"), makeSymbol("SBHL-MOD-ACCESSIBLE-LINK-PREDS"), makeSymbol("SBHL-MOD-GRAPH"), makeSymbol("SBHL-MOD-LINK-STYLE"), makeSymbol("SBHL-MOD-INDEX-ARG"), makeSymbol("SBHL-MOD-MODULE-TYPE"), makeSymbol("SBHL-MOD-TYPE-TEST"), makeSymbol("SBHL-MOD-PATH-TERMINATING-MARK-FN"), makeSymbol("SBHL-MOD-MARKING-FN"), makeSymbol("SBHL-MOD-UNMARKING-FN"), makeSymbol("SBHL-MOD-VAR-BINDINGS"), makeSymbol("SBHL-MOD-MISC-PROPERTIES") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-SBHL-MOD-LINK-PRED"), makeSymbol("_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS"), makeSymbol("_CSETF-SBHL-MOD-GRAPH"), makeSymbol("_CSETF-SBHL-MOD-LINK-STYLE"), makeSymbol("_CSETF-SBHL-MOD-INDEX-ARG"), makeSymbol("_CSETF-SBHL-MOD-MODULE-TYPE"), makeSymbol("_CSETF-SBHL-MOD-TYPE-TEST"), makeSymbol("_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN"), makeSymbol("_CSETF-SBHL-MOD-MARKING-FN"), makeSymbol("_CSETF-SBHL-MOD-UNMARKING-FN"), makeSymbol("_CSETF-SBHL-MOD-VAR-BINDINGS"), makeSymbol("_CSETF-SBHL-MOD-MISC-PROPERTIES") });

    static private final SubLString $str_alt44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    public static final class $sbhl_module_p$UnaryFunction extends UnaryFunction {
        public $sbhl_module_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_module_vars.sbhl_module_p(arg1);
        }
    }

    static private final SubLString $str_alt45$__SBHL_MODULE__ = makeString("#<SBHL-MODULE: ");

    static private final SubLString $str_alt46$_ = makeString(">");

    static private final SubLString $str_alt49$_A_is_not_a__A = makeString("~A is not a ~A");

    public static final class $get_sbhl_module$ZeroArityFunction extends ZeroArityFunction {
        public $get_sbhl_module$ZeroArityFunction() {
            super(extractFunctionNamed("GET-SBHL-MODULE"));
        }

        @Override
        public SubLObject processItem() {
            return sbhl_module_vars.get_sbhl_module(sbhl_module_vars.$get_sbhl_module$ZeroArityFunction.UNPROVIDED);
        }
    }

    static private final SubLString $str_alt54$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    public static final SubLSymbol $kw55$PATH_TERMINATING_MARK__FN = makeKeyword("PATH-TERMINATING-MARK?-FN");

    public static final class $get_sbhl_module$UnaryFunction extends UnaryFunction {
        public $get_sbhl_module$UnaryFunction() {
            super(extractFunctionNamed("GET-SBHL-MODULE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_module_vars.get_sbhl_module(arg1);
        }
    }

    static private final SubLList $list_alt59 = list(list(makeSymbol("MODULE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym60$KEY = makeUninternedSymbol("KEY");

    static private final SubLList $list_alt62 = list(makeSymbol("GET-SBHL-MODULES"));

    static private final SubLList $list_alt64 = list(makeKeyword("SIMPLE-REFLEXIVE"), makeKeyword("SIMPLE-NON-REFLEXIVE"), makeKeyword("TRANSFERS-THROUGH"), makeKeyword("DISJOINS"), $TIME);

    static private final SubLSymbol $sym70$MODULE = makeUninternedSymbol("MODULE");

    static private final SubLSymbol $sym76$MODULE = makeUninternedSymbol("MODULE");

    static private final SubLList $list_alt78 = list(list(makeSymbol("PRED-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym79$MODULE = makeUninternedSymbol("MODULE");

    static private final SubLList $list_alt105 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("TEST-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt106 = list(makeSymbol("GET-SBHL-MODULE-PROPERTIES"));

    static private final SubLList $list_alt107 = list(makeKeyword("LINK-PRED"), makeKeyword("LINK-STYLE"), makeKeyword("MODULE-TYPE"), makeKeyword("PATH-TERMINATING-MARK?-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("INDEX-ARG"), makeKeyword("GRAPH"));

    static private final SubLList $list_alt108 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt110 = list(makeSymbol("GET-SBHL-MODULE-REQUIRED-PROPERTIES"));

    static private final SubLString $str_alt111$_sbhl_module__is_unexpectedly_nul = makeString("*sbhl-module* is unexpectedly null.");

    static private final SubLString $str_alt112$_A_is_not_a_valid_sbhl_predicate_ = makeString("~A is not a valid sbhl-predicate-p");

    static private final SubLList $list_alt113 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt116 = list(makeSymbol("*SBHL-MODULE*"));

    static private final SubLString $str_alt119$Term___a__is_not_used_to_specify_ = makeString("Term, ~a, is not used to specify directed nor undirected graphs");

    static private final SubLSymbol $sym120$SBHL_MODULES_LINK_PRED__ = makeSymbol("SBHL-MODULES-LINK-PRED-<");

    static private final SubLSymbol $sym121$_ = makeSymbol(">");
}

/**
 * Total time: 251 ms
 */
