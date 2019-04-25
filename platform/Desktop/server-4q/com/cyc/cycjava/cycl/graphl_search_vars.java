package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class graphl_search_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.graphl_search_vars";
    public static final String myFingerPrint = "787b964ddc428f0630d3646a5d25419092e95d75700a3fd11bd371468974eec3";
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLSymbol $dtp_graphl_search$;
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11269L)
    public static SubLSymbol $use_zero_size_graphl_marking_spacesP$;
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11407L)
    private static SubLSymbol $graphl_search_size$;
    private static final SubLSymbol $sym0$GRAPHL_SEARCH;
    private static final SubLSymbol $sym1$GRAPHL_SEARCH_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_GRAPHL_SEARCH;
    private static final SubLSymbol $sym7$GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$GRAPHL_SEARCH_TYPE;
    private static final SubLSymbol $sym10$_CSETF_GRAPHL_SEARCH_TYPE;
    private static final SubLSymbol $sym11$GRAPHL_SEARCH_ORDER;
    private static final SubLSymbol $sym12$_CSETF_GRAPHL_SEARCH_ORDER;
    private static final SubLSymbol $sym13$GRAPHL_SEARCH_CUTOFF;
    private static final SubLSymbol $sym14$_CSETF_GRAPHL_SEARCH_CUTOFF;
    private static final SubLSymbol $sym15$GRAPHL_SEARCH_MARKING;
    private static final SubLSymbol $sym16$_CSETF_GRAPHL_SEARCH_MARKING;
    private static final SubLSymbol $sym17$GRAPHL_SEARCH_MARKING_SPACE;
    private static final SubLSymbol $sym18$_CSETF_GRAPHL_SEARCH_MARKING_SPACE;
    private static final SubLSymbol $sym19$GRAPHL_SEARCH_GOAL_SPACE;
    private static final SubLSymbol $sym20$_CSETF_GRAPHL_SEARCH_GOAL_SPACE;
    private static final SubLSymbol $sym21$GRAPHL_SEARCH_GOAL;
    private static final SubLSymbol $sym22$_CSETF_GRAPHL_SEARCH_GOAL;
    private static final SubLSymbol $sym23$GRAPHL_SEARCH_GOAL_FN;
    private static final SubLSymbol $sym24$_CSETF_GRAPHL_SEARCH_GOAL_FN;
    private static final SubLSymbol $sym25$GRAPHL_SEARCH_GOAL_FOUND_P;
    private static final SubLSymbol $sym26$_CSETF_GRAPHL_SEARCH_GOAL_FOUND_P;
    private static final SubLSymbol $sym27$GRAPHL_SEARCH_SATISFY_FN;
    private static final SubLSymbol $sym28$_CSETF_GRAPHL_SEARCH_SATISFY_FN;
    private static final SubLSymbol $sym29$GRAPHL_SEARCH_MAP_FN;
    private static final SubLSymbol $sym30$_CSETF_GRAPHL_SEARCH_MAP_FN;
    private static final SubLSymbol $sym31$GRAPHL_SEARCH_JUSTIFY_;
    private static final SubLSymbol $sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_;
    private static final SubLSymbol $sym33$GRAPHL_SEARCH_ADD_TO_RESULT_;
    private static final SubLSymbol $sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_;
    private static final SubLSymbol $sym35$GRAPHL_SEARCH_UNWIND_FN_TOGGLE;
    private static final SubLSymbol $sym36$_CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE;
    private static final SubLSymbol $sym37$GRAPHL_SEARCH_RESULT;
    private static final SubLSymbol $sym38$_CSETF_GRAPHL_SEARCH_RESULT;
    private static final SubLSymbol $sym39$GRAPHL_SEARCH_GRAPH;
    private static final SubLSymbol $sym40$_CSETF_GRAPHL_SEARCH_GRAPH;
    private static final SubLSymbol $kw41$TYPE;
    private static final SubLSymbol $kw42$ORDER;
    private static final SubLSymbol $kw43$CUTOFF;
    private static final SubLSymbol $kw44$MARKING;
    private static final SubLSymbol $kw45$MARKING_SPACE;
    private static final SubLSymbol $kw46$GOAL_SPACE;
    private static final SubLSymbol $kw47$GOAL;
    private static final SubLSymbol $kw48$GOAL_FN;
    private static final SubLSymbol $kw49$GOAL_FOUND_P;
    private static final SubLSymbol $kw50$SATISFY_FN;
    private static final SubLSymbol $kw51$MAP_FN;
    private static final SubLSymbol $kw52$JUSTIFY_;
    private static final SubLSymbol $kw53$ADD_TO_RESULT_;
    private static final SubLSymbol $kw54$UNWIND_FN_TOGGLE;
    private static final SubLSymbol $kw55$RESULT;
    private static final SubLSymbol $kw56$GRAPH;
    private static final SubLString $str57$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw58$BEGIN;
    private static final SubLSymbol $sym59$MAKE_GRAPHL_SEARCH;
    private static final SubLSymbol $kw60$SLOT;
    private static final SubLSymbol $kw61$END;
    private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD;
    private static final SubLString $str63$GraphL_Search____a__;
    private static final SubLString $str64$Type____a__;
    private static final SubLString $str65$Order____a__;
    private static final SubLString $str66$Cutoff____a__;
    private static final SubLString $str67$Marking____a__;
    private static final SubLString $str68$Space____a__;
    private static final SubLString $str69$Goal_Space____a__;
    private static final SubLString $str70$Goal____a__;
    private static final SubLString $str71$Goal_Fn____a__;
    private static final SubLString $str72$Goal_Found_P____a__;
    private static final SubLString $str73$Satisfy_Fn____a__;
    private static final SubLString $str74$Map_Fn____a__;
    private static final SubLString $str75$Justify_____a__;
    private static final SubLString $str76$Add_to_Result_____a__;
    private static final SubLString $str77$Unwind_Fn_Toggle____a__;
    private static final SubLString $str78$Result____a__;
    private static final SubLString $str79$Graph____a__;
    private static final SubLSymbol $kw80$FREE;
    private static final SubLSymbol $kw81$DEPTH_FIRST;
    private static final SubLSymbol $kw82$BREADTH_FIRST;
    private static final SubLSymbol $kw83$ITERATIVE_DEEPENING;
    private static final SubLSymbol $kw84$DEPTH_MARKING;
    private static final SubLSymbol $kw85$NODES_ON_WIND;
    private static final SubLSymbol $kw86$EDGES_ON_UNWIND;
    private static final SubLList $list87;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$CLET;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$SET_GRAPHL_SEARCH_PROPERTIES;
    private static final SubLSymbol $sym92$DESTROY_GRAPHL_SEARCH;
    private static final SubLSymbol $sym93$WITH_GRAPHL_SEARCH_INITIALIZED;
    private static final SubLInteger $int94$200;
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_graphl_search(v_object, stream, (SubLObject)graphl_search_vars.ZERO_INTEGER);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $graphl_search_native.class) ? graphl_search_vars.T : graphl_search_vars.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_type(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_order(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_cutoff(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_marking(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_marking_space(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_goal_space(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_goal(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_goal_fn(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_goal_found_p(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_satisfy_fn(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_map_fn(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_justifyP(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_add_to_resultP(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_unwind_fn_toggle(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_result(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject graphl_search_graph(final SubLObject v_object) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.getField17();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_type(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_order(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_cutoff(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_marking(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_marking_space(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_goal_space(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_goal(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_goal_fn(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_goal_found_p(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_satisfy_fn(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_map_fn(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_justifyP(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_add_to_resultP(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_unwind_fn_toggle(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_result(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject _csetf_graphl_search_graph(final SubLObject v_object, final SubLObject value) {
        assert graphl_search_vars.NIL != graphl_search_p(v_object) : v_object;
        return v_object.setField17(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject make_graphl_search(SubLObject arglist) {
        if (arglist == graphl_search_vars.UNPROVIDED) {
            arglist = (SubLObject)graphl_search_vars.NIL;
        }
        final SubLObject v_new = (SubLObject)new $graphl_search_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)graphl_search_vars.NIL, next = arglist; graphl_search_vars.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)graphl_search_vars.$kw41$TYPE)) {
                _csetf_graphl_search_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw42$ORDER)) {
                _csetf_graphl_search_order(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw43$CUTOFF)) {
                _csetf_graphl_search_cutoff(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw44$MARKING)) {
                _csetf_graphl_search_marking(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw45$MARKING_SPACE)) {
                _csetf_graphl_search_marking_space(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw46$GOAL_SPACE)) {
                _csetf_graphl_search_goal_space(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw47$GOAL)) {
                _csetf_graphl_search_goal(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw48$GOAL_FN)) {
                _csetf_graphl_search_goal_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw49$GOAL_FOUND_P)) {
                _csetf_graphl_search_goal_found_p(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw50$SATISFY_FN)) {
                _csetf_graphl_search_satisfy_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw51$MAP_FN)) {
                _csetf_graphl_search_map_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw52$JUSTIFY_)) {
                _csetf_graphl_search_justifyP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw53$ADD_TO_RESULT_)) {
                _csetf_graphl_search_add_to_resultP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw54$UNWIND_FN_TOGGLE)) {
                _csetf_graphl_search_unwind_fn_toggle(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw55$RESULT)) {
                _csetf_graphl_search_result(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)graphl_search_vars.$kw56$GRAPH)) {
                _csetf_graphl_search_graph(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)graphl_search_vars.$str57$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject visit_defstruct_graphl_search(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw58$BEGIN, (SubLObject)graphl_search_vars.$sym59$MAKE_GRAPHL_SEARCH, (SubLObject)graphl_search_vars.SIXTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw41$TYPE, graphl_search_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw42$ORDER, graphl_search_order(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw43$CUTOFF, graphl_search_cutoff(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw44$MARKING, graphl_search_marking(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw45$MARKING_SPACE, graphl_search_marking_space(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw46$GOAL_SPACE, graphl_search_goal_space(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw47$GOAL, graphl_search_goal(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw48$GOAL_FN, graphl_search_goal_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw49$GOAL_FOUND_P, graphl_search_goal_found_p(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw50$SATISFY_FN, graphl_search_satisfy_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw51$MAP_FN, graphl_search_map_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw52$JUSTIFY_, graphl_search_justifyP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw53$ADD_TO_RESULT_, graphl_search_add_to_resultP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw54$UNWIND_FN_TOGGLE, graphl_search_unwind_fn_toggle(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw55$RESULT, graphl_search_result(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw60$SLOT, (SubLObject)graphl_search_vars.$kw56$GRAPH, graphl_search_graph(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)graphl_search_vars.$kw61$END, (SubLObject)graphl_search_vars.$sym59$MAKE_GRAPHL_SEARCH, (SubLObject)graphl_search_vars.SIXTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
    public static SubLObject visit_defstruct_object_graphl_search_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_graphl_search(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 1148L)
    public static SubLObject print_graphl_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (graphl_search_vars.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.NIL);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.T);
        }
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 1301L)
    public static SubLObject describe_graphl_search(final SubLObject v_object) {
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str63$GraphL_Search____a__, v_object);
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str64$Type____a__, graphl_search_type(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str65$Order____a__, graphl_search_order(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str66$Cutoff____a__, graphl_search_cutoff(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str67$Marking____a__, graphl_search_marking(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str68$Space____a__, graphl_search_marking_space(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str69$Goal_Space____a__, graphl_search_goal_space(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str70$Goal____a__, graphl_search_goal(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str71$Goal_Fn____a__, graphl_search_goal_fn(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str72$Goal_Found_P____a__, graphl_search_goal_found_p(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str73$Satisfy_Fn____a__, graphl_search_satisfy_fn(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str74$Map_Fn____a__, graphl_search_map_fn(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str75$Justify_____a__, graphl_search_justifyP(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str76$Add_to_Result_____a__, graphl_search_add_to_resultP(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str77$Unwind_Fn_Toggle____a__, graphl_search_unwind_fn_toggle(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str78$Result____a__, graphl_search_result(v_object));
        PrintLow.format((SubLObject)graphl_search_vars.T, (SubLObject)graphl_search_vars.$str79$Graph____a__, graphl_search_graph(v_object));
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 2424L)
    public static SubLObject new_graphl_search(final SubLObject plist) {
        final SubLObject graphl_search = make_graphl_search((SubLObject)graphl_search_vars.UNPROVIDED);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)graphl_search_vars.NIL, remainder = plist; graphl_search_vars.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            set_graphl_search_property(graphl_search, property, value);
        }
        possibly_initialize_graphl_marking_spaces(graphl_search);
        set_graphl_search_result(graphl_search, (SubLObject)graphl_search_vars.NIL);
        return graphl_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 2772L)
    public static SubLObject destroy_graphl_search(final SubLObject graph_search) {
        _csetf_graphl_search_marking_space(graph_search, (SubLObject)graphl_search_vars.$kw80$FREE);
        _csetf_graphl_search_result(graph_search, (SubLObject)graphl_search_vars.$kw80$FREE);
        _csetf_graphl_search_graph(graph_search, (SubLObject)graphl_search_vars.$kw80$FREE);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3031L)
    public static SubLObject graphl_type(final SubLObject v_search) {
        return graphl_search_type(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3133L)
    public static SubLObject graphl_order(final SubLObject v_search) {
        return graphl_search_order(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3212L)
    public static SubLObject graphl_marking(final SubLObject v_search) {
        return graphl_search_marking(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3295L)
    public static SubLObject graphl_space(final SubLObject v_search) {
        return graphl_search_marking_space(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3382L)
    public static SubLObject graphl_goal(final SubLObject v_search) {
        return graphl_search_goal(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3459L)
    public static SubLObject graphl_goal_space(final SubLObject v_search) {
        return graphl_search_goal_space(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3548L)
    public static SubLObject graphl_goal_found_p(final SubLObject v_search) {
        return graphl_search_goal_found_p(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3641L)
    public static SubLObject graphl_map_fn(final SubLObject v_search) {
        return graphl_search_map_fn(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3722L)
    public static SubLObject graphl_compute_justifyP(final SubLObject v_search) {
        return graphl_search_justifyP(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3815L)
    public static SubLObject graphl_cutoff(final SubLObject v_search) {
        return graphl_search_cutoff(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3896L)
    public static SubLObject graphl_add_to_resultP(final SubLObject v_search) {
        return graphl_search_add_to_resultP(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3993L)
    public static SubLObject graphl_result(final SubLObject v_search) {
        return graphl_search_result(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4074L)
    public static SubLObject graphl_depth_first_search_p(final SubLObject v_search) {
        return Equality.eq(graphl_order(v_search), (SubLObject)graphl_search_vars.$kw81$DEPTH_FIRST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4198L)
    public static SubLObject graphl_breadth_first_search_p(final SubLObject v_search) {
        return Equality.eq(graphl_order(v_search), (SubLObject)graphl_search_vars.$kw82$BREADTH_FIRST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4304L)
    public static SubLObject graphl_iterative_deepening_search_p(final SubLObject v_search) {
        return Equality.eq(graphl_order(v_search), (SubLObject)graphl_search_vars.$kw83$ITERATIVE_DEEPENING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4422L)
    public static SubLObject graphl_depth_marking_search_p(final SubLObject v_search) {
        return Equality.eq(graphl_marking(v_search), (SubLObject)graphl_search_vars.$kw84$DEPTH_MARKING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4530L)
    public static SubLObject graphl_return_one_answer_p(final SubLObject v_search) {
        return graphl_goal_search_p(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4624L)
    public static SubLObject graphl_add_nodes_on_wind_p(final SubLObject v_search) {
        return Equality.eq(graphl_add_to_resultP(v_search), (SubLObject)graphl_search_vars.$kw85$NODES_ON_WIND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4739L)
    public static SubLObject graphl_add_edges_on_unwind_p(final SubLObject v_search) {
        return Equality.eq(graphl_add_to_resultP(v_search), (SubLObject)graphl_search_vars.$kw86$EDGES_ON_UNWIND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4879L)
    public static SubLObject graphl_goal_search_p(final SubLObject v_search) {
        return (SubLObject)SubLObjectFactory.makeBoolean(graphl_search_vars.NIL != graphl_search_goal(v_search) || graphl_search_vars.NIL != graphl_search_goal_fn(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5028L)
    public static SubLObject graphl_single_goal_p(final SubLObject v_search) {
        return Types.atom(graphl_goal(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5114L)
    public static SubLObject graphl_multiple_goals_p(final SubLObject v_search) {
        return Types.listp(graphl_goal(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5206L)
    public static SubLObject graphl_goal_fn_p(final SubLObject v_search) {
        return Types.function_spec_p(graphl_search_goal_fn(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5309L)
    public static SubLObject graphl_map_p(final SubLObject v_search) {
        return list_utilities.sublisp_boolean(graphl_map_fn(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5392L)
    public static SubLObject graphl_depth_cutoff(final SubLObject v_search) {
        return graphl_search_cutoff(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5479L)
    public static SubLObject graphl_cutoff_search_p(final SubLObject v_search) {
        return list_utilities.sublisp_boolean(graphl_search_cutoff(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5597L)
    public static SubLObject valid_graphl_search_order_p(final SubLObject order) {
        return (SubLObject)SubLObjectFactory.makeBoolean(order == graphl_search_vars.$kw81$DEPTH_FIRST || order == graphl_search_vars.$kw82$BREADTH_FIRST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5764L)
    public static SubLObject valid_graphl_cutoff_p(final SubLObject cutoff) {
        return (SubLObject)SubLObjectFactory.makeBoolean(graphl_search_vars.NIL == cutoff || cutoff == graphl_search_vars.$kw47$GOAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5863L)
    public static SubLObject valid_graphl_marking_style_p(final SubLObject marking) {
        return subl_promotions.memberP(marking, (SubLObject)graphl_search_vars.$list87, (SubLObject)graphl_search_vars.UNPROVIDED, (SubLObject)graphl_search_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5971L)
    public static SubLObject graphl_table_p(final SubLObject obj) {
        return Types.hash_table_p(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 6121L)
    public static SubLObject with_graphl_search_initialized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject search_var = (SubLObject)graphl_search_vars.NIL;
        SubLObject plist = (SubLObject)graphl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graphl_search_vars.$list88);
        search_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)graphl_search_vars.$list88);
        plist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)graphl_search_vars.$sym89$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(search_var, (SubLObject)graphl_search_vars.$list90)), (SubLObject)ConsesLow.list((SubLObject)graphl_search_vars.$sym91$SET_GRAPHL_SEARCH_PROPERTIES, search_var, plist), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)graphl_search_vars.$sym92$DESTROY_GRAPHL_SEARCH, search_var))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 6374L)
    public static SubLObject set_graphl_search_properties(final SubLObject v_search, final SubLObject plist) {
        SubLObject remainder;
        SubLObject prop;
        SubLObject val;
        for (remainder = (SubLObject)graphl_search_vars.NIL, remainder = plist; graphl_search_vars.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            prop = remainder.first();
            val = conses_high.cadr(remainder);
            set_graphl_search_property(v_search, prop, val);
        }
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 6578L)
    public static SubLObject set_graphl_search_property(final SubLObject v_search, final SubLObject property, final SubLObject value) {
        if (property.eql((SubLObject)graphl_search_vars.$kw41$TYPE)) {
            _csetf_graphl_search_type(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw42$ORDER)) {
            _csetf_graphl_search_order(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw43$CUTOFF)) {
            _csetf_graphl_search_cutoff(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw44$MARKING)) {
            _csetf_graphl_search_marking(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw45$MARKING_SPACE)) {
            _csetf_graphl_search_marking_space(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw47$GOAL)) {
            _csetf_graphl_search_goal(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw48$GOAL_FN)) {
            _csetf_graphl_search_goal_fn(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw46$GOAL_SPACE)) {
            _csetf_graphl_search_goal_space(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw50$SATISFY_FN)) {
            _csetf_graphl_search_satisfy_fn(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw51$MAP_FN)) {
            _csetf_graphl_search_map_fn(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw52$JUSTIFY_)) {
            _csetf_graphl_search_justifyP(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw53$ADD_TO_RESULT_)) {
            _csetf_graphl_search_add_to_resultP(v_search, value);
        }
        else if (property.eql((SubLObject)graphl_search_vars.$kw54$UNWIND_FN_TOGGLE)) {
            _csetf_graphl_search_unwind_fn_toggle(v_search, value);
        }
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 7651L)
    public static SubLObject set_graphl_search_type(final SubLObject v_search, final SubLObject type) {
        _csetf_graphl_search_type(v_search, type);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 7848L)
    public static SubLObject set_graphl_search_order(final SubLObject v_search, final SubLObject order) {
        _csetf_graphl_search_order(v_search, order);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 7964L)
    public static SubLObject set_graphl_search_cutoff(final SubLObject v_search, final SubLObject cutoff_type) {
        _csetf_graphl_search_cutoff(v_search, cutoff_type);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8094L)
    public static SubLObject set_graphl_search_marking(final SubLObject v_search, final SubLObject marking) {
        _csetf_graphl_search_marking(v_search, marking);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8218L)
    public static SubLObject set_graphl_search_marking_space(final SubLObject v_search, final SubLObject marking_space) {
        _csetf_graphl_search_marking_space(v_search, marking_space);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8366L)
    public static SubLObject set_graphl_search_goal(final SubLObject v_search, final SubLObject goal) {
        _csetf_graphl_search_goal(v_search, goal);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8478L)
    public static SubLObject set_graphl_search_goal_fn(final SubLObject v_search, final SubLObject goal_fn) {
        _csetf_graphl_search_goal_fn(v_search, goal_fn);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8602L)
    public static SubLObject set_graphl_search_goal_found_p(final SubLObject v_search, final SubLObject found_p) {
        _csetf_graphl_search_goal_found_p(v_search, found_p);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8736L)
    public static SubLObject set_graphl_search_goal_space(final SubLObject v_search, final SubLObject goal_space) {
        _csetf_graphl_search_goal_space(v_search, goal_space);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8872L)
    public static SubLObject set_graphl_search_satisfy_fn(final SubLObject v_search, final SubLObject satisfy_fn) {
        _csetf_graphl_search_satisfy_fn(v_search, satisfy_fn);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9008L)
    public static SubLObject set_graphl_search_map_fn(final SubLObject v_search, final SubLObject map_fn) {
        _csetf_graphl_search_map_fn(v_search, map_fn);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9128L)
    public static SubLObject set_graphl_search_justifyP(final SubLObject v_search, final SubLObject justifyP) {
        _csetf_graphl_search_justifyP(v_search, justifyP);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9256L)
    public static SubLObject set_graphl_search_result(final SubLObject v_search, final SubLObject result) {
        _csetf_graphl_search_result(v_search, result);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9376L)
    public static SubLObject set_graphl_search_add_to_resultP(final SubLObject v_search, final SubLObject addP) {
        _csetf_graphl_search_add_to_resultP(v_search, addP);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9508L)
    public static SubLObject possibly_initialize_graphl_marking_spaces(final SubLObject v_search) {
        final SubLObject space = graphl_search_marking_space(v_search);
        if (graphl_search_vars.NIL == space) {
            _csetf_graphl_search_marking_space(v_search, graphl_instantiate_new_space());
        }
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9773L)
    public static SubLObject reinitialize_graphl_spaces(final SubLObject v_search) {
        _csetf_graphl_search_marking_space(v_search, graphl_instantiate_new_space());
        _csetf_graphl_search_goal_space(v_search, graphl_instantiate_new_space());
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9994L)
    public static SubLObject graphl_add_node_to_result(final SubLObject v_search, final SubLObject node) {
        _csetf_graphl_search_result(v_search, (SubLObject)ConsesLow.cons(node, graphl_search_result(v_search)));
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10136L)
    public static SubLObject graphl_add_to_result(final SubLObject v_search, final SubLObject addition, SubLObject test) {
        if (test == graphl_search_vars.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)graphl_search_vars.EQ);
        }
        if (graphl_search_vars.NIL == conses_high.member(addition, graphl_search_result(v_search), test, Symbols.symbol_function((SubLObject)graphl_search_vars.IDENTITY))) {
            _csetf_graphl_search_result(v_search, (SubLObject)ConsesLow.cons(addition, graphl_search_result(v_search)));
        }
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10329L)
    public static SubLObject graphl_append_to_result(final SubLObject v_search, final SubLObject addition) {
        set_graphl_search_result(v_search, ConsesLow.append(graphl_search_result(v_search), addition));
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10487L)
    public static SubLObject graphl_toggle_unwind_off(final SubLObject v_search) {
        _csetf_graphl_search_unwind_fn_toggle(v_search, (SubLObject)graphl_search_vars.NIL);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10643L)
    public static SubLObject graphl_toggle_unwind_on(final SubLObject v_search) {
        _csetf_graphl_search_unwind_fn_toggle(v_search, (SubLObject)graphl_search_vars.T);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10760L)
    public static SubLObject graphl_node_provides_answer_p(final SubLObject v_search, final SubLObject node) {
        if (graphl_search_vars.NIL != graphl_single_goal_p(v_search)) {
            if (graphl_search_goal(v_search) == graphl_search_vars.$kw50$SATISFY_FN) {
                return Functions.funcall(graphl_search_satisfy_fn(v_search), node);
            }
            return Equality.eq(node, graphl_search_goal(v_search));
        }
        else {
            if (graphl_search_vars.NIL != graphl_multiple_goals_p(v_search)) {
                return subl_promotions.memberP(node, graphl_search_goal(v_search), (SubLObject)graphl_search_vars.UNPROVIDED, (SubLObject)graphl_search_vars.UNPROVIDED);
            }
            return (SubLObject)graphl_search_vars.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11454L)
    public static SubLObject graphl_search_size() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((graphl_search_vars.NIL != graphl_search_vars.$use_zero_size_graphl_marking_spacesP$.getDynamicValue(thread)) ? graphl_search_vars.ZERO_INTEGER : graphl_search_vars.$graphl_search_size$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11572L)
    public static SubLObject graphl_instantiate_new_space() {
        return Hashtables.make_hash_table(graphl_search_size(), (SubLObject)graphl_search_vars.UNPROVIDED, (SubLObject)graphl_search_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11671L)
    public static SubLObject graphl_goal_found_condition_p(final SubLObject condition) {
        return Equality.eq(condition, (SubLObject)graphl_search_vars.$kw47$GOAL);
    }
    
    public static SubLObject declare_graphl_search_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_print_function_trampoline", "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_p", "GRAPHL-SEARCH-P", 1, 0, false);
        new $graphl_search_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_type", "GRAPHL-SEARCH-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_order", "GRAPHL-SEARCH-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_cutoff", "GRAPHL-SEARCH-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_marking", "GRAPHL-SEARCH-MARKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_marking_space", "GRAPHL-SEARCH-MARKING-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_goal_space", "GRAPHL-SEARCH-GOAL-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_goal", "GRAPHL-SEARCH-GOAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_goal_fn", "GRAPHL-SEARCH-GOAL-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_goal_found_p", "GRAPHL-SEARCH-GOAL-FOUND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_satisfy_fn", "GRAPHL-SEARCH-SATISFY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_map_fn", "GRAPHL-SEARCH-MAP-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_justifyP", "GRAPHL-SEARCH-JUSTIFY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_add_to_resultP", "GRAPHL-SEARCH-ADD-TO-RESULT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_unwind_fn_toggle", "GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_result", "GRAPHL-SEARCH-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_graph", "GRAPHL-SEARCH-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_type", "_CSETF-GRAPHL-SEARCH-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_order", "_CSETF-GRAPHL-SEARCH-ORDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_cutoff", "_CSETF-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_marking", "_CSETF-GRAPHL-SEARCH-MARKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_marking_space", "_CSETF-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_goal_space", "_CSETF-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_goal", "_CSETF-GRAPHL-SEARCH-GOAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_goal_fn", "_CSETF-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_goal_found_p", "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_satisfy_fn", "_CSETF-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_map_fn", "_CSETF-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_justifyP", "_CSETF-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_add_to_resultP", "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_unwind_fn_toggle", "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_result", "_CSETF-GRAPHL-SEARCH-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "_csetf_graphl_search_graph", "_CSETF-GRAPHL-SEARCH-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "make_graphl_search", "MAKE-GRAPHL-SEARCH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "visit_defstruct_graphl_search", "VISIT-DEFSTRUCT-GRAPHL-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "visit_defstruct_object_graphl_search_method", "VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "print_graphl_search", "PRINT-GRAPHL-SEARCH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "describe_graphl_search", "DESCRIBE-GRAPHL-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "new_graphl_search", "NEW-GRAPHL-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "destroy_graphl_search", "DESTROY-GRAPHL-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_type", "GRAPHL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_order", "GRAPHL-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_marking", "GRAPHL-MARKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_space", "GRAPHL-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_goal", "GRAPHL-GOAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_goal_space", "GRAPHL-GOAL-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_goal_found_p", "GRAPHL-GOAL-FOUND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_map_fn", "GRAPHL-MAP-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_compute_justifyP", "GRAPHL-COMPUTE-JUSTIFY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_cutoff", "GRAPHL-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_add_to_resultP", "GRAPHL-ADD-TO-RESULT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_result", "GRAPHL-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_depth_first_search_p", "GRAPHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_breadth_first_search_p", "GRAPHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_iterative_deepening_search_p", "GRAPHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_depth_marking_search_p", "GRAPHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_return_one_answer_p", "GRAPHL-RETURN-ONE-ANSWER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_add_nodes_on_wind_p", "GRAPHL-ADD-NODES-ON-WIND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_add_edges_on_unwind_p", "GRAPHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_goal_search_p", "GRAPHL-GOAL-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_single_goal_p", "GRAPHL-SINGLE-GOAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_multiple_goals_p", "GRAPHL-MULTIPLE-GOALS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_goal_fn_p", "GRAPHL-GOAL-FN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_map_p", "GRAPHL-MAP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_depth_cutoff", "GRAPHL-DEPTH-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_cutoff_search_p", "GRAPHL-CUTOFF-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "valid_graphl_search_order_p", "VALID-GRAPHL-SEARCH-ORDER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "valid_graphl_cutoff_p", "VALID-GRAPHL-CUTOFF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "valid_graphl_marking_style_p", "VALID-GRAPHL-MARKING-STYLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_table_p", "GRAPHL-TABLE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.graphl_search_vars", "with_graphl_search_initialized", "WITH-GRAPHL-SEARCH-INITIALIZED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_properties", "SET-GRAPHL-SEARCH-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_property", "SET-GRAPHL-SEARCH-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_type", "SET-GRAPHL-SEARCH-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_order", "SET-GRAPHL-SEARCH-ORDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_cutoff", "SET-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_marking", "SET-GRAPHL-SEARCH-MARKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_marking_space", "SET-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_goal", "SET-GRAPHL-SEARCH-GOAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_goal_fn", "SET-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_goal_found_p", "SET-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_goal_space", "SET-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_satisfy_fn", "SET-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_map_fn", "SET-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_justifyP", "SET-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_result", "SET-GRAPHL-SEARCH-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "set_graphl_search_add_to_resultP", "SET-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "possibly_initialize_graphl_marking_spaces", "POSSIBLY-INITIALIZE-GRAPHL-MARKING-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "reinitialize_graphl_spaces", "REINITIALIZE-GRAPHL-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_add_node_to_result", "GRAPHL-ADD-NODE-TO-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_add_to_result", "GRAPHL-ADD-TO-RESULT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_append_to_result", "GRAPHL-APPEND-TO-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_toggle_unwind_off", "GRAPHL-TOGGLE-UNWIND-OFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_toggle_unwind_on", "GRAPHL-TOGGLE-UNWIND-ON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_node_provides_answer_p", "GRAPHL-NODE-PROVIDES-ANSWER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_search_size", "GRAPHL-SEARCH-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_instantiate_new_space", "GRAPHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.graphl_search_vars", "graphl_goal_found_condition_p", "GRAPHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    public static SubLObject init_graphl_search_vars_file() {
        graphl_search_vars.$dtp_graphl_search$ = SubLFiles.defconstant("*DTP-GRAPHL-SEARCH*", (SubLObject)graphl_search_vars.$sym0$GRAPHL_SEARCH);
        graphl_search_vars.$use_zero_size_graphl_marking_spacesP$ = SubLFiles.defparameter("*USE-ZERO-SIZE-GRAPHL-MARKING-SPACES?*", (SubLObject)graphl_search_vars.NIL);
        graphl_search_vars.$graphl_search_size$ = SubLFiles.deflexical("*GRAPHL-SEARCH-SIZE*", (SubLObject)graphl_search_vars.$int94$200);
        return (SubLObject)graphl_search_vars.NIL;
    }
    
    public static SubLObject setup_graphl_search_vars_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), graphl_search_vars.$dtp_graphl_search$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphl_search_vars.$sym7$GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)graphl_search_vars.$list8);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym9$GRAPHL_SEARCH_TYPE, (SubLObject)graphl_search_vars.$sym10$_CSETF_GRAPHL_SEARCH_TYPE);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym11$GRAPHL_SEARCH_ORDER, (SubLObject)graphl_search_vars.$sym12$_CSETF_GRAPHL_SEARCH_ORDER);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym13$GRAPHL_SEARCH_CUTOFF, (SubLObject)graphl_search_vars.$sym14$_CSETF_GRAPHL_SEARCH_CUTOFF);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym15$GRAPHL_SEARCH_MARKING, (SubLObject)graphl_search_vars.$sym16$_CSETF_GRAPHL_SEARCH_MARKING);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym17$GRAPHL_SEARCH_MARKING_SPACE, (SubLObject)graphl_search_vars.$sym18$_CSETF_GRAPHL_SEARCH_MARKING_SPACE);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym19$GRAPHL_SEARCH_GOAL_SPACE, (SubLObject)graphl_search_vars.$sym20$_CSETF_GRAPHL_SEARCH_GOAL_SPACE);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym21$GRAPHL_SEARCH_GOAL, (SubLObject)graphl_search_vars.$sym22$_CSETF_GRAPHL_SEARCH_GOAL);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym23$GRAPHL_SEARCH_GOAL_FN, (SubLObject)graphl_search_vars.$sym24$_CSETF_GRAPHL_SEARCH_GOAL_FN);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym25$GRAPHL_SEARCH_GOAL_FOUND_P, (SubLObject)graphl_search_vars.$sym26$_CSETF_GRAPHL_SEARCH_GOAL_FOUND_P);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym27$GRAPHL_SEARCH_SATISFY_FN, (SubLObject)graphl_search_vars.$sym28$_CSETF_GRAPHL_SEARCH_SATISFY_FN);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym29$GRAPHL_SEARCH_MAP_FN, (SubLObject)graphl_search_vars.$sym30$_CSETF_GRAPHL_SEARCH_MAP_FN);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym31$GRAPHL_SEARCH_JUSTIFY_, (SubLObject)graphl_search_vars.$sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym33$GRAPHL_SEARCH_ADD_TO_RESULT_, (SubLObject)graphl_search_vars.$sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym35$GRAPHL_SEARCH_UNWIND_FN_TOGGLE, (SubLObject)graphl_search_vars.$sym36$_CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym37$GRAPHL_SEARCH_RESULT, (SubLObject)graphl_search_vars.$sym38$_CSETF_GRAPHL_SEARCH_RESULT);
        Structures.def_csetf((SubLObject)graphl_search_vars.$sym39$GRAPHL_SEARCH_GRAPH, (SubLObject)graphl_search_vars.$sym40$_CSETF_GRAPHL_SEARCH_GRAPH);
        Equality.identity((SubLObject)graphl_search_vars.$sym0$GRAPHL_SEARCH);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), graphl_search_vars.$dtp_graphl_search$.getGlobalValue(), Symbols.symbol_function((SubLObject)graphl_search_vars.$sym62$VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD));
        access_macros.register_macro_helper((SubLObject)graphl_search_vars.$sym91$SET_GRAPHL_SEARCH_PROPERTIES, (SubLObject)graphl_search_vars.$sym93$WITH_GRAPHL_SEARCH_INITIALIZED);
        return (SubLObject)graphl_search_vars.NIL;
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
    
    static {
        me = (SubLFile)new graphl_search_vars();
        graphl_search_vars.$dtp_graphl_search$ = null;
        graphl_search_vars.$use_zero_size_graphl_marking_spacesP$ = null;
        graphl_search_vars.$graphl_search_size$ = null;
        $sym0$GRAPHL_SEARCH = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH");
        $sym1$GRAPHL_SEARCH_P = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("ORDER"), SubLObjectFactory.makeSymbol("CUTOFF"), SubLObjectFactory.makeSymbol("MARKING"), SubLObjectFactory.makeSymbol("MARKING-SPACE"), SubLObjectFactory.makeSymbol("GOAL-SPACE"), SubLObjectFactory.makeSymbol("GOAL"), SubLObjectFactory.makeSymbol("GOAL-FN"), SubLObjectFactory.makeSymbol("GOAL-FOUND-P"), SubLObjectFactory.makeSymbol("SATISFY-FN"), SubLObjectFactory.makeSymbol("MAP-FN"), SubLObjectFactory.makeSymbol("JUSTIFY?"), SubLObjectFactory.makeSymbol("ADD-TO-RESULT?"), SubLObjectFactory.makeSymbol("UNWIND-FN-TOGGLE"), SubLObjectFactory.makeSymbol("RESULT"), SubLObjectFactory.makeSymbol("GRAPH") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ORDER"), SubLObjectFactory.makeKeyword("CUTOFF"), SubLObjectFactory.makeKeyword("MARKING"), SubLObjectFactory.makeKeyword("MARKING-SPACE"), SubLObjectFactory.makeKeyword("GOAL-SPACE"), SubLObjectFactory.makeKeyword("GOAL"), SubLObjectFactory.makeKeyword("GOAL-FN"), SubLObjectFactory.makeKeyword("GOAL-FOUND-P"), SubLObjectFactory.makeKeyword("SATISFY-FN"), SubLObjectFactory.makeKeyword("MAP-FN"), SubLObjectFactory.makeKeyword("JUSTIFY?"), SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), SubLObjectFactory.makeKeyword("UNWIND-FN-TOGGLE"), SubLObjectFactory.makeKeyword("RESULT"), SubLObjectFactory.makeKeyword("GRAPH") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-TYPE"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-ORDER"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-CUTOFF"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-MARKING"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-MARKING-SPACE"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GOAL-SPACE"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GOAL"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GOAL-FN"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-SATISFY-FN"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-MAP-FN"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-JUSTIFY?"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-RESULT"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GRAPH") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT"), SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH") });
        $sym6$PRINT_GRAPHL_SEARCH = SubLObjectFactory.makeSymbol("PRINT-GRAPHL-SEARCH");
        $sym7$GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-P"));
        $sym9$GRAPHL_SEARCH_TYPE = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-TYPE");
        $sym10$_CSETF_GRAPHL_SEARCH_TYPE = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE");
        $sym11$GRAPHL_SEARCH_ORDER = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-ORDER");
        $sym12$_CSETF_GRAPHL_SEARCH_ORDER = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER");
        $sym13$GRAPHL_SEARCH_CUTOFF = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-CUTOFF");
        $sym14$_CSETF_GRAPHL_SEARCH_CUTOFF = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF");
        $sym15$GRAPHL_SEARCH_MARKING = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-MARKING");
        $sym16$_CSETF_GRAPHL_SEARCH_MARKING = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING");
        $sym17$GRAPHL_SEARCH_MARKING_SPACE = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-MARKING-SPACE");
        $sym18$_CSETF_GRAPHL_SEARCH_MARKING_SPACE = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE");
        $sym19$GRAPHL_SEARCH_GOAL_SPACE = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GOAL-SPACE");
        $sym20$_CSETF_GRAPHL_SEARCH_GOAL_SPACE = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE");
        $sym21$GRAPHL_SEARCH_GOAL = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GOAL");
        $sym22$_CSETF_GRAPHL_SEARCH_GOAL = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL");
        $sym23$GRAPHL_SEARCH_GOAL_FN = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GOAL-FN");
        $sym24$_CSETF_GRAPHL_SEARCH_GOAL_FN = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN");
        $sym25$GRAPHL_SEARCH_GOAL_FOUND_P = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P");
        $sym26$_CSETF_GRAPHL_SEARCH_GOAL_FOUND_P = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P");
        $sym27$GRAPHL_SEARCH_SATISFY_FN = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-SATISFY-FN");
        $sym28$_CSETF_GRAPHL_SEARCH_SATISFY_FN = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN");
        $sym29$GRAPHL_SEARCH_MAP_FN = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-MAP-FN");
        $sym30$_CSETF_GRAPHL_SEARCH_MAP_FN = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN");
        $sym31$GRAPHL_SEARCH_JUSTIFY_ = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-JUSTIFY?");
        $sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_ = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?");
        $sym33$GRAPHL_SEARCH_ADD_TO_RESULT_ = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?");
        $sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_ = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?");
        $sym35$GRAPHL_SEARCH_UNWIND_FN_TOGGLE = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE");
        $sym36$_CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE");
        $sym37$GRAPHL_SEARCH_RESULT = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-RESULT");
        $sym38$_CSETF_GRAPHL_SEARCH_RESULT = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT");
        $sym39$GRAPHL_SEARCH_GRAPH = SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-GRAPH");
        $sym40$_CSETF_GRAPHL_SEARCH_GRAPH = SubLObjectFactory.makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH");
        $kw41$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw42$ORDER = SubLObjectFactory.makeKeyword("ORDER");
        $kw43$CUTOFF = SubLObjectFactory.makeKeyword("CUTOFF");
        $kw44$MARKING = SubLObjectFactory.makeKeyword("MARKING");
        $kw45$MARKING_SPACE = SubLObjectFactory.makeKeyword("MARKING-SPACE");
        $kw46$GOAL_SPACE = SubLObjectFactory.makeKeyword("GOAL-SPACE");
        $kw47$GOAL = SubLObjectFactory.makeKeyword("GOAL");
        $kw48$GOAL_FN = SubLObjectFactory.makeKeyword("GOAL-FN");
        $kw49$GOAL_FOUND_P = SubLObjectFactory.makeKeyword("GOAL-FOUND-P");
        $kw50$SATISFY_FN = SubLObjectFactory.makeKeyword("SATISFY-FN");
        $kw51$MAP_FN = SubLObjectFactory.makeKeyword("MAP-FN");
        $kw52$JUSTIFY_ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $kw53$ADD_TO_RESULT_ = SubLObjectFactory.makeKeyword("ADD-TO-RESULT?");
        $kw54$UNWIND_FN_TOGGLE = SubLObjectFactory.makeKeyword("UNWIND-FN-TOGGLE");
        $kw55$RESULT = SubLObjectFactory.makeKeyword("RESULT");
        $kw56$GRAPH = SubLObjectFactory.makeKeyword("GRAPH");
        $str57$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw58$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym59$MAKE_GRAPHL_SEARCH = SubLObjectFactory.makeSymbol("MAKE-GRAPHL-SEARCH");
        $kw60$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw61$END = SubLObjectFactory.makeKeyword("END");
        $sym62$VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD");
        $str63$GraphL_Search____a__ = SubLObjectFactory.makeString("GraphL Search : ~a~%");
        $str64$Type____a__ = SubLObjectFactory.makeString("Type : ~a~%");
        $str65$Order____a__ = SubLObjectFactory.makeString("Order : ~a~%");
        $str66$Cutoff____a__ = SubLObjectFactory.makeString("Cutoff : ~a~%");
        $str67$Marking____a__ = SubLObjectFactory.makeString("Marking : ~a~%");
        $str68$Space____a__ = SubLObjectFactory.makeString("Space : ~a~%");
        $str69$Goal_Space____a__ = SubLObjectFactory.makeString("Goal Space : ~a~%");
        $str70$Goal____a__ = SubLObjectFactory.makeString("Goal : ~a~%");
        $str71$Goal_Fn____a__ = SubLObjectFactory.makeString("Goal Fn : ~a~%");
        $str72$Goal_Found_P____a__ = SubLObjectFactory.makeString("Goal Found-P : ~a~%");
        $str73$Satisfy_Fn____a__ = SubLObjectFactory.makeString("Satisfy Fn : ~a~%");
        $str74$Map_Fn____a__ = SubLObjectFactory.makeString("Map Fn : ~a~%");
        $str75$Justify_____a__ = SubLObjectFactory.makeString("Justify? : ~a~%");
        $str76$Add_to_Result_____a__ = SubLObjectFactory.makeString("Add to Result? : ~a~%");
        $str77$Unwind_Fn_Toggle____a__ = SubLObjectFactory.makeString("Unwind Fn Toggle : ~a~%");
        $str78$Result____a__ = SubLObjectFactory.makeString("Result : ~a~%");
        $str79$Graph____a__ = SubLObjectFactory.makeString("Graph : ~a~%");
        $kw80$FREE = SubLObjectFactory.makeKeyword("FREE");
        $kw81$DEPTH_FIRST = SubLObjectFactory.makeKeyword("DEPTH-FIRST");
        $kw82$BREADTH_FIRST = SubLObjectFactory.makeKeyword("BREADTH-FIRST");
        $kw83$ITERATIVE_DEEPENING = SubLObjectFactory.makeKeyword("ITERATIVE-DEEPENING");
        $kw84$DEPTH_MARKING = SubLObjectFactory.makeKeyword("DEPTH-MARKING");
        $kw85$NODES_ON_WIND = SubLObjectFactory.makeKeyword("NODES-ON-WIND");
        $kw86$EDGES_ON_UNWIND = SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPTH-MARKING"), (SubLObject)SubLObjectFactory.makeKeyword("SIMPLE"));
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym89$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GRAPHL-SEARCH")));
        $sym91$SET_GRAPHL_SEARCH_PROPERTIES = SubLObjectFactory.makeSymbol("SET-GRAPHL-SEARCH-PROPERTIES");
        $sym92$DESTROY_GRAPHL_SEARCH = SubLObjectFactory.makeSymbol("DESTROY-GRAPHL-SEARCH");
        $sym93$WITH_GRAPHL_SEARCH_INITIALIZED = SubLObjectFactory.makeSymbol("WITH-GRAPHL-SEARCH-INITIALIZED");
        $int94$200 = SubLObjectFactory.makeInteger(200);
    }
    
    public static final class $graphl_search_native extends SubLStructNative
    {
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
        
        public $graphl_search_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$order = (SubLObject)CommonSymbols.NIL;
            this.$cutoff = (SubLObject)CommonSymbols.NIL;
            this.$marking = (SubLObject)CommonSymbols.NIL;
            this.$marking_space = (SubLObject)CommonSymbols.NIL;
            this.$goal_space = (SubLObject)CommonSymbols.NIL;
            this.$goal = (SubLObject)CommonSymbols.NIL;
            this.$goal_fn = (SubLObject)CommonSymbols.NIL;
            this.$goal_found_p = (SubLObject)CommonSymbols.NIL;
            this.$satisfy_fn = (SubLObject)CommonSymbols.NIL;
            this.$map_fn = (SubLObject)CommonSymbols.NIL;
            this.$justifyP = (SubLObject)CommonSymbols.NIL;
            this.$add_to_resultP = (SubLObject)CommonSymbols.NIL;
            this.$unwind_fn_toggle = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$graph = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$graphl_search_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$graphl_search_native.class, graphl_search_vars.$sym0$GRAPHL_SEARCH, graphl_search_vars.$sym1$GRAPHL_SEARCH_P, graphl_search_vars.$list2, graphl_search_vars.$list3, new String[] { "$type", "$order", "$cutoff", "$marking", "$marking_space", "$goal_space", "$goal", "$goal_fn", "$goal_found_p", "$satisfy_fn", "$map_fn", "$justifyP", "$add_to_resultP", "$unwind_fn_toggle", "$result", "$graph" }, graphl_search_vars.$list4, graphl_search_vars.$list5, graphl_search_vars.$sym6$PRINT_GRAPHL_SEARCH);
        }
    }
    
    public static final class $graphl_search_p$UnaryFunction extends UnaryFunction
    {
        public $graphl_search_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GRAPHL-SEARCH-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return graphl_search_vars.graphl_search_p(arg1);
        }
    }
}

/*

	Total time: 234 ms
	
*/