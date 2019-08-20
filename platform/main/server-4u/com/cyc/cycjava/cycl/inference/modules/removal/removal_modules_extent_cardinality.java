/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.el_list_length;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_nat_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_extent_cardinality extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_extent_cardinality();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_removal_extent_cardinality_cost$ = makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*");







    private static final SubLSymbol $REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE");

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), $FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-FORT-EXTENT-CARDINALITY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$MonthOfYearType ?COUNT)") });

    private static final SubLSymbol $REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), list($BIND, makeSymbol("CARDINALITY"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("CARDINALITY")), list($CALL, makeSymbol("FORT-HAS-EXTENT-CARDINALITY?"), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$MonthOfYearType 12)") });

    private static final SubLSymbol $REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-NEG");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), list($BIND, makeSymbol("CARDINALITY"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("CARDINALITY")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("FORT-HAS-EXTENT-CARDINALITY?"), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$extentCardinality <fort> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$extentCardinality #$MonthOfYearType 14))") });

    private static final SubLSymbol $REMOVAL_EXTENT_CARDINALITY_THESET = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THESET");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-EXTENT-CARDINALITY-SET"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheSet . <fully-bound>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality (#$TheSet #$Andorra #$France #$Portugal) ?COUNT)") });

    private static final SubLSymbol $REMOVAL_EXTENT_CARDINALITY_THESETOF = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THESETOF");

    private static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-EXTENT-CARDINALITY-SET"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheSetOf <variable> <closed except for variable>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality \n      (#$TheSetOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), $FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-FORT-EXTENT-CARDINALITY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$MonthOfYearType ?COUNT)") });

    private static final SubLSymbol $REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THECOLLECTIONOF");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("NAT"), list(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-EXTENT-CARDINALITY-COLLECTION"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheCollectionOf <variable> <closed except for variable>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality \n      (#$TheCollectionOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), list($BIND, makeSymbol("CARDINALITY"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("CARDINALITY")), list($CALL, makeSymbol("FORT-HAS-EXTENT-CARDINALITY?"), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$MonthOfYearType 12)") });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), list($BIND, makeSymbol("CARDINALITY"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("CARDINALITY")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("FORT-HAS-EXTENT-CARDINALITY?"), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$extentCardinality <fort> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$extentCardinality #$MonthOfYearType 14))") });

    private static final SubLSymbol $REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION = makeKeyword("REMOVAL-EXTENT-CARDINALITY-CYCLASSERTION");

    private static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("CycLAssertion"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("ASSERTION-COUNT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("CycLAssertion"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality #$CycLAssertion <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$CycLAssertion ?COUNT)") });

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-EXTENT-CARDINALITY-SET"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheSet . <fully-bound>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality (#$TheSet #$Andorra #$France #$Portugal) ?COUNT)") });

    private static final SubLSymbol $REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM = makeKeyword("REMOVAL-EXTENT-CARDINALITY-CYCLREIFIEDDENOTATIONALTERM");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("CycLReifiedDenotationalTerm"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("FORT-COUNT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("CycLReifiedDenotationalTerm"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm ?COUNT)") });

    public static final SubLSymbol $length_of_list_defining_mt$ = makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*");

    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-EXTENT-CARDINALITY-SET"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheSetOf <variable> <closed except for variable>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality \n      (#$TheSetOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });





    private static final SubLSymbol $REMOVAL_LENGTH_OF_THELIST_CHECK_POS = makeKeyword("REMOVAL-LENGTH-OF-THELIST-CHECK-POS");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("lengthOfList"), list($BIND, makeSymbol("LIST")), list($BIND, makeSymbol("LENGTH"))), list(list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LIST"), makeSymbol("LENGTH")), list($CALL, makeSymbol("REMOVAL-EL-LIST-LENGTH="), list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))), makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 3)\n    (#$lengthOfList (#$TheList) 0)\n    (#$lengthOfList #$TheEmptyList 0)") });

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("NAT"), list(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("extentCardinality"), list($BIND, makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("REMOVAL-EXTENT-CARDINALITY-COLLECTION"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality (#$TheCollectionOf <variable> <closed except for variable>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality \n      (#$TheCollectionOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });

    private static final SubLSymbol $REMOVAL_LENGTH_OF_THELIST_CHECK_NEG = makeKeyword("REMOVAL-LENGTH-OF-THELIST-CHECK-NEG");

    private static final SubLList $list30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("lengthOfList"), list($BIND, makeSymbol("LIST")), list($BIND, makeSymbol("LENGTH"))), list(list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LIST"), makeSymbol("LENGTH")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REMOVAL-EL-LIST-LENGTH="), list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>)) or\n    (#$not (#$lengthOfList #$TheEmptyList <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 1))\n    (#$not (#$lengthOfList (#$TheList) 1))\n    (#$not (#$lengthOfList #$TheEmptyList 1))") });

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("CycLAssertion"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("ASSERTION-COUNT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("CycLAssertion"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality #$CycLAssertion <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$CycLAssertion ?COUNT)") });

    private static final SubLSymbol $REMOVAL_LENGTH_OF_THELIST_GENERATE = makeKeyword("REMOVAL-LENGTH-OF-THELIST-GENERATE");

    private static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("lengthOfList"), list($BIND, makeSymbol("LIST")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("LIST"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("EL-LIST-LENGTH"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("VALUE"), makeSymbol("LIST")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$lengthOfList (#$TheList . <fully-bound>) <not-fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) ?COUNT)\n    (#$lengthOfList (#$TheList) ?COUNT)\n    (#$lengthOfList #$TheEmptyList ?COUNT)") });

    static private final SubLList $list_alt19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("extentCardinality"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("CycLReifiedDenotationalTerm"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("FORT-COUNT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("extentCardinality"), reader_make_constant_shell("CycLReifiedDenotationalTerm"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm ?COUNT)") });

    private static final SubLSymbol $REMOVAL_LENGTH_OF_THELIST_PRUNE = makeKeyword("REMOVAL-LENGTH-OF-THELIST-PRUNE");

    private static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), cons(reader_make_constant_shell("TheList"), makeKeyword("NOT-FULLY-BOUND")), list($TEST, makeSymbol("PROPER-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-LENGTH-OF-THE-LIST-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("pruning module that handles\n    (#$lengthOfList (#$TheList . <not fully-bound>) <fully-bound>) \n    where the length in ARG2 does not match the list in ARG1"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$isa ?X) 1)") });

    // Definitions
    public static final SubLObject removal_extent_cardinality_set_alt(SubLObject v_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject extent = quantities.set_extent(v_set, mt_relevance_macros.$mt$.getDynamicValue(thread), $HL);
                return length(extent);
            }
        }
    }

    // Definitions
    public static SubLObject removal_extent_cardinality_set(final SubLObject v_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject extent = quantities.set_extent(v_set, mt_relevance_macros.$mt$.getDynamicValue(thread), $HL);
        return length(extent);
    }

    public static final SubLObject removal_extent_cardinality_collection_alt(SubLObject col) {
        if ((NIL != possibly_nat_p(col)) && ($$TheCollectionOf == cycl_utilities.nat_functor(col))) {
            return length(ask_utilities.the_set_of_elements(col, UNPROVIDED, UNPROVIDED));
        } else {
            return isa.count_all_instances(col, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject removal_extent_cardinality_collection(final SubLObject col) {
        if ((NIL != possibly_nat_p(col)) && $$TheCollectionOf.eql(cycl_utilities.nat_functor(col))) {
            return length(ask_utilities.the_set_of_elements(col, UNPROVIDED, UNPROVIDED));
        }
        return isa.count_all_instances(col, UNPROVIDED, UNPROVIDED);
    }

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("lengthOfList"), list($BIND, makeSymbol("LIST")), list($BIND, makeSymbol("LENGTH"))), list(list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LIST"), makeSymbol("LENGTH")), list($CALL, makeSymbol("REMOVAL-EL-LIST-LENGTH="), list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))), makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 3)\n    (#$lengthOfList (#$TheList) 0)\n    (#$lengthOfList #$TheEmptyList 0)") });

    public static final SubLObject removal_fort_extent_cardinality_alt(SubLObject v_set) {
        if (NIL != forts.fort_p(v_set)) {
            if ($$TheEmptySet == v_set) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_extent_cardinality.removal_extent_cardinality_set(v_set);
            } else {
                if (NIL != fort_types_interface.collectionP(v_set)) {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_extent_cardinality.removal_extent_cardinality_collection(v_set);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_fort_extent_cardinality(final SubLObject v_set) {
        if (NIL != forts.fort_p(v_set)) {
            if ($$TheEmptySet.eql(v_set)) {
                return removal_extent_cardinality_set(v_set);
            }
            if (NIL != fort_types_interface.collectionP(v_set)) {
                return removal_extent_cardinality_collection(v_set);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether SET has CARDINALITY elements in relevant mts
     */
    @LispMethod(comment = "@return booleanp; whether SET has CARDINALITY elements in relevant mts")
    public static final SubLObject fort_has_extent_cardinalityP_alt(SubLObject v_set, SubLObject cardinality) {
        if (NIL != forts.fort_p(v_set)) {
            {
                SubLObject number = quantities.cycl_real_number_to_number(cardinality);
                if (NIL != subl_promotions.non_negative_integer_p(number)) {
                    if ($$TheEmptySet == v_set) {
                        return zerop(number);
                    } else {
                        if (NIL != fort_types_interface.collectionP(v_set)) {
                            return isa.count_all_instances_E(v_set, number, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether SET has CARDINALITY elements in relevant mts
     */
    @LispMethod(comment = "@return booleanp; whether SET has CARDINALITY elements in relevant mts")
    public static SubLObject fort_has_extent_cardinalityP(final SubLObject v_set, final SubLObject cardinality) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject catch_this = NIL;
        try {
            thread.throwStack.push($UNEVALUATABLE);
            if (NIL != forts.fort_p(v_set)) {
                final SubLObject number = quantities.cycl_real_number_to_number(cardinality);
                if (NIL != subl_promotions.non_negative_integer_p(number)) {
                    if ($$TheEmptySet.eql(v_set)) {
                        result = zerop(number);
                    } else
                        if (NIL != fort_types_interface.collectionP(v_set)) {
                            result = isa.count_all_instances_E(v_set, number, UNPROVIDED, UNPROVIDED);
                        }

                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_this = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    public static final SubLObject el_list_lengthE_alt(SubLObject el_list, SubLObject integer) {
        SubLTrampolineFile.checkType(integer, INTEGERP);
        return numE(el_list_length(el_list), integer);
    }

    public static SubLObject el_list_lengthE(final SubLObject el_list, final SubLObject integer) {
        assert NIL != integerp(integer) : "! integerp(integer) " + ("Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) ") + integer;
        return numE(el_list_length(el_list), integer);
    }

    static private final SubLList $list_alt27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("lengthOfList"), list($BIND, makeSymbol("LIST")), list($BIND, makeSymbol("LENGTH"))), list(list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LIST"), makeSymbol("LENGTH")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REMOVAL-EL-LIST-LENGTH="), list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>)) or\n    (#$not (#$lengthOfList #$TheEmptyList <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 1))\n    (#$not (#$lengthOfList (#$TheList) 1))\n    (#$not (#$lengthOfList #$TheEmptyList 1))") });

    public static final SubLObject removal_el_list_lengthE_alt(SubLObject el_list, SubLObject integer) {
        return makeBoolean(((NIL != el_list_p(el_list)) && (NIL != subl_promotions.non_negative_integer_p(integer))) && (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_extent_cardinality.el_list_lengthE(el_list, integer)));
    }

    public static SubLObject removal_el_list_lengthE(final SubLObject el_list, final SubLObject integer) {
        return makeBoolean(((NIL != el_list_p(el_list)) && (NIL != subl_promotions.non_negative_integer_p(integer))) && (NIL != el_list_lengthE(el_list, integer)));
    }

    public static final SubLObject removal_length_of_the_list_prune_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject el_list = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject length = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_extent_cardinality.removal_el_list_lengthE(el_list, length));
        }
    }

    public static SubLObject removal_length_of_the_list_prune(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject el_list = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject length = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return makeBoolean(NIL == removal_el_list_lengthE(el_list, length));
    }

    public static SubLObject declare_removal_modules_extent_cardinality_file() {
        declareFunction("removal_extent_cardinality_set", "REMOVAL-EXTENT-CARDINALITY-SET", 1, 0, false);
        declareFunction("removal_extent_cardinality_collection", "REMOVAL-EXTENT-CARDINALITY-COLLECTION", 1, 0, false);
        declareFunction("removal_fort_extent_cardinality", "REMOVAL-FORT-EXTENT-CARDINALITY", 1, 0, false);
        declareFunction("fort_has_extent_cardinalityP", "FORT-HAS-EXTENT-CARDINALITY?", 2, 0, false);
        declareFunction("el_list_lengthE", "EL-LIST-LENGTH=", 2, 0, false);
        declareFunction("removal_el_list_lengthE", "REMOVAL-EL-LIST-LENGTH=", 2, 0, false);
        declareFunction("removal_length_of_the_list_prune", "REMOVAL-LENGTH-OF-THE-LIST-PRUNE", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_extent_cardinality_file_alt() {
        deflexical("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*LENGTH-OF-LIST-DEFINING-MT*", NIL != boundp($length_of_list_defining_mt$) ? ((SubLObject) ($length_of_list_defining_mt$.getGlobalValue())) : $$BaseKB);
        return NIL;
    }

    public static SubLObject init_removal_modules_extent_cardinality_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
            deflexical("*LENGTH-OF-LIST-DEFINING-MT*", SubLTrampolineFile.maybeDefault($length_of_list_defining_mt$, $length_of_list_defining_mt$, $$BaseKB));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*LENGTH-OF-LIST-DEFINING-MT*", NIL != boundp($length_of_list_defining_mt$) ? ((SubLObject) ($length_of_list_defining_mt$.getGlobalValue())) : $$BaseKB);
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_extent_cardinality_file_Previous() {
        deflexical("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*LENGTH-OF-LIST-DEFINING-MT*", SubLTrampolineFile.maybeDefault($length_of_list_defining_mt$, $length_of_list_defining_mt$, $$BaseKB));
        return NIL;
    }

    static private final SubLList $list_alt29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("EL-LIST-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("lengthOfList"), list($BIND, makeSymbol("LIST")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("LIST"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("EL-LIST-LENGTH"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("VALUE"), makeSymbol("LIST")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$lengthOfList (#$TheList . <fully-bound>) <not-fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) ?COUNT)\n    (#$lengthOfList (#$TheList) ?COUNT)\n    (#$lengthOfList #$TheEmptyList ?COUNT)") });

    public static final SubLObject setup_removal_modules_extent_cardinality_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$extentCardinality);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS, $list_alt7);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG, $list_alt9);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THESET, $list_alt11);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THESETOF, $list_alt13);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF, $list_alt15);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION, $list_alt17);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM, $list_alt19);
        declare_defglobal($length_of_list_defining_mt$);
        mt_vars.note_mt_var($length_of_list_defining_mt$, $$lengthOfList);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_POS, $list_alt25);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_NEG, $list_alt27);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_GENERATE, $list_alt29);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_DELAY, $list_alt31);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_PRUNE, $list_alt33);
        return NIL;
    }

    public static SubLObject setup_removal_modules_extent_cardinality_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$extentCardinality);
            preference_modules.doomed_unless_arg_bindable($POS, $$extentCardinality, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$extentCardinality);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE, $list7);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS, $list10);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG, $list12);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THESET, $list14);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THESETOF, $list16);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF, $list18);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION, $list20);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM, $list22);
            declare_defglobal($length_of_list_defining_mt$);
            mt_vars.note_mt_var($length_of_list_defining_mt$, $$lengthOfList);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_POS, $list28);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_NEG, $list30);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_GENERATE, $list32);
            preference_modules.doomed_unless_arg_bindable($POS, $$lengthOfList, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$lengthOfList);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_PRUNE, $list34);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE, $list_alt5);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS, $list_alt7);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG, $list_alt9);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THESET, $list_alt11);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THESETOF, $list_alt13);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF, $list_alt15);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION, $list_alt17);
            inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM, $list_alt19);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_POS, $list_alt25);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_NEG, $list_alt27);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_GENERATE, $list_alt29);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_DELAY, $list_alt31);
            inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_PRUNE, $list_alt33);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_extent_cardinality_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$extentCardinality);
        preference_modules.doomed_unless_arg_bindable($POS, $$extentCardinality, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$extentCardinality);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE, $list7);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG, $list12);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THESET, $list14);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THESETOF, $list16);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF, $list18);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION, $list20);
        inference_modules.inference_removal_module($REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM, $list22);
        declare_defglobal($length_of_list_defining_mt$);
        mt_vars.note_mt_var($length_of_list_defining_mt$, $$lengthOfList);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_POS, $list28);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_NEG, $list30);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_GENERATE, $list32);
        preference_modules.doomed_unless_arg_bindable($POS, $$lengthOfList, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$lengthOfList);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_PRUNE, $list34);
        return NIL;
    }

    private static final SubLSymbol $REMOVAL_LENGTH_OF_THELIST_DELAY = makeKeyword("REMOVAL-LENGTH-OF-THELIST-DELAY");

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("OR"), list(makeKeyword("NOT"), cons(reader_make_constant_shell("TheList"), makeKeyword("ANYTHING"))), list($TEST, makeSymbol("DOTTED-LIST-P")))), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("delay module that ensures\n    (#$lengthOfList <not fully-bound> <whatever>) \n    where arg1 is neither (#$TheList ...) nor #$TheEmptyList\n    is not worked on"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList ?X 2)") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_extent_cardinality_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_extent_cardinality_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_extent_cardinality_file();
    }

    static {
    }

    static private final SubLList $list_alt33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("lengthOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("lengthOfList"), list(makeKeyword("AND"), cons(reader_make_constant_shell("TheList"), makeKeyword("NOT-FULLY-BOUND")), list($TEST, makeSymbol("PROPER-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-LENGTH-OF-THE-LIST-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("pruning module that handles\n    (#$lengthOfList (#$TheList . <not fully-bound>) <fully-bound>) \n    where the length in ARG2 does not match the list in ARG1"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$isa ?X) 1)") });
}

/**
 * Total time: 174 ms
 */
