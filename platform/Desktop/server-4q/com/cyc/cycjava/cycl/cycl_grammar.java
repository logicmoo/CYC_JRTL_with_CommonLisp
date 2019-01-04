package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycl_grammar extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cycl_grammar";
    public static final String myFingerPrint = "ae0e14be6f5769db13aaeaad6e123a22b2600e890f7d81fba9c8903013b54986";
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 930L)
    public static SubLSymbol $grammar_permits_hlP$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 6360L)
    public static SubLSymbol $grammar_uses_kbP$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 6639L)
    public static SubLSymbol $grammar_permits_list_as_terminalP$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 6760L)
    public static SubLSymbol $grammar_permits_symbol_as_terminalP$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 6906L)
    public static SubLSymbol $grammar_permits_non_ascii_stringsP$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 7030L)
    private static SubLSymbol $grammar_permissive_wrt_variablesP$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 7297L)
    private static SubLSymbol $grammar_permits_quoted_forms$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 7445L)
    public static SubLSymbol $within_quote_form$;
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$PWHEN;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$NOTE_WFF_VIOLATION;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$PIF;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$WITHIN_QUOTE_FORM;
    private static final SubLSymbol $kw16$NOT_A_TRUTH_FUNCTION;
    private static final SubLSymbol $kw17$NOT_AN_EL_FORMULA;
    private static final SubLSymbol $sym18$CYCL_SENTENCE_P;
    private static final SubLObject $const19$True;
    private static final SubLObject $const20$False;
    private static final SubLObject $const21$EscapeQuote;
    private static final SubLSymbol $kw22$ARITY_MISMATCH;
    private static final SubLString $str23$unary_operator;
    private static final SubLString $str24$binary_operator;
    private static final SubLString $str25$ternary_operator;
    private static final SubLString $str26$quaternary_operator;
    private static final SubLString $str27$quintary_operator;
    private static final SubLSymbol $kw28$INCLUDE;
    private static final SubLString $str29$regular_quantifier;
    private static final SubLSymbol $kw30$NOT_AN_EL_VARIABLE;
    private static final SubLString $str31$bounded_existential;
    private static final SubLSymbol $kw32$NOT_A_DENOTATIONAL_TERM;
    private static final SubLString $str33$multiple_quantifier;
    private static final SubLSymbol $sym34$CYCL_VARIABLE_P;
    private static final SubLSymbol $kw35$NOT_A_LIST_OF_VARIABLES;
    private static final SubLSymbol $kw36$SEQUENCE_NON_VAR;
    private static final SubLSymbol $kw37$MALFORMED_ARGS;
    private static final SubLString $str38$predicate;
    private static final SubLSymbol $sym39$CYCL_TERM_P;
    private static final SubLObject $const40$Quote;
    private static final SubLObject $const41$QuasiQuote;
    private static final SubLObject $const42$ExpandSubLFn;
    private static final SubLObject $const43$SubLQuoteFn;
    private static final SubLObject $const44$Kappa;
    private static final SubLObject $const45$Lambda;
    private static final SubLObject $const46$SkolemFunctionFn;
    private static final SubLObject $const47$SkolemFuncNFn;
    private static final SubLString $str48$functor;
    private static final SubLString $str49$__ExpandSubLFn_expression;
    private static final SubLString $str50$reserved_constant;
    private static final SubLSymbol $sym51$CYC_VAR_;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1;
    private static final SubLString $str54$__SubLQuoteFn_expression;
    private static final SubLString $str55$__Kappa_expression;
    private static final SubLString $str56$__Lambda_expression;
    private static final SubLString $str57$__SkolemFunctionFn_expression;
    private static final SubLString $str58$__SkolemFuncNFn_expression;
    private static final SubLString $str59$unary_expression;
    private static final SubLSymbol $sym60$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const61$EverythingPSC;
    private static final SubLSymbol $sym62$CYCL_BOOLEAN_SENTENCE_P;
    private static final SubLSymbol $kw63$REGULARIZE;
    private static final SubLSymbol $kw64$NOT_AN_ASCII_STRING;
    private static final SubLSymbol $sym65$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P;
    private static final SubLString $str66$CycL_Grammar_Module_Supercategory;
    private static final SubLString $str67$CycL_Grammar_Subcategory;
    private static final SubLString $str68$CycL_Grammar_Testing_Suite;
    private static final SubLSymbol $sym69$CYCL_FORMULA_P;
    private static final SubLSymbol $kw70$TEST;
    private static final SubLSymbol $kw71$OWNER;
    private static final SubLSymbol $kw72$CLASSES;
    private static final SubLSymbol $kw73$KB;
    private static final SubLSymbol $kw74$FULL;
    private static final SubLSymbol $kw75$WORKING_;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$CYCL_EXPRESSION_P;
    private static final SubLSymbol $kw79$TINY;
    private static final SubLList $list80;
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 7488L)
    public static SubLObject grammar_permits_hlP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_grammar.$grammar_permits_hlP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 7641L)
    public static SubLObject grammar_permits_list_as_terminalP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_grammar.$grammar_permits_list_as_terminalP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 7740L)
    public static SubLObject grammar_permits_non_ascii_stringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_grammar.$grammar_permits_non_ascii_stringsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 7841L)
    public static SubLObject grammar_permissive_wrt_variablesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_grammar.$grammar_permissive_wrt_variablesP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 7940L)
    public static SubLObject grammar_uses_kbP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_grammar.$grammar_uses_kbP$.getDynamicValue(thread) && cycl_grammar.NIL != control_vars.kb_loaded());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 8030L)
    public static SubLObject within_quote_formP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_grammar.$within_quote_form$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 8098L)
    public static SubLObject without_grammar_admitting_hl(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.$sym0$CLET, (SubLObject)cycl_grammar.$list1, ConsesLow.append(body, (SubLObject)cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 8435L)
    public static SubLObject with_grammar_admitting_hl(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.$sym0$CLET, (SubLObject)cycl_grammar.$list2, ConsesLow.append(body, (SubLObject)cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 8665L)
    public static SubLObject without_grammar_using_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.$sym0$CLET, (SubLObject)cycl_grammar.$list3, ConsesLow.append(body, (SubLObject)cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 8896L)
    public static SubLObject with_grammar_using_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.$sym0$CLET, (SubLObject)cycl_grammar.$list4, ConsesLow.append(body, (SubLObject)cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 9158L)
    public static SubLObject gather_syntax_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.$sym0$CLET, (SubLObject)cycl_grammar.$list5, ConsesLow.append(body, (SubLObject)cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 9626L)
    public static SubLObject dont_gather_syntax_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.$sym0$CLET, (SubLObject)cycl_grammar.$list6, ConsesLow.append(body, (SubLObject)cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 9971L)
    public static SubLObject handle_syntax_violation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject violation = (SubLObject)cycl_grammar.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycl_grammar.$list7);
        violation = current.first();
        current = current.rest();
        if (cycl_grammar.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$sym8$PWHEN, (SubLObject)cycl_grammar.$list9, (SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$sym10$NOTE_WFF_VIOLATION, violation));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cycl_grammar.$list7);
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 10343L)
    public static SubLObject within_quote_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.$sym0$CLET, (SubLObject)cycl_grammar.$list11, ConsesLow.append(body, (SubLObject)cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 10448L)
    public static SubLObject allow_escape_quote_when_quote_predicate(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = (SubLObject)cycl_grammar.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycl_grammar.$list12);
        pred = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.$sym13$PIF, (SubLObject)ConsesLow.listS((SubLObject)cycl_grammar.EQL, pred, (SubLObject)cycl_grammar.$list14), reader.bq_cons((SubLObject)cycl_grammar.$sym15$WITHIN_QUOTE_FORM, ConsesLow.append(body, (SubLObject)cycl_grammar.NIL)), ConsesLow.append(body, (SubLObject)cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 10609L)
    public static SubLObject cycl_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = (SubLObject)cycl_grammar.NIL;
        wffP = (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_formulaic_sentence_p(v_object) || cycl_grammar.NIL != cycl_truth_value_p(v_object));
        if (cycl_grammar.NIL == wffP && cycl_grammar.NIL == wff_vars.$wff_violations$.getDynamicValue(thread)) {
            if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
                if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw16$NOT_A_TRUTH_FUNCTION, cycl_formula_predicate(v_object)));
                }
            }
            else if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw17$NOT_AN_EL_FORMULA, v_object));
            }
        }
        return wffP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 12221L)
    public static SubLObject cycl_formulaic_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_unary_sentence_p(v_object) || cycl_grammar.NIL != cycl_binary_sentence_p(v_object) || cycl_grammar.NIL != cycl_quantified_sentence_p(v_object) || cycl_grammar.NIL != cycl_variable_arity_sentence_p(v_object) || cycl_grammar.NIL != cycl_atomic_sentence_p(v_object) || cycl_grammar.NIL != cycl_ternary_sentence_p(v_object) || cycl_grammar.NIL != cycl_quaternary_sentence_p(v_object) || cycl_grammar.NIL != cycl_quintary_sentence_p(v_object) || cycl_grammar.NIL != cycl_user_defined_logical_operator_sentence_p(v_object));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != collection_defns.hl_assertion_p(v_object)) || cycl_grammar.NIL != cycl_variable_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 12794L)
    public static SubLObject cycl_sequence_of_test_p(final SubLObject v_object, final SubLObject test) {
        if (cycl_grammar.NIL != el_utilities.el_sequence_p(v_object)) {
            final SubLObject last = el_utilities.last_of_sequence(v_object).rest();
            if (cycl_grammar.NIL == last) {
                return el_utilities.every_in_sequence(test, v_object);
            }
            if (cycl_grammar.NIL != cycl_variable_p(last)) {
                return el_utilities.every_in_sequence(test, el_utilities.butlast_of_sequence(v_object));
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 13231L)
    public static SubLObject cycl_sentence_sequence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.epsilon_p(v_object) || cycl_grammar.NIL != cycl_variable_p(v_object) || cycl_grammar.NIL != cycl_sequence_of_test_p(v_object, (SubLObject)cycl_grammar.$sym18$CYCL_SENTENCE_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 13574L)
    public static SubLObject cycl_truth_value_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_true_p(v_object) || cycl_grammar.NIL != cycl_false_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 13783L)
    public static SubLObject cycl_true_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, cycl_grammar.$const19$True);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 13850L)
    public static SubLObject cycl_false_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, cycl_grammar.$const20$False);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 13919L)
    public static SubLObject cycl_formula_predicate(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = cycl_utilities.formula_arg0(v_object);
        if (cycl_grammar.NIL != cycl_grammar.$within_quote_form$.getDynamicValue(thread) && cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && cycl_grammar.$const21$EscapeQuote.eql(cycl_utilities.formula_arg0(arg0))) {
            return cycl_utilities.formula_arg1(arg0, (SubLObject)cycl_grammar.UNPROVIDED);
        }
        return arg0;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 14200L)
    public static SubLObject cycl_unary_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_unary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != el_utilities.cyc_const_unary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED).numE((SubLObject)cycl_grammar.ONE_INTEGER)) {
                    return cycl_sentence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED));
                }
                if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), (SubLObject)cycl_grammar.$str23$unary_operator, (SubLObject)cycl_grammar.ONE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 14778L)
    public static SubLObject cycl_binary_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_binary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != el_utilities.cyc_const_binary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED).numE((SubLObject)cycl_grammar.TWO_INTEGER)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
                if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), (SubLObject)cycl_grammar.$str24$binary_operator, (SubLObject)cycl_grammar.TWO_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 15433L)
    public static SubLObject cycl_ternary_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_ternary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != el_utilities.cyc_const_ternary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED).numE((SubLObject)cycl_grammar.THREE_INTEGER)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg3(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
                if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), (SubLObject)cycl_grammar.$str25$ternary_operator, (SubLObject)cycl_grammar.THREE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 16153L)
    public static SubLObject cycl_quaternary_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_quaternary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != el_utilities.cyc_const_quaternary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED).numE((SubLObject)cycl_grammar.FOUR_INTEGER)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg3(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg4(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
                if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), (SubLObject)cycl_grammar.$str26$quaternary_operator, (SubLObject)cycl_grammar.FOUR_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 16948L)
    public static SubLObject cycl_quintary_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_quintary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != el_utilities.cyc_const_quintary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED).numE((SubLObject)cycl_grammar.FIVE_INTEGER)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg3(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg4(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg5(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
                if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), (SubLObject)cycl_grammar.$str27$quintary_operator, (SubLObject)cycl_grammar.FIVE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 17793L)
    public static SubLObject cycl_variable_arity_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_variable_arity_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && cycl_grammar.NIL != el_utilities.cyc_const_variable_arity_logical_op_p(cycl_formula_predicate(v_object)) && cycl_grammar.NIL != el_utilities.wf_wrt_sequence_varsP(v_object) && cycl_grammar.NIL != cycl_sentence_sequence_p(cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 18291L)
    public static SubLObject cycl_user_defined_logical_operator_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_user_defined_logical_operator_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != el_utilities.user_defined_logical_operator_p(cycl_formula_predicate(v_object))) {
                return cycl_sentence_sequence_p(cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE));
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 18817L)
    public static SubLObject cycl_regularly_quantified_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_regularly_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != cycl_regular_quantifier_p(cycl_formula_predicate(v_object))) {
                if (!el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED).numE((SubLObject)cycl_grammar.TWO_INTEGER)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), (SubLObject)cycl_grammar.$str29$regular_quantifier, (SubLObject)cycl_grammar.TWO_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != cycl_variable_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return cycl_sentence_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED));
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw30$NOT_AN_EL_VARIABLE, cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 19651L)
    public static SubLObject cycl_bounded_existential_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_bounded_existential_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != cycl_bounded_existential_quantifier_p(cycl_formula_predicate(v_object))) {
                if (!el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED).numE((SubLObject)cycl_grammar.THREE_INTEGER)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), (SubLObject)cycl_grammar.$str31$bounded_existential, (SubLObject)cycl_grammar.THREE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_denotational_term_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw32$NOT_A_DENOTATIONAL_TERM, cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != cycl_variable_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return cycl_sentence_p(cycl_utilities.formula_arg3(v_object, (SubLObject)cycl_grammar.UNPROVIDED));
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw30$NOT_AN_EL_VARIABLE, cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 20660L)
    public static SubLObject cycl_multiply_quantified_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_multiply_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != cycl_multi_quantifier_p(cycl_formula_predicate(v_object))) {
                if (!el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED).numE((SubLObject)cycl_grammar.TWO_INTEGER)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), (SubLObject)cycl_grammar.$str33$multiple_quantifier, (SubLObject)cycl_grammar.TWO_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else {
                    if (cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED).isList() && cycl_grammar.NIL != list_utilities.every_in_list((SubLObject)cycl_grammar.$sym34$CYCL_VARIABLE_P, cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED), (SubLObject)cycl_grammar.UNPROVIDED)) {
                        return cycl_sentence_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED));
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw35$NOT_A_LIST_OF_VARIABLES, cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 21566L)
    public static SubLObject cycl_logical_operator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.cyc_const_logical_operator_p(v_object) || cycl_grammar.NIL != el_utilities.user_defined_logical_operator_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 21717L)
    public static SubLObject cycl_quantifier_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.cyc_const_quantifier_p(v_object) || cycl_grammar.NIL != cycl_multi_quantifier_p(v_object) || cycl_grammar.NIL != el_utilities.user_defined_bounded_existential_operator_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 21906L)
    public static SubLObject cycl_regular_quantifier_p(final SubLObject v_object) {
        return el_utilities.cyc_const_regular_quantifier_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 22015L)
    public static SubLObject cycl_multi_quantifier_p(final SubLObject v_object) {
        return el_utilities.cyc_const_multi_quantifier_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 22120L)
    public static SubLObject cycl_bounded_existential_quantifier_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.cyc_const_bounded_existential_operator_p(v_object) || cycl_grammar.NIL != ((cycl_grammar.NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread)) ? cycl_grammar.NIL : el_utilities.user_defined_bounded_existential_operator_p(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 22339L)
    public static SubLObject cycl_atomic_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_atomic_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.NIL != cycl_predicate_p(cycl_formula_predicate(v_object))) {
                if (cycl_grammar.NIL == el_utilities.wf_wrt_sequence_varsP(v_object)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw36$SEQUENCE_NON_VAR, v_object, el_utilities.sequence_non_var(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_argument_sequence_p(cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str38$predicate, cycl_formula_predicate(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else if (cycl_grammar.NIL != cycl_formula_has_valid_arityP(v_object)) {
                    return (SubLObject)cycl_grammar.T;
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 23163L)
    public static SubLObject cycl_argument_sequence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.epsilon_p(v_object) || cycl_grammar.NIL != cycl_variable_p(v_object) || cycl_grammar.NIL != cycl_sequence_of_test_p(v_object, (SubLObject)cycl_grammar.$sym39$CYCL_TERM_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 23498L)
    public static SubLObject cycl_predicate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_represented_term_p(v_object) && cycl_grammar.NIL == el_utilities.cyc_const_logical_operator_p(v_object) && cycl_grammar.NIL == el_utilities.cyc_const_quantifier_p(v_object) && (cycl_grammar.NIL == grammar_uses_kbP() || cycl_grammar.NIL != el_utilities.predicate_specP(v_object, (SubLObject)cycl_grammar.$sym34$CYCL_VARIABLE_P)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 24024L)
    public static SubLObject cycl_function_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_represented_term_p(v_object) && cycl_grammar.NIL == el_utilities.cyc_const_logical_operator_p(v_object) && cycl_grammar.NIL == el_utilities.cyc_const_quantifier_p(v_object) && (cycl_grammar.NIL == grammar_uses_kbP() || cycl_grammar.NIL != el_utilities.function_specP(v_object, (SubLObject)cycl_grammar.$sym34$CYCL_VARIABLE_P)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 24570L)
    public static SubLObject cycl_nat_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != nart_handles.nart_p(v_object)) {
            return (SubLObject)cycl_grammar.T;
        }
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (!cycl_grammar.$const40$Quote.eql(cycl_utilities.formula_arg0(v_object)) && !cycl_grammar.$const41$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object))) {
                if (!cycl_grammar.$const21$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object))) {
                    if (cycl_grammar.$const42$ExpandSubLFn.eql(cycl_utilities.formula_arg0(v_object))) {
                        return expand_subl_fn_syntax_p(v_object);
                    }
                    if (cycl_grammar.$const43$SubLQuoteFn.eql(cycl_utilities.formula_arg0(v_object))) {
                        return subl_quote_fn_syntax_p(v_object);
                    }
                    if (cycl_grammar.$const44$Kappa.eql(cycl_utilities.formula_arg0(v_object))) {
                        return kappa_syntax_p(v_object);
                    }
                    if (cycl_grammar.$const45$Lambda.eql(cycl_utilities.formula_arg0(v_object))) {
                        return lambda_syntax_p(v_object);
                    }
                    if (cycl_grammar.$const46$SkolemFunctionFn.eql(cycl_utilities.formula_arg0(v_object))) {
                        return skolem_function_fn_syntax_p(v_object);
                    }
                    if (cycl_grammar.$const47$SkolemFuncNFn.eql(cycl_utilities.formula_arg0(v_object))) {
                        return skolem_func_n_fn_syntax_p(v_object);
                    }
                    if (cycl_grammar.NIL != cycl_function_p(cycl_utilities.formula_arg0(v_object))) {
                        if (cycl_grammar.NIL == el_utilities.wf_wrt_sequence_varsP(v_object)) {
                            if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw36$SEQUENCE_NON_VAR, v_object, el_utilities.sequence_non_var(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                            }
                        }
                        else if (cycl_grammar.NIL == cycl_argument_sequence_p(cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE))) {
                            if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str48$functor, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                            }
                        }
                        else if (cycl_grammar.NIL != cycl_formula_has_valid_arityP(v_object)) {
                            return (SubLObject)cycl_grammar.T;
                        }
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 26011L)
    public static SubLObject cycl_formula_has_valid_arityP(final SubLObject formula) {
        SubLObject validP = (SubLObject)cycl_grammar.T;
        if (cycl_grammar.NIL != grammar_uses_kbP() && cycl_grammar.NIL != wff.mal_arityP(formula)) {
            validP = (SubLObject)cycl_grammar.NIL;
        }
        return validP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 26278L)
    public static SubLObject expand_subl_fn_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const42$ExpandSubLFn.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.TWO_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str49$__ExpandSubLFn_expression, (SubLObject)cycl_grammar.TWO_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_term_sequence_syntax_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != subl_expression_syntax_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return expand_subl_fn_syntax_p_int(v_object);
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 27161L)
    public static SubLObject expand_subl_fn_syntax_p_int(final SubLObject expand_subl_fn) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(expand_subl_fn, (SubLObject)cycl_grammar.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(expand_subl_fn, (SubLObject)cycl_grammar.UNPROVIDED);
        final SubLObject non_variables = Sequences.remove_if((SubLObject)cycl_grammar.$sym51$CYC_VAR_, arg1, (SubLObject)cycl_grammar.UNPROVIDED, (SubLObject)cycl_grammar.UNPROVIDED, (SubLObject)cycl_grammar.UNPROVIDED, (SubLObject)cycl_grammar.UNPROVIDED);
        SubLObject wfP = (SubLObject)cycl_grammar.T;
        SubLObject violating_non_variables = (SubLObject)cycl_grammar.NIL;
        if (cycl_grammar.NIL == non_variables) {
            return (SubLObject)cycl_grammar.T;
        }
        if (non_variables.equal((SubLObject)cycl_grammar.$list52)) {
            return (SubLObject)cycl_grammar.T;
        }
        SubLObject cdolist_list_var = non_variables;
        SubLObject non_variable = (SubLObject)cycl_grammar.NIL;
        non_variable = cdolist_list_var.first();
        while (cycl_grammar.NIL != cdolist_list_var) {
            if (cycl_grammar.NIL == list_utilities.tree_find(non_variable, arg2, (SubLObject)cycl_grammar.EQUAL, (SubLObject)cycl_grammar.UNPROVIDED)) {
                violating_non_variables = (SubLObject)ConsesLow.cons(non_variable, violating_non_variables);
                wfP = (SubLObject)cycl_grammar.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            non_variable = cdolist_list_var.first();
        }
        if (cycl_grammar.NIL != violating_non_variables && cycl_grammar.NIL != wff.note_wff_violationP()) {
            wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw53$EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1, expand_subl_fn, violating_non_variables, cycl_utilities.formula_arg2(expand_subl_fn, (SubLObject)cycl_grammar.UNPROVIDED)));
        }
        return wfP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 27898L)
    public static SubLObject subl_quote_fn_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const43$SubLQuoteFn.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.ONE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str54$__SubLQuoteFn_expression, (SubLObject)cycl_grammar.ONE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != subl_expression_syntax_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return (SubLObject)cycl_grammar.T;
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 28528L)
    public static SubLObject kappa_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const44$Kappa.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.TWO_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str55$__Kappa_expression, (SubLObject)cycl_grammar.TWO_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return (SubLObject)cycl_grammar.T;
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 29330L)
    public static SubLObject lambda_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const45$Lambda.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.TWO_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str56$__Lambda_expression, (SubLObject)cycl_grammar.TWO_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != cycl_denotational_term_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return (SubLObject)cycl_grammar.T;
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 30155L)
    public static SubLObject skolem_function_fn_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const46$SkolemFunctionFn.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.THREE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str57$__SkolemFunctionFn_expression, (SubLObject)cycl_grammar.THREE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_variable_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else {
                    if (cycl_grammar.NIL == cycl_utilities.formula_arg3(v_object, (SubLObject)cycl_grammar.UNPROVIDED) || cycl_grammar.NIL != cycl_variable_p(cycl_utilities.formula_arg3(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return (SubLObject)cycl_grammar.T;
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 31307L)
    public static SubLObject skolem_func_n_fn_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const47$SkolemFuncNFn.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.FOUR_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str58$__SkolemFuncNFn_expression, (SubLObject)cycl_grammar.FOUR_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else if (cycl_grammar.NIL == cycl_variable_p(cycl_utilities.formula_arg2(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else if (cycl_grammar.NIL != cycl_utilities.formula_arg3(v_object, (SubLObject)cycl_grammar.UNPROVIDED) && cycl_grammar.NIL == cycl_variable_p(cycl_utilities.formula_arg3(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != cycl_denotational_term_p(cycl_utilities.formula_arg4(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return (SubLObject)cycl_grammar.T;
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 32658L)
    public static SubLObject cycl_variable_sequence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.epsilon_p(v_object) || cycl_grammar.NIL != cycl_sequence_of_test_p(v_object, (SubLObject)cycl_grammar.$sym34$CYCL_VARIABLE_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 32917L)
    public static SubLObject cycl_term_sequence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.epsilon_p(v_object) || cycl_grammar.NIL != cycl_sequence_of_test_p(v_object, (SubLObject)cycl_grammar.$sym39$CYCL_TERM_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 33170L)
    public static SubLObject cycl_term_sequence_syntax_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cycl_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_uses_kbP$.bind((SubLObject)cycl_grammar.NIL, thread);
            result = cycl_term_sequence_p(v_object);
        }
        finally {
            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 33417L)
    public static SubLObject subl_expression_syntax_p(final SubLObject v_object) {
        return (SubLObject)cycl_grammar.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 33648L)
    public static SubLObject cycl_expression_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_denotational_term_p(v_object) || (cycl_grammar.NIL != within_quote_formP() && cycl_grammar.NIL != escape_quote_syntax_p(v_object)) || cycl_grammar.NIL != cycl_sentence_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 33948L)
    public static SubLObject cycl_term_p(final SubLObject v_object) {
        return cycl_expression_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 34021L)
    public static SubLObject cycl_denotational_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_represented_term_p(v_object) || cycl_grammar.NIL != subl_atomic_term_p(v_object) || cycl_grammar.NIL != ((cycl_grammar.NIL != cycl_grammar.$grammar_permits_quoted_forms$.getDynamicValue(thread)) ? cycl_quoted_term_p(v_object) : cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 34348L)
    public static SubLObject cycl_quoted_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != quote_syntax_p(v_object) || cycl_grammar.NIL != quasi_quote_syntax_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 34576L)
    public static SubLObject fast_cycl_quoted_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && (cycl_grammar.$const40$Quote.eql(cycl_utilities.formula_arg0(v_object)) || cycl_grammar.$const41$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object))) && cycl_grammar.NIL != el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.ONE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 34940L)
    public static SubLObject fast_quasi_quote_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && cycl_grammar.$const41$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object)) && cycl_grammar.NIL != el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.ONE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 35109L)
    public static SubLObject fast_quote_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && cycl_grammar.$const40$Quote.eql(cycl_utilities.formula_arg0(v_object)) && cycl_grammar.NIL != el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.ONE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 35267L)
    public static SubLObject fast_escape_quote_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && cycl_grammar.$const21$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object)) && cycl_grammar.NIL != el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.ONE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 35438L)
    public static SubLObject quiet_quote_syntax_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cycl_grammar.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)cycl_grammar.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)cycl_grammar.NIL, thread);
            result = quote_syntax_p(v_object);
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_2, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 35604L)
    public static SubLObject quote_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const40$Quote.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.ONE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str59$unary_expression, (SubLObject)cycl_grammar.ONE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != quote_arg1_syntax_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return (SubLObject)cycl_grammar.T;
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 36092L)
    public static SubLObject quasi_quote_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const41$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.ONE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str59$unary_expression, (SubLObject)cycl_grammar.ONE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != quote_arg1_syntax_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return (SubLObject)cycl_grammar.T;
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 36598L)
    public static SubLObject quote_arg1_syntax_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cycl_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$within_quote_form$.currentBinding(thread);
        try {
            cycl_grammar.$within_quote_form$.bind((SubLObject)cycl_grammar.T, thread);
            if (cycl_grammar.NIL != cycl_expression_p(v_object) || cycl_grammar.NIL != cycl_quoted_term_p(v_object) || cycl_grammar.NIL != escape_quote_syntax_p(v_object)) {
                result = (SubLObject)cycl_grammar.T;
            }
        }
        finally {
            cycl_grammar.$within_quote_form$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 36836L)
    public static SubLObject escape_quote_syntax_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != el_utilities.el_formula_p(v_object)) {
            if (cycl_grammar.$const21$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object))) {
                if (cycl_grammar.NIL == el_utilities.formula_arityE(v_object, (SubLObject)cycl_grammar.ONE_INTEGER, (SubLObject)cycl_grammar.UNPROVIDED)) {
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw22$ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), (SubLObject)cycl_grammar.$str59$unary_expression, (SubLObject)cycl_grammar.ONE_INTEGER, el_utilities.formula_arity(v_object, (SubLObject)cycl_grammar.UNPROVIDED)));
                    }
                }
                else {
                    if (cycl_grammar.NIL != cycl_expression_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) || cycl_grammar.NIL != cycl_quoted_term_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED)) || cycl_grammar.NIL != escape_quote_syntax_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))) {
                        return (SubLObject)cycl_grammar.T;
                    }
                    if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw37$MALFORMED_ARGS, (SubLObject)cycl_grammar.$str50$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw28$INCLUDE)));
                    }
                }
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 37444L)
    public static SubLObject cycl_constant_or_nat_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_constant_p(v_object) || cycl_grammar.NIL != cycl_nat_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 37559L)
    public static SubLObject cycl_represented_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_constant_p(v_object) || cycl_grammar.NIL != cycl_nat_p(v_object) || cycl_grammar.NIL != cycl_variable_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 37849L)
    public static SubLObject cycl_unrepresented_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != subl_string_p(v_object) || cycl_grammar.NIL != subl_real_number_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 38068L)
    public static SubLObject subl_atomic_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != subl_strict_atomic_term_p(v_object) || (cycl_grammar.NIL != grammar_permits_list_as_terminalP() && v_object.isCons()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 38374L)
    public static SubLObject subl_strict_atomic_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_unrepresented_term_p(v_object) || cycl_grammar.NIL != ((cycl_grammar.NIL != cycl_grammar.$grammar_permits_symbol_as_terminalP$.getDynamicValue(thread)) ? subl_non_variable_symbol_p(v_object) : cycl_grammar.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 38714L)
    public static SubLObject cycl_fort_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_constant_p(v_object) || cycl_grammar.NIL != cycl_nat_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 39079L)
    public static SubLObject cycl_nart_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_grammar.NIL != nart_handles.nart_p(v_object)) {
            return (SubLObject)cycl_grammar.T;
        }
        if (v_object.isCons() && cycl_grammar.NIL != narts_high.find_nart(v_object)) {
            return (SubLObject)cycl_grammar.T;
        }
        if (v_object.isCons()) {
            SubLObject v_answer = (SubLObject)cycl_grammar.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cycl_grammar.$sym60$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cycl_grammar.$const61$EverythingPSC, thread);
                v_answer = czer_utilities.reifiable_termP(v_object);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return v_answer;
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 39423L)
    public static SubLObject cycl_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_nat_p(v_object) && cycl_grammar.NIL == cycl_nart_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 39618L)
    public static SubLObject cycl_quantified_sentence_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_regularly_quantified_sentence_p(v_object) || cycl_grammar.NIL != cycl_multiply_quantified_sentence_p(v_object) || cycl_grammar.NIL != cycl_bounded_existential_sentence_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 40110L)
    public static SubLObject cycl_formula_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_nat_p(v_object) || cycl_grammar.NIL != cycl_formulaic_sentence_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 40225L)
    public static SubLObject cycl_literal_p(final SubLObject v_object) {
        if (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != assertion_handles.assertion_p(v_object)) {
            return cycl_literal_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_atomic_sentence_p(v_object) || (cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && cycl_grammar.NIL != el_utilities.el_negation_p(v_object) && cycl_grammar.NIL != cycl_atomic_sentence_p(cycl_utilities.formula_arg1(v_object, (SubLObject)cycl_grammar.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 40688L)
    public static SubLObject cycl_tensed_literal_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.el_formula_p(obj) && cycl_grammar.NIL != el_utilities.cyc_const_tense_operator_p(el_utilities.literal_predicate(obj, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_literal_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 40959L)
    public static SubLObject cycl_generalized_tensed_literal_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.el_formula_p(obj) && cycl_grammar.NIL != el_utilities.cyc_const_generalized_tense_operator_p(el_utilities.literal_predicate(obj, (SubLObject)cycl_grammar.UNPROVIDED)) && cycl_grammar.NIL != cycl_literal_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 41278L)
    public static SubLObject cycl_strict_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_strict_denotational_term_p(v_object) || cycl_grammar.NIL != cycl_sentence_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 41580L)
    public static SubLObject cycl_strict_denotational_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_represented_term_p(v_object) || cycl_grammar.NIL != subl_strict_atomic_term_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 41849L)
    public static SubLObject proposed_el_formula_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cycl_grammar.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_uses_kbP$.bind((SubLObject)cycl_grammar.NIL, thread);
            cycl_grammar.$grammar_permits_hlP$.bind((SubLObject)cycl_grammar.NIL, thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && (cycl_grammar.NIL != cycl_nat_p(v_object) || cycl_grammar.NIL != cycl_sentence_p(v_object) || cycl_grammar.NIL != collection_defns.cycl_unbound_relation_formula_p(v_object)));
        }
        finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_2, thread);
            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 42156L)
    public static SubLObject cycl_boolean_sentence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_truth_value_p(v_object) || (cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && (cycl_grammar.NIL != cycl_atomic_sentence_p(v_object) || (cycl_grammar.NIL != cycl_logical_operator_p(cycl_utilities.formula_operator(v_object)) && cycl_grammar.NIL != list_utilities.every_in_list((SubLObject)cycl_grammar.$sym62$CYCL_BOOLEAN_SENTENCE_P, cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw63$REGULARIZE), (SubLObject)cycl_grammar.UNPROVIDED)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 43169L)
    public static SubLObject cycl_boolean_combination_of_type(final SubLObject test, final SubLObject v_object) {
        SubLObject result = (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != cycl_truth_value_p(v_object) || cycl_grammar.NIL != Functions.funcall(test, v_object));
        if (cycl_grammar.NIL == result && cycl_grammar.NIL != el_utilities.el_formula_p(v_object) && cycl_grammar.NIL != cycl_logical_operator_p(cycl_utilities.formula_operator(v_object))) {
            SubLObject anti_result = (SubLObject)cycl_grammar.NIL;
            final SubLObject args = cycl_utilities.formula_args(v_object, (SubLObject)cycl_grammar.$kw63$REGULARIZE);
            SubLObject rest;
            SubLObject item;
            for (rest = (SubLObject)cycl_grammar.NIL, rest = args; cycl_grammar.NIL == anti_result && cycl_grammar.NIL != rest; anti_result = (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL == cycl_boolean_combination_of_type(test, item)), rest = rest.rest()) {
                item = rest.first();
            }
            result = (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL == anti_result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 43664L)
    public static SubLObject cycl_constant_p(final SubLObject v_object) {
        return constant_handles.constant_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 43809L)
    public static SubLObject subl_string_p(final SubLObject v_object) {
        if (v_object.isString()) {
            if (cycl_grammar.NIL != grammar_permits_non_ascii_stringsP()) {
                return (SubLObject)cycl_grammar.T;
            }
            if (cycl_grammar.NIL != unicode_strings.ascii_string_p(v_object)) {
                return (SubLObject)cycl_grammar.T;
            }
            if (cycl_grammar.NIL != wff.note_wff_violationP()) {
                wff.note_wff_violation((SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$kw64$NOT_AN_ASCII_STRING, v_object));
            }
        }
        return (SubLObject)cycl_grammar.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 44058L)
    public static SubLObject subl_real_number_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != subl_integer_p(v_object) || cycl_grammar.NIL != subl_float_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 44168L)
    public static SubLObject subl_float_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isNumber() && cycl_grammar.NIL == subl_integer_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 44276L)
    public static SubLObject subl_integer_p(final SubLObject v_object) {
        return Types.integerp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 44343L)
    public static SubLObject subl_non_variable_symbol_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && cycl_grammar.NIL == el_variable_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 44464L)
    public static SubLObject subl_non_variable_non_keyword_symbol_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != subl_non_variable_symbol_p(v_object) && !v_object.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 44620L)
    public static SubLObject cycl_variable_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_grammar.NIL != el_variable_p(v_object) || cycl_grammar.NIL != meta_variable_p(v_object) || (cycl_grammar.NIL != grammar_permits_hlP() && cycl_grammar.NIL != hl_variable_p(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 44880L)
    public static SubLObject meta_variable_p(final SubLObject v_object) {
        return cycl_variables.keyword_varP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 44989L)
    public static SubLObject el_variable_p(final SubLObject v_object) {
        return cycl_variables.el_varP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 45054L)
    public static SubLObject hl_variable_p(final SubLObject v_object) {
        return variables.variable_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 45122L)
    public static SubLObject el_var_list_operator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.eql(cycl_grammar.$const44$Kappa) || v_object.eql(cycl_grammar.$const45$Lambda));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 45528L)
    public static SubLObject why_not_cycl_sentence(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = (SubLObject)cycl_grammar.NIL;
        SubLObject violation_string = (SubLObject)cycl_grammar.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$wff_violations$.bind((SubLObject)cycl_grammar.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)cycl_grammar.T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)cycl_grammar.T, thread);
            wffP = cycl_sentence_p(v_object);
            violation_string = wff.explain_wff_violations(Sequences.nreverse(wff_vars.$wff_violations$.getDynamicValue(thread)));
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
        }
        return Values.values(violation_string, wffP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 46082L)
    public static SubLObject why_not_cycl_expression(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = (SubLObject)cycl_grammar.NIL;
        SubLObject violation_string = (SubLObject)cycl_grammar.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$wff_violations$.bind((SubLObject)cycl_grammar.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)cycl_grammar.T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)cycl_grammar.T, thread);
            wffP = cycl_expression_p(v_object);
            violation_string = wff.explain_wff_violations(Sequences.nreverse(wff_vars.$wff_violations$.getDynamicValue(thread)));
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
        }
        return Values.values(violation_string, wffP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-grammar.lisp", position = 46561L)
    public static SubLObject why_not_cycl_term(final SubLObject v_object) {
        return why_not_cycl_expression(v_object);
    }
    
    public static SubLObject declare_cycl_grammar_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "grammar_permits_hlP", "GRAMMAR-PERMITS-HL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "grammar_permits_list_as_terminalP", "GRAMMAR-PERMITS-LIST-AS-TERMINAL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "grammar_permits_non_ascii_stringsP", "GRAMMAR-PERMITS-NON-ASCII-STRINGS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "grammar_permissive_wrt_variablesP", "GRAMMAR-PERMISSIVE-WRT-VARIABLES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "grammar_uses_kbP", "GRAMMAR-USES-KB?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "within_quote_formP", "WITHIN-QUOTE-FORM?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "without_grammar_admitting_hl", "WITHOUT-GRAMMAR-ADMITTING-HL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "with_grammar_admitting_hl", "WITH-GRAMMAR-ADMITTING-HL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "without_grammar_using_kb", "WITHOUT-GRAMMAR-USING-KB");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "with_grammar_using_kb", "WITH-GRAMMAR-USING-KB");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "gather_syntax_violations", "GATHER-SYNTAX-VIOLATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "dont_gather_syntax_violations", "DONT-GATHER-SYNTAX-VIOLATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "handle_syntax_violation", "HANDLE-SYNTAX-VIOLATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "within_quote_form", "WITHIN-QUOTE-FORM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_grammar", "allow_escape_quote_when_quote_predicate", "ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_sentence_p", "CYCL-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_formulaic_sentence_p", "CYCL-FORMULAIC-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_sequence_of_test_p", "CYCL-SEQUENCE-OF-TEST-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_sentence_sequence_p", "CYCL-SENTENCE-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_truth_value_p", "CYCL-TRUTH-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_true_p", "CYCL-TRUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_false_p", "CYCL-FALSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_formula_predicate", "CYCL-FORMULA-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_unary_sentence_p", "CYCL-UNARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_binary_sentence_p", "CYCL-BINARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_ternary_sentence_p", "CYCL-TERNARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_quaternary_sentence_p", "CYCL-QUATERNARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_quintary_sentence_p", "CYCL-QUINTARY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_variable_arity_sentence_p", "CYCL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_user_defined_logical_operator_sentence_p", "CYCL-USER-DEFINED-LOGICAL-OPERATOR-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_regularly_quantified_sentence_p", "CYCL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_bounded_existential_sentence_p", "CYCL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_multiply_quantified_sentence_p", "CYCL-MULTIPLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_logical_operator_p", "CYCL-LOGICAL-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_quantifier_p", "CYCL-QUANTIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_regular_quantifier_p", "CYCL-REGULAR-QUANTIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_multi_quantifier_p", "CYCL-MULTI-QUANTIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_bounded_existential_quantifier_p", "CYCL-BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_atomic_sentence_p", "CYCL-ATOMIC-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_argument_sequence_p", "CYCL-ARGUMENT-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_predicate_p", "CYCL-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_function_p", "CYCL-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_nat_p", "CYCL-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_formula_has_valid_arityP", "CYCL-FORMULA-HAS-VALID-ARITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "expand_subl_fn_syntax_p", "EXPAND-SUBL-FN-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "expand_subl_fn_syntax_p_int", "EXPAND-SUBL-FN-SYNTAX-P-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_quote_fn_syntax_p", "SUBL-QUOTE-FN-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "kappa_syntax_p", "KAPPA-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "lambda_syntax_p", "LAMBDA-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "skolem_function_fn_syntax_p", "SKOLEM-FUNCTION-FN-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "skolem_func_n_fn_syntax_p", "SKOLEM-FUNC-N-FN-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_variable_sequence_p", "CYCL-VARIABLE-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_term_sequence_p", "CYCL-TERM-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_term_sequence_syntax_p", "CYCL-TERM-SEQUENCE-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_expression_syntax_p", "SUBL-EXPRESSION-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_expression_p", "CYCL-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_term_p", "CYCL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_denotational_term_p", "CYCL-DENOTATIONAL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_quoted_term_p", "CYCL-QUOTED-TERM-P", 1, 0, false);
        new $cycl_quoted_term_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "fast_cycl_quoted_term_p", "FAST-CYCL-QUOTED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "fast_quasi_quote_term_p", "FAST-QUASI-QUOTE-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "fast_quote_term_p", "FAST-QUOTE-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "fast_escape_quote_term_p", "FAST-ESCAPE-QUOTE-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "quiet_quote_syntax_p", "QUIET-QUOTE-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "quote_syntax_p", "QUOTE-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "quasi_quote_syntax_p", "QUASI-QUOTE-SYNTAX-P", 1, 0, false);
        new $quasi_quote_syntax_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "quote_arg1_syntax_p", "QUOTE-ARG1-SYNTAX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "escape_quote_syntax_p", "ESCAPE-QUOTE-SYNTAX-P", 1, 0, false);
        new $escape_quote_syntax_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_constant_or_nat_p", "CYCL-CONSTANT-OR-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_represented_term_p", "CYCL-REPRESENTED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_unrepresented_term_p", "CYCL-UNREPRESENTED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_atomic_term_p", "SUBL-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_strict_atomic_term_p", "SUBL-STRICT-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_fort_p", "CYCL-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_nart_p", "CYCL-NART-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_naut_p", "CYCL-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_quantified_sentence_p", "CYCL-QUANTIFIED-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_formula_p", "CYCL-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_literal_p", "CYCL-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_tensed_literal_p", "CYCL-TENSED-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_generalized_tensed_literal_p", "CYCL-GENERALIZED-TENSED-LITERAL-P", 1, 0, false);
        new $cycl_generalized_tensed_literal_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_strict_term_p", "CYCL-STRICT-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_strict_denotational_term_p", "CYCL-STRICT-DENOTATIONAL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "proposed_el_formula_p", "PROPOSED-EL-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_boolean_sentence_p", "CYCL-BOOLEAN-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_boolean_combination_of_type", "CYCL-BOOLEAN-COMBINATION-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_constant_p", "CYCL-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_string_p", "SUBL-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_real_number_p", "SUBL-REAL-NUMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_float_p", "SUBL-FLOAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_integer_p", "SUBL-INTEGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_non_variable_symbol_p", "SUBL-NON-VARIABLE-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "subl_non_variable_non_keyword_symbol_p", "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "cycl_variable_p", "CYCL-VARIABLE-P", 1, 0, false);
        new $cycl_variable_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "meta_variable_p", "META-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "el_variable_p", "EL-VARIABLE-P", 1, 0, false);
        new $el_variable_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "hl_variable_p", "HL-VARIABLE-P", 1, 0, false);
        new $hl_variable_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "el_var_list_operator_p", "EL-VAR-LIST-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "why_not_cycl_sentence", "WHY-NOT-CYCL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "why_not_cycl_expression", "WHY-NOT-CYCL-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_grammar", "why_not_cycl_term", "WHY-NOT-CYCL-TERM", 1, 0, false);
        return (SubLObject)cycl_grammar.NIL;
    }
    
    public static SubLObject init_cycl_grammar_file() {
        cycl_grammar.$grammar_permits_hlP$ = SubLFiles.defvar("*GRAMMAR-PERMITS-HL?*", (SubLObject)cycl_grammar.T);
        cycl_grammar.$grammar_uses_kbP$ = SubLFiles.defvar("*GRAMMAR-USES-KB?*", (SubLObject)cycl_grammar.T);
        cycl_grammar.$grammar_permits_list_as_terminalP$ = SubLFiles.defparameter("*GRAMMAR-PERMITS-LIST-AS-TERMINAL?*", (SubLObject)cycl_grammar.NIL);
        cycl_grammar.$grammar_permits_symbol_as_terminalP$ = SubLFiles.defparameter("*GRAMMAR-PERMITS-SYMBOL-AS-TERMINAL?*", (SubLObject)cycl_grammar.NIL);
        cycl_grammar.$grammar_permits_non_ascii_stringsP$ = SubLFiles.defparameter("*GRAMMAR-PERMITS-NON-ASCII-STRINGS?*", (SubLObject)cycl_grammar.NIL);
        cycl_grammar.$grammar_permissive_wrt_variablesP$ = SubLFiles.defparameter("*GRAMMAR-PERMISSIVE-WRT-VARIABLES?*", (SubLObject)cycl_grammar.T);
        cycl_grammar.$grammar_permits_quoted_forms$ = SubLFiles.defparameter("*GRAMMAR-PERMITS-QUOTED-FORMS*", (SubLObject)cycl_grammar.T);
        cycl_grammar.$within_quote_form$ = SubLFiles.defvar("*WITHIN-QUOTE-FORM*", (SubLObject)cycl_grammar.NIL);
        return (SubLObject)cycl_grammar.NIL;
    }
    
    public static SubLObject setup_cycl_grammar_file() {
        utilities_macros.register_kb_function((SubLObject)cycl_grammar.$sym65$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
        sunit_external.define_test_category((SubLObject)cycl_grammar.$str66$CycL_Grammar_Module_Supercategory, (SubLObject)cycl_grammar.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)cycl_grammar.$str67$CycL_Grammar_Subcategory, (SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$str66$CycL_Grammar_Module_Supercategory));
        sunit_external.define_test_suite((SubLObject)cycl_grammar.$str68$CycL_Grammar_Testing_Suite, (SubLObject)ConsesLow.list((SubLObject)cycl_grammar.$str66$CycL_Grammar_Module_Supercategory), (SubLObject)cycl_grammar.UNPROVIDED, (SubLObject)cycl_grammar.UNPROVIDED);
        generic_testing.define_test_case_table_int((SubLObject)cycl_grammar.$sym69$CYCL_FORMULA_P, (SubLObject)ConsesLow.list(new SubLObject[] { cycl_grammar.$kw70$TEST, cycl_grammar.NIL, cycl_grammar.$kw71$OWNER, cycl_grammar.NIL, cycl_grammar.$kw72$CLASSES, cycl_grammar.NIL, cycl_grammar.$kw73$KB, cycl_grammar.$kw74$FULL, cycl_grammar.$kw75$WORKING_, cycl_grammar.T }), (SubLObject)cycl_grammar.$list76);
        generic_testing.define_test_case_table_int((SubLObject)cycl_grammar.$sym18$CYCL_SENTENCE_P, (SubLObject)ConsesLow.list(new SubLObject[] { cycl_grammar.$kw70$TEST, cycl_grammar.NIL, cycl_grammar.$kw71$OWNER, cycl_grammar.NIL, cycl_grammar.$kw72$CLASSES, cycl_grammar.NIL, cycl_grammar.$kw73$KB, cycl_grammar.$kw74$FULL, cycl_grammar.$kw75$WORKING_, cycl_grammar.T }), (SubLObject)cycl_grammar.$list77);
        generic_testing.define_test_case_table_int((SubLObject)cycl_grammar.$sym78$CYCL_EXPRESSION_P, (SubLObject)ConsesLow.list(new SubLObject[] { cycl_grammar.$kw70$TEST, cycl_grammar.NIL, cycl_grammar.$kw71$OWNER, cycl_grammar.NIL, cycl_grammar.$kw72$CLASSES, cycl_grammar.NIL, cycl_grammar.$kw73$KB, cycl_grammar.$kw79$TINY, cycl_grammar.$kw75$WORKING_, cycl_grammar.T }), (SubLObject)cycl_grammar.$list80);
        return (SubLObject)cycl_grammar.NIL;
    }
    
    public void declareFunctions() {
        declare_cycl_grammar_file();
    }
    
    public void initializeVariables() {
        init_cycl_grammar_file();
    }
    
    public void runTopLevelForms() {
        setup_cycl_grammar_file();
    }
    
    static {
        me = (SubLFile)new cycl_grammar();
        cycl_grammar.$grammar_permits_hlP$ = null;
        cycl_grammar.$grammar_uses_kbP$ = null;
        cycl_grammar.$grammar_permits_list_as_terminalP$ = null;
        cycl_grammar.$grammar_permits_symbol_as_terminalP$ = null;
        cycl_grammar.$grammar_permits_non_ascii_stringsP$ = null;
        cycl_grammar.$grammar_permissive_wrt_variablesP$ = null;
        cycl_grammar.$grammar_permits_quoted_forms$ = null;
        cycl_grammar.$within_quote_form$ = null;
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GRAMMAR-PERMITS-HL?*"), (SubLObject)cycl_grammar.NIL));
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GRAMMAR-PERMITS-HL?*"), (SubLObject)cycl_grammar.T));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GRAMMAR-USES-KB?*"), (SubLObject)cycl_grammar.NIL));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GRAMMAR-USES-KB?*"), (SubLObject)cycl_grammar.T));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WFF-VIOLATIONS*"), (SubLObject)cycl_grammar.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NOTING-WFF-VIOLATIONS?*"), (SubLObject)cycl_grammar.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), (SubLObject)cycl_grammar.T));
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NOTING-WFF-VIOLATIONS?*"), (SubLObject)cycl_grammar.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), (SubLObject)cycl_grammar.NIL));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VIOLATION"));
        $sym8$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTE-WFF-VIOLATION?"));
        $sym10$NOTE_WFF_VIOLATION = SubLObjectFactory.makeSymbol("NOTE-WFF-VIOLATION");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-QUOTE-FORM*"), (SubLObject)cycl_grammar.T));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list14 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")));
        $sym15$WITHIN_QUOTE_FORM = SubLObjectFactory.makeSymbol("WITHIN-QUOTE-FORM");
        $kw16$NOT_A_TRUTH_FUNCTION = SubLObjectFactory.makeKeyword("NOT-A-TRUTH-FUNCTION");
        $kw17$NOT_AN_EL_FORMULA = SubLObjectFactory.makeKeyword("NOT-AN-EL-FORMULA");
        $sym18$CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $const19$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const20$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const21$EscapeQuote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EscapeQuote"));
        $kw22$ARITY_MISMATCH = SubLObjectFactory.makeKeyword("ARITY-MISMATCH");
        $str23$unary_operator = SubLObjectFactory.makeString("unary operator");
        $str24$binary_operator = SubLObjectFactory.makeString("binary operator");
        $str25$ternary_operator = SubLObjectFactory.makeString("ternary operator");
        $str26$quaternary_operator = SubLObjectFactory.makeString("quaternary operator");
        $str27$quintary_operator = SubLObjectFactory.makeString("quintary operator");
        $kw28$INCLUDE = SubLObjectFactory.makeKeyword("INCLUDE");
        $str29$regular_quantifier = SubLObjectFactory.makeString("regular quantifier");
        $kw30$NOT_AN_EL_VARIABLE = SubLObjectFactory.makeKeyword("NOT-AN-EL-VARIABLE");
        $str31$bounded_existential = SubLObjectFactory.makeString("bounded existential");
        $kw32$NOT_A_DENOTATIONAL_TERM = SubLObjectFactory.makeKeyword("NOT-A-DENOTATIONAL-TERM");
        $str33$multiple_quantifier = SubLObjectFactory.makeString("multiple quantifier");
        $sym34$CYCL_VARIABLE_P = SubLObjectFactory.makeSymbol("CYCL-VARIABLE-P");
        $kw35$NOT_A_LIST_OF_VARIABLES = SubLObjectFactory.makeKeyword("NOT-A-LIST-OF-VARIABLES");
        $kw36$SEQUENCE_NON_VAR = SubLObjectFactory.makeKeyword("SEQUENCE-NON-VAR");
        $kw37$MALFORMED_ARGS = SubLObjectFactory.makeKeyword("MALFORMED-ARGS");
        $str38$predicate = SubLObjectFactory.makeString("predicate");
        $sym39$CYCL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-TERM-P");
        $const40$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $const41$QuasiQuote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuasiQuote"));
        $const42$ExpandSubLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $const43$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $const44$Kappa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $const45$Lambda = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lambda"));
        $const46$SkolemFunctionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn"));
        $const47$SkolemFuncNFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFuncNFn"));
        $str48$functor = SubLObjectFactory.makeString("functor");
        $str49$__ExpandSubLFn_expression = SubLObjectFactory.makeString("#$ExpandSubLFn expression");
        $str50$reserved_constant = SubLObjectFactory.makeString("reserved constant");
        $sym51$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $list52 = ConsesLow.list((SubLObject)cycl_grammar.NIL);
        $kw53$EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1 = SubLObjectFactory.makeKeyword("EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1");
        $str54$__SubLQuoteFn_expression = SubLObjectFactory.makeString("#$SubLQuoteFn expression");
        $str55$__Kappa_expression = SubLObjectFactory.makeString("#$Kappa expression");
        $str56$__Lambda_expression = SubLObjectFactory.makeString("#$Lambda expression");
        $str57$__SkolemFunctionFn_expression = SubLObjectFactory.makeString("#$SkolemFunctionFn expression");
        $str58$__SkolemFuncNFn_expression = SubLObjectFactory.makeString("#$SkolemFuncNFn expression");
        $str59$unary_expression = SubLObjectFactory.makeString("unary expression");
        $sym60$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const61$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym62$CYCL_BOOLEAN_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-BOOLEAN-SENTENCE-P");
        $kw63$REGULARIZE = SubLObjectFactory.makeKeyword("REGULARIZE");
        $kw64$NOT_AN_ASCII_STRING = SubLObjectFactory.makeKeyword("NOT-AN-ASCII-STRING");
        $sym65$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = SubLObjectFactory.makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");
        $str66$CycL_Grammar_Module_Supercategory = SubLObjectFactory.makeString("CycL-Grammar Module Supercategory");
        $str67$CycL_Grammar_Subcategory = SubLObjectFactory.makeString("CycL Grammar Subcategory");
        $str68$CycL_Grammar_Testing_Suite = SubLObjectFactory.makeString("CycL Grammar Testing Suite");
        $sym69$CYCL_FORMULA_P = SubLObjectFactory.makeSymbol("CYCL-FORMULA-P");
        $kw70$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw71$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw72$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw73$KB = SubLObjectFactory.makeKeyword("KB");
        $kw74$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw75$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list76 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeKeyword("ARG1"), (SubLObject)SubLObjectFactory.makeKeyword("ARG2"))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)cycl_grammar.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))))), (SubLObject)cycl_grammar.NIL) });
        $list77 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeKeyword("ARG1"), (SubLObject)SubLObjectFactory.makeKeyword("ARG2"))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("??Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("??Y"))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("ARG1"))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("?X")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TLVariableFn")), (SubLObject)cycl_grammar.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))))), (SubLObject)cycl_grammar.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAllVars")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)cycl_grammar.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAllVars")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)cycl_grammar.NIL) });
        $sym78$CYCL_EXPRESSION_P = SubLObjectFactory.makeSymbol("CYCL-EXPRESSION-P");
        $kw79$TINY = SubLObjectFactory.makeKeyword("TINY");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?WHERE")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), (SubLObject)cycl_grammar.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?WHERE")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)cycl_grammar.NIL)), (SubLObject)cycl_grammar.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFuncNFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?WHERE")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeInteger(212))), (SubLObject)cycl_grammar.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFuncNFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?WHERE")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)cycl_grammar.NIL, (SubLObject)SubLObjectFactory.makeInteger(212))), (SubLObject)cycl_grammar.T));
    }
    
    public static final class $cycl_quoted_term_p$UnaryFunction extends UnaryFunction
    {
        public $cycl_quoted_term_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-QUOTED-TERM-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_grammar.cycl_quoted_term_p(arg1);
        }
    }
    
    public static final class $quasi_quote_syntax_p$UnaryFunction extends UnaryFunction
    {
        public $quasi_quote_syntax_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QUASI-QUOTE-SYNTAX-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_grammar.quasi_quote_syntax_p(arg1);
        }
    }
    
    public static final class $escape_quote_syntax_p$UnaryFunction extends UnaryFunction
    {
        public $escape_quote_syntax_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ESCAPE-QUOTE-SYNTAX-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_grammar.escape_quote_syntax_p(arg1);
        }
    }
    
    public static final class $cycl_generalized_tensed_literal_p$UnaryFunction extends UnaryFunction
    {
        public $cycl_generalized_tensed_literal_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-GENERALIZED-TENSED-LITERAL-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_grammar.cycl_generalized_tensed_literal_p(arg1);
        }
    }
    
    public static final class $cycl_variable_p$UnaryFunction extends UnaryFunction
    {
        public $cycl_variable_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_grammar.cycl_variable_p(arg1);
        }
    }
    
    public static final class $el_variable_p$UnaryFunction extends UnaryFunction
    {
        public $el_variable_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EL-VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_grammar.el_variable_p(arg1);
        }
    }
    
    public static final class $hl_variable_p$UnaryFunction extends UnaryFunction
    {
        public $hl_variable_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_grammar.hl_variable_p(arg1);
        }
    }
}

/*

	Total time: 440 ms
	
*/