package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constrained_term_finder extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constrained_term_finder";
    public static final String myFingerPrint = "25a32c1181bf144f20d83b0ccc81fe98b6e261327117e838e8fee1b92ad267e3";
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2016L)
    public static SubLSymbol $constrained_term_finder_queries_browsableP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2446L)
    private static SubLSymbol $constraint_match_ignore_vars$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3142L)
    private static SubLSymbol $constraint_match_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3200L)
    private static SubLSymbol $expand_spatially_transitive_constraintsP$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3290L)
    private static SubLSymbol $spatially_transitive_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 14742L)
    private static SubLSymbol $fuzzy_quantity_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 19008L)
    public static SubLSymbol $use_mt_and_dims_variablesP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$EL_VAR_;
    private static final SubLSymbol $sym2$LISTP;
    private static final SubLSymbol $sym3$HLMT_P;
    private static final SubLSymbol $sym4$PROPERTY_LIST_P;
    private static final SubLSymbol $kw5$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw6$HL;
    private static final SubLSymbol $kw7$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLFloat $float8$1_0;
    private static final SubLSymbol $kw9$NEW_TERMS_ALLOWED_;
    private static final SubLSymbol $kw10$BROWSABLE_;
    private static final SubLSymbol $sym11$CLET;
    private static final SubLList $list12;
    private static final SubLString $str13$___A_D;
    private static final SubLSymbol $kw14$UNBOUND;
    private static final SubLObject $const15$ist_Intermediate;
    private static final SubLSymbol $kw16$TRUE;
    private static final SubLSymbol $kw17$CASE_INSENSITIVE;
    private static final SubLSymbol $kw18$REGULAR_EXPRESSIONS;
    private static final SubLObject $const19$temporallySubsumes;
    private static final SubLSymbol $sym20$REGULAR_EXPRESSION_STRING_P;
    private static final SubLSymbol $sym21$NON_REGULAR_EXPRESSION_STRING_P;
    private static final SubLSymbol $sym22$CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P;
    private static final SubLSymbol $sym23$CONSTRAINT_MATCH_SOME_FN_TERM_P;
    private static final SubLSymbol $sym24$CONSTRAINT_MATCH_INFN_TERNARY_TERM_P;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$ARG0;
    private static final SubLSymbol $sym27$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const28$EverythingPSC;
    private static final SubLObject $const29$transitiveViaArgInverse;
    private static final SubLSymbol $kw30$GAF;
    private static final SubLSymbol $sym31$_DATE;
    private static final SubLSymbol $sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_;
    private static final SubLSymbol $sym33$TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT;
    private static final SubLObject $const34$geographicallySubsumes;
    private static final SubLSymbol $sym35$_PLACE;
    private static final SubLSymbol $sym36$_REFSPEC;
    private static final SubLSymbol $sym37$_ASSERTION;
    private static final SubLSymbol $sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$BOUNDING_TIME_INTERVAL;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$END;
    private static final SubLSymbol $sym43$START;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLObject $const47$IntervalOfTypeMinFn;
    private static final SubLObject $const48$greaterThanOrEqualTo;
    private static final SubLObject $const49$IntervalOfTypeMaxFn;
    private static final SubLObject $const50$lessThanOrEqualTo;
    private static final SubLObject $const51$ApproximatelyFn;
    private static final SubLObject $const52$TimesFn;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLObject $const55$AlmostFn;
    private static final SubLObject $const56$lessThan;
    private static final SubLObject $const57$Unity;
    private static final SubLObject $const58$IntervalRangeFn;
    private static final SubLList $list59;
    private static final SubLString $str60$QUANTITY;
    private static final SubLString $str61$INSTANCE;
    private static final SubLObject $const62$SomeFn;
    private static final SubLObject $const63$Thing;
    private static final SubLObject $const64$isa;
    private static final SubLList $list65;
    private static final SubLString $str66$GUID;
    private static final SubLObject $const67$InstanceNamedFn_Ternary;
    private static final SubLObject $const68$trueSentence_CaseInsensitive;
    private static final SubLObject $const69$ist;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$DATE_VAR;
    private static final SubLSymbol $sym73$TEMPORAL_MT;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$DATE;
    private static final SubLObject $const76$AnytimeDuringPSCFn;
    private static final SubLString $str77$MT;
    private static final SubLString $str78$MT_DIMS;
    private static final SubLObject $const79$MtSpace;
    private static final SubLObject $const80$ist_Asserted;
    private static final SubLObject $const81$and;
    private static final SubLObject $const82$MtUnionFn;
    private static final SubLObject $const83$genlMt;
    private static final SubLObject $const84$regexStringMatch_CaseInsensitive;
    private static final SubLObject $const85$regexStringMatch;
    private static final SubLSymbol $sym86$UNPARSABLE_INSTANCE_EXPRESSION_P;
    private static final SubLString $str87$STANDIN;
    private static final SubLObject $const88$termStrings;
    private static final SubLString $str89$REGEX;
    private static final SubLObject $const90$assertionProducedByReformulation;
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 1072L)
    public static SubLObject find_terms_matching_constraints(final SubLObject term_variable, final SubLObject constraints, final SubLObject mt, SubLObject string_match_options, SubLObject non_reformulatable_constraints) {
        if (string_match_options == constrained_term_finder.UNPROVIDED) {
            string_match_options = (SubLObject)constrained_term_finder.$list0;
        }
        if (non_reformulatable_constraints == constrained_term_finder.UNPROVIDED) {
            non_reformulatable_constraints = (SubLObject)constrained_term_finder.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert constrained_term_finder.NIL != cycl_variables.el_varP(term_variable) : term_variable;
        assert constrained_term_finder.NIL != Types.listp(constraints) : constraints;
        assert constrained_term_finder.NIL != hlmt.hlmt_p(mt) : mt;
        assert constrained_term_finder.NIL != list_utilities.property_list_p(string_match_options) : string_match_options;
        thread.resetMultipleValues();
        final SubLObject query_sentence = build_constraint_match_query_from_constraints_and_options(term_variable, constraints, string_match_options, mt, non_reformulatable_constraints);
        final SubLObject ignored_constraints = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return find_terms_matching_constraints_perform_query(term_variable, query_sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2088L)
    public static SubLObject find_terms_matching_constraints_perform_query(final SubLObject term_variable, final SubLObject query_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)constrained_term_finder.$kw5$ANSWER_LANGUAGE, (SubLObject)constrained_term_finder.$kw6$HL, (SubLObject)constrained_term_finder.$kw7$PROBABLY_APPROXIMATELY_DONE, (SubLObject)constrained_term_finder.$float8$1_0, (SubLObject)constrained_term_finder.$kw9$NEW_TERMS_ALLOWED_, (SubLObject)constrained_term_finder.NIL, (SubLObject)constrained_term_finder.$kw10$BROWSABLE_, constrained_term_finder.$constrained_term_finder_queries_browsableP$.getDynamicValue(thread));
        return ask_utilities.query_variable(term_variable, query_sentence, mt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2556L)
    public static SubLObject with_new_constraint_match_ignore_vars(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)constrained_term_finder.$sym11$CLET, (SubLObject)constrained_term_finder.$list12, ConsesLow.append(body, (SubLObject)constrained_term_finder.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2699L)
    public static SubLObject new_constraint_match_ignore_var(final SubLObject stem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = (SubLObject)constrained_term_finder.ZERO_INTEGER;
        SubLObject variable = (SubLObject)constrained_term_finder.NIL;
        while (constrained_term_finder.NIL == variable) {
            final SubLObject guessed_variable_name = PrintLow.format((SubLObject)constrained_term_finder.NIL, (SubLObject)constrained_term_finder.$str13$___A_D, stem, index);
            final SubLObject el_var = cycl_variables.make_el_var(guessed_variable_name);
            if (constrained_term_finder.NIL == subl_promotions.memberP(el_var, constrained_term_finder.$constraint_match_ignore_vars$.getDynamicValue(thread), (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED)) {
                variable = el_var;
            }
            index = Numbers.add(index, (SubLObject)constrained_term_finder.ONE_INTEGER);
        }
        constrained_term_finder.$constraint_match_ignore_vars$.setDynamicValue((SubLObject)ConsesLow.cons(variable, constrained_term_finder.$constraint_match_ignore_vars$.getDynamicValue(thread)), thread);
        return variable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3357L)
    public static SubLObject constraint_match_constraint_variable_mentioned_in_mt_p(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)constrained_term_finder.NIL;
        final SubLObject vars = cycl_utilities.expression_gather(constraint, (SubLObject)constrained_term_finder.$sym1$EL_VAR_, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
        if (constrained_term_finder.NIL == ans) {
            SubLObject csome_list_var = vars;
            SubLObject var = (SubLObject)constrained_term_finder.NIL;
            var = csome_list_var.first();
            while (constrained_term_finder.NIL == ans && constrained_term_finder.NIL != csome_list_var) {
                if (constrained_term_finder.NIL == ans) {
                    SubLObject csome_list_var_$1 = constrained_term_finder.$constraint_match_constraints$.getDynamicValue(thread);
                    SubLObject constraint_$2 = (SubLObject)constrained_term_finder.NIL;
                    constraint_$2 = csome_list_var_$1.first();
                    while (constrained_term_finder.NIL == ans && constrained_term_finder.NIL != csome_list_var_$1) {
                        if (constrained_term_finder.NIL != el_utilities.el_formula_with_operator_p(constraint_$2, constrained_term_finder.$const15$ist_Intermediate) && constrained_term_finder.NIL != cycl_utilities.expression_find(var, constraint_$2, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED)) {
                            ans = (SubLObject)constrained_term_finder.T;
                        }
                        csome_list_var_$1 = csome_list_var_$1.rest();
                        constraint_$2 = csome_list_var_$1.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                var = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3748L)
    public static SubLObject build_constraint_match_query_from_constraints_and_options(final SubLObject term_variable, final SubLObject constraints, final SubLObject string_match_options, final SubLObject domain_mt, final SubLObject non_reformulatable_constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject case_insensitiveP = Equality.eq((SubLObject)constrained_term_finder.$kw16$TRUE, conses_high.getf(string_match_options, (SubLObject)constrained_term_finder.$kw17$CASE_INSENSITIVE, (SubLObject)constrained_term_finder.UNPROVIDED));
        final SubLObject regular_expressionsP = (SubLObject)SubLObjectFactory.makeBoolean(constrained_term_finder.NIL != regular_expressions.is_regular_expressions_support_availableP() && constrained_term_finder.$kw16$TRUE == conses_high.getf(string_match_options, (SubLObject)constrained_term_finder.$kw18$REGULAR_EXPRESSIONS, (SubLObject)constrained_term_finder.UNPROVIDED));
        SubLObject query_conjuncts = (SubLObject)constrained_term_finder.NIL;
        SubLObject ignored_constraints = (SubLObject)constrained_term_finder.NIL;
        SubLObject query_sentence = (SubLObject)constrained_term_finder.NIL;
        final SubLObject _prev_bind_0 = constrained_term_finder.$constraint_match_ignore_vars$.currentBinding(thread);
        final SubLObject _prev_bind_2 = constrained_term_finder.$constraint_match_constraints$.currentBinding(thread);
        try {
            constrained_term_finder.$constraint_match_ignore_vars$.bind((SubLObject)constrained_term_finder.NIL, thread);
            constrained_term_finder.$constraint_match_constraints$.bind(constraints, thread);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = (SubLObject)constrained_term_finder.NIL;
            constraint = cdolist_list_var.first();
            while (constrained_term_finder.NIL != cdolist_list_var) {
                final SubLObject transformed = transform_constraint_match_query_constraint(term_variable, constraint, case_insensitiveP, regular_expressionsP, domain_mt, (SubLObject)constrained_term_finder.T);
                if (constrained_term_finder.NIL != transformed) {
                    query_conjuncts = (SubLObject)ConsesLow.cons(transformed, query_conjuncts);
                }
                else {
                    ignored_constraints = (SubLObject)ConsesLow.cons(constraint, ignored_constraints);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            cdolist_list_var = non_reformulatable_constraints;
            constraint = (SubLObject)constrained_term_finder.NIL;
            constraint = cdolist_list_var.first();
            while (constrained_term_finder.NIL != cdolist_list_var) {
                final SubLObject transformed = transform_constraint_match_query_constraint(term_variable, constraint, case_insensitiveP, regular_expressionsP, domain_mt, (SubLObject)constrained_term_finder.NIL);
                if (constrained_term_finder.NIL != transformed) {
                    query_conjuncts = (SubLObject)ConsesLow.cons(transformed, query_conjuncts);
                }
                else {
                    ignored_constraints = (SubLObject)ConsesLow.cons(constraint, ignored_constraints);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            query_sentence = simplifier.conjoin(Sequences.nreverse(query_conjuncts), (SubLObject)constrained_term_finder.UNPROVIDED);
        }
        finally {
            constrained_term_finder.$constraint_match_constraints$.rebind(_prev_bind_2, thread);
            constrained_term_finder.$constraint_match_ignore_vars$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = obsolete.formula_free_variables(query_sentence, (SubLObject)ConsesLow.list(term_variable), (SubLObject)constrained_term_finder.$sym1$EL_VAR_, (SubLObject)constrained_term_finder.UNPROVIDED);
        SubLObject ignore_var = (SubLObject)constrained_term_finder.NIL;
        ignore_var = cdolist_list_var2.first();
        while (constrained_term_finder.NIL != cdolist_list_var2) {
            query_sentence = el_utilities.make_existential(ignore_var, query_sentence);
            cdolist_list_var2 = cdolist_list_var2.rest();
            ignore_var = cdolist_list_var2.first();
        }
        return Values.values(query_sentence, ignored_constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 5396L)
    public static SubLObject constraint_match_mt_temporal_constraintP(final SubLObject constraint) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_term_finder.NIL != el_utilities.el_formula_with_operator_p(constraint, constrained_term_finder.$const19$temporallySubsumes) && constrained_term_finder.NIL != constraint_match_constraint_variable_mentioned_in_mt_p(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 5725L)
    public static SubLObject constraint_match_temporal_constraint_on_mt_constraintP(final SubLObject temporal_constraint, final SubLObject mt_constraint) {
        final SubLObject var = cycl_utilities.formula_arg2(temporal_constraint, (SubLObject)constrained_term_finder.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_term_finder.NIL != cycl_variables.el_varP(var) && constrained_term_finder.NIL != cycl_utilities.expression_find(var, mt_constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 6050L)
    public static SubLObject transform_constraint_match_query_constraint(final SubLObject term_variable, SubLObject constraint, final SubLObject case_insensitiveP, final SubLObject regular_expressionsP, final SubLObject domain_mt, final SubLObject check_reformulatedP) {
        final SubLObject original_constraint = el_utilities.copy_expression(constraint);
        if (constrained_term_finder.NIL != constraint_match_mt_temporal_constraintP(constraint)) {
            constraint = (SubLObject)constrained_term_finder.NIL;
        }
        else if (constrained_term_finder.NIL != el_utilities.el_formula_with_operator_p(constraint, constrained_term_finder.$const15$ist_Intermediate)) {
            constraint = transform_temporal_qualification_on_query_constraint(constraint, domain_mt);
        }
        else if (constrained_term_finder.NIL != temporally_transitive_constraintP(constraint, domain_mt)) {
            constraint = transform_temporally_transitive_constraint(constraint);
        }
        if (constrained_term_finder.NIL != constraint && constrained_term_finder.NIL != regular_expressionsP && constrained_term_finder.NIL != cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)constrained_term_finder.$sym20$REGULAR_EXPRESSION_STRING_P), constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED)) {
            constraint = add_regular_expression_marker_to_query_constraint(constraint, case_insensitiveP);
        }
        if (constrained_term_finder.NIL != constraint && constrained_term_finder.NIL != case_insensitiveP && (constrained_term_finder.NIL == regular_expressionsP || constrained_term_finder.NIL != cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)constrained_term_finder.$sym21$NON_REGULAR_EXPRESSION_STRING_P), constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED)) && constrained_term_finder.NIL != el_utilities.sentence_has_nontrivial_true_sentence_case_insensitive_supportP(constraint)) {
            constraint = add_case_insensitivity_marker_to_query_constraint(constraint);
        }
        while (constrained_term_finder.NIL != cycl_utilities.expression_find_if((SubLObject)constrained_term_finder.$sym22$CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P, constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED)) {
            constraint = transform_constraint_match_fuzzy_quantity_constraint(constraint);
        }
        for (constraint = constraint_match_reformulate_temporal_constraint(constraint), constraint = transform_spatially_transitive_constraints(constraint); constrained_term_finder.NIL != cycl_utilities.expression_find_if((SubLObject)constrained_term_finder.$sym23$CONSTRAINT_MATCH_SOME_FN_TERM_P, constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED); constraint = transform_constraint_match_some_fn_term(constraint)) {}
        if (constrained_term_finder.NIL != check_reformulatedP && constrained_term_finder.NIL != constraint) {
            constraint = constraint_match_constraint_add_reformulation_option(term_variable, constraint, original_constraint);
        }
        while (constrained_term_finder.NIL != cycl_utilities.expression_find_if((SubLObject)constrained_term_finder.$sym24$CONSTRAINT_MATCH_INFN_TERNARY_TERM_P, constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED)) {
            constraint = transform_constraint_match_infn_ternary_term(constraint);
        }
        return constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 9253L)
    public static SubLObject temporally_transitive_constraintP(final SubLObject constraint, final SubLObject mt) {
        return transitive_constraintP(constraint, constrained_term_finder.$const19$temporallySubsumes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 9400L)
    public static SubLObject transitive_constraintP(final SubLObject constraint, final SubLObject transitive_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)constrained_term_finder.NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(constraint, (SubLObject)constrained_term_finder.$list25);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (constrained_term_finder.NIL != success) {
            final SubLObject arg0 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)constrained_term_finder.$sym26$ARG0, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
            if (!arg0.eql(transitive_pred)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)constrained_term_finder.$sym27$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(constrained_term_finder.$const28$EverythingPSC, thread);
                    final SubLObject pred_var = constrained_term_finder.$const29$transitiveViaArgInverse;
                    if (constrained_term_finder.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg0, (SubLObject)constrained_term_finder.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg0, (SubLObject)constrained_term_finder.NIL, pred_var);
                        SubLObject done_var = ans;
                        final SubLObject token_var = (SubLObject)constrained_term_finder.NIL;
                        while (constrained_term_finder.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (constrained_term_finder.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)constrained_term_finder.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)constrained_term_finder.$kw30$GAF, (SubLObject)constrained_term_finder.NIL, (SubLObject)constrained_term_finder.NIL);
                                    SubLObject done_var_$3 = ans;
                                    final SubLObject token_var_$4 = (SubLObject)constrained_term_finder.NIL;
                                    while (constrained_term_finder.NIL == done_var_$3) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                        if (constrained_term_finder.NIL != valid_$5) {
                                            ans = (SubLObject)SubLObjectFactory.makeBoolean(transitive_pred.eql(assertions_high.gaf_arg2(gaf)) && constrained_term_finder.TWO_INTEGER.eql(assertions_high.gaf_arg3(gaf)));
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(constrained_term_finder.NIL == valid_$5 || constrained_term_finder.NIL != ans);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)constrained_term_finder.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (constrained_term_finder.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(constrained_term_finder.NIL == valid || constrained_term_finder.NIL != ans);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 9898L)
    public static SubLObject transform_temporally_transitive_constraint(final SubLObject constraint) {
        final SubLObject date_var = czer_utilities.unique_el_var_wrt_expression(constraint, (SubLObject)constrained_term_finder.$sym31$_DATE);
        final SubLObject varified_original = el_utilities.replace_formula_arg((SubLObject)constrained_term_finder.TWO_INTEGER, date_var, constraint);
        final SubLObject subsumption_constraint = (SubLObject)ConsesLow.list(constrained_term_finder.$const19$temporallySubsumes, cycl_utilities.formula_arg2(constraint, (SubLObject)constrained_term_finder.UNPROVIDED), date_var);
        return el_utilities.make_existential(date_var, simplifier.conjoin((SubLObject)ConsesLow.list(varified_original, subsumption_constraint), (SubLObject)constrained_term_finder.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 10303L)
    public static SubLObject transform_spatially_transitive_constraints(SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_term_finder.NIL != constrained_term_finder.$expand_spatially_transitive_constraintsP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = constrained_term_finder.$spatially_transitive_constraints$.currentBinding(thread);
            try {
                constrained_term_finder.$spatially_transitive_constraints$.bind((SubLObject)constrained_term_finder.NIL, thread);
                constraint = cycl_utilities.expression_transform(constraint, (SubLObject)constrained_term_finder.$sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_, (SubLObject)constrained_term_finder.$sym33$TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
                SubLObject cdolist_list_var = constrained_term_finder.$spatially_transitive_constraints$.getDynamicValue(thread);
                SubLObject spatially_transitive_constraint = (SubLObject)constrained_term_finder.NIL;
                spatially_transitive_constraint = cdolist_list_var.first();
                while (constrained_term_finder.NIL != cdolist_list_var) {
                    final SubLObject place_var = cycl_utilities.formula_arg2(spatially_transitive_constraint, (SubLObject)constrained_term_finder.UNPROVIDED);
                    constraint = el_utilities.make_existential(place_var, simplifier.conjoin((SubLObject)ConsesLow.list(spatially_transitive_constraint, constraint), (SubLObject)constrained_term_finder.UNPROVIDED));
                    cdolist_list_var = cdolist_list_var.rest();
                    spatially_transitive_constraint = cdolist_list_var.first();
                }
            }
            finally {
                constrained_term_finder.$spatially_transitive_constraints$.rebind(_prev_bind_0, thread);
            }
        }
        return constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 10947L)
    public static SubLObject spatially_transitive_constraintP(final SubLObject constraint) {
        return transitive_constraintP(constraint, constrained_term_finder.$const34$geographicallySubsumes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 11080L)
    public static SubLObject transform_spatially_transitive_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject place_var = czer_utilities.unique_el_var_wrt_expression(constraint, (SubLObject)constrained_term_finder.$sym35$_PLACE);
        if (constrained_term_finder.$spatially_transitive_constraints$.getDynamicValue(thread).isList()) {
            SubLObject cdolist_list_var = constrained_term_finder.$spatially_transitive_constraints$.getDynamicValue(thread);
            SubLObject existing = (SubLObject)constrained_term_finder.NIL;
            existing = cdolist_list_var.first();
            while (constrained_term_finder.NIL != cdolist_list_var) {
                place_var = czer_utilities.unique_el_var_wrt_expression(existing, (SubLObject)constrained_term_finder.$sym35$_PLACE);
                cdolist_list_var = cdolist_list_var.rest();
                existing = cdolist_list_var.first();
            }
        }
        final SubLObject varified_original = el_utilities.replace_formula_arg((SubLObject)constrained_term_finder.TWO_INTEGER, place_var, constraint);
        final SubLObject subsumption_constraint = (SubLObject)ConsesLow.list(constrained_term_finder.$const34$geographicallySubsumes, cycl_utilities.formula_arg2(constraint, (SubLObject)constrained_term_finder.UNPROVIDED), place_var);
        if (constrained_term_finder.$spatially_transitive_constraints$.getDynamicValue(thread).isList()) {
            constrained_term_finder.$spatially_transitive_constraints$.setDynamicValue((SubLObject)ConsesLow.cons(subsumption_constraint, constrained_term_finder.$spatially_transitive_constraints$.getDynamicValue(thread)), thread);
        }
        return varified_original;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 11737L)
    public static SubLObject constraint_match_constraint_add_reformulation_option(final SubLObject term_variable, final SubLObject new_constraint, final SubLObject original_constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject refspec_var = (SubLObject)constrained_term_finder.$sym36$_REFSPEC;
        final SubLObject assertion_var = (SubLObject)constrained_term_finder.$sym37$_ASSERTION;
        SubLObject ref_option = el_utilities.make_existential(assertion_var, el_utilities.make_existential(refspec_var, generate_note_reformulation_formula(assertion_var, term_variable, original_constraint, refspec_var)));
        if (constrained_term_finder.NIL != el_utilities.el_formula_with_operator_p(original_constraint, constrained_term_finder.$const15$ist_Intermediate)) {
            SubLObject cdolist_list_var;
            final SubLObject temporal_constraints = cdolist_list_var = list_utilities.find_all_if((SubLObject)constrained_term_finder.$sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_, constrained_term_finder.$constraint_match_constraints$.getDynamicValue(thread), (SubLObject)constrained_term_finder.UNPROVIDED);
            SubLObject temporal_constraint = (SubLObject)constrained_term_finder.NIL;
            temporal_constraint = cdolist_list_var.first();
            while (constrained_term_finder.NIL != cdolist_list_var) {
                if (constrained_term_finder.NIL != constraint_match_temporal_constraint_on_mt_constraintP(temporal_constraint, original_constraint)) {
                    final SubLObject reformulated_temporal_constraint = constraint_match_reformulate_temporal_constraint(temporal_constraint);
                    ref_option = simplifier.conjoin((SubLObject)ConsesLow.list(ref_option, reformulated_temporal_constraint), (SubLObject)constrained_term_finder.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                temporal_constraint = cdolist_list_var.first();
            }
        }
        ref_option = transform_spatially_transitive_constraints(ref_option);
        ref_option = transform_constraint_match_some_fn_term(ref_option);
        final SubLObject disjuncts = (SubLObject)ConsesLow.list(new_constraint, ref_option);
        return simplifier.disjoin(disjuncts, (SubLObject)constrained_term_finder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 13293L)
    public static SubLObject constraint_match_reformulate_temporal_constraint(final SubLObject temporal_constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(temporal_constraint, (SubLObject)constrained_term_finder.$list39);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (constrained_term_finder.NIL != success) {
            final SubLObject bounding_time_interval = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)constrained_term_finder.$sym40$BOUNDING_TIME_INTERVAL, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
            return constraint_match_reformulate_temporal_constraint(el_utilities.replace_formula_arg((SubLObject)constrained_term_finder.ONE_INTEGER, bounding_time_interval, temporal_constraint));
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern(temporal_constraint, (SubLObject)constrained_term_finder.$list41);
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (constrained_term_finder.NIL != success) {
            final SubLObject end = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)constrained_term_finder.$sym42$END, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
            final SubLObject start = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)constrained_term_finder.$sym43$START, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
            return constraint_match_reformulate_temporal_constraint(el_utilities.replace_formula_arg_position((SubLObject)constrained_term_finder.$list44, start, el_utilities.replace_formula_arg_position((SubLObject)constrained_term_finder.$list45, end, temporal_constraint)));
        }
        return temporal_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 14592L)
    public static SubLObject constraint_match_fuzzy_quantity_nat_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_term_finder.NIL != term.nautP(v_object, (SubLObject)constrained_term_finder.UNPROVIDED) && constrained_term_finder.NIL != fuzzy_quantity_function_p(cycl_utilities.nat_functor(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 14928L)
    public static SubLObject fuzzy_quantity_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, constrained_term_finder.$fuzzy_quantity_functions$.getGlobalValue(), (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 15043L)
    public static SubLObject fuzzy_quantity_constraint(final SubLObject quantity_var, final SubLObject fuzzy_quantity) {
        final SubLObject pcase_var = cycl_utilities.nat_functor(fuzzy_quantity);
        if (pcase_var.eql(constrained_term_finder.$const47$IntervalOfTypeMinFn)) {
            final SubLObject min = cycl_utilities.nat_arg2(fuzzy_quantity, (SubLObject)constrained_term_finder.UNPROVIDED);
            return el_utilities.make_binary_formula(constrained_term_finder.$const48$greaterThanOrEqualTo, quantity_var, min);
        }
        if (pcase_var.eql(constrained_term_finder.$const49$IntervalOfTypeMaxFn)) {
            final SubLObject min = cycl_utilities.nat_arg2(fuzzy_quantity, (SubLObject)constrained_term_finder.UNPROVIDED);
            return el_utilities.make_binary_formula(constrained_term_finder.$const50$lessThanOrEqualTo, quantity_var, min);
        }
        if (pcase_var.eql(constrained_term_finder.$const51$ApproximatelyFn)) {
            final SubLObject exact_value = cycl_utilities.nat_arg1(fuzzy_quantity, (SubLObject)constrained_term_finder.UNPROVIDED);
            final SubLObject min2 = relation_evaluation.cyc_evaluate((SubLObject)ConsesLow.listS(constrained_term_finder.$const52$TimesFn, exact_value, (SubLObject)constrained_term_finder.$list53));
            final SubLObject max = relation_evaluation.cyc_evaluate((SubLObject)ConsesLow.listS(constrained_term_finder.$const52$TimesFn, exact_value, (SubLObject)constrained_term_finder.$list54));
            return simplifier.nconjoin((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constrained_term_finder.$const48$greaterThanOrEqualTo, quantity_var, min2), (SubLObject)ConsesLow.list(constrained_term_finder.$const50$lessThanOrEqualTo, quantity_var, max)), (SubLObject)constrained_term_finder.UNPROVIDED);
        }
        if (pcase_var.eql(constrained_term_finder.$const55$AlmostFn)) {
            final SubLObject exact_value = cycl_utilities.nat_arg1(fuzzy_quantity, (SubLObject)constrained_term_finder.UNPROVIDED);
            final SubLObject min2 = relation_evaluation.cyc_evaluate((SubLObject)ConsesLow.listS(constrained_term_finder.$const52$TimesFn, exact_value, (SubLObject)constrained_term_finder.$list53));
            return simplifier.nconjoin((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constrained_term_finder.$const48$greaterThanOrEqualTo, quantity_var, min2), (SubLObject)ConsesLow.list(constrained_term_finder.$const56$lessThan, quantity_var, exact_value)), (SubLObject)constrained_term_finder.UNPROVIDED);
        }
        if (!pcase_var.eql(constrained_term_finder.$const57$Unity) && !pcase_var.eql(constrained_term_finder.$const58$IntervalRangeFn)) {
            return (SubLObject)constrained_term_finder.NIL;
        }
        if (constrained_term_finder.NIL == cycl_utilities.nat_arg2(fuzzy_quantity, (SubLObject)constrained_term_finder.UNPROVIDED)) {
            return cycl_utilities.nat_arg1(fuzzy_quantity, (SubLObject)constrained_term_finder.UNPROVIDED);
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(fuzzy_quantity, (SubLObject)constrained_term_finder.UNPROVIDED);
        SubLObject min3 = (SubLObject)constrained_term_finder.NIL;
        SubLObject max2 = (SubLObject)constrained_term_finder.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_term_finder.$list59);
        min3 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constrained_term_finder.$list59);
        max2 = current.first();
        current = current.rest();
        if (constrained_term_finder.NIL == current) {
            return simplifier.nconjoin((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constrained_term_finder.$const48$greaterThanOrEqualTo, quantity_var, min3), (SubLObject)ConsesLow.list(constrained_term_finder.$const50$lessThanOrEqualTo, quantity_var, max2)), (SubLObject)constrained_term_finder.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constrained_term_finder.$list59);
        return (SubLObject)constrained_term_finder.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 16391L)
    public static SubLObject transform_constraint_match_fuzzy_quantity_constraint(final SubLObject constraint) {
        final SubLObject fuzzy_quantity = cycl_utilities.expression_find_if((SubLObject)constrained_term_finder.$sym22$CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P, constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
        final SubLObject fuzzy_quantity_argpos = cycl_utilities.arg_positions_bfs(fuzzy_quantity, constraint, Symbols.symbol_function((SubLObject)constrained_term_finder.EQUAL)).first();
        final SubLObject quantity_var = new_constraint_match_ignore_var((SubLObject)constrained_term_finder.$str60$QUANTITY);
        final SubLObject new_main_constraint = el_utilities.replace_formula_arg_position(fuzzy_quantity_argpos, quantity_var, constraint);
        final SubLObject quantity_constraint = fuzzy_quantity_constraint(quantity_var, fuzzy_quantity);
        return (constrained_term_finder.NIL != quantity_constraint) ? simplifier.nconjoin((SubLObject)ConsesLow.list(new_main_constraint, quantity_constraint), (SubLObject)constrained_term_finder.UNPROVIDED) : new_main_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 17183L)
    public static SubLObject transform_constraint_match_some_fn_term(final SubLObject constraint) {
        final SubLObject some_fn_term = cycl_utilities.expression_find_if((SubLObject)constrained_term_finder.$sym23$CONSTRAINT_MATCH_SOME_FN_TERM_P, constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
        if (constrained_term_finder.NIL == some_fn_term) {
            return constraint;
        }
        final SubLObject some_fn_term_argpos = cycl_utilities.arg_positions_bfs(some_fn_term, constraint, Symbols.symbol_function((SubLObject)constrained_term_finder.EQUAL)).first();
        final SubLObject instance_var = new_constraint_match_ignore_var((SubLObject)constrained_term_finder.$str61$INSTANCE);
        final SubLObject new_main_constraint = el_utilities.replace_formula_arg_position(some_fn_term_argpos, instance_var, constraint);
        final SubLObject type_constraint = some_fn_term_constraint(instance_var, some_fn_term);
        return (constrained_term_finder.NIL != type_constraint) ? simplifier.nconjoin((SubLObject)ConsesLow.list(new_main_constraint, type_constraint), (SubLObject)constrained_term_finder.UNPROVIDED) : new_main_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 17847L)
    public static SubLObject constraint_match_some_fn_term_p(final SubLObject v_object) {
        return cycl_utilities.naut_with_functor_p(v_object, constrained_term_finder.$const62$SomeFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 17952L)
    public static SubLObject some_fn_term_constraint(final SubLObject instance_var, final SubLObject some_fn_term) {
        final SubLObject type = cycl_utilities.nat_arg1(some_fn_term, (SubLObject)constrained_term_finder.UNPROVIDED);
        return (SubLObject)(type.eql(constrained_term_finder.$const63$Thing) ? constrained_term_finder.NIL : el_utilities.make_binary_formula(constrained_term_finder.$const64$isa, instance_var, type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 18180L)
    public static SubLObject transform_constraint_match_infn_ternary_term(final SubLObject constraint) {
        final SubLObject infn_ternary_term = cycl_utilities.expression_find_if((SubLObject)constrained_term_finder.$sym24$CONSTRAINT_MATCH_INFN_TERNARY_TERM_P, constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
        final SubLObject infn_ternary_term_argpos = cycl_utilities.arg_positions_bfs(infn_ternary_term, constraint, Symbols.symbol_function((SubLObject)constrained_term_finder.EQUAL)).first();
        final SubLObject guid_argpos = ConsesLow.append(infn_ternary_term_argpos, (SubLObject)constrained_term_finder.$list65);
        final SubLObject guid_var = new_constraint_match_ignore_var((SubLObject)constrained_term_finder.$str66$GUID);
        final SubLObject new_main_constraint = el_utilities.replace_formula_arg_position(guid_argpos, guid_var, constraint);
        return new_main_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 18687L)
    public static SubLObject constraint_match_infn_ternary_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constrained_term_finder.NIL != cycl_utilities.naut_with_functor_p(v_object, constrained_term_finder.$const67$InstanceNamedFn_Ternary) && cycl_utilities.nat_arg3(v_object, (SubLObject)constrained_term_finder.UNPROVIDED).isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 18855L)
    public static SubLObject add_case_insensitivity_marker_to_query_constraint(final SubLObject constraint) {
        return el_utilities.make_unary_formula(constrained_term_finder.$const68$trueSentence_CaseInsensitive, constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 19064L)
    public static SubLObject transform_temporal_qualification_on_query_constraint(final SubLObject constraint, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constrained_term_finder.NIL != constrained_term_finder.$use_mt_and_dims_variablesP$.getDynamicValue(thread)) {
            return transform_temporal_qualification_on_query_constraint_old(constraint, domain_mt);
        }
        return transform_temporal_qualification_on_query_constraint_new(constraint, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 19381L)
    public static SubLObject transform_temporal_qualification_on_query_constraint_new(final SubLObject constraint, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject possibly_qualified_constraint = el_utilities.replace_formula_arg((SubLObject)constrained_term_finder.ZERO_INTEGER, constrained_term_finder.$const69$ist, cycl_utilities.expression_subst(domain_mt, narts_high.find_nart((SubLObject)constrained_term_finder.$list70), constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED));
        final SubLObject temporal_constraints = list_utilities.find_all_if((SubLObject)constrained_term_finder.$sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_, constrained_term_finder.$constraint_match_constraints$.getDynamicValue(thread), (SubLObject)constrained_term_finder.UNPROVIDED);
        SubLObject constrainedP = (SubLObject)constrained_term_finder.NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(possibly_qualified_constraint, (SubLObject)constrained_term_finder.$list71);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (constrained_term_finder.NIL != success) {
            final SubLObject date_var = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)constrained_term_finder.$sym72$DATE_VAR, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
            final SubLObject temporal_mt = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)constrained_term_finder.$sym73$TEMPORAL_MT, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
            if (constrained_term_finder.NIL == constrainedP) {
                SubLObject csome_list_var = temporal_constraints;
                SubLObject temporal_constraint = (SubLObject)constrained_term_finder.NIL;
                temporal_constraint = csome_list_var.first();
                while (constrained_term_finder.NIL == constrainedP && constrained_term_finder.NIL != csome_list_var) {
                    if (constrained_term_finder.NIL != constraint_match_temporal_constraint_on_mt_constraintP(temporal_constraint, possibly_qualified_constraint)) {
                        final SubLObject reformulated_temporal_constraint = constraint_match_reformulate_temporal_constraint(temporal_constraint);
                        thread.resetMultipleValues();
                        final SubLObject success_$7 = formula_pattern_match.formula_matches_pattern(reformulated_temporal_constraint, (SubLObject)ConsesLow.list(constrained_term_finder.$const19$temporallySubsumes, (SubLObject)constrained_term_finder.$list74, date_var));
                        final SubLObject v_bindings_$8 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (constrained_term_finder.NIL != success_$7) {
                            final SubLObject date = list_utilities.alist_lookup_without_values(v_bindings_$8, (SubLObject)constrained_term_finder.$sym75$DATE, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
                            final SubLObject specified_temporal_mt = (SubLObject)ConsesLow.list(constrained_term_finder.$const76$AnytimeDuringPSCFn, date);
                            possibly_qualified_constraint = el_utilities.replace_formula_arg_position((SubLObject)constrained_term_finder.$list45, specified_temporal_mt, possibly_qualified_constraint);
                            constrainedP = (SubLObject)constrained_term_finder.T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    temporal_constraint = csome_list_var.first();
                }
            }
        }
        return possibly_qualified_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 20959L)
    public static SubLObject transform_temporal_qualification_on_query_constraint_old(final SubLObject constraint, final SubLObject domain_mt) {
        final SubLObject sentence = cycl_utilities.formula_arg2(constraint, (SubLObject)constrained_term_finder.UNPROVIDED);
        final SubLObject mt_var = new_constraint_match_ignore_var((SubLObject)constrained_term_finder.$str77$MT);
        final SubLObject mt_dim_var = new_constraint_match_ignore_var((SubLObject)constrained_term_finder.$str78$MT_DIMS);
        final SubLObject mt_space_expression = el_utilities.make_el_formula(constrained_term_finder.$const79$MtSpace, (SubLObject)ConsesLow.list(mt_var), mt_dim_var);
        final SubLObject temporally_qualified = el_utilities.make_binary_formula(constrained_term_finder.$const80$ist_Asserted, mt_space_expression, sentence);
        final SubLObject mt_reasoning = compute_mt_expression_for_temporal_qualification_on_query_constraint(mt_var, domain_mt);
        return el_utilities.make_binary_formula(constrained_term_finder.$const81$and, mt_reasoning, temporally_qualified);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 21594L)
    public static SubLObject compute_mt_expression_for_temporal_qualification_on_query_constraint(final SubLObject mt_var, final SubLObject domain_mt) {
        if (constrained_term_finder.NIL != el_utilities.el_formula_with_operator_p(domain_mt, constrained_term_finder.$const82$MtUnionFn)) {
            SubLObject mt_reasoning = (SubLObject)constrained_term_finder.NIL;
            SubLObject cdolist_list_var = list_utilities.flatten(mt_union_fn_mts_only(domain_mt));
            SubLObject elmt = (SubLObject)constrained_term_finder.NIL;
            elmt = cdolist_list_var.first();
            while (constrained_term_finder.NIL != cdolist_list_var) {
                mt_reasoning = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(constrained_term_finder.$const83$genlMt, elmt, mt_var), mt_reasoning);
                cdolist_list_var = cdolist_list_var.rest();
                elmt = cdolist_list_var.first();
            }
            return simplifier.disjoin(mt_reasoning, (SubLObject)constrained_term_finder.UNPROVIDED);
        }
        return el_utilities.make_binary_formula(constrained_term_finder.$const83$genlMt, domain_mt, mt_var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 22185L)
    public static SubLObject mt_union_fn_mts_only(final SubLObject mt_denotation) {
        if (constrained_term_finder.NIL != forts.fort_p(mt_denotation)) {
            return mt_denotation;
        }
        if (constrained_term_finder.NIL != el_utilities.el_formula_with_operator_p(mt_denotation, constrained_term_finder.$const82$MtUnionFn)) {
            return mt_union_fn_mts_only(cycl_utilities.nat_args(mt_denotation, (SubLObject)constrained_term_finder.UNPROVIDED));
        }
        if (constrained_term_finder.NIL != narts_high.naut_p(mt_denotation)) {
            return mt_denotation;
        }
        if (constrained_term_finder.NIL != list_utilities.proper_list_p(mt_denotation)) {
            return (SubLObject)ConsesLow.cons(mt_union_fn_mts_only(mt_denotation.first()), mt_union_fn_mts_only(mt_denotation.rest()));
        }
        return mt_denotation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 22682L)
    public static SubLObject add_regular_expression_marker_to_query_constraint(final SubLObject constraint, final SubLObject case_insensitiveP) {
        SubLObject new_constraint = el_utilities.copy_sentence(constraint);
        final SubLObject regex_pred = (constrained_term_finder.NIL != case_insensitiveP) ? constrained_term_finder.$const84$regexStringMatch_CaseInsensitive : constrained_term_finder.$const85$regexStringMatch;
        final SubLObject unparsable = cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)constrained_term_finder.$sym86$UNPARSABLE_INSTANCE_EXPRESSION_P), new_constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
        if (constrained_term_finder.NIL != unparsable) {
            final SubLObject regex_string = cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)constrained_term_finder.$sym20$REGULAR_EXPRESSION_STRING_P), unparsable, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
            final SubLObject el_var = new_constraint_match_ignore_var((SubLObject)constrained_term_finder.$str87$STANDIN);
            new_constraint = cycl_utilities.expression_nsubst(el_var, unparsable, new_constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
            new_constraint = simplifier.conjoin((SubLObject)ConsesLow.list(new_constraint, el_utilities.make_binary_formula(constrained_term_finder.$const88$termStrings, el_var, regex_string)), (SubLObject)constrained_term_finder.UNPROVIDED);
        }
        final SubLObject regex_string = cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)constrained_term_finder.$sym20$REGULAR_EXPRESSION_STRING_P), new_constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
        final SubLObject el_var = new_constraint_match_ignore_var((SubLObject)constrained_term_finder.$str89$REGEX);
        new_constraint = cycl_utilities.expression_nsubst(el_var, regex_string, new_constraint, (SubLObject)constrained_term_finder.UNPROVIDED, (SubLObject)constrained_term_finder.UNPROVIDED);
        return el_utilities.make_binary_formula(constrained_term_finder.$const81$and, new_constraint, el_utilities.make_binary_formula(regex_pred, regex_string, el_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 24012L)
    public static SubLObject generate_note_reformulation_formula(final SubLObject formula, final SubLObject v_term, final SubLObject original, final SubLObject refspec_id) {
        return el_utilities.make_quaternary_formula(constrained_term_finder.$const90$assertionProducedByReformulation, formula, v_term, original, refspec_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 24254L)
    public static SubLObject is_note_reformulation_assertionP(final SubLObject assertion) {
        return assertion_utilities.gaf_assertion_with_pred_p(assertion, constrained_term_finder.$const90$assertionProducedByReformulation);
    }
    
    public static SubLObject declare_constrained_term_finder_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "find_terms_matching_constraints", "FIND-TERMS-MATCHING-CONSTRAINTS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "find_terms_matching_constraints_perform_query", "FIND-TERMS-MATCHING-CONSTRAINTS-PERFORM-QUERY", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constrained_term_finder", "with_new_constraint_match_ignore_vars", "WITH-NEW-CONSTRAINT-MATCH-IGNORE-VARS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "new_constraint_match_ignore_var", "NEW-CONSTRAINT-MATCH-IGNORE-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "constraint_match_constraint_variable_mentioned_in_mt_p", "CONSTRAINT-MATCH-CONSTRAINT-VARIABLE-MENTIONED-IN-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "build_constraint_match_query_from_constraints_and_options", "BUILD-CONSTRAINT-MATCH-QUERY-FROM-CONSTRAINTS-AND-OPTIONS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "constraint_match_mt_temporal_constraintP", "CONSTRAINT-MATCH-MT-TEMPORAL-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "constraint_match_temporal_constraint_on_mt_constraintP", "CONSTRAINT-MATCH-TEMPORAL-CONSTRAINT-ON-MT-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_constraint_match_query_constraint", "TRANSFORM-CONSTRAINT-MATCH-QUERY-CONSTRAINT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "temporally_transitive_constraintP", "TEMPORALLY-TRANSITIVE-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transitive_constraintP", "TRANSITIVE-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_temporally_transitive_constraint", "TRANSFORM-TEMPORALLY-TRANSITIVE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_spatially_transitive_constraints", "TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "spatially_transitive_constraintP", "SPATIALLY-TRANSITIVE-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_spatially_transitive_constraint", "TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "constraint_match_constraint_add_reformulation_option", "CONSTRAINT-MATCH-CONSTRAINT-ADD-REFORMULATION-OPTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "constraint_match_reformulate_temporal_constraint", "CONSTRAINT-MATCH-REFORMULATE-TEMPORAL-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "constraint_match_fuzzy_quantity_nat_p", "CONSTRAINT-MATCH-FUZZY-QUANTITY-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "fuzzy_quantity_function_p", "FUZZY-QUANTITY-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "fuzzy_quantity_constraint", "FUZZY-QUANTITY-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_constraint_match_fuzzy_quantity_constraint", "TRANSFORM-CONSTRAINT-MATCH-FUZZY-QUANTITY-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_constraint_match_some_fn_term", "TRANSFORM-CONSTRAINT-MATCH-SOME-FN-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "constraint_match_some_fn_term_p", "CONSTRAINT-MATCH-SOME-FN-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "some_fn_term_constraint", "SOME-FN-TERM-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_constraint_match_infn_ternary_term", "TRANSFORM-CONSTRAINT-MATCH-INFN-TERNARY-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "constraint_match_infn_ternary_term_p", "CONSTRAINT-MATCH-INFN-TERNARY-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "add_case_insensitivity_marker_to_query_constraint", "ADD-CASE-INSENSITIVITY-MARKER-TO-QUERY-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_temporal_qualification_on_query_constraint", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_temporal_qualification_on_query_constraint_new", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "transform_temporal_qualification_on_query_constraint_old", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT-OLD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "compute_mt_expression_for_temporal_qualification_on_query_constraint", "COMPUTE-MT-EXPRESSION-FOR-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "mt_union_fn_mts_only", "MT-UNION-FN-MTS-ONLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "add_regular_expression_marker_to_query_constraint", "ADD-REGULAR-EXPRESSION-MARKER-TO-QUERY-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "generate_note_reformulation_formula", "GENERATE-NOTE-REFORMULATION-FORMULA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constrained_term_finder", "is_note_reformulation_assertionP", "IS-NOTE-REFORMULATION-ASSERTION?", 1, 0, false);
        return (SubLObject)constrained_term_finder.NIL;
    }
    
    public static SubLObject init_constrained_term_finder_file() {
        constrained_term_finder.$constrained_term_finder_queries_browsableP$ = SubLFiles.defparameter("*CONSTRAINED-TERM-FINDER-QUERIES-BROWSABLE?*", (SubLObject)constrained_term_finder.NIL);
        constrained_term_finder.$constraint_match_ignore_vars$ = SubLFiles.defparameter("*CONSTRAINT-MATCH-IGNORE-VARS*", (SubLObject)constrained_term_finder.NIL);
        constrained_term_finder.$constraint_match_constraints$ = SubLFiles.defparameter("*CONSTRAINT-MATCH-CONSTRAINTS*", (SubLObject)constrained_term_finder.NIL);
        constrained_term_finder.$expand_spatially_transitive_constraintsP$ = SubLFiles.defparameter("*EXPAND-SPATIALLY-TRANSITIVE-CONSTRAINTS?*", (SubLObject)constrained_term_finder.NIL);
        constrained_term_finder.$spatially_transitive_constraints$ = SubLFiles.defparameter("*SPATIALLY-TRANSITIVE-CONSTRAINTS*", (SubLObject)constrained_term_finder.$kw14$UNBOUND);
        constrained_term_finder.$fuzzy_quantity_functions$ = SubLFiles.deflexical("*FUZZY-QUANTITY-FUNCTIONS*", (SubLObject)constrained_term_finder.$list46);
        constrained_term_finder.$use_mt_and_dims_variablesP$ = SubLFiles.defparameter("*USE-MT-AND-DIMS-VARIABLES?*", (SubLObject)constrained_term_finder.NIL);
        return (SubLObject)constrained_term_finder.NIL;
    }
    
    public static SubLObject setup_constrained_term_finder_file() {
        return (SubLObject)constrained_term_finder.NIL;
    }
    
    public void declareFunctions() {
        declare_constrained_term_finder_file();
    }
    
    public void initializeVariables() {
        init_constrained_term_finder_file();
    }
    
    public void runTopLevelForms() {
        setup_constrained_term_finder_file();
    }
    
    static {
        me = (SubLFile)new constrained_term_finder();
        constrained_term_finder.$constrained_term_finder_queries_browsableP$ = null;
        constrained_term_finder.$constraint_match_ignore_vars$ = null;
        constrained_term_finder.$constraint_match_constraints$ = null;
        constrained_term_finder.$expand_spatially_transitive_constraintsP$ = null;
        constrained_term_finder.$spatially_transitive_constraints$ = null;
        constrained_term_finder.$fuzzy_quantity_functions$ = null;
        constrained_term_finder.$use_mt_and_dims_variablesP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASE-INSENSITIVE"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("REGULAR-EXPRESSIONS"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"));
        $sym1$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym2$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym3$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym4$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $kw5$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw6$HL = SubLObjectFactory.makeKeyword("HL");
        $kw7$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $float8$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $kw9$NEW_TERMS_ALLOWED_ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $kw10$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $sym11$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTRAINT-MATCH-IGNORE-VARS*"), (SubLObject)constrained_term_finder.NIL));
        $str13$___A_D = SubLObjectFactory.makeString("??~A~D");
        $kw14$UNBOUND = SubLObjectFactory.makeKeyword("UNBOUND");
        $const15$ist_Intermediate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Intermediate"));
        $kw16$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw17$CASE_INSENSITIVE = SubLObjectFactory.makeKeyword("CASE-INSENSITIVE");
        $kw18$REGULAR_EXPRESSIONS = SubLObjectFactory.makeKeyword("REGULAR-EXPRESSIONS");
        $const19$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $sym20$REGULAR_EXPRESSION_STRING_P = SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION-STRING-P");
        $sym21$NON_REGULAR_EXPRESSION_STRING_P = SubLObjectFactory.makeSymbol("NON-REGULAR-EXPRESSION-STRING-P");
        $sym22$CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P = SubLObjectFactory.makeSymbol("CONSTRAINT-MATCH-FUZZY-QUANTITY-NAT-P");
        $sym23$CONSTRAINT_MATCH_SOME_FN_TERM_P = SubLObjectFactory.makeSymbol("CONSTRAINT-MATCH-SOME-FN-TERM-P");
        $sym24$CONSTRAINT_MATCH_INFN_TERNARY_TERM_P = SubLObjectFactory.makeSymbol("CONSTRAINT-MATCH-INFN-TERNARY-TERM-P");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG0")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $sym26$ARG0 = SubLObjectFactory.makeSymbol("ARG0");
        $sym27$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const28$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const29$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $kw30$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym31$_DATE = SubLObjectFactory.makeSymbol("?DATE");
        $sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_ = SubLObjectFactory.makeSymbol("SPATIALLY-TRANSITIVE-CONSTRAINT?");
        $sym33$TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT = SubLObjectFactory.makeSymbol("TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINT");
        $const34$geographicallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geographicallySubsumes"));
        $sym35$_PLACE = SubLObjectFactory.makeSymbol("?PLACE");
        $sym36$_REFSPEC = SubLObjectFactory.makeSymbol("?REFSPEC");
        $sym37$_ASSERTION = SubLObjectFactory.makeSymbol("?ASSERTION");
        $sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_ = SubLObjectFactory.makeSymbol("CONSTRAINT-MATCH-MT-TEMPORAL-CONSTRAINT?");
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BOUNDING-TIME-INTERVAL")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym40$BOUNDING_TIME_INTERVAL = SubLObjectFactory.makeSymbol("BOUNDING-TIME-INTERVAL");
        $list41 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("START")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("END")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym42$END = SubLObjectFactory.makeSymbol("END");
        $sym43$START = SubLObjectFactory.makeSymbol("START");
        $list44 = ConsesLow.list((SubLObject)constrained_term_finder.ONE_INTEGER, (SubLObject)constrained_term_finder.ONE_INTEGER);
        $list45 = ConsesLow.list((SubLObject)constrained_term_finder.ONE_INTEGER, (SubLObject)constrained_term_finder.TWO_INTEGER);
        $list46 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalOfTypeMinFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalOfTypeMaxFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalRangeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApproximatelyFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AlmostFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")));
        $const47$IntervalOfTypeMinFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalOfTypeMinFn"));
        $const48$greaterThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo"));
        $const49$IntervalOfTypeMaxFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalOfTypeMaxFn"));
        $const50$lessThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo"));
        $const51$ApproximatelyFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApproximatelyFn"));
        $const52$TimesFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.9));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(1.1));
        $const55$AlmostFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AlmostFn"));
        $const56$lessThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan"));
        $const57$Unity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity"));
        $const58$IntervalRangeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalRangeFn"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"));
        $str60$QUANTITY = SubLObjectFactory.makeString("QUANTITY");
        $str61$INSTANCE = SubLObjectFactory.makeString("INSTANCE");
        $const62$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $const63$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const64$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list65 = ConsesLow.list((SubLObject)constrained_term_finder.THREE_INTEGER);
        $str66$GUID = SubLObjectFactory.makeString("GUID");
        $const67$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $const68$trueSentence_CaseInsensitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence-CaseInsensitive"));
        $const69$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $list71 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-MT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("EL-VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-VAR"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"))))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym72$DATE_VAR = SubLObjectFactory.makeSymbol("DATE-VAR");
        $sym73$TEMPORAL_MT = SubLObjectFactory.makeSymbol("TEMPORAL-MT");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"));
        $sym75$DATE = SubLObjectFactory.makeSymbol("DATE");
        $const76$AnytimeDuringPSCFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimeDuringPSCFn"));
        $str77$MT = SubLObjectFactory.makeString("MT");
        $str78$MT_DIMS = SubLObjectFactory.makeString("MT-DIMS");
        $const79$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $const80$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $const81$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const82$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $const83$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $const84$regexStringMatch_CaseInsensitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive"));
        $const85$regexStringMatch = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch"));
        $sym86$UNPARSABLE_INSTANCE_EXPRESSION_P = SubLObjectFactory.makeSymbol("UNPARSABLE-INSTANCE-EXPRESSION-P");
        $str87$STANDIN = SubLObjectFactory.makeString("STANDIN");
        $const88$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $str89$REGEX = SubLObjectFactory.makeString("REGEX");
        $const90$assertionProducedByReformulation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionProducedByReformulation"));
    }
}

/*

	Total time: 346 ms
	
*/