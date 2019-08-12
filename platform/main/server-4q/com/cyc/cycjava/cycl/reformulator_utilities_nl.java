/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_utilities_nl extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new reformulator_utilities_nl();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_utilities_nl";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_quantproc$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-QUANTPROC*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_quantproc_3$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-QUANTPROC-3*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_quantproc_rules$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-QUANTPROC-RULES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_quantunify$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-QUANTUNIFY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_quantunify_3$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-QUANTUNIFY-3*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_negproc$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-NEGPROC*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_vppproc_state$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-VPPPROC-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_vppproc_nonstate$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-VPPPROC-NONSTATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_subcollproc$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-SUBCOLLPROC*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $reformulator_settings_for_typeshift$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-TYPESHIFT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $reformulator_settings_for_quantopt$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-QUANTOPT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $reformulator_settings_for_quantopt_3$ = makeSymbol("*REFORMULATOR-SETTINGS-FOR-QUANTOPT-3*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierProcessingRLModule"));

    static private final SubLList $list2 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierProcessing-3-RLModule"));

    static private final SubLList $list3 = list(makeKeyword("META-PREDICATES"), list(reader_make_constant_shell("useReformulationRuleForQuantifierProcessing")));

    static private final SubLList $list4 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierUnifierRLModule"));

    static private final SubLList $list5 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierUnifier-3-RLModule"));

    static private final SubLList $list6 = list(makeKeyword("FOCUS"), reader_make_constant_shell("NegationProcessorRLModule"));

    static private final SubLList $list7 = list(makeKeyword("FOCUS"), reader_make_constant_shell("VPPProcessingStateRLModule"));



    static private final SubLList $list9 = list(makeKeyword("FOCUS"), reader_make_constant_shell("VPPProcessingNonStateRLModule"));

    static private final SubLList $list10 = list(makeKeyword("FOCUS"), reader_make_constant_shell("SubcollectionProcessorRLModule"));

    static private final SubLList $list11 = list(makeKeyword("FOCUS"), reader_make_constant_shell("TypeShiftingRLModule"));

    static private final SubLList $list12 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierOptimizerRLModule"));

    static private final SubLList $list13 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierOptimizer-3-RLModule"));



    static private final SubLList $list15 = cons(makeSymbol("REPLACEMENT-LOCATION"), makeSymbol("REPLACEMENT-ITEMS"));

    public static final SubLObject try_process_reformulator_for_quantprocP_alt(SubLObject formula) {
        return T;
    }

    public static SubLObject try_process_reformulator_for_quantprocP(final SubLObject formula) {
        return T;
    }

    public static final SubLObject reformulate_cycl_quantproc_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, cconcatenate($reformulator_settings_for_quantproc$.getDynamicValue(thread), list($RECURSION_LIMIT, limit))), expression);
        }
    }

    public static SubLObject reformulate_cycl_quantproc(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, cconcatenate($reformulator_settings_for_quantproc$.getDynamicValue(thread), list($RECURSION_LIMIT, limit))), expression);
    }

    public static final SubLObject try_process_reformulator_for_quantproc_3P_alt(SubLObject formula) {
        return T;
    }

    public static SubLObject try_process_reformulator_for_quantproc_3P(final SubLObject formula) {
        return T;
    }

    public static final SubLObject reformulate_cycls_quantproc_3_alt(SubLObject sentences, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                result = cons(com.cyc.cycjava.cycl.reformulator_utilities_nl.reformulate_cycl_quantproc_3(sentence, mt, limit), result);
            }
            return result;
        }
    }

    public static SubLObject reformulate_cycls_quantproc_3(final SubLObject sentences, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(reformulate_cycl_quantproc_3(sentence, mt, limit), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject reformulate_cycl_quantproc_3_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, cconcatenate($reformulator_settings_for_quantproc_3$.getDynamicValue(thread), list($RECURSION_LIMIT, limit))), expression);
        }
    }

    public static SubLObject reformulate_cycl_quantproc_3(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, cconcatenate($reformulator_settings_for_quantproc_3$.getDynamicValue(thread), list($RECURSION_LIMIT, limit))), expression);
    }

    public static final SubLObject try_process_reformulator_for_quantproc_rulesP_alt(SubLObject formula) {
        return T;
    }

    public static SubLObject try_process_reformulator_for_quantproc_rulesP(final SubLObject formula) {
        return T;
    }

    public static final SubLObject reformulate_cycl_quantproc_rules_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, cconcatenate($reformulator_settings_for_quantproc$.getDynamicValue(thread), list($RECURSION_LIMIT, limit))), expression);
        }
    }

    public static SubLObject reformulate_cycl_quantproc_rules(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, cconcatenate($reformulator_settings_for_quantproc$.getDynamicValue(thread), list($RECURSION_LIMIT, limit))), expression);
    }

    public static final SubLObject reformulate_cycls_quantproc_3_rules_alt(SubLObject sentences, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                result = cons(com.cyc.cycjava.cycl.reformulator_utilities_nl.reformulate_cycl_quantproc_3_rules(sentence, mt, limit), result);
            }
            return result;
        }
    }

    public static SubLObject reformulate_cycls_quantproc_3_rules(final SubLObject sentences, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(reformulate_cycl_quantproc_3_rules(sentence, mt, limit), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject reformulate_cycl_quantproc_3_rules_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, cconcatenate($reformulator_settings_for_quantproc_3$.getDynamicValue(thread), list($RECURSION_LIMIT, limit))), expression);
        }
    }

    public static SubLObject reformulate_cycl_quantproc_3_rules(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, cconcatenate($reformulator_settings_for_quantproc_3$.getDynamicValue(thread), list($RECURSION_LIMIT, limit))), expression);
    }

    public static final SubLObject try_process_reformulator_for_quantunifyP_alt(SubLObject formula) {
        return T;
    }

    public static SubLObject try_process_reformulator_for_quantunifyP(final SubLObject formula) {
        return T;
    }

    public static final SubLObject reformulate_cycl_quantunify_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_quantunify$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_quantunify$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_quantunify(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_quantunify$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_quantunify$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject try_process_reformulator_for_quantunify_3P_alt(SubLObject formula) {
        return T;
    }

    public static SubLObject try_process_reformulator_for_quantunify_3P(final SubLObject formula) {
        return T;
    }

    public static final SubLObject reformulate_cycl_quantunify_3_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_quantunify_3$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_quantunify_3$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_quantunify_3(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_quantunify_3$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_quantunify_3$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject try_process_reformulator_for_negprocP_alt(SubLObject formula) {
        return T;
    }

    public static SubLObject try_process_reformulator_for_negprocP(final SubLObject formula) {
        return T;
    }

    public static final SubLObject reformulate_cycl_negproc_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_negproc$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_negproc$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_negproc(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_negproc$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_negproc$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject try_process_reformulator_for_vppproc_stateP_alt(SubLObject formula) {
        if (NIL != list_utilities.tree_find($$SomeFn, formula, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject try_process_reformulator_for_vppproc_stateP(final SubLObject formula) {
        if (NIL != list_utilities.tree_find($$SomeFn, formula, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject reformulate_cycl_vppproc_state_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_vppproc_state$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_vppproc_state$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_vppproc_state(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_vppproc_state$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_vppproc_state$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject try_to_reformulate_cycls_vppproc_nonstate_alt(SubLObject expressions, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = expressions;
            SubLObject expression = NIL;
            for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                result = cons(com.cyc.cycjava.cycl.reformulator_utilities_nl.try_to_reformulate_cycl_vppproc_nonstate(expression, mt, limit), result);
            }
            return result;
        }
    }

    public static SubLObject try_to_reformulate_cycls_vppproc_nonstate(final SubLObject expressions, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = NIL;
        expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(try_to_reformulate_cycl_vppproc_nonstate(expression, mt, limit), result);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject try_to_reformulate_cycl_vppproc_nonstate_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.reformulator_utilities_nl.try_process_reformulator_for_vppproc_nonstateP(expression)) {
            return com.cyc.cycjava.cycl.reformulator_utilities_nl.reformulate_cycl_vppproc_nonstate(expression, mt, limit);
        } else {
            return expression;
        }
    }

    public static SubLObject try_to_reformulate_cycl_vppproc_nonstate(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        if (NIL != try_process_reformulator_for_vppproc_nonstateP(expression)) {
            return reformulate_cycl_vppproc_nonstate(expression, mt, limit);
        }
        return expression;
    }

    public static final SubLObject try_process_reformulator_for_vppproc_nonstateP_alt(SubLObject formula) {
        if (NIL != list_utilities.tree_find($$SomeFn, formula, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject try_process_reformulator_for_vppproc_nonstateP(final SubLObject formula) {
        if (NIL != list_utilities.tree_find($$SomeFn, formula, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject reformulate_cycl_vppproc_nonstate_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_vppproc_nonstate$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_vppproc_nonstate$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_vppproc_nonstate(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_vppproc_nonstate$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_vppproc_nonstate$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject reformulate_cycls_subcollproc_alt(SubLObject expressions, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = expressions;
            SubLObject expression = NIL;
            for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                result = cons(com.cyc.cycjava.cycl.reformulator_utilities_nl.reformulate_cycl_subcollproc(expression, mt, limit), result);
            }
            return result;
        }
    }

    public static SubLObject reformulate_cycls_subcollproc(final SubLObject expressions, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = NIL;
        expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(reformulate_cycl_subcollproc(expression, mt, limit), result);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject reformulate_cycl_subcollproc_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_subcollproc$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_subcollproc$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_subcollproc(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_subcollproc$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_subcollproc$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject reformulate_cycl_typeshift_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_typeshift$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_typeshift$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_typeshift(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_typeshift$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_typeshift$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject reformulate_cycl_quantopt_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_quantopt$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_quantopt$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_quantopt(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_quantopt$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_quantopt$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject reformulate_cycl_quantopt_3_alt(SubLObject expression, SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? ((SubLObject) (cconcatenate($reformulator_settings_for_quantopt_3$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)))) : $reformulator_settings_for_quantopt_3$.getDynamicValue(thread)), expression);
        }
    }

    public static SubLObject reformulate_cycl_quantopt_3(final SubLObject expression, final SubLObject mt, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_utilities.reformulator_first_of(reformulator_hub.reformulate_cycl(expression, mt, NIL != limit ? cconcatenate($reformulator_settings_for_quantopt_3$.getDynamicValue(thread), list($RECURSION_LIMIT, limit)) : $reformulator_settings_for_quantopt_3$.getDynamicValue(thread)), expression);
    }

    public static final SubLObject reformulate_cycl_the_coordination_set_removal_alt(SubLObject expression, SubLObject mt) {
        {
            SubLObject result = expression;
            while (NIL != com.cyc.cycjava.cycl.reformulator_utilities_nl.the_coordination_set_remover_expression_required(expression, mt, NIL)) {
                expression = com.cyc.cycjava.cycl.reformulator_utilities_nl.the_coordination_set_remover_reformulate_int(expression);
                if (NIL != expression) {
                    result = expression;
                }
            } 
            return result;
        }
    }

    public static SubLObject reformulate_cycl_the_coordination_set_removal(SubLObject expression, final SubLObject mt) {
        SubLObject result = expression;
        while (NIL != the_coordination_set_remover_expression_required(expression, mt, NIL)) {
            expression = the_coordination_set_remover_reformulate_int(expression);
            if (NIL != expression) {
                result = expression;
            }
        } 
        return result;
    }

    /**
     *
     *
     * @param expression;
    el-expression-p
     * 		
     * @param settings;
    a-list
     * 		
     * @return boolean
    Returns T iff the Quantifier Optimizer RL module is likely to apply to
    EXPRESSION, given SETTINGS.
     * @unknown In some cases, although EXPRESSION may pass this simple test, it
    might later turn out that the RL module can in fact not apply to
    EXPRESSION.
     */
    @LispMethod(comment = "@param expression;\nel-expression-p\r\n\t\t\r\n@param settings;\na-list\r\n\t\t\r\n@return boolean\r\nReturns T iff the Quantifier Optimizer RL module is likely to apply to\r\nEXPRESSION, given SETTINGS.\r\n@unknown In some cases, although EXPRESSION may pass this simple test, it\r\nmight later turn out that the RL module can in fact not apply to\r\nEXPRESSION.")
    public static final SubLObject the_coordination_set_remover_expression_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return makeBoolean((NIL != el_formula_p(expression)) && (NIL != cycl_utilities.expression_find($$TheCoordinationSet, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @param expression;
    el-expression-p
     * 		
     * @param settings;
    a-list
     * 		
     * @return boolean
    Returns T iff the Quantifier Optimizer RL module is likely to apply to
    EXPRESSION, given SETTINGS.
     * @unknown In some cases, although EXPRESSION may pass this simple test, it
    might later turn out that the RL module can in fact not apply to
    EXPRESSION.
     */
    @LispMethod(comment = "@param expression;\nel-expression-p\r\n\t\t\r\n@param settings;\na-list\r\n\t\t\r\n@return boolean\r\nReturns T iff the Quantifier Optimizer RL module is likely to apply to\r\nEXPRESSION, given SETTINGS.\r\n@unknown In some cases, although EXPRESSION may pass this simple test, it\r\nmight later turn out that the RL module can in fact not apply to\r\nEXPRESSION.")
    public static SubLObject the_coordination_set_remover_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return makeBoolean((NIL != el_formula_p(expression)) && (NIL != cycl_utilities.expression_find($$TheCoordinationSet, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject the_coordination_set_remover_apply_replacement_alt(SubLObject formulas, SubLObject replacement_location, SubLObject replacement_items) {
        {
            SubLObject conjunct_clauses = NIL;
            SubLObject cdolist_list_var = formulas;
            SubLObject formula = NIL;
            for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = replacement_items;
                    SubLObject replacement_item = NIL;
                    for (replacement_item = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , replacement_item = cdolist_list_var_1.first()) {
                        conjunct_clauses = cons(replace_formula_arg_position(replacement_location, replacement_item, formula), conjunct_clauses);
                    }
                }
            }
            return nreverse(conjunct_clauses);
        }
    }

    public static SubLObject the_coordination_set_remover_apply_replacement(final SubLObject formulas, final SubLObject replacement_location, final SubLObject replacement_items) {
        SubLObject conjunct_clauses = NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = NIL;
        formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = replacement_items;
            SubLObject replacement_item = NIL;
            replacement_item = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                conjunct_clauses = cons(replace_formula_arg_position(replacement_location, replacement_item, formula), conjunct_clauses);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                replacement_item = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        } 
        return nreverse(conjunct_clauses);
    }

    public static final SubLObject the_coordination_set_remover_reformulate_int_alt(SubLObject expression) {
        {
            SubLObject replacement_location_items_pairs = NIL;
            {
                SubLObject cdolist_list_var = list_utilities.tree_positions($$TheCoordinationSet, expression, UNPROVIDED, UNPROVIDED);
                SubLObject tcs_position = NIL;
                for (tcs_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tcs_position = cdolist_list_var.first()) {
                    if (tcs_position.isList() && list_utilities.last_one(tcs_position).isZero()) {
                        {
                            SubLObject replacement_location = butlast(tcs_position, UNPROVIDED);
                            SubLObject replacement_items = cycl_utilities.nat_args(list_utilities.get_nested_nth(expression, replacement_location, UNPROVIDED), UNPROVIDED);
                            replacement_location_items_pairs = list_utilities.alist_enter(replacement_location_items_pairs, replacement_location, replacement_items, UNPROVIDED);
                        }
                    }
                }
            }
            {
                SubLObject conjunct_clauses = list(expression);
                SubLObject cdolist_list_var = replacement_location_items_pairs;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject replacement_location = NIL;
                        SubLObject replacement_items = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt15);
                        replacement_location = current.first();
                        current = current.rest();
                        replacement_items = current;
                        conjunct_clauses = com.cyc.cycjava.cycl.reformulator_utilities_nl.the_coordination_set_remover_apply_replacement(conjunct_clauses, replacement_location, replacement_items);
                    }
                }
                return simplifier.nconjoin(conjunct_clauses, T);
            }
        }
    }

    public static SubLObject the_coordination_set_remover_reformulate_int(final SubLObject expression) {
        SubLObject replacement_location_items_pairs = NIL;
        SubLObject cdolist_list_var = list_utilities.tree_positions($$TheCoordinationSet, expression, UNPROVIDED, UNPROVIDED);
        SubLObject tcs_position = NIL;
        tcs_position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (tcs_position.isList() && list_utilities.last_one(tcs_position).isZero()) {
                final SubLObject replacement_location = butlast(tcs_position, UNPROVIDED);
                final SubLObject replacement_items = cycl_utilities.nat_args(list_utilities.get_nested_nth(expression, replacement_location, UNPROVIDED), UNPROVIDED);
                replacement_location_items_pairs = list_utilities.alist_enter(replacement_location_items_pairs, replacement_location, replacement_items, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tcs_position = cdolist_list_var.first();
        } 
        SubLObject conjunct_clauses = list(expression);
        SubLObject cdolist_list_var2 = replacement_location_items_pairs;
        SubLObject cons = NIL;
        cons = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject replacement_location2 = NIL;
            SubLObject replacement_items2 = NIL;
            destructuring_bind_must_consp(current, datum, $list15);
            replacement_location2 = current.first();
            current = replacement_items2 = current.rest();
            conjunct_clauses = the_coordination_set_remover_apply_replacement(conjunct_clauses, replacement_location2, replacement_items2);
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons = cdolist_list_var2.first();
        } 
        return simplifier.nconjoin(conjunct_clauses, T);
    }

    public static SubLObject declare_reformulator_utilities_nl_file() {
        declareFunction("try_process_reformulator_for_quantprocP", "TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC?", 1, 0, false);
        declareFunction("reformulate_cycl_quantproc", "REFORMULATE-CYCL-QUANTPROC", 2, 1, false);
        declareFunction("try_process_reformulator_for_quantproc_3P", "TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC-3?", 1, 0, false);
        declareFunction("reformulate_cycls_quantproc_3", "REFORMULATE-CYCLS-QUANTPROC-3", 2, 1, false);
        declareFunction("reformulate_cycl_quantproc_3", "REFORMULATE-CYCL-QUANTPROC-3", 2, 1, false);
        declareFunction("try_process_reformulator_for_quantproc_rulesP", "TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC-RULES?", 1, 0, false);
        declareFunction("reformulate_cycl_quantproc_rules", "REFORMULATE-CYCL-QUANTPROC-RULES", 2, 1, false);
        declareFunction("reformulate_cycls_quantproc_3_rules", "REFORMULATE-CYCLS-QUANTPROC-3-RULES", 2, 1, false);
        declareFunction("reformulate_cycl_quantproc_3_rules", "REFORMULATE-CYCL-QUANTPROC-3-RULES", 2, 1, false);
        declareFunction("try_process_reformulator_for_quantunifyP", "TRY-PROCESS-REFORMULATOR-FOR-QUANTUNIFY?", 1, 0, false);
        declareFunction("reformulate_cycl_quantunify", "REFORMULATE-CYCL-QUANTUNIFY", 2, 1, false);
        declareFunction("try_process_reformulator_for_quantunify_3P", "TRY-PROCESS-REFORMULATOR-FOR-QUANTUNIFY-3?", 1, 0, false);
        declareFunction("reformulate_cycl_quantunify_3", "REFORMULATE-CYCL-QUANTUNIFY-3", 2, 1, false);
        declareFunction("try_process_reformulator_for_negprocP", "TRY-PROCESS-REFORMULATOR-FOR-NEGPROC?", 1, 0, false);
        declareFunction("reformulate_cycl_negproc", "REFORMULATE-CYCL-NEGPROC", 2, 1, false);
        declareFunction("try_process_reformulator_for_vppproc_stateP", "TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-STATE?", 1, 0, false);
        declareFunction("reformulate_cycl_vppproc_state", "REFORMULATE-CYCL-VPPPROC-STATE", 2, 1, false);
        declareFunction("try_to_reformulate_cycls_vppproc_nonstate", "TRY-TO-REFORMULATE-CYCLS-VPPPROC-NONSTATE", 2, 1, false);
        declareFunction("try_to_reformulate_cycl_vppproc_nonstate", "TRY-TO-REFORMULATE-CYCL-VPPPROC-NONSTATE", 2, 1, false);
        declareFunction("try_process_reformulator_for_vppproc_nonstateP", "TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-NONSTATE?", 1, 0, false);
        declareFunction("reformulate_cycl_vppproc_nonstate", "REFORMULATE-CYCL-VPPPROC-NONSTATE", 2, 1, false);
        declareFunction("reformulate_cycls_subcollproc", "REFORMULATE-CYCLS-SUBCOLLPROC", 2, 1, false);
        declareFunction("reformulate_cycl_subcollproc", "REFORMULATE-CYCL-SUBCOLLPROC", 2, 1, false);
        declareFunction("reformulate_cycl_typeshift", "REFORMULATE-CYCL-TYPESHIFT", 2, 1, false);
        declareFunction("reformulate_cycl_quantopt", "REFORMULATE-CYCL-QUANTOPT", 2, 1, false);
        declareFunction("reformulate_cycl_quantopt_3", "REFORMULATE-CYCL-QUANTOPT-3", 2, 1, false);
        declareFunction("reformulate_cycl_the_coordination_set_removal", "REFORMULATE-CYCL-THE-COORDINATION-SET-REMOVAL", 2, 0, false);
        declareFunction("the_coordination_set_remover_expression_required", "THE-COORDINATION-SET-REMOVER-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction("the_coordination_set_remover_apply_replacement", "THE-COORDINATION-SET-REMOVER-APPLY-REPLACEMENT", 3, 0, false);
        declareFunction("the_coordination_set_remover_reformulate_int", "THE-COORDINATION-SET-REMOVER-REFORMULATE-INT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_utilities_nl_file() {
        defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTPROC*", $list0);
        defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTPROC-3*", $list2);
        defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTPROC-RULES*", $list3);
        defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTUNIFY*", $list4);
        defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTUNIFY-3*", $list5);
        defparameter("*REFORMULATOR-SETTINGS-FOR-NEGPROC*", $list6);
        defparameter("*REFORMULATOR-SETTINGS-FOR-VPPPROC-STATE*", $list7);
        defparameter("*REFORMULATOR-SETTINGS-FOR-VPPPROC-NONSTATE*", $list9);
        defparameter("*REFORMULATOR-SETTINGS-FOR-SUBCOLLPROC*", $list10);
        defparameter("*REFORMULATOR-SETTINGS-FOR-TYPESHIFT*", $list11);
        defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTOPT*", $list12);
        defparameter("*REFORMULATOR-SETTINGS-FOR-QUANTOPT-3*", $list13);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierProcessingRLModule"));

    static private final SubLList $list_alt2 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierProcessing-3-RLModule"));

    public static SubLObject setup_reformulator_utilities_nl_file() {
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeKeyword("META-PREDICATES"), list(reader_make_constant_shell("useReformulationRuleForQuantifierProcessing")));

    @Override
    public void declareFunctions() {
        declare_reformulator_utilities_nl_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_utilities_nl_file();
    }

    static private final SubLList $list_alt4 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierUnifierRLModule"));

    @Override
    public void runTopLevelForms() {
        setup_reformulator_utilities_nl_file();
    }

    static private final SubLList $list_alt5 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierUnifier-3-RLModule"));

    static {
    }

    static private final SubLList $list_alt6 = list(makeKeyword("FOCUS"), reader_make_constant_shell("NegationProcessorRLModule"));

    static private final SubLList $list_alt7 = list(makeKeyword("FOCUS"), reader_make_constant_shell("VPPProcessingStateRLModule"));

    static private final SubLList $list_alt9 = list(makeKeyword("FOCUS"), reader_make_constant_shell("VPPProcessingNonStateRLModule"));

    static private final SubLList $list_alt10 = list(makeKeyword("FOCUS"), reader_make_constant_shell("SubcollectionProcessorRLModule"));

    static private final SubLList $list_alt11 = list(makeKeyword("FOCUS"), reader_make_constant_shell("TypeShiftingRLModule"));

    static private final SubLList $list_alt12 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierOptimizerRLModule"));

    static private final SubLList $list_alt13 = list(makeKeyword("FOCUS"), reader_make_constant_shell("QuantifierOptimizer-3-RLModule"));

    static private final SubLList $list_alt15 = cons(makeSymbol("REPLACEMENT-LOCATION"), makeSymbol("REPLACEMENT-ITEMS"));
}

/**
 * Total time: 114 ms
 */
