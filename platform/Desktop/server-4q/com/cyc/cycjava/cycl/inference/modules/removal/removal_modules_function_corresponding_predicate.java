package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.kb_gp_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_function_corresponding_predicate extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate";
    public static final String myFingerPrint = "795abd12108bf40c2d27c9cc2d8d065e6038b964c3e321fd6d558ccbb2b63e14";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 922L)
    public static SubLSymbol $use_fcp_removal_moduleP$;
    private static final SubLSymbol $sym0$_USE_FCP_REMOVAL_MODULE__;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$FCP_PRED;
    private static final SubLSymbol $sym3$PWHEN;
    private static final SubLSymbol $sym4$INDEXED_TERM_P;
    private static final SubLSymbol $sym5$DO_ALL_SPEC_PREDICATES;
    private static final SubLObject $const6$functionCorrespondingPredicate_Ca;
    private static final SubLSymbol $sym7$DO_GAF_ARG_INDEX;
    private static final SubLSymbol $kw8$INDEX;
    private static final SubLSymbol $kw9$PREDICATE;
    private static final SubLSymbol $kw10$TRUTH;
    private static final SubLSymbol $kw11$TRUE;
    private static final SubLSymbol $kw12$DONE;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw16$SUPPORT_ASSERTION;
    private static final SubLSymbol $sym17$DO_GAF_ARG_INDEX_GP;
    private static final SubLSymbol $sym18$CLET;
    private static final SubLSymbol $sym19$GAF_ARG1;
    private static final SubLSymbol $sym20$GAF_ARG3;
    private static final SubLSymbol $sym21$EVALUATABLE_FUNCTION_P;
    private static final SubLSymbol $sym22$SUPPORT_ASSERTION;
    private static final SubLSymbol $sym23$DO_CORRESPONDING_EVALUATABLE_FUNCTIONS;
    private static final SubLSymbol $kw24$REMOVAL_FCP_UNIFY;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$RELEVANT_PRED_IS_SPEC_PRED;
    private static final SubLSymbol $kw27$GAF;
    private static final SubLSymbol $sym28$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static final SubLSymbol $kw29$IGNORE;
    private static final SubLSymbol $kw30$DOOMED;
    private static final SubLSymbol $kw31$DISALLOWED;
    private static final SubLSymbol $kw32$GROSSLY_DISPREFERRED;
    private static final SubLSymbol $kw33$DISPREFERRED;
    private static final SubLSymbol $sym34$SHOULD_BIND_ALL_BUT_FUNCTIONAL_IN_ARG_POSITION;
    private static final SubLSymbol $kw35$DEPTH;
    private static final SubLSymbol $kw36$STACK;
    private static final SubLSymbol $kw37$QUEUE;
    private static final SubLSymbol $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw39$ERROR;
    private static final SubLString $str40$_A_is_not_a__A;
    private static final SubLSymbol $sym41$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw42$CERROR;
    private static final SubLString $str43$continue_anyway;
    private static final SubLSymbol $kw44$WARN;
    private static final SubLString $str45$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const46$genlPreds;
    private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str48$attempting_to_bind_direction_link;
    private static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw50$REMOVAL_FCP_CHECK;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$REMOVAL_FCP_FIND_NAT;
    private static final SubLList $list54;
    private static final SubLSymbol $kw55$FCP;
    private static final SubLSymbol $kw56$REMOVAL_EVALUATABLE_FCP_UNIFY;
    private static final SubLList $list57;
    private static final SubLObject $const58$evaluate;
    private static final SubLSymbol $kw59$REMOVAL_FCP_WITH_GENL_PREDS_WRT_ARGS;
    private static final SubLList $list60;
    private static final SubLSymbol $kw61$OPAQUE;
    private static final SubLObject $const62$genlPredsWRTArgs;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$REMOVAL_FCP_WHERE_FUNCTION_EVALUATABLE;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$_EXIT;
    private static final SubLSymbol $kw70$REMOVAL_FCP_SYNTACTIC;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym73$IGNORE_ERRORS_HANDLER;
    private static final SubLObject $const74$genlFuncs;
    private static final SubLSymbol $kw75$QUERY;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 992L)
    public static SubLObject do_fcp_assertions_for_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fcp_as = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        SubLObject pred = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list1);
        fcp_as = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list1);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : removal_modules_function_corresponding_predicate.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list1);
        current = current.rest();
        if (removal_modules_function_corresponding_predicate.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject fcp_pred = (SubLObject)removal_modules_function_corresponding_predicate.$sym2$FCP_PRED;
            return (SubLObject)ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.$sym3$PWHEN, (SubLObject)ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.$sym4$INDEXED_TERM_P, pred), (SubLObject)ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.$sym5$DO_ALL_SPEC_PREDICATES, (SubLObject)ConsesLow.list(fcp_pred, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, (SubLObject)removal_modules_function_corresponding_predicate.NIL, (SubLObject)removal_modules_function_corresponding_predicate.NIL, done_var), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_function_corresponding_predicate.$sym7$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { fcp_as, pred, removal_modules_function_corresponding_predicate.$kw8$INDEX, removal_modules_function_corresponding_predicate.TWO_INTEGER, removal_modules_function_corresponding_predicate.$kw9$PREDICATE, fcp_pred, removal_modules_function_corresponding_predicate.$kw10$TRUTH, removal_modules_function_corresponding_predicate.$kw11$TRUE, removal_modules_function_corresponding_predicate.$kw12$DONE, done_var }), ConsesLow.append(body, (SubLObject)removal_modules_function_corresponding_predicate.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_function_corresponding_predicate.$list1);
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 1394L)
    public static SubLObject do_corresponding_evaluatable_functions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        SubLObject argnum = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        SubLObject predicate = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list13);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list13);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list13);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        SubLObject current_$1 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        while (removal_modules_function_corresponding_predicate.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list13);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list13);
            if (removal_modules_function_corresponding_predicate.NIL == conses_high.member(current_$1, (SubLObject)removal_modules_function_corresponding_predicate.$list14, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                bad = (SubLObject)removal_modules_function_corresponding_predicate.T;
            }
            if (current_$1 == removal_modules_function_corresponding_predicate.$kw15$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (removal_modules_function_corresponding_predicate.NIL != bad && removal_modules_function_corresponding_predicate.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_function_corresponding_predicate.$list13);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)removal_modules_function_corresponding_predicate.$kw12$DONE, current);
        final SubLObject done = (SubLObject)((removal_modules_function_corresponding_predicate.NIL != done_tail) ? conses_high.cadr(done_tail) : removal_modules_function_corresponding_predicate.NIL);
        final SubLObject support_assertion_tail = cdestructuring_bind.property_list_member((SubLObject)removal_modules_function_corresponding_predicate.$kw16$SUPPORT_ASSERTION, current);
        final SubLObject support_assertion = (SubLObject)((removal_modules_function_corresponding_predicate.NIL != support_assertion_tail) ? conses_high.cadr(support_assertion_tail) : removal_modules_function_corresponding_predicate.NIL);
        final SubLObject body;
        current = (body = temp);
        if (removal_modules_function_corresponding_predicate.NIL != support_assertion) {
            return (SubLObject)ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.$sym17$DO_GAF_ARG_INDEX_GP, (SubLObject)ConsesLow.list(support_assertion, predicate, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, (SubLObject)removal_modules_function_corresponding_predicate.$kw8$INDEX, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$kw12$DONE, done), (SubLObject)ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.$sym18$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(function, (SubLObject)ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.$sym19$GAF_ARG1, support_assertion)), (SubLObject)ConsesLow.list(argnum, (SubLObject)ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.$sym20$GAF_ARG3, support_assertion))), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_function_corresponding_predicate.$sym3$PWHEN, (SubLObject)ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.$sym21$EVALUATABLE_FUNCTION_P, function), ConsesLow.append(body, (SubLObject)removal_modules_function_corresponding_predicate.NIL))));
        }
        final SubLObject support_assertion_$2 = (SubLObject)removal_modules_function_corresponding_predicate.$sym22$SUPPORT_ASSERTION;
        return (SubLObject)ConsesLow.listS((SubLObject)removal_modules_function_corresponding_predicate.$sym23$DO_CORRESPONDING_EVALUATABLE_FUNCTIONS, (SubLObject)ConsesLow.list(function, argnum, predicate, (SubLObject)removal_modules_function_corresponding_predicate.$kw12$DONE, done, (SubLObject)removal_modules_function_corresponding_predicate.$kw16$SUPPORT_ASSERTION, support_assertion_$2), ConsesLow.append(body, (SubLObject)removal_modules_function_corresponding_predicate.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 2250L)
    public static SubLObject should_bind_all_but_functional_in_arg_position(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject evaluatable_functor_foundP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        if (removal_modules_function_corresponding_predicate.NIL != fcp_canonical_predicateP(pred)) {
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_function_corresponding_predicate.$sym26$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, thread);
                final SubLObject pred_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                    SubLObject done_var = evaluatable_functor_foundP;
                    final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_function_corresponding_predicate.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                SubLObject done_var_$3 = evaluatable_functor_foundP;
                                final SubLObject token_var_$4 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                while (removal_modules_function_corresponding_predicate.NIL == done_var_$3) {
                                    final SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(support_assertion));
                                    if (removal_modules_function_corresponding_predicate.NIL != valid_$5) {
                                        final SubLObject function = assertions_high.gaf_arg1(support_assertion);
                                        final SubLObject argnum = assertions_high.gaf_arg3(support_assertion);
                                        if (removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(function) && removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(function)) {
                                            evaluatable_functor_foundP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                        }
                                    }
                                    done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$5 || removal_modules_function_corresponding_predicate.NIL != evaluatable_functor_foundP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid || removal_modules_function_corresponding_predicate.NIL != evaluatable_functor_foundP);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
            if (removal_modules_function_corresponding_predicate.NIL != kb_gp_mapping.dgaigp_binaryP(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca)) {
                _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_function_corresponding_predicate.$sym28$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, thread);
                    final SubLObject pred_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, arity.binary_arg_swap((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, arity.binary_arg_swap((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER), pred_var);
                        SubLObject done_var = evaluatable_functor_foundP;
                        final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                        while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_function_corresponding_predicate.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                    SubLObject done_var_$4 = evaluatable_functor_foundP;
                                    final SubLObject token_var_$5 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                    while (removal_modules_function_corresponding_predicate.NIL == done_var_$4) {
                                        final SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(support_assertion));
                                        if (removal_modules_function_corresponding_predicate.NIL != valid_$6) {
                                            final SubLObject _prev_bind_0_$7 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                final SubLObject function2 = assertions_high.gaf_arg1(support_assertion);
                                                final SubLObject argnum2 = assertions_high.gaf_arg3(support_assertion);
                                                if (removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(function2) && removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(function2)) {
                                                    evaluatable_functor_foundP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                                }
                                            }
                                            finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                        done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$6 || removal_modules_function_corresponding_predicate.NIL != evaluatable_functor_foundP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid || removal_modules_function_corresponding_predicate.NIL != evaluatable_functor_foundP);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        final SubLObject strictly_functional_in_arg_positions = cycl_utilities.strictly_functional_in_arg_positions(pred, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
        final SubLObject strictly_functional_in_arg_position = (SubLObject)((removal_modules_function_corresponding_predicate.NIL != list_utilities.singletonP(strictly_functional_in_arg_positions)) ? strictly_functional_in_arg_positions.first() : removal_modules_function_corresponding_predicate.NIL);
        if (removal_modules_function_corresponding_predicate.NIL != strictly_functional_in_arg_position) {
            final SubLObject doomedP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
            SubLObject disallowedP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
            SubLObject grossly_dispreferredP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
            SubLObject dispreferredP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
            if (removal_modules_function_corresponding_predicate.NIL == variables.fully_bound_p(cycl_utilities.atomic_sentence_arg(asent, strictly_functional_in_arg_position, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) {
                SubLObject argnum3 = (SubLObject)removal_modules_function_corresponding_predicate.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.$kw29$IGNORE);
                SubLObject arg = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                arg = cdolist_list_var.first();
                while (removal_modules_function_corresponding_predicate.NIL != cdolist_list_var) {
                    argnum3 = Numbers.add(argnum3, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER);
                    if (!argnum3.eql(strictly_functional_in_arg_position) && removal_modules_function_corresponding_predicate.NIL != variables.not_fully_bound_p(arg)) {
                        if (removal_modules_function_corresponding_predicate.NIL != preference_modules.arg_bindableP(argnum3, asent, bindable_vars)) {
                            if (removal_modules_function_corresponding_predicate.NIL != evaluatable_functor_foundP) {
                                grossly_dispreferredP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                            }
                            else {
                                dispreferredP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                            }
                        }
                        else if (removal_modules_function_corresponding_predicate.NIL != evaluatable_functor_foundP) {
                            disallowedP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                        }
                        else {
                            grossly_dispreferredP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            return (SubLObject)((removal_modules_function_corresponding_predicate.NIL != doomedP) ? removal_modules_function_corresponding_predicate.$kw30$DOOMED : ((removal_modules_function_corresponding_predicate.NIL != disallowedP) ? removal_modules_function_corresponding_predicate.$kw31$DISALLOWED : ((removal_modules_function_corresponding_predicate.NIL != grossly_dispreferredP) ? removal_modules_function_corresponding_predicate.$kw32$GROSSLY_DISPREFERRED : ((removal_modules_function_corresponding_predicate.NIL != dispreferredP) ? removal_modules_function_corresponding_predicate.$kw33$DISPREFERRED : removal_modules_function_corresponding_predicate.NIL))));
        }
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 4098L)
    public static SubLObject fcp_canonical_predicateP(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL != cycl_utilities.reified_term_p(pred) && removal_modules_function_corresponding_predicate.NIL != somewhere_cache.some_pred_assertion_somewhereP(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 4274L)
    public static SubLObject removal_fcp_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLObject v_bindings = removal_fcp_bindings(asent);
        if (removal_modules_function_corresponding_predicate.NIL != v_bindings) {
            final SubLObject support = removal_fcp_support(asent);
            backward.removal_add_node(support, v_bindings, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
        }
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 4627L)
    public static SubLObject removal_fcp_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        if (removal_modules_function_corresponding_predicate.NIL != removal_modules_function_corresponding_predicate.$use_fcp_removal_moduleP$.getGlobalValue()) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            if (removal_modules_function_corresponding_predicate.NIL != kb_indexing_datastructures.indexed_term_p(pred) && removal_modules_function_corresponding_predicate.NIL == ans) {
                final SubLObject node_var = removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca;
                final SubLObject deck_type = (SubLObject)removal_modules_function_corresponding_predicate.$kw37$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                        final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((removal_modules_function_corresponding_predicate.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != tv_var) ? removal_modules_function_corresponding_predicate.$sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (removal_modules_function_corresponding_predicate.NIL != tv_var && removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw39$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw42$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw44$WARN)) {
                                    Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                                if (removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_function_corresponding_predicate.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_function_corresponding_predicate.NIL != node_and_predicate_mode && removal_modules_function_corresponding_predicate.NIL == ans; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$18 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject fcp_pred = node_var_$18;
                                            final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$18)) {
                                                    final SubLObject pred_var = fcp_pred;
                                                    if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                                                        SubLObject done_var = ans;
                                                        final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                        while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                            if (removal_modules_function_corresponding_predicate.NIL != valid) {
                                                                SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                                                    SubLObject done_var_$20 = ans;
                                                                    final SubLObject token_var_$21 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                    while (removal_modules_function_corresponding_predicate.NIL == done_var_$20) {
                                                                        final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                                                        final SubLObject valid_$22 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$21.eql(fcp_as));
                                                                        if (removal_modules_function_corresponding_predicate.NIL != valid_$22) {
                                                                            SubLObject failP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                            final SubLObject nat_argnum = assertions_high.gaf_arg3(fcp_as);
                                                                            SubLObject argnum = (SubLObject)removal_modules_function_corresponding_predicate.ZERO_INTEGER;
                                                                            final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.$kw29$IGNORE);
                                                                            SubLObject rest;
                                                                            SubLObject arg;
                                                                            for (rest = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest = args; removal_modules_function_corresponding_predicate.NIL == failP && removal_modules_function_corresponding_predicate.NIL != rest; rest = rest.rest()) {
                                                                                arg = rest.first();
                                                                                argnum = Numbers.add(argnum, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER);
                                                                                if (argnum.eql(nat_argnum)) {
                                                                                    failP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == variables.fully_bound_p(arg) || (removal_modules_function_corresponding_predicate.NIL == nart_handles.nart_p(arg) && removal_modules_function_corresponding_predicate.NIL == term.nautP(arg, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)));
                                                                                }
                                                                                else {
                                                                                    failP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == variables.fully_bound_p(arg));
                                                                                }
                                                                            }
                                                                            if (removal_modules_function_corresponding_predicate.NIL == failP) {
                                                                                ans = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                                                            }
                                                                        }
                                                                        done_var_$20 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$22 || removal_modules_function_corresponding_predicate.NIL != ans);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                                                        final SubLObject _values = Values.getValuesAsVector();
                                                                        if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                        Values.restoreValuesFromVector(_values);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid || removal_modules_function_corresponding_predicate.NIL != ans);
                                                        }
                                                    }
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds));
                                                SubLObject rest2;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$17;
                                                SubLObject _prev_bind_1_$16;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$18;
                                                SubLObject iteration_state_$27;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$19;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$29;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$20;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest2 = accessible_modules; removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL != rest2; rest2 = rest2.rest()) {
                                                    module_var = rest2.first();
                                                    _prev_bind_0_$17 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$18);
                                                        if (removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                            if (removal_modules_function_corresponding_predicate.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                                if (removal_modules_function_corresponding_predicate.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (removal_modules_function_corresponding_predicate.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$27 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$27); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next(iteration_state_$27)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$27);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (removal_modules_function_corresponding_predicate.NIL == ans) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL != csome_list_var) {
                                                                                                        if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$19, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$27);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$18, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.FIVE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str48$attempting_to_bind_direction_link, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (removal_modules_function_corresponding_predicate.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                            new_list = ((removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)));
                                                            for (rest_$29 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest_$29 = new_list; removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL != rest_$29; rest_$29 = rest_$29.rest()) {
                                                                generating_fn = rest_$29.first();
                                                                _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (removal_modules_function_corresponding_predicate.NIL == ans) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL != csome_list_var2) {
                                                                                if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$20, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$16, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$17, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$15, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$17, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$15, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str49$Node__a_does_not_pass_sbhl_type_t, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$14, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 5667L)
    public static SubLObject removal_fcp_find_nat_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_function_corresponding_predicate.NIL != kb_indexing_datastructures.indexed_term_p(cycl_utilities.formula_arg0(asent))) {
            final SubLObject node_var = removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca;
            final SubLObject deck_type = (SubLObject)removal_modules_function_corresponding_predicate.$kw37$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    final SubLObject _prev_bind_0_$32 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((removal_modules_function_corresponding_predicate.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != tv_var) ? removal_modules_function_corresponding_predicate.$sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (removal_modules_function_corresponding_predicate.NIL != tv_var && removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw39$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw42$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw44$WARN)) {
                                Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                            if (removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_function_corresponding_predicate.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$35 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_function_corresponding_predicate.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$38 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject fcp_pred = node_var_$38;
                                        final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$38)) {
                                                final SubLObject pred_var = fcp_pred;
                                                if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cycl_utilities.formula_arg0(asent), (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cycl_utilities.formula_arg0(asent), (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                                                    SubLObject done_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                    final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                    while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                        if (removal_modules_function_corresponding_predicate.NIL != valid) {
                                                            SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                                                SubLObject done_var_$40 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                final SubLObject token_var_$41 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                while (removal_modules_function_corresponding_predicate.NIL == done_var_$40) {
                                                                    final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                                                    final SubLObject valid_$42 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$41.eql(fcp_as));
                                                                    if (removal_modules_function_corresponding_predicate.NIL != valid_$42) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = assertions_high.gaf_args(fcp_as);
                                                                        SubLObject func = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                        SubLObject pred = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                        SubLObject argnum = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list52);
                                                                        func = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list52);
                                                                        pred = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list52);
                                                                        argnum = current.first();
                                                                        current = current.rest();
                                                                        if (removal_modules_function_corresponding_predicate.NIL == current) {
                                                                            final SubLObject naut = el_utilities.make_el_formula(func, list_utilities.remove_nth(number_utilities.f_1_(argnum), cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                            if (removal_modules_function_corresponding_predicate.NIL != wff.el_wftP(naut, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                final SubLObject nart = czer_main.cyc_find_or_create_nart(naut, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                final SubLObject nart_var = cycl_utilities.formula_arg(asent, argnum, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject v_bindings = unification_utilities.term_unify(nart_var, nart, (SubLObject)removal_modules_function_corresponding_predicate.T, (SubLObject)removal_modules_function_corresponding_predicate.T);
                                                                                final SubLObject unify_justification = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_function_corresponding_predicate.NIL != v_bindings) {
                                                                                    final SubLObject support_sentence = el_utilities.replace_formula_arg(argnum, nart, asent);
                                                                                    final SubLObject support = removal_fcp_support(support_sentence);
                                                                                    backward.removal_add_node(support, v_bindings, unify_justification);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_function_corresponding_predicate.$list52);
                                                                        }
                                                                    }
                                                                    done_var_$40 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$42);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                    if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    Values.restoreValuesFromVector(_values);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid);
                                                    }
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds));
                                            SubLObject module_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (removal_modules_function_corresponding_predicate.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$38);
                                                    if (removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                        if (removal_modules_function_corresponding_predicate.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                            if (removal_modules_function_corresponding_predicate.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (removal_modules_function_corresponding_predicate.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$47;
                                                                            for (iteration_state_$47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$47); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next(iteration_state_$47)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$47);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (removal_modules_function_corresponding_predicate.NIL != csome_list_var) {
                                                                                                if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$39, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$47);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$38, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.FIVE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str48$attempting_to_bind_direction_link, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (removal_modules_function_corresponding_predicate.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$49;
                                                        final SubLObject new_list = cdolist_list_var_$49 = ((removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                        generating_fn = cdolist_list_var_$49.first();
                                                        while (removal_modules_function_corresponding_predicate.NIL != cdolist_list_var_$49) {
                                                            final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (removal_modules_function_corresponding_predicate.NIL != csome_list_var2) {
                                                                        if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$40, thread);
                                                            }
                                                            cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                            generating_fn = cdolist_list_var_$49.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$36, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$37, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$35, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$37, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$35, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$34, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str49$Node__a_does_not_pass_sbhl_type_t, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$34, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$32, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 6425L)
    public static SubLObject removal_fcp_find_nat_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        if (removal_modules_function_corresponding_predicate.NIL != removal_modules_function_corresponding_predicate.$use_fcp_removal_moduleP$.getGlobalValue()) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            if (removal_modules_function_corresponding_predicate.NIL != kb_indexing_datastructures.indexed_term_p(pred) && removal_modules_function_corresponding_predicate.NIL == ans) {
                final SubLObject node_var = removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca;
                final SubLObject deck_type = (SubLObject)removal_modules_function_corresponding_predicate.$kw37$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                        final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((removal_modules_function_corresponding_predicate.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != tv_var) ? removal_modules_function_corresponding_predicate.$sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (removal_modules_function_corresponding_predicate.NIL != tv_var && removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw39$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw42$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw44$WARN)) {
                                    Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                                if (removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_function_corresponding_predicate.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$55 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_function_corresponding_predicate.NIL != node_and_predicate_mode && removal_modules_function_corresponding_predicate.NIL == ans; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$58 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject fcp_pred = node_var_$58;
                                            final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$58)) {
                                                    final SubLObject pred_var = fcp_pred;
                                                    if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                                                        SubLObject done_var = ans;
                                                        final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                        while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                            if (removal_modules_function_corresponding_predicate.NIL != valid) {
                                                                SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                                                    SubLObject done_var_$60 = ans;
                                                                    final SubLObject token_var_$61 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                    while (removal_modules_function_corresponding_predicate.NIL == done_var_$60) {
                                                                        final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$61);
                                                                        final SubLObject valid_$62 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$61.eql(fcp_as));
                                                                        if (removal_modules_function_corresponding_predicate.NIL != valid_$62) {
                                                                            SubLObject failP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                            final SubLObject nat_argnum = assertions_high.gaf_arg3(fcp_as);
                                                                            SubLObject argnum = (SubLObject)removal_modules_function_corresponding_predicate.ZERO_INTEGER;
                                                                            final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.$kw29$IGNORE);
                                                                            SubLObject rest;
                                                                            SubLObject arg;
                                                                            for (rest = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest = args; removal_modules_function_corresponding_predicate.NIL == failP && removal_modules_function_corresponding_predicate.NIL != rest; rest = rest.rest()) {
                                                                                arg = rest.first();
                                                                                argnum = Numbers.add(argnum, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER);
                                                                                if (argnum.eql(nat_argnum)) {
                                                                                    failP = variables.fully_bound_p(arg);
                                                                                }
                                                                                else {
                                                                                    failP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == variables.fully_bound_p(arg));
                                                                                }
                                                                            }
                                                                            if (removal_modules_function_corresponding_predicate.NIL == failP) {
                                                                                ans = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                                                            }
                                                                        }
                                                                        done_var_$60 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$62 || removal_modules_function_corresponding_predicate.NIL != ans);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                                                        final SubLObject _values = Values.getValuesAsVector();
                                                                        if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                        Values.restoreValuesFromVector(_values);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid || removal_modules_function_corresponding_predicate.NIL != ans);
                                                        }
                                                    }
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds));
                                                SubLObject rest2;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$57;
                                                SubLObject _prev_bind_1_$56;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$58;
                                                SubLObject iteration_state_$67;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$59;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$69;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$60;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest2 = accessible_modules; removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL != rest2; rest2 = rest2.rest()) {
                                                    module_var = rest2.first();
                                                    _prev_bind_0_$57 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$56 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$58);
                                                        if (removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                            if (removal_modules_function_corresponding_predicate.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                                if (removal_modules_function_corresponding_predicate.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (removal_modules_function_corresponding_predicate.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$67 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$67); iteration_state_$67 = dictionary_contents.do_dictionary_contents_next(iteration_state_$67)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$67);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (removal_modules_function_corresponding_predicate.NIL == ans) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL != csome_list_var) {
                                                                                                        if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$59, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$67);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$58, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.FIVE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str48$attempting_to_bind_direction_link, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (removal_modules_function_corresponding_predicate.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                            new_list = ((removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)));
                                                            for (rest_$69 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest_$69 = new_list; removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL != rest_$69; rest_$69 = rest_$69.rest()) {
                                                                generating_fn = rest_$69.first();
                                                                _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (removal_modules_function_corresponding_predicate.NIL == ans) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (removal_modules_function_corresponding_predicate.NIL == ans && removal_modules_function_corresponding_predicate.NIL != csome_list_var2) {
                                                                                if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$60, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$56, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$57, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$55, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$57, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$55, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$54, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str49$Node__a_does_not_pass_sbhl_type_t, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$54, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$53, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$52, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 7555L)
    public static SubLObject removal_fcp_support(final SubLObject asent) {
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_function_corresponding_predicate.$kw55$FCP, asent, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 7686L)
    public static SubLObject removal_fcp_bindings(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        SubLObject supports = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        if (removal_modules_function_corresponding_predicate.NIL != kb_indexing_datastructures.indexed_term_p(cycl_utilities.formula_arg0(asent)) && removal_modules_function_corresponding_predicate.NIL == supports) {
            final SubLObject node_var = removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca;
            final SubLObject deck_type = (SubLObject)removal_modules_function_corresponding_predicate.$kw37$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((removal_modules_function_corresponding_predicate.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != tv_var) ? removal_modules_function_corresponding_predicate.$sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (removal_modules_function_corresponding_predicate.NIL != tv_var && removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw39$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw42$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw44$WARN)) {
                                Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                            if (removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_function_corresponding_predicate.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_function_corresponding_predicate.NIL != node_and_predicate_mode && removal_modules_function_corresponding_predicate.NIL == supports; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$78 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject fcp_pred = node_var_$78;
                                        final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$78)) {
                                                final SubLObject pred_var = fcp_pred;
                                                if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cycl_utilities.formula_arg0(asent), (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cycl_utilities.formula_arg0(asent), (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                                                    SubLObject done_var = supports;
                                                    final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                    while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                        if (removal_modules_function_corresponding_predicate.NIL != valid) {
                                                            SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                                                SubLObject done_var_$80 = supports;
                                                                final SubLObject token_var_$81 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                while (removal_modules_function_corresponding_predicate.NIL == done_var_$80) {
                                                                    final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$81);
                                                                    final SubLObject valid_$82 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$81.eql(fcp_as));
                                                                    if (removal_modules_function_corresponding_predicate.NIL != valid_$82) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = assertions_high.gaf_args(fcp_as);
                                                                        SubLObject func = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                        SubLObject pred = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                        SubLObject argnum = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list52);
                                                                        func = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list52);
                                                                        pred = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list52);
                                                                        argnum = current.first();
                                                                        current = current.rest();
                                                                        if (removal_modules_function_corresponding_predicate.NIL == current) {
                                                                            final SubLObject naut = el_utilities.make_el_formula(func, list_utilities.remove_nth(number_utilities.f_1_(argnum), cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                            if (removal_modules_function_corresponding_predicate.NIL != wff.el_wftP(naut, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                final SubLObject candidate_nat = cycl_utilities.formula_arg(asent, argnum, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject unify_bindings = unification_utilities.term_unify(naut, candidate_nat, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                final SubLObject unify_justification = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_function_corresponding_predicate.NIL != unify_bindings) {
                                                                                    v_bindings = unify_bindings;
                                                                                    supports = (SubLObject)ConsesLow.cons(fcp_as, unify_justification);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_function_corresponding_predicate.$list52);
                                                                        }
                                                                    }
                                                                    done_var_$80 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$82 || removal_modules_function_corresponding_predicate.NIL != supports);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                    if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    Values.restoreValuesFromVector(_values);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid || removal_modules_function_corresponding_predicate.NIL != supports);
                                                    }
                                                }
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$77;
                                            SubLObject _prev_bind_1_$76;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$78;
                                            SubLObject iteration_state_$87;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$79;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$89;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$80;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest = accessible_modules; removal_modules_function_corresponding_predicate.NIL == supports && removal_modules_function_corresponding_predicate.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$77 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var_$78);
                                                    if (removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                        if (removal_modules_function_corresponding_predicate.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                            if (removal_modules_function_corresponding_predicate.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_function_corresponding_predicate.NIL == supports && removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (removal_modules_function_corresponding_predicate.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$87 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_function_corresponding_predicate.NIL == supports && removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$87); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next(iteration_state_$87)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$87);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_function_corresponding_predicate.NIL == supports && removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (removal_modules_function_corresponding_predicate.NIL == supports) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (removal_modules_function_corresponding_predicate.NIL == supports && removal_modules_function_corresponding_predicate.NIL != csome_list_var) {
                                                                                                    if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$79, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$87);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$78, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.FIVE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str48$attempting_to_bind_direction_link, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (removal_modules_function_corresponding_predicate.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                        new_list = ((removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)));
                                                        for (rest_$89 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest_$89 = new_list; removal_modules_function_corresponding_predicate.NIL == supports && removal_modules_function_corresponding_predicate.NIL != rest_$89; rest_$89 = rest_$89.rest()) {
                                                            generating_fn = rest_$89.first();
                                                            _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_function_corresponding_predicate.NIL == supports && removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (removal_modules_function_corresponding_predicate.NIL == supports) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (removal_modules_function_corresponding_predicate.NIL == supports && removal_modules_function_corresponding_predicate.NIL != csome_list_var2) {
                                                                            if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$80, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$76, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$77, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$75, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$77, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$75, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$74, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str49$Node__a_does_not_pass_sbhl_type_t, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$74, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$73, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$72, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(v_bindings, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 8518L)
    public static SubLObject removal_fcp_justify(final SubLObject fcp_support) {
        final SubLObject asent = arguments.support_sentence(fcp_support);
        final SubLObject supports = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER), removal_fcp_bindings(asent));
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 8695L)
    public static SubLObject removal_fcp_verify(final SubLObject fcp_support) {
        final SubLObject asent = arguments.support_sentence(fcp_support);
        return list_utilities.sublisp_boolean(removal_fcp_bindings(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 9322L)
    public static SubLObject removal_evaluatable_fcp_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject successP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        if (removal_modules_function_corresponding_predicate.NIL != kb_indexing_datastructures.indexed_term_p(predicate)) {
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_function_corresponding_predicate.$sym26$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, thread);
                final SubLObject pred_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                    SubLObject done_var = successP;
                    final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_function_corresponding_predicate.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                SubLObject done_var_$92 = successP;
                                final SubLObject token_var_$93 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                while (removal_modules_function_corresponding_predicate.NIL == done_var_$92) {
                                    final SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$93);
                                    final SubLObject valid_$94 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$93.eql(support_assertion));
                                    if (removal_modules_function_corresponding_predicate.NIL != valid_$94) {
                                        final SubLObject function = assertions_high.gaf_arg1(support_assertion);
                                        final SubLObject argnum = assertions_high.gaf_arg3(support_assertion);
                                        if (removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(function)) {
                                            SubLObject failP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                            SubLObject asent_argnum = (SubLObject)removal_modules_function_corresponding_predicate.ZERO_INTEGER;
                                            final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.$kw29$IGNORE);
                                            SubLObject rest;
                                            SubLObject asent_arg;
                                            for (rest = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest = args; removal_modules_function_corresponding_predicate.NIL == failP && removal_modules_function_corresponding_predicate.NIL != rest; rest = rest.rest()) {
                                                asent_arg = rest.first();
                                                asent_argnum = Numbers.add(asent_argnum, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER);
                                                if (!argnum.eql(asent_argnum) && removal_modules_function_corresponding_predicate.NIL == variables.fully_bound_p(asent_arg)) {
                                                    failP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                                }
                                            }
                                            if (removal_modules_function_corresponding_predicate.NIL == failP) {
                                                successP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                            }
                                        }
                                    }
                                    done_var_$92 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$94 || removal_modules_function_corresponding_predicate.NIL != successP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid || removal_modules_function_corresponding_predicate.NIL != successP);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
            if (removal_modules_function_corresponding_predicate.NIL != kb_gp_mapping.dgaigp_binaryP(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca)) {
                _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_function_corresponding_predicate.$sym28$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, thread);
                    final SubLObject pred_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, arity.binary_arg_swap((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, arity.binary_arg_swap((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER), pred_var);
                        SubLObject done_var = successP;
                        final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                        while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_function_corresponding_predicate.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                    SubLObject done_var_$93 = successP;
                                    final SubLObject token_var_$94 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                    while (removal_modules_function_corresponding_predicate.NIL == done_var_$93) {
                                        final SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$94);
                                        final SubLObject valid_$95 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$94.eql(support_assertion));
                                        if (removal_modules_function_corresponding_predicate.NIL != valid_$95) {
                                            final SubLObject _prev_bind_0_$96 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                final SubLObject function2 = assertions_high.gaf_arg1(support_assertion);
                                                final SubLObject argnum2 = assertions_high.gaf_arg3(support_assertion);
                                                if (removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(function2)) {
                                                    SubLObject failP2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                    SubLObject asent_argnum2 = (SubLObject)removal_modules_function_corresponding_predicate.ZERO_INTEGER;
                                                    final SubLObject args2 = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.$kw29$IGNORE);
                                                    SubLObject rest2;
                                                    SubLObject asent_arg2;
                                                    for (rest2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest2 = args2; removal_modules_function_corresponding_predicate.NIL == failP2 && removal_modules_function_corresponding_predicate.NIL != rest2; rest2 = rest2.rest()) {
                                                        asent_arg2 = rest2.first();
                                                        asent_argnum2 = Numbers.add(asent_argnum2, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER);
                                                        if (!argnum2.eql(asent_argnum2) && removal_modules_function_corresponding_predicate.NIL == variables.fully_bound_p(asent_arg2)) {
                                                            failP2 = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                                        }
                                                    }
                                                    if (removal_modules_function_corresponding_predicate.NIL == failP2) {
                                                        successP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                                    }
                                                }
                                            }
                                            finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$96, thread);
                                            }
                                        }
                                        done_var_$93 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$95 || removal_modules_function_corresponding_predicate.NIL != successP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid || removal_modules_function_corresponding_predicate.NIL != successP);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 9870L)
    public static SubLObject removal_evaluatable_fcp_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_function_corresponding_predicate.$sym26$RELEVANT_PRED_IS_SPEC_PRED, thread);
            pred_relevance_macros.$pred$.bind(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, thread);
            final SubLObject pred_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
            if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_function_corresponding_predicate.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                            SubLObject done_var_$101 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                            final SubLObject token_var_$102 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                            while (removal_modules_function_corresponding_predicate.NIL == done_var_$101) {
                                final SubLObject support = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$102);
                                final SubLObject valid_$103 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$102.eql(support));
                                if (removal_modules_function_corresponding_predicate.NIL != valid_$103) {
                                    final SubLObject function = assertions_high.gaf_arg1(support);
                                    final SubLObject argnum = assertions_high.gaf_arg3(support);
                                    if (removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(function)) {
                                        SubLObject function_args = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                        SubLObject function_term = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                        SubLObject failP = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                        SubLObject asent_argnum = (SubLObject)removal_modules_function_corresponding_predicate.ZERO_INTEGER;
                                        final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.$kw29$IGNORE);
                                        SubLObject rest;
                                        SubLObject asent_arg;
                                        for (rest = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest = args; removal_modules_function_corresponding_predicate.NIL == failP && removal_modules_function_corresponding_predicate.NIL != rest; rest = rest.rest()) {
                                            asent_arg = rest.first();
                                            asent_argnum = Numbers.add(asent_argnum, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER);
                                            if (argnum.eql(asent_argnum)) {
                                                function_term = asent_arg;
                                            }
                                            else if (removal_modules_function_corresponding_predicate.NIL != variables.fully_bound_p(asent_arg)) {
                                                function_args = (SubLObject)ConsesLow.cons(asent_arg, function_args);
                                            }
                                            else {
                                                failP = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                            }
                                        }
                                        if (removal_modules_function_corresponding_predicate.NIL == failP) {
                                            final SubLObject eval_expression = el_utilities.make_el_formula(function, Sequences.nreverse(function_args), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                            thread.resetMultipleValues();
                                            final SubLObject result = relation_evaluation.cyc_evaluate(eval_expression);
                                            final SubLObject evaluatableP = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (removal_modules_function_corresponding_predicate.NIL != evaluatableP) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.term_unify(function_term, result, (SubLObject)removal_modules_function_corresponding_predicate.T, (SubLObject)removal_modules_function_corresponding_predicate.T);
                                                final SubLObject unify_justification = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (removal_modules_function_corresponding_predicate.NIL != v_bindings) {
                                                    final SubLObject eval_sentence = el_utilities.make_binary_formula(removal_modules_function_corresponding_predicate.$const58$evaluate, result, eval_expression);
                                                    final SubLObject eval_support = removal_modules_evaluation.make_eval_support(eval_sentence, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                    backward.removal_add_node(support, v_bindings, ConsesLow.append((SubLObject)ConsesLow.list(eval_support), unify_justification));
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var_$101 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$103);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid);
                }
            }
        }
        finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_function_corresponding_predicate.NIL != kb_gp_mapping.dgaigp_binaryP(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca)) {
            _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_function_corresponding_predicate.$sym28$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                pred_relevance_macros.$pred$.bind(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, thread);
                final SubLObject pred_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, arity.binary_arg_swap((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER), pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, arity.binary_arg_swap((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER), pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_function_corresponding_predicate.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                SubLObject done_var_$102 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                final SubLObject token_var_$103 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                while (removal_modules_function_corresponding_predicate.NIL == done_var_$102) {
                                    final SubLObject support = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$103);
                                    final SubLObject valid_$104 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$103.eql(support));
                                    if (removal_modules_function_corresponding_predicate.NIL != valid_$104) {
                                        final SubLObject _prev_bind_0_$105 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                        try {
                                            kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                            final SubLObject function2 = assertions_high.gaf_arg1(support);
                                            final SubLObject argnum2 = assertions_high.gaf_arg3(support);
                                            if (removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(function2)) {
                                                SubLObject function_args2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                SubLObject function_term2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                SubLObject failP2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                SubLObject asent_argnum2 = (SubLObject)removal_modules_function_corresponding_predicate.ZERO_INTEGER;
                                                final SubLObject args2 = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_function_corresponding_predicate.$kw29$IGNORE);
                                                SubLObject rest2;
                                                SubLObject asent_arg2;
                                                for (rest2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest2 = args2; removal_modules_function_corresponding_predicate.NIL == failP2 && removal_modules_function_corresponding_predicate.NIL != rest2; rest2 = rest2.rest()) {
                                                    asent_arg2 = rest2.first();
                                                    asent_argnum2 = Numbers.add(asent_argnum2, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER);
                                                    if (argnum2.eql(asent_argnum2)) {
                                                        function_term2 = asent_arg2;
                                                    }
                                                    else if (removal_modules_function_corresponding_predicate.NIL != variables.fully_bound_p(asent_arg2)) {
                                                        function_args2 = (SubLObject)ConsesLow.cons(asent_arg2, function_args2);
                                                    }
                                                    else {
                                                        failP2 = (SubLObject)removal_modules_function_corresponding_predicate.T;
                                                    }
                                                }
                                                if (removal_modules_function_corresponding_predicate.NIL == failP2) {
                                                    final SubLObject eval_expression2 = el_utilities.make_el_formula(function2, Sequences.nreverse(function_args2), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                    thread.resetMultipleValues();
                                                    final SubLObject result2 = relation_evaluation.cyc_evaluate(eval_expression2);
                                                    final SubLObject evaluatableP2 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (removal_modules_function_corresponding_predicate.NIL != evaluatableP2) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject v_bindings2 = unification_utilities.term_unify(function_term2, result2, (SubLObject)removal_modules_function_corresponding_predicate.T, (SubLObject)removal_modules_function_corresponding_predicate.T);
                                                        final SubLObject unify_justification2 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (removal_modules_function_corresponding_predicate.NIL != v_bindings2) {
                                                            final SubLObject eval_sentence2 = el_utilities.make_binary_formula(removal_modules_function_corresponding_predicate.$const58$evaluate, result2, eval_expression2);
                                                            final SubLObject eval_support2 = removal_modules_evaluation.make_eval_support(eval_sentence2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                            backward.removal_add_node(support, v_bindings2, ConsesLow.append((SubLObject)ConsesLow.list(eval_support2), unify_justification2));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$105, thread);
                                        }
                                    }
                                    done_var_$102 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$104);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 11644L)
    public static SubLObject removal_fcp_with_genl_preds_wrt_args_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        return fcp_with_genl_preds_wrt_args_arg2(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 11799L)
    public static SubLObject removal_fcp_with_genl_preds_wrt_args_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg2_query = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
        final SubLObject arg2_answer = fcp_with_genl_preds_wrt_args_arg2(asent);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(arg2_query, arg2_answer, (SubLObject)removal_modules_function_corresponding_predicate.T, (SubLObject)removal_modules_function_corresponding_predicate.T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_function_corresponding_predicate.NIL != v_bindings) {
            final SubLObject sentence = bindings.apply_bindings(v_bindings, asent);
            final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_function_corresponding_predicate.$kw61$OPAQUE, sentence, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
            backward.removal_add_node(support, v_bindings, unify_justification);
        }
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 12315L)
    public static SubLObject fcp_with_genl_preds_wrt_args_arg2(final SubLObject asent) {
        if (removal_modules_function_corresponding_predicate.NIL != forts.fort_p(cycl_utilities.atomic_sentence_predicate(asent)) && removal_modules_function_corresponding_predicate.NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) && removal_modules_function_corresponding_predicate.NIL != cycl_grammar.cycl_nat_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject supported_nat_argnum = (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER;
            final SubLObject arg1_nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
            final SubLObject functor = cycl_utilities.nat_arg0(arg1_nat);
            if (removal_modules_function_corresponding_predicate.NIL != somewhere_cache.some_pred_assertion_somewhereP(removal_modules_function_corresponding_predicate.$const62$genlPredsWRTArgs, predicate, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples(predicate, removal_modules_function_corresponding_predicate.$const62$genlPredsWRTArgs, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$list66, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                SubLObject spec_pred_wrt_args = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                spec_pred_wrt_args = cdolist_list_var.first();
                while (removal_modules_function_corresponding_predicate.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = spec_pred_wrt_args;
                    SubLObject spec_pred = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    SubLObject wrt_args = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list63);
                    spec_pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_function_corresponding_predicate.$list63);
                    wrt_args = current.first();
                    current = current.rest();
                    if (removal_modules_function_corresponding_predicate.NIL == current) {
                        if (removal_modules_function_corresponding_predicate.NIL != kb_indexing_datastructures.indexed_term_p(spec_pred)) {
                            SubLObject cdolist_list_var_$110 = kb_mapping_utilities.pred_value_tuples(functor, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$list65, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            SubLObject spec_pred2_argnum = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                            spec_pred2_argnum = cdolist_list_var_$110.first();
                            while (removal_modules_function_corresponding_predicate.NIL != cdolist_list_var_$110) {
                                SubLObject current_$112;
                                final SubLObject datum_$111 = current_$112 = spec_pred2_argnum;
                                SubLObject spec_pred2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                SubLObject argnum = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$112, datum_$111, (SubLObject)removal_modules_function_corresponding_predicate.$list64);
                                spec_pred2 = current_$112.first();
                                current_$112 = current_$112.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$112, datum_$111, (SubLObject)removal_modules_function_corresponding_predicate.$list64);
                                argnum = current_$112.first();
                                current_$112 = current_$112.rest();
                                if (removal_modules_function_corresponding_predicate.NIL == current_$112) {
                                    if (argnum.eql(supported_nat_argnum) && removal_modules_function_corresponding_predicate.NIL != genl_predicates.genl_predP(spec_pred2, spec_pred, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                        final SubLObject other_args = Sequences.remove(argnum, el_utilities.el_list_items(wrt_args), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                        if (removal_modules_function_corresponding_predicate.NIL != list_utilities.singletonP(other_args)) {
                                            return cycl_utilities.nat_arg(arg1_nat, Numbers.subtract(other_args.first(), (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$111, (SubLObject)removal_modules_function_corresponding_predicate.$list64);
                                }
                                cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                                spec_pred2_argnum = cdolist_list_var_$110.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_function_corresponding_predicate.$list63);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    spec_pred_wrt_args = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 13925L)
    public static SubLObject asent_uses_predicate_with_corresponding_evaluatable_function_with_non_functional_arg_unboundP(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (removal_modules_function_corresponding_predicate.NIL == inference_modules.predicate_has_specific_removal_modulesP(pred) && removal_modules_function_corresponding_predicate.NIL != kb_indexing_datastructures.indexed_term_p(pred)) {
            final SubLObject node_var = removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca;
            final SubLObject deck_type = (SubLObject)removal_modules_function_corresponding_predicate.$kw37$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                    final SubLObject _prev_bind_0_$113 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((removal_modules_function_corresponding_predicate.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != tv_var) ? removal_modules_function_corresponding_predicate.$sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (removal_modules_function_corresponding_predicate.NIL != tv_var && removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw39$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw42$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw44$WARN)) {
                                Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$114 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$115 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                            if (removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_function_corresponding_predicate.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$115 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$116 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$118 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_function_corresponding_predicate.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$119 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject fcp_pred = node_var_$119;
                                        final SubLObject _prev_bind_0_$116 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$119)) {
                                                final SubLObject pred_var = fcp_pred;
                                                if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                                                    SubLObject done_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                    final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                    while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                        if (removal_modules_function_corresponding_predicate.NIL != valid) {
                                                            SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                                                SubLObject done_var_$121 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                final SubLObject token_var_$122 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                while (removal_modules_function_corresponding_predicate.NIL == done_var_$121) {
                                                                    final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$122);
                                                                    final SubLObject valid_$123 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$122.eql(fcp_as));
                                                                    if (removal_modules_function_corresponding_predicate.NIL != valid_$123) {
                                                                        final SubLObject fcp_func = assertions_high.gaf_arg1(fcp_as);
                                                                        final SubLObject fcp_argnum = assertions_high.gaf_arg3(fcp_as);
                                                                        if (removal_modules_function_corresponding_predicate.NIL != fort_types_interface.evaluatable_function_p(fcp_func) && removal_modules_function_corresponding_predicate.NIL != variables.not_fully_bound_p(list_utilities.remove_nth(fcp_argnum, asent))) {
                                                                            return (SubLObject)removal_modules_function_corresponding_predicate.T;
                                                                        }
                                                                    }
                                                                    done_var_$121 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$123);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                    if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    Values.restoreValuesFromVector(_values);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid);
                                                    }
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds));
                                            SubLObject module_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (removal_modules_function_corresponding_predicate.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$118 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$119);
                                                    if (removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                        if (removal_modules_function_corresponding_predicate.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                            if (removal_modules_function_corresponding_predicate.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (removal_modules_function_corresponding_predicate.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$119 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$128;
                                                                            for (iteration_state_$128 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$128); iteration_state_$128 = dictionary_contents.do_dictionary_contents_next(iteration_state_$128)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$128);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$120 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (removal_modules_function_corresponding_predicate.NIL != csome_list_var) {
                                                                                                if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$120, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$128);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$119, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.FIVE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str48$attempting_to_bind_direction_link, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (removal_modules_function_corresponding_predicate.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$130;
                                                        final SubLObject new_list = cdolist_list_var_$130 = ((removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                        generating_fn = cdolist_list_var_$130.first();
                                                        while (removal_modules_function_corresponding_predicate.NIL != cdolist_list_var_$130) {
                                                            final SubLObject _prev_bind_0_$121 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (removal_modules_function_corresponding_predicate.NIL != csome_list_var2) {
                                                                        if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$121, thread);
                                                            }
                                                            cdolist_list_var_$130 = cdolist_list_var_$130.rest();
                                                            generating_fn = cdolist_list_var_$130.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$117, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$118, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$116, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$118, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$116, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$115, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str49$Node__a_does_not_pass_sbhl_type_t, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$115, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$114, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$113, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 14918L)
    public static SubLObject removal_fcp_syntactic_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLObject bindings_values = bindings.bindings_values(removal_fcp_syntactic_bindings(asent));
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL != bindings_values && removal_modules_function_corresponding_predicate.NIL != el_utilities.closedP(bindings_values, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 15163L)
    public static SubLObject removal_fcp_syntactic_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_function_corresponding_predicate.UNPROVIDED) {
            sense = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = removal_fcp_syntactic_bindings(asent);
        final SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_function_corresponding_predicate.NIL != v_bindings) {
            final SubLObject sentence = bindings.apply_bindings(v_bindings, asent);
            if (removal_modules_function_corresponding_predicate.NIL == czer_meta.find_visible_assertion_cycl(sentence, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_function_corresponding_predicate.$kw61$OPAQUE, sentence, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                backward.removal_add_node(support, v_bindings, supports);
            }
        }
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 15626L)
    public static SubLObject removal_fcp_syntactic_bindings(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        SubLObject supports = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        SubLObject ignore_errors_tag = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
        try {
            thread.throwStack.push(removal_modules_function_corresponding_predicate.$kw72$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)removal_modules_function_corresponding_predicate.$sym73$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    if (removal_modules_function_corresponding_predicate.NIL != kb_indexing_datastructures.indexed_term_p(pred) && removal_modules_function_corresponding_predicate.NIL == v_bindings) {
                        final SubLObject node_var = removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca;
                        final SubLObject deck_type = (SubLObject)removal_modules_function_corresponding_predicate.$kw37$QUEUE;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        SubLObject node_and_predicate_mode = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                        final SubLObject _prev_bind_0_$133 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                final SubLObject _prev_bind_0_$134 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((removal_modules_function_corresponding_predicate.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != tv_var) ? removal_modules_function_corresponding_predicate.$sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (removal_modules_function_corresponding_predicate.NIL != tv_var && removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw39$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw42$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)removal_modules_function_corresponding_predicate.$kw44$WARN)) {
                                            Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)removal_modules_function_corresponding_predicate.$str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)removal_modules_function_corresponding_predicate.$str43$continue_anyway, (SubLObject)removal_modules_function_corresponding_predicate.$str40$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_function_corresponding_predicate.$sym41$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$135 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$136 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds), thread);
                                        if (removal_modules_function_corresponding_predicate.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_function_corresponding_predicate.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$136 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$137 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$139 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_function_corresponding_predicate.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_function_corresponding_predicate.NIL != node_and_predicate_mode && removal_modules_function_corresponding_predicate.NIL == v_bindings; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                    final SubLObject node_var_$140 = node_and_predicate_mode.first();
                                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                    final SubLObject fcp_pred = node_var_$140;
                                                    final SubLObject _prev_bind_0_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                        if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$140)) {
                                                            final SubLObject pred_var = fcp_pred;
                                                            if (removal_modules_function_corresponding_predicate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var)) {
                                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, pred_var);
                                                                SubLObject done_var = v_bindings;
                                                                final SubLObject token_var = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                while (removal_modules_function_corresponding_predicate.NIL == done_var) {
                                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                                    if (removal_modules_function_corresponding_predicate.NIL != valid) {
                                                                        SubLObject final_index_iterator = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                        try {
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_function_corresponding_predicate.$kw27$GAF, (SubLObject)removal_modules_function_corresponding_predicate.$kw11$TRUE, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                                                                            SubLObject done_var_$142 = v_bindings;
                                                                            final SubLObject token_var_$143 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                            while (removal_modules_function_corresponding_predicate.NIL == done_var_$142) {
                                                                                final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$143);
                                                                                final SubLObject valid_$144 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$143.eql(fcp_as));
                                                                                if (removal_modules_function_corresponding_predicate.NIL != valid_$144) {
                                                                                    final SubLObject fcp_argnum = assertions_high.gaf_arg3(fcp_as);
                                                                                    final SubLObject fcp_func = assertions_high.gaf_arg1(fcp_as);
                                                                                    final SubLObject expanded_asent = narts_high.nart_expand(asent);
                                                                                    SubLObject args = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                    SubLObject func = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                    SubLObject v_answer = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                    if (cycl_utilities.atomic_sentence_arg(expanded_asent, fcp_argnum, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED).isCons()) {
                                                                                        SubLObject argnum = (SubLObject)removal_modules_function_corresponding_predicate.ZERO_INTEGER;
                                                                                        SubLObject cdolist_list_var;
                                                                                        final SubLObject args_$145 = cdolist_list_var = cycl_utilities.formula_args(expanded_asent, (SubLObject)removal_modules_function_corresponding_predicate.$kw29$IGNORE);
                                                                                        SubLObject arg = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                        arg = cdolist_list_var.first();
                                                                                        while (removal_modules_function_corresponding_predicate.NIL != cdolist_list_var) {
                                                                                            argnum = Numbers.add(argnum, (SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER);
                                                                                            if (argnum.eql(fcp_argnum)) {
                                                                                                if (arg.isCons()) {
                                                                                                    final SubLObject datum_evaluated_var = arg;
                                                                                                    func = datum_evaluated_var.first();
                                                                                                    v_answer = datum_evaluated_var.rest();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                args = (SubLObject)ConsesLow.cons(arg, args);
                                                                                            }
                                                                                            cdolist_list_var = cdolist_list_var.rest();
                                                                                            arg = cdolist_list_var.first();
                                                                                        }
                                                                                        args = Sequences.nreverse(args);
                                                                                        pred = cycl_utilities.atomic_sentence_predicate(expanded_asent);
                                                                                    }
                                                                                    if (removal_modules_function_corresponding_predicate.NIL != func && removal_modules_function_corresponding_predicate.NIL != ghl_search_methods.gt_predicate_relation_p(removal_modules_function_corresponding_predicate.$const74$genlFuncs, func, fcp_func, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED) && removal_modules_function_corresponding_predicate.NIL != wff.el_wftP((SubLObject)ConsesLow.cons(func, v_answer), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                        v_answer = narts_high.nart_substitute(v_answer);
                                                                                        v_bindings = unification_utilities.term_unify(args, v_answer, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                        if (removal_modules_function_corresponding_predicate.NIL == kb_utilities.kbeq(func, fcp_func)) {
                                                                                            supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_function_corresponding_predicate.$kw75$QUERY, (SubLObject)ConsesLow.list(removal_modules_function_corresponding_predicate.$const74$genlFuncs, func, fcp_func), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED), supports);
                                                                                        }
                                                                                        supports = (SubLObject)ConsesLow.cons(fcp_as, supports);
                                                                                    }
                                                                                }
                                                                                done_var_$142 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid_$144 || removal_modules_function_corresponding_predicate.NIL != v_bindings);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            final SubLObject _prev_bind_0_$138 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                                if (removal_modules_function_corresponding_predicate.NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                                Values.restoreValuesFromVector(_values);
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$138, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == valid || removal_modules_function_corresponding_predicate.NIL != v_bindings);
                                                                }
                                                            }
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_function_corresponding_predicate.$const46$genlPreds));
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$139;
                                                        SubLObject _prev_bind_1_$138;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$140;
                                                        SubLObject iteration_state_$150;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$141;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$152;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$142;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest = accessible_modules; removal_modules_function_corresponding_predicate.NIL == v_bindings && removal_modules_function_corresponding_predicate.NIL != rest; rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$139 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_function_corresponding_predicate.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                node = function_terms.naut_to_nart(node_var_$140);
                                                                if (removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                                    if (removal_modules_function_corresponding_predicate.NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED));
                                                                        if (removal_modules_function_corresponding_predicate.NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_function_corresponding_predicate.NIL == v_bindings && removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_function_corresponding_predicate.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    _prev_bind_0_$140 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        for (iteration_state_$150 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_function_corresponding_predicate.NIL == v_bindings && removal_modules_function_corresponding_predicate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$150); iteration_state_$150 = dictionary_contents.do_dictionary_contents_next(iteration_state_$150)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$150);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (removal_modules_function_corresponding_predicate.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_function_corresponding_predicate.NIL == v_bindings && removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol.isList()) {
                                                                                                        if (removal_modules_function_corresponding_predicate.NIL == v_bindings) {
                                                                                                            csome_list_var = sol;
                                                                                                            node_vars_link_node2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                            while (removal_modules_function_corresponding_predicate.NIL == v_bindings && removal_modules_function_corresponding_predicate.NIL != csome_list_var) {
                                                                                                                if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$141, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$150);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$140, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)removal_modules_function_corresponding_predicate.FIVE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str48$attempting_to_bind_direction_link, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (removal_modules_function_corresponding_predicate.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                    new_list = ((removal_modules_function_corresponding_predicate.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)));
                                                                    for (rest_$152 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, rest_$152 = new_list; removal_modules_function_corresponding_predicate.NIL == v_bindings && removal_modules_function_corresponding_predicate.NIL != rest_$152; rest_$152 = rest_$152.rest()) {
                                                                        generating_fn = rest_$152.first();
                                                                        _prev_bind_0_$142 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                            if (removal_modules_function_corresponding_predicate.NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_function_corresponding_predicate.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_function_corresponding_predicate.NIL == v_bindings && removal_modules_function_corresponding_predicate.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if (removal_modules_function_corresponding_predicate.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol2.isList()) {
                                                                                if (removal_modules_function_corresponding_predicate.NIL == v_bindings) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = (SubLObject)removal_modules_function_corresponding_predicate.NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while (removal_modules_function_corresponding_predicate.NIL == v_bindings && removal_modules_function_corresponding_predicate.NIL != csome_list_var2) {
                                                                                        if (removal_modules_function_corresponding_predicate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)removal_modules_function_corresponding_predicate.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$142, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$138, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$139, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$137, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$139, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$137, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$136, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.$str49$Node__a_does_not_pass_sbhl_type_t, removal_modules_function_corresponding_predicate.$const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED)), (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED, (SubLObject)removal_modules_function_corresponding_predicate.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$136, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$135, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$134, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$143 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_function_corresponding_predicate.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$133, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)removal_modules_function_corresponding_predicate.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)removal_modules_function_corresponding_predicate.$kw72$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(v_bindings, supports);
    }
    
    public static SubLObject declare_removal_modules_function_corresponding_predicate_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "do_fcp_assertions_for_pred", "DO-FCP-ASSERTIONS-FOR-PRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "do_corresponding_evaluatable_functions", "DO-CORRESPONDING-EVALUATABLE-FUNCTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "should_bind_all_but_functional_in_arg_position", "SHOULD-BIND-ALL-BUT-FUNCTIONAL-IN-ARG-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "fcp_canonical_predicateP", "FCP-CANONICAL-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_check_expand", "REMOVAL-FCP-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_check_required", "REMOVAL-FCP-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_find_nat_expand", "REMOVAL-FCP-FIND-NAT-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_find_nat_required", "REMOVAL-FCP-FIND-NAT-REQUIRED", 1, 1, false);
        new $removal_fcp_find_nat_required$UnaryFunction();
        new $removal_fcp_find_nat_required$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_support", "REMOVAL-FCP-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_bindings", "REMOVAL-FCP-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_justify", "REMOVAL-FCP-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_verify", "REMOVAL-FCP-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_evaluatable_fcp_unify_required", "REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_evaluatable_fcp_unify_expand", "REMOVAL-EVALUATABLE-FCP-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_with_genl_preds_wrt_args_required", "REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_with_genl_preds_wrt_args_expand", "REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "fcp_with_genl_preds_wrt_args_arg2", "FCP-WITH-GENL-PREDS-WRT-ARGS-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "asent_uses_predicate_with_corresponding_evaluatable_function_with_non_functional_arg_unboundP", "ASENT-USES-PREDICATE-WITH-CORRESPONDING-EVALUATABLE-FUNCTION-WITH-NON-FUNCTIONAL-ARG-UNBOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_syntactic_required", "REMOVAL-FCP-SYNTACTIC-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_syntactic_expand", "REMOVAL-FCP-SYNTACTIC-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate", "removal_fcp_syntactic_bindings", "REMOVAL-FCP-SYNTACTIC-BINDINGS", 1, 0, false);
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    public static SubLObject init_removal_modules_function_corresponding_predicate_file() {
        removal_modules_function_corresponding_predicate.$use_fcp_removal_moduleP$ = SubLFiles.deflexical("*USE-FCP-REMOVAL-MODULE?*", (SubLObject)((removal_modules_function_corresponding_predicate.NIL != Symbols.boundp((SubLObject)removal_modules_function_corresponding_predicate.$sym0$_USE_FCP_REMOVAL_MODULE__)) ? removal_modules_function_corresponding_predicate.$use_fcp_removal_moduleP$.getGlobalValue() : removal_modules_function_corresponding_predicate.NIL));
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    public static SubLObject setup_removal_modules_function_corresponding_predicate_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_function_corresponding_predicate.$sym0$_USE_FCP_REMOVAL_MODULE__);
        preference_modules.inference_preference_module((SubLObject)removal_modules_function_corresponding_predicate.$kw24$REMOVAL_FCP_UNIFY, (SubLObject)removal_modules_function_corresponding_predicate.$list25);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_function_corresponding_predicate.$sym34$SHOULD_BIND_ALL_BUT_FUNCTIONAL_IN_ARG_POSITION);
        inference_modules.inference_removal_module((SubLObject)removal_modules_function_corresponding_predicate.$kw50$REMOVAL_FCP_CHECK, (SubLObject)removal_modules_function_corresponding_predicate.$list51);
        inference_modules.inference_removal_module((SubLObject)removal_modules_function_corresponding_predicate.$kw53$REMOVAL_FCP_FIND_NAT, (SubLObject)removal_modules_function_corresponding_predicate.$list54);
        inference_modules.inference_removal_module((SubLObject)removal_modules_function_corresponding_predicate.$kw56$REMOVAL_EVALUATABLE_FCP_UNIFY, (SubLObject)removal_modules_function_corresponding_predicate.$list57);
        inference_modules.inference_removal_module((SubLObject)removal_modules_function_corresponding_predicate.$kw59$REMOVAL_FCP_WITH_GENL_PREDS_WRT_ARGS, (SubLObject)removal_modules_function_corresponding_predicate.$list60);
        preference_modules.inference_preference_module((SubLObject)removal_modules_function_corresponding_predicate.$kw67$REMOVAL_FCP_WHERE_FUNCTION_EVALUATABLE, (SubLObject)removal_modules_function_corresponding_predicate.$list68);
        inference_modules.inference_removal_module((SubLObject)removal_modules_function_corresponding_predicate.$kw70$REMOVAL_FCP_SYNTACTIC, (SubLObject)removal_modules_function_corresponding_predicate.$list71);
        return (SubLObject)removal_modules_function_corresponding_predicate.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_function_corresponding_predicate_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_function_corresponding_predicate_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_function_corresponding_predicate_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_function_corresponding_predicate();
        removal_modules_function_corresponding_predicate.$use_fcp_removal_moduleP$ = null;
        $sym0$_USE_FCP_REMOVAL_MODULE__ = SubLObjectFactory.makeSymbol("*USE-FCP-REMOVAL-MODULE?*");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCP-AS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$FCP_PRED = SubLObjectFactory.makeUninternedSymbol("FCP-PRED");
        $sym3$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym4$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym5$DO_ALL_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("DO-ALL-SPEC-PREDICATES");
        $const6$functionCorrespondingPredicate_Ca = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate-Canonical"));
        $sym7$DO_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $kw8$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw9$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw10$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw11$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw12$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-ASSERTION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-ASSERTION"));
        $kw15$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw16$SUPPORT_ASSERTION = SubLObjectFactory.makeKeyword("SUPPORT-ASSERTION");
        $sym17$DO_GAF_ARG_INDEX_GP = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-GP");
        $sym18$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym19$GAF_ARG1 = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $sym20$GAF_ARG3 = SubLObjectFactory.makeSymbol("GAF-ARG3");
        $sym21$EVALUATABLE_FUNCTION_P = SubLObjectFactory.makeSymbol("EVALUATABLE-FUNCTION-P");
        $sym22$SUPPORT_ASSERTION = SubLObjectFactory.makeUninternedSymbol("SUPPORT-ASSERTION");
        $sym23$DO_CORRESPONDING_EVALUATABLE_FUNCTIONS = SubLObjectFactory.makeSymbol("DO-CORRESPONDING-EVALUATABLE-FUNCTIONS");
        $kw24$REMOVAL_FCP_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-FCP-UNIFY");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOULD-BIND-ALL-BUT-FUNCTIONAL-IN-ARG-POSITION"));
        $sym26$RELEVANT_PRED_IS_SPEC_PRED = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $kw27$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym28$RELEVANT_PRED_IS_SPEC_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $kw29$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw30$DOOMED = SubLObjectFactory.makeKeyword("DOOMED");
        $kw31$DISALLOWED = SubLObjectFactory.makeKeyword("DISALLOWED");
        $kw32$GROSSLY_DISPREFERRED = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $kw33$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $sym34$SHOULD_BIND_ALL_BUT_FUNCTIONAL_IN_ARG_POSITION = SubLObjectFactory.makeSymbol("SHOULD-BIND-ALL-BUT-FUNCTIONAL-IN-ARG-POSITION");
        $kw35$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw36$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw37$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw39$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str40$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym41$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw42$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str43$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw44$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str45$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const46$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str47$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str48$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str49$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw50$REMOVAL_FCP_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-FCP-CHECK");
        $list51 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-FCP-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_function_corresponding_predicate.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-FCP-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<functional-pred> . <args>)\n    with all ARGS fully bound\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$territoryOf #$France (#$TerritoryFn #$France))") });
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $kw53$REMOVAL_FCP_FIND_NAT = SubLObjectFactory.makeKeyword("REMOVAL-FCP-FIND-NAT");
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-FCP-FIND-NAT-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_function_corresponding_predicate.ZERO_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-FCP-FIND-NAT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<functional-pred> . <args>)\n    with only NAT arg not fully bound\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$territoryOf #$France ?TERRITORY)\n    (#$anatomicalPartOfType #$AbrahamLincoln #$Head-AnimalBodyPart ?HEAD)\n    (#$intervalEndedBy ?INTERVAL #$WorldWarII)") });
        $kw55$FCP = SubLObjectFactory.makeKeyword("FCP");
        $kw56$REMOVAL_EVALUATABLE_FCP_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-EVALUATABLE-FCP-UNIFY");
        $list57 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_function_corresponding_predicate.ONE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EVALUATABLE-FCP-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<functional-pred> . <args>)\n    with all ARGS fully bound except possibly the functional arg"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$commonResidue (#$Degree-UnitOfAngularMeasure 450) ?X)") });
        $const58$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $kw59$REMOVAL_FCP_WITH_GENL_PREDS_WRT_ARGS = SubLObjectFactory.makeKeyword("REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS");
        $list60 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS-REQUIRED"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_function_corresponding_predicate.ONE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<functional-pred> . <args>)\n    with all ARGS fully bound except possibly the functional arg"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$commonResidue (#$Degree-UnitOfAngularMeasure 450) ?X)") });
        $kw61$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const62$genlPredsWRTArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPredsWRTArgs"));
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WRT-ARGS"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-PRED2"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $list65 = ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.TWO_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.THREE_INTEGER);
        $list66 = ConsesLow.list((SubLObject)removal_modules_function_corresponding_predicate.ONE_INTEGER, (SubLObject)removal_modules_function_corresponding_predicate.THREE_INTEGER);
        $kw67$REMOVAL_FCP_WHERE_FUNCTION_EVALUATABLE = SubLObjectFactory.makeKeyword("REMOVAL-FCP-WHERE-FUNCTION-EVALUATABLE");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-USES-PREDICATE-WITH-CORRESPONDING-EVALUATABLE-FUNCTION-WITH-NON-FUNCTIONAL-ARG-UNBOUND?"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $sym69$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw70$REMOVAL_FCP_SYNTACTIC = SubLObjectFactory.makeKeyword("REMOVAL-FCP-SYNTACTIC");
        $list71 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-FCP-SYNTACTIC-REQUIRED"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FCP-CANONICAL-PREDICATE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-FCP-SYNTACTIC-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fcp-canon> ?X (<func> <answer>)) or (<fcp-canon> (<func> <answer>) ?X)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(vectorDirection ?WHAT (VectorDirectionFn HYP-VectorInterval-1))") });
        $kw72$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym73$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $const74$genlFuncs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlFuncs"));
        $kw75$QUERY = SubLObjectFactory.makeKeyword("QUERY");
    }
    
    public static final class $removal_fcp_find_nat_required$UnaryFunction extends UnaryFunction
    {
        public $removal_fcp_find_nat_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-FCP-FIND-NAT-REQUIRED"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_function_corresponding_predicate.removal_fcp_find_nat_required(arg1, (SubLObject)$removal_fcp_find_nat_required$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_fcp_find_nat_required$BinaryFunction extends BinaryFunction
    {
        public $removal_fcp_find_nat_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-FCP-FIND-NAT-REQUIRED"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_function_corresponding_predicate.removal_fcp_find_nat_required(arg1, arg2);
        }
    }
}

/*

	Total time: 3492 ms
	
*/