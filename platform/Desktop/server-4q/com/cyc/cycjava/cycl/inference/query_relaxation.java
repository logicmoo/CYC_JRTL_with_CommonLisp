package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class query_relaxation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.query_relaxation";
    public static final String myFingerPrint = "3454002a1533d4b1e43feb1114e5592ed507d2e81dc2414b70685efa9951171a";
    private static final SubLObject $const0$QueryRelaxationStrategy_RemoveLit;
    private static final SubLObject $const1$QueryRelaxationStrategyChangeValu;
    private static final SubLString $str2$time_to_implement_support_for__S;
    private static final SubLObject $const3$strategyHasPredicateOrder;
    private static final SubLSymbol $kw4$TRUE;
    private static final SubLList $list5;
    private static final SubLObject $const6$valueChangeListForStrategy;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLObject $const11$DaysDuration;
    private static final SubLSymbol $sym12$CONJUNCTION_WITH_TARGET_LITERAL_P;
    private static final SubLSymbol $sym13$CONJUNCTION_WITHOUT_TARGET_LITERAL;
    private static final SubLSymbol $sym14$FORMULA_OPERATOR;
    private static final SubLSymbol $sym15$CYCL_REMOVE_PREDICATE_LITERALS_FROM_SENTENCE;
    private static final SubLSymbol $kw16$TEST;
    private static final SubLSymbol $kw17$OWNER;
    private static final SubLSymbol $kw18$CLASSES;
    private static final SubLSymbol $kw19$KB;
    private static final SubLSymbol $kw20$TINY;
    private static final SubLSymbol $kw21$WORKING_;
    private static final SubLList $list22;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 1133L)
    public static SubLObject new_cyc_query_with_relaxation(SubLObject sentence, SubLObject mt, SubLObject relaxation, SubLObject query_properties) {
        if (mt == query_relaxation.UNPROVIDED) {
            mt = (SubLObject)query_relaxation.NIL;
        }
        if (relaxation == query_relaxation.UNPROVIDED) {
            relaxation = (SubLObject)query_relaxation.NIL;
        }
        if (query_properties == query_relaxation.UNPROVIDED) {
            query_properties = (SubLObject)query_relaxation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_inferences = (SubLObject)query_relaxation.NIL;
        SubLObject all_metrics = (SubLObject)query_relaxation.NIL;
        SubLObject last_results = (SubLObject)query_relaxation.NIL;
        SubLObject last_halt_reason = (SubLObject)query_relaxation.NIL;
        SubLObject done = (SubLObject)query_relaxation.NIL;
        while (query_relaxation.NIL == done) {
            thread.resetMultipleValues();
            final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
            final SubLObject halt_reason = thread.secondMultipleValue();
            final SubLObject inference = thread.thirdMultipleValue();
            final SubLObject metrics = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            last_results = results;
            last_halt_reason = halt_reason;
            SubLObject var = inference;
            if (query_relaxation.NIL != var) {
                all_inferences = (SubLObject)ConsesLow.cons(var, all_inferences);
            }
            var = metrics;
            if (query_relaxation.NIL != var) {
                all_metrics = (SubLObject)ConsesLow.cons(var, all_metrics);
            }
            done = relaxtion_strategy_termination_condition_satisfiedP(relaxation, results);
            if (query_relaxation.NIL == done) {
                thread.resetMultipleValues();
                final SubLObject relaxed_sentence = relax_query_sentence(sentence, relaxation);
                final SubLObject invalidP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (query_relaxation.NIL != invalidP) {
                    done = (SubLObject)query_relaxation.T;
                }
                else {
                    sentence = relaxed_sentence;
                }
            }
        }
        all_inferences = Sequences.nreverse(all_inferences);
        all_metrics = Sequences.nreverse(all_metrics);
        return Values.values(last_results, last_halt_reason, all_inferences, all_metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 2173L)
    public static SubLObject relaxtion_strategy_termination_condition_satisfiedP(final SubLObject relaxation, final SubLObject results) {
        return list_utilities.sublisp_boolean(results.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 2373L)
    public static SubLObject relax_query_sentence(SubLObject sentence, final SubLObject relaxation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = (SubLObject)query_relaxation.NIL;
        SubLObject handledP = (SubLObject)query_relaxation.NIL;
        if (query_relaxation.NIL == invalidP && query_relaxation.NIL != isa.isa_in_any_mtP(relaxation, query_relaxation.$const0$QueryRelaxationStrategy_RemoveLit)) {
            handledP = (SubLObject)query_relaxation.T;
            thread.resetMultipleValues();
            final SubLObject sentence_$1 = relax_query_sentence_by_removing_literals(sentence, relaxation);
            final SubLObject invalidP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$1;
            invalidP = invalidP_$2;
        }
        if (query_relaxation.NIL == invalidP && query_relaxation.NIL != isa.isa_in_any_mtP(relaxation, query_relaxation.$const1$QueryRelaxationStrategyChangeValu)) {
            handledP = (SubLObject)query_relaxation.T;
            thread.resetMultipleValues();
            final SubLObject sentence_$2 = relax_query_sentence_by_changing_value(sentence, relaxation);
            final SubLObject invalidP_$3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$2;
            invalidP = invalidP_$3;
        }
        if (query_relaxation.NIL == handledP) {
            return Errors.error((SubLObject)query_relaxation.$str2$time_to_implement_support_for__S, relaxation);
        }
        return Values.values(sentence, invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 3096L)
    public static SubLObject relax_query_sentence_by_removing_literals(final SubLObject sentence, final SubLObject relaxation) {
        final SubLObject el_predicate_order_list = kb_mapping_utilities.fpred_value_in_any_mt(relaxation, query_relaxation.$const3$strategyHasPredicateOrder, (SubLObject)query_relaxation.ONE_INTEGER, (SubLObject)query_relaxation.TWO_INTEGER, (SubLObject)query_relaxation.$kw4$TRUE);
        if (query_relaxation.NIL != el_predicate_order_list) {
            final SubLObject predicate_order_list = el_utilities.el_list_items(el_predicate_order_list);
            SubLObject cdolist_list_var;
            final SubLObject inverse_preference_list = cdolist_list_var = Sequences.reverse(predicate_order_list);
            SubLObject predicate = (SubLObject)query_relaxation.NIL;
            predicate = cdolist_list_var.first();
            while (query_relaxation.NIL != cdolist_list_var) {
                if (query_relaxation.NIL != list_utilities.simple_tree_findP(predicate, sentence)) {
                    final SubLObject relaxed_sentence = cycl_remove_predicate_literals_from_sentence(sentence, predicate);
                    return Values.values(relaxed_sentence, (SubLObject)query_relaxation.NIL);
                }
                cdolist_list_var = cdolist_list_var.rest();
                predicate = cdolist_list_var.first();
            }
        }
        return Values.values((SubLObject)query_relaxation.NIL, (SubLObject)query_relaxation.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 3788L)
    public static SubLObject relax_query_sentence_by_changing_value(SubLObject sentence, final SubLObject relaxation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject value_change_list_specs = cdolist_list_var = gather_value_change_list_specs_for_strategy(relaxation);
        SubLObject value_change_list_spec = (SubLObject)query_relaxation.NIL;
        value_change_list_spec = cdolist_list_var.first();
        while (query_relaxation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = value_change_list_spec;
            SubLObject pattern_formula = (SubLObject)query_relaxation.NIL;
            SubLObject arg_position = (SubLObject)query_relaxation.NIL;
            SubLObject el_value_list = (SubLObject)query_relaxation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_relaxation.$list5);
            pattern_formula = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_relaxation.$list5);
            arg_position = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_relaxation.$list5);
            el_value_list = current.first();
            current = current.rest();
            if (query_relaxation.NIL == current) {
                thread.resetMultipleValues();
                final SubLObject changed_sentence = relax_query_sentence_apply_value_change_spec(sentence, pattern_formula, arg_position, el_value_list);
                final SubLObject invalidP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (query_relaxation.NIL != invalidP) {
                    return Values.values((SubLObject)query_relaxation.NIL, (SubLObject)query_relaxation.T);
                }
                sentence = changed_sentence;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_relaxation.$list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_change_list_spec = cdolist_list_var.first();
        }
        return Values.values(sentence, (SubLObject)query_relaxation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 4450L)
    public static SubLObject gather_value_change_list_specs_for_strategy(final SubLObject relaxation) {
        return kb_mapping_utilities.pred_value_tuples_in_any_mt(relaxation, query_relaxation.$const6$valueChangeListForStrategy, (SubLObject)query_relaxation.ONE_INTEGER, (SubLObject)query_relaxation.$list7, (SubLObject)query_relaxation.$kw4$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 4620L)
    public static SubLObject relax_query_sentence_apply_value_change_spec(SubLObject sentence, final SubLObject pattern_formula, final SubLObject arg_position, final SubLObject el_value_list) {
        if (pattern_formula.equal((SubLObject)query_relaxation.$list8) && arg_position.equal((SubLObject)query_relaxation.$list9) && el_value_list.equal((SubLObject)query_relaxation.$list10)) {
            SubLObject pair;
            SubLObject old;
            SubLObject v_new;
            SubLObject old_expression;
            SubLObject new_expression;
            for (pair = (SubLObject)query_relaxation.NIL, pair = (SubLObject)ConsesLow.cons((SubLObject)query_relaxation.TEN_INTEGER, el_utilities.el_list_items(el_value_list)); !pair.isAtom(); pair = pair.rest()) {
                old = pair.first();
                v_new = conses_high.second(pair);
                if (query_relaxation.NIL != old && query_relaxation.NIL != v_new) {
                    old_expression = (SubLObject)ConsesLow.list(query_relaxation.$const11$DaysDuration, old);
                    new_expression = (SubLObject)ConsesLow.list(query_relaxation.$const11$DaysDuration, v_new);
                    if (query_relaxation.NIL != list_utilities.simple_tree_find_via_equalP(old_expression, sentence)) {
                        sentence = cycl_utilities.expression_subst(new_expression, old_expression, sentence, Symbols.symbol_function((SubLObject)query_relaxation.EQUAL), (SubLObject)query_relaxation.UNPROVIDED);
                        return Values.values(sentence, (SubLObject)query_relaxation.NIL);
                    }
                }
            }
            return Values.values((SubLObject)query_relaxation.NIL, (SubLObject)query_relaxation.T);
        }
        return Errors.error((SubLObject)query_relaxation.$str2$time_to_implement_support_for__S, query_relaxation.$const6$valueChangeListForStrategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 5659L)
    public static SubLObject cycl_remove_predicate_literals_from_sentence(SubLObject sentence, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
        try {
            control_vars.$mapping_target$.bind(predicate, thread);
            sentence = cycl_utilities.expression_transform(sentence, Symbols.symbol_function((SubLObject)query_relaxation.$sym12$CONJUNCTION_WITH_TARGET_LITERAL_P), Symbols.symbol_function((SubLObject)query_relaxation.$sym13$CONJUNCTION_WITHOUT_TARGET_LITERAL), (SubLObject)query_relaxation.UNPROVIDED, (SubLObject)query_relaxation.UNPROVIDED);
        }
        finally {
            control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 5996L)
    public static SubLObject conjunction_with_target_literal_p(final SubLObject v_object, SubLObject predicate) {
        if (predicate == query_relaxation.UNPROVIDED) {
            predicate = control_vars.$mapping_target$.getDynamicValue();
        }
        if (query_relaxation.NIL != el_utilities.el_conjunction_p(v_object)) {
            SubLObject cdolist_list_var;
            final SubLObject conjuncts = cdolist_list_var = cycl_utilities.formula_args(v_object, (SubLObject)query_relaxation.UNPROVIDED);
            SubLObject conjunct = (SubLObject)query_relaxation.NIL;
            conjunct = cdolist_list_var.first();
            while (query_relaxation.NIL != cdolist_list_var) {
                if (query_relaxation.NIL != collection_defns.cycl_atomic_sentenceP(conjunct) && predicate.equal(cycl_utilities.atomic_sentence_predicate(conjunct))) {
                    return conjunct;
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
        }
        return (SubLObject)query_relaxation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-relaxation.lisp", position = 6374L)
    public static SubLObject conjunction_without_target_literal(final SubLObject conjunction, SubLObject predicate) {
        if (predicate == query_relaxation.UNPROVIDED) {
            predicate = control_vars.$mapping_target$.getDynamicValue();
        }
        SubLObject conjuncts = cycl_utilities.formula_args(conjunction, (SubLObject)query_relaxation.UNPROVIDED);
        conjuncts = Sequences.remove(predicate, conjuncts, Symbols.symbol_function((SubLObject)query_relaxation.EQUAL), Symbols.symbol_function((SubLObject)query_relaxation.$sym14$FORMULA_OPERATOR), (SubLObject)query_relaxation.UNPROVIDED, (SubLObject)query_relaxation.UNPROVIDED, (SubLObject)query_relaxation.UNPROVIDED);
        return el_utilities.make_conjunction(conjuncts);
    }
    
    public static SubLObject declare_query_relaxation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "new_cyc_query_with_relaxation", "NEW-CYC-QUERY-WITH-RELAXATION", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "relaxtion_strategy_termination_condition_satisfiedP", "RELAXTION-STRATEGY-TERMINATION-CONDITION-SATISFIED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "relax_query_sentence", "RELAX-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "relax_query_sentence_by_removing_literals", "RELAX-QUERY-SENTENCE-BY-REMOVING-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "relax_query_sentence_by_changing_value", "RELAX-QUERY-SENTENCE-BY-CHANGING-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "gather_value_change_list_specs_for_strategy", "GATHER-VALUE-CHANGE-LIST-SPECS-FOR-STRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "relax_query_sentence_apply_value_change_spec", "RELAX-QUERY-SENTENCE-APPLY-VALUE-CHANGE-SPEC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "cycl_remove_predicate_literals_from_sentence", "CYCL-REMOVE-PREDICATE-LITERALS-FROM-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "conjunction_with_target_literal_p", "CONJUNCTION-WITH-TARGET-LITERAL-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_relaxation", "conjunction_without_target_literal", "CONJUNCTION-WITHOUT-TARGET-LITERAL", 1, 1, false);
        return (SubLObject)query_relaxation.NIL;
    }
    
    public static SubLObject init_query_relaxation_file() {
        return (SubLObject)query_relaxation.NIL;
    }
    
    public static SubLObject setup_query_relaxation_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)query_relaxation.$sym12$CONJUNCTION_WITH_TARGET_LITERAL_P);
        utilities_macros.note_funcall_helper_function((SubLObject)query_relaxation.$sym13$CONJUNCTION_WITHOUT_TARGET_LITERAL);
        generic_testing.define_test_case_table_int((SubLObject)query_relaxation.$sym15$CYCL_REMOVE_PREDICATE_LITERALS_FROM_SENTENCE, (SubLObject)ConsesLow.list(new SubLObject[] { query_relaxation.$kw16$TEST, query_relaxation.NIL, query_relaxation.$kw17$OWNER, query_relaxation.NIL, query_relaxation.$kw18$CLASSES, query_relaxation.NIL, query_relaxation.$kw19$KB, query_relaxation.$kw20$TINY, query_relaxation.$kw21$WORKING_, query_relaxation.T }), (SubLObject)query_relaxation.$list22);
        return (SubLObject)query_relaxation.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_query_relaxation_file();
    }
    
    @Override
	public void initializeVariables() {
        init_query_relaxation_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_query_relaxation_file();
    }
    
    static {
        me = (SubLFile)new query_relaxation();
        $const0$QueryRelaxationStrategy_RemoveLit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryRelaxationStrategy-RemoveLiteralViaSpecifiedOrder"));
        $const1$QueryRelaxationStrategyChangeValu = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryRelaxationStrategyChangeValueInArgAccordingToSpec"));
        $str2$time_to_implement_support_for__S = SubLObjectFactory.makeString("time to implement support for ~S");
        $const3$strategyHasPredicateOrder = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strategyHasPredicateOrder"));
        $kw4$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VALUE-LIST"));
        $const6$valueChangeListForStrategy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valueChangeListForStrategy"));
        $list7 = ConsesLow.list((SubLObject)query_relaxation.TWO_INTEGER, (SubLObject)query_relaxation.THREE_INTEGER, (SubLObject)query_relaxation.FOUR_INTEGER);
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeExampleFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"))));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgPositionFn")), (SubLObject)query_relaxation.ONE_INTEGER);
        $list10 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)query_relaxation.FIFTEEN_INTEGER, (SubLObject)query_relaxation.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(25), (SubLObject)SubLObjectFactory.makeInteger(30));
        $const11$DaysDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaysDuration"));
        $sym12$CONJUNCTION_WITH_TARGET_LITERAL_P = SubLObjectFactory.makeSymbol("CONJUNCTION-WITH-TARGET-LITERAL-P");
        $sym13$CONJUNCTION_WITHOUT_TARGET_LITERAL = SubLObjectFactory.makeSymbol("CONJUNCTION-WITHOUT-TARGET-LITERAL");
        $sym14$FORMULA_OPERATOR = SubLObjectFactory.makeSymbol("FORMULA-OPERATOR");
        $sym15$CYCL_REMOVE_PREDICATE_LITERALS_FROM_SENTENCE = SubLObjectFactory.makeSymbol("CYCL-REMOVE-PREDICATE-LITERALS-FROM-SENTENCE");
        $kw16$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw17$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw18$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw19$KB = SubLObjectFactory.makeKeyword("KB");
        $kw20$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw21$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")))));
    }
}

/*

	Total time: 118 ms
	
*/