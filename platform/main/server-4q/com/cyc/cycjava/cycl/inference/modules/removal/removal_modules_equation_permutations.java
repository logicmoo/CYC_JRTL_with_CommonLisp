package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_equation_permutations extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_equation_permutations();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations";

    public static final String myFingerPrint = "a16b132c140ef503b6bd67cdd3030fdb1a7c57ac9b4c89cb1b32cb1760335bf5";

    // deflexical
    private static final SubLSymbol $equation_permutable_operators$ = makeSymbol("*EQUATION-PERMUTABLE-OPERATORS*");



    private static final SubLObject $$numericallyEquals = reader_make_constant_shell(makeString("numericallyEquals"));

    private static final SubLSymbol CYCL_EQUATION_P = makeSymbol("CYCL-EQUATION-P");

    private static final SubLSymbol $sym2$EQUATION_CANONICAL_PERMUTATION_ = makeSymbol("EQUATION-CANONICAL-PERMUTATION?");

    private static final SubLList $list3 = list(makeSymbol("NUM-EQ"), makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2"));

    private static final SubLObject $$PlusFn = reader_make_constant_shell(makeString("PlusFn"));

    private static final SubLObject $$DifferenceFn = reader_make_constant_shell(makeString("DifferenceFn"));

    private static final SubLObject $$TimesFn = reader_make_constant_shell(makeString("TimesFn"));

    private static final SubLObject $$QuotientFn = reader_make_constant_shell(makeString("QuotientFn"));

    private static final SubLObject $$LogFn = reader_make_constant_shell(makeString("LogFn"));

    private static final SubLObject $$ExpFn = reader_make_constant_shell(makeString("ExpFn"));

    private static final SubLObject $$The = reader_make_constant_shell(makeString("The"));

    private static final SubLList $list11 = list(reader_make_constant_shell(makeString("PlusFn")), reader_make_constant_shell(makeString("DifferenceFn")), reader_make_constant_shell(makeString("TimesFn")), reader_make_constant_shell(makeString("QuotientFn")), reader_make_constant_shell(makeString("LogFn")), reader_make_constant_shell(makeString("ExpFn")));

    private static final SubLList $list12 = list(makeSymbol("MINUEND"), makeSymbol("SUBTRAHEND"));

    private static final SubLList $list13 = list(makeSymbol("NUMERATOR"), makeSymbol("DENOMINATOR"));

    private static final SubLSymbol MAKE_ADDITION = makeSymbol("MAKE-ADDITION");

    private static final SubLSymbol MAKE_MULTIPLICATION = makeSymbol("MAKE-MULTIPLICATION");

    private static final SubLObject $$equationPermutations = reader_make_constant_shell(makeString("equationPermutations"));



    public static final SubLSymbol $equation_permutations_defining_mt$ = makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLSymbol $REMOVAL_EQUATION_PERMUTATIONS_CHECK = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-CHECK");

    private static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equationPermutations")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equationPermutations")), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("equationPermutations")), list(makeKeyword("BIND"), makeSymbol("EQUATION")), list(makeKeyword("BIND"), makeSymbol("PERMUTATION"))), list(list(makeKeyword("VALUE"), makeSymbol("EQUATION")), list(makeKeyword("VALUE"), makeSymbol("PERMUTATION")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EQUATION"), makeSymbol("PERMUTATION")), list(makeKeyword("CALL"), makeSymbol("EQUATION-HAS-CANONICAL-PERMUTATION-P"), list(makeKeyword("VALUE"), makeSymbol("EQUATION")), list(makeKeyword("VALUE"), makeSymbol("PERMUTATION")))), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$equationPermutations \n  (#$numericallyEquals <bound> <bound>)\n  (#$numericallyEquals <bound> <bound>))"), makeKeyword("EXAMPLE"), makeString("(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))") });

    private static final SubLSymbol $REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-ARG1-UNIFY");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equationPermutations")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equationPermutations")), makeKeyword("NOT-FULLY-BOUND"), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), TWENTY_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("equationPermutations")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("EQUATION"))), list(makeKeyword("VALUE"), makeSymbol("EQUATION"))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("TEST"), makeSymbol("EQUATION-CANONICAL-PERMUTATION?")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("EQUATION-PERMUTATIONS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("equationPermutations")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("EQUATION"))), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$equationPermutations  <whatever> (#$numericallyEquals <bound> <bound>))"), makeKeyword("EXAMPLE"), makeString("(#$equationPermutations \n  ?EQUATION \n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))") });

    private static final SubLSymbol $REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-ARG2-UNIFY");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equationPermutations")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equationPermutations")), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("equationPermutations")), list(makeKeyword("BIND"), makeSymbol("EQUATION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("EQUATION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("EQUATION-CANONICAL-PERMUTATIONS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("equationPermutations")), list(makeKeyword("VALUE"), makeSymbol("EQUATION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$equationPermutations (#$numericallyEquals <bound> <bound>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  ?PERMUTED)") });

    private static final SubLSymbol EQUATION_PERMUTATIONS_FROM_ADDITION = makeSymbol("EQUATION-PERMUTATIONS-FROM-ADDITION");













    private static final SubLList $list33 = list(list(list(list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"), makeKeyword("B")), makeKeyword("OTHER")), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("OTHER"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("OTHER"), makeKeyword("A"))))), list(list(list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"), makeKeyword("B"), makeKeyword("C")), makeKeyword("OTHER")), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("B"), makeKeyword("C")))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"), makeKeyword("C")))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("C"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"), makeKeyword("B")))))));

    private static final SubLSymbol EQUATION_PERMUTATIONS_FROM_SUBTRACTION = makeSymbol("EQUATION-PERMUTATIONS-FROM-SUBTRACTION");

    private static final SubLList $list35 = list(list(list(list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("A"), makeKeyword("B")), makeKeyword("OTHER")), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("B"), makeKeyword("OTHER"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("A"), makeKeyword("OTHER"))))));

    private static final SubLSymbol EQUATION_PERMUTATIONS_FROM_MULTIPLICATION = makeSymbol("EQUATION-PERMUTATIONS-FROM-MULTIPLICATION");

    private static final SubLList $list37 = list(list(list(list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B")), makeKeyword("OTHER")), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("OTHER"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("OTHER"), makeKeyword("A"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"))))), list(list(list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"), makeKeyword("C")), makeKeyword("OTHER")), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("B"), makeKeyword("C")))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"), makeKeyword("C"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("C")))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"), makeKeyword("C"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("C"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B")))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"), makeKeyword("C"))))));

    private static final SubLSymbol EQUATION_PERMUTATIONS_FROM_DIVISION = makeSymbol("EQUATION-PERMUTATIONS-FROM-DIVISION");

    private static final SubLList $list39 = list(list(list(list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("A"), makeKeyword("B")), makeKeyword("OTHER")), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("B"), makeKeyword("OTHER"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("A"), makeKeyword("OTHER"))))));

    private static final SubLSymbol EQUATION_IMMEDIATE_PERMUTATIONS = makeSymbol("EQUATION-IMMEDIATE-PERMUTATIONS");

    private static final SubLList $list41 = list(list(list(list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"), makeKeyword("B")), makeKeyword("OTHER"))), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("OTHER"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("OTHER"), makeKeyword("A"))))), list(list(list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("A"), makeKeyword("B")), makeKeyword("OTHER"))), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("A"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("B"), makeKeyword("OTHER"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("A"), makeKeyword("OTHER"))))), list(list(list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B")), makeKeyword("OTHER"))), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("OTHER"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("OTHER"), makeKeyword("A"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"), makeKeyword("B"))))), list(list(list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("A"), makeKeyword("B")), makeKeyword("OTHER"))), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("OTHER"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("A"), makeKeyword("B"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("A"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("B"), makeKeyword("OTHER"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("B"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("A"), makeKeyword("OTHER"))))));

    private static final SubLSymbol EQUATION_CANONICAL_PERMUTATIONS = makeSymbol("EQUATION-CANONICAL-PERMUTATIONS");



    private static final SubLList $list44 = list(list(list(list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("ElectricalResistance"))), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Length"))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("BulkResistance")))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Area")))))), list(list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Length"))), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("ElectricalResistance"))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Area")))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("BulkResistance"))))), list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("ElectricalResistance"))), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Length"))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("BulkResistance")))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Area"))))), list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Area"))), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Length"))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("BulkResistance")))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("ElectricalResistance"))))), list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("BulkResistance"))), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("ElectricalResistance"))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Area")))), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Length"))))))), list(list(list(reader_make_constant_shell(makeString("numericallyEquals")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("PRESSURE"), makeKeyword("VOLUME")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("MOLARITY"), makeKeyword("R"), makeKeyword("TEMPERATURE")))), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("MOLARITY"), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("PRESSURE"), makeKeyword("VOLUME")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("R"), makeKeyword("TEMPERATURE")))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("PRESSURE"), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("MOLARITY"), makeKeyword("R"), makeKeyword("TEMPERATURE")), makeKeyword("VOLUME"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("R"), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("PRESSURE"), makeKeyword("VOLUME")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("MOLARITY"), makeKeyword("TEMPERATURE")))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("TEMPERATURE"), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("PRESSURE"), makeKeyword("VOLUME")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("MOLARITY"), makeKeyword("R")))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("VOLUME"), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("MOLARITY"), makeKeyword("R"), makeKeyword("TEMPERATURE")), makeKeyword("PRESSURE"))))), list(list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("BILL-PLUS-TIP"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("BILL-ABOUT"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("BILL-ABOUT"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("TIP-PERCENT"), makeInteger(100)))))), list(list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("BILL-PLUS-TIP"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("BILL-ABOUT"), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("BILL-ABOUT"), makeKeyword("TIP-PERCENT")), makeInteger(100)))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("BILL-PLUS-TIP"), list(reader_make_constant_shell(makeString("PlusFn")), makeKeyword("BILL-ABOUT"), list(reader_make_constant_shell(makeString("TimesFn")), makeKeyword("BILL-ABOUT"), list(reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("TIP-PERCENT"), makeInteger(100))))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("TIP-PERCENT"), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("TimesFn")), makeInteger(100), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("BILL-PLUS-TIP"), makeKeyword("BILL-ABOUT"))), makeKeyword("BILL-ABOUT"))), list(reader_make_constant_shell(makeString("numericallyEquals")), makeKeyword("TIP-PERCENT"), list(reader_make_constant_shell(makeString("TimesFn")), makeInteger(100), list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("BILL-PLUS-TIP"), makeKeyword("BILL-ABOUT")), makeKeyword("BILL-ABOUT")))))));

    public static SubLObject cycl_equation_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$numericallyEquals)) && (NIL != formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject equation_permutations(final SubLObject equation) {
        assert NIL != cycl_equation_p(equation) : "removal_modules_equation_permutations.cycl_equation_p(equation) " + "CommonSymbols.NIL != removal_modules_equation_permutations.cycl_equation_p(equation) " + equation;
        final SubLObject unprocessed_equations = queues.create_queue(UNPROVIDED);
        final SubLObject seen_equations = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject all_permutations = NIL;
        queues.enqueue(equation, unprocessed_equations);
        set.set_add(equation, seen_equations);
        while (NIL == queues.queue_empty_p(unprocessed_equations)) {
            final SubLObject unprocessed_equation = queues.dequeue(unprocessed_equations);
            final SubLObject immediate_permutations = equation_immediate_permutations(unprocessed_equation);
            all_permutations = cons(unprocessed_equation, all_permutations);
            SubLObject cdolist_list_var = immediate_permutations;
            SubLObject immediate_permutation = NIL;
            immediate_permutation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == set.set_memberP(immediate_permutation, seen_equations)) {
                    queues.enqueue(immediate_permutation, unprocessed_equations);
                    set.set_add(immediate_permutation, seen_equations);
                }
                cdolist_list_var = cdolist_list_var.rest();
                immediate_permutation = cdolist_list_var.first();
            } 
        } 
        all_permutations = kb_utilities.sort_terms(all_permutations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return all_permutations;
    }

    public static SubLObject equation_canonical_permutations(final SubLObject equation) {
        final SubLObject all_permutations = equation_permutations(equation);
        SubLObject canonical_permutations = NIL;
        SubLObject cdolist_list_var = all_permutations;
        SubLObject permutation = NIL;
        permutation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != equation_canonical_permutationP(permutation)) {
                canonical_permutations = cons(permutation, canonical_permutations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            permutation = cdolist_list_var.first();
        } 
        canonical_permutations = kb_utilities.sort_terms(canonical_permutations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return canonical_permutations;
    }

    public static SubLObject equation_has_canonical_permutationP(final SubLObject equation, final SubLObject permutation) {
        assert NIL != cycl_equation_p(equation) : "removal_modules_equation_permutations.cycl_equation_p(equation) " + "CommonSymbols.NIL != removal_modules_equation_permutations.cycl_equation_p(equation) " + equation;
        assert NIL != cycl_equation_p(permutation) : "removal_modules_equation_permutations.cycl_equation_p(permutation) " + "CommonSymbols.NIL != removal_modules_equation_permutations.cycl_equation_p(permutation) " + permutation;
        return makeBoolean((NIL != equation_canonical_permutationP(permutation)) && (NIL != list_utilities.member_equalP(permutation, equation_canonical_permutations(equation))));
    }

    public static SubLObject equation_canonical_permutationP(final SubLObject permutation) {
        if (NIL == cycl_equation_p(permutation)) {
            return NIL;
        }
        final SubLObject arg1 = cycl_utilities.formula_arg1(permutation, UNPROVIDED);
        if (arg1.isNumber()) {
            return NIL;
        }
        return makeBoolean(((NIL == el_formula_p(arg1)) || (NIL == equation_permutable_operator_p(cycl_utilities.formula_operator(arg1)))) && (NIL == cycl_utilities.expression_find(arg1, cycl_utilities.formula_arg2(permutation, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject equation_immediate_permutations(final SubLObject equation) {
        SubLObject num_eq = NIL;
        SubLObject expression1 = NIL;
        SubLObject expression2 = NIL;
        destructuring_bind_must_consp(equation, equation, $list3);
        num_eq = equation.first();
        SubLObject current = equation.rest();
        destructuring_bind_must_consp(current, equation, $list3);
        expression1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, equation, $list3);
        expression2 = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(num_eq, $$numericallyEquals);
            SubLObject permutations = NIL;
            if (NIL != el_formula_p(expression1)) {
                final SubLObject pcase_var;
                final SubLObject operator = pcase_var = cycl_utilities.formula_operator(expression1);
                if (pcase_var.eql($$PlusFn)) {
                    permutations = equation_permutations_from_addition(expression1, expression2);
                } else
                    if (pcase_var.eql($$DifferenceFn)) {
                        permutations = equation_permutations_from_subtraction(expression1, expression2);
                    } else
                        if (pcase_var.eql($$TimesFn)) {
                            permutations = equation_permutations_from_multiplication(expression1, expression2);
                        } else
                            if (pcase_var.eql($$QuotientFn)) {
                                permutations = equation_permutations_from_division(expression1, expression2);
                            } else
                                if (pcase_var.eql($$LogFn)) {
                                    permutations = equation_permutations_from_natural_log(expression1, expression2);
                                } else
                                    if (pcase_var.eql($$ExpFn)) {
                                        permutations = equation_permutations_from_natural_exp(expression1, expression2);
                                    } else
                                        if (pcase_var.eql($$The)) {
                                        }






            }
            permutations = cons(make_equation(expression2, expression1), permutations);
            return permutations;
        }
        cdestructuring_bind_error(equation, $list3);
        return NIL;
    }

    public static SubLObject equation_permutable_operator_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $equation_permutable_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject equation_permutations_from_addition(final SubLObject addition, final SubLObject other) {
        list_utilities.verify_form_with_operator(addition, $$PlusFn);
        final SubLObject addends = cycl_utilities.formula_args(addition, UNPROVIDED);
        SubLObject permutations = NIL;
        SubLObject list_var = NIL;
        SubLObject addend = NIL;
        SubLObject index = NIL;
        list_var = addends;
        addend = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , addend = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject rest_addends = list_utilities.remove_nth(index, addends);
            final SubLObject rest_term = (NIL != list_utilities.singletonP(rest_addends)) ? rest_addends.first() : make_addition(rest_addends);
            final SubLObject permuted_other = make_difference(other, rest_term);
            final SubLObject permutation = make_equation(addend, permuted_other);
            permutations = cons(permutation, permutations);
        }
        return nreverse(permutations);
    }

    public static SubLObject equation_permutations_from_subtraction(final SubLObject subtraction, final SubLObject other) {
        list_utilities.verify_form_with_operator(subtraction, $$DifferenceFn);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(subtraction, UNPROVIDED);
        SubLObject minuend = NIL;
        SubLObject subtrahend = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        minuend = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        subtrahend = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject permuted1 = make_addition(list(other, subtrahend));
            final SubLObject permuted2 = make_difference(minuend, other);
            final SubLObject permutation1 = make_equation(minuend, permuted1);
            final SubLObject permutation2 = make_equation(subtrahend, permuted2);
            return list(permutation1, permutation2);
        }
        cdestructuring_bind_error(datum, $list12);
        return NIL;
    }

    public static SubLObject equation_permutations_from_multiplication(final SubLObject multiplication, final SubLObject other) {
        list_utilities.verify_form_with_operator(multiplication, $$TimesFn);
        final SubLObject addends = cycl_utilities.formula_args(multiplication, UNPROVIDED);
        SubLObject permutations = NIL;
        SubLObject list_var = NIL;
        SubLObject addend = NIL;
        SubLObject index = NIL;
        list_var = addends;
        addend = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , addend = list_var.first() , index = add(ONE_INTEGER, index)) {
            SubLObject rest_addends = list_utilities.remove_nth(index, addends);
            final SubLObject rest_term = (NIL != list_utilities.singletonP(rest_addends)) ? rest_addends.first() : make_multiplication(rest_addends);
            final SubLObject permuted_other = make_quotient(other, rest_term);
            final SubLObject permutation = make_equation(addend, permuted_other);
            permutations = cons(permutation, permutations);
            rest_addends = list_utilities.remove_nth(index, addends);
            final SubLObject permuted_numerator = (NIL != list_utilities.form_with_operator_p(addend, $$QuotientFn)) ? make_quotient(make_multiplication(append(list(second(addend)), rest_addends)), third(addend)) : make_multiplication(addends);
            final SubLObject permutation2 = make_equation(other, permuted_numerator);
            permutations = cons(permutation2, permutations);
        }
        return nreverse(permutations);
    }

    public static SubLObject equation_permutations_from_division(final SubLObject division, final SubLObject other) {
        list_utilities.verify_form_with_operator(division, $$QuotientFn);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(division, UNPROVIDED);
        SubLObject numerator = NIL;
        SubLObject denominator = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        numerator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        denominator = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject permuted1 = make_multiplication(list(other, denominator));
            final SubLObject permuted2 = make_quotient(numerator, other);
            final SubLObject permutation1 = make_equation(numerator, permuted1);
            final SubLObject permutation2 = make_equation(denominator, permuted2);
            return list(permutation1, permutation2);
        }
        cdestructuring_bind_error(datum, $list13);
        return NIL;
    }

    public static SubLObject equation_permutations_from_natural_log(final SubLObject log_formula, final SubLObject other) {
        list_utilities.verify_form_with_operator(log_formula, $$LogFn);
        final SubLObject v_term = cycl_utilities.formula_arg1(log_formula, ONE_INTEGER);
        final SubLObject permuted = make_unary_formula($$ExpFn, other);
        final SubLObject permutation = make_equation(v_term, permuted);
        return list(permutation);
    }

    public static SubLObject equation_permutations_from_natural_exp(final SubLObject exp_formula, final SubLObject other) {
        list_utilities.verify_form_with_operator(exp_formula, $$ExpFn);
        final SubLObject v_term = cycl_utilities.formula_arg1(exp_formula, ONE_INTEGER);
        final SubLObject permuted = make_unary_formula($$LogFn, other);
        final SubLObject permutation = make_equation(v_term, permuted);
        return list(permutation);
    }

    public static SubLObject make_equation(final SubLObject expression1, final SubLObject expression2) {
        return make_binary_formula($$numericallyEquals, expression1, expression2);
    }

    public static SubLObject make_commutative_formula(final SubLObject relation, SubLObject args) {
        args = kb_utilities.sort_terms(args, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return make_formula(relation, args, UNPROVIDED);
    }

    public static SubLObject make_symmetric_formula(final SubLObject relation, final SubLObject arg1, final SubLObject arg2) {
        return make_commutative_formula(relation, list(arg1, arg2));
    }

    public static SubLObject make_associative_commutative_formula(final SubLObject operator, final SubLObject args) {
        SubLObject final_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_formula_with_operator_p(arg, operator)) {
                SubLObject cdolist_list_var_$1;
                final SubLObject sub_args = cdolist_list_var_$1 = cycl_utilities.formula_args(arg, UNPROVIDED);
                SubLObject sub_arg = NIL;
                sub_arg = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    final_args = cons(sub_arg, final_args);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    sub_arg = cdolist_list_var_$1.first();
                } 
            } else {
                final_args = cons(arg, final_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.singletonP(final_args)) {
            return final_args.first();
        }
        return make_commutative_formula(operator, final_args);
    }

    public static SubLObject make_separator_formula(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject aggregator) {
        if (NIL != el_formula_with_operator_p(arg1, operator)) {
            final SubLObject sub_arg1 = cycl_utilities.formula_arg1(arg1, UNPROVIDED);
            final SubLObject sub_arg2 = cycl_utilities.formula_arg2(arg1, UNPROVIDED);
            final SubLObject new_arg2 = funcall(aggregator, list(sub_arg2, arg2));
            return make_separator_formula(operator, sub_arg1, new_arg2, aggregator);
        }
        return make_binary_formula(operator, arg1, arg2);
    }

    public static SubLObject make_addition(final SubLObject addends) {
        return make_associative_commutative_formula($$PlusFn, addends);
    }

    public static SubLObject make_multiplication(final SubLObject products) {
        return make_associative_commutative_formula($$TimesFn, products);
    }

    public static SubLObject make_difference(final SubLObject minuend, final SubLObject subtrahend) {
        return make_separator_formula($$DifferenceFn, minuend, subtrahend, MAKE_ADDITION);
    }

    public static SubLObject make_quotient(final SubLObject numerator, final SubLObject denominator) {
        return make_separator_formula($$QuotientFn, numerator, denominator, MAKE_MULTIPLICATION);
    }

    public static SubLObject declare_removal_modules_equation_permutations_file() {
        declareFunction(me, "cycl_equation_p", "CYCL-EQUATION-P", 1, 0, false);
        declareFunction(me, "equation_permutations", "EQUATION-PERMUTATIONS", 1, 0, false);
        declareFunction(me, "equation_canonical_permutations", "EQUATION-CANONICAL-PERMUTATIONS", 1, 0, false);
        declareFunction(me, "equation_has_canonical_permutationP", "EQUATION-HAS-CANONICAL-PERMUTATION?", 2, 0, false);
        declareFunction(me, "equation_canonical_permutationP", "EQUATION-CANONICAL-PERMUTATION?", 1, 0, false);
        declareFunction(me, "equation_immediate_permutations", "EQUATION-IMMEDIATE-PERMUTATIONS", 1, 0, false);
        declareFunction(me, "equation_permutable_operator_p", "EQUATION-PERMUTABLE-OPERATOR-P", 1, 0, false);
        declareFunction(me, "equation_permutations_from_addition", "EQUATION-PERMUTATIONS-FROM-ADDITION", 2, 0, false);
        declareFunction(me, "equation_permutations_from_subtraction", "EQUATION-PERMUTATIONS-FROM-SUBTRACTION", 2, 0, false);
        declareFunction(me, "equation_permutations_from_multiplication", "EQUATION-PERMUTATIONS-FROM-MULTIPLICATION", 2, 0, false);
        declareFunction(me, "equation_permutations_from_division", "EQUATION-PERMUTATIONS-FROM-DIVISION", 2, 0, false);
        declareFunction(me, "equation_permutations_from_natural_log", "EQUATION-PERMUTATIONS-FROM-NATURAL-LOG", 2, 0, false);
        declareFunction(me, "equation_permutations_from_natural_exp", "EQUATION-PERMUTATIONS-FROM-NATURAL-EXP", 2, 0, false);
        declareFunction(me, "make_equation", "MAKE-EQUATION", 2, 0, false);
        declareFunction(me, "make_commutative_formula", "MAKE-COMMUTATIVE-FORMULA", 2, 0, false);
        declareFunction(me, "make_symmetric_formula", "MAKE-SYMMETRIC-FORMULA", 3, 0, false);
        declareFunction(me, "make_associative_commutative_formula", "MAKE-ASSOCIATIVE-COMMUTATIVE-FORMULA", 2, 0, false);
        declareFunction(me, "make_separator_formula", "MAKE-SEPARATOR-FORMULA", 4, 0, false);
        declareFunction(me, "make_addition", "MAKE-ADDITION", 1, 0, false);
        declareFunction(me, "make_multiplication", "MAKE-MULTIPLICATION", 1, 0, false);
        declareFunction(me, "make_difference", "MAKE-DIFFERENCE", 2, 0, false);
        declareFunction(me, "make_quotient", "MAKE-QUOTIENT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_equation_permutations_file() {
        deflexical("*EQUATION-PERMUTABLE-OPERATORS*", $list11);
        deflexical("*EQUATION-PERMUTATIONS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($equation_permutations_defining_mt$, $equation_permutations_defining_mt$, $$UniversalVocabularyMt));
        return NIL;
    }

    public static SubLObject setup_removal_modules_equation_permutations_file() {
        note_funcall_helper_function($sym2$EQUATION_CANONICAL_PERMUTATION_);
        inference_modules.register_solely_specific_removal_module_predicate($$equationPermutations);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$equationPermutations);
        declare_defglobal($equation_permutations_defining_mt$);
        mt_vars.note_mt_var($equation_permutations_defining_mt$, $$equationPermutations);
        inference_modules.inference_removal_module($REMOVAL_EQUATION_PERMUTATIONS_CHECK, $list21);
        inference_modules.inference_removal_module($REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY, $list23);
        inference_modules.inference_removal_module($REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY, $list25);
        define_test_case_table_int(EQUATION_PERMUTATIONS_FROM_ADDITION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list33);
        define_test_case_table_int(EQUATION_PERMUTATIONS_FROM_SUBTRACTION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list35);
        define_test_case_table_int(EQUATION_PERMUTATIONS_FROM_MULTIPLICATION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list37);
        define_test_case_table_int(EQUATION_PERMUTATIONS_FROM_DIVISION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list39);
        define_test_case_table_int(EQUATION_IMMEDIATE_PERMUTATIONS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list41);
        define_test_case_table_int(EQUATION_CANONICAL_PERMUTATIONS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list44);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_equation_permutations_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_equation_permutations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_equation_permutations_file();
    }

    static {
















































    }
}

/**
 * Total time: 238 ms
 */
