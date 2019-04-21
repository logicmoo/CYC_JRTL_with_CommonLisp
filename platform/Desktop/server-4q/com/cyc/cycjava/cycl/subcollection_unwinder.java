package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.conjunctive_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subcollection_unwinder extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subcollection_unwinder";
    public static final String myFingerPrint = "9b861224aeffb9754ab4abeee053f65141390ac4df0572394219c55f0f813c82";
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 882L)
    private static SubLSymbol $subcol_unwind_existential_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 9358L)
    private static SubLSymbol $isa_subcol_unwind_patterns$;
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 9925L)
    private static SubLSymbol $isa_subcol_unwind_patterns_complex$;
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 22723L)
    private static SubLSymbol $isa_subcol_unwind_template_map$;
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 34305L)
    private static SubLSymbol $existential_unwind_patterns$;
    private static final SubLSymbol $kw0$UNINITIALIZED;
    private static final SubLSymbol $sym1$PIF;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$PROGN;
    private static final SubLSymbol $sym6$_EXIT;
    private static final SubLSymbol $sym7$SUBCOL_UNWIND_LITERAL_INT;
    private static final SubLSymbol $kw8$EXISTS;
    private static final SubLObject $const9$isa;
    private static final SubLObject $const10$equals;
    private static final SubLObject $const11$equalSymbols;
    private static final SubLObject $const12$Kappa;
    private static final SubLObject $const13$TheSetOf;
    private static final SubLSymbol $sym14$DMR_SUBCOL_EXPAND_SIGNATURE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CAAR;
    private static final SubLObject $const17$subcollectionFunctionClassificati;
    private static final SubLSymbol $sym18$EL_VAR_;
    private static final SubLSymbol $sym19$EL_VAR_TO_KEYWORD;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$_ISA_SUBCOL_UNWIND_PATTERNS_;
    private static final SubLSymbol $sym22$IS_SUBCOLLECTION_PATTERN_PREDICATE_ASSERTION;
    private static final SubLSymbol $sym23$FORMULA_ARG0;
    private static final SubLObject $list24;
    private static final SubLSymbol $sym25$_ISA_SUBCOL_UNWIND_TEMPLATE_MAP_;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$META_VARIABLE_P;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$OBJ;
    private static final SubLSymbol $kw30$BIND;
    private static final SubLSymbol $kw31$VALUE;
    private static final SubLSymbol $kw32$TEMPLATE;
    private static final SubLObject $const33$Thing;
    private static final SubLObject $const34$CollectionIntersection2Fn;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLObject $const37$elementOf;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$CAADR;
    private static final SubLList $list41;
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 1150L)
    public static SubLObject with_existential_variable_tracking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)subcollection_unwinder.$sym1$PIF, (SubLObject)subcollection_unwinder.$list2, (SubLObject)ConsesLow.listS((SubLObject)subcollection_unwinder.$sym3$CLET, (SubLObject)subcollection_unwinder.$list4, ConsesLow.append(body, (SubLObject)subcollection_unwinder.NIL)), reader.bq_cons((SubLObject)subcollection_unwinder.$sym5$PROGN, ConsesLow.append(body, (SubLObject)subcollection_unwinder.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 1394L)
    public static SubLObject subcol_unwind_literal(final SubLObject literal) {
        return subcol_unwind_literals((SubLObject)ConsesLow.list(literal));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 1491L)
    public static SubLObject subcol_unwind_literals(final SubLObject literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread).eql((SubLObject)subcollection_unwinder.$kw0$UNINITIALIZED)) {
            final SubLObject _prev_bind_0 = subcollection_unwinder.$subcol_unwind_existential_variables$.currentBinding(thread);
            try {
                subcollection_unwinder.$subcol_unwind_existential_variables$.bind((SubLObject)subcollection_unwinder.NIL, thread);
                SubLObject unwound_literals = (SubLObject)subcollection_unwinder.NIL;
                SubLObject v_variables = (SubLObject)subcollection_unwinder.NIL;
                unwound_literals = subcol_unwind_literals_int(literals);
                v_variables = Sequences.reverse(subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread));
                unwound_literals = Sequences.delete_duplicates(unwound_literals, Symbols.symbol_function((SubLObject)subcollection_unwinder.EQUAL), (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
                unwound_literals = kb_utilities.sort_terms(unwound_literals, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
                return Values.values(unwound_literals, v_variables);
            }
            finally {
                subcollection_unwinder.$subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject unwound_literals2 = (SubLObject)subcollection_unwinder.NIL;
        SubLObject v_variables2 = (SubLObject)subcollection_unwinder.NIL;
        unwound_literals2 = subcol_unwind_literals_int(literals);
        v_variables2 = Sequences.reverse(subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread));
        unwound_literals2 = Sequences.delete_duplicates(unwound_literals2, Symbols.symbol_function((SubLObject)subcollection_unwinder.EQUAL), (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        unwound_literals2 = kb_utilities.sort_terms(unwound_literals2, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        return Values.values(unwound_literals2, v_variables2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 1961L)
    public static SubLObject subcol_unwind_literals_int(final SubLObject literals) {
        SubLObject unwindings;
        for (unwindings = (SubLObject)ConsesLow.list(Mapping.mapcar(Symbols.symbol_function((SubLObject)subcollection_unwinder.$sym7$SUBCOL_UNWIND_LITERAL_INT), literals)); subcollection_unwinder.ONE_INTEGER.numE(Sequences.length(unwindings)); unwindings = unwindings.first()) {}
        return unwindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 2283L)
    public static SubLObject subcol_unwind_literal_int(final SubLObject literal) {
        SubLObject result = literal;
        if (subcollection_unwinder.NIL != isa_naut_literalP(literal)) {
            final SubLObject operator = cycl_utilities.formula_operator(cycl_utilities.formula_arg2(literal, (SubLObject)subcollection_unwinder.UNPROVIDED));
            final SubLObject template = subcol_unwind_template_lookup(operator);
            if (subcollection_unwinder.NIL != template) {
                final SubLObject unwindings = formula_pattern_match.pattern_transform_formula(template, literal, (SubLObject)subcollection_unwinder.UNPROVIDED);
                result = subcol_unwind_literals_int(unwindings);
            }
        }
        else if (subcollection_unwinder.NIL != existential_introduction_literalP(literal)) {
            final SubLObject operator = cycl_utilities.formula_operator(literal);
            final SubLObject template = subcol_existential_unwind_template_lookup(operator);
            if (subcollection_unwinder.NIL != template) {
                final SubLObject variable = subcol_unwind_allocate_existential_variable();
                final SubLObject v_bindings = (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)subcollection_unwinder.$kw8$EXISTS, variable));
                final SubLObject unwindings2 = formula_pattern_match.pattern_transform_formula(template, literal, v_bindings);
                result = subcol_unwind_literals_int(unwindings2);
            }
        }
        else if (subcollection_unwinder.NIL != el_utilities.kappa_asent_p(literal)) {
            final SubLObject kappa_predicate = cycl_utilities.formula_operator(literal);
            final SubLObject kappa_predicate_vars = el_utilities.kappa_predicate_formal_args(kappa_predicate);
            final SubLObject kappa_asent_args = cycl_utilities.formula_args(literal, (SubLObject)subcollection_unwinder.UNPROVIDED);
            SubLObject var_subs = (SubLObject)subcollection_unwinder.NIL;
            SubLObject cdolist_list_var = kappa_predicate_vars;
            SubLObject kappa_var = (SubLObject)subcollection_unwinder.NIL;
            kappa_var = cdolist_list_var.first();
            while (subcollection_unwinder.NIL != cdolist_list_var) {
                var_subs = (SubLObject)ConsesLow.cons(reader.bq_cons(kappa_var, cycl_variables.make_el_var(Symbols.gensym((SubLObject)subcollection_unwinder.UNPROVIDED))), var_subs);
                cdolist_list_var = cdolist_list_var.rest();
                kappa_var = cdolist_list_var.first();
            }
            result = reader.bq_cons(conses_high.sublis(var_subs, kappa_predicate, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED), ConsesLow.append(kappa_asent_args, (SubLObject)subcollection_unwinder.NIL));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 3678L)
    public static SubLObject isa_naut_literalP(final SubLObject v_object) {
        return binary_pred_arg2_naut_literalP(v_object, subcollection_unwinder.$const9$isa);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 3777L)
    public static SubLObject equals_naut_literalP(final SubLObject v_object) {
        return binary_pred_arg2_naut_literalP(v_object, subcollection_unwinder.$const10$equals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 3882L)
    public static SubLObject equal_symbols_naut_literalP(final SubLObject v_object) {
        return binary_pred_arg2_naut_literalP(v_object, subcollection_unwinder.$const11$equalSymbols);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 4000L)
    public static SubLObject binary_pred_arg2_naut_literalP(final SubLObject v_object, final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(subcollection_unwinder.NIL != el_utilities.el_formula_with_operator_p(v_object, pred) && subcollection_unwinder.NIL != el_utilities.el_binary_formula_p(v_object) && subcollection_unwinder.NIL != el_utilities.possibly_naut_p(cycl_utilities.el_formula_arg2(v_object, (SubLObject)subcollection_unwinder.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 4203L)
    public static SubLObject subcollection_kappa_expansion(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subcollection_unwinder.NIL != constrained_parsing.subcollection_naut_p(sentence)) {
            if (subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread).eql((SubLObject)subcollection_unwinder.$kw0$UNINITIALIZED)) {
                final SubLObject _prev_bind_0 = subcollection_unwinder.$subcol_unwind_existential_variables$.currentBinding(thread);
                try {
                    subcollection_unwinder.$subcol_unwind_existential_variables$.bind((SubLObject)subcollection_unwinder.NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject unwound_sentence = scg_subcl_expand_signature_int(sentence);
                    final SubLObject v_variables = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject variable = subcol_unwind_allocate_existential_variable();
                    final SubLObject existentially_wrapped_sentence = conjunctive_strategist.el_wrap_existentials(v_variables, unwound_sentence);
                    return el_utilities.make_binary_formula(subcollection_unwinder.$const12$Kappa, (SubLObject)ConsesLow.list(variable), existentially_wrapped_sentence);
                }
                finally {
                    subcollection_unwinder.$subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
                }
            }
            thread.resetMultipleValues();
            final SubLObject unwound_sentence2 = scg_subcl_expand_signature_int(sentence);
            final SubLObject v_variables2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
            final SubLObject existentially_wrapped_sentence2 = conjunctive_strategist.el_wrap_existentials(v_variables2, unwound_sentence2);
            return el_utilities.make_binary_formula(subcollection_unwinder.$const12$Kappa, (SubLObject)ConsesLow.list(variable2), existentially_wrapped_sentence2);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 5441L)
    public static SubLObject subcollection_the_set_of_expansion(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subcollection_unwinder.NIL != constrained_parsing.subcollection_naut_p(sentence)) {
            if (subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread).eql((SubLObject)subcollection_unwinder.$kw0$UNINITIALIZED)) {
                final SubLObject _prev_bind_0 = subcollection_unwinder.$subcol_unwind_existential_variables$.currentBinding(thread);
                try {
                    subcollection_unwinder.$subcol_unwind_existential_variables$.bind((SubLObject)subcollection_unwinder.NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject unwound_sentence = scg_subcl_expand_signature_int(sentence);
                    final SubLObject v_variables = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject variable = subcol_unwind_allocate_existential_variable();
                    final SubLObject existentially_wrapped_sentence = conjunctive_strategist.el_wrap_existentials(v_variables, unwound_sentence);
                    return el_utilities.make_binary_formula(subcollection_unwinder.$const13$TheSetOf, variable, existentially_wrapped_sentence);
                }
                finally {
                    subcollection_unwinder.$subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
                }
            }
            thread.resetMultipleValues();
            final SubLObject unwound_sentence2 = scg_subcl_expand_signature_int(sentence);
            final SubLObject v_variables2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
            final SubLObject existentially_wrapped_sentence2 = conjunctive_strategist.el_wrap_existentials(v_variables2, unwound_sentence2);
            return el_utilities.make_binary_formula(subcollection_unwinder.$const13$TheSetOf, variable2, existentially_wrapped_sentence2);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 5943L)
    public static SubLObject scg_subcol_expand_to_existential_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread).eql((SubLObject)subcollection_unwinder.$kw0$UNINITIALIZED)) {
            final SubLObject _prev_bind_0 = subcollection_unwinder.$subcol_unwind_existential_variables$.currentBinding(thread);
            try {
                subcollection_unwinder.$subcol_unwind_existential_variables$.bind((SubLObject)subcollection_unwinder.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject unwound_sentence = scg_subcol_expand_signature(sentence);
                final SubLObject v_variables = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return conjunctive_strategist.el_wrap_existentials(kb_utilities.sort_terms(v_variables, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED), unwound_sentence);
            }
            finally {
                subcollection_unwinder.$subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
            }
        }
        thread.resetMultipleValues();
        final SubLObject unwound_sentence2 = scg_subcol_expand_signature(sentence);
        final SubLObject v_variables2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return conjunctive_strategist.el_wrap_existentials(kb_utilities.sort_terms(v_variables2, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED), unwound_sentence2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 6222L)
    public static SubLObject scg_subcol_expand_signature(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread).eql((SubLObject)subcollection_unwinder.$kw0$UNINITIALIZED)) {
            final SubLObject _prev_bind_0 = subcollection_unwinder.$subcol_unwind_existential_variables$.currentBinding(thread);
            try {
                subcollection_unwinder.$subcol_unwind_existential_variables$.bind((SubLObject)subcollection_unwinder.NIL, thread);
                if (subcollection_unwinder.NIL != equals_naut_literalP(sentence) || subcollection_unwinder.NIL != equal_symbols_naut_literalP(sentence)) {
                    return scg_subcl_expand_signature_int(cycl_utilities.formula_arg2(sentence, (SubLObject)subcollection_unwinder.UNPROVIDED));
                }
                if (subcollection_unwinder.NIL != isa_naut_literalP(sentence)) {
                    return scg_subcl_expand_signature_int(cycl_utilities.formula_arg2(sentence, (SubLObject)subcollection_unwinder.UNPROVIDED));
                }
                if (subcollection_unwinder.NIL != el_utilities.el_conjunction_p(sentence)) {
                    final SubLObject conjuncts = sentence.rest();
                    SubLObject unwound_literals = (SubLObject)subcollection_unwinder.NIL;
                    SubLObject v_variables = (SubLObject)subcollection_unwinder.NIL;
                    SubLObject cdolist_list_var = conjuncts;
                    SubLObject conjunct = (SubLObject)subcollection_unwinder.NIL;
                    conjunct = cdolist_list_var.first();
                    while (subcollection_unwinder.NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject unwound_sentence = scg_subcol_expand_signature(conjunct);
                        final SubLObject conjunct_variables = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        unwound_literals = ConsesLow.append(unwound_literals, (SubLObject)ConsesLow.list(unwound_sentence));
                        v_variables = conses_high.union(v_variables, conjunct_variables, Symbols.symbol_function((SubLObject)subcollection_unwinder.EQUAL), (SubLObject)subcollection_unwinder.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        conjunct = cdolist_list_var.first();
                    }
                    return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(el_utilities.make_conjunction(unwound_literals), (SubLObject)subcollection_unwinder.UNPROVIDED), v_variables);
                }
            }
            finally {
                subcollection_unwinder.$subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            if (subcollection_unwinder.NIL != equals_naut_literalP(sentence) || subcollection_unwinder.NIL != equal_symbols_naut_literalP(sentence)) {
                return scg_subcl_expand_signature_int(cycl_utilities.formula_arg2(sentence, (SubLObject)subcollection_unwinder.UNPROVIDED));
            }
            if (subcollection_unwinder.NIL != isa_naut_literalP(sentence)) {
                return scg_subcl_expand_signature_int(cycl_utilities.formula_arg2(sentence, (SubLObject)subcollection_unwinder.UNPROVIDED));
            }
            if (subcollection_unwinder.NIL != el_utilities.el_conjunction_p(sentence)) {
                final SubLObject conjuncts2 = sentence.rest();
                SubLObject unwound_literals2 = (SubLObject)subcollection_unwinder.NIL;
                SubLObject v_variables2 = (SubLObject)subcollection_unwinder.NIL;
                SubLObject cdolist_list_var2 = conjuncts2;
                SubLObject conjunct2 = (SubLObject)subcollection_unwinder.NIL;
                conjunct2 = cdolist_list_var2.first();
                while (subcollection_unwinder.NIL != cdolist_list_var2) {
                    thread.resetMultipleValues();
                    final SubLObject unwound_sentence2 = scg_subcol_expand_signature(conjunct2);
                    final SubLObject conjunct_variables2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    unwound_literals2 = ConsesLow.append(unwound_literals2, (SubLObject)ConsesLow.list(unwound_sentence2));
                    v_variables2 = conses_high.union(v_variables2, conjunct_variables2, Symbols.symbol_function((SubLObject)subcollection_unwinder.EQUAL), (SubLObject)subcollection_unwinder.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    conjunct2 = cdolist_list_var2.first();
                }
                return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(el_utilities.make_conjunction(unwound_literals2), (SubLObject)subcollection_unwinder.UNPROVIDED), v_variables2);
            }
        }
        return subl_promotions.values2(sentence, (SubLObject)subcollection_unwinder.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 7231L)
    public static SubLObject scg_subcl_expand_signature_int(final SubLObject subcol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread).eql((SubLObject)subcollection_unwinder.$kw0$UNINITIALIZED)) {
            final SubLObject _prev_bind_0 = subcollection_unwinder.$subcol_unwind_existential_variables$.currentBinding(thread);
            try {
                subcollection_unwinder.$subcol_unwind_existential_variables$.bind((SubLObject)subcollection_unwinder.NIL, thread);
                if (subcollection_unwinder.NIL == subcol_unwind_template_lookup(cycl_utilities.formula_arg0(subcol))) {
                    return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(subcol, (SubLObject)subcollection_unwinder.UNPROVIDED), (SubLObject)subcollection_unwinder.NIL);
                }
                final SubLObject variable = subcol_unwind_allocate_existential_variable();
                final SubLObject literal = el_utilities.make_binary_formula(subcollection_unwinder.$const9$isa, variable, subcol);
                thread.resetMultipleValues();
                final SubLObject unwound_literal = subcol_unwind_literal(literal);
                final SubLObject v_variables = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(unwound_literal, (SubLObject)subcollection_unwinder.UNPROVIDED), v_variables);
            }
            finally {
                subcollection_unwinder.$subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
            }
        }
        if (subcollection_unwinder.NIL == subcol_unwind_template_lookup(cycl_utilities.formula_arg0(subcol))) {
            return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(subcol, (SubLObject)subcollection_unwinder.UNPROVIDED), (SubLObject)subcollection_unwinder.NIL);
        }
        final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
        final SubLObject literal2 = el_utilities.make_binary_formula(subcollection_unwinder.$const9$isa, variable2, subcol);
        thread.resetMultipleValues();
        final SubLObject unwound_literal2 = subcol_unwind_literal(literal2);
        final SubLObject v_variables2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(unwound_literal2, (SubLObject)subcollection_unwinder.UNPROVIDED), v_variables2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 7868L)
    public static SubLObject dmr_subcol_expand_signature(final SubLObject sentence) {
        return scg_subcol_expand_signature(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 8019L)
    public static SubLObject scg_sentence_fully_unwoundP(final SubLObject scg_sentence) {
        final SubLObject match_patterns = Mapping.mapcar(Symbols.symbol_function((SubLObject)subcollection_unwinder.$sym16$CAAR), subcollection_unwinder.$isa_subcol_unwind_patterns$.getGlobalValue());
        final SubLObject flat_scg_sent = list_utilities.flatten(scg_sentence);
        final SubLObject unwound_terms = conses_high.intersection(match_patterns, flat_scg_sent, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        if (subcollection_unwinder.NIL != unwound_terms) {
            return Values.values((SubLObject)subcollection_unwinder.NIL, unwound_terms);
        }
        return Values.values((SubLObject)subcollection_unwinder.T, (SubLObject)subcollection_unwinder.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 8603L)
    public static SubLObject is_subcollection_pattern_predicate_assertion(final SubLObject arg0) {
        return Equality.eql(arg0, subcollection_unwinder.$const17$subcollectionFunctionClassificati);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 8739L)
    public static SubLObject create_subcollection_unwind_template(final SubLObject subcollection_assertion) {
        final SubLObject subcollection_operator = cycl_utilities.formula_arg1(subcollection_assertion, (SubLObject)subcollection_unwinder.UNPROVIDED);
        final SubLObject subcollection_kappa = cycl_utilities.formula_arg2(subcollection_assertion, (SubLObject)subcollection_unwinder.UNPROVIDED);
        final SubLObject var_list = cycl_utilities.formula_arg1(subcollection_kappa, (SubLObject)subcollection_unwinder.UNPROVIDED);
        final SubLObject body = cycl_utilities.formula_arg2(subcollection_kappa, (SubLObject)subcollection_unwinder.UNPROVIDED);
        final SubLObject unwind_pattern_el = (SubLObject)ConsesLow.list(conses_high.adjoin(subcollection_operator, var_list.rest(), (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED), body);
        SubLObject unwind_pattern = cycl_utilities.formula_transform(unwind_pattern_el, (SubLObject)subcollection_unwinder.$sym18$EL_VAR_, (SubLObject)subcollection_unwinder.$sym19$EL_VAR_TO_KEYWORD, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        unwind_pattern = conses_high.nsublis((SubLObject)subcollection_unwinder.$list20, unwind_pattern, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        return unwind_pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 9411L)
    public static SubLObject get_subcollection_patterns_from_kb() {
        if (subcollection_unwinder.NIL == subcollection_unwinder.$isa_subcol_unwind_patterns$.getGlobalValue()) {
            final SubLObject all_assertions = kb_accessors.all_term_assertions(subcollection_unwinder.$const17$subcollectionFunctionClassificati, (SubLObject)subcollection_unwinder.UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject subcollection_assertions = cdolist_list_var = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)subcollection_unwinder.$sym22$IS_SUBCOLLECTION_PATTERN_PREDICATE_ASSERTION), all_assertions, Symbols.symbol_function((SubLObject)subcollection_unwinder.$sym23$FORMULA_ARG0), (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
            SubLObject subcol_assert = (SubLObject)subcollection_unwinder.NIL;
            subcol_assert = cdolist_list_var.first();
            while (subcollection_unwinder.NIL != cdolist_list_var) {
                subcollection_unwinder.$isa_subcol_unwind_patterns$.setGlobalValue((SubLObject)ConsesLow.cons(create_subcollection_unwind_template(subcol_assert), subcollection_unwinder.$isa_subcol_unwind_patterns$.getGlobalValue()));
                cdolist_list_var = cdolist_list_var.rest();
                subcol_assert = cdolist_list_var.first();
            }
            return (SubLObject)subcollection_unwinder.T;
        }
        return (SubLObject)subcollection_unwinder.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 30978L)
    public static SubLObject subcol_unwind_template_lookup(final SubLObject operator) {
        get_subcollection_patterns_from_kb();
        possibly_initialize_isa_subcol_unwind_template_map();
        return Hashtables.gethash_without_values(operator, subcollection_unwinder.$isa_subcol_unwind_template_map$.getGlobalValue(), (SubLObject)subcollection_unwinder.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 31232L)
    public static SubLObject possibly_initialize_isa_subcol_unwind_template_map() {
        if (subcollection_unwinder.NIL == subcollection_unwinder.$isa_subcol_unwind_template_map$.getGlobalValue()) {
            subcollection_unwinder.$isa_subcol_unwind_template_map$.setGlobalValue(Hashtables.make_hash_table(Sequences.length(subcollection_unwinder.$isa_subcol_unwind_patterns$.getGlobalValue()), Symbols.symbol_function((SubLObject)subcollection_unwinder.EQL), (SubLObject)subcollection_unwinder.UNPROVIDED));
            return rebuild_isa_subcol_unwind_template_map();
        }
        return (SubLObject)subcollection_unwinder.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 31507L)
    public static SubLObject rebuild_isa_subcol_unwind_template_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.clrhash(subcollection_unwinder.$isa_subcol_unwind_template_map$.getGlobalValue());
        SubLObject cdolist_list_var = ConsesLow.append(subcollection_unwinder.$isa_subcol_unwind_patterns$.getGlobalValue(), subcollection_unwinder.$isa_subcol_unwind_patterns_complex$.getDynamicValue(thread));
        SubLObject one_pattern = (SubLObject)subcollection_unwinder.NIL;
        one_pattern = cdolist_list_var.first();
        while (subcollection_unwinder.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = one_pattern;
            SubLObject match_pattern = (SubLObject)subcollection_unwinder.NIL;
            SubLObject substitute_pattern = (SubLObject)subcollection_unwinder.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subcollection_unwinder.$list26);
            match_pattern = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subcollection_unwinder.$list26);
            substitute_pattern = current.first();
            current = current.rest();
            if (subcollection_unwinder.NIL == current) {
                final SubLObject operator = cycl_utilities.formula_operator(match_pattern);
                final SubLObject template = compute_isa_subcol_unwind_template(match_pattern, substitute_pattern);
                Hashtables.sethash(operator, subcollection_unwinder.$isa_subcol_unwind_template_map$.getGlobalValue(), template);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subcollection_unwinder.$list26);
            }
            cdolist_list_var = cdolist_list_var.rest();
            one_pattern = cdolist_list_var.first();
        }
        return Hashtables.hash_table_size(subcollection_unwinder.$isa_subcol_unwind_template_map$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 32083L)
    public static SubLObject compute_isa_subcol_unwind_template(SubLObject match_pattern, SubLObject substitute_pattern) {
        SubLObject meta_variables = cycl_utilities.expression_gather(match_pattern, Symbols.symbol_function((SubLObject)subcollection_unwinder.$sym27$META_VARIABLE_P), (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        SubLObject bind_mapping = (SubLObject)subcollection_unwinder.NIL;
        SubLObject value_mapping = (SubLObject)subcollection_unwinder.NIL;
        meta_variables = conses_high.nset_difference(meta_variables, (SubLObject)subcollection_unwinder.$list28, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        final SubLObject item_var = (SubLObject)subcollection_unwinder.$kw29$OBJ;
        if (subcollection_unwinder.NIL == conses_high.member(item_var, meta_variables, Symbols.symbol_function((SubLObject)subcollection_unwinder.EQL), Symbols.symbol_function((SubLObject)subcollection_unwinder.IDENTITY))) {
            meta_variables = (SubLObject)ConsesLow.cons(item_var, meta_variables);
        }
        SubLObject cdolist_list_var = meta_variables;
        SubLObject meta_variable = (SubLObject)subcollection_unwinder.NIL;
        meta_variable = cdolist_list_var.first();
        while (subcollection_unwinder.NIL != cdolist_list_var) {
            final SubLObject pattern_symbol = Packages.intern(Symbols.symbol_name(meta_variable), control_vars.$cyc_package$.getGlobalValue());
            bind_mapping = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(meta_variable, (SubLObject)ConsesLow.list((SubLObject)subcollection_unwinder.$kw30$BIND, pattern_symbol)), bind_mapping);
            value_mapping = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(meta_variable, (SubLObject)ConsesLow.list((SubLObject)subcollection_unwinder.$kw31$VALUE, pattern_symbol)), value_mapping);
            cdolist_list_var = cdolist_list_var.rest();
            meta_variable = cdolist_list_var.first();
        }
        match_pattern = (SubLObject)ConsesLow.list(subcollection_unwinder.$const9$isa, (SubLObject)subcollection_unwinder.$kw29$OBJ, match_pattern);
        match_pattern = conses_high.sublis(bind_mapping, match_pattern, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        substitute_pattern = conses_high.sublis(value_mapping, substitute_pattern, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
        final SubLObject template = (SubLObject)ConsesLow.list((SubLObject)subcollection_unwinder.$kw32$TEMPLATE, match_pattern, substitute_pattern);
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 33133L)
    public static SubLObject subcol_unwind_collection_intersection_set(final SubLObject el_set) {
        final SubLObject elements = el_utilities.extensional_set_elements(el_set);
        return subcol_unwind_collection_intersection_set_recursive(elements);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 33365L)
    public static SubLObject subcol_unwind_collection_intersection_set_recursive(final SubLObject elements) {
        if (subcollection_unwinder.NIL == elements) {
            return subcollection_unwinder.$const33$Thing;
        }
        if (subcollection_unwinder.NIL != list_utilities.singletonP(elements)) {
            return elements.first();
        }
        if (subcollection_unwinder.NIL != list_utilities.doubletonP(elements)) {
            return el_utilities.make_binary_formula(subcollection_unwinder.$const34$CollectionIntersection2Fn, elements.first(), conses_high.second(elements));
        }
        SubLObject first = (SubLObject)subcollection_unwinder.NIL;
        SubLObject second = (SubLObject)subcollection_unwinder.NIL;
        SubLObject third = (SubLObject)subcollection_unwinder.NIL;
        SubLObject rest = (SubLObject)subcollection_unwinder.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(elements, elements, (SubLObject)subcollection_unwinder.$list35);
        first = elements.first();
        SubLObject current = elements.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, elements, (SubLObject)subcollection_unwinder.$list35);
        second = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, elements, (SubLObject)subcollection_unwinder.$list35);
        third = current.first();
        current = (rest = current.rest());
        final SubLObject subsolution = subcol_unwind_collection_intersection_set_recursive((SubLObject)ConsesLow.listS(second, third, rest));
        return el_utilities.make_binary_formula(subcollection_unwinder.$const34$CollectionIntersection2Fn, first, subsolution);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 33919L)
    public static SubLObject subcol_unwind_the_set(final SubLObject elements, final SubLObject predicate, final SubLObject outer_existential) {
        final SubLObject existential = subcol_unwind_allocate_existential_variable();
        SubLObject result = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(subcollection_unwinder.$const9$isa, existential, (SubLObject)subcollection_unwinder.$list36), (SubLObject)ConsesLow.list(predicate, outer_existential, existential));
        SubLObject cdolist_list_var = elements;
        SubLObject elem = (SubLObject)subcollection_unwinder.NIL;
        elem = cdolist_list_var.first();
        while (subcollection_unwinder.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(subcollection_unwinder.$const37$elementOf, elem, existential), result);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return el_utilities.make_conjunction(Sequences.nreverse(result));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 35126L)
    public static SubLObject subcol_substitute_pattern_existential(final SubLObject var, final SubLObject allocated_existential, final SubLObject body) {
        return conses_high.sublis((SubLObject)ConsesLow.list(reader.bq_cons(var, allocated_existential)), body, (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 35356L)
    public static SubLObject existential_introduction_literalP(final SubLObject v_object) {
        return el_utilities.el_formula_with_any_of_operators_p(v_object, (SubLObject)subcollection_unwinder.$list39);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 35550L)
    public static SubLObject subcol_existential_unwind_template_lookup(final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.find(operator, subcollection_unwinder.$existential_unwind_patterns$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)subcollection_unwinder.EQL), Symbols.symbol_function((SubLObject)subcollection_unwinder.$sym40$CAADR), (SubLObject)subcollection_unwinder.UNPROVIDED, (SubLObject)subcollection_unwinder.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 35730L)
    public static SubLObject subcol_unwind_allocate_existential_variable() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject num_alloc = Sequences.length(subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread));
        final SubLObject new_var = ConsesLow.nth(num_alloc, (SubLObject)subcollection_unwinder.$list41);
        subcollection_unwinder.$subcol_unwind_existential_variables$.setDynamicValue((SubLObject)ConsesLow.cons(new_var, subcollection_unwinder.$subcol_unwind_existential_variables$.getDynamicValue(thread)), thread);
        return new_var;
    }
    
    public static SubLObject declare_subcollection_unwinder_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subcollection_unwinder", "with_existential_variable_tracking", "WITH-EXISTENTIAL-VARIABLE-TRACKING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_literal", "SUBCOL-UNWIND-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_literals", "SUBCOL-UNWIND-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_literals_int", "SUBCOL-UNWIND-LITERALS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_literal_int", "SUBCOL-UNWIND-LITERAL-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "isa_naut_literalP", "ISA-NAUT-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "equals_naut_literalP", "EQUALS-NAUT-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "equal_symbols_naut_literalP", "EQUAL-SYMBOLS-NAUT-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "binary_pred_arg2_naut_literalP", "BINARY-PRED-ARG2-NAUT-LITERAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcollection_kappa_expansion", "SUBCOLLECTION-KAPPA-EXPANSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcollection_the_set_of_expansion", "SUBCOLLECTION-THE-SET-OF-EXPANSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "scg_subcol_expand_to_existential_sentence", "SCG-SUBCOL-EXPAND-TO-EXISTENTIAL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "scg_subcol_expand_signature", "SCG-SUBCOL-EXPAND-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "scg_subcl_expand_signature_int", "SCG-SUBCL-EXPAND-SIGNATURE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "dmr_subcol_expand_signature", "DMR-SUBCOL-EXPAND-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "scg_sentence_fully_unwoundP", "SCG-SENTENCE-FULLY-UNWOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "is_subcollection_pattern_predicate_assertion", "IS-SUBCOLLECTION-PATTERN-PREDICATE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "create_subcollection_unwind_template", "CREATE-SUBCOLLECTION-UNWIND-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "get_subcollection_patterns_from_kb", "GET-SUBCOLLECTION-PATTERNS-FROM-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_template_lookup", "SUBCOL-UNWIND-TEMPLATE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "possibly_initialize_isa_subcol_unwind_template_map", "POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "rebuild_isa_subcol_unwind_template_map", "REBUILD-ISA-SUBCOL-UNWIND-TEMPLATE-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "compute_isa_subcol_unwind_template", "COMPUTE-ISA-SUBCOL-UNWIND-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_collection_intersection_set", "SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_collection_intersection_set_recursive", "SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_the_set", "SUBCOL-UNWIND-THE-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_substitute_pattern_existential", "SUBCOL-SUBSTITUTE-PATTERN-EXISTENTIAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "existential_introduction_literalP", "EXISTENTIAL-INTRODUCTION-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_existential_unwind_template_lookup", "SUBCOL-EXISTENTIAL-UNWIND-TEMPLATE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwinder", "subcol_unwind_allocate_existential_variable", "SUBCOL-UNWIND-ALLOCATE-EXISTENTIAL-VARIABLE", 0, 0, false);
        return (SubLObject)subcollection_unwinder.NIL;
    }
    
    public static SubLObject init_subcollection_unwinder_file() {
        subcollection_unwinder.$subcol_unwind_existential_variables$ = SubLFiles.defparameter("*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*", (SubLObject)subcollection_unwinder.$kw0$UNINITIALIZED);
        subcollection_unwinder.$isa_subcol_unwind_patterns$ = SubLFiles.deflexical("*ISA-SUBCOL-UNWIND-PATTERNS*", (SubLObject)(maybeDefault((SubLObject)subcollection_unwinder.$sym21$_ISA_SUBCOL_UNWIND_PATTERNS_, subcollection_unwinder.$isa_subcol_unwind_patterns$, subcollection_unwinder.NIL)));
        subcollection_unwinder.$isa_subcol_unwind_patterns_complex$ = SubLFiles.defparameter("*ISA-SUBCOL-UNWIND-PATTERNS-COMPLEX*", subcollection_unwinder.$list24);
        subcollection_unwinder.$isa_subcol_unwind_template_map$ = SubLFiles.deflexical("*ISA-SUBCOL-UNWIND-TEMPLATE-MAP*", (SubLObject)(maybeDefault((SubLObject)subcollection_unwinder.$sym25$_ISA_SUBCOL_UNWIND_TEMPLATE_MAP_, subcollection_unwinder.$isa_subcol_unwind_template_map$, subcollection_unwinder.NIL)));
        subcollection_unwinder.$existential_unwind_patterns$ = SubLFiles.defparameter("*EXISTENTIAL-UNWIND-PATTERNS*", (SubLObject)subcollection_unwinder.$list38);
        return (SubLObject)subcollection_unwinder.NIL;
    }
    
    public static SubLObject setup_subcollection_unwinder_file() {
        access_macros.define_obsolete_register((SubLObject)subcollection_unwinder.$sym14$DMR_SUBCOL_EXPAND_SIGNATURE, (SubLObject)subcollection_unwinder.$list15);
        subl_macro_promotions.declare_defglobal((SubLObject)subcollection_unwinder.$sym21$_ISA_SUBCOL_UNWIND_PATTERNS_);
        subl_macro_promotions.declare_defglobal((SubLObject)subcollection_unwinder.$sym25$_ISA_SUBCOL_UNWIND_TEMPLATE_MAP_);
        return (SubLObject)subcollection_unwinder.NIL;
    }
    
    private static SubLObject _constant_24_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("SET"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET"), (SubLObject)SubLObjectFactory.makeKeyword("SET"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SitTypeSpecWithTypeRestrictionOnRolePlayerFn")), (SubLObject)SubLObjectFactory.makeKeyword("COL"), (SubLObject)SubLObjectFactory.makeKeyword("ROLE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("COL"), (SubLObject)SubLObjectFactory.makeKeyword("ROLE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenreFn")), (SubLObject)SubLObjectFactory.makeKeyword("COL1"), (SubLObject)SubLObjectFactory.makeKeyword("COL2")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), (SubLObject)SubLObjectFactory.makeKeyword("COL1"), (SubLObject)SubLObjectFactory.makeKeyword("COL2"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn")), (SubLObject)SubLObjectFactory.makeKeyword("SET")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("COL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeKeyword("COL"), (SubLObject)SubLObjectFactory.makeKeyword("SET")))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupFn")), (SubLObject)SubLObjectFactory.makeKeyword("COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Group"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("groupMembers")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("COL")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransportViaFn")), (SubLObject)SubLObjectFactory.makeKeyword("COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransportationEvent"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transporter")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("COL")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StockInFn")), (SubLObject)SubLObjectFactory.makeKeyword("CORPORATION")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stock"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("stockIssuedBy")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("CORPORATION")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WholeTypeForPartTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("PART-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("WHOLE-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("WHOLE-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properPhysicalParts")), (SubLObject)SubLObjectFactory.makeKeyword("PART-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("OBJ")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VideoClipOfSubjectFn")), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VideoRecordedObject"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("containsInformationAbout")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VideoClipTypeOfSubjectTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VideoRecordedObject"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("containsInformationAbout")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT-TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IssuingCredentialTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GrantingPermission"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("permissionsGranted")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("COL")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RecreationalFn")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION-TYPE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION-TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RecreationalActivity")))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlayerOfInstrumentFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MusicalInstrumentPlayer"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("skillCapableOf")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstrumentPlayingFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModelFn")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Model-Artifact"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("visuallyDepicts-Type")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("OBJ-TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProductionOfFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Production-Generic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("outputsCreated")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RoleWithResponsibilityForFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ACTIVITY")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("responsibleFor")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("ACTIVITY")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CitizenFn")), (SubLObject)SubLObjectFactory.makeKeyword("GEOPOLITICAL-ENTITY")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("citizens")), (SubLObject)SubLObjectFactory.makeKeyword("GEOPOLITICAL-ENTITY"), (SubLObject)SubLObjectFactory.makeKeyword("OBJ")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProfessionalFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PersonWithOccupation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("occupation")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResidentFn")), (SubLObject)SubLObjectFactory.makeKeyword("REGION")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("residesInRegion")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("REGION")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FrequentPerformerFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("playsRoleInTypeWithFrequency")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Often"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UsingAFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UsingADevice"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deviceUsed")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BelieverFn")), (SubLObject)SubLObjectFactory.makeKeyword("BELIEF-SYSTEM")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntelligentAgent"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasBeliefSystems")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("BELIEF-SYSTEM")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleAnimal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleAnimal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UsingAForFn")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ACT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ROLE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("ACT-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), (SubLObject)SubLObjectFactory.makeKeyword("ROLE"), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("OBJ-TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GlobalOrganizationFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InternationalOrganization"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExperiencingEmotionFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExperiencingEmotion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("feelingTypeExperienced")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupOfMinSizeFn")), (SubLObject)SubLObjectFactory.makeKeyword("N"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Group"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("groupCardinalityMin")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("N")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("groupMembers")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacteristicSoundTypeFromActionTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AudibleSound"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("soundEmitted")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("OBJ")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilitaryFn")), (SubLObject)SubLObjectFactory.makeKeyword("COUNTRY")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GovernmentMilitaryOrganization"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("officialArmedForces")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("COUNTRY")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithCapabilityFn")), (SubLObject)SubLObjectFactory.makeKeyword("COL"), (SubLObject)SubLObjectFactory.makeKeyword("SIT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ROLE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("behaviorCapable")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SIT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ROLE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupActivityFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleDoerAction")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agent-PartiallyTangible"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcquiringFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcquiringAnObject"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectOfPossessionTransfer")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubCollectionNamedFn")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperSubcollectionNamedFn-Ternary")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("COL"), (SubLObject)SubLObjectFactory.makeKeyword("GUID")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TechnologyForUseContextsOfTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("SIT-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Artifact-Generic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedPrimaryFunction")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SIT-TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deviceUsed"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileAnimal")), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperSubSituationTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("SIT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SUB-SIT-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SUB-SIT-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubSituations")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SIT-TYPE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SensorTypeByTargetSituationTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("SIT-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Sensor-Device"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedPrimaryFunction")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SIT-TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("detector"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), (SubLObject)SubLObjectFactory.makeKeyword("COL")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("COL")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENTS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCOL-UNWIND-THE-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENTS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("OBJ")))) });
    }
    
    @Override
	public void declareFunctions() {
        declare_subcollection_unwinder_file();
    }
    
    @Override
	public void initializeVariables() {
        init_subcollection_unwinder_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_subcollection_unwinder_file();
    }
    
    static {
        me = (SubLFile)new subcollection_unwinder();
        subcollection_unwinder.$subcol_unwind_existential_variables$ = null;
        subcollection_unwinder.$isa_subcol_unwind_patterns$ = null;
        subcollection_unwinder.$isa_subcol_unwind_patterns_complex$ = null;
        subcollection_unwinder.$isa_subcol_unwind_template_map$ = null;
        subcollection_unwinder.$existential_unwind_patterns$ = null;
        $kw0$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym1$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list2 = ConsesLow.list((SubLObject)subcollection_unwinder.EQL, (SubLObject)SubLObjectFactory.makeSymbol("*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED"));
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*"), (SubLObject)subcollection_unwinder.NIL));
        $sym5$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym6$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym7$SUBCOL_UNWIND_LITERAL_INT = SubLObjectFactory.makeSymbol("SUBCOL-UNWIND-LITERAL-INT");
        $kw8$EXISTS = SubLObjectFactory.makeKeyword("EXISTS");
        $const9$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const10$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const11$equalSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $const12$Kappa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $const13$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $sym14$DMR_SUBCOL_EXPAND_SIGNATURE = SubLObjectFactory.makeSymbol("DMR-SUBCOL-EXPAND-SIGNATURE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCG-SUBCOL-EXPAND-SIGNATURE"));
        $sym16$CAAR = SubLObjectFactory.makeSymbol("CAAR");
        $const17$subcollectionFunctionClassificati = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcollectionFunctionClassificationPredicate"));
        $sym18$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym19$EL_VAR_TO_KEYWORD = SubLObjectFactory.makeSymbol("EL-VAR-TO-KEYWORD");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("OBJ")));
        $sym21$_ISA_SUBCOL_UNWIND_PATTERNS_ = SubLObjectFactory.makeSymbol("*ISA-SUBCOL-UNWIND-PATTERNS*");
        $sym22$IS_SUBCOLLECTION_PATTERN_PREDICATE_ASSERTION = SubLObjectFactory.makeSymbol("IS-SUBCOLLECTION-PATTERN-PREDICATE-ASSERTION");
        $sym23$FORMULA_ARG0 = SubLObjectFactory.makeSymbol("FORMULA-ARG0");
        $list24 = _constant_24_initializer();
        $sym25$_ISA_SUBCOL_UNWIND_TEMPLATE_MAP_ = SubLObjectFactory.makeSymbol("*ISA-SUBCOL-UNWIND-TEMPLATE-MAP*");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATCH-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTITUTE-PATTERN"));
        $sym27$META_VARIABLE_P = SubLObjectFactory.makeSymbol("META-VARIABLE-P");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("BIND"));
        $kw29$OBJ = SubLObjectFactory.makeKeyword("OBJ");
        $kw30$BIND = SubLObjectFactory.makeKeyword("BIND");
        $kw31$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw32$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $const33$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const34$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $list35 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("THIRD"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $list36 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Set-Mathematical")));
        $const37$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJ"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCOL-SUBSTITUTE-PATTERN-EXISTENTIAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BODY")))));
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")));
        $sym40$CAADR = SubLObjectFactory.makeSymbol("CAADR");
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("?X"), SubLObjectFactory.makeSymbol("?Y"), SubLObjectFactory.makeSymbol("?Z-0"), SubLObjectFactory.makeSymbol("?Z-1"), SubLObjectFactory.makeSymbol("?Z-2"), SubLObjectFactory.makeSymbol("?Z-3"), SubLObjectFactory.makeSymbol("?Z-4"), SubLObjectFactory.makeSymbol("?Z-5"), SubLObjectFactory.makeSymbol("?Z-6"), SubLObjectFactory.makeSymbol("?Z-7"), SubLObjectFactory.makeSymbol("?Z-8"), SubLObjectFactory.makeSymbol("?Z-9") });
    }
}

/*

	Total time: 242 ms
	
*/