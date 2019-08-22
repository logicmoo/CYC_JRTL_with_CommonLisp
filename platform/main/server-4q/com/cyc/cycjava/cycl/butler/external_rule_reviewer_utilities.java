package com.cyc.cycjava.cycl.butler;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class external_rule_reviewer_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new external_rule_reviewer_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.butler.external_rule_reviewer_utilities";

    public static final String myFingerPrint = "fb9cdeefc649aaa3fdc10e51f8798e2f0b21c58cfa96e5827520d683a00ce308";

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLObject $$suggestedRule = reader_make_constant_shell(makeString("suggestedRule"));

    private static final SubLObject $$SuggestedRulesMt = reader_make_constant_shell(makeString("SuggestedRulesMt"));







    public static final SubLList $list6 = list(reader_make_constant_shell(makeString("and")), reader_make_constant_shell(makeString("or")));

    public static final SubLString $$$If_ = makeString("If ");

    public static final SubLString $str8$__ = makeString("..");

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

    public static SubLObject random_rule_validP(final SubLObject rule) {
        sleep(TWO_INTEGER);
        return number_utilities.true_with_probability($float$0_5);
    }

    public static SubLObject get_rule_synopsis(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_implication_p(rule) : "el_utilities.el_implication_p(rule) " + "CommonSymbols.NIL != el_utilities.el_implication_p(rule) " + rule;
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
        declareFunction(me, "get_random_rule", "GET-RANDOM-RULE", 0, 0, false);
        declareFunction(me, "random_rule_validP", "RANDOM-RULE-VALID?", 1, 0, false);
        declareFunction(me, "get_rule_synopsis", "GET-RULE-SYNOPSIS", 1, 0, false);
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

    
}

/**
 * Total time: 79 ms
 */
