package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class graphl_search_vars extends SubLTranslatedFile {
    public static final SubLFile me = new graphl_search_vars();

    public static final String myName = "com.cyc.cycjava.cycl.graphl_search_vars";

    public static final String myFingerPrint = "787b964ddc428f0630d3646a5d25419092e95d75700a3fd11bd371468974eec3";

    // defconstant
    public static final SubLSymbol $dtp_graphl_search$ = makeSymbol("*DTP-GRAPHL-SEARCH*");

    // defparameter
    public static final SubLSymbol $use_zero_size_graphl_marking_spacesP$ = makeSymbol("*USE-ZERO-SIZE-GRAPHL-MARKING-SPACES?*");

    // deflexical
    private static final SubLSymbol $graphl_search_size$ = makeSymbol("*GRAPHL-SEARCH-SIZE*");

    // Internal Constants
    public static final SubLSymbol GRAPHL_SEARCH = makeSymbol("GRAPHL-SEARCH");

    public static final SubLSymbol GRAPHL_SEARCH_P = makeSymbol("GRAPHL-SEARCH-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("TYPE"), makeSymbol("ORDER"), makeSymbol("CUTOFF"), makeSymbol("MARKING"), makeSymbol("MARKING-SPACE"), makeSymbol("GOAL-SPACE"), makeSymbol("GOAL"), makeSymbol("GOAL-FN"), makeSymbol("GOAL-FOUND-P"), makeSymbol("SATISFY-FN"), makeSymbol("MAP-FN"), makeSymbol("JUSTIFY?"), makeSymbol("ADD-TO-RESULT?"), makeSymbol("UNWIND-FN-TOGGLE"), makeSymbol("RESULT"), makeSymbol("GRAPH") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("TYPE"), makeKeyword("ORDER"), makeKeyword("CUTOFF"), makeKeyword("MARKING"), makeKeyword("MARKING-SPACE"), makeKeyword("GOAL-SPACE"), makeKeyword("GOAL"), makeKeyword("GOAL-FN"), makeKeyword("GOAL-FOUND-P"), makeKeyword("SATISFY-FN"), makeKeyword("MAP-FN"), makeKeyword("JUSTIFY?"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("UNWIND-FN-TOGGLE"), makeKeyword("RESULT"), makeKeyword("GRAPH") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("GRAPHL-SEARCH-TYPE"), makeSymbol("GRAPHL-SEARCH-ORDER"), makeSymbol("GRAPHL-SEARCH-CUTOFF"), makeSymbol("GRAPHL-SEARCH-MARKING"), makeSymbol("GRAPHL-SEARCH-MARKING-SPACE"), makeSymbol("GRAPHL-SEARCH-GOAL-SPACE"), makeSymbol("GRAPHL-SEARCH-GOAL"), makeSymbol("GRAPHL-SEARCH-GOAL-FN"), makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P"), makeSymbol("GRAPHL-SEARCH-SATISFY-FN"), makeSymbol("GRAPHL-SEARCH-MAP-FN"), makeSymbol("GRAPHL-SEARCH-JUSTIFY?"), makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?"), makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), makeSymbol("GRAPHL-SEARCH-RESULT"), makeSymbol("GRAPHL-SEARCH-GRAPH") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE"), makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER"), makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF"), makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING"), makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P"), makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?"), makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?"), makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT"), makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH") });

    public static final SubLSymbol PRINT_GRAPHL_SEARCH = makeSymbol("PRINT-GRAPHL-SEARCH");

    public static final SubLSymbol GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GRAPHL-SEARCH-P"));

    private static final SubLSymbol GRAPHL_SEARCH_TYPE = makeSymbol("GRAPHL-SEARCH-TYPE");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_TYPE = makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE");

    private static final SubLSymbol GRAPHL_SEARCH_ORDER = makeSymbol("GRAPHL-SEARCH-ORDER");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_ORDER = makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER");

    private static final SubLSymbol GRAPHL_SEARCH_CUTOFF = makeSymbol("GRAPHL-SEARCH-CUTOFF");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_CUTOFF = makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF");

    private static final SubLSymbol GRAPHL_SEARCH_MARKING = makeSymbol("GRAPHL-SEARCH-MARKING");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_MARKING = makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING");

    private static final SubLSymbol GRAPHL_SEARCH_MARKING_SPACE = makeSymbol("GRAPHL-SEARCH-MARKING-SPACE");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_MARKING_SPACE = makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE");

    private static final SubLSymbol GRAPHL_SEARCH_GOAL_SPACE = makeSymbol("GRAPHL-SEARCH-GOAL-SPACE");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_GOAL_SPACE = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE");

    private static final SubLSymbol GRAPHL_SEARCH_GOAL = makeSymbol("GRAPHL-SEARCH-GOAL");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_GOAL = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL");

    private static final SubLSymbol GRAPHL_SEARCH_GOAL_FN = makeSymbol("GRAPHL-SEARCH-GOAL-FN");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_GOAL_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN");

    private static final SubLSymbol GRAPHL_SEARCH_GOAL_FOUND_P = makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_GOAL_FOUND_P = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P");

    private static final SubLSymbol GRAPHL_SEARCH_SATISFY_FN = makeSymbol("GRAPHL-SEARCH-SATISFY-FN");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_SATISFY_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN");

    private static final SubLSymbol GRAPHL_SEARCH_MAP_FN = makeSymbol("GRAPHL-SEARCH-MAP-FN");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_MAP_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN");

    private static final SubLSymbol $sym31$GRAPHL_SEARCH_JUSTIFY_ = makeSymbol("GRAPHL-SEARCH-JUSTIFY?");

    private static final SubLSymbol $sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_ = makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?");

    private static final SubLSymbol $sym33$GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?");

    private static final SubLSymbol $sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?");

    private static final SubLSymbol GRAPHL_SEARCH_UNWIND_FN_TOGGLE = makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE = makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE");

    private static final SubLSymbol GRAPHL_SEARCH_RESULT = makeSymbol("GRAPHL-SEARCH-RESULT");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_RESULT = makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT");

    private static final SubLSymbol GRAPHL_SEARCH_GRAPH = makeSymbol("GRAPHL-SEARCH-GRAPH");

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_GRAPH = makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH");

















    private static final SubLSymbol $GOAL_FOUND_P = makeKeyword("GOAL-FOUND-P");







    private static final SubLSymbol $kw53$ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");

    private static final SubLSymbol $UNWIND_FN_TOGGLE = makeKeyword("UNWIND-FN-TOGGLE");





    private static final SubLString $str57$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_GRAPHL_SEARCH = makeSymbol("MAKE-GRAPHL-SEARCH");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD");

    public static final SubLString $str63$GraphL_Search____a__ = makeString("GraphL Search : ~a~%");

    private static final SubLString $str64$Type____a__ = makeString("Type : ~a~%");

    private static final SubLString $str65$Order____a__ = makeString("Order : ~a~%");

    private static final SubLString $str66$Cutoff____a__ = makeString("Cutoff : ~a~%");

    private static final SubLString $str67$Marking____a__ = makeString("Marking : ~a~%");

    private static final SubLString $str68$Space____a__ = makeString("Space : ~a~%");

    private static final SubLString $str69$Goal_Space____a__ = makeString("Goal Space : ~a~%");

    private static final SubLString $str70$Goal____a__ = makeString("Goal : ~a~%");

    private static final SubLString $str71$Goal_Fn____a__ = makeString("Goal Fn : ~a~%");

    private static final SubLString $str72$Goal_Found_P____a__ = makeString("Goal Found-P : ~a~%");

    private static final SubLString $str73$Satisfy_Fn____a__ = makeString("Satisfy Fn : ~a~%");

    private static final SubLString $str74$Map_Fn____a__ = makeString("Map Fn : ~a~%");

    private static final SubLString $str75$Justify_____a__ = makeString("Justify? : ~a~%");

    private static final SubLString $str76$Add_to_Result_____a__ = makeString("Add to Result? : ~a~%");

    private static final SubLString $str77$Unwind_Fn_Toggle____a__ = makeString("Unwind Fn Toggle : ~a~%");

    private static final SubLString $str78$Result____a__ = makeString("Result : ~a~%");

    private static final SubLString $str79$Graph____a__ = makeString("Graph : ~a~%");











    private static final SubLSymbol $NODES_ON_WIND = makeKeyword("NODES-ON-WIND");

    private static final SubLSymbol $EDGES_ON_UNWIND = makeKeyword("EDGES-ON-UNWIND");

    private static final SubLList $list87 = list(makeKeyword("DEPTH-MARKING"), makeKeyword("SIMPLE"));

    public static final SubLList $list88 = list(makeSymbol("SEARCH-VAR"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list90 = list(list(makeSymbol("NEW-GRAPHL-SEARCH")));

    private static final SubLSymbol SET_GRAPHL_SEARCH_PROPERTIES = makeSymbol("SET-GRAPHL-SEARCH-PROPERTIES");

    private static final SubLSymbol DESTROY_GRAPHL_SEARCH = makeSymbol("DESTROY-GRAPHL-SEARCH");

    private static final SubLSymbol WITH_GRAPHL_SEARCH_INITIALIZED = makeSymbol("WITH-GRAPHL-SEARCH-INITIALIZED");

    private static final SubLInteger $int$200 = makeInteger(200);

    public static SubLObject graphl_search_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_graphl_search(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject graphl_search_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$graphl_search_native.class ? T : NIL;
    }

    public static SubLObject graphl_search_type(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject graphl_search_order(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject graphl_search_cutoff(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject graphl_search_marking(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject graphl_search_marking_space(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject graphl_search_goal_space(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject graphl_search_goal(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject graphl_search_goal_fn(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject graphl_search_goal_found_p(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject graphl_search_satisfy_fn(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject graphl_search_map_fn(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject graphl_search_justifyP(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject graphl_search_add_to_resultP(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject graphl_search_unwind_fn_toggle(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField15();
    }

    public static SubLObject graphl_search_result(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField16();
    }

    public static SubLObject graphl_search_graph(final SubLObject v_object) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.getField17();
    }

    public static SubLObject _csetf_graphl_search_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_graphl_search_order(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_graphl_search_cutoff(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_graphl_search_marking(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_graphl_search_marking_space(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_graphl_search_goal_space(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_graphl_search_goal(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_graphl_search_goal_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_graphl_search_goal_found_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_graphl_search_satisfy_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_graphl_search_map_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_graphl_search_justifyP(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_graphl_search_add_to_resultP(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_graphl_search_unwind_fn_toggle(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_graphl_search_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_graphl_search_graph(final SubLObject v_object, final SubLObject value) {
        assert NIL != graphl_search_p(v_object) : "graphl_search_vars.graphl_search_p error :" + v_object;
        return v_object.setField17(value);
    }

    public static SubLObject make_graphl_search(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $graphl_search_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_graphl_search_type(v_new, current_value);
            } else
                if (pcase_var.eql($ORDER)) {
                    _csetf_graphl_search_order(v_new, current_value);
                } else
                    if (pcase_var.eql($CUTOFF)) {
                        _csetf_graphl_search_cutoff(v_new, current_value);
                    } else
                        if (pcase_var.eql($MARKING)) {
                            _csetf_graphl_search_marking(v_new, current_value);
                        } else
                            if (pcase_var.eql($MARKING_SPACE)) {
                                _csetf_graphl_search_marking_space(v_new, current_value);
                            } else
                                if (pcase_var.eql($GOAL_SPACE)) {
                                    _csetf_graphl_search_goal_space(v_new, current_value);
                                } else
                                    if (pcase_var.eql($GOAL)) {
                                        _csetf_graphl_search_goal(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($GOAL_FN)) {
                                            _csetf_graphl_search_goal_fn(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($GOAL_FOUND_P)) {
                                                _csetf_graphl_search_goal_found_p(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($SATISFY_FN)) {
                                                    _csetf_graphl_search_satisfy_fn(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($MAP_FN)) {
                                                        _csetf_graphl_search_map_fn(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($JUSTIFY_)) {
                                                            _csetf_graphl_search_justifyP(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($kw53$ADD_TO_RESULT_)) {
                                                                _csetf_graphl_search_add_to_resultP(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($UNWIND_FN_TOGGLE)) {
                                                                    _csetf_graphl_search_unwind_fn_toggle(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($RESULT)) {
                                                                        _csetf_graphl_search_result(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($GRAPH)) {
                                                                            _csetf_graphl_search_graph(v_new, current_value);
                                                                        } else {
                                                                            Errors.error($str57$Invalid_slot__S_for_construction_, current_arg);
                                                                        }















        }
        return v_new;
    }

    public static SubLObject visit_defstruct_graphl_search(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GRAPHL_SEARCH, SIXTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, graphl_search_type(obj));
        funcall(visitor_fn, obj, $SLOT, $ORDER, graphl_search_order(obj));
        funcall(visitor_fn, obj, $SLOT, $CUTOFF, graphl_search_cutoff(obj));
        funcall(visitor_fn, obj, $SLOT, $MARKING, graphl_search_marking(obj));
        funcall(visitor_fn, obj, $SLOT, $MARKING_SPACE, graphl_search_marking_space(obj));
        funcall(visitor_fn, obj, $SLOT, $GOAL_SPACE, graphl_search_goal_space(obj));
        funcall(visitor_fn, obj, $SLOT, $GOAL, graphl_search_goal(obj));
        funcall(visitor_fn, obj, $SLOT, $GOAL_FN, graphl_search_goal_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $GOAL_FOUND_P, graphl_search_goal_found_p(obj));
        funcall(visitor_fn, obj, $SLOT, $SATISFY_FN, graphl_search_satisfy_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $MAP_FN, graphl_search_map_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $JUSTIFY_, graphl_search_justifyP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw53$ADD_TO_RESULT_, graphl_search_add_to_resultP(obj));
        funcall(visitor_fn, obj, $SLOT, $UNWIND_FN_TOGGLE, graphl_search_unwind_fn_toggle(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT, graphl_search_result(obj));
        funcall(visitor_fn, obj, $SLOT, $GRAPH, graphl_search_graph(obj));
        funcall(visitor_fn, obj, $END, MAKE_GRAPHL_SEARCH, SIXTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_graphl_search_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_graphl_search(obj, visitor_fn);
    }

    public static SubLObject print_graphl_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, NIL);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return NIL;
    }

    public static SubLObject describe_graphl_search(final SubLObject v_object) {
        format(T, $str63$GraphL_Search____a__, v_object);
        format(T, $str64$Type____a__, graphl_search_type(v_object));
        format(T, $str65$Order____a__, graphl_search_order(v_object));
        format(T, $str66$Cutoff____a__, graphl_search_cutoff(v_object));
        format(T, $str67$Marking____a__, graphl_search_marking(v_object));
        format(T, $str68$Space____a__, graphl_search_marking_space(v_object));
        format(T, $str69$Goal_Space____a__, graphl_search_goal_space(v_object));
        format(T, $str70$Goal____a__, graphl_search_goal(v_object));
        format(T, $str71$Goal_Fn____a__, graphl_search_goal_fn(v_object));
        format(T, $str72$Goal_Found_P____a__, graphl_search_goal_found_p(v_object));
        format(T, $str73$Satisfy_Fn____a__, graphl_search_satisfy_fn(v_object));
        format(T, $str74$Map_Fn____a__, graphl_search_map_fn(v_object));
        format(T, $str75$Justify_____a__, graphl_search_justifyP(v_object));
        format(T, $str76$Add_to_Result_____a__, graphl_search_add_to_resultP(v_object));
        format(T, $str77$Unwind_Fn_Toggle____a__, graphl_search_unwind_fn_toggle(v_object));
        format(T, $str78$Result____a__, graphl_search_result(v_object));
        format(T, $str79$Graph____a__, graphl_search_graph(v_object));
        return NIL;
    }

    public static SubLObject new_graphl_search(final SubLObject plist) {
        final SubLObject graphl_search = make_graphl_search(UNPROVIDED);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            set_graphl_search_property(graphl_search, property, value);
        }
        possibly_initialize_graphl_marking_spaces(graphl_search);
        set_graphl_search_result(graphl_search, NIL);
        return graphl_search;
    }

    public static SubLObject destroy_graphl_search(final SubLObject graph_search) {
        _csetf_graphl_search_marking_space(graph_search, $FREE);
        _csetf_graphl_search_result(graph_search, $FREE);
        _csetf_graphl_search_graph(graph_search, $FREE);
        return NIL;
    }

    public static SubLObject graphl_type(final SubLObject v_search) {
        return graphl_search_type(v_search);
    }

    public static SubLObject graphl_order(final SubLObject v_search) {
        return graphl_search_order(v_search);
    }

    public static SubLObject graphl_marking(final SubLObject v_search) {
        return graphl_search_marking(v_search);
    }

    public static SubLObject graphl_space(final SubLObject v_search) {
        return graphl_search_marking_space(v_search);
    }

    public static SubLObject graphl_goal(final SubLObject v_search) {
        return graphl_search_goal(v_search);
    }

    public static SubLObject graphl_goal_space(final SubLObject v_search) {
        return graphl_search_goal_space(v_search);
    }

    public static SubLObject graphl_goal_found_p(final SubLObject v_search) {
        return graphl_search_goal_found_p(v_search);
    }

    public static SubLObject graphl_map_fn(final SubLObject v_search) {
        return graphl_search_map_fn(v_search);
    }

    public static SubLObject graphl_compute_justifyP(final SubLObject v_search) {
        return graphl_search_justifyP(v_search);
    }

    public static SubLObject graphl_cutoff(final SubLObject v_search) {
        return graphl_search_cutoff(v_search);
    }

    public static SubLObject graphl_add_to_resultP(final SubLObject v_search) {
        return graphl_search_add_to_resultP(v_search);
    }

    public static SubLObject graphl_result(final SubLObject v_search) {
        return graphl_search_result(v_search);
    }

    public static SubLObject graphl_depth_first_search_p(final SubLObject v_search) {
        return eq(graphl_order(v_search), $DEPTH_FIRST);
    }

    public static SubLObject graphl_breadth_first_search_p(final SubLObject v_search) {
        return eq(graphl_order(v_search), $BREADTH_FIRST);
    }

    public static SubLObject graphl_iterative_deepening_search_p(final SubLObject v_search) {
        return eq(graphl_order(v_search), $ITERATIVE_DEEPENING);
    }

    public static SubLObject graphl_depth_marking_search_p(final SubLObject v_search) {
        return eq(graphl_marking(v_search), $DEPTH_MARKING);
    }

    public static SubLObject graphl_return_one_answer_p(final SubLObject v_search) {
        return graphl_goal_search_p(v_search);
    }

    public static SubLObject graphl_add_nodes_on_wind_p(final SubLObject v_search) {
        return eq(graphl_add_to_resultP(v_search), $NODES_ON_WIND);
    }

    public static SubLObject graphl_add_edges_on_unwind_p(final SubLObject v_search) {
        return eq(graphl_add_to_resultP(v_search), $EDGES_ON_UNWIND);
    }

    public static SubLObject graphl_goal_search_p(final SubLObject v_search) {
        return makeBoolean((NIL != graphl_search_goal(v_search)) || (NIL != graphl_search_goal_fn(v_search)));
    }

    public static SubLObject graphl_single_goal_p(final SubLObject v_search) {
        return atom(graphl_goal(v_search));
    }

    public static SubLObject graphl_multiple_goals_p(final SubLObject v_search) {
        return listp(graphl_goal(v_search));
    }

    public static SubLObject graphl_goal_fn_p(final SubLObject v_search) {
        return function_spec_p(graphl_search_goal_fn(v_search));
    }

    public static SubLObject graphl_map_p(final SubLObject v_search) {
        return list_utilities.sublisp_boolean(graphl_map_fn(v_search));
    }

    public static SubLObject graphl_depth_cutoff(final SubLObject v_search) {
        return graphl_search_cutoff(v_search);
    }

    public static SubLObject graphl_cutoff_search_p(final SubLObject v_search) {
        return list_utilities.sublisp_boolean(graphl_search_cutoff(v_search));
    }

    public static SubLObject valid_graphl_search_order_p(final SubLObject order) {
        return makeBoolean((order == $DEPTH_FIRST) || (order == $BREADTH_FIRST));
    }

    public static SubLObject valid_graphl_cutoff_p(final SubLObject cutoff) {
        return makeBoolean((NIL == cutoff) || (cutoff == $GOAL));
    }

    public static SubLObject valid_graphl_marking_style_p(final SubLObject marking) {
        return subl_promotions.memberP(marking, $list87, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject graphl_table_p(final SubLObject obj) {
        return hash_table_p(obj);
    }

    public static SubLObject with_graphl_search_initialized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject search_var = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list88);
        search_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list88);
        plist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(bq_cons(search_var, $list90)), list(SET_GRAPHL_SEARCH_PROPERTIES, search_var, plist), append(body, list(list(DESTROY_GRAPHL_SEARCH, search_var))));
    }

    public static SubLObject set_graphl_search_properties(final SubLObject v_search, final SubLObject plist) {
        SubLObject remainder;
        SubLObject prop;
        SubLObject val;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            prop = remainder.first();
            val = cadr(remainder);
            set_graphl_search_property(v_search, prop, val);
        }
        return v_search;
    }

    public static SubLObject set_graphl_search_property(final SubLObject v_search, final SubLObject property, final SubLObject value) {
        if (property.eql($TYPE)) {
            _csetf_graphl_search_type(v_search, value);
        } else
            if (property.eql($ORDER)) {
                _csetf_graphl_search_order(v_search, value);
            } else
                if (property.eql($CUTOFF)) {
                    _csetf_graphl_search_cutoff(v_search, value);
                } else
                    if (property.eql($MARKING)) {
                        _csetf_graphl_search_marking(v_search, value);
                    } else
                        if (property.eql($MARKING_SPACE)) {
                            _csetf_graphl_search_marking_space(v_search, value);
                        } else
                            if (property.eql($GOAL)) {
                                _csetf_graphl_search_goal(v_search, value);
                            } else
                                if (property.eql($GOAL_FN)) {
                                    _csetf_graphl_search_goal_fn(v_search, value);
                                } else
                                    if (property.eql($GOAL_SPACE)) {
                                        _csetf_graphl_search_goal_space(v_search, value);
                                    } else
                                        if (property.eql($SATISFY_FN)) {
                                            _csetf_graphl_search_satisfy_fn(v_search, value);
                                        } else
                                            if (property.eql($MAP_FN)) {
                                                _csetf_graphl_search_map_fn(v_search, value);
                                            } else
                                                if (property.eql($JUSTIFY_)) {
                                                    _csetf_graphl_search_justifyP(v_search, value);
                                                } else
                                                    if (property.eql($kw53$ADD_TO_RESULT_)) {
                                                        _csetf_graphl_search_add_to_resultP(v_search, value);
                                                    } else
                                                        if (property.eql($UNWIND_FN_TOGGLE)) {
                                                            _csetf_graphl_search_unwind_fn_toggle(v_search, value);
                                                        }












        return v_search;
    }

    public static SubLObject set_graphl_search_type(final SubLObject v_search, final SubLObject type) {
        _csetf_graphl_search_type(v_search, type);
        return NIL;
    }

    public static SubLObject set_graphl_search_order(final SubLObject v_search, final SubLObject order) {
        _csetf_graphl_search_order(v_search, order);
        return NIL;
    }

    public static SubLObject set_graphl_search_cutoff(final SubLObject v_search, final SubLObject cutoff_type) {
        _csetf_graphl_search_cutoff(v_search, cutoff_type);
        return NIL;
    }

    public static SubLObject set_graphl_search_marking(final SubLObject v_search, final SubLObject marking) {
        _csetf_graphl_search_marking(v_search, marking);
        return NIL;
    }

    public static SubLObject set_graphl_search_marking_space(final SubLObject v_search, final SubLObject marking_space) {
        _csetf_graphl_search_marking_space(v_search, marking_space);
        return NIL;
    }

    public static SubLObject set_graphl_search_goal(final SubLObject v_search, final SubLObject goal) {
        _csetf_graphl_search_goal(v_search, goal);
        return NIL;
    }

    public static SubLObject set_graphl_search_goal_fn(final SubLObject v_search, final SubLObject goal_fn) {
        _csetf_graphl_search_goal_fn(v_search, goal_fn);
        return NIL;
    }

    public static SubLObject set_graphl_search_goal_found_p(final SubLObject v_search, final SubLObject found_p) {
        _csetf_graphl_search_goal_found_p(v_search, found_p);
        return NIL;
    }

    public static SubLObject set_graphl_search_goal_space(final SubLObject v_search, final SubLObject goal_space) {
        _csetf_graphl_search_goal_space(v_search, goal_space);
        return NIL;
    }

    public static SubLObject set_graphl_search_satisfy_fn(final SubLObject v_search, final SubLObject satisfy_fn) {
        _csetf_graphl_search_satisfy_fn(v_search, satisfy_fn);
        return NIL;
    }

    public static SubLObject set_graphl_search_map_fn(final SubLObject v_search, final SubLObject map_fn) {
        _csetf_graphl_search_map_fn(v_search, map_fn);
        return NIL;
    }

    public static SubLObject set_graphl_search_justifyP(final SubLObject v_search, final SubLObject justifyP) {
        _csetf_graphl_search_justifyP(v_search, justifyP);
        return NIL;
    }

    public static SubLObject set_graphl_search_result(final SubLObject v_search, final SubLObject result) {
        _csetf_graphl_search_result(v_search, result);
        return NIL;
    }

    public static SubLObject set_graphl_search_add_to_resultP(final SubLObject v_search, final SubLObject addP) {
        _csetf_graphl_search_add_to_resultP(v_search, addP);
        return NIL;
    }

    public static SubLObject possibly_initialize_graphl_marking_spaces(final SubLObject v_search) {
        final SubLObject space = graphl_search_marking_space(v_search);
        if (NIL == space) {
            _csetf_graphl_search_marking_space(v_search, graphl_instantiate_new_space());
        }
        return v_search;
    }

    public static SubLObject reinitialize_graphl_spaces(final SubLObject v_search) {
        _csetf_graphl_search_marking_space(v_search, graphl_instantiate_new_space());
        _csetf_graphl_search_goal_space(v_search, graphl_instantiate_new_space());
        return NIL;
    }

    public static SubLObject graphl_add_node_to_result(final SubLObject v_search, final SubLObject node) {
        _csetf_graphl_search_result(v_search, cons(node, graphl_search_result(v_search)));
        return NIL;
    }

    public static SubLObject graphl_add_to_result(final SubLObject v_search, final SubLObject addition, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        if (NIL == member(addition, graphl_search_result(v_search), test, symbol_function(IDENTITY))) {
            _csetf_graphl_search_result(v_search, cons(addition, graphl_search_result(v_search)));
        }
        return NIL;
    }

    public static SubLObject graphl_append_to_result(final SubLObject v_search, final SubLObject addition) {
        set_graphl_search_result(v_search, append(graphl_search_result(v_search), addition));
        return NIL;
    }

    public static SubLObject graphl_toggle_unwind_off(final SubLObject v_search) {
        _csetf_graphl_search_unwind_fn_toggle(v_search, NIL);
        return NIL;
    }

    public static SubLObject graphl_toggle_unwind_on(final SubLObject v_search) {
        _csetf_graphl_search_unwind_fn_toggle(v_search, T);
        return NIL;
    }

    public static SubLObject graphl_node_provides_answer_p(final SubLObject v_search, final SubLObject node) {
        if (NIL != graphl_single_goal_p(v_search)) {
            if (graphl_search_goal(v_search) == $SATISFY_FN) {
                return funcall(graphl_search_satisfy_fn(v_search), node);
            }
            return eq(node, graphl_search_goal(v_search));
        } else {
            if (NIL != graphl_multiple_goals_p(v_search)) {
                return subl_promotions.memberP(node, graphl_search_goal(v_search), UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject graphl_search_size() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $use_zero_size_graphl_marking_spacesP$.getDynamicValue(thread) ? ZERO_INTEGER : $graphl_search_size$.getGlobalValue();
    }

    public static SubLObject graphl_instantiate_new_space() {
        return make_hash_table(graphl_search_size(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject graphl_goal_found_condition_p(final SubLObject condition) {
        return eq(condition, $GOAL);
    }

    public static SubLObject declare_graphl_search_vars_file() {
        declareFunction(me, "graphl_search_print_function_trampoline", "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "graphl_search_p", "GRAPHL-SEARCH-P", 1, 0, false);
        new graphl_search_vars.$graphl_search_p$UnaryFunction();
        declareFunction(me, "graphl_search_type", "GRAPHL-SEARCH-TYPE", 1, 0, false);
        declareFunction(me, "graphl_search_order", "GRAPHL-SEARCH-ORDER", 1, 0, false);
        declareFunction(me, "graphl_search_cutoff", "GRAPHL-SEARCH-CUTOFF", 1, 0, false);
        declareFunction(me, "graphl_search_marking", "GRAPHL-SEARCH-MARKING", 1, 0, false);
        declareFunction(me, "graphl_search_marking_space", "GRAPHL-SEARCH-MARKING-SPACE", 1, 0, false);
        declareFunction(me, "graphl_search_goal_space", "GRAPHL-SEARCH-GOAL-SPACE", 1, 0, false);
        declareFunction(me, "graphl_search_goal", "GRAPHL-SEARCH-GOAL", 1, 0, false);
        declareFunction(me, "graphl_search_goal_fn", "GRAPHL-SEARCH-GOAL-FN", 1, 0, false);
        declareFunction(me, "graphl_search_goal_found_p", "GRAPHL-SEARCH-GOAL-FOUND-P", 1, 0, false);
        declareFunction(me, "graphl_search_satisfy_fn", "GRAPHL-SEARCH-SATISFY-FN", 1, 0, false);
        declareFunction(me, "graphl_search_map_fn", "GRAPHL-SEARCH-MAP-FN", 1, 0, false);
        declareFunction(me, "graphl_search_justifyP", "GRAPHL-SEARCH-JUSTIFY?", 1, 0, false);
        declareFunction(me, "graphl_search_add_to_resultP", "GRAPHL-SEARCH-ADD-TO-RESULT?", 1, 0, false);
        declareFunction(me, "graphl_search_unwind_fn_toggle", "GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 1, 0, false);
        declareFunction(me, "graphl_search_result", "GRAPHL-SEARCH-RESULT", 1, 0, false);
        declareFunction(me, "graphl_search_graph", "GRAPHL-SEARCH-GRAPH", 1, 0, false);
        declareFunction(me, "_csetf_graphl_search_type", "_CSETF-GRAPHL-SEARCH-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_order", "_CSETF-GRAPHL-SEARCH-ORDER", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_cutoff", "_CSETF-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_marking", "_CSETF-GRAPHL-SEARCH-MARKING", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_marking_space", "_CSETF-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_goal_space", "_CSETF-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_goal", "_CSETF-GRAPHL-SEARCH-GOAL", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_goal_fn", "_CSETF-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_goal_found_p", "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_satisfy_fn", "_CSETF-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_map_fn", "_CSETF-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_justifyP", "_CSETF-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_add_to_resultP", "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_unwind_fn_toggle", "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_result", "_CSETF-GRAPHL-SEARCH-RESULT", 2, 0, false);
        declareFunction(me, "_csetf_graphl_search_graph", "_CSETF-GRAPHL-SEARCH-GRAPH", 2, 0, false);
        declareFunction(me, "make_graphl_search", "MAKE-GRAPHL-SEARCH", 0, 1, false);
        declareFunction(me, "visit_defstruct_graphl_search", "VISIT-DEFSTRUCT-GRAPHL-SEARCH", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_graphl_search_method", "VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD", 2, 0, false);
        declareFunction(me, "print_graphl_search", "PRINT-GRAPHL-SEARCH", 3, 0, false);
        declareFunction(me, "describe_graphl_search", "DESCRIBE-GRAPHL-SEARCH", 1, 0, false);
        declareFunction(me, "new_graphl_search", "NEW-GRAPHL-SEARCH", 1, 0, false);
        declareFunction(me, "destroy_graphl_search", "DESTROY-GRAPHL-SEARCH", 1, 0, false);
        declareFunction(me, "graphl_type", "GRAPHL-TYPE", 1, 0, false);
        declareFunction(me, "graphl_order", "GRAPHL-ORDER", 1, 0, false);
        declareFunction(me, "graphl_marking", "GRAPHL-MARKING", 1, 0, false);
        declareFunction(me, "graphl_space", "GRAPHL-SPACE", 1, 0, false);
        declareFunction(me, "graphl_goal", "GRAPHL-GOAL", 1, 0, false);
        declareFunction(me, "graphl_goal_space", "GRAPHL-GOAL-SPACE", 1, 0, false);
        declareFunction(me, "graphl_goal_found_p", "GRAPHL-GOAL-FOUND-P", 1, 0, false);
        declareFunction(me, "graphl_map_fn", "GRAPHL-MAP-FN", 1, 0, false);
        declareFunction(me, "graphl_compute_justifyP", "GRAPHL-COMPUTE-JUSTIFY?", 1, 0, false);
        declareFunction(me, "graphl_cutoff", "GRAPHL-CUTOFF", 1, 0, false);
        declareFunction(me, "graphl_add_to_resultP", "GRAPHL-ADD-TO-RESULT?", 1, 0, false);
        declareFunction(me, "graphl_result", "GRAPHL-RESULT", 1, 0, false);
        declareFunction(me, "graphl_depth_first_search_p", "GRAPHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
        declareFunction(me, "graphl_breadth_first_search_p", "GRAPHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
        declareFunction(me, "graphl_iterative_deepening_search_p", "GRAPHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
        declareFunction(me, "graphl_depth_marking_search_p", "GRAPHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
        declareFunction(me, "graphl_return_one_answer_p", "GRAPHL-RETURN-ONE-ANSWER-P", 1, 0, false);
        declareFunction(me, "graphl_add_nodes_on_wind_p", "GRAPHL-ADD-NODES-ON-WIND-P", 1, 0, false);
        declareFunction(me, "graphl_add_edges_on_unwind_p", "GRAPHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
        declareFunction(me, "graphl_goal_search_p", "GRAPHL-GOAL-SEARCH-P", 1, 0, false);
        declareFunction(me, "graphl_single_goal_p", "GRAPHL-SINGLE-GOAL-P", 1, 0, false);
        declareFunction(me, "graphl_multiple_goals_p", "GRAPHL-MULTIPLE-GOALS-P", 1, 0, false);
        declareFunction(me, "graphl_goal_fn_p", "GRAPHL-GOAL-FN-P", 1, 0, false);
        declareFunction(me, "graphl_map_p", "GRAPHL-MAP-P", 1, 0, false);
        declareFunction(me, "graphl_depth_cutoff", "GRAPHL-DEPTH-CUTOFF", 1, 0, false);
        declareFunction(me, "graphl_cutoff_search_p", "GRAPHL-CUTOFF-SEARCH-P", 1, 0, false);
        declareFunction(me, "valid_graphl_search_order_p", "VALID-GRAPHL-SEARCH-ORDER-P", 1, 0, false);
        declareFunction(me, "valid_graphl_cutoff_p", "VALID-GRAPHL-CUTOFF-P", 1, 0, false);
        declareFunction(me, "valid_graphl_marking_style_p", "VALID-GRAPHL-MARKING-STYLE-P", 1, 0, false);
        declareFunction(me, "graphl_table_p", "GRAPHL-TABLE-P", 1, 0, false);
        declareMacro(me, "with_graphl_search_initialized", "WITH-GRAPHL-SEARCH-INITIALIZED");
        declareFunction(me, "set_graphl_search_properties", "SET-GRAPHL-SEARCH-PROPERTIES", 2, 0, false);
        declareFunction(me, "set_graphl_search_property", "SET-GRAPHL-SEARCH-PROPERTY", 3, 0, false);
        declareFunction(me, "set_graphl_search_type", "SET-GRAPHL-SEARCH-TYPE", 2, 0, false);
        declareFunction(me, "set_graphl_search_order", "SET-GRAPHL-SEARCH-ORDER", 2, 0, false);
        declareFunction(me, "set_graphl_search_cutoff", "SET-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
        declareFunction(me, "set_graphl_search_marking", "SET-GRAPHL-SEARCH-MARKING", 2, 0, false);
        declareFunction(me, "set_graphl_search_marking_space", "SET-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
        declareFunction(me, "set_graphl_search_goal", "SET-GRAPHL-SEARCH-GOAL", 2, 0, false);
        declareFunction(me, "set_graphl_search_goal_fn", "SET-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
        declareFunction(me, "set_graphl_search_goal_found_p", "SET-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
        declareFunction(me, "set_graphl_search_goal_space", "SET-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
        declareFunction(me, "set_graphl_search_satisfy_fn", "SET-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
        declareFunction(me, "set_graphl_search_map_fn", "SET-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
        declareFunction(me, "set_graphl_search_justifyP", "SET-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
        declareFunction(me, "set_graphl_search_result", "SET-GRAPHL-SEARCH-RESULT", 2, 0, false);
        declareFunction(me, "set_graphl_search_add_to_resultP", "SET-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
        declareFunction(me, "possibly_initialize_graphl_marking_spaces", "POSSIBLY-INITIALIZE-GRAPHL-MARKING-SPACES", 1, 0, false);
        declareFunction(me, "reinitialize_graphl_spaces", "REINITIALIZE-GRAPHL-SPACES", 1, 0, false);
        declareFunction(me, "graphl_add_node_to_result", "GRAPHL-ADD-NODE-TO-RESULT", 2, 0, false);
        declareFunction(me, "graphl_add_to_result", "GRAPHL-ADD-TO-RESULT", 2, 1, false);
        declareFunction(me, "graphl_append_to_result", "GRAPHL-APPEND-TO-RESULT", 2, 0, false);
        declareFunction(me, "graphl_toggle_unwind_off", "GRAPHL-TOGGLE-UNWIND-OFF", 1, 0, false);
        declareFunction(me, "graphl_toggle_unwind_on", "GRAPHL-TOGGLE-UNWIND-ON", 1, 0, false);
        declareFunction(me, "graphl_node_provides_answer_p", "GRAPHL-NODE-PROVIDES-ANSWER-P", 2, 0, false);
        declareFunction(me, "graphl_search_size", "GRAPHL-SEARCH-SIZE", 0, 0, false);
        declareFunction(me, "graphl_instantiate_new_space", "GRAPHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
        declareFunction(me, "graphl_goal_found_condition_p", "GRAPHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_graphl_search_vars_file() {
        defconstant("*DTP-GRAPHL-SEARCH*", GRAPHL_SEARCH);
        defparameter("*USE-ZERO-SIZE-GRAPHL-MARKING-SPACES?*", NIL);
        deflexical("*GRAPHL-SEARCH-SIZE*", $int$200);
        return NIL;
    }

    public static SubLObject setup_graphl_search_vars_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_graphl_search$.getGlobalValue(), symbol_function(GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(GRAPHL_SEARCH_TYPE, _CSETF_GRAPHL_SEARCH_TYPE);
        def_csetf(GRAPHL_SEARCH_ORDER, _CSETF_GRAPHL_SEARCH_ORDER);
        def_csetf(GRAPHL_SEARCH_CUTOFF, _CSETF_GRAPHL_SEARCH_CUTOFF);
        def_csetf(GRAPHL_SEARCH_MARKING, _CSETF_GRAPHL_SEARCH_MARKING);
        def_csetf(GRAPHL_SEARCH_MARKING_SPACE, _CSETF_GRAPHL_SEARCH_MARKING_SPACE);
        def_csetf(GRAPHL_SEARCH_GOAL_SPACE, _CSETF_GRAPHL_SEARCH_GOAL_SPACE);
        def_csetf(GRAPHL_SEARCH_GOAL, _CSETF_GRAPHL_SEARCH_GOAL);
        def_csetf(GRAPHL_SEARCH_GOAL_FN, _CSETF_GRAPHL_SEARCH_GOAL_FN);
        def_csetf(GRAPHL_SEARCH_GOAL_FOUND_P, _CSETF_GRAPHL_SEARCH_GOAL_FOUND_P);
        def_csetf(GRAPHL_SEARCH_SATISFY_FN, _CSETF_GRAPHL_SEARCH_SATISFY_FN);
        def_csetf(GRAPHL_SEARCH_MAP_FN, _CSETF_GRAPHL_SEARCH_MAP_FN);
        def_csetf($sym31$GRAPHL_SEARCH_JUSTIFY_, $sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_);
        def_csetf($sym33$GRAPHL_SEARCH_ADD_TO_RESULT_, $sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_);
        def_csetf(GRAPHL_SEARCH_UNWIND_FN_TOGGLE, _CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE);
        def_csetf(GRAPHL_SEARCH_RESULT, _CSETF_GRAPHL_SEARCH_RESULT);
        def_csetf(GRAPHL_SEARCH_GRAPH, _CSETF_GRAPHL_SEARCH_GRAPH);
        identity(GRAPHL_SEARCH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_graphl_search$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD));
        register_macro_helper(SET_GRAPHL_SEARCH_PROPERTIES, WITH_GRAPHL_SEARCH_INITIALIZED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_graphl_search_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_graphl_search_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_graphl_search_vars_file();
    }

    

    public static final class $graphl_search_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $order;

        public SubLObject $cutoff;

        public SubLObject $marking;

        public SubLObject $marking_space;

        public SubLObject $goal_space;

        public SubLObject $goal;

        public SubLObject $goal_fn;

        public SubLObject $goal_found_p;

        public SubLObject $satisfy_fn;

        public SubLObject $map_fn;

        public SubLObject $justifyP;

        public SubLObject $add_to_resultP;

        public SubLObject $unwind_fn_toggle;

        public SubLObject $result;

        public SubLObject $graph;

        private static final SubLStructDeclNative structDecl;

        private $graphl_search_native() {
            this.$type = Lisp.NIL;
            this.$order = Lisp.NIL;
            this.$cutoff = Lisp.NIL;
            this.$marking = Lisp.NIL;
            this.$marking_space = Lisp.NIL;
            this.$goal_space = Lisp.NIL;
            this.$goal = Lisp.NIL;
            this.$goal_fn = Lisp.NIL;
            this.$goal_found_p = Lisp.NIL;
            this.$satisfy_fn = Lisp.NIL;
            this.$map_fn = Lisp.NIL;
            this.$justifyP = Lisp.NIL;
            this.$add_to_resultP = Lisp.NIL;
            this.$unwind_fn_toggle = Lisp.NIL;
            this.$result = Lisp.NIL;
            this.$graph = Lisp.NIL;
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
            return this.$order;
        }

        @Override
        public SubLObject getField4() {
            return this.$cutoff;
        }

        @Override
        public SubLObject getField5() {
            return this.$marking;
        }

        @Override
        public SubLObject getField6() {
            return this.$marking_space;
        }

        @Override
        public SubLObject getField7() {
            return this.$goal_space;
        }

        @Override
        public SubLObject getField8() {
            return this.$goal;
        }

        @Override
        public SubLObject getField9() {
            return this.$goal_fn;
        }

        @Override
        public SubLObject getField10() {
            return this.$goal_found_p;
        }

        @Override
        public SubLObject getField11() {
            return this.$satisfy_fn;
        }

        @Override
        public SubLObject getField12() {
            return this.$map_fn;
        }

        @Override
        public SubLObject getField13() {
            return this.$justifyP;
        }

        @Override
        public SubLObject getField14() {
            return this.$add_to_resultP;
        }

        @Override
        public SubLObject getField15() {
            return this.$unwind_fn_toggle;
        }

        @Override
        public SubLObject getField16() {
            return this.$result;
        }

        @Override
        public SubLObject getField17() {
            return this.$graph;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$order = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$cutoff = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$marking = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$marking_space = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$goal_space = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$goal = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$goal_fn = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$goal_found_p = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$satisfy_fn = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$map_fn = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$justifyP = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$add_to_resultP = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$unwind_fn_toggle = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$result = value;
        }

        @Override
        public SubLObject setField17(final SubLObject value) {
            return this.$graph = value;
        }

        static {
            structDecl = makeStructDeclNative($graphl_search_native.class, GRAPHL_SEARCH, GRAPHL_SEARCH_P, $list2, $list3, new String[]{ "$type", "$order", "$cutoff", "$marking", "$marking_space", "$goal_space", "$goal", "$goal_fn", "$goal_found_p", "$satisfy_fn", "$map_fn", "$justifyP", "$add_to_resultP", "$unwind_fn_toggle", "$result", "$graph" }, $list4, $list5, PRINT_GRAPHL_SEARCH);
        }
    }

    public static final class $graphl_search_p$UnaryFunction extends UnaryFunction {
        public $graphl_search_p$UnaryFunction() {
            super(extractFunctionNamed("GRAPHL-SEARCH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return graphl_search_p(arg1);
        }
    }
}

/**
 * Total time: 234 ms
 */
