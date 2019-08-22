package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_size;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.dictionary;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_module_vars extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_module_vars();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_module_vars";

    public static final String myFingerPrint = "d8962980822faaf31e70b4a215871f7b4e343a82c455cdb5c97702617994a39e";

    // defconstant
    public static final SubLSymbol $dtp_sbhl_module$ = makeSymbol("*DTP-SBHL-MODULE*");

    // deflexical
    private static final SubLSymbol $sbhl_module_key_test$ = makeSymbol("*SBHL-MODULE-KEY-TEST*");



    // deflexical
    // Roles that sbhl modules play in the grand SBHL scheme.
    public static final SubLSymbol $sbhl_module_types$ = makeSymbol("*SBHL-MODULE-TYPES*");



    // deflexical
    // the list of required properties for each of the @see *sbhl-modules*
    private static final SubLSymbol $sbhl_module_required_properties$ = makeSymbol("*SBHL-MODULE-REQUIRED-PROPERTIES*");



    // defvar
    // The parameters bound with each sbhl module.
    public static final SubLSymbol $sbhl_module_vars$ = makeSymbol("*SBHL-MODULE-VARS*");

    // deflexical
    /**
     * the fort which is used to determine whether a predicate has directed links
     */
    public static final SubLSymbol $fort_denoting_sbhl_directed_graph$ = makeSymbol("*FORT-DENOTING-SBHL-DIRECTED-GRAPH*");

    // deflexical
    /**
     * the fort which is used to determine whether a predicate has undirected links
     */
    public static final SubLSymbol $fort_denoting_sbhl_undirected_graph$ = makeSymbol("*FORT-DENOTING-SBHL-UNDIRECTED-GRAPH*");

    // defparameter
    /**
     * Assumption made for a collection, predicate, etc. that has no known extent.
     * The two possible values are t (assume nonempty) and nil (assume nothing)
     */
    public static final SubLSymbol $assume_sbhl_extensions_nonempty$ = makeSymbol("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*");

    // defparameter
    private static final SubLSymbol $sbhl_module_link_pred_preference_order$ = makeSymbol("*SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER*");

    // Internal Constants
    public static final SubLSymbol SBHL_MODULE = makeSymbol("SBHL-MODULE");



    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("LINK-PRED"), makeSymbol("ACCESSIBLE-LINK-PREDS"), makeSymbol("GRAPH"), makeSymbol("LINK-STYLE"), makeSymbol("INDEX-ARG"), makeSymbol("MODULE-TYPE"), makeSymbol("TYPE-TEST"), makeSymbol("PATH-TERMINATING-MARK-FN"), makeSymbol("MARKING-FN"), makeSymbol("UNMARKING-FN"), makeSymbol("VAR-BINDINGS"), makeSymbol("MISC-PROPERTIES") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("LINK-PRED"), makeKeyword("ACCESSIBLE-LINK-PREDS"), makeKeyword("GRAPH"), makeKeyword("LINK-STYLE"), makeKeyword("INDEX-ARG"), makeKeyword("MODULE-TYPE"), makeKeyword("TYPE-TEST"), makeKeyword("PATH-TERMINATING-MARK-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("VAR-BINDINGS"), makeKeyword("MISC-PROPERTIES") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("SBHL-MOD-LINK-PRED"), makeSymbol("SBHL-MOD-ACCESSIBLE-LINK-PREDS"), makeSymbol("SBHL-MOD-GRAPH"), makeSymbol("SBHL-MOD-LINK-STYLE"), makeSymbol("SBHL-MOD-INDEX-ARG"), makeSymbol("SBHL-MOD-MODULE-TYPE"), makeSymbol("SBHL-MOD-TYPE-TEST"), makeSymbol("SBHL-MOD-PATH-TERMINATING-MARK-FN"), makeSymbol("SBHL-MOD-MARKING-FN"), makeSymbol("SBHL-MOD-UNMARKING-FN"), makeSymbol("SBHL-MOD-VAR-BINDINGS"), makeSymbol("SBHL-MOD-MISC-PROPERTIES") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-SBHL-MOD-LINK-PRED"), makeSymbol("_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS"), makeSymbol("_CSETF-SBHL-MOD-GRAPH"), makeSymbol("_CSETF-SBHL-MOD-LINK-STYLE"), makeSymbol("_CSETF-SBHL-MOD-INDEX-ARG"), makeSymbol("_CSETF-SBHL-MOD-MODULE-TYPE"), makeSymbol("_CSETF-SBHL-MOD-TYPE-TEST"), makeSymbol("_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN"), makeSymbol("_CSETF-SBHL-MOD-MARKING-FN"), makeSymbol("_CSETF-SBHL-MOD-UNMARKING-FN"), makeSymbol("_CSETF-SBHL-MOD-VAR-BINDINGS"), makeSymbol("_CSETF-SBHL-MOD-MISC-PROPERTIES") });

    public static final SubLSymbol PRINT_SBHL_MODULE = makeSymbol("PRINT-SBHL-MODULE");

    public static final SubLSymbol SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-MODULE-PRINT-FUNCTION-TRAMPOLINE");

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





    private static final SubLList $list75 = list(makeKeyword("SIMPLE-REFLEXIVE"), makeKeyword("SIMPLE-NON-REFLEXIVE"), makeKeyword("TRANSFERS-THROUGH"), makeKeyword("DISJOINS"), makeKeyword("TIME"));



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

    public static final SubLList $list116 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("TEST-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list118 = list(makeSymbol("GET-SBHL-MODULE-PROPERTIES"));

    private static final SubLList $list119 = list(makeKeyword("LINK-PRED"), makeKeyword("LINK-STYLE"), makeKeyword("MODULE-TYPE"), makeKeyword("PATH-TERMINATING-MARK?-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("INDEX-ARG"), makeKeyword("GRAPH"));

    private static final SubLList $list120 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SMART_CSOME = makeSymbol("SMART-CSOME");

    private static final SubLList $list122 = list(makeSymbol("GET-SBHL-MODULE-REQUIRED-PROPERTIES"));

    private static final SubLString $str123$_A_is_not_a_valid_sbhl_predicate_ = makeString("~A is not a valid sbhl-predicate-p");

    private static final SubLList $list124 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_module$ = makeSymbol("*SBHL-MODULE*");



    private static final SubLList $list127 = list(makeSymbol("*SBHL-MODULE*"));

    private static final SubLObject $$DirectedMultigraph = reader_make_constant_shell(makeString("DirectedMultigraph"));

    private static final SubLObject $$Multigraph = reader_make_constant_shell(makeString("Multigraph"));

    private static final SubLString $str130$Term___a__is_not_used_to_specify_ = makeString("Term, ~a, is not used to specify directed nor undirected graphs");

    private static final SubLList $list131 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));

    private static final SubLSymbol $sym132$SBHL_MODULES_LINK_PRED__ = makeSymbol("SBHL-MODULES-LINK-PRED-<");

    private static final SubLSymbol $sym133$_ = makeSymbol(">");





    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static SubLObject sbhl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sbhl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_module_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sbhl_module_native.class ? T : NIL;
    }

    public static SubLObject sbhl_mod_link_pred(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sbhl_mod_accessible_link_preds(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sbhl_mod_graph(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sbhl_mod_link_style(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sbhl_mod_index_arg(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sbhl_mod_module_type(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sbhl_mod_type_test(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject sbhl_mod_path_terminating_mark_fn(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject sbhl_mod_marking_fn(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject sbhl_mod_unmarking_fn(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject sbhl_mod_var_bindings(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject sbhl_mod_misc_properties(final SubLObject v_object) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_sbhl_mod_link_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_mod_accessible_link_preds(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_mod_graph(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sbhl_mod_link_style(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sbhl_mod_index_arg(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sbhl_mod_module_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sbhl_mod_type_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sbhl_mod_path_terminating_mark_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sbhl_mod_marking_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sbhl_mod_unmarking_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_sbhl_mod_var_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_sbhl_mod_misc_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_module_p(v_object) : "sbhl_module_vars.sbhl_module_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_sbhl_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sbhl_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LINK_PRED)) {
                _csetf_sbhl_mod_link_pred(v_new, current_value);
            } else
                if (pcase_var.eql($ACCESSIBLE_LINK_PREDS)) {
                    _csetf_sbhl_mod_accessible_link_preds(v_new, current_value);
                } else
                    if (pcase_var.eql($GRAPH)) {
                        _csetf_sbhl_mod_graph(v_new, current_value);
                    } else
                        if (pcase_var.eql($LINK_STYLE)) {
                            _csetf_sbhl_mod_link_style(v_new, current_value);
                        } else
                            if (pcase_var.eql($INDEX_ARG)) {
                                _csetf_sbhl_mod_index_arg(v_new, current_value);
                            } else
                                if (pcase_var.eql($MODULE_TYPE)) {
                                    _csetf_sbhl_mod_module_type(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TYPE_TEST)) {
                                        _csetf_sbhl_mod_type_test(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PATH_TERMINATING_MARK_FN)) {
                                            _csetf_sbhl_mod_path_terminating_mark_fn(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($MARKING_FN)) {
                                                _csetf_sbhl_mod_marking_fn(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($UNMARKING_FN)) {
                                                    _csetf_sbhl_mod_unmarking_fn(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($VAR_BINDINGS)) {
                                                        _csetf_sbhl_mod_var_bindings(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($MISC_PROPERTIES)) {
                                                            _csetf_sbhl_mod_misc_properties(v_new, current_value);
                                                        } else {
                                                            Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SBHL_MODULE, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LINK_PRED, sbhl_mod_link_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $ACCESSIBLE_LINK_PREDS, sbhl_mod_accessible_link_preds(obj));
        funcall(visitor_fn, obj, $SLOT, $GRAPH, sbhl_mod_graph(obj));
        funcall(visitor_fn, obj, $SLOT, $LINK_STYLE, sbhl_mod_link_style(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX_ARG, sbhl_mod_index_arg(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE_TYPE, sbhl_mod_module_type(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE_TEST, sbhl_mod_type_test(obj));
        funcall(visitor_fn, obj, $SLOT, $PATH_TERMINATING_MARK_FN, sbhl_mod_path_terminating_mark_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $MARKING_FN, sbhl_mod_marking_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $UNMARKING_FN, sbhl_mod_unmarking_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR_BINDINGS, sbhl_mod_var_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $MISC_PROPERTIES, sbhl_mod_misc_properties(obj));
        funcall(visitor_fn, obj, $END, MAKE_SBHL_MODULE, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sbhl_module(obj, visitor_fn);
    }

    public static SubLObject print_sbhl_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != sbhl_module_p(v_object)) {
            format(stream, $str51$__SBHL_MODULE__);
            prin1(sbhl_mod_link_pred(v_object), stream);
            format(stream, $str52$_);
        } else {
            compatibility.default_struct_print_function(v_object, stream, depth);
        }
        return v_object;
    }

    public static SubLObject new_sbhl_module(final SubLObject pred) {
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        final SubLObject module = make_sbhl_module(UNPROVIDED);
        _csetf_sbhl_mod_link_pred(module, pred);
        _csetf_sbhl_mod_misc_properties(module, dictionary.new_dictionary(EQL, ZERO_INTEGER));
        return module;
    }

    public static SubLObject set_sbhl_module_property(final SubLObject module, final SubLObject property, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_property_p(property))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str55$_A_is_not_a__A, property, SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str55$_A_is_not_a__A, property, SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str55$_A_is_not_a__A, property, SBHL_MODULE_PROPERTY_P);
                    } else {
                        Errors.warn($str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str55$_A_is_not_a__A, property, SBHL_MODULE_PROPERTY_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_p(module))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str55$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str55$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str55$_A_is_not_a__A, module, SBHL_MODULE_P);
                    } else {
                        Errors.warn($str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str55$_A_is_not_a__A, module, SBHL_MODULE_P);
                    }


        }
        if (property.eql($LINK_PRED)) {
            _csetf_sbhl_mod_link_pred(module, value);
        } else
            if (property.eql($ACCESSIBLE_LINK_PREDS)) {
                _csetf_sbhl_mod_accessible_link_preds(module, value);
            } else
                if (property.eql($GRAPH)) {
                    _csetf_sbhl_mod_graph(module, value);
                } else
                    if (property.eql($LINK_STYLE)) {
                        _csetf_sbhl_mod_link_style(module, value);
                    } else
                        if (property.eql($INDEX_ARG)) {
                            _csetf_sbhl_mod_index_arg(module, value);
                        } else
                            if (property.eql($MODULE_TYPE)) {
                                _csetf_sbhl_mod_module_type(module, value);
                            } else
                                if (property.eql($TYPE_TEST)) {
                                    _csetf_sbhl_mod_type_test(module, value);
                                } else
                                    if (property.eql($kw61$PATH_TERMINATING_MARK__FN)) {
                                        _csetf_sbhl_mod_path_terminating_mark_fn(module, value);
                                    } else
                                        if (property.eql($MARKING_FN)) {
                                            _csetf_sbhl_mod_marking_fn(module, value);
                                        } else
                                            if (property.eql($UNMARKING_FN)) {
                                                _csetf_sbhl_mod_unmarking_fn(module, value);
                                            } else {
                                                dictionary.dictionary_enter(sbhl_mod_misc_properties(module), property, value);
                                            }









        return module;
    }

    public static SubLObject get_sbhl_module_property(final SubLObject module, final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_p(module))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str55$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str55$_A_is_not_a__A, module, SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str55$_A_is_not_a__A, module, SBHL_MODULE_P);
                    } else {
                        Errors.warn($str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str55$_A_is_not_a__A, module, SBHL_MODULE_P);
                    }


        }
        if (property.eql($LINK_PRED)) {
            return sbhl_mod_link_pred(module);
        }
        if (property.eql($ACCESSIBLE_LINK_PREDS)) {
            return sbhl_mod_accessible_link_preds(module);
        }
        if (property.eql($GRAPH)) {
            return sbhl_mod_graph(module);
        }
        if (property.eql($LINK_STYLE)) {
            return sbhl_mod_link_style(module);
        }
        if (property.eql($INDEX_ARG)) {
            return sbhl_mod_index_arg(module);
        }
        if (property.eql($MODULE_TYPE)) {
            return sbhl_mod_module_type(module);
        }
        if (property.eql($TYPE_TEST)) {
            return sbhl_mod_type_test(module);
        }
        if (property.eql($kw61$PATH_TERMINATING_MARK__FN)) {
            return sbhl_mod_path_terminating_mark_fn(module);
        }
        if (property.eql($MARKING_FN)) {
            return sbhl_mod_marking_fn(module);
        }
        if (property.eql($UNMARKING_FN)) {
            return sbhl_mod_unmarking_fn(module);
        }
        return dictionary.dictionary_lookup_without_values(sbhl_mod_misc_properties(module), property, UNPROVIDED);
    }

    public static SubLObject get_sbhl_module_link_pred(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_link_pred(module);
    }

    public static SubLObject get_sbhl_module_accessible_link_preds(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_accessible_link_preds(module);
    }

    public static SubLObject get_sbhl_module_graph(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_graph(module);
    }

    public static SubLObject get_sbhl_module_link_style(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_link_style(module);
    }

    public static SubLObject get_sbhl_module_index_arg(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_index_arg(module);
    }

    public static SubLObject get_sbhl_module_module_type(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_module_type(module);
    }

    public static SubLObject get_sbhl_module_type_test(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_type_test(module);
    }

    public static SubLObject get_sbhl_module_path_terminating_mark(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_path_terminating_mark_fn(module);
    }

    public static SubLObject get_sbhl_module_marking_fn(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_marking_fn(module);
    }

    public static SubLObject get_sbhl_module_unmarking_fn(final SubLObject module) {
        assert NIL != sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_mod_unmarking_fn(module);
    }

    public static SubLObject check_sbhl_modules_store_for_legacy_format() {
        if (NIL != dictionary.dictionary_p($sbhl_modules$.getGlobalValue())) {
            $sbhl_modules$.setGlobalValue(dictionary_utilities.dictionary_to_alist($sbhl_modules$.getGlobalValue()));
            Errors.warn($str63$____SBHL_module_store_has_been_co);
        } else
            if (NIL == list_utilities.alist_p($sbhl_modules$.getGlobalValue())) {
                if (NIL == $sbhl_modules$.getGlobalValue()) {
                    Errors.warn($str64$____No_KB_has_been_loaded__SBHL_m);
                } else {
                    Errors.warn($str65$____Unexpected_SBHL_module_store_, type_of($sbhl_modules$.getGlobalValue()));
                }
            }

        return $CHECKED;
    }

    public static SubLObject sbhl_module_object_p(final SubLObject v_object) {
        return sbhl_module_p(v_object);
    }

    public static SubLObject reset_sbhl_modules() {
        $sbhl_modules$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject rebuild_sbhl_modules() {
        return T;
    }

    public static SubLObject get_sbhl_modules() {
        return $sbhl_modules$.getGlobalValue();
    }

    public static SubLObject add_sbhl_module(final SubLObject predicate, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_predicate_object_p(predicate))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str55$_A_is_not_a__A, predicate, SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str55$_A_is_not_a__A, predicate, SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str55$_A_is_not_a__A, predicate, SBHL_PREDICATE_OBJECT_P);
                    } else {
                        Errors.warn($str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str55$_A_is_not_a__A, predicate, SBHL_PREDICATE_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_object_p(module))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str55$_A_is_not_a__A, module, SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str55$_A_is_not_a__A, module, SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str55$_A_is_not_a__A, module, SBHL_MODULE_OBJECT_P);
                    } else {
                        Errors.warn($str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str55$_A_is_not_a__A, module, SBHL_MODULE_OBJECT_P);
                    }


        }
        $sbhl_modules$.setGlobalValue(acons(predicate, module, $sbhl_modules$.getGlobalValue()));
        sbhl_module_utilities.clear_get_sbhl_predicates();
        return NIL;
    }

    public static SubLObject remove_sbhl_module(final SubLObject predicate) {
        $sbhl_modules$.setGlobalValue(list_utilities.alist_delete_without_values($sbhl_modules$.getGlobalValue(), predicate, UNPROVIDED));
        sbhl_module_utilities.clear_get_sbhl_predicates();
        return NIL;
    }

    public static SubLObject do_sbhl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = NIL;
        destructuring_bind_must_consp(current, datum, $list69);
        module_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list69);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject key = $sym70$KEY;
            return listS(DO_ALIST, list(key, module_var, $list72, $DONE, done_var), list(IGNORE, key), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list69);
        return NIL;
    }

    public static SubLObject get_sbhl_predicates_int() {
        return list_utilities.alist_keys(get_sbhl_modules());
    }

    public static SubLObject get_sbhl_module_list() {
        return list_utilities.alist_values(get_sbhl_modules());
    }

    public static SubLObject sbhl_predicate_object_p(final SubLObject v_object) {
        return forts.fort_p(v_object);
    }

    public static SubLObject sbhl_simple_reflexive_module_type_p(final SubLObject module_type) {
        return eq(module_type, $SIMPLE_REFLEXIVE);
    }

    public static SubLObject sbhl_simple_non_reflexive_module_type_p(final SubLObject module_type) {
        return eq(module_type, $SIMPLE_NON_REFLEXIVE);
    }

    public static SubLObject sbhl_transfers_through_module_type_p(final SubLObject module_type) {
        return eq(module_type, $TRANSFERS_THROUGH);
    }

    public static SubLObject sbhl_disjoins_module_type_p(final SubLObject module_type) {
        return eq(module_type, $DISJOINS);
    }

    public static SubLObject sbhl_time_module_type_p(final SubLObject module_type) {
        return eq(module_type, $TIME);
    }

    public static SubLObject sbhl_transitive_module_type_p(final SubLObject module_type) {
        return makeBoolean(((module_type == $SIMPLE_REFLEXIVE) || (module_type == $SIMPLE_NON_REFLEXIVE)) || (module_type == $TIME));
    }

    public static SubLObject sbhl_module_type_p(final SubLObject module_type) {
        return subl_promotions.memberP(module_type, $sbhl_module_types$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject do_sbhl_simple_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = NIL;
        destructuring_bind_must_consp(current, datum, $list69);
        module_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list69);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = $sym81$MODULE;
            return list(DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(SBHL_SIMPLE_MODULE_P, module), listS(CLET, list(list(module_var, list(GET_SBHL_LINK_PRED, module))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list69);
        return NIL;
    }

    public static SubLObject do_sbhl_time_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = NIL;
        destructuring_bind_must_consp(current, datum, $list69);
        module_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list69);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = $sym87$MODULE;
            return list(DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(SBHL_TIME_MODULE_P, module), listS(CLET, list(list(module_var, module)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list69);
        return NIL;
    }

    public static SubLObject do_sbhl_time_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list89);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = NIL;
        destructuring_bind_must_consp(current, datum, $list89);
        pred_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list89);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = $sym90$MODULE;
            return list(DO_SBHL_MODULES, list(module, done_var), list(PWHEN, list(SBHL_TIME_MODULE_P, module), listS(CLET, list(list(pred_var, list(GET_SBHL_LINK_PRED, module))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list89);
        return NIL;
    }

    public static SubLObject init_sbhl_module_properties(final SubLObject property_list) {
        SubLObject cdolist_list_var = property_list;
        SubLObject property_test_pair = NIL;
        property_test_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject property = property_test_pair.first();
            final SubLObject test_fn = second(property_test_pair);
            dictionary.dictionary_enter($sbhl_module_properties$.getGlobalValue(), property, test_fn);
            cdolist_list_var = cdolist_list_var.rest();
            property_test_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject get_sbhl_module_properties() {
        return $sbhl_module_properties$.getGlobalValue();
    }

    public static SubLObject add_sbhl_module_property(final SubLObject property, final SubLObject test) {
        dictionary.dictionary_enter($sbhl_module_properties$.getGlobalValue(), property, test);
        return NIL;
    }

    public static SubLObject sbhl_module_property_p(final SubLObject property) {
        return dictionary.dictionary_lookup_without_values($sbhl_module_properties$.getGlobalValue(), property, UNPROVIDED);
    }

    public static SubLObject do_sbhl_module_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list116);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property_var = NIL;
        SubLObject test_var = NIL;
        destructuring_bind_must_consp(current, datum, $list116);
        property_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list116);
        test_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list116);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, list(property_var, test_var, $list118, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list116);
        return NIL;
    }

    public static SubLObject get_sbhl_module_required_properties() {
        return $sbhl_module_required_properties$.getGlobalValue();
    }

    public static SubLObject sbhl_module_required_property_p(final SubLObject property) {
        return subl_promotions.memberP(property, $sbhl_module_required_properties$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject do_sbhl_module_required_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property_var = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        property_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list120);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(SMART_CSOME, list(property_var, $list122, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list120);
        return NIL;
    }

    public static SubLObject get_sbhl_module(SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == predicate) {
            return $sbhl_module$.getDynamicValue(thread);
        }
        if ((NIL != sbhl_module_p($sbhl_module$.getDynamicValue(thread))) && predicate.eql(sbhl_module_utilities.get_sbhl_link_pred($sbhl_module$.getDynamicValue(thread)))) {
            return $sbhl_module$.getDynamicValue(thread);
        }
        final SubLObject module = list_utilities.alist_lookup_without_values(get_sbhl_modules(), predicate, UNPROVIDED, UNPROVIDED);
        if (NIL == module) {
            return sbhl_paranoia.sbhl_warn(ZERO_INTEGER, $str123$_A_is_not_a_valid_sbhl_predicate_, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return module;
    }

    public static SubLObject with_sbhl_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list124);
        module = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_module$, module)), append(body, NIL));
    }

    public static SubLObject possibly_with_sbhl_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list124);
        module = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_module$, listS(FIF, module, module, $list127))), append(body, NIL));
    }

    public static SubLObject fort_denotes_sbhl_directed_graph_p(final SubLObject fort) {
        if (fort.eql($fort_denoting_sbhl_directed_graph$.getGlobalValue())) {
            return T;
        }
        if (fort.eql($fort_denoting_sbhl_undirected_graph$.getGlobalValue())) {
            return NIL;
        }
        if (NIL != sbhl_paranoia.sbhl_error(ONE_INTEGER, $str130$Term___a__is_not_used_to_specify_, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
        }
        return NIL;
    }

    public static SubLObject sbhl_link_style_specifier_p(final SubLObject fort) {
        return makeBoolean(fort.eql($fort_denoting_sbhl_directed_graph$.getGlobalValue()) || fort.eql($fort_denoting_sbhl_undirected_graph$.getGlobalValue()));
    }

    public static SubLObject clean_sbhl_modules() {
        SubLObject cdolist_list_var = get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list131);
            key = current.first();
            current = module = current.rest();
            final SubLObject predicate = sbhl_module_utilities.get_sbhl_link_pred(module);
            if (NIL == forts.valid_fortP(predicate)) {
                remove_sbhl_module(module);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        dumper.recompute_missing_sbhl_graphs();
        optimize_sbhl_modules();
        return NIL;
    }

    public static SubLObject optimize_sbhl_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $sbhl_module_link_pred_preference_order$.currentBinding(thread);
        try {
            $sbhl_module_link_pred_preference_order$.bind(sbhl_module_link_pred_preference_order(), thread);
            list_utilities.alist_optimize(get_sbhl_modules(), symbol_function($sym132$SBHL_MODULES_LINK_PRED__));
        } finally {
            $sbhl_module_link_pred_preference_order$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_modules_link_pred_L(final SubLObject pred1, final SubLObject pred2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.position_L(pred1, pred2, $sbhl_module_link_pred_preference_order$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject sbhl_module_link_pred_preference_order() {
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list131);
            key = current.first();
            current = module = current.rest();
            final SubLObject link_pred = sbhl_module_utilities.get_sbhl_link_pred(module);
            final SubLObject v_graph = sbhl_module_utilities.get_sbhl_graph(module);
            final SubLObject graph_size = hash_table_size(v_graph);
            tuples = cons(list(link_pred, graph_size), tuples);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        tuples = Sort.stable_sort(tuples, symbol_function($sym133$_), symbol_function(SECOND));
        SubLObject link_preds = list_utilities.nmapcar(symbol_function(FIRST), tuples);
        link_preds = cons($$genls, delete($$genls, link_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return link_preds;
    }

    public static SubLObject declare_sbhl_module_vars_file() {
        declareFunction(me, "sbhl_module_print_function_trampoline", "SBHL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sbhl_module_p", "SBHL-MODULE-P", 1, 0, false);
        new sbhl_module_vars.$sbhl_module_p$UnaryFunction();
        declareFunction(me, "sbhl_mod_link_pred", "SBHL-MOD-LINK-PRED", 1, 0, false);
        declareFunction(me, "sbhl_mod_accessible_link_preds", "SBHL-MOD-ACCESSIBLE-LINK-PREDS", 1, 0, false);
        declareFunction(me, "sbhl_mod_graph", "SBHL-MOD-GRAPH", 1, 0, false);
        declareFunction(me, "sbhl_mod_link_style", "SBHL-MOD-LINK-STYLE", 1, 0, false);
        declareFunction(me, "sbhl_mod_index_arg", "SBHL-MOD-INDEX-ARG", 1, 0, false);
        declareFunction(me, "sbhl_mod_module_type", "SBHL-MOD-MODULE-TYPE", 1, 0, false);
        declareFunction(me, "sbhl_mod_type_test", "SBHL-MOD-TYPE-TEST", 1, 0, false);
        declareFunction(me, "sbhl_mod_path_terminating_mark_fn", "SBHL-MOD-PATH-TERMINATING-MARK-FN", 1, 0, false);
        declareFunction(me, "sbhl_mod_marking_fn", "SBHL-MOD-MARKING-FN", 1, 0, false);
        declareFunction(me, "sbhl_mod_unmarking_fn", "SBHL-MOD-UNMARKING-FN", 1, 0, false);
        declareFunction(me, "sbhl_mod_var_bindings", "SBHL-MOD-VAR-BINDINGS", 1, 0, false);
        declareFunction(me, "sbhl_mod_misc_properties", "SBHL-MOD-MISC-PROPERTIES", 1, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_link_pred", "_CSETF-SBHL-MOD-LINK-PRED", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_accessible_link_preds", "_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_graph", "_CSETF-SBHL-MOD-GRAPH", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_link_style", "_CSETF-SBHL-MOD-LINK-STYLE", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_index_arg", "_CSETF-SBHL-MOD-INDEX-ARG", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_module_type", "_CSETF-SBHL-MOD-MODULE-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_type_test", "_CSETF-SBHL-MOD-TYPE-TEST", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_path_terminating_mark_fn", "_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_marking_fn", "_CSETF-SBHL-MOD-MARKING-FN", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_unmarking_fn", "_CSETF-SBHL-MOD-UNMARKING-FN", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_var_bindings", "_CSETF-SBHL-MOD-VAR-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_mod_misc_properties", "_CSETF-SBHL-MOD-MISC-PROPERTIES", 2, 0, false);
        declareFunction(me, "make_sbhl_module", "MAKE-SBHL-MODULE", 0, 1, false);
        declareFunction(me, "visit_defstruct_sbhl_module", "VISIT-DEFSTRUCT-SBHL-MODULE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sbhl_module_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-METHOD", 2, 0, false);
        declareFunction(me, "print_sbhl_module", "PRINT-SBHL-MODULE", 3, 0, false);
        declareFunction(me, "new_sbhl_module", "NEW-SBHL-MODULE", 1, 0, false);
        declareFunction(me, "set_sbhl_module_property", "SET-SBHL-MODULE-PROPERTY", 3, 0, false);
        declareFunction(me, "get_sbhl_module_property", "GET-SBHL-MODULE-PROPERTY", 2, 0, false);
        declareFunction(me, "get_sbhl_module_link_pred", "GET-SBHL-MODULE-LINK-PRED", 1, 0, false);
        declareFunction(me, "get_sbhl_module_accessible_link_preds", "GET-SBHL-MODULE-ACCESSIBLE-LINK-PREDS", 1, 0, false);
        declareFunction(me, "get_sbhl_module_graph", "GET-SBHL-MODULE-GRAPH", 1, 0, false);
        declareFunction(me, "get_sbhl_module_link_style", "GET-SBHL-MODULE-LINK-STYLE", 1, 0, false);
        declareFunction(me, "get_sbhl_module_index_arg", "GET-SBHL-MODULE-INDEX-ARG", 1, 0, false);
        declareFunction(me, "get_sbhl_module_module_type", "GET-SBHL-MODULE-MODULE-TYPE", 1, 0, false);
        declareFunction(me, "get_sbhl_module_type_test", "GET-SBHL-MODULE-TYPE-TEST", 1, 0, false);
        declareFunction(me, "get_sbhl_module_path_terminating_mark", "GET-SBHL-MODULE-PATH-TERMINATING-MARK", 1, 0, false);
        declareFunction(me, "get_sbhl_module_marking_fn", "GET-SBHL-MODULE-MARKING-FN", 1, 0, false);
        declareFunction(me, "get_sbhl_module_unmarking_fn", "GET-SBHL-MODULE-UNMARKING-FN", 1, 0, false);
        declareFunction(me, "check_sbhl_modules_store_for_legacy_format", "CHECK-SBHL-MODULES-STORE-FOR-LEGACY-FORMAT", 0, 0, false);
        declareFunction(me, "sbhl_module_object_p", "SBHL-MODULE-OBJECT-P", 1, 0, false);
        declareFunction(me, "reset_sbhl_modules", "RESET-SBHL-MODULES", 0, 0, false);
        declareFunction(me, "rebuild_sbhl_modules", "REBUILD-SBHL-MODULES", 0, 0, false);
        declareFunction(me, "get_sbhl_modules", "GET-SBHL-MODULES", 0, 0, false);
        declareFunction(me, "add_sbhl_module", "ADD-SBHL-MODULE", 2, 0, false);
        declareFunction(me, "remove_sbhl_module", "REMOVE-SBHL-MODULE", 1, 0, false);
        declareMacro(me, "do_sbhl_modules", "DO-SBHL-MODULES");
        declareFunction(me, "get_sbhl_predicates_int", "GET-SBHL-PREDICATES-INT", 0, 0, false);
        declareFunction(me, "get_sbhl_module_list", "GET-SBHL-MODULE-LIST", 0, 0, false);
        declareFunction(me, "sbhl_predicate_object_p", "SBHL-PREDICATE-OBJECT-P", 1, 0, false);
        declareFunction(me, "sbhl_simple_reflexive_module_type_p", "SBHL-SIMPLE-REFLEXIVE-MODULE-TYPE-P", 1, 0, false);
        declareFunction(me, "sbhl_simple_non_reflexive_module_type_p", "SBHL-SIMPLE-NON-REFLEXIVE-MODULE-TYPE-P", 1, 0, false);
        declareFunction(me, "sbhl_transfers_through_module_type_p", "SBHL-TRANSFERS-THROUGH-MODULE-TYPE-P", 1, 0, false);
        declareFunction(me, "sbhl_disjoins_module_type_p", "SBHL-DISJOINS-MODULE-TYPE-P", 1, 0, false);
        declareFunction(me, "sbhl_time_module_type_p", "SBHL-TIME-MODULE-TYPE-P", 1, 0, false);
        declareFunction(me, "sbhl_transitive_module_type_p", "SBHL-TRANSITIVE-MODULE-TYPE-P", 1, 0, false);
        declareFunction(me, "sbhl_module_type_p", "SBHL-MODULE-TYPE-P", 1, 0, false);
        declareMacro(me, "do_sbhl_simple_modules", "DO-SBHL-SIMPLE-MODULES");
        declareMacro(me, "do_sbhl_time_modules", "DO-SBHL-TIME-MODULES");
        declareMacro(me, "do_sbhl_time_predicates", "DO-SBHL-TIME-PREDICATES");
        declareFunction(me, "init_sbhl_module_properties", "INIT-SBHL-MODULE-PROPERTIES", 1, 0, false);
        declareFunction(me, "get_sbhl_module_properties", "GET-SBHL-MODULE-PROPERTIES", 0, 0, false);
        declareFunction(me, "add_sbhl_module_property", "ADD-SBHL-MODULE-PROPERTY", 2, 0, false);
        declareFunction(me, "sbhl_module_property_p", "SBHL-MODULE-PROPERTY-P", 1, 0, false);
        declareMacro(me, "do_sbhl_module_properties", "DO-SBHL-MODULE-PROPERTIES");
        declareFunction(me, "get_sbhl_module_required_properties", "GET-SBHL-MODULE-REQUIRED-PROPERTIES", 0, 0, false);
        declareFunction(me, "sbhl_module_required_property_p", "SBHL-MODULE-REQUIRED-PROPERTY-P", 1, 0, false);
        declareMacro(me, "do_sbhl_module_required_properties", "DO-SBHL-MODULE-REQUIRED-PROPERTIES");
        declareFunction(me, "get_sbhl_module", "GET-SBHL-MODULE", 0, 1, false);
        new sbhl_module_vars.$get_sbhl_module$ZeroArityFunction();
        new sbhl_module_vars.$get_sbhl_module$UnaryFunction();
        declareMacro(me, "with_sbhl_module", "WITH-SBHL-MODULE");
        declareMacro(me, "possibly_with_sbhl_module", "POSSIBLY-WITH-SBHL-MODULE");
        declareFunction(me, "fort_denotes_sbhl_directed_graph_p", "FORT-DENOTES-SBHL-DIRECTED-GRAPH-P", 1, 0, false);
        declareFunction(me, "sbhl_link_style_specifier_p", "SBHL-LINK-STYLE-SPECIFIER-P", 1, 0, false);
        declareFunction(me, "clean_sbhl_modules", "CLEAN-SBHL-MODULES", 0, 0, false);
        declareFunction(me, "optimize_sbhl_modules", "OPTIMIZE-SBHL-MODULES", 0, 0, false);
        declareFunction(me, "sbhl_modules_link_pred_L", "SBHL-MODULES-LINK-PRED-<", 2, 0, false);
        declareFunction(me, "sbhl_module_link_pred_preference_order", "SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_module_vars_file() {
        defconstant("*DTP-SBHL-MODULE*", SBHL_MODULE);
        deflexical("*SBHL-MODULE-KEY-TEST*", symbol_function(EQL));
        deflexical("*SBHL-MODULES*", SubLTrampolineFile.maybeDefault($sbhl_modules$, $sbhl_modules$, NIL));
        deflexical("*SBHL-MODULE-TYPES*", $list75);
        deflexical("*SBHL-MODULE-PROPERTIES*", SubLTrampolineFile.maybeDefault($sbhl_module_properties$, $sbhl_module_properties$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SBHL-MODULE-REQUIRED-PROPERTIES*", $list119);
        defparameter("*SBHL-MODULE*", NIL);
        defvar("*SBHL-MODULE-VARS*", NIL);
        deflexical("*FORT-DENOTING-SBHL-DIRECTED-GRAPH*", $$DirectedMultigraph);
        deflexical("*FORT-DENOTING-SBHL-UNDIRECTED-GRAPH*", $$Multigraph);
        defparameter("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*", T);
        defparameter("*SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_module_vars_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_module$.getGlobalValue(), symbol_function(SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
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
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_module$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_METHOD));
        declare_defglobal($sbhl_modules$);
        declare_defglobal($sbhl_module_properties$);
        init_sbhl_module_properties(list(new SubLObject[]{ list($LINK_PRED, SBHL_PREDICATE_OBJECT_P), list($LINK_STYLE, SBHL_LINK_STYLE_SPECIFIER_P), list($NAUT_FORWARD_TRUE_GENERATORS, FUNCTION_SYMBOL_LIST_P), list($MODULE_TYPE, SBHL_MODULE_TYPE_P), list($TYPE_TEST, FUNCTION_SYMBOL_P), list($MODULE_INVERTS_ARGUMENTS, SBHL_MODULE_OR_PREDICATE_P), list($INVERTS_ARGUMENTS_OF_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($DISJOINS_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($kw61$PATH_TERMINATING_MARK__FN, FUNCTION_SYMBOL_P), list($MARKING_FN, FUNCTION_SYMBOL_P), list($UNMARKING_FN, FUNCTION_SYMBOL_P), list($MARKING_INCREMENT, INTEGERP), list($ACCESSIBLE_LINK_PREDS, LISTP), list($TRANSFERS_THROUGH_MODULE, SBHL_MODULE_OR_PREDICATE_P), list($TRANSFERS_VIA_ARG, INTEGERP), list($ADD_NODE_TO_RESULT_TEST, FUNCTION_SYMBOL_P), list($ADD_UNMARKED_NODE_TO_RESULT_TEST, FUNCTION_SYMBOL_P), list($PREDICATE_SEARCH_P, BOOLEANP), list($MODULE_TAG, KEYWORDP), list($INDEX_ARG, INTEGERP), list($ROOT, SBHL_NODE_OBJECT_P), list($GRAPH, HASH_TABLE_P), list($SBHL_MARKING_PARAMETERS, LISTP) }));
        note_funcall_helper_function($sym132$SBHL_MODULES_LINK_PRED__);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_module_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_module_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_module_vars_file();
    }

    

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

        private $sbhl_module_native() {
            this.$link_pred = Lisp.NIL;
            this.$accessible_link_preds = Lisp.NIL;
            this.$graph = Lisp.NIL;
            this.$link_style = Lisp.NIL;
            this.$index_arg = Lisp.NIL;
            this.$module_type = Lisp.NIL;
            this.$type_test = Lisp.NIL;
            this.$path_terminating_mark_fn = Lisp.NIL;
            this.$marking_fn = Lisp.NIL;
            this.$unmarking_fn = Lisp.NIL;
            this.$var_bindings = Lisp.NIL;
            this.$misc_properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$link_pred;
        }

        @Override
        public SubLObject getField3() {
            return this.$accessible_link_preds;
        }

        @Override
        public SubLObject getField4() {
            return this.$graph;
        }

        @Override
        public SubLObject getField5() {
            return this.$link_style;
        }

        @Override
        public SubLObject getField6() {
            return this.$index_arg;
        }

        @Override
        public SubLObject getField7() {
            return this.$module_type;
        }

        @Override
        public SubLObject getField8() {
            return this.$type_test;
        }

        @Override
        public SubLObject getField9() {
            return this.$path_terminating_mark_fn;
        }

        @Override
        public SubLObject getField10() {
            return this.$marking_fn;
        }

        @Override
        public SubLObject getField11() {
            return this.$unmarking_fn;
        }

        @Override
        public SubLObject getField12() {
            return this.$var_bindings;
        }

        @Override
        public SubLObject getField13() {
            return this.$misc_properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$link_pred = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$accessible_link_preds = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$graph = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$link_style = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$index_arg = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$module_type = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$type_test = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$path_terminating_mark_fn = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$marking_fn = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$unmarking_fn = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$var_bindings = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$misc_properties = value;
        }

        static {
            structDecl = makeStructDeclNative($sbhl_module_native.class, SBHL_MODULE, SBHL_MODULE_P, $list2, $list3, new String[]{ "$link_pred", "$accessible_link_preds", "$graph", "$link_style", "$index_arg", "$module_type", "$type_test", "$path_terminating_mark_fn", "$marking_fn", "$unmarking_fn", "$var_bindings", "$misc_properties" }, $list4, $list5, PRINT_SBHL_MODULE);
        }
    }

    public static final class $sbhl_module_p$UnaryFunction extends UnaryFunction {
        public $sbhl_module_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_module_p(arg1);
        }
    }

    public static final class $get_sbhl_module$ZeroArityFunction extends ZeroArityFunction {
        public $get_sbhl_module$ZeroArityFunction() {
            super(extractFunctionNamed("GET-SBHL-MODULE"));
        }

        @Override
        public SubLObject processItem() {
            return get_sbhl_module(sbhl_module_vars.$get_sbhl_module$ZeroArityFunction.UNPROVIDED);
        }
    }

    public static final class $get_sbhl_module$UnaryFunction extends UnaryFunction {
        public $get_sbhl_module$UnaryFunction() {
            super(extractFunctionNamed("GET-SBHL-MODULE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return get_sbhl_module(arg1);
        }
    }
}

/**
 * Total time: 251 ms
 */
