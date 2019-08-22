/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOVAL-MODULES-CHEMISTRY
 *  source file: /cyc/top/cycl/removal-modules-chemistry.lisp
 *  created:     2019/07/03 17:37:47
 */
public final class removal_modules_chemistry extends SubLTranslatedFile implements V02 {
    // // Constructor
    private removal_modules_chemistry() {
    }

    public static final SubLFile me = new removal_modules_chemistry();

    public static final String myName = "com.cyc.cycjava.cycl.removal_modules_chemistry";

    // // Definitions
    public static final SubLObject removal_matrix_of_reaction_type_bind_output_generate(SubLObject reaction_type) {
        {
            SubLObject generated_matrix = chemistry_utilities.generate_matrix(reaction_type);
            return NIL != generated_matrix ? ((SubLObject) (iteration.new_singleton_iterator(generated_matrix))) : NIL;
        }
    }

    public static final SubLObject removal_matrix_of_reaction_type_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject reaction_type = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject given_matrix = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject generated_matrix = chemistry_utilities.generate_matrix(reaction_type);
            if ((NIL != generated_matrix) && (!given_matrix.equal(generated_matrix))) {
                {
                    SubLObject hl_support = arguments.make_hl_support($MATRIX_OF_REACTION_TYPE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_ionic_equation_complete_unify_output_generate(SubLObject reaction_type) {
        {
            SubLObject generated_equation = chemistry_utilities.ionic_equation(reaction_type, UNPROVIDED, UNPROVIDED);
            return NIL != generated_equation ? ((SubLObject) (iteration.new_singleton_iterator(generated_equation))) : NIL;
        }
    }

    public static final SubLObject removal_ionic_equation_complete_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject reaction_type = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject generated_equation = chemistry_utilities.ionic_equation(reaction_type, UNPROVIDED, UNPROVIDED);
            if (NIL != generated_equation) {
                {
                    SubLObject given_reactants = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject given_products = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                    SubLObject generated_reactants = cycl_utilities.atomic_sentence_arg2(generated_equation, UNPROVIDED);
                    SubLObject generated_products = cycl_utilities.atomic_sentence_arg3(generated_equation, UNPROVIDED);
                    if (!((NIL != inference_kernel.new_cyc_query(list($$equals, given_reactants, generated_reactants), $$InferencePSC, UNPROVIDED)) && (NIL != inference_kernel.new_cyc_query(list($$equals, given_products, generated_products), $$InferencePSC, UNPROVIDED)))) {
                        {
                            SubLObject hl_support = arguments.make_hl_support($OPAQUE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED);
                            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_removal_modules_chemistry_file() {
        declareFunction("removal_matrix_of_reaction_type_bind_output_generate", "REMOVAL-MATRIX-OF-REACTION-TYPE-BIND-OUTPUT-GENERATE", 1, 0, false);
        declareFunction("removal_matrix_of_reaction_type_check_neg_expand", "REMOVAL-MATRIX-OF-REACTION-TYPE-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_ionic_equation_complete_unify_output_generate", "REMOVAL-IONIC-EQUATION-COMPLETE-UNIFY-OUTPUT-GENERATE", 1, 0, false);
        declareFunction("removal_ionic_equation_complete_check_neg_expand", "REMOVAL-IONIC-EQUATION-COMPLETE-CHECK-NEG-EXPAND", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_chemistry_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_chemistry_file() {
                inference_modules.register_solely_specific_removal_module_predicate($$matrixOfReactionType);
        utilities_macros.note_funcall_helper_function(REMOVAL_MATRIX_OF_REACTION_TYPE_BIND_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_MATRIX_OF_REACTION_TYPE_BIND, $list_alt3);
        inference_modules.inference_removal_module($REMOVAL_MATRIX_OF_REACTION_TYPE_CHECK_NEG, $list_alt6);
        inference_modules.register_solely_specific_removal_module_predicate($$ionicEquation_Complete);
        utilities_macros.note_funcall_helper_function(REMOVAL_IONIC_EQUATION_COMPLETE_UNIFY_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_IONIC_EQUATION_COMPLETE_UNIFY, $list_alt10);
        inference_modules.inference_removal_module($REMOVAL_IONIC_EQUATION_COMPLETE_CHECK_NEG, $list_alt15);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$matrixOfReactionType = constant_handles.reader_make_constant_shell(makeString("matrixOfReactionType"));

    private static final SubLSymbol REMOVAL_MATRIX_OF_REACTION_TYPE_BIND_OUTPUT_GENERATE = makeSymbol("REMOVAL-MATRIX-OF-REACTION-TYPE-BIND-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_MATRIX_OF_REACTION_TYPE_BIND = makeKeyword("REMOVAL-MATRIX-OF-REACTION-TYPE-BIND");

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("matrixOfReactionType")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("matrixOfReactionType")), $FORT, makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("matrixOfReactionType")), list($BIND, makeSymbol("REACTION-TYPE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("REACTION-TYPE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-MATRIX-OF-REACTION-TYPE-BIND-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("matrixOfReactionType")), list(makeKeyword("VALUE"), makeSymbol("REACTION-TYPE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("MATRIX-OF-REACTION-TYPE"), makeKeyword("DOCUMENTATION"), makeString("(#$matrixOfReactionType <fort> <whatever>)\n    by looking up relevant GAFs and calculating the matrix") });

    private static final SubLSymbol $MATRIX_OF_REACTION_TYPE = makeKeyword("MATRIX-OF-REACTION-TYPE");

    private static final SubLSymbol $REMOVAL_MATRIX_OF_REACTION_TYPE_CHECK_NEG = makeKeyword("REMOVAL-MATRIX-OF-REACTION-TYPE-CHECK-NEG");

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("matrixOfReactionType")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("matrixOfReactionType")), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATRIX-OF-REACTION-TYPE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$matrixOfReactionType <fort> <fully-bound>))\n    by looking up relevant GAFs and calculating the matrix,\n    then comparing it to the given matrix") });

    public static final SubLObject $$ionicEquation_Complete = constant_handles.reader_make_constant_shell(makeString("ionicEquation-Complete"));

    private static final SubLSymbol REMOVAL_IONIC_EQUATION_COMPLETE_UNIFY_OUTPUT_GENERATE = makeSymbol("REMOVAL-IONIC-EQUATION-COMPLETE-UNIFY-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_IONIC_EQUATION_COMPLETE_UNIFY = makeKeyword("REMOVAL-IONIC-EQUATION-COMPLETE-UNIFY");

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("ionicEquation-Complete")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("ionicEquation-Complete")), $FORT, makeKeyword("VARIABLE"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("ionicEquation-Complete")), list($BIND, makeSymbol("REACTION-TYPE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("REACTION-TYPE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-IONIC-EQUATION-COMPLETE-UNIFY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("DOCUMENTATION"), makeString("(#$ionicEquation-Complete <fort> <variable> <variable>)\n    by looking up relevant GAFs and calculating the ionic equation") });

    public static final SubLObject $$equals = constant_handles.reader_make_constant_shell(makeString("equals"));

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLSymbol $REMOVAL_IONIC_EQUATION_COMPLETE_CHECK_NEG = makeKeyword("REMOVAL-IONIC-EQUATION-COMPLETE-CHECK-NEG");

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("ionicEquation-Complete")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("ionicEquation-Complete")), $FORT, makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IONIC-EQUATION-COMPLETE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$ionicEquation-Complete <fort> <fully-bound> <fully-bound))\n    by looking up relevant GAFs and calculating the ionic equation,\n    then comparing it to the given ionic equation") });

    // // Initializers
    public void declareFunctions() {
        declare_removal_modules_chemistry_file();
    }

    public void initializeVariables() {
        init_removal_modules_chemistry_file();
    }

    public void runTopLevelForms() {
        setup_removal_modules_chemistry_file();
    }
}

