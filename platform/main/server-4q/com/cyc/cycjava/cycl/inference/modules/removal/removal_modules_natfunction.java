package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$inference_literal$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_natfunction extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_natfunction();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction";

    public static final String myFingerPrint = "da661788d83b6b031a40c6ebeb24cf332a18050fe919e3c4e8ed13b151baa6d3";

    // deflexical
    // Definitions
    // Temporary -- remove after natArgumentsEqual cleanup is complete.
    private static final SubLSymbol $nat_arguments_equal_enabled$ = makeSymbol("*NAT-ARGUMENTS-EQUAL-ENABLED*");

    // deflexical
    private static final SubLSymbol $default_nat_function_check_cost$ = makeSymbol("*DEFAULT-NAT-FUNCTION-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $nat_function_code_rule$ = makeSymbol("*NAT-FUNCTION-CODE-RULE*");

    // deflexical
    private static final SubLSymbol $default_nat_argument_check_cost$ = makeSymbol("*DEFAULT-NAT-ARGUMENT-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $nat_argument_code_rule$ = makeSymbol("*NAT-ARGUMENT-CODE-RULE*");

    // defparameter
    private static final SubLSymbol $nat_arguments_equal_code_rule$ = makeSymbol("*NAT-ARGUMENTS-EQUAL-CODE-RULE*");



    // deflexical
    private static final SubLSymbol $nart_id_check_default_cost$ = makeSymbol("*NART-ID-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $nart_id_unify_default_cost$ = makeSymbol("*NART-ID-UNIFY-DEFAULT-COST*");

    private static final SubLObject $$natFunction = reader_make_constant_shell(makeString("natFunction"));



    private static final SubLSymbol $NAT_FUNCTION_LOOKUP_POS = makeKeyword("NAT-FUNCTION-LOOKUP-POS");

    private static final SubLList $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natFunction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natFunction")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NAT_FUNCTION_CHECK_POS = makeKeyword("REMOVAL-NAT-FUNCTION-CHECK-POS");

    public static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natFunction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natFunction")), makeKeyword("NART"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-FUNCTION-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-FUNCTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$natFunction <reified NAT> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$natFunction (#$JuvenileFn #$Dog) #$JuvenileFn)") });

    private static final SubLList $list6 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("termOfUnit")), makeSymbol("?NAT"), cons(makeSymbol("?FUNCTION"), makeSymbol("?ARGS"))), list(reader_make_constant_shell(makeString("natFunction")), makeSymbol("?NAT"), makeSymbol("?FUNCTION")));





    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLSymbol $REMOVAL_NAT_FUNCTION_UNIFY = makeKeyword("REMOVAL-NAT-FUNCTION-UNIFY");

    private static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natFunction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natFunction")), makeKeyword("NART"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-FUNCTION-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-FUNCTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$natFunction <reified NAT> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$natFunction (#$JuvenileFn #$Dog) ?WHAT)") });

    private static final SubLSymbol REMOVAL_NAT_FUNCTION_LOOKUP_INTERNAL = makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-INTERNAL");

    private static final SubLSymbol $REMOVAL_NAT_FUNCTION_LOOKUP = makeKeyword("REMOVAL-NAT-FUNCTION-LOOKUP");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natFunction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natFunction")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$natFunction <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$natFunction ?NAT #$JuvenileFn)") });

    private static final SubLObject $$natArgument = reader_make_constant_shell(makeString("natArgument"));

    private static final SubLSymbol $NAT_ARGUMENT_LOOKUP_POS = makeKeyword("NAT-ARGUMENT-LOOKUP-POS");

    private static final SubLList $list17 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natArgument")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NAT_ARGUMENT_CHECK_POS = makeKeyword("REMOVAL-NAT-ARGUMENT-CHECK-POS");

    public static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natArgument")), makeKeyword("NART"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NAT-ARGUMENT-CHECK-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-ARGUMENT-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ARGUMENT-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgument <reified NAT> <non-negative integer> <fully bound>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgument (#$JuvenileFn #$Dog) 1 #$Dog)") });

    private static final SubLList $list20 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("termOfUnit")), makeSymbol("?NAT"), makeSymbol("?FORMULA")), list(reader_make_constant_shell(makeString("evaluate")), makeSymbol("?TERM"), list(reader_make_constant_shell(makeString("FormulaArgFn")), makeSymbol("?ARG"), makeSymbol("?FORMULA")))), list(reader_make_constant_shell(makeString("natArgument")), makeSymbol("?NAT"), makeSymbol("?ARG"), makeSymbol("?TERM")));

    private static final SubLSymbol $REMOVAL_NAT_ARGUMENT_TERM_UNIFY = makeKeyword("REMOVAL-NAT-ARGUMENT-TERM-UNIFY");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natArgument")), makeKeyword("NART"), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NAT-ARGUMENT-TERM-UNIFY-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-ARGUMENT-TERM-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ARGUMENT-TERM-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgument <reified NAT> <non-negative integer> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgument (#$JuvenileFn #$Dog) 1 ?WHAT)") });



    private static final SubLSymbol $REMOVAL_NAT_ARGUMENT_ARG_UNIFY = makeKeyword("REMOVAL-NAT-ARGUMENT-ARG-UNIFY");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natArgument")), makeKeyword("NART"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-ARGUMENT-ARG-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ARGUMENT-ARG-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgument <reified NAT> <not fully-bound> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgument (#$JuvenileFn #$Dog) ?ARG ?WHAT)\n    (#$natArgument (#$JuvenileFn #$Dog) ?ARG #$Dog)") });

    private static final SubLSymbol REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL = makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-INTERNAL");

    private static final SubLSymbol $REMOVAL_NAT_ARGUMENT_LOOKUP = makeKeyword("REMOVAL-NAT-ARGUMENT-LOOKUP");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natArgument")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("OR"), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), makeKeyword("VARIABLE")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgument <not fully-bound> <variable> <fort>)\n    (#$natArgument <not fully-bound> <integer>  <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgument ?NAT 1    #$Dog)\n    (#$natArgument ?NAT ?ARG #$Dog)") });

    private static final SubLObject $$natArgumentsEqual = reader_make_constant_shell(makeString("natArgumentsEqual"));

    private static final SubLSymbol $REMOVAL_NAT_ARGUMENTS_EQUAL_CHECK_POS = makeKeyword("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS");

    public static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("natArgumentsEqual")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("natArgumentsEqual")), makeKeyword("NART"), makeKeyword("NART")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgumentsEqual <reified NAT> <reified NAT>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgumentsEqual (#$LeftFn #$Leg) (#$RightFn #$Leg))") });

    public static final SubLList $list32 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("termOfUnit")), makeSymbol("?NAT1"), makeSymbol("?FORMULA1")), list(reader_make_constant_shell(makeString("termOfUnit")), makeSymbol("?NAT2"), makeSymbol("?FORMULA2")), list(reader_make_constant_shell(makeString("evaluate")), makeSymbol("?ARGS-LIST"), list(reader_make_constant_shell(makeString("FormulaArgListFn")), makeSymbol("?FORMULA1"))), list(reader_make_constant_shell(makeString("evaluate")), makeSymbol("?ARGS-LIST"), list(reader_make_constant_shell(makeString("FormulaArgListFn")), makeSymbol("?FORMULA2")))), list(reader_make_constant_shell(makeString("natArgumentsEqual")), makeSymbol("?NAT1"), makeSymbol("?NAT2")));

    private static final SubLList $list33 = list(makeSymbol("MT"), makeSymbol("NAT-ARG-ASENT"));

    private static final SubLSymbol $sym34$_ = makeSymbol("=");

    private static final SubLSymbol REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT = makeSymbol("REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT");

    private static final SubLList $list36 = list(makeSymbol("MT"), makeSymbol("NAT-FUN-ASENT"));

    public static final SubLSymbol REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P = makeSymbol("REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P");

    public static final SubLList $list38 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    private static final SubLObject $$ReifiableFunction = reader_make_constant_shell(makeString("ReifiableFunction"));

    public static final SubLSymbol REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P = makeSymbol("REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P");

    public static final SubLList $list41 = list(makeSymbol("FUNC-MT"), makeSymbol("FUNC-ASENT"));

    public static final SubLList $list42 = list(makeSymbol("ARG-MT"), makeSymbol("ARG-ASENT"));

    private static final SubLObject $$nartID = reader_make_constant_shell(makeString("nartID"));



    public static final SubLSymbol $nart_id_defining_mt$ = makeSymbol("*NART-ID-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));



    private static final SubLSymbol $REMOVAL_NART_ID_CHECK_POS = makeKeyword("REMOVAL-NART-ID-CHECK-POS");

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nartID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nartID")), makeKeyword("NART"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-NART-ID-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NART-ID-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*NART-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$nartID <nart-p> <integerp>)"), makeKeyword("EXAMPLE"), makeString("(#$nartID #$isa 260)") });

    private static final SubLSymbol $REMOVAL_NART_ID_CHECK_NEG = makeKeyword("REMOVAL-NART-ID-CHECK-NEG");

    private static final SubLList $list51 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nartID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nartID")), makeKeyword("NART"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-NART-ID-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NART-ID-CHECK"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*NART-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$nartID <nart-p> <integerp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$nartID #$Thing 260))") });

    private static final SubLSymbol $REMOVAL_NART_ID_UNIFY = makeKeyword("REMOVAL-NART-ID-UNIFY");

    private static final SubLList $list53 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nartID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nartID")), makeKeyword("NART"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*NART-ID-UNIFY-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nartID")), list(makeKeyword("BIND"), makeSymbol("NART")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("NART"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("NART-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nartID")), list(makeKeyword("VALUE"), makeSymbol("NART")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*NART-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$nartID <nart-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nartID #$isa ?ID)") });

    private static final SubLSymbol $REMOVAL_NART_ID_LOOKUP = makeKeyword("REMOVAL-NART-ID-LOOKUP");

    private static final SubLList $list55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nartID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nartID")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-NART-ID-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nartID")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ID"))), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FIND-NART-BY-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nartID")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("SUPPORT-MT"), makeSymbol("*NART-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$nartID <not fully-bound> <integerp>)"), makeKeyword("EXAMPLE"), makeString("(#$nartID ?NART 260)") });

    public static SubLObject removal_nat_function_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject function = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (function.equal(cycl_utilities.nat_functor(nat))) {
            return $default_nat_function_check_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static SubLObject removal_nat_function_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject function = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if ((NIL != assertion) && function.equal(cycl_utilities.nat_functor(assertions_high.gaf_arg(assertion, TWO_INTEGER)))) {
            final SubLObject more_supports = additional_nat_function_supports();
            backward.removal_add_node(assertion, NIL, more_supports);
        }
        return NIL;
    }

    public static SubLObject additional_nat_function_supports() {
        return list(nat_function_hl_support());
    }

    public static SubLObject nat_function_hl_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arguments.make_hl_support($CODE, $nat_function_code_rule$.getDynamicValue(thread), mt_vars.$tou_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_nat_function_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return min(ONE_INTEGER, kb_indexing.num_gaf_arg_index(nat, ONE_INTEGER, $$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()));
    }

    public static SubLObject removal_nat_function_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if (NIL != assertion) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, cycl_utilities.nat_functor(assertions_high.gaf_arg(assertion, TWO_INTEGER)), T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject more_supports = append(additional_nat_function_supports(), unify_justification);
                backward.removal_add_node(assertion, v_bindings, more_supports);
            }
        }
        return NIL;
    }

    public static SubLObject removal_nat_function_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject function = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return kb_indexing.num_function_extent_index(function);
    }

    public static SubLObject removal_nat_function_lookup_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = $inference_literal$.currentBinding(thread);
        try {
            $inference_literal$.bind(asent, thread);
            kb_mapping.map_function_extent_index(symbol_function(REMOVAL_NAT_FUNCTION_LOOKUP_INTERNAL), function);
        } finally {
            $inference_literal$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject removal_nat_function_lookup_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject asent = $inference_literal$.getDynamicValue(thread);
            final SubLObject atomic_sentence_arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject nat = assertions_high.gaf_arg1(assertion);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(atomic_sentence_arg1, nat, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject more_supports = append(additional_nat_function_supports(), unify_justification);
                backward.removal_add_node(assertion, v_bindings, more_supports);
            }
        }
        return NIL;
    }

    public static SubLObject removal_nat_argument_check_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return subl_promotions.non_negative_integer_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_nat_argument_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        if (v_term.equal(cycl_utilities.nat_arg(nat, num, UNPROVIDED))) {
            return $default_nat_argument_check_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static SubLObject removal_nat_argument_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if ((NIL != assertion) && v_term.equal(cycl_utilities.nat_arg(assertions_high.gaf_arg(assertion, TWO_INTEGER), num, UNPROVIDED))) {
            final SubLObject more_supports = additional_nat_argument_supports();
            backward.removal_add_node(assertion, NIL, more_supports);
        }
        return NIL;
    }

    public static SubLObject additional_nat_argument_supports() {
        return list(nat_argument_hl_support());
    }

    public static SubLObject nat_argument_hl_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arguments.make_hl_support($CODE, $nat_argument_code_rule$.getDynamicValue(thread), mt_vars.$tou_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_nat_argument_term_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return subl_promotions.non_negative_integer_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_nat_argument_term_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return min(ONE_INTEGER, kb_indexing.num_gaf_arg_index(nat, ONE_INTEGER, $$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()));
    }

    public static SubLObject removal_nat_argument_term_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if (NIL != assertion) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg3, cycl_utilities.nat_arg(assertions_high.gaf_arg(assertion, TWO_INTEGER), num, UNPROVIDED), T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject more_supports = append(additional_nat_argument_supports(), unify_justification);
                backward.removal_add_node(assertion, v_bindings, more_supports);
            }
        }
        return NIL;
    }

    public static SubLObject removal_nat_argument_arg_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject tou_gafs = min(ONE_INTEGER, kb_indexing.num_gaf_arg_index(nat, ONE_INTEGER, $$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()));
        final SubLObject nat_arity = cycl_utilities.nat_arity(nat, UNPROVIDED);
        return multiply(tou_gafs, add(nat_arity, ONE_INTEGER));
    }

    public static SubLObject removal_nat_argument_arg_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nat);
        if (NIL != assertion) {
            final SubLObject terms = cycl_utilities.formula_terms(nat, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            v_term = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                final SubLObject candidate_asent = make_ternary_formula($$natArgument, nat, argnum, v_term);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(candidate_asent, asent, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject more_supports = append(additional_nat_argument_supports(), unify_justification);
                    backward.removal_add_node(assertion, v_bindings, more_supports);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_nat_argument_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject fort = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject functionP = fort_types_interface.functionP(fort);
        if (NIL != variables.variable_p(argnum)) {
            if (NIL != functionP) {
                return add(kb_indexing.num_nart_arg_index(fort, UNPROVIDED, UNPROVIDED), kb_indexing.num_function_extent_index(fort));
            }
            return kb_indexing.num_nart_arg_index(fort, UNPROVIDED, UNPROVIDED);
        } else {
            if (!argnum.isZero()) {
                return kb_indexing.num_nart_arg_index(fort, argnum, UNPROVIDED);
            }
            if (NIL != functionP) {
                return kb_indexing.num_nart_arg_index(fort, UNPROVIDED, UNPROVIDED);
            }
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_nat_argument_lookup_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject functionP = fort_types_interface.functionP(fort);
        final SubLObject _prev_bind_0 = $inference_literal$.currentBinding(thread);
        try {
            $inference_literal$.bind(asent, thread);
            if ((NIL != functionP) && ((NIL != variables.variable_p(argnum)) || argnum.isZero())) {
                kb_mapping.map_function_extent_index(symbol_function(REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL), fort);
            }
            if (NIL != variables.variable_p(argnum)) {
                kb_mapping.map_nart_arg_index(symbol_function(REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL), fort, UNPROVIDED, UNPROVIDED);
            } else
                if (argnum.isPositive()) {
                    kb_mapping.map_nart_arg_index(symbol_function(REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL), fort, argnum, UNPROVIDED);
                }

        } finally {
            $inference_literal$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject removal_nat_argument_lookup_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject nat = assertions_high.gaf_arg1(assertion);
            final SubLObject asent = $inference_literal$.getDynamicValue(thread);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            final SubLObject terms = cycl_utilities.formula_terms(nat, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            v_term = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if ((NIL != variables.variable_p(arg2)) || arg2.numE(argnum)) {
                }
                final SubLObject candidate_asent = make_ternary_formula($$natArgument, nat, argnum, v_term);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(candidate_asent, asent, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject more_supports = append(additional_nat_argument_supports(), unify_justification);
                    backward.removal_add_node(assertion, v_bindings, more_supports);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_nat_arguments_equal_check_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return $nat_arguments_equal_enabled$.getGlobalValue();
    }

    public static SubLObject removal_nat_arguments_equal_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_nat_arguments_equal_check_cost(asent);
    }

    public static SubLObject removal_nat_arguments_equal_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nart_1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject nart_2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject tou_1 = function_terms.term_of_unit_assertion(nart_1);
        final SubLObject tou_2 = function_terms.term_of_unit_assertion(nart_2);
        if (((NIL != tou_1) && (NIL != tou_2)) && cycl_utilities.nat_args(assertions_high.gaf_arg(tou_1, TWO_INTEGER), UNPROVIDED).equal(cycl_utilities.nat_args(assertions_high.gaf_arg(tou_2, TWO_INTEGER), UNPROVIDED))) {
            final SubLObject hl_support = nat_arguments_equal_hl_support();
            final SubLObject more_supports = list(tou_1, tou_2);
            backward.removal_add_node(hl_support, NIL, more_supports);
        }
        return NIL;
    }

    public static SubLObject removal_nat_arguments_equal_check_cost(final SubLObject asent) {
        return min(ONE_INTEGER, new SubLObject[]{ kb_indexing.num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()), kb_indexing.num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), ONE_INTEGER, $$termOfUnit, mt_vars.$tou_mt$.getGlobalValue()) });
    }

    public static SubLObject nat_arguments_equal_hl_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arguments.make_hl_support($CODE, $nat_arguments_equal_code_rule$.getDynamicValue(thread), mt_vars.$tou_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_nat_function_nat_argument_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(contextualized_dnf_clause);
        final SubLObject func_pos_dict = removal_nat_func_asents_with_not_fully_bound_arg1_dict(pos_lits);
        SubLObject clause_numbers = NIL;
        SubLObject list_var = NIL;
        SubLObject pos_lit = NIL;
        SubLObject clause_number = NIL;
        list_var = pos_lits;
        pos_lit = list_var.first();
        for (clause_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pos_lit = list_var.first() , clause_number = add(ONE_INTEGER, clause_number)) {
            if (NIL != removal_nat_argument_contextualized_asent_p(pos_lit)) {
                SubLObject current;
                final SubLObject datum = current = pos_lit;
                SubLObject mt = NIL;
                SubLObject nat_arg_asent = NIL;
                destructuring_bind_must_consp(current, datum, $list33);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list33);
                nat_arg_asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(nat_arg_asent, UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(nat_arg_asent, UNPROVIDED);
                    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(nat_arg_asent, UNPROVIDED);
                    final SubLObject arg1_var_clauses = dictionary.dictionary_lookup(func_pos_dict, arg1, UNPROVIDED);
                    if (((NIL != variables.fully_bound_p(arg2)) && (NIL != variables.fully_bound_p(arg3))) && (NIL != arg1_var_clauses)) {
                        dictionary_utilities.dictionary_pushnew(func_pos_dict, arg1, clause_number, symbol_function($sym34$_), UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list33);
                }
            }
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(func_pos_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject arg4 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject clause_nums = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != list_utilities.lengthG(clause_nums, ONE_INTEGER, UNPROVIDED)) {
                clause_numbers = cons(list(NIL, clause_nums), clause_numbers);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return clause_numbers;
    }

    public static SubLObject removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal(final SubLObject pos_lits) {
        final SubLObject func_pos_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject pos_lit = NIL;
        SubLObject clause_number = NIL;
        list_var = pos_lits;
        pos_lit = list_var.first();
        for (clause_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pos_lit = list_var.first() , clause_number = add(ONE_INTEGER, clause_number)) {
            if (NIL != removal_nat_function_contextualized_asent_p(pos_lit)) {
                SubLObject current;
                final SubLObject datum = current = pos_lit;
                SubLObject mt = NIL;
                SubLObject nat_fun_asent = NIL;
                destructuring_bind_must_consp(current, datum, $list36);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list36);
                nat_fun_asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(nat_fun_asent, UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(nat_fun_asent, UNPROVIDED);
                    if ((NIL != variables.not_fully_bound_p(arg1)) && (NIL != variables.fully_bound_p(arg2))) {
                        dictionary_utilities.dictionary_pushnew(func_pos_dict, arg1, clause_number, symbol_function($sym34$_), UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list36);
                }
            }
        }
        return func_pos_dict;
    }

    public static SubLObject removal_nat_func_asents_with_not_fully_bound_arg1_dict(final SubLObject pos_lits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal(pos_lits);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos_lits, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal(pos_lits)));
            memoization_state.caching_state_put(caching_state, pos_lits, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject removal_nat_function_contextualized_asent_p_internal(final SubLObject contextualised_asent) {
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(contextualised_asent, contextualised_asent, $list38);
        mt = contextualised_asent.first();
        SubLObject current = contextualised_asent.rest();
        destructuring_bind_must_consp(current, contextualised_asent, $list38);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(((NIL != el_formula_with_operator_p(asent, $$natFunction)) && (NIL != list_utilities.lengthE(asent, THREE_INTEGER, UNPROVIDED))) && (NIL != isa.isaP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), $$ReifiableFunction, UNPROVIDED, UNPROVIDED)));
        }
        cdestructuring_bind_error(contextualised_asent, $list38);
        return NIL;
    }

    public static SubLObject removal_nat_function_contextualized_asent_p(final SubLObject contextualised_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_nat_function_contextualized_asent_p_internal(contextualised_asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, contextualised_asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(removal_nat_function_contextualized_asent_p_internal(contextualised_asent)));
            memoization_state.caching_state_put(caching_state, contextualised_asent, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject removal_nat_argument_contextualized_asent_p_internal(final SubLObject contextualised_asent) {
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(contextualised_asent, contextualised_asent, $list38);
        mt = contextualised_asent.first();
        SubLObject current = contextualised_asent.rest();
        destructuring_bind_must_consp(current, contextualised_asent, $list38);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != el_formula_with_operator_p(asent, $$natArgument)) && (NIL != list_utilities.lengthE(asent, FOUR_INTEGER, UNPROVIDED)));
        }
        cdestructuring_bind_error(contextualised_asent, $list38);
        return NIL;
    }

    public static SubLObject removal_nat_argument_contextualized_asent_p(final SubLObject contextualised_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_nat_argument_contextualized_asent_p_internal(contextualised_asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, contextualised_asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(removal_nat_argument_contextualized_asent_p_internal(contextualised_asent)));
            memoization_state.caching_state_put(caching_state, contextualised_asent, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject removal_nat_function_nat_argument_cost(final SubLObject contextualized_dnf_clause) {
        return ONE_INTEGER;
    }

    public static SubLObject removal_nat_function_nat_argument_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(contextualized_dnf_clause);
        final SubLObject nat_fun_cont_asent = find_if(REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject nat_arg_cont_asents = list_utilities.find_all_if(REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P, pos_lits, UNPROVIDED);
        SubLObject nat_asents = NIL;
        SubLObject current;
        final SubLObject datum = current = nat_fun_cont_asent;
        SubLObject func_mt = NIL;
        SubLObject func_asent = NIL;
        destructuring_bind_must_consp(current, datum, $list41);
        func_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        func_asent = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject unbound_nat = cycl_utilities.atomic_sentence_arg1(func_asent, UNPROVIDED);
            final SubLObject nat_functor = cycl_utilities.atomic_sentence_arg2(func_asent, UNPROVIDED);
            SubLObject argnum_to_arg_alist = NIL;
            nat_asents = cons(func_asent, nat_asents);
            SubLObject cdolist_list_var = nat_arg_cont_asents;
            SubLObject nat_arg_cont_asent = NIL;
            nat_arg_cont_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = nat_arg_cont_asent;
                SubLObject arg_mt = NIL;
                SubLObject arg_asent = NIL;
                destructuring_bind_must_consp(current_$2, datum_$1, $list42);
                arg_mt = current_$2.first();
                current_$2 = current_$2.rest();
                destructuring_bind_must_consp(current_$2, datum_$1, $list42);
                arg_asent = current_$2.first();
                current_$2 = current_$2.rest();
                if (NIL == current_$2) {
                    nat_asents = cons(arg_asent, nat_asents);
                    final SubLObject nat_arg_num = cycl_utilities.atomic_sentence_arg2(arg_asent, UNPROVIDED);
                    final SubLObject nat_argument = cycl_utilities.atomic_sentence_arg3(arg_asent, UNPROVIDED);
                    argnum_to_arg_alist = list_utilities.alist_enter(argnum_to_arg_alist, nat_arg_num, nat_argument, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum_$1, $list42);
                }
                cdolist_list_var = cdolist_list_var.rest();
                nat_arg_cont_asent = cdolist_list_var.first();
            } 
            SubLObject bound_nat = NIL;
            SubLObject nat_args = NIL;
            SubLObject end_var;
            SubLObject argnum;
            for (end_var = ZERO_INTEGER, argnum = NIL, argnum = length(argnum_to_arg_alist); !argnum.numLE(end_var); argnum = add(argnum, MINUS_ONE_INTEGER)) {
                nat_args = cons(list_utilities.alist_lookup(argnum_to_arg_alist, argnum, UNPROVIDED, UNPROVIDED), nat_args);
            }
            bound_nat = cons(nat_functor, nat_args);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(unbound_nat, bound_nat, UNPROVIDED, UNPROVIDED);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject justifications = removal_nat_function_nat_argument_supports(bound_nat);
                if (NIL != justifications) {
                    inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list41);
        }
        return NIL;
    }

    public static SubLObject removal_nat_function_nat_argument_supports(final SubLObject bound_nat) {
        final SubLObject nart = narts_high.find_nart(bound_nat);
        if (NIL != nart) {
            final SubLObject tou_support = removal_modules_termofunit.make_term_of_unit_support(nart, bound_nat);
            return list(cons(tou_support, additional_nat_function_supports()), cons(tou_support, additional_nat_argument_supports()));
        }
        return NIL;
    }

    public static SubLObject inference_nart_id_check(final SubLObject nart, final SubLObject id) {
        return eql(id, nart_handles.nart_id(nart));
    }

    public static SubLObject make_nart_id_support(final SubLObject nart, final SubLObject id, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        final SubLObject support_formula = list($$nartID, nart, id);
        if (NIL == negateP) {
            return arguments.make_hl_support($OPAQUE, support_formula, $nart_id_defining_mt$.getGlobalValue(), $TRUE_MON);
        }
        return arguments.make_hl_support($OPAQUE, cycl_utilities.negate(support_formula), $nart_id_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_nart_id_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return NIL != removal_nart_id_check(asent) ? $nart_id_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    public static SubLObject removal_nart_id_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_nart_id_check_pos_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_nart_id_check(final SubLObject asent) {
        final SubLObject nart = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nart_id_check(nart, id);
    }

    public static SubLObject removal_nart_id_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return NIL != nart_handles.find_nart_by_id(id) ? ONE_INTEGER : ZERO_INTEGER;
    }

    public static SubLObject declare_removal_modules_natfunction_file() {
        declareFunction(me, "removal_nat_function_check_pos_cost", "REMOVAL-NAT-FUNCTION-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_nat_function_check_pos_expand", "REMOVAL-NAT-FUNCTION-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "additional_nat_function_supports", "ADDITIONAL-NAT-FUNCTION-SUPPORTS", 0, 0, false);
        declareFunction(me, "nat_function_hl_support", "NAT-FUNCTION-HL-SUPPORT", 0, 0, false);
        declareFunction(me, "removal_nat_function_unify_cost", "REMOVAL-NAT-FUNCTION-UNIFY-COST", 1, 1, false);
        declareFunction(me, "removal_nat_function_unify_expand", "REMOVAL-NAT-FUNCTION-UNIFY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nat_function_lookup_cost", "REMOVAL-NAT-FUNCTION-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "removal_nat_function_lookup_expand", "REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nat_function_lookup_internal", "REMOVAL-NAT-FUNCTION-LOOKUP-INTERNAL", 1, 0, false);
        declareFunction(me, "removal_nat_argument_check_pos_required", "REMOVAL-NAT-ARGUMENT-CHECK-POS-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_nat_argument_check_pos_cost", "REMOVAL-NAT-ARGUMENT-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_nat_argument_check_pos_expand", "REMOVAL-NAT-ARGUMENT-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "additional_nat_argument_supports", "ADDITIONAL-NAT-ARGUMENT-SUPPORTS", 0, 0, false);
        declareFunction(me, "nat_argument_hl_support", "NAT-ARGUMENT-HL-SUPPORT", 0, 0, false);
        declareFunction(me, "removal_nat_argument_term_unify_required", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_nat_argument_term_unify_cost", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-COST", 1, 1, false);
        declareFunction(me, "removal_nat_argument_term_unify_expand", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nat_argument_arg_unify_cost", "REMOVAL-NAT-ARGUMENT-ARG-UNIFY-COST", 1, 1, false);
        declareFunction(me, "removal_nat_argument_arg_unify_expand", "REMOVAL-NAT-ARGUMENT-ARG-UNIFY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nat_argument_lookup_cost", "REMOVAL-NAT-ARGUMENT-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "removal_nat_argument_lookup_expand", "REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nat_argument_lookup_internal", "REMOVAL-NAT-ARGUMENT-LOOKUP-INTERNAL", 1, 0, false);
        declareFunction(me, "removal_nat_arguments_equal_check_pos_required", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_nat_arguments_equal_check_pos_cost", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_nat_arguments_equal_check_pos_expand", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nat_arguments_equal_check_cost", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-COST", 1, 0, false);
        declareFunction(me, "nat_arguments_equal_hl_support", "NAT-ARGUMENTS-EQUAL-HL-SUPPORT", 0, 0, false);
        declareFunction(me, "removal_nat_function_nat_argument_applicability", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-APPLICABILITY", 1, 0, false);
        declareFunction(me, "removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal", "REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT-INTERNAL", 1, 0, false);
        declareFunction(me, "removal_nat_func_asents_with_not_fully_bound_arg1_dict", "REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT", 1, 0, false);
        declareFunction(me, "removal_nat_function_contextualized_asent_p_internal", "REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P-INTERNAL", 1, 0, false);
        declareFunction(me, "removal_nat_function_contextualized_asent_p", "REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        declareFunction(me, "removal_nat_argument_contextualized_asent_p_internal", "REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P-INTERNAL", 1, 0, false);
        declareFunction(me, "removal_nat_argument_contextualized_asent_p", "REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        declareFunction(me, "removal_nat_function_nat_argument_cost", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-COST", 1, 0, false);
        declareFunction(me, "removal_nat_function_nat_argument_expand", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-EXPAND", 1, 0, false);
        declareFunction(me, "removal_nat_function_nat_argument_supports", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-SUPPORTS", 1, 0, false);
        declareFunction(me, "inference_nart_id_check", "INFERENCE-NART-ID-CHECK", 2, 0, false);
        declareFunction(me, "make_nart_id_support", "MAKE-NART-ID-SUPPORT", 2, 1, false);
        declareFunction(me, "removal_nart_id_check_pos_cost", "REMOVAL-NART-ID-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_nart_id_check_neg_cost", "REMOVAL-NART-ID-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_nart_id_check", "REMOVAL-NART-ID-CHECK", 1, 0, false);
        declareFunction(me, "removal_nart_id_lookup_cost", "REMOVAL-NART-ID-LOOKUP-COST", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_natfunction_file() {
        deflexical("*NAT-ARGUMENTS-EQUAL-ENABLED*", NIL);
        deflexical("*DEFAULT-NAT-FUNCTION-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*NAT-FUNCTION-CODE-RULE*", $list6);
        deflexical("*DEFAULT-NAT-ARGUMENT-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*NAT-ARGUMENT-CODE-RULE*", $list20);
        defparameter("*NAT-ARGUMENTS-EQUAL-CODE-RULE*", $list32);
        deflexical("*NART-ID-DEFINING-MT*", SubLTrampolineFile.maybeDefault($nart_id_defining_mt$, $nart_id_defining_mt$, $$BaseKB));
        deflexical("*NART-ID-CHECK-DEFAULT-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*NART-ID-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_natfunction_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$natFunction);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$natFunction);
        preference_modules.inference_preference_module($NAT_FUNCTION_LOOKUP_POS, $list3);
        inference_modules.inference_removal_module($REMOVAL_NAT_FUNCTION_CHECK_POS, $list5);
        inference_modules.inference_removal_module($REMOVAL_NAT_FUNCTION_UNIFY, $list11);
        inference_modules.inference_removal_module($REMOVAL_NAT_FUNCTION_LOOKUP, $list14);
        inference_modules.register_solely_specific_removal_module_predicate($$natArgument);
        preference_modules.inference_preference_module($NAT_ARGUMENT_LOOKUP_POS, $list17);
        inference_modules.inference_removal_module($REMOVAL_NAT_ARGUMENT_CHECK_POS, $list19);
        inference_modules.inference_removal_module($REMOVAL_NAT_ARGUMENT_TERM_UNIFY, $list22);
        inference_modules.inference_removal_module($REMOVAL_NAT_ARGUMENT_ARG_UNIFY, $list25);
        inference_modules.inference_removal_module($REMOVAL_NAT_ARGUMENT_LOOKUP, $list28);
        inference_modules.register_solely_specific_removal_module_predicate($$natArgumentsEqual);
        preference_modules.doomed_unless_arg_bindable($POS, $$natArgumentsEqual, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$natArgumentsEqual, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NAT_ARGUMENTS_EQUAL_CHECK_POS, $list31);
        memoization_state.note_memoized_function(REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT);
        memoization_state.note_memoized_function(REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P);
        memoization_state.note_memoized_function(REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P);
        inference_modules.register_solely_specific_removal_module_predicate($$nartID);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nartID);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$nartID);
        declare_defglobal($nart_id_defining_mt$);
        mt_vars.note_mt_var($nart_id_defining_mt$, $$nartID);
        inference_modules.inference_removal_module($REMOVAL_NART_ID_CHECK_POS, $list49);
        inference_modules.inference_removal_module($REMOVAL_NART_ID_CHECK_NEG, $list51);
        inference_modules.inference_removal_module($REMOVAL_NART_ID_UNIFY, $list53);
        inference_modules.inference_removal_module($REMOVAL_NART_ID_LOOKUP, $list55);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_natfunction_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_natfunction_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_natfunction_file();
    }

    static {


































































    }
}

/**
 * Total time: 199 ms
 */
