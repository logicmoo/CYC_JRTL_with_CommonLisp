package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.graphl_graph_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_rtv extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv";
    public static final String myFingerPrint = "369573826563e256567bd8887c61019c08ddac2f7e0b2b22b8cafa89fd6a4aba";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 548L)
    private static SubLSymbol $rtv_asent$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 665L)
    private static SubLSymbol $rtv_asent_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 709L)
    private static SubLSymbol $rtv_term_argnums$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 755L)
    private static SubLSymbol $rtv_var_argnums$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 800L)
    private static SubLSymbol $rtv_asent_set_o_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1090L)
    private static SubLSymbol $rtv_depth_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3575L)
    private static SubLSymbol $rtv_default_search_plist$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4103L)
    private static SubLSymbol $rtv_isa_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4178L)
    private static SubLSymbol $rtv_genls_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4229L)
    private static SubLSymbol $rtv_use_type_constraints_p$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 20096L)
    private static SubLSymbol $default_rtv_cost$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PROGN;
    private static final SubLSymbol $sym2$CHECK_TYPE;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$CLET;
    private static final SubLSymbol $sym5$_RTV_ASENT_SET_O_PREDS_;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$_RTV_DEPTH_CUTOFF_;
    private static final SubLString $str8$No_valid_hl_variable_in_asent____;
    private static final SubLString $str9$No_initial_node_applicable_for_as;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$_RTV_ASENT_;
    private static final SubLSymbol $sym12$_RTV_ASENT_PRED_;
    private static final SubLSymbol $sym13$ATOMIC_SENTENCE_PREDICATE;
    private static final SubLSymbol $sym14$_RTV_TERM_ARGNUMS_;
    private static final SubLSymbol $sym15$DETERMINE_RTV_TERM_ARGNUMS;
    private static final SubLSymbol $sym16$_RTV_VAR_ARGNUMS_;
    private static final SubLSymbol $sym17$DETERMINE_RTV_VAR_ARGNUMS;
    private static final SubLSymbol $sym18$DETERMINE_RTV_ASENT_PREDS;
    private static final SubLSymbol $sym19$DETERMINE_RTV_DEPTH_CUTOFF;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE;
    private static final SubLSymbol $sym23$GETF;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$WITH_GHL_SEARCH_INITIALIZED;
    private static final SubLSymbol $sym26$ADD_RTV_DEFAULT_SEARCH_PROPERTIES;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$RTV_FORMULA;
    private static final SubLSymbol $sym30$VAR;
    private static final SubLSymbol $sym31$FIND_IF;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$FCOND;
    private static final SubLSymbol $sym34$EL_VAR_;
    private static final SubLSymbol $sym35$FORMULA_ARG1;
    private static final SubLSymbol $sym36$FORMULA_ARG2;
    private static final SubLSymbol $sym37$_RTV_ISA_CONSTRAINTS_;
    private static final SubLSymbol $sym38$FIND_RTV_ISA_CONSTRAINTS;
    private static final SubLSymbol $sym39$_RTV_GENLS_CONSTRAINTS_;
    private static final SubLSymbol $sym40$FIND_RTV_GENLS_CONSTRAINTS;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$ISA_CLAUSE_P;
    private static final SubLSymbol $sym43$GENLS_CLAUSE_P;
    private static final SubLObject $const44$relatedToVia;
    private static final SubLObject $const45$isa;
    private static final SubLObject $const46$genls;
    private static final SubLSymbol $sym47$LISTP;
    private static final SubLSymbol $kw48$ORDER;
    private static final SubLSymbol $kw49$DEPTH_FIRST;
    private static final SubLSymbol $kw50$MT;
    private static final SubLSymbol $kw51$PREDICATES;
    private static final SubLSymbol $kw52$CUTOFF;
    private static final SubLList $list53;
    private static final SubLSymbol $kw54$GOAL;
    private static final SubLSymbol $kw55$ITERATIVE_DEEPENING;
    private static final SubLSymbol $kw56$JUSTIFY_;
    private static final SubLSymbol $kw57$ADD_TO_RESULT_;
    private static final SubLSymbol $kw58$EDGES_ON_UNWIND;
    private static final SubLSymbol $kw59$ALL;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$RTV_CLAUSE_P;
    private static final SubLSymbol $kw63$GOAL_FN;
    private static final SubLSymbol $sym64$RTV_NODE_MEETS_CONSTRAINTS_P;
    private static final SubLList $list65;
    private static final SubLObject $const66$genlPreds;
    private static final SubLSymbol $kw67$ASSERTION;
    private static final SubLSymbol $sym68$FIRST;
    private static final SubLObject $const69$genlInverse;
    private static final SubLSymbol $kw70$GENLPREDS;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$RTV;
    private static final SubLSymbol $kw73$REMOVAL_RELATED_TO_VIA_CHECK;
    private static final SubLList $list74;
    private static final SubLSymbol $kw75$REMOVAL_RELATED_TO_VIA_GENERATE;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$POS;
    private static final SubLSymbol $kw78$RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE;
    private static final SubLList $list79;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 852L)
    public static SubLObject with_rtv_asent_set_o_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject preds = (SubLObject)removal_modules_rtv.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rtv.$list0);
        preds = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$sym2$CHECK_TYPE, preds, (SubLObject)removal_modules_rtv.$list3), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym5$_RTV_ASENT_SET_O_PREDS_, preds)), ConsesLow.append(body, (SubLObject)removal_modules_rtv.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1021L)
    public static SubLObject get_rtv_pred_set() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return removal_modules_rtv.$rtv_asent_set_o_preds$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1137L)
    public static SubLObject get_rtv_depth_cutoff() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return removal_modules_rtv.$rtv_depth_cutoff$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1205L)
    public static SubLObject with_rtv_depth_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject depth = (SubLObject)removal_modules_rtv.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rtv.$list6);
        depth = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym7$_RTV_DEPTH_CUTOFF_, depth)), ConsesLow.append(body, (SubLObject)removal_modules_rtv.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1337L)
    public static SubLObject determine_rtv_term_argnums(final SubLObject asent) {
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(el_utilities.formula_length(asent, (SubLObject)removal_modules_rtv.UNPROVIDED), (SubLObject)removal_modules_rtv.UNPROVIDED).rest();
        SubLObject num = (SubLObject)removal_modules_rtv.NIL;
        num = cdolist_list_var.first();
        while (removal_modules_rtv.NIL != cdolist_list_var) {
            if (removal_modules_rtv.NIL == cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, (SubLObject)removal_modules_rtv.UNPROVIDED))) {
                result = (SubLObject)ConsesLow.cons(num, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1661L)
    public static SubLObject determine_rtv_var_argnums(final SubLObject asent) {
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        SubLObject cdolist_list_var = list_utilities.num_list(el_utilities.formula_length(asent, (SubLObject)removal_modules_rtv.UNPROVIDED), (SubLObject)removal_modules_rtv.UNPROVIDED).rest();
        SubLObject num = (SubLObject)removal_modules_rtv.NIL;
        num = cdolist_list_var.first();
        while (removal_modules_rtv.NIL != cdolist_list_var) {
            if (removal_modules_rtv.NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, num, (SubLObject)removal_modules_rtv.UNPROVIDED))) {
                result = (SubLObject)ConsesLow.cons(num, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 1989L)
    public static SubLObject get_rtv_var_arg(final SubLObject asent) {
        if (removal_modules_rtv.NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.ONE_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.ONE_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED);
        }
        if (removal_modules_rtv.NIL != cycl_grammar.hl_variable_p(cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.TWO_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED))) {
            return cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.TWO_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED);
        }
        ghl_search_vars.ghl_error((SubLObject)removal_modules_rtv.$str8$No_valid_hl_variable_in_asent____, asent, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED);
        return (SubLObject)removal_modules_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 2293L)
    public static SubLObject determine_rtv_asent_preds(final SubLObject asent) {
        return cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.THREE_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED), (SubLObject)removal_modules_rtv.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 2394L)
    public static SubLObject determine_rtv_depth_cutoff(final SubLObject asent) {
        return cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.FOUR_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 2485L)
    public static SubLObject determine_rtv_initial_node(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_rtv.NIL != subl_promotions.memberP((SubLObject)removal_modules_rtv.ONE_INTEGER, removal_modules_rtv.$rtv_term_argnums$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED) && removal_modules_rtv.NIL != subl_promotions.memberP((SubLObject)removal_modules_rtv.TWO_INTEGER, removal_modules_rtv.$rtv_var_argnums$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
            return cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.ONE_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED);
        }
        if (removal_modules_rtv.NIL != subl_promotions.memberP((SubLObject)removal_modules_rtv.TWO_INTEGER, removal_modules_rtv.$rtv_term_argnums$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED) && removal_modules_rtv.NIL != subl_promotions.memberP((SubLObject)removal_modules_rtv.ONE_INTEGER, removal_modules_rtv.$rtv_var_argnums$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
            return cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.TWO_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED);
        }
        if (removal_modules_rtv.NIL != subl_promotions.memberP((SubLObject)removal_modules_rtv.ONE_INTEGER, removal_modules_rtv.$rtv_term_argnums$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED) && removal_modules_rtv.NIL != subl_promotions.memberP((SubLObject)removal_modules_rtv.TWO_INTEGER, removal_modules_rtv.$rtv_term_argnums$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
            return cycl_utilities.atomic_sentence_arg(asent, (SubLObject)removal_modules_rtv.ONE_INTEGER, (SubLObject)removal_modules_rtv.UNPROVIDED);
        }
        Errors.error((SubLObject)removal_modules_rtv.$str9$No_initial_node_applicable_for_as, asent);
        return (SubLObject)removal_modules_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3002L)
    public static SubLObject determine_rtv_goal(final SubLObject asent) {
        return conses_high.third(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3072L)
    public static SubLObject bind_rtv_asent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject asent = (SubLObject)removal_modules_rtv.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rtv.$list10);
        asent = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym11$_RTV_ASENT_, asent), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym12$_RTV_ASENT_PRED_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym13$ATOMIC_SENTENCE_PREDICATE, asent)), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym14$_RTV_TERM_ARGNUMS_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym15$DETERMINE_RTV_TERM_ARGNUMS, asent)), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym16$_RTV_VAR_ARGNUMS_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym17$DETERMINE_RTV_VAR_ARGNUMS, asent)), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym5$_RTV_ASENT_SET_O_PREDS_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym18$DETERMINE_RTV_ASENT_PREDS, asent)), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym7$_RTV_DEPTH_CUTOFF_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym19$DETERMINE_RTV_DEPTH_CUTOFF, asent))), ConsesLow.append(body, (SubLObject)removal_modules_rtv.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3743L)
    public static SubLObject add_rtv_default_search_properties(final SubLObject plist) {
        return ConsesLow.append(removal_modules_rtv.$rtv_default_search_plist$.getGlobalValue(), plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 3853L)
    public static SubLObject with_rtv_search_initialized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_search = (SubLObject)removal_modules_rtv.NIL;
        SubLObject plist = (SubLObject)removal_modules_rtv.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rtv.$list21);
        v_search = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rtv.$list21);
        plist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym22$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$sym23$GETF, plist, (SubLObject)removal_modules_rtv.$list24), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$sym25$WITH_GHL_SEARCH_INITIALIZED, v_search, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym26$ADD_RTV_DEFAULT_SEARCH_PROPERTIES, plist), ConsesLow.append(body, (SubLObject)removal_modules_rtv.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4285L)
    public static SubLObject with_new_rtv_type_constraints(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$sym4$CLET, (SubLObject)removal_modules_rtv.$list27, ConsesLow.append(body, (SubLObject)removal_modules_rtv.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 4483L)
    public static SubLObject with_rtv_constraints_from_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject formula = (SubLObject)removal_modules_rtv.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rtv.$list28);
        formula = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject rtv_formula = (SubLObject)removal_modules_rtv.$sym29$RTV_FORMULA;
        final SubLObject var = (SubLObject)removal_modules_rtv.$sym30$VAR;
        return (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rtv_formula, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym31$FIND_IF, (SubLObject)removal_modules_rtv.$list32, formula)), (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym33$FCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym34$EL_VAR_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym35$FORMULA_ARG1, rtv_formula)), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym35$FORMULA_ARG1, rtv_formula)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym34$EL_VAR_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym36$FORMULA_ARG2, rtv_formula)), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym36$FORMULA_ARG2, rtv_formula)))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym37$_RTV_ISA_CONSTRAINTS_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym38$FIND_RTV_ISA_CONSTRAINTS, formula, var)), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym39$_RTV_GENLS_CONSTRAINTS_, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rtv.$sym40$FIND_RTV_GENLS_CONSTRAINTS, formula, var))), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$sym4$CLET, (SubLObject)removal_modules_rtv.$list41, ConsesLow.append(body, (SubLObject)removal_modules_rtv.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5086L)
    public static SubLObject find_rtv_isa_constraints(final SubLObject formula, final SubLObject var) {
        final SubLObject isa_clauses = list_utilities.tree_find_all_if((SubLObject)removal_modules_rtv.$sym42$ISA_CLAUSE_P, formula, (SubLObject)removal_modules_rtv.UNPROVIDED);
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        SubLObject cdolist_list_var = isa_clauses;
        SubLObject isa_clause = (SubLObject)removal_modules_rtv.NIL;
        isa_clause = cdolist_list_var.first();
        while (removal_modules_rtv.NIL != cdolist_list_var) {
            if (removal_modules_rtv.NIL == var || cycl_utilities.formula_arg1(isa_clause, (SubLObject)removal_modules_rtv.UNPROVIDED).eql(var)) {
                final SubLObject col = cycl_utilities.formula_arg2(isa_clause, (SubLObject)removal_modules_rtv.UNPROVIDED);
                if (removal_modules_rtv.NIL != forts.fort_p(col)) {
                    result = (SubLObject)ConsesLow.cons(col, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_clause = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5429L)
    public static SubLObject find_rtv_genls_constraints(final SubLObject formula, final SubLObject var) {
        final SubLObject genls_clauses = list_utilities.tree_find_all_if((SubLObject)removal_modules_rtv.$sym43$GENLS_CLAUSE_P, formula, (SubLObject)removal_modules_rtv.UNPROVIDED);
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        SubLObject cdolist_list_var = genls_clauses;
        SubLObject genls_clause = (SubLObject)removal_modules_rtv.NIL;
        genls_clause = cdolist_list_var.first();
        while (removal_modules_rtv.NIL != cdolist_list_var) {
            if (removal_modules_rtv.NIL == var || cycl_utilities.formula_arg1(genls_clause, (SubLObject)removal_modules_rtv.UNPROVIDED).eql(var)) {
                final SubLObject col = cycl_utilities.formula_arg2(genls_clause, (SubLObject)removal_modules_rtv.UNPROVIDED);
                if (removal_modules_rtv.NIL != forts.fort_p(col)) {
                    result = (SubLObject)ConsesLow.cons(col, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genls_clause = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5786L)
    public static SubLObject rtv_clause_p(final SubLObject formula) {
        return Equality.eql(cycl_utilities.formula_arg0(formula), removal_modules_rtv.$const44$relatedToVia);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5879L)
    public static SubLObject isa_clause_p(final SubLObject formula) {
        return Equality.eql(cycl_utilities.formula_arg0(formula), removal_modules_rtv.$const45$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 5963L)
    public static SubLObject genls_clause_p(final SubLObject formula) {
        return Equality.eql(cycl_utilities.formula_arg0(formula), removal_modules_rtv.$const46$genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6051L)
    public static SubLObject rtv_use_type_constraints_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return removal_modules_rtv.$rtv_use_type_constraints_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6138L)
    public static SubLObject rtv_node_meets_constraints_p(final SubLObject v_search, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)removal_modules_rtv.T;
        if (removal_modules_rtv.NIL != removal_modules_rtv.$rtv_isa_constraints$.getDynamicValue(thread) && removal_modules_rtv.NIL == isa.isa_anyP(node, removal_modules_rtv.$rtv_isa_constraints$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
            successP = (SubLObject)removal_modules_rtv.NIL;
        }
        if (removal_modules_rtv.NIL != removal_modules_rtv.$rtv_genls_constraints$.getDynamicValue(thread) && removal_modules_rtv.NIL == genls.any_genlP(node, removal_modules_rtv.$rtv_genls_constraints$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
            successP = (SubLObject)removal_modules_rtv.NIL;
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6564L)
    public static SubLObject get_rtv_inference_node_constraints() {
        return (SubLObject)removal_modules_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6709L)
    public static SubLObject rtv_type_litP(final SubLObject literal) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rtv.NIL != generate_instance_litP(literal) || removal_modules_rtv.NIL != generate_spec_litP(literal));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6832L)
    public static SubLObject generate_spec_litP(final SubLObject literal) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rtv.NIL != el_utilities.genls_litP(literal) && removal_modules_rtv.NIL != variables.variable_p(cycl_utilities.formula_arg1(literal, (SubLObject)removal_modules_rtv.UNPROVIDED)) && removal_modules_rtv.NIL != forts.fort_p(cycl_utilities.formula_arg2(literal, (SubLObject)removal_modules_rtv.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 6995L)
    public static SubLObject generate_instance_litP(final SubLObject literal) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rtv.NIL != el_utilities.isa_litP(literal) && removal_modules_rtv.NIL != variables.variable_p(cycl_utilities.formula_arg1(literal, (SubLObject)removal_modules_rtv.UNPROVIDED)) && removal_modules_rtv.NIL != forts.fort_p(cycl_utilities.formula_arg2(literal, (SubLObject)removal_modules_rtv.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 7160L)
    public static SubLObject rtv_closure(final SubLObject node, final SubLObject pred_set, final SubLObject depth, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw49$DEPTH_FIRST, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, depth, removal_modules_rtv.$list53 }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw49$DEPTH_FIRST, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, depth, removal_modules_rtv.$list53 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 7707L)
    public static SubLObject rtv_closure_filtered(final SubLObject node, final SubLObject pred_set, final SubLObject test_fn, final SubLObject depth, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        return list_utilities.remove_if_not(test_fn, rtv_closure(node, pred_set, depth, mt), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 8137L)
    public static SubLObject rtv_path_p(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject depth, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rtv.$kw48$ORDER, removal_modules_rtv.$kw49$DEPTH_FIRST, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, depth, removal_modules_rtv.$kw54$GOAL, goal_node }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rtv.$kw48$ORDER, removal_modules_rtv.$kw49$DEPTH_FIRST, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, depth, removal_modules_rtv.$kw54$GOAL, goal_node })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
            }
        }
        finally {
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 8613L)
    public static SubLObject rtv_justify_relation(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject depth, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind((SubLObject)removal_modules_rtv.T, thread);
            assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
            final SubLObject _prev_bind_0_$3 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
            try {
                removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
                final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rtv.$kw48$ORDER, removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, depth, removal_modules_rtv.$kw56$JUSTIFY_, removal_modules_rtv.T, removal_modules_rtv.$kw57$ADD_TO_RESULT_, removal_modules_rtv.$kw58$EDGES_ON_UNWIND, removal_modules_rtv.$kw54$GOAL, goal_node }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rtv.$kw48$ORDER, removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, depth, removal_modules_rtv.$kw56$JUSTIFY_, removal_modules_rtv.T, removal_modules_rtv.$kw57$ADD_TO_RESULT_, removal_modules_rtv.$kw58$EDGES_ON_UNWIND, removal_modules_rtv.$kw54$GOAL, goal_node })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, start_node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                }
            }
            finally {
                removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 9361L)
    public static SubLObject rtv_justify_relation_union_all(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject depth, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind((SubLObject)removal_modules_rtv.T, thread);
            assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
            final SubLObject _prev_bind_0_$5 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
            try {
                removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
                final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rtv.$kw48$ORDER, removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, depth, removal_modules_rtv.$kw56$JUSTIFY_, removal_modules_rtv.$kw59$ALL, removal_modules_rtv.$kw57$ADD_TO_RESULT_, removal_modules_rtv.$kw58$EDGES_ON_UNWIND, removal_modules_rtv.$kw54$GOAL, goal_node }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rtv.$kw48$ORDER, removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, depth, removal_modules_rtv.$kw56$JUSTIFY_, removal_modules_rtv.$kw59$ALL, removal_modules_rtv.$kw57$ADD_TO_RESULT_, removal_modules_rtv.$kw58$EDGES_ON_UNWIND, removal_modules_rtv.$kw54$GOAL, goal_node })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, start_node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$6, thread);
                }
            }
            finally {
                removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0_$5, thread);
            }
        }
        finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 10126L)
    public static SubLObject rtv_all_nodes_from_node(final SubLObject node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        return list_utilities.fast_delete_duplicates(rtv_closure(node, pred_set, length, mt), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 10434L)
    public static SubLObject rtv_all_edges_from_node(final SubLObject node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$list60 }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$list60 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
            }
        }
        finally {
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 10967L)
    public static SubLObject rtv_paths_covering_node_closure(final SubLObject node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        return rtv_all_edges_from_node(node, pred_set, length, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 11302L)
    public static SubLObject rtv_one_path(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        return rtv_justify_relation(start_node, goal_node, pred_set, length, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 11602L)
    public static SubLObject rtv_all_edges_from_node_to_node(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$kw54$GOAL, goal_node, removal_modules_rtv.$list61 }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$kw54$GOAL, goal_node, removal_modules_rtv.$list61 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
            }
        }
        finally {
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 12338L)
    public static SubLObject rtv_all_edges_from_node_to_node_expanded(final SubLObject start_node, final SubLObject goal_node, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLObject exemplars = rtv_all_edges_from_node_to_node(start_node, goal_node, pred_set, length, mt);
        return rtv_add_alternate_edges_to_exemplars(exemplars, pred_set, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 12826L)
    public static SubLObject rtv_add_alternate_edges_to_exemplars(final SubLObject exemplars, final SubLObject pred_set, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLObject included_set = set_utilities.make_set_from_list(exemplars, (SubLObject)removal_modules_rtv.UNPROVIDED);
        SubLObject alternates = (SubLObject)removal_modules_rtv.NIL;
        SubLObject cdolist_list_var = exemplars;
        SubLObject exemplar = (SubLObject)removal_modules_rtv.NIL;
        exemplar = cdolist_list_var.first();
        while (removal_modules_rtv.NIL != cdolist_list_var) {
            final SubLObject node_1 = assertions_high.gaf_arg1(exemplar);
            final SubLObject node_2 = assertions_high.gaf_arg2(exemplar);
            SubLObject cdolist_list_var_$9 = pred_set;
            SubLObject pred = (SubLObject)removal_modules_rtv.NIL;
            pred = cdolist_list_var_$9.first();
            while (removal_modules_rtv.NIL != cdolist_list_var_$9) {
                SubLObject cdolist_list_var_$10;
                final SubLObject candidates = cdolist_list_var_$10 = rtv_all_edges_from_node_to_node(node_1, node_2, (SubLObject)ConsesLow.list(pred), (SubLObject)removal_modules_rtv.ONE_INTEGER, mt);
                SubLObject candidate = (SubLObject)removal_modules_rtv.NIL;
                candidate = cdolist_list_var_$10.first();
                while (removal_modules_rtv.NIL != cdolist_list_var_$10) {
                    if (removal_modules_rtv.NIL == set.set_memberP(candidate, included_set)) {
                        set.set_add(candidate, included_set);
                        alternates = (SubLObject)ConsesLow.cons(candidate, alternates);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    candidate = cdolist_list_var_$10.first();
                }
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                pred = cdolist_list_var_$9.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            exemplar = cdolist_list_var.first();
        }
        final SubLObject expanded = ConsesLow.nconc(exemplars, Sequences.nreverse(alternates));
        return expanded;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 13464L)
    public static SubLObject rtv_all_edges_from_node_to_nodes(final SubLObject start_node, final SubLObject goal_nodes, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$kw54$GOAL, goal_nodes, removal_modules_rtv.$list61 }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$kw54$GOAL, goal_nodes, removal_modules_rtv.$list61 })));
                graphl_graph_utilities.reset_graphl_finished();
                ghl_search_methods.ghl_search(v_search, start_node);
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$11, thread);
            }
        }
        finally {
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 14834L)
    public static SubLObject rtv_all_edges_from_node_to_nodes_expanded(final SubLObject start_node, final SubLObject goal_nodes, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLObject exemplars = rtv_all_edges_from_node_to_nodes(start_node, goal_nodes, pred_set, length, mt);
        return rtv_add_alternate_edges_to_exemplars(exemplars, pred_set, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 15327L)
    public static SubLObject rtv_all_edges_from_node_to_nodes_satisfying(final SubLObject node, final SubLObject test_formula, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject rtv_formula = Sequences.find_if((SubLObject)removal_modules_rtv.$sym62$RTV_CLAUSE_P, test_formula, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED);
            final SubLObject var = (SubLObject)((removal_modules_rtv.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_formula, (SubLObject)removal_modules_rtv.UNPROVIDED))) ? cycl_utilities.formula_arg1(rtv_formula, (SubLObject)removal_modules_rtv.UNPROVIDED) : ((removal_modules_rtv.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_formula, (SubLObject)removal_modules_rtv.UNPROVIDED))) ? cycl_utilities.formula_arg2(rtv_formula, (SubLObject)removal_modules_rtv.UNPROVIDED) : removal_modules_rtv.NIL));
            final SubLObject _prev_bind_0_$12 = removal_modules_rtv.$rtv_isa_constraints$.currentBinding(thread);
            final SubLObject _prev_bind_2 = removal_modules_rtv.$rtv_genls_constraints$.currentBinding(thread);
            final SubLObject _prev_bind_3 = removal_modules_rtv.$rtv_use_type_constraints_p$.currentBinding(thread);
            try {
                removal_modules_rtv.$rtv_isa_constraints$.bind(find_rtv_isa_constraints(test_formula, var), thread);
                removal_modules_rtv.$rtv_genls_constraints$.bind(find_rtv_genls_constraints(test_formula, var), thread);
                removal_modules_rtv.$rtv_use_type_constraints_p$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rtv.NIL != removal_modules_rtv.$rtv_isa_constraints$.getDynamicValue(thread) || removal_modules_rtv.NIL != removal_modules_rtv.$rtv_genls_constraints$.getDynamicValue(thread)), thread);
                final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw63$GOAL_FN, removal_modules_rtv.$sym64$RTV_NODE_MEETS_CONSTRAINTS_P, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$list65 }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$15 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw63$GOAL_FN, removal_modules_rtv.$sym64$RTV_NODE_MEETS_CONSTRAINTS_P, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$list65 })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$15, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$14, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$13, thread);
                }
            }
            finally {
                removal_modules_rtv.$rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
                removal_modules_rtv.$rtv_genls_constraints$.rebind(_prev_bind_2, thread);
                removal_modules_rtv.$rtv_isa_constraints$.rebind(_prev_bind_0_$12, thread);
            }
        }
        finally {
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 16057L)
    public static SubLObject rtv_all_edges_from_node_to_goal_nodes_satisfying(final SubLObject node, final SubLObject goal_nodes, final SubLObject test_formula, final SubLObject pred_set, final SubLObject length, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        assert removal_modules_rtv.NIL != Types.listp(pred_set) : pred_set;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(pred_set, thread);
            final SubLObject rtv_formula = Sequences.find_if((SubLObject)removal_modules_rtv.$sym62$RTV_CLAUSE_P, test_formula, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED);
            final SubLObject var = (SubLObject)((removal_modules_rtv.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_formula, (SubLObject)removal_modules_rtv.UNPROVIDED))) ? cycl_utilities.formula_arg1(rtv_formula, (SubLObject)removal_modules_rtv.UNPROVIDED) : ((removal_modules_rtv.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_formula, (SubLObject)removal_modules_rtv.UNPROVIDED))) ? cycl_utilities.formula_arg2(rtv_formula, (SubLObject)removal_modules_rtv.UNPROVIDED) : removal_modules_rtv.NIL));
            final SubLObject _prev_bind_0_$16 = removal_modules_rtv.$rtv_isa_constraints$.currentBinding(thread);
            final SubLObject _prev_bind_2 = removal_modules_rtv.$rtv_genls_constraints$.currentBinding(thread);
            final SubLObject _prev_bind_3 = removal_modules_rtv.$rtv_use_type_constraints_p$.currentBinding(thread);
            try {
                removal_modules_rtv.$rtv_isa_constraints$.bind(find_rtv_isa_constraints(test_formula, var), thread);
                removal_modules_rtv.$rtv_genls_constraints$.bind(find_rtv_genls_constraints(test_formula, var), thread);
                removal_modules_rtv.$rtv_use_type_constraints_p$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rtv.NIL != removal_modules_rtv.$rtv_isa_constraints$.getDynamicValue(thread) || removal_modules_rtv.NIL != removal_modules_rtv.$rtv_genls_constraints$.getDynamicValue(thread)), thread);
                final SubLObject mt_var = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw63$GOAL_FN, removal_modules_rtv.$sym64$RTV_NODE_MEETS_CONSTRAINTS_P, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$kw54$GOAL, goal_nodes, removal_modules_rtv.$list65 }), (SubLObject)removal_modules_rtv.$kw50$MT, (SubLObject)removal_modules_rtv.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$19 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(add_rtv_default_search_properties((SubLObject)ConsesLow.listS((SubLObject)removal_modules_rtv.$kw48$ORDER, new SubLObject[] { removal_modules_rtv.$kw55$ITERATIVE_DEEPENING, removal_modules_rtv.$kw50$MT, mt, removal_modules_rtv.$kw51$PREDICATES, pred_set, removal_modules_rtv.$kw63$GOAL_FN, removal_modules_rtv.$sym64$RTV_NODE_MEETS_CONSTRAINTS_P, removal_modules_rtv.$kw52$CUTOFF, length, removal_modules_rtv.$kw54$GOAL, goal_nodes, removal_modules_rtv.$list65 })));
                    graphl_graph_utilities.reset_graphl_finished();
                    ghl_search_methods.ghl_search(v_search, node);
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$19, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$18, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$17, thread);
                }
            }
            finally {
                removal_modules_rtv.$rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
                removal_modules_rtv.$rtv_genls_constraints$.rebind(_prev_bind_2, thread);
                removal_modules_rtv.$rtv_isa_constraints$.rebind(_prev_bind_0_$16, thread);
            }
        }
        finally {
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 16707L)
    public static SubLObject all_edges_subsumed_by_preds(final SubLObject preds, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)removal_modules_rtv.NIL;
        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_justification_result$.bind((SubLObject)removal_modules_rtv.NIL, thread);
            try {
                sbhl_search_methods.sbhl_union_simply_all_backward_true_edges(sbhl_module_vars.get_sbhl_module(removal_modules_rtv.$const66$genlPreds), preds, mt, (SubLObject)removal_modules_rtv.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_rtv.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    just = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            sbhl_search_vars.$sbhl_justification_result$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = sbhl_search_vars.$sbhl_justification_behavior$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_justification_behavior$.bind((SubLObject)removal_modules_rtv.$kw67$ASSERTION, thread);
            just = sbhl_search_utilities.sbhl_assemble_justification(just, (SubLObject)removal_modules_rtv.UNPROVIDED);
        }
        finally {
            sbhl_search_vars.$sbhl_justification_behavior$.rebind(_prev_bind_0, thread);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 17126L)
    public static SubLObject inference_rtv_check(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_rtv.$rtv_asent_pred$.currentBinding(thread);
        final SubLObject _prev_bind_3 = removal_modules_rtv.$rtv_term_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_4 = removal_modules_rtv.$rtv_var_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_5 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        final SubLObject _prev_bind_6 = removal_modules_rtv.$rtv_depth_cutoff$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent$.bind(asent, thread);
            removal_modules_rtv.$rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            removal_modules_rtv.$rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            removal_modules_rtv.$rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            removal_modules_rtv.$rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            result = rtv_path_p(determine_rtv_initial_node(asent), determine_rtv_goal(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        }
        finally {
            removal_modules_rtv.$rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            removal_modules_rtv.$rtv_var_argnums$.rebind(_prev_bind_4, thread);
            removal_modules_rtv.$rtv_term_argnums$.rebind(_prev_bind_3, thread);
            removal_modules_rtv.$rtv_asent_pred$.rebind(_prev_bind_2, thread);
            removal_modules_rtv.$rtv_asent$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 17636L)
    public static SubLObject inference_rtv_unify(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_rtv.$rtv_asent_pred$.currentBinding(thread);
        final SubLObject _prev_bind_3 = removal_modules_rtv.$rtv_term_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_4 = removal_modules_rtv.$rtv_var_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_5 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        final SubLObject _prev_bind_6 = removal_modules_rtv.$rtv_depth_cutoff$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent$.bind(asent, thread);
            removal_modules_rtv.$rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            removal_modules_rtv.$rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            removal_modules_rtv.$rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            removal_modules_rtv.$rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            result = rtv_closure(determine_rtv_initial_node(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        }
        finally {
            removal_modules_rtv.$rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            removal_modules_rtv.$rtv_var_argnums$.rebind(_prev_bind_4, thread);
            removal_modules_rtv.$rtv_term_argnums$.rebind(_prev_bind_3, thread);
            removal_modules_rtv.$rtv_asent_pred$.rebind(_prev_bind_2, thread);
            removal_modules_rtv.$rtv_asent$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 17978L)
    public static SubLObject inference_rtv_justify(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)removal_modules_rtv.NIL;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_asent$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_rtv.$rtv_asent_pred$.currentBinding(thread);
        final SubLObject _prev_bind_3 = removal_modules_rtv.$rtv_term_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_4 = removal_modules_rtv.$rtv_var_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_5 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        final SubLObject _prev_bind_6 = removal_modules_rtv.$rtv_depth_cutoff$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_asent$.bind(asent, thread);
            removal_modules_rtv.$rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            removal_modules_rtv.$rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            removal_modules_rtv.$rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            removal_modules_rtv.$rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            just = rtv_justify_relation(determine_rtv_initial_node(asent), determine_rtv_goal(asent), get_rtv_pred_set(), get_rtv_depth_cutoff(), mt);
        }
        finally {
            removal_modules_rtv.$rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
            removal_modules_rtv.$rtv_var_argnums$.rebind(_prev_bind_4, thread);
            removal_modules_rtv.$rtv_term_argnums$.rebind(_prev_bind_3, thread);
            removal_modules_rtv.$rtv_asent_pred$.rebind(_prev_bind_2, thread);
            removal_modules_rtv.$rtv_asent$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_rtv.NIL != just) {
            just = rtv_add_genl_predicate_justs(just, asent, mt);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 18400L)
    public static SubLObject inference_rtv_max_floor_mts(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        return list_utilities.fast_delete_duplicates(Mapping.mapcan(Symbols.symbol_function((SubLObject)removal_modules_rtv.$sym68$FIRST), forward.compute_all_mt_and_support_combinations(inference_rtv_justify(asent, mt), (SubLObject)removal_modules_rtv.UNPROVIDED), removal_modules_rtv.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 18594L)
    public static SubLObject rtv_add_genl_predicate_justs(final SubLObject just, final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_rtv.UNPROVIDED) {
            mt = (SubLObject)removal_modules_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = just;
        SubLObject justified = (SubLObject)removal_modules_rtv.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = removal_modules_rtv.$rtv_asent$.currentBinding(thread);
        final SubLObject _prev_bind_5 = removal_modules_rtv.$rtv_asent_pred$.currentBinding(thread);
        final SubLObject _prev_bind_6 = removal_modules_rtv.$rtv_term_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_7 = removal_modules_rtv.$rtv_var_argnums$.currentBinding(thread);
        final SubLObject _prev_bind_8 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
        final SubLObject _prev_bind_9 = removal_modules_rtv.$rtv_depth_cutoff$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            removal_modules_rtv.$rtv_asent$.bind(asent, thread);
            removal_modules_rtv.$rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
            removal_modules_rtv.$rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
            removal_modules_rtv.$rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
            removal_modules_rtv.$rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
            removal_modules_rtv.$rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
            SubLObject cdolist_list_var = just;
            SubLObject just_ass = (SubLObject)removal_modules_rtv.NIL;
            just_ass = cdolist_list_var.first();
            while (removal_modules_rtv.NIL != cdolist_list_var) {
                if (removal_modules_rtv.NIL != assertions_high.gaf_assertionP(just_ass)) {
                    final SubLObject just_pred = assertions_high.gaf_arg0(just_ass);
                    if (removal_modules_rtv.NIL == subl_promotions.memberP(just_pred, get_rtv_pred_set(), (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED) && removal_modules_rtv.NIL == subl_promotions.memberP(just_pred, justified, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
                        SubLObject formula = (SubLObject)removal_modules_rtv.NIL;
                        if (removal_modules_rtv.NIL == formula) {
                            SubLObject csome_list_var = get_rtv_pred_set();
                            SubLObject rtv_pred = (SubLObject)removal_modules_rtv.NIL;
                            rtv_pred = csome_list_var.first();
                            while (removal_modules_rtv.NIL == formula && removal_modules_rtv.NIL != csome_list_var) {
                                if (removal_modules_rtv.NIL != genl_predicates.genl_predicateP(just_pred, rtv_pred, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
                                    formula = (SubLObject)ConsesLow.list(removal_modules_rtv.$const66$genlPreds, just_pred, rtv_pred);
                                }
                                else if (removal_modules_rtv.NIL != genl_predicates.genl_inverseP(just_pred, rtv_pred, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
                                    formula = (SubLObject)ConsesLow.list(removal_modules_rtv.$const69$genlInverse, just_pred, rtv_pred);
                                }
                                csome_list_var = csome_list_var.rest();
                                rtv_pred = csome_list_var.first();
                            }
                        }
                        if (removal_modules_rtv.NIL != formula) {
                            justified = (SubLObject)ConsesLow.cons(just_pred, justified);
                            result = ConsesLow.append(result, (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_rtv.$kw70$GENLPREDS, formula, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_rtv.UNPROVIDED)));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                just_ass = cdolist_list_var.first();
            }
        }
        finally {
            removal_modules_rtv.$rtv_depth_cutoff$.rebind(_prev_bind_9, thread);
            removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_8, thread);
            removal_modules_rtv.$rtv_var_argnums$.rebind(_prev_bind_7, thread);
            removal_modules_rtv.$rtv_term_argnums$.rebind(_prev_bind_6, thread);
            removal_modules_rtv.$rtv_asent_pred$.rebind(_prev_bind_5, thread);
            removal_modules_rtv.$rtv_asent$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 19463L)
    public static SubLObject removal_rtv_required(final SubLObject asent) {
        SubLObject pred = (SubLObject)removal_modules_rtv.NIL;
        SubLObject arg1 = (SubLObject)removal_modules_rtv.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_rtv.NIL;
        SubLObject sop = (SubLObject)removal_modules_rtv.NIL;
        SubLObject num = (SubLObject)removal_modules_rtv.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(asent, asent, (SubLObject)removal_modules_rtv.$list71);
        pred = asent.first();
        SubLObject current = asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, (SubLObject)removal_modules_rtv.$list71);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, (SubLObject)removal_modules_rtv.$list71);
        arg2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, (SubLObject)removal_modules_rtv.$list71);
        sop = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, (SubLObject)removal_modules_rtv.$list71);
        num = current.first();
        current = current.rest();
        if (removal_modules_rtv.NIL == current) {
            if (removal_modules_rtv.NIL == subl_promotions.non_negative_integer_p(num)) {
                return (SubLObject)removal_modules_rtv.NIL;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(asent, (SubLObject)removal_modules_rtv.$list71);
        }
        return (SubLObject)removal_modules_rtv.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 19818L)
    public static SubLObject make_rtv_support(final SubLObject asent) {
        return arguments.make_hl_support((SubLObject)removal_modules_rtv.$kw72$RTV, asent, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 19946L)
    public static SubLObject removal_rtv_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rtv.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rtv.NIL;
        }
        return removal_rtv_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 20170L)
    public static SubLObject removal_rtv_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rtv.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rtv.NIL;
        }
        if (removal_modules_rtv.NIL != inference_rtv_check(asent, (SubLObject)removal_modules_rtv.UNPROVIDED)) {
            final SubLObject hl_support = make_rtv_support(asent);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_rtv.UNPROVIDED, (SubLObject)removal_modules_rtv.UNPROVIDED);
        }
        return (SubLObject)removal_modules_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 20971L)
    public static SubLObject removal_rtv_generate_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rtv.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rtv.NIL;
        }
        return removal_rtv_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 21130L)
    public static SubLObject removal_rtv_generate_iterator(final SubLObject asent) {
        final SubLObject constraints = get_rtv_inference_node_constraints();
        SubLObject unified_terms = (SubLObject)removal_modules_rtv.NIL;
        if (removal_modules_rtv.NIL != constraints) {
            unified_terms = inference_rtv_constrained_unify(asent, constraints);
        }
        else {
            unified_terms = inference_rtv_unify(asent, (SubLObject)removal_modules_rtv.UNPROVIDED);
        }
        return iteration.new_list_iterator(unified_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rtv.lisp", position = 21682L)
    public static SubLObject inference_rtv_constrained_unify(final SubLObject asent, final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_rtv.NIL;
        final SubLObject _prev_bind_0 = removal_modules_rtv.$rtv_isa_constraints$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_rtv.$rtv_genls_constraints$.currentBinding(thread);
        final SubLObject _prev_bind_3 = removal_modules_rtv.$rtv_use_type_constraints_p$.currentBinding(thread);
        try {
            removal_modules_rtv.$rtv_isa_constraints$.bind((SubLObject)removal_modules_rtv.NIL, thread);
            removal_modules_rtv.$rtv_genls_constraints$.bind((SubLObject)removal_modules_rtv.NIL, thread);
            removal_modules_rtv.$rtv_use_type_constraints_p$.bind((SubLObject)removal_modules_rtv.T, thread);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = (SubLObject)removal_modules_rtv.NIL;
            constraint = cdolist_list_var.first();
            while (removal_modules_rtv.NIL != cdolist_list_var) {
                final SubLObject pred = cycl_utilities.formula_arg0(constraint);
                final SubLObject col = cycl_utilities.formula_arg2(constraint, (SubLObject)removal_modules_rtv.UNPROVIDED);
                final SubLObject pcase_var = pred;
                if (pcase_var.eql(removal_modules_rtv.$const45$isa)) {
                    removal_modules_rtv.$rtv_isa_constraints$.setDynamicValue((SubLObject)ConsesLow.cons(col, removal_modules_rtv.$rtv_isa_constraints$.getDynamicValue(thread)), thread);
                }
                else if (pcase_var.eql(removal_modules_rtv.$const46$genls)) {
                    removal_modules_rtv.$rtv_genls_constraints$.setDynamicValue((SubLObject)ConsesLow.cons(col, removal_modules_rtv.$rtv_genls_constraints$.getDynamicValue(thread)), thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            final SubLObject _prev_bind_0_$21 = removal_modules_rtv.$rtv_asent$.currentBinding(thread);
            final SubLObject _prev_bind_1_$22 = removal_modules_rtv.$rtv_asent_pred$.currentBinding(thread);
            final SubLObject _prev_bind_2_$23 = removal_modules_rtv.$rtv_term_argnums$.currentBinding(thread);
            final SubLObject _prev_bind_4 = removal_modules_rtv.$rtv_var_argnums$.currentBinding(thread);
            final SubLObject _prev_bind_5 = removal_modules_rtv.$rtv_asent_set_o_preds$.currentBinding(thread);
            final SubLObject _prev_bind_6 = removal_modules_rtv.$rtv_depth_cutoff$.currentBinding(thread);
            try {
                removal_modules_rtv.$rtv_asent$.bind(asent, thread);
                removal_modules_rtv.$rtv_asent_pred$.bind(cycl_utilities.atomic_sentence_predicate(asent), thread);
                removal_modules_rtv.$rtv_term_argnums$.bind(determine_rtv_term_argnums(asent), thread);
                removal_modules_rtv.$rtv_var_argnums$.bind(determine_rtv_var_argnums(asent), thread);
                removal_modules_rtv.$rtv_asent_set_o_preds$.bind(determine_rtv_asent_preds(asent), thread);
                removal_modules_rtv.$rtv_depth_cutoff$.bind(determine_rtv_depth_cutoff(asent), thread);
                result = rtv_closure_filtered(determine_rtv_initial_node(asent), get_rtv_pred_set(), (SubLObject)removal_modules_rtv.$sym64$RTV_NODE_MEETS_CONSTRAINTS_P, get_rtv_depth_cutoff(), (SubLObject)removal_modules_rtv.UNPROVIDED);
            }
            finally {
                removal_modules_rtv.$rtv_depth_cutoff$.rebind(_prev_bind_6, thread);
                removal_modules_rtv.$rtv_asent_set_o_preds$.rebind(_prev_bind_5, thread);
                removal_modules_rtv.$rtv_var_argnums$.rebind(_prev_bind_4, thread);
                removal_modules_rtv.$rtv_term_argnums$.rebind(_prev_bind_2_$23, thread);
                removal_modules_rtv.$rtv_asent_pred$.rebind(_prev_bind_1_$22, thread);
                removal_modules_rtv.$rtv_asent$.rebind(_prev_bind_0_$21, thread);
            }
        }
        finally {
            removal_modules_rtv.$rtv_use_type_constraints_p$.rebind(_prev_bind_3, thread);
            removal_modules_rtv.$rtv_genls_constraints$.rebind(_prev_bind_2, thread);
            removal_modules_rtv.$rtv_isa_constraints$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    public static SubLObject declare_removal_modules_rtv_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "with_rtv_asent_set_o_preds", "WITH-RTV-ASENT-SET-O-PREDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "get_rtv_pred_set", "GET-RTV-PRED-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "get_rtv_depth_cutoff", "GET-RTV-DEPTH-CUTOFF", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "with_rtv_depth_cutoff", "WITH-RTV-DEPTH-CUTOFF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "determine_rtv_term_argnums", "DETERMINE-RTV-TERM-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "determine_rtv_var_argnums", "DETERMINE-RTV-VAR-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "get_rtv_var_arg", "GET-RTV-VAR-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "determine_rtv_asent_preds", "DETERMINE-RTV-ASENT-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "determine_rtv_depth_cutoff", "DETERMINE-RTV-DEPTH-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "determine_rtv_initial_node", "DETERMINE-RTV-INITIAL-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "determine_rtv_goal", "DETERMINE-RTV-GOAL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "bind_rtv_asent", "BIND-RTV-ASENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "add_rtv_default_search_properties", "ADD-RTV-DEFAULT-SEARCH-PROPERTIES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "with_rtv_search_initialized", "WITH-RTV-SEARCH-INITIALIZED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "with_new_rtv_type_constraints", "WITH-NEW-RTV-TYPE-CONSTRAINTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "with_rtv_constraints_from_formula", "WITH-RTV-CONSTRAINTS-FROM-FORMULA");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "find_rtv_isa_constraints", "FIND-RTV-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "find_rtv_genls_constraints", "FIND-RTV-GENLS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_clause_p", "RTV-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "isa_clause_p", "ISA-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "genls_clause_p", "GENLS-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_use_type_constraints_p", "RTV-USE-TYPE-CONSTRAINTS-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_node_meets_constraints_p", "RTV-NODE-MEETS-CONSTRAINTS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "get_rtv_inference_node_constraints", "GET-RTV-INFERENCE-NODE-CONSTRAINTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_type_litP", "RTV-TYPE-LIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "generate_spec_litP", "GENERATE-SPEC-LIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "generate_instance_litP", "GENERATE-INSTANCE-LIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_closure", "RTV-CLOSURE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_closure_filtered", "RTV-CLOSURE-FILTERED", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_path_p", "RTV-PATH-P", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_justify_relation", "RTV-JUSTIFY-RELATION", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_justify_relation_union_all", "RTV-JUSTIFY-RELATION-UNION-ALL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_all_nodes_from_node", "RTV-ALL-NODES-FROM-NODE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_all_edges_from_node", "RTV-ALL-EDGES-FROM-NODE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_paths_covering_node_closure", "RTV-PATHS-COVERING-NODE-CLOSURE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_one_path", "RTV-ONE-PATH", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_all_edges_from_node_to_node", "RTV-ALL-EDGES-FROM-NODE-TO-NODE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_all_edges_from_node_to_node_expanded", "RTV-ALL-EDGES-FROM-NODE-TO-NODE-EXPANDED", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_add_alternate_edges_to_exemplars", "RTV-ADD-ALTERNATE-EDGES-TO-EXEMPLARS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_all_edges_from_node_to_nodes", "RTV-ALL-EDGES-FROM-NODE-TO-NODES", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_all_edges_from_node_to_nodes_expanded", "RTV-ALL-EDGES-FROM-NODE-TO-NODES-EXPANDED", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_all_edges_from_node_to_nodes_satisfying", "RTV-ALL-EDGES-FROM-NODE-TO-NODES-SATISFYING", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_all_edges_from_node_to_goal_nodes_satisfying", "RTV-ALL-EDGES-FROM-NODE-TO-GOAL-NODES-SATISFYING", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "all_edges_subsumed_by_preds", "ALL-EDGES-SUBSUMED-BY-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "inference_rtv_check", "INFERENCE-RTV-CHECK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "inference_rtv_unify", "INFERENCE-RTV-UNIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "inference_rtv_justify", "INFERENCE-RTV-JUSTIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "inference_rtv_max_floor_mts", "INFERENCE-RTV-MAX-FLOOR-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "rtv_add_genl_predicate_justs", "RTV-ADD-GENL-PREDICATE-JUSTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "removal_rtv_required", "REMOVAL-RTV-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "make_rtv_support", "MAKE-RTV-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "removal_rtv_check_required", "REMOVAL-RTV-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "removal_rtv_check_expand", "REMOVAL-RTV-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "removal_rtv_generate_required", "REMOVAL-RTV-GENERATE-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "removal_rtv_generate_iterator", "REMOVAL-RTV-GENERATE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv", "inference_rtv_constrained_unify", "INFERENCE-RTV-CONSTRAINED-UNIFY", 2, 0, false);
        return (SubLObject)removal_modules_rtv.NIL;
    }
    
    public static SubLObject init_removal_modules_rtv_file() {
        removal_modules_rtv.$rtv_asent$ = SubLFiles.defparameter("*RTV-ASENT*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$rtv_asent_pred$ = SubLFiles.defparameter("*RTV-ASENT-PRED*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$rtv_term_argnums$ = SubLFiles.defparameter("*RTV-TERM-ARGNUMS*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$rtv_var_argnums$ = SubLFiles.defparameter("*RTV-VAR-ARGNUMS*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$rtv_asent_set_o_preds$ = SubLFiles.defparameter("*RTV-ASENT-SET-O-PREDS*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$rtv_depth_cutoff$ = SubLFiles.defparameter("*RTV-DEPTH-CUTOFF*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$rtv_default_search_plist$ = SubLFiles.deflexical("*RTV-DEFAULT-SEARCH-PLIST*", (SubLObject)removal_modules_rtv.$list20);
        removal_modules_rtv.$rtv_isa_constraints$ = SubLFiles.defparameter("*RTV-ISA-CONSTRAINTS*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$rtv_genls_constraints$ = SubLFiles.defparameter("*RTV-GENLS-CONSTRAINTS*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$rtv_use_type_constraints_p$ = SubLFiles.defparameter("*RTV-USE-TYPE-CONSTRAINTS-P*", (SubLObject)removal_modules_rtv.NIL);
        removal_modules_rtv.$default_rtv_cost$ = SubLFiles.deflexical("*DEFAULT-RTV-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_rtv.NIL;
    }
    
    public static SubLObject setup_removal_modules_rtv_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_rtv.$kw73$REMOVAL_RELATED_TO_VIA_CHECK, (SubLObject)removal_modules_rtv.$list74);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rtv.$kw75$REMOVAL_RELATED_TO_VIA_GENERATE, (SubLObject)removal_modules_rtv.$list76);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_rtv.$const44$relatedToVia);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_rtv.$kw77$POS, removal_modules_rtv.$const44$relatedToVia, (SubLObject)removal_modules_rtv.THREE_INTEGER);
        preference_modules.inference_preference_module((SubLObject)removal_modules_rtv.$kw78$RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE, (SubLObject)removal_modules_rtv.$list79);
        return (SubLObject)removal_modules_rtv.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_rtv_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_rtv_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_rtv_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_rtv();
        removal_modules_rtv.$rtv_asent$ = null;
        removal_modules_rtv.$rtv_asent_pred$ = null;
        removal_modules_rtv.$rtv_term_argnums$ = null;
        removal_modules_rtv.$rtv_var_argnums$ = null;
        removal_modules_rtv.$rtv_asent_set_o_preds$ = null;
        removal_modules_rtv.$rtv_depth_cutoff$ = null;
        removal_modules_rtv.$rtv_default_search_plist$ = null;
        removal_modules_rtv.$rtv_isa_constraints$ = null;
        removal_modules_rtv.$rtv_genls_constraints$ = null;
        removal_modules_rtv.$rtv_use_type_constraints_p$ = null;
        removal_modules_rtv.$default_rtv_cost$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym2$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym4$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym5$_RTV_ASENT_SET_O_PREDS_ = SubLObjectFactory.makeSymbol("*RTV-ASENT-SET-O-PREDS*");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$_RTV_DEPTH_CUTOFF_ = SubLObjectFactory.makeSymbol("*RTV-DEPTH-CUTOFF*");
        $str8$No_valid_hl_variable_in_asent____ = SubLObjectFactory.makeString("No valid hl-variable in asent : ~A");
        $str9$No_initial_node_applicable_for_as = SubLObjectFactory.makeString("No initial node applicable for asent ~A~%");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$_RTV_ASENT_ = SubLObjectFactory.makeSymbol("*RTV-ASENT*");
        $sym12$_RTV_ASENT_PRED_ = SubLObjectFactory.makeSymbol("*RTV-ASENT-PRED*");
        $sym13$ATOMIC_SENTENCE_PREDICATE = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $sym14$_RTV_TERM_ARGNUMS_ = SubLObjectFactory.makeSymbol("*RTV-TERM-ARGNUMS*");
        $sym15$DETERMINE_RTV_TERM_ARGNUMS = SubLObjectFactory.makeSymbol("DETERMINE-RTV-TERM-ARGNUMS");
        $sym16$_RTV_VAR_ARGNUMS_ = SubLObjectFactory.makeSymbol("*RTV-VAR-ARGNUMS*");
        $sym17$DETERMINE_RTV_VAR_ARGNUMS = SubLObjectFactory.makeSymbol("DETERMINE-RTV-VAR-ARGNUMS");
        $sym18$DETERMINE_RTV_ASENT_PREDS = SubLObjectFactory.makeSymbol("DETERMINE-RTV-ASENT-PREDS");
        $sym19$DETERMINE_RTV_DEPTH_CUTOFF = SubLObjectFactory.makeSymbol("DETERMINE-RTV-DEPTH-CUTOFF");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSITIVE-REASONING"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("MARKING"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH-MARKING"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
        $sym23$GETF = SubLObjectFactory.makeSymbol("GETF");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $sym25$WITH_GHL_SEARCH_INITIALIZED = SubLObjectFactory.makeSymbol("WITH-GHL-SEARCH-INITIALIZED");
        $sym26$ADD_RTV_DEFAULT_SEARCH_PROPERTIES = SubLObjectFactory.makeSymbol("ADD-RTV-DEFAULT-SEARCH-PROPERTIES");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RTV-ISA-CONSTRAINTS*"), (SubLObject)removal_modules_rtv.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RTV-GENLS-CONSTRAINTS*"), (SubLObject)removal_modules_rtv.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*"), (SubLObject)removal_modules_rtv.T));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym29$RTV_FORMULA = SubLObjectFactory.makeUninternedSymbol("RTV-FORMULA");
        $sym30$VAR = SubLObjectFactory.makeUninternedSymbol("VAR");
        $sym31$FIND_IF = SubLObjectFactory.makeSymbol("FIND-IF");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RTV-CLAUSE-P"));
        $sym33$FCOND = SubLObjectFactory.makeSymbol("FCOND");
        $sym34$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym35$FORMULA_ARG1 = SubLObjectFactory.makeSymbol("FORMULA-ARG1");
        $sym36$FORMULA_ARG2 = SubLObjectFactory.makeSymbol("FORMULA-ARG2");
        $sym37$_RTV_ISA_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*RTV-ISA-CONSTRAINTS*");
        $sym38$FIND_RTV_ISA_CONSTRAINTS = SubLObjectFactory.makeSymbol("FIND-RTV-ISA-CONSTRAINTS");
        $sym39$_RTV_GENLS_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*RTV-GENLS-CONSTRAINTS*");
        $sym40$FIND_RTV_GENLS_CONSTRAINTS = SubLObjectFactory.makeSymbol("FIND-RTV-GENLS-CONSTRAINTS");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RTV-USE-TYPE-CONSTRAINTS-P*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("*RTV-ISA-CONSTRAINTS*"), (SubLObject)SubLObjectFactory.makeSymbol("*RTV-GENLS-CONSTRAINTS*"))));
        $sym42$ISA_CLAUSE_P = SubLObjectFactory.makeSymbol("ISA-CLAUSE-P");
        $sym43$GENLS_CLAUSE_P = SubLObjectFactory.makeSymbol("GENLS-CLAUSE-P");
        $const44$relatedToVia = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia"));
        $const45$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const46$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym47$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw48$ORDER = SubLObjectFactory.makeKeyword("ORDER");
        $kw49$DEPTH_FIRST = SubLObjectFactory.makeKeyword("DEPTH-FIRST");
        $kw50$MT = SubLObjectFactory.makeKeyword("MT");
        $kw51$PREDICATES = SubLObjectFactory.makeKeyword("PREDICATES");
        $kw52$CUTOFF = SubLObjectFactory.makeKeyword("CUTOFF");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), (SubLObject)SubLObjectFactory.makeKeyword("NODES-ON-WIND"));
        $kw54$GOAL = SubLObjectFactory.makeKeyword("GOAL");
        $kw55$ITERATIVE_DEEPENING = SubLObjectFactory.makeKeyword("ITERATIVE-DEEPENING");
        $kw56$JUSTIFY_ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $kw57$ADD_TO_RESULT_ = SubLObjectFactory.makeKeyword("ADD-TO-RESULT?");
        $kw58$EDGES_ON_UNWIND = SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND");
        $kw59$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY?"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY?"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND"));
        $sym62$RTV_CLAUSE_P = SubLObjectFactory.makeSymbol("RTV-CLAUSE-P");
        $kw63$GOAL_FN = SubLObjectFactory.makeKeyword("GOAL-FN");
        $sym64$RTV_NODE_MEETS_CONSTRAINTS_P = SubLObjectFactory.makeSymbol("RTV-NODE-MEETS-CONSTRAINTS-P");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SATISFY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("RTV-NODE-MEETS-CONSTRAINTS-P"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY?"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND"));
        $const66$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw67$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $sym68$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $const69$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $kw70$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("SOP"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"));
        $kw72$RTV = SubLObjectFactory.makeKeyword("RTV");
        $kw73$REMOVAL_RELATED_TO_VIA_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-RELATED-TO-VIA-CHECK");
        $list74 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RTV-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-RTV-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RTV-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$relatedToVia <fort> <fort> <SOP> <num>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$relatedToVia #$KevinBacon #$KevinSpacey (#$TheSet #$costars) 2)") });
        $kw75$REMOVAL_RELATED_TO_VIA_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-RELATED-TO-VIA-GENERATE");
        $list76 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RTV-GENERATE-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-RTV-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-RTV-GENERATE-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RTV-VAR-ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("RTV"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$relatedToVia <VAR> <fort> <SOP> <num>)\n    and\n    (#$relatedToVia <fort> <VAR> <SOP> <num>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$relatedToVia ?WHO #$KevinBacon (#$TheSet #$costars) 2)\n    and\n    (#$relatedToVia #$KevinBacon ?WHO (#$TheSet #$costars) 2)") });
        $kw77$POS = SubLObjectFactory.makeKeyword("POS");
        $kw78$RELATED_TO_VIA_EITHER_ARG1_OR_ARG2_BINDABLE = SubLObjectFactory.makeKeyword("RELATED-TO-VIA-EITHER-ARG1-OR-ARG2-BINDABLE");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG1-OR-ARG2"));
    }
}

/*

	Total time: 396 ms
	
*/