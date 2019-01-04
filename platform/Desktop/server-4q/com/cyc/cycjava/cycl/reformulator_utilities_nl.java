package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_utilities_nl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_utilities_nl";
    public static final String myFingerPrint = "9f1310564f2db9d6d4deb1c3cf2d03c77ff4b0e1d706c2d9f914e683f87ece6a";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 750L)
    public static SubLSymbol $reformulator_settings_for_quantproc$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 1383L)
    public static SubLSymbol $reformulator_settings_for_quantproc_3$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 2058L)
    public static SubLSymbol $reformulator_settings_for_quantproc_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 3409L)
    public static SubLSymbol $reformulator_settings_for_quantunify$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 4124L)
    public static SubLSymbol $reformulator_settings_for_quantunify_3$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 4666L)
    public static SubLSymbol $reformulator_settings_for_negproc$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 5250L)
    public static SubLSymbol $reformulator_settings_for_vppproc_state$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 5913L)
    public static SubLSymbol $reformulator_settings_for_vppproc_nonstate$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 7096L)
    public static SubLSymbol $reformulator_settings_for_subcollproc$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 8039L)
    public static SubLSymbol $reformulator_settings_for_typeshift$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 8685L)
    private static SubLSymbol $reformulator_settings_for_quantopt$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 9222L)
    private static SubLSymbol $reformulator_settings_for_quantopt_3$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$RECURSION_LIMIT;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLObject $const8$SomeFn;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLObject $const14$TheCoordinationSet;
    private static final SubLList $list15;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 1048L)
    public static SubLObject try_process_reformulator_for_quantprocP(final SubLObject formula) {
        return (SubLObject)reformulator_utilities_nl.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 1144L)
    public static SubLObject reformulate_cycl_quantproc(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_quantproc$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit))), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 1495L)
    public static SubLObject try_process_reformulator_for_quantproc_3P(final SubLObject formula) {
        return (SubLObject)reformulator_utilities_nl.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 1593L)
    public static SubLObject reformulate_cycls_quantproc_3(final SubLObject sentences, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.ZERO_INTEGER;
        }
        SubLObject result = (SubLObject)reformulator_utilities_nl.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)reformulator_utilities_nl.NIL;
        sentence = cdolist_list_var.first();
        while (reformulator_utilities_nl.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(reformulate_cycl_quantproc_3(sentence, mt, limit), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 1815L)
    public static SubLObject reformulate_cycl_quantproc_3(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_quantproc_3$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit))), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 2404L)
    public static SubLObject try_process_reformulator_for_quantproc_rulesP(final SubLObject formula) {
        return (SubLObject)reformulator_utilities_nl.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 2506L)
    public static SubLObject reformulate_cycl_quantproc_rules(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_quantproc$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit))), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 2904L)
    public static SubLObject reformulate_cycls_quantproc_3_rules(final SubLObject sentences, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.ZERO_INTEGER;
        }
        SubLObject result = (SubLObject)reformulator_utilities_nl.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)reformulator_utilities_nl.NIL;
        sentence = cdolist_list_var.first();
        while (reformulator_utilities_nl.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(reformulate_cycl_quantproc_3_rules(sentence, mt, limit), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 3138L)
    public static SubLObject reformulate_cycl_quantproc_3_rules(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_quantproc_3$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit))), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 3702L)
    public static SubLObject try_process_reformulator_for_quantunifyP(final SubLObject formula) {
        return (SubLObject)reformulator_utilities_nl.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 3799L)
    public static SubLObject reformulate_cycl_quantunify(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_quantunify$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_quantunify$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 4236L)
    public static SubLObject try_process_reformulator_for_quantunify_3P(final SubLObject formula) {
        return (SubLObject)reformulator_utilities_nl.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 4335L)
    public static SubLObject reformulate_cycl_quantunify_3(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_quantunify_3$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_quantunify_3$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 4852L)
    public static SubLObject try_process_reformulator_for_negprocP(final SubLObject formula) {
        return (SubLObject)reformulator_utilities_nl.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 4946L)
    public static SubLObject reformulate_cycl_negproc(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_negproc$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_negproc$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 5443L)
    public static SubLObject try_process_reformulator_for_vppproc_stateP(final SubLObject formula) {
        if (reformulator_utilities_nl.NIL != list_utilities.tree_find(reformulator_utilities_nl.$const8$SomeFn, formula, (SubLObject)reformulator_utilities_nl.UNPROVIDED, (SubLObject)reformulator_utilities_nl.UNPROVIDED)) {
            return (SubLObject)reformulator_utilities_nl.T;
        }
        return (SubLObject)reformulator_utilities_nl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 5577L)
    public static SubLObject reformulate_cycl_vppproc_state(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_vppproc_state$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_vppproc_state$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 6112L)
    public static SubLObject try_to_reformulate_cycls_vppproc_nonstate(final SubLObject expressions, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        SubLObject result = (SubLObject)reformulator_utilities_nl.NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = (SubLObject)reformulator_utilities_nl.NIL;
        expression = cdolist_list_var.first();
        while (reformulator_utilities_nl.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(try_to_reformulate_cycl_vppproc_nonstate(expression, mt, limit), result);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 6362L)
    public static SubLObject try_to_reformulate_cycl_vppproc_nonstate(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        if (reformulator_utilities_nl.NIL != try_process_reformulator_for_vppproc_nonstateP(expression)) {
            return reformulate_cycl_vppproc_nonstate(expression, mt, limit);
        }
        return expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 6613L)
    public static SubLObject try_process_reformulator_for_vppproc_nonstateP(final SubLObject formula) {
        if (reformulator_utilities_nl.NIL != list_utilities.tree_find(reformulator_utilities_nl.$const8$SomeFn, formula, (SubLObject)reformulator_utilities_nl.UNPROVIDED, (SubLObject)reformulator_utilities_nl.UNPROVIDED)) {
            return (SubLObject)reformulator_utilities_nl.T;
        }
        return (SubLObject)reformulator_utilities_nl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 6750L)
    public static SubLObject reformulate_cycl_vppproc_nonstate(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_vppproc_nonstate$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_vppproc_nonstate$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 7423L)
    public static SubLObject reformulate_cycls_subcollproc(final SubLObject expressions, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        SubLObject result = (SubLObject)reformulator_utilities_nl.NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = (SubLObject)reformulator_utilities_nl.NIL;
        expression = cdolist_list_var.first();
        while (reformulator_utilities_nl.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(reformulate_cycl_subcollproc(expression, mt, limit), result);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 7713L)
    public static SubLObject reformulate_cycl_subcollproc(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_subcollproc$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_subcollproc$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 8357L)
    public static SubLObject reformulate_cycl_typeshift(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_typeshift$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_typeshift$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 8886L)
    public static SubLObject reformulate_cycl_quantopt(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_quantopt$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_quantopt$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 9332L)
    public static SubLObject reformulate_cycl_quantopt_3(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == reformulator_utilities_nl.UNPROVIDED) {
            limit = (SubLObject)reformulator_utilities_nl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, (reformulator_utilities_nl.NIL != limit) ? Sequences.cconcatenate(reformulator_utilities_nl.$reformulator_settings_for_quantopt_3$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)reformulator_utilities_nl.$kw1$RECURSION_LIMIT, limit)) : reformulator_utilities_nl.$reformulator_settings_for_quantopt_3$.getDynamicValue(thread)), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 9674L)
    public static SubLObject reformulate_cycl_the_coordination_set_removal(SubLObject expression, final SubLObject mt) {
        SubLObject result = expression;
        while (reformulator_utilities_nl.NIL != the_coordination_set_remover_expression_required(expression, mt, (SubLObject)reformulator_utilities_nl.NIL)) {
            expression = the_coordination_set_remover_reformulate_int(expression);
            if (reformulator_utilities_nl.NIL != expression) {
                result = expression;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 10150L)
    public static SubLObject the_coordination_set_remover_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_utilities_nl.NIL != el_utilities.el_formula_p(expression) && reformulator_utilities_nl.NIL != cycl_utilities.expression_find(reformulator_utilities_nl.$const14$TheCoordinationSet, expression, (SubLObject)reformulator_utilities_nl.UNPROVIDED, (SubLObject)reformulator_utilities_nl.UNPROVIDED, (SubLObject)reformulator_utilities_nl.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 10716L)
    public static SubLObject the_coordination_set_remover_apply_replacement(final SubLObject formulas, final SubLObject replacement_location, final SubLObject replacement_items) {
        SubLObject conjunct_clauses = (SubLObject)reformulator_utilities_nl.NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = (SubLObject)reformulator_utilities_nl.NIL;
        formula = cdolist_list_var.first();
        while (reformulator_utilities_nl.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = replacement_items;
            SubLObject replacement_item = (SubLObject)reformulator_utilities_nl.NIL;
            replacement_item = cdolist_list_var_$1.first();
            while (reformulator_utilities_nl.NIL != cdolist_list_var_$1) {
                conjunct_clauses = (SubLObject)ConsesLow.cons(el_utilities.replace_formula_arg_position(replacement_location, replacement_item, formula), conjunct_clauses);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                replacement_item = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        }
        return Sequences.nreverse(conjunct_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities-nl.lisp", position = 11099L)
    public static SubLObject the_coordination_set_remover_reformulate_int(final SubLObject expression) {
        SubLObject replacement_location_items_pairs = (SubLObject)reformulator_utilities_nl.NIL;
        SubLObject cdolist_list_var = list_utilities.tree_positions(reformulator_utilities_nl.$const14$TheCoordinationSet, expression, (SubLObject)reformulator_utilities_nl.UNPROVIDED, (SubLObject)reformulator_utilities_nl.UNPROVIDED);
        SubLObject tcs_position = (SubLObject)reformulator_utilities_nl.NIL;
        tcs_position = cdolist_list_var.first();
        while (reformulator_utilities_nl.NIL != cdolist_list_var) {
            if (tcs_position.isList() && list_utilities.last_one(tcs_position).isZero()) {
                final SubLObject replacement_location = conses_high.butlast(tcs_position, (SubLObject)reformulator_utilities_nl.UNPROVIDED);
                final SubLObject replacement_items = cycl_utilities.nat_args(list_utilities.get_nested_nth(expression, replacement_location, (SubLObject)reformulator_utilities_nl.UNPROVIDED), (SubLObject)reformulator_utilities_nl.UNPROVIDED);
                replacement_location_items_pairs = list_utilities.alist_enter(replacement_location_items_pairs, replacement_location, replacement_items, (SubLObject)reformulator_utilities_nl.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tcs_position = cdolist_list_var.first();
        }
        SubLObject conjunct_clauses = (SubLObject)ConsesLow.list(expression);
        SubLObject cdolist_list_var2 = replacement_location_items_pairs;
        SubLObject cons = (SubLObject)reformulator_utilities_nl.NIL;
        cons = cdolist_list_var2.first();
        while (reformulator_utilities_nl.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject replacement_location2 = (SubLObject)reformulator_utilities_nl.NIL;
            SubLObject replacement_items2 = (SubLObject)reformulator_utilities_nl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)reformulator_utilities_nl.$list15);
            replacement_location2 = current.first();
            current = (replacement_items2 = current.rest());
            conjunct_clauses = the_coordination_set_remover_apply_replacement(conjunct_clauses, replacement_location2, replacement_items2);
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons = cdolist_list_var2.first();
        }
        return simplifier.nconjoin(conjunct_clauses, (SubLObject)reformulator_utilities_nl.T);
    }
    
    public static SubLObject declare_reformulator_utilities_nl_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_process_reformulator_for_quantprocP", "TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_quantproc", "REFORMULATE-CYCL-QUANTPROC", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_process_reformulator_for_quantproc_3P", "TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC-3?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycls_quantproc_3", "REFORMULATE-CYCLS-QUANTPROC-3", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_quantproc_3", "REFORMULATE-CYCL-QUANTPROC-3", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_process_reformulator_for_quantproc_rulesP", "TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC-RULES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_quantproc_rules", "REFORMULATE-CYCL-QUANTPROC-RULES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycls_quantproc_3_rules", "REFORMULATE-CYCLS-QUANTPROC-3-RULES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_quantproc_3_rules", "REFORMULATE-CYCL-QUANTPROC-3-RULES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_process_reformulator_for_quantunifyP", "TRY-PROCESS-REFORMULATOR-FOR-QUANTUNIFY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_quantunify", "REFORMULATE-CYCL-QUANTUNIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_process_reformulator_for_quantunify_3P", "TRY-PROCESS-REFORMULATOR-FOR-QUANTUNIFY-3?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_quantunify_3", "REFORMULATE-CYCL-QUANTUNIFY-3", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_process_reformulator_for_negprocP", "TRY-PROCESS-REFORMULATOR-FOR-NEGPROC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_negproc", "REFORMULATE-CYCL-NEGPROC", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_process_reformulator_for_vppproc_stateP", "TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-STATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_vppproc_state", "REFORMULATE-CYCL-VPPPROC-STATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_to_reformulate_cycls_vppproc_nonstate", "TRY-TO-REFORMULATE-CYCLS-VPPPROC-NONSTATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_to_reformulate_cycl_vppproc_nonstate", "TRY-TO-REFORMULATE-CYCL-VPPPROC-NONSTATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "try_process_reformulator_for_vppproc_nonstateP", "TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-NONSTATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_vppproc_nonstate", "REFORMULATE-CYCL-VPPPROC-NONSTATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycls_subcollproc", "REFORMULATE-CYCLS-SUBCOLLPROC", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_subcollproc", "REFORMULATE-CYCL-SUBCOLLPROC", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_typeshift", "REFORMULATE-CYCL-TYPESHIFT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_quantopt", "REFORMULATE-CYCL-QUANTOPT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_quantopt_3", "REFORMULATE-CYCL-QUANTOPT-3", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "reformulate_cycl_the_coordination_set_removal", "REFORMULATE-CYCL-THE-COORDINATION-SET-REMOVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "the_coordination_set_remover_expression_required", "THE-COORDINATION-SET-REMOVER-EXPRESSION-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "the_coordination_set_remover_apply_replacement", "THE-COORDINATION-SET-REMOVER-APPLY-REPLACEMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_utilities_nl", "the_coordination_set_remover_reformulate_int", "THE-COORDINATION-SET-REMOVER-REFORMULATE-INT", 1, 0, false);
        return (SubLObject)reformulator_utilities_nl.NIL;
    }
    
    public static SubLObject init_reformulator_utilities_nl_file() {
        reformulator_utilities_nl.$reformulator_settings_for_quantproc$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTPROC*", (SubLObject)reformulator_utilities_nl.$list0);
        reformulator_utilities_nl.$reformulator_settings_for_quantproc_3$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTPROC-3*", (SubLObject)reformulator_utilities_nl.$list2);
        reformulator_utilities_nl.$reformulator_settings_for_quantproc_rules$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTPROC-RULES*", (SubLObject)reformulator_utilities_nl.$list3);
        reformulator_utilities_nl.$reformulator_settings_for_quantunify$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTUNIFY*", (SubLObject)reformulator_utilities_nl.$list4);
        reformulator_utilities_nl.$reformulator_settings_for_quantunify_3$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTUNIFY-3*", (SubLObject)reformulator_utilities_nl.$list5);
        reformulator_utilities_nl.$reformulator_settings_for_negproc$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-NEGPROC*", (SubLObject)reformulator_utilities_nl.$list6);
        reformulator_utilities_nl.$reformulator_settings_for_vppproc_state$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-VPPPROC-STATE*", (SubLObject)reformulator_utilities_nl.$list7);
        reformulator_utilities_nl.$reformulator_settings_for_vppproc_nonstate$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-VPPPROC-NONSTATE*", (SubLObject)reformulator_utilities_nl.$list9);
        reformulator_utilities_nl.$reformulator_settings_for_subcollproc$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-SUBCOLLPROC*", (SubLObject)reformulator_utilities_nl.$list10);
        reformulator_utilities_nl.$reformulator_settings_for_typeshift$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-TYPESHIFT*", (SubLObject)reformulator_utilities_nl.$list11);
        reformulator_utilities_nl.$reformulator_settings_for_quantopt$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTOPT*", (SubLObject)reformulator_utilities_nl.$list12);
        reformulator_utilities_nl.$reformulator_settings_for_quantopt_3$ = SubLFiles.defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTOPT-3*", (SubLObject)reformulator_utilities_nl.$list13);
        return (SubLObject)reformulator_utilities_nl.NIL;
    }
    
    public static SubLObject setup_reformulator_utilities_nl_file() {
        return (SubLObject)reformulator_utilities_nl.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_utilities_nl_file();
    }
    
    public void initializeVariables() {
        init_reformulator_utilities_nl_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_utilities_nl_file();
    }
    
    static {
        me = (SubLFile)new reformulator_utilities_nl();
        reformulator_utilities_nl.$reformulator_settings_for_quantproc$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_quantproc_3$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_quantproc_rules$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_quantunify$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_quantunify_3$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_negproc$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_vppproc_state$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_vppproc_nonstate$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_subcollproc$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_typeshift$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_quantopt$ = null;
        reformulator_utilities_nl.$reformulator_settings_for_quantopt_3$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierProcessingRLModule")));
        $kw1$RECURSION_LIMIT = SubLObjectFactory.makeKeyword("RECURSION-LIMIT");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierProcessing-3-RLModule")));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("META-PREDICATES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForQuantifierProcessing"))));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierUnifierRLModule")));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierUnifier-3-RLModule")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NegationProcessorRLModule")));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VPPProcessingStateRLModule")));
        $const8$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VPPProcessingNonStateRLModule")));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionProcessorRLModule")));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeShiftingRLModule")));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierOptimizerRLModule")));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierOptimizer-3-RLModule")));
        $const14$TheCoordinationSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet"));
        $list15 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENT-LOCATION"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENT-ITEMS"));
    }
}

/*

	Total time: 114 ms
	
*/