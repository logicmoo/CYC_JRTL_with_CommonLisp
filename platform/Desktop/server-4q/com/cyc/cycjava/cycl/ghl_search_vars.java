package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ghl_search_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ghl_search_vars";
    public static final String myFingerPrint = "74a02bbf3e41132836c275cdb69676ebf133060a2288faff1d7e40962c572ede";
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 846L)
    private static SubLSymbol $ghl_search_property_defaults$;
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLSymbol $dtp_ghl_search$;
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13765L)
    public static SubLSymbol $sksi_gt_search_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13978L)
    public static SubLSymbol $ghl_uses_spec_preds_p$;
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14578L)
    public static SubLSymbol $gt_args_swapped_p$;
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14952L)
    public static SubLSymbol $ghl_trace_level$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$GHL_SEARCH;
    private static final SubLSymbol $sym2$GHL_SEARCH_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_GHL_SEARCH;
    private static final SubLSymbol $sym8$GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$GHL_SEARCH_GRAPHL_SEARCH;
    private static final SubLSymbol $sym11$_CSETF_GHL_SEARCH_GRAPHL_SEARCH;
    private static final SubLSymbol $sym12$GHL_SEARCH_PREDICATES;
    private static final SubLSymbol $sym13$_CSETF_GHL_SEARCH_PREDICATES;
    private static final SubLSymbol $sym14$GHL_SEARCH_DIRECTIONS;
    private static final SubLSymbol $sym15$_CSETF_GHL_SEARCH_DIRECTIONS;
    private static final SubLSymbol $sym16$GHL_SEARCH_TV;
    private static final SubLSymbol $sym17$_CSETF_GHL_SEARCH_TV;
    private static final SubLSymbol $kw18$GRAPHL_SEARCH;
    private static final SubLSymbol $kw19$PREDICATES;
    private static final SubLSymbol $kw20$DIRECTIONS;
    private static final SubLSymbol $kw21$TV;
    private static final SubLString $str22$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw23$BEGIN;
    private static final SubLSymbol $sym24$MAKE_GHL_SEARCH;
    private static final SubLSymbol $kw25$SLOT;
    private static final SubLSymbol $kw26$END;
    private static final SubLSymbol $sym27$VISIT_DEFSTRUCT_OBJECT_GHL_SEARCH_METHOD;
    private static final SubLString $str28$GHL_Search____a__;
    private static final SubLString $str29$Predicates__a__;
    private static final SubLString $str30$Directions__a__;
    private static final SubLString $str31$TV__s__;
    private static final SubLSymbol $kw32$FREE;
    private static final SubLSymbol $kw33$TRANSITIVE_REASONING;
    private static final SubLSymbol $kw34$ALL;
    private static final SubLList $list35;
    private static final SubLSymbol $kw36$DIRECTION;
    private static final SubLSymbol $kw37$TYPE;
    private static final SubLSymbol $kw38$ORDER;
    private static final SubLSymbol $kw39$CUTOFF;
    private static final SubLSymbol $kw40$MARKING;
    private static final SubLSymbol $kw41$MARKING_SPACE;
    private static final SubLSymbol $kw42$GOAL;
    private static final SubLSymbol $kw43$GOAL_FN;
    private static final SubLSymbol $kw44$GOAL_SPACE;
    private static final SubLSymbol $kw45$SATISFY_FN;
    private static final SubLSymbol $kw46$MAP_FN;
    private static final SubLSymbol $kw47$JUSTIFY_;
    private static final SubLSymbol $kw48$ADD_TO_RESULT_;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$CLET;
    private static final SubLSymbol $sym51$NEW_GHL_SEARCH;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$DESTROY_GHL_SEARCH;
    private static final SubLSymbol $kw54$FORWARD;
    private static final SubLSymbol $kw55$BACKWARD;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw59$DONE_VAR;
    private static final SubLSymbol $sym60$CSOME;
    private static final SubLSymbol $sym61$DETERMINE_GHL_RELEVANT_DIRECTIONS;
    private static final SubLSymbol $kw62$ACCESSIBLE;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$_SKSI_GT_SEARCH_PRED_;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$PROGN;
    private static final SubLSymbol $sym70$CHECK_TYPE;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$_GHL_USES_SPEC_PREDS_P_;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$_GHL_TRACE_LEVEL_;
    private static final SubLString $str79$continue_anyway;
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1499L)
    public static SubLObject ghl_search_property_default(final SubLObject property) {
        return conses_high.assoc(property, ghl_search_vars.$ghl_search_property_defaults$.getGlobalValue(), Symbols.symbol_function((SubLObject)ghl_search_vars.EQ), (SubLObject)ghl_search_vars.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject ghl_search_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ghl_search(v_object, stream, (SubLObject)ghl_search_vars.ZERO_INTEGER);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject ghl_search_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ghl_search_native.class) ? ghl_search_vars.T : ghl_search_vars.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject ghl_search_graphl_search(final SubLObject v_object) {
        assert ghl_search_vars.NIL != ghl_search_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject ghl_search_predicates(final SubLObject v_object) {
        assert ghl_search_vars.NIL != ghl_search_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject ghl_search_directions(final SubLObject v_object) {
        assert ghl_search_vars.NIL != ghl_search_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject ghl_search_tv(final SubLObject v_object) {
        assert ghl_search_vars.NIL != ghl_search_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject _csetf_ghl_search_graphl_search(final SubLObject v_object, final SubLObject value) {
        assert ghl_search_vars.NIL != ghl_search_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject _csetf_ghl_search_predicates(final SubLObject v_object, final SubLObject value) {
        assert ghl_search_vars.NIL != ghl_search_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject _csetf_ghl_search_directions(final SubLObject v_object, final SubLObject value) {
        assert ghl_search_vars.NIL != ghl_search_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject _csetf_ghl_search_tv(final SubLObject v_object, final SubLObject value) {
        assert ghl_search_vars.NIL != ghl_search_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject make_ghl_search(SubLObject arglist) {
        if (arglist == ghl_search_vars.UNPROVIDED) {
            arglist = (SubLObject)ghl_search_vars.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ghl_search_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)ghl_search_vars.NIL, next = arglist; ghl_search_vars.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)ghl_search_vars.$kw18$GRAPHL_SEARCH)) {
                _csetf_ghl_search_graphl_search(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ghl_search_vars.$kw19$PREDICATES)) {
                _csetf_ghl_search_predicates(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ghl_search_vars.$kw20$DIRECTIONS)) {
                _csetf_ghl_search_directions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ghl_search_vars.$kw21$TV)) {
                _csetf_ghl_search_tv(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)ghl_search_vars.$str22$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject visit_defstruct_ghl_search(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)ghl_search_vars.$kw23$BEGIN, (SubLObject)ghl_search_vars.$sym24$MAKE_GHL_SEARCH, (SubLObject)ghl_search_vars.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)ghl_search_vars.$kw25$SLOT, (SubLObject)ghl_search_vars.$kw18$GRAPHL_SEARCH, ghl_search_graphl_search(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ghl_search_vars.$kw25$SLOT, (SubLObject)ghl_search_vars.$kw19$PREDICATES, ghl_search_predicates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ghl_search_vars.$kw25$SLOT, (SubLObject)ghl_search_vars.$kw20$DIRECTIONS, ghl_search_directions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ghl_search_vars.$kw25$SLOT, (SubLObject)ghl_search_vars.$kw21$TV, ghl_search_tv(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ghl_search_vars.$kw26$END, (SubLObject)ghl_search_vars.$sym24$MAKE_GHL_SEARCH, (SubLObject)ghl_search_vars.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
    public static SubLObject visit_defstruct_object_ghl_search_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ghl_search(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1828L)
    public static SubLObject print_ghl_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ghl_search_vars.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)ghl_search_vars.T, (SubLObject)ghl_search_vars.NIL);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)ghl_search_vars.T, (SubLObject)ghl_search_vars.T);
        }
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1979L)
    public static SubLObject describe_ghl_search(final SubLObject v_object) {
        PrintLow.format((SubLObject)ghl_search_vars.T, (SubLObject)ghl_search_vars.$str28$GHL_Search____a__, v_object);
        PrintLow.format((SubLObject)ghl_search_vars.T, (SubLObject)ghl_search_vars.$str29$Predicates__a__, ghl_search_predicates(v_object));
        PrintLow.format((SubLObject)ghl_search_vars.T, (SubLObject)ghl_search_vars.$str30$Directions__a__, ghl_search_directions(v_object));
        PrintLow.format((SubLObject)ghl_search_vars.T, (SubLObject)ghl_search_vars.$str31$TV__s__, ghl_search_tv(v_object));
        graphl_search_vars.describe_graphl_search(ghl_graphl_search(v_object));
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 2301L)
    public static SubLObject new_ghl_search(final SubLObject plist) {
        final SubLObject ghl_search = make_ghl_search((SubLObject)ghl_search_vars.UNPROVIDED);
        final SubLObject graphl_search = graphl_search_vars.new_graphl_search((SubLObject)ghl_search_vars.NIL);
        set_ghl_graphl_search(ghl_search, graphl_search);
        set_ghl_search_properties(ghl_search, plist);
        return ghl_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 2571L)
    public static SubLObject destroy_ghl_search(final SubLObject graph_search) {
        graphl_search_vars.destroy_graphl_search(ghl_search_graphl_search(graph_search));
        _csetf_ghl_search_graphl_search(graph_search, (SubLObject)ghl_search_vars.$kw32$FREE);
        _csetf_ghl_search_predicates(graph_search, (SubLObject)ghl_search_vars.$kw32$FREE);
        _csetf_ghl_search_directions(graph_search, (SubLObject)ghl_search_vars.$kw32$FREE);
        _csetf_ghl_search_tv(graph_search, (SubLObject)ghl_search_vars.$kw32$FREE);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 2925L)
    public static SubLObject ghl_graphl_search(final SubLObject v_search) {
        return ghl_search_graphl_search(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3063L)
    public static SubLObject ghl_relevant_predicates(final SubLObject v_search) {
        return ghl_search_predicates(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3155L)
    public static SubLObject ghl_relevant_directions(final SubLObject v_search) {
        return ghl_search_directions(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3247L)
    public static SubLObject ghl_tv(final SubLObject v_search) {
        return ghl_search_tv(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3314L)
    public static SubLObject ghl_result(final SubLObject v_search) {
        return graphl_search_vars.graphl_result(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3429L)
    public static SubLObject ghl_space(final SubLObject v_search) {
        return graphl_search_vars.graphl_space(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3518L)
    public static SubLObject ghl_goal_space(final SubLObject v_search) {
        return graphl_search_vars.graphl_goal_space(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3617L)
    public static SubLObject ghl_truth(final SubLObject v_search) {
        return enumeration_types.tv_truth(ghl_tv(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3691L)
    public static SubLObject ghl_strength(final SubLObject v_search) {
        return enumeration_types.tv_strength(ghl_tv(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3771L)
    public static SubLObject ghl_compute_justifyP(final SubLObject v_search) {
        return graphl_search_vars.graphl_compute_justifyP(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3882L)
    public static SubLObject ghl_add_to_resultP(final SubLObject v_search) {
        return graphl_search_vars.graphl_search_add_to_resultP(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3996L)
    public static SubLObject ghl_goal(final SubLObject v_search) {
        return graphl_search_vars.graphl_search_goal(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4090L)
    public static SubLObject ghl_goal_fn(final SubLObject v_search) {
        return graphl_search_vars.graphl_search_goal_fn(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4190L)
    public static SubLObject ghl_cutoff(final SubLObject v_search) {
        return graphl_search_vars.graphl_cutoff(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4281L)
    public static SubLObject ghl_depth_cutoff(final SubLObject v_search) {
        return graphl_search_vars.graphl_cutoff(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4378L)
    public static SubLObject ghl_order(final SubLObject v_search) {
        return graphl_search_vars.graphl_order(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4496L)
    public static SubLObject ghl_goal_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_goal_search_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4601L)
    public static SubLObject ghl_map_fn(final SubLObject v_search) {
        return graphl_search_vars.graphl_map_fn(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4692L)
    public static SubLObject ghl_map_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_map_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4781L)
    public static SubLObject ghl_depth_first_search(final SubLObject v_search) {
        return graphl_search_vars.graphl_depth_first_search_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4898L)
    public static SubLObject ghl_breadth_first_search(final SubLObject v_search) {
        return graphl_search_vars.graphl_breadth_first_search_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5019L)
    public static SubLObject ghl_depth_marking_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_depth_marking_search_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5142L)
    public static SubLObject ghl_iterative_deepening_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_iterative_deepening_search_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5277L)
    public static SubLObject ghl_add_nodes_on_wind_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_add_nodes_on_wind_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5394L)
    public static SubLObject ghl_add_edges_on_unwind_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_add_edges_on_unwind_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5515L)
    public static SubLObject ghl_add_unwind_edges_now_p(final SubLObject v_search) {
        return graphl_graph_utilities.graphl_add_unwind_edges_now_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5638L)
    public static SubLObject ghl_goal_found_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_goal_found_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5741L)
    public static SubLObject ghl_single_goal_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_single_goal_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5846L)
    public static SubLObject ghl_multiple_goals_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_multiple_goals_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5957L)
    public static SubLObject ghl_goal_fn_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_goal_fn_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6054L)
    public static SubLObject ghl_depth_first_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_depth_first_search_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6173L)
    public static SubLObject ghl_breadth_first_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_breadth_first_search_p(ghl_graphl_search(v_search));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6296L)
    public static SubLObject ghl_goal_found_condition_p(final SubLObject condition) {
        return graphl_search_vars.graphl_goal_found_condition_p(condition);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6405L)
    public static SubLObject ghl_transitive_search_p(final SubLObject v_search) {
        return Equality.eq(graphl_search_vars.graphl_type(ghl_graphl_search(v_search)), (SubLObject)ghl_search_vars.$kw33$TRANSITIVE_REASONING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6556L)
    public static SubLObject ghl_return_one_answer_p(final SubLObject v_search) {
        return ghl_goal_search_p(v_search);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6644L)
    public static SubLObject ghl_relevant_predP(final SubLObject v_search, final SubLObject pred) {
        if (ghl_search_predicates(v_search).isList()) {
            SubLObject relevantP = (SubLObject)ghl_search_vars.NIL;
            if (ghl_search_vars.NIL == relevantP) {
                SubLObject csome_list_var = ghl_search_predicates(v_search);
                SubLObject ghl_pred = (SubLObject)ghl_search_vars.NIL;
                ghl_pred = csome_list_var.first();
                while (ghl_search_vars.NIL == relevantP && ghl_search_vars.NIL != csome_list_var) {
                    if (ghl_search_vars.NIL != ghl_link_iterators.gt_relevant_predP(pred, ghl_pred)) {
                        relevantP = (SubLObject)ghl_search_vars.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    ghl_pred = csome_list_var.first();
                }
            }
            return relevantP;
        }
        return ghl_link_iterators.gt_relevant_predP(pred, ghl_search_predicates(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 7015L)
    public static SubLObject ghl_return_all_justificationsP(final SubLObject v_search) {
        return Equality.eq(ghl_compute_justifyP(v_search), (SubLObject)ghl_search_vars.$kw34$ALL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 7123L)
    public static SubLObject set_ghl_search_properties(final SubLObject v_search, final SubLObject plist) {
        SubLObject cdolist_list_var = ghl_search_vars.$ghl_search_property_defaults$.getGlobalValue();
        SubLObject cons = (SubLObject)ghl_search_vars.NIL;
        cons = cdolist_list_var.first();
        while (ghl_search_vars.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject prop = (SubLObject)ghl_search_vars.NIL;
            SubLObject value = (SubLObject)ghl_search_vars.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list35);
            prop = current.first();
            current = (value = current.rest());
            if (ghl_search_vars.NIL != value) {
                set_ghl_search_property(v_search, prop, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        if (ghl_search_vars.NIL != conses_high.getf(plist, (SubLObject)ghl_search_vars.$kw36$DIRECTION, (SubLObject)ghl_search_vars.UNPROVIDED) && ghl_search_vars.NIL == conses_high.getf(plist, (SubLObject)ghl_search_vars.$kw20$DIRECTIONS, (SubLObject)ghl_search_vars.UNPROVIDED)) {
            set_ghl_search_property(v_search, (SubLObject)ghl_search_vars.$kw20$DIRECTIONS, (SubLObject)ConsesLow.make_list(Sequences.length(conses_high.getf(plist, (SubLObject)ghl_search_vars.$kw19$PREDICATES, (SubLObject)ghl_search_vars.UNPROVIDED)), conses_high.getf(plist, (SubLObject)ghl_search_vars.$kw36$DIRECTION, (SubLObject)ghl_search_vars.UNPROVIDED)));
        }
        SubLObject remainder;
        SubLObject prop2;
        SubLObject val;
        for (remainder = (SubLObject)ghl_search_vars.NIL, remainder = plist; ghl_search_vars.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            prop2 = remainder.first();
            val = conses_high.cadr(remainder);
            set_ghl_search_property(v_search, prop2, val);
        }
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 7735L)
    public static SubLObject set_ghl_search_property(final SubLObject v_search, final SubLObject property, SubLObject value) {
        if (ghl_search_vars.NIL == value) {
            value = ghl_search_property_default(property);
        }
        final SubLObject graphl_search = ghl_graphl_search(v_search);
        if (property.eql((SubLObject)ghl_search_vars.$kw19$PREDICATES)) {
            set_ghl_search_predicates(v_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw20$DIRECTIONS)) {
            set_ghl_search_directions(v_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw21$TV)) {
            set_ghl_search_tv(v_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw37$TYPE)) {
            graphl_search_vars.set_graphl_search_type(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw38$ORDER)) {
            graphl_search_vars.set_graphl_search_order(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw39$CUTOFF)) {
            graphl_search_vars.set_graphl_search_cutoff(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw40$MARKING)) {
            graphl_search_vars.set_graphl_search_marking(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw41$MARKING_SPACE)) {
            graphl_search_vars.set_graphl_search_marking_space(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw42$GOAL)) {
            graphl_search_vars.set_graphl_search_goal(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw43$GOAL_FN)) {
            graphl_search_vars.set_graphl_search_goal_fn(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw44$GOAL_SPACE)) {
            graphl_search_vars.set_graphl_search_goal_space(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw45$SATISFY_FN)) {
            graphl_search_vars.set_graphl_search_satisfy_fn(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw46$MAP_FN)) {
            graphl_search_vars.set_graphl_search_map_fn(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw47$JUSTIFY_)) {
            graphl_search_vars.set_graphl_search_justifyP(graphl_search, value);
        }
        else if (property.eql((SubLObject)ghl_search_vars.$kw48$ADD_TO_RESULT_)) {
            graphl_search_vars.set_graphl_search_add_to_resultP(graphl_search, value);
        }
        return v_search;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9076L)
    public static SubLObject set_ghl_graphl_search(final SubLObject v_search, final SubLObject graphl_search) {
        _csetf_ghl_search_graphl_search(v_search, graphl_search);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9237L)
    public static SubLObject set_ghl_search_predicates(final SubLObject v_search, final SubLObject predicates) {
        _csetf_ghl_search_predicates(v_search, predicates);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9365L)
    public static SubLObject set_ghl_search_directions(final SubLObject v_search, final SubLObject directions) {
        _csetf_ghl_search_directions(v_search, directions);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9493L)
    public static SubLObject set_ghl_search_tv(final SubLObject v_search, final SubLObject tv) {
        _csetf_ghl_search_tv(v_search, tv);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9589L)
    public static SubLObject set_ghl_search_order(final SubLObject v_search, final SubLObject order) {
        graphl_search_vars.set_graphl_search_order(ghl_graphl_search(v_search), order);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9716L)
    public static SubLObject set_ghl_search_cutoff(final SubLObject v_search, final SubLObject cutoff_type) {
        graphl_search_vars.set_graphl_search_cutoff(ghl_graphl_search(v_search), cutoff_type);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9857L)
    public static SubLObject set_ghl_search_marking(final SubLObject v_search, final SubLObject marking) {
        graphl_search_vars.set_graphl_search_marking(ghl_graphl_search(v_search), marking);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9992L)
    public static SubLObject set_ghl_search_marking_space(final SubLObject v_search, final SubLObject marking_space) {
        graphl_search_vars.set_graphl_search_marking_space(ghl_graphl_search(v_search), marking_space);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10151L)
    public static SubLObject set_ghl_search_goal(final SubLObject v_search, final SubLObject goal) {
        graphl_search_vars.set_graphl_search_goal(ghl_graphl_search(v_search), goal);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10274L)
    public static SubLObject set_ghl_search_goal_fn(final SubLObject v_search, final SubLObject goal_fn) {
        graphl_search_vars.set_graphl_search_goal_fn(ghl_graphl_search(v_search), goal_fn);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10409L)
    public static SubLObject set_ghl_search_goal_space(final SubLObject v_search, final SubLObject goal_space) {
        graphl_search_vars.set_graphl_search_goal_space(ghl_graphl_search(v_search), goal_space);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10556L)
    public static SubLObject set_ghl_search_satisfy_fn(final SubLObject v_search, final SubLObject satisfy_fn) {
        graphl_search_vars.set_graphl_search_satisfy_fn(ghl_graphl_search(v_search), satisfy_fn);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10703L)
    public static SubLObject set_ghl_search_map_fn(final SubLObject v_search, final SubLObject map_fn) {
        graphl_search_vars.set_graphl_search_map_fn(ghl_graphl_search(v_search), map_fn);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10834L)
    public static SubLObject set_ghl_search_justifyP(final SubLObject v_search, final SubLObject justifyP) {
        graphl_search_vars.set_graphl_search_justifyP(ghl_graphl_search(v_search), justifyP);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10973L)
    public static SubLObject set_ghl_search_result(final SubLObject v_search, final SubLObject result) {
        graphl_search_vars.set_graphl_search_result(ghl_graphl_search(v_search), result);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11104L)
    public static SubLObject set_ghl_goal_found_p(final SubLObject v_search, final SubLObject found_p) {
        graphl_search_vars.set_graphl_search_goal_found_p(ghl_graphl_search(v_search), found_p);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11244L)
    public static SubLObject ghl_set_result(final SubLObject v_search, final SubLObject result) {
        set_ghl_search_result(v_search, result);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11372L)
    public static SubLObject ghl_add_node_to_result(final SubLObject v_search, final SubLObject node) {
        graphl_search_vars.graphl_add_node_to_result(ghl_graphl_search(v_search), node);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11701L)
    public static SubLObject ghl_add_to_result(final SubLObject v_search, final SubLObject addition, SubLObject test) {
        if (test == ghl_search_vars.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)ghl_search_vars.EQL);
        }
        graphl_search_vars.graphl_add_to_result(ghl_graphl_search(v_search), addition, test);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11858L)
    public static SubLObject ghl_append_to_result(final SubLObject v_search, final SubLObject addition) {
        graphl_search_vars.graphl_append_to_result(ghl_graphl_search(v_search), addition);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11993L)
    public static SubLObject with_ghl_search_initialized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject search_var = (SubLObject)ghl_search_vars.NIL;
        SubLObject plist = (SubLObject)ghl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list49);
        search_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list49);
        plist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym50$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(search_var, (SubLObject)ConsesLow.list((SubLObject)ghl_search_vars.$sym51$NEW_GHL_SEARCH, plist))), (SubLObject)ghl_search_vars.$list52, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_search_vars.$sym53$DESTROY_GHL_SEARCH, search_var))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12218L)
    public static SubLObject reinitialize_ghl_spaces(final SubLObject v_search) {
        graphl_search_vars.reinitialize_graphl_spaces(ghl_graphl_search(v_search));
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12341L)
    public static SubLObject ghl_forward_direction() {
        return (SubLObject)ghl_search_vars.$kw54$FORWARD;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12454L)
    public static SubLObject ghl_backward_direction() {
        return (SubLObject)ghl_search_vars.$kw55$BACKWARD;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12518L)
    public static SubLObject ghl_forward_direction_p(final SubLObject direction) {
        return Equality.eq(direction, (SubLObject)ghl_search_vars.$kw54$FORWARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12606L)
    public static SubLObject do_ghl_relevant_directions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dir_var = (SubLObject)ghl_search_vars.NIL;
        SubLObject direction = (SubLObject)ghl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list56);
        dir_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list56);
        direction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)ghl_search_vars.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)ghl_search_vars.NIL;
        SubLObject current_$1 = (SubLObject)ghl_search_vars.NIL;
        while (ghl_search_vars.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_search_vars.$list56);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_search_vars.$list56);
            if (ghl_search_vars.NIL == conses_high.member(current_$1, (SubLObject)ghl_search_vars.$list57, (SubLObject)ghl_search_vars.UNPROVIDED, (SubLObject)ghl_search_vars.UNPROVIDED)) {
                bad = (SubLObject)ghl_search_vars.T;
            }
            if (current_$1 == ghl_search_vars.$kw58$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (ghl_search_vars.NIL != bad && ghl_search_vars.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ghl_search_vars.$list56);
        }
        final SubLObject done_var_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_search_vars.$kw59$DONE_VAR, current);
        final SubLObject done_var = (SubLObject)((ghl_search_vars.NIL != done_var_tail) ? conses_high.cadr(done_var_tail) : ghl_search_vars.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym60$CSOME, (SubLObject)ConsesLow.list(dir_var, (SubLObject)ConsesLow.list((SubLObject)ghl_search_vars.$sym61$DETERMINE_GHL_RELEVANT_DIRECTIONS, direction), done_var), ConsesLow.append(body, (SubLObject)ghl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12797L)
    public static SubLObject ghl_opposite_direction(final SubLObject direction) {
        if (direction.eql((SubLObject)ghl_search_vars.$kw54$FORWARD)) {
            return (SubLObject)ghl_search_vars.$kw55$BACKWARD;
        }
        if (direction.eql((SubLObject)ghl_search_vars.$kw55$BACKWARD)) {
            return (SubLObject)ghl_search_vars.$kw54$FORWARD;
        }
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12947L)
    public static SubLObject ghl_direction_for_predicate_relation(final SubLObject pred) {
        return (SubLObject)(ghl_search_vars.ONE_INTEGER.eql(kb_accessors.fan_out_arg(pred, (SubLObject)ghl_search_vars.UNPROVIDED)) ? ghl_search_vars.$kw54$FORWARD : ghl_search_vars.$kw55$BACKWARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13365L)
    public static SubLObject ghl_fan_out_direction(final SubLObject pred) {
        final SubLObject pcase_var = kb_accessors.asserted_fan_out_arg(pred, (SubLObject)ghl_search_vars.UNPROVIDED);
        if (pcase_var.eql((SubLObject)ghl_search_vars.ONE_INTEGER)) {
            return (SubLObject)ghl_search_vars.$kw55$BACKWARD;
        }
        if (pcase_var.eql((SubLObject)ghl_search_vars.TWO_INTEGER)) {
            return (SubLObject)ghl_search_vars.$kw54$FORWARD;
        }
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13540L)
    public static SubLObject determine_ghl_relevant_directions(final SubLObject ghl_direction) {
        if (ghl_direction.eql((SubLObject)ghl_search_vars.$kw62$ACCESSIBLE)) {
            return (SubLObject)ghl_search_vars.$list63;
        }
        if (ghl_direction.eql((SubLObject)ghl_search_vars.$kw54$FORWARD)) {
            return (SubLObject)ghl_search_vars.$list64;
        }
        if (ghl_direction.eql((SubLObject)ghl_search_vars.$kw55$BACKWARD)) {
            return (SubLObject)ghl_search_vars.$list65;
        }
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13855L)
    public static SubLObject with_sksi_gt_search_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = (SubLObject)ghl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list66);
        pred = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym50$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_search_vars.$sym67$_SKSI_GT_SEARCH_PRED_, pred)), ConsesLow.append(body, (SubLObject)ghl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14091L)
    public static SubLObject ghl_uses_spec_preds_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ghl_search_vars.$ghl_uses_spec_preds_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14168L)
    public static SubLObject with_ghl_spec_pred_use_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject use_emP = (SubLObject)ghl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list68);
        use_emP = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)ghl_search_vars.$sym69$PROGN, (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym70$CHECK_TYPE, use_emP, (SubLObject)ghl_search_vars.$list71), (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym50$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_search_vars.$sym72$_GHL_USES_SPEC_PREDS_P_, use_emP)), ConsesLow.append(body, (SubLObject)ghl_search_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14345L)
    public static SubLObject with_ghl_spec_pred_use(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym50$CLET, (SubLObject)ghl_search_vars.$list73, ConsesLow.append(body, (SubLObject)ghl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14459L)
    public static SubLObject without_ghl_spec_pred_use(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym50$CLET, (SubLObject)ghl_search_vars.$list74, ConsesLow.append(body, (SubLObject)ghl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14663L)
    public static SubLObject with_gt_args_unswapped(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym50$CLET, (SubLObject)ghl_search_vars.$list75, ConsesLow.append(body, (SubLObject)ghl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14775L)
    public static SubLObject with_gt_args_swapped(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym50$CLET, (SubLObject)ghl_search_vars.$list76, ConsesLow.append(body, (SubLObject)ghl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14883L)
    public static SubLObject gt_args_swapped_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ghl_search_vars.$gt_args_swapped_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 15089L)
    public static SubLObject with_ghl_trace_level(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)ghl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_search_vars.$list77);
        level = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_search_vars.$sym50$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_search_vars.$sym78$_GHL_TRACE_LEVEL_, level)), ConsesLow.append(body, (SubLObject)ghl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 15203L)
    public static SubLObject ghl_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == ghl_search_vars.UNPROVIDED) {
            arg1 = (SubLObject)ghl_search_vars.NIL;
        }
        if (arg2 == ghl_search_vars.UNPROVIDED) {
            arg2 = (SubLObject)ghl_search_vars.NIL;
        }
        if (arg3 == ghl_search_vars.UNPROVIDED) {
            arg3 = (SubLObject)ghl_search_vars.NIL;
        }
        if (arg4 == ghl_search_vars.UNPROVIDED) {
            arg4 = (SubLObject)ghl_search_vars.NIL;
        }
        if (arg5 == ghl_search_vars.UNPROVIDED) {
            arg5 = (SubLObject)ghl_search_vars.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ghl_search_vars.$ghl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror((SubLObject)ghl_search_vars.$str79$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)ghl_search_vars.TWO_INTEGER, ghl_search_vars.$ghl_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    public static SubLObject declare_ghl_search_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_search_property_default", "GHL-SEARCH-PROPERTY-DEFAULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_search_print_function_trampoline", "GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_search_p", "GHL-SEARCH-P", 1, 0, false);
        new $ghl_search_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_search_graphl_search", "GHL-SEARCH-GRAPHL-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_search_predicates", "GHL-SEARCH-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_search_directions", "GHL-SEARCH-DIRECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_search_tv", "GHL-SEARCH-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "_csetf_ghl_search_graphl_search", "_CSETF-GHL-SEARCH-GRAPHL-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "_csetf_ghl_search_predicates", "_CSETF-GHL-SEARCH-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "_csetf_ghl_search_directions", "_CSETF-GHL-SEARCH-DIRECTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "_csetf_ghl_search_tv", "_CSETF-GHL-SEARCH-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "make_ghl_search", "MAKE-GHL-SEARCH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "visit_defstruct_ghl_search", "VISIT-DEFSTRUCT-GHL-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "visit_defstruct_object_ghl_search_method", "VISIT-DEFSTRUCT-OBJECT-GHL-SEARCH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "print_ghl_search", "PRINT-GHL-SEARCH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "describe_ghl_search", "DESCRIBE-GHL-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "new_ghl_search", "NEW-GHL-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "destroy_ghl_search", "DESTROY-GHL-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_graphl_search", "GHL-GRAPHL-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_relevant_predicates", "GHL-RELEVANT-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_relevant_directions", "GHL-RELEVANT-DIRECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_tv", "GHL-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_result", "GHL-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_space", "GHL-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_goal_space", "GHL-GOAL-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_truth", "GHL-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_strength", "GHL-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_compute_justifyP", "GHL-COMPUTE-JUSTIFY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_add_to_resultP", "GHL-ADD-TO-RESULT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_goal", "GHL-GOAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_goal_fn", "GHL-GOAL-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_cutoff", "GHL-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_depth_cutoff", "GHL-DEPTH-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_order", "GHL-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_goal_search_p", "GHL-GOAL-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_map_fn", "GHL-MAP-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_map_p", "GHL-MAP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_depth_first_search", "GHL-DEPTH-FIRST-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_breadth_first_search", "GHL-BREADTH-FIRST-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_depth_marking_search_p", "GHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_iterative_deepening_search_p", "GHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_add_nodes_on_wind_p", "GHL-ADD-NODES-ON-WIND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_add_edges_on_unwind_p", "GHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_add_unwind_edges_now_p", "GHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_goal_found_p", "GHL-GOAL-FOUND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_single_goal_p", "GHL-SINGLE-GOAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_multiple_goals_p", "GHL-MULTIPLE-GOALS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_goal_fn_p", "GHL-GOAL-FN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_depth_first_search_p", "GHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_breadth_first_search_p", "GHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_goal_found_condition_p", "GHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_transitive_search_p", "GHL-TRANSITIVE-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_return_one_answer_p", "GHL-RETURN-ONE-ANSWER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_relevant_predP", "GHL-RELEVANT-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_return_all_justificationsP", "GHL-RETURN-ALL-JUSTIFICATIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_properties", "SET-GHL-SEARCH-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_property", "SET-GHL-SEARCH-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_graphl_search", "SET-GHL-GRAPHL-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_predicates", "SET-GHL-SEARCH-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_directions", "SET-GHL-SEARCH-DIRECTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_tv", "SET-GHL-SEARCH-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_order", "SET-GHL-SEARCH-ORDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_cutoff", "SET-GHL-SEARCH-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_marking", "SET-GHL-SEARCH-MARKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_marking_space", "SET-GHL-SEARCH-MARKING-SPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_goal", "SET-GHL-SEARCH-GOAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_goal_fn", "SET-GHL-SEARCH-GOAL-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_goal_space", "SET-GHL-SEARCH-GOAL-SPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_satisfy_fn", "SET-GHL-SEARCH-SATISFY-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_map_fn", "SET-GHL-SEARCH-MAP-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_justifyP", "SET-GHL-SEARCH-JUSTIFY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_search_result", "SET-GHL-SEARCH-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "set_ghl_goal_found_p", "SET-GHL-GOAL-FOUND-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_set_result", "GHL-SET-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_add_node_to_result", "GHL-ADD-NODE-TO-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_add_to_result", "GHL-ADD-TO-RESULT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_append_to_result", "GHL-APPEND-TO-RESULT", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "with_ghl_search_initialized", "WITH-GHL-SEARCH-INITIALIZED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "reinitialize_ghl_spaces", "REINITIALIZE-GHL-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_forward_direction", "GHL-FORWARD-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_backward_direction", "GHL-BACKWARD-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_forward_direction_p", "GHL-FORWARD-DIRECTION-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "do_ghl_relevant_directions", "DO-GHL-RELEVANT-DIRECTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_opposite_direction", "GHL-OPPOSITE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_direction_for_predicate_relation", "GHL-DIRECTION-FOR-PREDICATE-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_fan_out_direction", "GHL-FAN-OUT-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "determine_ghl_relevant_directions", "DETERMINE-GHL-RELEVANT-DIRECTIONS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "with_sksi_gt_search_pred", "WITH-SKSI-GT-SEARCH-PRED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_uses_spec_preds_p", "GHL-USES-SPEC-PREDS-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "with_ghl_spec_pred_use_p", "WITH-GHL-SPEC-PRED-USE-P");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "with_ghl_spec_pred_use", "WITH-GHL-SPEC-PRED-USE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "without_ghl_spec_pred_use", "WITHOUT-GHL-SPEC-PRED-USE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "with_gt_args_unswapped", "WITH-GT-ARGS-UNSWAPPED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "with_gt_args_swapped", "WITH-GT-ARGS-SWAPPED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "gt_args_swapped_p", "GT-ARGS-SWAPPED-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_search_vars", "with_ghl_trace_level", "WITH-GHL-TRACE-LEVEL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_search_vars", "ghl_error", "GHL-ERROR", 2, 5, false);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    public static SubLObject init_ghl_search_vars_file() {
        ghl_search_vars.$ghl_search_property_defaults$ = SubLFiles.deflexical("*GHL-SEARCH-PROPERTY-DEFAULTS*", (SubLObject)ghl_search_vars.$list0);
        ghl_search_vars.$dtp_ghl_search$ = SubLFiles.defconstant("*DTP-GHL-SEARCH*", (SubLObject)ghl_search_vars.$sym1$GHL_SEARCH);
        ghl_search_vars.$sksi_gt_search_pred$ = SubLFiles.defparameter("*SKSI-GT-SEARCH-PRED*", (SubLObject)ghl_search_vars.NIL);
        ghl_search_vars.$ghl_uses_spec_preds_p$ = SubLFiles.defparameter("*GHL-USES-SPEC-PREDS-P*", (SubLObject)ghl_search_vars.T);
        ghl_search_vars.$gt_args_swapped_p$ = SubLFiles.defparameter("*GT-ARGS-SWAPPED-P*", (SubLObject)ghl_search_vars.NIL);
        ghl_search_vars.$ghl_trace_level$ = SubLFiles.defparameter("*GHL-TRACE-LEVEL*", (SubLObject)ghl_search_vars.ONE_INTEGER);
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    public static SubLObject setup_ghl_search_vars_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), ghl_search_vars.$dtp_ghl_search$.getGlobalValue(), Symbols.symbol_function((SubLObject)ghl_search_vars.$sym8$GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)ghl_search_vars.$list9);
        Structures.def_csetf((SubLObject)ghl_search_vars.$sym10$GHL_SEARCH_GRAPHL_SEARCH, (SubLObject)ghl_search_vars.$sym11$_CSETF_GHL_SEARCH_GRAPHL_SEARCH);
        Structures.def_csetf((SubLObject)ghl_search_vars.$sym12$GHL_SEARCH_PREDICATES, (SubLObject)ghl_search_vars.$sym13$_CSETF_GHL_SEARCH_PREDICATES);
        Structures.def_csetf((SubLObject)ghl_search_vars.$sym14$GHL_SEARCH_DIRECTIONS, (SubLObject)ghl_search_vars.$sym15$_CSETF_GHL_SEARCH_DIRECTIONS);
        Structures.def_csetf((SubLObject)ghl_search_vars.$sym16$GHL_SEARCH_TV, (SubLObject)ghl_search_vars.$sym17$_CSETF_GHL_SEARCH_TV);
        Equality.identity((SubLObject)ghl_search_vars.$sym1$GHL_SEARCH);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), ghl_search_vars.$dtp_ghl_search$.getGlobalValue(), Symbols.symbol_function((SubLObject)ghl_search_vars.$sym27$VISIT_DEFSTRUCT_OBJECT_GHL_SEARCH_METHOD));
        return (SubLObject)ghl_search_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_ghl_search_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_ghl_search_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_ghl_search_vars_file();
    }
    
    static {
        me = (SubLFile)new ghl_search_vars();
        ghl_search_vars.$ghl_search_property_defaults$ = null;
        ghl_search_vars.$dtp_ghl_search$ = null;
        ghl_search_vars.$sksi_gt_search_pred$ = null;
        ghl_search_vars.$ghl_uses_spec_preds_p$ = null;
        ghl_search_vars.$gt_args_swapped_p$ = null;
        ghl_search_vars.$ghl_trace_level$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("BREADTH-FIRST")));
        $sym1$GHL_SEARCH = SubLObjectFactory.makeSymbol("GHL-SEARCH");
        $sym2$GHL_SEARCH_P = SubLObjectFactory.makeSymbol("GHL-SEARCH-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GRAPHL-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATES"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GRAPHL-SEARCH"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATES"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("TV"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GHL-SEARCH-GRAPHL-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("GHL-SEARCH-PREDICATES"), (SubLObject)SubLObjectFactory.makeSymbol("GHL-SEARCH-DIRECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("GHL-SEARCH-TV"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GHL-SEARCH-GRAPHL-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GHL-SEARCH-PREDICATES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GHL-SEARCH-DIRECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GHL-SEARCH-TV"));
        $sym7$PRINT_GHL_SEARCH = SubLObjectFactory.makeSymbol("PRINT-GHL-SEARCH");
        $sym8$GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GHL-SEARCH-P"));
        $sym10$GHL_SEARCH_GRAPHL_SEARCH = SubLObjectFactory.makeSymbol("GHL-SEARCH-GRAPHL-SEARCH");
        $sym11$_CSETF_GHL_SEARCH_GRAPHL_SEARCH = SubLObjectFactory.makeSymbol("_CSETF-GHL-SEARCH-GRAPHL-SEARCH");
        $sym12$GHL_SEARCH_PREDICATES = SubLObjectFactory.makeSymbol("GHL-SEARCH-PREDICATES");
        $sym13$_CSETF_GHL_SEARCH_PREDICATES = SubLObjectFactory.makeSymbol("_CSETF-GHL-SEARCH-PREDICATES");
        $sym14$GHL_SEARCH_DIRECTIONS = SubLObjectFactory.makeSymbol("GHL-SEARCH-DIRECTIONS");
        $sym15$_CSETF_GHL_SEARCH_DIRECTIONS = SubLObjectFactory.makeSymbol("_CSETF-GHL-SEARCH-DIRECTIONS");
        $sym16$GHL_SEARCH_TV = SubLObjectFactory.makeSymbol("GHL-SEARCH-TV");
        $sym17$_CSETF_GHL_SEARCH_TV = SubLObjectFactory.makeSymbol("_CSETF-GHL-SEARCH-TV");
        $kw18$GRAPHL_SEARCH = SubLObjectFactory.makeKeyword("GRAPHL-SEARCH");
        $kw19$PREDICATES = SubLObjectFactory.makeKeyword("PREDICATES");
        $kw20$DIRECTIONS = SubLObjectFactory.makeKeyword("DIRECTIONS");
        $kw21$TV = SubLObjectFactory.makeKeyword("TV");
        $str22$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw23$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym24$MAKE_GHL_SEARCH = SubLObjectFactory.makeSymbol("MAKE-GHL-SEARCH");
        $kw25$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw26$END = SubLObjectFactory.makeKeyword("END");
        $sym27$VISIT_DEFSTRUCT_OBJECT_GHL_SEARCH_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GHL-SEARCH-METHOD");
        $str28$GHL_Search____a__ = SubLObjectFactory.makeString("GHL Search : ~a~%");
        $str29$Predicates__a__ = SubLObjectFactory.makeString("Predicates ~a~%");
        $str30$Directions__a__ = SubLObjectFactory.makeString("Directions ~a~%");
        $str31$TV__s__ = SubLObjectFactory.makeString("TV ~s~%");
        $kw32$FREE = SubLObjectFactory.makeKeyword("FREE");
        $kw33$TRANSITIVE_REASONING = SubLObjectFactory.makeKeyword("TRANSITIVE-REASONING");
        $kw34$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list35 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $kw36$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw37$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw38$ORDER = SubLObjectFactory.makeKeyword("ORDER");
        $kw39$CUTOFF = SubLObjectFactory.makeKeyword("CUTOFF");
        $kw40$MARKING = SubLObjectFactory.makeKeyword("MARKING");
        $kw41$MARKING_SPACE = SubLObjectFactory.makeKeyword("MARKING-SPACE");
        $kw42$GOAL = SubLObjectFactory.makeKeyword("GOAL");
        $kw43$GOAL_FN = SubLObjectFactory.makeKeyword("GOAL-FN");
        $kw44$GOAL_SPACE = SubLObjectFactory.makeKeyword("GOAL-SPACE");
        $kw45$SATISFY_FN = SubLObjectFactory.makeKeyword("SATISFY-FN");
        $kw46$MAP_FN = SubLObjectFactory.makeKeyword("MAP-FN");
        $kw47$JUSTIFY_ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $kw48$ADD_TO_RESULT_ = SubLObjectFactory.makeKeyword("ADD-TO-RESULT?");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym50$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym51$NEW_GHL_SEARCH = SubLObjectFactory.makeSymbol("NEW-GHL-SEARCH");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-GRAPHL-FINISHED"));
        $sym53$DESTROY_GHL_SEARCH = SubLObjectFactory.makeSymbol("DESTROY-GHL-SEARCH");
        $kw54$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw55$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE-VAR"));
        $kw58$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw59$DONE_VAR = SubLObjectFactory.makeKeyword("DONE-VAR");
        $sym60$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym61$DETERMINE_GHL_RELEVANT_DIRECTIONS = SubLObjectFactory.makeSymbol("DETERMINE-GHL-RELEVANT-DIRECTIONS");
        $kw62$ACCESSIBLE = SubLObjectFactory.makeKeyword("ACCESSIBLE");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym67$_SKSI_GT_SEARCH_PRED_ = SubLObjectFactory.makeSymbol("*SKSI-GT-SEARCH-PRED*");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USE-EM?"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym69$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym70$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym72$_GHL_USES_SPEC_PREDS_P_ = SubLObjectFactory.makeSymbol("*GHL-USES-SPEC-PREDS-P*");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GHL-USES-SPEC-PREDS-P*"), (SubLObject)ghl_search_vars.T));
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GHL-USES-SPEC-PREDS-P*"), (SubLObject)ghl_search_vars.NIL));
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-ARGS-SWAPPED-P*"), (SubLObject)ghl_search_vars.NIL));
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-ARGS-SWAPPED-P*"), (SubLObject)ghl_search_vars.T));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym78$_GHL_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*GHL-TRACE-LEVEL*");
        $str79$continue_anyway = SubLObjectFactory.makeString("continue anyway");
    }
    
    public static final class $ghl_search_native extends SubLStructNative
    {
        public SubLObject $graphl_search;
        public SubLObject $predicates;
        public SubLObject $directions;
        public SubLObject $tv;
        private static final SubLStructDeclNative structDecl;
        
        public $ghl_search_native() {
            this.$graphl_search = (SubLObject)CommonSymbols.NIL;
            this.$predicates = (SubLObject)CommonSymbols.NIL;
            this.$directions = (SubLObject)CommonSymbols.NIL;
            this.$tv = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ghl_search_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$graphl_search;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$predicates;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$directions;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$tv;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$graphl_search = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$predicates = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$directions = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$tv = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ghl_search_native.class, ghl_search_vars.$sym1$GHL_SEARCH, ghl_search_vars.$sym2$GHL_SEARCH_P, ghl_search_vars.$list3, ghl_search_vars.$list4, new String[] { "$graphl_search", "$predicates", "$directions", "$tv" }, ghl_search_vars.$list5, ghl_search_vars.$list6, ghl_search_vars.$sym7$PRINT_GHL_SEARCH);
        }
    }
    
    public static final class $ghl_search_p$UnaryFunction extends UnaryFunction
    {
        public $ghl_search_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GHL-SEARCH-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return ghl_search_vars.ghl_search_p(arg1);
        }
    }
}

/*

	Total time: 213 ms
	
*/