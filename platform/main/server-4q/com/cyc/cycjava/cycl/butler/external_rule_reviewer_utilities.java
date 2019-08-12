/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.butler;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EXTERNAL-RULE-REVIEWER-UTILITIES
 * source file: /cyc/top/cycl/butler/external-rule-reviewer-utilities.lisp
 * created:     2019/07/03 17:39:04
 */
public final class external_rule_reviewer_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new external_rule_reviewer_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.butler.external_rule_reviewer_utilities";


    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLFloat $float$0_5 = makeDouble(0.5);





    static private final SubLList $list6 = list(reader_make_constant_shell("and"), reader_make_constant_shell("or"));

    static private final SubLString $$$If_ = makeString("If ");

    static private final SubLString $str8$__ = makeString("..");

    // Definitions
    public static final SubLObject get_random_rule_alt() {
        if (NIL != number_utilities.true_with_probability($float$0_5)) {
            return NIL;
        }
        sleep(TWO_INTEGER);
        {
            SubLObject assertions = kb_mapping.gather_predicate_extent_index($$suggestedRule, $$SuggestedRulesMt, UNPROVIDED);
            SubLObject assertion_lists = Mapping.mapcar(ASSERTION_FORMULA, assertions);
            SubLObject rules = Mapping.mapcar(CADR, assertion_lists);
            return list_utilities.random_element(rules);
        }
    }

    // Definitions
    public static SubLObject get_random_rule() {
        if (NIL != number_utilities.true_with_probability($float$0_5)) {
            return NIL;
        }
        sleep(TWO_INTEGER);
        final SubLObject assertions = kb_mapping.gather_predicate_extent_index($$suggestedRule, $$SuggestedRulesMt, UNPROVIDED);
        final SubLObject assertion_lists = Mapping.mapcar(ASSERTION_FORMULA, assertions);
        final SubLObject rules = Mapping.mapcar(CADR, assertion_lists);
        return list_utilities.random_element(rules);
    }

    public static final SubLObject random_rule_validP_alt(SubLObject rule) {
        sleep(TWO_INTEGER);
        return number_utilities.true_with_probability($float$0_5);
    }

    public static SubLObject random_rule_validP(final SubLObject rule) {
        sleep(TWO_INTEGER);
        return number_utilities.true_with_probability($float$0_5);
    }

    public static final SubLObject get_rule_synopsis_alt(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(rule, EL_IMPLICATION_P);
            {
                SubLObject result = NIL;
                SubLObject first_clause = (NIL != member(list_utilities.caadr(rule), $list_alt6, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (cadr(cadr(rule)))) : cadr(rule);
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                        {
                            SubLObject text = pph_main.generate_text(first_clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject synopsis = cconcatenate($str_alt7$If_, new SubLObject[]{ text, $str_alt8$__ });
                            result = synopsis;
                        }
                    } finally {
                        pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject get_rule_synopsis(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_implication_p(rule) : "! el_utilities.el_implication_p(rule) " + ("el_utilities.el_implication_p(rule) " + "CommonSymbols.NIL != el_utilities.el_implication_p(rule) ") + rule;
        SubLObject result = NIL;
        final SubLObject first_clause = (NIL != member(list_utilities.caadr(rule), $list6, UNPROVIDED, UNPROVIDED)) ? cadr(cadr(rule)) : cadr(rule);
        final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
            final SubLObject text = pph_main.generate_text(first_clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject synopsis = result = cconcatenate($$$If_, new SubLObject[]{ text, $str8$__ });
        } finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject declare_external_rule_reviewer_utilities_file() {
        declareFunction("get_random_rule", "GET-RANDOM-RULE", 0, 0, false);
        declareFunction("random_rule_validP", "RANDOM-RULE-VALID?", 1, 0, false);
        declareFunction("get_rule_synopsis", "GET-RULE-SYNOPSIS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_external_rule_reviewer_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_external_rule_reviewer_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_external_rule_reviewer_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_external_rule_reviewer_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_external_rule_reviewer_utilities_file();
    }

    static {
    }

    static private final SubLList $list_alt6 = list(reader_make_constant_shell("and"), reader_make_constant_shell("or"));

    static private final SubLString $str_alt7$If_ = makeString("If ");

    static private final SubLString $str_alt8$__ = makeString("..");
}

/**
 * Total time: 79 ms
 */
