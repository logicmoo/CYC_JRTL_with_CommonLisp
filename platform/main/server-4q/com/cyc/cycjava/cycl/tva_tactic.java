package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.cycjava.cycl.tva_tactic;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.tva_tactic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class tva_tactic extends SubLTranslatedFile {
    public static final SubLFile me = new tva_tactic();

    public static final String myName = "com.cyc.cycjava.cycl.tva_tactic";

    public static final String myFingerPrint = "496cb1a0401c0134a143dc69e465a12deed523264d359953f8e1f9feba42d7c6";

    // defconstant
    public static final SubLSymbol $dtp_tva_tactic$ = makeSymbol("*DTP-TVA-TACTIC*");

    // deflexical
    // The TVA tactic types, in order of intended execution (faster ones first).
    private static final SubLSymbol $tva_tactic_types$ = makeSymbol("*TVA-TACTIC-TYPES*");

    // Internal Constants
    public static final SubLSymbol TVA_TACTIC = makeSymbol("TVA-TACTIC");

    public static final SubLSymbol TVA_TACTIC_P = makeSymbol("TVA-TACTIC-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("TYPE"), makeSymbol("TVA-PRED"), makeSymbol("INDEX-PRED"), makeSymbol("TRANSITIVE-PRED"), makeSymbol("ARGNUM"), makeSymbol("TERM"), makeSymbol("COST"), makeSymbol("PRECOMPUTATION"), makeSymbol("PARENT-PRED"), makeSymbol("PARENT-PRED-INVERSE?") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("TYPE"), makeKeyword("TVA-PRED"), makeKeyword("INDEX-PRED"), makeKeyword("TRANSITIVE-PRED"), makeKeyword("ARGNUM"), makeKeyword("TERM"), makeKeyword("COST"), makeKeyword("PRECOMPUTATION"), makeKeyword("PARENT-PRED"), makeKeyword("PARENT-PRED-INVERSE?") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("TVA-TYPE"), makeSymbol("TVA-TVA-PRED"), makeSymbol("TVA-INDEX-PRED"), makeSymbol("TVA-TRANSITIVE-PRED"), makeSymbol("TVA-ARGNUM"), makeSymbol("TVA-TERM"), makeSymbol("TVA-COST"), makeSymbol("TVA-PRECOMPUTATION"), makeSymbol("TVA-PARENT-PRED"), makeSymbol("TVA-PARENT-PRED-INVERSE?") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-TVA-TYPE"), makeSymbol("_CSETF-TVA-TVA-PRED"), makeSymbol("_CSETF-TVA-INDEX-PRED"), makeSymbol("_CSETF-TVA-TRANSITIVE-PRED"), makeSymbol("_CSETF-TVA-ARGNUM"), makeSymbol("_CSETF-TVA-TERM"), makeSymbol("_CSETF-TVA-COST"), makeSymbol("_CSETF-TVA-PRECOMPUTATION"), makeSymbol("_CSETF-TVA-PARENT-PRED"), makeSymbol("_CSETF-TVA-PARENT-PRED-INVERSE?") });

    public static final SubLSymbol PRINT_TVA_TACTIC = makeSymbol("PRINT-TVA-TACTIC");

    public static final SubLSymbol TVA_TACTIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TVA-TACTIC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TVA-TACTIC-P"));

    private static final SubLSymbol TVA_TYPE = makeSymbol("TVA-TYPE");

    private static final SubLSymbol _CSETF_TVA_TYPE = makeSymbol("_CSETF-TVA-TYPE");

    private static final SubLSymbol TVA_TVA_PRED = makeSymbol("TVA-TVA-PRED");

    private static final SubLSymbol _CSETF_TVA_TVA_PRED = makeSymbol("_CSETF-TVA-TVA-PRED");

    private static final SubLSymbol TVA_INDEX_PRED = makeSymbol("TVA-INDEX-PRED");

    private static final SubLSymbol _CSETF_TVA_INDEX_PRED = makeSymbol("_CSETF-TVA-INDEX-PRED");

    private static final SubLSymbol TVA_TRANSITIVE_PRED = makeSymbol("TVA-TRANSITIVE-PRED");

    private static final SubLSymbol _CSETF_TVA_TRANSITIVE_PRED = makeSymbol("_CSETF-TVA-TRANSITIVE-PRED");

    private static final SubLSymbol TVA_ARGNUM = makeSymbol("TVA-ARGNUM");

    private static final SubLSymbol _CSETF_TVA_ARGNUM = makeSymbol("_CSETF-TVA-ARGNUM");

    private static final SubLSymbol TVA_TERM = makeSymbol("TVA-TERM");

    private static final SubLSymbol _CSETF_TVA_TERM = makeSymbol("_CSETF-TVA-TERM");

    private static final SubLSymbol TVA_COST = makeSymbol("TVA-COST");

    private static final SubLSymbol _CSETF_TVA_COST = makeSymbol("_CSETF-TVA-COST");

    private static final SubLSymbol TVA_PRECOMPUTATION = makeSymbol("TVA-PRECOMPUTATION");

    private static final SubLSymbol _CSETF_TVA_PRECOMPUTATION = makeSymbol("_CSETF-TVA-PRECOMPUTATION");

    private static final SubLSymbol TVA_PARENT_PRED = makeSymbol("TVA-PARENT-PRED");

    private static final SubLSymbol _CSETF_TVA_PARENT_PRED = makeSymbol("_CSETF-TVA-PARENT-PRED");

    private static final SubLSymbol $sym27$TVA_PARENT_PRED_INVERSE_ = makeSymbol("TVA-PARENT-PRED-INVERSE?");

    private static final SubLSymbol $sym28$_CSETF_TVA_PARENT_PRED_INVERSE_ = makeSymbol("_CSETF-TVA-PARENT-PRED-INVERSE?");



















    private static final SubLSymbol $kw38$PARENT_PRED_INVERSE_ = makeKeyword("PARENT-PRED-INVERSE?");

    private static final SubLString $str39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TVA_TACTIC = makeSymbol("MAKE-TVA-TACTIC");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TVA_TACTIC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TVA-TACTIC-METHOD");

    private static final SubLString $str45$tva_pred____a__ = makeString("tva-pred : ~a~%");

    private static final SubLString $str46$tva_index_pred____a__ = makeString("tva-index-pred : ~a~%");

    private static final SubLString $str47$tva_transitive_pred____a__ = makeString("tva-transitive-pred : ~a~%");

    private static final SubLString $str48$tva_argnum____a__ = makeString("tva-argnum : ~a~%");

    private static final SubLString $str49$tva_term____S__ = makeString("tva-term : ~S~%");

    private static final SubLString $str50$tva_cost____a__ = makeString("tva-cost : ~a~%");

    private static final SubLString $str51$tva_tactic_type____a__ = makeString("tva-tactic-type : ~a~%");

    private static final SubLString $str52$tva_precomputation____a__ = makeString("tva-precomputation : ~a~%");

    private static final SubLString $str53$tva_parent_pred____a__ = makeString("tva-parent-pred : ~a~%");

    private static final SubLString $str54$tva_parent_pred_inverse_____a = makeString("tva-parent-pred-inverse? : ~a");





    private static final SubLList $list57 = list(list(makeSymbol("ARG-VAR"), makeSymbol("TVA-TACTIC"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym58$MARKING_VAR = makeUninternedSymbol("MARKING-VAR");

    private static final SubLSymbol DO_SBHL_TABLE = makeSymbol("DO-SBHL-TABLE");

    private static final SubLSymbol TVA_TACTIC_PRECOMPUTATION = makeSymbol("TVA-TACTIC-PRECOMPUTATION");



    private static final SubLSymbol TVA_PRECOMPUTATION_P = makeSymbol("TVA-PRECOMPUTATION-P");

    private static final SubLList $list63 = list(makeKeyword("LOOKUP"), makeKeyword("PRECOMPUTED-CLOSURE"), makeKeyword("CALCULATE-CLOSURE"), makeKeyword("PREDICATE-EXTENT"));









    private static final SubLObject $$transitiveViaArg = reader_make_constant_shell(makeString("transitiveViaArg"));

    private static final SubLObject $$conservativeViaArg = reader_make_constant_shell(makeString("conservativeViaArg"));

    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    private static final SubLObject $$conservativeViaArgInverse = reader_make_constant_shell(makeString("conservativeViaArgInverse"));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLString $str74$Continue_ = makeString("Continue?");

    private static final SubLString $str75$Error_in_predicate__a = makeString("Error in predicate ~a");



    private static final SubLString $str77$Error_in_direction__a = makeString("Error in direction ~a");

    private static final SubLList $list78 = list(list(makeSymbol("SENTENCE-VAR"), makeSymbol("MT-VAR"), makeSymbol("PRED"), makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("DONE?-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));























    private static final SubLSymbol SKSI_GAF_ARG_POSSIBLE_P = makeSymbol("SKSI-GAF-ARG-POSSIBLE-P");

    private static final SubLSymbol DO_SKSI_GAF_ARG_INDEX_GP = makeSymbol("DO-SKSI-GAF-ARG-INDEX-GP");



    private static final SubLList $list93 = list(list(makeSymbol("SENTENCE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TACTIC"), makeSymbol("DONE?-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym94$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol $sym95$ARG = makeUninternedSymbol("ARG");

    private static final SubLSymbol $sym96$ARGNUM = makeUninternedSymbol("ARGNUM");

    private static final SubLSymbol TVA_TACTIC_ARGNUM = makeSymbol("TVA-TACTIC-ARGNUM");

    private static final SubLSymbol TVA_TACTIC_TERM = makeSymbol("TVA-TACTIC-TERM");

    private static final SubLSymbol TVA_DO_ALL_GAF_ARG_INDEX = makeSymbol("TVA-DO-ALL-GAF-ARG-INDEX");

    private static final SubLSymbol $sym100$PRED = makeUninternedSymbol("PRED");

    public static final SubLSymbol $sym101$ARG = makeUninternedSymbol("ARG");

    private static final SubLSymbol $sym102$ARGNUM = makeUninternedSymbol("ARGNUM");

    private static final SubLSymbol DO_TVA_PRECOMPUTATION_TABLE = makeSymbol("DO-TVA-PRECOMPUTATION-TABLE");

    private static final SubLSymbol $sym104$ARG = makeUninternedSymbol("ARG");

    private static final SubLSymbol $sym105$TRANS_PRED = makeUninternedSymbol("TRANS-PRED");

    private static final SubLSymbol $sym106$TRANS_PRED_MODULE = makeUninternedSymbol("TRANS-PRED-MODULE");

    private static final SubLSymbol $sym107$DIRECTION = makeUninternedSymbol("DIRECTION");

    private static final SubLSymbol $sym108$ARGNUM = makeUninternedSymbol("ARGNUM");

    private static final SubLSymbol $sym109$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol $sym110$LINK_NODE = makeUninternedSymbol("LINK-NODE");

    private static final SubLSymbol TVA_TACTIC_TRANSITIVE_PRED = makeSymbol("TVA-TACTIC-TRANSITIVE-PRED");

    private static final SubLSymbol TVA_DIRECTION_FOR_TVA_PRED = makeSymbol("TVA-DIRECTION-FOR-TVA-PRED");

    private static final SubLSymbol TVA_TACTIC_TVA_PRED = makeSymbol("TVA-TACTIC-TVA-PRED");



    private static final SubLList $list115 = list(reader_make_constant_shell(makeString("genlPreds")));



    private static final SubLSymbol DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");

    private static final SubLSymbol DO_GHL_CLOSURE = makeSymbol("DO-GHL-CLOSURE");



    private static final SubLSymbol $sym120$PRED = makeUninternedSymbol("PRED");

    private static final SubLList $list121 = list(makeSymbol("TVA-ITERATES-KB-PREDICATE-EXTENT?"));



    private static final SubLList $list123 = list(makeSymbol("TVA-ITERATES-SKSI-PREDICATE-EXTENT?"));

    private static final SubLSymbol DO_SKSI_PREDICATE_EXTENT_INDEX = makeSymbol("DO-SKSI-PREDICATE-EXTENT-INDEX");

    private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));



    private static final SubLList $list127 = list(makeSymbol("FAIL-SPACE"), makeSymbol("GOAL-SPACE"));

    private static final SubLObject $$exceptForInArg = reader_make_constant_shell(makeString("exceptForInArg"));

    private static final SubLList $list129 = list(ONE_INTEGER, TWO_INTEGER);

    private static final SubLList $list130 = list(makeSymbol("EXCEPT-TERM"), makeSymbol("EXCEPT-ARGNUM"));

    private static final SubLString $str131$Continue_Anyway_ = makeString("Continue Anyway?");

    public static SubLObject tva_tactic_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_tva_tactic(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tva_tactic_p(final SubLObject v_object) {
        return v_object.getClass() == tva_tactic.$tva_tactic_native.class ? T : NIL;
    }

    public static SubLObject tva_type(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject tva_tva_pred(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject tva_index_pred(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject tva_transitive_pred(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject tva_argnum(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject tva_term(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject tva_cost(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject tva_precomputation(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject tva_parent_pred(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject tva_parent_pred_inverseP(final SubLObject v_object) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_tva_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tva_tva_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tva_index_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tva_transitive_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tva_argnum(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tva_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tva_cost(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tva_precomputation(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_tva_parent_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_tva_parent_pred_inverseP(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_tactic_p(v_object) : "tva_tactic.tva_tactic_p(v_object) " + "CommonSymbols.NIL != tva_tactic.tva_tactic_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_tva_tactic(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new tva_tactic.$tva_tactic_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_tva_type(v_new, current_value);
            } else
                if (pcase_var.eql($TVA_PRED)) {
                    _csetf_tva_tva_pred(v_new, current_value);
                } else
                    if (pcase_var.eql($INDEX_PRED)) {
                        _csetf_tva_index_pred(v_new, current_value);
                    } else
                        if (pcase_var.eql($TRANSITIVE_PRED)) {
                            _csetf_tva_transitive_pred(v_new, current_value);
                        } else
                            if (pcase_var.eql($ARGNUM)) {
                                _csetf_tva_argnum(v_new, current_value);
                            } else
                                if (pcase_var.eql($TERM)) {
                                    _csetf_tva_term(v_new, current_value);
                                } else
                                    if (pcase_var.eql($COST)) {
                                        _csetf_tva_cost(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PRECOMPUTATION)) {
                                            _csetf_tva_precomputation(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PARENT_PRED)) {
                                                _csetf_tva_parent_pred(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($kw38$PARENT_PRED_INVERSE_)) {
                                                    _csetf_tva_parent_pred_inverseP(v_new, current_value);
                                                } else {
                                                    Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tva_tactic(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TVA_TACTIC, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, tva_type(obj));
        funcall(visitor_fn, obj, $SLOT, $TVA_PRED, tva_tva_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX_PRED, tva_index_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $TRANSITIVE_PRED, tva_transitive_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGNUM, tva_argnum(obj));
        funcall(visitor_fn, obj, $SLOT, $TERM, tva_term(obj));
        funcall(visitor_fn, obj, $SLOT, $COST, tva_cost(obj));
        funcall(visitor_fn, obj, $SLOT, $PRECOMPUTATION, tva_precomputation(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_PRED, tva_parent_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $kw38$PARENT_PRED_INVERSE_, tva_parent_pred_inverseP(obj));
        funcall(visitor_fn, obj, $END, MAKE_TVA_TACTIC, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tva_tactic_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tva_tactic(obj, visitor_fn);
    }

    public static SubLObject print_tva_tactic(final SubLObject v_tva_tactic, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            show_tva_tactic(v_tva_tactic, stream);
        } else
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_tva_tactic, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_tva_tactic, T, NIL);
                print_macros.print_unreadable_object_postamble(stream, v_tva_tactic, T, T);
            }

        return NIL;
    }

    public static SubLObject show_tva_tactic(final SubLObject tactic, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str45$tva_pred____a__, tva_tva_pred(tactic));
        format(stream, $str46$tva_index_pred____a__, tva_index_pred(tactic));
        format(stream, $str47$tva_transitive_pred____a__, tva_transitive_pred(tactic));
        format(stream, $str48$tva_argnum____a__, tva_argnum(tactic));
        format(stream, $str49$tva_term____S__, tva_term(tactic));
        format(stream, $str50$tva_cost____a__, tva_cost(tactic));
        format(stream, $str51$tva_tactic_type____a__, tva_type(tactic));
        format(stream, $str52$tva_precomputation____a__, tva_precomputation(tactic));
        format(stream, $str53$tva_parent_pred____a__, tva_parent_pred(tactic));
        format(stream, $str54$tva_parent_pred_inverse_____a, tva_parent_pred_inverseP(tactic));
        return NIL;
    }

    public static SubLObject new_tva_tactic(final SubLObject tva_pred, final SubLObject index_pred, final SubLObject transitive_pred, final SubLObject argnum, final SubLObject v_term, final SubLObject cost, final SubLObject type) {
        final SubLObject tactic = make_tva_tactic(UNPROVIDED);
        _csetf_tva_tva_pred(tactic, tva_pred);
        _csetf_tva_index_pred(tactic, index_pred);
        _csetf_tva_transitive_pred(tactic, transitive_pred);
        _csetf_tva_argnum(tactic, argnum);
        _csetf_tva_term(tactic, v_term);
        _csetf_tva_cost(tactic, cost);
        _csetf_tva_type(tactic, type);
        _csetf_tva_precomputation(tactic, $FREE);
        _csetf_tva_parent_pred(tactic, index_pred);
        _csetf_tva_parent_pred_inverseP(tactic, sbhl_search_vars.genl_inverse_mode_p());
        return tactic;
    }

    public static SubLObject copy_tva_tactic(final SubLObject tactic, final SubLObject flip_argnumP) {
        final SubLObject new_tactic = make_tva_tactic(UNPROVIDED);
        final SubLObject argnum = (NIL != flip_argnumP) ? misc_utilities.other_binary_arg(tva_argnum(tactic)) : tva_argnum(tactic);
        _csetf_tva_tva_pred(new_tactic, tva_tva_pred(tactic));
        _csetf_tva_index_pred(new_tactic, tva_index_pred(tactic));
        _csetf_tva_transitive_pred(new_tactic, tva_transitive_pred(tactic));
        _csetf_tva_argnum(new_tactic, argnum);
        _csetf_tva_term(new_tactic, tva_term(tactic));
        _csetf_tva_type(new_tactic, tva_type(tactic));
        _csetf_tva_precomputation(new_tactic, tva_precomputation(tactic));
        _csetf_tva_parent_pred(new_tactic, tva_parent_pred(tactic));
        _csetf_tva_parent_pred_inverseP(new_tactic, tva_parent_pred_inverseP(tactic));
        return new_tactic;
    }

    public static SubLObject tva_tactic_tva_pred(final SubLObject tactic) {
        return tva_tva_pred(tactic);
    }

    public static SubLObject tva_tactic_index_pred(final SubLObject tactic) {
        return tva_index_pred(tactic);
    }

    public static SubLObject tva_tactic_transitive_pred(final SubLObject tactic) {
        return tva_transitive_pred(tactic);
    }

    public static SubLObject tva_tactic_parent_pred(final SubLObject tactic) {
        return tva_parent_pred(tactic);
    }

    public static SubLObject tva_tactic_parent_pred_inverseP(final SubLObject tactic) {
        return tva_parent_pred_inverseP(tactic);
    }

    public static SubLObject tva_tactic_argnum(final SubLObject tactic) {
        return tva_argnum(tactic);
    }

    public static SubLObject tva_tactic_term(final SubLObject tactic) {
        return tva_term(tactic);
    }

    public static SubLObject tva_tactic_cost(final SubLObject tactic) {
        return tva_cost(tactic);
    }

    public static SubLObject tva_tactic_type(final SubLObject tactic) {
        return tva_type(tactic);
    }

    public static SubLObject tva_tactic_precomputation(final SubLObject tactic) {
        return tva_precomputation(tactic);
    }

    public static SubLObject tva_tactic_tva_argnum(final SubLObject v_tva_tactic, final SubLObject inverseP) {
        return tva_utilities.determine_tva_gather_argnum(tva_tactic_argnum(v_tva_tactic), inverseP);
    }

    public static SubLObject tva_tactic_direction(final SubLObject tactic) {
        return tva_utilities.tva_direction_for_tva_pred(tva_tactic_tva_pred(tactic));
    }

    public static SubLObject tva_forward_direction_tacticP(final SubLObject tactic) {
        return eq($FORWARD, tva_tactic_direction(tactic));
    }

    public static SubLObject tva_sentence_arg_for_tactic(final SubLObject sentence, final SubLObject tactic) {
        return cycl_utilities.atomic_sentence_arg(sentence, tva_tactic_argnum(tactic), UNPROVIDED);
    }

    public static SubLObject tva_tactic_argnum_to_strategy_argnum(final SubLObject tactic, final SubLObject inverseP) {
        final SubLObject argnum = tva_tactic_argnum(tactic);
        return tva_utilities.determine_tva_gather_argnum(argnum, inverseP);
    }

    public static SubLObject do_tva_precomputation_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = NIL;
        SubLObject v_tva_tactic = NIL;
        SubLObject done_var = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        arg_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        v_tva_tactic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        done_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject marking_var = $sym58$MARKING_VAR;
            return listS(DO_SBHL_TABLE, list(arg_var, marking_var, list(TVA_TACTIC_PRECOMPUTATION, v_tva_tactic), done_var), list(IGNORE, marking_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list57);
        return NIL;
    }

    public static SubLObject set_tva_tactic_index_pred(final SubLObject tactic, final SubLObject pred) {
        _csetf_tva_index_pred(tactic, pred);
        return tactic;
    }

    public static SubLObject set_tva_tactic_cost(final SubLObject tactic, final SubLObject cost) {
        _csetf_tva_cost(tactic, cost);
        return tactic;
    }

    public static SubLObject set_tva_tactic_precomputation(final SubLObject tactic, final SubLObject precomputation) {
        assert NIL != tva_utilities.tva_precomputation_p(precomputation) : "tva_utilities.tva_precomputation_p(precomputation) " + "CommonSymbols.NIL != tva_utilities.tva_precomputation_p(precomputation) " + precomputation;
        _csetf_tva_precomputation(tactic, precomputation);
        return tactic;
    }

    public static SubLObject set_tva_tactic_cost_possible_precomputation(final SubLObject tactic, final SubLObject tva_asent_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cost = tva_cost_and_precomputation(tactic, tva_inference.tva_asent_arg(tva_asent_argnum));
        final SubLObject precomputation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        set_tva_tactic_cost(tactic, cost);
        if (NIL != precomputation) {
            set_tva_tactic_precomputation(tactic, precomputation);
            tva_inference.tva_store_precomputation(tactic, precomputation);
        }
        return NIL;
    }

    public static SubLObject sufficient_tactic_p(final SubLObject tactic) {
        return makeBoolean(NIL != tva_type(tactic));
    }

    public static SubLObject tva_tactic_type_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, $tva_tactic_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tva_typeL(final SubLObject type1, final SubLObject type2) {
        return numL(position(type1, $tva_tactic_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), position(type2, $tva_tactic_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject tva_lookup_tactic_p(final SubLObject tactic) {
        return eq(tva_tactic_type(tactic), $LOOKUP);
    }

    public static SubLObject tva_precomputed_tactic_p(final SubLObject tactic) {
        return eq(tva_tactic_type(tactic), $PRECOMPUTED_CLOSURE);
    }

    public static SubLObject tva_calculate_closure_tactic_p(final SubLObject tactic) {
        return eq(tva_tactic_type(tactic), $CALCULATE_CLOSURE);
    }

    public static SubLObject tva_predicate_extent_tactic_p(final SubLObject tactic) {
        return eq(tva_tactic_type(tactic), $PREDICATE_EXTENT);
    }

    public static SubLObject tva_tacticL(final SubLObject tactic1, final SubLObject tactic2) {
        final SubLObject type1 = tva_tactic_type(tactic1);
        final SubLObject type2 = tva_tactic_type(tactic2);
        final SubLObject cost1 = tva_tactic_cost(tactic1);
        final SubLObject cost2 = tva_tactic_cost(tactic2);
        if ((type1.eql(type2) && cost1.isInteger()) && cost2.isInteger()) {
            return numL(cost1, cost2);
        }
        return tva_typeL(type1, type2);
    }

    public static SubLObject tva_tactic_subsumes_tactic_p(final SubLObject tactic1, final SubLObject tactic2, SubLObject flipP) {
        if (flipP == UNPROVIDED) {
            flipP = NIL;
        }
        return makeBoolean((NIL != (NIL == flipP ? tva_tactics_overlap_p(tactic1, tactic2) : tva_inverse_tactics_overlap_p(tactic1, tactic2))) && (tva_type(tactic1).eql(tva_type(tactic2)) || (NIL != tva_typeL(tva_type(tactic1), tva_type(tactic2)))));
    }

    public static SubLObject tva_tactics_overlap_p(final SubLObject tactic1, final SubLObject tactic2) {
        return makeBoolean((tva_tactic_argnum(tactic1).numE(tva_tactic_argnum(tactic2)) && ((NIL == tva_tactic_tva_pred(tactic2)) || tva_tactic_tva_pred(tactic1).eql(tva_tactic_tva_pred(tactic2)))) && ((NIL == tva_tactic_transitive_pred(tactic2)) || tva_tactic_transitive_pred(tactic1).eql(tva_tactic_transitive_pred(tactic2))));
    }

    public static SubLObject tva_inverse_tactics_overlap_p(final SubLObject tactic1, final SubLObject tactic2) {
        return makeBoolean((tva_tactic_argnum(tactic1).numE(misc_utilities.other_binary_arg(tva_tactic_argnum(tactic2))) && tva_tactic_tva_pred(tactic1).eql(tva_tactic_tva_pred(tactic2))) && tva_tactic_transitive_pred(tactic1).eql(tva_tactic_transitive_pred(tactic2)));
    }

    public static SubLObject determine_tva_tactic_type(final SubLObject tva_pred, final SubLObject trans_pred, final SubLObject arg, final SubLObject argnum) {
        if (tva_pred.eql($$transitiveViaArg) || tva_pred.eql($$conservativeViaArg)) {
            final SubLObject inverse_cardinality = ghl_search_utilities.ghl_inverse_cardinality(trans_pred, arg);
            return determine_tactic_type_from_cardinality(trans_pred, arg, argnum, inverse_cardinality);
        }
        if (tva_pred.eql($$transitiveViaArgInverse) || tva_pred.eql($$conservativeViaArgInverse)) {
            final SubLObject predicate_cardinality = ghl_search_utilities.ghl_predicate_cardinality(trans_pred, arg);
            return determine_tactic_type_from_cardinality(trans_pred, arg, argnum, predicate_cardinality);
        }
        return NIL;
    }

    public static SubLObject determine_tactic_type_from_cardinality(final SubLObject trans_pred, final SubLObject arg, final SubLObject argnum, final SubLObject cardinality) {
        if (NIL == groundP(arg, UNPROVIDED)) {
            return NIL;
        }
        if ((NIL != tva_utilities.less_than_precompute_closure_thresholdP(cardinality)) && (NIL != gt_utilities.gt_term_p(arg))) {
            if ((NIL != sksi_tva_utilities.sksi_gaf_arg_impossible_p(trans_pred, arg, argnum)) || (NIL != tva_utilities.tva_precomputes_sksi_closuresP())) {
                return $PRECOMPUTED_CLOSURE;
            }
            return $CALCULATE_CLOSURE;
        } else {
            if ((NIL == tva_utilities.less_than_precompute_closure_thresholdP(cardinality)) && (NIL != gt_utilities.gt_term_p(arg))) {
                return $CALCULATE_CLOSURE;
            }
            if (NIL == abduction.abduced_term_p(arg)) {
                return $PREDICATE_EXTENT;
            }
            return NIL;
        }
    }

    public static SubLObject tva_cost_and_precomputation(final SubLObject tactic, final SubLObject arg) {
        final SubLObject direction = tva_tactic_direction(tactic);
        final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
        final SubLObject type = tva_tactic_type(tactic);
        SubLObject precomputation = NIL;
        SubLObject cardinality = NIL;
        final SubLObject pcase_var = type;
        if (pcase_var.eql($PRECOMPUTED_CLOSURE)) {
            precomputation = compute_tva_closure(trans_pred, arg, direction);
            cardinality = tva_closure_cardinality(precomputation);
        } else
            if (pcase_var.eql($CALCULATE_CLOSURE)) {
                cardinality = tva_closure_cardinality_estimate(trans_pred, arg, direction);
            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                }


        return values(cardinality, precomputation);
    }

    public static SubLObject prune_sbhl_closure_wrt_genl_preds_and_inverse(final SubLObject trans_pred, final SubLObject sbhl_closure) {
        if (trans_pred.eql($$genlPreds) || trans_pred.eql($$genlInverse)) {
            SubLObject prune_nodes = NIL;
            SubLObject node = NIL;
            SubLObject marking = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(sbhl_closure);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    node = getEntryKey(cdohash_entry);
                    marking = getEntryValue(cdohash_entry);
                    if (marking.isCons() && (NIL == subl_promotions.memberP(trans_pred, marking, UNPROVIDED, UNPROVIDED))) {
                        sbhl_marking_utilities.remove_from_sbhl_marking_state(node, trans_pred.eql($$genlPreds) ? $$genlInverse : $$genlPreds, sbhl_closure);
                        if (NIL == sbhl_marking_utilities.node_unmarked_completely_in_sbhl_marking_stateP(node, sbhl_closure)) {
                            continue;
                        }
                        prune_nodes = cons(node, prune_nodes);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject cdolist_list_var = prune_nodes;
            SubLObject node2 = NIL;
            node2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sbhl_marking_utilities.prune_unmarked_node_from_sbhl_marking_state(node2, sbhl_closure);
                cdolist_list_var = cdolist_list_var.rest();
                node2 = cdolist_list_var.first();
            } 
        }
        return sbhl_closure;
    }

    public static SubLObject compute_tva_closure(final SubLObject trans_pred, final SubLObject arg, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject closure = NIL;
        if (NIL != sbhl_module_utilities.sbhl_predicate_p(trans_pred)) {
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject sbhl_closure = sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                        sbhl_marking_methods.sbhl_record_closure(sbhl_module_vars.get_sbhl_module(trans_pred), arg, tva_utilities.tva_direction_to_sbhl_direction(direction), UNPROVIDED, UNPROVIDED);
                        closure = prune_sbhl_closure_wrt_genl_preds_and_inverse(trans_pred, sbhl_closure);
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != fort_types_interface.transitive_binary_predicate_p(trans_pred)) {
                final SubLObject _prev_bind_3 = ghl_marking_utilities.$ghl_table$.currentBinding(thread);
                try {
                    ghl_marking_utilities.$ghl_table$.bind(ghl_marking_utilities.ghl_instantiate_new_space(), thread);
                    final SubLObject ghl_closure = ghl_marking_utilities.$ghl_table$.getDynamicValue(thread);
                    ghl_search_methods.ghl_record_closure(trans_pred, arg, tva_utilities.tva_direction_to_ghl_direction(direction), UNPROVIDED, UNPROVIDED);
                    closure = ghl_closure;
                } finally {
                    ghl_marking_utilities.$ghl_table$.rebind(_prev_bind_3, thread);
                }
            } else
                if (NIL != kb_accessors.binary_predicateP(trans_pred)) {
                    final SubLObject _prev_bind_3 = ghl_marking_utilities.$ghl_table$.currentBinding(thread);
                    try {
                        ghl_marking_utilities.$ghl_table$.bind(ghl_marking_utilities.ghl_instantiate_new_space(), thread);
                        final SubLObject ghl_closure = ghl_marking_utilities.$ghl_table$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$3 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                        try {
                            gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
                            ghl_search_methods.ghl_record_closure(trans_pred, arg, tva_utilities.tva_direction_to_ghl_direction(direction), UNPROVIDED, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0_$3, thread);
                        }
                        closure = ghl_closure;
                    } finally {
                        ghl_marking_utilities.$ghl_table$.rebind(_prev_bind_3, thread);
                    }
                } else {
                    Errors.cerror($str74$Continue_, $str75$Error_in_predicate__a, trans_pred);
                }


        return closure;
    }

    public static SubLObject tva_closure_cardinality(final SubLObject precomputation) {
        return hash_table_count(precomputation);
    }

    public static SubLObject tva_closure_cardinality_estimate(final SubLObject trans_pred, final SubLObject arg, final SubLObject direction) {
        if (direction == $BACKWARD) {
            return ghl_search_utilities.ghl_inverse_cardinality(trans_pred, arg);
        }
        if (direction == $FORWARD) {
            return ghl_search_utilities.ghl_predicate_cardinality(trans_pred, arg);
        }
        Errors.cerror($str74$Continue_, $str77$Error_in_direction__a, direction);
        return NIL;
    }

    public static SubLObject tva_do_all_gaf_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject pred = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        SubLObject doneP_var = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        sentence_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        doneP_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, list(CLET, list(mt_var), listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ sentence_var, v_term, $PREDICATE, pred, $INDEX, argnum, $TRUTH, $TRUE, $DONE, doneP_var }), append(body, NIL))), list(PWHEN_FEATURE, $CYC_SKSI, list(PWHEN, list(SKSI_GAF_ARG_POSSIBLE_P, pred, v_term, argnum), listS(DO_SKSI_GAF_ARG_INDEX_GP, list(new SubLObject[]{ sentence_var, mt_var, v_term, pred, $INDEX_ARGNUM, argnum, $TRUTH, $TRUE, $DONE, doneP_var }), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list78);
        return NIL;
    }

    public static SubLObject do_tva_sentences_for_lookup_tactic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tactic = NIL;
        SubLObject doneP_var = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        sentence_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        tactic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        doneP_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject pred = $sym94$PRED;
            final SubLObject arg = $sym95$ARG;
            final SubLObject argnum = $sym96$ARGNUM;
            return list(CLET, list(list(argnum, list(TVA_TACTIC_ARGNUM, tactic)), list(arg, list(TVA_TACTIC_TERM, tactic)), list(pred, list(TVA_INDEX_PRED, tactic))), listS(TVA_DO_ALL_GAF_ARG_INDEX, list(sentence_var, mt_var, pred, arg, argnum, doneP_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list93);
        return NIL;
    }

    public static SubLObject do_tva_sentences_for_precomputed_tactic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tactic = NIL;
        SubLObject doneP_var = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        sentence_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        tactic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        doneP_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject pred = $sym100$PRED;
            final SubLObject arg = $sym101$ARG;
            final SubLObject argnum = $sym102$ARGNUM;
            return list(CLET, list(list(argnum, list(TVA_TACTIC_ARGNUM, tactic)), list(pred, list(TVA_INDEX_PRED, tactic))), list(DO_TVA_PRECOMPUTATION_TABLE, list(arg, tactic, doneP_var), listS(TVA_DO_ALL_GAF_ARG_INDEX, list(sentence_var, mt_var, pred, arg, argnum, doneP_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list93);
        return NIL;
    }

    public static SubLObject do_tva_sentences_for_calculate_closure_tactic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tactic = NIL;
        SubLObject doneP_var = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        sentence_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        tactic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        doneP_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject arg = $sym104$ARG;
            final SubLObject trans_pred = $sym105$TRANS_PRED;
            final SubLObject trans_pred_module = $sym106$TRANS_PRED_MODULE;
            final SubLObject direction = $sym107$DIRECTION;
            final SubLObject argnum = $sym108$ARGNUM;
            final SubLObject pred = $sym109$PRED;
            final SubLObject link_node = $sym110$LINK_NODE;
            return list(CLET, list(list(arg, list(TVA_TACTIC_TERM, tactic)), list(trans_pred, list(TVA_TACTIC_TRANSITIVE_PRED, tactic)), list(direction, list(TVA_DIRECTION_FOR_TVA_PRED, list(TVA_TACTIC_TVA_PRED, tactic))), list(argnum, list(TVA_TACTIC_ARGNUM, tactic)), list(pred, list(TVA_INDEX_PRED, tactic))), list(PIF, listS(EQL, trans_pred, $list115), list(CLET, list(list(trans_pred_module, list(GET_SBHL_MODULE, trans_pred))), list(DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES, list(link_node, trans_pred_module, direction, arg, NIL, NIL, doneP_var), listS(TVA_DO_ALL_GAF_ARG_INDEX, list(sentence_var, mt_var, pred, link_node, argnum, doneP_var), append(body, NIL)))), list(PROGN, listS(TVA_DO_ALL_GAF_ARG_INDEX, list(sentence_var, mt_var, pred, arg, argnum, doneP_var), append(body, NIL)), list(DO_GHL_CLOSURE, list(link_node, trans_pred, arg, direction, $DONE, doneP_var), list(PUNLESS, list(EQUAL, link_node, arg), listS(TVA_DO_ALL_GAF_ARG_INDEX, list(sentence_var, mt_var, pred, link_node, argnum, doneP_var), append(body, NIL)))))));
        }
        cdestructuring_bind_error(datum, $list93);
        return NIL;
    }

    public static SubLObject do_tva_sentences_for_predicate_extent_tactic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tactic = NIL;
        SubLObject doneP_var = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        sentence_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        tactic = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list93);
        doneP_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject pred = $sym120$PRED;
            return list(CLET, list(list(pred, list(TVA_INDEX_PRED, tactic))), list(CLET, list(mt_var), list(PWHEN, $list121, listS(DO_PREDICATE_EXTENT_INDEX, list(sentence_var, pred, $TRUTH, $TRUE, $DONE, doneP_var), append(body, NIL)))), list(PWHEN_FEATURE, $CYC_SKSI, list(PWHEN, $list123, listS(DO_SKSI_PREDICATE_EXTENT_INDEX, list(sentence_var, mt_var, pred, $TRUTH, $TRUE, $DONE, doneP_var), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list93);
        return NIL;
    }

    public static SubLObject possibly_discharge_evaluatable_predicate_meta_tactic(final SubLObject tactic, final SubLObject v_term, final SubLObject argnum) {
        final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
        SubLObject successP = NIL;
        SubLObject supports = NIL;
        if (trans_pred.eql($$temporallySubsumes)) {
            final SubLObject forwardP = tva_forward_direction_tacticP(tactic);
            final SubLObject asent_arg = tva_inference.tva_asent_arg(argnum);
            final SubLObject inferior = (NIL != forwardP) ? asent_arg : v_term;
            final SubLObject superior = (NIL != forwardP) ? v_term : asent_arg;
            successP = hlmt_relevance.subsumed_time_intervalP(superior, inferior);
            if (NIL != successP) {
                supports = cons(arguments.make_hl_support($TIME, list($$temporallySubsumes, inferior, superior), UNPROVIDED, UNPROVIDED), supports);
            }
        }
        if ((NIL == successP) && (NIL != fort_types_interface.evaluatable_predicate_p(trans_pred, UNPROVIDED))) {
            final SubLObject forwardP = tva_forward_direction_tacticP(tactic);
            final SubLObject asent_arg = tva_inference.tva_asent_arg(argnum);
            final SubLObject inferior = (NIL != forwardP) ? asent_arg : v_term;
            final SubLObject superior = (NIL != forwardP) ? v_term : asent_arg;
            final SubLObject expression = make_binary_formula(trans_pred, inferior, superior);
            successP = relation_evaluation.cyc_evaluate(expression);
            if (NIL != successP) {
                supports = relation_evaluation.cyc_evaluate_justify(expression);
            }
        }
        return values(successP, supports);
    }

    public static SubLObject discharge_tva_precomputed_tactic(final SubLObject tactic, final SubLObject v_term, final SubLObject argnum, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject successP = possibly_discharge_evaluatable_predicate_meta_tactic(tactic, v_term, argnum);
        SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (((NIL == successP) && (NIL != ghl_marking_utilities.ghl_node_marked_in_space_p(v_term, tva_tactic_precomputation(tactic)))) && (NIL == tva_tactic_term_for_sentence_is_exceptionalP(tactic, argnum, sentence))) {
            successP = T;
            if (NIL != tva_inference.tva_compute_justificationsP()) {
                supports = tva_justify_subsumption(tactic, v_term, supports);
            }
        }
        return values(successP, supports);
    }

    public static SubLObject discharge_tva_calculate_closure_tactic(final SubLObject tactic, final SubLObject v_term, final SubLObject argnum, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
        final SubLObject forwardP = tva_forward_direction_tacticP(tactic);
        final SubLObject asent_arg = tva_inference.tva_asent_arg(argnum);
        final SubLObject inferior = (NIL != forwardP) ? asent_arg : v_term;
        final SubLObject superior = (NIL != forwardP) ? v_term : asent_arg;
        thread.resetMultipleValues();
        SubLObject successP = possibly_discharge_evaluatable_predicate_meta_tactic(tactic, v_term, argnum);
        SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            SubLObject current;
            final SubLObject datum = current = tva_inference.tva_reused_spaces_for_relation(trans_pred, superior);
            SubLObject fail_space = NIL;
            SubLObject goal_space = NIL;
            destructuring_bind_must_consp(current, datum, $list127);
            fail_space = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list127);
            goal_space = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != ghl_search_methods.ghl_predicate_relation_within_multiple_searches_p(trans_pred, inferior, superior, fail_space, goal_space, UNPROVIDED, UNPROVIDED)) && (NIL == tva_tactic_term_for_sentence_is_exceptionalP(tactic, argnum, sentence))) {
                    successP = T;
                    if (NIL != tva_inference.tva_compute_justificationsP()) {
                        supports = tva_justify_subsumption(tactic, v_term, supports);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list127);
            }
        }
        return values(successP, supports);
    }

    public static SubLObject discharge_tva_predicate_extent_tactic(final SubLObject tactic, final SubLObject v_term, final SubLObject argnum, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent_arg = tva_inference.tva_asent_arg(argnum);
        SubLObject successP = NIL;
        SubLObject supports = NIL;
        if (asent_arg.equal(v_term)) {
            successP = T;
        }
        if (NIL == successP) {
            thread.resetMultipleValues();
            final SubLObject successP_$4 = possibly_discharge_evaluatable_predicate_meta_tactic(tactic, v_term, argnum);
            final SubLObject supports_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            successP = successP_$4;
            supports = supports_$5;
            if (NIL == successP) {
                final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
                if (NIL != trans_pred) {
                    final SubLObject forwardP = tva_forward_direction_tacticP(tactic);
                    final SubLObject inferior = (NIL != forwardP) ? asent_arg : v_term;
                    final SubLObject superior = (NIL != forwardP) ? v_term : asent_arg;
                    final SubLObject gaf_formula = make_binary_formula(trans_pred, inferior, superior);
                    final SubLObject gaf = kb_indexing.find_gaf_in_relevant_mt(gaf_formula);
                    if ((NIL != gaf) && (NIL == tva_tactic_term_for_sentence_is_exceptionalP(tactic, argnum, sentence))) {
                        successP = T;
                        supports = cons(gaf, supports);
                    }
                }
            }
        }
        return values(successP, supports);
    }

    public static SubLObject tva_tactic_term_for_sentence_is_exceptionalP(final SubLObject tactic, final SubLObject argnum, final SubLObject sentence) {
        if ((NIL != assertion_handles.assertion_p(sentence)) && (NIL != assertion_utilities.assertion_has_meta_assertionsP(sentence))) {
            SubLObject cdolist_list_var;
            final SubLObject except_in_arg_tuples = cdolist_list_var = kb_mapping_utilities.pred_value_tuples(sentence, $$exceptForInArg, THREE_INTEGER, $list129, UNPROVIDED);
            SubLObject except_in_arg_tuple = NIL;
            except_in_arg_tuple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = except_in_arg_tuple;
                SubLObject except_term = NIL;
                SubLObject except_argnum = NIL;
                destructuring_bind_must_consp(current, datum, $list130);
                except_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list130);
                except_argnum = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (argnum.eql(except_argnum) && (NIL != ghl_search_methods.ghl_predicate_relation_p(tva_tactic_transitive_pred(tactic), tva_tactic_term(tactic), except_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        return T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list130);
                }
                cdolist_list_var = cdolist_list_var.rest();
                except_in_arg_tuple = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject tva_justify_subsumption(final SubLObject tactic, final SubLObject assertion_arg, final SubLObject supports) {
        SubLObject result = supports;
        final SubLObject tva_pred = tva_tactic_tva_pred(tactic);
        final SubLObject parent_pred = tva_tactic_parent_pred(tactic);
        final SubLObject trans_pred = tva_tactic_transitive_pred(tactic);
        final SubLObject tva_argnum = tva_tactic_tva_argnum(tactic, makeBoolean(!makeBoolean(NIL == sbhl_search_vars.genl_inverse_mode_p()).eql(makeBoolean(NIL == tva_tactic_parent_pred_inverseP(tactic)))));
        final SubLObject asent_argnum = tva_tactic_argnum_to_strategy_argnum(tactic, sbhl_search_vars.genl_inverse_mode_p());
        final SubLObject asent_arg = tva_inference.tva_asent_arg(asent_argnum);
        if ((NIL != sbhl_search_vars.genl_inverse_mode_p()) || (!assertion_arg.eql(asent_arg))) {
            final SubLObject pcase_var = tva_pred;
            if (pcase_var.eql($$transitiveViaArg) || pcase_var.eql($$conservativeViaArg)) {
                result = cons(arguments.make_hl_support(tva_utilities.tva_support_module_for_pred(trans_pred), list(trans_pred, assertion_arg, asent_arg), UNPROVIDED, UNPROVIDED), result);
                result = tva_parent_to_asent_pred_justification(tactic, result);
                result = cons(tva_utilities.tva_assertion_support(tva_pred, parent_pred, trans_pred, tva_argnum), result);
                result = tva_index_to_parent_pred_justification(tactic, result);
            } else
                if (pcase_var.eql($$transitiveViaArgInverse) || pcase_var.eql($$conservativeViaArgInverse)) {
                    result = cons(arguments.make_hl_support(tva_utilities.tva_support_module_for_pred(trans_pred), list(trans_pred, asent_arg, assertion_arg), UNPROVIDED, UNPROVIDED), result);
                    result = tva_parent_to_asent_pred_justification(tactic, result);
                    result = cons(tva_utilities.tva_assertion_support(tva_pred, parent_pred, trans_pred, tva_argnum), result);
                    result = tva_index_to_parent_pred_justification(tactic, result);
                } else {
                    Errors.cerror($str131$Continue_Anyway_, $str75$Error_in_predicate__a, tva_pred);
                }

        }
        return result;
    }

    public static SubLObject tva_index_to_parent_pred_justification(final SubLObject tactic, final SubLObject supports) {
        final SubLObject index_pred = tva_tactic_index_pred(tactic);
        final SubLObject parent_pred = tva_tactic_parent_pred(tactic);
        final SubLObject inversesP = makeBoolean(!makeBoolean(NIL == tva_tactic_parent_pred_inverseP(tactic)).eql(makeBoolean(NIL == sbhl_search_vars.genl_inverse_mode_p())));
        if (parent_pred.eql(index_pred) && (NIL == inversesP)) {
            return supports;
        }
        if ((NIL != inversesP) && (NIL != genl_inverse_support_in_supportsP(index_pred, parent_pred, supports))) {
            return supports;
        }
        if (NIL != inversesP) {
            return cons(tva_utilities.genl_preds_support_from_pred_to_pred(index_pred, parent_pred, T), supports);
        }
        if (NIL != genl_preds_support_in_supportsP(index_pred, parent_pred, supports)) {
            return supports;
        }
        return cons(tva_utilities.genl_preds_support_from_pred_to_pred(index_pred, parent_pred, NIL), supports);
    }

    public static SubLObject tva_parent_to_asent_pred_justification(final SubLObject tactic, final SubLObject supports) {
        final SubLObject asent_pred = tva_inference.tva_asent_pred();
        final SubLObject parent_pred = tva_tactic_parent_pred(tactic);
        final SubLObject inverseP = tva_tactic_parent_pred_inverseP(tactic);
        if (parent_pred.eql(asent_pred) && (NIL == inverseP)) {
            return supports;
        }
        if ((NIL != inverseP) && (NIL != genl_inverse_support_in_supportsP(parent_pred, asent_pred, supports))) {
            return supports;
        }
        if (NIL != inverseP) {
            return cons(tva_utilities.genl_preds_support_from_pred_to_pred(parent_pred, asent_pred, T), supports);
        }
        if (NIL != genl_preds_support_in_supportsP(parent_pred, asent_pred, supports)) {
            return supports;
        }
        return cons(tva_utilities.genl_preds_support_from_pred_to_pred(parent_pred, asent_pred, NIL), supports);
    }

    public static SubLObject genl_inverse_support_in_supportsP(final SubLObject spec, final SubLObject genl_inverse, final SubLObject supports) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = supports;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if ((NIL != arguments.hl_support_p(support)) && (NIL != arguments.genl_preds_support_p(support))) {
                    final SubLObject sentence = arguments.hl_support_sentence(support);
                    final SubLObject pred = cycl_utilities.formula_operator(sentence);
                    if (pred.eql($$genlInverse)) {
                        foundP = makeBoolean(spec.eql(cycl_utilities.formula_arg1(sentence, UNPROVIDED)) && genl_inverse.eql(cycl_utilities.formula_arg2(sentence, UNPROVIDED)));
                    }
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject genl_preds_support_in_supportsP(final SubLObject spec, final SubLObject genl_inverse, final SubLObject supports) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = supports;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if ((NIL != arguments.hl_support_p(support)) && (NIL != arguments.genl_preds_support_p(support))) {
                    final SubLObject sentence = arguments.hl_support_sentence(support);
                    final SubLObject pred = cycl_utilities.formula_operator(sentence);
                    if (pred.eql($$genlPreds)) {
                        foundP = makeBoolean(spec.eql(cycl_utilities.formula_arg1(sentence, UNPROVIDED)) && genl_inverse.eql(cycl_utilities.formula_arg2(sentence, UNPROVIDED)));
                    }
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject declare_tva_tactic_file() {
        declareFunction(me, "tva_tactic_print_function_trampoline", "TVA-TACTIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "tva_tactic_p", "TVA-TACTIC-P", 1, 0, false);
        new tva_tactic.$tva_tactic_p$UnaryFunction();
        declareFunction(me, "tva_type", "TVA-TYPE", 1, 0, false);
        declareFunction(me, "tva_tva_pred", "TVA-TVA-PRED", 1, 0, false);
        declareFunction(me, "tva_index_pred", "TVA-INDEX-PRED", 1, 0, false);
        declareFunction(me, "tva_transitive_pred", "TVA-TRANSITIVE-PRED", 1, 0, false);
        declareFunction(me, "tva_argnum", "TVA-ARGNUM", 1, 0, false);
        declareFunction(me, "tva_term", "TVA-TERM", 1, 0, false);
        declareFunction(me, "tva_cost", "TVA-COST", 1, 0, false);
        declareFunction(me, "tva_precomputation", "TVA-PRECOMPUTATION", 1, 0, false);
        declareFunction(me, "tva_parent_pred", "TVA-PARENT-PRED", 1, 0, false);
        declareFunction(me, "tva_parent_pred_inverseP", "TVA-PARENT-PRED-INVERSE?", 1, 0, false);
        declareFunction(me, "_csetf_tva_type", "_CSETF-TVA-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_tva_tva_pred", "_CSETF-TVA-TVA-PRED", 2, 0, false);
        declareFunction(me, "_csetf_tva_index_pred", "_CSETF-TVA-INDEX-PRED", 2, 0, false);
        declareFunction(me, "_csetf_tva_transitive_pred", "_CSETF-TVA-TRANSITIVE-PRED", 2, 0, false);
        declareFunction(me, "_csetf_tva_argnum", "_CSETF-TVA-ARGNUM", 2, 0, false);
        declareFunction(me, "_csetf_tva_term", "_CSETF-TVA-TERM", 2, 0, false);
        declareFunction(me, "_csetf_tva_cost", "_CSETF-TVA-COST", 2, 0, false);
        declareFunction(me, "_csetf_tva_precomputation", "_CSETF-TVA-PRECOMPUTATION", 2, 0, false);
        declareFunction(me, "_csetf_tva_parent_pred", "_CSETF-TVA-PARENT-PRED", 2, 0, false);
        declareFunction(me, "_csetf_tva_parent_pred_inverseP", "_CSETF-TVA-PARENT-PRED-INVERSE?", 2, 0, false);
        declareFunction(me, "make_tva_tactic", "MAKE-TVA-TACTIC", 0, 1, false);
        declareFunction(me, "visit_defstruct_tva_tactic", "VISIT-DEFSTRUCT-TVA-TACTIC", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_tva_tactic_method", "VISIT-DEFSTRUCT-OBJECT-TVA-TACTIC-METHOD", 2, 0, false);
        declareFunction(me, "print_tva_tactic", "PRINT-TVA-TACTIC", 3, 0, false);
        declareFunction(me, "show_tva_tactic", "SHOW-TVA-TACTIC", 1, 1, false);
        declareFunction(me, "new_tva_tactic", "NEW-TVA-TACTIC", 7, 0, false);
        declareFunction(me, "copy_tva_tactic", "COPY-TVA-TACTIC", 2, 0, false);
        declareFunction(me, "tva_tactic_tva_pred", "TVA-TACTIC-TVA-PRED", 1, 0, false);
        declareFunction(me, "tva_tactic_index_pred", "TVA-TACTIC-INDEX-PRED", 1, 0, false);
        declareFunction(me, "tva_tactic_transitive_pred", "TVA-TACTIC-TRANSITIVE-PRED", 1, 0, false);
        declareFunction(me, "tva_tactic_parent_pred", "TVA-TACTIC-PARENT-PRED", 1, 0, false);
        declareFunction(me, "tva_tactic_parent_pred_inverseP", "TVA-TACTIC-PARENT-PRED-INVERSE?", 1, 0, false);
        declareFunction(me, "tva_tactic_argnum", "TVA-TACTIC-ARGNUM", 1, 0, false);
        declareFunction(me, "tva_tactic_term", "TVA-TACTIC-TERM", 1, 0, false);
        declareFunction(me, "tva_tactic_cost", "TVA-TACTIC-COST", 1, 0, false);
        declareFunction(me, "tva_tactic_type", "TVA-TACTIC-TYPE", 1, 0, false);
        declareFunction(me, "tva_tactic_precomputation", "TVA-TACTIC-PRECOMPUTATION", 1, 0, false);
        declareFunction(me, "tva_tactic_tva_argnum", "TVA-TACTIC-TVA-ARGNUM", 2, 0, false);
        declareFunction(me, "tva_tactic_direction", "TVA-TACTIC-DIRECTION", 1, 0, false);
        declareFunction(me, "tva_forward_direction_tacticP", "TVA-FORWARD-DIRECTION-TACTIC?", 1, 0, false);
        declareFunction(me, "tva_sentence_arg_for_tactic", "TVA-SENTENCE-ARG-FOR-TACTIC", 2, 0, false);
        declareFunction(me, "tva_tactic_argnum_to_strategy_argnum", "TVA-TACTIC-ARGNUM-TO-STRATEGY-ARGNUM", 2, 0, false);
        declareMacro(me, "do_tva_precomputation_table", "DO-TVA-PRECOMPUTATION-TABLE");
        declareFunction(me, "set_tva_tactic_index_pred", "SET-TVA-TACTIC-INDEX-PRED", 2, 0, false);
        declareFunction(me, "set_tva_tactic_cost", "SET-TVA-TACTIC-COST", 2, 0, false);
        declareFunction(me, "set_tva_tactic_precomputation", "SET-TVA-TACTIC-PRECOMPUTATION", 2, 0, false);
        declareFunction(me, "set_tva_tactic_cost_possible_precomputation", "SET-TVA-TACTIC-COST-POSSIBLE-PRECOMPUTATION", 2, 0, false);
        declareFunction(me, "sufficient_tactic_p", "SUFFICIENT-TACTIC-P", 1, 0, false);
        declareFunction(me, "tva_tactic_type_p", "TVA-TACTIC-TYPE-P", 1, 0, false);
        declareFunction(me, "tva_typeL", "TVA-TYPE<", 2, 0, false);
        declareFunction(me, "tva_lookup_tactic_p", "TVA-LOOKUP-TACTIC-P", 1, 0, false);
        declareFunction(me, "tva_precomputed_tactic_p", "TVA-PRECOMPUTED-TACTIC-P", 1, 0, false);
        declareFunction(me, "tva_calculate_closure_tactic_p", "TVA-CALCULATE-CLOSURE-TACTIC-P", 1, 0, false);
        declareFunction(me, "tva_predicate_extent_tactic_p", "TVA-PREDICATE-EXTENT-TACTIC-P", 1, 0, false);
        declareFunction(me, "tva_tacticL", "TVA-TACTIC<", 2, 0, false);
        declareFunction(me, "tva_tactic_subsumes_tactic_p", "TVA-TACTIC-SUBSUMES-TACTIC-P", 2, 1, false);
        declareFunction(me, "tva_tactics_overlap_p", "TVA-TACTICS-OVERLAP-P", 2, 0, false);
        declareFunction(me, "tva_inverse_tactics_overlap_p", "TVA-INVERSE-TACTICS-OVERLAP-P", 2, 0, false);
        declareFunction(me, "determine_tva_tactic_type", "DETERMINE-TVA-TACTIC-TYPE", 4, 0, false);
        declareFunction(me, "determine_tactic_type_from_cardinality", "DETERMINE-TACTIC-TYPE-FROM-CARDINALITY", 4, 0, false);
        declareFunction(me, "tva_cost_and_precomputation", "TVA-COST-AND-PRECOMPUTATION", 2, 0, false);
        declareFunction(me, "prune_sbhl_closure_wrt_genl_preds_and_inverse", "PRUNE-SBHL-CLOSURE-WRT-GENL-PREDS-AND-INVERSE", 2, 0, false);
        declareFunction(me, "compute_tva_closure", "COMPUTE-TVA-CLOSURE", 3, 0, false);
        declareFunction(me, "tva_closure_cardinality", "TVA-CLOSURE-CARDINALITY", 1, 0, false);
        declareFunction(me, "tva_closure_cardinality_estimate", "TVA-CLOSURE-CARDINALITY-ESTIMATE", 3, 0, false);
        declareMacro(me, "tva_do_all_gaf_arg_index", "TVA-DO-ALL-GAF-ARG-INDEX");
        declareMacro(me, "do_tva_sentences_for_lookup_tactic", "DO-TVA-SENTENCES-FOR-LOOKUP-TACTIC");
        declareMacro(me, "do_tva_sentences_for_precomputed_tactic", "DO-TVA-SENTENCES-FOR-PRECOMPUTED-TACTIC");
        declareMacro(me, "do_tva_sentences_for_calculate_closure_tactic", "DO-TVA-SENTENCES-FOR-CALCULATE-CLOSURE-TACTIC");
        declareMacro(me, "do_tva_sentences_for_predicate_extent_tactic", "DO-TVA-SENTENCES-FOR-PREDICATE-EXTENT-TACTIC");
        declareFunction(me, "possibly_discharge_evaluatable_predicate_meta_tactic", "POSSIBLY-DISCHARGE-EVALUATABLE-PREDICATE-META-TACTIC", 3, 0, false);
        declareFunction(me, "discharge_tva_precomputed_tactic", "DISCHARGE-TVA-PRECOMPUTED-TACTIC", 4, 0, false);
        declareFunction(me, "discharge_tva_calculate_closure_tactic", "DISCHARGE-TVA-CALCULATE-CLOSURE-TACTIC", 4, 0, false);
        declareFunction(me, "discharge_tva_predicate_extent_tactic", "DISCHARGE-TVA-PREDICATE-EXTENT-TACTIC", 4, 0, false);
        declareFunction(me, "tva_tactic_term_for_sentence_is_exceptionalP", "TVA-TACTIC-TERM-FOR-SENTENCE-IS-EXCEPTIONAL?", 3, 0, false);
        declareFunction(me, "tva_justify_subsumption", "TVA-JUSTIFY-SUBSUMPTION", 3, 0, false);
        declareFunction(me, "tva_index_to_parent_pred_justification", "TVA-INDEX-TO-PARENT-PRED-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "tva_parent_to_asent_pred_justification", "TVA-PARENT-TO-ASENT-PRED-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "genl_inverse_support_in_supportsP", "GENL-INVERSE-SUPPORT-IN-SUPPORTS?", 3, 0, false);
        declareFunction(me, "genl_preds_support_in_supportsP", "GENL-PREDS-SUPPORT-IN-SUPPORTS?", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_tva_tactic_file() {
        defconstant("*DTP-TVA-TACTIC*", TVA_TACTIC);
        deflexical("*TVA-TACTIC-TYPES*", $list63);
        return NIL;
    }

    public static SubLObject setup_tva_tactic_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tva_tactic$.getGlobalValue(), symbol_function(TVA_TACTIC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(TVA_TYPE, _CSETF_TVA_TYPE);
        def_csetf(TVA_TVA_PRED, _CSETF_TVA_TVA_PRED);
        def_csetf(TVA_INDEX_PRED, _CSETF_TVA_INDEX_PRED);
        def_csetf(TVA_TRANSITIVE_PRED, _CSETF_TVA_TRANSITIVE_PRED);
        def_csetf(TVA_ARGNUM, _CSETF_TVA_ARGNUM);
        def_csetf(TVA_TERM, _CSETF_TVA_TERM);
        def_csetf(TVA_COST, _CSETF_TVA_COST);
        def_csetf(TVA_PRECOMPUTATION, _CSETF_TVA_PRECOMPUTATION);
        def_csetf(TVA_PARENT_PRED, _CSETF_TVA_PARENT_PRED);
        def_csetf($sym27$TVA_PARENT_PRED_INVERSE_, $sym28$_CSETF_TVA_PARENT_PRED_INVERSE_);
        identity(TVA_TACTIC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tva_tactic$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TVA_TACTIC_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_tva_tactic_file();
    }

    @Override
    public void initializeVariables() {
        init_tva_tactic_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tva_tactic_file();
    }

    static {







































































































































    }

    public static final class $tva_tactic_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $tva_pred;

        public SubLObject $index_pred;

        public SubLObject $transitive_pred;

        public SubLObject $argnum;

        public SubLObject $term;

        public SubLObject $cost;

        public SubLObject $precomputation;

        public SubLObject $parent_pred;

        public SubLObject $parent_pred_inverseP;

        private static final SubLStructDeclNative structDecl;

        public $tva_tactic_native() {
            this.$type = Lisp.NIL;
            this.$tva_pred = Lisp.NIL;
            this.$index_pred = Lisp.NIL;
            this.$transitive_pred = Lisp.NIL;
            this.$argnum = Lisp.NIL;
            this.$term = Lisp.NIL;
            this.$cost = Lisp.NIL;
            this.$precomputation = Lisp.NIL;
            this.$parent_pred = Lisp.NIL;
            this.$parent_pred_inverseP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type;
        }

        @Override
        public SubLObject getField3() {
            return this.$tva_pred;
        }

        @Override
        public SubLObject getField4() {
            return this.$index_pred;
        }

        @Override
        public SubLObject getField5() {
            return this.$transitive_pred;
        }

        @Override
        public SubLObject getField6() {
            return this.$argnum;
        }

        @Override
        public SubLObject getField7() {
            return this.$term;
        }

        @Override
        public SubLObject getField8() {
            return this.$cost;
        }

        @Override
        public SubLObject getField9() {
            return this.$precomputation;
        }

        @Override
        public SubLObject getField10() {
            return this.$parent_pred;
        }

        @Override
        public SubLObject getField11() {
            return this.$parent_pred_inverseP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$tva_pred = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$index_pred = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$transitive_pred = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$argnum = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$term = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$cost = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$precomputation = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$parent_pred = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$parent_pred_inverseP = value;
        }

        static {
            structDecl = makeStructDeclNative(tva_tactic.$tva_tactic_native.class, TVA_TACTIC, TVA_TACTIC_P, $list2, $list3, new String[]{ "$type", "$tva_pred", "$index_pred", "$transitive_pred", "$argnum", "$term", "$cost", "$precomputation", "$parent_pred", "$parent_pred_inverseP" }, $list4, $list5, PRINT_TVA_TACTIC);
        }
    }

    public static final class $tva_tactic_p$UnaryFunction extends UnaryFunction {
        public $tva_tactic_p$UnaryFunction() {
            super(extractFunctionNamed("TVA-TACTIC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tva_tactic_p(arg1);
        }
    }
}

/**
 * Total time: 344 ms
 */
