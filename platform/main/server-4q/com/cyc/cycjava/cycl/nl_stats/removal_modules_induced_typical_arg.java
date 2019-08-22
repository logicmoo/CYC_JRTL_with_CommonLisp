/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.nl_stats;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOVAL-MODULES-INDUCED-TYPICAL-ARG
 *  source file: /cyc/top/cycl/nl-stats/removal-modules-induced-typical-arg.lisp
 *  created:     2019/07/03 17:39:01
 */
public final class removal_modules_induced_typical_arg extends SubLTranslatedFile implements V02 {
    // // Constructor
    private removal_modules_induced_typical_arg() {
    }

    public static final SubLFile me = new removal_modules_induced_typical_arg();


    // // Definitions
    public static final SubLObject removal_induced_typical_subject_type_of_verb_bind_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$GeneralEnglishMt)) {
                {
                    SubLObject verb = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject typical_subjects = verb_argument_lookups.typical_subject(verb, UNPROVIDED);
                    SubLObject cdolist_list_var = typical_subjects;
                    SubLObject typical_subject = NIL;
                    for (typical_subject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typical_subject = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg2, typical_subject, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject sentence = el_utilities.make_binary_formula($$inducedTypicalSubjectTypeOfVerb, verb, typical_subject);
                                    SubLObject hl_support = arguments.make_hl_support($CODE, sentence, UNPROVIDED, UNPROVIDED);
                                    backward.removal_add_node(hl_support, v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject removal_induced_typical_object_type_of_verb_bind_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$GeneralEnglishMt)) {
                {
                    SubLObject verb = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject typical_objects = verb_argument_lookups.typical_object(verb, UNPROVIDED);
                    SubLObject cdolist_list_var = typical_objects;
                    SubLObject typical_object = NIL;
                    for (typical_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typical_object = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg2, typical_object, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject sentence = el_utilities.make_binary_formula($$inducedTypicalObjectTypeOfVerb, verb, typical_object);
                                    SubLObject hl_support = arguments.make_hl_support($CODE, sentence, UNPROVIDED, UNPROVIDED);
                                    backward.removal_add_node(hl_support, v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject removal_noun_learner_conjectured_type_for_noun_bind_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$GeneralEnglishMt)) {
                {
                    SubLObject noun = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject conjecture = verb_argument_lookups.noun_conjecture(noun);
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(arg2, conjecture, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject sentence = el_utilities.make_binary_formula($$nounLearnerConjecturedTypeForNoun, noun, conjecture);
                                SubLObject hl_support = arguments.make_hl_support($CODE, sentence, UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(hl_support, v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject removal_noun_learner_conjectured_type_from_noun_usages_bind_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$GeneralEnglishMt)) {
                {
                    SubLObject el_list_el_list = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject verb_list_list = el_utilities.el_list_to_subl_list_recursively(el_list_el_list);
                    SubLObject datum = verb_list_list;
                    SubLObject current = datum;
                    SubLObject as_subject_verbs = NIL;
                    SubLObject as_object_verbs = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    as_subject_verbs = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    as_object_verbs = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject conjecture = noun_learner.type_conjecture_based_on_usages_of_noun_with_verbs(as_subject_verbs, as_object_verbs);
                            thread.resetMultipleValues();
                            {
                                SubLObject v_bindings = unification_utilities.term_unify(arg2, conjecture, T, T);
                                SubLObject unify_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != v_bindings) {
                                    {
                                        SubLObject sentence = el_utilities.make_binary_formula($const11$nounLearnerConjecturedTypeFromNou, el_list_el_list, conjecture);
                                        SubLObject hl_support = arguments.make_hl_support($CODE, sentence, UNPROVIDED, UNPROVIDED);
                                        backward.removal_add_node(hl_support, v_bindings, unify_justification);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt12);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_removal_modules_induced_typical_arg_file() {
        declareFunction("removal_induced_typical_subject_type_of_verb_bind_expand", "REMOVAL-INDUCED-TYPICAL-SUBJECT-TYPE-OF-VERB-BIND-EXPAND", 1, 1, false);
        declareFunction("removal_induced_typical_object_type_of_verb_bind_expand", "REMOVAL-INDUCED-TYPICAL-OBJECT-TYPE-OF-VERB-BIND-EXPAND", 1, 1, false);
        declareFunction("removal_noun_learner_conjectured_type_for_noun_bind_expand", "REMOVAL-NOUN-LEARNER-CONJECTURED-TYPE-FOR-NOUN-BIND-EXPAND", 1, 1, false);
        declareFunction("removal_noun_learner_conjectured_type_from_noun_usages_bind_expand", "REMOVAL-NOUN-LEARNER-CONJECTURED-TYPE-FROM-NOUN-USAGES-BIND-EXPAND", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_induced_typical_arg_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_induced_typical_arg_file() {
                inference_modules.register_solely_specific_removal_module_predicate($$inducedTypicalSubjectTypeOfVerb);
        inference_modules.inference_removal_module($REMOVAL_INDUCED_TYPICAL_SUBJECT_TYPE_OF_VERB_BIND, $list_alt4);
        inference_modules.register_solely_specific_removal_module_predicate($$inducedTypicalObjectTypeOfVerb);
        inference_modules.inference_removal_module($REMOVAL_INDUCED_TYPICAL_OBJECT_TYPE_OF_VERB_BIND, $list_alt7);
        inference_modules.register_solely_specific_removal_module_predicate($$nounLearnerConjecturedTypeForNoun);
        inference_modules.inference_removal_module($REMOVAL_NOUN_LEARNER_CONJECTURED_TYPE_FOR_NOUN_BIND, $list_alt10);
        inference_modules.register_solely_specific_removal_module_predicate($const11$nounLearnerConjecturedTypeFromNou);
        inference_modules.inference_removal_module($REMOVAL_NOUN_LEARNER_CONJECTURED_TYPE_FROM_NOUN_USAGES_BIND, $list_alt14);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$inducedTypicalSubjectTypeOfVerb = constant_handles.reader_make_constant_shell(makeString("inducedTypicalSubjectTypeOfVerb"));

    public static final SubLObject $$GeneralEnglishMt = constant_handles.reader_make_constant_shell(makeString("GeneralEnglishMt"));



    private static final SubLSymbol $REMOVAL_INDUCED_TYPICAL_SUBJECT_TYPE_OF_VERB_BIND = makeKeyword("REMOVAL-INDUCED-TYPICAL-SUBJECT-TYPE-OF-VERB-BIND");

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("inducedTypicalSubjectTypeOfVerb")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("inducedTypicalSubjectTypeOfVerb")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("SUBL-STRING-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INDUCED-TYPICAL-SUBJECT-TYPE-OF-VERB-BIND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$inducedTypicalSubjectTypeOfVerb <string> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$inducedTypicalSubjectTypeOfVerb \"bloom\" ?WHAT)") });

    public static final SubLObject $$inducedTypicalObjectTypeOfVerb = constant_handles.reader_make_constant_shell(makeString("inducedTypicalObjectTypeOfVerb"));

    private static final SubLSymbol $REMOVAL_INDUCED_TYPICAL_OBJECT_TYPE_OF_VERB_BIND = makeKeyword("REMOVAL-INDUCED-TYPICAL-OBJECT-TYPE-OF-VERB-BIND");

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("inducedTypicalObjectTypeOfVerb")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("inducedTypicalObjectTypeOfVerb")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("SUBL-STRING-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INDUCED-TYPICAL-OBJECT-TYPE-OF-VERB-BIND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$inducedTypicalObjectTypeOfVerb <string> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$inducedTypicalObjectTypeOfVerb \"steal\" ?WHAT)") });

    public static final SubLObject $$nounLearnerConjecturedTypeForNoun = constant_handles.reader_make_constant_shell(makeString("nounLearnerConjecturedTypeForNoun"));

    private static final SubLSymbol $REMOVAL_NOUN_LEARNER_CONJECTURED_TYPE_FOR_NOUN_BIND = makeKeyword("REMOVAL-NOUN-LEARNER-CONJECTURED-TYPE-FOR-NOUN-BIND");

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("nounLearnerConjecturedTypeForNoun")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("nounLearnerConjecturedTypeForNoun")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("SUBL-STRING-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOUN-LEARNER-CONJECTURED-TYPE-FOR-NOUN-BIND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nounLearnerConjecturedTypeForNoun <string> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nounLearnerConjecturedTypeForNoun \"rutabaga\" ?WHAT)") });

    public static final SubLObject $const11$nounLearnerConjecturedTypeFromNou = constant_handles.reader_make_constant_shell(makeString("nounLearnerConjecturedTypeFromNounUsages"));

    static private final SubLList $list_alt12 = list(makeSymbol("AS-SUBJECT-VERBS"), makeSymbol("AS-OBJECT-VERBS"));

    private static final SubLSymbol $REMOVAL_NOUN_LEARNER_CONJECTURED_TYPE_FROM_NOUN_USAGES_BIND = makeKeyword("REMOVAL-NOUN-LEARNER-CONJECTURED-TYPE-FROM-NOUN-USAGES-BIND");

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("nounLearnerConjecturedTypeFromNounUsages")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("nounLearnerConjecturedTypeFromNounUsages")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOUN-LEARNER-CONJECTURED-TYPE-FROM-NOUN-USAGES-BIND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nounLearnerConjecturedTypeFromNounUsages <el-list> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nounLearnerConjecturedTypeFromNounUsages\n     (#$TheList (#$TheList \"explode\") (#$TheList \"fire\" \"fire\" \"load\"))\n     ?WHAT)") });

    // // Initializers
    public void declareFunctions() {
        declare_removal_modules_induced_typical_arg_file();
    }

    public void initializeVariables() {
        init_removal_modules_induced_typical_arg_file();
    }

    public void runTopLevelForms() {
        setup_removal_modules_induced_typical_arg_file();
    }
}

