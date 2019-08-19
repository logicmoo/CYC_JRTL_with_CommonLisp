package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_extent_cardinality extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_extent_cardinality";
    public static String myFingerPrint = "32c5bc8bac82b488fb9c91d7ce418c392195ed24ef56c3e082388ebd7f69e93a";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 1300L)
    private static SubLSymbol $default_removal_extent_cardinality_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 9800L)
    public static SubLSymbol $length_of_list_defining_mt$;
    private static SubLObject $$extentCardinality;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $HL;
    private static SubLObject $$TheCollectionOf;
    private static SubLObject $$TheEmptySet;
    private static SubLSymbol $REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE;
    private static SubLList $list7;
    private static SubLSymbol $UNEVALUATABLE;
    private static SubLSymbol $REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG;
    private static SubLList $list12;
    private static SubLSymbol $REMOVAL_EXTENT_CARDINALITY_THESET;
    private static SubLList $list14;
    private static SubLSymbol $REMOVAL_EXTENT_CARDINALITY_THESETOF;
    private static SubLList $list16;
    private static SubLSymbol $REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF;
    private static SubLList $list18;
    private static SubLSymbol $REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION;
    private static SubLList $list20;
    private static SubLSymbol $REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM;
    private static SubLList $list22;
    private static SubLSymbol $sym23$_LENGTH_OF_LIST_DEFINING_MT_;
    private static SubLObject $$BaseKB;
    private static SubLObject $$lengthOfList;
    private static SubLSymbol $sym26$INTEGERP;
    private static SubLSymbol $REMOVAL_LENGTH_OF_THELIST_CHECK_POS;
    private static SubLList $list28;
    private static SubLSymbol $REMOVAL_LENGTH_OF_THELIST_CHECK_NEG;
    private static SubLList $list30;
    private static SubLSymbol $REMOVAL_LENGTH_OF_THELIST_GENERATE;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_LENGTH_OF_THELIST_PRUNE;
    private static SubLList $list34;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 900L)
    public static SubLObject removal_extent_cardinality_set(SubLObject v_set) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject extent = quantities.set_extent(v_set, mt_relevance_macros.$mt$.getDynamicValue(thread), $HL);
        return Sequences.length(extent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 1000L)
    public static SubLObject removal_extent_cardinality_collection(SubLObject col) {
        if (NIL != el_utilities.possibly_nat_p(col) && $$TheCollectionOf.eql(cycl_utilities.nat_functor(col))) {
            return Sequences.length(ask_utilities.the_set_of_elements(col, UNPROVIDED, UNPROVIDED));
        }
        return isa.count_all_instances(col, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 1400L)
    public static SubLObject removal_fort_extent_cardinality(SubLObject v_set) {
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 2500L)
    public static SubLObject fort_has_extent_cardinalityP(SubLObject v_set, SubLObject cardinality) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject catch_this = NIL;
        try {
            thread.throwStack.push($UNEVALUATABLE);
            if (NIL != forts.fort_p(v_set)) {
                SubLObject number = quantities.cycl_real_number_to_number(cardinality);
                if (NIL != subl_promotions.non_negative_integer_p(number)) {
                    if ($$TheEmptySet.eql(v_set)) {
                        result = Numbers.zerop(number);
                    } else if (NIL != fort_types_interface.collectionP(v_set)) {
                        result = isa.count_all_instances_E(v_set, number, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        } catch (Throwable ccatch_env_var) {
            catch_this = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 10100L)
    public static SubLObject el_list_lengthE(SubLObject el_list, SubLObject integer) {
        assert NIL != Types.integerp(integer) : integer;
        return Numbers.numE(el_utilities.el_list_length(el_list), integer);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 10500L)
    public static SubLObject removal_el_list_lengthE(SubLObject el_list, SubLObject integer) {
        return makeBoolean(NIL != el_utilities.el_list_p(el_list) && NIL != subl_promotions.non_negative_integer_p(integer) && NIL != el_list_lengthE(el_list, integer));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 14000L)
    public static SubLObject removal_length_of_the_list_prune(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject el_list = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject length = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return makeBoolean(NIL == removal_el_list_lengthE(el_list, length));
    }

    public static SubLObject declare_removal_modules_extent_cardinality_file() {
        declareFunction(myName, "removal_extent_cardinality_set", "REMOVAL-EXTENT-CARDINALITY-SET", 1, 0, false);
        declareFunction(myName, "removal_extent_cardinality_collection", "REMOVAL-EXTENT-CARDINALITY-COLLECTION", 1, 0, false);
        declareFunction(myName, "removal_fort_extent_cardinality", "REMOVAL-FORT-EXTENT-CARDINALITY", 1, 0, false);
        declareFunction(myName, "fort_has_extent_cardinalityP", "FORT-HAS-EXTENT-CARDINALITY?", 2, 0, false);
        declareFunction(myName, "el_list_lengthE", "EL-LIST-LENGTH=", 2, 0, false);
        declareFunction(myName, "removal_el_list_lengthE", "REMOVAL-EL-LIST-LENGTH=", 2, 0, false);
        declareFunction(myName, "removal_length_of_the_list_prune", "REMOVAL-LENGTH-OF-THE-LIST-PRUNE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_extent_cardinality_file() {
        $default_removal_extent_cardinality_cost$ = deflexical("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        $length_of_list_defining_mt$ = deflexical("*LENGTH-OF-LIST-DEFINING-MT*", maybeDefault($sym23$_LENGTH_OF_LIST_DEFINING_MT_, $length_of_list_defining_mt$, $$BaseKB));
        return NIL;
    }

    public static SubLObject setup_removal_modules_extent_cardinality_file() {
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
        subl_macro_promotions.declare_defglobal($sym23$_LENGTH_OF_LIST_DEFINING_MT_);
        mt_vars.note_mt_var($sym23$_LENGTH_OF_LIST_DEFINING_MT_, $$lengthOfList);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_POS, $list28);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_CHECK_NEG, $list30);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_GENERATE, $list32);
        preference_modules.doomed_unless_arg_bindable($POS, $$lengthOfList, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$lengthOfList);
        inference_modules.inference_removal_module($REMOVAL_LENGTH_OF_THELIST_PRUNE, $list34);
        return NIL;
    }

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
        me = new removal_modules_extent_cardinality();
        $default_removal_extent_cardinality_cost$ = null;
        $length_of_list_defining_mt$ = null;
        $$extentCardinality = makeConstSym(("extentCardinality"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $HL = makeKeyword("HL");
        $$TheCollectionOf = makeConstSym(("TheCollectionOf"));
        $$TheEmptySet = makeConstSym(("TheEmptySet"));
        $REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("extentCardinality")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("extentCardinality")), list(makeKeyword("BIND"), makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-FORT-EXTENT-CARDINALITY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("extentCardinality")), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$extentCardinality #$MonthOfYearType ?COUNT)") });
        $UNEVALUATABLE = makeKeyword("UNEVALUATABLE");
        $REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS");
        $list10 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("extentCardinality")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                        makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("extentCardinality")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("CARDINALITY"))),
                                list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))),
                        makeKeyword("OUTPUT-CHECK-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("CARDINALITY")), list(makeKeyword("CALL"), makeSymbol("FORT-HAS-EXTENT-CARDINALITY?"), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))),
                        makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$MonthOfYearType 12)") });
        $REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG = makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-NEG");
        $list12 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("extentCardinality")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                        makeSymbol("*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                                list(makeConstSym(("extentCardinality")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("CARDINALITY"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY")))),
                        makeKeyword("OUTPUT-CHECK-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("CARDINALITY")),
                                list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("FORT-HAS-EXTENT-CARDINALITY?"), list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("CARDINALITY"))))),
                        makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$extentCardinality <fort> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$extentCardinality #$MonthOfYearType 14))") });
        $REMOVAL_EXTENT_CARDINALITY_THESET = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THESET");
        $list14 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("extentCardinality")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("extentCardinality")), cons(makeConstSym(("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("extentCardinality")), list(makeKeyword("BIND"), makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-EXTENT-CARDINALITY-SET"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("extentCardinality")), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$extentCardinality (#$TheSet . <fully-bound>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality (#$TheSet #$Andorra #$France #$Portugal) ?COUNT)") });
        $REMOVAL_EXTENT_CARDINALITY_THESETOF = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THESETOF");
        $list16 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("extentCardinality")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("extentCardinality")), list(makeConstSym(("TheSetOf")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("extentCardinality")), list(makeKeyword("BIND"), makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-EXTENT-CARDINALITY-SET"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("extentCardinality")), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"),
                makeString("(#$extentCardinality (#$TheSetOf <variable> <closed except for variable>) <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$extentCardinality \n      (#$TheSetOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });
        $REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF = makeKeyword("REMOVAL-EXTENT-CARDINALITY-THECOLLECTIONOF");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("extentCardinality")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("extentCardinality")), list(makeKeyword("NAT"), list(makeConstSym(("TheCollectionOf")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"),
                list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("extentCardinality")), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-EXTENT-CARDINALITY-COLLECTION"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("extentCardinality")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("DOCUMENTATION"),
                makeString("(#$extentCardinality (#$TheCollectionOf <variable> <closed except for variable>) <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$extentCardinality \n      (#$TheCollectionOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)") });
        $REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION = makeKeyword("REMOVAL-EXTENT-CARDINALITY-CYCLASSERTION");
        $list20 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("extentCardinality")), makeConstSym(("CycLAssertion")), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"),
                list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-COUNT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("extentCardinality")), makeConstSym(("CycLAssertion")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality #$CycLAssertion <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$extentCardinality #$CycLAssertion ?COUNT)") });
        $REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM = makeKeyword("REMOVAL-EXTENT-CARDINALITY-CYCLREIFIEDDENOTATIONALTERM");
        $list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("extentCardinality")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("extentCardinality")), makeConstSym(("CycLReifiedDenotationalTerm")), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"),
                list(makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE"), makeKeyword("REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORT-COUNT"))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("extentCardinality")), makeConstSym(("CycLReifiedDenotationalTerm")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"),
                makeKeyword("DOCUMENTATION"), makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$extentCardinality #$CycLReifiedDenotationalTerm ?COUNT)") });
        $sym23$_LENGTH_OF_LIST_DEFINING_MT_ = makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*");
        $$BaseKB = makeConstSym(("BaseKB"));
        $$lengthOfList = makeConstSym(("lengthOfList"));
        $sym26$INTEGERP = makeSymbol("INTEGERP");
        $REMOVAL_LENGTH_OF_THELIST_CHECK_POS = makeKeyword("REMOVAL-LENGTH-OF-THELIST-CHECK-POS");
        $list28 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("lengthOfList")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("lengthOfList")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("lengthOfList")), list(makeKeyword("BIND"), makeSymbol("LIST")), list(makeKeyword("BIND"), makeSymbol("LENGTH"))), list(list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LIST"), makeSymbol("LENGTH")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-EL-LIST-LENGTH="), list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 3)\n    (#$lengthOfList (#$TheList) 0)\n    (#$lengthOfList #$TheEmptyList 0)") });
        $REMOVAL_LENGTH_OF_THELIST_CHECK_NEG = makeKeyword("REMOVAL-LENGTH-OF-THELIST-CHECK-NEG");
        $list30 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("lengthOfList")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("lengthOfList")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("lengthOfList")), list(makeKeyword("BIND"), makeSymbol("LIST")), list(makeKeyword("BIND"), makeSymbol("LENGTH"))), list(list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("LIST"), makeSymbol("LENGTH")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-EL-LIST-LENGTH="), list(makeKeyword("VALUE"), makeSymbol("LIST")), list(makeKeyword("VALUE"), makeSymbol("LENGTH"))))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>)) or\n    (#$not (#$lengthOfList #$TheEmptyList <fully-bound>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 1))\n    (#$not (#$lengthOfList (#$TheList) 1))\n    (#$not (#$lengthOfList #$TheEmptyList 1))") });
        $REMOVAL_LENGTH_OF_THELIST_GENERATE = makeKeyword("REMOVAL-LENGTH-OF-THELIST-GENERATE");
        $list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("lengthOfList")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("lengthOfList")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-LIST-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("lengthOfList")), list(makeKeyword("BIND"), makeSymbol("LIST")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("LIST"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("EL-LIST-LENGTH"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("lengthOfList")), list(makeKeyword("VALUE"), makeSymbol("LIST")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*LENGTH-OF-LIST-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$lengthOfList (#$TheList . <fully-bound>) <not-fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) ?COUNT)\n    (#$lengthOfList (#$TheList) ?COUNT)\n    (#$lengthOfList #$TheEmptyList ?COUNT)") });
        $REMOVAL_LENGTH_OF_THELIST_PRUNE = makeKeyword("REMOVAL-LENGTH-OF-THELIST-PRUNE");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("lengthOfList")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("lengthOfList")), list(makeKeyword("AND"), cons(makeConstSym(("TheList")), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("TEST"), makeSymbol("PROPER-LIST-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-LENGTH-OF-THE-LIST-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"),
                makeString("pruning module that handles\n    (#$lengthOfList (#$TheList . <not fully-bound>) <fully-bound>) \n    where the length in ARG2 does not match the list in ARG1"), makeKeyword("EXAMPLE"), makeString("(#$lengthOfList (#$TheList #$isa ?X) 1)") });
    }
}
/*
 *
 * Total time: 174 ms
 *
 */