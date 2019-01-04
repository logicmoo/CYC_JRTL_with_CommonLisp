package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_isomorphic_sentences extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences";
    public static final String myFingerPrint = "3c13f9a4ac913151468e97d02e5b938717e0f8d9e1cf2149036215bfd98fba4b";
    private static final SubLObject $const0$isomorphicSentences;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_ISOMORPHIC_SENTENCES_CHECK_POS;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$_FOO;
    private static final SubLSymbol $kw5$CODE;
    private static final SubLList $list6;
    private static final SubLObject $const7$BaseKB;
    private static final SubLSymbol $kw8$TRUE_DEF;
    private static final SubLSymbol $kw9$REMOVAL_ISOMORPHIC_SENTENCES_TERM_UNIFY;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_ISOMORPHIC_SENTENCES_PRUNE;
    private static final SubLList $list12;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 2303L)
    public static SubLObject isomorphic_sentencesP(final SubLObject term_el_list, final SubLObject sentence_el_list) {
        final SubLObject term_list = el_utilities.el_list_items(term_el_list);
        final SubLObject sentence_list = el_utilities.el_list_items(sentence_el_list);
        final SubLObject unique_term = czer_utilities.unique_el_var_wrt_expression(term_list, (SubLObject)removal_modules_isomorphic_sentences.$sym4$_FOO);
        SubLObject prev_sentence = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject v_term = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject v_term_$1 = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject sentence = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject sentence_$2 = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        v_term = term_list;
        v_term_$1 = v_term.first();
        sentence = sentence_list;
        sentence_$2 = sentence.first();
        while (removal_modules_isomorphic_sentences.NIL != sentence || removal_modules_isomorphic_sentences.NIL != v_term) {
            final SubLObject subst_sentence = Sequences.substitute(unique_term, v_term_$1, sentence_$2, (SubLObject)removal_modules_isomorphic_sentences.EQUAL, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
            if (removal_modules_isomorphic_sentences.NIL != prev_sentence) {
                if (!prev_sentence.equal(subst_sentence)) {
                    return (SubLObject)removal_modules_isomorphic_sentences.NIL;
                }
            }
            else {
                prev_sentence = subst_sentence;
            }
            v_term = v_term.rest();
            v_term_$1 = v_term.first();
            sentence = sentence.rest();
            sentence_$2 = sentence.first();
        }
        return (SubLObject)removal_modules_isomorphic_sentences.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 3004L)
    public static SubLObject make_isomorphic_sentences_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_isomorphic_sentences.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        }
        return make_isomorphic_sentences_rule_support();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 3184L)
    public static SubLObject make_isomorphic_sentences_rule_support() {
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_isomorphic_sentences.$kw5$CODE, (SubLObject)removal_modules_isomorphic_sentences.$list6, removal_modules_isomorphic_sentences.$const7$BaseKB, (SubLObject)removal_modules_isomorphic_sentences.$kw8$TRUE_DEF);
        final SubLObject more_supports = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 4780L)
    public static SubLObject removal_isomorphic_sentences_term_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_isomorphic_sentences.UNPROVIDED) {
            sense = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject possible_term_el_list = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
        final SubLObject sentence_list = el_utilities.el_list_items(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED));
        final SubLObject total_terms_el_list = removal_determine_sentence_isomorphisms(sentence_list);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(possible_term_el_list, total_terms_el_list, (SubLObject)removal_modules_isomorphic_sentences.T, (SubLObject)removal_modules_isomorphic_sentences.T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_isomorphic_sentences.NIL != v_bindings) {
            backward.removal_add_node(make_isomorphic_sentences_rule_support(), v_bindings, unify_justification);
        }
        return (SubLObject)removal_modules_isomorphic_sentences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 5361L)
    public static SubLObject removal_determine_sentence_isomorphisms(final SubLObject sentence_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject prev_sentence = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject different_terms_num = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject total_terms = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject prev_arity = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject cdolist_list_var = sentence_list;
        SubLObject sentence = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        sentence = cdolist_list_var.first();
        while (removal_modules_isomorphic_sentences.NIL != cdolist_list_var) {
            if (removal_modules_isomorphic_sentences.NIL != prev_sentence) {
                if (!prev_arity.eql(el_utilities.formula_arity(sentence, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED))) {
                    return (SubLObject)removal_modules_isomorphic_sentences.NIL;
                }
                thread.resetMultipleValues();
                final SubLObject total_terms_$3 = removal_determine_different_terms_and_verify(prev_sentence, sentence, different_terms_num, total_terms);
                final SubLObject different_terms_num_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                total_terms = total_terms_$3;
                different_terms_num = different_terms_num_$4;
                if (different_terms_num.eql((SubLObject)removal_modules_isomorphic_sentences.ZERO_INTEGER) || removal_modules_isomorphic_sentences.NIL == total_terms) {
                    return (SubLObject)removal_modules_isomorphic_sentences.NIL;
                }
            }
            prev_arity = el_utilities.formula_arity(sentence, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
            prev_sentence = sentence;
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        thread.resetMultipleValues();
        final SubLObject total_terms_$4 = removal_determine_different_terms_and_verify(prev_sentence, sentence_list.first(), different_terms_num, total_terms);
        final SubLObject different_terms_num_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        total_terms = total_terms_$4;
        different_terms_num = different_terms_num_$5;
        return el_utilities.make_el_list(Sequences.nreverse(total_terms), (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 6222L)
    public static SubLObject removal_determine_different_terms_and_verify(final SubLObject sentence1, final SubLObject sentence2, final SubLObject prev_different_terms_num, SubLObject total_terms) {
        SubLObject difference_terms = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject different_terms_num = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        if (removal_modules_isomorphic_sentences.NIL != sentence1) {
            difference_terms = removal_equal_length_list_difference(sentence1, sentence2, (SubLObject)removal_modules_isomorphic_sentences.EQUAL);
            if (removal_modules_isomorphic_sentences.NIL != prev_different_terms_num && removal_modules_isomorphic_sentences.NIL == list_utilities.lengthE(difference_terms, prev_different_terms_num, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED)) {
                return Values.values((SubLObject)removal_modules_isomorphic_sentences.NIL, (SubLObject)removal_modules_isomorphic_sentences.NIL);
            }
            different_terms_num = Sequences.length(difference_terms);
            if (removal_modules_isomorphic_sentences.NIL == list_utilities.singletonP(difference_terms)) {
                difference_terms = list_utilities.fast_delete_duplicates(difference_terms, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
            }
            if (removal_modules_isomorphic_sentences.NIL != list_utilities.singletonP(difference_terms)) {
                difference_terms = difference_terms.first();
            }
            else {
                difference_terms = el_utilities.make_el_list(Sequences.nreverse(difference_terms), (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
            }
            total_terms = (SubLObject)ConsesLow.cons(difference_terms, total_terms);
        }
        return Values.values(total_terms, different_terms_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 7090L)
    public static SubLObject removal_equal_length_list_difference(final SubLObject list1, final SubLObject list2, SubLObject test) {
        if (test == removal_modules_isomorphic_sentences.UNPROVIDED) {
            test = (SubLObject)removal_modules_isomorphic_sentences.EQL;
        }
        SubLObject different_elems = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject elem1 = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject elem1_$7 = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject elem2 = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject elem2_$8 = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        elem1 = list1;
        elem1_$7 = elem1.first();
        elem2 = list2;
        elem2_$8 = elem2.first();
        while (removal_modules_isomorphic_sentences.NIL != elem2 || removal_modules_isomorphic_sentences.NIL != elem1) {
            if (removal_modules_isomorphic_sentences.NIL == Functions.funcall(test, elem1_$7, elem2_$8)) {
                different_elems = (SubLObject)ConsesLow.cons(elem1_$7, different_elems);
            }
            elem1 = elem1.rest();
            elem1_$7 = elem1.first();
            elem2 = elem2.rest();
            elem2_$8 = elem2.first();
        }
        return Sequences.nreverse(different_elems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 9721L)
    public static SubLObject removal_isomorphic_sentences_prune_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_isomorphic_sentences.UNPROVIDED) {
            sense = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        }
        final SubLObject term_el_list = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
        final SubLObject sentence_el_list = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
        final SubLObject variableP = variables.variable_p(term_el_list);
        final SubLObject term_list = (SubLObject)((removal_modules_isomorphic_sentences.NIL == variableP && removal_modules_isomorphic_sentences.NIL != el_utilities.el_list_p(term_el_list)) ? el_utilities.el_list_items(term_el_list) : removal_modules_isomorphic_sentences.NIL);
        final SubLObject sentence_list = (SubLObject)((removal_modules_isomorphic_sentences.NIL != el_utilities.el_list_p(sentence_el_list)) ? el_utilities.el_list_items(sentence_el_list) : removal_modules_isomorphic_sentences.NIL);
        final SubLObject no_of_sent = Sequences.length(sentence_list);
        if (removal_modules_isomorphic_sentences.NIL == sentence_list) {
            return (SubLObject)removal_modules_isomorphic_sentences.T;
        }
        if (no_of_sent.eql((SubLObject)removal_modules_isomorphic_sentences.ONE_INTEGER)) {
            return (SubLObject)removal_modules_isomorphic_sentences.T;
        }
        if (removal_modules_isomorphic_sentences.NIL == variableP) {
            if (removal_modules_isomorphic_sentences.NIL == term_list) {
                return (SubLObject)removal_modules_isomorphic_sentences.T;
            }
            final SubLObject no_of_terms = Sequences.length(term_list);
            if (!no_of_terms.eql(no_of_sent)) {
                return (SubLObject)removal_modules_isomorphic_sentences.T;
            }
        }
        return removal_isomorphic_sentences_prune_required_int(term_list, sentence_list, variableP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 10665L)
    public static SubLObject removal_isomorphic_sentences_prune_required_int(final SubLObject term_list, final SubLObject sentence_list, final SubLObject variableP) {
        SubLObject comp_sentence_arity = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject v_term = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject v_term_$9 = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject sentence = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        SubLObject sentence_$10 = (SubLObject)removal_modules_isomorphic_sentences.NIL;
        v_term = term_list;
        v_term_$9 = v_term.first();
        sentence = sentence_list;
        sentence_$10 = sentence.first();
        while (removal_modules_isomorphic_sentences.NIL != sentence || removal_modules_isomorphic_sentences.NIL != v_term) {
            if (removal_modules_isomorphic_sentences.NIL == variableP && removal_modules_isomorphic_sentences.NIL == Sequences.find(v_term_$9, sentence_$10, (SubLObject)removal_modules_isomorphic_sentences.EQUAL, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED)) {
                return (SubLObject)removal_modules_isomorphic_sentences.T;
            }
            final SubLObject sentence_arity = el_utilities.formula_arity(sentence_$10, (SubLObject)removal_modules_isomorphic_sentences.UNPROVIDED);
            if (removal_modules_isomorphic_sentences.NIL != comp_sentence_arity) {
                if (!sentence_arity.eql(comp_sentence_arity)) {
                    return (SubLObject)removal_modules_isomorphic_sentences.T;
                }
            }
            else {
                comp_sentence_arity = sentence_arity;
            }
            v_term = v_term.rest();
            v_term_$9 = v_term.first();
            sentence = sentence.rest();
            sentence_$10 = sentence.first();
        }
        return (SubLObject)removal_modules_isomorphic_sentences.NIL;
    }
    
    public static SubLObject declare_removal_modules_isomorphic_sentences_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "isomorphic_sentencesP", "ISOMORPHIC-SENTENCES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "make_isomorphic_sentences_support", "MAKE-ISOMORPHIC-SENTENCES-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "make_isomorphic_sentences_rule_support", "MAKE-ISOMORPHIC-SENTENCES-RULE-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "removal_isomorphic_sentences_term_unify_expand", "REMOVAL-ISOMORPHIC-SENTENCES-TERM-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "removal_determine_sentence_isomorphisms", "REMOVAL-DETERMINE-SENTENCE-ISOMORPHISMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "removal_determine_different_terms_and_verify", "REMOVAL-DETERMINE-DIFFERENT-TERMS-AND-VERIFY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "removal_equal_length_list_difference", "REMOVAL-EQUAL-LENGTH-LIST-DIFFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "removal_isomorphic_sentences_prune_required", "REMOVAL-ISOMORPHIC-SENTENCES-PRUNE-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isomorphic_sentences", "removal_isomorphic_sentences_prune_required_int", "REMOVAL-ISOMORPHIC-SENTENCES-PRUNE-REQUIRED-INT", 3, 0, false);
        return (SubLObject)removal_modules_isomorphic_sentences.NIL;
    }
    
    public static SubLObject init_removal_modules_isomorphic_sentences_file() {
        return (SubLObject)removal_modules_isomorphic_sentences.NIL;
    }
    
    public static SubLObject setup_removal_modules_isomorphic_sentences_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_isomorphic_sentences.$const0$isomorphicSentences);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_isomorphic_sentences.$kw1$POS, removal_modules_isomorphic_sentences.$const0$isomorphicSentences, (SubLObject)removal_modules_isomorphic_sentences.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_isomorphic_sentences.$kw2$REMOVAL_ISOMORPHIC_SENTENCES_CHECK_POS, (SubLObject)removal_modules_isomorphic_sentences.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_isomorphic_sentences.$kw9$REMOVAL_ISOMORPHIC_SENTENCES_TERM_UNIFY, (SubLObject)removal_modules_isomorphic_sentences.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_isomorphic_sentences.$kw11$REMOVAL_ISOMORPHIC_SENTENCES_PRUNE, (SubLObject)removal_modules_isomorphic_sentences.$list12);
        return (SubLObject)removal_modules_isomorphic_sentences.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_isomorphic_sentences_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_isomorphic_sentences_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_isomorphic_sentences_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_isomorphic_sentences();
        $const0$isomorphicSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_ISOMORPHIC_SENTENCES_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-CHECK-POS");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-EL-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-EL-LIST"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-EL-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-EL-LIST")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-EL-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-EL-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ISOMORPHIC-SENTENCES?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-EL-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-EL-LIST")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ISOMORPHIC-SENTENCES-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isomorphicSentences (#$TheList . <fullybound>) (#$TheList . <fullybound>)  "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isomorphicSentences \n       (#$TheList #$Muffet #$Snoopy #$Molly) \n       (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Snoopy #$Dog) (#$isa #$Molly #$Dog)))") });
        $sym4$_FOO = SubLObjectFactory.makeSymbol("?FOO");
        $kw5$CODE = SubLObjectFactory.makeKeyword("CODE");
        $list6 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-LIST")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)removal_modules_isomorphic_sentences.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NUM-1"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-COUNT")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)removal_modules_isomorphic_sentences.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NUM-2"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-COUNT")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-COUNT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LengthOfListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthInListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM-1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthInListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM-2"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthInListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM-1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthInListFn")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("?NUM-2"))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaSubstitutionFor")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-1"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-2"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-1"), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA-2")));
        $const7$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw8$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw9$REMOVAL_ISOMORPHIC_SENTENCES_TERM_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-TERM-UNIFY");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_isomorphic_sentences.ONE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ISOMORPHIC-SENTENCES-TERM-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$isomorphicSentences <variable> (#$TheList . <fullybound>))  "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isomorphicSentences \n       ?X\n       (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Snoopy #$Dog) (#$isa #$Molly #$Dog)))") });
        $kw11$REMOVAL_ISOMORPHIC_SENTENCES_PRUNE = SubLObjectFactory.makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-PRUNE");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isomorphicSentences")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptyList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptyList")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-ISOMORPHIC-SENTENCES-PRUNE-REQUIRED"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("REMOVAL-ISOMORPHIC-SENTENCES-PRUNE-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_isomorphic_sentences.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("pruning module that handles\n    (#$isomorphicSentences #$TheEmptyList #$TheEmptyList)\n    (#$isomorphicSentences #$TheEmptyList (#$TheList . <fullybound>))\n    (#$isomorphicSentences (#$TheList . <fullybound>) #$TheEmptyList)\n\n    (#$isomorphicSentences <variable> (#$TheList . <fullybound>))\n     where in ARG2 has just one sentence or it has sentences with unequal arity.\n   \n   (#$isomorphicSentences (#$TheList . <fullybound>) (#$TheList . <fullybound>))\n    where in ARG2 has just one sentence or it has sentences with unequal arity\n    or the number of terms in ARG1 is different than the number of sentences in ARG2\n    or a term in ARG1 is not present in the corresponding sentence of ARG2.\n   "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$isomorphicSentences #$TheEmptyList (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n    (#$isomorphicSentences (#$TheList #$Muffet #$Molly) #$TheEmptyList)\n\n   (#$isomorphicSentences ?X (#$TheList (#$isa #$Muffet #$Dog)))\n   (#$isomorphicSentences ?X (#$TheList (#$isa #$Relation #$Collection) (#$backchainRequired #$Relation)))\n  \n   (#$isomorphicSentences (#$TheList #$isa) (#$TheList (#$isa #$Muffet #$Dog)))\n   (#$isomorphicSentences (#$TheList #$isa #$backchainRequired) \n         (#$TheList (#$isa #$Relation #$Collection) (#$backchainRequired #$Relation)))\n   (#$isomorphicSentences (#$TheList #$Muffet #$Molly #$Snoopy) (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n   (#$isomorphicSentences (#$TheList #$Muffet #$Snoopy) (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n") });
    }
}

/*

	Total time: 61 ms
	
*/