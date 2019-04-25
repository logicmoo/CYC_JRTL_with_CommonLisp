package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_reflexive_on extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on";
    public static final String myFingerPrint = "73c4796a6598b0c194daa1aef1f63790dde4a265a6bc8d2154364d5fc873374f";
    private static final SubLObject $const0$reflexiveOn;
    private static final SubLSymbol $kw1$TRUE;
    private static final SubLSymbol $sym2$FULLY_BOUND_P;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REFLEXIVE_ON;
    private static final SubLSymbol $kw5$INCOMPLETE;
    private static final SubLSymbol $kw6$GROSSLY_INCOMPLETE;
    private static final SubLSymbol $sym7$REFLEXIVE_ON_COMPLETNESS;
    private static final SubLSymbol $kw8$REMOVAL_REFLEXIVE_ON;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$EQUALITY;
    private static final SubLObject $const11$equals;
    private static final SubLSymbol $kw12$ISA;
    private static final SubLSymbol $kw13$DEFN;
    private static final SubLString $str14$Couldn_t_validate____isa__S__S__i;
    private static final SubLObject $const15$isa;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 870L)
    public static SubLObject reflexive_on_predicateP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((!removal_modules_reflexive_on.ONE_INTEGER.eql(somewhere_cache.some_pred_assertion_somewhere_argnum(removal_modules_reflexive_on.$const0$reflexiveOn)) || removal_modules_reflexive_on.NIL != somewhere_cache.some_pred_assertion_somewhereP(removal_modules_reflexive_on.$const0$reflexiveOn, v_object, (SubLObject)removal_modules_reflexive_on.ONE_INTEGER, (SubLObject)removal_modules_reflexive_on.UNPROVIDED)) && removal_modules_reflexive_on.NIL != kb_mapping_utilities.some_pred_value(v_object, removal_modules_reflexive_on.$const0$reflexiveOn, (SubLObject)removal_modules_reflexive_on.ONE_INTEGER, (SubLObject)removal_modules_reflexive_on.$kw1$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 1126L)
    public static SubLObject reflexive_on_cols(final SubLObject pred) {
        return kb_mapping_utilities.pred_values(pred, removal_modules_reflexive_on.$const0$reflexiveOn, (SubLObject)removal_modules_reflexive_on.ONE_INTEGER, (SubLObject)removal_modules_reflexive_on.TWO_INTEGER, (SubLObject)removal_modules_reflexive_on.$kw1$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 1220L)
    public static SubLObject removal_reflexive_on_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_reflexive_on.UNPROVIDED) {
            sense = (SubLObject)removal_modules_reflexive_on.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nautsP$.bind((SubLObject)removal_modules_reflexive_on.NIL, thread);
            final SubLObject fully_bound_arg = Sequences.find_if((SubLObject)removal_modules_reflexive_on.$sym2$FULLY_BOUND_P, cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_reflexive_on.UNPROVIDED), (SubLObject)removal_modules_reflexive_on.UNPROVIDED, (SubLObject)removal_modules_reflexive_on.UNPROVIDED, (SubLObject)removal_modules_reflexive_on.UNPROVIDED);
            SubLObject successP = (SubLObject)removal_modules_reflexive_on.NIL;
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_reflexive_on.UNPROVIDED);
            SubLObject pred = (SubLObject)removal_modules_reflexive_on.NIL;
            SubLObject arg1 = (SubLObject)removal_modules_reflexive_on.NIL;
            SubLObject arg2 = (SubLObject)removal_modules_reflexive_on.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_reflexive_on.$list3);
            pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_reflexive_on.$list3);
            arg1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_reflexive_on.$list3);
            arg2 = current.first();
            current = current.rest();
            if (removal_modules_reflexive_on.NIL == current) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, (SubLObject)removal_modules_reflexive_on.T, (SubLObject)removal_modules_reflexive_on.T);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_reflexive_on.NIL != v_bindings && removal_modules_reflexive_on.NIL == successP) {
                    SubLObject csome_list_var = reflexive_on_cols(pred);
                    SubLObject col = (SubLObject)removal_modules_reflexive_on.NIL;
                    col = csome_list_var.first();
                    while (removal_modules_reflexive_on.NIL == successP && removal_modules_reflexive_on.NIL != csome_list_var) {
                        if (removal_modules_reflexive_on.NIL != at_defns.has_typeP(fully_bound_arg, col, (SubLObject)removal_modules_reflexive_on.UNPROVIDED)) {
                            final SubLObject sentence = bindings.subst_bindings(v_bindings, asent);
                            final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_reflexive_on.$kw4$REFLEXIVE_ON, sentence, (SubLObject)removal_modules_reflexive_on.UNPROVIDED, (SubLObject)removal_modules_reflexive_on.UNPROVIDED);
                            backward.removal_add_node(support, v_bindings, justification);
                            successP = (SubLObject)removal_modules_reflexive_on.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        col = csome_list_var.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_reflexive_on.$list3);
            }
        }
        finally {
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_reflexive_on.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 1979L)
    public static SubLObject reflexive_on_completness(final SubLObject asent) {
        return (SubLObject)((removal_modules_reflexive_on.NIL != variables.fully_bound_p(asent)) ? removal_modules_reflexive_on.$kw5$INCOMPLETE : removal_modules_reflexive_on.$kw6$GROSSLY_INCOMPLETE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 2911L)
    public static SubLObject supports_for_reflexive_on(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_reflexive_on.NIL;
        final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
        SubLObject current;
        final SubLObject datum = current = atomic_sentence;
        SubLObject pred = (SubLObject)removal_modules_reflexive_on.NIL;
        SubLObject arg1 = (SubLObject)removal_modules_reflexive_on.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_reflexive_on.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_reflexive_on.$list3);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_reflexive_on.$list3);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_reflexive_on.$list3);
        arg2 = current.first();
        current = current.rest();
        if (removal_modules_reflexive_on.NIL == current) {
            if (removal_modules_reflexive_on.NIL != reflexive_on_predicateP(pred) && removal_modules_reflexive_on.NIL == ans) {
                SubLObject csome_list_var = reflexive_on_cols(pred);
                SubLObject col = (SubLObject)removal_modules_reflexive_on.NIL;
                col = csome_list_var.first();
                while (removal_modules_reflexive_on.NIL == ans && removal_modules_reflexive_on.NIL != csome_list_var) {
                    SubLObject reflexive_on_assertion = (SubLObject)removal_modules_reflexive_on.NIL;
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        reflexive_on_assertion = kb_mapping_utilities.fpred_u_v_holds_gaf(removal_modules_reflexive_on.$const0$reflexiveOn, pred, col, (SubLObject)removal_modules_reflexive_on.ONE_INTEGER, (SubLObject)removal_modules_reflexive_on.TWO_INTEGER, (SubLObject)removal_modules_reflexive_on.$kw1$TRUE);
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    if (removal_modules_reflexive_on.NIL != reflexive_on_assertion && removal_modules_reflexive_on.NIL != at_defns.has_typeP(arg1, col, (SubLObject)removal_modules_reflexive_on.UNPROVIDED)) {
                        if (!arg1.equal(arg2)) {
                            ans = (SubLObject)ConsesLow.cons(reflexive_on_isa_support(arg2, col, mt), ans);
                            ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_reflexive_on.$kw10$EQUALITY, el_utilities.make_binary_formula(removal_modules_reflexive_on.$const11$equals, arg1, arg2), mt, (SubLObject)removal_modules_reflexive_on.UNPROVIDED), ans);
                        }
                        ans = (SubLObject)ConsesLow.cons(reflexive_on_isa_support(arg1, col, mt), ans);
                        ans = (SubLObject)ConsesLow.cons(reflexive_on_assertion, ans);
                    }
                    csome_list_var = csome_list_var.rest();
                    col = csome_list_var.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_reflexive_on.$list3);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 3779L)
    public static SubLObject reflexive_on_isa_support(final SubLObject v_term, final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_module = (SubLObject)removal_modules_reflexive_on.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (removal_modules_reflexive_on.NIL != isa.isaP(v_term, col, (SubLObject)removal_modules_reflexive_on.UNPROVIDED, (SubLObject)removal_modules_reflexive_on.UNPROVIDED)) {
                support_module = (SubLObject)removal_modules_reflexive_on.$kw12$ISA;
            }
            else if (removal_modules_reflexive_on.NIL != at_defns.has_typeP(v_term, col, (SubLObject)removal_modules_reflexive_on.UNPROVIDED)) {
                support_module = (SubLObject)removal_modules_reflexive_on.$kw13$DEFN;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_reflexive_on.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && removal_modules_reflexive_on.NIL == support_module) {
            Errors.error((SubLObject)removal_modules_reflexive_on.$str14$Couldn_t_validate____isa__S__S__i, v_term, col, mt);
        }
        return arguments.make_hl_support(support_module, el_utilities.make_binary_formula(removal_modules_reflexive_on.$const15$isa, v_term, col), mt, (SubLObject)removal_modules_reflexive_on.UNPROVIDED);
    }
    
    public static SubLObject declare_removal_modules_reflexive_on_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on", "reflexive_on_predicateP", "REFLEXIVE-ON-PREDICATE?", 1, 0, false);
        new $reflexive_on_predicateP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on", "reflexive_on_cols", "REFLEXIVE-ON-COLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on", "removal_reflexive_on_expand", "REMOVAL-REFLEXIVE-ON-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on", "reflexive_on_completness", "REFLEXIVE-ON-COMPLETNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on", "supports_for_reflexive_on", "SUPPORTS-FOR-REFLEXIVE-ON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on", "reflexive_on_isa_support", "REFLEXIVE-ON-ISA-SUPPORT", 3, 0, false);
        return (SubLObject)removal_modules_reflexive_on.NIL;
    }
    
    public static SubLObject init_removal_modules_reflexive_on_file() {
        return (SubLObject)removal_modules_reflexive_on.NIL;
    }
    
    public static SubLObject setup_removal_modules_reflexive_on_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_reflexive_on.$sym7$REFLEXIVE_ON_COMPLETNESS);
        inference_modules.inference_removal_module((SubLObject)removal_modules_reflexive_on.$kw8$REMOVAL_REFLEXIVE_ON, (SubLObject)removal_modules_reflexive_on.$list9);
        return (SubLObject)removal_modules_reflexive_on.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_reflexive_on_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_reflexive_on_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_reflexive_on_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_reflexive_on();
        $const0$reflexiveOn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reflexiveOn"));
        $kw1$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym2$FULLY_BOUND_P = SubLObjectFactory.makeSymbol("FULLY-BOUND-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $kw4$REFLEXIVE_ON = SubLObjectFactory.makeKeyword("REFLEXIVE-ON");
        $kw5$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw6$GROSSLY_INCOMPLETE = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $sym7$REFLEXIVE_ON_COMPLETNESS = SubLObjectFactory.makeSymbol("REFLEXIVE-ON-COMPLETNESS");
        $kw8$REMOVAL_REFLEXIVE_ON = SubLObjectFactory.makeKeyword("REMOVAL-REFLEXIVE-ON");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_reflexive_on.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REFLEXIVE-ON-PREDICATE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REFLEXIVE-ON-COMPLETNESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<reflexive predicate> arg1 arg2)\nwhere at least one of arg1 and arg2 is fully bound, \nby unification of arg1 and arg2\n"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$whollyLocatedAt-Spatial #$EarthsEquator ?X) in #$WorldGeographyMt\nvia\n (#$reflexiveOn #$whollyLocatedAt-Spatial #$SpaceRegion)\nand\n (#$isa #$EarthsEquator #$SpaceRegion)") });
        $kw10$EQUALITY = SubLObjectFactory.makeKeyword("EQUALITY");
        $const11$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw12$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw13$DEFN = SubLObjectFactory.makeKeyword("DEFN");
        $str14$Couldn_t_validate____isa__S__S__i = SubLObjectFactory.makeString("Couldn't validate (#$isa ~S ~S) in ~S");
        $const15$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
    }
    
    public static final class $reflexive_on_predicateP$UnaryFunction extends UnaryFunction
    {
        public $reflexive_on_predicateP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REFLEXIVE-ON-PREDICATE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_reflexive_on.reflexive_on_predicateP(arg1);
        }
    }
}

/*

	Total time: 104 ms
	
*/