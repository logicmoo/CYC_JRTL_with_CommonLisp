package com.cyc.cycjava.cycl.nl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.document_annotation_widgets;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nl_api_datastructures;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_concept_tagging extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_concept_tagging();

    public static final String myName = "com.cyc.cycjava_2.cycl.nl.removal_modules_concept_tagging";


    // defparameter
    private static final SubLSymbol $removal_tagging_lexicons$ = makeSymbol("*REMOVAL-TAGGING-LEXICONS*");

    private static final SubLObject $$conceptReferencedInStringAt = reader_make_constant_shell(makeString("conceptReferencedInStringAt"));



    private static final SubLSymbol $REMOVAL_CONCEPT_REFERENCED_IN_STRING_AT = makeKeyword("REMOVAL-CONCEPT-REFERENCED-IN-STRING-AT");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("conceptReferencedInStringAt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("conceptReferencedInStringAt")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-CONCEPT-REFERENCED-IN-STRING-AT-ARGS-SUPPORTED-P"), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONCEPT-REFERENCED-IN-STRING-AT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$conceptReferencedInStringAt <fully-bound-p> <anything> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$conceptReferencedInStringAt \"some clouds in the sky\" ?INTERP ?OFFSET ?LENGTH))") });

    private static final SubLSymbol REMOVAL_CONCEPT_REFERENCED_IN_STRING_AT_ARGS_SUPPORTED_P = makeSymbol("REMOVAL-CONCEPT-REFERENCED-IN-STRING-AT-ARGS-SUPPORTED-P");





    private static final SubLObject $$ClosedClassWord = reader_make_constant_shell(makeString("ClosedClassWord"));

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLSymbol SET_BASE_MT = makeSymbol("SET-BASE-MT");



    private static final SubLSymbol $sym11$WEIGHT_ = makeSymbol("WEIGHT>");

    private static final SubLSymbol GET_NL_INTERP_WEIGHT = makeSymbol("GET-NL-INTERP-WEIGHT");

    private static final SubLSymbol GET_NL_INTERP_CYCL = makeSymbol("GET-NL-INTERP-CYCL");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol TEST_CONCEPT_TAGGING_REMOVAL = makeSymbol("TEST-CONCEPT-TAGGING-REMOVAL");



    private static final SubLSymbol SOME_BINDING_SET_UNIFIES = makeSymbol("SOME-BINDING-SET-UNIFIES");











    private static final SubLList $list23 = list(list(list(list(makeString("Cats"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Cat"))))));

    private static final SubLSymbol TEST_CONCEPT_TAGGING_REMOVAL_2 = makeSymbol("TEST-CONCEPT-TAGGING-REMOVAL-2");

    private static final SubLSymbol NO_BINDING_SET_UNIFIES = makeSymbol("NO-BINDING-SET-UNIFIES");

    private static final SubLList $list26 = list(list(list(list(makeString("Cats"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Dog"))))));

    public static SubLObject removal_concept_referenced_in_string_at_args_supported_p(final SubLObject asent, final SubLObject direction) {
        return unicode_nauts.string_or_unicode_naut_p(cycl_utilities.formula_arg1(asent, UNPROVIDED));
    }

    public static SubLObject get_removal_tagging_lexicon(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevant_lexicon = dictionary.dictionary_lookup($removal_tagging_lexicons$.getDynamicValue(thread), mt, UNPROVIDED);
        if (NIL == abstract_lexicon.abstract_lexicon_p(relevant_lexicon)) {
            relevant_lexicon = object.new_class_instance(TERM_LEXICON);
            methods.funcall_instance_method_with_1_args(relevant_lexicon, EXCLUDE_POS, $$ClosedClassWord);
            methods.funcall_instance_method_with_1_args(relevant_lexicon, EXCLUDE_POS, $$Adjective);
            methods.funcall_instance_method_with_1_args(relevant_lexicon, SET_BASE_MT, mt);
            dictionary.dictionary_enter($removal_tagging_lexicons$.getDynamicValue(thread), mt, relevant_lexicon);
        }
        return relevant_lexicon;
    }

    public static SubLObject removal_concept_referenced_in_string_at_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject source_string_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject interp_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject interp_offset_arg = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject interp_length_arg = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
        final SubLObject lexicon = get_removal_tagging_lexicon(UNPROVIDED);
        final SubLObject v_document = document_annotation_widgets.new_tagged_document(source_string_arg, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$1;
        SubLObject backwardP_var_$2;
        SubLObject length_$3;
        SubLObject v_iteration_$4;
        SubLObject element_num_$5;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$6;
        SubLObject interp;
        SubLObject interp_cycl;
        SubLObject word_offset;
        SubLObject word_length;
        SubLObject v_bindings;
        SubLObject new_bindings;
        SubLObject cdolist_list_var_$7;
        SubLObject binding;
        SubLObject sentence_$8;
        SubLObject nl_justification;
        SubLObject hl_support;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$1 = document.paragraph_sentences(paragraph);
            backwardP_var_$2 = NIL;
            for (length_$3 = length(vector_var_$1), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = add(v_iteration_$4, ONE_INTEGER)) {
                element_num_$5 = (NIL != backwardP_var_$2) ? subtract(length_$3, v_iteration_$4, ONE_INTEGER) : v_iteration_$4;
                sentence = aref(vector_var_$1, element_num_$5);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != document.word_cycls(word)) {
                        cdolist_list_var_$6 = remove_duplicates(Sort.sort(copy_list(document.word_interps(word)), $sym11$WEIGHT_, GET_NL_INTERP_WEIGHT), EQUAL, GET_NL_INTERP_CYCL, UNPROVIDED, UNPROVIDED);
                        interp = NIL;
                        interp = cdolist_list_var_$6.first();
                        while (NIL != cdolist_list_var_$6) {
                            interp_cycl = nl_api_datastructures.get_nl_interp_cycl(interp);
                            word_offset = document.word_offset(word);
                            word_length = document.word_length(word);
                            v_bindings = NIL;
                            if (((NIL != unification.unify_possible(interp_cycl, interp_arg)) && (NIL != unification.unify_possible(interp_offset_arg, word_offset))) && (NIL != unification.unify_possible(interp_length_arg, word_length))) {
                                if (NIL != cycl_variables.hl_varP(interp_offset_arg)) {
                                    v_bindings = cconcatenate(unification_utilities.term_unify(interp_offset_arg, word_offset, UNPROVIDED, UNPROVIDED), v_bindings);
                                }
                                if (NIL != cycl_variables.hl_varP(interp_length_arg)) {
                                    v_bindings = cconcatenate(unification_utilities.term_unify(interp_length_arg, word_length, UNPROVIDED, UNPROVIDED), v_bindings);
                                }
                                if (NIL != cycl_variables.hl_varP(interp_arg)) {
                                    v_bindings = cconcatenate(unification_utilities.term_unify(interp_arg, interp_cycl, UNPROVIDED, UNPROVIDED), v_bindings);
                                }
                                new_bindings = NIL;
                                cdolist_list_var_$7 = v_bindings;
                                binding = NIL;
                                binding = cdolist_list_var_$7.first();
                                while (NIL != cdolist_list_var_$7) {
                                    new_bindings = cons(bindings.make_variable_binding(bindings.variable_binding_variable(binding), bindings.variable_binding_value(binding)), new_bindings);
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    binding = cdolist_list_var_$7.first();
                                } 
                                v_bindings = new_bindings;
                                sentence_$8 = bindings.apply_bindings(v_bindings, asent);
                                nl_justification = nl_api_datastructures.get_nl_interp_justification(interp);
                                hl_support = arguments.make_hl_support($OPAQUE, NIL != nl_justification ? nl_justification : sentence_$8, UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
                            }
                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                            interp = cdolist_list_var_$6.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject test_concept_tagging_removal(final SubLObject query_args) {
        return inference_kernel.new_cyc_query(bq_cons($$conceptReferencedInStringAt, append(query_args, NIL)), $$InferencePSC, UNPROVIDED);
    }

    public static SubLObject test_concept_tagging_removal_2(final SubLObject query_args) {
        return test_concept_tagging_removal(query_args);
    }

    public static SubLObject no_binding_set_unifies(final SubLObject binding_sets, final SubLObject undesired) {
        return makeBoolean(NIL == some_binding_set_unifies(binding_sets, undesired));
    }

    public static SubLObject some_binding_set_unifies(final SubLObject binding_sets, final SubLObject desired) {
        SubLObject fail = NIL;
        if (NIL == fail) {
            SubLObject csome_list_var = desired;
            SubLObject desired_binding = NIL;
            desired_binding = csome_list_var.first();
            while ((NIL == fail) && (NIL != csome_list_var)) {
                SubLObject valid_bindingP = NIL;
                if (NIL == valid_bindingP) {
                    SubLObject csome_list_var_$9 = binding_sets;
                    SubLObject binding_set = NIL;
                    binding_set = csome_list_var_$9.first();
                    while ((NIL == valid_bindingP) && (NIL != csome_list_var_$9)) {
                        if (NIL != unification.unify_possible(bindings.get_variable_binding(bindings.variable_binding_variable(desired_binding), binding_set), desired_binding)) {
                            valid_bindingP = T;
                        }
                        csome_list_var_$9 = csome_list_var_$9.rest();
                        binding_set = csome_list_var_$9.first();
                    } 
                }
                if (NIL == valid_bindingP) {
                    fail = T;
                }
                csome_list_var = csome_list_var.rest();
                desired_binding = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == fail);
    }

    public static SubLObject declare_removal_modules_concept_tagging_file() {
        declareFunction("removal_concept_referenced_in_string_at_args_supported_p", "REMOVAL-CONCEPT-REFERENCED-IN-STRING-AT-ARGS-SUPPORTED-P", 2, 0, false);
        declareFunction("get_removal_tagging_lexicon", "GET-REMOVAL-TAGGING-LEXICON", 0, 1, false);
        declareFunction("removal_concept_referenced_in_string_at_expand", "REMOVAL-CONCEPT-REFERENCED-IN-STRING-AT-EXPAND", 1, 1, false);
        declareFunction("test_concept_tagging_removal", "TEST-CONCEPT-TAGGING-REMOVAL", 1, 0, false);
        declareFunction("test_concept_tagging_removal_2", "TEST-CONCEPT-TAGGING-REMOVAL-2", 1, 0, false);
        declareFunction("no_binding_set_unifies", "NO-BINDING-SET-UNIFIES", 2, 0, false);
        declareFunction("some_binding_set_unifies", "SOME-BINDING-SET-UNIFIES", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_concept_tagging_file() {
        defparameter("*REMOVAL-TAGGING-LEXICONS*", dictionary.new_dictionary(EQUAL, FIVE_INTEGER));
        return NIL;
    }

    public static SubLObject setup_removal_modules_concept_tagging_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$conceptReferencedInStringAt);
        preference_modules.doomed_unless_arg_bindable($POS, $$conceptReferencedInStringAt, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_CONCEPT_REFERENCED_IN_STRING_AT, $list3);
        note_funcall_helper_function(REMOVAL_CONCEPT_REFERENCED_IN_STRING_AT_ARGS_SUPPORTED_P);
        define_test_case_table_int(TEST_CONCEPT_TAGGING_REMOVAL, list(new SubLObject[]{ $TEST, SOME_BINDING_SET_UNIFIES, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list23);
        define_test_case_table_int(TEST_CONCEPT_TAGGING_REMOVAL_2, list(new SubLObject[]{ $TEST, NO_BINDING_SET_UNIFIES, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list26);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_concept_tagging_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_concept_tagging_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_concept_tagging_file();
    }

    static {





























    }
}

/**
 * Total time: 119 ms
 */
