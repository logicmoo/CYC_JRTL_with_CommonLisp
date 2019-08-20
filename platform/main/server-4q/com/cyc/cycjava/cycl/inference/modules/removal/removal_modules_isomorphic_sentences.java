package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_isomorphic_sentences extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "3c13f9a4ac913151468e97d02e5b938717e0f8d9e1cf2149036215bfd98fba4b";
    private static SubLObject $$isomorphicSentences;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_ISOMORPHIC_SENTENCES_CHECK_POS;
    private static SubLList $list3;
    private static SubLSymbol $sym4$_FOO;
    private static SubLSymbol $CODE;
    private static SubLList $list6;
    private static SubLObject $$BaseKB;
    private static SubLSymbol $TRUE_DEF;
    private static SubLSymbol $REMOVAL_ISOMORPHIC_SENTENCES_TERM_UNIFY;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_ISOMORPHIC_SENTENCES_PRUNE;
    private static SubLList $list12;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 2300L)
    public static SubLObject isomorphic_sentencesP(SubLObject term_el_list, SubLObject sentence_el_list) {
        SubLObject term_list = el_utilities.el_list_items(term_el_list);
        SubLObject sentence_list = el_utilities.el_list_items(sentence_el_list);
        SubLObject unique_term = czer_utilities.unique_el_var_wrt_expression(term_list, $sym4$_FOO);
        SubLObject prev_sentence = NIL;
        SubLObject v_term = NIL;
        SubLObject v_term_$1 = NIL;
        SubLObject sentence = NIL;
        SubLObject sentence_$2 = NIL;
        v_term = term_list;
        v_term_$1 = v_term.first();
        sentence = sentence_list;
        sentence_$2 = sentence.first();
        while (NIL != sentence || NIL != v_term) {
            SubLObject subst_sentence = Sequences.substitute(unique_term, v_term_$1, sentence_$2, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != prev_sentence) {
                if (!prev_sentence.equal(subst_sentence)) {
                    return NIL;
                }
            } else {
                prev_sentence = subst_sentence;
            }
            v_term = v_term.rest();
            v_term_$1 = v_term.first();
            sentence = sentence.rest();
            sentence_$2 = sentence.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 3000L)
    public static SubLObject make_isomorphic_sentences_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        return make_isomorphic_sentences_rule_support();
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 3100L)
    public static SubLObject make_isomorphic_sentences_rule_support() {
        SubLObject support = arguments.make_hl_support($CODE, $list6, $$BaseKB, $TRUE_DEF);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 4700L)
    public static SubLObject removal_isomorphic_sentences_term_unify_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject possible_term_el_list = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject sentence_list = el_utilities.el_list_items(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
        SubLObject total_terms_el_list = removal_determine_sentence_isomorphisms(sentence_list);
        thread.resetMultipleValues();
        SubLObject v_bindings = unification_utilities.term_unify(possible_term_el_list, total_terms_el_list, T, T);
        SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            backward.removal_add_node(make_isomorphic_sentences_rule_support(), v_bindings, unify_justification);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 5300L)
    public static SubLObject removal_determine_sentence_isomorphisms(SubLObject sentence_list) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject prev_sentence = NIL;
        SubLObject different_terms_num = NIL;
        SubLObject total_terms = NIL;
        SubLObject prev_arity = NIL;
        SubLObject cdolist_list_var = sentence_list;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != prev_sentence) {
                if (!prev_arity.eql(el_utilities.formula_arity(sentence, UNPROVIDED))) {
                    return NIL;
                }
                thread.resetMultipleValues();
                SubLObject total_terms_$3 = removal_determine_different_terms_and_verify(prev_sentence, sentence, different_terms_num, total_terms);
                SubLObject different_terms_num_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                total_terms = total_terms_$3;
                different_terms_num = different_terms_num_$4;
                if (different_terms_num.eql(ZERO_INTEGER) || NIL == total_terms) {
                    return NIL;
                }
            }
            prev_arity = el_utilities.formula_arity(sentence, UNPROVIDED);
            prev_sentence = sentence;
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        thread.resetMultipleValues();
        SubLObject total_terms_$4 = removal_determine_different_terms_and_verify(prev_sentence, sentence_list.first(), different_terms_num, total_terms);
        SubLObject different_terms_num_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        total_terms = total_terms_$4;
        different_terms_num = different_terms_num_$5;
        return el_utilities.make_el_list(Sequences.nreverse(total_terms), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 6200L)
    public static SubLObject removal_determine_different_terms_and_verify(SubLObject sentence1, SubLObject sentence2, SubLObject prev_different_terms_num, SubLObject total_terms) {
        SubLObject difference_terms = NIL;
        SubLObject different_terms_num = NIL;
        if (NIL != sentence1) {
            difference_terms = removal_equal_length_list_difference(sentence1, sentence2, EQUAL);
            if (NIL != prev_different_terms_num && NIL == list_utilities.lengthE(difference_terms, prev_different_terms_num, UNPROVIDED)) {
                return Values.values(NIL, NIL);
            }
            different_terms_num = Sequences.length(difference_terms);
            if (NIL == list_utilities.singletonP(difference_terms)) {
                difference_terms = list_utilities.fast_delete_duplicates(difference_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != list_utilities.singletonP(difference_terms)) {
                difference_terms = difference_terms.first();
            } else {
                difference_terms = el_utilities.make_el_list(Sequences.nreverse(difference_terms), UNPROVIDED);
            }
            total_terms = cons(difference_terms, total_terms);
        }
        return Values.values(total_terms, different_terms_num);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 7000L)
    public static SubLObject removal_equal_length_list_difference(SubLObject list1, SubLObject list2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        SubLObject different_elems = NIL;
        SubLObject elem1 = NIL;
        SubLObject elem1_$7 = NIL;
        SubLObject elem2 = NIL;
        SubLObject elem2_$8 = NIL;
        elem1 = list1;
        elem1_$7 = elem1.first();
        elem2 = list2;
        elem2_$8 = elem2.first();
        while (NIL != elem2 || NIL != elem1) {
            if (NIL == Functions.funcall(test, elem1_$7, elem2_$8)) {
                different_elems = cons(elem1_$7, different_elems);
            }
            elem1 = elem1.rest();
            elem1_$7 = elem1.first();
            elem2 = elem2.rest();
            elem2_$8 = elem2.first();
        }
        return Sequences.nreverse(different_elems);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 9700L)
    public static SubLObject removal_isomorphic_sentences_prune_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject term_el_list = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject sentence_el_list = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject variableP = variables.variable_p(term_el_list);
        SubLObject term_list = (NIL == variableP && NIL != el_utilities.el_list_p(term_el_list)) ? el_utilities.el_list_items(term_el_list) : NIL;
        SubLObject sentence_list = (NIL != el_utilities.el_list_p(sentence_el_list)) ? el_utilities.el_list_items(sentence_el_list) : NIL;
        SubLObject no_of_sent = Sequences.length(sentence_list);
        if (NIL == sentence_list) {
            return T;
        }
        if (no_of_sent.eql(ONE_INTEGER)) {
            return T;
        }
        if (NIL == variableP) {
            if (NIL == term_list) {
                return T;
            }
            SubLObject no_of_terms = Sequences.length(term_list);
            if (!no_of_terms.eql(no_of_sent)) {
                return T;
            }
        }
        return removal_isomorphic_sentences_prune_required_int(term_list, sentence_list, variableP);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-isomorphic-sentences.lisp", position = 10600L)
    public static SubLObject removal_isomorphic_sentences_prune_required_int(SubLObject term_list, SubLObject sentence_list, SubLObject variableP) {
        SubLObject comp_sentence_arity = NIL;
        SubLObject v_term = NIL;
        SubLObject v_term_$9 = NIL;
        SubLObject sentence = NIL;
        SubLObject sentence_$10 = NIL;
        v_term = term_list;
        v_term_$9 = v_term.first();
        sentence = sentence_list;
        sentence_$10 = sentence.first();
        while (NIL != sentence || NIL != v_term) {
            if (NIL == variableP && NIL == Sequences.find(v_term_$9, sentence_$10, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            SubLObject sentence_arity = el_utilities.formula_arity(sentence_$10, UNPROVIDED);
            if (NIL != comp_sentence_arity) {
                if (!sentence_arity.eql(comp_sentence_arity)) {
                    return T;
                }
            } else {
                comp_sentence_arity = sentence_arity;
            }
            v_term = v_term.rest();
            v_term_$9 = v_term.first();
            sentence = sentence.rest();
            sentence_$10 = sentence.first();
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_isomorphic_sentences_file() {
        declareFunction("isomorphic_sentencesP", "ISOMORPHIC-SENTENCES?", 2, 0, false);
        declareFunction("make_isomorphic_sentences_support", "MAKE-ISOMORPHIC-SENTENCES-SUPPORT", 1, 1, false);
        declareFunction("make_isomorphic_sentences_rule_support", "MAKE-ISOMORPHIC-SENTENCES-RULE-SUPPORT", 0, 0, false);
        declareFunction("removal_isomorphic_sentences_term_unify_expand", "REMOVAL-ISOMORPHIC-SENTENCES-TERM-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_determine_sentence_isomorphisms", "REMOVAL-DETERMINE-SENTENCE-ISOMORPHISMS", 1, 0, false);
        declareFunction("removal_determine_different_terms_and_verify", "REMOVAL-DETERMINE-DIFFERENT-TERMS-AND-VERIFY", 4, 0, false);
        declareFunction("removal_equal_length_list_difference", "REMOVAL-EQUAL-LENGTH-LIST-DIFFERENCE", 2, 1, false);
        declareFunction("removal_isomorphic_sentences_prune_required", "REMOVAL-ISOMORPHIC-SENTENCES-PRUNE-REQUIRED", 1, 1, false);
        declareFunction("removal_isomorphic_sentences_prune_required_int", "REMOVAL-ISOMORPHIC-SENTENCES-PRUNE-REQUIRED-INT", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_isomorphic_sentences_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_isomorphic_sentences_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$isomorphicSentences);
        preference_modules.doomed_unless_arg_bindable($POS, $$isomorphicSentences, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_ISOMORPHIC_SENTENCES_CHECK_POS, $list3);
        inference_modules.inference_removal_module($REMOVAL_ISOMORPHIC_SENTENCES_TERM_UNIFY, $list10);
        inference_modules.inference_removal_module($REMOVAL_ISOMORPHIC_SENTENCES_PRUNE, $list12);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_isomorphic_sentences_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_isomorphic_sentences_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_isomorphic_sentences_file();
    }

    static {
        me = new removal_modules_isomorphic_sentences();
        $$isomorphicSentences = makeConstSym(("isomorphicSentences"));
        $POS = makeKeyword("POS");
        $REMOVAL_ISOMORPHIC_SENTENCES_CHECK_POS = makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-CHECK-POS");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isomorphicSentences")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isomorphicSentences")), cons(makeConstSym(("TheList")), makeKeyword("FULLY-BOUND")), cons(makeConstSym(("TheList")), makeKeyword("FULLY-BOUND"))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("isomorphicSentences")), list(makeKeyword("BIND"), makeSymbol("TERM-EL-LIST")), list(makeKeyword("BIND"), makeSymbol("SENTENCE-EL-LIST"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TERM-EL-LIST")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE-EL-LIST")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TERM-EL-LIST"), makeSymbol("SENTENCE-EL-LIST")), list(makeKeyword("CALL"), makeSymbol("ISOMORPHIC-SENTENCES?"), list(makeKeyword("VALUE"), makeSymbol("TERM-EL-LIST")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE-EL-LIST")))),
                makeKeyword("SUPPORT"), makeSymbol("MAKE-ISOMORPHIC-SENTENCES-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$isomorphicSentences (#$TheList . <fullybound>) (#$TheList . <fullybound>)  "), makeKeyword("EXAMPLE"),
                makeString("(#$isomorphicSentences \n       (#$TheList #$Muffet #$Snoopy #$Molly) \n       (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Snoopy #$Dog) (#$isa #$Molly #$Dog)))") });
        $sym4$_FOO = makeSymbol("?FOO");
        $CODE = makeKeyword("CODE");
        $list6 = list(makeConstSym(("implies")), list(new SubLObject[] { makeConstSym(("and")), list(makeConstSym(("isomorphicSentences")), makeSymbol("?TERM-LIST"), makeSymbol("?FORMULA-LIST")), list(makeConstSym(("integerBetween")), ONE_INTEGER, makeSymbol("?NUM-1"), makeSymbol("?TERM-COUNT")),
                list(makeConstSym(("integerBetween")), ONE_INTEGER, makeSymbol("?NUM-2"), makeSymbol("?TERM-COUNT")), list(makeConstSym(("evaluate")), makeSymbol("?TERM-COUNT"), list(makeConstSym(("LengthOfListFn")), makeSymbol("?TERM-LIST"))),
                list(makeConstSym(("evaluate")), makeSymbol("?TERM-1"), list(makeConstSym(("NthInListFn")), makeSymbol("?TERM-LIST"), makeSymbol("?NUM-1"))), list(makeConstSym(("evaluate")), makeSymbol("?TERM-2"), list(makeConstSym(("NthInListFn")), makeSymbol("?TERM-LIST"), makeSymbol("?NUM-2"))),
                list(makeConstSym(("evaluate")), makeSymbol("?FORMULA-1"), list(makeConstSym(("NthInListFn")), makeSymbol("?FORMULA-LIST"), makeSymbol("?NUM-1"))),
                list(makeConstSym(("evaluate")), makeSymbol("?FORMULA-2"), list(makeConstSym(("NthInListFn")), makeSymbol("?FORMULA-LIST"), makeSymbol("?NUM-2"))) }),
                list(makeConstSym(("formulaSubstitutionFor")), makeSymbol("?TERM-1"), makeSymbol("?TERM-2"), makeSymbol("?FORMULA-1"), makeSymbol("?FORMULA-2")));
        $$BaseKB = makeConstSym(("BaseKB"));
        $TRUE_DEF = makeKeyword("TRUE-DEF");
        $REMOVAL_ISOMORPHIC_SENTENCES_TERM_UNIFY = makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-TERM-UNIFY");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isomorphicSentences")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isomorphicSentences")), list(makeKeyword("OR"), makeKeyword("VARIABLE"), cons(makeConstSym(("TheList")), makeKeyword("NOT-FULLY-BOUND"))), cons(makeConstSym(("TheList")), makeKeyword("FULLY-BOUND"))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISOMORPHIC-SENTENCES-TERM-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isomorphicSentences <variable> (#$TheList . <fullybound>))  "), makeKeyword("EXAMPLE"),
                makeString("(#$isomorphicSentences \n       ?X\n       (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Snoopy #$Dog) (#$isa #$Molly #$Dog)))") });
        $REMOVAL_ISOMORPHIC_SENTENCES_PRUNE = makeKeyword("REMOVAL-ISOMORPHIC-SENTENCES-PRUNE");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isomorphicSentences")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isomorphicSentences")), list(makeKeyword("OR"), makeKeyword("VARIABLE"), makeConstSym(("TheEmptyList")), makeKeyword("FULLY-BOUND")), list(makeKeyword("OR"), makeConstSym(("TheEmptyList")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-ISOMORPHIC-SENTENCES-PRUNE-REQUIRED"), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-ISOMORPHIC-SENTENCES-PRUNE-REQUIRED"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"),
                makeString(
                        "pruning module that handles\n    (#$isomorphicSentences #$TheEmptyList #$TheEmptyList)\n    (#$isomorphicSentences #$TheEmptyList (#$TheList . <fullybound>))\n    (#$isomorphicSentences (#$TheList . <fullybound>) #$TheEmptyList)\n\n    (#$isomorphicSentences <variable> (#$TheList . <fullybound>))\n     where in ARG2 has just one sentence or it has sentences with unequal arity.\n   \n   (#$isomorphicSentences (#$TheList . <fullybound>) (#$TheList . <fullybound>))\n    where in ARG2 has just one sentence or it has sentences with unequal arity\n    or the number of terms in ARG1 is different than the number of sentences in ARG2\n    or a term in ARG1 is not present in the corresponding sentence of ARG2.\n   "),
                makeKeyword("EXAMPLE"), makeString(
                        "(#$isomorphicSentences #$TheEmptyList (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n    (#$isomorphicSentences (#$TheList #$Muffet #$Molly) #$TheEmptyList)\n\n   (#$isomorphicSentences ?X (#$TheList (#$isa #$Muffet #$Dog)))\n   (#$isomorphicSentences ?X (#$TheList (#$isa #$Relation #$Collection) (#$backchainRequired #$Relation)))\n  \n   (#$isomorphicSentences (#$TheList #$isa) (#$TheList (#$isa #$Muffet #$Dog)))\n   (#$isomorphicSentences (#$TheList #$isa #$backchainRequired) \n         (#$TheList (#$isa #$Relation #$Collection) (#$backchainRequired #$Relation)))\n   (#$isomorphicSentences (#$TheList #$Muffet #$Molly #$Snoopy) (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n   (#$isomorphicSentences (#$TheList #$Muffet #$Snoopy) (#$TheList (#$isa #$Muffet #$Dog) (#$isa #$Molly Dog)))\n") });
    }
}
/*
 *
 * Total time: 61 ms
 *
 */